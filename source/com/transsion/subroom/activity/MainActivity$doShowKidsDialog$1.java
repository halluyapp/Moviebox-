package com.transsion.subroom.activity;

import ck.C5118o;
import com.transsion.baselib.kids.KidsAccountManager;
import com.transsion.usercenter.kids.AccountSwitchDialog;
import com.transsion.usercenter.kids.CreateKidsProfileDialog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.subroom.activity.MainActivity$doShowKidsDialog$1", m97637f = "MainActivity.kt", m97638l = {335, 347}, m97639m = "invokeSuspend")
final class MainActivity$doShowKidsDialog$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivity$doShowKidsDialog$1(MainActivity mainActivity, Continuation<? super MainActivity$doShowKidsDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainActivity$doShowKidsDialog$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((MainActivity$doShowKidsDialog$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            if (!C5118o.f17608a.m23949j()) {
                return Unit.f75682a;
            }
            KidsAccountManager kidsAccountManager = KidsAccountManager.f50883a;
            if (kidsAccountManager.m65181f() != null) {
                if (kidsAccountManager.m65184j()) {
                    C26866a.a.m104898f(C26866a.f81698a, "MainActivity", "switchDialogSuppressed.", false, 4, null);
                    return Unit.f75682a;
                }
                this.label = 1;
                obj = kidsAccountManager.m65188o(this);
                if (obj == objF) {
                    return objF;
                }
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.f75682a;
                }
                if (this.this$0.isDestroyed()) {
                }
                return Unit.f75682a;
            }
            if (kidsAccountManager.m65182g()) {
                C26866a.a.m104898f(C26866a.f81698a, "MainActivity", "createDialogSuppressed.", false, 4, null);
                return Unit.f75682a;
            }
            this.label = 2;
            obj = kidsAccountManager.m65188o(this);
            if (obj == objF) {
                return objF;
            }
            if (!((Boolean) obj).booleanValue()) {
                return Unit.f75682a;
            }
            if (this.this$0.isDestroyed()) {
            }
            return Unit.f75682a;
        }
        if (i11 == 1) {
            ResultKt.m97107b(obj);
            if (!((Boolean) obj).booleanValue()) {
                return Unit.f75682a;
            }
            if (!this.this$0.isDestroyed() || this.this$0.isFinishing()) {
                return Unit.f75682a;
            }
            AccountSwitchDialog.INSTANCE.m84673a(true).m61941X(this.this$0, "AccountSwitchDialog");
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            if (!((Boolean) obj).booleanValue()) {
                return Unit.f75682a;
            }
            if (!this.this$0.isDestroyed() || this.this$0.isFinishing()) {
                return Unit.f75682a;
            }
            CreateKidsProfileDialog.Companion.m84693b(CreateKidsProfileDialog.INSTANCE, false, true, false, 1, null).m61941X(this.this$0, "CreateKidsProfileDialog");
        }
        return Unit.f75682a;
    }
}
