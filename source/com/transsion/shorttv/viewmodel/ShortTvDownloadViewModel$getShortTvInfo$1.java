package com.transsion.shorttv.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
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
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p790ts.InterfaceC27847a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvDownloadViewModel$getShortTvInfo$1", m97637f = "ShortTvDownloadViewModel.kt", m97638l = {78, 86, 97}, m97639m = "invokeSuspend")
final class ShortTvDownloadViewModel$getShortTvInfo$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $forLoginRefresh;
    final /* synthetic */ String $subjectId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShortTvDownloadViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.shorttv.viewmodel.ShortTvDownloadViewModel$getShortTvInfo$1$3 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvDownloadViewModel$getShortTvInfo$1$3", m97637f = "ShortTvDownloadViewModel.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C191723 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $forLoginRefresh;
        final /* synthetic */ Subject $subject;
        int label;
        final /* synthetic */ ShortTvDownloadViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C191723(ShortTvDownloadViewModel shortTvDownloadViewModel, Subject subject, boolean z11, Continuation<? super C191723> continuation) {
            super(2, continuation);
            this.this$0 = shortTvDownloadViewModel;
            this.$subject = subject;
            this.$forLoginRefresh = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C191723(this.this$0, this.$subject, this.$forLoginRefresh, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C191723) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            this.this$0.m80271p().mo14858q(this.$subject);
            if (this.$forLoginRefresh) {
                this.this$0.m80267j().mo14858q(Unit.f75682a);
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvDownloadViewModel$getShortTvInfo$1(String str, ShortTvDownloadViewModel shortTvDownloadViewModel, boolean z11, Continuation<? super ShortTvDownloadViewModel$getShortTvInfo$1> continuation) {
        super(2, continuation);
        this.$subjectId = str;
        this.this$0 = shortTvDownloadViewModel;
        this.$forLoginRefresh = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShortTvDownloadViewModel$getShortTvInfo$1 shortTvDownloadViewModel$getShortTvInfo$1 = new ShortTvDownloadViewModel$getShortTvInfo$1(this.$subjectId, this.this$0, this.$forLoginRefresh, continuation);
        shortTvDownloadViewModel$getShortTvInfo$1.L$0 = obj;
        return shortTvDownloadViewModel$getShortTvInfo$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvDownloadViewModel$getShortTvInfo$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00de A[PHI: r1
      0x00de: PHI (r1v4 ??) = (r1v24 ??), (r1v25 ??), (r1v26 ??) binds: [B:32:0x0093, B:37:0x00a2, B:39:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:53:0x012b A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x00f4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v8, types: [es.b] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.transsion.shorttv.bean.Subject] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.transsion.shorttv.bean.Subject] */
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
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r11;
        Object objM112707constructorimpl;
        ?? r12;
        Unit unit;
        AbstractC24917a2 abstractC24917a2M99269c;
        C191723 c191723;
        Throwable thM112710exceptionOrNullimpl;
        ?? r13;
        C18845e c18845e;
        Set setM79371c;
        Object objF = IntrinsicsKt.m97630f();
        ?? r14 = this.label;
        try {
            try {
                if (r14 != 0) {
                    if (r14 == 1) {
                        ResultKt.m97107b(obj);
                    } else if (r14 == 2) {
                        Subject subject = (Subject) this.L$0;
                        ResultKt.m97107b(obj);
                        r13 = subject;
                        r13 = r11;
                        c18845e = (C18845e) obj;
                        r12 = r13;
                        if (c18845e != null || (setM79371c = c18845e.m79371c()) == null) {
                            r12 = r13;
                            unit = null;
                            r14 = r12;
                        } else {
                            C26866a.a.m104905r(C26866a.f81698a, "ShortTvDownload", new String[]{"loadAdUnlockedEps result=" + setM79371c}, false, 4, null);
                            if (!setM79371c.isEmpty()) {
                                r12 = r13;
                                r13.getAdUnlockedEps().addAll(setM79371c);
                            }
                            r12 = r13;
                            unit = Unit.f75682a;
                            r14 = r13;
                        }
                        objM112707constructorimpl = Result.m112707constructorimpl(unit);
                        r11 = r14;
                        thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                        if (thM112710exceptionOrNullimpl != null) {
                            C26866a.a.m104901l(C26866a.f81698a, "ShortTvDownload", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                        }
                        C23219b.f70761a.m92282e(r11);
                        abstractC24917a2M99269c = C25220y0.m99269c();
                        c191723 = new C191723(this.this$0, r11, this.$forLoginRefresh, null);
                        this.L$0 = null;
                        this.label = 3;
                        if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c191723, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (r14 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m97107b(obj);
                    }
                    return Unit.f75682a;
                }
                ResultKt.m97107b(obj);
                InterfaceC25149n0 interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
                C26866a.a.m104898f(C26866a.f81698a, "ShortTvDownload", "getShortTvInfo, subjectId = " + this.$subjectId, false, 4, null);
                InterfaceC27847a interfaceC27847aM80262k = this.this$0.m80262k();
                String str = this.$subjectId;
                this.L$0 = interfaceC25149n0;
                this.label = 1;
                obj = InterfaceC27847a.a.m108246d(interfaceC27847aM80262k, str, null, this, 2, null);
                if (obj == objF) {
                    return objF;
                }
                BaseDto baseDto = (BaseDto) obj;
                r11 = Intrinsics.m97797c(baseDto.getCode(), "0") ? (Subject) baseDto.getData() : null;
            } catch (Throwable th2) {
                Result.Companion companion = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
                r11 = r14;
            }
        } catch (Exception unused) {
            r11 = 0;
        }
        if (r11 != 0) {
            ShortTvDownloadViewModel shortTvDownloadViewModel = this.this$0;
            String str2 = this.$subjectId;
            Result.Companion companion2 = Result.INSTANCE;
            ShortTvAdUnlockDao shortTvAdUnlockDaoM80261h = shortTvDownloadViewModel.m80261h();
            r12 = r11;
            if (shortTvAdUnlockDaoM80261h != null) {
                this.L$0 = r11;
                this.label = 2;
                obj = shortTvAdUnlockDaoM80261h.mo79340a(str2, this);
                if (obj == objF) {
                    r13 = r11;
                    return objF;
                }
                r13 = r11;
                c18845e = (C18845e) obj;
                r12 = r13;
                if (c18845e != null) {
                    r12 = r13;
                    unit = null;
                    r14 = r12;
                } else {
                    r12 = r13;
                    unit = null;
                    r14 = r12;
                }
            } else {
                r12 = r13;
                unit = null;
                r14 = r12;
            }
            objM112707constructorimpl = Result.m112707constructorimpl(unit);
            r11 = r14;
            thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
            if (thM112710exceptionOrNullimpl != null) {
                C26866a.a.m104901l(C26866a.f81698a, "ShortTvDownload", "loadAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
            }
        }
        C23219b.f70761a.m92282e(r11);
        abstractC24917a2M99269c = C25220y0.m99269c();
        c191723 = new C191723(this.this$0, r11, this.$forLoginRefresh, null);
        this.L$0 = null;
        this.label = 3;
        if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c191723, this) == objF) {
            return objF;
        }
        return Unit.f75682a;
    }
}
