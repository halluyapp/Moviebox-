package com.transsion.rewardscenter.task.p308ad;

import com.tencent.mmkv.MMKV;
import com.transsion.rewardscenterapi.MemberTaskItem;
import com.transsion.rewardscenterapi.TaskType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.rewardscenter.task.ad.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C17913u {

    /* JADX INFO: renamed from: c */
    private static AbstractC17914v.c f58815c;

    /* JADX INFO: renamed from: f */
    private static MemberTaskItem f58818f;

    /* JADX INFO: renamed from: g */
    private static MemberTaskItem f58819g;

    /* JADX INFO: renamed from: h */
    private static MemberTaskItem f58820h;

    /* JADX INFO: renamed from: i */
    private static MemberTaskItem f58821i;

    /* JADX INFO: renamed from: j */
    private static MemberTaskItem f58822j;

    /* JADX INFO: renamed from: a */
    public static final C17913u f58813a = new C17913u();

    /* JADX INFO: renamed from: b */
    private static final Lazy f58814b = LazyKt.m97097b(new Function0() { // from class: com.transsion.rewardscenter.task.ad.t
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C17913u.m76334o();
        }
    });

    /* JADX INFO: renamed from: d */
    private static List f58816d = CollectionsKt.m97506l();

    /* JADX INFO: renamed from: e */
    private static List f58817e = CollectionsKt.m97506l();

    /* JADX INFO: renamed from: k */
    public static final int f58823k = 8;

    private C17913u() {
    }

    /* JADX INFO: renamed from: f */
    private final MMKV m76333f() {
        return (MMKV) f58814b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final MMKV m76334o() {
        return MMKV.m61551I("StageTaskAdCache");
    }

    /* JADX INFO: renamed from: b */
    public final void m76335b(AbstractC17914v abstractC17914v, MemberTaskItem memberTaskItem) {
        int iIntValue = 0;
        if (memberTaskItem == null) {
            return;
        }
        MemberTaskItem memberTaskItem2 = f58818f;
        Pair pairM97108a = TuplesKt.m97108a(memberTaskItem2 != null ? memberTaskItem2.getTaskId() : null, f58818f);
        MemberTaskItem memberTaskItem3 = f58819g;
        Pair pairM97108a2 = TuplesKt.m97108a(memberTaskItem3 != null ? memberTaskItem3.getTaskId() : null, f58819g);
        MemberTaskItem memberTaskItem4 = f58820h;
        Pair pairM97108a3 = TuplesKt.m97108a(memberTaskItem4 != null ? memberTaskItem4.getTaskId() : null, f58820h);
        MemberTaskItem memberTaskItem5 = f58822j;
        Pair pairM97108a4 = TuplesKt.m97108a(memberTaskItem5 != null ? memberTaskItem5.getTaskId() : null, f58822j);
        MemberTaskItem memberTaskItem6 = f58821i;
        MemberTaskItem memberTaskItem7 = (MemberTaskItem) MapsKt.m97577l(pairM97108a, pairM97108a2, pairM97108a3, pairM97108a4, TuplesKt.m97108a(memberTaskItem6 != null ? memberTaskItem6.getTaskId() : null, f58821i)).get(memberTaskItem.getTaskId());
        if (memberTaskItem7 != null) {
            memberTaskItem7.setProgress(memberTaskItem.getProgress());
            memberTaskItem7.setTotalProgress(memberTaskItem.getTotalProgress());
            memberTaskItem7.setStatus(memberTaskItem.getStatus());
        }
        Integer totalProgress = memberTaskItem.getTotalProgress();
        if (totalProgress != null) {
            int iIntValue2 = totalProgress.intValue();
            Integer progress = memberTaskItem.getProgress();
            iIntValue = iIntValue2 - (progress != null ? progress.intValue() : 0);
        }
        if (iIntValue <= 0) {
            m76347p(abstractC17914v);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m76336c(String sceneId, String packageName) {
        Intrinsics.m97802h(sceneId, "sceneId");
        Intrinsics.m97802h(packageName, "packageName");
        int iHashCode = sceneId.hashCode();
        if (iHashCode != 1154212438) {
            if (iHashCode != 1383510840) {
                if (iHashCode == 2139474598 && sceneId.equals("MemberCenterStageNativeScene")) {
                    AbstractC17914v.c cVar = f58815c;
                    List listE = CollectionsKt.m97499e(cVar != null ? cVar.m76379i() : null);
                    if (!(listE instanceof Collection) || !listE.isEmpty()) {
                        Iterator it = listE.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.m97797c((String) it.next(), packageName)) {
                                return true;
                            }
                        }
                    }
                    List list = f58817e;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((AbstractC17914v.a) obj).m76364k()) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (Intrinsics.m97797c(((AbstractC17914v.a) it2.next()).m76362i(), packageName)) {
                                return true;
                            }
                        }
                    }
                }
            } else if (sceneId.equals("MemberTaskRegularNativeScene")) {
                AbstractC17914v.c cVar2 = f58815c;
                List listE2 = CollectionsKt.m97499e(cVar2 != null ? cVar2.m76379i() : null);
                if (!(listE2 instanceof Collection) || !listE2.isEmpty()) {
                    Iterator it3 = listE2.iterator();
                    while (it3.hasNext()) {
                        if (Intrinsics.m97797c((String) it3.next(), packageName)) {
                            return true;
                        }
                    }
                }
                List list2 = f58816d;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        if (Intrinsics.m97797c(((AbstractC17914v.c) it4.next()).m76379i(), packageName)) {
                            return true;
                        }
                    }
                }
                List list3 = f58817e;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list3) {
                    if (((AbstractC17914v.a) obj2).m76364k()) {
                        arrayList2.add(obj2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        if (Intrinsics.m97797c(((AbstractC17914v.a) it5.next()).m76362i(), packageName)) {
                            return true;
                        }
                    }
                }
            }
        } else if (sceneId.equals("MemberTaskStageNativeScene")) {
            List list4 = f58816d;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator it6 = list4.iterator();
                while (it6.hasNext()) {
                    if (Intrinsics.m97797c(((AbstractC17914v.c) it6.next()).m76379i(), packageName)) {
                        return true;
                    }
                }
            }
            List list5 = f58817e;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list5) {
                if (((AbstractC17914v.a) obj3).m76364k()) {
                    arrayList3.add(obj3);
                }
            }
            if (!arrayList3.isEmpty()) {
                Iterator it7 = arrayList3.iterator();
                while (it7.hasNext()) {
                    if (Intrinsics.m97797c(((AbstractC17914v.a) it7.next()).m76362i(), packageName)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final List m76337d() {
        return f58817e;
    }

    /* JADX INFO: renamed from: e */
    public final List m76338e() {
        return f58816d;
    }

    /* JADX INFO: renamed from: g */
    public final MemberTaskItem m76339g() {
        return f58821i;
    }

    /* JADX INFO: renamed from: h */
    public final MemberTaskItem m76340h() {
        return f58820h;
    }

    /* JADX INFO: renamed from: i */
    public final MemberTaskItem m76341i() {
        return f58822j;
    }

    /* JADX INFO: renamed from: j */
    public final MemberTaskItem m76342j() {
        return f58818f;
    }

    /* JADX INFO: renamed from: k */
    public final MemberTaskItem m76343k() {
        return f58819g;
    }

    /* JADX INFO: renamed from: l */
    public final AdTaskState m76344l(String str) {
        if (str == null) {
            return null;
        }
        int i11 = m76333f().getInt("task_state_" + str, -1);
        if (i11 != -1) {
            return AdTaskState.getEntries().get(i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m76345m(String sceneId, String str) {
        boolean zM76346n;
        Intrinsics.m97802h(sceneId, "sceneId");
        boolean z11 = true;
        boolean z12 = false;
        if (str != null) {
            C17913u c17913u = f58813a;
            boolean zM76336c = c17913u.m76336c(sceneId, str);
            zM76346n = c17913u.m76346n(str);
            if (!StringsKt.m98160q0(str) && !zM76336c && !zM76346n) {
                z11 = false;
            }
            z12 = zM76336c;
        } else {
            zM76346n = false;
        }
        C26866a.a.m104898f(C26866a.f81698a, "StageTaskAd", "isFiltered = " + z11 + ", packageName: " + str + ", isDuplicate: " + z12 + ", isInCooldown: " + zM76346n, false, 4, null);
        return z11;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m76346n(String packageName) {
        Intrinsics.m97802h(packageName, "packageName");
        MMKV mmkvM76333f = m76333f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("package_cooldown_");
        sb2.append(packageName);
        return System.currentTimeMillis() < mmkvM76333f.getLong(sb2.toString(), 0L);
    }

    /* JADX INFO: renamed from: p */
    public final void m76347p(AbstractC17914v abstractC17914v) {
        ArrayList arrayList;
        AdTaskState adTaskStateM76375e;
        if (abstractC17914v instanceof AbstractC17914v.c) {
            AbstractC17914v.c cVar = f58815c;
            if (cVar != null && (adTaskStateM76375e = cVar.m76375e()) != null && adTaskStateM76375e.ordinal() < AdTaskState.CLAIMED_STAGE1.ordinal()) {
                f58815c = null;
            }
            List list = f58816d;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((AbstractC17914v.c) obj).m76375e().ordinal() >= AdTaskState.CLAIMED_STAGE1.ordinal()) {
                    arrayList2.add(obj);
                }
            }
            f58816d = arrayList2;
            return;
        }
        if (abstractC17914v instanceof AbstractC17914v.a) {
            if (((AbstractC17914v.a) abstractC17914v).m76364k()) {
                List list2 = f58817e;
                arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (!((AbstractC17914v.a) obj2).m76364k()) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                List list3 = f58817e;
                arrayList = new ArrayList();
                for (Object obj3 : list3) {
                    if (((AbstractC17914v.a) obj3).m76364k()) {
                        arrayList.add(obj3);
                    }
                }
            }
            f58817e = arrayList;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m76348q(AbstractC17914v.a item) {
        Intrinsics.m97802h(item, "item");
        List list = f58817e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.m97797c((AbstractC17914v.a) obj, item)) {
                arrayList.add(obj);
            }
        }
        f58817e = arrayList;
    }

    /* JADX INFO: renamed from: r */
    public final void m76349r(List taskInfos) {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Intrinsics.m97802h(taskInfos, "taskInfos");
        List list = taskInfos;
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer taskSubType = ((MemberTaskItem) next).getTaskSubType();
            int value = TaskType.AD_STAGE_1ST.getValue();
            if (taskSubType != null && taskSubType.intValue() == value) {
                break;
            }
        }
        f58818f = (MemberTaskItem) next;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            Integer taskSubType2 = ((MemberTaskItem) next2).getTaskSubType();
            int value2 = TaskType.AD_STAGE_2ND.getValue();
            if (taskSubType2 != null && taskSubType2.intValue() == value2) {
                break;
            }
        }
        f58819g = (MemberTaskItem) next2;
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            Integer taskSubType3 = ((MemberTaskItem) next3).getTaskSubType();
            int value3 = TaskType.AD_REGULAR_PULL_NEW.getValue();
            if (taskSubType3 != null && taskSubType3.intValue() == value3) {
                break;
            }
        }
        f58820h = (MemberTaskItem) next3;
        Iterator it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it4.next();
            Integer taskSubType4 = ((MemberTaskItem) next4).getTaskSubType();
            int value4 = TaskType.AD_REGULAR_PULL_LIVE.getValue();
            if (taskSubType4 != null && taskSubType4.intValue() == value4) {
                break;
            }
        }
        f58821i = (MemberTaskItem) next4;
        for (Object obj2 : list) {
            Integer taskSubType5 = ((MemberTaskItem) obj2).getTaskSubType();
            int value5 = TaskType.AD_REWARD.getValue();
            if (taskSubType5 != null && taskSubType5.intValue() == value5) {
                obj = obj2;
                break;
            }
        }
        f58822j = (MemberTaskItem) obj;
    }

    /* JADX INFO: renamed from: s */
    public final void m76350s(List list) {
        Intrinsics.m97802h(list, "<set-?>");
        f58817e = list;
    }

    /* JADX INFO: renamed from: t */
    public final void m76351t(List list) {
        Intrinsics.m97802h(list, "<set-?>");
        f58816d = list;
    }

    /* JADX INFO: renamed from: u */
    public final void m76352u(String packageName, Integer num) {
        Intrinsics.m97802h(packageName, "packageName");
        long j11 = 60;
        long jCurrentTimeMillis = System.currentTimeMillis() + ((num != null ? num.intValue() : 3L) * ((long) 24) * j11 * j11 * 1000);
        m76333f().putLong("package_cooldown_" + packageName, jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: v */
    public final void m76353v(String str, AdTaskState adTaskState) {
        Intrinsics.m97802h(adTaskState, "adTaskState");
        if (str == null) {
            return;
        }
        m76333f().putInt("task_state_" + str, adTaskState.ordinal());
    }
}
