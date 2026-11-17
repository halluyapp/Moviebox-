package com.transsion.shorttv._channel.p312ui.activity;

import androidx.annotation.Keep;
import com.therouter.TheRouter;
import com.therouter.router.C13677b;
import p410fg.InterfaceC23359a;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class ShortTvPlayListActivity__TheRouter__Autowired {
    public static final String TAG = "Created by kymjs, and APT Version is 1.3.0.";
    public static final String THEROUTER_APT_VERSION = "1.3.0";

    public static void autowiredInject(Object obj) {
        if (obj instanceof ShortTvPlayListActivity) {
            ShortTvPlayListActivity shortTvPlayListActivity = (ShortTvPlayListActivity) obj;
            for (InterfaceC23359a interfaceC23359a : TheRouter.m61776g()) {
                try {
                    String str = (String) interfaceC23359a.mo92175a("java.lang.String", shortTvPlayListActivity, new C13677b("java.lang.String", "category", 0, "", "com.transsion.shorttv._channel.ui.activity.ShortTvPlayListActivity", "category", false, "No desc."));
                    if (str != null) {
                        shortTvPlayListActivity.category = str;
                    }
                } catch (Exception e11) {
                    if (TheRouter.m61782m()) {
                        e11.printStackTrace();
                    }
                }
                try {
                    String str2 = (String) interfaceC23359a.mo92175a("java.lang.String", shortTvPlayListActivity, new C13677b("java.lang.String", "label", 0, "", "com.transsion.shorttv._channel.ui.activity.ShortTvPlayListActivity", "label", false, "No desc."));
                    if (str2 != null) {
                        shortTvPlayListActivity.label = str2;
                    }
                } catch (Exception e12) {
                    if (TheRouter.m61782m()) {
                        e12.printStackTrace();
                    }
                }
                try {
                    String str3 = (String) interfaceC23359a.mo92175a("java.lang.String", shortTvPlayListActivity, new C13677b("java.lang.String", "recType", 0, "", "com.transsion.shorttv._channel.ui.activity.ShortTvPlayListActivity", "recType", false, "No desc."));
                    if (str3 != null) {
                        shortTvPlayListActivity.recType = str3;
                    }
                } catch (Exception e13) {
                    if (TheRouter.m61782m()) {
                        e13.printStackTrace();
                    }
                }
            }
        }
    }
}
