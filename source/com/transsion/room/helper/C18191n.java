package com.transsion.room.helper;

import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.transsion.room.R$layout;
import fk.AbstractC23384a;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.room.helper.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C18191n {

    /* JADX INFO: renamed from: a */
    public static final C18191n f59337a = new C18191n();

    private C18191n() {
    }

    /* JADX INFO: renamed from: b */
    private final ObjectAnimator m77104b(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, -AbstractC23384a.m92908b(12));
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        Intrinsics.m97801g(objectAnimatorOfFloat, "apply(...)");
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m77105d(ObjectAnimator objectAnimator, FrameLayout frameLayout, View view) {
        try {
            Result.Companion companion = Result.INSTANCE;
            objectAnimator.cancel();
            frameLayout.removeView(view);
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m77106c(Activity activity) {
        Intrinsics.m97802h(activity, "activity");
        final FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
        final View viewInflate = LayoutInflater.from(activity).inflate(R$layout.layout_room_tab_refresh, (ViewGroup) null);
        Intrinsics.m97799e(viewInflate);
        final ObjectAnimator objectAnimatorM77104b = m77104b(viewInflate);
        objectAnimatorM77104b.start();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = AbstractC23384a.m92908b(80);
        frameLayout.addView(viewInflate, layoutParams);
        C24662i.f75350a.m96872D("room_home", MapsKt.m97578m(TuplesKt.m97108a("opt_type", "refresh_float")));
        frameLayout.postDelayed(new Runnable() { // from class: com.transsion.room.helper.m
            @Override // java.lang.Runnable
            public final void run() {
                C18191n.m77105d(objectAnimatorM77104b, frameLayout, viewInflate);
            }
        }, 3000L);
    }
}
