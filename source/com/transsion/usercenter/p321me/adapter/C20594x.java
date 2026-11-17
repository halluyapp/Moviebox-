package com.transsion.usercenter.p321me.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.LiveData;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.tmc.integration.event.EventConstants;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$string;
import com.transsion.usercenter.profile.bean.MeItemInfo;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p329cq.InterfaceC22763a;

/* JADX INFO: renamed from: com.transsion.usercenter.me.adapter.x */
/* JADX INFO: loaded from: classes7.dex */
public final class C20594x extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final C20585o f65043e;

    /* JADX INFO: renamed from: f */
    private long f65044f;

    /* JADX INFO: renamed from: g */
    private LiveData f65045g;

    /* JADX INFO: renamed from: com.transsion.usercenter.me.adapter.x$a */
    static final class a implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65046a;

        a(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65046a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65046a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3189c0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m97797c(mo6065a(), ((FunctionAdapter) obj).mo6065a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6065a().hashCode();
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f65046a.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20594x() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C20594x(C20585o c20585o) {
        this.f65043e = c20585o;
    }

    public /* synthetic */ C20594x(C20585o c20585o, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : c20585o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final Unit m85065B(TextView textView, TextView textView2, C20594x c20594x, Integer num) {
        if (num.intValue() > 0) {
            textView.setVisibility(0);
            textView.setText(num.toString());
            textView2.setText(c20594x.m36338k().getString(R$string.unclaimed_rewards, num));
        } else {
            textView.setVisibility(8);
            textView2.setText("Win big Prizes!");
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final Unit m85066C(C20594x c20594x, MeItemInfo meItemInfo, View it) {
        Function1<MeItemInfo, Unit> function1M85049Q1;
        Intrinsics.m97802h(it, "it");
        Navigator.m61845x(TheRouter.m61773c("/rewards/center").m61857K(EventConstants.KEY_SOURCE, "PROFILE_DETAIL"), null, null, 3, null);
        C20585o c20585o = c20594x.f65043e;
        if (c20585o != null && (function1M85049Q1 = c20585o.m85049Q1()) != null) {
            function1M85049Q1.invoke(meItemInfo);
        }
        return Unit.f75682a;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final MeItemInfo item) {
        InterfaceC22763a interfaceC22763a;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        Context contextM36338k = m36338k();
        BaseActivity baseActivity = contextM36338k instanceof BaseActivity ? (BaseActivity) contextM36338k : null;
        if (baseActivity != null && (interfaceC22763a = (InterfaceC22763a) TheRouter.m61774d(InterfaceC22763a.class, new Object[0])) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f65045g == null || jCurrentTimeMillis - this.f65044f >= 30000) {
                this.f65044f = jCurrentTimeMillis;
                this.f65045g = interfaceC22763a.mo76084b();
            }
            final TextView textView = (TextView) helper.getView(R$id.badgeTv);
            final TextView textView2 = (TextView) helper.getView(R$id.desTv);
            LiveData liveData = this.f65045g;
            if (liveData != null) {
                liveData.m14851j(baseActivity, new a(new Function1() { // from class: com.transsion.usercenter.me.adapter.v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C20594x.m85065B(textView, textView2, this, (Integer) obj);
                    }
                }));
            }
        }
        View itemView = helper.itemView;
        Intrinsics.m97801g(itemView, "itemView");
        AbstractC26006c.m102050c(itemView, 0L, new Function1() { // from class: com.transsion.usercenter.me.adapter.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C20594x.m85066C(this.f65041a, item, (View) obj);
            }
        }, 1, null);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 11;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.mine_item_rewards_center_layout;
    }
}
