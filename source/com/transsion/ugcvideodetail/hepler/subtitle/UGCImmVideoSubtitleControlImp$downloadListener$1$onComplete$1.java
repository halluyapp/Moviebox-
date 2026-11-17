package com.transsion.ugcvideodetail.hepler.subtitle;

import androidx.p1004lifecycle.C3187b0;
import com.transsion.subtitle.helper.AbstractC19718c;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.subtitle_download.utils.C19773d;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.ugcvideodetail.hepler.subtitle.UGCImmVideoSubtitleControlImp$downloadListener$1$onComplete$1", m97637f = "UGCImmVideoSubtitleControlImp.kt", m97638l = {}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class UGCImmVideoSubtitleControlImp$downloadListener$1$onComplete$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ SubtitleDownloadTable $stDownloadTable;
    int label;
    final /* synthetic */ UGCImmVideoSubtitleControlImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UGCImmVideoSubtitleControlImp$downloadListener$1$onComplete$1(UGCImmVideoSubtitleControlImp uGCImmVideoSubtitleControlImp, SubtitleDownloadTable subtitleDownloadTable, Continuation<? super UGCImmVideoSubtitleControlImp$downloadListener$1$onComplete$1> continuation) {
        super(2, continuation);
        this.this$0 = uGCImmVideoSubtitleControlImp;
        this.$stDownloadTable = subtitleDownloadTable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCImmVideoSubtitleControlImp$downloadListener$1$onComplete$1(this.this$0, this.$stDownloadTable, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UGCImmVideoSubtitleControlImp$downloadListener$1$onComplete$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List arrayList;
        Object obj2;
        Object next;
        C3187b0 c3187b0M84138d;
        Object next2;
        C3187b0 c3187b0M84138d2;
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        if (!Intrinsics.m97797c(this.this$0.m84133u(), this.$stDownloadTable.getResourceId())) {
            C26866a.a.m104898f(C26866a.f81698a, this.this$0.f64428h, " onComplete() --> 字幕下载成功，不是当前视频，不做处理", false, 4, null);
            return Unit.f75682a;
        }
        C20324a c20324a = this.this$0.f64425e;
        if (c20324a == null || (c3187b0M84138d2 = c20324a.m84138d()) == null || (arrayList = (List) c3187b0M84138d2.m14847f()) == null) {
            arrayList = new ArrayList();
        }
        List list = arrayList;
        SubtitleDownloadTable subtitleDownloadTable = this.$stDownloadTable;
        Iterator it = list.iterator();
        while (true) {
            obj2 = null;
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
        SubtitleDownloadTable subtitleDownloadTable2 = this.$stDownloadTable;
        UGCImmVideoSubtitleControlImp uGCImmVideoSubtitleControlImp = this.this$0;
        C24469a c24469a2 = (C24469a) next;
        if (c24469a2 != null) {
            c24469a2.m96017h(subtitleDownloadTable2);
        } else {
            C24469a c24469a3 = new C24469a(subtitleDownloadTable2);
            arrayList.add(c24469a3);
            C20324a c20324a2 = uGCImmVideoSubtitleControlImp.f64425e;
            if (c20324a2 != null && (c3187b0M84138d = c20324a2.m84138d()) != null) {
                c3187b0M84138d.mo14858q(arrayList);
            }
            uGCImmVideoSubtitleControlImp.f64424d.setSubtitlePath(subtitleDownloadTable2.getPath(), AbstractC19718c.m82168b(c24469a3));
        }
        SubtitleDownloadTable subtitleDownloadTable3 = this.$stDownloadTable;
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.m97797c(((C24469a) next2).m96011b().getId(), subtitleDownloadTable3.getId()));
        C24469a c24469a4 = (C24469a) next2;
        if (c24469a4 == null) {
            c24469a4 = new C24469a(this.$stDownloadTable);
        }
        if (this.$stDownloadTable.getIsAutoDownload()) {
            String string = C19773d.f63089a.m82370b().getString("k_subtitle_select_lan", null);
            for (Object obj3 : list) {
                if (Intrinsics.m97797c(((C24469a) obj3).m96011b().getLan(), string)) {
                    obj2 = obj3;
                    break;
                }
            }
            if (((C24469a) obj2) == null || string == null || string.length() == 0 || Intrinsics.m97797c(string, this.$stDownloadTable.getLan())) {
                c24469a4.m96021l(true);
            }
        } else {
            c24469a4.m96021l(true);
        }
        C26866a.a.m104905r(C26866a.f81698a, this.this$0.f64428h, new String[]{" onComplete() --> 字幕下载成功：" + this.$stDownloadTable.getName() + "," + this.$stDownloadTable.getLanName() + ", isSelect:" + c24469a4.m96015f()}, false, 4, null);
        this.this$0.f64424d.setSubtitlePath(this.$stDownloadTable.getPath(), AbstractC19718c.m82168b(c24469a4));
        if (c24469a4.m96015f()) {
            this.this$0.mo84132f(c24469a4);
        }
        return Unit.f75682a;
    }
}
