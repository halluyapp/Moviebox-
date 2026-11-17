package com.transsion.usercenter.p321me.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ck.AbstractC5114k;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p282tn.lib.widget.R$mipmap;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.p321me.C20606k;
import com.transsion.usercenter.profile.bean.ButtonInfo;
import com.transsion.usercenter.profile.bean.MeItemInfo;
import com.transsion.usercenter.profile.bean.ZeroInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p462hj.C23860f;

/* JADX INFO: renamed from: com.transsion.usercenter.me.adapter.f0 */
/* JADX INFO: loaded from: classes7.dex */
public final class C20576f0 extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final C20585o f64999e;

    /* JADX WARN: Multi-variable type inference failed */
    public C20576f0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C20576f0(C20585o c20585o) {
        this.f64999e = c20585o;
    }

    public /* synthetic */ C20576f0(C20585o c20585o, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : c20585o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Unit m85027A(ButtonInfo buttonInfo, C20576f0 c20576f0, MeItemInfo meItemInfo, View it) {
        Function1<MeItemInfo, Unit> function1M85049Q1;
        String link;
        Intrinsics.m97802h(it, "it");
        if (buttonInfo != null && (link = buttonInfo.getLink()) != null) {
            AbstractC5114k.m23925h(link, null, 1, null);
        }
        C20606k.f65059a.m85071b("free_buy");
        C20585o c20585o = c20576f0.f64999e;
        if (c20585o != null && (function1M85049Q1 = c20585o.m85049Q1()) != null) {
            function1M85049Q1.invoke(meItemInfo);
        }
        return Unit.f75682a;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 3;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.mine_item_vip_layout;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final MeItemInfo item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        Object data = item.getData();
        ZeroInfo zeroInfo = data instanceof ZeroInfo ? (ZeroInfo) data : null;
        if (zeroInfo == null) {
            return;
        }
        final ButtonInfo button = zeroInfo.getButton();
        View itemView = helper.itemView;
        Intrinsics.m97801g(itemView, "itemView");
        AbstractC26006c.m102050c(itemView, 0L, new Function1() { // from class: com.transsion.usercenter.me.adapter.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C20576f0.m85027A(button, this, item, (View) obj);
            }
        }, 1, null);
        ((TextView) helper.getView(R$id.titleTv)).setText(zeroInfo.getTitle());
        TextView textView = (TextView) helper.getView(R$id.desTv);
        textView.setText(zeroInfo.getSubtitle());
        String subtitle = zeroInfo.getSubtitle();
        textView.setVisibility(!(subtitle == null || subtitle.length() == 0) ? 0 : 8);
        C23860f.f72909a.m94457m(m36338k()).m94468g(zeroInfo.getIconUrl()).m94470i(R$mipmap.ic_point_purchase).m94465d((ImageView) helper.getView(R$id.icIV));
        TextView textView2 = (TextView) helper.getView(R$id.btnTv);
        View view = helper.getView(R$id.arrowIV);
        textView2.setVisibility(8);
        view.setVisibility(8);
        if (zeroInfo.getShowButton()) {
            String type = button != null ? button.getType() : null;
            if (Intrinsics.m97797c(type, "TEXT")) {
                textView2.setText(button.getText());
                textView2.setVisibility(0);
            } else if (Intrinsics.m97797c(type, "ARROW")) {
                view.setVisibility(0);
            }
        }
    }
}
