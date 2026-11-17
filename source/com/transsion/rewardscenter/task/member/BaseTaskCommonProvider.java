package com.transsion.rewardscenter.task.member;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import aq.C4698a;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.util.C14557c;
import com.transsion.rewardscenter.R$id;
import com.transsion.rewardscenter.R$layout;
import com.transsion.rewardscenter.R$mipmap;
import com.transsion.rewardscenter.R$string;
import com.transsion.rewardscenter.p309ui.RewardsCenterFragment;
import com.transsion.rewardscenterapi.MemberTaskItem;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p462hj.C23860f;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseTaskCommonProvider extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final C4698a f58880e;

    /* JADX INFO: renamed from: f */
    private final int f58881f;

    /* JADX INFO: renamed from: g */
    private boolean f58882g;

    public BaseTaskCommonProvider(C4698a config) {
        Intrinsics.m97802h(config, "config");
        this.f58880e = config;
        this.f58881f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m76442A(BaseTaskCommonProvider baseTaskCommonProvider, MemberTaskItem memberTaskItem, View view) {
        if (C14557c.f51100a.m65671a(R$id.member_item_task_button, 2000L)) {
            return;
        }
        if (baseTaskCommonProvider.mo76451F(memberTaskItem)) {
            baseTaskCommonProvider.m76446J(memberTaskItem);
        } else {
            Intrinsics.m97800f(view, "null cannot be cast to non-null type android.widget.TextView");
            baseTaskCommonProvider.mo76453K((TextView) view, memberTaskItem);
        }
        baseTaskCommonProvider.m76445I(memberTaskItem);
    }

    /* JADX INFO: renamed from: C */
    private final int m76443C() {
        Locale locale = Locale.getDefault();
        Intrinsics.m97801g(locale, "getDefault(...)");
        return TextUtils.getLayoutDirectionFromLocale(locale) == 1 ? GravityCompat.END : GravityCompat.START;
    }

    /* JADX INFO: renamed from: H */
    private final void m76444H(MemberTaskItem memberTaskItem) {
        HashMap map = new HashMap();
        map.put("event_type", "task_browse");
        String taskId = memberTaskItem.getTaskId();
        if (taskId == null) {
            taskId = "";
        }
        map.put("taskId", taskId);
        map.put("taskSubType", String.valueOf(memberTaskItem.getTaskSubType()));
        map.put("rewardType", String.valueOf(memberTaskItem.getRewardType()));
        map.put("rewardAmount", String.valueOf(memberTaskItem.getRewardAmount()));
        map.put("showClaim", String.valueOf(this.f58882g));
        C14450a.f50860a.m65138a("rewards_center", map);
    }

    /* JADX INFO: renamed from: I */
    private final void m76445I(MemberTaskItem memberTaskItem) {
        HashMap map = new HashMap();
        map.put("event_type", "task_click");
        String taskId = memberTaskItem.getTaskId();
        if (taskId == null) {
            taskId = "";
        }
        map.put("taskId", taskId);
        map.put("taskSubType", String.valueOf(memberTaskItem.getTaskSubType()));
        map.put("rewardType", String.valueOf(memberTaskItem.getRewardType()));
        map.put("rewardAmount", String.valueOf(memberTaskItem.getRewardAmount()));
        map.put("showClaim", String.valueOf(this.f58882g));
        C14450a.f50860a.m65139b("rewards_center", map);
    }

    /* JADX INFO: renamed from: J */
    private final void m76446J(MemberTaskItem memberTaskItem) {
        RewardsCenterFragment rewardsCenterFragment = (RewardsCenterFragment) this.f58880e.m22754a().get();
        if (rewardsCenterFragment != null) {
            rewardsCenterFragment.showLoading();
        }
        AbstractC25136k.m99058d(this.f58880e.m22755b(), null, null, new BaseTaskCommonProvider$startClaim$1(memberTaskItem, this, null), 3, null);
    }

    /* JADX INFO: renamed from: B */
    protected final C4698a m76448B() {
        return this.f58880e;
    }

    /* JADX INFO: renamed from: D */
    public String mo76449D(MemberTaskItem item) {
        Intrinsics.m97802h(item, "item");
        String title = item.getTitle();
        return title == null ? "" : title;
    }

    /* JADX INFO: renamed from: E */
    public void mo76450E(TextView button, MemberTaskItem item) {
        Intrinsics.m97802h(button, "button");
        Intrinsics.m97802h(item, "item");
        this.f58882g = mo76451F(item);
        Integer status = item.getStatus();
        if (status != null && status.intValue() == 3) {
            button.setText(m36338k().getString(R$string.claimed));
            button.setEnabled(false);
            button.setAlpha(0.5f);
        } else if (this.f58882g) {
            button.setText(button.getContext().getString(R$string.claim));
            button.setEnabled(true);
            button.setAlpha(1.0f);
        } else {
            button.setText(item.getButtonName());
            button.setEnabled(true);
            button.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean mo76451F(MemberTaskItem memberTaskItem) {
        return false;
    }

    /* JADX INFO: renamed from: G */
    public void mo76452G() {
    }

    /* JADX INFO: renamed from: K */
    public abstract void mo76453K(TextView textView, MemberTaskItem memberTaskItem);

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_task_common;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final MemberTaskItem item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        ImageView imageView = (ImageView) helper.getView(R$id.icon);
        C23860f.a aVar = C23860f.f72909a;
        Context context = imageView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        aVar.m94457m(context).m94468g(item.getIcon()).m94470i(R$mipmap.ic_earn_points).m94465d(imageView);
        int i11 = R$id.member_item_task_points_icon;
        Integer rewardType = item.getRewardType();
        helper.setImageResource(i11, (rewardType != null && rewardType.intValue() == this.f58881f) ? R$mipmap.ic_member_small : R$mipmap.ic_points);
        helper.setText(R$id.member_item_task_points_text, "+" + item.getRewardAmount() + " points");
        TextView textView = (TextView) helper.getView(R$id.member_item_task_title);
        textView.setText(mo76449D(item));
        textView.setGravity(m76443C());
        TextView textView2 = (TextView) helper.getView(R$id.member_item_task_button);
        mo76450E(textView2, item);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.rewardscenter.task.member.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseTaskCommonProvider.m76442A(this.f58885a, item, view);
            }
        });
        m76444H(item);
    }
}
