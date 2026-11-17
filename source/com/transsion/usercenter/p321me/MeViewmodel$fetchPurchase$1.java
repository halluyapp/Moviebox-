package com.transsion.usercenter.p321me;

import com.blankj.utilcode.util.AbstractC5796o;
import com.p282tn.lib.net.bean.BaseDto;
import com.tencent.mmkv.MMKV;
import com.transsion.usercenter.profile.InterfaceC20652d;
import com.transsion.usercenter.profile.bean.ZeroBody;
import com.transsion.usercenter.profile.bean.ZeroConfig;
import com.transsion.usercenter.profile.bean.ZeroInfo;
import com.transsion.usercenter.profile.bean.ZeroResponse;
import com.transsnet.loginapi.bean.UserInfo;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import mh.C25835b;
import okhttp3.RequestBody;
import p411fh.C23366a;
import p411fh.C23367b;
import p441gz.InterfaceC23704a;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.usercenter.me.MeViewmodel$fetchPurchase$1", m97637f = "MeViewmodel.kt", m97638l = {211}, m97639m = "invokeSuspend")
final class MeViewmodel$fetchPurchase$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MeViewmodel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MeViewmodel$fetchPurchase$1(MeViewmodel meViewmodel, Continuation<? super MeViewmodel$fetchPurchase$1> continuation) {
        super(2, continuation);
        this.this$0 = meViewmodel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MeViewmodel$fetchPurchase$1 meViewmodel$fetchPurchase$1 = new MeViewmodel$fetchPurchase$1(this.this$0, continuation);
        meViewmodel$fetchPurchase$1.L$0 = obj;
        return meViewmodel$fetchPurchase$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((MeViewmodel$fetchPurchase$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        String upperCase;
        Object objM85306a;
        MeViewmodel meViewmodel;
        String string;
        UserInfo userInfoMo90386h;
        UserInfo userInfoMo90386h2;
        List<ZeroInfo> listL;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                MeViewmodel meViewmodel2 = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                String string2 = TimeZone.getDefault().getID().toString();
                InterfaceC23704a interfaceC23704aM84958B = meViewmodel2.m84958B();
                String phone = (interfaceC23704aM84958B == null || (userInfoMo90386h2 = interfaceC23704aM84958B.mo90386h()) == null) ? null : userInfoMo90386h2.getPhone();
                InterfaceC23704a interfaceC23704aM84958B2 = meViewmodel2.m84958B();
                String userId = (interfaceC23704aM84958B2 == null || (userInfoMo90386h = interfaceC23704aM84958B2.mo90386h()) == null) ? null : userInfoMo90386h.getUserId();
                String strM101494i = C25835b.f78806a.m101494i();
                MMKV mmkvM92790c = C23366a.f71263a.m92790c();
                if (mmkvM92790c == null || (string = mmkvM92790c.getString("custom_local_iso", "")) == null) {
                    upperCase = null;
                } else {
                    upperCase = string.toUpperCase(Locale.ROOT);
                    Intrinsics.m97801g(upperCase, "toUpperCase(...)");
                }
                C23367b.a aVar = C23367b.f71265a;
                String strM27447j = AbstractC5796o.m27447j(new ZeroBody(upperCase == null ? "" : upperCase, phone, userId, strM101494i, string2, 0, null, 96, null));
                Intrinsics.m97801g(strM27447j, "toJson(...)");
                RequestBody requestBodyM92796a = aVar.m92796a(strM27447j);
                if (requestBodyM92796a == null) {
                    return Unit.f75682a;
                }
                ZeroConfig zeroConfig = meViewmodel2.f64966e;
                String urlPath = zeroConfig != null ? zeroConfig.getUrlPath() : null;
                if (urlPath == null || urlPath.length() == 0) {
                    urlPath = "campaign/v1/freebuy/campaign/recent";
                }
                InterfaceC20652d interfaceC20652dM84960D = meViewmodel2.m84960D();
                this.L$0 = meViewmodel2;
                this.label = 1;
                objM85306a = interfaceC20652dM84960D.m85306a(requestBodyM92796a, urlPath, this);
                if (objM85306a == objF) {
                    return objF;
                }
                meViewmodel = meViewmodel2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                meViewmodel = (MeViewmodel) this.L$0;
                ResultKt.m97107b(obj);
                objM85306a = obj;
            }
            BaseDto baseDto = (BaseDto) objM85306a;
            C26866a.a.m104898f(C26866a.f81698a, "MeViewmodel", "zero entrance:" + baseDto, false, 4, null);
            if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
                meViewmodel.f64965d.clear();
                List list = meViewmodel.f64965d;
                ZeroResponse zeroResponse = (ZeroResponse) baseDto.getData();
                if (zeroResponse == null || (listL = zeroResponse.getItems()) == null) {
                    listL = CollectionsKt.m97506l();
                }
                list.addAll(listL);
                meViewmodel.m84969N();
            }
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("error:");
            sb2.append(thM112710exceptionOrNullimpl);
        }
        return Unit.f75682a;
    }
}
