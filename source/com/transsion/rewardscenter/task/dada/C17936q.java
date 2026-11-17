package com.transsion.rewardscenter.task.dada;

import com.tencent.mmkv.MMKV;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.rewardscenter.task.dada.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C17936q {

    /* JADX INFO: renamed from: a */
    public static final C17936q f58876a = new C17936q();

    /* JADX INFO: renamed from: b */
    private static final Lazy f58877b = LazyKt.m97097b(new Function0() { // from class: com.transsion.rewardscenter.task.dada.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C17936q.m76437d();
        }
    });

    /* JADX INFO: renamed from: c */
    public static final int f58878c = 8;

    private C17936q() {
    }

    /* JADX INFO: renamed from: b */
    private final MMKV m76436b() {
        return (MMKV) f58877b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final MMKV m76437d() {
        return MMKV.m61551I("DadaCache");
    }

    /* JADX INFO: renamed from: c */
    public final DadaTaskState m76438c(List list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int i11 = m76436b().getInt("task_state_" + str, -1);
            if (i11 != -1) {
                return DadaTaskState.getEntries().get(i11);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m76439e(String str, DadaTaskState taskState) {
        Intrinsics.m97802h(taskState, "taskState");
        if (str == null) {
            return;
        }
        m76436b().putInt("task_state_" + str, taskState.ordinal());
    }
}
