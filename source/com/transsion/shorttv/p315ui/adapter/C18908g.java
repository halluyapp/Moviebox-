package com.transsion.shorttv.p315ui.adapter;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.shorttv.p315ui.fragment.ShortTvDetailListFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p659os.AbstractC26725k;
import p659os.C26719e;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.shorttv.ui.adapter.g */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001#BC\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001f2\u000e\u0010\u001e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001dH\u0016¢\u0006\u0004\b \u0010!¨\u0006$"}, m97100d2 = {"Lcom/transsion/shorttv/ui/adapter/g;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Los/k;", "Lu6/i;", "", "dataList", "Lcom/transsion/shorttv/ui/fragment/ShortTvDetailListFragment;", "fragment", "", "videoLoadMore", "", "basePostId", "baseItemType", "fromTrending", "<init>", "(Ljava/util/List;Lcom/transsion/shorttv/ui/fragment/ShortTvDetailListFragment;ZLjava/lang/String;Ljava/lang/String;Z)V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "ep", "hasTrailer", "Los/e;", "Q1", "(IZ)Los/e;", "S1", "(IZ)I", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "baseQuickAdapter", "Lu6/f;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)Lu6/f;", "G", "a", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class C18908g extends BaseProviderMultiAdapter<AbstractC26725k> implements InterfaceC27944i {

    /* JADX INFO: renamed from: H */
    public static final int f60978H = 1;

    /* JADX INFO: renamed from: I */
    public static final int f60979I = 2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18908g(List<AbstractC26725k> dataList, ShortTvDetailListFragment fragment, boolean z11, String str, String str2, boolean z12) {
        super(CollectionsKt.m97343U0(dataList));
        Intrinsics.m97802h(dataList, "dataList");
        Intrinsics.m97802h(fragment, "fragment");
        mo36107F1(new C18911j(fragment, z11, str, str2, z12));
        mo36107F1(new C18907f());
    }

    public /* synthetic */ C18908g(List list, ShortTvDetailListFragment shortTvDetailListFragment, boolean z11, String str, String str2, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, shortTvDetailListFragment, z11, str, str2, (i11 & 32) != 0 ? false : z12);
    }

    /* JADX INFO: renamed from: R1 */
    public static /* synthetic */ C26719e m79554R1(C18908g c18908g, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return c18908g.m79556Q1(i11, z11);
    }

    /* JADX INFO: renamed from: T1 */
    public static /* synthetic */ int m79555T1(C18908g c18908g, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return c18908g.m79557S1(i11, z11);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends AbstractC26725k> data, int position) {
        Intrinsics.m97802h(data, "data");
        return CollectionsKt.m97362l0(data, position) instanceof C26719e ? 1 : 2;
    }

    /* JADX INFO: renamed from: Q1 */
    public final C26719e m79556Q1(int ep2, boolean hasTrailer) {
        Object next;
        if (getData().size() >= ep2) {
            AbstractC26725k abstractC26725k = (hasTrailer || ep2 == 0) ? (AbstractC26725k) CollectionsKt.m97362l0(getData(), ep2) : (AbstractC26725k) CollectionsKt.m97362l0(getData(), ep2 - 1);
            if (abstractC26725k instanceof C26719e) {
                C26719e c26719e = (C26719e) abstractC26725k;
                if (c26719e.m104511c() == ep2) {
                    return c26719e;
                }
            }
        }
        Iterator<T> it = getData().iterator();
        while (it.hasNext()) {
            next = it.next();
            AbstractC26725k abstractC26725k2 = (AbstractC26725k) next;
            if ((abstractC26725k2 instanceof C26719e) && ((C26719e) abstractC26725k2).m104511c() == ep2) {
                return (C26719e) next;
            }
        }
        next = null;
        return (C26719e) next;
    }

    /* JADX INFO: renamed from: S1 */
    public final int m79557S1(int ep2, boolean hasTrailer) {
        if (getData().size() >= ep2) {
            if (hasTrailer || ep2 == 0) {
                AbstractC26725k abstractC26725k = (AbstractC26725k) CollectionsKt.m97362l0(getData(), ep2);
                if ((abstractC26725k instanceof C26719e) && ((C26719e) abstractC26725k).m104511c() == ep2) {
                    return ep2;
                }
            } else {
                int i11 = ep2 - 1;
                AbstractC26725k abstractC26725k2 = (AbstractC26725k) CollectionsKt.m97362l0(getData(), i11);
                if ((abstractC26725k2 instanceof C26719e) && ((C26719e) abstractC26725k2).m104511c() == ep2) {
                    return i11;
                }
            }
        }
        Iterator<Object> it = getData().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            AbstractC26725k abstractC26725k3 = (AbstractC26725k) it.next();
            if ((abstractC26725k3 instanceof C26719e) && ((C26719e) abstractC26725k3).m104511c() == ep2) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        Intrinsics.m97802h(baseQuickAdapter, "baseQuickAdapter");
        return new C27941f(baseQuickAdapter);
    }
}
