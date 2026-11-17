package com.transsion.member;

import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.AbstractC5775a;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
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
import p352dn.InterfaceC22998b;
import p352dn.InterfaceC23006j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.member.MemberFragment$handlePurchaseSucceed$1", m97637f = "MemberFragment.kt", m97638l = {}, m97639m = "invokeSuspend")
final class MemberFragment$handlePurchaseSucceed$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $buttonTitle;
    final /* synthetic */ String $title;
    int label;
    final /* synthetic */ MemberFragment this$0;

    /* JADX INFO: renamed from: com.transsion.member.MemberFragment$handlePurchaseSucceed$1$a */
    public static final class C15754a implements InterfaceC23006j {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MemberFragment f54151a;

        C15754a(MemberFragment memberFragment) {
            this.f54151a = memberFragment;
        }

        @Override // p352dn.InterfaceC23006j
        /* JADX INFO: renamed from: a */
        public void mo69823a() {
            OnBackPressedDispatcher onBackPressedDispatcher;
            if (!(this.f54151a.getActivity() instanceof MemberActivity)) {
                Navigator.m61845x(TheRouter.m61773c("/main/tab").m61852F("tabIndex", 0), this.f54151a.requireContext(), null, 2, null);
                return;
            }
            FragmentActivity activity = this.f54151a.getActivity();
            if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
                return;
            }
            onBackPressedDispatcher.m944l();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MemberFragment$handlePurchaseSucceed$1(MemberFragment memberFragment, String str, String str2, Continuation<? super MemberFragment$handlePurchaseSucceed$1> continuation) {
        super(2, continuation);
        this.this$0 = memberFragment;
        this.$title = str;
        this.$buttonTitle = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemberFragment$handlePurchaseSucceed$1(this.this$0, this.$title, this.$buttonTitle, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((MemberFragment$handlePurchaseSucceed$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        if (!Intrinsics.m97797c(this.this$0.getActivity(), AbstractC5775a.m27311b()) || !this.this$0.isVisible()) {
            return Unit.f75682a;
        }
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            FragmentActivity activity = this.this$0.getActivity();
            String str = this.$title;
            if (str == null) {
                str = "";
            }
            String str2 = this.$buttonTitle;
            interfaceC22998b.mo69853g(activity, str, str2 != null ? str2 : "", new C15754a(this.this$0));
        }
        return Unit.f75682a;
    }
}
