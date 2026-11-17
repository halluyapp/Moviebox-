package com.transsion.moviedetail.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$string;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetailapi.bean.ResourcesSeason;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mg.C25827d;
import p743rh.C27287m;
import p765s6.InterfaceC27566d;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0014\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u00020\f2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R*\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010'R\u0016\u0010+\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, m97100d2 = {"Lcom/transsion/moviedetail/view/DetailSeasonTabView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "res", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "()V", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "adapter", RequestParameters.POSITION, "", "isClick", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "(Lcom/chad/library/adapter/base/BaseQuickAdapter;IZ)V", "", "Lcom/transsion/moviedetailapi/bean/ResourcesSeason;", "list", "subjectType", "setContentData", "(Ljava/util/List;Ljava/lang/Integer;)V", "Lkotlin/Function2;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setItemClickListener", "(Lkotlin/jvm/functions/Function2;)V", "season", "selectSeason", "(I)V", "Lcom/transsion/moviedetail/view/u;", "a", "Lcom/transsion/moviedetail/view/u;", "resolutionTabAdapter", "Lkotlin/jvm/functions/Function2;", "itemClickListener", "c", "I", "curPosition", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class DetailSeasonTabView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C16174u resolutionTabAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Function2 itemClickListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int curPosition;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DetailSeasonTabView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DetailSeasonTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailSeasonTabView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.curPosition = -1;
        m70778b();
    }

    /* JADX INFO: renamed from: b */
    private final void m70778b() {
        C16174u c16174u = new C16174u();
        c16174u.m36227w1(new InterfaceC27566d() { // from class: com.transsion.moviedetail.view.a
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                DetailSeasonTabView.m70779c(this.f54934a, baseQuickAdapter, view, i11);
            }
        });
        this.resolutionTabAdapter = c16174u;
        setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        addItemDecoration(new C25827d(AbstractC23384a.m92908b(12)));
        setAdapter(this.resolutionTabAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m70779c(DetailSeasonTabView detailSeasonTabView, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(999001, 500L) || i11 == detailSeasonTabView.curPosition) {
            return;
        }
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.no_network_tips);
        } else {
            detailSeasonTabView.m70780d(adapter, i11, true);
            detailSeasonTabView.smoothScrollToPosition(i11);
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m70780d(BaseQuickAdapter adapter, int position, boolean isClick) {
        Function2 function2;
        try {
            Object item = adapter.getItem(this.curPosition);
            ResourcesSeason resourcesSeason = item instanceof ResourcesSeason ? (ResourcesSeason) item : null;
            if (resourcesSeason != null) {
                resourcesSeason.setSelected(false);
            }
            adapter.notifyItemChanged(this.curPosition, Boolean.FALSE);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        Object item2 = adapter.getItem(position);
        ResourcesSeason resourcesSeason2 = item2 instanceof ResourcesSeason ? (ResourcesSeason) item2 : null;
        if (resourcesSeason2 != null) {
            resourcesSeason2.setSelected(true);
        }
        adapter.notifyItemChanged(position, Boolean.TRUE);
        if (resourcesSeason2 != null) {
            this.curPosition = position;
            if (!isClick || (function2 = this.itemClickListener) == null) {
                return;
            }
            function2.invoke(Integer.valueOf(position), resourcesSeason2);
        }
    }

    public final void selectSeason(int season) {
        C16174u c16174u;
        List<Object> data;
        C16174u c16174u2 = this.resolutionTabAdapter;
        if (c16174u2 == null) {
            return;
        }
        int i11 = -1;
        if (c16174u2 != null && (data = c16174u2.getData()) != null) {
            Iterator<Object> it = data.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                if (((ResourcesSeason) it.next()).getSe() == season) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
        }
        if (i11 >= 0 && (c16174u = this.resolutionTabAdapter) != null) {
            m70780d(c16174u, i11, false);
        }
    }

    public final void setContentData(List<ResourcesSeason> list, Integer subjectType) {
        Unit unit;
        Intrinsics.m97802h(list, "list");
        this.curPosition = 0;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            ((ResourcesSeason) it.next()).setSelected(true);
            unit = Unit.f75682a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
        }
        C16174u c16174u = this.resolutionTabAdapter;
        if (c16174u != null) {
            c16174u.m70846E1(subjectType);
        }
        C16174u c16174u2 = this.resolutionTabAdapter;
        if (c16174u2 != null) {
            c16174u2.mo36201n1(list);
        }
    }

    public final void setItemClickListener(Function2<? super Integer, ? super ResourcesSeason, Unit> listener) {
        Intrinsics.m97802h(listener, "listener");
        this.itemClickListener = listener;
    }
}
