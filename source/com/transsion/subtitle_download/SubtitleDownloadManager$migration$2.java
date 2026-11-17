package com.transsion.subtitle_download;

import android.app.Application;
import com.blankj.utilcode.util.Utils;
import com.transsion.subtitle_download.p319db.SubtitleDownloadDatabase;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.subtitle_download.utils.C19771b;
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
@DebugMetadata(m97636c = "com.transsion.subtitle_download.SubtitleDownloadManager$migration$2", m97637f = "SubtitleDownloadManager.kt", m97638l = {244}, m97639m = "invokeSuspend")
final class SubtitleDownloadManager$migration$2 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ SubtitleDownloadTable $dbBean;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubtitleDownloadManager$migration$2(SubtitleDownloadTable subtitleDownloadTable, Continuation<? super SubtitleDownloadManager$migration$2> continuation) {
        super(2, continuation);
        this.$dbBean = subtitleDownloadTable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubtitleDownloadManager$migration$2(this.$dbBean, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SubtitleDownloadManager$migration$2) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            SubtitleDownloadDatabase.Companion companion = SubtitleDownloadDatabase.INSTANCE;
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            if (companion.m82292b(applicationM27275a).mo82290l0().mo106544c(this.$dbBean.getId(), this.$dbBean.getResourceStreamType()) == null) {
                Application applicationM27275a2 = Utils.m27275a();
                Intrinsics.m97801g(applicationM27275a2, "getApp(...)");
                InterfaceC27376a interfaceC27376aMo82290l0 = companion.m82292b(applicationM27275a2).mo82290l0();
                SubtitleDownloadTable subtitleDownloadTable = this.$dbBean;
                this.label = 1;
                if (interfaceC27376aMo82290l0.mo106546e(subtitleDownloadTable, this) == objF) {
                    return objF;
                }
            } else {
                C19771b.f63088a.m82365a(SubtitleDownloadManager.f63041a.m82261i() + " --> migration() --> 字幕迁移 --> 已经存在 --> 不需要插入数据库");
            }
            return Unit.f75682a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        C19771b.f63088a.m82365a(SubtitleDownloadManager.f63041a.m82261i() + " --> migration() --> 字幕迁移 --> 插入数据库 -- success");
        return Unit.f75682a;
    }
}
