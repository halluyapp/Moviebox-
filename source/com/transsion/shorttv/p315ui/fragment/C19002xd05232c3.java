package com.transsion.shorttv.p315ui.fragment;

import com.transsion.shorttv.bean.Media;
import com.transsion.shorttv.bean.ShortTVItem;
import com.transsion.shorttv.bean.Video;
import fo.C23403e;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import p654oo.InterfaceC26373f;
import p659os.C26719e;
import p848vs.InterfaceC28213d;

/* JADX INFO: renamed from: com.transsion.shorttv.ui.fragment.ShortTvDetailListFragment$downloadListener$1$onDownloadSuccess$2$1 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.ui.fragment.ShortTvDetailListFragment$downloadListener$1$onDownloadSuccess$2$1", m97637f = "ShortTvDetailListFragment.kt", m97638l = {1134}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class C19002xd05232c3 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C26719e $it;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ShortTvDetailListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C19002xd05232c3(C26719e c26719e, ShortTvDetailListFragment shortTvDetailListFragment, Continuation<? super C19002xd05232c3> continuation) {
        super(2, continuation);
        this.$it = c26719e;
        this.this$0 = shortTvDetailListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C19002xd05232c3(this.$it, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((C19002xd05232c3) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Media video;
        Video video2;
        String url;
        ShortTvDetailListFragment shortTvDetailListFragment;
        C26719e c26719e;
        String str;
        InterfaceC26373f interfaceC26373f;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            ShortTVItem shortTVItemM104512d = this.$it.m104512d();
            if (shortTVItemM104512d != null && (video = shortTVItemM104512d.getVideo()) != null && (video2 = video.getVideo()) != null && (url = video2.getUrl()) != null) {
                ShortTvDetailListFragment shortTvDetailListFragment2 = this.this$0;
                C26719e c26719e2 = this.$it;
                InterfaceC28213d interfaceC28213dM80392s0 = shortTvDetailListFragment2.m79851K0().m80392s0();
                if (interfaceC28213dM80392s0 != null) {
                    String strM104513e = c26719e2.m104513e();
                    int iM104511c = c26719e2.m104511c();
                    this.L$0 = shortTvDetailListFragment2;
                    this.L$1 = c26719e2;
                    this.L$2 = url;
                    this.label = 1;
                    Object objMo73635a = interfaceC28213dM80392s0.mo73635a(strM104513e, iM104511c, url, this);
                    if (objMo73635a == objF) {
                        return objF;
                    }
                    shortTvDetailListFragment = shortTvDetailListFragment2;
                    c26719e = c26719e2;
                    str = url;
                    obj = objMo73635a;
                }
            }
            return Unit.f75682a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str2 = (String) this.L$2;
        c26719e = (C26719e) this.L$1;
        ShortTvDetailListFragment shortTvDetailListFragment3 = (ShortTvDetailListFragment) this.L$0;
        ResultKt.m97107b(obj);
        str = str2;
        shortTvDetailListFragment = shortTvDetailListFragment3;
        String str3 = (String) obj;
        if (str3 != null && (interfaceC26373f = shortTvDetailListFragment.mOrPlayer) != null) {
            ShortTVItem shortTVItemM104512d2 = c26719e.m104512d();
            C23403e c23403e = new C23403e(shortTVItemM104512d2 != null ? shortTVItemM104512d2.getId() : null, str, c26719e.m104511c(), null, null, 24, null);
            c23403e.m92943t(str3);
            Boxing.m97631a(interfaceC26373f.mo102960b(c23403e));
        }
        return Unit.f75682a;
    }
}
