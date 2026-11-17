package com.transsion.subtitle.helper;

import android.app.Application;
import android.os.Build;
import com.blankj.utilcode.util.AbstractC5796o;
import com.blankj.utilcode.util.Utils;
import com.google.gson.reflect.TypeToken;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.download.SubtitleLanguageMapBean;
import com.transsion.baselib.report.C14482a;
import com.transsion.p299mb.config.manager.ConfigBean;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import okio.Okio;
import p648oj.InterfaceC26246d1;
import p743rh.C27287m;
import p913xm.C28615f;
import pg.C26866a;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleSearchHelper {

    /* JADX INFO: renamed from: c */
    public static final C19715a f62938c = new C19715a(null);

    /* JADX INFO: renamed from: d */
    private static final String f62939d = C14482a.f50937a.m65273a();

    /* JADX INFO: renamed from: e */
    private static final Lazy f62940e = LazyKt.m97097b(new Function0() { // from class: com.transsion.subtitle.helper.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SubtitleSearchHelper.m82156h();
        }
    });

    /* JADX INFO: renamed from: a */
    private boolean f62941a = true;

    /* JADX INFO: renamed from: b */
    private boolean f62942b;

    /* JADX INFO: renamed from: com.transsion.subtitle.helper.SubtitleSearchHelper$a */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class C19715a {
        private C19715a() {
        }

        public /* synthetic */ C19715a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SubtitleSearchHelper m82160a() {
            return (SubtitleSearchHelper) SubtitleSearchHelper.f62940e.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x00be  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:24:0x00b8->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m82154f(Continuation continuation) throws Throwable {
        SubtitleSearchHelper$initLocalLanguage$1 subtitleSearchHelper$initLocalLanguage$1;
        InterfaceC26246d1 interfaceC26246d1Mo64878y1;
        InterfaceC26246d1 interfaceC26246d1;
        Iterator it;
        SubtitleLanguageMapBean subtitleLanguageMapBean;
        if (continuation instanceof SubtitleSearchHelper$initLocalLanguage$1) {
            subtitleSearchHelper$initLocalLanguage$1 = (SubtitleSearchHelper$initLocalLanguage$1) continuation;
            int i11 = subtitleSearchHelper$initLocalLanguage$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                subtitleSearchHelper$initLocalLanguage$1.label = i11 - Integer.MIN_VALUE;
            } else {
                subtitleSearchHelper$initLocalLanguage$1 = new SubtitleSearchHelper$initLocalLanguage$1(this, continuation);
            }
        } else {
            subtitleSearchHelper$initLocalLanguage$1 = new SubtitleSearchHelper$initLocalLanguage$1(this, continuation);
        }
        Object objMo102777a = subtitleSearchHelper$initLocalLanguage$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = subtitleSearchHelper$initLocalLanguage$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                interfaceC26246d1Mo64878y1 = (InterfaceC26246d1) subtitleSearchHelper$initLocalLanguage$1.L$0;
                ResultKt.m97107b(objMo102777a);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) subtitleSearchHelper$initLocalLanguage$1.L$1;
                interfaceC26246d1 = (InterfaceC26246d1) subtitleSearchHelper$initLocalLanguage$1.L$0;
                ResultKt.m97107b(objMo102777a);
            }
            while (it.hasNext()) {
                subtitleLanguageMapBean = (SubtitleLanguageMapBean) it.next();
                subtitleSearchHelper$initLocalLanguage$1.L$0 = interfaceC26246d1;
                subtitleSearchHelper$initLocalLanguage$1.L$1 = it;
                subtitleSearchHelper$initLocalLanguage$1.label = 2;
                if (interfaceC26246d1.mo102779c(subtitleLanguageMapBean, subtitleSearchHelper$initLocalLanguage$1) == objF) {
                    return objF;
                }
            }
            return Unit.f75682a;
        }
        ResultKt.m97107b(objMo102777a);
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        interfaceC26246d1Mo64878y1 = companion.m64881b(applicationM27275a).mo64878y1();
        subtitleSearchHelper$initLocalLanguage$1.L$0 = interfaceC26246d1Mo64878y1;
        subtitleSearchHelper$initLocalLanguage$1.label = 1;
        objMo102777a = interfaceC26246d1Mo64878y1.mo102777a(subtitleSearchHelper$initLocalLanguage$1);
        if (objMo102777a == objF) {
            return objF;
        }
        List list = (List) objMo102777a;
        if (list == null || list.isEmpty()) {
            List list2 = (List) AbstractC5796o.m27442e(m82157i(), new TypeToken<List<SubtitleLanguageMapBean>>() { // from class: com.transsion.subtitle.helper.SubtitleSearchHelper$initLocalLanguage$type$1
            }.getType());
            C26866a.a.m104905r(C26866a.f81698a, f62939d, new String[]{"initLocalLanguage, localListSize:" + list2.size() + ", insert "}, false, 4, null);
            Intrinsics.m97799e(list2);
            interfaceC26246d1 = interfaceC26246d1Mo64878y1;
            it = list2.iterator();
            while (it.hasNext()) {
                subtitleLanguageMapBean = (SubtitleLanguageMapBean) it.next();
                subtitleSearchHelper$initLocalLanguage$1.L$0 = interfaceC26246d1;
                subtitleSearchHelper$initLocalLanguage$1.L$1 = it;
                subtitleSearchHelper$initLocalLanguage$1.label = 2;
                if (interfaceC26246d1.mo102779c(subtitleLanguageMapBean, subtitleSearchHelper$initLocalLanguage$1) == objF) {
                    return objF;
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x0249 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0038, B:125:0x02b7, B:18:0x0054, B:94:0x0221, B:96:0x0227, B:100:0x0245, B:102:0x0249, B:110:0x0260, B:104:0x024f, B:106:0x0253, B:21:0x006d, B:93:0x01ee, B:22:0x0072, B:120:0x029e, B:25:0x007f, B:50:0x00fb, B:52:0x0102, B:55:0x010a, B:57:0x0138, B:60:0x015d, B:61:0x0165, B:63:0x016b, B:65:0x0177, B:66:0x0179, B:68:0x0187, B:69:0x018b, B:74:0x0199, B:76:0x019d, B:87:0x01d4, B:90:0x01da, B:78:0x01a3, B:79:0x01aa, B:81:0x01b0, B:83:0x01c4, B:84:0x01c8, B:58:0x014d, B:113:0x0279, B:115:0x027d, B:117:0x0283, B:39:0x00a8, B:41:0x00b8, B:44:0x00c0, B:46:0x00c6, B:122:0x02a1), top: B:136:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x024f A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0038, B:125:0x02b7, B:18:0x0054, B:94:0x0221, B:96:0x0227, B:100:0x0245, B:102:0x0249, B:110:0x0260, B:104:0x024f, B:106:0x0253, B:21:0x006d, B:93:0x01ee, B:22:0x0072, B:120:0x029e, B:25:0x007f, B:50:0x00fb, B:52:0x0102, B:55:0x010a, B:57:0x0138, B:60:0x015d, B:61:0x0165, B:63:0x016b, B:65:0x0177, B:66:0x0179, B:68:0x0187, B:69:0x018b, B:74:0x0199, B:76:0x019d, B:87:0x01d4, B:90:0x01da, B:78:0x01a3, B:79:0x01aa, B:81:0x01b0, B:83:0x01c4, B:84:0x01c8, B:58:0x014d, B:113:0x0279, B:115:0x027d, B:117:0x0283, B:39:0x00a8, B:41:0x00b8, B:44:0x00c0, B:46:0x00c6, B:122:0x02a1), top: B:136:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0283 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0038, B:125:0x02b7, B:18:0x0054, B:94:0x0221, B:96:0x0227, B:100:0x0245, B:102:0x0249, B:110:0x0260, B:104:0x024f, B:106:0x0253, B:21:0x006d, B:93:0x01ee, B:22:0x0072, B:120:0x029e, B:25:0x007f, B:50:0x00fb, B:52:0x0102, B:55:0x010a, B:57:0x0138, B:60:0x015d, B:61:0x0165, B:63:0x016b, B:65:0x0177, B:66:0x0179, B:68:0x0187, B:69:0x018b, B:74:0x0199, B:76:0x019d, B:87:0x01d4, B:90:0x01da, B:78:0x01a3, B:79:0x01aa, B:81:0x01b0, B:83:0x01c4, B:84:0x01c8, B:58:0x014d, B:113:0x0279, B:115:0x027d, B:117:0x0283, B:39:0x00a8, B:41:0x00b8, B:44:0x00c0, B:46:0x00c6, B:122:0x02a1), top: B:136:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x029d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:131:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:133:0x0301 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:137:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:? A[LOOP:0: B:94:0x0221->B:140:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0138 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0038, B:125:0x02b7, B:18:0x0054, B:94:0x0221, B:96:0x0227, B:100:0x0245, B:102:0x0249, B:110:0x0260, B:104:0x024f, B:106:0x0253, B:21:0x006d, B:93:0x01ee, B:22:0x0072, B:120:0x029e, B:25:0x007f, B:50:0x00fb, B:52:0x0102, B:55:0x010a, B:57:0x0138, B:60:0x015d, B:61:0x0165, B:63:0x016b, B:65:0x0177, B:66:0x0179, B:68:0x0187, B:69:0x018b, B:74:0x0199, B:76:0x019d, B:87:0x01d4, B:90:0x01da, B:78:0x01a3, B:79:0x01aa, B:81:0x01b0, B:83:0x01c4, B:84:0x01c8, B:58:0x014d, B:113:0x0279, B:115:0x027d, B:117:0x0283, B:39:0x00a8, B:41:0x00b8, B:44:0x00c0, B:46:0x00c6, B:122:0x02a1), top: B:136:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x014d A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0038, B:125:0x02b7, B:18:0x0054, B:94:0x0221, B:96:0x0227, B:100:0x0245, B:102:0x0249, B:110:0x0260, B:104:0x024f, B:106:0x0253, B:21:0x006d, B:93:0x01ee, B:22:0x0072, B:120:0x029e, B:25:0x007f, B:50:0x00fb, B:52:0x0102, B:55:0x010a, B:57:0x0138, B:60:0x015d, B:61:0x0165, B:63:0x016b, B:65:0x0177, B:66:0x0179, B:68:0x0187, B:69:0x018b, B:74:0x0199, B:76:0x019d, B:87:0x01d4, B:90:0x01da, B:78:0x01a3, B:79:0x01aa, B:81:0x01b0, B:83:0x01c4, B:84:0x01c8, B:58:0x014d, B:113:0x0279, B:115:0x027d, B:117:0x0283, B:39:0x00a8, B:41:0x00b8, B:44:0x00c0, B:46:0x00c6, B:122:0x02a1), top: B:136:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x015d A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0038, B:125:0x02b7, B:18:0x0054, B:94:0x0221, B:96:0x0227, B:100:0x0245, B:102:0x0249, B:110:0x0260, B:104:0x024f, B:106:0x0253, B:21:0x006d, B:93:0x01ee, B:22:0x0072, B:120:0x029e, B:25:0x007f, B:50:0x00fb, B:52:0x0102, B:55:0x010a, B:57:0x0138, B:60:0x015d, B:61:0x0165, B:63:0x016b, B:65:0x0177, B:66:0x0179, B:68:0x0187, B:69:0x018b, B:74:0x0199, B:76:0x019d, B:87:0x01d4, B:90:0x01da, B:78:0x01a3, B:79:0x01aa, B:81:0x01b0, B:83:0x01c4, B:84:0x01c8, B:58:0x014d, B:113:0x0279, B:115:0x027d, B:117:0x0283, B:39:0x00a8, B:41:0x00b8, B:44:0x00c0, B:46:0x00c6, B:122:0x02a1), top: B:136:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x016b A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0038, B:125:0x02b7, B:18:0x0054, B:94:0x0221, B:96:0x0227, B:100:0x0245, B:102:0x0249, B:110:0x0260, B:104:0x024f, B:106:0x0253, B:21:0x006d, B:93:0x01ee, B:22:0x0072, B:120:0x029e, B:25:0x007f, B:50:0x00fb, B:52:0x0102, B:55:0x010a, B:57:0x0138, B:60:0x015d, B:61:0x0165, B:63:0x016b, B:65:0x0177, B:66:0x0179, B:68:0x0187, B:69:0x018b, B:74:0x0199, B:76:0x019d, B:87:0x01d4, B:90:0x01da, B:78:0x01a3, B:79:0x01aa, B:81:0x01b0, B:83:0x01c4, B:84:0x01c8, B:58:0x014d, B:113:0x0279, B:115:0x027d, B:117:0x0283, B:39:0x00a8, B:41:0x00b8, B:44:0x00c0, B:46:0x00c6, B:122:0x02a1), top: B:136:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0177 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0038, B:125:0x02b7, B:18:0x0054, B:94:0x0221, B:96:0x0227, B:100:0x0245, B:102:0x0249, B:110:0x0260, B:104:0x024f, B:106:0x0253, B:21:0x006d, B:93:0x01ee, B:22:0x0072, B:120:0x029e, B:25:0x007f, B:50:0x00fb, B:52:0x0102, B:55:0x010a, B:57:0x0138, B:60:0x015d, B:61:0x0165, B:63:0x016b, B:65:0x0177, B:66:0x0179, B:68:0x0187, B:69:0x018b, B:74:0x0199, B:76:0x019d, B:87:0x01d4, B:90:0x01da, B:78:0x01a3, B:79:0x01aa, B:81:0x01b0, B:83:0x01c4, B:84:0x01c8, B:58:0x014d, B:113:0x0279, B:115:0x027d, B:117:0x0283, B:39:0x00a8, B:41:0x00b8, B:44:0x00c0, B:46:0x00c6, B:122:0x02a1), top: B:136:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0187 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0038, B:125:0x02b7, B:18:0x0054, B:94:0x0221, B:96:0x0227, B:100:0x0245, B:102:0x0249, B:110:0x0260, B:104:0x024f, B:106:0x0253, B:21:0x006d, B:93:0x01ee, B:22:0x0072, B:120:0x029e, B:25:0x007f, B:50:0x00fb, B:52:0x0102, B:55:0x010a, B:57:0x0138, B:60:0x015d, B:61:0x0165, B:63:0x016b, B:65:0x0177, B:66:0x0179, B:68:0x0187, B:69:0x018b, B:74:0x0199, B:76:0x019d, B:87:0x01d4, B:90:0x01da, B:78:0x01a3, B:79:0x01aa, B:81:0x01b0, B:83:0x01c4, B:84:0x01c8, B:58:0x014d, B:113:0x0279, B:115:0x027d, B:117:0x0283, B:39:0x00a8, B:41:0x00b8, B:44:0x00c0, B:46:0x00c6, B:122:0x02a1), top: B:136:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0195  */
    /* JADX WARN: Code duplicated, block: B:73:0x0198  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a3 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0038, B:125:0x02b7, B:18:0x0054, B:94:0x0221, B:96:0x0227, B:100:0x0245, B:102:0x0249, B:110:0x0260, B:104:0x024f, B:106:0x0253, B:21:0x006d, B:93:0x01ee, B:22:0x0072, B:120:0x029e, B:25:0x007f, B:50:0x00fb, B:52:0x0102, B:55:0x010a, B:57:0x0138, B:60:0x015d, B:61:0x0165, B:63:0x016b, B:65:0x0177, B:66:0x0179, B:68:0x0187, B:69:0x018b, B:74:0x0199, B:76:0x019d, B:87:0x01d4, B:90:0x01da, B:78:0x01a3, B:79:0x01aa, B:81:0x01b0, B:83:0x01c4, B:84:0x01c8, B:58:0x014d, B:113:0x0279, B:115:0x027d, B:117:0x0283, B:39:0x00a8, B:41:0x00b8, B:44:0x00c0, B:46:0x00c6, B:122:0x02a1), top: B:136:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b0 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0038, B:125:0x02b7, B:18:0x0054, B:94:0x0221, B:96:0x0227, B:100:0x0245, B:102:0x0249, B:110:0x0260, B:104:0x024f, B:106:0x0253, B:21:0x006d, B:93:0x01ee, B:22:0x0072, B:120:0x029e, B:25:0x007f, B:50:0x00fb, B:52:0x0102, B:55:0x010a, B:57:0x0138, B:60:0x015d, B:61:0x0165, B:63:0x016b, B:65:0x0177, B:66:0x0179, B:68:0x0187, B:69:0x018b, B:74:0x0199, B:76:0x019d, B:87:0x01d4, B:90:0x01da, B:78:0x01a3, B:79:0x01aa, B:81:0x01b0, B:83:0x01c4, B:84:0x01c8, B:58:0x014d, B:113:0x0279, B:115:0x027d, B:117:0x0283, B:39:0x00a8, B:41:0x00b8, B:44:0x00c0, B:46:0x00c6, B:122:0x02a1), top: B:136:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01c4 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0038, B:125:0x02b7, B:18:0x0054, B:94:0x0221, B:96:0x0227, B:100:0x0245, B:102:0x0249, B:110:0x0260, B:104:0x024f, B:106:0x0253, B:21:0x006d, B:93:0x01ee, B:22:0x0072, B:120:0x029e, B:25:0x007f, B:50:0x00fb, B:52:0x0102, B:55:0x010a, B:57:0x0138, B:60:0x015d, B:61:0x0165, B:63:0x016b, B:65:0x0177, B:66:0x0179, B:68:0x0187, B:69:0x018b, B:74:0x0199, B:76:0x019d, B:87:0x01d4, B:90:0x01da, B:78:0x01a3, B:79:0x01aa, B:81:0x01b0, B:83:0x01c4, B:84:0x01c8, B:58:0x014d, B:113:0x0279, B:115:0x027d, B:117:0x0283, B:39:0x00a8, B:41:0x00b8, B:44:0x00c0, B:46:0x00c6, B:122:0x02a1), top: B:136:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x0227 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0038, B:125:0x02b7, B:18:0x0054, B:94:0x0221, B:96:0x0227, B:100:0x0245, B:102:0x0249, B:110:0x0260, B:104:0x024f, B:106:0x0253, B:21:0x006d, B:93:0x01ee, B:22:0x0072, B:120:0x029e, B:25:0x007f, B:50:0x00fb, B:52:0x0102, B:55:0x010a, B:57:0x0138, B:60:0x015d, B:61:0x0165, B:63:0x016b, B:65:0x0177, B:66:0x0179, B:68:0x0187, B:69:0x018b, B:74:0x0199, B:76:0x019d, B:87:0x01d4, B:90:0x01da, B:78:0x01a3, B:79:0x01aa, B:81:0x01b0, B:83:0x01c4, B:84:0x01c8, B:58:0x014d, B:113:0x0279, B:115:0x027d, B:117:0x0283, B:39:0x00a8, B:41:0x00b8, B:44:0x00c0, B:46:0x00c6, B:122:0x02a1), top: B:136:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0241  */
    /* JADX WARN: Code duplicated, block: B:99:0x0244  */
    /* JADX WARN: Instruction removed from duplicated block: B:131:0x02cf, please report this as an issue */
    /* JADX INFO: renamed from: g */
    public final Object m82155g(Continuation continuation) throws Throwable {
        SubtitleSearchHelper$innerUpdateLanguageList$1 subtitleSearchHelper$innerUpdateLanguageList$1;
        Object objM112707constructorimpl;
        Throwable thM112710exceptionOrNullimpl;
        List<SubtitleLanguageMapBean> list;
        InterfaceC26246d1 interfaceC26246d1;
        List<SubtitleLanguageMapBean> list2;
        List list3;
        List list4;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        Locale locale;
        boolean z11;
        List list5;
        InterfaceC26246d1 interfaceC26246d2;
        Ref.BooleanRef booleanRef3;
        Ref.BooleanRef booleanRef4;
        Locale locale2;
        Iterator it;
        String lan;
        String str;
        SubtitleLanguageMapBean subtitleLanguageMapBean;
        if (continuation instanceof SubtitleSearchHelper$innerUpdateLanguageList$1) {
            subtitleSearchHelper$innerUpdateLanguageList$1 = (SubtitleSearchHelper$innerUpdateLanguageList$1) continuation;
            int i11 = subtitleSearchHelper$innerUpdateLanguageList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                subtitleSearchHelper$innerUpdateLanguageList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                subtitleSearchHelper$innerUpdateLanguageList$1 = new SubtitleSearchHelper$innerUpdateLanguageList$1(this, continuation);
            }
        } else {
            subtitleSearchHelper$innerUpdateLanguageList$1 = new SubtitleSearchHelper$innerUpdateLanguageList$1(this, continuation);
        }
        Object obj = subtitleSearchHelper$innerUpdateLanguageList$1.result;
        Object objF = IntrinsicsKt.m97630f();
        try {
            switch (subtitleSearchHelper$innerUpdateLanguageList$1.label) {
                case 0:
                    ResultKt.m97107b(obj);
                    if (this.f62942b) {
                        return Unit.f75682a;
                    }
                    if (!C27287m.f83003a.m106330e()) {
                        subtitleSearchHelper$innerUpdateLanguageList$1.label = 1;
                        if (m82154f(subtitleSearchHelper$innerUpdateLanguageList$1) == objF) {
                            return objF;
                        }
                        return Unit.f75682a;
                    }
                    Result.Companion companion = Result.INSTANCE;
                    ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("subtitle_language", true);
                    String value = configBeanM110360c != null ? configBeanM110360c.getValue() : null;
                    if (value != null && value.length() > 0) {
                        List list6 = (List) AbstractC5796o.m27442e(value, new TypeToken<List<SubtitleLanguageMapBean>>() { // from class: com.transsion.subtitle.helper.SubtitleSearchHelper$innerUpdateLanguageList$2$type$1
                        }.getType());
                        this.f62942b = true;
                        AppDatabase.Companion companion2 = AppDatabase.INSTANCE;
                        Application applicationM27275a = Utils.m27275a();
                        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
                        InterfaceC26246d1 interfaceC26246d1Mo64878y1 = companion2.m64881b(applicationM27275a).mo64878y1();
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$0 = list6;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$1 = interfaceC26246d1Mo64878y1;
                        subtitleSearchHelper$innerUpdateLanguageList$1.label = 2;
                        Object objMo102777a = interfaceC26246d1Mo64878y1.mo102777a(subtitleSearchHelper$innerUpdateLanguageList$1);
                        if (objMo102777a == objF) {
                            return objF;
                        }
                        list = list6;
                        interfaceC26246d1 = interfaceC26246d1Mo64878y1;
                        obj = objMo102777a;
                        list2 = (List) obj;
                        list3 = list;
                        if (list3 != null && !list3.isEmpty()) {
                            C26866a.a.m104898f(C26866a.f81698a, f62939d, "get language , list = " + list, false, 4, null);
                            booleanRef = new Ref.BooleanRef();
                            booleanRef2 = new Ref.BooleanRef();
                            if (Build.VERSION.SDK_INT >= 24) {
                                locale = Utils.m27275a().getResources().getConfiguration().getLocales().get(0);
                            } else {
                                locale = Utils.m27275a().getResources().getConfiguration().locale;
                            }
                            if (list2 != null) {
                                z11 = false;
                                for (SubtitleLanguageMapBean subtitleLanguageMapBean2 : list2) {
                                    if (subtitleLanguageMapBean2.getInSearch()) {
                                        booleanRef.element = true;
                                    }
                                    if (Intrinsics.m97797c(subtitleLanguageMapBean2.getLanAbbr(), locale.getLanguage())) {
                                        booleanRef.element = true;
                                        booleanRef2.element = true;
                                    }
                                    if (Intrinsics.m97797c(subtitleLanguageMapBean2.getLanAbbr(), "en")) {
                                        z11 = true;
                                    }
                                }
                            } else {
                                z11 = false;
                            }
                            list5 = list2;
                            if (list5 != null || list5.isEmpty()) {
                                for (SubtitleLanguageMapBean subtitleLanguageMapBean3 : list) {
                                    if (Intrinsics.m97797c(subtitleLanguageMapBean3.getLanAbbr(), locale.getLanguage())) {
                                        booleanRef.element = true;
                                        booleanRef2.element = true;
                                    }
                                    if (Intrinsics.m97797c(subtitleLanguageMapBean3.getLanAbbr(), "en")) {
                                        z11 = true;
                                    }
                                }
                            }
                            if (!booleanRef.element && z11) {
                                subtitleSearchHelper$innerUpdateLanguageList$1.L$0 = list;
                                subtitleSearchHelper$innerUpdateLanguageList$1.L$1 = interfaceC26246d1;
                                subtitleSearchHelper$innerUpdateLanguageList$1.L$2 = booleanRef;
                                subtitleSearchHelper$innerUpdateLanguageList$1.L$3 = booleanRef2;
                                subtitleSearchHelper$innerUpdateLanguageList$1.L$4 = locale;
                                subtitleSearchHelper$innerUpdateLanguageList$1.label = 4;
                                if (interfaceC26246d1.mo102778b("en", true, subtitleSearchHelper$innerUpdateLanguageList$1) == objF) {
                                    return objF;
                                }
                            }
                            C26866a.a.m104898f(C26866a.f81698a, f62939d, "get language new,locale =" + locale.getLanguage() + " list = " + list, false, 4, null);
                            Iterator it2 = list.iterator();
                            interfaceC26246d2 = interfaceC26246d1;
                            booleanRef3 = booleanRef;
                            booleanRef4 = booleanRef2;
                            locale2 = locale;
                            it = it2;
                            while (it.hasNext()) {
                                SubtitleLanguageMapBean subtitleLanguageMapBean4 = (SubtitleLanguageMapBean) it.next();
                                lan = subtitleLanguageMapBean4.getLan();
                                String lanIOS3 = subtitleLanguageMapBean4.getLanIOS3();
                                String lanName = subtitleLanguageMapBean4.getLanName();
                                if (Intrinsics.m97797c(lan, "in_id")) {
                                    str = "in";
                                } else {
                                    str = lan;
                                }
                                subtitleLanguageMapBean = new SubtitleLanguageMapBean(lan, lanIOS3, lanName, (booleanRef3.element && Intrinsics.m97797c(str, "en")) || (booleanRef4.element && Intrinsics.m97797c(str, locale2.getLanguage())));
                                subtitleSearchHelper$innerUpdateLanguageList$1.L$0 = interfaceC26246d2;
                                subtitleSearchHelper$innerUpdateLanguageList$1.L$1 = booleanRef3;
                                subtitleSearchHelper$innerUpdateLanguageList$1.L$2 = booleanRef4;
                                subtitleSearchHelper$innerUpdateLanguageList$1.L$3 = locale2;
                                subtitleSearchHelper$innerUpdateLanguageList$1.L$4 = it;
                                subtitleSearchHelper$innerUpdateLanguageList$1.label = 5;
                                if (interfaceC26246d2.mo102779c(subtitleLanguageMapBean, subtitleSearchHelper$innerUpdateLanguageList$1) == objF) {
                                    return objF;
                                }
                            }
                        }
                        list4 = list2;
                        if (list4 != null || list4.isEmpty()) {
                            C26866a.a.m104910z(C26866a.f81698a, f62939d, "language list all null~", false, 4, null);
                            subtitleSearchHelper$innerUpdateLanguageList$1.L$0 = null;
                            subtitleSearchHelper$innerUpdateLanguageList$1.L$1 = null;
                            subtitleSearchHelper$innerUpdateLanguageList$1.label = 3;
                            if (m82154f(subtitleSearchHelper$innerUpdateLanguageList$1) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f75682a;
                    }
                    C26866a.a.m104910z(C26866a.f81698a, f62939d, "get language list null~", false, 4, null);
                    subtitleSearchHelper$innerUpdateLanguageList$1.label = 6;
                    if (m82154f(subtitleSearchHelper$innerUpdateLanguageList$1) == objF) {
                        return objF;
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
                    thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                    if (thM112710exceptionOrNullimpl != null) {
                        this.f62942b = false;
                        C26866a.a.m104901l(C26866a.f81698a, f62939d, "get language list error:" + thM112710exceptionOrNullimpl, false, 4, null);
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$0 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$1 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$2 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$3 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$4 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.label = 7;
                        if (m82154f(subtitleSearchHelper$innerUpdateLanguageList$1) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f75682a;
                case 1:
                    ResultKt.m97107b(obj);
                    return Unit.f75682a;
                case 2:
                    InterfaceC26246d1 interfaceC26246d3 = (InterfaceC26246d1) subtitleSearchHelper$innerUpdateLanguageList$1.L$1;
                    List list7 = (List) subtitleSearchHelper$innerUpdateLanguageList$1.L$0;
                    ResultKt.m97107b(obj);
                    interfaceC26246d1 = interfaceC26246d3;
                    list = list7;
                    list2 = (List) obj;
                    list3 = list;
                    if (list3 != null) {
                        C26866a.a.m104898f(C26866a.f81698a, f62939d, "get language , list = " + list, false, 4, null);
                        booleanRef = new Ref.BooleanRef();
                        booleanRef2 = new Ref.BooleanRef();
                        if (Build.VERSION.SDK_INT >= 24) {
                            locale = Utils.m27275a().getResources().getConfiguration().getLocales().get(0);
                        } else {
                            locale = Utils.m27275a().getResources().getConfiguration().locale;
                        }
                        if (list2 != null) {
                            z11 = false;
                            while (r13.hasNext()) {
                                if (subtitleLanguageMapBean2.getInSearch()) {
                                    booleanRef.element = true;
                                }
                                if (Intrinsics.m97797c(subtitleLanguageMapBean2.getLanAbbr(), locale.getLanguage())) {
                                    booleanRef.element = true;
                                    booleanRef2.element = true;
                                }
                                if (Intrinsics.m97797c(subtitleLanguageMapBean2.getLanAbbr(), "en")) {
                                    z11 = true;
                                }
                            }
                        } else {
                            z11 = false;
                        }
                        list5 = list2;
                        if (list5 != null) {
                            while (r0.hasNext()) {
                                if (Intrinsics.m97797c(subtitleLanguageMapBean3.getLanAbbr(), locale.getLanguage())) {
                                    booleanRef.element = true;
                                    booleanRef2.element = true;
                                }
                                if (Intrinsics.m97797c(subtitleLanguageMapBean3.getLanAbbr(), "en")) {
                                    z11 = true;
                                }
                            }
                        } else {
                            while (r0.hasNext()) {
                                if (Intrinsics.m97797c(subtitleLanguageMapBean3.getLanAbbr(), locale.getLanguage())) {
                                    booleanRef.element = true;
                                    booleanRef2.element = true;
                                }
                                if (Intrinsics.m97797c(subtitleLanguageMapBean3.getLanAbbr(), "en")) {
                                    z11 = true;
                                }
                            }
                        }
                        if (!booleanRef.element) {
                            subtitleSearchHelper$innerUpdateLanguageList$1.L$0 = list;
                            subtitleSearchHelper$innerUpdateLanguageList$1.L$1 = interfaceC26246d1;
                            subtitleSearchHelper$innerUpdateLanguageList$1.L$2 = booleanRef;
                            subtitleSearchHelper$innerUpdateLanguageList$1.L$3 = booleanRef2;
                            subtitleSearchHelper$innerUpdateLanguageList$1.L$4 = locale;
                            subtitleSearchHelper$innerUpdateLanguageList$1.label = 4;
                            if (interfaceC26246d1.mo102778b("en", true, subtitleSearchHelper$innerUpdateLanguageList$1) == objF) {
                                return objF;
                            }
                        }
                        C26866a.a.m104898f(C26866a.f81698a, f62939d, "get language new,locale =" + locale.getLanguage() + " list = " + list, false, 4, null);
                        Iterator it3 = list.iterator();
                        interfaceC26246d2 = interfaceC26246d1;
                        booleanRef3 = booleanRef;
                        booleanRef4 = booleanRef2;
                        locale2 = locale;
                        it = it3;
                        while (it.hasNext()) {
                            SubtitleLanguageMapBean subtitleLanguageMapBean5 = (SubtitleLanguageMapBean) it.next();
                            lan = subtitleLanguageMapBean5.getLan();
                            String lanIOS4 = subtitleLanguageMapBean5.getLanIOS3();
                            String lanName2 = subtitleLanguageMapBean5.getLanName();
                            if (Intrinsics.m97797c(lan, "in_id")) {
                                str = "in";
                            } else {
                                str = lan;
                            }
                            subtitleLanguageMapBean = new SubtitleLanguageMapBean(lan, lanIOS4, lanName2, (booleanRef3.element && Intrinsics.m97797c(str, "en")) || (booleanRef4.element && Intrinsics.m97797c(str, locale2.getLanguage())));
                            subtitleSearchHelper$innerUpdateLanguageList$1.L$0 = interfaceC26246d2;
                            subtitleSearchHelper$innerUpdateLanguageList$1.L$1 = booleanRef3;
                            subtitleSearchHelper$innerUpdateLanguageList$1.L$2 = booleanRef4;
                            subtitleSearchHelper$innerUpdateLanguageList$1.L$3 = locale2;
                            subtitleSearchHelper$innerUpdateLanguageList$1.L$4 = it;
                            subtitleSearchHelper$innerUpdateLanguageList$1.label = 5;
                            if (interfaceC26246d2.mo102779c(subtitleLanguageMapBean, subtitleSearchHelper$innerUpdateLanguageList$1) == objF) {
                                return objF;
                            }
                        }
                        objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
                        thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                        if (thM112710exceptionOrNullimpl != null) {
                            this.f62942b = false;
                            C26866a.a.m104901l(C26866a.f81698a, f62939d, "get language list error:" + thM112710exceptionOrNullimpl, false, 4, null);
                            subtitleSearchHelper$innerUpdateLanguageList$1.L$0 = null;
                            subtitleSearchHelper$innerUpdateLanguageList$1.L$1 = null;
                            subtitleSearchHelper$innerUpdateLanguageList$1.L$2 = null;
                            subtitleSearchHelper$innerUpdateLanguageList$1.L$3 = null;
                            subtitleSearchHelper$innerUpdateLanguageList$1.L$4 = null;
                            subtitleSearchHelper$innerUpdateLanguageList$1.label = 7;
                            if (m82154f(subtitleSearchHelper$innerUpdateLanguageList$1) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f75682a;
                    }
                    list4 = list2;
                    if (list4 != null) {
                        C26866a.a.m104910z(C26866a.f81698a, f62939d, "language list all null~", false, 4, null);
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$0 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$1 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.label = 3;
                        if (m82154f(subtitleSearchHelper$innerUpdateLanguageList$1) == objF) {
                            return objF;
                        }
                    } else {
                        C26866a.a.m104910z(C26866a.f81698a, f62939d, "language list all null~", false, 4, null);
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$0 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$1 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.label = 3;
                        if (m82154f(subtitleSearchHelper$innerUpdateLanguageList$1) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f75682a;
                case 3:
                    ResultKt.m97107b(obj);
                    return Unit.f75682a;
                case 4:
                    locale = (Locale) subtitleSearchHelper$innerUpdateLanguageList$1.L$4;
                    booleanRef2 = (Ref.BooleanRef) subtitleSearchHelper$innerUpdateLanguageList$1.L$3;
                    booleanRef = (Ref.BooleanRef) subtitleSearchHelper$innerUpdateLanguageList$1.L$2;
                    interfaceC26246d1 = (InterfaceC26246d1) subtitleSearchHelper$innerUpdateLanguageList$1.L$1;
                    list = (List) subtitleSearchHelper$innerUpdateLanguageList$1.L$0;
                    ResultKt.m97107b(obj);
                    C26866a.a.m104898f(C26866a.f81698a, f62939d, "get language new,locale =" + locale.getLanguage() + " list = " + list, false, 4, null);
                    Iterator it4 = list.iterator();
                    interfaceC26246d2 = interfaceC26246d1;
                    booleanRef3 = booleanRef;
                    booleanRef4 = booleanRef2;
                    locale2 = locale;
                    it = it4;
                    while (it.hasNext()) {
                        SubtitleLanguageMapBean subtitleLanguageMapBean6 = (SubtitleLanguageMapBean) it.next();
                        lan = subtitleLanguageMapBean6.getLan();
                        String lanIOS5 = subtitleLanguageMapBean6.getLanIOS3();
                        String lanName3 = subtitleLanguageMapBean6.getLanName();
                        if (Intrinsics.m97797c(lan, "in_id")) {
                            str = "in";
                        } else {
                            str = lan;
                        }
                        subtitleLanguageMapBean = new SubtitleLanguageMapBean(lan, lanIOS5, lanName3, (booleanRef3.element && Intrinsics.m97797c(str, "en")) || (booleanRef4.element && Intrinsics.m97797c(str, locale2.getLanguage())));
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$0 = interfaceC26246d2;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$1 = booleanRef3;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$2 = booleanRef4;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$3 = locale2;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$4 = it;
                        subtitleSearchHelper$innerUpdateLanguageList$1.label = 5;
                        if (interfaceC26246d2.mo102779c(subtitleLanguageMapBean, subtitleSearchHelper$innerUpdateLanguageList$1) == objF) {
                            return objF;
                        }
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
                    thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                    if (thM112710exceptionOrNullimpl != null) {
                        this.f62942b = false;
                        C26866a.a.m104901l(C26866a.f81698a, f62939d, "get language list error:" + thM112710exceptionOrNullimpl, false, 4, null);
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$0 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$1 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$2 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$3 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$4 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.label = 7;
                        if (m82154f(subtitleSearchHelper$innerUpdateLanguageList$1) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f75682a;
                case 5:
                    it = (Iterator) subtitleSearchHelper$innerUpdateLanguageList$1.L$4;
                    locale2 = (Locale) subtitleSearchHelper$innerUpdateLanguageList$1.L$3;
                    booleanRef4 = (Ref.BooleanRef) subtitleSearchHelper$innerUpdateLanguageList$1.L$2;
                    booleanRef3 = (Ref.BooleanRef) subtitleSearchHelper$innerUpdateLanguageList$1.L$1;
                    interfaceC26246d2 = (InterfaceC26246d1) subtitleSearchHelper$innerUpdateLanguageList$1.L$0;
                    ResultKt.m97107b(obj);
                    while (it.hasNext()) {
                        SubtitleLanguageMapBean subtitleLanguageMapBean7 = (SubtitleLanguageMapBean) it.next();
                        lan = subtitleLanguageMapBean7.getLan();
                        String lanIOS6 = subtitleLanguageMapBean7.getLanIOS3();
                        String lanName4 = subtitleLanguageMapBean7.getLanName();
                        if (Intrinsics.m97797c(lan, "in_id")) {
                            str = "in";
                        } else {
                            str = lan;
                        }
                        subtitleLanguageMapBean = new SubtitleLanguageMapBean(lan, lanIOS6, lanName4, (booleanRef3.element && Intrinsics.m97797c(str, "en")) || (booleanRef4.element && Intrinsics.m97797c(str, locale2.getLanguage())));
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$0 = interfaceC26246d2;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$1 = booleanRef3;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$2 = booleanRef4;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$3 = locale2;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$4 = it;
                        subtitleSearchHelper$innerUpdateLanguageList$1.label = 5;
                        if (interfaceC26246d2.mo102779c(subtitleLanguageMapBean, subtitleSearchHelper$innerUpdateLanguageList$1) == objF) {
                            return objF;
                        }
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
                    thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                    if (thM112710exceptionOrNullimpl != null) {
                        this.f62942b = false;
                        C26866a.a.m104901l(C26866a.f81698a, f62939d, "get language list error:" + thM112710exceptionOrNullimpl, false, 4, null);
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$0 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$1 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$2 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$3 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$4 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.label = 7;
                        if (m82154f(subtitleSearchHelper$innerUpdateLanguageList$1) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f75682a;
                case 6:
                    ResultKt.m97107b(obj);
                    objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
                    thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                    if (thM112710exceptionOrNullimpl != null) {
                        this.f62942b = false;
                        C26866a.a.m104901l(C26866a.f81698a, f62939d, "get language list error:" + thM112710exceptionOrNullimpl, false, 4, null);
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$0 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$1 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$2 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$3 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.L$4 = null;
                        subtitleSearchHelper$innerUpdateLanguageList$1.label = 7;
                        if (m82154f(subtitleSearchHelper$innerUpdateLanguageList$1) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f75682a;
                case 7:
                    ResultKt.m97107b(obj);
                    return Unit.f75682a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final SubtitleSearchHelper m82156h() {
        return new SubtitleSearchHelper();
    }

    /* JADX INFO: renamed from: i */
    private final String m82157i() {
        try {
            InputStream inputStreamOpen = Utils.m27275a().getResources().getAssets().open("sub_def_la.json");
            Intrinsics.m97799e(inputStreamOpen);
            return Okio.buffer(Okio.source(inputStreamOpen)).readUtf8();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m82158e(DownloadBean downloadBean) {
        String name;
        if (downloadBean == null || (name = downloadBean.getTitleName()) == null) {
            name = downloadBean != null ? downloadBean.getName() : null;
            if (name == null) {
                name = "";
            }
        }
        String strQ = name;
        String str = (downloadBean != null ? Integer.valueOf(downloadBean.getResolution()) : null) + "P";
        if (StringsKt.m98132c0(strQ, (downloadBean != null ? Integer.valueOf(downloadBean.getResolution()) : null) + "P", false, 2, null)) {
            strQ = StringsKt.m98236Q(strQ, str, "", false, 4, null);
        }
        return new Regex("[\\\\/:#*?\"<>|&]_-").replace(strQ, " ");
    }

    /* JADX INFO: renamed from: j */
    public final void m82159j() {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new SubtitleSearchHelper$updateLanguageList$1(this, null), 3, null);
    }
}
