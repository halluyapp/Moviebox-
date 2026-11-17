package com.transsion.moviedetail.adapter;

import android.content.Context;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.moviedetail.R$id;
import com.transsion.moviedetail.R$layout;
import com.transsion.moviedetailapi.DownloadItem;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.widget.DownloadView;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.AddToDownloadEvent;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C25220y0;
import pg.C26866a;
import sh.AbstractC27615b;

/* JADX INFO: renamed from: com.transsion.moviedetail.adapter.n */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, m97100d2 = {"Lcom/transsion/moviedetail/adapter/n;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/DownloadItem;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", CampaignEx.JSON_KEY_TITLE, "duration", "", "list", "", NativeComponentConstants.KEY_COMPONENT_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "", "J1", "()V", "holder", WebConstants.FIELD_ITEM, "I1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/moviedetailapi/DownloadItem;)Ljava/lang/String;", "H1", "(I)Ljava/lang/String;", RequestParameters.POSITION, "D1", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "C1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/moviedetailapi/DownloadItem;)V", "F", "Ljava/lang/String;", "G1", "()Ljava/lang/String;", "G", "E1", "H", "Ljava/util/List;", "F1", "()Ljava/util/List;", "I", "Ljava/lang/Integer;", "", "J", "Z", "isAudio", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class C15933n extends BaseQuickAdapter {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final String duration;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final List<DownloadItem> list;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final Integer type;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final boolean isAudio;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15933n(String title, String str, List<DownloadItem> list, Integer num) {
        super(R$layout.adapter_resource_detector_collection_layout, list);
        Intrinsics.m97802h(title, "title");
        Intrinsics.m97802h(list, "list");
        this.title = title;
        this.duration = str;
        this.list = list;
        this.type = num;
        this.isAudio = num != null && num.intValue() == SubjectType.AUDIO.getValue();
    }

    /* JADX INFO: renamed from: D1 */
    private final String m70207D1(int position) {
        if (position >= 10) {
            return String.valueOf(position);
        }
        return "0" + position;
    }

    /* JADX INFO: renamed from: H1 */
    private final String m70208H1(int holder) {
        if (this.isAudio) {
            return "Chapter " + m70207D1(holder);
        }
        return "Episode " + m70207D1(holder);
    }

    /* JADX INFO: renamed from: I1 */
    private final String m70209I1(BaseViewHolder holder, DownloadItem item) {
        Throwable th2;
        String str;
        Object objM112707constructorimpl;
        if (item.getEp() <= 0 && item.getSe() <= 0) {
            Integer epse = item.getEpse();
            if ((epse != null ? epse.intValue() : 0) <= 0) {
                return "";
            }
            Integer epse2 = item.getEpse();
            return m70208H1(epse2 != null ? epse2.intValue() : 0);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            str = new DecimalFormat("00").format(Integer.valueOf(item.getEp()));
            Intrinsics.m97801g(str, "format(...)");
            try {
                objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th3) {
                th2 = th3;
                Result.Companion companion2 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        } catch (Throwable th4) {
            th2 = th4;
            str = "";
        }
        if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) == null) {
            return str;
        }
        Integer epse3 = item.getEpse();
        return m70208H1(epse3 != null ? epse3.intValue() : 0);
    }

    /* JADX INFO: renamed from: J1 */
    private final void m70210J1() {
        Context context = getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        Function1 function1 = new Function1() { // from class: com.transsion.moviedetail.adapter.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C15933n.m70211K1(this.f54482a, (AddToDownloadEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = AddToDownloadEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent((AppCompatActivity) context, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K1 */
    public static final Unit m70211K1(C15933n c15933n, AddToDownloadEvent value) {
        Intrinsics.m97802h(value, "value");
        try {
            Iterator<Object> it = c15933n.getData().iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                DownloadItem downloadItem = (DownloadItem) it.next();
                if (!TextUtils.isEmpty(value.getResourceId()) && TextUtils.equals(downloadItem.getResourceId(), value.getResourceId())) {
                    break;
                }
                i11++;
            }
            if (i11 >= 0) {
                c15933n.notifyItemChanged(i11);
            }
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, DownloadItem item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        C26866a.a.m104899g(C26866a.f81698a, "ResourceDetectorCollectionAdapter " + holder.getLayoutPosition() + "  " + item.getName(), false, 2, null);
        ((Group) holder.getView(R$id.group)).setVisibility(0);
        holder.setGone(R$id.tvAll, true);
        holder.setText(R$id.tvTitle, m70209I1(holder, item));
        int i11 = R$id.tvSize;
        Long size = item.getSize();
        holder.setText(i11, AbstractC27615b.m107445a(size != null ? size.longValue() : 0L, 1));
        DownloadView.setShowType$default((DownloadView) holder.getView(R$id.innerIvDownload), null, item.getResourceId(), Boolean.FALSE, false, 0, 16, null);
    }

    /* JADX INFO: renamed from: E1, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: F1 */
    public final List<DownloadItem> m70214F1() {
        return this.list;
    }

    /* JADX INFO: renamed from: G1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.m97802h(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        m70210J1();
    }
}
