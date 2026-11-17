package com.transsion.usercenter.laboratory;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import com.blankj.utilcode.util.Utils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.tencent.mmkv.MMKV;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.baseui.widget.EditTextWithClear;
import com.transsion.p285ad.p286db.MbAdDatabase;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$style;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import ni.InterfaceC26009a;
import p411fh.C23366a;
import p585lw.C25732s;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, m97100d2 = {"Lcom/transsion/usercenter/laboratory/LabCountryDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "", MimeTypes.BASE_TYPE_TEXT, "", "w0", "(Ljava/lang/String;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "mcc", "D0", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "v", "onClick", "(Landroid/view/View;)V", "Lni/a;", "c", "Lkotlin/Lazy;", "v0", "()Lni/a;", "localMccDao", "Llw/s;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Llw/s;", "getViewBinding", "()Llw/s;", "setViewBinding", "(Llw/s;)V", "viewBinding", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class LabCountryDialog extends BaseDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy localMccDao;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C25732s viewBinding;

    public LabCountryDialog() {
        super(R$layout.dialog_lab_country);
        this.localMccDao = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.laboratory.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LabCountryDialog.m84808x0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m84794A0(LabCountryDialog labCountryDialog, View view) {
        AppCompatTextView appCompatTextView;
        CharSequence text;
        C25732s c25732s = labCountryDialog.viewBinding;
        labCountryDialog.m84807w0((c25732s == null || (appCompatTextView = c25732s.f78376g) == null || (text = appCompatTextView.getText()) == null) ? null : text.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final void m84795B0(LabCountryDialog labCountryDialog, View view) {
        AppCompatTextView appCompatTextView;
        CharSequence text;
        C25732s c25732s = labCountryDialog.viewBinding;
        labCountryDialog.m84807w0((c25732s == null || (appCompatTextView = c25732s.f78375f) == null || (text = appCompatTextView.getText()) == null) ? null : text.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m84796C0(LabCountryDialog labCountryDialog, View view) {
        Toast.makeText(labCountryDialog.getContext(), "reset success", 1).show();
        MMKV mmkvM92790c = C23366a.f71263a.m92790c();
        if (mmkvM92790c != null) {
            mmkvM92790c.putString("sp_code", "");
        }
        labCountryDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public final void m84797D0(String value, String mcc) {
        Toast.makeText(getContext(), "set value:" + value + " mcc: \"" + mcc + "\" success", 1).show();
        MMKV mmkvM92790c = C23366a.f71263a.m92790c();
        if (mmkvM92790c != null) {
            mmkvM92790c.putString("sp_code", mcc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public final InterfaceC26009a m84806v0() {
        return (InterfaceC26009a) this.localMccDao.getValue();
    }

    /* JADX INFO: renamed from: w0 */
    private final void m84807w0(String text) {
        if (text == null || text.length() == 0) {
            C28951b.f88586a.m111455e("text is null~");
        } else {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new LabCountryDialog$handleMcc$1(this, text, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final InterfaceC26009a m84808x0() {
        MbAdDatabase.Companion companion = MbAdDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m63295b(applicationM27275a).mo63292y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m84809y0(LabCountryDialog labCountryDialog, View view) {
        labCountryDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m84810z0(LabCountryDialog labCountryDialog, View view) {
        EditTextWithClear editTextWithClear;
        C25732s c25732s = labCountryDialog.viewBinding;
        labCountryDialog.m84807w0(String.valueOf((c25732s == null || (editTextWithClear = c25732s.f78373d) == null) ? null : editTextWithClear.getText()));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        String strValueOf;
        EditTextWithClear editTextWithClear;
        if (v11 instanceof AppCompatTextView) {
            strValueOf = ((AppCompatTextView) v11).getText().toString();
        } else {
            C25732s c25732s = this.viewBinding;
            strValueOf = String.valueOf((c25732s == null || (editTextWithClear = c25732s.f78373d) == null) ? null : editTextWithClear.getText());
        }
        m84807w0(strValueOf);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.BaseDialogStyle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        AppCompatTextView appCompatTextView5;
        AppCompatTextView appCompatTextView6;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.viewBinding = C25732s.m101215a(view);
        MMKV mmkvM92790c = C23366a.f71263a.m92790c();
        String string = mmkvM92790c != null ? mmkvM92790c.getString("sp_code", "") : null;
        C25732s c25732s = this.viewBinding;
        if (c25732s != null && (appCompatTextView6 = c25732s.f78374e) != null) {
            appCompatTextView6.setText(string);
        }
        C25732s c25732s2 = this.viewBinding;
        if (c25732s2 != null && (appCompatTextView5 = c25732s2.f78371b) != null) {
            appCompatTextView5.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LabCountryDialog.m84809y0(this.f64912a, view2);
                }
            });
        }
        C25732s c25732s3 = this.viewBinding;
        if (c25732s3 != null && (appCompatTextView4 = c25732s3.f78372c) != null) {
            appCompatTextView4.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LabCountryDialog.m84810z0(this.f64916a, view2);
                }
            });
        }
        C25732s c25732s4 = this.viewBinding;
        if (c25732s4 != null && (appCompatTextView3 = c25732s4.f78376g) != null) {
            appCompatTextView3.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LabCountryDialog.m84794A0(this.f64918a, view2);
                }
            });
        }
        C25732s c25732s5 = this.viewBinding;
        if (c25732s5 != null && (appCompatTextView2 = c25732s5.f78375f) != null) {
            appCompatTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LabCountryDialog.m84795B0(this.f64920a, view2);
                }
            });
        }
        C25732s c25732s6 = this.viewBinding;
        if (c25732s6 == null || (appCompatTextView = c25732s6.f78377h) == null) {
            return;
        }
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.laboratory.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LabCountryDialog.m84796C0(this.f64923a, view2);
            }
        });
    }
}
