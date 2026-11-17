package com.transsion.postdetail.p306ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.DialogC10016c;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baseui.R$style;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.baseui.util.C14555a;
import com.transsion.moviedetailapi.bean.CommentBean;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.Stat;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.R$layout;
import com.transsion.postdetail.helper.C16768a;
import com.transsion.postdetail.p306ui.fragment.CommentFragment;
import com.transsion.postdetailapi.CommentTopicType;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p550kj.C24655b;
import p844vo.C28148f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 I2\u00020\u0001:\u0001JB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\r2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016JI\u0010\u001f\u001a\u00020\u00072:\u0010\u001e\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00070\u0017¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\u0003J\u0017\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0016\u00107\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00103R$\u0010?\u001a\u0004\u0018\u0001088\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R0\u0010B\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006K"}, m97100d2 = {"Lcom/transsion/postdetail/ui/dialog/ImmVideoCommentDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "", "s0", "()I", "", "w0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "commentId", "", "likeStatu", "callback", "z0", "(Lkotlin/jvm/functions/Function2;)V", "B0", "Lcom/transsion/moviedetailapi/bean/CommentBean;", "commentBean", "y0", "(Lcom/transsion/moviedetailapi/bean/CommentBean;)V", "Lvo/f;", "c", "Lvo/f;", "viewBinding", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "data", "Lcom/transsion/postdetail/ui/fragment/CommentFragment;", "e", "Lcom/transsion/postdetail/ui/fragment/CommentFragment;", "commentFragment", "f", "Ljava/lang/String;", "g", "pageName", "h", "pageFrom", "Lcom/transsion/postdetail/ui/fragment/CommentFragment$b;", "i", "Lcom/transsion/postdetail/ui/fragment/CommentFragment$b;", "r0", "()Lcom/transsion/postdetail/ui/fragment/CommentFragment$b;", "A0", "(Lcom/transsion/postdetail/ui/fragment/CommentFragment$b;)V", "onCommentCountChangedListener", "j", "Lkotlin/jvm/functions/Function2;", "mCommentCallback", CampaignEx.JSON_KEY_AD_K, "Z", "isOpenEdittext", "l", "Lcom/transsion/moviedetailapi/bean/CommentBean;", "mCommentBean", "m", "a", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ImmVideoCommentDialog extends BaseDialog {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C28148f viewBinding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private PostSubjectItem data;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private CommentFragment commentFragment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String commentId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String pageFrom;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private CommentFragment.InterfaceC17008b onCommentCountChangedListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private Function2 mCommentCallback;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isOpenEdittext;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private CommentBean mCommentBean;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.dialog.ImmVideoCommentDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ ImmVideoCommentDialog m73940b(Companion companion, PostSubjectItem postSubjectItem, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = "";
            }
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            if ((i11 & 8) != 0) {
                str3 = null;
            }
            return companion.m73941a(postSubjectItem, str, str2, str3);
        }

        /* JADX INFO: renamed from: a */
        public final ImmVideoCommentDialog m73941a(PostSubjectItem postSubjectItem, String commentId, String str, String str2) {
            Intrinsics.m97802h(commentId, "commentId");
            ImmVideoCommentDialog immVideoCommentDialog = new ImmVideoCommentDialog();
            immVideoCommentDialog.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("POST_ITEM", postSubjectItem), TuplesKt.m97108a("comment_id", commentId), TuplesKt.m97108a("PAGE_NAME", str), TuplesKt.m97108a(WebConstants.PAGE_FROM, str2)));
            return immVideoCommentDialog;
        }
    }

    public ImmVideoCommentDialog() {
        super(R$layout.dialog_imm_video_comment);
        this.commentId = "";
        this.pageName = "";
        this.pageFrom = "";
    }

    /* JADX INFO: renamed from: s0 */
    private final int m73929s0() {
        int i11 = getResources().getDisplayMetrics().heightPixels;
        return i11 - (i11 / 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m73930t0(ImmVideoCommentDialog immVideoCommentDialog, View view) {
        immVideoCommentDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m73931u0(ImmVideoCommentDialog immVideoCommentDialog, View view) {
        CommentFragment commentFragment = immVideoCommentDialog.commentFragment;
        if (commentFragment != null) {
            commentFragment.mo74037t(view);
        }
        CommentFragment commentFragment2 = immVideoCommentDialog.commentFragment;
        if (commentFragment2 != null) {
            commentFragment2.m74034d1(null);
        }
        C16768a.m73058f(C16768a.f56378a, immVideoCommentDialog.data, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final Unit m73932v0(ImmVideoCommentDialog immVideoCommentDialog, String str, Boolean bool) {
        Function2 function2 = immVideoCommentDialog.mCommentCallback;
        if (function2 != null) {
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: w0 */
    private final void m73933w0() {
        final AppCompatTextView appCompatTextView;
        C28148f c28148f = this.viewBinding;
        if (c28148f == null || (appCompatTextView = c28148f.f86427e) == null) {
            return;
        }
        appCompatTextView.postDelayed(new Runnable() { // from class: com.transsion.postdetail.ui.dialog.d
            @Override // java.lang.Runnable
            public final void run() {
                ImmVideoCommentDialog.m73934x0(this.f57034a, appCompatTextView);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m73934x0(ImmVideoCommentDialog immVideoCommentDialog, AppCompatTextView appCompatTextView) {
        CommentFragment commentFragment = immVideoCommentDialog.commentFragment;
        if (commentFragment != null) {
            commentFragment.mo74037t(appCompatTextView);
        }
        CommentFragment commentFragment2 = immVideoCommentDialog.commentFragment;
        if (commentFragment2 != null) {
            commentFragment2.m74034d1(immVideoCommentDialog.mCommentBean);
        }
        C16768a.m73058f(C16768a.f56378a, immVideoCommentDialog.data, null, null, 6, null);
    }

    /* JADX INFO: renamed from: A0 */
    public void m73935A0(CommentFragment.InterfaceC17008b interfaceC17008b) {
        this.onCommentCountChangedListener = interfaceC17008b;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m73936B0() {
        this.isOpenEdittext = true;
    }

    @Override // com.transsion.baseui.dialog.BaseDialog
    public C24655b newLogViewConfig() {
        return new C24655b("videocomment", false, 2, null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.BottomDialogTheme);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.data = (PostSubjectItem) arguments.getSerializable("POST_ITEM");
            String string = arguments.getString("comment_id", "");
            Intrinsics.m97801g(string, "getString(...)");
            this.commentId = string;
            String string2 = arguments.getString("PAGE_NAME", "");
            Intrinsics.m97801g(string2, "getString(...)");
            this.pageName = string2;
            String string3 = arguments.getString(WebConstants.PAGE_FROM, "");
            Intrinsics.m97801g(string3, "getString(...)");
            this.pageFrom = string3;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        DialogC10016c dialogC10016c = new DialogC10016c(contextRequireContext, getTheme());
        Window window = dialogC10016c.getWindow();
        if (window != null) {
            window.setWindowAnimations(R$style.BaseBottomDialogAnimation);
        }
        Window window2 = dialogC10016c.getWindow();
        if (window2 != null) {
            window2.setGravity(80);
            window2.setDimAmount(0.5f);
            WindowManager.LayoutParams attributes = window2.getAttributes();
            if (attributes == null) {
                attributes = new WindowManager.LayoutParams();
            }
            attributes.width = C14555a.f51098a.m65668b(contextRequireContext);
            attributes.height = m73929s0();
            window2.setBackgroundDrawable(null);
            window2.setAttributes(attributes);
        }
        return dialogC10016c;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Stat stat;
        Long commentCount;
        AppCompatTextView appCompatTextView;
        ImageView imageView;
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C28148f c28148fM109305a = C28148f.m109305a(view);
        this.viewBinding = c28148fM109305a;
        if (c28148fM109305a != null && (frameLayout = c28148fM109305a.f86425c) != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
            layoutParams.height = m73929s0();
        }
        C28148f c28148f = this.viewBinding;
        if (c28148f != null && (imageView = c28148f.f86426d) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.dialog.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ImmVideoCommentDialog.m73930t0(this.f57031a, view2);
                }
            });
        }
        C28148f c28148f2 = this.viewBinding;
        if (c28148f2 != null && (appCompatTextView = c28148f2.f86427e) != null) {
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.dialog.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ImmVideoCommentDialog.m73931u0(this.f57032a, view2);
                }
            });
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
        AbstractC3168w abstractC3168wM14557p = childFragmentManager.m14557p();
        Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
        CommentFragment.Companion companion = CommentFragment.INSTANCE;
        PostSubjectItem postSubjectItem = this.data;
        String postId = postSubjectItem != null ? postSubjectItem.getPostId() : null;
        String value = CommentTopicType.POST.getValue();
        PostSubjectItem postSubjectItem2 = this.data;
        CommentFragment commentFragmentM74039a = companion.m74039a(postId, value, (postSubjectItem2 == null || (stat = postSubjectItem2.getStat()) == null || (commentCount = stat.getCommentCount()) == null) ? 0L : commentCount.longValue(), (8072 & 8) != 0, (8072 & 16) != 0 ? false : false, (8072 & 32) != 0 ? "" : this.commentId, this.pageFrom, (8072 & 128) != 0 ? null : null, (8072 & 256) != 0 ? null : null, (8072 & 512) != 0 ? null : null, (8072 & 1024) != 0 ? null : null, (8072 & 2048) != 0 ? null : null, (8072 & 4096) != 0 ? null : null);
        abstractC3168wM14557p.m14813s(R$id.fl_comment_container, commentFragmentM74039a);
        this.commentFragment = commentFragmentM74039a;
        abstractC3168wM14557p.mo14670i();
        CommentFragment commentFragment = this.commentFragment;
        if (commentFragment != null) {
            commentFragment.m74032b1(getOnCommentCountChangedListener());
        }
        CommentFragment commentFragment2 = this.commentFragment;
        if (commentFragment2 != null) {
            commentFragment2.m74031Z0(new Function2() { // from class: com.transsion.postdetail.ui.dialog.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ImmVideoCommentDialog.m73932v0(this.f57033a, (String) obj, (Boolean) obj2);
                }
            });
        }
        if (this.isOpenEdittext) {
            m73933w0();
        }
    }

    /* JADX INFO: renamed from: r0, reason: from getter */
    public CommentFragment.InterfaceC17008b getOnCommentCountChangedListener() {
        return this.onCommentCountChangedListener;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m73938y0(CommentBean commentBean) {
        this.mCommentBean = commentBean;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m73939z0(Function2 callback) {
        Intrinsics.m97802h(callback, "callback");
        this.mCommentCallback = callback;
    }
}
