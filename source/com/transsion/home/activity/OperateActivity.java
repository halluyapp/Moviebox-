package com.transsion.home.activity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5789h;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.TitleLayout;
import com.p282tn.lib.widget.R$color;
import com.therouter.TheRouter;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.home.R$id;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.home.preload.InterfaceC15427a;
import com.transsion.home.preload.InterfaceC15428b;
import com.transsion.home.preload.MainXMLPreloadControlImp;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p552kl.C24671d;
import sh.C27621h;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0018\u0010\u0005J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010$¨\u0006&"}, m97100d2 = {"Lcom/transsion/home/activity/OperateActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Lkl/d;", "Lcom/transsion/home/preload/a;", "<init>", "()V", "", "d0", "c0", "()Lkl/d;", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/os/Bundle;)V", "", "b0", "()I", "", "isTranslucent", "()Z", "isStatusDark", "", "getPageName", "()Ljava/lang/String;", "onDestroy", "Lcom/transsion/home/preload/b;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "()Lcom/transsion/home/preload/b;", "a", "I", "tabId", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "tabCode", "c", CampaignEx.JSON_KEY_TITLE, "Lcom/transsion/home/preload/b;", "xmlPreload", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class OperateActivity extends BaseActivity<C24671d> implements InterfaceC15427a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int tabId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public String tabCode = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public String title = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private InterfaceC15428b xmlPreload;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    private final void m66686d0() {
        TitleLayout titleLayout = ((C24671d) getMViewBinding()).f75400c;
        titleLayout.setTitleText(this.title);
        C27621h c27621h = C27621h.f84745a;
        Context context = titleLayout.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        titleLayout.setPadding(0, c27621h.m107454d(context), 0, 0);
        titleLayout.setBackgroundColor(AbstractC5789h.m27406a(R$color.transparent));
        titleLayout.setViewLineVisible(false);
    }

    /* JADX INFO: renamed from: b0 */
    public final int m66687b0() {
        C27621h c27621h = C27621h.f84745a;
        Context applicationContext = getApplicationContext();
        Intrinsics.m97801g(applicationContext, "getApplicationContext(...)");
        return c27621h.m107454d(applicationContext) + AbstractC5776a0.m27313a(44.0f);
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public C24671d getViewBinding() throws IllegalAccessException, InvocationTargetException {
        TheRouter.m61781l(this);
        C24671d c24671dM96914c = C24671d.m96914c(getLayoutInflater());
        Intrinsics.m97801g(c24671dM96914c, "inflate(...)");
        return c24671dM96914c;
    }

    @Override // com.transsion.home.preload.InterfaceC15427a
    /* JADX INFO: renamed from: d */
    public InterfaceC15428b mo66689d() {
        if (this.xmlPreload == null && Build.VERSION.SDK_INT > 28) {
            this.xmlPreload = new MainXMLPreloadControlImp(this);
        }
        return this.xmlPreload;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public String getPageName() {
        return SubTabFragment.INSTANCE.m68282a(this.tabId);
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public void initView(Bundle savedInstanceState) {
        m66686d0();
        getSupportFragmentManager().m14557p().m14813s(R$id.operate_page_container, SubTabFragment.INSTANCE.m68283b(this.tabId, this.tabCode)).mo14671j();
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        InterfaceC15428b interfaceC15428b = this.xmlPreload;
        if (interfaceC15428b != null) {
            interfaceC15428b.reset();
        }
        this.xmlPreload = null;
    }
}
