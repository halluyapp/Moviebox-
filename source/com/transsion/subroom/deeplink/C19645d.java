package com.transsion.subroom.deeplink;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.p1004lifecycle.AbstractC3186b;
import ch.C5096b;
import ck.AbstractC5114k;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14451b;
import com.transsion.baselib.report.C14489h;
import com.transsion.baselib.report.C14492k;
import com.transsion.baseui.activity.BaseCommonActivity;
import com.transsion.subroom.activity.MainActivity;
import com.transsion.subroom.activity.SplashActivity;
import ki.C24649b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.mvel2.ast.ASTNode;
import p349dh.C22982c;
import p382el.InterfaceC23181a;
import p410fg.C23361c;
import p871wg.AbstractC28362a;
import p871wg.C28365d;
import p910xj.C28607a;

/* JADX INFO: renamed from: com.transsion.subroom.deeplink.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C19645d extends AbstractC3186b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: d */
    public static final a f62711d = new a(null);

    /* JADX INFO: renamed from: b */
    private final Lazy f62712b;

    /* JADX INFO: renamed from: c */
    private Uri f62713c;

    /* JADX INFO: renamed from: com.transsion.subroom.deeplink.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.subroom.deeplink.d$b */
    public static final class b extends AbstractC28362a {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Uri f62715e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Function0 f62716f;

        b(Uri uri, Function0 function0) {
            this.f62715e = uri;
            this.f62716f = function0;
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            C19645d c19645d = C19645d.this;
            Uri uri = this.f62715e;
            c19645d.m81803l(uri, uri, null, this.f62716f);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(ILaunchApi.UrlBean urlBean) {
            String url;
            super.mo66458c(urlBean);
            if (urlBean != null) {
                try {
                    url = urlBean.getUrl();
                    if (url == null) {
                        url = "";
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            } else {
                url = "";
            }
            if (!TextUtils.isEmpty(url)) {
                C19645d.this.m81803l(this.f62715e, Uri.parse(url), null, this.f62716f);
                return;
            }
            C19645d c19645d = C19645d.this;
            Uri uri = this.f62715e;
            c19645d.m81803l(uri, uri, null, this.f62716f);
        }
    }

    /* JADX INFO: renamed from: com.transsion.subroom.deeplink.d$c */
    public static final class c extends C23361c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function0 f62717a;

        c(Function0 function0) {
            this.f62717a = function0;
        }

        @Override // p410fg.C23361c
        /* JADX INFO: renamed from: b */
        public void mo81807b(Navigator navigator) {
            Intrinsics.m97802h(navigator, "navigator");
            Function0 function0 = this.f62717a;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // p410fg.C23361c
        /* JADX INFO: renamed from: c */
        public void mo81808c(Navigator navigator) {
            Intrinsics.m97802h(navigator, "navigator");
        }

        @Override // p410fg.C23361c
        /* JADX INFO: renamed from: d */
        public void mo81809d(Navigator navigator, int i11) {
            Intrinsics.m97802h(navigator, "navigator");
            Function0 function0 = this.f62717a;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19645d(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f62712b = LazyKt.m97097b(new Function0() { // from class: com.transsion.subroom.deeplink.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C19645d.m81801j();
            }
        });
    }

    /* JADX INFO: renamed from: e */
    private final void m81797e(Uri uri, Function0 function0) {
        ILaunchApi iLaunchApiM81798f = m81798f();
        String string = uri.toString();
        Intrinsics.m97801g(string, "toString(...)");
        ILaunchApi.C19641a.m81792a(iLaunchApiM81798f, string, null, 2, null).m95079f(C28365d.f87067a.m109702c()).subscribe(new b(uri, function0));
    }

    /* JADX INFO: renamed from: f */
    private final ILaunchApi m81798f() {
        return (ILaunchApi) this.f62712b.getValue();
    }

    /* JADX INFO: renamed from: g */
    private final void m81799g(Context context, Function0 function0) {
        try {
            Uri uri = this.f62713c;
            String queryParameter = uri != null ? uri.getQueryParameter(TmcConstants.EXTRA_BACK_TO_MINIAPP_DEEPLINK) : null;
            if (queryParameter != null && queryParameter.length() != 0 && context != null) {
                C28607a.f87785a.m110335b(context, queryParameter);
                return;
            }
        } catch (Throwable unused) {
        }
        if (!C14451b.f50862a.m65156e(this.f62713c)) {
            m81803l(null, this.f62713c, context, function0);
            return;
        }
        Uri uri2 = this.f62713c;
        if (uri2 != null) {
            m81797e(uri2, function0);
        }
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ void m81800h(C19645d c19645d, Context context, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        c19645d.m81799g(context, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final ILaunchApi m81801j() {
        return (ILaunchApi) C22982c.f70163e.m91553a().m91552h(ILaunchApi.class);
    }

    /* JADX INFO: renamed from: k */
    private final boolean m81802k() {
        for (Activity activity : C14492k.f50955a.m65320m()) {
            if ((activity instanceof SplashActivity) || (activity instanceof MainActivity)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final void m81803l(Uri uri, Uri uri2, Context context, Function0 function0) {
        String string;
        InterfaceC23181a interfaceC23181a;
        String string2;
        String str = "";
        if (uri != null) {
            try {
                string = uri.toString();
                if (string == null) {
                    string = "";
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
            e11.printStackTrace();
            return;
        }
        string = "";
        if (uri2 != null && (string2 = uri2.toString()) != null) {
            str = string2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("toLandingPage short url: ");
        sb2.append(string);
        sb2.append(" whole url ");
        sb2.append(str);
        if (uri2 != null) {
            try {
                String queryParameter = uri2.getQueryParameter("inviteCode");
                if (queryParameter != null && (interfaceC23181a = (InterfaceC23181a) TheRouter.m61774d(InterfaceC23181a.class, new Object[0])) != null) {
                    interfaceC23181a.mo66555a(queryParameter);
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
        C14489h c14489h = C14489h.f50945a;
        c14489h.m65303i(string, str);
        C5096b.f17579a.m23862b("X-UtmSource", c14489h.m65299b());
        Uri uriM65157g = C14451b.f50862a.m65157g(uri2);
        if (uriM65157g != null) {
            AbstractC5114k.m23930m(uriM65157g).m61872z(BaseCommonActivity.EXTRA_SHOW_HOME_BUTTON, uriM65157g.getBooleanQueryParameter(BaseCommonActivity.EXTRA_SHOW_HOME_BUTTON, false)).m61870u(context, new c(function0));
        } else if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m81804m(Context context, boolean z11) {
        Intent intent = new Intent(context, (Class<?>) SplashActivity.class);
        intent.putExtra("from", "deeplink");
        intent.putExtra("without_ad", z11);
        if (!(context instanceof Activity)) {
            intent.addFlags(ASTNode.DEOP);
        }
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: i */
    public final void m81805i(Context context, Uri uri, Function0 onArrival) {
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(uri, "uri");
        Intrinsics.m97802h(onArrival, "onArrival");
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("withoutMain", false);
        boolean booleanQueryParameter2 = uri.getBooleanQueryParameter("withoutAd", false);
        C19643b.f62709a.m81794b(uri.getBooleanQueryParameter("skipTwiceBack", false));
        C14489h.f50945a.m65304k(uri);
        this.f62713c = uri;
        if (booleanQueryParameter2) {
            C24649b.f75311a.m96815b();
        }
        if (!m81802k()) {
            m81799g(context, onArrival);
        } else {
            if (booleanQueryParameter) {
                m81799g(context, onArrival);
                return;
            }
            m14886b().registerActivityLifecycleCallbacks(this);
            m81804m(context, booleanQueryParameter2);
            onArrival.invoke();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity p11, Bundle bundle) {
        Intrinsics.m97802h(p11, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity p11) {
        Intrinsics.m97802h(p11, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity p11) {
        Intrinsics.m97802h(p11, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity p11) {
        Intrinsics.m97802h(p11, "p0");
        try {
            if (p11 instanceof MainActivity) {
                m14886b().unregisterActivityLifecycleCallbacks(this);
                m81800h(this, p11, null, 2, null);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity p11, Bundle p12) {
        Intrinsics.m97802h(p11, "p0");
        Intrinsics.m97802h(p12, "p1");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity p11) {
        Intrinsics.m97802h(p11, "p0");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity p11) {
        Intrinsics.m97802h(p11, "p0");
    }
}
