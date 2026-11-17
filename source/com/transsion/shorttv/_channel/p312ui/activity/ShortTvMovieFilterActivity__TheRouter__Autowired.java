package com.transsion.shorttv._channel.p312ui.activity;

import androidx.annotation.Keep;
import com.therouter.TheRouter;
import com.therouter.router.C13677b;
import p410fg.InterfaceC23359a;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class ShortTvMovieFilterActivity__TheRouter__Autowired {
    public static final String TAG = "Created by kymjs, and APT Version is 1.3.0.";
    public static final String THEROUTER_APT_VERSION = "1.3.0";

    public static void autowiredInject(Object obj) {
        if (obj instanceof ShortTvMovieFilterActivity) {
            ShortTvMovieFilterActivity shortTvMovieFilterActivity = (ShortTvMovieFilterActivity) obj;
            for (InterfaceC23359a interfaceC23359a : TheRouter.m61776g()) {
                try {
                    Boolean bool = (Boolean) interfaceC23359a.mo92175a("boolean", shortTvMovieFilterActivity, new C13677b("boolean", "showViewPager", 0, "", "com.transsion.shorttv._channel.ui.activity.ShortTvMovieFilterActivity", "showViewPager", false, "No desc."));
                    if (bool != null) {
                        shortTvMovieFilterActivity.showViewPager = bool.booleanValue();
                    }
                } catch (Exception e11) {
                    if (TheRouter.m61782m()) {
                        e11.printStackTrace();
                    }
                }
                try {
                    Integer num = (Integer) interfaceC23359a.mo92175a("int", shortTvMovieFilterActivity, new C13677b("int", "tab_id", 0, "", "com.transsion.shorttv._channel.ui.activity.ShortTvMovieFilterActivity", "tabId", false, "No desc."));
                    if (num != null) {
                        shortTvMovieFilterActivity.tabId = num.intValue();
                    }
                } catch (Exception e12) {
                    if (TheRouter.m61782m()) {
                        e12.printStackTrace();
                    }
                }
                try {
                    String str = (String) interfaceC23359a.mo92175a("java.lang.String", shortTvMovieFilterActivity, new C13677b("java.lang.String", "filterType", 0, "", "com.transsion.shorttv._channel.ui.activity.ShortTvMovieFilterActivity", "mFilterJson", false, "No desc."));
                    if (str != null) {
                        shortTvMovieFilterActivity.mFilterJson = str;
                    }
                } catch (Exception e13) {
                    if (TheRouter.m61782m()) {
                        e13.printStackTrace();
                    }
                }
                try {
                    String str2 = (String) interfaceC23359a.mo92175a("java.lang.String", shortTvMovieFilterActivity, new C13677b("java.lang.String", "tabCode", 0, "", "com.transsion.shorttv._channel.ui.activity.ShortTvMovieFilterActivity", "tabCode", false, "No desc."));
                    if (str2 != null) {
                        shortTvMovieFilterActivity.tabCode = str2;
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
