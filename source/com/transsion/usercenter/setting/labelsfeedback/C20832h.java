package com.transsion.usercenter.setting.labelsfeedback;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.usercenter.setting.labelsfeedback.model.FBContact;
import com.transsion.usercenter.setting.labelsfeedback.model.FbDataModel;
import com.transsnet.loginapi.bean.Country;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p585lw.C25705e0;

/* JADX INFO: renamed from: com.transsion.usercenter.setting.labelsfeedback.h */
/* JADX INFO: loaded from: classes7.dex */
public final class C20832h extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    private final FbDataModel f65510a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC20833i f65511b;

    /* JADX INFO: renamed from: c */
    private a f65512c;

    /* JADX INFO: renamed from: com.transsion.usercenter.setting.labelsfeedback.h$a */
    public final class a extends RecyclerView.AbstractC4203b0 {

        /* JADX INFO: renamed from: a */
        private final LinearLayout f65513a;

        /* JADX INFO: renamed from: b */
        private final UCEditText f65514b;

        /* JADX INFO: renamed from: c */
        private final AppCompatTextView f65515c;

        /* JADX INFO: renamed from: d */
        private final ShapeableImageView f65516d;

        /* JADX INFO: renamed from: e */
        private final AppCompatEditText f65517e;

        /* JADX INFO: renamed from: f */
        private final AppCompatEditText f65518f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ C20832h f65519g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C20832h c20832h, C25705e0 binding) {
            super(binding.getRoot());
            Intrinsics.m97802h(binding, "binding");
            this.f65519g = c20832h;
            LinearLayout root = binding.getRoot();
            Intrinsics.m97801g(root, "getRoot(...)");
            this.f65513a = root;
            UCEditText editText = binding.f78157d;
            Intrinsics.m97801g(editText, "editText");
            this.f65514b = editText;
            AppCompatTextView countTextView = binding.f78155b;
            Intrinsics.m97801g(countTextView, "countTextView");
            this.f65515c = countTextView;
            ShapeableImageView imageView = binding.f78158e;
            Intrinsics.m97801g(imageView, "imageView");
            this.f65516d = imageView;
            AppCompatEditText countryEditText = binding.f78156c;
            Intrinsics.m97801g(countryEditText, "countryEditText");
            this.f65517e = countryEditText;
            AppCompatEditText phoneEditText = binding.f78159f;
            Intrinsics.m97801g(phoneEditText, "phoneEditText");
            this.f65518f = phoneEditText;
        }

        /* JADX INFO: renamed from: f */
        public final AppCompatTextView m85795f() {
            return this.f65515c;
        }

        /* JADX INFO: renamed from: g */
        public final AppCompatEditText m85796g() {
            return this.f65517e;
        }

        /* JADX INFO: renamed from: h */
        public final UCEditText m85797h() {
            return this.f65514b;
        }

        /* JADX INFO: renamed from: i */
        public final ShapeableImageView m85798i() {
            return this.f65516d;
        }

        /* JADX INFO: renamed from: j */
        public final AppCompatEditText m85799j() {
            return this.f65518f;
        }

        /* JADX INFO: renamed from: k */
        public final LinearLayout m85800k() {
            return this.f65513a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.setting.labelsfeedback.h$b */
    public static final class b implements TextWatcher {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ a f65520a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C20832h f65521b;

        public b(a aVar, C20832h c20832h) {
            this.f65520a = aVar;
            this.f65521b = c20832h;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string;
            int length = editable != null ? editable.length() : 0;
            this.f65520a.m85795f().setText(length + "/500");
            this.f65521b.m85792m().setContent((editable == null || (string = editable.toString()) == null) ? null : StringsKt.m98155n1(string).toString());
            InterfaceC20833i interfaceC20833iM85791l = this.f65521b.m85791l();
            if (interfaceC20833iM85791l != null) {
                interfaceC20833iM85791l.mo73884b(this.f65521b);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.setting.labelsfeedback.h$c */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String string;
            FBContact contact = C20832h.this.m85792m().getContact();
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            contact.setPhone(string);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    public C20832h(FbDataModel model, InterfaceC20833i interfaceC20833i) {
        Intrinsics.m97802h(model, "model");
        this.f65510a = model;
        this.f65511b = interfaceC20833i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m85786o(C20832h c20832h, View view) {
        InterfaceC20833i interfaceC20833i = c20832h.f65511b;
        if (interfaceC20833i != null) {
            interfaceC20833i.mo73886e(c20832h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m85787p(C20832h c20832h, View view) {
        InterfaceC20833i interfaceC20833i = c20832h.f65511b;
        if (interfaceC20833i != null) {
            interfaceC20833i.mo73883a(c20832h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m85788q(C20832h c20832h, View view) {
        InterfaceC20833i interfaceC20833i = c20832h.f65511b;
        if (interfaceC20833i != null) {
            interfaceC20833i.mo73887i(c20832h);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 1;
    }

    /* JADX INFO: renamed from: j */
    public final void m85789j(Country country) {
        AppCompatEditText appCompatEditTextM85796g;
        if (country != null) {
            this.f65510a.getContact().setCountry(country);
            String str = country.getCountry_s() + " +" + country.getCode();
            a aVar = this.f65512c;
            if (aVar == null || (appCompatEditTextM85796g = aVar.m85796g()) == null) {
                return;
            }
            appCompatEditTextM85796g.setText(str);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m85790k(String str) {
        ShapeableImageView shapeableImageViewM85798i;
        InterfaceC20833i interfaceC20833i;
        this.f65510a.setImagePath(str);
        a aVar = this.f65512c;
        if (aVar == null || (shapeableImageViewM85798i = aVar.m85798i()) == null || (interfaceC20833i = this.f65511b) == null) {
            return;
        }
        interfaceC20833i.mo73885c(this, shapeableImageViewM85798i);
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC20833i m85791l() {
        return this.f65511b;
    }

    /* JADX INFO: renamed from: m */
    public final FbDataModel m85792m() {
        return this.f65510a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i11) {
        Intrinsics.m97802h(holder, "holder");
        holder.m85800k().setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.setting.labelsfeedback.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20832h.m85786o(this.f65507a, view);
            }
        });
        holder.m85798i().setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.setting.labelsfeedback.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20832h.m85787p(this.f65508a, view);
            }
        });
        holder.m85795f().setText("0/500");
        holder.m85797h().addTextChangedListener(new b(holder, this));
        holder.m85796g().setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.setting.labelsfeedback.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20832h.m85788q(this.f65509a, view);
            }
        });
        holder.m85799j().addTextChangedListener(new c());
        String content = this.f65510a.getContent();
        if (content != null) {
            holder.m85797h().setText(new SpannableStringBuilder(content));
        }
        m85790k(this.f65510a.getImagePath());
        m85789j(this.f65510a.getContact().getCountry());
        holder.m85799j().setText(new SpannableStringBuilder(this.f65510a.getContact().getPhone()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        C25705e0 c25705e0M101121c = C25705e0.m101121c(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.m97801g(c25705e0M101121c, "inflate(...)");
        a aVar = new a(this, c25705e0M101121c);
        this.f65512c = aVar;
        return aVar;
    }
}
