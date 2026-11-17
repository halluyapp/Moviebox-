package com.transsion.usercenter.laboratory.developer;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.blankj.utilcode.util.ToastUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$style;
import com.transsion.usercenter.laboratory.developer.AdDeveloperDialog;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p585lw.C25724o;
import p772sw.C27660c;
import p873wi.C28380m;
import p873wi.C28383p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m97100d2 = {"Lcom/transsion/usercenter/laboratory/developer/AdDeveloperDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lkotlin/Function0;", "callback", "r0", "(Lkotlin/jvm/functions/Function0;)Lcom/transsion/usercenter/laboratory/developer/AdDeveloperDialog;", "c", "Lkotlin/jvm/functions/Function0;", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class AdDeveloperDialog extends BaseDialog {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Function0 callback;

    /* JADX INFO: renamed from: com.transsion.usercenter.laboratory.developer.AdDeveloperDialog$a */
    public static final class C20511a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C25724o f64905a;

        public C20511a(C25724o c25724o) {
            this.f64905a = c25724o;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Editable text = this.f64905a.f78329d.getText();
            if (text == null || text.length() == 0) {
                this.f64905a.f78330e.setErrorEnabled(false);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    public AdDeveloperDialog() {
        super(R$layout.ad_dialog_developer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final void m84925p0(AdDeveloperDialog adDeveloperDialog, View view) {
        adDeveloperDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m84926q0(C25724o c25724o, AdDeveloperDialog adDeveloperDialog, View view) {
        String lowerCase = c25724o.f78329d.getText().toString().toLowerCase(Locale.ROOT);
        Intrinsics.m97801g(lowerCase, "toLowerCase(...)");
        C28380m c28380m = C28380m.f87082a;
        C27660c c27660c = C27660c.f84831a;
        if (!c28380m.m109737d(lowerCase, c27660c.m107601a())) {
            ToastUtils.m27258s("密码错误，请重新输入！", new Object[0]);
            c25724o.f78329d.setText("");
            return;
        }
        Function0 function0 = adDeveloperDialog.callback;
        if (function0 != null) {
            function0.invoke();
        }
        c27660c.m107603c(C28383p.f87085a.m109744c());
        adDeveloperDialog.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCancelable(false);
        setStyle(0, R$style.BaseDialogStyle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C25724o c25724oM101194a = C25724o.m101194a(view);
        Intrinsics.m97801g(c25724oM101194a, "bind(...)");
        c25724oM101194a.f78327b.setOnClickListener(new View.OnClickListener() { // from class: sw.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AdDeveloperDialog.m84925p0(this.f84828a, view2);
            }
        });
        c25724oM101194a.f78328c.setOnClickListener(new View.OnClickListener() { // from class: sw.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AdDeveloperDialog.m84926q0(c25724oM101194a, this, view2);
            }
        });
        c25724oM101194a.f78330e.setBoxBackgroundColor(0);
        EditText etPwd = c25724oM101194a.f78329d;
        Intrinsics.m97801g(etPwd, "etPwd");
        etPwd.addTextChangedListener(new C20511a(c25724oM101194a));
    }

    /* JADX INFO: renamed from: r0 */
    public final AdDeveloperDialog m84927r0(Function0 callback) {
        Intrinsics.m97802h(callback, "callback");
        this.callback = callback;
        return this;
    }
}
