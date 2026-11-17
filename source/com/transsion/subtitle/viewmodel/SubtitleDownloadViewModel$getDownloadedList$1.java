package com.transsion.subtitle.viewmodel;

import com.transsion.subtitle.InterfaceC19714h;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import p528ju.C24469a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel$getDownloadedList$1", m97637f = "SubtitleDownloadViewModel.kt", m97638l = {Sdk$SDKError.Reason.TPAT_ERROR_VALUE}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class SubtitleDownloadViewModel$getDownloadedList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $subtitleResId;
    int label;
    final /* synthetic */ SubtitleDownloadViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubtitleDownloadViewModel$getDownloadedList$1(String str, SubtitleDownloadViewModel subtitleDownloadViewModel, Continuation<? super SubtitleDownloadViewModel$getDownloadedList$1> continuation) {
        super(2, continuation);
        this.$subtitleResId = str;
        this.this$0 = subtitleDownloadViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubtitleDownloadViewModel$getDownloadedList$1(this.$subtitleResId, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SubtitleDownloadViewModel$getDownloadedList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC19714h interfaceC19714hM82148b = InterfaceC19714h.f62935a.m82148b();
            String str = this.$subtitleResId;
            this.label = 1;
            obj = interfaceC19714hM82148b.mo81939a(str, this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        List<C24469a> list = (List) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (C24469a c24469a : list) {
                linkedHashMap.put(c24469a.m96011b().getId(), c24469a);
            }
        }
        this.this$0.m82254m().mo14855n(linkedHashMap);
        return Unit.f75682a;
    }
}
