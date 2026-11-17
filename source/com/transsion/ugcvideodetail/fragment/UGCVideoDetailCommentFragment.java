package com.transsion.ugcvideodetail.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1005savedstate.InterfaceC4393e;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.postdetailapi.CommentTopicType;
import com.transsion.ugcvideodetail.R$id;
import com.transsion.ugcvideodetail.api.bean.UGCVideoDetailParams;
import com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gp.InterfaceC23623a;
import gp.InterfaceC23624b;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p550kj.C24655b;
import p885wv.C28444d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010(R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\r¨\u00069"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/fragment/UGCVideoDetailCommentFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lwv/d;", "<init>", "()V", "", "m0", "Landroid/view/LayoutInflater;", "inflater", "p0", "(Landroid/view/LayoutInflater;)Lwv/d;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "", "isShowPageStateLayoutTitle", "()Z", "receiveArguments", "initViewData", "initViewModel", "initListener", "retryLoadData", "onDestroyView", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "hidden", "onHiddenChanged", "(Z)V", "Lcom/transsion/ugcvideodetail/viewmodel/UGCVideoDetailViewModel;", "a", "Lkotlin/Lazy;", "n0", "()Lcom/transsion/ugcvideodetail/viewmodel/UGCVideoDetailViewModel;", "mViewModel", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideoDetailParams;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/ugcvideodetail/api/bean/UGCVideoDetailParams;", "videoParams", "c", "Ljava/lang/String;", "pageName", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "pageFrom", "e", "fromOptId", "Landroidx/fragment/app/Fragment;", "f", "Landroidx/fragment/app/Fragment;", "commentFragment", "", "g", "J", "pageLoadStartTime", "o0", "ugcVideoId", "h", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCVideoDetailCommentFragment extends PageStatusFragment<C28444d> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy mViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(UGCVideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.ugcvideodetail.fragment.UGCVideoDetailCommentFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.ugcvideodetail.fragment.UGCVideoDetailCommentFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3227v0.c invoke() {
            C3227v0.c defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.m97801g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private UGCVideoDetailParams videoParams;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String pageFrom;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String fromOptId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Fragment commentFragment;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long pageLoadStartTime;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCVideoDetailCommentFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UGCVideoDetailCommentFragment m83870a() {
            return new UGCVideoDetailCommentFragment();
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCVideoDetailCommentFragment$b */
    static final class C20202b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f64186a;

        C20202b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f64186a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f64186a;
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
            this.f64186a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: m0 */
    private final void m83863m0() {
        HashMap mapM96844g;
        if (this.pageLoadStartTime > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.pageLoadStartTime;
            C24655b logViewConfig = getLogViewConfig();
            if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    private final UGCVideoDetailViewModel m83864n0() {
        return (UGCVideoDetailViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: renamed from: o0 */
    private final String m83865o0() {
        UGCVideoDetailParams uGCVideoDetailParams = this.videoParams;
        if (uGCVideoDetailParams != null) {
            return uGCVideoDetailParams.getUgcVideoId();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m83866q0(UGCVideoDetailCommentFragment uGCVideoDetailCommentFragment, View view) {
        InterfaceC4393e interfaceC4393e = uGCVideoDetailCommentFragment.commentFragment;
        InterfaceC23623a interfaceC23623a = interfaceC4393e instanceof InterfaceC23623a ? (InterfaceC23623a) interfaceC4393e : null;
        if (interfaceC23623a != null) {
            interfaceC23623a.mo74037t(view);
            interfaceC23623a.mo74036r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final Unit m83867r0(UGCVideoDetailCommentFragment uGCVideoDetailCommentFragment, Long l11) {
        InterfaceC4393e interfaceC4393e = uGCVideoDetailCommentFragment.commentFragment;
        InterfaceC23623a interfaceC23623a = interfaceC4393e instanceof InterfaceC23623a ? (InterfaceC23623a) interfaceC4393e : null;
        if (interfaceC23623a != null) {
            Intrinsics.m97799e(l11);
            interfaceC23623a.updateCommentCount(l11.longValue());
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final Unit m83868s0(UGCVideoDetailCommentFragment uGCVideoDetailCommentFragment, boolean z11) {
        if (z11) {
            uGCVideoDetailCommentFragment.m83863m0();
            C24655b logViewConfig = uGCVideoDetailCommentFragment.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
        }
        return Unit.f75682a;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        Fragment fragmentMo93473f;
        C24655b logViewConfig;
        HashMap mapM96844g;
        C24655b logViewConfig2;
        HashMap mapM96844g2;
        HashMap mapM96844g3;
        C24655b logViewConfig3;
        HashMap mapM96844g4;
        HashMap mapM96844g5;
        HashMap mapM96844g6;
        String subjectId;
        HashMap mapM96844g7;
        String collectionId;
        HashMap mapM96844g8;
        HashMap mapM96844g9;
        HashMap mapM96844g10;
        AppCompatTextView appCompatTextView;
        String strM83865o0 = m83865o0();
        if (strM83865o0 == null) {
            strM83865o0 = (String) m83864n0().m84259D().m14847f();
        }
        String str = strM83865o0;
        Fragment parentFragment = getParentFragment();
        UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment = parentFragment instanceof UGCVideoDetailBaseFragment ? (UGCVideoDetailBaseFragment) parentFragment : null;
        InterfaceC23624b interfaceC23624b = (InterfaceC23624b) TheRouter.m61774d(InterfaceC23624b.class, new Object[0]);
        if (interfaceC23624b != null) {
            String value = CommentTopicType.UGC_VIDEO.getValue();
            Long l11 = (Long) m83864n0().m84256A().m14847f();
            long jLongValue = l11 != null ? l11.longValue() : 0L;
            String trackId = uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null;
            String previousTrackId = uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null;
            String previousPageVideoId = uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null;
            String str2 = this.pageName;
            UGCVideoDetailParams uGCVideoDetailParams = this.videoParams;
            fragmentMo93473f = interfaceC23624b.mo93473f(str, value, jLongValue, true, true, "", null, trackId, previousTrackId, previousPageVideoId, str, str2, uGCVideoDetailParams != null ? uGCVideoDetailParams.getCollectionId() : null);
        } else {
            fragmentMo93473f = null;
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
        C28444d mViewBinding = getMViewBinding();
        if (mViewBinding != null && (appCompatTextView = mViewBinding.f87281c) != null) {
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.fragment.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UGCVideoDetailCommentFragment.m83866q0(this.f64284a, view);
                }
            });
        }
        m83864n0().m84256A().m14851j(getViewLifecycleOwner(), new C20202b(new Function1() { // from class: com.transsion.ugcvideodetail.fragment.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UGCVideoDetailCommentFragment.m83867r0(this.f64289a, (Long) obj);
            }
        }));
        InterfaceC4393e interfaceC4393e = this.commentFragment;
        InterfaceC23623a interfaceC23623a = interfaceC4393e instanceof InterfaceC23623a ? (InterfaceC23623a) interfaceC4393e : null;
        if (interfaceC23623a != null) {
            interfaceC23623a.mo74035f(new Function1() { // from class: com.transsion.ugcvideodetail.fragment.m0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UGCVideoDetailCommentFragment.m83868s0(this.f64292a, ((Boolean) obj).booleanValue());
                }
            });
        }
        C24655b logViewConfig4 = getLogViewConfig();
        if (logViewConfig4 != null && (mapM96844g10 = logViewConfig4.m96844g()) != null) {
        }
        C24655b logViewConfig5 = getLogViewConfig();
        if (logViewConfig5 != null && (mapM96844g9 = logViewConfig5.m96844g()) != null) {
            UGCVideoDetailParams uGCVideoDetailParams2 = this.videoParams;
        }
        C24655b logViewConfig6 = getLogViewConfig();
        String str3 = "";
        if (logViewConfig6 != null && (mapM96844g8 = logViewConfig6.m96844g()) != null) {
            String strM83865o1 = m83865o0();
            if (strM83865o1 == null) {
                strM83865o1 = "";
            }
        }
        C24655b logViewConfig7 = getLogViewConfig();
        if (logViewConfig7 != null && (mapM96844g7 = logViewConfig7.m96844g()) != null) {
            UGCVideoDetailParams uGCVideoDetailParams3 = this.videoParams;
            if (uGCVideoDetailParams3 == null || (collectionId = uGCVideoDetailParams3.getCollectionId()) == null) {
                collectionId = "";
            }
        }
        C24655b logViewConfig8 = getLogViewConfig();
        if (logViewConfig8 != null && (mapM96844g6 = logViewConfig8.m96844g()) != null) {
            UGCVideoDetailParams uGCVideoDetailParams4 = this.videoParams;
            if (uGCVideoDetailParams4 != null && (subjectId = uGCVideoDetailParams4.getSubjectId()) != null) {
                str3 = subjectId;
            }
        }
        C24655b logViewConfig9 = getLogViewConfig();
        if (logViewConfig9 != null && (mapM96844g5 = logViewConfig9.m96844g()) != null) {
        }
        String str4 = this.fromOptId;
        if (str4 != null && (logViewConfig3 = getLogViewConfig()) != null && (mapM96844g4 = logViewConfig3.m96844g()) != null) {
        }
        UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment2 = uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment : null;
        if (uGCVideoDetailBaseFragment2 != null) {
            C24655b logViewConfig10 = getLogViewConfig();
            if (logViewConfig10 != null && (mapM96844g3 = logViewConfig10.m96844g()) != null) {
            }
            String previousTrackId2 = uGCVideoDetailBaseFragment2.getPreviousTrackId();
            if (previousTrackId2 != null && (logViewConfig2 = getLogViewConfig()) != null && (mapM96844g2 = logViewConfig2.m96844g()) != null) {
            }
            String previousPageVideoId2 = uGCVideoDetailBaseFragment2.getPreviousPageVideoId();
            if (previousPageVideoId2 == null || (logViewConfig = getLogViewConfig()) == null || (mapM96844g = logViewConfig.m96844g()) == null) {
                return;
            }
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isShowPageStateLayoutTitle() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        String str = this.pageName;
        if (str == null) {
            str = "/ugc_video/detail";
        }
        return new C24655b(str, false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.commentFragment = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                logPause();
            } else {
                logResume();
            }
        }
        AbstractC14517k.m65410h(null, this, hidden, null, 9, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public C28444d getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28444d c28444dM109887c = C28444d.m109887c(inflater);
        Intrinsics.m97801g(c28444dM109887c, "inflate(...)");
        return c28444dM109887c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        this.pageLoadStartTime = System.currentTimeMillis();
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("video_params") : null;
        this.videoParams = serializable instanceof UGCVideoDetailParams ? (UGCVideoDetailParams) serializable : null;
        Bundle arguments2 = getArguments();
        this.pageName = arguments2 != null ? arguments2.getString("page_name") : null;
        Bundle arguments3 = getArguments();
        this.pageFrom = arguments3 != null ? arguments3.getString(WebConstants.PAGE_FROM) : null;
        Bundle arguments4 = getArguments();
        this.fromOptId = arguments4 != null ? arguments4.getString("from_opt_id") : null;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }
}
