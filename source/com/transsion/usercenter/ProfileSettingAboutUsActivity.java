package com.transsion.usercenter;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.AbstractC2397b;
import com.blankj.utilcode.util.Utils;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.transsion.baseui.activity.BaseActivity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p585lw.C25712i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m97100d2 = {"Lcom/transsion/usercenter/ProfileSettingAboutUsActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Llw/i;", "<init>", "()V", "", "c0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "b0", "()Llw/i;", "", "isTranslucent", "()Z", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ProfileSettingAboutUsActivity extends BaseActivity<C25712i> {

    /* JADX INFO: renamed from: com.transsion.usercenter.ProfileSettingAboutUsActivity$a */
    public static final class C20436a extends ClickableSpan {
        C20436a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.m97802h(widget, "widget");
            C13806h.f49015a.m62316a("H5 Privacy Policy");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.m97802h(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(AbstractC2397b.getColor(Utils.m27275a(), com.transsion.baseui.R$color.base_color_395CFF));
            ds2.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.ProfileSettingAboutUsActivity$b */
    public static final class C20437b extends ClickableSpan {
        C20437b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.m97802h(widget, "widget");
            C13806h.f49015a.m62316a(" H5 User Agreement");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.m97802h(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(AbstractC2397b.getColor(Utils.m27275a(), com.transsion.baseui.R$color.base_color_395CFF));
            ds2.setUnderlineText(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    private final void m84592c0() {
        String string = ((C25712i) getMViewBinding()).f78198d.getText().toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string);
        int iO0 = StringsKt.m98156o0(string, "Privacy Policy", 0, false, 6, null);
        spannableStringBuilder.setSpan(new C20436a(), iO0, iO0 + 14, 0);
        int iV0 = StringsKt.m98168v0(string, "User Agreement", 0, false, 6, null);
        spannableStringBuilder.setSpan(new C20437b(), iV0, iV0 + 14, 0);
        ((C25712i) getMViewBinding()).f78198d.setMovementMethod(LinkMovementMethod.getInstance());
        ((C25712i) getMViewBinding()).f78198d.setHighlightColor(0);
        ((C25712i) getMViewBinding()).f78198d.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public C25712i getViewBinding() {
        C25712i c25712iM101147c = C25712i.m101147c(getLayoutInflater());
        Intrinsics.m97801g(c25712iM101147c, "inflate(...)");
        return c25712iM101147c;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConstraintLayout root = ((C25712i) getMViewBinding()).getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        AbstractC26006c.m102052e(root);
        ((C25712i) getMViewBinding()).f78197c.goneRightViewLayout();
        m84592c0();
        ((C25712i) getMViewBinding()).f78200f.setText("V 1.0  todo 这里通过工具类获取");
        ((C25712i) getMViewBinding()).f78199e.setText("Oneroom   todo 这里通过工具类获取");
    }
}
