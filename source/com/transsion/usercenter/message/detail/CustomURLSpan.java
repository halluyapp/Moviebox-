package com.transsion.usercenter.message.detail;

import android.text.style.URLSpan;
import android.view.View;
import ck.AbstractC5114k;
import com.therouter.TheRouter;
import com.transsion.web.api.WebPageIdentity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m97100d2 = {"Lcom/transsion/usercenter/message/detail/CustomURLSpan;", "Landroid/text/style/URLSpan;", "url", "", "<init>", "(Ljava/lang/String;)V", "onClick", "", "widget", "Landroid/view/View;", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class CustomURLSpan extends URLSpan {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomURLSpan(String url) {
        super(url);
        Intrinsics.m97802h(url, "url");
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View widget) {
        Intrinsics.m97802h(widget, "widget");
        AbstractC5114k.m23933p(TheRouter.m61773c(WebPageIdentity.WEB_VIEW).m61857K("url", getURL()));
    }
}
