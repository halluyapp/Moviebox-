package com.transsion.player.longvideo.member;

import com.transsion.p299mb.config.manager.ConfigBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import p553ko.C24716b;
import p553ko.C24717c;
import p683po.C26905b;
import p913xm.C28615f;

/* JADX INFO: renamed from: com.transsion.player.longvideo.member.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C16503r {

    /* JADX INFO: renamed from: a */
    public static final C16503r f55634a = new C16503r();

    private C16503r() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Integer m71923c(C16503r c16503r, List list, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = c16503r.m71933i();
        }
        return c16503r.m71929b(list, i11);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Integer m71924e(C16503r c16503r, C26905b[] c26905bArr, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = c16503r.m71933i();
        }
        return c16503r.m71930d(c26905bArr, i11);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C24717c m71925g(C16503r c16503r, List list, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = c16503r.m71933i();
        }
        return c16503r.m71931f(list, i11);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m71926l(C16503r c16503r, List list, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = c16503r.m71933i();
        }
        return c16503r.m71935k(list, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final int m71927m(C24717c it) {
        Intrinsics.m97802h(it, "it");
        return f55634a.m71939r(it.m97081e());
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m71928o(C16503r c16503r, C26905b[] c26905bArr, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = c16503r.m71933i();
        }
        return c16503r.m71936n(c26905bArr, i11);
    }

    /* JADX INFO: renamed from: b */
    public final Integer m71929b(List list, int i11) {
        Object next;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iAbs = Math.abs(f55634a.m71939r(((C24717c) next).m97081e()) - i11);
                do {
                    Object next2 = it.next();
                    int iAbs2 = Math.abs(f55634a.m71939r(((C24717c) next2).m97081e()) - i11);
                    if (iAbs > iAbs2) {
                        next = next2;
                        iAbs = iAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        C24717c c24717c = (C24717c) next;
        if (c24717c != null) {
            return Integer.valueOf(f55634a.m71939r(c24717c.m97081e()));
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final Integer m71930d(C26905b[] formats, int i11) {
        C26905b c26905b;
        Intrinsics.m97802h(formats, "formats");
        if (formats.length != 0) {
            c26905b = formats[0];
            int iY = ArraysKt.m97466Y(formats);
            if (iY != 0) {
                int iAbs = Math.abs(c26905b.m105018c() - i11);
                int i12 = 1;
                if (1 <= iY) {
                    while (true) {
                        C26905b c26905b2 = formats[i12];
                        int iAbs2 = Math.abs(c26905b2.m105018c() - i11);
                        if (iAbs > iAbs2) {
                            c26905b = c26905b2;
                            iAbs = iAbs2;
                        }
                        if (i12 == iY) {
                            break;
                        }
                        i12++;
                    }
                }
            }
        } else {
            c26905b = null;
        }
        if (c26905b != null) {
            return Integer.valueOf(c26905b.m105018c());
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final C24717c m71931f(List list, int i11) {
        Object obj;
        Intrinsics.m97802h(list, "list");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (f55634a.m71939r(((C24717c) obj2).m97081e()) < i11) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iM71939r = f55634a.m71939r(((C24717c) next).m97081e());
                do {
                    Object next2 = it.next();
                    int iM71939r2 = f55634a.m71939r(((C24717c) next2).m97081e());
                    if (iM71939r < iM71939r2) {
                        next = next2;
                        iM71939r = iM71939r2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (C24717c) obj;
    }

    /* JADX INFO: renamed from: h */
    public final C24716b m71932h(List resolutionList) {
        Object obj;
        Intrinsics.m97802h(resolutionList, "resolutionList");
        Iterator it = resolutionList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iM71939r = f55634a.m71939r(((C24716b) next).m97074d());
                do {
                    Object next2 = it.next();
                    int iM71939r2 = f55634a.m71939r(((C24716b) next2).m97074d());
                    if (iM71939r < iM71939r2) {
                        next = next2;
                        iM71939r = iM71939r2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (C24716b) obj;
    }

    /* JADX INFO: renamed from: i */
    public final int m71933i() {
        Object objM112707constructorimpl;
        String value;
        try {
            Result.Companion companion = Result.INSTANCE;
            ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("stream_resolution_ratio", true);
            if (configBeanM110360c == null || (value = configBeanM110360c.getValue()) == null) {
                value = "";
            }
            objM112707constructorimpl = Result.m112707constructorimpl(Integer.valueOf(new JSONObject(value).optInt("vipResolutionRatio")));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null) {
            objM112707constructorimpl = 1080;
        }
        return ((Number) objM112707constructorimpl).intValue();
    }

    /* JADX INFO: renamed from: j */
    public final String m71934j() {
        Object objM112707constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(m71940s(m71933i()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null) {
            objM112707constructorimpl = String.valueOf(f55634a.m71933i());
        }
        return (String) objM112707constructorimpl;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m71935k(List list, int i11) {
        Sequence sequenceZ;
        Sequence sequenceY;
        if (list == null || (sequenceZ = CollectionsKt.m97348Z(list)) == null || (sequenceY = SequencesKt.m98010y(sequenceZ, new Function1() { // from class: com.transsion.player.longvideo.member.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(C16503r.m71927m((C24717c) obj));
            }
        })) == null) {
            return false;
        }
        Iterator f76053a = sequenceY.getF76053a();
        while (f76053a.hasNext()) {
            if (((Number) f76053a.next()).intValue() >= i11) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m71936n(C26905b[] formats, int i11) {
        Intrinsics.m97802h(formats, "formats");
        for (C26905b c26905b : formats) {
            if (c26905b.m105018c() >= i11) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m71937p() {
        Object objM112707constructorimpl;
        String value;
        try {
            Result.Companion companion = Result.INSTANCE;
            ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("stream_resolution_ratio", true);
            if (configBeanM110360c == null || (value = configBeanM110360c.getValue()) == null) {
                value = "";
            }
            objM112707constructorimpl = Result.m112707constructorimpl(Boolean.valueOf(new JSONObject(value).optBoolean("isVipIntercept")));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null) {
            objM112707constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM112707constructorimpl).booleanValue();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m71938q(String resolution) {
        Intrinsics.m97802h(resolution, "resolution");
        return m71939r(resolution) >= m71933i();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX INFO: renamed from: r */
    public final int m71939r(String str) {
        Integer num;
        if (str == null || StringsKt.m98160q0(str)) {
            return 0;
        }
        String upperCase = StringsKt.m98155n1(str).toString().toUpperCase(Locale.ROOT);
        Intrinsics.m97801g(upperCase, "toUpperCase(...)");
        int iHashCode = upperCase.hashCode();
        if (iHashCode != 1625) {
            if (iHashCode != 1687) {
                if (iHashCode != 1718) {
                    if (iHashCode == 1811 && upperCase.equals("8K")) {
                        num = 4320;
                    } else {
                        num = null;
                    }
                } else if (upperCase.equals("5K")) {
                    num = 2880;
                } else {
                    num = null;
                }
            } else if (upperCase.equals("4K")) {
                num = 2160;
            } else {
                num = null;
            }
        } else if (upperCase.equals("2K")) {
            num = 1440;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        Integer numV = StringsKt.m98216v(StringsKt.m98108J0(upperCase, "P"));
        if (numV != null) {
            return numV.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: s */
    public final String m71940s(int i11) {
        if (i11 >= 4320) {
            return "8K";
        }
        if (i11 >= 2880) {
            return "5K";
        }
        if (i11 >= 2160) {
            return "4K";
        }
        if (i11 >= 1440) {
            return "2K";
        }
        if (i11 >= 1080) {
            return "1080P";
        }
        if (i11 >= 720) {
            return "720P";
        }
        if (i11 >= 576) {
            return "576P";
        }
        if (i11 >= 480) {
            return "480P";
        }
        if (i11 >= 360) {
            return "360P";
        }
        if (i11 >= 240) {
            return "240P";
        }
        return i11 + "P";
    }
}
