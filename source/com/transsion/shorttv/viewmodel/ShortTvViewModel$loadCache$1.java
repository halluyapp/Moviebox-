package com.transsion.shorttv.viewmodel;

import android.content.Context;
import com.blankj.utilcode.util.AbstractC5796o;
import com.transsion.shorttv.bean.BannerData;
import com.transsion.shorttv.bean.OperatingResp;
import com.transsion.shorttv.utils.C19165h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvViewModel$loadCache$1", m97637f = "ShortTvViewModel.kt", m97638l = {}, m97639m = "invokeSuspend")
final class ShortTvViewModel$loadCache$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShortTvViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.shorttv.viewmodel.ShortTvViewModel$loadCache$1$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvViewModel$loadCache$1$1", m97637f = "ShortTvViewModel.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C191911 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;
        final /* synthetic */ ShortTvViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C191911(ShortTvViewModel shortTvViewModel, Context context, Continuation<? super C191911> continuation) {
            super(2, continuation);
            this.this$0 = shortTvViewModel;
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final Unit m80406d() {
            C26866a.a.m104910z(C26866a.f81698a, "ShortTvViewModel", "Cache---没有运营位缓存", false, 4, null);
            return Unit.f75682a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C191911(this.this$0, this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C191911) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            ShortTvViewModel shortTvViewModel = this.this$0;
            Context context = this.$context;
            try {
                Result.Companion companion = Result.INSTANCE;
                String string = C19165h.f61575a.m80241d().getString("short_tv_operating_data", "");
                if (string == null || string.length() == 0) {
                    string = shortTvViewModel.m80312k0().m109001a(context);
                }
                OperatingResp operatingResp = (OperatingResp) AbstractC5796o.m27441d(string, OperatingResp.class);
                if (operatingResp != null) {
                    operatingResp.setSourceFrom("from_cache");
                    C26866a.a aVar = C26866a.f81698a;
                    List<BannerData> banners = operatingResp.getBanners();
                    C26866a.a.m104905r(aVar, "ShortTvViewModel", new String[]{"Cache---有运营位缓存 banner:" + (banners != null ? Boxing.m97634d(banners.size()) : null) + " "}, false, 4, null);
                    operatingResp.setCache(true);
                    shortTvViewModel.m80291M0(operatingResp);
                    shortTvViewModel.m80383i0().mo14855n(operatingResp);
                    obj2 = Unit.f75682a;
                } else {
                    obj2 = new Function0() { // from class: com.transsion.shorttv.viewmodel.o
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ShortTvViewModel$loadCache$1.C191911.m80406d();
                        }
                    };
                }
                Result.m112707constructorimpl(obj2);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvViewModel$loadCache$1(ShortTvViewModel shortTvViewModel, Context context, Continuation<? super ShortTvViewModel$loadCache$1> continuation) {
        super(2, continuation);
        this.this$0 = shortTvViewModel;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShortTvViewModel$loadCache$1 shortTvViewModel$loadCache$1 = new ShortTvViewModel$loadCache$1(this.this$0, this.$context, continuation);
        shortTvViewModel$loadCache$1.L$0 = obj;
        return shortTvViewModel$loadCache$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvViewModel$loadCache$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        AbstractC25136k.m99058d((InterfaceC25149n0) this.L$0, null, null, new C191911(this.this$0, this.$context, null), 3, null);
        return Unit.f75682a;
    }
}
