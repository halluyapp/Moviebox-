package com.transsion.subtitle_download.task;

import android.app.Application;
import com.blankj.utilcode.util.Utils;
import com.transsion.subtitle_download.p319db.SubtitleDownloadDatabase;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import ru.InterfaceC27376a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.subtitle_download.task.GetInStationSubtitleListTask$download$2", m97637f = "GetInStationSubtitleListTask.kt", m97638l = {180}, m97639m = "invokeSuspend")
final class GetInStationSubtitleListTask$download$2 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ SubtitleDownloadTable $dbBean;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetInStationSubtitleListTask$download$2(SubtitleDownloadTable subtitleDownloadTable, Continuation<? super GetInStationSubtitleListTask$download$2> continuation) {
        super(2, continuation);
        this.$dbBean = subtitleDownloadTable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetInStationSubtitleListTask$download$2(this.$dbBean, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((GetInStationSubtitleListTask$download$2) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SubtitleDownloadTable subtitleDownloadTableMo106544c;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            SubtitleDownloadDatabase.Companion companion = SubtitleDownloadDatabase.INSTANCE;
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            subtitleDownloadTableMo106544c = companion.m82292b(applicationM27275a).mo82290l0().mo106544c(this.$dbBean.getId(), this.$dbBean.getResourceStreamType());
            if (subtitleDownloadTableMo106544c == null) {
                Application applicationM27275a2 = Utils.m27275a();
                Intrinsics.m97801g(applicationM27275a2, "getApp(...)");
                InterfaceC27376a interfaceC27376aMo82290l0 = companion.m82292b(applicationM27275a2).mo82290l0();
                SubtitleDownloadTable subtitleDownloadTable = this.$dbBean;
                this.label = 1;
                if (interfaceC27376aMo82290l0.mo106546e(subtitleDownloadTable, this) == objF) {
                    return objF;
                }
            } else {
                subtitleDownloadTableMo106544c.setSetImmediately(this.$dbBean.getIsSetImmediately());
            }
            C19768p.f63082a.m82355d(subtitleDownloadTableMo106544c, true);
            return Unit.f75682a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        subtitleDownloadTableMo106544c = this.$dbBean;
        C19768p.f63082a.m82355d(subtitleDownloadTableMo106544c, true);
        return Unit.f75682a;
    }
}
