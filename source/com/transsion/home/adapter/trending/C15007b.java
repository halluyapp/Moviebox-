package com.transsion.home.adapter.trending;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.home.adapter.suboperate.provider.C14959c;
import com.transsion.home.adapter.suboperate.provider.C14971i;
import com.transsion.home.adapter.suboperate.provider.C14975k;
import com.transsion.home.adapter.suboperate.provider.C14976k0;
import com.transsion.home.adapter.suboperate.provider.C14990r0;
import com.transsion.home.adapter.suboperate.provider.C14995w;
import com.transsion.home.adapter.suboperate.provider.SubHorizontalBannerProvider;
import com.transsion.home.adapter.trending.provider.C15034e;
import com.transsion.home.adapter.trending.provider.C15035e0;
import com.transsion.home.adapter.trending.provider.C15040h;
import com.transsion.home.adapter.trending.provider.C15042i;
import com.transsion.home.adapter.trending.provider.C15043i0;
import com.transsion.home.adapter.trending.provider.C15050m;
import com.transsion.home.adapter.trending.provider.C15052n;
import com.transsion.home.adapter.trending.provider.C15053n0;
import com.transsion.home.adapter.trending.provider.C15064y;
import com.transsion.home.adapter.trending.provider.RoomProvider;
import com.transsion.home.adapter.trending.provider.SubjectItemProvider;
import com.transsion.home.adapter.trending.provider.SubjectSingleImgItemProvider;
import com.transsion.home.bean.BannerBean;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.bean.RankingData;
import com.transsion.home.bean.RankingListData;
import com.transsion.home.bean.RankingListItem;
import com.transsion.home.fragment.tab.TrendingFragment;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.home.preload.InterfaceC15428b;
import com.transsion.home.viewmodel.TrendingViewModel;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.Trailer;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p579ll.C25646b;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import p842vl.C28123e;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.home.adapter.trending.b */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B]\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u001e\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000e2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010&R*\u0010.\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0017\u00102\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u00101RC\u0010;\u001a*\u0012\u0004\u0012\u000204\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020503j\u0014\u0012\u0004\u0012\u000204\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000205`68FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, m97100d2 = {"Lcom/transsion/home/adapter/trending/b;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/home/bean/OperateItem;", "Lu6/i;", "Lll/b;", "exposureHelper", "Lcom/transsion/home/preload/b;", "xmlPreloadImp", "Lcom/transsion/home/fragment/tab/TrendingFragment;", "fragment", "Lcom/transsion/home/viewmodel/TrendingViewModel;", "viewModel", "Lkotlin/Function1;", "", "", "onAppointmentCLick", "isTablet", "", "gridCount", "<init>", "(Lll/b;Lcom/transsion/home/preload/b;Lcom/transsion/home/fragment/tab/TrendingFragment;Lcom/transsion/home/viewmodel/TrendingViewModel;Lkotlin/jvm/functions/Function1;ZI)V", "", "data", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "", "list", "n1", "(Ljava/util/Collection;)V", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "B0", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "G", "Lll/b;", "H", "Z", "I", "Lkotlin/Function0;", "J", "Lkotlin/jvm/functions/Function0;", "R1", "()Lkotlin/jvm/functions/Function0;", "U1", "(Lkotlin/jvm/functions/Function0;)V", "retryListener", "K", "T1", "()Z", "isGridTrendingAdapter", "Ljava/util/HashMap;", "", "Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "Lkotlin/collections/HashMap;", "L", "Lkotlin/Lazy;", "S1", "()Ljava/util/HashMap;", "supportProviders", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class C15007b extends BaseProviderMultiAdapter<OperateItem> implements InterfaceC27944i {

    /* JADX INFO: renamed from: M */
    public static final int f52443M = 8;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C25646b exposureHelper;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final boolean isTablet;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int gridCount;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private Function0<Unit> retryListener;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final boolean isGridTrendingAdapter;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final Lazy supportProviders;

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.b$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52450a;

        static {
            int[] iArr = new int[PostItemType.values().length];
            try {
                iArr[PostItemType.SUBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostItemType.RANKING_MOVIE_HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostItemType.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f52450a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15007b(C25646b c25646b, final InterfaceC15428b interfaceC15428b, final TrendingFragment fragment, final TrendingViewModel trendingViewModel, final Function1<? super Function1<? super Boolean, Unit>, Unit> onAppointmentCLick, boolean z11, int i11) {
        super(null, 1, null);
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(onAppointmentCLick, "onAppointmentCLick");
        this.exposureHelper = c25646b;
        this.isTablet = z11;
        this.gridCount = i11;
        this.isGridTrendingAdapter = C28123e.f86305a.m109233b().getBoolean("trending_operation_grid_feeds", true);
        this.supportProviders = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.adapter.trending.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C15007b.m67211V1(fragment, interfaceC15428b, this, onAppointmentCLick, trendingViewModel);
            }
        });
        Collection<BaseItemProvider> collectionValues = m67213S1().values();
        Intrinsics.m97801g(collectionValues, "<get-values>(...)");
        for (BaseItemProvider baseItemProvider : collectionValues) {
            Intrinsics.m97801g(baseItemProvider, "next(...)");
            mo36107F1(baseItemProvider);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public static final HashMap m67211V1(TrendingFragment trendingFragment, InterfaceC15428b interfaceC15428b, C15007b c15007b, Function1 function1, TrendingViewModel trendingViewModel) {
        HomeTabId homeTabId = HomeTabId.Trending;
        C14971i c14971i = new C14971i(homeTabId.getValue(), trendingFragment);
        trendingFragment.getLifecycle().mo14832a(c14971i);
        SubHorizontalBannerProvider subHorizontalBannerProvider = new SubHorizontalBannerProvider(homeTabId.getValue(), trendingFragment);
        trendingFragment.getLifecycle().mo14832a(subHorizontalBannerProvider);
        C15050m c15050m = new C15050m(1, interfaceC15428b, false, c15007b.isTablet);
        return MapsKt.m97575j(TuplesKt.m97108a(PostItemType.GRID_SUBJECT.getValue(), new C15042i(c15007b.gridCount)), TuplesKt.m97108a(PostItemType.OP_SUBJECTS_MOVIE.getValue(), c15050m), TuplesKt.m97108a(PostItemType.RANKING_MOVIE_HORIZONTAL.getValue(), c15050m), TuplesKt.m97108a(PostItemType.BANNER.getValue(), c14971i), TuplesKt.m97108a(PostItemType.OP_RANKING.getValue(), new C15052n(interfaceC15428b)), TuplesKt.m97108a(PostItemType.TRENDING_NATIVE_AD.getValue(), new C15053n0()), TuplesKt.m97108a(PostItemType.NO_NETWORK.getValue(), new C15040h()), TuplesKt.m97108a(PostItemType.FILTER.getValue(), new C14995w(Integer.valueOf(homeTabId.getValue()), c15007b.isTablet)), TuplesKt.m97108a(PostItemType.CUSTOM_DATA.getValue(), new C14975k(homeTabId.getValue(), c15007b.isTablet)), TuplesKt.m97108a(PostItemType.APPOINTMENT_LIST.getValue(), new C14959c(function1, homeTabId.getValue())), TuplesKt.m97108a(PostItemType.FEEDS_TITLE.getValue(), new C14990r0()), TuplesKt.m97108a(PostItemType.SPORT_LIVE.getValue(), new C15035e0(homeTabId.getValue(), c15007b.isTablet)), TuplesKt.m97108a(PostItemType.ROOM.getValue(), new RoomProvider(trendingFragment, trendingViewModel)), TuplesKt.m97108a(PostItemType.SINGLE_IMAGE.getValue(), new C15064y()), TuplesKt.m97108a(PostItemType.HORIZONTAL_BANNER.getValue(), subHorizontalBannerProvider), TuplesKt.m97108a(PostItemType.SINGLE_SUBJECT.getValue(), new SubjectSingleImgItemProvider(c15007b.isTablet)), TuplesKt.m97108a(PostItemType.SUBJECT.getValue(), new SubjectItemProvider(c15007b.isTablet)), TuplesKt.m97108a(PostItemType.POST_LIST.getValue(), new C14976k0(homeTabId.getValue(), c15007b.isTablet)), TuplesKt.m97108a(PostItemType.RANKING_LIST_MULTI_TAB.getValue(), new C15043i0(homeTabId.getValue(), c15007b.isTablet)), TuplesKt.m97108a(PostItemType.PREFERENCES.getValue(), new C15034e()));
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter, com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: B0 */
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        C25646b c25646b = this.exposureHelper;
        if (c25646b != null) {
            RecyclerView.AbstractC4214m layoutManager = getRecyclerView().getLayoutManager();
            Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            c25646b.m100944h((LinearLayoutManager) layoutManager, bindingAdapterPosition, true);
        }
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends OperateItem> data, int position) {
        Trailer trailer;
        Cover cover;
        Intrinsics.m97802h(data, "data");
        OperateItem operateItem = data.get(position);
        PostItemType.Companion companion = PostItemType.INSTANCE;
        String type = operateItem.getType();
        if (type == null) {
            type = "";
        }
        PostItemType postItemTypeM70984a = companion.m70984a(type);
        int i11 = postItemTypeM70984a == null ? -1 : a.f52450a[postItemTypeM70984a.ordinal()];
        if (i11 == -1) {
            return PostItemType.SUBJECT.ordinal();
        }
        Cover stills = null;
        if (i11 == 1) {
            if (this.isGridTrendingAdapter) {
                return PostItemType.GRID_SUBJECT.ordinal();
            }
            Subject feedsSubject = operateItem.getFeedsSubject();
            Cover cover2 = feedsSubject != null ? feedsSubject.getCover() : null;
            Subject feedsSubject2 = operateItem.getFeedsSubject();
            if (feedsSubject2 == null || (trailer = feedsSubject2.getTrailer()) == null || (cover = trailer.getCover()) == null) {
                Subject feedsSubject3 = operateItem.getFeedsSubject();
                if (feedsSubject3 != null) {
                    stills = feedsSubject3.getStills();
                }
            } else {
                stills = cover;
            }
            return (stills == null || (cover2 != null && Intrinsics.m97797c(stills.getSize(), cover2.getSize()) && Intrinsics.m97797c(stills.getHeight(), cover2.getHeight()) && Intrinsics.m97797c(stills.getWidth(), cover2.getWidth()))) ? PostItemType.SINGLE_SUBJECT.ordinal() : PostItemType.SUBJECT.ordinal();
        }
        if (i11 == 2) {
            operateItem.setRankingData(new RankingData(null, true, 1, null));
            return PostItemType.OP_SUBJECTS_MOVIE.ordinal();
        }
        if (i11 == 3) {
            BannerBean banner = operateItem.getBanner();
            return Intrinsics.m97797c(banner != null ? banner.getStyle() : null, "HORIZONTAL") ? PostItemType.HORIZONTAL_BANNER.ordinal() : PostItemType.BANNER.ordinal();
        }
        if (m67213S1().containsKey(postItemTypeM70984a.getValue())) {
            return postItemTypeM70984a.ordinal();
        }
        C26866a.a.m104901l(C26866a.f81698a, "TrendingAdapter", "unregistered itemType: " + postItemTypeM70984a.name() + "(" + postItemTypeM70984a.ordinal() + "), fallback to SUBJECT", false, 4, null);
        return PostItemType.SUBJECT.ordinal();
    }

    /* JADX INFO: renamed from: R1 */
    public final Function0<Unit> m67212R1() {
        return this.retryListener;
    }

    /* JADX INFO: renamed from: S1 */
    public final HashMap<String, BaseItemProvider> m67213S1() {
        return (HashMap) this.supportProviders.getValue();
    }

    /* JADX INFO: renamed from: T1, reason: from getter */
    public final boolean getIsGridTrendingAdapter() {
        return this.isGridTrendingAdapter;
    }

    /* JADX INFO: renamed from: U1 */
    public final void m67215U1(Function0<Unit> function0) {
        this.retryListener = function0;
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: n1 */
    public void mo36201n1(Collection<OperateItem> list) {
        Object objM112707constructorimpl;
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(list == null ? new ArrayList<>() : list);
        if (list != null) {
            for (OperateItem operateItem : list) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    if (Intrinsics.m97797c(operateItem.getType(), PostItemType.RANKING_LIST_MULTI_TAB.getValue())) {
                        RankingListData rankingListData = operateItem.getRankingListData();
                        if (rankingListData == null) {
                            arrayList2.remove(operateItem);
                            C26866a.a.m104898f(C26866a.f81698a, "SubTabViewModel", "remove NEW_STYLE_RANKING: rankingListData is null", false, 4, null);
                        } else {
                            List<RankingListItem> items = rankingListData.getItems();
                            if (items != null) {
                                arrayList = new ArrayList();
                                for (Object obj : items) {
                                    RankingListItem rankingListItem = (RankingListItem) obj;
                                    List<Subject> subjects = rankingListItem.getSubjects();
                                    boolean z11 = false;
                                    if (subjects != null && (!subjects.isEmpty())) {
                                        z11 = true;
                                    }
                                    if (!z11) {
                                        C26866a.a.m104898f(C26866a.f81698a, "SubTabViewModel", "remove RankingListItem with empty subjects: " + rankingListItem.getTitle(), false, 4, null);
                                    }
                                    if (z11) {
                                        arrayList.add(obj);
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                            rankingListData.setItems(arrayList);
                            if (arrayList == null || arrayList.isEmpty()) {
                                arrayList2.remove(operateItem);
                                C26866a.a.m104898f(C26866a.f81698a, "SubTabViewModel", "remove NEW_STYLE_RANKING: items is empty after filtering", false, 4, null);
                            }
                        }
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
                }
                Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                if (thM112710exceptionOrNullimpl != null) {
                    C26866a.a.m104898f(C26866a.f81698a, "SubTabViewModel", "setList error: " + thM112710exceptionOrNullimpl.getMessage(), false, 4, null);
                }
            }
        }
        super.mo36201n1(arrayList2);
    }
}
