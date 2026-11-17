package com.transsion.room.activity;

import androidx.annotation.Keep;
import com.therouter.TheRouter;
import com.therouter.router.C13677b;
import p410fg.InterfaceC23359a;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class RoomHomeActivity__TheRouter__Autowired {
    public static final String TAG = "Created by kymjs, and APT Version is 1.3.0.";
    public static final String THEROUTER_APT_VERSION = "1.3.0";

    public static void autowiredInject(Object obj) {
        if (obj instanceof RoomHomeActivity) {
            RoomHomeActivity roomHomeActivity = (RoomHomeActivity) obj;
            for (InterfaceC23359a interfaceC23359a : TheRouter.m61776g()) {
                try {
                    String str = (String) interfaceC23359a.mo92175a("java.lang.String", roomHomeActivity, new C13677b("java.lang.String", "ops", 0, "", "com.transsion.room.activity.RoomHomeActivity", "insertPostOps", false, "No desc."));
                    if (str != null) {
                        roomHomeActivity.insertPostOps = str;
                    }
                } catch (Exception e11) {
                    if (TheRouter.m61782m()) {
                        e11.printStackTrace();
                    }
                }
                try {
                    String str2 = (String) interfaceC23359a.mo92175a("java.lang.String", roomHomeActivity, new C13677b("java.lang.String", "post_id", 0, "", "com.transsion.room.activity.RoomHomeActivity", "insertPostId", false, "No desc."));
                    if (str2 != null) {
                        roomHomeActivity.insertPostId = str2;
                    }
                } catch (Exception e12) {
                    if (TheRouter.m61782m()) {
                        e12.printStackTrace();
                    }
                }
            }
        }
    }
}
