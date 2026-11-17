package com.transsion.mbwidget.data;

import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.transsion.mbwidget.SportSchedulePreviewWidgetProvider;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25132j;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25143l2;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m97100d2 = {"Lcom/transsion/mbwidget/data/SportWidgetRefreshReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "a", "DeskWidget_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class SportWidgetRefreshReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: com.transsion.mbwidget.data.SportWidgetRefreshReceiver$onReceive$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.mbwidget.data.SportWidgetRefreshReceiver$onReceive$1", m97637f = "SportWidgetRefreshReceiver.kt", m97638l = {}, m97639m = "invokeSuspend")
    @SourceDebugExtension
    static final class C157221 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        int label;

        /* JADX INFO: renamed from: com.transsion.mbwidget.data.SportWidgetRefreshReceiver$onReceive$1$1, reason: invalid class name */
        @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
        @DebugMetadata(m97636c = "com.transsion.mbwidget.data.SportWidgetRefreshReceiver$onReceive$1$1", m97637f = "SportWidgetRefreshReceiver.kt", m97638l = {33}, m97639m = "invokeSuspend")
        static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = IntrinsicsKt.m97630f();
                int i11 = this.label;
                if (i11 == 0) {
                    ResultKt.m97107b(obj);
                    SportWidgetDataManager sportWidgetDataManager = SportWidgetDataManager.f54088a;
                    this.label = 1;
                    if (sportWidgetDataManager.m69656g(this) == objF) {
                        return objF;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(obj);
                }
                return Unit.f75682a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C157221(Context context, BroadcastReceiver.PendingResult pendingResult, Continuation<? super C157221> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$pendingResult = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C157221(this.$ctx, this.$pendingResult, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C157221) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            try {
                try {
                    C26866a.a aVar = C26866a.f81698a;
                    aVar.m104912c("SportWidget", "SportWidgetRefreshReceiver: alarm fired at " + System.currentTimeMillis(), true);
                    AbstractC25132j.m99054b(null, new AnonymousClass1(null), 1, null);
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.$ctx);
                    int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(this.$ctx, (Class<?>) SportSchedulePreviewWidgetProvider.class));
                    Intrinsics.m97799e(appWidgetIds);
                    if (appWidgetIds.length == 0) {
                        aVar.m104912c("SportWidget", "SportWidgetRefreshReceiver: no sport widget instance, skip", true);
                    } else {
                        Context context = this.$ctx;
                        for (int i11 : appWidgetIds) {
                            SportSchedulePreviewWidgetProvider.Companion companion = SportSchedulePreviewWidgetProvider.INSTANCE;
                            Intrinsics.m97799e(context);
                            Intrinsics.m97799e(appWidgetManager);
                            companion.m69624q(context, appWidgetManager, i11, true);
                        }
                        C26866a.f81698a.m104912c("SportWidget", "SportWidgetRefreshReceiver: refreshed " + appWidgetIds.length + " sport widget(s)", true);
                    }
                } catch (Exception e11) {
                    C26866a.a aVar2 = C26866a.f81698a;
                    C26866a.a.m104900k(aVar2, "SportWidget", "SportWidgetRefreshReceiver error: " + e11.getMessage(), e11, false, 8, null);
                    aVar2.m104912c("SportWidget", "SportWidgetRefreshReceiver FAILED: " + e11.getMessage(), true);
                }
                return Unit.f75682a;
            } finally {
                this.$pendingResult.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(intent, "intent");
        if (Intrinsics.m97797c("com.transsion.mbwidget.ACTION_MATCH_REFRESH", intent.getAction())) {
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b().plus(AbstractC25143l2.m99069b(null, 1, null))), null, null, new C157221(context.getApplicationContext(), pendingResultGoAsync, null), 3, null);
        }
    }
}
