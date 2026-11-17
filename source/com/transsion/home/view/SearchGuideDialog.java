package com.transsion.home.view;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.AbstractC5806y;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.RoundedArrowImageView;
import com.transsion.baseui.dialog.BaseDialog;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24655b;
import p552kl.C24679h;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J-\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, m97100d2 = {"Lcom/transsion/home/view/SearchGuideDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "", "d0", "()Ljava/lang/String;", "Lkl/h;", "c", "Lkl/h;", "mViewBinding", "Lkotlin/Function0;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkotlin/jvm/functions/Function0;", "mCallback", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "e", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "searchLayoutParam", "f", "a", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class SearchGuideDialog extends BaseDialog {

    /* JADX INFO: renamed from: g */
    public static final int f53544g = 8;

    /* JADX INFO: renamed from: h */
    private static boolean f53545h;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C24679h mViewBinding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function0 mCallback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ConstraintLayout.C2308b searchLayoutParam;

    /* JADX INFO: renamed from: com.transsion.home.view.SearchGuideDialog$b */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC15518b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC15518b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            RoundedArrowImageView roundedArrowImageView;
            ConstraintLayout constraintLayout;
            AppCompatImageView appCompatImageView;
            AppCompatImageView appCompatImageView2;
            ViewTreeObserver viewTreeObserver;
            C24679h c24679h = SearchGuideDialog.this.mViewBinding;
            if (c24679h != null && (appCompatImageView2 = c24679h.f75438c) != null && (viewTreeObserver = appCompatImageView2.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            C24679h c24679h2 = SearchGuideDialog.this.mViewBinding;
            ViewGroup.LayoutParams layoutParams = (c24679h2 == null || (appCompatImageView = c24679h2.f75438c) == null) ? null : appCompatImageView.getLayoutParams();
            Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
            C24679h c24679h3 = SearchGuideDialog.this.mViewBinding;
            ViewGroup.LayoutParams layoutParams2 = (c24679h3 == null || (constraintLayout = c24679h3.f75440e) == null) ? null : constraintLayout.getLayoutParams();
            Intrinsics.m97800f(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            int marginEnd = (((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C2308b) layoutParams2)).width - c2308b.getMarginEnd()) - AbstractC5776a0.m27313a(40.0f);
            C24679h c24679h4 = SearchGuideDialog.this.mViewBinding;
            if (c24679h4 == null || (roundedArrowImageView = c24679h4.f75439d) == null) {
                return;
            }
            int iM27313a = AbstractC5776a0.m27313a(20.0f) + marginEnd;
            C26866a.a.m104899g(C26866a.f81698a, "the bubbleArrowPosition is " + iM27313a + ", the marginStart is " + marginEnd, false, 2, null);
            roundedArrowImageView.setArrowPosition((float) iM27313a);
        }
    }

    private final void initView() {
        ConstraintLayout constraintLayout;
        AppCompatImageView appCompatImageView;
        ViewTreeObserver viewTreeObserver;
        ConstraintLayout constraintLayout2;
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.gravity = 17;
            }
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            if (attributes2 != null) {
                attributes2.width = AbstractC5806y.m27489e();
            }
            WindowManager.LayoutParams attributes3 = window.getAttributes();
            if (attributes3 != null) {
                attributes3.height = AbstractC5806y.m27487c();
            }
            window.setDimAmount(0.5f);
        }
        C24679h c24679h = this.mViewBinding;
        if (c24679h != null && (constraintLayout2 = c24679h.f75440e) != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
            Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
            ConstraintLayout.C2308b c2308b2 = this.searchLayoutParam;
            if (c2308b2 != null) {
                Intrinsics.m97799e(c2308b2);
                ((ViewGroup.MarginLayoutParams) c2308b).topMargin = ((ViewGroup.MarginLayoutParams) c2308b2).topMargin - AbstractC5781d.m27351c();
                ConstraintLayout.C2308b c2308b3 = this.searchLayoutParam;
                Intrinsics.m97799e(c2308b3);
                ((ViewGroup.MarginLayoutParams) c2308b).width = ((ViewGroup.MarginLayoutParams) c2308b3).width;
                ConstraintLayout.C2308b c2308b4 = this.searchLayoutParam;
                Intrinsics.m97799e(c2308b4);
                ((ViewGroup.MarginLayoutParams) c2308b).height = ((ViewGroup.MarginLayoutParams) c2308b4).height;
                ConstraintLayout.C2308b c2308b5 = this.searchLayoutParam;
                Intrinsics.m97799e(c2308b5);
                c2308b.setMarginStart(c2308b5.getMarginStart());
                C26866a.a aVar = C26866a.f81698a;
                ConstraintLayout.C2308b c2308b6 = this.searchLayoutParam;
                Intrinsics.m97799e(c2308b6);
                C26866a.a.m104899g(aVar, "the searchLayoutParam.marginStart is " + c2308b6.getMarginStart(), false, 2, null);
            }
            constraintLayout2.setLayoutParams(c2308b);
        }
        C24679h c24679h2 = this.mViewBinding;
        if (c24679h2 != null && (appCompatImageView = c24679h2.f75438c) != null && (viewTreeObserver = appCompatImageView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC15518b());
        }
        C24679h c24679h3 = this.mViewBinding;
        if (c24679h3 == null || (constraintLayout = c24679h3.f75440e) == null) {
            return;
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.view.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchGuideDialog.m68775p0(this.f53564a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final void m68775p0(SearchGuideDialog searchGuideDialog, View view) {
        C26866a.a.m104899g(C26866a.f81698a, "the search button is clicked", false, 2, null);
        Function0 function0 = searchGuideDialog.mCallback;
        if (function0 != null) {
        }
        searchGuideDialog.dismiss();
    }

    @Override // com.transsion.baseui.dialog.BaseDialog
    /* JADX INFO: renamed from: d0 */
    public String mo65434d0() {
        return "POSITION_SEARCH";
    }

    @Override // com.transsion.baseui.dialog.BaseDialog
    public C24655b newLogViewConfig() {
        return new C24655b("OneClickToDownloadDialog", false, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.m97802h(inflater, "inflater");
        C24679h c24679hM96939c = C24679h.m96939c(inflater);
        this.mViewBinding = c24679hM96939c;
        f53545h = true;
        if (c24679hM96939c != null) {
            return c24679hM96939c.getRoot();
        }
        return null;
    }

    @Override // com.transsion.baseui.dialog.BaseDialog, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        C26866a.a.m104899g(C26866a.f81698a, getClassTag() + " --> onCreate()", false, 2, null);
        if (savedInstanceState != null) {
            dismissAllowingStateLoss();
        }
    }
}
