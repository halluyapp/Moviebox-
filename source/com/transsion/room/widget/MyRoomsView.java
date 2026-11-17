package com.transsion.room.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.room.R$layout;
import com.transsion.room.adapter.YourRoomsAdapter;
import com.transsion.room.helper.C18189l;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import gq.C23648j0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mg.C25824a;
import ng.AbstractC26006c;
import p765s6.InterfaceC27566d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m97100d2 = {"Lcom/transsion/room/widget/MyRoomsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "res", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsion/moviedetailapi/bean/RoomItem;", WebConstants.FIELD_ITEM, RequestParameters.POSITION, "", "n", "(Lcom/transsion/moviedetailapi/bean/RoomItem;I)V", CampaignEx.JSON_KEY_AD_K, "m", "()V", "", "dataList", "setList", "(Ljava/util/List;)V", "", "getDataList", "()Ljava/util/List;", "Lgq/j0;", "a", "Lgq/j0;", "viewBinding", "Lcom/transsion/room/adapter/YourRoomsAdapter;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/room/adapter/YourRoomsAdapter;", "mAdapter", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class MyRoomsView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23648j0 viewBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private YourRoomsAdapter mAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyRoomsView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyRoomsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyRoomsView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        YourRoomsAdapter yourRoomsAdapter = new YourRoomsAdapter();
        yourRoomsAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.room.widget.a
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i12) {
                MyRoomsView.m77494l(this.f59615a, baseQuickAdapter, view, i12);
            }
        });
        this.mAdapter = yourRoomsAdapter;
        View.inflate(getContext(), R$layout.view_your_rooms, this);
        C23648j0 c23648j0M93546a = C23648j0.m93546a(this);
        Intrinsics.m97801g(c23648j0M93546a, "bind(...)");
        this.viewBinding = c23648j0M93546a;
        RecyclerView recyclerView = c23648j0M93546a.f72225b;
        recyclerView.setLayoutManager(new NpaGridLayoutManager(recyclerView.getContext(), 4));
        recyclerView.addItemDecoration(new C25824a(AbstractC23384a.m92908b(8), 0, 0, 0));
        recyclerView.setAdapter(this.mAdapter);
        c23648j0M93546a.f72226c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.widget.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyRoomsView.m77492j(this.f59616a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m77492j(MyRoomsView myRoomsView, View view) {
        myRoomsView.m77495m();
    }

    /* JADX INFO: renamed from: k */
    private final void m77493k(RoomItem item, int position) {
        if (item != null) {
            item.setNewPostCount(0L);
        }
        this.mAdapter.notifyItemChanged(position, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m77494l(MyRoomsView myRoomsView, BaseQuickAdapter adapter, View v11, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(v11, "v");
        if (C14557c.f51100a.m65671a(v11.getId(), 500L)) {
            return;
        }
        Object item = adapter.getItem(i11);
        RoomItem roomItem = item instanceof RoomItem ? (RoomItem) item : null;
        if (roomItem == null) {
            return;
        }
        myRoomsView.m77496n(roomItem, i11);
    }

    /* JADX INFO: renamed from: m */
    private final void m77495m() {
        C18189l.f59333a.m77093a("room_home");
        Navigator.m61845x(TheRouter.m61773c("/room/list").m61852F("index", 0), getContext(), null, 2, null);
    }

    /* JADX INFO: renamed from: n */
    private final void m77496n(RoomItem item, int position) {
        C18189l.f59333a.m77094b("room_home", item);
        Navigator.m61845x(TheRouter.m61773c("/room/detail").m61857K("id", item.getGroupId()), getContext(), null, 2, null);
        m77493k(item, position);
    }

    public final List<RoomItem> getDataList() {
        return this.mAdapter.getData();
    }

    public final void setList(List<RoomItem> dataList) {
        Intrinsics.m97802h(dataList, "dataList");
        if (dataList.size() > 4) {
            AppCompatTextView tvMore = this.viewBinding.f72226c;
            Intrinsics.m97801g(tvMore, "tvMore");
            AbstractC26006c.m102058k(tvMore);
            dataList = dataList.subList(0, 4);
        } else {
            AppCompatTextView tvMore2 = this.viewBinding.f72226c;
            Intrinsics.m97801g(tvMore2, "tvMore");
            AbstractC26006c.m102054g(tvMore2);
        }
        this.mAdapter.mo36201n1(dataList);
    }
}
