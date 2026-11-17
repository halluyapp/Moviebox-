package com.transsion.postdetail.p306ui.fragment;

import android.os.Bundle;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.RecyclerView;
import ck.InterfaceC5120q;
import com.blankj.utilcode.util.AbstractC5796o;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.PostSubjectBean;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.RoomTabItem;
import com.transsion.postdetail.p306ui.adapter.C16985i;
import com.transsion.postdetail.p306ui.adapter.PostAdapterFrom;
import com.transsion.postdetail.viewmodel.RoomPostViewModel;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p415fq.C23419j;
import p415fq.C23420k;
import p550kj.C24655b;
import p844vo.C28170q;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u0000 :2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010\u001cJ\u000f\u0010%\u001a\u00020\u001aH\u0016¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010'J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010'R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0016\u00103\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0018\u00106\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0018\u00109\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107¨\u0006<"}, m97100d2 = {"Lcom/transsion/postdetail/ui/fragment/RoomPostSubFragment;", "Lcom/transsion/postdetail/ui/fragment/RoomPostBaseFragment;", "<init>", "()V", "", "isSaveInstance", "", "trySaveDataCache", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "initViewData", "initViewModel", "outState", "onSaveInstanceState", "onDestroyView", "lazyLoadWithoutNet", "Lcom/transsion/postdetail/ui/adapter/PostAdapterFrom;", "postAdapterFrom", "()Lcom/transsion/postdetail/ui/adapter/PostAdapterFrom;", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", WebConstants.FIELD_ITEM, "onItemHeaderClick", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "", "onItemHeaderModuleName", "()Ljava/lang/String;", "hidden", "onHiddenChanged", "onResume", "isFirstLoad", "isRefresh", "loadData", "(ZZ)V", "pageName", "subpageName", "isSwipeRefreshEnable", "()Z", "isNeedInsertPublishPost", "", "tabIndex", "()I", "isStaggeredPost", "Lfq/j;", "trendingImageRoomsViewModel$delegate", "Lkotlin/Lazy;", "getTrendingImageRoomsViewModel", "()Lfq/j;", "trendingImageRoomsViewModel", "mTabIndex", "I", "curExposurePosition", "pageFrom", "Ljava/lang/String;", "insertPostId", "insertPostOps", "Companion", "a", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public class RoomPostSubFragment extends RoomPostBaseFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAB_INDEX = "index";
    private static final String TAB_ITEM = "tab";
    private int curExposurePosition;
    private String insertPostId;
    private String insertPostOps;
    private int mTabIndex;
    private String pageFrom;

    /* JADX INFO: renamed from: trendingImageRoomsViewModel$delegate, reason: from kotlin metadata */
    private final Lazy trendingImageRoomsViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(C23419j.class), new Function0<C3231x0>() { // from class: com.transsion.postdetail.ui.fragment.RoomPostSubFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.postdetail.ui.fragment.RoomPostSubFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.RoomPostSubFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final RoomPostSubFragment m74469a(String str, RoomTabItem item, int i11) {
            Intrinsics.m97802h(item, "item");
            RoomPostSubFragment roomPostSubFragment = new RoomPostSubFragment();
            roomPostSubFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a(RoomPostSubFragment.TAB_ITEM, item), TuplesKt.m97108a(RoomPostSubFragment.TAB_INDEX, Integer.valueOf(i11)), TuplesKt.m97108a("parent_type", str)));
            return roomPostSubFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.RoomPostSubFragment$b */
    public static final class C17072b implements InterfaceC5120q {
        C17072b() {
        }

        @Override // ck.InterfaceC5120q
        /* JADX INFO: renamed from: a */
        public void mo23955a(int i11) {
            if (RoomPostSubFragment.this.curExposurePosition < i11) {
                RoomPostSubFragment.this.curExposurePosition = i11;
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.RoomPostSubFragment$c */
    static final class C17073c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f57252a;

        C17073c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f57252a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f57252a;
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
            this.f57252a.invoke(obj);
        }
    }

    private final C23419j getTrendingImageRoomsViewModel() {
        return (C23419j) this.trendingImageRoomsViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initViewModel$lambda$1(RoomPostSubFragment roomPostSubFragment, PostSubjectBean postSubjectBean) {
        String str;
        List<PostSubjectItem> items;
        PostSubjectItem postSubjectItem;
        String ops;
        if (postSubjectBean != null && postSubjectBean.getIsRefresh() && (str = roomPostSubFragment.insertPostOps) != null && str.length() != 0 && (items = postSubjectBean.getItems()) != null && (postSubjectItem = (PostSubjectItem) CollectionsKt.m97361k0(items)) != null && Intrinsics.m97797c(postSubjectItem.getPostId(), roomPostSubFragment.insertPostId) && ((ops = postSubjectItem.getOps()) == null || ops.length() == 0)) {
            postSubjectItem.setOps(roomPostSubFragment.insertPostOps);
        }
        roomPostSubFragment.updateData(postSubjectBean);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initViewModel$lambda$3(RoomPostSubFragment roomPostSubFragment, Pair pair) {
        RecyclerView recyclerView;
        C24655b logViewConfig;
        HashMap mapM96844g;
        String str = pair != null ? (String) pair.getFirst() : null;
        if (str == null || str.length() == 0) {
            return Unit.f75682a;
        }
        C23420k c23420k = C23420k.f71413a;
        String strM92979g = c23420k.m92979g();
        if (strM92979g != null && strM92979g.length() != 0) {
            roomPostSubFragment.pageFrom = c23420k.m92979g();
            c23420k.m92988r(null);
        }
        if (roomPostSubFragment.pageFrom != null && (logViewConfig = roomPostSubFragment.getLogViewConfig()) != null && (mapM96844g = logViewConfig.m96844g()) != null) {
        }
        roomPostSubFragment.insertPostOps = (String) pair.getSecond();
        roomPostSubFragment.insertPostId = str;
        RoomPostBaseFragment.loadData$default(roomPostSubFragment, false, true, 1, null);
        C28170q c28170q = (C28170q) roomPostSubFragment.getMViewBinding();
        if (c28170q != null && (recyclerView = c28170q.f86594b) != null) {
            recyclerView.scrollToPosition(0);
        }
        roomPostSubFragment.insertPostId = null;
        return Unit.f75682a;
    }

    private final void trySaveDataCache(boolean isSaveInstance) {
        String tabId;
        C16985i mAdapter;
        List<Object> data;
        List<Object> data2;
        List<Object> listSubList;
        String content;
        Group group;
        List<Object> data3;
        List<Object> data4;
        C26866a.a aVar = C26866a.f81698a;
        String tag = getTAG();
        RoomTabItem mTopTab = getMTopTab();
        String tabId2 = mTopTab != null ? mTopTab.getTabId() : null;
        C16985i mAdapter2 = getMAdapter();
        Integer numValueOf = (mAdapter2 == null || (data4 = mAdapter2.getData()) == null) ? null : Integer.valueOf(data4.size());
        C26866a.a.m104898f(aVar, tag, "trySaveDataCache," + isSaveInstance + " tabId:" + tabId2 + ", size:" + numValueOf + ", curExposurePosition:" + this.curExposurePosition, false, 4, null);
        RoomTabItem mTopTab2 = getMTopTab();
        if (mTopTab2 == null || (tabId = mTopTab2.getTabId()) == null || (mAdapter = getMAdapter()) == null || (data = mAdapter.getData()) == null) {
            return;
        }
        int size = data.size();
        int i11 = this.curExposurePosition;
        int i12 = size - i11 < 9 ? size - i11 : 9;
        if (i12 > 0 && size > i12) {
            String tag2 = getTAG();
            int i13 = size - i12;
            C16985i mAdapter3 = getMAdapter();
            C26866a.a.m104898f(aVar, tag2, "trySaveDataCache, " + i13 + "， " + i12 + ", size:" + ((mAdapter3 == null || (data3 = mAdapter3.getData()) == null) ? null : Integer.valueOf(data3.size())), false, 4, null);
            C16985i mAdapter4 = getMAdapter();
            if (mAdapter4 == null || (data2 = mAdapter4.getData()) == null || (listSubList = data2.subList(i13, size)) == null) {
                return;
            }
            String tag3 = getTAG();
            int size2 = listSubList.size();
            PostSubjectItem postSubjectItem = (PostSubjectItem) CollectionsKt.m97361k0(listSubList);
            String name = (postSubjectItem == null || (group = postSubjectItem.getGroup()) == null) ? null : group.getName();
            PostSubjectItem postSubjectItem2 = (PostSubjectItem) CollectionsKt.m97361k0(listSubList);
            if (postSubjectItem2 != null) {
                String title = postSubjectItem2.getTitle();
                content = (title == null || title.length() == 0) ? postSubjectItem2.getContent() : postSubjectItem2.getTitle();
            } else {
                content = null;
            }
            C26866a.a.m104898f(aVar, tag3, "trySaveDataCache, " + size2 + "，name:" + name + "，content:" + content, false, 4, null);
            String strM27447j = AbstractC5796o.m27447j(new PostSubjectBean(listSubList, new Pager(Boolean.TRUE, "1", "", 0, 0), null, null));
            C14496b c14496b = C14496b.f50966a;
            int i14 = c14496b.m65344b().getInt("post_sub_page_cache_code", 0);
            int iHashCode = strM27447j.hashCode();
            if (i14 == iHashCode) {
                C26866a.a.m104898f(aVar, getTAG(), "trySaveDataCache, HashCode same:" + iHashCode, false, 4, null);
                return;
            }
            C26866a.a.m104898f(aVar, getTAG(), "SaveDataCache, oldCode:" + i14 + "，newCode:" + iHashCode, false, 4, null);
            c14496b.m65344b().putInt("post_sub_page_cache_code", iHashCode);
            c14496b.m65344b().putString("post_sub_page_cache_" + tabId, strM27447j);
        }
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment, com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        super.initViewData();
        setOnNumNotExposureListener(new C17072b());
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        C3187b0 c3187b0M75124W;
        RoomPostViewModel mViewModel = getMViewModel();
        if (mViewModel != null && (c3187b0M75124W = mViewModel.m75124W()) != null) {
            c3187b0M75124W.m14851j(this, new C17073c(new Function1() { // from class: com.transsion.postdetail.ui.fragment.d5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RoomPostSubFragment.initViewModel$lambda$1(this.f57315a, (PostSubjectBean) obj);
                }
            }));
        }
        getTrendingImageRoomsViewModel().m92970b().m14851j(this, new C17073c(new Function1() { // from class: com.transsion.postdetail.ui.fragment.e5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomPostSubFragment.initViewModel$lambda$3(this.f57323a, (Pair) obj);
            }
        }));
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment
    public boolean isNeedInsertPublishPost() {
        return false;
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment
    public boolean isStaggeredPost() {
        return false;
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment
    public boolean isSwipeRefreshEnable() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadWithoutNet() {
        RoomPostViewModel mViewModel;
        showLoadingView();
        RoomTabItem mTopTab = getMTopTab();
        if (mTopTab == null || (mViewModel = getMViewModel()) == null) {
            return;
        }
        mViewModel.m75131i0(mTopTab.getTabId());
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment
    public void loadData(boolean isFirstLoad, boolean isRefresh) {
        RoomPostViewModel mViewModel;
        C26866a.a.m104898f(C26866a.f81698a, getTAG(), "loadData isRefresh:" + isRefresh, false, 4, null);
        RoomTabItem mTopTab = getMTopTab();
        if (mTopTab == null || (mViewModel = getMViewModel()) == null) {
            return;
        }
        RoomPostViewModel.m75073P(mViewModel, isFirstLoad, isRefresh, mTopTab.getTabId(), getMPage(), this.insertPostId, 0, 32, null);
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment, com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable(TAB_ITEM) : null;
        setMTopTab(serializable instanceof RoomTabItem ? (RoomTabItem) serializable : null);
        Bundle arguments2 = getArguments();
        this.mTabIndex = arguments2 != null ? arguments2.getInt(TAB_INDEX) : 0;
        Bundle arguments3 = getArguments();
        setMParentTypeName(arguments3 != null ? arguments3.getString("parent_type") : null);
        super.onCreate(savedInstanceState);
    }

    @Override // com.transsion.baseui.fragment.LazyFragment, com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        trySaveDataCache(false);
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment, com.transsion.baseui.fragment.LazyFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        C23420k c23420k;
        String strM92975c;
        super.onHiddenChanged(hidden);
        if (hidden || (strM92975c = (c23420k = C23420k.f71413a).m92975c()) == null || strM92975c.length() == 0) {
            return;
        }
        C3187b0 c3187b0M92970b = getTrendingImageRoomsViewModel().m92970b();
        String strM92975c2 = c23420k.m92975c();
        Intrinsics.m97799e(strM92975c2);
        c3187b0M92970b.mo14858q(new Pair(strM92975c2, c23420k.m92977e()));
        String strM92979g = c23420k.m92979g();
        if (strM92979g != null && strM92979g.length() != 0) {
            this.pageFrom = c23420k.m92979g();
            c23420k.m92988r(null);
        }
        c23420k.m92984n(null);
        c23420k.m92986p(null);
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment
    public void onItemHeaderClick(PostSubjectItem item) {
        openUserCenter(item);
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment
    public String onItemHeaderModuleName() {
        return "group";
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment, com.transsion.baseui.fragment.LazyFragment, com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C23420k c23420k = C23420k.f71413a;
        String strM92975c = c23420k.m92975c();
        if (strM92975c == null || strM92975c.length() == 0) {
            return;
        }
        C3187b0 c3187b0M92970b = getTrendingImageRoomsViewModel().m92970b();
        String strM92975c2 = c23420k.m92975c();
        Intrinsics.m97799e(strM92975c2);
        c3187b0M92970b.mo14858q(new Pair(strM92975c2, c23420k.m92977e()));
        String strM92979g = c23420k.m92979g();
        if (strM92979g != null && strM92979g.length() != 0) {
            this.pageFrom = c23420k.m92979g();
            c23420k.m92988r(null);
        }
        c23420k.m92984n(null);
        c23420k.m92986p(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.m97802h(outState, "outState");
        super.onSaveInstanceState(outState);
        trySaveDataCache(true);
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment
    public String pageName() {
        return "room_home";
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment
    public PostAdapterFrom postAdapterFrom() {
        return PostAdapterFrom.DEFAULT;
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment
    public String subpageName() {
        String tabId;
        RoomTabItem mTopTab = getMTopTab();
        if (mTopTab == null || (tabId = mTopTab.getTabId()) == null) {
            tabId = "";
        }
        return "room_home_" + tabId;
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment
    /* JADX INFO: renamed from: tabIndex, reason: from getter */
    public int getMTabIndex() {
        return this.mTabIndex;
    }
}
