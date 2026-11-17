package com.transsion.audio.view;

import android.R;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import com.therouter.TheRouter;
import com.transsion.audio.fragment.AudioBottomSheetFragment;
import com.transsion.baselib.p291db.audio.AudioBean;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p415fq.InterfaceC23410a;
import p415fq.InterfaceC23411b;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.audio.view.d */
/* JADX INFO: loaded from: classes5.dex */
public class C14266d {

    /* JADX INFO: renamed from: a */
    private FloatingMagnetView f50527a;

    /* JADX INFO: renamed from: b */
    private WeakReference f50528b;

    /* JADX INFO: renamed from: c */
    private final List f50529c;

    /* JADX INFO: renamed from: d */
    private String f50530d;

    /* JADX INFO: renamed from: e */
    private AudioBean f50531e;

    /* JADX INFO: renamed from: com.transsion.audio.view.d$a */
    class a implements EnFloatingView.InterfaceC14262f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ FrameLayout f50532a;

        a(FrameLayout frameLayout) {
            this.f50532a = frameLayout;
        }

        @Override // com.transsion.audio.view.EnFloatingView.InterfaceC14262f
        /* JADX INFO: renamed from: a */
        public void mo64646a(ViewGroup viewGroup) {
            C14266d c14266d = C14266d.this;
            c14266d.m64669i((ViewGroup) c14266d.f50528b.get());
            for (InterfaceC23411b.a aVar : C14266d.this.f50529c) {
                if (aVar != null) {
                    aVar.onRemove();
                }
            }
            C14266d.this.m64679w(8);
        }

