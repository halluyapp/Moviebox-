package com.transsion.room.fragment;

import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5790i;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.therouter.TheRouter;
import com.transsion.baseui.fragment.EmptyFragment;
import com.transsion.baseui.fragment.LazyFragment;
import com.transsion.baseui.widget.magicindicator.ORCommonNavigator;
import com.transsion.moviedetailapi.bean.RoomTabItem;
import com.transsion.room.view.RoomHomeTabTitleView;
import com.transsion.room.viewmodel.RoomDetailViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gp.InterfaceC23624b;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import m00.InterfaceC25777c;
import m00.InterfaceC25778d;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import p415fq.C23420k;
import p429g4.InterfaceC23498a;
import p551kk.AbstractC24664a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u00012B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0006J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0006J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH&¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"H&¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010%\u001a\u00020\u0017H&¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0017H&¢\u0006\u0004\b)\u0010*J-\u0010/\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u00172\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\"H&¢\u0006\u0004\b/\u00100R\u001b\u00106\u001a\u0002018DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R(\u0010>\u001a\u0014\u0018\u00010;R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\"\u0010G\u001a\u00020\u00178\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010\u0019\"\u0004\bF\u0010*R\u001d\u0010L\u001a\u0004\u0018\u00010H8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bI\u00103\u001a\u0004\bJ\u0010K¨\u0006M"}, m97100d2 = {"Lcom/transsion/room/fragment/RoomBaseFragment;", "Lg4/a;", "T", "TabItem", "Lcom/transsion/baseui/fragment/LazyFragment;", "<init>", "()V", "", "l0", "lazyLoadData", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "", "isAudioShowNoNetworkLayout", "()Z", "isShowPageStateLayoutTitle", "initViewData", "initViewModel", "hidden", "onHiddenChanged", "(Z)V", "initViewPager", "", "o0", "()I", "n0", "s0", "Landroidx/viewpager2/widget/ViewPager2;", "z0", "()Landroidx/viewpager2/widget/ViewPager2;", "Lnet/lucode/hackware/magicindicator/MagicIndicator;", "u0", "()Lnet/lucode/hackware/magicindicator/MagicIndicator;", "", "y0", "()Ljava/util/List;", RequestParameters.POSITION, "Landroidx/fragment/app/Fragment;", "m0", "(I)Landroidx/fragment/app/Fragment;", "v0", "(I)V", "Lcom/transsion/room/view/RoomHomeTabTitleView;", "tabView", "index", "tabList", "x0", "(Lcom/transsion/room/view/RoomHomeTabTitleView;ILjava/util/List;)V", "Lcom/transsion/room/viewmodel/RoomDetailViewModel;", "a", "Lkotlin/Lazy;", "p0", "()Lcom/transsion/room/viewmodel/RoomDetailViewModel;", "mDetailViewModel", "Lcom/transsion/baseui/widget/magicindicator/ORCommonNavigator;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/baseui/widget/magicindicator/ORCommonNavigator;", "mCommonNavigator", "Lcom/transsion/room/fragment/RoomBaseFragment$a;", "c", "Lcom/transsion/room/fragment/RoomBaseFragment$a;", "mCommonNavigatorAdapter", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "mFragmentStateAdapter", "e", "I", "r0", "w0", "mSelectTabIndex", "Lgp/b;", "f", "q0", "()Lgp/b;", "mPostDetailApi", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public abstract class RoomBaseFragment<T extends InterfaceC23498a, TabItem> extends LazyFragment<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ORCommonNavigator mCommonNavigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C18047a mCommonNavigatorAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private FragmentStateAdapter mFragmentStateAdapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mSelectTabIndex;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy mDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(RoomDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.room.fragment.RoomBaseFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.room.fragment.RoomBaseFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3227v0.c invoke() {
            C3227v0.c defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.m97801g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy mPostDetailApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.room.fragment.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RoomBaseFragment.m76771t0();
        }
    });

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomBaseFragment$a */
    public final class C18047a extends AbstractC24664a {

        /* JADX INFO: renamed from: b */
        private final ViewPager2 f59099b;

        /* JADX INFO: renamed from: c */
        private final List f59100c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ RoomBaseFragment f59101d;

        public C18047a(RoomBaseFragment roomBaseFragment, ViewPager2 viewPager2, List tabList) {
            Intrinsics.m97802h(tabList, "tabList");
            this.f59101d = roomBaseFragment;
            this.f59099b = viewPager2;
            this.f59100c = tabList;
        }

        /* JADX INFO: renamed from: j */
        private final LinearLayout.LayoutParams m76786j() {
            return new LinearLayout.LayoutParams(-2, -1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public static final void m76787k(C18047a c18047a, int i11, View view) {
            ViewPager2 viewPager2 = c18047a.f59099b;
            if (viewPager2 != null) {
                viewPager2.setCurrentItem(i11, true);
            }
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: a */
        public int mo64490a() {
            return this.f59100c.size();
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: b */
        public InterfaceC25777c mo64491b(Context context) {
            Intrinsics.m97802h(context, "context");
            LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
            linePagerIndicator.setMode(2);
            linePagerIndicator.setLineHeight(AbstractC5790i.m27411e(2.0f));
            linePagerIndicator.setLineWidth(AbstractC5790i.m27411e(57.0f));
            linePagerIndicator.setStartInterpolator(new AccelerateInterpolator());
            linePagerIndicator.setEndInterpolator(new DecelerateInterpolator(2.0f));
            linePagerIndicator.setColors(-1, -1, -1);
            return linePagerIndicator;
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: c */
        public InterfaceC25778d mo64492c(Context context, final int i11) {
            Intrinsics.m97802h(context, "context");
            RoomHomeTabTitleView roomHomeTabTitleView = new RoomHomeTabTitleView(context);
            this.f59101d.mo76782x0(roomHomeTabTitleView, i11, this.f59100c);
            roomHomeTabTitleView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.fragment.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RoomBaseFragment.C18047a.m76787k(this.f59247a, i11, view);
                }
            });
            return roomHomeTabTitleView;
        }

        @Override // p551kk.AbstractC24664a
        /* JADX INFO: renamed from: h */
        public LinearLayout.LayoutParams mo76788h(Context context, int i11) {
            Intrinsics.m97802h(context, "context");
            return m76786j();
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomBaseFragment$b */
    public static final class C18048b extends ViewPager2.OnPageChangeCallback {
        C18048b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            super.onPageScrollStateChanged(i11);
            MagicIndicator magicIndicatorMo76779u0 = RoomBaseFragment.this.mo76779u0();
            if (magicIndicatorMo76779u0 != null) {
                magicIndicatorMo76779u0.onPageScrollStateChanged(i11);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            super.onPageScrolled(i11, f11, i12);
            MagicIndicator magicIndicatorMo76779u0 = RoomBaseFragment.this.mo76779u0();
            if (magicIndicatorMo76779u0 != null) {
                magicIndicatorMo76779u0.onPageScrolled(i11, f11, i12);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            super.onPageSelected(i11);
            MagicIndicator magicIndicatorMo76779u0 = RoomBaseFragment.this.mo76779u0();
            if (magicIndicatorMo76779u0 != null) {
                magicIndicatorMo76779u0.onPageSelected(i11);
            }
            RoomBaseFragment.this.mo76780v0(i11);
            RoomBaseFragment.this.m76781w0(i11);
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomBaseFragment$c */
    public static final class C18049c extends FragmentStateAdapter {
        C18049c() {
            super(RoomBaseFragment.this);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int i11) {
            Fragment fragmentMo76772m0 = RoomBaseFragment.this.mo76772m0(i11);
            return fragmentMo76772m0 == null ? new EmptyFragment() : fragmentMo76772m0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return RoomBaseFragment.this.getMTabs().size();
        }
    }

    /* JADX INFO: renamed from: l0 */
    private final void m76770l0() {
        ViewPager2 viewPager2Mo76784z0 = mo76784z0();
        if (viewPager2Mo76784z0 != null) {
            viewPager2Mo76784z0.registerOnPageChangeCallback(new C18048b());
        }
        C23420k c23420k = C23420k.f71413a;
        if (c23420k.m92978f()) {
            this.mSelectTabIndex = m76774o0();
            c23420k.m92987q(false);
        }
        ViewPager2 viewPager2Mo76784z1 = mo76784z0();
        if (viewPager2Mo76784z1 != null) {
            viewPager2Mo76784z1.setCurrentItem(this.mSelectTabIndex, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final InterfaceC23624b m76771t0() {
        return (InterfaceC23624b) TheRouter.m61774d(InterfaceC23624b.class, new Object[0]);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        initViewPager();
        m76778s0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
    }

    public void initViewPager() {
        this.mFragmentStateAdapter = new C18049c();
        ViewPager2 viewPager2Mo76784z0 = mo76784z0();
        if (viewPager2Mo76784z0 != null) {
            viewPager2Mo76784z0.setAdapter(this.mFragmentStateAdapter);
        }
        m76770l0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isShowPageStateLayoutTitle() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadData() {
    }

    /* JADX INFO: renamed from: m0 */
    public abstract Fragment mo76772m0(int position);

    /* JADX INFO: renamed from: n0 */
    public final int m76773n0() {
        Iterator it = getMTabs().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            Object next = it.next();
            if ((next instanceof RoomTabItem) && Intrinsics.m97797c(((RoomTabItem) next).getTabId(), "explore")) {
                break;
            }
            i11++;
        }
        Integer numValueOf = Integer.valueOf(i11);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: o0 */
    public final int m76774o0() {
        for (Object obj : getMTabs()) {
            if ((obj instanceof RoomTabItem) && Intrinsics.m97797c(((RoomTabItem) obj).getTabId(), "images")) {
                return getMTabs().indexOf(obj);
            }
        }
        return 0;
    }

    @Override // com.transsion.baseui.fragment.LazyFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                logPause();
            } else {
                logResume();
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    protected final RoomDetailViewModel m76775p0() {
        return (RoomDetailViewModel) this.mDetailViewModel.getValue();
    }

    /* JADX INFO: renamed from: q0 */
    protected final InterfaceC23624b m76776q0() {
        return (InterfaceC23624b) this.mPostDetailApi.getValue();
    }

    /* JADX INFO: renamed from: r0, reason: from getter */
    protected final int getMSelectTabIndex() {
        return this.mSelectTabIndex;
    }

    /* JADX INFO: renamed from: s0 */
    public void m76778s0() {
        ORCommonNavigator oRCommonNavigator = new ORCommonNavigator(requireContext());
        oRCommonNavigator.setFollowTouch(true);
        C18047a c18047a = new C18047a(this, mo76784z0(), getMTabs());
        this.mCommonNavigatorAdapter = c18047a;
        oRCommonNavigator.setAdapter(c18047a);
        this.mCommonNavigator = oRCommonNavigator;
        MagicIndicator magicIndicatorMo76779u0 = mo76779u0();
        if (magicIndicatorMo76779u0 != null) {
            magicIndicatorMo76779u0.setNavigator(this.mCommonNavigator);
        }
        MagicIndicator magicIndicatorMo76779u1 = mo76779u0();
        if (magicIndicatorMo76779u1 != null) {
            magicIndicatorMo76779u1.onPageSelected(this.mSelectTabIndex);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public abstract MagicIndicator mo76779u0();

    /* JADX INFO: renamed from: v0 */
    public abstract void mo76780v0(int position);

    /* JADX INFO: renamed from: w0 */
    protected final void m76781w0(int i11) {
        this.mSelectTabIndex = i11;
    }

    /* JADX INFO: renamed from: x0 */
    public abstract void mo76782x0(RoomHomeTabTitleView tabView, int index, List tabList);

    /* JADX INFO: renamed from: y0 */
    public abstract List getMTabs();

    /* JADX INFO: renamed from: z0 */
    public abstract ViewPager2 mo76784z0();
}
