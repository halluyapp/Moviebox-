package com.transsion.mbwidget.guide;

import android.os.Bundle;
import com.p282tn.lib.view.TitleLayout;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.mbwidget.R$string;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p949ym.C28985a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m97100d2 = {"Lcom/transsion/mbwidget/guide/WidgetGuideActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Lym/a;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/os/Bundle;)V", "b0", "()Lym/a;", "", "isStatusDark", "()Z", "isTranslucent", "DeskWidget_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class WidgetGuideActivity extends BaseActivity<C28985a> {
    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public C28985a getViewBinding() {
        C28985a c28985aM111494c = C28985a.m111494c(getLayoutInflater());
        Intrinsics.m97801g(c28985aM111494c, "inflate(...)");
        return c28985aM111494c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        ((C28985a) getMViewBinding()).f88670b.setTitleText(R$string.widget_add_guide_title);
        TitleLayout mTitleLayout = ((C28985a) getMViewBinding()).f88670b;
        Intrinsics.m97801g(mTitleLayout, "mTitleLayout");
        AbstractC26006c.m102052e(mTitleLayout);
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }
}
