package com.transsion.room.helper;

import android.location.Address;
import com.transsion.room.api.bean.LocationPlace;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.room.helper.LocationPlaceHelper$startRealTimeUpdates$1$onLocationResult$1$1", m97637f = "LocationPlaceHelper.kt", m97638l = {Sdk$SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE}, m97639m = "invokeSuspend")
final class LocationPlaceHelper$startRealTimeUpdates$1$onLocationResult$1$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<LocationPlace, Unit> $callback;
    final /* synthetic */ double $latitude;
    final /* synthetic */ double $longitude;
    int label;

    /* JADX INFO: renamed from: com.transsion.room.helper.LocationPlaceHelper$startRealTimeUpdates$1$onLocationResult$1$1$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.room.helper.LocationPlaceHelper$startRealTimeUpdates$1$onLocationResult$1$1$1", m97637f = "LocationPlaceHelper.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C181771 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<LocationPlace, Unit> $callback;
        final /* synthetic */ LocationPlace $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C181771(Function1<? super LocationPlace, Unit> function1, LocationPlace locationPlace, Continuation<? super C181771> continuation) {
            super(2, continuation);
            this.$callback = function1;
            this.$data = locationPlace;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C181771(this.$callback, this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C181771) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            this.$callback.invoke(this.$data);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LocationPlaceHelper$startRealTimeUpdates$1$onLocationResult$1$1(double d11, double d12, Function1<? super LocationPlace, Unit> function1, Continuation<? super LocationPlaceHelper$startRealTimeUpdates$1$onLocationResult$1$1> continuation) {
        super(2, continuation);
        this.$latitude = d11;
        this.$longitude = d12;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocationPlaceHelper$startRealTimeUpdates$1$onLocationResult$1$1(this.$latitude, this.$longitude, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LocationPlaceHelper$startRealTimeUpdates$1$onLocationResult$1$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            LocationPlaceHelper locationPlaceHelper = LocationPlaceHelper.f59312a;
            Address addressM77066m = locationPlaceHelper.m77066m(this.$latitude, this.$longitude);
            C26866a.f81698a.m104912c("LocationP", "Location--update--------------2 success " + this.$longitude + ", :" + this.$latitude + ", address:" + addressM77066m, true);
            LocationPlace locationPlaceM77065l = locationPlaceHelper.m77065l(this.$latitude, this.$longitude, addressM77066m);
            AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
            C181771 c181771 = new C181771(this.$callback, locationPlaceM77065l, null);
            this.label = 1;
            if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c181771, this) == objF) {
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
