package com.transsion.search.activity;

import androidx.annotation.Keep;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.therouter.TheRouter;
import com.therouter.router.C13677b;
import p410fg.InterfaceC23359a;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class SearchManagerActivity__TheRouter__Autowired {
    public static final String TAG = "Created by kymjs, and APT Version is 1.3.0.";
    public static final String THEROUTER_APT_VERSION = "1.3.0";

    public static void autowiredInject(Object obj) {
        if (obj instanceof SearchManagerActivity) {
            SearchManagerActivity searchManagerActivity = (SearchManagerActivity) obj;
            for (InterfaceC23359a interfaceC23359a : TheRouter.m61776g()) {
                try {
                    Boolean bool = (Boolean) interfaceC23359a.mo92175a("boolean", searchManagerActivity, new C13677b("boolean", "back_exit", 0, "", "com.transsion.search.activity.SearchManagerActivity", "backExitSearch", false, "No desc."));
                    if (bool != null) {
                        searchManagerActivity.backExitSearch = bool.booleanValue();
                    }
                } catch (Exception e11) {
                    if (TheRouter.m61782m()) {
                        e11.printStackTrace();
                    }
                }
                try {
                    Integer num = (Integer) interfaceC23359a.mo92175a("int", searchManagerActivity, new C13677b("int", NativeComponentConstants.KEY_COMPONENT_TYPE, 0, "", "com.transsion.search.activity.SearchManagerActivity", "searchType", false, "No desc."));
                    if (num != null) {
                        searchManagerActivity.searchType = num.intValue();
                    }
                } catch (Exception e12) {
                    if (TheRouter.m61782m()) {
                        e12.printStackTrace();
                    }
                }
                try {
                    String str = (String) interfaceC23359a.mo92175a("java.lang.String", searchManagerActivity, new C13677b("java.lang.String", "keyword", 0, "", "com.transsion.search.activity.SearchManagerActivity", "keyWord", false, "No desc."));
                    if (str != null) {
                        searchManagerActivity.keyWord = str;
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
