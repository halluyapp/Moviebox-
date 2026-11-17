package com.transsion.member.dialog;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.p1004lifecycle.AbstractC3226v;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baseui.dialog.BaseMemberLoadingDialog;
import com.transsion.member.C15777a;
import com.transsion.member.R$string;
import com.transsion.memberapi.MemberCheckResult;
import com.transsion.memberapi.MemberSceneType;
import com.transsion.memberapi.OpType;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import p352dn.InterfaceC22997a;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m97100d2 = {"Lcom/transsion/member/dialog/CheckMemberRightsLoadingDialog;", "Lcom/transsion/baseui/dialog/BaseMemberLoadingDialog;", "<init>", "()V", "", "t0", "Lcom/transsion/memberapi/MemberCheckResult;", "it", "s0", "(Lcom/transsion/memberapi/MemberCheckResult;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ldn/a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "u0", "(Ldn/a;)V", "Lcom/transsion/memberapi/MemberSceneType;", "sceneType", "", "resolution", "v0", "(Lcom/transsion/memberapi/MemberSceneType;Ljava/lang/Integer;)V", "c", "Ldn/a;", "mListener", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/memberapi/MemberSceneType;", "mSceneType", "e", "Ljava/lang/Integer;", "mResolution", "Member_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class CheckMemberRightsLoadingDialog extends BaseMemberLoadingDialog {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private InterfaceC22997a mListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private MemberSceneType mSceneType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Integer mResolution;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public final void m69983s0(MemberCheckResult it) {
        Resources resources;
        C15777a.f54210a.m69947a(getClassTag() + " --> checkMember() --> it = " + it);
        String string = null;
        if (it == null) {
            C28951b.a aVar = C28951b.f88586a;
            Context context = getContext();
            if (context != null && (resources = context.getResources()) != null) {
                string = resources.getString(R$string.co_network_error);
            }
            aVar.m111455e(string);
            InterfaceC22997a interfaceC22997a = this.mListener;
            if (interfaceC22997a != null) {
                interfaceC22997a.onFail("权益校验接口请求失败");
            }
            if (!isAdded() || isDetached()) {
                return;
            }
            dismissAllowingStateLoss();
            return;
        }
        if (Intrinsics.m97797c(it.isPassed(), Boolean.TRUE)) {
            InterfaceC22997a interfaceC22997a2 = this.mListener;
            if (interfaceC22997a2 != null) {
                interfaceC22997a2.mo66169e();
            }
        } else {
            String interceptType = it.getInterceptType();
            if (Intrinsics.m97797c(interceptType, OpType.OP_INSTALL.getValue())) {
                InterfaceC22997a interfaceC22997a3 = this.mListener;
                if (interfaceC22997a3 != null) {
                    interfaceC22997a3.mo66168d(it);
                }
            } else if (Intrinsics.m97797c(interceptType, OpType.OP_AD.getValue())) {
                InterfaceC22997a interfaceC22997a4 = this.mListener;
                if (interfaceC22997a4 != null) {
                    interfaceC22997a4.mo66166b(it);
                }
            } else if (Intrinsics.m97797c(interceptType, OpType.OP_VIP.getValue())) {
                InterfaceC22997a interfaceC22997a5 = this.mListener;
                if (interfaceC22997a5 != null) {
                    interfaceC22997a5.mo66165a(it);
                }
            } else if (Intrinsics.m97797c(interceptType, OpType.LOTTERY_DRAW.getValue())) {
                InterfaceC22997a interfaceC22997a6 = this.mListener;
                if (interfaceC22997a6 != null) {
                    interfaceC22997a6.mo66167c(it);
                }
            } else {
                InterfaceC22997a interfaceC22997a7 = this.mListener;
                if (interfaceC22997a7 != null) {
                    interfaceC22997a7.mo66170f(it);
                }
            }
        }
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new CheckMemberRightsLoadingDialog$analysis$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: t0 */
    private final void m69984t0() {
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new CheckMemberRightsLoadingDialog$checkMember$1(this, null), 3, null);
    }

    @Override // com.transsion.baseui.dialog.BaseMemberLoadingDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C15777a.f54210a.m69947a(getClassTag() + " --> onCreate() --> 会员权益校验 --> 中间过度弹窗 --> 请求接口判断是否需要拦截");
    }

    @Override // com.transsion.baseui.dialog.BaseMemberLoadingDialog, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m69984t0();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m69985u0(InterfaceC22997a listener) {
        this.mListener = listener;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m69986v0(MemberSceneType sceneType, Integer resolution) {
        this.mSceneType = sceneType;
        this.mResolution = resolution;
    }
}
