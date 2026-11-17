package com.transsion.shorttv_pugc.p317ui.fragment.download;

import androidx.appcompat.widget.AppCompatTextView;
import com.blankj.utilcode.util.Utils;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv_pugc.bean.ShortTvInnerPlayBean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import rs.C27334d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv_pugc.ui.fragment.download.ShortTVDownloadReFragment$initHistory$1$1$1", m97637f = "ShortTVDownloadReFragment.kt", m97638l = {}, m97639m = "invokeSuspend")
final class ShortTVDownloadReFragment$initHistory$1$1$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ShortTvInnerPlayBean $history;
    int label;
    final /* synthetic */ ShortTVDownloadReFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTVDownloadReFragment$initHistory$1$1$1(ShortTVDownloadReFragment shortTVDownloadReFragment, ShortTvInnerPlayBean shortTvInnerPlayBean, Continuation<? super ShortTVDownloadReFragment$initHistory$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = shortTVDownloadReFragment;
        this.$history = shortTvInnerPlayBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTVDownloadReFragment$initHistory$1$1$1(this.this$0, this.$history, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTVDownloadReFragment$initHistory$1$1$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AppCompatTextView appCompatTextView;
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        C27334d c27334d = (C27334d) this.this$0.getMViewBinding();
        if (c27334d != null && (appCompatTextView = c27334d.f83131z) != null) {
            appCompatTextView.setText(this.$history != null ? Utils.m27275a().getString(R$string.short_tv_continue_watch) : Utils.m27275a().getString(R$string.short_tv_play));
        }
        return Unit.f75682a;
    }
}
