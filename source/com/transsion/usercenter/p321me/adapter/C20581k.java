package com.transsion.usercenter.p321me.adapter;

import android.os.Bundle;
import android.support.v4.media.session.AbstractC0190c;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ck.AbstractC5114k;
import ck.C5110g;
import ck.C5118o;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.tmc.integration.event.EventConstants;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.kids.KidsAccountManager;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.InterfaceC16246g;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.kids.AccountSwitchDialog;
import com.transsion.usercenter.kids.CreateKidsProfileDialog;
import com.transsion.usercenter.kids.PinInputDialog;
import com.transsion.usercenter.p321me.C20606k;
import com.transsion.usercenter.profile.ProfileSubjectListViewModel;
import com.transsion.usercenter.profile.bean.IconItemInfo;
import com.transsion.usercenter.profile.bean.MeItemInfo;
import com.transsion.version.update.UpdateManager;
import com.transsnet.loginapi.bean.UserInfo;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p415fq.InterfaceC23413d;
import p441gz.InterfaceC23704a;

/* JADX INFO: renamed from: com.transsion.usercenter.me.adapter.k */
/* JADX INFO: loaded from: classes7.dex */
public final class C20581k extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final C20585o f65005e;

    /* JADX INFO: renamed from: f */
    private final Lazy f65006f;

    /* JADX INFO: renamed from: g */
    private final Lazy f65007g;

    /* JADX INFO: renamed from: h */
    private final Lazy f65008h;

    /* JADX WARN: Multi-variable type inference failed */
    public C20581k() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C20581k(C20585o c20585o) {
        this.f65005e = c20585o;
        this.f65006f = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.me.adapter.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C20581k.m85038J();
            }
        });
        this.f65007g = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.me.adapter.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                C20581k.m85032C();
                return null;
            }
        });
        this.f65008h = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.me.adapter.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C20581k.m85037I();
            }
        });
    }

    public /* synthetic */ C20581k(C20585o c20585o, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : c20585o);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ InterfaceC23413d m85032C() {
        m85036H();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    /* JADX WARN: Code duplicated, block: B:60:0x0137  */
    /* JADX WARN: Code duplicated, block: B:62:0x013d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: E */
    public static final Unit m85033E(IconItemInfo iconItemInfo, C20581k c20581k, BaseViewHolder baseViewHolder, MeItemInfo meItemInfo, View it) {
        String deepLink;
        Function1<MeItemInfo, Unit> function1M85049Q1;
        Bundle bundle;
        InterfaceC23704a interfaceC23704aM85034F;
        InterfaceC16246g interfaceC16246gM85035G;
        UserInfo userInfoMo90386h;
        InterfaceC23704a interfaceC23704aM85034F2;
        Intrinsics.m97802h(it, "it");
        if (iconItemInfo.getCheckLogin() && ((interfaceC23704aM85034F2 = c20581k.m85034F()) == null || !interfaceC23704aM85034F2.mo90379a())) {
            InterfaceC23704a interfaceC23704aM85034F3 = c20581k.m85034F();
            if (interfaceC23704aM85034F3 != null) {
                interfaceC23704aM85034F3.mo90387i(c20581k.m36338k());
            }
            return Unit.f75682a;
        }
        String moduleName = iconItemInfo.getModuleName();
        if (moduleName != null) {
            C20606k.f65059a.m85071b(moduleName);
        }
        String deepLink2 = iconItemInfo.getDeepLink();
        String userId = null;
        if (deepLink2 != null) {
            switch (deepLink2.hashCode()) {
                case -2037279396:
                    if (!deepLink2.equals("post_list_type")) {
                        deepLink = iconItemInfo.getDeepLink();
                        if (deepLink != null) {
                            AbstractC5114k.m23925h(deepLink, null, 1, null);
                        }
                    } else if (C5110g.f17601a.m23911b()) {
                        bundle = new Bundle();
                        bundle.putInt(EventConstants.KEY_SOURCE, !Intrinsics.m97797c(iconItemInfo.getDeepLink(), "post_list_type") ? 1 : 0);
                        interfaceC23704aM85034F = c20581k.m85034F();
                        if (interfaceC23704aM85034F != null && (userInfoMo90386h = interfaceC23704aM85034F.mo90386h()) != null) {
                            userId = userInfoMo90386h.getUserId();
                        }
                        bundle.putString("userId", userId);
                        interfaceC16246gM85035G = c20581k.m85035G();
                        if (interfaceC16246gM85035G != null) {
                            interfaceC16246gM85035G.mo71005b(c20581k.m36338k(), bundle, ProfileSubjectListViewModel.class, iconItemInfo.getTitle());
                        }
                    } else if (Intrinsics.m97797c(iconItemInfo.getDeepLink(), "post_list_type")) {
                        new Bundle();
                        Navigator.m61845x(TheRouter.m61773c("/ugc/likes"), baseViewHolder.itemView.getContext(), null, 2, null);
                    } else {
                        Navigator.m61845x(TheRouter.m61773c("/postdetail/favorite"), baseViewHolder.itemView.getContext(), null, 2, null);
                    }
                    break;
                case -1499034234:
                    if (!deepLink2.equals("subscribe_list_type")) {
                        deepLink = iconItemInfo.getDeepLink();
                        if (deepLink != null) {
                            AbstractC5114k.m23925h(deepLink, null, 1, null);
                        }
                    } else {
                        Navigator.m61845x(TheRouter.m61773c("/subscription/my_subscription"), baseViewHolder.itemView.getContext(), null, 2, null);
                    }
                    break;
                case 1085848142:
                    if (!deepLink2.equals("parental_pin_type")) {
                        deepLink = iconItemInfo.getDeepLink();
                        if (deepLink != null) {
                            AbstractC5114k.m23925h(deepLink, null, 1, null);
                        }
                    } else {
                        c20581k.m85039K();
                    }
                    break;
                case 1211088224:
                    if (!deepLink2.equals("study_mode_type")) {
                        deepLink = iconItemInfo.getDeepLink();
                        if (deepLink != null) {
                            AbstractC5114k.m23925h(deepLink, null, 1, null);
                        }
                    } else {
                        String strM65180e = KidsAccountManager.f50883a.m65180e();
                        if (strM65180e == null || strM65180e.length() == 0) {
                            CreateKidsProfileDialog.Companion.m84693b(CreateKidsProfileDialog.INSTANCE, false, false, false, 7, null).m61941X(c20581k.m36338k(), "CreateKidsProfileDialog");
                        } else {
                            AccountSwitchDialog.Companion.m84672b(AccountSwitchDialog.INSTANCE, false, 1, null).m61941X(c20581k.m36338k(), "AccountSwitchDialog");
                        }
                    }
                    break;
                case 1897178003:
                    if (!deepLink2.equals("like_list_type")) {
                        deepLink = iconItemInfo.getDeepLink();
                        if (deepLink != null) {
                            AbstractC5114k.m23925h(deepLink, null, 1, null);
                        }
                    } else if (C5110g.f17601a.m23911b()) {
                        bundle = new Bundle();
                        bundle.putInt(EventConstants.KEY_SOURCE, !Intrinsics.m97797c(iconItemInfo.getDeepLink(), "post_list_type") ? 1 : 0);
                        interfaceC23704aM85034F = c20581k.m85034F();
                        if (interfaceC23704aM85034F != null) {
                            userId = userInfoMo90386h.getUserId();
                        }
                        bundle.putString("userId", userId);
                        interfaceC16246gM85035G = c20581k.m85035G();
                        if (interfaceC16246gM85035G != null) {
                            interfaceC16246gM85035G.mo71005b(c20581k.m36338k(), bundle, ProfileSubjectListViewModel.class, iconItemInfo.getTitle());
                        }
                    } else if (Intrinsics.m97797c(iconItemInfo.getDeepLink(), "post_list_type")) {
                        new Bundle();
                        Navigator.m61845x(TheRouter.m61773c("/ugc/likes"), baseViewHolder.itemView.getContext(), null, 2, null);
                    } else {
                        Navigator.m61845x(TheRouter.m61773c("/postdetail/favorite"), baseViewHolder.itemView.getContext(), null, 2, null);
                    }
                    break;
                default:
                    deepLink = iconItemInfo.getDeepLink();
                    if (deepLink != null) {
                        AbstractC5114k.m23925h(deepLink, null, 1, null);
                    }
                    break;
            }
        } else {
            deepLink = iconItemInfo.getDeepLink();
            if (deepLink != null) {
                AbstractC5114k.m23925h(deepLink, null, 1, null);
            }
        }
        C20585o c20585o = c20581k.f65005e;
        if (c20585o != null && (function1M85049Q1 = c20585o.m85049Q1()) != null) {
            function1M85049Q1.invoke(meItemInfo);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: F */
    private final InterfaceC23704a m85034F() {
        return (InterfaceC23704a) this.f65008h.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final InterfaceC16246g m85035G() {
        return (InterfaceC16246g) this.f65006f.getValue();
    }

    /* JADX INFO: renamed from: H */
    private static final InterfaceC23413d m85036H() {
        AbstractC0190c.m883a(TheRouter.m61774d(InterfaceC23413d.class, new Object[0]));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final InterfaceC23704a m85037I() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final InterfaceC16246g m85038J() {
        return (InterfaceC16246g) TheRouter.m61774d(InterfaceC16246g.class, new Object[0]);
    }

    /* JADX INFO: renamed from: K */
    private final void m85039K() {
        KidsAccountManager kidsAccountManager = KidsAccountManager.f50883a;
        final String strM65180e = kidsAccountManager.m65180e();
        if (strM65180e == null) {
            strM65180e = "";
        }
        if (kidsAccountManager.m65183i()) {
            Navigator.m61845x(TheRouter.m61773c("/kids/pin_management").m61857K("arg_kids_id", strM65180e), null, null, 3, null);
        } else {
            PinInputDialog.Companion.m84761b(PinInputDialog.INSTANCE, false, new Function1() { // from class: com.transsion.usercenter.me.adapter.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C20581k.m85040L(strM65180e, (String) obj);
                }
            }, null, 5, null).m61941X(m36338k(), "PinInputDialog");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final Unit m85040L(String str, String pin) {
        Intrinsics.m97802h(pin, "pin");
        KidsAccountManager.f50883a.m65189p(pin);
        Navigator.m61845x(TheRouter.m61773c("/kids/pin_management").m61857K("arg_kids_id", str), null, null, 3, null);
        return Unit.f75682a;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void mo22757b(final BaseViewHolder helper, final MeItemInfo item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        Object data = item.getData();
        final IconItemInfo iconItemInfo = data instanceof IconItemInfo ? (IconItemInfo) data : null;
        if (iconItemInfo == null) {
            return;
        }
        View itemView = helper.itemView;
        Intrinsics.m97801g(itemView, "itemView");
        AbstractC26006c.m102050c(itemView, 0L, new Function1() { // from class: com.transsion.usercenter.me.adapter.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C20581k.m85033E(iconItemInfo, this, helper, item, (View) obj);
            }
        }, 1, null);
        ((TextView) helper.getView(R$id.titleTv)).setText(iconItemInfo.getTitle());
        ((TextView) helper.getView(R$id.desTv)).setText(iconItemInfo.getDes());
        helper.getView(R$id.divider).setVisibility(iconItemInfo.getDivider() ? 0 : 8);
        helper.getView(R$id.bgView).setBackgroundResource(iconItemInfo.getBgRes());
        ((ImageView) helper.getView(R$id.icIV)).setImageResource(iconItemInfo.getIconRes());
        ViewGroup.LayoutParams layoutParams = helper.itemView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = iconItemInfo.getTop();
        }
        if (!TextUtils.equals(iconItemInfo.getModuleName(), "setting")) {
            helper.getView(R$id.setting_tv_tips).setVisibility(8);
            helper.getView(R$id.image_red_tips).setVisibility(8);
            return;
        }
        View view = helper.getView(R$id.image_red_tips);
        View view2 = helper.getView(R$id.setting_tv_tips);
        boolean z11 = !C5118o.f17608a.m23949j() && C14496b.f50966a.m65344b().getBoolean("k_is_family_mode_badge", true);
        boolean zM85862g = UpdateManager.f65568f.m85865a().m85862g();
        view.setVisibility(z11 ? 0 : 8);
        view2.setVisibility(!z11 && zM85862g ? 0 : 8);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 5;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.mine_item_icon_layout;
    }
}
