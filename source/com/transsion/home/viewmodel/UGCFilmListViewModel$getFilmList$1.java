package com.transsion.home.viewmodel;

import com.blankj.utilcode.util.AbstractC5796o;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.home.bean.FilmListRequest;
import com.transsion.home.bean.FilmListResponse;
import com.transsion.home.bean.UgcGenreTopRespGenreItem;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.ugcvideodetail.api.bean.UGCContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import p978zg.C29182a;
import pg.C26866a;
import sl.InterfaceC27628b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.viewmodel.UGCFilmListViewModel$getFilmList$1", m97637f = "UGCFilmListViewModel.kt", m97638l = {127}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class UGCFilmListViewModel$getFilmList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $currentPage;
    int label;
    final /* synthetic */ UGCFilmListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UGCFilmListViewModel$getFilmList$1(UGCFilmListViewModel uGCFilmListViewModel, int i11, Continuation<? super UGCFilmListViewModel$getFilmList$1> continuation) {
        super(2, continuation);
        this.this$0 = uGCFilmListViewModel;
        this.$currentPage = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCFilmListViewModel$getFilmList$1(this.this$0, this.$currentPage, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UGCFilmListViewModel$getFilmList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<UgcGenreTopRespGenreItem> listL;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                FilmListRequest filmListRequest = new FilmListRequest(this.this$0.f53695c, this.$currentPage, 20);
                String strM27447j = AbstractC5796o.m27447j(filmListRequest);
                C26866a.a.m104898f(C26866a.f81698a, "FilmListViewModel", "getFilmList: request params=" + strM27447j, false, 4, null);
                InterfaceC27628b interfaceC27628b = this.this$0.f53694b;
                String strM111992a = C29182a.f89053a.m111992a();
                String type = filmListRequest.getType();
                int page = filmListRequest.getPage();
                int perPage = filmListRequest.getPerPage();
                this.label = 1;
                obj = interfaceC27628b.m107471f(strM111992a, type, page, perPage, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            BaseDto baseDto = (BaseDto) obj;
            C26866a.a aVar = C26866a.f81698a;
            C26866a.a.m104898f(aVar, "FilmListViewModel", "getFilmList: response code=" + baseDto.getCode() + ", msg=" + baseDto.getMsg(), false, 4, null);
            if (!Intrinsics.m97797c(baseDto.getCode(), "0") || baseDto.getData() == null) {
                this.this$0.m69074k().mo14855n(null);
                C26866a.a.m104901l(aVar, "FilmListViewModel", "getFilmList failed: code=" + baseDto.getCode() + ", msg=" + baseDto.getMsg(), false, 4, null);
            } else {
                FilmListResponse filmListResponse = (FilmListResponse) baseDto.getData();
                this.this$0.f53697e = filmListResponse != null ? filmListResponse.getPager() : null;
                if (filmListResponse == null || (listL = filmListResponse.getItems()) == null) {
                    listL = CollectionsKt.m97506l();
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listL) {
                    UGCContent ugcContent = ((UgcGenreTopRespGenreItem) obj2).getUgcContent();
                    if (Intrinsics.m97797c(ugcContent != null ? ugcContent.getTopicType() : null, "UGC_VIDEO") && ugcContent.getVideo() != null) {
                        arrayList.add(obj2);
                    }
                }
                C26866a.a aVar2 = C26866a.f81698a;
                int size = arrayList.size();
                Pager pager = this.this$0.f53697e;
                Boolean hasMore = pager != null ? pager.getHasMore() : null;
                Pager pager2 = this.this$0.f53697e;
                C26866a.a.m104898f(aVar2, "FilmListViewModel", "getFilmList success, size=" + size + ", hasMore=" + hasMore + ", nextPage=" + (pager2 != null ? pager2.getNextPage() : null), false, 4, null);
                this.this$0.m69074k().mo14855n(arrayList);
                String desc = filmListResponse != null ? filmListResponse.getDesc() : null;
                if (!this.this$0.f53701i && this.$currentPage == 1 && desc != null && desc.length() != 0) {
                    C26866a.a.m104898f(aVar2, "FilmListViewModel", "getFilmList: emit title desc='" + desc + "' for first load", false, 4, null);
                    this.this$0.m69073j().mo14855n(desc);
                    this.this$0.f53701i = true;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            C26866a.f81698a.m104915i("FilmListViewModel", "getFilmList exception: " + e11.getMessage(), true);
            this.this$0.m69074k().mo14855n(null);
        }
        return Unit.f75682a;
    }
}
