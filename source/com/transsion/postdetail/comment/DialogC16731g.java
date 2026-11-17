package com.transsion.postdetail.comment;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogC0322w;
import com.transsion.moviedetailapi.bean.CommentBean;
import com.transsion.postdetail.R$layout;
import com.transsion.postdetail.R$style;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p816uo.C28029a;

/* JADX INFO: renamed from: com.transsion.postdetail.comment.g */
/* JADX INFO: loaded from: classes6.dex */
public final class DialogC16731g extends DialogC0322w {

    /* JADX INFO: renamed from: a */
    private C16740m f56250a;

    /* JADX INFO: renamed from: b */
    private C28029a f56251b;

    /* JADX INFO: renamed from: com.transsion.postdetail.comment.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final Context f56252a;

        /* JADX INFO: renamed from: b */
        private C28029a f56253b;

        public a(Context context) {
            Intrinsics.m97802h(context, "context");
            this.f56252a = context;
            this.f56253b = new C28029a();
        }

        /* JADX INFO: renamed from: a */
        public final DialogC16731g m72877a() {
            DialogC16731g dialogC16731g = new DialogC16731g(this.f56252a, null);
            dialogC16731g.m72875k(this.f56253b);
            return dialogC16731g;
        }

        /* JADX INFO: renamed from: b */
        public final a m72878b(Editable editable) {
            C28029a c28029a = this.f56253b;
            if (c28029a != null) {
                c28029a.m108993g(editable);
            }
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final a m72879c(InterfaceC16736i0 interfaceC16736i0) {
            C28029a c28029a = this.f56253b;
            if (c28029a != null) {
                c28029a.m108992f(interfaceC16736i0);
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final a m72880d(int i11) {
            C28029a c28029a = this.f56253b;
            if (c28029a != null) {
                c28029a.m108994h(i11);
            }
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final a m72881e(CommentBean commentBean) {
            C28029a c28029a = this.f56253b;
            if (c28029a != null) {
                c28029a.m108995i(commentBean);
            }
            return this;
        }
    }

    private DialogC16731g(Context context) {
        super(context, R$style.CommentEditInputDialogTheme);
        setContentView(R$layout.dialog_comment_input_edit);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                if (attributes.width != -1) {
                    attributes.width = -1;
                }
                if (attributes.height != -2) {
                    attributes.height = -2;
                }
                window.setAttributes(attributes);
                window.setSoftInputMode(4);
            }
        }
        this.f56250a = new C16740m(null, this, null, true, 5, null);
    }

    public /* synthetic */ DialogC16731g(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* JADX INFO: renamed from: i */
    private final void m72869i() {
        C16740m c16740m = this.f56250a;
        if (c16740m != null) {
            c16740m.m72914k(this.f56251b);
        }
        C16740m c16740m2 = this.f56250a;
        if (c16740m2 != null) {
            c16740m2.m72909B();
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m72870m() {
        C16740m c16740m = this.f56250a;
        if (c16740m != null) {
            c16740m.m72921z();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m72871f() {
        C16740m c16740m = this.f56250a;
        if (c16740m != null) {
            c16740m.m72910g();
        }
    }

    /* JADX INFO: renamed from: g */
    public final C28029a m72872g() {
        return this.f56251b;
    }

    /* JADX INFO: renamed from: h */
    public final C16740m m72873h() {
        return this.f56250a;
    }

    /* JADX INFO: renamed from: j */
    public final void m72874j(Editable editable) {
        C28029a c28029a = this.f56251b;
        if (c28029a != null) {
            c28029a.m108993g(editable);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m72875k(C28029a c28029a) {
        this.f56251b = c28029a;
    }

    /* JADX INFO: renamed from: l */
    public final void m72876l() {
        C16740m c16740m = this.f56250a;
        if (c16740m != null) {
            c16740m.m72920y();
        }
    }

    @Override // androidx.appcompat.app.DialogC0322w, androidx.activity.DialogC0236q, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.activity.DialogC0236q, android.app.Dialog
    protected void onStart() {
        super.onStart();
        m72869i();
    }

    @Override // androidx.appcompat.app.DialogC0322w, androidx.activity.DialogC0236q, android.app.Dialog
    protected void onStop() {
        super.onStop();
        m72870m();
    }
}
