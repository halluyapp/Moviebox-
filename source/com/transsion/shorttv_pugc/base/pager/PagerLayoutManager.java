package com.transsion.shorttv_pugc.base.pager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.C4247n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.shorttv_pugc.base.pager.PagerLayoutManager;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mt.AbstractC25907a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001?\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010!\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u0010'\"\u0004\b7\u00108R\u0016\u0010:\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00102R\u0016\u0010<\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00102R\u0016\u0010>\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00102R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/base/pager/PagerLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToWindow", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroidx/recyclerview/widget/RecyclerView$t;", "recycler", "onDetachedFromWindow", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$t;)V", "Landroid/view/View;", "T", "()Landroid/view/View;", "dy", "Landroidx/recyclerview/widget/RecyclerView$y;", "state", "scrollVerticallyBy", "(ILandroidx/recyclerview/widget/RecyclerView$t;Landroidx/recyclerview/widget/RecyclerView$y;)I", "dx", "scrollHorizontallyBy", "Lmt/a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "X", "(Lmt/a;)V", "onLayoutChildren", "(Landroidx/recyclerview/widget/RecyclerView$t;Landroidx/recyclerview/widget/RecyclerView$y;)V", "", "canScrollVertically", "()Z", "Landroidx/recyclerview/widget/n;", "a", "Lkotlin/Lazy;", "U", "()Landroidx/recyclerview/widget/n;", "pagerSnapHelper", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lmt/a;", "onViewPagerListener", "c", "I", "direction", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Z", "getCanScrollVertically", "W", "(Z)V", "e", "oldState", "f", "oldPosition", "g", "oldPositionIdle", "com/transsion/shorttv_pugc/base/pager/PagerLayoutManager$b", "h", "Lcom/transsion/shorttv_pugc/base/pager/PagerLayoutManager$b;", "rvScrollListener", "Landroidx/recyclerview/widget/RecyclerView$o;", "i", "Landroidx/recyclerview/widget/RecyclerView$o;", "childAttachStateChangeListener", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class PagerLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy pagerSnapHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private AbstractC25907a onViewPagerListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int direction;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean canScrollVertically;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int oldState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int oldPosition;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int oldPositionIdle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C19242b rvScrollListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final RecyclerView.InterfaceC4216o childAttachStateChangeListener;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.pager.PagerLayoutManager$a */
    public static final class C19241a implements RecyclerView.InterfaceC4216o {
        C19241a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC4216o
        public void onChildViewAttachedToWindow(View view) {
            AbstractC25907a abstractC25907a;
            Intrinsics.m97802h(view, "view");
            int position = PagerLayoutManager.this.getPosition(view);
            if (PagerLayoutManager.this.getChildCount() == 1 && position == 0 && (abstractC25907a = PagerLayoutManager.this.onViewPagerListener) != null) {
                abstractC25907a.mo81290b(view);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC4216o
        public void onChildViewDetachedFromWindow(View view) {
            Intrinsics.m97802h(view, "view");
            if (PagerLayoutManager.this.direction >= 0) {
                AbstractC25907a abstractC25907a = PagerLayoutManager.this.onViewPagerListener;
                if (abstractC25907a != null) {
                    abstractC25907a.mo81291c(true, PagerLayoutManager.this.getPosition(view), view);
                    return;
                }
                return;
            }
            AbstractC25907a abstractC25907a2 = PagerLayoutManager.this.onViewPagerListener;
            if (abstractC25907a2 != null) {
                abstractC25907a2.mo81291c(false, PagerLayoutManager.this.getPosition(view), view);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.pager.PagerLayoutManager$b */
    public static final class C19242b extends RecyclerView.AbstractC4219r {
        C19242b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i11);
            View viewFindSnapView = PagerLayoutManager.this.m80573U().findSnapView(PagerLayoutManager.this);
            if (viewFindSnapView == null) {
                return;
            }
            int position = PagerLayoutManager.this.getPosition(viewFindSnapView);
            if (PagerLayoutManager.this.oldState != i11 && PagerLayoutManager.this.oldPosition != position) {
                PagerLayoutManager.this.oldState = i11;
                PagerLayoutManager.this.oldPosition = position;
                AbstractC25907a abstractC25907a = PagerLayoutManager.this.onViewPagerListener;
                if (abstractC25907a != null) {
                    abstractC25907a.mo81289a(position, position == PagerLayoutManager.this.getItemCount() - 1, viewFindSnapView);
                }
            }
            if (i11 == 0) {
                PagerLayoutManager.this.oldPositionIdle = position;
                AbstractC25907a abstractC25907a2 = PagerLayoutManager.this.onViewPagerListener;
                if (abstractC25907a2 != null) {
                    abstractC25907a2.mo81292d(position, position == PagerLayoutManager.this.getItemCount() - 1, viewFindSnapView);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerLayoutManager(Context context) {
        super(context);
        Intrinsics.m97802h(context, "context");
        this.pagerSnapHelper = LazyKt.m97097b(new Function0() { // from class: mt.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PagerLayoutManager.m80574V();
            }
        });
        this.canScrollVertically = true;
        this.oldState = -1;
        this.oldPosition = -1;
        this.oldPositionIdle = -1;
        this.rvScrollListener = new C19242b();
        this.childAttachStateChangeListener = new C19241a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.m97802h(context, "context");
        this.pagerSnapHelper = LazyKt.m97097b(new Function0() { // from class: mt.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PagerLayoutManager.m80574V();
            }
        });
        this.canScrollVertically = true;
        this.oldState = -1;
        this.oldPosition = -1;
        this.oldPositionIdle = -1;
        this.rvScrollListener = new C19242b();
        this.childAttachStateChangeListener = new C19241a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public final C4247n m80573U() {
        return (C4247n) this.pagerSnapHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C4247n m80574V() {
        return new C4247n();
    }

    /* JADX INFO: renamed from: T */
    public final View m80575T() {
        return m80573U().findSnapView(this);
    }

    /* JADX INFO: renamed from: W */
    public final void m80576W(boolean z11) {
        this.canScrollVertically = z11;
    }

    /* JADX INFO: renamed from: X */
    public final void m80577X(AbstractC25907a listener) {
        this.onViewPagerListener = listener;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC4214m
    public boolean canScrollVertically() {
        return this.canScrollVertically & super.canScrollVertically();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4214m
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        if ((recyclerView != null ? recyclerView.getOnFlingListener() : null) == null) {
            m80573U().attachToRecyclerView(recyclerView);
        }
        if (recyclerView != null) {
            recyclerView.addOnChildAttachStateChangeListener(this.childAttachStateChangeListener);
        }
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.rvScrollListener);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC4214m
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C4221t recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (recyclerView != null) {
            recyclerView.removeOnChildAttachStateChangeListener(this.childAttachStateChangeListener);
        }
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.rvScrollListener);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC4214m
    public void onLayoutChildren(RecyclerView.C4221t recycler, RecyclerView.C4226y state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC4214m
    public int scrollHorizontallyBy(int dx2, RecyclerView.C4221t recycler, RecyclerView.C4226y state) {
        this.direction = dx2;
        return super.scrollHorizontallyBy(dx2, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC4214m
    public int scrollVerticallyBy(int dy2, RecyclerView.C4221t recycler, RecyclerView.C4226y state) {
        this.direction = dy2;
        return super.scrollVerticallyBy(dy2, recycler, state);
    }
}
