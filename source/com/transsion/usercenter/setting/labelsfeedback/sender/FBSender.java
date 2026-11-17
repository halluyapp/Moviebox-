package com.transsion.usercenter.setting.labelsfeedback.sender;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.LiveData;
import androidx.work.C4564d;
import androidx.work.C4687k;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.blankj.utilcode.util.AbstractC5796o;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.tencent.mmkv.MMKV;
import com.transsion.usercenter.R$string;
import com.transsion.usercenter.setting.labelsfeedback.model.FbDataModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p743rh.C27287m;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes.dex */
public final class FBSender {

    /* JADX INFO: renamed from: a */
    public static final FBSender f65533a = new FBSender();

    /* JADX INFO: renamed from: b */
    private static final Lazy f65534b = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.setting.labelsfeedback.sender.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FBSender.m85819g();
        }
    });

    /* JADX INFO: renamed from: com.transsion.usercenter.setting.labelsfeedback.sender.FBSender$a */
    /* JADX INFO: loaded from: classes7.dex */
    public static final class C20847a implements InterfaceC3189c0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ LiveData f65535a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f65536b;

        /* JADX INFO: renamed from: com.transsion.usercenter.setting.labelsfeedback.sender.FBSender$a$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f65537a;

            static {
                int[] iArr = new int[WorkInfo.State.values().length];
                try {
                    iArr[WorkInfo.State.SUCCEEDED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WorkInfo.State.FAILED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f65537a = iArr;
            }
        }

        C20847a(LiveData liveData, String str) {
            this.f65535a = liveData;
            this.f65536b = str;
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(WorkInfo workInfo) {
            WorkInfo.State stateM22332a = workInfo != null ? workInfo.m22332a() : null;
            int i11 = stateM22332a == null ? -1 : a.f65537a[stateM22332a.ordinal()];
            if (i11 == 1) {
                C28951b.f88586a.m111454d(R$string.feedback_tips_suceess);
                this.f65535a.mo14856o(this);
                FBSender.f65533a.m85821k(null);
            } else {
                if (i11 != 2) {
                    return;
                }
                C28951b.f88586a.m111454d(R$string.feedback_tips_failed);
                this.f65535a.mo14856o(this);
                FBSender.f65533a.m85821k(this.f65536b);
            }
        }
    }

    private FBSender() {
    }

    /* JADX INFO: renamed from: d */
    private final String m85817d() {
        return m85818f().m61573k("key_failed_json");
    }

    /* JADX INFO: renamed from: f */
    private final MMKV m85818f() {
        return (MMKV) f65534b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final MMKV m85819g() {
        MMKV mmkvM61551I = MMKV.m61551I("feedback_mmkv");
        Intrinsics.m97801g(mmkvM61551I, "mmkvWithID(...)");
        return mmkvM61551I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final void m85820j(String str, Application application) throws Throwable {
        C4687k.a aVar = new C4687k.a(FbSenderWorker.class);
        Pair[] pairArr = {TuplesKt.m97108a("key_work_data", str)};
        C4564d.a aVar2 = new C4564d.a();
        Pair pair = pairArr[0];
        aVar2.m22394b((String) pair.getFirst(), pair.getSecond());
        C4564d c4564dM22393a = aVar2.m22393a();
        Intrinsics.m97801g(c4564dM22393a, "dataBuilder.build()");
        aVar.m22748l(c4564dM22393a);
        C4687k c4687k = (C4687k) aVar.m22740b();
        Context contextCreateDeviceProtectedStorageContext = application;
        if (Build.VERSION.SDK_INT >= 24) {
            contextCreateDeviceProtectedStorageContext = application.createDeviceProtectedStorageContext();
        }
        WorkManager workManagerM22333f = WorkManager.m22333f(contextCreateDeviceProtectedStorageContext);
        Intrinsics.m97801g(workManagerM22333f, "getInstance(...)");
        workManagerM22333f.m22335a("feedback work name", ExistingWorkPolicy.REPLACE, c4687k).mo22693a();
        LiveData liveDataMo22340g = workManagerM22333f.mo22340g(c4687k.m22735a());
        Intrinsics.m97801g(liveDataMo22340g, "getWorkInfoByIdLiveData(...)");
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new FBSender$sendJson$1(liveDataMo22340g, new C20847a(liveDataMo22340g, str), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final void m85821k(String str) {
        if (str == null) {
            m85818f().remove("key_failed_json");
        } else {
            m85818f().m61580v("key_failed_json", str);
        }
    }

    /* JADX INFO: renamed from: e */
    public final FbDataModel m85822e() {
        String strM85817d = m85817d();
        if (strM85817d == null) {
            return null;
        }
        try {
            return (FbDataModel) AbstractC5796o.m27441d(strM85817d, FbDataModel.class);
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "unable to parse json";
            }
            Log.e(TmcConstants.MENU_KEY_FEEDBACK, message);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m85823h(Application application) throws Throwable {
        String strM85817d;
        Intrinsics.m97802h(application, "application");
        if (C27287m.f83003a.m106330e() && (strM85817d = m85817d()) != null) {
            f65533a.m85820j(strM85817d, application);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m85824i(FbDataModel model, Application application) {
        Intrinsics.m97802h(model, "model");
        Intrinsics.m97802h(application, "application");
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new FBSender$send$1(model, application, null), 3, null);
    }
}
