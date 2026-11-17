package com.transsion.shorttv.subtitle;

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
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import p955ys.C29007b;
import p989zs.AbstractC29242a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.subtitle.ShortTVSubtitleControlImp$downloadListener$1$onComplete$1", m97637f = "ShortTVSubtitleControlImp.kt", m97638l = {}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class ShortTVSubtitleControlImp$downloadListener$1$onComplete$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ SubtitleDownloadTable $stDownloadTable;
    int label;
    final /* synthetic */ ShortTVSubtitleControlImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTVSubtitleControlImp$downloadListener$1$onComplete$1(ShortTVSubtitleControlImp shortTVSubtitleControlImp, SubtitleDownloadTable subtitleDownloadTable, Continuation<? super ShortTVSubtitleControlImp$downloadListener$1$onComplete$1> continuation) {
        super(2, continuation);
        this.this$0 = shortTVSubtitleControlImp;
        this.$stDownloadTable = subtitleDownloadTable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTVSubtitleControlImp$downloadListener$1$onComplete$1(this.this$0, this.$stDownloadTable, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTVSubtitleControlImp$downloadListener$1$onComplete$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        Object next2;
        Object next3;
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        if (!Intrinsics.m97797c(this.this$0.f60891e.m104514f(), this.$stDownloadTable.getResourceId())) {
            C26866a.a.m104899g(C26866a.f81698a, this.this$0.f60893g + " --> onComplete() --> 字幕下载成功，不是当前视频，不做处理", false, 2, null);
            return Unit.f75682a;
        }
        List arrayList = (List) this.this$0.f60894h.m23390d().m14847f();
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        List list = arrayList;
        SubtitleDownloadTable subtitleDownloadTable = this.$stDownloadTable;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C29007b c29007b = (C29007b) next;
            if (Intrinsics.m97797c(c29007b.m111561a().getId(), subtitleDownloadTable.getId()) && c29007b.m111561a().getResourceStreamType() == subtitleDownloadTable.getResourceStreamType()) {
                break;
            }
        }
        SubtitleDownloadTable subtitleDownloadTable2 = this.$stDownloadTable;
        ShortTVSubtitleControlImp shortTVSubtitleControlImp = this.this$0;
        C29007b c29007b2 = (C29007b) next;
        if (c29007b2 != null) {
            c29007b2.m111565e(subtitleDownloadTable2);
        } else {
            C29007b c29007b3 = new C29007b(subtitleDownloadTable2);
            arrayList.add(c29007b3);
            shortTVSubtitleControlImp.f60894h.m23390d().mo14858q(arrayList);
            shortTVSubtitleControlImp.f60889c.f83234K.setSubtitlePath(subtitleDownloadTable2.getPath(), AbstractC29242a.m112123b(c29007b3));
        }
        SubtitleDownloadTable subtitleDownloadTable3 = this.$stDownloadTable;
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.m97797c(((C29007b) next2).m111561a().getId(), subtitleDownloadTable3.getId()));
        C29007b c29007b4 = (C29007b) next2;
        if (c29007b4 == null) {
            c29007b4 = new C29007b(this.$stDownloadTable);
        }
        if (Intrinsics.m97797c(this.this$0.f60894h.m23392f().m14847f(), Boxing.m97631a(true))) {
            c29007b4.m111566f(false);
        } else if (this.$stDownloadTable.getIsAutoDownload()) {
            String string = C19773d.f63089a.m82370b().getString("k_subtitle_select_lan", null);
            Iterator it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
            } while (!Intrinsics.m97797c(((C29007b) next3).m111561a().getLan(), string));
            if (((C29007b) next3) == null || string == null || string.length() == 0 || Intrinsics.m97797c(string, this.$stDownloadTable.getLan())) {
                c29007b4.m111566f(true);
            }
        } else {
            c29007b4.m111566f(true);
        }
        C26866a.a.m104904q(C26866a.f81698a, this.this$0.f60893g + " --> onComplete() --> 字幕下载成功：" + this.$stDownloadTable.getName() + "," + this.$stDownloadTable.getLanName() + ", isSelect:" + c29007b4.m111564d(), false, 2, null);
        this.this$0.f60889c.f83234K.setSubtitlePath(this.$stDownloadTable.getPath(), AbstractC29242a.m112123b(c29007b4));
        if (c29007b4.m111564d()) {
            this.this$0.mo79476h(c29007b4);
        }
        return Unit.f75682a;
    }
}
