package com.transsion.subtitle_download.utils;

import android.app.Application;
import com.blankj.utilcode.util.Utils;
import com.transsion.subtitle_download.p319db.SubtitleDownloadDatabase;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.subtitle_download.task.C19768p;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25207u0;
import kotlinx.coroutines.InterfaceC25149n0;
import p743rh.C27287m;
import ru.InterfaceC27376a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.subtitle_download.utils.ObserveNetworkState$retryDownload$1", m97637f = "ObserveNetworkState.kt", m97638l = {59, 66}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class ObserveNetworkState$retryDownload$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $msg;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ObserveNetworkState$retryDownload$1(String str, Continuation<? super ObserveNetworkState$retryDownload$1> continuation) {
        super(2, continuation);
        this.$msg = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ObserveNetworkState$retryDownload$1(this.$msg, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ObserveNetworkState$retryDownload$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x0092 A[LOOP:0: B:23:0x008c->B:25:0x0092, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x0059, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        Iterator it;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.m97107b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            list = (List) obj;
            if (list != null) {
                String str = this.$msg;
                C19771b.f63088a.m82365a(ObserveNetworkState.f63086a.m82361b() + " --> retryDownload() --> " + str + " --> 数据库获取到的失败的任务数量 it.size = " + list.size());
                it = list.iterator();
                while (it.hasNext()) {
                    C19768p.m82348e(C19768p.f63082a, (SubtitleDownloadTable) it.next(), false, 2, null);
                }
            }
            return Unit.f75682a;
        }
        ResultKt.m97107b(obj);
        this.label = 1;
        if (AbstractC25207u0.m99223a(5000L, this) == objF) {
            return objF;
        }
        if (!C27287m.f83003a.m106330e()) {
            return Unit.f75682a;
        }
        SubtitleDownloadDatabase.Companion companion = SubtitleDownloadDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        InterfaceC27376a interfaceC27376aMo82290l0 = companion.m82292b(applicationM27275a).mo82290l0();
        this.label = 2;
        obj = InterfaceC27376a.a.m106549a(interfaceC27376aMo82290l0, 0, this, 1, null);
        if (obj == objF) {
            return objF;
        }
        list = (List) obj;
        if (list != null) {
            String str2 = this.$msg;
            C19771b.f63088a.m82365a(ObserveNetworkState.f63086a.m82361b() + " --> retryDownload() --> " + str2 + " --> 数据库获取到的失败的任务数量 it.size = " + list.size());
            it = list.iterator();
            while (it.hasNext()) {
                C19768p.m82348e(C19768p.f63082a, (SubtitleDownloadTable) it.next(), false, 2, null);
            }
        }
        return Unit.f75682a;
    }
}
