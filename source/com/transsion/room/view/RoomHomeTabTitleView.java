package com.transsion.room.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.AbstractC2397b;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.noober.background.drawable.DrawableCreator;
import com.noober.background.view.BLTextView;
import com.noober.background.view.BLView;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.TnTextView;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.gslb.Utils;
import com.transsion.moviedetailapi.bean.RoomTabBadge;
import com.transsion.moviedetailapi.bean.RoomTabItem;
import com.transsion.room.R$layout;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import gq.C23638e0;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import m00.InterfaceC25776b;
import ng.AbstractC26004a;
import ng.AbstractC26006c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 42\u00020\u00012\u00020\u0002:\u0001+B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J/\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010.R\u0014\u00101\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, m97100d2 = {"Lcom/transsion/room/view/RoomHomeTabTitleView;", "Landroid/widget/FrameLayout;", "Lm00/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "res", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "()V", "index", "totalCount", "onSelected", "(II)V", "onDeselected", "", "leavePercent", "", "leftToRight", "onLeave", "(IIFZ)V", "enterPercent", "onEnter", "getContentLeft", "()I", "getContentTop", "getContentRight", "getContentBottom", "Lcom/transsion/moviedetailapi/bean/RoomTabItem;", "tabItem", "setBadge", "(Lcom/transsion/moviedetailapi/bean/RoomTabItem;)V", "", CampaignEx.JSON_KEY_TITLE, "setTitle", "(Ljava/lang/String;)V", "Lgq/e0;", "a", "Lgq/e0;", "viewBinding", "I", "normalColor", "c", "selectedColor", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/moviedetailapi/bean/RoomTabItem;", "Companion", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class RoomHomeTabTitleView extends FrameLayout implements InterfaceC25776b {
    public static final String KEY_TAB_BADGE = "key_tab_badge_";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23638e0 viewBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int normalColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int selectedColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private RoomTabItem tabItem;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoomHomeTabTitleView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoomHomeTabTitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomHomeTabTitleView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        View.inflate(getContext(), R$layout.room_view_top_tab_item_view, this);
        C23638e0 c23638e0M93521a = C23638e0.m93521a(this);
        Intrinsics.m97801g(c23638e0M93521a, "bind(...)");
        this.viewBinding = c23638e0M93521a;
        this.normalColor = AbstractC2397b.getColor(getContext(), R$color.white_80);
        this.selectedColor = AbstractC2397b.getColor(getContext(), R$color.text_01);
        c23638e0M93521a.f72194c.setTextSize(18.0f);
        setPadding(0, 0, 0, 0);
        TnTextView tnTextView = c23638e0M93521a.f72194c;
        Context context2 = getContext();
        Intrinsics.m97801g(context2, "getContext(...)");
        tnTextView.setTypeface(AbstractC26004a.m102044a(context2));
    }

    /* JADX INFO: renamed from: b */
    private final void m77368b() {
        BLTextView tvBadge = this.viewBinding.f72193b;
        Intrinsics.m97801g(tvBadge, "tvBadge");
        AbstractC26006c.m102054g(tvBadge);
        BLView vBadge = this.viewBinding.f72195d;
        Intrinsics.m97801g(vBadge, "vBadge");
        AbstractC26006c.m102054g(vBadge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final CharSequence m77369c(String str) {
        return str;
    }

    @Override // m00.InterfaceC25776b
    public int getContentBottom() {
        Paint.FontMetrics fontMetrics = this.viewBinding.f72194c.getPaint().getFontMetrics();
        Intrinsics.m97801g(fontMetrics, "getFontMetrics(...)");
        return (int) ((getHeight() / 2) + ((fontMetrics.bottom - fontMetrics.top) / 2));
    }

    @Override // m00.InterfaceC25776b
    public int getContentLeft() {
        String string;
        List listL;
        Rect rect = new Rect();
        if (StringsKt.m98132c0(this.viewBinding.f72194c.getText().toString(), "\n", false, 2, null)) {
            List<String> listSplit = new Regex("\\n").split(this.viewBinding.f72194c.getText().toString(), 0);
            if (listSplit.isEmpty()) {
                listL = CollectionsKt.m97506l();
                break;
            }
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listL = CollectionsKt.m97506l();
                    break;
                }
                if (listIterator.previous().length() != 0) {
                    listL = CollectionsKt.m97333K0(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
            string = "";
            for (String str : (String[]) listL.toArray(new String[0])) {
                Intrinsics.m97799e(str);
                if (str.length() > string.length()) {
                    string = str;
                }
            }
        } else {
            string = this.viewBinding.f72194c.getText().toString();
        }
        this.viewBinding.f72194c.getPaint().getTextBounds(string, 0, string.length(), rect);
        return (getLeft() + (getWidth() / 2)) - (rect.width() / 2);
    }

    @Override // m00.InterfaceC25776b
    public int getContentRight() {
        String string;
        List listL;
        Rect rect = new Rect();
        if (StringsKt.m98132c0(this.viewBinding.f72194c.getText().toString(), "\n", false, 2, null)) {
            List<String> listSplit = new Regex("\\n").split(this.viewBinding.f72194c.getText().toString(), 0);
            if (listSplit.isEmpty()) {
                listL = CollectionsKt.m97506l();
                break;
            }
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listL = CollectionsKt.m97506l();
                    break;
                }
                if (listIterator.previous().length() != 0) {
                    listL = CollectionsKt.m97333K0(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
            string = "";
            for (String str : (String[]) listL.toArray(new String[0])) {
                Intrinsics.m97799e(str);
                if (str.length() > string.length()) {
                    string = str;
                }
            }
        } else {
            string = this.viewBinding.f72194c.getText().toString();
        }
        this.viewBinding.f72194c.getPaint().getTextBounds(string, 0, string.length(), rect);
        return getLeft() + (getWidth() / 2) + (rect.width() / 2);
    }

    @Override // m00.InterfaceC25776b
    public int getContentTop() {
        Paint.FontMetrics fontMetrics = this.viewBinding.f72194c.getPaint().getFontMetrics();
        Intrinsics.m97801g(fontMetrics, "getFontMetrics(...)");
        return (int) ((getHeight() / 2) - ((fontMetrics.bottom - fontMetrics.top) / 2));
    }

    @Override // m00.InterfaceC25778d
    public void onDeselected(int index, int totalCount) {
        this.viewBinding.f72194c.setTextColor(this.normalColor);
        this.viewBinding.f72194c.setTextSize(16.0f);
        TnTextView tnTextView = this.viewBinding.f72194c;
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        tnTextView.setTypeface(AbstractC26004a.m102047d(context));
    }

    @Override // m00.InterfaceC25778d
    public void onEnter(int index, int totalCount, float enterPercent, boolean leftToRight) {
    }

    @Override // m00.InterfaceC25778d
    public void onLeave(int index, int totalCount, float leavePercent, boolean leftToRight) {
    }

    @Override // m00.InterfaceC25778d
    public void onSelected(int index, int totalCount) {
        this.viewBinding.f72194c.setTextColor(this.selectedColor);
        this.viewBinding.f72194c.setTextSize(18.0f);
        TnTextView tnTextView = this.viewBinding.f72194c;
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        tnTextView.setTypeface(AbstractC26004a.m102044a(context));
        m77368b();
        RoomTabItem roomTabItem = this.tabItem;
        if (roomTabItem != null) {
            C14496b.f50966a.m65344b().putBoolean("key_tab_badge__" + roomTabItem.getTabId() + "_" + roomTabItem.getBadgeJsonStr().hashCode(), true);
        }
    }

    public final void setBadge(RoomTabItem tabItem) {
        String bgHue;
        String bgHue2;
        if (tabItem == null) {
            return;
        }
        RoomTabBadge badge = tabItem.getBadge();
        if (badge == null) {
            m77368b();
            return;
        }
        if (C14496b.f50966a.m65344b().getBoolean("key_tab_badge__" + tabItem.getTabId() + "_" + tabItem.getBadgeJsonStr().hashCode(), false)) {
            return;
        }
        this.tabItem = tabItem;
        String text = badge.getText();
        if (text == null || text.length() == 0) {
            BLTextView tvBadge = this.viewBinding.f72193b;
            Intrinsics.m97801g(tvBadge, "tvBadge");
            AbstractC26006c.m102054g(tvBadge);
            BLView vBadge = this.viewBinding.f72195d;
            Intrinsics.m97801g(vBadge, "vBadge");
            AbstractC26006c.m102058k(vBadge);
            String bgHue3 = badge.getBgHue();
            if (bgHue3 == null || bgHue3.length() == 0 || (bgHue = badge.getBgHue()) == null || !StringsKt.m98242W(bgHue, Utils.SEPARATOR, false, 2, null)) {
                return;
            }
            this.viewBinding.f72195d.setBackground(new DrawableCreator.Builder().setCornersRadius(AbstractC23384a.m92908b(3)).setSolidColor(Color.parseColor(badge.getBgHue())).build());
            return;
        }
        BLTextView tvBadge2 = this.viewBinding.f72193b;
        Intrinsics.m97801g(tvBadge2, "tvBadge");
        AbstractC26006c.m102058k(tvBadge2);
        BLView vBadge2 = this.viewBinding.f72195d;
        Intrinsics.m97801g(vBadge2, "vBadge");
        AbstractC26006c.m102054g(vBadge2);
        this.viewBinding.f72193b.setText(badge.getText());
        this.viewBinding.f72193b.setText(badge.getText());
        String bgHue4 = badge.getBgHue();
        if (bgHue4 == null || bgHue4.length() == 0 || (bgHue2 = badge.getBgHue()) == null || !StringsKt.m98242W(bgHue2, Utils.SEPARATOR, false, 2, null)) {
            return;
        }
        this.viewBinding.f72193b.setBackground(new DrawableCreator.Builder().setCornersRadius(0.0f, AbstractC23384a.m92908b(3), AbstractC23384a.m92908b(3), AbstractC23384a.m92908b(3)).setSolidColor(Color.parseColor(badge.getBgHue())).build());
    }

    public final void setTitle(final String title) {
        Intrinsics.m97802h(title, "title");
        this.viewBinding.f72194c.setTextAction(new Function0() { // from class: com.transsion.room.view.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomHomeTabTitleView.m77369c(title);
            }
        });
    }
}
