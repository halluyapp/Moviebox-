package com.transsion.search.viewmodel;

import com.blankj.utilcode.util.Utils;
import com.p282tn.lib.net.bean.BaseDto;
import com.p282tn.lib.widget.R$string;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.transsion.search.net.RequestSearchEntity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p355dr.C23046j;
import p743rh.C27287m;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.search.viewmodel.SearchViewModel$searchWork$1", m97637f = "SearchViewModel.kt", m97638l = {73}, m97639m = "invokeSuspend")
final class SearchViewModel$searchWork$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ RequestSearchEntity $request;
    int label;
    final /* synthetic */ SearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchViewModel$searchWork$1(SearchViewModel searchViewModel, RequestSearchEntity requestSearchEntity, Continuation<? super SearchViewModel$searchWork$1> continuation) {
        super(2, continuation);
        this.this$0 = searchViewModel;
        this.$request = requestSearchEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchViewModel$searchWork$1(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SearchViewModel$searchWork$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                SearchViewModel searchViewModel = this.this$0;
                RequestSearchEntity requestSearchEntity = this.$request;
                Result.Companion companion = Result.INSTANCE;
                C23046j c23046jM78070n = searchViewModel.m78070n();
                this.label = 1;
                obj = c23046jM78070n.m91687i(requestSearchEntity, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) obj);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        SearchViewModel searchViewModel2 = this.this$0;
        if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
            searchViewModel2.f60003c.mo14855n(((BaseDto) objM112707constructorimpl).getData());
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104910z(C26866a.f81698a, "liup", String.valueOf(thM112710exceptionOrNullimpl.getMessage()), false, 4, null);
            if (C27287m.f83003a.m106330e()) {
                C13806h.f49015a.m62325l(Utils.m27275a().getString(R$string.no_error_content));
            } else {
                C13806h.f49015a.m62325l(Utils.m27275a().getString(R$string.no_network_toast));
            }
            searchViewModel2.f60003c.mo14855n(null);
        }
        return Unit.f75682a;
    }
}
