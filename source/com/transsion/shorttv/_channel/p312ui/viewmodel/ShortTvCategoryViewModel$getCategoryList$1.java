package com.transsion.shorttv._channel.p312ui.viewmodel;

import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.google.gson.JsonObject;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.shorttv._channel.model.ShortTvCategoryBean;
import kotlin.Metadata;
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
import okhttp3.RequestBody;
import p411fh.C23367b;
import p978zg.C29182a;
import sr.InterfaceC27643a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv._channel.ui.viewmodel.ShortTvCategoryViewModel$getCategoryList$1", m97637f = "ShortTvCategoryViewModel.kt", m97638l = {36}, m97639m = "invokeSuspend")
final class ShortTvCategoryViewModel$getCategoryList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $type;
    Object L$0;
    int label;
    final /* synthetic */ ShortTvCategoryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvCategoryViewModel$getCategoryList$1(String str, ShortTvCategoryViewModel shortTvCategoryViewModel, Continuation<? super ShortTvCategoryViewModel$getCategoryList$1> continuation) {
        super(2, continuation);
        this.$type = str;
        this.this$0 = shortTvCategoryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTvCategoryViewModel$getCategoryList$1(this.$type, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvCategoryViewModel$getCategoryList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ShortTvCategoryViewModel shortTvCategoryViewModel;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty(NativeComponentConstants.KEY_COMPONENT_TYPE, this.$type);
                jsonObject.addProperty("page", Boxing.m97634d(this.this$0.m78834k()));
                jsonObject.addProperty("perPage", Boxing.m97634d(this.this$0.f60459c));
                C23367b.a aVar = C23367b.f71265a;
                String string = jsonObject.toString();
                Intrinsics.m97801g(string, "toString(...)");
                RequestBody requestBodyM92796a = aVar.m92796a(string);
                if (requestBodyM92796a != null) {
                    ShortTvCategoryViewModel shortTvCategoryViewModel2 = this.this$0;
                    InterfaceC27643a interfaceC27643aM78829l = shortTvCategoryViewModel2.m78829l();
                    String strM111992a = C29182a.f89053a.m111992a();
                    this.L$0 = shortTvCategoryViewModel2;
                    this.label = 1;
                    obj = interfaceC27643aM78829l.m107535c(strM111992a, requestBodyM92796a, this);
                    if (obj == objF) {
                        return objF;
                    }
                    shortTvCategoryViewModel = shortTvCategoryViewModel2;
                }
                return Unit.f75682a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            shortTvCategoryViewModel = (ShortTvCategoryViewModel) this.L$0;
            ResultKt.m97107b(obj);
            BaseDto baseDto = (BaseDto) obj;
            shortTvCategoryViewModel.m78830m((ShortTvCategoryBean) baseDto.getData());
            shortTvCategoryViewModel.m78833j().mo14855n(baseDto);
            int iM78834k = shortTvCategoryViewModel.m78834k();
            shortTvCategoryViewModel.m78835o(iM78834k + 1);
            Boxing.m97634d(iM78834k);
        } catch (Exception e11) {
            this.this$0.m78833j().mo14855n(new BaseDto());
            e11.printStackTrace();
        }
        return Unit.f75682a;
    }
}
