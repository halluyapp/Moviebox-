package com.transsion.player.longvideo.p302ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.gyf.immersionbar.BarHide;
import com.gyf.immersionbar.ImmersionBar;
import com.mbridge.msdk.MBridgeConstans;
import com.p282tn.lib.view.SwitchButton;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.R$layout;
import com.transsnet.downloader.R$style;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p723qx.InterfaceC27138e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m97100d2 = {"Lcom/transsion/player/longvideo/ui/dialog/PlayerSettingDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "", "isChecked", "", "p0", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class PlayerSettingDialog extends BaseDialog {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final void m72327o0(PlayerSettingDialog playerSettingDialog, SwitchButton switchButton, boolean z11) {
        C14496b.f50966a.m65344b().putBoolean("k_pip_enable", z11);
        playerSettingDialog.m72328p0(z11);
    }

    /* JADX INFO: renamed from: p0 */
    private final void m72328p0(boolean isChecked) {
        Context context = getContext();
        if (context instanceof FragmentActivity) {
            InterfaceC27138e.a aVar = InterfaceC27138e.f82251a;
            if (!aVar.m105606b().mo86573h() || Build.VERSION.SDK_INT < 31) {
                return;
            }
            InterfaceC27138e.b.m105609c(aVar.m105606b(), (FragmentActivity) context, false, isChecked, null, 8, null);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.DownloadBottomDialogTheme);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.m97802h(inflater, "inflater");
        return inflater.inflate(R$layout.dialog_player_setting_layout, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Window window;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(AbstractC26006c.m102053f() ? com.p282tn.lib.widget.R$style.ActionSheetDialogLeft : com.p282tn.lib.widget.R$style.ActionSheetDialogRight);
            window.setGravity(AbstractC26006c.m102053f() ? GravityCompat.START : GravityCompat.END);
            window.setDimAmount(0.0f);
            window.setBackgroundDrawable(null);
            window.setLayout(AbstractC5776a0.m27313a(260.0f), -1);
            ImmersionBar immersionBarWith = ImmersionBar.with((DialogFragment) this);
            immersionBarWith.hideBar(BarHide.FLAG_HIDE_BAR);
            immersionBarWith.init();
        }
        SwitchButton switchButton = (SwitchButton) view.findViewById(R$id.switchBtn);
        switchButton.setChecked(C14496b.f50966a.m65344b().getBoolean("k_pip_enable", true));
        switchButton.setOnCheckedChangeListener(new SwitchButton.InterfaceC13732d() { // from class: com.transsion.player.longvideo.ui.dialog.v
            @Override // com.p282tn.lib.view.SwitchButton.InterfaceC13732d
            /* JADX INFO: renamed from: a */
            public final void mo62077a(SwitchButton switchButton2, boolean z11) {
                PlayerSettingDialog.m72327o0(this.f55835a, switchButton2, z11);
            }
        });
    }
}
