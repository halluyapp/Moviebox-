package com.transsion.member.history;

import com.transsion.member.bean.PointsHistoryData;
import com.transsion.member.bean.PointsHistoryItem;
import io.reactivex.rxjava3.core.AbstractC24093j;
import io.reactivex.rxjava3.core.InterfaceC24096m;
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
import kotlinx.coroutines.InterfaceC25149n0;
import p017an.InterfaceC0127a;
import p666oz.InterfaceC26760h;
import p871wg.AbstractC28362a;
import p871wg.C28365d;
import tz.AbstractC27875a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.member.history.PointsHistoryViewModel$fetchHistory$1", m97637f = "PointsHistoryViewModel.kt", m97638l = {}, m97639m = "invokeSuspend")
final class PointsHistoryViewModel$fetchHistory$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $page;
    int label;
    final /* synthetic */ PointsHistoryViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.member.history.PointsHistoryViewModel$fetchHistory$1$a */
    static final class C15846a implements InterfaceC26760h {

        /* JADX INFO: renamed from: a */
        public static final C15846a f54338a = new C15846a();

        C15846a() {
        }

        @Override // p666oz.InterfaceC26760h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC24096m apply(Throwable it) {
            Intrinsics.m97802h(it, "it");
            return AbstractC24093j.m95065l(it);
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.history.PointsHistoryViewModel$fetchHistory$1$b */
    public static final class C15847b extends AbstractC28362a {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ PointsHistoryViewModel f54339d;

        C15847b(PointsHistoryViewModel pointsHistoryViewModel) {
            this.f54339d = pointsHistoryViewModel;
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: a */
        public void mo66457a(String str, String str2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("error: ");
            sb2.append(str);
            sb2.append(", msg:");
            sb2.append(str2);
            this.f54339d.m70084e().mo14858q(null);
        }

        @Override // p871wg.AbstractC28362a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo66458c(PointsHistoryData pointsHistoryData) {
            List<PointsHistoryItem> list;
            super.mo66458c(pointsHistoryData);
            Boolean boolValueOf = (pointsHistoryData == null || (list = pointsHistoryData.getList()) == null) ? null : Boolean.valueOf(list.isEmpty());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("list is empty: ");
            sb2.append(boolValueOf);
            this.f54339d.m70084e().mo14858q(pointsHistoryData);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PointsHistoryViewModel$fetchHistory$1(PointsHistoryViewModel pointsHistoryViewModel, String str, Continuation<? super PointsHistoryViewModel$fetchHistory$1> continuation) {
        super(2, continuation);
        this.this$0 = pointsHistoryViewModel;
        this.$page = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PointsHistoryViewModel$fetchHistory$1(this.this$0, this.$page, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((PointsHistoryViewModel$fetchHistory$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        InterfaceC0127a.a.m587d(this.this$0.m70081f(), this.$page, 0, null, 6, null).m95088v(AbstractC27875a.m108402c()).m95090x(C15846a.f54338a).m95079f(C28365d.f87067a.m109702c()).subscribe(new C15847b(this.this$0));
        return Unit.f75682a;
    }
}
