package com.transsion.postdetail.comment.p305ui;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3233y0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baseui.fragment.BaseListFragment;
import com.transsion.moviedetailapi.bean.CommentBean;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
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
import p743rh.C27287m;
import p801u6.C27941f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\tJ\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m97100d2 = {"Lcom/transsion/postdetail/comment/ui/CommentListFragment;", "Lcom/transsion/baseui/fragment/BaseListFragment;", "Lcom/transsion/moviedetailapi/bean/CommentBean;", "<init>", "()V", "", "R0", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewData", "initViewModel", "Lcom/transsion/postdetail/comment/ui/a;", "P0", "()Lcom/transsion/postdetail/comment/ui/a;", "G0", "s0", "loadMore", "retryLoadData", "lazyLoadData", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Lcom/transsion/postdetail/comment/ui/CommentListViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "Q0", "()Lcom/transsion/postdetail/comment/ui/CommentListViewModel;", "mViewModel", "c", "a", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class CommentListFragment extends BaseListFragment<CommentBean> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: com.transsion.postdetail.comment.ui.CommentListFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final CommentListFragment m72941a() {
            CommentListFragment commentListFragment = new CommentListFragment();
            commentListFragment.setArguments(new Bundle());
            return commentListFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.comment.ui.CommentListFragment$b */
    static final class C16750b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f56297a;

        C16750b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f56297a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f56297a;
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
            this.f56297a.invoke(obj);
        }
    }

    public CommentListFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.postdetail.comment.ui.CommentListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.mViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(CommentListViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.postdetail.comment.ui.CommentListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.postdetail.comment.ui.CommentListFragment$special$$inlined$viewModels$default$3
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
    }

    /* JADX INFO: renamed from: Q0 */
    private final CommentListViewModel m72937Q0() {
        return (CommentListViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: renamed from: R0 */
    private final void m72938R0() {
        m72937Q0().m72952m().m14851j(this, new C16750b(new Function1() { // from class: com.transsion.postdetail.comment.ui.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CommentListFragment.m72939S0(this.f56307a, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final Unit m72939S0(CommentListFragment commentListFragment, List list) {
        List<Object> data;
        BaseQuickAdapter mBaseAdapter;
        C27941f c27941fM36186h0;
        commentListFragment.showContentView();
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            BaseQuickAdapter mBaseAdapter2 = commentListFragment.getMBaseAdapter();
            if (mBaseAdapter2 != null && (data = mBaseAdapter2.getData()) != null && data.isEmpty() && (mBaseAdapter = commentListFragment.getMBaseAdapter()) != null) {
                mBaseAdapter.m36171Y0(commentListFragment.getEmptyView(false));
            }
        } else {
            C24655b logViewConfig = commentListFragment.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
            BaseQuickAdapter mBaseAdapter3 = commentListFragment.getMBaseAdapter();
            if (mBaseAdapter3 != null) {
                mBaseAdapter3.mo36201n1(list2);
            }
        }
        commentListFragment.m65536I0(false);
        BaseQuickAdapter mBaseAdapter4 = commentListFragment.getMBaseAdapter();
        if (mBaseAdapter4 != null && (c27941fM36186h0 = mBaseAdapter4.m36186h0()) != null && c27941fM36186h0.m108666r()) {
            commentListFragment.m65530B0();
        }
        if (!commentListFragment.m72937Q0().m72953n()) {
            commentListFragment.m65531C0(false);
        }
        return Unit.f75682a;
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: G0 */
    public void mo65534G0() {
        m72937Q0().m72951k(true);
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public C16751a mo65540m0() {
        return new C16751a();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        super.initViewData();
        m65536I0(true);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m72938R0();
    }

    @Override // com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadData() {
        if (!C27287m.f83003a.m106330e()) {
            BaseQuickAdapter mBaseAdapter = getMBaseAdapter();
            if (mBaseAdapter != null) {
                mBaseAdapter.m36171Y0(getLocalNoNetworkView(false));
                return;
            }
            return;
        }
        m65536I0(false);
        BaseQuickAdapter mBaseAdapter2 = getMBaseAdapter();
        if (mBaseAdapter2 != null && mBaseAdapter2.getItemCount() == 0) {
            showLoadingView();
        }
        m72937Q0().m72951k(false);
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    public void loadMore() {
        m72937Q0().m72951k(false);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b("comments", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        m65533F0();
    }

    @Override // com.transsion.baseui.fragment.BaseListFragment
    /* JADX INFO: renamed from: s0 */
    public String mo65546s0() {
        return "My Comments";
    }
}
