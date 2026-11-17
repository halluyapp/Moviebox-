package com.transsion.shorttv.p315ui.adapter;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.shorttv.bean.OperateItem;
import com.transsion.shorttv.bean.RankingData;
import com.transsion.shorttv.bean.ShortTvItemType;
import com.transsion.shorttv.p315ui.adapter.provider.C18936i;
import com.transsion.shorttv.p315ui.adapter.provider.C18940m;
import com.transsion.shorttv.p315ui.adapter.provider.C18943p;
import com.transsion.shorttv.p315ui.adapter.provider.C18947t;
import com.transsion.shorttv.p315ui.adapter.provider.C18949v;
import com.transsion.shorttv.p315ui.adapter.provider.ShortTvFavoriteProvider;
import com.transsion.shorttv.p315ui.adapter.provider.ShortTvTrendingProvider;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p330cs.C22776b;

/* JADX INFO: renamed from: com.transsion.shorttv.ui.adapter.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fRC\u0010+\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020%0$j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020%`&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, m97100d2 = {"Lcom/transsion/shorttv/ui/adapter/d;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/shorttv/bean/OperateItem;", "Landroidx/fragment/app/Fragment;", "fragment", "", "pageName", "", "isTablet", "isDownloadBtn", "Lcs/b;", "exposureHelper", "isMbTopTab", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;ZZLcs/b;Z)V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "", "B0", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "G", "Landroidx/fragment/app/Fragment;", "H", "Ljava/lang/String;", "I", "Z", "J", "K", "Lcs/b;", "L", "Ljava/util/HashMap;", "Lcom/chad/library/adapter/base/provider/BaseItemProvider;", "Lkotlin/collections/HashMap;", "M", "Lkotlin/Lazy;", "R1", "()Ljava/util/HashMap;", "supportProviders", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C18905d extends BaseProviderMultiAdapter<OperateItem> {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final Fragment fragment;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final String pageName;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final boolean isTablet;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final boolean isDownloadBtn;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C22776b exposureHelper;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final boolean isMbTopTab;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final Lazy supportProviders;

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.adapter.d$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60974a;

        static {
            int[] iArr = new int[ShortTvItemType.values().length];
            try {
                iArr[ShortTvItemType.RANKING_MOVIE_HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f60974a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18905d(Fragment fragment, String pageName, boolean z11, boolean z12, C22776b c22776b, boolean z13) {
        super(null, 1, null);
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(pageName, "pageName");
        this.fragment = fragment;
        this.pageName = pageName;
        this.isTablet = z11;
        this.isDownloadBtn = z12;
        this.exposureHelper = c22776b;
        this.isMbTopTab = z13;
        this.supportProviders = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.ui.adapter.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C18905d.m79552S1(this.f60966a);
            }
        });
        Collection<BaseItemProvider> collectionValues = m79551R1().values();
        Intrinsics.m97801g(collectionValues, "<get-values>(...)");
        for (BaseItemProvider baseItemProvider : collectionValues) {
            Intrinsics.m97801g(baseItemProvider, "next(...)");
            mo36107F1(baseItemProvider);
        }
    }

    public /* synthetic */ C18905d(Fragment fragment, String str, boolean z11, boolean z12, C22776b c22776b, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, str, z11, z12, c22776b, (i11 & 32) != 0 ? false : z13);
    }

    /* JADX INFO: renamed from: R1 */
    private final HashMap<String, BaseItemProvider> m79551R1() {
        return (HashMap) this.supportProviders.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S1 */
    public static final HashMap m79552S1(C18905d c18905d) {
        return MapsKt.m97575j(TuplesKt.m97108a(ShortTvItemType.BANNER.getValue(), new C18940m(c18905d.fragment, c18905d.pageName, c18905d.isTablet, c18905d.isMbTopTab)), TuplesKt.m97108a(ShortTvItemType.FILTER.getValue(), new C18947t()), TuplesKt.m97108a(ShortTvItemType.APPOINTMENT_LIST.getValue(), new C18936i(c18905d.pageName)), TuplesKt.m97108a(ShortTvItemType.CUSTOM_DATA.getValue(), new C18943p(c18905d.pageName, c18905d.isTablet)), TuplesKt.m97108a(ShortTvItemType.TRENDING.getValue(), new ShortTvTrendingProvider(c18905d.pageName, c18905d.isDownloadBtn)), TuplesKt.m97108a(ShortTvItemType.TRENDING_TITLE.getValue(), new C18949v()), TuplesKt.m97108a(ShortTvItemType.FAVORITE.getValue(), new ShortTvFavoriteProvider(c18905d.fragment)));
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter, com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: B0 */
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        C22776b c22776b = this.exposureHelper;
        if (c22776b != null) {
            RecyclerView.AbstractC4214m layoutManager = getRecyclerView().getLayoutManager();
            Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            C22776b.m90699h(c22776b, (LinearLayoutManager) layoutManager, bindingAdapterPosition, true, false, 8, null);
        }
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends OperateItem> data, int position) {
        Intrinsics.m97802h(data, "data");
        OperateItem operateItem = data.get(position);
        ShortTvItemType.Companion companion = ShortTvItemType.INSTANCE;
        String type = operateItem.getType();
        if (type == null) {
            type = "";
        }
        ShortTvItemType shortTvItemTypeM79329a = companion.m79329a(type);
        int i11 = shortTvItemTypeM79329a == null ? -1 : a.f60974a[shortTvItemTypeM79329a.ordinal()];
        if (i11 == -1) {
            return ShortTvItemType.TRENDING.ordinal();
        }
        if (i11 != 1) {
            return shortTvItemTypeM79329a.ordinal();
        }
        operateItem.setRankingData(new RankingData(null, true, 1, null));
        return ShortTvItemType.OP_SUBJECTS_MOVIE.ordinal();
    }
}
