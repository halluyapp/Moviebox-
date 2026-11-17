package com.transsion.room.sub.activity.likes;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.AbstractC2397b;
import androidx.core.widget.AbstractC2780l;
import androidx.viewpager2.widget.ViewPager2;
import ck.C5127x;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$style;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.room.R$id;
import com.transsion.room.R$layout;
import com.transsion.room.R$string;
import com.transsion.room.sub.activity.likes.UgcLikesActivity;
import com.transsion.room.sub.adapter.likes.C18194b;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gq.C23635d;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m97100d2 = {"Lcom/transsion/room/sub/activity/likes/UgcLikesActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Lgq/d;", "<init>", "()V", "Lcom/google/android/material/tabs/TabLayout$Tab;", "tab", "", "isSelected", "", "h0", "(Lcom/google/android/material/tabs/TabLayout$Tab;Z)V", "e0", "()Lgq/d;", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/os/Bundle;)V", "isTranslucent", "()Z", "isStatusDark", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UgcLikesActivity extends BaseActivity<C23635d> {

    /* JADX INFO: renamed from: com.transsion.room.sub.activity.likes.UgcLikesActivity$a */
    public static final class C18192a implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ViewPager2 f59339b;

        C18192a(ViewPager2 viewPager2) {
            this.f59339b = viewPager2;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            UgcLikesActivity ugcLikesActivity = UgcLikesActivity.this;
            Intrinsics.m97799e(tab);
            ugcLikesActivity.m77112h0(tab, true);
            this.f59339b.setCurrentItem(tab.getPosition(), true);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            UgcLikesActivity ugcLikesActivity = UgcLikesActivity.this;
            Intrinsics.m97799e(tab);
            ugcLikesActivity.m77112h0(tab, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final void m77110f0(C18194b c18194b, UgcLikesActivity ugcLikesActivity, TabLayout.Tab tab, int i11) {
        Intrinsics.m97802h(tab, "tab");
        tab.setText(c18194b.m77118h(i11));
        ugcLikesActivity.m77112h0(tab, i11 == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final void m77111g0(UgcLikesActivity ugcLikesActivity, View view) {
        ugcLikesActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public final void m77112h0(TabLayout.Tab tab, boolean isSelected) {
        View customView;
        TextView textView;
        if (tab.getCustomView() == null || (customView = tab.getCustomView()) == null || (textView = (TextView) customView.findViewById(R$id.tv_tab_title)) == null) {
            return;
        }
        textView.setTypeface(isSelected ? Typeface.create(Typeface.DEFAULT, 1) : Typeface.create(Typeface.DEFAULT, 0));
        AbstractC2780l.m12801p(textView, isSelected ? R$style.style_import_text : R$style.style_regular_text);
        textView.setTextSize(isSelected ? 16.0f : 14.0f);
        textView.setTextColor(AbstractC2397b.getColor(this, isSelected ? R$color.white : R$color.white_80));
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public C23635d getViewBinding() {
        C23635d c23635dM93512c = C23635d.m93512c(getLayoutInflater());
        Intrinsics.m97801g(c23635dM93512c, "inflate(...)");
        return c23635dM93512c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity
    public void initView(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            final C18194b c18194b = new C18194b(this);
            ((C23635d) getMViewBinding()).f72185h.setAdapter(c18194b);
            TabLayout tabLayout = ((C23635d) getMViewBinding()).f72183f;
            Intrinsics.m97801g(tabLayout, "tabLayout");
            ViewPager2 viewPager2 = ((C23635d) getMViewBinding()).f72185h;
            Intrinsics.m97801g(viewPager2, "viewPager2");
            new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() { // from class: lq.a
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i11) {
                    UgcLikesActivity.m77110f0(c18194b, this, tab, i11);
                }
            }).attach();
            viewPager2.setCurrentItem(0, false);
            ((C23635d) getMViewBinding()).f72181d.setOnClickListener(new View.OnClickListener() { // from class: lq.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UgcLikesActivity.m77111g0(this.f77996a, view);
                }
            });
            tabLayout.removeAllTabs();
            for (String str : CollectionsKt.m97509o(getString(R$string.play_hub), getString(R$string.buzz_box))) {
                TabLayout.Tab tabNewTab = tabLayout.newTab();
                Intrinsics.m97801g(tabNewTab, "newTab(...)");
                View viewInflate = LayoutInflater.from(this).inflate(R$layout.ugc_likes_item_tab_custom, (ViewGroup) tabLayout, false);
                ((TextView) viewInflate.findViewById(R$id.tv_tab_title)).setText(str);
                tabNewTab.setCustomView(viewInflate);
                tabLayout.addTab(tabNewTab);
            }
            TabLayout.Tab tabAt = tabLayout.getTabAt(0);
            if (tabAt != null) {
                tabAt.select();
                m77112h0(tabAt, true);
            }
            ((C23635d) getMViewBinding()).f72183f.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C18192a(viewPager2));
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
