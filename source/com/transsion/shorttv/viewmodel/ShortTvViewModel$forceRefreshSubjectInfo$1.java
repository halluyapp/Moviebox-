package com.transsion.shorttv.viewmodel;

import androidx.p1004lifecycle.C3187b0;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.shorttv.bean.ShortTVFavInfo;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.p314db.C18845e;
import com.transsion.shorttv.p314db.ShortTvAdUnlockDao;
import es.C23219b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p790ts.InterfaceC27847a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvViewModel$forceRefreshSubjectInfo$1", m97637f = "ShortTvViewModel.kt", m97638l = {875, 888, 895}, m97639m = "invokeSuspend")
final class ShortTvViewModel$forceRefreshSubjectInfo$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $subjectId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShortTvViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.shorttv.viewmodel.ShortTvViewModel$forceRefreshSubjectInfo$1$3 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvViewModel$forceRefreshSubjectInfo$1$3", m97637f = "ShortTvViewModel.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C191773 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Subject $newSubject;
        int label;
        final /* synthetic */ ShortTvViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C191773(ShortTvViewModel shortTvViewModel, Subject subject, Continuation<? super C191773> continuation) {
            super(2, continuation);
            this.this$0 = shortTvViewModel;
            this.$newSubject = subject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C191773(this.this$0, this.$newSubject, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C191773) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            this.this$0.f61633g.mo14858q(this.$newSubject);
            C3187b0 c3187b0 = this.this$0.f61601D;
            ShortTVFavInfo shortTVFavInfo = this.$newSubject.getShortTVFavInfo();
            c3187b0.mo14858q(shortTVFavInfo != null ? Boxing.m97631a(shortTVFavInfo.getHasFavorite()) : null);
            C3187b0 c3187b0M80385l0 = this.this$0.m80385l0();
            Unit unit = Unit.f75682a;
            c3187b0M80385l0.mo14858q(unit);
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvViewModel$forceRefreshSubjectInfo$1(ShortTvViewModel shortTvViewModel, String str, Continuation<? super ShortTvViewModel$forceRefreshSubjectInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = shortTvViewModel;
        this.$subjectId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShortTvViewModel$forceRefreshSubjectInfo$1 shortTvViewModel$forceRefreshSubjectInfo$1 = new ShortTvViewModel$forceRefreshSubjectInfo$1(this.this$0, this.$subjectId, continuation);
        shortTvViewModel$forceRefreshSubjectInfo$1.L$0 = obj;
        return shortTvViewModel$forceRefreshSubjectInfo$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvViewModel$forceRefreshSubjectInfo$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00e5 A[PHI: r1
      0x00e5: PHI (r1v5 com.transsion.shorttv.bean.Subject) = 
      (r1v30 com.transsion.shorttv.bean.Subject)
      (r1v31 com.transsion.shorttv.bean.Subject)
      (r1v32 com.transsion.shorttv.bean.Subject)
     binds: [B:47:0x00b9, B:52:0x00c8, B:54:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:68:0x012b A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x00fb, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.transsion.shorttv.bean.Subject] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Subject subject;
        Object objM112707constructorimpl;
        Subject subject2;
        Unit unit;
        ?? r11;
        Throwable thM112710exceptionOrNullimpl;
        AbstractC24917a2 abstractC24917a2M99269c;
        C191773 c191773;
        Subject subject3;
        C18845e c18845e;
        Set setM79371c;
        Object objF = IntrinsicsKt.m97630f();
        ?? r12 = this.label;
        try {
            try {
                if (r12 != 0) {
                    if (r12 == 1) {
                        ResultKt.m97107b(obj);
                    } else if (r12 == 2) {
                        Subject subject4 = (Subject) this.L$0;
                        ResultKt.m97107b(obj);
                        subject3 = subject4;
                        subject3 = subject;
                        c18845e = (C18845e) obj;
                        subject2 = subject3;
                        if (c18845e != null || (setM79371c = c18845e.m79371c()) == null) {
                            subject2 = subject3;
                            unit = null;
                            r12 = subject2;
                        } else {
                            if (!setM79371c.isEmpty()) {
                                subject2 = subject3;
                                subject3.getAdUnlockedEps().addAll(setM79371c);
                            }
                            subject2 = subject3;
                            unit = Unit.f75682a;
                            r12 = subject3;
                        }
                        objM112707constructorimpl = Result.m112707constructorimpl(unit);
                        r11 = r12;
                        thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                        if (thM112710exceptionOrNullimpl != null) {
                            C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "forceRefreshSubjectInfo loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                        }
                        abstractC24917a2M99269c = C25220y0.m99269c();
                        c191773 = new C191773(this.this$0, r11, null);
                        this.L$0 = null;
                        this.label = 3;
                        if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c191773, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (r12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m97107b(obj);
                    }
                    return Unit.f75682a;
                }
                ResultKt.m97107b(obj);
                InterfaceC25149n0 interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
                InterfaceC27847a interfaceC27847a = this.this$0.f61624a;
                String str = this.$subjectId;
                this.L$0 = interfaceC25149n0;
                this.label = 1;
                obj = InterfaceC27847a.a.m108246d(interfaceC27847a, str, null, this, 2, null);
                if (obj == objF) {
                    return objF;
                }
                BaseDto baseDto = (BaseDto) obj;
                Subject subject5 = baseDto != null ? (Subject) baseDto.getData() : null;
                C23219b.f70761a.m92282e(subject5);
                if (subject5 != null) {
                    Subject subject6 = (Subject) this.this$0.f61633g.m14847f();
                    subject5.setOps(subject6 != null ? subject6.getOps() : null);
                }
                this.this$0.m80327r1(this.$subjectId, subject5 != null ? subject5.getShortTVFavInfo() : null);
                subject = subject5;
            } catch (Throwable th2) {
                Result.Companion companion = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
                r11 = r12;
            }
        } catch (Exception e11) {
            C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "forceRefreshSubjectInfo error: " + e11, false, 4, null);
            subject = null;
        }
        if (subject == null) {
            return Unit.f75682a;
        }
        ShortTvViewModel shortTvViewModel = this.this$0;
        String str2 = this.$subjectId;
        Result.Companion companion2 = Result.INSTANCE;
        ShortTvAdUnlockDao shortTvAdUnlockDaoM80294U = shortTvViewModel.m80294U();
        subject2 = subject;
        if (shortTvAdUnlockDaoM80294U != null) {
            this.L$0 = subject;
            this.label = 2;
            obj = shortTvAdUnlockDaoM80294U.mo79340a(str2, this);
            if (obj == objF) {
                subject3 = subject;
                return objF;
            }
            subject3 = subject;
            c18845e = (C18845e) obj;
            subject2 = subject3;
            if (c18845e != null) {
                subject2 = subject3;
                unit = null;
                r12 = subject2;
            } else {
                subject2 = subject3;
                unit = null;
                r12 = subject2;
            }
        } else {
            subject2 = subject3;
            unit = null;
            r12 = subject2;
        }
        objM112707constructorimpl = Result.m112707constructorimpl(unit);
        r11 = r12;
        thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104901l(C26866a.f81698a, "ShortTvViewModel", "forceRefreshSubjectInfo loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
        }
        abstractC24917a2M99269c = C25220y0.m99269c();
        c191773 = new C191773(this.this$0, r11, null);
        this.L$0 = null;
        this.label = 3;
        if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c191773, this) == objF) {
            return objF;
        }
        return Unit.f75682a;
    }
}
