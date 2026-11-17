package com.transsion.publish;

import android.text.TextUtils;
import com.transsion.publish.api.LinkEntity;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import g10.AbstractC23461a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jsoup.nodes.Document;
import p465hp.C23889b;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.publish.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C17590c {

    /* JADX INFO: renamed from: a */
    public static final a f58109a = new a(null);

    /* JADX INFO: renamed from: b */
    private static final Lazy f58110b = LazyKt.m97096a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: com.transsion.publish.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C17590c.m75349c();
        }
    });

    /* JADX INFO: renamed from: com.transsion.publish.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C17590c m75356a() {
            return (C17590c) C17590c.f58110b.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C17590c m75349c() {
        return new C17590c();
    }

    /* JADX INFO: renamed from: e */
    private final void m75351e(Runnable runnable) {
        C17604p.f58122b.m75379a().m75378d(runnable);
    }

    /* JADX INFO: renamed from: f */
    private final void m75352f(String str, String str2, String str3, boolean z11) {
        LinkEntity linkEntity = new LinkEntity();
        linkEntity.setTitle(str);
        linkEntity.setCover(str2);
        linkEntity.setUrl(str3);
        linkEntity.setType(4);
        linkEntity.setLoading(z11);
        C23889b c23889b = new C23889b();
        c23889b.m94631o(4);
        c23889b.m94630n(1);
        c23889b.m94632p(linkEntity);
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, c23889b, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m75353h(C17590c c17590c, String str) {
        try {
            c17590c.m75352f(str == null ? "" : str, "", str == null ? "" : str, false);
            if (str != null) {
                c17590c.m75354i(str);
            }
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message != null) {
                C26866a.a.m104898f(C26866a.f81698a, "LinkParseManager", message, false, 4, null);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String str2 = str == null ? "" : str;
            if (str == null) {
                str = "";
            }
            c17590c.m75352f(str2, "", str, true);
        }
    }

    /* JADX INFO: renamed from: i */
    private final void m75354i(String str) {
        Document document = AbstractC23461a.m93117a(str).mo103647a(true).get();
        Intrinsics.m97801g(document, "get(...)");
        String strM103749j1 = document.m103749j1();
        Intrinsics.m97801g(strM103749j1, "title(...)");
        C26866a.a.m104898f(C26866a.f81698a, "LinkParseManager", "title:" + strM103749j1, false, 4, null);
        m75352f(strM103749j1, "", str, true);
    }

    /* JADX INFO: renamed from: g */
    public final void m75355g(final String str) {
        if (TextUtils.isEmpty(str)) {
            C28951b.f88586a.m111455e("Not a valid link");
        } else {
            m75351e(new Runnable() { // from class: com.transsion.publish.a
                @Override // java.lang.Runnable
                public final void run() {
                    C17590c.m75353h(this.f57974a, str);
                }
            });
        }
    }
}
