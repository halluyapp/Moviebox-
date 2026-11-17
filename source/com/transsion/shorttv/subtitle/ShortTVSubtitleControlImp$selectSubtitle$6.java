package com.transsion.shorttv.subtitle;

import com.transsion.shorttv.viewmodel.ShortTvViewModel;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p848vs.InterfaceC28217h;
import p955ys.C29007b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.subtitle.ShortTVSubtitleControlImp$selectSubtitle$6", m97637f = "ShortTVSubtitleControlImp.kt", m97638l = {446}, m97639m = "invokeSuspend")
final class ShortTVSubtitleControlImp$selectSubtitle$6 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C29007b $bean;
    int label;
    final /* synthetic */ ShortTVSubtitleControlImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTVSubtitleControlImp$selectSubtitle$6(C29007b c29007b, ShortTVSubtitleControlImp shortTVSubtitleControlImp, Continuation<? super ShortTVSubtitleControlImp$selectSubtitle$6> continuation) {
        super(2, continuation);
        this.$bean = c29007b;
        this.this$0 = shortTVSubtitleControlImp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTVSubtitleControlImp$selectSubtitle$6(this.$bean, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTVSubtitleControlImp$selectSubtitle$6) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SubtitleDownloadTable subtitleDownloadTableM111561a;
        String id2;
        ShortTVSubtitleControlImp shortTVSubtitleControlImp;
        ShortTvViewModel shortTvViewModel;
        InterfaceC28217h interfaceC28217hM80336A0;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            C29007b c29007b = this.$bean;
            if (c29007b != null && (subtitleDownloadTableM111561a = c29007b.m111561a()) != null && (id2 = subtitleDownloadTableM111561a.getId()) != null && (shortTvViewModel = (shortTVSubtitleControlImp = this.this$0).f60890d) != null && (interfaceC28217hM80336A0 = shortTvViewModel.m80336A0()) != null) {
                String strM104513e = shortTVSubtitleControlImp.f60891e.m104513e();
                this.label = 1;
                if (interfaceC28217hM80336A0.mo73652b(strM104513e, id2, this) == objF) {
                    return objF;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        return Unit.f75682a;
    }
}
