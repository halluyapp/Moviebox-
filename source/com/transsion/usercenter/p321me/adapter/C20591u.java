package com.transsion.usercenter.p321me.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.AbstractC2397b;
import ck.AbstractC5114k;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$mipmap;
import com.p282tn.lib.widget.TnTextView;
import com.transsion.baseui.R$string;
import com.transsion.baseui.adapter.BaseItemBindingProvider;
import com.transsion.usercenter.p321me.C20606k;
import com.transsion.usercenter.profile.bean.MeItemInfo;
import com.transsion.usercenter.profile.bean.MineNovel;
import com.transsion.usercenter.profile.bean.MineNovelItem;
import fk.AbstractC23384a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26004a;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p585lw.C25725o0;

/* JADX INFO: renamed from: com.transsion.usercenter.me.adapter.u */
/* JADX INFO: loaded from: classes7.dex */
public final class C20591u extends BaseItemBindingProvider {

    /* JADX INFO: renamed from: g */
    private final C20585o f65037g;

    /* JADX WARN: Multi-variable type inference failed */
    public C20591u() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C20591u(C20585o c20585o) {
        this.f65037g = c20585o;
    }

    public /* synthetic */ C20591u(C20585o c20585o, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : c20585o);
    }

    /* JADX INFO: renamed from: C */
    private final void m85059C(C25725o0 c25725o0, final MineNovelItem mineNovelItem, final int i11) {
        int i12;
        int i13;
        Context context = c25725o0.getRoot().getContext();
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC23384a.m92908b(20), AbstractC23384a.m92908b(20));
        if (i11 != 1) {
            i12 = i11 != 2 ? R$mipmap.ic_mine_novel_library : R$mipmap.ic_mine_novel_download;
        } else {
            i12 = R$mipmap.ic_mine_novel_history;
        }
        String icUrl = mineNovelItem.getIcUrl();
        if (icUrl == null || icUrl.length() == 0) {
            imageView.setImageResource(i12);
        } else {
            C23860f.a aVar = C23860f.f72909a;
            Intrinsics.m97799e(context);
            C23860f.b bVarM94457m = aVar.m94457m(context);
            String icUrl2 = mineNovelItem.getIcUrl();
            Intrinsics.m97799e(icUrl2);
            bVarM94457m.m94468g(icUrl2).m94474m(AbstractC23384a.m92908b(20)).m94464c(AbstractC23384a.m92908b(20)).m94465d(imageView);
        }
        Intrinsics.m97799e(context);
        TnTextView tnTextView = new TnTextView(context);
        tnTextView.setTypeface(AbstractC26004a.m102047d(context));
        tnTextView.setTextSize(12.0f);
        tnTextView.setTextColor(AbstractC2397b.getColor(context, R$color.white_80));
        if (i11 != 1) {
            i13 = i11 != 2 ? R$string.Library : R$string.Downloads;
        } else {
            i13 = R$string.History;
        }
        String title = mineNovelItem.getTitle();
        if (title == null || title.length() == 0) {
            tnTextView.setText(context.getResources().getString(i13));
        } else {
            tnTextView.setText(mineNovelItem.getTitle());
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = AbstractC23384a.m92908b(4);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(tnTextView, layoutParams2);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.me.adapter.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20591u.m85060D(mineNovelItem, i11, view);
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -1);
        layoutParams3.weight = 1.0f;
        c25725o0.f78336e.addView(linearLayout, layoutParams3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m85060D(MineNovelItem mineNovelItem, int i11, View view) {
        C20606k.f65059a.m85072c("novel_" + mineNovelItem.getTitle(), i11);
        String deeplink = mineNovelItem.getDeeplink();
        if (deeplink != null) {
            AbstractC5114k.m23925h(deeplink, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: E */
    private final void m85061E(C25725o0 c25725o0, MineNovel mineNovel) {
        ArrayList arrayList;
        List<MineNovelItem> subItems = mineNovel.getSubItems();
        if (subItems == null || subItems.isEmpty()) {
            LinearLayout llBottom = c25725o0.f78336e;
            Intrinsics.m97801g(llBottom, "llBottom");
            AbstractC26006c.m102054g(llBottom);
            return;
        }
        c25725o0.f78336e.removeAllViews();
        LinearLayout llBottom2 = c25725o0.f78336e;
        Intrinsics.m97801g(llBottom2, "llBottom");
        AbstractC26006c.m102058k(llBottom2);
        List<MineNovelItem> subItems2 = mineNovel.getSubItems();
        if (subItems2 != null) {
            arrayList = new ArrayList();
            for (Object obj : subItems2) {
                String deeplink = ((MineNovelItem) obj).getDeeplink();
                if (!(deeplink == null || deeplink.length() == 0)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            LinearLayout llBottom3 = c25725o0.f78336e;
            Intrinsics.m97801g(llBottom3, "llBottom");
            AbstractC26006c.m102054g(llBottom3);
        } else {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                m85059C(c25725o0, (MineNovelItem) arrayList.get(i11), i11);
                if (i11 < arrayList.size() - 1) {
                    c25725o0.f78336e.addView(new View(m36338k()), new LinearLayout.LayoutParams(AbstractC23384a.m92908b(8), -1));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final Unit m85062G(MineNovel mineNovel, C20591u c20591u, MeItemInfo meItemInfo, View it) {
        Function1<MeItemInfo, Unit> function1M85049Q1;
        Intrinsics.m97802h(it, "it");
        C20606k.f65059a.m85071b("novel");
        String deeplink = mineNovel.getDeeplink();
        if (deeplink != null) {
            AbstractC5114k.m23925h(deeplink, null, 1, null);
        }
        C20585o c20585o = c20591u.f65037g;
        if (c20585o != null && (function1M85049Q1 = c20585o.m85049Q1()) != null) {
            function1M85049Q1.invoke(meItemInfo);
        }
        return Unit.f75682a;
    }

    @Override // com.transsion.baseui.adapter.BaseItemBindingProvider
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo65419y(C25725o0 binding, BaseViewHolder helper, final MeItemInfo item) {
        Intrinsics.m97802h(binding, "binding");
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        Object data = item.getData();
        final MineNovel mineNovel = data instanceof MineNovel ? (MineNovel) data : null;
        if (mineNovel == null) {
            return;
        }
        C20606k.f65059a.m85070a("novel");
        View itemView = helper.itemView;
        Intrinsics.m97801g(itemView, "itemView");
        AbstractC26006c.m102050c(itemView, 0L, new Function1() { // from class: com.transsion.usercenter.me.adapter.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C20591u.m85062G(mineNovel, this, item, (View) obj);
            }
        }, 1, null);
        binding.f78337f.setText(mineNovel.getTitle());
        AppCompatTextView desTv = binding.f78334c;
        Intrinsics.m97801g(desTv, "desTv");
        String des = mineNovel.getDes();
        desTv.setVisibility(des == null || des.length() == 0 ? 8 : 0);
        binding.f78334c.setText(mineNovel.getDes());
        String buttonText = mineNovel.getButtonText();
        if (buttonText != null && buttonText.length() != 0) {
            binding.f78333b.setText(mineNovel.getButtonText());
        }
        String icUrl = mineNovel.getIcUrl();
        if (icUrl == null || icUrl.length() == 0) {
            binding.f78335d.setImageResource(R$mipmap.ic_mine_novel);
        } else {
            C23860f.b bVarM94457m = C23860f.f72909a.m94457m(m36338k());
            String icUrl2 = mineNovel.getIcUrl();
            Intrinsics.m97799e(icUrl2);
            C23860f.b bVarM94464c = bVarM94457m.m94468g(icUrl2).m94474m(AbstractC23384a.m92908b(20)).m94464c(AbstractC23384a.m92908b(20));
            ImageView icIV = binding.f78335d;
            Intrinsics.m97801g(icIV, "icIV");
            bVarM94464c.m94465d(icIV);
        }
        m85061E(binding, mineNovel);
    }

    @Override // com.transsion.baseui.adapter.BaseItemBindingProvider
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public C25725o0 mo65420z(LayoutInflater inflater, ViewGroup parent) {
        Intrinsics.m97802h(inflater, "inflater");
        Intrinsics.m97802h(parent, "parent");
        C25725o0 c25725o0M101197c = C25725o0.m101197c(LayoutInflater.from(m36338k()), parent, false);
        Intrinsics.m97801g(c25725o0M101197c, "inflate(...)");
        return c25725o0M101197c;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 7;
    }
}
