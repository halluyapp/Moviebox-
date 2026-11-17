package com.transsion.room.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.AbstractC2397b;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import ck.C5127x;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.gyf.immersionbar.ImmersionBar;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$color;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.baseui.widget.magicindicator.ORCommonNavigator;
import com.transsion.room.R$string;
import com.transsion.room.view.RoomListMainTabTitleView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gq.C23657s;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m00.InterfaceC25777c;
import m00.InterfaceC25778d;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.WrapPagerIndicator;
import ng.AbstractC26006c;
import p551kk.AbstractC24664a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, m97100d2 = {"Lcom/transsion/room/fragment/RoomListMainFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lgq/s;", "<init>", "()V", "", "initViewPager", "e0", "Landroid/view/LayoutInflater;", "inflater", "f0", "(Landroid/view/LayoutInflater;)Lgq/s;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "a", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "vpAdapter", "Lcom/transsion/baseui/widget/magicindicator/ORCommonNavigator;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/baseui/widget/magicindicator/ORCommonNavigator;", "commonNavigator", "", "c", "I", "selectTabIndex", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Z", "isSelectRoom", "", "e", "[Ljava/lang/Integer;", "tabs", "f", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class RoomListMainFragment extends BaseFragment<C23657s> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private FragmentStateAdapter vpAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ORCommonNavigator commonNavigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int selectTabIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isSelectRoom;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Integer[] tabs = {Integer.valueOf(R$string.Your_rooms), Integer.valueOf(R$string.Room_list)};

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomListMainFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final RoomListMainFragment m77037a(boolean z11, int i11) {
            RoomListMainFragment roomListMainFragment = new RoomListMainFragment();
            roomListMainFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("is_select_room", Boolean.valueOf(z11)), TuplesKt.m97108a("index", Integer.valueOf(i11))));
            return roomListMainFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomListMainFragment$b */
    public static final class C18085b extends AbstractC24664a {
        C18085b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final void m77039j(RoomListMainFragment roomListMainFragment, int i11, View view) {
            ViewPager2 viewPager2;
            C23657s mViewBinding = roomListMainFragment.getMViewBinding();
            if (mViewBinding == null || (viewPager2 = mViewBinding.f72310f) == null) {
                return;
            }
            viewPager2.setCurrentItem(i11, true);
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: a */
        public int mo64490a() {
            return RoomListMainFragment.this.tabs.length;
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: b */
        public InterfaceC25777c mo64491b(Context context) {
            Intrinsics.m97802h(context, "context");
            WrapPagerIndicator wrapPagerIndicator = new WrapPagerIndicator(context);
            int iM27313a = AbstractC5776a0.m27313a(3.0f);
            wrapPagerIndicator.setRoundRadius(iM27313a * 2.0f);
            int i11 = -iM27313a;
            wrapPagerIndicator.setVerticalPadding(i11);
            wrapPagerIndicator.setHorizontalPadding(i11);
            wrapPagerIndicator.setFillColor(AbstractC2397b.getColor(context, R$color.bg_01));
            return wrapPagerIndicator;
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: c */
        public InterfaceC25778d mo64492c(Context context, final int i11) {
            Intrinsics.m97802h(context, "context");
            RoomListMainTabTitleView roomListMainTabTitleView = new RoomListMainTabTitleView(context);
            final RoomListMainFragment roomListMainFragment = RoomListMainFragment.this;
            roomListMainTabTitleView.setTextById(roomListMainFragment.tabs[i11].intValue());
            roomListMainTabTitleView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.fragment.x1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RoomListMainFragment.C18085b.m77039j(roomListMainFragment, i11, view);
                }
            });
            return roomListMainTabTitleView;
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomListMainFragment$c */
    public static final class C18086c extends ViewPager2.OnPageChangeCallback {
        C18086c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            MagicIndicator magicIndicator;
            super.onPageScrollStateChanged(i11);
            C23657s mViewBinding = RoomListMainFragment.this.getMViewBinding();
            if (mViewBinding == null || (magicIndicator = mViewBinding.f72309e) == null) {
                return;
            }
            magicIndicator.onPageScrollStateChanged(i11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            MagicIndicator magicIndicator;
            super.onPageScrolled(i11, f11, i12);
            C23657s mViewBinding = RoomListMainFragment.this.getMViewBinding();
            if (mViewBinding == null || (magicIndicator = mViewBinding.f72309e) == null) {
                return;
            }
            magicIndicator.onPageScrolled(i11, f11, i12);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            MagicIndicator magicIndicator;
            super.onPageSelected(i11);
            C23657s mViewBinding = RoomListMainFragment.this.getMViewBinding();
            if (mViewBinding != null && (magicIndicator = mViewBinding.f72309e) != null) {
                magicIndicator.onPageSelected(i11);
            }
            RoomListMainFragment.this.selectTabIndex = i11;
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.fragment.RoomListMainFragment$d */
    public static final class C18087d extends FragmentStateAdapter {
        C18087d() {
            super(RoomListMainFragment.this);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int i11) {
            return i11 == 0 ? RoomMyListFragment.INSTANCE.m77045a(RoomListMainFragment.this.isSelectRoom, null) : RoomFilterListFragment.INSTANCE.m76891a(RoomListMainFragment.this.isSelectRoom);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return RoomListMainFragment.this.tabs.length;
        }
    }

    /* JADX INFO: renamed from: e0 */
    private final void m77034e0() {
        ViewPager2 viewPager2;
        ViewPager2 viewPager3;
        MagicIndicator magicIndicator;
        ORCommonNavigator oRCommonNavigator = new ORCommonNavigator(requireContext());
        oRCommonNavigator.setAdapter(new C18085b());
        this.commonNavigator = oRCommonNavigator;
        C23657s mViewBinding = getMViewBinding();
        if (mViewBinding != null && (magicIndicator = mViewBinding.f72309e) != null) {
            magicIndicator.setNavigator(this.commonNavigator);
        }
        C23657s mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (viewPager3 = mViewBinding2.f72310f) != null) {
            viewPager3.registerOnPageChangeCallback(new C18086c());
        }
        C23657s mViewBinding3 = getMViewBinding();
        if (mViewBinding3 == null || (viewPager2 = mViewBinding3.f72310f) == null) {
            return;
        }
        viewPager2.setCurrentItem(this.selectTabIndex, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final void m77035g0(RoomListMainFragment roomListMainFragment, View view) {
        FragmentActivity activity = roomListMainFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final void initViewPager() {
        ViewPager2 viewPager2;
        this.vpAdapter = new C18087d();
        C23657s mViewBinding = getMViewBinding();
        if (mViewBinding != null && (viewPager2 = mViewBinding.f72310f) != null) {
            viewPager2.setAdapter(this.vpAdapter);
        }
        m77034e0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public C23657s getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23657s c23657sM93578c = C23657s.m93578c(inflater);
        Intrinsics.m97801g(c23657sM93578c, "inflate(...)");
        return c23657sM93578c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        AppCompatImageView appCompatImageView;
        ImageView imageView;
        Intrinsics.m97802h(view, "view");
        C23657s mViewBinding = getMViewBinding();
        if (mViewBinding != null && (imageView = mViewBinding.f72308d) != null) {
            AbstractC26006c.m102052e(imageView);
        }
        C23657s mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (appCompatImageView = mViewBinding2.f72307c) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.fragment.w1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RoomListMainFragment.m77035g0(this.f59302a, view2);
                }
            });
        }
        initViewPager();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.selectTabIndex = arguments != null ? arguments.getInt("index") : 0;
        Bundle arguments2 = getArguments();
        this.isSelectRoom = arguments2 != null ? arguments2.getBoolean("is_select_room") : false;
        ImmersionBar.with(this).statusBarDarkFont(!C5127x.f17620a.m23969a()).init();
    }
}
