package com.transsion.mbwidget.data;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.AbstractC5796o;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.gslb.GslbSdk;
import com.transsion.mbwidget.C15716d;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.flow.AbstractC25021i1;
import kotlinx.coroutines.flow.InterfaceC25018h1;
import kotlinx.coroutines.flow.InterfaceC25075x0;
import org.mvel2.ast.ASTNode;
import p349dh.C22982c;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
public final class SportWidgetDataManager {

    /* JADX INFO: renamed from: b */
    private static volatile long f54089b;

    /* JADX INFO: renamed from: c */
    private static volatile boolean f54090c;

    /* JADX INFO: renamed from: e */
    private static SportMatch f54092e;

    /* JADX INFO: renamed from: f */
    private static final InterfaceC25075x0 f54093f;

    /* JADX INFO: renamed from: g */
    private static final InterfaceC25018h1 f54094g;

    /* JADX INFO: renamed from: a */
    public static final SportWidgetDataManager f54088a = new SportWidgetDataManager();

    /* JADX INFO: renamed from: d */
    private static final Lazy f54091d = LazyKt.m97097b(new Function0() { // from class: com.transsion.mbwidget.data.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportWidgetDataManager.m69650n();
        }
    });

    static {
        InterfaceC25075x0 interfaceC25075x0M98823a = AbstractC25021i1.m98823a(null);
        f54093f = interfaceC25075x0M98823a;
        f54094g = interfaceC25075x0M98823a;
    }

    private SportWidgetDataManager() {
    }

    /* JADX INFO: renamed from: d */
    private final void m69646d() {
        f54089b = 0L;
        int i11 = Build.VERSION.SDK_INT;
        Context contextCreateDeviceProtectedStorageContext = i11 >= 24 ? GslbSdk.context.createDeviceProtectedStorageContext() : GslbSdk.context;
        Intent intent = new Intent(contextCreateDeviceProtectedStorageContext, (Class<?>) SportWidgetRefreshReceiver.class);
        intent.setAction("com.transsion.mbwidget.ACTION_MATCH_REFRESH");
        PendingIntent broadcast = PendingIntent.getBroadcast(contextCreateDeviceProtectedStorageContext, 202603051, intent, i11 >= 31 ? 201326592 : ASTNode.NOJIT);
        Object systemService = contextCreateDeviceProtectedStorageContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
        AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
        if (alarmManager != null) {
            alarmManager.cancel(broadcast);
        }
        C26866a.f81698a.m104912c("SportWidget", "Cancel match refresh alarm", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final void m69647f() {
        f54092e = null;
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new SportWidgetDataManager$forceRefresh$1(null), 3, null);
    }

    /* JADX INFO: renamed from: i */
    private final SportMatch m69648i() {
        try {
            String string = C15716d.f54081a.m69635k().getString("sport_widget_match_cache", null);
            if (string != null) {
                return (SportMatch) AbstractC5796o.m27441d(string, SportMatch.class);
            }
            return null;
        } catch (Exception e11) {
            C26866a.a.m104900k(C26866a.f81698a, "SportWidget", "Get cached match error: " + e11.getMessage(), e11, false, 8, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    private final InterfaceC15724a m69649j() {
        return (InterfaceC15724a) f54091d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC15724a m69650n() {
        return (InterfaceC15724a) C22982c.f70163e.m91553a().m91552h(InterfaceC15724a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, com.transsion.mbwidget.data.SportMatch] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, com.transsion.mbwidget.data.SportMatch, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: q */
    public final Object m69651q(Continuation continuation) throws Throwable {
        SportWidgetDataManager$requestMatch$1 sportWidgetDataManager$requestMatch$1;
        Ref.ObjectRef objectRef;
        Ref.BooleanRef booleanRef;
        SportWidgetDataManager sportWidgetDataManager;
        Object objM112707constructorimpl;
        ?? r11;
        SportMatch sportMatchM69700b;
        if (continuation instanceof SportWidgetDataManager$requestMatch$1) {
            sportWidgetDataManager$requestMatch$1 = (SportWidgetDataManager$requestMatch$1) continuation;
            int i11 = sportWidgetDataManager$requestMatch$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sportWidgetDataManager$requestMatch$1.label = i11 - Integer.MIN_VALUE;
            } else {
                sportWidgetDataManager$requestMatch$1 = new SportWidgetDataManager$requestMatch$1(this, continuation);
            }
        } else {
            sportWidgetDataManager$requestMatch$1 = new SportWidgetDataManager$requestMatch$1(this, continuation);
        }
        SportWidgetDataManager$requestMatch$1 sportWidgetDataManager$requestMatch$2 = sportWidgetDataManager$requestMatch$1;
        Object objM69695a = sportWidgetDataManager$requestMatch$2.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = sportWidgetDataManager$requestMatch$2.label;
        if (i12 == 0) {
            ResultKt.m97107b(objM69695a);
            if (f54090c) {
                C26866a.a.m104898f(C26866a.f81698a, "SportWidget", "[Lab] requestMatch started (laboratory trigger)", false, 4, null);
                f54090c = false;
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            try {
                Result.Companion companion = Result.INSTANCE;
                C26866a.f81698a.m104912c("SportWidget", "Request match from API...", true);
                InterfaceC15724a interfaceC15724aM69649j = m69649j();
                sportWidgetDataManager$requestMatch$2.L$0 = objectRef2;
                sportWidgetDataManager$requestMatch$2.L$1 = booleanRef2;
                sportWidgetDataManager$requestMatch$2.L$2 = this;
                sportWidgetDataManager$requestMatch$2.label = 1;
                objM69695a = InterfaceC15724a.a.m69695a(interfaceC15724aM69649j, null, null, sportWidgetDataManager$requestMatch$2, 3, null);
                if (objM69695a == objF) {
                    return objF;
                }
                sportWidgetDataManager = this;
                objectRef = objectRef2;
                booleanRef = booleanRef2;
            } catch (Throwable th2) {
                th = th2;
                objectRef = objectRef2;
                booleanRef = booleanRef2;
                Result.Companion companion2 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th));
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SportWidgetDataManager sportWidgetDataManager2 = (SportWidgetDataManager) sportWidgetDataManager$requestMatch$2.L$2;
            booleanRef = (Ref.BooleanRef) sportWidgetDataManager$requestMatch$2.L$1;
            objectRef = (Ref.ObjectRef) sportWidgetDataManager$requestMatch$2.L$0;
            try {
                ResultKt.m97107b(objM69695a);
                sportWidgetDataManager = sportWidgetDataManager2;
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion3 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th));
            }
        }
        BaseDto baseDto = (BaseDto) objM69695a;
        if (!Intrinsics.m97797c(baseDto.getCode(), "0")) {
            baseDto = null;
        }
        BffMatchData bffMatchData = baseDto != null ? (BffMatchData) baseDto.getData() : null;
        if (bffMatchData != null) {
            C26866a.a aVar = C26866a.f81698a;
            List<ServerMatchItem> list = bffMatchData.getList();
            aVar.m104912c("SportWidget", "API request success, data list size: " + (list != null ? list.size() : 0), true);
            ServerMatchItem serverMatchItemM69699a = AbstractC15726c.m69699a(bffMatchData.getList());
            if (serverMatchItemM69699a != null) {
                sportMatchM69700b = AbstractC15726c.m69700b(serverMatchItemM69699a);
            } else {
                r11 = 0;
            }
            if (r11 != 0) {
                r11 = sportMatchM69700b;
                sportWidgetDataManager.m69652r(r11);
                f54092e = r11;
                f54093f.setValue(r11);
                aVar.m104912c("SportWidget", "Request match success: " + r11.getMatchId(), true);
                sportWidgetDataManager.m69653s(r11);
                objectRef.element = r11;
            } else {
                r11 = sportMatchM69700b;
                aVar.m104912c("SportWidget", "No valid match from API response (conversion failed or empty list)", true);
                f54092e = null;
                f54093f.setValue(null);
            }
        } else {
            C26866a.f81698a.m104912c("SportWidget", "API response failed, need fallback", true);
            booleanRef.element = true;
        }
        objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104900k(C26866a.f81698a, "SportWidget", "Request match error: " + thM112710exceptionOrNullimpl.getMessage(), thM112710exceptionOrNullimpl, false, 8, null);
            booleanRef.element = true;
        }
        if (objectRef.element == 0 && booleanRef.element) {
            C26866a.f81698a.m104912c("SportWidget", "API failed, use fallback data (cache > mock)", true);
            objectRef.element = m69654t();
        }
        return objectRef.element;
    }

    /* JADX INFO: renamed from: r */
    private final void m69652r(SportMatch sportMatch) {
        try {
            C15716d.f54081a.m69635k().putString("sport_widget_match_cache", AbstractC5796o.m27447j(sportMatch));
        } catch (Exception e11) {
            C26866a.a.m104900k(C26866a.f81698a, "SportWidget", "Save cache error: " + e11.getMessage(), e11, false, 8, null);
        }
    }

    /* JADX INFO: renamed from: s */
    private final void m69653s(SportMatch sportMatch) {
        if (sportMatch.getStatus() == MatchStatus.NOT_START && sportMatch.getMatchTime() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long matchTime = sportMatch.getMatchTime() + 300000;
            long j11 = matchTime - jCurrentTimeMillis;
            if (j11 <= 0) {
                C26866a.f81698a.m104912c("SportWidget", "Skip scheduleMatchRefresh: triggerAt=" + matchTime + ", now=" + jCurrentTimeMillis + ", delta=" + j11 + ", matchId=" + sportMatch.getMatchId() + ", status=" + sportMatch.getStatus(), true);
                return;
            }
            long j12 = f54089b;
            if (jCurrentTimeMillis + 1 <= j12 && j12 < matchTime) {
                C26866a.f81698a.m104912c("SportWidget", "Skip scheduleMatchRefresh: keep earlier alarm at " + j12 + ", new trigger " + matchTime + " is later, matchId=" + sportMatch.getMatchId(), true);
                return;
            }
            int i11 = Build.VERSION.SDK_INT;
            Context contextCreateDeviceProtectedStorageContext = i11 >= 24 ? GslbSdk.context.createDeviceProtectedStorageContext() : GslbSdk.context;
            Intent intent = new Intent(contextCreateDeviceProtectedStorageContext, (Class<?>) SportWidgetRefreshReceiver.class);
            intent.setAction("com.transsion.mbwidget.ACTION_MATCH_REFRESH");
            PendingIntent broadcast = PendingIntent.getBroadcast(contextCreateDeviceProtectedStorageContext, 202603051, intent, i11 >= 31 ? 201326592 : ASTNode.NOJIT);
            Object systemService = contextCreateDeviceProtectedStorageContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
            AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
            if (alarmManager != null) {
                alarmManager.setAndAllowWhileIdle(0, matchTime, broadcast);
                f54089b = matchTime;
            }
            C26866a.f81698a.m104912c("SportWidget", "Schedule match refresh at " + matchTime + " (in " + j11 + "ms), matchId=" + sportMatch.getMatchId(), true);
        }
    }

    /* JADX INFO: renamed from: t */
    private final SportMatch m69654t() {
        C26866a.a aVar = C26866a.f81698a;
        aVar.m104912c("SportWidget", "Using fallback data...", true);
        SportMatch sportMatchM69648i = m69648i();
        if (sportMatchM69648i == null) {
            aVar.m104912c("SportWidget", "Mock fallback disabled, return null to show Fallback UI", true);
            return null;
        }
        aVar.m104912c("SportWidget", "Use cached match as fallback: " + sportMatchM69648i.getMatchId(), true);
        f54092e = sportMatchM69648i;
        f54093f.setValue(sportMatchM69648i);
        m69653s(sportMatchM69648i);
        return sportMatchM69648i;
    }

    /* JADX INFO: renamed from: e */
    public final void m69655e() {
        f54092e = null;
        f54093f.setValue(null);
    }

    /* JADX INFO: renamed from: g */
    public final Object m69656g(Continuation continuation) throws Throwable {
        C26866a.f81698a.m104912c("SportWidget", "Force refresh for match change (periodic or after match start)", true);
        Object objM69651q = m69651q(continuation);
        return objM69651q == IntrinsicsKt.m97630f() ? objM69651q : Unit.f75682a;
    }

    /* JADX INFO: renamed from: h */
    public final void m69657h() {
        f54090c = true;
        C26866a.f81698a.m104912c("SportWidget", "[Lab] forceRefresh triggered from Laboratory", true);
        m69647f();
    }

    /* JADX INFO: renamed from: k */
    public final Object m69658k(Continuation continuation) {
        if (f54092e == null) {
            return m69651q(continuation);
        }
        C26866a.a aVar = C26866a.f81698a;
        SportMatch sportMatch = f54092e;
        aVar.m104912c("SportWidget", "Return memory cached match: " + (sportMatch != null ? sportMatch.getMatchId() : null), true);
        return f54092e;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m69659l(SportMatch sportMatch) {
        return sportMatch != null && C15727d.f54110a.m69701a(sportMatch);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m69660m(SportMatch sportMatch) {
        return sportMatch != null && C15727d.f54110a.m69702b(sportMatch);
    }

    /* JADX INFO: renamed from: o */
    public final void m69661o() {
        C26866a.f81698a.m104912c("SportWidget", "All sport widgets removed, clear memory and persistent cache", true);
        m69646d();
        f54092e = null;
        f54093f.setValue(null);
        try {
            C15716d.f54081a.m69635k().remove("sport_widget_match_cache");
        } catch (Exception e11) {
            C26866a.a.m104900k(C26866a.f81698a, "SportWidget", "Clear persistent cache error: " + e11.getMessage(), e11, false, 8, null);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m69662p() {
        C26866a.f81698a.m104912c("SportWidget", "Refresh on user click (likely viewing live match)", true);
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new SportWidgetDataManager$refreshOnUserClick$1(null), 3, null);
    }
}
