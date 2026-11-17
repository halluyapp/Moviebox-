package com.transsion.usercenter.kids;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import ck.C5118o;
import com.blankj.utilcode.util.KeyboardUtils;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.noober.background.view.BLTextView;
import com.p282tn.lib.dialog.BaseDialog;
import com.transsion.baselib.kids.KidsAccountManager;
import com.transsion.baselib.kids.KidsProfile;
import com.transsion.usercenter.R$drawable;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.kids.CreateKidsProfileDialog;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p550kj.C24662i;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J!\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010&\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, m97100d2 = {"Lcom/transsion/usercenter/kids/CreateKidsProfileDialog;", "Lcom/tn/lib/dialog/BaseDialog;", "<init>", "()V", "", "n0", "initView", "", "enabled", "r0", "(Z)V", "", "moduleName", "p0", "(Ljava/lang/String;)V", "q0", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", TmcConstants.NAVIGATION_ON_START, "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "a", "Ljava/lang/String;", "pageName", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Z", "showSwitchOnDone", "c", "recordDismissOnClose", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "autoShowSoftInput", "Landroid/widget/EditText;", "e", "Landroid/widget/EditText;", "etProfileName", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "ivClose", "Lcom/noober/background/view/BLTextView;", "g", "Lcom/noober/background/view/BLTextView;", "tvCreate", "h", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class CreateKidsProfileDialog extends BaseDialog {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean showSwitchOnDone;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean recordDismissOnClose;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean autoShowSoftInput;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private EditText etProfileName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private ImageView ivClose;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private BLTextView tvCreate;

    /* JADX INFO: renamed from: com.transsion.usercenter.kids.CreateKidsProfileDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ CreateKidsProfileDialog m84693b(Companion companion, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = true;
            }
            if ((i11 & 2) != 0) {
                z12 = false;
            }
            if ((i11 & 4) != 0) {
                z13 = true;
            }
            return companion.m84694a(z11, z12, z13);
        }

        /* JADX INFO: renamed from: a */
        public final CreateKidsProfileDialog m84694a(boolean z11, boolean z12, boolean z13) {
            CreateKidsProfileDialog createKidsProfileDialog = new CreateKidsProfileDialog();
            Bundle bundle = new Bundle();
            bundle.putBoolean("arg_show_switch_on_done", z11);
            bundle.putBoolean("arg_record_dismiss_on_close", z12);
            bundle.putBoolean("arg_auto_show_soft_input", z13);
            createKidsProfileDialog.setArguments(bundle);
            return createKidsProfileDialog;
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.kids.CreateKidsProfileDialog$b */
    public static final class C20479b implements TextWatcher {
        C20479b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CreateKidsProfileDialog.this.m84692r0(!(editable == null || editable.length() == 0));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    public CreateKidsProfileDialog() {
        super(R$layout.dialog_create_kids_profile);
        this.pageName = "";
        this.showSwitchOnDone = true;
        this.autoShowSoftInput = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final void m84682h0(CreateKidsProfileDialog createKidsProfileDialog, View view) {
        Editable text;
        String string;
        String string2;
        EditText editText = createKidsProfileDialog.etProfileName;
        if (editText == null || (text = editText.getText()) == null || (string = text.toString()) == null || (string2 = StringsKt.m98155n1(string).toString()) == null || string2.length() == 0) {
            return;
        }
        createKidsProfileDialog.m84690p0("create");
        final String strM23943c = C5118o.f17608a.m23943c();
        final KidsProfile kidsProfile = new KidsProfile(strM23943c, string2, R$drawable.ic_kids_avatar, null, null, null, null, null, null, 504, null);
        KidsAccountManager.f50883a.m65187m(kidsProfile, true);
        final FragmentActivity fragmentActivityRequireActivity = createKidsProfileDialog.requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        final FragmentManager parentFragmentManager = createKidsProfileDialog.getParentFragmentManager();
        Intrinsics.m97801g(parentFragmentManager, "getParentFragmentManager(...)");
        EditText editText2 = createKidsProfileDialog.etProfileName;
        if (editText2 != null) {
            KeyboardUtils.m27131e(editText2);
        }
        createKidsProfileDialog.dismissAllowingStateLoss();
        final Function0 function0 = createKidsProfileDialog.showSwitchOnDone ? new Function0() { // from class: rw.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateKidsProfileDialog.m84683i0(strM23943c, fragmentActivityRequireActivity);
            }
        } : new Function0() { // from class: rw.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CreateKidsProfileDialog.m84684j0(strM23943c, parentFragmentManager);
            }
        };
        PinInputDialog.Companion.m84761b(PinInputDialog.INSTANCE, false, new Function1() { // from class: rw.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateKidsProfileDialog.m84685k0(kidsProfile, function0, (String) obj);
            }
        }, function0, 1, null).m61941X(fragmentActivityRequireActivity, "PinInputDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final Unit m84683i0(String str, FragmentActivity fragmentActivity) {
        C26866a.a.m104898f(C26866a.f81698a, "CreateKidsProfileDialog", "kids account created, kidsId " + str + ", prepare AccountSwitchDialog.", false, 4, null);
        AccountSwitchDialog.Companion.m84672b(AccountSwitchDialog.INSTANCE, false, 1, null).m61941X(fragmentActivity, "AccountSwitchDialog");
        return Unit.f75682a;
    }

    private final void initView() {
        m84692r0(false);
        EditText editText = this.etProfileName;
        if (editText != null) {
            editText.addTextChangedListener(new C20479b());
        }
        EditText editText2 = this.etProfileName;
        if (editText2 != null) {
            editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: rw.k
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    CreateKidsProfileDialog.m84686l0(view, z11);
                }
            });
        }
        ImageView imageView = this.ivClose;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: rw.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CreateKidsProfileDialog.m84687m0(this.f83461a, view);
                }
            });
        }
        BLTextView bLTextView = this.tvCreate;
        if (bLTextView != null) {
            bLTextView.setOnClickListener(new View.OnClickListener() { // from class: rw.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CreateKidsProfileDialog.m84682h0(this.f83464a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final Unit m84684j0(String str, FragmentManager fragmentManager) {
        C26866a.a.m104898f(C26866a.f81698a, "CreateKidsProfileDialog", "kids account created, kidsId " + str + ", back to ManageProfilesFragment.", false, 4, null);
        fragmentManager.m14495F1("result_kids_created", Bundle.EMPTY);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final Unit m84685k0(KidsProfile kidsProfile, Function0 function0, String pin) {
        Intrinsics.m97802h(pin, "pin");
        KidsAccountManager.f50883a.m65187m(kidsProfile.copy((479 & 1) != 0 ? kidsProfile.kidsId : null, (479 & 2) != 0 ? kidsProfile.name : null, (479 & 4) != 0 ? kidsProfile.avatarResId : 0, (479 & 8) != 0 ? kidsProfile.gender : null, (479 & 16) != 0 ? kidsProfile.birthday : null, (479 & 32) != 0 ? kidsProfile.pinHash : pin, (479 & 64) != 0 ? kidsProfile.avatarLocalPath : null, (479 & 128) != 0 ? kidsProfile.favorites : null, (479 & 256) != 0 ? kidsProfile.age : null), true);
        function0.invoke();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final void m84686l0(View view, boolean z11) {
        if (z11) {
            KeyboardUtils.m27135i(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final void m84687m0(CreateKidsProfileDialog createKidsProfileDialog, View view) {
        if (createKidsProfileDialog.recordDismissOnClose) {
            KidsAccountManager.f50883a.m65185k();
        }
        EditText editText = createKidsProfileDialog.etProfileName;
        if (editText != null) {
            KeyboardUtils.m27131e(editText);
        }
        createKidsProfileDialog.dismissAllowingStateLoss();
        createKidsProfileDialog.m84690p0("close");
    }

    /* JADX INFO: renamed from: n0 */
    private final void m84688n0() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        window.setGravity(80);
        window.setSoftInputMode(this.autoShowSoftInput ? 20 : 18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final void m84689o0(CreateKidsProfileDialog createKidsProfileDialog) {
        if (!createKidsProfileDialog.isAdded() || createKidsProfileDialog.isStateSaved()) {
            return;
        }
        EditText editText = createKidsProfileDialog.etProfileName;
        if (editText != null) {
            editText.requestFocus();
        }
        EditText editText2 = createKidsProfileDialog.etProfileName;
        if (editText2 != null) {
            KeyboardUtils.m27135i(editText2);
        }
    }

    /* JADX INFO: renamed from: p0 */
    private final void m84690p0(String moduleName) {
        HashMap map = new HashMap();
        map.put("dialog_name", "study_profile_create");
        map.put("module_name", moduleName);
        C24662i.f75350a.m96881p(this.pageName, map);
    }

    /* JADX INFO: renamed from: q0 */
    private final void m84691q0() {
        HashMap map = new HashMap();
        map.put("dialog_name", "study_profile_create");
        C24662i.f75350a.m96884s(this.pageName, "dialog_show", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public final void m84692r0(boolean enabled) {
        BLTextView bLTextView = this.tvCreate;
        if (bLTextView != null) {
            bLTextView.setEnabled(enabled);
        }
        BLTextView bLTextView2 = this.tvCreate;
        if (bLTextView2 != null) {
            bLTextView2.setAlpha(enabled ? 1.0f : 0.35f);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.m97802h(context, "context");
        super.onAttach(context);
        String simpleName = requireActivity().getClass().getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        this.pageName = simpleName;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(2, 0);
        Bundle arguments = getArguments();
        this.showSwitchOnDone = arguments != null ? arguments.getBoolean("arg_show_switch_on_done", true) : true;
        Bundle arguments2 = getArguments();
        this.recordDismissOnClose = arguments2 != null ? arguments2.getBoolean("arg_record_dismiss_on_close", false) : false;
        Bundle arguments3 = getArguments();
        this.autoShowSoftInput = arguments3 != null ? arguments3.getBoolean("arg_auto_show_soft_input", true) : true;
        m84691q0();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawableResource(R.color.transparent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.etProfileName = (EditText) view.findViewById(R$id.etProfileName);
        this.ivClose = (ImageView) view.findViewById(R$id.ivClose);
        this.tvCreate = (BLTextView) view.findViewById(R$id.tvCreate);
        m84688n0();
        initView();
        if (this.autoShowSoftInput) {
            view.postDelayed(new Runnable() { // from class: rw.j
                @Override // java.lang.Runnable
                public final void run() {
                    CreateKidsProfileDialog.m84689o0(this.f83458a);
                }
            }, 200L);
        }
    }
}
