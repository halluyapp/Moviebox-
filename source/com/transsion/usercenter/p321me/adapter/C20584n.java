package com.transsion.usercenter.p321me.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p282tn.lib.widget.R$color;
import com.transsion.baseui.R$drawable;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$string;
import com.transsion.usercenter.message.UserMessageActivity;
import com.transsion.usercenter.p321me.C20606k;
import com.transsion.usercenter.profile.C20664f;
import com.transsion.usercenter.profile.bean.MeItemInfo;
import fk.AbstractC23384a;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;

/* JADX INFO: renamed from: com.transsion.usercenter.me.adapter.n */
/* JADX INFO: loaded from: classes7.dex */
public final class C20584n extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final C20585o f65012e;

    /* JADX INFO: renamed from: f */
    private C20664f f65013f;

    /* JADX INFO: renamed from: com.transsion.usercenter.me.adapter.n$a */
    static final class a implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65014a;

        a(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65014a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65014a;
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
            this.f65014a.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20584n() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C20584n(C20585o c20585o) {
        this.f65012e = c20585o;
    }

    public /* synthetic */ C20584n(C20585o c20585o, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : c20585o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final Unit m85044B(TextView textView, Integer num) {
        textView.setVisibility(num.intValue() > 0 ? 0 : 8);
        textView.setText(num.toString());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final Unit m85045C(C20584n c20584n, MeItemInfo meItemInfo, View it) {
        Function1<MeItemInfo, Unit> function1M85049Q1;
        Intrinsics.m97802h(it, "it");
        C20606k.f65059a.m85071b("notice");
        c20584n.m36338k().startActivity(new Intent(c20584n.m36338k(), (Class<?>) UserMessageActivity.class));
        C20664f c20664f = c20584n.f65013f;
        if (c20664f != null) {
            c20664f.m85336e();
        }
        C20585o c20585o = c20584n.f65012e;
        if (c20585o != null && (function1M85049Q1 = c20585o.m85049Q1()) != null) {
            function1M85049Q1.invoke(meItemInfo);
        }
        return Unit.f75682a;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, final MeItemInfo item) {
        C3187b0 c3187b0M85338h;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        Context contextM36338k = m36338k();
        BaseActivity baseActivity = contextM36338k instanceof BaseActivity ? (BaseActivity) contextM36338k : null;
        if (baseActivity != null) {
            final TextView textView = (TextView) helper.getView(R$id.desTv);
            C20664f c20664f = this.f65013f;
            if (c20664f != null && (c3187b0M85338h = c20664f.m85338h()) != null) {
                c3187b0M85338h.m14851j(baseActivity, new a(new Function1() { // from class: com.transsion.usercenter.me.adapter.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C20584n.m85044B(textView, (Integer) obj);
                    }
                }));
            }
        }
        ((TextView) helper.getView(R$id.titleTv)).setText(m36338k().getString(R$string.messages_title_name));
        View itemView = helper.itemView;
        Intrinsics.m97801g(itemView, "itemView");
        AbstractC26006c.m102050c(itemView, 0L, new Function1() { // from class: com.transsion.usercenter.me.adapter.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C20584n.m85045C(this.f65010a, item, (View) obj);
            }
        }, 1, null);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 6;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.message_item_icon_layout;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: v */
    public void mo36346v(BaseViewHolder viewHolder, int i11) {
        Intrinsics.m97802h(viewHolder, "viewHolder");
        super.mo36346v(viewHolder, i11);
        TextView textView = (TextView) viewHolder.getView(R$id.desTv);
        textView.setTextSize(11.0f);
        textView.setPadding(AbstractC23384a.m92908b(4), AbstractC23384a.m92908b(1), AbstractC23384a.m92908b(4), AbstractC23384a.m92908b(1));
        textView.setTextColor(m36338k().getResources().getColor(R$color.white));
        textView.setBackgroundResource(R$drawable.bg_red_r7);
        viewHolder.getView(R$id.bgView).setBackgroundResource(R$drawable.bg_radius_bottom_6_color_white_6p);
        ((ImageView) viewHolder.getView(R$id.icIV)).setImageResource(com.p282tn.lib.widget.R$drawable.ic_me_message);
        Context contextM36338k = m36338k();
        BaseActivity baseActivity = contextM36338k instanceof BaseActivity ? (BaseActivity) contextM36338k : null;
        if (baseActivity != null) {
            this.f65013f = (C20664f) new C3227v0(baseActivity).m14969a(C20664f.class);
        }
    }
}
