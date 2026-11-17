package com.transsion.transfer.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.activity.AbstractC0256u;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.Fragment;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import ck.C5127x;
import com.blankj.utilcode.util.AbstractC5790i;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.GradientLinePagerIndicator;
import com.p282tn.lib.widget.R$color;
import com.therouter.TheRouter;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.baseui.util.AbstractViewOnClickListenerC14560f;
import com.transsion.transfer.R$id;
import com.transsion.transfer.R$mipmap;
import com.transsion.transfer.R$string;
import com.transsion.transfer.impl.client.TransferClient;
import com.transsion.transfer.impl.view.TabTitleView;
import com.transsion.transfer.wifi.connect.WifiConnectionManager;
import com.transsion.transfer.wifi.create.WifiCreateManager;
import com.transsion.transfer.wifi.p320ui.TransferDisconnectTipsDialog;
import com.transsion.transfer.wifi.util.WifiUtils;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import lv.C25686b;
import m00.AbstractC25775a;
import m00.InterfaceC25777c;
import m00.InterfaceC25778d;
import mv.InterfaceC25912a;
import mv.InterfaceC25913b;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import ng.AbstractC26006c;
import p419fv.C23437c;
import p624nv.C26114h;
import p721qv.C27131b;
import p875wk.InterfaceC28388a;
import sv.C27656a;
import sv.C27657b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005*\u00014\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u0019\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0006\u0010\u0018R\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u001d\u00103\u001a\u0004\u0018\u00010&8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00100\u001a\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020C0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006L"}, m97100d2 = {"Lcom/transsion/transfer/impl/TransferStatusActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Llv/b;", "<init>", "()V", "", "initView", "n1", "j1", "K0", "initData", "X0", "T0", "", "connected", "", "deviceName", "M0", "(ZLjava/lang/String;)V", "p1", "S0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "isTranslucent", "()Z", "isStatusDark", "R0", "()Llv/b;", "Lcom/transsion/transfer/impl/TransferReceivedFragment;", "a", "Lcom/transsion/transfer/impl/TransferReceivedFragment;", "receivedFragment", "Lcom/transsion/transfer/impl/TransferSentFragment;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/transfer/impl/TransferSentFragment;", "sentFragment", "Lmv/a;", "c", "Lmv/a;", "selectFragment", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Z", "isSelectFragmentShown", "e", "needServerAsClientFetchList", "f", "Lkotlin/Lazy;", "Q0", "()Lmv/a;", "transferSelectFragment", "com/transsion/transfer/impl/TransferStatusActivity$g", "g", "O0", "()Lcom/transsion/transfer/impl/TransferStatusActivity$g;", "serverFileHandler", "Lcom/transsion/transfer/impl/k;", "h", "P0", "()Lcom/transsion/transfer/impl/k;", "serverViewModel", "Lcom/transsion/transfer/impl/ClientViewModel;", "i", "N0", "()Lcom/transsion/transfer/impl/ClientViewModel;", "clientViewModel", "", "j", "I", "selectTabIndex", "", CampaignEx.JSON_KEY_AD_K, "[Ljava/lang/Integer;", "tabs", "l", "Transfer_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class TransferStatusActivity extends BaseActivity<C25686b> {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m */
    private static final String f63661m;

    /* JADX INFO: renamed from: n */
    private static boolean f63662n;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private TransferReceivedFragment receivedFragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private TransferSentFragment sentFragment;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private InterfaceC25912a selectFragment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isSelectFragmentShown;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean needServerAsClientFetchList;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int selectTabIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy transferSelectFragment = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.impl.l0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TransferStatusActivity.m83062q1();
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy serverFileHandler = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.impl.m0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TransferStatusActivity.m83052l1(this.f63801a);
        }
    });

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Lazy serverViewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.impl.n0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TransferStatusActivity.m83054m1(this.f63803a);
        }
    });

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Lazy clientViewModel = LazyKt.m97097b(new Function0() { // from class: com.transsion.transfer.impl.o0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TransferStatusActivity.m83017L0(this.f63805a);
        }
    });

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Integer[] tabs = {Integer.valueOf(R$string.transfer_tab_received), Integer.valueOf(R$string.transfer_tab_sent)};

    /* JADX INFO: renamed from: com.transsion.transfer.impl.TransferStatusActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m83074a() {
            return TransferStatusActivity.f63661m;
        }

        /* JADX INFO: renamed from: b */
        public final void m83075b(Context context) {
            Intrinsics.m97802h(context, "context");
            TransferStatusActivity.f63662n = false;
            context.startActivity(new Intent(context, (Class<?>) TransferStatusActivity.class));
        }

        /* JADX INFO: renamed from: c */
        public final void m83076c(Context context) {
            Intrinsics.m97802h(context, "context");
            Intent intent = new Intent(context, (Class<?>) TransferStatusActivity.class);
            TransferStatusActivity.f63662n = true;
            context.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.TransferStatusActivity$b */
    public static final class C19968b extends ViewPager2.OnPageChangeCallback {
        C19968b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            super.onPageScrollStateChanged(i11);
            ((C25686b) TransferStatusActivity.this.getMViewBinding()).f78032f.onPageScrollStateChanged(i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            super.onPageScrolled(i11, f11, i12);
            ((C25686b) TransferStatusActivity.this.getMViewBinding()).f78032f.onPageScrolled(i11, f11, i12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            super.onPageSelected(i11);
            ((C25686b) TransferStatusActivity.this.getMViewBinding()).f78032f.onPageSelected(i11);
            TransferStatusActivity.this.selectTabIndex = i11;
            if (i11 == 0) {
                TransferReceivedFragment transferReceivedFragment = TransferStatusActivity.this.receivedFragment;
                if (transferReceivedFragment != null) {
                    transferReceivedFragment.m82985u0();
                    return;
                }
                return;
            }
            TransferSentFragment transferSentFragment = TransferStatusActivity.this.sentFragment;
            if (transferSentFragment != null) {
                transferSentFragment.m83004p0();
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.TransferStatusActivity$c */
    public static final class C19969c extends AbstractC25775a {

        /* JADX INFO: renamed from: com.transsion.transfer.impl.TransferStatusActivity$c$a */
        public static final class a extends AbstractViewOnClickListenerC14560f {

            /* JADX INFO: renamed from: e */
            final /* synthetic */ TransferStatusActivity f63676e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ int f63677f;

            a(TransferStatusActivity transferStatusActivity, int i11) {
                this.f63676e = transferStatusActivity;
                this.f63677f = i11;
            }

            @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
            /* JADX INFO: renamed from: c */
            public void mo64493c(View view) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
            /* JADX INFO: renamed from: d */
            public void mo64494d(View view) {
                ((C25686b) this.f63676e.getMViewBinding()).f78039m.setCurrentItem(this.f63677f, true);
            }
        }

        C19969c() {
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: a */
        public int mo64490a() {
            return TransferStatusActivity.this.tabs.length;
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: b */
        public InterfaceC25777c mo64491b(Context context) {
            Intrinsics.m97802h(context, "context");
            GradientLinePagerIndicator gradientLinePagerIndicator = new GradientLinePagerIndicator(context);
            gradientLinePagerIndicator.setMode(2);
            gradientLinePagerIndicator.setLineHeight(AbstractC5790i.m27411e(3.0f));
            gradientLinePagerIndicator.setLineWidth(AbstractC5790i.m27411e(24.0f));
            gradientLinePagerIndicator.setRoundRadius(AbstractC5790i.m27411e(2.0f));
            gradientLinePagerIndicator.setStartInterpolator(new AccelerateInterpolator());
            gradientLinePagerIndicator.setEndInterpolator(new DecelerateInterpolator(2.0f));
            gradientLinePagerIndicator.setColors(AbstractC2397b.getColor(context, R$color.main_gradient_start), AbstractC2397b.getColor(context, R$color.main_gradient_center), AbstractC2397b.getColor(context, R$color.main_gradient_end));
            return gradientLinePagerIndicator;
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: c */
        public InterfaceC25778d mo64492c(Context context, int i11) {
            Intrinsics.m97802h(context, "context");
            TabTitleView tabTitleView = new TabTitleView(context);
            TransferStatusActivity transferStatusActivity = TransferStatusActivity.this;
            tabTitleView.setTextById(transferStatusActivity.tabs[i11].intValue());
            tabTitleView.setOnClickListener(new a(transferStatusActivity, i11));
            return tabTitleView;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.TransferStatusActivity$d */
    public static final class C19970d extends FragmentStateAdapter {
        C19970d() {
            super(TransferStatusActivity.this);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int i11) {
            if (i11 == 0) {
                TransferReceivedFragment transferReceivedFragmentM82986a = TransferReceivedFragment.INSTANCE.m82986a();
                TransferStatusActivity.this.receivedFragment = transferReceivedFragmentM82986a;
                return transferReceivedFragmentM82986a;
            }
            if (i11 != 1) {
                TransferSentFragment transferSentFragmentM83005a = TransferSentFragment.INSTANCE.m83005a();
                TransferStatusActivity.this.sentFragment = transferSentFragmentM83005a;
                return transferSentFragmentM83005a;
            }
            TransferSentFragment transferSentFragmentM83005a2 = TransferSentFragment.INSTANCE.m83005a();
            TransferStatusActivity.this.sentFragment = transferSentFragmentM83005a2;
            return transferSentFragmentM83005a2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return TransferStatusActivity.this.tabs.length;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.TransferStatusActivity$e */
    public static final class C19971e extends AbstractC0256u {
        C19971e() {
            super(true);
        }

        @Override // androidx.activity.AbstractC0256u
        public void handleOnBackPressed() {
            if (TransferStatusActivity.this.isSelectFragmentShown) {
                TransferStatusActivity.this.m83022S0();
            } else if (TransferStatusActivity.this.m83021P0().m83244j() || TransferStatusActivity.this.m83019N0().m82939x()) {
                TransferStatusActivity.this.m83056n1();
            } else {
                TransferStatusActivity.this.m83048j1();
                TransferStatusActivity.this.finish();
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.TransferStatusActivity$f */
    static final class C19972f implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f63680a;

        C19972f(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f63680a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f63680a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3189c0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m97797c(mo6065a(), ((FunctionAdapter) obj).mo6065a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6065a().hashCode();
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f63680a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.TransferStatusActivity$g */
    public static final class C19973g implements InterfaceC20014g {
        C19973g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final void m83078d(TransferStatusActivity transferStatusActivity, String str) {
            TransferStatusActivity.INSTANCE.m83074a();
            transferStatusActivity.m83018M0(true, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.transsion.transfer.impl.InterfaceC20014g
        /* JADX INFO: renamed from: a */
        public void mo83079a(String clientIp, final String clientDeviceName) {
            Intrinsics.m97802h(clientIp, "clientIp");
            Intrinsics.m97802h(clientDeviceName, "clientDeviceName");
            ConstraintLayout root = ((C25686b) TransferStatusActivity.this.getMViewBinding()).getRoot();
            final TransferStatusActivity transferStatusActivity = TransferStatusActivity.this;
            root.post(new Runnable() { // from class: com.transsion.transfer.impl.t0
                @Override // java.lang.Runnable
                public final void run() {
                    TransferStatusActivity.C19973g.m83078d(transferStatusActivity, clientDeviceName);
                }
            });
        }

        @Override // com.transsion.transfer.impl.InterfaceC20014g
        /* JADX INFO: renamed from: b */
        public String mo83080b() {
            String MODEL = Build.MODEL;
            Intrinsics.m97801g(MODEL, "MODEL");
            return MODEL;
        }
    }

    /* JADX INFO: renamed from: com.transsion.transfer.impl.TransferStatusActivity$h */
    public static final class C19974h implements InterfaceC25913b {
        C19974h() {
        }

        @Override // mv.InterfaceC25913b
        /* JADX INFO: renamed from: a */
        public void mo83081a() {
            TransferStatusActivity.this.m83022S0();
            TransferSentFragment transferSentFragment = TransferStatusActivity.this.sentFragment;
            if (transferSentFragment != null) {
                transferSentFragment.m83004p0();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // mv.InterfaceC25913b
        /* JADX INFO: renamed from: b */
        public void mo83082b() {
            TransferStatusActivity.this.m83022S0();
            TransferStatusActivity.this.m83021P0().m83259z(1);
            ((C25686b) TransferStatusActivity.this.getMViewBinding()).f78039m.setCurrentItem(1, true);
            TransferSentFragment transferSentFragment = TransferStatusActivity.this.sentFragment;
            if (transferSentFragment != null) {
                transferSentFragment.m83004p0();
            }
        }

        @Override // mv.InterfaceC25913b
        /* JADX INFO: renamed from: c */
        public void mo83083c() {
            TransferStatusActivity.this.m83056n1();
        }
    }

    static {
        String name = TransferStatusActivity.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        f63661m = name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K0 */
    private final void m83016K0() {
        CommonNavigator commonNavigator = new CommonNavigator(this);
        commonNavigator.setFollowTouch(true);
        commonNavigator.setAdapter(new C19969c());
        ((C25686b) getMViewBinding()).f78032f.setNavigator(commonNavigator);
        ((C25686b) getMViewBinding()).f78039m.registerOnPageChangeCallback(new C19968b());
        ((C25686b) getMViewBinding()).f78039m.setCurrentItem(this.selectTabIndex, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final ClientViewModel m83017L0(TransferStatusActivity transferStatusActivity) {
        return (ClientViewModel) new C3227v0(transferStatusActivity).m14969a(ClientViewModel.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M0 */
    public final void m83018M0(boolean connected, String deviceName) {
        if (connected) {
            InterfaceC25912a interfaceC25912a = this.selectFragment;
            if (interfaceC25912a != null) {
                interfaceC25912a.mo88419M();
            }
            ((C25686b) getMViewBinding()).f78037k.setImageResource(R$mipmap.transfer_ic_link);
            ((C25686b) getMViewBinding()).f78035i.setText(getString(R$string.transfer_disconnect));
            ((C25686b) getMViewBinding()).f78036j.setText(getString(R$string.transfer_state_connect_tips, ((C25686b) getMViewBinding()).f78036j.getTag() == null ? deviceName : ((C25686b) getMViewBinding()).f78036j.getTag().toString()));
            if (deviceName.length() > 0) {
                ((C25686b) getMViewBinding()).f78036j.setTag(deviceName);
                return;
            }
            return;
        }
        InterfaceC25912a interfaceC25912a2 = this.selectFragment;
        if (interfaceC25912a2 != null) {
            interfaceC25912a2.mo88421c();
        }
        ((C25686b) getMViewBinding()).f78037k.setImageResource(R$mipmap.transfer_ic_unlink);
        ((C25686b) getMViewBinding()).f78035i.setText("");
        ((C25686b) getMViewBinding()).f78036j.setText(getString(R$string.transfer_state_disconnect_tips, ((C25686b) getMViewBinding()).f78036j.getTag() == null ? deviceName : ((C25686b) getMViewBinding()).f78036j.getTag().toString()));
        if (deviceName.length() > 0) {
            ((C25686b) getMViewBinding()).f78036j.setTag(deviceName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public final ClientViewModel m83019N0() {
        return (ClientViewModel) this.clientViewModel.getValue();
    }

    /* JADX INFO: renamed from: O0 */
    private final C19973g m83020O0() {
        return (C19973g) this.serverFileHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public final C20022k m83021P0() {
        return (C20022k) this.serverViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public final void m83022S0() {
        Object obj = this.selectFragment;
        if (obj != null) {
            this.isSelectFragmentShown = false;
            getSupportFragmentManager().m14557p().mo14676p((Fragment) obj).mo14673l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T0 */
    private final void m83023T0() {
        if (!m83019N0().m82939x() || m83019N0().m82932p() == null) {
            if (!f63662n) {
                String strM82932p = m83019N0().m82932p();
                m83018M0(false, strM82932p != null ? strM82932p : "");
            }
            m83019N0().m82933q().m14851j(this, new C19972f(new Function1() { // from class: com.transsion.transfer.impl.r0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransferStatusActivity.m83024U0(this.f63809a, (String) obj);
                }
            }));
        } else {
            ((C25686b) getMViewBinding()).f78036j.setText(m83019N0().m82932p());
            InterfaceC25912a interfaceC25912a = this.selectFragment;
            if (interfaceC25912a != null) {
                String strM82932p2 = m83019N0().m82932p();
                if (strM82932p2 == null) {
                    strM82932p2 = "";
                }
                interfaceC25912a.mo88417D(strM82932p2);
            }
            String strM82932p3 = m83019N0().m82932p();
            m83018M0(true, strM82932p3 != null ? strM82932p3 : "");
        }
        m83019N0().m82931o().m14851j(this, new C19972f(new Function1() { // from class: com.transsion.transfer.impl.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferStatusActivity.m83025V0(this.f63811a, (Boolean) obj);
            }
        }));
        m83019N0().m82930n().m14851j(this, new C19972f(new Function1() { // from class: com.transsion.transfer.impl.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferStatusActivity.m83026W0(this.f63683a, (Integer) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U0 */
    public static final Unit m83024U0(TransferStatusActivity transferStatusActivity, String str) {
        if (str == null) {
            return Unit.f75682a;
        }
        ((C25686b) transferStatusActivity.getMViewBinding()).f78036j.setText(str);
        InterfaceC25912a interfaceC25912a = transferStatusActivity.selectFragment;
        if (interfaceC25912a != null) {
            String strM82932p = transferStatusActivity.m83019N0().m82932p();
            if (strM82932p == null) {
                strM82932p = "";
            }
            interfaceC25912a.mo88417D(strM82932p);
        }
        String strM82932p2 = transferStatusActivity.m83019N0().m82932p();
        transferStatusActivity.m83018M0(true, strM82932p2 != null ? strM82932p2 : "");
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final Unit m83025V0(TransferStatusActivity transferStatusActivity, Boolean bool) {
        boolean z11 = bool.booleanValue() || transferStatusActivity.m83021P0().m83244j();
        String strM82932p = transferStatusActivity.m83019N0().m82932p();
        if (strM82932p == null) {
            strM82932p = "";
        }
        transferStatusActivity.m83018M0(z11, strM82932p);
        if (bool.booleanValue()) {
            transferStatusActivity.m83019N0().m82935s(true);
        } else {
            TransferReceivedFragment transferReceivedFragment = transferStatusActivity.receivedFragment;
            if (transferReceivedFragment != null) {
                transferReceivedFragment.m82984t0();
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W0 */
    public static final Unit m83026W0(TransferStatusActivity transferStatusActivity, Integer num) {
        if (num != null && num.intValue() == 1) {
            ((C25686b) transferStatusActivity.getMViewBinding()).f78039m.setCurrentItem(0, true);
            C27131b.f82241a.m105568k(TransferClient.f63694t.m83172k());
            TransferReceivedFragment transferReceivedFragment = transferStatusActivity.receivedFragment;
            if (transferReceivedFragment != null) {
                transferReceivedFragment.m82982m0();
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: X0 */
    private final void m83027X0() {
        if (f63662n) {
            String strM83250p = m83021P0().m83250p();
            boolean z11 = !(strM83250p == null || strM83250p.length() == 0);
            InterfaceC25912a interfaceC25912a = this.selectFragment;
            if (interfaceC25912a != null) {
                String strM83250p2 = m83021P0().m83250p();
                if (strM83250p2 == null) {
                    strM83250p2 = "";
                }
                interfaceC25912a.mo88417D(strM83250p2);
            }
            String strM83250p3 = m83021P0().m83250p();
            m83018M0(z11, strM83250p3 != null ? strM83250p3 : "");
        }
        m83021P0().m83245k().m14851j(this, new C19972f(new Function1() { // from class: com.transsion.transfer.impl.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferStatusActivity.m83028Y0(this.f63690a, (String) obj);
            }
        }));
        m83021P0().m83249o().m14851j(this, new C19972f(new Function1() { // from class: com.transsion.transfer.impl.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferStatusActivity.m83029Z0(this.f63693a, (Pair) obj);
            }
        }));
        m83021P0().m83248n().m14851j(this, new C19972f(new Function1() { // from class: com.transsion.transfer.impl.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferStatusActivity.m83030a1(this.f63777a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y0 */
    public static final Unit m83028Y0(TransferStatusActivity transferStatusActivity, String str) {
        ((C25686b) transferStatusActivity.getMViewBinding()).f78036j.setText(str);
        InterfaceC25912a interfaceC25912a = transferStatusActivity.selectFragment;
        if (interfaceC25912a != null) {
            interfaceC25912a.mo88417D(str == null ? "" : str);
        }
        Intrinsics.m97799e(str);
        transferStatusActivity.m83018M0(true, str);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final Unit m83029Z0(TransferStatusActivity transferStatusActivity, Pair pair) {
        boolean zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
        String strM83250p = transferStatusActivity.m83021P0().m83250p();
        if (strM83250p == null) {
            strM83250p = "";
        }
        transferStatusActivity.m83018M0(zBooleanValue, strM83250p);
        if (transferStatusActivity.needServerAsClientFetchList) {
            transferStatusActivity.needServerAsClientFetchList = false;
            if (((Boolean) pair.getSecond()).booleanValue()) {
                transferStatusActivity.m83060p1();
            } else {
                transferStatusActivity.m83048j1();
                transferStatusActivity.finish();
            }
        } else if (!((Boolean) pair.getSecond()).booleanValue()) {
            TransferReceivedFragment transferReceivedFragment = transferStatusActivity.receivedFragment;
            if (transferReceivedFragment != null) {
                transferReceivedFragment.m82984t0();
            }
            TransferReceivedFragment transferReceivedFragment2 = transferStatusActivity.receivedFragment;
            if (transferReceivedFragment2 != null) {
                transferReceivedFragment2.m82984t0();
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final Unit m83030a1(final TransferStatusActivity transferStatusActivity, String str) {
        TransferClient.C19983a c19983a = TransferClient.f63694t;
        Intrinsics.m97799e(str);
        TransferClient.C19983a.m83164m(c19983a, str, WifiUtils.f63989a.m83538l(), null, new Function0() { // from class: com.transsion.transfer.impl.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferStatusActivity.m83032b1(this.f63780a);
            }
        }, 4, null);
        C27131b.f82241a.m105577t(c19983a.m83172k());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b1 */
    public static final Unit m83032b1(final TransferStatusActivity transferStatusActivity) {
        ((C25686b) transferStatusActivity.getMViewBinding()).getRoot().post(new Runnable() { // from class: com.transsion.transfer.impl.h0
            @Override // java.lang.Runnable
            public final void run() {
                TransferStatusActivity.m83034c1(this.f63782a);
            }
        });
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final void m83034c1(final TransferStatusActivity transferStatusActivity) {
        transferStatusActivity.m83023T0();
        transferStatusActivity.m83019N0().m82929k(new Function2() { // from class: com.transsion.transfer.impl.i0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TransferStatusActivity.m83036d1(this.f63783a, ((Boolean) obj).booleanValue(), (String) obj2);
            }
        });
        transferStatusActivity.m83019N0().m82935s(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final Unit m83036d1(TransferStatusActivity transferStatusActivity, boolean z11, String error) {
        Intrinsics.m97802h(error, "error");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("initServerVM: getClientOpenServerEventSource connect res:");
        sb2.append(z11);
        if (!z11) {
            transferStatusActivity.m83019N0().m82929k(new Function2() { // from class: com.transsion.transfer.impl.j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TransferStatusActivity.m83038e1(((Boolean) obj).booleanValue(), (String) obj2);
                }
            });
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final Unit m83038e1(boolean z11, String autoError) {
        Intrinsics.m97802h(autoError, "autoError");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("initServerVM: getClientOpenServerEventSource auto retry connect res:");
        sb2.append(z11);
        sb2.append(", autoError:");
        sb2.append(autoError);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final void m83040f1(final TransferStatusActivity transferStatusActivity, View view) {
        if (f63662n) {
            if (transferStatusActivity.m83021P0().m83244j()) {
                C27131b.f82241a.m105578u(transferStatusActivity.m83021P0().m83253t());
                transferStatusActivity.m83060p1();
                return;
            } else {
                transferStatusActivity.m83048j1();
                transferStatusActivity.finish();
                return;
            }
        }
        if (!transferStatusActivity.m83019N0().m82939x()) {
            transferStatusActivity.m83048j1();
            transferStatusActivity.finish();
            return;
        }
        if (!transferStatusActivity.m83021P0().m83258y()) {
            transferStatusActivity.m83021P0().m83241A();
        }
        if (transferStatusActivity.m83021P0().m83247m().isEmpty()) {
            transferStatusActivity.m83019N0().m82941z(new Function1() { // from class: com.transsion.transfer.impl.p0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransferStatusActivity.m83042g1(this.f63807a, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            transferStatusActivity.m83060p1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g1 */
    public static final Unit m83042g1(final TransferStatusActivity transferStatusActivity, boolean z11) {
        C27131b.f82241a.m105569l(TransferClient.f63694t.m83172k());
        if (transferStatusActivity.m83021P0().m83247m().isEmpty()) {
            transferStatusActivity.needServerAsClientFetchList = true;
        } else {
            ((C25686b) transferStatusActivity.getMViewBinding()).getRoot().post(new Runnable() { // from class: com.transsion.transfer.impl.g0
                @Override // java.lang.Runnable
                public final void run() {
                    TransferStatusActivity.m83044h1(this.f63781a);
                }
            });
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final void m83044h1(TransferStatusActivity transferStatusActivity) {
        transferStatusActivity.m83060p1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final void m83046i1(TransferStatusActivity transferStatusActivity, View view) {
        transferStatusActivity.m83056n1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void initData() {
        m83027X0();
        m83023T0();
        ((C25686b) getMViewBinding()).f78039m.setCurrentItem(f63662n ? 1 : 0);
        if (f63662n) {
            List listM83246l = m83021P0().m83246l();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("initData: clientIps:");
            sb2.append(listM83246l);
            List listM83247m = m83021P0().m83247m();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("initData: clientNames:");
            sb3.append(listM83247m);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((C25686b) getMViewBinding()).f78039m.setAdapter(new C19970d());
        m83016K0();
        ((C25686b) getMViewBinding()).f78033g.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.transfer.impl.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferStatusActivity.m83040f1(this.f63856a, view);
            }
        });
        ((C25686b) getMViewBinding()).f78035i.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.transfer.impl.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferStatusActivity.m83046i1(this.f63797a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public final void m83048j1() {
        C27657b.f84826a.m107593b();
        C27656a.f84824a.m107585b();
        m83021P0().m83243C();
        C26114h.f79688s.m102277a();
        C23437c c23437c = C23437c.f71467a;
        c23437c.m93051j();
        c23437c.m93050i();
        m83019N0().m82927B(new Function0() { // from class: com.transsion.transfer.impl.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferStatusActivity.m83050k1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final Unit m83050k1() {
        WifiCreateManager.f63911a.m83376j();
        C23437c c23437c = C23437c.f71467a;
        c23437c.m93047f();
        WifiConnectionManager.f63861a.m83304s();
        c23437c.m93046e();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final C19973g m83052l1(TransferStatusActivity transferStatusActivity) {
        return transferStatusActivity.new C19973g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final C20022k m83054m1(TransferStatusActivity transferStatusActivity) {
        C20022k c20022k = (C20022k) new C3227v0(transferStatusActivity).m14969a(C20022k.class);
        c20022k.m83242B(transferStatusActivity.m83020O0());
        c20022k.m83259z(1);
        return c20022k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public final void m83056n1() {
        TransferDisconnectTipsDialog transferDisconnectTipsDialog = new TransferDisconnectTipsDialog();
        transferDisconnectTipsDialog.m83453r0(new Function1() { // from class: com.transsion.transfer.impl.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferStatusActivity.m83058o1(this.f63778a, ((Boolean) obj).booleanValue());
            }
        });
        transferDisconnectTipsDialog.m65436k0(this, "transfer_disconnect_tips_dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final Unit m83058o1(TransferStatusActivity transferStatusActivity, boolean z11) {
        if (z11) {
            if (f63662n) {
                C27131b.f82241a.m105573p(transferStatusActivity.m83021P0().m83253t());
            } else {
                C27131b.f82241a.m105563f(TransferClient.f63694t.m83172k());
            }
            transferStatusActivity.m83048j1();
            transferStatusActivity.finish();
        }
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p1 */
    private final void m83060p1() {
        Fragment fragmentM14547k0 = getSupportFragmentManager().m14547k0("TransferSelectFragment");
        if (fragmentM14547k0 == null) {
            InterfaceC25912a interfaceC25912aM83072Q0 = m83072Q0();
            if (interfaceC25912aM83072Q0 != 0) {
                interfaceC25912aM83072Q0.mo88422x(new C19974h());
            }
            Intrinsics.m97800f(interfaceC25912aM83072Q0, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            fragmentM14547k0 = (Fragment) interfaceC25912aM83072Q0;
        }
        InterfaceC25912a interfaceC25912a = (InterfaceC25912a) fragmentM14547k0;
        this.selectFragment = interfaceC25912a;
        if (interfaceC25912a != null) {
            interfaceC25912a.mo88420O(m83019N0().m82938w() + m83021P0().m83256w(), m83019N0().m82934r() + m83021P0().m83252s());
        }
        this.isSelectFragmentShown = true;
        if (fragmentM14547k0.isAdded()) {
            getSupportFragmentManager().m14557p().mo14681y(fragmentM14547k0).mo14673l();
        } else {
            getSupportFragmentManager().m14557p().m14806c(R$id.fl_select_page_container, fragmentM14547k0, "TransferSelectFragment").mo14673l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final InterfaceC25912a m83062q1() {
        InterfaceC28388a interfaceC28388a = (InterfaceC28388a) TheRouter.m61774d(InterfaceC28388a.class, new Object[0]);
        Object objMo87085a = interfaceC28388a != null ? interfaceC28388a.mo87085a() : null;
        Intrinsics.m97800f(objMo87085a, "null cannot be cast to non-null type com.transsion.transfer.impl.listener.ITransferSelectView");
        return (InterfaceC25912a) objMo87085a;
    }

    /* JADX INFO: renamed from: Q0 */
    public final InterfaceC25912a m83072Q0() {
        return (InterfaceC25912a) this.transferSelectFragment.getValue();
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public C25686b getViewBinding() {
        C25686b c25686bM101059c = C25686b.m101059c(getLayoutInflater());
        Intrinsics.m97801g(c25686bM101059c, "inflate(...)");
        return c25686bM101059c;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        initView();
        initData();
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return !C5127x.f17620a.m23969a();
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String strM83538l = WifiUtils.f63989a.m83538l();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onCreate: ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        sb2.append(strM83538l);
        ImageView vTopBg = ((C25686b) getMViewBinding()).f78038l;
        Intrinsics.m97801g(vTopBg, "vTopBg");
        AbstractC26006c.m102052e(vTopBg);
        getWindow().addFlags(128);
        getOnBackPressedDispatcher().m942i(this, new C19971e());
    }
}
