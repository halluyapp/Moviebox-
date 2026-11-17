package com.transsion.usercenter.profile;

import androidx.fragment.app.FragmentActivity;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.transsion.usercenter.R$string;
import com.transsion.version.update.UpdateManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.usercenter.profile.ProfileFragment$onClick$2$1", m97637f = "ProfileFragment.kt", m97638l = {949}, m97639m = "invokeSuspend")
final class ProfileFragment$onClick$2$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $it;
    int label;
    final /* synthetic */ ProfileFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileFragment$onClick$2$1(FragmentActivity fragmentActivity, ProfileFragment profileFragment, Continuation<? super ProfileFragment$onClick$2$1> continuation) {
        super(2, continuation);
        this.$it = fragmentActivity;
        this.this$0 = profileFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfileFragment$onClick$2$1(this.$it, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ProfileFragment$onClick$2$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            UpdateManager updateManagerM85865a = UpdateManager.f65568f.m85865a();
            FragmentActivity fragmentActivity = this.$it;
            this.label = 1;
            obj = updateManagerM85865a.m85864i(fragmentActivity, "profile_page", "wefeed-mobile-bff", "", true, this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            C13806h.f49015a.m62325l(this.this$0.getString(R$string.profile_setting_check_update_tip));
        }
        return Unit.f75682a;
    }
}
