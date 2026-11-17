package com.transsion.member.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3233y0;
import bn.C4859h;
import com.blankj.utilcode.util.KeyboardUtils;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.google.android.material.bottomsheet.DialogC10016c;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.transsion.baseui.R$style;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.member.C15854i0;
import com.transsion.member.C15888y;
import com.transsion.member.R$layout;
import com.transsion.member.R$string;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, m97100d2 = {"Lcom/transsion/member/dialog/MemberPromoCodeDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "", "initView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", TmcConstants.NAVIGATION_ON_START, "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "Lkotlin/Function0;", "callBack", "z0", "(Lkotlin/jvm/functions/Function0;)V", "", NotificationCompat.CATEGORY_MESSAGE, "A0", "(Ljava/lang/String;)V", "c", "Lkotlin/jvm/functions/Function0;", "callback", "Lbn/h;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lbn/h;", "bind", "Lcom/transsion/member/y;", "e", "Lkotlin/Lazy;", "t0", "()Lcom/transsion/member/y;", "promoCodeViewModel", "f", "a", "Member_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class MemberPromoCodeDialog extends BaseDialog {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    public static final int f54269g = 8;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Function0 callback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C4859h bind;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Lazy promoCodeViewModel;

    /* JADX INFO: renamed from: com.transsion.member.dialog.MemberPromoCodeDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final MemberPromoCodeDialog m70033a(Function0 callBack) {
            Intrinsics.m97802h(callBack, "callBack");
            MemberPromoCodeDialog memberPromoCodeDialog = new MemberPromoCodeDialog();
            memberPromoCodeDialog.m70032z0(callBack);
            return memberPromoCodeDialog;
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.dialog.MemberPromoCodeDialog$b */
    public static final class C15804b implements TextWatcher {
        C15804b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            AppCompatEditText appCompatEditText;
            AppCompatEditText appCompatEditText2;
            Intrinsics.m97802h(s11, "s");
            String string = s11.toString();
            if (Intrinsics.m97797c(s11.toString(), string)) {
                return;
            }
            C4859h c4859h = MemberPromoCodeDialog.this.bind;
            if (c4859h != null && (appCompatEditText2 = c4859h.f17221f) != null) {
                appCompatEditText2.setText(string);
            }
            C4859h c4859h2 = MemberPromoCodeDialog.this.bind;
            if (c4859h2 == null || (appCompatEditText = c4859h2.f17221f) == null) {
                return;
            }
            appCompatEditText.setSelection(string.length());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s11, int i11, int i12, int i13) {
            Intrinsics.m97802h(s11, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int i11, int i12, int i13) {
            ImageView imageView;
            AppCompatEditText appCompatEditText;
            Editable text;
            ImageView imageView2;
            Intrinsics.m97802h(s11, "s");
            MemberPromoCodeDialog.this.m70031A0("");
            C4859h c4859h = MemberPromoCodeDialog.this.bind;
            if (c4859h == null || (appCompatEditText = c4859h.f17221f) == null || (text = appCompatEditText.getText()) == null || text.length() == 0) {
                C4859h c4859h2 = MemberPromoCodeDialog.this.bind;
                if (c4859h2 == null || (imageView = c4859h2.f17218c) == null) {
                    return;
                }
                AbstractC26006c.m102054g(imageView);
                return;
            }
            C4859h c4859h3 = MemberPromoCodeDialog.this.bind;
            if (c4859h3 == null || (imageView2 = c4859h3.f17218c) == null) {
                return;
            }
            AbstractC26006c.m102058k(imageView2);
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.dialog.MemberPromoCodeDialog$c */
    static final class C15805c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f54274a;

        C15805c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f54274a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f54274a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3189c0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m97797c(mo6065a(), ((FunctionAdapter) obj).mo6065a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6065a().hashCode();
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f54274a.invoke(obj);
        }
    }

    public MemberPromoCodeDialog() {
        super(R$layout.dialog_member_promo_code_layout);
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.member.dialog.MemberPromoCodeDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.promoCodeViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(C15888y.class), new Function0<C3231x0>() { // from class: com.transsion.member.dialog.MemberPromoCodeDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.member.dialog.MemberPromoCodeDialog$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                Object objInvoke = function0.invoke();
                InterfaceC3208m interfaceC3208m = objInvoke instanceof InterfaceC3208m ? (InterfaceC3208m) objInvoke : null;
                C3227v0.c defaultViewModelProviderFactory = interfaceC3208m != null ? interfaceC3208m.getDefaultViewModelProviderFactory() : null;
                if (defaultViewModelProviderFactory == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.m97801g(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final void initView() {
        TextView textView;
        ImageView imageView;
        ImageView imageView2;
        AppCompatEditText appCompatEditText;
        C4859h c4859h = this.bind;
        if (c4859h != null && (appCompatEditText = c4859h.f17221f) != null) {
            appCompatEditText.addTextChangedListener(new C15804b());
        }
        C4859h c4859h2 = this.bind;
        if (c4859h2 != null && (imageView2 = c4859h2.f17217b) != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.member.dialog.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MemberPromoCodeDialog.m70026u0(this.f54309a, view);
                }
            });
        }
        C4859h c4859h3 = this.bind;
        if (c4859h3 != null && (imageView = c4859h3.f17218c) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.member.dialog.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MemberPromoCodeDialog.m70027v0(this.f54310a, view);
                }
            });
        }
        C4859h c4859h4 = this.bind;
        if (c4859h4 != null && (textView = c4859h4.f17219d) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.member.dialog.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MemberPromoCodeDialog.m70028w0(this.f54311a, view);
                }
            });
        }
        m70025t0().m70121e().m14851j(getViewLifecycleOwner(), new C15805c(new Function1() { // from class: com.transsion.member.dialog.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MemberPromoCodeDialog.m70029x0(this.f54312a, (C15854i0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    private final C15888y m70025t0() {
        return (C15888y) this.promoCodeViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m70026u0(MemberPromoCodeDialog memberPromoCodeDialog, View view) {
        memberPromoCodeDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m70027v0(MemberPromoCodeDialog memberPromoCodeDialog, View view) {
        AppCompatEditText appCompatEditText;
        C4859h c4859h = memberPromoCodeDialog.bind;
        if (c4859h == null || (appCompatEditText = c4859h.f17221f) == null) {
            return;
        }
        appCompatEditText.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m70028w0(MemberPromoCodeDialog memberPromoCodeDialog, View view) {
        String string;
        TextView textView;
        AppCompatEditText appCompatEditText;
        Editable text;
        String string2;
        C4859h c4859h = memberPromoCodeDialog.bind;
        if (c4859h == null || (appCompatEditText = c4859h.f17221f) == null || (text = appCompatEditText.getText()) == null || (string2 = text.toString()) == null || (string = StringsKt.m98155n1(string2).toString()) == null) {
            string = "";
        }
        if (string.length() == 0) {
            String string3 = memberPromoCodeDialog.getString(R$string.member_promo_code_empty_tips);
            Intrinsics.m97801g(string3, "getString(...)");
            memberPromoCodeDialog.m70031A0(string3);
        } else {
            C4859h c4859h2 = memberPromoCodeDialog.bind;
            if (c4859h2 != null && (textView = c4859h2.f17219d) != null) {
                textView.setEnabled(false);
            }
            memberPromoCodeDialog.m70025t0().m70122h(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final Unit m70029x0(MemberPromoCodeDialog memberPromoCodeDialog, C15854i0 c15854i0) {
        TextView textView;
        if (!c15854i0.m70089c()) {
            if (Intrinsics.m97797c(c15854i0.m70087a(), "400")) {
                String string = memberPromoCodeDialog.getString(R$string.member_promo_code_error_tips);
                Intrinsics.m97801g(string, "getString(...)");
                memberPromoCodeDialog.m70031A0(string);
            } else {
                C13806h.f49015a.m62324k(com.p282tn.lib.widget.R$string.error_load_failed);
            }
            C4859h c4859h = memberPromoCodeDialog.bind;
            if (c4859h != null && (textView = c4859h.f17219d) != null) {
                textView.setEnabled(true);
            }
        } else if (c15854i0.m70088b() == null) {
            String string2 = memberPromoCodeDialog.getString(R$string.member_promo_code_error_tips);
            Intrinsics.m97801g(string2, "getString(...)");
            memberPromoCodeDialog.m70031A0(string2);
        } else {
            Context context = memberPromoCodeDialog.getContext();
            if (context != null) {
                if (c15854i0.m70088b().getVipDurationDays() > 0) {
                    C28951b.a aVar = C28951b.f88586a;
                    int i11 = R$layout.claim_succeed_layout;
                    String string3 = context.getString(R$string.member_claimed_succeed_days, Integer.valueOf(c15854i0.m70088b().getVipDurationDays()));
                    Intrinsics.m97801g(string3, "getString(...)");
                    aVar.m111457g(i11, string3, (24 & 4) != 0 ? 0 : 17, (24 & 8) != 0 ? 0 : 0, (24 & 16) != 0 ? 0 : 0);
                } else {
                    C13806h.f49015a.m62324k(R$string.member_enjoy_your_benefits_now);
                }
            }
            memberPromoCodeDialog.dismissAllowingStateLoss();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m70030y0(AppCompatEditText appCompatEditText) {
        appCompatEditText.requestFocus();
        KeyboardUtils.m27135i(appCompatEditText);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m70031A0(String msg) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        Intrinsics.m97802h(msg, "msg");
        if (msg.length() <= 0) {
            C4859h c4859h = this.bind;
            if (c4859h == null || (textView = c4859h.f17220e) == null) {
                return;
            }
            AbstractC26006c.m102055h(textView);
            return;
        }
        C4859h c4859h2 = this.bind;
        if (c4859h2 != null && (textView3 = c4859h2.f17220e) != null) {
            textView3.setText(msg);
        }
        C4859h c4859h3 = this.bind;
        if (c4859h3 == null || (textView2 = c4859h3.f17220e) == null) {
            return;
        }
        AbstractC26006c.m102058k(textView2);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.BottomInputDialogTheme);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        DialogC10016c dialogC10016c = new DialogC10016c(requireContext(), getTheme());
        Window window = dialogC10016c.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        dialogC10016c.m45494k().m45447U0(3);
        dialogC10016c.m45494k().m45446T0(true);
        return dialogC10016c;
    }

    @Override // com.transsion.baseui.dialog.BaseDialog, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.m97802h(dialog, "dialog");
        super.onDismiss(dialog);
        Function0 function0 = this.callback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.transsion.baseui.dialog.BaseDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        final AppCompatEditText appCompatEditText;
        super.onStart();
        C4859h c4859h = this.bind;
        if (c4859h == null || (appCompatEditText = c4859h.f17221f) == null) {
            return;
        }
        appCompatEditText.postDelayed(new Runnable() { // from class: com.transsion.member.dialog.j
            @Override // java.lang.Runnable
            public final void run() {
                MemberPromoCodeDialog.m70030y0(appCompatEditText);
            }
        }, 200L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(true);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
        this.bind = C4859h.m23367a(view);
        initView();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m70032z0(Function0 callBack) {
        Intrinsics.m97802h(callBack, "callBack");
        this.callback = callBack;
    }
}
