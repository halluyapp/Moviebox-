package com.transsion.postdetail.p306ui.fragment;

import android.content.Context;
import android.os.Bundle;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1005savedstate.InterfaceC4393e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.InterfaceC5120q;
import com.blankj.utilcode.util.AbstractC5796o;
import com.p282tn.lib.widget.R$string;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.PostSubjectBean;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.Stat;
import com.transsion.moviedetailapi.bean.User;
import com.transsion.postdetail.bean.RoomCacheImage;
import com.transsion.postdetail.bean.RoomImageType;
import com.transsion.postdetail.p306ui.adapter.C16985i;
import com.transsion.postdetail.p306ui.adapter.PostAdapterFrom;
import com.transsion.postdetail.viewmodel.RoomPostViewModel;
import com.transsion.room.api.RoomHomeCacheEvent;
import com.transsion.usercenter.setting.labelsfeedback.AbstractC20825a;
import com.transsion.web.api.WebConstants;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.InterfaceC25204t1;
import p415fq.C23420k;
import p415fq.C23421l;
import p415fq.InterfaceC23416g;
import p462hj.C23860f;
import p550kj.C24655b;
import p743rh.C27287m;
import p844vo.C28170q;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 W2\u00020\u0001:\u0001XB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J%\u0010\u000b\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010\u0018J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010\u0003J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0003J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u0015H\u0016¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0015¢\u0006\u0004\b5\u0010\u0018J\u0015\u00106\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b6\u0010+J\r\u00107\u001a\u00020\u0004¢\u0006\u0004\b7\u0010\u0003J\r\u00108\u001a\u00020\u0004¢\u0006\u0004\b8\u0010\u0003J\r\u00109\u001a\u00020\u0015¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u0010\u0003J\u000f\u0010<\u001a\u00020\u0004H\u0016¢\u0006\u0004\b<\u0010\u0003J\u0017\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u001dH\u0016¢\u0006\u0004\b>\u0010 J\u000f\u0010?\u001a\u00020,H\u0016¢\u0006\u0004\b?\u0010.J\u000f\u0010@\u001a\u00020,H\u0016¢\u0006\u0004\b@\u0010.J\u000f\u0010A\u001a\u00020\u0015H\u0016¢\u0006\u0004\bA\u0010:J\u000f\u0010B\u001a\u00020\u0015H\u0016¢\u0006\u0004\bB\u0010:J\u000f\u0010C\u001a\u00020\u0010H\u0016¢\u0006\u0004\bC\u0010\u0012J\u000f\u0010D\u001a\u00020\u0015H\u0016¢\u0006\u0004\bD\u0010:R\u001b\u0010J\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010R\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010LR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010:¨\u0006Y"}, m97100d2 = {"Lcom/transsion/postdetail/ui/fragment/RoomPostExploreFragment;", "Lcom/transsion/postdetail/ui/fragment/RoomPostBaseFragment;", "<init>", "()V", "", "initRoomCacheData", "", "Lcom/transsion/postdetail/bean/RoomCacheImage;", "imageList", "Lcom/transsion/moviedetailapi/bean/PostSubjectBean;", "data", "preloadImage", "(Ljava/util/List;Lcom/transsion/moviedetailapi/bean/PostSubjectBean;)V", "bean", "getPreloadImages", "(Lcom/transsion/moviedetailapi/bean/PostSubjectBean;)Ljava/util/List;", "", "getCacheFirstIndex", "()I", "getLastVisiblePosition", "saveExposedDataCache", "", "isSaveInstance", "trySaveDataCache", "(Z)V", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", WebConstants.FIELD_ITEM, "isLowInteractiveItem", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "hidden", "onHiddenChanged", "onResume", "initViewModel", "lazyLoadData", "lazyLoadWithoutNet", "Lcom/transsion/postdetail/ui/adapter/PostAdapterFrom;", "postAdapterFrom", "()Lcom/transsion/postdetail/ui/adapter/PostAdapterFrom;", "onItemHeaderClick", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "", "onItemHeaderModuleName", "()Ljava/lang/String;", "isFirstLoad", "isRefresh", "loadData", "(ZZ)V", "updateData", "(Lcom/transsion/moviedetailapi/bean/PostSubjectBean;)V", "loadMoreCacheData", "deleteCacheRoom", "insertRoomCacheData", "updateCacheData", "hasInsertRoomCache", "()Z", "onDestroyView", "onStop", "outState", "onSaveInstanceState", "pageName", "subpageName", "isSwipeRefreshEnable", "isNeedInsertPublishPost", "tabIndex", "isStaggeredPost", "Lfq/l;", "trendingRoomsViewModel$delegate", "Lkotlin/Lazy;", "getTrendingRoomsViewModel", "()Lfq/l;", "trendingRoomsViewModel", "insertPostId", "Ljava/lang/String;", "insertPostOps", "roomCacheData", "Lcom/transsion/moviedetailapi/bean/PostSubjectBean;", "curExposurePosition", "I", "pageFrom", "Lkotlinx/coroutines/t1;", "saveExposedCacheJob", "Lkotlinx/coroutines/t1;", "isNewCacheStrategy", "Companion", "a", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class RoomPostExploreFragment extends RoomPostBaseFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String SUBPAGE_NAME = "room_home_explore";
    private int curExposurePosition;
    private String insertPostId;
    private String insertPostOps;
    private String pageFrom;
    private PostSubjectBean roomCacheData;
    private InterfaceC25204t1 saveExposedCacheJob;

    /* JADX INFO: renamed from: trendingRoomsViewModel$delegate, reason: from kotlin metadata */
    private final Lazy trendingRoomsViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(C23421l.class), new Function0<C3231x0>() { // from class: com.transsion.postdetail.ui.fragment.RoomPostExploreFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.postdetail.ui.fragment.RoomPostExploreFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.RoomPostExploreFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final RoomPostExploreFragment m74447a(String str, String str2, String str3) {
            RoomPostExploreFragment roomPostExploreFragment = new RoomPostExploreFragment();
            roomPostExploreFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("post_id", str2), TuplesKt.m97108a("ops", str3), TuplesKt.m97108a("parent_type", str)));
            return roomPostExploreFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.RoomPostExploreFragment$b */
    public static final class C17054b implements InterfaceC5120q {
        C17054b() {
        }

        @Override // ck.InterfaceC5120q
        /* JADX INFO: renamed from: a */
        public void mo23955a(int i11) {
            if (RoomPostExploreFragment.this.curExposurePosition < i11) {
                RoomPostExploreFragment.this.curExposurePosition = i11;
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.RoomPostExploreFragment$c */
    static final class C17055c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f57245a;

        C17055c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f57245a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f57245a;
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
            this.f57245a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.RoomPostExploreFragment$saveExposedDataCache$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.RoomPostExploreFragment$saveExposedDataCache$1", m97637f = "RoomPostExploreFragment.kt", m97638l = {}, m97639m = "invokeSuspend")
    @SourceDebugExtension
    static final class C170571 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<PostSubjectItem> $data;
        final /* synthetic */ int $maxCount;
        int label;
        final /* synthetic */ RoomPostExploreFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C170571(List<PostSubjectItem> list, RoomPostExploreFragment roomPostExploreFragment, int i11, Continuation<? super C170571> continuation) {
            super(2, continuation);
            this.$data = list;
            this.this$0 = roomPostExploreFragment;
            this.$maxCount = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C170571(this.$data, this.this$0, this.$maxCount, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C170571) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List listL0;
            int i11;
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            List<PostSubjectItem> list = this.$data;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                PostSubjectItem postSubjectItem = (PostSubjectItem) obj2;
                if (!postSubjectItem.getBuiltIn() && !postSubjectItem.isRoomCache()) {
                    arrayList.add(obj2);
                }
            }
            int i12 = 0;
            if (this.this$0.isNewCacheStrategy()) {
                int size = arrayList.size() - (arrayList.size() <= 8 ? arrayList.size() : 8);
                listL0 = size <= 0 ? CollectionsKt.m97506l() : arrayList.subList(RangesKt.m97935e(size - this.$maxCount, 0), size);
            } else {
                listL0 = CollectionsKt.m97334L0(arrayList, this.$maxCount);
            }
            C26866a.a aVar = C26866a.f81698a;
            String tag = this.this$0.getTAG();
            int size2 = this.$data.size();
            int size3 = arrayList.size();
            int size4 = listL0.size();
            List<PostSubjectItem> list2 = this.$data;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                i11 = 0;
            } else {
                Iterator<T> it = list2.iterator();
                i11 = 0;
                while (it.hasNext()) {
                    if (((PostSubjectItem) it.next()).getBuiltIn() && (i11 = i11 + 1) < 0) {
                        CollectionsKt.m97514t();
                    }
                }
            }
            List<PostSubjectItem> list3 = this.$data;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    if (((PostSubjectItem) it2.next()).isRoomCache() && (i12 = i12 + 1) < 0) {
                        CollectionsKt.m97514t();
                    }
                }
            }
            C26866a.a.m104898f(aVar, tag, "saveExposedDataCache, 总条数:" + size2 + ", 过滤后:" + size3 + ", 实际保存:" + size4 + " (builtIn:" + i11 + ", isRoomCache:" + i12 + ")", false, 4, null);
            if (listL0.isEmpty()) {
                C14496b.f50966a.m65344b().m61563M("post_explore_exposed_cache");
                return Unit.f75682a;
            }
            C14496b.f50966a.m65344b().putString("post_explore_exposed_cache", AbstractC5796o.m27447j(new PostSubjectBean(CollectionsKt.m97343U0(listL0), null, null, null)));
            return Unit.f75682a;
        }
    }

    private final int getCacheFirstIndex() {
        List<Object> data;
        C16985i mAdapter = getMAdapter();
        if (mAdapter == null || (data = mAdapter.getData()) == null) {
            return -1;
        }
        Iterator<Object> it = data.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (((PostSubjectItem) it.next()).isRoomCacheListStart()) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int getLastVisiblePosition() {
        RecyclerView recyclerView;
        C28170q c28170q = (C28170q) getMViewBinding();
        RecyclerView.AbstractC4214m layoutManager = (c28170q == null || (recyclerView = c28170q.f86594b) == null) ? null : recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return -1;
        }
        return linearLayoutManager.findLastVisibleItemPosition();
    }

    private final List<RoomCacheImage> getPreloadImages(PostSubjectBean bean) {
        List<Image> image;
        List<Image> image2;
        String avatar;
        String avatar2;
        ArrayList arrayList = new ArrayList();
        List<PostSubjectItem> items = bean.getItems();
        if (items != null) {
            for (PostSubjectItem postSubjectItem : items) {
                Group group = postSubjectItem.getGroup();
                if (group != null && (avatar2 = group.getAvatar()) != null) {
                    arrayList.add(new RoomCacheImage(avatar2, RoomImageType.ROOM_IMAGE.getValue(), 0));
                }
                User user = postSubjectItem.getUser();
                if (user != null && (avatar = user.getAvatar()) != null) {
                    arrayList.add(new RoomCacheImage(avatar, RoomImageType.AUTHOR_IMAGE.getValue(), 0));
                }
                Media media = postSubjectItem.getMedia();
                if (media != null && (image = media.getImage()) != null) {
                    for (Image image3 : image) {
                        Media media2 = postSubjectItem.getMedia();
                        if (media2 != null && (image2 = media2.getImage()) != null) {
                            if (image2.size() > 1) {
                                String url = image3.getUrl();
                                if (url != null) {
                                    arrayList.add(new RoomCacheImage(url, RoomImageType.POST_MORE.getValue(), image3.getWidth()));
                                }
                            } else {
                                String url2 = image3.getUrl();
                                if (url2 != null) {
                                    arrayList.add(new RoomCacheImage(url2, RoomImageType.POST_SINGLE.getValue(), image3.getWidth()));
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final C23421l getTrendingRoomsViewModel() {
        return (C23421l) this.trendingRoomsViewModel.getValue();
    }

    private final void initRoomCacheData() {
        String string = C14496b.f50966a.m65344b().getString("room_cache_data", "");
        if (string == null || string.length() == 0) {
            return;
        }
        this.roomCacheData = (PostSubjectBean) AbstractC5796o.m27441d(string, PostSubjectBean.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initViewModel$lambda$1(RoomPostExploreFragment roomPostExploreFragment, PostSubjectBean postSubjectBean) {
        String str;
        List<PostSubjectItem> items;
        PostSubjectItem postSubjectItem;
        String ops;
        if (postSubjectBean != null && postSubjectBean.getIsRefresh() && (str = roomPostExploreFragment.insertPostOps) != null && str.length() != 0 && (items = postSubjectBean.getItems()) != null && (postSubjectItem = (PostSubjectItem) CollectionsKt.m97361k0(items)) != null && Intrinsics.m97797c(postSubjectItem.getPostId(), roomPostExploreFragment.insertPostId) && ((ops = postSubjectItem.getOps()) == null || ops.length() == 0)) {
            postSubjectItem.setOps(roomPostExploreFragment.insertPostOps);
        }
        roomPostExploreFragment.updateData(postSubjectBean);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initViewModel$lambda$5(RoomPostExploreFragment roomPostExploreFragment, PostSubjectBean postSubjectBean) {
        String str;
        List<PostSubjectItem> items;
        PostSubjectItem postSubjectItem;
        String ops;
        if (postSubjectBean != null && postSubjectBean.getIsRefresh() && (str = roomPostExploreFragment.insertPostOps) != null && str.length() != 0 && (items = postSubjectBean.getItems()) != null && (postSubjectItem = (PostSubjectItem) CollectionsKt.m97361k0(items)) != null && Intrinsics.m97797c(postSubjectItem.getPostId(), roomPostExploreFragment.insertPostId) && ((ops = postSubjectItem.getOps()) == null || ops.length() == 0)) {
            postSubjectItem.setOps(roomPostExploreFragment.insertPostOps);
        }
        if (postSubjectBean == null) {
            return Unit.f75682a;
        }
        List<PostSubjectItem> items2 = postSubjectBean.getItems();
        Iterator<PostSubjectItem> it = items2 != null ? items2.iterator() : null;
        if (it != null) {
            while (it.hasNext()) {
                if (it.next().isVideo()) {
                    it.remove();
                }
            }
        }
        PostSubjectItem postSubjectItem2 = new PostSubjectItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, false, false, false, null, -1, 1, null);
        postSubjectItem2.setRoomCacheListStart(true);
        PostSubjectItem postSubjectItem3 = new PostSubjectItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, false, false, false, null, -1, 1, null);
        postSubjectItem3.setRoomCacheListEnd(true);
        List<PostSubjectItem> items3 = postSubjectBean.getItems();
        if (items3 != null) {
            items3.add(0, postSubjectItem2);
        }
        List<PostSubjectItem> items4 = postSubjectBean.getItems();
        if (items4 != null) {
            items4.add(postSubjectItem3);
        }
        List<PostSubjectItem> items5 = postSubjectBean.getItems();
        if (items5 != null) {
            Iterator<T> it2 = items5.iterator();
            while (it2.hasNext()) {
                ((PostSubjectItem) it2.next()).setRoomCache(true);
            }
        }
        if (roomPostExploreFragment.isNewCacheStrategy()) {
            roomPostExploreFragment.roomCacheData = postSubjectBean;
            AbstractC25136k.m99058d(AbstractC3226v.m14968a(roomPostExploreFragment), C25220y0.m99268b(), null, new RoomPostExploreFragment$initViewModel$2$4(postSubjectBean, roomPostExploreFragment.getViewLifecycleOwner().getLifecycle(), null), 2, null);
        }
        roomPostExploreFragment.preloadImage(roomPostExploreFragment.getPreloadImages(postSubjectBean), postSubjectBean);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initViewModel$lambda$7(RoomPostExploreFragment roomPostExploreFragment, Pair pair) {
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
            roomPostExploreFragment.pageFrom = c23420k.m92979g();
            c23420k.m92988r(null);
        }
        if (roomPostExploreFragment.pageFrom != null && (logViewConfig = roomPostExploreFragment.getLogViewConfig()) != null && (mapM96844g = logViewConfig.m96844g()) != null) {
        }
        InterfaceC4393e parentFragment = roomPostExploreFragment.getParentFragment();
        InterfaceC23416g interfaceC23416g = parentFragment instanceof InterfaceC23416g ? (InterfaceC23416g) parentFragment : null;
        if (interfaceC23416g != null) {
            interfaceC23416g.mo76977z(roomPostExploreFragment.pageFrom);
        }
        roomPostExploreFragment.insertPostOps = (String) pair.getSecond();
        roomPostExploreFragment.insertPostId = str;
        RoomPostBaseFragment.loadData$default(roomPostExploreFragment, false, true, 1, null);
        C28170q c28170q = (C28170q) roomPostExploreFragment.getMViewBinding();
        if (c28170q != null && (recyclerView = c28170q.f86594b) != null) {
            recyclerView.scrollToPosition(0);
        }
        roomPostExploreFragment.insertPostId = null;
        return Unit.f75682a;
    }

    private final boolean isLowInteractiveItem(PostSubjectItem item) {
        Long shareCount;
        Long commentCount;
        Long likeCount;
        Stat stat = item.getStat();
        long jLongValue = 0;
        long jLongValue2 = (stat == null || (likeCount = stat.getLikeCount()) == null) ? 0L : likeCount.longValue();
        Stat stat2 = item.getStat();
        long jLongValue3 = jLongValue2 + ((stat2 == null || (commentCount = stat2.getCommentCount()) == null) ? 0L : commentCount.longValue());
        Stat stat3 = item.getStat();
        if (stat3 != null && (shareCount = stat3.getShareCount()) != null) {
            jLongValue = shareCount.longValue();
        }
        return jLongValue3 + jLongValue < 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNewCacheStrategy() {
        RoomPostViewModel mViewModel = getMViewModel();
        return mViewModel != null && mViewModel.m75125X();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x0130 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:2:0x0000, B:3:0x000f, B:5:0x0015, B:7:0x0030, B:28:0x00ca, B:30:0x00d4, B:53:0x0126, B:55:0x0130, B:56:0x0178, B:58:0x0184, B:60:0x018a, B:62:0x0190, B:63:0x01d9, B:64:0x0200, B:32:0x00da, B:34:0x00e2, B:35:0x00e7, B:37:0x00ef, B:39:0x00f5, B:42:0x00fd, B:44:0x0104, B:46:0x010c, B:48:0x0112, B:51:0x011a, B:52:0x011f, B:11:0x004a, B:13:0x0052, B:14:0x0067, B:16:0x006f, B:18:0x007b, B:21:0x0083, B:23:0x008a, B:24:0x0095, B:26:0x009d, B:27:0x00b4, B:65:0x0238), top: B:69:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0184 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:2:0x0000, B:3:0x000f, B:5:0x0015, B:7:0x0030, B:28:0x00ca, B:30:0x00d4, B:53:0x0126, B:55:0x0130, B:56:0x0178, B:58:0x0184, B:60:0x018a, B:62:0x0190, B:63:0x01d9, B:64:0x0200, B:32:0x00da, B:34:0x00e2, B:35:0x00e7, B:37:0x00ef, B:39:0x00f5, B:42:0x00fd, B:44:0x0104, B:46:0x010c, B:48:0x0112, B:51:0x011a, B:52:0x011f, B:11:0x004a, B:13:0x0052, B:14:0x0067, B:16:0x006f, B:18:0x007b, B:21:0x0083, B:23:0x008a, B:24:0x0095, B:26:0x009d, B:27:0x00b4, B:65:0x0238), top: B:69:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x018a A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:2:0x0000, B:3:0x000f, B:5:0x0015, B:7:0x0030, B:28:0x00ca, B:30:0x00d4, B:53:0x0126, B:55:0x0130, B:56:0x0178, B:58:0x0184, B:60:0x018a, B:62:0x0190, B:63:0x01d9, B:64:0x0200, B:32:0x00da, B:34:0x00e2, B:35:0x00e7, B:37:0x00ef, B:39:0x00f5, B:42:0x00fd, B:44:0x0104, B:46:0x010c, B:48:0x0112, B:51:0x011a, B:52:0x011f, B:11:0x004a, B:13:0x0052, B:14:0x0067, B:16:0x006f, B:18:0x007b, B:21:0x0083, B:23:0x008a, B:24:0x0095, B:26:0x009d, B:27:0x00b4, B:65:0x0238), top: B:69:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0190 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:2:0x0000, B:3:0x000f, B:5:0x0015, B:7:0x0030, B:28:0x00ca, B:30:0x00d4, B:53:0x0126, B:55:0x0130, B:56:0x0178, B:58:0x0184, B:60:0x018a, B:62:0x0190, B:63:0x01d9, B:64:0x0200, B:32:0x00da, B:34:0x00e2, B:35:0x00e7, B:37:0x00ef, B:39:0x00f5, B:42:0x00fd, B:44:0x0104, B:46:0x010c, B:48:0x0112, B:51:0x011a, B:52:0x011f, B:11:0x004a, B:13:0x0052, B:14:0x0067, B:16:0x006f, B:18:0x007b, B:21:0x0083, B:23:0x008a, B:24:0x0095, B:26:0x009d, B:27:0x00b4, B:65:0x0238), top: B:69:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01d9 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:2:0x0000, B:3:0x000f, B:5:0x0015, B:7:0x0030, B:28:0x00ca, B:30:0x00d4, B:53:0x0126, B:55:0x0130, B:56:0x0178, B:58:0x0184, B:60:0x018a, B:62:0x0190, B:63:0x01d9, B:64:0x0200, B:32:0x00da, B:34:0x00e2, B:35:0x00e7, B:37:0x00ef, B:39:0x00f5, B:42:0x00fd, B:44:0x0104, B:46:0x010c, B:48:0x0112, B:51:0x011a, B:52:0x011f, B:11:0x004a, B:13:0x0052, B:14:0x0067, B:16:0x006f, B:18:0x007b, B:21:0x0083, B:23:0x008a, B:24:0x0095, B:26:0x009d, B:27:0x00b4, B:65:0x0238), top: B:69:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0200 A[SYNTHETIC] */
    private final void preloadImage(final List<RoomCacheImage> imageList, final PostSubjectBean data) {
        String strM94447e;
        int iM94454c;
        int i11;
        Integer width;
        try {
            Result.Companion companion = Result.INSTANCE;
            final Ref.IntRef intRef = new Ref.IntRef();
            for (RoomCacheImage roomCacheImage : imageList) {
                int type = roomCacheImage.getType();
                RoomImageType roomImageType = RoomImageType.ROOM_IMAGE;
                if (type == roomImageType.getValue()) {
                    strM94447e = C23860f.a.m94447e(C23860f.f72909a, roomCacheImage.getUrl(), AbstractC20825a.m85772b(36), false, true, 4, null);
                } else if (type == RoomImageType.AUTHOR_IMAGE.getValue()) {
                    strM94447e = C23860f.a.m94447e(C23860f.f72909a, roomCacheImage.getUrl(), AbstractC20825a.m85772b(16), false, true, 4, null);
                } else if (type == RoomImageType.POST_SINGLE.getValue()) {
                    C23860f.a aVar = C23860f.f72909a;
                    String url = roomCacheImage.getUrl();
                    Integer width2 = roomCacheImage.getWidth();
                    strM94447e = C23860f.a.m94447e(aVar, url, (width2 != null ? width2.intValue() : 0) > 540 ? AbstractC20825a.m85772b(240) : 540, false, true, 4, null);
                } else {
                    strM94447e = type == RoomImageType.POST_MORE.getValue() ? C23860f.a.m94447e(C23860f.f72909a, roomCacheImage.getUrl(), AbstractC20825a.m85772b(180), false, true, 4, null) : C23860f.a.m94447e(C23860f.f72909a, roomCacheImage.getUrl(), AbstractC20825a.m85772b(240), false, true, 4, null);
                }
                final String str = strM94447e;
                int type2 = roomCacheImage.getType();
                if (type2 == roomImageType.getValue()) {
                    iM94454c = AbstractC20825a.m85772b(36);
                } else if (type2 == RoomImageType.AUTHOR_IMAGE.getValue()) {
                    iM94454c = AbstractC20825a.m85772b(16);
                } else {
                    if (type2 == RoomImageType.POST_SINGLE.getValue()) {
                        Integer width3 = roomCacheImage.getWidth();
                        if ((width3 != null ? width3.intValue() : 0) > 540) {
                            iM94454c = AbstractC20825a.m85772b(240);
                        } else {
                            i11 = 540;
                        }
                    } else if (type2 == RoomImageType.POST_MORE.getValue()) {
                        Integer width4 = roomCacheImage.getWidth();
                        if ((width4 != null ? width4.intValue() : 0) > 540) {
                            iM94454c = AbstractC20825a.m85772b(240);
                        } else {
                            i11 = 540;
                        }
                    } else {
                        iM94454c = C23860f.f72909a.m94454c();
                    }
                    if (roomCacheImage.getType() == roomImageType.getValue()) {
                        C23860f.a aVar2 = C23860f.f72909a;
                        C23860f.a.m94451j(aVar2, C23860f.a.m94447e(aVar2, roomCacheImage.getUrl(), 180, false, true, 4, null), roomCacheImage.getUrl(), 180, null, 8, null);
                        C23860f.a.m94451j(aVar2, C23860f.a.m94447e(aVar2, roomCacheImage.getUrl(), 120, false, true, 4, null), roomCacheImage.getUrl(), 120, null, 8, null);
                    }
                    if (roomCacheImage.getType() != RoomImageType.POST_SINGLE.getValue()) {
                        width = roomCacheImage.getWidth();
                        if ((width != null ? width.intValue() : 0) > 540) {
                            C23860f.a aVar3 = C23860f.f72909a;
                            C23860f.a.m94451j(aVar3, C23860f.a.m94447e(aVar3, roomCacheImage.getUrl(), 540, false, true, 4, null), roomCacheImage.getUrl(), 540, null, 8, null);
                            C23860f.a.m94451j(aVar3, C23860f.a.m94447e(aVar3, roomCacheImage.getUrl(), 360, false, true, 4, null), roomCacheImage.getUrl(), 360, null, 8, null);
                        } else {
                            C23860f.a aVar4 = C23860f.f72909a;
                            C23860f.a.m94451j(aVar4, C23860f.a.m94447e(aVar4, roomCacheImage.getUrl(), 720, false, true, 4, null), roomCacheImage.getUrl(), 720, null, 8, null);
                        }
                    }
                    C26866a.a.m104898f(C26866a.f81698a, "ImageHelper", "preload url=" + str, false, 4, null);
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    C23860f.f72909a.m94456i(str, roomCacheImage.getUrl(), i11, new Function1() { // from class: com.transsion.postdetail.ui.fragment.n4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RoomPostExploreFragment.preloadImage$lambda$10$lambda$9$lambda$8(intRef, imageList, data, this, jCurrentTimeMillis, str, ((Boolean) obj).booleanValue());
                        }
                    });
                }
                i11 = iM94454c;
                if (roomCacheImage.getType() == roomImageType.getValue()) {
                    C23860f.a aVar5 = C23860f.f72909a;
                    C23860f.a.m94451j(aVar5, C23860f.a.m94447e(aVar5, roomCacheImage.getUrl(), 180, false, true, 4, null), roomCacheImage.getUrl(), 180, null, 8, null);
                    C23860f.a.m94451j(aVar5, C23860f.a.m94447e(aVar5, roomCacheImage.getUrl(), 120, false, true, 4, null), roomCacheImage.getUrl(), 120, null, 8, null);
                }
                if (roomCacheImage.getType() != RoomImageType.POST_SINGLE.getValue()) {
                    width = roomCacheImage.getWidth();
                    if ((width != null ? width.intValue() : 0) > 540) {
                        C23860f.a aVar6 = C23860f.f72909a;
                        C23860f.a.m94451j(aVar6, C23860f.a.m94447e(aVar6, roomCacheImage.getUrl(), 540, false, true, 4, null), roomCacheImage.getUrl(), 540, null, 8, null);
                        C23860f.a.m94451j(aVar6, C23860f.a.m94447e(aVar6, roomCacheImage.getUrl(), 360, false, true, 4, null), roomCacheImage.getUrl(), 360, null, 8, null);
                    } else {
                        C23860f.a aVar7 = C23860f.f72909a;
                        C23860f.a.m94451j(aVar7, C23860f.a.m94447e(aVar7, roomCacheImage.getUrl(), 720, false, true, 4, null), roomCacheImage.getUrl(), 720, null, 8, null);
                    }
                }
                C26866a.a.m104898f(C26866a.f81698a, "ImageHelper", "preload url=" + str, false, 4, null);
                final long jCurrentTimeMillis2 = System.currentTimeMillis();
                C23860f.f72909a.m94456i(str, roomCacheImage.getUrl(), i11, new Function1() { // from class: com.transsion.postdetail.ui.fragment.n4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RoomPostExploreFragment.preloadImage$lambda$10$lambda$9$lambda$8(intRef, imageList, data, this, jCurrentTimeMillis2, str, ((Boolean) obj).booleanValue());
                    }
                });
            }
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit preloadImage$lambda$10$lambda$9$lambda$8(Ref.IntRef intRef, List list, PostSubjectBean postSubjectBean, RoomPostExploreFragment roomPostExploreFragment, long j11, String str, boolean z11) {
        if (z11) {
            int i11 = intRef.element + 1;
            intRef.element = i11;
            if (i11 == list.size()) {
                C26866a.a.m104898f(C26866a.f81698a, "ImageHelper", "count  =" + intRef.element, false, 4, null);
                C14496b.f50966a.m65344b().putString("room_cache_data", AbstractC5796o.m27447j(postSubjectBean));
                RoomHomeCacheEvent roomHomeCacheEvent = new RoomHomeCacheEvent(true);
                FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
                String name = RoomHomeCacheEvent.class.getName();
                Intrinsics.m97801g(name, "getName(...)");
                flowEventBus.postEvent(name, roomHomeCacheEvent, 0L);
                roomPostExploreFragment.roomCacheData = postSubjectBean;
                roomPostExploreFragment.updateRoomCacheData(roomPostExploreFragment.getLastVisiblePosition(), postSubjectBean);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - j11;
            C26866a.a.m104898f(C26866a.f81698a, "ImageHelper", "预加载成功  url=" + str + " duration=" + jCurrentTimeMillis, false, 4, null);
        } else {
            intRef.element++;
            C26866a.a.m104898f(C26866a.f81698a, "ImageHelper", str + " 预加载失败", false, 4, null);
        }
        return Unit.f75682a;
    }

    private final void saveExposedDataCache() {
        List<Object> data;
        List listR0;
        C16985i mAdapter = getMAdapter();
        if (mAdapter == null || (data = mAdapter.getData()) == null || (listR0 = CollectionsKt.m97340R0(data)) == null) {
            return;
        }
        RoomPostViewModel mViewModel = getMViewModel();
        int iM75110F = mViewModel != null ? mViewModel.m75110F() : 24;
        InterfaceC25204t1 interfaceC25204t1 = this.saveExposedCacheJob;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
        this.saveExposedCacheJob = AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), C25220y0.m99268b(), null, new C170571(listR0, this, iM75110F, null), 2, null);
    }

    private final void trySaveDataCache(boolean isSaveInstance) {
        List<Object> data;
        int i11;
        List<Object> data2;
        List<Object> listSubList;
        String content;
        Group group;
        List<Object> data3;
        List<Object> data4;
        C26866a.a aVar = C26866a.f81698a;
        String tag = getTAG();
        C16985i mAdapter = getMAdapter();
        Integer numValueOf = (mAdapter == null || (data4 = mAdapter.getData()) == null) ? null : Integer.valueOf(data4.size());
        C26866a.a.m104898f(aVar, tag, "trySaveDataCache," + isSaveInstance + ", size:" + numValueOf + ", curExposurePosition:" + this.curExposurePosition, false, 4, null);
        C16985i mAdapter2 = getMAdapter();
        if (mAdapter2 == null || (data = mAdapter2.getData()) == null) {
            return;
        }
        int size = data.size();
        if (isNewCacheStrategy()) {
            i11 = 8;
            if (size < 8) {
                i11 = size;
            }
        } else {
            int i12 = this.curExposurePosition;
            i11 = size - i12 < 9 ? size - i12 : 9;
        }
        if (i11 <= 0) {
            return;
        }
        if (isNewCacheStrategy()) {
            if (size < i11) {
                return;
            }
        } else if (size <= i11) {
            return;
        }
        String tag2 = getTAG();
        int i13 = size - i11;
        C16985i mAdapter3 = getMAdapter();
        C26866a.a.m104898f(aVar, tag2, "explore-trySaveDataCache, " + i13 + "， " + i11 + ", size:" + ((mAdapter3 == null || (data3 = mAdapter3.getData()) == null) ? null : Integer.valueOf(data3.size())), false, 4, null);
        C16985i mAdapter4 = getMAdapter();
        if (mAdapter4 == null || (data2 = mAdapter4.getData()) == null || (listSubList = data2.subList(i13, size)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            PostSubjectItem postSubjectItem = (PostSubjectItem) it.next();
            if (!postSubjectItem.getBuiltIn() && !postSubjectItem.isRoomCache() && (isNewCacheStrategy() || !isLowInteractiveItem(postSubjectItem))) {
                arrayList.add(postSubjectItem);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C26866a.a aVar2 = C26866a.f81698a;
        String tag3 = getTAG();
        int size2 = arrayList.size();
        PostSubjectItem postSubjectItem2 = (PostSubjectItem) CollectionsKt.m97361k0(arrayList);
        String name = (postSubjectItem2 == null || (group = postSubjectItem2.getGroup()) == null) ? null : group.getName();
        PostSubjectItem postSubjectItem3 = (PostSubjectItem) CollectionsKt.m97361k0(arrayList);
        if (postSubjectItem3 != null) {
            String title = postSubjectItem3.getTitle();
            content = (title == null || title.length() == 0) ? postSubjectItem3.getContent() : postSubjectItem3.getTitle();
        } else {
            content = null;
        }
        C26866a.a.m104898f(aVar2, tag3, "explore-trySaveDataCache, " + size2 + "，name:" + name + "，content:" + content, false, 4, null);
        String strM27447j = AbstractC5796o.m27447j(new PostSubjectBean(arrayList, new Pager(Boolean.TRUE, "1", "", 0, 0), null, null));
        String str = isNewCacheStrategy() ? "post_explore_net_cache_exp_code" : "post_explore_net_cache_code";
        String str2 = isNewCacheStrategy() ? "post_explore_net_cache_exp" : "post_explore_net_cache";
        C14496b c14496b = C14496b.f50966a;
        int i14 = c14496b.m65344b().getInt(str, 0);
        int iHashCode = strM27447j.hashCode();
        if (i14 == iHashCode) {
            C26866a.a.m104898f(aVar2, getTAG(), "explore-trySaveDataCache, HashCode same:" + iHashCode, false, 4, null);
            return;
        }
        C26866a.a.m104898f(aVar2, getTAG(), "explore-SaveDataCache, oldCode:" + i14 + "，newCode:" + iHashCode, false, 4, null);
        c14496b.m65344b().putInt(str, iHashCode);
        c14496b.m65344b().putString(str2, strM27447j);
    }

    public final void deleteCacheRoom(PostSubjectItem item) {
        List<PostSubjectItem> items;
        PostSubjectBean postSubjectBean;
        List<PostSubjectItem> items2;
        List<PostSubjectItem> items3;
        List<PostSubjectItem> items4;
        List<PostSubjectItem> items5;
        List<PostSubjectItem> items6;
        Intrinsics.m97802h(item, "item");
        PostSubjectBean postSubjectBean2 = this.roomCacheData;
        if (postSubjectBean2 == null || postSubjectBean2 == null || (items = postSubjectBean2.getItems()) == null || items.isEmpty() || (postSubjectBean = this.roomCacheData) == null || (items2 = postSubjectBean.getItems()) == null || !items2.contains(item) || item.isRoomCacheListStart() || item.isRoomCacheListEnd()) {
            return;
        }
        PostSubjectBean postSubjectBean3 = this.roomCacheData;
        if (postSubjectBean3 != null && (items6 = postSubjectBean3.getItems()) != null) {
            items6.remove(item);
        }
        PostSubjectBean postSubjectBean4 = this.roomCacheData;
        if (postSubjectBean4 == null || (items3 = postSubjectBean4.getItems()) == null) {
            return;
        }
        if (items3.size() < 4) {
            C26866a.a.m104898f(C26866a.f81698a, getTAG(), "手动缓存已全部曝光，清除本地手动缓存", false, 4, null);
            C14496b.f50966a.m65344b().putString("room_cache_data", "");
            PostSubjectBean postSubjectBean5 = this.roomCacheData;
            if (postSubjectBean5 == null || (items5 = postSubjectBean5.getItems()) == null) {
                return;
            }
            items5.clear();
            return;
        }
        C26866a.a aVar = C26866a.f81698a;
        String tag = getTAG();
        PostSubjectBean postSubjectBean6 = this.roomCacheData;
        C26866a.a.m104898f(aVar, tag, "手动缓存已曝光部分，更改手动缓存 剩余：" + ((postSubjectBean6 == null || (items4 = postSubjectBean6.getItems()) == null) ? null : Integer.valueOf(items4.size())), false, 4, null);
        C14496b.f50966a.m65344b().putString("room_cache_data", AbstractC5796o.m27447j(this.roomCacheData));
    }

    public final boolean hasInsertRoomCache() {
        C16985i mAdapter;
        List<Object> data;
        C16985i mAdapter2 = getMAdapter();
        List<Object> data2 = mAdapter2 != null ? mAdapter2.getData() : null;
        if (data2 == null || data2.isEmpty() || (mAdapter = getMAdapter()) == null || (data = mAdapter.getData()) == null) {
            return false;
        }
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            if (((PostSubjectItem) it.next()).isRoomCacheListStart()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        C3187b0 c3187b0M75109E;
        C3187b0 c3187b0M75108D;
        RoomPostViewModel mViewModel = getMViewModel();
        if (mViewModel != null && (c3187b0M75108D = mViewModel.m75108D()) != null) {
            c3187b0M75108D.m14851j(this, new C17055c(new Function1() { // from class: com.transsion.postdetail.ui.fragment.k4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RoomPostExploreFragment.initViewModel$lambda$1(this.f57385a, (PostSubjectBean) obj);
                }
            }));
        }
        RoomPostViewModel mViewModel2 = getMViewModel();
        if (mViewModel2 != null && (c3187b0M75109E = mViewModel2.m75109E()) != null) {
            c3187b0M75109E.m14851j(this, new C17055c(new Function1() { // from class: com.transsion.postdetail.ui.fragment.l4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RoomPostExploreFragment.initViewModel$lambda$5(this.f57391a, (PostSubjectBean) obj);
                }
            }));
        }
        getTrendingRoomsViewModel().m92989b().m14851j(this, new C17055c(new Function1() { // from class: com.transsion.postdetail.ui.fragment.m4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomPostExploreFragment.initViewModel$lambda$7(this.f57397a, (Pair) obj);
            }
        }));
        setOnNumNotExposureListener(new C17054b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void insertRoomCacheData() {
        int cacheFirstIndex;
        RecyclerView recyclerView;
        C16985i mAdapter = getMAdapter();
        RecyclerView.AbstractC4214m layoutManager = null;
        List<Object> data = mAdapter != null ? mAdapter.getData() : null;
        if (data != null && !data.isEmpty() && !hasInsertRoomCache()) {
            updateCacheData();
            return;
        }
        if (!hasInsertRoomCache() || (cacheFirstIndex = getCacheFirstIndex()) <= 0) {
            return;
        }
        C28170q c28170q = (C28170q) getMViewBinding();
        if (c28170q != null && (recyclerView = c28170q.f86594b) != null) {
            layoutManager = recyclerView.getLayoutManager();
        }
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(cacheFirstIndex, 0);
        }
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment
    public boolean isNeedInsertPublishPost() {
        return true;
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment
    public boolean isStaggeredPost() {
        return false;
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment
    public boolean isSwipeRefreshEnable() {
        return false;
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment, com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadData() {
        C26866a.a.m104898f(C26866a.f81698a, getTAG(), "lazyLoadData parentTypeName:" + getMParentTypeName(), false, 4, null);
        super.lazyLoadData();
    }

    @Override // com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadWithoutNet() {
        super.lazyLoadWithoutNet();
        C26866a.a.m104898f(C26866a.f81698a, getTAG(), "lazyLoadWithoutNet [AB:" + (isNewCacheStrategy() ? "实验组-新缓存策略" : "对照组-旧缓存策略") + "]", false, 4, null);
        if (isNewCacheStrategy()) {
            RoomPostViewModel mViewModel = getMViewModel();
            if (mViewModel != null) {
                mViewModel.m75129g0();
            }
        } else {
            RoomPostViewModel mViewModel2 = getMViewModel();
            if (mViewModel2 != null) {
                mViewModel2.m75127e0();
            }
            RoomPostViewModel mViewModel3 = getMViewModel();
            if (mViewModel3 != null) {
                mViewModel3.m75130h0();
            }
        }
        RoomPostViewModel mViewModel4 = getMViewModel();
        if (mViewModel4 != null) {
            mViewModel4.m75128f0();
        }
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment
    public void loadData(boolean isFirstLoad, boolean isRefresh) {
        Context context = getContext();
        if (context != null) {
            if (isRefresh) {
                InterfaceC4393e parentFragment = getParentFragment();
                if (parentFragment instanceof InterfaceC23416g) {
                    ((InterfaceC23416g) parentFragment).mo76970G();
                }
            }
            RoomPostViewModel mViewModel = getMViewModel();
            if (mViewModel != null) {
                mViewModel.m75114J(context, isFirstLoad, isRefresh, getMPage(), 8, this.insertPostId);
            }
        }
    }

    public final void loadMoreCacheData(boolean isRefresh) {
        String string = C14496b.f50966a.m65344b().getString("room_cache_data", "");
        if (string == null || string.length() == 0 || isRefresh) {
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.no_network_toast);
                return;
            }
            RoomPostViewModel mViewModel = getMViewModel();
            if (mViewModel != null) {
                mViewModel.m75115K(false, getMPage(), 30, "");
            }
        }
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment, com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.insertPostId = arguments != null ? arguments.getString("post_id") : null;
        Bundle arguments2 = getArguments();
        this.insertPostOps = arguments2 != null ? arguments2.getString("ops") : null;
        Bundle arguments3 = getArguments();
        setMParentTypeName(arguments3 != null ? arguments3.getString("parent_type") : null);
        C26866a.a.m104898f(C26866a.f81698a, getTAG(), "Explore onCreate mParentTypeName:" + getMParentTypeName(), false, 4, null);
        initRoomCacheData();
    }

    @Override // com.transsion.baseui.fragment.LazyFragment, com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        InterfaceC25204t1 interfaceC25204t1 = this.saveExposedCacheJob;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
        super.onDestroyView();
        if (isNewCacheStrategy()) {
            return;
        }
        trySaveDataCache(false);
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment, com.transsion.baseui.fragment.LazyFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        C23420k c23420k;
        String strM92976d;
        super.onHiddenChanged(hidden);
        if (hidden || (strM92976d = (c23420k = C23420k.f71413a).m92976d()) == null || strM92976d.length() == 0) {
            return;
        }
        C3187b0 c3187b0M92989b = getTrendingRoomsViewModel().m92989b();
        String strM92976d2 = c23420k.m92976d();
        Intrinsics.m97799e(strM92976d2);
        c3187b0M92989b.mo14858q(new Pair(strM92976d2, c23420k.m92977e()));
        String strM92979g = c23420k.m92979g();
        if (strM92979g != null && strM92979g.length() != 0) {
            this.pageFrom = c23420k.m92979g();
            c23420k.m92988r(null);
        }
        c23420k.m92985o(null);
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
        String strM92976d = c23420k.m92976d();
        if (strM92976d == null || strM92976d.length() == 0) {
            return;
        }
        C3187b0 c3187b0M92989b = getTrendingRoomsViewModel().m92989b();
        String strM92976d2 = c23420k.m92976d();
        Intrinsics.m97799e(strM92976d2);
        c3187b0M92989b.mo14858q(new Pair(strM92976d2, c23420k.m92977e()));
        String strM92979g = c23420k.m92979g();
        if (strM92979g != null && strM92979g.length() != 0) {
            this.pageFrom = c23420k.m92979g();
            c23420k.m92988r(null);
        }
        c23420k.m92985o(null);
        c23420k.m92986p(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.m97802h(outState, "outState");
        super.onSaveInstanceState(outState);
        if (isNewCacheStrategy()) {
            return;
        }
        trySaveDataCache(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (isNewCacheStrategy()) {
            saveExposedDataCache();
            trySaveDataCache(false);
        }
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
        return SUBPAGE_NAME;
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment
    /* JADX INFO: renamed from: tabIndex */
    public int getMTabIndex() {
        return 0;
    }

    public final void updateCacheData() {
        PostSubjectBean postSubjectBean;
        List<PostSubjectItem> items;
        int lastVisiblePosition = getLastVisiblePosition();
        if (lastVisiblePosition <= 0 || (postSubjectBean = this.roomCacheData) == null || (items = postSubjectBean.getItems()) == null) {
            return;
        }
        int i11 = lastVisiblePosition + 1;
        C16985i mAdapter = getMAdapter();
        if (i11 < (mAdapter != null ? mAdapter.getItemCount() : 0)) {
            C16985i mAdapter2 = getMAdapter();
            if (mAdapter2 != null) {
                mAdapter2.mo36202o(i11, items);
                return;
            }
            return;
        }
        C16985i mAdapter3 = getMAdapter();
        if (mAdapter3 != null) {
            mAdapter3.mo36202o(lastVisiblePosition, items);
        }
    }

    @Override // com.transsion.postdetail.p306ui.fragment.RoomPostBaseFragment
    public void updateData(PostSubjectBean bean) {
        super.updateData(bean);
        if (isNewCacheStrategy()) {
            saveExposedDataCache();
        }
    }
}
