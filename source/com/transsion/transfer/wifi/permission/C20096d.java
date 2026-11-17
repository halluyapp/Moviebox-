package com.transsion.transfer.wifi.permission;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import com.blankj.utilcode.util.AbstractC5779c;
import com.blankj.utilcode.util.Utils;
import com.transsion.transfer.R$drawable;
import com.transsion.transfer.R$string;
import com.transsion.transfer.wifi.bean.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.transfer.wifi.permission.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C20096d {

    /* JADX INFO: renamed from: a */
    public static final C20096d f63935a = new C20096d();

    private C20096d() {
    }

    /* JADX INFO: renamed from: a */
    private final boolean m83427a(Context context) {
        if (context == null) {
            return false;
        }
        return Settings.System.canWrite(context);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    private final PermissionsBean m83428d(String str) {
        switch (str.hashCode()) {
            case -2078357533:
                if (!str.equals("android.permission.WRITE_SETTINGS")) {
                    return null;
                }
                int i11 = R$drawable.transfer_wifi_permissions_write_settings;
                String string = Utils.m27275a().getResources().getString(R$string.transfer_wifi_permissions_write_settings);
                String string2 = Utils.m27275a().getResources().getString(R$string.transfer_wifi_permissions_write_settings_tip);
                PermissionState permissionState = PermissionState.PERMISSION_DENIED;
                String string3 = Utils.m27275a().getResources().getString(R$string.wifi_setting);
                Intrinsics.m97801g(string3, "getString(...)");
                return new PermissionsBean(0, i11, string, string2, permissionState, "android.permission.WRITE_SETTINGS", string3);
            case -1888586689:
                if (!str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                    return null;
                }
                int i12 = R$drawable.transfer_wifi_permissions_location;
                String string4 = Utils.m27275a().getResources().getString(R$string.transfer_wifi_permissions_location_title);
                String string5 = Utils.m27275a().getResources().getString(R$string.transfer_wifi_permissions_location_tip);
                PermissionState permissionState2 = PermissionState.PERMISSION_DENIED;
                String string6 = Utils.m27275a().getResources().getString(R$string.wifi_setting);
                Intrinsics.m97801g(string6, "getString(...)");
                return new PermissionsBean(0, i12, string4, string5, permissionState2, "android.permission.ACCESS_FINE_LOCATION", string6);
            case -1208777349:
                if (!str.equals("mb.permission.WIFI")) {
                    return null;
                }
                int i13 = R$drawable.transfer_wifi_permissions_wifi;
                String string7 = Utils.m27275a().getResources().getString(R$string.transfer_wifi_permissions_wifi_title);
                String string8 = Utils.m27275a().getResources().getString(R$string.transfer_wifi_permissions_wifi_tip);
                PermissionState permissionState3 = PermissionState.PERMISSION_DENIED;
                String string9 = Utils.m27275a().getResources().getString(R$string.wifi_setting);
                Intrinsics.m97801g(string9, "getString(...)");
                return new PermissionsBean(0, i13, string7, string8, permissionState3, "mb.permission.WIFI", string9);
            case -909527021:
                if (!str.equals("android.permission.NEARBY_WIFI_DEVICES") || Build.VERSION.SDK_INT < 33) {
                    return null;
                }
                int i14 = R$drawable.transfer_wifi_permissions_devices;
                String string10 = Utils.m27275a().getResources().getString(R$string.transfer_wifi_permissions_device_title);
                String string11 = Utils.m27275a().getResources().getString(R$string.transfer_wifi_permissions_device_tip);
                PermissionState permissionState4 = PermissionState.PERMISSION_DENIED;
                String string12 = Utils.m27275a().getResources().getString(R$string.wifi_setting);
                Intrinsics.m97801g(string12, "getString(...)");
                return new PermissionsBean(0, i14, string10, string11, permissionState4, "android.permission.NEARBY_WIFI_DEVICES", string12);
            case 463403621:
                if (!str.equals("android.permission.CAMERA")) {
                    return null;
                }
                int i15 = R$drawable.transfer_wifi_permissions_camera;
                String string13 = Utils.m27275a().getResources().getString(R$string.transfer_wifi_permissions_camera_title);
                String string14 = Utils.m27275a().getResources().getString(R$string.transfer_wifi_permissions_camera_tip);
                PermissionState permissionState5 = PermissionState.PERMISSION_DENIED;
                String string15 = Utils.m27275a().getResources().getString(R$string.wifi_setting);
                Intrinsics.m97801g(string15, "getString(...)");
                return new PermissionsBean(0, i15, string13, string14, permissionState5, "android.permission.CAMERA", string15);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m83429b(String permission) {
        Intrinsics.m97802h(permission, "permission");
        return Utils.m27275a().checkSelfPermission(permission) == 0;
    }

    /* JADX INFO: renamed from: c */
    public final List m83430c() {
        ArrayList<PermissionsBean> arrayList = new ArrayList();
        PermissionsBean permissionsBeanM83428d = m83428d("android.permission.CAMERA");
        if (permissionsBeanM83428d != null) {
            arrayList.add(permissionsBeanM83428d);
        }
        arrayList.addAll(m83431e());
        for (PermissionsBean permissionsBean : arrayList) {
            if (f63935a.m83432f(permissionsBean.getPermission())) {
                permissionsBean.setState(PermissionState.PERMISSION_GRANTED);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final List m83431e() {
        PermissionsBean permissionsBeanM83428d;
        ArrayList<PermissionsBean> arrayList = new ArrayList();
        PermissionsBean permissionsBeanM83428d2 = m83428d("mb.permission.WIFI");
        if (permissionsBeanM83428d2 != null) {
            arrayList.add(permissionsBeanM83428d2);
        }
        int i11 = Build.VERSION.SDK_INT;
        PermissionsBean permissionsBeanM83428d3 = m83428d("android.permission.WRITE_SETTINGS");
        if (permissionsBeanM83428d3 != null) {
            arrayList.add(permissionsBeanM83428d3);
        }
        PermissionsBean permissionsBeanM83428d4 = m83428d("android.permission.ACCESS_FINE_LOCATION");
        if (permissionsBeanM83428d4 != null) {
            arrayList.add(permissionsBeanM83428d4);
        }
        if (i11 >= 33 && (permissionsBeanM83428d = m83428d("android.permission.NEARBY_WIFI_DEVICES")) != null) {
            arrayList.add(permissionsBeanM83428d);
        }
        for (PermissionsBean permissionsBean : arrayList) {
            if (f63935a.m83432f(permissionsBean.getPermission())) {
                permissionsBean.setState(PermissionState.PERMISSION_GRANTED);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m83432f(String permission) {
        Intrinsics.m97802h(permission, "permission");
        if (!Intrinsics.m97797c(permission, "mb.permission.WIFI")) {
            return Intrinsics.m97797c(permission, "android.permission.WRITE_SETTINGS") ? m83427a(Utils.m27275a()) : m83429b(permission);
        }
        Object systemService = Utils.m27275a().getApplicationContext().getSystemService("wifi");
        Intrinsics.m97800f(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        return ((WifiManager) systemService).isWifiEnabled();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m83433g(List list) {
        if (list == null) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!f63935a.m83432f(((PermissionsBean) it.next()).getPermission())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m83434h(AppCompatActivity activity) {
        Intrinsics.m97802h(activity, "activity");
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", AbstractC5779c.m27328e(), null));
            activity.startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m83435i(AppCompatActivity activity, String permission, int i11) {
        Intrinsics.m97802h(activity, "activity");
        Intrinsics.m97802h(permission, "permission");
        ActivityCompat.m11447g(activity, new String[]{permission}, i11);
    }
}
