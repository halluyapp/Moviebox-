package com.transsion.transfer.wifi.permission;

import android.content.Intent;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.AbstractC0256u;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;
import ck.C5127x;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.TitleLayout;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.transsion.baseui.activity.BaseNewActivity;
import com.transsion.transfer.R$string;
import com.transsion.transfer.wifi.bean.PermissionState;
import com.transsion.transfer.wifi.util.C20136g;
import com.transsion.transfer.wifi.util.WifiUtils;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lv.C25685a;
import p721qv.C27132c;
import p765s6.InterfaceC27566d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J/\u0010$\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\u000e\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, m97100d2 = {"Lcom/transsion/transfer/wifi/permission/PermissionsActivity;", "Lcom/transsion/baseui/activity/BaseNewActivity;", "Llv/a;", "<init>", "()V", "", "F0", "J0", "G0", "Lcom/transsion/transfer/wifi/permission/PermissionsBean;", WebConstants.FIELD_ITEM, "I0", "(Lcom/transsion/transfer/wifi/permission/PermissionsBean;)V", "E0", "()Llv/a;", "", "f0", "()Ljava/lang/String;", "", "n0", "()Z", "isTranslucent", "isStatusDark", "l0", "m0", "k0", "p0", "retryLoadData", "onDestroy", "onResume", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "", "i", "Ljava/util/List;", "mPermissionsList", "Lcom/transsion/transfer/wifi/permission/c;", "j", "Lcom/transsion/transfer/wifi/permission/c;", "permissionsListAdapter", CampaignEx.JSON_KEY_AD_K, "Ljava/lang/String;", "currentPermissions", "Transfer_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class PermissionsActivity extends BaseNewActivity<C25685a> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private C20095c permissionsListAdapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private List mPermissionsList = new ArrayList();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String currentPermissions = "";

    /* JADX INFO: renamed from: com.transsion.transfer.wifi.permission.PermissionsActivity$a */
    public static final class C20089a extends RecyclerView.AbstractC4213l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ RecyclerView f63932a;

        C20089a(RecyclerView recyclerView) {
            this.f63932a = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            RecyclerView.Adapter adapter;
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (parent.getAdapter() != null) {
                RecyclerView recyclerView = this.f63932a;
                if (childAdapterPosition == 0 || ((adapter = recyclerView.getAdapter()) != null && adapter.getItemCount() == childAdapterPosition + 1)) {
                    outRect.top = AbstractC5776a0.m27313a(16.0f);
                } else {
                    outRect.top = AbstractC5776a0.m27313a(8.0f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.wifi.permission.PermissionsActivity$b */
    public static final class C20090b extends AbstractC0256u {
        C20090b() {
            super(true);
        }

        @Override // androidx.activity.AbstractC0256u
        public void handleOnBackPressed() {
            if (C20096d.f63935a.m83433g(PermissionsActivity.this.mPermissionsList)) {
                PermissionsActivity.this.setResult(-1);
            } else {
                PermissionsActivity.this.setResult(0);
            }
            PermissionsActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: F0 */
    private final void m83418F0() {
        setResult(-1);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    private final void m83419G0() {
        RecyclerView recyclerView = ((C25685a) getMViewBinding()).f78024c;
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(this));
        recyclerView.addItemDecoration(new C20089a(recyclerView));
        C20095c c20095c = new C20095c();
        c20095c.m36227w1(new InterfaceC27566d() { // from class: com.transsion.transfer.wifi.permission.a
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                PermissionsActivity.m83420H0(this.f63934a, baseQuickAdapter, view, i11);
            }
        });
        this.permissionsListAdapter = c20095c;
        ((C25685a) getMViewBinding()).f78024c.setAdapter(this.permissionsListAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final void m83420H0(PermissionsActivity permissionsActivity, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        if (item instanceof PermissionsBean) {
            permissionsActivity.m83421I0((PermissionsBean) item);
        }
    }

    /* JADX INFO: renamed from: I0 */
    private final void m83421I0(PermissionsBean item) {
        PermissionState state = item.getState();
        PermissionState permissionState = PermissionState.PERMISSION_REQUEST;
        if (state == permissionState || item.getState() == PermissionState.PERMISSION_GRANTED) {
            return;
        }
        C27132c c27132c = C27132c.f82242a;
        Intent intent = getIntent();
        c27132c.m105590l(intent != null ? intent.getAction() : null, item.getPermission(), permissionState);
        this.currentPermissions = item.getPermission();
        if (!TextUtils.equals("mb.permission.WIFI", item.getPermission()) && ActivityCompat.m11450j(this, item.getPermission())) {
            C20136g.m83569h(C20136g.f63999a, getClassTag() + " --> itemClick() --> 如果是不再询问，那就直接跳转到设置页面", false, 2, null);
            C20096d.f63935a.m83434h(this);
            return;
        }
        String permission = item.getPermission();
        if (Intrinsics.m97797c(permission, "mb.permission.WIFI")) {
            WifiUtils.f63989a.m83546w(this);
            return;
        }
        if (Intrinsics.m97797c(permission, "android.permission.WRITE_SETTINGS")) {
            WifiUtils.f63989a.m83545v(this);
            return;
        }
        C20096d c20096d = C20096d.f63935a;
        if (c20096d.m83432f(item.getPermission())) {
            return;
        }
        c20096d.m83435i(this, item.getPermission(), 101);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX INFO: renamed from: J0 */
    private final void m83422J0() {
        List arrayList;
        Intent intent = getIntent();
        String action = intent != null ? intent.getAction() : null;
        if (action == null) {
            arrayList = new ArrayList();
        } else {
            int iHashCode = action.hashCode();
            if (iHashCode != -726963349) {
                if (iHashCode == -616897536 && action.equals("com.transsion.transfer.wifi.util.send")) {
                    arrayList = C20096d.f63935a.m83431e();
                } else {
                    arrayList = new ArrayList();
                }
            } else if (action.equals("com.transsion.transfer.wifi.util.receive")) {
                arrayList = C20096d.f63935a.m83430c();
            } else {
                arrayList = new ArrayList();
            }
        }
        this.mPermissionsList = arrayList;
        if (!TextUtils.isEmpty(this.currentPermissions)) {
            PermissionState permissionState = C20096d.f63935a.m83432f(this.currentPermissions) ? PermissionState.PERMISSION_GRANTED : PermissionState.PERMISSION_DENIED;
            C27132c c27132c = C27132c.f82242a;
            Intent intent2 = getIntent();
            c27132c.m105590l(intent2 != null ? intent2.getAction() : null, this.currentPermissions, permissionState);
            this.currentPermissions = "";
        }
        C20095c c20095c = this.permissionsListAdapter;
        if (c20095c != null) {
            c20095c.mo36201n1(this.mPermissionsList);
        }
        Iterator it = this.mPermissionsList.iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            if (((PermissionsBean) it.next()).getState() == PermissionState.PERMISSION_DENIED) {
                z11 = false;
            }
        }
        if (z11) {
            m83418F0();
        }
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public C25685a getViewBinding() {
        C25685a c25685aM101055c = C25685a.m101055c(getLayoutInflater());
        Intrinsics.m97801g(c25685aM101055c, "inflate(...)");
        return c25685aM101055c;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: f0 */
    public String mo65386f0() {
        return "";
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public boolean isStatusDark() {
        return !C5127x.f17620a.m23969a();
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
        TitleLayout titleLayout = ((C25685a) getMViewBinding()).f78025d;
        String string = getResources().getString(R$string.transfer_wifi_preparations);
        Intrinsics.m97801g(string, "getString(...)");
        titleLayout.setTitleText(string);
        m83419G0();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: m0 */
    public void mo65391m0() {
        getOnBackPressedDispatcher().m942i(this, new C20090b());
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: n0 */
    public boolean mo65392n0() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        C27132c c27132c = C27132c.f82242a;
        Intent intent = getIntent();
        c27132c.m105591m(intent != null ? intent.getAction() : null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.m97802h(permissions, "permissions");
        Intrinsics.m97802h(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 101) {
            if ((grantResults.length == 0) || grantResults[0] != 0) {
                return;
            }
            if (C20096d.f63935a.m83433g(this.mPermissionsList)) {
                m83418F0();
            } else {
                setResult(0);
            }
        }
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity, com.transsion.baseui.activity.BaseMusicFloatActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m83422J0();
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    /* JADX INFO: renamed from: p0 */
    public void mo65394p0() {
    }

    @Override // com.transsion.baseui.activity.BaseNewActivity
    public void retryLoadData() {
    }
}
