package com.transsion.shorttv.p315ui.activity;

import androidx.annotation.Keep;
import com.therouter.TheRouter;
import com.therouter.router.C13677b;
import java.util.Iterator;
import p410fg.InterfaceC23359a;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class ShortTVFavoriteActivity__TheRouter__Autowired {
    public static final String TAG = "Created by kymjs, and APT Version is 1.3.0.";
    public static final String THEROUTER_APT_VERSION = "1.3.0";

    public static void autowiredInject(Object obj) {
        if (obj instanceof ShortTVFavoriteActivity) {
            ShortTVFavoriteActivity shortTVFavoriteActivity = (ShortTVFavoriteActivity) obj;
            Iterator it = TheRouter.m61776g().iterator();
            while (it.hasNext()) {
                try {
                    String str = (String) ((InterfaceC23359a) it.next()).mo92175a("java.lang.String", shortTVFavoriteActivity, new C13677b("java.lang.String", "ops", 0, "", "com.transsion.shorttv.ui.activity.ShortTVFavoriteActivity", "ops", false, "No desc."));
                    if (str != null) {
                        shortTVFavoriteActivity.ops = str;
                    }
                } catch (Exception e11) {
                    if (TheRouter.m61782m()) {
                        e11.printStackTrace();
                    }
                }
            }
        }
    }
}
