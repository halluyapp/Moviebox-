package com.transsion.shorttv_pugc.base.locale;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import androidx.compose.p019ui.text.platform.extensions.AbstractC2120a;
import ch.C5096b;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.locale.AbstractC14469e;
import com.transsion.shorttv_pugc.utils.C19529h;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.locale.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C19239d {

    /* JADX INFO: renamed from: f */
    public static final b f61730f = new b(null);

    /* JADX INFO: renamed from: g */
    private static final String[] f61731g = {null, "English", "Bahasa Indonesia", "Français", "Português", "العربية", "বাংলা", "Русский", "ਪੰਜਾਬੀ", "اردو", "Filipino"};

    /* JADX INFO: renamed from: h */
    private static final String[] f61732h = {null, Locale.ENGLISH.getLanguage(), "in", "fr", "pt", "ar", "bn", "ru", "pa", "ur", "fil"};

    /* JADX INFO: renamed from: i */
    private static final Lazy f61733i = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv_pugc.base.locale.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C19239d.m80537i();
        }
    });

    /* JADX INFO: renamed from: a */
    private Locale f61734a;

    /* JADX INFO: renamed from: b */
    private Locale f61735b;

    /* JADX INFO: renamed from: c */
    private String f61736c;

    /* JADX INFO: renamed from: d */
    private final Context f61737d;

    /* JADX INFO: renamed from: e */
    private final C19240e f61738e;

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.locale.d$a */
    public static final class a implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f61740b;

        a(Context context) {
            this.f61740b = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final void m80544b(C19239d c19239d, Locale locale, Locale locale2, Context context) {
            if (c19239d.m80541h() == locale) {
                String country = locale2.getCountry();
                Intrinsics.m97801g(country, "getCountry(...)");
                c19239d.m80538k(null, country, true);
            } else {
                Intrinsics.m97799e(context);
                c19239d.m80540m(context, c19239d.m80541h());
            }
            C26866a.a.m104898f(C26866a.f81698a, "LocaleManager", "onConfigurationChanged()-> locale = " + locale2, false, 4, null);
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
            Intrinsics.m97802h(newConfig, "newConfig");
            final Locale locale = Build.VERSION.SDK_INT >= 24 ? newConfig.getLocales().get(0) : newConfig.locale;
            final Locale locale2 = C19239d.this.f61735b;
            if (Intrinsics.m97797c(locale, locale2)) {
                return;
            }
            C19239d c19239d = C19239d.this;
            Intrinsics.m97799e(locale);
            c19239d.f61735b = locale;
            final C19239d c19239d2 = C19239d.this;
            final Context context = this.f61740b;
            ThreadUtils.m27236j(new Runnable() { // from class: com.transsion.shorttv_pugc.base.locale.c
                @Override // java.lang.Runnable
                public final void run() {
                    C19239d.a.m80544b(c19239d2, locale2, locale, context);
                }
            });
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i11) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv_pugc.base.locale.d$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public final Locale m80548f(String str, String str2) {
            if (str == null || str.length() == 0) {
                return null;
            }
            return new Locale(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public final String m80549g() {
            return C19529h.f62465a.m81348g().getString("k_language_short_name", null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public final void m80550h(String str) {
            if (str != null) {
                int length = str.length() - 1;
                int i11 = 0;
                boolean z11 = false;
                while (i11 <= length) {
                    boolean z12 = Intrinsics.m97804j(str.charAt(!z11 ? i11 : length), 32) <= 0;
                    if (z11) {
                        if (!z12) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z12) {
                        i11++;
                    } else {
                        z11 = true;
                    }
                }
                if (str.subSequence(i11, length + 1).toString().length() != 0) {
                    C19529h.f62465a.m81348g().putString("k_language_short_name", str);
                    return;
                }
            }
            C19529h.f62465a.m81348g().remove("k_language_short_name");
        }

        /* JADX INFO: renamed from: d */
        public final Locale m80551d(Context context) {
            Intrinsics.m97802h(context, "context");
            C26866a.a.m104898f(C26866a.f81698a, "LocaleManager", "getContextLocale()-> context = " + context, false, 4, null);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT >= 24) {
                Locale locale = configuration.getLocales().get(0);
                Intrinsics.m97799e(locale);
                return locale;
            }
            Locale locale2 = configuration.locale;
            Intrinsics.m97799e(locale2);
            return locale2;
        }

        /* JADX INFO: renamed from: e */
        public final C19239d m80552e() {
            return (C19239d) C19239d.f61733i.getValue();
        }

        /* JADX INFO: renamed from: i */
        public final Context m80553i(Context context, Locale locale) {
            Intrinsics.m97802h(context, "context");
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC14469e.m65228a();
                LocaleList localeListM9778a = AbstractC2120a.m9778a(new Locale[]{locale});
                configuration.setLocales(localeListM9778a);
                LocaleList.setDefault(localeListM9778a);
            } else {
                configuration.setLocale(locale);
            }
            Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
            Intrinsics.m97801g(contextCreateConfigurationContext, "createConfigurationContext(...)");
            return contextCreateConfigurationContext;
        }
    }

    private C19239d(Context context) {
        C19240e c19240e = new C19240e();
        this.f61738e = c19240e;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.m97800f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) applicationContext;
        Context baseContext = application.getBaseContext();
        Intrinsics.m97799e(baseContext);
        this.f61737d = baseContext;
        b bVar = f61730f;
        Locale localeM80551d = bVar.m80551d(baseContext);
        this.f61735b = localeM80551d;
        String country = localeM80551d.getCountry();
        C26866a.a.m104898f(C26866a.f81698a, "LocaleManager", "LocaleManager()->  system locale =" + this.f61735b + ", countryCode = " + country, false, 4, null);
        application.registerActivityLifecycleCallbacks(c19240e);
        application.registerComponentCallbacks(new a(baseContext));
        String strM80549g = bVar.m80549g();
        Intrinsics.m97799e(country);
        m80538k(strM80549g, country, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C19239d m80537i() {
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return new C19239d(applicationM27275a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final void m80538k(String str, String str2, boolean z11) {
        C5096b.f17579a.m23871l(str);
        Context context = this.f61737d;
        if (str != null) {
            int length = str.length() - 1;
            int i11 = 0;
            boolean z12 = false;
            while (i11 <= length) {
                boolean z13 = Intrinsics.m97804j(str.charAt(!z12 ? i11 : length), 32) <= 0;
                if (z12) {
                    if (!z13) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z13) {
                    i11++;
                } else {
                    z12 = true;
                }
            }
            if (str.subSequence(i11, length + 1).toString().length() == 0) {
                str = null;
            }
        }
        if (z11 || !TextUtils.equals(str, this.f61736c)) {
            b bVar = f61730f;
            final Locale localeM80548f = bVar.m80548f(str, str2);
            if (localeM80548f == null) {
                localeM80548f = this.f61735b;
            }
            C26866a.a.m104898f(C26866a.f81698a, "LocaleManager", "setLocale()-> locale = " + localeM80548f + " , language = " + ((Object) str), false, 4, null);
            synchronized (this) {
                this.f61736c = str;
                this.f61734a = localeM80548f;
                Locale.setDefault(localeM80548f);
                Unit unit = Unit.f75682a;
            }
            m80540m(context, localeM80548f);
            bVar.m80550h(str);
            ThreadUtils.m27236j(new Runnable() { // from class: com.transsion.shorttv_pugc.base.locale.b
                @Override // java.lang.Runnable
                public final void run() {
                    C19239d.m80539l(this.f61724a, localeM80548f);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m80539l(C19239d c19239d, Locale locale) {
        C26866a.a.m104898f(C26866a.f81698a, "LocaleManager", "notify changed()-> ", false, 4, null);
        c19239d.f61738e.m80558e(locale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final void m80540m(Context context, Locale locale) {
        Locale locale2;
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            locale2 = configuration.getLocales().get(0);
            Intrinsics.m97799e(locale2);
        } else {
            locale2 = configuration.locale;
            Intrinsics.m97799e(locale2);
        }
        C26866a.a.m104898f(C26866a.f81698a, "LocaleManager", "updateConfig()-> old app locale = " + locale2 + " , new app locale = " + locale, false, 4, null);
        Configuration configuration2 = new Configuration(configuration);
        configuration2.setLocale(locale);
        resources.updateConfiguration(configuration2, resources.getDisplayMetrics());
    }

    /* JADX INFO: renamed from: h */
    public final synchronized Locale m80541h() {
        return this.f61734a;
    }

    /* JADX INFO: renamed from: j */
    public final void m80542j(String str) {
        if (Build.VERSION.SDK_INT == 23 && Intrinsics.m97797c("ur", str)) {
            m80538k(str, "PK", false);
            return;
        }
        String country = this.f61735b.getCountry();
        Intrinsics.m97801g(country, "getCountry(...)");
        m80538k(str, country, false);
    }
}
