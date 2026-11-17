package com.transsion.moviedetail.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.TitleLayout;
import com.therouter.TheRouter;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.moviedetail.fragment.SubjectListFragment;
import com.transsion.usercenter.R$id;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26006c;
import p743rh.C27287m;
import p908xh.C28597a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u000fR$\u0010#\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\nR*\u0010,\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00102\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u000f\"\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, m97100d2 = {"Lcom/transsion/moviedetail/activity/SubjectListActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Lxh/a;", "<init>", "()V", "", "C0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "D0", "()Lxh/a;", "", "f0", "()Ljava/lang/String;", "l0", "m0", "k0", "p0", "retryLoadData", "", "isTranslucent", "()Z", "o0", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "getPageName", "i", "Landroid/os/Bundle;", "getParams", "()Landroid/os/Bundle;", "setParams", "params", "Ljava/lang/Class;", "Lcom/transsion/moviedetailapi/AbsSubjectListViewModel;", "j", "Ljava/lang/Class;", "getTypeClass", "()Ljava/lang/Class;", "setTypeClass", "(Ljava/lang/Class;)V", "typeClass", CampaignEx.JSON_KEY_AD_K, "Ljava/lang/String;", "getMTitle", "setMTitle", "(Ljava/lang/String;)V", "mTitle", "Landroidx/fragment/app/Fragment;", "l", "Landroidx/fragment/app/Fragment;", "mFragment", "m", "a", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SubjectListActivity extends BaseNewActivity<C28597a> {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private Bundle params;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private Class typeClass;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String mTitle;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private Fragment mFragment;

    /* JADX INFO: renamed from: com.transsion.moviedetail.activity.SubjectListActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m70175a(Context context, Bundle params, Class type, String str) {
            Intrinsics.m97802h(context, "context");
            Intrinsics.m97802h(params, "params");
            Intrinsics.m97802h(type, "type");
            Intent intent = new Intent(context, (Class<?>) SubjectListActivity.class);
            intent.putExtra("subject_params_key", params);
            intent.putExtra("view_model_type", type);
            intent.putExtra("subject_params_title", str);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: C0 */
    private final void m70173C0() {
        SubjectListFragment subjectListFragmentM70517a;
        Class cls = this.typeClass;
        if (cls == null) {
            finish();
            return;
        }
        Fragment fragmentM14547k0 = getSupportFragmentManager().m14547k0("subject_fragment_tag");
        if (fragmentM14547k0 instanceof SubjectListFragment) {
            subjectListFragmentM70517a = (SubjectListFragment) fragmentM14547k0;
        } else {
            SubjectListFragment.Companion c15978a = SubjectListFragment.INSTANCE;
            Bundle bundle = this.params;
            if (bundle == null) {
                bundle = new Bundle();
            }
            subjectListFragmentM70517a = c15978a.m70517a(bundle, cls);
        }
        this.mFragment = subjectListFragmentM70517a;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
        AbstractC3168w abstractC3168wM14557p = supportFragmentManager.m14557p();
        Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
        Fragment fragment = this.mFragment;
        if (fragment != null) {
            abstractC3168wM14557p.m14814t(R$id.container, fragment, "subject_fragment_tag");
        }
        abstractC3168wM14557p.mo14671j();
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public C28597a getViewBinding() {
        C28597a c28597aM110317c = C28597a.m110317c(getLayoutInflater());
        Intrinsics.m97801g(c28597aM110317c, "inflate(...)");
        return c28597aM110317c;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: f0 */
    public String mo65386f0() {
        return "";
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    public String getPageName() {
        return "post_list";
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: k0 */
    public void mo65389k0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: l0 */
    public void mo65390l0() {
        if (this.typeClass == null) {
            Intent intent = getIntent();
            Serializable serializableExtra = intent.getSerializableExtra("view_model_type");
            this.typeClass = serializableExtra instanceof Class ? (Class) serializableExtra : null;
            this.params = intent.getBundleExtra("subject_params_key");
            this.mTitle = intent.getStringExtra("subject_params_title");
        }
        ConstraintLayout constraintLayoutM110319b = ((C28597a) getMViewBinding()).getRoot();
        Intrinsics.m97801g(constraintLayoutM110319b, "getRoot(...)");
        AbstractC26006c.m102052e(constraintLayoutM110319b);
        TitleLayout titleLayout = ((C28597a) getMViewBinding()).f87749c;
        String str = this.mTitle;
        if (str == null) {
            str = "";
        }
        titleLayout.setTitleText(str);
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: m0 */
    public void mo65391m0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: o0 */
    public boolean mo65393o0() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        TheRouter.m61781l(this);
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.m97802h(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        m70173C0();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: p0 */
    public void mo65394p0() {
        m70173C0();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
        m65400w0();
        if (!C27287m.f83003a.m106330e()) {
            m65402y0();
        } else {
            m65398u0();
            mo65394p0();
        }
    }
}
