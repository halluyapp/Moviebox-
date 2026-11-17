package com.transsion.shorttv.order;

import com.transsion.shorttv.order.bean.GetPaynicornOrderStatusRespEntity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.shorttv.order.b */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC18853b {

    /* JADX INFO: renamed from: com.transsion.shorttv.order.b$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m79422a(InterfaceC18853b interfaceC18853b, String errorCode, String errorMsg) {
            Intrinsics.m97802h(errorCode, "errorCode");
            Intrinsics.m97802h(errorMsg, "errorMsg");
        }

        /* JADX INFO: renamed from: b */
        public static void m79423b(InterfaceC18853b interfaceC18853b, GetPaynicornOrderStatusRespEntity getPaynicornOrderStatusRespEntity) {
        }
    }

    /* JADX INFO: renamed from: a */
    void mo79400a(String str, String str2);

    /* JADX INFO: renamed from: b */
    void mo79401b(GetPaynicornOrderStatusRespEntity getPaynicornOrderStatusRespEntity);
}
