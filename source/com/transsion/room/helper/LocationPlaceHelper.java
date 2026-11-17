package com.transsion.room.helper;

import android.app.Activity;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Looper;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;
import cf.C5088c;
import com.blankj.utilcode.util.Utils;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$drawable;
import com.p282tn.lib.widget.R$string;
import com.permissionx.guolindev.callback.PermissionDialogClickType;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.room.api.bean.LocationPlace;
import gf.C23533f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p347df.InterfaceC22976a;
import p347df.InterfaceC22977b;
import p347df.InterfaceC22978c;
import p409ff.C23356a;
import p913xm.C28615f;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class LocationPlaceHelper {

    /* JADX INFO: renamed from: a */
    public static final LocationPlaceHelper f59312a = new LocationPlaceHelper();

    /* JADX INFO: renamed from: b */
    private static PlacesClient f59313b;

    /* JADX INFO: renamed from: c */
    private static LocationCallback f59314c;

    /* JADX INFO: renamed from: d */
    private static int f59315d;

    private LocationPlaceHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final void m77052A(final FusedLocationProviderClient fusedLocationProviderClient) {
        int i11 = f59315d;
        if (i11 >= 3) {
            C26866a.f81698a.m104919u("LocationP", "Location--update---- removeLocationUpdates, 超过上限3次，不再移除", true);
            return;
        }
        f59315d = i11 + 1;
        LocationCallback locationCallback = f59314c;
        if (locationCallback != null) {
            C26866a.f81698a.m104919u("LocationP", "Location--update---- removeLocationUpdates", true);
            fusedLocationProviderClient.removeLocationUpdates(locationCallback).addOnCompleteListener(new OnCompleteListener() { // from class: com.transsion.room.helper.k
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    LocationPlaceHelper.m77053B(fusedLocationProviderClient, task);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m77053B(FusedLocationProviderClient fusedLocationProviderClient, Task task) {
        Intrinsics.m97802h(task, "task");
        if (task.isSuccessful()) {
            f59314c = null;
            C26866a.a.m104910z(C26866a.f81698a, "LocationP", "Location--update----成功移除监听", false, 4, null);
        } else {
            C26866a.a.m104901l(C26866a.f81698a, "LocationP", "Location--update----移除监听失败", false, 4, null);
            f59312a.m77052A(fusedLocationProviderClient);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX INFO: renamed from: l */
    public final LocationPlace m77065l(double d11, double d12, Address address) {
        String addressLine;
        boolean z11;
        Integer numValueOf;
        String countryName;
        if ((address != null ? address.getMaxAddressLineIndex() : 0) >= 0) {
            addressLine = address != null ? address.getAddressLine(0) : null;
        } else {
            addressLine = "";
        }
        if (addressLine == null || addressLine.length() == 0) {
            if (addressLine != null) {
                if (address == null || (countryName = address.getCountryName()) == null) {
                    countryName = "-";
                }
                numValueOf = Integer.valueOf(StringsKt.m98156o0(addressLine, countryName, 0, false, 6, null));
            } else {
                numValueOf = null;
            }
            if ((numValueOf != null ? numValueOf.intValue() : 0) < 5) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        ArrayList arrayList = new ArrayList();
        if ((address != null ? address.getLocality() : null) != null) {
            String locality = address.getLocality();
            Intrinsics.m97801g(locality, "getLocality(...)");
            if (locality.length() > 0) {
                String locality2 = address.getLocality();
                Intrinsics.m97801g(locality2, "getLocality(...)");
                arrayList.add(locality2);
            }
        }
        if ((address != null ? address.getSubLocality() : null) != null) {
            String subLocality = address.getSubLocality();
            Intrinsics.m97801g(subLocality, "getSubLocality(...)");
            if (subLocality.length() > 0) {
                String subLocality2 = address.getSubLocality();
                Intrinsics.m97801g(subLocality2, "getSubLocality(...)");
                arrayList.add(subLocality2);
            }
        }
        if ((address != null ? address.getThoroughfare() : null) != null) {
            String thoroughfare = address.getThoroughfare();
            Intrinsics.m97801g(thoroughfare, "getThoroughfare(...)");
            if (thoroughfare.length() > 0) {
                String thoroughfare2 = address.getThoroughfare();
                Intrinsics.m97801g(thoroughfare2, "getThoroughfare(...)");
                arrayList.add(thoroughfare2);
            }
        }
        if ((address != null ? address.getFeatureName() : null) != null) {
            String featureName = address.getFeatureName();
            Intrinsics.m97801g(featureName, "getFeatureName(...)");
            if (featureName.length() > 0) {
                String featureName2 = address.getFeatureName();
                Intrinsics.m97801g(featureName2, "getFeatureName(...)");
                arrayList.add(featureName2);
            }
        }
        String strS0 = z11 ? CollectionsKt.m97369s0(arrayList, " ", null, null, 0, null, null, 62, null) : CollectionsKt.m97369s0(CollectionsKt.m97540U(arrayList), " ", null, null, 0, null, null, 62, null);
        LocationPlace locationPlace = new LocationPlace(null, null, null, null, 15, null);
        locationPlace.setName(strS0);
        locationPlace.setDistance("<1m");
        locationPlace.setAddress(addressLine);
        locationPlace.setLocationAddress(address);
        locationPlace.setCountryCode(address != null ? address.getCountryCode() : null);
        locationPlace.setLat(Double.valueOf(d11));
        locationPlace.setLon(Double.valueOf(d12));
        return locationPlace;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final Address m77066m(double d11, double d12) {
        try {
            List<Address> fromLocation = new Geocoder(Utils.m27275a(), Locale.getDefault()).getFromLocation(d11, d12, 1);
            List<Address> list = fromLocation;
            if (list != null && !list.isEmpty()) {
                return fromLocation.get(0);
            }
            return null;
        } catch (Throwable th2) {
            C26866a.a.m104901l(C26866a.f81698a, "LocationP", "Location-------------- ll2address error:" + th2, false, 4, null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m77067o(FusedLocationProviderClient fusedLocationProviderClient, Function1 function1, Task task) {
        Intrinsics.m97802h(task, "task");
        if (!task.isSuccessful()) {
            C26866a.f81698a.m104915i("LocationP", "Location-------------- fail: " + task.getException() + ", do update", true);
            f59312a.m77075y(fusedLocationProviderClient, function1);
            return;
        }
        Location location = (Location) task.getResult();
        if (location == null) {
            C26866a.f81698a.m104915i("LocationP", "Location-------------- fail: location null---do update", true);
            f59312a.m77075y(fusedLocationProviderClient, function1);
            return;
        }
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        C26866a.f81698a.m104912c("LocationP", "Location--------------1 success " + longitude + ", :" + latitude, true);
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new LocationPlaceHelper$getCurrentLocation$2$1(latitude, longitude, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: q */
    private final void m77068q(double d11, double d12, Function1 function1) {
        String strM77069r = m77069r();
        if (strM77069r == null || strM77069r.length() == 0) {
            C26866a.a.m104898f(C26866a.f81698a, "LocationP", "getNearbyPlaces apiKey isNullOrEmpty", false, 4, null);
            function1.invoke(null);
            return;
        }
        if (!Places.isInitialized()) {
            C26866a.a.m104905r(C26866a.f81698a, "LocationP", new String[]{"getNearbyPlaces initialize place"}, false, 4, null);
            Places.initialize(Utils.m27275a(), strM77069r);
        }
        if (f59313b == null) {
            f59313b = Places.createClient(Utils.m27275a());
        }
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new LocationPlaceHelper$getNearbyPlacesWithDetailApi$1(function1, FindCurrentPlaceRequest.newInstance(CollectionsKt.m97509o(Place.Field.NAME, Place.Field.ADDRESS, Place.Field.LAT_LNG)), new LatLng(d11, d12), null), 3, null);
    }

    /* JADX INFO: renamed from: r */
    private final String m77069r() {
        String string;
        ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("sa_lo_place_key", true);
        String value = configBeanM110360c != null ? configBeanM110360c.getValue() : null;
        if (value == null || value.length() == 0 || (string = value.toString()) == null) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: s */
    private final int m77070s() {
        Integer numV;
        ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("sa_lo_place_api", true);
        String value = configBeanM110360c != null ? configBeanM110360c.getValue() : null;
        if (value == null || value.length() == 0 || (numV = StringsKt.m98216v(value)) == null) {
            return 1;
        }
        return numV.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m77071u(boolean z11, C23533f scope, List deniedList, boolean z12, boolean z13) {
        Intrinsics.m97802h(scope, "scope");
        Intrinsics.m97802h(deniedList, "deniedList");
        if (!z12) {
            C26866a.a.m104898f(C26866a.f81698a, "LocationP", "location 请求权限之后，", false, 4, null);
            return;
        }
        if (!z13) {
            C26866a.a.m104898f(C26866a.f81698a, "LocationP", "直接请求权限", false, 4, null);
            scope.m93261b(deniedList);
        } else if (!z11) {
            scope.m93260a(deniedList);
        } else {
            C26866a.a.m104898f(C26866a.f81698a, "LocationP", "请求权限，需要跳到设置页，先展示提示弹窗", false, 4, null);
            scope.m93262c(deniedList, new C23356a(null, Utils.m27275a().getString(R$string.location_permission_dialog_tips), Utils.m27275a().getString(R$string.Enable), Integer.valueOf(R$drawable.ic_location_permission_tips), Integer.valueOf(R$color.white_20), 1, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m77072v(BaseDialog baseDialog, Boolean bool, PermissionDialogClickType permissionDialogClickType) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m77073w(FragmentActivity fragmentActivity, Function1 function1, boolean z11, List grantedList, List deniedList) {
        Intrinsics.m97802h(grantedList, "grantedList");
        Intrinsics.m97802h(deniedList, "deniedList");
        if (z11 && grantedList.size() == 1 && !ActivityCompat.m11450j(fragmentActivity, (String) grantedList.get(0))) {
            C5088c.f17563a.m23819d().putBoolean((String) grantedList.get(0), false);
        }
        C26866a.a.m104898f(C26866a.f81698a, "LocationP", "location 请求权限结果:" + z11, false, 4, null);
        function1.invoke(Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: x */
    private final void m77074x(Double d11, Double d12, Function1 function1) {
        if (d11 == null || d12 == null) {
            function1.invoke(null);
            return;
        }
        String strM77069r = m77069r();
        if (strM77069r == null || strM77069r.length() == 0) {
            function1.invoke(null);
            return;
        }
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new LocationPlaceHelper$searchNearbyPlaces$1(d11 + "," + d12, 20000, strM77069r, d11, d12, function1, null), 3, null);
    }

    /* JADX INFO: renamed from: y */
    private final void m77075y(final FusedLocationProviderClient fusedLocationProviderClient, final Function1 function1) {
        LocationRequest locationRequestBuild = new LocationRequest.Builder(100, 10000L).setWaitForAccurateLocation(true).setMinUpdateIntervalMillis(5000L).build();
        Intrinsics.m97801g(locationRequestBuild, "build(...)");
        LocationCallback locationCallback = new LocationCallback() { // from class: com.transsion.room.helper.LocationPlaceHelper$startRealTimeUpdates$1
            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationAvailability(LocationAvailability availability) {
                Intrinsics.m97802h(availability, "availability");
                if (availability.isLocationAvailable()) {
                    return;
                }
                C26866a.f81698a.m104921x("LocationP", "Location services unavailable", true);
            }

            @Override // com.google.android.gms.location.LocationCallback
            public void onLocationResult(LocationResult result) {
                Intrinsics.m97802h(result, "result");
                Location lastLocation = result.getLastLocation();
                if (lastLocation != null) {
                    FusedLocationProviderClient fusedLocationProviderClient2 = fusedLocationProviderClient;
                    Function1 function2 = function1;
                    LocationPlaceHelper.f59315d = 0;
                    LocationPlaceHelper.f59312a.m77052A(fusedLocationProviderClient2);
                    double latitude = lastLocation.getLatitude();
                    double longitude = lastLocation.getLongitude();
                    C26866a.f81698a.m104912c("LocationP", "Location--update--------------1 success " + latitude + ", :" + longitude, true);
                    if (AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new LocationPlaceHelper$startRealTimeUpdates$1$onLocationResult$1$1(latitude, longitude, function2, null), 3, null) != null) {
                        return;
                    }
                }
                AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new LocationPlaceHelper$startRealTimeUpdates$1$onLocationResult$2$1(function1, null), 3, null);
            }
        };
        f59314c = locationCallback;
        Intrinsics.m97800f(locationCallback, "null cannot be cast to non-null type com.google.android.gms.location.LocationCallback");
        fusedLocationProviderClient.requestLocationUpdates(locationRequestBuild, locationCallback, Looper.getMainLooper()).addOnFailureListener(new OnFailureListener() { // from class: com.transsion.room.helper.j
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                LocationPlaceHelper.m77076z(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final void m77076z(Exception e11) {
        Intrinsics.m97802h(e11, "e");
        C26866a.a.m104901l(C26866a.f81698a, "LocationP", "Updates request failed: " + e11.getMessage(), false, 4, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m77077n(FragmentActivity activity, final Function1 callback) {
        Double dS;
        Intrinsics.m97802h(activity, "activity");
        Intrinsics.m97802h(callback, "callback");
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "LocationP", "Location-------------- start getCurrentLocation", false, 4, null);
        String string = C14496b.f50966a.m65344b().getString("key_lo_mock_test_lab_lat", "");
        if (string != null && string.length() != 0 && StringsKt.m98132c0(string, "|", false, 2, null)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                List listS0 = StringsKt.m98117S0(string, new String[]{"|"}, false, 0, 6, null);
                Double dS2 = StringsKt.m98213s((String) listS0.get(0));
                if (dS2 != null && (dS = StringsKt.m98213s((String) listS0.get(1))) != null) {
                    String str = (String) listS0.get(2);
                    String str2 = (String) listS0.get(3);
                    LocationPlace locationPlace = new LocationPlace(null, null, null, null, 15, null);
                    locationPlace.setName(str);
                    locationPlace.setDistance("<1m");
                    locationPlace.setAddress(str2);
                    locationPlace.setLat(dS2);
                    locationPlace.setLon(dS);
                    aVar.m104912c("LocationP", "Location-------------- mock 的定位数据 name:" + str + ",address:" + str2 + ".不使用实际定位,需要真实定位请求清楚mock数据", true);
                    callback.invoke(locationPlace);
                    return;
                }
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }
        final FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient((Activity) activity);
        Intrinsics.m97801g(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        fusedLocationProviderClient.getLastLocation().addOnCompleteListener(activity, new OnCompleteListener() { // from class: com.transsion.room.helper.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                LocationPlaceHelper.m77067o(fusedLocationProviderClient, callback, task);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m77078p(double d11, double d12, Function1 callback) {
        Intrinsics.m97802h(callback, "callback");
        int iM77070s = m77070s();
        if (iM77070s == 0) {
            C26866a.f81698a.m104912c("LocationP", "place api use detail", true);
            m77068q(d11, d12, callback);
        } else {
            if (iM77070s == 1) {
                C26866a.f81698a.m104912c("LocationP", "place api use search", true);
                m77074x(Double.valueOf(d11), Double.valueOf(d12), callback);
                return;
            }
            C26866a.f81698a.m104912c("LocationP", "place api ,null " + iM77070s, true);
            callback.invoke(null);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m77079t(final FragmentActivity activity, final boolean z11, final Function1 callback) {
        Intrinsics.m97802h(activity, "activity");
        Intrinsics.m97802h(callback, "callback");
        C5088c.f17563a.m23820e(activity).m23814b("android.permission.ACCESS_FINE_LOCATION").mo93266b().mo93265a(new InterfaceC22977b() { // from class: com.transsion.room.helper.g
            @Override // p347df.InterfaceC22977b
            /* JADX INFO: renamed from: a */
            public final void mo77090a(C23533f c23533f, List list, boolean z12, boolean z13) {
                LocationPlaceHelper.m77071u(z11, c23533f, list, z12, z13);
            }
        }).mo93267c(new InterfaceC22976a() { // from class: com.transsion.room.helper.h
            @Override // p347df.InterfaceC22976a
            /* JADX INFO: renamed from: a */
            public final void mo77091a(BaseDialog baseDialog, Boolean bool, PermissionDialogClickType permissionDialogClickType) {
                LocationPlaceHelper.m77072v(baseDialog, bool, permissionDialogClickType);
            }
        }).mo93268d(new InterfaceC22978c() { // from class: com.transsion.room.helper.i
            @Override // p347df.InterfaceC22978c
            /* JADX INFO: renamed from: a */
            public final void mo77092a(boolean z12, List list, List list2) {
                LocationPlaceHelper.m77073w(activity, callback, z12, list, list2);
            }
        });
    }
}
