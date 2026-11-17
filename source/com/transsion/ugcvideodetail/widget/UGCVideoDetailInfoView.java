package com.transsion.ugcvideodetail.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.Lifecycle;
import androidx.p1004lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.C5118o;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.noober.background.drawable.DrawableCreator;
import com.noober.background.view.BLTextView;
import com.p282tn.lib.widget.R$color;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.R$string;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.AbstractC14567m;
import com.transsion.baseui.util.C14557c;
import com.transsion.baseui.util.TimeUtilKt;
import com.transsion.push.PushConstants;
import com.transsion.share.bean.PostType;
import com.transsion.share.share.InterfaceC18701a;
import com.transsion.share.share.ShareDialogFragment;
import com.transsion.ugcvideodetail.R$drawable;
import com.transsion.ugcvideodetail.R$id;
import com.transsion.ugcvideodetail.R$layout;
import com.transsion.ugcvideodetail.adapter.C20151i;
import com.transsion.ugcvideodetail.api.UGCVideoTypeKt;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.ugcvideodetail.api.bean.UGCVideoCreator;
import com.transsion.ugcvideodetail.api.bean.UGCVideoHashTag;
import com.transsion.ugcvideodetail.api.bean.UGCVideoInteractiveInfo;
import com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment;
import com.transsion.ugcvideodetail.fragment.UGCVideoDetailFragment;
import com.transsion.ugcvideodetail.fragment.UGCVideoDialogInfoDialogFragment;
import com.transsion.ugcvideodetail.hepler.C20317h;
import com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel;
import com.transsion.ugcvideodetail.widget.UGCVideoDetailInfoView;
import com.transsion.usercenterapi.ReportType;
import com.transsnet.downloader.DownloadManagerApi;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.C25220y0;
import mg.C25826c;
import ng.AbstractC26006c;
import p441gz.InterfaceC23704a;
import p462hj.C23860f;
import p743rh.C27287m;
import p765s6.InterfaceC27566d;
import p822uv.C28041d;
import p885wv.C28456p;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\u001bJ\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010\u001bJ\u000f\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010\u000eJ\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010\u000eJ\u000f\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010\u000eJ\u000f\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010\u000eJ\u0015\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b0\u0010\u0014J\r\u00101\u001a\u00020\f¢\u0006\u0004\b1\u0010\u000eJ\r\u00102\u001a\u00020\u0018¢\u0006\u0004\b2\u00103R\u0014\u00106\u001a\u00020,8\u0002X\u0082D¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00105R\u001b\u0010K\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001d\u0010P\u001a\u0004\u0018\u00010L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010H\u001a\u0004\bN\u0010O¨\u0006Q"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/widget/UGCVideoDetailInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "res", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "L", "()V", "O", "y", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "video", "setupHashTags", "(Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;)V", "S", "R", "U", "", "isLiked", "b0", "(Z)V", "c0", "isFavorited", "Z", "a0", PushConstants.PUSH_SERVICE_TYPE_SHOW, "Y", "isSubscribed", "d0", "T", "Q", "V", "W", "Lcom/transsion/ugcvideodetail/fragment/UGCVideoDetailFragment;", "fragment", "setParentFragment", "(Lcom/transsion/ugcvideodetail/fragment/UGCVideoDetailFragment;)V", "", "pageName", "setPageName", "(Ljava/lang/String;)V", "setData", "removeAutoPlay", "isAutoPlayShowing", "()Z", "a", "Ljava/lang/String;", "TAG", "Lwv/p;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lwv/p;", "viewBinding", "c", "Lcom/transsion/ugcvideodetail/fragment/UGCVideoDetailFragment;", "parentFragment", "Lcom/transsion/share/share/ShareDialogFragment;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/share/share/ShareDialogFragment;", "shareDialog", "e", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "ugcVideo", "f", "Lcom/transsion/ugcvideodetail/viewmodel/UGCVideoDetailViewModel;", "g", "Lkotlin/Lazy;", "getViewModel", "()Lcom/transsion/ugcvideodetail/viewmodel/UGCVideoDetailViewModel;", "viewModel", "Lgz/a;", "h", "getLoginApi", "()Lgz/a;", "loginApi", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCVideoDetailInfoView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28456p viewBinding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private UGCVideoDetailFragment parentFragment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private ShareDialogFragment shareDialog;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private UGCVideo ugcVideo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Lazy loginApi;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.widget.UGCVideoDetailInfoView$a */
    public static final class C20395a implements InterfaceC18701a {
        C20395a() {
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: a */
        public void mo70521a(String id2, PostType postType) {
            Intrinsics.m97802h(id2, "id");
        }

        @Override // com.transsion.share.share.InterfaceC18701a
        /* JADX INFO: renamed from: b */
        public void mo70522b(String str) {
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

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.widget.UGCVideoDetailInfoView$b */
    static final class C20396b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f64636a;

        C20396b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f64636a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f64636a;
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
            this.f64636a.invoke(obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UGCVideoDetailInfoView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UGCVideoDetailInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCVideoDetailInfoView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.TAG = "ResPostDetailInfoView";
        this.viewModel = LazyKt.m97097b(new Function0() { // from class: yv.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGCVideoDetailInfoView.m84440e0(this.f88727a);
            }
        });
        this.loginApi = LazyKt.m97097b(new Function0() { // from class: yv.i0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGCVideoDetailInfoView.m84423N();
            }
        });
        View.inflate(context, R$layout.layout_ugc_video_detail_info, this);
        C28456p c28456pM109928a = C28456p.m109928a(this);
        Intrinsics.m97801g(c28456pM109928a, "bind(...)");
        this.viewBinding = c28456pM109928a;
        m84421L();
        m84458y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m84410A(UGCVideoDetailInfoView uGCVideoDetailInfoView, UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment, View view) {
        String str = uGCVideoDetailInfoView.pageName;
        if (str != null) {
            C20317h.f64417a.m84102a(str, "more_details", uGCVideoDetailInfoView.ugcVideo, (384 & 8) != 0 ? null : null, (384 & 16) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null, (384 & 32) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null, (384 & 64) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? null : null);
        }
        uGCVideoDetailInfoView.m84432W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m84411B(UGCVideoDetailInfoView uGCVideoDetailInfoView, UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment, View view) {
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        String str = uGCVideoDetailInfoView.pageName;
        if (str != null) {
            C20317h.f64417a.m84102a(str, "like", uGCVideoDetailInfoView.ugcVideo, (384 & 8) != 0 ? null : null, (384 & 16) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null, (384 & 32) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null, (384 & 64) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? null : null);
        }
        uGCVideoDetailInfoView.m84428S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m84412C(UGCVideoDetailInfoView uGCVideoDetailInfoView, UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment, View view) {
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        String str = uGCVideoDetailInfoView.pageName;
        if (str != null) {
            C20317h.f64417a.m84102a(str, "favorite", uGCVideoDetailInfoView.ugcVideo, (384 & 8) != 0 ? null : null, (384 & 16) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null, (384 & 32) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null, (384 & 64) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? null : null);
        }
        uGCVideoDetailInfoView.m84427R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m84413D(UGCVideoDetailInfoView uGCVideoDetailInfoView, UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment, View view) {
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        String str = uGCVideoDetailInfoView.pageName;
        if (str != null) {
            C20317h.f64417a.m84102a(str, PushConstants.TOPIC_SUBSCRIBE, uGCVideoDetailInfoView.ugcVideo, (384 & 8) != 0 ? null : null, (384 & 16) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null, (384 & 32) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null, (384 & 64) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? null : null);
        }
        uGCVideoDetailInfoView.m84430U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m84414E(UGCVideoDetailInfoView uGCVideoDetailInfoView, UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment, View view) {
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        String str = uGCVideoDetailInfoView.pageName;
        if (str != null) {
            C20317h.f64417a.m84102a(str, "share", uGCVideoDetailInfoView.ugcVideo, (384 & 8) != 0 ? null : null, (384 & 16) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null, (384 & 32) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null, (384 & 64) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? null : null);
        }
        uGCVideoDetailInfoView.m84429T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m84415F(UGCVideoDetailInfoView uGCVideoDetailInfoView, UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment, View view) {
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        String str = uGCVideoDetailInfoView.pageName;
        if (str != null) {
            C20317h.f64417a.m84102a(str, "download", uGCVideoDetailInfoView.ugcVideo, (384 & 8) != 0 ? null : null, (384 & 16) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null, (384 & 32) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null, (384 & 64) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? null : null);
        }
        uGCVideoDetailInfoView.m84426Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final void m84416G(UGCVideoDetailInfoView uGCVideoDetailInfoView, UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment, View view) {
        if (C14557c.f51100a.m65671a(view.getId(), 500L)) {
            return;
        }
        String str = uGCVideoDetailInfoView.pageName;
        if (str != null) {
            C20317h.f64417a.m84102a(str, "download", uGCVideoDetailInfoView.ugcVideo, (384 & 8) != 0 ? null : null, (384 & 16) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null, (384 & 32) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null, (384 & 64) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? null : null);
        }
        uGCVideoDetailInfoView.m84426Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m84417H(UGCVideoDetailInfoView uGCVideoDetailInfoView, UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment, View view) {
        String str = uGCVideoDetailInfoView.pageName;
        if (str != null) {
            C20317h.f64417a.m84102a(str, "user", uGCVideoDetailInfoView.ugcVideo, (384 & 8) != 0 ? null : null, (384 & 16) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null, (384 & 32) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null, (384 & 64) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? null : null);
        }
        uGCVideoDetailInfoView.m84431V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final void m84418I(UGCVideoDetailInfoView uGCVideoDetailInfoView, UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment, View view) {
        String str = uGCVideoDetailInfoView.pageName;
        if (str != null) {
            C20317h.f64417a.m84102a(str, "user", uGCVideoDetailInfoView.ugcVideo, (384 & 8) != 0 ? null : null, (384 & 16) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null, (384 & 32) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null, (384 & 64) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? null : null);
        }
        uGCVideoDetailInfoView.m84431V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final void m84419J(UGCVideoDetailInfoView uGCVideoDetailInfoView, UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment, View view) {
        String str = uGCVideoDetailInfoView.pageName;
        if (str != null) {
            C20317h.f64417a.m84102a(str, "autoplay_go", uGCVideoDetailInfoView.ugcVideo, (384 & 8) != 0 ? null : null, (384 & 16) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null, (384 & 32) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null, (384 & 64) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? null : null);
        }
        Navigator.m61845x(TheRouter.m61773c("/profile/setting"), uGCVideoDetailInfoView.getContext(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final void m84420K(UGCVideoDetailInfoView uGCVideoDetailInfoView, UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment, View view) {
        String str = uGCVideoDetailInfoView.pageName;
        if (str != null) {
            C20317h.f64417a.m84102a(str, "autoplay_close", uGCVideoDetailInfoView.ugcVideo, (384 & 8) != 0 ? null : null, (384 & 16) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null, (384 & 32) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null, (384 & 64) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? null : null);
        }
        Group groupAutoplay = uGCVideoDetailInfoView.viewBinding.f87388d;
        Intrinsics.m97801g(groupAutoplay, "groupAutoplay");
        AbstractC26006c.m102054g(groupAutoplay);
    }

    /* JADX INFO: renamed from: L */
    private final void m84421L() {
        RecyclerView recyclerView = this.viewBinding.f87396l;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new C25826c(AbstractC23384a.m92908b(12), AbstractC23384a.m92908b(8)));
        if (!C14496b.f50966a.m65344b().getBoolean("k_UGC_VIDEO_AUTO_PLAY", false)) {
            Group groupAutoplay = this.viewBinding.f87388d;
            Intrinsics.m97801g(groupAutoplay, "groupAutoplay");
            AbstractC26006c.m102058k(groupAutoplay);
        }
        LiveData liveDataM84272R = getViewModel().m84272R();
        Context context = getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        liveDataM84272R.m14851j((FragmentActivity) context, new C20396b(new Function1() { // from class: yv.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UGCVideoDetailInfoView.m84422M(this.f88723a, (Pair) obj);
            }
        }));
        m84424O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX INFO: renamed from: M */
    public static final Unit m84422M(UGCVideoDetailInfoView uGCVideoDetailInfoView, Pair pair) {
        UGCVideo uGCVideo;
        UGCVideoCreator creator;
        Boolean hasSubscribe;
        Unit unit;
        UGCVideoCreator creator2;
        String uid;
        UGCVideoCreator creator3;
        uGCVideoDetailInfoView.m84434Y(false);
        if (pair != null) {
            uGCVideoDetailInfoView.m84439d0(((Boolean) pair.getSecond()).booleanValue());
            UGCVideo uGCVideo2 = uGCVideoDetailInfoView.ugcVideo;
            if (uGCVideo2 != null && (creator3 = uGCVideo2.getCreator()) != null) {
                creator3.setHasSubscribe((Boolean) pair.getSecond());
            }
            AbstractC14567m.m65696c(((Boolean) pair.getSecond()).booleanValue() ? R$string.ugc_video_detail_followed : R$string.ugc_video_detail_unfollowed);
            UGCVideo uGCVideo3 = uGCVideoDetailInfoView.ugcVideo;
            if (uGCVideo3 == null || (creator2 = uGCVideo3.getCreator()) == null || (uid = creator2.getUid()) == null) {
                unit = null;
            } else {
                C28041d c28041d = new C28041d(uid, ((Boolean) pair.getSecond()).booleanValue());
                FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
                String name = C28041d.class.getName();
                Intrinsics.m97801g(name, "getName(...)");
                flowEventBus.postEvent(name, c28041d, 0L);
                unit = Unit.f75682a;
            }
            if (unit == null) {
                uGCVideo = uGCVideoDetailInfoView.ugcVideo;
                if (uGCVideo != null && (creator = uGCVideo.getCreator()) != null && (hasSubscribe = creator.getHasSubscribe()) != null) {
                    uGCVideoDetailInfoView.m84439d0(hasSubscribe.booleanValue());
                }
            }
        } else {
            uGCVideo = uGCVideoDetailInfoView.ugcVideo;
            if (uGCVideo != null) {
                uGCVideoDetailInfoView.m84439d0(hasSubscribe.booleanValue());
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final InterfaceC23704a m84423N() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: renamed from: O */
    private final void m84424O() {
        try {
            Context context = getContext();
            AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
            if (appCompatActivity == null) {
                return;
            }
            Function1 function1 = new Function1() { // from class: yv.g0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UGCVideoDetailInfoView.m84425P(this.f88725a, (C28041d) obj);
                }
            };
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = C28041d.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.observeEvent(appCompatActivity, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
        } catch (Exception e11) {
            C26866a.a.m104900k(C26866a.f81698a, this.TAG, "observeSubscribeEvent init error: " + e11.getMessage(), e11, false, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final Unit m84425P(UGCVideoDetailInfoView uGCVideoDetailInfoView, C28041d event) {
        UGCVideoCreator creator;
        UGCVideoCreator creator2;
        Intrinsics.m97802h(event, "event");
        try {
            UGCVideo uGCVideo = uGCVideoDetailInfoView.ugcVideo;
            String uid = (uGCVideo == null || (creator2 = uGCVideo.getCreator()) == null) ? null : creator2.getUid();
            if (uid != null && Intrinsics.m97797c(uid, event.m109014a())) {
                uGCVideoDetailInfoView.m84439d0(event.m109015b());
                UGCVideo uGCVideo2 = uGCVideoDetailInfoView.ugcVideo;
                if (uGCVideo2 != null && (creator = uGCVideo2.getCreator()) != null) {
                    creator.setHasSubscribe(Boolean.valueOf(event.m109015b()));
                }
            }
        } catch (Exception e11) {
            C26866a.a.m104900k(C26866a.f81698a, uGCVideoDetailInfoView.TAG, "observeSubscribeEvent error: " + e11.getMessage(), e11, false, 8, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: Q */
    private final void m84426Q() {
        Context context = getContext();
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        UGCVideo uGCVideo = this.ugcVideo;
        if (uGCVideo == null || fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            return;
        }
        UGCVideoDetailFragment uGCVideoDetailFragment = this.parentFragment;
        if (!(uGCVideoDetailFragment instanceof UGCVideoDetailBaseFragment)) {
            uGCVideoDetailFragment = null;
        }
        DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
        UGCVideoBelongToCollection belongToCollection = uGCVideo.getBelongToCollection();
        String collectionId = belongToCollection != null ? belongToCollection.getCollectionId() : null;
        String ugcVideoId = uGCVideo.getUgcVideoId();
        UGCVideoBelongToCollection belongToCollection2 = uGCVideo.getBelongToCollection();
        downloadManagerApiM87093a.m87087f0(fragmentActivity, (7940 & 2) != 0 ? null : collectionId, (7940 & 4) != 0 ? null : ugcVideoId, (7940 & 8) != 0 ? null : belongToCollection2 != null ? belongToCollection2.getCollectionName() : null, (7940 & 16) != 0 ? null : uGCVideo.getCategory(), (7940 & 32) != 0 ? null : this.pageName, (7940 & 64) != 0 ? null : uGCVideo.getOps(), (7940 & 128) != 0 ? null : uGCVideo.getSubjectId(), (7940 & 256) != 0 ? null : uGCVideoDetailFragment != null ? uGCVideoDetailFragment.getTrackId() : null, (7940 & 512) != 0 ? null : uGCVideoDetailFragment != null ? uGCVideoDetailFragment.getPreviousTrackId() : null, (7940 & 1024) != 0 ? null : uGCVideoDetailFragment != null ? uGCVideoDetailFragment.getPreviousPageVideoId() : null, (7940 & 2048) != 0 ? false : false, (7940 & 4096) == 0 ? null : null);
    }

    /* JADX INFO: renamed from: R */
    private final void m84427R() {
        String ugcVideoId;
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
            return;
        }
        UGCVideo uGCVideo = this.ugcVideo;
        if (uGCVideo == null || (ugcVideoId = uGCVideo.getUgcVideoId()) == null) {
            return;
        }
        UGCVideoInteractiveInfo interactiveInfo = uGCVideo.getInteractiveInfo();
        boolean zM97797c = interactiveInfo != null ? Intrinsics.m97797c(interactiveInfo.getHasFavorite(), Boolean.TRUE) : false;
        boolean z11 = !zM97797c;
        AbstractC14567m.m65696c(!zM97797c ? com.transsion.ugcvideodetail.R$string.ugc_video_detail_added_to_list : com.transsion.ugcvideodetail.R$string.ugc_video_detail_removed_from_list);
        m84436a0(z11);
        getViewModel().m84288l0(ugcVideoId, z11);
    }

    /* JADX INFO: renamed from: S */
    private final void m84428S() {
        String ugcVideoId;
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
            return;
        }
        UGCVideo uGCVideo = this.ugcVideo;
        if (uGCVideo == null || (ugcVideoId = uGCVideo.getUgcVideoId()) == null) {
            return;
        }
        UGCVideoInteractiveInfo interactiveInfo = uGCVideo.getInteractiveInfo();
        boolean zM97797c = interactiveInfo != null ? Intrinsics.m97797c(interactiveInfo.getHasLike(), Boolean.TRUE) : false;
        boolean z11 = !zM97797c;
        AbstractC14567m.m65696c(!zM97797c ? com.transsion.ugcvideodetail.R$string.ugc_video_detail_liked : com.transsion.ugcvideodetail.R$string.ugc_video_detail_like_removed);
        m84438c0(z11);
        getViewModel().m84289m0(ugcVideoId, z11);
    }

    /* JADX INFO: renamed from: T */
    private final void m84429T() {
        UGCVideoDetailFragment uGCVideoDetailFragment;
        FragmentManager childFragmentManager;
        ShareDialogFragment shareDialogFragment;
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
            return;
        }
        if (this.shareDialog == null) {
            InterfaceC23704a loginApi = getLoginApi();
            UserInfo userInfoMo90386h = loginApi != null ? loginApi.mo90386h() : null;
            ShareDialogFragment.Companion companion = ShareDialogFragment.INSTANCE;
            PostType postType = PostType.UGC_VIDEO;
            UGCVideo uGCVideo = this.ugcVideo;
            String ugcVideoId = uGCVideo != null ? uGCVideo.getUgcVideoId() : null;
            String userId = userInfoMo90386h != null ? userInfoMo90386h.getUserId() : null;
            String value = ReportType.UFC_VIDEO.getValue();
            UGCVideo uGCVideo2 = this.ugcVideo;
            String title = uGCVideo2 != null ? uGCVideo2.getTitle() : null;
            UGCVideo uGCVideo3 = this.ugcVideo;
            ShareDialogFragment shareDialogFragmentM78645a = companion.m78645a(postType, ugcVideoId, userId, value, (3328 & 16) != 0 ? "" : title, (3328 & 32) != 0 ? "" : null, (3328 & 64) != 0 ? false : false, (3328 & 128) != 0 ? false : false, (3328 & 256) != 0 ? false : false, "UGCVideoDetail", (3328 & 1024) != 0 ? "" : uGCVideo3 != null ? uGCVideo3.getOps() : null, (3328 & 2048) != 0 ? "" : null);
            this.shareDialog = shareDialogFragmentM78645a;
            if (shareDialogFragmentM78645a != null) {
                shareDialogFragmentM78645a.m78642G0(new C20395a());
            }
        }
        try {
            UGCVideoDetailFragment uGCVideoDetailFragment2 = this.parentFragment;
            if (uGCVideoDetailFragment2 == null || !uGCVideoDetailFragment2.isAdded() || (uGCVideoDetailFragment = this.parentFragment) == null || (childFragmentManager = uGCVideoDetailFragment.getChildFragmentManager()) == null) {
                return;
            }
            childFragmentManager.m14537g0();
            ShareDialogFragment shareDialogFragment2 = this.shareDialog;
            if ((shareDialogFragment2 == null || !shareDialogFragment2.isAdded()) && childFragmentManager.m14547k0("share") == null && (shareDialogFragment = this.shareDialog) != null) {
                shareDialogFragment.show(childFragmentManager, "share");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: U */
    private final void m84430U() {
        UGCVideoCreator creator;
        String uid;
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
            return;
        }
        UGCVideo uGCVideo = this.ugcVideo;
        if (uGCVideo == null || (creator = uGCVideo.getCreator()) == null || (uid = creator.getUid()) == null) {
            return;
        }
        boolean z11 = !Intrinsics.m97797c(creator.getHasSubscribe(), Boolean.TRUE);
        m84434Y(true);
        getViewModel().m84290n0(uid, z11);
    }

    /* JADX INFO: renamed from: V */
    private final void m84431V() {
        UGCVideoCreator creator;
        String uid;
        Context context = getContext();
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        UGCVideo uGCVideo = this.ugcVideo;
        if (uGCVideo == null || fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed() || (creator = uGCVideo.getCreator()) == null || (uid = creator.getUid()) == null) {
            return;
        }
        Navigator.m61845x(TheRouter.m61773c("/profile/user_profile").m61857K("userId", uid), getContext(), null, 2, null);
    }

    /* JADX INFO: renamed from: W */
    private final void m84432W() {
        UGCVideoDetailFragment uGCVideoDetailFragment = this.parentFragment;
        if (uGCVideoDetailFragment != null) {
            UGCVideoDialogInfoDialogFragment.INSTANCE.m83952a().m71697n0(uGCVideoDetailFragment, R$id.flBottomDialogContainer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final void m84433X(UGCVideo uGCVideo, UGCVideoDetailInfoView uGCVideoDetailInfoView, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        List<UGCVideoHashTag> filteredHashTags = uGCVideo.getFilteredHashTags();
        UGCVideoHashTag uGCVideoHashTag = filteredHashTags != null ? (UGCVideoHashTag) CollectionsKt.m97362l0(filteredHashTags, i11) : null;
        UGCVideoDetailFragment uGCVideoDetailFragment = uGCVideoDetailInfoView.parentFragment;
        if (!(uGCVideoDetailFragment instanceof UGCVideoDetailBaseFragment)) {
            uGCVideoDetailFragment = null;
        }
        String str = uGCVideoDetailInfoView.pageName;
        if (str != null) {
            C20317h.f64417a.m84102a(str, "hash_tag", uGCVideo, (384 & 8) != 0 ? null : uGCVideoHashTag != null ? uGCVideoHashTag.getTag() : null, (384 & 16) != 0 ? null : uGCVideoDetailFragment != null ? uGCVideoDetailFragment.getTrackId() : null, (384 & 32) != 0 ? null : uGCVideoDetailFragment != null ? uGCVideoDetailFragment.getPreviousTrackId() : null, (384 & 64) != 0 ? null : uGCVideoDetailFragment != null ? uGCVideoDetailFragment.getPreviousPageVideoId() : null, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? null : null);
        }
        List<UGCVideoHashTag> filteredHashTags2 = uGCVideo.getFilteredHashTags();
        if (filteredHashTags2 != null) {
            new ArrayList(filteredHashTags2);
        } else {
            new ArrayList();
        }
        Navigator.m61845x(TheRouter.m61773c("/home/hashtag").m61855I("titleHashTag", uGCVideoHashTag).m61857K("UGCVideoId", uGCVideo.getUgcVideoId()), uGCVideoDetailInfoView.getContext(), null, 2, null);
    }

    /* JADX INFO: renamed from: Y */
    private final void m84434Y(boolean show) {
        this.viewBinding.f87395k.setVisibility(show ? 0 : 4);
        BLTextView bLTextView = this.viewBinding.f87404t;
        if (show) {
            bLTextView.setText("");
            bLTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* JADX INFO: renamed from: Z */
    private final void m84435Z(boolean isFavorited) {
        this.viewBinding.f87397m.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, AbstractC2397b.getDrawable(getContext(), isFavorited ? R$drawable.ugc_video_detail_ic_res_post_favorite_selected : R$drawable.ugc_video_detail_ic_res_post_favorite), (Drawable) null, (Drawable) null);
    }

    /* JADX INFO: renamed from: a0 */
    private final void m84436a0(boolean isFavorited) {
        String favoriteNum;
        Integer numV;
        m84435Z(isFavorited);
        UGCVideo uGCVideo = this.ugcVideo;
        if (uGCVideo == null) {
            return;
        }
        UGCVideoInteractiveInfo interactiveInfo = uGCVideo.getInteractiveInfo();
        int iIntValue = (interactiveInfo == null || (favoriteNum = interactiveInfo.getFavoriteNum()) == null || (numV = StringsKt.m98216v(favoriteNum)) == null) ? 0 : numV.intValue();
        int iMax = isFavorited ? iIntValue + 1 : Math.max(0, iIntValue - 1);
        this.viewBinding.f87397m.setText(String.valueOf(iMax));
        UGCVideoInteractiveInfo interactiveInfo2 = uGCVideo.getInteractiveInfo();
        if (interactiveInfo2 != null) {
            interactiveInfo2.setFavoriteNum(String.valueOf(iMax));
        }
        UGCVideoInteractiveInfo interactiveInfo3 = uGCVideo.getInteractiveInfo();
        if (interactiveInfo3 != null) {
            interactiveInfo3.setHasFavorite(Boolean.valueOf(isFavorited));
        }
    }

    /* JADX INFO: renamed from: b0 */
    private final void m84437b0(boolean isLiked) {
        this.viewBinding.f87405u.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, AbstractC2397b.getDrawable(getContext(), isLiked ? R$drawable.ugc_video_detail_ic_res_post_like_selected : R$drawable.ugc_video_detail_ic_res_post_like), (Drawable) null, (Drawable) null);
    }

    /* JADX INFO: renamed from: c0 */
    private final void m84438c0(boolean isLiked) {
        String likeNum;
        Integer numV;
        m84437b0(isLiked);
        UGCVideo uGCVideo = this.ugcVideo;
        if (uGCVideo == null) {
            return;
        }
        UGCVideoInteractiveInfo interactiveInfo = uGCVideo.getInteractiveInfo();
        int iIntValue = (interactiveInfo == null || (likeNum = interactiveInfo.getLikeNum()) == null || (numV = StringsKt.m98216v(likeNum)) == null) ? 0 : numV.intValue();
        int iMax = isLiked ? iIntValue + 1 : Math.max(0, iIntValue - 1);
        this.viewBinding.f87405u.setText(String.valueOf(iMax));
        UGCVideoInteractiveInfo interactiveInfo2 = uGCVideo.getInteractiveInfo();
        if (interactiveInfo2 != null) {
            interactiveInfo2.setLikeNum(String.valueOf(iMax));
        }
        UGCVideoInteractiveInfo interactiveInfo3 = uGCVideo.getInteractiveInfo();
        if (interactiveInfo3 != null) {
            interactiveInfo3.setHasLike(Boolean.valueOf(isLiked));
        }
    }

    /* JADX INFO: renamed from: d0 */
    private final void m84439d0(boolean isSubscribed) {
        BLTextView bLTextView = this.viewBinding.f87404t;
        if (isSubscribed) {
            bLTextView.setBackground(new DrawableCreator.Builder().setSolidColor(AbstractC2397b.getColor(bLTextView.getContext(), R$color.white_10)).setCornersRadius(AbstractC5776a0.m27313a(4.0f)).build());
            bLTextView.setTextColor(AbstractC2397b.getColor(bLTextView.getContext(), R$color.white));
            bLTextView.setCompoundDrawablesWithIntrinsicBounds(R$drawable.ugc_video_detail_ic_subscribed_hook, 0, 0, 0);
            bLTextView.setText(bLTextView.getContext().getString(R$string.str_Subscribed));
            return;
        }
        bLTextView.setBackground(new DrawableCreator.Builder().setSolidColor(AbstractC2397b.getColor(bLTextView.getContext(), R$color.white)).setCornersRadius(AbstractC5776a0.m27313a(4.0f)).build());
        bLTextView.setTextColor(AbstractC2397b.getColor(bLTextView.getContext(), R$color.gray_dark_00));
        bLTextView.setCompoundDrawablesWithIntrinsicBounds(R$drawable.ugc_video_detail_ic_subscribe_add, 0, 0, 0);
        bLTextView.setText(bLTextView.getContext().getString(R$string.str_Subscribe));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final UGCVideoDetailViewModel m84440e0(UGCVideoDetailInfoView uGCVideoDetailInfoView) {
        Context context = uGCVideoDetailInfoView.getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (UGCVideoDetailViewModel) new C3227v0((FragmentActivity) context).m14969a(UGCVideoDetailViewModel.class);
    }

    private final InterfaceC23704a getLoginApi() {
        return (InterfaceC23704a) this.loginApi.getValue();
    }

    private final UGCVideoDetailViewModel getViewModel() {
        return (UGCVideoDetailViewModel) this.viewModel.getValue();
    }

    private final void setupHashTags(final UGCVideo video) {
        List<UGCVideoHashTag> filteredHashTags = video.getFilteredHashTags();
        if (filteredHashTags == null || filteredHashTags.isEmpty()) {
            this.viewBinding.f87396l.setVisibility(8);
            return;
        }
        this.viewBinding.f87396l.setVisibility(0);
        List<UGCVideoHashTag> filteredHashTags2 = video.getFilteredHashTags();
        Intrinsics.m97799e(filteredHashTags2);
        C20151i c20151i = new C20151i(filteredHashTags2, false, 2, null);
        this.viewBinding.f87396l.setAdapter(c20151i);
        c20151i.m36227w1(new InterfaceC27566d() { // from class: yv.z
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                UGCVideoDetailInfoView.m84433X(video, this, baseQuickAdapter, view, i11);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    private final void m84458y() {
        final UGCVideoDetailFragment uGCVideoDetailFragment = this.parentFragment;
        if (!(uGCVideoDetailFragment instanceof UGCVideoDetailBaseFragment)) {
            uGCVideoDetailFragment = null;
        }
        this.viewBinding.f87400p.setOnClickListener(new View.OnClickListener() { // from class: yv.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCVideoDetailInfoView.m84459z(this.f88730a, uGCVideoDetailFragment, view);
            }
        });
        this.viewBinding.f87401q.setOnClickListener(new View.OnClickListener() { // from class: yv.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCVideoDetailInfoView.m84410A(this.f88740a, uGCVideoDetailFragment, view);
            }
        });
        this.viewBinding.f87405u.setOnClickListener(new View.OnClickListener() { // from class: yv.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCVideoDetailInfoView.m84411B(this.f88743a, uGCVideoDetailFragment, view);
            }
        });
        this.viewBinding.f87397m.setOnClickListener(new View.OnClickListener() { // from class: yv.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCVideoDetailInfoView.m84412C(this.f88746a, uGCVideoDetailFragment, view);
            }
        });
        this.viewBinding.f87404t.setOnClickListener(new View.OnClickListener() { // from class: yv.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCVideoDetailInfoView.m84413D(this.f88749a, uGCVideoDetailFragment, view);
            }
        });
        this.viewBinding.f87406v.setOnClickListener(new View.OnClickListener() { // from class: yv.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCVideoDetailInfoView.m84414E(this.f88706a, uGCVideoDetailFragment, view);
            }
        });
        this.viewBinding.f87402r.setOnClickListener(new View.OnClickListener() { // from class: yv.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCVideoDetailInfoView.m84415F(this.f88710a, uGCVideoDetailFragment, view);
            }
        });
        this.viewBinding.f87403s.setOnClickListener(new View.OnClickListener() { // from class: yv.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCVideoDetailInfoView.m84416G(this.f88714a, uGCVideoDetailFragment, view);
            }
        });
        this.viewBinding.f87393i.setOnClickListener(new View.OnClickListener() { // from class: yv.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCVideoDetailInfoView.m84417H(this.f88717a, uGCVideoDetailFragment, view);
            }
        });
        this.viewBinding.f87409y.setOnClickListener(new View.OnClickListener() { // from class: yv.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCVideoDetailInfoView.m84418I(this.f88720a, uGCVideoDetailFragment, view);
            }
        });
        this.viewBinding.f87398n.setOnClickListener(new View.OnClickListener() { // from class: yv.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCVideoDetailInfoView.m84419J(this.f88733a, uGCVideoDetailFragment, view);
            }
        });
        this.viewBinding.f87390f.setOnClickListener(new View.OnClickListener() { // from class: yv.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCVideoDetailInfoView.m84420K(this.f88736a, uGCVideoDetailFragment, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final void m84459z(UGCVideoDetailInfoView uGCVideoDetailInfoView, UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment, View view) {
        String str = uGCVideoDetailInfoView.pageName;
        if (str != null) {
            C20317h.f64417a.m84102a(str, "more_details", uGCVideoDetailInfoView.ugcVideo, (384 & 8) != 0 ? null : null, (384 & 16) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null, (384 & 32) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null, (384 & 64) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? null : null);
        }
        uGCVideoDetailInfoView.m84432W();
    }

    public final boolean isAutoPlayShowing() {
        Group groupAutoplay = this.viewBinding.f87388d;
        Intrinsics.m97801g(groupAutoplay, "groupAutoplay");
        return AbstractC26006c.m102056i(groupAutoplay);
    }

    public final void removeAutoPlay() {
        Group groupAutoplay = this.viewBinding.f87388d;
        Intrinsics.m97801g(groupAutoplay, "groupAutoplay");
        AbstractC26006c.m102054g(groupAutoplay);
    }

    public final void setData(UGCVideo video) {
        Intrinsics.m97802h(video, "video");
        this.ugcVideo = video;
        this.viewBinding.f87408x.setText(video.getTitle());
        AppCompatImageView ivPostType = this.viewBinding.f87392h;
        Intrinsics.m97801g(ivPostType, "ivPostType");
        UGCVideoTypeKt.m83628i(ivPostType, video, null, 4, null);
        AppCompatTextView appCompatTextView = this.viewBinding.f87410z;
        UGCVideo uGCVideo = this.ugcVideo;
        String watchNum = uGCVideo != null ? uGCVideo.getWatchNum() : null;
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        appCompatTextView.setText(AbstractC14564j.m65682c(watchNum, context));
        AppCompatTextView appCompatTextView2 = this.viewBinding.f87407w;
        Long publishTime = video.getPublishTime();
        appCompatTextView2.setText(TimeUtilKt.m65658j(publishTime != null ? publishTime.longValue() : 0L));
        UGCVideoCreator creator = video.getCreator();
        if (creator != null) {
            C23860f.a aVar = C23860f.f72909a;
            Context context2 = getContext();
            Intrinsics.m97801g(context2, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context2);
            String avatar = creator.getAvatar();
            if (avatar == null) {
                avatar = "";
            }
            C23860f.b bVarM94470i = bVarM94457m.m94468g(avatar).m94470i(com.transsion.wrapperad.R$color.white_20);
            ShapeableImageView ivUserCover = this.viewBinding.f87393i;
            Intrinsics.m97801g(ivUserCover, "ivUserCover");
            bVarM94470i.m94465d(ivUserCover);
            this.viewBinding.f87409y.setText(creator.getNickname());
        }
        String description = video.getDescription();
        if (description == null || description.length() == 0) {
            this.viewBinding.f87400p.setVisibility(8);
            this.viewBinding.f87401q.setVisibility(8);
        } else {
            this.viewBinding.f87400p.setText(video.getDescription());
            this.viewBinding.f87400p.setVisibility(0);
            this.viewBinding.f87401q.setVisibility(0);
        }
        setupHashTags(video);
        UGCVideoInteractiveInfo interactiveInfo = video.getInteractiveInfo();
        if (interactiveInfo != null) {
            AppCompatTextView appCompatTextView3 = this.viewBinding.f87405u;
            String likeNum = interactiveInfo.getLikeNum();
            if (likeNum == null) {
                likeNum = "0";
            }
            appCompatTextView3.setText(likeNum);
            Boolean hasLike = interactiveInfo.getHasLike();
            Boolean bool = Boolean.TRUE;
            m84437b0(Intrinsics.m97797c(hasLike, bool));
            AppCompatTextView appCompatTextView4 = this.viewBinding.f87397m;
            String favoriteNum = interactiveInfo.getFavoriteNum();
            appCompatTextView4.setText(favoriteNum != null ? favoriteNum : "0");
            m84435Z(Intrinsics.m97797c(interactiveInfo.getHasFavorite(), bool));
        }
        UGCVideoCreator creator2 = video.getCreator();
        if (creator2 != null) {
            m84439d0(Intrinsics.m97797c(creator2.getHasSubscribe(), Boolean.TRUE));
        }
        if (!C5118o.f17608a.m23948i()) {
            Group groupStandardButtons = this.viewBinding.f87389e;
            Intrinsics.m97801g(groupStandardButtons, "groupStandardButtons");
            AbstractC26006c.m102058k(groupStandardButtons);
            LinearLayout llKidsModeButtons = this.viewBinding.f87394j;
            Intrinsics.m97801g(llKidsModeButtons, "llKidsModeButtons");
            AbstractC26006c.m102054g(llKidsModeButtons);
            return;
        }
        Group groupStandardButtons2 = this.viewBinding.f87389e;
        Intrinsics.m97801g(groupStandardButtons2, "groupStandardButtons");
        AbstractC26006c.m102054g(groupStandardButtons2);
        LinearLayout llKidsModeButtons2 = this.viewBinding.f87394j;
        Intrinsics.m97801g(llKidsModeButtons2, "llKidsModeButtons");
        AbstractC26006c.m102058k(llKidsModeButtons2);
        RecyclerView recyclerTag = this.viewBinding.f87396l;
        Intrinsics.m97801g(recyclerTag, "recyclerTag");
        AbstractC26006c.m102054g(recyclerTag);
        BLTextView tvFollow = this.viewBinding.f87404t;
        Intrinsics.m97801g(tvFollow, "tvFollow");
        AbstractC26006c.m102054g(tvFollow);
        ProgressBar pbSubscribeLoading = this.viewBinding.f87395k;
        Intrinsics.m97801g(pbSubscribeLoading, "pbSubscribeLoading");
        AbstractC26006c.m102054g(pbSubscribeLoading);
        Group groupAutoplay = this.viewBinding.f87388d;
        Intrinsics.m97801g(groupAutoplay, "groupAutoplay");
        AbstractC26006c.m102054g(groupAutoplay);
    }

    public final void setPageName(String pageName) {
        Intrinsics.m97802h(pageName, "pageName");
        this.pageName = pageName;
    }

    public final void setParentFragment(UGCVideoDetailFragment fragment) {
        Intrinsics.m97802h(fragment, "fragment");
        this.parentFragment = fragment;
    }
}
