package com.transsion.room.helper;

import android.app.Activity;
import android.app.PendingIntent;
import android.location.LocationManager;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.InterfaceC0248a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.Utils;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p393f.C23285k;
import p415fq.InterfaceC23412c;

/* JADX INFO: renamed from: com.transsion.room.helper.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C18182e implements InterfaceC23412c {

    /* JADX INFO: renamed from: a */
    private final Fragment f59324a;

    /* JADX INFO: renamed from: b */
    private Function1 f59325b;

    /* JADX INFO: renamed from: c */
    private final AbstractC0249b f59326c;

    public C18182e(Fragment fragment) {
        Intrinsics.m97802h(fragment, "fragment");
        this.f59324a = fragment;
        AbstractC0249b abstractC0249bRegisterForActivityResult = fragment.registerForActivityResult(new C23285k(), new InterfaceC0248a() { // from class: com.transsion.room.helper.a
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                C18182e.m77084g(this.f59320a, (ActivityResult) obj);
            }
        });
        Intrinsics.m97801g(abstractC0249bRegisterForActivityResult, "registerForActivityResult(...)");
        this.f59326c = abstractC0249bRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m77084g(C18182e c18182e, ActivityResult result) {
        Intrinsics.m97802h(result, "result");
        Function1 function1 = c18182e.f59325b;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(result.getResultCode() == -1));
        }
        c18182e.f59325b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Unit m77085h(Function1 function1, LocationSettingsResponse locationSettingsResponse) {
        function1.invoke(Boolean.TRUE);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m77086i(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m77087j(C18182e c18182e, Exception exception) {
        Intrinsics.m97802h(exception, "exception");
        if (exception instanceof ResolvableApiException) {
            try {
                PendingIntent resolution = ((ResolvableApiException) exception).getResolution();
                Intrinsics.m97801g(resolution, "getResolution(...)");
                c18182e.f59326c.m999a(new IntentSenderRequest.C0245a(resolution).m993a());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // p415fq.InterfaceC23412c
    /* JADX INFO: renamed from: a */
    public void mo77088a(final Function1 callback) {
        Intrinsics.m97802h(callback, "callback");
        this.f59325b = callback;
        LocationRequest locationRequestCreate = LocationRequest.create();
        locationRequestCreate.setPriority(100);
        Intrinsics.m97801g(locationRequestCreate, "apply(...)");
        LocationSettingsRequest.Builder builderAddLocationRequest = new LocationSettingsRequest.Builder().addLocationRequest(locationRequestCreate);
        Intrinsics.m97801g(builderAddLocationRequest, "addLocationRequest(...)");
        FragmentActivity activity = this.f59324a.getActivity();
        if (activity == null) {
            callback.invoke(Boolean.FALSE);
            return;
        }
        SettingsClient settingsClient = LocationServices.getSettingsClient((Activity) activity);
        Intrinsics.m97801g(settingsClient, "getSettingsClient(...)");
        Task<LocationSettingsResponse> taskCheckLocationSettings = settingsClient.checkLocationSettings(builderAddLocationRequest.build());
        Intrinsics.m97801g(taskCheckLocationSettings, "checkLocationSettings(...)");
        final Function1 function1 = new Function1() { // from class: com.transsion.room.helper.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C18182e.m77085h(callback, (LocationSettingsResponse) obj);
            }
        };
        taskCheckLocationSettings.addOnSuccessListener(new OnSuccessListener() { // from class: com.transsion.room.helper.c
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C18182e.m77086i(function1, obj);
            }
        });
        taskCheckLocationSettings.addOnFailureListener(new OnFailureListener() { // from class: com.transsion.room.helper.d
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C18182e.m77087j(this.f59323a, exc);
            }
        });
    }

    @Override // p415fq.InterfaceC23412c
    /* JADX INFO: renamed from: b */
    public boolean mo77089b() {
        LocationManager locationManager = (LocationManager) Utils.m27275a().getSystemService(RequestParameters.SUBRESOURCE_LOCATION);
        Intrinsics.m97799e(locationManager);
        return locationManager.isProviderEnabled("gps");
    }
}
