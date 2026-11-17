package com.transsion.postdetail.comment;

import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.util.Linkify;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.AbstractC2397b;
import com.blankj.utilcode.util.AbstractC5789h;
import com.blankj.utilcode.util.Utils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.google.android.material.imageview.ShapeableImageView;
import com.p282tn.lib.widget.R$color;
import com.transsion.moviedetailapi.bean.CommentBean;
import com.transsion.postdetail.R$drawable;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.R$string;
import com.transsion.publish.C17602n;
import com.transsion.publish.api.PhotoEntity;
import com.transsion.publish.p307ui.GalleryActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p816uo.C28029a;
import p944yh.C28951b;

/* JADX INFO: renamed from: com.transsion.postdetail.comment.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C16740m implements TextWatcher {

    /* JADX INFO: renamed from: a */
    private final SocialStatus f56258a;

    /* JADX INFO: renamed from: b */
    private final boolean f56259b;

    /* JADX INFO: renamed from: c */
    private AppCompatEditText f56260c;

    /* JADX INFO: renamed from: d */
    private TextView f56261d;

    /* JADX INFO: renamed from: e */
    private TextView f56262e;

    /* JADX INFO: renamed from: f */
    private View f56263f;

    /* JADX INFO: renamed from: g */
    private View f56264g;

    /* JADX INFO: renamed from: h */
    private ProgressBar f56265h;

    /* JADX INFO: renamed from: i */
    private LinearLayoutCompat f56266i;

    /* JADX INFO: renamed from: j */
    private AppCompatTextView f56267j;

    /* JADX INFO: renamed from: k */
    private AppCompatTextView f56268k;

    /* JADX INFO: renamed from: l */
    private AppCompatTextView f56269l;

    /* JADX INFO: renamed from: m */
    private AppCompatImageView f56270m;

    /* JADX INFO: renamed from: n */
    private ShapeableImageView f56271n;

    /* JADX INFO: renamed from: o */
    private ShapeableImageView f56272o;

    /* JADX INFO: renamed from: p */
    private AppCompatImageView f56273p;

    /* JADX INFO: renamed from: q */
    private C28029a f56274q;

    /* JADX INFO: renamed from: r */
    private List f56275r;

    /* JADX INFO: renamed from: s */
    private final InputFilter.LengthFilter f56276s;

    /* JADX INFO: renamed from: com.transsion.postdetail.comment.m$a */
    public static final class a extends InputFilter.LengthFilter {
        a() {
            super(300);
        }

        /* JADX WARN: Code duplicated, block: B:5:0x0007 A[Catch: Exception -> 0x000a, TRY_LEAVE, TryCatch #0 {Exception -> 0x000a, blocks: (B:3:0x0002, B:5:0x0007), top: B:8:0x0002 }] */
        @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
            if (charSequence != null) {
                try {
                    charSequence.length();
                    if (spanned != null) {
                        spanned.length();
                    }
                } catch (Exception unused) {
                }
            } else if (spanned != null) {
                spanned.length();
            }
            return charSequence;
        }
    }

    public C16740m() {
        this(null, null, null, false, 15, null);
    }

    public C16740m(View view, Dialog dialog, SocialStatus socialStatus, boolean z11) {
        View view2;
        Intrinsics.m97802h(socialStatus, "socialStatus");
        this.f56258a = socialStatus;
        this.f56259b = z11;
        this.f56275r = new ArrayList();
        if (view != null) {
            this.f56260c = (AppCompatEditText) view.findViewById(R$id.comment_input_edit_text);
            this.f56261d = (TextView) view.findViewById(R$id.comment_input_edit_limit);
            this.f56263f = view.findViewById(R$id.comment_input_edit_post);
            this.f56264g = view.findViewById(R$id.comment_input_disable_click);
            this.f56262e = (TextView) view.findViewById(R$id.tv_hint);
            this.f56265h = (ProgressBar) view.findViewById(R$id.progress_bar);
            this.f56266i = (LinearLayoutCompat) view.findViewById(R$id.ll_tint);
            this.f56267j = (AppCompatTextView) view.findViewById(R$id.tv_like);
            this.f56268k = (AppCompatTextView) view.findViewById(R$id.tv_comment);
            this.f56269l = (AppCompatTextView) view.findViewById(R$id.tv_share);
            this.f56270m = (AppCompatImageView) view.findViewById(R$id.iv_download);
            this.f56271n = (ShapeableImageView) view.findViewById(R$id.iv_choose_image);
            this.f56272o = (ShapeableImageView) view.findViewById(R$id.iv_selected_image);
            this.f56273p = (AppCompatImageView) view.findViewById(R$id.icon_delete_image);
            m72905p(z11);
        }
        if (dialog != null) {
            this.f56260c = (AppCompatEditText) dialog.findViewById(R$id.comment_input_edit_text);
            this.f56261d = (TextView) dialog.findViewById(R$id.comment_input_edit_limit);
            this.f56263f = dialog.findViewById(R$id.comment_input_edit_post);
            this.f56262e = (TextView) dialog.findViewById(R$id.tv_hint);
            this.f56265h = (ProgressBar) dialog.findViewById(R$id.progress_bar);
            this.f56266i = (LinearLayoutCompat) dialog.findViewById(R$id.ll_tint);
            this.f56267j = (AppCompatTextView) dialog.findViewById(R$id.tv_like);
            this.f56268k = (AppCompatTextView) dialog.findViewById(R$id.tv_comment);
            this.f56269l = (AppCompatTextView) dialog.findViewById(R$id.tv_share);
            this.f56270m = (AppCompatImageView) dialog.findViewById(R$id.iv_download);
            this.f56271n = (ShapeableImageView) dialog.findViewById(R$id.iv_choose_image);
            this.f56272o = (ShapeableImageView) dialog.findViewById(R$id.iv_selected_image);
            this.f56273p = (AppCompatImageView) dialog.findViewById(R$id.icon_delete_image);
            m72905p(z11);
        }
        AppCompatEditText appCompatEditText = this.f56260c;
        if (appCompatEditText != null) {
            appCompatEditText.setEnabled(z11);
            appCompatEditText.setSingleLine(!z11);
            appCompatEditText.setClickable(!z11);
            if (appCompatEditText.isEnabled()) {
                appCompatEditText.setMaxLines(4);
            }
        }
        if (z11) {
            TextView textView = this.f56261d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            TextView textView2 = this.f56261d;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        if (z11 && (view2 = this.f56263f) != null) {
            view2.setVisibility(0);
        }
        this.f56276s = new a();
    }

    public /* synthetic */ C16740m(View view, Dialog dialog, SocialStatus socialStatus, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : view, (i11 & 2) != 0 ? null : dialog, (i11 & 4) != 0 ? new SocialStatus(true, true, true, true) : socialStatus, (i11 & 8) != 0 ? false : z11);
    }

    /* JADX INFO: renamed from: A */
    private final void m72892A(int i11) {
        m72894D(i11);
        m72893C(i11);
    }

    /* JADX INFO: renamed from: C */
    private final void m72893C(int i11) {
        TextView textView = this.f56261d;
        if (textView != null) {
            if (!this.f56259b || i11 < 0) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(new SpannableStringBuilder(i11 + "/" + m72906q()));
            }
        }
        if (i11 > m72906q()) {
            C28951b.f88586a.m111454d(R$string.comment_max_tips);
        }
    }

    /* JADX INFO: renamed from: D */
    private final void m72894D(int i11) {
        View view = this.f56263f;
        if (view != null) {
            boolean z11 = true;
            if ((1 > i11 || i11 > m72906q()) && this.f56275r.isEmpty()) {
                z11 = false;
            }
            if (view.isEnabled() != z11) {
                view.setEnabled(z11);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private final InterfaceC16736i0 m72899e() {
        C28029a c28029a = this.f56274q;
        if (c28029a != null) {
            return c28029a.m108987a();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private final void m72900f() {
        Editable text;
        CharSequence charSequenceN1;
        ShapeableImageView shapeableImageView = this.f56272o;
        if (shapeableImageView != null) {
            shapeableImageView.setVisibility(8);
        }
        this.f56275r.clear();
        AppCompatEditText appCompatEditText = this.f56260c;
        m72894D((appCompatEditText == null || (text = appCompatEditText.getText()) == null || (charSequenceN1 = StringsKt.m98155n1(text)) == null) ? 0 : charSequenceN1.length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m72901l(C16740m c16740m, View view) {
        AppCompatEditText appCompatEditText = c16740m.f56260c;
        c16740m.m72907r(appCompatEditText != null ? appCompatEditText.getText() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m72902m(C16740m c16740m, View view) {
        c16740m.m72908s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m72903n(C16740m c16740m, View view) {
        c16740m.m72900f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m72904o(C16740m c16740m, View view) {
        C17602n.f58119b.m75374a().m75373f(c16740m.f56275r);
        GalleryActivity.Companion companion = GalleryActivity.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        companion.m75456a(applicationM27275a, c16740m.f56275r, 0, 4, 1);
    }

    /* JADX INFO: renamed from: p */
    private final void m72905p(boolean z11) {
        if (z11) {
            LinearLayoutCompat linearLayoutCompat = this.f56266i;
            if (linearLayoutCompat != null) {
                AbstractC26006c.m102054g(linearLayoutCompat);
            }
            AppCompatTextView appCompatTextView = this.f56267j;
            if (appCompatTextView != null) {
                AbstractC26006c.m102054g(appCompatTextView);
            }
            AppCompatTextView appCompatTextView2 = this.f56269l;
            if (appCompatTextView2 != null) {
                AbstractC26006c.m102054g(appCompatTextView2);
            }
            AppCompatImageView appCompatImageView = this.f56270m;
            if (appCompatImageView != null) {
                AbstractC26006c.m102054g(appCompatImageView);
            }
            AppCompatEditText appCompatEditText = this.f56260c;
            if (appCompatEditText != null) {
                AbstractC26006c.m102058k(appCompatEditText);
                return;
            }
            return;
        }
        LinearLayoutCompat linearLayoutCompat2 = this.f56266i;
        if (linearLayoutCompat2 != null) {
            AbstractC26006c.m102057j(linearLayoutCompat2, this.f56258a.getShowTint());
        }
        AppCompatTextView appCompatTextView3 = this.f56267j;
        if (appCompatTextView3 != null) {
            AbstractC26006c.m102057j(appCompatTextView3, this.f56258a.getShowLike());
        }
        AppCompatTextView appCompatTextView4 = this.f56269l;
        if (appCompatTextView4 != null) {
            AbstractC26006c.m102057j(appCompatTextView4, this.f56258a.getShowShare());
        }
        AppCompatImageView appCompatImageView2 = this.f56270m;
        if (appCompatImageView2 != null) {
            AbstractC26006c.m102057j(appCompatImageView2, this.f56258a.getShowDownload());
        }
        AppCompatEditText appCompatEditText2 = this.f56260c;
        if (appCompatEditText2 != null) {
            AbstractC26006c.m102054g(appCompatEditText2);
        }
    }

    /* JADX INFO: renamed from: q */
    private final int m72906q() {
        C28029a c28029a = this.f56274q;
        if (c28029a != null) {
            return c28029a.m108989c();
        }
        return 10;
    }

    /* JADX INFO: renamed from: r */
    private final void m72907r(Editable editable) {
        InterfaceC16736i0 interfaceC16736i0M72899e = m72899e();
        if (interfaceC16736i0M72899e != null) {
            C28029a c28029a = this.f56274q;
            interfaceC16736i0M72899e.mo72889T(editable, c28029a != null ? c28029a.m108990d() : null);
        }
    }

    /* JADX INFO: renamed from: s */
    private final void m72908s() {
        InterfaceC16736i0 interfaceC16736i0M72899e = m72899e();
        if (interfaceC16736i0M72899e != null) {
            interfaceC16736i0M72899e.mo72888F();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m72909B() {
        AppCompatEditText appCompatEditText = this.f56260c;
        if (appCompatEditText != null) {
            appCompatEditText.setMaxEms(m72906q() * 2);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        InterfaceC16736i0 interfaceC16736i0M72899e = m72899e();
        if (interfaceC16736i0M72899e != null) {
            interfaceC16736i0M72899e.afterTextChanged(editable);
        }
        TextView textView = this.f56262e;
        if (textView != null) {
            textView.setVisibility((editable == null || editable.length() == 0) ? 0 : 8);
        }
        if ((editable != null ? editable.length() : 0) >= 295) {
            TextView textView2 = this.f56261d;
            if (textView2 != null) {
                textView2.setTextColor(AbstractC5789h.m27406a(R$color.error_50));
                return;
            }
            return;
        }
        TextView textView3 = this.f56261d;
        if (textView3 != null) {
            textView3.setTextColor(AbstractC5789h.m27406a(R$color.text_02));
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        InterfaceC16736i0 interfaceC16736i0M72899e = m72899e();
        if (interfaceC16736i0M72899e != null) {
            interfaceC16736i0M72899e.beforeTextChanged(charSequence, i11, i12, i13);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m72910g() {
        ProgressBar progressBar = this.f56265h;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        View view = this.f56263f;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: h */
    public final Editable m72911h() {
        AppCompatEditText appCompatEditText = this.f56260c;
        if (appCompatEditText != null) {
            return appCompatEditText.getText();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final CommentBean m72912i() {
        C28029a c28029a = this.f56274q;
        if (c28029a != null) {
            return c28029a.m108990d();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final List m72913j() {
        return this.f56275r;
    }

    /* JADX INFO: renamed from: k */
    public final void m72914k(C28029a c28029a) {
        Editable editableM108988b;
        CommentBean commentBeanM108990d;
        this.f56274q = c28029a;
        AppCompatEditText appCompatEditText = this.f56260c;
        if (appCompatEditText != null) {
            appCompatEditText.addTextChangedListener(this);
            C28029a c28029a2 = this.f56274q;
            if ((c28029a2 != null ? c28029a2.m108990d() : null) == null) {
                appCompatEditText.setText("");
                appCompatEditText.setSelection(0);
                m72892A(0);
                AppCompatEditText appCompatEditText2 = this.f56260c;
                if (appCompatEditText2 != null) {
                    appCompatEditText2.setHint(appCompatEditText.getContext().getString(R$string.comment_hint_add));
                }
            }
            C28029a c28029a3 = this.f56274q;
            if (c28029a3 != null && (commentBeanM108990d = c28029a3.m108990d()) != null) {
                appCompatEditText.setText("");
                appCompatEditText.setSelection(0);
                m72892A(0);
                AppCompatEditText appCompatEditText3 = this.f56260c;
                if (appCompatEditText3 != null) {
                    appCompatEditText3.setHint(appCompatEditText.getContext().getString(R$string.comment_reply_to, commentBeanM108990d.getNickName()));
                }
            }
            C28029a c28029a4 = this.f56274q;
            if (c28029a4 != null && (editableM108988b = c28029a4.m108988b()) != null) {
                appCompatEditText.setText(editableM108988b);
                appCompatEditText.setSelection(editableM108988b.length());
                m72892A(editableM108988b.length());
            }
            appCompatEditText.setMaxEms(m72906q() * 2);
            if (this.f56259b) {
                appCompatEditText.requestFocus();
                appCompatEditText.setCursorVisible(true);
                if (Build.VERSION.SDK_INT >= 29) {
                    appCompatEditText.setTextCursorDrawable(AbstractC2397b.getDrawable(appCompatEditText.getContext(), R$drawable.comment_edit_cursor));
                }
            }
            InputFilter[] filters = appCompatEditText.getFilters();
            Intrinsics.m97801g(filters, "getFilters(...)");
            List listJ0 = ArraysKt.m97447J0(filters);
            listJ0.add(0, this.f56276s);
            appCompatEditText.setFilters((InputFilter[]) listJ0.toArray(new InputFilter[0]));
        }
        View view = this.f56263f;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.comment.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C16740m.m72901l(this.f56254a, view2);
                }
            });
        }
        ShapeableImageView shapeableImageView = this.f56271n;
        if (shapeableImageView != null) {
            shapeableImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.comment.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C16740m.m72902m(this.f56255a, view2);
                }
            });
        }
        AppCompatImageView appCompatImageView = this.f56273p;
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.comment.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C16740m.m72903n(this.f56256a, view2);
                }
            });
        }
        ShapeableImageView shapeableImageView2 = this.f56272o;
        if (shapeableImageView2 != null) {
            shapeableImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.comment.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C16740m.m72904o(this.f56257a, view2);
                }
            });
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        m72892A(charSequence != null ? charSequence.length() : 0);
        if (this.f56259b) {
            InterfaceC16736i0 interfaceC16736i0M72899e = m72899e();
            if (interfaceC16736i0M72899e != null) {
                interfaceC16736i0M72899e.onTextChanged(charSequence, i11, i12, i13);
            }
        } else {
            View view = this.f56263f;
            if (view != null) {
                view.setVisibility((charSequence != null ? charSequence.length() : 0) <= 0 ? 8 : 0);
            }
        }
        AppCompatEditText appCompatEditText = this.f56260c;
        if (appCompatEditText != null) {
            Linkify.addLinks(appCompatEditText, 1);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m72915t() {
        m72919x("");
        C28029a c28029a = this.f56274q;
        if (c28029a != null) {
            c28029a.m108991e();
        }
        m72905p(false);
    }

    /* JADX INFO: renamed from: u */
    public final void m72916u() {
        this.f56275r.clear();
        ShapeableImageView shapeableImageView = this.f56272o;
        if (shapeableImageView != null) {
            shapeableImageView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m72917v(CommentBean commentBean) {
        C28029a c28029a = this.f56274q;
        if (c28029a != null) {
            c28029a.m108995i(commentBean);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m72918w(PhotoEntity photoEntity) {
        Editable text;
        CharSequence charSequenceN1;
        Intrinsics.m97802h(photoEntity, "photoEntity");
        ShapeableImageView shapeableImageView = this.f56272o;
        if (shapeableImageView != null) {
            int length = 0;
            shapeableImageView.setVisibility(0);
            this.f56275r.add(photoEntity);
            RequestManager requestManagerWith = Glide.with(shapeableImageView);
            String localPath = photoEntity.getLocalPath();
            if (localPath == null) {
                localPath = "";
            }
            RequestBuilder<Drawable> requestBuilderLoad2 = requestManagerWith.load2(new File(localPath));
            ShapeableImageView shapeableImageView2 = this.f56272o;
            Intrinsics.m97799e(shapeableImageView2);
            requestBuilderLoad2.into(shapeableImageView2);
            AppCompatEditText appCompatEditText = this.f56260c;
            if (appCompatEditText != null && (text = appCompatEditText.getText()) != null && (charSequenceN1 = StringsKt.m98155n1(text)) != null) {
                length = charSequenceN1.length();
            }
            m72894D(length);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m72919x(CharSequence charSequence) {
        AppCompatEditText appCompatEditText;
        if (this.f56259b || (appCompatEditText = this.f56260c) == null) {
            return;
        }
        appCompatEditText.setText(charSequence);
    }

    /* JADX INFO: renamed from: y */
    public final void m72920y() {
        ProgressBar progressBar = this.f56265h;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        View view = this.f56263f;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m72921z() {
        AppCompatEditText appCompatEditText = this.f56260c;
        if (appCompatEditText != null) {
            appCompatEditText.removeTextChangedListener(this);
        }
        View view = this.f56263f;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }
}
