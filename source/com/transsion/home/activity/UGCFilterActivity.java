package com.transsion.home.activity;

import android.os.Bundle;
import android.view.View;
import ck.C5110g;
import ck.C5127x;
import com.blankj.utilcode.util.AbstractC5781d;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.TitleLayout;
import com.therouter.TheRouter;
import com.transsion.baselib.report.InterfaceC14488g;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.home.R$id;
import com.transsion.home.R$mipmap;
import com.transsion.home.R$string;
import com.transsion.home.activity.UGCFilterActivity;
import com.transsion.home.fragment.filter.FilterFragment;
import com.transsion.home.fragment.filter.UGCFilterFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p016ak.C0117a;
import p016ak.InterfaceC0118b;
import p908xh.C28597a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010!\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0016\u0010#\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001c¨\u0006$"}, m97100d2 = {"Lcom/transsion/home/activity/UGCFilterActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Lxh/a;", "Lcom/transsion/baselib/report/g;", "<init>", "()V", "", "e0", "", "isTranslucent", "()Z", "isStatusDark", "d0", "()Lxh/a;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "initView", "retryLoadData", "", "getPageName", "()Ljava/lang/String;", "", "a", "I", "tabId", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "tabCode", "c", "mFilterJson", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "videoType", "e", "fromOptId", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class UGCFilterActivity extends BaseActivity<C28597a> implements InterfaceC14488g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int tabId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public String mFilterJson;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public String tabCode = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public String videoType = "";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public String fromOptId = "";

    /* JADX INFO: renamed from: e0 */
    private final void m66695e0() {
        getSupportFragmentManager().m14557p().m14813s(R$id.container, C5110g.f17601a.m23911b() ? UGCFilterFragment.INSTANCE.m67804a(this.tabId, this.tabCode, this.videoType, this.mFilterJson, this.fromOptId) : FilterFragment.INSTANCE.m67726a(this.tabId, this.tabCode, this.mFilterJson)).mo14672k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final void m66696f0(UGCFilterActivity uGCFilterActivity, View view) {
        InterfaceC0118b interfaceC0118b = (InterfaceC0118b) C0117a.f402a.m550a(InterfaceC0118b.class);
        if (interfaceC0118b != null) {
            interfaceC0118b.mo554d("", uGCFilterActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final void m66697g0(UGCFilterActivity uGCFilterActivity, View view) {
        uGCFilterActivity.finish();
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public C28597a getViewBinding() {
        C28597a c28597aM110317c = C28597a.m110317c(getLayoutInflater());
        Intrinsics.m97801g(c28597aM110317c, "inflate(...)");
        return c28597aM110317c;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public String getPageName() {
        return "/home/ugc_filter";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity
    public void initView(Bundle savedInstanceState) {
        TitleLayout titleLayout = ((C28597a) getMViewBinding()).f87749c;
        titleLayout.setRightView(R$mipmap.ic_search_movie, new View.OnClickListener() { // from class: fl.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCFilterActivity.m66696f0(this.f71356a, view);
            }
        });
        titleLayout.setLeftOnclick(new View.OnClickListener() { // from class: fl.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCFilterActivity.m66697g0(this.f71357a, view);
            }
        });
        String string = getString(R$string.filter);
        Intrinsics.m97801g(string, "getString(...)");
        titleLayout.setTitleText(string);
        titleLayout.setPadding(0, AbstractC5781d.m27351c(), 0, 0);
        m66695e0();
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return !C5127x.f17620a.m23969a();
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        TheRouter.m61781l(this);
        super.onCreate(savedInstanceState);
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public void retryLoadData() {
    }
}
