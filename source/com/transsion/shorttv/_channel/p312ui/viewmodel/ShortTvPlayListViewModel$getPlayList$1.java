package com.transsion.shorttv._channel.p312ui.viewmodel;

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
import sr.InterfaceC27643a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv._channel.ui.viewmodel.ShortTvPlayListViewModel$getPlayList$1", m97637f = "ShortTvPlayListViewModel.kt", m97638l = {22}, m97639m = "invokeSuspend")
final class ShortTvPlayListViewModel$getPlayList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $category;
    final /* synthetic */ String $label;
    final /* synthetic */ String $recType;
    final /* synthetic */ int $tabId;
    final /* synthetic */ String $topIds;
    int label;
    final /* synthetic */ ShortTvPlayListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvPlayListViewModel$getPlayList$1(ShortTvPlayListViewModel shortTvPlayListViewModel, String str, String str2, String str3, String str4, int i11, Continuation<? super ShortTvPlayListViewModel$getPlayList$1> continuation) {
        super(2, continuation);
        this.this$0 = shortTvPlayListViewModel;
        this.$label = str;
        this.$category = str2;
        this.$recType = str3;
        this.$topIds = str4;
        this.$tabId = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTvPlayListViewModel$getPlayList$1(this.this$0, this.$label, this.$category, this.$recType, this.$topIds, this.$tabId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvPlayListViewModel$getPlayList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM107537a;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC27643a interfaceC27643a = this.this$0.f60467a;
                int iM78853e = this.this$0.m78853e();
                int i12 = this.this$0.f60470d;
                String str = this.$label;
                String str2 = this.$category;
                String str3 = this.$recType;
                String str4 = this.$topIds;
                int i13 = this.$tabId;
                this.label = 1;
                objM107537a = InterfaceC27643a.a.m107537a(interfaceC27643a, null, iM78853e, i12, str, str2, str3, str4, i13, this, 1, null);
                if (objM107537a == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
                objM107537a = obj;
            }
            BaseDto baseDto = (BaseDto) objM107537a;
            if (baseDto.getData() != null) {
                this.this$0.m78855g().mo14855n(baseDto.getData());
                int iM78853e2 = this.this$0.m78853e();
                this.this$0.m78856i(iM78853e2 + 1);
                Boxing.m97634d(iM78853e2);
            } else {
                this.this$0.m78855g().mo14855n(null);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            this.this$0.m78855g().mo14855n(null);
        }
        return Unit.f75682a;
    }
}
