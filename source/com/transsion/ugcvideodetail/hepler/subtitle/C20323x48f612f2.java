package com.transsion.ugcvideodetail.hepler.subtitle;

import androidx.p1004lifecycle.C3187b0;
import com.transsion.subtitle.helper.AbstractC19718c;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import java.util.ArrayList;
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
import kotlinx.coroutines.InterfaceC25149n0;
import p528ju.C24469a;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.subtitle.UGCImmVideoSubtitleControlImp$downloadListener$1$onSaveDownload$1 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.ugcvideodetail.hepler.subtitle.UGCImmVideoSubtitleControlImp$downloadListener$1$onSaveDownload$1", m97637f = "UGCImmVideoSubtitleControlImp.kt", m97638l = {}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class C20323x48f612f2 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ SubtitleDownloadTable $bean;
    int label;
    final /* synthetic */ UGCImmVideoSubtitleControlImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C20323x48f612f2(UGCImmVideoSubtitleControlImp uGCImmVideoSubtitleControlImp, SubtitleDownloadTable subtitleDownloadTable, Continuation<? super C20323x48f612f2> continuation) {
        super(2, continuation);
        this.this$0 = uGCImmVideoSubtitleControlImp;
        this.$bean = subtitleDownloadTable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C20323x48f612f2(this.this$0, this.$bean, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((C20323x48f612f2) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List arrayList;
        Object next;
        C3187b0 c3187b0M84138d;
        C3187b0 c3187b0M84138d2;
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        C20324a c20324a = this.this$0.f64425e;
        if (c20324a == null || (c3187b0M84138d2 = c20324a.m84138d()) == null || (arrayList = (List) c3187b0M84138d2.m14847f()) == null) {
            arrayList = new ArrayList();
        }
        SubtitleDownloadTable subtitleDownloadTable = this.$bean;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C24469a c24469a = (C24469a) next;
            if (Intrinsics.m97797c(c24469a.m96011b().getId(), subtitleDownloadTable.getId()) && c24469a.m96011b().getResourceStreamType() == subtitleDownloadTable.getResourceStreamType()) {
                break;
            }
        }
        SubtitleDownloadTable subtitleDownloadTable2 = this.$bean;
        UGCImmVideoSubtitleControlImp uGCImmVideoSubtitleControlImp = this.this$0;
        if (((C24469a) next) == null) {
            C24469a c24469a2 = new C24469a(subtitleDownloadTable2);
            arrayList.add(c24469a2);
            C20324a c20324a2 = uGCImmVideoSubtitleControlImp.f64425e;
            if (c20324a2 != null && (c3187b0M84138d = c20324a2.m84138d()) != null) {
                c3187b0M84138d.mo14858q(arrayList);
            }
            uGCImmVideoSubtitleControlImp.f64424d.setSubtitlePath(subtitleDownloadTable2.getPath(), AbstractC19718c.m82168b(c24469a2));
            C26866a.a.m104898f(C26866a.f81698a, uGCImmVideoSubtitleControlImp.f64428h, " onSaveDownload() --> " + arrayList.size() + ",  设置字幕：" + subtitleDownloadTable2.getName() + "," + subtitleDownloadTable2.getLanName(), false, 4, null);
        }
        C26866a.a.m104898f(C26866a.f81698a, this.this$0.f64428h, " onSaveDownload() --> 添加到数据库", false, 4, null);
        return Unit.f75682a;
    }
}
