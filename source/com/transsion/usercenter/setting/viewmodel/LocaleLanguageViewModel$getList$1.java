package com.transsion.usercenter.setting.viewmodel;

import com.transsion.baselib.locale.C14468d;
import java.util.ArrayList;
import java.util.Locale;
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
import p923xw.C28668a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.usercenter.setting.viewmodel.LocaleLanguageViewModel$getList$1", m97637f = "LocaleLanguageViewModel.kt", m97638l = {}, m97639m = "invokeSuspend")
final class LocaleLanguageViewModel$getList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LocaleLanguageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocaleLanguageViewModel$getList$1(LocaleLanguageViewModel localeLanguageViewModel, Continuation<? super LocaleLanguageViewModel$getList$1> continuation) {
        super(2, continuation);
        this.this$0 = localeLanguageViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocaleLanguageViewModel$getList$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LocaleLanguageViewModel$getList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zM97797c;
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        C14468d.b bVar = C14468d.f50894f;
        Locale localeM65210j = bVar.m65224e().m65210j();
        if (localeM65210j != null) {
            LocaleLanguageViewModel localeLanguageViewModel = this.this$0;
            boolean zM65214q = bVar.m65224e().m65214q(localeM65210j);
            String language = localeM65210j.getLanguage();
            String[] strArrM65226g = bVar.m65226g();
            String[] strArrM65225f = bVar.m65225f();
            ArrayList arrayList = new ArrayList();
            int length = strArrM65226g.length;
            int i11 = 0;
            while (i11 < length) {
                C28668a c28668a = new C28668a();
                c28668a.m110480c(strArrM65226g[i11]);
                c28668a.m110482e(strArrM65225f[i11]);
                if (zM65214q) {
                    zM97797c = i11 == 0;
                } else {
                    zM97797c = Intrinsics.m97797c(language, strArrM65225f[i11]);
                }
                c28668a.m110481d(zM97797c);
                arrayList.add(c28668a);
                i11++;
            }
            localeLanguageViewModel.m85832e().mo14855n(arrayList);
        }
        return Unit.f75682a;
    }
}
