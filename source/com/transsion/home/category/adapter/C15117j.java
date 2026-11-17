package com.transsion.home.category.adapter;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.moviedetailapi.bean.Subject;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p579ll.C25646b;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.home.category.adapter.j */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\"B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, m97100d2 = {"Lcom/transsion/home/category/adapter/j;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/moviedetailapi/bean/Subject;", "Lu6/i;", "", "datas", "Lll/b;", "exposureHelper", "<init>", "(Ljava/util/List;Lll/b;)V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "", "B0", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "", "showRank", "T1", "(Z)V", "G", "Lll/b;", "Lcom/transsion/home/category/adapter/k;", "H", "Lkotlin/Lazy;", "R1", "()Lcom/transsion/home/category/adapter/k;", "playListItemProvider", "I", "a", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C15117j extends BaseProviderMultiAdapter<Subject> implements InterfaceC27944i {

    /* JADX INFO: renamed from: J */
    public static final int f52635J = 8;

    /* JADX INFO: renamed from: K */
    public static final int f52636K = 1;

    /* JADX INFO: renamed from: L */
    public static final int f52637L = 2;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C25646b exposureHelper;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final Lazy playListItemProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15117j(List<Subject> datas, C25646b c25646b) {
        super(datas);
        Intrinsics.m97802h(datas, "datas");
        this.exposureHelper = c25646b;
        this.playListItemProvider = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.category.adapter.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C15117j.m67445S1();
            }
        });
        mo36107F1(m67444R1());
        mo36107F1(new C15115h());
    }

    /* JADX INFO: renamed from: R1 */
    private final C15118k m67444R1() {
        return (C15118k) this.playListItemProvider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S1 */
    public static final C15118k m67445S1() {
        return new C15118k();
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter, com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: B0 */
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        C25646b c25646b = this.exposureHelper;
        if (c25646b != null) {
            RecyclerView.AbstractC4214m layoutManager = getRecyclerView().getLayoutManager();
            Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            c25646b.m100944h((LinearLayoutManager) layoutManager, bindingAdapterPosition, true);
        }
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends Subject> data, int position) {
        Intrinsics.m97802h(data, "data");
        return data.get(position).getNonAdDelegate() != null ? 2 : 1;
    }

    /* JADX INFO: renamed from: T1 */
    public final void m67446T1(boolean showRank) {
        m67444R1().m67449z(showRank);
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
