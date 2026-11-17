package com.transsion.home.repository;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.home.HomePreferencesIntervalTimeDbBean;
import com.transsion.home.bean.HomePreferencesConfig;
import com.transsion.home.bean.HomePreferencesIntervalTime;
import com.transsion.home.bean.HomePreferencesSubmitRequest;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p682pj.InterfaceC26888a;
import pg.C26866a;
import sl.InterfaceC27628b;

/* JADX INFO: loaded from: classes5.dex */
public final class HomePreferencesRepository {

    /* JADX INFO: renamed from: c */
    public static final C15430a f53364c = new C15430a(null);

    /* JADX INFO: renamed from: d */
    public static final int f53365d = 8;

    /* JADX INFO: renamed from: a */
    private final InterfaceC27628b f53366a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC26888a f53367b;

    /* JADX INFO: renamed from: com.transsion.home.repository.HomePreferencesRepository$a */
    public static final class C15430a {
        private C15430a() {
        }

        public /* synthetic */ C15430a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HomePreferencesRepository(InterfaceC27628b api, AppDatabase appDatabase) {
        Intrinsics.m97802h(api, "api");
        Intrinsics.m97802h(appDatabase, "appDatabase");
        this.f53366a = api;
        this.f53367b = appDatabase.mo64870q1();
    }

