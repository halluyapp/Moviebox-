package com.transsion.shorttv_pugc.p317ui.adapter;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.shorttv_pugc.ShorttvModel;
import com.transsion.shorttv_pugc.p317ui.fragment.ShortTvDetailListFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p801u6.C27941f;
import p801u6.C27942g;
import p801u6.InterfaceC27944i;
import p801u6.InterfaceC27947l;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.ui.adapter.e */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001&BC\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001f2\u000e\u0010\u001e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001dH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\"2\u000e\u0010\u001e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001dH\u0016¢\u0006\u0004\b#\u0010$¨\u0006'"}, m97100d2 = {"Lcom/transsion/shorttv_pugc/ui/adapter/e;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/shorttv_pugc/ShorttvModel$UGCVideo;", "Lu6/i;", "Lu6/l;", "", "dataList", "Lcom/transsion/shorttv_pugc/ui/fragment/ShortTvDetailListFragment;", "fragment", "", "videoLoadMore", "", "basePostId", "baseItemType", "fromTrending", "<init>", "(Ljava/util/List;Lcom/transsion/shorttv_pugc/ui/fragment/ShortTvDetailListFragment;ZLjava/lang/String;Ljava/lang/String;Z)V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "ep", "hasTrailer", "Q1", "(IZ)Lcom/transsion/shorttv_pugc/ShorttvModel$UGCVideo;", "S1", "(IZ)I", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "baseQuickAdapter", "Lu6/f;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)Lu6/f;", "Lu6/g;", "f", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)Lu6/g;", "G", "a", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class C19322e extends BaseProviderMultiAdapter<ShorttvModel.UGCVideo> implements InterfaceC27944i, InterfaceC27947l {

    /* JADX INFO: renamed from: H */
    public static final int f61994H = 1;

    /* JADX INFO: renamed from: I */
    public static final int f61995I = 2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19322e(List<ShorttvModel.UGCVideo> dataList, ShortTvDetailListFragment fragment, boolean z11, String str, String str2, boolean z12) {
        super(CollectionsKt.m97343U0(dataList));
        Intrinsics.m97802h(dataList, "dataList");
        Intrinsics.m97802h(fragment, "fragment");
        mo36107F1(new C19324g(fragment, z11, str, str2, z12));
    }

    public /* synthetic */ C19322e(List list, ShortTvDetailListFragment shortTvDetailListFragment, boolean z11, String str, String str2, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, shortTvDetailListFragment, z11, str, str2, (i11 & 32) != 0 ? false : z12);
    }

    /* JADX INFO: renamed from: R1 */
    public static /* synthetic */ ShorttvModel.UGCVideo m80807R1(C19322e c19322e, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return c19322e.m80809Q1(i11, z11);
    }

    /* JADX INFO: renamed from: T1 */
    public static /* synthetic */ int m80808T1(C19322e c19322e, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return c19322e.m80810S1(i11, z11);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends ShorttvModel.UGCVideo> data, int position) {
        Intrinsics.m97802h(data, "data");
        return 1;
    }

    /* JADX INFO: renamed from: Q1 */
    public final ShorttvModel.UGCVideo m80809Q1(int ep2, boolean hasTrailer) {
        Object next;
        if (getData().size() >= ep2) {
            ShorttvModel.UGCVideo uGCVideo = (hasTrailer || ep2 == 0) ? (ShorttvModel.UGCVideo) CollectionsKt.m97362l0(getData(), ep2) : (ShorttvModel.UGCVideo) CollectionsKt.m97362l0(getData(), ep2 - 1);
            if (uGCVideo != null && uGCVideo.getEp() == ep2) {
                return uGCVideo;
            }
        }
        Iterator<T> it = getData().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((ShorttvModel.UGCVideo) next).getEp() == ep2) {
                return (ShorttvModel.UGCVideo) next;
            }
        }
        next = null;
        return (ShorttvModel.UGCVideo) next;
    }

    /* JADX INFO: renamed from: S1 */
    public final int m80810S1(int ep2, boolean hasTrailer) {
        if (getData().size() >= ep2) {
            if (hasTrailer || ep2 == 0) {
                ShorttvModel.UGCVideo uGCVideo = (ShorttvModel.UGCVideo) CollectionsKt.m97362l0(getData(), ep2);
                if (uGCVideo != null && uGCVideo.getEp() == ep2) {
                    return ep2;
                }
            } else {
                int i11 = ep2 - 1;
                ShorttvModel.UGCVideo uGCVideo2 = (ShorttvModel.UGCVideo) CollectionsKt.m97362l0(getData(), i11);
                if (uGCVideo2 != null && uGCVideo2.getEp() == ep2) {
                    return i11;
                }
            }
        }
        Iterator<Object> it = getData().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            if (((ShorttvModel.UGCVideo) it.next()).getEp() == ep2) {
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

    @Override // p801u6.InterfaceC27947l
    /* JADX INFO: renamed from: f */
    public C27942g mo80811f(BaseQuickAdapter baseQuickAdapter) {
        Intrinsics.m97802h(baseQuickAdapter, "baseQuickAdapter");
        return new C27942g(baseQuickAdapter);
    }
}
