package com.transsion.home.adapter.trending.provider;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.AbstractC2397b;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p282tn.lib.widget.R$color;
import com.transsion.baseui.util.AbstractC14567m;
import com.transsion.baseui.widget.GradientTextView;
import com.transsion.home.R$drawable;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.R$string;
import com.transsion.home.bean.HomePreferencesConfig;
import com.transsion.home.bean.HomePreferencesContentItem;
import com.transsion.home.bean.HomePreferencesSelectType;
import com.transsion.home.bean.OperateItem;
import com.transsion.moviedetailapi.bean.PostItemType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C15034e extends BaseItemProvider {

    /* JADX INFO: renamed from: r */
    public static final a f52517r = new a(null);

    /* JADX INFO: renamed from: s */
    public static final int f52518s = 8;

    /* JADX INFO: renamed from: f */
    private Function1 f52520f;

    /* JADX INFO: renamed from: g */
    private Function1 f52521g;

    /* JADX INFO: renamed from: h */
    private Function3 f52522h;

    /* JADX INFO: renamed from: i */
    private Function1 f52523i;

    /* JADX INFO: renamed from: p */
    private final TextPaint f52530p;

    /* JADX INFO: renamed from: q */
    private final Map f52531q;

    /* JADX INFO: renamed from: e */
    private final Set f52519e = new LinkedHashSet();

    /* JADX INFO: renamed from: j */
    private final int f52524j = AbstractC5776a0.m27313a(12.0f);

    /* JADX INFO: renamed from: k */
    private final int f52525k = AbstractC5776a0.m27313a(32.0f);

    /* JADX INFO: renamed from: l */
    private final int f52526l = AbstractC5776a0.m27313a(68.0f);

    /* JADX INFO: renamed from: m */
    private final int f52527m = AbstractC5776a0.m27313a(8.0f);

    /* JADX INFO: renamed from: n */
    private final int f52528n = AbstractC5776a0.m27313a(16.0f);

    /* JADX INFO: renamed from: o */
    private final int f52529o = AbstractC5776a0.m27313a(4.0f);

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C15034e() {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AbstractC5776a0.m27313a(12.0f));
        this.f52530p = textPaint;
        this.f52531q = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: A */
    private final void m67275A(LinearLayout linearLayout, List list, boolean z11, int i11, LinearLayout linearLayout2) {
        int iM27313a = AbstractC5776a0.m27313a(8.0f);
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.m97515u();
            }
            View viewM67278E = m67278E(linearLayout, (HomePreferencesContentItem) obj, z11, i11, linearLayout2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, this.f52525k);
            layoutParams.setMarginStart(i12 == 0 ? iM27313a : this.f52527m);
            linearLayout.addView(viewM67278E, layoutParams);
            i12 = i13;
        }
    }

    /* JADX INFO: renamed from: B */
    private final void m67276B(GradientTextView gradientTextView, Context context, boolean z11) {
        int color = AbstractC2397b.getColor(context, R$color.white_80);
        int color2 = AbstractC2397b.getColor(context, R$color.brand_new_gradient_start);
        int color3 = AbstractC2397b.getColor(context, R$color.brand_new_gradient_center);
        int color4 = AbstractC2397b.getColor(context, R$color.brand_new_gradient_end);
        if (!z11) {
            color2 = color;
        }
        if (!z11) {
            color3 = color;
        }
        if (z11) {
            color = color4;
        }
        gradientTextView.setGradientColors(color2, color3, color);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m67277D(C15034e c15034e, HomePreferencesConfig homePreferencesConfig, View view) {
        Function1 function1 = c15034e.f52520f;
        if (function1 != null) {
            function1.invoke(homePreferencesConfig);
        }
    }

    /* JADX INFO: renamed from: E */
    private final LinearLayout m67278E(ViewGroup viewGroup, final HomePreferencesContentItem homePreferencesContentItem, final boolean z11, final int i11, final LinearLayout linearLayout) {
        final Context context = viewGroup.getContext();
        boolean zContains = this.f52519e.contains(homePreferencesContentItem.getValue());
        final LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setMinimumWidth(this.f52526l);
        int i12 = this.f52524j;
        linearLayout2.setPadding(i12, 0, i12, 0);
        linearLayout2.setBackground(AbstractC2397b.getDrawable(context, R$drawable.bg_preferences_tag));
        linearLayout2.setSelected(zContains);
        linearLayout2.setTag(homePreferencesContentItem.getValue());
        Intrinsics.m97799e(context);
        final GradientTextView gradientTextView = new GradientTextView(context, null, 0, 6, null);
        gradientTextView.setText(homePreferencesContentItem.getName());
        gradientTextView.setTextSize(12.0f);
        gradientTextView.setMaxLines(1);
        gradientTextView.setGravity(17);
        gradientTextView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        m67276B(gradientTextView, context, zContains);
        final ImageView imageView = new ImageView(context);
        imageView.setImageResource(zContains ? R$drawable.ic_preferences_heart_selected : R$drawable.ic_preferences_heart_unselected);
        int i13 = this.f52528n;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i13, i13);
        layoutParams.setMarginStart(this.f52529o);
        imageView.setLayoutParams(layoutParams);
        linearLayout2.addView(gradientTextView);
        linearLayout2.addView(imageView);
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.trending.provider.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C15034e.m67279F(z11, this, homePreferencesContentItem, linearLayout, i11, context, linearLayout2, imageView, gradientTextView, view);
            }
        });
        return linearLayout2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m67279F(boolean z11, C15034e c15034e, HomePreferencesContentItem homePreferencesContentItem, LinearLayout linearLayout, int i11, Context context, LinearLayout linearLayout2, ImageView imageView, GradientTextView gradientTextView, View view) {
        if (z11) {
            if (c15034e.f52519e.contains(homePreferencesContentItem.getValue())) {
                c15034e.f52519e.remove(homePreferencesContentItem.getValue());
            } else {
                c15034e.f52519e.clear();
                c15034e.f52519e.add(homePreferencesContentItem.getValue());
            }
            c15034e.m67282I(linearLayout);
        } else {
            boolean zContains = c15034e.f52519e.contains(homePreferencesContentItem.getValue());
            boolean z12 = !zContains;
            if (zContains) {
                c15034e.f52519e.remove(homePreferencesContentItem.getValue());
            } else {
                if (i11 > 0 && c15034e.f52519e.size() >= i11) {
                    String string = context.getString(R$string.home_preferences_max_select_tips, Integer.valueOf(i11));
                    Intrinsics.m97801g(string, "getString(...)");
                    AbstractC14567m.m65699f(string);
                    return;
                }
                c15034e.f52519e.add(homePreferencesContentItem.getValue());
            }
            linearLayout2.setSelected(z12);
            imageView.setImageResource(!zContains ? R$drawable.ic_preferences_heart_selected : R$drawable.ic_preferences_heart_unselected);
            Intrinsics.m97799e(context);
            c15034e.m67276B(gradientTextView, context, z12);
        }
        Function1 function1 = c15034e.f52521g;
        if (function1 != null) {
            function1.invoke(CollectionsKt.m97340R0(c15034e.f52519e));
        }
    }

    /* JADX INFO: renamed from: G */
    private final List m67280G(List list, int i11) {
        List[] listArr = new List[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            listArr[i12] = new ArrayList();
        }
        float[] fArr = new float[i11];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HomePreferencesContentItem homePreferencesContentItem = (HomePreferencesContentItem) it.next();
            float fM67281H = m67281H(homePreferencesContentItem.getName());
            float f11 = Float.MAX_VALUE;
            int i13 = -1;
            for (int i14 = 0; i14 < i11; i14++) {
                if (listArr[i14].size() < 8) {
                    float f12 = fArr[i14];
                    if (f12 < f11) {
                        i13 = i14;
                        f11 = f12;
                    }
                }
            }
            if (i13 == -1) {
                break;
            }
            listArr[i13].add(homePreferencesContentItem);
            fArr[i13] = fArr[i13] + fM67281H + this.f52527m;
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i15 = 0; i15 < i11; i15++) {
            arrayList.add(CollectionsKt.m97340R0(listArr[i15]));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    private final float m67281H(String str) {
        return Math.max((this.f52524j * 2) + this.f52530p.measureText(str) + this.f52529o + this.f52528n, this.f52526l);
    }

    /* JADX INFO: renamed from: I */
    private final void m67282I(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) childAt;
                int childCount2 = linearLayout.getChildCount();
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt2 = linearLayout.getChildAt(i12);
                    if (childAt2 instanceof LinearLayout) {
                        LinearLayout linearLayout2 = (LinearLayout) childAt2;
                        if (linearLayout2.getTag() instanceof String) {
                            Object tag = linearLayout2.getTag();
                            Intrinsics.m97800f(tag, "null cannot be cast to non-null type kotlin.String");
                            boolean zContains = this.f52519e.contains((String) tag);
                            linearLayout2.setSelected(zContains);
                            if (linearLayout2.getChildCount() >= 2) {
                                View childAt3 = linearLayout2.getChildAt(0);
                                GradientTextView gradientTextView = childAt3 instanceof GradientTextView ? (GradientTextView) childAt3 : null;
                                if (gradientTextView != null) {
                                    Context context = linearLayout2.getContext();
                                    Intrinsics.m97801g(context, "getContext(...)");
                                    m67276B(gradientTextView, context, zContains);
                                }
                                View childAt4 = linearLayout2.getChildAt(1);
                                ImageView imageView = childAt4 instanceof ImageView ? (ImageView) childAt4 : null;
                                if (imageView != null) {
                                    imageView.setImageResource(zContains ? R$drawable.ic_preferences_heart_selected : R$drawable.ic_preferences_heart_unselected);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, OperateItem item) {
        boolean zM97797c;
        final C15034e c15034e = this;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        long jNanoTime = System.nanoTime();
        final HomePreferencesConfig homePreferencesConfig = item.getHomePreferencesConfig();
        if (homePreferencesConfig == null) {
            return;
        }
        List<HomePreferencesContentItem> options = homePreferencesConfig.getOptions();
        if (options.isEmpty()) {
            return;
        }
        TextView textView = (TextView) helper.getViewOrNull(R$id.tv_title);
        if (textView != null) {
            textView.setText(homePreferencesConfig.getTitle());
        }
        ImageView imageView = (ImageView) helper.getViewOrNull(R$id.iv_close);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.trending.provider.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C15034e.m67277D(this.f52503a, homePreferencesConfig, view);
                }
            });
        }
        LinearLayout linearLayout = (LinearLayout) helper.getViewOrNull(R$id.ll_rows_container);
        if (linearLayout == null) {
            return;
        }
        boolean zM97797c2 = Intrinsics.m97797c(homePreferencesConfig.getSelectType(), HomePreferencesSelectType.SINGLE.getValue());
        String labelId = homePreferencesConfig.getLabelId();
        List listM67280G = (List) c15034e.f52531q.get(labelId);
        if (listM67280G != null) {
            List listX = CollectionsKt.m97518x(listM67280G);
            boolean z11 = listX.size() == options.size();
            if (z11) {
                List list = listX;
                ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((HomePreferencesContentItem) it.next()).getValue());
                }
                List<HomePreferencesContentItem> list2 = options;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.m97516v(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((HomePreferencesContentItem) it2.next()).getValue());
                }
                zM97797c = Intrinsics.m97797c(arrayList, arrayList2);
            } else {
                zM97797c = false;
            }
            if (!z11 || !zM97797c) {
                listM67280G = c15034e.m67280G(options, options.size() <= 8 ? 1 : (int) Math.ceil(options.size() / 8));
                c15034e.f52531q.put(labelId, listM67280G);
            }
        } else {
            listM67280G = c15034e.m67280G(options, options.size() <= 8 ? 1 : (int) Math.ceil(options.size() / 8));
            c15034e.f52531q.put(labelId, listM67280G);
        }
        int size = listM67280G.size();
        Object tag = linearLayout.getTag();
        if (!Intrinsics.m97797c(tag instanceof String ? (String) tag : null, labelId) || linearLayout.getChildCount() == 0) {
            linearLayout.removeAllViews();
            int i11 = 0;
            for (Object obj : listM67280G) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                List list3 = (List) obj;
                LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
                linearLayout2.setOrientation(0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (i11 > 0) {
                    layoutParams.topMargin = c15034e.f52527m;
                }
                linearLayout2.setLayoutParams(layoutParams);
                m67275A(linearLayout2, list3, zM97797c2, homePreferencesConfig.getMaxSelectNum(), linearLayout);
                linearLayout.addView(linearLayout2);
                c15034e = this;
                i11 = i12;
            }
            linearLayout.setTag(labelId);
        }
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) helper.getViewOrNull(R$id.hsv_tags);
        if (horizontalScrollView != null) {
            horizontalScrollView.scrollTo(0, 0);
        }
        float fNanoTime = (System.nanoTime() - jNanoTime) / 1000000.0f;
        C26866a.a.m104898f(C26866a.f81698a, "HomePreferencesProvider", "convert cost=" + fNanoTime + "ms, items=" + options.size() + ", rows=" + size, false, 4, null);
    }

    /* JADX INFO: renamed from: J */
    public final void m67286J(Function1 function1) {
        this.f52520f = function1;
    }

    /* JADX INFO: renamed from: K */
    public final void m67287K(Function1 function1) {
        this.f52523i = function1;
    }

    /* JADX INFO: renamed from: L */
    public final void m67288L(Function3 function3) {
        this.f52522h = function3;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.PREFERENCES.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_home_preferences;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: t */
    public void mo36344t(BaseViewHolder holder) {
        HomePreferencesConfig homePreferencesConfig;
        List<Object> data;
        Intrinsics.m97802h(holder, "holder");
        super.mo36344t(holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        OperateItem operateItem = (baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? null : (OperateItem) CollectionsKt.m97362l0(data, bindingAdapterPosition);
        OperateItem operateItem2 = operateItem instanceof OperateItem ? operateItem : null;
        if (operateItem2 == null || (homePreferencesConfig = operateItem2.getHomePreferencesConfig()) == null) {
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "HomePreferencesProvider", "onViewAttachedToWindow: labelId=" + homePreferencesConfig.getLabelId(), false, 4, null);
        Function1 function1 = this.f52523i;
        if (function1 != null) {
            function1.invoke(homePreferencesConfig);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: u */
    public void mo36345u(BaseViewHolder holder) {
        HomePreferencesConfig homePreferencesConfig;
        List<Object> data;
        Intrinsics.m97802h(holder, "holder");
        super.mo36345u(holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        OperateItem operateItem = (baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? null : (OperateItem) CollectionsKt.m97362l0(data, bindingAdapterPosition);
        OperateItem operateItem2 = operateItem instanceof OperateItem ? operateItem : null;
        if (operateItem2 == null || (homePreferencesConfig = operateItem2.getHomePreferencesConfig()) == null) {
            return;
        }
        List<HomePreferencesContentItem> options = homePreferencesConfig.getOptions();
        ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(options, 10));
        Iterator<T> it = options.iterator();
        while (it.hasNext()) {
            arrayList.add(((HomePreferencesContentItem) it.next()).getValue());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (this.f52519e.contains((String) obj)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            C26866a.a.m104898f(C26866a.f81698a, "HomePreferencesProvider", "onViewDetachedFromWindow: no selection, skip submit, labelId=" + homePreferencesConfig.getLabelId(), false, 4, null);
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "HomePreferencesProvider", "onViewDetachedFromWindow: try submit, labelId=" + homePreferencesConfig.getLabelId() + ", options=" + arrayList2, false, 4, null);
        Function3 function3 = this.f52522h;
        if (function3 != null) {
            function3.invoke(homePreferencesConfig, arrayList2, "opt_scroll");
        }
    }
}
