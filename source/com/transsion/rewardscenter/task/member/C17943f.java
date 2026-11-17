package com.transsion.rewardscenter.task.member;

import android.widget.TextView;
import aq.C4698a;
import cn.C5144k;
import com.p282tn.lib.widget.R$string;
import com.transsion.member.C15886w;
import com.transsion.rewardscenterapi.MemberTaskItem;
import com.transsion.rewardscenterapi.TaskType;
import kotlin.jvm.internal.Intrinsics;
import p038bk.C4836b;
import p944yh.C28951b;

/* JADX INFO: renamed from: com.transsion.rewardscenter.task.member.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C17943f extends BaseTaskCommonProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17943f(C4698a config) {
        super(config);
        Intrinsics.m97802h(config, "config");
    }

    @Override // com.transsion.rewardscenter.task.member.BaseTaskCommonProvider
    /* JADX INFO: renamed from: F */
    public boolean mo76451F(MemberTaskItem memberTaskItem) {
        Integer status;
        return (memberTaskItem == null || (status = memberTaskItem.getStatus()) == null || status.intValue() != 3) && C5144k.f17646a.m24030C() > 0;
    }

    @Override // com.transsion.rewardscenter.task.member.BaseTaskCommonProvider
    /* JADX INFO: renamed from: G */
    public void mo76452G() {
        C5144k.f17646a.m24044v();
        C15886w.f54411a.m70116b().putLong("kv_game_download_app_claim_item", System.currentTimeMillis());
    }

    @Override // com.transsion.rewardscenter.task.member.BaseTaskCommonProvider
    /* JADX INFO: renamed from: K */
    public void mo76453K(TextView button, MemberTaskItem item) {
        String jumpUrl;
        Intrinsics.m97802h(button, "button");
        Intrinsics.m97802h(item, "item");
        long jCurrentTimeMillis = System.currentTimeMillis() - C15886w.f54411a.m70116b().getLong("kv_game_download_app_claim_item", 0L);
        Integer timeInterval = item.getTimeInterval();
        if (jCurrentTimeMillis <= (timeInterval != null ? timeInterval.intValue() : 0) * 1000) {
            C28951b.f88586a.m111455e(m36338k().getString(R$string.try_again));
            return;
        }
        String jumpUrl2 = item.getJumpUrl();
        if (jumpUrl2 == null || jumpUrl2.length() == 0) {
            jumpUrl = "oneroom://com.community.oneroom?type=/main/tab&bottomTab=home&topTab=Game";
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
        return TaskType.GAME_RES_APP_DOWNLOAD.getValue();
    }
}
