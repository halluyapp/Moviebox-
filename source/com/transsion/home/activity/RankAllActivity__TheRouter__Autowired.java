package com.transsion.home.activity;

import androidx.annotation.Keep;
import com.therouter.TheRouter;
import com.therouter.router.C13677b;
import p410fg.InterfaceC23359a;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class RankAllActivity__TheRouter__Autowired {
    public static final String TAG = "Created by kymjs, and APT Version is 1.3.0.";
    public static final String THEROUTER_APT_VERSION = "1.3.0";

    public static void autowiredInject(Object obj) {
        if (obj instanceof RankAllActivity) {
            RankAllActivity rankAllActivity = (RankAllActivity) obj;
            for (InterfaceC23359a interfaceC23359a : TheRouter.m61776g()) {
                try {
                    Integer num = (Integer) interfaceC23359a.mo92175a("int", rankAllActivity, new C13677b("int", "tabId", 0, "", "com.transsion.home.activity.RankAllActivity", "tabId", false, "No desc."));
                    if (num != null) {
                        rankAllActivity.tabId = num.intValue();
                    }
                } catch (Exception e11) {
                    if (TheRouter.m61782m()) {
                        e11.printStackTrace();
                    }
                }
                try {
                    String str = (String) interfaceC23359a.mo92175a("java.lang.String", rankAllActivity, new C13677b("java.lang.String", "category", 0, "", "com.transsion.home.activity.RankAllActivity", "requestCategory", false, "No desc."));
                    if (str != null) {
                        rankAllActivity.requestCategory = str;
                    }
                } catch (Exception e12) {
                    if (TheRouter.m61782m()) {
                        e12.printStackTrace();
                    }
                }
                try {
                    String str2 = (String) interfaceC23359a.mo92175a("java.lang.String", rankAllActivity, new C13677b("java.lang.String", "defaultCategory", 0, "", "com.transsion.home.activity.RankAllActivity", "defaultCategory", false, "No desc."));
                    if (str2 != null) {
                        rankAllActivity.defaultCategory = str2;
                    }
                } catch (Exception e13) {
                    if (TheRouter.m61782m()) {
                        e13.printStackTrace();
                    }
                }
                try {
                    String str3 = (String) interfaceC23359a.mo92175a("java.lang.String", rankAllActivity, new C13677b("java.lang.String", "rankingListId", 0, "", "com.transsion.home.activity.RankAllActivity", "rankingListId", false, "No desc."));
                    if (str3 != null) {
                        rankAllActivity.rankingListId = str3;
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
