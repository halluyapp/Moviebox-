package com.transsion.rewardscenter.prize;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import aq.C4698a;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.tmc.integration.event.EventConstants;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$string;
import com.transsion.rewardscenter.R$id;
import com.transsion.rewardscenter.R$layout;
import com.transsion.rewardscenter.R$mipmap;
import com.transsion.rewardscenter.p309ui.RewardsCenterFragment;
import com.transsion.rewardscenter.utils.AbstractC18021p;
import com.transsion.rewardscenter.utils.AbstractC18022q;
import com.transsion.rewardscenterapi.DrawResult;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p743rh.C27287m;

/* JADX INFO: renamed from: com.transsion.rewardscenter.prize.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C17870k extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final C4698a f58693e;

    /* JADX INFO: renamed from: com.transsion.rewardscenter.prize.k$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f58694a;

        static {
            int[] iArr = new int[PrizeButtonState.values().length];
            try {
                iArr[PrizeButtonState.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrizeButtonState.CLAIMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrizeButtonState.CLAIMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f58694a = iArr;
        }
    }

    public C17870k(C4698a config) {
        Intrinsics.m97802h(config, "config");
        this.f58693e = config;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Unit m76165A(PrizeButtonState prizeButtonState, Context context, C17870k c17870k, DrawResult drawResult, View it) {
        Intrinsics.m97802h(it, "it");
        if (prizeButtonState == PrizeButtonState.ACTIVE) {
            if (C27287m.f83003a.m106330e()) {
                RewardsCenterFragment rewardsCenterFragment = (RewardsCenterFragment) c17870k.f58693e.m22754a().get();
                if (rewardsCenterFragment != null) {
                    rewardsCenterFragment.m76596k1(drawResult);
                }
                c17870k.m76167C(drawResult);
            } else {
                String string = context.getString(R$string.no_network_toast);
                Intrinsics.m97801g(string, "getString(...)");
                AbstractC18021p.m76643a(false, string);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: B */
    private final PrizeButtonState m76166B(DrawResult drawResult) {
        if (Intrinsics.m97797c(drawResult.getClaimStatus(), "CLAIM_STATUS_TOP_UP")) {
            return PrizeButtonState.CLAIMING;
        }
        if (Intrinsics.m97797c(drawResult.getClaimStatus(), "CLAIM_STATUS_UNCLAIM") && Intrinsics.m97797c(drawResult.getNeedFill(), "LOTTERY_NEED_FILL_YES") && Intrinsics.m97797c(drawResult.getFillStatus(), "FILL_STATUS_NO")) {
            return PrizeButtonState.ACTIVE;
        }
        return (Intrinsics.m97797c(drawResult.getClaimStatus(), "CLAIM_STATUS_UNCLAIM") && Intrinsics.m97797c(drawResult.getNeedFill(), "LOTTERY_NEED_FILL_NO")) ? PrizeButtonState.ACTIVE : PrizeButtonState.CLAIMED;
    }

    /* JADX INFO: renamed from: C */
    private final void m76167C(DrawResult drawResult) {
        HashMap map = new HashMap();
        String prizeType = drawResult.getPrizeType();
        if (prizeType == null) {
            prizeType = "";
        }
        map.put(EventConstants.KEY_SOURCE, prizeType);
        AbstractC18022q.m76644a("prize_list", map);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PrizeItemType.ROW.getValue();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.prize_row_item;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, AbstractC17864e item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        if (item instanceof AbstractC17864e.c) {
            final DrawResult drawResultM76155a = ((AbstractC17864e.c) item).m76155a();
            final Context context = helper.itemView.getContext();
            C23860f.a aVar = C23860f.f72909a;
            Intrinsics.m97799e(context);
            aVar.m94457m(context).m94468g(drawResultM76155a.getImgUrl()).m94465d((ImageView) helper.getView(R$id.icon));
            int i11 = R$id.tv_title;
            String title = drawResultM76155a.getTitle();
            if (title == null) {
                title = "";
            }
            helper.setText(i11, title);
            helper.setText(R$id.tv_count, "x 1");
            TextView textView = (TextView) helper.getView(R$id.btn_action);
            final PrizeButtonState prizeButtonStateM76166B = m76166B(drawResultM76155a);
            int i12 = a.f58694a[prizeButtonStateM76166B.ordinal()];
            if (i12 == 1) {
                textView.setBackgroundResource(R$mipmap.btn_claim_normal);
                textView.setText(context.getString(com.transsion.rewardscenter.R$string.prize_btn_claim));
                textView.setTextColor(context.getColor(R$color.white));
                textView.setEnabled(true);
                textView.setAlpha(1.0f);
            } else if (i12 == 2) {
                textView.setBackgroundResource(R$mipmap.btn_claim_done);
                textView.setText(context.getString(com.transsion.rewardscenter.R$string.prize_btn_claimed));
                textView.setTextColor(context.getColor(com.transsion.rewardscenter.R$color.prize_btn_claimed_text));
                textView.setEnabled(false);
                textView.setAlpha(1.0f);
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textView.setBackgroundResource(R$mipmap.btn_claim_normal);
                textView.setText(context.getString(com.transsion.rewardscenter.R$string.prize_btn_Topping));
                textView.setTextColor(context.getColor(R$color.white));
                textView.setEnabled(false);
                textView.setAlpha(0.5f);
            }
            AbstractC26006c.m102050c(textView, 0L, new Function1() { // from class: com.transsion.rewardscenter.prize.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C17870k.m76165A(prizeButtonStateM76166B, context, this, drawResultM76155a, (View) obj);
                }
            }, 1, null);
        }
    }
}
