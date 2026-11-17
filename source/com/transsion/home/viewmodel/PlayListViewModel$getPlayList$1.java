package com.transsion.home.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import sl.InterfaceC27628b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.viewmodel.PlayListViewModel$getPlayList$1", m97637f = "PlayListViewModel.kt", m97638l = {22}, m97639m = "invokeSuspend")
final class PlayListViewModel$getPlayList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $category;
    final /* synthetic */ String $label;
    final /* synthetic */ String $recType;
    final /* synthetic */ int $tabId;
    final /* synthetic */ String $topIds;
    int label;
    final /* synthetic */ PlayListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlayListViewModel$getPlayList$1(PlayListViewModel playListViewModel, String str, String str2, String str3, String str4, int i11, Continuation<? super PlayListViewModel$getPlayList$1> continuation) {
        super(2, continuation);
        this.this$0 = playListViewModel;
        this.$label = str;
        this.$category = str2;
        this.$recType = str3;
        this.$topIds = str4;
        this.$tabId = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayListViewModel$getPlayList$1(this.this$0, this.$label, this.$category, this.$recType, this.$topIds, this.$tabId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((PlayListViewModel$getPlayList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM107474b;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC27628b interfaceC27628b = this.this$0.f53653a;
                int iM68967e = this.this$0.m68967e();
                int i12 = this.this$0.f53656d;
                String str = this.$label;
                String str2 = this.$category;
                String str3 = this.$recType;
                String str4 = this.$topIds;
                int i13 = this.$tabId;
                this.label = 1;
                objM107474b = InterfaceC27628b.a.m107474b(interfaceC27628b, null, iM68967e, i12, str, str2, str3, str4, i13, this, 1, null);
                if (objM107474b == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
                objM107474b = obj;
            }
            BaseDto baseDto = (BaseDto) objM107474b;
            if (baseDto.getData() != null) {
                this.this$0.m68969g().mo14855n(baseDto.getData());
                int iM68967e2 = this.this$0.m68967e();
                this.this$0.m68970i(iM68967e2 + 1);
                Boxing.m97634d(iM68967e2);
            } else {
                this.this$0.m68969g().mo14855n(null);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            this.this$0.m68969g().mo14855n(null);
        }
        return Unit.f75682a;
    }
}
