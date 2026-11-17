package com.transsion.home.fragment.bottom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC5781d;
import com.mbridge.msdk.MBridgeConstans;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.home.R$id;
import com.transsion.room.api.RoomHomeParentType;
import com.transsion.room.fragment.RoomHomeFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p552kl.C24701w;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0004R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m97100d2 = {"Lcom/transsion/home/fragment/bottom/BottomRoomFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lkl/w;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "a0", "(Landroid/view/LayoutInflater;)Lkl/w;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "b0", "Lcom/transsion/room/fragment/RoomHomeFragment;", "a", "Lcom/transsion/room/fragment/RoomHomeFragment;", "roomHomeFragment", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class BottomRoomFragment extends BaseFragment<C24701w> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private RoomHomeFragment roomHomeFragment;

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public C24701w getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24701w c24701wM97017c = C24701w.m97017c(inflater);
        Intrinsics.m97801g(c24701wM97017c, "inflate(...)");
        return c24701wM97017c;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m67556b0() {
        Unit unit;
        if (!isAdded() || isDetached() || isRemoving()) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            RoomHomeFragment roomHomeFragment = this.roomHomeFragment;
            if (roomHomeFragment != null) {
                roomHomeFragment.mo76973e(true);
                unit = Unit.f75682a;
            } else {
                unit = null;
            }
            Result.m112707constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        ConstraintLayout constraintLayout;
        View view2;
        ViewGroup.LayoutParams layoutParams;
        Intrinsics.m97802h(view, "view");
        C24701w mViewBinding = getMViewBinding();
        if (mViewBinding != null && (view2 = mViewBinding.f75588c) != null && (layoutParams = view2.getLayoutParams()) != null) {
            layoutParams.height = AbstractC5781d.m27351c();
        }
        C24701w mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (constraintLayout = mViewBinding2.f75589d) == null) {
            return;
        }
        AbstractC26006c.m102058k(constraintLayout);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        RoomHomeFragment roomHomeFragment = this.roomHomeFragment;
        if (roomHomeFragment != null) {
            getChildFragmentManager().m14557p().m14813s(R$id.fl_container, roomHomeFragment).mo14670i();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.roomHomeFragment = RoomHomeFragment.Companion.m76978b(RoomHomeFragment.INSTANCE, RoomHomeParentType.BOTTOM_TAB, null, null, 6, null);
    }
}
