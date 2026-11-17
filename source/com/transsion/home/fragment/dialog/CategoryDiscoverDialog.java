package com.transsion.home.fragment.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.tmc.offline.download.constants.OfflineConstantsKt;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$color;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.R$style;
import com.transsion.home.bean.HomeTabItem;
import com.transsion.home.bean.NameImage;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import p462hj.C23860f;
import p765s6.InterfaceC27566d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\b\b\u0007\u0018\u0000 82\u00020\u0001:\u00049:*;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\fJ-\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0003J!\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00062\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u001d¢\u0006\u0004\b \u0010!J2\u0010'\u001a\u00020\u00062#\u0010&\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001e¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00060\"¢\u0006\u0004\b'\u0010(R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R5\u00103\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u001e¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u0006\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\u001e048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u0006<"}, m97100d2 = {"Lcom/transsion/home/fragment/dialog/CategoryDiscoverDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "t0", "(Landroid/view/View;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onActivityCreated", "outState", "onSaveInstanceState", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onResume", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "Lcom/transsion/home/bean/HomeTabItem;", "tabs", "s0", "(Ljava/util/List;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "categoryName", "callback", "q0", "(Lkotlin/jvm/functions/Function1;)V", "", "c", "I", "getCurrentTabIndex", "()I", "r0", "(I)V", "currentTabIndex", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkotlin/jvm/functions/Function1;", "mCallback", "", "e", "Ljava/util/List;", "tabList", "f", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "CategorySelectEvent", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class CategoryDiscoverDialog extends BaseDialog {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    public static final int f52677g = 8;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int currentTabIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function1 mCallback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private List tabList = new ArrayList();

    @Metadata(m97099d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m97100d2 = {"Lcom/transsion/home/fragment/dialog/CategoryDiscoverDialog$CategorySelectEvent;", "Landroid/os/Parcelable;", "categoryName", "", "<init>", "(Ljava/lang/String;)V", "getCategoryName", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", OfflineConstantsKt.OFFLINE_DOWNLOAD_CHANNEL_MODE_OTHER, "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    public static final /* data */ class CategorySelectEvent implements Parcelable {
        private final String categoryName;
        public static final Parcelable.Creator<CategorySelectEvent> CREATOR = new C15132a();
        public static final int $stable = 8;

        /* JADX INFO: renamed from: com.transsion.home.fragment.dialog.CategoryDiscoverDialog$CategorySelectEvent$a */
        public static final class C15132a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CategorySelectEvent createFromParcel(Parcel parcel) {
                Intrinsics.m97802h(parcel, "parcel");
                return new CategorySelectEvent(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CategorySelectEvent[] newArray(int i11) {
                return new CategorySelectEvent[i11];
            }
        }

        public CategorySelectEvent(String categoryName) {
            Intrinsics.m97802h(categoryName, "categoryName");
            this.categoryName = categoryName;
        }

        public static /* synthetic */ CategorySelectEvent copy$default(CategorySelectEvent categorySelectEvent, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = categorySelectEvent.categoryName;
            }
            return categorySelectEvent.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCategoryName() {
            return this.categoryName;
        }

        public final CategorySelectEvent copy(String categoryName) {
            Intrinsics.m97802h(categoryName, "categoryName");
            return new CategorySelectEvent(categoryName);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CategorySelectEvent) && Intrinsics.m97797c(this.categoryName, ((CategorySelectEvent) other).categoryName);
        }

        public final String getCategoryName() {
            return this.categoryName;
        }

        public int hashCode() {
            return this.categoryName.hashCode();
        }

        public String toString() {
            return "CategorySelectEvent(categoryName=" + this.categoryName + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.m97802h(dest, "dest");
            dest.writeString(this.categoryName);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.dialog.CategoryDiscoverDialog$a */
    @Metadata(m97099d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m97100d2 = {"Lcom/transsion/home/fragment/dialog/CategoryDiscoverDialog$a;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/home/bean/HomeTabItem;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "data", "", "currentTabIndex", "<init>", "(Ljava/util/List;I)V", "holder", WebConstants.FIELD_ITEM, "", "C1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/home/bean/HomeTabItem;)V", "F", "I", "G", "a", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @SourceDebugExtension
    public static final class C15133a extends BaseQuickAdapter {

        /* JADX INFO: renamed from: G */
        private static final a f52681G = new a(null);

        /* JADX INFO: renamed from: H */
        public static final int f52682H = 8;

        /* JADX INFO: renamed from: I */
        @Deprecated
        public static final float f52683I = 22.0f;

        /* JADX INFO: renamed from: J */
        @Deprecated
        public static final float f52684J = 120.0f;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        private final int currentTabIndex;

        /* JADX INFO: renamed from: com.transsion.home.fragment.dialog.CategoryDiscoverDialog$a$a */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15133a(List<HomeTabItem> data, int i11) {
            super(R$layout.item_category_discover_layout, data);
            Intrinsics.m97802h(data, "data");
            this.currentTabIndex = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: D1 */
        public static final Unit m67568D1(AppCompatImageView appCompatImageView, String str, View view, boolean z11, boolean z12, long j11) {
            if (!Intrinsics.m97797c(appCompatImageView.getTag(), str)) {
                return Unit.f75682a;
            }
            if (!z11) {
                appCompatImageView.setVisibility(8);
                view.setVisibility(0);
            }
            return Unit.f75682a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
        public void mo36106F(BaseViewHolder holder, HomeTabItem item) {
            Integer width;
            Intrinsics.m97802h(holder, "holder");
            Intrinsics.m97802h(item, "item");
            holder.setText(R$id.tvCategoryName, item.getName());
            final View view = holder.getView(R$id.tvCategoryName);
            final AppCompatImageView appCompatImageView = (AppCompatImageView) holder.getView(R$id.ivCategoryNameImage);
            view.setVisibility(0);
            appCompatImageView.setVisibility(8);
            appCompatImageView.setImageDrawable(null);
            NameImage nameImage = item.getNameImage();
            final String url = nameImage != null ? nameImage.getUrl() : null;
            if (url == null || StringsKt.m98160q0(url)) {
                return;
            }
            Context context = holder.itemView.getContext();
            int iM27313a = AbstractC5776a0.m27313a(120.0f);
            int iM27313a2 = AbstractC5776a0.m27313a(22.0f);
            NameImage nameImage2 = item.getNameImage();
            Integer numValueOf = (nameImage2 == null || (width = nameImage2.getWidth()) == null) ? null : Integer.valueOf(AbstractC5776a0.m27313a(width.intValue()));
            int iH = numValueOf != null ? RangesKt.m97938h(numValueOf.intValue(), iM27313a) : -2;
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            ConstraintLayout.C2308b c2308b = layoutParams instanceof ConstraintLayout.C2308b ? (ConstraintLayout.C2308b) layoutParams : null;
            if (c2308b != null) {
                ((ViewGroup.MarginLayoutParams) c2308b).width = iH;
                ((ViewGroup.MarginLayoutParams) c2308b).height = iM27313a2;
                appCompatImageView.setLayoutParams(c2308b);
            }
            appCompatImageView.setTag(url);
            appCompatImageView.setVisibility(0);
            view.setVisibility(8);
            C23860f.a aVar = C23860f.f72909a;
            Intrinsics.m97799e(context);
            aVar.m94457m(context).m94468g(url).m94470i(R$color.transparent).m94463b(new Function3() { // from class: com.transsion.home.fragment.dialog.c
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CategoryDiscoverDialog.C15133a.m67568D1(appCompatImageView, url, view, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Long) obj3).longValue());
                }
            }).m94465d(appCompatImageView);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.dialog.CategoryDiscoverDialog$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final CategoryDiscoverDialog m67570a() {
            return new CategoryDiscoverDialog();
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.dialog.CategoryDiscoverDialog$c */
    public static final class C15135c extends RecyclerView.AbstractC4213l {

        /* JADX INFO: renamed from: a */
        private final int f52686a;

        /* JADX INFO: renamed from: b */
        private final int f52687b;

        /* JADX INFO: renamed from: c */
        private final boolean f52688c;

        public C15135c(int i11, int i12, boolean z11) {
            this.f52686a = i11;
            this.f52687b = i12;
            this.f52688c = z11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            int i11 = this.f52686a;
            int i12 = childAdapterPosition % i11;
            if (this.f52688c) {
                int i13 = this.f52687b;
                outRect.left = i13 - ((i12 * i13) / i11);
                outRect.right = ((i12 + 1) * i13) / i11;
                if (childAdapterPosition < i11) {
                    outRect.top = i13;
                }
                outRect.bottom = i13;
                return;
            }
            int i14 = this.f52687b;
            outRect.left = (i12 * i14) / i11;
            outRect.right = i14 - (((i12 + 1) * i14) / i11);
            if (childAdapterPosition >= i11) {
                outRect.top = i14;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final void m67559p0(CategoryDiscoverDialog categoryDiscoverDialog, View view) {
        categoryDiscoverDialog.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: t0 */
    private final void m67560t0(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R$id.rvCategories);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
        C15133a c15133a = new C15133a(this.tabList, this.currentTabIndex);
        c15133a.m36227w1(new InterfaceC27566d() { // from class: com.transsion.home.fragment.dialog.b
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                CategoryDiscoverDialog.m67561u0(this.f52727a, baseQuickAdapter, view2, i11);
            }
        });
        recyclerView.setAdapter(c15133a);
        recyclerView.addItemDecoration(new C15135c(2, AbstractC5776a0.m27313a(12.0f), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m67561u0(CategoryDiscoverDialog categoryDiscoverDialog, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        categoryDiscoverDialog.dismissAllowingStateLoss();
        Function1 function1 = categoryDiscoverDialog.mCallback;
        if (function1 != null) {
            Object objL0 = CollectionsKt.m97362l0(adapter.getData(), i11);
            function1.invoke(objL0 instanceof HomeTabItem ? (HomeTabItem) objL0 : null);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState == null || !savedInstanceState.getBoolean("category_discover", false)) {
            return;
        }
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.m97802h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.FullScreenDialogFromBottom);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.m97802h(inflater, "inflater");
        return inflater.inflate(R$layout.dialog_category_discover_layout, container, false);
    }

    @Override // com.transsion.baseui.dialog.BaseDialog, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.m97802h(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("category_discover", true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Window window;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -2);
            window.setGravity(80);
        }
        view.findViewById(R$id.btnClose).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.fragment.dialog.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CategoryDiscoverDialog.m67559p0(this.f52726a, view2);
            }
        });
        m67560t0(view);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m67562q0(Function1 callback) {
        Intrinsics.m97802h(callback, "callback");
        this.mCallback = callback;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m67563r0(int i11) {
        this.currentTabIndex = i11;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m67564s0(List tabs) {
        if (tabs == null) {
            return;
        }
        this.tabList.addAll(CollectionsKt.m97356f0(tabs));
    }
}
