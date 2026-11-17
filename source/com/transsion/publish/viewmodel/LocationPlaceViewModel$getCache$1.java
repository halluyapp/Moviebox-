package com.transsion.publish.viewmodel;

import com.cloud.tmc.kernel.constants.TmcConstants;
import com.transsion.baselib.p291db.place.PlaceDBBean;
import com.transsion.baselib.p291db.place.PlaceDao;
import com.transsion.room.api.bean.LocationPlace;
import java.util.ArrayList;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.publish.viewmodel.LocationPlaceViewModel$getCache$1", m97637f = "LocationPlaceViewModel.kt", m97638l = {104}, m97639m = "invokeSuspend")
final class LocationPlaceViewModel$getCache$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LocationPlaceViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.publish.viewmodel.LocationPlaceViewModel$getCache$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "", "Lcom/transsion/room/api/bean/LocationPlace;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.publish.viewmodel.LocationPlaceViewModel$getCache$1$1", m97637f = "LocationPlaceViewModel.kt", m97638l = {TmcConstants.NOTIFY_ADDHOME_GUIDE_BOTTOM_SHOW, 84, 99}, m97639m = "invokeSuspend")
    @SourceDebugExtension
    static final class C177131 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LocationPlaceViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C177131(LocationPlaceViewModel locationPlaceViewModel, Continuation<? super C177131> continuation) {
            super(2, continuation);
            this.this$0 = locationPlaceViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C177131 c177131 = new C177131(this.this$0, continuation);
            c177131.L$0 = obj;
            return c177131;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C177131) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
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
            PlaceDao placeDaoM75698m = this.this$0.m75698m();
            this.L$0 = interfaceC24998b;
            this.label = 1;
            obj = placeDaoM75698m.mo64931d(this);
            if (obj == objF) {
                return objF;
            }
            List<PlaceDBBean> list = (List) obj;
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                this.L$0 = null;
                this.label = 2;
                if (interfaceC24998b.emit(null, this) == objF) {
                    return objF;
                }
            } else {
                ArrayList arrayList = new ArrayList();
                for (PlaceDBBean placeDBBean : list) {
                    LocationPlace locationPlace = new LocationPlace(placeDBBean.getName(), placeDBBean.getAddress(), Boxing.m97632b(placeDBBean.getLatitude()), Boxing.m97632b(placeDBBean.getLongitude()));
                    locationPlace.setDistance(placeDBBean.getDistance());
                    arrayList.add(locationPlace);
                }
                this.L$0 = null;
                this.label = 3;
                if (interfaceC24998b.emit(arrayList, this) == objF) {
                    return objF;
                }
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.publish.viewmodel.LocationPlaceViewModel$getCache$1$2 */
    @Metadata(m97099d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "", "Lcom/transsion/room/api/bean/LocationPlace;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.publish.viewmodel.LocationPlaceViewModel$getCache$1$2", m97637f = "LocationPlaceViewModel.kt", m97638l = {103}, m97639m = "invokeSuspend")
    static final class C177142 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C177142(Continuation<? super C177142> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C177142 c177142 = new C177142(continuation);
            c177142.L$0 = interfaceC24998b;
            return c177142.invokeSuspend(Unit.f75682a);
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

    /* JADX INFO: renamed from: com.transsion.publish.viewmodel.LocationPlaceViewModel$getCache$1$a */
    static final class C17715a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ LocationPlaceViewModel f58436a;

        C17715a(LocationPlaceViewModel locationPlaceViewModel) {
            this.f58436a = locationPlaceViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List list, Continuation continuation) {
            this.f58436a.f58435d.mo14858q(list);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocationPlaceViewModel$getCache$1(LocationPlaceViewModel locationPlaceViewModel, Continuation<? super LocationPlaceViewModel$getCache$1> continuation) {
        super(2, continuation);
        this.this$0 = locationPlaceViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocationPlaceViewModel$getCache$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LocationPlaceViewModel$getCache$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C177131(this.this$0, null)), C25220y0.m99268b()), new C177142(null));
            C17715a c17715a = new C17715a(this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c17715a, this) == objF) {
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
