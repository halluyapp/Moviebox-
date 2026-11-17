package com.transsion.rewardscenter.task.p308ad;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.rewardscenter.R$layout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.rewardscenter.task.ad.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C17911s extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f58811e = AdTaskType.TITLE.getValue();

    /* JADX INFO: renamed from: f */
    private final int f58812f = R$layout.member_task_title_item;

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return this.f58811e;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return this.f58812f;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: r */
    public BaseViewHolder mo36342r(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(mo22759m(), parent, false);
        Intrinsics.m97799e(viewInflate);
        return new BaseViewHolder(viewInflate);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, AbstractC17914v item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
    }
}
