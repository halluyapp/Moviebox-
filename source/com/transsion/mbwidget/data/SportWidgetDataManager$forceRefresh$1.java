package com.transsion.mbwidget.data;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import com.transsion.gslb.GslbSdk;
import com.transsion.mbwidget.SportSchedulePreviewWidgetProvider;
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
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.mbwidget.data.SportWidgetDataManager$forceRefresh$1", m97637f = "SportWidgetDataManager.kt", m97638l = {235, 236}, m97639m = "invokeSuspend")
final class SportWidgetDataManager$forceRefresh$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: renamed from: com.transsion.mbwidget.data.SportWidgetDataManager$forceRefresh$1$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.mbwidget.data.SportWidgetDataManager$forceRefresh$1$1", m97637f = "SportWidgetDataManager.kt", m97638l = {}, m97639m = "invokeSuspend")
    @SourceDebugExtension
    static final class C157191 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;

        C157191(Continuation<? super C157191> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C157191(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C157191) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            Context applicationContext = GslbSdk.context.getApplicationContext();
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(applicationContext);
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(applicationContext, (Class<?>) SportSchedulePreviewWidgetProvider.class));
            Intrinsics.m97799e(appWidgetIds);
            if (!(appWidgetIds.length == 0)) {
                for (int i11 : appWidgetIds) {
                    SportSchedulePreviewWidgetProvider.Companion companion = SportSchedulePreviewWidgetProvider.INSTANCE;
                    Intrinsics.m97799e(applicationContext);
                    Intrinsics.m97799e(appWidgetManager);
                    companion.m69624q(applicationContext, appWidgetManager, i11, true);
                }
                C26866a.f81698a.m104912c("SportWidget", "Force refresh: updated " + appWidgetIds.length + " sport widget(s)", true);
            }
            return Unit.f75682a;
        }
    }

    SportWidgetDataManager$forceRefresh$1(Continuation<? super SportWidgetDataManager$forceRefresh$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportWidgetDataManager$forceRefresh$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SportWidgetDataManager$forceRefresh$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.m97107b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return Unit.f75682a;
        }
        ResultKt.m97107b(obj);
        SportWidgetDataManager sportWidgetDataManager = SportWidgetDataManager.f54088a;
        this.label = 1;
        if (sportWidgetDataManager.m69651q(this) == objF) {
            return objF;
        }
        AbstractC24917a2 abstractC24917a2M99269c = C25220y0.m99269c();
        C157191 c157191 = new C157191(null);
        this.label = 2;
        if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c157191, this) == objF) {
            return objF;
        }
        return Unit.f75682a;
    }
}
