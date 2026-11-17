package com.transsion.ugcvideodetail.widget;

import android.content.Context;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baseui.util.C14557c;
import com.transsion.baseui.widget.C14579c;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.ugcvideodetail.R$id;
import com.transsion.ugcvideodetail.R$layout;
import com.transsion.ugcvideodetail.adapter.C20149g;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoList;
import com.transsion.ugcvideodetail.fragment.UGCVideoDetailBaseFragment;
import com.transsion.ugcvideodetail.fragment.UGCVideoDialogPlayListTabFragment;
import com.transsion.ugcvideodetail.hepler.C20316g;
import com.transsion.ugcvideodetail.hepler.UGCVideoPlayFrom;
import com.transsion.ugcvideodetail.viewmodel.UGCLocalVideoDetailViewModel;
import com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel;
import com.transsion.ugcvideodetail.widget.UGCVideoDetailPlayListView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import mg.C25826c;
import ng.AbstractC26006c;
import p648oj.InterfaceC26261i1;
import p743rh.C27287m;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p765s6.InterfaceC27569g;
import p801u6.C27941f;
import p840vj.C28117b;
import p885wv.C28457q;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ1\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001c\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010#\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010\u000eJ\u000f\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010\u000eJ\u0019\u0010(\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b(\u0010)J\u001d\u0010.\u001a\u00020\f2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\f¢\u0006\u0004\b0\u0010\u000eJ\u0013\u00102\u001a\b\u0012\u0004\u0012\u00020\u001401¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001401¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0011¢\u0006\u0004\b7\u00108R\u0014\u0010;\u001a\u00020 8\u0002X\u0082D¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010F\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010N\u001a\u0004\bT\u0010UR\u0018\u0010X\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010:R\u0018\u0010\\\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010^\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010:R\u0018\u0010`\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010:¨\u0006a"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/widget/UGCVideoDetailPlayListView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "res", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "x", "()V", "v", "C", "", "isLoadDown", "", "Loj/i1;", "items", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideoList;", "playList", "N", "(ZLjava/util/List;Lcom/transsion/ugcvideodetail/api/bean/UGCVideoList;)V", "currentList", "newItems", TmcStartParams.KEY_URL_SHORT, "(Ljava/util/List;Ljava/util/List;ZLcom/transsion/ugcvideodetail/api/bean/UGCVideoList;)Z", "P", "(ZLcom/transsion/ugcvideodetail/api/bean/UGCVideoList;)V", "", "videoId", "previousVideoId", "Q", "(Ljava/lang/String;Ljava/lang/String;)V", "J", "M", "ugcVideoId", "H", "(Ljava/lang/String;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/transsion/ugcvideodetail/hepler/UGCVideoPlayFrom;", "videoPlayFrom", "setParentFragment", "(Landroidx/fragment/app/Fragment;Lcom/transsion/ugcvideodetail/hepler/UGCVideoPlayFrom;)V", "clearExposureCache", "", "getPlayListData", "()Ljava/util/List;", "replacePlayListData", "(Ljava/util/List;)V", "pause", "pauseAnimatedImageSpans", "(Z)V", "a", "Ljava/lang/String;", "TAG", "Lwv/q;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lwv/q;", "viewBinding", "Lcom/transsion/ugcvideodetail/adapter/g;", "c", "Lcom/transsion/ugcvideodetail/adapter/g;", "playListAdapter", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroidx/fragment/app/Fragment;", "parentFragment", "e", "I", "scrollOffset", "f", "Lcom/transsion/ugcvideodetail/hepler/UGCVideoPlayFrom;", "Lcom/transsion/ugcvideodetail/viewmodel/UGCVideoDetailViewModel;", "g", "Lkotlin/Lazy;", "getViewModel", "()Lcom/transsion/ugcvideodetail/viewmodel/UGCVideoDetailViewModel;", "viewModel", "Lcom/transsion/ugcvideodetail/viewmodel/UGCLocalVideoDetailViewModel;", "h", "getLocalViewModel", "()Lcom/transsion/ugcvideodetail/viewmodel/UGCLocalVideoDetailViewModel;", "localViewModel", "i", "currentPlayingId", "Lvj/b;", "j", "Lvj/b;", "exposureHelper", CampaignEx.JSON_KEY_AD_K, "pageName", "l", "currentCollectionId", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCVideoDetailPlayListView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28457q viewBinding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C20149g playListAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Fragment parentFragment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int scrollOffset;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private UGCVideoPlayFrom videoPlayFrom;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Lazy localViewModel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String currentPlayingId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private C28117b exposureHelper;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String currentCollectionId;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.widget.UGCVideoDetailPlayListView$a */
    public /* synthetic */ class C20397a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64649a;

        static {
            int[] iArr = new int[UGCVideoPlayFrom.values().length];
            try {
                iArr[UGCVideoPlayFrom.LOCAL_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UGCVideoPlayFrom.ON_LINE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64649a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.widget.UGCVideoDetailPlayListView$b */
    static final class C20398b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f64650a;

        C20398b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f64650a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f64650a;
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
            this.f64650a.invoke(obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UGCVideoDetailPlayListView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UGCVideoDetailPlayListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCVideoDetailPlayListView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.TAG = "UGCVideoDetailPlayListView";
        this.scrollOffset = (AbstractC5806y.m27489e() / 2) - AbstractC23384a.m92908b(80);
        this.videoPlayFrom = UGCVideoPlayFrom.ON_LINE_VIDEO;
        this.viewModel = LazyKt.m97097b(new Function0() { // from class: yv.r0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGCVideoDetailPlayListView.m84478S(this.f88754a);
            }
        });
        this.localViewModel = LazyKt.m97097b(new Function0() { // from class: yv.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UGCVideoDetailPlayListView.m84470K(this.f88756a);
            }
        });
        View.inflate(context, R$layout.layout_ugc_video_detail_play_list, this);
        C28457q c28457qM109929a = C28457q.m109929a(this);
        Intrinsics.m97801g(c28457qM109929a, "bind(...)");
        this.viewBinding = c28457qM109929a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m84460A(UGCVideoDetailPlayListView uGCVideoDetailPlayListView) {
        if (C27287m.f83003a.m106330e()) {
            uGCVideoDetailPlayListView.m84469J();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m84461B(UGCVideoDetailPlayListView uGCVideoDetailPlayListView) {
        if (C27287m.f83003a.m106330e()) {
            uGCVideoDetailPlayListView.m84472M();
        }
    }

    /* JADX INFO: renamed from: C */
    private final void m84462C() {
        int i11 = C20397a.f64649a[this.videoPlayFrom.ordinal()];
        if (i11 == 1) {
            LiveData liveDataM84225k = getLocalViewModel().m84225k();
            Fragment fragment = this.parentFragment;
            Intrinsics.m97799e(fragment);
            liveDataM84225k.m14851j(fragment, new C20398b(new Function1() { // from class: yv.v0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UGCVideoDetailPlayListView.m84465F(this.f88763a, (List) obj);
                }
            }));
            C3187b0 c3187b0M84223i = getLocalViewModel().m84223i();
            Fragment fragment2 = this.parentFragment;
            Intrinsics.m97799e(fragment2);
            c3187b0M84223i.m14851j(fragment2, new C20398b(new Function1() { // from class: yv.w0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UGCVideoDetailPlayListView.m84466G(this.f88765a, (DownloadBean) obj);
                }
            }));
            return;
        }
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        LiveData liveDataM84267M = getViewModel().m84267M();
        Fragment fragment3 = this.parentFragment;
        Intrinsics.m97799e(fragment3);
        liveDataM84267M.m14851j(fragment3, new C20398b(new Function1() { // from class: yv.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UGCVideoDetailPlayListView.m84463D(this.f88752a, (UGCVideoList) obj);
            }
        }));
        LiveData liveDataM84261G = getViewModel().m84261G();
        Fragment fragment4 = this.parentFragment;
        Intrinsics.m97799e(fragment4);
        liveDataM84261G.m14851j(fragment4, new C20398b(new Function1() { // from class: yv.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UGCVideoDetailPlayListView.m84464E(this.f88761a, (UGCVideo) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final Unit m84463D(UGCVideoDetailPlayListView uGCVideoDetailPlayListView, UGCVideoList uGCVideoList) {
        List<UGCVideo> items;
        List<UGCVideo> items2;
        if (uGCVideoList != null && (items = uGCVideoList.getItems()) != null) {
            C20149g c20149g = null;
            Object obj = null;
            C20149g c20149g2 = null;
            if (items.isEmpty()) {
                C20149g c20149g3 = uGCVideoDetailPlayListView.playListAdapter;
                if (c20149g3 == null) {
                    Intrinsics.m97819y("playListAdapter");
                    c20149g3 = null;
                }
                if (!c20149g3.getData().isEmpty()) {
                    Pager pager = uGCVideoList.getPager();
                    if (pager != null ? Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE) : false) {
                        C20149g c20149g4 = uGCVideoDetailPlayListView.playListAdapter;
                        if (c20149g4 == null) {
                            Intrinsics.m97819y("playListAdapter");
                        } else {
                            c20149g2 = c20149g4;
                        }
                        c20149g2.m36186h0().m108667s();
                    } else {
                        C26866a.a.m104910z(C26866a.f81698a, uGCVideoDetailPlayListView.TAG, "updateData , no more data==============", false, 4, null);
                        C20149g c20149g5 = uGCVideoDetailPlayListView.playListAdapter;
                        if (c20149g5 == null) {
                            Intrinsics.m97819y("playListAdapter");
                            c20149g5 = null;
                        }
                        C27941f.m108652u(c20149g5.m36186h0(), false, 1, null);
                        C20149g c20149g6 = uGCVideoDetailPlayListView.playListAdapter;
                        if (c20149g6 == null) {
                            Intrinsics.m97819y("playListAdapter");
                        } else {
                            c20149g = c20149g6;
                        }
                        c20149g.m36186h0().m108673z(false);
                    }
                }
            } else {
                AbstractC26006c.m102058k(uGCVideoDetailPlayListView);
                String str = (String) uGCVideoDetailPlayListView.getViewModel().m84257B().m14847f();
                String str2 = uGCVideoDetailPlayListView.currentCollectionId;
                if (str2 != null && !Intrinsics.m97797c(str2, str) && str != null && str.length() != 0) {
                    C26866a.a.m104898f(C26866a.f81698a, uGCVideoDetailPlayListView.TAG, "Collection changed: " + uGCVideoDetailPlayListView.currentCollectionId + " -> " + str + ", clearing list", false, 4, null);
                    C20149g c20149g7 = uGCVideoDetailPlayListView.playListAdapter;
                    if (c20149g7 == null) {
                        Intrinsics.m97819y("playListAdapter");
                        c20149g7 = null;
                    }
                    c20149g7.mo36201n1(CollectionsKt.m97506l());
                    uGCVideoDetailPlayListView.currentCollectionId = str;
                } else if (uGCVideoDetailPlayListView.currentCollectionId == null) {
                    uGCVideoDetailPlayListView.currentCollectionId = str;
                }
                if (uGCVideoDetailPlayListView.currentPlayingId != null && (items2 = uGCVideoList.getItems()) != null) {
                    for (Object obj2 : items2) {
                        if (Intrinsics.m97797c(((UGCVideo) obj2).videoUGCId(), uGCVideoDetailPlayListView.currentPlayingId)) {
                            obj = obj2;
                            break;
                        }
                    }
                    UGCVideo uGCVideo = (UGCVideo) obj;
                    if (uGCVideo != null) {
                        uGCVideo.setVideoIsPlaying(true);
                    }
                }
                uGCVideoDetailPlayListView.m84473N(uGCVideoList.getIsLoadDown(), TypeIntrinsics.m97852c(items), uGCVideoList);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final Unit m84464E(UGCVideoDetailPlayListView uGCVideoDetailPlayListView, UGCVideo uGCVideo) {
        String ugcVideoId;
        if (uGCVideo != null && (ugcVideoId = uGCVideo.getUgcVideoId()) != null) {
            m84477R(uGCVideoDetailPlayListView, ugcVideoId, null, 2, null);
            uGCVideoDetailPlayListView.m84467H(ugcVideoId);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final Unit m84465F(UGCVideoDetailPlayListView uGCVideoDetailPlayListView, List list) {
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            AbstractC26006c.m102058k(uGCVideoDetailPlayListView);
            Intrinsics.m97800f(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.transsion.baselib.db.download.UGCVideoPlayable>");
            m84474O(uGCVideoDetailPlayListView, true, TypeIntrinsics.m97852c(list), null, 4, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final Unit m84466G(UGCVideoDetailPlayListView uGCVideoDetailPlayListView, DownloadBean downloadBean) {
        String ugcVideoId;
        if (downloadBean != null && (ugcVideoId = downloadBean.getUgcVideoId()) != null) {
            m84477R(uGCVideoDetailPlayListView, ugcVideoId, null, 2, null);
            uGCVideoDetailPlayListView.m84467H(ugcVideoId);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: H */
    private final void m84467H(final String ugcVideoId) {
        if (ugcVideoId == null || ugcVideoId.length() == 0) {
            return;
        }
        this.viewBinding.f87414d.postDelayed(new Runnable() { // from class: yv.t0
            @Override // java.lang.Runnable
            public final void run() {
                UGCVideoDetailPlayListView.m84468I(this.f88758a, ugcVideoId);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final void m84468I(UGCVideoDetailPlayListView uGCVideoDetailPlayListView, String str) {
        C20149g c20149g = uGCVideoDetailPlayListView.playListAdapter;
        C20149g c20149g2 = null;
        if (c20149g == null) {
            Intrinsics.m97819y("playListAdapter");
            c20149g = null;
        }
        Iterator<Object> it = c20149g.getData().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (Intrinsics.m97797c(((InterfaceC26261i1) it.next()).videoUGCId(), str)) {
                break;
            } else {
                i11++;
            }
        }
        C26866a.a aVar = C26866a.f81698a;
        String str2 = uGCVideoDetailPlayListView.TAG;
        C20149g c20149g3 = uGCVideoDetailPlayListView.playListAdapter;
        if (c20149g3 == null) {
            Intrinsics.m97819y("playListAdapter");
        } else {
            c20149g2 = c20149g3;
        }
        C26866a.a.m104898f(aVar, str2, "listScrollToPosition id:" + str + ", position:" + i11 + ", dataSize:" + c20149g2.getData().size(), false, 4, null);
        if (i11 < 0) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            RecyclerView.AbstractC4214m layoutManager = uGCVideoDetailPlayListView.viewBinding.f87414d.getLayoutManager();
            Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int i12 = uGCVideoDetailPlayListView.scrollOffset;
            linearLayoutManager.scrollToPositionWithOffset(i11, i12 > 0 ? i12 : 0);
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: J */
    private final void m84469J() {
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104905r(aVar, this.TAG, new String[]{"loadMoreData ------"}, false, 4, null);
        C20149g c20149g = this.playListAdapter;
        C20149g c20149g2 = null;
        if (c20149g == null) {
            Intrinsics.m97819y("playListAdapter");
            c20149g = null;
        }
        if (!c20149g.m36186h0().m108665p()) {
            C26866a.a.m104910z(aVar, this.TAG, "loadMoreData , unable to load more", false, 4, null);
            return;
        }
        String str = (String) getViewModel().m84257B().m14847f();
        if (str == null) {
            return;
        }
        C20149g c20149g3 = this.playListAdapter;
        if (c20149g3 == null) {
            Intrinsics.m97819y("playListAdapter");
        } else {
            c20149g2 = c20149g3;
        }
        InterfaceC26261i1 interfaceC26261i1 = (InterfaceC26261i1) CollectionsKt.m97372v0(c20149g2.getData());
        int iVideoUGCPosition = interfaceC26261i1 != null ? interfaceC26261i1.videoUGCPosition() : 0;
        getViewModel().m84276X(str, iVideoUGCPosition + 1, iVideoUGCPosition + 9, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final UGCLocalVideoDetailViewModel m84470K(UGCVideoDetailPlayListView uGCVideoDetailPlayListView) {
        Context context = uGCVideoDetailPlayListView.getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (UGCLocalVideoDetailViewModel) new C3227v0((FragmentActivity) context).m14969a(UGCLocalVideoDetailViewModel.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final void m84471L(RecyclerView.AbstractC4214m abstractC4214m, UGCVideoDetailPlayListView uGCVideoDetailPlayListView, boolean z11) {
        RecyclerView.AbstractC4203b0 childViewHolder;
        TextView textView;
        int childCount = abstractC4214m.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = abstractC4214m.getChildAt(i11);
            if (childAt != null && (childViewHolder = uGCVideoDetailPlayListView.viewBinding.f87414d.getChildViewHolder(childAt)) != null && (textView = (TextView) childViewHolder.itemView.findViewById(R$id.tvTitleGradient)) != null && textView.getVisibility() == 0) {
                CharSequence text = textView.getText();
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    Object[] spans = spanned.getSpans(0, spanned.length(), C14579c.class);
                    Intrinsics.m97801g(spans, "getSpans(...)");
                    for (Object obj : spans) {
                        C14579c c14579c = (C14579c) obj;
                        if (z11) {
                            c14579c.m65747m();
                        } else {
                            c14579c.m65746k();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: M */
    private final void m84472M() {
        String str = (String) getViewModel().m84257B().m14847f();
        if (str == null) {
            return;
        }
        C20149g c20149g = this.playListAdapter;
        C20149g c20149g2 = null;
        if (c20149g == null) {
            Intrinsics.m97819y("playListAdapter");
            c20149g = null;
        }
        InterfaceC26261i1 interfaceC26261i1 = (InterfaceC26261i1) CollectionsKt.m97361k0(c20149g.getData());
        int iVideoUGCPosition = interfaceC26261i1 != null ? interfaceC26261i1.videoUGCPosition() : 1;
        if (iVideoUGCPosition <= 1) {
            C20149g c20149g3 = this.playListAdapter;
            if (c20149g3 == null) {
                Intrinsics.m97819y("playListAdapter");
            } else {
                c20149g2 = c20149g3;
            }
            c20149g2.m36203o0().m108677d(false);
            return;
        }
        C20149g c20149g4 = this.playListAdapter;
        if (c20149g4 == null) {
            Intrinsics.m97819y("playListAdapter");
        } else {
            c20149g2 = c20149g4;
        }
        c20149g2.m36203o0().m108678e(true);
        getViewModel().m84276X(str, Math.max(iVideoUGCPosition - 9, 1), iVideoUGCPosition - 1, false);
    }

    /* JADX INFO: renamed from: N */
    private final void m84473N(boolean isLoadDown, List items, UGCVideoList playList) {
        UGCVideo uGCVideo;
        String ops;
        String str;
        C20149g c20149g = this.playListAdapter;
        if (c20149g == null) {
            Intrinsics.m97819y("playListAdapter");
            c20149g = null;
        }
        if (c20149g.getData().isEmpty() && (str = this.currentPlayingId) != null) {
            m84477R(this, str, null, 2, null);
        }
        C20149g c20149g2 = this.playListAdapter;
        if (c20149g2 == null) {
            Intrinsics.m97819y("playListAdapter");
            c20149g2 = null;
        }
        List<Object> data = c20149g2.getData();
        if (!data.isEmpty() && !items.isEmpty() && m84492u(data, items, isLoadDown, playList)) {
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "updateData: Ignoring non-continuous data. Current list size: " + data.size() + ", New items: " + items.size() + ", isLoadDown: " + isLoadDown, false, 4, null);
            m84475P(isLoadDown, playList);
            return;
        }
        Fragment fragment = this.parentFragment;
        UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment = fragment instanceof UGCVideoDetailBaseFragment ? (UGCVideoDetailBaseFragment) fragment : null;
        String ops2 = uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getOps() : null;
        if (ops2 != null && ops2.length() != 0) {
            Iterator it = items.iterator();
            while (it.hasNext()) {
                InterfaceC26261i1 interfaceC26261i1 = (InterfaceC26261i1) it.next();
                if ((interfaceC26261i1 instanceof UGCVideo) && ((ops = (uGCVideo = (UGCVideo) interfaceC26261i1).getOps()) == null || ops.length() == 0)) {
                    uGCVideo.setOps(ops2);
                }
            }
        }
        C26866a.a.m104908v(C26866a.f81698a, this.TAG, "updateData , isLoadDown：" + isLoadDown + ", items:" + items.size(), false, 4, null);
        if (isLoadDown) {
            m84475P(isLoadDown, playList);
            C20149g c20149g3 = this.playListAdapter;
            if (c20149g3 == null) {
                Intrinsics.m97819y("playListAdapter");
                c20149g3 = null;
            }
            c20149g3.mo36208q(items);
        } else {
            C20149g c20149g4 = this.playListAdapter;
            if (c20149g4 == null) {
                Intrinsics.m97819y("playListAdapter");
                c20149g4 = null;
            }
            c20149g4.mo36202o(0, items);
            C20149g c20149g5 = this.playListAdapter;
            if (c20149g5 == null) {
                Intrinsics.m97819y("playListAdapter");
                c20149g5 = null;
            }
            c20149g5.m36203o0().m108678e(false);
        }
        if (this.videoPlayFrom == UGCVideoPlayFrom.ON_LINE_VIDEO) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = items.iterator();
            while (it2.hasNext()) {
                InterfaceC26261i1 interfaceC26261i2 = (InterfaceC26261i1) it2.next();
                UGCVideo uGCVideo2 = interfaceC26261i2 instanceof UGCVideo ? (UGCVideo) interfaceC26261i2 : null;
                if (uGCVideo2 != null) {
                    arrayList.add(uGCVideo2);
                }
            }
            getViewModel().m84291u(arrayList, isLoadDown);
        }
    }

    /* JADX INFO: renamed from: O */
    static /* synthetic */ void m84474O(UGCVideoDetailPlayListView uGCVideoDetailPlayListView, boolean z11, List list, UGCVideoList uGCVideoList, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            uGCVideoList = null;
        }
        uGCVideoDetailPlayListView.m84473N(z11, list, uGCVideoList);
    }

    /* JADX INFO: renamed from: P */
    private final void m84475P(boolean isLoadDown, UGCVideoList playList) {
        Pager pager;
        if (isLoadDown) {
            boolean zM97797c = (playList == null || (pager = playList.getPager()) == null) ? false : Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE);
            C26866a.a.m104910z(C26866a.f81698a, this.TAG, "updateLoadMoreState , hasMore:" + zM97797c, false, 4, null);
            C20149g c20149g = null;
            if (zM97797c) {
                C20149g c20149g2 = this.playListAdapter;
                if (c20149g2 == null) {
                    Intrinsics.m97819y("playListAdapter");
                } else {
                    c20149g = c20149g2;
                }
                c20149g.m36186h0().m108667s();
                return;
            }
            C20149g c20149g3 = this.playListAdapter;
            if (c20149g3 == null) {
                Intrinsics.m97819y("playListAdapter");
                c20149g3 = null;
            }
            C27941f.m108652u(c20149g3.m36186h0(), false, 1, null);
            C20149g c20149g4 = this.playListAdapter;
            if (c20149g4 == null) {
                Intrinsics.m97819y("playListAdapter");
            } else {
                c20149g = c20149g4;
            }
            c20149g.m36186h0().m108673z(false);
        }
    }

    /* JADX INFO: renamed from: Q */
    private final void m84476Q(String videoId, String previousVideoId) {
        if (previousVideoId == null) {
            int i11 = C20397a.f64649a[this.videoPlayFrom.ordinal()];
            if (i11 == 1) {
                previousVideoId = this.currentPlayingId;
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                previousVideoId = getViewModel().m84260E();
            }
        }
        int i12 = C20397a.f64649a[this.videoPlayFrom.ordinal()];
        if (i12 == 1) {
            getLocalViewModel().m84221f().mo14858q(videoId);
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getViewModel().m84283f0(videoId);
        }
        this.currentPlayingId = videoId;
        C20149g c20149g = this.playListAdapter;
        if (c20149g == null) {
            Intrinsics.m97819y("playListAdapter");
            c20149g = null;
        }
        c20149g.m83614E1(videoId, previousVideoId);
    }

    /* JADX INFO: renamed from: R */
    static /* synthetic */ void m84477R(UGCVideoDetailPlayListView uGCVideoDetailPlayListView, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        uGCVideoDetailPlayListView.m84476Q(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final UGCVideoDetailViewModel m84478S(UGCVideoDetailPlayListView uGCVideoDetailPlayListView) {
        Context context = uGCVideoDetailPlayListView.getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (UGCVideoDetailViewModel) new C3227v0((FragmentActivity) context).m14969a(UGCVideoDetailViewModel.class);
    }

    private final UGCLocalVideoDetailViewModel getLocalViewModel() {
        return (UGCLocalVideoDetailViewModel) this.localViewModel.getValue();
    }

    private final UGCVideoDetailViewModel getViewModel() {
        return (UGCVideoDetailViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: u */
    private final boolean m84492u(List currentList, List newItems, boolean isLoadDown, UGCVideoList playList) {
        Pager pager;
        if (!((playList == null || (pager = playList.getPager()) == null) ? false : Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE))) {
            return false;
        }
        if (isLoadDown) {
            InterfaceC26261i1 interfaceC26261i1 = (InterfaceC26261i1) CollectionsKt.m97372v0(currentList);
            int iVideoUGCPosition = interfaceC26261i1 != null ? interfaceC26261i1.videoUGCPosition() : 0;
            InterfaceC26261i1 interfaceC26261i2 = (InterfaceC26261i1) CollectionsKt.m97361k0(newItems);
            if ((interfaceC26261i2 != null ? interfaceC26261i2.videoUGCPosition() : 0) != iVideoUGCPosition + 1) {
                return true;
            }
        } else {
            InterfaceC26261i1 interfaceC26261i3 = (InterfaceC26261i1) CollectionsKt.m97361k0(currentList);
            int iVideoUGCPosition2 = interfaceC26261i3 != null ? interfaceC26261i3.videoUGCPosition() : 0;
            InterfaceC26261i1 interfaceC26261i4 = (InterfaceC26261i1) CollectionsKt.m97372v0(newItems);
            if ((interfaceC26261i4 != null ? interfaceC26261i4.videoUGCPosition() : 0) != iVideoUGCPosition2 - 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    private final void m84493v() {
        if (this.videoPlayFrom != UGCVideoPlayFrom.ON_LINE_VIDEO) {
            return;
        }
        Fragment fragment = this.parentFragment;
        UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment = fragment instanceof UGCVideoDetailBaseFragment ? (UGCVideoDetailBaseFragment) fragment : null;
        C20316g c20316g = C20316g.f64409a;
        RecyclerView ugcDetailPlayListRv = this.viewBinding.f87414d;
        Intrinsics.m97801g(ugcDetailPlayListRv, "ugcDetailPlayListRv");
        this.exposureHelper = c20316g.m84099a(ugcDetailPlayListRv, getViewModel(), this.pageName, new Function1() { // from class: yv.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UGCVideoDetailPlayListView.m84494w(this.f88767a, ((Integer) obj).intValue());
            }
        }, (128 & 16) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null, (128 & 32) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null, (128 & 64) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null, (128 & 128) != 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final UGCVideo m84494w(UGCVideoDetailPlayListView uGCVideoDetailPlayListView, int i11) {
        C20149g c20149g = uGCVideoDetailPlayListView.playListAdapter;
        if (c20149g == null) {
            Intrinsics.m97819y("playListAdapter");
            c20149g = null;
        }
        Object objL0 = CollectionsKt.m97362l0(c20149g.getData(), i11);
        if (objL0 instanceof UGCVideo) {
            return (UGCVideo) objL0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: x */
    private final void m84495x() {
        C20149g c20149g = null;
        final C20149g c20149g2 = new C20149g(false, 1, 0 == true ? 1 : 0);
        c20149g2.m36227w1(new InterfaceC27566d() { // from class: yv.z0
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                UGCVideoDetailPlayListView.m84497z(this.f88774a, c20149g2, baseQuickAdapter, view, i11);
            }
        });
        if (this.videoPlayFrom == UGCVideoPlayFrom.ON_LINE_VIDEO) {
            c20149g2.m36186h0().m108673z(true);
            c20149g2.m36186h0().m108672y(true);
            c20149g2.m36186h0().m108657E(3);
            c20149g2.m36186h0().m108656D(new InterfaceC27568f() { // from class: yv.a1
                @Override // p765s6.InterfaceC27568f
                /* JADX INFO: renamed from: a */
                public final void mo63874a() {
                    UGCVideoDetailPlayListView.m84460A(this.f88708a);
                }
            });
            c20149g2.m36186h0().m108655C(new UGCVideoDetailHorLoadMoreView());
            c20149g2.m36203o0().m108677d(true);
            c20149g2.m36203o0().m108676c(2);
            c20149g2.m36203o0().m108675b(new InterfaceC27569g() { // from class: yv.b1
                @Override // p765s6.InterfaceC27569g
                /* JADX INFO: renamed from: a */
                public final void mo81168a() {
                    UGCVideoDetailPlayListView.m84461B(this.f88712a);
                }
            });
        }
        this.playListAdapter = c20149g2;
        RecyclerView recyclerView = this.viewBinding.f87414d;
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext(), 0, false));
        C20149g c20149g3 = this.playListAdapter;
        if (c20149g3 == null) {
            Intrinsics.m97819y("playListAdapter");
        } else {
            c20149g = c20149g3;
        }
        recyclerView.setAdapter(c20149g);
        recyclerView.addItemDecoration(new C25826c(AbstractC23384a.m92908b(12), AbstractC23384a.m92908b(8)));
        this.viewBinding.f87412b.setOnClickListener(new View.OnClickListener() { // from class: yv.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCVideoDetailPlayListView.m84496y(this.f88716a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m84496y(UGCVideoDetailPlayListView uGCVideoDetailPlayListView, View view) {
        Fragment fragment = uGCVideoDetailPlayListView.parentFragment;
        if (fragment != null) {
            UGCVideoDialogPlayListTabFragment uGCVideoDialogPlayListTabFragmentM84010a = UGCVideoDialogPlayListTabFragment.INSTANCE.m84010a();
            uGCVideoDialogPlayListTabFragmentM84010a.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("VIDEO_FROM", Integer.valueOf(uGCVideoDetailPlayListView.videoPlayFrom.getValue()))));
            uGCVideoDialogPlayListTabFragmentM84010a.m71697n0(fragment, R$id.flBottomDialogContainer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final void m84497z(UGCVideoDetailPlayListView uGCVideoDetailPlayListView, C20149g c20149g, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        String strM84260E;
        String strM84260E2;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 2000L)) {
            return;
        }
        C20149g c20149g2 = uGCVideoDetailPlayListView.playListAdapter;
        if (c20149g2 == null) {
            Intrinsics.m97819y("playListAdapter");
            c20149g2 = null;
        }
        InterfaceC26261i1 interfaceC26261i1 = (InterfaceC26261i1) CollectionsKt.m97362l0(c20149g2.getData(), i11);
        if (interfaceC26261i1 == null) {
            return;
        }
        String strVideoUGCId = interfaceC26261i1.videoUGCId();
        UGCVideoPlayFrom uGCVideoPlayFrom = uGCVideoDetailPlayListView.videoPlayFrom;
        int[] iArr = C20397a.f64649a;
        int i12 = iArr[uGCVideoPlayFrom.ordinal()];
        if (i12 == 1) {
            strM84260E = uGCVideoDetailPlayListView.currentPlayingId;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strM84260E = uGCVideoDetailPlayListView.getViewModel().m84260E();
        }
        if (!Intrinsics.m97797c(strVideoUGCId, strM84260E) || strVideoUGCId == null || strVideoUGCId.length() == 0) {
            Fragment fragment = uGCVideoDetailPlayListView.parentFragment;
            UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment = fragment instanceof UGCVideoDetailBaseFragment ? (UGCVideoDetailBaseFragment) fragment : null;
            if (strM84260E != null && strM84260E.length() != 0 && uGCVideoDetailBaseFragment != null) {
                uGCVideoDetailBaseFragment.m83842M0();
            }
            int i13 = iArr[uGCVideoDetailPlayListView.videoPlayFrom.ordinal()];
            if (i13 == 1) {
                String strVideoResourceId = interfaceC26261i1.videoResourceId();
                if (strVideoResourceId != null) {
                    uGCVideoDetailPlayListView.getLocalViewModel().m84222h(strVideoResourceId);
                }
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                UGCVideoDetailViewModel viewModel = uGCVideoDetailPlayListView.getViewModel();
                String strVideoUGCId2 = interfaceC26261i1.videoUGCId();
                if (strVideoUGCId2 == null) {
                    strVideoUGCId2 = "";
                }
                viewModel.m84280c0(strVideoUGCId2, (String) uGCVideoDetailPlayListView.getViewModel().m84257B().m14847f());
                if (interfaceC26261i1 instanceof UGCVideo) {
                    C20316g.f64409a.m84100c((UGCVideo) interfaceC26261i1, i11, uGCVideoDetailPlayListView.pageName, uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null, uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null, uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null);
                }
            }
            int i14 = iArr[uGCVideoDetailPlayListView.videoPlayFrom.ordinal()];
            if (i14 == 1) {
                strM84260E2 = uGCVideoDetailPlayListView.currentPlayingId;
            } else {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                strM84260E2 = uGCVideoDetailPlayListView.getViewModel().m84260E();
            }
            c20149g.m83614E1(interfaceC26261i1.videoUGCId(), strM84260E2);
            uGCVideoDetailPlayListView.m84467H(interfaceC26261i1.videoUGCId());
        }
    }

    public final void clearExposureCache() {
        C28117b c28117b = this.exposureHelper;
        if (c28117b != null) {
            c28117b.m109195f();
        }
    }

    public final List<InterfaceC26261i1> getPlayListData() {
        C20149g c20149g = this.playListAdapter;
        if (c20149g == null) {
            Intrinsics.m97819y("playListAdapter");
            c20149g = null;
        }
        return c20149g.getData();
    }

    public final void pauseAnimatedImageSpans(final boolean pause) {
        final RecyclerView.AbstractC4214m layoutManager = this.viewBinding.f87414d.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        this.viewBinding.f87414d.post(new Runnable() { // from class: yv.y0
            @Override // java.lang.Runnable
            public final void run() {
                UGCVideoDetailPlayListView.m84471L(layoutManager, this, pause);
            }
        });
    }

    public final void replacePlayListData(List<? extends InterfaceC26261i1> items) {
        Object next;
        UGCVideo uGCVideo;
        String ops;
        Intrinsics.m97802h(items, "items");
        C26866a.a.m104898f(C26866a.f81698a, this.TAG, "replacePlayListData: Replacing list with " + items.size() + " items", false, 4, null);
        Fragment fragment = this.parentFragment;
        UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment = fragment instanceof UGCVideoDetailBaseFragment ? (UGCVideoDetailBaseFragment) fragment : null;
        String ops2 = uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getOps() : null;
        List<InterfaceC26261i1> listU0 = CollectionsKt.m97343U0(items);
        if (ops2 != null && ops2.length() != 0) {
            for (InterfaceC26261i1 interfaceC26261i1 : listU0) {
                if ((interfaceC26261i1 instanceof UGCVideo) && ((ops = (uGCVideo = (UGCVideo) interfaceC26261i1).getOps()) == null || ops.length() == 0)) {
                    uGCVideo.setOps(ops2);
                }
            }
        }
        if (this.currentPlayingId != null) {
            Iterator it = listU0.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.m97797c(((InterfaceC26261i1) next).videoUGCId(), this.currentPlayingId));
            InterfaceC26261i1 interfaceC26261i2 = (InterfaceC26261i1) next;
            if (interfaceC26261i2 != null) {
                interfaceC26261i2.setVideoIsPlaying(true);
            }
        }
        C20149g c20149g = this.playListAdapter;
        if (c20149g == null) {
            Intrinsics.m97819y("playListAdapter");
            c20149g = null;
        }
        c20149g.mo36201n1(listU0);
        if (this.videoPlayFrom == UGCVideoPlayFrom.ON_LINE_VIDEO) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC26261i1 interfaceC26261i3 : listU0) {
                UGCVideo uGCVideo2 = interfaceC26261i3 instanceof UGCVideo ? (UGCVideo) interfaceC26261i3 : null;
                if (uGCVideo2 != null) {
                    arrayList.add(uGCVideo2);
                }
            }
            if (!arrayList.isEmpty()) {
                getViewModel().m84258C().mo14858q(CollectionsKt.m97343U0(arrayList));
            }
        }
        String str = this.currentPlayingId;
        if (str != null) {
            m84467H(str);
        }
    }

    public final void setParentFragment(Fragment fragment, UGCVideoPlayFrom videoPlayFrom) {
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(videoPlayFrom, "videoPlayFrom");
        this.videoPlayFrom = videoPlayFrom;
        this.parentFragment = fragment;
        this.pageName = fragment instanceof UGCVideoDetailBaseFragment ? ((UGCVideoDetailBaseFragment) fragment).getPAGE_NAME() : null;
        m84495x();
        m84462C();
        m84493v();
    }
}
