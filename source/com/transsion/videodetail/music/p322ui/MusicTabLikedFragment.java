package com.transsion.videodetail.music.p322ui;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$string;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.music.MusicLikedDbBean;
import com.transsion.baseui.music.MusicFloatManager;
import com.transsion.moviedetail.viewmodel.MovieDetailViewModel;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.PreVideoAddress;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.Trailer;
import com.transsion.player.longvideo.constants.LongVodPageType;
import com.transsion.player.longvideo.p302ui.LongVodPlayerView;
import com.transsion.player.mediasession.MediaItem;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.player.p1003enum.PlayMimeType;
import com.transsion.videodetail.R$drawable;
import com.transsion.videodetail.music.adapter.C20977a;
import com.transsion.videodetail.music.bean.MusicLikedMultiItemEntity;
import com.transsion.videodetail.music.bean.MusicLikedUITypeEnum;
import com.transsion.videodetail.music.bean.MusicLoopEnum;
import com.transsion.videodetail.music.widget.MusicLikedListEmptyView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fo.C23403e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo.InterfaceC24450a;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import mx.C25917a;
import mx.C25918b;
import mx.C25919c;
import no.C26053g0;
import p553ko.C24715a;
import p553ko.C24717c;
import p586lx.C25752e;
import p626nx.C26116a;
import p648oj.InterfaceC26241c;
import p743rh.C27287m;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0003J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0013\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001e\u001a\u00020\u00042\u000e\u0010\u0019\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\u0003J\u001f\u0010$\u001a\u00020\u00042\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010\u0003J\u0019\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b-\u0010,J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b.\u0010*J\u0019\u0010/\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b/\u0010,J\u0017\u00100\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b0\u0010*J\u001f\u00104\u001a\u00020\u00042\u0006\u00101\u001a\u00020'2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u001d\u00108\u001a\b\u0012\u0004\u0012\u000207062\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\b\u0012\u0004\u0012\u000207062\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b>\u0010?R \u0010B\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010H\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010E\u001a\u0004\bO\u0010P¨\u0006R"}, m97100d2 = {"Lcom/transsion/videodetail/music/ui/MusicTabLikedFragment;", "Lcom/transsion/videodetail/music/ui/BaseMusicLikedFragment;", "<init>", "()V", "", "initViewData", "initListener", "initViewModel", "Lfo/e;", "mediaSource", "onCompletion", "(Lfo/e;)V", "", "getPageName", "()Ljava/lang/String;", "subjectId", "path", "", "fromItemClick", "G0", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/transsion/videodetail/music/bean/MusicLikedUITypeEnum;", "x0", "()Lcom/transsion/videodetail/music/bean/MusicLikedUITypeEnum;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "adapter", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", RequestParameters.POSITION, "F0", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V", "H0", "E0", "Lkotlin/Function0;", "exploreNowCallback", "m1", "(Lkotlin/jvm/functions/Function0;)V", "d1", "Lcom/transsion/moviedetailapi/bean/Subject;", "subject", "p1", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", "i1", "(Ljava/lang/String;)V", "f1", "n1", "h1", "k1", "mMovieDetailBean", "Lcom/transsion/moviedetailapi/bean/Trailer;", "trailer", "l1", "(Lcom/transsion/moviedetailapi/bean/Subject;Lcom/transsion/moviedetailapi/bean/Trailer;)V", "", "Lko/c;", "Z0", "(Lcom/transsion/moviedetailapi/bean/Trailer;)Ljava/util/List;", "Lcom/transsion/baselib/db/download/DownloadBean;", "downloadBean", "j1", "(Lcom/transsion/baselib/db/download/DownloadBean;)V", "Y0", "(Lcom/transsion/baselib/db/download/DownloadBean;)Ljava/util/List;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkotlin/jvm/functions/Function0;", "mExploreNowCallback", "Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "e", "Lkotlin/Lazy;", "X0", "()Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "movieDetailViewModel", "Ljo/a;", "f", "Ljo/a;", "playerControl", "Loj/c;", "g", "W0", "()Loj/c;", "downloadDao", "VideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class MusicTabLikedFragment extends BaseMusicLikedFragment {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function0 mExploreNowCallback;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private InterfaceC24450a playerControl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Lazy movieDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MovieDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.music.ui.MusicTabLikedFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.music.ui.MusicTabLikedFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3227v0.c invoke() {
            C3227v0.c defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.m97801g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy downloadDao = LazyKt.m97097b(new Function0() { // from class: com.transsion.videodetail.music.ui.g0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MusicTabLikedFragment.m86416V0();
        }
    });

    /* JADX INFO: renamed from: com.transsion.videodetail.music.ui.MusicTabLikedFragment$a */
    public /* synthetic */ class C21006a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65862a;

        static {
            int[] iArr = new int[MusicLoopEnum.values().length];
            try {
                iArr[MusicLoopEnum.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicLoopEnum.LIST_LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MusicLoopEnum.SINGLE_LOOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f65862a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsion.videodetail.music.ui.MusicTabLikedFragment$b */
    static final class C21007b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65863a;

        C21007b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65863a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65863a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3189c0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m97797c(mo6065a(), ((FunctionAdapter) obj).mo6065a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6065a().hashCode();
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f65863a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final InterfaceC26241c m86416V0() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64868o1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public final InterfaceC26241c m86417W0() {
        return (InterfaceC26241c) this.downloadDao.getValue();
    }

    /* JADX INFO: renamed from: X0 */
    private final MovieDetailViewModel m86418X0() {
        return (MovieDetailViewModel) this.movieDetailViewModel.getValue();
    }

    /* JADX INFO: renamed from: Y0 */
    private final List m86419Y0(DownloadBean downloadBean) {
        String string;
        String string2;
        ArrayList arrayList = new ArrayList();
        PlayMimeType playMimeType = PlayMimeType.DEFAULT;
        String resourceId = downloadBean.getResourceId();
        String str = resourceId == null ? "" : resourceId;
        String path = downloadBean.getPath();
        String str2 = path == null ? "" : path;
        Long size = downloadBean.getSize();
        String str3 = (size == null || (string2 = size.toString()) == null) ? "" : string2;
        Long duration = downloadBean.getDuration();
        arrayList.add(new C24717c(playMimeType, str, str2, "", str3, (duration == null || (string = duration.toString()) == null) ? "" : string, "", null, 128, null));
        return arrayList;
    }

    /* JADX INFO: renamed from: Z0 */
    private final List m86420Z0(Trailer trailer) {
        Integer duration;
        String string;
        Long size;
        String string2;
        String url;
        String videoId;
        ArrayList arrayList = new ArrayList();
        PlayMimeType playMimeType = PlayMimeType.DEFAULT;
        PreVideoAddress videoAddress = trailer.getVideoAddress();
        String str = (videoAddress == null || (videoId = videoAddress.getVideoId()) == null) ? "" : videoId;
        PreVideoAddress videoAddress2 = trailer.getVideoAddress();
        String str2 = (videoAddress2 == null || (url = videoAddress2.getUrl()) == null) ? "" : url;
        PreVideoAddress videoAddress3 = trailer.getVideoAddress();
        String str3 = (videoAddress3 == null || (size = videoAddress3.getSize()) == null || (string2 = size.toString()) == null) ? "" : string2;
        PreVideoAddress videoAddress4 = trailer.getVideoAddress();
        arrayList.add(new C24717c(playMimeType, str, str2, "", str3, (videoAddress4 == null || (duration = videoAddress4.getDuration()) == null || (string = duration.toString()) == null) ? "" : string, "", null, 128, null));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final void m86421a1(MusicTabLikedFragment musicTabLikedFragment, View view) {
        Function0 function0 = musicTabLikedFragment.mExploreNowCallback;
        if (function0 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final void m86422b1(MusicTabLikedFragment musicTabLikedFragment, View view) {
        musicTabLikedFragment.m86424d1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final Unit m86423c1(MusicTabLikedFragment musicTabLikedFragment, Pair pair) {
        C25917a.f79141a.m101735a(musicTabLikedFragment.getClassTag() + " --> initViewModel() --> showPlayer(it.second)");
        Subject subject = (Subject) pair.getSecond();
        if (subject != null) {
            musicTabLikedFragment.m86435p1(subject);
            musicTabLikedFragment.m86433n1(subject);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: d1 */
    private final void m86424d1() {
        List<Object> data;
        MusicLikedDbBean musicLikedDbBean;
        MusicLikedDbBean musicLikedDbBean2;
        InterfaceC16634g interfaceC16634gM102142h = C26053g0.f79567a.m102142h();
        String path = null;
        if (interfaceC16634gM102142h != null && interfaceC16634gM102142h.isPlaying()) {
            C25917a.f79141a.m101735a(getClassTag() + " --> onPlayAllClick() --> 若已在播放当前列表 --> 打开详情页");
            MusicLikedMultiItemEntity musicLikedMultiItemEntityM86261o0 = m86261o0();
            if (musicLikedMultiItemEntityM86261o0 == null) {
                musicLikedMultiItemEntityM86261o0 = m86264r0();
            }
            String subjectId = (musicLikedMultiItemEntityM86261o0 == null || (musicLikedDbBean2 = musicLikedMultiItemEntityM86261o0.getMusicLikedDbBean()) == null) ? null : musicLikedDbBean2.getSubjectId();
            if (musicLikedMultiItemEntityM86261o0 != null && (musicLikedDbBean = musicLikedMultiItemEntityM86261o0.getMusicLikedDbBean()) != null) {
                path = musicLikedDbBean.getPath();
            }
            mo86258G0(subjectId, path, false);
            return;
        }
        final MediaItem mediaItemM65588q = MusicFloatManager.f51050h.m65598b().m65588q();
        if (mediaItemM65588q != null) {
            m86267u0().m86233E(mediaItemM65588q.getSubjectId(), new Function1() { // from class: com.transsion.videodetail.music.ui.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MusicTabLikedFragment.m86425e1(this.f65893a, mediaItemM65588q, (String) obj);
                }
            });
            return;
        }
        C20977a mMusicAdapter = getMMusicAdapter();
        if (mMusicAdapter == null || (data = mMusicAdapter.getData()) == null) {
            return;
        }
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            MusicLikedMultiItemEntity musicLikedMultiItemEntity = (MusicLikedMultiItemEntity) it.next();
            if (C27287m.f83003a.m106330e()) {
                MusicLikedDbBean musicLikedDbBean3 = musicLikedMultiItemEntity.getMusicLikedDbBean();
                String subjectId2 = musicLikedDbBean3 != null ? musicLikedDbBean3.getSubjectId() : null;
                MusicLikedDbBean musicLikedDbBean4 = musicLikedMultiItemEntity.getMusicLikedDbBean();
                mo86258G0(subjectId2, musicLikedDbBean4 != null ? musicLikedDbBean4.getPath() : null, false);
                C25917a c25917a = C25917a.f79141a;
                String classTag = getClassTag();
                MusicLikedDbBean musicLikedDbBean5 = musicLikedMultiItemEntity.getMusicLikedDbBean();
                String subjectId3 = musicLikedDbBean5 != null ? musicLikedDbBean5.getSubjectId() : null;
                MusicLikedDbBean musicLikedDbBean6 = musicLikedMultiItemEntity.getMusicLikedDbBean();
                c25917a.m101735a(classTag + " --> onPlayAllClick() --> 有网络默认播放第一个 --> subjectId = " + subjectId3 + " --> path = " + (musicLikedDbBean6 != null ? musicLikedDbBean6.getPath() : null));
                return;
            }
            if (musicLikedMultiItemEntity.isDownloaded()) {
                MusicLikedDbBean musicLikedDbBean7 = musicLikedMultiItemEntity.getMusicLikedDbBean();
                String subjectId4 = musicLikedDbBean7 != null ? musicLikedDbBean7.getSubjectId() : null;
                MusicLikedDbBean musicLikedDbBean8 = musicLikedMultiItemEntity.getMusicLikedDbBean();
                mo86258G0(subjectId4, musicLikedDbBean8 != null ? musicLikedDbBean8.getPath() : null, false);
                C25917a c25917a2 = C25917a.f79141a;
                String classTag2 = getClassTag();
                MusicLikedDbBean musicLikedDbBean9 = musicLikedMultiItemEntity.getMusicLikedDbBean();
                String subjectId5 = musicLikedDbBean9 != null ? musicLikedDbBean9.getSubjectId() : null;
                MusicLikedDbBean musicLikedDbBean10 = musicLikedMultiItemEntity.getMusicLikedDbBean();
                c25917a2.m101735a(classTag2 + " --> onPlayAllClick() --> 无网络情况默认播放第一个已下载的Music --> subjectId = " + subjectId5 + " --> path = " + (musicLikedDbBean10 != null ? musicLikedDbBean10.getPath() : null));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final Unit m86425e1(MusicTabLikedFragment musicTabLikedFragment, MediaItem mediaItem, String path) {
        Intrinsics.m97802h(path, "path");
        C25917a.f79141a.m101735a(musicTabLikedFragment.getClassTag() + " --> onPlayAllClick() --> 继续播放 --> subjectId = " + mediaItem.getSubjectId() + " --> path = " + path);
        musicTabLikedFragment.mo86258G0(mediaItem.getSubjectId(), path, false);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: f1 */
    private final void m86426f1(final String subjectId) {
        if (subjectId != null) {
            m86267u0().m86233E(subjectId, new Function1() { // from class: com.transsion.videodetail.music.ui.k0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MusicTabLikedFragment.m86427g1(this.f65896a, subjectId, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final Unit m86427g1(MusicTabLikedFragment musicTabLikedFragment, String str, String path) {
        Intrinsics.m97802h(path, "path");
        if (!TextUtils.isEmpty(path)) {
            musicTabLikedFragment.m86428h1(str);
        } else if (C27287m.f83003a.m106330e()) {
            MovieDetailViewModel.m70880T(musicTabLikedFragment.m86418X0(), 0, str, null, 4, null);
            MovieDetailViewModel.m70874E(musicTabLikedFragment.m86418X0(), str, null, false, 6, null);
        } else {
            C25917a.f79141a.m101736b(musicTabLikedFragment.getClassTag() + " --> playNext() --> 当前无网络、无下载 --> 失败 / 继续切换下一首");
            musicTabLikedFragment.m86429i1(str);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: h1 */
    private final void m86428h1(String subjectId) {
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new MusicTabLikedFragment$playDownloadMusic$1(this, subjectId, null), 3, null);
    }

    /* JADX INFO: renamed from: i1 */
    private final void m86429i1(String subjectId) {
        String strM86269w0 = m86269w0(subjectId);
        if (strM86269w0 != null) {
            m86426f1(strM86269w0);
            return;
        }
        C25917a.f79141a.m101736b(getClassTag() + " --> onCompletion() --> 内存处理 --> 列表循环 --> 加载失败");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public final void m86430j1(DownloadBean downloadBean) {
        m86435p1(null);
        String subjectId = downloadBean.getSubjectId();
        String str = subjectId == null ? "" : subjectId;
        PlayMimeType playMimeType = PlayMimeType.DEFAULT;
        String subjectName = downloadBean.getSubjectName();
        String str2 = subjectName == null ? "" : subjectName;
        String pageName = getPageName();
        List listM86419Y0 = m86419Y0(downloadBean);
        String cover = downloadBean.getCover();
        String str3 = cover == null ? "" : cover;
        String thumbnail = downloadBean.getThumbnail();
        String str4 = thumbnail == null ? "" : thumbnail;
        C24715a c24715a = new C24715a(str, playMimeType, 0L, 0, 0, str2, null, "", pageName, listM86419Y0, str3, str4, "", 0, Integer.valueOf(downloadBean.getSubjectType()), false, downloadBean.getTitleName(), downloadBean.getOps(), 32832, null);
        c24715a.m97070z(null);
        C25917a.f79141a.m101735a(getClassTag() + " --> playOfflineMusic() --> 播放本地文件 --> addDataSource = " + c24715a + "  --> playerControl = " + this.playerControl);
        InterfaceC24450a interfaceC24450a = this.playerControl;
        if (interfaceC24450a != null) {
            interfaceC24450a.setDataSource(c24715a);
        }
    }

    /* JADX INFO: renamed from: k1 */
    private final void m86431k1(Subject subject) {
        Integer durationSeconds = subject.getDurationSeconds();
        Integer numValueOf = Integer.valueOf(durationSeconds != null ? durationSeconds.intValue() : 0);
        ResourceDetectors resourceDetector = subject.getResourceDetector();
        PreVideoAddress preVideoAddress = new PreVideoAddress(0, null, numValueOf, 0, 0, 0L, 0, resourceDetector != null ? resourceDetector.getDownloadUrl() : null, "", 0);
        Cover stills = subject.getStills();
        if (stills == null) {
            stills = subject.getCover();
        }
        Trailer trailer = new Trailer(SubjectType.MUSIC.getValue(), preVideoAddress, stills, null, null, 24, null);
        trailer.setSubjectId(subject.getSubjectId());
        trailer.setMusicName(subject.getTitle());
        m86432l1(subject, trailer);
    }

    /* JADX INFO: renamed from: l1 */
    private final void m86432l1(Subject mMovieDetailBean, Trailer trailer) {
        String averageHueLight;
        String thumbnail;
        String url;
        String subjectId = mMovieDetailBean.getSubjectId();
        String str = subjectId == null ? "" : subjectId;
        PlayMimeType playMimeType = PlayMimeType.DEFAULT;
        String title = mMovieDetailBean.getTitle();
        String str2 = title == null ? "" : title;
        String pageName = getPageName();
        List listM86420Z0 = m86420Z0(trailer);
        Cover cover = trailer.getCover();
        String str3 = (cover == null || (url = cover.getUrl()) == null) ? "" : url;
        Cover cover2 = trailer.getCover();
        String str4 = (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) ? "" : thumbnail;
        Cover cover3 = mMovieDetailBean.getCover();
        String str5 = (cover3 == null || (averageHueLight = cover3.getAverageHueLight()) == null) ? "" : averageHueLight;
        Integer durationSeconds = mMovieDetailBean.getDurationSeconds();
        int iIntValue = durationSeconds != null ? durationSeconds.intValue() : 0;
        Integer subjectType = mMovieDetailBean.getSubjectType();
        C24715a c24715a = new C24715a(str, playMimeType, 0L, 0, 0, str2, null, "", pageName, listM86420Z0, str3, str4, str5, iIntValue, Integer.valueOf(subjectType != null ? subjectType.intValue() : 1), false, mMovieDetailBean.getTitle(), mMovieDetailBean.getOps(), 32832, null);
        c24715a.m97070z(mMovieDetailBean);
        C25917a.f79141a.m101735a(getClassTag() + " --> playTrailer() --> 当前有网络，没有下载资源 --> 播放流媒体数据 --> addDataSource = " + c24715a + " -->  playerControl = " + this.playerControl);
        InterfaceC24450a interfaceC24450a = this.playerControl;
        if (interfaceC24450a != null) {
            interfaceC24450a.setDataSource(c24715a);
        }
    }

    /* JADX INFO: renamed from: n1 */
    private final void m86433n1(final Subject subject) {
        m86267u0().m86233E(subject.getSubjectId(), new Function1() { // from class: com.transsion.videodetail.music.ui.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MusicTabLikedFragment.m86434o1(this.f65899a, subject, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final Unit m86434o1(MusicTabLikedFragment musicTabLikedFragment, Subject subject, String path) {
        Intrinsics.m97802h(path, "path");
        if (TextUtils.isEmpty(path)) {
            musicTabLikedFragment.m86431k1(subject);
        } else {
            musicTabLikedFragment.m86428h1(subject.getSubjectId());
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p1 */
    private final void m86435p1(Subject subject) {
        Context context;
        Integer subjectType;
        if (this.playerControl == null && (context = getContext()) != null) {
            LongVodPageType longVodPageType = ((subject == null || (subjectType = subject.getSubjectType()) == null) ? SubjectType.MOVIE.getValue() : subjectType.intValue()) == SubjectType.MUSIC.getValue() ? LongVodPageType.MUSIC : LongVodPageType.MUSIC;
            if (((C25752e) getMViewBinding()) != null) {
                LongVodPlayerView longVodPlayerView = new LongVodPlayerView(context);
                InterfaceC24450a.a.m95941a(longVodPlayerView, getPageName(), longVodPageType, longVodPageType.name() + (subject != null ? subject.getSubjectId() : null), null, null, null, null, 96, null);
                longVodPlayerView.setFeedBackVisible(true);
                longVodPlayerView.setMusicLikedFragment(true);
                this.playerControl = longVodPlayerView;
            }
        }
    }

    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment
    /* JADX INFO: renamed from: E0 */
    public void mo86256E0() {
    }

    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment
    /* JADX INFO: renamed from: F0 */
    public void mo86257F0(BaseQuickAdapter adapter, View view, int position) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
    }

    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment
    /* JADX INFO: renamed from: G0 */
    public void mo86258G0(String subjectId, String path, boolean fromItemClick) {
        m86260K0(getPageName(), fromItemClick);
        if (TextUtils.isEmpty(subjectId)) {
            C28951b.f88586a.m111454d(R$string.error_load_failed);
        } else if (C27287m.f83003a.m106330e() || !TextUtils.isEmpty(path)) {
            Navigator.m61845x(TheRouter.m61773c("/playvideo/music_detail").m61857K("id", subjectId).m61872z("is_music_liked_fragment", true), getContext(), null, 2, null);
        } else {
            C28951b.f88586a.m111454d(com.transsion.videodetail.R$string.music_no_network);
            MusicFloatManager.f51050h.m65598b().m65587n();
        }
    }

    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment
    /* JADX INFO: renamed from: H0 */
    public void mo86259H0(C23403e mediaSource) {
    }

    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment
    public String getPageName() {
        return "music_tab_liked_fragment";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        AppCompatTextView appCompatTextView;
        MusicLikedListEmptyView musicLikedListEmptyView;
        View exploreNowView;
        super.initListener();
        C25752e c25752e = (C25752e) getMViewBinding();
        if (c25752e != null && (musicLikedListEmptyView = c25752e.f78508b) != null && (exploreNowView = musicLikedListEmptyView.getExploreNowView()) != null) {
            exploreNowView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.music.ui.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MusicTabLikedFragment.m86421a1(this.f65889a, view);
                }
            });
        }
        C25752e c25752e2 = (C25752e) getMViewBinding();
        if (c25752e2 == null || (appCompatTextView = c25752e2.f78512f) == null) {
            return;
        }
        C26116a.f79712a.m102281a(appCompatTextView, "  " + getResources().getString(com.transsion.videodetail.R$string.music_play_all), AbstractC2397b.getDrawable(Utils.m27275a(), R$drawable.music_pause));
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.music.ui.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicTabLikedFragment.m86422b1(this.f65891a, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        View view;
        super.initViewData();
        C25752e c25752e = (C25752e) getMViewBinding();
        ViewGroup.LayoutParams layoutParams = (c25752e == null || (view = c25752e.f78514h) == null) ? null : view.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C2308b) layoutParams)).height = AbstractC5781d.m27351c() + AbstractC5776a0.m27313a(52.0f) + AbstractC5776a0.m27313a(30.0f);
    }

    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        super.initViewModel();
        m86418X0().m70910F().m14851j(this, new C21007b(new Function1() { // from class: com.transsion.videodetail.music.ui.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MusicTabLikedFragment.m86423c1(this.f65886a, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m1 */
    public final void m86436m1(Function0 exploreNowCallback) {
        this.mExploreNowCallback = exploreNowCallback;
    }

    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment, com.transsion.player.orplayer.InterfaceC16633f
    public void onCompletion(C23403e mediaSource) {
        MediaItem mediaItemM92933i;
        MediaItem mediaItemM92933i2;
        super.onCompletion(mediaSource);
        if (C25918b.f79142a.m101738a()) {
            C25917a.f79141a.m101736b(getClassTag() + " --> onCompletion() --> 详情页处理");
            return;
        }
        int i11 = C21006a.f65862a[C25919c.f79144a.m101741b().ordinal()];
        if (i11 == 1) {
            C25917a.f79141a.m101735a(getClassTag() + " --> onCompletion() --> Tab 内存处理 --> MusicLoopEnum.NORMAL --> 播放结束");
            return;
        }
        String subjectId = null;
        if (i11 == 2) {
            C25917a.f79141a.m101735a(getClassTag() + " --> onCompletion() --> Tab 内存处理 --> MusicLoopEnum.LIST_LOOP --> 列表循环");
            if (mediaSource != null && (mediaItemM92933i = mediaSource.m92933i()) != null) {
                subjectId = mediaItemM92933i.getSubjectId();
            }
            m86429i1(subjectId);
            return;
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        C25917a.f79141a.m101735a(getClassTag() + " --> onCompletion() --> Tab 内存处理 --> MusicLoopEnum.SINGLE_LOOP --> 单曲循环");
        if (mediaSource != null && (mediaItemM92933i2 = mediaSource.m92933i()) != null) {
            subjectId = mediaItemM92933i2.getSubjectId();
        }
        m86426f1(subjectId);
    }

    @Override // com.transsion.videodetail.music.p322ui.BaseMusicLikedFragment
    /* JADX INFO: renamed from: x0 */
    public MusicLikedUITypeEnum mo86270x0() {
        return MusicLikedUITypeEnum.MUSIC_TAB;
    }
}
