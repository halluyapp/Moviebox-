package com.transsion.transfer.wifi.p320ui;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.p1004lifecycle.AbstractC3226v;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$style;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.transfer.R$layout;
import com.transsion.transfer.R$string;
import com.transsion.transfer.wifi.qrcode.QrCodeUtil;
import com.transsion.transfer.wifi.util.C20136g;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25149n0;
import lv.C25689e;
import p721qv.C27132c;
import p754rv.C27385a;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m97100d2 = {"Lcom/transsion/transfer/wifi/ui/ShareMbApkDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lrv/a;", "wifiInfoModel", "r0", "(Lrv/a;)V", "Llv/e;", "c", "Llv/e;", "bind", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lrv/a;", "mWifiInfoModel", "Transfer_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class ShareMbApkDialog extends BaseDialog {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C25689e bind;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C27385a mWifiInfoModel;

    /* JADX INFO: renamed from: com.transsion.transfer.wifi.ui.ShareMbApkDialog$onViewCreated$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.transfer.wifi.ui.ShareMbApkDialog$onViewCreated$1", m97637f = "ShareMbApkDialog.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.AD_OPTIONAL_DOWNLOAD_DURATION_MS_VALUE}, m97639m = "invokeSuspend")
    static final class C200981 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        int label;

        C200981(Continuation<? super C200981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ShareMbApkDialog.this.new C200981(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C200981) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0053  */
        /* JADX WARN: Instruction removed from duplicated block: B:20:0x0053, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Unit unit;
            ShapeableImageView shapeableImageView;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                QrCodeUtil qrCodeUtil = QrCodeUtil.f63936a;
                String strM83439b = qrCodeUtil.m83439b(ShareMbApkDialog.this.mWifiInfoModel);
                int iM27313a = AbstractC5776a0.m27313a(240.0f);
                int iM27313a2 = AbstractC5776a0.m27313a(240.0f);
                this.label = 1;
                obj = qrCodeUtil.m83442f(strM83439b, iM27313a, iM27313a2, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap == null) {
                ShareMbApkDialog shareMbApkDialog = ShareMbApkDialog.this;
                C20136g.m83567d(C20136g.f63999a, shareMbApkDialog.getClassTag() + " --> createSuccess() --> syncEncodeQRCode() --> 创建二维码失败了", false, 2, null);
                C28951b.f88586a.m111455e(shareMbApkDialog.getResources().getString(R$string.transfer_fail));
                shareMbApkDialog.dismissAllowingStateLoss();
            } else {
                C25689e c25689e = ShareMbApkDialog.this.bind;
                if (c25689e == null || (shapeableImageView = c25689e.f78063c) == null) {
                    unit = null;
                } else {
                    shapeableImageView.setImageBitmap(bitmap);
                    unit = Unit.f75682a;
                }
                if (unit == null) {
                    ShareMbApkDialog shareMbApkDialog2 = ShareMbApkDialog.this;
                    C20136g.m83567d(C20136g.f63999a, shareMbApkDialog2.getClassTag() + " --> createSuccess() --> syncEncodeQRCode() --> 创建二维码失败了", false, 2, null);
                    C28951b.f88586a.m111455e(shareMbApkDialog2.getResources().getString(R$string.transfer_fail));
                    shareMbApkDialog2.dismissAllowingStateLoss();
                }
            }
            return Unit.f75682a;
        }
    }

    public ShareMbApkDialog() {
        super(R$layout.dialog_share_mb_apk_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m83447q0(ShareMbApkDialog shareMbApkDialog, View view) {
        shareMbApkDialog.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.center_DialogStyle);
        C20136g.m83566b(C20136g.f63999a, getClassTag() + " --> onCreate() --> 分享弹窗", false, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AppCompatImageView appCompatImageView;
        Window window;
        Window window2;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -2);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setGravity(17);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setCancelable(false);
        }
        this.bind = C25689e.m101070a(view);
        AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new C200981(null), 3, null);
        C27132c.f82242a.m105592n();
        C25689e c25689e = this.bind;
        if (c25689e == null || (appCompatImageView = c25689e.f78062b) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.transfer.wifi.ui.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ShareMbApkDialog.m83447q0(this.f63963a, view2);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final void m83448r0(C27385a wifiInfoModel) {
        this.mWifiInfoModel = wifiInfoModel;
    }
}
