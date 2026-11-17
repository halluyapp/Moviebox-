package com.transsion.postdetail.p306ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$string;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.fragment.BaseListFragment;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.PostSubjectBean;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.User;
import com.transsion.p285ad.bidding.nativead.BiddingListManager;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.R$layout;
import com.transsion.postdetail.p306ui.adapter.C16979f;
import com.transsion.postdetail.viewmodel.PostRecommendFragmentViewModel;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.DownloadManagerApi;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.AddToDownloadEvent;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import dk.C22989b;
import gp.InterfaceC23624b;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C25220y0;
import mg.C25832i;
import p743rh.C27287m;
import p765s6.InterfaceC27564b;
import p765s6.InterfaceC27566d;
import p840vj.C28117b;
import p840vj.InterfaceC28116a;
import p879wo.C28410a;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\u0004J/\u0010(\u001a\u00020\u00072\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00142\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000bH\u0002¢\u0006\u0004\b*\u0010\rJ\u000f\u0010+\u001a\u00020\u0007H\u0002¢\u0006\u0004\b+\u0010\u0004J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0002H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0007H\u0002¢\u0006\u0004\b/\u0010\u0004R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R\u0016\u0010>\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00109R\u0016\u0010A\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006N"}, m97100d2 = {"Lcom/transsion/postdetail/ui/fragment/PostRecommendFragment;", "Lcom/transsion/baseui/fragment/BaseListFragment;", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onPause", "", "s0", "()Ljava/lang/String;", "getPageStateLayoutTitle", "", "isAudioShowNoNetworkLayout", "()Z", "isMonitorNetworkState", "isShowPageStateLayoutTitle", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "m0", "()Lcom/chad/library/adapter/base/BaseQuickAdapter;", "initViewData", "initListener", "initViewModel", "x0", "G0", "lazyLoadData", "retryLoadData", "loadMore", "loadDefaultData", "onDestroy", "e1", "adapter", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", RequestParameters.POSITION, "W0", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V", "getPageName", "initExposureHelper", WebConstants.FIELD_ITEM, "g1", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "initAd", "Lvj/b;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lvj/b;", "exposureHelper", "Lwo/a;", "c", "Lwo/a;", "postListReport", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "I", "mTabId", "e", "mNextPage", "f", "mPerPage", "g", "Ljava/lang/String;", "mPostId", "Lcom/transsion/postdetail/viewmodel/PostRecommendFragmentViewModel;", "h", "Lkotlin/Lazy;", "X0", "()Lcom/transsion/postdetail/viewmodel/PostRecommendFragmentViewModel;", "mViewModel", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "i", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "middleListManager", "j", "a", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class PostRecommendFragment extends BaseListFragment<PostSubjectItem> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C28117b exposureHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C28410a postListReport;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mTabId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mNextPage = 1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int mPerPage = 8;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String mPostId = "";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Lazy mViewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.n3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostRecommendFragment.m74418d1();
        }
    });

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private BiddingListManager middleListManager;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.PostRecommendFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final PostRecommendFragment m74422a(String str) {
            PostRecommendFragment postRecommendFragment = new PostRecommendFragment();
            Bundle bundle = new Bundle();
            bundle.putString("post_subject_id", str);
            postRecommendFragment.setArguments(bundle);
            return postRecommendFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.PostRecommendFragment$b */
    public static final class C17046b implements InterfaceC28116a {
        C17046b() {
        }

        @Override // p840vj.InterfaceC28116a
        /* JADX INFO: renamed from: a */
        public void mo65894a(int i11, long j11, View view) {
            PostRecommendFragment postRecommendFragment = PostRecommendFragment.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                if (postRecommendFragment.getMBaseAdapter() instanceof C16979f) {
                    C26866a.a.m104898f(C26866a.f81698a, C28117b.f86283j.m109202a(), "exposure position  " + i11, false, 4, null);
                    C28410a c28410a = postRecommendFragment.postListReport;
                    if (c28410a != null) {
                        BaseQuickAdapter mBaseAdapter = postRecommendFragment.getMBaseAdapter();
                        Intrinsics.m97800f(mBaseAdapter, "null cannot be cast to non-null type com.transsion.postdetail.ui.adapter.PostRecommendAdapter");
                        c28410a.m109780a((C16979f) mBaseAdapter, i11, j11);
                    }
                }
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.PostRecommendFragment$c */
    static final class C17047c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f57238a;

        C17047c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f57238a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f57238a;
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
            this.f57238a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: W0 */
    private final void m74411W0(BaseQuickAdapter adapter, View view, int position) {
        String resourceLink;
        User user;
        Subject subject;
        ResourceDetectors resourceDetector;
        Group group;
        Subject subject2;
        Subject subject3;
        String subjectId;
        Context context;
        Subject subject4;
        Subject subject5;
        ResourceDetectors resourceDetector2;
        Subject subject6;
        Object item = adapter.getItem(position);
        String nickname = null;
        PostSubjectItem postSubjectItem = item instanceof PostSubjectItem ? (PostSubjectItem) item : null;
        DownloadManagerApi.C21276a c21276a = DownloadManagerApi.f66480j;
        DownloadManagerApi downloadManagerApiM87093a = c21276a.m87093a();
        String subjectId2 = (postSubjectItem == null || (subject6 = postSubjectItem.getSubject()) == null) ? null : subject6.getSubjectId();
        String resourceId = (postSubjectItem == null || (subject5 = postSubjectItem.getSubject()) == null || (resourceDetector2 = subject5.getResourceDetector()) == null) ? null : resourceDetector2.getResourceId();
        boolean z11 = false;
        if (postSubjectItem != null && (subject4 = postSubjectItem.getSubject()) != null && subject4.isSeries()) {
            z11 = true;
        }
        if (DownloadManagerApi.m87075x0(downloadManagerApiM87093a, subjectId2, resourceId, z11, false, 8, null)) {
            if (postSubjectItem == null || (subject3 = postSubjectItem.getSubject()) == null || (subjectId = subject3.getSubjectId()) == null || (context = getContext()) == null) {
                return;
            }
            DownloadManagerApi.m87078z0(c21276a.m87093a(), subjectId, context, getPageName(), null, 8, null);
            return;
        }
        if (postSubjectItem != null && (subject2 = postSubjectItem.getSubject()) != null) {
            Integer subjectType = subject2.getSubjectType();
            int value = SubjectType.SHORT_TV.getValue();
            if (subjectType != null && subjectType.intValue() == value) {
                DownloadManagerApi downloadManagerApiM87093a2 = c21276a.m87093a();
                Context context2 = getContext();
                Intrinsics.m97800f(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                FragmentActivity fragmentActivity = (FragmentActivity) context2;
                String pageName = getPageName();
                Group group2 = postSubjectItem.getGroup();
                downloadManagerApiM87093a2.m87086d0(fragmentActivity, pageName, (384 & 4) != 0 ? "" : group2 != null ? group2.getGroupId() : null, postSubjectItem.getOps(), (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : true, (384 & 64) != 0 ? null : postSubjectItem.getSubject(), (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : null);
                return;
            }
        }
        DownloadManagerApi downloadManagerApiM87093a3 = c21276a.m87093a();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        Subject subject7 = postSubjectItem != null ? postSubjectItem.getSubject() : null;
        String pageName2 = getPageName();
        String groupId = (postSubjectItem == null || (group = postSubjectItem.getGroup()) == null) ? null : group.getGroupId();
        String ops = postSubjectItem != null ? postSubjectItem.getOps() : null;
        if (postSubjectItem == null || (subject = postSubjectItem.getSubject()) == null || (resourceDetector = subject.getResourceDetector()) == null || (resourceLink = resourceDetector.getResourceLink()) == null) {
            resourceLink = "";
        }
        String str = resourceLink;
        if (postSubjectItem != null && (user = postSubjectItem.getUser()) != null) {
            nickname = user.getNickname();
        }
        downloadManagerApiM87093a3.m87080K(fragmentActivityRequireActivity, subject7, pageName2, (960 & 8) != 0 ? "" : groupId, ops, str, (960 & 64) != 0 ? "" : null, (960 & 128) != 0 ? null : null, (960 & 256) != 0 ? null : nickname, (960 & 512) != 0 ? false : false);
    }

    /* JADX INFO: renamed from: X0 */
    private final PostRecommendFragmentViewModel m74412X0() {
        return (PostRecommendFragmentViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final Unit m74413Y0(PostRecommendFragment postRecommendFragment, int i11, BiddingNativeManager current) {
        List<Object> data;
        Intrinsics.m97802h(current, "current");
        if (current != null) {
            PostSubjectItem postSubjectItem = new PostSubjectItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, false, false, false, null, -1, 1, null);
            postSubjectItem.setNonAdDelegate(current);
            BaseQuickAdapter mBaseAdapter = postRecommendFragment.getMBaseAdapter();
            int size = (mBaseAdapter == null || (data = mBaseAdapter.getData()) == null) ? 0 : data.size();
            if (i11 <= size) {
                BaseQuickAdapter mBaseAdapter2 = postRecommendFragment.getMBaseAdapter();
                if (mBaseAdapter2 != null) {
                    mBaseAdapter2.mo36199n(i11, postSubjectItem);
                }
            } else {
                BaseQuickAdapter mBaseAdapter3 = postRecommendFragment.getMBaseAdapter();
                if (mBaseAdapter3 != null) {
                    mBaseAdapter3.mo36199n(size, postSubjectItem);
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final void m74414Z0(PostRecommendFragment postRecommendFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        C26866a.a.m104898f(C26866a.f81698a, C28117b.f86283j.m109202a(), "position " + i11, false, 4, null);
        Object item = adapter.getItem(i11);
        if (item instanceof PostSubjectItem) {
            PostSubjectItem postSubjectItem = (PostSubjectItem) item;
            postRecommendFragment.m74421g1(postSubjectItem);
            C28410a c28410a = postRecommendFragment.postListReport;
            if (c28410a != null) {
                c28410a.m109781b(i11, postSubjectItem);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final void m74415a1(PostRecommendFragment postRecommendFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (view.getId() == R$id.llDownload) {
            postRecommendFragment.m74411W0(adapter, view, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b1 */
    public static final Unit m74416b1(final PostRecommendFragment postRecommendFragment, PostSubjectBean postSubjectBean) {
        List<PostSubjectItem> items;
        ConstraintLayout root;
        Pager pager;
        Boolean boolValueOf = null;
        if ((postSubjectBean == null || (pager = postSubjectBean.getPager()) == null) ? false : Intrinsics.m97797c(pager.getHasMore(), Boolean.FALSE)) {
            BaseListFragment.m65522D0(postRecommendFragment, false, 1, null);
        }
        if (postSubjectBean == null || (items = postSubjectBean.getItems()) == null) {
            postRecommendFragment.m65539N0();
            Unit unit = Unit.f75682a;
        } else {
            if (items.isEmpty()) {
                BaseListFragment.m65522D0(postRecommendFragment, false, 1, null);
                if (postRecommendFragment.isEmpty()) {
                    PageStatusFragment.showEmptyView$default(postRecommendFragment, false, 1, null);
                }
                return Unit.f75682a;
            }
            BaseQuickAdapter mBaseAdapter = postRecommendFragment.getMBaseAdapter();
            if (mBaseAdapter != null) {
                mBaseAdapter.mo36208q(items);
            }
            C22989b c22989b = (C22989b) postRecommendFragment.getMViewBinding();
            if (c22989b != null && (root = c22989b.getRoot()) != null) {
                boolValueOf = Boolean.valueOf(root.postDelayed(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.r3
                    @Override // java.lang.Runnable
                    public final void run() {
                        PostRecommendFragment.m74417c1(this.f57448a);
                    }
                }, 300L));
            }
            if (boolValueOf == null) {
                postRecommendFragment.m65539N0();
                Unit unit2 = Unit.f75682a;
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final void m74417c1(PostRecommendFragment postRecommendFragment) {
        postRecommendFragment.m65530B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final PostRecommendFragmentViewModel m74418d1() {
        return new PostRecommendFragmentViewModel();
    }

    /* JADX INFO: renamed from: e1 */
    private final void m74419e1() {
        Context context = getContext();
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            Function1 function1 = new Function1() { // from class: com.transsion.postdetail.ui.fragment.m3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PostRecommendFragment.m74420f1(this.f57396a, (AddToDownloadEvent) obj);
                }
            };
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = AddToDownloadEvent.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.observeEvent(appCompatActivity, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final Unit m74420f1(PostRecommendFragment postRecommendFragment, AddToDownloadEvent value) {
        BaseQuickAdapter mBaseAdapter;
        List<Object> data;
        Intrinsics.m97802h(value, "value");
        try {
            BaseQuickAdapter mBaseAdapter2 = postRecommendFragment.getMBaseAdapter();
            int i11 = -1;
            if (mBaseAdapter2 != null && (data = mBaseAdapter2.getData()) != null) {
                Iterator<Object> it = data.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    Subject subject = ((PostSubjectItem) it.next()).getSubject();
                    if (Intrinsics.m97797c(subject != null ? subject.getSubjectId() : null, value.getSubjectId())) {
                        i11 = i12;
                        break;
                    }
                    i12++;
                }
            }
            if (i11 >= 0 && (mBaseAdapter = postRecommendFragment.getMBaseAdapter()) != null) {
                mBaseAdapter.notifyItemChanged(i11 + 1);
            }
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: g1 */
    private final void m74421g1(PostSubjectItem item) {
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.no_network_tips);
            return;
        }
        InterfaceC23624b interfaceC23624b = (InterfaceC23624b) TheRouter.m61774d(InterfaceC23624b.class, new Object[0]);
        if (interfaceC23624b != null) {
            interfaceC23624b.mo93476i(item);
        }
        Media media = item.getMedia();
        Navigator navigatorM61857K = TheRouter.m61773c(Intrinsics.m97797c(media != null ? media.getMediaType() : null, MediaType.VIDEO.getValue()) ? "/post/detailVideo" : "/post/detail").m61857K(WebConstants.PAGE_FROM, getPageName()).m61857K("id", item.getPostId()).m61857K("item_type", item.getItemType());
        Media media2 = item.getMedia();
        Navigator.m61845x(navigatorM61857K.m61857K("media_type", media2 != null ? media2.getMediaType() : null).m61872z("from_comment", false), requireContext(), null, 2, null);
    }

    private final String getPageName() {
        return "post_detail_recommend";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initAd() {
        BiddingListManager biddingListManager = new BiddingListManager();
        this.middleListManager = biddingListManager;
        C22989b c22989b = (C22989b) getMViewBinding();
        biddingListManager.m63184F(c22989b != null ? c22989b.f70181d : null);
        BiddingListManager biddingListManager2 = this.middleListManager;
        if (biddingListManager2 != null) {
            biddingListManager2.m63179A(AbstractC3226v.m14968a(this));
        }
        BiddingListManager biddingListManager3 = this.middleListManager;
        if (biddingListManager3 != null) {
            biddingListManager3.m63185G("PostDetailRecommendScene");
        }
        BiddingListManager biddingListManager4 = this.middleListManager;
        if (biddingListManager4 != null) {
            biddingListManager4.m63192z(new Function2() { // from class: com.transsion.postdetail.ui.fragment.o3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostRecommendFragment.m74413Y0(this.f57412a, ((Integer) obj).intValue(), (BiddingNativeManager) obj2);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initExposureHelper() {
        C22989b c22989b;
        RecyclerView recyclerView;
        this.postListReport = new C28410a("post_recommend", this.mPostId);
        C28117b c28117b = new C28117b(0.6f, new C17046b(), false, 4, null);
        this.exposureHelper = c28117b;
        c28117b.m109199n(2);
        C28117b c28117b2 = this.exposureHelper;
        if (c28117b2 == null || (c22989b = (C22989b) getMViewBinding()) == null || (recyclerView = c22989b.f70181d) == null) {
            return;
        }
        recyclerView.addOnScrollListener(c28117b2);
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: G0 */
    public void mo65534G0() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        super.initListener();
        m74419e1();
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        super.initViewData();
        m65541n0();
        m65548u0();
        initAd();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m74412X0().m75069h().m14851j(this, new C17047c(new Function1() { // from class: com.transsion.postdetail.ui.fragment.l3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostRecommendFragment.m74416b1(this.f57390a, (PostSubjectBean) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isMonitorNetworkState() {
        return true;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isShowPageStateLayoutTitle() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void loadDefaultData() {
        m74412X0().m75068g(this.mPostId, this.mTabId, this.mNextPage, this.mPerPage);
        this.mNextPage++;
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    public void loadMore() {
        loadDefaultData();
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: m0 */
    public BaseQuickAdapter mo65540m0() {
        return new C16979f(new ArrayList(), this.exposureHelper);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Object objM112707constructorimpl;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                String string = arguments.getString("post_subject_id");
                if (string == null) {
                    string = "";
                }
                this.mPostId = string;
                objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            Result.m112706boximpl(objM112707constructorimpl);
        }
        initExposureHelper();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BiddingListManager biddingListManager = this.middleListManager;
        if (biddingListManager != null) {
            biddingListManager.m63187o();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C28117b c28117b = this.exposureHelper;
        if (c28117b != null) {
            c28117b.m109195f();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        m65533F0();
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: s0 */
    public String mo65546s0() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: x0 */
    public void mo65549x0() {
        RecyclerView recyclerView;
        super.mo65549x0();
        BaseQuickAdapter mBaseAdapter = getMBaseAdapter();
        if (mBaseAdapter != null) {
            View viewInflate = LayoutInflater.from(requireActivity()).inflate(R$layout.item_provider_post_recommend_for_you, (ViewGroup) null);
            Intrinsics.m97799e(viewInflate);
            BaseQuickAdapter.m36130y(mBaseAdapter, viewInflate, 0, 0, 6, null);
            mBaseAdapter.m36169X0(R$layout.item_recommend_empty_layout);
            mBaseAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.postdetail.ui.fragment.p3
                @Override // p765s6.InterfaceC27566d
                /* JADX INFO: renamed from: a */
                public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                    PostRecommendFragment.m74414Z0(this.f57418a, baseQuickAdapter, view, i11);
                }
            });
            mBaseAdapter.m36193l(R$id.llDownload);
            mBaseAdapter.m36216s1(new InterfaceC27564b() { // from class: com.transsion.postdetail.ui.fragment.q3
                @Override // p765s6.InterfaceC27564b
                /* JADX INFO: renamed from: a */
                public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                    PostRecommendFragment.m74415a1(this.f57441a, baseQuickAdapter, view, i11);
                }
            });
        }
        C22989b c22989b = (C22989b) getMViewBinding();
        if (c22989b == null || (recyclerView = c22989b.f70181d) == null) {
            return;
        }
        recyclerView.addItemDecoration(new C25832i(AbstractC5776a0.m27313a(16.0f), 0, 2, null));
    }
}
