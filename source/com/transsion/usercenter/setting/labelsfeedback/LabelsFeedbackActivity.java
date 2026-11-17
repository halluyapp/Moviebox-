package com.transsion.usercenter.setting.labelsfeedback;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax.InterfaceC4715a;
import com.blankj.utilcode.util.KeyboardUtils;
import com.bumptech.glide.Glide;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.net.bean.BaseDto;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.baseui.util.C14557c;
import com.transsion.publish.api.PhotoEntity;
import com.transsion.publish.p307ui.SelectImageActivity;
import com.transsion.usercenter.R$color;
import com.transsion.usercenter.R$string;
import com.transsion.usercenter.setting.labelsfeedback.model.FBContact;
import com.transsion.usercenter.setting.labelsfeedback.model.FbDataModel;
import com.transsion.usercenter.setting.labelsfeedback.model.FbOption;
import com.transsion.usercenter.setting.labelsfeedback.model.FbOptionList;
import com.transsion.usercenter.setting.labelsfeedback.model.FbTvData;
import com.transsion.usercenter.setting.labelsfeedback.sender.FBSender;
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
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p043bx.InterfaceC4896a;
import p349dh.C22982c;
import p465hp.C23889b;
import p585lw.C25702d;
import p944yh.C28951b;
import p978zg.C29182a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001*B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0007J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u0011J\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0015¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020\bH\u0014¢\u0006\u0004\b\"\u0010 J\u0017\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\r2\u0006\u0010$\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\r2\u0006\u0010$\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010+\u001a\u00020\r2\u0006\u0010$\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010)J\u0017\u0010,\u001a\u00020\r2\u0006\u0010$\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010)J\u001f\u0010/\u001a\u00020\r2\u0006\u0010$\u001a\u00020'2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J)\u00105\u001a\u00020\r2\u0006\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\u001c2\b\u00104\u001a\u0004\u0018\u000103H\u0014¢\u0006\u0004\b5\u00106R\u001b\u00109\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u00107\u001a\u0004\b8\u0010\u001aR\u0016\u0010;\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010:R\u001b\u0010>\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00107\u001a\u0004\b<\u0010=R\u001b\u0010A\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b?\u0010@¨\u0006B"}, m97100d2 = {"Lcom/transsion/usercenter/setting/labelsfeedback/LabelsFeedbackActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Llw/d;", "Lcom/transsion/usercenter/setting/labelsfeedback/d;", "Lcom/transsion/usercenter/setting/labelsfeedback/i;", "Lbx/a;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/transsion/usercenter/setting/labelsfeedback/model/FbDataModel;", "k0", "(Landroid/os/Bundle;)Lcom/transsion/usercenter/setting/labelsfeedback/model/FbDataModel;", "", "r0", "", "x0", "()Z", "Lhp/b;", "operationMenu", "j0", "(Lhp/b;)V", "w0", "isStatusDark", "isTranslucent", "q0", "()Llw/d;", "isChangeStatusBar", "", "statusColor", "()I", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Lcom/transsion/usercenter/setting/labelsfeedback/c;", "adaptor", CampaignEx.JSON_KEY_AD_K, "(Lcom/transsion/usercenter/setting/labelsfeedback/c;)V", "Lcom/transsion/usercenter/setting/labelsfeedback/h;", "e", "(Lcom/transsion/usercenter/setting/labelsfeedback/h;)V", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "i", "Landroidx/appcompat/widget/AppCompatImageView;", "imageVIew", "c", "(Lcom/transsion/usercenter/setting/labelsfeedback/h;Landroidx/appcompat/widget/AppCompatImageView;)V", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lkotlin/Lazy;", "n0", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/usercenter/setting/labelsfeedback/model/FbDataModel;", "model", "o0", "()Lcom/transsion/usercenter/setting/labelsfeedback/h;", "footerAdaptor", "p0", "()Lcom/transsion/usercenter/setting/labelsfeedback/c;", "listAdaptor", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class LabelsFeedbackActivity extends BaseActivity<C25702d> implements InterfaceC20828d, InterfaceC20833i, InterfaceC4896a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private FbDataModel model;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy d = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.setting.labelsfeedback.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LabelsFeedbackActivity.m85740l0(this.f65530a);
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy footerAdaptor = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.setting.labelsfeedback.o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LabelsFeedbackActivity.m85741m0(this.f65531a);
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy listAdaptor = LazyKt.m97097b(new Function0() { // from class: com.transsion.usercenter.setting.labelsfeedback.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LabelsFeedbackActivity.m85746s0(this.f65532a);
        }
    });

    /* JADX INFO: renamed from: com.transsion.usercenter.setting.labelsfeedback.LabelsFeedbackActivity$onCreate$5 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.usercenter.setting.labelsfeedback.LabelsFeedbackActivity$onCreate$5", m97637f = "LabelsFeedbackActivity.kt", m97638l = {111}, m97639m = "invokeSuspend")
    static final class C208245 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;

        C208245(Continuation<? super C208245> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LabelsFeedbackActivity.this.new C208245(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C208245) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            try {
                if (i11 == 0) {
                    ResultKt.m97107b(obj);
                    InterfaceC4715a interfaceC4715a = (InterfaceC4715a) C22982c.f70163e.m91553a().m91552h(InterfaceC4715a.class);
                    String strM111992a = C29182a.f89053a.m111992a();
                    this.label = 1;
                    obj = interfaceC4715a.m22787b(strM111992a, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(obj);
                }
                FbOptionList fbOptionList = (FbOptionList) ((BaseDto) obj).getData();
                if (fbOptionList != null) {
                    LabelsFeedbackActivity labelsFeedbackActivity = LabelsFeedbackActivity.this;
                    FbDataModel fbDataModel = labelsFeedbackActivity.model;
                    if (fbDataModel == null) {
                        Intrinsics.m97819y("model");
                        fbDataModel = null;
                    }
                    fbDataModel.setOptions(fbOptionList.getLabelList());
                    labelsFeedbackActivity.m85744p0().notifyDataSetChanged();
                    FbOption.INSTANCE.m85811d(fbOptionList);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: j0 */
    private final void m85738j0(C23889b operationMenu) {
        List listM94624h = operationMenu.m94624h();
        if (listM94624h == null || listM94624h.isEmpty()) {
            return;
        }
        m85743o0().m85790k(((PhotoEntity) listM94624h.get(0)).getLocalPath());
    }

    /* JADX INFO: renamed from: k0 */
    private final FbDataModel m85739k0(Bundle savedInstanceState) {
        FbDataModel fbDataModel;
        if (savedInstanceState != null && (fbDataModel = (FbDataModel) savedInstanceState.getParcelable("feedback_save_model")) != null) {
            fbDataModel.fillOption(FbOption.INSTANCE.m85809a(this));
            return fbDataModel;
        }
        FbDataModel fbDataModelM85822e = FBSender.f65533a.m85822e();
        if (fbDataModelM85822e != null) {
            fbDataModelM85822e.fillOption(FbOption.INSTANCE.m85809a(this));
            return fbDataModelM85822e;
        }
        String stringExtra = getIntent().getStringExtra("feedback_from_page");
        if (stringExtra == null) {
            stringExtra = "SETTINGS";
        }
        String str = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("subject_id");
        String stringExtra3 = getIntent().getStringExtra("ugc_video_id");
        Parcelable parcelableExtra = getIntent().getParcelableExtra("TV_DATA");
        FbDataModel fbDataModel2 = new FbDataModel(parcelableExtra instanceof FbTvData ? (FbTvData) parcelableExtra : null, str, stringExtra2, new FBContact(null, null, 2, null), null, null, null, null, null, stringExtra3, null, 1520, null);
        fbDataModel2.fillOption(FbOption.INSTANCE.m85809a(this));
        return fbDataModel2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C25702d m85740l0(LabelsFeedbackActivity labelsFeedbackActivity) {
        return C25702d.m101110c(labelsFeedbackActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C20832h m85741m0(LabelsFeedbackActivity labelsFeedbackActivity) {
        FbDataModel fbDataModel = labelsFeedbackActivity.model;
        if (fbDataModel == null) {
            Intrinsics.m97819y("model");
            fbDataModel = null;
        }
        return new C20832h(fbDataModel, labelsFeedbackActivity);
    }

    /* JADX INFO: renamed from: n0 */
    private final C25702d m85742n0() {
        return (C25702d) this.d.getValue();
    }

    /* JADX INFO: renamed from: o0 */
    private final C20832h m85743o0() {
        return (C20832h) this.footerAdaptor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public final C20827c m85744p0() {
        return (C20827c) this.listAdaptor.getValue();
    }

    /* JADX INFO: renamed from: r0 */
    private final void m85745r0() {
        KeyboardUtils.m27130d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C20827c m85746s0(LabelsFeedbackActivity labelsFeedbackActivity) {
        FbDataModel fbDataModel = labelsFeedbackActivity.model;
        if (fbDataModel == null) {
            Intrinsics.m97819y("model");
            fbDataModel = null;
        }
        C20827c c20827c = new C20827c(fbDataModel);
        c20827c.m85778l(labelsFeedbackActivity);
        c20827c.m85777k(labelsFeedbackActivity);
        return c20827c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final boolean m85747t0(LabelsFeedbackActivity labelsFeedbackActivity, View view, MotionEvent motionEvent) {
        labelsFeedbackActivity.m85745r0();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final Unit m85748u0(LabelsFeedbackActivity labelsFeedbackActivity, C23889b it) {
        Intrinsics.m97802h(it, "it");
        Integer numM94621e = it.m94621e();
        if (numM94621e != null && numM94621e.intValue() == 0) {
            labelsFeedbackActivity.m85738j0(it);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m85749v0(LabelsFeedbackActivity labelsFeedbackActivity, View view) {
        labelsFeedbackActivity.m85745r0();
        labelsFeedbackActivity.m85750w0();
    }

    /* JADX INFO: renamed from: w0 */
    private final void m85750w0() {
        if (m85751x0() || C14557c.f51100a.m65671a(m85742n0().f78128c.getId(), 1000L)) {
            return;
        }
        FbDataModel fbDataModel = this.model;
        FbDataModel fbDataModel2 = null;
        if (fbDataModel == null) {
            Intrinsics.m97819y("model");
            fbDataModel = null;
        }
        Integer tips = fbDataModel.getTips();
        if (tips != null) {
            C28951b.f88586a.m111454d(tips.intValue());
            return;
        }
        C28951b.f88586a.m111454d(R$string.feedback_tips_send);
        FBSender fBSender = FBSender.f65533a;
        FbDataModel fbDataModel3 = this.model;
        if (fbDataModel3 == null) {
            Intrinsics.m97819y("model");
        } else {
            fbDataModel2 = fbDataModel3;
        }
        Application application = getApplication();
        Intrinsics.m97801g(application, "getApplication(...)");
        fBSender.m85824i(fbDataModel2, application);
        finish();
    }

    /* JADX INFO: renamed from: x0 */
    private final boolean m85751x0() {
        return false;
    }

    @Override // com.transsion.usercenter.setting.labelsfeedback.InterfaceC20833i
    /* JADX INFO: renamed from: a */
    public void mo73883a(C20832h adaptor) {
        Intrinsics.m97802h(adaptor, "adaptor");
        if (m85751x0()) {
            return;
        }
        SelectImageActivity.INSTANCE.m75501a(this, 0, 1, null);
    }

    @Override // com.transsion.usercenter.setting.labelsfeedback.InterfaceC20833i
    /* JADX INFO: renamed from: b */
    public void mo73884b(C20832h adaptor) {
        Intrinsics.m97802h(adaptor, "adaptor");
        AppCompatButton appCompatButton = m85742n0().f78128c;
        FbDataModel fbDataModel = this.model;
        if (fbDataModel == null) {
            Intrinsics.m97819y("model");
            fbDataModel = null;
        }
        appCompatButton.setEnabled(fbDataModel.getCanSubmit());
    }

    @Override // com.transsion.usercenter.setting.labelsfeedback.InterfaceC20833i
    /* JADX INFO: renamed from: c */
    public void mo73885c(C20832h adaptor, AppCompatImageView imageVIew) {
        Intrinsics.m97802h(adaptor, "adaptor");
        Intrinsics.m97802h(imageVIew, "imageVIew");
        FbDataModel fbDataModel = this.model;
        if (fbDataModel == null) {
            Intrinsics.m97819y("model");
            fbDataModel = null;
        }
        String imagePath = fbDataModel.getImagePath();
        if (imagePath != null) {
            Glide.with((FragmentActivity) this).load2(new File(imagePath)).into(imageVIew);
        }
    }

    @Override // com.transsion.usercenter.setting.labelsfeedback.InterfaceC20833i
    /* JADX INFO: renamed from: e */
    public void mo73886e(C20832h adaptor) {
        Intrinsics.m97802h(adaptor, "adaptor");
        m85745r0();
    }

    @Override // com.transsion.usercenter.setting.labelsfeedback.InterfaceC20833i
    /* JADX INFO: renamed from: i */
    public void mo73887i(C20832h adaptor) {
        Intrinsics.m97802h(adaptor, "adaptor");
        Navigator.m61844w(TheRouter.m61773c("/loginapi/select_country"), this, 100, null, 4, null);
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isChangeStatusBar() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.usercenter.setting.labelsfeedback.InterfaceC20828d
    /* JADX INFO: renamed from: k */
    public void mo85752k(C20827c adaptor) {
        Intrinsics.m97802h(adaptor, "adaptor");
        m85745r0();
        AppCompatButton appCompatButton = m85742n0().f78128c;
        FbDataModel fbDataModel = this.model;
        if (fbDataModel == null) {
            Intrinsics.m97819y("model");
            fbDataModel = null;
        }
        appCompatButton.setEnabled(fbDataModel.getCanSubmit());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Serializable serializableExtra;
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && requestCode == 100 && data != null && (serializableExtra = data.getSerializableExtra("countryCode")) != null && (serializableExtra instanceof Country)) {
            m85743o0().m85789j((Country) serializableExtra);
        }
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.model = m85739k0(savedInstanceState);
        m85742n0().f78129d.setTitleText(R$string.user_setting_feedback);
        RecyclerView recyclerView = m85742n0().f78127b;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(new ConcatAdapter(new C20834j(), m85744p0(), m85743o0()));
        m85742n0().f78127b.setOnTouchListener(new View.OnTouchListener() { // from class: com.transsion.usercenter.setting.labelsfeedback.k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return LabelsFeedbackActivity.m85747t0(this.f65524a, view, motionEvent);
            }
        });
        Function1 function1 = new Function1() { // from class: com.transsion.usercenter.setting.labelsfeedback.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LabelsFeedbackActivity.m85748u0(this.f65525a, (C23889b) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
        AppCompatButton appCompatButton = m85742n0().f78128c;
        FbDataModel fbDataModel = this.model;
        if (fbDataModel == null) {
            Intrinsics.m97819y("model");
            fbDataModel = null;
        }
        appCompatButton.setEnabled(fbDataModel.getCanSubmit());
        m85742n0().f78128c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.usercenter.setting.labelsfeedback.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LabelsFeedbackActivity.m85749v0(this.f65526a, view);
            }
        });
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), C25220y0.m99269c(), null, new C208245(null), 2, null);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.m97802h(outState, "outState");
        FbDataModel fbDataModel = this.model;
        if (fbDataModel == null) {
            Intrinsics.m97819y("model");
            fbDataModel = null;
        }
        outState.putParcelable("feedback_save_model", fbDataModel);
        super.onSaveInstanceState(outState);
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public C25702d getViewBinding() {
        return m85742n0();
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public int statusColor() {
        return R$color.pair_FFFFFF2;
    }
}
