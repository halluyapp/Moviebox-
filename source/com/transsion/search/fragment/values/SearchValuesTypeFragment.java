package com.transsion.search.fragment.values;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import ck.C5123t;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.StateView;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.p282tn.lib.widget.R$string;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14451b;
import com.transsion.baseui.fragment.LazyFragment;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search.bean.AccurateSubject;
import com.transsion.search.bean.Count;
import com.transsion.search.bean.Pager;
import com.transsion.search.bean.SearchSubject;
import com.transsion.search.bean.SearchWorkEntity;
import com.transsion.search.bean.VerticalRank;
import com.transsion.search.fragment.values.SearchValuesTypeFragment;
import com.transsion.search.fragment.values.adapter.C18503a;
import com.transsion.search.viewmodel.SearchViewModel;
import com.transsion.search.widget.AccurateSubjectView;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.DownloadManagerApi;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.AddToDownloadEvent;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C25220y0;
import mg.C25825b;
import p465hp.C23889b;
import p550kj.C24655b;
import p646oh.C26224a;
import p743rh.C27287m;
import p765s6.InterfaceC27564b;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p881wq.C28427l;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J+\u0010\u0014\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u0019\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u0019\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0004J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010\fJ\u000f\u0010'\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010\tJ\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b,\u0010-J\u0011\u0010.\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0005H\u0016¢\u0006\u0004\b0\u0010\u0004J\u000f\u00101\u001a\u00020\u0005H\u0016¢\u0006\u0004\b1\u0010\u0004J\u000f\u00102\u001a\u00020\u0005H\u0016¢\u0006\u0004\b2\u0010\u0004J\u000f\u00103\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u0010\u0004J\u000f\u00104\u001a\u00020\u0005H\u0016¢\u0006\u0004\b4\u0010\u0004J\u000f\u00105\u001a\u00020\u0005H\u0016¢\u0006\u0004\b5\u0010\u0004J\u000f\u00106\u001a\u00020\u0005H\u0016¢\u0006\u0004\b6\u0010\u0004R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010<R\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u000f0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010Z\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010]\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006c"}, m97100d2 = {"Lcom/transsion/search/fragment/values/SearchValuesTypeFragment;", "Lcom/transsion/baseui/fragment/LazyFragment;", "Lwq/l;", "<init>", "()V", "", "s0", "", "E0", "()Z", "", "v0", "()Ljava/lang/String;", "F0", "y0", "Lcom/transsion/search/bean/SearchSubject;", "subject", "", RequestParameters.POSITION, NativeComponentConstants.KEY_COMPONENT_TYPE, "H0", "(Lcom/transsion/search/bean/SearchSubject;II)V", "loadMore", "Lcom/transsion/moviedetailapi/bean/Subject;", "subjectEntity", "u0", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", WebConstants.FIELD_ITEM, "x0", "Lcom/transsion/search/bean/SearchWorkEntity;", "entity", "J0", "(Lcom/transsion/search/bean/SearchWorkEntity;)V", "receiveArguments", "Landroid/view/LayoutInflater;", "inflater", "w0", "(Landroid/view/LayoutInflater;)Lwq/l;", "getPageStateLayoutTitle", "getScreenType", "()I", "isShowPageStateLayoutTitle", "isShowTitleLayout", "Landroid/view/View;", "getEmptyView", "(Z)Landroid/view/View;", "getLoadingView", "()Landroid/view/View;", "initViewData", "initViewModel", "initListener", "retryLoadData", "lazyLoadData", "onResume", "onDestroy", "Lcom/transsion/search/viewmodel/SearchViewModel;", "a", "Lcom/transsion/search/viewmodel/SearchViewModel;", "mSearchViewModel", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "page", "c", "perPage", "Lcom/transsion/search/fragment/values/adapter/a;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/search/fragment/values/adapter/a;", "mSubjectAdapter", "e", "Ljava/lang/String;", "mKeyWord", "f", "mType", "Lcom/transsion/search/bean/Count;", "g", "Lcom/transsion/search/bean/Count;", "mCount", "h", "Lcom/transsion/search/bean/SearchWorkEntity;", "mEntity", "", "i", "Ljava/util/List;", "subjectList", "Lcom/transsion/search/bean/AccurateSubject;", "j", "Lcom/transsion/search/bean/AccurateSubject;", "accurateSubject", CampaignEx.JSON_KEY_AD_K, "Landroid/view/View;", "loadingView", "l", "Z", "isLoading", "Loh/a;", "m", "Loh/a;", "exposeUtil", "n", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SearchValuesTypeFragment extends LazyFragment<C28427l> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private SearchViewModel mSearchViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C18503a mSubjectAdapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Count mCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private SearchWorkEntity mEntity;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private AccurateSubject accurateSubject;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private View loadingView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int page = 1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int perPage = 12;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String mKeyWord = "";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int mType = 1;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final List subjectList = new ArrayList();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C26224a exposeUtil = new C26224a();

    /* JADX INFO: renamed from: com.transsion.search.fragment.values.SearchValuesTypeFragment$b */
    public static final class C18501b implements C26224a.b {
        C18501b() {
        }

        @Override // p646oh.C26224a.b
        /* JADX INFO: renamed from: a */
        public int mo77931a() {
            List<Object> data;
            C18503a c18503a = SearchValuesTypeFragment.this.mSubjectAdapter;
            if (c18503a == null || (data = c18503a.getData()) == null) {
                return 0;
            }
            return data.size();
        }

        @Override // p646oh.C26224a.b
        public void onItemViewVisible(boolean z11, int i11) {
            List<Object> data;
            if (z11) {
                C18503a c18503a = SearchValuesTypeFragment.this.mSubjectAdapter;
                SearchSubject searchSubject = (c18503a == null || (data = c18503a.getData()) == null) ? null : (SearchSubject) CollectionsKt.m97362l0(data, i11);
                SearchValuesFragment.INSTANCE.m77957d("", searchSubject != null ? searchSubject.getSubjectId() : null, "", searchSubject != null ? searchSubject.getOps() : null, i11, 3);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.search.fragment.values.SearchValuesTypeFragment$c */
    static final class C18502c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f59950a;

        C18502c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f59950a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f59950a;
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
            this.f59950a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m77959A0(SearchValuesTypeFragment searchValuesTypeFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List<Object> data;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        C18503a c18503a = searchValuesTypeFragment.mSubjectAdapter;
        m77967I0(searchValuesTypeFragment, (c18503a == null || (data = c18503a.getData()) == null) ? null : (SearchSubject) data.get(i11), i11, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final void m77960B0(SearchValuesTypeFragment searchValuesTypeFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (view.getId() != R$id.llDownload || C14557c.f51100a.m65671a(view.getId(), 2000L)) {
            return;
        }
        Object obj = adapter.getData().get(i11);
        searchValuesTypeFragment.m77979u0(obj instanceof Subject ? (Subject) obj : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final Unit m77961C0(SearchValuesTypeFragment searchValuesTypeFragment, SearchWorkEntity searchWorkEntity) {
        C27941f c27941fM36186h0;
        searchValuesTypeFragment.isLoading = false;
        searchValuesTypeFragment.showContentView();
        if (searchWorkEntity == null) {
            C18503a c18503a = searchValuesTypeFragment.mSubjectAdapter;
            if (c18503a != null && (c27941fM36186h0 = c18503a.m36186h0()) != null) {
                c27941fM36186h0.m108669v();
            }
        } else {
            Integer subjectType = searchWorkEntity.getSubjectType();
            Count count = searchValuesTypeFragment.mCount;
            if (Intrinsics.m97797c(subjectType, count != null ? count.getSubjectType() : null)) {
                searchValuesTypeFragment.m77968J0(searchWorkEntity);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m77962D0(SearchValuesTypeFragment searchValuesTypeFragment) {
        C27941f c27941fM36186h0;
        C18503a c18503a = searchValuesTypeFragment.mSubjectAdapter;
        if (c18503a == null || (c27941fM36186h0 = c18503a.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: renamed from: E0 */
    private final boolean m77963E0() {
        C18503a c18503a;
        List<Object> data;
        if (C27287m.f83003a.m106330e() || (c18503a = this.mSubjectAdapter) == null || (data = c18503a.getData()) == null || !data.isEmpty()) {
            return false;
        }
        PageStatusFragment.showNoNetworkView$default(this, false, 1, null);
        return true;
    }

    /* JADX INFO: renamed from: F0 */
    private final void m77964F0() {
        Function1 function1 = new Function1() { // from class: cr.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchValuesTypeFragment.m77965G0(this.f69095a, (AddToDownloadEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = AddToDownloadEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final Unit m77965G0(SearchValuesTypeFragment searchValuesTypeFragment, AddToDownloadEvent value) {
        C18503a c18503a;
        List<Object> data;
        Intrinsics.m97802h(value, "value");
        try {
            C18503a c18503a2 = searchValuesTypeFragment.mSubjectAdapter;
            int i11 = -1;
            if (c18503a2 != null && (data = c18503a2.getData()) != null) {
                Iterator<Object> it = data.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    if (Intrinsics.m97797c(((SearchSubject) it.next()).getSubjectId(), value.getSubjectId())) {
                        i11 = i12;
                        break;
                    }
                    i12++;
                }
            }
            if (i11 >= 0 && (c18503a = searchValuesTypeFragment.mSubjectAdapter) != null) {
                c18503a.notifyItemChanged(i11 + (c18503a != null ? c18503a.m36174a0() : 0));
            }
        } catch (Exception unused) {
            C26866a.a.m104898f(C26866a.f81698a, "search", " callback change data fail", false, 4, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: H0 */
    private final void m77966H0(SearchSubject subject, int position, int type) {
        String deeplink;
        Uri uriM65157g;
        if (subject != null) {
            if (position >= 0) {
                SearchValuesFragment.Companion companion = SearchValuesFragment.INSTANCE;
                companion.m77956b("", subject.getSubjectId(), "", subject.getOps(), position, type, companion.m77955a(), (128 & 128) != 0 ? null : null);
            }
            if (subject.getViewType() != 1) {
                if (this.mType != 3) {
                    C23889b c23889b = new C23889b();
                    c23889b.m94631o(3);
                    c23889b.m94630n(1);
                    c23889b.m94635s(subject);
                    FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
                    String name = C23889b.class.getName();
                    Intrinsics.m97801g(name, "getName(...)");
                    flowEventBus.postEvent(name, c23889b, 0L);
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
                Integer subjectType = subject.getSubjectType();
                int value = SubjectType.SHORT_TV.getValue();
                if (subjectType == null || subjectType.intValue() != value) {
                    Navigator navigatorM61773c = TheRouter.m61773c("/movie/detail");
                    Integer subjectType2 = subject.getSubjectType();
                    Navigator.m61845x(navigatorM61773c.m61852F("subject_type", subjectType2 != null ? subjectType2.intValue() : SubjectType.MOVIE.getValue()).m61857K("id", subject.getSubjectId()).m61857K("ops", subject.getOps()), requireContext(), null, 2, null);
                    return;
                } else {
                    DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
                    Context context = getContext();
                    Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    FragmentActivity fragmentActivity = (FragmentActivity) context;
                    C24655b logViewConfig = getLogViewConfig();
                    downloadManagerApiM87093a.m87086d0(fragmentActivity, logViewConfig != null ? logViewConfig.m96843f() : null, (384 & 4) != 0 ? "" : "", subject.getOps(), (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : false, (384 & 64) != 0 ? null : subject, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : null);
                    return;
                }
            }
            VerticalRank verticalRank = subject.getVerticalRank();
            if (verticalRank != null && (deeplink = verticalRank.getDeeplink()) != null && (uriM65157g = C14451b.f50862a.m65157g(Uri.parse(deeplink))) != null) {
                AbstractC5114k.m23932o(uriM65157g);
            }
        }
    }

    /* JADX INFO: renamed from: I0 */
    static /* synthetic */ void m77967I0(SearchValuesTypeFragment searchValuesTypeFragment, SearchSubject searchSubject, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 3;
        }
        searchValuesTypeFragment.m77966H0(searchSubject, i11, i12);
    }

    /* JADX INFO: renamed from: J0 */
    private final void m77968J0(SearchWorkEntity entity) {
        C18503a c18503a;
        List<Object> data;
        C27941f c27941fM36186h0;
        C18503a c18503a2;
        C27941f c27941fM36186h1;
        C18503a c18503a3;
        C27941f c27941fM36186h2;
        Pager pager;
        Pager pager2;
        Pager pager3;
        C27941f c27941fM36186h3;
        C18503a c18503a4 = this.mSubjectAdapter;
        if (c18503a4 != null && (c27941fM36186h3 = c18503a4.m36186h0()) != null) {
            c27941fM36186h3.m108667s();
        }
        this.page = (entity == null || (pager3 = entity.getPager()) == null) ? 1 : pager3.getNextPage();
        this.perPage = (entity == null || (pager2 = entity.getPager()) == null) ? 10 : pager2.getPerPage();
        List<SearchSubject> items = entity != null ? entity.getItems() : null;
        boolean hasMore = (entity == null || (pager = entity.getPager()) == null) ? false : pager.getHasMore();
        List<SearchSubject> list = items;
        if ((list == null || list.isEmpty()) && (c18503a = this.mSubjectAdapter) != null && (data = c18503a.getData()) != null && data.isEmpty()) {
            PageStatusFragment.showEmptyView$default(this, false, 1, null);
        }
        if (list == null || list.isEmpty()) {
            C18503a c18503a5 = this.mSubjectAdapter;
            if (c18503a5 != null && (c27941fM36186h0 = c18503a5.m36186h0()) != null) {
                c27941fM36186h0.m108668t(false);
            }
        } else {
            C18503a c18503a6 = this.mSubjectAdapter;
            if (c18503a6 != null) {
                c18503a6.mo36208q(list);
            }
        }
        if (!hasMore && (c18503a3 = this.mSubjectAdapter) != null && (c27941fM36186h2 = c18503a3.m36186h0()) != null) {
            c27941fM36186h2.m108668t(false);
        }
        if (entity != null || (c18503a2 = this.mSubjectAdapter) == null || (c27941fM36186h1 = c18503a2.m36186h0()) == null) {
            return;
        }
        c27941fM36186h1.m108669v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadMore() {
        RecyclerView recyclerView;
        Integer subjectType;
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.no_network_toast);
            C28427l c28427l = (C28427l) getMViewBinding();
            if (c28427l == null || (recyclerView = c28427l.f87211b) == null) {
                return;
            }
            recyclerView.postDelayed(new Runnable() { // from class: cr.g
                @Override // java.lang.Runnable
                public final void run() {
                    SearchValuesTypeFragment.m77962D0(this.f69097a);
                }
            }, 300L);
            return;
        }
        SearchViewModel searchViewModel = this.mSearchViewModel;
        if (searchViewModel != null) {
            int i11 = this.page;
            int i12 = this.perPage;
            String strM77980v0 = m77980v0();
            Count count = this.mCount;
            searchViewModel.m78076E(i11, i12, strM77980v0, (count == null || (subjectType = count.getSubjectType()) == null) ? 0 : subjectType.intValue());
        }
    }

    /* JADX INFO: renamed from: s0 */
    private final void m77977s0() {
        SearchWorkEntity searchWorkEntity = this.mEntity;
        final AccurateSubject accurateSubject = searchWorkEntity != null ? searchWorkEntity.getAccurateSubject() : null;
        if (accurateSubject != null) {
            Context context = getContext();
            AccurateSubjectView accurateSubjectView = context != null ? new AccurateSubjectView(context) : null;
            if (accurateSubjectView != null) {
                C18503a c18503a = this.mSubjectAdapter;
                if (c18503a != null) {
                    BaseQuickAdapter.m36130y(c18503a, accurateSubjectView, 0, 0, 6, null);
                }
                accurateSubjectView.setData(accurateSubject);
                accurateSubjectView.setOnClickListener(new View.OnClickListener() { // from class: cr.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SearchValuesTypeFragment.m77978t0(this.f69101a, accurateSubject, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m77978t0(SearchValuesTypeFragment searchValuesTypeFragment, AccurateSubject accurateSubject, View view) {
        searchValuesTypeFragment.m77966H0(accurateSubject.getSubject(), 0, 4);
    }

    /* JADX INFO: renamed from: u0 */
    private final void m77979u0(Subject subjectEntity) {
        String str;
        boolean z11;
        List<ResourceDetectors> resourceDetectors;
        String resourceLink;
        String subjectId;
        Context context;
        List<ResourceDetectors> resourceDetectors2;
        String resourceId;
        boolean z12;
        if (subjectEntity != null) {
            Integer subjectType = subjectEntity.getSubjectType();
            int value = SubjectType.SHORT_TV.getValue();
            if (subjectType != null && subjectType.intValue() == value) {
                DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
                Context context2 = getContext();
                Intrinsics.m97800f(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                FragmentActivity fragmentActivity = (FragmentActivity) context2;
                C24655b logViewConfig = getLogViewConfig();
                downloadManagerApiM87093a.m87086d0(fragmentActivity, logViewConfig != null ? logViewConfig.m96843f() : null, (384 & 4) != 0 ? "" : "", subjectEntity.getOps(), (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : true, (384 & 64) != 0 ? null : subjectEntity, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : null);
                return;
            }
        }
        if (C5123t.f17614a.m23960b()) {
            m77981x0(subjectEntity);
            return;
        }
        String str2 = "";
        if (subjectEntity == null || (resourceDetectors2 = subjectEntity.getResourceDetectors()) == null) {
            str = "";
            z11 = false;
        } else {
            if (resourceDetectors2.isEmpty()) {
                resourceId = "";
            } else {
                resourceId = resourceDetectors2.get(0).getResourceId();
                if (resourceId == null) {
                    resourceId = "";
                }
                Integer type = resourceDetectors2.get(0).getType();
                z12 = true;
                if ((type == null || type.intValue() != 1) && !resourceDetectors2.get(0).isMultiResolution()) {
                }
                str = resourceId;
                z11 = z12;
            }
            z12 = false;
            str = resourceId;
            z11 = z12;
        }
        DownloadManagerApi.C21276a c21276a = DownloadManagerApi.f66480j;
        if (DownloadManagerApi.m87075x0(c21276a.m87093a(), subjectEntity != null ? subjectEntity.getSubjectId() : null, str, z11, false, 8, null)) {
            if (subjectEntity == null || (subjectId = subjectEntity.getSubjectId()) == null || (context = getContext()) == null) {
                return;
            }
            DownloadManagerApi downloadManagerApiM87093a2 = c21276a.m87093a();
            C24655b logViewConfig2 = getLogViewConfig();
            DownloadManagerApi.m87078z0(downloadManagerApiM87093a2, subjectId, context, logViewConfig2 != null ? logViewConfig2.m96843f() : null, null, 8, null);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            if (subjectEntity != null && (resourceDetectors = subjectEntity.getResourceDetectors()) != null && !resourceDetectors.isEmpty() && (resourceLink = resourceDetectors.get(0).getResourceLink()) != null) {
                str2 = resourceLink;
            }
            String str3 = str2;
            DownloadManagerApi downloadManagerApiM87093a3 = c21276a.m87093a();
            Context context3 = getContext();
            Intrinsics.m97800f(context3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FragmentActivity fragmentActivity2 = (FragmentActivity) context3;
            C24655b logViewConfig3 = getLogViewConfig();
            downloadManagerApiM87093a3.m87080K(fragmentActivity2, subjectEntity, logViewConfig3 != null ? logViewConfig3.m96843f() : null, (960 & 8) != 0 ? "" : "", subjectEntity != null ? subjectEntity.getOps() : null, str3, (960 & 64) != 0 ? "" : null, (960 & 128) != 0 ? null : "download_subject", (960 & 256) != 0 ? null : null, (960 & 512) != 0 ? false : false);
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: v0 */
    private final String m77980v0() {
        String strM77951o0;
        Fragment parentFragment = getParentFragment();
        SearchValuesFragment searchValuesFragment = parentFragment instanceof SearchValuesFragment ? (SearchValuesFragment) parentFragment : null;
        return (searchValuesFragment == null || (strM77951o0 = searchValuesFragment.m77951o0()) == null) ? "" : strM77951o0;
    }

    /* JADX INFO: renamed from: x0 */
    private final void m77981x0(Subject item) {
        if (item == null) {
            return;
        }
        Navigator navigatorM61773c = TheRouter.m61773c("/playvideo/detail");
        Integer subjectType = item.getSubjectType();
        Navigator.m61845x(navigatorM61773c.m61852F("subject_type", subjectType != null ? subjectType.intValue() : SubjectType.MOVIE.getValue()).m61857K("id", item.getSubjectId()).m61857K("ops", item.getOps()), requireContext(), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y0 */
    private final void m77982y0() {
        RecyclerView recyclerView;
        C28427l c28427l = (C28427l) getMViewBinding();
        if (c28427l == null || (recyclerView = c28427l.f87211b) == null) {
            return;
        }
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(new NpaGridLayoutManager(recyclerView.getContext(), 3));
        Context context = recyclerView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        C18503a c18503a = new C18503a(context);
        c18503a.m36186h0().m108656D(new InterfaceC27568f() { // from class: cr.h
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                SearchValuesTypeFragment.m77983z0(this.f69098a);
            }
        });
        c18503a.m36227w1(new InterfaceC27566d() { // from class: cr.i
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                SearchValuesTypeFragment.m77959A0(this.f69099a, baseQuickAdapter, view, i11);
            }
        });
        c18503a.m36193l(R$id.llDownload);
        c18503a.m36216s1(new InterfaceC27564b() { // from class: cr.j
            @Override // p765s6.InterfaceC27564b
            /* JADX INFO: renamed from: a */
            public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                SearchValuesTypeFragment.m77960B0(this.f69100a, baseQuickAdapter, view, i11);
            }
        });
        this.mSubjectAdapter = c18503a;
        recyclerView.setAdapter(c18503a);
        recyclerView.addItemDecoration(new C25825b(AbstractC5776a0.m27313a(4.0f), AbstractC5776a0.m27313a(4.0f), AbstractC5776a0.m27313a(16.0f), AbstractC5776a0.m27313a(16.0f)));
        this.exposeUtil.m102685n(recyclerView, new C18501b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m77983z0(SearchValuesTypeFragment searchValuesTypeFragment) {
        searchValuesTypeFragment.loadMore();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getEmptyView(boolean isShowTitleLayout) {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        StateView stateView = new StateView(contextRequireContext);
        stateView.showData(2, getScreenType(), isShowPageStateLayoutTitle(), getPageStateLayoutTitle(), getEmptyDescText());
        return stateView;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getLoadingView() {
        if (this.loadingView == null) {
            this.loadingView = LayoutInflater.from(requireContext()).inflate(R$layout.loading_search_values_type_fragment_layout, (ViewGroup) getFlStateView(), false);
        }
        return this.loadingView;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public int getScreenType() {
        return 3;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        m77982y0();
        m77964F0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        SearchViewModel searchViewModel = (SearchViewModel) new C3227v0(this).m14969a(SearchViewModel.class);
        searchViewModel.m78083r().m14851j(getViewLifecycleOwner(), new C18502c(new Function1() { // from class: cr.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchValuesTypeFragment.m77961C0(this.f69096a, (SearchWorkEntity) obj);
            }
        }));
        this.mSearchViewModel = searchViewModel;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isShowPageStateLayoutTitle() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadData() {
        Integer subjectType;
        Integer subjectType2;
        Count count = this.mCount;
        if (count != null && (subjectType2 = count.getSubjectType()) != null && subjectType2.intValue() == 0) {
            this.page = 2;
            C18503a c18503a = this.mSubjectAdapter;
            if (c18503a != null) {
                c18503a.mo36201n1(this.subjectList);
            }
            m77977s0();
            return;
        }
        C26866a.a aVar = C26866a.f81698a;
        int i11 = this.page;
        int i12 = this.perPage;
        String strM77980v0 = m77980v0();
        Count count2 = this.mCount;
        C26866a.a.m104898f(aVar, "search", "SearchValuesTypeFragment --> loadDefaultData() -->  page = " + i11 + " -- perPage = " + i12 + " -- mKeyWord = " + strM77980v0 + " -- mCount?.subjectType = " + (count2 != null ? count2.getSubjectType() : null), false, 4, null);
        if (m77963E0()) {
            return;
        }
        showLoadingView();
        if (this.isLoading) {
            C26866a.a.m104901l(aVar, "search", "SearchValuesTypeFragment --> loadDefaultData() --> isLoading == true", false, 4, null);
            return;
        }
        this.isLoading = true;
        SearchViewModel searchViewModel = this.mSearchViewModel;
        if (searchViewModel != null) {
            int i13 = this.page;
            int i14 = this.perPage;
            String strM77980v1 = m77980v0();
            Count count3 = this.mCount;
            searchViewModel.m78076E(i13, i14, strM77980v1, (count3 == null || (subjectType = count3.getSubjectType()) == null) ? 0 : subjectType.intValue());
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.exposeUtil.m102682d();
        C18503a c18503a = this.mSubjectAdapter;
        if (c18503a != null) {
            c18503a.mo36201n1(null);
        }
        this.isLoading = false;
        this.page = 1;
    }

    @Override // com.transsion.baseui.fragment.LazyFragment, com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        C18503a c18503a;
        List<Object> data;
        super.onResume();
        if (m77963E0() || (c18503a = this.mSubjectAdapter) == null || (data = c18503a.getData()) == null || !data.isEmpty() || this.page != 1) {
            return;
        }
        retryLoadData();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        Integer subjectType;
        super.receiveArguments();
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("extend_value_keyword");
            if (string == null) {
                string = "";
            }
            this.mKeyWord = string;
            Serializable serializable = arguments.getSerializable("extend_value_count");
            this.mCount = serializable instanceof Count ? (Count) serializable : null;
            this.mType = arguments.getInt("extend_value_type");
        }
        SearchWorkEntity searchWorkEntity = this.mEntity;
        if (searchWorkEntity != null) {
            Count count = this.mCount;
            if (count != null && (subjectType = count.getSubjectType()) != null && subjectType.intValue() == 0) {
                List<SearchSubject> items = searchWorkEntity.getItems();
                if (!items.isEmpty()) {
                    Iterator<T> it = items.iterator();
                    while (it.hasNext()) {
                        this.subjectList.add((SearchSubject) it.next());
                    }
                }
            }
            this.accurateSubject = searchWorkEntity.getAccurateSubject();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        List<Object> data;
        C18503a c18503a = this.mSubjectAdapter;
        if (c18503a == null || (data = c18503a.getData()) == null || !data.isEmpty()) {
            loadMore();
        } else {
            C26866a.a.m104898f(C26866a.f81698a, "search", "SearchValuesTypeFragment --> retryLoadData() --> 重新连接网络的时候 加载数据", false, 4, null);
            lazyLoadData();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public C28427l getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28427l c28427lM109840c = C28427l.m109840c(inflater);
        Intrinsics.m97801g(c28427lM109840c, "inflate(...)");
        return c28427lM109840c;
    }
}
