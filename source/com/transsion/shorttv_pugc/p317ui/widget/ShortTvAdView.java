package com.transsion.shorttv_pugc.p317ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.cloud.tmc.integration.constants.IntegrationConstants;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.p285ad.strategy.C14057b;
import com.transsion.push.PushConstants;
import com.transsion.shorttv.R$drawable;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv_pugc.bean.Link;
import com.transsion.shorttv_pugc.bean.ShortTVItem;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;
import p558kt.C25429b;
import pg.C26866a;
import rs.C27359p0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/ui/widget/ShortTvAdView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsion/shorttv_pugc/bean/ShortTVItem;", WebConstants.FIELD_ITEM, "", "setData", "(Lcom/transsion/shorttv_pugc/bean/ShortTVItem;)V", PushConstants.PUSH_SERVICE_TYPE_SHOW, "()V", IntegrationConstants.NAVIGATION_STYLE_HIDE, "", "a", "Z", "isNeedShowShortTvAdView", "Lrs/p0;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lrs/p0;", "bind", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ShortTvAdView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isNeedShowShortTvAdView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C27359p0 bind;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTvAdView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTvAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTvAdView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.bind = C27359p0.m106493a(LayoutInflater.from(getContext()).inflate(R$layout.short_tv_view_ad_layout, this));
        setBackgroundResource(R$drawable.view_ad_short_tv_bg);
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m81189b(ShortTVItem shortTVItem, View view) {
        C24662i.f75350a.m96881p("short_tv_ad_btn", new LinkedHashMap());
        C14057b c14057b = C14057b.f49739a;
        Link link = shortTVItem.getLink();
        String deeplink = link != null ? link.getDeeplink() : null;
        Link link2 = shortTVItem.getLink();
        c14057b.m63673a(deeplink, link2 != null ? link2.getUrl() : null, null);
    }

    public final void hide() {
        setVisibility(8);
    }

    public final void setData(final ShortTVItem item) {
        ShapeableImageView shapeableImageView;
        String icon;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        C26866a.f81698a.m104912c("ShortTvAdView", "ShortTvAdView --> setData() --> link = " + (item != null ? item.getLink() : null), false);
        if ((item != null ? item.getLink() : null) == null) {
            this.isNeedShowShortTvAdView = false;
            setVisibility(8);
            return;
        }
        this.isNeedShowShortTvAdView = true;
        setVisibility(0);
        C27359p0 c27359p0 = this.bind;
        if (c27359p0 != null && (appCompatTextView3 = c27359p0.f83293d) != null) {
            Link link = item.getLink();
            appCompatTextView3.setText(link != null ? link.getTitle() : null);
        }
        C27359p0 c27359p1 = this.bind;
        if (c27359p1 != null && (appCompatTextView2 = c27359p1.f83292c) != null) {
            Link link2 = item.getLink();
            appCompatTextView2.setText(link2 != null ? link2.getBtn() : null);
        }
        C27359p0 c27359p2 = this.bind;
        if (c27359p2 != null && (appCompatTextView = c27359p2.f83292c) != null) {
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv_pugc.ui.widget.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShortTvAdView.m81189b(item, view);
                }
            });
        }
        C27359p0 c27359p3 = this.bind;
        if (c27359p3 == null || (shapeableImageView = c27359p3.f83291b) == null) {
            return;
        }
        C25429b.a aVar = C25429b.f76999a;
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        Link link3 = item.getLink();
        if (link3 == null || (icon = link3.getIcon()) == null) {
            icon = "";
        }
        aVar.m99981k(context, shapeableImageView, icon, (4064 & 8) != 0 ? aVar.m99977c() : AbstractC5776a0.m27313a(28.0f), (4064 & 16) != 0 ? aVar.m99976b() : AbstractC5776a0.m27313a(28.0f), (4064 & 32) != 0, (4064 & 64) != 0, (4064 & 128) != 0, (4064 & 256) != 0 ? false : false, (4064 & 512) != 0 ? false : false, (4064 & 1024) != 0 ? false : false, (4064 & 2048) != 0 ? 25 : 0);
    }

    public final void show() {
        if (this.isNeedShowShortTvAdView) {
            setVisibility(0);
        }
    }
}
