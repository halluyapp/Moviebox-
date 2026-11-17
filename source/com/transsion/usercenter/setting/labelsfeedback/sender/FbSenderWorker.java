package com.transsion.usercenter.setting.labelsfeedback.sender;

import android.content.Context;
import androidx.work.AbstractC4569i;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import ax.InterfaceC4715a;
import com.blankj.utilcode.util.AbstractC5796o;
import com.cloud.config.utils.CommonUtils;
import com.google.android.material.timepicker.TimeModel;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.net.bean.BaseDto;
import com.therouter.TheRouter;
import com.transsion.upload.bean.UploadFileType;
import com.transsion.upload.bean.UploadTstTokenStorageType;
import com.transsion.upload.log.UploadLoggerManager;
import com.transsion.usercenter.setting.feedback.bean.FeedbackEntity;
import com.transsion.usercenter.setting.labelsfeedback.model.FbDataModel;
import com.transsion.usercenter.setting.labelsfeedback.model.FbTvData;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import okhttp3.RequestBody;
import p349dh.C22982c;
import p411fh.C23367b;
import p441gz.InterfaceC23704a;
import p497iw.C24233c;
import p497iw.InterfaceC24231a;
import p978zg.C29182a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u000e¨\u0006\u001a"}, m97100d2 = {"Lcom/transsion/usercenter/setting/labelsfeedback/sender/FbSenderWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "imagePath", "Lkotlin/Pair;", "x", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "y", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "imageUrl", "logId", "Lcom/transsion/usercenter/setting/labelsfeedback/model/FbDataModel;", "model", "tempBucket", "Lcom/tn/lib/net/bean/BaseDto;", "Lcom/transsion/usercenter/setting/feedback/bean/FeedbackEntity;", "w", "(Ljava/lang/String;Ljava/lang/String;Lcom/transsion/usercenter/setting/labelsfeedback/model/FbDataModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/work/i$a;", CampaignEx.JSON_KEY_AD_R, "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class FbSenderWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: com.transsion.usercenter.setting.labelsfeedback.sender.FbSenderWorker$a */
    public static final class C20848a implements InterfaceC24231a {

        /* JADX INFO: renamed from: a */
        private boolean f65538a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Continuation f65539b;

        C20848a(Continuation continuation) {
            this.f65539b = continuation;
        }

        @Override // p497iw.InterfaceC24231a
        /* JADX INFO: renamed from: a */
        public void mo73889a(String localFilePath, long j11, long j12) {
            Intrinsics.m97802h(localFilePath, "localFilePath");
        }

        @Override // p497iw.InterfaceC24231a
        /* JADX INFO: renamed from: b */
        public void mo73890b(String localFilePath, String url, String bucket) {
            Intrinsics.m97802h(localFilePath, "localFilePath");
            Intrinsics.m97802h(url, "url");
            Intrinsics.m97802h(bucket, "bucket");
            if (this.f65538a) {
                return;
            }
            Continuation continuation = this.f65539b;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m112707constructorimpl(new Pair(url, bucket)));
            this.f65538a = true;
        }

        @Override // p497iw.InterfaceC24231a
        /* JADX INFO: renamed from: c */
        public void mo73891c(String str, String str2, String str3, UploadTstTokenStorageType uploadTstTokenStorageType) {
            if (this.f65538a) {
                return;
            }
            Continuation continuation = this.f65539b;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m112707constructorimpl(ResultKt.m97106a(new Error("unable to upload log"))));
            this.f65538a = true;
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.setting.labelsfeedback.sender.FbSenderWorker$b */
    public static final class C20849b implements InterfaceC24231a {

        /* JADX INFO: renamed from: a */
        private boolean f65540a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Continuation f65541b;

        C20849b(Continuation continuation) {
            this.f65541b = continuation;
        }

        @Override // p497iw.InterfaceC24231a
        /* JADX INFO: renamed from: a */
        public void mo73889a(String uploadKey, long j11, long j12) {
            Intrinsics.m97802h(uploadKey, "uploadKey");
        }

        @Override // p497iw.InterfaceC24231a
        /* JADX INFO: renamed from: b */
        public void mo73890b(String uploadKey, String url, String bucket) {
            Intrinsics.m97802h(uploadKey, "uploadKey");
            Intrinsics.m97802h(url, "url");
            Intrinsics.m97802h(bucket, "bucket");
            if (this.f65540a) {
                return;
            }
            this.f65541b.resumeWith(Result.m112707constructorimpl(uploadKey));
            this.f65540a = true;
        }

        @Override // p497iw.InterfaceC24231a
        /* JADX INFO: renamed from: c */
        public void mo73891c(String str, String str2, String str3, UploadTstTokenStorageType uploadTstTokenStorageType) {
            if (this.f65540a) {
                return;
            }
            Continuation continuation = this.f65541b;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m112707constructorimpl(ResultKt.m97106a(new Error("unable to upload log"))));
            this.f65540a = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FbSenderWorker(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        Intrinsics.m97802h(appContext, "appContext");
        Intrinsics.m97802h(workerParams, "workerParams");
    }

    /* JADX INFO: renamed from: w */
    private final Object m85826w(String str, String str2, FbDataModel fbDataModel, String str3, Continuation continuation) {
        UserInfo userInfoMo90386h;
        InterfaceC23704a interfaceC23704a = (InterfaceC23704a) TheRouter.m61774d(InterfaceC23704a.class, new Object[0]);
        String userId = (interfaceC23704a == null || (userInfoMo90386h = interfaceC23704a.mo90386h()) == null) ? null : userInfoMo90386h.getUserId();
        JsonObject jsonObject = new JsonObject();
        if (userId == null) {
            userId = "0";
        }
        jsonObject.addProperty(CommonUtils.PARAM_UID, userId);
        jsonObject.addProperty("content", fbDataModel.getContent());
        if (str != null) {
            JsonArray jsonArray = new JsonArray();
            jsonArray.add(str);
            jsonObject.add("imageUrl", jsonArray);
        }
        jsonObject.addProperty("email", "");
        String whole = fbDataModel.getContact().getWhole();
        if (whole != null) {
            jsonObject.addProperty("whatsApp", whole);
        }
        jsonObject.addProperty("pageName", fbDataModel.getPageName());
        String ugcVideoId = fbDataModel.getUgcVideoId();
        if (ugcVideoId != null) {
            jsonObject.addProperty("ugcVideoId", ugcVideoId);
        }
        String subjectId = fbDataModel.getSubjectId();
        if (subjectId != null) {
            jsonObject.addProperty("subjectId", subjectId);
        }
        FbTvData tv2 = fbDataModel.getTv();
        if (tv2 != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
            String str4 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Boxing.m97634d(tv2.getSeason())}, 1));
            Intrinsics.m97801g(str4, "format(...)");
            String str5 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Boxing.m97634d(tv2.getEpisode())}, 1));
            Intrinsics.m97801g(str5, "format(...)");
            jsonObject.addProperty("season", "S" + str4 + "  E" + str5);
        }
        jsonObject.addProperty("logId", str2);
        Integer selectedId = fbDataModel.getSelectedId();
        jsonObject.addProperty("label", Boxing.m97634d(selectedId != null ? selectedId.intValue() : -1));
        jsonObject.addProperty("tempBucket", str3);
        C23367b.a aVar = C23367b.f71265a;
        String string = jsonObject.toString();
        Intrinsics.m97801g(string, "toString(...)");
        RequestBody requestBodyM92796a = aVar.m92796a(string);
        if (requestBodyM92796a != null) {
            return ((InterfaceC4715a) C22982c.f70163e.m91553a().m91552h(InterfaceC4715a.class)).m22788c(C29182a.f89053a.m111992a(), requestBodyM92796a, continuation);
        }
        throw new Error("can not find feedback body");
    }

    /* JADX INFO: renamed from: x */
    private final Object m85827x(String str, Continuation continuation) throws Throwable {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.m97627c(continuation));
        C24233c.f73744a.m95262f(str, UploadFileType.OBJECT_NAME_IMAGE, true, new C20848a(safeContinuation));
        Object objM97624a = safeContinuation.m97624a();
        if (objM97624a == IntrinsicsKt.m97630f()) {
            DebugProbesKt.m97647c(continuation);
        }
        return objM97624a;
    }

    /* JADX INFO: renamed from: y */
    private final Object m85828y(Continuation continuation) throws Throwable {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.m97627c(continuation));
        UploadLoggerManager.f64731a.m84549k(new C20849b(safeContinuation));
        Object objM97624a = safeContinuation.m97624a();
        if (objM97624a == IntrinsicsKt.m97630f()) {
            DebugProbesKt.m97647c(continuation);
        }
        return objM97624a;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0106 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0107  */
    /* JADX WARN: Code duplicated, block: B:52:0x0127 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0132 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:15:0x0033, B:53:0x0128, B:55:0x0132, B:57:0x0138, B:22:0x004f, B:50:0x010a, B:25:0x0064, B:44:0x00e8, B:46:0x00f6, B:28:0x007d, B:40:0x00c9, B:34:0x00a3, B:36:0x00b3), top: B:62:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v12, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v18, types: [T, java.lang.Object] */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: r */
    public Object mo22326r(Continuation continuation) throws Throwable {
        FbSenderWorker$doWork$1 fbSenderWorker$doWork$1;
        FbDataModel fbDataModel;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        String imagePath;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        FbDataModel fbDataModel2;
        Ref.ObjectRef objectRef5;
        Ref.ObjectRef objectRef6;
        Ref.ObjectRef objectRef7;
        FbDataModel fbDataModel3;
        Object objM85828y;
        FbDataModel fbDataModel4;
        Ref.ObjectRef objectRef8;
        FeedbackEntity feedbackEntity;
        if (continuation instanceof FbSenderWorker$doWork$1) {
            fbSenderWorker$doWork$1 = (FbSenderWorker$doWork$1) continuation;
            int i11 = fbSenderWorker$doWork$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fbSenderWorker$doWork$1.label = i11 - Integer.MIN_VALUE;
            } else {
                fbSenderWorker$doWork$1 = new FbSenderWorker$doWork$1(this, continuation);
            }
        } else {
            fbSenderWorker$doWork$1 = new FbSenderWorker$doWork$1(this, continuation);
        }
        FbSenderWorker$doWork$1 fbSenderWorker$doWork$2 = fbSenderWorker$doWork$1;
        Object objM85827x = fbSenderWorker$doWork$2.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = fbSenderWorker$doWork$2.label;
        try {
            if (i12 == 0) {
                ResultKt.m97107b(objM85827x);
                fbDataModel = (FbDataModel) AbstractC5796o.m27441d(m22409g().m22391l("key_work_data"), FbDataModel.class);
                if (fbDataModel == null) {
                    AbstractC4569i.a aVarM22416a = AbstractC4569i.a.m22416a();
                    Intrinsics.m97801g(aVarM22416a, "failure(...)");
                    return aVarM22416a;
                }
                objectRef = new Ref.ObjectRef();
                objectRef2 = new Ref.ObjectRef();
                imagePath = fbDataModel.getImagePath();
                if (imagePath != null) {
                    fbSenderWorker$doWork$2.L$0 = fbDataModel;
                    fbSenderWorker$doWork$2.L$1 = objectRef;
                    fbSenderWorker$doWork$2.L$2 = objectRef2;
                    fbSenderWorker$doWork$2.L$3 = imagePath;
                    fbSenderWorker$doWork$2.L$4 = objectRef;
                    fbSenderWorker$doWork$2.label = 1;
                    Object objM85827x2 = m85827x(imagePath, fbSenderWorker$doWork$2);
                    if (objM85827x2 == objF) {
                        return objF;
                    }
                    fbDataModel2 = fbDataModel;
                    objM85827x = objM85827x2;
                    objectRef5 = objectRef;
                } else {
                    objectRef3 = objectRef;
                    objectRef4 = objectRef2;
                }
                fbSenderWorker$doWork$2.L$0 = fbDataModel;
                fbSenderWorker$doWork$2.L$1 = objectRef3;
                fbSenderWorker$doWork$2.L$2 = objectRef4;
                fbSenderWorker$doWork$2.L$3 = null;
                fbSenderWorker$doWork$2.label = 3;
                objM85828y = m85828y(fbSenderWorker$doWork$2);
                if (objM85828y == objF) {
                    return objF;
                }
                fbDataModel4 = fbDataModel;
                objM85827x = objM85828y;
                objectRef8 = objectRef3;
                String str = (String) objectRef8.element;
                String str2 = (String) objectRef4.element;
                fbSenderWorker$doWork$2.L$0 = null;
                fbSenderWorker$doWork$2.L$1 = null;
                fbSenderWorker$doWork$2.L$2 = null;
                fbSenderWorker$doWork$2.label = 4;
                objM85827x = m85826w(str, (String) objM85827x, fbDataModel4, str2, fbSenderWorker$doWork$2);
                if (objM85827x == objF) {
                    return objF;
                }
                feedbackEntity = (FeedbackEntity) ((BaseDto) objM85827x).getData();
                if (feedbackEntity != null) {
                    AbstractC4569i.a aVarM22418c = AbstractC4569i.a.m22418c();
                    Intrinsics.m97801g(aVarM22418c, "success(...)");
                    return aVarM22418c;
                }
                AbstractC4569i.a aVarM22416a2 = AbstractC4569i.a.m22416a();
                Intrinsics.m97801g(aVarM22416a2, "failure(...)");
                return aVarM22416a2;
            }
            if (i12 == 1) {
                objectRef = (Ref.ObjectRef) fbSenderWorker$doWork$2.L$4;
                String str3 = (String) fbSenderWorker$doWork$2.L$3;
                Ref.ObjectRef objectRef9 = (Ref.ObjectRef) fbSenderWorker$doWork$2.L$2;
                objectRef5 = (Ref.ObjectRef) fbSenderWorker$doWork$2.L$1;
                fbDataModel2 = (FbDataModel) fbSenderWorker$doWork$2.L$0;
                ResultKt.m97107b(objM85827x);
                imagePath = str3;
                objectRef2 = objectRef9;
            } else if (i12 == 2) {
                objectRef6 = (Ref.ObjectRef) fbSenderWorker$doWork$2.L$3;
                objectRef7 = (Ref.ObjectRef) fbSenderWorker$doWork$2.L$2;
                objectRef3 = (Ref.ObjectRef) fbSenderWorker$doWork$2.L$1;
                fbDataModel3 = (FbDataModel) fbSenderWorker$doWork$2.L$0;
                ResultKt.m97107b(objM85827x);
                objectRef6.element = ((Pair) objM85827x).getSecond();
                objectRef4 = objectRef7;
                fbDataModel = fbDataModel3;
                fbSenderWorker$doWork$2.L$0 = fbDataModel;
                fbSenderWorker$doWork$2.L$1 = objectRef3;
                fbSenderWorker$doWork$2.L$2 = objectRef4;
                fbSenderWorker$doWork$2.L$3 = null;
                fbSenderWorker$doWork$2.label = 3;
                objM85828y = m85828y(fbSenderWorker$doWork$2);
                if (objM85828y == objF) {
                    return objF;
                }
                fbDataModel4 = fbDataModel;
                objM85827x = objM85828y;
                objectRef8 = objectRef3;
                String str4 = (String) objectRef8.element;
                String str5 = (String) objectRef4.element;
                fbSenderWorker$doWork$2.L$0 = null;
                fbSenderWorker$doWork$2.L$1 = null;
                fbSenderWorker$doWork$2.L$2 = null;
                fbSenderWorker$doWork$2.label = 4;
                objM85827x = m85826w(str4, (String) objM85827x, fbDataModel4, str5, fbSenderWorker$doWork$2);
                if (objM85827x == objF) {
                    return objF;
                }
            } else if (i12 == 3) {
                objectRef4 = (Ref.ObjectRef) fbSenderWorker$doWork$2.L$2;
                objectRef8 = (Ref.ObjectRef) fbSenderWorker$doWork$2.L$1;
                fbDataModel4 = (FbDataModel) fbSenderWorker$doWork$2.L$0;
                ResultKt.m97107b(objM85827x);
                String str6 = (String) objectRef8.element;
                String str7 = (String) objectRef4.element;
                fbSenderWorker$doWork$2.L$0 = null;
                fbSenderWorker$doWork$2.L$1 = null;
                fbSenderWorker$doWork$2.L$2 = null;
                fbSenderWorker$doWork$2.label = 4;
                objM85827x = m85826w(str6, (String) objM85827x, fbDataModel4, str7, fbSenderWorker$doWork$2);
                if (objM85827x == objF) {
                    return objF;
                }
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(objM85827x);
            }
            feedbackEntity = (FeedbackEntity) ((BaseDto) objM85827x).getData();
            if (feedbackEntity != null && feedbackEntity.getResult()) {
                AbstractC4569i.a aVarM22418c2 = AbstractC4569i.a.m22418c();
                Intrinsics.m97801g(aVarM22418c2, "success(...)");
                return aVarM22418c2;
            }
            AbstractC4569i.a aVarM22416a3 = AbstractC4569i.a.m22416a();
            Intrinsics.m97801g(aVarM22416a3, "failure(...)");
            return aVarM22416a3;
            objectRef.element = ((Pair) objM85827x).getFirst();
            fbSenderWorker$doWork$2.L$0 = fbDataModel2;
            fbSenderWorker$doWork$2.L$1 = objectRef5;
            fbSenderWorker$doWork$2.L$2 = objectRef2;
            fbSenderWorker$doWork$2.L$3 = objectRef2;
            fbSenderWorker$doWork$2.L$4 = null;
            fbSenderWorker$doWork$2.label = 2;
            objM85827x = m85827x(imagePath, fbSenderWorker$doWork$2);
            if (objM85827x == objF) {
                return objF;
            }
            objectRef6 = objectRef2;
            objectRef7 = objectRef6;
            objectRef3 = objectRef5;
            fbDataModel3 = fbDataModel2;
            objectRef6.element = ((Pair) objM85827x).getSecond();
            objectRef4 = objectRef7;
            fbDataModel = fbDataModel3;
            fbSenderWorker$doWork$2.L$0 = fbDataModel;
            fbSenderWorker$doWork$2.L$1 = objectRef3;
            fbSenderWorker$doWork$2.L$2 = objectRef4;
            fbSenderWorker$doWork$2.L$3 = null;
            fbSenderWorker$doWork$2.label = 3;
            objM85828y = m85828y(fbSenderWorker$doWork$2);
            if (objM85828y == objF) {
                return objF;
            }
            fbDataModel4 = fbDataModel;
            objM85827x = objM85828y;
            objectRef8 = objectRef3;
            String str8 = (String) objectRef8.element;
            String str9 = (String) objectRef4.element;
            fbSenderWorker$doWork$2.L$0 = null;
            fbSenderWorker$doWork$2.L$1 = null;
            fbSenderWorker$doWork$2.L$2 = null;
            fbSenderWorker$doWork$2.label = 4;
            objM85827x = m85826w(str8, (String) objM85827x, fbDataModel4, str9, fbSenderWorker$doWork$2);
            if (objM85827x == objF) {
                return objF;
            }
            feedbackEntity = (FeedbackEntity) ((BaseDto) objM85827x).getData();
            if (feedbackEntity != null) {
                AbstractC4569i.a aVarM22418c3 = AbstractC4569i.a.m22418c();
                Intrinsics.m97801g(aVarM22418c3, "success(...)");
                return aVarM22418c3;
            }
            AbstractC4569i.a aVarM22416a4 = AbstractC4569i.a.m22416a();
            Intrinsics.m97801g(aVarM22416a4, "failure(...)");
            return aVarM22416a4;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
