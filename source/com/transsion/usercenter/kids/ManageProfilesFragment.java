package com.transsion.usercenter.kids;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.InterfaceC3165t;
import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.noober.background.view.BLLinearLayout;
import com.noober.background.view.BLView;
import com.p282tn.lib.widget.TnTextView;
import com.therouter.TheRouter;
import com.transsion.baselib.kids.KidsAccountManager;
import com.transsion.baselib.kids.KidsProfile;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.usercenter.R$drawable;
import com.transsion.usercenter.edit.ProfileEditCenterActivity;
import com.transsion.usercenter.kids.ManageProfilesFragment;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.File;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p441gz.InterfaceC23704a;
import p462hj.C23860f;
import p585lw.C25709g0;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0004¨\u0006\u0018"}, m97100d2 = {"Lcom/transsion/usercenter/kids/ManageProfilesFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Llw/g0;", "<init>", "()V", "", "h0", "", "dp", "k0", "(I)V", "Landroid/view/LayoutInflater;", "inflater", "e0", "(Landroid/view/LayoutInflater;)Llw/g0;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "onResume", "a", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ManageProfilesFragment extends BaseFragment<C25709g0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.transsion.usercenter.kids.ManageProfilesFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ManageProfilesFragment m84716a() {
            return new ManageProfilesFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final void m84709f0(ManageProfilesFragment manageProfilesFragment, String str, Bundle bundle) {
        Intrinsics.m97802h(str, "<unused var>");
        Intrinsics.m97802h(bundle, "<unused var>");
        manageProfilesFragment.m84711h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final void m84710g0(ManageProfilesFragment manageProfilesFragment, View view) {
        C26866a.a.m104898f(C26866a.f81698a, "ManageProfilesFragment", "adult account edit.", false, 4, null);
        ProfileEditCenterActivity.Companion companion = ProfileEditCenterActivity.INSTANCE;
        Context contextRequireContext = manageProfilesFragment.requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        companion.m84607a(contextRequireContext, null);
    }

    /* JADX INFO: renamed from: h0 */
    private final void m84711h0() {
        LinearLayout linearLayout;
        BLLinearLayout bLLinearLayout;
        BLView bLView;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        ShapeableImageView shapeableImageView;
        LinearLayout linearLayout4;
        TnTextView tnTextView;
        ShapeableImageView shapeableImageView2;
        BLView bLView2;
        LinearLayout linearLayout5;
        LinearLayout linearLayout6;
        ShapeableImageView shapeableImageView3;
        TnTextView tnTextView2;
        LinearLayout linearLayout7;
        InterfaceC23704a interfaceC23704a = (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
        boolean zMo90379a = interfaceC23704a != null ? interfaceC23704a.mo90379a() : false;
        UserInfo userInfoMo90386h = interfaceC23704a != null ? interfaceC23704a.mo90386h() : null;
        if (zMo90379a) {
            C25709g0 mViewBinding = getMViewBinding();
            if (mViewBinding != null && (linearLayout7 = mViewBinding.f78181i) != null) {
                linearLayout7.setVisibility(0);
            }
            C25709g0 mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (tnTextView2 = mViewBinding2.f78183k) != null) {
                String nickname = userInfoMo90386h != null ? userInfoMo90386h.getNickname() : null;
                if (nickname == null) {
                    nickname = "";
                }
                tnTextView2.setText(nickname);
            }
            C25709g0 mViewBinding3 = getMViewBinding();
            if (mViewBinding3 != null && (shapeableImageView3 = mViewBinding3.f78175c) != null) {
                C23860f.a aVar = C23860f.f72909a;
                Context contextRequireContext = requireContext();
                Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
                aVar.m94457m(contextRequireContext).m94468g(userInfoMo90386h != null ? userInfoMo90386h.getAvatar() : null).m94470i(R$drawable.ic_default_avatar).m94465d(shapeableImageView3);
            }
            m84714k0(72);
        } else {
            C25709g0 mViewBinding4 = getMViewBinding();
            if (mViewBinding4 != null && (linearLayout = mViewBinding4.f78181i) != null) {
                linearLayout.setVisibility(8);
            }
            m84714k0(0);
        }
        KidsProfile kidsProfileM65181f = KidsAccountManager.f50883a.m65181f();
        if (kidsProfileM65181f == null) {
            C25709g0 mViewBinding5 = getMViewBinding();
            if (mViewBinding5 != null && (linearLayout3 = mViewBinding5.f78182j) != null) {
                linearLayout3.setVisibility(8);
            }
            C25709g0 mViewBinding6 = getMViewBinding();
            if (mViewBinding6 != null && (linearLayout2 = mViewBinding6.f78180h) != null) {
                linearLayout2.setVisibility(0);
            }
            C25709g0 mViewBinding7 = getMViewBinding();
            if (mViewBinding7 != null && (bLView = mViewBinding7.f78186n) != null) {
                bLView.setVisibility(8);
            }
            C25709g0 mViewBinding8 = getMViewBinding();
            if (mViewBinding8 == null || (bLLinearLayout = mViewBinding8.f78174b) == null) {
                return;
            }
            bLLinearLayout.setOnClickListener(new View.OnClickListener() { // from class: rw.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ManageProfilesFragment.m84713j0(this.f83477a, view);
                }
            });
            return;
        }
        C25709g0 mViewBinding9 = getMViewBinding();
        if (mViewBinding9 != null && (linearLayout6 = mViewBinding9.f78182j) != null) {
            linearLayout6.setVisibility(0);
        }
        C25709g0 mViewBinding10 = getMViewBinding();
        if (mViewBinding10 != null && (linearLayout5 = mViewBinding10.f78180h) != null) {
            linearLayout5.setVisibility(8);
        }
        C25709g0 mViewBinding11 = getMViewBinding();
        if (mViewBinding11 != null && (bLView2 = mViewBinding11.f78186n) != null) {
            bLView2.setVisibility(0);
        }
        String avatarLocalPath = kidsProfileM65181f.getAvatarLocalPath();
        if (avatarLocalPath == null || avatarLocalPath.length() == 0) {
            C25709g0 mViewBinding12 = getMViewBinding();
            if (mViewBinding12 != null && (shapeableImageView = mViewBinding12.f78178f) != null) {
                shapeableImageView.setImageResource(kidsProfileM65181f.getAvatarResId());
            }
        } else {
            C25709g0 mViewBinding13 = getMViewBinding();
            if (mViewBinding13 != null && (shapeableImageView2 = mViewBinding13.f78178f) != null) {
                Glide.with(requireContext()).load2(new File(avatarLocalPath)).into(shapeableImageView2);
            }
        }
        C25709g0 mViewBinding14 = getMViewBinding();
        if (mViewBinding14 != null && (tnTextView = mViewBinding14.f78184l) != null) {
            tnTextView.setText(kidsProfileM65181f.getName());
        }
        C25709g0 mViewBinding15 = getMViewBinding();
        if (mViewBinding15 == null || (linearLayout4 = mViewBinding15.f78182j) == null) {
            return;
        }
        linearLayout4.setOnClickListener(new View.OnClickListener() { // from class: rw.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ManageProfilesFragment.m84712i0(this.f83476a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final void m84712i0(ManageProfilesFragment manageProfilesFragment, View view) {
        C26866a.a.m104898f(C26866a.f81698a, "ManageProfilesFragment", "kids account edit.", false, 4, null);
        KidsProfile kidsProfileM65181f = KidsAccountManager.f50883a.m65181f();
        if (kidsProfileM65181f != null) {
            ProfileEditCenterActivity.Companion companion = ProfileEditCenterActivity.INSTANCE;
            Context contextRequireContext = manageProfilesFragment.requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            companion.m84608b(contextRequireContext, kidsProfileM65181f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final void m84713j0(ManageProfilesFragment manageProfilesFragment, View view) {
        C26866a.a.m104898f(C26866a.f81698a, "ManageProfilesFragment", "adult account create.", false, 4, null);
        FragmentActivity fragmentActivityRequireActivity = manageProfilesFragment.requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        CreateKidsProfileDialog.Companion.m84693b(CreateKidsProfileDialog.INSTANCE, false, false, false, 6, null).m61941X(fragmentActivityRequireActivity, "CreateKidsProfileDialog");
    }

    /* JADX INFO: renamed from: k0 */
    private final void m84714k0(int dp2) {
        int i11 = (int) ((dp2 * getResources().getDisplayMetrics().density) + 0.5f);
        C25709g0 mViewBinding = getMViewBinding();
        LinearLayout linearLayout = mViewBinding != null ? mViewBinding.f78182j : null;
        C25709g0 mViewBinding2 = getMViewBinding();
        for (LinearLayout linearLayout2 : CollectionsKt.m97510p(linearLayout, mViewBinding2 != null ? mViewBinding2.f78180h : null)) {
            ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMarginStart(i11);
                linearLayout2.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public C25709g0 getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25709g0 c25709g0M101135c = C25709g0.m101135c(inflater);
        Intrinsics.m97801g(c25709g0M101135c, "inflate(...)");
        return c25709g0M101135c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        LinearLayout linearLayout;
        Intrinsics.m97802h(view, "view");
        getParentFragmentManager().m14497G1("result_kids_created", getViewLifecycleOwner(), new InterfaceC3165t() { // from class: rw.t
            @Override // androidx.fragment.app.InterfaceC3165t
            /* JADX INFO: renamed from: a */
            public final void mo14589a(String str, Bundle bundle) {
                ManageProfilesFragment.m84709f0(this.f83474a, str, bundle);
            }
        });
        C25709g0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (linearLayout = mViewBinding.f78181i) == null) {
            return;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: rw.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ManageProfilesFragment.m84710g0(this.f83475a, view2);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        m84711h0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m84711h0();
    }
}
