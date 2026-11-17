package com.transsion.postdetail.p306ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.p1004lifecycle.Lifecycle;
import com.blankj.utilcode.util.AbstractC5775a;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.Utils;
import com.google.android.material.appbar.AppBarLayout;
import com.p282tn.lib.view.TitleLayout;
import com.p282tn.lib.widget.R$string;
import com.p282tn.lib.widget.dialog.TRDialog;
import com.p282tn.lib.widget.dialog.TRDialogListener;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetailapi.InterfaceC16246g;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Audio;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.Stat;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.User;
import com.transsion.ninegridview.C16316a;
import com.transsion.ninegridview.helper.C16323b;
import com.transsion.ninegridview.helper.FileHelper;
import com.transsion.postdetail.R$drawable;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.helper.C16768a;
import com.transsion.postdetail.helper.NegativeFeedbackHelper;
import com.transsion.postdetail.p306ui.activity.PostDetailActivity;
import com.transsion.postdetail.p306ui.view.PostBaseItemView;
import com.transsion.postdetail.p306ui.view.PostDetailItemView;
import com.transsion.postdetail.util.PostSaveHelper;
import com.transsion.postdetail.viewmodel.PostDetailViewModel;
import com.transsion.postdetailapi.CommentTopicType;
import com.transsion.share.bean.PostType;
import com.transsion.share.share.InterfaceC18701a;
import com.transsion.share.share.ShareDialogFragment;
import com.transsion.usercenterapi.ReportType;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.DownloadManagerApi;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.LikeEvent;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.C25220y0;
import okhttp3.internal.http2.Settings;
import p415fq.InterfaceC23415f;
import p441gz.InterfaceC23704a;
import p550kj.C24655b;
import p577lh.C25636b;
import p743rh.C27287m;
import p844vo.C28166o;
import p888wy.C28465b;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 j2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001kB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0005J\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0005J\u0017\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0016H\u0016¢\u0006\u0004\b%\u0010\u0018J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010(J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010\u0005J\u0017\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b2\u00101J1\u00109\u001a\u00020\u00062\u0006\u00104\u001a\u0002032\u0010\u00106\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0016052\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b;\u0010\u0005J\u000f\u0010<\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010\u0005J\u000f\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010\u0005J\u000f\u0010>\u001a\u00020\u0006H\u0016¢\u0006\u0004\b>\u0010\u0005J\u000f\u0010?\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010\u0005J\u000f\u0010@\u001a\u00020\u0006H\u0016¢\u0006\u0004\b@\u0010\u0005J\u0017\u0010A\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bA\u0010\u0011J\u0017\u0010B\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bB\u0010\u0011J\u0017\u0010C\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bC\u0010\u0011R\u0018\u0010D\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER$\u0010F\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010E\u001a\u0004\bG\u0010\u0018\"\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR$\u0010L\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010E\u001a\u0004\bM\u0010\u0018\"\u0004\bN\u0010IR\u0018\u0010O\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010ER$\u0010P\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010\u0011R\u0016\u0010U\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010KR\u0018\u0010W\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001d\u0010c\u001a\u0004\u0018\u00010_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010[\u001a\u0004\ba\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010h\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010i¨\u0006l"}, m97100d2 = {"Lcom/transsion/postdetail/ui/fragment/PostDetailFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lvo/o;", "Lcom/tn/lib/widget/dialog/TRDialogListener;", "<init>", "()V", "", "initView", "", "commentCount", "updateCommentCount", "(J)V", "loadData", "updatePostDetail", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "postItem", "onDownloadClick", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "requestPermission", "showSettingDialog", WebConstants.FIELD_ITEM, "setPTParams", "", "getPageName", "()Ljava/lang/String;", "observeLike", "updateOperationViewState", "clickLike", "showCommentsDialog", "doShare", "clickDownload", "localLogPause", "receiveArguments", "Landroid/view/LayoutInflater;", "inflater", "getViewBinding", "(Landroid/view/LayoutInflater;)Lvo/o;", "getPageStateLayoutTitle", "", "isAudioShowNoNetworkLayout", "()Z", "isMonitorNetworkState", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "initViewData", "Lcom/tn/lib/widget/dialog/TRDialog;", "dialog", "onLeftButtonClick", "(Lcom/tn/lib/widget/dialog/TRDialog;)V", "onRightButtonClick", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "initViewModel", "initListener", "retryLoadData", "onResume", "onPause", "onDestroy", "openSubjectDetail", "openRoomDetail", "openUserCenter", "tranOps", "Ljava/lang/String;", "postId", "getPostId", "setPostId", "(Ljava/lang/String;)V", "fromComment", "Z", "commentId", "getCommentId", "setCommentId", "pageFrom", "mPostDetailBean", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "getMPostDetailBean", "()Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "setMPostDetailBean", "mNeedDeleteOnExit", "Lcom/transsion/postdetail/ui/fragment/CommentFragment;", "commentFragment", "Lcom/transsion/postdetail/ui/fragment/CommentFragment;", "Lcom/transsion/postdetail/viewmodel/PostDetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/transsion/postdetail/viewmodel/PostDetailViewModel;", "viewModel", "Lgz/a;", "mLoginApi$delegate", "getMLoginApi", "()Lgz/a;", "mLoginApi", "Lcom/transsion/postdetail/ui/fragment/CommentFragment$b;", "onCommentCountChangedListener", "Lcom/transsion/postdetail/ui/fragment/CommentFragment$b;", "Lcom/transsion/ninegridview/a;", "mGifPlayerManager", "Lcom/transsion/ninegridview/a;", "Companion", "a", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class PostDetailFragment extends PageStatusFragment<C28166o> implements TRDialogListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String PAGE_NAME = "post_detail";
    private CommentFragment commentFragment;
    private String commentId;
    private boolean fromComment;
    private C16316a mGifPlayerManager;

    /* JADX INFO: renamed from: mLoginApi$delegate, reason: from kotlin metadata */
    private final Lazy mLoginApi;
    private boolean mNeedDeleteOnExit;
    private PostSubjectItem mPostDetailBean;
    private CommentFragment.InterfaceC17008b onCommentCountChangedListener;
    private String pageFrom;
    private String postId;
    private String tranOps;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.PostDetailFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final PostDetailFragment m74401a(String str, boolean z11, String str2, PostSubjectItem postSubjectItem, String str3, String str4) {
            PostDetailFragment postDetailFragment = new PostDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("comment_id", str3);
            bundle.putBoolean("from_comment", z11);
            bundle.putString("rec_ops", str2);
            bundle.putString(WebConstants.PAGE_FROM, str4);
            bundle.putSerializable("item_object", postSubjectItem);
            postDetailFragment.setArguments(bundle);
            return postDetailFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.PostDetailFragment$b */
    public static final class C17041b implements InterfaceC18701a {
        C17041b() {
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: a */
        public void mo70521a(String id2, PostType postType) {
            Intrinsics.m97802h(id2, "id");
            PostDetailFragment.this.getViewModel().m75053r(id2);
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

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.PostDetailFragment$c */
    public static final class C17042c implements CommentFragment.InterfaceC17008b {
        C17042c() {
        }

        @Override // com.transsion.postdetail.p306ui.fragment.CommentFragment.InterfaceC17008b
        /* JADX INFO: renamed from: a */
        public void mo74040a(long j11) {
            PostDetailFragment.this.updateCommentCount(j11);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.PostDetailFragment$d */
    static final class C17043d implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f57226a;

        C17043d(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f57226a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f57226a;
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
            this.f57226a.invoke(obj);
        }
    }

    public PostDetailFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.postdetail.ui.fragment.PostDetailFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.viewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(PostDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.postdetail.ui.fragment.PostDetailFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.postdetail.ui.fragment.PostDetailFragment$special$$inlined$viewModels$default$3
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
        this.mLoginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.b3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostDetailFragment.mLoginApi_delegate$lambda$0();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    private final void clickDownload() {
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
        PostSubjectItem postSubjectItem2 = this.mPostDetailBean;
        Audio audio2 = (postSubjectItem2 == null || (media2 = postSubjectItem2.getMedia()) == null || (audio = media2.getAudio()) == null) ? null : audio.get(0);
        PostSubjectItem postSubjectItem3 = this.mPostDetailBean;
        String title = postSubjectItem3 != null ? postSubjectItem3.getTitle() : null;
        if (TextUtils.isEmpty(title)) {
            PostSubjectItem postSubjectItem4 = this.mPostDetailBean;
            title = postSubjectItem4 != null ? postSubjectItem4.getContent() : null;
        }
        String str2 = title;
        PostSubjectItem postSubjectItem5 = this.mPostDetailBean;
        String coverUrl$default = postSubjectItem5 != null ? PostSubjectItem.getCoverUrl$default(postSubjectItem5, false, 1, null) : null;
        if (TextUtils.isEmpty(coverUrl$default) && ((postSubjectItem = this.mPostDetailBean) == null || (media = postSubjectItem.getMedia()) == null || (cover = media.getCover()) == null || (coverUrl$default = cover.getUrl()) == null)) {
            coverUrl$default = "";
        }
        String str3 = coverUrl$default;
        PostSubjectItem postSubjectItem6 = this.mPostDetailBean;
        if ((postSubjectItem6 != null ? postSubjectItem6.getSubject() : null) != null) {
            PostSubjectItem postSubjectItem7 = this.mPostDetailBean;
            if (postSubjectItem7 == null || (subject4 = postSubjectItem7.getSubject()) == null || (resourceDetector2 = subject4.getResourceDetector()) == null) {
                str = null;
            } else {
                url = resourceDetector2.getResourceId();
                str = url;
            }
        } else if (audio2 != null) {
            url = audio2.getUrl();
            str = url;
        } else {
            str = null;
        }
        DownloadBean downloadBean = new DownloadBean((audio2 == null || (url2 = audio2.getUrl()) == null) ? "" : url2, str, str2, str3, (audio2 == null || (size = audio2.getSize()) == null) ? null : Long.valueOf(size.intValue()), "", null, null, null, null, 0L, 0, 0, 1, 0L, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, 0L, 0, 0, null, null, 0L, null, null, 0L, 0, 0L, null, 0, null, null, false, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -8256, -1, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
        PostSubjectItem postSubjectItem8 = this.mPostDetailBean;
        downloadBean.setPostId(postSubjectItem8 != null ? postSubjectItem8.getPostId() : null);
        PostSubjectItem postSubjectItem9 = this.mPostDetailBean;
        downloadBean.setSubjectId((postSubjectItem9 == null || (subject3 = postSubjectItem9.getSubject()) == null) ? null : subject3.getSubjectId());
        PostSubjectItem postSubjectItem10 = this.mPostDetailBean;
        downloadBean.setSubjectName((postSubjectItem10 == null || (subject2 = postSubjectItem10.getSubject()) == null) ? null : subject2.getTitle());
        DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
        Context context = getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        PostSubjectItem postSubjectItem11 = this.mPostDetailBean;
        String ops = postSubjectItem11 != null ? postSubjectItem11.getOps() : null;
        PostSubjectItem postSubjectItem12 = this.mPostDetailBean;
        String str4 = (postSubjectItem12 == null || (subject = postSubjectItem12.getSubject()) == null || (resourceDetector = subject.getResourceDetector()) == null || (resourceLink = resourceDetector.getResourceLink()) == null) ? "" : resourceLink;
        PostSubjectItem postSubjectItem13 = this.mPostDetailBean;
        downloadManagerApiM87093a.m87082O(fragmentActivity, downloadBean, "post_audio_detail", ops, str4, (64 & 32) != 0 ? null : postSubjectItem13 != null ? postSubjectItem13.getSubject() : null, (64 & 64) != 0 ? null : null);
        C16768a.f56378a.m73074i(this.mPostDetailBean, getPageName(), this.pageFrom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.transsion.postdetail.viewmodel.PostDetailViewModel] */
    private final void clickLike() {
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.no_network_tips);
            return;
        }
        PostSubjectItem postSubjectItem = this.mPostDetailBean;
        ?? M97797c = postSubjectItem != null ? Intrinsics.m97797c(postSubjectItem.getHasLike(), Boolean.TRUE) : 0;
        ?? viewModel = getViewModel();
        PostSubjectItem postSubjectItem2 = this.mPostDetailBean;
        viewModel.m75052G(postSubjectItem2 != null ? postSubjectItem2.getPostId() : null, M97797c);
        C16768a c16768a = C16768a.f56378a;
        PostSubjectItem postSubjectItem3 = this.mPostDetailBean;
        c16768a.m73079p(postSubjectItem3, postSubjectItem3 != null ? Intrinsics.m97797c(postSubjectItem3.getHasLike(), Boolean.TRUE) : false, getPageName(), this.pageFrom);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    private final void doShare() {
        boolean z11;
        User user;
        User user2;
        InterfaceC23704a mLoginApi = getMLoginApi();
        UserInfo userInfoMo90386h = mLoginApi != null ? mLoginApi.mo90386h() : null;
        if ((userInfoMo90386h != null ? userInfoMo90386h.getUserId() : null) != null) {
            String userId = userInfoMo90386h.getUserId();
            PostSubjectItem postSubjectItem = this.mPostDetailBean;
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
        PostSubjectItem postSubjectItem2 = this.mPostDetailBean;
        String postId = postSubjectItem2 != null ? postSubjectItem2.getPostId() : null;
        PostSubjectItem postSubjectItem3 = this.mPostDetailBean;
        String userId2 = (postSubjectItem3 == null || (user = postSubjectItem3.getUser()) == null) ? null : user.getUserId();
        String value = ReportType.POST.getValue();
        PostSubjectItem postSubjectItem4 = this.mPostDetailBean;
        ShareDialogFragment shareDialogFragmentM78645a = companion.m78645a(postType, postId, userId2, value, (3328 & 16) != 0 ? "" : postSubjectItem4 != null ? postSubjectItem4.getTitle() : null, (3328 & 32) != 0 ? "" : "", (3328 & 64) != 0 ? false : false, (3328 & 128) != 0 ? false : z12, (3328 & 256) != 0 ? false : false, "postdetail", (3328 & 1024) != 0 ? "" : this.tranOps, (3328 & 2048) != 0 ? "" : null);
        shareDialogFragmentM78645a.m78642G0(new C17041b());
        shareDialogFragmentM78645a.show(getChildFragmentManager(), "share");
        C16768a.f56378a.m73067A(this.mPostDetailBean, getPageName(), this.pageFrom);
    }

    private final InterfaceC23704a getMLoginApi() {
        return (InterfaceC23704a) this.mLoginApi.getValue();
    }

    private final String getPageName() {
        return PAGE_NAME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostDetailViewModel getViewModel() {
        return (PostDetailViewModel) this.viewModel.getValue();
    }

    private final void initView() {
        AppCompatTextView appCompatTextView;
        Stat stat;
        Long commentCount;
        TitleLayout titleLayout;
        ConstraintLayout.C2308b c2308b;
        ViewGroup.LayoutParams layoutParams;
        ConstraintLayout.C2308b c2308b2;
        this.onCommentCountChangedListener = new C17042c();
        C28166o mViewBinding = getMViewBinding();
        if (mViewBinding != null && (titleLayout = mViewBinding.f86571f) != null) {
            titleLayout.setTitleText("");
            titleLayout.setRightView(R$drawable.ic_post_negative_feedback, new View.OnClickListener() { // from class: com.transsion.postdetail.ui.fragment.q2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PostDetailFragment.initView$lambda$6$lambda$3(this.f57440a, view);
                }
            });
            ImageView ivMenu = titleLayout.getIvMenu();
            if (ivMenu != null) {
                int iM27313a = AbstractC5776a0.m27313a(32.0f);
                int iM27313a2 = AbstractC5776a0.m27313a(4.0f);
                int iM27313a3 = AbstractC5776a0.m27313a(8.0f);
                ViewGroup.LayoutParams layoutParams2 = ivMenu.getLayoutParams();
                if (layoutParams2 instanceof ConstraintLayout.C2308b) {
                    c2308b2 = (ConstraintLayout.C2308b) layoutParams2;
                } else {
                    c2308b = null;
                }
                if (c2308b != null) {
                    c2308b = c2308b2;
                    ((ViewGroup.MarginLayoutParams) c2308b).width = iM27313a;
                    ((ViewGroup.MarginLayoutParams) c2308b).height = iM27313a;
                    c2308b.setMarginEnd(iM27313a3);
                    layoutParams = c2308b;
                } else {
                    c2308b = c2308b2;
                    layoutParams = ivMenu.getLayoutParams();
                }
                ivMenu.setLayoutParams(layoutParams);
                ivMenu.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                ivMenu.setPadding(iM27313a2, iM27313a2, iM27313a2, iM27313a2);
            }
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
        AbstractC3168w abstractC3168wM14557p = childFragmentManager.m14557p();
        Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
        CommentFragment.Companion companion = CommentFragment.INSTANCE;
        String str = this.postId;
        String value = CommentTopicType.POST.getValue();
        PostSubjectItem postSubjectItem = this.mPostDetailBean;
        long jLongValue = (postSubjectItem == null || (stat = postSubjectItem.getStat()) == null || (commentCount = stat.getCommentCount()) == null) ? 0L : commentCount.longValue();
        String str2 = this.commentId;
        CommentFragment commentFragmentM74039a = companion.m74039a(str, value, jLongValue, (8072 & 8) != 0, (8072 & 16) != 0 ? false : true, (8072 & 32) != 0 ? "" : str2 == null ? "" : str2, this.pageFrom, (8072 & 128) != 0 ? null : null, (8072 & 256) != 0 ? null : null, (8072 & 512) != 0 ? null : null, (8072 & 1024) != 0 ? null : null, (8072 & 2048) != 0 ? null : null, (8072 & 4096) != 0 ? null : null);
        abstractC3168wM14557p.m14813s(R$id.fl_comment_container, commentFragmentM74039a);
        this.commentFragment = commentFragmentM74039a;
        abstractC3168wM14557p.mo14670i();
        CommentFragment commentFragment = this.commentFragment;
        if (commentFragment != null) {
            commentFragment.m74032b1(this.onCommentCountChangedListener);
        }
        C28166o mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (appCompatTextView = mViewBinding2.f86572g) == null) {
            return;
        }
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.fragment.r2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PostDetailFragment.initView$lambda$9(this.f57447a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$6$lambda$3(final PostDetailFragment postDetailFragment, View view) {
        String str;
        String userId;
        User user;
        if (C14557c.f51100a.m65671a(R$drawable.ic_post_negative_feedback, 500L) || (str = postDetailFragment.postId) == null) {
            return;
        }
        PostSubjectItem postSubjectItem = postDetailFragment.mPostDetailBean;
        if (postSubjectItem == null || (user = postSubjectItem.getUser()) == null || (userId = user.getUserId()) == null) {
            userId = "";
        }
        String str2 = userId;
        C16768a.f56378a.m73076l(postDetailFragment.mPostDetailBean, postDetailFragment.getPageName(), postDetailFragment.pageFrom);
        NegativeFeedbackHelper negativeFeedbackHelper = NegativeFeedbackHelper.f56361a;
        Context contextRequireContext = postDetailFragment.requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        InterfaceC3224u viewLifecycleOwner = postDetailFragment.getViewLifecycleOwner();
        Intrinsics.m97801g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        negativeFeedbackHelper.m73022k(str, str2, contextRequireContext, AbstractC3226v.m14968a(viewLifecycleOwner), postDetailFragment.getPageName(), new Function0() { // from class: com.transsion.postdetail.ui.fragment.n2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostDetailFragment.initView$lambda$6$lambda$3$lambda$2(this.f57401a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$6$lambda$3$lambda$2(PostDetailFragment postDetailFragment) {
        postDetailFragment.mNeedDeleteOnExit = true;
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$9(PostDetailFragment postDetailFragment, View view) {
        CommentFragment commentFragment = postDetailFragment.commentFragment;
        if (commentFragment != null) {
            commentFragment.m74034d1(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initViewModel$lambda$26$lambda$23(PostDetailFragment postDetailFragment, PostSubjectItem postSubjectItem) {
        if (postSubjectItem == null) {
            PageStatusFragment.showEmptyView$default(postDetailFragment, false, 1, null);
            return Unit.f75682a;
        }
        postDetailFragment.showContentView();
        postDetailFragment.mPostDetailBean = postSubjectItem;
        postSubjectItem.setTran_ops(postDetailFragment.tranOps);
        postDetailFragment.updatePostDetail();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initViewModel$lambda$26$lambda$25(PostDetailFragment postDetailFragment, String str) {
        if (TextUtils.equals("0", str)) {
            String str2 = postDetailFragment.postId;
            if (str2 != null) {
                C28465b.f87467a.m109954a().m109949e(str2);
            }
            FragmentActivity activity = postDetailFragment.getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else {
            C28951b.a aVar = C28951b.f88586a;
            FragmentActivity activity2 = postDetailFragment.getActivity();
            aVar.m111455e(activity2 != null ? activity2.getString(com.transsion.postdetail.R$string.delete_post_failed) : null);
        }
        return Unit.f75682a;
    }

    private final void loadData() {
        PostDetailItemView postDetailItemView;
        PostSubjectItem postSubjectItem = this.mPostDetailBean;
        if (postSubjectItem != null) {
            if (postSubjectItem != null) {
                postSubjectItem.setTran_ops(this.tranOps);
            }
            updatePostDetail();
            FragmentActivity activity = getActivity();
            Intrinsics.m97800f(activity, "null cannot be cast to non-null type com.transsion.postdetail.ui.activity.PostDetailActivity");
            ((PostDetailActivity) activity).m65398u0();
        } else {
            PostDetailViewModel viewModel = getViewModel();
            String str = this.postId;
            if (str == null) {
                str = "";
            }
            viewModel.m75057x(str);
        }
        C28166o mViewBinding = getMViewBinding();
        if (mViewBinding == null || (postDetailItemView = mViewBinding.f86570e) == null) {
            return;
        }
        postDetailItemView.postDelayed(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.c3
            @Override // java.lang.Runnable
            public final void run() {
                PostDetailFragment.loadData$lambda$12(this.f57303a);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadData$lambda$12(PostDetailFragment postDetailFragment) {
        C28166o mViewBinding;
        AppBarLayout appBarLayout;
        String str = postDetailFragment.commentId;
        if (str == null || str.length() == 0 || (mViewBinding = postDetailFragment.getMViewBinding()) == null || (appBarLayout = mViewBinding.f86567b) == null) {
            return;
        }
        appBarLayout.setExpanded(false, true);
    }

    private final void localLogPause() {
        HashMap mapM96844g;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C24655b logViewConfig = getLogViewConfig();
        long jM96845h = jElapsedRealtime - (logViewConfig != null ? logViewConfig.m96845h() : 0L);
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 == null || (mapM96844g = logViewConfig2.m96844g()) == null) {
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23704a mLoginApi_delegate$lambda$0() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    @JvmStatic
    public static final PostDetailFragment newInstance(String str, boolean z11, String str2, PostSubjectItem postSubjectItem, String str3, String str4) {
        return INSTANCE.m74401a(str, z11, str2, postSubjectItem, str3, str4);
    }

    private final void observeLike() {
        Function1 function1 = new Function1() { // from class: com.transsion.postdetail.ui.fragment.p2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDetailFragment.observeLike$lambda$28(this.f57417a, (LikeEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = LikeEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeLike$lambda$28(PostDetailFragment postDetailFragment, LikeEvent value) {
        Stat stat;
        Stat stat2;
        Long likeCount;
        Stat stat3;
        Stat stat4;
        Long likeCount2;
        Intrinsics.m97802h(value, "value");
        try {
            Result.Companion companion = Result.INSTANCE;
            PostSubjectItem postSubjectItem = postDetailFragment.mPostDetailBean;
            Long lValueOf = null;
            if (!TextUtils.equals(postSubjectItem != null ? postSubjectItem.getPostId() : null, value.getSubjectId())) {
                return Unit.f75682a;
            }
            PostSubjectItem postSubjectItem2 = postDetailFragment.mPostDetailBean;
            if (postSubjectItem2 != null) {
                postSubjectItem2.setHasLike(Boolean.valueOf(value.getLike()));
            }
            if (value.getLike()) {
                PostSubjectItem postSubjectItem3 = postDetailFragment.mPostDetailBean;
                if (postSubjectItem3 != null && (stat3 = postSubjectItem3.getStat()) != null) {
                    PostSubjectItem postSubjectItem4 = postDetailFragment.mPostDetailBean;
                    if (postSubjectItem4 != null && (stat4 = postSubjectItem4.getStat()) != null && (likeCount2 = stat4.getLikeCount()) != null) {
                        lValueOf = Long.valueOf(likeCount2.longValue() + 1);
                    }
                    stat3.setLikeCount(lValueOf);
                }
            } else {
                PostSubjectItem postSubjectItem5 = postDetailFragment.mPostDetailBean;
                if (postSubjectItem5 != null && (stat = postSubjectItem5.getStat()) != null) {
                    PostSubjectItem postSubjectItem6 = postDetailFragment.mPostDetailBean;
                    if (postSubjectItem6 != null && (stat2 = postSubjectItem6.getStat()) != null && (likeCount = stat2.getLikeCount()) != null) {
                        lValueOf = Long.valueOf(likeCount.longValue() - 1);
                    }
                    stat.setLikeCount(lValueOf);
                }
            }
            postDetailFragment.updateOperationViewState();
            Result.m112707constructorimpl(Unit.f75682a);
            return Unit.f75682a;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    private final void onDownloadClick(PostSubjectItem postItem) {
        C16768a.f56378a.m73074i(postItem, getPageName(), this.pageFrom);
        if (Build.VERSION.SDK_INT >= 29) {
            PostSaveHelper.f57808a.m74905b(postItem);
            return;
        }
        Context context = getContext();
        if (context == null) {
            context = Utils.m27275a();
        }
        if (AbstractC2397b.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            Context context2 = getContext();
            if (context2 == null) {
                context2 = Utils.m27275a();
            }
            if (AbstractC2397b.checkSelfPermission(context2, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                PostSaveHelper.f57808a.m74905b(postItem);
                return;
            }
        }
        requestPermission();
    }

    private final void requestPermission() {
        requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, FileHelper.f55226a.m71367l());
    }

    private final void setPTParams(PostSubjectItem item) {
        HashMap mapM96844g;
        HashMap mapM96844g2;
        C24655b logViewConfig;
        HashMap mapM96844g3;
        String mediaType;
        C24655b logViewConfig2;
        HashMap mapM96844g4;
        C24655b logViewConfig3 = getLogViewConfig();
        if (logViewConfig3 != null) {
            logViewConfig3.m96848k(true);
        }
        C24655b logViewConfig4 = getLogViewConfig();
        if (logViewConfig4 != null) {
            logViewConfig4.m96851n(item.getRec_ops());
        }
        String str = "";
        if (!TextUtils.isEmpty(item.getPostId()) && (logViewConfig2 = getLogViewConfig()) != null && (mapM96844g4 = logViewConfig2.m96844g()) != null) {
            String postId = item.getPostId();
            if (postId == null) {
                postId = "";
            }
            mapM96844g4.put("post_id", postId);
        }
        Media media = item.getMedia();
        if (!TextUtils.isEmpty(media != null ? media.getMediaType() : null) && (logViewConfig = getLogViewConfig()) != null && (mapM96844g3 = logViewConfig.m96844g()) != null) {
            Media media2 = item.getMedia();
            if (media2 != null && (mediaType = media2.getMediaType()) != null) {
                str = mediaType;
            }
            mapM96844g3.put("post_media_type", str);
        }
        C24655b logViewConfig5 = getLogViewConfig();
        if (logViewConfig5 != null && (mapM96844g2 = logViewConfig5.m96844g()) != null) {
            Subject subject = item.getSubject();
            mapM96844g2.put("subject_id", subject != null ? subject.getSubjectId() : null);
        }
        C24655b logViewConfig6 = getLogViewConfig();
        if (logViewConfig6 == null || (mapM96844g = logViewConfig6.m96844g()) == null) {
            return;
        }
        Subject subject2 = item.getSubject();
        mapM96844g.put("has_resource", String.valueOf(subject2 != null ? subject2.getHasResource() : null));
    }

    private final void showCommentsDialog() {
        CommentFragment commentFragment = this.commentFragment;
        if (commentFragment != null) {
            commentFragment.m74034d1(null);
        }
        C16768a.f56378a.m73071e(this.mPostDetailBean, getPageName(), this.pageFrom);
    }

    private final void showSettingDialog() {
        String string = Utils.m27275a().getString(com.transsion.ninegridview.R$string.permission_deny_down_tip, "\"" + Utils.m27275a().getString(com.transsion.baseui.R$string.base_app_name) + "\"", "\"" + Utils.m27275a().getString(com.transsion.ninegridview.R$string.system_settings) + "\"");
        Intrinsics.m97801g(string, "getString(...)");
        TRDialog.C13786a c13786aM62288g = new TRDialog.C13786a().m62288g(string);
        String string2 = Utils.m27275a().getString(com.transsion.ninegridview.R$string.cancel);
        Intrinsics.m97801g(string2, "getString(...)");
        TRDialog.C13786a c13786aM62286e = c13786aM62288g.m62286e(string2);
        String string3 = Utils.m27275a().getString(com.transsion.ninegridview.R$string.system_settings);
        Intrinsics.m97801g(string3, "getString(...)");
        c13786aM62286e.m62291j(string3).m62287f(this).m62282a().show(getChildFragmentManager(), "settings");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCommentCount(long commentCount) {
        PostDetailItemView postDetailItemView;
        AppCompatTextView appCompatTextView;
        C28166o mViewBinding = getMViewBinding();
        if (mViewBinding != null && (appCompatTextView = mViewBinding.f86573h) != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            String string = getString(com.transsion.postdetail.R$string.comments);
            Intrinsics.m97801g(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{AbstractC14564j.m65680a(commentCount)}, 1));
            Intrinsics.m97801g(str, "format(...)");
            appCompatTextView.setText(str);
        }
        C28166o mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (postDetailItemView = mViewBinding2.f86570e) == null) {
            return;
        }
        postDetailItemView.setCommentCount(commentCount);
    }

    private final void updateOperationViewState() {
        C28166o mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            mViewBinding.f86570e.setOnNegativeFeedbackClick(new Function0() { // from class: com.transsion.postdetail.ui.fragment.s2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PostDetailFragment.updateOperationViewState$lambda$37$lambda$29(this.f57453a);
                }
            });
            PostBaseItemView.setBottomBarClick$default(mViewBinding.f86570e, this.mPostDetailBean, new Function0() { // from class: com.transsion.postdetail.ui.fragment.t2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PostDetailFragment.updateOperationViewState$lambda$37$lambda$30(this.f57461a);
                }
            }, new Function0() { // from class: com.transsion.postdetail.ui.fragment.u2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PostDetailFragment.updateOperationViewState$lambda$37$lambda$31(this.f57467a);
                }
            }, new Function0() { // from class: com.transsion.postdetail.ui.fragment.v2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PostDetailFragment.updateOperationViewState$lambda$37$lambda$32(this.f57475a);
                }
            }, new Function0() { // from class: com.transsion.postdetail.ui.fragment.w2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PostDetailFragment.updateOperationViewState$lambda$37$lambda$33(this.f57482a);
                }
            }, new Function0() { // from class: com.transsion.postdetail.ui.fragment.x2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PostDetailFragment.updateOperationViewState$lambda$37$lambda$34(this.f57492a);
                }
            }, new Function0() { // from class: com.transsion.postdetail.ui.fragment.z2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PostDetailFragment.updateOperationViewState$lambda$37$lambda$35(this.f57503a);
                }
            }, new Function0() { // from class: com.transsion.postdetail.ui.fragment.a3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PostDetailFragment.updateOperationViewState$lambda$37$lambda$36(this.f57286a);
                }
            }, null, 256, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateOperationViewState$lambda$37$lambda$29(PostDetailFragment postDetailFragment) {
        C16768a.f56378a.m73076l(postDetailFragment.mPostDetailBean, postDetailFragment.getPageName(), postDetailFragment.pageFrom);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateOperationViewState$lambda$37$lambda$30(PostDetailFragment postDetailFragment) {
        postDetailFragment.clickLike();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateOperationViewState$lambda$37$lambda$31(PostDetailFragment postDetailFragment) {
        postDetailFragment.showCommentsDialog();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateOperationViewState$lambda$37$lambda$32(PostDetailFragment postDetailFragment) {
        postDetailFragment.doShare();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateOperationViewState$lambda$37$lambda$33(PostDetailFragment postDetailFragment) {
        postDetailFragment.openSubjectDetail(postDetailFragment.mPostDetailBean);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateOperationViewState$lambda$37$lambda$34(PostDetailFragment postDetailFragment) {
        postDetailFragment.openRoomDetail(postDetailFragment.mPostDetailBean);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateOperationViewState$lambda$37$lambda$35(PostDetailFragment postDetailFragment) {
        postDetailFragment.onDownloadClick(postDetailFragment.mPostDetailBean);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateOperationViewState$lambda$37$lambda$36(PostDetailFragment postDetailFragment) {
        postDetailFragment.openUserCenter(postDetailFragment.mPostDetailBean);
        return Unit.f75682a;
    }

    private final void updatePostDetail() {
        PostDetailItemView postDetailItemView;
        Long commentCount;
        PostSubjectItem postSubjectItem = this.mPostDetailBean;
        if (postSubjectItem != null) {
            C28166o mViewBinding = getMViewBinding();
            if (mViewBinding != null) {
                CommentFragment commentFragment = this.commentFragment;
                if (commentFragment != null) {
                    Stat stat = postSubjectItem.getStat();
                    commentFragment.updateCommentCount((stat == null || (commentCount = stat.getCommentCount()) == null) ? 0L : commentCount.longValue());
                }
                mViewBinding.f86570e.setIsDetail(true);
                mViewBinding.f86570e.setPage(PAGE_NAME, this.pageFrom);
                mViewBinding.f86570e.setOnNegativeFeedbackClick(new Function0() { // from class: com.transsion.postdetail.ui.fragment.y2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PostDetailFragment.updatePostDetail$lambda$22$lambda$21$lambda$13(this.f57499a);
                    }
                });
                mViewBinding.f86570e.setData(postSubjectItem);
                C28166o mViewBinding2 = getMViewBinding();
                if (mViewBinding2 != null && (postDetailItemView = mViewBinding2.f86570e) != null) {
                    PostBaseItemView.setBottomBarClick$default(postDetailItemView, this.mPostDetailBean, new Function0() { // from class: com.transsion.postdetail.ui.fragment.d3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostDetailFragment.updatePostDetail$lambda$22$lambda$21$lambda$14(this.f57313a);
                        }
                    }, new Function0() { // from class: com.transsion.postdetail.ui.fragment.e3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostDetailFragment.updatePostDetail$lambda$22$lambda$21$lambda$15(this.f57321a);
                        }
                    }, new Function0() { // from class: com.transsion.postdetail.ui.fragment.f3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostDetailFragment.updatePostDetail$lambda$22$lambda$21$lambda$16(this.f57328a);
                        }
                    }, new Function0() { // from class: com.transsion.postdetail.ui.fragment.g3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostDetailFragment.updatePostDetail$lambda$22$lambda$21$lambda$17(this.f57354a);
                        }
                    }, new Function0() { // from class: com.transsion.postdetail.ui.fragment.h3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostDetailFragment.updatePostDetail$lambda$22$lambda$21$lambda$18(this.f57362a);
                        }
                    }, new Function0() { // from class: com.transsion.postdetail.ui.fragment.i3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostDetailFragment.updatePostDetail$lambda$22$lambda$21$lambda$19(this.f57369a);
                        }
                    }, new Function0() { // from class: com.transsion.postdetail.ui.fragment.j3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostDetailFragment.updatePostDetail$lambda$22$lambda$21$lambda$20(this.f57376a);
                        }
                    }, null, 256, null);
                }
            }
            setPTParams(postSubjectItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updatePostDetail$lambda$22$lambda$21$lambda$13(PostDetailFragment postDetailFragment) {
        C16768a.f56378a.m73076l(postDetailFragment.mPostDetailBean, postDetailFragment.getPageName(), postDetailFragment.pageFrom);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updatePostDetail$lambda$22$lambda$21$lambda$14(PostDetailFragment postDetailFragment) {
        postDetailFragment.clickLike();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updatePostDetail$lambda$22$lambda$21$lambda$15(PostDetailFragment postDetailFragment) {
        postDetailFragment.showCommentsDialog();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updatePostDetail$lambda$22$lambda$21$lambda$16(PostDetailFragment postDetailFragment) {
        postDetailFragment.doShare();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updatePostDetail$lambda$22$lambda$21$lambda$17(PostDetailFragment postDetailFragment) {
        postDetailFragment.openSubjectDetail(postDetailFragment.mPostDetailBean);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updatePostDetail$lambda$22$lambda$21$lambda$18(PostDetailFragment postDetailFragment) {
        postDetailFragment.openRoomDetail(postDetailFragment.mPostDetailBean);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updatePostDetail$lambda$22$lambda$21$lambda$19(PostDetailFragment postDetailFragment) {
        postDetailFragment.onDownloadClick(postDetailFragment.mPostDetailBean);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updatePostDetail$lambda$22$lambda$21$lambda$20(PostDetailFragment postDetailFragment) {
        postDetailFragment.openUserCenter(postDetailFragment.mPostDetailBean);
        return Unit.f75682a;
    }

    public final String getCommentId() {
        return this.commentId;
    }

    public final PostSubjectItem getMPostDetailBean() {
        return this.mPostDetailBean;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    public final String getPostId() {
        return this.postId;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C28166o getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28166o c28166oM109350c = C28166o.m109350c(inflater);
        Intrinsics.m97801g(c28166oM109350c, "inflate(...)");
        return c28166oM109350c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        HashMap mapM96844g;
        initView();
        loadData();
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
            return;
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        PostDetailViewModel viewModel = getViewModel();
        viewModel.m75048A().m14851j(this, new C17043d(new Function1() { // from class: com.transsion.postdetail.ui.fragment.k3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDetailFragment.initViewModel$lambda$26$lambda$23(this.f57384a, (PostSubjectItem) obj);
            }
        }));
        viewModel.m75054t().m14851j(this, new C17043d(new Function1() { // from class: com.transsion.postdetail.ui.fragment.o2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDetailFragment.initViewModel$lambda$26$lambda$25(this.f57411a, (String) obj);
            }
        }));
        observeLike();
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
    public C24655b newLogViewConfig() {
        return new C24655b(PAGE_NAME, false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        String str;
        super.onDestroy();
        C16316a c16316a = this.mGifPlayerManager;
        if (c16316a != null) {
            c16316a.m71338f();
        }
        if (!this.mNeedDeleteOnExit || (str = this.postId) == null) {
            return;
        }
        C28465b.f87467a.m109954a().m109949e(str);
    }

    @Override // com.p282tn.lib.widget.dialog.TRDialogListener
    public void onLeftButtonClick(TRDialog dialog) {
        Intrinsics.m97802h(dialog, "dialog");
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        localLogPause();
        super.onPause();
        C16316a c16316a = this.mGifPlayerManager;
        if (c16316a != null) {
            c16316a.m71343k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.m97802h(permissions, "permissions");
        Intrinsics.m97802h(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == FileHelper.f55226a.m71367l()) {
            if (grantResults.length > 1 && grantResults[0] == 0 && grantResults[1] == 0) {
                PostSaveHelper.f57808a.m74905b(this.mPostDetailBean);
                return;
            }
            FragmentActivity activity = getActivity();
            Intrinsics.m97800f(activity, "null cannot be cast to non-null type android.app.Activity");
            if (ActivityCompat.m11450j(activity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                return;
            }
            showSettingDialog();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C16316a c16316a = this.mGifPlayerManager;
        if (c16316a != null) {
            c16316a.m71344l();
        }
        String strM73019f = NegativeFeedbackHelper.f56361a.m73019f();
        if (strM73019f == null || !Intrinsics.m97797c(strM73019f, this.postId)) {
            return;
        }
        this.mNeedDeleteOnExit = true;
    }

    @Override // com.p282tn.lib.widget.dialog.TRDialogListener
    public void onRightButtonClick(TRDialog dialog) {
        Intrinsics.m97802h(dialog, "dialog");
        C16323b c16323b = C16323b.f55235a;
        FragmentActivity activity = getActivity();
        Intrinsics.m97800f(activity, "null cannot be cast to non-null type android.app.Activity");
        c16323b.m71374a(activity, 101);
    }

    public final void openRoomDetail(PostSubjectItem item) {
        Group group;
        String groupId;
        String strM100903c = C25636b.f77779b.m100905a().m100903c();
        InterfaceC23415f interfaceC23415f = (InterfaceC23415f) TheRouter.m61774d(InterfaceC23415f.class, new Object[0]);
        if (TextUtils.equals(strM100903c, interfaceC23415f != null ? interfaceC23415f.mo92966d() : null)) {
            requireActivity().finish();
        } else if (item != null && (group = item.getGroup()) != null && (groupId = group.getGroupId()) != null) {
            Navigator.m61845x(TheRouter.m61773c("/room/detail").m61857K("id", groupId), requireContext(), null, 2, null);
        }
        C16768a.f56378a.m73077m(this.mPostDetailBean, getPageName(), this.pageFrom);
    }

    public final void openSubjectDetail(PostSubjectItem item) {
        Subject subject;
        String strM100903c = C25636b.f77779b.m100905a().m100903c();
        InterfaceC16246g interfaceC16246g = (InterfaceC16246g) TheRouter.m61774d(InterfaceC16246g.class, new Object[0]);
        if (TextUtils.equals(strM100903c, interfaceC16246g != null ? interfaceC16246g.mo71007d() : null) || TextUtils.equals(strM100903c, "StreamDetailActivity") || TextUtils.equals(strM100903c, "MusicDetailActivity")) {
            requireActivity().finish();
        } else if (item != null && (subject = item.getSubject()) != null) {
            Navigator navigatorM61773c = TheRouter.m61773c("/movie/detail");
            Integer subjectType = subject.getSubjectType();
            Navigator.m61845x(navigatorM61773c.m61852F("subject_type", subjectType != null ? subjectType.intValue() : SubjectType.MOVIE.getValue()).m61857K("id", subject.getSubjectId()).m61857K("ops", subject.getOps()), requireContext(), null, 2, null);
        }
        C16768a.f56378a.m73068C(this.mPostDetailBean, getPageName(), this.pageFrom);
    }

    public final void openUserCenter(PostSubjectItem item) {
        User user;
        if (item == null || (user = item.getUser()) == null) {
            return;
        }
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(user.getUserId());
        userInfo.setAvatar(user.getAvatar());
        userInfo.setUsername(user.getUsername());
        userInfo.setNickname(user.getNickname());
        Navigator.m61845x(TheRouter.m61773c("/profile/user_profile").m61857K("userId", userInfo.getUserId()), requireContext(), null, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        Serializable serializable;
        super.receiveArguments();
        Bundle arguments = getArguments();
        PostSubjectItem postSubjectItem = null;
        this.postId = arguments != null ? arguments.getString("id") : null;
        Bundle arguments2 = getArguments();
        this.fromComment = arguments2 != null ? arguments2.getBoolean("from_comment") : false;
        Bundle arguments3 = getArguments();
        this.tranOps = arguments3 != null ? arguments3.getString("rec_ops") : null;
        Bundle arguments4 = getArguments();
        this.pageFrom = arguments4 != null ? arguments4.getString(WebConstants.PAGE_FROM) : null;
        Bundle arguments5 = getArguments();
        this.commentId = arguments5 != null ? arguments5.getString("comment_id") : null;
        Bundle arguments6 = getArguments();
        if (arguments6 != null && (serializable = arguments6.getSerializable("item_object")) != null) {
            postSubjectItem = (PostSubjectItem) serializable;
        }
        this.mPostDetailBean = postSubjectItem;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }

    public final void setCommentId(String str) {
        this.commentId = str;
    }

    public final void setMPostDetailBean(PostSubjectItem postSubjectItem) {
        this.mPostDetailBean = postSubjectItem;
    }

    public final void setPostId(String str) {
        this.postId = str;
    }
}
