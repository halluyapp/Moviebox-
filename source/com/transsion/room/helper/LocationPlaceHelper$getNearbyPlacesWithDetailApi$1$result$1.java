package com.transsion.room.helper;

import ck.C5122s;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.transsion.room.api.bean.LocationPlace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "Lcom/transsion/room/api/bean/LocationPlace;", "<anonymous>", "(Lkotlinx/coroutines/n0;)Ljava/util/List;"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.room.helper.LocationPlaceHelper$getNearbyPlacesWithDetailApi$1$result$1", m97637f = "LocationPlaceHelper.kt", m97638l = {TTAdConstant.IMAGE_CODE}, m97639m = "invokeSuspend")
final class LocationPlaceHelper$getNearbyPlacesWithDetailApi$1$result$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super List<LocationPlace>>, Object> {
    final /* synthetic */ LatLng $currentLatLng;
    final /* synthetic */ FindCurrentPlaceRequest $request;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: com.transsion.room.helper.LocationPlaceHelper$getNearbyPlacesWithDetailApi$1$result$1$a */
    static final class C18174a implements OnCompleteListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Continuation f59316a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ LatLng f59317b;

        C18174a(Continuation continuation, LatLng latLng) {
            this.f59316a = continuation;
            this.f59317b = latLng;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task task) {
            Iterator<PlaceLikelihood> it;
            String strM23957a;
            Intrinsics.m97802h(task, "task");
            if (!task.isSuccessful()) {
                Exception exception = task.getException();
                if (exception != null) {
                    Continuation continuation = this.f59316a;
                    C26866a.a.m104898f(C26866a.f81698a, "LocationP", "place fail: " + exception.getMessage(), false, 4, null);
                    continuation.resumeWith(Result.m112707constructorimpl(null));
                    return;
                }
                return;
            }
            FindCurrentPlaceResponse findCurrentPlaceResponse = (FindCurrentPlaceResponse) task.getResult();
            if (findCurrentPlaceResponse == null) {
                C26866a.a.m104898f(C26866a.f81698a, "LocationP", "place fail:response null", false, 4, null);
                this.f59316a.resumeWith(Result.m112707constructorimpl(null));
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                C26866a.a.m104898f(C26866a.f81698a, "LocationP", "getNearbyPlaces --size:" + findCurrentPlaceResponse.getPlaceLikelihoods().size(), false, 4, null);
                Iterator<PlaceLikelihood> it2 = findCurrentPlaceResponse.getPlaceLikelihoods().iterator();
                while (it2.hasNext()) {
                    try {
                        Place place = it2.next().getPlace();
                        LatLng latLng = place.getLatLng();
                        String name = place.getName();
                        String address = place.getAddress();
                        if (latLng != null) {
                            C5122s c5122s = C5122s.f17613a;
                            LatLng latLng2 = this.f59317b;
                            it = it2;
                            try {
                                strM23957a = c5122s.m23957a(latLng2.latitude, latLng2.longitude, latLng.latitude, latLng.longitude);
                            } catch (Throwable th2) {
                                th = th2;
                                C26866a.a.m104901l(C26866a.f81698a, "LocationP", "place error2 :" + th, false, 4, null);
                                th.printStackTrace();
                            }
                        } else {
                            it = it2;
                            strM23957a = "<0.1m";
                        }
                        C26866a.a.m104898f(C26866a.f81698a, "LocationP", "place list 名称: " + name + ", 距离: " + strM23957a + ", 地址: " + address + ",lat:" + (latLng != null ? Double.valueOf(latLng.latitude) : null), false, 4, null);
                        LocationPlace locationPlace = new LocationPlace(null, null, null, null, 15, null);
                        locationPlace.setName(name);
                        locationPlace.setAddress(address);
                        locationPlace.setDistance(strM23957a);
                        locationPlace.setLat(latLng != null ? Double.valueOf(latLng.latitude) : null);
                        locationPlace.setLon(latLng != null ? Double.valueOf(latLng.longitude) : null);
                        arrayList.add(locationPlace);
                    } catch (Throwable th3) {
                        th = th3;
                        it = it2;
                    }
                    it2 = it;
                }
                this.f59316a.resumeWith(Result.m112707constructorimpl(arrayList));
            } catch (Throwable th4) {
                C26866a.a.m104901l(C26866a.f81698a, "LocationP", "place error1 :" + th4, false, 4, null);
                this.f59316a.resumeWith(Result.m112707constructorimpl(null));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocationPlaceHelper$getNearbyPlacesWithDetailApi$1$result$1(FindCurrentPlaceRequest findCurrentPlaceRequest, LatLng latLng, Continuation<? super LocationPlaceHelper$getNearbyPlacesWithDetailApi$1$result$1> continuation) {
        super(2, continuation);
        this.$request = findCurrentPlaceRequest;
        this.$currentLatLng = latLng;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocationPlaceHelper$getNearbyPlacesWithDetailApi$1$result$1(this.$request, this.$currentLatLng, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super List<LocationPlace>> continuation) {
        return ((LocationPlaceHelper$getNearbyPlacesWithDetailApi$1$result$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            FindCurrentPlaceRequest findCurrentPlaceRequest = this.$request;
            LatLng latLng = this.$currentLatLng;
            this.L$0 = findCurrentPlaceRequest;
            this.L$1 = latLng;
            this.label = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.m97627c(this));
            PlacesClient placesClient = LocationPlaceHelper.f59313b;
            Task<FindCurrentPlaceResponse> taskFindCurrentPlace = placesClient != null ? placesClient.findCurrentPlace(findCurrentPlaceRequest) : null;
            C26866a.a.m104898f(C26866a.f81698a, "LocationP", "getNearbyPlaces --findCurrentPlace", false, 4, null);
            if (taskFindCurrentPlace != null) {
                taskFindCurrentPlace.addOnCompleteListener(new C18174a(safeContinuation, latLng));
            }
            obj = safeContinuation.m97624a();
            if (obj == IntrinsicsKt.m97630f()) {
                DebugProbesKt.m97647c(this);
            }
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        return obj;
    }
}
