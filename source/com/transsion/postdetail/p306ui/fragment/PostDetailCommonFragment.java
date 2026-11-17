package com.transsion.postdetail.p306ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.AbstractC3168w;
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
import com.p282tn.lib.view.expand.ExpandView;
import com.p282tn.lib.widget.R$color;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baseui.R$drawable;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.AbstractC14566l;
import com.transsion.baseui.util.C14557c;
import com.transsion.baseui.util.C14569o;
import com.transsion.moviedetailapi.InterfaceC16246g;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Audio;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.moviedetailapi.bean.Link;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.Stat;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.User;
import com.transsion.ninegridview.C16316a;
import com.transsion.ninegridview.video.NineGridVideoView;
import com.transsion.ninegridview.video.NineGridVideoViewAdapter;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.helper.C16768a;
import com.transsion.postdetail.p306ui.dialog.ImmVideoCommentDialog;
import com.transsion.postdetail.p306ui.view.PostDetailOperationView;
import com.transsion.postdetail.util.AbstractC17443m;
import com.transsion.postdetail.viewmodel.PostDetailViewModel;
import com.transsion.share.bean.PostType;
import com.transsion.share.share.InterfaceC18701a;
import com.transsion.share.share.ShareDialogFragment;
import com.transsion.usercenterapi.ReportType;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.DownloadManagerApi;
import com.transsnet.downloader.widget.DownloadView;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.AddToDownloadEvent;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C25220y0;
import ng.AbstractC26006c;
import okhttp3.internal.http2.Settings;
import p441gz.InterfaceC23704a;
import p462hj.C23860f;
import p550kj.C24655b;
import p577lh.C25636b;
import p743rh.C27287m;
import p815un.AbstractC28027b;
import p815un.C28026a;
import p844vo.C28159k0;
import p844vo.C28161l0;
import p844vo.C28163m0;
import p844vo.C28164n;
import p888wy.C28465b;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 l2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u001b\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0013\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010%\u001a\u00020\u0005H\u0002¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\u0005H\u0002¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\u0005H\u0002¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010\u0004J\u0017\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020\u0005H\u0016¢\u0006\u0004\b2\u0010\u0004J\u000f\u00103\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u0010\u0004J\u000f\u00104\u001a\u00020\u0005H\u0016¢\u0006\u0004\b4\u0010\u0004J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000fH&¢\u0006\u0004\b8\u0010.J\u000f\u00109\u001a\u00020\u0005H\u0016¢\u0006\u0004\b9\u0010\u0004J\u000f\u0010:\u001a\u00020\u0005H&¢\u0006\u0004\b:\u0010\u0004J\u000f\u0010;\u001a\u00020\u0005H&¢\u0006\u0004\b;\u0010\u0004J\u000f\u0010<\u001a\u00020\u0005H&¢\u0006\u0004\b<\u0010\u0004J\u000f\u0010=\u001a\u00020\u0005H\u0016¢\u0006\u0004\b=\u0010\u0004J\u000f\u0010>\u001a\u00020\u0005H\u0016¢\u0006\u0004\b>\u0010\u0004J\u000f\u0010?\u001a\u00020\u0005H\u0016¢\u0006\u0004\b?\u0010\u0004R\u0018\u0010B\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR$\u0010G\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010A\u001a\u0004\bD\u0010.\"\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR$\u0010P\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010 R\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u001b\u0010Z\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR$\u0010b\u001a\u0004\u0018\u00010[8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001d\u0010g\u001a\u0004\u0018\u00010c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010W\u001a\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006m"}, m97100d2 = {"Lcom/transsion/postdetail/ui/fragment/PostDetailCommonFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lvo/n;", "<init>", "()V", "", "C0", "L0", "Z0", "loadData", "updatePostDetail", "", "hasResource", "a1", "(Ljava/lang/Boolean;)V", "", CampaignEx.JSON_KEY_TITLE, "content", "link", "V0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "subjectRate", "Y0", "(Ljava/lang/Integer;)V", "Lcom/transsion/moviedetailapi/bean/Media;", "media", "T0", "(Lcom/transsion/moviedetailapi/bean/Media;)V", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", WebConstants.FIELD_ITEM, "setPTParams", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "initPlayer", "observeLike", "O0", "clickLike", "showCommentsDialog", "doShare", "clickDownload", "receiveArguments", "Landroid/view/LayoutInflater;", "inflater", "E0", "(Landroid/view/LayoutInflater;)Lvo/n;", "getPageStateLayoutTitle", "()Ljava/lang/String;", "isAudioShowNoNetworkLayout", "()Z", "isMonitorNetworkState", "initViewData", "initViewModel", "initListener", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "getPageName", "retryLoadData", "G0", "initAudioListener", "F0", "onResume", "onPause", "onDestroy", "a", "Ljava/lang/String;", "tranOps", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "getPostId", "setPostId", "(Ljava/lang/String;)V", "postId", "c", "Z", "fromComment", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "getMPostDetailBean", "()Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "setMPostDetailBean", "mPostDetailBean", "Lcom/transsion/postdetail/ui/fragment/PostRecommendFragment;", "e", "Lcom/transsion/postdetail/ui/fragment/PostRecommendFragment;", "mPostRecommendFragment", "Lcom/transsion/postdetail/viewmodel/PostDetailViewModel;", "f", "Lkotlin/Lazy;", "getViewModel", "()Lcom/transsion/postdetail/viewmodel/PostDetailViewModel;", "viewModel", "Lcom/transsnet/downloader/widget/DownloadView;", "g", "Lcom/transsnet/downloader/widget/DownloadView;", "getDownloadViewFloat", "()Lcom/transsnet/downloader/widget/DownloadView;", "setDownloadViewFloat", "(Lcom/transsnet/downloader/widget/DownloadView;)V", "downloadViewFloat", "Lgz/a;", "h", "getMLoginApi", "()Lgz/a;", "mLoginApi", "Lcom/transsion/ninegridview/a;", "i", "Lcom/transsion/ninegridview/a;", "mGifPlayerManager", "j", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public abstract class PostDetailCommonFragment extends PageStatusFragment<C28164n> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String tranOps;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String postId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean fromComment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private PostSubjectItem mPostDetailBean;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private PostRecommendFragment mPostRecommendFragment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private DownloadView downloadViewFloat;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Lazy mLoginApi;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private C16316a mGifPlayerManager;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.PostDetailCommonFragment$b */
    public static final class C17037b implements InterfaceC18701a {
        C17037b() {
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: a */
        public void mo70521a(String id2, PostType postType) {
            Intrinsics.m97802h(id2, "id");
            PostDetailCommonFragment.this.getViewModel().m75053r(id2);
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

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.PostDetailCommonFragment$c */
    static final class C17038c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f57222a;

        C17038c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f57222a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f57222a;
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
            this.f57222a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.PostDetailCommonFragment$d */
    public static final class C17039d implements CommentFragment.InterfaceC17008b {
        C17039d() {
        }

        @Override // com.transsion.postdetail.p306ui.fragment.CommentFragment.InterfaceC17008b
        /* JADX INFO: renamed from: a */
        public void mo74040a(long j11) {
            Stat stat;
            Stat stat2;
            Long commentCount;
            PostSubjectItem mPostDetailBean = PostDetailCommonFragment.this.getMPostDetailBean();
            if (mPostDetailBean == null || (stat2 = mPostDetailBean.getStat()) == null || (commentCount = stat2.getCommentCount()) == null || commentCount.longValue() != j11) {
                PostSubjectItem mPostDetailBean2 = PostDetailCommonFragment.this.getMPostDetailBean();
                if (mPostDetailBean2 != null && (stat = mPostDetailBean2.getStat()) != null) {
                    stat.setCommentCount(Long.valueOf(j11));
                }
                PostDetailCommonFragment.this.m74344O0();
            }
        }
    }

    public PostDetailCommonFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.postdetail.ui.fragment.PostDetailCommonFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.viewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(PostDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.postdetail.ui.fragment.PostDetailCommonFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.postdetail.ui.fragment.PostDetailCommonFragment$special$$inlined$viewModels$default$3
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
        this.mLoginApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.g2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostDetailCommonFragment.mLoginApi_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    private final void m74335C0() {
        Subject subject;
        ConstraintLayout root;
        Context context = getContext();
        Boolean hasResource = null;
        DownloadView downloadView = context != null ? new DownloadView(context) : null;
        this.downloadViewFloat = downloadView;
        if (downloadView != null) {
            downloadView.setPageFrom(getPageName());
        }
        DownloadView downloadView2 = this.downloadViewFloat;
        if (downloadView2 != null) {
            DownloadView.setAttrs$default(downloadView2, null, Float.valueOf(AbstractC5776a0.m27316d(16.0f)), null, 5, null);
        }
        DownloadView downloadView3 = this.downloadViewFloat;
        if (downloadView3 != null) {
            Context context2 = getContext();
            downloadView3.setBackground(context2 != null ? AbstractC2397b.getDrawable(context2, R$drawable.bg_btn_radius_20) : null);
        }
        ConstraintLayout.C2308b c2308b = new ConstraintLayout.C2308b(AbstractC5776a0.m27313a(140.0f), AbstractC5776a0.m27313a(40.0f));
        int i11 = R$id.cl_container;
        c2308b.f7974l = i11;
        c2308b.f7990t = i11;
        c2308b.f7994v = i11;
        c2308b.setMargins(0, 0, 0, AbstractC5776a0.m27313a(48.0f));
        C28164n mViewBinding = getMViewBinding();
        if (mViewBinding != null && (root = mViewBinding.getRoot()) != null) {
            root.addView(this.downloadViewFloat, -1, c2308b);
        }
        DownloadView downloadView4 = this.downloadViewFloat;
        if (downloadView4 != null) {
            downloadView4.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.fragment.h2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PostDetailCommonFragment.m74336D0(this.f57361a, view);
                }
            });
        }
        PostSubjectItem postSubjectItem = this.mPostDetailBean;
        if (postSubjectItem != null && (subject = postSubjectItem.getSubject()) != null) {
            hasResource = subject.getHasResource();
        }
        m74356a1(hasResource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m74336D0(PostDetailCommonFragment postDetailCommonFragment, View view) {
        String resourceLink;
        User user;
        Subject subject;
        ResourceDetectors resourceDetector;
        Group group;
        Subject subject2;
        String subjectId;
        Subject subject3;
        Subject subject4;
        ResourceDetectors resourceDetector2;
        Subject subject5;
        DownloadManagerApi.C21276a c21276a = DownloadManagerApi.f66480j;
        DownloadManagerApi downloadManagerApiM87093a = c21276a.m87093a();
        PostSubjectItem postSubjectItem = postDetailCommonFragment.mPostDetailBean;
        String nickname = null;
        String subjectId2 = (postSubjectItem == null || (subject5 = postSubjectItem.getSubject()) == null) ? null : subject5.getSubjectId();
        PostSubjectItem postSubjectItem2 = postDetailCommonFragment.mPostDetailBean;
        String resourceId = (postSubjectItem2 == null || (subject4 = postSubjectItem2.getSubject()) == null || (resourceDetector2 = subject4.getResourceDetector()) == null) ? null : resourceDetector2.getResourceId();
        PostSubjectItem postSubjectItem3 = postDetailCommonFragment.mPostDetailBean;
        if (DownloadManagerApi.m87075x0(downloadManagerApiM87093a, subjectId2, resourceId, (postSubjectItem3 == null || (subject3 = postSubjectItem3.getSubject()) == null) ? false : subject3.isSeries(), false, 8, null)) {
            PostSubjectItem postSubjectItem4 = postDetailCommonFragment.mPostDetailBean;
            if (postSubjectItem4 == null || (subject2 = postSubjectItem4.getSubject()) == null || (subjectId = subject2.getSubjectId()) == null) {
                return;
            }
            DownloadManagerApi downloadManagerApiM87093a2 = c21276a.m87093a();
            Context context = postDetailCommonFragment.getContext();
            Intrinsics.m97799e(context);
            DownloadManagerApi.m87078z0(downloadManagerApiM87093a2, subjectId, context, postDetailCommonFragment.getPageName(), null, 8, null);
            return;
        }
        DownloadManagerApi downloadManagerApiM87093a3 = c21276a.m87093a();
        Context context2 = postDetailCommonFragment.getContext();
        Intrinsics.m97800f(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = (FragmentActivity) context2;
        PostSubjectItem postSubjectItem5 = postDetailCommonFragment.mPostDetailBean;
        Subject subject6 = postSubjectItem5 != null ? postSubjectItem5.getSubject() : null;
        String pageName = postDetailCommonFragment.getPageName();
        PostSubjectItem postSubjectItem6 = postDetailCommonFragment.mPostDetailBean;
        String groupId = (postSubjectItem6 == null || (group = postSubjectItem6.getGroup()) == null) ? null : group.getGroupId();
        PostSubjectItem postSubjectItem7 = postDetailCommonFragment.mPostDetailBean;
        String ops = postSubjectItem7 != null ? postSubjectItem7.getOps() : null;
        PostSubjectItem postSubjectItem8 = postDetailCommonFragment.mPostDetailBean;
        if (postSubjectItem8 == null || (subject = postSubjectItem8.getSubject()) == null || (resourceDetector = subject.getResourceDetector()) == null || (resourceLink = resourceDetector.getResourceLink()) == null) {
            resourceLink = "";
        }
        String str = resourceLink;
        PostSubjectItem postSubjectItem9 = postDetailCommonFragment.mPostDetailBean;
        if (postSubjectItem9 != null && (user = postSubjectItem9.getUser()) != null) {
            nickname = user.getNickname();
        }
        downloadManagerApiM87093a3.m87080K(fragmentActivity, subject6, pageName, (960 & 8) != 0 ? "" : groupId, ops, str, (960 & 64) != 0 ? "" : null, (960 & 128) != 0 ? null : null, (960 & 256) != 0 ? null : nickname, (960 & 512) != 0 ? false : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final void m74337H0(PostDetailCommonFragment postDetailCommonFragment, View view) {
        FragmentActivity activity = postDetailCommonFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final void m74338I0(PostDetailCommonFragment postDetailCommonFragment, View view) {
        User user;
        if (C14557c.f51100a.m65671a(view.getId(), 2000L)) {
            return;
        }
        Navigator navigatorM61773c = TheRouter.m61773c("/profile/user_profile");
        PostSubjectItem postSubjectItem = postDetailCommonFragment.mPostDetailBean;
        Navigator.m61845x(navigatorM61773c.m61857K("userId", (postSubjectItem == null || (user = postSubjectItem.getUser()) == null) ? null : user.getUserId()), postDetailCommonFragment.requireContext(), null, 2, null);
        C16768a.m73057d(C16768a.f56378a, postDetailCommonFragment.mPostDetailBean, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final Unit m74339J0(PostDetailCommonFragment postDetailCommonFragment, PostSubjectItem postSubjectItem) {
        if (postSubjectItem == null) {
            PageStatusFragment.showEmptyView$default(postDetailCommonFragment, false, 1, null);
            return Unit.f75682a;
        }
        postDetailCommonFragment.showContentView();
        postDetailCommonFragment.mPostDetailBean = postSubjectItem;
        postSubjectItem.setTran_ops(postDetailCommonFragment.tranOps);
        postDetailCommonFragment.updatePostDetail();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final Unit m74340K0(PostDetailCommonFragment postDetailCommonFragment, String str) {
        if (TextUtils.equals("0", str)) {
            String str2 = postDetailCommonFragment.postId;
            if (str2 != null) {
                C28465b.f87467a.m109954a().m109949e(str2);
            }
            FragmentActivity activity = postDetailCommonFragment.getActivity();
            if (activity != null) {
                activity.finish();
            }
        } else {
            C28951b.a aVar = C28951b.f88586a;
            FragmentActivity activity2 = postDetailCommonFragment.getActivity();
            aVar.m111455e(activity2 != null ? activity2.getString(R$string.delete_post_failed) : null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: L0 */
    private final void m74341L0() {
        Context context = getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        Function1 function1 = new Function1() { // from class: com.transsion.postdetail.ui.fragment.w1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDetailCommonFragment.m74342M0(this.f57481a, (AddToDownloadEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = AddToDownloadEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent((AppCompatActivity) context, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final Unit m74342M0(PostDetailCommonFragment postDetailCommonFragment, AddToDownloadEvent value) {
        Subject subject;
        Subject subject2;
        Intrinsics.m97802h(value, "value");
        try {
            String subjectId = value.getSubjectId();
            PostSubjectItem postSubjectItem = postDetailCommonFragment.mPostDetailBean;
            if (!TextUtils.equals(subjectId, (postSubjectItem == null || (subject2 = postSubjectItem.getSubject()) == null) ? null : subject2.getSubjectId())) {
                return Unit.f75682a;
            }
            PostSubjectItem postSubjectItem2 = postDetailCommonFragment.mPostDetailBean;
            postDetailCommonFragment.m74356a1((postSubjectItem2 == null || (subject = postSubjectItem2.getSubject()) == null) ? null : subject.getHasResource());
            return Unit.f75682a;
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final Unit m74343N0(PostDetailCommonFragment postDetailCommonFragment, LikeEvent value) {
        Stat stat;
        Stat stat2;
        Long likeCount;
        Stat stat3;
        Stat stat4;
        Long likeCount2;
        Intrinsics.m97802h(value, "value");
        try {
            Result.Companion companion = Result.INSTANCE;
            PostSubjectItem postSubjectItem = postDetailCommonFragment.mPostDetailBean;
            Long lValueOf = null;
            if (!TextUtils.equals(postSubjectItem != null ? postSubjectItem.getPostId() : null, value.getSubjectId())) {
                return Unit.f75682a;
            }
            PostSubjectItem postSubjectItem2 = postDetailCommonFragment.mPostDetailBean;
            if (postSubjectItem2 != null) {
                postSubjectItem2.setHasLike(Boolean.valueOf(value.getLike()));
            }
            if (value.getLike()) {
                PostSubjectItem postSubjectItem3 = postDetailCommonFragment.mPostDetailBean;
                if (postSubjectItem3 != null && (stat3 = postSubjectItem3.getStat()) != null) {
                    PostSubjectItem postSubjectItem4 = postDetailCommonFragment.mPostDetailBean;
                    if (postSubjectItem4 != null && (stat4 = postSubjectItem4.getStat()) != null && (likeCount2 = stat4.getLikeCount()) != null) {
                        lValueOf = Long.valueOf(likeCount2.longValue() + 1);
                    }
                    stat3.setLikeCount(lValueOf);
                }
            } else {
                PostSubjectItem postSubjectItem5 = postDetailCommonFragment.mPostDetailBean;
                if (postSubjectItem5 != null && (stat = postSubjectItem5.getStat()) != null) {
                    PostSubjectItem postSubjectItem6 = postDetailCommonFragment.mPostDetailBean;
                    if (postSubjectItem6 != null && (stat2 = postSubjectItem6.getStat()) != null && (likeCount = stat2.getLikeCount()) != null) {
                        lValueOf = Long.valueOf(likeCount.longValue() - 1);
                    }
                    stat.setLikeCount(lValueOf);
                }
            }
            postDetailCommonFragment.m74344O0();
            Result.m112707constructorimpl(Unit.f75682a);
            return Unit.f75682a;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public final void m74344O0() {
        PostDetailOperationView postDetailOperationView;
        C28164n mViewBinding = getMViewBinding();
        if (mViewBinding == null || (postDetailOperationView = mViewBinding.f86554s) == null) {
            return;
        }
        postDetailOperationView.showData(this.mPostDetailBean, new Function0() { // from class: com.transsion.postdetail.ui.fragment.z1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostDetailCommonFragment.m74345P0(this.f57502a);
            }
        }, new Function0() { // from class: com.transsion.postdetail.ui.fragment.a2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostDetailCommonFragment.m74346Q0(this.f57285a);
            }
        }, new Function0() { // from class: com.transsion.postdetail.ui.fragment.b2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostDetailCommonFragment.m74347R0(this.f57293a);
            }
        }, new Function0() { // from class: com.transsion.postdetail.ui.fragment.c2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostDetailCommonFragment.m74348S0(this.f57302a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final Unit m74345P0(PostDetailCommonFragment postDetailCommonFragment) {
        postDetailCommonFragment.clickLike();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final Unit m74346Q0(PostDetailCommonFragment postDetailCommonFragment) {
        postDetailCommonFragment.showCommentsDialog();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final Unit m74347R0(PostDetailCommonFragment postDetailCommonFragment) {
        postDetailCommonFragment.doShare();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final Unit m74348S0(PostDetailCommonFragment postDetailCommonFragment) {
        postDetailCommonFragment.clickDownload();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: T0 */
    private final void m74349T0(Media media) {
        NineGridVideoView nineGridVideoView;
        C28164n mViewBinding = getMViewBinding();
        if (mViewBinding == null || (nineGridVideoView = mViewBinding.f86553r) == null) {
            return;
        }
        if ((media != null ? media.getImage() : null) == null) {
            AbstractC26006c.m102054g(nineGridVideoView);
        } else {
            List<Image> image = media.getImage();
            if (image != null) {
                nineGridVideoView.setAdapter(new NineGridVideoViewAdapter(image));
                nineGridVideoView.loadImage();
            }
            AbstractC26006c.m102058k(nineGridVideoView);
        }
        if (AbstractC28027b.m108986a(media)) {
            nineGridVideoView.post(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.m2
                @Override // java.lang.Runnable
                public final void run() {
                    PostDetailCommonFragment.m74350U0(this.f57395a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final void m74350U0(PostDetailCommonFragment postDetailCommonFragment) {
        postDetailCommonFragment.initPlayer();
    }

    /* JADX INFO: renamed from: V0 */
    private final void m74351V0(String title, final String content, final String link) {
        final C28159k0 c28159k0;
        C28163m0 c28163m0;
        C28164n mViewBinding = getMViewBinding();
        if (mViewBinding != null && (c28163m0 = mViewBinding.f86560y) != null) {
            if (TextUtils.isEmpty(title)) {
                AppCompatTextView tvPostTitle = c28163m0.f86532b;
                Intrinsics.m97801g(tvPostTitle, "tvPostTitle");
                AbstractC26006c.m102054g(tvPostTitle);
            } else {
                AppCompatTextView tvPostTitle2 = c28163m0.f86532b;
                Intrinsics.m97801g(tvPostTitle2, "tvPostTitle");
                AbstractC26006c.m102058k(tvPostTitle2);
                c28163m0.f86532b.setText(title);
            }
        }
        C28164n mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (c28159k0 = mViewBinding2.f86558w) == null) {
            return;
        }
        c28159k0.f86510b.post(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.x1
            @Override // java.lang.Runnable
            public final void run() {
                PostDetailCommonFragment.m74352W0(content, c28159k0, link, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final void m74352W0(String str, C28159k0 c28159k0, String str2, final PostDetailCommonFragment postDetailCommonFragment) {
        Subject subject;
        String subjectId;
        if (TextUtils.isEmpty(str)) {
            ExpandView tvPostDesc = c28159k0.f86510b;
            Intrinsics.m97801g(tvPostDesc, "tvPostDesc");
            AbstractC26006c.m102054g(tvPostDesc);
            return;
        }
        ExpandView expandView = c28159k0.f86510b;
        Intrinsics.m97799e(expandView);
        AbstractC26006c.m102058k(expandView);
        if (!TextUtils.isEmpty(str2)) {
            str = str + "\n" + (str2 != null ? StringsKt.m98236Q(str2, " ", "%20", false, 4, null) : null);
        }
        PostSubjectItem postSubjectItem = postDetailCommonFragment.mPostDetailBean;
        final boolean z11 = false;
        if (postSubjectItem != null && (subject = postSubjectItem.getSubject()) != null && (subjectId = subject.getSubjectId()) != null && subjectId.length() > 0) {
            z11 = true;
        }
        AbstractC14566l.m65691f(expandView, str, !z11, new Function2() { // from class: com.transsion.postdetail.ui.fragment.d2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PostDetailCommonFragment.m74353X0(z11, postDetailCommonFragment, (View) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final Unit m74353X0(boolean z11, PostDetailCommonFragment postDetailCommonFragment, View view, String str) {
        String resourceLink;
        User user;
        Subject subject;
        ResourceDetectors resourceDetector;
        if (z11) {
            DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
            FragmentActivity fragmentActivityRequireActivity = postDetailCommonFragment.requireActivity();
            Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
            PostSubjectItem postSubjectItem = postDetailCommonFragment.mPostDetailBean;
            Subject subject2 = postSubjectItem != null ? postSubjectItem.getSubject() : null;
            Intrinsics.m97799e(str);
            String str2 = postDetailCommonFragment.tranOps;
            PostSubjectItem postSubjectItem2 = postDetailCommonFragment.mPostDetailBean;
            if (postSubjectItem2 == null || (subject = postSubjectItem2.getSubject()) == null || (resourceDetector = subject.getResourceDetector()) == null || (resourceLink = resourceDetector.getResourceLink()) == null) {
                resourceLink = "";
            }
            String str3 = resourceLink;
            PostSubjectItem postSubjectItem3 = postDetailCommonFragment.mPostDetailBean;
            downloadManagerApiM87093a.m87084U(fragmentActivityRequireActivity, subject2, str, "postdetail", str2, str3, (postSubjectItem3 == null || (user = postSubjectItem3.getUser()) == null) ? null : user.getNickname());
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: Y0 */
    private final void m74354Y0(Integer subjectRate) {
        C28161l0 c28161l0;
        C28164n mViewBinding = getMViewBinding();
        if (mViewBinding == null || (c28161l0 = mViewBinding.f86544i) == null) {
            return;
        }
        if ((subjectRate != null ? subjectRate.intValue() : 0) <= 0) {
            ConstraintLayout clRating = c28161l0.f86515b;
            Intrinsics.m97801g(clRating, "clRating");
            AbstractC26006c.m102054g(clRating);
            return;
        }
        ConstraintLayout clRating2 = c28161l0.f86515b;
        Intrinsics.m97801g(clRating2, "clRating");
        AbstractC26006c.m102058k(clRating2);
        StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
        String string = getString(R$string.score);
        Intrinsics.m97801g(string, "getString(...)");
        String str = String.format(string, Arrays.copyOf(new Object[]{subjectRate}, 1));
        Intrinsics.m97801g(str, "format(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int length = String.valueOf(subjectRate).length();
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(16, true), 0, length, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(AbstractC2397b.getColor(requireActivity(), R$color.color_ffaa33)), 0, length, 17);
        c28161l0.f86517d.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m74355Z0() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
        AbstractC3168w abstractC3168wM14557p = childFragmentManager.m14557p();
        Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
        PostRecommendFragment postRecommendFragmentM74422a = PostRecommendFragment.INSTANCE.m74422a(this.postId);
        abstractC3168wM14557p.m14813s(R$id.flContainer, postRecommendFragmentM74422a);
        this.mPostRecommendFragment = postRecommendFragmentM74422a;
        abstractC3168wM14557p.mo14671j();
    }

    /* JADX INFO: renamed from: a1 */
    private final void m74356a1(Boolean hasResource) {
        HashMap mapM96844g;
        Subject subject;
        Subject subject2;
        ResourceDetectors resourceDetector;
        Subject subject3;
        if (Intrinsics.m97797c(hasResource, Boolean.TRUE)) {
            DownloadView downloadView = this.downloadViewFloat;
            if (downloadView != null) {
                downloadView.setVisibility(0);
            }
        } else {
            DownloadView downloadView2 = this.downloadViewFloat;
            if (downloadView2 != null) {
                downloadView2.setVisibility(8);
            }
        }
        DownloadView downloadView3 = this.downloadViewFloat;
        if (downloadView3 != null) {
            PostSubjectItem postSubjectItem = this.mPostDetailBean;
            String subjectId = (postSubjectItem == null || (subject3 = postSubjectItem.getSubject()) == null) ? null : subject3.getSubjectId();
            PostSubjectItem postSubjectItem2 = this.mPostDetailBean;
            String resourceId = (postSubjectItem2 == null || (subject2 = postSubjectItem2.getSubject()) == null || (resourceDetector = subject2.getResourceDetector()) == null) ? null : resourceDetector.getResourceId();
            PostSubjectItem postSubjectItem3 = this.mPostDetailBean;
            DownloadView.setShowType$default(downloadView3, subjectId, resourceId, (postSubjectItem3 == null || (subject = postSubjectItem3.getSubject()) == null) ? null : Boolean.valueOf(subject.isSeries()), false, 0, 24, null);
        }
        DownloadView downloadView4 = this.downloadViewFloat;
        String str = (downloadView4 == null || downloadView4.getCom.cloud.tmc.kernel.minicover.NativeComponentConstants.KEY_COMPONENT_TYPE java.lang.String() != 1) ? "download_subject" : "play_subject";
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final void m74357b1(PostDetailCommonFragment postDetailCommonFragment, View view) {
        Group group;
        Navigator navigatorM61773c = TheRouter.m61773c("/room/detail");
        PostSubjectItem postSubjectItem = postDetailCommonFragment.mPostDetailBean;
        Navigator.m61845x(navigatorM61773c.m61857K("id", (postSubjectItem == null || (group = postSubjectItem.getGroup()) == null) ? null : group.getGroupId()), postDetailCommonFragment.requireContext(), null, 2, null);
        C16768a.m73060n(C16768a.f56378a, postDetailCommonFragment.mPostDetailBean, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final Unit m74358c1(PostDetailCommonFragment postDetailCommonFragment) {
        Subject subject;
        String subjectId;
        Subject subject2;
        Integer subjectType;
        String strM100903c = C25636b.f77779b.m100905a().m100903c();
        InterfaceC16246g interfaceC16246g = (InterfaceC16246g) TheRouter.m61774d(InterfaceC16246g.class, new Object[0]);
        if (TextUtils.equals(strM100903c, interfaceC16246g != null ? interfaceC16246g.mo71007d() : null)) {
            postDetailCommonFragment.requireActivity().finish();
        } else {
            PostSubjectItem postSubjectItem = postDetailCommonFragment.mPostDetailBean;
            if (postSubjectItem != null && (subject = postSubjectItem.getSubject()) != null && (subjectId = subject.getSubjectId()) != null) {
                Navigator navigatorM61773c = TheRouter.m61773c("/movie/detail");
                PostSubjectItem postSubjectItem2 = postDetailCommonFragment.mPostDetailBean;
                Navigator navigatorM61857K = navigatorM61773c.m61852F("subject_type", (postSubjectItem2 == null || (subject2 = postSubjectItem2.getSubject()) == null || (subjectType = subject2.getSubjectType()) == null) ? SubjectType.MOVIE.getValue() : subjectType.intValue()).m61857K("id", subjectId);
                PostSubjectItem postSubjectItem3 = postDetailCommonFragment.mPostDetailBean;
                Navigator.m61845x(navigatorM61857K.m61857K("ops", postSubjectItem3 != null ? postSubjectItem3.getOps() : null), postDetailCommonFragment.requireContext(), null, 2, null);
            }
            C16768a.m73055D(C16768a.f56378a, postDetailCommonFragment.mPostDetailBean, null, null, 6, null);
        }
        return Unit.f75682a;
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
        C16768a.m73059j(C16768a.f56378a, this.mPostDetailBean, getPageName(), null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.transsion.postdetail.viewmodel.PostDetailViewModel] */
    private final void clickLike() {
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_tips);
            return;
        }
        PostSubjectItem postSubjectItem = this.mPostDetailBean;
        ?? M97797c = postSubjectItem != null ? Intrinsics.m97797c(postSubjectItem.getHasLike(), Boolean.TRUE) : 0;
        ?? viewModel = getViewModel();
        PostSubjectItem postSubjectItem2 = this.mPostDetailBean;
        viewModel.m75052G(postSubjectItem2 != null ? postSubjectItem2.getPostId() : null, M97797c);
        C16768a c16768a = C16768a.f56378a;
        PostSubjectItem postSubjectItem3 = this.mPostDetailBean;
        C16768a.m73061q(c16768a, postSubjectItem3, postSubjectItem3 != null ? Intrinsics.m97797c(postSubjectItem3.getHasLike(), Boolean.TRUE) : false, getPageName(), null, 8, null);
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
        shareDialogFragmentM78645a.m78642G0(new C17037b());
        shareDialogFragmentM78645a.show(getChildFragmentManager(), "share");
        C16768a.m73054B(C16768a.f56378a, this.mPostDetailBean, getPageName(), null, 4, null);
    }

    private final InterfaceC23704a getMLoginApi() {
        return (InterfaceC23704a) this.mLoginApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostDetailViewModel getViewModel() {
        return (PostDetailViewModel) this.viewModel.getValue();
    }

    private final void initPlayer() {
        C16316a c16316a = new C16316a();
        c16316a.m71340h();
        c16316a.m71341i();
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        c16316a.m71342j(contextRequireContext);
        C28026a c28026aM71339g = c16316a.m71339g();
        if (c28026aM71339g != null) {
            c28026aM71339g.m108970a();
        }
        C28026a c28026aM71339g2 = c16316a.m71339g();
        if (c28026aM71339g2 != null) {
            PostSubjectItem postSubjectItem = this.mPostDetailBean;
            C28164n mViewBinding = getMViewBinding();
            c28026aM71339g2.m108981s(postSubjectItem, mViewBinding != null ? mViewBinding.f86553r : null, 0);
        }
        C28026a c28026aM71339g3 = c16316a.m71339g();
        if (c28026aM71339g3 != null) {
            c28026aM71339g3.m108985y(true);
        }
        this.mGifPlayerManager = c16316a;
    }

    private final void loadData() {
        String subjectId;
        PostSubjectItem postSubjectItem = this.mPostDetailBean;
        if (postSubjectItem == null) {
            showLoadingView();
            PostDetailViewModel viewModel = getViewModel();
            String str = this.postId;
            viewModel.m75057x(str != null ? str : "");
            return;
        }
        if (postSubjectItem != null) {
            postSubjectItem.setTran_ops(this.tranOps);
        }
        updatePostDetail();
        Subject subject = postSubjectItem.getSubject();
        if (subject == null || (subjectId = subject.getSubjectId()) == null || subjectId.length() != 0) {
            return;
        }
        PostDetailViewModel viewModel2 = getViewModel();
        String str2 = this.postId;
        viewModel2.m75057x(str2 != null ? str2 : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23704a mLoginApi_delegate$lambda$0() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    private final void observeLike() {
        Function1 function1 = new Function1() { // from class: com.transsion.postdetail.ui.fragment.y1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDetailCommonFragment.m74343N0(this.f57498a, (LikeEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = LikeEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
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
        ImmVideoCommentDialog immVideoCommentDialogM73940b = ImmVideoCommentDialog.Companion.m73940b(ImmVideoCommentDialog.INSTANCE, this.mPostDetailBean, null, null, null, 14, null);
        immVideoCommentDialogM73940b.m73935A0(new C17039d());
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
        immVideoCommentDialogM73940b.show(childFragmentManager, "PostDetailCommentsFragment.TAG_POST_DETAIL_COMMENTS_FRAGMENT");
    }

    private final void updatePostDetail() {
        Subject subject;
        String avatar;
        PostSubjectItem postSubjectItem = this.mPostDetailBean;
        if (postSubjectItem != null) {
            C28164n mViewBinding = getMViewBinding();
            Boolean hasResource = null;
            if (mViewBinding != null) {
                AppCompatTextView appCompatTextView = mViewBinding.f86533A;
                User user = postSubjectItem.getUser();
                appCompatTextView.setText(user != null ? user.getNickname() : null);
                ShapeableImageView shapeableImageView = mViewBinding.f86549n;
                int iM27313a = AbstractC5776a0.m27313a(28.0f);
                C23860f.a aVar = C23860f.f72909a;
                Context context = shapeableImageView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94457m = aVar.m94457m(context);
                User user2 = postSubjectItem.getUser();
                if (user2 == null || (avatar = user2.getAvatar()) == null) {
                    avatar = "";
                }
                C23860f.b bVarM94464c = bVarM94457m.m94468g(avatar).m94474m(iM27313a).m94464c(iM27313a);
                Intrinsics.m97799e(shapeableImageView);
                bVarM94464c.m94465d(shapeableImageView);
                if (postSubjectItem.getGroup() != null) {
                    AppCompatTextView appCompatTextView2 = mViewBinding.f86561z;
                    Group group = postSubjectItem.getGroup();
                    appCompatTextView2.setText(group != null ? group.getName() : null);
                    AppCompatTextView tvSubject = mViewBinding.f86561z;
                    Intrinsics.m97801g(tvSubject, "tvSubject");
                    AbstractC26006c.m102058k(tvSubject);
                    mViewBinding.f86561z.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.fragment.i2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PostDetailCommonFragment.m74357b1(this.f57368a, view);
                        }
                    });
                } else {
                    AppCompatTextView tvSubject2 = mViewBinding.f86561z;
                    Intrinsics.m97801g(tvSubject2, "tvSubject");
                    AbstractC26006c.m102054g(tvSubject2);
                }
                AppCompatTextView appCompatTextView3 = mViewBinding.f86559x;
                if (postSubjectItem.getCreatedAt() == null) {
                    Intrinsics.m97799e(appCompatTextView3);
                    AbstractC26006c.m102054g(appCompatTextView3);
                } else {
                    Intrinsics.m97799e(appCompatTextView3);
                    AbstractC26006c.m102058k(appCompatTextView3);
                    String createdAt = postSubjectItem.getCreatedAt();
                    appCompatTextView3.setText(AbstractC17443m.m74966a(createdAt != null ? Long.parseLong(createdAt) : 0L));
                }
                mViewBinding.f86555t.showData(postSubjectItem, getPageName(), new Function0() { // from class: com.transsion.postdetail.ui.fragment.j2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PostDetailCommonFragment.m74358c1(this.f57375a);
                    }
                });
            }
            m74354Y0(postSubjectItem.getSubjectRate());
            m74349T0(postSubjectItem.getMedia());
            setPTParams(postSubjectItem);
            String title = postSubjectItem.getTitle();
            String content = postSubjectItem.getContent();
            Link link = postSubjectItem.getLink();
            m74351V0(title, content, link != null ? link.getUrl() : null);
            mo74283F0();
            PostSubjectItem postSubjectItem2 = this.mPostDetailBean;
            if (postSubjectItem2 != null && (subject = postSubjectItem2.getSubject()) != null) {
                hasResource = subject.getHasResource();
            }
            m74356a1(hasResource);
            m74344O0();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public C28164n getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28164n c28164nM109344c = C28164n.m109344c(inflater);
        Intrinsics.m97801g(c28164nM109344c, "inflate(...)");
        return c28164nM109344c;
    }

    /* JADX INFO: renamed from: F0 */
    public abstract void mo74283F0();

    /* JADX INFO: renamed from: G0 */
    public abstract void mo74284G0();

    public final PostSubjectItem getMPostDetailBean() {
        return this.mPostDetailBean;
    }

    public abstract String getPageName();

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    public abstract void initAudioListener();

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        AppCompatImageView appCompatImageView;
        C28164n mViewBinding = getMViewBinding();
        if (mViewBinding != null && (appCompatImageView = mViewBinding.f86550o) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.fragment.e2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PostDetailCommonFragment.m74337H0(this.f57320a, view);
                }
            });
        }
        C14569o c14569o = C14569o.f51128a;
        C28164n mViewBinding2 = getMViewBinding();
        ShapeableImageView shapeableImageView = mViewBinding2 != null ? mViewBinding2.f86549n : null;
        C28164n mViewBinding3 = getMViewBinding();
        c14569o.m65703a(new View[]{shapeableImageView, mViewBinding3 != null ? mViewBinding3.f86533A : null}, new View.OnClickListener() { // from class: com.transsion.postdetail.ui.fragment.f2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PostDetailCommonFragment.m74338I0(this.f57327a, view);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        m74355Z0();
        mo74284G0();
        initAudioListener();
        loadData();
        m74335C0();
        m74341L0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        PostDetailViewModel viewModel = getViewModel();
        viewModel.m75048A().m14851j(this, new C17038c(new Function1() { // from class: com.transsion.postdetail.ui.fragment.k2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDetailCommonFragment.m74339J0(this.f57383a, (PostSubjectItem) obj);
            }
        }));
        viewModel.m75054t().m14851j(this, new C17038c(new Function1() { // from class: com.transsion.postdetail.ui.fragment.l2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostDetailCommonFragment.m74340K0(this.f57389a, (String) obj);
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
        return new C24655b(getPageName(), false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C16316a c16316a = this.mGifPlayerManager;
        if (c16316a != null) {
            c16316a.m71338f();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C16316a c16316a = this.mGifPlayerManager;
        if (c16316a != null) {
            c16316a.m71343k();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C16316a c16316a = this.mGifPlayerManager;
        if (c16316a != null) {
            c16316a.m71344l();
        }
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
        if (arguments4 != null && (serializable = arguments4.getSerializable("item_object")) != null) {
            postSubjectItem = (PostSubjectItem) serializable;
        }
        this.mPostDetailBean = postSubjectItem;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }
}
