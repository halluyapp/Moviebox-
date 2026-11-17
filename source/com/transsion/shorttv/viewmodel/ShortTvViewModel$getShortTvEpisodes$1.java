package com.transsion.shorttv.viewmodel;

import androidx.p1004lifecycle.C3187b0;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.shorttv.bean.ShortTVFavInfo;
import com.transsion.shorttv.bean.ShortTVItem;
import com.transsion.shorttv.bean.ShortTvInnerPlayBean;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.bean.Trailer;
import com.transsion.shorttv.p314db.C18845e;
import com.transsion.shorttv.p314db.ShortTvAdUnlockDao;
import com.transsion.shorttv.p314db.ShortTvFavoriteDao;
import com.transsion.shorttv.p314db.ShortTvFavoriteStateBean;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import es.C23219b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import p659os.C26719e;
import p717qr.C27124c;
import p743rh.C27287m;
import p790ts.InterfaceC27847a;
import p848vs.InterfaceC28213d;
import p848vs.InterfaceC28217h;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvViewModel$getShortTvEpisodes$1", m97637f = "ShortTvViewModel.kt", m97638l = {249, 272, 295, Sdk$SDKError.Reason.WEBVIEW_ERROR_VALUE, 328, 332, 338, 351, 367, 373, TTAdConstant.DEEPLINK_UNAVAILABLE_CODE}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class ShortTvViewModel$getShortTvEpisodes$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currentSubjectId;
    final /* synthetic */ Integer $dataSource;
    final /* synthetic */ int $ep;
    final /* synthetic */ boolean $isHistoryFirst;
    final /* synthetic */ Subject $subject;
    final /* synthetic */ String $subjectId;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ ShortTvViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvViewModel$getShortTvEpisodes$1(Integer num, ShortTvViewModel shortTvViewModel, String str, String str2, Subject subject, int i11, boolean z11, Continuation<? super ShortTvViewModel$getShortTvEpisodes$1> continuation) {
        super(2, continuation);
        this.$dataSource = num;
        this.this$0 = shortTvViewModel;
        this.$subjectId = str;
        this.$currentSubjectId = str2;
        this.$subject = subject;
        this.$ep = i11;
        this.$isHistoryFirst = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShortTvViewModel$getShortTvEpisodes$1 shortTvViewModel$getShortTvEpisodes$1 = new ShortTvViewModel$getShortTvEpisodes$1(this.$dataSource, this.this$0, this.$subjectId, this.$currentSubjectId, this.$subject, this.$ep, this.$isHistoryFirst, continuation);
        shortTvViewModel$getShortTvEpisodes$1.L$0 = obj;
        return shortTvViewModel$getShortTvEpisodes$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvViewModel$getShortTvEpisodes$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x038d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0395 A[Catch: Exception -> 0x0388, TryCatch #2 {Exception -> 0x0388, blocks: (B:104:0x0381, B:108:0x038e, B:110:0x0395, B:112:0x0399, B:114:0x039f, B:115:0x03a4, B:117:0x03aa, B:119:0x03b0, B:121:0x03b5, B:123:0x03bd), top: B:271:0x0381 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0399 A[Catch: Exception -> 0x0388, TryCatch #2 {Exception -> 0x0388, blocks: (B:104:0x0381, B:108:0x038e, B:110:0x0395, B:112:0x0399, B:114:0x039f, B:115:0x03a4, B:117:0x03aa, B:119:0x03b0, B:121:0x03b5, B:123:0x03bd), top: B:271:0x0381 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x039e  */
    /* JADX WARN: Code duplicated, block: B:117:0x03aa A[Catch: Exception -> 0x0388, TryCatch #2 {Exception -> 0x0388, blocks: (B:104:0x0381, B:108:0x038e, B:110:0x0395, B:112:0x0399, B:114:0x039f, B:115:0x03a4, B:117:0x03aa, B:119:0x03b0, B:121:0x03b5, B:123:0x03bd), top: B:271:0x0381 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x03af  */
    /* JADX WARN: Code duplicated, block: B:121:0x03b5 A[Catch: Exception -> 0x0388, TryCatch #2 {Exception -> 0x0388, blocks: (B:104:0x0381, B:108:0x038e, B:110:0x0395, B:112:0x0399, B:114:0x039f, B:115:0x03a4, B:117:0x03aa, B:119:0x03b0, B:121:0x03b5, B:123:0x03bd), top: B:271:0x0381 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x03bd A[Catch: Exception -> 0x0388, TRY_LEAVE, TryCatch #2 {Exception -> 0x0388, blocks: (B:104:0x0381, B:108:0x038e, B:110:0x0395, B:112:0x0399, B:114:0x039f, B:115:0x03a4, B:117:0x03aa, B:119:0x03b0, B:121:0x03b5, B:123:0x03bd), top: B:271:0x0381 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x03d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:126:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:129:0x03d9 A[PHI: r2
      0x03d9: PHI (r2v58 boolean) = (r2v54 boolean), (r2v60 boolean) binds: [B:122:0x03bb, B:136:0x041f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x0404  */
    /* JADX WARN: Code duplicated, block: B:134:0x0419 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:136:0x041f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0424  */
    /* JADX WARN: Code duplicated, block: B:140:0x0428  */
    /* JADX WARN: Code duplicated, block: B:142:0x0430  */
    /* JADX WARN: Code duplicated, block: B:144:0x0445 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:146:0x044a  */
    /* JADX WARN: Code duplicated, block: B:148:0x044e  */
    /* JADX WARN: Code duplicated, block: B:150:0x046c  */
    /* JADX WARN: Code duplicated, block: B:153:0x048b A[Catch: all -> 0x005a, TryCatch #3 {all -> 0x005a, blocks: (B:10:0x0053, B:156:0x04a0, B:158:0x04a4, B:160:0x04aa, B:162:0x04d5, B:163:0x04de, B:165:0x04e2, B:151:0x0470, B:153:0x048b), top: B:273:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:155:0x049f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:158:0x04a4 A[Catch: all -> 0x005a, TryCatch #3 {all -> 0x005a, blocks: (B:10:0x0053, B:156:0x04a0, B:158:0x04a4, B:160:0x04aa, B:162:0x04d5, B:163:0x04de, B:165:0x04e2, B:151:0x0470, B:153:0x048b), top: B:273:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:164:0x04e1 A[PHI: r1 r2
      0x04e1: PHI (r1v140 boolean) = (r1v131 boolean), (r1v142 boolean), (r1v142 boolean) binds: [B:152:0x0489, B:157:0x04a2, B:159:0x04a8] A[DONT_GENERATE, DONT_INLINE]
      0x04e1: PHI (r2v72 com.transsion.shorttv.bean.Subject) = 
      (r2v70 com.transsion.shorttv.bean.Subject)
      (r2v74 com.transsion.shorttv.bean.Subject)
      (r2v74 com.transsion.shorttv.bean.Subject)
     binds: [B:152:0x0489, B:157:0x04a2, B:159:0x04a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:170:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:173:0x0525  */
    /* JADX WARN: Code duplicated, block: B:175:0x055a  */
    /* JADX WARN: Code duplicated, block: B:176:0x0563  */
    /* JADX WARN: Code duplicated, block: B:180:0x0573  */
    /* JADX WARN: Code duplicated, block: B:182:0x058b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:184:0x0594  */
    /* JADX WARN: Code duplicated, block: B:187:0x059d  */
    /* JADX WARN: Code duplicated, block: B:189:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:200:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:202:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:205:0x0608  */
    /* JADX WARN: Code duplicated, block: B:210:0x061a  */
    /* JADX WARN: Code duplicated, block: B:212:0x061d  */
    /* JADX WARN: Code duplicated, block: B:214:0x0634  */
    /* JADX WARN: Code duplicated, block: B:215:0x0639  */
    /* JADX WARN: Code duplicated, block: B:219:0x0645  */
    /* JADX WARN: Code duplicated, block: B:221:0x0651  */
    /* JADX WARN: Code duplicated, block: B:223:0x0668  */
    /* JADX WARN: Code duplicated, block: B:224:0x066d  */
    /* JADX WARN: Code duplicated, block: B:228:0x0679  */
    /* JADX WARN: Code duplicated, block: B:231:0x0682 A[LOOP:0: B:201:0x05f9->B:231:0x0682, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:234:0x068b  */
    /* JADX WARN: Code duplicated, block: B:236:0x0693  */
    /* JADX WARN: Code duplicated, block: B:238:0x06a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:241:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:244:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:247:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:253:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:256:0x071c  */
    /* JADX WARN: Code duplicated, block: B:261:0x0737 A[LOOP:2: B:259:0x0731->B:261:0x0737, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:271:0x0381 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x0685 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0616 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0105  */
    /* JADX WARN: Code duplicated, block: B:45:0x0193  */
    /* JADX WARN: Code duplicated, block: B:46:0x0198  */
    /* JADX WARN: Code duplicated, block: B:60:0x022c  */
    /* JADX WARN: Code duplicated, block: B:62:0x024c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0251  */
    /* JADX WARN: Code duplicated, block: B:65:0x0254 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x025c  */
    /* JADX WARN: Code duplicated, block: B:70:0x028a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0294  */
    /* JADX WARN: Code duplicated, block: B:74:0x02a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:78:0x02c0 A[PHI: r0 r1 r2 r3 r15
      0x02c0: PHI (r0v52 boolean) = (r0v47 boolean), (r0v57 boolean) binds: [B:71:0x0292, B:76:0x02ac] A[DONT_GENERATE, DONT_INLINE]
      0x02c0: PHI (r1v69 com.transsion.shorttv.bean.Subject) = (r1v39 com.transsion.shorttv.bean.Subject), (r1v95 com.transsion.shorttv.bean.Subject) binds: [B:71:0x0292, B:76:0x02ac] A[DONT_GENERATE, DONT_INLINE]
      0x02c0: PHI (r2v39 os.e) = (r2v27 os.e), (r2v50 os.e) binds: [B:71:0x0292, B:76:0x02ac] A[DONT_GENERATE, DONT_INLINE]
      0x02c0: PHI (r3v33 java.util.List) = (r3v28 java.util.List), (r3v42 java.util.List) binds: [B:71:0x0292, B:76:0x02ac] A[DONT_GENERATE, DONT_INLINE]
      0x02c0: PHI (r15v7 kotlinx.coroutines.n0) = (r15v4 kotlinx.coroutines.n0), (r15v12 kotlinx.coroutines.n0) binds: [B:71:0x0292, B:76:0x02ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x031b  */
    /* JADX WARN: Code duplicated, block: B:87:0x031f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0324  */
    /* JADX WARN: Code duplicated, block: B:91:0x0329  */
    /* JADX WARN: Code duplicated, block: B:98:0x0376 A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:170:0x04f7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:173:0x0525, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x0105, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        Throwable thM112710exceptionOrNullimpl;
        int totalEpisode;
        InterfaceC28213d interfaceC28213dM80392s0;
        Subject subject;
        List list;
        Object objMo73636b;
        ShortTVFavInfo shortTVFavInfo;
        Boolean boolM97631a;
        boolean z11;
        List arrayList;
        Integer num;
        List<ShortTVItem> listI0;
        String str;
        Object objM80288I0;
        Subject subject2;
        List list2;
        ShortTvFavoriteDao shortTvFavoriteDaoM80298b0;
        Object objMo79355a;
        int i11;
        ShortTVItem shortTVFirstEp;
        C26719e c26719e;
        int downloadStatus;
        C26719e c26719e2;
        int downloadStatus2;
        Iterator it;
        Object next;
        ShortTvFavoriteStateBean shortTvFavoriteStateBean;
        InterfaceC25149n0 interfaceC25149n0;
        boolean zM106330e;
        InterfaceC25149n0 interfaceC25149n1;
        ShortTvInnerPlayBean shortTvInnerPlayBean;
        Object objMo73653c;
        int iIntValue;
        int iM80357S;
        C26866a.a aVar;
        List arrayList2;
        Subject subject3;
        Trailer trailer;
        Subject subject4;
        ShortTVItem shortTVFirstEp2;
        C26719e c26719e3;
        Subject subject5;
        ShortTvFavoriteDao shortTvFavoriteDaoM80298b1;
        Object objMo79355a2;
        Object objM80288I1;
        InterfaceC25149n0 interfaceC25149n2;
        Integer num2;
        ShortTVFavInfo shortTVFavInfo2;
        Subject subject6;
        InterfaceC28213d interfaceC28213dM80392s1;
        Object objMo73644j;
        Subject subject7;
        List<Integer> unlockedEps;
        List<Integer> list3;
        Object objM108246d;
        ShortTvFavoriteStateBean shortTvFavoriteStateBean2;
        InterfaceC25149n0 interfaceC25149n3;
        boolean z12;
        BaseDto baseDto;
        Subject subject8;
        Exception exc;
        boolean z13;
        InterfaceC25149n0 interfaceC25149n4;
        ShortTVFavInfo shortTVFavInfo3;
        InterfaceC28213d interfaceC28213dM80392s2;
        Object objMo73644j2;
        boolean z14;
        Subject subject9;
        String ops;
        InterfaceC28213d interfaceC28213dM80392s3;
        Object objMo73644j3;
        String str2;
        ShortTvAdUnlockDao shortTvAdUnlockDaoM80294U;
        Object objMo79340a;
        Unit unit;
        C18845e c18845e;
        Set setM79371c;
        Object objF = IntrinsicsKt.m97630f();
        shortTVFavInfo = null;
        ShortTVFavInfo shortTVFavInfo4 = null;
        try {
            switch (this.label) {
                case 0:
                    ResultKt.m97107b(obj);
                    interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
                    zM106330e = C27287m.f83003a.m106330e();
                    if (this.$dataSource == null) {
                        InterfaceC28217h interfaceC28217hM80336A0 = this.this$0.m80336A0();
                        if (interfaceC28217hM80336A0 != null) {
                            String str3 = this.$subjectId;
                            this.L$0 = interfaceC25149n0;
                            this.Z$0 = zM106330e;
                            this.label = 1;
                            objMo73653c = interfaceC28217hM80336A0.mo73653c(str3, this);
                            if (objMo73653c == objF) {
                                return objF;
                            }
                            interfaceC25149n1 = interfaceC25149n0;
                            shortTvInnerPlayBean = (ShortTvInnerPlayBean) objMo73653c;
                        } else {
                            interfaceC25149n1 = interfaceC25149n0;
                            shortTvInnerPlayBean = null;
                        }
                        if (shortTvInnerPlayBean != null) {
                            C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "获取到历史：" + shortTvInnerPlayBean, false, 4, null);
                            this.this$0.f61607J.mo14858q(shortTvInnerPlayBean);
                        }
                        iIntValue = -1;
                        if (Intrinsics.m97797c(this.$currentSubjectId, this.$subjectId) && (num2 = (Integer) this.this$0.m80384j0().m14847f()) != null) {
                            iIntValue = num2.intValue();
                        }
                        int i12 = iIntValue;
                        iM80357S = this.this$0.m80357S(i12, shortTvInnerPlayBean, this.$subject, this.$ep, this.$isHistoryFirst);
                        aVar = C26866a.f81698a;
                        C26866a.a.m104898f(aVar, "ShortTvViewModel", "lastEp: " + i12 + ", historyItem: " + shortTvInnerPlayBean + ", firstSelectEp:" + iM80357S, false, 4, null);
                        arrayList2 = new ArrayList();
                        subject3 = this.$subject;
                        if (subject3 != null) {
                            trailer = subject3.getTrailer();
                        } else {
                            trailer = null;
                        }
                        if (trailer != null || this.$subject.getShortTVFirstEp() == null || !zM106330e) {
                            this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                            C26866a.a.m104898f(aVar, "ShortTvViewModel", "不存在预告片", false, 4, null);
                            subject4 = this.$subject;
                            if (subject4 != null) {
                                shortTVFirstEp2 = subject4.getShortTVFirstEp();
                            } else {
                                shortTVFirstEp2 = null;
                            }
                            if (shortTVFirstEp2 != null && zM106330e) {
                                if (shortTVFirstEp2.getEp() == iM80357S) {
                                    C26866a.a.m104898f(aVar, "ShortTvViewModel", "需要预加载第一集", false, 4, null);
                                    c26719e3 = new C26719e(this.$subjectId, shortTVFirstEp2.getEp(), shortTVFirstEp2, 0, 8, null);
                                    if (this.$subject.getShortTVFavInfo() == null) {
                                        subject5 = this.$subject;
                                        shortTvFavoriteDaoM80298b1 = this.this$0.m80298b0();
                                        if (shortTvFavoriteDaoM80298b1 != null) {
                                            String str4 = this.$subjectId;
                                            this.L$0 = interfaceC25149n1;
                                            this.L$1 = arrayList2;
                                            this.L$2 = c26719e3;
                                            this.L$3 = subject5;
                                            this.Z$0 = zM106330e;
                                            this.label = 3;
                                            objMo79355a2 = shortTvFavoriteDaoM80298b1.mo79355a(str4, this);
                                            if (objMo79355a2 == objF) {
                                                return objF;
                                            }
                                            shortTvFavoriteStateBean2 = (ShortTvFavoriteStateBean) objMo79355a2;
                                            if (shortTvFavoriteStateBean2 != null) {
                                                shortTVFavInfo2 = new ShortTVFavInfo(shortTvFavoriteStateBean2.getFavoriteNum(), shortTvFavoriteStateBean2.getHasFavorite(), shortTvFavoriteStateBean2.getFavoriteTime());
                                            } else {
                                                shortTVFavInfo2 = null;
                                            }
                                        } else {
                                            shortTVFavInfo2 = null;
                                        }
                                        subject5.setShortTVFavInfo(shortTVFavInfo2);
                                    }
                                    arrayList2.add(c26719e3);
                                    this.this$0.m80381g1(false);
                                    this.this$0.f61633g.mo14858q(this.$subject);
                                    this.this$0.f61643q.mo14858q(arrayList2);
                                    this.this$0.m80397w0(this.$subjectId, 2);
                                } else {
                                    C26866a.a.m104898f(aVar, "ShortTvViewModel", "不需要预加载第一集", false, 4, null);
                                }
                            }
                        } else if (iM80357S == 0 && C27124c.f82233a.m105540b().m105522b()) {
                            C26866a.a.m104898f(aVar, "ShortTvViewModel", "存在预告片 " + this.$subject.getTrailer(), false, 4, null);
                            ShortTvViewModel shortTvViewModel = this.this$0;
                            String str5 = this.$subjectId;
                            Subject subject10 = this.$subject;
                            this.L$0 = interfaceC25149n1;
                            this.L$1 = arrayList2;
                            this.Z$0 = zM106330e;
                            this.label = 2;
                            objM80288I1 = shortTvViewModel.m80288I0(str5, subject10, this);
                            if (objM80288I1 == objF) {
                                return objF;
                            }
                            interfaceC25149n2 = interfaceC25149n1;
                            arrayList2.add((C26719e) objM80288I1);
                            this.this$0.f61609L.mo14858q(Boxing.m97631a(true));
                            this.this$0.m80381g1(false);
                            this.this$0.f61633g.mo14858q(this.$subject);
                            this.this$0.f61643q.mo14858q(arrayList2);
                            interfaceC25149n1 = interfaceC25149n2;
                        } else {
                            C26866a.a.m104898f(aVar, "ShortTvViewModel", "不需要加载预告片", false, 4, null);
                        }
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(0));
                    } else {
                        interfaceC25149n1 = interfaceC25149n0;
                    }
                    if (zM106330e) {
                        subject6 = this.$subject;
                        if (subject6 != null) {
                            interfaceC28213dM80392s1 = this.this$0.m80392s0();
                            if (interfaceC28213dM80392s1 != null) {
                                String str6 = this.$subjectId;
                                this.L$0 = interfaceC25149n1;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.Z$0 = zM106330e;
                                this.label = 7;
                                objMo73644j = interfaceC28213dM80392s1.mo73644j(str6, this);
                                if (objMo73644j == objF) {
                                    return objF;
                                }
                                subject6 = (Subject) objMo73644j;
                            } else {
                                z11 = zM106330e;
                                subject2 = null;
                            }
                        }
                        if (subject2 == null) {
                            this.this$0.m80381g1(false);
                            this.this$0.f61633g.mo14858q(null);
                            this.this$0.f61643q.mo14858q(CollectionsKt.m97506l());
                            return Unit.f75682a;
                        }
                        ShortTvViewModel shortTvViewModel2 = this.this$0;
                        str2 = this.$subjectId;
                        Result.Companion companion = Result.INSTANCE;
                        C26866a.a.m104905r(C26866a.f81698a, "ShortTvViewModel", new String[]{"will loadAdUnlockedEps"}, false, 4, null);
                        shortTvAdUnlockDaoM80294U = shortTvViewModel2.m80294U();
                        if (shortTvAdUnlockDaoM80294U != null) {
                            this.L$0 = subject2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.Z$0 = z11;
                            this.label = 8;
                            objMo79340a = shortTvAdUnlockDaoM80294U.mo79340a(str2, this);
                            if (objMo79340a == objF) {
                                return objF;
                            }
                            c18845e = (C18845e) objMo79340a;
                            if (c18845e != null) {
                                unit = null;
                            } else {
                                unit = null;
                            }
                        } else {
                            unit = null;
                        }
                        objM112707constructorimpl = Result.m112707constructorimpl(unit);
                        thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                        if (thM112710exceptionOrNullimpl != null) {
                            C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                        }
                        if (!Intrinsics.m97797c(subject2, this.this$0.f61633g.m14847f())) {
                            C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,set newSubject:" + this.$subjectId, false, 4, null);
                            this.this$0.f61633g.mo14858q(subject2);
                            C3187b0 c3187b0 = this.this$0.f61601D;
                            shortTVFavInfo = subject2.getShortTVFavInfo();
                            if (shortTVFavInfo != null) {
                                boolM97631a = Boxing.m97631a(shortTVFavInfo.getHasFavorite());
                            } else {
                                boolM97631a = null;
                            }
                            c3187b0.mo14858q(boolM97631a);
                        }
                        totalEpisode = subject2.getTotalEpisode();
                        interfaceC28213dM80392s0 = this.this$0.m80392s0();
                        if (interfaceC28213dM80392s0 != null) {
                            String str7 = this.$subjectId;
                            this.L$0 = subject2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.Z$0 = z11;
                            this.I$0 = totalEpisode;
                            this.label = 9;
                            objMo73636b = interfaceC28213dM80392s0.mo73636b(str7, this);
                            if (objMo73636b == objF) {
                                return objF;
                            }
                            List list4 = (List) objMo73636b;
                            subject = subject2;
                            list = list4;
                        } else {
                            subject = subject2;
                            list = null;
                        }
                        arrayList = new ArrayList();
                        if (z11) {
                            if (subject.getTrailer() == null) {
                            }
                            this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                            Unit unit2 = Unit.f75682a;
                            list2 = arrayList;
                            if (1 <= totalEpisode) {
                                i11 = 1;
                                while (true) {
                                    if (list != null) {
                                        it = list.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            shortTVFirstEp = (ShortTVItem) next;
                                        } while (((ShortTVItem) next).getEp() != i11);
                                        shortTVFirstEp = (ShortTVItem) next;
                                    } else {
                                        shortTVFirstEp = null;
                                    }
                                    if (i11 == 1) {
                                        c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                        if (shortTVFirstEp != null) {
                                            downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                        } else {
                                            downloadStatus2 = 0;
                                        }
                                        c26719e2.m104515g(downloadStatus2);
                                        if (c26719e2.m104510b() != 5) {
                                            shortTVFirstEp = subject.getShortTVFirstEp();
                                        }
                                        c26719e2.m104516h(shortTVFirstEp);
                                        list2.add(c26719e2);
                                    } else {
                                        c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                        if (shortTVFirstEp != null) {
                                            downloadStatus = shortTVFirstEp.getDownloadStatus();
                                        } else {
                                            downloadStatus = 0;
                                        }
                                        c26719e.m104515g(downloadStatus);
                                        if (c26719e.m104510b() != 5) {
                                            shortTVFirstEp = null;
                                        }
                                        c26719e.m104516h(shortTVFirstEp);
                                        list2.add(c26719e);
                                    }
                                    if (i11 != totalEpisode) {
                                        i11++;
                                    }
                                }
                            }
                            if (subject.getShortTVFavInfo() == null) {
                                shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                                if (shortTvFavoriteDaoM80298b0 != null) {
                                    String str8 = this.$subjectId;
                                    this.L$0 = list2;
                                    this.L$1 = subject;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.label = 11;
                                    objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str8, this);
                                    if (objMo79355a == objF) {
                                        return objF;
                                    }
                                    shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                                    if (shortTvFavoriteStateBean != null) {
                                        shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                                    }
                                }
                                subject.setShortTVFavInfo(shortTVFavInfo4);
                            }
                            arrayList = list2;
                            this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                        } else {
                            num = this.$dataSource;
                            if (num != null) {
                                return Unit.f75682a;
                            }
                            if (list != null) {
                            }
                            C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "无网，显示下载数据, " + (list != null ? Boxing.m97634d(list.size()) : null), false, 4, null);
                            if (list != null) {
                                str = this.$subjectId;
                                for (ShortTVItem shortTVItem : listI0) {
                                    C26719e c26719e4 = new C26719e(str, shortTVItem.getEp(), null, 0, 12, null);
                                    c26719e4.m104515g(shortTVItem.getDownloadStatus());
                                    c26719e4.m104516h(shortTVItem);
                                    arrayList.add(c26719e4);
                                }
                                Unit unit3 = Unit.f75682a;
                            }
                            this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(1));
                        }
                        this.this$0.m80381g1(false);
                        this.this$0.f61643q.mo14858q(arrayList);
                        return Unit.f75682a;
                    }
                    subject7 = this.$subject;
                    if (subject7 != null) {
                        unlockedEps = subject7.getUnlockedEps();
                    } else {
                        unlockedEps = null;
                    }
                    list3 = unlockedEps;
                    if (list3 != null || list3.isEmpty()) {
                        try {
                            C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,subjectId:" + this.$subjectId, false, 4, null);
                            InterfaceC27847a interfaceC27847a = this.this$0.f61624a;
                            String str9 = this.$subjectId;
                            this.L$0 = interfaceC25149n1;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.Z$0 = zM106330e;
                            this.label = 4;
                            objM108246d = InterfaceC27847a.a.m108246d(interfaceC27847a, str9, null, this, 2, null);
                            if (objM108246d == objF) {
                                return objF;
                            }
                            baseDto = (BaseDto) objM108246d;
                            z12 = zM106330e;
                        } catch (Exception unused) {
                            interfaceC25149n3 = interfaceC25149n1;
                            z12 = zM106330e;
                            interfaceC25149n1 = interfaceC25149n3;
                            baseDto = null;
                        }
                        if (baseDto != null) {
                            try {
                                subject8 = (Subject) baseDto.getData();
                            } catch (Exception e11) {
                                exc = e11;
                                z13 = z12;
                                interfaceC25149n4 = interfaceC25149n1;
                                exc.printStackTrace();
                                C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo, error:" + exc, false, 4, null);
                                interfaceC28213dM80392s3 = this.this$0.m80392s0();
                                if (interfaceC28213dM80392s3 != null) {
                                    String str10 = this.$subjectId;
                                    this.L$0 = interfaceC25149n4;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.Z$0 = z13;
                                    this.label = 6;
                                    objMo73644j3 = interfaceC28213dM80392s3.mo73644j(str10, this);
                                    if (objMo73644j3 == objF) {
                                        return objF;
                                    }
                                    z12 = z13;
                                    subject8 = (Subject) objMo73644j3;
                                    z11 = z12;
                                    subject2 = subject8;
                                    if (subject2 == null) {
                                        this.this$0.m80381g1(false);
                                        this.this$0.f61633g.mo14858q(null);
                                        this.this$0.f61643q.mo14858q(CollectionsKt.m97506l());
                                        return Unit.f75682a;
                                    }
                                    ShortTvViewModel shortTvViewModel3 = this.this$0;
                                    str2 = this.$subjectId;
                                    Result.Companion companion2 = Result.INSTANCE;
                                    C26866a.a.m104905r(C26866a.f81698a, "ShortTvViewModel", new String[]{"will loadAdUnlockedEps"}, false, 4, null);
                                    shortTvAdUnlockDaoM80294U = shortTvViewModel3.m80294U();
                                    if (shortTvAdUnlockDaoM80294U != null) {
                                        this.L$0 = subject2;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.Z$0 = z11;
                                        this.label = 8;
                                        objMo79340a = shortTvAdUnlockDaoM80294U.mo79340a(str2, this);
                                        if (objMo79340a == objF) {
                                            return objF;
                                        }
                                        c18845e = (C18845e) objMo79340a;
                                        if (c18845e != null) {
                                            unit = null;
                                        } else {
                                            unit = null;
                                        }
                                    } else {
                                        unit = null;
                                    }
                                    objM112707constructorimpl = Result.m112707constructorimpl(unit);
                                    thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                                    if (thM112710exceptionOrNullimpl != null) {
                                        C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                                    }
                                    if (!Intrinsics.m97797c(subject2, this.this$0.f61633g.m14847f())) {
                                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,set newSubject:" + this.$subjectId, false, 4, null);
                                        this.this$0.f61633g.mo14858q(subject2);
                                        C3187b0 c3187b1 = this.this$0.f61601D;
                                        shortTVFavInfo = subject2.getShortTVFavInfo();
                                        if (shortTVFavInfo != null) {
                                            boolM97631a = Boxing.m97631a(shortTVFavInfo.getHasFavorite());
                                        } else {
                                            boolM97631a = null;
                                        }
                                        c3187b1.mo14858q(boolM97631a);
                                    }
                                    totalEpisode = subject2.getTotalEpisode();
                                    interfaceC28213dM80392s0 = this.this$0.m80392s0();
                                    if (interfaceC28213dM80392s0 != null) {
                                        String str11 = this.$subjectId;
                                        this.L$0 = subject2;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.Z$0 = z11;
                                        this.I$0 = totalEpisode;
                                        this.label = 9;
                                        objMo73636b = interfaceC28213dM80392s0.mo73636b(str11, this);
                                        if (objMo73636b == objF) {
                                            return objF;
                                        }
                                        List list5 = (List) objMo73636b;
                                        subject = subject2;
                                        list = list5;
                                    } else {
                                        subject = subject2;
                                        list = null;
                                    }
                                    arrayList = new ArrayList();
                                    if (z11) {
                                        if (subject.getTrailer() == null) {
                                        }
                                        this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                                        Unit unit4 = Unit.f75682a;
                                        list2 = arrayList;
                                        if (1 <= totalEpisode) {
                                            i11 = 1;
                                            while (true) {
                                                if (list != null) {
                                                    it = list.iterator();
                                                    do {
                                                        if (it.hasNext()) {
                                                            next = it.next();
                                                        } else {
                                                            next = null;
                                                        }
                                                        shortTVFirstEp = (ShortTVItem) next;
                                                    } while (((ShortTVItem) next).getEp() != i11);
                                                    shortTVFirstEp = (ShortTVItem) next;
                                                } else {
                                                    shortTVFirstEp = null;
                                                }
                                                if (i11 == 1) {
                                                    c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                                    if (shortTVFirstEp != null) {
                                                        downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                                    } else {
                                                        downloadStatus2 = 0;
                                                    }
                                                    c26719e2.m104515g(downloadStatus2);
                                                    if (c26719e2.m104510b() != 5) {
                                                        shortTVFirstEp = subject.getShortTVFirstEp();
                                                    }
                                                    c26719e2.m104516h(shortTVFirstEp);
                                                    list2.add(c26719e2);
                                                } else {
                                                    c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                                    if (shortTVFirstEp != null) {
                                                        downloadStatus = shortTVFirstEp.getDownloadStatus();
                                                    } else {
                                                        downloadStatus = 0;
                                                    }
                                                    c26719e.m104515g(downloadStatus);
                                                    if (c26719e.m104510b() != 5) {
                                                        shortTVFirstEp = null;
                                                    }
                                                    c26719e.m104516h(shortTVFirstEp);
                                                    list2.add(c26719e);
                                                }
                                                if (i11 != totalEpisode) {
                                                    i11++;
                                                }
                                            }
                                        }
                                        if (subject.getShortTVFavInfo() == null) {
                                            shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                                            if (shortTvFavoriteDaoM80298b0 != null) {
                                                String str12 = this.$subjectId;
                                                this.L$0 = list2;
                                                this.L$1 = subject;
                                                this.L$2 = null;
                                                this.L$3 = null;
                                                this.label = 11;
                                                objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str12, this);
                                                if (objMo79355a == objF) {
                                                    return objF;
                                                }
                                                shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                                                if (shortTvFavoriteStateBean != null) {
                                                    shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                                                }
                                            }
                                            subject.setShortTVFavInfo(shortTVFavInfo4);
                                        }
                                        arrayList = list2;
                                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                                    } else {
                                        num = this.$dataSource;
                                        if (num != null) {
                                            return Unit.f75682a;
                                        }
                                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "无网，显示下载数据, " + (list != null ? Boxing.m97634d(list.size()) : null), false, 4, null);
                                        if (list != null) {
                                            str = this.$subjectId;
                                            while (r0.hasNext()) {
                                                C26719e c26719e5 = new C26719e(str, shortTVItem.getEp(), null, 0, 12, null);
                                                c26719e5.m104515g(shortTVItem.getDownloadStatus());
                                                c26719e5.m104516h(shortTVItem);
                                                arrayList.add(c26719e5);
                                            }
                                            Unit unit5 = Unit.f75682a;
                                        }
                                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(1));
                                    }
                                    this.this$0.m80381g1(false);
                                    this.this$0.f61643q.mo14858q(arrayList);
                                    return Unit.f75682a;
                                }
                                z12 = z13;
                            }
                        } else {
                            subject8 = null;
                        }
                        C23219b.f70761a.m92282e(subject8);
                        if (subject8 != null) {
                            subject9 = this.$subject;
                            if (subject9 != null) {
                                ops = subject9.getOps();
                            } else {
                                ops = null;
                            }
                            subject8.setOps(ops);
                            Unit unit6 = Unit.f75682a;
                        }
                        ShortTvViewModel shortTvViewModel4 = this.this$0;
                        String str13 = this.$subjectId;
                        if (subject8 != null) {
                            shortTVFavInfo3 = subject8.getShortTVFavInfo();
                        } else {
                            shortTVFavInfo3 = null;
                        }
                        shortTvViewModel4.m80327r1(str13, shortTVFavInfo3);
                        if (subject8 == null) {
                            interfaceC28213dM80392s2 = this.this$0.m80392s0();
                            if (interfaceC28213dM80392s2 != null) {
                                String str14 = this.$subjectId;
                                this.L$0 = interfaceC25149n1;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.Z$0 = z12;
                                this.label = 5;
                                objMo73644j2 = interfaceC28213dM80392s2.mo73644j(str14, this);
                                if (objMo73644j2 == objF) {
                                    return objF;
                                }
                                z14 = z12;
                                interfaceC25149n4 = interfaceC25149n1;
                                subject8 = (Subject) objMo73644j2;
                                z12 = z14;
                            } else {
                                subject8 = null;
                            }
                        }
                        z11 = z12;
                        subject2 = subject8;
                        if (subject2 == null) {
                            this.this$0.m80381g1(false);
                            this.this$0.f61633g.mo14858q(null);
                            this.this$0.f61643q.mo14858q(CollectionsKt.m97506l());
                            return Unit.f75682a;
                        }
                        ShortTvViewModel shortTvViewModel5 = this.this$0;
                        str2 = this.$subjectId;
                        Result.Companion companion3 = Result.INSTANCE;
                        C26866a.a.m104905r(C26866a.f81698a, "ShortTvViewModel", new String[]{"will loadAdUnlockedEps"}, false, 4, null);
                        shortTvAdUnlockDaoM80294U = shortTvViewModel5.m80294U();
                        if (shortTvAdUnlockDaoM80294U != null) {
                            this.L$0 = subject2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.Z$0 = z11;
                            this.label = 8;
                            objMo79340a = shortTvAdUnlockDaoM80294U.mo79340a(str2, this);
                            if (objMo79340a == objF) {
                                return objF;
                            }
                            c18845e = (C18845e) objMo79340a;
                            if (c18845e != null || (setM79371c = c18845e.m79371c()) == null) {
                                unit = null;
                            } else {
                                C26866a.a.m104905r(C26866a.f81698a, "ShortTvViewModel", new String[]{"loadAdUnlockedEps result=" + setM79371c}, false, 4, null);
                                if (!setM79371c.isEmpty()) {
                                    subject2.getAdUnlockedEps().addAll(setM79371c);
                                }
                                unit = Unit.f75682a;
                            }
                        } else {
                            unit = null;
                        }
                        objM112707constructorimpl = Result.m112707constructorimpl(unit);
                        thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                        if (thM112710exceptionOrNullimpl != null) {
                            C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                        }
                        if (!Intrinsics.m97797c(subject2, this.this$0.f61633g.m14847f())) {
                            C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,set newSubject:" + this.$subjectId, false, 4, null);
                            this.this$0.f61633g.mo14858q(subject2);
                            C3187b0 c3187b2 = this.this$0.f61601D;
                            shortTVFavInfo = subject2.getShortTVFavInfo();
                            if (shortTVFavInfo != null) {
                                boolM97631a = Boxing.m97631a(shortTVFavInfo.getHasFavorite());
                            } else {
                                boolM97631a = null;
                            }
                            c3187b2.mo14858q(boolM97631a);
                        }
                        totalEpisode = subject2.getTotalEpisode();
                        interfaceC28213dM80392s0 = this.this$0.m80392s0();
                        if (interfaceC28213dM80392s0 != null) {
                            String str15 = this.$subjectId;
                            this.L$0 = subject2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.Z$0 = z11;
                            this.I$0 = totalEpisode;
                            this.label = 9;
                            objMo73636b = interfaceC28213dM80392s0.mo73636b(str15, this);
                            if (objMo73636b == objF) {
                                return objF;
                            }
                            List list6 = (List) objMo73636b;
                            subject = subject2;
                            list = list6;
                        } else {
                            subject = subject2;
                            list = null;
                        }
                        arrayList = new ArrayList();
                        if (z11) {
                            if (subject.getTrailer() == null && subject.getShortTVFirstEp() != null && C27124c.f82233a.m105540b().m105522b()) {
                                this.this$0.f61609L.mo14858q(Boxing.m97631a(true));
                                ShortTvViewModel shortTvViewModel6 = this.this$0;
                                String str16 = this.$subjectId;
                                this.L$0 = subject;
                                this.L$1 = list;
                                this.L$2 = arrayList;
                                this.L$3 = null;
                                this.I$0 = totalEpisode;
                                this.label = 10;
                                objM80288I0 = shortTvViewModel6.m80288I0(str16, subject, this);
                                if (objM80288I0 == objF) {
                                    return objF;
                                }
                                Boxing.m97631a(arrayList.add((C26719e) objM80288I0));
                            } else {
                                this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                                Unit unit7 = Unit.f75682a;
                            }
                            list2 = arrayList;
                            if (1 <= totalEpisode) {
                                i11 = 1;
                                while (true) {
                                    if (list != null) {
                                        it = list.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            shortTVFirstEp = (ShortTVItem) next;
                                        } while (((ShortTVItem) next).getEp() != i11);
                                        shortTVFirstEp = (ShortTVItem) next;
                                    } else {
                                        shortTVFirstEp = null;
                                    }
                                    if (i11 == 1) {
                                        c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                        if (shortTVFirstEp != null) {
                                            downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                        } else {
                                            downloadStatus2 = 0;
                                        }
                                        c26719e2.m104515g(downloadStatus2);
                                        if (c26719e2.m104510b() != 5) {
                                            shortTVFirstEp = subject.getShortTVFirstEp();
                                        }
                                        c26719e2.m104516h(shortTVFirstEp);
                                        list2.add(c26719e2);
                                    } else {
                                        c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                        if (shortTVFirstEp != null) {
                                            downloadStatus = shortTVFirstEp.getDownloadStatus();
                                        } else {
                                            downloadStatus = 0;
                                        }
                                        c26719e.m104515g(downloadStatus);
                                        if (c26719e.m104510b() != 5) {
                                            shortTVFirstEp = null;
                                        }
                                        c26719e.m104516h(shortTVFirstEp);
                                        list2.add(c26719e);
                                    }
                                    if (i11 != totalEpisode) {
                                        i11++;
                                    }
                                }
                            }
                            if (subject.getShortTVFavInfo() == null) {
                                shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                                if (shortTvFavoriteDaoM80298b0 != null) {
                                    String str17 = this.$subjectId;
                                    this.L$0 = list2;
                                    this.L$1 = subject;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.label = 11;
                                    objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str17, this);
                                    if (objMo79355a == objF) {
                                        return objF;
                                    }
                                    shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                                    if (shortTvFavoriteStateBean != null) {
                                        shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                                    }
                                }
                                subject.setShortTVFavInfo(shortTVFavInfo4);
                            }
                            arrayList = list2;
                            this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                        } else {
                            num = this.$dataSource;
                            if (num != null && num.intValue() == 1) {
                                return Unit.f75682a;
                            }
                            if (list != null) {
                            }
                            C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "无网，显示下载数据, " + (list != null ? Boxing.m97634d(list.size()) : null), false, 4, null);
                            if (list != null && (listI0 = CollectionsKt.m97331I0(list, new Comparator() { // from class: com.transsion.shorttv.viewmodel.ShortTvViewModel$getShortTvEpisodes$1$invokeSuspend$$inlined$sortedBy$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t11, T t12) {
                                    return ComparisonsKt.m97603d(Integer.valueOf(((ShortTVItem) t11).getEp()), Integer.valueOf(((ShortTVItem) t12).getEp()));
                                }
                            })) != null) {
                                str = this.$subjectId;
                                while (r0.hasNext()) {
                                    C26719e c26719e6 = new C26719e(str, shortTVItem.getEp(), null, 0, 12, null);
                                    c26719e6.m104515g(shortTVItem.getDownloadStatus());
                                    c26719e6.m104516h(shortTVItem);
                                    arrayList.add(c26719e6);
                                }
                                Unit unit8 = Unit.f75682a;
                            }
                            this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(1));
                        }
                        this.this$0.m80381g1(false);
                        this.this$0.f61643q.mo14858q(arrayList);
                        return Unit.f75682a;
                    }
                    subject6 = this.$subject;
                    subject2 = subject6;
                    z11 = zM106330e;
                    if (subject2 == null) {
                        this.this$0.m80381g1(false);
                        this.this$0.f61633g.mo14858q(null);
                        this.this$0.f61643q.mo14858q(CollectionsKt.m97506l());
                        return Unit.f75682a;
                    }
                    ShortTvViewModel shortTvViewModel7 = this.this$0;
                    str2 = this.$subjectId;
                    Result.Companion companion4 = Result.INSTANCE;
                    C26866a.a.m104905r(C26866a.f81698a, "ShortTvViewModel", new String[]{"will loadAdUnlockedEps"}, false, 4, null);
                    shortTvAdUnlockDaoM80294U = shortTvViewModel7.m80294U();
                    if (shortTvAdUnlockDaoM80294U != null) {
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.label = 8;
                        objMo79340a = shortTvAdUnlockDaoM80294U.mo79340a(str2, this);
                        if (objMo79340a == objF) {
                            return objF;
                        }
                        c18845e = (C18845e) objMo79340a;
                        if (c18845e != null) {
                            unit = null;
                        } else {
                            unit = null;
                        }
                    } else {
                        unit = null;
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(unit);
                    thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                    if (thM112710exceptionOrNullimpl != null) {
                        C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                    }
                    if (!Intrinsics.m97797c(subject2, this.this$0.f61633g.m14847f())) {
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,set newSubject:" + this.$subjectId, false, 4, null);
                        this.this$0.f61633g.mo14858q(subject2);
                        C3187b0 c3187b3 = this.this$0.f61601D;
                        shortTVFavInfo = subject2.getShortTVFavInfo();
                        if (shortTVFavInfo != null) {
                            boolM97631a = Boxing.m97631a(shortTVFavInfo.getHasFavorite());
                        } else {
                            boolM97631a = null;
                        }
                        c3187b3.mo14858q(boolM97631a);
                    }
                    totalEpisode = subject2.getTotalEpisode();
                    interfaceC28213dM80392s0 = this.this$0.m80392s0();
                    if (interfaceC28213dM80392s0 != null) {
                        String str18 = this.$subjectId;
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.I$0 = totalEpisode;
                        this.label = 9;
                        objMo73636b = interfaceC28213dM80392s0.mo73636b(str18, this);
                        if (objMo73636b == objF) {
                            return objF;
                        }
                        List list7 = (List) objMo73636b;
                        subject = subject2;
                        list = list7;
                    } else {
                        subject = subject2;
                        list = null;
                    }
                    arrayList = new ArrayList();
                    if (z11) {
                        if (subject.getTrailer() == null) {
                        }
                        this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                        Unit unit9 = Unit.f75682a;
                        list2 = arrayList;
                        if (1 <= totalEpisode) {
                            i11 = 1;
                            while (true) {
                                if (list != null) {
                                    it = list.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        shortTVFirstEp = (ShortTVItem) next;
                                    } while (((ShortTVItem) next).getEp() != i11);
                                    shortTVFirstEp = (ShortTVItem) next;
                                } else {
                                    shortTVFirstEp = null;
                                }
                                if (i11 == 1) {
                                    c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus2 = 0;
                                    }
                                    c26719e2.m104515g(downloadStatus2);
                                    if (c26719e2.m104510b() != 5) {
                                        shortTVFirstEp = subject.getShortTVFirstEp();
                                    }
                                    c26719e2.m104516h(shortTVFirstEp);
                                    list2.add(c26719e2);
                                } else {
                                    c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus = 0;
                                    }
                                    c26719e.m104515g(downloadStatus);
                                    if (c26719e.m104510b() != 5) {
                                        shortTVFirstEp = null;
                                    }
                                    c26719e.m104516h(shortTVFirstEp);
                                    list2.add(c26719e);
                                }
                                if (i11 != totalEpisode) {
                                    i11++;
                                }
                            }
                        }
                        if (subject.getShortTVFavInfo() == null) {
                            shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                            if (shortTvFavoriteDaoM80298b0 != null) {
                                String str19 = this.$subjectId;
                                this.L$0 = list2;
                                this.L$1 = subject;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 11;
                                objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str19, this);
                                if (objMo79355a == objF) {
                                    return objF;
                                }
                                shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                                if (shortTvFavoriteStateBean != null) {
                                    shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                                }
                            }
                            subject.setShortTVFavInfo(shortTVFavInfo4);
                        }
                        arrayList = list2;
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                    } else {
                        num = this.$dataSource;
                        if (num != null) {
                            return Unit.f75682a;
                        }
                        if (list != null) {
                        }
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "无网，显示下载数据, " + (list != null ? Boxing.m97634d(list.size()) : null), false, 4, null);
                        if (list != null) {
                            str = this.$subjectId;
                            while (r0.hasNext()) {
                                C26719e c26719e7 = new C26719e(str, shortTVItem.getEp(), null, 0, 12, null);
                                c26719e7.m104515g(shortTVItem.getDownloadStatus());
                                c26719e7.m104516h(shortTVItem);
                                arrayList.add(c26719e7);
                            }
                            Unit unit10 = Unit.f75682a;
                        }
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(1));
                    }
                    this.this$0.m80381g1(false);
                    this.this$0.f61643q.mo14858q(arrayList);
                    return Unit.f75682a;
                case 1:
                    zM106330e = this.Z$0;
                    interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
                    ResultKt.m97107b(obj);
                    objMo73653c = obj;
                    interfaceC25149n1 = interfaceC25149n0;
                    shortTvInnerPlayBean = (ShortTvInnerPlayBean) objMo73653c;
                    if (shortTvInnerPlayBean != null) {
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "获取到历史：" + shortTvInnerPlayBean, false, 4, null);
                        this.this$0.f61607J.mo14858q(shortTvInnerPlayBean);
                    }
                    iIntValue = -1;
                    if (Intrinsics.m97797c(this.$currentSubjectId, this.$subjectId)) {
                        iIntValue = num2.intValue();
                    }
                    int i13 = iIntValue;
                    iM80357S = this.this$0.m80357S(i13, shortTvInnerPlayBean, this.$subject, this.$ep, this.$isHistoryFirst);
                    aVar = C26866a.f81698a;
                    C26866a.a.m104898f(aVar, "ShortTvViewModel", "lastEp: " + i13 + ", historyItem: " + shortTvInnerPlayBean + ", firstSelectEp:" + iM80357S, false, 4, null);
                    arrayList2 = new ArrayList();
                    subject3 = this.$subject;
                    if (subject3 != null) {
                        trailer = subject3.getTrailer();
                    } else {
                        trailer = null;
                    }
                    if (trailer != null) {
                        this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                        C26866a.a.m104898f(aVar, "ShortTvViewModel", "不存在预告片", false, 4, null);
                        subject4 = this.$subject;
                        if (subject4 != null) {
                            shortTVFirstEp2 = subject4.getShortTVFirstEp();
                        } else {
                            shortTVFirstEp2 = null;
                        }
                        if (shortTVFirstEp2 != null) {
                            if (shortTVFirstEp2.getEp() == iM80357S) {
                                C26866a.a.m104898f(aVar, "ShortTvViewModel", "需要预加载第一集", false, 4, null);
                                c26719e3 = new C26719e(this.$subjectId, shortTVFirstEp2.getEp(), shortTVFirstEp2, 0, 8, null);
                                if (this.$subject.getShortTVFavInfo() == null) {
                                    subject5 = this.$subject;
                                    shortTvFavoriteDaoM80298b1 = this.this$0.m80298b0();
                                    if (shortTvFavoriteDaoM80298b1 != null) {
                                        String str20 = this.$subjectId;
                                        this.L$0 = interfaceC25149n1;
                                        this.L$1 = arrayList2;
                                        this.L$2 = c26719e3;
                                        this.L$3 = subject5;
                                        this.Z$0 = zM106330e;
                                        this.label = 3;
                                        objMo79355a2 = shortTvFavoriteDaoM80298b1.mo79355a(str20, this);
                                        if (objMo79355a2 == objF) {
                                            return objF;
                                        }
                                        shortTvFavoriteStateBean2 = (ShortTvFavoriteStateBean) objMo79355a2;
                                        if (shortTvFavoriteStateBean2 != null) {
                                            shortTVFavInfo2 = new ShortTVFavInfo(shortTvFavoriteStateBean2.getFavoriteNum(), shortTvFavoriteStateBean2.getHasFavorite(), shortTvFavoriteStateBean2.getFavoriteTime());
                                        } else {
                                            shortTVFavInfo2 = null;
                                        }
                                    } else {
                                        shortTVFavInfo2 = null;
                                    }
                                    subject5.setShortTVFavInfo(shortTVFavInfo2);
                                }
                                arrayList2.add(c26719e3);
                                this.this$0.m80381g1(false);
                                this.this$0.f61633g.mo14858q(this.$subject);
                                this.this$0.f61643q.mo14858q(arrayList2);
                                this.this$0.m80397w0(this.$subjectId, 2);
                            } else {
                                C26866a.a.m104898f(aVar, "ShortTvViewModel", "不需要预加载第一集", false, 4, null);
                            }
                        }
                    } else {
                        this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                        C26866a.a.m104898f(aVar, "ShortTvViewModel", "不存在预告片", false, 4, null);
                        subject4 = this.$subject;
                        if (subject4 != null) {
                            shortTVFirstEp2 = subject4.getShortTVFirstEp();
                        } else {
                            shortTVFirstEp2 = null;
                        }
                        if (shortTVFirstEp2 != null) {
                            if (shortTVFirstEp2.getEp() == iM80357S) {
                                C26866a.a.m104898f(aVar, "ShortTvViewModel", "需要预加载第一集", false, 4, null);
                                c26719e3 = new C26719e(this.$subjectId, shortTVFirstEp2.getEp(), shortTVFirstEp2, 0, 8, null);
                                if (this.$subject.getShortTVFavInfo() == null) {
                                    subject5 = this.$subject;
                                    shortTvFavoriteDaoM80298b1 = this.this$0.m80298b0();
                                    if (shortTvFavoriteDaoM80298b1 != null) {
                                        String str21 = this.$subjectId;
                                        this.L$0 = interfaceC25149n1;
                                        this.L$1 = arrayList2;
                                        this.L$2 = c26719e3;
                                        this.L$3 = subject5;
                                        this.Z$0 = zM106330e;
                                        this.label = 3;
                                        objMo79355a2 = shortTvFavoriteDaoM80298b1.mo79355a(str21, this);
                                        if (objMo79355a2 == objF) {
                                            return objF;
                                        }
                                        shortTvFavoriteStateBean2 = (ShortTvFavoriteStateBean) objMo79355a2;
                                        if (shortTvFavoriteStateBean2 != null) {
                                            shortTVFavInfo2 = new ShortTVFavInfo(shortTvFavoriteStateBean2.getFavoriteNum(), shortTvFavoriteStateBean2.getHasFavorite(), shortTvFavoriteStateBean2.getFavoriteTime());
                                        } else {
                                            shortTVFavInfo2 = null;
                                        }
                                    } else {
                                        shortTVFavInfo2 = null;
                                    }
                                    subject5.setShortTVFavInfo(shortTVFavInfo2);
                                }
                                arrayList2.add(c26719e3);
                                this.this$0.m80381g1(false);
                                this.this$0.f61633g.mo14858q(this.$subject);
                                this.this$0.f61643q.mo14858q(arrayList2);
                                this.this$0.m80397w0(this.$subjectId, 2);
                            } else {
                                C26866a.a.m104898f(aVar, "ShortTvViewModel", "不需要预加载第一集", false, 4, null);
                            }
                        }
                    }
                    this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(0));
                    if (zM106330e) {
                        subject6 = this.$subject;
                        if (subject6 != null) {
                            interfaceC28213dM80392s1 = this.this$0.m80392s0();
                            if (interfaceC28213dM80392s1 != null) {
                                String str22 = this.$subjectId;
                                this.L$0 = interfaceC25149n1;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.Z$0 = zM106330e;
                                this.label = 7;
                                objMo73644j = interfaceC28213dM80392s1.mo73644j(str22, this);
                                if (objMo73644j == objF) {
                                    return objF;
                                }
                                subject6 = (Subject) objMo73644j;
                            } else {
                                z11 = zM106330e;
                                subject2 = null;
                            }
                        }
                        if (subject2 == null) {
                            this.this$0.m80381g1(false);
                            this.this$0.f61633g.mo14858q(null);
                            this.this$0.f61643q.mo14858q(CollectionsKt.m97506l());
                            return Unit.f75682a;
                        }
                        ShortTvViewModel shortTvViewModel8 = this.this$0;
                        str2 = this.$subjectId;
                        Result.Companion companion5 = Result.INSTANCE;
                        C26866a.a.m104905r(C26866a.f81698a, "ShortTvViewModel", new String[]{"will loadAdUnlockedEps"}, false, 4, null);
                        shortTvAdUnlockDaoM80294U = shortTvViewModel8.m80294U();
                        if (shortTvAdUnlockDaoM80294U != null) {
                            this.L$0 = subject2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.Z$0 = z11;
                            this.label = 8;
                            objMo79340a = shortTvAdUnlockDaoM80294U.mo79340a(str2, this);
                            if (objMo79340a == objF) {
                                return objF;
                            }
                            c18845e = (C18845e) objMo79340a;
                            if (c18845e != null) {
                                unit = null;
                            } else {
                                unit = null;
                            }
                        } else {
                            unit = null;
                        }
                        objM112707constructorimpl = Result.m112707constructorimpl(unit);
                        thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                        if (thM112710exceptionOrNullimpl != null) {
                            C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                        }
                        if (!Intrinsics.m97797c(subject2, this.this$0.f61633g.m14847f())) {
                            C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,set newSubject:" + this.$subjectId, false, 4, null);
                            this.this$0.f61633g.mo14858q(subject2);
                            C3187b0 c3187b4 = this.this$0.f61601D;
                            shortTVFavInfo = subject2.getShortTVFavInfo();
                            if (shortTVFavInfo != null) {
                                boolM97631a = Boxing.m97631a(shortTVFavInfo.getHasFavorite());
                            } else {
                                boolM97631a = null;
                            }
                            c3187b4.mo14858q(boolM97631a);
                        }
                        totalEpisode = subject2.getTotalEpisode();
                        interfaceC28213dM80392s0 = this.this$0.m80392s0();
                        if (interfaceC28213dM80392s0 != null) {
                            String str110 = this.$subjectId;
                            this.L$0 = subject2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.Z$0 = z11;
                            this.I$0 = totalEpisode;
                            this.label = 9;
                            objMo73636b = interfaceC28213dM80392s0.mo73636b(str110, this);
                            if (objMo73636b == objF) {
                                return objF;
                            }
                            List list8 = (List) objMo73636b;
                            subject = subject2;
                            list = list8;
                        } else {
                            subject = subject2;
                            list = null;
                        }
                        arrayList = new ArrayList();
                        if (z11) {
                            if (subject.getTrailer() == null) {
                            }
                            this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                            Unit unit11 = Unit.f75682a;
                            list2 = arrayList;
                            if (1 <= totalEpisode) {
                                i11 = 1;
                                while (true) {
                                    if (list != null) {
                                        it = list.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            shortTVFirstEp = (ShortTVItem) next;
                                        } while (((ShortTVItem) next).getEp() != i11);
                                        shortTVFirstEp = (ShortTVItem) next;
                                    } else {
                                        shortTVFirstEp = null;
                                    }
                                    if (i11 == 1) {
                                        c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                        if (shortTVFirstEp != null) {
                                            downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                        } else {
                                            downloadStatus2 = 0;
                                        }
                                        c26719e2.m104515g(downloadStatus2);
                                        if (c26719e2.m104510b() != 5) {
                                            shortTVFirstEp = subject.getShortTVFirstEp();
                                        }
                                        c26719e2.m104516h(shortTVFirstEp);
                                        list2.add(c26719e2);
                                    } else {
                                        c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                        if (shortTVFirstEp != null) {
                                            downloadStatus = shortTVFirstEp.getDownloadStatus();
                                        } else {
                                            downloadStatus = 0;
                                        }
                                        c26719e.m104515g(downloadStatus);
                                        if (c26719e.m104510b() != 5) {
                                            shortTVFirstEp = null;
                                        }
                                        c26719e.m104516h(shortTVFirstEp);
                                        list2.add(c26719e);
                                    }
                                    if (i11 != totalEpisode) {
                                        i11++;
                                    }
                                }
                            }
                            if (subject.getShortTVFavInfo() == null) {
                                shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                                if (shortTvFavoriteDaoM80298b0 != null) {
                                    String str111 = this.$subjectId;
                                    this.L$0 = list2;
                                    this.L$1 = subject;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.label = 11;
                                    objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str111, this);
                                    if (objMo79355a == objF) {
                                        return objF;
                                    }
                                    shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                                    if (shortTvFavoriteStateBean != null) {
                                        shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                                    }
                                }
                                subject.setShortTVFavInfo(shortTVFavInfo4);
                            }
                            arrayList = list2;
                            this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                            break;
                        } else {
                            num = this.$dataSource;
                            if (num != null) {
                                return Unit.f75682a;
                            }
                            if (list != null) {
                            }
                            C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "无网，显示下载数据, " + (list != null ? Boxing.m97634d(list.size()) : null), false, 4, null);
                            if (list != null) {
                                str = this.$subjectId;
                                while (r0.hasNext()) {
                                    C26719e c26719e8 = new C26719e(str, shortTVItem.getEp(), null, 0, 12, null);
                                    c26719e8.m104515g(shortTVItem.getDownloadStatus());
                                    c26719e8.m104516h(shortTVItem);
                                    arrayList.add(c26719e8);
                                }
                                Unit unit12 = Unit.f75682a;
                            }
                            this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(1));
                        }
                        this.this$0.m80381g1(false);
                        this.this$0.f61643q.mo14858q(arrayList);
                        return Unit.f75682a;
                    }
                    subject7 = this.$subject;
                    if (subject7 != null) {
                        unlockedEps = subject7.getUnlockedEps();
                    } else {
                        unlockedEps = null;
                    }
                    list3 = unlockedEps;
                    if (list3 != null) {
                        break;
                    }
                    C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,subjectId:" + this.$subjectId, false, 4, null);
                    InterfaceC27847a interfaceC27847a2 = this.this$0.f61624a;
                    String str23 = this.$subjectId;
                    this.L$0 = interfaceC25149n1;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.Z$0 = zM106330e;
                    this.label = 4;
                    objM108246d = InterfaceC27847a.a.m108246d(interfaceC27847a2, str23, null, this, 2, null);
                    if (objM108246d == objF) {
                        return objF;
                    }
                    baseDto = (BaseDto) objM108246d;
                    z12 = zM106330e;
                    if (baseDto != null) {
                        subject8 = (Subject) baseDto.getData();
                    } else {
                        subject8 = null;
                    }
                    C23219b.f70761a.m92282e(subject8);
                    if (subject8 != null) {
                        subject9 = this.$subject;
                        if (subject9 != null) {
                            ops = subject9.getOps();
                        } else {
                            ops = null;
                        }
                        subject8.setOps(ops);
                        Unit unit13 = Unit.f75682a;
                    }
                    ShortTvViewModel shortTvViewModel9 = this.this$0;
                    String str112 = this.$subjectId;
                    if (subject8 != null) {
                        shortTVFavInfo3 = subject8.getShortTVFavInfo();
                    } else {
                        shortTVFavInfo3 = null;
                    }
                    shortTvViewModel9.m80327r1(str112, shortTVFavInfo3);
                    if (subject8 == null) {
                        interfaceC28213dM80392s2 = this.this$0.m80392s0();
                        if (interfaceC28213dM80392s2 != null) {
                            String str113 = this.$subjectId;
                            this.L$0 = interfaceC25149n1;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.Z$0 = z12;
                            this.label = 5;
                            objMo73644j2 = interfaceC28213dM80392s2.mo73644j(str113, this);
                            if (objMo73644j2 == objF) {
                                return objF;
                            }
                            z14 = z12;
                            interfaceC25149n4 = interfaceC25149n1;
                            subject8 = (Subject) objMo73644j2;
                            z12 = z14;
                        } else {
                            subject8 = null;
                        }
                    }
                    z11 = z12;
                    subject2 = subject8;
                    if (subject2 == null) {
                        this.this$0.m80381g1(false);
                        this.this$0.f61633g.mo14858q(null);
                        this.this$0.f61643q.mo14858q(CollectionsKt.m97506l());
                        return Unit.f75682a;
                    }
                    ShortTvViewModel shortTvViewModel10 = this.this$0;
                    str2 = this.$subjectId;
                    Result.Companion companion6 = Result.INSTANCE;
                    C26866a.a.m104905r(C26866a.f81698a, "ShortTvViewModel", new String[]{"will loadAdUnlockedEps"}, false, 4, null);
                    shortTvAdUnlockDaoM80294U = shortTvViewModel10.m80294U();
                    if (shortTvAdUnlockDaoM80294U != null) {
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.label = 8;
                        objMo79340a = shortTvAdUnlockDaoM80294U.mo79340a(str2, this);
                        if (objMo79340a == objF) {
                            return objF;
                        }
                        c18845e = (C18845e) objMo79340a;
                        if (c18845e != null) {
                            unit = null;
                        } else {
                            unit = null;
                        }
                    } else {
                        unit = null;
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(unit);
                    thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                    if (thM112710exceptionOrNullimpl != null) {
                        C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                    }
                    if (!Intrinsics.m97797c(subject2, this.this$0.f61633g.m14847f())) {
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,set newSubject:" + this.$subjectId, false, 4, null);
                        this.this$0.f61633g.mo14858q(subject2);
                        C3187b0 c3187b5 = this.this$0.f61601D;
                        shortTVFavInfo = subject2.getShortTVFavInfo();
                        if (shortTVFavInfo != null) {
                            boolM97631a = Boxing.m97631a(shortTVFavInfo.getHasFavorite());
                        } else {
                            boolM97631a = null;
                        }
                        c3187b5.mo14858q(boolM97631a);
                    }
                    totalEpisode = subject2.getTotalEpisode();
                    interfaceC28213dM80392s0 = this.this$0.m80392s0();
                    if (interfaceC28213dM80392s0 != null) {
                        String str114 = this.$subjectId;
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.I$0 = totalEpisode;
                        this.label = 9;
                        objMo73636b = interfaceC28213dM80392s0.mo73636b(str114, this);
                        if (objMo73636b == objF) {
                            return objF;
                        }
                        List list9 = (List) objMo73636b;
                        subject = subject2;
                        list = list9;
                    } else {
                        subject = subject2;
                        list = null;
                    }
                    arrayList = new ArrayList();
                    if (z11) {
                        if (subject.getTrailer() == null) {
                        }
                        this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                        Unit unit14 = Unit.f75682a;
                        list2 = arrayList;
                        if (1 <= totalEpisode) {
                            i11 = 1;
                            while (true) {
                                if (list != null) {
                                    it = list.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        shortTVFirstEp = (ShortTVItem) next;
                                    } while (((ShortTVItem) next).getEp() != i11);
                                    shortTVFirstEp = (ShortTVItem) next;
                                } else {
                                    shortTVFirstEp = null;
                                }
                                if (i11 == 1) {
                                    c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus2 = 0;
                                    }
                                    c26719e2.m104515g(downloadStatus2);
                                    if (c26719e2.m104510b() != 5) {
                                        shortTVFirstEp = subject.getShortTVFirstEp();
                                    }
                                    c26719e2.m104516h(shortTVFirstEp);
                                    list2.add(c26719e2);
                                } else {
                                    c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus = 0;
                                    }
                                    c26719e.m104515g(downloadStatus);
                                    if (c26719e.m104510b() != 5) {
                                        shortTVFirstEp = null;
                                    }
                                    c26719e.m104516h(shortTVFirstEp);
                                    list2.add(c26719e);
                                }
                                if (i11 != totalEpisode) {
                                    i11++;
                                }
                            }
                        }
                        if (subject.getShortTVFavInfo() == null) {
                            shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                            if (shortTvFavoriteDaoM80298b0 != null) {
                                String str115 = this.$subjectId;
                                this.L$0 = list2;
                                this.L$1 = subject;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 11;
                                objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str115, this);
                                if (objMo79355a == objF) {
                                    return objF;
                                }
                                shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                                if (shortTvFavoriteStateBean != null) {
                                    shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                                }
                            }
                            subject.setShortTVFavInfo(shortTVFavInfo4);
                        }
                        arrayList = list2;
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                        break;
                    } else {
                        num = this.$dataSource;
                        if (num != null) {
                            return Unit.f75682a;
                        }
                        if (list != null) {
                        }
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "无网，显示下载数据, " + (list != null ? Boxing.m97634d(list.size()) : null), false, 4, null);
                        if (list != null) {
                            str = this.$subjectId;
                            while (r0.hasNext()) {
                                C26719e c26719e9 = new C26719e(str, shortTVItem.getEp(), null, 0, 12, null);
                                c26719e9.m104515g(shortTVItem.getDownloadStatus());
                                c26719e9.m104516h(shortTVItem);
                                arrayList.add(c26719e9);
                            }
                            Unit unit15 = Unit.f75682a;
                        }
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(1));
                    }
                    this.this$0.m80381g1(false);
                    this.this$0.f61643q.mo14858q(arrayList);
                    return Unit.f75682a;
                    subject2 = subject6;
                    z11 = zM106330e;
                    if (subject2 == null) {
                        this.this$0.m80381g1(false);
                        this.this$0.f61633g.mo14858q(null);
                        this.this$0.f61643q.mo14858q(CollectionsKt.m97506l());
                        return Unit.f75682a;
                    }
                    ShortTvViewModel shortTvViewModel11 = this.this$0;
                    str2 = this.$subjectId;
                    Result.Companion companion7 = Result.INSTANCE;
                    C26866a.a.m104905r(C26866a.f81698a, "ShortTvViewModel", new String[]{"will loadAdUnlockedEps"}, false, 4, null);
                    shortTvAdUnlockDaoM80294U = shortTvViewModel11.m80294U();
                    if (shortTvAdUnlockDaoM80294U != null) {
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.label = 8;
                        objMo79340a = shortTvAdUnlockDaoM80294U.mo79340a(str2, this);
                        if (objMo79340a == objF) {
                            return objF;
                        }
                        c18845e = (C18845e) objMo79340a;
                        if (c18845e != null) {
                            unit = null;
                        } else {
                            unit = null;
                        }
                    } else {
                        unit = null;
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(unit);
                    thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                    if (thM112710exceptionOrNullimpl != null) {
                        C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                    }
                    if (!Intrinsics.m97797c(subject2, this.this$0.f61633g.m14847f())) {
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,set newSubject:" + this.$subjectId, false, 4, null);
                        this.this$0.f61633g.mo14858q(subject2);
                        C3187b0 c3187b6 = this.this$0.f61601D;
                        shortTVFavInfo = subject2.getShortTVFavInfo();
                        if (shortTVFavInfo != null) {
                            boolM97631a = Boxing.m97631a(shortTVFavInfo.getHasFavorite());
                        } else {
                            boolM97631a = null;
                        }
                        c3187b6.mo14858q(boolM97631a);
                    }
                    totalEpisode = subject2.getTotalEpisode();
                    interfaceC28213dM80392s0 = this.this$0.m80392s0();
                    if (interfaceC28213dM80392s0 != null) {
                        String str116 = this.$subjectId;
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.I$0 = totalEpisode;
                        this.label = 9;
                        objMo73636b = interfaceC28213dM80392s0.mo73636b(str116, this);
                        if (objMo73636b == objF) {
                            return objF;
                        }
                        List list10 = (List) objMo73636b;
                        subject = subject2;
                        list = list10;
                    } else {
                        subject = subject2;
                        list = null;
                    }
                    arrayList = new ArrayList();
                    if (z11) {
                        if (subject.getTrailer() == null) {
                        }
                        this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                        Unit unit16 = Unit.f75682a;
                        list2 = arrayList;
                        if (1 <= totalEpisode) {
                            i11 = 1;
                            while (true) {
                                if (list != null) {
                                    it = list.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        shortTVFirstEp = (ShortTVItem) next;
                                    } while (((ShortTVItem) next).getEp() != i11);
                                    shortTVFirstEp = (ShortTVItem) next;
                                } else {
                                    shortTVFirstEp = null;
                                }
                                if (i11 == 1) {
                                    c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus2 = 0;
                                    }
                                    c26719e2.m104515g(downloadStatus2);
                                    if (c26719e2.m104510b() != 5) {
                                        shortTVFirstEp = subject.getShortTVFirstEp();
                                    }
                                    c26719e2.m104516h(shortTVFirstEp);
                                    list2.add(c26719e2);
                                } else {
                                    c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus = 0;
                                    }
                                    c26719e.m104515g(downloadStatus);
                                    if (c26719e.m104510b() != 5) {
                                        shortTVFirstEp = null;
                                    }
                                    c26719e.m104516h(shortTVFirstEp);
                                    list2.add(c26719e);
                                }
                                if (i11 != totalEpisode) {
                                    i11++;
                                }
                            }
                        }
                        if (subject.getShortTVFavInfo() == null) {
                            shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                            if (shortTvFavoriteDaoM80298b0 != null) {
                                String str117 = this.$subjectId;
                                this.L$0 = list2;
                                this.L$1 = subject;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 11;
                                objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str117, this);
                                if (objMo79355a == objF) {
                                    return objF;
                                }
                                shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                                if (shortTvFavoriteStateBean != null) {
                                    shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                                }
                            }
                            subject.setShortTVFavInfo(shortTVFavInfo4);
                        }
                        arrayList = list2;
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                        break;
                    } else {
                        num = this.$dataSource;
                        if (num != null) {
                            return Unit.f75682a;
                        }
                        if (list != null) {
                        }
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "无网，显示下载数据, " + (list != null ? Boxing.m97634d(list.size()) : null), false, 4, null);
                        if (list != null) {
                            str = this.$subjectId;
                            while (r0.hasNext()) {
                                C26719e c26719e10 = new C26719e(str, shortTVItem.getEp(), null, 0, 12, null);
                                c26719e10.m104515g(shortTVItem.getDownloadStatus());
                                c26719e10.m104516h(shortTVItem);
                                arrayList.add(c26719e10);
                            }
                            Unit unit17 = Unit.f75682a;
                        }
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(1));
                    }
                    this.this$0.m80381g1(false);
                    this.this$0.f61643q.mo14858q(arrayList);
                    return Unit.f75682a;
                case 2:
                    zM106330e = this.Z$0;
                    List list11 = (List) this.L$1;
                    interfaceC25149n2 = (InterfaceC25149n0) this.L$0;
                    ResultKt.m97107b(obj);
                    arrayList2 = list11;
                    objM80288I1 = obj;
                    arrayList2.add((C26719e) objM80288I1);
                    this.this$0.f61609L.mo14858q(Boxing.m97631a(true));
                    this.this$0.m80381g1(false);
                    this.this$0.f61633g.mo14858q(this.$subject);
                    this.this$0.f61643q.mo14858q(arrayList2);
                    interfaceC25149n1 = interfaceC25149n2;
                    this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(0));
                    if (zM106330e) {
                        subject6 = this.$subject;
                        if (subject6 != null) {
                            interfaceC28213dM80392s1 = this.this$0.m80392s0();
                            if (interfaceC28213dM80392s1 != null) {
                                String str24 = this.$subjectId;
                                this.L$0 = interfaceC25149n1;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.Z$0 = zM106330e;
                                this.label = 7;
                                objMo73644j = interfaceC28213dM80392s1.mo73644j(str24, this);
                                if (objMo73644j == objF) {
                                    return objF;
                                }
                                subject6 = (Subject) objMo73644j;
                            } else {
                                z11 = zM106330e;
                                subject2 = null;
                            }
                        }
                        if (subject2 == null) {
                            this.this$0.m80381g1(false);
                            this.this$0.f61633g.mo14858q(null);
                            this.this$0.f61643q.mo14858q(CollectionsKt.m97506l());
                            return Unit.f75682a;
                        }
                        ShortTvViewModel shortTvViewModel12 = this.this$0;
                        str2 = this.$subjectId;
                        Result.Companion companion8 = Result.INSTANCE;
                        C26866a.a.m104905r(C26866a.f81698a, "ShortTvViewModel", new String[]{"will loadAdUnlockedEps"}, false, 4, null);
                        shortTvAdUnlockDaoM80294U = shortTvViewModel12.m80294U();
                        if (shortTvAdUnlockDaoM80294U != null) {
                            this.L$0 = subject2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.Z$0 = z11;
                            this.label = 8;
                            objMo79340a = shortTvAdUnlockDaoM80294U.mo79340a(str2, this);
                            if (objMo79340a == objF) {
                                return objF;
                            }
                            c18845e = (C18845e) objMo79340a;
                            if (c18845e != null) {
                                unit = null;
                            } else {
                                unit = null;
                            }
                        } else {
                            unit = null;
                        }
                        objM112707constructorimpl = Result.m112707constructorimpl(unit);
                        thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                        if (thM112710exceptionOrNullimpl != null) {
                            C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                        }
                        if (!Intrinsics.m97797c(subject2, this.this$0.f61633g.m14847f())) {
                            C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,set newSubject:" + this.$subjectId, false, 4, null);
                            this.this$0.f61633g.mo14858q(subject2);
                            C3187b0 c3187b7 = this.this$0.f61601D;
                            shortTVFavInfo = subject2.getShortTVFavInfo();
                            if (shortTVFavInfo != null) {
                                boolM97631a = Boxing.m97631a(shortTVFavInfo.getHasFavorite());
                            } else {
                                boolM97631a = null;
                            }
                            c3187b7.mo14858q(boolM97631a);
                        }
                        totalEpisode = subject2.getTotalEpisode();
                        interfaceC28213dM80392s0 = this.this$0.m80392s0();
                        if (interfaceC28213dM80392s0 != null) {
                            String str118 = this.$subjectId;
                            this.L$0 = subject2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.Z$0 = z11;
                            this.I$0 = totalEpisode;
                            this.label = 9;
                            objMo73636b = interfaceC28213dM80392s0.mo73636b(str118, this);
                            if (objMo73636b == objF) {
                                return objF;
                            }
                            List list12 = (List) objMo73636b;
                            subject = subject2;
                            list = list12;
                        } else {
                            subject = subject2;
                            list = null;
                        }
                        arrayList = new ArrayList();
                        if (z11) {
                            if (subject.getTrailer() == null) {
                            }
                            this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                            Unit unit18 = Unit.f75682a;
                            list2 = arrayList;
                            if (1 <= totalEpisode) {
                                i11 = 1;
                                while (true) {
                                    if (list != null) {
                                        it = list.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            shortTVFirstEp = (ShortTVItem) next;
                                        } while (((ShortTVItem) next).getEp() != i11);
                                        shortTVFirstEp = (ShortTVItem) next;
                                    } else {
                                        shortTVFirstEp = null;
                                    }
                                    if (i11 == 1) {
                                        c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                        if (shortTVFirstEp != null) {
                                            downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                        } else {
                                            downloadStatus2 = 0;
                                        }
                                        c26719e2.m104515g(downloadStatus2);
                                        if (c26719e2.m104510b() != 5) {
                                            shortTVFirstEp = subject.getShortTVFirstEp();
                                        }
                                        c26719e2.m104516h(shortTVFirstEp);
                                        list2.add(c26719e2);
                                    } else {
                                        c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                        if (shortTVFirstEp != null) {
                                            downloadStatus = shortTVFirstEp.getDownloadStatus();
                                        } else {
                                            downloadStatus = 0;
                                        }
                                        c26719e.m104515g(downloadStatus);
                                        if (c26719e.m104510b() != 5) {
                                            shortTVFirstEp = null;
                                        }
                                        c26719e.m104516h(shortTVFirstEp);
                                        list2.add(c26719e);
                                    }
                                    if (i11 != totalEpisode) {
                                        i11++;
                                    }
                                }
                            }
                            if (subject.getShortTVFavInfo() == null) {
                                shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                                if (shortTvFavoriteDaoM80298b0 != null) {
                                    String str119 = this.$subjectId;
                                    this.L$0 = list2;
                                    this.L$1 = subject;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.label = 11;
                                    objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str119, this);
                                    if (objMo79355a == objF) {
                                        return objF;
                                    }
                                    shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                                    if (shortTvFavoriteStateBean != null) {
                                        shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                                    }
                                }
                                subject.setShortTVFavInfo(shortTVFavInfo4);
                            }
                            arrayList = list2;
                            this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                            break;
                        } else {
                            num = this.$dataSource;
                            if (num != null) {
                                return Unit.f75682a;
                            }
                            if (list != null) {
                            }
                            C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "无网，显示下载数据, " + (list != null ? Boxing.m97634d(list.size()) : null), false, 4, null);
                            if (list != null) {
                                str = this.$subjectId;
                                while (r0.hasNext()) {
                                    C26719e c26719e11 = new C26719e(str, shortTVItem.getEp(), null, 0, 12, null);
                                    c26719e11.m104515g(shortTVItem.getDownloadStatus());
                                    c26719e11.m104516h(shortTVItem);
                                    arrayList.add(c26719e11);
                                }
                                Unit unit19 = Unit.f75682a;
                            }
                            this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(1));
                        }
                        this.this$0.m80381g1(false);
                        this.this$0.f61643q.mo14858q(arrayList);
                        return Unit.f75682a;
                    }
                    subject7 = this.$subject;
                    if (subject7 != null) {
                        unlockedEps = subject7.getUnlockedEps();
                    } else {
                        unlockedEps = null;
                    }
                    list3 = unlockedEps;
                    if (list3 != null) {
                        break;
                    }
                    C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,subjectId:" + this.$subjectId, false, 4, null);
                    InterfaceC27847a interfaceC27847a3 = this.this$0.f61624a;
                    String str25 = this.$subjectId;
                    this.L$0 = interfaceC25149n1;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.Z$0 = zM106330e;
                    this.label = 4;
                    objM108246d = InterfaceC27847a.a.m108246d(interfaceC27847a3, str25, null, this, 2, null);
                    if (objM108246d == objF) {
                        return objF;
                    }
                    baseDto = (BaseDto) objM108246d;
                    z12 = zM106330e;
                    if (baseDto != null) {
                        subject8 = (Subject) baseDto.getData();
                    } else {
                        subject8 = null;
                    }
                    C23219b.f70761a.m92282e(subject8);
                    if (subject8 != null) {
                        subject9 = this.$subject;
                        if (subject9 != null) {
                            ops = subject9.getOps();
                        } else {
                            ops = null;
                        }
                        subject8.setOps(ops);
                        Unit unit110 = Unit.f75682a;
                    }
                    ShortTvViewModel shortTvViewModel13 = this.this$0;
                    String str1110 = this.$subjectId;
                    if (subject8 != null) {
                        shortTVFavInfo3 = subject8.getShortTVFavInfo();
                    } else {
                        shortTVFavInfo3 = null;
                    }
                    shortTvViewModel13.m80327r1(str1110, shortTVFavInfo3);
                    if (subject8 == null) {
                        interfaceC28213dM80392s2 = this.this$0.m80392s0();
                        if (interfaceC28213dM80392s2 != null) {
                            String str1111 = this.$subjectId;
                            this.L$0 = interfaceC25149n1;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.Z$0 = z12;
                            this.label = 5;
                            objMo73644j2 = interfaceC28213dM80392s2.mo73644j(str1111, this);
                            if (objMo73644j2 == objF) {
                                return objF;
                            }
                            z14 = z12;
                            interfaceC25149n4 = interfaceC25149n1;
                            subject8 = (Subject) objMo73644j2;
                            z12 = z14;
                        } else {
                            subject8 = null;
                        }
                    }
                    z11 = z12;
                    subject2 = subject8;
                    if (subject2 == null) {
                        this.this$0.m80381g1(false);
                        this.this$0.f61633g.mo14858q(null);
                        this.this$0.f61643q.mo14858q(CollectionsKt.m97506l());
                        return Unit.f75682a;
                    }
                    ShortTvViewModel shortTvViewModel14 = this.this$0;
                    str2 = this.$subjectId;
                    Result.Companion companion9 = Result.INSTANCE;
                    C26866a.a.m104905r(C26866a.f81698a, "ShortTvViewModel", new String[]{"will loadAdUnlockedEps"}, false, 4, null);
                    shortTvAdUnlockDaoM80294U = shortTvViewModel14.m80294U();
                    if (shortTvAdUnlockDaoM80294U != null) {
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.label = 8;
                        objMo79340a = shortTvAdUnlockDaoM80294U.mo79340a(str2, this);
                        if (objMo79340a == objF) {
                            return objF;
                        }
                        c18845e = (C18845e) objMo79340a;
                        if (c18845e != null) {
                            unit = null;
                        } else {
                            unit = null;
                        }
                    } else {
                        unit = null;
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(unit);
                    thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                    if (thM112710exceptionOrNullimpl != null) {
                        C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                    }
                    if (!Intrinsics.m97797c(subject2, this.this$0.f61633g.m14847f())) {
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,set newSubject:" + this.$subjectId, false, 4, null);
                        this.this$0.f61633g.mo14858q(subject2);
                        C3187b0 c3187b8 = this.this$0.f61601D;
                        shortTVFavInfo = subject2.getShortTVFavInfo();
                        if (shortTVFavInfo != null) {
                            boolM97631a = Boxing.m97631a(shortTVFavInfo.getHasFavorite());
                        } else {
                            boolM97631a = null;
                        }
                        c3187b8.mo14858q(boolM97631a);
                    }
                    totalEpisode = subject2.getTotalEpisode();
                    interfaceC28213dM80392s0 = this.this$0.m80392s0();
                    if (interfaceC28213dM80392s0 != null) {
                        String str1112 = this.$subjectId;
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.I$0 = totalEpisode;
                        this.label = 9;
                        objMo73636b = interfaceC28213dM80392s0.mo73636b(str1112, this);
                        if (objMo73636b == objF) {
                            return objF;
                        }
                        List list13 = (List) objMo73636b;
                        subject = subject2;
                        list = list13;
                    } else {
                        subject = subject2;
                        list = null;
                    }
                    arrayList = new ArrayList();
                    if (z11) {
                        if (subject.getTrailer() == null) {
                        }
                        this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                        Unit unit111 = Unit.f75682a;
                        list2 = arrayList;
                        if (1 <= totalEpisode) {
                            i11 = 1;
                            while (true) {
                                if (list != null) {
                                    it = list.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        shortTVFirstEp = (ShortTVItem) next;
                                    } while (((ShortTVItem) next).getEp() != i11);
                                    shortTVFirstEp = (ShortTVItem) next;
                                } else {
                                    shortTVFirstEp = null;
                                }
                                if (i11 == 1) {
                                    c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus2 = 0;
                                    }
                                    c26719e2.m104515g(downloadStatus2);
                                    if (c26719e2.m104510b() != 5) {
                                        shortTVFirstEp = subject.getShortTVFirstEp();
                                    }
                                    c26719e2.m104516h(shortTVFirstEp);
                                    list2.add(c26719e2);
                                } else {
                                    c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus = 0;
                                    }
                                    c26719e.m104515g(downloadStatus);
                                    if (c26719e.m104510b() != 5) {
                                        shortTVFirstEp = null;
                                    }
                                    c26719e.m104516h(shortTVFirstEp);
                                    list2.add(c26719e);
                                }
                                if (i11 != totalEpisode) {
                                    i11++;
                                }
                            }
                        }
                        if (subject.getShortTVFavInfo() == null) {
                            shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                            if (shortTvFavoriteDaoM80298b0 != null) {
                                String str1113 = this.$subjectId;
                                this.L$0 = list2;
                                this.L$1 = subject;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 11;
                                objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str1113, this);
                                if (objMo79355a == objF) {
                                    return objF;
                                }
                                shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                                if (shortTvFavoriteStateBean != null) {
                                    shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                                }
                            }
                            subject.setShortTVFavInfo(shortTVFavInfo4);
                        }
                        arrayList = list2;
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                        break;
                    } else {
                        num = this.$dataSource;
                        if (num != null) {
                            return Unit.f75682a;
                        }
                        if (list != null) {
                        }
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "无网，显示下载数据, " + (list != null ? Boxing.m97634d(list.size()) : null), false, 4, null);
                        if (list != null) {
                            str = this.$subjectId;
                            while (r0.hasNext()) {
                                C26719e c26719e12 = new C26719e(str, shortTVItem.getEp(), null, 0, 12, null);
                                c26719e12.m104515g(shortTVItem.getDownloadStatus());
                                c26719e12.m104516h(shortTVItem);
                                arrayList.add(c26719e12);
                            }
                            Unit unit112 = Unit.f75682a;
                        }
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(1));
                    }
                    this.this$0.m80381g1(false);
                    this.this$0.f61643q.mo14858q(arrayList);
                    return Unit.f75682a;
                    subject2 = subject6;
                    z11 = zM106330e;
                    if (subject2 == null) {
                        this.this$0.m80381g1(false);
                        this.this$0.f61633g.mo14858q(null);
                        this.this$0.f61643q.mo14858q(CollectionsKt.m97506l());
                        return Unit.f75682a;
                    }
                    ShortTvViewModel shortTvViewModel15 = this.this$0;
                    str2 = this.$subjectId;
                    Result.Companion companion10 = Result.INSTANCE;
                    C26866a.a.m104905r(C26866a.f81698a, "ShortTvViewModel", new String[]{"will loadAdUnlockedEps"}, false, 4, null);
                    shortTvAdUnlockDaoM80294U = shortTvViewModel15.m80294U();
                    if (shortTvAdUnlockDaoM80294U != null) {
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.label = 8;
                        objMo79340a = shortTvAdUnlockDaoM80294U.mo79340a(str2, this);
                        if (objMo79340a == objF) {
                            return objF;
                        }
                        c18845e = (C18845e) objMo79340a;
                        if (c18845e != null) {
                            unit = null;
                        } else {
                            unit = null;
                        }
                    } else {
                        unit = null;
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(unit);
                    thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                    if (thM112710exceptionOrNullimpl != null) {
                        C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                    }
                    if (!Intrinsics.m97797c(subject2, this.this$0.f61633g.m14847f())) {
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,set newSubject:" + this.$subjectId, false, 4, null);
                        this.this$0.f61633g.mo14858q(subject2);
                        C3187b0 c3187b9 = this.this$0.f61601D;
                        shortTVFavInfo = subject2.getShortTVFavInfo();
                        if (shortTVFavInfo != null) {
                            boolM97631a = Boxing.m97631a(shortTVFavInfo.getHasFavorite());
                        } else {
                            boolM97631a = null;
                        }
                        c3187b9.mo14858q(boolM97631a);
                    }
                    totalEpisode = subject2.getTotalEpisode();
                    interfaceC28213dM80392s0 = this.this$0.m80392s0();
                    if (interfaceC28213dM80392s0 != null) {
                        String str1114 = this.$subjectId;
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.I$0 = totalEpisode;
                        this.label = 9;
                        objMo73636b = interfaceC28213dM80392s0.mo73636b(str1114, this);
                        if (objMo73636b == objF) {
                            return objF;
                        }
                        List list14 = (List) objMo73636b;
                        subject = subject2;
                        list = list14;
                    } else {
                        subject = subject2;
                        list = null;
                    }
                    arrayList = new ArrayList();
                    if (z11) {
                        if (subject.getTrailer() == null) {
                        }
                        this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                        Unit unit113 = Unit.f75682a;
                        list2 = arrayList;
                        if (1 <= totalEpisode) {
                            i11 = 1;
                            while (true) {
                                if (list != null) {
                                    it = list.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        shortTVFirstEp = (ShortTVItem) next;
                                    } while (((ShortTVItem) next).getEp() != i11);
                                    shortTVFirstEp = (ShortTVItem) next;
                                } else {
                                    shortTVFirstEp = null;
                                }
                                if (i11 == 1) {
                                    c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus2 = 0;
                                    }
                                    c26719e2.m104515g(downloadStatus2);
                                    if (c26719e2.m104510b() != 5) {
                                        shortTVFirstEp = subject.getShortTVFirstEp();
                                    }
                                    c26719e2.m104516h(shortTVFirstEp);
                                    list2.add(c26719e2);
                                } else {
                                    c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus = 0;
                                    }
                                    c26719e.m104515g(downloadStatus);
                                    if (c26719e.m104510b() != 5) {
                                        shortTVFirstEp = null;
                                    }
                                    c26719e.m104516h(shortTVFirstEp);
                                    list2.add(c26719e);
                                }
                                if (i11 != totalEpisode) {
                                    i11++;
                                }
                            }
                        }
                        if (subject.getShortTVFavInfo() == null) {
                            shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                            if (shortTvFavoriteDaoM80298b0 != null) {
                                String str1115 = this.$subjectId;
                                this.L$0 = list2;
                                this.L$1 = subject;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 11;
                                objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str1115, this);
                                if (objMo79355a == objF) {
                                    return objF;
                                }
                                shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                                if (shortTvFavoriteStateBean != null) {
                                    shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                                }
                            }
                            subject.setShortTVFavInfo(shortTVFavInfo4);
                        }
                        arrayList = list2;
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                        break;
                    } else {
                        num = this.$dataSource;
                        if (num != null) {
                            return Unit.f75682a;
                        }
                        if (list != null) {
                        }
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "无网，显示下载数据, " + (list != null ? Boxing.m97634d(list.size()) : null), false, 4, null);
                        if (list != null) {
                            str = this.$subjectId;
                            while (r0.hasNext()) {
                                C26719e c26719e13 = new C26719e(str, shortTVItem.getEp(), null, 0, 12, null);
                                c26719e13.m104515g(shortTVItem.getDownloadStatus());
                                c26719e13.m104516h(shortTVItem);
                                arrayList.add(c26719e13);
                            }
                            Unit unit114 = Unit.f75682a;
                        }
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(1));
                    }
                    this.this$0.m80381g1(false);
                    this.this$0.f61643q.mo14858q(arrayList);
                    return Unit.f75682a;
                case 3:
                    zM106330e = this.Z$0;
                    subject5 = (Subject) this.L$3;
                    c26719e3 = (C26719e) this.L$2;
                    arrayList2 = (List) this.L$1;
                    InterfaceC25149n0 interfaceC25149n5 = (InterfaceC25149n0) this.L$0;
                    ResultKt.m97107b(obj);
                    interfaceC25149n1 = interfaceC25149n5;
                    objMo79355a2 = obj;
                    shortTvFavoriteStateBean2 = (ShortTvFavoriteStateBean) objMo79355a2;
                    if (shortTvFavoriteStateBean2 != null) {
                        shortTVFavInfo2 = new ShortTVFavInfo(shortTvFavoriteStateBean2.getFavoriteNum(), shortTvFavoriteStateBean2.getHasFavorite(), shortTvFavoriteStateBean2.getFavoriteTime());
                    } else {
                        shortTVFavInfo2 = null;
                    }
                    subject5.setShortTVFavInfo(shortTVFavInfo2);
                    arrayList2.add(c26719e3);
                    this.this$0.m80381g1(false);
                    this.this$0.f61633g.mo14858q(this.$subject);
                    this.this$0.f61643q.mo14858q(arrayList2);
                    this.this$0.m80397w0(this.$subjectId, 2);
                    this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(0));
                    if (zM106330e) {
                        subject6 = this.$subject;
                        if (subject6 != null) {
                            interfaceC28213dM80392s1 = this.this$0.m80392s0();
                            if (interfaceC28213dM80392s1 != null) {
                                String str26 = this.$subjectId;
                                this.L$0 = interfaceC25149n1;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.Z$0 = zM106330e;
                                this.label = 7;
                                objMo73644j = interfaceC28213dM80392s1.mo73644j(str26, this);
                                if (objMo73644j == objF) {
                                    return objF;
                                }
                                subject6 = (Subject) objMo73644j;
                            } else {
                                z11 = zM106330e;
                                subject2 = null;
                            }
                        }
                        if (subject2 == null) {
                            this.this$0.m80381g1(false);
                            this.this$0.f61633g.mo14858q(null);
                            this.this$0.f61643q.mo14858q(CollectionsKt.m97506l());
                            return Unit.f75682a;
                        }
                        ShortTvViewModel shortTvViewModel16 = this.this$0;
                        str2 = this.$subjectId;
                        Result.Companion companion11 = Result.INSTANCE;
                        C26866a.a.m104905r(C26866a.f81698a, "ShortTvViewModel", new String[]{"will loadAdUnlockedEps"}, false, 4, null);
                        shortTvAdUnlockDaoM80294U = shortTvViewModel16.m80294U();
                        if (shortTvAdUnlockDaoM80294U != null) {
                            this.L$0 = subject2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.Z$0 = z11;
                            this.label = 8;
                            objMo79340a = shortTvAdUnlockDaoM80294U.mo79340a(str2, this);
                            if (objMo79340a == objF) {
                                return objF;
                            }
                            c18845e = (C18845e) objMo79340a;
                            if (c18845e != null) {
                                unit = null;
                            } else {
                                unit = null;
                            }
                        } else {
                            unit = null;
                        }
                        objM112707constructorimpl = Result.m112707constructorimpl(unit);
                        thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                        if (thM112710exceptionOrNullimpl != null) {
                            C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                        }
                        if (!Intrinsics.m97797c(subject2, this.this$0.f61633g.m14847f())) {
                            C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,set newSubject:" + this.$subjectId, false, 4, null);
                            this.this$0.f61633g.mo14858q(subject2);
                            C3187b0 c3187b10 = this.this$0.f61601D;
                            shortTVFavInfo = subject2.getShortTVFavInfo();
                            if (shortTVFavInfo != null) {
                                boolM97631a = Boxing.m97631a(shortTVFavInfo.getHasFavorite());
                            } else {
                                boolM97631a = null;
                            }
                            c3187b10.mo14858q(boolM97631a);
                        }
                        totalEpisode = subject2.getTotalEpisode();
                        interfaceC28213dM80392s0 = this.this$0.m80392s0();
                        if (interfaceC28213dM80392s0 != null) {
                            String str1116 = this.$subjectId;
                            this.L$0 = subject2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.Z$0 = z11;
                            this.I$0 = totalEpisode;
                            this.label = 9;
                            objMo73636b = interfaceC28213dM80392s0.mo73636b(str1116, this);
                            if (objMo73636b == objF) {
                                return objF;
                            }
                            List list15 = (List) objMo73636b;
                            subject = subject2;
                            list = list15;
                        } else {
                            subject = subject2;
                            list = null;
                        }
                        arrayList = new ArrayList();
                        if (z11) {
                            if (subject.getTrailer() == null) {
                            }
                            this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                            Unit unit115 = Unit.f75682a;
                            list2 = arrayList;
                            if (1 <= totalEpisode) {
                                i11 = 1;
                                while (true) {
                                    if (list != null) {
                                        it = list.iterator();
                                        do {
                                            if (it.hasNext()) {
                                                next = it.next();
                                            } else {
                                                next = null;
                                            }
                                            shortTVFirstEp = (ShortTVItem) next;
                                        } while (((ShortTVItem) next).getEp() != i11);
                                        shortTVFirstEp = (ShortTVItem) next;
                                    } else {
                                        shortTVFirstEp = null;
                                    }
                                    if (i11 == 1) {
                                        c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                        if (shortTVFirstEp != null) {
                                            downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                        } else {
                                            downloadStatus2 = 0;
                                        }
                                        c26719e2.m104515g(downloadStatus2);
                                        if (c26719e2.m104510b() != 5) {
                                            shortTVFirstEp = subject.getShortTVFirstEp();
                                        }
                                        c26719e2.m104516h(shortTVFirstEp);
                                        list2.add(c26719e2);
                                    } else {
                                        c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                        if (shortTVFirstEp != null) {
                                            downloadStatus = shortTVFirstEp.getDownloadStatus();
                                        } else {
                                            downloadStatus = 0;
                                        }
                                        c26719e.m104515g(downloadStatus);
                                        if (c26719e.m104510b() != 5) {
                                            shortTVFirstEp = null;
                                        }
                                        c26719e.m104516h(shortTVFirstEp);
                                        list2.add(c26719e);
                                    }
                                    if (i11 != totalEpisode) {
                                        i11++;
                                    }
                                }
                            }
                            if (subject.getShortTVFavInfo() == null) {
                                shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                                if (shortTvFavoriteDaoM80298b0 != null) {
                                    String str1117 = this.$subjectId;
                                    this.L$0 = list2;
                                    this.L$1 = subject;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.label = 11;
                                    objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str1117, this);
                                    if (objMo79355a == objF) {
                                        return objF;
                                    }
                                    shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                                    if (shortTvFavoriteStateBean != null) {
                                        shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                                    }
                                }
                                subject.setShortTVFavInfo(shortTVFavInfo4);
                            }
                            arrayList = list2;
                            this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                            break;
                        } else {
                            num = this.$dataSource;
                            if (num != null) {
                                return Unit.f75682a;
                            }
                            if (list != null) {
                            }
                            C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "无网，显示下载数据, " + (list != null ? Boxing.m97634d(list.size()) : null), false, 4, null);
                            if (list != null) {
                                str = this.$subjectId;
                                while (r0.hasNext()) {
                                    C26719e c26719e14 = new C26719e(str, shortTVItem.getEp(), null, 0, 12, null);
                                    c26719e14.m104515g(shortTVItem.getDownloadStatus());
                                    c26719e14.m104516h(shortTVItem);
                                    arrayList.add(c26719e14);
                                }
                                Unit unit116 = Unit.f75682a;
                            }
                            this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(1));
                        }
                        this.this$0.m80381g1(false);
                        this.this$0.f61643q.mo14858q(arrayList);
                        return Unit.f75682a;
                    }
                    subject7 = this.$subject;
                    if (subject7 != null) {
                        unlockedEps = subject7.getUnlockedEps();
                    } else {
                        unlockedEps = null;
                    }
                    list3 = unlockedEps;
                    if (list3 != null) {
                        break;
                    }
                    C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,subjectId:" + this.$subjectId, false, 4, null);
                    InterfaceC27847a interfaceC27847a4 = this.this$0.f61624a;
                    String str27 = this.$subjectId;
                    this.L$0 = interfaceC25149n1;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.Z$0 = zM106330e;
                    this.label = 4;
                    objM108246d = InterfaceC27847a.a.m108246d(interfaceC27847a4, str27, null, this, 2, null);
                    if (objM108246d == objF) {
                        return objF;
                    }
                    baseDto = (BaseDto) objM108246d;
                    z12 = zM106330e;
                    if (baseDto != null) {
                        subject8 = (Subject) baseDto.getData();
                    } else {
                        subject8 = null;
                    }
                    C23219b.f70761a.m92282e(subject8);
                    if (subject8 != null) {
                        subject9 = this.$subject;
                        if (subject9 != null) {
                            ops = subject9.getOps();
                        } else {
                            ops = null;
                        }
                        subject8.setOps(ops);
                        Unit unit117 = Unit.f75682a;
                    }
                    ShortTvViewModel shortTvViewModel17 = this.this$0;
                    String str1118 = this.$subjectId;
                    if (subject8 != null) {
                        shortTVFavInfo3 = subject8.getShortTVFavInfo();
                    } else {
                        shortTVFavInfo3 = null;
                    }
                    shortTvViewModel17.m80327r1(str1118, shortTVFavInfo3);
                    if (subject8 == null) {
                        interfaceC28213dM80392s2 = this.this$0.m80392s0();
                        if (interfaceC28213dM80392s2 != null) {
                            String str1119 = this.$subjectId;
                            this.L$0 = interfaceC25149n1;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.Z$0 = z12;
                            this.label = 5;
                            objMo73644j2 = interfaceC28213dM80392s2.mo73644j(str1119, this);
                            if (objMo73644j2 == objF) {
                                return objF;
                            }
                            z14 = z12;
                            interfaceC25149n4 = interfaceC25149n1;
                            subject8 = (Subject) objMo73644j2;
                            z12 = z14;
                        } else {
                            subject8 = null;
                        }
                    }
                    z11 = z12;
                    subject2 = subject8;
                    if (subject2 == null) {
                        this.this$0.m80381g1(false);
                        this.this$0.f61633g.mo14858q(null);
                        this.this$0.f61643q.mo14858q(CollectionsKt.m97506l());
                        return Unit.f75682a;
                    }
                    ShortTvViewModel shortTvViewModel18 = this.this$0;
                    str2 = this.$subjectId;
                    Result.Companion companion12 = Result.INSTANCE;
                    C26866a.a.m104905r(C26866a.f81698a, "ShortTvViewModel", new String[]{"will loadAdUnlockedEps"}, false, 4, null);
                    shortTvAdUnlockDaoM80294U = shortTvViewModel18.m80294U();
                    if (shortTvAdUnlockDaoM80294U != null) {
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.label = 8;
                        objMo79340a = shortTvAdUnlockDaoM80294U.mo79340a(str2, this);
                        if (objMo79340a == objF) {
                            return objF;
                        }
                        c18845e = (C18845e) objMo79340a;
                        if (c18845e != null) {
                            unit = null;
                        } else {
                            unit = null;
                        }
                    } else {
                        unit = null;
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(unit);
                    thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                    if (thM112710exceptionOrNullimpl != null) {
                        C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                    }
                    if (!Intrinsics.m97797c(subject2, this.this$0.f61633g.m14847f())) {
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,set newSubject:" + this.$subjectId, false, 4, null);
                        this.this$0.f61633g.mo14858q(subject2);
                        C3187b0 c3187b11 = this.this$0.f61601D;
                        shortTVFavInfo = subject2.getShortTVFavInfo();
                        if (shortTVFavInfo != null) {
                            boolM97631a = Boxing.m97631a(shortTVFavInfo.getHasFavorite());
                        } else {
                            boolM97631a = null;
                        }
                        c3187b11.mo14858q(boolM97631a);
                    }
                    totalEpisode = subject2.getTotalEpisode();
                    interfaceC28213dM80392s0 = this.this$0.m80392s0();
                    if (interfaceC28213dM80392s0 != null) {
                        String str11110 = this.$subjectId;
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.I$0 = totalEpisode;
                        this.label = 9;
                        objMo73636b = interfaceC28213dM80392s0.mo73636b(str11110, this);
                        if (objMo73636b == objF) {
                            return objF;
                        }
                        List list16 = (List) objMo73636b;
                        subject = subject2;
                        list = list16;
                    } else {
                        subject = subject2;
                        list = null;
                    }
                    arrayList = new ArrayList();
                    if (z11) {
                        if (subject.getTrailer() == null) {
                        }
                        this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                        Unit unit118 = Unit.f75682a;
                        list2 = arrayList;
                        if (1 <= totalEpisode) {
                            i11 = 1;
                            while (true) {
                                if (list != null) {
                                    it = list.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        shortTVFirstEp = (ShortTVItem) next;
                                    } while (((ShortTVItem) next).getEp() != i11);
                                    shortTVFirstEp = (ShortTVItem) next;
                                } else {
                                    shortTVFirstEp = null;
                                }
                                if (i11 == 1) {
                                    c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus2 = 0;
                                    }
                                    c26719e2.m104515g(downloadStatus2);
                                    if (c26719e2.m104510b() != 5) {
                                        shortTVFirstEp = subject.getShortTVFirstEp();
                                    }
                                    c26719e2.m104516h(shortTVFirstEp);
                                    list2.add(c26719e2);
                                } else {
                                    c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus = 0;
                                    }
                                    c26719e.m104515g(downloadStatus);
                                    if (c26719e.m104510b() != 5) {
                                        shortTVFirstEp = null;
                                    }
                                    c26719e.m104516h(shortTVFirstEp);
                                    list2.add(c26719e);
                                }
                                if (i11 != totalEpisode) {
                                    i11++;
                                }
                            }
                        }
                        if (subject.getShortTVFavInfo() == null) {
                            shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                            if (shortTvFavoriteDaoM80298b0 != null) {
                                String str11111 = this.$subjectId;
                                this.L$0 = list2;
                                this.L$1 = subject;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 11;
                                objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str11111, this);
                                if (objMo79355a == objF) {
                                    return objF;
                                }
                                shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                                if (shortTvFavoriteStateBean != null) {
                                    shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                                }
                            }
                            subject.setShortTVFavInfo(shortTVFavInfo4);
                        }
                        arrayList = list2;
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                        break;
                    } else {
                        num = this.$dataSource;
                        if (num != null) {
                            return Unit.f75682a;
                        }
                        if (list != null) {
                        }
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "无网，显示下载数据, " + (list != null ? Boxing.m97634d(list.size()) : null), false, 4, null);
                        if (list != null) {
                            str = this.$subjectId;
                            while (r0.hasNext()) {
                                C26719e c26719e15 = new C26719e(str, shortTVItem.getEp(), null, 0, 12, null);
                                c26719e15.m104515g(shortTVItem.getDownloadStatus());
                                c26719e15.m104516h(shortTVItem);
                                arrayList.add(c26719e15);
                            }
                            Unit unit119 = Unit.f75682a;
                        }
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(1));
                    }
                    this.this$0.m80381g1(false);
                    this.this$0.f61643q.mo14858q(arrayList);
                    return Unit.f75682a;
                    subject2 = subject6;
                    z11 = zM106330e;
                    if (subject2 == null) {
                        this.this$0.m80381g1(false);
                        this.this$0.f61633g.mo14858q(null);
                        this.this$0.f61643q.mo14858q(CollectionsKt.m97506l());
                        return Unit.f75682a;
                    }
                    ShortTvViewModel shortTvViewModel19 = this.this$0;
                    str2 = this.$subjectId;
                    Result.Companion companion13 = Result.INSTANCE;
                    C26866a.a.m104905r(C26866a.f81698a, "ShortTvViewModel", new String[]{"will loadAdUnlockedEps"}, false, 4, null);
                    shortTvAdUnlockDaoM80294U = shortTvViewModel19.m80294U();
                    if (shortTvAdUnlockDaoM80294U != null) {
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.label = 8;
                        objMo79340a = shortTvAdUnlockDaoM80294U.mo79340a(str2, this);
                        if (objMo79340a == objF) {
                            return objF;
                        }
                        c18845e = (C18845e) objMo79340a;
                        if (c18845e != null) {
                            unit = null;
                        } else {
                            unit = null;
                        }
                    } else {
                        unit = null;
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(unit);
                    thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                    if (thM112710exceptionOrNullimpl != null) {
                        C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                    }
                    if (!Intrinsics.m97797c(subject2, this.this$0.f61633g.m14847f())) {
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,set newSubject:" + this.$subjectId, false, 4, null);
                        this.this$0.f61633g.mo14858q(subject2);
                        C3187b0 c3187b12 = this.this$0.f61601D;
                        shortTVFavInfo = subject2.getShortTVFavInfo();
                        if (shortTVFavInfo != null) {
                            boolM97631a = Boxing.m97631a(shortTVFavInfo.getHasFavorite());
                        } else {
                            boolM97631a = null;
                        }
                        c3187b12.mo14858q(boolM97631a);
                    }
                    totalEpisode = subject2.getTotalEpisode();
                    interfaceC28213dM80392s0 = this.this$0.m80392s0();
                    if (interfaceC28213dM80392s0 != null) {
                        String str11112 = this.$subjectId;
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.I$0 = totalEpisode;
                        this.label = 9;
                        objMo73636b = interfaceC28213dM80392s0.mo73636b(str11112, this);
                        if (objMo73636b == objF) {
                            return objF;
                        }
                        List list17 = (List) objMo73636b;
                        subject = subject2;
                        list = list17;
                    } else {
                        subject = subject2;
                        list = null;
                    }
                    arrayList = new ArrayList();
                    if (z11) {
                        if (subject.getTrailer() == null) {
                        }
                        this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                        Unit unit1110 = Unit.f75682a;
                        list2 = arrayList;
                        if (1 <= totalEpisode) {
                            i11 = 1;
                            while (true) {
                                if (list != null) {
                                    it = list.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        shortTVFirstEp = (ShortTVItem) next;
                                    } while (((ShortTVItem) next).getEp() != i11);
                                    shortTVFirstEp = (ShortTVItem) next;
                                } else {
                                    shortTVFirstEp = null;
                                }
                                if (i11 == 1) {
                                    c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus2 = 0;
                                    }
                                    c26719e2.m104515g(downloadStatus2);
                                    if (c26719e2.m104510b() != 5) {
                                        shortTVFirstEp = subject.getShortTVFirstEp();
                                    }
                                    c26719e2.m104516h(shortTVFirstEp);
                                    list2.add(c26719e2);
                                } else {
                                    c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus = 0;
                                    }
                                    c26719e.m104515g(downloadStatus);
                                    if (c26719e.m104510b() != 5) {
                                        shortTVFirstEp = null;
                                    }
                                    c26719e.m104516h(shortTVFirstEp);
                                    list2.add(c26719e);
                                }
                                if (i11 != totalEpisode) {
                                    i11++;
                                }
                            }
                        }
                        if (subject.getShortTVFavInfo() == null) {
                            shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                            if (shortTvFavoriteDaoM80298b0 != null) {
                                String str11113 = this.$subjectId;
                                this.L$0 = list2;
                                this.L$1 = subject;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 11;
                                objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str11113, this);
                                if (objMo79355a == objF) {
                                    return objF;
                                }
                                shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                                if (shortTvFavoriteStateBean != null) {
                                    shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                                }
                            }
                            subject.setShortTVFavInfo(shortTVFavInfo4);
                        }
                        arrayList = list2;
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                        break;
                    } else {
                        num = this.$dataSource;
                        if (num != null) {
                            return Unit.f75682a;
                        }
                        if (list != null) {
                        }
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "无网，显示下载数据, " + (list != null ? Boxing.m97634d(list.size()) : null), false, 4, null);
                        if (list != null) {
                            str = this.$subjectId;
                            while (r0.hasNext()) {
                                C26719e c26719e16 = new C26719e(str, shortTVItem.getEp(), null, 0, 12, null);
                                c26719e16.m104515g(shortTVItem.getDownloadStatus());
                                c26719e16.m104516h(shortTVItem);
                                arrayList.add(c26719e16);
                            }
                            Unit unit1111 = Unit.f75682a;
                        }
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(1));
                    }
                    this.this$0.m80381g1(false);
                    this.this$0.f61643q.mo14858q(arrayList);
                    return Unit.f75682a;
                case 4:
                    zM106330e = this.Z$0;
                    interfaceC25149n3 = (InterfaceC25149n0) this.L$0;
                    try {
                        ResultKt.m97107b(obj);
                        interfaceC25149n1 = interfaceC25149n3;
                        objM108246d = obj;
                        baseDto = (BaseDto) objM108246d;
                        z12 = zM106330e;
                    } catch (Exception unused2) {
                        z12 = zM106330e;
                        interfaceC25149n1 = interfaceC25149n3;
                        baseDto = null;
                    }
                    if (baseDto != null) {
                        subject8 = (Subject) baseDto.getData();
                    } else {
                        subject8 = null;
                    }
                    C23219b.f70761a.m92282e(subject8);
                    if (subject8 != null) {
                        subject9 = this.$subject;
                        if (subject9 != null) {
                            ops = subject9.getOps();
                        } else {
                            ops = null;
                        }
                        subject8.setOps(ops);
                        Unit unit1112 = Unit.f75682a;
                    }
                    ShortTvViewModel shortTvViewModel110 = this.this$0;
                    String str11114 = this.$subjectId;
                    if (subject8 != null) {
                        shortTVFavInfo3 = subject8.getShortTVFavInfo();
                    } else {
                        shortTVFavInfo3 = null;
                    }
                    shortTvViewModel110.m80327r1(str11114, shortTVFavInfo3);
                    if (subject8 == null) {
                        interfaceC28213dM80392s2 = this.this$0.m80392s0();
                        if (interfaceC28213dM80392s2 != null) {
                            String str11115 = this.$subjectId;
                            this.L$0 = interfaceC25149n1;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.Z$0 = z12;
                            this.label = 5;
                            objMo73644j2 = interfaceC28213dM80392s2.mo73644j(str11115, this);
                            if (objMo73644j2 == objF) {
                                return objF;
                            }
                            z14 = z12;
                            interfaceC25149n4 = interfaceC25149n1;
                            subject8 = (Subject) objMo73644j2;
                            z12 = z14;
                        } else {
                            subject8 = null;
                        }
                    }
                    z11 = z12;
                    subject2 = subject8;
                    if (subject2 == null) {
                        this.this$0.m80381g1(false);
                        this.this$0.f61633g.mo14858q(null);
                        this.this$0.f61643q.mo14858q(CollectionsKt.m97506l());
                        return Unit.f75682a;
                    }
                    ShortTvViewModel shortTvViewModel111 = this.this$0;
                    str2 = this.$subjectId;
                    Result.Companion companion14 = Result.INSTANCE;
                    C26866a.a.m104905r(C26866a.f81698a, "ShortTvViewModel", new String[]{"will loadAdUnlockedEps"}, false, 4, null);
                    shortTvAdUnlockDaoM80294U = shortTvViewModel111.m80294U();
                    if (shortTvAdUnlockDaoM80294U != null) {
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.label = 8;
                        objMo79340a = shortTvAdUnlockDaoM80294U.mo79340a(str2, this);
                        if (objMo79340a == objF) {
                            return objF;
                        }
                        c18845e = (C18845e) objMo79340a;
                        if (c18845e != null) {
                            unit = null;
                        } else {
                            unit = null;
                        }
                    } else {
                        unit = null;
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(unit);
                    thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                    if (thM112710exceptionOrNullimpl != null) {
                        C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                    }
                    if (!Intrinsics.m97797c(subject2, this.this$0.f61633g.m14847f())) {
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,set newSubject:" + this.$subjectId, false, 4, null);
                        this.this$0.f61633g.mo14858q(subject2);
                        C3187b0 c3187b13 = this.this$0.f61601D;
                        shortTVFavInfo = subject2.getShortTVFavInfo();
                        if (shortTVFavInfo != null) {
                            boolM97631a = Boxing.m97631a(shortTVFavInfo.getHasFavorite());
                        } else {
                            boolM97631a = null;
                        }
                        c3187b13.mo14858q(boolM97631a);
                    }
                    totalEpisode = subject2.getTotalEpisode();
                    interfaceC28213dM80392s0 = this.this$0.m80392s0();
                    if (interfaceC28213dM80392s0 != null) {
                        String str11116 = this.$subjectId;
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.I$0 = totalEpisode;
                        this.label = 9;
                        objMo73636b = interfaceC28213dM80392s0.mo73636b(str11116, this);
                        if (objMo73636b == objF) {
                            return objF;
                        }
                        List list18 = (List) objMo73636b;
                        subject = subject2;
                        list = list18;
                    } else {
                        subject = subject2;
                        list = null;
                    }
                    arrayList = new ArrayList();
                    if (z11) {
                        if (subject.getTrailer() == null) {
                        }
                        this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                        Unit unit1113 = Unit.f75682a;
                        list2 = arrayList;
                        if (1 <= totalEpisode) {
                            i11 = 1;
                            while (true) {
                                if (list != null) {
                                    it = list.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        shortTVFirstEp = (ShortTVItem) next;
                                    } while (((ShortTVItem) next).getEp() != i11);
                                    shortTVFirstEp = (ShortTVItem) next;
                                } else {
                                    shortTVFirstEp = null;
                                }
                                if (i11 == 1) {
                                    c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus2 = 0;
                                    }
                                    c26719e2.m104515g(downloadStatus2);
                                    if (c26719e2.m104510b() != 5) {
                                        shortTVFirstEp = subject.getShortTVFirstEp();
                                    }
                                    c26719e2.m104516h(shortTVFirstEp);
                                    list2.add(c26719e2);
                                } else {
                                    c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus = 0;
                                    }
                                    c26719e.m104515g(downloadStatus);
                                    if (c26719e.m104510b() != 5) {
                                        shortTVFirstEp = null;
                                    }
                                    c26719e.m104516h(shortTVFirstEp);
                                    list2.add(c26719e);
                                }
                                if (i11 != totalEpisode) {
                                    i11++;
                                }
                            }
                        }
                        if (subject.getShortTVFavInfo() == null) {
                            shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                            if (shortTvFavoriteDaoM80298b0 != null) {
                                String str11117 = this.$subjectId;
                                this.L$0 = list2;
                                this.L$1 = subject;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 11;
                                objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str11117, this);
                                if (objMo79355a == objF) {
                                    return objF;
                                }
                                shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                                if (shortTvFavoriteStateBean != null) {
                                    shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                                }
                            }
                            subject.setShortTVFavInfo(shortTVFavInfo4);
                        }
                        arrayList = list2;
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                        break;
                    } else {
                        num = this.$dataSource;
                        if (num != null) {
                            return Unit.f75682a;
                        }
                        if (list != null) {
                        }
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "无网，显示下载数据, " + (list != null ? Boxing.m97634d(list.size()) : null), false, 4, null);
                        if (list != null) {
                            str = this.$subjectId;
                            while (r0.hasNext()) {
                                C26719e c26719e17 = new C26719e(str, shortTVItem.getEp(), null, 0, 12, null);
                                c26719e17.m104515g(shortTVItem.getDownloadStatus());
                                c26719e17.m104516h(shortTVItem);
                                arrayList.add(c26719e17);
                            }
                            Unit unit1114 = Unit.f75682a;
                        }
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(1));
                    }
                    this.this$0.m80381g1(false);
                    this.this$0.f61643q.mo14858q(arrayList);
                    return Unit.f75682a;
                case 5:
                    z14 = this.Z$0;
                    interfaceC25149n4 = (InterfaceC25149n0) this.L$0;
                    try {
                        ResultKt.m97107b(obj);
                        objMo73644j2 = obj;
                        subject8 = (Subject) objMo73644j2;
                        z12 = z14;
                    } catch (Exception e12) {
                        boolean z15 = z14;
                        exc = e12;
                        z13 = z15;
                        exc.printStackTrace();
                        C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo, error:" + exc, false, 4, null);
                        interfaceC28213dM80392s3 = this.this$0.m80392s0();
                        if (interfaceC28213dM80392s3 != null) {
                            String str120 = this.$subjectId;
                            this.L$0 = interfaceC25149n4;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.Z$0 = z13;
                            this.label = 6;
                            objMo73644j3 = interfaceC28213dM80392s3.mo73644j(str120, this);
                            if (objMo73644j3 == objF) {
                                return objF;
                            }
                            z12 = z13;
                            subject8 = (Subject) objMo73644j3;
                        } else {
                            z12 = z13;
                            subject8 = null;
                        }
                    }
                    z11 = z12;
                    subject2 = subject8;
                    if (subject2 == null) {
                        this.this$0.m80381g1(false);
                        this.this$0.f61633g.mo14858q(null);
                        this.this$0.f61643q.mo14858q(CollectionsKt.m97506l());
                        return Unit.f75682a;
                    }
                    ShortTvViewModel shortTvViewModel112 = this.this$0;
                    str2 = this.$subjectId;
                    Result.Companion companion15 = Result.INSTANCE;
                    C26866a.a.m104905r(C26866a.f81698a, "ShortTvViewModel", new String[]{"will loadAdUnlockedEps"}, false, 4, null);
                    shortTvAdUnlockDaoM80294U = shortTvViewModel112.m80294U();
                    if (shortTvAdUnlockDaoM80294U != null) {
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.label = 8;
                        objMo79340a = shortTvAdUnlockDaoM80294U.mo79340a(str2, this);
                        if (objMo79340a == objF) {
                            return objF;
                        }
                        c18845e = (C18845e) objMo79340a;
                        if (c18845e != null) {
                            unit = null;
                        } else {
                            unit = null;
                        }
                    } else {
                        unit = null;
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(unit);
                    thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                    if (thM112710exceptionOrNullimpl != null) {
                        C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                    }
                    if (!Intrinsics.m97797c(subject2, this.this$0.f61633g.m14847f())) {
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,set newSubject:" + this.$subjectId, false, 4, null);
                        this.this$0.f61633g.mo14858q(subject2);
                        C3187b0 c3187b14 = this.this$0.f61601D;
                        shortTVFavInfo = subject2.getShortTVFavInfo();
                        if (shortTVFavInfo != null) {
                            boolM97631a = Boxing.m97631a(shortTVFavInfo.getHasFavorite());
                        } else {
                            boolM97631a = null;
                        }
                        c3187b14.mo14858q(boolM97631a);
                    }
                    totalEpisode = subject2.getTotalEpisode();
                    interfaceC28213dM80392s0 = this.this$0.m80392s0();
                    if (interfaceC28213dM80392s0 != null) {
                        String str11118 = this.$subjectId;
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.I$0 = totalEpisode;
                        this.label = 9;
                        objMo73636b = interfaceC28213dM80392s0.mo73636b(str11118, this);
                        if (objMo73636b == objF) {
                            return objF;
                        }
                        List list19 = (List) objMo73636b;
                        subject = subject2;
                        list = list19;
                    } else {
                        subject = subject2;
                        list = null;
                    }
                    arrayList = new ArrayList();
                    if (z11) {
                        if (subject.getTrailer() == null) {
                        }
                        this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                        Unit unit1115 = Unit.f75682a;
                        list2 = arrayList;
                        if (1 <= totalEpisode) {
                            i11 = 1;
                            while (true) {
                                if (list != null) {
                                    it = list.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        shortTVFirstEp = (ShortTVItem) next;
                                    } while (((ShortTVItem) next).getEp() != i11);
                                    shortTVFirstEp = (ShortTVItem) next;
                                } else {
                                    shortTVFirstEp = null;
                                }
                                if (i11 == 1) {
                                    c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus2 = 0;
                                    }
                                    c26719e2.m104515g(downloadStatus2);
                                    if (c26719e2.m104510b() != 5) {
                                        shortTVFirstEp = subject.getShortTVFirstEp();
                                    }
                                    c26719e2.m104516h(shortTVFirstEp);
                                    list2.add(c26719e2);
                                } else {
                                    c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus = 0;
                                    }
                                    c26719e.m104515g(downloadStatus);
                                    if (c26719e.m104510b() != 5) {
                                        shortTVFirstEp = null;
                                    }
                                    c26719e.m104516h(shortTVFirstEp);
                                    list2.add(c26719e);
                                }
                                if (i11 != totalEpisode) {
                                    i11++;
                                }
                            }
                        }
                        if (subject.getShortTVFavInfo() == null) {
                            shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                            if (shortTvFavoriteDaoM80298b0 != null) {
                                String str11119 = this.$subjectId;
                                this.L$0 = list2;
                                this.L$1 = subject;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 11;
                                objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str11119, this);
                                if (objMo79355a == objF) {
                                    return objF;
                                }
                                shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                                if (shortTvFavoriteStateBean != null) {
                                    shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                                }
                            }
                            subject.setShortTVFavInfo(shortTVFavInfo4);
                        }
                        arrayList = list2;
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                        break;
                    } else {
                        num = this.$dataSource;
                        if (num != null) {
                            return Unit.f75682a;
                        }
                        if (list != null) {
                        }
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "无网，显示下载数据, " + (list != null ? Boxing.m97634d(list.size()) : null), false, 4, null);
                        if (list != null) {
                            str = this.$subjectId;
                            while (r0.hasNext()) {
                                C26719e c26719e18 = new C26719e(str, shortTVItem.getEp(), null, 0, 12, null);
                                c26719e18.m104515g(shortTVItem.getDownloadStatus());
                                c26719e18.m104516h(shortTVItem);
                                arrayList.add(c26719e18);
                            }
                            Unit unit1116 = Unit.f75682a;
                        }
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(1));
                    }
                    this.this$0.m80381g1(false);
                    this.this$0.f61643q.mo14858q(arrayList);
                    return Unit.f75682a;
                case 6:
                    z13 = this.Z$0;
                    ResultKt.m97107b(obj);
                    objMo73644j3 = obj;
                    z12 = z13;
                    subject8 = (Subject) objMo73644j3;
                    z11 = z12;
                    subject2 = subject8;
                    if (subject2 == null) {
                        this.this$0.m80381g1(false);
                        this.this$0.f61633g.mo14858q(null);
                        this.this$0.f61643q.mo14858q(CollectionsKt.m97506l());
                        return Unit.f75682a;
                    }
                    ShortTvViewModel shortTvViewModel113 = this.this$0;
                    str2 = this.$subjectId;
                    Result.Companion companion16 = Result.INSTANCE;
                    C26866a.a.m104905r(C26866a.f81698a, "ShortTvViewModel", new String[]{"will loadAdUnlockedEps"}, false, 4, null);
                    shortTvAdUnlockDaoM80294U = shortTvViewModel113.m80294U();
                    if (shortTvAdUnlockDaoM80294U != null) {
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.label = 8;
                        objMo79340a = shortTvAdUnlockDaoM80294U.mo79340a(str2, this);
                        if (objMo79340a == objF) {
                            return objF;
                        }
                        c18845e = (C18845e) objMo79340a;
                        if (c18845e != null) {
                            unit = null;
                        } else {
                            unit = null;
                        }
                    } else {
                        unit = null;
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(unit);
                    thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                    if (thM112710exceptionOrNullimpl != null) {
                        C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                    }
                    if (!Intrinsics.m97797c(subject2, this.this$0.f61633g.m14847f())) {
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,set newSubject:" + this.$subjectId, false, 4, null);
                        this.this$0.f61633g.mo14858q(subject2);
                        C3187b0 c3187b15 = this.this$0.f61601D;
                        shortTVFavInfo = subject2.getShortTVFavInfo();
                        if (shortTVFavInfo != null) {
                            boolM97631a = Boxing.m97631a(shortTVFavInfo.getHasFavorite());
                        } else {
                            boolM97631a = null;
                        }
                        c3187b15.mo14858q(boolM97631a);
                    }
                    totalEpisode = subject2.getTotalEpisode();
                    interfaceC28213dM80392s0 = this.this$0.m80392s0();
                    if (interfaceC28213dM80392s0 != null) {
                        String str111110 = this.$subjectId;
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.I$0 = totalEpisode;
                        this.label = 9;
                        objMo73636b = interfaceC28213dM80392s0.mo73636b(str111110, this);
                        if (objMo73636b == objF) {
                            return objF;
                        }
                        List list110 = (List) objMo73636b;
                        subject = subject2;
                        list = list110;
                    } else {
                        subject = subject2;
                        list = null;
                    }
                    arrayList = new ArrayList();
                    if (z11) {
                        if (subject.getTrailer() == null) {
                        }
                        this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                        Unit unit1117 = Unit.f75682a;
                        list2 = arrayList;
                        if (1 <= totalEpisode) {
                            i11 = 1;
                            while (true) {
                                if (list != null) {
                                    it = list.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        shortTVFirstEp = (ShortTVItem) next;
                                    } while (((ShortTVItem) next).getEp() != i11);
                                    shortTVFirstEp = (ShortTVItem) next;
                                } else {
                                    shortTVFirstEp = null;
                                }
                                if (i11 == 1) {
                                    c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus2 = 0;
                                    }
                                    c26719e2.m104515g(downloadStatus2);
                                    if (c26719e2.m104510b() != 5) {
                                        shortTVFirstEp = subject.getShortTVFirstEp();
                                    }
                                    c26719e2.m104516h(shortTVFirstEp);
                                    list2.add(c26719e2);
                                } else {
                                    c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus = 0;
                                    }
                                    c26719e.m104515g(downloadStatus);
                                    if (c26719e.m104510b() != 5) {
                                        shortTVFirstEp = null;
                                    }
                                    c26719e.m104516h(shortTVFirstEp);
                                    list2.add(c26719e);
                                }
                                if (i11 != totalEpisode) {
                                    i11++;
                                }
                            }
                        }
                        if (subject.getShortTVFavInfo() == null) {
                            shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                            if (shortTvFavoriteDaoM80298b0 != null) {
                                String str111111 = this.$subjectId;
                                this.L$0 = list2;
                                this.L$1 = subject;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 11;
                                objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str111111, this);
                                if (objMo79355a == objF) {
                                    return objF;
                                }
                                shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                                if (shortTvFavoriteStateBean != null) {
                                    shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                                }
                            }
                            subject.setShortTVFavInfo(shortTVFavInfo4);
                        }
                        arrayList = list2;
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                        break;
                    } else {
                        num = this.$dataSource;
                        if (num != null) {
                            return Unit.f75682a;
                        }
                        if (list != null) {
                        }
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "无网，显示下载数据, " + (list != null ? Boxing.m97634d(list.size()) : null), false, 4, null);
                        if (list != null) {
                            str = this.$subjectId;
                            while (r0.hasNext()) {
                                C26719e c26719e19 = new C26719e(str, shortTVItem.getEp(), null, 0, 12, null);
                                c26719e19.m104515g(shortTVItem.getDownloadStatus());
                                c26719e19.m104516h(shortTVItem);
                                arrayList.add(c26719e19);
                            }
                            Unit unit1118 = Unit.f75682a;
                        }
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(1));
                    }
                    this.this$0.m80381g1(false);
                    this.this$0.f61643q.mo14858q(arrayList);
                    return Unit.f75682a;
                case 7:
                    zM106330e = this.Z$0;
                    ResultKt.m97107b(obj);
                    objMo73644j = obj;
                    subject6 = (Subject) objMo73644j;
                    subject2 = subject6;
                    z11 = zM106330e;
                    if (subject2 == null) {
                        this.this$0.m80381g1(false);
                        this.this$0.f61633g.mo14858q(null);
                        this.this$0.f61643q.mo14858q(CollectionsKt.m97506l());
                        return Unit.f75682a;
                    }
                    ShortTvViewModel shortTvViewModel114 = this.this$0;
                    str2 = this.$subjectId;
                    Result.Companion companion17 = Result.INSTANCE;
                    C26866a.a.m104905r(C26866a.f81698a, "ShortTvViewModel", new String[]{"will loadAdUnlockedEps"}, false, 4, null);
                    shortTvAdUnlockDaoM80294U = shortTvViewModel114.m80294U();
                    if (shortTvAdUnlockDaoM80294U != null) {
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.label = 8;
                        objMo79340a = shortTvAdUnlockDaoM80294U.mo79340a(str2, this);
                        if (objMo79340a == objF) {
                            return objF;
                        }
                        c18845e = (C18845e) objMo79340a;
                        if (c18845e != null) {
                            unit = null;
                        } else {
                            unit = null;
                        }
                    } else {
                        unit = null;
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(unit);
                    thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                    if (thM112710exceptionOrNullimpl != null) {
                        C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                    }
                    if (!Intrinsics.m97797c(subject2, this.this$0.f61633g.m14847f())) {
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,set newSubject:" + this.$subjectId, false, 4, null);
                        this.this$0.f61633g.mo14858q(subject2);
                        C3187b0 c3187b16 = this.this$0.f61601D;
                        shortTVFavInfo = subject2.getShortTVFavInfo();
                        if (shortTVFavInfo != null) {
                            boolM97631a = Boxing.m97631a(shortTVFavInfo.getHasFavorite());
                        } else {
                            boolM97631a = null;
                        }
                        c3187b16.mo14858q(boolM97631a);
                    }
                    totalEpisode = subject2.getTotalEpisode();
                    interfaceC28213dM80392s0 = this.this$0.m80392s0();
                    if (interfaceC28213dM80392s0 != null) {
                        String str111112 = this.$subjectId;
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.I$0 = totalEpisode;
                        this.label = 9;
                        objMo73636b = interfaceC28213dM80392s0.mo73636b(str111112, this);
                        if (objMo73636b == objF) {
                            return objF;
                        }
                        List list111 = (List) objMo73636b;
                        subject = subject2;
                        list = list111;
                    } else {
                        subject = subject2;
                        list = null;
                    }
                    arrayList = new ArrayList();
                    if (z11) {
                        if (subject.getTrailer() == null) {
                        }
                        this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                        Unit unit1119 = Unit.f75682a;
                        list2 = arrayList;
                        if (1 <= totalEpisode) {
                            i11 = 1;
                            while (true) {
                                if (list != null) {
                                    it = list.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        shortTVFirstEp = (ShortTVItem) next;
                                    } while (((ShortTVItem) next).getEp() != i11);
                                    shortTVFirstEp = (ShortTVItem) next;
                                } else {
                                    shortTVFirstEp = null;
                                }
                                if (i11 == 1) {
                                    c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus2 = 0;
                                    }
                                    c26719e2.m104515g(downloadStatus2);
                                    if (c26719e2.m104510b() != 5) {
                                        shortTVFirstEp = subject.getShortTVFirstEp();
                                    }
                                    c26719e2.m104516h(shortTVFirstEp);
                                    list2.add(c26719e2);
                                } else {
                                    c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus = 0;
                                    }
                                    c26719e.m104515g(downloadStatus);
                                    if (c26719e.m104510b() != 5) {
                                        shortTVFirstEp = null;
                                    }
                                    c26719e.m104516h(shortTVFirstEp);
                                    list2.add(c26719e);
                                }
                                if (i11 != totalEpisode) {
                                    i11++;
                                }
                            }
                        }
                        if (subject.getShortTVFavInfo() == null) {
                            shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                            if (shortTvFavoriteDaoM80298b0 != null) {
                                String str111113 = this.$subjectId;
                                this.L$0 = list2;
                                this.L$1 = subject;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 11;
                                objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str111113, this);
                                if (objMo79355a == objF) {
                                    return objF;
                                }
                                shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                                if (shortTvFavoriteStateBean != null) {
                                    shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                                }
                            }
                            subject.setShortTVFavInfo(shortTVFavInfo4);
                        }
                        arrayList = list2;
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                        break;
                    } else {
                        num = this.$dataSource;
                        if (num != null) {
                            return Unit.f75682a;
                        }
                        if (list != null) {
                        }
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "无网，显示下载数据, " + (list != null ? Boxing.m97634d(list.size()) : null), false, 4, null);
                        if (list != null) {
                            str = this.$subjectId;
                            while (r0.hasNext()) {
                                C26719e c26719e110 = new C26719e(str, shortTVItem.getEp(), null, 0, 12, null);
                                c26719e110.m104515g(shortTVItem.getDownloadStatus());
                                c26719e110.m104516h(shortTVItem);
                                arrayList.add(c26719e110);
                            }
                            Unit unit11110 = Unit.f75682a;
                        }
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(1));
                    }
                    this.this$0.m80381g1(false);
                    this.this$0.f61643q.mo14858q(arrayList);
                    return Unit.f75682a;
                case 8:
                    z11 = this.Z$0;
                    subject2 = (Subject) this.L$0;
                    ResultKt.m97107b(obj);
                    objMo79340a = obj;
                    c18845e = (C18845e) objMo79340a;
                    if (c18845e != null) {
                        unit = null;
                    } else {
                        unit = null;
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl(unit);
                    thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                    if (thM112710exceptionOrNullimpl != null) {
                        C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                    }
                    if (!Intrinsics.m97797c(subject2, this.this$0.f61633g.m14847f())) {
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "getShortTvInfo,set newSubject:" + this.$subjectId, false, 4, null);
                        this.this$0.f61633g.mo14858q(subject2);
                        C3187b0 c3187b17 = this.this$0.f61601D;
                        shortTVFavInfo = subject2.getShortTVFavInfo();
                        if (shortTVFavInfo != null) {
                            boolM97631a = Boxing.m97631a(shortTVFavInfo.getHasFavorite());
                        } else {
                            boolM97631a = null;
                        }
                        c3187b17.mo14858q(boolM97631a);
                    }
                    totalEpisode = subject2.getTotalEpisode();
                    interfaceC28213dM80392s0 = this.this$0.m80392s0();
                    if (interfaceC28213dM80392s0 != null) {
                        String str111114 = this.$subjectId;
                        this.L$0 = subject2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.Z$0 = z11;
                        this.I$0 = totalEpisode;
                        this.label = 9;
                        objMo73636b = interfaceC28213dM80392s0.mo73636b(str111114, this);
                        if (objMo73636b == objF) {
                            return objF;
                        }
                        List list112 = (List) objMo73636b;
                        subject = subject2;
                        list = list112;
                    } else {
                        subject = subject2;
                        list = null;
                    }
                    arrayList = new ArrayList();
                    if (z11) {
                        if (subject.getTrailer() == null) {
                        }
                        this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                        Unit unit11111 = Unit.f75682a;
                        list2 = arrayList;
                        if (1 <= totalEpisode) {
                            i11 = 1;
                            while (true) {
                                if (list != null) {
                                    it = list.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        shortTVFirstEp = (ShortTVItem) next;
                                    } while (((ShortTVItem) next).getEp() != i11);
                                    shortTVFirstEp = (ShortTVItem) next;
                                } else {
                                    shortTVFirstEp = null;
                                }
                                if (i11 == 1) {
                                    c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus2 = 0;
                                    }
                                    c26719e2.m104515g(downloadStatus2);
                                    if (c26719e2.m104510b() != 5) {
                                        shortTVFirstEp = subject.getShortTVFirstEp();
                                    }
                                    c26719e2.m104516h(shortTVFirstEp);
                                    list2.add(c26719e2);
                                } else {
                                    c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus = 0;
                                    }
                                    c26719e.m104515g(downloadStatus);
                                    if (c26719e.m104510b() != 5) {
                                        shortTVFirstEp = null;
                                    }
                                    c26719e.m104516h(shortTVFirstEp);
                                    list2.add(c26719e);
                                }
                                if (i11 != totalEpisode) {
                                    i11++;
                                }
                            }
                        }
                        if (subject.getShortTVFavInfo() == null) {
                            shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                            if (shortTvFavoriteDaoM80298b0 != null) {
                                String str111115 = this.$subjectId;
                                this.L$0 = list2;
                                this.L$1 = subject;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 11;
                                objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str111115, this);
                                if (objMo79355a == objF) {
                                    return objF;
                                }
                                shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                                if (shortTvFavoriteStateBean != null) {
                                    shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                                }
                            }
                            subject.setShortTVFavInfo(shortTVFavInfo4);
                        }
                        arrayList = list2;
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                        break;
                    } else {
                        num = this.$dataSource;
                        if (num != null) {
                            return Unit.f75682a;
                        }
                        if (list != null) {
                        }
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "无网，显示下载数据, " + (list != null ? Boxing.m97634d(list.size()) : null), false, 4, null);
                        if (list != null) {
                            str = this.$subjectId;
                            while (r0.hasNext()) {
                                C26719e c26719e111 = new C26719e(str, shortTVItem.getEp(), null, 0, 12, null);
                                c26719e111.m104515g(shortTVItem.getDownloadStatus());
                                c26719e111.m104516h(shortTVItem);
                                arrayList.add(c26719e111);
                            }
                            Unit unit11112 = Unit.f75682a;
                        }
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(1));
                    }
                    this.this$0.m80381g1(false);
                    this.this$0.f61643q.mo14858q(arrayList);
                    return Unit.f75682a;
                case 9:
                    totalEpisode = this.I$0;
                    z11 = this.Z$0;
                    subject2 = (Subject) this.L$0;
                    ResultKt.m97107b(obj);
                    objMo73636b = obj;
                    List list113 = (List) objMo73636b;
                    subject = subject2;
                    list = list113;
                    arrayList = new ArrayList();
                    if (z11) {
                        if (subject.getTrailer() == null) {
                        }
                        this.this$0.f61609L.mo14858q(Boxing.m97631a(false));
                        Unit unit11113 = Unit.f75682a;
                        list2 = arrayList;
                        if (1 <= totalEpisode) {
                            i11 = 1;
                            while (true) {
                                if (list != null) {
                                    it = list.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next = it.next();
                                        } else {
                                            next = null;
                                        }
                                        shortTVFirstEp = (ShortTVItem) next;
                                    } while (((ShortTVItem) next).getEp() != i11);
                                    shortTVFirstEp = (ShortTVItem) next;
                                } else {
                                    shortTVFirstEp = null;
                                }
                                if (i11 == 1) {
                                    c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus2 = 0;
                                    }
                                    c26719e2.m104515g(downloadStatus2);
                                    if (c26719e2.m104510b() != 5) {
                                        shortTVFirstEp = subject.getShortTVFirstEp();
                                    }
                                    c26719e2.m104516h(shortTVFirstEp);
                                    list2.add(c26719e2);
                                } else {
                                    c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                    if (shortTVFirstEp != null) {
                                        downloadStatus = shortTVFirstEp.getDownloadStatus();
                                    } else {
                                        downloadStatus = 0;
                                    }
                                    c26719e.m104515g(downloadStatus);
                                    if (c26719e.m104510b() != 5) {
                                        shortTVFirstEp = null;
                                    }
                                    c26719e.m104516h(shortTVFirstEp);
                                    list2.add(c26719e);
                                }
                                if (i11 != totalEpisode) {
                                    i11++;
                                }
                            }
                        }
                        if (subject.getShortTVFavInfo() == null) {
                            shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                            if (shortTvFavoriteDaoM80298b0 != null) {
                                String str111116 = this.$subjectId;
                                this.L$0 = list2;
                                this.L$1 = subject;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 11;
                                objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str111116, this);
                                if (objMo79355a == objF) {
                                    return objF;
                                }
                                shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                                if (shortTvFavoriteStateBean != null) {
                                    shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                                }
                            }
                            subject.setShortTVFavInfo(shortTVFavInfo4);
                        }
                        arrayList = list2;
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                        break;
                    } else {
                        num = this.$dataSource;
                        if (num != null) {
                            return Unit.f75682a;
                        }
                        if (list != null) {
                        }
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "无网，显示下载数据, " + (list != null ? Boxing.m97634d(list.size()) : null), false, 4, null);
                        if (list != null) {
                            str = this.$subjectId;
                            while (r0.hasNext()) {
                                C26719e c26719e112 = new C26719e(str, shortTVItem.getEp(), null, 0, 12, null);
                                c26719e112.m104515g(shortTVItem.getDownloadStatus());
                                c26719e112.m104516h(shortTVItem);
                                arrayList.add(c26719e112);
                            }
                            Unit unit11114 = Unit.f75682a;
                        }
                        this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(1));
                    }
                    this.this$0.m80381g1(false);
                    this.this$0.f61643q.mo14858q(arrayList);
                    return Unit.f75682a;
                case 10:
                    totalEpisode = this.I$0;
                    List list20 = (List) this.L$2;
                    list = (List) this.L$1;
                    subject = (Subject) this.L$0;
                    ResultKt.m97107b(obj);
                    arrayList = list20;
                    objM80288I0 = obj;
                    Boxing.m97631a(arrayList.add((C26719e) objM80288I0));
                    list2 = arrayList;
                    if (1 <= totalEpisode) {
                        i11 = 1;
                        while (true) {
                            if (list != null) {
                                it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = it.next();
                                    } else {
                                        next = null;
                                    }
                                    shortTVFirstEp = (ShortTVItem) next;
                                } while (((ShortTVItem) next).getEp() != i11);
                                shortTVFirstEp = (ShortTVItem) next;
                            } else {
                                shortTVFirstEp = null;
                            }
                            if (i11 == 1) {
                                c26719e2 = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                if (shortTVFirstEp != null) {
                                    downloadStatus2 = shortTVFirstEp.getDownloadStatus();
                                } else {
                                    downloadStatus2 = 0;
                                }
                                c26719e2.m104515g(downloadStatus2);
                                if (c26719e2.m104510b() != 5) {
                                    shortTVFirstEp = subject.getShortTVFirstEp();
                                }
                                c26719e2.m104516h(shortTVFirstEp);
                                list2.add(c26719e2);
                            } else {
                                c26719e = new C26719e(this.$subjectId, i11, null, 0, 12, null);
                                if (shortTVFirstEp != null) {
                                    downloadStatus = shortTVFirstEp.getDownloadStatus();
                                } else {
                                    downloadStatus = 0;
                                }
                                c26719e.m104515g(downloadStatus);
                                if (c26719e.m104510b() != 5) {
                                    shortTVFirstEp = null;
                                }
                                c26719e.m104516h(shortTVFirstEp);
                                list2.add(c26719e);
                            }
                            if (i11 != totalEpisode) {
                                i11++;
                            }
                        }
                    }
                    if (subject.getShortTVFavInfo() == null) {
                        shortTvFavoriteDaoM80298b0 = this.this$0.m80298b0();
                        if (shortTvFavoriteDaoM80298b0 != null) {
                            String str111117 = this.$subjectId;
                            this.L$0 = list2;
                            this.L$1 = subject;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 11;
                            objMo79355a = shortTvFavoriteDaoM80298b0.mo79355a(str111117, this);
                            if (objMo79355a == objF) {
                                return objF;
                            }
                            shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                            if (shortTvFavoriteStateBean != null) {
                                shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                            }
                        }
                        subject.setShortTVFavInfo(shortTVFavInfo4);
                    }
                    arrayList = list2;
                    this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                    this.this$0.m80381g1(false);
                    this.this$0.f61643q.mo14858q(arrayList);
                    return Unit.f75682a;
                case 11:
                    Subject subject11 = (Subject) this.L$1;
                    list2 = (List) this.L$0;
                    ResultKt.m97107b(obj);
                    subject = subject11;
                    objMo79355a = obj;
                    shortTvFavoriteStateBean = (ShortTvFavoriteStateBean) objMo79355a;
                    if (shortTvFavoriteStateBean != null) {
                        shortTVFavInfo4 = new ShortTVFavInfo(shortTvFavoriteStateBean.getFavoriteNum(), shortTvFavoriteStateBean.getHasFavorite(), shortTvFavoriteStateBean.getFavoriteTime());
                    }
                    subject.setShortTVFavInfo(shortTVFavInfo4);
                    arrayList = list2;
                    this.this$0.f61625a0.put(this.$subjectId + this.$ep, Boxing.m97634d(2));
                    this.this$0.m80381g1(false);
                    this.this$0.f61643q.mo14858q(arrayList);
                    return Unit.f75682a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th2) {
            Result.Companion companion18 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }
}
