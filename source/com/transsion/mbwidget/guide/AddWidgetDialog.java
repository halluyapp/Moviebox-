package com.transsion.mbwidget.guide;

import android.app.Dialog;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.Lifecycle;
import androidx.p1004lifecycle.RepeatOnLifecycleKt;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.report.C14492k;
import com.transsion.baseui.dialog.BaseDialogFragment;
import com.transsion.baseui.widget.text.GradientTextView;
import com.transsion.mbwidget.C15716d;
import com.transsion.mbwidget.HotSubjectWidgetProvider;
import com.transsion.mbwidget.utils.C15747a;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.InterfaceC25204t1;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC25073w0;
import ng.AbstractC26006c;
import p949ym.C28986b;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m97100d2 = {"Lcom/transsion/mbwidget/guide/AddWidgetDialog;", "Lcom/transsion/baseui/dialog/BaseDialogFragment;", "Lym/b;", "<init>", "()V", "", "p0", "n0", "o0", "initView", "onDestroyView", "Landroid/view/Window;", "window", "d0", "(Landroid/view/Window;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "c0", "Lkotlinx/coroutines/t1;", "e", "Lkotlinx/coroutines/t1;", "addWidgetJob", "Lkotlin/Function0;", "f", "Lkotlin/jvm/functions/Function0;", "getOnDismissListener", "()Lkotlin/jvm/functions/Function0;", "t0", "(Lkotlin/jvm/functions/Function0;)V", "onDismissListener", "DeskWidget_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class AddWidgetDialog extends BaseDialogFragment<C28986b> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private InterfaceC25204t1 addWidgetJob;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Function0 onDismissListener;

    /* JADX INFO: renamed from: com.transsion.mbwidget.guide.AddWidgetDialog$1 */
    @Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* synthetic */ class C157381 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, C28986b> {
        public static final C157381 INSTANCE = new C157381();

        C157381() {
            super(3, C28986b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/transsion/mbwidget/databinding/DialogWidgetAddBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        public final C28986b invoke(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            Intrinsics.m97802h(p11, "p0");
            return C28986b.m111498c(p11, viewGroup, z11);
        }
    }

    /* JADX INFO: renamed from: com.transsion.mbwidget.guide.AddWidgetDialog$initView$4 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.mbwidget.guide.AddWidgetDialog$initView$4", m97637f = "AddWidgetDialog.kt", m97638l = {61}, m97639m = "invokeSuspend")
    static final class C157394 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.transsion.mbwidget.guide.AddWidgetDialog$initView$4$1, reason: invalid class name */
        @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
        @DebugMetadata(m97636c = "com.transsion.mbwidget.guide.AddWidgetDialog$initView$4$1", m97637f = "AddWidgetDialog.kt", m97638l = {62}, m97639m = "invokeSuspend")
        static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AddWidgetDialog this$0;

            /* JADX INFO: renamed from: com.transsion.mbwidget.guide.AddWidgetDialog$initView$4$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(m97099d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m97100d2 = {"<anonymous>", "", "it", ""}, m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
            @DebugMetadata(m97636c = "com.transsion.mbwidget.guide.AddWidgetDialog$initView$4$1$1", m97637f = "AddWidgetDialog.kt", m97638l = {}, m97639m = "invokeSuspend")
            static final class C294531 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ AddWidgetDialog this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C294531(AddWidgetDialog addWidgetDialog, Continuation<? super C294531> continuation) {
                    super(2, continuation);
                    this.this$0 = addWidgetDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C294531 c294531 = new C294531(this.this$0, continuation);
                    c294531.Z$0 = ((Boolean) obj).booleanValue();
                    return c294531;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
                }

                public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
                    return ((C294531) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.f75682a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    IntrinsicsKt.m97630f();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(obj);
                    if (this.Z$0) {
                        C15747a.f54125a.m69753k("hot_desk_widget", true, "dialog_add");
                        InterfaceC25204t1 interfaceC25204t1 = this.this$0.addWidgetJob;
                        if (interfaceC25204t1 != null) {
                            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
                        }
                        this.this$0.dismiss();
                    }
                    return Unit.f75682a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AddWidgetDialog addWidgetDialog, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = addWidgetDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = IntrinsicsKt.m97630f();
                int i11 = this.label;
                if (i11 == 0) {
                    ResultKt.m97107b(obj);
                    InterfaceC25073w0 interfaceC25073w0M69732a = WidgetCallbackReceiver.INSTANCE.m69732a();
                    C294531 c294531 = new C294531(this.this$0, null);
                    this.label = 1;
                    if (AbstractC25001c.m98789h(interfaceC25073w0M69732a, c294531, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(obj);
                }
                return Unit.f75682a;
            }
        }

        C157394(Continuation<? super C157394> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AddWidgetDialog.this.new C157394(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C157394) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                Lifecycle lifecycle = AddWidgetDialog.this.getLifecycle();
                Intrinsics.m97801g(lifecycle, "<get-lifecycle>(...)");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AddWidgetDialog.this, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.m14866a(lifecycle, state, anonymousClass1, this) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return Unit.f75682a;
        }
    }

    public AddWidgetDialog() {
        super(C157381.INSTANCE);
    }

    /* JADX INFO: renamed from: n0 */
    private final void m69724n0() {
        Object objM112707constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(Utils.m27275a());
            ComponentName componentName = new ComponentName(Utils.m27275a(), (Class<?>) HotSubjectWidgetProvider.class);
            if (appWidgetManager.isRequestPinAppWidgetSupported()) {
                appWidgetManager.requestPinAppWidget(componentName, null, PendingIntent.getBroadcast(Utils.m27275a(), 0, new Intent(Utils.m27275a(), (Class<?>) WidgetCallbackReceiver.class), 201326592));
                InterfaceC15742a interfaceC15742aM69634j = C15716d.f54081a.m69634j();
                if (interfaceC15742aM69634j != null) {
                    interfaceC15742aM69634j.mo69734a();
                }
                m69725o0();
            }
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.a.m104898f(C26866a.f81698a, "DeskWidget_", "add-error:" + thM112710exceptionOrNullimpl.getMessage(), false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o0 */
    private final void m69725o0() {
        if (C15716d.f54081a.m69637n()) {
            this.addWidgetJob = AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new AddWidgetDialog$checkMiUI$1(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public final void m69726p0() {
        requireContext().startActivity(new Intent(requireContext(), (Class<?>) WidgetGuideActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final Unit m69727q0(AddWidgetDialog addWidgetDialog, View it) {
        Intrinsics.m97802h(it, "it");
        addWidgetDialog.dismiss();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final Unit m69728r0(AddWidgetDialog addWidgetDialog, View it) {
        Intrinsics.m97802h(it, "it");
        addWidgetDialog.m69726p0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final Unit m69729s0(AddWidgetDialog addWidgetDialog, View it) {
        Intrinsics.m97802h(it, "it");
        C15747a.f54125a.m69746b();
        if (Build.VERSION.SDK_INT >= 26) {
            addWidgetDialog.m69724n0();
        } else {
            addWidgetDialog.m69726p0();
        }
        return Unit.f75682a;
    }

    @Override // com.transsion.baseui.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: c0 */
    public void mo65446c0() {
        if (C14492k.f50955a.m65323q()) {
            m65444a0();
            return;
        }
        C15716d c15716d = C15716d.f54081a;
        c15716d.m69635k().putLong("desk_widget_guide_show_time", System.currentTimeMillis());
        c15716d.m69635k().putLong("desk_widget_guide_show_first", 1L);
    }

    @Override // com.transsion.baseui.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: d0 */
    protected void mo65447d0(Window window) {
        Intrinsics.m97802h(window, "window");
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = -2;
        attributes.width = -1;
        window.setGravity(80);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(mo65443Z());
        }
        window.setAttributes(attributes);
    }

    @Override // com.transsion.baseui.dialog.BaseDialogFragment
    public void initView() {
        ImageView closeIV = ((C28986b) getMViewBinding()).f88673c;
        Intrinsics.m97801g(closeIV, "closeIV");
        AbstractC26006c.m102050c(closeIV, 0L, new Function1() { // from class: com.transsion.mbwidget.guide.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddWidgetDialog.m69727q0(this.f54121a, (View) obj);
            }
        }, 1, null);
        GradientTextView tipsTv = ((C28986b) getMViewBinding()).f88674d;
        Intrinsics.m97801g(tipsTv, "tipsTv");
        AbstractC26006c.m102050c(tipsTv, 0L, new Function1() { // from class: com.transsion.mbwidget.guide.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddWidgetDialog.m69728r0(this.f54122a, (View) obj);
            }
        }, 1, null);
        TextView addTv = ((C28986b) getMViewBinding()).f88672b;
        Intrinsics.m97801g(addTv, "addTv");
        AbstractC26006c.m102050c(addTv, 0L, new Function1() { // from class: com.transsion.mbwidget.guide.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AddWidgetDialog.m69729s0(this.f54123a, (View) obj);
            }
        }, 1, null);
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new C157394(null), 3, null);
    }

    @Override // com.transsion.baseui.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C15747a.f54125a.m69745a();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC15742a interfaceC15742aM69634j = C15716d.f54081a.m69634j();
        if (interfaceC15742aM69634j != null) {
            interfaceC15742aM69634j.onDismiss();
        }
        Function0 function0 = this.onDismissListener;
        if (function0 != null) {
            function0.invoke();
        }
        this.onDismissListener = null;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m69730t0(Function0 function0) {
        this.onDismissListener = function0;
    }
}
