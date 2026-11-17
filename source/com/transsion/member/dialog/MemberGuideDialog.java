package com.transsion.member.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bn.C4854c;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.cloud.tmc.integration.event.EventConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$style;
import com.therouter.TheRouter;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.member.C15777a;
import com.transsion.member.R$layout;
import com.transsion.memberapi.MemberCheckResult;
import com.transsion.memberapi.MemberSource;
import com.transsion.memberapi.R$string;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p352dn.InterfaceC22998b;
import p352dn.InterfaceC22999c;
import p710qk.InterfaceC27085d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 52\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ!\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, m97100d2 = {"Lcom/transsion/member/dialog/MemberGuideDialog;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Lcom/transsion/memberapi/MemberCheckResult;", "memberCheckResult", "", "q0", "(Lcom/transsion/memberapi/MemberCheckResult;)Ljava/lang/String;", "", "initView", "s0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "Ldn/c;", "callback", "r0", "(Ldn/c;)V", "Lcom/transsion/memberapi/MemberSource;", "memberSource", "w0", "(Lcom/transsion/memberapi/MemberSource;)V", "v0", "(Lcom/transsion/memberapi/MemberCheckResult;)V", "c", "Lcom/transsion/memberapi/MemberCheckResult;", "mMemberCheckResult", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ldn/c;", "mCallback", "", "e", "Z", "isPayMemberSuccess", "Lbn/c;", "f", "Lbn/c;", "bind", "g", "Lcom/transsion/memberapi/MemberSource;", EventConstants.KEY_SOURCE, "h", "a", "Member_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class MemberGuideDialog extends BaseDialog {

    /* JADX INFO: renamed from: i */
    public static final int f54254i = 8;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private MemberCheckResult mMemberCheckResult;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private InterfaceC22999c mCallback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isPayMemberSuccess;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private C4854c bind;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private MemberSource source;

    /* JADX INFO: renamed from: com.transsion.member.dialog.MemberGuideDialog$b */
    public static final class C15800b extends RecyclerView.AbstractC4213l {
        C15800b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = parent.getAdapter();
            if (adapter != null) {
                if (childAdapterPosition == 0) {
                    outRect.top = AbstractC5776a0.m27313a(24.0f);
                    outRect.bottom = AbstractC5776a0.m27313a(16.0f);
                } else if (childAdapterPosition != adapter.getItemCount() - 1) {
                    outRect.bottom = AbstractC5776a0.m27313a(16.0f);
                } else if (childAdapterPosition == adapter.getItemCount() - 1) {
                    outRect.bottom = AbstractC5776a0.m27313a(24.0f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.member.dialog.MemberGuideDialog$c */
    public static final class C15801c implements InterfaceC22999c {
        C15801c() {
        }

        @Override // p352dn.InterfaceC22999c
        /* JADX INFO: renamed from: a */
        public void mo66056a() {
            MemberGuideDialog.this.isPayMemberSuccess = false;
            C15777a.f54210a.m69947a(MemberGuideDialog.this.getClassTag() + " --> startMemberPage --> onFailed() --> isPayMemberSuccess = false");
            if (!MemberGuideDialog.this.isAdded() || MemberGuideDialog.this.isDetached()) {
                return;
            }
            MemberGuideDialog.this.dismissAllowingStateLoss();
        }

        @Override // p352dn.InterfaceC22999c
        public void onSuccess() {
            MemberGuideDialog.this.isPayMemberSuccess = true;
            C15777a.f54210a.m69947a(MemberGuideDialog.this.getClassTag() + " --> startMemberPage --> onSuccess() --> isPayMemberSuccess = true");
            if (!MemberGuideDialog.this.isAdded() || MemberGuideDialog.this.isDetached()) {
                return;
            }
            MemberGuideDialog.this.dismissAllowingStateLoss();
        }
    }

    public MemberGuideDialog() {
        super(R$layout.dialog_fragment_member_guide_layout);
    }

    private final void initView() {
        TextView textView;
        TextView textView2;
        RecyclerView recyclerView;
        TextView textView3;
        String str = m70005q0(this.mMemberCheckResult) + getString(R$string.member_guide_dialog_get_per);
        C4854c c4854c = this.bind;
        if (c4854c != null && (textView3 = c4854c.f17182i) != null) {
            textView3.setText(str);
        }
        C4854c c4854c2 = this.bind;
        if (c4854c2 != null && (recyclerView = c4854c2.f17180g) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            MemberCheckResult memberCheckResult = this.mMemberCheckResult;
            recyclerView.setAdapter(new C15817h(memberCheckResult != null ? memberCheckResult.getMemberRights() : null));
            recyclerView.addItemDecoration(new C15800b());
        }
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        boolean zMo69850d = interfaceC22998b != null ? interfaceC22998b.mo69850d() : false;
        C4854c c4854c3 = this.bind;
        if (c4854c3 != null && (textView2 = c4854c3.f17182i) != null) {
            textView2.setVisibility(zMo69850d ? 0 : 8);
        }
        C4854c c4854c4 = this.bind;
        if (c4854c4 == null || (textView = c4854c4.f17183j) == null) {
            return;
        }
        textView.setText(textView.getResources().getString(com.transsion.member.R$string.member_guide_dialog_title));
    }

    /* JADX INFO: renamed from: q0 */
    private final String m70005q0(MemberCheckResult memberCheckResult) {
        return (memberCheckResult != null ? memberCheckResult.getMemberPrice() : null) + " " + (memberCheckResult != null ? memberCheckResult.getCurrency() : null) + " ";
    }

    /* JADX INFO: renamed from: s0 */
    private final void m70006s0() {
        AppCompatImageView appCompatImageView;
        View view;
        C4854c c4854c = this.bind;
        if (c4854c != null && (view = c4854c.f17184k) != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.member.dialog.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MemberGuideDialog.m70007t0(this.f54303a, view2);
                }
            });
        }
        C4854c c4854c2 = this.bind;
        if (c4854c2 == null || (appCompatImageView = c4854c2.f17178e) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.member.dialog.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MemberGuideDialog.m70008u0(this.f54304a, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m70007t0(MemberGuideDialog memberGuideDialog, View view) {
        InterfaceC27085d interfaceC27085d = (InterfaceC27085d) TheRouter.m61774d(InterfaceC27085d.class, new Object[0]);
        if (interfaceC27085d != null) {
            interfaceC27085d.mo100932d();
        }
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            InterfaceC22998b.a.m91587c(interfaceC22998b, memberGuideDialog.getActivity(), memberGuideDialog.source, memberGuideDialog.new C15801c(), false, null, 24, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m70008u0(MemberGuideDialog memberGuideDialog, View view) {
        InterfaceC27085d interfaceC27085d = (InterfaceC27085d) TheRouter.m61774d(InterfaceC27085d.class, new Object[0]);
        if (interfaceC27085d != null) {
            interfaceC27085d.mo100929a();
        }
        if (!memberGuideDialog.isAdded() || memberGuideDialog.isDetached()) {
            return;
        }
        memberGuideDialog.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        MemberSource memberSource;
        MemberCheckResult memberCheckResult;
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.center_DialogStyle);
        C15777a.f54210a.m69947a(getClassTag() + " --> onCreate()");
        if (savedInstanceState != null && (memberCheckResult = (MemberCheckResult) savedInstanceState.getParcelable("mMemberCheckResult")) != null) {
            this.mMemberCheckResult = memberCheckResult;
        }
        if (savedInstanceState == null || (memberSource = (MemberSource) savedInstanceState.getParcelable(EventConstants.KEY_SOURCE)) == null) {
            return;
        }
        this.source = memberSource;
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

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.m97802h(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("mMemberCheckResult", this.mMemberCheckResult);
        outState.putParcelable(EventConstants.KEY_SOURCE, this.source);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
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
            dialog3.setCancelable(true);
        }
        Dialog dialog4 = getDialog();
        if (dialog4 != null) {
            dialog4.setCanceledOnTouchOutside(false);
        }
        InterfaceC27085d interfaceC27085d = (InterfaceC27085d) TheRouter.m61774d(InterfaceC27085d.class, new Object[0]);
        if (interfaceC27085d != null) {
            interfaceC27085d.mo100931c();
        }
        this.bind = C4854c.m23357a(view);
        initView();
        m70006s0();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m70009r0(InterfaceC22999c callback) {
        Intrinsics.m97802h(callback, "callback");
        this.mCallback = callback;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m70010v0(MemberCheckResult memberCheckResult) {
        this.mMemberCheckResult = memberCheckResult;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m70011w0(MemberSource memberSource) {
        this.source = memberSource;
    }
}
