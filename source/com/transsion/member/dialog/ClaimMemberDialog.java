package com.transsion.member.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.Lifecycle;
import bn.C4858g;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.bumptech.glide.Glide;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.cloud.tmc.miniapp.utils.toast.ToastStrategy;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$style;
import com.therouter.TheRouter;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.member.C15777a;
import com.transsion.member.R$layout;
import com.transsion.member.R$mipmap;
import com.transsion.member.R$string;
import com.transsion.memberapi.MemberTaskItem;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25207u0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.InterfaceC25204t1;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC25018h1;
import p352dn.InterfaceC22998b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0003R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)¨\u0006-"}, m97100d2 = {"Lcom/transsion/member/dialog/ClaimMemberDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "t0", "(Landroid/view/View;)V", "x0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", TmcConstants.NAVIGATION_ON_START, "r0", "Lcom/transsion/memberapi/MemberTaskItem;", "c", "Lcom/transsion/memberapi/MemberTaskItem;", "s0", "()Lcom/transsion/memberapi/MemberTaskItem;", "y0", "(Lcom/transsion/memberapi/MemberTaskItem;)V", "info", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "I", "getMBottomMargin", "()I", "z0", "(I)V", "mBottomMargin", "", "e", "J", "showTime", "Lkotlinx/coroutines/t1;", "f", "Lkotlinx/coroutines/t1;", "dismissJob", "g", "infoJob", "Member_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ClaimMemberDialog extends BaseDialog {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private MemberTaskItem info;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int mBottomMargin;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long showTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private InterfaceC25204t1 dismissJob;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private InterfaceC25204t1 infoJob;

    /* JADX INFO: renamed from: com.transsion.member.dialog.ClaimMemberDialog$onStart$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.member.dialog.ClaimMemberDialog$onStart$1", m97637f = "ClaimMemberDialog.kt", m97638l = {107}, m97639m = "invokeSuspend")
    static final class C157971 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;

        C157971(Continuation<? super C157971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ClaimMemberDialog.this.new C157971(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C157971) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                if (ClaimMemberDialog.this.getInfo() != null) {
                    long j11 = ClaimMemberDialog.this.showTime;
                    this.label = 1;
                    if (AbstractC25207u0.m99223a(j11, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            ClaimMemberDialog.this.m69998r0();
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.dialog.ClaimMemberDialog$onStart$2 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.member.dialog.ClaimMemberDialog$onStart$2", m97637f = "ClaimMemberDialog.kt", m97638l = {Sdk$SDKError.Reason.ASSET_WRITE_ERROR_VALUE}, m97639m = "invokeSuspend")
    static final class C157982 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC25018h1 $dataFlow;
        int label;
        final /* synthetic */ ClaimMemberDialog this$0;

        /* JADX INFO: renamed from: com.transsion.member.dialog.ClaimMemberDialog$onStart$2$1, reason: invalid class name */
        @Metadata(m97099d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m97100d2 = {"<anonymous>", "", "it", ""}, m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        @DebugMetadata(m97636c = "com.transsion.member.dialog.ClaimMemberDialog$onStart$2$1", m97637f = "ClaimMemberDialog.kt", m97638l = {}, m97639m = "invokeSuspend")
        static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final /* synthetic */ InterfaceC25018h1 $dataFlow;
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ ClaimMemberDialog this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ClaimMemberDialog claimMemberDialog, InterfaceC25018h1 interfaceC25018h1, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = claimMemberDialog;
                this.$dataFlow = interfaceC25018h1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$dataFlow, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.f75682a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.m97630f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
                if (!this.Z$0) {
                    this.this$0.m69998r0();
                }
                C15777a.f54210a.m69947a("ClaimMemberDialog hasMemberShip:" + this.$dataFlow.getValue());
                return Unit.f75682a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C157982(InterfaceC25018h1 interfaceC25018h1, ClaimMemberDialog claimMemberDialog, Continuation<? super C157982> continuation) {
            super(2, continuation);
            this.$dataFlow = interfaceC25018h1;
            this.this$0 = claimMemberDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C157982(this.$dataFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C157982) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC25018h1 interfaceC25018h1 = this.$dataFlow;
                if (interfaceC25018h1 != null) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC25018h1, null);
                    this.label = 1;
                    if (AbstractC25001c.m98789h(interfaceC25018h1, anonymousClass1, this) == objF) {
                        return objF;
                    }
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

    public ClaimMemberDialog() {
        super(R$layout.dialog_member_claim_layout);
        this.mBottomMargin = AbstractC5776a0.m27313a(50.0f);
        this.showTime = ToastStrategy.LONG_DURATION_TIMEOUT;
    }

    /* JADX INFO: renamed from: t0 */
    private final void m69993t0(View view) {
        C4858g c4858gM23365a = C4858g.m23365a(view);
        Intrinsics.m97801g(c4858gM23365a, "bind(...)");
        c4858gM23365a.f17212d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.member.dialog.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ClaimMemberDialog.m69994u0(this.f54299a, view2);
            }
        });
        c4858gM23365a.f17210b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.member.dialog.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ClaimMemberDialog.m69995v0(this.f54300a, view2);
            }
        });
        MemberTaskItem memberTaskItem = this.info;
        if (memberTaskItem != null) {
            TextView textView = c4858gM23365a.f17215g;
            String title = memberTaskItem.getTitle();
            if (title == null) {
                title = "";
            }
            textView.setText(title);
            TextView textView2 = c4858gM23365a.f17214f;
            String subTitle = memberTaskItem.getSubTitle();
            textView2.setText(subTitle != null ? subTitle : "");
            TextView textView3 = c4858gM23365a.f17210b;
            String buttonName = memberTaskItem.getButtonName();
            if (buttonName == null) {
                buttonName = getString(R$string.member_claim_now);
                Intrinsics.m97801g(buttonName, "getString(...)");
            }
            textView3.setText(buttonName);
            Glide.with(requireContext()).load2(memberTaskItem.getIcon()).placeholder(R$mipmap.ic_premium_mask).error(R$mipmap.ic_premium_mask).into(c4858gM23365a.f17213e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m69994u0(ClaimMemberDialog claimMemberDialog, View view) {
        claimMemberDialog.m69998r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m69995v0(final ClaimMemberDialog claimMemberDialog, View view) {
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            InterfaceC22998b.a.m91586b(interfaceC22998b, null, new Function0() { // from class: com.transsion.member.dialog.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ClaimMemberDialog.m69996w0(this.f54301a);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final Unit m69996w0(ClaimMemberDialog claimMemberDialog) {
        claimMemberDialog.m69998r0();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: x0 */
    private final void m69997x0() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(true);
        }
        window.setDimAmount(0.0f);
        window.setLayout(-1, -2);
        window.setGravity(48);
        WindowManager.LayoutParams attributes = window.getAttributes();
        Intrinsics.m97801g(attributes, "getAttributes(...)");
        attributes.flags |= 32;
        window.setAttributes(attributes);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.center_DialogStyle);
    }

    @Override // com.transsion.baseui.dialog.BaseDialog, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC25204t1 interfaceC25204t1 = this.dismissJob;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
        this.dismissJob = null;
        InterfaceC25204t1 interfaceC25204t2 = this.infoJob;
        if (interfaceC25204t2 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t2, null, 1, null);
        }
        this.infoJob = null;
    }

    @Override // com.transsion.baseui.dialog.BaseDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        try {
            super.onStart();
        } catch (Exception unused) {
            dismiss();
        }
        this.dismissJob = AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), C25220y0.m99269c(), null, new C157971(null), 2, null);
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        this.infoJob = AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), C25220y0.m99269c(), null, new C157982(interfaceC22998b != null ? interfaceC22998b.mo69847a() : null, this, null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m69997x0();
        m69993t0(view);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m69998r0() {
        C15777a.f54210a.m69947a("ClaimMemberDialog lifecycle:" + getLifecycle().mo14833b());
        InterfaceC25204t1 interfaceC25204t1 = this.dismissJob;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
        InterfaceC25204t1 interfaceC25204t2 = this.infoJob;
        if (interfaceC25204t2 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t2, null, 1, null);
        }
        if (getLifecycle().mo14833b().isAtLeast(Lifecycle.State.RESUMED)) {
            try {
                dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: s0, reason: from getter */
    public final MemberTaskItem getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m70000y0(MemberTaskItem memberTaskItem) {
        this.info = memberTaskItem;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m70001z0(int i11) {
        this.mBottomMargin = i11;
    }
}
