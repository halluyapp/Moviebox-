package com.transsion.postdetail.shorttv.factory;

import android.os.Build;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.player.orplayer.InterfaceC16634g;
import com.transsion.postdetail.util.ShortTVFloatManager;
import com.transsion.videofloat.bean.FloatActionType;
import com.transsion.videofloat.bean.FloatPlayType;
import com.transsion.videofloat.manager.C21106a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p659os.C26724j;
import p723qx.C27136c;
import p723qx.InterfaceC27135b;
import p723qx.InterfaceC27138e;
import p755rx.C27425a;
import p824ux.InterfaceC28047a;
import p848vs.InterfaceC28216g;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.postdetail.shorttv.factory.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C16892g implements InterfaceC28216g {

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv.factory.g$a */
    public static final class a implements InterfaceC28047a {
        a() {
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: a */
        public boolean mo70368a(C27425a c27425a) {
            return ShortTVFloatManager.f57812b.m74929r(c27425a);
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: b */
        public void mo70369b(C27425a c27425a) {
            ShortTVFloatManager shortTVFloatManager = ShortTVFloatManager.f57812b;
            shortTVFloatManager.m74927o();
            shortTVFloatManager.m74930t(c27425a);
        }

        @Override // p824ux.InterfaceC28047a
        /* JADX INFO: renamed from: c */
        public void mo70370c(C27425a c27425a) {
            InterfaceC28047a.a.m109026a(this, c27425a);
            ShortTVFloatManager.f57812b.m74928p(c27425a);
        }
    }

    /* JADX INFO: renamed from: j */
    private final C27425a m73676j(C26724j c26724j) {
        C27425a c27425a = new C27425a(c26724j.m104523g(), c26724j.m104519c(), null, FloatPlayType.SHORT_TV, c26724j.m104525i(), c26724j.m104524h(), c26724j.m104517a(), "", c26724j.m104521e());
        c27425a.m106615J(Integer.valueOf(SubjectType.SHORT_TV.getValue()));
        c27425a.m106606A(c26724j.m104518b());
        c27425a.m106607B(c26724j.m104520d());
        return c27425a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final Unit m73677k(FragmentActivity fragmentActivity, boolean z11) {
        if (z11) {
            fragmentActivity.finish();
        }
        return Unit.f75682a;
    }

    @Override // p848vs.InterfaceC28216g
    /* JADX INFO: renamed from: a */
    public void mo73678a(FragmentActivity activity, boolean z11, boolean z12, ViewGroup viewGroup) {
        Intrinsics.m97802h(activity, "activity");
        InterfaceC27138e.a aVar = InterfaceC27138e.f82251a;
        if (aVar.m105606b().mo86568c() && C14496b.f50966a.m65344b().getBoolean("k_pip_enable", true)) {
            aVar.m105606b().mo86566a(activity, true, z12, viewGroup);
        }
    }

    @Override // p848vs.InterfaceC28216g
    /* JADX INFO: renamed from: b */
    public void mo73679b(FragmentActivity activity, String subjectId, String pageName, String str) {
        Intrinsics.m97802h(activity, "activity");
        Intrinsics.m97802h(subjectId, "subjectId");
        Intrinsics.m97802h(pageName, "pageName");
        InterfaceC27135b.f82245a.m105597c().mo86624e(activity, subjectId, null, pageName, str);
    }

    @Override // p848vs.InterfaceC28216g
    /* JADX INFO: renamed from: c */
    public void mo73680c() {
        InterfaceC27135b.b.m105599a(InterfaceC27135b.f82245a.m105597c(), false, 1, null);
    }

    @Override // p848vs.InterfaceC28216g
    /* JADX INFO: renamed from: d */
    public InterfaceC16634g mo73681d(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return C21106a0.f66016a.m86578b(ShortTVFloatManager.f57812b.m74926k(str));
    }

    @Override // p848vs.InterfaceC28216g
    /* JADX INFO: renamed from: e */
    public boolean mo73682e(InterfaceC16634g interfaceC16634g) {
        return C21106a0.f66016a.m86579c(interfaceC16634g);
    }

    @Override // p848vs.InterfaceC28216g
    /* JADX INFO: renamed from: f */
    public boolean mo73683f(InterfaceC16634g interfaceC16634g) {
        return C27136c.f82250a.m105602c(interfaceC16634g);
    }

    @Override // p848vs.InterfaceC28216g
    /* JADX INFO: renamed from: g */
    public void mo73684g(boolean z11, FragmentActivity fragmentActivity, C26724j bean) {
        Intrinsics.m97802h(bean, "bean");
        if (z11) {
            if (fragmentActivity == null || fragmentActivity.isDestroyed() || fragmentActivity.isFinishing()) {
                return;
            }
            C27425a c27425aM73676j = m73676j(bean);
            if (Build.VERSION.SDK_INT >= 31) {
                InterfaceC27138e.f82251a.m105606b().mo86572g(fragmentActivity, c27425aM73676j);
            }
        }
        InterfaceC27138e.f82251a.m105606b().onPipModeChanged(z11);
    }

    @Override // p848vs.InterfaceC28216g
    /* JADX INFO: renamed from: h */
    public void mo73685h(final FragmentActivity activity, C26724j bean) {
        Intrinsics.m97802h(activity, "activity");
        Intrinsics.m97802h(bean, "bean");
        C27425a c27425aM73676j = m73676j(bean);
        if (!C14496b.f50966a.m65344b().getBoolean("k_pip_enable", true)) {
            C26866a.f81698a.m104912c("VideoFloat", "shottv 设置页pip开关被关闭了", true);
            return;
        }
        InterfaceC27138e.a aVar = InterfaceC27138e.f82251a;
        if (aVar.m105606b().mo86568c()) {
            C26866a.f81698a.m104912c("VideoFloat-pip", "shottv 当前可用画中画，使用画中画播放", true);
            aVar.m105606b().mo86574i(activity, c27425aM73676j, FloatActionType.HOME, false);
        } else {
            ShortTVFloatManager.f57812b.m74931w(bean.m104522f());
            InterfaceC27135b.f82245a.m105597c().mo86626g(activity, c27425aM73676j, false, false, new Function1() { // from class: com.transsion.postdetail.shorttv.factory.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C16892g.m73677k(activity, ((Boolean) obj).booleanValue());
                }
            }, new a());
        }
    }
}
