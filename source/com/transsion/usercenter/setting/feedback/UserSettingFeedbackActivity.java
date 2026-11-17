package com.transsion.usercenter.setting.feedback;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.Lifecycle;
import com.blankj.utilcode.util.KeyboardUtils;
import com.bumptech.glide.Glide;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.TitleLayout;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.publish.api.PhotoEntity;
import com.transsion.publish.p307ui.SelectImageActivity;
import com.transsion.usercenter.R$color;
import com.transsion.usercenter.R$string;
import com.transsion.usercenter.setting.feedback.UserSettingFeedbackActivity;
import com.transsion.usercenter.setting.labelsfeedback.model.FbTvData;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.loginapi.bean.Country;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.File;
import java.io.Serializable;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C25220y0;
import ng.AbstractC26006c;
import p465hp.C23889b;
import p585lw.C25743x0;
import p944yh.C28951b;
import zw.C29263c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, m97100d2 = {"Lcom/transsion/usercenter/setting/feedback/UserSettingFeedbackActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Llw/x0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "isStatusDark", "()Z", "isTranslucent", "j0", "()Llw/x0;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "initView", "q0", "t0", "i0", "k0", "Lhp/b;", "operationMenu", "s0", "(Lhp/b;)V", "a", "Llw/x0;", "mBinding", "Lzw/c;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lzw/c;", "mUserFeedbackViewModel", "Lcom/transsion/publish/api/PhotoEntity;", "c", "Lcom/transsion/publish/api/PhotoEntity;", "photoEntity", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/String;", "feedbackFromPage", "e", "subjectId", "Lcom/transsnet/loginapi/bean/Country;", "f", "Lcom/transsnet/loginapi/bean/Country;", "mCountry", "Landroid/text/InputFilter$LengthFilter;", "g", "Landroid/text/InputFilter$LengthFilter;", "mLengthFilter", "h", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UserSettingFeedbackActivity extends BaseActivity<C25743x0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C25743x0 mBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C29263c mUserFeedbackViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private PhotoEntity photoEntity;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String subjectId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Country mCountry;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String feedbackFromPage = "SETTINGS";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InputFilter.LengthFilter mLengthFilter = new C20815c();

    /* JADX INFO: renamed from: com.transsion.usercenter.setting.feedback.UserSettingFeedbackActivity$b */
    public static final class C20814b implements TextWatcher {
        public C20814b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AppCompatTextView appCompatTextView;
            AppCompatButton appCompatButton;
            AppCompatTextView appCompatTextView2;
            int length = editable != null ? editable.length() : 0;
            String string = UserSettingFeedbackActivity.this.getString(R$string.user_setting_feedback_max_len, Integer.valueOf(length));
            Intrinsics.m97801g(string, "getString(...)");
            if (length < 500) {
                C25743x0 c25743x0 = UserSettingFeedbackActivity.this.mBinding;
                if (c25743x0 != null && (appCompatTextView2 = c25743x0.f78454i) != null) {
                    appCompatTextView2.setText(string);
                }
            } else {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(AbstractC2397b.getColor(UserSettingFeedbackActivity.this, R$color.base_color_FA5546));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(foregroundColorSpan, 0, 3, 33);
                C25743x0 c25743x1 = UserSettingFeedbackActivity.this.mBinding;
                if (c25743x1 != null && (appCompatTextView = c25743x1.f78454i) != null) {
                    appCompatTextView.setText(spannableStringBuilder);
                }
            }
            C25743x0 c25743x2 = UserSettingFeedbackActivity.this.mBinding;
            if (c25743x2 == null || (appCompatButton = c25743x2.f78447b) == null) {
                return;
            }
            appCompatButton.setEnabled(length >= 1);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.setting.feedback.UserSettingFeedbackActivity$c */
    public static final class C20815c extends InputFilter.LengthFilter {
        C20815c() {
            super(500);
        }

        @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
            int length;
            if (charSequence != null) {
                try {
                    length = charSequence.length();
                } catch (Exception unused) {
                }
            } else {
                length = 0;
            }
            if (length + (spanned != null ? spanned.length() : 0) > getMax()) {
                C28951b.f88586a.m111454d(R$string.user_setting_feedback_max_len_tips);
            }
            return charSequence;
        }
    }

    /* JADX INFO: renamed from: com.transsion.usercenter.setting.feedback.UserSettingFeedbackActivity$d */
    static final class C20816d implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65481a;

        C20816d(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65481a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65481a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3189c0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m97797c(mo6065a(), ((FunctionAdapter) obj).mo6065a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6065a().hashCode();
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f65481a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: i0 */
    private final void m85718i0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        C25743x0 c25743x0 = (C25743x0) getMViewBinding();
        this.mBinding = c25743x0;
        if (c25743x0 != null) {
            AppCompatEditText etDesc = c25743x0.f78448c;
            Intrinsics.m97801g(etDesc, "etDesc");
            etDesc.addTextChangedListener(new C20814b());
            InputFilter[] filters = c25743x0.f78448c.getFilters();
            Intrinsics.m97801g(filters, "getFilters(...)");
            List listJ0 = ArraysKt.m97447J0(filters);
            listJ0.add(0, this.mLengthFilter);
            c25743x0.f78448c.setFilters((InputFilter[]) listJ0.toArray(new InputFilter[0]));
            TitleLayout titleLayout = c25743x0.f78453h;
            String string = getString(R$string.user_setting_feedback);
            Intrinsics.m97801g(string, "getString(...)");
            titleLayout.setTitleText(string);
            c25743x0.f78447b.setOnClickListener(new View.OnClickListener() { // from class: zw.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserSettingFeedbackActivity.m85721m0(this.f89298a, view);
                }
            });
            c25743x0.getRoot().setOnClickListener(new View.OnClickListener() { // from class: zw.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserSettingFeedbackActivity.m85722n0(this.f89299a, view);
                }
            });
            c25743x0.f78450e.setOnClickListener(new View.OnClickListener() { // from class: zw.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserSettingFeedbackActivity.m85723o0(this.f89300a, view);
                }
            });
            c25743x0.f78455j.setOnClickListener(new View.OnClickListener() { // from class: zw.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserSettingFeedbackActivity.m85724p0(this.f89301a, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k0 */
    private final void m85719k0() {
        Function1 function1 = new Function1() { // from class: zw.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserSettingFeedbackActivity.m85720l0(this.f89297a, (C23889b) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final Unit m85720l0(UserSettingFeedbackActivity userSettingFeedbackActivity, C23889b it) {
        Intrinsics.m97802h(it, "it");
        Integer numM94621e = it.m94621e();
        if (numM94621e != null && numM94621e.intValue() == 0) {
            userSettingFeedbackActivity.m85727s0(it);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final void m85721m0(UserSettingFeedbackActivity userSettingFeedbackActivity, View view) {
        Navigator.m61845x(TheRouter.m61773c("/profile/user_center_labels_feedback").m61857K("feedback_from_page", "SETTINGS").m61855I("TV_DATA", new FbTvData("1", 1, 1)), userSettingFeedbackActivity, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final void m85722n0(UserSettingFeedbackActivity userSettingFeedbackActivity, View view) {
        KeyboardUtils.m27130d(userSettingFeedbackActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final void m85723o0(UserSettingFeedbackActivity userSettingFeedbackActivity, View view) {
        SelectImageActivity.INSTANCE.m75501a(userSettingFeedbackActivity, 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final void m85724p0(UserSettingFeedbackActivity userSettingFeedbackActivity, View view) {
        Navigator.m61844w(TheRouter.m61773c("/loginapi/select_country"), userSettingFeedbackActivity, 100, null, 4, null);
    }

    /* JADX INFO: renamed from: q0 */
    private final void m85725q0() {
        C29263c c29263c = (C29263c) new C3227v0(this).m14969a(C29263c.class);
        c29263c.m112226f().m14851j(this, new C20816d(new Function1() { // from class: zw.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserSettingFeedbackActivity.m85726r0(this.f89296a, (String) obj);
            }
        }));
        this.mUserFeedbackViewModel = c29263c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final Unit m85726r0(UserSettingFeedbackActivity userSettingFeedbackActivity, String str) {
        if (TextUtils.isEmpty(str)) {
            userSettingFeedbackActivity.m85728t0();
            return Unit.f75682a;
        }
        userSettingFeedbackActivity.getClass();
        C28951b.f88586a.m111454d(R$string.upload_success);
        userSettingFeedbackActivity.m85718i0();
        userSettingFeedbackActivity.finish();
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    private final void m85727s0(C23889b operationMenu) {
        String localPath;
        List listM94624h = operationMenu.m94624h();
        if (listM94624h == null || listM94624h.isEmpty()) {
            return;
        }
        this.photoEntity = (PhotoEntity) listM94624h.get(0);
        C25743x0 c25743x0 = (C25743x0) getMViewBinding();
        AppCompatImageView ivAddImage = c25743x0.f78451f;
        Intrinsics.m97801g(ivAddImage, "ivAddImage");
        AbstractC26006c.m102054g(ivAddImage);
        PhotoEntity photoEntity = this.photoEntity;
        if (photoEntity == null || (localPath = photoEntity.getLocalPath()) == null) {
            return;
        }
        Glide.with((FragmentActivity) this).load2(new File(localPath)).into(c25743x0.f78450e);
    }

    /* JADX INFO: renamed from: t0 */
    private final void m85728t0() {
        m85718i0();
        C28951b.f88586a.m111454d(R$string.upload_failed);
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public C25743x0 getViewBinding() {
        C25743x0 c25743x0M101249c = C25743x0.m101249c(getLayoutInflater());
        Intrinsics.m97801g(c25743x0M101249c, "inflate(...)");
        return c25743x0M101249c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Serializable serializableExtra;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == -1 && data != null && (serializableExtra = data.getSerializableExtra("countryCode")) != null && (serializableExtra instanceof Country)) {
            Country country = (Country) serializableExtra;
            this.mCountry = country;
            ((C25743x0) getMViewBinding()).f78455j.setText(country.getCountry_s() + " + " + country.getCode());
        }
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra("feedback_from_page");
        if (stringExtra == null) {
            stringExtra = "SETTINGS";
        }
        this.feedbackFromPage = stringExtra;
        this.subjectId = getIntent().getStringExtra("subject_id");
        initView();
        m85725q0();
        m85719k0();
    }
}
