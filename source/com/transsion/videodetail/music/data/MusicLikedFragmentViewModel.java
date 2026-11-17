package com.transsion.videodetail.music.data;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.blankj.utilcode.util.Utils;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.music.MusicLikedDbBean;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.videodetail.music.bean.LikeListActionEnum;
import com.transsion.videodetail.music.bean.MusicLikedRemoteBean;
import com.transsion.videodetail.music.bean.MusicLikedRemoteItemBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import mx.C25917a;
import p349dh.C22982c;
import p648oj.InterfaceC26241c;
import p745rj.InterfaceC27291a;

/* JADX INFO: loaded from: classes7.dex */
public final class MusicLikedFragmentViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: a */
    private String f65797a = "0";

    /* JADX INFO: renamed from: b */
    private final List f65798b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final Lazy f65799c = LazyKt.m97097b(new Function0() { // from class: com.transsion.videodetail.music.data.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MusicLikedFragmentViewModel.m86209K();
        }
    });

    /* JADX INFO: renamed from: d */
    private final Lazy f65800d = LazyKt.m97097b(new Function0() { // from class: com.transsion.videodetail.music.data.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MusicLikedFragmentViewModel.m86226s();
        }
    });

    /* JADX INFO: renamed from: e */
    private final Lazy f65801e = LazyKt.m97097b(new Function0() { // from class: com.transsion.videodetail.music.data.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MusicLikedFragmentViewModel.m86208J();
        }
    });

    /* JADX INFO: renamed from: f */
    private final C3187b0 f65802f = new C3187b0();

    /* JADX INFO: renamed from: g */
    private final C3187b0 f65803g = new C3187b0();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final InterfaceC27291a m86204A() {
        return (InterfaceC27291a) this.f65799c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final Object m86205D(MusicLikedRemoteItemBean musicLikedRemoteItemBean, Continuation continuation) {
        Object objMo106362f;
        return (musicLikedRemoteItemBean == null || (objMo106362f = m86204A().mo106362f(m86224q(musicLikedRemoteItemBean), continuation)) != IntrinsicsKt.m97630f()) ? Unit.f75682a : objMo106362f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0090  */
    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0090 -> B:26:0x0093). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: H */
    public final java.lang.Object m86206H(kotlin.coroutines.Continuation r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.transsion.videodetail.music.data.MusicLikedFragmentViewModel$loadLocalData$1
            if (r0 == 0) goto L13
            r0 = r13
            com.transsion.videodetail.music.data.MusicLikedFragmentViewModel$loadLocalData$1 r0 = (com.transsion.videodetail.music.data.MusicLikedFragmentViewModel$loadLocalData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.transsion.videodetail.music.data.MusicLikedFragmentViewModel$loadLocalData$1 r0 = new com.transsion.videodetail.music.data.MusicLikedFragmentViewModel$loadLocalData$1
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.m97630f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r2 = r0.L$3
            com.transsion.baselib.db.music.MusicLikedDbBean r2 = (com.transsion.baselib.p291db.music.MusicLikedDbBean) r2
            java.lang.Object r4 = r0.L$2
            com.transsion.baselib.db.music.MusicLikedDbBean r4 = (com.transsion.baselib.p291db.music.MusicLikedDbBean) r4
            java.lang.Object r5 = r0.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.L$0
            java.util.List r6 = (java.util.List) r6
            kotlin.ResultKt.m97107b(r13)
            r10 = r5
            r11 = r6
            r5 = r4
            goto L93
        L3f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L47:
            kotlin.ResultKt.m97107b(r13)
            goto L5b
        L4b:
            kotlin.ResultKt.m97107b(r13)
            rj.a r13 = r12.m86204A()
            r0.label = r4
            java.lang.Object r13 = r13.mo106359c(r0)
            if (r13 != r1) goto L5b
            return r1
        L5b:
            java.util.List r13 = (java.util.List) r13
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
            r5 = r13
            r6 = r2
        L6a:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto Lb0
            java.lang.Object r13 = r5.next()
            r2 = r13
            com.transsion.baselib.db.music.MusicLikedDbBean r2 = (com.transsion.baselib.p291db.music.MusicLikedDbBean) r2
            oj.c r13 = r12.m86228u()
            java.lang.String r4 = r2.getSubjectId()
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r3
            java.lang.Object r13 = r13.mo102726E(r4, r0)
            if (r13 != r1) goto L90
            return r1
        L90:
            r10 = r5
            r11 = r6
            r5 = r2
        L93:
            com.transsion.baselib.db.download.DownloadBean r13 = (com.transsion.baselib.p291db.download.DownloadBean) r13
            if (r13 == 0) goto L9c
            java.lang.String r13 = r13.getPath()
            goto L9d
        L9c:
            r13 = 0
        L9d:
            r2.setPath(r13)
            com.transsion.videodetail.music.bean.MusicLikedMultiItemEntity r13 = new com.transsion.videodetail.music.bean.MusicLikedMultiItemEntity
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r11.add(r13)
            r5 = r10
            r6 = r11
            goto L6a
        Lb0:
            androidx.lifecycle.b0 r13 = r12.f65803g
            r13.mo14855n(r6)
            kotlin.Unit r13 = kotlin.Unit.f75682a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.videodetail.music.data.MusicLikedFragmentViewModel.m86206H(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:60:0x0147 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x017f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x017f, please report this as an issue */
    /* JADX INFO: renamed from: I */
    public final Object m86207I(Continuation continuation) throws Throwable {
        MusicLikedFragmentViewModel$loadNetData$1 musicLikedFragmentViewModel$loadNetData$1;
        Object objM112707constructorimpl;
        Throwable thM112710exceptionOrNullimpl;
        List arrayList;
        Pager pager;
        Pager pager2;
        List<MusicLikedRemoteItemBean> items;
        if (continuation instanceof MusicLikedFragmentViewModel$loadNetData$1) {
            musicLikedFragmentViewModel$loadNetData$1 = (MusicLikedFragmentViewModel$loadNetData$1) continuation;
            int i11 = musicLikedFragmentViewModel$loadNetData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                musicLikedFragmentViewModel$loadNetData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                musicLikedFragmentViewModel$loadNetData$1 = new MusicLikedFragmentViewModel$loadNetData$1(this, continuation);
            }
        } else {
            musicLikedFragmentViewModel$loadNetData$1 = new MusicLikedFragmentViewModel$loadNetData$1(this, continuation);
        }
        Object objM86242a = musicLikedFragmentViewModel$loadNetData$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = musicLikedFragmentViewModel$loadNetData$1.label;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            arrayList = (List) musicLikedFragmentViewModel$loadNetData$1.L$0;
                            ResultKt.m97107b(objM86242a);
                            C25917a.f79141a.m101735a(m86227t() + " --> loadNetData() --> 数据库写入成功 --> size = " + arrayList.size());
                            musicLikedFragmentViewModel$loadNetData$1.L$0 = null;
                            musicLikedFragmentViewModel$loadNetData$1.label = 4;
                            if (m86206H(musicLikedFragmentViewModel$loadNetData$1) == objF) {
                                return objF;
                            }
                        } else if (i12 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    ResultKt.m97107b(objM86242a);
                } else {
                    ResultKt.m97107b(objM86242a);
                }
                objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
                thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                if (thM112710exceptionOrNullimpl != null) {
                    C25917a.f79141a.m101736b(m86227t() + " --> loadNetData() --> 网络请求异常 --> " + thM112710exceptionOrNullimpl.getMessage());
                    this.f65803g.mo14855n(null);
                }
                return Unit.f75682a;
            }
            ResultKt.m97107b(objM86242a);
            Result.Companion companion = Result.INSTANCE;
            C25917a.f79141a.m101735a(m86227t() + " --> loadNetData() --> 获取服务端的数据 --> page = " + this.f65797a);
            InterfaceC20985a interfaceC20985aM86230z = m86230z();
            String str = this.f65797a;
            musicLikedFragmentViewModel$loadNetData$1.label = 1;
            objM86242a = InterfaceC20985a.a.m86242a(interfaceC20985aM86230z, str, 0, null, musicLikedFragmentViewModel$loadNetData$1, 6, null);
            if (objM86242a == objF) {
                return objF;
            }
            BaseDto baseDto = (BaseDto) objM86242a;
            MusicLikedRemoteBean musicLikedRemoteBean = (MusicLikedRemoteBean) baseDto.getData();
            if (musicLikedRemoteBean != null && (items = musicLikedRemoteBean.getItems()) != null) {
                Boxing.m97631a(this.f65798b.addAll(items));
            }
            MusicLikedRemoteBean musicLikedRemoteBean2 = (MusicLikedRemoteBean) baseDto.getData();
            if ((musicLikedRemoteBean2 == null || (pager2 = musicLikedRemoteBean2.getPager()) == null) ? false : Intrinsics.m97797c(pager2.getHasMore(), Boxing.m97631a(true))) {
                MusicLikedRemoteBean musicLikedRemoteBean3 = (MusicLikedRemoteBean) baseDto.getData();
                this.f65797a = String.valueOf((musicLikedRemoteBean3 == null || (pager = musicLikedRemoteBean3.getPager()) == null) ? null : pager.getNextPage());
                musicLikedFragmentViewModel$loadNetData$1.label = 2;
                if (m86207I(musicLikedFragmentViewModel$loadNetData$1) == objF) {
                    return objF;
                }
            } else {
                List list = this.f65798b;
                arrayList = new ArrayList(CollectionsKt.m97516v(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(m86224q((MusicLikedRemoteItemBean) it.next()));
                }
                if (arrayList.isEmpty()) {
                    C25917a.f79141a.m101737c(m86227t() + " --> loadNetData() --> 本地和服务端都没数据");
                    this.f65803g.mo14855n(null);
                } else {
                    InterfaceC27291a interfaceC27291aM86204A = m86204A();
                    musicLikedFragmentViewModel$loadNetData$1.L$0 = arrayList;
                    musicLikedFragmentViewModel$loadNetData$1.label = 3;
                    if (interfaceC27291aM86204A.mo106358b(arrayList, musicLikedFragmentViewModel$loadNetData$1) == objF) {
                        return objF;
                    }
                    C25917a.f79141a.m101735a(m86227t() + " --> loadNetData() --> 数据库写入成功 --> size = " + arrayList.size());
                    musicLikedFragmentViewModel$loadNetData$1.L$0 = null;
                    musicLikedFragmentViewModel$loadNetData$1.label = 4;
                    if (m86206H(musicLikedFragmentViewModel$loadNetData$1) == objF) {
                        return objF;
                    }
                }
            }
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C25917a.f79141a.m101736b(m86227t() + " --> loadNetData() --> 网络请求异常 --> " + thM112710exceptionOrNullimpl.getMessage());
            this.f65803g.mo14855n(null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final InterfaceC20985a m86208J() {
        return (InterfaceC20985a) C22982c.f70163e.m91553a().m91552h(InterfaceC20985a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final InterfaceC27291a m86209K() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64872s1();
    }

    /* JADX INFO: renamed from: q */
    private final MusicLikedDbBean m86224q(MusicLikedRemoteItemBean musicLikedRemoteItemBean) {
        String subjectId = musicLikedRemoteItemBean.getSubjectId();
        if (subjectId == null) {
            subjectId = "";
        }
        String str = subjectId;
        String title = musicLikedRemoteItemBean.getTitle();
        Cover cover = musicLikedRemoteItemBean.getCover();
        String url = cover != null ? cover.getUrl() : null;
        String countryName = musicLikedRemoteItemBean.getCountryName();
        String genre = musicLikedRemoteItemBean.getGenre();
        String releaseDate = musicLikedRemoteItemBean.getReleaseDate();
        Integer durationSeconds = musicLikedRemoteItemBean.getDurationSeconds();
        int iIntValue = durationSeconds != null ? durationSeconds.intValue() : 0;
        String singerName = musicLikedRemoteItemBean.getSingerName();
        String singerAvatar = musicLikedRemoteItemBean.getSingerAvatar();
        Long likeTime = musicLikedRemoteItemBean.getLikeTime();
        return new MusicLikedDbBean(str, title, url, countryName, genre, releaseDate, iIntValue, singerName, singerAvatar, "", likeTime != null ? likeTime.longValue() : System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final Object m86225r(MusicLikedRemoteItemBean musicLikedRemoteItemBean, Continuation continuation) {
        if (musicLikedRemoteItemBean != null) {
            InterfaceC27291a interfaceC27291aM86204A = m86204A();
            String subjectId = musicLikedRemoteItemBean.getSubjectId();
            if (subjectId == null) {
                subjectId = "";
            }
            Object objMo106360d = interfaceC27291aM86204A.mo106360d(subjectId, continuation);
            if (objMo106360d == IntrinsicsKt.m97630f()) {
                return objMo106360d;
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final InterfaceC26241c m86226s() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64868o1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final String m86227t() {
        String simpleName = MusicLikedFragmentViewModel.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final InterfaceC26241c m86228u() {
        return (InterfaceC26241c) this.f65800d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final void m86229x() {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new MusicLikedFragmentViewModel$getLocalMusicLiked$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final InterfaceC20985a m86230z() {
        return (InterfaceC20985a) this.f65801e.getValue();
    }

    /* JADX INFO: renamed from: B */
    public final void m86231B(String str, Function1 callback) {
        Intrinsics.m97802h(callback, "callback");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new MusicLikedFragmentViewModel$getMusicLikedEntity$1(this, str, callback, null), 3, null);
    }

    /* JADX INFO: renamed from: C */
    public final LiveData m86232C() {
        return this.f65803g;
    }

    /* JADX INFO: renamed from: E */
    public final void m86233E(String str, Function1 callback) {
        Intrinsics.m97802h(callback, "callback");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new MusicLikedFragmentViewModel$isDownload$1(this, str, callback, null), 3, null);
    }

    /* JADX INFO: renamed from: F */
    public final void m86234F(String str, Function1 callback) {
        Intrinsics.m97802h(callback, "callback");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new MusicLikedFragmentViewModel$isLiked$1(this, str, callback, null), 3, null);
    }

    /* JADX INFO: renamed from: G */
    public final void m86235G(String str, LikeListActionEnum action) {
        Intrinsics.m97802h(action, "action");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new MusicLikedFragmentViewModel$likedMusic$1(str, action, this, null), 3, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m86236p(Subject subject) {
        Intrinsics.m97802h(subject, "subject");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new MusicLikedFragmentViewModel$clickLikedMusic$1(subject, this, null), 3, null);
    }

    /* JADX INFO: renamed from: v */
    public final void m86237v(String str, Function1 callback) {
        Intrinsics.m97802h(callback, "callback");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new MusicLikedFragmentViewModel$getDownloadEntity$1(this, str, callback, null), 3, null);
    }

    /* JADX INFO: renamed from: w */
    public final LiveData m86238w() {
        return this.f65802f;
    }

    /* JADX INFO: renamed from: y */
    public final void m86239y(String from) {
        Intrinsics.m97802h(from, "from");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new MusicLikedFragmentViewModel$getMusicLiked$1(this, from, null), 3, null);
    }
}
