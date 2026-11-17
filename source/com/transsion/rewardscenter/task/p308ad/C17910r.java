package com.transsion.rewardscenter.task.p308ad;

import android.view.View;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.rewardscenter.R$layout;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.rewardscenter.task.ad.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C17910r extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final BaseStageTaskAdHelper f58807e;

    /* JADX INFO: renamed from: f */
    private boolean f58808f;

    /* JADX INFO: renamed from: g */
    private final int f58809g = AdTaskType.STAGE_AD.getValue();

    /* JADX INFO: renamed from: h */
    private final int f58810h = R$layout.member_task_stage_item_layout;

    public C17910r(BaseStageTaskAdHelper baseStageTaskAdHelper) {
        this.f58807e = baseStageTaskAdHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Unit m76326A(C17910r c17910r, AbstractC17914v abstractC17914v, AbstractC17914v.c it) {
        Intrinsics.m97802h(it, "it");
        c17910r.m76327B((AbstractC17914v.c) abstractC17914v);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: B */
    private final void m76327B(AbstractC17914v.c cVar) {
        HashMap map = new HashMap();
        map.put("module_name", "member_ad_task_stage");
        map.put("ad_state", cVar.m76375e().name());
        C24662i.f75350a.m96881p("MemberAdTask", map);
    }

    /* JADX INFO: renamed from: C */
    private final void m76328C() {
        HashMap map = new HashMap();
        map.put("module_name", "member_ad_task_stage");
        C24662i.f75350a.m96872D("MemberAdTask", map);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return this.f58809g;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return this.f58810h;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final AbstractC17914v item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        if (item instanceof AbstractC17914v.c) {
            View view = helper.itemView;
            Intrinsics.m97800f(view, "null cannot be cast to non-null type com.transsion.rewardscenter.task.ad.StageTaskAdView");
            StageTaskAdView stageTaskAdView = (StageTaskAdView) view;
            stageTaskAdView.setAdHelper(this.f58807e);
            stageTaskAdView.setData((AbstractC17914v.c) item);
            stageTaskAdView.setClickCallback(new Function1() { // from class: com.transsion.rewardscenter.task.ad.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C17910r.m76326A(this.f58805a, item, (AbstractC17914v.c) obj);
                }
            });
            if (this.f58808f) {
                return;
            }
            this.f58808f = true;
            m76328C();
        }
    }
}
