package com.transsion.shorttv.viewmodel;

import androidx.core.view.InputDeviceCompat;
import com.transsion.shorttv.p314db.C18845e;
import com.transsion.shorttv.p314db.ShortTvAdUnlockDao;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvDownloadViewModel$saveAdUnlockedEps$1", m97637f = "ShortTvDownloadViewModel.kt", m97638l = {InputDeviceCompat.SOURCE_KEYBOARD}, m97639m = "invokeSuspend")
final class ShortTvDownloadViewModel$saveAdUnlockedEps$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Set<Integer> $eps;
    final /* synthetic */ String $subjectId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShortTvDownloadViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvDownloadViewModel$saveAdUnlockedEps$1(String str, Set<Integer> set, ShortTvDownloadViewModel shortTvDownloadViewModel, Continuation<? super ShortTvDownloadViewModel$saveAdUnlockedEps$1> continuation) {
        super(2, continuation);
        this.$subjectId = str;
        this.$eps = set;
        this.this$0 = shortTvDownloadViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShortTvDownloadViewModel$saveAdUnlockedEps$1 shortTvDownloadViewModel$saveAdUnlockedEps$1 = new ShortTvDownloadViewModel$saveAdUnlockedEps$1(this.$subjectId, this.$eps, this.this$0, continuation);
        shortTvDownloadViewModel$saveAdUnlockedEps$1.L$0 = obj;
        return shortTvDownloadViewModel$saveAdUnlockedEps$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvDownloadViewModel$saveAdUnlockedEps$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0066, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        Throwable thM112710exceptionOrNullimpl;
        Unit unit;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                String str = this.$subjectId;
                Set<Integer> set = this.$eps;
                ShortTvDownloadViewModel shortTvDownloadViewModel = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                C18845e c18845e = new C18845e(str, CollectionsKt.m97369s0(set, ",", null, null, 0, null, null, 62, null));
                ShortTvAdUnlockDao shortTvAdUnlockDaoM80261h = shortTvDownloadViewModel.m80261h();
                if (shortTvAdUnlockDaoM80261h != null) {
                    this.label = 1;
                    if (shortTvAdUnlockDaoM80261h.mo79341b(c18845e, this) == objF) {
                        return objF;
                    }
                } else {
                    unit = null;
                }
                objM112707constructorimpl = Result.m112707constructorimpl(unit);
                thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                if (thM112710exceptionOrNullimpl != null) {
                    C26866a.a.m104901l(C26866a.f81698a, "ShortTvDownload", "saveAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
                }
                return Unit.f75682a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            unit = Unit.f75682a;
            objM112707constructorimpl = Result.m112707constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104901l(C26866a.f81698a, "ShortTvDownload", "saveAdUnlockedEps error: " + thM112710exceptionOrNullimpl, false, 4, null);
        }
        return Unit.f75682a;
    }
}
