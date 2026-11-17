package com.transsion.search_pugc.fragment.result.provider;

import android.animation.ValueAnimator;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5790i;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p282tn.lib.widget.R$color;
import com.transsion.baseui.R$plurals;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search.R$string;
import com.transsion.search_pugc.C18670g;
import com.transsion.search_pugc.bean.SearchResultItem;
import com.transsion.search_pugc.constant.AbstractC18568a;
import com.transsion.search_pugc.constant.ResultCollectItemWrapper;
import com.transsion.search_pugc.constant.SearchType;
import com.transsion.search_pugc.fragment.result.adapter.C18623a;
import com.transsion.ugcvideodetail.api.bean.UGCVerticalRank;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import p765s6.InterfaceC27566d;

/* JADX INFO: renamed from: com.transsion.search_pugc.fragment.result.provider.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C18658s extends BaseItemProvider implements InterfaceC18659t {

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ InterfaceC18659t f60262e;

    /* JADX INFO: renamed from: f */
    private final Lazy f60263f;

    /* JADX INFO: renamed from: g */
    private final Lazy f60264g;

    /* JADX INFO: renamed from: h */
    private final float f60265h;

    public C18658s(InterfaceC18659t reportable) {
        Intrinsics.m97802h(reportable, "reportable");
        this.f60262e = reportable;
        this.f60263f = LazyKt.m97097b(new Function0() { // from class: com.transsion.search_pugc.fragment.result.provider.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C18658s.m78458O());
            }
        });
        this.f60264g = LazyKt.m97097b(new Function0() { // from class: com.transsion.search_pugc.fragment.result.provider.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C18658s.m78457N());
            }
        });
        this.f60265h = 0.95f;
    }

    /* JADX INFO: renamed from: E */
    private final void m78449E(final View view, int i11, int i12) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i11, i12);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.transsion.search_pugc.fragment.result.provider.r
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C18658s.m78450F(view, valueAnimator);
            }
        });
        valueAnimatorOfInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m78450F(View view, ValueAnimator animation) {
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
    public static final void m78451H(SearchResultItem searchResultItem, C18658s c18658s, BaseViewHolder baseViewHolder, View view) {
        UGCVerticalRank verticalRank = searchResultItem.getVerticalRank();
        if (verticalRank != null) {
            AbstractC18568a.m78233f(verticalRank, searchResultItem.getOps());
        }
        c18658s.mo78414d(searchResultItem, baseViewHolder.getBindingAdapterPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final void m78452I(C18623a c18623a, C18658s c18658s, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        UGCVideo uGCVideoM78226a = ((ResultCollectItemWrapper) c18623a.getData().get(i11)).m78226a();
        if (uGCVideoM78226a != null) {
            AbstractC18568a.m78235h(uGCVideoM78226a, false, 1, null);
            c18658s.mo78412a(uGCVideoM78226a, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:30:0x0103  */
    /* JADX WARN: Code duplicated, block: B:32:0x0107  */
    /* JADX WARN: Code duplicated, block: B:34:0x010d  */
    /* JADX INFO: renamed from: J */
    public static final boolean m78453J(FooterStretchRecyclerView footerStretchRecyclerView, C18623a c18623a, Ref.FloatRef floatRef, Ref.BooleanRef booleanRef, C18658s c18658s, SearchResultItem searchResultItem, BaseViewHolder baseViewHolder, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        View viewFindViewByPosition;
        UGCVerticalRank verticalRank;
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
            numValueOf = viewFindViewByPosition2 != null ? Integer.valueOf(viewFindViewByPosition2.getWidth()) : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("--------------------------------DOWN startX=");
            sb2.append(x11);
            sb2.append(" 初始宽=");
            sb2.append(numValueOf);
        } else if (action == 1) {
            viewFindViewByPosition = linearLayoutManager.findViewByPosition(itemCount);
            boolean z11 = booleanRef.element;
            numValueOf = viewFindViewByPosition != null ? Integer.valueOf(viewFindViewByPosition.getWidth()) : null;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("UP atMax=");
            sb3.append(z11);
            sb3.append(", 宽=");
            sb3.append(numValueOf);
            if (viewFindViewByPosition != null) {
                if (booleanRef.element) {
                    verticalRank = searchResultItem.getVerticalRank();
                    if (verticalRank != null) {
                        AbstractC18568a.m78233f(verticalRank, searchResultItem.getOps());
                    }
                    c18658s.mo78414d(searchResultItem, baseViewHolder.getBindingAdapterPosition());
                }
                c18658s.m78449E(viewFindViewByPosition, viewFindViewByPosition.getWidth(), c18658s.m78455L());
            }
            booleanRef.element = false;
        } else {
            if (action == 2) {
                if (!footerStretchRecyclerView.canScrollHorizontally(1) && viewFindViewByPosition2 != null) {
                    if (floatRef.element == 0.0f) {
                        floatRef.element = motionEvent.getX();
                        booleanRef.element = false;
                    }
                    float f11 = floatRef.element;
                    float x12 = motionEvent.getX();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("startX = ");
                    sb4.append(f11);
                    sb4.append(", event.x= ");
                    sb4.append(x12);
                    float x13 = floatRef.element - motionEvent.getX();
                    int iM78455L = c18658s.m78455L() + ((int) (((double) (c18658s.m78454K() - c18658s.m78455L())) * (((double) 1) - Math.exp((-x13) / ((double) AbstractC5790i.m27411e(20.0f))))));
                    if (iM78455L > c18658s.m78454K()) {
                        iM78455L = c18658s.m78454K();
                    }
                    booleanRef.element = iM78455L >= c18658s.m78455L() + ((int) (((float) (c18658s.m78454K() - c18658s.m78455L())) * c18658s.f60265h));
                    ViewGroup.LayoutParams layoutParams = viewFindViewByPosition2.getLayoutParams();
                    Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    RecyclerView.C4215n c4215n = (RecyclerView.C4215n) layoutParams;
                    ((ViewGroup.MarginLayoutParams) c4215n).width = Math.max(iM78455L, c18658s.m78455L());
                    viewFindViewByPosition2.setLayoutParams(c4215n);
                    boolean z12 = booleanRef.element;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("MOVE dist=");
                    sb5.append(x13);
                    sb5.append(", width=");
                    sb5.append(iM78455L);
                    sb5.append(", atMax=");
                    sb5.append(z12);
                }
                return false;
            }
            if (action == 3) {
                viewFindViewByPosition = linearLayoutManager.findViewByPosition(itemCount);
                boolean z13 = booleanRef.element;
                if (viewFindViewByPosition != null) {
                }
                StringBuilder sb6 = new StringBuilder();
                sb6.append("UP atMax=");
                sb6.append(z13);
                sb6.append(", 宽=");
                sb6.append(numValueOf);
                if (viewFindViewByPosition != null) {
                    if (booleanRef.element) {
                        verticalRank = searchResultItem.getVerticalRank();
                        if (verticalRank != null) {
                            AbstractC18568a.m78233f(verticalRank, searchResultItem.getOps());
                        }
                        c18658s.mo78414d(searchResultItem, baseViewHolder.getBindingAdapterPosition());
                    }
                    c18658s.m78449E(viewFindViewByPosition, viewFindViewByPosition.getWidth(), c18658s.m78455L());
                }
                booleanRef.element = false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    private final int m78454K() {
        return ((Number) this.f60264g.getValue()).intValue();
    }

    /* JADX INFO: renamed from: L */
    private final int m78455L() {
        return ((Number) this.f60263f.getValue()).intValue();
    }

    /* JADX INFO: renamed from: M */
    private final SpannableStringBuilder m78456M(String str, String str2, int i11) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iO0 = StringsKt.m98156o0(str, str2, 0, false, 6, null);
        if (iO0 >= 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), iO0, str2.length() + iO0, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final int m78457N() {
        return AbstractC5790i.m27411e(52.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final int m78458O() {
        return AbstractC5790i.m27411e(26.0f);
    }

    /* JADX INFO: renamed from: P */
    private final void m78459P(SearchResultItem searchResultItem) {
        List<UGCVideo> videos;
        UGCVerticalRank verticalRank = searchResultItem.getVerticalRank();
        if (verticalRank == null || (videos = verticalRank.getVideos()) == null) {
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

    /* JADX WARN: Code duplicated, block: B:31:0x00f8  */
    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo22757b(final BaseViewHolder helper, final SearchResultItem item) {
        boolean z11;
        List listM78238k;
        List listU0;
        Integer count;
        String title;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        int i11 = R$id.tv_collection_info;
        String string = m36338k().getString(R$string.collection);
        UGCVerticalRank verticalRank = item.getVerticalRank();
        List list = null;
        String str = string + " • " + (verticalRank != null ? verticalRank.getTitle() : null);
        UGCVerticalRank verticalRank2 = item.getVerticalRank();
        helper.setText(i11, m78456M(str, String.valueOf((verticalRank2 == null || (title = verticalRank2.getTitle()) == null) ? null : AbstractC18568a.m78231d(title, m36338k(), C18670g.f60281h.m78520a(m36338k()).m78498e())), m36338k().getColor(R$color.white)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        UGCVerticalRank verticalRank3 = item.getVerticalRank();
        if (verticalRank3 != null && (count = verticalRank3.getCount()) != null) {
            int iIntValue = count.intValue();
            spannableStringBuilder.append((CharSequence) m36338k().getResources().getQuantityString(R$plurals.videos_count_text, iIntValue, Integer.valueOf(iIntValue)));
        }
        ((TextView) helper.getView(R$id.tv_info)).setText(spannableStringBuilder);
        helper.getView(R$id.view_into).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search_pugc.fragment.result.provider.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C18658s.m78451H(item, this, helper, view);
            }
        });
        final FooterStretchRecyclerView footerStretchRecyclerView = (FooterStretchRecyclerView) helper.getView(R$id.f59666rv);
        footerStretchRecyclerView.setLayoutManager(new LinearLayoutManager(footerStretchRecyclerView.getContext(), 0, false));
        final C18623a c18623a = new C18623a(false, 1, null);
        UGCVerticalRank verticalRank4 = item.getVerticalRank();
        List<UGCVideo> videos = verticalRank4 != null ? verticalRank4.getVideos() : null;
        List<UGCVideo> list2 = videos;
        if (list2 == null || list2.isEmpty()) {
            z11 = false;
        } else {
            if ((videos != null ? videos.size() : 0) >= 5) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (z11) {
            videos = videos != null ? videos.subList(0, 5) : null;
        }
        if (videos != null && (listM78238k = AbstractC18568a.m78238k(videos)) != null && (listU0 = CollectionsKt.m97343U0(listM78238k)) != null) {
            if (z11) {
                listU0.add(new ResultCollectItemWrapper(null, ResultCollectItemWrapper.Type.FOOTER, 1, null));
            }
            list = listU0;
        }
        c18623a.mo36201n1(list);
        c18623a.m36227w1(new InterfaceC27566d() { // from class: com.transsion.search_pugc.fragment.result.provider.p
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                C18658s.m78452I(c18623a, this, baseQuickAdapter, view, i12);
            }
        });
        footerStretchRecyclerView.setAdapter(c18623a);
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (z11) {
            footerStretchRecyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: com.transsion.search_pugc.fragment.result.provider.q
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return C18658s.m78453J(footerStretchRecyclerView, c18623a, floatRef, booleanRef, this, item, helper, view, motionEvent);
                }
            });
        }
        m78459P(item);
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: a */
    public void mo78412a(UGCVideo ugcVideo, int i11) {
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        this.f60262e.mo78412a(ugcVideo, i11);
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: c */
    public void mo78413c(UGCVideo ugcVideo, int i11) {
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        this.f60262e.mo78413c(ugcVideo, i11);
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: d */
    public void mo78414d(SearchResultItem item, int i11) {
        Intrinsics.m97802h(item, "item");
        this.f60262e.mo78414d(item, i11);
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: e */
    public void mo78415e(UGCVideo ugcVideo, int i11) {
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        this.f60262e.mo78415e(ugcVideo, i11);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return SearchType.VERTICAL_RANK.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.provider_result_collection;
    }
}
