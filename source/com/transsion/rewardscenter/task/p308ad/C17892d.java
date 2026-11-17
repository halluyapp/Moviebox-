package com.transsion.rewardscenter.task.p308ad;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.AbstractC2397b;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.transsion.rewardscenter.R$color;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.rewardscenter.task.ad.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m97100d2 = {"Lcom/transsion/rewardscenter/task/ad/d;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/rewardscenter/task/ad/v;", "Lcom/transsion/rewardscenter/task/ad/MemberTaskAdHelper;", "adHelper", "<init>", "(Lcom/transsion/rewardscenter/task/ad/MemberTaskAdHelper;)V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "a", "RewardsCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C17892d extends BaseProviderMultiAdapter<AbstractC17914v> {

    /* JADX INFO: renamed from: G */
    public static final int f58773G = 8;

    /* JADX INFO: renamed from: com.transsion.rewardscenter.task.ad.d$a */
    public static final class a extends RecyclerView.AbstractC4213l {

        /* JADX INFO: renamed from: a */
        private final int f58774a;

        /* JADX INFO: renamed from: b */
        private final int f58775b;

        /* JADX INFO: renamed from: c */
        private final Paint f58776c;

        public a(int i11, int i12) {
            this.f58774a = i11;
            this.f58775b = i12;
            this.f58776c = new Paint();
        }

        public /* synthetic */ a(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i13 & 2) != 0 ? 1 : i12);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            outRect.set(0, 0, 0, parent.getChildAdapterPosition(view) < state.m20926b() + (-1) ? this.f58774a + this.f58775b : this.f58774a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void onDraw(Canvas c11, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(c11, "c");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            this.f58776c.setColor(AbstractC2397b.getColor(parent.getContext(), R$color.prize_list_divider));
            int childCount = parent.getChildCount() - 1;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = parent.getChildAt(i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int paddingLeft = parent.getPaddingLeft();
                int width = parent.getWidth() - parent.getPaddingRight();
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C4215n) layoutParams)).bottomMargin;
                c11.drawRect(paddingLeft, bottom, width, this.f58775b + bottom, this.f58776c);
            }
        }
    }

    public C17892d(MemberTaskAdHelper memberTaskAdHelper) {
        super(null, 1, null);
        mo36107F1(new C17910r(memberTaskAdHelper));
        mo36107F1(new C17911s());
        mo36107F1(new C17905m(memberTaskAdHelper));
        mo36107F1(new C17908p(memberTaskAdHelper));
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends AbstractC17914v> data, int position) {
        Intrinsics.m97802h(data, "data");
        AbstractC17914v abstractC17914v = data.get(position);
        if (abstractC17914v instanceof AbstractC17914v.c) {
            return AdTaskType.STAGE_AD.getValue();
        }
        if (abstractC17914v instanceof AbstractC17914v.a) {
            return AdTaskType.REGULAR_AD.getValue();
        }
        if (abstractC17914v instanceof AbstractC17914v.b) {
            return AdTaskType.REWARD_AD.getValue();
        }
        throw new NoWhenBranchMatchedException();
    }
}
