package com.transsion.home.fragment.home;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import ck.AbstractC5114k;
import com.blankj.utilcode.util.AbstractC5796o;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.p282tn.lib.widget.R$color;
import com.transsion.p299mb.config.manager.ConfigBean;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p550kj.C24662i;
import p913xm.C28615f;

/* JADX INFO: renamed from: com.transsion.home.fragment.home.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C15260v {

    /* JADX INFO: renamed from: b */
    public static final a f53000b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f53001c = 8;

    /* JADX INFO: renamed from: a */
    private final ImageView f53002a;

    /* JADX INFO: renamed from: com.transsion.home.fragment.home.v$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C15260v(ImageView ivNovelIcon) {
        Intrinsics.m97802h(ivNovelIcon, "ivNovelIcon");
        this.f53002a = ivNovelIcon;
        m67991b();
    }

    /* JADX INFO: renamed from: b */
    private final void m67991b() {
        ConfigBean configBeanM110355d = C28615f.m110355d(C28615f.f87796c.m110363a(), "sa_novel_icon_config", false, 2, null);
        String value = configBeanM110355d != null ? configBeanM110355d.getValue() : null;
        if (value == null || value.length() == 0) {
            AbstractC26006c.m102054g(this.f53002a);
            return;
        }
        try {
            final HomeNovelIconBean homeNovelIconBean = (HomeNovelIconBean) AbstractC5796o.m27441d(value, HomeNovelIconBean.class);
            String deeplink = homeNovelIconBean.getDeeplink();
            if (deeplink != null && deeplink.length() != 0) {
                String icUrl = homeNovelIconBean.getIcUrl();
                if (icUrl != null) {
                    C23860f.a aVar = C23860f.f72909a;
                    Context context = this.f53002a.getContext();
                    Intrinsics.m97801g(context, "getContext(...)");
                    aVar.m94457m(context).m94468g(icUrl).m94470i(R$color.transparent).m94465d(this.f53002a);
                }
                AbstractC26006c.m102058k(this.f53002a);
                m67993d();
                this.f53002a.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.fragment.home.u
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C15260v.m67992c(this.f52998a, homeNovelIconBean, view);
                    }
                });
                return;
            }
            AbstractC26006c.m102054g(this.f53002a);
        } catch (Throwable unused) {
            AbstractC26006c.m102054g(this.f53002a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m67992c(C15260v c15260v, HomeNovelIconBean homeNovelIconBean, View view) {
        c15260v.m67994e();
        AbstractC5114k.m23925h(homeNovelIconBean.getDeeplink(), null, 1, null);
    }

    /* JADX INFO: renamed from: d */
    private final void m67993d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("module_name", RewardPlus.ICON);
        linkedHashMap.put("item_type", "novel");
        C24662i.f75350a.m96872D("Trending", linkedHashMap);
    }

    /* JADX INFO: renamed from: e */
    private final void m67994e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("module_name", RewardPlus.ICON);
        linkedHashMap.put("item_type", "novel");
        C24662i.f75350a.m96881p("Trending", linkedHashMap);
    }
}
