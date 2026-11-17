package com.transsion.postdetail.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.bean.PostSubjectBean;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.postdetail.util.C17437g;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;
import p978zg.C29182a;
import p985zo.InterfaceC29210c;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.viewmodel.RoomPostViewModel$getPostExplore$1", m97637f = "RoomPostViewModel.kt", m97638l = {Sdk$SDKError.Reason.AD_IS_PLAYING_VALUE}, m97639m = "invokeSuspend")
final class RoomPostViewModel$getPostExplore$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $insertPostId;
    final /* synthetic */ boolean $isFirstLoad;
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ String $page;
    final /* synthetic */ int $perPage;
    int label;
    final /* synthetic */ RoomPostViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.RoomPostViewModel$getPostExplore$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/moviedetailapi/bean/PostSubjectBean;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.viewmodel.RoomPostViewModel$getPostExplore$1$1", m97637f = "RoomPostViewModel.kt", m97638l = {196, 198, 200}, m97639m = "invokeSuspend")
    static final class C174841 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $insertPostId;
        final /* synthetic */ String $page;
        final /* synthetic */ int $perPage;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RoomPostViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C174841(RoomPostViewModel roomPostViewModel, String str, int i11, String str2, Continuation<? super C174841> continuation) {
            super(2, continuation);
            this.this$0 = roomPostViewModel;
            this.$page = str;
            this.$perPage = i11;
            this.$insertPostId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C174841 c174841 = new C174841(this.this$0, this.$page, this.$perPage, this.$insertPostId, continuation);
            c174841.L$0 = obj;
            return c174841;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C174841) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC24998b interfaceC24998b;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    interfaceC24998b = (InterfaceC24998b) this.L$0;
                    ResultKt.m97107b(obj);
                } else {
                    if (i11 != 2 && i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(obj);
                }
                return Unit.f75682a;
            }
            ResultKt.m97107b(obj);
            interfaceC24998b = (InterfaceC24998b) this.L$0;
            InterfaceC29210c interfaceC29210cM75074S = this.this$0.m75074S();
            String strM111992a = C29182a.f89053a.m111992a();
            String str = this.$page;
            int i12 = this.$perPage;
            String str2 = this.$insertPostId;
            this.L$0 = interfaceC24998b;
            this.label = 1;
            obj = interfaceC29210cM75074S.m112064a(strM111992a, str, i12, 0.0f, 0.0f, str2, this);
            if (obj == objF) {
                return objF;
            }
            BaseDto baseDto = (BaseDto) obj;
            if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
                Object data = baseDto.getData();
                this.L$0 = null;
                this.label = 3;
                if (interfaceC24998b.emit(data, this) == objF) {
                    return objF;
                }
            } else {
                this.L$0 = null;
                this.label = 2;
                if (interfaceC24998b.emit(null, this) == objF) {
                    return objF;
                }
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.RoomPostViewModel$getPostExplore$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/moviedetailapi/bean/PostSubjectBean;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.viewmodel.RoomPostViewModel$getPostExplore$1$2", m97637f = "RoomPostViewModel.kt", m97638l = {Sdk$SDKError.Reason.AD_ALREADY_LOADED_VALUE}, m97639m = "invokeSuspend")
    static final class C174852 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C174852(Continuation<? super C174852> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C174852 c174852 = new C174852(continuation);
            c174852.L$0 = interfaceC24998b;
            return c174852.invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC24998b interfaceC24998b = (InterfaceC24998b) this.L$0;
                this.label = 1;
                if (interfaceC24998b.emit(null, this) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.viewmodel.RoomPostViewModel$getPostExplore$1$a */
    static final class C17486a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f57907a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Ref.BooleanRef f57908b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ RoomPostViewModel f57909c;

        C17486a(boolean z11, Ref.BooleanRef booleanRef, RoomPostViewModel roomPostViewModel) {
            this.f57907a = z11;
            this.f57908b = booleanRef;
            this.f57909c = roomPostViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(PostSubjectBean postSubjectBean, Continuation continuation) {
            List<PostSubjectItem> items;
            List<PostSubjectItem> items2;
            if (this.f57907a && this.f57908b.element && this.f57909c.f57905o > 0) {
                boolean z11 = System.currentTimeMillis() - this.f57909c.f57905o <= 2000;
                this.f57909c.f57905o = 0L;
                C26866a.a.m104898f(C26866a.f81698a, "RoomPostVM", "getPostExplore success--needRefreshBuiltIn:" + z11, false, 4, null);
                this.f57908b.element = z11;
            }
            C26866a.a.m104898f(C26866a.f81698a, "RoomPostVM", "getPostExplore success--isRefreshNew:" + this.f57908b.element + ", size：" + ((postSubjectBean == null || (items2 = postSubjectBean.getItems()) == null) ? null : Boxing.m97634d(items2.size())), false, 4, null);
            if (postSubjectBean != null) {
                postSubjectBean.setRefresh(this.f57908b.element);
            }
            this.f57909c.f57895e.mo14855n(postSubjectBean);
            if (postSubjectBean != null && (items = postSubjectBean.getItems()) != null) {
                C17437g.f57828a.m74959b(items);
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoomPostViewModel$getPostExplore$1(boolean z11, RoomPostViewModel roomPostViewModel, boolean z12, String str, int i11, String str2, Continuation<? super RoomPostViewModel$getPostExplore$1> continuation) {
        super(2, continuation);
        this.$isFirstLoad = z11;
        this.this$0 = roomPostViewModel;
        this.$isRefresh = z12;
        this.$page = str;
        this.$perPage = i11;
        this.$insertPostId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RoomPostViewModel$getPostExplore$1(this.$isFirstLoad, this.this$0, this.$isRefresh, this.$page, this.$perPage, this.$insertPostId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((RoomPostViewModel$getPostExplore$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z11;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            if (this.$isFirstLoad) {
                C14496b c14496b = C14496b.f50966a;
                String string = c14496b.m65344b().getString("room_cache_data", "");
                z11 = false;
                if (this.this$0.m75125X()) {
                    String string2 = c14496b.m65344b().getString("post_explore_net_cache_exp", "");
                    String string3 = c14496b.m65344b().getString("post_explore_exposed_cache", "");
                    C26866a.a aVar = C26866a.f81698a;
                    boolean z12 = !(string == null || string.length() == 0);
                    boolean z13 = !(string2 == null || string2.length() == 0);
                    boolean z14 = string3 == null || string3.length() == 0;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("getPostExplore  手动缓存：");
                    sb2.append(z12);
                    sb2.append(",网络缓存：");
                    sb2.append(z13);
                    sb2.append(",已曝光缓存：");
                    sb2.append(!z14);
                    C26866a.a.m104898f(aVar, "RoomPostVM", sb2.toString(), false, 4, null);
                    if ((string == null || string.length() == 0) && ((string2 == null || string2.length() == 0) && (string3 == null || string3.length() == 0))) {
                        z11 = this.$isRefresh;
                    }
                } else {
                    String string4 = c14496b.m65344b().getString("post_explore_net_cache", "");
                    C26866a.a aVar2 = C26866a.f81698a;
                    boolean z15 = !(string == null || string.length() == 0);
                    boolean z16 = string4 == null || string4.length() == 0;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("getPostExplore  手动缓存：");
                    sb3.append(z15);
                    sb3.append(",网络缓存：");
                    sb3.append(!z16);
                    C26866a.a.m104898f(aVar2, "RoomPostVM", sb3.toString(), false, 4, null);
                    if ((string == null || string.length() == 0) && (string4 == null || string4.length() == 0)) {
                        z11 = this.$isRefresh;
                    }
                }
            } else {
                z11 = this.$isRefresh;
            }
            booleanRef.element = z11;
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C174841(this.this$0, this.$page, this.$perPage, this.$insertPostId, null)), C25220y0.m99268b()), new C174852(null));
            C17486a c17486a = new C17486a(this.$isFirstLoad, booleanRef, this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c17486a, this) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        return Unit.f75682a;
    }
}
