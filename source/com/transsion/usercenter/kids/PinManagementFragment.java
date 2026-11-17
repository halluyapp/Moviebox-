package com.transsion.usercenter.kids;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.noober.background.view.BLConstraintLayout;
import com.transsion.baselib.kids.KidsAccountManager;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.baseui.util.AbstractC14567m;
import com.transsion.usercenter.R$string;
import com.transsion.usercenter.kids.PinManagementFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p585lw.C25713i0;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m97100d2 = {"Lcom/transsion/usercenter/kids/PinManagementFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Llw/i0;", "<init>", "()V", "", "h0", "Landroidx/fragment/app/FragmentActivity;", "g0", "()Landroidx/fragment/app/FragmentActivity;", "Landroid/view/LayoutInflater;", "inflater", "f0", "(Landroid/view/LayoutInflater;)Llw/i0;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "onResume", "", "a", "Ljava/lang/String;", "kidsId", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class PinManagementFragment extends BaseFragment<C25713i0> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String kidsId = "";

    /* JADX INFO: renamed from: com.transsion.usercenter.kids.PinManagementFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final PinManagementFragment m84781a(String kidsId) {
            Intrinsics.m97802h(kidsId, "kidsId");
            PinManagementFragment pinManagementFragment = new PinManagementFragment();
            Bundle bundle = new Bundle();
            bundle.putString("arg_kids_id", kidsId);
            pinManagementFragment.setArguments(bundle);
            return pinManagementFragment;
        }
    }

    /* JADX INFO: renamed from: g0 */
    private final FragmentActivity m84773g0() {
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            return null;
        }
        return activity;
    }

    /* JADX INFO: renamed from: h0 */
    private final void m84774h0() {
        BLConstraintLayout bLConstraintLayout;
        BLConstraintLayout bLConstraintLayout2;
        C25713i0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && (bLConstraintLayout2 = mViewBinding.f78205e) != null) {
            bLConstraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: rw.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PinManagementFragment.m84775i0(this.f83457a, view);
                }
            });
        }
        C25713i0 mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (bLConstraintLayout = mViewBinding2.f78206f) == null) {
            return;
        }
        bLConstraintLayout.setOnClickListener(new View.OnClickListener() { // from class: rw.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PinManagementFragment.m84778l0(this.f83459a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final void m84775i0(PinManagementFragment pinManagementFragment, View view) {
        C26866a.a.m104898f(C26866a.f81698a, "PinManagementFragment", "click change.", false, 4, null);
        final FragmentActivity fragmentActivityM84773g0 = pinManagementFragment.m84773g0();
        if (fragmentActivityM84773g0 == null) {
            return;
        }
        PinInputDialog.Companion.m84762d(PinInputDialog.INSTANCE, pinManagementFragment.kidsId, false, new Function0() { // from class: rw.k0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PinManagementFragment.m84776j0(fragmentActivityM84773g0);
            }
        }, 2, null).m61941X(fragmentActivityM84773g0, "PinInputDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final Unit m84776j0(FragmentActivity fragmentActivity) {
        PinInputDialog.Companion.m84761b(PinInputDialog.INSTANCE, true, new Function1() { // from class: rw.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PinManagementFragment.m84777k0((String) obj);
            }
        }, null, 4, null).m61941X(fragmentActivity, "PinInputDialog");
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final Unit m84777k0(String pin) {
        Intrinsics.m97802h(pin, "pin");
        C26866a.a.m104898f(C26866a.f81698a, "PinManagementFragment", "change success.", false, 4, null);
        KidsAccountManager.f50883a.m65189p(pin);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final void m84778l0(final PinManagementFragment pinManagementFragment, View view) {
        C26866a.a.m104898f(C26866a.f81698a, "PinManagementFragment", "click delete.", false, 4, null);
        final FragmentActivity fragmentActivityM84773g0 = pinManagementFragment.m84773g0();
        if (fragmentActivityM84773g0 == null) {
            return;
        }
        PinInputDialog.Companion.m84762d(PinInputDialog.INSTANCE, pinManagementFragment.kidsId, false, new Function0() { // from class: rw.l0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PinManagementFragment.m84779m0(this.f83462a, fragmentActivityM84773g0);
            }
        }, 2, null).m61941X(fragmentActivityM84773g0, "PinInputDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final Unit m84779m0(PinManagementFragment pinManagementFragment, FragmentActivity fragmentActivity) {
        C26866a.a.m104898f(C26866a.f81698a, "PinManagementFragment", "delete success.", false, 4, null);
        KidsAccountManager.f50883a.m65189p("");
        String string = pinManagementFragment.getString(R$string.kids_pin_delete_finish);
        Intrinsics.m97801g(string, "getString(...)");
        AbstractC14567m.m65695b(string);
        fragmentActivity.finish();
        return Unit.f75682a;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public C25713i0 getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25713i0 c25713i0M101151c = C25713i0.m101151c(inflater);
        Intrinsics.m97801g(c25713i0M101151c, "inflate(...)");
        return c25713i0M101151c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        String string;
        Intrinsics.m97802h(view, "view");
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("arg_kids_id")) == null) {
            string = "";
        }
        this.kidsId = string;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m84774h0();
    }
}
