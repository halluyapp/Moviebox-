package com.transsion.member.view;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.member.R$styleable;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b*\b\u0007\u0018\u0000 K*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u000568:\u0010\fB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\rJ\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0004\b\u001f\u0010 JE\u0010'\u001a\u00020\u000b26\u0010&\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000b0!¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0007¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u000b¢\u0006\u0004\b+\u0010\rJ\u0015\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u0013¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u00020\u000b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b0\u0010\u0019R\u0016\u00103\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00102R\u0016\u00105\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00102R\u0016\u00107\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00102R\u0016\u00109\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00102R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=RH\u0010A\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000b\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010,\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010FR\u0016\u0010J\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010F¨\u0006L"}, m97100d2 = {"Lcom/transsion/member/view/InviteUserView;", "T", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "()V", "", "dp", "c", "(F)I", "onFinishInflate", "", "isLoadingMoreState", "()Z", "", "list", "setData", "(Ljava/util/List;)V", "", "getData", "()Ljava/util/List;", "Lcom/transsion/member/view/InviteUserView$c;", "binder", "setDataViewBinder", "(Lcom/transsion/member/view/InviteUserView$c;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", NativeComponentConstants.KEY_COMPONENT_TYPE, RequestParameters.POSITION, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setItemClicker", "(Lkotlin/jvm/functions/Function2;)V", "notifyItemInviteUserStateChange", "(I)V", "notifyAllItemInviteUserStateChange", "loadMoreEnable", "setLoadMoreEnable", "(Z)V", "newList", "onLoadMoreCompleted", "a", "I", "doneItemLayoutId", "activeItemLayoutId", "unActiveItemLayoutId", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "loadMoreItemLayoutId", "e", "spanCount", "f", "Ljava/util/List;", "g", "Lcom/transsion/member/view/InviteUserView$c;", "viewBinder", "h", "Lkotlin/jvm/functions/Function2;", "clickListener", "i", "F", "spaceH", "j", "Z", CampaignEx.JSON_KEY_AD_K, "isLoadMoreLoading", "l", "needShowLoadMoreDismissAnimation", "Companion", "Member_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class InviteUserView<T> extends RecyclerView {
    public static final int TYPE_ITEM_ACTIVE = 2;
    public static final int TYPE_ITEM_DONE = 1;
    public static final int TYPE_ITEM_LOADMORE = 4;
    public static final int TYPE_ITEM_UNACTIVE = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int doneItemLayoutId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int activeItemLayoutId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int unActiveItemLayoutId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int loadMoreItemLayoutId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int spanCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private List list;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private InterfaceC15876c viewBinder;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Function2 clickListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float spaceH;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean loadMoreEnable;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean isLoadMoreLoading;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean needShowLoadMoreDismissAnimation;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.transsion.member.view.InviteUserView$a */
    public static final class C15874a extends RecyclerView.AbstractC4219r {
        C15874a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i11, i12);
            if (recyclerView.canScrollHorizontally(1) || !InviteUserView.this.loadMoreEnable || InviteUserView.this.isLoadMoreLoading) {
                return;
            }
            InviteUserView.this.isLoadMoreLoading = true;
            InterfaceC15876c interfaceC15876c = InviteUserView.this.viewBinder;
            if (interfaceC15876c != null) {
                interfaceC15876c.mo70103a();
            }
            RecyclerView.AbstractC4203b0 abstractC4203b0FindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(InviteUserView.this.list.size());
            if (abstractC4203b0FindViewHolderForAdapterPosition != null && (abstractC4203b0FindViewHolderForAdapterPosition instanceof C15878e) && ((C15878e) abstractC4203b0FindViewHolderForAdapterPosition).m70111f() == 4) {
                View itemView = abstractC4203b0FindViewHolderForAdapterPosition.itemView;
                Intrinsics.m97801g(itemView, "itemView");
                AbstractC26006c.m102058k(itemView);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.view.InviteUserView$c */
    public interface InterfaceC15876c {
        /* JADX INFO: renamed from: a */
        void mo70103a();

        /* JADX INFO: renamed from: b */
        int mo70104b(int i11, Object obj);

        /* JADX INFO: renamed from: c */
        void mo70105c(C15878e c15878e, int i11, Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.transsion.member.view.InviteUserView$d */
    final class C15877d extends RecyclerView.Adapter {

        /* JADX INFO: renamed from: a */
        private final int f54395a;

        /* JADX INFO: renamed from: com.transsion.member.view.InviteUserView$d$a */
        public static final class a extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C15878e f54397a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ InviteUserView f54398b;

            a(C15878e c15878e, InviteUserView inviteUserView) {
                this.f54397a = c15878e;
                this.f54398b = inviteUserView;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.m97802h(animation, "animation");
                View itemView = this.f54397a.itemView;
                Intrinsics.m97801g(itemView, "itemView");
                AbstractC26006c.m102055h(itemView);
                this.f54398b.needShowLoadMoreDismissAnimation = false;
                this.f54397a.itemView.setAlpha(1.0f);
                this.f54397a.itemView.setScaleX(1.0f);
                this.f54397a.itemView.setScaleY(1.0f);
                InviteUserView inviteUserView = this.f54398b;
                int width = this.f54397a.itemView.getWidth();
                InviteUserView inviteUserView2 = this.f54398b;
                inviteUserView.smoothScrollBy(-(width + inviteUserView2.m70101c(inviteUserView2.spaceH)), 0);
            }
        }

        public C15877d(int i11) {
            this.f54395a = i11;
        }

        /* JADX INFO: renamed from: h */
        private final View m70107h(int i11, ViewGroup viewGroup) {
            int i12;
            if (InviteUserView.this.loadMoreEnable && i11 == 4 && InviteUserView.this.loadMoreItemLayoutId == 0) {
                ProgressBar progressBar = new ProgressBar(InviteUserView.this.getContext(), null, R.attr.progressBarStyle);
                InviteUserView inviteUserView = InviteUserView.this;
                progressBar.setIndeterminate(true);
                if (Build.VERSION.SDK_INT < 29) {
                    return progressBar;
                }
                progressBar.setMinWidth(inviteUserView.m70101c(50.0f));
                progressBar.setMinHeight(inviteUserView.m70101c(50.0f));
                return progressBar;
            }
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(InviteUserView.this.getContext());
            if (i11 == 1) {
                i12 = InviteUserView.this.doneItemLayoutId;
            } else if (i11 != 2) {
                i12 = i11 != 3 ? InviteUserView.this.loadMoreItemLayoutId : InviteUserView.this.unActiveItemLayoutId;
            } else {
                i12 = InviteUserView.this.activeItemLayoutId;
            }
            View viewInflate = layoutInflaterFrom.inflate(i12, viewGroup, false);
            Intrinsics.m97799e(viewInflate);
            return viewInflate;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final void m70108j(InviteUserView inviteUserView, int i11, C15878e c15878e, View view) {
            Function2 function2 = inviteUserView.clickListener;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(i11), Integer.valueOf(c15878e.m70111f()));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return InviteUserView.this.list.size() + (InviteUserView.this.loadMoreEnable ? 1 : 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i11) {
            if (i11 >= InviteUserView.this.list.size()) {
                return 4;
            }
            InterfaceC15876c interfaceC15876c = InviteUserView.this.viewBinder;
            if (interfaceC15876c != null) {
                return interfaceC15876c.mo70104b(i11, InviteUserView.this.list.get(i11));
            }
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final C15878e holder, final int i11) {
            Intrinsics.m97802h(holder, "holder");
            View view = holder.itemView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = this.f54395a;
            view.setLayoutParams(layoutParams);
            if (holder.m70111f() != 4) {
                InterfaceC15876c interfaceC15876c = InviteUserView.this.viewBinder;
                if (interfaceC15876c != null) {
                    interfaceC15876c.mo70105c(holder, i11, InviteUserView.this.list.get(i11));
                }
                View view2 = holder.itemView;
                final InviteUserView inviteUserView = InviteUserView.this;
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.member.view.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        InviteUserView.C15877d.m70108j(inviteUserView, i11, holder, view3);
                    }
                });
                return;
            }
            if (InviteUserView.this.isLoadMoreLoading) {
                View itemView = holder.itemView;
                Intrinsics.m97801g(itemView, "itemView");
                AbstractC26006c.m102058k(itemView);
                holder.itemView.setAlpha(1.0f);
                holder.itemView.setScaleX(1.0f);
                holder.itemView.setScaleY(1.0f);
                return;
            }
            View itemView2 = holder.itemView;
            Intrinsics.m97801g(itemView2, "itemView");
            AbstractC26006c.m102058k(itemView2);
            if (InviteUserView.this.needShowLoadMoreDismissAnimation) {
                holder.itemView.animate().scaleX(0.1f).scaleY(0.1f).alpha(0.0f).setDuration(200L).setListener(new a(holder, InviteUserView.this)).start();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C15878e onCreateViewHolder(ViewGroup parent, int i11) {
            Intrinsics.m97802h(parent, "parent");
            return new C15878e(InviteUserView.this, m70107h(i11, parent), i11);
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.view.InviteUserView$e */
    public final class C15878e extends RecyclerView.AbstractC4203b0 {

        /* JADX INFO: renamed from: a */
        private final int f54399a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InviteUserView f54400b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15878e(InviteUserView inviteUserView, View itemView, int i11) {
            super(itemView);
            Intrinsics.m97802h(itemView, "itemView");
            this.f54400b = inviteUserView;
            this.f54399a = i11;
        }

        /* JADX INFO: renamed from: f */
        public final int m70111f() {
            return this.f54399a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.view.InviteUserView$f */
    public final class C15879f extends RecyclerView.AbstractC4213l {

        /* JADX INFO: renamed from: a */
        private final int f54401a;

        public C15879f(int i11) {
            this.f54401a = i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
                if (childAdapterPosition == 0) {
                    outRect.left = 0;
                    return;
                } else {
                    outRect.left = this.f54401a;
                    return;
                }
            }
            RecyclerView.Adapter adapter = parent.getAdapter();
            if (childAdapterPosition == (adapter != null ? adapter.getItemCount() : 0) - 1) {
                outRect.left = 0;
            } else {
                outRect.left = this.f54401a;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InviteUserView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InviteUserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InviteUserView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.spanCount = 5;
        this.list = new ArrayList();
        this.spaceH = 8.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.InviteUserView);
        Intrinsics.m97801g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.spaceH = typedArrayObtainStyledAttributes.getFloat(R$styleable.InviteUserView_iuv_inviteViewHorizontalSpace, 8.0f);
        this.doneItemLayoutId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.InviteUserView_iuv_doneItemLayout, R.layout.select_dialog_item);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.InviteUserView_iuv_unActiveItemLayout, R.layout.select_dialog_item);
        this.unActiveItemLayoutId = resourceId;
        this.activeItemLayoutId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.InviteUserView_iuv_activeItemLayout, resourceId);
        this.loadMoreItemLayoutId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.InviteUserView_iuv_loadMoreItemLayout, 0);
        this.spanCount = typedArrayObtainStyledAttributes.getInt(R$styleable.InviteUserView_iuv_length, 5);
        this.loadMoreEnable = typedArrayObtainStyledAttributes.getBoolean(R$styleable.InviteUserView_iuv_loadMoreEnable, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        addOnScrollListener(new C15874a());
    }

    public /* synthetic */ InviteUserView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: b */
    private final void m70100b() {
        View childAt;
        RecyclerView.AbstractC4214m layoutManager = getLayoutManager();
        int measuredHeight = 0;
        if (layoutManager != null && (childAt = layoutManager.getChildAt(0)) != null) {
            measuredHeight = childAt.getMeasuredHeight();
        }
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = paddingTop;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final int m70101c(float dp2) {
        return (int) ((dp2 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m70102d(InviteUserView inviteUserView) {
        inviteUserView.setLayoutManager(new LinearLayoutManager(inviteUserView.getContext(), 0, false));
        int measuredWidth = inviteUserView.getMeasuredWidth();
        int iM70101c = inviteUserView.m70101c(inviteUserView.spaceH);
        int i11 = inviteUserView.spanCount;
        inviteUserView.setAdapter(new C15877d((measuredWidth - (iM70101c * (i11 - 1))) / i11));
        inviteUserView.addItemDecoration(new C15879f(inviteUserView.m70101c(inviteUserView.spaceH)));
        inviteUserView.m70100b();
    }

    public final List<T> getData() {
        return this.list;
    }

    /* JADX INFO: renamed from: isLoadingMoreState, reason: from getter */
    public final boolean getIsLoadMoreLoading() {
        return this.isLoadMoreLoading;
    }

    public final void notifyAllItemInviteUserStateChange() {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void notifyItemInviteUserStateChange(int position) {
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(position);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        post(new Runnable() { // from class: com.transsion.member.view.c
            @Override // java.lang.Runnable
            public final void run() {
                InviteUserView.m70102d(this.f54407a);
            }
        });
    }

    public final void onLoadMoreCompleted(List<? extends T> newList) {
        Intrinsics.m97802h(newList, "newList");
        this.isLoadMoreLoading = false;
        int size = this.list.size();
        this.list.addAll(newList);
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyItemRangeInserted(size, this.list.size());
        }
        this.needShowLoadMoreDismissAnimation = true;
        RecyclerView.Adapter adapter2 = getAdapter();
        if (adapter2 != null) {
            adapter2.notifyItemChanged(this.list.size() + 1);
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setData(List<? extends T> list) {
        Intrinsics.m97802h(list, "list");
        this.list = CollectionsKt.m97343U0(list);
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void setDataViewBinder(InterfaceC15876c binder) {
        Intrinsics.m97802h(binder, "binder");
        this.viewBinder = binder;
    }

    public final void setItemClicker(Function2<? super Integer, ? super Integer, Unit> listener) {
        Intrinsics.m97802h(listener, "listener");
        this.clickListener = listener;
    }

    public final void setLoadMoreEnable(boolean loadMoreEnable) {
        this.loadMoreEnable = loadMoreEnable;
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
