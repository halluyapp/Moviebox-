package com.transsion.subtitle.viewmodel;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3223t0;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.blankj.utilcode.util.Utils;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.download.SubtitleLanguageMapBean;
import com.transsion.baselib.report.C14482a;
import com.transsion.moviedetailapi.bean.SubtitleItem;
import com.transsion.subtitle.bean.OpenSubtitleData;
import com.transsion.subtitle.bean.SubtitleSearchListBean;
import com.transsion.subtitle.fragment.C19695i;
import com.transsion.subtitle.helper.C19717b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import nu.InterfaceC26106a;
import p349dh.C22982c;
import p528ju.C24469a;
import p648oj.InterfaceC26246d1;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class SubtitleDownloadViewModel extends AbstractC3223t0 {

    /* JADX INFO: renamed from: a */
    private final Lazy f63011a = LazyKt.m97097b(new Function0() { // from class: com.transsion.subtitle.viewmodel.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SubtitleDownloadViewModel.m82246v();
        }
    });

    /* JADX INFO: renamed from: b */
    private final Lazy f63012b = LazyKt.m97097b(new Function0() { // from class: com.transsion.subtitle.viewmodel.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SubtitleDownloadViewModel.m82247w();
        }
    });

    /* JADX INFO: renamed from: c */
    private final C3187b0 f63013c = new C3187b0();

    /* JADX INFO: renamed from: d */
    private final C3187b0 f63014d = new C3187b0();

    /* JADX INFO: renamed from: e */
    private final C3187b0 f63015e = new C3187b0();

    /* JADX INFO: renamed from: f */
    private final C3187b0 f63016f = new C3187b0();

    /* JADX INFO: renamed from: g */
    private final C3187b0 f63017g = new C3187b0();

    /* JADX INFO: renamed from: h */
    private final C3187b0 f63018h = new C3187b0();

    /* JADX INFO: renamed from: i */
    private final C3187b0 f63019i = new C3187b0();

    /* JADX INFO: renamed from: j */
    private final C3187b0 f63020j = new C3187b0();

    /* JADX INFO: renamed from: k */
    private final C3187b0 f63021k = new C3187b0();

    /* JADX INFO: renamed from: p */
    private final InterfaceC26106a m82241p() {
        return (InterfaceC26106a) this.f63011a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final InterfaceC26246d1 m82242q() {
        return (InterfaceC26246d1) this.f63012b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Failed to calculate best type for var: r1v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v13 ??, new type: com.transsion.subtitle.helper.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v13 ??, new type: com.transsion.subtitle.helper.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v15 ??, new type: com.transsion.subtitle.bean.SubtitleSearchListBean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v15 ??, new type: com.transsion.subtitle.bean.SubtitleSearchListBean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v13 com.transsion.subtitle.helper.b, new type: com.transsion.subtitle.helper.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 5 more
     */
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
    /* JADX INFO: renamed from: r */
    public final Object m82243r(C19695i c19695i, String str, DownloadBean downloadBean, String str2, int i11, Continuation continuation) throws Throwable {
        SubtitleDownloadViewModel$searchFromMovieBox$1 subtitleDownloadViewModel$searchFromMovieBox$1;
        String subjectId;
        String str3 = str2;
        if (continuation instanceof SubtitleDownloadViewModel$searchFromMovieBox$1) {
            subtitleDownloadViewModel$searchFromMovieBox$1 = (SubtitleDownloadViewModel$searchFromMovieBox$1) continuation;
            int i12 = subtitleDownloadViewModel$searchFromMovieBox$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                subtitleDownloadViewModel$searchFromMovieBox$1.label = i12 - Integer.MIN_VALUE;
            } else {
                subtitleDownloadViewModel$searchFromMovieBox$1 = new SubtitleDownloadViewModel$searchFromMovieBox$1(this, continuation);
            }
        } else {
            subtitleDownloadViewModel$searchFromMovieBox$1 = new SubtitleDownloadViewModel$searchFromMovieBox$1(this, continuation);
        }
        SubtitleDownloadViewModel$searchFromMovieBox$1 subtitleDownloadViewModel$searchFromMovieBox$2 = subtitleDownloadViewModel$searchFromMovieBox$1;
        Object objM102243a = subtitleDownloadViewModel$searchFromMovieBox$2.result;
        Object objF = IntrinsicsKt.m97630f();
        int i13 = subtitleDownloadViewModel$searchFromMovieBox$2.label;
        if (i13 == 0) {
            ResultKt.m97107b(objM102243a);
            if (c19695i == null || c19695i.m82144b().length() == 0) {
                SubtitleSearchListBean subtitleSearchListBean = new SubtitleSearchListBean(null, null, 0, false, 12, null);
                subtitleSearchListBean.setSearchType(1);
                subtitleSearchListBean.setRefresh(Intrinsics.m97797c(str3, "1"));
                return subtitleSearchListBean;
            }
            C26866a.a.m104908v(C26866a.f81698a, "ORSubtitle_search", "222 searchFromMovieBox name:" + c19695i.m82144b() + ",ep:" + c19695i.m82143a() + ",se:" + c19695i.m82145c(), false, 4, null);
            InterfaceC26106a interfaceC26106aM82241p = m82241p();
            String strM82144b = c19695i.m82144b();
            if (downloadBean == null || (subjectId = downloadBean.getSubjectId()) == null) {
                subjectId = "";
            }
            String str4 = subjectId;
            int iM82145c = c19695i.m82145c();
            int iM82143a = c19695i.m82143a();
            subtitleDownloadViewModel$searchFromMovieBox$2.L$0 = str3;
            subtitleDownloadViewModel$searchFromMovieBox$2.label = 1;
            objM102243a = InterfaceC26106a.a.m102243a(interfaceC26106aM82241p, null, strM82144b, str, str4, iM82145c, iM82143a, str2, i11, subtitleDownloadViewModel$searchFromMovieBox$2, 1, null);
            if (objM102243a == objF) {
                return objF;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str5 = (String) subtitleDownloadViewModel$searchFromMovieBox$2.L$0;
            ResultKt.m97107b(objM102243a);
            str3 = str5;
        }
        BaseDto baseDto = (BaseDto) objM102243a;
        if (!Intrinsics.m97797c(baseDto.getCode(), "0")) {
            SubtitleSearchListBean subtitleSearchListBean2 = new SubtitleSearchListBean(null, null, 0, false, 12, null);
            subtitleSearchListBean2.setSearchType(1);
            subtitleSearchListBean2.setRefresh(Intrinsics.m97797c(str3, "1"));
            return subtitleSearchListBean2;
        }
        C19717b.f62943a.m82166f(r11, baseDto.getReason());
        SubtitleSearchListBean subtitleSearchListBean3 = (SubtitleSearchListBean) baseDto.getData();
        if (subtitleSearchListBean3 != 0) {
            subtitleSearchListBean3.setSearchType(r11);
            subtitleSearchListBean3.setRefresh(Intrinsics.m97797c(str3, "1"));
            List<SubtitleItem> items = subtitleSearchListBean3.getItems();
            if (items != null) {
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    ((SubtitleItem) it.next()).setType(Boxing.m97634d(2));
                }
            }
        }
        return (SubtitleSearchListBean) baseDto.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: s */
    public final Object m82244s(DownloadBean downloadBean, C19695i c19695i, List list, Continuation continuation) throws Throwable {
        SubtitleDownloadViewModel$searchFromOpenSubtitleNewApi$1 subtitleDownloadViewModel$searchFromOpenSubtitleNewApi$1;
        String name;
        String lan;
        String strM82144b;
        String strM82144b2;
        String lan2;
        List list2;
        if (continuation instanceof SubtitleDownloadViewModel$searchFromOpenSubtitleNewApi$1) {
            subtitleDownloadViewModel$searchFromOpenSubtitleNewApi$1 = (SubtitleDownloadViewModel$searchFromOpenSubtitleNewApi$1) continuation;
            int i11 = subtitleDownloadViewModel$searchFromOpenSubtitleNewApi$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                subtitleDownloadViewModel$searchFromOpenSubtitleNewApi$1.label = i11 - Integer.MIN_VALUE;
            } else {
                subtitleDownloadViewModel$searchFromOpenSubtitleNewApi$1 = new SubtitleDownloadViewModel$searchFromOpenSubtitleNewApi$1(this, continuation);
            }
        } else {
            subtitleDownloadViewModel$searchFromOpenSubtitleNewApi$1 = new SubtitleDownloadViewModel$searchFromOpenSubtitleNewApi$1(this, continuation);
        }
        SubtitleDownloadViewModel$searchFromOpenSubtitleNewApi$1 subtitleDownloadViewModel$searchFromOpenSubtitleNewApi$2 = subtitleDownloadViewModel$searchFromOpenSubtitleNewApi$1;
        Object objM82165e = subtitleDownloadViewModel$searchFromOpenSubtitleNewApi$2.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = subtitleDownloadViewModel$searchFromOpenSubtitleNewApi$2.label;
        if (i12 == 0) {
            ResultKt.m97107b(objM82165e);
            C26866a.f81698a.m104912c(C14482a.f50937a.m65273a(), "searchFromOpenSubtitleNewApi -start", true);
            if (downloadBean == null || !downloadBean.isSeries()) {
                C19717b c19717b = C19717b.f62943a;
                if (c19695i == null || (strM82144b = c19695i.m82144b()) == null) {
                    name = downloadBean != null ? downloadBean.getName() : null;
                    if (name == null) {
                        name = "";
                    }
                } else {
                    name = strM82144b;
                }
                SubtitleLanguageMapBean subtitleLanguageMapBean = (SubtitleLanguageMapBean) CollectionsKt.m97361k0(list);
                String str = (subtitleLanguageMapBean == null || (lan = subtitleLanguageMapBean.getLan()) == null) ? "" : lan;
                subtitleDownloadViewModel$searchFromOpenSubtitleNewApi$2.label = 2;
                objM82165e = c19717b.m82165e(name, str, null, null, subtitleDownloadViewModel$searchFromOpenSubtitleNewApi$2);
                if (objM82165e == objF) {
                    return objF;
                }
                list2 = (List) objM82165e;
            } else {
                C19717b c19717b2 = C19717b.f62943a;
                if (c19695i == null || (strM82144b2 = c19695i.m82144b()) == null) {
                    String name2 = downloadBean.getName();
                    strM82144b2 = name2 == null ? "" : name2;
                }
                SubtitleLanguageMapBean subtitleLanguageMapBean2 = (SubtitleLanguageMapBean) CollectionsKt.m97361k0(list);
                String str2 = (subtitleLanguageMapBean2 == null || (lan2 = subtitleLanguageMapBean2.getLan()) == null) ? "" : lan2;
                Integer numM97634d = c19695i != null ? Boxing.m97634d(c19695i.m82145c()) : null;
                Integer numM97634d2 = c19695i != null ? Boxing.m97634d(c19695i.m82143a()) : null;
                subtitleDownloadViewModel$searchFromOpenSubtitleNewApi$2.label = 1;
                objM82165e = c19717b2.m82165e(strM82144b2, str2, numM97634d, numM97634d2, subtitleDownloadViewModel$searchFromOpenSubtitleNewApi$2);
                if (objM82165e == objF) {
                    return objF;
                }
                list2 = (List) objM82165e;
            }
        } else if (i12 == 1) {
            ResultKt.m97107b(objM82165e);
            list2 = (List) objM82165e;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(objM82165e);
            list2 = (List) objM82165e;
        }
        List list3 = list2;
        if (list3 == null || list3.isEmpty()) {
            C26866a.f81698a.m104912c(C14482a.f50937a.m65273a(), "searchFromOpenSubtitleNewApi -fail", true);
            return null;
        }
        C26866a.f81698a.m104912c(C14482a.f50937a.m65273a(), "searchFromOpenSubtitleNewApi -success", true);
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            SubtitleItem subtitleBean = ((OpenSubtitleData) it.next()).toSubtitleBean();
            if (subtitleBean != null) {
                arrayList.add(subtitleBean);
            }
        }
        SubtitleSearchListBean subtitleSearchListBean = new SubtitleSearchListBean(null, arrayList, 0, false, 12, null);
        subtitleSearchListBean.setSearchType(3);
        subtitleSearchListBean.setRefresh(true);
        return subtitleSearchListBean;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m82245u(SubtitleDownloadViewModel subtitleDownloadViewModel, C19695i c19695i, String str, List list, DownloadBean downloadBean, String str2, int i11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            str2 = "1";
        }
        String str3 = str2;
        if ((i12 & 32) != 0) {
            i11 = 20;
        }
        subtitleDownloadViewModel.m82257t(c19695i, str, list, downloadBean, str3, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final InterfaceC26106a m82246v() {
        return (InterfaceC26106a) C22982c.f70163e.m91553a().m91552h(InterfaceC26106a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final InterfaceC26246d1 m82247w() {
        Application applicationM27275a = Utils.m27275a();
        if (applicationM27275a != null) {
            return AppDatabase.INSTANCE.m64881b(applicationM27275a).mo64878y1();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m82248g(String subtitleResId) {
        Intrinsics.m97802h(subtitleResId, "subtitleResId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new SubtitleDownloadViewModel$getDownloadedList$1(subtitleResId, this, null), 3, null);
    }

    /* JADX INFO: renamed from: h */
    public final C3187b0 m82249h() {
        return this.f63014d;
    }

    /* JADX INFO: renamed from: i */
    public final void m82250i() {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new SubtitleDownloadViewModel$getLanguageAllList$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: j */
    public final C3187b0 m82251j() {
        return this.f63016f;
    }

    /* JADX INFO: renamed from: k */
    public final void m82252k(C24469a item) {
        Intrinsics.m97802h(item, "item");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new SubtitleDownloadViewModel$getOpenSubNewApiDownloadInfo$1(item, this, null), 2, null);
    }

    /* JADX INFO: renamed from: l */
    public final C3187b0 m82253l() {
        return this.f63020j;
    }

    /* JADX INFO: renamed from: m */
    public final C3187b0 m82254m() {
        return this.f63021k;
    }

    /* JADX INFO: renamed from: n */
    public final C3187b0 m82255n() {
        return this.f63015e;
    }

    /* JADX INFO: renamed from: o */
    public final C3187b0 m82256o() {
        return this.f63019i;
    }

    /* JADX INFO: renamed from: t */
    public final void m82257t(C19695i c19695i, String languages, List languageList, DownloadBean downloadBean, String nextPage, int i11) {
        Intrinsics.m97802h(languages, "languages");
        Intrinsics.m97802h(languageList, "languageList");
        Intrinsics.m97802h(nextPage, "nextPage");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new SubtitleDownloadViewModel$searchSubtitleList$1(this, downloadBean, c19695i, languageList, languages, nextPage, i11, null), 2, null);
    }
}
