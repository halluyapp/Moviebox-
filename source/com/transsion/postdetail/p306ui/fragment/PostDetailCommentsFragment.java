package com.transsion.postdetail.p306ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.p1004lifecycle.Lifecycle;
import com.blankj.utilcode.util.AbstractC5775a;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.AbstractC14566l;
import com.transsion.moviedetailapi.bean.Audio;
import com.transsion.moviedetailapi.bean.CommentBean;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.Stat;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.User;
import com.transsion.postdetail.R$drawable;
import com.transsion.postdetail.R$mipmap;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.bean.CommentLikeBean;
import com.transsion.postdetail.bean.CommentListBean;
import com.transsion.postdetail.comment.C16747t;
import com.transsion.postdetail.helper.C16768a;
import com.transsion.postdetail.p306ui.dialog.ImmVideoCommentDialog;
import com.transsion.postdetail.util.C17435e;
import com.transsion.postdetail.viewmodel.CommentViewModel;
import com.transsion.postdetail.viewmodel.PostDetailCommentsFragmentViewModel;
import com.transsion.postdetail.viewmodel.PostDetailViewModel;
import com.transsion.share.bean.PostType;
import com.transsion.share.share.InterfaceC18701a;
import com.transsion.share.share.ShareDialogFragment;
import com.transsion.usercenterapi.ReportType;
import com.transsnet.downloader.DownloadManagerApi;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.LikeEvent;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C25220y0;
import okhttp3.internal.http2.Settings;
import p441gz.InterfaceC23704a;
import p462hj.C23860f;
import p550kj.C24655b;
import p743rh.C27287m;
import p844vo.C28162m;
import p888wy.C28465b;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 [2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00052\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010\u0004J\r\u0010)\u001a\u00020\u0005¢\u0006\u0004\b)\u0010\u0004J\u0017\u0010+\u001a\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u0012¢\u0006\u0004\b+\u0010\u0015J\r\u0010,\u001a\u00020\u0005¢\u0006\u0004\b,\u0010\u0004J\r\u0010-\u001a\u00020\u0005¢\u0006\u0004\b-\u0010\u0004R\u0018\u00100\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\bF\u0010GR\u001d\u0010M\u001a\u0004\u0018\u00010I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010@\u001a\u0004\bK\u0010LR\"\u0010Q\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u00050N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010X\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Z\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u00106¨\u0006\\"}, m97100d2 = {"Lcom/transsion/postdetail/ui/fragment/PostDetailCommentsFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lvo/m;", "<init>", "()V", "", "observeLike", "V0", "updateOperationViewState", "", "code", "W0", "(Ljava/lang/String;)V", "", "Lcom/transsion/moviedetailapi/bean/CommentBean;", "commentList", "b1", "(Ljava/util/List;)V", "", "likeState", "U0", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroyView", "Landroid/view/LayoutInflater;", "inflater", "G0", "(Landroid/view/LayoutInflater;)Lvo/m;", "getPageStateLayoutTitle", "()Ljava/lang/String;", "isAudioShowNoNetworkLayout", "()Z", "isMonitorNetworkState", "initViewData", "initViewModel", "initListener", "retryLoadData", "loadDefaultData", "clickLike", "isOpenEdittext", "R0", "doShare", "clickDownload", "a", "Lcom/transsion/moviedetailapi/bean/CommentBean;", "commentBean", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "mPostSubjectItem", "c", "Ljava/lang/String;", "tranOps", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "I", "page", "e", "mPerPage", "Lcom/transsion/postdetail/viewmodel/PostDetailCommentsFragmentViewModel;", "f", "Lkotlin/Lazy;", "E0", "()Lcom/transsion/postdetail/viewmodel/PostDetailCommentsFragmentViewModel;", "mViewModel", "Lcom/transsion/postdetail/viewmodel/PostDetailViewModel;", "g", "F0", "()Lcom/transsion/postdetail/viewmodel/PostDetailViewModel;", "postDetailViewModel", "Lgz/a;", "h", "getMLoginApi", "()Lgz/a;", "mLoginApi", "Lkotlin/Function1;", "i", "Lkotlin/jvm/functions/Function1;", "operationViewVisibilityCallback", "Lcom/transsion/postdetail/viewmodel/CommentViewModel;", "j", "Lcom/transsion/postdetail/viewmodel/CommentViewModel;", "mCommentViewModel", CampaignEx.JSON_KEY_AD_K, "Z", "isOpenMeasureViewVisibility", "l", "pageName", "m", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@Deprecated
@SourceDebugExtension
public final class PostDetailCommentsFragment extends PageStatusFragment<C28162m> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private CommentBean commentBean;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private PostSubjectItem mPostSubjectItem;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String tranOps;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int page = 1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mPerPage = 1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy mViewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.t1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostDetailCommentsFragment.m74300O0();
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy postDetailViewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Lazy mLoginApi;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Function1 operationViewVisibilityCallback;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private CommentViewModel mCommentViewModel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isOpenMeasureViewVisibility;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.PostDetailCommentsFragment$b */
    public static final class C17033b implements InterfaceC18701a {
        C17033b() {
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: a */
        public void mo70521a(String id2, PostType postType) {
            Intrinsics.m97802h(id2, "id");
            PostDetailCommentsFragment.this.m74292F0().m75053r(id2);
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: b */
        public void mo70522b(String str) {
            new Intent().putExtra("id", str);
            Activity activityM27311b = AbstractC5775a.m27311b();
            if (activityM27311b != null) {
                activityM27311b.finish();
            }
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: c */
        public void mo70523c(String url, String fileName, String fileSize, String fileImage) {
            Intrinsics.m97802h(url, "url");
            Intrinsics.m97802h(fileName, "fileName");
            Intrinsics.m97802h(fileSize, "fileSize");
            Intrinsics.m97802h(fileImage, "fileImage");
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: d */
        public void mo70524d(String id2) {
            Intrinsics.m97802h(id2, "id");
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: e */
        public void mo70525e(String str) {
            InterfaceC18701a.a.m78649c(this, str);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.PostDetailCommentsFragment$c */
    static final class C17034c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f57209a;

        C17034c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f57209a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f57209a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3189c0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m97797c(mo6065a(), ((FunctionAdapter) obj).mo6065a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6065a().hashCode();
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f57209a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.PostDetailCommentsFragment$d */
    public static final class C17035d implements CommentFragment.InterfaceC17008b {
        C17035d() {
        }

        @Override // com.transsion.postdetail.p306ui.fragment.CommentFragment.InterfaceC17008b
        /* JADX INFO: renamed from: a */
        public void mo74040a(long j11) {
            Stat stat;
            Stat stat2;
            Long commentCount;
            PostSubjectItem postSubjectItem = PostDetailCommentsFragment.this.mPostSubjectItem;
            if (postSubjectItem == null || (stat2 = postSubjectItem.getStat()) == null || (commentCount = stat2.getCommentCount()) == null || commentCount.longValue() != j11) {
                PostSubjectItem postSubjectItem2 = PostDetailCommentsFragment.this.mPostSubjectItem;
                if (postSubjectItem2 != null && (stat = postSubjectItem2.getStat()) != null) {
                    stat.setCommentCount(Long.valueOf(j11));
                }
                if (j11 != 0) {
                    PostDetailCommentsFragment.this.loadDefaultData();
                } else {
                    PostDetailCommentsFragment.this.m74306V0();
                    PostDetailCommentsFragment.this.updateOperationViewState();
                }
            }
        }
    }

    public PostDetailCommentsFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.postdetail.ui.fragment.PostDetailCommentsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.postDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(PostDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.postdetail.ui.fragment.PostDetailCommentsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.postdetail.ui.fragment.PostDetailCommentsFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                Object objInvoke = function0.invoke();
                InterfaceC3208m interfaceC3208m = objInvoke instanceof InterfaceC3208m ? (InterfaceC3208m) objInvoke : null;
                C3227v0.c defaultViewModelProviderFactory = interfaceC3208m != null ? interfaceC3208m.getDefaultViewModelProviderFactory() : null;
                if (defaultViewModelProviderFactory == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.m97801g(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.mLoginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.u1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostDetailCommentsFragment.mLoginApi_delegate$lambda$1();
            }
        });
        this.operationViewVisibilityCallback = new Function1() { // from class: com.transsion.postdetail.ui.fragment.v1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDetailCommentsFragment.m74302Q0(((Integer) obj).intValue());
            }
        };
        this.isOpenMeasureViewVisibility = true;
    }

    /* JADX INFO: renamed from: E0 */
    private final PostDetailCommentsFragmentViewModel m74291E0() {
        return (PostDetailCommentsFragmentViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public final PostDetailViewModel m74292F0() {
        return (PostDetailViewModel) this.postDetailViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final void m74293H0(PostDetailCommentsFragment postDetailCommentsFragment, View view) {
        postDetailCommentsFragment.m74332R0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final Unit m74294I0(PostDetailCommentsFragment postDetailCommentsFragment) {
        m74303S0(postDetailCommentsFragment, false, 1, null);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final void m74295J0(PostDetailCommentsFragment postDetailCommentsFragment, View view) {
        Navigator navigatorM61773c = TheRouter.m61773c("/profile/user_profile");
        CommentBean commentBean = postDetailCommentsFragment.commentBean;
        Navigator.m61845x(navigatorM61773c.m61857K("userId", commentBean != null ? commentBean.getUid() : null), postDetailCommentsFragment.requireContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final void m74296K0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final Unit m74297L0(CommentLikeBean commentLikeBean) {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final Unit m74298M0(PostDetailCommentsFragment postDetailCommentsFragment, CommentListBean commentListBean) {
        AppCompatTextView appCompatTextView;
        Group group;
        List<CommentBean> commentList;
        if ((commentListBean == null || (commentList = commentListBean.getCommentList()) == null) ? true : commentList.isEmpty()) {
            postDetailCommentsFragment.m74306V0();
            postDetailCommentsFragment.updateOperationViewState();
        } else {
            C28162m mViewBinding = postDetailCommentsFragment.getMViewBinding();
            if (mViewBinding != null && (group = mViewBinding.f86520c) != null) {
                group.setVisibility(0);
            }
            C28162m mViewBinding2 = postDetailCommentsFragment.getMViewBinding();
            if (mViewBinding2 != null && (appCompatTextView = mViewBinding2.f86530m) != null) {
                appCompatTextView.setVisibility(8);
            }
            postDetailCommentsFragment.m74312b1(commentListBean != null ? commentListBean.getCommentList() : null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final Unit m74299N0(PostDetailCommentsFragment postDetailCommentsFragment, String str) {
        Intrinsics.m97799e(str);
        postDetailCommentsFragment.m74307W0(str);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final PostDetailCommentsFragmentViewModel m74300O0() {
        return new PostDetailCommentsFragmentViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final Unit m74301P0(PostDetailCommentsFragment postDetailCommentsFragment, LikeEvent value) {
        Stat stat;
        Stat stat2;
        Long likeCount;
        Stat stat3;
        Stat stat4;
        Long likeCount2;
        Intrinsics.m97802h(value, "value");
        try {
            Result.Companion companion = Result.INSTANCE;
            PostSubjectItem postSubjectItem = postDetailCommentsFragment.mPostSubjectItem;
            Long lValueOf = null;
            if (!TextUtils.equals(postSubjectItem != null ? postSubjectItem.getPostId() : null, value.getSubjectId())) {
                return Unit.f75682a;
            }
            PostSubjectItem postSubjectItem2 = postDetailCommentsFragment.mPostSubjectItem;
            if (postSubjectItem2 != null) {
                postSubjectItem2.setHasLike(Boolean.valueOf(value.getLike()));
            }
            if (value.getLike()) {
                PostSubjectItem postSubjectItem3 = postDetailCommentsFragment.mPostSubjectItem;
                if (postSubjectItem3 != null && (stat3 = postSubjectItem3.getStat()) != null) {
                    PostSubjectItem postSubjectItem4 = postDetailCommentsFragment.mPostSubjectItem;
                    if (postSubjectItem4 != null && (stat4 = postSubjectItem4.getStat()) != null && (likeCount2 = stat4.getLikeCount()) != null) {
                        lValueOf = Long.valueOf(likeCount2.longValue() + 1);
                    }
                    stat3.setLikeCount(lValueOf);
                }
            } else {
                PostSubjectItem postSubjectItem5 = postDetailCommentsFragment.mPostSubjectItem;
                if (postSubjectItem5 != null && (stat = postSubjectItem5.getStat()) != null) {
                    PostSubjectItem postSubjectItem6 = postDetailCommentsFragment.mPostSubjectItem;
                    if (postSubjectItem6 != null && (stat2 = postSubjectItem6.getStat()) != null && (likeCount = stat2.getLikeCount()) != null) {
                        lValueOf = Long.valueOf(likeCount.longValue() - 1);
                    }
                    stat.setLikeCount(lValueOf);
                }
            }
            postDetailCommentsFragment.updateOperationViewState();
            Result.m112707constructorimpl(Unit.f75682a);
            return Unit.f75682a;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final Unit m74302Q0(int i11) {
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m74303S0(PostDetailCommentsFragment postDetailCommentsFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        postDetailCommentsFragment.m74332R0(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final Unit m74304T0(PostDetailCommentsFragment postDetailCommentsFragment, String str, Boolean bool) {
        CommentBean commentBean = postDetailCommentsFragment.commentBean;
        if (TextUtils.equals(str, commentBean != null ? commentBean.getCommentId() : null)) {
            CommentBean commentBean2 = postDetailCommentsFragment.commentBean;
            if (commentBean2 != null) {
                commentBean2.setLikeStatu(bool);
            }
            postDetailCommentsFragment.m74305U0(bool != null ? bool.booleanValue() : false);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: U0 */
    private final void m74305U0(boolean likeState) {
        AppCompatImageView appCompatImageView;
        int i11 = likeState ? R$mipmap.ic_comment_item_liked : R$drawable.ic_like_comment_normal;
        C28162m mViewBinding = getMViewBinding();
        if (mViewBinding == null || (appCompatImageView = mViewBinding.f86523f) == null) {
            return;
        }
        appCompatImageView.setImageResource(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public final void m74306V0() {
        AppCompatTextView appCompatTextView;
        Group group;
        C28162m mViewBinding = getMViewBinding();
        if (mViewBinding != null && (group = mViewBinding.f86520c) != null) {
            group.setVisibility(8);
        }
        C28162m mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (appCompatTextView = mViewBinding2.f86530m) == null) {
            return;
        }
        appCompatTextView.setVisibility(0);
    }

    /* JADX INFO: renamed from: W0 */
    private final void m74307W0(String code) {
        String postId;
        if (!TextUtils.equals("0", code)) {
            C13806h c13806h = C13806h.f49015a;
            FragmentActivity activity = getActivity();
            c13806h.m62325l(activity != null ? activity.getString(R$string.delete_post_failed) : null);
            return;
        }
        PostSubjectItem postSubjectItem = this.mPostSubjectItem;
        if (postSubjectItem != null && (postId = postSubjectItem.getPostId()) != null) {
            C28465b.f87467a.m109954a().m109949e(postId);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final Unit m74308X0(PostDetailCommentsFragment postDetailCommentsFragment) {
        postDetailCommentsFragment.clickLike();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final Unit m74309Y0(PostDetailCommentsFragment postDetailCommentsFragment) {
        m74303S0(postDetailCommentsFragment, false, 1, null);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final Unit m74310Z0(PostDetailCommentsFragment postDetailCommentsFragment) {
        postDetailCommentsFragment.doShare();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final Unit m74311a1(PostDetailCommentsFragment postDetailCommentsFragment) {
        postDetailCommentsFragment.clickDownload();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: b1 */
    private final void m74312b1(List commentList) {
        String avatarUrl;
        Boolean likeStatu;
        Long createdAt;
        Subject subject;
        String subjectId;
        if (commentList == null || commentList.isEmpty()) {
            return;
        }
        final boolean z11 = false;
        this.commentBean = (CommentBean) commentList.get(0);
        C28162m mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            ShapeableImageView shapeableImageView = mViewBinding.f86525h;
            int iM27313a = AbstractC5776a0.m27313a(32.0f);
            C23860f.a aVar = C23860f.f72909a;
            Context context = shapeableImageView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context);
            CommentBean commentBean = this.commentBean;
            if (commentBean == null || (avatarUrl = commentBean.getAvatarUrl()) == null) {
                avatarUrl = "";
            }
            C23860f.b bVarM94464c = bVarM94457m.m94468g(avatarUrl).m94474m(iM27313a).m94464c(iM27313a);
            Intrinsics.m97799e(shapeableImageView);
            bVarM94464c.m94465d(shapeableImageView);
            AppCompatTextView appCompatTextView = mViewBinding.f86526i;
            CommentBean commentBean2 = this.commentBean;
            appCompatTextView.setText(commentBean2 != null ? commentBean2.getNickName() : null);
            AppCompatTextView appCompatTextView2 = mViewBinding.f86521d;
            PostSubjectItem postSubjectItem = this.mPostSubjectItem;
            boolean zBooleanValue = true;
            if (postSubjectItem != null && (subject = postSubjectItem.getSubject()) != null && (subjectId = subject.getSubjectId()) != null && subjectId.length() > 0) {
                z11 = true;
            }
            Intrinsics.m97799e(appCompatTextView2);
            CommentBean commentBean3 = this.commentBean;
            AbstractC14566l.m65691f(appCompatTextView2, commentBean3 != null ? commentBean3.getContent() : null, !z11, new Function2() { // from class: com.transsion.postdetail.ui.fragment.g1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostDetailCommentsFragment.m74313c1(z11, this, (View) obj, (String) obj2);
                }
            });
            AppCompatTextView appCompatTextView3 = mViewBinding.f86522e;
            C16747t c16747t = C16747t.f56290a;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
            CommentBean commentBean4 = this.commentBean;
            appCompatTextView3.setText(c16747t.m72932c(fragmentActivityRequireActivity, (commentBean4 == null || (createdAt = commentBean4.getCreatedAt()) == null) ? 0L : createdAt.longValue()));
            CommentBean commentBean5 = this.commentBean;
            if (commentBean5 != null && (likeStatu = commentBean5.getLikeStatu()) != null) {
                zBooleanValue = likeStatu.booleanValue();
            }
            m74305U0(zBooleanValue);
            updateOperationViewState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final Unit m74313c1(boolean z11, PostDetailCommentsFragment postDetailCommentsFragment, View view, String str) {
        String resourceLink;
        User user;
        Subject subject;
        ResourceDetectors resourceDetector;
        if (z11) {
            DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
            FragmentActivity fragmentActivityRequireActivity = postDetailCommentsFragment.requireActivity();
            Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
            PostSubjectItem postSubjectItem = postDetailCommentsFragment.mPostSubjectItem;
            Subject subject2 = postSubjectItem != null ? postSubjectItem.getSubject() : null;
            Intrinsics.m97799e(str);
            PostSubjectItem postSubjectItem2 = postDetailCommentsFragment.mPostSubjectItem;
            String ops = postSubjectItem2 != null ? postSubjectItem2.getOps() : null;
            PostSubjectItem postSubjectItem3 = postDetailCommentsFragment.mPostSubjectItem;
            if (postSubjectItem3 == null || (subject = postSubjectItem3.getSubject()) == null || (resourceDetector = subject.getResourceDetector()) == null || (resourceLink = resourceDetector.getResourceLink()) == null) {
                resourceLink = "";
            }
            String str2 = resourceLink;
            PostSubjectItem postSubjectItem4 = postDetailCommentsFragment.mPostSubjectItem;
            downloadManagerApiM87093a.m87084U(fragmentActivityRequireActivity, subject2, str, "postdetail", ops, str2, (postSubjectItem4 == null || (user = postSubjectItem4.getUser()) == null) ? null : user.getNickname());
        }
        return Unit.f75682a;
    }

    private final InterfaceC23704a getMLoginApi() {
        return (InterfaceC23704a) this.mLoginApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23704a mLoginApi_delegate$lambda$1() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    private final void observeLike() {
        Function1 function1 = new Function1() { // from class: com.transsion.postdetail.ui.fragment.m1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDetailCommentsFragment.m74301P0(this.f57394a, (LikeEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = LikeEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateOperationViewState() {
        AppCompatTextView appCompatTextView;
        Stat stat;
        Long commentCount;
        C28162m mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            C28162m mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (appCompatTextView = mViewBinding2.f86529l) != null) {
                PostSubjectItem postSubjectItem = this.mPostSubjectItem;
                appCompatTextView.setText(((postSubjectItem == null || (stat = postSubjectItem.getStat()) == null || (commentCount = stat.getCommentCount()) == null) ? 0L : commentCount.longValue()) + " Comments");
            }
            mViewBinding.f86528k.showData(this.mPostSubjectItem, new Function0() { // from class: com.transsion.postdetail.ui.fragment.h1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PostDetailCommentsFragment.m74308X0(this.f57360a);
                }
            }, new Function0() { // from class: com.transsion.postdetail.ui.fragment.i1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PostDetailCommentsFragment.m74309Y0(this.f57367a);
                }
            }, new Function0() { // from class: com.transsion.postdetail.ui.fragment.j1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PostDetailCommentsFragment.m74310Z0(this.f57374a);
                }
            }, new Function0() { // from class: com.transsion.postdetail.ui.fragment.k1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PostDetailCommentsFragment.m74311a1(this.f57382a);
                }
            });
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public C28162m getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28162m c28162mM109338c = C28162m.m109338c(inflater);
        Intrinsics.m97801g(c28162mM109338c, "inflate(...)");
        return c28162mM109338c;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m74332R0(boolean isOpenEdittext) {
        ImmVideoCommentDialog immVideoCommentDialogM73940b = ImmVideoCommentDialog.Companion.m73940b(ImmVideoCommentDialog.INSTANCE, this.mPostSubjectItem, null, null, null, 14, null);
        immVideoCommentDialogM73940b.m73939z0(new Function2() { // from class: com.transsion.postdetail.ui.fragment.l1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PostDetailCommentsFragment.m74304T0(this.f57388a, (String) obj, (Boolean) obj2);
            }
        });
        immVideoCommentDialogM73940b.m73935A0(new C17035d());
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
        immVideoCommentDialogM73940b.show(childFragmentManager, "tag_post_detail_comments_fragment");
        if (isOpenEdittext) {
            immVideoCommentDialogM73940b.m73936B0();
            immVideoCommentDialogM73940b.m73938y0(this.commentBean);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    public final void clickDownload() {
        String url;
        String str;
        Subject subject;
        ResourceDetectors resourceDetector;
        String resourceLink;
        Subject subject2;
        Subject subject3;
        Integer size;
        String url2;
        Subject subject4;
        ResourceDetectors resourceDetector2;
        PostSubjectItem postSubjectItem;
        Media media;
        Cover cover;
        Media media2;
        List<Audio> audio;
        PostSubjectItem postSubjectItem2 = this.mPostSubjectItem;
        Audio audio2 = (postSubjectItem2 == null || (media2 = postSubjectItem2.getMedia()) == null || (audio = media2.getAudio()) == null || audio.isEmpty()) ? null : audio.get(0);
        PostSubjectItem postSubjectItem3 = this.mPostSubjectItem;
        String title = postSubjectItem3 != null ? postSubjectItem3.getTitle() : null;
        if (TextUtils.isEmpty(title)) {
            PostSubjectItem postSubjectItem4 = this.mPostSubjectItem;
            title = postSubjectItem4 != null ? postSubjectItem4.getContent() : null;
        }
        String str2 = title;
        PostSubjectItem postSubjectItem5 = this.mPostSubjectItem;
        String coverUrl$default = postSubjectItem5 != null ? PostSubjectItem.getCoverUrl$default(postSubjectItem5, false, 1, null) : null;
        if (TextUtils.isEmpty(coverUrl$default) && ((postSubjectItem = this.mPostSubjectItem) == null || (media = postSubjectItem.getMedia()) == null || (cover = media.getCover()) == null || (coverUrl$default = cover.getUrl()) == null)) {
            coverUrl$default = "";
        }
        String str3 = coverUrl$default;
        PostSubjectItem postSubjectItem6 = this.mPostSubjectItem;
        if ((postSubjectItem6 != null ? postSubjectItem6.getSubject() : null) != null) {
            PostSubjectItem postSubjectItem7 = this.mPostSubjectItem;
            if (postSubjectItem7 == null || (subject4 = postSubjectItem7.getSubject()) == null || (resourceDetector2 = subject4.getResourceDetector()) == null) {
                str = null;
            } else {
                url = resourceDetector2.getResourceId();
                str = url;
            }
        } else {
            Audio audio3 = audio2;
            if (audio3 != null) {
                url = audio3.getUrl();
                str = url;
            } else {
                str = null;
            }
        }
        Audio audio4 = audio2;
        DownloadBean downloadBean = new DownloadBean((audio4 == null || (url2 = audio4.getUrl()) == null) ? "" : url2, str, str2, str3, (audio4 == null || (size = audio4.getSize()) == null) ? null : Long.valueOf(size.intValue()), "", null, null, null, null, 0L, 0, 0, 1, 0L, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, 0L, 0, 0, null, null, 0L, null, null, 0L, 0, 0L, null, 0, null, null, false, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -8256, -1, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
        PostSubjectItem postSubjectItem8 = this.mPostSubjectItem;
        downloadBean.setPostId(postSubjectItem8 != null ? postSubjectItem8.getPostId() : null);
        PostSubjectItem postSubjectItem9 = this.mPostSubjectItem;
        downloadBean.setSubjectId((postSubjectItem9 == null || (subject3 = postSubjectItem9.getSubject()) == null) ? null : subject3.getSubjectId());
        PostSubjectItem postSubjectItem10 = this.mPostSubjectItem;
        downloadBean.setSubjectName((postSubjectItem10 == null || (subject2 = postSubjectItem10.getSubject()) == null) ? null : subject2.getTitle());
        DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
        Context context = getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        PostSubjectItem postSubjectItem11 = this.mPostSubjectItem;
        String ops = postSubjectItem11 != null ? postSubjectItem11.getOps() : null;
        PostSubjectItem postSubjectItem12 = this.mPostSubjectItem;
        String str4 = (postSubjectItem12 == null || (subject = postSubjectItem12.getSubject()) == null || (resourceDetector = subject.getResourceDetector()) == null || (resourceLink = resourceDetector.getResourceLink()) == null) ? "" : resourceLink;
        PostSubjectItem postSubjectItem13 = this.mPostSubjectItem;
        downloadManagerApiM87093a.m87082O(fragmentActivity, downloadBean, "post_audio_detail", ops, str4, (64 & 32) != 0 ? null : postSubjectItem13 != null ? postSubjectItem13.getSubject() : null, (64 & 64) != 0 ? null : null);
        C16768a c16768a = C16768a.f56378a;
        PostSubjectItem postSubjectItem14 = this.mPostSubjectItem;
        String str5 = this.pageName;
        C16768a.m73059j(c16768a, postSubjectItem14, str5 == null ? "" : str5, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.transsion.postdetail.viewmodel.PostDetailViewModel] */
    public final void clickLike() {
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_tips);
            return;
        }
        PostSubjectItem postSubjectItem = this.mPostSubjectItem;
        ?? M97797c = postSubjectItem != null ? Intrinsics.m97797c(postSubjectItem.getHasLike(), Boolean.TRUE) : 0;
        ?? M74292F0 = m74292F0();
        PostSubjectItem postSubjectItem2 = this.mPostSubjectItem;
        M74292F0.m75052G(postSubjectItem2 != null ? postSubjectItem2.getPostId() : null, M97797c);
        C16768a c16768a = C16768a.f56378a;
        PostSubjectItem postSubjectItem3 = this.mPostSubjectItem;
        boolean zM97797c = postSubjectItem3 != null ? Intrinsics.m97797c(postSubjectItem3.getHasLike(), Boolean.TRUE) : false;
        String str = this.pageName;
        if (str == null) {
            str = "";
        }
        C16768a.m73061q(c16768a, postSubjectItem3, zM97797c, str, null, 8, null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    public final void doShare() {
        boolean z11;
        User user;
        User user2;
        InterfaceC23704a mLoginApi = getMLoginApi();
        UserInfo userInfoMo90386h = mLoginApi != null ? mLoginApi.mo90386h() : null;
        if ((userInfoMo90386h != null ? userInfoMo90386h.getUserId() : null) != null) {
            String userId = userInfoMo90386h.getUserId();
            PostSubjectItem postSubjectItem = this.mPostSubjectItem;
            if (Intrinsics.m97797c(userId, (postSubjectItem == null || (user2 = postSubjectItem.getUser()) == null) ? null : user2.getUserId())) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        boolean z12 = z11;
        ShareDialogFragment.Companion companion = ShareDialogFragment.INSTANCE;
        PostType postType = PostType.POST_TYPE;
        PostSubjectItem postSubjectItem2 = this.mPostSubjectItem;
        String postId = postSubjectItem2 != null ? postSubjectItem2.getPostId() : null;
        PostSubjectItem postSubjectItem3 = this.mPostSubjectItem;
        String userId2 = (postSubjectItem3 == null || (user = postSubjectItem3.getUser()) == null) ? null : user.getUserId();
        String value = ReportType.POST.getValue();
        PostSubjectItem postSubjectItem4 = this.mPostSubjectItem;
        ShareDialogFragment shareDialogFragmentM78645a = companion.m78645a(postType, postId, userId2, value, (3328 & 16) != 0 ? "" : postSubjectItem4 != null ? postSubjectItem4.getTitle() : null, (3328 & 32) != 0 ? "" : "", (3328 & 64) != 0 ? false : false, (3328 & 128) != 0 ? false : z12, (3328 & 256) != 0 ? false : false, "postdetail", (3328 & 1024) != 0 ? "" : this.tranOps, (3328 & 2048) != 0 ? "" : null);
        shareDialogFragmentM78645a.m78642G0(new C17033b());
        shareDialogFragmentM78645a.show(getChildFragmentManager(), "share");
        C16768a c16768a = C16768a.f56378a;
        PostSubjectItem postSubjectItem5 = this.mPostSubjectItem;
        String str = this.pageName;
        if (str == null) {
            str = "";
        }
        C16768a.m73054B(c16768a, postSubjectItem5, str, null, 4, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        observeLike();
        C28162m mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            mViewBinding.f86524g.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.fragment.p1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PostDetailCommentsFragment.m74293H0(this.f57416a, view);
                }
            });
            C17435e.f57826a.m74956b(new View[]{mViewBinding.f86529l, mViewBinding.f86527j, mViewBinding.f86530m, mViewBinding.f86522e, mViewBinding.f86521d, mViewBinding.f86526i}, new Function0() { // from class: com.transsion.postdetail.ui.fragment.q1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PostDetailCommentsFragment.m74294I0(this.f57439a);
                }
            });
            mViewBinding.f86525h.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.fragment.r1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PostDetailCommentsFragment.m74295J0(this.f57446a, view);
                }
            });
            mViewBinding.f86530m.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.fragment.s1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PostDetailCommentsFragment.m74296K0(view);
                }
            });
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        AppCompatTextView appCompatTextView;
        Stat stat;
        Long commentCount;
        C28162m mViewBinding = getMViewBinding();
        if (mViewBinding == null || (appCompatTextView = mViewBinding.f86529l) == null) {
            return;
        }
        PostSubjectItem postSubjectItem = this.mPostSubjectItem;
        appCompatTextView.setText(((postSubjectItem == null || (stat = postSubjectItem.getStat()) == null || (commentCount = stat.getCommentCount()) == null) ? 0L : commentCount.longValue()) + " Comments");
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        CommentViewModel commentViewModel = (CommentViewModel) new C3227v0(this).m14969a(CommentViewModel.class);
        commentViewModel.m74992m().m14851j(getViewLifecycleOwner(), new C17034c(new Function1() { // from class: com.transsion.postdetail.ui.fragment.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDetailCommentsFragment.m74297L0((CommentLikeBean) obj);
            }
        }));
        this.mCommentViewModel = commentViewModel;
        m74291E0().m75020g().m14851j(getViewLifecycleOwner(), new C17034c(new Function1() { // from class: com.transsion.postdetail.ui.fragment.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDetailCommentsFragment.m74298M0(this.f57400a, (CommentListBean) obj);
            }
        }));
        m74292F0().m75054t().m14851j(this, new C17034c(new Function1() { // from class: com.transsion.postdetail.ui.fragment.o1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDetailCommentsFragment.m74299N0(this.f57410a, (String) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isMonitorNetworkState() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void loadDefaultData() {
        String postId;
        PostDetailCommentsFragmentViewModel postDetailCommentsFragmentViewModelM74291E0 = m74291E0();
        PostSubjectItem postSubjectItem = this.mPostSubjectItem;
        if (postSubjectItem == null || (postId = postSubjectItem.getPostId()) == null) {
            postId = "";
        }
        postDetailCommentsFragmentViewModelM74291E0.m75019e(postId, "0", String.valueOf(this.page), this.mPerPage);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Object objM112707constructorimpl;
        HashMap mapM96844g;
        Subject subject;
        HashMap mapM96844g2;
        Subject subject2;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Serializable serializable = arguments.getSerializable("post_subject_item");
                Intrinsics.m97800f(serializable, "null cannot be cast to non-null type com.transsion.moviedetailapi.bean.PostSubjectItem");
                this.mPostSubjectItem = (PostSubjectItem) serializable;
                this.tranOps = arguments.getString("rec_ops");
                this.pageName = arguments.getString("page_name");
                C24655b logViewConfig = getLogViewConfig();
                Object hasResource = null;
                if (logViewConfig != null && (mapM96844g2 = logViewConfig.m96844g()) != null) {
                    PostSubjectItem postSubjectItem = this.mPostSubjectItem;
                    mapM96844g2.put("subject_id", (postSubjectItem == null || (subject2 = postSubjectItem.getSubject()) == null) ? null : subject2.getSubjectId());
                }
                C24655b logViewConfig2 = getLogViewConfig();
                if (logViewConfig2 != null && (mapM96844g = logViewConfig2.m96844g()) != null) {
                    PostSubjectItem postSubjectItem2 = this.mPostSubjectItem;
                    if (postSubjectItem2 != null && (subject = postSubjectItem2.getSubject()) != null) {
                        hasResource = subject.getHasResource();
                    }
                    mapM96844g.put("has_resource", String.valueOf(hasResource));
                    hasResource = Unit.f75682a;
                }
                objM112707constructorimpl = Result.m112707constructorimpl(hasResource);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            Result.m112706boximpl(objM112707constructorimpl);
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.isOpenMeasureViewVisibility = false;
        super.onDestroyView();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }
}
