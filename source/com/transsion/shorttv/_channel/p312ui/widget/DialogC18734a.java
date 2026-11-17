package com.transsion.shorttv._channel.p312ui.widget;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.slider.InterfaceC10293a;
import com.google.android.material.slider.RangeSlider;
import com.transsion.shorttv.R$color;
import com.transsion.shorttv.R$drawable;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv._channel.model.ShortTvFilterVal;
import com.transsion.shorttv._channel.model.ShortTvItem;
import com.transsion.shorttv._channel.model.ShortTvRangeValue;
import com.transsion.shorttv._channel.p312ui.widget.DialogC18734a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p963z0.C29093c;

/* JADX INFO: renamed from: com.transsion.shorttv._channel.ui.widget.a */
/* JADX INFO: loaded from: classes6.dex */
public final class DialogC18734a extends Dialog {

    /* JADX INFO: renamed from: a */
    private RecyclerView f60493a;

    /* JADX INFO: renamed from: b */
    private View f60494b;

    /* JADX INFO: renamed from: c */
    private View f60495c;

    /* JADX INFO: renamed from: d */
    private ImageView f60496d;

    /* JADX INFO: renamed from: e */
    private b f60497e;

    /* JADX INFO: renamed from: f */
    private List f60498f;

    /* JADX INFO: renamed from: g */
    private Map f60499g;

    /* JADX INFO: renamed from: h */
    private Function1 f60500h;

    /* JADX INFO: renamed from: i */
    private final Map f60501i;

    /* JADX INFO: renamed from: com.transsion.shorttv._channel.ui.widget.a$a */
    public static final class a extends RecyclerView.AbstractC4203b0 {

        /* JADX INFO: renamed from: a */
        private final TextView f60502a;

        /* JADX INFO: renamed from: b */
        private final FlexboxLayout f60503b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView, TextView title, FlexboxLayout flexbox) {
            super(itemView);
            Intrinsics.m97802h(itemView, "itemView");
            Intrinsics.m97802h(title, "title");
            Intrinsics.m97802h(flexbox, "flexbox");
            this.f60502a = title;
            this.f60503b = flexbox;
        }

        /* JADX INFO: renamed from: f */
        public final FlexboxLayout m78888f() {
            return this.f60503b;
        }

