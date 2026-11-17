package com.transsion.rewardscenter.redeem;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.AbstractC2397b;
import androidx.recyclerview.widget.RecyclerView;
import aq.C4698a;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.cloud.config.utils.XLogUtil;
import com.transsion.rewardscenter.R$color;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.rewardscenter.redeem.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m97100d2 = {"Lcom/transsion/rewardscenter/redeem/d;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/rewardscenter/redeem/e;", "Laq/a;", XLogUtil.TAG, "<init>", "(Laq/a;)V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "a", "RewardsCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C17874d extends BaseProviderMultiAdapter<AbstractC17875e> {

    /* JADX INFO: renamed from: G */
    public static final int f58705G = 8;

    /* JADX INFO: renamed from: com.transsion.rewardscenter.redeem.d$a */
    public static final class a extends RecyclerView.AbstractC4213l {

        /* JADX INFO: renamed from: a */
        private final int f58706a;

        /* JADX INFO: renamed from: b */
        private final int f58707b;

        /* JADX INFO: renamed from: c */
        private final Paint f58708c;

        /* JADX WARN: Illegal instructions before constructor call */
        public a() {
            int i11 = 0;
            this(i11, i11, 3, null);
        }

        public a(int i11, int i12) {
            this.f58706a = i11;
            this.f58707b = i12;
            this.f58708c = new Paint();
        }

        public /* synthetic */ a(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 1 : i12);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            outRect.set(0, 0, 0, parent.getChildAdapterPosition(view) < state.m20926b() + (-1) ? this.f58706a + this.f58707b : this.f58706a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void onDraw(Canvas c11, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(c11, "c");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            this.f58708c.setColor(AbstractC2397b.getColor(parent.getContext(), R$color.prize_list_divider));
            int childCount = parent.getChildCount() - 1;
            for (int i11 = 1; i11 < childCount; i11++) {
                View childAt = parent.getChildAt(i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int paddingLeft = parent.getPaddingLeft();
                int width = parent.getWidth() - parent.getPaddingRight();
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C4215n) layoutParams)).bottomMargin;
                c11.drawRect(paddingLeft, bottom, width, this.f58707b + bottom, this.f58708c);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17874d(C4698a config) {
        super(null, 1, null);
        Intrinsics.m97802h(config, "config");
        mo36107F1(new C17879i());
        mo36107F1(new SkuItemProvider(config));
        mo36107F1(new LotteryItemProvider(config));
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends AbstractC17875e> data, int position) {
        Intrinsics.m97802h(data, "data");
        AbstractC17875e abstractC17875e = data.get(position);
        if (abstractC17875e instanceof AbstractC17875e.c) {
            return RedeemType.TITLE.getValue();
        }
        if (abstractC17875e instanceof AbstractC17875e.b) {
            return RedeemType.SKU.getValue();
        }
        if (abstractC17875e instanceof AbstractC17875e.a) {
            return RedeemType.LOTTERY.getValue();
        }
        throw new NoWhenBranchMatchedException();
    }
}
