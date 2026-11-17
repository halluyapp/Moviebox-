package com.transsion.rewardscenter.p309ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0248a;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.AbstractC2397b;
import androidx.core.os.AbstractC2411d;
import com.cloud.hisavana.sdk.common.util.AbstractC8117n0;
import com.cloud.tmc.integration.event.EventConstants;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.bottomsheet.DialogC10016c;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.transsion.rewardscenter.R$string;
import com.transsion.rewardscenter.utils.C18008c;
import com.transsion.rewardscenterapi.SkuPoint;
import com.transsion.rewardscenterapi.TopUpType;
import com.transsnet.loginapi.bean.Country;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p393f.C23284j;
import p986zp.C29216e;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u0019\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u0003R\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010*\u001a\u0010\u0012\f\u0012\n '*\u0004\u0018\u00010&0&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, m97100d2 = {"Lcom/transsion/rewardscenter/ui/PhoneBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "", "s0", "v0", "t0", "n0", "", "setCursor", "j0", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lzp/e;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lzp/e;", "_binding", "Lcom/transsnet/loginapi/bean/Country;", "c", "Lcom/transsnet/loginapi/bean/Country;", PlaceTypes.COUNTRY, "Landroidx/activity/result/b;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroidx/activity/result/b;", "countryPickerLauncher", "m0", "()Lzp/e;", "binding", "e", "a", "RewardsCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class PhoneBottomSheetFragment extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final int f58913f = 8;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C29216e _binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Country country = new Country();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC0249b countryPickerLauncher;

    /* JADX INFO: renamed from: com.transsion.rewardscenter.ui.PhoneBottomSheetFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final PhoneBottomSheetFragment m76536a(TopUpType topUpType, SkuPoint skuPoint) {
            Intrinsics.m97802h(topUpType, "topUpType");
            PhoneBottomSheetFragment phoneBottomSheetFragment = new PhoneBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(EventConstants.KEY_SOURCE, topUpType.getValue());
            bundle.putSerializable("sku_point", skuPoint);
            phoneBottomSheetFragment.setArguments(bundle);
            return phoneBottomSheetFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.rewardscenter.ui.PhoneBottomSheetFragment$b */
    public static final class C17957b implements TextWatcher {
        public C17957b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            PhoneBottomSheetFragment.m76522k0(PhoneBottomSheetFragment.this, false, 1, null);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    public PhoneBottomSheetFragment() {
        AbstractC0249b abstractC0249bRegisterForActivityResult = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.rewardscenter.ui.o
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                PhoneBottomSheetFragment.m76523l0(this.f58962a, (ActivityResult) obj);
            }
        });
        Intrinsics.m97801g(abstractC0249bRegisterForActivityResult, "registerForActivityResult(...)");
        this.countryPickerLauncher = abstractC0249bRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: j0 */
    private final void m76521j0(boolean setCursor) {
        Editable text = m76524m0().f89148c.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        boolean zM76634b = C18008c.f58985a.m76634b(string);
        m76524m0().f89147b.setEnabled(zM76634b);
        m76524m0().f89147b.setAlpha(zM76634b ? 1.0f : 0.4f);
        AppCompatImageView ivClear = m76524m0().f89150e;
        Intrinsics.m97801g(ivClear, "ivClear");
        ivClear.setVisibility(string.length() > 0 ? 0 : 8);
        if (setCursor) {
            m76524m0().f89148c.setSelection(string.length());
        }
    }

    /* JADX INFO: renamed from: k0 */
    static /* synthetic */ void m76522k0(PhoneBottomSheetFragment phoneBottomSheetFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        phoneBottomSheetFragment.m76521j0(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final void m76523l0(PhoneBottomSheetFragment phoneBottomSheetFragment, ActivityResult result) {
        Intrinsics.m97802h(result, "result");
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            Serializable serializableExtra = data != null ? data.getSerializableExtra("countryCode") : null;
            Country country = serializableExtra instanceof Country ? (Country) serializableExtra : null;
            if (country != null) {
                phoneBottomSheetFragment.country = country;
                C29216e c29216e = phoneBottomSheetFragment._binding;
                if (c29216e == null) {
                    return;
                }
                c29216e.f89155j.setText("+" + country.getCode());
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    private final C29216e m76524m0() {
        C29216e c29216e = this._binding;
        Intrinsics.m97799e(c29216e);
        return c29216e;
    }

    /* JADX INFO: renamed from: n0 */
    private final void m76525n0() {
        m76524m0().f89149d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.rewardscenter.ui.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneBottomSheetFragment.m76526o0(this.f58966a, view);
            }
        });
        m76524m0().f89151f.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.rewardscenter.ui.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneBottomSheetFragment.m76527p0(this.f58967a, view);
            }
        });
        m76524m0().f89152g.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.rewardscenter.ui.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneBottomSheetFragment.m76528q0(this.f58968a, view);
            }
        });
        m76524m0().f89147b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.rewardscenter.ui.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneBottomSheetFragment.m76529r0(this.f58969a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final void m76526o0(PhoneBottomSheetFragment phoneBottomSheetFragment, View view) {
        phoneBottomSheetFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final void m76527p0(PhoneBottomSheetFragment phoneBottomSheetFragment, View view) {
        phoneBottomSheetFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m76528q0(PhoneBottomSheetFragment phoneBottomSheetFragment, View view) {
        phoneBottomSheetFragment.countryPickerLauncher.m999a(TheRouter.m61773c("/loginapi/select_country").m61861l(phoneBottomSheetFragment.requireContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m76529r0(PhoneBottomSheetFragment phoneBottomSheetFragment, View view) {
        C29216e c29216e = phoneBottomSheetFragment._binding;
        if (c29216e == null) {
            return;
        }
        Editable text = c29216e.f89148c.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        if (StringsKt.m98160q0(string) || !C18008c.f58985a.m76634b(string)) {
            m76522k0(phoneBottomSheetFragment, false, 1, null);
            return;
        }
        Bundle arguments = phoneBottomSheetFragment.getArguments();
        int i11 = arguments != null ? arguments.getInt(EventConstants.KEY_SOURCE) : TopUpType.BANNER.getValue();
        c29216e.f89147b.setEnabled(false);
        c29216e.f89147b.setAlpha(0.4f);
        phoneBottomSheetFragment.getParentFragmentManager().m14495F1("phone_bottom_sheet_result", AbstractC2411d.m11891b(TuplesKt.m97108a(EventConstants.KEY_SOURCE, Integer.valueOf(i11)), TuplesKt.m97108a("cc", phoneBottomSheetFragment.country.getCode()), TuplesKt.m97108a("iso", phoneBottomSheetFragment.country.getCountry_s()), TuplesKt.m97108a("number", string)));
    }

    /* JADX INFO: renamed from: s0 */
    private final void m76530s0() {
        Triple tripleM76633a = C18008c.f58985a.m76633a();
        Country country = this.country;
        country.setCode((String) tripleM76633a.getFirst());
        country.setCountry_s((String) tripleM76633a.getSecond());
        C26866a.a.m104898f(C26866a.f81698a, "RewardsCenter", "initCountry --> country: " + this.country, false, 4, null);
        String code = this.country.getCode();
        if (code != null && (!StringsKt.m98160q0(code))) {
            m76524m0().f89155j.setText("+" + this.country.getCode());
        }
        if (StringsKt.m98160q0((CharSequence) tripleM76633a.getThird())) {
            return;
        }
        m76524m0().f89148c.setText((CharSequence) tripleM76633a.getThird());
    }

    /* JADX INFO: renamed from: t0 */
    private final void m76531t0() {
        m76521j0(true);
        AppCompatEditText etPhone = m76524m0().f89148c;
        Intrinsics.m97801g(etPhone, "etPhone");
        etPhone.addTextChangedListener(new C17957b());
        m76524m0().f89150e.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.rewardscenter.ui.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneBottomSheetFragment.m76532u0(this.f58964a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m76532u0(PhoneBottomSheetFragment phoneBottomSheetFragment, View view) {
        phoneBottomSheetFragment.m76524m0().f89148c.setText("");
    }

    /* JADX INFO: renamed from: v0 */
    private final void m76533v0() {
        Bundle arguments = getArguments();
        if ((arguments != null ? arguments.getInt(EventConstants.KEY_SOURCE) : TopUpType.BANNER.getValue()) == TopUpType.PHONE_CREDIT.getValue()) {
            AppCompatTextView tvPrice = m76524m0().f89156k;
            Intrinsics.m97801g(tvPrice, "tvPrice");
            tvPrice.setVisibility(8);
            AppCompatTextView tvSubtitle = m76524m0().f89158m;
            Intrinsics.m97801g(tvSubtitle, "tvSubtitle");
            tvSubtitle.setVisibility(8);
            m76524m0().f89147b.setText(getString(R$string.redeem_continue));
            return;
        }
        Bundle arguments2 = getArguments();
        Serializable serializable = arguments2 != null ? arguments2.getSerializable("sku_point") : null;
        SkuPoint skuPoint = serializable instanceof SkuPoint ? (SkuPoint) serializable : null;
        if (skuPoint == null) {
            AppCompatTextView tvPrice2 = m76524m0().f89156k;
            Intrinsics.m97801g(tvPrice2, "tvPrice");
            tvPrice2.setVisibility(8);
            AppCompatTextView tvSubtitle2 = m76524m0().f89158m;
            Intrinsics.m97801g(tvSubtitle2, "tvSubtitle");
            tvSubtitle2.setVisibility(8);
            return;
        }
        String currencySymbol = skuPoint.getCurrencySymbol();
        if (currencySymbol == null) {
            currencySymbol = "";
        }
        String plainString = AbstractC8117n0.m37956a(new BigDecimal(String.valueOf(skuPoint.getPrice()))).toPlainString();
        m76524m0().f89156k.setText(currencySymbol + plainString);
        m76524m0().f89158m.setText(getString(R$string.payment_sheet_tips, currencySymbol + plainString));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m76534w0(DialogC10016c dialogC10016c, DialogInterface dialogInterface) {
        View viewFindViewById = dialogC10016c.findViewById(R$id.design_bottom_sheet);
        if (viewFindViewById != null) {
            BottomSheetBehavior bottomSheetBehaviorM45424m0 = BottomSheetBehavior.m45424m0(viewFindViewById);
            bottomSheetBehaviorM45424m0.m45447U0(3);
            bottomSheetBehaviorM45424m0.m45446T0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m76535x0(PhoneBottomSheetFragment phoneBottomSheetFragment) {
        Context context;
        C29216e c29216e = phoneBottomSheetFragment._binding;
        if (c29216e == null || (context = phoneBottomSheetFragment.getContext()) == null) {
            return;
        }
        c29216e.f89148c.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) AbstractC2397b.getSystemService(context, InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(c29216e.f89148c, 1);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.m97800f(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        final DialogC10016c dialogC10016c = (DialogC10016c) dialogOnCreateDialog;
        Window window = dialogC10016c.getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        dialogC10016c.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.transsion.rewardscenter.ui.p
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                PhoneBottomSheetFragment.m76534w0(dialogC10016c, dialogInterface);
            }
        });
        return dialogC10016c;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.m97802h(inflater, "inflater");
        this._binding = C29216e.m112091c(inflater, container, false);
        LinearLayoutCompat root = m76524m0().getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m76530s0();
        m76533v0();
        m76531t0();
        m76525n0();
        m76524m0().f89148c.post(new Runnable() { // from class: com.transsion.rewardscenter.ui.n
            @Override // java.lang.Runnable
            public final void run() {
                PhoneBottomSheetFragment.m76535x0(this.f58960a);
            }
        });
    }
}
