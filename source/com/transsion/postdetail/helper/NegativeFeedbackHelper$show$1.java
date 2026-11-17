package com.transsion.postdetail.helper;

import android.content.Context;
import com.google.gson.Gson;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.p278ts.TsExtractor;
import com.p282tn.lib.net.bean.BaseDto;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.util.AbstractC14567m;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.bean.NegativeFeedbackAction;
import com.transsion.postdetail.bean.NegativeFeedbackConfigBean;
import com.transsion.postdetail.p306ui.dialog.DialogC16999h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import p985zo.InterfaceC29209b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.helper.NegativeFeedbackHelper$show$1", m97637f = "NegativeFeedbackHelper.kt", m97638l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m97639m = "invokeSuspend")
final class NegativeFeedbackHelper$show$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $authorId;
    final /* synthetic */ Context $context;
    final /* synthetic */ InterfaceC25149n0 $lifecycleScope;
    final /* synthetic */ Function0<Unit> $onSuccess;
    final /* synthetic */ String $pageName;
    final /* synthetic */ String $postId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NegativeFeedbackHelper$show$1(Context context, String str, String str2, String str3, InterfaceC25149n0 interfaceC25149n0, Function0<Unit> function0, Continuation<? super NegativeFeedbackHelper$show$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$pageName = str;
        this.$postId = str2;
        this.$authorId = str3;
        this.$lifecycleScope = interfaceC25149n0;
        this.$onSuccess = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x004e  */
    /* JADX INFO: renamed from: d */
    public static final Unit m73024d(BaseDto baseDto, String str, String str2, String str3, InterfaceC25149n0 interfaceC25149n0, Function0 function0, NegativeFeedbackAction negativeFeedbackAction) {
        if (Intrinsics.m97797c(negativeFeedbackAction.getActionType(), "NEGATIVE_ACTION_TYPE_REPORT")) {
            NegativeFeedbackConfigBean negativeFeedbackConfigBean = (NegativeFeedbackConfigBean) baseDto.getData();
            if ((negativeFeedbackConfigBean != null ? negativeFeedbackConfigBean.getReportConfig() : null) != null) {
                Navigator.m61845x(TheRouter.m61773c("/postdetail/feedback_input").m61857K("extra_report_config_json", str).m61857K("extra_post_id", str2).m61857K("extra_author_id", str3).m61857K("extra_action_type", negativeFeedbackAction.getActionType()).m61857K("extra_submit_toast_text", negativeFeedbackAction.getSubmitToastText()), null, null, 3, null);
            } else {
                NegativeFeedbackHelper.f56361a.m73017l(str2, str3, negativeFeedbackAction.getActionType(), negativeFeedbackAction.getSubmitToastText(), interfaceC25149n0, function0);
            }
        } else {
            NegativeFeedbackHelper.f56361a.m73017l(str2, str3, negativeFeedbackAction.getActionType(), negativeFeedbackAction.getSubmitToastText(), interfaceC25149n0, function0);
        }
        return Unit.f75682a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NegativeFeedbackHelper$show$1 negativeFeedbackHelper$show$1 = new NegativeFeedbackHelper$show$1(this.$context, this.$pageName, this.$postId, this.$authorId, this.$lifecycleScope, this.$onSuccess, continuation);
        negativeFeedbackHelper$show$1.L$0 = obj;
        return negativeFeedbackHelper$show$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((NegativeFeedbackHelper$show$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                Result.Companion companion = Result.INSTANCE;
                InterfaceC29209b interfaceC29209bM73015g = NegativeFeedbackHelper.f56361a.m73015g();
                this.label = 1;
                obj = InterfaceC29209b.a.m112062a(interfaceC29209bM73015g, null, this, 1, null);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) obj);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.f81698a.m104915i(NegativeFeedbackHelper.f56362b, "getNegativeFeedbackConfig error: " + thM112710exceptionOrNullimpl.getMessage(), true);
            AbstractC14567m.m65698e(R$string.post_feedback_fail);
            return Unit.f75682a;
        }
        final BaseDto baseDto = (BaseDto) objM112707constructorimpl;
        NegativeFeedbackConfigBean negativeFeedbackConfigBean = (NegativeFeedbackConfigBean) baseDto.getData();
        List<NegativeFeedbackAction> actions = negativeFeedbackConfigBean != null ? negativeFeedbackConfigBean.getActions() : null;
        if (actions == null) {
            actions = CollectionsKt.m97506l();
        }
        if (actions.isEmpty()) {
            return Unit.f75682a;
        }
        Gson gson = new Gson();
        NegativeFeedbackConfigBean negativeFeedbackConfigBean2 = (NegativeFeedbackConfigBean) baseDto.getData();
        final String json = gson.toJson(negativeFeedbackConfigBean2 != null ? negativeFeedbackConfigBean2.getReportConfig() : null);
        DialogC16999h dialogC16999h = new DialogC16999h(this.$context, actions, this.$pageName);
        final String str = this.$postId;
        final String str2 = this.$authorId;
        final InterfaceC25149n0 interfaceC25149n0 = this.$lifecycleScope;
        final Function0<Unit> function0 = this.$onSuccess;
        dialogC16999h.m73968j(new Function1() { // from class: com.transsion.postdetail.helper.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return NegativeFeedbackHelper$show$1.m73024d(baseDto, json, str, str2, interfaceC25149n0, function0, (NegativeFeedbackAction) obj2);
            }
        });
        dialogC16999h.show();
        return Unit.f75682a;
    }
}
