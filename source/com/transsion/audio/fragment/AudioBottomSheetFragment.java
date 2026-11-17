package com.transsion.audio.fragment;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.blankj.utilcode.util.AbstractC5790i;
import com.google.android.material.bottomsheet.DialogC10016c;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.GradientLinePagerIndicator;
import com.p282tn.lib.widget.R$color;
import com.therouter.TheRouter;
import com.transsion.audio.R$layout;
import com.transsion.audio.R$string;
import com.transsion.audio.adapter.C14210c;
import com.transsion.audio.adapter.dialog.ClearTipsDialog;
import com.transsion.audio.viewmodel.HistoryListManager;
import com.transsion.audio.viewmodel.SubjectListViewModel;
import com.transsion.baselib.p291db.audio.AudioBean;
import com.transsion.baseui.R$style;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.baseui.util.AbstractViewOnClickListenerC14560f;
import com.transsion.baseui.util.C14555a;
import com.transsion.baseui.widget.RoomSimplePagerTitleView;
import com.transsnet.downloader.bean.DownloadListBean;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import dj.InterfaceC22985a;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import m00.AbstractC25775a;
import m00.InterfaceC25777c;
import m00.InterfaceC25778d;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import p380ej.C23156a;
import p415fq.InterfaceC23410a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00132\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R \u00106\u001a\f\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R \u0010:\u001a\f\u0012\u0006\u0012\u0004\u0018\u000107\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001b\u0010D\u001a\u00020?8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001d\u0010I\u001a\u0004\u0018\u00010E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\bG\u0010H¨\u0006L"}, m97100d2 = {"Lcom/transsion/audio/fragment/AudioBottomSheetFragment;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "", "E0", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "H0", "(Landroid/view/View;)V", "Lcom/transsnet/downloader/bean/DownloadListBean;", "subjectInfo", "G0", "(Lcom/transsnet/downloader/bean/DownloadListBean;)V", "C0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "D0", "()I", "c", "I", "mSelectTabIndex", "Lcom/tn/lib/view/GradientLinePagerIndicator;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/tn/lib/view/GradientLinePagerIndicator;", "linePagerIndicator", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/CommonNavigator;", "e", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/CommonNavigator;", "commonNavigator", "Lcom/transsion/audio/fragment/SubjectListFragment;", "f", "Lcom/transsion/audio/fragment/SubjectListFragment;", "subjectListFragment", "Lcom/transsion/audio/fragment/RecentListFragment;", "g", "Lcom/transsion/audio/fragment/RecentListFragment;", "recentListFragment", "Lej/a;", "h", "Lej/a;", "mBindView", "", "", "i", "[Ljava/lang/String;", "titleData", "Lcom/transsion/baseui/widget/RoomSimplePagerTitleView;", "j", "[Lcom/transsion/baseui/widget/RoomSimplePagerTitleView;", "titleViews", "Lcom/transsion/audio/adapter/c;", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/audio/adapter/c;", "mAdapter", "Lcom/transsion/audio/viewmodel/SubjectListViewModel;", "l", "Lkotlin/Lazy;", "getSubjectListViewModel", "()Lcom/transsion/audio/viewmodel/SubjectListViewModel;", "subjectListViewModel", "Lfq/a;", "m", "getMAudioApi", "()Lfq/a;", "mAudioApi", "n", "a", "Audio_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class AudioBottomSheetFragment extends BaseDialog {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mSelectTabIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private GradientLinePagerIndicator linePagerIndicator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private CommonNavigator commonNavigator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private SubjectListFragment subjectListFragment;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private RecentListFragment recentListFragment;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private C23156a mBindView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String[] titleData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private RoomSimplePagerTitleView[] titleViews;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private C14210c mAdapter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final Lazy subjectListViewModel;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Lazy mAudioApi;

    /* JADX INFO: renamed from: com.transsion.audio.fragment.AudioBottomSheetFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AudioBottomSheetFragment m64489a(AudioBean audioBean) {
            Intrinsics.m97802h(audioBean, "audioBean");
            AudioBottomSheetFragment audioBottomSheetFragment = new AudioBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("field_item", audioBean);
            audioBottomSheetFragment.setArguments(bundle);
            return audioBottomSheetFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.audio.fragment.AudioBottomSheetFragment$b */
    public static final class C14215b extends AbstractC25775a {

        /* JADX INFO: renamed from: com.transsion.audio.fragment.AudioBottomSheetFragment$b$a */
        public static final class a extends AbstractViewOnClickListenerC14560f {

            /* JADX INFO: renamed from: e */
            final /* synthetic */ AudioBottomSheetFragment f50417e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ int f50418f;

            a(AudioBottomSheetFragment audioBottomSheetFragment, int i11) {
                this.f50417e = audioBottomSheetFragment;
                this.f50418f = i11;
            }

            @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
            /* JADX INFO: renamed from: c */
            public void mo64493c(View view) {
            }

            @Override // com.transsion.baseui.util.AbstractViewOnClickListenerC14560f
            /* JADX INFO: renamed from: d */
            public void mo64494d(View view) {
                ViewPager2 viewPager2;
                C23156a c23156a = this.f50417e.mBindView;
                if (c23156a == null || (viewPager2 = c23156a.f70631g) == null) {
                    return;
                }
                viewPager2.setCurrentItem(this.f50418f, true);
            }
        }

        C14215b() {
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: a */
        public int mo64490a() {
            String[] strArr = AudioBottomSheetFragment.this.titleData;
            if (strArr != null) {
                return strArr.length;
            }
            return 0;
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: b */
        public InterfaceC25777c mo64491b(Context context) {
            if (AudioBottomSheetFragment.this.linePagerIndicator != null) {
                GradientLinePagerIndicator gradientLinePagerIndicator = AudioBottomSheetFragment.this.linePagerIndicator;
                ViewParent parent = gradientLinePagerIndicator != null ? gradientLinePagerIndicator.getParent() : null;
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(AudioBottomSheetFragment.this.linePagerIndicator);
                }
                GradientLinePagerIndicator gradientLinePagerIndicator2 = AudioBottomSheetFragment.this.linePagerIndicator;
                Intrinsics.m97799e(gradientLinePagerIndicator2);
                return gradientLinePagerIndicator2;
            }
            AudioBottomSheetFragment audioBottomSheetFragment = AudioBottomSheetFragment.this;
            Context contextRequireContext = AudioBottomSheetFragment.this.requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            GradientLinePagerIndicator gradientLinePagerIndicator3 = new GradientLinePagerIndicator(contextRequireContext);
            AudioBottomSheetFragment audioBottomSheetFragment2 = AudioBottomSheetFragment.this;
            gradientLinePagerIndicator3.setMode(2);
            gradientLinePagerIndicator3.setLineHeight(AbstractC5790i.m27411e(3.0f));
            gradientLinePagerIndicator3.setLineWidth(AbstractC5790i.m27411e(24.0f));
            gradientLinePagerIndicator3.setRoundRadius(AbstractC5790i.m27411e(1.0f));
            gradientLinePagerIndicator3.setStartInterpolator(new AccelerateInterpolator());
            gradientLinePagerIndicator3.setEndInterpolator(new DecelerateInterpolator(2.0f));
            gradientLinePagerIndicator3.setColors(AbstractC2397b.getColor(audioBottomSheetFragment2.requireContext(), R$color.brand_gradient_start), AbstractC2397b.getColor(audioBottomSheetFragment2.requireContext(), R$color.brand_gradient_center), AbstractC2397b.getColor(audioBottomSheetFragment2.requireContext(), R$color.brand_gradient_end));
            audioBottomSheetFragment.linePagerIndicator = gradientLinePagerIndicator3;
            GradientLinePagerIndicator gradientLinePagerIndicator4 = AudioBottomSheetFragment.this.linePagerIndicator;
            Intrinsics.m97799e(gradientLinePagerIndicator4);
            return gradientLinePagerIndicator4;
        }

        @Override // m00.AbstractC25775a
        /* JADX INFO: renamed from: c */
        public InterfaceC25778d mo64492c(Context context, int i11) {
            String str;
            RoomSimplePagerTitleView[] roomSimplePagerTitleViewArr = AudioBottomSheetFragment.this.titleViews;
            RoomSimplePagerTitleView roomSimplePagerTitleView = roomSimplePagerTitleViewArr != null ? roomSimplePagerTitleViewArr[i11] : null;
            if (roomSimplePagerTitleView != null) {
                ViewParent parent = roomSimplePagerTitleView.getParent();
                Intrinsics.m97800f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(roomSimplePagerTitleView);
                String[] strArr = AudioBottomSheetFragment.this.titleData;
                if (strArr == null || (str = strArr[i11]) == null) {
                    str = "";
                }
                roomSimplePagerTitleView.setText(str);
                return roomSimplePagerTitleView;
            }
            Context contextRequireContext = AudioBottomSheetFragment.this.requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            RoomSimplePagerTitleView roomSimplePagerTitleView2 = new RoomSimplePagerTitleView(contextRequireContext);
            AudioBottomSheetFragment audioBottomSheetFragment = AudioBottomSheetFragment.this;
            roomSimplePagerTitleView2.setSingleLine(false);
            String[] strArr2 = audioBottomSheetFragment.titleData;
            if (strArr2 != null) {
                roomSimplePagerTitleView2.setText(strArr2[i11]);
            }
            roomSimplePagerTitleView2.setOnClickListener(new a(audioBottomSheetFragment, i11));
            RoomSimplePagerTitleView[] roomSimplePagerTitleViewArr2 = AudioBottomSheetFragment.this.titleViews;
            if (roomSimplePagerTitleViewArr2 != null) {
                roomSimplePagerTitleViewArr2[i11] = roomSimplePagerTitleView2;
            }
            return roomSimplePagerTitleView2;
        }
    }

    /* JADX INFO: renamed from: com.transsion.audio.fragment.AudioBottomSheetFragment$c */
    public static final class C14216c extends ViewPager2.OnPageChangeCallback {
        C14216c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i11) {
            MagicIndicator magicIndicator;
            super.onPageScrollStateChanged(i11);
            C23156a c23156a = AudioBottomSheetFragment.this.mBindView;
            if (c23156a == null || (magicIndicator = c23156a.f70629e) == null) {
                return;
            }
            magicIndicator.onPageScrollStateChanged(i11);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i11, float f11, int i12) {
            MagicIndicator magicIndicator;
            super.onPageScrolled(i11, f11, i12);
            C23156a c23156a = AudioBottomSheetFragment.this.mBindView;
            if (c23156a == null || (magicIndicator = c23156a.f70629e) == null) {
                return;
            }
            magicIndicator.onPageScrolled(i11, f11, i12);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i11) {
            AppCompatImageView appCompatImageView;
            AppCompatImageView appCompatImageView2;
            MagicIndicator magicIndicator;
            super.onPageSelected(i11);
            C23156a c23156a = AudioBottomSheetFragment.this.mBindView;
            if (c23156a != null && (magicIndicator = c23156a.f70629e) != null) {
                magicIndicator.onPageSelected(i11);
            }
            AudioBottomSheetFragment.this.mSelectTabIndex = i11;
            RoomSimplePagerTitleView[] roomSimplePagerTitleViewArr = AudioBottomSheetFragment.this.titleViews;
            if (roomSimplePagerTitleViewArr == null || i11 != roomSimplePagerTitleViewArr.length - 1) {
                C23156a c23156a2 = AudioBottomSheetFragment.this.mBindView;
                if (c23156a2 == null || (appCompatImageView = c23156a2.f70626b) == null) {
                    return;
                }
                appCompatImageView.setVisibility(8);
                return;
            }
            C23156a c23156a3 = AudioBottomSheetFragment.this.mBindView;
            if (c23156a3 == null || (appCompatImageView2 = c23156a3.f70626b) == null) {
                return;
            }
            appCompatImageView2.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.transsion.audio.fragment.AudioBottomSheetFragment$d */
    public static final class C14217d extends FragmentStateAdapter {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f50421b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14217d(String str) {
            super(AudioBottomSheetFragment.this);
            this.f50421b = str;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public Fragment createFragment(int i11) {
            String[] strArr = AudioBottomSheetFragment.this.titleData;
            if (strArr == null || i11 != strArr.length - 1) {
                AudioBottomSheetFragment.this.subjectListFragment = SubjectListFragment.INSTANCE.m64546b(this.f50421b);
                SubjectListFragment subjectListFragment = AudioBottomSheetFragment.this.subjectListFragment;
                Intrinsics.m97799e(subjectListFragment);
                return subjectListFragment;
            }
            AudioBottomSheetFragment.this.recentListFragment = new RecentListFragment();
            RecentListFragment recentListFragment = AudioBottomSheetFragment.this.recentListFragment;
            Intrinsics.m97799e(recentListFragment);
            return recentListFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            String[] strArr = AudioBottomSheetFragment.this.titleData;
            if (strArr != null) {
                return strArr.length;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.transsion.audio.fragment.AudioBottomSheetFragment$e */
    public static final class C14218e implements InterfaceC22985a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ClearTipsDialog f50422a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AudioBottomSheetFragment f50423b;

        C14218e(ClearTipsDialog clearTipsDialog, AudioBottomSheetFragment audioBottomSheetFragment) {
            this.f50422a = clearTipsDialog;
            this.f50423b = audioBottomSheetFragment;
        }

        @Override // dj.InterfaceC22985a
        /* JADX INFO: renamed from: a */
        public void mo64495a() {
            C14210c c14210c = this.f50423b.mAdapter;
            if (c14210c != null) {
                c14210c.mo36201n1(null);
            }
            HistoryListManager.f50535e.m64709b().m64701n();
            this.f50423b.dismissAllowingStateLoss();
        }

        @Override // dj.InterfaceC22985a
        /* JADX INFO: renamed from: b */
        public void mo64496b() {
            this.f50422a.dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: com.transsion.audio.fragment.AudioBottomSheetFragment$f */
    static final class C14219f implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f50424a;

        C14219f(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f50424a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f50424a;
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
            this.f50424a.invoke(obj);
        }
    }

    public AudioBottomSheetFragment() {
        super(R$layout.fragment_bottom_dialog_audio);
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.audio.fragment.AudioBottomSheetFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        this.subjectListViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(SubjectListViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.audio.fragment.AudioBottomSheetFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.audio.fragment.AudioBottomSheetFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                Object objInvoke = function0.invoke();
                InterfaceC3208m interfaceC3208m = objInvoke instanceof InterfaceC3208m ? (InterfaceC3208m) objInvoke : null;
                C3227v0.c defaultViewModelProviderFactory = interfaceC3208m != null ? interfaceC3208m.getDefaultViewModelProviderFactory() : null;
                if (defaultViewModelProviderFactory == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.m97801g(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.mAudioApi = LazyKt.m97097b(new Function0() { // from class: com.transsion.audio.fragment.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AudioBottomSheetFragment.mAudioApi_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    private final void m64468C0() {
        ViewPager2 viewPager2;
        MagicIndicator magicIndicator;
        CommonNavigator commonNavigator = new CommonNavigator(requireContext());
        this.commonNavigator = commonNavigator;
        commonNavigator.setAdapter(new C14215b());
        C23156a c23156a = this.mBindView;
        if (c23156a != null && (magicIndicator = c23156a.f70629e) != null) {
            magicIndicator.setNavigator(this.commonNavigator);
        }
        C23156a c23156a2 = this.mBindView;
        if (c23156a2 == null || (viewPager2 = c23156a2.f70631g) == null) {
            return;
        }
        viewPager2.registerOnPageChangeCallback(new C14216c());
    }

    /* JADX INFO: renamed from: E0 */
    private final void m64469E0() {
        HistoryListManager.f50535e.m64709b().m64706v().m14851j(this, new C14219f(new Function1() { // from class: com.transsion.audio.fragment.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AudioBottomSheetFragment.m64470F0(this.f50455a, (DownloadListBean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final Unit m64470F0(AudioBottomSheetFragment audioBottomSheetFragment, DownloadListBean downloadListBean) {
        audioBottomSheetFragment.m64471G0(downloadListBean);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: G0 */
    private final void m64471G0(DownloadListBean subjectInfo) {
        ViewPager2 viewPager2;
        String strValueOf;
        String str = null;
        String subjectTitle = subjectInfo != null ? subjectInfo.getSubjectTitle() : null;
        Integer totalEpisode = subjectInfo != null ? subjectInfo.getTotalEpisode() : null;
        String subjectId = subjectInfo != null ? subjectInfo.getSubjectId() : null;
        if (subjectInfo != null) {
            this.titleData = new String[2];
            if (subjectTitle != null && subjectTitle.length() > 27) {
                String strSubstring = subjectTitle.substring(0, 27);
                Intrinsics.m97801g(strSubstring, "substring(...)");
                subjectTitle = strSubstring + "...";
            }
            if (totalEpisode != null) {
                int iIntValue = totalEpisode.intValue();
                if (iIntValue > 0) {
                    strValueOf = ((Object) subjectTitle) + "(" + iIntValue + ")";
                } else {
                    strValueOf = String.valueOf(subjectTitle);
                }
                str = strValueOf;
            }
            String[] strArr = this.titleData;
            if (strArr != null) {
                strArr[0] = str;
            }
            if (strArr != null) {
                strArr[1] = getString(R$string.str_recently);
            }
        } else {
            this.titleData = new String[]{getString(R$string.str_recently)};
        }
        String[] strArr2 = this.titleData;
        this.titleViews = new RoomSimplePagerTitleView[strArr2 != null ? strArr2.length : 0];
        C23156a c23156a = this.mBindView;
        if (c23156a != null && (viewPager2 = c23156a.f70631g) != null) {
            viewPager2.setAdapter(new C14217d(subjectId));
        }
        m64468C0();
    }

    /* JADX INFO: renamed from: H0 */
    private final void m64472H0(View view) {
        TextView textView;
        AppCompatImageView appCompatImageView;
        C23156a c23156aM92196a = C23156a.m92196a(view);
        this.mBindView = c23156aM92196a;
        if (c23156aM92196a != null && (appCompatImageView = c23156aM92196a.f70626b) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.audio.fragment.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AudioBottomSheetFragment.m64473I0(this.f50453a, view2);
                }
            });
        }
        C23156a c23156a = this.mBindView;
        if (c23156a == null || (textView = c23156a.f70630f) == null) {
            return;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.audio.fragment.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AudioBottomSheetFragment.m64474J0(this.f50454a, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final void m64473I0(AudioBottomSheetFragment audioBottomSheetFragment, View view) {
        ClearTipsDialog clearTipsDialogM64465a = ClearTipsDialog.INSTANCE.m64465a();
        FragmentManager childFragmentManager = audioBottomSheetFragment.getChildFragmentManager();
        Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
        clearTipsDialogM64465a.show(childFragmentManager, "dialog");
        clearTipsDialogM64465a.m64464s0(new C14218e(clearTipsDialogM64465a, audioBottomSheetFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final void m64474J0(AudioBottomSheetFragment audioBottomSheetFragment, View view) {
        audioBottomSheetFragment.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23410a mAudioApi_delegate$lambda$0() {
        return (InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0]);
    }

    /* JADX INFO: renamed from: D0 */
    public final int m64488D0() {
        int i11 = getResources().getDisplayMetrics().heightPixels;
        return i11 - (i11 / 3);
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
            window.setWindowAnimations(R$style.BaseBottomDialogAnimation);
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
            attributes.height = m64488D0();
            window2.setBackgroundDrawable(null);
            window2.setAttributes(attributes);
        }
        return dialogC10016c;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m64472H0(view);
        m64469E0();
    }
}
