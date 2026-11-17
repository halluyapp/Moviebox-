package com.transsion.subtitle_download;

import android.app.Application;
import com.blankj.utilcode.util.Utils;
import com.transsion.subtitle_download.p319db.SubtitleDownloadDatabase;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.subtitle_download.utils.C19774e;
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
import kotlinx.coroutines.InterfaceC25149n0;
import ru.InterfaceC27376a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "Lcom/transsion/subtitle_download/db/SubtitleDownloadTable;", "<anonymous>", "(Lkotlinx/coroutines/n0;)Ljava/util/List;"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.subtitle_download.SubtitleDownloadManager$getSubtitleList$2", m97637f = "SubtitleDownloadManager.kt", m97638l = {127}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class SubtitleDownloadManager$getSubtitleList$2 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super List<SubtitleDownloadTable>>, Object> {
    final /* synthetic */ String $resourceId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubtitleDownloadManager$getSubtitleList$2(String str, Continuation<? super SubtitleDownloadManager$getSubtitleList$2> continuation) {
        super(2, continuation);
        this.$resourceId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubtitleDownloadManager$getSubtitleList$2(this.$resourceId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super List<SubtitleDownloadTable>> continuation) {
        return ((SubtitleDownloadManager$getSubtitleList$2) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            SubtitleDownloadDatabase.Companion c19749d = SubtitleDownloadDatabase.INSTANCE;
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            InterfaceC27376a interfaceC27376aMo82290l0 = c19749d.m82292b(applicationM27275a).mo82290l0();
            String str = this.$resourceId;
            this.label = 1;
            obj = interfaceC27376aMo82290l0.mo106542a(str, this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        List<SubtitleDownloadTable> list = (List) obj;
        if (list != null) {
            for (SubtitleDownloadTable subtitleDownloadTable : list) {
                if (!C19774e.f63091a.m82379i(subtitleDownloadTable.getPath())) {
                    subtitleDownloadTable.setStatus(0);
                }
            }
        }
        return list;
    }
}
