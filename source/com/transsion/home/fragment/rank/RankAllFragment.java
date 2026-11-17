package com.transsion.home.fragment.rank;

import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.AbstractC0783a0;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0784b;
import androidx.compose.foundation.layout.C0789d0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.AbstractC0905t;
import androidx.compose.foundation.lazy.InterfaceC0826b;
import androidx.compose.foundation.lazy.InterfaceC0906u;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p019ui.ComposedModifierKt;
import androidx.compose.p019ui.InterfaceC1262b;
import androidx.compose.p019ui.InterfaceC1302f;
import androidx.compose.p019ui.layout.InterfaceC1699t;
import androidx.compose.p019ui.node.ComposeUiNode;
import androidx.compose.p019ui.platform.ComposeView;
import androidx.compose.p019ui.text.font.AbstractC2046h;
import androidx.compose.p019ui.text.font.C2054p;
import androidx.compose.p019ui.text.style.AbstractC2159p;
import androidx.compose.runtime.AbstractC1113f3;
import androidx.compose.runtime.AbstractC1114g;
import androidx.compose.runtime.AbstractC1144k;
import androidx.compose.runtime.AbstractC1238u2;
import androidx.compose.runtime.AbstractC1241v1;
import androidx.compose.runtime.InterfaceC1109f;
import androidx.compose.runtime.InterfaceC1117g2;
import androidx.compose.runtime.InterfaceC1124i;
import androidx.compose.runtime.InterfaceC1126i1;
import androidx.compose.runtime.InterfaceC1176s;
import androidx.compose.runtime.internal.AbstractC1134b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.AbstractC13772o;
import com.p282tn.lib.view.NoNetworkBigView;
import com.p282tn.lib.view.StateView;
import com.p282tn.lib.view.TitleLayout;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.home.R$color;
import com.transsion.home.R$id;
import com.transsion.home.R$string;
import com.transsion.home.bean.CategoryType;
import com.transsion.home.bean.RankAllData;
import com.transsion.home.viewmodel.RankAllViewModel;
import com.transsion.moviedetailapi.bean.Subject;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26006c;
import p474i0.AbstractC23939b;
import p550kj.C24655b;
import p550kj.C24662i;
import p552kl.C24699u;
import p629o0.AbstractC26153x;
import p629o0.C26138i;
import p743rh.C27287m;
import p743rh.InterfaceC27288n;
import sh.C27621h;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0004J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J'\u0010'\u001a\u00020\u00052\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0$2\b\u0010&\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006@²\u0006\u0010\u0010?\u001a\u0004\u0018\u00010\f8\n@\nX\u008a\u008e\u0002"}, m97100d2 = {"Lcom/transsion/home/fragment/rank/RankAllFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lkl/u;", "<init>", "()V", "", "C0", "E0", "Landroid/view/View;", "getNoNetworkView", "()Landroid/view/View;", "v0", "", "getPageName", "()Ljava/lang/String;", "Lcom/transsion/home/bean/CategoryType;", "category", "", RequestParameters.POSITION, "D0", "(Lcom/transsion/home/bean/CategoryType;I)V", "Landroid/view/LayoutInflater;", "inflater", "z0", "(Landroid/view/LayoutInflater;)Lkl/u;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "startLoading", "hideLoading", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "", "items", "defaultCateGory", "i0", "(Ljava/util/List;Ljava/lang/String;Landroidx/compose/runtime/i;I)V", "Lcom/transsion/home/viewmodel/RankAllViewModel;", "a", "Lcom/transsion/home/viewmodel/RankAllViewModel;", "viewModel", "Lcom/transsion/home/fragment/rank/RankListFragment;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/home/fragment/rank/RankListFragment;", "listFragment", "", "c", "Z", "hasRenderFirst", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroid/view/View;", "mErrorView", "e", "I", "tabId", "f", "Ljava/lang/String;", "rankingListId", "g", "currentCategory", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class RankAllFragment extends BaseFragment<C24699u> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h */
    public static final int f53007h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private RankAllViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private RankListFragment listFragment;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean hasRenderFirst;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private View mErrorView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int tabId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String rankingListId;

    /* JADX INFO: renamed from: com.transsion.home.fragment.rank.RankAllFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final RankAllFragment m68027a(String str, Integer num, String str2, String str3) {
            Bundle bundle = new Bundle();
            bundle.putString("category", str);
            bundle.putInt("tabId", num != null ? num.intValue() : 0);
            bundle.putString("defaultCategory", str2);
            bundle.putString("rankingListId", str3);
            RankAllFragment rankAllFragment = new RankAllFragment();
            rankAllFragment.setArguments(bundle);
            return rankAllFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.rank.RankAllFragment$b */
    static final class C15266b implements Function3 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CategoryType f53014a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ RankAllFragment f53015b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f53016c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC1126i1 f53017d;

        C15266b(CategoryType categoryType, RankAllFragment rankAllFragment, int i11, InterfaceC1126i1 interfaceC1126i1) {
            this.f53014a = categoryType;
            this.f53015b = rankAllFragment;
            this.f53016c = i11;
            this.f53017d = interfaceC1126i1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final Unit m68029c(CategoryType categoryType, RankAllFragment rankAllFragment, int i11, InterfaceC1126i1 interfaceC1126i1) {
            if (!Intrinsics.m97797c(RankAllFragment.m68009j0(interfaceC1126i1), categoryType.getType())) {
                RankAllFragment.m68010k0(interfaceC1126i1, categoryType.getType());
                RankListFragment rankListFragment = rankAllFragment.listFragment;
                if (rankListFragment != null) {
                    rankListFragment.startLoading();
                }
                RankAllViewModel rankAllViewModel = rankAllFragment.viewModel;
                if (rankAllViewModel != null) {
                    rankAllViewModel.m68982k(RankAllFragment.m68009j0(interfaceC1126i1), rankAllFragment.tabId, rankAllFragment.rankingListId);
                }
                rankAllFragment.m67998D0(categoryType, i11);
            }
            return Unit.f75682a;
        }

        /* JADX INFO: renamed from: b */
        public final void m68030b(InterfaceC0826b item, InterfaceC1124i interfaceC1124i, int i11) {
            Intrinsics.m97802h(item, "$this$item");
            if ((i11 & 17) == 16 && interfaceC1124i.mo4471h()) {
                interfaceC1124i.mo4443G();
                return;
            }
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5039Q(-1073765077, i11, -1, "com.transsion.home.fragment.rank.RankAllFragment.SetRankCategoryUI.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RankAllFragment.kt:282)");
            }
            boolean zM97797c = Intrinsics.m97797c(RankAllFragment.m68009j0(this.f53017d), this.f53014a.getType());
            int i12 = zM97797c ? R$color.rank_all_list_background : R$color.rank_all_category_background;
            InterfaceC1262b.c cVarM5757h = InterfaceC1262b.f4036a.m5757h();
            InterfaceC1302f.a aVar = InterfaceC1302f.f4127a;
            InterfaceC1302f interfaceC1302fM3004b = BackgroundKt.m3004b(SizeKt.m3423p(SizeKt.m3411d(aVar, 0.0f, 1, null), null, false, 3, null), AbstractC23939b.m94702a(i12, interfaceC1124i, 0), null, 2, null);
            float fM102354g = C26138i.m102354g(0);
            FragmentActivity activity = this.f53015b.getActivity();
            InterfaceC1302f interfaceC1302fM3392f = PaddingKt.m3392f(interfaceC1302fM3004b, fM102354g, C26138i.m102354g((activity == null || !AbstractC14556b.m65670a(activity)) ? 16 : 20));
            interfaceC1124i.mo4456P(-1224400529);
            boolean zMo4433A = interfaceC1124i.mo4433A(this.f53014a) | interfaceC1124i.mo4433A(this.f53015b) | interfaceC1124i.mo4462c(this.f53016c);
            final CategoryType categoryType = this.f53014a;
            final RankAllFragment rankAllFragment = this.f53015b;
            final int i13 = this.f53016c;
            final InterfaceC1126i1 interfaceC1126i1 = this.f53017d;
            Object objMo4497y = interfaceC1124i.mo4497y();
            if (zMo4433A || objMo4497y == InterfaceC1124i.f3683a.m4902a()) {
                objMo4497y = new Function0() { // from class: com.transsion.home.fragment.rank.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RankAllFragment.C15266b.m68029c(categoryType, rankAllFragment, i13, interfaceC1126i1);
                    }
                };
                interfaceC1124i.mo4484p(objMo4497y);
            }
            interfaceC1124i.mo4448K();
            InterfaceC1302f interfaceC1302fM3044d = ClickableKt.m3044d(interfaceC1302fM3392f, false, null, null, (Function0) objMo4497y, 7, null);
            CategoryType categoryType2 = this.f53014a;
            InterfaceC1699t interfaceC1699tM3475b = AbstractC0783a0.m3475b(C0784b.f2739a.m3478c(), cVarM5757h, interfaceC1124i, 48);
            int iM4878a = AbstractC1114g.m4878a(interfaceC1124i, 0);
            InterfaceC1176s interfaceC1176sMo4481n = interfaceC1124i.mo4481n();
            InterfaceC1302f interfaceC1302fM5740e = ComposedModifierKt.m5740e(interfaceC1124i, interfaceC1302fM3044d);
            ComposeUiNode.Companion companion = ComposeUiNode.f5204c1;
            Function0 function0M7740a = companion.m7740a();
            if (!(interfaceC1124i.mo4472i() instanceof InterfaceC1109f)) {
                AbstractC1114g.m4879b();
            }
            interfaceC1124i.mo4437C();
            if (interfaceC1124i.mo4466e()) {
                interfaceC1124i.mo4442F(function0M7740a);
            } else {
                interfaceC1124i.mo4482o();
            }
            InterfaceC1124i interfaceC1124iM4876a = AbstractC1113f3.m4876a(interfaceC1124i);
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1699tM3475b, companion.m7742c());
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1176sMo4481n, companion.m7744e());
            Function2 function2M7741b = companion.m7741b();
            if (interfaceC1124iM4876a.mo4466e() || !Intrinsics.m97797c(interfaceC1124iM4876a.mo4497y(), Integer.valueOf(iM4878a))) {
                interfaceC1124iM4876a.mo4484p(Integer.valueOf(iM4878a));
                interfaceC1124iM4876a.mo4474k(Integer.valueOf(iM4878a), function2M7741b);
            }
            AbstractC1113f3.m4877b(interfaceC1124iM4876a, interfaceC1302fM5740e, companion.m7743d());
            C0789d0 c0789d0 = C0789d0.f2752a;
            interfaceC1124i.mo4456P(1353739126);
            if (zM97797c) {
                BoxKt.m3346a(BackgroundKt.m3004b(SizeKt.m3412e(SizeKt.m3419l(aVar, C26138i.m102354g(3)), C26138i.m102354g(16)), AbstractC23939b.m94702a(com.p282tn.lib.widget.R$color.brand, interfaceC1124i, 0), null, 2, null), interfaceC1124i, 0);
            }
            interfaceC1124i.mo4448K();
            int i14 = zM97797c ? com.p282tn.lib.widget.R$color.brand : R$color.rank_all_category_text;
            String name = categoryType2.getName();
            if (name == null) {
                name = "";
            }
            TextKt.m4312a(name, PaddingKt.m3393g(aVar, C26138i.m102354g(12), 0.0f, 2, null), AbstractC23939b.m94702a(i14, interfaceC1124i, 0), AbstractC26153x.m102447c(14), null, C2054p.f6244b.m9555c(), AbstractC2046h.f6219b.m9513b(), 0L, null, null, 0L, AbstractC2159p.f6537a.m10007b(), true, 2, 0, null, null, interfaceC1124i, 199728, 3504, 116624);
            interfaceC1124i.mo4487r();
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5038P();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m68030b((InterfaceC0826b) obj, (InterfaceC1124i) obj2, ((Number) obj3).intValue());
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.rank.RankAllFragment$c */
    static final class C15267c implements Function2 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ RankAllData f53019b;

        C15267c(RankAllData rankAllData) {
            this.f53019b = rankAllData;
        }

        /* JADX WARN: Code duplicated, block: B:43:0x0084  */
        /* JADX WARN: Code duplicated, block: B:45:0x0088  */
        /* JADX INFO: renamed from: a */
        public final void m68031a(InterfaceC1124i interfaceC1124i, int i11) {
            String currentCategoryType;
            List<CategoryType> arrayList;
            List<CategoryType> categoryList;
            if ((i11 & 3) == 2 && interfaceC1124i.mo4471h()) {
                interfaceC1124i.mo4443G();
                return;
            }
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5039Q(45154986, i11, -1, "com.transsion.home.fragment.rank.RankAllFragment.initView.<anonymous>.<anonymous> (RankAllFragment.kt:134)");
            }
            Bundle arguments = RankAllFragment.this.getArguments();
            String string = arguments != null ? arguments.getString("defaultCategory") : null;
            if (string == null || string.length() == 0) {
                RankAllData rankAllData = this.f53019b;
                currentCategoryType = rankAllData != null ? rankAllData.getCurrentCategoryType() : null;
            } else {
                currentCategoryType = string;
            }
            if (string != null && string.length() != 0) {
                RankAllData rankAllData2 = this.f53019b;
                if (rankAllData2 == null || (categoryList = rankAllData2.getCategoryList()) == null) {
                    RankAllData rankAllData3 = this.f53019b;
                    currentCategoryType = rankAllData3 != null ? rankAllData3.getCurrentCategoryType() : null;
                } else {
                    List<CategoryType> list = categoryList;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        RankAllData rankAllData4 = this.f53019b;
                        currentCategoryType = rankAllData4 != null ? rankAllData4.getCurrentCategoryType() : null;
                    } else {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                RankAllData rankAllData5 = this.f53019b;
                                currentCategoryType = rankAllData5 != null ? rankAllData5.getCurrentCategoryType() : null;
                            } else if (Intrinsics.m97797c(((CategoryType) it.next()).getType(), currentCategoryType)) {
                            }
                        }
                    }
                }
            }
            RankAllFragment rankAllFragment = RankAllFragment.this;
            RankAllData rankAllData6 = this.f53019b;
            if (rankAllData6 == null || (arrayList = rankAllData6.getCategoryList()) == null) {
                arrayList = new ArrayList<>();
            }
            rankAllFragment.m68025i0(arrayList, currentCategoryType, interfaceC1124i, 0);
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5038P();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m68031a((InterfaceC1124i) obj, ((Number) obj2).intValue());
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.rank.RankAllFragment$d */
    public static final class C15268d implements InterfaceC27288n {
        C15268d() {
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected() {
            InterfaceC27288n.a.m106338a(this);
        }

        @Override // p743rh.InterfaceC27288n
        public void onConnected(Network network, NetworkCapabilities networkCapabilities) {
            View view;
            Intrinsics.m97802h(network, "network");
            Intrinsics.m97802h(networkCapabilities, "networkCapabilities");
            if (RankAllFragment.this.isResumed() && (view = RankAllFragment.this.mErrorView) != null && AbstractC26006c.m102056i(view)) {
                View view2 = RankAllFragment.this.mErrorView;
                if (view2 != null) {
                    AbstractC26006c.m102054g(view2);
                }
                RankAllFragment.this.lazyLoadData();
            }
        }

        @Override // p743rh.InterfaceC27288n
        public void onDisconnected() {
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.rank.RankAllFragment$e */
    static final class C15269e implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f53021a;

        C15269e(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f53021a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f53021a;
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
            this.f53021a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m67995A0(RankAllFragment rankAllFragment, View view) {
        FragmentActivity activity = rankAllFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final Unit m67996B0(RankAllFragment rankAllFragment, RankAllData rankAllData) {
        ComposeView composeView;
        List<Subject> subjects;
        if (rankAllFragment.hasRenderFirst) {
            RankListFragment rankListFragment = rankAllFragment.listFragment;
            if (rankListFragment != null) {
                rankListFragment.hideLoading();
            }
        } else {
            rankAllFragment.hideLoading();
        }
        if (((rankAllData == null || (subjects = rankAllData.getSubjects()) == null) ? 0 : subjects.size()) <= 0) {
            rankAllFragment.m67999E0();
            return Unit.f75682a;
        }
        if (!rankAllFragment.hasRenderFirst) {
            C24699u mViewBinding = rankAllFragment.getMViewBinding();
            if (mViewBinding != null && (composeView = mViewBinding.f75579b) != null) {
                composeView.setContent(AbstractC1134b.m4967b(45154986, true, rankAllFragment.new C15267c(rankAllData)));
            }
            rankAllFragment.hasRenderFirst = true;
        }
        RankListFragment rankListFragment2 = rankAllFragment.listFragment;
        if (rankListFragment2 != null) {
            rankListFragment2.m68042k0(rankAllData);
        }
        C24655b logViewConfig = rankAllFragment.getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: C0 */
    private final void m67997C0() {
        setNetListener(new C15268d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public final void m67998D0(CategoryType category, int position) {
        String type;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("event_type", "category_click");
        if (category == null || (type = category.getType()) == null) {
            type = "";
        }
        linkedHashMap.put("category", type);
        linkedHashMap.put(RequestParameters.POSITION, String.valueOf(position));
        C24662i.f75350a.m96881p(getPageName(), linkedHashMap);
    }

    /* JADX INFO: renamed from: E0 */
    private final void m67999E0() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.transsion.home.fragment.rank.e
            @Override // java.lang.Runnable
            public final void run() {
                RankAllFragment.m68000F0(this.f53037a);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final void m68000F0(RankAllFragment rankAllFragment) {
        FrameLayout frameLayout;
        if (rankAllFragment.isDetached() || !rankAllFragment.isAdded() || rankAllFragment.getContext() == null) {
            return;
        }
        View viewM68021v0 = C27287m.f83003a.m106330e() ? rankAllFragment.m68021v0() : rankAllFragment.getNoNetworkView();
        if (rankAllFragment.hasRenderFirst) {
            RankListFragment rankListFragment = rankAllFragment.listFragment;
            if (rankListFragment != null) {
                rankListFragment.m68041j0(viewM68021v0);
            }
        } else {
            C24699u mViewBinding = rankAllFragment.getMViewBinding();
            if (mViewBinding != null && (frameLayout = mViewBinding.f75580c) != null) {
                frameLayout.removeAllViews();
                frameLayout.addView(viewM68021v0);
                frameLayout.setVisibility(0);
            }
        }
        rankAllFragment.mErrorView = viewM68021v0;
    }

    private final View getNoNetworkView() {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        final NoNetworkBigView noNetworkBigView = new NoNetworkBigView(contextRequireContext);
        noNetworkBigView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        NoNetworkBigView.showTitle$default(noNetworkBigView, false, null, 2, null);
        noNetworkBigView.retry(new Function0() { // from class: com.transsion.home.fragment.rank.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankAllFragment.m68023x0(noNetworkBigView, this);
            }
        });
        noNetworkBigView.goToSetting(new Function0() { // from class: com.transsion.home.fragment.rank.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankAllFragment.m68024y0(this.f53040a);
            }
        });
        AbstractC13772o.m62233a(getPageName());
        return noNetworkBigView;
    }

    private final String getPageName() {
        return "rank_all_page";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final String m68009j0(InterfaceC1126i1 interfaceC1126i1) {
        return (String) interfaceC1126i1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final void m68010k0(InterfaceC1126i1 interfaceC1126i1, String str) {
        interfaceC1126i1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final Unit m68011l0(List list, RankAllFragment rankAllFragment, InterfaceC1126i1 interfaceC1126i1, InterfaceC0906u LazyColumn) {
        Intrinsics.m97802h(LazyColumn, "$this$LazyColumn");
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            CategoryType categoryType = (CategoryType) obj;
            AbstractC0905t.m3886a(LazyColumn, categoryType.getType() + i11, null, AbstractC1134b.m4967b(-1073765077, true, new C15266b(categoryType, rankAllFragment, i11, interfaceC1126i1)), 2, null);
            i11 = i12;
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final Unit m68012m0(RankAllFragment rankAllFragment, List list, String str, int i11, InterfaceC1124i interfaceC1124i, int i12) {
        rankAllFragment.m68025i0(list, str, interfaceC1124i, AbstractC1241v1.m5707a(i11 | 1));
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: v0 */
    private final View m68021v0() {
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        StateView stateView = new StateView(contextRequireContext);
        stateView.showData(3, 1, false, "", "");
        stateView.retry(new Function0() { // from class: com.transsion.home.fragment.rank.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankAllFragment.m68022w0(this.f53041a);
            }
        });
        return stateView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final Unit m68022w0(RankAllFragment rankAllFragment) {
        rankAllFragment.lazyLoadData();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final Unit m68023x0(NoNetworkBigView noNetworkBigView, RankAllFragment rankAllFragment) {
        AbstractC26006c.m102054g(noNetworkBigView);
        rankAllFragment.lazyLoadData();
        AbstractC13772o.m62234b(rankAllFragment.getPageName());
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final Unit m68024y0(RankAllFragment rankAllFragment) {
        AbstractC13772o.m62235c(rankAllFragment.getPageName());
        return Unit.f75682a;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void hideLoading() {
        ConstraintLayout constraintLayout;
        C24699u mViewBinding = getMViewBinding();
        if (mViewBinding == null || (constraintLayout = mViewBinding.f75581d) == null) {
            return;
        }
        AbstractC26006c.m102055h(constraintLayout);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m68025i0(final List items, final String str, InterfaceC1124i interfaceC1124i, final int i11) {
        int i12;
        InterfaceC1124i interfaceC1124i2;
        Intrinsics.m97802h(items, "items");
        InterfaceC1124i interfaceC1124iMo4469g = interfaceC1124i.mo4469g(-1793930920);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC1124iMo4469g.mo4433A(items) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC1124iMo4469g.mo4455O(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC1124iMo4469g.mo4433A(this) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && interfaceC1124iMo4469g.mo4471h()) {
            interfaceC1124iMo4469g.mo4443G();
            interfaceC1124i2 = interfaceC1124iMo4469g;
        } else {
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5039Q(-1793930920, i12, -1, "com.transsion.home.fragment.rank.RankAllFragment.SetRankCategoryUI (RankAllFragment.kt:276)");
            }
            interfaceC1124iMo4469g.mo4456P(1849434622);
            Object objMo4497y = interfaceC1124iMo4469g.mo4497y();
            InterfaceC1124i.a aVar = InterfaceC1124i.f3683a;
            if (objMo4497y == aVar.m4902a()) {
                objMo4497y = AbstractC1238u2.m5702c(str, null, 2, null);
                interfaceC1124iMo4469g.mo4484p(objMo4497y);
            }
            final InterfaceC1126i1 interfaceC1126i1 = (InterfaceC1126i1) objMo4497y;
            interfaceC1124iMo4469g.mo4448K();
            InterfaceC1302f interfaceC1302fM3004b = BackgroundKt.m3004b(InterfaceC1302f.f4127a, AbstractC23939b.m94702a(R$color.rank_all_category_background, interfaceC1124iMo4469g, 0), null, 2, null);
            interfaceC1124iMo4469g.mo4456P(-1746271574);
            boolean zMo4433A = interfaceC1124iMo4469g.mo4433A(items) | interfaceC1124iMo4469g.mo4433A(this);
            Object objMo4497y2 = interfaceC1124iMo4469g.mo4497y();
            if (zMo4433A || objMo4497y2 == aVar.m4902a()) {
                objMo4497y2 = new Function1() { // from class: com.transsion.home.fragment.rank.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RankAllFragment.m68011l0(items, this, interfaceC1126i1, (InterfaceC0906u) obj);
                    }
                };
                interfaceC1124iMo4469g.mo4484p(objMo4497y2);
            }
            interfaceC1124iMo4469g.mo4448K();
            interfaceC1124i2 = interfaceC1124iMo4469g;
            LazyDslKt.m3546a(interfaceC1302fM3004b, null, null, false, null, null, null, false, (Function1) objMo4497y2, interfaceC1124iMo4469g, 0, 254);
            if (AbstractC1144k.m5030H()) {
                AbstractC1144k.m5038P();
            }
        }
        InterfaceC1117g2 interfaceC1117g2Mo4473j = interfaceC1124i2.mo4473j();
        if (interfaceC1117g2Mo4473j != null) {
            interfaceC1117g2Mo4473j.mo4602a(new Function2() { // from class: com.transsion.home.fragment.rank.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RankAllFragment.m68012m0(this.f53033a, items, str, i11, (InterfaceC1124i) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        C3187b0 c3187b0M68981j;
        TitleLayout titleLayout;
        Intrinsics.m97802h(view, "view");
        C24699u mViewBinding = getMViewBinding();
        if (mViewBinding != null && (titleLayout = mViewBinding.f75582e) != null) {
            titleLayout.setLeftOnclick(new View.OnClickListener() { // from class: com.transsion.home.fragment.rank.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RankAllFragment.m67995A0(this.f53028a, view2);
                }
            });
            String string = getString(R$string.str_ranking);
            Intrinsics.m97801g(string, "getString(...)");
            titleLayout.setTitleText(string);
            C27621h c27621h = C27621h.f84745a;
            Context context = titleLayout.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            titleLayout.setPadding(0, c27621h.m107454d(context), 0, 0);
        }
        RankAllViewModel rankAllViewModel = this.viewModel;
        if (rankAllViewModel != null && (c3187b0M68981j = rankAllViewModel.m68981j()) != null) {
            c3187b0M68981j.m14851j(this, new C15269e(new Function1() { // from class: com.transsion.home.fragment.rank.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RankAllFragment.m67996B0(this.f53029a, (RankAllData) obj);
                }
            }));
        }
        Fragment fragmentM14544j0 = getChildFragmentManager().m14544j0(R$id.rank_all_category_item_fragment);
        Intrinsics.m97800f(fragmentM14544j0, "null cannot be cast to non-null type com.transsion.home.fragment.rank.RankListFragment");
        this.listFragment = (RankListFragment) fragmentM14544j0;
        m67997C0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        if (this.hasRenderFirst) {
            RankListFragment rankListFragment = this.listFragment;
            if (rankListFragment != null) {
                rankListFragment.startLoading();
            }
        } else {
            startLoading();
        }
        Bundle arguments = getArguments();
        this.tabId = arguments != null ? arguments.getInt("tabId") : 0;
        Bundle arguments2 = getArguments();
        this.rankingListId = arguments2 != null ? arguments2.getString("rankingListId") : null;
        RankAllViewModel rankAllViewModel = this.viewModel;
        if (rankAllViewModel != null) {
            Bundle arguments3 = getArguments();
            rankAllViewModel.m68982k(arguments3 != null ? arguments3.getString("category") : null, this.tabId, this.rankingListId);
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        return new C24655b(getPageName(), false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void startLoading() {
        FrameLayout frameLayout;
        ConstraintLayout constraintLayout;
        C24699u mViewBinding = getMViewBinding();
        if (mViewBinding != null && (constraintLayout = mViewBinding.f75581d) != null) {
            AbstractC26006c.m102058k(constraintLayout);
        }
        C24699u mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (frameLayout = mViewBinding2.f75580c) == null) {
            return;
        }
        AbstractC26006c.m102054g(frameLayout);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public C24699u getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.viewModel = (RankAllViewModel) new C3227v0(activity).m14969a(RankAllViewModel.class);
        }
        C24699u c24699uM97009c = C24699u.m97009c(inflater);
        Intrinsics.m97801g(c24699uM97009c, "inflate(...)");
        return c24699uM97009c;
    }
}
