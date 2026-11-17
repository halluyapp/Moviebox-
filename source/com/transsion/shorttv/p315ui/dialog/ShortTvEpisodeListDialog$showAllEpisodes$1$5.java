package com.transsion.shorttv.p315ui.dialog;

import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.transsion.shorttv.bean.ShortTVItem;
import com.transsion.shorttv.p315ui.adapter.C18951r;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import p356ds.AbstractC23048b;
import p659os.C26719e;
import p848vs.InterfaceC28213d;
import rs.C27364s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.ui.dialog.ShortTvEpisodeListDialog$showAllEpisodes$1$5", m97637f = "ShortTvEpisodeListDialog.kt", m97638l = {Sdk$SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class ShortTvEpisodeListDialog$showAllEpisodes$1$5 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $selectEp;
    final /* synthetic */ String $subjectId;
    int label;
    final /* synthetic */ ShortTvEpisodeListDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvEpisodeListDialog$showAllEpisodes$1$5(ShortTvEpisodeListDialog shortTvEpisodeListDialog, String str, int i11, Continuation<? super ShortTvEpisodeListDialog$showAllEpisodes$1$5> continuation) {
        super(2, continuation);
        this.this$0 = shortTvEpisodeListDialog;
        this.$subjectId = str;
        this.$selectEp = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTvEpisodeListDialog$showAllEpisodes$1$5(this.this$0, this.$subjectId, this.$selectEp, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvEpisodeListDialog$showAllEpisodes$1$5) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:56:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x009c A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<ShortTVItem> arrayList;
        List list;
        Collection collectionL;
        C27364s c27364s;
        C27364s c27364s2;
        ProgressBar progressBar;
        RecyclerView recyclerView;
        Iterator it;
        Object next;
        C26719e c26719e;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC28213d interfaceC28213dM80392s0 = this.this$0.m79686D0().m80392s0();
            if (interfaceC28213dM80392s0 != null) {
                String str = this.$subjectId;
                this.label = 1;
                obj = interfaceC28213dM80392s0.mo73636b(str, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                arrayList = new ArrayList();
            }
            list = (List) this.this$0.m79686D0().m80341F0().m14847f();
            if (list != null) {
                collectionL = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof C26719e) {
                        collectionL.add(obj2);
                    }
                }
            } else {
                collectionL = CollectionsKt.m97506l();
            }
            for (ShortTVItem shortTVItem : arrayList) {
                it = collectionL.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((C26719e) next).m104511c() != shortTVItem.getEp());
                c26719e = (C26719e) next;
                if (c26719e == null && c26719e.m104512d() == null) {
                    c26719e.m104516h(shortTVItem);
                }
            }
            c27364s = this.this$0.dramaDialogEpisodeListBinding;
            if (c27364s != null && (recyclerView = c27364s.f83320d) != null) {
                C18951r c18951rM79684B0 = this.this$0.m79684B0();
                ShortTvEpisodeListDialog shortTvEpisodeListDialog = this.this$0;
                int i12 = this.$selectEp;
                c18951rM79684B0.mo36210q1(CollectionsKt.m97343U0(collectionL));
                c18951rM79684B0.m36227w1(shortTvEpisodeListDialog.com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String);
                c18951rM79684B0.m79666D1(i12);
                recyclerView.setAdapter(c18951rM79684B0);
            }
            c27364s2 = this.this$0.dramaDialogEpisodeListBinding;
            if (c27364s2 != null && (progressBar = c27364s2.f83319c) != null) {
                AbstractC23048b.m91691b(progressBar);
            }
            this.this$0.m79686D0().m80397w0(this.$subjectId, 1);
            if (this.this$0.m79688F0() > 20) {
                this.this$0.m79686D0().m80397w0(this.$subjectId, 21);
            }
            return Unit.f75682a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        arrayList = (List) obj;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        list = (List) this.this$0.m79686D0().m80341F0().m14847f();
        if (list != null) {
            collectionL = new ArrayList();
            while (r0.hasNext()) {
                if (obj2 instanceof C26719e) {
                    collectionL.add(obj2);
                }
            }
        } else {
            collectionL = CollectionsKt.m97506l();
        }
        while (r8.hasNext()) {
            it = collectionL.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((C26719e) next).m104511c() != shortTVItem.getEp());
            c26719e = (C26719e) next;
            if (c26719e == null) {
            }
        }
        c27364s = this.this$0.dramaDialogEpisodeListBinding;
        if (c27364s != null) {
            C18951r c18951rM79684B1 = this.this$0.m79684B0();
            ShortTvEpisodeListDialog shortTvEpisodeListDialog2 = this.this$0;
            int i13 = this.$selectEp;
            c18951rM79684B1.mo36210q1(CollectionsKt.m97343U0(collectionL));
            c18951rM79684B1.m36227w1(shortTvEpisodeListDialog2.com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String);
            c18951rM79684B1.m79666D1(i13);
            recyclerView.setAdapter(c18951rM79684B1);
        }
        c27364s2 = this.this$0.dramaDialogEpisodeListBinding;
        if (c27364s2 != null) {
            AbstractC23048b.m91691b(progressBar);
        }
        this.this$0.m79686D0().m80397w0(this.$subjectId, 1);
        if (this.this$0.m79688F0() > 20) {
            this.this$0.m79686D0().m80397w0(this.$subjectId, 21);
        }
        return Unit.f75682a;
    }
}
