package com.transsion.subroom.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.View;
import androidx.core.content.AbstractC2397b;
import androidx.core.text.AbstractC2449b;
import androidx.p1004lifecycle.AbstractC3226v;
import ck.C5127x;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.tencent.mmkv.MMKV;
import com.therouter.TheRouter;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.subroom.R$string;
import com.transsion.usercenter.laboratory.LabPwdDialog;
import com.transsion.usercenter.message.detail.CustomURLSpan;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import p411fh.C23366a;
import p418fu.C23432b;
import p550kj.C24655b;
import sh.C27619f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\"\u001a\u00020\u001d8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, m97100d2 = {"Lcom/transsion/subroom/activity/NotAvailableActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Lfu/b;", "<init>", "()V", "", "g0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "d0", "()Lfu/b;", "initView", "onBackPressed", "", "isTranslucent", "()Z", "isStatusDark", "isChangeStatusBar", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "", "a", "Ljava/lang/String;", "htmlMessage", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "reason", "", "c", "I", "getCLICK_COUNT", "()I", "CLICK_COUNT", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "app_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class NotAvailableActivity extends BaseActivity<C23432b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public String htmlMessage = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public String reason = "";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int CLICK_COUNT = 10;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m81681e0(Ref.IntRef intRef, final NotAvailableActivity notAvailableActivity, View view) {
        int i11 = intRef.element + 1;
        intRef.element = i11;
        if (i11 == notAvailableActivity.CLICK_COUNT) {
            new LabPwdDialog().m84859r0(new Function0() { // from class: com.transsion.subroom.activity.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NotAvailableActivity.m81682f0(this.f62701a);
                }
            }).m65436k0(notAvailableActivity, "labPwd");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final Unit m81682f0(NotAvailableActivity notAvailableActivity) {
        notAvailableActivity.m81683g0();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: g0 */
    private final void m81683g0() {
        SharedPreferences.Editor editorPutString;
        MMKV mmkvM92790c = C23366a.f71263a.m92790c();
        if (mmkvM92790c != null && (editorPutString = mmkvM92790c.putString("sp_code", "90101")) != null) {
            editorPutString.commit();
        }
        C13806h.f49015a.m62325l("Please restart the App");
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new NotAvailableActivity$welcomeMovieBox$1(null), 3, null);
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public C23432b getViewBinding() {
        C23432b c23432bM93029c = C23432b.m93029c(getLayoutInflater());
        Intrinsics.m97801g(c23432bM93029c, "inflate(...)");
        return c23432bM93029c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.transsion.baseui.activity.BaseActivity
    public void initView(Bundle savedInstanceState) {
        HashMap mapM96844g;
        HashMap mapM96844g2;
        super.initView(savedInstanceState);
        if (this.htmlMessage.length() > 0) {
            Spanned spannedM12023a = AbstractC2449b.m12023a(this.htmlMessage, 0);
            Intrinsics.m97801g(spannedM12023a, "fromHtml(...)");
            SpannableString spannableString = new SpannableString(spannedM12023a);
            Object[] spans = spannableString.getSpans(0, spannableString.length(), URLSpan.class);
            Intrinsics.m97801g(spans, "getSpans(...)");
            for (Object obj : spans) {
                URLSpan uRLSpan = (URLSpan) obj;
                int spanStart = spannableString.getSpanStart(uRLSpan);
                int spanEnd = spannableString.getSpanEnd(uRLSpan);
                spannableString.removeSpan(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    String url = uRLSpan.getURL();
                    Intrinsics.m97801g(url, "getURL(...)");
                    spannableString.setSpan(new CustomURLSpan(url), spanStart, spanEnd, 33);
                }
            }
            ((C23432b) getMViewBinding()).f71460b.setText(spannableString);
            ((C23432b) getMViewBinding()).f71460b.setMovementMethod(new C27619f(null));
        } else {
            String string = getResources().getString(R$string.not_available);
            Intrinsics.m97801g(string, "getString(...)");
            String string2 = getResources().getString(R$string.in_current_region);
            Intrinsics.m97801g(string2, "getString(...)");
            SpannableString spannableString2 = new SpannableString(string + string2);
            spannableString2.setSpan(new ForegroundColorSpan(AbstractC2397b.getColor(this, R$color.error_red)), 0, string.length(), 34);
            ((C23432b) getMViewBinding()).f71460b.setText(spannableString2);
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null && (mapM96844g2 = logViewConfig.m96844g()) != null) {
        }
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 != null && (mapM96844g = logViewConfig2.m96844g()) != null) {
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        ((C23432b) getMViewBinding()).f71460b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.subroom.activity.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotAvailableActivity.m81681e0(intRef, this, view);
            }
        });
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isChangeStatusBar() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return !C5127x.f17620a.m23969a();
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public C24655b newLogViewConfig() {
        return new C24655b("not_available", false, 2, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        TheRouter.m61781l(this);
        super.onCreate(savedInstanceState);
    }
}
