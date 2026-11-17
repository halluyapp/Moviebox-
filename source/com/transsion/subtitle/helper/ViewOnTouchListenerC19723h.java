package com.transsion.subtitle.helper;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import com.blankj.utilcode.util.KeyboardUtils;
import com.transsion.subtitle.C19655a;
import com.transsion.subtitle.R$id;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p528ju.C24469a;

/* JADX INFO: renamed from: com.transsion.subtitle.helper.h */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnTouchListenerC19723h implements View.OnTouchListener {

    /* JADX INFO: renamed from: o */
    public static final a f62961o = new a(null);

    /* JADX INFO: renamed from: a */
    private final ViewGroup f62962a;

    /* JADX INFO: renamed from: b */
    private C24469a f62963b;

    /* JADX INFO: renamed from: c */
    private ImageView f62964c;

    /* JADX INFO: renamed from: d */
    private ImageView f62965d;

    /* JADX INFO: renamed from: e */
    private ImageView f62966e;

    /* JADX INFO: renamed from: f */
    private EditText f62967f;

    /* JADX INFO: renamed from: h */
    private float f62969h;

    /* JADX INFO: renamed from: i */
    private Function2 f62970i;

    /* JADX INFO: renamed from: j */
    private Function0 f62971j;

    /* JADX INFO: renamed from: k */
    private long f62972k;

    /* JADX INFO: renamed from: l */
    private float f62973l;

    /* JADX INFO: renamed from: g */
    private Handler f62968g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: m */
    private final Runnable f62974m = new Runnable() { // from class: com.transsion.subtitle.helper.g
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnTouchListenerC19723h.m82195s(this.f62960a);
        }
    };

    /* JADX INFO: renamed from: n */
    private final c f62975n = new c(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.transsion.subtitle.helper.h$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.helper.h$b */
    public static final class b implements TextWatcher {
        b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s11) {
            Editable text;
            Intrinsics.m97802h(s11, "s");
            ViewOnTouchListenerC19723h.this.f62968g.removeCallbacks(ViewOnTouchListenerC19723h.this.f62974m);
            EditText editText = ViewOnTouchListenerC19723h.this.f62967f;
            if (editText == null || (text = editText.getText()) == null) {
                return;
            }
            ViewOnTouchListenerC19723h viewOnTouchListenerC19723h = ViewOnTouchListenerC19723h.this;
            float fM82193m = ViewOnTouchListenerC19723h.m82193m(viewOnTouchListenerC19723h, text, 0.0f, 2, null);
            if (viewOnTouchListenerC19723h.f62969h != fM82193m) {
                viewOnTouchListenerC19723h.f62969h = fM82193m;
            }
            if (viewOnTouchListenerC19723h.f62973l == fM82193m) {
                return;
            }
            if (!StringsKt.m98226G(text.toString(), "s", false, 2, null)) {
                EditText editText2 = viewOnTouchListenerC19723h.f62967f;
                if (editText2 != null) {
                    editText2.setText(((Object) text) + "s");
                }
                EditText editText3 = viewOnTouchListenerC19723h.f62967f;
                if (editText3 != null) {
                    editText3.setSelection(text.length());
                }
            }
            viewOnTouchListenerC19723h.f62973l = fM82193m;
            viewOnTouchListenerC19723h.m82197u((long) (fM82193m * 1000));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s11, int i11, int i12, int i13) {
            Intrinsics.m97802h(s11, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s11, int i11, int i12, int i13) {
            Intrinsics.m97802h(s11, "s");
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.helper.h$c */
    public static final class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            Intrinsics.m97802h(msg, "msg");
            super.handleMessage(msg);
            int i11 = msg.what;
            int i12 = msg.arg1;
            if (i11 == 1) {
                ViewOnTouchListenerC19723h.this.m82196t(i12 == R$id.iv_sync_adjust_plus);
                sendMessageDelayed(obtainMessage(i11, msg.arg1, msg.arg2), 100L);
            }
        }
    }

    public ViewOnTouchListenerC19723h(ViewGroup viewGroup) {
        this.f62962a = viewGroup;
    }

    /* JADX INFO: renamed from: l */
    private final float m82192l(CharSequence charSequence, float f11) {
        if (charSequence.length() == 0) {
            return f11;
        }
        String string = charSequence.toString();
        if (StringsKt.m98226G(string, "s", false, 2, null)) {
            string = string.substring(0, string.length() - 1);
            Intrinsics.m97801g(string, "substring(...)");
        }
        if (StringsKt.m98132c0(string, "s", false, 2, null)) {
            StringsKt.m98236Q(string, "s", "", false, 4, null);
        }
        try {
            return Float.parseFloat(string);
        } catch (Throwable unused) {
            return f11;
        }
    }

    /* JADX INFO: renamed from: m */
    static /* synthetic */ float m82193m(ViewOnTouchListenerC19723h viewOnTouchListenerC19723h, CharSequence charSequence, float f11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = Float.NaN;
        }
        return viewOnTouchListenerC19723h.m82192l(charSequence, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m82194p(ViewOnTouchListenerC19723h viewOnTouchListenerC19723h, View view) {
        Function0 function0 = viewOnTouchListenerC19723h.f62971j;
        if (function0 != null) {
            function0.invoke();
        }
        viewOnTouchListenerC19723h.f62968g.removeCallbacks(viewOnTouchListenerC19723h.f62974m);
        viewOnTouchListenerC19723h.m82198n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m82195s(ViewOnTouchListenerC19723h viewOnTouchListenerC19723h) {
        viewOnTouchListenerC19723h.m82198n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final void m82196t(boolean z11) {
        float f11 = (z11 ? (this.f62969h * 1000.0f) + 100 : (this.f62969h * 1000.0f) - 100) / 1000.0f;
        this.f62969h = f11;
        EditText editText = this.f62967f;
        if (editText != null) {
            editText.setText(f11 + "s");
        }
        this.f62968g.removeCallbacks(this.f62974m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final void m82197u(long j11) {
        SubtitleDownloadTable subtitleDownloadTableM96011b;
        C24469a c24469a = this.f62963b;
        if (c24469a != null && (subtitleDownloadTableM96011b = c24469a.m96011b()) != null) {
            subtitleDownloadTableM96011b.setDelay(Long.valueOf(j11));
        }
        Function2 function2 = this.f62970i;
        if (function2 != null) {
            function2.invoke(this.f62963b, Long.valueOf(j11));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m82198n() {
        ViewGroup viewGroup = this.f62962a;
        if (viewGroup != null) {
            AbstractC26006c.m102054g(viewGroup);
            KeyboardUtils.m27131e(viewGroup);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m82199o(Function2 function2) {
        this.f62970i = function2;
        ViewGroup viewGroup = this.f62962a;
        this.f62964c = viewGroup != null ? (ImageView) viewGroup.findViewById(R$id.iv_close) : null;
        ViewGroup viewGroup2 = this.f62962a;
        this.f62965d = viewGroup2 != null ? (ImageView) viewGroup2.findViewById(R$id.iv_sync_adjust_plus) : null;
        ViewGroup viewGroup3 = this.f62962a;
        this.f62966e = viewGroup3 != null ? (ImageView) viewGroup3.findViewById(R$id.iv_sync_adjust_minus) : null;
        ViewGroup viewGroup4 = this.f62962a;
        this.f62967f = viewGroup4 != null ? (EditText) viewGroup4.findViewById(R$id.et_sync_adjust) : null;
        ImageView imageView = this.f62964c;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.subtitle.helper.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewOnTouchListenerC19723h.m82194p(this.f62959a, view);
                }
            });
        }
        ImageView imageView2 = this.f62965d;
        if (imageView2 != null) {
            imageView2.setOnTouchListener(this);
        }
        ImageView imageView3 = this.f62966e;
        if (imageView3 != null) {
            imageView3.setOnTouchListener(this);
        }
        ImageView imageView4 = this.f62965d;
        if (imageView4 != null) {
            imageView4.setFocusable(true);
        }
        ImageView imageView5 = this.f62966e;
        if (imageView5 != null) {
            imageView5.setFocusable(true);
        }
        ImageView imageView6 = this.f62965d;
        if (imageView6 != null) {
            imageView6.setClickable(true);
        }
        ImageView imageView7 = this.f62966e;
        if (imageView7 != null) {
            imageView7.setClickable(true);
        }
        EditText editText = this.f62967f;
        if (editText != null) {
            editText.addTextChangedListener(new b());
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.f62972k = System.currentTimeMillis();
            c cVar = this.f62975n;
            cVar.sendMessageDelayed(cVar.obtainMessage(1, view != null ? view.getId() : 0, 0), 1200L);
            if (view != null) {
                view.setPressed(true);
            }
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            this.f62975n.removeCallbacksAndMessages(null);
            if (System.currentTimeMillis() - this.f62972k <= 400) {
                m82196t((view != null ? view.getId() : 0) == R$id.iv_sync_adjust_plus);
            }
            if (view != null) {
                view.setPressed(false);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m82200q(Function2 callback) {
        Intrinsics.m97802h(callback, "callback");
        this.f62970i = callback;
    }

    /* JADX INFO: renamed from: r */
    public final void m82201r(C24469a c24469a) {
        SubtitleDownloadTable subtitleDownloadTableM96011b;
        Long delay;
        this.f62963b = c24469a;
        float fLongValue = ((c24469a == null || (subtitleDownloadTableM96011b = c24469a.m96011b()) == null || (delay = subtitleDownloadTableM96011b.getDelay()) == null) ? 0L : delay.longValue()) / 1000.0f;
        this.f62969h = fLongValue;
        this.f62973l = fLongValue;
        EditText editText = this.f62967f;
        if (editText != null) {
            editText.setText(fLongValue + "s");
        }
        C19655a.f62783a.m81952a(ViewOnTouchListenerC19723h.class.getSimpleName() + " --> setCurDefVideoSubtitleBean() --> cur duration = " + this.f62969h);
    }
}
