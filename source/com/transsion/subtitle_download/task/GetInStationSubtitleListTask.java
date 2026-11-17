package com.transsion.subtitle_download.task;

import android.app.Application;
import android.text.TextUtils;
import com.blankj.utilcode.util.Utils;
import com.transsion.subtitle_download.SubtitleDownloadManager;
import com.transsion.subtitle_download.bean.SubtitleItem;
import com.transsion.subtitle_download.p319db.SubtitleDownloadDatabase;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.subtitle_download.utils.C19773d;
import com.transsion.subtitle_download.utils.C19774e;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import p686pu.InterfaceC26951a;
import p720qu.C27129a;
import ru.InterfaceC27376a;

/* JADX INFO: loaded from: classes6.dex */
public final class GetInStationSubtitleListTask {

    /* JADX INFO: renamed from: a */
    public static final GetInStationSubtitleListTask f63057a = new GetInStationSubtitleListTask();

    /* JADX INFO: renamed from: b */
    private static final Lazy f63058b = LazyKt.m97097b(new Function0() { // from class: com.transsion.subtitle_download.task.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GetInStationSubtitleListTask.m82302f();
        }
    });

    private GetInStationSubtitleListTask() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final InterfaceC26951a m82302f() {
        return (InterfaceC26951a) C22982c.f70163e.m91553a().m91552h(InterfaceC26951a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:50:0x028b  */
    /* JADX WARN: Code duplicated, block: B:52:0x029b  */
    /* JADX WARN: Code duplicated, block: B:53:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:56:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x030b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x030c  */
    /* JADX WARN: Code duplicated, block: B:63:0x031a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x030c -> B:61:0x0312). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0471 -> B:101:0x0474). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: g */
    public final java.lang.Object m82303g(com.p282tn.lib.net.bean.BaseDto r34, kotlin.jvm.functions.Function1 r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, int r39, int r40, int r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, kotlin.coroutines.Continuation r45) {
        /*
            Method dump skipped, instruction units count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsion.subtitle_download.task.GetInStationSubtitleListTask.m82303g(com.tn.lib.net.bean.BaseDto, kotlin.jvm.functions.Function1, java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final InterfaceC26951a m82304k() {
        return (InterfaceC26951a) f63058b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final String m82305l() {
        String simpleName = GetInStationSubtitleListTask.class.getSimpleName();
        Intrinsics.m97801g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: renamed from: m */
    private final boolean m82306m(String str, int i11, List list) {
        boolean z11 = false;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SubtitleDownloadTable subtitleDownloadTable = (SubtitleDownloadTable) it.next();
                if (TextUtils.equals(str, subtitleDownloadTable.getId()) && i11 == subtitleDownloadTable.getResourceStreamType()) {
                    z11 = true;
                }
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: n */
    private final boolean m82307n(String str, List list) {
        Iterator it = list.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (TextUtils.equals(str, ((SubtitleItem) it.next()).getId())) {
                z11 = true;
            }
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:44:0x0113  */
    /* JADX WARN: Code duplicated, block: B:45:0x0119  */
    /* JADX WARN: Code duplicated, block: B:47:0x011f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0127  */
    /* JADX WARN: Code duplicated, block: B:53:0x0141  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: o */
    public final Object m82308o(String str, String str2, String str3, int i11, int i12, int i13, SubtitleItem subtitleItem, boolean z11, String str4, String str5, String str6, Continuation continuation) throws Throwable {
        GetInStationSubtitleListTask$saveAdnDownload$1 getInStationSubtitleListTask$saveAdnDownload$1;
        SubtitleDownloadTable subtitleDownloadTableMo106544c;
        boolean z12;
        SubtitleDownloadTable subtitleDownloadTable;
        String string;
        String lanAbbr;
        String upperCase;
        C19774e c19774e;
        Locale locale;
        String upperCase2;
        String lanAbbr2;
        String upperCase3;
        String upperCase4;
        Locale locale2;
        String upperCase5;
        String lanAbbr3;
        String upperCase6;
        if (continuation instanceof GetInStationSubtitleListTask$saveAdnDownload$1) {
            getInStationSubtitleListTask$saveAdnDownload$1 = (GetInStationSubtitleListTask$saveAdnDownload$1) continuation;
            int i14 = getInStationSubtitleListTask$saveAdnDownload$1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                getInStationSubtitleListTask$saveAdnDownload$1.label = i14 - Integer.MIN_VALUE;
            } else {
                getInStationSubtitleListTask$saveAdnDownload$1 = new GetInStationSubtitleListTask$saveAdnDownload$1(this, continuation);
            }
        } else {
            getInStationSubtitleListTask$saveAdnDownload$1 = new GetInStationSubtitleListTask$saveAdnDownload$1(this, continuation);
        }
        Object obj = getInStationSubtitleListTask$saveAdnDownload$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i15 = getInStationSubtitleListTask$saveAdnDownload$1.label;
        boolean z13 = true;
        if (i15 == 0) {
            ResultKt.m97107b(obj);
            SubtitleDownloadDatabase.Companion c19749d = SubtitleDownloadDatabase.INSTANCE;
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            InterfaceC27376a interfaceC27376aMo82290l0 = c19749d.m82292b(applicationM27275a).mo82290l0();
            String id2 = subtitleItem.getId();
            if (id2 == null) {
                id2 = "";
            }
            subtitleDownloadTableMo106544c = interfaceC27376aMo82290l0.mo106544c(id2, i11);
            if (subtitleDownloadTableMo106544c == null) {
                SubtitleDownloadTable subtitleDownloadTableM105554b = C27129a.f82238a.m105554b(str, str2, str3, i11, i12, i13, subtitleItem, str4, str5, str6);
                subtitleDownloadTableM105554b.setType(1);
                Application applicationM27275a2 = Utils.m27275a();
                Intrinsics.m97801g(applicationM27275a2, "getApp(...)");
                InterfaceC27376a interfaceC27376aMo82290l1 = c19749d.m82292b(applicationM27275a2).mo82290l0();
                getInStationSubtitleListTask$saveAdnDownload$1.L$0 = subtitleDownloadTableM105554b;
                getInStationSubtitleListTask$saveAdnDownload$1.Z$0 = z11;
                getInStationSubtitleListTask$saveAdnDownload$1.label = 1;
                if (interfaceC27376aMo82290l1.mo106546e(subtitleDownloadTableM105554b, getInStationSubtitleListTask$saveAdnDownload$1) == objF) {
                    return objF;
                }
                subtitleDownloadTable = subtitleDownloadTableM105554b;
                z12 = z11;
            } else {
                z12 = z11;
            }
            string = C19773d.f63089a.m82370b().getString("k_subtitle_select_lan", null);
            if (string != null && string.length() != 0) {
                locale2 = Locale.ROOT;
                upperCase5 = string.toUpperCase(locale2);
                Intrinsics.m97801g(upperCase5, "toUpperCase(...)");
                lanAbbr3 = subtitleDownloadTableMo106544c.getLanAbbr();
                if (lanAbbr3 != null) {
                    upperCase6 = lanAbbr3.toUpperCase(locale2);
                    Intrinsics.m97801g(upperCase6, "toUpperCase(...)");
                } else {
                    upperCase6 = null;
                }
                if (Intrinsics.m97797c(upperCase5, upperCase6)) {
                    C19768p.m82348e(C19768p.f63082a, subtitleDownloadTableMo106544c, false, 2, null);
                    return Boxing.m97631a(true);
                }
            }
            lanAbbr = subtitleDownloadTableMo106544c.getLanAbbr();
            if (lanAbbr != null) {
                upperCase = lanAbbr.toUpperCase(Locale.ROOT);
                Intrinsics.m97801g(upperCase, "toUpperCase(...)");
            } else {
                upperCase = null;
            }
            c19774e = C19774e.f63091a;
            String strM82376f = c19774e.m82376f();
            locale = Locale.ROOT;
            upperCase2 = strM82376f.toUpperCase(locale);
            Intrinsics.m97801g(upperCase2, "toUpperCase(...)");
            if (TextUtils.equals(upperCase, upperCase2)) {
                C19768p.m82348e(C19768p.f63082a, subtitleDownloadTableMo106544c, false, 2, null);
            } else {
                lanAbbr2 = subtitleDownloadTableMo106544c.getLanAbbr();
                if (lanAbbr2 != null) {
                    upperCase3 = lanAbbr2.toUpperCase(locale);
                    Intrinsics.m97801g(upperCase3, "toUpperCase(...)");
                } else {
                    upperCase3 = null;
                }
                upperCase4 = c19774e.m82375e().toUpperCase(locale);
                Intrinsics.m97801g(upperCase4, "toUpperCase(...)");
                if (TextUtils.equals(upperCase3, upperCase4) || !z12) {
                    z13 = false;
                } else {
                    C19768p.m82348e(C19768p.f63082a, subtitleDownloadTableMo106544c, false, 2, null);
                }
            }
            return Boxing.m97631a(z13);
        }
        if (i15 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z12 = getInStationSubtitleListTask$saveAdnDownload$1.Z$0;
        subtitleDownloadTable = (SubtitleDownloadTable) getInStationSubtitleListTask$saveAdnDownload$1.L$0;
        ResultKt.m97107b(obj);
        SubtitleDownloadManager.f63041a.m82276q(subtitleDownloadTable);
        subtitleDownloadTableMo106544c = subtitleDownloadTable;
        string = C19773d.f63089a.m82370b().getString("k_subtitle_select_lan", null);
        if (string != null) {
            locale2 = Locale.ROOT;
            upperCase5 = string.toUpperCase(locale2);
            Intrinsics.m97801g(upperCase5, "toUpperCase(...)");
            lanAbbr3 = subtitleDownloadTableMo106544c.getLanAbbr();
            if (lanAbbr3 != null) {
                upperCase6 = lanAbbr3.toUpperCase(locale2);
                Intrinsics.m97801g(upperCase6, "toUpperCase(...)");
            } else {
                upperCase6 = null;
            }
            if (Intrinsics.m97797c(upperCase5, upperCase6)) {
                C19768p.m82348e(C19768p.f63082a, subtitleDownloadTableMo106544c, false, 2, null);
                return Boxing.m97631a(true);
            }
        }
        lanAbbr = subtitleDownloadTableMo106544c.getLanAbbr();
        if (lanAbbr != null) {
            upperCase = lanAbbr.toUpperCase(Locale.ROOT);
            Intrinsics.m97801g(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        c19774e = C19774e.f63091a;
        String strM82376f2 = c19774e.m82376f();
        locale = Locale.ROOT;
        upperCase2 = strM82376f2.toUpperCase(locale);
        Intrinsics.m97801g(upperCase2, "toUpperCase(...)");
        if (TextUtils.equals(upperCase, upperCase2)) {
            C19768p.m82348e(C19768p.f63082a, subtitleDownloadTableMo106544c, false, 2, null);
        } else {
            lanAbbr2 = subtitleDownloadTableMo106544c.getLanAbbr();
            if (lanAbbr2 != null) {
                upperCase3 = lanAbbr2.toUpperCase(locale);
                Intrinsics.m97801g(upperCase3, "toUpperCase(...)");
            } else {
                upperCase3 = null;
            }
            upperCase4 = c19774e.m82375e().toUpperCase(locale);
            Intrinsics.m97801g(upperCase4, "toUpperCase(...)");
            if (TextUtils.equals(upperCase3, upperCase4)) {
                z13 = false;
            } else {
                z13 = false;
            }
        }
        return Boxing.m97631a(z13);
    }

    /* JADX INFO: renamed from: p */
    static /* synthetic */ Object m82309p(GetInStationSubtitleListTask getInStationSubtitleListTask, String str, String str2, String str3, int i11, int i12, int i13, SubtitleItem subtitleItem, boolean z11, String str4, String str5, String str6, Continuation continuation, int i14, Object obj) {
        return getInStationSubtitleListTask.m82308o(str, str2, str3, i11, (i14 & 16) != 0 ? 0 : i12, (i14 & 32) != 0 ? 0 : i13, subtitleItem, (i14 & 128) != 0 ? true : z11, (i14 & 256) != 0 ? null : str4, (i14 & 512) != 0 ? null : str5, (i14 & 1024) != 0 ? null : str6, continuation);
    }

    /* JADX INFO: renamed from: q */
    private final void m82310q(List list) {
        SubtitleItem subtitleItem;
        String upperCase;
        try {
            Result.Companion companion = Result.INSTANCE;
            int i11 = -1;
            if (list != null) {
                int i12 = 0;
                for (Object obj : list) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        CollectionsKt.m97515u();
                    }
                    String lanAbbr = ((SubtitleItem) obj).getLanAbbr();
                    if (lanAbbr != null) {
                        upperCase = lanAbbr.toUpperCase(Locale.ROOT);
                        Intrinsics.m97801g(upperCase, "toUpperCase(...)");
                    } else {
                        upperCase = null;
                    }
                    String upperCase2 = C19774e.f63091a.m82376f().toUpperCase(Locale.ROOT);
                    Intrinsics.m97801g(upperCase2, "toUpperCase(...)");
                    if (TextUtils.equals(upperCase, upperCase2)) {
                        i11 = i12;
                    }
                    i12 = i13;
                }
            }
            if (i11 > 0 && list != null && (subtitleItem = (SubtitleItem) list.remove(i11)) != null) {
                list.add(0, subtitleItem);
            }
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m82311h(SubtitleDownloadTable dbBean) {
        Intrinsics.m97802h(dbBean, "dbBean");
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new GetInStationSubtitleListTask$download$2(dbBean, null), 3, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m82312i(String str, String str2, String str3, int i11, int i12, int i13, String str4, String str5, String str6, int i14, Function1 function1) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new GetInStationSubtitleListTask$download$1(i14, str, str4, str3, i11, str2, i12, function1, str5, i13, str6, null), 3, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m82313j(String str, String str2, String videoResourceId, String str3, String str4, String str5, String idType, Function1 function1) {
        Intrinsics.m97802h(videoResourceId, "videoResourceId");
        Intrinsics.m97802h(idType, "idType");
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new GetInStationSubtitleListTask$downloadUGCVideo$1(str3, videoResourceId, idType, str, str2, str4, function1, str5, null), 3, null);
    }
}
