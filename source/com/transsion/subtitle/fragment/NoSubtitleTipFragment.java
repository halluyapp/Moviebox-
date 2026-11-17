package com.transsion.subtitle.fragment;

import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.os.AbstractC2411d;
import androidx.p1004lifecycle.C3187b0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.Utils;
import com.mbridge.msdk.MBridgeConstans;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.widget.EditTextWithClear;
import com.transsion.subtitle.R$string;
import com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p559ku.C25434d;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0004J!\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015¨\u0006\u001f"}, m97100d2 = {"Lcom/transsion/subtitle/fragment/NoSubtitleTipFragment;", "Lcom/transsion/subtitle/fragment/SubtitleBaseFragment;", "Lku/d;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "h0", "(Landroid/view/LayoutInflater;)Lku/d;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "initView", "onDestroy", "", "g", "Z", "isSelect", "", "h", "Ljava/lang/String;", "searchName", "i", "isVideoStartCheck", "j", "a", "VideoSubtitle_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class NoSubtitleTipFragment extends SubtitleBaseFragment<C25434d> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean isSelect;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String searchName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isVideoStartCheck = true;

    /* JADX INFO: renamed from: com.transsion.subtitle.fragment.NoSubtitleTipFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final NoSubtitleTipFragment m82012a(boolean z11, String name, String str) {
            Intrinsics.m97802h(name, "name");
            NoSubtitleTipFragment noSubtitleTipFragment = new NoSubtitleTipFragment();
            noSubtitleTipFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("EXTRA_NAME", name), TuplesKt.m97108a("KEY_VIDEO_START_CHECK", Boolean.valueOf(z11)), TuplesKt.m97108a("KEY_PAGE_NAME", str)));
            return noSubtitleTipFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.fragment.NoSubtitleTipFragment$b */
    public static final class C19668b implements TextView.OnEditorActionListener {
        C19668b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
            C3187b0 c3187b0M82249h;
            C3187b0 c3187b0M82255n;
            EditTextWithClear editTextWithClear;
            Editable text;
            if (i11 != 0 && i11 != 3) {
                return false;
            }
            String string = null;
            CharSequence text2 = textView != null ? textView.getText() : null;
            if (text2 == null || text2.length() == 0) {
                C28951b.f88586a.m111455e(Utils.m27275a().getString(R$string.subtitle_search_empty_tips));
                return true;
            }
            if (textView != null) {
                KeyboardUtils.m27131e(textView);
            }
            SubtitleDownloadViewModel viewModel = NoSubtitleTipFragment.this.getViewModel();
            if (viewModel != null && (c3187b0M82255n = viewModel.m82255n()) != null) {
                C25434d c25434d = (C25434d) NoSubtitleTipFragment.this.getMViewBinding();
                if (c25434d != null && (editTextWithClear = c25434d.f77032b) != null && (text = editTextWithClear.getText()) != null) {
                    string = text.toString();
                }
                c3187b0M82255n.mo14858q(string);
            }
            SubtitleDownloadViewModel viewModel2 = NoSubtitleTipFragment.this.getViewModel();
            if (viewModel2 != null && (c3187b0M82249h = viewModel2.m82249h()) != null) {
                c3187b0M82249h.mo14858q("DOWNLOAD_SUBTITLE");
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public static final void m82009i0(NoSubtitleTipFragment noSubtitleTipFragment, View view) {
        ImageView imageView;
        C25434d c25434d = (C25434d) noSubtitleTipFragment.getMViewBinding();
        if (c25434d != null && (imageView = c25434d.f77034d) != null) {
            imageView.setSelected(!noSubtitleTipFragment.isSelect);
        }
        noSubtitleTipFragment.isSelect = !noSubtitleTipFragment.isSelect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public static final void m82010j0(NoSubtitleTipFragment noSubtitleTipFragment, View view) {
        C3187b0 c3187b0M82249h;
        C3187b0 c3187b0M82255n;
        EditTextWithClear editTextWithClear;
        Editable text;
        EditTextWithClear editTextWithClear2;
        C25434d c25434d = (C25434d) noSubtitleTipFragment.getMViewBinding();
        String string = null;
        Editable text2 = (c25434d == null || (editTextWithClear2 = c25434d.f77032b) == null) ? null : editTextWithClear2.getText();
        if (text2 == null || text2.length() == 0) {
            C28951b.f88586a.m111455e(Utils.m27275a().getString(R$string.subtitle_search_empty_tips));
            return;
        }
        if (view != null) {
            KeyboardUtils.m27131e(view);
        }
        SubtitleDownloadViewModel viewModel = noSubtitleTipFragment.getViewModel();
        if (viewModel != null && (c3187b0M82255n = viewModel.m82255n()) != null) {
            C25434d c25434d2 = (C25434d) noSubtitleTipFragment.getMViewBinding();
            if (c25434d2 != null && (editTextWithClear = c25434d2.f77032b) != null && (text = editTextWithClear.getText()) != null) {
                string = text.toString();
            }
            c3187b0M82255n.mo14858q(string);
        }
        SubtitleDownloadViewModel viewModel2 = noSubtitleTipFragment.getViewModel();
        if (viewModel2 == null || (c3187b0M82249h = viewModel2.m82249h()) == null) {
            return;
        }
        c3187b0M82249h.mo14858q("DOWNLOAD_SUBTITLE");
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public C25434d getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25434d c25434dM100003c = C25434d.m100003c(inflater);
        Intrinsics.m97801g(c25434dM100003c, "inflate(...)");
        return c25434dM100003c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        EditTextWithClear editTextWithClear;
        TextView textView;
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        EditTextWithClear editTextWithClear2;
        Intrinsics.m97802h(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.searchName = arguments.getString("EXTRA_NAME", "");
            this.isVideoStartCheck = arguments.getBoolean("KEY_VIDEO_START_CHECK", true);
        }
        C25434d c25434d = (C25434d) getMViewBinding();
        if (c25434d != null && (editTextWithClear2 = c25434d.f77032b) != null) {
            editTextWithClear2.setText(this.searchName);
        }
        C25434d c25434d2 = (C25434d) getMViewBinding();
        if (c25434d2 != null && (linearLayoutCompat2 = c25434d2.f77035e) != null) {
            linearLayoutCompat2.setVisibility(this.isVideoStartCheck ? 0 : 8);
        }
        C25434d c25434d3 = (C25434d) getMViewBinding();
        if (c25434d3 != null && (linearLayoutCompat = c25434d3.f77035e) != null) {
            linearLayoutCompat.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.subtitle.fragment.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NoSubtitleTipFragment.m82009i0(this.f62901a, view2);
                }
            });
        }
        C25434d c25434d4 = (C25434d) getMViewBinding();
        if (c25434d4 != null && (textView = c25434d4.f77036f) != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.subtitle.fragment.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NoSubtitleTipFragment.m82010j0(this.f62903a, view2);
                }
            });
        }
        C25434d c25434d5 = (C25434d) getMViewBinding();
        if (c25434d5 == null || (editTextWithClear = c25434d5.f77032b) == null) {
            return;
        }
        editTextWithClear.setOnEditorActionListener(new C19668b());
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.isSelect && this.isVideoStartCheck) {
            C14496b.f50966a.m65344b().putBoolean("no_subtitle_tip_again", false);
        }
    }

    @Override // com.transsion.subtitle.fragment.SubtitleBaseFragment, com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m82017e0("dialog_no_subtitle");
    }
}
