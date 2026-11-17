package com.transsion.shorttv.p315ui.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.base.widget.C18799m;
import com.transsion.shorttv.bean.BannerData;
import com.transsion.shorttv.bean.CustomData;
import com.transsion.shorttv.bean.OperateItem;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.p315ui.adapter.ShortTvOpCustomAdapter;
import com.transsion.shorttv.utils.AbstractC19166i;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import es.C23218a;
import is.AbstractC24222c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p550kj.C24662i;
import p765s6.InterfaceC27566d;
import ps.C26948b;
import rs.C27355n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010B1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0011B;\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, m97100d2 = {"Lcom/transsion/shorttv/ui/widget/ShortTvOpCustomView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "pageName", "Lcom/transsion/shorttv/bean/OperateItem;", WebConstants.FIELD_ITEM, "", "tabId", "", "isTablet", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Ljava/lang/String;Lcom/transsion/shorttv/bean/OperateItem;IZLandroid/content/Context;Landroid/util/AttributeSet;I)V", "(Ljava/lang/String;Lcom/transsion/shorttv/bean/OperateItem;IZLandroid/content/Context;)V", "(Ljava/lang/String;Lcom/transsion/shorttv/bean/OperateItem;IZLandroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/transsion/shorttv/bean/BannerData;", "bannerData", "", "l", "(Lcom/transsion/shorttv/bean/BannerData;)V", RequestParameters.POSITION, "operateItem", CampaignEx.JSON_KEY_AD_K, "(Lcom/transsion/shorttv/bean/BannerData;ILcom/transsion/shorttv/bean/OperateItem;)V", "j", "(Lcom/transsion/shorttv/bean/OperateItem;)V", "updateData", "a", "Ljava/lang/String;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/shorttv/bean/OperateItem;", "c", "I", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Z", "Lrs/n0;", "e", "Lrs/n0;", "viewBinding", "Lcom/transsion/shorttv/ui/adapter/ShortTvOpCustomAdapter;", "f", "Lcom/transsion/shorttv/ui/adapter/ShortTvOpCustomAdapter;", "mAdapter", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTvOpCustomView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String pageName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final OperateItem item;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int tabId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isTablet;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C27355n0 viewBinding;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private ShortTvOpCustomAdapter mAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTvOpCustomView(String pageName, OperateItem item, int i11, boolean z11, Context context) {
        this(pageName, item, i11, z11, context, null);
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTvOpCustomView(String pageName, OperateItem item, int i11, boolean z11, Context context, AttributeSet attributeSet) {
        this(pageName, item, i11, z11, context, attributeSet, 0);
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTvOpCustomView(String pageName, OperateItem item, int i11, boolean z11, Context context, AttributeSet attributeSet, int i12) {
        List<BannerData> items;
        List<BannerData> items2;
        super(context, attributeSet, i12);
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(context, "context");
        this.pageName = pageName;
        this.item = item;
        this.tabId = i11;
        this.isTablet = z11;
        View.inflate(context, R$layout.short_tv_op_custom, this);
        C27355n0 c27355n0M106481a = C27355n0.m106481a(this);
        Intrinsics.m97801g(c27355n0M106481a, "bind(...)");
        this.viewBinding = c27355n0M106481a;
        c27355n0M106481a.f83277c.setText(item.getTitle());
        RecyclerView subOperationVariableRecycle = c27355n0M106481a.f83276b;
        Intrinsics.m97801g(subOperationVariableRecycle, "subOperationVariableRecycle");
        CustomData customData = item.getCustomData();
        CustomData customData2 = item.getCustomData();
        ShortTvOpCustomAdapter shortTvOpCustomAdapter = new ShortTvOpCustomAdapter(0, pageName, customData, (customData2 == null || (items2 = customData2.getItems()) == null) ? null : items2.get(0), z11, 1, null);
        this.mAdapter = shortTvOpCustomAdapter;
        subOperationVariableRecycle.setAdapter(shortTvOpCustomAdapter);
        subOperationVariableRecycle.setLayoutManager(new LinearLayoutManager(context, 0, false));
        if (subOperationVariableRecycle.getItemDecorationCount() == 0) {
            subOperationVariableRecycle.addItemDecoration(new C18799m(8.0f, 0.0f, 12.0f, 2, null));
        }
        CustomData customData3 = item.getCustomData();
        shortTvOpCustomAdapter.mo36201n1((customData3 == null || (items = customData3.getItems()) == null) ? new ArrayList<>() : items);
        shortTvOpCustomAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.shorttv.ui.widget.q
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i13) {
                ShortTvOpCustomView.m80056i(this.f61528a, baseQuickAdapter, view, i13);
            }
        });
        ShortTvOpCustomAdapter shortTvOpCustomAdapter2 = this.mAdapter;
        if (shortTvOpCustomAdapter2 != null) {
            shortTvOpCustomAdapter2.m79544D1(item);
        }
        m80057j(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m80056i(ShortTvOpCustomView shortTvOpCustomView, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        List<BannerData> items;
        BannerData bannerData;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        CustomData customData = shortTvOpCustomView.item.getCustomData();
        if (customData == null || (items = customData.getItems()) == null || (bannerData = items.get(i11)) == null) {
            return;
        }
        shortTvOpCustomView.m80059l(bannerData);
        shortTvOpCustomView.m80058k(bannerData, i11, shortTvOpCustomView.item);
    }

    /* JADX INFO: renamed from: j */
    private final void m80057j(OperateItem item) {
        String title;
        String opId;
        HashMap map = new HashMap();
        map.put("event_type", "browse_custom");
        String str = "";
        if (item == null || (title = item.getTitle()) == null) {
            title = "";
        }
        map.put(CampaignEx.JSON_KEY_TITLE, title);
        if (item != null && (opId = item.getOpId()) != null) {
            str = opId;
        }
        map.put("opId", str);
        if (item != null) {
            AbstractC19166i.m80244a(item, map);
        }
        C26948b.f81854a.m105081a();
        C24662i.f75350a.m96872D(this.pageName, map);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX INFO: renamed from: k */
    private final void m80058k(BannerData item, int position, OperateItem operateItem) {
        Subject subject;
        String ops;
        String ops2;
        HashMap map = new HashMap();
        map.put("event_type", "click_custom_item");
        map.put("sequence", String.valueOf(position));
        if (item != null && (ops2 = item.getOps()) != null) {
            if (ops2.length() <= 0) {
                ops2 = null;
            }
            if (ops2 == null) {
                if (item != null) {
                    if (ops.length() <= 0) {
                        ops = null;
                    }
                    if (ops != null) {
                        map.put("ops", ops);
                        Unit unit = Unit.f75682a;
                    }
                }
            }
        } else if (item != null && (subject = item.getSubject()) != null && (ops = subject.getOps()) != null) {
            if (ops.length() <= 0) {
                ops = null;
            }
            if (ops != null) {
                map.put("ops", ops);
                Unit unit2 = Unit.f75682a;
            }
        }
        map.put("sequence", String.valueOf(position));
        CustomData customData = operateItem.getCustomData();
        map.put("rowCount", String.valueOf(customData != null ? Integer.valueOf(customData.getRowCount()) : null));
        if (item != null) {
            AbstractC19166i.m80245b(item, map);
        }
        AbstractC19166i.m80244a(operateItem, map);
        C26948b.f81854a.m105081a();
        C24662i.f75350a.m96881p(this.pageName, map);
    }

    /* JADX INFO: renamed from: l */
    private final void m80059l(BannerData bannerData) {
        String deepLink = bannerData.getDeepLink();
        if (deepLink != null) {
            Uri uriM92277a = C23218a.f70760a.m92277a(Uri.parse(deepLink + "&module_name=opt_custom&ops=" + bannerData.getOps()));
            if (uriM92277a != null) {
                AbstractC24222c.m95245j(uriM92277a);
            }
        }
    }

    public final void updateData(OperateItem item) {
        List<BannerData> items;
        Intrinsics.m97802h(item, "item");
        ShortTvOpCustomAdapter shortTvOpCustomAdapter = this.mAdapter;
        if (shortTvOpCustomAdapter != null) {
            shortTvOpCustomAdapter.m79544D1(item);
        }
        this.viewBinding.f83277c.setText(item.getTitle());
        ShortTvOpCustomAdapter shortTvOpCustomAdapter2 = this.mAdapter;
        if (shortTvOpCustomAdapter2 != null) {
            CustomData customData = item.getCustomData();
            shortTvOpCustomAdapter2.mo36201n1((customData == null || (items = customData.getItems()) == null) ? new ArrayList<>() : items);
        }
    }
}
