package com.transsion.subroom.activity;

import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import ch.C5096b;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.therouter.TheRouter;
import com.transsion.baselib.helper.C14451b;
import com.transsion.baselib.helper.ReferrerBean;
import com.transsion.baselib.report.launch.RoomInstallReferrer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p382el.InterfaceC23181a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.subroom.activity.SplashActivity$toMain$1", m97637f = "SplashActivity.kt", m97638l = {300}, m97639m = "invokeSuspend")
final class SplashActivity$toMain$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SplashActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SplashActivity$toMain$1(SplashActivity splashActivity, Continuation<? super SplashActivity$toMain$1> continuation) {
        super(2, continuation);
        this.this$0 = splashActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SplashActivity$toMain$1 splashActivity$toMain$1 = new SplashActivity$toMain$1(this.this$0, continuation);
        splashActivity$toMain$1.L$0 = obj;
        return splashActivity$toMain$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SplashActivity$toMain$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC25149n0 interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
            RoomInstallReferrer roomInstallReferrer = RoomInstallReferrer.f50962a;
            this.label = 1;
            if (roomInstallReferrer.m65339f(interfaceC25149n0, this) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        C5096b.a aVar = C5096b.f17579a;
        Application application = this.this$0.getApplication();
        Intrinsics.m97801g(application, "getApplication(...)");
        if (TextUtils.equals(aVar.m23865e(application), "gp")) {
            RoomInstallReferrer roomInstallReferrer2 = RoomInstallReferrer.f50962a;
            Application application2 = this.this$0.getApplication();
            Intrinsics.m97801g(application2, "getApplication(...)");
            roomInstallReferrer2.m65338e(application2, new RoomInstallReferrer.InterfaceC14493a() { // from class: com.transsion.subroom.activity.SplashActivity$toMain$1.1
                @Override // com.transsion.baselib.report.launch.RoomInstallReferrer.InterfaceC14493a
                /* JADX INFO: renamed from: a */
                public void mo65341a(ReferrerBean referrer) {
                    String utmContent;
                    InterfaceC23181a interfaceC23181a;
                    Intrinsics.m97802h(referrer, "referrer");
                    if (TextUtils.isEmpty(referrer.getUtmContent())) {
                        return;
                    }
                    try {
                        if (Intrinsics.m97797c(referrer.getUtmSource(), "fission-share") && (utmContent = referrer.getUtmContent()) != null && (interfaceC23181a = (InterfaceC23181a) TheRouter.m61774d(InterfaceC23181a.class, new Object[0])) != null) {
                            interfaceC23181a.mo66555a(utmContent);
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    Uri uriM65157g = C14451b.f50862a.m65157g(Uri.parse(referrer.getUtmContent()));
                    if (uriM65157g != null) {
                        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new SplashActivity$toMain$1$1$onResolved$2(uriM65157g, null), 3, null);
                    }
                }
            });
        } else {
            RoomInstallReferrer roomInstallReferrer3 = RoomInstallReferrer.f50962a;
            Application application3 = this.this$0.getApplication();
            Intrinsics.m97801g(application3, "getApplication(...)");
            roomInstallReferrer3.m65340i(application3, TmcConstants.ROUTE_UNKNOWN, null);
        }
        return Unit.f75682a;
    }
}
