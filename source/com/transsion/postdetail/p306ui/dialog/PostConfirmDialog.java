package com.transsion.postdetail.p306ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.material.bottomsheet.DialogC10016c;
import com.mbridge.msdk.MBridgeConstans;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.baseui.util.C14555a;
import com.transsion.postdetail.R$layout;
import com.transsion.postdetail.R$style;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p844vo.C28152h;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m97100d2 = {"Lcom/transsion/postdetail/ui/dialog/PostConfirmDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Lcom/transsion/postdetail/ui/dialog/PostConfirmDialog$a;", "c", "Lcom/transsion/postdetail/ui/dialog/PostConfirmDialog$a;", "getCallback", "()Lcom/transsion/postdetail/ui/dialog/PostConfirmDialog$a;", "r0", "(Lcom/transsion/postdetail/ui/dialog/PostConfirmDialog$a;)V", "callback", "a", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class PostConfirmDialog extends BaseDialog {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private InterfaceC16991a callback;

    /* JADX INFO: renamed from: com.transsion.postdetail.ui.dialog.PostConfirmDialog$a */
    public interface InterfaceC16991a {
        /* JADX INFO: renamed from: a */
        void mo73953a();
    }

    public PostConfirmDialog() {
        super(R$layout.dialog_post_confirm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final void m73950p0(PostConfirmDialog postConfirmDialog, View view) {
        InterfaceC16991a interfaceC16991a = postConfirmDialog.callback;
        if (interfaceC16991a != null) {
            interfaceC16991a.mo73953a();
        }
        postConfirmDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m73951q0(PostConfirmDialog postConfirmDialog, View view) {
        postConfirmDialog.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.BottomDialogTheme);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        DialogC10016c dialogC10016c = new DialogC10016c(contextRequireContext, getTheme());
        Window window = dialogC10016c.getWindow();
        if (window != null) {
            window.setWindowAnimations(com.transsion.baseui.R$style.bottom_dialog_animations);
        }
        Window window2 = dialogC10016c.getWindow();
        if (window2 != null) {
            window2.setGravity(80);
            window2.setDimAmount(0.5f);
            WindowManager.LayoutParams attributes = window2.getAttributes();
            if (attributes == null) {
                attributes = new WindowManager.LayoutParams();
            }
            attributes.width = C14555a.f51098a.m65668b(contextRequireContext);
            attributes.height = -2;
            window2.setBackgroundDrawable(null);
            window2.setAttributes(attributes);
        }
        return dialogC10016c;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C28152h c28152hM109312a = C28152h.m109312a(view);
        Intrinsics.m97801g(c28152hM109312a, "bind(...)");
        c28152hM109312a.f86446c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.dialog.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PostConfirmDialog.m73950p0(this.f57053a, view2);
            }
        });
        c28152hM109312a.f86445b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.dialog.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PostConfirmDialog.m73951q0(this.f57054a, view2);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final void m73952r0(InterfaceC16991a interfaceC16991a) {
        this.callback = interfaceC16991a;
    }
}
