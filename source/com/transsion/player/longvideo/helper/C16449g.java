package com.transsion.player.longvideo.helper;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.transsion.player.longvideo.p302ui.LongVodUiType;
import jo.InterfaceC24450a;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p582lo.C25661j;
import p582lo.C25662k;
import p710qk.InterfaceC27084c;

/* JADX INFO: renamed from: com.transsion.player.longvideo.helper.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C16449g extends AbstractC16443d {

    /* JADX INFO: renamed from: d */
    private boolean f55534d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m71809g(C16449g c16449g, C25661j c25661j, View view) {
        c16449g.f55534d = true;
        FrameLayout gameContainer = c25661j.f77908o.f77933g;
        Intrinsics.m97801g(gameContainer, "gameContainer");
        AbstractC26006c.m102054g(gameContainer);
        AppCompatImageView ivGameClose = c25661j.f77908o.f77936j;
        Intrinsics.m97801g(ivGameClose, "ivGameClose");
        AbstractC26006c.m102054g(ivGameClose);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m71810i(C16449g c16449g) {
        C25662k c25662k;
        AppCompatImageView appCompatImageView;
        C25661j c25661jM71804b = c16449g.m71804b();
        if (c25661jM71804b == null || (c25662k = c25661jM71804b.f77908o) == null || (appCompatImageView = c25662k.f77936j) == null) {
            return;
        }
        AbstractC26006c.m102058k(appCompatImageView);
    }

    @Override // com.transsion.player.longvideo.helper.AbstractC16443d
    /* JADX INFO: renamed from: c */
    public void mo71805c(String str, final C25661j viewBinding) {
        Intrinsics.m97802h(viewBinding, "viewBinding");
        super.mo71805c(str, viewBinding);
        viewBinding.f77908o.f77936j.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.player.longvideo.helper.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16449g.m71809g(this.f55531a, viewBinding, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final void m71811h(LongVodUiType uiType) {
        InterfaceC24450a.b bVarM71803a;
        View viewMo70375e;
        ViewGroup viewGroup;
        C25662k c25662k;
        FrameLayout frameLayout;
        C25662k c25662k2;
        FrameLayout frameLayout2;
        C25662k c25662k3;
        FrameLayout frameLayout3;
        C25662k c25662k4;
        AppCompatImageView appCompatImageView;
        C25662k c25662k5;
        FrameLayout frameLayout4;
        ViewGroup viewGroup2;
        Intrinsics.m97802h(uiType, "uiType");
        InterfaceC24450a.b bVarM71803a2 = m71803a();
        if (bVarM71803a2 != null) {
            bVarM71803a2.mo70374d(uiType);
        }
        if (uiType == LongVodUiType.MIDDLE || this.f55534d || (bVarM71803a = m71803a()) == null || (viewMo70375e = bVarM71803a.mo70375e()) == 0) {
            return;
        }
        ViewParent parent = viewMo70375e.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup = viewGroup2;
            viewGroup.removeView(viewMo70375e);
        }
        viewGroup = viewGroup2;
        InterfaceC27084c interfaceC27084c = viewMo70375e instanceof InterfaceC27084c ? (InterfaceC27084c) viewMo70375e : null;
        if (interfaceC27084c != null) {
            interfaceC27084c.setPageStyle("fullscreen");
        }
        C25661j c25661jM71804b = m71804b();
        if (c25661jM71804b != null && (c25662k5 = c25661jM71804b.f77908o) != null && (frameLayout4 = c25662k5.f77933g) != null) {
            AbstractC26006c.m102058k(frameLayout4);
        }
        C25661j c25661jM71804b2 = m71804b();
        if (c25661jM71804b2 != null && (c25662k4 = c25661jM71804b2.f77908o) != null && (appCompatImageView = c25662k4.f77936j) != null) {
            AbstractC26006c.m102054g(appCompatImageView);
        }
        C25661j c25661jM71804b3 = m71804b();
        if (c25661jM71804b3 != null && (c25662k3 = c25661jM71804b3.f77908o) != null && (frameLayout3 = c25662k3.f77933g) != null) {
            frameLayout3.postDelayed(new Runnable() { // from class: com.transsion.player.longvideo.helper.e
                @Override // java.lang.Runnable
                public final void run() {
                    C16449g.m71810i(this.f55529a);
                }
            }, 3000L);
        }
        C25661j c25661jM71804b4 = m71804b();
        if (c25661jM71804b4 != null && (c25662k2 = c25661jM71804b4.f77908o) != null && (frameLayout2 = c25662k2.f77933g) != null) {
            frameLayout2.removeAllViews();
        }
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C25661j c25661jM71804b5 = m71804b();
        if (c25661jM71804b5 == null || (c25662k = c25661jM71804b5.f77908o) == null || (frameLayout = c25662k.f77933g) == null) {
            return;
        }
        frameLayout.addView(viewMo70375e, layoutParams);
    }
}
