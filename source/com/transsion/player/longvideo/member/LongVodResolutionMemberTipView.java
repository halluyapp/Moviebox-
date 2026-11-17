package com.transsion.player.longvideo.member;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.LifecycleCoroutineScope;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.transsion.p285ad.strategy.C14075t;
import com.transsion.player.longvideo.R$id;
import com.transsion.player.longvideo.R$layout;
import com.transsion.player.longvideo.R$string;
import com.transsion.player.longvideo.p302ui.LongVodPlayerView;
import com.transsion.push.PushConstants;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25149n0;
import p352dn.InterfaceC22998b;
import p550kj.C24662i;
import p553ko.C24715a;
import p553ko.C24716b;
import p710qk.C27089h;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\f¢\u0006\u0004\b \u0010\u000eJ\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\u000eR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, m97100d2 = {"Lcom/transsion/player/longvideo/member/LongVodResolutionMemberTipView;", "Landroid/widget/FrameLayout;", "Lcom/transsion/ad/strategy/t$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getClassTag", "()Ljava/lang/String;", "", "e", "()V", "", "isVisible", "onVisibilityChanged", "(Z)V", "Landroid/view/View;", "getVisibilityView", "()Landroid/view/View;", "hasAtLeast720P", "Lko/a;", "curBean", "pageName", "Lcom/transsion/player/longvideo/ui/LongVodPlayerView;", "longVodPlayerView", "", "target", "showResolutionTip", "(ZLko/a;Ljava/lang/String;Lcom/transsion/player/longvideo/ui/LongVodPlayerView;Ljava/lang/Integer;)V", PushConstants.PROVIDER_FIELD_DESTROY, "onShowComplete", "a", "Lcom/transsion/player/longvideo/ui/LongVodPlayerView;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "c", "Ljava/lang/Integer;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lko/a;", "Z", "isShowing", "", "f", "J", "currentTimestep", "Landroid/os/Handler;", "g", "Landroid/os/Handler;", "handler", "LongVideo_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class LongVodResolutionMemberTipView extends FrameLayout implements C14075t.a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private LongVodPlayerView longVodPlayerView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Integer target;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C24715a curBean;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isShowing;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long currentTimestep;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Handler handler;

    /* JADX INFO: renamed from: com.transsion.player.longvideo.member.LongVodResolutionMemberTipView$onShowComplete$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.player.longvideo.member.LongVodResolutionMemberTipView$onShowComplete$1", m97637f = "LongVodResolutionMemberTipView.kt", m97638l = {Sdk$SDKError.Reason.AD_CONSUMED_VALUE}, m97639m = "invokeSuspend")
    static final class C164781 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C164781(Continuation<? super C164781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LongVodResolutionMemberTipView.this.new C164781(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C164781) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LongVodResolutionMemberTipView longVodResolutionMemberTipView;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                if (LongVodResolutionMemberTipView.this.curBean != null) {
                    LongVodResolutionMemberTipView longVodResolutionMemberTipView2 = LongVodResolutionMemberTipView.this;
                    ResolutionMemberManager resolutionMemberManager = ResolutionMemberManager.f55604a;
                    C24715a c24715a = longVodResolutionMemberTipView2.curBean;
                    this.L$0 = longVodResolutionMemberTipView2;
                    this.label = 1;
                    if (resolutionMemberManager.m71897k(c24715a, this) == objF) {
                        return objF;
                    }
                    longVodResolutionMemberTipView = longVodResolutionMemberTipView2;
                }
                return Unit.f75682a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            longVodResolutionMemberTipView = (LongVodResolutionMemberTipView) this.L$0;
            ResultKt.m97107b(obj);
            longVodResolutionMemberTipView.handler.removeCallbacksAndMessages(null);
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.player.longvideo.member.LongVodResolutionMemberTipView$showResolutionTip$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.player.longvideo.member.LongVodResolutionMemberTipView$showResolutionTip$1", m97637f = "LongVodResolutionMemberTipView.kt", m97638l = {144}, m97639m = "invokeSuspend")
    static final class C164791 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ C24715a $curBean;
        final /* synthetic */ boolean $hasAtLeast720P;
        final /* synthetic */ Integer $target;
        int label;
        final /* synthetic */ LongVodResolutionMemberTipView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C164791(C24715a c24715a, LongVodResolutionMemberTipView longVodResolutionMemberTipView, boolean z11, Integer num, Continuation<? super C164791> continuation) {
            super(2, continuation);
            this.$curBean = c24715a;
            this.this$0 = longVodResolutionMemberTipView;
            this.$hasAtLeast720P = z11;
            this.$target = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C164791(this.$curBean, this.this$0, this.$hasAtLeast720P, this.$target, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C164791) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                ResolutionMemberManager resolutionMemberManager = ResolutionMemberManager.f55604a;
                C24715a c24715a = this.$curBean;
                this.label = 1;
                obj = resolutionMemberManager.m71894g(c24715a, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                C27089h.f82174a.m105449a(this.this$0.getClassTag() + " --> showResolutionTip() --> 已出现过，不显示");
                return Unit.f75682a;
            }
            InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
            boolean zMo69863q = interfaceC22998b != null ? interfaceC22998b.mo69863q() : false;
            if (!zMo69863q && this.$hasAtLeast720P) {
                this.this$0.setVisibility(0);
                this.this$0.curBean = this.$curBean;
                C14075t.f49752a.m63714j(this.this$0);
                this.this$0.m71874e();
                C27089h.f82174a.m105449a(this.this$0.getClassTag() + " --> showResolutionTip() --> isMember = " + zMo69863q + " --> 右下角提示 --> target = " + this.$target);
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public LongVodResolutionMemberTipView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LongVodResolutionMemberTipView(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.m97802h(context, "context");
        this.handler = new Handler(Looper.getMainLooper());
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.long_vod_resolution_member_tip_layout, (ViewGroup) this, false);
        addView(viewInflate);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tvRewardTip);
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.member.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LongVodResolutionMemberTipView.m71872c(this.f55618a, context, view);
                }
            });
        }
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.ivCloseTip);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.member.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LongVodResolutionMemberTipView.m71873d(this.f55620a, view);
                }
            });
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.tvTipText);
        if (textView2 != null) {
            String string = context.getString(R$string.long_vod_switch_to_720p_1080p, C16503r.f55634a.m71934j());
            Intrinsics.m97801g(string, "getString(...)");
            textView2.setText(string);
        }
    }

    public /* synthetic */ LongVodResolutionMemberTipView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m71872c(LongVodResolutionMemberTipView longVodResolutionMemberTipView, Context context, View view) {
        LifecycleCoroutineScope lifecycleCoroutineScopeM14968a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("module_name", "go_ad_free");
        C24715a c24715a = longVodResolutionMemberTipView.curBean;
        linkedHashMap.put("subject_id", c24715a != null ? c24715a.m97059o() : null);
        C24662i c24662i = C24662i.f75350a;
        String str = longVodResolutionMemberTipView.pageName;
        if (str == null) {
            str = "vip_resolution";
        }
        c24662i.m96881p(str, linkedHashMap);
        C27089h.f82174a.m105449a(longVodResolutionMemberTipView.getClassTag() + " --> tvRewardTip.setOnClickListener{} --> target = " + longVodResolutionMemberTipView.target);
        LongVodPlayerView longVodPlayerView = longVodResolutionMemberTipView.longVodPlayerView;
        if (longVodPlayerView != null) {
            longVodPlayerView.showResolutionIntercept(new C24716b(false, String.valueOf(longVodResolutionMemberTipView.target), null, 5, null));
        }
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity == null || (lifecycleCoroutineScopeM14968a = AbstractC3226v.m14968a(appCompatActivity)) == null) {
            return;
        }
        AbstractC25136k.m99058d(lifecycleCoroutineScopeM14968a, null, null, new LongVodResolutionMemberTipView$1$1(longVodResolutionMemberTipView, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m71873d(LongVodResolutionMemberTipView longVodResolutionMemberTipView, View view) {
        longVodResolutionMemberTipView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final void m71874e() {
        this.handler.post(new Runnable() { // from class: com.transsion.player.longvideo.member.LongVodResolutionMemberTipView$startTimer$timerRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                LifecycleCoroutineScope lifecycleCoroutineScopeM14968a;
                if (this.this$0.isShowing) {
                    this.this$0.currentTimestep += (long) 100;
                }
                if (this.this$0.currentTimestep < 5000) {
                    this.this$0.handler.postDelayed(this, 100L);
                    return;
                }
                this.this$0.destroy();
                this.this$0.setVisibility(8);
                Context context = this.this$0.getContext();
                AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity == null || (lifecycleCoroutineScopeM14968a = AbstractC3226v.m14968a(appCompatActivity)) == null) {
                    return;
                }
                AbstractC25136k.m99058d(lifecycleCoroutineScopeM14968a, null, null, new LongVodResolutionMemberTipView$startTimer$timerRunnable$1$run$1(this.this$0, null), 3, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getClassTag() {
        String simpleName = LongVodResolutionMemberTipView.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public final void destroy() {
        C14075t.f49752a.m63716v(this);
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // com.transsion.p285ad.strategy.C14075t.a
    public double getVisibilityThreshold() {
        return C14075t.a.C29438a.m63719a(this);
    }

    @Override // com.transsion.p285ad.strategy.C14075t.a
    public View getVisibilityView() {
        return this;
    }

    public final void onShowComplete() {
        LifecycleCoroutineScope lifecycleCoroutineScopeM14968a;
        Context context = getContext();
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity == null || (lifecycleCoroutineScopeM14968a = AbstractC3226v.m14968a(appCompatActivity)) == null) {
            return;
        }
        AbstractC25136k.m99058d(lifecycleCoroutineScopeM14968a, null, null, new C164781(null), 3, null);
    }

    @Override // com.transsion.p285ad.strategy.C14075t.a
    public void onVisibilityChanged(boolean isVisible) {
        this.isShowing = isVisible;
    }

    public final void showResolutionTip(boolean hasAtLeast720P, C24715a curBean, String pageName, LongVodPlayerView longVodPlayerView, Integer target) {
        LifecycleCoroutineScope lifecycleCoroutineScopeM14968a;
        Intrinsics.m97802h(longVodPlayerView, "longVodPlayerView");
        if (curBean == null) {
            return;
        }
        this.pageName = pageName;
        this.longVodPlayerView = longVodPlayerView;
        this.target = target;
        Context context = getContext();
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity == null || (lifecycleCoroutineScopeM14968a = AbstractC3226v.m14968a(appCompatActivity)) == null) {
            return;
        }
        AbstractC25136k.m99058d(lifecycleCoroutineScopeM14968a, null, null, new C164791(curBean, this, hasAtLeast720P, target, null), 3, null);
    }
}
