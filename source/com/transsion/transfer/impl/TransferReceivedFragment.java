package com.transsion.transfer.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.transfer.impl.adapter.C19978b;
import com.transsion.transfer.impl.entity.FileData;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import lv.C25692h;
import ng.AbstractC26006c;
import sv.C27656a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0004J\r\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0004J\r\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0004R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010$¨\u0006'"}, m97100d2 = {"Lcom/transsion/transfer/impl/TransferReceivedFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Llv/h;", "<init>", "()V", "", "v0", "Landroid/view/LayoutInflater;", "inflater", "n0", "(Landroid/view/LayoutInflater;)Llv/h;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "m0", "t0", "u0", "Lcom/transsion/transfer/impl/ClientViewModel;", "a", "Lkotlin/Lazy;", "j0", "()Lcom/transsion/transfer/impl/ClientViewModel;", "clientViewModel", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/transsion/transfer/impl/entity/FileData;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "k0", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "data", "Lcom/transsion/transfer/impl/adapter/b;", "c", "l0", "()Lcom/transsion/transfer/impl/adapter/b;", "mAdapter", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Transfer_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class TransferReceivedFragment extends BaseFragment<C25692h> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy clientViewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.impl.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TransferReceivedFragment.m82971h0(this.f63806a);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy data = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.impl.q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TransferReceivedFragment.m82972i0();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy mAdapter = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.impl.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TransferReceivedFragment.m82979r0(this.f63808a);
        }
    });

    /* JADX INFO: renamed from: com.transsion.transfer.impl.TransferReceivedFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final TransferReceivedFragment m82986a() {
            TransferReceivedFragment transferReceivedFragment = new TransferReceivedFragment();
            transferReceivedFragment.setArguments(AbstractC2411d.m11890a());
            return transferReceivedFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.TransferReceivedFragment$b */
    static final class C19964b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f63654a;

        C19964b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f63654a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f63654a;
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
            this.f63654a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final ClientViewModel m82971h0(TransferReceivedFragment transferReceivedFragment) {
        FragmentActivity fragmentActivityRequireActivity = transferReceivedFragment.requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        return (ClientViewModel) new C3227v0(fragmentActivityRequireActivity).m14969a(ClientViewModel.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final CopyOnWriteArrayList m82972i0() {
        return new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: j0 */
    private final ClientViewModel m82973j0() {
        return (ClientViewModel) this.clientViewModel.getValue();
    }

    /* JADX INFO: renamed from: k0 */
    private final CopyOnWriteArrayList m82974k0() {
        return (CopyOnWriteArrayList) this.data.getValue();
    }

    /* JADX INFO: renamed from: l0 */
    private final C19978b m82975l0() {
        return (C19978b) this.mAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final Unit m82976o0(TransferReceivedFragment transferReceivedFragment, Pair pair) {
        Object next;
        Iterator it = C27656a.f84824a.m107586d().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.m97797c(((FileData) next).getFileRemotePath(), pair.getFirst()));
        FileData fileData = (FileData) next;
        if (fileData != null) {
            transferReceivedFragment.m82975l0().m83091I1((String) pair.getFirst(), fileData);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final Unit m82977p0(TransferReceivedFragment transferReceivedFragment, List list) {
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            List<Object> data = transferReceivedFragment.m82975l0().getData();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.m97935e(MapsKt.m97550e(CollectionsKt.m97516v(data, 10)), 16));
            for (Object obj : data) {
                linkedHashMap.put(((FileData) obj).getFileRemotePath(), obj);
            }
            List list3 = list;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.m97935e(MapsKt.m97550e(CollectionsKt.m97516v(list3, 10)), 16));
            for (Object obj2 : list3) {
                linkedHashMap2.put(((FileData) obj2).getFileRemotePath(), obj2);
            }
            List listR0 = CollectionsKt.m97340R0(MapsKt.m97580o(linkedHashMap, linkedHashMap2).values());
            transferReceivedFragment.m82974k0().clear();
            List list4 = listR0;
            transferReceivedFragment.m82974k0().addAll(CollectionsKt.m97343U0(list4));
            transferReceivedFragment.m82975l0().notifyDataSetChanged();
            transferReceivedFragment.m82973j0().m82928C(CollectionsKt.m97343U0(list4));
        }
        transferReceivedFragment.m82981v0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final Unit m82978q0(TransferReceivedFragment transferReceivedFragment, boolean z11, String error) {
        Intrinsics.m97802h(error, "error");
        if (z11) {
            transferReceivedFragment.m82973j0().m82935s(false);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C19978b m82979r0(final TransferReceivedFragment transferReceivedFragment) {
        InterfaceC3224u viewLifecycleOwner = transferReceivedFragment.getViewLifecycleOwner();
        Intrinsics.m97801g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C19978b c19978b = new C19978b(AbstractC3226v.m14968a(viewLifecycleOwner), false, transferReceivedFragment.m82974k0());
        c19978b.m83092J1(new Function1() { // from class: com.transsion.transfer.impl.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferReceivedFragment.m82980s0(this.f63810a, (FileData) obj);
            }
        });
        return c19978b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final Unit m82980s0(TransferReceivedFragment transferReceivedFragment, FileData it) {
        Intrinsics.m97802h(it, "it");
        transferReceivedFragment.m82973j0().m82940y(it);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: v0 */
    private final void m82981v0() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        if (m82974k0().isEmpty()) {
            C25692h mViewBinding = getMViewBinding();
            if (mViewBinding == null || (linearLayout2 = mViewBinding.f78077c) == null) {
                return;
            }
            AbstractC26006c.m102058k(linearLayout2);
            return;
        }
        C25692h mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (linearLayout = mViewBinding2.f78077c) == null) {
            return;
        }
        AbstractC26006c.m102054g(linearLayout);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        RecyclerView recyclerView;
        Intrinsics.m97802h(view, "view");
        C25692h mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView = mViewBinding.f78076b) != null) {
            recyclerView.setItemAnimator(null);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setAdapter(m82975l0());
        }
        m82973j0().m82936u().m14851j(this, new C19964b(new Function1() { // from class: com.transsion.transfer.impl.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferReceivedFragment.m82977p0(this.f63802a, (List) obj);
            }
        }));
        m82973j0().m82937v().m14851j(this, new C19964b(new Function1() { // from class: com.transsion.transfer.impl.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferReceivedFragment.m82976o0(this.f63804a, (Pair) obj);
            }
        }));
        m82981v0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        if (m82973j0().m82939x()) {
            m82973j0().m82935s(false);
        } else {
            m82973j0().m82929k(new Function2() { // from class: com.transsion.transfer.impl.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TransferReceivedFragment.m82978q0(this.f63800a, ((Boolean) obj).booleanValue(), (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m82982m0() {
        m82973j0().m82935s(true);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public C25692h getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25692h c25692hM101077c = C25692h.m101077c(inflater);
        Intrinsics.m97801g(c25692hM101077c, "inflate(...)");
        return c25692hM101077c;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m82984t0() {
        m82975l0().m83090H1();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m82985u0() {
        List listM107586d = C27656a.f84824a.m107586d();
        if (!listM107586d.isEmpty()) {
            List<Object> data = m82975l0().getData();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.m97935e(MapsKt.m97550e(CollectionsKt.m97516v(data, 10)), 16));
            for (Object obj : data) {
                linkedHashMap.put(((FileData) obj).getFileRemotePath(), obj);
            }
            List list = listM107586d;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.m97935e(MapsKt.m97550e(CollectionsKt.m97516v(list, 10)), 16));
            for (Object obj2 : list) {
                linkedHashMap2.put(((FileData) obj2).getFileRemotePath(), obj2);
            }
            List listR0 = CollectionsKt.m97340R0(MapsKt.m97580o(linkedHashMap, linkedHashMap2).values());
            m82974k0().clear();
            m82974k0().addAll(CollectionsKt.m97343U0(listR0));
            m82975l0().notifyDataSetChanged();
        }
        m82981v0();
    }
}
