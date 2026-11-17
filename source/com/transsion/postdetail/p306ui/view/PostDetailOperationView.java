package com.transsion.postdetail.p306ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.widget.R$drawable;
import com.transsion.baseui.R$mipmap;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.Stat;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p844vo.C28171q0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u000bJ'\u0010\u0011\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0012JW\u0010\u001a\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m97100d2 = {"Lcom/transsion/postdetail/ui/view/PostDetailOperationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/Function0;", "", "onCLickLike", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "postSubjectItem", "x", "(Lkotlin/jvm/functions/Function0;Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "onCLickComment", TtmlNode.TAG_P, "onCLickShare", "z", "(Lkotlin/jvm/functions/Function0;)V", "onCLickDownload", "v", "showData", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "commentCount", "updateCommentNum", "(J)V", "Lvo/q0;", "a", "Lvo/q0;", "mViewBinding", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class PostDetailOperationView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C28171q0 mViewBinding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostDetailOperationView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostDetailOperationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostDetailOperationView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.mViewBinding = C28171q0.m109366c(LayoutInflater.from(context));
        ConstraintLayout.C2308b c2308b = new ConstraintLayout.C2308b(-1, -2);
        C28171q0 c28171q0 = this.mViewBinding;
        addView(c28171q0 != null ? c28171q0.getRoot() : null, c2308b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m74775A(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: p */
    private final void m74784p(final Function0 onCLickComment, PostSubjectItem postSubjectItem) {
        AppCompatTextView appCompatTextView;
        Stat stat;
        Long commentCount;
        View view;
        C28171q0 c28171q0 = this.mViewBinding;
        if (c28171q0 != null && (view = c28171q0.f86603h) != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.j1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PostDetailOperationView.m74785q(onCLickComment, view2);
                }
            });
        }
        String strM65680a = AbstractC14564j.m65680a((postSubjectItem == null || (stat = postSubjectItem.getStat()) == null || (commentCount = stat.getCommentCount()) == null) ? 0L : commentCount.longValue());
        C28171q0 c28171q1 = this.mViewBinding;
        if (c28171q1 == null || (appCompatTextView = c28171q1.f86601f) == null) {
            return;
        }
        appCompatTextView.setText(strM65680a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m74785q(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Unit m74786r() {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final Unit m74787s() {
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showData$default(PostDetailOperationView postDetailOperationView, PostSubjectItem postSubjectItem, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = new Function0() { // from class: com.transsion.postdetail.ui.view.d1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PostDetailOperationView.m74786r();
                }
            };
        }
        Function0 function4 = function0;
        if ((i11 & 4) != 0) {
            function1 = new Function0() { // from class: com.transsion.postdetail.ui.view.e1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PostDetailOperationView.m74787s();
                }
            };
        }
        Function0 function5 = function1;
        if ((i11 & 8) != 0) {
            function2 = new Function0() { // from class: com.transsion.postdetail.ui.view.f1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PostDetailOperationView.m74788t();
                }
            };
        }
        Function0 function6 = function2;
        if ((i11 & 16) != 0) {
            function3 = new Function0() { // from class: com.transsion.postdetail.ui.view.g1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PostDetailOperationView.m74789u();
                }
            };
        }
        postDetailOperationView.showData(postSubjectItem, function4, function5, function6, function3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Unit m74788t() {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final Unit m74789u() {
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: v */
    private final void m74790v(final Function0 onCLickDownload, PostSubjectItem postSubjectItem) {
        View view;
        Media media;
        if (TextUtils.equals(MediaType.AUDIO.getValue(), (postSubjectItem == null || (media = postSubjectItem.getMedia()) == null) ? null : media.getMediaType())) {
            C28171q0 c28171q0 = this.mViewBinding;
            if (c28171q0 == null || (view = c28171q0.f86604i) == null) {
                return;
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.h1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PostDetailOperationView.m74791w(onCLickDownload, view2);
                }
            });
            return;
        }
        C28171q0 c28171q1 = this.mViewBinding;
        if (c28171q1 != null) {
            c28171q1.f86604i.setVisibility(8);
            c28171q1.f86598c.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m74791w(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: x */
    private final void m74792x(final Function0 onCLickLike, PostSubjectItem postSubjectItem) {
        Stat stat;
        Long likeCount;
        View view;
        C28171q0 c28171q0 = this.mViewBinding;
        if (c28171q0 != null && (view = c28171q0.f86605j) != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.k1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PostDetailOperationView.m74793y(onCLickLike, view2);
                }
            });
        }
        int i11 = postSubjectItem != null ? Intrinsics.m97797c(postSubjectItem.getHasLike(), Boolean.TRUE) : false ? R$mipmap.movie_detail_icon_liked : R$drawable.ic_movie_like;
        String strM65680a = AbstractC14564j.m65680a((postSubjectItem == null || (stat = postSubjectItem.getStat()) == null || (likeCount = stat.getLikeCount()) == null) ? 0L : likeCount.longValue());
        if (TextUtils.equals("0", strM65680a)) {
            strM65680a = "";
        }
        C28171q0 c28171q1 = this.mViewBinding;
        if (c28171q1 != null) {
            c28171q1.f86599d.setImageResource(i11);
            c28171q1.f86602g.setText(strM65680a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m74793y(Function0 function0, View view) {
        if (C14557c.f51100a.m65671a(view.getId(), 2000L)) {
            return;
        }
        function0.invoke();
    }

    /* JADX INFO: renamed from: z */
    private final void m74794z(final Function0 onCLickShare) {
        View view;
        C28171q0 c28171q0 = this.mViewBinding;
        if (c28171q0 == null || (view = c28171q0.f86606k) == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PostDetailOperationView.m74775A(onCLickShare, view2);
            }
        });
    }

    public final void showData(PostSubjectItem postSubjectItem, Function0<Unit> onCLickLike, Function0<Unit> onCLickComment, Function0<Unit> onCLickShare, Function0<Unit> onCLickDownload) {
        Intrinsics.m97802h(onCLickLike, "onCLickLike");
        Intrinsics.m97802h(onCLickComment, "onCLickComment");
        Intrinsics.m97802h(onCLickShare, "onCLickShare");
        Intrinsics.m97802h(onCLickDownload, "onCLickDownload");
        m74792x(onCLickLike, postSubjectItem);
        m74784p(onCLickComment, postSubjectItem);
        m74794z(onCLickShare);
        m74790v(onCLickDownload, postSubjectItem);
    }

    public final void updateCommentNum(long commentCount) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        if (commentCount <= 0) {
            C28171q0 c28171q0 = this.mViewBinding;
            if (c28171q0 == null || (appCompatTextView = c28171q0.f86601f) == null) {
                return;
            }
            appCompatTextView.setVisibility(8);
            return;
        }
        C28171q0 c28171q1 = this.mViewBinding;
        if (c28171q1 != null && (appCompatTextView3 = c28171q1.f86601f) != null) {
            appCompatTextView3.setText(AbstractC14564j.m65680a(commentCount));
        }
        C28171q0 c28171q2 = this.mViewBinding;
        if (c28171q2 == null || (appCompatTextView2 = c28171q2.f86601f) == null) {
            return;
        }
        appCompatTextView2.setVisibility(0);
    }
}
