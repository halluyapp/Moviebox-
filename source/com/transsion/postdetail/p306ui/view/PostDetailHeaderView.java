package com.transsion.postdetail.p306ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.User;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.R$layout;
import com.transsion.postdetail.helper.C16768a;
import com.transsion.postdetail.util.AbstractC17443m;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p462hj.C23860f;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
@Metadata(m97099d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ)\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\b\u0002\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010 R\u0018\u0010'\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010 R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, m97100d2 = {"Lcom/transsion/postdetail/ui/view/PostDetailHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "m", "()V", "j", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "postSubjectItem", "Lkotlin/Function0;", "onGroupClick", "showData", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;Lkotlin/jvm/functions/Function0;)V", "a", "Lkotlin/jvm/functions/Function0;", "mOnGroupClick", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroidx/constraintlayout/widget/ConstraintLayout;", "llHeaderRootView", "c", "llSubject", "Landroidx/appcompat/widget/AppCompatTextView;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroidx/appcompat/widget/AppCompatTextView;", "tvSubject", "e", "tvTip", "f", "tvPostTime", "g", "tvName", "Lcom/google/android/material/imageview/ShapeableImageView;", "h", "Lcom/google/android/material/imageview/ShapeableImageView;", "ivAvatar", "i", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "mPostSubjectItem", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class PostDetailHeaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Function0 mOnGroupClick;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ConstraintLayout llHeaderRootView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private ConstraintLayout llSubject;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private AppCompatTextView tvSubject;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private AppCompatTextView tvTip;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private AppCompatTextView tvPostTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private AppCompatTextView tvName;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private ShapeableImageView ivAvatar;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private PostSubjectItem mPostSubjectItem;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostDetailHeaderView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostDetailHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostDetailHeaderView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        View.inflate(context, R$layout.view_post_detail_header_layout, this);
        m74774m();
        m74771j();
    }

    /* JADX INFO: renamed from: j */
    private final void m74771j() {
        ConstraintLayout constraintLayout = this.llHeaderRootView;
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.b1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PostDetailHeaderView.m74772k(this.f57728a, view);
                }
            });
        }
        ConstraintLayout constraintLayout2 = this.llSubject;
        if (constraintLayout2 != null) {
            constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.view.c1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PostDetailHeaderView.m74773l(this.f57730a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m74772k(PostDetailHeaderView postDetailHeaderView, View view) {
        User user;
        if (C14557c.f51100a.m65671a(view.getId(), 2000L)) {
            return;
        }
        Navigator navigatorM61773c = TheRouter.m61773c("/profile/user_profile");
        PostSubjectItem postSubjectItem = postDetailHeaderView.mPostSubjectItem;
        Navigator.m61845x(navigatorM61773c.m61857K("userId", (postSubjectItem == null || (user = postSubjectItem.getUser()) == null) ? null : user.getUserId()), postDetailHeaderView.getContext(), null, 2, null);
        C16768a.m73057d(C16768a.f56378a, postDetailHeaderView.mPostSubjectItem, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m74773l(PostDetailHeaderView postDetailHeaderView, View view) {
        Function0 function0 = postDetailHeaderView.mOnGroupClick;
        if (function0 != null) {
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m74774m() {
        this.ivAvatar = (ShapeableImageView) findViewById(R$id.ivAvatar);
        this.tvName = (AppCompatTextView) findViewById(R$id.tvName);
        this.tvPostTime = (AppCompatTextView) findViewById(R$id.tvPostTime);
        this.tvTip = (AppCompatTextView) findViewById(R$id.tvTip);
        this.tvSubject = (AppCompatTextView) findViewById(R$id.tvSubject);
        this.llSubject = (ConstraintLayout) findViewById(R$id.llSubject);
        this.llHeaderRootView = (ConstraintLayout) findViewById(R$id.llHeaderRootView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showData$default(PostDetailHeaderView postDetailHeaderView, PostSubjectItem postSubjectItem, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        postDetailHeaderView.showData(postSubjectItem, function0);
    }

    public final void showData(PostSubjectItem postSubjectItem, Function0<Unit> onGroupClick) {
        String avatar;
        Intrinsics.m97802h(postSubjectItem, "postSubjectItem");
        this.mPostSubjectItem = postSubjectItem;
        this.mOnGroupClick = onGroupClick;
        AppCompatTextView appCompatTextView = this.tvName;
        if (appCompatTextView != null) {
            User user = postSubjectItem.getUser();
            appCompatTextView.setText(user != null ? user.getNickname() : null);
        }
        ShapeableImageView shapeableImageView = this.ivAvatar;
        if (shapeableImageView != null) {
            int iM27313a = AbstractC5776a0.m27313a(32.0f);
            C23860f.a aVar = C23860f.f72909a;
            Context context = shapeableImageView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context);
            User user2 = postSubjectItem.getUser();
            if (user2 == null || (avatar = user2.getAvatar()) == null) {
                avatar = "";
            }
            bVarM94457m.m94468g(avatar).m94474m(iM27313a).m94464c(iM27313a).m94465d(shapeableImageView);
        }
        AppCompatTextView appCompatTextView2 = this.tvPostTime;
        if (appCompatTextView2 != null) {
            if (postSubjectItem.getCreatedAt() == null) {
                AbstractC26006c.m102054g(appCompatTextView2);
            } else {
                AbstractC26006c.m102058k(appCompatTextView2);
                String createdAt = postSubjectItem.getCreatedAt();
                appCompatTextView2.setText(AbstractC17443m.m74966a(createdAt != null ? Long.parseLong(createdAt) : 0L));
            }
        }
        if (postSubjectItem.getGroup() == null) {
            ConstraintLayout constraintLayout = this.llSubject;
            if (constraintLayout != null) {
                AbstractC26006c.m102054g(constraintLayout);
            }
            AppCompatTextView appCompatTextView3 = this.tvTip;
            if (appCompatTextView3 != null) {
                AbstractC26006c.m102054g(appCompatTextView3);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout2 = this.llSubject;
        if (constraintLayout2 != null) {
            AbstractC26006c.m102058k(constraintLayout2);
        }
        AppCompatTextView appCompatTextView4 = this.tvTip;
        if (appCompatTextView4 != null) {
            AbstractC26006c.m102058k(appCompatTextView4);
        }
        AppCompatTextView appCompatTextView5 = this.tvSubject;
        if (appCompatTextView5 != null) {
            Group group = postSubjectItem.getGroup();
            appCompatTextView5.setText(group != null ? group.getName() : null);
        }
    }
}
