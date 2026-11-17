package com.transsion.usercenter.p321me.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ck.AbstractC5114k;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.baselib.kids.KidsAccountManager;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.kids.AccountSwitchDialog;
import com.transsion.usercenter.kids.CreateKidsProfileDialog;
import com.transsion.usercenter.p321me.C20606k;
import com.transsion.usercenter.profile.bean.MeItemInfo;
import com.transsion.usercenter.profile.bean.MineNoticeConfig;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;

/* JADX INFO: renamed from: com.transsion.usercenter.me.adapter.r */
/* JADX INFO: loaded from: classes7.dex */
public final class C20588r extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final String f65031e = "open_account";

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Unit m85054A(MineNoticeConfig mineNoticeConfig, C20588r c20588r, View it) {
        String lowerCase;
        Intrinsics.m97802h(it, "it");
        String noticeDeepLink = mineNoticeConfig.getNoticeDeepLink();
        if (noticeDeepLink == null || noticeDeepLink.length() == 0) {
            return Unit.f75682a;
        }
        C20606k.f65059a.m85071b("notice");
        String noticeDeepLink2 = mineNoticeConfig.getNoticeDeepLink();
        if (noticeDeepLink2 != null) {
            lowerCase = noticeDeepLink2.toLowerCase(Locale.ROOT);
            Intrinsics.m97801g(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (Intrinsics.m97797c(lowerCase, c20588r.f65031e)) {
            String strM65180e = KidsAccountManager.f50883a.m65180e();
            if (strM65180e == null || strM65180e.length() == 0) {
                CreateKidsProfileDialog.Companion.m84693b(CreateKidsProfileDialog.INSTANCE, false, false, false, 7, null).m61941X(c20588r.m36338k(), "CreateKidsProfileDialog");
            } else {
                AccountSwitchDialog.Companion.m84672b(AccountSwitchDialog.INSTANCE, false, 1, null).m61941X(c20588r.m36338k(), "AccountSwitchDialog");
            }
        } else {
            String noticeDeepLink3 = mineNoticeConfig.getNoticeDeepLink();
            if (noticeDeepLink3 != null) {
                AbstractC5114k.m23925h(noticeDeepLink3, null, 1, null);
            }
        }
        return Unit.f75682a;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 8;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.mine_item_notice_layout;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, MeItemInfo item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        Object data = item.getData();
        final MineNoticeConfig mineNoticeConfig = data instanceof MineNoticeConfig ? (MineNoticeConfig) data : null;
        if (mineNoticeConfig == null) {
            return;
        }
        View itemView = helper.itemView;
        Intrinsics.m97801g(itemView, "itemView");
        itemView.setVisibility(mineNoticeConfig.getNoticeEnable() ? 0 : 8);
        ((TextView) helper.getView(R$id.titleTv)).setText(mineNoticeConfig.getNoticeContent());
        ImageView imageView = (ImageView) helper.getView(R$id.arrowIV);
        String noticeDeepLink = mineNoticeConfig.getNoticeDeepLink();
        if (noticeDeepLink == null || noticeDeepLink.length() == 0) {
            AbstractC26006c.m102054g(imageView);
        } else {
            AbstractC26006c.m102058k(imageView);
        }
        View itemView2 = helper.itemView;
        Intrinsics.m97801g(itemView2, "itemView");
        AbstractC26006c.m102050c(itemView2, 0L, new Function1() { // from class: com.transsion.usercenter.me.adapter.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C20588r.m85054A(mineNoticeConfig, this, (View) obj);
            }
        }, 1, null);
    }
}
