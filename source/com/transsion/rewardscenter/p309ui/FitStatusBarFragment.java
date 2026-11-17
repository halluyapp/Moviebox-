package com.transsion.rewardscenter.p309ui;

import android.graphics.Color;
import android.view.View;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.FragmentActivity;
import com.gyf.immersionbar.ImmersionBar;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.core.utils.C14752e;
import com.transsion.rewardscenter.R$color;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import ng.AbstractC26006c;
import p429g4.InterfaceC23498a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H$¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0011H$¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0005¨\u0006\u0019"}, m97100d2 = {"Lcom/transsion/rewardscenter/ui/FitStatusBarFragment;", "Lg4/a;", "VB", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "<init>", "()V", "", "p0", "", "alpha", "r0", "(F)V", "", TtmlNode.ATTR_TTS_COLOR, "fraction", "k0", "(IF)I", "Landroid/view/View;", "n0", "()Landroid/view/View;", "o0", "m0", "()I", "l0", "initViewData", "RewardsCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public abstract class FitStatusBarFragment<VB extends InterfaceC23498a> extends PageStatusFragment<VB> {

    /* JADX INFO: renamed from: a */
    public static final int f58911a = PageStatusFragment.$stable;

    /* JADX INFO: renamed from: k0 */
    private final int m76507k0(int color, float fraction) {
        return Color.argb((int) (Color.alpha(color) * fraction), Color.red(color), Color.green(color), Color.blue(color));
    }

    /* JADX INFO: renamed from: p0 */
    private final void m76508p0() {
        View viewMo76504o0 = mo76504o0();
        if (viewMo76504o0 != null) {
            viewMo76504o0.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.transsion.rewardscenter.ui.m
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i11, int i12, int i13, int i14) {
                    FitStatusBarFragment.m76509q0(this.f58958a, view, i11, i12, i13, i14);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m76509q0(FitStatusBarFragment fitStatusBarFragment, View view, int i11, int i12, int i13, int i14) {
        View viewMo76503n0 = fitStatusBarFragment.mo76503n0();
        if (viewMo76503n0 == null) {
            return;
        }
        int measuredHeight = viewMo76503n0.getMeasuredHeight();
        if (measuredHeight < 1) {
            measuredHeight = C14752e.m66404a(48.0f);
        }
        fitStatusBarFragment.m76510r0(Math.abs(i12 * 1.0f) / measuredHeight);
    }

    /* JADX INFO: renamed from: r0 */
    private final void m76510r0(float alpha) {
        View viewMo76503n0;
        if (isAdded() && (viewMo76503n0 = mo76503n0()) != null) {
            viewMo76503n0.setBackgroundColor(m76507k0(AbstractC2397b.getColor(requireContext(), m76512m0()), RangesKt.m97937g(alpha, 1.0f)));
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        m76511l0();
        m76508p0();
    }

    /* JADX INFO: renamed from: l0 */
    protected final void m76511l0() {
        View viewMo76503n0 = mo76503n0();
        if (viewMo76503n0 != null) {
            AbstractC26006c.m102052e(viewMo76503n0);
        }
        FragmentActivity activity = getActivity();
        BaseNewActivity baseNewActivity = activity instanceof BaseNewActivity ? (BaseNewActivity) activity : null;
        if (baseNewActivity != null) {
            baseNewActivity.m65397t0();
        }
        ImmersionBar.with(this).statusBarDarkFont(false).init();
    }

    /* JADX INFO: renamed from: m0 */
    protected int m76512m0() {
        return R$color.rewards_center_title;
    }

    /* JADX INFO: renamed from: n0 */
    protected abstract View mo76503n0();

    /* JADX INFO: renamed from: o0 */
    protected abstract View mo76504o0();
}
