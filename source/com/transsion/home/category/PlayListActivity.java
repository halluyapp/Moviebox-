package com.transsion.home.category;

import android.os.Bundle;
import ck.C5127x;
import com.gyf.immersionbar.ImmersionBar;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.home.R$id;
import com.transsion.home.category.fragment.PlayListFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p552kl.C24673e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, m97100d2 = {"Lcom/transsion/home/category/PlayListActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Lkl/e;", "<init>", "()V", "c0", "()Lkl/e;", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/os/Bundle;)V", "", "isTranslucent", "()Z", "isStatusDark", "isChangeStatusBar", "isExpand", "b0", "(Z)V", "", "a", "Ljava/lang/String;", "category", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "label", "c", "recType", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class PlayListActivity extends BaseActivity<C24673e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public String category;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public String label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public String recType;

    /* JADX INFO: renamed from: b0 */
    public final void m67434b0(boolean isExpand) {
        ImmersionBar immersionBarWith = ImmersionBar.with(this);
        boolean z11 = false;
        if (isExpand && !C5127x.f17620a.m23969a()) {
            z11 = true;
        }
        immersionBarWith.statusBarDarkFont(z11).init();
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public C24673e getViewBinding() {
        C24673e c24673eM96922c = C24673e.m96922c(getLayoutInflater());
        Intrinsics.m97801g(c24673eM96922c, "inflate(...)");
        return c24673eM96922c;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        if (savedInstanceState == null) {
            getSupportFragmentManager().m14557p().m14813s(R$id.container, PlayListFragment.INSTANCE.m67530a(getIntent().getStringExtra("label"), getIntent().getStringExtra("category"), getIntent().getStringExtra("recType"), getIntent().getStringExtra("topIds"), getIntent().getIntExtra("tabId", 0))).mo14672k();
        }
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isChangeStatusBar() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }
}
