package com.transsion.search_pugc.fragment.result;

import android.util.Log;
import com.google.gson.JsonObject;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.search_pugc.bean.SecondTab;
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
import kr.InterfaceC25423a;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p978zg.C29182a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.search_pugc.fragment.result.SearchResultViewModel$requestUGCSearchResult$1", m97637f = "SearchResultViewModel.kt", m97638l = {68}, m97639m = "invokeSuspend")
final class SearchResultViewModel$requestUGCSearchResult$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isLoadMore;
    final /* synthetic */ String $keyword;
    final /* synthetic */ String $pageFrom;
    final /* synthetic */ SecondTab $secondTab;
    final /* synthetic */ String $tabId;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ SearchResultViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchResultViewModel$requestUGCSearchResult$1(SearchResultViewModel searchResultViewModel, String str, String str2, String str3, SecondTab secondTab, boolean z11, Continuation<? super SearchResultViewModel$requestUGCSearchResult$1> continuation) {
        super(2, continuation);
        this.this$0 = searchResultViewModel;
        this.$keyword = str;
        this.$pageFrom = str2;
        this.$tabId = str3;
        this.$secondTab = secondTab;
        this.$isLoadMore = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchResultViewModel$requestUGCSearchResult$1 searchResultViewModel$requestUGCSearchResult$1 = new SearchResultViewModel$requestUGCSearchResult$1(this.this$0, this.$keyword, this.$pageFrom, this.$tabId, this.$secondTab, this.$isLoadMore, continuation);
        searchResultViewModel$requestUGCSearchResult$1.L$0 = obj;
        return searchResultViewModel$requestUGCSearchResult$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SearchResultViewModel$requestUGCSearchResult$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
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
                JsonObject jsonObject = new JsonObject();
                SearchResultViewModel searchResultViewModel2 = this.this$0;
                String str = this.$keyword;
                String str2 = this.$pageFrom;
                String str3 = this.$tabId;
                SecondTab secondTab = this.$secondTab;
                jsonObject.addProperty("page", Boxing.m97634d(searchResultViewModel2.f60205h));
                jsonObject.addProperty("perPage", Boxing.m97634d(20));
                jsonObject.addProperty("keyword", str);
                jsonObject.addProperty("pageFrom", str2);
                if (str3 != null && str3.length() != 0) {
                    jsonObject.addProperty("tabId", str3);
                }
                String strM78403g = searchResultViewModel2.m78403g();
                if (strM78403g != null && strM78403g.length() != 0) {
                    jsonObject.addProperty("ugcVideoId", searchResultViewModel2.m78403g());
                }
                if (secondTab != null) {
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("tagType", secondTab.getTagType());
                    jsonObject2.addProperty("tagValue", secondTab.getTagValue());
                    jsonObject.add("secondTab", jsonObject2);
                }
                RequestBody.Companion companion = RequestBody.INSTANCE;
                String string = jsonObject.toString();
                Intrinsics.m97801g(string, "toString(...)");
                RequestBody requestBodyCreate = companion.create(string, MediaType.INSTANCE.parse("application/json"));
                searchResultViewModel = this.this$0;
                boolean z12 = this.$isLoadMore;
                Result.Companion companion2 = Result.INSTANCE;
                InterfaceC25423a interfaceC25423aM78400j = searchResultViewModel.m78400j();
                String strM111992a = C29182a.f89053a.m111992a();
                this.L$0 = searchResultViewModel;
                this.Z$0 = z12;
                this.label = 1;
                obj = interfaceC25423aM78400j.m99941b(strM111992a, requestBodyCreate, this);
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
            if (z11) {
                searchResultViewModel.m78406k().mo14855n(baseDto.getData());
            } else {
                searchResultViewModel.m78407l().mo14855n(baseDto.getData());
            }
            int i12 = searchResultViewModel.f60205h;
            searchResultViewModel.f60205h = 1 + i12;
            objM112707constructorimpl = Result.m112707constructorimpl(Boxing.m97634d(i12));
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        boolean z13 = this.$isLoadMore;
        SearchResultViewModel searchResultViewModel3 = this.this$0;
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            if (z13) {
                searchResultViewModel3.m78406k().mo14855n(null);
            } else {
                searchResultViewModel3.m78407l().mo14855n(null);
            }
            Log.e("SearchResultViewModel", "getUGCSearchResult error: " + thM112710exceptionOrNullimpl.getMessage(), thM112710exceptionOrNullimpl);
        }
        return Unit.f75682a;
    }
}
