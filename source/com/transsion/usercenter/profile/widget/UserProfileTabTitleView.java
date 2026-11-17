package com.transsion.usercenter.profile.widget;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.core.content.AbstractC2397b;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.cloud.tmc.integration.event.EventConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.noober.background.drawable.DrawableCreator;
import com.noober.background.view.BLTextView;
import com.p282tn.lib.widget.R$color;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import m00.InterfaceC25776b;
import ng.AbstractC26004a;
import p874wj.C28387c;
import p874wj.InterfaceC28385a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ/\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010 J\u0019\u0010$\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b&\u0010%J!\u0010)\u001a\u00020\u000b2\u0010\u0010(\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, m97100d2 = {"Lcom/transsion/usercenter/profile/widget/UserProfileTabTitleView;", "Lcom/noober/background/view/BLTextView;", "Lm00/b;", "Lwj/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "index", "totalCount", "", "onSelected", "(II)V", "onDeselected", "", "leavePercent", "", "leftToRight", "onLeave", "(IIFZ)V", "enterPercent", "onEnter", "getContentLeft", "()I", "getContentTop", "getContentRight", "getContentBottom", "changeLocal", "()V", "resId", "setTextById", "(I)V", "setHintById", "", "srt", "setHintWithString", "(Ljava/lang/CharSequence;)V", "setTextWithString", "Lkotlin/Function0;", EventConstants.KEY_ACTION, "setTextAction", "(Lkotlin/jvm/functions/Function0;)V", "a", "I", "selectedColor", "Lwj/c;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lwj/c;", "textDelegate", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UserProfileTabTitleView extends BLTextView implements InterfaceC25776b, InterfaceC28385a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int selectedColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28387c textDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileTabTitleView(Context context) {
        super(context);
        Intrinsics.m97802h(context, "context");
        this.selectedColor = AbstractC2397b.getColor(context, R$color.white_100);
        setTextSize(12.0f);
        setGravity(17);
        int iM27313a = AbstractC5776a0.m27313a(12.0f);
        int iM27313a2 = AbstractC5776a0.m27313a(6.0f);
        setPadding(iM27313a, iM27313a2, iM27313a, iM27313a2);
        this.textDelegate = new C28387c(this);
    }

    @Override // p874wj.InterfaceC28385a
    public void changeLocal() {
        this.textDelegate.changeLocal();
    }

    @Override // m00.InterfaceC25776b
    public int getContentBottom() {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        return (int) ((getHeight() / 2) + ((fontMetrics.bottom - fontMetrics.top) / 2));
    }

    @Override // m00.InterfaceC25776b
    public int getContentLeft() {
        String string;
        List listL;
        Rect rect = new Rect();
        if (StringsKt.m98132c0(getText().toString(), "\n", false, 2, null)) {
            List<String> listSplit = new Regex("\\n").split(getText().toString(), 0);
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
            string = getText().toString();
        }
        getPaint().getTextBounds(string, 0, string.length(), rect);
        return (getLeft() + (getWidth() / 2)) - (rect.width() / 2);
    }

    @Override // m00.InterfaceC25776b
    public int getContentRight() {
        String string;
        List listL;
        Rect rect = new Rect();
        if (StringsKt.m98132c0(getText().toString(), "\n", false, 2, null)) {
            List<String> listSplit = new Regex("\\n").split(getText().toString(), 0);
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
            string = getText().toString();
        }
        getPaint().getTextBounds(string, 0, string.length(), rect);
        return getLeft() + (getWidth() / 2) + (rect.width() / 2);
    }

    @Override // m00.InterfaceC25776b
    public int getContentTop() {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        return (int) ((getHeight() / 2) - ((fontMetrics.bottom - fontMetrics.top) / 2));
    }

    @Override // m00.InterfaceC25778d
    public void onDeselected(int index, int totalCount) {
        getPaint().setFakeBoldText(false);
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        setTypeface(AbstractC26004a.m102047d(context));
        setBackground(new DrawableCreator.Builder().setCornersRadius(AbstractC5776a0.m27313a(8.0f)).setSolidColor(getContext().getResources().getColor(R$color.transparent)).build());
        setTextColor(AbstractC2397b.getColor(getContext(), R$color.white_80));
    }

    @Override // m00.InterfaceC25778d
    public void onEnter(int index, int totalCount, float enterPercent, boolean leftToRight) {
    }

    @Override // m00.InterfaceC25778d
    public void onLeave(int index, int totalCount, float leavePercent, boolean leftToRight) {
    }

    @Override // m00.InterfaceC25778d
    public void onSelected(int index, int totalCount) {
        getPaint().setFakeBoldText(true);
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        setTypeface(AbstractC26004a.m102044a(context));
        setBackground(new DrawableCreator.Builder().setCornersRadius(AbstractC5776a0.m27313a(100.0f)).setSolidColor(getContext().getResources().getColor(R$color.white_10)).build());
        setTextColor(this.selectedColor);
    }

    public void setHintById(int resId) {
        this.textDelegate.m109752b(resId);
    }

    public void setHintWithString(CharSequence srt) {
        this.textDelegate.m109753c(srt);
    }

    public void setLocalChangeListener(Function0<Unit> function0) {
        InterfaceC28385a.a.m109748a(this, function0);
    }

    public void setTextAction(Function0<? extends CharSequence> action) {
        this.textDelegate.m109755e(action);
    }

    public void setTextById(int resId) {
        this.textDelegate.m109756f(resId);
    }

    public void setTextWithString(CharSequence srt) {
        this.textDelegate.m109757g(srt);
    }
}
