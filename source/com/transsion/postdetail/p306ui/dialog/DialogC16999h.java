package com.transsion.postdetail.p306ui.dialog;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.appcompat.app.DialogC0322w;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.transsion.postdetail.R$drawable;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.R$layout;
import com.transsion.postdetail.R$style;
import com.transsion.postdetail.bean.NegativeFeedbackAction;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import p462hj.C23860f;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.postdetail.ui.dialog.h */
/* JADX INFO: loaded from: classes6.dex */
public final class DialogC16999h extends DialogC0322w {

    /* JADX INFO: renamed from: d */
    public static final a f57045d = new a(null);

    /* JADX INFO: renamed from: e */
    private static final List f57046e = CollectionsKt.m97509o("dislike_post", "dislike_category", "dislike_user", "report");

    /* JADX INFO: renamed from: a */
    private final List f57047a;

    /* JADX INFO: renamed from: b */
    private final String f57048b;

    /* JADX INFO: renamed from: c */
    private Function1 f57049c;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.dialog.h$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC16999h(Context context, List actions, String pageName) {
        super(context, R$style.NegativeFeedbackDialogTheme);
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(actions, "actions");
        Intrinsics.m97802h(pageName, "pageName");
        this.f57047a = actions;
        this.f57048b = pageName;
    }

    /* JADX INFO: renamed from: i */
    private final void m73962i(String str, String str2) {
        HashMap map = new HashMap();
        map.put("dialog_name", "post_feedback");
        map.put("module_name", str2);
        C24662i.f75350a.m96874F(str, "feature_click", map);
    }

    /* JADX INFO: renamed from: k */
    private final void m73963k() {
        final View viewFindViewById;
        final View viewFindViewById2 = findViewById(R$id.dragHandle);
        if (viewFindViewById2 == null || (viewFindViewById = findViewById(R$id.llDialogRoot)) == null) {
            return;
        }
        final float fM27313a = AbstractC5776a0.m27313a(40.0f);
        viewFindViewById.post(new Runnable() { // from class: com.transsion.postdetail.ui.dialog.f
            @Override // java.lang.Runnable
            public final void run() {
                DialogC16999h.m73964l(viewFindViewById2, viewFindViewById);
            }
        });
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        viewFindViewById2.setOnTouchListener(new View.OnTouchListener() { // from class: com.transsion.postdetail.ui.dialog.g
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DialogC16999h.m73965m(floatRef, viewFindViewById, fM27313a, this, view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m73964l(View view, View view2) {
        int iM27313a = AbstractC5776a0.m27313a(20.0f);
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= iM27313a;
        rect.bottom += iM27313a;
        rect.left = 0;
        rect.right = view2.getWidth();
        view2.setTouchDelegate(new TouchDelegate(rect, view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final boolean m73965m(Ref.FloatRef floatRef, View view, float f11, DialogC16999h dialogC16999h, View view2, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            floatRef.element = motionEvent.getRawY();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                view.setTranslationY(RangesKt.m97934d(motionEvent.getRawY() - floatRef.element, 0.0f));
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        if (motionEvent.getRawY() - floatRef.element > f11) {
            dialogC16999h.dismiss();
            return true;
        }
        view.animate().translationY(0.0f).setDuration(200L).start();
        return true;
    }

    /* JADX INFO: renamed from: n */
    private final void m73966n() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.llOptions);
        if (linearLayout == null) {
            return;
        }
        final int i11 = 0;
        for (Object obj : this.f57047a) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            final NegativeFeedbackAction negativeFeedbackAction = (NegativeFeedbackAction) obj;
            View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.item_negative_feedback_option, (ViewGroup) linearLayout, false);
            AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate.findViewById(R$id.ivOptionIcon);
            String iconUrl = negativeFeedbackAction.getIconUrl();
            if (iconUrl == null || iconUrl.length() == 0) {
                appCompatImageView.setImageResource(R$drawable.ic_post_negative_feedback);
            } else {
                C23860f.a aVar = C23860f.f72909a;
                Context context = getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94468g = aVar.m94457m(context).m94468g(iconUrl);
                Intrinsics.m97799e(appCompatImageView);
                bVarM94468g.m94465d(appCompatImageView);
            }
            ((AppCompatTextView) viewInflate.findViewById(R$id.tvOptionTitle)).setText(negativeFeedbackAction.getTitle());
            if (i11 > 0) {
                ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
                Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = AbstractC5776a0.m27313a(16.0f);
                viewInflate.setLayoutParams(layoutParams2);
            }
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.dialog.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DialogC16999h.m73967o(this.f57036a, i11, negativeFeedbackAction, view);
                }
            });
            linearLayout.addView(viewInflate);
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m73967o(DialogC16999h dialogC16999h, int i11, NegativeFeedbackAction negativeFeedbackAction, View view) {
        String str = dialogC16999h.f57048b;
        List list = f57046e;
        dialogC16999h.m73962i(str, (String) ((i11 < 0 || i11 >= list.size()) ? "" : list.get(i11)));
        Function1 function1 = dialogC16999h.f57049c;
        if (function1 != null) {
            function1.invoke(negativeFeedbackAction);
        }
        dialogC16999h.dismiss();
    }

    /* JADX INFO: renamed from: j */
    public final void m73968j(Function1 function1) {
        this.f57049c = function1;
    }

    @Override // androidx.appcompat.app.DialogC0322w, androidx.activity.DialogC0236q, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.dialog_negative_feedback);
        setCanceledOnTouchOutside(true);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(R$style.NegativeFeedbackDialogAnimation);
            window.setDimAmount(0.42f);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes == null) {
                attributes = new WindowManager.LayoutParams();
            }
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        m73966n();
        m73963k();
    }
}
