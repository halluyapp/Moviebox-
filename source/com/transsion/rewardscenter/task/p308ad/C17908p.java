package com.transsion.rewardscenter.task.p308ad;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.rewardscenter.R$id;
import com.transsion.rewardscenter.R$layout;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.rewardscenter.task.ad.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C17908p extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final MemberTaskAdHelper f58801e;

    /* JADX INFO: renamed from: f */
    private boolean f58802f;

    /* JADX INFO: renamed from: g */
    private final int f58803g = AdTaskType.REWARD_AD.getValue();

    /* JADX INFO: renamed from: h */
    private final int f58804h = R$layout.member_task_reward_layout;

    public C17908p(MemberTaskAdHelper memberTaskAdHelper) {
        this.f58801e = memberTaskAdHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m76319B(C17908p c17908p, View view) {
        c17908p.m76321D(true);
        MemberTaskAdHelper memberTaskAdHelper = c17908p.f58801e;
        if (memberTaskAdHelper != null) {
            memberTaskAdHelper.m76256Y(new Function1() { // from class: com.transsion.rewardscenter.task.ad.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C17908p.m76320C(((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final Unit m76320C(boolean z11) {
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: D */
    private final void m76321D(boolean z11) {
        HashMap map = new HashMap();
        map.put("module_name", "member_ad_task_reward");
        if (z11) {
            C24662i.f75350a.m96881p("MemberAdTask", map);
        } else {
            C24662i.f75350a.m96872D("MemberAdTask", map);
        }
    }

    /* JADX INFO: renamed from: E */
    static /* synthetic */ void m76322E(C17908p c17908p, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c17908p.m76321D(z11);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, AbstractC17914v item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        if (item instanceof AbstractC17914v.b) {
            View viewFindViewById = helper.itemView.findViewById(R$id.reward_action);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.rewardscenter.task.ad.n
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C17908p.m76319B(this.f58800a, view);
                    }
                });
            }
            if (this.f58802f) {
                return;
            }
            this.f58802f = true;
            m76322E(this, false, 1, null);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return this.f58803g;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return this.f58804h;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: r */
    public BaseViewHolder mo36342r(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(mo22759m(), parent, false);
        Intrinsics.m97799e(viewInflate);
        return new BaseViewHolder(viewInflate);
    }
}
