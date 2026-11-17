package com.transsion.moviedetail.adapter;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.transsion.moviedetail.fragment.ForYouFragment;
import com.transsion.moviedetail.viewmodel.MovieDetailViewModel;
import com.transsion.moviedetailapi.bean.Subject;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.moviedetail.adapter.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m97100d2 = {"Lcom/transsion/moviedetail/adapter/c;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/moviedetailapi/bean/Subject;", "Lu6/i;", "Lcom/transsion/moviedetail/fragment/ForYouFragment;", "fragment", "", "pageName", "", "spanCount", "Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "movieDetailViewModel", "subject", "<init>", "(Lcom/transsion/moviedetail/fragment/ForYouFragment;Ljava/lang/String;ILcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;Lcom/transsion/moviedetailapi/bean/Subject;)V", "", "data", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "G", "a", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C15922c extends BaseProviderMultiAdapter<Subject> implements InterfaceC27944i {

    /* JADX INFO: renamed from: H */
    public static final int f54455H = 1002;

    /* JADX INFO: renamed from: I */
    public static final int f54456I = -9901;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15922c(ForYouFragment fragment, String pageName, int i11, MovieDetailViewModel movieDetailViewModel, Subject subject) {
        super(null, 1, null);
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(movieDetailViewModel, "movieDetailViewModel");
        mo36107F1(new ForYouSubjectProvider(subject, i11));
        mo36107F1(new C15928i(fragment, pageName, movieDetailViewModel));
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends Subject> data, int position) {
        Intrinsics.m97802h(data, "data");
        Integer subjectType = data.get(position).getSubjectType();
        if (subjectType != null && subjectType.intValue() == -9901) {
            return f54456I;
        }
        return 1002;
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
