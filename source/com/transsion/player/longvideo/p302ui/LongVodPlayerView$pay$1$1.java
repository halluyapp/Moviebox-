package com.transsion.player.longvideo.p302ui;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.LifecycleCoroutineScope;
import com.transsion.payment.lib.C16386f;
import com.transsion.payment.lib.InterfaceC16364b;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25207u0;
import kotlinx.coroutines.InterfaceC25149n0;
import p553ko.C24716b;
import p710qk.C27089h;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.player.longvideo.ui.LongVodPlayerView$pay$1$1", m97637f = "LongVodPlayerView.kt", m97638l = {3471}, m97639m = "invokeSuspend")
final class LongVodPlayerView$pay$1$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C24716b $config;
    final /* synthetic */ AppCompatActivity $it;
    final /* synthetic */ String $skuId;
    int label;
    final /* synthetic */ LongVodPlayerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LongVodPlayerView$pay$1$1(LongVodPlayerView longVodPlayerView, AppCompatActivity appCompatActivity, String str, C24716b c24716b, Continuation<? super LongVodPlayerView$pay$1$1> continuation) {
        super(2, continuation);
        this.this$0 = longVodPlayerView;
        this.$it = appCompatActivity;
        this.$skuId = str;
        this.$config = c24716b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LongVodPlayerView$pay$1$1(this.this$0, this.$it, this.$skuId, this.$config, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LongVodPlayerView$pay$1$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            LongVodPlayerView.backClick$default(this.this$0, false, false, 3, null);
            this.label = 1;
            if (AbstractC25207u0.m99223a(300L, this) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("activity", "lottery");
        C16386f c16386fM71513a = C16386f.f55336b.m71513a();
        final AppCompatActivity appCompatActivity = this.$it;
        final String str = this.$skuId;
        String str2 = str == null ? "" : str;
        final LongVodPlayerView longVodPlayerView = this.this$0;
        final C24716b c24716b = this.$config;
        c16386fM71513a.m71511e(appCompatActivity, str2, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? false : false, (8 & 16) != 0 ? null : linkedHashMap, new InterfaceC16364b() { // from class: com.transsion.player.longvideo.ui.LongVodPlayerView$pay$1$1.1
            @Override // com.transsion.payment.lib.InterfaceC16364b
            /* JADX INFO: renamed from: a */
            public void mo66214a(Integer num, String str3, boolean z11, String str4) {
            }

            @Override // com.transsion.payment.lib.InterfaceC16364b
            /* JADX INFO: renamed from: b */
            public void mo66215b(boolean z11) {
            }

            @Override // com.transsion.payment.lib.InterfaceC16364b
            /* JADX INFO: renamed from: c */
            public void mo66216c(int i12, String balance, String str3) {
                LifecycleCoroutineScope lifecycleCoroutineScopeM14968a;
                Intrinsics.m97802h(balance, "balance");
                longVodPlayerView.m71946B0();
                longVodPlayerView.getConfigViewModel().m72330c(c24716b);
                AbstractC25136k.m99058d(AbstractC3226v.m14968a(appCompatActivity), null, null, new LongVodPlayerView$pay$1$1$1$success$1(longVodPlayerView, null), 3, null);
                C27089h.f82174a.m105449a(longVodPlayerView.getClassTag() + " --> success() --> 支付成功，切换分辨率 --> skuId = " + str + " -- config = " + c24716b);
                Context context = longVodPlayerView.getContext();
                AppCompatActivity appCompatActivity2 = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                if (appCompatActivity2 == null || (lifecycleCoroutineScopeM14968a = AbstractC3226v.m14968a(appCompatActivity2)) == null) {
                    return;
                }
                AbstractC25136k.m99058d(lifecycleCoroutineScopeM14968a, null, null, new LongVodPlayerView$pay$1$1$1$success$2(str3, null), 3, null);
            }
        });
        return Unit.f75682a;
    }
}
