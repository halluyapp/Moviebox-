package com.transsion.room.activity;

import androidx.annotation.Keep;
import com.therouter.TheRouter;
import com.therouter.router.C13677b;
import p410fg.InterfaceC23359a;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class RoomListActivity__TheRouter__Autowired {
    public static final String TAG = "Created by kymjs, and APT Version is 1.3.0.";
    public static final String THEROUTER_APT_VERSION = "1.3.0";

    public static void autowiredInject(Object obj) {
        if (obj instanceof RoomListActivity) {
            RoomListActivity roomListActivity = (RoomListActivity) obj;
            for (InterfaceC23359a interfaceC23359a : TheRouter.m61776g()) {
                try {
                    Boolean bool = (Boolean) interfaceC23359a.mo92175a("boolean", roomListActivity, new C13677b("boolean", "is_select_room", 0, "", "com.transsion.room.activity.RoomListActivity", "isSelectRoom", false, "No desc."));
                    if (bool != null) {
                        roomListActivity.isSelectRoom = bool.booleanValue();
                    }
                } catch (Exception e11) {
                    if (TheRouter.m61782m()) {
                        e11.printStackTrace();
                    }
                }
                try {
                    Integer num = (Integer) interfaceC23359a.mo92175a("int", roomListActivity, new C13677b("int", "index", 0, "", "com.transsion.room.activity.RoomListActivity", "index", false, "No desc."));
                    if (num != null) {
                        roomListActivity.index = num.intValue();
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
