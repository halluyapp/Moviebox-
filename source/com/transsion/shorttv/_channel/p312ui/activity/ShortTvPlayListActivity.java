package com.transsion.shorttv._channel.p312ui.activity;

import android.os.Bundle;
import com.gyf.immersionbar.ImmersionBar;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv._channel.p312ui.fragment.ShortTvPlayListFragment;
import com.transsion.shorttv.base.activity.BaseActivity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import is.C24226g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rs.C27356o;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, m97100d2 = {"Lcom/transsion/shorttv/_channel/ui/activity/ShortTvPlayListActivity;", "Lcom/transsion/shorttv/base/activity/BaseActivity;", "Lrs/o;", "<init>", "()V", "X", "()Lrs/o;", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/os/Bundle;)V", "", "isTranslucent", "()Z", "isStatusDark", "isChangeStatusBar", "isExpand", "W", "(Z)V", "", "g", "Ljava/lang/String;", "category", "h", "label", "i", "recType", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ShortTvPlayListActivity extends BaseActivity<C27356o> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public String category;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public String label;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public String recType;

    /* JADX INFO: renamed from: W */
    public final void m78700W(boolean isExpand) {
        ImmersionBar immersionBarWith = ImmersionBar.with(this);
        boolean z11 = false;
        if (isExpand && !C24226g.f73740a.m95252a()) {
            z11 = true;
        }
        immersionBarWith.statusBarDarkFont(z11).init();
    }

    @Override // com.transsion.shorttv.base.activity.BaseCommonActivity
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public C27356o getViewBinding() {
        C27356o c27356oM106484c = C27356o.m106484c(getLayoutInflater());
        Intrinsics.m97801g(c27356oM106484c, "inflate(...)");
        return c27356oM106484c;
    }

    @Override // com.transsion.shorttv.base.activity.BaseActivity
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        if (savedInstanceState == null) {
            getSupportFragmentManager().m14557p().m14813s(R$id.container, ShortTvPlayListFragment.INSTANCE.m78822a(getIntent().getStringExtra("label"), getIntent().getStringExtra("category"), getIntent().getStringExtra("recType"), getIntent().getStringExtra("topIds"), getIntent().getIntExtra("tab_id", 0))).mo14672k();
        }
    }

    @Override // com.transsion.shorttv.base.activity.BaseActivity
    public boolean isChangeStatusBar() {
        return false;
    }

    @Override // com.transsion.shorttv.base.activity.BaseActivity
    public boolean isStatusDark() {
        return false;
    }

    @Override // com.transsion.shorttv.base.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }
}
