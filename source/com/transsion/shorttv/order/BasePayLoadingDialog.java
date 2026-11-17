package com.transsion.shorttv.order;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.transsion.shorttv.base.dialog.BaseViewBindingDialog;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import rs.C27328a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!R$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R.\u0010-\u001a\u001c\u0012\u0004\u0012\u00020)\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, m97100d2 = {"Lcom/transsion/shorttv/order/BasePayLoadingDialog;", "Lcom/transsion/shorttv/base/dialog/BaseViewBindingDialog;", "Lrs/a;", "<init>", "()V", "", "getClassTag", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/content/Context;", "context", "tag", "i0", "(Landroid/content/Context;Ljava/lang/String;)V", "", "isLoading", "n0", "(Z)V", "Lcom/transsion/shorttv/order/b;", "callback", "p0", "(Lcom/transsion/shorttv/order/b;)Lcom/transsion/shorttv/order/BasePayLoadingDialog;", "c", "Lcom/transsion/shorttv/order/b;", "o0", "()Lcom/transsion/shorttv/order/b;", "setCallback", "(Lcom/transsion/shorttv/order/b;)V", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "l0", "()Lkotlin/jvm/functions/Function3;", "bindingInflater", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public class BasePayLoadingDialog extends BaseViewBindingDialog<C27328a> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private InterfaceC18853b callback;

    protected final String getClassTag() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    @Override // com.transsion.shorttv.base.dialog.BaseDialog
    /* JADX INFO: renamed from: i0 */
    public void mo79034i0(Context context, String tag) {
        super.mo79034i0(context, tag);
    }

    @Override // com.transsion.shorttv.base.dialog.BaseViewBindingDialog
    /* JADX INFO: renamed from: l0 */
    public Function3 mo79036l0() {
        return BasePayLoadingDialog$bindingInflater$1.INSTANCE;
    }

    /* JADX INFO: renamed from: n0 */
    protected final void m79381n0(boolean isLoading) {
        TextView textView;
        ProgressBar progressBar;
        View view;
        int i11 = isLoading ? 0 : 8;
        C27328a c27328a = (C27328a) getViewBinding();
        if (c27328a != null && (view = c27328a.f83065c) != null) {
            view.setVisibility(i11);
        }
        C27328a c27328a2 = (C27328a) getViewBinding();
        if (c27328a2 != null && (progressBar = c27328a2.f83066d) != null) {
            progressBar.setVisibility(i11);
        }
        C27328a c27328a3 = (C27328a) getViewBinding();
        if (c27328a3 == null || (textView = c27328a3.f83064b) == null) {
            return;
        }
        textView.setVisibility(i11);
    }

    /* JADX INFO: renamed from: o0, reason: from getter */
    protected final InterfaceC18853b getCallback() {
        return this.callback;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        String str;
        Intrinsics.m97802h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i11 = newConfig.orientation;
        if (i11 == 0) {
            str = "未定义";
        } else if (i11 != 1) {
            str = i11 != 2 ? "未知" : "横屏";
        } else {
            str = "竖屏";
        }
        C18861c.f60874a.m79435a(getClassTag() + " --> onConfigurationChanged() --> tag = " + str + " --> callback = " + this.callback);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C18861c.f60874a.m79435a("PaynicornGetPayOrderIdDialog --> onCreate()");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Window window;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final BasePayLoadingDialog m79383p0(InterfaceC18853b callback) {
        this.callback = callback;
        return this;
    }
}
