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
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import lv.C25693i;
import ng.AbstractC26006c;
import p721qv.C27131b;
import sv.C27657b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0011\u0010\u0004J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0004R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"¨\u0006%"}, m97100d2 = {"Lcom/transsion/transfer/impl/TransferSentFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Llv/i;", "<init>", "()V", "", "r0", "Landroid/view/LayoutInflater;", "inflater", "k0", "(Landroid/view/LayoutInflater;)Llv/i;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "p0", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/transsion/transfer/impl/entity/FileData;", "a", "Lkotlin/Lazy;", "h0", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "data", "Lcom/transsion/transfer/impl/adapter/b;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "i0", "()Lcom/transsion/transfer/impl/adapter/b;", "mAdapter", "Lcom/transsion/transfer/impl/k;", "c", "j0", "()Lcom/transsion/transfer/impl/k;", "serverViewModel", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Transfer_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class TransferSentFragment extends BaseFragment<C25693i> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy data = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.impl.t
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TransferSentFragment.m82993g0();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mAdapter = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.impl.u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TransferSentFragment.m83000o0(this.f63850a);
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy serverViewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.impl.v
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TransferSentFragment.m83001q0(this.f63851a);
        }
    });

    /* JADX INFO: renamed from: com.transsion.transfer.impl.TransferSentFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final TransferSentFragment m83005a() {
            TransferSentFragment transferSentFragment = new TransferSentFragment();
            transferSentFragment.setArguments(AbstractC2411d.m11890a());
            return transferSentFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.TransferSentFragment$b */
    static final class C19966b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f63659a;

        C19966b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f63659a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f63659a;
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
            this.f63659a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final CopyOnWriteArrayList m82993g0() {
        return new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: h0 */
    private final CopyOnWriteArrayList m82994h0() {
        return (CopyOnWriteArrayList) this.data.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    private final C19978b m82995i0() {
        return (C19978b) this.mAdapter.getValue();
    }

    /* JADX INFO: renamed from: j0 */
    private final C20022k m82996j0() {
        return (C20022k) this.serverViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final Unit m82997l0(TransferSentFragment transferSentFragment, Pair pair) {
        C27131b.f82241a.m105574q(((List) pair.getSecond()).size(), transferSentFragment.m82996j0().m83253t());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final Unit m82998m0(TransferSentFragment transferSentFragment, Triple triple) {
        Object next;
        Iterator it = C27657b.f84826a.m107594d().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.m97797c(triple.getSecond(), ((FileData) next).getFileRemotePath()));
        FileData fileData = (FileData) next;
        if (fileData != null) {
            transferSentFragment.m82995i0().m83091I1((String) triple.getSecond(), fileData);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final Unit m82999n0(TransferSentFragment transferSentFragment, Pair pair) {
        if (!((Boolean) pair.getSecond()).booleanValue()) {
            transferSentFragment.m82995i0().m83090H1();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C19978b m83000o0(TransferSentFragment transferSentFragment) {
        InterfaceC3224u viewLifecycleOwner = transferSentFragment.getViewLifecycleOwner();
        Intrinsics.m97801g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return new C19978b(AbstractC3226v.m14968a(viewLifecycleOwner), true, transferSentFragment.m82994h0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C20022k m83001q0(TransferSentFragment transferSentFragment) {
        FragmentActivity fragmentActivityRequireActivity = transferSentFragment.requireActivity();
        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
        return (C20022k) new C3227v0(fragmentActivityRequireActivity).m14969a(C20022k.class);
    }

    /* JADX INFO: renamed from: r0 */
    private final void m83002r0() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        if (m82994h0().isEmpty()) {
            C25693i mViewBinding = getMViewBinding();
            if (mViewBinding == null || (linearLayout2 = mViewBinding.f78080c) == null) {
                return;
            }
            AbstractC26006c.m102058k(linearLayout2);
            return;
        }
        C25693i mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (linearLayout = mViewBinding2.f78080c) == null) {
            return;
        }
        AbstractC26006c.m102054g(linearLayout);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        RecyclerView recyclerView;
        Intrinsics.m97802h(view, "view");
        C25693i mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView = mViewBinding.f78079b) != null) {
            recyclerView.setItemAnimator(null);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setAdapter(m82995i0());
        }
        m82996j0().m83254u().m14851j(this, new C19966b(new Function1() { // from class: com.transsion.transfer.impl.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferSentFragment.m82997l0(this.f63853a, (Pair) obj);
            }
        }));
        m82996j0().m83255v().m14851j(this, new C19966b(new Function1() { // from class: com.transsion.transfer.impl.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferSentFragment.m82998m0(this.f63854a, (Triple) obj);
            }
        }));
        m82996j0().m83249o().m14851j(this, new C19966b(new Function1() { // from class: com.transsion.transfer.impl.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferSentFragment.m82999n0(this.f63855a, (Pair) obj);
            }
        }));
        m83002r0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public C25693i getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25693i c25693iM101081c = C25693i.m101081c(inflater);
        Intrinsics.m97801g(c25693iM101081c, "inflate(...)");
        return c25693iM101081c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        m82994h0().addAll(C27657b.f84826a.m107594d());
        m82995i0().notifyDataSetChanged();
        m83002r0();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m83004p0() {
        List listM107594d = C27657b.f84826a.m107594d();
        if (!listM107594d.isEmpty()) {
            List<Object> data = m82995i0().getData();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.m97935e(MapsKt.m97550e(CollectionsKt.m97516v(data, 10)), 16));
            for (Object obj : data) {
                linkedHashMap.put(((FileData) obj).getFileRemotePath(), obj);
            }
            List list = listM107594d;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.m97935e(MapsKt.m97550e(CollectionsKt.m97516v(list, 10)), 16));
            for (Object obj2 : list) {
                linkedHashMap2.put(((FileData) obj2).getFileRemotePath(), obj2);
            }
            List listR0 = CollectionsKt.m97340R0(MapsKt.m97580o(linkedHashMap, linkedHashMap2).values());
            m82994h0().clear();
            m82994h0().addAll(CollectionsKt.m97343U0(listR0));
            m82995i0().notifyDataSetChanged();
        }
        m83002r0();
    }
}
