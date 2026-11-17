package com.transsion.home.view.filter.expand;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.AbstractC2397b;
import com.cloud.tmc.offline.download.constants.OfflineConstantsKt;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$color;
import com.transsion.home.R$drawable;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.ugc.UGCFilterItem;
import com.transsion.home.view.filter.expand.UGCTabExpandView;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26004a;
import ng.AbstractC26006c;
import p552kl.C24688l0;
import p832v6.AbstractC28078a;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0013\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001.B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010\u001aJ\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010\u001aJ0\u0010%\u001a\u00020\u000f2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000f0!¢\u0006\u0004\b%\u0010&J'\u0010)\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R(\u0010;\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010=\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\t088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R3\u0010@\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000f\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010AR\"\u0010I\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006K"}, m97100d2 = {"Lcom/transsion/home/view/filter/expand/UGCTabExpandView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lcom/transsion/home/bean/ugc/UGCFilterItem;", "list", "", "l", "(Ljava/util/List;)V", WebConstants.FIELD_ITEM, "Landroid/view/View;", "itemView", "f", "(Lcom/transsion/home/bean/ugc/UGCFilterItem;Landroid/view/View;)Landroid/view/View;", "m", "(Lcom/transsion/home/bean/ugc/UGCFilterItem;)V", "i", "()V", "", OfflineConstantsKt.OFFLINE_CONFIG_ENABLE, "enableExpand", "(Z)V", "collapse", "expand", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onItemClickListener", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "", "selectedId", "updateData", "(Ljava/util/List;Ljava/lang/String;)V", "getSelectedItem", "()Lcom/transsion/home/bean/ugc/UGCFilterItem;", "Lkl/l0;", "a", "Lkl/l0;", "getBinding", "()Lkl/l0;", "setBinding", "(Lkl/l0;)V", "binding", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/util/List;", "datas", "", "c", "Ljava/util/Map;", "rowMap", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "itemInRow", "e", "Lkotlin/jvm/functions/Function1;", "mOnItemClickListener", "Lcom/transsion/home/bean/ugc/UGCFilterItem;", "curSelectItem", "g", "I", "getInParentIndex", "()I", "setInParentIndex", "(I)V", "inParentIndex", "Companion", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCTabExpandView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C24688l0 binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private List datas;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Map rowMap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Map itemInRow;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Function1 mOnItemClickListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private UGCFilterItem curSelectItem;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int inParentIndex;
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UGCTabExpandView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UGCTabExpandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCTabExpandView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        C24688l0 c24688l0M96970c = C24688l0.m96970c(LayoutInflater.from(getContext()), this, true);
        Intrinsics.m97801g(c24688l0M96970c, "inflate(...)");
        this.binding = c24688l0M96970c;
        this.datas = new ArrayList();
        this.rowMap = new LinkedHashMap();
        this.itemInRow = new LinkedHashMap();
        this.inParentIndex = -1;
        this.binding.f75504c.setOnClickListener(new View.OnClickListener() { // from class: wl.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCTabExpandView.m68818e(this.f87108a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m68818e(UGCTabExpandView uGCTabExpandView, View view) {
        AppCompatTextView appCompatTextView = uGCTabExpandView.binding.f75504c;
        appCompatTextView.setSelected(!appCompatTextView.isSelected());
        if (uGCTabExpandView.binding.f75504c.isSelected()) {
            uGCTabExpandView.expand();
        } else {
            uGCTabExpandView.collapse();
        }
    }

    /* JADX INFO: renamed from: f */
    private final View m68819f(final UGCFilterItem item, View itemView) {
        Typeface typefaceM102047d;
        if (itemView == null) {
            itemView = AbstractC28078a.m109103a(this, R$layout.adapter_filter_item);
        }
        String categoryId = item.getCategoryId();
        UGCFilterItem uGCFilterItem = this.curSelectItem;
        boolean zM97797c = Intrinsics.m97797c(categoryId, uGCFilterItem != null ? uGCFilterItem.getCategoryId() : null);
        TextView textView = (TextView) itemView.findViewById(R$id.filter_item_name);
        textView.setText(item.getNameDesc());
        if (zM97797c) {
            textView.setBackgroundResource(R$drawable.bg_selected_filter_item);
            textView.setTextColor(AbstractC2397b.getColor(textView.getContext(), R$color.text_01));
            Context context = textView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            typefaceM102047d = AbstractC26004a.m102044a(context);
        } else {
            textView.setBackgroundResource(R$color.transparent);
            textView.setTextColor(AbstractC2397b.getColor(textView.getContext(), R$color.text_02));
            Context context2 = textView.getContext();
            Intrinsics.m97801g(context2, "getContext(...)");
            typefaceM102047d = AbstractC26004a.m102047d(context2);
        }
        textView.setTypeface(typefaceM102047d);
        itemView.setOnClickListener(new View.OnClickListener() { // from class: wl.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCTabExpandView.m68821h(this.f87106a, item, view);
            }
        });
        return itemView;
    }

    /* JADX INFO: renamed from: g */
    static /* synthetic */ View m68820g(UGCTabExpandView uGCTabExpandView, UGCFilterItem uGCFilterItem, View view, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            view = null;
        }
        return uGCTabExpandView.m68819f(uGCFilterItem, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m68821h(UGCTabExpandView uGCTabExpandView, UGCFilterItem uGCFilterItem, View view) {
        uGCTabExpandView.m68826m(uGCFilterItem);
        uGCTabExpandView.m68825l(uGCTabExpandView.datas);
        Function1 function1 = uGCTabExpandView.mOnItemClickListener;
        if (function1 != null) {
            function1.invoke(uGCFilterItem);
        }
        C26866a.f81698a.m104912c("UGCTabExpandView", "item clicked: id=" + uGCFilterItem.getCategoryId() + ", name=" + uGCFilterItem.getName(), false);
    }

    /* JADX INFO: renamed from: i */
    private final void m68822i() {
        this.binding.f75503b.post(new Runnable() { // from class: wl.m
            @Override // java.lang.Runnable
            public final void run() {
                UGCTabExpandView.m68823j(this.f87110a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m68823j(UGCTabExpandView uGCTabExpandView) {
        int rowsCount = uGCTabExpandView.binding.f75503b.getRowsCount();
        int i11 = 0;
        for (int i12 = 0; i12 < rowsCount; i12++) {
            ArrayList arrayList = new ArrayList();
            int countInRow = uGCTabExpandView.binding.f75503b.getCountInRow(i12);
            int i13 = 0;
            while (i13 < countInRow) {
                int i14 = i11 + 1;
                UGCFilterItem uGCFilterItem = (UGCFilterItem) uGCTabExpandView.datas.get(i11);
                Map map = uGCTabExpandView.itemInRow;
                String categoryId = uGCFilterItem.getCategoryId();
                if (categoryId == null) {
                    categoryId = "";
                }
                map.put(categoryId, Integer.valueOf(i12));
                arrayList.add(uGCFilterItem);
                i13++;
                i11 = i14;
            }
            uGCTabExpandView.rowMap.put(Integer.valueOf(i12), arrayList);
        }
        if (uGCTabExpandView.rowMap.size() > 1) {
            AppCompatTextView tvExpand = uGCTabExpandView.binding.f75504c;
            Intrinsics.m97801g(tvExpand, "tvExpand");
            AbstractC26006c.m102058k(tvExpand);
        } else {
            AppCompatTextView tvExpand2 = uGCTabExpandView.binding.f75504c;
            Intrinsics.m97801g(tvExpand2, "tvExpand");
            AbstractC26006c.m102055h(tvExpand2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m68824k(UGCTabExpandView uGCTabExpandView) {
        Map map = uGCTabExpandView.itemInRow;
        UGCFilterItem uGCFilterItem = uGCTabExpandView.curSelectItem;
        List list = (List) uGCTabExpandView.rowMap.get((Integer) map.get(uGCFilterItem != null ? uGCFilterItem.getCategoryId() : null));
        if (list == null) {
            list = uGCTabExpandView.datas;
        }
        uGCTabExpandView.m68825l(list);
    }

    /* JADX INFO: renamed from: l */
    private final void m68825l(List list) {
        int childCount = this.binding.f75503b.getChildCount();
        int i11 = 0;
        if (list.size() <= childCount) {
            while (i11 < childCount) {
                View childAt = this.binding.f75503b.getChildAt(i11);
                if (i11 < list.size()) {
                    Intrinsics.m97799e(childAt);
                    AbstractC26006c.m102058k(childAt);
                    m68819f((UGCFilterItem) list.get(i11), childAt);
                } else {
                    Intrinsics.m97799e(childAt);
                    AbstractC26006c.m102054g(childAt);
                }
                i11++;
            }
            return;
        }
        this.binding.f75503b.removeAllViews();
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            UGCFilterItem uGCFilterItem = (UGCFilterItem) obj;
            View childAt2 = this.binding.f75503b.getChildAt(i11);
            if (childAt2 != null) {
                m68819f(uGCFilterItem, childAt2);
            } else {
                this.binding.f75503b.addView(m68820g(this, uGCFilterItem, null, 2, null));
            }
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m68826m(UGCFilterItem item) {
        this.curSelectItem = item;
    }

    public static /* synthetic */ void updateData$default(UGCTabExpandView uGCTabExpandView, List list, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        uGCTabExpandView.updateData(list, str);
    }

    public final void collapse() {
        this.binding.f75503b.setMaxRows(1);
        this.binding.f75504c.setSelected(false);
        this.binding.f75503b.post(new Runnable() { // from class: wl.l
            @Override // java.lang.Runnable
            public final void run() {
                UGCTabExpandView.m68824k(this.f87109a);
            }
        });
    }

    public final void enableExpand(boolean enable) {
        this.binding.f75504c.setEnabled(enable);
    }

    public final void expand() {
        this.binding.f75503b.setMaxRows(Integer.MAX_VALUE);
        this.binding.f75504c.setSelected(true);
        m68825l(this.datas);
    }

    public final C24688l0 getBinding() {
        return this.binding;
    }

    public final int getInParentIndex() {
        return this.inParentIndex;
    }

    /* JADX INFO: renamed from: getSelectedItem, reason: from getter */
    public final UGCFilterItem getCurSelectItem() {
        return this.curSelectItem;
    }

    public final void setBinding(C24688l0 c24688l0) {
        Intrinsics.m97802h(c24688l0, "<set-?>");
        this.binding = c24688l0;
    }

    public final void setInParentIndex(int i11) {
        this.inParentIndex = i11;
    }

    public final void setOnItemClickListener(Function1<? super UGCFilterItem, Unit> onItemClickListener) {
        Intrinsics.m97802h(onItemClickListener, "onItemClickListener");
        this.mOnItemClickListener = onItemClickListener;
    }

    public final void updateData(List<UGCFilterItem> list, String selectedId) {
        Object next;
        Intrinsics.m97802h(list, "list");
        this.datas = list;
        this.rowMap.clear();
        this.itemInRow.clear();
        if (selectedId != null) {
            Iterator it = this.datas.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.m97797c(((UGCFilterItem) next).getCategoryId(), selectedId));
            UGCFilterItem uGCFilterItem = (UGCFilterItem) next;
            if (uGCFilterItem != null) {
                this.curSelectItem = uGCFilterItem;
            }
        }
        if (this.curSelectItem == null && !this.datas.isEmpty()) {
            this.curSelectItem = (UGCFilterItem) CollectionsKt.m97359i0(this.datas);
        }
        m68825l(list);
        m68822i();
        C26866a.f81698a.m104912c("UGCTabExpandView", "updateData: size=" + list.size() + ", selectedId=" + selectedId, false);
    }
}
