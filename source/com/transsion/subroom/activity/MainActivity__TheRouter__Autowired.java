package com.transsion.subroom.activity;

import androidx.annotation.Keep;
import com.therouter.TheRouter;
import com.therouter.router.C13677b;
import p410fg.InterfaceC23359a;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class MainActivity__TheRouter__Autowired {
    public static final String TAG = "Created by kymjs, and APT Version is 1.3.0.";
    public static final String THEROUTER_APT_VERSION = "1.3.0";

    public static void autowiredInject(Object obj) {
        if (obj instanceof MainActivity) {
            MainActivity mainActivity = (MainActivity) obj;
            for (InterfaceC23359a interfaceC23359a : TheRouter.m61776g()) {
                try {
                    Integer num = (Integer) interfaceC23359a.mo92175a("int", mainActivity, new C13677b("int", "secondTabIndex", 0, "", "com.transsion.subroom.activity.MainActivity", "mSecondTabIndex", false, "No desc."));
                    if (num != null) {
                        mainActivity.mSecondTabIndex = num.intValue();
                    }
                } catch (Exception e11) {
                    if (TheRouter.m61782m()) {
                        e11.printStackTrace();
                    }
                }
                try {
                    Integer num2 = (Integer) interfaceC23359a.mo92175a("int", mainActivity, new C13677b("int", "tabIndex", 0, "", "com.transsion.subroom.activity.MainActivity", "mInitTabId", false, "No desc."));
                    if (num2 != null) {
                        mainActivity.mInitTabId = num2.intValue();
                    }
                } catch (Exception e12) {
                    if (TheRouter.m61782m()) {
                        e12.printStackTrace();
                    }
                }
                try {
                    String str = (String) interfaceC23359a.mo92175a("java.lang.String", mainActivity, new C13677b("java.lang.String", "bottomTab", 0, "", "com.transsion.subroom.activity.MainActivity", "mBottomTabCode", false, "No desc."));
                    if (str != null) {
                        mainActivity.mBottomTabCode = str;
                    }
                } catch (Exception e13) {
                    if (TheRouter.m61782m()) {
                        e13.printStackTrace();
                    }
                }
                try {
                    String str2 = (String) interfaceC23359a.mo92175a("java.lang.String", mainActivity, new C13677b("java.lang.String", "topTab", 0, "", "com.transsion.subroom.activity.MainActivity", "mTopTabCode", false, "No desc."));
                    if (str2 != null) {
                        mainActivity.mTopTabCode = str2;
                    }
                } catch (Exception e14) {
                    if (TheRouter.m61782m()) {
                        e14.printStackTrace();
                    }
                }
            }
        }
    }
}
