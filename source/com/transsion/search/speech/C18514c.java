package com.transsion.search.speech;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.speech.SpeechRecognizer;
import android.text.TextUtils;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.report.launch.C14496b;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.search.speech.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C18514c {

    /* JADX INFO: renamed from: c */
    public static final a f59982c = new a(null);

    /* JADX INFO: renamed from: a */
    private Function0 f59983a;

    /* JADX INFO: renamed from: b */
    private final Lazy f59984b = LazyKt.m97097b(new Function0() { // from class: com.transsion.search.speech.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C18514c.m78042h();
        }
    });

    /* JADX INFO: renamed from: com.transsion.search.speech.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: c */
    private final String m78038c() {
        String simpleName = C18514c.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: d */
    private final Handler m78039d() {
        return (Handler) this.f59984b.getValue();
    }

    /* JADX INFO: renamed from: f */
    private final SpeechRecognizer m78040f(Context context) {
        C18517f.f59987a.m78050a(m78038c() + " --> getSpeechRecognizerOneParameterStrategy() --> deviceModel = " + Build.MODEL + " --> 采用第一种策略");
        return SpeechRecognizer.createSpeechRecognizer(context);
    }

    /* JADX INFO: renamed from: g */
    private final SpeechRecognizer m78041g(Context context) {
        Object objM112707constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            C18517f c18517f = C18517f.f59987a;
            String strM78038c = m78038c();
            String str = Build.MODEL;
            c18517f.m78050a(strM78038c + " --> deviceModel = " + str + " --> 采用第二种策略");
            List<ResolveInfo> listQueryIntentServices = Utils.m27275a().getPackageManager().queryIntentServices(new Intent("android.speech.RecognitionService"), 0);
            Intrinsics.m97801g(listQueryIntentServices, "queryIntentServices(...)");
            ResolveInfo resolveInfo = listQueryIntentServices.get(0);
            c18517f.m78050a(m78038c() + " --> getSpeechRecognizerTwoParameterStrategy() --> packageName = " + resolveInfo.serviceInfo.packageName + " --> name = info.serviceInfo.name --> info = " + resolveInfo + " --> deviceModel = " + str);
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            objM112707constructorimpl = Result.m112707constructorimpl(SpeechRecognizer.createSpeechRecognizer(context, new ComponentName(serviceInfo.packageName, serviceInfo.name)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null) {
            objM112707constructorimpl = null;
        }
        return (SpeechRecognizer) objM112707constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Handler m78042h() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m78043l(C18514c c18514c) {
        C14496b.f50966a.m65344b().putString("initialize_strategy", "initialize_two");
        C18517f.f59987a.m78050a(c18514c.m78038c() + " --> startListening() --> 标记当前不支持第一种策略 --> 回调给场景重新加载对象");
        Function0 function0 = c18514c.f59983a;
        if (function0 != null) {
        }
        C18528q.f60000a.m78058f();
    }

    /* JADX INFO: renamed from: e */
    public final SpeechRecognizer m78044e(Context context) {
        C14496b c14496b = C14496b.f50966a;
        if (TextUtils.isEmpty(c14496b.m65344b().getString("initialize_one_affirm", ""))) {
            if (TextUtils.equals("TECNO AC8", Build.MODEL)) {
                return m78041g(context);
            }
            String string = c14496b.m65344b().getString("initialize_strategy", "initialize_one");
            if (!Intrinsics.m97797c(string, "initialize_one") && Intrinsics.m97797c(string, "initialize_two")) {
                return m78041g(context);
            }
            return m78040f(context);
        }
        C18517f.f59987a.m78050a(m78038c() + " --> getSpeechRecognizer() --> 确定了支持第一种策略，直接返回");
        return m78040f(context);
    }

    /* JADX INFO: renamed from: i */
    public final void m78045i() {
        m78039d().removeCallbacksAndMessages(null);
        C18517f.f59987a.m78050a(m78038c() + " --> onReadyForSpeech() --> 当前策略起作用了");
        C14496b.f50966a.m65344b().putString("initialize_strategy_affirm", "initialize_one_affirm");
    }

    /* JADX INFO: renamed from: j */
    public final void m78046j(Function0 callback) {
        Intrinsics.m97802h(callback, "callback");
        this.f59983a = callback;
    }

    /* JADX INFO: renamed from: k */
    public final void m78047k() {
        if (TextUtils.equals(C14496b.f50966a.m65344b().getString("initialize_strategy", "initialize_one"), "initialize_two")) {
            C18517f.f59987a.m78050a(m78038c() + " --> startListening() --> 当前策略已经是第二种策略了");
            return;
        }
        m78039d().removeCallbacksAndMessages(null);
        m78039d().postDelayed(new Runnable() { // from class: com.transsion.search.speech.b
            @Override // java.lang.Runnable
            public final void run() {
                C18514c.m78043l(this.f59981a);
            }
        }, 3000L);
        C18517f.f59987a.m78050a(m78038c() + " --> startListening() --> 开启倒计时");
    }
}
