package com.transsion.search.fragment.result;

import com.google.gson.JsonObject;
import com.p282tn.lib.net.bean.BaseDto;
import com.p282tn.lib.net.dns.p283or.CacheIpPool;
import com.transsion.search.bean.SearchResultEntity;
import com.transsion.search.net.RequestSearchResultEntity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p355dr.InterfaceC23043g;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.search.fragment.result.SearchResultViewModel$requestSearchResult$1", m97637f = "SearchResultViewModel.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.AD_VISIBILITY_VALUE}, m97639m = "invokeSuspend")
final class SearchResultViewModel$requestSearchResult$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isLoadMore;
    final /* synthetic */ String $keyword;
    final /* synthetic */ String $tabId;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ SearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchResultViewModel$requestSearchResult$1(SearchResultViewModel searchResultViewModel, String str, String str2, boolean z11, Continuation<? super SearchResultViewModel$requestSearchResult$1> continuation) {
        super(2, continuation);
        this.this$0 = searchResultViewModel;
        this.$keyword = str;
        this.$tabId = str2;
        this.$isLoadMore = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchResultViewModel$requestSearchResult$1 searchResultViewModel$requestSearchResult$1 = new SearchResultViewModel$requestSearchResult$1(this.this$0, this.$keyword, this.$tabId, this.$isLoadMore, continuation);
        searchResultViewModel$requestSearchResult$1.L$0 = obj;
        return searchResultViewModel$requestSearchResult$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SearchResultViewModel$requestSearchResult$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        SearchResultViewModel searchResultViewModel;
        boolean z11;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                RequestSearchResultEntity requestSearchResultEntity = new RequestSearchResultEntity(this.this$0.f59877f, 10, this.$keyword);
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("page", Boxing.m97634d(requestSearchResultEntity.getPage()));
                jsonObject.addProperty("perPage", Boxing.m97634d(requestSearchResultEntity.getPerPage()));
                jsonObject.addProperty("keyword", requestSearchResultEntity.getKeyword());
                String str = this.$tabId;
                if (str != null && str.length() != 0) {
                    jsonObject.addProperty("tabId", this.$tabId);
                }
                RequestBody.Companion companion = RequestBody.INSTANCE;
                String string = jsonObject.toString();
                Intrinsics.m97801g(string, "toString(...)");
                RequestBody requestBodyCreate = companion.create(string, MediaType.INSTANCE.parse("application/json"));
                searchResultViewModel = this.this$0;
                boolean z12 = this.$isLoadMore;
                Result.Companion companion2 = Result.INSTANCE;
                InterfaceC23043g interfaceC23043gM77899l = searchResultViewModel.m77899l();
                String strM61955l = CacheIpPool.f48367a.m61955l();
                this.L$0 = searchResultViewModel;
                this.Z$0 = z12;
                this.label = 1;
                obj = interfaceC23043gM77899l.m91667c(strM61955l, requestBodyCreate, this);
                if (obj == objF) {
                    return objF;
                }
                z11 = z12;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z11 = this.Z$0;
                searchResultViewModel = (SearchResultViewModel) this.L$0;
                ResultKt.m97107b(obj);
            }
            BaseDto baseDto = (BaseDto) obj;
            SearchResultEntity searchResultEntity = (SearchResultEntity) baseDto.getData();
            if (searchResultEntity != null) {
                SearchResultEntity searchResultEntity2 = (SearchResultEntity) baseDto.getData();
                searchResultEntity.setConvertData(searchResultViewModel.m77898h(searchResultEntity2 != null ? searchResultEntity2.getResults() : null));
            }
            if (z11) {
                searchResultViewModel.m77904j().mo14855n(baseDto.getData());
            } else {
                searchResultViewModel.m77905k().mo14855n(baseDto.getData());
            }
            int i12 = searchResultViewModel.f59877f;
            searchResultViewModel.f59877f = 1 + i12;
            objM112707constructorimpl = Result.m112707constructorimpl(Boxing.m97634d(i12));
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        SearchResultViewModel searchResultViewModel2 = this.this$0;
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            searchResultViewModel2.m77905k().mo14855n(null);
            C26866a.a.m104901l(C26866a.f81698a, "SearchResultViewModel", "requestSearchResult error: " + thM112710exceptionOrNullimpl.getMessage(), false, 4, null);
        }
        return Unit.f75682a;
    }
}
