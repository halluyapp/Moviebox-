package com.transsion.postdetail.layer.local;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import com.avery.subtitle.widget.SimpleSubtitleView;
import com.blankj.utilcode.util.AbstractC5781d;
import com.p282tn.lib.view.SecondariesSeekBar;
import com.transsion.baselib.helper.C14453d;
import com.transsion.postdetail.layer.listener.LayerFlag;
import com.transsion.postdetail.p306ui.fragment.LocalVideoDetailFragment;
import com.transsion.postdetail.p306ui.view.ImmSpeedView;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24655b;
import p844vo.C28141b0;
import p844vo.C28165n0;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.postdetail.layer.local.g1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16804g1 extends AbstractC16785a0 {

    /* JADX INFO: renamed from: b0 */
    private final Fragment f56605b0;

    /* JADX INFO: renamed from: c0 */
    private C28141b0 f56606c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16804g1(Fragment fragment) {
        super(fragment);
        Intrinsics.m97802h(fragment, "fragment");
        this.f56605b0 = fragment;
    }

    /* JADX INFO: renamed from: p3 */
    private final void m73454p3() {
        m73084F(LayerFlag.LOCAL_UI_CHANGED, LocalUiType.MIDDLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q3 */
    public static final void m73455q3(C16804g1 c16804g1) {
        C26866a.a aVar = C26866a.f81698a;
        String strM73387m1 = c16804g1.m73387m1();
        Intrinsics.m97801g(strM73387m1, "<get-TAG>(...)");
        C26866a.a.m104898f(aVar, strM73387m1, "portrait onBackPressed", false, 4, null);
        c16804g1.m73454p3();
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: A0 */
    public View mo73197A0() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86378u;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: C0 */
    public boolean mo73199C0() {
        return false;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: D0 */
    public ViewGroup mo73201D0() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86379v;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: E0 */
    public ViewGroup mo73202E0() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: F0 */
    public View mo73203F0() {
        C28165n0 c28165n0;
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 == null || (c28165n0 = c28141b0.f86377t) == null) {
            return null;
        }
        return c28165n0.f86565d;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: G0 */
    public TextView mo73204G0() {
        C28165n0 c28165n0;
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 == null || (c28165n0 = c28141b0.f86377t) == null) {
            return null;
        }
        return c28165n0.f86564c;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: H0 */
    public TextView mo73205H0() {
        C28165n0 c28165n0;
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 == null || (c28165n0 = c28141b0.f86377t) == null) {
            return null;
        }
        return c28165n0.f86563b;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: I0 */
    public TextView mo73206I0() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86380w;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: N2 */
    public ViewGroup mo73207N2() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86359b;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: O0 */
    public ImageView mo73208O0() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86361d;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: O2 */
    public ImageView mo73209O2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: P1 */
    public View mo73210P1() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: P2 */
    public ProgressBar mo73211P2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: Q0 */
    public View mo73212Q0() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86374q;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: Q2 */
    public TextView mo73213Q2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: R2 */
    public TextView mo73214R2() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86368k;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: S2 */
    public SimpleSubtitleView mo73215S2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: T2 */
    public SimpleSubtitleView mo73216T2() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86375r;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: U2 */
    public ViewGroup mo73217U2() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86359b;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: V1 */
    public void mo73218V1() {
        m73454p3();
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: V2 */
    public SimpleSubtitleView mo73219V2() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86376s;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: W2 */
    public TextView mo73220W2() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86352A;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: X2 */
    public TextView mo73221X2() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86372o;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: Y1 */
    public void mo73367Y1() {
        m73084F(LayerFlag.LOCAL_UI_CHANGED, LocalUiType.MIDDLE);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: Y2 */
    public TextView mo73222Y2() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86373p;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: Z2 */
    public Group mo73223Z2() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86381x;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: a */
    public void mo73224a(LocalUiType uiType) {
        Intrinsics.m97802h(uiType, "uiType");
        LocalUiType localUiType = LocalUiType.PORTRAIT;
        if (uiType == localUiType) {
            m73406z0();
        }
        m73363T1(uiType == localUiType);
        super.mo73224a(uiType);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: a3 */
    public LocalUiType mo73225a3() {
        return LocalUiType.PORTRAIT;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: f2 */
    public ImageView mo73228f2() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86382y;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: g2 */
    public ViewGroup mo73229g2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: h2 */
    public TextView mo73231h2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: h3 */
    public TextView mo73232h3() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86353B;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: i2 */
    public View mo73233i2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: j1 */
    public View mo73235j1() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86371n;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: j3 */
    public FrameLayout mo73236j3() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86355D;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: k2 */
    public View mo73238k2() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86370m;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: k3 */
    public TextView mo73239k3() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86354C;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: m3 */
    public ViewStub mo73240m3() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86356E;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: n */
    public void mo73241n(LocalUiType newConfig) {
        Intrinsics.m97802h(newConfig, "newConfig");
        super.mo73241n(newConfig);
        if (newConfig == LocalUiType.LAND) {
            mo73367Y1();
        }
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: n2 */
    public ConstraintLayout mo73242n2() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86366i;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: n3 */
    public ViewStub mo73243n3() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86357F;
        }
        return null;
    }

    @Override // p951yo.InterfaceC28991d
    public void onBackPressed() {
        ConstraintLayout constraintLayout;
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 == null || (constraintLayout = c28141b0.f86366i) == null) {
            return;
        }
        constraintLayout.postDelayed(new Runnable() { // from class: com.transsion.postdetail.layer.local.f1
            @Override // java.lang.Runnable
            public final void run() {
                C16804g1.m73455q3(this.f56603a);
            }
        }, 30L);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: p */
    public void mo73391p(float f11) {
        ImmSpeedView immSpeedView;
        super.mo73391p(f11);
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 == null || (immSpeedView = c28141b0.f86369l) == null) {
            return;
        }
        ImmSpeedView.updateSpeed$default(immSpeedView, f11, false, 2, null);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: p2 */
    public View mo73244p2() {
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: q */
    public void mo73393q(String resourceId, String subjectId, String postId, boolean z11, boolean z12) {
        String strM96843f;
        ImmSpeedView immSpeedView;
        Intrinsics.m97802h(resourceId, "resourceId");
        Intrinsics.m97802h(subjectId, "subjectId");
        Intrinsics.m97802h(postId, "postId");
        super.mo73393q(resourceId, subjectId, postId, z11, z12);
        Fragment fragment = this.f56605b0;
        Intrinsics.m97800f(fragment, "null cannot be cast to non-null type com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment");
        C24655b logViewConfig = ((LocalVideoDetailFragment) fragment).getLogViewConfig();
        if (logViewConfig == null || (strM96843f = logViewConfig.m96843f()) == null) {
            strM96843f = "";
        }
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 == null || (immSpeedView = c28141b0.f86369l) == null) {
            return;
        }
        immSpeedView.setPageParams(strM96843f, subjectId);
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: q1 */
    public View mo73245q1() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86363f;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: q2 */
    public SecondariesSeekBar mo73246q2() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86383z;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0
    /* JADX INFO: renamed from: r1 */
    public View mo73247r1() {
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 != null) {
            return c28141b0.f86362e;
        }
        return null;
    }

    @Override // com.transsion.postdetail.layer.local.AbstractC16785a0, p951yo.InterfaceC28991d
    /* JADX INFO: renamed from: s */
    public void mo73248s(View rootView, LocalUiType uiType) {
        String strM96843f;
        ImmSpeedView immSpeedView;
        ConstraintLayout root;
        Intrinsics.m97802h(rootView, "rootView");
        Intrinsics.m97802h(uiType, "uiType");
        if (uiType != LocalUiType.PORTRAIT) {
            return;
        }
        C28141b0 c28141b0M109288a = C28141b0.m109288a(rootView);
        this.f56606c0 = c28141b0M109288a;
        ViewGroup.LayoutParams layoutParams = (c28141b0M109288a == null || (root = c28141b0M109288a.getRoot()) == null) ? null : root.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = AbstractC5781d.m27351c();
        super.mo73248s(rootView, uiType);
        Fragment fragment = this.f56605b0;
        Intrinsics.m97800f(fragment, "null cannot be cast to non-null type com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment");
        C24655b logViewConfig = ((LocalVideoDetailFragment) fragment).getLogViewConfig();
        if (logViewConfig == null || (strM96843f = logViewConfig.m96843f()) == null) {
            strM96843f = "";
        }
        C28141b0 c28141b0 = this.f56606c0;
        if (c28141b0 == null || (immSpeedView = c28141b0.f86369l) == null) {
            return;
        }
        immSpeedView.setPageParams(strM96843f, m73383k1());
        immSpeedView.updateSpeed(C14453d.f50863a.m65162d(), true);
        immSpeedView.setPortrait(true);
    }
}
