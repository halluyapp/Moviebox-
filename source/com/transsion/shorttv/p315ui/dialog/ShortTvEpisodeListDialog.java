package com.transsion.shorttv.p315ui.dialog;

import android.R;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5790i;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.R$id;
import com.google.android.material.tabs.TabLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.shorttv.R$color;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.R$style;
import com.transsion.shorttv.base.dialog.BaseDialog;
import com.transsion.shorttv.bean.ShortTvInfoEpisodeList;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.p315ui.adapter.C18951r;
import com.transsion.shorttv.viewmodel.ShortTvViewModel;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractC25136k;
import p356ds.AbstractC23048b;
import p659os.C26719e;
import p765s6.InterfaceC27566d;
import rs.C27364s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001D\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u001d\u0010\u0010\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u00103R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, m97100d2 = {"Lcom/transsion/shorttv/ui/dialog/ShortTvEpisodeListDialog;", "Lcom/transsion/shorttv/base/dialog/BaseDialog;", "<init>", "()V", "", "Los/e;", "list", "", "P0", "(Ljava/util/List;)V", "", "E0", "()I", "F0", "C0", "N0", "O0", WebConstants.FIELD_ITEM, "M0", "(Los/e;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Lrs/s;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lrs/s;", "dramaDialogEpisodeListBinding", "Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", "c", "Lkotlin/Lazy;", "D0", "()Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", "shortTvPlayListViewModel", "Lcom/transsion/shorttv/bean/Subject;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/shorttv/bean/Subject;", "shortTvInfo", "Landroidx/recyclerview/widget/GridLayoutManager;", "e", "Landroidx/recyclerview/widget/GridLayoutManager;", "gridLayoutManager", "Lcom/transsion/shorttv/ui/adapter/r;", "f", "B0", "()Lcom/transsion/shorttv/ui/adapter/r;", "adapter", "", "g", "Z", "hasTrailer", "", "h", "J", "lastClickTime", "i", "I", "itemHeight", "Ls6/d;", "j", "Ls6/d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "com/transsion/shorttv/ui/dialog/ShortTvEpisodeListDialog$a", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/shorttv/ui/dialog/ShortTvEpisodeListDialog$a;", "onTabSelectedListener", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTvEpisodeListDialog extends BaseDialog {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C27364s dramaDialogEpisodeListBinding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy shortTvPlayListViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Subject shortTvInfo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private GridLayoutManager gridLayoutManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy adapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean hasTrailer;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long lastClickTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int itemHeight;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC27566d listener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C18955a onTabSelectedListener;

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.dialog.ShortTvEpisodeListDialog$a */
    public static final class C18955a implements TabLayout.OnTabSelectedListener {
        C18955a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            C27364s c27364s = ShortTvEpisodeListDialog.this.dramaDialogEpisodeListBinding;
            if (c27364s != null) {
                ShortTvEpisodeListDialog shortTvEpisodeListDialog = ShortTvEpisodeListDialog.this;
                if (tab != null && tab.isSelected() && c27364s.f83320d.getScrollState() == 0) {
                    int selectedTabPosition = c27364s.f83321e.getSelectedTabPosition() * 25;
                    GridLayoutManager gridLayoutManager = shortTvEpisodeListDialog.gridLayoutManager;
                    if (gridLayoutManager != null) {
                        int iFindFirstCompletelyVisibleItemPosition = ((selectedTabPosition - gridLayoutManager.findFirstCompletelyVisibleItemPosition()) / 5) * shortTvEpisodeListDialog.itemHeight;
                        if (c27364s.f83320d.canScrollVertically(iFindFirstCompletelyVisibleItemPosition)) {
                            c27364s.f83320d.scrollBy(0, iFindFirstCompletelyVisibleItemPosition);
                        }
                    }
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.dialog.ShortTvEpisodeListDialog$b */
    static final class C18956b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f61094a;

        C18956b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f61094a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f61094a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3189c0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m97797c(mo6065a(), ((FunctionAdapter) obj).mo6065a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6065a().hashCode();
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f61094a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.dialog.ShortTvEpisodeListDialog$c */
    public static final class C18957c extends RecyclerView.AbstractC4219r {

        /* JADX INFO: renamed from: a */
        private int f61095a;

        /* JADX INFO: renamed from: b */
        private int f61096b;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C27364s f61098d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f61099e;

        C18957c(C27364s c27364s, String str) {
            this.f61098d = c27364s;
            this.f61099e = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i11);
            GridLayoutManager gridLayoutManager = ShortTvEpisodeListDialog.this.gridLayoutManager;
            if (gridLayoutManager != null) {
                C27364s c27364s = this.f61098d;
                ShortTvEpisodeListDialog shortTvEpisodeListDialog = ShortTvEpisodeListDialog.this;
                String str = this.f61099e;
                int iFindFirstCompletelyVisibleItemPosition = gridLayoutManager.findFirstCompletelyVisibleItemPosition();
                if (iFindFirstCompletelyVisibleItemPosition != this.f61095a) {
                    this.f61095a = iFindFirstCompletelyVisibleItemPosition;
                    int i12 = iFindFirstCompletelyVisibleItemPosition / 25;
                    if (i12 != this.f61096b) {
                        c27364s.f83321e.removeOnTabSelectedListener((TabLayout.OnTabSelectedListener) shortTvEpisodeListDialog.onTabSelectedListener);
                        TabLayout.Tab tabAt = c27364s.f83321e.getTabAt(i12);
                        if (tabAt != null) {
                            tabAt.select();
                        }
                        c27364s.f83321e.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) shortTvEpisodeListDialog.onTabSelectedListener);
                        this.f61096b = i12;
                    }
                }
                if (i11 == 0) {
                    int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
                    int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
                    C26719e c26719e = (C26719e) CollectionsKt.m97362l0(shortTvEpisodeListDialog.m79684B0().getData(), iFindFirstVisibleItemPosition);
                    if (c26719e != null && c26719e.m104511c() > 0) {
                        shortTvEpisodeListDialog.m79686D0().m80397w0(str, c26719e.m104511c());
                    }
                    C26719e c26719e2 = (C26719e) CollectionsKt.m97362l0(shortTvEpisodeListDialog.m79684B0().getData(), iFindLastVisibleItemPosition);
                    if (c26719e2 == null || c26719e2.m104511c() <= 0) {
                        return;
                    }
                    shortTvEpisodeListDialog.m79686D0().m80397w0(str, c26719e2.m104511c());
                }
            }
        }
    }

    public ShortTvEpisodeListDialog() {
        super(R$layout.short_tv_dialog_episode_list);
        this.shortTvPlayListViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(ShortTvViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.shorttv.ui.dialog.ShortTvEpisodeListDialog$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.shorttv.ui.dialog.ShortTvEpisodeListDialog$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                C3227v0.c defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.m97801g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.adapter = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.ui.dialog.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvEpisodeListDialog.m79683A0();
            }
        });
        this.itemHeight = (AbstractC5806y.m27489e() - AbstractC5790i.m27411e(24.0f)) / 5;
        this.listener = new InterfaceC27566d() { // from class: com.transsion.shorttv.ui.dialog.f
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ShortTvEpisodeListDialog.m79689G0(this.f61110a, baseQuickAdapter, view, i11);
            }
        };
        this.onTabSelectedListener = new C18955a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C18951r m79683A0() {
        return new C18951r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public final C18951r m79684B0() {
        return (C18951r) this.adapter.getValue();
    }

    /* JADX INFO: renamed from: C0 */
    private final int m79685C0() {
        return !this.hasTrailer ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public final ShortTvViewModel m79686D0() {
        return (ShortTvViewModel) this.shortTvPlayListViewModel.getValue();
    }

    /* JADX INFO: renamed from: E0 */
    private final int m79687E0() {
        if (this.hasTrailer) {
            Subject subject = this.shortTvInfo;
            return (subject != null ? subject.getTotalEpisode() : 0) + 1;
        }
        Subject subject2 = this.shortTvInfo;
        if (subject2 != null) {
            return subject2.getTotalEpisode();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public final int m79688F0() {
        Subject subject = this.shortTvInfo;
        if (subject != null) {
            return subject.getTotalEpisode();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final void m79689G0(ShortTvEpisodeListDialog shortTvEpisodeListDialog, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        if (shortTvEpisodeListDialog.lastClickTime == 0 || System.currentTimeMillis() - shortTvEpisodeListDialog.lastClickTime > 1000) {
            shortTvEpisodeListDialog.lastClickTime = System.currentTimeMillis();
            List<Object> data = shortTvEpisodeListDialog.m79684B0().getData();
            if (i11 < data.size()) {
                shortTvEpisodeListDialog.m79713M0((C26719e) data.get(i11));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final void m79690H0(ShortTvEpisodeListDialog shortTvEpisodeListDialog, View view) {
        shortTvEpisodeListDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final Unit m79691I0(ShortTvEpisodeListDialog shortTvEpisodeListDialog, Subject subject) {
        AppCompatTextView appCompatTextView;
        shortTvEpisodeListDialog.shortTvInfo = subject;
        shortTvEpisodeListDialog.m79684B0().m79667F1(subject);
        C27364s c27364s = shortTvEpisodeListDialog.dramaDialogEpisodeListBinding;
        if (c27364s != null && (appCompatTextView = c27364s.f83322f) != null) {
            Subject subject2 = shortTvEpisodeListDialog.shortTvInfo;
            appCompatTextView.setText(subject2 != null ? subject2.getTitle() : null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final Unit m79692J0(ShortTvEpisodeListDialog shortTvEpisodeListDialog, List list) {
        List listL;
        if (list != null) {
            listL = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C26719e) {
                    listL.add(obj);
                }
            }
        } else {
            listL = CollectionsKt.m97506l();
        }
        shortTvEpisodeListDialog.m79697P0(listL);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final Unit m79693K0(ShortTvEpisodeListDialog shortTvEpisodeListDialog, Integer num) {
        C18951r c18951rM79684B0 = shortTvEpisodeListDialog.m79684B0();
        Intrinsics.m97799e(num);
        c18951rM79684B0.m79666D1(num.intValue());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final Unit m79694L0(ShortTvEpisodeListDialog shortTvEpisodeListDialog, ShortTvInfoEpisodeList shortTvInfoEpisodeList) {
        if (shortTvInfoEpisodeList != null) {
            shortTvEpisodeListDialog.m79684B0().notifyDataSetChanged();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: N0 */
    private final void m79695N0() {
        String subjectId;
        C27364s c27364s = this.dramaDialogEpisodeListBinding;
        if (c27364s != null) {
            int iM79687E0 = (m79687E0() + 24) / 25;
            Subject subject = this.shortTvInfo;
            if (subject == null || (subjectId = subject.getSubjectId()) == null) {
                subjectId = "";
            }
            Integer num = (Integer) m79686D0().m80384j0().m14847f();
            int iIntValue = num != null ? num.intValue() : 1;
            for (int i11 = 0; i11 < iM79687E0; i11++) {
                int iM79685C0 = (i11 * 25) + m79685C0();
                String str = iM79685C0 + "-" + RangesKt.m97938h(iM79685C0 + 24, m79688F0());
                c27364s.f83321e.setTabTextColors(-1, Utils.m27275a().getResources().getColor(R$color.short_tv_main));
                TabLayout tabLayout = c27364s.f83321e;
                TabLayout.Tab text = tabLayout.newTab().setText(str);
                text.view.setLongClickable(false);
                if (Build.VERSION.SDK_INT >= 26) {
                    text.view.setTooltipText(null);
                }
                tabLayout.addTab(text);
            }
            if (iM79687E0 <= 1) {
                c27364s.f83321e.setVisibility(8);
                c27364s.f83323g.setVisibility(8);
            } else {
                c27364s.f83321e.setVisibility(0);
                c27364s.f83323g.setVisibility(0);
            }
            RecyclerView rv2 = c27364s.f83320d;
            Intrinsics.m97801g(rv2, "rv");
            ViewGroup.LayoutParams layoutParams = rv2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
            ((ViewGroup.MarginLayoutParams) c2308b).height = this.itemHeight * 5;
            rv2.setLayoutParams(c2308b);
            c27364s.f83321e.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) this.onTabSelectedListener);
            c27364s.f83320d.addOnScrollListener(new C18957c(c27364s, subjectId));
            int iM27411e = AbstractC5790i.m27411e(12.0f);
            c27364s.f83320d.setPadding(iM27411e, 0, iM27411e, 0);
            RecyclerView recyclerView = c27364s.f83320d;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 5, 1, false);
            this.gridLayoutManager = gridLayoutManager;
            recyclerView.setLayoutManager(gridLayoutManager);
            AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new ShortTvEpisodeListDialog$showAllEpisodes$1$5(this, subjectId, iIntValue, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: O0 */
    private final void m79696O0(List list) {
        ProgressBar progressBar;
        RecyclerView recyclerView;
        C27364s c27364s = this.dramaDialogEpisodeListBinding;
        if (c27364s != null) {
            Integer num = (Integer) m79686D0().m80384j0().m14847f();
            int iIntValue = num != null ? num.intValue() : 1;
            TabLayout tab = c27364s.f83321e;
            Intrinsics.m97801g(tab, "tab");
            AbstractC23048b.m91691b(tab);
            View viewLine = c27364s.f83323g;
            Intrinsics.m97801g(viewLine, "viewLine");
            AbstractC23048b.m91691b(viewLine);
            RecyclerView rv2 = c27364s.f83320d;
            Intrinsics.m97801g(rv2, "rv");
            ViewGroup.LayoutParams layoutParams = rv2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
            ((ViewGroup.MarginLayoutParams) c2308b).height = this.itemHeight * 5;
            rv2.setLayoutParams(c2308b);
            int iM27411e = AbstractC5790i.m27411e(12.0f);
            c27364s.f83320d.setPadding(iM27411e, 0, iM27411e, 0);
            RecyclerView recyclerView2 = c27364s.f83320d;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 5, 1, false);
            this.gridLayoutManager = gridLayoutManager;
            recyclerView2.setLayoutManager(gridLayoutManager);
            C27364s c27364s2 = this.dramaDialogEpisodeListBinding;
            if (c27364s2 != null && (recyclerView = c27364s2.f83320d) != null) {
                C18951r c18951rM79684B0 = m79684B0();
                c18951rM79684B0.mo36210q1(CollectionsKt.m97343U0(list));
                c18951rM79684B0.m36227w1(this.listener);
                c18951rM79684B0.m79666D1(iIntValue);
                recyclerView.setAdapter(c18951rM79684B0);
            }
        }
        C27364s c27364s3 = this.dramaDialogEpisodeListBinding;
        if (c27364s3 == null || (progressBar = c27364s3.f83319c) == null) {
            return;
        }
        AbstractC23048b.m91691b(progressBar);
    }

    /* JADX INFO: renamed from: P0 */
    private final void m79697P0(List list) {
        if (list.size() == m79687E0()) {
            m79695N0();
        } else {
            m79696O0(list);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m79713M0(C26719e item) {
        Intrinsics.m97802h(item, "item");
        m79686D0().m80375d1(item.m104511c());
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.m97801g(dialogOnCreateDialog, "onCreateDialog(...)");
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(R$style.ShortTvBottomDialogTheme);
            window.setGravity(80);
            window.setDimAmount(0.5f);
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes == null) {
                attributes = new WindowManager.LayoutParams();
            }
            attributes.width = -1;
            window.setBackgroundDrawable(null);
            window.setAttributes(attributes);
        }
        return dialogOnCreateDialog;
    }

    @Override // com.transsion.shorttv.base.dialog.BaseDialog, androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.getAttributes().gravity = 80;
        window.getAttributes().height = -2;
        View viewFindViewById = window.findViewById(R$id.design_bottom_sheet);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(R.color.transparent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.hasTrailer = arguments != null ? arguments.getBoolean("hasTrailer") : this.hasTrailer;
        C27364s c27364sM106505a = C27364s.m106505a(view);
        c27364sM106505a.f83318b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.dialog.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ShortTvEpisodeListDialog.m79690H0(this.f61111a, view2);
            }
        });
        ProgressBar pbLoading = c27364sM106505a.f83319c;
        Intrinsics.m97801g(pbLoading, "pbLoading");
        AbstractC23048b.m91694e(pbLoading);
        this.dramaDialogEpisodeListBinding = c27364sM106505a;
        this.shortTvInfo = (Subject) m79686D0().m80343H0().m14847f();
        m79686D0().m80343H0().m14851j(getViewLifecycleOwner(), new C18956b(new Function1() { // from class: com.transsion.shorttv.ui.dialog.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvEpisodeListDialog.m79691I0(this.f61112a, (Subject) obj);
            }
        }));
        m79686D0().m80341F0().m14851j(this, new C18956b(new Function1() { // from class: com.transsion.shorttv.ui.dialog.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvEpisodeListDialog.m79692J0(this.f61113a, (List) obj);
            }
        }));
        m79686D0().m80384j0().m14851j(this, new C18956b(new Function1() { // from class: com.transsion.shorttv.ui.dialog.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvEpisodeListDialog.m79693K0(this.f61114a, (Integer) obj);
            }
        }));
        m79686D0().m80394t0().m14851j(getViewLifecycleOwner(), new C18956b(new Function1() { // from class: com.transsion.shorttv.ui.dialog.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvEpisodeListDialog.m79694L0(this.f61115a, (ShortTvInfoEpisodeList) obj);
            }
        }));
    }
}
