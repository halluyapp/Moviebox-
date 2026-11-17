package com.transsion.usercenter.setting.adapter;

import androidx.recyclerview.widget.DiffUtil;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p923xw.C28669b;

/* JADX INFO: renamed from: com.transsion.usercenter.setting.adapter.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m97100d2 = {"Lcom/transsion/usercenter/setting/adapter/d;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lxw/b;", "", "data", "<init>", "(Ljava/util/List;)V", "", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "G", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C20792d extends BaseProviderMultiAdapter<C28669b> {

    /* JADX INFO: renamed from: H */
    public static final int f65443H = 1;

    /* JADX INFO: renamed from: I */
    public static final int f65444I = 2;

    /* JADX INFO: renamed from: J */
    public static final int f65445J = 3;

    /* JADX INFO: renamed from: com.transsion.usercenter.setting.adapter.d$a */
    public static final class a extends DiffUtil.AbstractC4174e {
        a() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(C28669b oldItem, C28669b newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.m110484b(), newItem.m110484b());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(C28669b oldItem, C28669b newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return oldItem.m110491i() == newItem.m110491i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20792d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20792d(List<C28669b> data) {
        super(data);
        Intrinsics.m97802h(data, "data");
        mo36107F1(new C20793e());
        mo36107F1(new C20796h());
        mo36107F1(new C20795g());
        m36158R0(new a());
    }

    public /* synthetic */ C20792d(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ArrayList() : list);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends C28669b> data, int position) {
        Intrinsics.m97802h(data, "data");
        return data.get(position).m110493k();
    }
}
