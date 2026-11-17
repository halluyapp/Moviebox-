package com.transsion.postdetail.util;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.shorttv.bean.ShortTVItem;
import com.transsion.shorttv.bean.ShortTvInfoEpisodeList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.util.ShortTVFloatManager$getShortTvEpisodeList$1$2$1", m97637f = "ShortTVFloatManager.kt", m97638l = {}, m97639m = "invokeSuspend")
final class ShortTVFloatManager$getShortTvEpisodeList$1$2$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<ShortTvInfoEpisodeList, Unit> $callback;
    final /* synthetic */ BaseDto<ShortTvInfoEpisodeList> $it;
    final /* synthetic */ int $start;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ShortTVFloatManager$getShortTvEpisodeList$1$2$1(int i11, BaseDto<ShortTvInfoEpisodeList> baseDto, Function1<? super ShortTvInfoEpisodeList, Unit> function1, Continuation<? super ShortTVFloatManager$getShortTvEpisodeList$1$2$1> continuation) {
        super(2, continuation);
        this.$start = i11;
        this.$it = baseDto;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTVFloatManager$getShortTvEpisodeList$1$2$1(this.$start, this.$it, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTVFloatManager$getShortTvEpisodeList$1$2$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<ShortTVItem> items;
        ShortTVItem shortTVItem;
        List<ShortTVItem> items2;
        ShortTVItem shortTVItem2;
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        C26866a.a aVar = C26866a.f81698a;
        int i11 = this.$start;
        ShortTvInfoEpisodeList data = this.$it.getData();
        Integer numM97634d = null;
        Integer numM97634d2 = (data == null || (items2 = data.getItems()) == null || (shortTVItem2 = (ShortTVItem) CollectionsKt.m97361k0(items2)) == null) ? null : Boxing.m97634d(shortTVItem2.getEp());
        ShortTvInfoEpisodeList data2 = this.$it.getData();
        if (data2 != null && (items = data2.getItems()) != null && (shortTVItem = (ShortTVItem) CollectionsKt.m97372v0(items)) != null) {
            numM97634d = Boxing.m97634d(shortTVItem.getEp());
        }
        aVar.m104912c("VideoFloat", "shorttv-----getShortTvEpisodeList success, start:" + i11 + ", startEp:" + numM97634d2 + ", lastEp:" + numM97634d, true);
        this.$callback.invoke(this.$it.getData());
        return Unit.f75682a;
    }
}
