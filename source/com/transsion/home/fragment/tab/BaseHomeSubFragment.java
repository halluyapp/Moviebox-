package com.transsion.home.fragment.tab;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.recyclerview.widget.RecyclerView;
import ck.C5110g;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.home.fragment.home.HomeFragment;
import com.transsion.p285ad.bidding.nativead.BiddingListManager;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.strategy.C14058c;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p352dn.InterfaceC22998b;
import p352dn.InterfaceC23002f;
import p429g4.InterfaceC23498a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000 G*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004:\u00010B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u0006J\u0019\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0011\u0010$\u001a\u0004\u0018\u00010#H&¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00142\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\u0006J#\u0010.\u001a\u00020\u00072\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0018\u00010,¢\u0006\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R$\u00108\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u0010\"\"\u0004\b6\u00107R\"\u0010>\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u0016\"\u0004\b<\u0010=R$\u0010F\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006H"}, m97100d2 = {"Lcom/transsion/home/fragment/tab/BaseHomeSubFragment;", "Lg4/a;", "T", "Lcom/transsion/baseui/fragment/BaseFragment;", "Ldn/f;", "<init>", "()V", "", "m0", "initAd", "o0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "h0", "()I", "", "isWhite", "b0", "(Z)V", "k0", "()Z", "onMemberStateChange", "c0", "p0", "", "g0", "()Ljava/lang/String;", "Landroidx/recyclerview/widget/RecyclerView;", "f0", "()Landroidx/recyclerview/widget/RecyclerView;", "lastAdPosition", "Lcom/transsion/ad/bidding/nativead/BiddingNativeManager;", "wrapperNativeManager", "l0", "(ILcom/transsion/ad/bidding/nativead/BiddingNativeManager;)V", "n0", "", "selectedItems", "q0", "(Ljava/util/Map;)V", "a", "Z", "mIsWhite", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "d0", "setMTabCode", "(Ljava/lang/String;)V", "mTabCode", "c", "I", "e0", "setMTabId", "(I)V", "mTabId", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "i0", "()Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "setV3ListManager", "(Lcom/transsion/ad/bidding/nativead/BiddingListManager;)V", "v3ListManager", "e", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public abstract class BaseHomeSubFragment<T extends InterfaceC23498a> extends BaseFragment<T> implements InterfaceC23002f {

    /* JADX INFO: renamed from: f */
    public static final int f53083f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean mIsWhite;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String mTabCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mTabId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private BiddingListManager v3ListManager;

    private final void initAd() {
        if (TextUtils.isEmpty(mo67724g0()) || mo67723f0() == null) {
            return;
        }
        BiddingListManager biddingListManager = new BiddingListManager();
        this.v3ListManager = biddingListManager;
        biddingListManager.m63184F(mo67723f0());
        BiddingListManager biddingListManager2 = this.v3ListManager;
        if (biddingListManager2 != null) {
            biddingListManager2.m63179A(AbstractC3226v.m14968a(this));
        }
        BiddingListManager biddingListManager3 = this.v3ListManager;
        if (biddingListManager3 != null) {
            biddingListManager3.m63185G(mo67724g0());
        }
        BiddingListManager biddingListManager4 = this.v3ListManager;
        if (biddingListManager4 != null) {
            biddingListManager4.m63186H(String.valueOf(this.mTabId));
        }
        BiddingListManager biddingListManager5 = this.v3ListManager;
        if (biddingListManager5 != null) {
            biddingListManager5.m63192z(new Function2() { // from class: com.transsion.home.fragment.tab.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BaseHomeSubFragment.m68098j0(this.f53210a, ((Integer) obj).intValue(), (BiddingNativeManager) obj2);
                }
            });
        }
        m68109q0(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final Unit m68098j0(BaseHomeSubFragment baseHomeSubFragment, int i11, BiddingNativeManager current) {
        Intrinsics.m97802h(current, "current");
        baseHomeSubFragment.mo67725l0(i11, current);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: m0 */
    private final void m68099m0() {
        String strM67935J0;
        Fragment parentFragment = getParentFragment();
        HomeFragment homeFragment = parentFragment instanceof HomeFragment ? (HomeFragment) parentFragment : null;
        if ((homeFragment == null || (strM67935J0 = homeFragment.m67935J0()) == null) && (strM67935J0 = this.mTabCode) == null) {
            strM67935J0 = "";
        }
        if (homeFragment != null) {
            homeFragment.m67938b1(strM67935J0, true);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m68100b0(boolean isWhite) {
        this.mIsWhite = isWhite;
        Fragment parentFragment = getParentFragment();
        HomeFragment homeFragment = parentFragment instanceof HomeFragment ? (HomeFragment) parentFragment : null;
        if (homeFragment != null) {
            homeFragment.m67933D0(isWhite);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void mo67722c0() {
        m68099m0();
        m68106n0();
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final String getMTabCode() {
        return this.mTabCode;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final int getMTabId() {
        return this.mTabId;
    }

    /* JADX INFO: renamed from: f0 */
    public abstract RecyclerView mo67723f0();

    /* JADX INFO: renamed from: g0 */
    public String mo67724g0() {
        return "HomeFragmentListLinearTemplateAd";
    }

    /* JADX INFO: renamed from: h0 */
    public final int m68103h0() {
        return AbstractC5776a0.m27313a(78.0f) + AbstractC5781d.m27351c();
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final BiddingListManager getV3ListManager() {
        return this.v3ListManager;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        if (C5110g.f17601a.m23911b()) {
            return;
        }
        initAd();
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    protected final boolean getMIsWhite() {
        return this.mIsWhite;
    }

    /* JADX INFO: renamed from: l0 */
    public abstract void mo67725l0(int lastAdPosition, BiddingNativeManager wrapperNativeManager);

    /* JADX INFO: renamed from: n0 */
    public final void m68106n0() {
        BiddingListManager biddingListManager = this.v3ListManager;
        if (biddingListManager != null) {
            biddingListManager.m63191y();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m68107o0() {
        m68100b0(this.mIsWhite);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.mTabCode = arguments != null ? arguments.getString(WebConstants.TAB_CODE) : null;
        Bundle arguments2 = getArguments();
        this.mTabId = arguments2 != null ? arguments2.getInt("tab_id") : 0;
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            interfaceC22998b.mo69862p(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m68106n0();
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            interfaceC22998b.mo69849c(this);
        }
    }

    @Override // p352dn.InterfaceC23002f
    public void onMemberStateChange() {
        if (getIsFirst()) {
            return;
        }
        mo67722c0();
    }

    /* JADX INFO: renamed from: p0 */
    public void mo68108p0() {
    }

    /* JADX INFO: renamed from: q0 */
    public final void m68109q0(Map selectedItems) {
        Map mapM63681a = C14058c.f49742a.m63681a("");
        Bundle arguments = getArguments();
        mapM63681a.put(TmcStartParams.KEY_CHANNEL_ID, String.valueOf(arguments != null ? Integer.valueOf(arguments.getInt("tab_id")) : null));
        if (selectedItems != null) {
            for (Map.Entry entry : selectedItems.entrySet()) {
                mapM63681a.put(entry.getKey(), entry.getValue());
            }
        }
        BiddingListManager biddingListManager = this.v3ListManager;
        if (biddingListManager != null) {
            biddingListManager.m63180B(mapM63681a);
        }
    }
}
