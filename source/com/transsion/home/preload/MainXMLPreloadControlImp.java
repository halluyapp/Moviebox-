package com.transsion.home.preload;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import androidx.p1004lifecycle.AbstractC3192e;
import androidx.p1004lifecycle.InterfaceC3194f;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25143l2;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.InterfaceC25165r0;
import pg.C26866a;

/* JADX INFO: loaded from: classes.dex */
public final class MainXMLPreloadControlImp implements InterfaceC15428b, InterfaceC3194f {

    /* JADX INFO: renamed from: a */
    private View f53349a;

    /* JADX INFO: renamed from: b */
    private View f53350b;

    /* JADX INFO: renamed from: c */
    private View f53351c;

    /* JADX INFO: renamed from: d */
    private View f53352d;

    /* JADX INFO: renamed from: e */
    private View f53353e;

    /* JADX INFO: renamed from: f */
    private View f53354f;

    /* JADX INFO: renamed from: g */
    private boolean f53355g;

    /* JADX INFO: renamed from: h */
    private boolean f53356h;

    /* JADX INFO: renamed from: i */
    private boolean f53357i;

    /* JADX INFO: renamed from: j */
    private boolean f53358j;

    /* JADX INFO: renamed from: k */
    private boolean f53359k;

    /* JADX INFO: renamed from: l */
    private boolean f53360l;

    /* JADX INFO: renamed from: m */
    private boolean f53361m;

    /* JADX INFO: renamed from: n */
    private final InterfaceC25149n0 f53362n;

    /* JADX INFO: renamed from: o */
    private final InterfaceC3224u f53363o;

    /* JADX INFO: renamed from: com.transsion.home.preload.MainXMLPreloadControlImp$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.home.preload.MainXMLPreloadControlImp$1", m97637f = "MainXMLPreloadControlImp.kt", m97638l = {71, 78, 85}, m97639m = "invokeSuspend")
    static final class C154261 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C154261(Activity activity, Continuation<? super C154261> continuation) {
            super(2, continuation);
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C154261 c154261 = MainXMLPreloadControlImp.this.new C154261(this.$activity, continuation);
            c154261.L$0 = obj;
            return c154261;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C154261) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:34:0x010d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x010e  */
        /* JADX WARN: Code duplicated, block: B:38:0x0117  */
        /* JADX WARN: Code duplicated, block: B:40:0x011a  */
        /* JADX WARN: Instruction removed from duplicated block: B:32:0x00c9, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:40:0x011a, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC25149n0 interfaceC25149n0;
            View view;
            InterfaceC25149n0 interfaceC25149n1;
            View view2;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
                    ResultKt.m97107b(obj);
                } else if (i11 == 2) {
                    interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
                    ResultKt.m97107b(obj);
                    view = (View) obj;
                    if (!AbstractC25153o0.m99085g(interfaceC25149n0)) {
                        return Unit.f75682a;
                    }
                    MainXMLPreloadControlImp.this.f53353e = view;
                    C26866a.a.m104898f(C26866a.f81698a, "MainXMLPreload", "---- itemRanking preload success, ThreadName = " + Thread.currentThread().getName(), false, 4, null);
                    InterfaceC25165r0 interfaceC25165r0M99056b = AbstractC25136k.m99056b(interfaceC25149n0, C25220y0.m99268b(), null, new MainXMLPreloadControlImp$1$opMovieRankResult$1(this.$activity, null), 2, null);
                    this.L$0 = interfaceC25149n0;
                    this.label = 3;
                    obj = interfaceC25165r0M99056b.mo99104h(this);
                    if (obj == objF) {
                        return objF;
                    }
                    interfaceC25149n1 = interfaceC25149n0;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC25149n1 = (InterfaceC25149n0) this.L$0;
                    ResultKt.m97107b(obj);
                }
                view2 = (View) obj;
                if (!AbstractC25153o0.m99085g(interfaceC25149n1)) {
                    return Unit.f75682a;
                }
                MainXMLPreloadControlImp.this.f53354f = view2;
                C26866a.a.m104898f(C26866a.f81698a, "MainXMLPreload", "---- itemSubjectOpView preload success, ThreadName = " + Thread.currentThread().getName(), false, 4, null);
                return Unit.f75682a;
            }
            ResultKt.m97107b(obj);
            interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
            if (Build.VERSION.SDK_INT == 30 && StringsKt.m98227H(Build.MANUFACTURER, "TCL", true)) {
                return Unit.f75682a;
            }
            InterfaceC25165r0 interfaceC25165r0M99056b2 = AbstractC25136k.m99056b(interfaceC25149n0, C25220y0.m99268b(), null, new MainXMLPreloadControlImp$1$postListResult$1(this.$activity, null), 2, null);
            this.L$0 = interfaceC25149n0;
            this.label = 1;
            obj = interfaceC25165r0M99056b2.mo99104h(this);
            if (obj == objF) {
                return objF;
            }
            View view3 = (View) obj;
            if (!AbstractC25153o0.m99085g(interfaceC25149n0)) {
                return Unit.f75682a;
            }
            MainXMLPreloadControlImp.this.f53349a = view3;
            C26866a.a.m104898f(C26866a.f81698a, "MainXMLPreload", "---- postListView preload success, ThreadName = " + Thread.currentThread().getName(), false, 4, null);
            InterfaceC25165r0 interfaceC25165r0M99056b3 = AbstractC25136k.m99056b(interfaceC25149n0, C25220y0.m99268b(), null, new MainXMLPreloadControlImp$1$rankingResult$1(this.$activity, null), 2, null);
            this.L$0 = interfaceC25149n0;
            this.label = 2;
            obj = interfaceC25165r0M99056b3.mo99104h(this);
            if (obj == objF) {
                return objF;
            }
            view = (View) obj;
            if (!AbstractC25153o0.m99085g(interfaceC25149n0)) {
                return Unit.f75682a;
            }
            MainXMLPreloadControlImp.this.f53353e = view;
            C26866a.a.m104898f(C26866a.f81698a, "MainXMLPreload", "---- itemRanking preload success, ThreadName = " + Thread.currentThread().getName(), false, 4, null);
            InterfaceC25165r0 interfaceC25165r0M99056b4 = AbstractC25136k.m99056b(interfaceC25149n0, C25220y0.m99268b(), null, new MainXMLPreloadControlImp$1$opMovieRankResult$1(this.$activity, null), 2, null);
            this.L$0 = interfaceC25149n0;
            this.label = 3;
            obj = interfaceC25165r0M99056b4.mo99104h(this);
            if (obj == objF) {
                return objF;
            }
            interfaceC25149n1 = interfaceC25149n0;
            view2 = (View) obj;
            if (!AbstractC25153o0.m99085g(interfaceC25149n1)) {
                return Unit.f75682a;
            }
            MainXMLPreloadControlImp.this.f53354f = view2;
            C26866a.a.m104898f(C26866a.f81698a, "MainXMLPreload", "---- itemSubjectOpView preload success, ThreadName = " + Thread.currentThread().getName(), false, 4, null);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MainXMLPreloadControlImp(Activity activity) {
        Lifecycle lifecycle;
        Intrinsics.m97802h(activity, "activity");
        InterfaceC25149n0 interfaceC25149n0M99079a = AbstractC25153o0.m99079a(AbstractC25143l2.m99069b(null, 1, null).plus(C25220y0.m99267a()));
        this.f53362n = interfaceC25149n0M99079a;
        InterfaceC3224u interfaceC3224u = activity instanceof InterfaceC3224u ? (InterfaceC3224u) activity : null;
        this.f53363o = interfaceC3224u;
        if (interfaceC3224u != null && (lifecycle = interfaceC3224u.getLifecycle()) != null) {
            lifecycle.mo14832a(this);
        }
        AbstractC25136k.m99058d(interfaceC25149n0M99079a, null, null, new C154261(activity, null), 3, null);
    }

    @Override // com.transsion.home.preload.InterfaceC15428b
    /* JADX INFO: renamed from: a */
    public boolean mo68498a() {
        return this.f53361m;
    }

