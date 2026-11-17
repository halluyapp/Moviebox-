package com.transsion.postdetail.p306ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.KeyboardUtils;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.bean.ReportConfig;
import com.transsion.postdetail.bean.ReportReason;
import com.transsion.postdetail.p306ui.adapter.C16977d;
import com.transsion.postdetail.p306ui.adapter.C16984h;
import com.transsion.publish.api.PhotoEntity;
import com.transsion.publish.p307ui.SelectImageActivity;
import com.transsion.upload.bean.UploadFileType;
import com.transsion.upload.bean.UploadTstTokenStorageType;
import com.transsion.usercenter.setting.labelsfeedback.C20832h;
import com.transsion.usercenter.setting.labelsfeedback.InterfaceC20833i;
import com.transsion.usercenter.setting.labelsfeedback.model.FBContact;
import com.transsion.usercenter.setting.labelsfeedback.model.FbDataModel;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.loginapi.bean.Country;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import p465hp.C23889b;
import p497iw.C24233c;
import p497iw.InterfaceC24231a;
import p844vo.C28144d;
import p985zo.InterfaceC29209b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J)\u0010&\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b&\u0010'R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010)\u001a\u0004\b*\u0010+R\u001b\u0010.\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010)\u001a\u0004\b-\u0010\rR\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00100R\u001b\u00105\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b3\u00104R\u001b\u00108\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010)\u001a\u0004\b;\u0010<¨\u0006?"}, m97100d2 = {"Lcom/transsion/postdetail/ui/activity/PostFeedbackInputActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Lvo/d;", "Lcom/transsion/usercenter/setting/labelsfeedback/i;", "<init>", "()V", "", "A0", "", "imagePath", "E0", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "w0", "()Lvo/d;", "", "isStatusDark", "()Z", "isTranslucent", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/os/Bundle;)V", "Lcom/transsion/usercenter/setting/labelsfeedback/h;", "adaptor", "e", "(Lcom/transsion/usercenter/setting/labelsfeedback/h;)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "i", "Landroidx/appcompat/widget/AppCompatImageView;", "imageVIew", "c", "(Lcom/transsion/usercenter/setting/labelsfeedback/h;Landroidx/appcompat/widget/AppCompatImageView;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lzo/b;", "Lkotlin/Lazy;", "v0", "()Lzo/b;", NotificationCompat.CATEGORY_SERVICE, "r0", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/postdetail/bean/ReportConfig;", "Lcom/transsion/postdetail/bean/ReportConfig;", "reportConfig", "Lcom/transsion/usercenter/setting/labelsfeedback/model/FbDataModel;", "s0", "()Lcom/transsion/usercenter/setting/labelsfeedback/model/FbDataModel;", "fbModel", "t0", "()Lcom/transsion/usercenter/setting/labelsfeedback/h;", "footerAdapter", "Lcom/transsion/postdetail/ui/adapter/h;", "f", "u0", "()Lcom/transsion/postdetail/ui/adapter/h;", "reasonAdapter", "g", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class PostFeedbackInputActivity extends BaseActivity<C28144d> implements InterfaceC20833i {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private ReportConfig reportConfig;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy service = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.activity.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostFeedbackInputActivity.m73857D0();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy d = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.activity.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostFeedbackInputActivity.m73872o0(this.f56949a);
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy fbModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.activity.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostFeedbackInputActivity.m73873p0();
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Lazy footerAdapter = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.activity.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostFeedbackInputActivity.m73874q0(this.f56950a);
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy reasonAdapter = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.activity.l
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PostFeedbackInputActivity.m73855B0(this.f56951a);
        }
    });

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.activity.PostFeedbackInputActivity$b */
    public static final class C16960b implements InterfaceC24231a {

        /* JADX INFO: renamed from: a */
        private boolean f56940a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Continuation f56941b;

        C16960b(Continuation continuation) {
            this.f56941b = continuation;
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
            if (this.f56940a) {
                return;
            }
            this.f56941b.resumeWith(Result.m112707constructorimpl(url));
            this.f56940a = true;
        }

        @Override // p497iw.InterfaceC24231a
        /* JADX INFO: renamed from: c */
        public void mo73891c(String str, String str2, String str3, UploadTstTokenStorageType uploadTstTokenStorageType) {
            if (this.f56940a) {
                return;
            }
            Continuation continuation = this.f56941b;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m112707constructorimpl(ResultKt.m97106a(new Exception("upload image failed: " + str2))));
            this.f56940a = true;
        }
    }

    /* JADX INFO: renamed from: A0 */
    private final void m73854A0() {
        List<ReportReason> reasons;
        Integer numM73919h = m73878u0().m73919h();
        if (numM73919h != null) {
            int iIntValue = numM73919h.intValue();
            ReportConfig reportConfig = this.reportConfig;
            ReportReason reportReason = (reportConfig == null || (reasons = reportConfig.getReasons()) == null) ? null : (ReportReason) CollectionsKt.m97362l0(reasons, iIntValue);
            if (reportReason != null) {
                m73875r0().f86400b.setEnabled(false);
                AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new PostFeedbackInputActivity$onSubmit$1(this, reportReason, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C16984h m73855B0(final PostFeedbackInputActivity postFeedbackInputActivity) {
        ReportConfig reportConfig = postFeedbackInputActivity.reportConfig;
        List<ReportReason> reasons = reportConfig != null ? reportConfig.getReasons() : null;
        if (reasons == null) {
            reasons = CollectionsKt.m97506l();
        }
        C16984h c16984h = new C16984h(reasons);
        c16984h.m73923m(new Function1() { // from class: com.transsion.postdetail.ui.activity.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostFeedbackInputActivity.m73856C0(this.f56952a, (ReportReason) obj);
            }
        });
        return c16984h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final Unit m73856C0(PostFeedbackInputActivity postFeedbackInputActivity, ReportReason reportReason) {
        postFeedbackInputActivity.m73875r0().f86400b.setEnabled(reportReason != null);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final InterfaceC29209b m73857D0() {
        return (InterfaceC29209b) C22982c.f70163e.m91553a().m91552h(InterfaceC29209b.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public final Object m73858E0(String str, Continuation continuation) throws Throwable {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.m97627c(continuation));
        C24233c.f73744a.m95262f(str, UploadFileType.OBJECT_NAME_IMAGE, true, new C16960b(safeContinuation));
        Object objM97624a = safeContinuation.m97624a();
        if (objM97624a == IntrinsicsKt.m97630f()) {
            DebugProbesKt.m97647c(continuation);
        }
        return objM97624a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C28144d m73872o0(PostFeedbackInputActivity postFeedbackInputActivity) {
        return C28144d.m109297c(postFeedbackInputActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final FbDataModel m73873p0() {
        return new FbDataModel(null, "report", null, new FBContact(null, null, 2, null), null, null, null, null, null, null, null, 2032, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C20832h m73874q0(PostFeedbackInputActivity postFeedbackInputActivity) {
        return new C20832h(postFeedbackInputActivity.m73876s0(), postFeedbackInputActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public final C28144d m73875r0() {
        return (C28144d) this.d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public final FbDataModel m73876s0() {
        return (FbDataModel) this.fbModel.getValue();
    }

    /* JADX INFO: renamed from: t0 */
    private final C20832h m73877t0() {
        return (C20832h) this.footerAdapter.getValue();
    }

    /* JADX INFO: renamed from: u0 */
    private final C16984h m73878u0() {
        return (C16984h) this.reasonAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public final InterfaceC29209b m73879v0() {
        return (InterfaceC29209b) this.service.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final Unit m73880x0(PostFeedbackInputActivity postFeedbackInputActivity, C23889b it) {
        List listM94624h;
        PhotoEntity photoEntity;
        String localPath;
        Intrinsics.m97802h(it, "it");
        Integer numM94621e = it.m94621e();
        if (numM94621e != null && numM94621e.intValue() == 0 && (listM94624h = it.m94624h()) != null && (photoEntity = (PhotoEntity) CollectionsKt.m97361k0(listM94624h)) != null && (localPath = photoEntity.getLocalPath()) != null) {
            postFeedbackInputActivity.m73877t0().m85790k(localPath);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m73881y0(PostFeedbackInputActivity postFeedbackInputActivity, View view) {
        KeyboardUtils.m27130d(postFeedbackInputActivity);
        postFeedbackInputActivity.m73854A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final boolean m73882z0(PostFeedbackInputActivity postFeedbackInputActivity, View view, MotionEvent motionEvent) {
        KeyboardUtils.m27130d(postFeedbackInputActivity);
        return false;
    }

    @Override // com.transsion.usercenter.setting.labelsfeedback.InterfaceC20833i
    /* JADX INFO: renamed from: a */
    public void mo73883a(C20832h adaptor) {
        Intrinsics.m97802h(adaptor, "adaptor");
        SelectImageActivity.INSTANCE.m75501a(this, 0, 1, null);
    }

    @Override // com.transsion.usercenter.setting.labelsfeedback.InterfaceC20833i
    /* JADX INFO: renamed from: b */
    public void mo73884b(C20832h adaptor) {
        Intrinsics.m97802h(adaptor, "adaptor");
    }

    @Override // com.transsion.usercenter.setting.labelsfeedback.InterfaceC20833i
    /* JADX INFO: renamed from: c */
    public void mo73885c(C20832h adaptor, AppCompatImageView imageVIew) {
        Intrinsics.m97802h(adaptor, "adaptor");
        Intrinsics.m97802h(imageVIew, "imageVIew");
        String imagePath = m73876s0().getImagePath();
        if (imagePath != null) {
            Glide.with((FragmentActivity) this).load2(new File(imagePath)).into(imageVIew);
        }
    }

    @Override // com.transsion.usercenter.setting.labelsfeedback.InterfaceC20833i
    /* JADX INFO: renamed from: e */
    public void mo73886e(C20832h adaptor) {
        Intrinsics.m97802h(adaptor, "adaptor");
        KeyboardUtils.m27130d(this);
    }

    @Override // com.transsion.usercenter.setting.labelsfeedback.InterfaceC20833i
    /* JADX INFO: renamed from: i */
    public void mo73887i(C20832h adaptor) {
        Intrinsics.m97802h(adaptor, "adaptor");
        Navigator.m61844w(TheRouter.m61773c("/loginapi/select_country"), this, 100, null, 4, null);
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public void initView(Bundle savedInstanceState) {
        String stringExtra = getIntent().getStringExtra("extra_report_config_json");
        this.reportConfig = stringExtra != null ? (ReportConfig) new Gson().fromJson(stringExtra, new TypeToken<ReportConfig>() { // from class: com.transsion.postdetail.ui.activity.PostFeedbackInputActivity$initView$1$type$1
        }.getType()) : null;
        m73875r0().f86402d.setTitleText(R$string.post_feedback_report);
        RecyclerView recyclerView = m73875r0().f86401c;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        ReportConfig reportConfig = this.reportConfig;
        recyclerView.setAdapter(new ConcatAdapter(new C16977d(reportConfig != null ? reportConfig.getTitle() : null), m73878u0(), m73877t0()));
        m73875r0().f86401c.setOnTouchListener(new View.OnTouchListener() { // from class: com.transsion.postdetail.ui.activity.e
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return PostFeedbackInputActivity.m73882z0(this.f56945a, view, motionEvent);
            }
        });
        Function1 function1 = new Function1() { // from class: com.transsion.postdetail.ui.activity.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostFeedbackInputActivity.m73880x0(this.f56946a, (C23889b) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
        m73875r0().f86400b.setEnabled(false);
        m73875r0().f86400b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.activity.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PostFeedbackInputActivity.m73881y0(this.f56948a, view);
            }
        });
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Serializable serializableExtra;
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && requestCode == 100 && data != null && (serializableExtra = data.getSerializableExtra("countryCode")) != null && (serializableExtra instanceof Country)) {
            m73877t0().m85789j((Country) serializableExtra);
        }
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public C28144d getViewBinding() {
        return m73875r0();
    }
}
