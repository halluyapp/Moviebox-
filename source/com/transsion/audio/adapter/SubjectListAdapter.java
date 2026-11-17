package com.transsion.audio.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.transsion.audio.R$id;
import com.transsion.audio.R$layout;
import com.transsion.audio.fragment.SubjectListFragment;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.moviedetailapi.DownloadItem;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25132j;
import p602mj.InterfaceC25866a;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import pg.C26866a;
import sh.AbstractC27615b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001&B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\rJ-\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0015\u0010\rJ\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u001f\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0019R\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, m97100d2 = {"Lcom/transsion/audio/adapter/SubjectListAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/DownloadItem;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "", "dataList", "<init>", "(Ljava/util/List;)V", "holder", WebConstants.FIELD_ITEM, "", "L1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/moviedetailapi/DownloadItem;)V", "download", "I1", "", "", "payloads", "F1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/moviedetailapi/DownloadItem;Ljava/util/List;)V", "E1", "Lcom/transsion/audio/adapter/SubjectListAdapter$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "J1", "(Lcom/transsion/audio/adapter/SubjectListAdapter$a;)V", "F", "Lcom/transsion/audio/adapter/SubjectListAdapter$a;", "H1", "()Lcom/transsion/audio/adapter/SubjectListAdapter$a;", "K1", "optionClickListener", "Lmj/a;", "G", "Lkotlin/Lazy;", "G1", "()Lmj/a;", "audioDao", "a", "Audio_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SubjectListAdapter extends BaseQuickAdapter implements InterfaceC27944i {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private InterfaceC14207a optionClickListener;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final Lazy audioDao;

    /* JADX INFO: renamed from: com.transsion.audio.adapter.SubjectListAdapter$a */
    public interface InterfaceC14207a {
        /* JADX INFO: renamed from: a */
        void mo64443a(DownloadItem downloadItem);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubjectListAdapter(List<DownloadItem> dataList) {
        super(R$layout.adapter_item_audio_list, dataList);
        Intrinsics.m97802h(dataList, "dataList");
        this.audioDao = LazyKt.m97097b(new Function0() { // from class: com.transsion.audio.adapter.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubjectListAdapter.m64434D1(this.f50395a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final InterfaceC25866a m64434D1(SubjectListAdapter subjectListAdapter) {
        return AppDatabase.INSTANCE.m64881b(subjectListAdapter.getContext()).mo64867n1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public final InterfaceC25866a m64435G1() {
        return (InterfaceC25866a) this.audioDao.getValue();
    }

    /* JADX INFO: renamed from: I1 */
    private final void m64436I1(BaseViewHolder holder, DownloadItem download) {
        AbstractC25132j.m99054b(null, new SubjectListAdapter$refresh$1(download, holder, this, null), 1, null);
    }

    /* JADX INFO: renamed from: L1 */
    private final void m64437L1(BaseViewHolder holder, DownloadItem item) {
        holder.setText(R$id.tv_name, item.getName());
        int i11 = R$id.tv_size;
        Long size = item.getSize();
        holder.setText(i11, size != null ? AbstractC27615b.m107445a(size.longValue(), 1) : null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, DownloadItem item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        C26866a.a.m104898f(C26866a.f81698a, SubjectListFragment.INSTANCE.m64545a(), "convert 22 item " + item.getUrl(), false, 4, null);
        m64437L1(holder, item);
        m64436I1(holder, item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: F1, reason: merged with bridge method [inline-methods] */
    public void mo36108G(BaseViewHolder holder, DownloadItem item, List<? extends Object> payloads) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(payloads, "payloads");
        super.mo36108G(holder, item, payloads);
        C26866a.a.m104898f(C26866a.f81698a, SubjectListFragment.INSTANCE.m64545a(), "convert 11 item " + item.getUrl(), false, 4, null);
        m64436I1(holder, item);
    }

    /* JADX INFO: renamed from: H1, reason: from getter */
    public final InterfaceC14207a getOptionClickListener() {
        return this.optionClickListener;
    }

    /* JADX INFO: renamed from: J1 */
    public final void m64441J1(InterfaceC14207a listener) {
        Intrinsics.m97802h(listener, "listener");
        this.optionClickListener = listener;
    }

    /* JADX INFO: renamed from: K1 */
    public final void m64442K1(InterfaceC14207a interfaceC14207a) {
        this.optionClickListener = interfaceC14207a;
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
