package com.transsion.moviedetail.adapter;

import android.content.Context;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.baseui.util.TimeUtilKt;
import com.transsion.moviedetail.R$id;
import com.transsion.moviedetail.R$layout;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.widget.DownloadView;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.AddToDownloadEvent;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C25220y0;
import pg.C26866a;
import sh.AbstractC27615b;

/* JADX INFO: renamed from: com.transsion.moviedetail.adapter.l */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m97100d2 = {"Lcom/transsion/moviedetail/adapter/l;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/bean/ResourceDetectors;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lcom/transsion/moviedetailapi/bean/Subject;", "movieDetailBean", "", "list", "<init>", "(Lcom/transsion/moviedetailapi/bean/Subject;Ljava/util/List;)V", "", "E1", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "holder", WebConstants.FIELD_ITEM, "C1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/moviedetailapi/bean/ResourceDetectors;)V", "", "F", "Ljava/lang/String;", "resourceId", "G", "Lcom/transsion/moviedetailapi/bean/Subject;", "D1", "()Lcom/transsion/moviedetailapi/bean/Subject;", "G1", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", "mMovieDetailBean", "Lcom/transsnet/downloader/widget/DownloadView;", "H", "Lcom/transsnet/downloader/widget/DownloadView;", "downloadView", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class C15931l extends BaseQuickAdapter {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private String resourceId;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private Subject mMovieDetailBean;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private DownloadView downloadView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15931l(Subject subject, List<ResourceDetectors> list) {
        super(R$layout.adapter_resource_detector_alone_layout, list);
        Intrinsics.m97802h(list, "list");
        this.mMovieDetailBean = subject;
    }

    /* JADX INFO: renamed from: E1 */
    private final void m70201E1() {
        Context context = getContext();
        Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        Function1 function1 = new Function1() { // from class: com.transsion.moviedetail.adapter.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C15931l.m70202F1(this.f54478a, (AddToDownloadEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = AddToDownloadEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent((AppCompatActivity) context, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public static final Unit m70202F1(C15931l c15931l, AddToDownloadEvent value) {
        Intrinsics.m97802h(value, "value");
        try {
            Iterator<Object> it = c15931l.getData().iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (TextUtils.equals(((ResourceDetectors) it.next()).getResourceId(), value.getResourceId())) {
                    break;
                }
                i11++;
            }
            if (i11 >= 0) {
                c15931l.notifyItemChanged(i11);
            }
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, ResourceDetectors item) {
        Integer durationSeconds;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        int i11 = R$id.tvTitle;
        Subject subject = this.mMovieDetailBean;
        holder.setText(i11, subject != null ? subject.getTitle() : null);
        Integer type = item.getType();
        long jLongValue = 0;
        if (type != null && type.intValue() == 0) {
            Long totalSize = item.getTotalSize();
            if (totalSize != null) {
                jLongValue = totalSize.longValue();
            }
        } else {
            Long firstSize = item.getFirstSize();
            if (firstSize != null) {
                jLongValue = firstSize.longValue();
            }
        }
        Subject subject2 = this.mMovieDetailBean;
        if (subject2 == null || (durationSeconds = subject2.getDurationSeconds()) == null) {
            holder.setText(R$id.tvSize, AbstractC27615b.m107445a(jLongValue, 1));
        } else {
            int iIntValue = durationSeconds.intValue();
            if (holder.setText(R$id.tvSize, AbstractC27615b.m107445a(jLongValue, 1) + " · " + TimeUtilKt.m65663o(((long) iIntValue) * 1000)) == null) {
                holder.setText(R$id.tvSize, AbstractC27615b.m107445a(jLongValue, 1));
            }
        }
        DownloadView downloadView = (DownloadView) holder.getView(R$id.innerIvDownload);
        this.downloadView = downloadView;
        if (downloadView != null) {
            downloadView.setPageFrom("subjectdetail");
        }
        this.resourceId = item.getResourceId();
        DownloadView downloadView2 = this.downloadView;
        if (downloadView2 != null) {
            Subject subject3 = this.mMovieDetailBean;
            String subjectId = subject3 != null ? subject3.getSubjectId() : null;
            String str = this.resourceId;
            Subject subject4 = this.mMovieDetailBean;
            DownloadView.setShowType$default(downloadView2, subjectId, str, subject4 != null ? Boolean.valueOf(subject4.isSeries()) : null, false, 0, 24, null);
        }
    }

    /* JADX INFO: renamed from: D1, reason: from getter */
    public final Subject getMMovieDetailBean() {
        return this.mMovieDetailBean;
    }

    /* JADX INFO: renamed from: G1 */
    public final void m70205G1(Subject subject) {
        this.mMovieDetailBean = subject;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.m97802h(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        m70201E1();
    }
}
