package com.transsion.shorttv.base.locale;

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
import com.transsion.shorttv.utils.C19165h;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.shorttv.base.locale.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C18773d {

    /* JADX INFO: renamed from: f */
    public static final b f60624f = new b(null);

    /* JADX INFO: renamed from: g */
    private static final String[] f60625g = {null, "English", "Bahasa Indonesia", "Français", "Português", "العربية", "বাংলা", "Русский", "ਪੰਜਾਬੀ", "اردو", "Filipino"};

    /* JADX INFO: renamed from: h */
    private static final String[] f60626h = {null, Locale.ENGLISH.getLanguage(), "in", "fr", "pt", "ar", "bn", "ru", "pa", "ur", "fil"};

    /* JADX INFO: renamed from: i */
    private static final Lazy f60627i = LazyKt.m97097b(new Function0() { // from class: com.transsion.shorttv.base.locale.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C18773d.m79107i();
        }
    });

    /* JADX INFO: renamed from: a */
    private Locale f60628a;

    /* JADX INFO: renamed from: b */
    private Locale f60629b;

    /* JADX INFO: renamed from: c */
    private String f60630c;

    /* JADX INFO: renamed from: d */
    private final Context f60631d;

    /* JADX INFO: renamed from: e */
    private final C18774e f60632e;

    /* JADX INFO: renamed from: com.transsion.shorttv.base.locale.d$a */
    public static final class a implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f60634b;

        a(Context context) {
            this.f60634b = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final void m79114b(C18773d c18773d, Locale locale, Locale locale2, Context context) {
            if (c18773d.m79111h() == locale) {
                String country = locale2.getCountry();
                Intrinsics.m97801g(country, "getCountry(...)");
                c18773d.m79108k(null, country, true);
            } else {
                Intrinsics.m97799e(context);
                c18773d.m79110m(context, c18773d.m79111h());
            }
            C26866a.a.m104898f(C26866a.f81698a, "LocaleManager", "onConfigurationChanged()-> locale = " + locale2, false, 4, null);
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
            Intrinsics.m97802h(newConfig, "newConfig");
            final Locale locale = Build.VERSION.SDK_INT >= 24 ? newConfig.getLocales().get(0) : newConfig.locale;
            final Locale locale2 = C18773d.this.f60629b;
            if (Intrinsics.m97797c(locale, locale2)) {
                return;
            }
            C18773d c18773d = C18773d.this;
            Intrinsics.m97799e(locale);
            c18773d.f60629b = locale;
            final C18773d c18773d2 = C18773d.this;
            final Context context = this.f60634b;
            ThreadUtils.m27236j(new Runnable() { // from class: com.transsion.shorttv.base.locale.c
                @Override // java.lang.Runnable
                public final void run() {
                    C18773d.a.m79114b(c18773d2, locale2, locale, context);
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

    /* JADX INFO: renamed from: com.transsion.shorttv.base.locale.d$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public final Locale m79118f(String str, String str2) {
            if (str == null || str.length() == 0) {
                return null;
            }
            return new Locale(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public final String m79119g() {
            return C19165h.f61575a.m80242e().getString("k_language_short_name", null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public final void m79120h(String str) {
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
                    C19165h.f61575a.m80242e().putString("k_language_short_name", str);
                    return;
                }
            }
            C19165h.f61575a.m80242e().remove("k_language_short_name");
        }

        /* JADX INFO: renamed from: d */
        public final Locale m79121d(Context context) {
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
        public final C18773d m79122e() {
            return (C18773d) C18773d.f60627i.getValue();
        }

        /* JADX INFO: renamed from: i */
        public final Context m79123i(Context context, Locale locale) {
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

    private C18773d(Context context) {
        C18774e c18774e = new C18774e();
        this.f60632e = c18774e;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.m97800f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) applicationContext;
        Context baseContext = application.getBaseContext();
        Intrinsics.m97799e(baseContext);
        this.f60631d = baseContext;
        b bVar = f60624f;
        Locale localeM79121d = bVar.m79121d(baseContext);
        this.f60629b = localeM79121d;
        String country = localeM79121d.getCountry();
        C26866a.a.m104898f(C26866a.f81698a, "LocaleManager", "LocaleManager()->  system locale =" + this.f60629b + ", countryCode = " + country, false, 4, null);
        application.registerActivityLifecycleCallbacks(c18774e);
        application.registerComponentCallbacks(new a(baseContext));
        String strM79119g = bVar.m79119g();
        Intrinsics.m97799e(country);
        m79108k(strM79119g, country, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C18773d m79107i() {
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return new C18773d(applicationM27275a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final void m79108k(String str, String str2, boolean z11) {
        C5096b.f17579a.m23871l(str);
        Context context = this.f60631d;
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
        if (z11 || !TextUtils.equals(str, this.f60630c)) {
            b bVar = f60624f;
            final Locale localeM79118f = bVar.m79118f(str, str2);
            if (localeM79118f == null) {
                localeM79118f = this.f60629b;
            }
            C26866a.a.m104898f(C26866a.f81698a, "LocaleManager", "setLocale()-> locale = " + localeM79118f + " , language = " + ((Object) str), false, 4, null);
            synchronized (this) {
                this.f60630c = str;
                this.f60628a = localeM79118f;
                Locale.setDefault(localeM79118f);
                Unit unit = Unit.f75682a;
            }
            m79110m(context, localeM79118f);
            bVar.m79120h(str);
            ThreadUtils.m27236j(new Runnable() { // from class: com.transsion.shorttv.base.locale.b
                @Override // java.lang.Runnable
                public final void run() {
                    C18773d.m79109l(this.f60618a, localeM79118f);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m79109l(C18773d c18773d, Locale locale) {
        C26866a.a.m104898f(C26866a.f81698a, "LocaleManager", "notify changed()-> ", false, 4, null);
        c18773d.f60632e.m79128e(locale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final void m79110m(Context context, Locale locale) {
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
    public final synchronized Locale m79111h() {
        return this.f60628a;
    }

    /* JADX INFO: renamed from: j */
    public final void m79112j(String str) {
        if (Build.VERSION.SDK_INT == 23 && Intrinsics.m97797c("ur", str)) {
            m79108k(str, "PK", false);
            return;
        }
        String country = this.f60629b.getCountry();
        Intrinsics.m97801g(country, "getCountry(...)");
        m79108k(str, country, false);
    }
}
