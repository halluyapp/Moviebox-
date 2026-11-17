package com.transsion.rewardscenter.task.member;

import android.widget.TextView;
import aq.C4698a;
import com.transsion.rewardscenterapi.MemberTaskItem;
import com.transsion.rewardscenterapi.TaskType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.rewardscenter.task.member.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C17945h extends BaseTaskCommonProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17945h(C4698a config) {
        super(config);
        Intrinsics.m97802h(config, "config");
    }

    @Override // com.transsion.rewardscenter.task.member.BaseTaskCommonProvider
    /* JADX INFO: renamed from: E */
    public void mo76450E(TextView button, MemberTaskItem item) {
        Intrinsics.m97802h(button, "button");
        Intrinsics.m97802h(item, "item");
        super.mo76450E(button, item);
        button.setAlpha(0.5f);
    }

    @Override // com.transsion.rewardscenter.task.member.BaseTaskCommonProvider
    /* JADX INFO: renamed from: K */
    public void mo76453K(TextView button, MemberTaskItem item) {
        Intrinsics.m97802h(button, "button");
        Intrinsics.m97802h(item, "item");
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return TaskType.OPEN_APP.getValue();
    }
}
