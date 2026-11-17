package com.transsion.member.dialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0248a;
import com.cloud.tmc.integration.event.EventConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$style;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.member.C15777a;
import com.transsion.member.MemberActivity;
import com.transsion.memberapi.MemberSource;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p352dn.InterfaceC22999c;
import p393f.C23284j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010,\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010(0(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006/"}, m97100d2 = {"Lcom/transsion/member/dialog/MemberMiddleStateDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "", "o0", "()Z", "Lcom/transsion/memberapi/MemberSource;", "memberSource", "q0", "(Lcom/transsion/memberapi/MemberSource;)V", "", "sceneId", "r0", "(Ljava/lang/String;)V", "Ldn/c;", "callback", "p0", "(Ldn/c;)V", "c", "Z", "isPayMemberSuccess", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/memberapi/MemberSource;", EventConstants.KEY_SOURCE, "e", "Ljava/lang/String;", "f", "Ldn/c;", "mCallback", "Landroidx/activity/result/b;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "g", "Landroidx/activity/result/b;", "startActivity", "h", "a", "Member_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class MemberMiddleStateDialog extends BaseDialog {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i */
    public static final int f54262i = 8;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isPayMemberSuccess;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private MemberSource source;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String sceneId = "";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private InterfaceC22999c mCallback;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AbstractC0249b startActivity;

    /* JADX INFO: renamed from: com.transsion.member.dialog.MemberMiddleStateDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final MemberMiddleStateDialog m70018a(boolean z11) {
            MemberMiddleStateDialog memberMiddleStateDialog = new MemberMiddleStateDialog();
            Bundle bundle = new Bundle();
            bundle.putBoolean("key_scrolltotask", z11);
            memberMiddleStateDialog.setArguments(bundle);
            return memberMiddleStateDialog;
        }
    }

    public MemberMiddleStateDialog() {
        AbstractC0249b abstractC0249bRegisterForActivityResult = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.member.dialog.i
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                MemberMiddleStateDialog.m70013s0(this.f54307a, (ActivityResult) obj);
            }
        });
        Intrinsics.m97801g(abstractC0249bRegisterForActivityResult, "registerForActivityResult(...)");
        this.startActivity = abstractC0249bRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m70013s0(MemberMiddleStateDialog memberMiddleStateDialog, ActivityResult it) {
        Intrinsics.m97802h(it, "it");
        memberMiddleStateDialog.isPayMemberSuccess = it.getResultCode() == -1;
        C15777a.f54210a.m69947a(memberMiddleStateDialog.getClassTag() + " --> startActivity --> registerForActivityResult() --> isPayMemberSuccess = " + memberMiddleStateDialog.isPayMemberSuccess);
        if (memberMiddleStateDialog.isAdded()) {
            memberMiddleStateDialog.dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m70014o0() {
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.center_DialogStyle);
        if (m70014o0()) {
            Navigator navigatorM61773c = TheRouter.m61773c("/rewards/center");
            MemberSource memberSource = this.source;
            Navigator.m61845x(navigatorM61773c.m61857K(EventConstants.KEY_SOURCE, memberSource != null ? memberSource.getValue() : null).m61857K("scene_id", this.sceneId), null, null, 3, null);
            return;
        }
        Intent intent = new Intent(requireContext(), (Class<?>) MemberActivity.class);
        MemberSource memberSource2 = this.source;
        intent.putExtra(EventConstants.KEY_SOURCE, memberSource2 != null ? memberSource2.getValue() : null);
        intent.putExtra("scene_id", this.sceneId);
        Bundle arguments = getArguments();
        intent.putExtra("extra_member_scroll_bottom", arguments != null ? Boolean.valueOf(arguments.getBoolean("key_scrolltotask")) : null);
        this.startActivity.m999a(intent);
    }

    @Override // com.transsion.baseui.dialog.BaseDialog, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.m97802h(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.isPayMemberSuccess) {
            InterfaceC22999c interfaceC22999c = this.mCallback;
            if (interfaceC22999c != null) {
                interfaceC22999c.onSuccess();
                return;
            }
            return;
        }
        InterfaceC22999c interfaceC22999c2 = this.mCallback;
        if (interfaceC22999c2 != null) {
            interfaceC22999c2.mo66056a();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m70015p0(InterfaceC22999c callback) {
        this.mCallback = callback;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m70016q0(MemberSource memberSource) {
        this.source = memberSource;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m70017r0(String sceneId) {
        Intrinsics.m97802h(sceneId, "sceneId");
        this.sceneId = sceneId;
    }
}
