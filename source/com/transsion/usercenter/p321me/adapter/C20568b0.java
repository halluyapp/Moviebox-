package com.transsion.usercenter.p321me.adapter;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ck.C5110g;
import ck.C5118o;
import com.blankj.utilcode.util.Utils;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.kids.KidsAccountManager;
import com.transsion.baselib.kids.KidsProfile;
import com.transsion.baseui.widget.GradientBorderTagView;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$mipmap;
import com.transsion.usercenter.R$string;
import com.transsion.usercenter.edit.ProfileEditCenterActivity;
import com.transsion.usercenter.kids.AccountSwitchDialog;
import com.transsion.usercenter.p321me.C20606k;
import com.transsion.usercenter.profile.bean.MeItemInfo;
import com.transsnet.loginapi.bean.UserInfo;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p441gz.InterfaceC23704a;
import p462hj.C23860f;
import p620nn.C26038e;

/* JADX INFO: renamed from: com.transsion.usercenter.me.adapter.b0 */
/* JADX INFO: loaded from: classes7.dex */
public final class C20568b0 extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final C20585o f64982e;

    /* JADX INFO: renamed from: f */
    private UserInfo f64983f;

    /* JADX WARN: Multi-variable type inference failed */
    public C20568b0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C20568b0(C20585o c20585o) {
        this.f64982e = c20585o;
    }

    public /* synthetic */ C20568b0(C20585o c20585o, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : c20585o);
    }

    /* JADX INFO: renamed from: C */
    private final boolean m85012C() {
        UserInfo userInfo = this.f64983f;
        return userInfo == null || (userInfo != null && userInfo.getUserType() == 0);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX INFO: renamed from: D */
    private final void m85013D(BaseViewHolder baseViewHolder, UserInfo userInfo) {
        int i11;
        Integer gender;
        boolean z11;
        Integer age;
        Integer age2;
        boolean z12 = true;
        KidsProfile kidsProfileM65181f = KidsAccountManager.f50883a.m65181f();
        TextView textView = (TextView) baseViewHolder.getView(R$id.nameTv);
        textView.setText(kidsProfileM65181f != null ? kidsProfileM65181f.getName() : null);
        textView.setCompoundDrawables(null, null, null, null);
        GradientBorderTagView gradientBorderTagView = (GradientBorderTagView) baseViewHolder.getView(R$id.safeKidsTv);
        gradientBorderTagView.setVisibility(C5118o.f17608a.m23949j() ? 0 : 8);
        String string = Utils.m27275a().getResources().getString(R$string.user_switch_profile);
        Intrinsics.m97801g(string, "getString(...)");
        gradientBorderTagView.setText(string);
        ((TextView) baseViewHolder.getView(R$id.idTv)).setText(Utils.m27275a().getResources().getString(R$string.user_id_show, userInfo != null ? userInfo.getUsername() : null));
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.genderTv);
        if ((kidsProfileM65181f != null ? kidsProfileM65181f.getGender() : null) == null) {
            i11 = 0;
        } else {
            i11 = (kidsProfileM65181f == null || (gender = kidsProfileM65181f.getGender()) == null || gender.intValue() != 1) ? R$mipmap.profile_female : R$mipmap.profile_man;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(i11, 0, 0, 0);
        if (((kidsProfileM65181f == null || (age2 = kidsProfileM65181f.getAge()) == null) ? 0 : age2.intValue()) <= 0) {
            textView2.setText("");
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
            C26038e.f79537a.m102106b(spannableStringBuilder);
            spannableStringBuilder.append((CharSequence) String.valueOf(kidsProfileM65181f != null ? kidsProfileM65181f.getAge() : null));
            textView2.setText(spannableStringBuilder);
        }
        if ((kidsProfileM65181f != null ? kidsProfileM65181f.getGender() : null) != null) {
            z11 = true;
        } else {
            if (((kidsProfileM65181f == null || (age = kidsProfileM65181f.getAge()) == null) ? 0 : age.intValue()) > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        textView2.setVisibility(z11 ? 0 : 8);
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.avatarIV);
        String avatarLocalPath = kidsProfileM65181f != null ? kidsProfileM65181f.getAvatarLocalPath() : null;
        if (avatarLocalPath != null && avatarLocalPath.length() != 0) {
            z12 = false;
        }
        if (!z12) {
            Glide.with(m36338k()).load2(new File(avatarLocalPath)).into(imageView);
        } else if (imageView != null) {
            imageView.setImageResource(kidsProfileM65181f != null ? kidsProfileM65181f.getAvatarResId() : 0);
        }
    }

    /* JADX INFO: renamed from: E */
    private final void m85014E(final BaseViewHolder baseViewHolder, final UserInfo userInfo) {
        int i11;
        Function1<MeItemInfo, Unit> function1M85050R1;
        Function1<MeItemInfo, Unit> function1M85050R2;
        boolean z11 = true;
        baseViewHolder.getView(R$id.loginTv).setVisibility(8);
        baseViewHolder.getView(R$id.avatarIV).setVisibility(0);
        View itemView = baseViewHolder.itemView;
        Intrinsics.m97801g(itemView, "itemView");
        AbstractC26006c.m102050c(itemView, 0L, new Function1() { // from class: com.transsion.usercenter.me.adapter.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C20568b0.m85015F(userInfo, this, (View) obj);
            }
        }, 1, null);
        if (userInfo == null) {
            return;
        }
        if (C5110g.f17601a.m23911b()) {
            baseViewHolder.getView(R$id.tvLoginMyChannel).setVisibility(!C5118o.f17608a.m23948i() ? 0 : 8);
            ((TextView) baseViewHolder.getView(R$id.tvLoginMyChannel)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.me.adapter.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C20568b0.m85016G(userInfo, baseViewHolder, view);
                }
            });
        }
        baseViewHolder.getView(R$id.safeKidsGroup).setVisibility(0);
        MeItemInfo meItemInfo = new MeItemInfo(1, userInfo);
        C20585o c20585o = this.f64982e;
        if (c20585o != null && (function1M85050R2 = c20585o.m85050R1()) != null) {
            function1M85050R2.invoke(meItemInfo);
        }
        baseViewHolder.getView(R$id.safeKidsGroup).setVisibility(0);
        MeItemInfo meItemInfo2 = new MeItemInfo(1, userInfo);
        C20585o c20585o2 = this.f64982e;
        if (c20585o2 != null && (function1M85050R1 = c20585o2.m85050R1()) != null) {
            function1M85050R1.invoke(meItemInfo2);
        }
        C5118o c5118o = C5118o.f17608a;
        if (c5118o.m23948i()) {
            m85013D(baseViewHolder, userInfo);
            return;
        }
        TextView textView = (TextView) baseViewHolder.getView(R$id.nameTv);
        textView.setText(userInfo.getNickname());
        textView.setCompoundDrawables(null, null, null, null);
        GradientBorderTagView gradientBorderTagView = (GradientBorderTagView) baseViewHolder.getView(R$id.safeKidsTv);
        gradientBorderTagView.setVisibility(c5118o.m23949j() ? 0 : 8);
        String string = Utils.m27275a().getResources().getString(R$string.user_safe_kids);
        Intrinsics.m97801g(string, "getString(...)");
        gradientBorderTagView.setText(string);
        ((TextView) baseViewHolder.getView(R$id.idTv)).setText(Utils.m27275a().getResources().getString(R$string.user_id_show, userInfo.getUsername()));
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.genderTv);
        if (userInfo.getGender() == 0) {
            i11 = 0;
        } else {
            i11 = userInfo.getGender() == 1 ? R$mipmap.profile_man : R$mipmap.profile_female;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(i11, 0, 0, 0);
        if (userInfo.getAge() <= 0) {
            textView2.setText("");
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
            C26038e.f79537a.m102106b(spannableStringBuilder);
            spannableStringBuilder.append((CharSequence) String.valueOf(userInfo.getAge()));
            textView2.setText(spannableStringBuilder);
        }
        if (userInfo.getGender() == 0 && userInfo.getAge() <= 0) {
            z11 = false;
        }
        textView2.setVisibility(z11 ? 0 : 8);
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.avatarIV);
        C23860f.a aVar = C23860f.f72909a;
        Context context = imageView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        aVar.m94457m(context).m94468g(userInfo.getAvatar()).m94470i(com.p282tn.lib.widget.R$mipmap.profile_default_avatar).m94465d(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final Unit m85015F(UserInfo userInfo, C20568b0 c20568b0, View it) {
        Function1<MeItemInfo, Unit> function1M85049Q1;
        Intrinsics.m97802h(it, "it");
        MeItemInfo meItemInfo = new MeItemInfo(1, userInfo);
        if (C5118o.f17608a.m23949j()) {
            AccountSwitchDialog.Companion.m84672b(AccountSwitchDialog.INSTANCE, false, 1, null).m61941X(c20568b0.m36338k(), "AccountSwitchDialog");
        } else {
            ProfileEditCenterActivity.INSTANCE.m84607a(c20568b0.m36338k(), userInfo);
        }
        C20585o c20585o = c20568b0.f64982e;
        if (c20585o != null && (function1M85049Q1 = c20585o.m85049Q1()) != null) {
            function1M85049Q1.invoke(meItemInfo);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final void m85016G(UserInfo userInfo, BaseViewHolder baseViewHolder, View view) {
        Navigator.m61845x(TheRouter.m61773c("/profile/user_profile").m61857K("userId", userInfo.getUserId()), baseViewHolder.itemView.getContext(), null, 2, null);
    }

    /* JADX INFO: renamed from: H */
    private final void m85017H(BaseViewHolder baseViewHolder, UserInfo userInfo) {
        baseViewHolder.getView(R$id.genderTv).setVisibility(8);
        baseViewHolder.getView(R$id.avatarIV).setVisibility(8);
        baseViewHolder.getView(R$id.safeKidsGroup).setVisibility(8);
        TextView textView = (TextView) baseViewHolder.getView(R$id.loginTv);
        textView.setVisibility(0);
        textView.setText(R$string.user_login);
        AbstractC26006c.m102050c(textView, 0L, new Function1() { // from class: com.transsion.usercenter.me.adapter.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C20568b0.m85018I(this.f64981a, (View) obj);
            }
        }, 1, null);
        baseViewHolder.itemView.setOnClickListener(null);
        TextView textView2 = (TextView) baseViewHolder.getView(R$id.nameTv);
        textView2.setText(R$string.user_login_title);
        textView2.setCompoundDrawables(null, null, null, null);
        ((TextView) baseViewHolder.getView(R$id.idTv)).setText(Utils.m27275a().getResources().getString(R$string.user_id_show, userInfo != null ? userInfo.getUsername() : null));
        baseViewHolder.getView(R$id.tvLoginMyChannel).setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final Unit m85018I(C20568b0 c20568b0, View it) {
        Intrinsics.m97802h(it, "it");
        C20606k.f65059a.m85071b("login");
        InterfaceC23704a interfaceC23704a = (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
        if (interfaceC23704a != null) {
            interfaceC23704a.mo90387i(c20568b0.m36338k());
        }
        return Unit.f75682a;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, MeItemInfo item) {
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        Object data = item.getData();
        UserInfo userInfo = data instanceof UserInfo ? (UserInfo) data : null;
        this.f64983f = userInfo;
        C20606k.f65059a.m85073d(userInfo != null ? userInfo.getUserId() : null);
        if (!m85012C() || C5118o.f17608a.m23948i()) {
            m85014E(helper, this.f64983f);
        } else {
            m85017H(helper, this.f64983f);
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 1;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.mine_item_header_layout;
    }
}
