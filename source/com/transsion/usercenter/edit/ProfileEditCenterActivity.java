package com.transsion.usercenter.edit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.FragmentManager;
import ck.C5127x;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.TitleLayout;
import com.p282tn.lib.widget.R$color;
import com.transsion.baselib.kids.KidsProfile;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.publish.R$string;
import com.transsion.usercenter.R$id;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import org.mvel2.ast.ASTNode;
import p585lw.C25714j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ)\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m97100d2 = {"Lcom/transsion/usercenter/edit/ProfileEditCenterActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Llw/j;", "<init>", "()V", "", "initView", "initData", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "isTranslucent", "()Z", "isStatusDark", "isChangeStatusBar", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onBackPressed", "d0", "()Llw/j;", "Lcom/transsion/usercenter/edit/ProfileEditCenterFragment;", "a", "Lcom/transsion/usercenter/edit/ProfileEditCenterFragment;", "profileEditFragment", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ProfileEditCenterActivity extends BaseActivity<C25714j> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private ProfileEditCenterFragment profileEditFragment;

    /* JADX INFO: renamed from: com.transsion.usercenter.edit.ProfileEditCenterActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m84607a(Context context, UserInfo userInfo) {
            Intrinsics.m97802h(context, "context");
            Intent intent = new Intent(context, (Class<?>) ProfileEditCenterActivity.class);
            if (userInfo != null) {
                intent.putExtra("user", userInfo);
            }
            intent.setFlags(ASTNode.DEOP);
            context.startActivity(intent);
        }

        /* JADX INFO: renamed from: b */
        public final void m84608b(Context context, KidsProfile kidsProfile) {
            Intrinsics.m97802h(context, "context");
            Intrinsics.m97802h(kidsProfile, "kidsProfile");
            Intent intent = new Intent(context, (Class<?>) ProfileEditCenterActivity.class);
            intent.putExtra("kidsProfile", kidsProfile);
            intent.setFlags(ASTNode.DEOP);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m84604e0(ProfileEditCenterActivity profileEditCenterActivity, View view) {
        ProfileEditCenterFragment profileEditCenterFragment = profileEditCenterActivity.profileEditFragment;
        if (profileEditCenterFragment == null) {
            Intrinsics.m97819y("profileEditFragment");
            profileEditCenterFragment = null;
        }
        profileEditCenterFragment.checkBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final void m84605f0(ProfileEditCenterActivity profileEditCenterActivity, View view) {
        ProfileEditCenterFragment profileEditCenterFragment = profileEditCenterActivity.profileEditFragment;
        if (profileEditCenterFragment == null) {
            Intrinsics.m97819y("profileEditFragment");
            profileEditCenterFragment = null;
        }
        profileEditCenterFragment.confirmSubmit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        Serializable serializableExtra = getIntent().getSerializableExtra("user");
        ProfileEditCenterFragment profileEditCenterFragment = null;
        UserInfo userInfo = (serializableExtra == null || !(serializableExtra instanceof UserInfo)) ? null : (UserInfo) serializableExtra;
        KidsProfile kidsProfile = (KidsProfile) getIntent().getParcelableExtra("kidsProfile");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
        AbstractC3168w abstractC3168wM14557p = supportFragmentManager.m14557p();
        Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction(...)");
        ProfileEditCenterFragment profileEditCenterFragmentM84624a = ProfileEditCenterFragment.INSTANCE.m84624a(userInfo, kidsProfile);
        this.profileEditFragment = profileEditCenterFragmentM84624a;
        if (profileEditCenterFragmentM84624a == null) {
            Intrinsics.m97819y("profileEditFragment");
        }
        int i11 = R$id.fl_content;
        ProfileEditCenterFragment profileEditCenterFragment2 = this.profileEditFragment;
        if (profileEditCenterFragment2 == null) {
            Intrinsics.m97819y("profileEditFragment");
        } else {
            profileEditCenterFragment = profileEditCenterFragment2;
        }
        abstractC3168wM14557p.m14805b(i11, profileEditCenterFragment);
        abstractC3168wM14557p.mo14671j();
        TitleLayout titleLayout = ((C25714j) getMViewBinding()).f78211d;
        titleLayout.setLeftOnclick(new View.OnClickListener() { // from class: com.transsion.usercenter.edit.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileEditCenterActivity.m84604e0(this.f64773a, view);
            }
        });
        String string = getString(R$string.profile_empty_done);
        Intrinsics.m97801g(string, "getString(...)");
        titleLayout.setRightView(string, AbstractC2397b.getColor(titleLayout.getContext(), R$color.main), new View.OnClickListener() { // from class: com.transsion.usercenter.edit.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileEditCenterActivity.m84605f0(this.f64774a, view);
            }
        });
        String string2 = getString(com.transsion.usercenter.R$string.profile_edit_profile);
        Intrinsics.m97801g(string2, "getString(...)");
        titleLayout.setTitleText(string2);
        ProgressBar loadView = ((C25714j) getMViewBinding()).f78210c;
        Intrinsics.m97801g(loadView, "loadView");
        AbstractC26006c.m102054g(loadView);
    }

    private final void initView() {
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public C25714j getViewBinding() {
        C25714j c25714jM101155c = C25714j.m101155c(getLayoutInflater());
        Intrinsics.m97801g(c25714jM101155c, "inflate(...)");
        return c25714jM101155c;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isChangeStatusBar() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return !C5127x.f17620a.m23969a();
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ProfileEditCenterFragment profileEditCenterFragment = this.profileEditFragment;
        if (profileEditCenterFragment == null) {
            Intrinsics.m97819y("profileEditFragment");
            profileEditCenterFragment = null;
        }
        profileEditCenterFragment.checkEditSubmit(true);
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
    }
}
