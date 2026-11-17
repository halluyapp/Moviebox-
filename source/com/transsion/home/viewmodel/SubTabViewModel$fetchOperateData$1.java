package com.transsion.home.viewmodel;

import com.transsion.home.bean.OperateItem;
import com.transsion.home.bean.SubOperateData;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25143l2;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.InterfaceC25165r0;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.viewmodel.SubTabViewModel$fetchOperateData$1", m97637f = "SubTabViewModel.kt", m97638l = {72}, m97639m = "invokeSuspend")
final class SubTabViewModel$fetchOperateData$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $grade;
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ Ref.ObjectRef<SubOperateData> $operateData;
    final /* synthetic */ int $tabId;
    int label;
    final /* synthetic */ SubTabViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.home.viewmodel.SubTabViewModel$fetchOperateData$1$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.home.viewmodel.SubTabViewModel$fetchOperateData$1$1", m97637f = "SubTabViewModel.kt", m97638l = {76}, m97639m = "invokeSuspend")
    @SourceDebugExtension
    static final class C155411 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $grade;
        final /* synthetic */ boolean $isRefresh;
        final /* synthetic */ Ref.ObjectRef<SubOperateData> $operateData;
        final /* synthetic */ int $tabId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SubTabViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C155411(Ref.ObjectRef<SubOperateData> objectRef, SubTabViewModel subTabViewModel, int i11, boolean z11, String str, Continuation<? super C155411> continuation) {
            super(2, continuation);
            this.$operateData = objectRef;
            this.this$0 = subTabViewModel;
            this.$tabId = i11;
            this.$isRefresh = z11;
            this.$grade = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C155411 c155411 = new C155411(this.$operateData, this.this$0, this.$tabId, this.$isRefresh, this.$grade, continuation);
            c155411.L$0 = obj;
            return c155411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C155411) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref.ObjectRef<SubOperateData> objectRef;
            T t11;
            List<OperateItem> items;
            List listI0;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            List<OperateItem> listU0 = null;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC25165r0 interfaceC25165r0M99056b = AbstractC25136k.m99056b((InterfaceC25149n0) this.L$0, null, null, new SubTabViewModel$fetchOperateData$1$1$operationTask$1(this.this$0, this.$tabId, this.$grade, null), 3, null);
                Ref.ObjectRef<SubOperateData> objectRef2 = this.$operateData;
                this.L$0 = objectRef2;
                this.label = 1;
                Object objMo99104h = interfaceC25165r0M99056b.mo99104h(this);
                if (objMo99104h == objF) {
                    return objF;
                }
                objectRef = objectRef2;
                t11 = objMo99104h;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) this.L$0;
                ResultKt.m97107b(obj);
                t11 = obj;
            }
            objectRef.element = t11;
            SubOperateData subOperateData = this.$operateData.element;
            SubOperateData subOperateData2 = subOperateData;
            if (subOperateData2 != null) {
                SubOperateData subOperateData3 = subOperateData;
                if (subOperateData3 != null && (items = subOperateData3.getItems()) != null && (listI0 = CollectionsKt.m97331I0(items, new Comparator() { // from class: com.transsion.home.viewmodel.SubTabViewModel$fetchOperateData$1$1$invokeSuspend$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t12, T t13) {
                        return ComparisonsKt.m97603d(((OperateItem) t12).getPosition(), ((OperateItem) t13).getPosition());
                    }
                })) != null) {
                    listU0 = CollectionsKt.m97343U0(listI0);
                }
                subOperateData2.setItems(listU0);
            }
            this.this$0.m68997u(this.$operateData.element);
            this.this$0.m68998v(this.$tabId, this.$operateData.element);
            if (this.$isRefresh) {
                this.this$0.m69002q().mo14855n(this.$operateData.element);
                this.this$0.f53670f = 1;
            } else {
                this.this$0.m69001p().mo14855n(this.$operateData.element);
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubTabViewModel$fetchOperateData$1(boolean z11, SubTabViewModel subTabViewModel, Ref.ObjectRef<SubOperateData> objectRef, int i11, String str, Continuation<? super SubTabViewModel$fetchOperateData$1> continuation) {
        super(2, continuation);
        this.$isRefresh = z11;
        this.this$0 = subTabViewModel;
        this.$operateData = objectRef;
        this.$tabId = i11;
        this.$grade = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubTabViewModel$fetchOperateData$1(this.$isRefresh, this.this$0, this.$operateData, this.$tabId, this.$grade, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SubTabViewModel$fetchOperateData$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<OperateItem> items;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                C155411 c155411 = new C155411(this.$operateData, this.this$0, this.$tabId, this.$isRefresh, this.$grade, null);
                this.label = 1;
                if (AbstractC25143l2.m99070c(c155411, this) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            C26866a.f81698a.m104915i("SubTabFragment", "exceptionHandler " + e11.getMessage(), true);
            if (this.$isRefresh) {
                this.this$0.m69002q().mo14855n(null);
            } else {
                SubOperateData subOperateData = this.$operateData.element;
                if (((subOperateData == null || (items = subOperateData.getItems()) == null) ? 0 : items.size()) > 0) {
                    this.this$0.m69001p().mo14855n(this.$operateData.element);
                } else {
                    this.this$0.m69001p().mo14855n(null);
                }
            }
        }
        return Unit.f75682a;
    }
}
