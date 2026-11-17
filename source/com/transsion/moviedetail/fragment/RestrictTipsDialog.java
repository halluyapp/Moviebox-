package com.transsion.moviedetail.fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.os.AbstractC2411d;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.noober.background.view.BLTextView;
import com.p282tn.lib.view.MaxHeightNestedScrollView;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.R$style;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.moviedetail.R$layout;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gn.C23596d;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J!\u0010\u0018\u001a\u00020\u00062\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001fR$\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, m97100d2 = {"Lcom/transsion/moviedetail/fragment/RestrictTipsDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "r0", "(Landroid/view/View;)V", "x0", "", "optType", "w0", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "Lkotlin/Function1;", "", "call", "y0", "(Lkotlin/jvm/functions/Function1;)V", "Lgn/d;", "c", "Lgn/d;", "viewBinding", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/String;", "tips", "e", "pageFrom", "f", "subjectId", "g", "Lkotlin/jvm/functions/Function1;", "resultCallback", "h", "Z", "isSelectNotShowAgain", "i", "a", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class RestrictTipsDialog extends BaseDialog {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C23596d viewBinding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String tips;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String pageFrom;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String subjectId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Function1 resultCallback;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isSelectNotShowAgain;

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.RestrictTipsDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final RestrictTipsDialog m70471a(String tips, String pageFrom, String str) {
            Intrinsics.m97802h(tips, "tips");
            Intrinsics.m97802h(pageFrom, "pageFrom");
            RestrictTipsDialog restrictTipsDialog = new RestrictTipsDialog();
            restrictTipsDialog.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("tips", tips), TuplesKt.m97108a(WebConstants.PAGE_FROM, pageFrom), TuplesKt.m97108a("subject_id", str)));
            return restrictTipsDialog;
        }
    }

    public RestrictTipsDialog() {
        super(R$layout.dialog_restrict_tips);
    }

    /* JADX INFO: renamed from: r0 */
    private final void m70463r0(View view) {
        LinearLayoutCompat linearLayoutCompat;
        BLTextView bLTextView;
        BLTextView bLTextView2;
        AppCompatTextView appCompatTextView;
        MaxHeightNestedScrollView maxHeightNestedScrollView;
        C23596d c23596dM93359a = C23596d.m93359a(view);
        this.viewBinding = c23596dM93359a;
        if (c23596dM93359a != null && (maxHeightNestedScrollView = c23596dM93359a.f71920d) != null) {
            maxHeightNestedScrollView.setMaxHeight(AbstractC5776a0.m27313a(368.0f));
        }
        C23596d c23596d = this.viewBinding;
        if (c23596d != null && (appCompatTextView = c23596d.f71923g) != null) {
            appCompatTextView.setText(this.tips);
        }
        C23596d c23596d2 = this.viewBinding;
        if (c23596d2 != null && (bLTextView2 = c23596d2.f71922f) != null) {
            bLTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.e1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RestrictTipsDialog.m70464s0(this.f54701a, view2);
                }
            });
        }
        C23596d c23596d3 = this.viewBinding;
        if (c23596d3 != null && (bLTextView = c23596d3.f71921e) != null) {
            bLTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.f1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RestrictTipsDialog.m70465t0(this.f54704a, view2);
                }
            });
        }
        C23596d c23596d4 = this.viewBinding;
        if (c23596d4 == null || (linearLayoutCompat = c23596d4.f71919c) == null) {
            return;
        }
        linearLayoutCompat.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RestrictTipsDialog.m70466u0(this.f54707a, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m70464s0(RestrictTipsDialog restrictTipsDialog, View view) {
        restrictTipsDialog.m70468w0("confirm");
        Function1 function1 = restrictTipsDialog.resultCallback;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        restrictTipsDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m70465t0(RestrictTipsDialog restrictTipsDialog, View view) {
        restrictTipsDialog.m70468w0("btn_back");
        restrictTipsDialog.isSelectNotShowAgain = false;
        Function1 function1 = restrictTipsDialog.resultCallback;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        restrictTipsDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m70466u0(RestrictTipsDialog restrictTipsDialog, View view) {
        ImageView imageView;
        C23596d c23596d = restrictTipsDialog.viewBinding;
        if (c23596d != null && (imageView = c23596d.f71918b) != null) {
            imageView.setSelected(!restrictTipsDialog.isSelectNotShowAgain);
        }
        restrictTipsDialog.isSelectNotShowAgain = !restrictTipsDialog.isSelectNotShowAgain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final boolean m70467v0(RestrictTipsDialog restrictTipsDialog, DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
        if (i11 != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        restrictTipsDialog.m70468w0("action_back");
        restrictTipsDialog.isSelectNotShowAgain = false;
        Function1 function1 = restrictTipsDialog.resultCallback;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        restrictTipsDialog.dismissAllowingStateLoss();
        return true;
    }

    /* JADX INFO: renamed from: w0 */
    private final void m70468w0(String optType) {
        HashMap map = new HashMap();
        map.put("opt_type", optType);
        map.put("not_show_select", String.valueOf(this.isSelectNotShowAgain));
        String str = this.subjectId;
        if (str == null) {
            str = "";
        }
        map.put("subject_id", str);
        String str2 = this.pageFrom;
        map.put(WebConstants.PAGE_FROM, str2 != null ? str2 : "");
        C24662i.f75350a.m96881p("restrict_tips_dialog", map);
    }

    /* JADX INFO: renamed from: x0 */
    private final void m70469x0() {
        HashMap map = new HashMap();
        String str = this.pageFrom;
        if (str == null) {
            str = "";
        }
        map.put(WebConstants.PAGE_FROM, str);
        String str2 = this.subjectId;
        map.put("subject_id", str2 != null ? str2 : "");
        C24662i.f75350a.m96884s("restrict_tips_dialog", "dialog_show", map);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCancelable(false);
        setStyle(0, R$style.NormalDialogTheme);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.tips = arguments.getString("tips");
            this.pageFrom = arguments.getString(WebConstants.PAGE_FROM);
            this.subjectId = arguments.getString("subject_id");
        }
    }

    @Override // com.transsion.baseui.dialog.BaseDialog, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.isSelectNotShowAgain) {
            C14496b.f50966a.m65344b().putBoolean("restrict_tips_dialog_again", false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Window window;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        int iM27489e = AbstractC5806y.m27489e() - AbstractC5776a0.m27313a(80.0f);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(iM27489e, -2);
            window.setGravity(17);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.transsion.moviedetail.fragment.d1
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
                    return RestrictTipsDialog.m70467v0(this.f54698a, dialogInterface, i11, keyEvent);
                }
            });
        }
        m70469x0();
        m70463r0(view);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m70470y0(Function1 call) {
        Intrinsics.m97802h(call, "call");
        this.resultCallback = call;
    }
}
