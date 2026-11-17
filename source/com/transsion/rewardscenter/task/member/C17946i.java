package com.transsion.rewardscenter.task.member;

import android.widget.TextView;
import aq.C4698a;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.rewardscenter.R$id;
import com.transsion.rewardscenterapi.MemberTaskItem;
import com.transsion.rewardscenterapi.TaskType;
import kotlin.jvm.internal.Intrinsics;
import p038bk.C4836b;

/* JADX INFO: renamed from: com.transsion.rewardscenter.task.member.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C17946i extends BaseTaskCommonProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17946i(C4698a config) {
        super(config);
        Intrinsics.m97802h(config, "config");
    }

    @Override // com.transsion.rewardscenter.task.member.BaseTaskCommonProvider
    /* JADX INFO: renamed from: D */
    public String mo76449D(MemberTaskItem item) {
        Intrinsics.m97802h(item, "item");
        return String.valueOf(item.getTitle());
    }

    @Override // com.transsion.rewardscenter.task.member.BaseTaskCommonProvider
    /* JADX INFO: renamed from: F */
    public boolean mo76451F(MemberTaskItem memberTaskItem) {
        return false;
    }

    @Override // com.transsion.rewardscenter.task.member.BaseTaskCommonProvider
    /* JADX INFO: renamed from: G */
    public void mo76452G() {
    }

    @Override // com.transsion.rewardscenter.task.member.BaseTaskCommonProvider
    /* JADX INFO: renamed from: K */
    public void mo76453K(TextView button, MemberTaskItem item) {
        String jumpUrl;
        Intrinsics.m97802h(button, "button");
        Intrinsics.m97802h(item, "item");
        String jumpUrl2 = item.getJumpUrl();
        if (jumpUrl2 == null || jumpUrl2.length() == 0) {
            jumpUrl = "https://h5-aoneroom.com/spa/fissionh5/pp";
        } else {
            jumpUrl = item.getJumpUrl();
            if (jumpUrl == null) {
                jumpUrl = "";
            }
        }
        C4836b.m23266d(C4836b.f17101a, m36338k(), "oneroom://com.community.oneroom?type=/web/web&url=" + jumpUrl, null, 4, null);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return TaskType.PALM_PAY.getValue();
    }

    @Override // com.transsion.rewardscenter.task.member.BaseTaskCommonProvider, com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z */
    public void mo22757b(BaseViewHolder helper, MemberTaskItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        super.mo22757b(helper, item);
        TextView textView = (TextView) helper.getView(R$id.member_item_task_button);
        item.setStatus(0);
        mo76450E(textView, item);
    }
}
