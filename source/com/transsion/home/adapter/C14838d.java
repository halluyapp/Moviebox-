package com.transsion.home.adapter;

import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.core.content.AbstractC2397b;
import androidx.viewpager2.widget.ViewPager2;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5790i;
import com.p282tn.lib.view.GradientLinePagerIndicator;
import com.p282tn.lib.widget.R$color;
import com.transsion.baseui.util.AbstractViewOnClickListenerC14560f;
import com.transsion.baseui.widget.CustomPagerTitleView;
import com.transsion.home.R$string;
import kotlin.jvm.internal.Intrinsics;
import m00.AbstractC25775a;
import m00.InterfaceC25777c;
import m00.InterfaceC25778d;
import net.lucode.hackware.magicindicator.MagicIndicator;
import p552kl.C24683j;

/* JADX INFO: renamed from: com.transsion.home.adapter.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C14838d extends AbstractC25775a {

    /* JADX INFO: renamed from: b */
    private final C24683j f51894b;

    /* JADX INFO: renamed from: com.transsion.home.adapter.d$a */
    public static final class a extends AbstractViewOnClickListenerC14560f {

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f51896f;

        a(int i11) {
            this.f51896f = i11;
        }

        @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
        /* JADX INFO: renamed from: c */
        public void mo64493c(View view) {
        }

        @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
        /* JADX INFO: renamed from: d */
        public void mo64494d(View view) {
            MagicIndicator magicIndicator;
            ViewPager2 viewPager2;
            C24683j c24683j = C14838d.this.f51894b;
            if (c24683j != null && (viewPager2 = c24683j.f75474k) != null) {
                viewPager2.setCurrentItem(this.f51896f, true);
            }
            C24683j c24683j2 = C14838d.this.f51894b;
            if (c24683j2 == null || (magicIndicator = c24683j2.f75471h) == null) {
                return;
            }
            magicIndicator.onPageScrolled(this.f51896f, 0.0f, 0);
        }
    }

    public C14838d(C24683j c24683j) {
        this.f51894b = c24683j;
    }

    @Override // m00.AbstractC25775a
    /* JADX INFO: renamed from: a */
    public int mo64490a() {
        return 2;
    }

    @Override // m00.AbstractC25775a
    /* JADX INFO: renamed from: b */
    public InterfaceC25777c mo64491b(Context context) {
        Intrinsics.m97802h(context, "context");
        GradientLinePagerIndicator gradientLinePagerIndicator = new GradientLinePagerIndicator(context);
        gradientLinePagerIndicator.setMode(2);
        gradientLinePagerIndicator.setLineHeight(AbstractC5790i.m27411e(3.0f));
        gradientLinePagerIndicator.setLineWidth(AbstractC5790i.m27411e(24.0f));
        gradientLinePagerIndicator.setRoundRadius(AbstractC5790i.m27411e(1.5f));
        gradientLinePagerIndicator.setStartInterpolator(new AccelerateInterpolator());
        gradientLinePagerIndicator.setEndInterpolator(new DecelerateInterpolator(2.0f));
        int color = AbstractC2397b.getColor(context, R$color.transparent);
        gradientLinePagerIndicator.setColors(color, color, color);
        return gradientLinePagerIndicator;
    }

    @Override // m00.AbstractC25775a
    /* JADX INFO: renamed from: c */
    public InterfaceC25778d mo64492c(Context context, int i11) {
        String string;
        Intrinsics.m97802h(context, "context");
        CustomPagerTitleView customPagerTitleView = new CustomPagerTitleView(context, 17, AbstractC5776a0.m27313a(10.0f));
        if (i11 != 0) {
            string = i11 != 1 ? "default" : context.getResources().getString(R$string.music_tab_liked_music);
        } else {
            string = context.getResources().getString(R$string.music_tab_discover);
        }
        customPagerTitleView.setText(string);
        customPagerTitleView.setTextSize(18.0f);
        customPagerTitleView.setOnClickListener(new a(i11));
        return customPagerTitleView;
    }
}
