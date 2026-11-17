package com.transsion.subtitle.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.p1004lifecycle.C3187b0;
import com.mbridge.msdk.MBridgeConstans;
import com.transsion.subtitle.C19655a;
import com.transsion.subtitle.helper.ViewOnTouchListenerC19723h;
import com.transsion.subtitle.view.SubtitleSyncAdjustView;
import com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mu.InterfaceC25910b;
import p528ju.C24469a;
import p559ku.C25438h;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001d\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u0017\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, m97100d2 = {"Lcom/transsion/subtitle/fragment/SubtitleSyncAdjustFragment;", "Lcom/transsion/subtitle/fragment/SubtitleBaseFragment;", "Lku/h;", "<init>", "()V", "", "l0", "", "Lju/a;", "list", "n0", "(Ljava/util/List;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "j0", "(Landroid/view/LayoutInflater;)Lku/h;", "initView", "", "hidden", "onHiddenChanged", "(Z)V", "lazyLoadData", "Lmu/b;", "mCallback", "m0", "(Lmu/b;)V", "Lcom/transsion/subtitle/helper/h;", "g", "Lcom/transsion/subtitle/helper/h;", "stHelper", "h", "ndHelper", "i", "Lmu/b;", "VideoSubtitle_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SubtitleSyncAdjustFragment extends SubtitleBaseFragment<C25438h> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private ViewOnTouchListenerC19723h stHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private ViewOnTouchListenerC19723h ndHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private InterfaceC25910b mCallback;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final void m82135k0(SubtitleSyncAdjustFragment subtitleSyncAdjustFragment, View view) {
        C3187b0 c3187b0M82249h;
        SubtitleDownloadViewModel viewModel = subtitleSyncAdjustFragment.getViewModel();
        if (viewModel == null || (c3187b0M82249h = viewModel.m82249h()) == null) {
            return;
        }
        c3187b0M82249h.mo14858q("SELECT_SUBTITLE");
    }

    /* JADX INFO: renamed from: l0 */
    private final void m82136l0() {
        List<C24469a> listL;
        ArrayList arrayList = new ArrayList();
        InterfaceC25910b interfaceC25910b = this.mCallback;
        if (interfaceC25910b == null || (listL = interfaceC25910b.mo81908j()) == null) {
            listL = CollectionsKt.m97506l();
        }
        for (C24469a c24469a : listL) {
            if (c24469a.m96015f()) {
                arrayList.add(c24469a);
            }
        }
        m82137n0(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    private final void m82137n0(List list) {
        C25438h c25438h;
        SubtitleSyncAdjustView subtitleSyncAdjustView;
        C25438h c25438h2;
        SubtitleSyncAdjustView subtitleSyncAdjustView2;
        Space space;
        Space space2;
        SubtitleSyncAdjustView subtitleSyncAdjustView3;
        SubtitleSyncAdjustView subtitleSyncAdjustView4;
        SubtitleSyncAdjustView subtitleSyncAdjustView5;
        C19655a.f62783a.m81952a(SubtitleSyncAdjustFragment.class.getSimpleName() + " --> showSyncAdjustLayout() --> list.size = " + list.size());
        C25438h c25438h3 = (C25438h) getMViewBinding();
        if (c25438h3 != null && (subtitleSyncAdjustView5 = c25438h3.f77069f) != null) {
            subtitleSyncAdjustView5.setVisibility(8);
        }
        C25438h c25438h4 = (C25438h) getMViewBinding();
        if (c25438h4 != null && (subtitleSyncAdjustView4 = c25438h4.f77068e) != null) {
            subtitleSyncAdjustView4.setVisibility(8);
        }
        if (list.size() == 1) {
            C24469a c24469a = (C24469a) list.get(0);
            C25438h c25438h5 = (C25438h) getMViewBinding();
            if (c25438h5 != null && (subtitleSyncAdjustView3 = c25438h5.f77069f) != null) {
                subtitleSyncAdjustView3.setVisibility(0);
                subtitleSyncAdjustView3.setTitle("");
                ViewOnTouchListenerC19723h viewOnTouchListenerC19723h = this.stHelper;
                if (viewOnTouchListenerC19723h != null) {
                    viewOnTouchListenerC19723h.m82201r(c24469a);
                }
                ViewOnTouchListenerC19723h viewOnTouchListenerC19723h2 = this.stHelper;
                if (viewOnTouchListenerC19723h2 != null) {
                    viewOnTouchListenerC19723h2.m82200q(new Function2() { // from class: com.transsion.subtitle.fragment.b0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SubtitleSyncAdjustFragment.m82140q0(this.f62902a, (C24469a) obj, ((Long) obj2).longValue());
                        }
                    });
                }
            }
            C25438h c25438h6 = (C25438h) getMViewBinding();
            if (c25438h6 == null || (space2 = c25438h6.f77066c) == null) {
                return;
            }
            space2.setVisibility(8);
            return;
        }
        C25438h c25438h7 = (C25438h) getMViewBinding();
        if (c25438h7 != null && (space = c25438h7.f77066c) != null) {
            space.setVisibility(0);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C24469a c24469a2 = (C24469a) it.next();
            if (TextUtils.equals(c24469a2.m96010a(), "1st") && (c25438h2 = (C25438h) getMViewBinding()) != null && (subtitleSyncAdjustView2 = c25438h2.f77069f) != null) {
                subtitleSyncAdjustView2.setVisibility(0);
                subtitleSyncAdjustView2.setTitle("1st " + c24469a2.m96011b().getName());
                ViewOnTouchListenerC19723h viewOnTouchListenerC19723h3 = this.stHelper;
                if (viewOnTouchListenerC19723h3 != null) {
                    viewOnTouchListenerC19723h3.m82201r(c24469a2);
                }
                ViewOnTouchListenerC19723h viewOnTouchListenerC19723h4 = this.stHelper;
                if (viewOnTouchListenerC19723h4 != null) {
                    viewOnTouchListenerC19723h4.m82200q(new Function2() { // from class: com.transsion.subtitle.fragment.c0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SubtitleSyncAdjustFragment.m82138o0(this.f62904a, (C24469a) obj, ((Long) obj2).longValue());
                        }
                    });
                }
            }
            if (TextUtils.equals(c24469a2.m96010a(), "2nd") && (c25438h = (C25438h) getMViewBinding()) != null && (subtitleSyncAdjustView = c25438h.f77068e) != null) {
                subtitleSyncAdjustView.setVisibility(0);
                subtitleSyncAdjustView.setTitle("2nd " + c24469a2.m96011b().getName());
                ViewOnTouchListenerC19723h viewOnTouchListenerC19723h5 = this.ndHelper;
                if (viewOnTouchListenerC19723h5 != null) {
                    viewOnTouchListenerC19723h5.m82201r(c24469a2);
                }
                ViewOnTouchListenerC19723h viewOnTouchListenerC19723h6 = this.ndHelper;
                if (viewOnTouchListenerC19723h6 != null) {
                    viewOnTouchListenerC19723h6.m82200q(new Function2() { // from class: com.transsion.subtitle.fragment.d0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SubtitleSyncAdjustFragment.m82139p0(this.f62906a, (C24469a) obj, ((Long) obj2).longValue());
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final Unit m82138o0(SubtitleSyncAdjustFragment subtitleSyncAdjustFragment, C24469a c24469a, long j11) {
        InterfaceC25910b interfaceC25910b = subtitleSyncAdjustFragment.mCallback;
        if (interfaceC25910b != null) {
            interfaceC25910b.mo81910l(c24469a, j11);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final Unit m82139p0(SubtitleSyncAdjustFragment subtitleSyncAdjustFragment, C24469a c24469a, long j11) {
        InterfaceC25910b interfaceC25910b = subtitleSyncAdjustFragment.mCallback;
        if (interfaceC25910b != null) {
            interfaceC25910b.mo81910l(c24469a, j11);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final Unit m82140q0(SubtitleSyncAdjustFragment subtitleSyncAdjustFragment, C24469a c24469a, long j11) {
        InterfaceC25910b interfaceC25910b = subtitleSyncAdjustFragment.mCallback;
        if (interfaceC25910b != null) {
            interfaceC25910b.mo81910l(c24469a, j11);
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        AppCompatImageView appCompatImageView;
        Intrinsics.m97802h(view, "view");
        C25438h c25438h = (C25438h) getMViewBinding();
        if (c25438h != null && (appCompatImageView = c25438h.f77065b) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.subtitle.fragment.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SubtitleSyncAdjustFragment.m82135k0(this.f62900a, view2);
                }
            });
        }
        C25438h c25438h2 = (C25438h) getMViewBinding();
        ViewOnTouchListenerC19723h viewOnTouchListenerC19723h = new ViewOnTouchListenerC19723h(c25438h2 != null ? c25438h2.f77069f : null);
        viewOnTouchListenerC19723h.m82199o(null);
        this.stHelper = viewOnTouchListenerC19723h;
        C25438h c25438h3 = (C25438h) getMViewBinding();
        ViewOnTouchListenerC19723h viewOnTouchListenerC19723h2 = new ViewOnTouchListenerC19723h(c25438h3 != null ? c25438h3.f77068e : null);
        viewOnTouchListenerC19723h2.m82199o(null);
        this.ndHelper = viewOnTouchListenerC19723h2;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public C25438h getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25438h c25438hM100019c = C25438h.m100019c(inflater);
        Intrinsics.m97801g(c25438hM100019c, "inflate(...)");
        return c25438hM100019c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        m82136l0();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m82142m0(InterfaceC25910b mCallback) {
        this.mCallback = mCallback;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden) {
            return;
        }
        m82136l0();
    }

    @Override // com.transsion.subtitle.fragment.SubtitleBaseFragment, com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m82017e0("dialog_subtitle_sync_adjust");
    }
}
