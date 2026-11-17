package com.transsion.postdetail.viewmodel;

import com.transsion.moviedetailapi.bean.PostSubjectBean;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import java.util.List;
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
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.viewmodel.RoomPostViewModel$loadPostExploreCombinedCache$1", m97637f = "RoomPostViewModel.kt", m97638l = {}, m97639m = "invokeSuspend")
final class RoomPostViewModel$loadPostExploreCombinedCache$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RoomPostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoomPostViewModel$loadPostExploreCombinedCache$1(RoomPostViewModel roomPostViewModel, Continuation<? super RoomPostViewModel$loadPostExploreCombinedCache$1> continuation) {
        super(2, continuation);
        this.this$0 = roomPostViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RoomPostViewModel$loadPostExploreCombinedCache$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((RoomPostViewModel$loadPostExploreCombinedCache$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        List listM75079b0 = this.this$0.m75079b0();
        List listM75083d0 = this.this$0.m75083d0("post_explore_net_cache_exp", "loadExpNetCacheItems");
        List listM75081c0 = this.this$0.m75081c0();
        PostSubjectBean postSubjectBeanM75091k0 = this.this$0.m75091k0(listM75079b0, listM75083d0, listM75081c0);
        if (postSubjectBeanM75091k0 != null) {
            C26866a.a aVar = C26866a.f81698a;
            int size = listM75079b0.size();
            int size2 = listM75083d0.size();
            int size3 = listM75081c0.size();
            List<PostSubjectItem> items = postSubjectBeanM75091k0.getItems();
            C26866a.a.m104898f(aVar, "RoomPostVM", "loadPostExploreCombinedCache [实验组], 已曝光:" + size + ", 网络:" + size2 + ", 手动:" + size3 + ", 合并:" + (items != null ? Boxing.m97634d(items.size()) : null), false, 4, null);
            this.this$0.f57895e.mo14855n(postSubjectBeanM75091k0);
        } else {
            C26866a.a.m104898f(C26866a.f81698a, "RoomPostVM", "loadPostExploreCombinedCache [实验组], 无缓存数据", false, 4, null);
        }
        return Unit.f75682a;
    }
}
