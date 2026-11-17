package com.transsion.usercenter.setting.labelsfeedback;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p282tn.lib.widget.R$color;
import com.transsion.baseui.R$drawable;
import com.transsion.usercenter.setting.labelsfeedback.model.FbDataModel;
import com.transsion.usercenter.setting.labelsfeedback.model.FbOption;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p043bx.InterfaceC4896a;
import p585lw.C25703d0;

/* JADX INFO: renamed from: com.transsion.usercenter.setting.labelsfeedback.c */
/* JADX INFO: loaded from: classes7.dex */
public final class C20827c extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    private final FbDataModel f65498a;

    /* JADX INFO: renamed from: b */
    private InterfaceC20828d f65499b;

    /* JADX INFO: renamed from: c */
    private InterfaceC4896a f65500c;

    /* JADX INFO: renamed from: com.transsion.usercenter.setting.labelsfeedback.c$a */
    public final class a extends RecyclerView.AbstractC4203b0 {

        /* JADX INFO: renamed from: a */
        private final ConstraintLayout f65501a;

        /* JADX INFO: renamed from: b */
        private final AppCompatTextView f65502b;

        /* JADX INFO: renamed from: c */
        private final AppCompatCheckBox f65503c;

        /* JADX INFO: renamed from: d */
        private final View f65504d;

        /* JADX INFO: renamed from: e */
        private final View f65505e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ C20827c f65506f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C20827c c20827c, C25703d0 binding) {
            super(binding.getRoot());
            Intrinsics.m97802h(binding, "binding");
            this.f65506f = c20827c;
            ConstraintLayout root = binding.getRoot();
            Intrinsics.m97801g(root, "getRoot(...)");
            this.f65501a = root;
            AppCompatTextView textView = binding.f78134e;
            Intrinsics.m97801g(textView, "textView");
            this.f65502b = textView;
            AppCompatCheckBox radioButton = binding.f78133d;
            Intrinsics.m97801g(radioButton, "radioButton");
            this.f65503c = radioButton;
            View bgView = binding.f78131b;
            Intrinsics.m97801g(bgView, "bgView");
            this.f65504d = bgView;
            View divider = binding.f78132c;
            Intrinsics.m97801g(divider, "divider");
            this.f65505e = divider;
        }

        /* JADX INFO: renamed from: f */
        public final View m85779f() {
            return this.f65504d;
        }

        /* JADX INFO: renamed from: g */
        public final View m85780g() {
            return this.f65505e;
        }

        /* JADX INFO: renamed from: h */
        public final AppCompatCheckBox m85781h() {
            return this.f65503c;
        }

        /* JADX INFO: renamed from: i */
        public final AppCompatTextView m85782i() {
            return this.f65502b;
        }
    }

    public C20827c(FbDataModel model) {
        Intrinsics.m97802h(model, "model");
        this.f65498a = model;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m85774i(int i11, C20827c c20827c, View view) {
        Set setH = SetsKt.m97597h(Integer.valueOf(i11));
        Integer selectedIndex = c20827c.f65498a.getSelectedIndex();
        if (selectedIndex != null) {
            setH.add(Integer.valueOf(selectedIndex.intValue()));
        }
        FbDataModel fbDataModel = c20827c.f65498a;
        Integer selectedIndex2 = fbDataModel.getSelectedIndex();
        fbDataModel.setSelectedIndex((selectedIndex2 != null && selectedIndex2.intValue() == i11) ? null : Integer.valueOf(i11));
        Iterator it = setH.iterator();
        while (it.hasNext()) {
            c20827c.notifyItemChanged(((Number) it.next()).intValue());
        }
        c20827c.f65498a.setSelectedId(null);
        Integer selectedIndex3 = c20827c.f65498a.getSelectedIndex();
        if (selectedIndex3 != null) {
            int iIntValue = selectedIndex3.intValue();
            FbDataModel fbDataModel2 = c20827c.f65498a;
            fbDataModel2.setSelectedId(Integer.valueOf(fbDataModel2.getOptions().get(iIntValue).getId()));
        }
        InterfaceC20828d interfaceC20828d = c20827c.f65499b;
        if (interfaceC20828d != null) {
            interfaceC20828d.mo85752k(c20827c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f65498a.getOptions().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i11) {
        return super.getItemViewType(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, final int i11) {
        int i12;
        Intrinsics.m97802h(holder, "holder");
        FbOption fbOption = this.f65498a.getOptions().get(i11);
        Integer selectedIndex = this.f65498a.getSelectedIndex();
        boolean z11 = selectedIndex != null && selectedIndex.intValue() == i11;
        holder.m85782i().setText(fbOption.getName());
        holder.m85781h().setChecked(z11);
        View viewM85779f = holder.m85779f();
        if (i11 == 0) {
            AbstractC26006c.m102054g(holder.m85780g());
            i12 = R$drawable.bg_radius_top_6_color_white_6p;
        } else {
            i12 = i11 == this.f65498a.getOptions().size() - 1 ? R$drawable.bg_radius_bottom_6_color_white_6p : R$color.white_6;
        }
        viewM85779f.setBackgroundResource(i12);
        holder.m85782i().setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.setting.labelsfeedback.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20827c.m85774i(i11, this, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        C25703d0 c25703d0M101114c = C25703d0.m101114c(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.m97801g(c25703d0M101114c, "inflate(...)");
        return new a(this, c25703d0M101114c);
    }

    /* JADX INFO: renamed from: k */
    public final void m85777k(InterfaceC4896a interfaceC4896a) {
        this.f65500c = interfaceC4896a;
    }

    /* JADX INFO: renamed from: l */
    public final void m85778l(InterfaceC20828d interfaceC20828d) {
        this.f65499b = interfaceC20828d;
    }
}
