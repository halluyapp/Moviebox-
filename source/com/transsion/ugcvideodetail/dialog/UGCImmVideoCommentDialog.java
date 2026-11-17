package com.transsion.ugcvideodetail.dialog;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.AbstractC2411d;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.p1005savedstate.InterfaceC4393e;
import com.blankj.utilcode.util.AbstractC5806y;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.noober.background.view.BLTextView;
import com.therouter.TheRouter;
import com.transsion.baseui.R$style;
import com.transsion.baseui.dialog.BaseViewBindingDialog;
import com.transsion.postdetailapi.CommentTopicType;
import com.transsion.ugcvideodetail.R$id;
import com.transsion.ugcvideodetail.fragment.UGCImmVideoDetailFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import gp.InterfaceC23623a;
import gp.InterfaceC23624b;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p885wv.C28442b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R.\u0010(\u001a\u001c\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/dialog/UGCImmVideoCommentDialog;", "Lcom/transsion/baseui/dialog/BaseViewBindingDialog;", "Lwv/b;", "<init>", "()V", "", "v0", "()I", "", "t0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/String;", "ugcVideoId", "Landroidx/fragment/app/Fragment;", "e", "Landroidx/fragment/app/Fragment;", "commentFragment", "f", "commentId", "g", "I", "commentCount", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "n0", "()Lkotlin/jvm/functions/Function3;", "bindingInflater", "h", "a", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCImmVideoCommentDialog extends BaseViewBindingDialog<C28442b> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String ugcVideoId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Fragment commentFragment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String commentId = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int commentCount;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.dialog.UGCImmVideoCommentDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UGCImmVideoCommentDialog m83650a(String str, int i11) {
            UGCImmVideoCommentDialog uGCImmVideoCommentDialog = new UGCImmVideoCommentDialog();
            uGCImmVideoCommentDialog.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("video_id", str), TuplesKt.m97108a("comment_count", Integer.valueOf(i11))));
            return uGCImmVideoCommentDialog;
        }
    }

    /* JADX INFO: renamed from: t0 */
    private final void m83644t0() {
        Dialog dialog;
        final Window window;
        if (Build.VERSION.SDK_INT < 35 || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(window.getDecorView(), new OnApplyWindowInsetsListener() { // from class: com.transsion.ugcvideodetail.dialog.d
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return UGCImmVideoCommentDialog.m83645u0(this.f64078a, window, view, windowInsetsCompat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final WindowInsetsCompat m83645u0(UGCImmVideoCommentDialog uGCImmVideoCommentDialog, Window window, View view, WindowInsetsCompat insets) {
        C28442b c28442b;
        ConstraintLayout constraintLayout;
        Intrinsics.m97802h(insets, "insets");
        int iM92908b = insets.isVisible(WindowInsetsCompat.Type.navigationBars()) ? insets.getInsets(WindowInsetsCompat.Type.navigationBars()).f88818d : AbstractC23384a.m92908b(8);
        if (iM92908b > 0 && (c28442b = (C28442b) uGCImmVideoCommentDialog.getViewBinding()) != null && (constraintLayout = c28442b.f87266b) != null) {
            constraintLayout.setPadding(0, 0, 0, iM92908b);
        }
        ViewCompat.setOnApplyWindowInsetsListener(window.getDecorView(), null);
        return insets;
    }

    /* JADX INFO: renamed from: v0 */
    private final int m83646v0() {
        return (AbstractC5806y.m27487c() * 7) / 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m83647w0(UGCImmVideoCommentDialog uGCImmVideoCommentDialog, View view) {
        uGCImmVideoCommentDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m83648x0(UGCImmVideoCommentDialog uGCImmVideoCommentDialog, View view) {
        uGCImmVideoCommentDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m83649y0(UGCImmVideoCommentDialog uGCImmVideoCommentDialog, View view, View view2) {
        InterfaceC4393e interfaceC4393e = uGCImmVideoCommentDialog.commentFragment;
        InterfaceC23623a interfaceC23623a = interfaceC4393e instanceof InterfaceC23623a ? (InterfaceC23623a) interfaceC4393e : null;
        if (interfaceC23623a != null) {
            interfaceC23623a.mo74037t(view);
            interfaceC23623a.mo74036r();
        }
    }

    @Override // com.transsion.baseui.dialog.BaseViewBindingDialog
    /* JADX INFO: renamed from: n0 */
    public Function3 mo65514n0() {
        return UGCImmVideoCommentDialog$bindingInflater$1.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.BottomDialogTheme);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("video_id", "");
            this.ugcVideoId = string;
            this.commentId = string != null ? string : "";
            this.commentCount = arguments.getInt("comment_count", 0);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.m97801g(dialogOnCreateDialog, "onCreateDialog(...)");
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(com.transsnet.downloader.R$style.BottomShowAnimation);
            window.setGravity(80);
            window.setDimAmount(0.5f);
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes == null) {
                attributes = new WindowManager.LayoutParams();
            }
            attributes.width = -1;
            attributes.height = m83646v0();
            window.setBackgroundDrawable(null);
            window.setAttributes(attributes);
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle savedInstanceState) {
        BLTextView bLTextView;
        TextView textView;
        String str;
        View view2;
        ImageView imageView;
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m83644t0();
        C28442b c28442b = (C28442b) getViewBinding();
        if (c28442b != null && (frameLayout = c28442b.f87268d) != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
            layoutParams.height = m83646v0() - AbstractC23384a.m92908b(48);
        }
        C28442b c28442b2 = (C28442b) getViewBinding();
        if (c28442b2 != null && (imageView = c28442b2.f87269e) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.dialog.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    UGCImmVideoCommentDialog.m83647w0(this.f64074a, view3);
                }
            });
        }
        C28442b c28442b3 = (C28442b) getViewBinding();
        if (c28442b3 != null && (view2 = c28442b3.f87275k) != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.dialog.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    UGCImmVideoCommentDialog.m83648x0(this.f64075a, view3);
                }
            });
        }
        C28442b c28442b4 = (C28442b) getViewBinding();
        if (c28442b4 != null && (textView = c28442b4.f87272h) != null) {
            int i11 = this.commentCount;
            if (i11 > 0) {
                str = "(" + (i11 > 99 ? "99+" : Integer.valueOf(i11)) + ")";
            } else {
                str = "";
            }
            textView.setText(str);
        }
        Fragment parentFragment = getParentFragment();
        Fragment fragmentMo93473f = null;
        UGCImmVideoDetailFragment uGCImmVideoDetailFragment = parentFragment instanceof UGCImmVideoDetailFragment ? (UGCImmVideoDetailFragment) parentFragment : null;
        InterfaceC23624b interfaceC23624b = (InterfaceC23624b) TheRouter.m61774d(InterfaceC23624b.class, new Object[0]);
        if (interfaceC23624b != null) {
            fragmentMo93473f = interfaceC23624b.mo93473f(this.ugcVideoId, CommentTopicType.UGC_VIDEO.getValue(), 0L, true, true, "", null, uGCImmVideoDetailFragment != null ? uGCImmVideoDetailFragment.getTrackId() : null, uGCImmVideoDetailFragment != null ? uGCImmVideoDetailFragment.getPreviousTrackId() : null, uGCImmVideoDetailFragment != null ? uGCImmVideoDetailFragment.getPreviousPageVideoId() : null, this.ugcVideoId, "/ugc_video/immersive_detail", uGCImmVideoDetailFragment != null ? uGCImmVideoDetailFragment.getCollectionId() : null);
        }
        this.commentFragment = fragmentMo93473f;
        if (fragmentMo93473f != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
            AbstractC3168w abstractC3168wM14557p = childFragmentManager.m14557p();
            Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
            abstractC3168wM14557p.m14813s(R$id.fl_comment_container, fragmentMo93473f);
            abstractC3168wM14557p.mo14670i();
        }
        C28442b c28442b5 = (C28442b) getViewBinding();
        if (c28442b5 == null || (bLTextView = c28442b5.f87270f) == null) {
            return;
        }
        bLTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.dialog.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                UGCImmVideoCommentDialog.m83649y0(this.f64076a, view, view3);
            }
        });
    }
}
