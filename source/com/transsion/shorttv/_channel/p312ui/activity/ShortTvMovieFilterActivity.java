package com.transsion.shorttv._channel.p312ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.therouter.TheRouter;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv._channel.p312ui.activity.ShortTvMovieFilterActivity;
import com.transsion.shorttv._channel.p312ui.fragment.ShortTvMovieFragment;
import com.transsion.shorttv._channel.p312ui.widget.ShortTvTitleLayout;
import com.transsion.shorttv.base.activity.BaseActivity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import is.C24226g;
import is.InterfaceC24224e;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;
import p954yr.AbstractC29002b;
import rs.C27354n;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\bR\u0016\u0010\u001f\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m97100d2 = {"Lcom/transsion/shorttv/_channel/ui/activity/ShortTvMovieFilterActivity;", "Lcom/transsion/shorttv/base/activity/BaseActivity;", "Lrs/n;", "Lis/e;", "<init>", "()V", "", "a0", "Z", "", "isTranslucent", "()Z", "isStatusDark", "X", "()Lrs/n;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "initView", "", "getPageName", "()Ljava/lang/String;", "", "g", "I", "tabId", "h", "showViewPager", "i", "Ljava/lang/String;", "tabCode", "j", "mFilterJson", "", "Lcom/transsion/shorttv/_channel/model/ShortTvHomeTabItem;", CampaignEx.JSON_KEY_AD_K, "Ljava/util/List;", "tabItems", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ShortTvMovieFilterActivity extends BaseActivity<C27354n> implements InterfaceC24224e {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int tabId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public String mFilterJson;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean showViewPager = true;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public String tabCode = "";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List tabItems = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final void m78696Y(ShortTvMovieFilterActivity shortTvMovieFilterActivity, View view) {
        shortTvMovieFilterActivity.m78698a0();
        shortTvMovieFilterActivity.finish();
    }

    /* JADX INFO: renamed from: Z */
    private final void m78697Z() {
        HashMap map = new HashMap();
        map.put("event_type", "back_browse");
        map.put("tabId", String.valueOf(this.tabId));
        C24662i.f75350a.m96872D(getPageName(), map);
    }

    /* JADX INFO: renamed from: a0 */
    private final void m78698a0() {
        HashMap map = new HashMap();
        map.put("event_type", "back_click");
        map.put("tabId", String.valueOf(this.tabId));
        C24662i.f75350a.m96872D(getPageName(), map);
    }

    @Override // com.transsion.shorttv.base.activity.BaseCommonActivity
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public C27354n getViewBinding() {
        C27354n c27354nM106478c = C27354n.m106478c(getLayoutInflater());
        Intrinsics.m97801g(c27354nM106478c, "inflate(...)");
        return c27354nM106478c;
    }

    @Override // com.transsion.shorttv.base.activity.BaseCommonActivity
    public String getPageName() {
        return "movie_filter_page";
    }

    @Override // com.transsion.shorttv.base.activity.BaseActivity
    public void initView(Bundle savedInstanceState) {
        ShortTvTitleLayout shortTvTitleLayout = ((C27354n) getMViewBinding()).f83274c;
        shortTvTitleLayout.setLeftOnclick(new View.OnClickListener() { // from class: ur.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTvMovieFilterActivity.m78696Y(this.f86140a, view);
            }
        });
        m78697Z();
        String string = getString(R$string.short_tv_filter);
        Intrinsics.m97801g(string, "getString(...)");
        shortTvTitleLayout.setTitleText(string);
        Context context = shortTvTitleLayout.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        shortTvTitleLayout.setPadding(0, AbstractC29002b.m111537b(context), 0, 0);
        getSupportFragmentManager().m14557p().m14813s(R$id.content_layout, ShortTvMovieFragment.INSTANCE.m78774a(true, this.mFilterJson)).mo14671j();
    }

    @Override // com.transsion.shorttv.base.activity.BaseActivity
    public boolean isStatusDark() {
        return !C24226g.f73740a.m95252a();
    }

    @Override // com.transsion.shorttv.base.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.shorttv.base.activity.BaseActivity, com.transsion.shorttv.base.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        TheRouter.m61781l(this);
        super.onCreate(savedInstanceState);
    }
}
