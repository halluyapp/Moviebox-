package com.transsion.mbwidget.data;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.AbstractC4569i;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.gslb.GslbSdk;
import com.transsion.mbwidget.HotSubjectWidgetProvider;
import com.transsion.mbwidget.PlayWidgetProvider;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, m97100d2 = {"Lcom/transsion/mbwidget/data/WidgetRefreshWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/i$a;", CampaignEx.JSON_KEY_AD_R, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "a", "DeskWidget_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class WidgetRefreshWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.transsion.mbwidget.data.WidgetRefreshWorker$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m69692a() {
            try {
                Result.Companion companion = Result.INSTANCE;
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(GslbSdk.context);
                if (WidgetDataManager.f54097a.m69691y()) {
                    int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(GslbSdk.context, (Class<?>) HotSubjectWidgetProvider.class));
                    Intrinsics.m97799e(appWidgetIds);
                    if (!(appWidgetIds.length == 0)) {
                        for (int i11 : appWidgetIds) {
                            HotSubjectWidgetProvider.Companion companion2 = HotSubjectWidgetProvider.INSTANCE;
                            Context context = GslbSdk.context;
                            Intrinsics.m97801g(context, "context");
                            Intrinsics.m97799e(appWidgetManager);
                            HotSubjectWidgetProvider.Companion.m69602f(companion2, context, appWidgetManager, i11, null, 8, null);
                        }
                    }
                }
                int[] appWidgetIds2 = appWidgetManager.getAppWidgetIds(new ComponentName(GslbSdk.context, (Class<?>) PlayWidgetProvider.class));
                Intrinsics.m97799e(appWidgetIds2);
                if (!(appWidgetIds2.length == 0)) {
                    for (int i12 : appWidgetIds2) {
                        PlayWidgetProvider.Companion companion3 = PlayWidgetProvider.INSTANCE;
                        Context context2 = GslbSdk.context;
                        Intrinsics.m97801g(context2, "context");
                        Intrinsics.m97799e(appWidgetManager);
                        companion3.m69606c(context2, appWidgetManager, i12);
                    }
                }
                C26866a.a.m104898f(C26866a.f81698a, "DeskWidget_", "doWork, refresh completed", false, 4, null);
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetRefreshWorker(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(params, "params");
    }

    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: r */
    public Object mo22326r(Continuation continuation) {
        C26866a.a.m104898f(C26866a.f81698a, "DeskWidget_", "doWork, refresh:" + WidgetDataManager.f54097a.m69691y(), false, 4, null);
        INSTANCE.m69692a();
        AbstractC4569i.a aVarM22418c = AbstractC4569i.a.m22418c();
        Intrinsics.m97801g(aVarM22418c, "success(...)");
        return aVarM22418c;
    }
}
