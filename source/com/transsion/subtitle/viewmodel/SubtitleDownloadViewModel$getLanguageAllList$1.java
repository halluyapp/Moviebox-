package com.transsion.subtitle.viewmodel;

import com.transsion.baselib.p291db.download.SubtitleLanguageMapBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p648oj.InterfaceC26246d1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel$getLanguageAllList$1", m97637f = "SubtitleDownloadViewModel.kt", m97638l = {84}, m97639m = "invokeSuspend")
final class SubtitleDownloadViewModel$getLanguageAllList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SubtitleDownloadViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubtitleDownloadViewModel$getLanguageAllList$1(SubtitleDownloadViewModel subtitleDownloadViewModel, Continuation<? super SubtitleDownloadViewModel$getLanguageAllList$1> continuation) {
        super(2, continuation);
        this.this$0 = subtitleDownloadViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubtitleDownloadViewModel$getLanguageAllList$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SubtitleDownloadViewModel$getLanguageAllList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        ArrayList arrayList;
        List list2;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC26246d1 interfaceC26246d1M82242q = this.this$0.m82242q();
            if (interfaceC26246d1M82242q != null) {
                this.label = 1;
                obj = interfaceC26246d1M82242q.mo102777a(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                list = null;
            }
            arrayList = new ArrayList();
            list2 = list;
            if (list2 != null || list2.isEmpty()) {
                arrayList.add(new SubtitleLanguageMapBean("en", "eng", "English", true));
            } else {
                arrayList.addAll(list2);
            }
            this.this$0.m82251j().mo14855n(arrayList);
            return Unit.f75682a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        list = (List) obj;
        arrayList = new ArrayList();
        list2 = list;
        if (list2 != null) {
            arrayList.add(new SubtitleLanguageMapBean("en", "eng", "English", true));
        } else {
            arrayList.add(new SubtitleLanguageMapBean("en", "eng", "English", true));
        }
        this.this$0.m82251j().mo14855n(arrayList);
        return Unit.f75682a;
    }
}
