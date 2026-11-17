package com.transsion.usercenter.setting;

import ch.C5096b;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.R$string;
import com.transsion.usercenter.R$layout;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25207u0;
import kotlinx.coroutines.InterfaceC25149n0;
import p390ex.C23241a;
import p550kj.C24662i;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.usercenter.setting.SettingActivity$clickFamilyMode$1", m97637f = "SettingActivity.kt", m97638l = {682}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class SettingActivity$clickFamilyMode$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ SettingActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingActivity$clickFamilyMode$1(SettingActivity settingActivity, Continuation<? super SettingActivity$clickFamilyMode$1> continuation) {
        super(2, continuation);
        this.this$0 = settingActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SettingActivity$clickFamilyMode$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SettingActivity$clickFamilyMode$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z11;
        SettingActivity settingActivity;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            C14496b c14496b = C14496b.f50966a;
            boolean z12 = c14496b.m65344b().getBoolean("k_is_family_mode", false);
            SettingActivity settingActivity2 = this.this$0;
            c14496b.m65344b().putBoolean("k_is_family_mode", !z12);
            settingActivity2.m85594I0().m110498p(!z12);
            settingActivity2.m85643q1(settingActivity2.m85594I0());
            C5096b.f17579a.m23862b("X-Family-Mode", !z12 ? "1" : "0");
            C23241a c23241a = new C23241a(z12);
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = C23241a.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.postEvent(name, c23241a, 0L);
            settingActivity2.showLoading();
            this.L$0 = settingActivity2;
            this.Z$0 = z12;
            this.label = 1;
            if (AbstractC25207u0.m99223a(2000L, this) == objF) {
                return objF;
            }
            z11 = z12;
            settingActivity = settingActivity2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = this.Z$0;
            settingActivity = (SettingActivity) this.L$0;
            ResultKt.m97107b(obj);
        }
        settingActivity.m85590E0();
        int i12 = z11 ? R$string.family_mode_off_toast : R$string.family_mode_on_toast;
        C28951b.a aVar = C28951b.f88586a;
        int i13 = R$layout.toast_family_mode;
        String string = Utils.m27275a().getString(i12);
        Intrinsics.m97801g(string, "getString(...)");
        aVar.m111457g(i13, string, (24 & 4) != 0 ? 0 : 0, (24 & 8) != 0 ? 0 : 0, (24 & 16) != 0 ? 0 : 0);
        C24662i.f75350a.m96881p(settingActivity.getPageName(), MapsKt.m97577l(TuplesKt.m97108a("state", z11 ? "on" : "off"), TuplesKt.m97108a("opt_type", "family_mode_switch")));
        return Unit.f75682a;
    }
}
