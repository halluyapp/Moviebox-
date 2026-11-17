package com.transsion.postdetail.p306ui.activity;

import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.therouter.TheRouter;
import com.therouter.router.C13677b;
import p410fg.InterfaceC23359a;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class LocalVideoDetailActivity__TheRouter__Autowired {
    public static final String TAG = "Created by kymjs, and APT Version is 1.3.0.";
    public static final String THEROUTER_APT_VERSION = "1.3.0";

    public static void autowiredInject(Object obj) {
        if (obj instanceof LocalVideoDetailActivity) {
            LocalVideoDetailActivity localVideoDetailActivity = (LocalVideoDetailActivity) obj;
            for (InterfaceC23359a interfaceC23359a : TheRouter.m61776g()) {
                try {
                    Boolean bool = (Boolean) interfaceC23359a.mo92175a("java.lang.Boolean", localVideoDetailActivity, new C13677b("java.lang.Boolean", "extra_completed", 0, "", "com.transsion.postdetail.ui.activity.LocalVideoDetailActivity", "completed", false, "No desc."));
                    if (bool != null) {
                        localVideoDetailActivity.completed = bool;
                    }
                } catch (Exception e11) {
                    if (TheRouter.m61782m()) {
                        e11.printStackTrace();
                    }
                }
                try {
                    Boolean bool2 = (Boolean) interfaceC23359a.mo92175a("java.lang.Boolean", localVideoDetailActivity, new C13677b("java.lang.Boolean", "extra_is_series", 0, "", "com.transsion.postdetail.ui.activity.LocalVideoDetailActivity", "isSeries", false, "No desc."));
                    if (bool2 != null) {
                        localVideoDetailActivity.isSeries = bool2;
                    }
                } catch (Exception e12) {
                    if (TheRouter.m61782m()) {
                        e12.printStackTrace();
                    }
                }
                try {
                    Integer num = (Integer) interfaceC23359a.mo92175a("java.lang.Integer", localVideoDetailActivity, new C13677b("java.lang.Integer", "extra_height", 0, "", "com.transsion.postdetail.ui.activity.LocalVideoDetailActivity", "videoHeight", false, "No desc."));
                    if (num != null) {
                        localVideoDetailActivity.videoHeight = num;
                    }
                } catch (Exception e13) {
                    if (TheRouter.m61782m()) {
                        e13.printStackTrace();
                    }
                }
                try {
                    Integer num2 = (Integer) interfaceC23359a.mo92175a("java.lang.Integer", localVideoDetailActivity, new C13677b("java.lang.Integer", "extra_parent_position", 0, "", "com.transsion.postdetail.ui.activity.LocalVideoDetailActivity", "parentPosition", false, "No desc."));
                    if (num2 != null) {
                        localVideoDetailActivity.parentPosition = num2;
                    }
                } catch (Exception e14) {
                    if (TheRouter.m61782m()) {
                        e14.printStackTrace();
                    }
                }
                try {
                    Integer num3 = (Integer) interfaceC23359a.mo92175a("java.lang.Integer", localVideoDetailActivity, new C13677b("java.lang.Integer", "extra_position", 0, "", "com.transsion.postdetail.ui.activity.LocalVideoDetailActivity", RequestParameters.POSITION, false, "No desc."));
                    if (num3 != null) {
                        localVideoDetailActivity.com.alibaba.sdk.android.oss.common.RequestParameters.POSITION java.lang.String = num3;
                    }
                } catch (Exception e15) {
                    if (TheRouter.m61782m()) {
                        e15.printStackTrace();
                    }
                }
                try {
                    Integer num4 = (Integer) interfaceC23359a.mo92175a("java.lang.Integer", localVideoDetailActivity, new C13677b("java.lang.Integer", "extra_width", 0, "", "com.transsion.postdetail.ui.activity.LocalVideoDetailActivity", "videoWidth", false, "No desc."));
                    if (num4 != null) {
                        localVideoDetailActivity.videoWidth = num4;
                    }
                } catch (Exception e16) {
                    if (TheRouter.m61782m()) {
                        e16.printStackTrace();
                    }
                }
                try {
                    String str = (String) interfaceC23359a.mo92175a("java.lang.String", localVideoDetailActivity, new C13677b("java.lang.String", "extra_local_path", 0, "", "com.transsion.postdetail.ui.activity.LocalVideoDetailActivity", "path", false, "No desc."));
                    if (str != null) {
                        localVideoDetailActivity.path = str;
                    }
                } catch (Exception e17) {
                    if (TheRouter.m61782m()) {
                        e17.printStackTrace();
                    }
                }
                try {
                    String str2 = (String) interfaceC23359a.mo92175a("java.lang.String", localVideoDetailActivity, new C13677b("java.lang.String", "extra_name", 0, "", "com.transsion.postdetail.ui.activity.LocalVideoDetailActivity", "name", false, "No desc."));
                    if (str2 != null) {
                        localVideoDetailActivity.name = str2;
                    }
                } catch (Exception e18) {
                    if (TheRouter.m61782m()) {
                        e18.printStackTrace();
                    }
                }
                try {
                    String str3 = (String) interfaceC23359a.mo92175a("java.lang.String", localVideoDetailActivity, new C13677b("java.lang.String", "extra_page_from", 0, "", "com.transsion.postdetail.ui.activity.LocalVideoDetailActivity", "pageFrom", false, "No desc."));
                    if (str3 != null) {
                        localVideoDetailActivity.pageFrom = str3;
                    }
                } catch (Exception e19) {
                    if (TheRouter.m61782m()) {
                        e19.printStackTrace();
                    }
                }
                try {
                    String str4 = (String) interfaceC23359a.mo92175a("java.lang.String", localVideoDetailActivity, new C13677b("java.lang.String", "extra_post_id", 0, "", "com.transsion.postdetail.ui.activity.LocalVideoDetailActivity", "postId", false, "No desc."));
                    if (str4 != null) {
                        localVideoDetailActivity.postId = str4;
                    }
                } catch (Exception e20) {
                    if (TheRouter.m61782m()) {
                        e20.printStackTrace();
                    }
                }
                try {
                    String str5 = (String) interfaceC23359a.mo92175a("java.lang.String", localVideoDetailActivity, new C13677b("java.lang.String", "extra_proxy_url", 0, "", "com.transsion.postdetail.ui.activity.LocalVideoDetailActivity", "proxyUrl", false, "No desc."));
                    if (str5 != null) {
                        localVideoDetailActivity.proxyUrl = str5;
                    }
                } catch (Exception e21) {
                    if (TheRouter.m61782m()) {
                        e21.printStackTrace();
                    }
                }
                try {
                    String str6 = (String) interfaceC23359a.mo92175a("java.lang.String", localVideoDetailActivity, new C13677b("java.lang.String", "extra_resource_id", 0, "", "com.transsion.postdetail.ui.activity.LocalVideoDetailActivity", "resourceId", false, "No desc."));
                    if (str6 != null) {
                        localVideoDetailActivity.resourceId = str6;
                    }
                } catch (Exception e22) {
                    if (TheRouter.m61782m()) {
                        e22.printStackTrace();
                    }
                }
                try {
                    String str7 = (String) interfaceC23359a.mo92175a("java.lang.String", localVideoDetailActivity, new C13677b("java.lang.String", "extra_subject_id", 0, "", "com.transsion.postdetail.ui.activity.LocalVideoDetailActivity", "subjectId", false, "No desc."));
                    if (str7 != null) {
                        localVideoDetailActivity.subjectId = str7;
                    }
                } catch (Exception e23) {
                    if (TheRouter.m61782m()) {
                        e23.printStackTrace();
                    }
                }
                try {
                    String str8 = (String) interfaceC23359a.mo92175a("java.lang.String", localVideoDetailActivity, new C13677b("java.lang.String", "extra_url", 0, "", "com.transsion.postdetail.ui.activity.LocalVideoDetailActivity", "url", false, "No desc."));
                    if (str8 != null) {
                        localVideoDetailActivity.url = str8;
                    }
                } catch (Exception e24) {
                    if (TheRouter.m61782m()) {
                        e24.printStackTrace();
                    }
                }
            }
        }
    }
}
