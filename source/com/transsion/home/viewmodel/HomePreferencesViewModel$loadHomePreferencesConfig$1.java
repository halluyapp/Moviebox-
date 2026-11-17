package com.transsion.home.viewmodel;

import com.transsion.home.bean.HomePreferencesState;
import com.transsion.home.repository.HomePreferencesRepository;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.viewmodel.HomePreferencesViewModel$loadHomePreferencesConfig$1", m97637f = "HomePreferencesViewModel.kt", m97638l = {126}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class HomePreferencesViewModel$loadHomePreferencesConfig$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomePreferencesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomePreferencesViewModel$loadHomePreferencesConfig$1(HomePreferencesViewModel homePreferencesViewModel, Continuation<? super HomePreferencesViewModel$loadHomePreferencesConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = homePreferencesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HomePreferencesViewModel$loadHomePreferencesConfig$1 homePreferencesViewModel$loadHomePreferencesConfig$1 = new HomePreferencesViewModel$loadHomePreferencesConfig$1(this.this$0, continuation);
        homePreferencesViewModel$loadHomePreferencesConfig$1.L$0 = obj;
        return homePreferencesViewModel$loadHomePreferencesConfig$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((HomePreferencesViewModel$loadHomePreferencesConfig$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        HomePreferencesViewModel homePreferencesViewModel;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                HomePreferencesViewModel homePreferencesViewModel2 = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                HomePreferencesRepository homePreferencesRepositoryM68933y = homePreferencesViewModel2.m68933y();
                this.L$0 = homePreferencesViewModel2;
                this.label = 1;
                Object objM68515f = homePreferencesRepositoryM68933y.m68515f(null, this);
                if (objM68515f == objF) {
                    return objF;
                }
                homePreferencesViewModel = homePreferencesViewModel2;
                obj = objM68515f;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                homePreferencesViewModel = (HomePreferencesViewModel) this.L$0;
                ResultKt.m97107b(obj);
            }
            HomePreferencesState homePreferencesState = (HomePreferencesState) obj;
            homePreferencesViewModel.f53638h = homePreferencesState;
            homePreferencesViewModel.m68947w().mo14855n(homePreferencesState);
            Iterator it = homePreferencesViewModel.f53639i.keySet().iterator();
            while (it.hasNext()) {
                homePreferencesViewModel.m68930p((String) it.next());
            }
            homePreferencesViewModel.m68914N(homePreferencesState);
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        HomePreferencesViewModel homePreferencesViewModel3 = this.this$0;
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104901l(C26866a.f81698a, "HomePreferencesViewModel", "loadHomePreferencesConfig error: " + thM112710exceptionOrNullimpl.getMessage(), false, 4, null);
            homePreferencesViewModel3.m68947w().mo14855n(null);
        }
        return Unit.f75682a;
    }
}
