package com.transsion.search.fragment.values.adapter;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.transsion.search.bean.SearchValuesRelatedCollectionEntity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.search.fragment.values.adapter.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\t\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m97100d2 = {"Lcom/transsion/search/fragment/values/adapter/b;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/search/bean/SearchValuesRelatedCollectionEntity;", "<init>", "()V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "", "keyword", "", "R1", "(Ljava/lang/String;)V", "Q1", "()Ljava/lang/String;", "G", "Ljava/lang/String;", "mKeyWord", "Search_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C18504b extends BaseProviderMultiAdapter<SearchValuesRelatedCollectionEntity> {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private String mKeyWord;

    public C18504b() {
        super(null, 1, null);
        mo36107F1(new C18506d());
        mo36107F1(new C18507e());
        mo36107F1(new C18505c());
        this.mKeyWord = "";
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends SearchValuesRelatedCollectionEntity> data, int position) {
        Intrinsics.m97802h(data, "data");
        int type = data.get(position).getType();
        if (type == 0) {
            return 0;
        }
        int i11 = 1;
        if (type != 1) {
            i11 = 2;
            if (type != 2) {
                return 0;
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final String getMKeyWord() {
        return this.mKeyWord;
    }

    /* JADX INFO: renamed from: R1 */
    public final void m77986R1(String keyword) {
        Intrinsics.m97802h(keyword, "keyword");
        this.mKeyWord = keyword;
    }
}
