package com.transsion.usercenter.p321me.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p282tn.lib.widget.R$mipmap;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.memberapi.MemberInfo;
import com.transsion.memberapi.MembershipDetailType;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$string;
import com.transsion.usercenter.p321me.C20606k;
import com.transsion.usercenter.profile.bean.MeItemInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.usercenter.me.adapter.d0 */
/* JADX INFO: loaded from: classes7.dex */
public final class C20572d0 extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final C20585o f64991e;

    /* JADX INFO: renamed from: f */
    private TextView f64992f;

    /* JADX INFO: renamed from: g */
    private TextView f64993g;

    /* JADX INFO: renamed from: h */
    private TextView f64994h;

    /* JADX INFO: renamed from: com.transsion.usercenter.me.adapter.d0$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64995a;

        static {
            int[] iArr = new int[MembershipDetailType.values().length];
            try {
                iArr[MembershipDetailType.TRIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MembershipDetailType.SUBSCRIPTION_MEMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MembershipDetailType.FINANCIAL_MEMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MembershipDetailType.EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f64995a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20572d0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C20572d0(C20585o c20585o) {
        this.f64991e = c20585o;
    }

    public /* synthetic */ C20572d0(C20585o c20585o, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : c20585o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final Unit m85022B(BaseViewHolder baseViewHolder, C20572d0 c20572d0, MeItemInfo meItemInfo, View it) {
        Function1<MeItemInfo, Unit> function1M85049Q1;
        Intrinsics.m97802h(it, "it");
        C20606k.f65059a.m85071b("member");
        Navigator.m61845x(TheRouter.m61773c("/member/MemberActivity"), baseViewHolder.itemView.getContext(), null, 2, null);
        C20585o c20585o = c20572d0.f64991e;
        if (c20585o != null && (function1M85049Q1 = c20585o.m85049Q1()) != null) {
            function1M85049Q1.invoke(meItemInfo);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: z */
    private final void m85024z(MemberInfo memberInfo) {
        Integer daysLeft;
        int daysLeft2 = 0;
        C26866a.a.m104899g(C26866a.f81698a, "member detail is " + memberInfo, false, 2, null);
        int point = memberInfo != null ? memberInfo.getPoint() : 0;
        if (memberInfo != null) {
            try {
                daysLeft = memberInfo.getDaysLeft();
            } catch (Throwable unused) {
            }
        } else {
            daysLeft = null;
        }
        if (daysLeft != null) {
            daysLeft2 = memberInfo.getDaysLeft();
        }
        int i11 = a.f64995a[(memberInfo != null ? MembershipDetailType.INSTANCE.m70139a(memberInfo) : MembershipDetailType.GUEST).ordinal()];
        if (i11 == 1) {
            TextView textView = this.f64992f;
            if (textView != null) {
                textView.setText(m36338k().getString(R$string.user_premium_free_trial));
            }
            TextView textView2 = this.f64993g;
            if (textView2 != null) {
                textView2.setText(m36338k().getString(R$string.user_days_left, daysLeft2));
            }
            m85026C(point);
            return;
        }
        if (i11 == 2 || i11 == 3) {
            TextView textView3 = this.f64992f;
            if (textView3 != null) {
                textView3.setText(m36338k().getString(R$string.user_premium));
            }
            TextView textView4 = this.f64993g;
            if (textView4 != null) {
                textView4.setText(m36338k().getString(R$string.user_date_left, daysLeft2, memberInfo != null ? memberInfo.getExpiryDate() : null));
            }
            m85026C(point);
            return;
        }
        if (i11 == 4) {
            TextView textView5 = this.f64992f;
            if (textView5 != null) {
                textView5.setText(m36338k().getString(R$string.user_premium_get));
            }
            TextView textView6 = this.f64993g;
            if (textView6 != null) {
                textView6.setText(m36338k().getString(R$string.user_premium_redeem_tips));
            }
            m85026C(point);
            return;
        }
        TextView textView7 = this.f64992f;
        if (textView7 != null) {
            textView7.setText(m36338k().getString(R$string.user_premium_get));
        }
        if (point > 0) {
            TextView textView8 = this.f64993g;
            if (textView8 != null) {
                textView8.setText(m36338k().getString(R$string.user_premium_redeem_tips));
            }
            m85026C(point);
            return;
        }
        TextView textView9 = this.f64993g;
        if (textView9 != null) {
            textView9.setText(m36338k().getString(R$string.user_premium_purchase_tips));
        }
        m85026C(-1);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo22757b(final BaseViewHolder helper, final MeItemInfo item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        Object data = item.getData();
        MemberInfo memberInfo = data instanceof MemberInfo ? (MemberInfo) data : null;
        if (memberInfo == null) {
            return;
        }
        View itemView = helper.itemView;
        Intrinsics.m97801g(itemView, "itemView");
        AbstractC26006c.m102050c(itemView, 0L, new Function1() { // from class: com.transsion.usercenter.me.adapter.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C20572d0.m85022B(helper, this, item, (View) obj);
            }
        }, 1, null);
        ((ImageView) helper.getView(R$id.icIV)).setImageResource(R$mipmap.ic_vip_20);
        this.f64992f = (TextView) helper.getView(R$id.titleTv);
        this.f64993g = (TextView) helper.getView(R$id.desTv);
        this.f64994h = (TextView) helper.getView(R$id.btnTv);
        m85024z(memberInfo);
    }

    /* JADX INFO: renamed from: C */
    public final void m85026C(int i11) {
        TextView textView = this.f64994h;
        if (textView != null) {
            if (i11 > 0) {
                textView.setText(i11 > 999 ? "999+" : String.valueOf(i11));
                textView.setCompoundDrawablesWithIntrinsicBounds(R$mipmap.ic_poins_new, 0, 0, 0);
            }
            textView.setVisibility(i11 > 0 ? 0 : 8);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 2;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.mine_item_vip_layout;
    }
}
