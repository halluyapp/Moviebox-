package com.transsion.search.fragment.hot.adapter;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.search.R$drawable;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search.widget.C18541d;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.search.fragment.hot.adapter.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002)*B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010'\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010!¨\u0006+"}, m97100d2 = {"Lcom/transsion/search/fragment/hot/adapter/d;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/search/fragment/hot/adapter/a;", "Lu6/i;", "<init>", "()V", "Lkotlin/Function0;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "V1", "(Lkotlin/jvm/functions/Function0;)V", "", "moreShow", "isExpand", "", "moreIndex", "W1", "(ZZI)V", "", "data", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "", "G", "Ljava/lang/String;", "U1", "()Ljava/lang/String;", "Y1", "(Ljava/lang/String;)V", "sugSource", "H", "Lkotlin/jvm/functions/Function0;", "I", "Z", "showMode", "J", "expandMode", "K", "showMoreIndex", "L", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C18451d extends BaseProviderMultiAdapter<C18448a> implements InterfaceC27944i {

    /* JADX INFO: renamed from: M */
    public static final int f59820M = 1;

    /* JADX INFO: renamed from: N */
    public static final int f59821N = 2;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private String sugSource;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private Function0<Unit> listener;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean showMode;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean expandMode;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private int showMoreIndex;

    /* JADX INFO: renamed from: com.transsion.search.fragment.hot.adapter.d$b */
    public final class b extends BaseItemProvider {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: A */
        public static final void m77823A(C18451d c18451d, int i11, View view) {
            if (c18451d.showMode && i11 == c18451d.showMoreIndex) {
                Function0 function0 = c18451d.listener;
                if (function0 != null) {
                    function0.invoke();
                }
                C18541d.f60046a.m78124d(!c18451d.expandMode, c18451d.getSugSource());
            }
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: l */
        public int mo22758l() {
            return 1;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: m */
        public int mo22759m() {
            return R$layout.item_search_history_word;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void mo22757b(BaseViewHolder helper, C18448a item) {
            Intrinsics.m97802h(helper, "helper");
            Intrinsics.m97802h(item, "item");
            final int iM36184g0 = C18451d.this.m36184g0(item);
            helper.setText(R$id.search_history_text, item.m77808a());
            boolean z11 = C18451d.this.showMode && iM36184g0 == C18451d.this.showMoreIndex;
            View view = helper.getView(R$id.search_hot_history_more_image);
            final C18451d c18451d = C18451d.this;
            ImageView imageView = (ImageView) view;
            imageView.setVisibility(z11 ? 0 : 8);
            imageView.setImageResource(c18451d.expandMode ? R$drawable.ic_hide : R$drawable.ic_more);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.search.fragment.hot.adapter.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C18451d.b.m77823A(c18451d, iM36184g0, view2);
                }
            });
        }
    }

    public C18451d() {
        super(null, 1, null);
        mo36107F1(new b());
        this.sugSource = "mb_sug";
        this.showMoreIndex = -1;
    }

    /* JADX INFO: renamed from: X1 */
    public static /* synthetic */ void m77818X1(C18451d c18451d, boolean z11, boolean z12, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = -1;
        }
        c18451d.m77821W1(z11, z12, i11);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends C18448a> data, int position) {
        Intrinsics.m97802h(data, "data");
        return data.get(position).m77809b();
    }

    /* JADX INFO: renamed from: U1, reason: from getter */
    public final String getSugSource() {
        return this.sugSource;
    }

    /* JADX INFO: renamed from: V1 */
    public final void m77820V1(Function0<Unit> listener) {
        Intrinsics.m97802h(listener, "listener");
        this.listener = listener;
    }

    @SuppressLint({"Range"})
    /* JADX INFO: renamed from: W1 */
    public final void m77821W1(boolean moreShow, boolean isExpand, int moreIndex) {
        this.showMode = moreShow;
        this.expandMode = isExpand;
        this.showMoreIndex = moreIndex;
        if (getItemCount() > 0 && moreIndex >= 0) {
            int itemCount = moreShow ? moreIndex + 1 : getItemCount();
            for (int i11 = 0; i11 < itemCount; i11++) {
                if (i11 < getItemCount()) {
                    C18541d.f60046a.m78125e(((C18448a) getItem(i11)).m77808a(), i11, this.sugSource);
                }
            }
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m77822Y1(String str) {
        Intrinsics.m97802h(str, "<set-?>");
        this.sugSource = str;
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
