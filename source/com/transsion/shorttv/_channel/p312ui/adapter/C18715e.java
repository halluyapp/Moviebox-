package com.transsion.shorttv._channel.p312ui.adapter;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.shorttv.bean.Subject;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p330cs.C22776b;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import p882wr.C28433c;
import p882wr.C28434d;

/* JADX INFO: renamed from: com.transsion.shorttv._channel.ui.adapter.e */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\"B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, m97100d2 = {"Lcom/transsion/shorttv/_channel/ui/adapter/e;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/shorttv/bean/Subject;", "Lu6/i;", "", "datas", "Lcs/b;", "exposureHelper", "<init>", "(Ljava/util/List;Lcs/b;)V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "", "B0", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "", "showRank", "T1", "(Z)V", "G", "Lcs/b;", "Lwr/d;", "H", "Lkotlin/Lazy;", "R1", "()Lwr/d;", "playListItemProvider", "I", "a", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C18715e extends BaseProviderMultiAdapter<Subject> implements InterfaceC27944i {

    /* JADX INFO: renamed from: J */
    public static final int f60415J = 1;

    /* JADX INFO: renamed from: K */
    public static final int f60416K = 2;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C22776b exposureHelper;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final Lazy playListItemProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18715e(List<Subject> datas, C22776b c22776b) {
        super(datas);
        Intrinsics.m97802h(datas, "datas");
        this.exposureHelper = c22776b;
        this.playListItemProvider = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv._channel.ui.adapter.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C18715e.m78709S1();
            }
        });
        mo36107F1(m78708R1());
        mo36107F1(new C28433c());
    }

    /* JADX INFO: renamed from: R1 */
    private final C28434d m78708R1() {
        return (C28434d) this.playListItemProvider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S1 */
    public static final C28434d m78709S1() {
        return new C28434d();
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter, com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: B0 */
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        C22776b c22776b = this.exposureHelper;
        if (c22776b != null) {
            RecyclerView.AbstractC4214m layoutManager = getRecyclerView().getLayoutManager();
            Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            C22776b.m90699h(c22776b, (LinearLayoutManager) layoutManager, bindingAdapterPosition, true, false, 8, null);
        }
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends Subject> data, int position) {
        Intrinsics.m97802h(data, "data");
        return data.get(position).getNonAdDelegate() != null ? 2 : 1;
    }

    /* JADX INFO: renamed from: T1 */
    public final void m78710T1(boolean showRank) {
        m78708R1().m109856z(showRank);
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
