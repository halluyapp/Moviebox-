package com.transsion.rewardscenter.p309ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3233y0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.R$color;
import com.transsion.baseui.dialog.BaseMemberLoadingDialog;
import com.transsion.rewardscenter.R$drawable;
import com.transsion.rewardscenter.R$string;
import com.transsion.rewardscenter.model.ClaimRewardViewModel;
import com.transsion.rewardscenter.utils.AbstractC18021p;
import com.transsion.rewardscenter.utils.C18008c;
import com.transsion.rewardscenterapi.ClaimReceiverRequest;
import com.transsion.rewardscenterapi.PhoneInfo;
import com.transsnet.loginapi.bean.Country;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p550kj.C24655b;
import p986zp.C29214c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ%\u0010\u0015\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b%\u0010&J\u0011\u0010'\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010*\u001a\u00020\u0005H\u0016¢\u0006\u0004\b*\u0010\u0004J)\u00100\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0005H\u0016¢\u0006\u0004\b2\u0010\u0004R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010BR\u0016\u0010G\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010?R\u0014\u0010I\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010!R\u0014\u0010K\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010!¨\u0006N"}, m97100d2 = {"Lcom/transsion/rewardscenter/ui/ClaimRewardFragment;", "Lcom/transsion/rewardscenter/ui/FitStatusBarFragment;", "Lzp/c;", "<init>", "()V", "", "M0", "Lcom/transsnet/loginapi/bean/Country;", PlaceTypes.COUNTRY, "c1", "(Lcom/transsnet/loginapi/bean/Country;)V", "d1", "", "f1", "()Z", "g1", "e1", "Landroid/view/View;", "containerView", "Landroid/widget/EditText;", "hintView", "Z0", "(Landroid/view/View;Landroid/widget/EditText;)V", "E0", "b1", "showLoading", "G0", "Landroid/view/LayoutInflater;", "inflater", "K0", "(Landroid/view/LayoutInflater;)Lzp/c;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "n0", "()Landroid/view/View;", "o0", "initViewData", "initListener", "initViewModel", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "retryLoadData", "Lcom/transsion/baseui/dialog/BaseMemberLoadingDialog;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "I0", "()Lcom/transsion/baseui/dialog/BaseMemberLoadingDialog;", "loadingDialog", "Lcom/transsion/rewardscenter/model/ClaimRewardViewModel;", "c", "L0", "()Lcom/transsion/rewardscenter/model/ClaimRewardViewModel;", "viewModel", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/String;", "prizeId", "e", "Lcom/transsnet/loginapi/bean/Country;", "mainCountry", "f", "altCountry", "g", "mainPhoneCCArg", "J0", "mainPhoneCC", "H0", "altPhoneCC", "h", "a", "RewardsCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ClaimRewardFragment extends FitStatusBarFragment<C29214c> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i */
    public static final int f58900i = 8;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy loadingDialog = LazyKt.m97097b(new Function0() { // from class: com.transsion.rewardscenter.ui.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ClaimRewardFragment.m76485Y0();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String prizeId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Country mainCountry;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Country altCountry;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String mainPhoneCCArg;

    /* JADX INFO: renamed from: com.transsion.rewardscenter.ui.ClaimRewardFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ClaimRewardFragment m76505a(String prizeId) {
            Intrinsics.m97802h(prizeId, "prizeId");
            ClaimRewardFragment claimRewardFragment = new ClaimRewardFragment();
            Bundle bundle = new Bundle();
            bundle.putString("prize_id", prizeId);
            claimRewardFragment.setArguments(bundle);
            return claimRewardFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.rewardscenter.ui.ClaimRewardFragment$b */
    public static final class C17952b implements TextWatcher {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function4 f58907a;

        public C17952b(Function4 function4) {
            this.f58907a = function4;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            this.f58907a.invoke(charSequence, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
    }

    /* JADX INFO: renamed from: com.transsion.rewardscenter.ui.ClaimRewardFragment$c */
    public static final class C17953c implements TextWatcher {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function4 f58908a;

        public C17953c(Function4 function4) {
            this.f58908a = function4;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            this.f58908a.invoke(charSequence, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
    }

    /* JADX INFO: renamed from: com.transsion.rewardscenter.ui.ClaimRewardFragment$d */
    public static final class C17954d implements TextWatcher {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function4 f58909a;

        public C17954d(Function4 function4) {
            this.f58909a = function4;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            this.f58909a.invoke(charSequence, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
    }

    /* JADX INFO: renamed from: com.transsion.rewardscenter.ui.ClaimRewardFragment$e */
    static final class C17955e implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f58910a;

        C17955e(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f58910a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f58910a;
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
            this.f58910a.invoke(obj);
        }
    }

    public ClaimRewardFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.rewardscenter.ui.ClaimRewardFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.viewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(ClaimRewardViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.rewardscenter.ui.ClaimRewardFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.rewardscenter.ui.ClaimRewardFragment$special$$inlined$viewModels$default$3
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
        this.prizeId = "";
        this.mainCountry = new Country();
        this.altCountry = new Country();
        this.mainPhoneCCArg = "";
    }

    /* JADX INFO: renamed from: E0 */
    private final void m76466E0(View containerView, EditText hintView) {
        if (containerView != null) {
            containerView.setBackgroundResource(R$drawable.phone_input_bg);
        }
        if (hintView != null) {
            hintView.setHintTextColor(AbstractC2397b.getColor(requireContext(), R$color.base_white_30_p));
        }
    }

    /* JADX INFO: renamed from: F0 */
    static /* synthetic */ void m76467F0(ClaimRewardFragment claimRewardFragment, View view, EditText editText, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            editText = view instanceof EditText ? (EditText) view : null;
        }
        claimRewardFragment.m76466E0(view, editText);
    }

    /* JADX INFO: renamed from: G0 */
    private final void m76468G0() {
        try {
            Result.Companion companion = Result.INSTANCE;
            m76470I0().dismissAllowingStateLoss();
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: H0 */
    private final String m76469H0() {
        String code;
        Country country = this.altCountry;
        return (country == null || (code = country.getCode()) == null) ? m76471J0() : code;
    }

    /* JADX INFO: renamed from: I0 */
    private final BaseMemberLoadingDialog m76470I0() {
        return (BaseMemberLoadingDialog) this.loadingDialog.getValue();
    }

    /* JADX INFO: renamed from: J0 */
    private final String m76471J0() {
        String code;
        Country country = this.mainCountry;
        return (country == null || (code = country.getCode()) == null) ? this.mainPhoneCCArg : code;
    }

    /* JADX INFO: renamed from: L0 */
    private final ClaimRewardViewModel m76472L0() {
        return (ClaimRewardViewModel) this.viewModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M0 */
    private final void m76473M0() {
        C29214c c29214c;
        EditText editText;
        Triple tripleM76633a = C18008c.f58985a.m76633a();
        Country country = this.mainCountry;
        country.setCode((String) tripleM76633a.getFirst());
        country.setCountry_s((String) tripleM76633a.getSecond());
        m76489c1(this.mainCountry);
        if (StringsKt.m98160q0((CharSequence) tripleM76633a.getThird()) || (c29214c = (C29214c) getMViewBinding()) == null || (editText = c29214c.f89117g) == null) {
            return;
        }
        editText.setText((CharSequence) tripleM76633a.getThird());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final void m76474N0(ClaimRewardFragment claimRewardFragment, View view) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        FragmentActivity activity = claimRewardFragment.getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.m944l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final void m76475O0(ClaimRewardFragment claimRewardFragment, View view) {
        Navigator.m61846y(TheRouter.m61773c("/loginapi/select_country"), claimRewardFragment, 1001, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final void m76476P0(ClaimRewardFragment claimRewardFragment, View view) {
        Navigator.m61846y(TheRouter.m61773c("/loginapi/select_country"), claimRewardFragment, 1002, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final Unit m76477Q0(ClaimRewardFragment claimRewardFragment, CharSequence charSequence, int i11, int i12, int i13) {
        claimRewardFragment.m76490d1();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R0 */
    public static final void m76478R0(ClaimRewardFragment claimRewardFragment, View view, boolean z11) {
        if (!z11) {
            claimRewardFragment.m76492f1();
        } else {
            C29214c c29214c = (C29214c) claimRewardFragment.getMViewBinding();
            m76467F0(claimRewardFragment, c29214c != null ? c29214c.f89116f : null, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S0 */
    public static final void m76479S0(ClaimRewardFragment claimRewardFragment, View view, boolean z11) {
        if (!z11) {
            claimRewardFragment.m76493g1();
            return;
        }
        C29214c c29214c = (C29214c) claimRewardFragment.getMViewBinding();
        LinearLayout linearLayout = c29214c != null ? c29214c.f89122l : null;
        C29214c c29214c2 = (C29214c) claimRewardFragment.getMViewBinding();
        claimRewardFragment.m76466E0(linearLayout, c29214c2 != null ? c29214c2.f89117g : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T0 */
    public static final void m76480T0(ClaimRewardFragment claimRewardFragment, View view, boolean z11) {
        if (!z11) {
            claimRewardFragment.m76491e1();
        } else {
            C29214c c29214c = (C29214c) claimRewardFragment.getMViewBinding();
            m76467F0(claimRewardFragment, c29214c != null ? c29214c.f89113c : null, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final Unit m76481U0(ClaimRewardFragment claimRewardFragment, View it) {
        Intrinsics.m97802h(it, "it");
        KeyboardUtils.m27130d(claimRewardFragment.requireActivity());
        claimRewardFragment.m76488b1();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final Unit m76482V0(ClaimRewardFragment claimRewardFragment, Boolean bool) {
        if (bool.booleanValue()) {
            claimRewardFragment.showLoading();
        } else {
            claimRewardFragment.m76468G0();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final Unit m76483W0(ClaimRewardFragment claimRewardFragment, Pair pair) {
        String string;
        if (Intrinsics.m97797c((String) pair.getFirst(), "400")) {
            string = (String) pair.getSecond();
            if (string == null) {
                string = claimRewardFragment.getString(R$string.claim_failed);
                Intrinsics.m97801g(string, "getString(...)");
            }
        } else {
            string = claimRewardFragment.getString(R$string.claim_failed);
            Intrinsics.m97801g(string, "getString(...)");
        }
        AbstractC18021p.m76643a(false, string);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final Unit m76484X0(ClaimRewardFragment claimRewardFragment, Boolean bool) {
        if (Intrinsics.m97797c(bool, Boolean.TRUE)) {
            FragmentActivity activity = claimRewardFragment.getActivity();
            ClaimRewardActivity claimRewardActivity = activity instanceof ClaimRewardActivity ? (ClaimRewardActivity) activity : null;
            if (claimRewardActivity != null) {
                claimRewardActivity.m76461D0();
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final BaseMemberLoadingDialog m76485Y0() {
        return new BaseMemberLoadingDialog();
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m76486Z0(View containerView, EditText hintView) {
        if (containerView != null) {
            containerView.setBackgroundResource(R$drawable.phone_input_error_bg);
        }
        if (hintView != null) {
            hintView.setHintTextColor(AbstractC2397b.getColor(requireContext(), com.transsion.rewardscenter.R$color.input_error_hint));
        }
    }

    /* JADX INFO: renamed from: a1 */
    static /* synthetic */ void m76487a1(ClaimRewardFragment claimRewardFragment, View view, EditText editText, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            editText = view instanceof EditText ? (EditText) view : null;
        }
        claimRewardFragment.m76486Z0(view, editText);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b1 */
    private final void m76488b1() {
        EditText editText;
        Editable text;
        EditText editText2;
        Editable text2;
        EditText editText3;
        Editable text3;
        EditText editText4;
        Editable text4;
        EditText editText5;
        Editable text5;
        EditText editText6;
        Editable text6;
        boolean zM76492f1 = m76492f1();
        boolean zM76493g1 = m76493g1();
        boolean zM76491e1 = m76491e1();
        if (zM76492f1 && zM76493g1 && zM76491e1) {
            C29214c c29214c = (C29214c) getMViewBinding();
            String string = (c29214c == null || (editText6 = c29214c.f89116f) == null || (text6 = editText6.getText()) == null) ? null : text6.toString();
            String str = string == null ? "" : string;
            C29214c c29214c2 = (C29214c) getMViewBinding();
            String string2 = (c29214c2 == null || (editText5 = c29214c2.f89117g) == null || (text5 = editText5.getText()) == null) ? null : text5.toString();
            if (string2 == null) {
                string2 = "";
            }
            C29214c c29214c3 = (C29214c) getMViewBinding();
            String string3 = (c29214c3 == null || (editText4 = c29214c3.f89114d) == null || (text4 = editText4.getText()) == null) ? null : text4.toString();
            if (string3 == null) {
                string3 = "";
            }
            if (StringsKt.m98160q0(string3)) {
                string3 = null;
            }
            C29214c c29214c4 = (C29214c) getMViewBinding();
            String string4 = (c29214c4 == null || (editText3 = c29214c4.f89113c) == null || (text3 = editText3.getText()) == null) ? null : text3.toString();
            String str2 = string4 == null ? "" : string4;
            C29214c c29214c5 = (C29214c) getMViewBinding();
            String string5 = (c29214c5 == null || (editText2 = c29214c5.f89118h) == null || (text2 = editText2.getText()) == null) ? null : text2.toString();
            if (string5 == null) {
                string5 = "";
            }
            String str3 = StringsKt.m98160q0(string5) ? null : string5;
            C29214c c29214c6 = (C29214c) getMViewBinding();
            String string6 = (c29214c6 == null || (editText = c29214c6.f89115e) == null || (text = editText.getText()) == null) ? null : text.toString();
            String str4 = string6 != null ? string6 : "";
            String str5 = StringsKt.m98160q0(str4) ? null : str4;
            List listC = CollectionsKt.m97497c();
            listC.add(new PhoneInfo(m76471J0(), string2, this.mainCountry.getCountry_s()));
            if (string3 != null) {
                listC.add(new PhoneInfo(m76469H0(), string3, this.altCountry.getCountry_s()));
            }
            m76472L0().m76091h(new ClaimReceiverRequest(this.prizeId, str, CollectionsKt.m97495a(listC), str5, str2, str3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c1 */
    private final void m76489c1(Country country) {
        TextView textView;
        TextView textView2;
        this.altCountry = country;
        String code = country.getCode();
        if (code == null) {
            code = "";
        }
        String str = "+" + code;
        C29214c c29214c = (C29214c) getMViewBinding();
        if (c29214c != null && (textView2 = c29214c.f89127q) != null) {
            textView2.setText(str);
        }
        String code2 = country.getCode();
        String str2 = "+" + (code2 != null ? code2 : "");
        C29214c c29214c2 = (C29214c) getMViewBinding();
        if (c29214c2 == null || (textView = c29214c2.f89126p) == null) {
            return;
        }
        textView.setText(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d1 */
    private final void m76490d1() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        Editable text;
        EditText editText2;
        Editable text2;
        EditText editText3;
        Editable text3;
        C29214c c29214c = (C29214c) getMViewBinding();
        String string = null;
        String string2 = (c29214c == null || (editText3 = c29214c.f89116f) == null || (text3 = editText3.getText()) == null) ? null : text3.toString();
        if (string2 == null) {
            string2 = "";
        }
        C29214c c29214c2 = (C29214c) getMViewBinding();
        String string3 = (c29214c2 == null || (editText2 = c29214c2.f89117g) == null || (text2 = editText2.getText()) == null) ? null : text2.toString();
        if (string3 == null) {
            string3 = "";
        }
        C29214c c29214c3 = (C29214c) getMViewBinding();
        if (c29214c3 != null && (editText = c29214c3.f89113c) != null && (text = editText.getText()) != null) {
            string = text.toString();
        }
        boolean z11 = (StringsKt.m98160q0(string2) || StringsKt.m98160q0(m76471J0()) || !C18008c.f58985a.m76634b(string3) || StringsKt.m98160q0(string != null ? string : "")) ? false : true;
        C29214c c29214c4 = (C29214c) getMViewBinding();
        if (c29214c4 == null || (appCompatTextView = c29214c4.f89112b) == null) {
            return;
        }
        appCompatTextView.setAlpha(z11 ? 1.0f : 0.5f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e1 */
    private final boolean m76491e1() {
        EditText editText;
        Editable text;
        String string;
        C29214c c29214c = (C29214c) getMViewBinding();
        boolean z11 = false;
        if (c29214c != null && (editText = c29214c.f89113c) != null && (text = editText.getText()) != null && (string = text.toString()) != null && (!StringsKt.m98160q0(string))) {
            z11 = true;
        }
        if (z11) {
            C29214c c29214c2 = (C29214c) getMViewBinding();
            m76467F0(this, c29214c2 != null ? c29214c2.f89113c : null, null, 2, null);
        } else {
            C29214c c29214c3 = (C29214c) getMViewBinding();
            m76487a1(this, c29214c3 != null ? c29214c3.f89113c : null, null, 2, null);
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f1 */
    private final boolean m76492f1() {
        EditText editText;
        Editable text;
        String string;
        C29214c c29214c = (C29214c) getMViewBinding();
        boolean z11 = false;
        if (c29214c != null && (editText = c29214c.f89116f) != null && (text = editText.getText()) != null && (string = text.toString()) != null && (!StringsKt.m98160q0(string))) {
            z11 = true;
        }
        if (z11) {
            C29214c c29214c2 = (C29214c) getMViewBinding();
            m76467F0(this, c29214c2 != null ? c29214c2.f89116f : null, null, 2, null);
        } else {
            C29214c c29214c3 = (C29214c) getMViewBinding();
            m76487a1(this, c29214c3 != null ? c29214c3.f89116f : null, null, 2, null);
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g1 */
    private final boolean m76493g1() {
        EditText editText;
        Editable text;
        boolean zQ0 = StringsKt.m98160q0(m76471J0());
        C18008c c18008c = C18008c.f58985a;
        C29214c c29214c = (C29214c) getMViewBinding();
        String string = (c29214c == null || (editText = c29214c.f89117g) == null || (text = editText.getText()) == null) ? null : text.toString();
        if (string == null) {
            string = "";
        }
        boolean zM76634b = c18008c.m76634b(string);
        boolean z11 = !zQ0 && zM76634b;
        if (z11) {
            C29214c c29214c2 = (C29214c) getMViewBinding();
            LinearLayout linearLayout = c29214c2 != null ? c29214c2.f89122l : null;
            C29214c c29214c3 = (C29214c) getMViewBinding();
            m76466E0(linearLayout, c29214c3 != null ? c29214c3.f89117g : null);
            C29214c c29214c4 = (C29214c) getMViewBinding();
            m76467F0(this, c29214c4 != null ? c29214c4.f89127q : null, null, 2, null);
        } else {
            if (zQ0) {
                C29214c c29214c5 = (C29214c) getMViewBinding();
                m76487a1(this, c29214c5 != null ? c29214c5.f89127q : null, null, 2, null);
            }
            if (!zM76634b) {
                C29214c c29214c6 = (C29214c) getMViewBinding();
                LinearLayout linearLayout2 = c29214c6 != null ? c29214c6.f89122l : null;
                C29214c c29214c7 = (C29214c) getMViewBinding();
                m76486Z0(linearLayout2, c29214c7 != null ? c29214c7.f89117g : null);
            }
        }
        return z11;
    }

    private final void showLoading() {
        m76470I0().m65437l0(this, "loading");
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public C29214c getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C29214c c29214cM112083c = C29214c.m112083c(inflater);
        Intrinsics.m97801g(c29214cM112083c, "inflate(...)");
        return c29214cM112083c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        EditText editText3;
        EditText editText4;
        EditText editText5;
        EditText editText6;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        AppCompatImageView appCompatImageView;
        C29214c c29214c = (C29214c) getMViewBinding();
        if (c29214c != null && (appCompatImageView = c29214c.f89119i) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.rewardscenter.ui.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ClaimRewardFragment.m76474N0(this.f58935a, view);
                }
            });
        }
        C29214c c29214c2 = (C29214c) getMViewBinding();
        if (c29214c2 != null && (linearLayout2 = c29214c2.f89121k) != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.rewardscenter.ui.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ClaimRewardFragment.m76475O0(this.f58941a, view);
                }
            });
        }
        C29214c c29214c3 = (C29214c) getMViewBinding();
        if (c29214c3 != null && (linearLayout = c29214c3.f89120j) != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.rewardscenter.ui.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ClaimRewardFragment.m76476P0(this.f58943a, view);
                }
            });
        }
        Function4 function4 = new Function4() { // from class: com.transsion.rewardscenter.ui.f
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ClaimRewardFragment.m76477Q0(this.f58945a, (CharSequence) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue());
            }
        };
        C29214c c29214c4 = (C29214c) getMViewBinding();
        if (c29214c4 != null && (editText6 = c29214c4.f89116f) != null) {
            editText6.addTextChangedListener(new C17952b(function4));
        }
        C29214c c29214c5 = (C29214c) getMViewBinding();
        if (c29214c5 != null && (editText5 = c29214c5.f89117g) != null) {
            editText5.addTextChangedListener(new C17953c(function4));
        }
        C29214c c29214c6 = (C29214c) getMViewBinding();
        if (c29214c6 != null && (editText4 = c29214c6.f89113c) != null) {
            editText4.addTextChangedListener(new C17954d(function4));
        }
        C29214c c29214c7 = (C29214c) getMViewBinding();
        if (c29214c7 != null && (editText3 = c29214c7.f89116f) != null) {
            editText3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.transsion.rewardscenter.ui.g
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    ClaimRewardFragment.m76478R0(this.f58947a, view, z11);
                }
            });
        }
        C29214c c29214c8 = (C29214c) getMViewBinding();
        if (c29214c8 != null && (editText2 = c29214c8.f89117g) != null) {
            editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.transsion.rewardscenter.ui.h
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    ClaimRewardFragment.m76479S0(this.f58949a, view, z11);
                }
            });
        }
        C29214c c29214c9 = (C29214c) getMViewBinding();
        if (c29214c9 != null && (editText = c29214c9.f89113c) != null) {
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.transsion.rewardscenter.ui.i
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    ClaimRewardFragment.m76480T0(this.f58951a, view, z11);
                }
            });
        }
        C29214c c29214c10 = (C29214c) getMViewBinding();
        if (c29214c10 == null || (appCompatTextView = c29214c10.f89112b) == null) {
            return;
        }
        AbstractC26006c.m102050c(appCompatTextView, 0L, new Function1() { // from class: com.transsion.rewardscenter.ui.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClaimRewardFragment.m76481U0(this.f58953a, (View) obj);
            }
        }, 1, null);
    }

    @Override // com.transsion.rewardscenter.p309ui.FitStatusBarFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        super.initViewData();
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("prize_id", "");
            Intrinsics.m97801g(string, "getString(...)");
            this.prizeId = string;
        }
        m76473M0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m76472L0().m76090g().m14851j(getViewLifecycleOwner(), new C17955e(new Function1() { // from class: com.transsion.rewardscenter.ui.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClaimRewardFragment.m76482V0(this.f58956a, (Boolean) obj);
            }
        }));
        m76472L0().m76089f().m14851j(getViewLifecycleOwner(), new C17955e(new Function1() { // from class: com.transsion.rewardscenter.ui.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClaimRewardFragment.m76483W0(this.f58937a, (Pair) obj);
            }
        }));
        m76472L0().m76088e().m14851j(getViewLifecycleOwner(), new C17955e(new Function1() { // from class: com.transsion.rewardscenter.ui.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ClaimRewardFragment.m76484X0(this.f58939a, (Boolean) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.rewardscenter.p309ui.FitStatusBarFragment
    /* JADX INFO: renamed from: n0 */
    protected View mo76503n0() {
        C29214c c29214c = (C29214c) getMViewBinding();
        if (c29214c != null) {
            return c29214c.f89125o;
        }
        return null;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("claim_reward", false, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.rewardscenter.p309ui.FitStatusBarFragment
    /* JADX INFO: renamed from: o0 */
    protected View mo76504o0() {
        C29214c c29214c = (C29214c) getMViewBinding();
        if (c29214c != null) {
            return c29214c.f89123m;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        TextView textView;
        TextView textView2;
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != -1) {
            return;
        }
        Serializable serializableExtra = data != null ? data.getSerializableExtra("countryCode") : null;
        Country country = serializableExtra instanceof Country ? (Country) serializableExtra : null;
        if (country == null) {
            return;
        }
        if (requestCode == 1001) {
            this.mainCountry = country;
            C29214c c29214c = (C29214c) getMViewBinding();
            if (c29214c == null || (textView = c29214c.f89127q) == null) {
                return;
            }
            textView.setText("+" + country.getCode());
            return;
        }
        if (requestCode != 1002) {
            return;
        }
        this.altCountry = country;
        C29214c c29214c2 = (C29214c) getMViewBinding();
        if (c29214c2 == null || (textView2 = c29214c2.f89126p) == null) {
            return;
        }
        textView2.setText("+" + country.getCode());
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }
}
