package com.transsion.subtitle.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.os.AbstractC2411d;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.moviedetailapi.bean.DubsInfo;
import com.transsion.subtitle.R$string;
import com.transsion.subtitle.adapter.C19656a;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mu.InterfaceC25910b;
import p559ku.C25433c;
import p765s6.InterfaceC27566d;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0004J!\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, m97100d2 = {"Lcom/transsion/subtitle/fragment/AudioSelectListFragment;", "Lcom/transsion/subtitle/fragment/SubtitleBaseFragment;", "Lku/c;", "<init>", "()V", "", "Lcom/transsion/moviedetailapi/bean/DubsInfo;", "list", "Lcom/transsion/baselib/db/download/DownloadBean;", "downloadBean", "", "k0", "(Ljava/util/List;Lcom/transsion/baselib/db/download/DownloadBean;)V", "Landroid/view/LayoutInflater;", "inflater", "h0", "(Landroid/view/LayoutInflater;)Lku/c;", "lazyLoadData", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lmu/b;", "callback", "j0", "(Lmu/b;)V", "", "g", "Ljava/util/List;", "dataList", "h", "Lcom/transsion/baselib/db/download/DownloadBean;", "Lcom/transsion/subtitle/adapter/a;", "i", "Lcom/transsion/subtitle/adapter/a;", "listAdapter", "", "j", "I", "selectedPosition", CampaignEx.JSON_KEY_AD_K, "Lmu/b;", "mCallback", "l", "a", "VideoSubtitle_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class AudioSelectListFragment extends SubtitleBaseFragment<C25433c> {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private DownloadBean downloadBean;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private C19656a listAdapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private InterfaceC25910b mCallback;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private List dataList = new ArrayList();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int selectedPosition = -1;

    /* JADX INFO: renamed from: com.transsion.subtitle.fragment.AudioSelectListFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AudioSelectListFragment m82006a(List list, DownloadBean downloadBean, String str) {
            Intrinsics.m97802h(list, "list");
            AudioSelectListFragment audioSelectListFragment = new AudioSelectListFragment();
            audioSelectListFragment.m82003k0(list, downloadBean);
            audioSelectListFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("KEY_PAGE_NAME", str)));
            return audioSelectListFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final void m82002i0(AudioSelectListFragment audioSelectListFragment, C19656a c19656a, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        if (i11 == audioSelectListFragment.selectedPosition) {
            return;
        }
        DubsInfo dubsInfo = (DubsInfo) audioSelectListFragment.dataList.get(i11);
        int i12 = audioSelectListFragment.selectedPosition;
        if (i12 >= 0) {
            ((DubsInfo) audioSelectListFragment.dataList.get(i12)).setSelected(false);
            adapter.notifyItemChanged(audioSelectListFragment.selectedPosition);
        }
        audioSelectListFragment.selectedPosition = i11;
        dubsInfo.setSelected(true);
        adapter.notifyItemChanged(i11);
        C26866a.a aVar = C26866a.f81698a;
        String tag = audioSelectListFragment.getTAG();
        Intrinsics.m97801g(tag, "<get-TAG>(...)");
        aVar.m104912c(tag, "item select, " + dubsInfo.getLanName() + ", code = " + dubsInfo.getLanCode(), true);
        InterfaceC25910b interfaceC25910b = audioSelectListFragment.mCallback;
        if (interfaceC25910b != null) {
            interfaceC25910b.mo81906h(dubsInfo);
        }
        InterfaceC25910b interfaceC25910b2 = audioSelectListFragment.mCallback;
        if (interfaceC25910b2 != null) {
            String string = c19656a.getContext().getString(R$string.audio_switch_toast);
            Intrinsics.m97801g(string, "getString(...)");
            interfaceC25910b2.mo81901c(string);
        }
        audioSelectListFragment.m82013a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public final void m82003k0(List list, DownloadBean downloadBean) {
        this.downloadBean = downloadBean;
        this.dataList.clear();
        this.dataList.addAll(list);
        int size = this.dataList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((DubsInfo) this.dataList.get(i11)).getIsSelected()) {
                this.selectedPosition = i11;
                return;
            }
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public C25433c getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25433c c25433cM99999c = C25433c.m99999c(inflater);
        Intrinsics.m97801g(c25433cM99999c, "inflate(...)");
        return c25433cM99999c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        RecyclerView recyclerView;
        Intrinsics.m97802h(view, "view");
        final C19656a c19656a = new C19656a(this.dataList);
        c19656a.m36227w1(new InterfaceC27566d() { // from class: com.transsion.subtitle.fragment.a
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                AudioSelectListFragment.m82002i0(this.f62898a, c19656a, baseQuickAdapter, view2, i11);
            }
        });
        this.listAdapter = c19656a;
        C25433c c25433c = (C25433c) getMViewBinding();
        if (c25433c == null || (recyclerView = c25433c.f77028b) == null) {
            return;
        }
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.listAdapter);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m82005j0(InterfaceC25910b callback) {
        this.mCallback = callback;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }
}
