package com.transsion.audio.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.transsion.audio.adapter.C14210c;
import com.transsion.audio.player.AudioPlayer;
import com.transsion.audio.viewmodel.HistoryListManager;
import com.transsion.baselib.p291db.audio.AudioBean;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.PlayError;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fo.C23403e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p380ej.C23157b;
import p415fq.InterfaceC23410a;
import p683po.C26906c;
import p683po.C26907d;
import p765s6.InterfaceC27566d;
import p801u6.C27941f;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001-B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u001b\u0010\u000b\u001a\u00020\u0006*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u001f\u0010\u0011\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u0005J\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0005J\u0019\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b&\u0010'J!\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010,\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b,\u0010#R\u0016\u0010/\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00105\u001a\u0004\u0018\u0001008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006?"}, m97100d2 = {"Lcom/transsion/audio/fragment/RecentListFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lej/b;", "Lcom/transsion/player/orplayer/f;", "<init>", "()V", "", "j0", "Lcom/transsion/audio/adapter/c;", "Lcom/transsion/baselib/db/audio/AudioBean;", WebConstants.FIELD_ITEM, "f0", "(Lcom/transsion/audio/adapter/c;Lcom/transsion/baselib/db/audio/AudioBean;)V", "h0", "loadData", "", "list", "l0", "(Ljava/util/List;)V", "Landroid/view/LayoutInflater;", "inflater", "g0", "(Landroid/view/LayoutInflater;)Lej/b;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "onResume", "onPause", "Lfo/e;", "mediaSource", "onPrepare", "(Lfo/e;)V", "", NotificationCompat.CATEGORY_PROGRESS, "onProgress", "(JLfo/e;)V", "Lcom/transsion/player/orplayer/PlayError;", "errorInfo", "onPlayError", "(Lcom/transsion/player/orplayer/PlayError;Lfo/e;)V", "onCompletion", "a", "Lcom/transsion/audio/adapter/c;", "mAdapter", "Lfq/a;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "getMAudioApi", "()Lfq/a;", "mAudioApi", "", "c", "Ljava/lang/String;", "previousUrl", "Ljava/util/concurrent/atomic/AtomicBoolean;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/util/concurrent/atomic/AtomicBoolean;", "mIsStop", "e", "Audio_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class RecentListFragment extends BaseFragment<C23157b> implements InterfaceC16633f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C14210c mAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mAudioApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.audio.fragment.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecentListFragment.mAudioApi_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String previousUrl = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private AtomicBoolean mIsStop = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.transsion.audio.fragment.RecentListFragment$b */
    public static final class C14221b implements C14210c.a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C14210c f50431b;

        C14221b(C14210c c14210c) {
            this.f50431b = c14210c;
        }

        @Override // com.transsion.audio.adapter.C14210c.a
        /* JADX INFO: renamed from: a */
        public void mo64457a(AudioBean item) {
            Intrinsics.m97802h(item, "item");
            RecentListFragment.this.m64502f0(this.f50431b, item);
        }

        @Override // com.transsion.audio.adapter.C14210c.a
        /* JADX INFO: renamed from: b */
        public void mo64458b(AudioBean item) {
            Intrinsics.m97802h(item, "item");
            if (!AudioPlayer.f50463i.m64593a().m64591y(item)) {
                Long readProcess = item.getReadProcess();
                long jLongValue = readProcess != null ? readProcess.longValue() : 0L;
                Long duration = item.getDuration();
                boolean z11 = jLongValue >= (duration != null ? duration.longValue() : -500L);
                if (item.getStatus() == 6 || z11) {
                    item.setReadProcess(0L);
                }
                RecentListFragment.this.mIsStop.set(false);
                item.setStatus(3);
                InterfaceC23410a interfaceC23410a = (InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0]);
                if (interfaceC23410a != null) {
                    interfaceC23410a.mo23880d(item, false);
                }
            } else if (item.getStatus() == 3) {
                RecentListFragment.this.mIsStop.set(true);
                item.setStatus(4);
                InterfaceC23410a interfaceC23410a2 = (InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0]);
                if (interfaceC23410a2 != null) {
                    interfaceC23410a2.stop();
                }
            } else {
                RecentListFragment.this.mIsStop.set(false);
                item.setStatus(3);
                InterfaceC23410a interfaceC23410a3 = (InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0]);
                if (interfaceC23410a3 != null) {
                    interfaceC23410a3.prepare();
                }
            }
            RecentListFragment recentListFragment = RecentListFragment.this;
            Long readProcess2 = item.getReadProcess();
            recentListFragment.onProgress(readProcess2 != null ? readProcess2.longValue() : 0L, new C23403e(item.getAudioUrl(), item.getAudioUrl(), 0, null, null, 28, null));
        }
    }

    /* JADX INFO: renamed from: com.transsion.audio.fragment.RecentListFragment$c */
    static final class C14222c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f50432a;

        C14222c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f50432a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f50432a;
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
            this.f50432a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public final void m64502f0(C14210c c14210c, AudioBean audioBean) {
        if (audioBean.getStatus() == 3) {
            AudioPlayer.f50463i.m64593a().m64582T();
        }
        C14210c c14210c2 = this.mAdapter;
        if (c14210c2 == null) {
            Intrinsics.m97819y("mAdapter");
            c14210c2 = null;
        }
        c14210c2.notifyItemRemoved(c14210c.m36184g0(audioBean));
        c14210c.getData().remove(audioBean);
        HistoryListManager.f50535e.m64709b().m64702o(audioBean);
    }

    private final InterfaceC23410a getMAudioApi() {
        return (InterfaceC23410a) this.mAudioApi.getValue();
    }

    /* JADX INFO: renamed from: h0 */
    private final void m64503h0() {
        HistoryListManager.f50535e.m64709b().m64703p().m14851j(this, new C14222c(new Function1() { // from class: com.transsion.audio.fragment.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecentListFragment.m64504i0(this.f50456a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final Unit m64504i0(RecentListFragment recentListFragment, List list) {
        recentListFragment.m64507l0(list);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: j0 */
    private final void m64505j0() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        ViewGroup.LayoutParams layoutParams;
        Fragment parentFragment = getParentFragment();
        Intrinsics.m97800f(parentFragment, "null cannot be cast to non-null type com.transsion.audio.fragment.AudioBottomSheetFragment");
        AudioBottomSheetFragment audioBottomSheetFragment = (AudioBottomSheetFragment) parentFragment;
        C23157b mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView3 = mViewBinding.f70633b) != null && (layoutParams = recyclerView3.getLayoutParams()) != null) {
            layoutParams.height = audioBottomSheetFragment.m64488D0() - AbstractC5776a0.m27313a(48.0f);
        }
        C23157b mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (recyclerView2 = mViewBinding2.f70633b) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        C14210c c14210c = new C14210c(new ArrayList());
        c14210c.m36227w1(new InterfaceC27566d() { // from class: com.transsion.audio.fragment.g
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                RecentListFragment.m64506k0(baseQuickAdapter, view, i11);
            }
        });
        c14210c.m64455I1(new C14221b(c14210c));
        this.mAdapter = c14210c;
        C23157b mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (recyclerView = mViewBinding3.f70633b) == null) {
            return;
        }
        C14210c c14210c2 = this.mAdapter;
        if (c14210c2 == null) {
            Intrinsics.m97819y("mAdapter");
            c14210c2 = null;
        }
        recyclerView.setAdapter(c14210c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final void m64506k0(BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        Object item = adapter.getItem(i11);
        if (item instanceof AudioBean) {
            AudioBean audioBean = (AudioBean) item;
            if (TextUtils.isEmpty(audioBean.getPostId())) {
                C28951b.f88586a.m111455e("This page is unavailable");
            } else {
                AbstractC5114k.m23933p(TheRouter.m61773c("/post/detail").m61857K(WebConstants.PAGE_FROM, "audio_list").m61857K("id", audioBean.getPostId()).m61857K("media_type", MediaType.AUDIO.getValue()).m61872z("video_load_more", true));
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    private final void m64507l0(List list) {
        C14210c c14210c = null;
        if (list == null || list.isEmpty()) {
            C14210c c14210c2 = this.mAdapter;
            if (c14210c2 == null) {
                Intrinsics.m97819y("mAdapter");
                c14210c2 = null;
            }
            C27941f.m108652u(c14210c2.m36186h0(), false, 1, null);
            return;
        }
        C14210c c14210c3 = this.mAdapter;
        if (c14210c3 == null) {
            Intrinsics.m97819y("mAdapter");
        } else {
            c14210c = c14210c3;
        }
        c14210c.mo36201n1(list);
    }

    private final void loadData() {
        HistoryListManager.f50535e.m64709b().m64704r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23410a mAudioApi_delegate$lambda$0() {
        return (InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0]);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
        InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public C23157b getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23157b c23157bM92199c = C23157b.m92199c(inflater);
        Intrinsics.m97801g(c23157bM92199c, "inflate(...)");
        return c23157bM92199c;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void initPlayer() {
        InterfaceC16633f.a.m72424b(this);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        m64505j0();
        m64503h0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        loadData();
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
    public void onCompletion(C23403e mediaSource) {
        InterfaceC16633f.a.m72427e(this, mediaSource);
        C14210c c14210c = this.mAdapter;
        if (c14210c == null) {
            Intrinsics.m97819y("mAdapter");
            c14210c = null;
        }
        int i11 = 0;
        for (Object obj : c14210c.getData()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            AudioBean audioBean = (AudioBean) obj;
            if (TextUtils.equals(mediaSource != null ? mediaSource.m92935k() : null, audioBean.getAudioUrl())) {
                audioBean.setStatus(6);
                C14210c c14210c2 = this.mAdapter;
                if (c14210c2 == null) {
                    Intrinsics.m97819y("mAdapter");
                    c14210c2 = null;
                }
                c14210c2.notifyItemChanged(i11, audioBean);
                this.previousUrl = mediaSource != null ? mediaSource.m92935k() : null;
            }
            i11 = i12;
        }
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

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        InterfaceC23410a mAudioApi = getMAudioApi();
        if (mAudioApi != null) {
            mAudioApi.removePlayerListener(this);
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayError(PlayError errorInfo, C23403e mediaSource) {
        Intrinsics.m97802h(errorInfo, "errorInfo");
        InterfaceC16633f.a.m72439q(this, errorInfo, mediaSource);
        C28951b.f88586a.m111455e(String.valueOf(errorInfo.getErrorMessage()));
        C14210c c14210c = this.mAdapter;
        if (c14210c == null) {
            Intrinsics.m97819y("mAdapter");
            c14210c = null;
        }
        int i11 = 0;
        for (Object obj : c14210c.getData()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            AudioBean audioBean = (AudioBean) obj;
            if (audioBean.getStatus() == 3) {
                audioBean.setStatus(7);
                C14210c c14210c2 = this.mAdapter;
                if (c14210c2 == null) {
                    Intrinsics.m97819y("mAdapter");
                    c14210c2 = null;
                }
                c14210c2.notifyItemChanged(i11, audioBean);
            }
            i11 = i12;
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayerRelease(C23403e c23403e) {
        InterfaceC16633f.a.m72442t(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPlayerReset() {
        InterfaceC16633f.a.m72444v(this);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onPrepare(C23403e mediaSource) {
        InterfaceC16633f.a.m72445w(this, mediaSource);
        if (TextUtils.equals(this.previousUrl, mediaSource != null ? mediaSource.m92935k() : null)) {
            return;
        }
        C14210c c14210c = this.mAdapter;
        if (c14210c == null) {
            Intrinsics.m97819y("mAdapter");
            c14210c = null;
        }
        int i11 = 0;
        for (Object obj : c14210c.getData()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            AudioBean audioBean = (AudioBean) obj;
            if (TextUtils.equals(this.previousUrl, audioBean.getAudioUrl())) {
                audioBean.setStatus(4);
                C14210c c14210c2 = this.mAdapter;
                if (c14210c2 == null) {
                    Intrinsics.m97819y("mAdapter");
                    c14210c2 = null;
                }
                c14210c2.notifyItemChanged(i11, audioBean);
                this.previousUrl = mediaSource != null ? mediaSource.m92935k() : null;
            }
            i11 = i12;
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onProgress(long progress, C23403e mediaSource) {
        InterfaceC16633f.a.m72447y(this, progress, mediaSource);
        C14210c c14210c = this.mAdapter;
        if (c14210c == null) {
            Intrinsics.m97819y("mAdapter");
            c14210c = null;
        }
        int i11 = 0;
        for (Object obj : c14210c.getData()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            AudioBean audioBean = (AudioBean) obj;
            if (TextUtils.isEmpty(this.previousUrl)) {
                this.previousUrl = mediaSource != null ? mediaSource.m92935k() : null;
            }
            if (!TextUtils.equals(this.previousUrl, mediaSource != null ? mediaSource.m92935k() : null) && TextUtils.equals(this.previousUrl, audioBean.getAudioUrl())) {
                audioBean.setStatus(4);
                C14210c c14210c2 = this.mAdapter;
                if (c14210c2 == null) {
                    Intrinsics.m97819y("mAdapter");
                    c14210c2 = null;
                }
                c14210c2.notifyItemChanged(i11, audioBean);
                this.previousUrl = mediaSource != null ? mediaSource.m92935k() : null;
            }
            if (TextUtils.equals(mediaSource != null ? mediaSource.m92935k() : null, audioBean.getAudioUrl()) && !this.mIsStop.get()) {
                audioBean.setReadProcess(Long.valueOf(progress));
                audioBean.setStatus(3);
                C14210c c14210c3 = this.mAdapter;
                if (c14210c3 == null) {
                    Intrinsics.m97819y("mAdapter");
                    c14210c3 = null;
                }
                c14210c3.notifyItemChanged(i11, audioBean);
            }
            i11 = i12;
        }
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onRenderFirstFrame() {
        InterfaceC16633f.a.m72412A(this);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        InterfaceC23410a mAudioApi = getMAudioApi();
        if (mAudioApi != null) {
            mAudioApi.addPlayerListener(this);
        }
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
    public void onVideoPause(C23403e c23403e) {
        InterfaceC16633f.a.m72417F(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int i11, int i12) {
        InterfaceC16633f.a.m72419H(this, i11, i12);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e c23403e) {
        InterfaceC16633f.a.m72420I(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void setOnSeekCompleteListener() {
        InterfaceC16633f.a.m72422K(this);
    }
}
