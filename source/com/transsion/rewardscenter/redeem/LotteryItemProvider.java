package com.transsion.rewardscenter.redeem;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import aq.C4698a;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.tmc.integration.event.EventConstants;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$string;
import com.transsion.rewardscenter.R$drawable;
import com.transsion.rewardscenter.R$id;
import com.transsion.rewardscenter.R$layout;
import com.transsion.rewardscenter.R$mipmap;
import com.transsion.rewardscenter.p309ui.RewardsCenterFragment;
import com.transsion.rewardscenter.utils.AbstractC18011f;
import com.transsion.rewardscenter.utils.AbstractC18021p;
import com.transsion.rewardscenter.utils.AbstractC18022q;
import com.transsion.rewardscenterapi.LotteryPrize;
import com.transsion.rewardscenterapi.TopUpType;
import com.transsion.rewardscenterapi.User;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p743rh.C27287m;

/* JADX INFO: loaded from: classes6.dex */
public final class LotteryItemProvider extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final C4698a f58695e;

    public LotteryItemProvider(C4698a config) {
        Intrinsics.m97802h(config, "config");
        this.f58695e = config;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final Unit m76170B(boolean z11, LotteryItemProvider lotteryItemProvider, AbstractC17875e abstractC17875e, LotteryPrize lotteryPrize, View it) {
        Intrinsics.m97802h(it, "it");
        if (!z11) {
            return Unit.f75682a;
        }
        if (!C27287m.f83003a.m106330e()) {
            String string = lotteryItemProvider.m36338k().getString(R$string.no_network_toast);
            Intrinsics.m97801g(string, "getString(...)");
            AbstractC18021p.m76643a(false, string);
            return Unit.f75682a;
        }
        AbstractC17875e.a aVar = (AbstractC17875e.a) abstractC17875e;
        if (aVar.m76190a()) {
            RewardsCenterFragment rewardsCenterFragment = (RewardsCenterFragment) lotteryItemProvider.f58695e.m22754a().get();
            if (rewardsCenterFragment != null) {
                rewardsCenterFragment.showLoading();
            }
            String activityId = lotteryPrize.getActivityId();
            if (activityId == null || AbstractC25136k.m99058d(lotteryItemProvider.f58695e.m22755b(), null, null, new LotteryItemProvider$convert$1$1$1(activityId, lotteryItemProvider, null), 3, null) == null) {
                lotteryItemProvider.f58695e.m22756c().m76117o().mo14855n(Boolean.FALSE);
                String string2 = lotteryItemProvider.m36338k().getString(com.transsion.rewardscenter.R$string.redeem_failed_tips);
                Intrinsics.m97801g(string2, "getString(...)");
                AbstractC18021p.m76643a(false, string2);
                Unit unit = Unit.f75682a;
            }
        } else {
            C4698a c4698a = lotteryItemProvider.f58695e;
            AbstractC18011f.m76637c(c4698a, TopUpType.REDEEM, c4698a.m22756c().m76114l());
            Unit unit2 = Unit.f75682a;
        }
        lotteryItemProvider.m76171C(aVar.m76190a());
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: C */
    private final void m76171C(boolean z11) {
        HashMap map = new HashMap();
        map.put("has_paid", z11 ? "1" : "0");
        map.put(EventConstants.KEY_SOURCE, "lottery");
        AbstractC18022q.m76644a("redeem_rewards", map);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final AbstractC17875e item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        if (item instanceof AbstractC17875e.a) {
            AbstractC17875e.a aVar = (AbstractC17875e.a) item;
            final LotteryPrize lotteryPrizeM76191b = aVar.m76191b();
            helper.setText(R$id.title, lotteryPrizeM76191b.getPrizeName());
            helper.setText(R$id.point, "-" + lotteryPrizeM76191b.getPointCost());
            ImageView imageView = (ImageView) helper.getView(R$id.icon);
            C23860f.a aVar2 = C23860f.f72909a;
            Context context = imageView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            aVar2.m94457m(context).m94468g(aVar.m76191b().getPrizeUrl()).m94470i(R$mipmap.ic_redeem_lottery).m94465d(imageView);
            User userM76124w = this.f58695e.m22756c().m76124w();
            final boolean z11 = (userM76124w != null ? userM76124w.getPoint() : 0) >= lotteryPrizeM76191b.getPointCost();
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
            AbstractC26006c.m102050c(textView, 0L, new Function1() { // from class: com.transsion.rewardscenter.redeem.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LotteryItemProvider.m76170B(z11, this, item, lotteryPrizeM76191b, (View) obj);
                }
            }, 1, null);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return RedeemType.LOTTERY.getValue();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.redeem_lottery_item;
    }
}
