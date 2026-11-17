package com.transsion.room.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.transsion.room.R$layout;
import com.transsion.room.api.RoomsViewType;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import gq.C23646i0;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mg.C25824a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m97100d2 = {"Lcom/transsion/room/widget/TrendingRoomsView;", "Lcom/transsion/room/widget/RoomsBaseView;", "Lgq/i0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "initRecyclerView", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/appcompat/widget/AppCompatTextView;", "getTitleView", "()Landroidx/appcompat/widget/AppCompatTextView;", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class TrendingRoomsView extends RoomsBaseView<C23646i0> {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TrendingRoomsView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TrendingRoomsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TrendingRoomsView(Context context, AttributeSet attributeSet, int i11) {
        AppCompatTextView appCompatTextView;
        View view;
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        View.inflate(context, R$layout.view_trending_rooms, this);
        setMViewBinding(C23646i0.m93541a(this));
        initRecyclerView();
        getMAdapter().m76717G1(RoomsViewType.TYPE_TRENDING);
        C23646i0 mViewBinding = getMViewBinding();
        if (mViewBinding != null && (view = mViewBinding.f72217b) != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.widget.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TrendingRoomsView.m77549F(this.f59632a, view2);
                }
            });
        }
        C23646i0 mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (appCompatTextView = mViewBinding2.f72220e) == null) {
            return;
        }
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.widget.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TrendingRoomsView.m77550G(this.f59633a, view2);
            }
        });
    }

    public /* synthetic */ TrendingRoomsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m77549F(TrendingRoomsView trendingRoomsView, View view) {
        trendingRoomsView.m77519A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final void m77550G(TrendingRoomsView trendingRoomsView, View view) {
        trendingRoomsView.m77520B();
    }

    @Override // com.transsion.room.widget.RoomsBaseView
    public RecyclerView getRecyclerView() {
        C23646i0 mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            return mViewBinding.f72218c;
        }
        return null;
    }

    @Override // com.transsion.room.widget.RoomsBaseView
    public AppCompatTextView getTitleView() {
        C23646i0 mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            return mViewBinding.f72221f;
        }
        return null;
    }

    @Override // com.transsion.room.widget.RoomsBaseView
    public void initRecyclerView() {
        RecyclerView recyclerView;
        C23646i0 mViewBinding = getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f72218c) == null) {
            return;
        }
        recyclerView.setLayoutManager(new NpaGridLayoutManager(recyclerView.getContext(), 3, 1, false));
        recyclerView.addItemDecoration(new C25824a(AbstractC23384a.m92908b(8), AbstractC23384a.m92908b(8), 0, 0));
        recyclerView.setAdapter(getMAdapter());
    }
}
