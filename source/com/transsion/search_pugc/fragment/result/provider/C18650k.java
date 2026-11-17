package com.transsion.search_pugc.fragment.result.provider;

import android.animation.ValueAnimator;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5790i;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.baseui.R$plurals;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search.R$string;
import com.transsion.search_pugc.AbstractC18671h;
import com.transsion.search_pugc.C18670g;
import com.transsion.search_pugc.bean.SearchResultItem;
import com.transsion.search_pugc.constant.AbstractC18568a;
import com.transsion.search_pugc.constant.ResultCollectItemWrapper;
import com.transsion.search_pugc.constant.SearchType;
import com.transsion.search_pugc.fragment.result.adapter.C18623a;
import com.transsion.ugcvideodetail.api.UGCVideoTypeKt;
import com.transsion.ugcvideodetail.api.bean.UGCCollection;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p765s6.InterfaceC27566d;

/* JADX INFO: renamed from: com.transsion.search_pugc.fragment.result.provider.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C18650k extends BaseItemProvider implements InterfaceC18659t {

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ InterfaceC18659t f60245e;

    /* JADX INFO: renamed from: f */
    private final Lazy f60246f;

    /* JADX INFO: renamed from: g */
    private final Lazy f60247g;

    /* JADX INFO: renamed from: h */
    private final float f60248h;

    public C18650k(InterfaceC18659t reportable) {
        Intrinsics.m97802h(reportable, "reportable");
        this.f60245e = reportable;
        this.f60246f = LazyKt.m97097b(new Function0() { // from class: com.transsion.search_pugc.fragment.result.provider.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C18650k.m78439N());
            }
        });
        this.f60247g = LazyKt.m97097b(new Function0() { // from class: com.transsion.search_pugc.fragment.result.provider.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C18650k.m78438M());
            }
        });
        this.f60248h = 0.95f;
    }

    /* JADX INFO: renamed from: E */
    private final void m78431E(final View view, int i11, int i12) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i11, i12);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.transsion.search_pugc.fragment.result.provider.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C18650k.m78432F(view, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m78432F(View view, ValueAnimator animation) {
        Intrinsics.m97802h(animation, "animation");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.C4215n c4215n = (RecyclerView.C4215n) layoutParams;
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.m97800f(animatedValue, "null cannot be cast to non-null type kotlin.Number");
        ((ViewGroup.MarginLayoutParams) c4215n).width = ((Number) animatedValue).intValue();
        view.setLayoutParams(c4215n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m78433H(C18623a c18623a, C18650k c18650k, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        UGCVideo uGCVideoM78226a = ((ResultCollectItemWrapper) c18623a.getData().get(i11)).m78226a();
        if (uGCVideoM78226a != null) {
            AbstractC18568a.m78234g(uGCVideoM78226a, true);
            c18650k.mo78413c(uGCVideoM78226a, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d7  */
    /* JADX INFO: renamed from: I */
    public static final boolean m78434I(FooterStretchRecyclerView footerStretchRecyclerView, C18623a c18623a, Ref.FloatRef floatRef, Ref.BooleanRef booleanRef, C18650k c18650k, SearchResultItem searchResultItem, BaseViewHolder baseViewHolder, View view, MotionEvent motionEvent) {
        View viewFindViewByPosition;
        Integer numValueOf;
        UGCCollection collection;
        List<UGCVideo> videos;
        UGCVideo uGCVideo;
        RecyclerView.AbstractC4214m layoutManager = footerStretchRecyclerView.getLayoutManager();
        Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int itemCount = c18623a.getItemCount() - 1;
        View viewFindViewByPosition2 = linearLayoutManager.findViewByPosition(itemCount);
        int action = motionEvent.getAction();
        if (action == 0) {
            float x11 = motionEvent.getX();
            floatRef.element = x11;
            booleanRef.element = false;
            Integer numValueOf2 = viewFindViewByPosition2 != null ? Integer.valueOf(viewFindViewByPosition2.getWidth()) : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DOWN startX=");
            sb2.append(x11);
            sb2.append(" 初始宽=");
            sb2.append(numValueOf2);
        } else if (action == 1) {
            viewFindViewByPosition = linearLayoutManager.findViewByPosition(itemCount);
            boolean z11 = booleanRef.element;
            if (viewFindViewByPosition != null) {
                numValueOf = Integer.valueOf(viewFindViewByPosition.getWidth());
            } else {
                numValueOf = null;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("UP atMax=");
            sb3.append(z11);
            sb3.append(", 宽=");
            sb3.append(numValueOf);
            if (viewFindViewByPosition != null) {
                if (booleanRef.element) {
                    collection = searchResultItem.getCollection();
                    if (collection != null && (videos = collection.getVideos()) != null && (uGCVideo = (UGCVideo) CollectionsKt.m97361k0(videos)) != null) {
                        AbstractC18568a.m78235h(uGCVideo, false, 1, null);
                    }
                    c18650k.mo78414d(searchResultItem, baseViewHolder.getBindingAdapterPosition());
                }
                c18650k.m78431E(viewFindViewByPosition, viewFindViewByPosition.getWidth(), c18650k.m78437L());
            }
            booleanRef.element = false;
        } else {
            if (action == 2) {
                if (!footerStretchRecyclerView.canScrollHorizontally(1) && viewFindViewByPosition2 != null) {
                    float x12 = floatRef.element - motionEvent.getX();
                    int iM78437L = c18650k.m78437L() + ((int) (((double) (c18650k.m78436K() - c18650k.m78437L())) * (((double) 1) - Math.exp((-x12) / ((double) AbstractC5790i.m27411e(20.0f))))));
                    if (iM78437L > c18650k.m78436K()) {
                        iM78437L = c18650k.m78436K();
                    }
                    booleanRef.element = iM78437L >= c18650k.m78437L() + ((int) (((float) (c18650k.m78436K() - c18650k.m78437L())) * c18650k.f60248h));
                    ViewGroup.LayoutParams layoutParams = viewFindViewByPosition2.getLayoutParams();
                    Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    RecyclerView.C4215n c4215n = (RecyclerView.C4215n) layoutParams;
                    ((ViewGroup.MarginLayoutParams) c4215n).width = iM78437L;
                    viewFindViewByPosition2.setLayoutParams(c4215n);
                    boolean z12 = booleanRef.element;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("MOVE dist=");
                    sb4.append(x12);
                    sb4.append(", width=");
                    sb4.append(iM78437L);
                    sb4.append(", atMax=");
                    sb4.append(z12);
                }
                return false;
            }
            if (action == 3) {
                viewFindViewByPosition = linearLayoutManager.findViewByPosition(itemCount);
                boolean z13 = booleanRef.element;
                if (viewFindViewByPosition != null) {
                    numValueOf = Integer.valueOf(viewFindViewByPosition.getWidth());
                } else {
                    numValueOf = null;
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append("UP atMax=");
                sb5.append(z13);
                sb5.append(", 宽=");
                sb5.append(numValueOf);
                if (viewFindViewByPosition != null) {
                    if (booleanRef.element) {
                        collection = searchResultItem.getCollection();
                        if (collection != null) {
                            AbstractC18568a.m78235h(uGCVideo, false, 1, null);
                        }
                        c18650k.mo78414d(searchResultItem, baseViewHolder.getBindingAdapterPosition());
                    }
                    c18650k.m78431E(viewFindViewByPosition, viewFindViewByPosition.getWidth(), c18650k.m78437L());
                }
                booleanRef.element = false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final void m78435J(SearchResultItem searchResultItem, C18650k c18650k, BaseViewHolder baseViewHolder, View view) {
        List<UGCVideo> videos;
        UGCVideo uGCVideo;
        UGCCollection collection = searchResultItem.getCollection();
        if (collection != null && (videos = collection.getVideos()) != null && (uGCVideo = (UGCVideo) CollectionsKt.m97361k0(videos)) != null) {
            AbstractC18568a.m78235h(uGCVideo, false, 1, null);
        }
        c18650k.mo78414d(searchResultItem, baseViewHolder.getBindingAdapterPosition());
    }

    /* JADX INFO: renamed from: K */
    private final int m78436K() {
        return ((Number) this.f60247g.getValue()).intValue();
    }

    /* JADX INFO: renamed from: L */
    private final int m78437L() {
        return ((Number) this.f60246f.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final int m78438M() {
        return AbstractC5790i.m27411e(52.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final int m78439N() {
        return AbstractC5790i.m27411e(26.0f);
    }

    /* JADX INFO: renamed from: O */
    private final void m78440O(SearchResultItem searchResultItem) {
        List<UGCVideo> videos;
        UGCCollection collection = searchResultItem.getCollection();
        if (collection == null || (videos = collection.getVideos()) == null) {
            return;
        }
        int i11 = 0;
        for (Object obj : videos) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            mo78415e((UGCVideo) obj, i11);
            i11 = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0133  */
    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo22757b(final BaseViewHolder helper, final SearchResultItem item) {
        boolean z11;
        List listM78238k;
        List listU0;
        String watchNum;
        Integer videoNum;
        String title;
        List<UGCVideo> videos;
        UGCVideo uGCVideo;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        UGCCollection collection = item.getCollection();
        List list = null;
        if (collection == null || (videos = collection.getVideos()) == null || (uGCVideo = (UGCVideo) CollectionsKt.m97361k0(videos)) == null) {
            helper.setImageResource(R$id.iv_ic, UGCVideoTypeKt.m83624e(null));
        } else {
            UGCVideoTypeKt.m83628i((ImageView) helper.getView(R$id.iv_ic), uGCVideo, null, 4, null);
        }
        int i11 = R$id.tv_collection_info;
        UGCCollection collection2 = item.getCollection();
        helper.setText(i11, (collection2 == null || (title = collection2.getTitle()) == null) ? null : AbstractC18568a.m78231d(title, m36338k(), C18670g.f60281h.m78520a(m36338k()).m78498e()));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        UGCCollection collection3 = item.getCollection();
        if (collection3 != null && (videoNum = collection3.getVideoNum()) != null) {
            int iIntValue = videoNum.intValue();
            spannableStringBuilder.append((CharSequence) m36338k().getResources().getQuantityString(R$plurals.videos_count_text, iIntValue, Integer.valueOf(iIntValue)));
        }
        spannableStringBuilder.append((CharSequence) "￼");
        spannableStringBuilder.setSpan(AbstractC18671h.m78523a(m36338k()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        UGCCollection collection4 = item.getCollection();
        String strM78239l = (collection4 == null || (watchNum = collection4.getWatchNum()) == null) ? null : AbstractC18568a.m78239l(watchNum);
        spannableStringBuilder.append((CharSequence) (strM78239l + " " + m36338k().getString(R$string.views)));
        ((TextView) helper.getView(R$id.tv_info)).setText(spannableStringBuilder);
        helper.getView(R$id.view_into).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search_pugc.fragment.result.provider.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C18650k.m78435J(item, this, helper, view);
            }
        });
        final FooterStretchRecyclerView footerStretchRecyclerView = (FooterStretchRecyclerView) helper.getView(R$id.f59666rv);
        footerStretchRecyclerView.setLayoutManager(new LinearLayoutManager(footerStretchRecyclerView.getContext(), 0, false));
        final C18623a c18623a = new C18623a(true);
        UGCCollection collection5 = item.getCollection();
        List<UGCVideo> videos2 = collection5 != null ? collection5.getVideos() : null;
        List<UGCVideo> list2 = videos2;
        if (list2 == null || list2.isEmpty()) {
            z11 = false;
        } else {
            if ((videos2 != null ? videos2.size() : 0) > 5) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (z11) {
            videos2 = videos2 != null ? videos2.subList(0, 5) : null;
        }
        if (videos2 != null && (listM78238k = AbstractC18568a.m78238k(videos2)) != null && (listU0 = CollectionsKt.m97343U0(listM78238k)) != null) {
            if (z11) {
                listU0.add(new ResultCollectItemWrapper(null, ResultCollectItemWrapper.Type.FOOTER, 1, null));
            }
            list = listU0;
        }
        c18623a.mo36201n1(list);
        c18623a.m36227w1(new InterfaceC27566d() { // from class: com.transsion.search_pugc.fragment.result.provider.f
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                C18650k.m78433H(c18623a, this, baseQuickAdapter, view, i12);
            }
        });
        footerStretchRecyclerView.setAdapter(c18623a);
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (z11) {
            footerStretchRecyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: com.transsion.search_pugc.fragment.result.provider.g
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return C18650k.m78434I(footerStretchRecyclerView, c18623a, floatRef, booleanRef, this, item, helper, view, motionEvent);
                }
            });
        }
        m78440O(item);
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: a */
    public void mo78412a(UGCVideo ugcVideo, int i11) {
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        this.f60245e.mo78412a(ugcVideo, i11);
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: c */
    public void mo78413c(UGCVideo ugcVideo, int i11) {
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        this.f60245e.mo78413c(ugcVideo, i11);
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: d */
    public void mo78414d(SearchResultItem item, int i11) {
        Intrinsics.m97802h(item, "item");
        this.f60245e.mo78414d(item, i11);
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: e */
    public void mo78415e(UGCVideo ugcVideo, int i11) {
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        this.f60245e.mo78415e(ugcVideo, i11);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return SearchType.UGC_COLLECTION.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.provider_result_collection;
    }
}