        /* JADX INFO: renamed from: g */
        public final TextView m78889g() {
            return this.f60502a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv._channel.ui.widget.a$b */
    public final class b extends RecyclerView.Adapter {

        /* JADX INFO: renamed from: a */
        private final List f60504a;

        /* JADX INFO: renamed from: b */
        private final Map f60505b;

        /* JADX INFO: renamed from: c */
        private final int f60506c;

        /* JADX INFO: renamed from: d */
        private final int f60507d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ DialogC18734a f60508e;

        public b(DialogC18734a dialogC18734a, List items, Map selectItems) {
            Intrinsics.m97802h(items, "items");
            Intrinsics.m97802h(selectItems, "selectItems");
            this.f60508e = dialogC18734a;
            this.f60504a = items;
            this.f60505b = selectItems;
            this.f60507d = 1;
        }

        /* JADX INFO: renamed from: i */
        private final View m78892i(String str, boolean z11, int i11) {
            LinearLayout linearLayout = new LinearLayout(this.f60508e.getContext());
            linearLayout.setGravity(17);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(AbstractC5776a0.m27313a(100.0f));
            if (z11) {
                gradientDrawable.setStroke(AbstractC5776a0.m27313a(1.0f), -1);
                gradientDrawable.setColor(linearLayout.getContext().getResources().getColor(R$color.short_tv_white_40));
            } else {
                gradientDrawable.setStroke(AbstractC5776a0.m27313a(1.0f), linearLayout.getContext().getResources().getColor(R$color.short_tv_gray_light_40));
                gradientDrawable.setColor(0);
            }
            linearLayout.setBackground(gradientDrawable);
            TextView textView = new TextView(this.f60508e.getContext());
            textView.setText(str);
            textView.setTextSize(14.0f);
            textView.setTextColor(-1);
            textView.setTypeface(Typeface.DEFAULT);
            linearLayout.addView(textView);
            return linearLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final void m78893j(b bVar, ShortTvItem shortTvItem, ShortTvFilterVal shortTvFilterVal, int i11, View view) {
            bVar.f60505b.put(shortTvItem.getFilterType(), shortTvFilterVal.getId());
            bVar.notifyItemChanged(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public static final void m78894k(RecyclerView.AbstractC4203b0 abstractC4203b0, b bVar, ShortTvItem shortTvItem, RangeSlider slider, float f11, boolean z11) {
            Intrinsics.m97802h(slider, "slider");
            List<Float> values = slider.getValues();
            Intrinsics.m97801g(values, "getValues(...)");
            if (values.size() >= 2) {
                Float f12 = values.get(0);
                Float f13 = values.get(1);
                c cVar = (c) abstractC4203b0;
                cVar.m78897h().setText(String.valueOf((int) f12.floatValue()));
                cVar.m78895f().setText(String.valueOf((int) f13.floatValue()));
                Map map = bVar.f60505b;
                String filterType = shortTvItem.getFilterType();
                ShortTvPopupFilterView.Companion companion = ShortTvPopupFilterView.INSTANCE;
                Intrinsics.m97799e(f12);
                float fFloatValue = f12.floatValue();
                Intrinsics.m97799e(f13);
                map.put(filterType, companion.m78872a(fFloatValue, f13.floatValue()));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f60504a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i11) {
            return ((ShortTvItem) this.f60504a.get(i11)).getRangeVals() != null ? this.f60507d : this.f60506c;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(final RecyclerView.AbstractC4203b0 holder, final int i11) {
            String str;
            Float fT;
            String str2;
            Float fT2;
            Intrinsics.m97802h(holder, "holder");
            final ShortTvItem shortTvItem = (ShortTvItem) this.f60504a.get(i11);
            if (!(holder instanceof a)) {
                if (holder instanceof c) {
                    c cVar = (c) holder;
                    cVar.m78898i().setText(shortTvItem.getTitle());
                    ShortTvRangeValue rangeVals = shortTvItem.getRangeVals();
                    if (rangeVals == null) {
                        return;
                    }
                    cVar.m78896g().setValueFrom(rangeVals.getMinVal());
                    cVar.m78896g().setValueTo(rangeVals.getMaxVal());
                    cVar.m78896g().setStepSize(1.0f);
                    String str3 = (String) this.f60505b.get(shortTvItem.getFilterType());
                    List listS0 = str3 != null ? StringsKt.m98117S0(str3, new String[]{","}, false, 0, 6, null) : null;
                    float minVal = (listS0 == null || (str2 = (String) CollectionsKt.m97362l0(listS0, 0)) == null || (fT2 = StringsKt.m98214t(str2)) == null) ? rangeVals.getMinVal() : fT2.floatValue();
                    float maxVal = (listS0 == null || (str = (String) CollectionsKt.m97362l0(listS0, 1)) == null || (fT = StringsKt.m98214t(str)) == null) ? rangeVals.getMaxVal() : fT.floatValue();
                    cVar.m78896g().setValues(Float.valueOf(minVal), Float.valueOf(maxVal));
                    cVar.m78897h().setText(String.valueOf((int) minVal));
                    cVar.m78895f().setText(String.valueOf((int) maxVal));
                    cVar.m78896g().addOnChangeListener(new InterfaceC10293a() { // from class: xr.g
                        @Override // com.google.android.material.slider.InterfaceC10293a
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final void mo47285a(RangeSlider rangeSlider, float f11, boolean z11) {
                            DialogC18734a.b.m78894k(holder, this, shortTvItem, rangeSlider, f11, z11);
                        }
                    });
                    return;
                }
                return;
            }
            a aVar = (a) holder;
            aVar.m78889g().setText(shortTvItem.getTitle());
            aVar.m78888f().removeAllViews();
            int iM27313a = (this.f60508e.getContext().getResources().getDisplayMetrics().widthPixels - AbstractC5776a0.m27313a(44.0f)) / 2;
            int i12 = 0;
            for (Object obj : shortTvItem.getFilterValsV2()) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.m97515u();
                }
                final ShortTvFilterVal shortTvFilterVal = (ShortTvFilterVal) obj;
                View viewM78892i = m78892i(shortTvFilterVal.getName(), Intrinsics.m97797c(this.f60505b.get(shortTvItem.getFilterType()), shortTvFilterVal.getId()), iM27313a);
                viewM78892i.setOnClickListener(new View.OnClickListener() { // from class: xr.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        DialogC18734a.b.m78893j(this.f87848a, shortTvItem, shortTvFilterVal, i11, view);
                    }
                });
                FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(iM27313a, AbstractC5776a0.m27313a(32.0f));
                if (i12 % 2 == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = AbstractC5776a0.m27313a(12.0f);
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = AbstractC5776a0.m27313a(12.0f);
                viewM78892i.setLayoutParams(layoutParams);
                aVar.m78888f().addView(viewM78892i);
                i12 = i13;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.AbstractC4203b0 onCreateViewHolder(ViewGroup parent, int i11) {
            Intrinsics.m97802h(parent, "parent");
            LinearLayout linearLayout = new LinearLayout(this.f60508e.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            linearLayout.setPadding(0, 0, 0, AbstractC5776a0.m27313a(16.0f));
            TextView textView = new TextView(this.f60508e.getContext());
            textView.setTextSize(16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setPadding(0, 0, 0, AbstractC5776a0.m27313a(12.0f));
            linearLayout.addView(textView);
            if (i11 == this.f60506c) {
                FlexboxLayout flexboxLayout = new FlexboxLayout(this.f60508e.getContext());
                flexboxLayout.setFlexDirection(0);
                flexboxLayout.setFlexWrap(1);
                linearLayout.addView(flexboxLayout);
                return new a(linearLayout, textView, flexboxLayout);
            }
            LinearLayout linearLayout2 = new LinearLayout(this.f60508e.getContext());
            linearLayout2.setOrientation(1);
            linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            RangeSlider rangeSlider = new RangeSlider(this.f60508e.getContext());
            rangeSlider.setValues(Float.valueOf(0.0f), Float.valueOf(100.0f));
            rangeSlider.setTrackActiveTintList(ColorStateList.valueOf(-1));
            rangeSlider.setTrackInactiveTintList(ColorStateList.valueOf(rangeSlider.getContext().getResources().getColor(R$color.short_tv_white_40)));
            rangeSlider.setThumbTintList(ColorStateList.valueOf(-1));
            rangeSlider.setTickVisible(false);
            LinearLayout linearLayout3 = new LinearLayout(this.f60508e.getContext());
            linearLayout3.setOrientation(0);
            TextView textView2 = new TextView(this.f60508e.getContext());
            textView2.setTextSize(12.0f);
            textView2.setTextColor(-1);
            Typeface typeface = Typeface.DEFAULT_BOLD;
            textView2.setTypeface(typeface);
            TextView textView3 = new TextView(this.f60508e.getContext());
            textView3.setTextSize(12.0f);
            textView3.setTextColor(-1);
            textView3.setTypeface(typeface);
            linearLayout3.addView(textView2);
            View view = new View(this.f60508e.getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
            linearLayout3.addView(view);
            linearLayout3.addView(textView3);
            linearLayout2.addView(rangeSlider);
            linearLayout2.addView(linearLayout3);
            linearLayout.addView(linearLayout2);
            return new c(linearLayout, textView, rangeSlider, textView2, textView3);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv._channel.ui.widget.a$c */
    public static final class c extends RecyclerView.AbstractC4203b0 {

        /* JADX INFO: renamed from: a */
        private final TextView f60509a;

        /* JADX INFO: renamed from: b */
        private final RangeSlider f60510b;

        /* JADX INFO: renamed from: c */
        private final TextView f60511c;

        /* JADX INFO: renamed from: d */
        private final TextView f60512d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View itemView, TextView title, RangeSlider slider, TextView startLabel, TextView endLabel) {
            super(itemView);
            Intrinsics.m97802h(itemView, "itemView");
            Intrinsics.m97802h(title, "title");
            Intrinsics.m97802h(slider, "slider");
            Intrinsics.m97802h(startLabel, "startLabel");
            Intrinsics.m97802h(endLabel, "endLabel");
            this.f60509a = title;
            this.f60510b = slider;
            this.f60511c = startLabel;
            this.f60512d = endLabel;
        }

        /* JADX INFO: renamed from: f */
        public final TextView m78895f() {
            return this.f60512d;
        }

        /* JADX INFO: renamed from: g */
        public final RangeSlider m78896g() {
            return this.f60510b;
        }

        /* JADX INFO: renamed from: h */
        public final TextView m78897h() {
            return this.f60511c;
        }

        /* JADX INFO: renamed from: i */
        public final TextView m78898i() {
            return this.f60509a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC18734a(Context context) {
        super(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        Intrinsics.m97802h(context, "context");
        this.f60498f = CollectionsKt.m97506l();
        this.f60499g = new LinkedHashMap();
        this.f60501i = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: e */
    private final View m78880e() {
        View view = new View(getContext());
        view.setBackgroundColor(view.getContext().getResources().getColor(R$color.short_tv_white_10));
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, AbstractC5776a0.m27313a(1.0f)));
        return view;
    }

    /* JADX INFO: renamed from: f */
    private final boolean m78881f() {
        if (this.f60499g.size() != this.f60501i.size()) {
            return true;
        }
        for (Map.Entry entry : this.f60499g.entrySet()) {
            String str = (String) entry.getKey();
            if (!Intrinsics.m97797c(this.f60501i.get(str), (String) entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final WindowInsetsCompat m78882g(View v11, WindowInsetsCompat insets) {
        Intrinsics.m97802h(v11, "v");
        Intrinsics.m97802h(insets, "insets");
        C29093c insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.m97801g(insets2, "getInsets(...)");
        v11.setPadding(v11.getPaddingLeft(), v11.getPaddingTop(), v11.getPaddingRight(), insets2.f88818d);
        return WindowInsetsCompat.CONSUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m78883h(DialogC18734a dialogC18734a, View view) {
        dialogC18734a.m78886k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m78884i(DialogC18734a dialogC18734a, View view) {
        Function1 function1;
        if (dialogC18734a.m78881f() && (function1 = dialogC18734a.f60500h) != null) {
            function1.invoke(Boolean.TRUE);
        }
        dialogC18734a.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m78885j(DialogC18734a dialogC18734a, View view) {
        dialogC18734a.dismiss();
        Function1 function1 = dialogC18734a.f60500h;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m78886k() {
        for (ShortTvItem shortTvItem : this.f60498f) {
            if (shortTvItem.getRangeVals() != null) {
                this.f60499g.put(shortTvItem.getFilterType(), ShortTvPopupFilterView.INSTANCE.m78872a(shortTvItem.getRangeVals().getMinVal(), shortTvItem.getRangeVals().getMaxVal()));
            } else if (!shortTvItem.getFilterValsV2().isEmpty()) {
                this.f60499g.put(shortTvItem.getFilterType(), shortTvItem.getFilterValsV2().get(0).getId());
            }
        }
        b bVar = this.f60497e;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m78887l(List items, Map selectItems, Function1 callback) {
        Intrinsics.m97802h(items, "items");
        Intrinsics.m97802h(selectItems, "selectItems");
        Intrinsics.m97802h(callback, "callback");
        this.f60498f = items;
        this.f60499g.clear();
        this.f60499g.putAll(selectItems);
        this.f60501i.clear();
        this.f60501i.putAll(selectItems);
        this.f60500h = callback;
        this.f60497e = new b(this, this.f60498f, this.f60499g);
        RecyclerView recyclerView = this.f60493a;
        if (recyclerView != null) {
            if (recyclerView == null) {
                Intrinsics.m97819y("mRecyclerView");
                recyclerView = null;
            }
            recyclerView.setAdapter(this.f60497e);
        }
        if (isShowing()) {
            return;
        }
        show();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        RecyclerView recyclerView;
        Window window;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 35 && (window = getWindow()) != null) {
            WindowCompat.setDecorFitsSystemWindows(window, false);
            View viewFindViewById = window.getDecorView().findViewById(R.id.content);
            Intrinsics.m97799e(viewFindViewById);
            ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new OnApplyWindowInsetsListener() { // from class: xr.b
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return DialogC18734a.m78882g(view, windowInsetsCompat);
                }
            });
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setLayout(-1, -1);
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.addFlags(Integer.MIN_VALUE);
        }
        Window window5 = getWindow();
        if (window5 != null) {
            window5.setStatusBarColor(getContext().getResources().getColor(R$color.short_tv_black_90));
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(linearLayout.getContext().getResources().getColor(R$color.short_tv_black_90));
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(AbstractC5776a0.m27313a(16.0f), AbstractC5776a0.m27313a(12.0f), AbstractC5776a0.m27313a(16.0f), AbstractC5776a0.m27313a(12.0f));
        TextView textView = new TextView(getContext());
        textView.setText(textView.getContext().getString(R$string.short_tv_filter_more_title));
        textView.setTextSize(18.0f);
        textView.setTextColor(-1);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R$drawable.short_tv_music_iv_close);
        imageView.setColorFilter(imageView.getContext().getResources().getColor(R$color.short_tv_white));
        imageView.setLayoutParams(new LinearLayout.LayoutParams(AbstractC5776a0.m27313a(21.0f), AbstractC5776a0.m27313a(21.0f)));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: xr.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC18734a.m78885j(this.f87845a, view);
            }
        });
        this.f60496d = imageView;
        linearLayout2.addView(textView);
        ImageView imageView2 = this.f60496d;
        if (imageView2 == null) {
            Intrinsics.m97819y("mCloseBtn");
            imageView2 = null;
        }
        linearLayout2.addView(imageView2);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(m78880e());
        RecyclerView recyclerView2 = new RecyclerView(getContext());
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
        recyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        recyclerView2.setPadding(AbstractC5776a0.m27313a(16.0f), AbstractC5776a0.m27313a(12.0f), AbstractC5776a0.m27313a(16.0f), AbstractC5776a0.m27313a(12.0f));
        recyclerView2.setClipToPadding(false);
        this.f60493a = recyclerView2;
        linearLayout.addView(recyclerView2);
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(1);
        linearLayout3.setBackgroundColor(linearLayout3.getContext().getResources().getColor(R$color.short_tv_black_90));
        linearLayout3.addView(m78880e());
        LinearLayout linearLayout4 = new LinearLayout(getContext());
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AbstractC5776a0.m27313a(16.0f), AbstractC5776a0.m27313a(12.0f), AbstractC5776a0.m27313a(16.0f), AbstractC5776a0.m27313a(16.0f));
        LinearLayout linearLayout5 = new LinearLayout(getContext());
        linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(-2, AbstractC5776a0.m27313a(48.0f)));
        linearLayout5.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(AbstractC5776a0.m27313a(100.0f));
        gradientDrawable.setStroke(AbstractC5776a0.m27313a(1.0f), linearLayout5.getContext().getResources().getColor(R$color.short_tv_white));
        gradientDrawable.setColor(0);
        linearLayout5.setBackground(gradientDrawable);
        linearLayout5.setOnClickListener(new View.OnClickListener() { // from class: xr.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC18734a.m78883h(this.f87846a, view);
            }
        });
        TextView textView2 = new TextView(linearLayout5.getContext());
        textView2.setText(textView2.getContext().getString(R$string.short_tv_filter_reset));
        textView2.setTextSize(18.0f);
        textView2.setTextColor(-1);
        textView2.setTypeface(typeface);
        textView2.setPadding(AbstractC5776a0.m27313a(24.0f), 0, AbstractC5776a0.m27313a(24.0f), 0);
        linearLayout5.addView(textView2);
        this.f60494b = linearLayout5;
        LinearLayout linearLayout6 = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, AbstractC5776a0.m27313a(48.0f), 1.0f);
        layoutParams.setMarginStart(AbstractC5776a0.m27313a(12.0f));
        linearLayout6.setLayoutParams(layoutParams);
        linearLayout6.setGravity(17);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(AbstractC5776a0.m27313a(100.0f));
        gradientDrawable2.setColor(linearLayout6.getContext().getResources().getColor(R$color.short_tv_white));
        linearLayout6.setBackground(gradientDrawable2);
        linearLayout6.setOnClickListener(new View.OnClickListener() { // from class: xr.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC18734a.m78884i(this.f87847a, view);
            }
        });
        TextView textView3 = new TextView(linearLayout6.getContext());
        textView3.setText(textView3.getContext().getString(R$string.short_tv_filter_confirm));
        textView3.setTextSize(18.0f);
        textView3.setTextColor(textView3.getContext().getResources().getColor(R$color.short_tv_black));
        textView3.setTypeface(typeface);
        linearLayout6.addView(textView3);
        this.f60495c = linearLayout6;
        View view = this.f60494b;
        if (view == null) {
            Intrinsics.m97819y("mResetBtn");
            view = null;
        }
        linearLayout4.addView(view);
        View view2 = this.f60495c;
        if (view2 == null) {
            Intrinsics.m97819y("mConfirmBtn");
            view2 = null;
        }
        linearLayout4.addView(view2);
        linearLayout3.addView(linearLayout4);
        linearLayout.addView(linearLayout3);
        setContentView(linearLayout);
        if (this.f60497e != null) {
            RecyclerView recyclerView3 = this.f60493a;
            if (recyclerView3 == null) {
                Intrinsics.m97819y("mRecyclerView");
                recyclerView = null;
            } else {
                recyclerView = recyclerView3;
            }
            recyclerView.setAdapter(this.f60497e);
        }
    }
}
