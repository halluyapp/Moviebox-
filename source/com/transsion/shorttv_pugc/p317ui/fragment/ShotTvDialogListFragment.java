package com.transsion.shorttv_pugc.p317ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5790i;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.shorttv_pugc.ShorttvModel;
import com.transsion.shorttv_pugc.base.fragment.PageStatusFragment;
import com.transsion.shorttv_pugc.p317ui.adapter.C19332o;
import com.transsion.shorttv_pugc.p317ui.dialog.ShortTvEpisodeListDialog;
import com.transsion.shorttv_pugc.p317ui.widget.UGCVideoDetailHorLoadMoreView;
import com.transsion.shorttv_pugc.utils.ShortTvExtKt;
import com.transsion.shorttv_pugc.viewmodel.ShortTvViewModel;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gt.C23673b;
import gt.InterfaceC23672a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import p356ds.AbstractC23047a;
import p356ds.AbstractC23048b;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p765s6.InterfaceC27569g;
import p801u6.C27941f;
import p801u6.C27942g;
import p990zt.C29243a;
import rs.C27369w;
import tt.AbstractC27849b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0004R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R$\u00109\u001a\u0002052\u0006\u00106\u001a\u0002058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/ui/fragment/ShotTvDialogListFragment;", "Lcom/transsion/shorttv_pugc/base/fragment/PageStatusFragment;", "Lrs/w;", "<init>", "()V", "", "t0", "u0", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "r0", "(Landroidx/recyclerview/widget/RecyclerView;)I", "Lcom/transsion/shorttv_pugc/ShorttvModel$UGCVideo;", WebConstants.FIELD_ITEM, "A0", "(Lcom/transsion/shorttv_pugc/ShorttvModel$UGCVideo;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "p0", "(Landroid/view/LayoutInflater;)Lrs/w;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewData", "initViewModel", "initListener", "retryLoadData", "Lcom/transsion/shorttv_pugc/viewmodel/ShortTvViewModel;", "i", "Lkotlin/Lazy;", "q0", "()Lcom/transsion/shorttv_pugc/viewmodel/ShortTvViewModel;", "viewModel", "Lcom/transsion/shorttv_pugc/ui/adapter/o;", "j", "Lcom/transsion/shorttv_pugc/ui/adapter/o;", "adapter", CampaignEx.JSON_KEY_AD_K, "I", "startEp", "l", "endEp", "", "m", "J", "lastClickTime", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "n", "Z", "isInit", "()Z", "Lgt/b;", "o", "Lgt/b;", "exposureHelper", TtmlNode.TAG_P, "a", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShotTvDialogListFragment extends PageStatusFragment<C27369w> {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private C19332o adapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int startEp;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int endEp;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private long lastClickTime;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isInit;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Lazy viewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(ShortTvViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.shorttv_pugc.ui.fragment.ShotTvDialogListFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.shorttv_pugc.ui.fragment.ShotTvDialogListFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C23673b exposureHelper = new C23673b(0.6f, new C19399b(), false, 4, null);

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShotTvDialogListFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ShotTvDialogListFragment m81077a(IntRange range) {
            Intrinsics.m97802h(range, "range");
            ShotTvDialogListFragment shotTvDialogListFragment = new ShotTvDialogListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("start", range.getFirst());
            bundle.putInt(TtmlNode.END, range.getLast());
            shotTvDialogListFragment.setArguments(bundle);
            return shotTvDialogListFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShotTvDialogListFragment$b */
    public static final class C19399b implements InterfaceC23672a {
        C19399b() {
        }

        @Override // gt.InterfaceC23672a
        /* JADX INFO: renamed from: a */
        public void mo80863a(int i11, long j11, View view) {
            List<Object> data;
            C19332o c19332o = ShotTvDialogListFragment.this.adapter;
            if (c19332o == null || (data = c19332o.getData()) == null) {
                return;
            }
            ShotTvDialogListFragment shotTvDialogListFragment = ShotTvDialogListFragment.this;
            if (data.size() < i11) {
                return;
            }
            C29243a c29243a = C29243a.f89221a;
            ShorttvModel.UGCVideo uGCVideo = (ShorttvModel.UGCVideo) CollectionsKt.m97362l0(data, i11);
            String strM81397I = shotTvDialogListFragment.m81065q0().m81397I();
            if (strM81397I == null) {
                strM81397I = "";
            }
            c29243a.m112127d(j11, uGCVideo, "up Next", strM81397I);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShotTvDialogListFragment$c */
    public static final class C19400c extends RecyclerView.AbstractC4219r {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ LinearLayoutManager f62190a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Ref.BooleanRef f62191b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f62192c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ ShotTvDialogListFragment f62193d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Ref.BooleanRef f62194e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ int f62195f;

        C19400c(LinearLayoutManager linearLayoutManager, Ref.BooleanRef booleanRef, int i11, ShotTvDialogListFragment shotTvDialogListFragment, Ref.BooleanRef booleanRef2, int i12) {
            this.f62190a = linearLayoutManager;
            this.f62191b = booleanRef;
            this.f62192c = i11;
            this.f62193d = shotTvDialogListFragment;
            this.f62194e = booleanRef2;
            this.f62195f = i12;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i11, i12);
            int itemCount = this.f62190a.getItemCount();
            int iFindFirstVisibleItemPosition = this.f62190a.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = this.f62190a.findLastVisibleItemPosition();
            Ref.BooleanRef booleanRef = this.f62191b;
            if (!booleanRef.element && iFindFirstVisibleItemPosition <= this.f62192c) {
                booleanRef.element = true;
                this.f62193d.m81069u0();
            }
            Ref.BooleanRef booleanRef2 = this.f62194e;
            if (booleanRef2.element || iFindLastVisibleItemPosition < (itemCount - 1) - this.f62195f) {
                return;
            }
            booleanRef2.element = true;
            this.f62193d.m81068t0();
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.fragment.ShotTvDialogListFragment$d */
    static final class C19401d implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f62196a;

        C19401d(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f62196a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f62196a;
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
            this.f62196a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public final ShortTvViewModel m81065q0() {
        return (ShortTvViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: r0 */
    private final int m81066r0(RecyclerView recyclerView) {
        int iM91689a = AbstractC23047a.m91689a(68);
        if (iM91689a > 0) {
            return recyclerView.getHeight() / iM91689a;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:149:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x012a  */
    /* JADX INFO: renamed from: s0 */
    public static final Unit m81067s0(ShotTvDialogListFragment shotTvDialogListFragment, Pair pair) {
        ArrayList arrayList;
        C27941f c27941fM36186h0;
        C27942g c27942gM36203o0;
        C27941f c27941fM36186h1;
        C27941f c27941fM36186h2;
        C27941f c27941fM36186h3;
        C27942g c27942gM36203o1;
        List<Object> data;
        List listM81306i;
        Iterator it;
        int iIntValue;
        C19332o c19332o;
        List listL;
        FrameLayout frameLayout;
        Collection collection;
        C27942g c27942gM36203o2;
        C27941f c27941fM36186h4;
        C27941f c27941fM36186h5;
        if (pair != null) {
            if ((pair.getFirst() instanceof AbstractC27849b.b) || !((collection = (Collection) pair.getSecond()) == null || collection.isEmpty())) {
                List list = (List) pair.getSecond();
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        int i11 = shotTvDialogListFragment.startEp;
                        int i12 = shotTvDialogListFragment.endEp;
                        int ep2 = ((ShorttvModel.UGCVideo) obj).getEp();
                        if (i11 <= ep2 && ep2 <= i12) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    return Unit.f75682a;
                }
                C27369w c27369w = (C27369w) shotTvDialogListFragment.getMViewBinding();
                if (c27369w != null && (frameLayout = c27369w.f83346b) != null) {
                    AbstractC23048b.m91691b(frameLayout);
                }
                C19332o c19332o2 = shotTvDialogListFragment.adapter;
                if (c19332o2 != null && (data = c19332o2.getData()) != null && (listM81306i = ShortTvExtKt.m81306i(data, arrayList)) != null) {
                    if (listM81306i.size() > 1) {
                        Iterator it2 = listM81306i.iterator();
                        if (it2.hasNext()) {
                            ArrayList arrayList2 = new ArrayList();
                            Object next = it2.next();
                            while (it2.hasNext()) {
                                Object next2 = it2.next();
                                arrayList2.add(Integer.valueOf(((Number) next2).intValue() - ((Number) next).intValue()));
                                next = next2;
                            }
                            listL = arrayList2;
                        } else {
                            listL = CollectionsKt.m97506l();
                        }
                        List list2 = listL;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it3 = list2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (((Number) it3.next()).intValue() != 1) {
                                        it = listM81306i.iterator();
                                        while (it.hasNext()) {
                                            iIntValue = ((Number) it.next()).intValue();
                                            c19332o = shotTvDialogListFragment.adapter;
                                            if (c19332o != null) {
                                                c19332o.notifyItemInserted(iIntValue);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        C19332o c19332o3 = shotTvDialogListFragment.adapter;
                        if (c19332o3 != null) {
                            c19332o3.notifyItemRangeInserted(((Number) CollectionsKt.m97359i0(listM81306i)).intValue(), listM81306i.size());
                        }
                    } else {
                        it = listM81306i.iterator();
                        while (it.hasNext()) {
                            iIntValue = ((Number) it.next()).intValue();
                            c19332o = shotTvDialogListFragment.adapter;
                            if (c19332o != null) {
                                c19332o.notifyItemInserted(iIntValue);
                            }
                        }
                    }
                }
                C19332o c19332o4 = shotTvDialogListFragment.adapter;
                if (c19332o4 != null && (c27942gM36203o1 = c19332o4.m36203o0()) != null) {
                    c27942gM36203o1.m108678e(false);
                }
                ShorttvModel.UGCVideo uGCVideo = (ShorttvModel.UGCVideo) CollectionsKt.m97372v0(arrayList);
                Integer numValueOf = uGCVideo != null ? Integer.valueOf(uGCVideo.getEp()) : null;
                ShorttvModel.UGCVideo uGCVideo2 = (ShorttvModel.UGCVideo) CollectionsKt.m97361k0(arrayList);
                Integer numValueOf2 = uGCVideo2 != null ? Integer.valueOf(uGCVideo2.getEp()) : null;
                ShorttvModel.UGCVideo uGCVideo3 = (ShorttvModel.UGCVideo) CollectionsKt.m97372v0(shotTvDialogListFragment.m81065q0().m81426p());
                if (Intrinsics.m97797c(numValueOf, uGCVideo3 != null ? Integer.valueOf(uGCVideo3.getEp()) : null)) {
                    C19332o c19332o5 = shotTvDialogListFragment.adapter;
                    if (c19332o5 != null && (c27941fM36186h3 = c19332o5.m36186h0()) != null) {
                        C27941f.m108652u(c27941fM36186h3, false, 1, null);
                    }
                    C19332o c19332o6 = shotTvDialogListFragment.adapter;
                    if (c19332o6 != null && (c27941fM36186h2 = c19332o6.m36186h0()) != null) {
                        c27941fM36186h2.m108673z(false);
                    }
                } else {
                    int i13 = shotTvDialogListFragment.endEp;
                    if (numValueOf != null && numValueOf.intValue() == i13) {
                        C19332o c19332o7 = shotTvDialogListFragment.adapter;
                        if (c19332o7 != null && (c27941fM36186h1 = c19332o7.m36186h0()) != null) {
                            c27941fM36186h1.m108673z(false);
                        }
                    } else {
                        int i14 = shotTvDialogListFragment.startEp;
                        if (numValueOf2 != null && numValueOf2.intValue() == i14) {
                            C19332o c19332o8 = shotTvDialogListFragment.adapter;
                            if (c19332o8 != null && (c27942gM36203o0 = c19332o8.m36203o0()) != null) {
                                c27942gM36203o0.m108677d(false);
                            }
                        } else {
                            C19332o c19332o9 = shotTvDialogListFragment.adapter;
                            if (c19332o9 != null && (c27941fM36186h0 = c19332o9.m36186h0()) != null) {
                                c27941fM36186h0.m108667s();
                            }
                        }
                    }
                }
            } else {
                C19332o c19332o10 = shotTvDialogListFragment.adapter;
                if (c19332o10 != null && (c27941fM36186h5 = c19332o10.m36186h0()) != null) {
                    c27941fM36186h5.m108669v();
                }
                C19332o c19332o11 = shotTvDialogListFragment.adapter;
                if (c19332o11 != null && (c27941fM36186h4 = c19332o11.m36186h0()) != null) {
                    c27941fM36186h4.m108673z(false);
                }
                C19332o c19332o12 = shotTvDialogListFragment.adapter;
                if (c19332o12 != null && (c27942gM36203o2 = c19332o12.m36203o0()) != null) {
                    c27942gM36203o2.m108678e(false);
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public final void m81068t0() {
        List<Object> data;
        ShorttvModel.UGCVideo uGCVideo;
        List<Object> data2;
        ShorttvModel.UGCVideo uGCVideo2;
        C19332o c19332o = this.adapter;
        if (c19332o == null || (data2 = c19332o.getData()) == null || (uGCVideo2 = (ShorttvModel.UGCVideo) CollectionsKt.m97372v0(data2)) == null || uGCVideo2.getEp() != this.endEp) {
            String strM81429r = m81065q0().m81429r();
            C19332o c19332o2 = this.adapter;
            int ep2 = (c19332o2 == null || (data = c19332o2.getData()) == null || (uGCVideo = (ShorttvModel.UGCVideo) CollectionsKt.m97372v0(data)) == null) ? this.startEp : uGCVideo.getEp();
            m81065q0().m81414Z(strM81429r, ep2, Math.min(ep2 + 10, this.endEp));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public final void m81069u0() {
        int iMax;
        int iMax2;
        C27942g c27942gM36203o0;
        List<Object> data;
        ShorttvModel.UGCVideo uGCVideo;
        C19332o c19332o = this.adapter;
        Integer numValueOf = (c19332o == null || (data = c19332o.getData()) == null || (uGCVideo = (ShorttvModel.UGCVideo) CollectionsKt.m97361k0(data)) == null) ? null : Integer.valueOf(uGCVideo.getEp());
        if (numValueOf == null) {
            iMax2 = this.startEp;
            iMax = iMax2 + 10;
        } else {
            if (numValueOf.intValue() == this.startEp) {
                return;
            }
            iMax = Math.max(numValueOf.intValue() - 1, this.startEp);
            iMax2 = Math.max(iMax - 10, this.startEp);
        }
        C19332o c19332o2 = this.adapter;
        if (c19332o2 != null && (c27942gM36203o0 = c19332o2.m36203o0()) != null) {
            c27942gM36203o0.m108678e(true);
        }
        m81065q0().m81414Z(m81065q0().m81429r(), iMax2, iMax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m81070v0(ShotTvDialogListFragment shotTvDialogListFragment, C19332o c19332o, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        if (shotTvDialogListFragment.lastClickTime == 0 || System.currentTimeMillis() - shotTvDialogListFragment.lastClickTime > 1000) {
            shotTvDialogListFragment.lastClickTime = System.currentTimeMillis();
            ShorttvModel.UGCVideo uGCVideo = (ShorttvModel.UGCVideo) c19332o.getData().get(i11);
            C29243a c29243a = C29243a.f89221a;
            String strM81397I = shotTvDialogListFragment.m81065q0().m81397I();
            if (strM81397I == null) {
                strM81397I = "";
            }
            c29243a.m112125a(WebConstants.FIELD_ITEM, uGCVideo, "up Next", strM81397I);
            shotTvDialogListFragment.m81075A0(uGCVideo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m81071w0(ShotTvDialogListFragment shotTvDialogListFragment) {
        shotTvDialogListFragment.m81068t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m81072x0(ShotTvDialogListFragment shotTvDialogListFragment) {
        shotTvDialogListFragment.m81069u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m81073y0(LinearLayoutManager linearLayoutManager, int i11) {
        linearLayoutManager.scrollToPositionWithOffset(i11, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m81074z0(LinearLayoutManager linearLayoutManager, int i11) {
        linearLayoutManager.scrollToPositionWithOffset(i11, 0);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m81075A0(ShorttvModel.UGCVideo item) {
        Intrinsics.m97802h(item, "item");
        if (getParentFragment() instanceof ShortTvEpisodeListDialog) {
            Fragment parentFragment = getParentFragment();
            Intrinsics.m97800f(parentFragment, "null cannot be cast to non-null type com.transsion.shorttv_pugc.ui.dialog.ShortTvEpisodeListDialog");
            ((ShortTvEpisodeListDialog) parentFragment).m80921n0(item);
        }
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initListener() {
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initViewData() {
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void initViewModel() {
        m81065q0().m81432u().m14851j(getViewLifecycleOwner(), new C19401d(new Function1() { // from class: com.transsion.shorttv_pugc.ui.fragment.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShotTvDialogListFragment.m81067s0(this.f62203a, (Pair) obj);
            }
        }));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.startEp = arguments != null ? arguments.getInt("start") : this.startEp;
        Bundle arguments2 = getArguments();
        this.endEp = arguments2 != null ? arguments2.getInt(TtmlNode.END) : this.endEp;
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        C27369w c27369w = (C27369w) getMViewBinding();
        if (c27369w != null) {
            c27369w.f83347c.setLayoutManager(linearLayoutManager);
            c27369w.f83347c.addOnScrollListener(this.exposureHelper);
            RecyclerView recyclerView = c27369w.f83347c;
            final C19332o c19332o = new C19332o();
            List listM81437z = m81065q0().m81437z();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM81437z) {
                int i11 = this.startEp;
                int i12 = this.endEp;
                int ep2 = ((ShorttvModel.UGCVideo) obj).getEp();
                if (i11 <= ep2 && ep2 <= i12) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                String strM81429r = m81065q0().m81429r();
                int i13 = this.startEp;
                m81065q0().m81414Z(strM81429r, i13, Math.min(i13 + 10, this.endEp));
                FrameLayout loading = c27369w.f83346b;
                Intrinsics.m97801g(loading, "loading");
                AbstractC23048b.m91694e(loading);
            }
            c19332o.mo36201n1(arrayList);
            this.adapter = c19332o;
            for (ShorttvModel.UGCVideo uGCVideo : m81065q0().m81437z()) {
                int ep3 = uGCVideo.getEp();
                Integer num = (Integer) m81065q0().m81430s().m14847f();
                uGCVideo.setSelected(num != null && ep3 == num.intValue());
            }
            c19332o.m36227w1(new InterfaceC27566d() { // from class: com.transsion.shorttv_pugc.ui.fragment.d0
                @Override // p765s6.InterfaceC27566d
                /* JADX INFO: renamed from: a */
                public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view2, int i14) {
                    ShotTvDialogListFragment.m81070v0(this.f62205a, c19332o, baseQuickAdapter, view2, i14);
                }
            });
            c19332o.m36186h0().m108655C(new UGCVideoDetailHorLoadMoreView());
            c19332o.m36186h0().m108673z(true);
            c19332o.m36186h0().m108672y(true);
            c19332o.m36186h0().m108657E(3);
            c19332o.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.shorttv_pugc.ui.fragment.e0
                @Override // p765s6.InterfaceC27568f
                /* JADX INFO: renamed from: a */
                public final void mo63874a() {
                    ShotTvDialogListFragment.m81071w0(this.f62266a);
                }
            });
            c19332o.m36203o0().m108677d(true);
            c19332o.m36203o0().m108676c(2);
            c19332o.m36203o0().m108675b(new InterfaceC27569g() { // from class: com.transsion.shorttv_pugc.ui.fragment.f0
                @Override // p765s6.InterfaceC27569g
                /* JADX INFO: renamed from: a */
                public final void mo81168a() {
                    ShotTvDialogListFragment.m81072x0(this.f62269a);
                }
            });
            Integer num2 = (Integer) m81065q0().m81430s().m14847f();
            int iIntValue = num2 != null ? num2.intValue() : 1;
            int i14 = this.startEp;
            final int i15 = iIntValue - i14;
            int i16 = this.endEp;
            if (iIntValue <= i16 && i14 <= iIntValue) {
                RecyclerView rv2 = c27369w.f83347c;
                Intrinsics.m97801g(rv2, "rv");
                final int iM81066r0 = ((i16 - i14) + 1) - m81066r0(rv2);
                if (i15 <= iM81066r0) {
                    c27369w.f83347c.post(new Runnable() { // from class: com.transsion.shorttv_pugc.ui.fragment.g0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ShotTvDialogListFragment.m81073y0(linearLayoutManager, i15);
                        }
                    });
                } else {
                    c27369w.f83347c.post(new Runnable() { // from class: com.transsion.shorttv_pugc.ui.fragment.h0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ShotTvDialogListFragment.m81074z0(linearLayoutManager, iM81066r0);
                        }
                    });
                }
            }
            recyclerView.setAdapter(c19332o);
            c27369w.f83347c.addOnScrollListener(new C19400c(linearLayoutManager, new Ref.BooleanRef(), 3, this, new Ref.BooleanRef(), 3));
            c27369w.f83347c.getLayoutParams().height = AbstractC5790i.m27411e(500.0f);
        }
        this.isInit = true;
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public C27369w getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C27369w c27369wM106518c = C27369w.m106518c(inflater);
        Intrinsics.m97801g(c27369wM106518c, "inflate(...)");
        return c27369wM106518c;
    }

    @Override // com.transsion.shorttv_pugc.base.fragment.PageStatusFragment
    public void retryLoadData() {
    }
}
