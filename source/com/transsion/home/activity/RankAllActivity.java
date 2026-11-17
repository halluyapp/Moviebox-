package com.transsion.home.activity;

import android.os.Bundle;
import ck.C5127x;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.home.R$id;
import com.transsion.home.fragment.rank.RankAllFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p552kl.C24665a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012¨\u0006\u001c"}, m97100d2 = {"Lcom/transsion/home/activity/RankAllActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Lkl/a;", "<init>", "()V", "b0", "()Lkl/a;", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/os/Bundle;)V", "", "isTranslucent", "()Z", "isStatusDark", "", "a", "Ljava/lang/String;", "requestCategory", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "tabId", "c", "defaultCategory", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "rankingListId", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class RankAllActivity extends BaseActivity<C24665a> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public String requestCategory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int tabId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public String defaultCategory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public String rankingListId;

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public C24665a getViewBinding() throws IllegalAccessException, InvocationTargetException {
        TheRouter.m61781l(this);
        C24665a c24665aM96890c = C24665a.m96890c(getLayoutInflater());
        Intrinsics.m97801g(c24665aM96890c, "inflate(...)");
        return c24665aM96890c;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public void initView(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            getSupportFragmentManager().m14557p().m14813s(R$id.container, RankAllFragment.INSTANCE.m68027a(this.requestCategory, Integer.valueOf(this.tabId), this.defaultCategory, this.rankingListId)).mo14672k();
        }
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return !C5127x.f17620a.m23969a();
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }
}
