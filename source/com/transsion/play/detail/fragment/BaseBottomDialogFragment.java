package com.transsion.play.detail.fragment;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.p1005savedstate.InterfaceC4393e;
import co.InterfaceC5146a;
import com.p282tn.lib.widget.R$anim;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.play.detail.fragment.BaseBottomDialogFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p429g4.InterfaceC23498a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0005J)\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u001b¨\u0006!"}, m97100d2 = {"Lcom/transsion/play/detail/fragment/BaseBottomDialogFragment;", "Lg4/a;", "T", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "", "transit", "", "enter", "nextAnim", "Landroid/view/animation/Animation;", "onCreateAnimation", "(IZI)Landroid/view/animation/Animation;", "Landroidx/fragment/app/Fragment;", "fragment", "id", "n0", "(Landroidx/fragment/app/Fragment;I)V", "force", "l0", "(Z)V", "a", "Z", "isRemoved", "()Z", "setRemoved", "PlayDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public abstract class BaseBottomDialogFragment<T extends InterfaceC23498a> extends PageStatusFragment<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isRemoved = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final boolean m71694k0(BaseBottomDialogFragment baseBottomDialogFragment) {
        if (baseBottomDialogFragment.isRemoved) {
            return false;
        }
        m71695m0(baseBottomDialogFragment, false, 1, null);
        return true;
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m71695m0(BaseBottomDialogFragment baseBottomDialogFragment, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeFragment");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        baseBottomDialogFragment.m71696l0(z11);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m71696l0(boolean force) {
        if (!this.isRemoved || force) {
            this.isRemoved = true;
            try {
                FragmentManager parentFragmentManager = getParentFragmentManager();
                parentFragmentManager.m14538g1();
                AbstractC3168w abstractC3168wM14557p = parentFragmentManager.m14557p();
                Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction(...)");
                abstractC3168wM14557p.mo14678r(this);
                abstractC3168wM14557p.mo14671j();
                Intrinsics.m97799e(parentFragmentManager);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m71697n0(Fragment fragment, int id2) {
        Intrinsics.m97802h(fragment, "fragment");
        if (this.isRemoved) {
            this.isRemoved = false;
            try {
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
                AbstractC3168w abstractC3168wM14557p = childFragmentManager.m14557p();
                Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
                abstractC3168wM14557p.m14814t(id2, this, getClass().getSimpleName());
                abstractC3168wM14557p.mo14671j();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getParentFragment() instanceof InterfaceC5146a) {
            InterfaceC4393e parentFragment = getParentFragment();
            Intrinsics.m97800f(parentFragment, "null cannot be cast to non-null type com.transsion.play.detail.view.IDialogFragmentView");
            ((InterfaceC5146a) parentFragment).mo24053S(new Function0() { // from class: zn.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(BaseBottomDialogFragment.m71694k0(this.f89106a));
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return enter ? AnimationUtils.loadAnimation(getActivity(), R$anim.libui_base_dialog_in_vertical) : AnimationUtils.loadAnimation(getActivity(), R$anim.libui_base_dialog_out_vertical);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (getParentFragment() instanceof InterfaceC5146a) {
            InterfaceC4393e parentFragment = getParentFragment();
            Intrinsics.m97800f(parentFragment, "null cannot be cast to non-null type com.transsion.play.detail.view.IDialogFragmentView");
            ((InterfaceC5146a) parentFragment).mo24053S(null);
        }
    }
}
