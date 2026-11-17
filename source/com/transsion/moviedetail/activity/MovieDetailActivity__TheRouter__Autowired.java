package com.transsion.moviedetail.activity;

import androidx.annotation.Keep;
import com.therouter.TheRouter;
import com.therouter.router.C13677b;
import p410fg.InterfaceC23359a;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class MovieDetailActivity__TheRouter__Autowired {
    public static final String TAG = "Created by kymjs, and APT Version is 1.3.0.";
    public static final String THEROUTER_APT_VERSION = "1.3.0";

    public static void autowiredInject(Object obj) {
        if (obj instanceof MovieDetailActivity) {
            MovieDetailActivity movieDetailActivity = (MovieDetailActivity) obj;
            for (InterfaceC23359a interfaceC23359a : TheRouter.m61776g()) {
                try {
                    Boolean bool = (Boolean) interfaceC23359a.mo92175a("boolean", movieDetailActivity, new C13677b("boolean", "autoDownload", 0, "", "com.transsion.moviedetail.activity.MovieDetailActivity", "autoDownload", false, "No desc."));
                    if (bool != null) {
                        movieDetailActivity.autoDownload = bool.booleanValue();
                    }
                } catch (Exception e11) {
                    if (TheRouter.m61782m()) {
                        e11.printStackTrace();
                    }
                }
                try {
                    Boolean bool2 = (Boolean) interfaceC23359a.mo92175a("boolean", movieDetailActivity, new C13677b("boolean", "autoPlay", 0, "", "com.transsion.moviedetail.activity.MovieDetailActivity", "autoPlay", false, "No desc."));
                    if (bool2 != null) {
                        movieDetailActivity.autoPlay = bool2.booleanValue();
                    }
                } catch (Exception e12) {
                    if (TheRouter.m61782m()) {
                        e12.printStackTrace();
                    }
                }
                try {
                    Integer num = (Integer) interfaceC23359a.mo92175a("int", movieDetailActivity, new C13677b("int", "season", 0, "", "com.transsion.moviedetail.activity.MovieDetailActivity", "curSeason", false, "No desc."));
                    if (num != null) {
                        movieDetailActivity.curSeason = num.intValue();
                    }
                } catch (Exception e13) {
                    if (TheRouter.m61782m()) {
                        e13.printStackTrace();
                    }
                }
                try {
                    Integer num2 = (Integer) interfaceC23359a.mo92175a("int", movieDetailActivity, new C13677b("int", "subject_type", 0, "", "com.transsion.moviedetail.activity.MovieDetailActivity", "subjectYpe", false, "No desc."));
                    if (num2 != null) {
                        movieDetailActivity.subjectYpe = num2.intValue();
                    }
                } catch (Exception e14) {
                    if (TheRouter.m61782m()) {
                        e14.printStackTrace();
                    }
                }
                try {
                    Integer num3 = (Integer) interfaceC23359a.mo92175a("int", movieDetailActivity, new C13677b("int", "yy_preload_id", 0, "", "com.transsion.moviedetail.activity.MovieDetailActivity", "preloadId", false, "No desc."));
                    if (num3 != null) {
                        movieDetailActivity.preloadId = num3.intValue();
                    }
                } catch (Exception e15) {
                    if (TheRouter.m61782m()) {
                        e15.printStackTrace();
                    }
                }
                try {
                    String str = (String) interfaceC23359a.mo92175a("java.lang.String", movieDetailActivity, new C13677b("java.lang.String", "id", 0, "", "com.transsion.moviedetail.activity.MovieDetailActivity", "id", false, "No desc."));
                    if (str != null) {
                        movieDetailActivity.id = str;
                    }
                } catch (Exception e16) {
                    if (TheRouter.m61782m()) {
                        e16.printStackTrace();
                    }
                }
                try {
                    String str2 = (String) interfaceC23359a.mo92175a("java.lang.String", movieDetailActivity, new C13677b("java.lang.String", "module_name", 0, "", "com.transsion.moviedetail.activity.MovieDetailActivity", "moduleName", false, "No desc."));
                    if (str2 != null) {
                        movieDetailActivity.moduleName = str2;
                    }
                } catch (Exception e17) {
                    if (TheRouter.m61782m()) {
                        e17.printStackTrace();
                    }
                }
                try {
                    String str3 = (String) interfaceC23359a.mo92175a("java.lang.String", movieDetailActivity, new C13677b("java.lang.String", "ops", 0, "", "com.transsion.moviedetail.activity.MovieDetailActivity", "ops", false, "No desc."));
                    if (str3 != null) {
                        movieDetailActivity.ops = str3;
                    }
                } catch (Exception e18) {
                    if (TheRouter.m61782m()) {
                        e18.printStackTrace();
                    }
                }
                try {
                    String str4 = (String) interfaceC23359a.mo92175a("java.lang.String", movieDetailActivity, new C13677b("java.lang.String", "resourceId", 0, "", "com.transsion.moviedetail.activity.MovieDetailActivity", "autoPlayResourceId", false, "No desc."));
                    if (str4 != null) {
                        movieDetailActivity.autoPlayResourceId = str4;
                    }
                } catch (Exception e19) {
                    if (TheRouter.m61782m()) {
                        e19.printStackTrace();
                    }
                }
            }
        }
    }
}
