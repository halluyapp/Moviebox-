package com.transsion.member.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.member.R$styleable;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b'\b\u0007\u0018\u0000 =2\u00020\u0001:\u0005!\u000b(&\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\fJ\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u001c\u001a\u00020\n26\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\n0\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\fR\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\"R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\"R\u0018\u0010.\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-RH\u00101\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\n\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010\"R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\"R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010\"R\u0016\u0010:\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109¨\u0006>"}, m97100d2 = {"Lcom/transsion/member/view/CheckInView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "()V", "", "dp", "c", "(F)I", "onFinishInflate", "Lcom/transsion/member/view/CheckInView$d;", "binder", "setDataViewBinder", "(Lcom/transsion/member/view/CheckInView$d;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", RequestParameters.POSITION, NativeComponentConstants.KEY_COMPONENT_TYPE, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setItemClicker", "(Lkotlin/jvm/functions/Function2;)V", "notifyItemCheckInStateChange", "(I)V", "notifyAllChange", "a", "I", "unActiveItemLayoutId", "doneItemLayoutId", "activeItemLayoutId", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "unActiveEndLayoutId", "e", "doneEndLayoutId", "f", "activeEndLayoutId", "g", "Lcom/transsion/member/view/CheckInView$d;", "viewBinder", "h", "Lkotlin/jvm/functions/Function2;", "clickListener", "i", "maxLength", "j", "spanCount", CampaignEx.JSON_KEY_AD_K, "endSpanCount", "l", "F", "spaceV", "m", "spaceH", "Companion", "Member_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class CheckInView extends RecyclerView {
    public static final int TYPE_END_ACTIVE = 5;
    public static final int TYPE_END_DONE = 4;
    public static final int TYPE_END_UNACTIVE = 6;
    public static final int TYPE_ITEM_ACTIVE = 2;
    public static final int TYPE_ITEM_DONE = 1;
    public static final int TYPE_ITEM_UNACTIVE = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int unActiveItemLayoutId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int doneItemLayoutId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int activeItemLayoutId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int unActiveEndLayoutId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int doneEndLayoutId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int activeEndLayoutId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private InterfaceC15871d viewBinder;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Function2 clickListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int maxLength;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int spanCount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int endSpanCount;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private float spaceV;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private float spaceH;
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.transsion.member.view.CheckInView$a */
    final class C15868a extends RecyclerView.Adapter {
        public C15868a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final void m70095i(CheckInView checkInView, int i11, C15869b c15869b, View view) {
            Function2 function2 = checkInView.clickListener;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(i11), Integer.valueOf(c15869b.m70098f()));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return CheckInView.this.maxLength;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i11) {
            InterfaceC15871d interfaceC15871d = CheckInView.this.viewBinder;
            if (interfaceC15871d != null) {
                return interfaceC15871d.mo70054b(i11);
            }
            return 3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final C15869b holder, final int i11) {
            Intrinsics.m97802h(holder, "holder");
            InterfaceC15871d interfaceC15871d = CheckInView.this.viewBinder;
            if (interfaceC15871d != null) {
                interfaceC15871d.mo70053a(holder, i11);
            }
            View view = holder.itemView;
            final CheckInView checkInView = CheckInView.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.member.view.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CheckInView.C15868a.m70095i(checkInView, i11, holder, view2);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C15869b onCreateViewHolder(ViewGroup parent, int i11) {
            int i12;
            Intrinsics.m97802h(parent, "parent");
            CheckInView checkInView = CheckInView.this;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(checkInView.getContext());
            switch (i11) {
                case 1:
                    i12 = CheckInView.this.doneItemLayoutId;
                    break;
                case 2:
                    i12 = CheckInView.this.activeItemLayoutId;
                    break;
                case 3:
                    i12 = CheckInView.this.unActiveItemLayoutId;
                    break;
                case 4:
                    i12 = CheckInView.this.doneEndLayoutId;
                    break;
                case 5:
                    i12 = CheckInView.this.activeEndLayoutId;
                    break;
                case 6:
                    i12 = CheckInView.this.unActiveEndLayoutId;
                    break;
                default:
                    i12 = CheckInView.this.unActiveItemLayoutId;
                    break;
            }
            View viewInflate = layoutInflaterFrom.inflate(i12, parent, false);
            Intrinsics.m97801g(viewInflate, "inflate(...)");
            return new C15869b(checkInView, viewInflate, i11);
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.view.CheckInView$b */
    public final class C15869b extends RecyclerView.AbstractC4203b0 {

        /* JADX INFO: renamed from: a */
        private final int f54372a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CheckInView f54373b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15869b(CheckInView checkInView, View itemView, int i11) {
            super(itemView);
            Intrinsics.m97802h(itemView, "itemView");
            this.f54373b = checkInView;
            this.f54372a = i11;
        }

        /* JADX INFO: renamed from: f */
        public final int m70098f() {
            return this.f54372a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.view.CheckInView$d */
    public interface InterfaceC15871d {
        /* JADX INFO: renamed from: a */
        void mo70053a(C15869b c15869b, int i11);

        /* JADX INFO: renamed from: b */
        int mo70054b(int i11);
    }

    /* JADX INFO: renamed from: com.transsion.member.view.CheckInView$e */
    public final class C15872e extends RecyclerView.AbstractC4213l {

        /* JADX INFO: renamed from: a */
        private final int f54374a;

        /* JADX INFO: renamed from: b */
        private final int f54375b;

        /* JADX INFO: renamed from: c */
        private final int f54376c;

        public C15872e(int i11, int i12, int i13) {
            this.f54374a = i11;
            this.f54375b = i12;
            this.f54376c = i13;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            int i11 = this.f54374a;
            int i12 = childAdapterPosition % i11;
            int i13 = this.f54375b;
            outRect.left = (i12 * i13) / i11;
            outRect.right = i13 - (((i12 + 1) * i13) / i11);
            if (childAdapterPosition >= i11) {
                outRect.top = this.f54376c;
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.view.CheckInView$f */
    public static final class C15873f extends GridLayoutManager.AbstractC4187c {

        /* JADX INFO: renamed from: f */
        final /* synthetic */ GridLayoutManager f54379f;

        C15873f(GridLayoutManager gridLayoutManager) {
            this.f54379f = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC4187c
        /* JADX INFO: renamed from: f */
        public int mo20742f(int i11) {
            RecyclerView.AbstractC4214m layoutManager = CheckInView.this.getLayoutManager();
            return i11 == (layoutManager != null ? layoutManager.getItemCount() : this.f54379f.m20737U()) - 1 ? 2 : 1;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckInView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckInView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CheckInView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.spanCount = 4;
        this.endSpanCount = 2;
        this.spaceV = 12.0f;
        this.spaceH = 8.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CheckInView);
        Intrinsics.m97801g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.maxLength = typedArrayObtainStyledAttributes.getInt(R$styleable.CheckInView_civ_length, 7);
        this.spanCount = typedArrayObtainStyledAttributes.getInt(R$styleable.CheckInView_civ_spanCount, 4);
        this.endSpanCount = typedArrayObtainStyledAttributes.getInt(R$styleable.CheckInView_civ_endSpanCount, 2);
        this.spaceV = typedArrayObtainStyledAttributes.getFloat(R$styleable.CheckInView_civ_verticalSpace, 12.0f);
        this.spaceH = typedArrayObtainStyledAttributes.getFloat(R$styleable.CheckInView_civ_horizontalSpace, 8.0f);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CheckInView_civ_unActiveItemLayout, R.layout.select_dialog_item);
        this.unActiveItemLayoutId = resourceId;
        this.doneItemLayoutId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CheckInView_civ_doneItemLayout, resourceId);
        this.activeItemLayoutId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CheckInView_civ_activeItemLayout, this.unActiveItemLayoutId);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CheckInView_civ_unActiveEndLayout, R.layout.select_dialog_item);
        this.unActiveEndLayoutId = resourceId2;
        this.doneEndLayoutId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CheckInView_civ_doneEndLayout, resourceId2);
        this.activeEndLayoutId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CheckInView_civ_activeEndLayout, this.unActiveEndLayoutId);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
    }

    public /* synthetic */ CheckInView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: b */
    private final void m70091b() {
        View childAt;
        RecyclerView.AbstractC4214m layoutManager = getLayoutManager();
        int measuredHeight = 0;
        if (layoutManager != null && (childAt = layoutManager.getChildAt(0)) != null) {
            measuredHeight = childAt.getMeasuredHeight();
        }
        int paddingTop = (measuredHeight * ((this.maxLength / this.spanCount) + 1)) + getPaddingTop() + getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = paddingTop;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    private final int m70092c(float dp2) {
        return (int) ((dp2 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m70093d(CheckInView checkInView) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(checkInView.getContext(), checkInView.spanCount);
        gridLayoutManager.m20740d0(checkInView.new C15873f(gridLayoutManager));
        checkInView.setLayoutManager(gridLayoutManager);
        checkInView.setAdapter(checkInView.new C15868a());
        checkInView.addItemDecoration(checkInView.new C15872e(checkInView.spanCount, checkInView.m70092c(8.0f), checkInView.m70092c(12.0f)));
        checkInView.m70091b();
    }

    public final void notifyAllChange() {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void notifyItemCheckInStateChange(int position) {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(position);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        post(new Runnable() { // from class: com.transsion.member.view.a
            @Override // java.lang.Runnable
            public final void run() {
                CheckInView.m70093d(this.f54403a);
            }
        });
    }

    public final void setDataViewBinder(InterfaceC15871d binder) {
        Intrinsics.m97802h(binder, "binder");
        this.viewBinder = binder;
    }

    public final void setItemClicker(Function2<? super Integer, ? super Integer, Unit> listener) {
        Intrinsics.m97802h(listener, "listener");
        this.clickListener = listener;
    }
}
