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
import com.transsion.rewardscenter.model.RewardsCenterModel;
import com.transsion.rewardscenter.utils.AbstractC18021p;
import com.transsion.rewardscenter.utils.AbstractC18022q;
import com.transsion.rewardscenterapi.DrawChance;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p743rh.C27287m;

/* JADX INFO: renamed from: com.transsion.rewardscenter.prize.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C17861b extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final C4698a f58669e;

    /* JADX INFO: renamed from: com.transsion.rewardscenter.prize.b$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f58670a;

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
            f58670a = iArr;
        }
    }

    public C17861b(C4698a config) {
        Intrinsics.m97802h(config, "config");
        this.f58669e = config;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Unit m76144A(boolean z11, Context context, C17861b c17861b, boolean z12, View it) {
        Intrinsics.m97802h(it, "it");
        if (z11) {
            if (C27287m.f83003a.m106330e()) {
                RewardsCenterModel.m76102h(c17861b.f58669e.m22756c(), null, true, 1, null);
                c17861b.m76145D();
            } else {
                String string = context.getString(R$string.no_network_toast);
                Intrinsics.m97801g(string, "getString(...)");
                AbstractC18021p.m76643a(false, string);
            }
        } else if (z12) {
            String string2 = context.getString(com.transsion.rewardscenter.R$string.prize_limit_tips);
            Intrinsics.m97801g(string2, "getString(...)");
            AbstractC18021p.m76643a(false, string2);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: D */
    private final void m76145D() {
        HashMap map = new HashMap();
        map.put(EventConstants.KEY_SOURCE, "draw_chance");
        AbstractC18022q.m76644a("prize_list", map);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m76147B(DrawChance drawChance) {
        Intrinsics.m97802h(drawChance, "drawChance");
        return drawChance.getRemain() > 0 && drawChance.getTodayRemain() > 0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m76148C(DrawChance drawChance) {
        Intrinsics.m97802h(drawChance, "drawChance");
        return drawChance.getTodayRemain() <= 0;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PrizeItemType.DRAW_CHANCE.getValue();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.prize_row_item;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, AbstractC17864e item) {
        int i11;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        if (item instanceof AbstractC17864e.a) {
            DrawChance drawChanceM76153a = ((AbstractC17864e.a) item).m76153a();
            final Context context = helper.itemView.getContext();
            C23860f.a aVar = C23860f.f72909a;
            Intrinsics.m97799e(context);
            aVar.m94457m(context).m94468g(drawChanceM76153a.getImgUrl()).m94465d((ImageView) helper.getView(R$id.icon));
            int i12 = R$id.tv_title;
            String title = drawChanceM76153a.getTitle();
            if (title == null) {
                title = "";
            }
            helper.setText(i12, title);
            helper.setText(R$id.tv_count, "x " + drawChanceM76153a.getRemain());
            TextView textView = (TextView) helper.getView(R$id.btn_action);
            final boolean zM76147B = m76147B(drawChanceM76153a);
            final boolean zM76148C = m76148C(drawChanceM76153a);
            PrizeButtonState prizeButtonState = zM76147B ? PrizeButtonState.ACTIVE : PrizeButtonState.CLAIMED;
            if (zM76147B) {
                i11 = com.transsion.rewardscenter.R$string.prize_btn_claim;
            } else {
                i11 = zM76148C ? com.transsion.rewardscenter.R$string.prize_btn_limit : com.transsion.rewardscenter.R$string.prize_btn_claimed;
            }
            textView.setText(context.getString(i11));
            int i13 = a.f58670a[prizeButtonState.ordinal()];
            if (i13 == 1) {
                textView.setBackgroundResource(R$mipmap.btn_claim_normal);
                textView.setTextColor(context.getColor(R$color.white));
                textView.setEnabled(true);
            } else if (i13 == 2) {
                textView.setBackgroundResource(R$mipmap.btn_claim_done);
                textView.setTextColor(context.getColor(com.transsion.rewardscenter.R$color.prize_btn_claimed_text));
                textView.setEnabled(false);
            }
            AbstractC26006c.m102050c(textView, 0L, new Function1() { // from class: com.transsion.rewardscenter.prize.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C17861b.m76144A(zM76147B, context, this, zM76148C, (View) obj);
                }
            }, 1, null);
        }
    }
}
