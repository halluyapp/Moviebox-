package com.transsion.mbwidget.data;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.AbstractC4569i;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.mbwidget.SportSchedulePreviewWidgetProvider;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, m97100d2 = {"Lcom/transsion/mbwidget/data/SportWidgetPeriodicWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/i$a;", CampaignEx.JSON_KEY_AD_R, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "a", "DeskWidget_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SportWidgetPeriodicWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportWidgetPeriodicWorker(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(params, "params");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00db  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x00db, please report this as an issue */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: r */
    public Object mo22326r(Continuation continuation) throws Throwable {
        SportWidgetPeriodicWorker$doWork$1 sportWidgetPeriodicWorker$doWork$1;
        Object objM112707constructorimpl;
        Throwable thM112710exceptionOrNullimpl;
        AppWidgetManager appWidgetManager;
        SportWidgetPeriodicWorker sportWidgetPeriodicWorker;
        int[] iArr;
        AbstractC4569i.a aVarM22418c;
        if (continuation instanceof SportWidgetPeriodicWorker$doWork$1) {
            sportWidgetPeriodicWorker$doWork$1 = (SportWidgetPeriodicWorker$doWork$1) continuation;
            int i11 = sportWidgetPeriodicWorker$doWork$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sportWidgetPeriodicWorker$doWork$1.label = i11 - Integer.MIN_VALUE;
            } else {
                sportWidgetPeriodicWorker$doWork$1 = new SportWidgetPeriodicWorker$doWork$1(this, continuation);
            }
        } else {
            sportWidgetPeriodicWorker$doWork$1 = new SportWidgetPeriodicWorker$doWork$1(this, continuation);
        }
        Object obj = sportWidgetPeriodicWorker$doWork$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = sportWidgetPeriodicWorker$doWork$1.label;
        try {
            if (i12 == 0) {
                ResultKt.m97107b(obj);
                Result.Companion companion = Result.INSTANCE;
                appWidgetManager = AppWidgetManager.getInstance(m22406b());
                int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(m22406b(), (Class<?>) SportSchedulePreviewWidgetProvider.class));
                Intrinsics.m97799e(appWidgetIds);
                if (appWidgetIds.length == 0) {
                    C26866a.f81698a.m104912c("SportWidget", "SportWidgetPeriodicWorker: no sport widget instance, skip", true);
                    aVarM22418c = AbstractC4569i.a.m22418c();
                } else {
                    SportWidgetDataManager sportWidgetDataManager = SportWidgetDataManager.f54088a;
                    sportWidgetPeriodicWorker$doWork$1.L$0 = this;
                    sportWidgetPeriodicWorker$doWork$1.L$1 = appWidgetManager;
                    sportWidgetPeriodicWorker$doWork$1.L$2 = appWidgetIds;
                    sportWidgetPeriodicWorker$doWork$1.label = 1;
                    if (sportWidgetDataManager.m69656g(sportWidgetPeriodicWorker$doWork$1) == objF) {
                        return objF;
                    }
                    sportWidgetPeriodicWorker = this;
                    iArr = appWidgetIds;
                }
                objM112707constructorimpl = Result.m112707constructorimpl(aVarM22418c);
                thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                if (thM112710exceptionOrNullimpl == null) {
                    return objM112707constructorimpl;
                }
                C26866a.a.m104900k(C26866a.f81698a, "SportWidget", "SportWidgetPeriodicWorker error: " + thM112710exceptionOrNullimpl.getMessage(), thM112710exceptionOrNullimpl, false, 8, null);
                AbstractC4569i.a aVarM22416a = AbstractC4569i.a.m22416a();
                Intrinsics.m97801g(aVarM22416a, "failure(...)");
                return aVarM22416a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iArr = (int[]) sportWidgetPeriodicWorker$doWork$1.L$2;
            appWidgetManager = (AppWidgetManager) sportWidgetPeriodicWorker$doWork$1.L$1;
            sportWidgetPeriodicWorker = (SportWidgetPeriodicWorker) sportWidgetPeriodicWorker$doWork$1.L$0;
            ResultKt.m97107b(obj);
            Intrinsics.m97799e(iArr);
            for (int i13 : iArr) {
                SportSchedulePreviewWidgetProvider.Companion companion2 = SportSchedulePreviewWidgetProvider.INSTANCE;
                Context contextM22406b = sportWidgetPeriodicWorker.m22406b();
                Intrinsics.m97801g(contextM22406b, "getApplicationContext(...)");
                Intrinsics.m97799e(appWidgetManager);
                SportSchedulePreviewWidgetProvider.Companion.m69623r(companion2, contextM22406b, appWidgetManager, i13, false, 8, null);
            }
            C26866a.f81698a.m104912c("SportWidget", "SportWidgetPeriodicWorker: refreshed " + iArr.length + " sport widget(s)", true);
            aVarM22418c = AbstractC4569i.a.m22418c();
            objM112707constructorimpl = Result.m112707constructorimpl(aVarM22418c);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl == null) {
            return objM112707constructorimpl;
        }
        C26866a.a.m104900k(C26866a.f81698a, "SportWidget", "SportWidgetPeriodicWorker error: " + thM112710exceptionOrNullimpl.getMessage(), thM112710exceptionOrNullimpl, false, 8, null);
        AbstractC4569i.a aVarM22416a2 = AbstractC4569i.a.m22416a();
        Intrinsics.m97801g(aVarM22416a2, "failure(...)");
        return aVarM22416a2;
    }
}
