package com.transsion.rewardscenter.task.member;

import android.widget.TextView;
import aq.C4698a;
import cn.C5144k;
import com.transsion.rewardscenterapi.MemberTaskItem;
import com.transsion.rewardscenterapi.TaskType;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p038bk.C4836b;

/* JADX INFO: renamed from: com.transsion.rewardscenter.task.member.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C17948k extends BaseTaskCommonProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17948k(C4698a config) {
        super(config);
        Intrinsics.m97802h(config, "config");
    }

    @Override // com.transsion.rewardscenter.task.member.BaseTaskCommonProvider
    /* JADX INFO: renamed from: D */
    public String mo76449D(MemberTaskItem item) {
        Intrinsics.m97802h(item, "item");
        Integer durationCondition = item.getDurationCondition();
        int iIntValue = (durationCondition != null ? durationCondition.intValue() : 0) / 60;
        int iH = RangesKt.m97938h(C5144k.f17646a.m24034I(), iIntValue);
        return item.getTitle() + " (" + iH + "/" + iIntValue + "mins)";
    }

    @Override // com.transsion.rewardscenter.task.member.BaseTaskCommonProvider
    /* JADX INFO: renamed from: F */
    public boolean mo76451F(MemberTaskItem memberTaskItem) {
        Integer status;
        Integer durationCondition;
        return (memberTaskItem == null || (status = memberTaskItem.getStatus()) == null || status.intValue() != 3) && C5144k.f17646a.m24034I() >= ((memberTaskItem == null || (durationCondition = memberTaskItem.getDurationCondition()) == null) ? 0 : durationCondition.intValue()) / 60;
    }

    @Override // com.transsion.rewardscenter.task.member.BaseTaskCommonProvider
    /* JADX INFO: renamed from: K */
    public void mo76453K(TextView button, MemberTaskItem item) {
        String jumpUrl;
        Intrinsics.m97802h(button, "button");
        Intrinsics.m97802h(item, "item");
        String jumpUrl2 = item.getJumpUrl();
        if (jumpUrl2 == null || jumpUrl2.length() == 0) {
            jumpUrl = "oneroom://com.community.oneroom?type=/main/tab&tabIndex=0";
        } else {
            jumpUrl = item.getJumpUrl();
            if (jumpUrl == null) {
                jumpUrl = "";
            }
        }
        C4836b.m23266d(C4836b.f17101a, m36338k(), jumpUrl, null, 4, null);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return TaskType.WATCH.getValue();
    }
}
