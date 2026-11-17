package com.transsion.mbwidget.data;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.blankj.utilcode.util.AbstractC5796o;
import com.blankj.utilcode.util.Utils;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.video.VideoDetailPlayBean;
import com.transsion.baselib.p291db.video.VideoDetailPlayDao;
import com.transsion.mbwidget.C15716d;
import com.transsion.mbwidget.HotSubjectWidgetProvider;
import com.transsion.mbwidget.PlayWidgetProvider;
import com.transsion.mbwidget.R$string;
import com.transsion.mbwidget.utils.BitmapUtils;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Subject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import org.mvel2.ast.ASTNode;
import p349dh.C22982c;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
public final class WidgetDataManager {

    /* JADX INFO: renamed from: b */
    private static volatile long f54098b;

    /* JADX INFO: renamed from: f */
    private static VideoDetailPlayBean f54102f;

    /* JADX INFO: renamed from: i */
    private static String f54105i;

    /* JADX INFO: renamed from: a */
    public static final WidgetDataManager f54097a = new WidgetDataManager();

    /* JADX INFO: renamed from: c */
    private static long f54099c = 3540000;

    /* JADX INFO: renamed from: d */
    private static final Lazy f54100d = LazyKt.m97097b(new Function0() { // from class: com.transsion.mbwidget.data.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetDataManager.m69679x();
        }
    });

    /* JADX INFO: renamed from: e */
    private static final Lazy f54101e = LazyKt.m97097b(new Function0() { // from class: com.transsion.mbwidget.data.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetDataManager.m69665C();
        }
    });

    /* JADX INFO: renamed from: g */
    private static final CopyOnWriteArrayList f54103g = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h */
    private static final CopyOnWriteArrayList f54104h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j */
    private static volatile CopyOnWriteArrayList f54106j = new CopyOnWriteArrayList();

    private WidgetDataManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: A */
    public final Object m69663A(Continuation continuation) throws Throwable {
        WidgetDataManager$requestData$1 widgetDataManager$requestData$1;
        Object objM112707constructorimpl;
        WidgetDataManager widgetDataManager;
        DeskWidgetResp deskWidgetResp;
        Integer height;
        Integer width;
        Integer height2;
        Integer width2;
        if (continuation instanceof WidgetDataManager$requestData$1) {
            widgetDataManager$requestData$1 = (WidgetDataManager$requestData$1) continuation;
            int i11 = widgetDataManager$requestData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                widgetDataManager$requestData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                widgetDataManager$requestData$1 = new WidgetDataManager$requestData$1(this, continuation);
            }
        } else {
            widgetDataManager$requestData$1 = new WidgetDataManager$requestData$1(this, continuation);
        }
        WidgetDataManager$requestData$1 widgetDataManager$requestData$2 = widgetDataManager$requestData$1;
        Object objM69696b = widgetDataManager$requestData$2.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = widgetDataManager$requestData$2.label;
        try {
            if (i12 == 0) {
                ResultKt.m97107b(objM69696b);
                Result.Companion companion = Result.INSTANCE;
                int i13 = f54103g.size() < 2 ? 8 : 0;
                int i14 = f54104h.size() < 3 ? 16 : 0;
                InterfaceC15724a interfaceC15724aM69674l = m69674l();
                WidgetRequestBody widgetRequestBody = new WidgetRequestBody(i13, i14);
                widgetDataManager$requestData$2.L$0 = this;
                widgetDataManager$requestData$2.label = 1;
                objM69696b = InterfaceC15724a.a.m69696b(interfaceC15724aM69674l, widgetRequestBody, null, widgetDataManager$requestData$2, 2, null);
                if (objM69696b == objF) {
                    return objF;
                }
                widgetDataManager = this;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                widgetDataManager = (WidgetDataManager) widgetDataManager$requestData$2.L$0;
                ResultKt.m97107b(objM69696b);
            }
            BaseDto baseDto = (BaseDto) objM69696b;
            if (Intrinsics.m97797c(baseDto.getCode(), "0") && (deskWidgetResp = (DeskWidgetResp) baseDto.getData()) != null) {
                CopyOnWriteArrayList copyOnWriteArrayList = f54103g;
                List<Subject> hotList = deskWidgetResp.getHotList();
                ArrayList arrayList = new ArrayList();
                for (Object obj : hotList) {
                    Subject subject = (Subject) obj;
                    Cover cover = subject.getCover();
                    int iIntValue = (cover == null || (width2 = cover.getWidth()) == null) ? 0 : width2.intValue();
                    Cover cover2 = subject.getCover();
                    if (iIntValue <= ((cover2 == null || (height2 = cover2.getHeight()) == null) ? 0 : height2.intValue())) {
                        arrayList.add(obj);
                    }
                }
                copyOnWriteArrayList.addAll(arrayList);
                CopyOnWriteArrayList copyOnWriteArrayList2 = f54104h;
                List<Subject> interestList = deskWidgetResp.getInterestList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : interestList) {
                    Subject subject2 = (Subject) obj2;
                    Cover cover3 = subject2.getCover();
                    int iIntValue2 = (cover3 == null || (width = cover3.getWidth()) == null) ? 0 : width.intValue();
                    Cover cover4 = subject2.getCover();
                    if (iIntValue2 <= ((cover4 == null || (height = cover4.getHeight()) == null) ? 0 : height.intValue())) {
                        arrayList2.add(obj2);
                    }
                }
                copyOnWriteArrayList2.addAll(arrayList2);
                String searchBarText = deskWidgetResp.getSearchBarText();
                if (searchBarText != null && searchBarText.length() != 0) {
                    f54105i = deskWidgetResp.getSearchBarText();
                }
                C26866a.f81698a.m104912c("DeskWidget_", "RequestList: hot:" + deskWidgetResp.getHotList().size() + ", in:" + deskWidgetResp.getInterestList().size(), true);
                widgetDataManager.m69664B(deskWidgetResp);
            }
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.f81698a.m104912c("DeskWidget_", "requestData -onFailure: " + thM112710exceptionOrNullimpl, true);
        }
        m69671f();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: B */
    private final void m69664B(DeskWidgetResp deskWidgetResp) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new WidgetDataManager$saveToCache$1(deskWidgetResp, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final VideoDetailPlayDao m69665C() {
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return companion.m64881b(applicationM27275a).mo64865B1();
    }

    /* JADX INFO: renamed from: f */
    private final void m69671f() {
        DeskWidgetResp deskWidgetRespM69673i;
        CopyOnWriteArrayList copyOnWriteArrayList = f54104h;
        if ((copyOnWriteArrayList.isEmpty() || f54103g.isEmpty()) && (deskWidgetRespM69673i = m69673i()) != null) {
            if (copyOnWriteArrayList.isEmpty() && !deskWidgetRespM69673i.getInterestList().isEmpty()) {
                copyOnWriteArrayList.addAll(deskWidgetRespM69673i.getInterestList());
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = f54103g;
            if (!copyOnWriteArrayList2.isEmpty() || deskWidgetRespM69673i.getHotList().isEmpty()) {
                return;
            }
            copyOnWriteArrayList2.addAll(deskWidgetRespM69673i.getHotList());
        }
    }

    /* JADX INFO: renamed from: g */
    private final Object m69672g(List list, Continuation continuation) {
        Object objM69663A;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C15725b c15725b = (C15725b) it.next();
            f54103g.remove(c15725b.m69698b());
            f54104h.remove(c15725b.m69698b());
        }
        return ((f54103g.isEmpty() || f54104h.isEmpty()) && (objM69663A = m69663A(continuation)) == IntrinsicsKt.m97630f()) ? objM69663A : Unit.f75682a;
    }

    /* JADX INFO: renamed from: i */
    private final DeskWidgetResp m69673i() {
        String string = C15716d.f54081a.m69635k().getString("hot_widget_cache_key", null);
        C26866a.f81698a.m104912c("DeskWidget_", "widget load cache:" + (string == null), true);
        try {
            Result.Companion companion = Result.INSTANCE;
            return (DeskWidgetResp) AbstractC5796o.m27441d(string, DeskWidgetResp.class);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC15724a m69674l() {
        return (InterfaceC15724a) f54100d.getValue();
    }

    /* JADX INFO: renamed from: n */
    private final PendingIntent m69675n(Context context, boolean z11, String str, Integer num, String str2, String str3, String str4) {
        Intent intent = new Intent(context, (Class<?>) (z11 ? HotSubjectWidgetProvider.class : PlayWidgetProvider.class));
        int i11 = Build.VERSION.SDK_INT >= 31 ? 201326592 : ASTNode.NOJIT;
        intent.putExtra("appWidgetId", num);
        intent.putExtra("key_deeplink_widget", str);
        intent.putExtra("key_subject_id_widget", str2);
        intent.putExtra("key_module_name", str3);
        if (str4 == null) {
            str4 = z11 ? "com.transsion.mbwidget.hot.ACTION_CLICK" : "com.transsion.mbwidget.play.ACTION_CLICK";
        }
        intent.setAction(str4);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, (int) System.currentTimeMillis(), intent, i11);
        Intrinsics.m97801g(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    /* JADX INFO: renamed from: o */
    static /* synthetic */ PendingIntent m69676o(WidgetDataManager widgetDataManager, Context context, boolean z11, String str, Integer num, String str2, String str3, String str4, int i11, Object obj) {
        return widgetDataManager.m69675n(context, z11, str, num, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4);
    }

    /* JADX INFO: renamed from: r */
    private final Subject m69677r(int i11, HashSet hashSet) {
        List listM69715m = C15733j.f54111a.m69715m();
        Collections.shuffle(listM69715m);
        if (i11 == 0) {
            return m69680z(f54104h, listM69715m, hashSet);
        }
        if (i11 == 1) {
            return m69680z(f54103g, listM69715m, hashSet);
        }
        if (i11 != 2) {
            return null;
        }
        return m69680z(f54104h, listM69715m, hashSet);
    }

    /* JADX INFO: renamed from: w */
    private final VideoDetailPlayDao m69678w() {
        return (VideoDetailPlayDao) f54101e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final InterfaceC15724a m69679x() {
        return (InterfaceC15724a) C22982c.f70163e.m91553a().m91552h(InterfaceC15724a.class);
    }

    /* JADX INFO: renamed from: z */
    private final Subject m69680z(List list, List list2, Set set) {
        Object obj;
        Object next;
        Iterator it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!set.add(((Subject) next).getSubjectId()));
        Subject subject = (Subject) next;
        if (subject != null) {
            return subject;
        }
        for (Object obj2 : list2) {
            if (set.add(((Subject) obj2).getSubjectId())) {
                obj = obj2;
                break;
            }
        }
        return (Subject) obj;
    }

    /* JADX INFO: renamed from: h */
    public final Subject m69681h(String str) {
        Object next;
        if (str == null) {
            return null;
        }
        Iterator it = f54106j.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.m97797c(((C15725b) next).m69698b().getSubjectId(), str));
        C15725b c15725b = (C15725b) next;
        if (c15725b != null) {
            return c15725b.m69698b();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final VideoDetailPlayBean m69682j() {
        String url;
        Subject subject = (Subject) CollectionsKt.m97372v0(f54103g);
        if (subject == null) {
            subject = (Subject) CollectionsKt.m97371u0(C15733j.f54111a.m69715m());
        }
        String subjectId = subject.getSubjectId();
        String str = subjectId == null ? "" : subjectId;
        String subjectId2 = subject.getSubjectId();
        String str2 = subjectId2 == null ? "" : subjectId2;
        String title = subject.getTitle();
        Cover cover = subject.getCover();
        if (cover == null || (url = cover.getUrl()) == null) {
            url = "";
        }
        return new VideoDetailPlayBean(str, str2, 0, 0, 0L, title, url, null, null, 0L, null, null, null, null, null, false, null, null, null, 0L, null, null, null, false, false, false, null, 134217628, null);
    }

    /* JADX INFO: renamed from: k */
    public final Object m69683k(String str, int i11, Continuation continuation) {
        Integer numM69716n = C15733j.f54111a.m69716n(str);
        if (numM69716n != null) {
            return BitmapUtils.f54124a.m69739b(numM69716n.intValue());
        }
        BitmapUtils bitmapUtils = BitmapUtils.f54124a;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        return bitmapUtils.m69741d(applicationM27275a, str, i11, continuation);
    }

    /* JADX INFO: renamed from: m */
    public final PendingIntent m69684m(Context context, boolean z11, Integer num) {
        Intrinsics.m97802h(context, "context");
        return m69676o(this, context, z11, "oneroom://com.community.oneroom?type=/main/tab&bottomTab=home&channel=desk_widget", num, null, "root", null, 80, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m69685p(Continuation continuation) throws Throwable {
        WidgetDataManager$getPlayHistory$1 widgetDataManager$getPlayHistory$1;
        if (continuation instanceof WidgetDataManager$getPlayHistory$1) {
            widgetDataManager$getPlayHistory$1 = (WidgetDataManager$getPlayHistory$1) continuation;
            int i11 = widgetDataManager$getPlayHistory$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                widgetDataManager$getPlayHistory$1.label = i11 - Integer.MIN_VALUE;
            } else {
                widgetDataManager$getPlayHistory$1 = new WidgetDataManager$getPlayHistory$1(this, continuation);
            }
        } else {
            widgetDataManager$getPlayHistory$1 = new WidgetDataManager$getPlayHistory$1(this, continuation);
        }
        Object objMo64995d = widgetDataManager$getPlayHistory$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = widgetDataManager$getPlayHistory$1.label;
        if (i12 == 0) {
            ResultKt.m97107b(objMo64995d);
            if (f54102f != null && !m69691y()) {
                return f54102f;
            }
            VideoDetailPlayDao videoDetailPlayDaoM69678w = m69678w();
            widgetDataManager$getPlayHistory$1.label = 1;
            objMo64995d = videoDetailPlayDaoM69678w.mo64995d(0, 50, widgetDataManager$getPlayHistory$1);
            if (objMo64995d == objF) {
                return objF;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(objMo64995d);
        }
        List list = (List) objMo64995d;
        VideoDetailPlayBean videoDetailPlayBean = null;
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                VideoDetailPlayBean videoDetailPlayBean2 = (VideoDetailPlayBean) obj2;
                Long totalDuration = videoDetailPlayBean2.getTotalDuration();
                long progress = (videoDetailPlayBean2.getProgress() * ((long) 100)) / (totalDuration != null ? RangesKt.m97936f(totalDuration.longValue(), 1L) : 1L);
                if (TextUtils.isDigitsOnly(videoDetailPlayBean2.getId()) && progress <= 80) {
                    obj = obj2;
                    break;
                }
            }
            videoDetailPlayBean = (VideoDetailPlayBean) obj;
        }
        f54102f = videoDetailPlayBean;
        C26866a.f81698a.m104915i("DeskWidget_", "getPlayHistory curHistory: " + f54102f, true);
        return f54102f;
    }

    /* JADX INFO: renamed from: q */
    public final PendingIntent m69686q(Context context, boolean z11, Integer num) {
        Intrinsics.m97802h(context, "context");
        return m69676o(this, context, z11, "oneroom://com.community.oneroom?type=/main/tab&bottomTab=home&channel=desk_widget", num, "refresh_all", ToolBar.REFRESH, null, 64, null);
    }

    /* JADX INFO: renamed from: s */
    public final PendingIntent m69687s(Context context, boolean z11, Integer num) {
        Intrinsics.m97802h(context, "context");
        return m69676o(this, context, z11, "oneroom://com.community.oneroom?type=/search/activity/search_manager&type=3&channel=desk_widget", num, null, "search", null, 80, null);
    }

    /* JADX INFO: renamed from: t */
    public final String m69688t() {
        String str = f54105i;
        if (str != null) {
            return str;
        }
        String string = Utils.m27275a().getString(R$string.widget_search_tips);
        Intrinsics.m97801g(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0142 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0157  */
    /* JADX WARN: Code duplicated, block: B:52:0x0170  */
    /* JADX WARN: Code duplicated, block: B:55:0x0189  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m69689u(String str, String str2, Continuation continuation) throws Throwable {
        WidgetDataManager$getShowList$1 widgetDataManager$getShowList$1;
        boolean zM69691y;
        Object next;
        C15725b c15725b;
        List list;
        HashSet hashSet;
        ArrayList arrayList;
        Subject subjectM69677r;
        Subject subjectM69677r2;
        Subject subjectM69677r3;
        if (continuation instanceof WidgetDataManager$getShowList$1) {
            widgetDataManager$getShowList$1 = (WidgetDataManager$getShowList$1) continuation;
            int i11 = widgetDataManager$getShowList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                widgetDataManager$getShowList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                widgetDataManager$getShowList$1 = new WidgetDataManager$getShowList$1(this, continuation);
            }
        } else {
            widgetDataManager$getShowList$1 = new WidgetDataManager$getShowList$1(this, continuation);
        }
        Object obj = widgetDataManager$getShowList$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = widgetDataManager$getShowList$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                C15725b c15725b2 = (C15725b) widgetDataManager$getShowList$1.L$2;
                str2 = (String) widgetDataManager$getShowList$1.L$1;
                String str3 = (String) widgetDataManager$getShowList$1.L$0;
                ResultKt.m97107b(obj);
                c15725b = c15725b2;
                str = str3;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) widgetDataManager$getShowList$1.L$0;
                ResultKt.m97107b(obj);
            }
            hashSet = new HashSet();
            hashSet.add(str);
            arrayList = new ArrayList();
            subjectM69677r = m69677r(0, hashSet);
            if (subjectM69677r != null) {
                arrayList.add(new C15725b(0, subjectM69677r));
                Boxing.m97631a(hashSet.add(subjectM69677r.getSubjectId()));
            }
            subjectM69677r2 = m69677r(1, hashSet);
            if (subjectM69677r2 != null) {
                arrayList.add(new C15725b(1, subjectM69677r2));
                Boxing.m97631a(hashSet.add(subjectM69677r2.getSubjectId()));
            }
            subjectM69677r3 = m69677r(2, hashSet);
            if (subjectM69677r3 != null) {
                arrayList.add(new C15725b(2, subjectM69677r3));
                Boxing.m97631a(hashSet.add(subjectM69677r3.getSubjectId()));
            }
            f54098b = System.currentTimeMillis();
            C26866a.f81698a.m104912c("DeskWidget_", "showList:" + hashSet, true);
            f54106j = new CopyOnWriteArrayList(arrayList);
            return arrayList;
        }
        ResultKt.m97107b(obj);
        zM69691y = m69691y();
        C26866a.f81698a.m104912c("DeskWidget_", "refreshId:" + str2 + "，historyId:" + str + ", size:" + f54103g.size() + ", in:" + f54104h.size(), true);
        if (str2 != null) {
            Iterator it = f54106j.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.m97797c(((C15725b) next).m69698b().getSubjectId(), str2));
            c15725b = (C15725b) next;
            if (c15725b != null) {
                List listE = CollectionsKt.m97499e(c15725b);
                widgetDataManager$getShowList$1.L$0 = str;
                widgetDataManager$getShowList$1.L$1 = str2;
                widgetDataManager$getShowList$1.L$2 = c15725b;
                widgetDataManager$getShowList$1.label = 1;
                if (m69672g(listE, widgetDataManager$getShowList$1) == objF) {
                    return objF;
                }
            }
            zM69691y = Intrinsics.m97797c(str2, "refresh_all");
        }
        if (f54106j.size() < 3 && !zM69691y) {
            return f54106j;
        }
        list = f54106j;
        widgetDataManager$getShowList$1.L$0 = str;
        widgetDataManager$getShowList$1.L$1 = null;
        widgetDataManager$getShowList$1.L$2 = null;
        widgetDataManager$getShowList$1.label = 2;
        if (m69672g(list, widgetDataManager$getShowList$1) == objF) {
            return objF;
        }
        hashSet = new HashSet();
        hashSet.add(str);
        arrayList = new ArrayList();
        subjectM69677r = m69677r(0, hashSet);
        if (subjectM69677r != null) {
            arrayList.add(new C15725b(0, subjectM69677r));
            Boxing.m97631a(hashSet.add(subjectM69677r.getSubjectId()));
        }
        subjectM69677r2 = m69677r(1, hashSet);
        if (subjectM69677r2 != null) {
            arrayList.add(new C15725b(1, subjectM69677r2));
            Boxing.m97631a(hashSet.add(subjectM69677r2.getSubjectId()));
        }
        subjectM69677r3 = m69677r(2, hashSet);
        if (subjectM69677r3 != null) {
            arrayList.add(new C15725b(2, subjectM69677r3));
            Boxing.m97631a(hashSet.add(subjectM69677r3.getSubjectId()));
        }
        f54098b = System.currentTimeMillis();
        C26866a.f81698a.m104912c("DeskWidget_", "showList:" + hashSet, true);
        f54106j = new CopyOnWriteArrayList(arrayList);
        return arrayList;
        HashSet hashSet2 = new HashSet();
        hashSet2.add(str);
        Iterator it2 = f54106j.iterator();
        while (it2.hasNext()) {
            hashSet2.add(((C15725b) it2.next()).m69698b().getSubjectId());
        }
        Subject subjectM69677r4 = m69677r(c15725b.m69697a(), hashSet2);
        if (subjectM69677r4 != null) {
            List listU0 = CollectionsKt.m97343U0(f54106j);
            listU0.set(c15725b.m69697a(), new C15725b(c15725b.m69697a(), subjectM69677r4));
            f54106j = new CopyOnWriteArrayList(listU0);
            return listU0;
        }
        zM69691y = Intrinsics.m97797c(str2, "refresh_all");
        if (f54106j.size() < 3) {
        }
        list = f54106j;
        widgetDataManager$getShowList$1.L$0 = str;
        widgetDataManager$getShowList$1.L$1 = null;
        widgetDataManager$getShowList$1.L$2 = null;
        widgetDataManager$getShowList$1.label = 2;
        if (m69672g(list, widgetDataManager$getShowList$1) == objF) {
            return objF;
        }
        hashSet = new HashSet();
        hashSet.add(str);
        arrayList = new ArrayList();
        subjectM69677r = m69677r(0, hashSet);
        if (subjectM69677r != null) {
            arrayList.add(new C15725b(0, subjectM69677r));
            Boxing.m97631a(hashSet.add(subjectM69677r.getSubjectId()));
        }
        subjectM69677r2 = m69677r(1, hashSet);
        if (subjectM69677r2 != null) {
            arrayList.add(new C15725b(1, subjectM69677r2));
            Boxing.m97631a(hashSet.add(subjectM69677r2.getSubjectId()));
        }
        subjectM69677r3 = m69677r(2, hashSet);
        if (subjectM69677r3 != null) {
            arrayList.add(new C15725b(2, subjectM69677r3));
            Boxing.m97631a(hashSet.add(subjectM69677r3.getSubjectId()));
        }
        f54098b = System.currentTimeMillis();
        C26866a.f81698a.m104912c("DeskWidget_", "showList:" + hashSet, true);
        f54106j = new CopyOnWriteArrayList(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public final PendingIntent m69690v(Context context, boolean z11, Integer num, String str) {
        Intrinsics.m97802h(context, "context");
        return m69676o(this, context, z11, "oneroom://com.community.oneroom?type=/movie/detail&channel=desk_widget&id=" + str + "&ops=%7B%22trace_id%22%3A%226516b509cfdb36d11f9026a5b2981871%22%7D", num, str, "subject", null, 64, null);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m69691y() {
        return System.currentTimeMillis() - f54098b > f54099c;
    }
}
