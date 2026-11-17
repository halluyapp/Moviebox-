package com.transsion.shorttv._channel.p312ui.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.transsion.shorttv.R$color;
import com.transsion.shorttv.R$drawable;
import com.transsion.shorttv.R$mipmap;
import com.transsion.shorttv._channel.model.ShortTvFilterVal;
import com.transsion.shorttv._channel.model.ShortTvItem;
import com.transsion.shorttv._channel.p312ui.widget.ShortTvPopupFilterView;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p356ds.AbstractC23048b;
import p918xr.DialogC28650r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 =2\u00020\u0001:\u0001-B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u00020\u00132\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\"\u0010\u0015JG\u0010&\u001a\u00020\u00132\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2(\b\u0002\u0010%\u001a\"\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u0001`$¢\u0006\u0004\b&\u0010'J-\u0010+\u001a\u00020\u00132\u001e\u0010*\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160)\u0012\u0004\u0012\u00020\u00130(¢\u0006\u0004\b+\u0010,R0\u0010/\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160#j\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016`$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R0\u00102\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160)\u0012\u0004\u0012\u00020\u0013\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u00105\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010;¨\u0006>"}, m97100d2 = {"Lcom/transsion/shorttv/_channel/ui/widget/ShortTvPopupFilterView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lcom/transsion/shorttv/_channel/model/ShortTvItem;", "filterItem", "", "i", "(Ljava/util/List;)Z", "data", "", "e", "(Ljava/util/List;)V", "", MimeTypes.BASE_TYPE_TEXT, "isSelected", "Landroid/view/View;", "h", "(Ljava/lang/String;Z)Landroid/view/View;", "anchor", WebConstants.FIELD_ITEM, "selectedId", "l", "(Landroid/view/View;Lcom/transsion/shorttv/_channel/model/ShortTvItem;Ljava/lang/String;)V", "innerData", "j", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "selectItems", "initSelectData", "(Ljava/util/List;Ljava/util/HashMap;)V", "Lkotlin/Function1;", "", "callback", "setOnFilterListener", "(Lkotlin/jvm/functions/Function1;)V", "a", "Ljava/util/HashMap;", "selectItemsMap", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/jvm/functions/Function1;", "onFilterChangedListener", "c", "Ljava/util/List;", "mData", "Lxr/r;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lxr/r;", "mSingleFilterPopup", "Lcom/transsion/shorttv/_channel/ui/widget/a;", "Lcom/transsion/shorttv/_channel/ui/widget/a;", "mMultiFilterPopup", "Companion", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTvPopupFilterView extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HashMap selectItemsMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Function1 onFilterChangedListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private List mData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private DialogC28650r mSingleFilterPopup;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private DialogC18734a mMultiFilterPopup;

    /* JADX INFO: renamed from: com.transsion.shorttv._channel.ui.widget.ShortTvPopupFilterView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m78872a(float f11, float f12) {
            return ((int) f11) + "," + ((int) f12);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTvPopupFilterView(Context context) {
        super(context);
        Intrinsics.m97802h(context, "context");
        this.selectItemsMap = new HashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTvPopupFilterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(attrs, "attrs");
        this.selectItemsMap = new HashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTvPopupFilterView(Context context, AttributeSet attrs, int i11) {
        super(context, attrs, i11);
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(attrs, "attrs");
        this.selectItemsMap = new HashMap();
    }

    /* JADX INFO: renamed from: e */
    private final void m78863e(List data) {
        Object next;
        String title;
        List list = data;
        ArrayList<ShortTvItem> arrayList = new ArrayList();
        for (Object obj : list) {
            ShortTvItem shortTvItem = (ShortTvItem) obj;
            if (Intrinsics.m97797c(shortTvItem.getShowOut(), "true") && shortTvItem.getRangeVals() == null) {
                arrayList.add(obj);
            }
        }
        final ArrayList<ShortTvItem> arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (Intrinsics.m97797c(((ShortTvItem) obj2).getShowOut(), "false")) {
                arrayList2.add(obj2);
            }
        }
        for (ShortTvItem shortTvItem2 : arrayList2) {
            if (!shortTvItem2.getFilterValsV2().isEmpty() && this.selectItemsMap.get(shortTvItem2.getFilterType()) == null) {
                this.selectItemsMap.put(shortTvItem2.getFilterType(), shortTvItem2.getFilterValsV2().get(0).getId());
            }
        }
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(getContext());
        horizontalScrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        horizontalScrollView.setFillViewport(true);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        for (final ShortTvItem shortTvItem3 : arrayList) {
            final String id2 = (String) this.selectItemsMap.get(shortTvItem3.getFilterType());
            if (id2 == null) {
                id2 = !shortTvItem3.getFilterValsV2().isEmpty() ? shortTvItem3.getFilterValsV2().get(0).getId() : "";
            }
            boolean z11 = (shortTvItem3.getFilterValsV2().isEmpty() || Intrinsics.m97797c(id2, shortTvItem3.getFilterValsV2().get(0).getId())) ? false : true;
            Iterator<T> it = shortTvItem3.getFilterValsV2().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.m97797c(((ShortTvFilterVal) next).getId(), id2));
            ShortTvFilterVal shortTvFilterVal = (ShortTvFilterVal) next;
            if (!z11) {
                title = shortTvItem3.getTitle();
            } else if (shortTvFilterVal == null || (title = shortTvFilterVal.getName()) == null) {
                title = id2;
            }
            final View viewM78866h = m78866h(title, z11);
            viewM78866h.setOnClickListener(new View.OnClickListener() { // from class: xr.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShortTvPopupFilterView.m78864f(this.f87855a, viewM78866h, shortTvItem3, id2, view);
                }
            });
            linearLayout.addView(viewM78866h);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(AbstractC5776a0.m27313a(8.0f), 1));
            linearLayout.addView(view);
        }
        View view2 = new View(getContext());
        view2.setLayoutParams(new LinearLayout.LayoutParams(0, 1, 1.0f));
        linearLayout.addView(view2);
        if (!arrayList2.isEmpty()) {
            boolean zM78867i = m78867i(data);
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R$mipmap.short_tv_ic_sub_operation_filter);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(AbstractC5776a0.m27313a(24.0f), AbstractC5776a0.m27313a(24.0f)));
            if (zM78867i) {
                imageView.setColorFilter(imageView.getContext().getResources().getColor(R$color.brand));
            } else {
                imageView.setColorFilter(imageView.getContext().getResources().getColor(R$color.short_tv_white));
            }
            imageView.setOnClickListener(new View.OnClickListener() { // from class: xr.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    ShortTvPopupFilterView.m78865g(this.f87859a, arrayList2, view3);
                }
            });
            linearLayout.addView(imageView);
        }
        horizontalScrollView.addView(linearLayout);
        addView(horizontalScrollView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m78864f(ShortTvPopupFilterView shortTvPopupFilterView, View view, ShortTvItem shortTvItem, String str, View view2) {
        shortTvPopupFilterView.m78870l(view, shortTvItem, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m78865g(ShortTvPopupFilterView shortTvPopupFilterView, List list, View view) {
        shortTvPopupFilterView.m78868j(list);
    }

    /* JADX INFO: renamed from: h */
    private final View m78866h(String text, boolean isSelected) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, AbstractC5776a0.m27313a(28.0f)));
        linearLayout.setPadding(AbstractC5776a0.m27313a(12.0f), 0, AbstractC5776a0.m27313a(10.0f), 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(AbstractC5776a0.m27313a(100.0f));
        if (isSelected) {
            gradientDrawable.setStroke(AbstractC5776a0.m27313a(1.0f), linearLayout.getContext().getResources().getColor(R$color.short_tv_white));
            gradientDrawable.setColor(linearLayout.getContext().getResources().getColor(R$color.short_tv_white_40));
        } else {
            gradientDrawable.setStroke(AbstractC5776a0.m27313a(1.0f), linearLayout.getContext().getResources().getColor(R$color.short_tv_gray_light_40));
            gradientDrawable.setColor(0);
        }
        linearLayout.setBackground(gradientDrawable);
        TextView textView = new TextView(getContext());
        textView.setText(text);
        textView.setTextSize(14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxWidth(AbstractC5776a0.m27313a(120.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R$drawable.short_tv_ic_arrow_down);
        imageView.setColorFilter(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC5776a0.m27313a(16.0f), AbstractC5776a0.m27313a(16.0f));
        layoutParams.setMarginStart(AbstractC5776a0.m27313a(4.0f));
        imageView.setLayoutParams(layoutParams);
        linearLayout.addView(textView);
        linearLayout.addView(imageView);
        return linearLayout;
    }

    /* JADX INFO: renamed from: i */
    private final boolean m78867i(List filterItem) {
        if (filterItem != null) {
            Iterator it = filterItem.iterator();
            while (it.hasNext()) {
                ShortTvItem shortTvItem = (ShortTvItem) it.next();
                String str = (String) this.selectItemsMap.get(shortTvItem.getFilterType());
                if (shortTvItem.getRangeVals() == null && Intrinsics.m97797c(shortTvItem.getShowOut(), "false")) {
                    if (str != null && !shortTvItem.getFilterValsV2().isEmpty() && !Intrinsics.m97797c(str, shortTvItem.getFilterValsV2().get(0).getId())) {
                        return true;
                    }
                } else if (shortTvItem.getRangeVals() != null) {
                    String strM78872a = INSTANCE.m78872a(shortTvItem.getRangeVals().getMinVal(), shortTvItem.getRangeVals().getMaxVal());
                    if (str != null && !Intrinsics.m97797c(str, strM78872a)) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initSelectData$default(ShortTvPopupFilterView shortTvPopupFilterView, List list, HashMap map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        shortTvPopupFilterView.initSelectData(list, map);
    }

    /* JADX INFO: renamed from: j */
    private final void m78868j(List innerData) {
        if (this.mMultiFilterPopup == null) {
            Context context = getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            this.mMultiFilterPopup = new DialogC18734a(context);
        }
        DialogC18734a dialogC18734a = this.mMultiFilterPopup;
        if (dialogC18734a != null) {
            dialogC18734a.m78887l(innerData, this.selectItemsMap, new Function1() { // from class: xr.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShortTvPopupFilterView.m78869k(this.f87863a, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final Unit m78869k(ShortTvPopupFilterView shortTvPopupFilterView, boolean z11) {
        if (z11) {
            Function1 function1 = shortTvPopupFilterView.onFilterChangedListener;
            if (function1 != null) {
                function1.invoke(shortTvPopupFilterView.selectItemsMap);
            }
            List<ShortTvItem> list = shortTvPopupFilterView.mData;
            if (list != null) {
                shortTvPopupFilterView.initSelectData(list, shortTvPopupFilterView.selectItemsMap);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: l */
    private final void m78870l(View anchor, final ShortTvItem item, String selectedId) {
        if (this.mSingleFilterPopup == null) {
            Context context = getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            this.mSingleFilterPopup = new DialogC28650r(context);
        }
        DialogC28650r dialogC28650r = this.mSingleFilterPopup;
        if (dialogC28650r != null) {
            dialogC28650r.m110411j(item, selectedId, new Function1() { // from class: xr.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShortTvPopupFilterView.m78871m(this.f87861a, item, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final Unit m78871m(ShortTvPopupFilterView shortTvPopupFilterView, ShortTvItem shortTvItem, String str) {
        if (str != null) {
            shortTvPopupFilterView.selectItemsMap.put(shortTvItem.getFilterType(), str);
            Function1 function1 = shortTvPopupFilterView.onFilterChangedListener;
            if (function1 != null) {
                function1.invoke(shortTvPopupFilterView.selectItemsMap);
            }
            List<ShortTvItem> list = shortTvPopupFilterView.mData;
            if (list != null) {
                shortTvPopupFilterView.initSelectData(list, shortTvPopupFilterView.selectItemsMap);
            }
        }
        return Unit.f75682a;
    }

    public final void initSelectData(List<ShortTvItem> data, HashMap<String, String> selectItems) {
        this.mData = data;
        List<ShortTvItem> list = data;
        if (list == null || list.isEmpty()) {
            AbstractC23048b.m91691b(this);
            return;
        }
        AbstractC23048b.m91694e(this);
        this.selectItemsMap.clear();
        if (selectItems != null) {
            this.selectItemsMap.putAll(selectItems);
        }
        removeAllViews();
        m78863e(data);
    }

    public final void setOnFilterListener(Function1<? super Map<String, String>, Unit> callback) {
        Intrinsics.m97802h(callback, "callback");
        this.onFilterChangedListener = callback;
    }
}
