package com.transsion.postdetail.p306ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.baseui.util.C14557c;
import com.transsion.postdetail.R$anim;
import com.transsion.postdetail.p306ui.adapter.C16976c;
import com.transsion.postdetail.viewmodel.LocalVideoDetailViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mg.C25824a;
import p765s6.InterfaceC27566d;
import p844vo.C28160l;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 T2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u001f\u0010\u000b\u001a\u00020\u00052\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010\u0004J\u001f\u0010(\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J!\u0010*\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b*\u0010\u001dJ6\u0010/\u001a\u00020\u00052'\u0010.\u001a#\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00050+¢\u0006\u0004\b/\u00100J\u001d\u00104\u001a\u00020\u00052\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0010¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00052\b\b\u0002\u00106\u001a\u00020\u001f¢\u0006\u0004\b7\u00108R\u0014\u0010;\u001a\u00020&8\u0002X\u0082D¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010L\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u00108R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010:R\u0018\u0010P\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR9\u0010S\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0005\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006U"}, m97100d2 = {"Lcom/transsion/postdetail/ui/fragment/LocalVideoMiddleSeriesListFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lvo/l;", "<init>", "()V", "", "initAdapter", "k0", "", "Lcom/transsion/baselib/db/download/DownloadBean;", "insertList", "u0", "(Ljava/util/List;)V", "bean", "p0", "(Lcom/transsion/baselib/db/download/DownloadBean;)V", "", RequestParameters.POSITION, "q0", "(I)V", "Landroid/view/LayoutInflater;", "inflater", "f0", "(Landroid/view/LayoutInflater;)Lvo/l;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "transit", "", "enter", "nextAnim", "Landroid/view/animation/Animation;", "onCreateAnimation", "(IZI)Landroid/view/animation/Animation;", "lazyLoadData", "", "pageFrom", "r0", "(Lcom/transsion/baselib/db/download/DownloadBean;Ljava/lang/String;)V", "initData", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "callback", "s0", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/fragment/app/Fragment;", "fragment", "id", "t0", "(Landroidx/fragment/app/Fragment;I)V", "force", "n0", "(Z)V", "a", "Ljava/lang/String;", "TAG", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "scrollOffset", "Lcom/transsion/postdetail/ui/adapter/c;", "c", "Lcom/transsion/postdetail/ui/adapter/c;", "seriesAdapter", "Lcom/transsion/postdetail/viewmodel/LocalVideoDetailViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/postdetail/viewmodel/LocalVideoDetailViewModel;", "viewModel", "e", "Z", "m0", "()Z", "setRemoved", "isRemoved", "f", "g", "Lcom/transsion/baselib/db/download/DownloadBean;", "downloadBean", "h", "Lkotlin/jvm/functions/Function2;", "itemClickCallback", "i", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class LocalVideoMiddleSeriesListFragment extends BaseFragment<C28160l> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C16976c seriesAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private LocalVideoDetailViewModel viewModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private DownloadBean downloadBean;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Function2 itemClickCallback;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG = "LocalVideoMiddleSeriesListFragment";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int scrollOffset = AbstractC5776a0.m27313a(280.0f);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isRemoved = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String pageFrom = "";

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.LocalVideoMiddleSeriesListFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final LocalVideoMiddleSeriesListFragment m74265a() {
            return new LocalVideoMiddleSeriesListFragment();
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.LocalVideoMiddleSeriesListFragment$b */
    public static final class C17028b extends DiffUtil.AbstractC4174e {
        C17028b() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(DownloadBean oldItem, DownloadBean newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getResourceId(), newItem.getResourceId()) && oldItem.getStatus() == newItem.getStatus() && oldItem.getProgress() == newItem.getProgress() && Intrinsics.m97797c(oldItem.getUpdateTimeStamp(), newItem.getUpdateTimeStamp());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(DownloadBean oldItem, DownloadBean newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getResourceId(), newItem.getResourceId());
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.fragment.LocalVideoMiddleSeriesListFragment$c */
    static final class C17029c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f57185a;

        C17029c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f57185a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f57185a;
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
            this.f57185a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final void m74249g0(LocalVideoMiddleSeriesListFragment localVideoMiddleSeriesListFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 2000L) || adapter.getData().isEmpty()) {
            return;
        }
        Object obj = adapter.getData().get(i11);
        Intrinsics.m97800f(obj, "null cannot be cast to non-null type com.transsion.baselib.db.download.DownloadBean");
        DownloadBean downloadBean = (DownloadBean) obj;
        C26866a.a aVar = C26866a.f81698a;
        String str = localVideoMiddleSeriesListFragment.TAG;
        DownloadBean downloadBean2 = localVideoMiddleSeriesListFragment.downloadBean;
        Integer numValueOf = downloadBean2 != null ? Integer.valueOf(downloadBean2.getEpse()) : null;
        DownloadBean downloadBean3 = localVideoMiddleSeriesListFragment.downloadBean;
        String resourceId = downloadBean3 != null ? downloadBean3.getResourceId() : null;
        C26866a.a.m104898f(aVar, str, "item click, current epse = " + numValueOf + ",resourceId=" + resourceId + ",  click epse = " + downloadBean.getEpse() + ",resourceId=" + downloadBean.getResourceId(), false, 4, null);
        String resourceId2 = downloadBean.getResourceId();
        DownloadBean downloadBean4 = localVideoMiddleSeriesListFragment.downloadBean;
        if (Intrinsics.m97797c(resourceId2, downloadBean4 != null ? downloadBean4.getResourceId() : null)) {
            return;
        }
        if (downloadBean.getCanPlay()) {
            localVideoMiddleSeriesListFragment.downloadBean = downloadBean;
        }
        Function2 function2 = localVideoMiddleSeriesListFragment.itemClickCallback;
        if (function2 != null) {
            function2.invoke(downloadBean, Integer.valueOf(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final Unit m74250h0(LocalVideoMiddleSeriesListFragment localVideoMiddleSeriesListFragment, List list) {
        C26866a.a.m104898f(C26866a.f81698a, localVideoMiddleSeriesListFragment.TAG, "2--fragment, on get series from local, size = " + (list != null ? Integer.valueOf(list.size()) : null), false, 4, null);
        localVideoMiddleSeriesListFragment.m74258u0(list);
        DownloadBean downloadBean = localVideoMiddleSeriesListFragment.downloadBean;
        if (downloadBean != null) {
            localVideoMiddleSeriesListFragment.m74256p0(downloadBean);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final Unit m74251i0(LocalVideoMiddleSeriesListFragment localVideoMiddleSeriesListFragment, DownloadBean downloadBean) {
        C16976c c16976c;
        List<Object> data;
        List<Object> data2;
        int size = 0;
        if (downloadBean != null) {
            downloadBean.setPlaying(false);
        }
        C16976c c16976c2 = localVideoMiddleSeriesListFragment.seriesAdapter;
        int i11 = -1;
        if (c16976c2 != null && (data2 = c16976c2.getData()) != null) {
            Iterator<Object> it = data2.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                if (Intrinsics.m97797c(((DownloadBean) it.next()).getResourceId(), downloadBean != null ? downloadBean.getResourceId() : null)) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
        }
        if (i11 >= 0) {
            C16976c c16976c3 = localVideoMiddleSeriesListFragment.seriesAdapter;
            if (c16976c3 != null && (data = c16976c3.getData()) != null) {
                size = data.size();
            }
            if (i11 < size && (c16976c = localVideoMiddleSeriesListFragment.seriesAdapter) != null) {
                c16976c.notifyItemChanged(i11, Boolean.FALSE);
            }
        }
        return Unit.f75682a;
    }

    private final void initAdapter() {
        C16976c c16976c = new C16976c(new ArrayList(), true);
        c16976c.m36227w1(new InterfaceC27566d() { // from class: com.transsion.postdetail.ui.fragment.a1
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                LocalVideoMiddleSeriesListFragment.m74249g0(this.f57284a, baseQuickAdapter, view, i11);
            }
        });
        c16976c.m36158R0(new C17028b());
        this.seriesAdapter = c16976c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final Unit m74252j0(LocalVideoMiddleSeriesListFragment localVideoMiddleSeriesListFragment, DownloadBean downloadBean) {
        C16976c c16976c;
        List<Object> data;
        List<Object> data2;
        if (downloadBean != null) {
            downloadBean.setPlaying(true);
        }
        C16976c c16976c2 = localVideoMiddleSeriesListFragment.seriesAdapter;
        int i11 = -1;
        int size = 0;
        if (c16976c2 != null && (data2 = c16976c2.getData()) != null) {
            Iterator<Object> it = data2.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                if (Intrinsics.m97797c(((DownloadBean) it.next()).getResourceId(), downloadBean != null ? downloadBean.getResourceId() : null)) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
        }
        if (i11 >= 0) {
            C16976c c16976c3 = localVideoMiddleSeriesListFragment.seriesAdapter;
            if (c16976c3 != null && (data = c16976c3.getData()) != null) {
                size = data.size();
            }
            if (i11 < size && (c16976c = localVideoMiddleSeriesListFragment.seriesAdapter) != null) {
                c16976c.notifyItemChanged(i11, Boolean.TRUE);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: k0 */
    private final void m74253k0() {
        RecyclerView recyclerView;
        C28160l mViewBinding = getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f86513c) == null) {
            return;
        }
        int iM27313a = AbstractC5776a0.m27313a(4.0f);
        recyclerView.setLayoutManager(new NpaGridLayoutManager(recyclerView.getContext(), 3));
        int i11 = iM27313a * 2;
        int i12 = iM27313a * 3;
        recyclerView.addItemDecoration(new C25824a(i11, i11, i12, i12));
        recyclerView.setAdapter(this.seriesAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final void m74254l0(LocalVideoMiddleSeriesListFragment localVideoMiddleSeriesListFragment, View view) {
        m74255o0(localVideoMiddleSeriesListFragment, false, 1, null);
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m74255o0(LocalVideoMiddleSeriesListFragment localVideoMiddleSeriesListFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        localVideoMiddleSeriesListFragment.m74261n0(z11);
    }

    /* JADX INFO: renamed from: p0 */
    private final void m74256p0(DownloadBean bean) {
        List<Object> data;
        List<Object> data2;
        C16976c c16976c = this.seriesAdapter;
        int i11 = -1;
        int size = 0;
        if (c16976c != null && (data2 = c16976c.getData()) != null) {
            Iterator<Object> it = data2.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                if (Intrinsics.m97797c(((DownloadBean) it.next()).getResourceId(), bean.getResourceId())) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
        }
        if (i11 > 0) {
            C16976c c16976c2 = this.seriesAdapter;
            if (c16976c2 != null && (data = c16976c2.getData()) != null) {
                size = data.size();
            }
            if (i11 < size) {
                m74257q0(i11);
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    private final void m74257q0(int position) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C26866a.a.m104908v(C26866a.f81698a, this.TAG, "seriesScrollToPosition = " + position, false, 4, null);
        if (position < 0) {
            return;
        }
        try {
            C28160l mViewBinding = getMViewBinding();
            if (mViewBinding != null && (recyclerView2 = mViewBinding.f86513c) != null) {
                recyclerView2.scrollToPosition(position);
            }
            C28160l mViewBinding2 = getMViewBinding();
            RecyclerView.AbstractC4214m layoutManager = (mViewBinding2 == null || (recyclerView = mViewBinding2.f86513c) == null) ? null : recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                ((GridLayoutManager) layoutManager).scrollToPositionWithOffset(position, this.scrollOffset);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: u0 */
    private final void m74258u0(List insertList) {
        List<Object> listL;
        ArrayList arrayList;
        List<Object> data;
        List<Object> data2;
        C16976c c16976c = this.seriesAdapter;
        if (c16976c != null && (data2 = c16976c.getData()) != null && data2.isEmpty()) {
            C16976c c16976c2 = this.seriesAdapter;
            if (c16976c2 != null) {
                c16976c2.mo36201n1(insertList);
                return;
            }
            return;
        }
        C16976c c16976c3 = this.seriesAdapter;
        if (c16976c3 == null || (listL = c16976c3.getData()) == null) {
            listL = CollectionsKt.m97506l();
        }
        Integer numValueOf = null;
        if (insertList != null) {
            arrayList = new ArrayList();
            for (Object obj : insertList) {
                if (!listL.contains((DownloadBean) obj)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            C26866a.a.m104898f(C26866a.f81698a, this.TAG, "全部去重了~", false, 4, null);
            return;
        }
        C16976c c16976c4 = this.seriesAdapter;
        if (c16976c4 != null) {
            c16976c4.mo36208q(arrayList);
        }
        C26866a.a aVar = C26866a.f81698a;
        String str = this.TAG;
        C16976c c16976c5 = this.seriesAdapter;
        if (c16976c5 != null && (data = c16976c5.getData()) != null) {
            numValueOf = Integer.valueOf(data.size());
        }
        C26866a.a.m104898f(aVar, str, "3--fragment, on get series from net, totalSize = " + numValueOf, false, 4, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public C28160l getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28160l c28160lM109332c = C28160l.m109332c(inflater);
        Intrinsics.m97801g(c28160lM109332c, "inflate(...)");
        return c28160lM109332c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initData(View view, Bundle savedInstanceState) {
        C3187b0 c3187b0M75009e;
        C3187b0 c3187b0M75010f;
        C3187b0 c3187b0M75013i;
        Intrinsics.m97802h(view, "view");
        super.initData(view, savedInstanceState);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            LocalVideoDetailViewModel localVideoDetailViewModel = (LocalVideoDetailViewModel) new C3227v0(activity, new C3227v0.d()).m14969a(LocalVideoDetailViewModel.class);
            this.viewModel = localVideoDetailViewModel;
            if (localVideoDetailViewModel != null && (c3187b0M75013i = localVideoDetailViewModel.m75013i()) != null) {
                c3187b0M75013i.m14851j(activity, new C17029c(new Function1() { // from class: com.transsion.postdetail.ui.fragment.w0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LocalVideoMiddleSeriesListFragment.m74250h0(this.f57480a, (List) obj);
                    }
                }));
            }
            LocalVideoDetailViewModel localVideoDetailViewModel2 = this.viewModel;
            if (localVideoDetailViewModel2 != null && (c3187b0M75010f = localVideoDetailViewModel2.m75010f()) != null) {
                c3187b0M75010f.m14851j(activity, new C17029c(new Function1() { // from class: com.transsion.postdetail.ui.fragment.x0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LocalVideoMiddleSeriesListFragment.m74251i0(this.f57487a, (DownloadBean) obj);
                    }
                }));
            }
            LocalVideoDetailViewModel localVideoDetailViewModel3 = this.viewModel;
            if (localVideoDetailViewModel3 == null || (c3187b0M75009e = localVideoDetailViewModel3.m75009e()) == null) {
                return;
            }
            c3187b0M75009e.m14851j(activity, new C17029c(new Function1() { // from class: com.transsion.postdetail.ui.fragment.y0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LocalVideoMiddleSeriesListFragment.m74252j0(this.f57497a, (DownloadBean) obj);
                }
            }));
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        AppCompatImageView appCompatImageView;
        Intrinsics.m97802h(view, "view");
        initAdapter();
        m74253k0();
        C28160l mViewBinding = getMViewBinding();
        if (mViewBinding == null || (appCompatImageView = mViewBinding.f86512b) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.fragment.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LocalVideoMiddleSeriesListFragment.m74254l0(this.f57501a, view2);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    /* JADX INFO: renamed from: m0, reason: from getter */
    public final boolean getIsRemoved() {
        return this.isRemoved;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m74261n0(boolean force) {
        if (!this.isRemoved || force) {
            this.isRemoved = true;
            try {
                FragmentManager parentFragmentManager = getParentFragmentManager();
                parentFragmentManager.m14538g1();
                AbstractC3168w abstractC3168wM14557p = parentFragmentManager.m14557p();
                Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction(...)");
                abstractC3168wM14557p.mo14678r(this);
                abstractC3168wM14557p.mo14671j();
                Intrinsics.m97799e(parentFragmentManager);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return enter ? AnimationUtils.loadAnimation(getActivity(), R$anim.enter_bottom_menu) : AnimationUtils.loadAnimation(getActivity(), R$anim.exit_bottom_menu);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m74262r0(DownloadBean bean, String pageFrom) {
        Intrinsics.m97802h(pageFrom, "pageFrom");
        this.downloadBean = bean;
        this.pageFrom = pageFrom;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m74263s0(Function2 callback) {
        Intrinsics.m97802h(callback, "callback");
        this.itemClickCallback = callback;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m74264t0(Fragment fragment, int id2) {
        Intrinsics.m97802h(fragment, "fragment");
        if (this.isRemoved) {
            this.isRemoved = false;
            try {
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
                AbstractC3168w abstractC3168wM14557p = childFragmentManager.m14557p();
                Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
                abstractC3168wM14557p.m14814t(id2, this, "LocalVideoMiddleSeriesList");
                abstractC3168wM14557p.mo14671j();
            } catch (Throwable unused) {
            }
        }
    }
}