    /* JADX INFO: renamed from: e */
    private final boolean m68510e(long j11, HomePreferencesIntervalTimeDbBean homePreferencesIntervalTimeDbBean, HomePreferencesIntervalTime homePreferencesIntervalTime) {
        long j12;
        long jMax;
        if (homePreferencesIntervalTimeDbBean == null) {
            return true;
        }
        long showInterval = homePreferencesIntervalTime.getShowInterval();
        long closeInterval = homePreferencesIntervalTime.getCloseInterval();
        long chooseInterval = homePreferencesIntervalTime.getChooseInterval();
        if (homePreferencesIntervalTimeDbBean.getShowTime() <= 0 || showInterval <= 0) {
            j12 = 0;
            jMax = 0;
        } else {
            long showTime = homePreferencesIntervalTimeDbBean.getShowTime() + (showInterval * ((long) 1000));
            j12 = 0;
            jMax = Math.max(0L, showTime);
        }
        if (homePreferencesIntervalTimeDbBean.getCloseTime() > j12 && closeInterval > j12) {
            jMax = Math.max(jMax, homePreferencesIntervalTimeDbBean.getCloseTime() + (closeInterval * ((long) 1000)));
        }
        if (homePreferencesIntervalTimeDbBean.getChooseTime() > 0 && chooseInterval > 0) {
            jMax = Math.max(jMax, homePreferencesIntervalTimeDbBean.getChooseTime() + (chooseInterval * ((long) 1000)));
        }
        C26866a.a aVar = C26866a.f81698a;
        boolean z11 = j11 >= jMax;
        C26866a.a.m104901l(aVar, "HomePreferencesRepository", "----canShow:>>>> " + z11 + " <<<<<, id:" + homePreferencesIntervalTimeDbBean.getId() + ",now:" + j11 + ", showTime:" + homePreferencesIntervalTimeDbBean.getShowTime() + ", closeTime:" + homePreferencesIntervalTimeDbBean.getCloseTime() + ", chooseTime:" + homePreferencesIntervalTimeDbBean.getChooseTime(), false, 4, null);
        return j11 >= jMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Unit m68511h(HomePreferencesIntervalTimeDbBean bean, long j11) {
        Intrinsics.m97802h(bean, "bean");
        bean.setChooseTime(j11);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Unit m68512j(HomePreferencesIntervalTimeDbBean bean, long j11) {
        Intrinsics.m97802h(bean, "bean");
        bean.setCloseTime(j11);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Unit m68513l(HomePreferencesIntervalTimeDbBean bean, long j11) {
        Intrinsics.m97802h(bean, "bean");
        bean.setShowTime(j11);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: n */
    public final Object m68514n(HomePreferencesConfig homePreferencesConfig, Function2 function2, Continuation continuation) throws Throwable {
        HomePreferencesRepository$updateIntervalRecord$1 homePreferencesRepository$updateIntervalRecord$1;
        HomePreferencesConfig homePreferencesConfig2;
        String str;
        long j11;
        Function2 function3;
        if (continuation instanceof HomePreferencesRepository$updateIntervalRecord$1) {
            homePreferencesRepository$updateIntervalRecord$1 = (HomePreferencesRepository$updateIntervalRecord$1) continuation;
            int i11 = homePreferencesRepository$updateIntervalRecord$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homePreferencesRepository$updateIntervalRecord$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homePreferencesRepository$updateIntervalRecord$1 = new HomePreferencesRepository$updateIntervalRecord$1(this, continuation);
            }
        } else {
            homePreferencesRepository$updateIntervalRecord$1 = new HomePreferencesRepository$updateIntervalRecord$1(this, continuation);
        }
        Object objMo104968b = homePreferencesRepository$updateIntervalRecord$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = homePreferencesRepository$updateIntervalRecord$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                j11 = homePreferencesRepository$updateIntervalRecord$1.J$0;
                String str2 = (String) homePreferencesRepository$updateIntervalRecord$1.L$2;
                function3 = (Function2) homePreferencesRepository$updateIntervalRecord$1.L$1;
                homePreferencesConfig2 = (HomePreferencesConfig) homePreferencesRepository$updateIntervalRecord$1.L$0;
                ResultKt.m97107b(objMo104968b);
                str = str2;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(objMo104968b);
            }
            return Unit.f75682a;
        }
        ResultKt.m97107b(objMo104968b);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String labelId = homePreferencesConfig.getLabelId();
        InterfaceC26888a interfaceC26888a = this.f53367b;
        homePreferencesConfig2 = homePreferencesConfig;
        homePreferencesRepository$updateIntervalRecord$1.L$0 = homePreferencesConfig2;
        homePreferencesRepository$updateIntervalRecord$1.L$1 = function2;
        homePreferencesRepository$updateIntervalRecord$1.L$2 = labelId;
        homePreferencesRepository$updateIntervalRecord$1.J$0 = jCurrentTimeMillis;
        homePreferencesRepository$updateIntervalRecord$1.label = 1;
        objMo104968b = interfaceC26888a.mo104968b(labelId, homePreferencesRepository$updateIntervalRecord$1);
        if (objMo104968b == objF) {
            return objF;
        }
        str = labelId;
        j11 = jCurrentTimeMillis;
        function3 = function2;
        HomePreferencesIntervalTimeDbBean homePreferencesIntervalTimeDbBean = (HomePreferencesIntervalTimeDbBean) objMo104968b;
        if (homePreferencesIntervalTimeDbBean == null) {
            homePreferencesIntervalTimeDbBean = new HomePreferencesIntervalTimeDbBean(str, 0L, 0L, 0L, homePreferencesConfig2.getIntervalTime().getShowInterval(), homePreferencesConfig2.getIntervalTime().getCloseInterval(), homePreferencesConfig2.getIntervalTime().getChooseInterval());
        }
        HomePreferencesIntervalTimeDbBean homePreferencesIntervalTimeDbBean2 = homePreferencesIntervalTimeDbBean;
        HomePreferencesIntervalTimeDbBean homePreferencesIntervalTimeDbBeanCopy = homePreferencesIntervalTimeDbBean2.copy((15 & 1) != 0 ? homePreferencesIntervalTimeDbBean2.id : null, (15 & 2) != 0 ? homePreferencesIntervalTimeDbBean2.showTime : 0L, (15 & 4) != 0 ? homePreferencesIntervalTimeDbBean2.closeTime : 0L, (15 & 8) != 0 ? homePreferencesIntervalTimeDbBean2.chooseTime : 0L, (15 & 16) != 0 ? homePreferencesIntervalTimeDbBean2.showIntervalSeconds : homePreferencesConfig2.getIntervalTime().getShowInterval(), (15 & 32) != 0 ? homePreferencesIntervalTimeDbBean2.closeIntervalSeconds : homePreferencesConfig2.getIntervalTime().getCloseInterval(), (15 & 64) != 0 ? homePreferencesIntervalTimeDbBean2.chooseIntervalSeconds : homePreferencesConfig2.getIntervalTime().getChooseInterval());
        function3.invoke(homePreferencesIntervalTimeDbBeanCopy, Boxing.m97635e(j11));
        InterfaceC26888a interfaceC26888a2 = this.f53367b;
        homePreferencesRepository$updateIntervalRecord$1.L$0 = null;
        homePreferencesRepository$updateIntervalRecord$1.L$1 = null;
        homePreferencesRepository$updateIntervalRecord$1.L$2 = null;
        homePreferencesRepository$updateIntervalRecord$1.label = 2;
        if (interfaceC26888a2.mo104967a(homePreferencesIntervalTimeDbBeanCopy, homePreferencesRepository$updateIntervalRecord$1) == objF) {
            return objF;
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0101  */
    /* JADX WARN: Code duplicated, block: B:50:0x0122 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0123  */
    /* JADX WARN: Code duplicated, block: B:54:0x0130 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:13:0x0041, B:52:0x0124, B:54:0x0130, B:55:0x0159, B:48:0x0108), top: B:81:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0170  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0123 -> B:52:0x0124). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: f */
    public final java.lang.Object m68515f(java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.home.repository.HomePreferencesRepository.m68515f(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: g */
    public final Object m68516g(HomePreferencesConfig homePreferencesConfig, Continuation continuation) throws Throwable {
        Object objM68514n = m68514n(homePreferencesConfig, new Function2() { // from class: com.transsion.home.repository.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HomePreferencesRepository.m68511h((HomePreferencesIntervalTimeDbBean) obj, ((Long) obj2).longValue());
            }
        }, continuation);
        return objM68514n == IntrinsicsKt.m97630f() ? objM68514n : Unit.f75682a;
    }

    /* JADX INFO: renamed from: i */
    public final Object m68517i(HomePreferencesConfig homePreferencesConfig, Continuation continuation) throws Throwable {
        Object objM68514n = m68514n(homePreferencesConfig, new Function2() { // from class: com.transsion.home.repository.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HomePreferencesRepository.m68512j((HomePreferencesIntervalTimeDbBean) obj, ((Long) obj2).longValue());
            }
        }, continuation);
        return objM68514n == IntrinsicsKt.m97630f() ? objM68514n : Unit.f75682a;
    }

    /* JADX INFO: renamed from: k */
    public final Object m68518k(HomePreferencesConfig homePreferencesConfig, Continuation continuation) throws Throwable {
        Object objM68514n = m68514n(homePreferencesConfig, new Function2() { // from class: com.transsion.home.repository.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HomePreferencesRepository.m68513l((HomePreferencesIntervalTimeDbBean) obj, ((Long) obj2).longValue());
            }
        }, continuation);
        return objM68514n == IntrinsicsKt.m97630f() ? objM68514n : Unit.f75682a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: m */
    public final Object m68519m(String str, List list, Continuation continuation) throws Throwable {
        HomePreferencesRepository$submitPreferences$1 homePreferencesRepository$submitPreferences$1;
        Object objM112707constructorimpl;
        if (continuation instanceof HomePreferencesRepository$submitPreferences$1) {
            homePreferencesRepository$submitPreferences$1 = (HomePreferencesRepository$submitPreferences$1) continuation;
            int i11 = homePreferencesRepository$submitPreferences$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homePreferencesRepository$submitPreferences$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homePreferencesRepository$submitPreferences$1 = new HomePreferencesRepository$submitPreferences$1(this, continuation);
            }
        } else {
            homePreferencesRepository$submitPreferences$1 = new HomePreferencesRepository$submitPreferences$1(this, continuation);
        }
        HomePreferencesRepository$submitPreferences$1 homePreferencesRepository$submitPreferences$2 = homePreferencesRepository$submitPreferences$1;
        Object objM107475c = homePreferencesRepository$submitPreferences$2.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = homePreferencesRepository$submitPreferences$2.label;
        try {
            if (i12 == 0) {
                ResultKt.m97107b(objM107475c);
                if (list.isEmpty()) {
                    C26866a.a.m104898f(C26866a.f81698a, "HomePreferencesRepository", "submitPreferences skip: empty options, labelId=" + str, false, 4, null);
                    return Unit.f75682a;
                }
                HomePreferencesSubmitRequest homePreferencesSubmitRequest = new HomePreferencesSubmitRequest(str, list);
                Result.Companion companion = Result.INSTANCE;
                InterfaceC27628b interfaceC27628b = this.f53366a;
                homePreferencesRepository$submitPreferences$2.L$0 = str;
                homePreferencesRepository$submitPreferences$2.L$1 = list;
                homePreferencesRepository$submitPreferences$2.label = 1;
                objM107475c = InterfaceC27628b.a.m107475c(interfaceC27628b, null, homePreferencesSubmitRequest, homePreferencesRepository$submitPreferences$2, 1, null);
                if (objM107475c == objF) {
                    return objF;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) homePreferencesRepository$submitPreferences$2.L$1;
                str = (String) homePreferencesRepository$submitPreferences$2.L$0;
                ResultKt.m97107b(objM107475c);
            }
            objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) objM107475c);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
            C26866a.a.m104905r(C26866a.f81698a, "HomePreferencesRepository", new String[]{"submitPreferences success, labelId=" + str + ", options=" + list}, false, 4, null);
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104901l(C26866a.f81698a, "HomePreferencesRepository", "submitPreferences error, labelId=" + str + ", msg=" + thM112710exceptionOrNullimpl.getMessage(), false, 4, null);
        }
        return Unit.f75682a;
    }
}
