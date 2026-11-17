package com.transsion.home.adapter.suboperate;

import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.home.adapter.operateUGC.provider.C14876c;
import com.transsion.home.adapter.operateUGC.provider.C14883f0;
import com.transsion.home.adapter.operateUGC.provider.C14890j;
import com.transsion.home.adapter.operateUGC.provider.C14893l;
import com.transsion.home.adapter.operateUGC.provider.C14897p;
import com.transsion.home.adapter.operateUGC.provider.C14900s;
import com.transsion.home.adapter.operateUGC.provider.C14904w;
import com.transsion.home.adapter.operateUGC.provider.FeedsBigUGCProvider;
import com.transsion.home.adapter.operateUGC.provider.FeedsGridUGCProvider;
import com.transsion.home.adapter.suboperate.provider.C14955a;
import com.transsion.home.adapter.suboperate.provider.C14958b0;
import com.transsion.home.adapter.suboperate.provider.C14959c;
import com.transsion.home.adapter.suboperate.provider.C14971i;
import com.transsion.home.adapter.suboperate.provider.C14975k;
import com.transsion.home.adapter.suboperate.provider.C14976k0;
import com.transsion.home.adapter.suboperate.provider.C14987q;
import com.transsion.home.adapter.suboperate.provider.C14990r0;
import com.transsion.home.adapter.suboperate.provider.C14995w;
import com.transsion.home.adapter.suboperate.provider.SubFeedsEducationProvider;
import com.transsion.home.adapter.suboperate.provider.SubFeedsSingleImageProvider;
import com.transsion.home.adapter.suboperate.provider.SubHorizontalBannerProvider;
import com.transsion.home.adapter.suboperate.provider.SubMyCourseProvider;
import com.transsion.home.adapter.suboperate.provider.SubRankListProvider;
import com.transsion.home.adapter.suboperate.provider.SubRankingProvider;
import com.transsion.home.adapter.trending.provider.C15034e;
import com.transsion.home.adapter.trending.provider.C15035e0;
import com.transsion.home.adapter.trending.provider.C15043i0;
import com.transsion.home.adapter.trending.provider.C15050m;
import com.transsion.home.adapter.trending.provider.C15064y;
import com.transsion.home.bean.BannerBean;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.bean.RankingData;
import com.transsion.home.bean.RankingListData;
import com.transsion.home.bean.RankingListItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.home.preload.InterfaceC15428b;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.Trailer;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25204t1;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B}\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\b2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u001d\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R0\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u0010\u0013\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, m97100d2 = {"Lcom/transsion/home/adapter/suboperate/SubTabAdapter;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/home/bean/OperateItem;", "Lu6/i;", "", "typeList", "Lkotlin/Function1;", "", "", "onAppointmentCLick", "Lcom/transsion/home/fragment/tab/SubTabFragment;", "fragment", "", "tabId", "Lcom/transsion/home/preload/b;", "xmlPreloadImp", "onPositionScroll", "isTablet", "gridCount", "isUGCVideoMode", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/transsion/home/fragment/tab/SubTabFragment;ILcom/transsion/home/preload/b;Lkotlin/jvm/functions/Function1;ZIZ)V", "U1", "()V", "", "list", "n1", "(Ljava/util/Collection;)V", "data", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onDetachedFromRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "B0", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "G", "I", "H", "Lkotlin/jvm/functions/Function1;", "S1", "()Lkotlin/jvm/functions/Function1;", "V1", "(Lkotlin/jvm/functions/Function1;)V", "Z", "", "", "J", "Ljava/util/List;", "supportTypes", "Lkotlinx/coroutines/t1;", "K", "Lkotlinx/coroutines/t1;", "mObserveJob", "Lcom/transsion/home/adapter/trending/provider/e;", "L", "Lcom/transsion/home/adapter/trending/provider/e;", "T1", "()Lcom/transsion/home/adapter/trending/provider/e;", "preferencesProvider", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SubTabAdapter extends BaseProviderMultiAdapter<OperateItem> implements InterfaceC27944i {

    /* JADX INFO: renamed from: M */
    public static final int f52110M = 8;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final int tabId;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private Function1<? super Integer, Unit> onPositionScroll;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final boolean isUGCVideoMode;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final List<String> supportTypes;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private InterfaceC25204t1 mObserveJob;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final C15034e preferencesProvider;

    /* JADX INFO: renamed from: com.transsion.home.adapter.suboperate.SubTabAdapter$a */
    public /* synthetic */ class C14910a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f52117a;

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
            f52117a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubTabAdapter(List<OperateItem> typeList, Function1<? super Function1<? super Boolean, Unit>, Unit> onAppointmentCLick, SubTabFragment fragment, int i11, InterfaceC15428b interfaceC15428b, Function1<? super Integer, Unit> function1, boolean z11, int i12, boolean z12) {
        super(CollectionsKt.m97343U0(typeList));
        Intrinsics.m97802h(typeList, "typeList");
        Intrinsics.m97802h(onAppointmentCLick, "onAppointmentCLick");
        Intrinsics.m97802h(fragment, "fragment");
        this.tabId = i11;
        this.onPositionScroll = function1;
        this.isUGCVideoMode = z12;
        this.supportTypes = new ArrayList();
        C15034e c15034e = new C15034e();
        this.preferencesProvider = c15034e;
        Function2 function2 = new Function2() { // from class: com.transsion.home.adapter.suboperate.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SubTabAdapter.m66894R1(this.f52119a, (String) obj, (BaseItemProvider) obj2);
            }
        };
        if (z12) {
            C14876c c14876c = new C14876c(i11, fragment);
            fragment.getLifecycle().mo14832a(c14876c);
            function2.invoke(PostItemType.UGC_BANNER.getValue(), c14876c);
            function2.invoke(PostItemType.UGC_MOVIE_RANK.getValue(), new C14897p(i11, z11));
            function2.invoke(PostItemType.UGC_MUSIC_RANK.getValue(), new C14900s(i11));
            function2.invoke(PostItemType.UGC_FILTER.getValue(), new C14890j(Integer.valueOf(i11), z11));
            function2.invoke(PostItemType.HASH_TAG.getValue(), new C14893l(Integer.valueOf(i11)));
            function2.invoke(PostItemType.UGC_RANKING_LIST.getValue(), new C14904w(i11));
            function2.invoke(PostItemType.UGC_VERTICAL_OPT_LIST.getValue(), new C14883f0(i11));
            function2.invoke(PostItemType.TRENDING_FEES_GRID.getValue(), new FeedsGridUGCProvider(i12, i11));
            function2.invoke(PostItemType.TRENDING_FEES_BIG.getValue(), new FeedsBigUGCProvider(i11));
            function2.invoke(PostItemType.UGC_CUSTOM.getValue(), new C14975k(i11, z11));
            function2.invoke(PostItemType.FEEDS_TITLE.getValue(), new C14990r0());
            function2.invoke(PostItemType.TRENDING_NATIVE_AD.getValue(), new C14955a());
            function2.invoke(PostItemType.UGC_SPORT_LIVE.getValue(), new C15035e0(i11, z11));
            function2.invoke(PostItemType.UGC_SINGLE_IMAGE.getValue(), new C15064y());
            function2.invoke(PostItemType.PREFERENCES.getValue(), c15034e);
            return;
        }
        C14971i c14971i = new C14971i(i11, fragment);
        fragment.getLifecycle().mo14832a(c14971i);
        SubHorizontalBannerProvider subHorizontalBannerProvider = new SubHorizontalBannerProvider(i11, fragment);
        fragment.getLifecycle().mo14832a(subHorizontalBannerProvider);
        SubMyCourseProvider subMyCourseProvider = new SubMyCourseProvider(i11);
        fragment.getLifecycle().mo14832a(subMyCourseProvider);
        C15050m c15050m = new C15050m(i11, interfaceC15428b, true, z11);
        function2.invoke(PostItemType.HORIZONTAL_BANNER.getValue(), subHorizontalBannerProvider);
        function2.invoke(PostItemType.BANNER.getValue(), c14971i);
        function2.invoke(PostItemType.FILTER.getValue(), new C14995w(Integer.valueOf(i11), z11));
        function2.invoke(PostItemType.APPOINTMENT_LIST.getValue(), new C14959c(onAppointmentCLick, i11));
        function2.invoke(PostItemType.CUSTOM_DATA.getValue(), new C14975k(i11, z11));
        function2.invoke(PostItemType.SUBJECT.getValue(), new C14987q(i11, z11));
        function2.invoke(PostItemType.SINGLE_SUBJECT.getValue(), new SubFeedsSingleImageProvider(i11, z11));
        function2.invoke(PostItemType.EDUCATION_SUBJECT.getValue(), new SubFeedsEducationProvider(i11));
        function2.invoke(PostItemType.TRENDING_NATIVE_AD.getValue(), new C14955a());
        function2.invoke(PostItemType.OP_SUBJECTS_MOVIE.getValue(), c15050m);
        function2.invoke(PostItemType.RANKING_MOVIE_HORIZONTAL.getValue(), c15050m);
        function2.invoke(PostItemType.MY_COURSE.getValue(), subMyCourseProvider);
        function2.invoke(PostItemType.FEEDS_TITLE.getValue(), new C14990r0());
        function2.invoke(PostItemType.OP_RANKING.getValue(), new SubRankingProvider(i11));
        function2.invoke(PostItemType.RANKING_LIST.getValue(), new SubRankListProvider(i11));
        function2.invoke(PostItemType.RANKING_LIST_MUSIC.getValue(), new C14958b0(i11, z11));
        function2.invoke(PostItemType.RANKING_LIST_MULTI_TAB.getValue(), new C15043i0(i11, z11));
        function2.invoke(PostItemType.PREFERENCES.getValue(), c15034e);
        function2.invoke(PostItemType.POST_LIST.getValue(), new C14976k0(i11, z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R1 */
    public static final Unit m66894R1(SubTabAdapter subTabAdapter, String key, BaseItemProvider provider) {
        Intrinsics.m97802h(key, "key");
        Intrinsics.m97802h(provider, "provider");
        subTabAdapter.supportTypes.add(key);
        subTabAdapter.mo36107F1(provider);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: U1 */
    private final void m66895U1() {
        if (HomeTabId.INSTANCE.m67539h(Integer.valueOf(this.tabId), true)) {
            this.mObserveJob = AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new SubTabAdapter$registerCourse$1(this, null), 3, null);
        }
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter, com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: B0 */
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        Function1<? super Integer, Unit> function1 = this.onPositionScroll;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(bindingAdapterPosition));
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
        if (this.isUGCVideoMode && postItemTypeM70984a != null) {
            if (postItemTypeM70984a == PostItemType.UGC_CUSTOM) {
                return PostItemType.CUSTOM_DATA.ordinal();
            }
            if (postItemTypeM70984a == PostItemType.UGC_SINGLE_IMAGE) {
                return PostItemType.SINGLE_IMAGE.ordinal();
            }
            if (postItemTypeM70984a == PostItemType.UGC_SPORT_LIVE) {
                return PostItemType.SPORT_LIVE.ordinal();
            }
        }
        int i11 = postItemTypeM70984a == null ? -1 : C14910a.f52117a[postItemTypeM70984a.ordinal()];
        if (i11 == -1) {
            return PostItemType.SUBJECT.ordinal();
        }
        Cover stills = null;
        if (i11 == 1) {
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
            if (HomeTabId.INSTANCE.m67539h(Integer.valueOf(this.tabId), true)) {
                return PostItemType.EDUCATION_SUBJECT.ordinal();
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
        if (this.supportTypes.contains(postItemTypeM70984a.getValue())) {
            return postItemTypeM70984a.ordinal();
        }
        C26866a.a.m104901l(C26866a.f81698a, "SubTabAdapter", "unregistered itemType: " + postItemTypeM70984a.name() + "(" + postItemTypeM70984a.ordinal() + "), fallback to SUBJECT", false, 4, null);
        return PostItemType.SUBJECT.ordinal();
    }

    /* JADX INFO: renamed from: S1 */
    public final Function1<Integer, Unit> m66896S1() {
        return this.onPositionScroll;
    }

    /* JADX INFO: renamed from: T1, reason: from getter */
    public final C15034e getPreferencesProvider() {
        return this.preferencesProvider;
    }

    /* JADX INFO: renamed from: V1 */
    public final void m66898V1(Function1<? super Integer, Unit> function1) {
        this.onPositionScroll = function1;
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
                if (!CollectionsKt.m97352b0(this.supportTypes, operateItem.getType())) {
                    arrayList2.remove(operateItem);
                    C26866a.a.m104898f(C26866a.f81698a, "SubTabViewModel", "remove unSupport operate " + operateItem.getType(), false, 4, null);
                }
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
        m66895U1();
        super.mo36201n1(arrayList2);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Intrinsics.m97802h(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        InterfaceC25204t1 interfaceC25204t1 = this.mObserveJob;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
    }
}
