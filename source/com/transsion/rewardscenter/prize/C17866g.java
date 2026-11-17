package com.transsion.rewardscenter.prize;

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
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.rewardscenter.R$color;
import com.transsion.rewardscenterapi.DrawChance;
import com.transsion.rewardscenterapi.DrawResult;
import com.transsion.rewardscenterapi.UserPrize;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.transsion.rewardscenter.prize.g */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002/0B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J%\u0010\u0018\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R*\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00061"}, m97100d2 = {"Lcom/transsion/rewardscenter/prize/g;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/rewardscenter/prize/e;", "Laq/a;", XLogUtil.TAG, "<init>", "(Laq/a;)V", "", "Y1", "()V", "V1", "Lcom/transsion/rewardscenterapi/UserPrize;", "userPrize", "W1", "(Lcom/transsion/rewardscenterapi/UserPrize;)V", "", "drawResultId", "U1", "(Ljava/lang/String;)V", "T1", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "Lcom/transsion/rewardscenterapi/DrawResult;", "G", "Ljava/util/List;", "allRows", "Lcom/transsion/rewardscenterapi/DrawChance;", "H", "Lcom/transsion/rewardscenterapi/DrawChance;", "drawChance", "", "I", "Z", "isExpanded", "Lkotlin/Function0;", "J", "Lkotlin/jvm/functions/Function0;", "S1", "()Lkotlin/jvm/functions/Function0;", "X1", "(Lkotlin/jvm/functions/Function0;)V", "onCollapse", "K", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "RewardsCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class C17866g extends BaseProviderMultiAdapter<AbstractC17864e> {

    /* JADX INFO: renamed from: L */
    public static final int f58678L = 8;

    /* JADX INFO: renamed from: M */
    public static final int f58679M = 2;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private List<DrawResult> allRows;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private DrawChance drawChance;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean isExpanded;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private Function0<Unit> onCollapse;

    /* JADX INFO: renamed from: com.transsion.rewardscenter.prize.g$b */
    public static final class b extends RecyclerView.AbstractC4213l {

        /* JADX INFO: renamed from: a */
        private final int f58684a;

        /* JADX INFO: renamed from: b */
        private final int f58685b;

        /* JADX INFO: renamed from: c */
        private final Paint f58686c;

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            int i11 = 0;
            this(i11, i11, 3, null);
        }

        public b(int i11, int i12) {
            this.f58684a = i11;
            this.f58685b = i12;
            this.f58686c = new Paint();
        }

        public /* synthetic */ b(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 1 : i12);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            outRect.set(0, 0, 0, parent.getChildAdapterPosition(view) < state.m20926b() + (-1) ? this.f58684a + this.f58685b : this.f58684a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void onDraw(Canvas c11, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(c11, "c");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            this.f58686c.setColor(AbstractC2397b.getColor(parent.getContext(), R$color.prize_list_divider));
            int childCount = parent.getChildCount() - 1;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = parent.getChildAt(i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int paddingLeft = parent.getPaddingLeft();
                int width = parent.getWidth() - parent.getPaddingRight();
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C4215n) layoutParams)).bottomMargin;
                c11.drawRect(paddingLeft, bottom, width, this.f58685b + bottom, this.f58686c);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17866g(C4698a config) {
        super(null, 1, null);
        Intrinsics.m97802h(config, "config");
        this.allRows = CollectionsKt.m97506l();
        mo36107F1(new C17861b(config));
        mo36107F1(new C17870k(config));
        mo36107F1(new C17863d(new Function0() { // from class: com.transsion.rewardscenter.prize.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C17866g.m76157R1(this.f58676a);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R1 */
    public static final Unit m76157R1(C17866g c17866g) {
        c17866g.m76159Y1();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: V1 */
    private final void m76158V1() {
        ArrayList arrayList = new ArrayList();
        DrawChance drawChance = this.drawChance;
        if (drawChance != null) {
            arrayList.add(new AbstractC17864e.a(drawChance));
        }
        if (this.isExpanded || this.allRows.size() <= 2) {
            List<DrawResult> list = this.allRows;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.m97516v(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new AbstractC17864e.c((DrawResult) it.next()));
            }
            arrayList.addAll(arrayList2);
        } else {
            List listK0 = CollectionsKt.m97333K0(this.allRows, 2);
            ArrayList arrayList3 = new ArrayList(CollectionsKt.m97516v(listK0, 10));
            Iterator it2 = listK0.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new AbstractC17864e.c((DrawResult) it2.next()));
            }
            arrayList.addAll(arrayList3);
        }
        if (this.allRows.size() > 2) {
            arrayList.add(new AbstractC17864e.b(this.isExpanded));
        }
        mo36201n1(arrayList);
    }

    /* JADX INFO: renamed from: Y1 */
    private final void m76159Y1() {
        Function0<Unit> function0;
        this.isExpanded = !this.isExpanded;
        m76158V1();
        if (this.isExpanded || (function0 = this.onCollapse) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends AbstractC17864e> data, int position) {
        Intrinsics.m97802h(data, "data");
        AbstractC17864e abstractC17864e = data.get(position);
        if (abstractC17864e instanceof AbstractC17864e.a) {
            return PrizeItemType.DRAW_CHANCE.getValue();
        }
        if (abstractC17864e instanceof AbstractC17864e.c) {
            return PrizeItemType.ROW.getValue();
        }
        if (abstractC17864e instanceof AbstractC17864e.b) {
            return PrizeItemType.FOOTER.getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: S1 */
    public final Function0<Unit> m76160S1() {
        return this.onCollapse;
    }

    /* JADX INFO: renamed from: T1 */
    public final void m76161T1(String drawResultId) {
        Intrinsics.m97802h(drawResultId, "drawResultId");
        List<DrawResult> list = this.allRows;
        ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(list, 10));
        for (DrawResult drawResultCopy : list) {
            if (Intrinsics.m97797c(drawResultCopy.getDrawResultId(), drawResultId)) {
                drawResultCopy = drawResultCopy.copy((507 & 1) != 0 ? drawResultCopy.drawResultId : null, (507 & 2) != 0 ? drawResultCopy.source : null, (507 & 4) != 0 ? drawResultCopy.claimStatus : "CLAIM_STATUS_CLAIMED", (507 & 8) != 0 ? drawResultCopy.needFill : null, (507 & 16) != 0 ? drawResultCopy.fillStatus : null, (507 & 32) != 0 ? drawResultCopy.fulfillStatus : null, (507 & 64) != 0 ? drawResultCopy.imgUrl : null, (507 & 128) != 0 ? drawResultCopy.title : null, (507 & 256) != 0 ? drawResultCopy.prizeType : null);
            }
            arrayList.add(drawResultCopy);
        }
        this.allRows = arrayList;
        m76158V1();
    }

    /* JADX INFO: renamed from: U1 */
    public final void m76162U1(String drawResultId) {
        Intrinsics.m97802h(drawResultId, "drawResultId");
        List<DrawResult> list = this.allRows;
        ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(list, 10));
        for (DrawResult drawResultCopy : list) {
            if (Intrinsics.m97797c(drawResultCopy.getDrawResultId(), drawResultId)) {
                drawResultCopy = drawResultCopy.copy((507 & 1) != 0 ? drawResultCopy.drawResultId : null, (507 & 2) != 0 ? drawResultCopy.source : null, (507 & 4) != 0 ? drawResultCopy.claimStatus : "CLAIM_STATUS_TOP_UP", (507 & 8) != 0 ? drawResultCopy.needFill : null, (507 & 16) != 0 ? drawResultCopy.fillStatus : null, (507 & 32) != 0 ? drawResultCopy.fulfillStatus : null, (507 & 64) != 0 ? drawResultCopy.imgUrl : null, (507 & 128) != 0 ? drawResultCopy.title : null, (507 & 256) != 0 ? drawResultCopy.prizeType : null);
            }
            arrayList.add(drawResultCopy);
        }
        this.allRows = arrayList;
        m76158V1();
    }

    /* JADX INFO: renamed from: W1 */
    public final void m76163W1(UserPrize userPrize) {
        List<DrawResult> listL;
        this.drawChance = userPrize != null ? userPrize.getDrawChance() : null;
        if (userPrize == null || (listL = userPrize.getPrizeItems()) == null) {
            listL = CollectionsKt.m97506l();
        }
        this.allRows = listL;
        this.isExpanded = false;
        m76158V1();
    }

    /* JADX INFO: renamed from: X1 */
    public final void m76164X1(Function0<Unit> function0) {
        this.onCollapse = function0;
    }
}
