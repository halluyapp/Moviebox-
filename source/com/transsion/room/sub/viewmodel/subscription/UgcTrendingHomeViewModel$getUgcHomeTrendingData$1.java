package com.transsion.room.sub.viewmodel.subscription;

import com.google.gson.JsonObject;
import com.p282tn.lib.net.bean.BaseDto;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import okhttp3.RequestBody;
import p411fh.C23367b;
import p716qq.InterfaceC27121c;
import p978zg.C29182a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.room.sub.viewmodel.subscription.UgcTrendingHomeViewModel$getUgcHomeTrendingData$1", m97637f = "UgcTrendingHomeViewModel.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.AD_VISIBILITY_VALUE}, m97639m = "invokeSuspend")
final class UgcTrendingHomeViewModel$getUgcHomeTrendingData$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Integer $page;
    final /* synthetic */ String $sort;
    Object L$0;
    int label;
    final /* synthetic */ UgcTrendingHomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UgcTrendingHomeViewModel$getUgcHomeTrendingData$1(Integer num, UgcTrendingHomeViewModel ugcTrendingHomeViewModel, String str, Continuation<? super UgcTrendingHomeViewModel$getUgcHomeTrendingData$1> continuation) {
        super(2, continuation);
        this.$page = num;
        this.this$0 = ugcTrendingHomeViewModel;
        this.$sort = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcTrendingHomeViewModel$getUgcHomeTrendingData$1(this.$page, this.this$0, this.$sort, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UgcTrendingHomeViewModel$getUgcHomeTrendingData$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        UgcTrendingHomeViewModel ugcTrendingHomeViewModel;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("page", this.$page);
                jsonObject.addProperty("perPage", this.this$0.f59525c);
                jsonObject.addProperty("sort", this.$sort);
                C23367b.a aVar = C23367b.f71265a;
                String string = jsonObject.toString();
                Intrinsics.m97801g(string, "toString(...)");
                RequestBody requestBodyM92796a = aVar.m92796a(string);
                if (requestBodyM92796a != null) {
                    UgcTrendingHomeViewModel ugcTrendingHomeViewModel2 = this.this$0;
                    InterfaceC27121c interfaceC27121c = ugcTrendingHomeViewModel2.f59526d;
                    String strM111992a = C29182a.f89053a.m111992a();
                    this.L$0 = ugcTrendingHomeViewModel2;
                    this.label = 1;
                    obj = interfaceC27121c.m105517a(strM111992a, requestBodyM92796a, this);
                    if (obj == objF) {
                        return objF;
                    }
                    ugcTrendingHomeViewModel = ugcTrendingHomeViewModel2;
                }
                return Unit.f75682a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ugcTrendingHomeViewModel = (UgcTrendingHomeViewModel) this.L$0;
            ResultKt.m97107b(obj);
            BaseDto baseDto = (BaseDto) obj;
            C26866a.a.m104898f(C26866a.f81698a, "UgcTrendingHomeViewModel", "Feed Home Trending: " + baseDto, false, 4, null);
            ugcTrendingHomeViewModel.m77363f().mo14855n(baseDto.getData());
        } catch (Exception e11) {
            e11.printStackTrace();
            C26866a.a aVar2 = C26866a.f81698a;
            String simpleName = UgcTrendingHomeViewModel.class.getSimpleName();
            Intrinsics.m97801g(simpleName, "getSimpleName(...)");
            aVar2.m104915i(simpleName, "exceptionHandler " + e11.getMessage(), true);
        }
        return Unit.f75682a;
    }
}
