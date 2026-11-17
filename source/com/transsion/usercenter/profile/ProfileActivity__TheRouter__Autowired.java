package com.transsion.usercenter.profile;

import androidx.annotation.Keep;
import com.therouter.TheRouter;
import com.therouter.router.C13677b;
import com.transsnet.loginapi.bean.UserInfo;
import p410fg.InterfaceC23359a;

/* JADX INFO: loaded from: classes7.dex */
@Keep
public class ProfileActivity__TheRouter__Autowired {
    public static final String TAG = "Created by kymjs, and APT Version is 1.3.0.";
    public static final String THEROUTER_APT_VERSION = "1.3.0";

    public static void autowiredInject(Object obj) {
        if (obj instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) obj;
            for (InterfaceC23359a interfaceC23359a : TheRouter.m61776g()) {
                try {
                    UserInfo userInfo = (UserInfo) interfaceC23359a.mo92175a("com.transsnet.loginapi.bean.UserInfo", profileActivity, new C13677b("com.transsnet.loginapi.bean.UserInfo", "userInfo", 0, "", "com.transsion.usercenter.profile.ProfileActivity", "userInfo", false, "No desc."));
                    if (userInfo != null) {
                        profileActivity.userInfo = userInfo;
                    }
                } catch (Exception e11) {
                    if (TheRouter.m61782m()) {
                        e11.printStackTrace();
                    }
                }
                try {
                    String str = (String) interfaceC23359a.mo92175a("java.lang.String", profileActivity, new C13677b("java.lang.String", "userId", 0, "", "com.transsion.usercenter.profile.ProfileActivity", "userId", false, "No desc."));
                    if (str != null) {
                        profileActivity.userId = str;
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
