package com.transsion.rewardscenter.prize;

import android.content.Context;
import android.view.View;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.baseui.R$drawable;
import com.transsion.rewardscenter.R$id;
import com.transsion.rewardscenter.R$layout;
import com.transsion.rewardscenter.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;

/* JADX INFO: renamed from: com.transsion.rewardscenter.prize.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C17863d extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final Function0 f58672e;

    public C17863d(Function0 onToggle) {
        Intrinsics.m97802h(onToggle, "onToggle");
        this.f58672e = onToggle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Unit m76150A(C17863d c17863d, View it) {
        Intrinsics.m97802h(it, "it");
        c17863d.f58672e.invoke();
        return Unit.f75682a;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PrizeItemType.FOOTER.getValue();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.prize_footer_item;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, AbstractC17864e item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        if (item instanceof AbstractC17864e.b) {
            Context context = helper.itemView.getContext();
            if (((AbstractC17864e.b) item).m76154a()) {
                helper.setText(R$id.tv_toggle, context.getString(R$string.prize_hide));
                helper.setImageResource(R$id.iv_arrow, R$drawable.ic_arrow_up);
            } else {
                helper.setText(R$id.tv_toggle, context.getString(R$string.prize_view_more));
                helper.setImageResource(R$id.iv_arrow, R$drawable.ic_arrow_down);
            }
            View itemView = helper.itemView;
            Intrinsics.m97801g(itemView, "itemView");
            AbstractC26006c.m102050c(itemView, 0L, new Function1() { // from class: com.transsion.rewardscenter.prize.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C17863d.m76150A(this.f58671a, (View) obj);
                }
            }, 1, null);
        }
    }
}