        @Override // com.transsion.audio.view.EnFloatingView.InterfaceC14262f
        /* JADX INFO: renamed from: b */
        public void mo64647b(ViewGroup viewGroup) {
            AudioBottomSheetFragment.INSTANCE.m64489a(C14266d.this.f50531e).show(((FragmentActivity) this.f50532a.getContext()).getSupportFragmentManager(), "dialog");
        }
    }

    /* JADX INFO: renamed from: com.transsion.audio.view.d$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        private static final C14266d f50534a = new C14266d();
    }

    private C14266d() {
        this.f50530d = "";
        this.f50531e = null;
        this.f50529c = new ArrayList();
    }

    /* JADX INFO: renamed from: e */
    private void m64660e(View view) {
        FrameLayout frameLayoutM64664n;
        if (m64664n() == null || (frameLayoutM64664n = m64664n()) == null) {
            return;
        }
        frameLayoutM64664n.addView(view);
    }

    /* JADX INFO: renamed from: j */
    private void m64661j(Activity activity, AudioBean audioBean) {
        if (this.f50527a == null) {
            EnFloatingView enFloatingView = new EnFloatingView(activity);
            this.f50527a = enFloatingView;
            m64660e(enFloatingView);
        } else {
            m64679w(0);
            if (!((InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0])).mo23878b(audioBean) && this.f50527a.isPackUp()) {
                this.f50527a.expanded();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static C14266d m64662k() {
        return b.f50534a;
    }

    /* JADX INFO: renamed from: l */
    private FrameLayout m64663l(Activity activity) {
        if (activity == null) {
            return null;
        }
        try {
            return (FrameLayout) activity.getWindow().getDecorView().findViewById(R.id.content);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    private FrameLayout m64664n() {
        WeakReference weakReference = this.f50528b;
        if (weakReference == null) {
            return null;
        }
        return (FrameLayout) weakReference.get();
    }

    /* JADX INFO: renamed from: d */
    public C14266d m64665d(Activity activity, AudioBean audioBean) {
        m64661j(activity, audioBean);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C14266d m64666f(Activity activity) {
        m64667g(activity, m64663l(activity));
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void m64667g(Activity activity, FrameLayout frameLayout) {
        FloatingMagnetView floatingMagnetView;
        String simpleName = activity.getClass().getSimpleName();
        if (!TextUtils.equals(this.f50530d, simpleName)) {
            this.f50530d = simpleName;
            FloatingMagnetView floatingMagnetView2 = this.f50527a;
            if (floatingMagnetView2 != null) {
                floatingMagnetView2.packUp();
            }
        }
        if (frameLayout == null || (floatingMagnetView = this.f50527a) == null) {
            this.f50528b = new WeakReference(frameLayout);
            return;
        }
        floatingMagnetView.setOnOptionListener(new a(frameLayout));
        if (this.f50527a.getParent() == frameLayout) {
            return;
        }
        if (this.f50527a.getParent() != null) {
            ((ViewGroup) this.f50527a.getParent()).removeView(this.f50527a);
        }
        this.f50527a.attach(activity);
        this.f50528b = new WeakReference(frameLayout);
        frameLayout.addView(this.f50527a);
    }

    /* JADX INFO: renamed from: h */
    public C14266d m64668h(Activity activity) {
        m64669i(m64663l(activity));
        return this;
    }

    /* JADX INFO: renamed from: i */
    public void m64669i(ViewGroup viewGroup) {
        FloatingMagnetView floatingMagnetView = this.f50527a;
        if (floatingMagnetView != null && viewGroup != null && ViewCompat.isAttachedToWindow(floatingMagnetView)) {
            viewGroup.removeView(this.f50527a);
        }
        if (m64664n() == viewGroup) {
            this.f50528b = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public AudioBean m64670m() {
        return this.f50531e;
    }

    /* JADX INFO: renamed from: o */
    public Boolean m64671o() {
        return Boolean.valueOf(this.f50527a.getVisibility() == 8);
    }

    /* JADX INFO: renamed from: p */
    public C14266d m64672p(Long l11, Long l12) {
        if (this.f50527a != null) {
            int iLongValue = (int) (((l11.longValue() * 1.0f) / l12.longValue()) * 100.0f);
            if (iLongValue > 100) {
                iLongValue = 100;
            }
            this.f50527a.onProgress(iLongValue);
        }
        return this;
    }

    /* JADX INFO: renamed from: q */
    public C14266d m64673q(int i11) {
        FloatingMagnetView floatingMagnetView = this.f50527a;
        if (floatingMagnetView != null) {
            floatingMagnetView.onStateChanged(i11);
        }
        return this;
    }

    /* JADX INFO: renamed from: r */
    public void m64674r() {
        FloatingMagnetView floatingMagnetView = this.f50527a;
        if (floatingMagnetView != null) {
            floatingMagnetView.packUp();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m64675s() {
        FloatingMagnetView floatingMagnetView = this.f50527a;
        if (floatingMagnetView != null) {
            floatingMagnetView.packUpAnimation();
        }
    }

    /* JADX INFO: renamed from: t */
    public C14266d m64676t(AudioBean audioBean) {
        if (audioBean != null) {
            this.f50531e = audioBean;
            C26866a.f81698a.m104912c("EnFloatingView", "prepare..mEnFloatingView.." + this.f50527a, false);
            FloatingMagnetView floatingMagnetView = this.f50527a;
            if (floatingMagnetView != null) {
                floatingMagnetView.prepare();
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: u */
    public void m64677u(InterfaceC23411b.a aVar) {
        this.f50529c.remove(aVar);
    }

    /* JADX INFO: renamed from: v */
    public void m64678v(InterfaceC23411b.a aVar) {
        this.f50529c.add(aVar);
    }

    /* JADX INFO: renamed from: w */
    public C14266d m64679w(int i11) {
        FloatingMagnetView floatingMagnetView = this.f50527a;
        if (floatingMagnetView != null && floatingMagnetView.getVisibility() != i11) {
            this.f50527a.setVisibility(i11);
        }
        return this;
    }

    /* JADX INFO: renamed from: x */
    public void m64680x(String str) {
        m64670m().setTitle(str);
    }
}
