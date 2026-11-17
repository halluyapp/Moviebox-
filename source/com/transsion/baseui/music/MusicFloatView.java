package com.transsion.baseui.music;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.app.NotificationCompat;
import androidx.p1004lifecycle.AbstractC3192e;
import androidx.p1004lifecycle.InterfaceC3194f;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.Lifecycle;
import ck.AbstractC5114k;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.therouter.TheRouter;
import com.transsion.baseui.R$anim;
import com.transsion.baseui.R$drawable;
import com.transsion.baseui.R$layout;
import com.transsion.baseui.activity.BaseMusicFloatActivity;
import com.transsion.baseui.util.AbstractC14558d;
import com.transsion.player.mediasession.C16624h;
import com.transsion.player.mediasession.C16625i;
import com.transsion.player.mediasession.MediaItem;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import dk.C22993f;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import org.mvel2.ast.ASTNode;
import p462hj.C23860f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\u0011R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00109\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, m97100d2 = {"Lcom/transsion/baseui/music/MusicFloatView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "res", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getClassTag", "()Ljava/lang/String;", "", "l", "()V", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/player/mediasession/MediaItem;", "mediaItem", "t", "(Lcom/transsion/player/mediasession/MediaItem;)V", "w", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "z", "(Landroid/view/View;)V", "y", "", "isExpand", "setExpand", "(Z)V", ToolBar.REFRESH, "Ldk/f;", "a", "Ldk/f;", "binding", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "lastCoverUrl", "Ljava/lang/Runnable;", "c", "Ljava/lang/Runnable;", "refreshTimedTask", "Landroid/os/Handler;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkotlin/Lazy;", "getMHandler", "()Landroid/os/Handler;", "mHandler", "", "e", "J", NotificationCompat.CATEGORY_PROGRESS, "f", "I", "count", "BaseUI_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class MusicFloatView extends FrameLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C22993f binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String lastCoverUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Runnable refreshTimedTask;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy mHandler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long progress;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int count;

    /* JADX INFO: renamed from: com.transsion.baseui.music.MusicFloatView$a */
    public static final class C14537a implements InterfaceC3194f {
        C14537a() {
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public /* synthetic */ void onCreate(InterfaceC3224u interfaceC3224u) {
            AbstractC3192e.m14896a(this, interfaceC3224u);
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public void onDestroy(InterfaceC3224u owner) {
            Intrinsics.m97802h(owner, "owner");
            AbstractC3192e.m14897b(this, owner);
            owner.getLifecycle().mo14835d(this);
            MusicFloatView.this.getMHandler().removeCallbacksAndMessages(null);
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public void onPause(InterfaceC3224u owner) {
            Intrinsics.m97802h(owner, "owner");
            AbstractC3192e.m14898c(this, owner);
            MusicFloatView.this.getMHandler().removeCallbacks(MusicFloatView.this.refreshTimedTask);
        }

        @Override // androidx.p1004lifecycle.InterfaceC3194f
        public void onResume(InterfaceC3224u owner) {
            Intrinsics.m97802h(owner, "owner");
            AbstractC3192e.m14899d(this, owner);
            MusicFloatView.this.refresh();
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

    /* JADX INFO: renamed from: com.transsion.baseui.music.MusicFloatView$b */
    public static final class AnimationAnimationListenerC14538b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f51067a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ MusicFloatView f51068b;

        AnimationAnimationListenerC14538b(View view, MusicFloatView musicFloatView) {
            this.f51067a = view;
            this.f51068b = musicFloatView;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f51067a.setVisibility(8);
            RoundedCornerLayout roundFold = this.f51068b.binding.f70206h;
            Intrinsics.m97801g(roundFold, "roundFold");
            AbstractC26006c.m102058k(roundFold);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.baseui.music.MusicFloatView$c */
    public static final class AnimationAnimationListenerC14539c implements Animation.AnimationListener {
        AnimationAnimationListenerC14539c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicFloatView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicFloatView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicFloatView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.lastCoverUrl = "";
        this.refreshTimedTask = new Runnable() { // from class: com.transsion.baseui.music.d
            @Override // java.lang.Runnable
            public final void run() {
                MusicFloatView.m65620v(this.f51078a);
            }
        };
        this.mHandler = LazyKt.m97097b(new Function0() { // from class: com.transsion.baseui.music.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MusicFloatView.m65619u();
            }
        });
        C22993f c22993fM91572a = C22993f.m91572a(LayoutInflater.from(getContext()).inflate(R$layout.music_float_layout, (ViewGroup) this, true));
        Intrinsics.m97801g(c22993fM91572a, "bind(...)");
        this.binding = c22993fM91572a;
        setExpand(MusicFloatManager.f51050h.m65598b().m65593v());
        m65610l();
        m65609k();
        m65621w();
    }

    private final String getClassTag() {
        String simpleName = MusicFloatView.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler getMHandler() {
        return (Handler) this.mHandler.getValue();
    }

    /* JADX INFO: renamed from: k */
    private final void m65609k() {
        Lifecycle lifecycle;
        Context context = getContext();
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity == null || (lifecycle = appCompatActivity.getLifecycle()) == null) {
            return;
        }
        lifecycle.mo14832a(new C14537a());
    }

    /* JADX INFO: renamed from: l */
    private final void m65610l() {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        RoundedCornerLayout roundedCornerLayout;
        this.binding.f70206h.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.baseui.music.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicFloatView.m65611m(this.f51079a, view);
            }
        });
        C22993f c22993f = this.binding;
        if (c22993f != null && (roundedCornerLayout = c22993f.f70205g) != null) {
            roundedCornerLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.baseui.music.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MusicFloatView.m65612n(view);
                }
            });
        }
        C22993f c22993f2 = this.binding;
        if (c22993f2 != null && (appCompatImageView2 = c22993f2.f70200b) != null) {
            appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.baseui.music.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MusicFloatView.m65613o(this.f51080a, view);
                }
            });
        }
        C22993f c22993f3 = this.binding;
        if (c22993f3 == null || (appCompatImageView = c22993f3.f70203e) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.baseui.music.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicFloatView.m65615q(this.f51081a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m65611m(MusicFloatView musicFloatView, View view) {
        musicFloatView.setExpand(true);
        musicFloatView.m65621w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m65612n(View view) {
        Intent clickIntent;
        MediaItem mediaItemM65588q = MusicFloatManager.f51050h.m65598b().m65588q();
        if (mediaItemM65588q == null || (clickIntent = mediaItemM65588q.getClickIntent()) == null) {
            return;
        }
        clickIntent.addFlags(ASTNode.DEOP);
        String stringExtra = clickIntent.getStringExtra("path");
        String stringExtra2 = clickIntent.getStringExtra("id");
        String stringExtra3 = clickIntent.getStringExtra("resource_id");
        String stringExtra4 = clickIntent.getStringExtra("collection_id");
        String stringExtra5 = clickIntent.getStringExtra("extra_local_path");
        boolean booleanExtra = clickIntent.getBooleanExtra("isMusicLikedFragment", false);
        Log.e("m_d_log", "initListener -->  path = " + stringExtra + " -- id = " + stringExtra2 + " -- isMusicLikedFragment = " + booleanExtra);
        AbstractC5114k.m23933p(TheRouter.m61773c(stringExtra).m61857K("id", stringExtra2).m61872z("is_music_liked_fragment", booleanExtra).m61857K("resource_id", stringExtra3).m61857K("extra_local_path", stringExtra5).m61857K("collection_id", stringExtra4).m61872z("isMusicFloatViewClick", true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m65613o(final MusicFloatView musicFloatView, View view) {
        MusicFloatManager.C14535a c14535a = MusicFloatManager.f51050h;
        InterfaceC16634g interfaceC16634gM65590s = c14535a.m65598b().m65590s();
        if (interfaceC16634gM65590s != null) {
            interfaceC16634gM65590s.pause();
        }
        c14535a.m65598b().m65582B(null);
        musicFloatView.setVisibility(8);
        musicFloatView.lastCoverUrl = "";
        musicFloatView.post(new Runnable() { // from class: com.transsion.baseui.music.l
            @Override // java.lang.Runnable
            public final void run() {
                MusicFloatView.m65614p(this.f51084a);
            }
        });
        C16624h.f55898a.m72387p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m65614p(MusicFloatView musicFloatView) {
        Context context = musicFloatView.getContext();
        BaseMusicFloatActivity baseMusicFloatActivity = context instanceof BaseMusicFloatActivity ? (BaseMusicFloatActivity) context : null;
        if (baseMusicFloatActivity != null) {
            baseMusicFloatActivity.onCloseMusicFloating();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m65615q(final MusicFloatView musicFloatView, View view) {
        AbstractC14558d.m65673b(0L, new Function0() { // from class: com.transsion.baseui.music.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MusicFloatView.m65616r(this.f51083a);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Unit m65616r(final MusicFloatView musicFloatView) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        musicFloatView.m65621w();
        InterfaceC16634g interfaceC16634gM65590s = MusicFloatManager.f51050h.m65598b().m65590s();
        if (interfaceC16634gM65590s == null || !interfaceC16634gM65590s.isPlaying()) {
            C22993f c22993f = musicFloatView.binding;
            if (c22993f != null && (appCompatImageView = c22993f.f70203e) != null) {
                appCompatImageView.setImageResource(R$drawable.music_float_play);
            }
            if (interfaceC16634gM65590s != null && interfaceC16634gM65590s.isComplete()) {
                interfaceC16634gM65590s.seekTo(0L);
            }
            if (interfaceC16634gM65590s != null) {
                interfaceC16634gM65590s.play();
            }
        } else {
            C22993f c22993f2 = musicFloatView.binding;
            if (c22993f2 != null && (appCompatImageView2 = c22993f2.f70203e) != null) {
                appCompatImageView2.setImageResource(R$drawable.music_float_pause);
            }
            interfaceC16634gM65590s.pause();
        }
        musicFloatView.postDelayed(new Runnable() { // from class: com.transsion.baseui.music.m
            @Override // java.lang.Runnable
            public final void run() {
                MusicFloatView.m65617s(this.f51085a);
            }
        }, 200L);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m65617s(MusicFloatView musicFloatView) {
        musicFloatView.refresh();
    }

    /* JADX INFO: renamed from: t */
    private final void m65618t(MediaItem mediaItem) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        C22993f c22993f;
        AppCompatTextView appCompatTextView;
        Long position = mediaItem.getPosition();
        long jLongValue = position != null ? position.longValue() : 0L;
        if (jLongValue != this.progress) {
            this.progress = jLongValue;
            this.count = 0;
        } else {
            this.count++;
        }
        if (!TextUtils.isEmpty(mediaItem.getTitle()) && (c22993f = this.binding) != null && (appCompatTextView = c22993f.f70208j) != null) {
            appCompatTextView.setText(mediaItem.getTitle());
        }
        Long duration = mediaItem.getDuration();
        long jLongValue2 = duration != null ? duration.longValue() : 0L;
        Long position2 = mediaItem.getPosition();
        long jLongValue3 = position2 != null ? position2.longValue() : 0L;
        if (jLongValue2 > 0) {
            this.binding.f70204f.setProgress((int) ((jLongValue3 * 10000.0f) / jLongValue2));
        }
        if (!TextUtils.equals(this.lastCoverUrl, mediaItem.getCoverUrl())) {
            this.lastCoverUrl = mediaItem.getCoverUrl();
            AppCompatImageView appCompatImageView3 = this.binding.f70201c;
            C23860f.a aVar = C23860f.f72909a;
            Context context = getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context);
            String coverUrl = mediaItem.getCoverUrl();
            if (coverUrl == null) {
                coverUrl = "";
            }
            C23860f.b bVarM94474m = bVarM94457m.m94468g(coverUrl).m94474m(AbstractC5776a0.m27313a(44.0f));
            Intrinsics.m97799e(appCompatImageView3);
            bVarM94474m.m94465d(appCompatImageView3);
        }
        InterfaceC16634g interfaceC16634gM65590s = MusicFloatManager.f51050h.m65598b().m65590s();
        if (interfaceC16634gM65590s == null || !interfaceC16634gM65590s.isPlaying()) {
            C22993f c22993f2 = this.binding;
            if (c22993f2 != null && (appCompatImageView = c22993f2.f70203e) != null) {
                appCompatImageView.setImageResource(R$drawable.music_float_pause);
            }
        } else {
            C22993f c22993f3 = this.binding;
            if (c22993f3 != null && (appCompatImageView2 = c22993f3.f70203e) != null) {
                appCompatImageView2.setImageResource(R$drawable.music_float_play);
            }
        }
        getMHandler().removeCallbacks(this.refreshTimedTask);
        getMHandler().postDelayed(this.refreshTimedTask, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final Handler m65619u() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m65620v(MusicFloatView musicFloatView) {
        musicFloatView.refresh();
    }

    /* JADX INFO: renamed from: w */
    private final void m65621w() {
        getMHandler().removeCallbacksAndMessages(null);
        getMHandler().postDelayed(new Runnable() { // from class: com.transsion.baseui.music.j
            @Override // java.lang.Runnable
            public final void run() {
                MusicFloatView.m65622x(this.f51082a);
            }
        }, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m65622x(MusicFloatView musicFloatView) {
        musicFloatView.setExpand(false);
    }

    /* JADX INFO: renamed from: y */
    private final void m65623y(View view) {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R$anim.music_slide_left);
        animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC14538b(view, this));
        view.startAnimation(animationLoadAnimation);
    }

    /* JADX INFO: renamed from: z */
    private final void m65624z(View view) {
        view.setVisibility(0);
        RoundedCornerLayout roundFold = this.binding.f70206h;
        Intrinsics.m97801g(roundFold, "roundFold");
        AbstractC26006c.m102054g(roundFold);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), R$anim.music_slide_right);
        animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC14539c());
        view.startAnimation(animationLoadAnimation);
    }

    public final void refresh() {
        MediaItem mediaItemM65588q = MusicFloatManager.f51050h.m65598b().m65588q();
        if (mediaItemM65588q == null) {
            C16625i.f55907a.m72389a(getClassTag() + " --> refresh() --> musicFloatBean == null --> 没有数据不展示UI");
            setVisibility(8);
            return;
        }
        if (!Intrinsics.m97797c(mediaItemM65588q.isMusic(), Boolean.FALSE)) {
            mediaItemM65588q.setPageName("music_float");
            setVisibility(0);
            m65618t(mediaItemM65588q);
            return;
        }
        C16625i.f55907a.m72389a(getClassTag() + " --> refresh() --> musicFloatBean.isMusic == false --> 当前不是Music类型，不展示悬浮窗");
        setVisibility(8);
    }

    public final void setExpand(boolean isExpand) {
        MusicFloatManager.f51050h.m65598b().m65581A(isExpand);
        if (isExpand) {
            RoundedCornerLayout roundExpand = this.binding.f70205g;
            Intrinsics.m97801g(roundExpand, "roundExpand");
            m65624z(roundExpand);
        } else {
            RoundedCornerLayout roundExpand2 = this.binding.f70205g;
            Intrinsics.m97801g(roundExpand2, "roundExpand");
            m65623y(roundExpand2);
        }
    }
}
