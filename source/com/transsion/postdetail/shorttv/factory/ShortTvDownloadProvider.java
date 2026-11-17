package com.transsion.postdetail.shorttv.factory;

import android.R;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.AbstractC5795n;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baseui.R$string;
import com.transsion.shorttv.bean.Cover;
import com.transsion.shorttv.bean.DownloadItem;
import com.transsion.shorttv.bean.DownloadListBean;
import com.transsion.shorttv.bean.Media;
import com.transsion.shorttv.bean.ShortTVItem;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.bean.SubjectType;
import com.transsion.shorttv.bean.Video;
import com.transsnet.downloader.manager.C21851p;
import com.transsnet.downloader.manager.DownloadEsHelper;
import com.transsnet.downloader.manager.InterfaceC21842g;
import com.transsnet.downloader.view.DownloadingTipsDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Settings;
import p648oj.AbstractC26235a;
import p648oj.InterfaceC26269m0;
import p648oj.InterfaceC26281s0;
import p848vs.InterfaceC28213d;
import p848vs.InterfaceC28222m;
import p848vs.InterfaceC28223n;
import p944yh.C28951b;
import p955ys.C29006a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvDownloadProvider implements InterfaceC28213d {

    /* JADX INFO: renamed from: b */
    private InterfaceC28222m f56771b;

    /* JADX INFO: renamed from: c */
    private InterfaceC28223n f56772c;

    /* JADX INFO: renamed from: f */
    private DownloadBean f56775f;

    /* JADX INFO: renamed from: a */
    private final Lazy f56770a = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.shorttv.factory.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTvDownloadProvider.m73630r();
        }
    });

    /* JADX INFO: renamed from: d */
    private final InterfaceC26269m0 f56773d = new C16884a();

    /* JADX INFO: renamed from: e */
    private final InterfaceC26281s0 f56774e = new C16885b();

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv.factory.ShortTvDownloadProvider$a */
    public static final class C16884a extends AbstractC26235a {
        C16884a() {
        }

        @Override // p648oj.AbstractC26235a, p648oj.InterfaceC26269m0
        /* JADX INFO: renamed from: e */
        public void mo24050e(DownloadBean bean, String str) {
            Intrinsics.m97802h(bean, "bean");
            InterfaceC28222m interfaceC28222m = ShortTvDownloadProvider.this.f56771b;
            if (interfaceC28222m != null) {
                interfaceC28222m.mo79909a(bean.getSubjectId(), bean.getEp());
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv.factory.ShortTvDownloadProvider$b */
    public static final class C16885b implements InterfaceC26281s0 {
        C16885b() {
        }

        /* JADX INFO: renamed from: d */
        private final C29006a m73647d(DownloadBean downloadBean) {
            return new C29006a(downloadBean.getSubjectId(), downloadBean.getSubjectId() + "_" + downloadBean.getEp() + "short", downloadBean.getName(), downloadBean.getTitleName(), downloadBean.getResourceId(), downloadBean.getEp(), downloadBean.getSe(), downloadBean.getOps());
        }

        @Override // p648oj.InterfaceC26281s0
        /* JADX INFO: renamed from: a */
        public void mo73648a(String subtitleResId) {
            Intrinsics.m97802h(subtitleResId, "subtitleResId");
            InterfaceC28223n interfaceC28223n = ShortTvDownloadProvider.this.f56772c;
            if (interfaceC28223n != null) {
                interfaceC28223n.mo79502a(subtitleResId);
            }
        }

        @Override // p648oj.InterfaceC26281s0
        /* JADX INFO: renamed from: b */
        public void mo73649b(DownloadBean bean) {
            String resourceId;
            InterfaceC28223n interfaceC28223n;
            Intrinsics.m97802h(bean, "bean");
            if (!bean.isShotTV() || !bean.isVideo() || bean.isMusic() || (resourceId = bean.getResourceId()) == null || resourceId.length() == 0 || (interfaceC28223n = ShortTvDownloadProvider.this.f56772c) == null) {
                return;
            }
            interfaceC28223n.mo79503b(m73647d(bean));
        }

        @Override // p648oj.InterfaceC26281s0
        /* JADX INFO: renamed from: c */
        public void mo73650c(DownloadBean bean, boolean z11) {
            String resourceId;
            InterfaceC28223n interfaceC28223n;
            Intrinsics.m97802h(bean, "bean");
            if (!bean.isShotTV() || (resourceId = bean.getResourceId()) == null || resourceId.length() == 0 || (interfaceC28223n = ShortTvDownloadProvider.this.f56772c) == null) {
                return;
            }
            interfaceC28223n.mo79504c(m73647d(bean), z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m73629q(DownloadItem downloadItem, int i11, FragmentActivity fragmentActivity) {
        DownloadBean downloadBeanM88589q;
        String resourceId = downloadItem.getResourceId();
        if (resourceId == null) {
            resourceId = downloadItem.getUrl();
        }
        if (resourceId == null || (downloadBeanM88589q = DownloadEsHelper.f67591m.m88598a().m88589q(resourceId)) == null) {
            return;
        }
        DownloadingTipsDialogFragment downloadingTipsDialogFragmentM89498a = DownloadingTipsDialogFragment.INSTANCE.m89498a(i11);
        downloadingTipsDialogFragmentM89498a.m89497O0(downloadBeanM88589q);
        downloadingTipsDialogFragmentM89498a.m65436k0(fragmentActivity, "DownloadingTipsDialogFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final InterfaceC21842g m73630r() {
        return C21851p.f67672a.m88759a(Utils.m27275a());
    }

    /* JADX INFO: renamed from: s */
    private final InterfaceC21842g m73631s() {
        return (InterfaceC21842g) this.f56770a.getValue();
    }

    /* JADX INFO: renamed from: t */
    private final ShortTVItem m73632t(DownloadBean downloadBean) {
        Integer numValueOf = Integer.valueOf(downloadBean.getVideoHeight());
        Long size = downloadBean.getSize();
        return new ShortTVItem(downloadBean.getResourceId(), downloadBean.getSubjectId(), downloadBean.getSe(), downloadBean.getEp(), null, new Media(null, null, null, null, null, null, new Video(null, null, null, null, numValueOf, size != null ? Integer.valueOf((int) size.longValue()) : null, downloadBean.getPath(), Integer.valueOf(downloadBean.getVideoWidth()), null), null), null, null, downloadBean.getReadProgress(), downloadBean.getStatus(), 0, 1232, null);
    }

    /* JADX INFO: renamed from: u */
    private final Subject m73633u(DownloadBean downloadBean) {
        Cover cover = new Cover(null, null, null, downloadBean.getCover(), null, downloadBean.getThumbnail(), null, null, null, 471, null);
        String subjectId = downloadBean.getSubjectId();
        String subjectName = downloadBean.getSubjectName();
        int subjectType = downloadBean.getSubjectType();
        return new Subject(subjectId, Integer.valueOf(subjectType), subjectName, null, cover, null, null, null, null, null, null, null, null, null, null, null, null, null, null, downloadBean.getOps(), null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, downloadBean.getTotalEpisode(), false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, false, null, null, 0, 0, null, 0, null, 0, null, -524312, 1073741815, null);
    }

    /* JADX INFO: renamed from: v */
    private final DownloadBean m73634v(DownloadListBean downloadListBean, Subject subject, String str, String str2, String str3, DownloadItem downloadItem) {
        String genre;
        String thumbnail;
        Cover cover;
        String releaseDate;
        String countryName;
        String title;
        List<DownloadItem> items;
        Integer totalEpisode;
        Cover cover2;
        Cover cover3;
        Cover cover4;
        String url;
        String url2 = downloadItem.getUrl();
        String str4 = url2 == null ? "" : url2;
        String resourceId = downloadItem.getResourceId();
        String str5 = resourceId == null ? "" : resourceId;
        String name = downloadItem.getName();
        DownloadBean downloadBean = new DownloadBean(str4, str5, name == null ? "" : name, (downloadListBean == null || (cover4 = downloadListBean.getCover()) == null || (url = cover4.getUrl()) == null) ? "" : url, downloadItem.getSize(), null, null, null, null, null, 0L, 0, 0, 0, 0L, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, 0L, 0, 0, null, null, 0L, null, null, 0L, 0, 0L, null, 0, null, null, false, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -32, -1, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
        Integer numValueOf = null;
        if (subject == null || (genre = subject.getGenre()) == null) {
            genre = downloadListBean != null ? downloadListBean.getGenre() : null;
        }
        downloadBean.setGenre(genre);
        downloadBean.setCreateAt(System.currentTimeMillis());
        if (subject == null || (cover3 = subject.getCover()) == null || (thumbnail = cover3.getThumbnail()) == null) {
            thumbnail = (downloadListBean == null || (cover = downloadListBean.getCover()) == null) ? null : cover.getThumbnail();
            if (thumbnail == null) {
                thumbnail = "";
            }
        }
        downloadBean.setThumbnail(thumbnail);
        if (subject == null || (releaseDate = subject.getGenre()) == null) {
            releaseDate = downloadListBean != null ? downloadListBean.getReleaseDate() : null;
        }
        downloadBean.setReleaseDate(releaseDate);
        if (subject == null || (countryName = subject.getCountryName()) == null) {
            countryName = downloadListBean != null ? downloadListBean.getCountryName() : null;
        }
        downloadBean.setCountryName(countryName);
        downloadBean.setRestrictLevel(subject != null ? subject.getRestrictLevel() : null);
        downloadBean.setImdbRate(subject != null ? subject.getImdbRate() : null);
        downloadBean.setSeNum(subject != null ? subject.getSeNum() : null);
        downloadBean.setSubtitles(subject != null ? subject.getSubtitles() : null);
        downloadBean.setDuration(downloadItem.getDuration());
        downloadBean.setAverageHueLight((downloadListBean == null || (cover2 = downloadListBean.getCover()) == null) ? null : cover2.getAverageHueLight());
        String uploadBy = downloadItem.getUploadBy();
        if (uploadBy == null) {
            uploadBy = "";
        }
        downloadBean.setUploadBy(uploadBy);
        downloadBean.setPostId(downloadItem.getPostId());
        Integer epse = downloadItem.getEpse();
        downloadBean.setEpse(epse != null ? epse.intValue() : 0);
        downloadBean.setEp(downloadItem.getEp());
        downloadBean.setSe(downloadItem.getSe());
        Integer resolution = downloadItem.getResolution();
        downloadBean.setResolution(resolution != null ? resolution.intValue() : 0);
        downloadBean.setSubjectId(downloadListBean != null ? downloadListBean.getSubjectId() : null);
        if (downloadListBean == null || (title = downloadListBean.getTitle()) == null) {
            title = subject != null ? subject.getTitle() : null;
        }
        downloadBean.setSubjectName(title);
        downloadBean.setPageFrom(str2);
        downloadBean.setLastPageFrom(str3);
        downloadBean.setOps(str);
        String sourceUrl = downloadItem.getSourceUrl();
        if (sourceUrl == null) {
            sourceUrl = "";
        }
        downloadBean.setSourceUrl(sourceUrl);
        downloadBean.setTaskId(downloadItem.getTaskId());
        downloadBean.setRequireMemberType(downloadItem.getRequireMemberType());
        downloadBean.setType(DownloadBean.INSTANCE.m64886c(downloadListBean != null ? Integer.valueOf(downloadListBean.getSubjectType()) : null));
        downloadBean.setSubjectType(downloadListBean != null ? downloadListBean.getSubjectType() : SubjectType.SHORT_TV.getValue());
        downloadBean.setSubjectDurationSeconds(downloadListBean != null ? downloadListBean.getDurationSeconds() : null);
        downloadBean.setTotalEpisode((downloadListBean == null || (totalEpisode = downloadListBean.getTotalEpisode()) == null) ? 1 : totalEpisode.intValue());
        if (downloadListBean != null && (items = downloadListBean.getItems()) != null) {
            numValueOf = Integer.valueOf(items.size());
        }
        Intrinsics.m97799e(numValueOf);
        if (numValueOf.intValue() > downloadBean.getTotalEpisode()) {
            downloadBean.setMultiresolution(1);
        }
        return downloadBean;
    }

    @Override // p848vs.InterfaceC28213d
    /* JADX INFO: renamed from: a */
    public Object mo73635a(String str, int i11, String str2, Continuation continuation) {
        return m73631s().mo88672a(str, i11, str2, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p848vs.InterfaceC28213d
    /* JADX INFO: renamed from: b */
    public Object mo73636b(String str, Continuation continuation) throws Throwable {
        ShortTvDownloadProvider$fetchDownloadList$1 shortTvDownloadProvider$fetchDownloadList$1;
        if (continuation instanceof ShortTvDownloadProvider$fetchDownloadList$1) {
            shortTvDownloadProvider$fetchDownloadList$1 = (ShortTvDownloadProvider$fetchDownloadList$1) continuation;
            int i11 = shortTvDownloadProvider$fetchDownloadList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                shortTvDownloadProvider$fetchDownloadList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                shortTvDownloadProvider$fetchDownloadList$1 = new ShortTvDownloadProvider$fetchDownloadList$1(this, continuation);
            }
        } else {
            shortTvDownloadProvider$fetchDownloadList$1 = new ShortTvDownloadProvider$fetchDownloadList$1(this, continuation);
        }
        Object objM88593v = shortTvDownloadProvider$fetchDownloadList$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = shortTvDownloadProvider$fetchDownloadList$1.label;
        if (i12 == 0) {
            ResultKt.m97107b(objM88593v);
            DownloadEsHelper downloadEsHelperM88598a = DownloadEsHelper.f67591m.m88598a();
            shortTvDownloadProvider$fetchDownloadList$1.label = 1;
            objM88593v = downloadEsHelperM88598a.m88593v(str, shortTvDownloadProvider$fetchDownloadList$1);
            if (objM88593v == objF) {
                return objF;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(objM88593v);
        }
        Iterable iterable = (Iterable) objM88593v;
        ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m73632t((DownloadBean) it.next()));
        }
        return arrayList;
    }

    @Override // p848vs.InterfaceC28213d
    /* JADX INFO: renamed from: c */
    public void mo73637c() {
        m73631s().mo88686q(this.f56773d);
        this.f56771b = null;
    }

    @Override // p848vs.InterfaceC28213d
    /* JADX INFO: renamed from: d */
    public Object mo73638d(String str, int i11, long j11, Continuation continuation) throws Throwable {
        Object objM88575d0 = DownloadEsHelper.f67591m.m88598a().m88575d0(str, i11, j11, continuation);
        return objM88575d0 == IntrinsicsKt.m97630f() ? objM88575d0 : Unit.f75682a;
    }

    @Override // p848vs.InterfaceC28213d
    /* JADX INFO: renamed from: e */
    public boolean mo73639e(long j11) {
        DownloadEsHelper.C21823a c21823a = DownloadEsHelper.f67591m;
        c21823a.m88598a().m88582i();
        String strM88591t = c21823a.m88598a().m88591t();
        if (strM88591t.length() == 0) {
            return false;
        }
        try {
            long jM27432j = AbstractC5795n.m27432j(strM88591t);
            Long lMo88694y = m73631s().mo88694y();
            if (j11 + (lMo88694y != null ? lMo88694y.longValue() : 0L) >= jM27432j) {
                C28951b.f88586a.m111454d(R$string.insufficient_storage_available);
                C26866a.f81698a.m104917o("--- 可用存储空间不足，释放空间并重试 ---", true);
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // p848vs.InterfaceC28213d
    /* JADX INFO: renamed from: f */
    public DownloadItem mo73640f(String str) {
        DownloadItem downloadItem = null;
        if (str != null && str.length() != 0) {
            DownloadBean downloadBeanM88589q = DownloadEsHelper.f67591m.m88598a().m88589q(str);
            if (downloadBeanM88589q == null) {
                return null;
            }
            String resourceId = downloadBeanM88589q.getResourceId();
            if (resourceId == null) {
                resourceId = downloadBeanM88589q.getUrl();
            }
            String str2 = resourceId;
            String totalTitleName = downloadBeanM88589q.getTotalTitleName();
            String url = downloadBeanM88589q.getUrl();
            Long size = downloadBeanM88589q.getSize();
            downloadItem = new DownloadItem(str2, totalTitleName, url, 1, Long.valueOf(size != null ? size.longValue() : 0L), downloadBeanM88589q.getUploadBy(), downloadBeanM88589q.getPostId(), Integer.valueOf(downloadBeanM88589q.getEpse()), downloadBeanM88589q.getSe(), downloadBeanM88589q.getEp(), downloadBeanM88589q.getStatus(), downloadBeanM88589q.getSourceUrl(), Integer.valueOf(downloadBeanM88589q.getResolution()), null, null);
            String taskId = downloadBeanM88589q.getTaskId();
            if (taskId == null) {
                taskId = "";
            }
            downloadItem.setTaskId(taskId);
        }
        return downloadItem;
    }

    @Override // p848vs.InterfaceC28213d
    /* JADX INFO: renamed from: g */
    public void mo73641g(DownloadListBean downloadListBean, Subject subject, String str, String str2, String str3, List list) {
        Intrinsics.m97802h(list, "list");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DownloadBean downloadBeanM73634v = m73634v(downloadListBean, subject, str, str2, str3, (DownloadItem) it.next());
            if (this.f56775f != null) {
                this.f56775f = downloadBeanM73634v;
            }
            arrayList.add(downloadBeanM73634v);
        }
        m73631s().mo88668E(arrayList);
    }

    @Override // p848vs.InterfaceC28213d
    /* JADX INFO: renamed from: h */
    public void mo73642h(final FragmentActivity activity, final DownloadItem item, final int i11, String formatSize) {
        Intrinsics.m97802h(activity, "activity");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(formatSize, "formatSize");
        ((FrameLayout) activity.findViewById(R.id.content)).postDelayed(new Runnable() { // from class: com.transsion.postdetail.shorttv.factory.d
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvDownloadProvider.m73629q(item, i11, activity);
            }
        }, 300L);
    }

    @Override // p848vs.InterfaceC28213d
    /* JADX INFO: renamed from: i */
    public void mo73643i(InterfaceC28223n listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f56772c = listener;
        m73631s().mo88690u(this.f56774e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p848vs.InterfaceC28213d
    /* JADX INFO: renamed from: j */
    public Object mo73644j(String str, Continuation continuation) throws Throwable {
        ShortTvDownloadProvider$getDownloadSubject$1 shortTvDownloadProvider$getDownloadSubject$1;
        if (continuation instanceof ShortTvDownloadProvider$getDownloadSubject$1) {
            shortTvDownloadProvider$getDownloadSubject$1 = (ShortTvDownloadProvider$getDownloadSubject$1) continuation;
            int i11 = shortTvDownloadProvider$getDownloadSubject$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                shortTvDownloadProvider$getDownloadSubject$1.label = i11 - Integer.MIN_VALUE;
            } else {
                shortTvDownloadProvider$getDownloadSubject$1 = new ShortTvDownloadProvider$getDownloadSubject$1(this, continuation);
            }
        } else {
            shortTvDownloadProvider$getDownloadSubject$1 = new ShortTvDownloadProvider$getDownloadSubject$1(this, continuation);
        }
        Object objM88593v = shortTvDownloadProvider$getDownloadSubject$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = shortTvDownloadProvider$getDownloadSubject$1.label;
        if (i12 == 0) {
            ResultKt.m97107b(objM88593v);
            DownloadEsHelper downloadEsHelperM88598a = DownloadEsHelper.f67591m.m88598a();
            shortTvDownloadProvider$getDownloadSubject$1.label = 1;
            objM88593v = downloadEsHelperM88598a.m88593v(str, shortTvDownloadProvider$getDownloadSubject$1);
            if (objM88593v == objF) {
                return objF;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(objM88593v);
        }
        DownloadBean downloadBean = (DownloadBean) CollectionsKt.m97361k0((List) objM88593v);
        if (downloadBean != null) {
            return m73633u(downloadBean);
        }
        return null;
    }

    @Override // p848vs.InterfaceC28213d
    /* JADX INFO: renamed from: k */
    public void mo73645k(FragmentActivity fragmentActivity, String str, int i11) {
        InterfaceC28213d.a.m109401a(this, fragmentActivity, str, i11);
    }

    @Override // p848vs.InterfaceC28213d
    /* JADX INFO: renamed from: l */
    public void mo73646l(InterfaceC28222m listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f56771b = listener;
        m73631s().mo88675g(this.f56773d);
    }
}
