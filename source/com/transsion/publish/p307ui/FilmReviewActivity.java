package com.transsion.publish.p307ui;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.AbstractC3168w;
import ck.C5127x;
import com.cloud.tmc.offline.download.constants.OfflineConstantsKt;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.publish.R$id;
import com.transsion.publish.R$string;
import com.transsion.publish.api.GroupBean;
import com.transsion.publish.view.CustomPublishHeader;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import jp.C24452b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p415fq.InterfaceC23411b;
import p550kj.C24655b;
import p684pp.InterfaceC26908a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J#\u0010\f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J1\u0010\"\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010\u0005J\u0015\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0017¢\u0006\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006;"}, m97100d2 = {"Lcom/transsion/publish/ui/FilmReviewActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Ljp/b;", "Lpp/a;", "<init>", "()V", "", "initView", "Lcom/transsion/moviedetailapi/bean/Subject;", "subject", "Lcom/transsion/publish/api/GroupBean;", "groupBean", "i0", "(Lcom/transsion/moviedetailapi/bean/Subject;Lcom/transsion/publish/api/GroupBean;)V", "initData", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "e0", "()Ljp/b;", "onBackPressed", "", "isTranslucent", "()Z", "isStatusDark", "isChangeStatusBar", "", "p0", "", "p1", "p2", "p3", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "", "getPageName", "()Ljava/lang/String;", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "onResume", OfflineConstantsKt.OFFLINE_CONFIG_ENABLE, "j0", "(Z)V", "Lcom/transsion/publish/ui/FilmReviewFragment;", "a", "Lcom/transsion/publish/ui/FilmReviewFragment;", "fragment", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "I", "sourceType", "c", "Lcom/transsion/moviedetailapi/bean/Subject;", "getSubject", "()Lcom/transsion/moviedetailapi/bean/Subject;", "setSubject", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", "Publish_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class FilmReviewActivity extends BaseActivity<C24452b> implements InterfaceC26908a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private FilmReviewFragment fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int sourceType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Subject subject;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final void m75404f0(FilmReviewActivity filmReviewActivity, View view) {
        FilmReviewFragment filmReviewFragment = filmReviewActivity.fragment;
        if (filmReviewFragment != null) {
            filmReviewFragment.closeAffirm();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final void m75405g0(FilmReviewActivity filmReviewActivity, View view) {
        FilmReviewFragment filmReviewFragment = filmReviewActivity.fragment;
        if (filmReviewFragment != null) {
            filmReviewFragment.checkPost();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final void m75406h0() {
        InterfaceC23411b interfaceC23411b = (InterfaceC23411b) TheRouter.m61774d(InterfaceC23411b.class, new Object[0]);
        if (interfaceC23411b != null) {
            interfaceC23411b.mo23887d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    private final void m75407i0(Subject subject, GroupBean groupBean) {
        if (subject != null) {
            CustomPublishHeader customPublishHeader = ((C24452b) getMViewBinding()).f74517c;
            String title = subject.getTitle();
            Cover cover = subject.getCover();
            customPublishHeader.setHeader(title, cover != null ? cover.getUrl() : null);
        }
        if (groupBean != null) {
            ((C24452b) getMViewBinding()).f74517c.setHeader(groupBean.getName(), groupBean.getAvatar());
        }
    }

    private final void initData() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        GroupBean groupBean;
        ((C24452b) getMViewBinding()).f74517c.setOnBackClick(new View.OnClickListener() { // from class: com.transsion.publish.ui.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilmReviewActivity.m75404f0(this.f58235a, view);
            }
        });
        ((C24452b) getMViewBinding()).f74517c.setOnEditClick(new View.OnClickListener() { // from class: com.transsion.publish.ui.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilmReviewActivity.m75405g0(this.f58238a, view);
            }
        });
        this.sourceType = getIntent().getIntExtra("sourceType", 1);
        int intExtra = getIntent().getIntExtra("sourceMode", 0);
        if (getIntent().hasExtra("subject")) {
            Serializable serializableExtra = getIntent().getSerializableExtra("subject");
            Intrinsics.m97800f(serializableExtra, "null cannot be cast to non-null type com.transsion.moviedetailapi.bean.Subject");
            this.subject = (Subject) serializableExtra;
        }
        if (getIntent().hasExtra("group")) {
            Serializable serializableExtra2 = getIntent().getSerializableExtra("group");
            Intrinsics.m97800f(serializableExtra2, "null cannot be cast to non-null type com.transsion.publish.api.GroupBean");
            groupBean = (GroupBean) serializableExtra2;
        } else {
            groupBean = null;
        }
        if (this.sourceType == 2) {
            m75407i0(this.subject, groupBean);
        } else {
            ((C24452b) getMViewBinding()).f74517c.setTitle(getString(R$string.film_review_title));
        }
        this.fragment = FilmReviewFragment.INSTANCE.m75433a(this.sourceType, this.subject, intExtra, groupBean);
        AbstractC3168w abstractC3168wM14557p = getSupportFragmentManager().m14557p();
        int i11 = R$id.fl_content;
        FilmReviewFragment filmReviewFragment = this.fragment;
        Intrinsics.m97799e(filmReviewFragment);
        abstractC3168wM14557p.m14813s(i11, filmReviewFragment).mo14671j();
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
    }

    @Override // p684pp.InterfaceC26908a, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        InterfaceC26908a.a.m105028a(this, editable);
    }

    @Override // p684pp.InterfaceC26908a, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        InterfaceC26908a.a.m105029b(this, charSequence, i11, i12, i13);
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public C24452b getViewBinding() {
        C24452b c24452bM95947c = C24452b.m95947c(getLayoutInflater());
        Intrinsics.m97801g(c24452bM95947c, "inflate(...)");
        return c24452bM95947c;
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public String getPageName() {
        return this.sourceType == 2 ? "create_post" : "create_review";
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isChangeStatusBar() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return !C5127x.f17620a.m23969a();
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public final void m75409j0(boolean enable) {
        CustomPublishHeader customPublishHeader = ((C24452b) getMViewBinding()).f74517c;
        if (customPublishHeader != null) {
            customPublishHeader.setPostEnable(enable);
        }
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public C24655b newLogViewConfig() {
        return new C24655b(getPageName(), false, 2, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        FilmReviewFragment filmReviewFragment = this.fragment;
        if (filmReviewFragment != null) {
            filmReviewFragment.closeAffirm();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
        ((C24452b) getMViewBinding()).f74516b.postDelayed(new Runnable() { // from class: com.transsion.publish.ui.e
            @Override // java.lang.Runnable
            public final void run() {
                FilmReviewActivity.m75406h0();
            }
        }, 100L);
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        InterfaceC23411b interfaceC23411b = (InterfaceC23411b) TheRouter.m61774d(InterfaceC23411b.class, new Object[0]);
        if (interfaceC23411b != null) {
            interfaceC23411b.mo23888e();
        }
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseMusicFloatActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence p11, int p12, int p13, int p14) {
    }
}
