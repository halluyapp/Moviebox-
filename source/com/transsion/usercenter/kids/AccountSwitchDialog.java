package com.transsion.usercenter.kids;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import ck.C5118o;
import com.bumptech.glide.Glide;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.google.android.gms.common.Scopes;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.noober.background.view.BLConstraintLayout;
import com.p282tn.lib.dialog.BaseDialog;
import com.p282tn.lib.widget.TnTextView;
import com.therouter.TheRouter;
import com.transsion.baselib.kids.KidsAccountManager;
import com.transsion.baselib.kids.KidsProfile;
import com.transsion.usercenter.R$drawable;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$string;
import com.transsion.usercenter.kids.AccountSwitchDialog;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.File;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p441gz.InterfaceC23704a;
import p462hj.C23860f;
import p550kj.C24662i;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 12\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0003J!\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-¨\u00062"}, m97100d2 = {"Lcom/transsion/usercenter/kids/AccountSwitchDialog;", "Lcom/tn/lib/dialog/BaseDialog;", "<init>", "()V", "", "p0", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "i0", "(Landroid/view/View;)V", "t0", "v0", "s0", "", "moduleName", "r0", "(Ljava/lang/String;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", TmcConstants.NAVIGATION_ON_START, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lgz/a;", "a", "Lkotlin/Lazy;", "getMLoginApi", "()Lgz/a;", "mLoginApi", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "pageName", "", "c", "Z", "recordDismissOnClose", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "isAdultSelected", "Landroid/widget/FrameLayout;", "e", "Landroid/widget/FrameLayout;", "ringAdult", "f", "ringKids", "g", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class AccountSwitchDialog extends BaseDialog {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy mLoginApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean recordDismissOnClose;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isAdultSelected;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private FrameLayout ringAdult;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private FrameLayout ringKids;

    /* JADX INFO: renamed from: com.transsion.usercenter.kids.AccountSwitchDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ AccountSwitchDialog m84672b(Companion companion, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return companion.m84673a(z11);
        }

        /* JADX INFO: renamed from: a */
        public final AccountSwitchDialog m84673a(boolean z11) {
            AccountSwitchDialog accountSwitchDialog = new AccountSwitchDialog();
            Bundle bundle = new Bundle();
            bundle.putBoolean("arg_record_dismiss_on_close", z11);
            accountSwitchDialog.setArguments(bundle);
            return accountSwitchDialog;
        }
    }

    public AccountSwitchDialog() {
        super(R$layout.dialog_account_switch);
        this.mLoginApi = LazyKt.m97097b(new Function0() { // from class: rw.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountSwitchDialog.mLoginApi_delegate$lambda$0();
            }
        });
        this.pageName = "";
        this.isAdultSelected = true;
    }

    private final InterfaceC23704a getMLoginApi() {
        return (InterfaceC23704a) this.mLoginApi.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    private final void m84658i0(View view) {
        ImageView imageView = (ImageView) view.findViewById(R$id.ivAdultAvatar);
        TnTextView tnTextView = (TnTextView) view.findViewById(R$id.tvAdultName);
        ImageView imageView2 = (ImageView) view.findViewById(R$id.ivAdultLoginArrow);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R$id.layoutAdultAccount);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R$id.layoutKidsAccount);
        ImageView imageView3 = (ImageView) view.findViewById(R$id.ivKidsAvatar);
        TnTextView tnTextView2 = (TnTextView) view.findViewById(R$id.tvKidsName);
        LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R$id.layoutAddKids);
        BLConstraintLayout bLConstraintLayout = (BLConstraintLayout) view.findViewById(R$id.layoutAddBtn);
        View viewFindViewById = view.findViewById(R$id.tvManageProfiles);
        InterfaceC23704a mLoginApi = getMLoginApi();
        UserInfo userInfoMo90386h = mLoginApi != null ? mLoginApi.mo90386h() : null;
        InterfaceC23704a mLoginApi2 = getMLoginApi();
        boolean zMo90379a = mLoginApi2 != null ? mLoginApi2.mo90379a() : false;
        final String nickname = userInfoMo90386h != null ? userInfoMo90386h.getNickname() : null;
        final String avatar = userInfoMo90386h != null ? userInfoMo90386h.getAvatar() : null;
        C23860f.a aVar = C23860f.f72909a;
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        C23860f.b bVarM94470i = aVar.m94457m(contextRequireContext).m94468g(avatar).m94470i(R$drawable.ic_default_avatar);
        Intrinsics.m97799e(imageView);
        bVarM94470i.m94465d(imageView);
        if (zMo90379a) {
            if (tnTextView != null) {
                tnTextView.setText(nickname == null ? "" : nickname);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: rw.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        AccountSwitchDialog.m84659j0(this.f83443a, view2);
                    }
                });
            }
        } else {
            if (tnTextView != null) {
                tnTextView.setText(getString(R$string.profile_setting_log_in));
            }
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            imageView.setOnClickListener(new View.OnClickListener() { // from class: rw.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AccountSwitchDialog.m84660k0(this.f83445a, view2);
                }
            });
            if (tnTextView != null) {
                tnTextView.setOnClickListener(new View.OnClickListener() { // from class: rw.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        AccountSwitchDialog.m84661l0(this.f83447a, view2);
                    }
                });
            }
        }
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: rw.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AccountSwitchDialog.m84662m0(this.f83449a, nickname, avatar, view2);
                }
            });
        }
        this.isAdultSelected = !C5118o.f17608a.m23948i();
        m84671v0();
        final KidsProfile kidsProfileM65181f = KidsAccountManager.f50883a.m65181f();
        if (kidsProfileM65181f == null) {
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
            if (bLConstraintLayout != null) {
                bLConstraintLayout.setOnClickListener(new View.OnClickListener() { // from class: rw.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        AccountSwitchDialog.m84664o0(this.f83455a, view2);
                    }
                });
                return;
            }
            return;
        }
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
        String avatarLocalPath = kidsProfileM65181f.getAvatarLocalPath();
        if (avatarLocalPath != null && avatarLocalPath.length() != 0) {
            Glide.with(requireContext()).load2(new File(avatarLocalPath)).into(imageView3);
        } else if (imageView3 != null) {
            imageView3.setImageResource(kidsProfileM65181f.getAvatarResId());
        }
        if (tnTextView2 != null) {
            tnTextView2.setText(kidsProfileM65181f.getName());
        }
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: rw.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AccountSwitchDialog.m84663n0(this.f83452a, kidsProfileM65181f, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final void m84659j0(AccountSwitchDialog accountSwitchDialog, View view) {
        accountSwitchDialog.m84669t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final void m84660k0(AccountSwitchDialog accountSwitchDialog, View view) {
        accountSwitchDialog.m84669t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final void m84661l0(AccountSwitchDialog accountSwitchDialog, View view) {
        Context contextRequireContext = accountSwitchDialog.requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        accountSwitchDialog.dismissAllowingStateLoss();
        C26866a.a.m104898f(C26866a.f81698a, "AccountSwitchDialog", "login adult account.", false, 4, null);
        InterfaceC23704a interfaceC23704a = (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
        if (interfaceC23704a != null) {
            interfaceC23704a.mo90387i(contextRequireContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final void m84662m0(AccountSwitchDialog accountSwitchDialog, String str, String str2, View view) {
        C26866a.a.m104898f(C26866a.f81698a, "AccountSwitchDialog", "enter manage profile.", false, 4, null);
        accountSwitchDialog.dismissAllowingStateLoss();
        accountSwitchDialog.m84667r0("manage_profile");
        ManageProfilesActivity.INSTANCE.m84704a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23704a mLoginApi_delegate$lambda$0() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final void m84663n0(AccountSwitchDialog accountSwitchDialog, KidsProfile kidsProfile, View view) {
        C26866a.a.m104898f(C26866a.f81698a, "AccountSwitchDialog", "switch to kids.", false, 4, null);
        if (C5118o.f17608a.m23948i()) {
            accountSwitchDialog.dismissAllowingStateLoss();
            return;
        }
        accountSwitchDialog.isAdultSelected = false;
        accountSwitchDialog.m84671v0();
        KidsAccountManager.f50883a.m65178c(kidsProfile);
        accountSwitchDialog.dismissAllowingStateLoss();
        accountSwitchDialog.m84667r0(Scopes.PROFILE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final void m84664o0(AccountSwitchDialog accountSwitchDialog, View view) {
        C26866a.a.m104898f(C26866a.f81698a, "AccountSwitchDialog", "start create kids account.", false, 4, null);
        FragmentActivity fragmentActivityRequireActivity = accountSwitchDialog.requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        accountSwitchDialog.dismissAllowingStateLoss();
        CreateKidsProfileDialog.Companion.m84693b(CreateKidsProfileDialog.INSTANCE, false, false, false, 7, null).m61941X(fragmentActivityRequireActivity, "CreateKidsProfileDialog");
    }

    /* JADX INFO: renamed from: p0 */
    private final void m84665p0() {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m84666q0(AccountSwitchDialog accountSwitchDialog, View view) {
        if (accountSwitchDialog.recordDismissOnClose) {
            KidsAccountManager.f50883a.m65186l();
        }
        accountSwitchDialog.dismissAllowingStateLoss();
        accountSwitchDialog.m84667r0("close");
    }

    /* JADX INFO: renamed from: r0 */
    private final void m84667r0(String moduleName) {
        HashMap map = new HashMap();
        map.put("dialog_name", "profile_select");
        map.put("module_name", moduleName);
        C24662i.f75350a.m96881p(this.pageName, map);
    }

    /* JADX INFO: renamed from: s0 */
    private final void m84668s0() {
        HashMap map = new HashMap();
        map.put("dialog_name", "profile_select");
        C24662i.f75350a.m96884s(this.pageName, "dialog_show", map);
    }

    /* JADX INFO: renamed from: t0 */
    private final void m84669t0() {
        String kidsId;
        C26866a.a.m104898f(C26866a.f81698a, "AccountSwitchDialog", "switch to adult.", false, 4, null);
        m84667r0(Scopes.PROFILE);
        if (!C5118o.f17608a.m23948i()) {
            dismissAllowingStateLoss();
            return;
        }
        this.isAdultSelected = true;
        m84671v0();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        KidsAccountManager kidsAccountManager = KidsAccountManager.f50883a;
        KidsProfile kidsProfileM65181f = kidsAccountManager.m65181f();
        if (kidsProfileM65181f == null || (kidsId = kidsProfileM65181f.getKidsId()) == null) {
            return;
        }
        dismissAllowingStateLoss();
        if (kidsAccountManager.m65183i()) {
            PinInputDialog.Companion.m84762d(PinInputDialog.INSTANCE, kidsId, false, new Function0() { // from class: rw.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountSwitchDialog.m84670u0();
                }
            }, 2, null).m61941X(fragmentActivityRequireActivity, "PinInputDialog");
        } else {
            kidsAccountManager.m65179d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final Unit m84670u0() {
        KidsAccountManager.f50883a.m65179d();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: v0 */
    private final void m84671v0() {
        FrameLayout frameLayout = this.ringAdult;
        if (frameLayout != null) {
            frameLayout.setSelected(this.isAdultSelected);
        }
        FrameLayout frameLayout2 = this.ringKids;
        if (frameLayout2 != null) {
            frameLayout2.setSelected(!this.isAdultSelected);
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
        C26866a.a.m104898f(C26866a.f81698a, "AccountSwitchDialog", "dialog show.", false, 4, null);
        setStyle(2, 0);
        Bundle arguments = getArguments();
        this.recordDismissOnClose = arguments != null ? arguments.getBoolean("arg_record_dismiss_on_close") : false;
        m84668s0();
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
        this.ringAdult = (FrameLayout) view.findViewById(R$id.ringAdult);
        this.ringKids = (FrameLayout) view.findViewById(R$id.ringKids);
        m84665p0();
        m84658i0(view);
        ImageView imageView = (ImageView) view.findViewById(R$id.ivClose);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: rw.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AccountSwitchDialog.m84666q0(this.f83441a, view2);
                }
            });
        }
    }
}