    @Override // com.transsion.home.preload.InterfaceC15428b
    /* JADX INFO: renamed from: b */
    public boolean mo68499b() {
        return this.f53358j;
    }

    @Override // com.transsion.home.preload.InterfaceC15428b
    /* JADX INFO: renamed from: c */
    public View mo68500c() {
        this.f53361m = true;
        return this.f53354f;
    }

    @Override // com.transsion.home.preload.InterfaceC15428b
    /* JADX INFO: renamed from: d */
    public View mo68501d() {
        this.f53358j = true;
        return this.f53353e;
    }

    @Override // com.transsion.home.preload.InterfaceC15428b
    /* JADX INFO: renamed from: e */
    public boolean mo68502e() {
        return this.f53355g;
    }

    @Override // com.transsion.home.preload.InterfaceC15428b
    /* JADX INFO: renamed from: f */
    public View mo68503f() {
        this.f53355g = true;
        return this.f53349a;
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public /* synthetic */ void onCreate(InterfaceC3224u interfaceC3224u) {
        AbstractC3192e.m14896a(this, interfaceC3224u);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public void onDestroy(InterfaceC3224u owner) {
        Intrinsics.m97802h(owner, "owner");
        AbstractC3192e.m14897b(this, owner);
        owner.getLifecycle().mo14835d(this);
        reset();
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public /* synthetic */ void onPause(InterfaceC3224u interfaceC3224u) {
        AbstractC3192e.m14898c(this, interfaceC3224u);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public /* synthetic */ void onResume(InterfaceC3224u interfaceC3224u) {
        AbstractC3192e.m14899d(this, interfaceC3224u);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public /* synthetic */ void onStart(InterfaceC3224u interfaceC3224u) {
        AbstractC3192e.m14900e(this, interfaceC3224u);
    }

    @Override // androidx.p1004lifecycle.InterfaceC3194f
    public /* synthetic */ void onStop(InterfaceC3224u interfaceC3224u) {
        AbstractC3192e.m14901f(this, interfaceC3224u);
    }

    @Override // com.transsion.home.preload.InterfaceC15428b
    public void reset() {
        AbstractC25153o0.m99082d(this.f53362n, null, 1, null);
        this.f53349a = null;
        this.f53352d = null;
        this.f53353e = null;
        this.f53350b = null;
        this.f53351c = null;
        this.f53354f = null;
        this.f53355g = false;
        this.f53359k = false;
        this.f53360l = false;
        this.f53356h = false;
        this.f53357i = false;
        this.f53358j = false;
        this.f53361m = false;
    }
}
