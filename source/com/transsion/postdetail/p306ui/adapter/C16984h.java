package com.transsion.postdetail.p306ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.p282tn.lib.widget.R$color;
import com.transsion.baseui.R$drawable;
import com.transsion.postdetail.bean.ReportReason;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p844vo.C28177v;

/* JADX INFO: renamed from: com.transsion.postdetail.ui.adapter.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C16984h extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: d */
    public static final a f56992d = new a(null);

    /* JADX INFO: renamed from: a */
    private final List f56993a;

    /* JADX INFO: renamed from: b */
    private Integer f56994b;

    /* JADX INFO: renamed from: c */
    private Function1 f56995c;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.adapter.h$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.adapter.h$b */
    public final class b extends RecyclerView.AbstractC4203b0 {

        /* JADX INFO: renamed from: a */
        private final C28177v f56996a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C16984h f56997b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C16984h c16984h, C28177v binding) {
            super(binding.getRoot());
            Intrinsics.m97802h(binding, "binding");
            this.f56997b = c16984h;
            this.f56996a = binding;
        }

        /* JADX INFO: renamed from: f */
        public final C28177v m73924f() {
            return this.f56996a;
        }
    }

    public C16984h(List reasons) {
        Intrinsics.m97802h(reasons, "reasons");
        this.f56993a = reasons;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m73918k(C16984h c16984h, int i11, C28177v c28177v, View view) {
        int iIntValue;
        Integer num = c16984h.f56994b;
        Integer numValueOf = (num != null && num.intValue() == i11) ? null : Integer.valueOf(i11);
        c16984h.f56994b = numValueOf;
        c28177v.f86660b.setSelected(numValueOf != null && numValueOf.intValue() == i11);
        if (num != null && (iIntValue = num.intValue()) != i11) {
            c16984h.notifyItemChanged(iIntValue, "selection_changed");
        }
        Function1 function1 = c16984h.f56995c;
        if (function1 != null) {
            Integer num2 = c16984h.f56994b;
            function1.invoke(num2 != null ? (ReportReason) c16984h.f56993a.get(num2.intValue()) : null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f56993a.size();
    }

    /* JADX INFO: renamed from: h */
    public final Integer m73919h() {
        return this.f56994b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b holder, final int i11) {
        Intrinsics.m97802h(holder, "holder");
        ReportReason reportReason = (ReportReason) this.f56993a.get(i11);
        Integer num = this.f56994b;
        boolean z11 = num != null && num.intValue() == i11;
        final C28177v c28177vM73924f = holder.m73924f();
        c28177vM73924f.f86661c.setText(reportReason.getTitle());
        c28177vM73924f.f86660b.setSelected(z11);
        if (i11 == this.f56993a.size() - 1) {
            c28177vM73924f.getRoot().setBackgroundResource(R$drawable.bg_radius_bottom_6_color_white_6p);
        } else if (i11 == 0) {
            c28177vM73924f.getRoot().setBackgroundResource(R$drawable.bg_radius_top_6_color_white_6p);
        } else {
            c28177vM73924f.getRoot().setBackgroundResource(R$color.white_6);
        }
        c28177vM73924f.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.adapter.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16984h.m73918k(this.f56989a, i11, c28177vM73924f, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b holder, int i11, List payloads) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i11, payloads);
            return;
        }
        AppCompatCheckBox appCompatCheckBox = holder.m73924f().f86660b;
        Integer num = this.f56994b;
        appCompatCheckBox.setSelected(num != null && num.intValue() == i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        C28177v c28177vM109383c = C28177v.m109383c(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.m97801g(c28177vM109383c, "inflate(...)");
        return new b(this, c28177vM109383c);
    }

    /* JADX INFO: renamed from: m */
    public final void m73923m(Function1 function1) {
        this.f56995c = function1;
    }
}
