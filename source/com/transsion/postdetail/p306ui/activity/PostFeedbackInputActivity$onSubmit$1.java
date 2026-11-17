package com.transsion.postdetail.p306ui.activity;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.baseui.util.AbstractC14567m;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.bean.NegativeFeedbackRequest;
import com.transsion.postdetail.bean.ReportReason;
import com.transsion.postdetail.helper.NegativeFeedbackHelper;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlinx.coroutines.InterfaceC25149n0;
import p888wy.C28465b;
import p985zo.InterfaceC29209b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.ui.activity.PostFeedbackInputActivity$onSubmit$1", m97637f = "PostFeedbackInputActivity.kt", m97638l = {174, 195}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class PostFeedbackInputActivity$onSubmit$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReportReason $selectedReason;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PostFeedbackInputActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostFeedbackInputActivity$onSubmit$1(PostFeedbackInputActivity postFeedbackInputActivity, ReportReason reportReason, Continuation<? super PostFeedbackInputActivity$onSubmit$1> continuation) {
        super(2, continuation);
        this.this$0 = postFeedbackInputActivity;
        this.$selectedReason = reportReason;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PostFeedbackInputActivity$onSubmit$1 postFeedbackInputActivity$onSubmit$1 = new PostFeedbackInputActivity$onSubmit$1(this.this$0, this.$selectedReason, continuation);
        postFeedbackInputActivity$onSubmit$1.L$0 = obj;
        return postFeedbackInputActivity$onSubmit$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((PostFeedbackInputActivity$onSubmit$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb A[Catch: all -> 0x001c, TryCatch #1 {all -> 0x001c, blocks: (B:6:0x0015, B:62:0x0146, B:39:0x00b4, B:41:0x00ca, B:45:0x00d3, B:47:0x00eb, B:49:0x00f4, B:51:0x0102, B:59:0x012a, B:55:0x0115), top: B:79:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:55:0x0115 A[Catch: all -> 0x001c, TryCatch #1 {all -> 0x001c, blocks: (B:6:0x0015, B:62:0x0146, B:39:0x00b4, B:41:0x00ca, B:45:0x00d3, B:47:0x00eb, B:49:0x00f4, B:51:0x0102, B:59:0x012a, B:55:0x0115), top: B:79:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0127  */
    /* JADX WARN: Code duplicated, block: B:58:0x0128  */
    /* JADX WARN: Code duplicated, block: B:61:0x0145 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x015f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0188  */
    /* JADX WARN: Code duplicated, block: B:72:0x0195  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ae  */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x015f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x01ae, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        Object objM112707constructorimpl2;
        String str;
        PostFeedbackInputActivity postFeedbackInputActivity;
        String stringExtra;
        String str2;
        List listE;
        String whole;
        String phone;
        String str3;
        Object objM112063b;
        PostFeedbackInputActivity postFeedbackInputActivity2;
        PostFeedbackInputActivity postFeedbackInputActivity3;
        Throwable thM112710exceptionOrNullimpl;
        String stringExtra2;
        String stringExtra3;
        Object objM73858E0;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.m97107b(obj);
                        objM73858E0 = obj;
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m97107b(obj);
                        objM112063b = obj;
                    }
                    objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) objM112063b);
                    postFeedbackInputActivity2 = this.this$0;
                    if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
                        C26866a.f81698a.m104912c("PostFeedbackInputActivity", "postNegativeFeedback success: code=" + ((BaseDto) objM112707constructorimpl).getCode(), true);
                        stringExtra2 = postFeedbackInputActivity2.getIntent().getStringExtra("extra_submit_toast_text");
                        if (stringExtra2 != null) {
                            AbstractC14567m.m65697d(stringExtra2);
                        }
                        stringExtra3 = postFeedbackInputActivity2.getIntent().getStringExtra("extra_post_id");
                        if (stringExtra3 != null) {
                            C28465b.f87467a.m109954a().m109949e(stringExtra3);
                        }
                        NegativeFeedbackHelper.f56361a.m73021j(stringExtra3);
                        postFeedbackInputActivity2.finish();
                    }
                    postFeedbackInputActivity3 = this.this$0;
                    thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                    if (thM112710exceptionOrNullimpl != null) {
                        C26866a.f81698a.m104915i("PostFeedbackInputActivity", "postNegativeFeedback error: " + thM112710exceptionOrNullimpl.getMessage(), true);
                        AbstractC14567m.m65698e(R$string.post_feedback_fail);
                        postFeedbackInputActivity3.m73875r0().f86400b.setEnabled(true);
                        postFeedbackInputActivity3.finish();
                    }
                    return Unit.f75682a;
                }
                ResultKt.m97107b(obj);
                InterfaceC25149n0 interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
                if (this.this$0.m73876s0().getImagePath() != null) {
                    PostFeedbackInputActivity postFeedbackInputActivity4 = this.this$0;
                    Result.Companion companion = Result.INSTANCE;
                    String imagePath = postFeedbackInputActivity4.m73876s0().getImagePath();
                    Intrinsics.m97799e(imagePath);
                    this.L$0 = interfaceC25149n0;
                    this.label = 1;
                    objM73858E0 = postFeedbackInputActivity4.m73858E0(imagePath, this);
                    if (objM73858E0 == objF) {
                        return objF;
                    }
                } else {
                    str = null;
                }
                postFeedbackInputActivity = this.this$0;
                ReportReason reportReason = this.$selectedReason;
                Result.Companion companion2 = Result.INSTANCE;
                String stringExtra4 = postFeedbackInputActivity.getIntent().getStringExtra("extra_post_id");
                stringExtra = postFeedbackInputActivity.getIntent().getStringExtra("extra_author_id");
                if (stringExtra != null || stringExtra.length() <= 0) {
                    str2 = null;
                } else {
                    str2 = stringExtra;
                }
                String stringExtra5 = postFeedbackInputActivity.getIntent().getStringExtra("extra_action_type");
                String reportReasonId = reportReason.getReportReasonId();
                String content = postFeedbackInputActivity.m73876s0().getContent();
                if (str != null) {
                    listE = CollectionsKt.m97499e(str);
                } else {
                    listE = null;
                }
                whole = postFeedbackInputActivity.m73876s0().getContact().getWhole();
                if (whole != null || (phone = new Regex("^[A-Z]+ ").replace(whole, "")) == null) {
                    phone = postFeedbackInputActivity.m73876s0().getContact().getPhone();
                    if (phone.length() > 0) {
                        str3 = phone;
                    } else {
                        str3 = null;
                    }
                } else {
                    str3 = phone;
                }
                NegativeFeedbackRequest negativeFeedbackRequest = new NegativeFeedbackRequest(stringExtra4, str2, stringExtra5, reportReasonId, content, listE, str3);
                InterfaceC29209b interfaceC29209bM73879v0 = postFeedbackInputActivity.m73879v0();
                this.L$0 = null;
                this.label = 2;
                objM112063b = InterfaceC29209b.a.m112063b(interfaceC29209bM73879v0, null, negativeFeedbackRequest, this, 1, null);
                if (objM112063b == objF) {
                    return objF;
                }
                objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) objM112063b);
                postFeedbackInputActivity2 = this.this$0;
                if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
                    C26866a.f81698a.m104912c("PostFeedbackInputActivity", "postNegativeFeedback success: code=" + ((BaseDto) objM112707constructorimpl).getCode(), true);
                    stringExtra2 = postFeedbackInputActivity2.getIntent().getStringExtra("extra_submit_toast_text");
                    if (stringExtra2 != null) {
                        AbstractC14567m.m65697d(stringExtra2);
                    }
                    stringExtra3 = postFeedbackInputActivity2.getIntent().getStringExtra("extra_post_id");
                    if (stringExtra3 != null) {
                        C28465b.f87467a.m109954a().m109949e(stringExtra3);
                    }
                    NegativeFeedbackHelper.f56361a.m73021j(stringExtra3);
                    postFeedbackInputActivity2.finish();
                }
                postFeedbackInputActivity3 = this.this$0;
                thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                if (thM112710exceptionOrNullimpl != null) {
                    C26866a.f81698a.m104915i("PostFeedbackInputActivity", "postNegativeFeedback error: " + thM112710exceptionOrNullimpl.getMessage(), true);
                    AbstractC14567m.m65698e(R$string.post_feedback_fail);
                    postFeedbackInputActivity3.m73875r0().f86400b.setEnabled(true);
                    postFeedbackInputActivity3.finish();
                }
                return Unit.f75682a;
                objM112707constructorimpl2 = Result.m112707constructorimpl((String) objM73858E0);
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                objM112707constructorimpl2 = Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            if (Result.m112713isFailureimpl(objM112707constructorimpl2)) {
                C26866a.a aVar = C26866a.f81698a;
                Throwable thM112710exceptionOrNullimpl2 = Result.m112710exceptionOrNullimpl(objM112707constructorimpl2);
                aVar.m104915i("PostFeedbackInputActivity", "upload image failed: " + (thM112710exceptionOrNullimpl2 != null ? thM112710exceptionOrNullimpl2.getMessage() : null), true);
                this.this$0.m73875r0().f86400b.setEnabled(true);
                return Unit.f75682a;
            }
            if (Result.m112713isFailureimpl(objM112707constructorimpl2)) {
                objM112707constructorimpl2 = null;
            }
            str = (String) objM112707constructorimpl2;
            postFeedbackInputActivity = this.this$0;
            ReportReason reportReason2 = this.$selectedReason;
            Result.Companion companion4 = Result.INSTANCE;
            String stringExtra6 = postFeedbackInputActivity.getIntent().getStringExtra("extra_post_id");
            stringExtra = postFeedbackInputActivity.getIntent().getStringExtra("extra_author_id");
            if (stringExtra != null) {
                str2 = null;
            } else {
                str2 = null;
            }
            String stringExtra7 = postFeedbackInputActivity.getIntent().getStringExtra("extra_action_type");
            String reportReasonId2 = reportReason2.getReportReasonId();
            String content2 = postFeedbackInputActivity.m73876s0().getContent();
            if (str != null) {
                listE = CollectionsKt.m97499e(str);
            } else {
                listE = null;
            }
            whole = postFeedbackInputActivity.m73876s0().getContact().getWhole();
            if (whole != null) {
                phone = postFeedbackInputActivity.m73876s0().getContact().getPhone();
                if (phone.length() > 0) {
                    str3 = phone;
                } else {
                    str3 = null;
                }
            } else {
                phone = postFeedbackInputActivity.m73876s0().getContact().getPhone();
                if (phone.length() > 0) {
                    str3 = phone;
                } else {
                    str3 = null;
                }
            }
            NegativeFeedbackRequest negativeFeedbackRequest2 = new NegativeFeedbackRequest(stringExtra6, str2, stringExtra7, reportReasonId2, content2, listE, str3);
            InterfaceC29209b interfaceC29209bM73879v1 = postFeedbackInputActivity.m73879v0();
            this.L$0 = null;
            this.label = 2;
            objM112063b = InterfaceC29209b.a.m112063b(interfaceC29209bM73879v1, null, negativeFeedbackRequest2, this, 1, null);
            if (objM112063b == objF) {
                return objF;
            }
            objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) objM112063b);
            postFeedbackInputActivity2 = this.this$0;
            if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
                C26866a.f81698a.m104912c("PostFeedbackInputActivity", "postNegativeFeedback success: code=" + ((BaseDto) objM112707constructorimpl).getCode(), true);
                stringExtra2 = postFeedbackInputActivity2.getIntent().getStringExtra("extra_submit_toast_text");
                if (stringExtra2 != null) {
                    AbstractC14567m.m65697d(stringExtra2);
                }
                stringExtra3 = postFeedbackInputActivity2.getIntent().getStringExtra("extra_post_id");
                if (stringExtra3 != null) {
                    C28465b.f87467a.m109954a().m109949e(stringExtra3);
                }
                NegativeFeedbackHelper.f56361a.m73021j(stringExtra3);
                postFeedbackInputActivity2.finish();
            }
            postFeedbackInputActivity3 = this.this$0;
            thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
            if (thM112710exceptionOrNullimpl != null) {
                C26866a.f81698a.m104915i("PostFeedbackInputActivity", "postNegativeFeedback error: " + thM112710exceptionOrNullimpl.getMessage(), true);
                AbstractC14567m.m65698e(R$string.post_feedback_fail);
                postFeedbackInputActivity3.m73875r0().f86400b.setEnabled(true);
                postFeedbackInputActivity3.finish();
            }
            return Unit.f75682a;
        } catch (Throwable th3) {
            Result.Companion companion5 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th3));
        }
    }
}
