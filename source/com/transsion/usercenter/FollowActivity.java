package com.transsion.usercenter;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.TitleLayout;
import com.p282tn.lib.widget.toast.core.C13806h;
import com.transsion.baseui.activity.BaseActivity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;
import p585lw.C25697b;
import p765s6.InterfaceC27564b;
import p765s6.InterfaceC27568f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, m97100d2 = {"Lcom/transsion/usercenter/FollowActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Llw/b;", "<init>", "()V", "", "i0", "l0", "p0", "n0", "", "", "g0", "()Ljava/util/List;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "h0", "()Llw/b;", "", "isTranslucent", "()Z", "", "a", "I", "followType", "Lcom/transsion/usercenter/g;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/usercenter/g;", "followAdapter", "c", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class FollowActivity extends BaseActivity<C25697b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int followType = 1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C20472g followAdapter;

    /* JADX INFO: renamed from: g0 */
    private final List m84555g0() {
        return CollectionsKt.m97511q("A", "B", "C", "D", "E");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    private final void m84556i0() {
        this.followAdapter = new C20472g(this.followType);
        RecyclerView recyclerView = ((C25697b) getMViewBinding()).f78099b;
        C20472g c20472g = this.followAdapter;
        C20472g c20472g2 = null;
        if (c20472g == null) {
            Intrinsics.m97819y("followAdapter");
            c20472g = null;
        }
        recyclerView.setAdapter(c20472g);
        ((C25697b) getMViewBinding()).f78099b.setLayoutManager(new LinearLayoutManager(this));
        C20472g c20472g3 = this.followAdapter;
        if (c20472g3 == null) {
            Intrinsics.m97819y("followAdapter");
            c20472g3 = null;
        }
        c20472g3.m36193l(R$id.btnFollow);
        C20472g c20472g4 = this.followAdapter;
        if (c20472g4 == null) {
            Intrinsics.m97819y("followAdapter");
        } else {
            c20472g2 = c20472g4;
        }
        c20472g2.m36216s1(new InterfaceC27564b() { // from class: com.transsion.usercenter.b
            @Override // p765s6.InterfaceC27564b
            /* JADX INFO: renamed from: a */
            public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                FollowActivity.m84557j0(baseQuickAdapter, view, i11);
            }
        });
        ((C25697b) getMViewBinding()).f78100c.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: com.transsion.usercenter.c
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
            /* JADX INFO: renamed from: a */
            public final void mo21823a() {
                FollowActivity.m84558k0(this.f64764a);
            }
        });
        m84559l0();
        ((C25697b) getMViewBinding()).f78100c.setRefreshing(true);
        m84561n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final void m84557j0(BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        C13806h.f49015a.m62316a("点击了第" + i11 + "个");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final void m84558k0(FollowActivity followActivity) {
        followActivity.m84561n0();
    }

    /* JADX INFO: renamed from: l0 */
    private final void m84559l0() {
        C20472g c20472g = this.followAdapter;
        C20472g c20472g2 = null;
        if (c20472g == null) {
            Intrinsics.m97819y("followAdapter");
            c20472g = null;
        }
        c20472g.m36186h0().m108673z(true);
        C20472g c20472g3 = this.followAdapter;
        if (c20472g3 == null) {
            Intrinsics.m97819y("followAdapter");
            c20472g3 = null;
        }
        c20472g3.m36186h0().m108672y(true);
        C20472g c20472g4 = this.followAdapter;
        if (c20472g4 == null) {
            Intrinsics.m97819y("followAdapter");
            c20472g4 = null;
        }
        c20472g4.m36186h0().m108654B(true);
        C20472g c20472g5 = this.followAdapter;
        if (c20472g5 == null) {
            Intrinsics.m97819y("followAdapter");
            c20472g5 = null;
        }
        c20472g5.m36186h0().m108653A(false);
        C20472g c20472g6 = this.followAdapter;
        if (c20472g6 == null) {
            Intrinsics.m97819y("followAdapter");
            c20472g6 = null;
        }
        c20472g6.m36186h0().m108666r();
        C20472g c20472g7 = this.followAdapter;
        if (c20472g7 == null) {
            Intrinsics.m97819y("followAdapter");
            c20472g7 = null;
        }
        c20472g7.m36186h0().m108657E(1);
        C20472g c20472g8 = this.followAdapter;
        if (c20472g8 == null) {
            Intrinsics.m97819y("followAdapter");
        } else {
            c20472g2 = c20472g8;
        }
        c20472g2.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.usercenter.e
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                FollowActivity.m84560m0(this.f64766a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final void m84560m0(FollowActivity followActivity) {
        followActivity.m84563p0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    private final void m84561n0() {
        ((C25697b) getMViewBinding()).getRoot().postDelayed(new Runnable() { // from class: com.transsion.usercenter.d
            @Override // java.lang.Runnable
            public final void run() {
                FollowActivity.m84562o0(this.f64765a);
            }
        }, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public static final void m84562o0(FollowActivity followActivity) {
        ((C25697b) followActivity.getMViewBinding()).f78100c.setRefreshing(false);
        C20472g c20472g = followActivity.followAdapter;
        if (c20472g == null) {
            Intrinsics.m97819y("followAdapter");
            c20472g = null;
        }
        c20472g.mo36201n1(followActivity.m84555g0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    private final void m84563p0() {
        C20472g c20472g = this.followAdapter;
        C20472g c20472g2 = null;
        if (c20472g == null) {
            Intrinsics.m97819y("followAdapter");
            c20472g = null;
        }
        if (c20472g.getData().size() <= 20) {
            ((C25697b) getMViewBinding()).getRoot().postDelayed(new Runnable() { // from class: com.transsion.usercenter.f
                @Override // java.lang.Runnable
                public final void run() {
                    FollowActivity.m84564q0(this.f64814a);
                }
            }, 2000L);
            return;
        }
        C20472g c20472g3 = this.followAdapter;
        if (c20472g3 == null) {
            Intrinsics.m97819y("followAdapter");
        } else {
            c20472g2 = c20472g3;
        }
        c20472g2.m36186h0().m108668t(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m84564q0(FollowActivity followActivity) {
        C20472g c20472g = followActivity.followAdapter;
        C20472g c20472g2 = null;
        if (c20472g == null) {
            Intrinsics.m97819y("followAdapter");
            c20472g = null;
        }
        c20472g.mo36208q(followActivity.m84555g0());
        C20472g c20472g3 = followActivity.followAdapter;
        if (c20472g3 == null) {
            Intrinsics.m97819y("followAdapter");
        } else {
            c20472g2 = c20472g3;
        }
        c20472g2.m36186h0().m108667s();
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public C25697b getViewBinding() {
        C25697b c25697bM101095c = C25697b.m101095c(getLayoutInflater());
        Intrinsics.m97801g(c25697bM101095c, "inflate(...)");
        return c25697bM101095c;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.followType = getIntent().getIntExtra("follow_type_key", 1);
        LinearLayoutCompat root = ((C25697b) getMViewBinding()).getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        AbstractC26006c.m102052e(root);
        TitleLayout titleLayout = ((C25697b) getMViewBinding()).f78101d;
        titleLayout.goneRightViewLayout();
        if (this.followType == 1) {
            String string = getString(R$string.user_center_follow_following);
            Intrinsics.m97801g(string, "getString(...)");
            titleLayout.setTitleText(string);
        } else {
            String string2 = getString(R$string.user_center_follow_followers);
            Intrinsics.m97801g(string2, "getString(...)");
            titleLayout.setTitleText(string2);
        }
        m84556i0();
    }
}
