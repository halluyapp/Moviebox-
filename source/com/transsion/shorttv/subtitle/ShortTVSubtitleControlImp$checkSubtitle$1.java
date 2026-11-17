package com.transsion.shorttv.subtitle;

import com.transsion.shorttv.bean.ShortTVItem;
import com.transsion.shorttv.bean.ShortTvInnerPlayBean;
import com.transsion.shorttv.subtitle.manager.InterfaceC18884b;
import com.transsion.shorttv.viewmodel.ShortTvViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p743rh.C27287m;
import p848vs.InterfaceC28217h;
import p955ys.C29006a;
import p955ys.C29007b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.subtitle.ShortTVSubtitleControlImp$checkSubtitle$1", m97637f = "ShortTVSubtitleControlImp.kt", m97638l = {177, 179, 184}, m97639m = "invokeSuspend")
final class ShortTVSubtitleControlImp$checkSubtitle$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ShortTVSubtitleControlImp this$0;

    /* JADX INFO: renamed from: com.transsion.shorttv.subtitle.ShortTVSubtitleControlImp$checkSubtitle$1$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.shorttv.subtitle.ShortTVSubtitleControlImp$checkSubtitle$1$1", m97637f = "ShortTVSubtitleControlImp.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C188751 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ ShortTvInnerPlayBean $history;
        final /* synthetic */ List<C29007b> $list;
        int label;
        final /* synthetic */ ShortTVSubtitleControlImp this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C188751(List<C29007b> list, ShortTVSubtitleControlImp shortTVSubtitleControlImp, ShortTvInnerPlayBean shortTvInnerPlayBean, Continuation<? super C188751> continuation) {
            super(2, continuation);
            this.$list = list;
            this.this$0 = shortTVSubtitleControlImp;
            this.$history = shortTvInnerPlayBean;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C188751(this.$list, this.this$0, this.$history, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C188751) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            List<C29007b> list = this.$list;
            if (list != null && !list.isEmpty()) {
                List arrayList = (List) this.this$0.f60894h.m23390d().m14847f();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.clear();
                arrayList.addAll(this.$list);
                C26866a.a.m104899g(C26866a.f81698a, "checkSubtitle setList, size:" + arrayList.size(), false, 2, null);
                this.this$0.f60894h.m23390d().mo14858q(arrayList);
                ShortTVSubtitleControlImp shortTVSubtitleControlImp = this.this$0;
                ShortTvInnerPlayBean shortTvInnerPlayBean = this.$history;
                shortTVSubtitleControlImp.m79468y(arrayList, shortTvInnerPlayBean != null ? shortTvInnerPlayBean.getSubtitleSelectId() : null);
            }
            if (C27287m.f83003a.m106330e()) {
                String strM104513e = this.this$0.f60891e.m104513e();
                String str = this.this$0.f60891e.m104513e() + "_" + this.this$0.f60891e.m104511c() + "short";
                ShortTVItem shortTVItemM104512d = this.this$0.f60891e.m104512d();
                String id2 = shortTVItemM104512d != null ? shortTVItemM104512d.getId() : null;
                int iM104511c = this.this$0.f60891e.m104511c();
                ShortTVItem shortTVItemM104512d2 = this.this$0.f60891e.m104512d();
                InterfaceC18884b.b.m79508a(InterfaceC18884b.f60919a.m79507b(), new C29006a(strM104513e, str, "", "", id2, iM104511c, shortTVItemM104512d2 != null ? shortTVItemM104512d2.getSe() : 0, this.this$0.f60892f), null, 2, null);
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTVSubtitleControlImp$checkSubtitle$1(ShortTVSubtitleControlImp shortTVSubtitleControlImp, Continuation<? super ShortTVSubtitleControlImp$checkSubtitle$1> continuation) {
        super(2, continuation);
        this.this$0 = shortTVSubtitleControlImp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTVSubtitleControlImp$checkSubtitle$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTVSubtitleControlImp$checkSubtitle$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e8 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ShortTvInnerPlayBean shortTvInnerPlayBean;
        InterfaceC28217h interfaceC28217hM80336A0;
        List list;
        List list2;
        Integer numM97634d;
        AbstractC24917a2 abstractC24917a2M99269c;
        C188751 c188751;
        Function1 function1;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.m97107b(obj);
            } else if (i11 == 2) {
                shortTvInnerPlayBean = (ShortTvInnerPlayBean) this.L$0;
                ResultKt.m97107b(obj);
                list = (List) obj;
                list2 = list;
                if (list2 != null && !list2.isEmpty() && (function1 = this.this$0.f60895i) != null) {
                    function1.invoke(Boxing.m97631a(true));
                }
                C26866a.a aVar = C26866a.f81698a;
                String strM104514f = this.this$0.f60891e.m104514f();
                String strM104513e = this.this$0.f60891e.m104513e();
                if (list != null) {
                    numM97634d = Boxing.m97634d(list.size());
                } else {
                    numM97634d = null;
                }
                C26866a.a.m104899g(aVar, "checkSubtitle subtitleResId:" + strM104514f + ", subjectId:" + strM104513e + ", size:" + numM97634d, false, 2, null);
                abstractC24917a2M99269c = C25220y0.m99269c();
                c188751 = new C188751(list, this.this$0, shortTvInnerPlayBean, null);
                this.L$0 = null;
                this.label = 3;
                if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c188751, this) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return Unit.f75682a;
        }
        ResultKt.m97107b(obj);
        ShortTvViewModel shortTvViewModel = this.this$0.f60890d;
        if (shortTvViewModel == null || (interfaceC28217hM80336A0 = shortTvViewModel.m80336A0()) == null) {
            shortTvInnerPlayBean = null;
        } else {
            String strM104513e2 = this.this$0.f60891e.m104513e();
            this.label = 1;
            obj = interfaceC28217hM80336A0.mo73653c(strM104513e2, this);
            if (obj == objF) {
                return objF;
            }
        }
        InterfaceC18884b interfaceC18884bM79507b = InterfaceC18884b.f60919a.m79507b();
        String strM104514f2 = this.this$0.f60891e.m104514f();
        this.L$0 = shortTvInnerPlayBean;
        this.label = 2;
        obj = interfaceC18884bM79507b.mo79492a(strM104514f2, this);
        if (obj == objF) {
            return objF;
        }
        list = (List) obj;
        list2 = list;
        if (list2 != null) {
            function1.invoke(Boxing.m97631a(true));
        }
        C26866a.a aVar2 = C26866a.f81698a;
        String strM104514f3 = this.this$0.f60891e.m104514f();
        String strM104513e3 = this.this$0.f60891e.m104513e();
        if (list != null) {
            numM97634d = Boxing.m97634d(list.size());
        } else {
            numM97634d = null;
        }
        C26866a.a.m104899g(aVar2, "checkSubtitle subtitleResId:" + strM104514f3 + ", subjectId:" + strM104513e3 + ", size:" + numM97634d, false, 2, null);
        abstractC24917a2M99269c = C25220y0.m99269c();
        c188751 = new C188751(list, this.this$0, shortTvInnerPlayBean, null);
        this.L$0 = null;
        this.label = 3;
        if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c188751, this) == objF) {
            return objF;
        }
        return Unit.f75682a;
        shortTvInnerPlayBean = (ShortTvInnerPlayBean) obj;
        InterfaceC18884b interfaceC18884bM79507b2 = InterfaceC18884b.f60919a.m79507b();
        String strM104514f4 = this.this$0.f60891e.m104514f();
        this.L$0 = shortTvInnerPlayBean;
        this.label = 2;
        obj = interfaceC18884bM79507b2.mo79492a(strM104514f4, this);
        if (obj == objF) {
            return objF;
        }
        list = (List) obj;
        list2 = list;
        if (list2 != null) {
            function1.invoke(Boxing.m97631a(true));
        }
        C26866a.a aVar3 = C26866a.f81698a;
        String strM104514f5 = this.this$0.f60891e.m104514f();
        String strM104513e4 = this.this$0.f60891e.m104513e();
        if (list != null) {
            numM97634d = Boxing.m97634d(list.size());
        } else {
            numM97634d = null;
        }
        C26866a.a.m104899g(aVar3, "checkSubtitle subtitleResId:" + strM104514f5 + ", subjectId:" + strM104513e4 + ", size:" + numM97634d, false, 2, null);
        abstractC24917a2M99269c = C25220y0.m99269c();
        c188751 = new C188751(list, this.this$0, shortTvInnerPlayBean, null);
        this.L$0 = null;
        this.label = 3;
        if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c188751, this) == objF) {
            return objF;
        }
        return Unit.f75682a;
    }
}
