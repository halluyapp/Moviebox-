package com.transsion.postdetail.shorttv_pugc.factory;

import com.transsion.p299mb.config.manager.ConfigBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p913xm.C28615f;
import p920xt.InterfaceC28657b;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.postdetail.shorttv_pugc.factory.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C16941b implements InterfaceC28657b {

    /* JADX INFO: renamed from: a */
    public static final a f56867a = new a(null);

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv_pugc.factory.b$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // p920xt.InterfaceC28657b
    /* JADX INFO: renamed from: a */
    public String mo73797a() {
        ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("shorts_unlock_config", true);
        String value = configBeanM110360c != null ? configBeanM110360c.getValue() : null;
        C26866a.a.m104898f(C26866a.f81698a, "ShortTv", "getUnlockConfig config：" + value, false, 4, null);
        return value;
    }
}
