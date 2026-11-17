package com.transsion.rewardscenter.redeem;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq.C4698a;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.cloud.config.utils.XLogUtil;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.push.PushConstants;
import com.transsion.rewardscenterapi.LotteryPrize;
import com.transsion.rewardscenterapi.Redeem;
import com.transsion.rewardscenterapi.SkuPoint;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\fR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m97100d2 = {"Lcom/transsion/rewardscenter/redeem/RedeemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "h", "()V", "Laq/a;", XLogUtil.TAG, "setCtxConfig", "(Laq/a;)V", "Lcom/transsion/rewardscenterapi/Redeem;", "data", "setRedeemData", "(Lcom/transsion/rewardscenterapi/Redeem;)V", PushConstants.PROVIDER_FIELD_DESTROY, "Lcom/transsion/rewardscenter/redeem/d;", "a", "Lcom/transsion/rewardscenter/redeem/d;", "redeemAdapter", "Landroidx/recyclerview/widget/RecyclerView;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "RewardsCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class RedeemView extends ConstraintLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C17874d redeemAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private RecyclerView recycler;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RedeemView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RedeemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RedeemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        m76179h();
    }

    public /* synthetic */ RedeemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: h */
    private final void m76179h() {
        this.recycler = new RecyclerView(getContext());
        ConstraintLayout.C2308b c2308b = new ConstraintLayout.C2308b(-1, -1);
        int iM27313a = AbstractC5776a0.m27313a(8.0f);
        int i11 = 0;
        setPadding(iM27313a, 0, iM27313a, 0);
        RecyclerView recyclerView = this.recycler;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (recyclerView == null) {
            Intrinsics.m97819y("recycler");
            recyclerView = null;
        }
        addView(recyclerView, c2308b);
        RecyclerView recyclerView2 = this.recycler;
        if (recyclerView2 == null) {
            Intrinsics.m97819y("recycler");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 1, false));
        recyclerView2.addItemDecoration(new C17874d.a(i11, i11, 3, defaultConstructorMarker));
    }

    public final void destroy() {
    }

    public final void setCtxConfig(C4698a config) {
        Intrinsics.m97802h(config, "config");
        this.redeemAdapter = new C17874d(config);
        RecyclerView recyclerView = this.recycler;
        if (recyclerView == null) {
            Intrinsics.m97819y("recycler");
            recyclerView = null;
        }
        recyclerView.setAdapter(this.redeemAdapter);
    }

    public final void setRedeemData(Redeem data) {
        Intrinsics.m97802h(data, "data");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AbstractC17875e.c("Redeem Rewards"));
        List<SkuPoint> skuPointList = data.getSkuPointList();
        if (skuPointList != null) {
            Iterator<T> it = skuPointList.iterator();
            while (it.hasNext()) {
                arrayList.add(new AbstractC17875e.b((SkuPoint) it.next(), data.getHasPaid()));
            }
        }
        LotteryPrize lotteryPrize = data.getLotteryPrize();
        if (lotteryPrize != null) {
            boolean hasPaid = data.getHasPaid();
            List<SkuPoint> skuPointList2 = data.getSkuPointList();
            arrayList.add(new AbstractC17875e.a(lotteryPrize, hasPaid, skuPointList2 != null ? (SkuPoint) CollectionsKt.m97361k0(skuPointList2) : null));
        }
        C17874d c17874d = this.redeemAdapter;
        if (c17874d != null) {
            c17874d.mo36201n1(arrayList);
        }
    }
}
