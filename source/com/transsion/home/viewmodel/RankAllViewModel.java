package com.transsion.home.viewmodel;

import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.transsion.home.bean.RankAllData;
import com.transsion.moviedetailapi.bean.Subject;
import java.util.List;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import sl.InterfaceC27630d;

/* JADX INFO: loaded from: classes5.dex */
public final class RankAllViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: a */
    private final C3187b0 f53657a = new C3187b0();

    /* JADX INFO: renamed from: b */
    private final C3187b0 f53658b = new C3187b0();

    /* JADX INFO: renamed from: c */
    private int f53659c = 1;

    /* JADX INFO: renamed from: d */
    private final InterfaceC27630d f53660d = (InterfaceC27630d) C22982c.f70163e.m91553a().m91552h(InterfaceC27630d.class);

    /* JADX INFO: renamed from: e */
    private String f53661e;

    /* JADX INFO: renamed from: f */
    private int f53662f;

    /* JADX INFO: renamed from: g */
    private String f53663g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final void m68978m(RankAllData rankAllData) {
        List<Subject> subjects;
        String ops = rankAllData != null ? rankAllData.getOps() : null;
        if (ops == null || ops.length() == 0 || rankAllData == null || (subjects = rankAllData.getSubjects()) == null) {
            return;
        }
        for (Subject subject : subjects) {
            String ops2 = subject.getOps();
            if (ops2 == null || ops2.length() == 0) {
                subject.setOps(ops);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private final void m68979n(boolean z11) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new RankAllViewModel$startRequest$1(z11, this, null), 2, null);
    }

    /* JADX INFO: renamed from: i */
    public final C3187b0 m68980i() {
        return this.f53658b;
    }

    /* JADX INFO: renamed from: j */
    public final C3187b0 m68981j() {
        return this.f53657a;
    }

    /* JADX INFO: renamed from: k */
    public final void m68982k(String str, int i11, String str2) {
        this.f53661e = str;
        this.f53662f = i11;
        this.f53663g = str2;
        this.f53659c = 1;
        m68979n(false);
    }

    /* JADX INFO: renamed from: l */
    public final void m68983l() {
        m68979n(true);
    }
}
