package com.transsion.videodetail.music.p322ui;

import android.graphics.Rect;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3192e;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3194f;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.tmc.integration.event.EventConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baselib.p291db.music.MusicLikedDbBean;
import com.transsion.baseui.fragment.LazyFragment;
import com.transsion.baseui.music.MusicFloatManager;
import com.transsion.player.mediasession.MediaItem;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.PlayError;
import com.transsion.videodetail.R$id;
import com.transsion.videodetail.R$string;
import com.transsion.videodetail.music.adapter.C20977a;
import com.transsion.videodetail.music.adapter.C20978b;
import com.transsion.videodetail.music.bean.MusicLikedItemStateEnum;
import com.transsion.videodetail.music.bean.MusicLikedMultiItemEntity;
import com.transsion.videodetail.music.bean.MusicLikedUITypeEnum;
import com.transsion.videodetail.music.data.MusicLikedFragmentViewModel;
import com.transsion.videodetail.music.widget.MusicLikedListEmptyView;
import com.transsion.videodetail.music.widget.MusicLikedListLoadingView;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fo.C23403e;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.C25917a;
import p550kj.C24655b;
import p550kj.C24662i;
import p586lx.C25752e;
import p683po.C26906c;
import p683po.C26907d;
import p765s6.InterfaceC27564b;
import p765s6.InterfaceC27566d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u0005J\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0005J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u0005J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010\u0005J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\u0005J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\u0005J\u001f\u0010,\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b.\u0010\rJ\u0019\u0010/\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b/\u0010\rJ\u0019\u00100\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b0\u0010\rJ!\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u0002012\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001bH&¢\u0006\u0004\b5\u0010\u001dJ-\u00109\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u00010\u001b2\b\u00107\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u00108\u001a\u00020\u0014H&¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H&¢\u0006\u0004\b<\u0010=J/\u0010D\u001a\u00020\u00062\u000e\u0010?\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030>2\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH&¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\bF\u0010\rJ\u000f\u0010G\u001a\u00020\u0006H&¢\u0006\u0004\bG\u0010\u0005J\u000f\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u0004\u0018\u00010H¢\u0006\u0004\bK\u0010JJ\r\u0010L\u001a\u00020B¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\bN\u0010\u001dJ\u0019\u0010O\u001a\u0004\u0018\u00010\u001b2\b\u00106\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020B2\b\u00106\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0006H\u0016¢\u0006\u0004\bS\u0010\u0005J\u001d\u0010V\u001a\u00020\u00062\u0006\u0010T\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020\u0014¢\u0006\u0004\bV\u0010WR$\u0010_\u001a\u0004\u0018\u00010X8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001b\u0010e\u001a\u00020`8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR$\u0010k\u001a\u0004\u0018\u00010\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010\r¨\u0006l"}, m97100d2 = {"Lcom/transsion/videodetail/music/ui/BaseMusicLikedFragment;", "Lcom/transsion/baseui/fragment/LazyFragment;", "Llx/e;", "Lcom/transsion/player/orplayer/f;", "<init>", "()V", "", "showLoading", "L0", "A0", "Lfo/e;", "mediaSource", "J0", "(Lfo/e;)V", "I0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "", "isAudioShowNoNetworkLayout", "()Z", "Landroid/view/LayoutInflater;", "inflater", "y0", "(Landroid/view/LayoutInflater;)Llx/e;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "retryLoadData", "lazyLoadData", "initListener", "initViewModel", "initViewData", "loadDefaultData", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "onDisconnected", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onConnected", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onVideoPause", "onVideoStart", "onPlayerRelease", "", NotificationCompat.CATEGORY_PROGRESS, "onProgress", "(JLfo/e;)V", "getPageName", "subjectId", "path", "fromItemClick", "G0", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/transsion/videodetail/music/bean/MusicLikedUITypeEnum;", "x0", "()Lcom/transsion/videodetail/music/bean/MusicLikedUITypeEnum;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "adapter", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", RequestParameters.POSITION, "F0", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V", "H0", "E0", "Lcom/transsion/videodetail/music/bean/MusicLikedMultiItemEntity;", "r0", "()Lcom/transsion/videodetail/music/bean/MusicLikedMultiItemEntity;", "o0", "p0", "()I", "v0", "w0", "(Ljava/lang/String;)Ljava/lang/String;", "q0", "(Ljava/lang/String;)I", "showEmpty", "pageName", "fromItemCLick", "K0", "(Ljava/lang/String;Z)V", "Lcom/transsion/videodetail/music/adapter/a;", "a", "Lcom/transsion/videodetail/music/adapter/a;", "t0", "()Lcom/transsion/videodetail/music/adapter/a;", "setMMusicAdapter", "(Lcom/transsion/videodetail/music/adapter/a;)V", "mMusicAdapter", "Lcom/transsion/videodetail/music/data/MusicLikedFragmentViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "u0", "()Lcom/transsion/videodetail/music/data/MusicLikedFragmentViewModel;", "mViewModel", "c", "Lfo/e;", "s0", "()Lfo/e;", "setMCurrentMediaSource", "mCurrentMediaSource", "VideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public abstract class BaseMusicLikedFragment extends LazyFragment<C25752e> implements InterfaceC16633f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C20977a mMusicAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MusicLikedFragmentViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.music.ui.BaseMusicLikedFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.music.ui.BaseMusicLikedFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C23403e mCurrentMediaSource;

    /* JADX INFO: renamed from: com.transsion.videodetail.music.ui.BaseMusicLikedFragment$a */
    public static final class C20989a implements InterfaceC3194f {
        C20989a() {
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public /* synthetic */ void onCreate(InterfaceC3224u interfaceC3224u) {
            AbstractC3192e.m14896a(this, interfaceC3224u);
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public /* synthetic */ void onDestroy(InterfaceC3224u interfaceC3224u) {
            AbstractC3192e.m14897b(this, interfaceC3224u);
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public /* synthetic */ void onPause(InterfaceC3224u interfaceC3224u) {
            AbstractC3192e.m14898c(this, interfaceC3224u);
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public void onResume(InterfaceC3224u owner) {
            Intrinsics.m97802h(owner, "owner");
            AbstractC3192e.m14899d(this, owner);
            BaseMusicLikedFragment.this.m86267u0().m86239y("Activity_onResume()");
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public /* synthetic */ void onStart(InterfaceC3224u interfaceC3224u) {
            AbstractC3192e.m14900e(this, interfaceC3224u);
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public /* synthetic */ void onStop(InterfaceC3224u interfaceC3224u) {
            AbstractC3192e.m14901f(this, interfaceC3224u);
        }
    }

    /* JADX INFO: renamed from: com.transsion.videodetail.music.ui.BaseMusicLikedFragment$b */
    public static final class C20990b extends RecyclerView.AbstractC4213l {
        C20990b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (parent.getAdapter() != null) {
                outRect.top = AbstractC5776a0.m27313a(10.0f);
            }
            RecyclerView.Adapter adapter = parent.getAdapter();
            if (adapter == null || childAdapterPosition != adapter.getItemCount() - 1) {
                return;
            }
            outRect.bottom = AbstractC5776a0.m27313a(16.0f);
        }
    }

    /* JADX INFO: renamed from: com.transsion.videodetail.music.ui.BaseMusicLikedFragment$c */
    static final class C20991c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65808a;

        C20991c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65808a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65808a;
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
            this.f65808a.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A0 */
    private final void m86244A0() {
        RecyclerView recyclerView;
        C25752e c25752e = (C25752e) getMViewBinding();
        if (c25752e == null || (recyclerView = c25752e.f78510d) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new C20990b());
        C20977a c20977a = new C20977a(mo86270x0());
        this.mMusicAdapter = c20977a;
        c20977a.m36227w1(new InterfaceC27566d() { // from class: com.transsion.videodetail.music.ui.a
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                BaseMusicLikedFragment.m86245B0(this.f65876a, baseQuickAdapter, view, i11);
            }
        });
        c20977a.m36193l(R$id.ivNextPlay);
        c20977a.m36216s1(new InterfaceC27564b() { // from class: com.transsion.videodetail.music.ui.b
            @Override // p765s6.InterfaceC27564b
            /* JADX INFO: renamed from: a */
            public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                BaseMusicLikedFragment.m86246C0(this.f65878a, baseQuickAdapter, view, i11);
            }
        });
        recyclerView.setAdapter(c20977a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final void m86245B0(BaseMusicLikedFragment baseMusicLikedFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        MusicLikedMultiItemEntity musicLikedMultiItemEntity = item instanceof MusicLikedMultiItemEntity ? (MusicLikedMultiItemEntity) item : null;
        if (musicLikedMultiItemEntity != null) {
            MusicLikedDbBean musicLikedDbBean = musicLikedMultiItemEntity.getMusicLikedDbBean();
            String subjectId = musicLikedDbBean != null ? musicLikedDbBean.getSubjectId() : null;
            MusicLikedDbBean musicLikedDbBean2 = musicLikedMultiItemEntity.getMusicLikedDbBean();
            baseMusicLikedFragment.mo86258G0(subjectId, musicLikedDbBean2 != null ? musicLikedDbBean2.getPath() : null, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m86246C0(BaseMusicLikedFragment baseMusicLikedFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        baseMusicLikedFragment.mo86257F0(adapter, view, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D0 */
    public static final Unit m86247D0(BaseMusicLikedFragment baseMusicLikedFragment, List list) {
        AppCompatTextView appCompatTextView;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            baseMusicLikedFragment.showEmpty();
            C20977a c20977a = baseMusicLikedFragment.mMusicAdapter;
            if (c20977a != null) {
                c20977a.mo36201n1(null);
            }
        } else {
            baseMusicLikedFragment.m86250L0();
            C25917a.f79141a.m101735a(baseMusicLikedFragment.getClassTag() + " --> initViewModel() --> 增量更新收藏列表");
            C20977a c20977a2 = baseMusicLikedFragment.mMusicAdapter;
            if (c20977a2 != null) {
                DiffUtil.C4173d c4173dM20669b = DiffUtil.m20669b(new C20978b(c20977a2.getData(), list));
                Intrinsics.m97801g(c4173dM20669b, "calculateDiff(...)");
                c20977a2.mo36210q1(list);
                c4173dM20669b.m20684c(c20977a2);
            }
            C20977a c20977a3 = baseMusicLikedFragment.mMusicAdapter;
            if (c20977a3 != null) {
                c20977a3.mo36201n1(list2);
            }
            String str = list.size() + " " + baseMusicLikedFragment.getResources().getString(R$string.music_videos);
            C25752e c25752e = (C25752e) baseMusicLikedFragment.getMViewBinding();
            if (c25752e != null && (appCompatTextView = c25752e.f78513g) != null) {
                appCompatTextView.setText(str);
            }
            baseMusicLikedFragment.mo86256E0();
            baseMusicLikedFragment.m86248I0(baseMusicLikedFragment.mCurrentMediaSource);
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I0 */
    private final void m86248I0(C23403e mediaSource) {
        List<Object> data;
        RecyclerView recyclerView;
        RecyclerView.AbstractC4214m layoutManager;
        List<Object> data2;
        int i11 = 0;
        if (mediaSource == null) {
            C20977a c20977a = this.mMusicAdapter;
            if (c20977a == null || (data2 = c20977a.getData()) == null) {
                return;
            }
            for (Object obj : data2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                MusicLikedMultiItemEntity musicLikedMultiItemEntity = (MusicLikedMultiItemEntity) obj;
                if (musicLikedMultiItemEntity.getState() == MusicLikedItemStateEnum.PLAYING) {
                    musicLikedMultiItemEntity.setState(MusicLikedItemStateEnum.NONE);
                    C20977a c20977a2 = this.mMusicAdapter;
                    if (c20977a2 != null) {
                        c20977a2.notifyItemChanged(i11, musicLikedMultiItemEntity);
                    }
                }
                i11 = i12;
            }
            return;
        }
        C20977a c20977a3 = this.mMusicAdapter;
        if (c20977a3 == null || (data = c20977a3.getData()) == null) {
            return;
        }
        for (Object obj2 : data) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            MusicLikedMultiItemEntity musicLikedMultiItemEntity2 = (MusicLikedMultiItemEntity) obj2;
            MusicLikedItemStateEnum state = musicLikedMultiItemEntity2.getState();
            MusicLikedItemStateEnum musicLikedItemStateEnum = MusicLikedItemStateEnum.PLAYING;
            if (state == musicLikedItemStateEnum) {
                musicLikedMultiItemEntity2.setState(MusicLikedItemStateEnum.NONE);
                C20977a c20977a4 = this.mMusicAdapter;
                if (c20977a4 != null) {
                    c20977a4.notifyItemChanged(i11, musicLikedMultiItemEntity2);
                }
            }
            MusicLikedDbBean musicLikedDbBean = musicLikedMultiItemEntity2.getMusicLikedDbBean();
            String subjectId = musicLikedDbBean != null ? musicLikedDbBean.getSubjectId() : null;
            MediaItem mediaItemM92933i = mediaSource.m92933i();
            if (TextUtils.equals(subjectId, mediaItemM92933i != null ? mediaItemM92933i.getSubjectId() : null)) {
                musicLikedMultiItemEntity2.setState(musicLikedItemStateEnum);
                C20977a c20977a5 = this.mMusicAdapter;
                if (c20977a5 != null) {
                    c20977a5.notifyItemChanged(i11, musicLikedMultiItemEntity2);
                }
                C25752e c25752e = (C25752e) getMViewBinding();
                if (c25752e != null && (recyclerView = c25752e.f78510d) != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
                    layoutManager.scrollToPosition(i11);
                }
            }
            i11 = i13;
        }
    }

    /* JADX INFO: renamed from: J0 */
    private final void m86249J0(C23403e mediaSource) {
        MediaItem mediaItemM92933i;
        MediaItem mediaItemM92933i2;
        String subjectId = null;
        String subjectId2 = (mediaSource == null || (mediaItemM92933i2 = mediaSource.m92933i()) == null) ? null : mediaItemM92933i2.getSubjectId();
        C23403e c23403e = this.mCurrentMediaSource;
        if (c23403e != null && (mediaItemM92933i = c23403e.m92933i()) != null) {
            subjectId = mediaItemM92933i.getSubjectId();
        }
        if (TextUtils.equals(subjectId2, subjectId)) {
            return;
        }
        this.mCurrentMediaSource = mediaSource;
        C25917a.f79141a.m101735a(getClassTag() + " --> refreshStateView() --> 音乐切换了");
        mo86259H0(mediaSource);
        m86248I0(mediaSource);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L0 */
    private final void m86250L0() {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        RecyclerView recyclerView;
        MusicLikedListEmptyView musicLikedListEmptyView;
        MusicLikedListLoadingView musicLikedListLoadingView;
        C25752e c25752e = (C25752e) getMViewBinding();
        if (c25752e != null && (musicLikedListLoadingView = c25752e.f78511e) != null) {
            musicLikedListLoadingView.setVisibility(8);
        }
        C25752e c25752e2 = (C25752e) getMViewBinding();
        if (c25752e2 != null && (musicLikedListEmptyView = c25752e2.f78508b) != null) {
            musicLikedListEmptyView.setVisibility(8);
        }
        C25752e c25752e3 = (C25752e) getMViewBinding();
        if (c25752e3 != null && (recyclerView = c25752e3.f78510d) != null) {
            recyclerView.setVisibility(0);
        }
        if (mo86270x0() == MusicLikedUITypeEnum.MUSIC_DETAIL) {
            C25752e c25752e4 = (C25752e) getMViewBinding();
            if (c25752e4 != null && (appCompatTextView4 = c25752e4.f78513g) != null) {
                appCompatTextView4.setVisibility(8);
            }
            C25752e c25752e5 = (C25752e) getMViewBinding();
            if (c25752e5 == null || (appCompatTextView3 = c25752e5.f78512f) == null) {
                return;
            }
            appCompatTextView3.setVisibility(8);
            return;
        }
        C25752e c25752e6 = (C25752e) getMViewBinding();
        if (c25752e6 != null && (appCompatTextView2 = c25752e6.f78513g) != null) {
            appCompatTextView2.setVisibility(0);
        }
        C25752e c25752e7 = (C25752e) getMViewBinding();
        if (c25752e7 == null || (appCompatTextView = c25752e7.f78512f) == null) {
            return;
        }
        appCompatTextView.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showLoading() {
        RecyclerView recyclerView;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        MusicLikedListEmptyView musicLikedListEmptyView;
        MusicLikedListLoadingView musicLikedListLoadingView;
        C25752e c25752e = (C25752e) getMViewBinding();
        if (c25752e != null && (musicLikedListLoadingView = c25752e.f78511e) != null) {
            musicLikedListLoadingView.setVisibility(0);
        }
        C25752e c25752e2 = (C25752e) getMViewBinding();
        if (c25752e2 != null && (musicLikedListEmptyView = c25752e2.f78508b) != null) {
            musicLikedListEmptyView.setVisibility(8);
        }
        C25752e c25752e3 = (C25752e) getMViewBinding();
        if (c25752e3 != null && (appCompatTextView2 = c25752e3.f78513g) != null) {
            appCompatTextView2.setVisibility(8);
        }
        C25752e c25752e4 = (C25752e) getMViewBinding();
        if (c25752e4 != null && (appCompatTextView = c25752e4.f78512f) != null) {
            appCompatTextView.setVisibility(8);
        }
        C25752e c25752e5 = (C25752e) getMViewBinding();
        if (c25752e5 == null || (recyclerView = c25752e5.f78510d) == null) {
            return;
        }
        recyclerView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m86255z0(View view) {
    }

    /* JADX INFO: renamed from: E0 */
    public abstract void mo86256E0();

    /* JADX INFO: renamed from: F0 */
    public abstract void mo86257F0(BaseQuickAdapter adapter, View view, int position);

    /* JADX INFO: renamed from: G0 */
    public abstract void mo86258G0(String subjectId, String path, boolean fromItemClick);

    /* JADX INFO: renamed from: H0 */
    public abstract void mo86259H0(C23403e mediaSource);

    /* JADX INFO: renamed from: K0 */
    public final void m86260K0(String pageName, boolean fromItemCLick) {
        Intrinsics.m97802h(pageName, "pageName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EventConstants.KEY_ACTION, fromItemCLick ? WebConstants.FIELD_ITEM : "play_all");
        C24662i.f75350a.m96881p(pageName, linkedHashMap);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
        InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
    }

    public abstract String getPageName();

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        MusicLikedListEmptyView musicLikedListEmptyView;
        FragmentActivity activity = getActivity();
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity != null) {
            appCompatActivity.getLifecycle().mo14832a(new C20989a());
        }
        C25752e c25752e = (C25752e) getMViewBinding();
        if (c25752e == null || (musicLikedListEmptyView = c25752e.f78508b) == null) {
            return;
        }
        musicLikedListEmptyView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.music.ui.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseMusicLikedFragment.m86255z0(view);
            }
        });
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void initPlayer() {
        InterfaceC16633f.a.m72424b(this);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        m86244A0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m86267u0().m86232C().m14851j(this, new C20991c(new Function1() { // from class: com.transsion.videodetail.music.ui.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseMusicLikedFragment.m86247D0(this.f65880a, (List) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void loadDefaultData() {
        super.loadDefaultData();
        showLoading();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b(getPageName(), false, 2, null);
    }

    /* JADX INFO: renamed from: o0 */
    public final MusicLikedMultiItemEntity m86261o0() {
        List<Object> data;
        MediaItem mediaItemM92933i;
        C20977a c20977a = this.mMusicAdapter;
        if (c20977a != null && (data = c20977a.getData()) != null) {
            int i11 = 0;
            for (Object obj : data) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                MusicLikedMultiItemEntity musicLikedMultiItemEntity = (MusicLikedMultiItemEntity) obj;
                C23403e c23403e = this.mCurrentMediaSource;
                String subjectId = (c23403e == null || (mediaItemM92933i = c23403e.m92933i()) == null) ? null : mediaItemM92933i.getSubjectId();
                MusicLikedDbBean musicLikedDbBean = musicLikedMultiItemEntity.getMusicLikedDbBean();
                if (TextUtils.equals(subjectId, musicLikedDbBean != null ? musicLikedDbBean.getSubjectId() : null)) {
                    return musicLikedMultiItemEntity;
                }
                i11 = i12;
            }
        }
        return null;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onAliyunDecodeErrorChangeSoftwareDecoder(C23403e c23403e) {
        InterfaceC16633f.a.m72425c(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onBufferedPosition(long j11, C23403e c23403e) {
        InterfaceC16633f.a.m72426d(this, j11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onCompletion(C23403e c23403e) {
        InterfaceC16633f.a.m72427e(this, c23403e);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, p743rh.InterfaceC27288n
    public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.m97802h(network, "network");
        Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
        m86267u0().m86239y("onConnected()");
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C25917a.f79141a.m101735a(getClassTag() + " --> onCreate() --> 音乐收藏列表");
        MusicFloatManager.f51050h.m65598b().m65585k(this);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        MusicFloatManager.f51050h.m65598b().m65596z(this);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, p743rh.InterfaceC27288n
    public void onDisconnected() {
        super.onDisconnected();
        m86267u0().m86239y("onDisconnected()");
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onFocusChange(boolean z11) {
        InterfaceC16633f.a.m72429g(this, z11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onIsPlayingChanged(boolean z11) {
        InterfaceC16633f.a.m72430h(this, z11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingBegin(C23403e c23403e) {
        InterfaceC16633f.a.m72431i(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingEnd(C23403e c23403e) {
        InterfaceC16633f.a.m72433k(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoadingProgress(int i11, float f11, C23403e c23403e) {
        InterfaceC16633f.a.m72435m(this, i11, f11, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onLoopingStart() {
        InterfaceC16633f.a.m72437o(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onMediaItemTransition(String str) {
        InterfaceC16633f.a.m72438p(this, str);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayError(PlayError playError, C23403e c23403e) {
        InterfaceC16633f.a.m72439q(this, playError, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayerRelease(C23403e mediaSource) {
        InterfaceC16633f.a.m72442t(this, mediaSource);
        C25917a.f79141a.m101735a(getClassTag() + " --> onPlayerRelease()");
        m86249J0(null);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayerReset() {
        InterfaceC16633f.a.m72444v(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPrepare(C23403e c23403e) {
        InterfaceC16633f.a.m72445w(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onProgress(long progress, C23403e mediaSource) {
        InterfaceC16633f.a.m72447y(this, progress, mediaSource);
        m86249J0(mediaSource);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onRenderFirstFrame() {
        InterfaceC16633f.a.m72412A(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onSetDataSource() {
        InterfaceC16633f.a.m72413B(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onTracksAudioBitrateChange(int i11) {
        InterfaceC16633f.a.m72414C(this, i11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onTracksChange(C26906c c26906c) {
        InterfaceC16633f.a.m72415D(this, c26906c);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onTracksVideoBitrateChange(int i11) {
        InterfaceC16633f.a.m72416E(this, i11);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoPause(C23403e mediaSource) {
        InterfaceC16633f.a.m72417F(this, mediaSource);
        m86249J0(null);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int i11, int i12) {
        InterfaceC16633f.a.m72419H(this, i11, i12);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e mediaSource) {
        InterfaceC16633f.a.m72420I(this, mediaSource);
        m86249J0(mediaSource);
    }

    /* JADX INFO: renamed from: p0 */
    public final int m86262p0() {
        List<Object> data;
        MediaItem mediaItemM92933i;
        C20977a c20977a = this.mMusicAdapter;
        if (c20977a == null || (data = c20977a.getData()) == null) {
            return -1;
        }
        int i11 = 0;
        for (Object obj : data) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            MusicLikedMultiItemEntity musicLikedMultiItemEntity = (MusicLikedMultiItemEntity) obj;
            C23403e c23403e = this.mCurrentMediaSource;
            String subjectId = (c23403e == null || (mediaItemM92933i = c23403e.m92933i()) == null) ? null : mediaItemM92933i.getSubjectId();
            MusicLikedDbBean musicLikedDbBean = musicLikedMultiItemEntity.getMusicLikedDbBean();
            if (TextUtils.equals(subjectId, musicLikedDbBean != null ? musicLikedDbBean.getSubjectId() : null)) {
                return i11;
            }
            i11 = i12;
        }
        return -1;
    }

    /* JADX INFO: renamed from: q0 */
    public final int m86263q0(String subjectId) {
        List<Object> data;
        C20977a c20977a = this.mMusicAdapter;
        int i11 = -1;
        if (c20977a != null && (data = c20977a.getData()) != null) {
            int i12 = 0;
            for (Object obj : data) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.m97515u();
                }
                MusicLikedDbBean musicLikedDbBean = ((MusicLikedMultiItemEntity) obj).getMusicLikedDbBean();
                if (TextUtils.equals(subjectId, musicLikedDbBean != null ? musicLikedDbBean.getSubjectId() : null)) {
                    i11 = i12;
                }
                i12 = i13;
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: r0 */
    public final MusicLikedMultiItemEntity m86264r0() {
        C20977a c20977a;
        List<Object> data;
        List<Object> data2;
        C20977a c20977a2 = this.mMusicAdapter;
        if ((c20977a2 != null && (data2 = c20977a2.getData()) != null && data2.isEmpty()) || (c20977a = this.mMusicAdapter) == null || (data = c20977a.getData()) == null) {
            return null;
        }
        return (MusicLikedMultiItemEntity) data.get(0);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }

    /* JADX INFO: renamed from: s0, reason: from getter */
    protected final C23403e getMCurrentMediaSource() {
        return this.mCurrentMediaSource;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void setOnSeekCompleteListener() {
        InterfaceC16633f.a.m72422K(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void showEmpty() {
        RecyclerView recyclerView;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        MusicLikedListLoadingView musicLikedListLoadingView;
        MusicLikedListEmptyView musicLikedListEmptyView;
        C25752e c25752e = (C25752e) getMViewBinding();
        if (c25752e != null && (musicLikedListEmptyView = c25752e.f78508b) != null) {
            musicLikedListEmptyView.setVisibility(0);
        }
        C25752e c25752e2 = (C25752e) getMViewBinding();
        if (c25752e2 != null && (musicLikedListLoadingView = c25752e2.f78511e) != null) {
            musicLikedListLoadingView.setVisibility(8);
        }
        C25752e c25752e3 = (C25752e) getMViewBinding();
        if (c25752e3 != null && (appCompatTextView2 = c25752e3.f78513g) != null) {
            appCompatTextView2.setVisibility(8);
        }
        C25752e c25752e4 = (C25752e) getMViewBinding();
        if (c25752e4 != null && (appCompatTextView = c25752e4.f78512f) != null) {
            appCompatTextView.setVisibility(8);
        }
        C25752e c25752e5 = (C25752e) getMViewBinding();
        if (c25752e5 == null || (recyclerView = c25752e5.f78510d) == null) {
            return;
        }
        recyclerView.setVisibility(8);
    }

    /* JADX INFO: renamed from: t0, reason: from getter */
    protected final C20977a getMMusicAdapter() {
        return this.mMusicAdapter;
    }

    /* JADX INFO: renamed from: u0 */
    protected final MusicLikedFragmentViewModel m86267u0() {
        return (MusicLikedFragmentViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: renamed from: v0 */
    public final String m86268v0() {
        Object objM112707constructorimpl;
        List<Object> data;
        MusicLikedMultiItemEntity musicLikedMultiItemEntity;
        MusicLikedDbBean musicLikedDbBean;
        List<Object> data2;
        MusicLikedMultiItemEntity musicLikedMultiItemEntity2;
        MusicLikedDbBean musicLikedDbBean2;
        List<Object> data3;
        List<Object> data4;
        C20977a c20977a = this.mMusicAdapter;
        Object obj = null;
        if (c20977a != null && (data4 = c20977a.getData()) != null && data4.size() == 0) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            int iM86262p0 = m86262p0();
            if (iM86262p0 < 0) {
                return null;
            }
            int i11 = iM86262p0 + 1;
            C20977a c20977a2 = this.mMusicAdapter;
            if (i11 >= ((c20977a2 == null || (data3 = c20977a2.getData()) == null) ? 0 : data3.size())) {
                C20977a c20977a3 = this.mMusicAdapter;
                if (c20977a3 == null || (data2 = c20977a3.getData()) == null || (musicLikedMultiItemEntity2 = (MusicLikedMultiItemEntity) data2.get(0)) == null || (musicLikedDbBean2 = musicLikedMultiItemEntity2.getMusicLikedDbBean()) == null) {
                    return null;
                }
                return musicLikedDbBean2.getSubjectId();
            }
            C20977a c20977a4 = this.mMusicAdapter;
            objM112707constructorimpl = Result.m112707constructorimpl((c20977a4 == null || (data = c20977a4.getData()) == null || (musicLikedMultiItemEntity = (MusicLikedMultiItemEntity) data.get(i11)) == null || (musicLikedDbBean = musicLikedMultiItemEntity.getMusicLikedDbBean()) == null) ? null : musicLikedDbBean.getSubjectId());
            Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
            if (thM112710exceptionOrNullimpl == null) {
                obj = objM112707constructorimpl;
            } else {
                C25917a.f79141a.m101736b(getClassTag() + " --> getNext() --> it = " + thM112710exceptionOrNullimpl);
            }
            return (String) obj;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final String m86269w0(String subjectId) {
        Object objM112707constructorimpl;
        List<Object> data;
        MusicLikedMultiItemEntity musicLikedMultiItemEntity;
        MusicLikedDbBean musicLikedDbBean;
        List<Object> data2;
        MusicLikedMultiItemEntity musicLikedMultiItemEntity2;
        MusicLikedDbBean musicLikedDbBean2;
        List<Object> data3;
        List<Object> data4;
        C20977a c20977a = this.mMusicAdapter;
        Object obj = null;
        if (c20977a != null && (data4 = c20977a.getData()) != null && data4.size() == 0) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            int iM86263q0 = m86263q0(subjectId);
            if (iM86263q0 < 0) {
                return null;
            }
            int i11 = iM86263q0 + 1;
            C20977a c20977a2 = this.mMusicAdapter;
            if (i11 >= ((c20977a2 == null || (data3 = c20977a2.getData()) == null) ? 0 : data3.size())) {
                C20977a c20977a3 = this.mMusicAdapter;
                if (c20977a3 == null || (data2 = c20977a3.getData()) == null || (musicLikedMultiItemEntity2 = (MusicLikedMultiItemEntity) data2.get(0)) == null || (musicLikedDbBean2 = musicLikedMultiItemEntity2.getMusicLikedDbBean()) == null) {
                    return null;
                }
                return musicLikedDbBean2.getSubjectId();
            }
            C20977a c20977a4 = this.mMusicAdapter;
            objM112707constructorimpl = Result.m112707constructorimpl((c20977a4 == null || (data = c20977a4.getData()) == null || (musicLikedMultiItemEntity = (MusicLikedMultiItemEntity) data.get(i11)) == null || (musicLikedDbBean = musicLikedMultiItemEntity.getMusicLikedDbBean()) == null) ? null : musicLikedDbBean.getSubjectId());
            Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
            if (thM112710exceptionOrNullimpl == null) {
                obj = objM112707constructorimpl;
            } else {
                C25917a.f79141a.m101736b(getClassTag() + " --> getNext() --> it = " + thM112710exceptionOrNullimpl);
            }
            return (String) obj;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: x0 */
    public abstract MusicLikedUITypeEnum mo86270x0();

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public C25752e getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25752e c25752eM101279c = C25752e.m101279c(getLayoutInflater());
        Intrinsics.m97801g(c25752eM101279c, "inflate(...)");
        return c25752eM101279c;
    }
}
