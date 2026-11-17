package com.transsion.postdetail.shorttv.widget;

import android.content.Context;
import android.text.TextPaint;
import androidx.core.content.AbstractC2397b;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.cloud.tmc.integration.event.EventConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$color;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.SimplePagerTitleView;
import ng.AbstractC26004a;
import p874wj.C28387c;
import p874wj.InterfaceC28385a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J!\u0010\u001b\u001a\u00020\n2\u0010\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m97100d2 = {"Lcom/transsion/postdetail/shorttv/widget/ShortTVTabTitleView;", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/titles/SimplePagerTitleView;", "Lwj/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "index", "totalCount", "", "onSelected", "(II)V", "onDeselected", "changeLocal", "()V", "resId", "setTextById", "(I)V", "setHintById", "", "srt", "setHintWithString", "(Ljava/lang/CharSequence;)V", "setTextWithString", "Lkotlin/Function0;", EventConstants.KEY_ACTION, "setTextAction", "(Lkotlin/jvm/functions/Function0;)V", "c", "I", "mPadding", "Lwj/c;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lwj/c;", "textDelegate", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ShortTVTabTitleView extends SimplePagerTitleView implements InterfaceC28385a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mPadding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C28387c textDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTVTabTitleView(Context context) {
        super(context);
        Intrinsics.m97802h(context, "context");
        this.mPadding = AbstractC5776a0.m27313a(12.0f);
        setNormalColor(AbstractC2397b.getColor(context, R$color.text_02));
        setSelectedColor(AbstractC2397b.getColor(context, R$color.text_01));
        setTextSize(16.0f);
        setGravity(17);
        int i11 = this.mPadding;
        setPadding(i11, 0, i11, 0);
        this.textDelegate = new C28387c(this);
    }

    @Override // p874wj.InterfaceC28385a
    public void changeLocal() {
        this.textDelegate.changeLocal();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.SimplePagerTitleView, m00.InterfaceC25778d
    public void onDeselected(int index, int totalCount) {
        super.onDeselected(index, totalCount);
        getPaint().setFakeBoldText(true);
        TextPaint paint = getPaint();
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        paint.setTypeface(AbstractC26004a.m102047d(context));
        int i11 = this.mPadding;
        setPadding(i11, 0, i11, 0);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.SimplePagerTitleView, m00.InterfaceC25778d
    public void onSelected(int index, int totalCount) {
        super.onSelected(index, totalCount);
        getPaint().setFakeBoldText(true);
        TextPaint paint = getPaint();
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        paint.setTypeface(AbstractC26004a.m102044a(context));
        int i11 = this.mPadding;
        setPadding(i11 - 1, 0, i11 - 1, 0);
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
