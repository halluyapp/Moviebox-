package com.transsion.rewardscenter.utils;

import com.cloud.tmc.integration.net.UrlKt;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.rewardscenterapi.ClaimReceiverRequest;
import com.transsion.rewardscenterapi.PhoneInfo;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mh.C25835b;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p349dh.C22982c;
import p952yp.InterfaceC28992a;

/* JADX INFO: loaded from: classes6.dex */
public final class RewardsCenterApiHelper {

    /* JADX INFO: renamed from: a */
    public static final RewardsCenterApiHelper f58979a = new RewardsCenterApiHelper();

    /* JADX INFO: renamed from: b */
    private static final Lazy f58980b = LazyKt.m97097b(new Function0() { // from class: com.transsion.rewardscenter.utils.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RewardsCenterApiHelper.m76609h();
        }
    });

    /* JADX INFO: renamed from: c */
    public static final int f58981c = 8;

    private RewardsCenterApiHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC28992a m76609h() {
        return (InterfaceC28992a) C22982c.f70163e.m91553a().m91552h(InterfaceC28992a.class);
    }

    /* JADX INFO: renamed from: i */
    private final RequestBody m76610i(Function1 function1) {
        RequestBody.Companion companion = RequestBody.INSTANCE;
        JSONObject jSONObject = new JSONObject();
        function1.invoke(jSONObject);
        String string = jSONObject.toString();
        Intrinsics.m97801g(string, "toString(...)");
        return companion.create(string, MediaType.INSTANCE.parse("application/json"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final Unit m76611k(JSONObject buildBody) throws JSONException {
        Intrinsics.m97802h(buildBody, "$this$buildBody");
        buildBody.put(UrlKt.KEY_MINI_GAID, C25835b.f78806a.m101494i());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final Unit m76612m(String str, JSONObject buildBody) throws JSONException {
        Intrinsics.m97802h(buildBody, "$this$buildBody");
        buildBody.put("drawResultId", str);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Object m76613o(RewardsCenterApiHelper rewardsCenterApiHelper, Function2 function2, Function1 function1, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function2 = null;
        }
        return rewardsCenterApiHelper.m76621n(function2, function1, continuation);
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC28992a m76614p() {
        return (InterfaceC28992a) f58980b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Unit m76615r(String str, JSONObject buildBody) throws JSONException {
        Intrinsics.m97802h(buildBody, "$this$buildBody");
        buildBody.put("activityId", str);
        buildBody.put("num", 1);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Unit m76616t(String str, JSONObject buildBody) throws JSONException {
        Intrinsics.m97802h(buildBody, "$this$buildBody");
        buildBody.put("skuId", str);
        buildBody.put("clientOrderId", UUID.randomUUID().toString());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final Unit m76617v(String str, JSONObject buildBody) throws JSONException {
        Intrinsics.m97802h(buildBody, "$this$buildBody");
        if (str == null) {
            str = "";
        }
        buildBody.put("taskId", str);
        buildBody.put(UrlKt.KEY_MINI_GAID, C25835b.f78806a.m101494i());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final Unit m76618x(ClaimReceiverRequest claimReceiverRequest, JSONObject buildBody) throws JSONException {
        Intrinsics.m97802h(buildBody, "$this$buildBody");
        Object drawResultId = claimReceiverRequest.getDrawResultId();
        if (drawResultId == null) {
            drawResultId = "";
        }
        buildBody.put("drawResultId", drawResultId);
        Object receiverName = claimReceiverRequest.getReceiverName();
        if (receiverName == null) {
            receiverName = "";
        }
        buildBody.put("receiverName", receiverName);
        JSONArray jSONArray = new JSONArray();
        List<PhoneInfo> phone = claimReceiverRequest.getPhone();
        if (phone != null) {
            for (PhoneInfo phoneInfo : phone) {
                JSONObject jSONObject = new JSONObject();
                String countryNo = phoneInfo.getCountryNo();
                if (countryNo == null) {
                    countryNo = "";
                }
                jSONObject.put("countryNo", countryNo);
                String number = phoneInfo.getNumber();
                if (number == null) {
                    number = "";
                }
                jSONObject.put("number", number);
                String countryCode = phoneInfo.getCountryCode();
                if (countryCode == null) {
                    countryCode = "";
                }
                jSONObject.put("countryCode", countryCode);
                jSONArray.put(jSONObject);
            }
        }
        Unit unit = Unit.f75682a;
        buildBody.put("phone", jSONArray);
        Object address = claimReceiverRequest.getAddress();
        buildBody.put(PlaceTypes.ADDRESS, address != null ? address : "");
        String email = claimReceiverRequest.getEmail();
        if (email != null && !StringsKt.m98160q0(email)) {
            buildBody.put("email", claimReceiverRequest.getEmail());
        }
        String postCode = claimReceiverRequest.getPostCode();
        if (postCode != null && !StringsKt.m98160q0(postCode)) {
            buildBody.put("postCode", claimReceiverRequest.getPostCode());
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: j */
    public final Object m76619j(Function2 function2, Function1 function1, Continuation continuation) throws Throwable {
        RewardsCenterApiHelper$checkDadaSetDefault$1 rewardsCenterApiHelper$checkDadaSetDefault$1;
        Object objM112707constructorimpl;
        if (continuation instanceof RewardsCenterApiHelper$checkDadaSetDefault$1) {
            rewardsCenterApiHelper$checkDadaSetDefault$1 = (RewardsCenterApiHelper$checkDadaSetDefault$1) continuation;
            int i11 = rewardsCenterApiHelper$checkDadaSetDefault$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rewardsCenterApiHelper$checkDadaSetDefault$1.label = i11 - Integer.MIN_VALUE;
            } else {
                rewardsCenterApiHelper$checkDadaSetDefault$1 = new RewardsCenterApiHelper$checkDadaSetDefault$1(this, continuation);
            }
        } else {
            rewardsCenterApiHelper$checkDadaSetDefault$1 = new RewardsCenterApiHelper$checkDadaSetDefault$1(this, continuation);
        }
        RewardsCenterApiHelper$checkDadaSetDefault$1 rewardsCenterApiHelper$checkDadaSetDefault$2 = rewardsCenterApiHelper$checkDadaSetDefault$1;
        Object objM111525a = rewardsCenterApiHelper$checkDadaSetDefault$2.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = rewardsCenterApiHelper$checkDadaSetDefault$2.label;
        try {
            if (i12 == 0) {
                ResultKt.m97107b(objM111525a);
                RequestBody requestBodyM76610i = m76610i(new Function1() { // from class: com.transsion.rewardscenter.utils.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RewardsCenterApiHelper.m76611k((JSONObject) obj);
                    }
                });
                Result.Companion companion = Result.INSTANCE;
                InterfaceC28992a interfaceC28992aM76614p = m76614p();
                rewardsCenterApiHelper$checkDadaSetDefault$2.L$0 = function2;
                rewardsCenterApiHelper$checkDadaSetDefault$2.L$1 = function1;
                rewardsCenterApiHelper$checkDadaSetDefault$2.label = 1;
                objM111525a = InterfaceC28992a.a.m111525a(interfaceC28992aM76614p, null, requestBodyM76610i, rewardsCenterApiHelper$checkDadaSetDefault$2, 1, null);
                if (objM111525a == objF) {
                    return objF;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) rewardsCenterApiHelper$checkDadaSetDefault$2.L$1;
                function2 = (Function2) rewardsCenterApiHelper$checkDadaSetDefault$2.L$0;
                ResultKt.m97107b(objM111525a);
            }
            objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) objM111525a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
            BaseDto baseDto = (BaseDto) objM112707constructorimpl;
            if (AbstractC18019n.m76640a(baseDto)) {
                function1.invoke(baseDto.getData());
            } else if (function2 != null) {
                function2.invoke(baseDto.getCode(), baseDto.getMsg());
            }
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null && function2 != null) {
            function2.invoke(null, thM112710exceptionOrNullimpl.getMessage());
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: l */
    public final Object m76620l(final String str, Function2 function2, Function1 function1, Continuation continuation) throws Throwable {
        RewardsCenterApiHelper$claimReward$1 rewardsCenterApiHelper$claimReward$1;
        Object objM112707constructorimpl;
        if (continuation instanceof RewardsCenterApiHelper$claimReward$1) {
            rewardsCenterApiHelper$claimReward$1 = (RewardsCenterApiHelper$claimReward$1) continuation;
            int i11 = rewardsCenterApiHelper$claimReward$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rewardsCenterApiHelper$claimReward$1.label = i11 - Integer.MIN_VALUE;
            } else {
                rewardsCenterApiHelper$claimReward$1 = new RewardsCenterApiHelper$claimReward$1(this, continuation);
            }
        } else {
            rewardsCenterApiHelper$claimReward$1 = new RewardsCenterApiHelper$claimReward$1(this, continuation);
        }
        RewardsCenterApiHelper$claimReward$1 rewardsCenterApiHelper$claimReward$2 = rewardsCenterApiHelper$claimReward$1;
        Object objM111526b = rewardsCenterApiHelper$claimReward$2.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = rewardsCenterApiHelper$claimReward$2.label;
        try {
            if (i12 == 0) {
                ResultKt.m97107b(objM111526b);
                RequestBody requestBodyM76610i = m76610i(new Function1() { // from class: com.transsion.rewardscenter.utils.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RewardsCenterApiHelper.m76612m(str, (JSONObject) obj);
                    }
                });
                Result.Companion companion = Result.INSTANCE;
                InterfaceC28992a interfaceC28992aM76614p = m76614p();
                rewardsCenterApiHelper$claimReward$2.L$0 = function2;
                rewardsCenterApiHelper$claimReward$2.L$1 = function1;
                rewardsCenterApiHelper$claimReward$2.label = 1;
                objM111526b = InterfaceC28992a.a.m111526b(interfaceC28992aM76614p, null, requestBodyM76610i, rewardsCenterApiHelper$claimReward$2, 1, null);
                if (objM111526b == objF) {
                    return objF;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) rewardsCenterApiHelper$claimReward$2.L$1;
                function2 = (Function2) rewardsCenterApiHelper$claimReward$2.L$0;
                ResultKt.m97107b(objM111526b);
            }
            objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) objM111526b);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
            BaseDto baseDto = (BaseDto) objM112707constructorimpl;
            if (AbstractC18019n.m76640a(baseDto)) {
                function1.invoke(baseDto.getData());
            } else if (function2 != null) {
                function2.invoke(baseDto.getCode(), baseDto.getMsg());
            }
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null && function2 != null) {
            function2.invoke(null, thM112710exceptionOrNullimpl.getMessage());
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m76621n(Function2 function2, Function1 function1, Continuation continuation) throws Throwable {
        RewardsCenterApiHelper$fetchAdTaskInfo$1 rewardsCenterApiHelper$fetchAdTaskInfo$1;
        Object objM112707constructorimpl;
        if (continuation instanceof RewardsCenterApiHelper$fetchAdTaskInfo$1) {
            rewardsCenterApiHelper$fetchAdTaskInfo$1 = (RewardsCenterApiHelper$fetchAdTaskInfo$1) continuation;
            int i11 = rewardsCenterApiHelper$fetchAdTaskInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rewardsCenterApiHelper$fetchAdTaskInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                rewardsCenterApiHelper$fetchAdTaskInfo$1 = new RewardsCenterApiHelper$fetchAdTaskInfo$1(this, continuation);
            }
        } else {
            rewardsCenterApiHelper$fetchAdTaskInfo$1 = new RewardsCenterApiHelper$fetchAdTaskInfo$1(this, continuation);
        }
        Object objM111527c = rewardsCenterApiHelper$fetchAdTaskInfo$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = rewardsCenterApiHelper$fetchAdTaskInfo$1.label;
        try {
            if (i12 == 0) {
                ResultKt.m97107b(objM111527c);
                Result.Companion companion = Result.INSTANCE;
                InterfaceC28992a interfaceC28992aM76614p = m76614p();
                rewardsCenterApiHelper$fetchAdTaskInfo$1.L$0 = function2;
                rewardsCenterApiHelper$fetchAdTaskInfo$1.L$1 = function1;
                rewardsCenterApiHelper$fetchAdTaskInfo$1.label = 1;
                objM111527c = InterfaceC28992a.a.m111527c(interfaceC28992aM76614p, null, rewardsCenterApiHelper$fetchAdTaskInfo$1, 1, null);
                if (objM111527c == objF) {
                    return objF;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) rewardsCenterApiHelper$fetchAdTaskInfo$1.L$1;
                function2 = (Function2) rewardsCenterApiHelper$fetchAdTaskInfo$1.L$0;
                ResultKt.m97107b(objM111527c);
            }
            objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) objM111527c);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
            BaseDto baseDto = (BaseDto) objM112707constructorimpl;
            if (AbstractC18019n.m76640a(baseDto)) {
                function1.invoke(baseDto.getData());
            } else if (function2 != null) {
                function2.invoke(baseDto.getCode(), baseDto.getMsg());
            }
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null && function2 != null) {
            function2.invoke(null, thM112710exceptionOrNullimpl.getMessage());
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: q */
    public final Object m76622q(final String str, Function2 function2, Function1 function1, Continuation continuation) throws Throwable {
        RewardsCenterApiHelper$redeemLottery$1 rewardsCenterApiHelper$redeemLottery$1;
        Object objM112707constructorimpl;
        if (continuation instanceof RewardsCenterApiHelper$redeemLottery$1) {
            rewardsCenterApiHelper$redeemLottery$1 = (RewardsCenterApiHelper$redeemLottery$1) continuation;
            int i11 = rewardsCenterApiHelper$redeemLottery$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rewardsCenterApiHelper$redeemLottery$1.label = i11 - Integer.MIN_VALUE;
            } else {
                rewardsCenterApiHelper$redeemLottery$1 = new RewardsCenterApiHelper$redeemLottery$1(this, continuation);
            }
        } else {
            rewardsCenterApiHelper$redeemLottery$1 = new RewardsCenterApiHelper$redeemLottery$1(this, continuation);
        }
        RewardsCenterApiHelper$redeemLottery$1 rewardsCenterApiHelper$redeemLottery$2 = rewardsCenterApiHelper$redeemLottery$1;
        Object objM111531g = rewardsCenterApiHelper$redeemLottery$2.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = rewardsCenterApiHelper$redeemLottery$2.label;
        try {
            if (i12 == 0) {
                ResultKt.m97107b(objM111531g);
                RequestBody requestBodyM76610i = m76610i(new Function1() { // from class: com.transsion.rewardscenter.utils.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RewardsCenterApiHelper.m76615r(str, (JSONObject) obj);
                    }
                });
                Result.Companion companion = Result.INSTANCE;
                InterfaceC28992a interfaceC28992aM76614p = m76614p();
                rewardsCenterApiHelper$redeemLottery$2.L$0 = function2;
                rewardsCenterApiHelper$redeemLottery$2.L$1 = function1;
                rewardsCenterApiHelper$redeemLottery$2.label = 1;
                objM111531g = InterfaceC28992a.a.m111531g(interfaceC28992aM76614p, null, requestBodyM76610i, rewardsCenterApiHelper$redeemLottery$2, 1, null);
                if (objM111531g == objF) {
                    return objF;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) rewardsCenterApiHelper$redeemLottery$2.L$1;
                function2 = (Function2) rewardsCenterApiHelper$redeemLottery$2.L$0;
                ResultKt.m97107b(objM111531g);
            }
            objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) objM111531g);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
            BaseDto baseDto = (BaseDto) objM112707constructorimpl;
            if (AbstractC18019n.m76640a(baseDto)) {
                function1.invoke(baseDto.getData());
            } else if (function2 != null) {
                function2.invoke(baseDto.getCode(), baseDto.getMsg());
            }
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null && function2 != null) {
            function2.invoke(null, thM112710exceptionOrNullimpl.getMessage());
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: s */
    public final Object m76623s(final String str, Function2 function2, Function1 function1, Continuation continuation) throws Throwable {
        RewardsCenterApiHelper$redeemProduct$1 rewardsCenterApiHelper$redeemProduct$1;
        Object objM112707constructorimpl;
        if (continuation instanceof RewardsCenterApiHelper$redeemProduct$1) {
            rewardsCenterApiHelper$redeemProduct$1 = (RewardsCenterApiHelper$redeemProduct$1) continuation;
            int i11 = rewardsCenterApiHelper$redeemProduct$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rewardsCenterApiHelper$redeemProduct$1.label = i11 - Integer.MIN_VALUE;
            } else {
                rewardsCenterApiHelper$redeemProduct$1 = new RewardsCenterApiHelper$redeemProduct$1(this, continuation);
            }
        } else {
            rewardsCenterApiHelper$redeemProduct$1 = new RewardsCenterApiHelper$redeemProduct$1(this, continuation);
        }
        RewardsCenterApiHelper$redeemProduct$1 rewardsCenterApiHelper$redeemProduct$2 = rewardsCenterApiHelper$redeemProduct$1;
        Object objM111532h = rewardsCenterApiHelper$redeemProduct$2.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = rewardsCenterApiHelper$redeemProduct$2.label;
        try {
            if (i12 == 0) {
                ResultKt.m97107b(objM111532h);
                RequestBody requestBodyM76610i = m76610i(new Function1() { // from class: com.transsion.rewardscenter.utils.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RewardsCenterApiHelper.m76616t(str, (JSONObject) obj);
                    }
                });
                Result.Companion companion = Result.INSTANCE;
                InterfaceC28992a interfaceC28992aM76614p = m76614p();
                rewardsCenterApiHelper$redeemProduct$2.L$0 = function2;
                rewardsCenterApiHelper$redeemProduct$2.L$1 = function1;
                rewardsCenterApiHelper$redeemProduct$2.label = 1;
                objM111532h = InterfaceC28992a.a.m111532h(interfaceC28992aM76614p, null, requestBodyM76610i, rewardsCenterApiHelper$redeemProduct$2, 1, null);
                if (objM111532h == objF) {
                    return objF;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) rewardsCenterApiHelper$redeemProduct$2.L$1;
                function2 = (Function2) rewardsCenterApiHelper$redeemProduct$2.L$0;
                ResultKt.m97107b(objM111532h);
            }
            objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) objM111532h);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
            BaseDto baseDto = (BaseDto) objM112707constructorimpl;
            if (AbstractC18019n.m76640a(baseDto)) {
                function1.invoke(baseDto.getData());
            } else if (function2 != null) {
                function2.invoke(baseDto.getCode(), baseDto.getMsg());
            }
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null && function2 != null) {
            function2.invoke(null, thM112710exceptionOrNullimpl.getMessage());
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: u */
    public final Object m76624u(final String str, Function2 function2, Function1 function1, Continuation continuation) throws Throwable {
        RewardsCenterApiHelper$startClaim$1 rewardsCenterApiHelper$startClaim$1;
        Object objM112707constructorimpl;
        if (continuation instanceof RewardsCenterApiHelper$startClaim$1) {
            rewardsCenterApiHelper$startClaim$1 = (RewardsCenterApiHelper$startClaim$1) continuation;
            int i11 = rewardsCenterApiHelper$startClaim$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rewardsCenterApiHelper$startClaim$1.label = i11 - Integer.MIN_VALUE;
            } else {
                rewardsCenterApiHelper$startClaim$1 = new RewardsCenterApiHelper$startClaim$1(this, continuation);
            }
        } else {
            rewardsCenterApiHelper$startClaim$1 = new RewardsCenterApiHelper$startClaim$1(this, continuation);
        }
        RewardsCenterApiHelper$startClaim$1 rewardsCenterApiHelper$startClaim$2 = rewardsCenterApiHelper$startClaim$1;
        Object objM111530f = rewardsCenterApiHelper$startClaim$2.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = rewardsCenterApiHelper$startClaim$2.label;
        try {
            if (i12 == 0) {
                ResultKt.m97107b(objM111530f);
                RequestBody requestBodyM76610i = m76610i(new Function1() { // from class: com.transsion.rewardscenter.utils.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RewardsCenterApiHelper.m76617v(str, (JSONObject) obj);
                    }
                });
                Result.Companion companion = Result.INSTANCE;
                InterfaceC28992a interfaceC28992aM76614p = m76614p();
                rewardsCenterApiHelper$startClaim$2.L$0 = function2;
                rewardsCenterApiHelper$startClaim$2.L$1 = function1;
                rewardsCenterApiHelper$startClaim$2.label = 1;
                objM111530f = InterfaceC28992a.a.m111530f(interfaceC28992aM76614p, null, requestBodyM76610i, rewardsCenterApiHelper$startClaim$2, 1, null);
                if (objM111530f == objF) {
                    return objF;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) rewardsCenterApiHelper$startClaim$2.L$1;
                function2 = (Function2) rewardsCenterApiHelper$startClaim$2.L$0;
                ResultKt.m97107b(objM111530f);
            }
            objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) objM111530f);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
            BaseDto baseDto = (BaseDto) objM112707constructorimpl;
            if (AbstractC18019n.m76640a(baseDto)) {
                function1.invoke(baseDto.getData());
            } else {
                function2.invoke(baseDto.getCode(), baseDto.getMsg());
            }
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            function2.invoke(null, thM112710exceptionOrNullimpl.getMessage());
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: w */
    public final Object m76625w(final ClaimReceiverRequest claimReceiverRequest, Function2 function2, Function1 function1, Continuation continuation) throws Throwable {
        RewardsCenterApiHelper$submitClaimReceiverInfo$1 rewardsCenterApiHelper$submitClaimReceiverInfo$1;
        Object objM112707constructorimpl;
        if (continuation instanceof RewardsCenterApiHelper$submitClaimReceiverInfo$1) {
            rewardsCenterApiHelper$submitClaimReceiverInfo$1 = (RewardsCenterApiHelper$submitClaimReceiverInfo$1) continuation;
            int i11 = rewardsCenterApiHelper$submitClaimReceiverInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rewardsCenterApiHelper$submitClaimReceiverInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                rewardsCenterApiHelper$submitClaimReceiverInfo$1 = new RewardsCenterApiHelper$submitClaimReceiverInfo$1(this, continuation);
            }
        } else {
            rewardsCenterApiHelper$submitClaimReceiverInfo$1 = new RewardsCenterApiHelper$submitClaimReceiverInfo$1(this, continuation);
        }
        RewardsCenterApiHelper$submitClaimReceiverInfo$1 rewardsCenterApiHelper$submitClaimReceiverInfo$2 = rewardsCenterApiHelper$submitClaimReceiverInfo$1;
        Object objM111533i = rewardsCenterApiHelper$submitClaimReceiverInfo$2.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = rewardsCenterApiHelper$submitClaimReceiverInfo$2.label;
        try {
            if (i12 == 0) {
                ResultKt.m97107b(objM111533i);
                RequestBody requestBodyM76610i = m76610i(new Function1() { // from class: com.transsion.rewardscenter.utils.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RewardsCenterApiHelper.m76618x(claimReceiverRequest, (JSONObject) obj);
                    }
                });
                Result.Companion companion = Result.INSTANCE;
                InterfaceC28992a interfaceC28992aM76614p = m76614p();
                rewardsCenterApiHelper$submitClaimReceiverInfo$2.L$0 = function2;
                rewardsCenterApiHelper$submitClaimReceiverInfo$2.L$1 = function1;
                rewardsCenterApiHelper$submitClaimReceiverInfo$2.label = 1;
                objM111533i = InterfaceC28992a.a.m111533i(interfaceC28992aM76614p, null, requestBodyM76610i, rewardsCenterApiHelper$submitClaimReceiverInfo$2, 1, null);
                if (objM111533i == objF) {
                    return objF;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) rewardsCenterApiHelper$submitClaimReceiverInfo$2.L$1;
                function2 = (Function2) rewardsCenterApiHelper$submitClaimReceiverInfo$2.L$0;
                ResultKt.m97107b(objM111533i);
            }
            objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) objM111533i);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
            BaseDto baseDto = (BaseDto) objM112707constructorimpl;
            if (AbstractC18019n.m76640a(baseDto)) {
                function1.invoke(baseDto.getData());
            } else if (function2 != null) {
                function2.invoke(baseDto.getCode(), baseDto.getMsg());
            }
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null && function2 != null) {
            function2.invoke(null, thM112710exceptionOrNullimpl.getMessage());
        }
        return Unit.f75682a;
    }
}
