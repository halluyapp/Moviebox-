package com.transsion.rewardscenter.redeem;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import aq.C4698a;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.hisavana.sdk.common.util.AbstractC8117n0;
import com.cloud.tmc.integration.event.EventConstants;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$string;
import com.transsion.rewardscenter.R$drawable;
import com.transsion.rewardscenter.R$id;
import com.transsion.rewardscenter.R$layout;
import com.transsion.rewardscenter.R$mipmap;
import com.transsion.rewardscenter.utils.AbstractC18011f;
import com.transsion.rewardscenter.utils.AbstractC18021p;
import com.transsion.rewardscenter.utils.AbstractC18022q;
import com.transsion.rewardscenterapi.Lottery;
import com.transsion.rewardscenterapi.SkuPoint;
import com.transsion.rewardscenterapi.TopUpType;
import com.transsion.rewardscenterapi.User;
import java.math.BigDecimal;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import ng.AbstractC26006c;
import p743rh.C27287m;

/* JADX INFO: loaded from: classes6.dex */
public final class SkuItemProvider extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final C4698a f58698e;

    public SkuItemProvider(C4698a config) {
        Intrinsics.m97802h(config, "config");
        this.f58698e = config;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final Unit m76180B(boolean z11, SkuItemProvider skuItemProvider, AbstractC17875e abstractC17875e, SkuPoint skuPoint, View it) {
        Intrinsics.m97802h(it, "it");
        if (!z11) {
            return Unit.f75682a;
        }
        if (!C27287m.f83003a.m106330e()) {
            String string = skuItemProvider.m36338k().getString(R$string.no_network_toast);
            Intrinsics.m97801g(string, "getString(...)");
            AbstractC18021p.m76643a(false, string);
            return Unit.f75682a;
        }
        Lottery lottery = (Lottery) skuItemProvider.f58698e.m22756c().m76118p().m14847f();
        if (Intrinsics.m97797c(lottery != null ? lottery.getActivityId() : null, "0") || ((AbstractC17875e.b) abstractC17875e).m76192a()) {
            skuItemProvider.m76181C(skuPoint);
        } else {
            C4698a c4698a = skuItemProvider.f58698e;
            AbstractC18011f.m76637c(c4698a, TopUpType.REDEEM, c4698a.m22756c().m76114l());
        }
        skuItemProvider.m76182D(((AbstractC17875e.b) abstractC17875e).m76192a());
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: C */
    private final void m76181C(SkuPoint skuPoint) {
        String skuId = skuPoint.getSkuId();
        if (skuId == null || AbstractC25136k.m99058d(this.f58698e.m22755b(), null, null, new SkuItemProvider$redeem$1$1(this, skuId, null), 3, null) == null) {
            String string = m36338k().getString(com.transsion.rewardscenter.R$string.redeem_failed_tips);
            Intrinsics.m97801g(string, "getString(...)");
            AbstractC18021p.m76643a(false, string);
            Unit unit = Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: D */
    private final void m76182D(boolean z11) {
        HashMap map = new HashMap();
        map.put("has_paid", z11 ? "1" : "0");
        map.put(EventConstants.KEY_SOURCE, "sku");
        AbstractC18022q.m76644a("redeem_rewards", map);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final AbstractC17875e item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        if (item instanceof AbstractC17875e.b) {
            final SkuPoint skuPointM76193b = ((AbstractC17875e.b) item).m76193b();
            helper.setText(R$id.title, skuPointM76193b.getDescription());
            helper.setText(R$id.point, "-" + AbstractC8117n0.m37956a(new BigDecimal(String.valueOf(skuPointM76193b.getPrice()))).toPlainString());
            User userM76124w = this.f58698e.m22756c().m76124w();
            final boolean z11 = ((double) (userM76124w != null ? userM76124w.getPoint() : 0)) >= skuPointM76193b.getPrice();
            TextView textView = (TextView) helper.getView(R$id.action);
            if (z11) {
                textView.setEnabled(true);
                textView.setBackgroundResource(R$mipmap.ic_redeem_btn_bg_orange);
                textView.setBackgroundTintList(null);
                textView.setTextColor(m36338k().getColor(R$color.white));
            } else {
                textView.setEnabled(false);
                textView.setBackgroundResource(R$drawable.shape_r6_tint);
                textView.setBackgroundTintList(ColorStateList.valueOf(m36338k().getColor(com.transsion.rewardscenter.R$color.redeem_disable_bg)));
                textView.setTextColor(m36338k().getColor(R$color.white_80));
            }
            AbstractC26006c.m102050c(textView, 0L, new Function1() { // from class: com.transsion.rewardscenter.redeem.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SkuItemProvider.m76180B(z11, this, item, skuPointM76193b, (View) obj);
                }
            }, 1, null);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return RedeemType.SKU.getValue();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.redeem_sku_item;
    }
}
