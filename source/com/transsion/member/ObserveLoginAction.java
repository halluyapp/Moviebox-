package com.transsion.member;

import com.therouter.TheRouter;
import com.transsnet.loginapi.bean.UserInfo;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p352dn.InterfaceC22998b;
import p352dn.InterfaceC23002f;
import p441gz.InterfaceC23704a;
import p441gz.InterfaceC23705b;

/* JADX INFO: loaded from: classes.dex */
public final class ObserveLoginAction implements InterfaceC23705b {

    /* JADX INFO: renamed from: c */
    public static final C15776a f54204c = new C15776a(null);

    /* JADX INFO: renamed from: d */
    public static final int f54205d = 8;

    /* JADX INFO: renamed from: e */
    private static final ObserveLoginAction f54206e = new ObserveLoginAction();

    /* JADX INFO: renamed from: a */
    private final Lazy f54207a = LazyKt.m97097b(new Function0() { // from class: com.transsion.member.g0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ObserveLoginAction.m69939k();
        }
    });

    /* JADX INFO: renamed from: b */
    private final CopyOnWriteArrayList f54208b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: com.transsion.member.ObserveLoginAction$a */
    /* JADX INFO: loaded from: classes5.dex */
    public static final class C15776a {
        private C15776a() {
        }

        public /* synthetic */ C15776a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ObserveLoginAction m69946a() {
            return ObserveLoginAction.f54206e;
        }
    }

    private ObserveLoginAction() {
    }

    /* JADX INFO: renamed from: f */
    private final void m69936f() {
        C15777a.f54210a.m69949c(m69937g() + " --> addLoginListener() --> 设置用户登录状态监听");
        InterfaceC23704a interfaceC23704aM69938h = m69938h();
        if (interfaceC23704aM69938h != null) {
            interfaceC23704aM69938h.mo90392n(this);
        }
    }

    /* JADX INFO: renamed from: g */
    private final String m69937g() {
        String simpleName = ObserveLoginAction.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: h */
    private final InterfaceC23704a m69938h() {
        return (InterfaceC23704a) this.f54207a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC23704a m69939k() {
        return (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Unit m69940l(ObserveLoginAction observeLoginAction) {
        observeLoginAction.m69941m();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: m */
    private final void m69941m() {
        C15777a.f54210a.m69947a(m69937g() + " --> onLogin() --> 监听到用户登录行为 --> 获取会员权益 --> refresh() --> 刷新UI");
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new ObserveLoginAction$refresh$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m69942e(InterfaceC23002f listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f54208b.add(listener);
    }

    /* JADX INFO: renamed from: i */
    public final void m69943i() {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new ObserveLoginAction$getMemberSuccess$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m69944j() {
        f54206e.m69936f();
    }

    /* JADX INFO: renamed from: n */
    public final void m69945n(InterfaceC23002f listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f54208b.remove(listener);
    }

    @Override // p441gz.InterfaceC23705b
    public void onLogin(UserInfo user) {
        Intrinsics.m97802h(user, "user");
        InterfaceC23705b.a.m93655a(this, user);
        C15777a.f54210a.m69947a(m69937g() + " --> onLogin() --> 监听到用户登录行为 --> 获取会员权益");
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            interfaceC22998b.mo69844C(new Function0() { // from class: com.transsion.member.h0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ObserveLoginAction.m69940l(this.f54327a);
                }
            });
        }
    }

    @Override // p441gz.InterfaceC23705b
    public void onLogout() {
        InterfaceC23705b.a.m93656b(this);
        C15777a.f54210a.m69947a(m69937g() + " --> onLogout() --> 监听到用户登出行为 --> 获取会员权益");
        C15886w.f54411a.m70116b().putBoolean("kv_is_skip_ad", true);
    }

    @Override // p441gz.InterfaceC23705b
    public void onUpdateUserInfo(UserInfo userInfo) {
        InterfaceC23705b.a.m93657c(this, userInfo);
    }
}
