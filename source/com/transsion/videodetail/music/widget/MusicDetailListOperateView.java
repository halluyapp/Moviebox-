package com.transsion.videodetail.music.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.FragmentManager;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.widget.R$color;
import com.transsion.player.orplayer.InterfaceC16633f;
import com.transsion.player.orplayer.PlayError;
import com.transsion.player.orplayer.global.TnPlayerType;
import com.transsion.videodetail.R$drawable;
import com.transsion.videodetail.music.bean.MusicStateEnum;
import com.transsion.videodetail.music.p322ui.MusicDetailLikedFragment;
import com.transsion.videodetail.music.widget.MusicDetailListOperateView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fo.C23403e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.C25917a;
import mx.C25919c;
import p586lx.C25758k;
import p683po.C26906c;
import p683po.C26907d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ)\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b\"\u0010!J\u0019\u0010#\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b#\u0010!Jm\u0010*\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\b\u0010$\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192:\u0010)\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\u001b\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\f0%¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104RL\u00108\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\u001b\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\f\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, m97100d2 = {"Lcom/transsion/videodetail/music/widget/MusicDetailListOperateView;", "Landroid/widget/FrameLayout;", "Lcom/transsion/player/orplayer/f;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getClassTag", "()Ljava/lang/String;", "", "i", "()V", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "", "isPlaying", "m", "(Z)V", "l", "j", CampaignEx.JSON_KEY_AD_K, "Landroidx/fragment/app/FragmentManager;", "childFragmentManager", "", "flMusicContainer", "subjectId", "g", "(Landroidx/fragment/app/FragmentManager;ILjava/lang/String;)V", "Lfo/e;", "mediaSource", "onVideoPause", "(Lfo/e;)V", "onVideoStart", "onCompletion", "musicContainer", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "path", "onItemCLick", "setContainer", "(Ljava/lang/String;Landroid/widget/FrameLayout;Landroidx/fragment/app/FragmentManager;ILkotlin/jvm/functions/Function2;)V", "Lcom/transsion/videodetail/music/bean/MusicStateEnum;", "state", "setState", "(Lcom/transsion/videodetail/music/bean/MusicStateEnum;)V", "Lcom/transsion/videodetail/music/ui/MusicDetailLikedFragment;", "getMusicDetailLikedFragment", "()Lcom/transsion/videodetail/music/ui/MusicDetailLikedFragment;", "a", "Lcom/transsion/videodetail/music/ui/MusicDetailLikedFragment;", "mMusicDetailLikedFragment", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/jvm/functions/Function2;", "mOnItemCLick", "Llx/k;", "c", "Llx/k;", "bind", "Landroid/widget/FrameLayout;", "mMusicContainer", "e", "Lcom/transsion/videodetail/music/bean/MusicStateEnum;", "currentMicState", "VideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class MusicDetailListOperateView extends FrameLayout implements InterfaceC16633f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private MusicDetailLikedFragment mMusicDetailLikedFragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Function2 mOnItemCLick;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C25758k bind;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private FrameLayout mMusicContainer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private MusicStateEnum currentMicState;

    /* JADX INFO: renamed from: com.transsion.videodetail.music.widget.MusicDetailListOperateView$a */
    public /* synthetic */ class C21062a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65931a;

        static {
            int[] iArr = new int[MusicStateEnum.values().length];
            try {
                iArr[MusicStateEnum.CLOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicStateEnum.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MusicStateEnum.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f65931a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public MusicDetailListOperateView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MusicDetailListOperateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.m97802h(context, "context");
        MusicStateEnum musicStateEnum = MusicStateEnum.CLOSE;
        this.currentMicState = musicStateEnum;
        C25758k c25758kM101302c = C25758k.m101302c(LayoutInflater.from(context), this, false);
        this.bind = c25758kM101302c;
        addView(c25758kM101302c != null ? c25758kM101302c.getRoot() : null);
        setState(musicStateEnum);
        m86471i();
        m86466d();
    }

    public /* synthetic */ MusicDetailListOperateView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: d */
    private final void m86466d() {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        C25758k c25758k = this.bind;
        if (c25758k != null && (appCompatImageView2 = c25758k.f78594b) != null) {
            appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: ox.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MusicDetailListOperateView.m86467e(this.f81205a, view);
                }
            });
        }
        C25758k c25758k2 = this.bind;
        if (c25758k2 == null || (appCompatImageView = c25758k2.f78596d) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: ox.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicDetailListOperateView.m86468f(this.f81206a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m86467e(MusicDetailListOperateView musicDetailListOperateView, View view) {
        MusicStateEnum musicStateEnum = musicDetailListOperateView.currentMicState;
        int i11 = musicStateEnum == null ? -1 : C21062a.f65931a[musicStateEnum.ordinal()];
        if (i11 == 1) {
            musicDetailListOperateView.m86473k();
            musicDetailListOperateView.currentMicState = MusicStateEnum.OPEN;
        } else {
            if (i11 != 2) {
                return;
            }
            musicDetailListOperateView.currentMicState = MusicStateEnum.CLOSE;
            musicDetailListOperateView.m86472j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m86468f(MusicDetailListOperateView musicDetailListOperateView, View view) {
        C25919c.f79144a.m101742c();
        musicDetailListOperateView.m86474l();
    }

    /* JADX INFO: renamed from: g */
    private final void m86469g(FragmentManager childFragmentManager, int flMusicContainer, String subjectId) {
        MusicDetailLikedFragment musicDetailLikedFragment = new MusicDetailLikedFragment();
        musicDetailLikedFragment.m86406P0(this);
        musicDetailLikedFragment.m86404N0(this.mOnItemCLick);
        musicDetailLikedFragment.m86405O0(subjectId, new Function2() { // from class: ox.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MusicDetailListOperateView.m86470h(this.f81207a, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        });
        this.mMusicDetailLikedFragment = musicDetailLikedFragment;
        childFragmentManager.m14557p().m14805b(flMusicContainer, musicDetailLikedFragment).mo14670i();
    }

    private final String getClassTag() {
        String simpleName = MusicDetailListOperateView.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Unit m86470h(MusicDetailListOperateView musicDetailListOperateView, int i11, int i12) {
        String str;
        AppCompatTextView appCompatTextView;
        if (i12 == 0) {
            str = "Now playing";
        } else {
            str = "Now playing " + i11 + "/" + i12;
        }
        C25758k c25758k = musicDetailListOperateView.bind;
        if (c25758k != null && (appCompatTextView = c25758k.f78598f) != null) {
            appCompatTextView.setText(str);
        }
        musicDetailListOperateView.m86475m(true);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: i */
    private final void m86471i() {
        AppCompatImageView appCompatImageView;
        C25758k c25758k = this.bind;
        if (c25758k != null && (appCompatImageView = c25758k.f78595c) != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                appCompatImageView.setImageResource(R$drawable.video_detail_ic_playing);
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }
        m86475m(true);
        m86474l();
    }

    /* JADX INFO: renamed from: j */
    private final void m86472j() {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        AppCompatImageView appCompatImageView4;
        C25758k c25758k = this.bind;
        if (c25758k != null && (appCompatImageView4 = c25758k.f78594b) != null) {
            appCompatImageView4.setImageResource(R$drawable.music_iv_right);
        }
        C25758k c25758k2 = this.bind;
        if (c25758k2 != null && (appCompatImageView3 = c25758k2.f78597e) != null) {
            appCompatImageView3.setVisibility(8);
        }
        C25758k c25758k3 = this.bind;
        if (c25758k3 != null && (appCompatImageView2 = c25758k3.f78596d) != null) {
            appCompatImageView2.setVisibility(8);
        }
        C25758k c25758k4 = this.bind;
        if (c25758k4 != null && (appCompatImageView = c25758k4.f78595c) != null) {
            appCompatImageView.setVisibility(0);
        }
        FrameLayout frameLayout = this.mMusicContainer;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m86473k() {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        C25758k c25758k = this.bind;
        if (c25758k != null && (appCompatImageView3 = c25758k.f78594b) != null) {
            appCompatImageView3.setImageResource(R$drawable.music_iv_close);
        }
        C25758k c25758k2 = this.bind;
        if (c25758k2 != null && (appCompatImageView2 = c25758k2.f78595c) != null) {
            appCompatImageView2.setVisibility(8);
        }
        FrameLayout frameLayout = this.mMusicContainer;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        C25758k c25758k3 = this.bind;
        if (c25758k3 == null || (appCompatImageView = c25758k3.f78596d) == null) {
            return;
        }
        appCompatImageView.setVisibility(0);
    }

    /* JADX INFO: renamed from: l */
    private final void m86474l() {
        AppCompatImageView appCompatImageView;
        C25758k c25758k = this.bind;
        if (c25758k != null && (appCompatImageView = c25758k.f78596d) != null) {
            C25919c c25919c = C25919c.f79144a;
            appCompatImageView.setImageDrawable(c25919c.m101740a(c25919c.m101741b()));
        }
        C25917a.f79141a.m101735a(getClassTag() + " --> showLoopIcon() --> 当前播放模式是 = " + C25919c.f79144a.m101741b());
    }

    /* JADX INFO: renamed from: m */
    private final void m86475m(boolean isPlaying) {
        AppCompatImageView appCompatImageView;
        C25758k c25758k = this.bind;
        if (c25758k == null || (appCompatImageView = c25758k.f78595c) == null) {
            return;
        }
        appCompatImageView.setColorFilter(isPlaying ? new PorterDuffColorFilter(AbstractC2397b.getColor(appCompatImageView.getContext(), R$color.brand), PorterDuff.Mode.SRC_ATOP) : new PorterDuffColorFilter(AbstractC2397b.getColor(appCompatImageView.getContext(), R$color.line_02), PorterDuff.Mode.SRC_ATOP));
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void canNonSubscriberPlay(boolean z11, int i11, int i12, C26907d c26907d) {
        InterfaceC16633f.a.m72423a(this, z11, i11, i12, c26907d);
    }

    /* JADX INFO: renamed from: getMusicDetailLikedFragment, reason: from getter */
    public final MusicDetailLikedFragment getMMusicDetailLikedFragment() {
        return this.mMusicDetailLikedFragment;
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void initPlayer() {
        InterfaceC16633f.a.m72424b(this);
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
        m86475m(false);
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

    public void onPlayErrorChangePayer(TnPlayerType tnPlayerType, C23403e c23403e) {
        InterfaceC16633f.a.m72441s(this, tnPlayerType, c23403e);
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
    public void onPrepare(C23403e c23403e) {
        InterfaceC16633f.a.m72445w(this, c23403e);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onProgress(long j11, C23403e c23403e) {
        InterfaceC16633f.a.m72447y(this, j11, c23403e);
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
        m86475m(false);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoSizeChanged(int i11, int i12) {
        InterfaceC16633f.a.m72419H(this, i11, i12);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void onVideoStart(C23403e mediaSource) {
        InterfaceC16633f.a.m72420I(this, mediaSource);
        m86475m(true);
    }

    public final void setContainer(String subjectId, FrameLayout musicContainer, FragmentManager childFragmentManager, int flMusicContainer, Function2<? super String, ? super String, Unit> onItemCLick) {
        Intrinsics.m97802h(childFragmentManager, "childFragmentManager");
        Intrinsics.m97802h(onItemCLick, "onItemCLick");
        this.mMusicContainer = musicContainer;
        this.mOnItemCLick = onItemCLick;
        m86469g(childFragmentManager, flMusicContainer, subjectId);
    }

    @Override // com.transsion.player.orplayer.InterfaceC16633f
    public void setOnSeekCompleteListener() {
        InterfaceC16633f.a.m72422K(this);
    }

    public final void setState(MusicStateEnum state) {
        Intrinsics.m97802h(state, "state");
        this.currentMicState = state;
        int i11 = C21062a.f65931a[state.ordinal()];
        if (i11 == 1) {
            m86472j();
        } else if (i11 == 2) {
            m86473k();
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            setVisibility(8);
        }
    }
}
