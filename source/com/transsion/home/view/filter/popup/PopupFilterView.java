package com.transsion.home.view.filter.popup;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.AbstractC0783a0;
import androidx.compose.foundation.layout.AbstractC0785b0;
import androidx.compose.foundation.layout.AbstractC0791e0;
import androidx.compose.foundation.layout.C0784b;
import androidx.compose.foundation.layout.C0789d0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p019ui.ComposedModifierKt;
import androidx.compose.p019ui.InterfaceC1262b;
import androidx.compose.p019ui.InterfaceC1302f;
import androidx.compose.p019ui.graphics.painter.Painter;
import androidx.compose.p019ui.layout.InterfaceC1699t;
import androidx.compose.p019ui.node.ComposeUiNode;
import androidx.compose.p019ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p019ui.platform.ComposeView;
import androidx.compose.p019ui.text.font.AbstractC2046h;
import androidx.compose.p019ui.text.font.C2054p;
import androidx.compose.p019ui.text.style.AbstractC2159p;
import androidx.compose.runtime.AbstractC1113f3;
import androidx.compose.runtime.AbstractC1114g;
import androidx.compose.runtime.AbstractC1144k;
import androidx.compose.runtime.AbstractC1238u2;
import androidx.compose.runtime.AbstractC1241v1;
import androidx.compose.runtime.InterfaceC1109f;
import androidx.compose.runtime.InterfaceC1117g2;
import androidx.compose.runtime.InterfaceC1124i;
import androidx.compose.runtime.InterfaceC1126i1;
import androidx.compose.runtime.InterfaceC1176s;
import androidx.compose.runtime.internal.AbstractC1134b;
import androidx.compose.runtime.snapshots.C1221t;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.p1004lifecycle.ViewTreeLifecycleOwner;
import androidx.p1004lifecycle.ViewTreeViewModelStoreOwner;
import androidx.p1005savedstate.InterfaceC4393e;
import androidx.p1005savedstate.ViewTreeSavedStateRegistryOwner;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$color;
import com.transsion.baseui.R$drawable;
import com.transsion.home.R$mipmap;
import com.transsion.home.bean.FilterVal;
import com.transsion.home.bean.Item;
import com.transsion.home.view.filter.popup.PopupFilterView;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26006c;
import p474i0.AbstractC23939b;
import p474i0.AbstractC23942e;
import p629o0.AbstractC26153x;
import p629o0.C26138i;
import p690q.AbstractC26970g;
import p948yl.AbstractC28984w;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001\"B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JG\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2(\b\u0002\u0010\u0016\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u0015¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001d\u001a\u00020\u00172\u001e\u0010\u001c\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u001b\u0012\u0004\u0012\u00020\u00170\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00172\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b\u001f\u0010 R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R0\u0010'\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u001b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*²\u0006\u000e\u0010)\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002"}, m97100d2 = {"Lcom/transsion/home/view/filter/popup/PopupFilterView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lcom/transsion/home/bean/Item;", "filterItem", "", "m", "(Ljava/util/List;)Z", "data", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "selectItems", "", "initSelectData", "(Ljava/util/List;Ljava/util/HashMap;)V", "Lkotlin/Function1;", "", "callback", "setOnFilterListener", "(Lkotlin/jvm/functions/Function1;)V", "FilterLinear", "(Ljava/util/List;Landroidx/compose/runtime/i;I)V", "Landroidx/compose/runtime/snapshots/t;", "a", "Landroidx/compose/runtime/snapshots/t;", "selectItemsMap", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/jvm/functions/Function1;", "onFilterChangedListener", "Companion", "currentPopup", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class PopupFilterView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C1221t selectItemsMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Function1 onFilterChangedListener;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.transsion.home.view.filter.popup.PopupFilterView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m68848a(float f11, float f12) {
            return ((int) f11) + "," + ((int) f12);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.view.filter.popup.PopupFilterView$b */
    static final class C15531b implements Function2 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ List f53600b;

        C15531b(List list) {
            this.f53600b = list;
        }

        /* JADX INFO: renamed from: a */
        public final void m68849a(InterfaceC1124i interfaceC1124i, int i11) {
            if ((i11 & 3) == 2 && interfaceC1124i.mo4471h()) {
                interfaceC1124i.mo4443G();
                return;
            }
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5039Q(486758898, i11, -1, "com.transsion.home.view.filter.popup.PopupFilterView.initSelectData.<anonymous>.<anonymous> (PopupFilterView.kt:93)");
            }
            PopupFilterView.this.FilterLinear(this.f53600b, interfaceC1124i, 0);
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5038P();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m68849a((InterfaceC1124i) obj, ((Number) obj2).intValue());
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupFilterView(Context context) {
        super(context);
        Intrinsics.m97802h(context, "context");
        this.selectItemsMap = new C1221t();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupFilterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(attrs, "attrs");
        this.selectItemsMap = new C1221t();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupFilterView(Context context, AttributeSet attrs, int i11) {
        super(context, attrs, i11);
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(attrs, "attrs");
        this.selectItemsMap = new C1221t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Unit m68840f(PopupFilterView popupFilterView, Item item, InterfaceC1126i1 interfaceC1126i1, String str) {
        if (str != null) {
            popupFilterView.selectItemsMap.put(item.getFilterType(), str);
            Function1 function1 = popupFilterView.onFilterChangedListener;
            if (function1 != null) {
                function1.invoke(popupFilterView.selectItemsMap.m5651l());
            }
        }
        m68846l(interfaceC1126i1, "");
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Unit m68841g(Item item, InterfaceC1126i1 interfaceC1126i1) {
        m68846l(interfaceC1126i1, item.getFilterType());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Unit m68842h(InterfaceC1126i1 interfaceC1126i1) {
        m68846l(interfaceC1126i1, "multi");
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final Unit m68843i(PopupFilterView popupFilterView, InterfaceC1126i1 interfaceC1126i1, boolean z11) {
        Function1 function1;
        m68846l(interfaceC1126i1, "");
        if (z11 && (function1 = popupFilterView.onFilterChangedListener) != null) {
            function1.invoke(popupFilterView.selectItemsMap.m5651l());
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initSelectData$default(PopupFilterView popupFilterView, List list, HashMap map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        popupFilterView.initSelectData(list, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Unit m68844j(PopupFilterView popupFilterView, List list, int i11, InterfaceC1124i interfaceC1124i, int i12) {
        popupFilterView.FilterLinear(list, interfaceC1124i, AbstractC1241v1.m5707a(i11 | 1));
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: k */
    private static final String m68845k(InterfaceC1126i1 interfaceC1126i1) {
        return (String) interfaceC1126i1.getValue();
    }

    /* JADX INFO: renamed from: l */
    private static final void m68846l(InterfaceC1126i1 interfaceC1126i1, String str) {
        interfaceC1126i1.setValue(str);
    }

    /* JADX INFO: renamed from: m */
    private final boolean m68847m(List filterItem) {
        if (filterItem != null) {
            Iterator it = filterItem.iterator();
            while (it.hasNext()) {
                Item item = (Item) it.next();
                String str = (String) this.selectItemsMap.get(item.getFilterType());
                if (item.getRangeVals() == null && Intrinsics.m97797c(item.getShowOut(), "false")) {
                    if (str != null && !Intrinsics.m97797c(str, item.getFilterValsV2().get(0).getId())) {
                        return true;
                    }
                } else if (item.getRangeVals() != null) {
                    String strM68848a = INSTANCE.m68848a(item.getRangeVals().getMinVal(), item.getRangeVals().getMaxVal());
                    if (str != null && !Intrinsics.m97797c(str, strM68848a)) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public final void FilterLinear(final List<Item> list, InterfaceC1124i interfaceC1124i, final int i11) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i12;
        InterfaceC1124i interfaceC1124i2;
        ArrayList arrayList3;
        final InterfaceC1126i1 interfaceC1126i1;
        int i13;
        long jM94702a;
        long jM94702a2;
        Object next;
        String name;
        long jM94702a3;
        int i14 = 1;
        InterfaceC1124i interfaceC1124iMo4469g = interfaceC1124i.mo4469g(541655127);
        int i15 = (i11 & 6) == 0 ? (interfaceC1124iMo4469g.mo4433A(list) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i15 |= interfaceC1124iMo4469g.mo4433A(this) ? 32 : 16;
        }
        if ((i15 & 19) == 18 && interfaceC1124iMo4469g.mo4471h()) {
            interfaceC1124iMo4469g.mo4443G();
            interfaceC1124i2 = interfaceC1124iMo4469g;
        } else {
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5039Q(541655127, i15, -1, "com.transsion.home.view.filter.popup.PopupFilterView.FilterLinear (PopupFilterView.kt:127)");
            }
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    Item item = (Item) obj;
                    if (Intrinsics.m97797c(item.getShowOut(), "true") && item.getRangeVals() == null) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (list != null) {
                arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (Intrinsics.m97797c(((Item) obj2).getShowOut(), "false")) {
                        arrayList2.add(obj2);
                    }
                }
            } else {
                arrayList2 = new ArrayList();
            }
            ArrayList arrayList4 = arrayList2;
            Iterator it = arrayList4.iterator();
            while (true) {
                i12 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Item item2 = (Item) it.next();
                if (!item2.getFilterValsV2().isEmpty() && this.selectItemsMap.get(item2.getFilterType()) == null) {
                    this.selectItemsMap.put(item2.getFilterType(), item2.getFilterValsV2().get(0).getId());
                }
            }
            interfaceC1124iMo4469g.mo4456P(1849434622);
            Object objMo4497y = interfaceC1124iMo4469g.mo4497y();
            if (objMo4497y == InterfaceC1124i.f3683a.m4902a()) {
                objMo4497y = AbstractC1238u2.m5702c("", null, 2, null);
                interfaceC1124iMo4469g.mo4484p(objMo4497y);
            }
            final InterfaceC1126i1 interfaceC1126i2 = (InterfaceC1126i1) objMo4497y;
            interfaceC1124iMo4469g.mo4448K();
            InterfaceC1302f interfaceC1302fM3423p = SizeKt.m3423p(SizeKt.m3411d(InterfaceC1302f.f4127a, 0.0f, 1, null), null, false, 3, null);
            InterfaceC1699t interfaceC1699tM3475b = AbstractC0783a0.m3475b(C0784b.f2739a.m3478c(), InterfaceC1262b.f4036a.m5757h(), interfaceC1124iMo4469g, 48);
            int iM4878a = AbstractC1114g.m4878a(interfaceC1124iMo4469g, 0);
            InterfaceC1176s interfaceC1176sMo4481n = interfaceC1124iMo4469g.mo4481n();
            InterfaceC1302f interfaceC1302fM5740e = ComposedModifierKt.m5740e(interfaceC1124iMo4469g, interfaceC1302fM3423p);
            ComposeUiNode.Companion companion = ComposeUiNode.f5204c1;
            Function0 function0M7740a = companion.m7740a();
            if (!(interfaceC1124iMo4469g.mo4472i() instanceof InterfaceC1109f)) {
                AbstractC1114g.m4879b();
            }
            interfaceC1124iMo4469g.mo4437C();
            if (interfaceC1124iMo4469g.mo4466e()) {
                interfaceC1124iMo4469g.mo4442F(function0M7740a);
            } else {
                interfaceC1124iMo4469g.mo4482o();
            }
            InterfaceC1124i interfaceC1124iM4876a = AbstractC1113f3.m4876a(interfaceC1124iMo4469g);
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1699tM3475b, companion.m7742c());
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1176sMo4481n, companion.m7744e());
            Function2 function2M7741b = companion.m7741b();
            if (interfaceC1124iM4876a.mo4466e() || !Intrinsics.m97797c(interfaceC1124iM4876a.mo4497y(), Integer.valueOf(iM4878a))) {
                interfaceC1124iM4876a.mo4484p(Integer.valueOf(iM4878a));
                interfaceC1124iM4876a.mo4474k(Integer.valueOf(iM4878a), function2M7741b);
            }
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1302fM5740e, companion.m7743d());
            C0789d0 c0789d0 = C0789d0.f2752a;
            int size = arrayList != null ? arrayList.size() : 1;
            float f11 = 2 + ((((Configuration) interfaceC1124iMo4469g.mo4476l(AndroidCompositionLocals_androidKt.m8615f())).screenWidthDp - ((size * 46) + 52.0f)) / size);
            interfaceC1124iMo4469g.mo4456P(-1055580859);
            if (arrayList == null) {
                interfaceC1124i2 = interfaceC1124iMo4469g;
                arrayList3 = arrayList4;
                interfaceC1126i1 = interfaceC1126i2;
                i13 = 0;
            } else {
                int i16 = 0;
                for (Object obj3 : arrayList) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        CollectionsKt.m97515u();
                    }
                    final Item item3 = (Item) obj3;
                    String title = (String) this.selectItemsMap.get(item3.getFilterType());
                    if (title == null) {
                        title = item3.getFilterValsV2().get(i12).getId();
                    }
                    if (Intrinsics.m97797c(title, item3.getFilterValsV2().get(i12).getId())) {
                        interfaceC1124iMo4469g.mo4456P(-1987907022);
                        jM94702a = AbstractC23939b.m94702a(R$color.text_03, interfaceC1124iMo4469g, i12);
                        jM94702a2 = AbstractC23939b.m94702a(R$color.transparent, interfaceC1124iMo4469g, i12);
                        title = item3.getTitle();
                        interfaceC1124iMo4469g.mo4448K();
                    } else {
                        interfaceC1124iMo4469g.mo4456P(-1988249107);
                        jM94702a = AbstractC23939b.m94702a(R$color.white, interfaceC1124iMo4469g, i12);
                        jM94702a2 = AbstractC23939b.m94702a(com.transsion.wrapperad.R$color.white_40, interfaceC1124iMo4469g, i12);
                        Iterator<T> it2 = item3.getFilterValsV2().iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!Intrinsics.m97797c(((FilterVal) next).getId(), title));
                        FilterVal filterVal = (FilterVal) next;
                        if (filterVal != null && (name = filterVal.getName()) != null) {
                            title = name;
                        }
                        interfaceC1124iMo4469g.mo4448K();
                    }
                    String str = title;
                    long j11 = jM94702a2;
                    interfaceC1124iMo4469g.mo4456P(-1055550993);
                    if (Intrinsics.m97797c(m68845k(interfaceC1126i2), item3.getFilterType())) {
                        interfaceC1124iMo4469g.mo4456P(-1746271574);
                        boolean zMo4433A = interfaceC1124iMo4469g.mo4433A(this) | interfaceC1124iMo4469g.mo4433A(item3);
                        Object objMo4497y2 = interfaceC1124iMo4469g.mo4497y();
                        if (zMo4433A || objMo4497y2 == InterfaceC1124i.f3683a.m4902a()) {
                            objMo4497y2 = new Function1() { // from class: yl.k
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    return PopupFilterView.m68840f(this.f88636a, item3, interfaceC1126i2, (String) obj4);
                                }
                            };
                            interfaceC1124iMo4469g.mo4484p(objMo4497y2);
                        }
                        interfaceC1124iMo4469g.mo4448K();
                        AbstractC28984w.m111480e(item3, str, (Function1) objMo4497y2, interfaceC1124iMo4469g, i12);
                    }
                    interfaceC1124iMo4469g.mo4448K();
                    InterfaceC1262b.c cVarM5757h = InterfaceC1262b.f4036a.m5757h();
                    InterfaceC1302f.a aVar = InterfaceC1302f.f4127a;
                    float f12 = i14;
                    ArrayList arrayList5 = arrayList4;
                    float f13 = 100;
                    InterfaceC1302f interfaceC1302fM3003a = BackgroundKt.m3003a(BorderKt.m3019e(SizeKt.m3412e(aVar, C26138i.m102354g(28)), C26138i.m102354g(f12), jM94702a, AbstractC26970g.m105115c(C26138i.m102354g(f13))), j11, AbstractC26970g.m105115c(C26138i.m102354g(f13)));
                    interfaceC1124iMo4469g.mo4456P(-1633490746);
                    boolean zMo4433A2 = interfaceC1124iMo4469g.mo4433A(item3);
                    Object objMo4497y3 = interfaceC1124iMo4469g.mo4497y();
                    if (zMo4433A2 || objMo4497y3 == InterfaceC1124i.f3683a.m4902a()) {
                        objMo4497y3 = new Function0() { // from class: yl.l
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PopupFilterView.m68841g(item3, interfaceC1126i2);
                            }
                        };
                        interfaceC1124iMo4469g.mo4484p(objMo4497y3);
                    }
                    interfaceC1124iMo4469g.mo4448K();
                    InterfaceC1302f interfaceC1302fM3044d = ClickableKt.m3044d(interfaceC1302fM3003a, false, null, null, (Function0) objMo4497y3, 7, null);
                    InterfaceC1699t interfaceC1699tM3475b2 = AbstractC0783a0.m3475b(C0784b.f2739a.m3478c(), cVarM5757h, interfaceC1124iMo4469g, 48);
                    int iM4878a2 = AbstractC1114g.m4878a(interfaceC1124iMo4469g, 0);
                    InterfaceC1176s interfaceC1176sMo4481n2 = interfaceC1124iMo4469g.mo4481n();
                    InterfaceC1302f interfaceC1302fM5740e2 = ComposedModifierKt.m5740e(interfaceC1124iMo4469g, interfaceC1302fM3044d);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.f5204c1;
                    Function0 function0M7740a2 = companion2.m7740a();
                    if (!(interfaceC1124iMo4469g.mo4472i() instanceof InterfaceC1109f)) {
                        AbstractC1114g.m4879b();
                    }
                    interfaceC1124iMo4469g.mo4437C();
                    if (interfaceC1124iMo4469g.mo4466e()) {
                        interfaceC1124iMo4469g.mo4442F(function0M7740a2);
                    } else {
                        interfaceC1124iMo4469g.mo4482o();
                    }
                    InterfaceC1124i interfaceC1124iM4876a2 = AbstractC1113f3.m4876a(interfaceC1124iMo4469g);
                    AbstractC1113f3.m4877b(interfaceC1124iM4876a2, interfaceC1699tM3475b2, companion2.m7742c());
                    AbstractC1113f3.m4877b(interfaceC1124iM4876a2, interfaceC1176sMo4481n2, companion2.m7744e());
                    Function2 function2M7741b2 = companion2.m7741b();
                    if (interfaceC1124iM4876a2.mo4466e() || !Intrinsics.m97797c(interfaceC1124iM4876a2.mo4497y(), Integer.valueOf(iM4878a2))) {
                        interfaceC1124iM4876a2.mo4484p(Integer.valueOf(iM4878a2));
                        interfaceC1124iM4876a2.mo4474k(Integer.valueOf(iM4878a2), function2M7741b2);
                    }
                    AbstractC1113f3.m4877b(interfaceC1124iM4876a2, interfaceC1302fM5740e2, companion2.m7743d());
                    C0789d0 c0789d1 = C0789d0.f2752a;
                    AbstractC0791e0.m3499a(SizeKt.m3419l(aVar, C26138i.m102354g(12)), interfaceC1124iMo4469g, 6);
                    InterfaceC1124i interfaceC1124i3 = interfaceC1124iMo4469g;
                    TextKt.m4312a(str, SizeKt.m3421n(aVar, 0.0f, C26138i.m102354g(f11), 1, null), AbstractC23939b.m94702a(R$color.white, interfaceC1124iMo4469g, 0), AbstractC26153x.m102447c(14), null, C2054p.f6244b.m9555c(), AbstractC2046h.f6219b.m9513b(), 0L, null, null, 0L, AbstractC2159p.f6537a.m10007b(), false, 1, 0, null, null, interfaceC1124i3, 199680, 3120, 120720);
                    IconKt.m4306a(AbstractC23942e.m94712c(R$drawable.ic_arrow_down, interfaceC1124i3, 0), MRAIDPresenter.OPEN, PaddingKt.m3395i(SizeKt.m3412e(SizeKt.m3419l(aVar, C26138i.m102354g(16)), C26138i.m102354g(17)), 0.0f, C26138i.m102354g(f12), 0.0f, 0.0f, 13, null), AbstractC23939b.m94702a(R$color.white, interfaceC1124i3, 0), interfaceC1124i3, 432, 0);
                    AbstractC0791e0.m3499a(SizeKt.m3419l(aVar, C26138i.m102354g(10)), interfaceC1124i3, 6);
                    interfaceC1124i3.mo4487r();
                    AbstractC0791e0.m3499a(SizeKt.m3419l(aVar, C26138i.m102354g(8)), interfaceC1124i3, 6);
                    interfaceC1126i2 = interfaceC1126i2;
                    interfaceC1124iMo4469g = interfaceC1124i3;
                    i12 = 0;
                    arrayList4 = arrayList5;
                    i16 = i17;
                    f11 = f11;
                    i14 = 1;
                }
                interfaceC1124i2 = interfaceC1124iMo4469g;
                arrayList3 = arrayList4;
                interfaceC1126i1 = interfaceC1126i2;
                i13 = i12;
                Unit unit = Unit.f75682a;
            }
            interfaceC1124i2.mo4448K();
            InterfaceC1302f.a aVar2 = InterfaceC1302f.f4127a;
            AbstractC0791e0.m3499a(AbstractC0785b0.m3489a(c0789d0, SizeKt.m3419l(aVar2, C26138i.m102354g(i13)), 1.0f, false, 2, null), interfaceC1124i2, i13);
            interfaceC1124i2.mo4456P(-1055474072);
            if (!arrayList3.isEmpty()) {
                if (m68847m(list)) {
                    interfaceC1124i2.mo4456P(1640111020);
                    jM94702a3 = AbstractC23939b.m94702a(R$color.brand, interfaceC1124i2, i13);
                    interfaceC1124i2.mo4448K();
                } else {
                    interfaceC1124i2.mo4456P(1640207244);
                    jM94702a3 = AbstractC23939b.m94702a(R$color.white, interfaceC1124i2, i13);
                    interfaceC1124i2.mo4448K();
                }
                long j12 = jM94702a3;
                Painter painterM94712c = AbstractC23942e.m94712c(R$mipmap.ic_sub_operation_filter, interfaceC1124i2, i13);
                float f14 = 24;
                InterfaceC1302f interfaceC1302fM3412e = SizeKt.m3412e(SizeKt.m3419l(aVar2, C26138i.m102354g(f14)), C26138i.m102354g(f14));
                interfaceC1124i2.mo4456P(5004770);
                Object objMo4497y4 = interfaceC1124i2.mo4497y();
                if (objMo4497y4 == InterfaceC1124i.f3683a.m4902a()) {
                    objMo4497y4 = new Function0() { // from class: yl.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PopupFilterView.m68842h(interfaceC1126i1);
                        }
                    };
                    interfaceC1124i2.mo4484p(objMo4497y4);
                }
                interfaceC1124i2.mo4448K();
                IconKt.m4306a(painterM94712c, "filter", ClickableKt.m3044d(interfaceC1302fM3412e, false, null, null, (Function0) objMo4497y4, 7, null), j12, interfaceC1124i2, 48, 0);
            }
            interfaceC1124i2.mo4448K();
            interfaceC1124i2.mo4456P(-1055450448);
            if (Intrinsics.m97797c(m68845k(interfaceC1126i1), "multi")) {
                C1221t c1221t = this.selectItemsMap;
                interfaceC1124i2.mo4456P(-1633490746);
                boolean zMo4433A3 = interfaceC1124i2.mo4433A(this);
                Object objMo4497y5 = interfaceC1124i2.mo4497y();
                if (zMo4433A3 || objMo4497y5 == InterfaceC1124i.f3683a.m4902a()) {
                    objMo4497y5 = new Function1() { // from class: yl.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return PopupFilterView.m68843i(this.f88642a, interfaceC1126i1, ((Boolean) obj4).booleanValue());
                        }
                    };
                    interfaceC1124i2.mo4484p(objMo4497y5);
                }
                interfaceC1124i2.mo4448K();
                AbstractC15536e.m68870p(arrayList3, c1221t, (Function1) objMo4497y5, interfaceC1124i2, i13);
            }
            interfaceC1124i2.mo4448K();
            interfaceC1124i2.mo4487r();
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5038P();
            }
        }
        InterfaceC1117g2 interfaceC1117g2Mo4473j = interfaceC1124i2.mo4473j();
        if (interfaceC1117g2Mo4473j != null) {
            interfaceC1117g2Mo4473j.mo4602a(new Function2() { // from class: yl.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return PopupFilterView.m68844j(this.f88644a, list, i11, (InterfaceC1124i) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    public final void initSelectData(List<Item> data, HashMap<String, String> selectItems) {
        List<Item> list = data;
        if (list == null || list.isEmpty()) {
            AbstractC26006c.m102054g(this);
        } else {
            AbstractC26006c.m102058k(this);
        }
        removeAllViews();
        this.selectItemsMap.clear();
        if (selectItems != null) {
            this.selectItemsMap.putAll(selectItems);
        }
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        Object context2 = composeView.getContext();
        ViewTreeLifecycleOwner.m14880b(composeView, context2 instanceof InterfaceC3224u ? (InterfaceC3224u) context2 : null);
        Object context3 = composeView.getContext();
        ViewTreeViewModelStoreOwner.m14882b(composeView, context3 instanceof InterfaceC3233y0 ? (InterfaceC3233y0) context3 : null);
        Object context4 = composeView.getContext();
        ViewTreeSavedStateRegistryOwner.m21732b(composeView, context4 instanceof InterfaceC4393e ? (InterfaceC4393e) context4 : null);
        composeView.setContent(AbstractC1134b.m4967b(486758898, true, new C15531b(data)));
        addView(composeView);
    }

    public final void setOnFilterListener(Function1<? super Map<String, String>, Unit> callback) {
        Intrinsics.m97802h(callback, "callback");
        this.onFilterChangedListener = callback;
    }
}
