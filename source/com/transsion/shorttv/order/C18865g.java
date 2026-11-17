package com.transsion.shorttv.order;

import com.google.gson.JsonObject;
import com.transsion.shorttv.order.bean.CreatePaynicornOrderReqBean;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONObject;
import p349dh.C22982c;

/* JADX INFO: renamed from: com.transsion.shorttv.order.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C18865g {

    /* JADX INFO: renamed from: a */
    public static final C18865g f60879a = new C18865g();

    /* JADX INFO: renamed from: b */
    private static final Lazy f60880b = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.order.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C18865g.m79444e();
        }
    });

    private C18865g() {
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC18852a m79443d() {
        return (InterfaceC18852a) f60880b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC18852a m79444e() {
        return (InterfaceC18852a) C22982c.f70163e.m91553a().m91552h(InterfaceC18852a.class);
    }

    /* JADX INFO: renamed from: b */
    public final Object m79445b(CreatePaynicornOrderReqBean createPaynicornOrderReqBean, Continuation continuation) {
        Map<String, String> extStrJson;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("project_name", createPaynicornOrderReqBean != null ? createPaynicornOrderReqBean.getProjectName() : null);
        jsonObject.addProperty("sku_id", createPaynicornOrderReqBean != null ? createPaynicornOrderReqBean.getSkuId() : null);
        jsonObject.addProperty("user_id", createPaynicornOrderReqBean != null ? createPaynicornOrderReqBean.getUserId() : null);
        jsonObject.addProperty("cp_front_page", createPaynicornOrderReqBean != null ? createPaynicornOrderReqBean.getCpFrontPage() : null);
        if (createPaynicornOrderReqBean != null && (extStrJson = createPaynicornOrderReqBean.getExtStrJson()) != null) {
            String string = new JSONObject(extStrJson).toString();
            Intrinsics.m97801g(string, "toString(...)");
            jsonObject.addProperty("ext", string);
        }
        RequestBody.Companion companion = RequestBody.INSTANCE;
        String string2 = jsonObject.toString();
        Intrinsics.m97801g(string2, "toString(...)");
        return InterfaceC18852a.a.m79420a(m79443d(), null, companion.create(string2, MediaType.INSTANCE.parse("application/json")), C18863e.f60878a.m79441a(createPaynicornOrderReqBean != null ? Boxing.m97631a(createPaynicornOrderReqBean.isDebug()) : null), continuation, 1, null);
    }

    /* JADX INFO: renamed from: c */
    public final Object m79446c(String str, String str2, boolean z11, Continuation continuation) {
        return InterfaceC18852a.a.m79421b(m79443d(), null, str == null ? "" : str, str2 == null ? "" : str2, C18863e.f60878a.m79441a(Boxing.m97631a(z11)), continuation, 1, null);
    }
}
