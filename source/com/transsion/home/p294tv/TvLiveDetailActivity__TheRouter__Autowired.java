package com.transsion.home.p294tv;

import androidx.annotation.Keep;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.therouter.TheRouter;
import com.therouter.router.C13677b;
import p410fg.InterfaceC23359a;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class TvLiveDetailActivity__TheRouter__Autowired {
    public static final String TAG = "Created by kymjs, and APT Version is 1.3.0.";
    public static final String THEROUTER_APT_VERSION = "1.3.0";

    public static void autowiredInject(Object obj) {
        if (obj instanceof TvLiveDetailActivity) {
            TvLiveDetailActivity tvLiveDetailActivity = (TvLiveDetailActivity) obj;
            for (InterfaceC23359a interfaceC23359a : TheRouter.m61776g()) {
                try {
                    String str = (String) interfaceC23359a.mo92175a("java.lang.String", tvLiveDetailActivity, new C13677b("java.lang.String", TmcStartParams.KEY_CHANNEL_ID, 0, "", "com.transsion.home.tv.TvLiveDetailActivity", TmcStartParams.KEY_CHANNEL_ID, false, "No desc."));
                    if (str != null) {
                        tvLiveDetailActivity.com.cloud.tmc.integration.params.TmcStartParams.KEY_CHANNEL_ID java.lang.String = str;
                    }
                } catch (Exception e11) {
                    if (TheRouter.m61782m()) {
                        e11.printStackTrace();
                    }
                }
                try {
                    String str2 = (String) interfaceC23359a.mo92175a("java.lang.String", tvLiveDetailActivity, new C13677b("java.lang.String", "countryCode", 0, "", "com.transsion.home.tv.TvLiveDetailActivity", "countryCode", false, "No desc."));
                    if (str2 != null) {
                        tvLiveDetailActivity.countryCode = str2;
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
