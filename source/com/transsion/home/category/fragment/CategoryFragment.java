package com.transsion.home.category.fragment;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.AbstractC2397b;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import ck.C5123t;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.google.android.material.appbar.AppBarLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.net.bean.BaseDto;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$string;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.C14557c;
import com.transsion.home.R$id;
import com.transsion.home.bean.CategoryBean;
import com.transsion.home.category.CategoryActivity;
import com.transsion.home.category.adapter.C15112e;
import com.transsion.home.category.fragment.CategoryFragment;
import com.transsion.home.viewmodel.CategoryViewModel;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.CategoryItemBean;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.PlayUrl;
import com.transsion.moviedetailapi.bean.ResourceDetectors;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.p285ad.bidding.nativead.BiddingListManager;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.DownloadManagerApi;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.AddToDownloadEvent;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C25220y0;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p550kj.C24655b;
import p552kl.C24687l;
import p579ll.C25646b;
import p579ll.InterfaceC25645a;
import p743rh.C27287m;
import p765s6.InterfaceC27564b;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p842vl.C28120b;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 Q2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0019\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010\u0004J\u0017\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010\u001fJ!\u0010*\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010\u0004J\u000f\u0010,\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010\u0004J\u000f\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010\u0004J\u000f\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010\u0004J\u000f\u0010/\u001a\u00020\tH\u0016¢\u0006\u0004\b/\u0010\u0004J\u000f\u00100\u001a\u00020\tH\u0016¢\u0006\u0004\b0\u0010\u0004J\u000f\u00101\u001a\u00020\tH\u0016¢\u0006\u0004\b1\u0010\u0004J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\tH\u0016¢\u0006\u0004\b5\u0010\u0004R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010?R\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0018\u0010P\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006R"}, m97100d2 = {"Lcom/transsion/home/category/fragment/CategoryFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lkl/l;", "<init>", "()V", "Lcom/transsion/moviedetailapi/bean/CategoryItemBean;", "categoryItemBean", "", RequestParameters.POSITION, "", "z0", "(Lcom/transsion/moviedetailapi/bean/CategoryItemBean;I)V", WebConstants.FIELD_ITEM, "D0", "reload", "Lcom/transsion/home/bean/CategoryBean;", "categoryBean", "O0", "(Lcom/transsion/home/bean/CategoryBean;)V", "loadMore", "loadData", "", "isExpand", "y0", "(Z)V", "Lcom/transsion/moviedetailapi/bean/Subject;", "C0", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", "M0", "", "getPageName", "()Ljava/lang/String;", "initAd", "Landroid/view/LayoutInflater;", "inflater", "B0", "(Landroid/view/LayoutInflater;)Lkl/l;", "getPageStateLayoutTitle", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initViewData", "(Landroid/view/View;Landroid/os/Bundle;)V", "initViewModel", "loadDefaultData", "initListener", "retryLoadData", "onPause", "onDestroyView", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "onDestroy", "Lcom/transsion/home/viewmodel/CategoryViewModel;", "a", "Lcom/transsion/home/viewmodel/CategoryViewModel;", "viewModel", "Lcom/transsion/home/category/adapter/e;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/home/category/adapter/e;", "mAdapter", "c", "Ljava/lang/String;", "categoryType", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "showType", "Lll/b;", "e", "Lll/b;", "mExposureHelper", "Lvl/b;", "f", "Lkotlin/Lazy;", "A0", "()Lvl/b;", "categoryDotHelper", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "g", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "v3ListManager", "h", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class CategoryFragment extends PageStatusFragment<C24687l> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i */
    public static final int f52643i = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private CategoryViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C15112e mAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String categoryType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String showType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private C25646b mExposureHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy categoryDotHelper = LazyKt.m97097b(new Function0() { // from class: jl.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CategoryFragment.m67481x0();
        }
    });

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private BiddingListManager v3ListManager;

    /* JADX INFO: renamed from: com.transsion.home.category.fragment.CategoryFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Fragment m67485a(String str, String str2) {
            Bundle bundleM11890a = AbstractC2411d.m11890a();
            bundleM11890a.putString("category_type", str);
            if (str2 == null) {
                str2 = "1";
            }
            bundleM11890a.putString("showType", str2);
            CategoryFragment categoryFragment = new CategoryFragment();
            categoryFragment.setArguments(bundleM11890a);
            return categoryFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.category.fragment.CategoryFragment$b */
    public static final class C15122b implements InterfaceC25645a {
        C15122b() {
        }

        @Override // p579ll.InterfaceC25645a
        /* JADX INFO: renamed from: a */
        public void mo67486a(int i11, long j11, View view) {
            Subject subject;
            Boolean hasResource;
            Subject subject2;
            Subject subject3;
            List<Object> data;
            C15112e c15112e = CategoryFragment.this.mAdapter;
            boolean zBooleanValue = false;
            if (i11 >= ((c15112e == null || (data = c15112e.getData()) == null) ? 0 : data.size())) {
                return;
            }
            C15112e c15112e2 = CategoryFragment.this.mAdapter;
            CategoryItemBean categoryItemBean = c15112e2 != null ? (CategoryItemBean) c15112e2.m36182f0(i11) : null;
            C28120b c28120bM67453A0 = CategoryFragment.this.m67453A0();
            String pageName = CategoryFragment.this.getPageName();
            String subjectId = (categoryItemBean == null || (subject3 = categoryItemBean.getSubject()) == null) ? null : subject3.getSubjectId();
            String ops = (categoryItemBean == null || (subject2 = categoryItemBean.getSubject()) == null) ? null : subject2.getOps();
            Integer numValueOf = Integer.valueOf(i11);
            String itemType = categoryItemBean != null ? categoryItemBean.getItemType() : null;
            if (categoryItemBean != null && (subject = categoryItemBean.getSubject()) != null && (hasResource = subject.getHasResource()) != null) {
                zBooleanValue = hasResource.booleanValue();
            }
            c28120bM67453A0.m109208a(pageName, subjectId, ops, numValueOf, itemType, zBooleanValue, CategoryFragment.this.categoryType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public final C28120b m67453A0() {
        return (C28120b) this.categoryDotHelper.getValue();
    }

    /* JADX INFO: renamed from: C0 */
    private final void m67454C0(Subject item) {
        if (item == null) {
            return;
        }
        Navigator.m61845x(TheRouter.m61773c("/playvideo/detail").m61857K("id", item.getSubjectId()).m61852F("season", item.getSeason()).m61857K("ops", AbstractC15126a.m67531a(item, this.categoryType)), getContext(), null, 2, null);
    }

    /* JADX INFO: renamed from: D0 */
    private final void m67455D0(CategoryItemBean item, int position) {
        Integer subjectType;
        PlayUrl playUrl;
        String playUrl2;
        PlayUrl playUrl3;
        String playUrl4;
        Boolean hasResource;
        Subject subject = item.getSubject();
        boolean zBooleanValue = false;
        if (subject == null || !subject.isShortTV()) {
            Subject subject2 = item.getSubject();
            if (subject2 == null || !subject2.isJumpBrowser()) {
                Subject subject3 = item.getSubject();
                if (subject3 == null || !subject3.isJumpWebview()) {
                    Navigator navigatorM61773c = TheRouter.m61773c("/movie/detail");
                    Subject subject4 = item.getSubject();
                    Navigator navigatorM61852F = navigatorM61773c.m61852F("subject_type", (subject4 == null || (subjectType = subject4.getSubjectType()) == null) ? SubjectType.MOVIE.getValue() : subjectType.intValue());
                    Subject subject5 = item.getSubject();
                    Navigator navigatorM61857K = navigatorM61852F.m61857K("id", subject5 != null ? subject5.getSubjectId() : null);
                    Subject subject6 = item.getSubject();
                    Navigator.m61845x(navigatorM61857K.m61852F("season", subject6 != null ? subject6.getSeason() : 0).m61857K("ops", AbstractC15126a.m67531a(item.getSubject(), this.categoryType)), getContext(), null, 2, null);
                } else {
                    Subject subject7 = item.getSubject();
                    if (subject7 != null && (playUrl = subject7.getPlayUrl()) != null && (playUrl2 = playUrl.getPlayUrl()) != null) {
                        AbstractC5114k.m23925h(playUrl2, null, 1, null);
                    }
                }
            } else {
                Subject subject8 = item.getSubject();
                if (subject8 != null && (playUrl3 = subject8.getPlayUrl()) != null && (playUrl4 = playUrl3.getPlayUrl()) != null) {
                    AbstractC5114k.m23926i(playUrl4);
                }
            }
        } else {
            DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
            Context context = getContext();
            Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            downloadManagerApiM87093a.m87086d0((FragmentActivity) context, getPageName(), (384 & 4) != 0 ? "" : "", AbstractC15126a.m67531a(item.getSubject(), this.categoryType), (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : false, (384 & 64) != 0 ? null : item.getSubject(), (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : null);
        }
        C28120b c28120bM67453A0 = m67453A0();
        String pageName = getPageName();
        Subject subject9 = item.getSubject();
        String subjectId = subject9 != null ? subject9.getSubjectId() : null;
        Subject subject10 = item.getSubject();
        String ops = subject10 != null ? subject10.getOps() : null;
        Integer numValueOf = Integer.valueOf(position);
        String itemType = item.getItemType();
        Subject subject11 = item.getSubject();
        if (subject11 != null && (hasResource = subject11.getHasResource()) != null) {
            zBooleanValue = hasResource.booleanValue();
        }
        c28120bM67453A0.m109209b(pageName, subjectId, ops, numValueOf, itemType, zBooleanValue, this.categoryType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final Unit m67456E0(CategoryFragment categoryFragment, int i11, BiddingNativeManager current) {
        List<Object> data;
        Intrinsics.m97802h(current, "current");
        if (current != null) {
            CategoryItemBean categoryItemBean = new CategoryItemBean(null, null, new Subject(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, 0, null, null, null, null, null, -1, 67108863, null), 3, null);
            Subject subject = categoryItemBean.getSubject();
            if (subject != null) {
                subject.setNonAdDelegate(current);
            }
            C15112e c15112e = categoryFragment.mAdapter;
            if (i11 < ((c15112e == null || (data = c15112e.getData()) == null) ? 0 : data.size())) {
                C15112e c15112e2 = categoryFragment.mAdapter;
                if (c15112e2 != null) {
                    c15112e2.mo36199n(i11, categoryItemBean);
                }
            } else {
                C15112e c15112e3 = categoryFragment.mAdapter;
                if (c15112e3 != null) {
                    c15112e3.mo36205p(categoryItemBean);
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final void m67457F0(CategoryFragment categoryFragment, View view) {
        FragmentActivity activity = categoryFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final void m67458G0(final CategoryFragment categoryFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            categoryFragment.loadMore();
            return;
        }
        C28951b.f88586a.m111454d(R$string.no_network_toast);
        C24687l mViewBinding = categoryFragment.getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f75498e) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: jl.i
            @Override // java.lang.Runnable
            public final void run() {
                CategoryFragment.m67459H0(this.f74492a);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final void m67459H0(CategoryFragment categoryFragment) {
        C27941f c27941fM36186h0;
        C15112e c15112e = categoryFragment.mAdapter;
        if (c15112e == null || (c27941fM36186h0 = c15112e.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final void m67460I0(CategoryFragment categoryFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        Object item = adapter.getItem(i11);
        if (item instanceof CategoryItemBean) {
            categoryFragment.m67455D0((CategoryItemBean) item, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final void m67461J0(CategoryFragment categoryFragment, BaseQuickAdapter adapter, View view, int i11) {
        List<Object> data;
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 2000L)) {
            return;
        }
        C15112e c15112e = categoryFragment.mAdapter;
        CategoryItemBean categoryItemBean = (c15112e == null || (data = c15112e.getData()) == null) ? null : (CategoryItemBean) CollectionsKt.m97362l0(data, i11);
        if (categoryItemBean == null || view.getId() != R$id.ll_download) {
            return;
        }
        categoryFragment.m67483z0(categoryItemBean, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final void m67462K0(CategoryFragment categoryFragment, C24687l c24687l, AppBarLayout appBarLayout, int i11) {
        if (categoryFragment.getContext() == null) {
            return;
        }
        if (Math.abs(i11) >= appBarLayout.getTotalScrollRange()) {
            c24687l.f75499f.setBackgroundColor(AbstractC2397b.getColor(categoryFragment.requireContext(), R$color.bg_01));
            c24687l.f75496c.setImageTintList(ColorStateList.valueOf(AbstractC2397b.getColor(categoryFragment.requireContext(), R$color.btn_back)));
            AppCompatTextView tvTitle = c24687l.f75500g;
            Intrinsics.m97801g(tvTitle, "tvTitle");
            AbstractC26006c.m102058k(tvTitle);
            AppCompatTextView tvTitleExpand = c24687l.f75501h;
            Intrinsics.m97801g(tvTitleExpand, "tvTitleExpand");
            AbstractC26006c.m102054g(tvTitleExpand);
            categoryFragment.m67482y0(true);
            return;
        }
        c24687l.f75499f.setBackgroundColor(AbstractC2397b.getColor(categoryFragment.requireContext(), R$color.transparent));
        c24687l.f75496c.setImageTintList(ColorStateList.valueOf(AbstractC2397b.getColor(categoryFragment.requireContext(), R$color.common_white)));
        AppCompatTextView tvTitle2 = c24687l.f75500g;
        Intrinsics.m97801g(tvTitle2, "tvTitle");
        AbstractC26006c.m102054g(tvTitle2);
        AppCompatTextView tvTitleExpand2 = c24687l.f75501h;
        Intrinsics.m97801g(tvTitleExpand2, "tvTitleExpand");
        AbstractC26006c.m102058k(tvTitleExpand2);
        categoryFragment.m67482y0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final Unit m67463L0(CategoryFragment categoryFragment, BaseDto baseDto) {
        List<Object> data;
        HashMap mapM96844g;
        C15112e c15112e;
        C27941f c27941fM36186h0;
        Pager pager;
        C27941f c27941fM36186h1;
        C15112e c15112e2;
        C27941f c27941fM36186h2;
        CategoryBean categoryBean;
        List<CategoryItemBean> list;
        C26866a.a.m104898f(C26866a.f81698a, "CategoryFragment", "return code=" + (baseDto != null ? baseDto.getCode() : null) + " size=" + ((baseDto == null || (categoryBean = (CategoryBean) baseDto.getData()) == null || (list = categoryBean.getList()) == null) ? null : Integer.valueOf(list.size())), false, 4, null);
        if (baseDto == null) {
            return Unit.f75682a;
        }
        categoryFragment.showContentView();
        C15112e c15112e3 = categoryFragment.mAdapter;
        if (c15112e3 != null && (c27941fM36186h1 = c15112e3.m36186h0()) != null && c27941fM36186h1.m108666r() && (c15112e2 = categoryFragment.mAdapter) != null && (c27941fM36186h2 = c15112e2.m36186h0()) != null) {
            c27941fM36186h2.m108667s();
        }
        if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
            CategoryBean categoryBean2 = (CategoryBean) baseDto.getData();
            if (((categoryBean2 == null || (pager = categoryBean2.getPager()) == null) ? false : Intrinsics.m97797c(pager.getHasMore(), Boolean.FALSE)) && (c15112e = categoryFragment.mAdapter) != null && (c27941fM36186h0 = c15112e.m36186h0()) != null) {
                C27941f.m108652u(c27941fM36186h0, false, 1, null);
            }
            categoryFragment.m67466O0((CategoryBean) baseDto.getData());
            C24655b logViewConfig = categoryFragment.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
            C24655b logViewConfig2 = categoryFragment.getLogViewConfig();
            if (logViewConfig2 != null) {
                CategoryBean categoryBean3 = (CategoryBean) baseDto.getData();
                logViewConfig2.m96851n(categoryBean3 != null ? categoryBean3.getOps() : null);
            }
        } else {
            C15112e c15112e4 = categoryFragment.mAdapter;
            if ((c15112e4 == null || (data = c15112e4.getData()) == null || data.size() != 0) ? false : true) {
                PageStatusFragment.showEmptyView$default(categoryFragment, false, 1, null);
            }
        }
        C24655b logViewConfig3 = categoryFragment.getLogViewConfig();
        if (logViewConfig3 != null && (mapM96844g = logViewConfig3.m96844g()) != null) {
            mapM96844g.put("category_type", categoryFragment.categoryType);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: M0 */
    private final void m67464M0() {
        Function1 function1 = new Function1() { // from class: jl.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CategoryFragment.m67465N0(this.f74491a, (AddToDownloadEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = AddToDownloadEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final Unit m67465N0(CategoryFragment categoryFragment, AddToDownloadEvent value) {
        C15112e c15112e;
        List<Object> data;
        Intrinsics.m97802h(value, "value");
        try {
            C15112e c15112e2 = categoryFragment.mAdapter;
            int i11 = -1;
            if (c15112e2 != null && (data = c15112e2.getData()) != null) {
                Iterator<Object> it = data.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    Subject subject = ((CategoryItemBean) it.next()).getSubject();
                    if (Intrinsics.m97797c(subject != null ? subject.getSubjectId() : null, value.getSubjectId())) {
                        i11 = i12;
                        break;
                    }
                    i12++;
                }
            }
            if (i11 >= 0 && (c15112e = categoryFragment.mAdapter) != null) {
                c15112e.notifyItemChanged(i11);
            }
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: O0 */
    private final void m67466O0(CategoryBean categoryBean) {
        C24687l mViewBinding;
        List<Object> data;
        String url;
        Subject subject;
        Cover cover;
        String thumbnail;
        Subject subject2;
        Cover cover2;
        List<Object> data2;
        C15112e c15112e;
        if (categoryBean == null || (mViewBinding = getMViewBinding()) == null) {
            return;
        }
        mViewBinding.f75500g.setText(categoryBean.getDesc());
        mViewBinding.f75501h.setText(categoryBean.getDesc());
        List<CategoryItemBean> list = categoryBean.getList();
        if (list != null && (c15112e = this.mAdapter) != null) {
            c15112e.mo36208q(list);
        }
        C15112e c15112e2 = this.mAdapter;
        if (c15112e2 == null || (data = c15112e2.getData()) == null || !(!data.isEmpty())) {
            return;
        }
        C15112e c15112e3 = this.mAdapter;
        CategoryItemBean categoryItemBean = (c15112e3 == null || (data2 = c15112e3.getData()) == null) ? null : (CategoryItemBean) data2.get(0);
        C23860f.a aVar = C23860f.f72909a;
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        C23860f.b bVarM94457m = aVar.m94457m(contextRequireContext);
        String str = "";
        if (categoryItemBean == null || (subject2 = categoryItemBean.getSubject()) == null || (cover2 = subject2.getCover()) == null || (url = cover2.getUrl()) == null) {
            url = "";
        }
        C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
        if (categoryItemBean != null && (subject = categoryItemBean.getSubject()) != null && (cover = subject.getCover()) != null && (thumbnail = cover.getThumbnail()) != null) {
            str = thumbnail;
        }
        C23860f.b bVarM94473l = bVarM94468g.m94473l(str);
        AppCompatImageView ivCover = mViewBinding.f75497d;
        Intrinsics.m97801g(ivCover, "ivCover");
        bVarM94473l.m94465d(ivCover);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPageName() {
        return "category";
    }

    private final void initAd() {
        BiddingListManager biddingListManager = new BiddingListManager();
        C24687l mViewBinding = getMViewBinding();
        biddingListManager.m63184F(mViewBinding != null ? mViewBinding.f75498e : null);
        biddingListManager.m63179A(AbstractC3226v.m14968a(this));
        biddingListManager.m63185G("PlayListScene");
        biddingListManager.m63192z(new Function2() { // from class: jl.j
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CategoryFragment.m67456E0(this.f74493a, ((Integer) obj).intValue(), (BiddingNativeManager) obj2);
            }
        });
        this.v3ListManager = biddingListManager;
    }

    private final void loadData() {
        CategoryViewModel categoryViewModel = this.viewModel;
        if (categoryViewModel == null) {
            Intrinsics.m97819y("viewModel");
            categoryViewModel = null;
        }
        String str = this.categoryType;
        if (str == null) {
            str = "Nollywood";
        }
        categoryViewModel.m68905i(str);
    }

    private final void loadMore() {
        loadData();
    }

    private final void reload() {
        if (C27287m.f83003a.m106330e()) {
            loadDefaultData();
        } else {
            showLoadingView();
            showNoNetworkViewDelayed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C28120b m67481x0() {
        return new C28120b();
    }

    /* JADX INFO: renamed from: y0 */
    private final void m67482y0(boolean isExpand) {
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            if (activity instanceof CategoryActivity) {
                ((CategoryActivity) activity).m67432b0(isExpand);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0054  */
    /* JADX WARN: Code duplicated, block: B:14:0x005e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    /* JADX WARN: Code duplicated, block: B:17:0x006e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
    /* JADX INFO: renamed from: z0 */
    private final void m67483z0(CategoryItemBean categoryItemBean, int position) {
        DownloadManagerApi.C21276a c21276a;
        DownloadManagerApi downloadManagerApiM87093a;
        String subjectId;
        String resourceId;
        boolean z11;
        String resourceLink;
        Subject subject;
        String str;
        ResourceDetectors resourceDetector;
        String subjectId2;
        ResourceDetectors resourceDetector2;
        Boolean hasResource;
        Context context = getContext();
        if (context != null) {
            Subject subject2 = categoryItemBean.getSubject();
            boolean zBooleanValue = false;
            if (subject2 != null) {
                Integer subjectType = subject2.getSubjectType();
                int value = SubjectType.SHORT_TV.getValue();
                if (subjectType != null && subjectType.intValue() == value) {
                    DownloadManagerApi downloadManagerApiM87093a2 = DownloadManagerApi.f66480j.m87093a();
                    Context context2 = getContext();
                    Intrinsics.m97800f(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    downloadManagerApiM87093a2.m87086d0((FragmentActivity) context2, "playlist", (384 & 4) != 0 ? "" : "", AbstractC15126a.m67531a(subject2, this.categoryType), (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : true, (384 & 64) != 0 ? null : subject2, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : null);
                    str = "download_subject";
                    subject = subject2;
                } else if (C5123t.f17614a.m23960b()) {
                    m67454C0(subject2);
                    subject = subject2;
                    str = "play_subject";
                } else {
                    c21276a = DownloadManagerApi.f66480j;
                    downloadManagerApiM87093a = c21276a.m87093a();
                    if (subject2 != null) {
                        subjectId = subject2.getSubjectId();
                    } else {
                        subjectId = null;
                    }
                    if (subject2 != null || (resourceDetector2 = subject2.getResourceDetector()) == null) {
                        resourceId = null;
                    } else {
                        resourceId = resourceDetector2.getResourceId();
                    }
                    if (subject2 == null && subject2.isSeries()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (DownloadManagerApi.m87075x0(downloadManagerApiM87093a, subjectId, resourceId, z11, false, 8, null)) {
                        if (subject2 == null && (subjectId2 = subject2.getSubjectId()) != null) {
                            DownloadManagerApi.m87078z0(c21276a.m87093a(), subjectId2, context, "playlist", null, 8, null);
                        }
                        str = "play_subject";
                        subject = subject2;
                    } else {
                        DownloadManagerApi downloadManagerApiM87093a3 = c21276a.m87093a();
                        FragmentActivity fragmentActivityRequireActivity = requireActivity();
                        Intrinsics.m97801g(fragmentActivityRequireActivity, "requireActivity(...)");
                        String strM67531a = AbstractC15126a.m67531a(subject2, this.categoryType);
                        if (subject2 != null || (resourceDetector = subject2.getResourceDetector()) == null || (resourceLink = resourceDetector.getResourceLink()) == null) {
                            resourceLink = "";
                        }
                        subject = subject2;
                        downloadManagerApiM87093a3.m87080K(fragmentActivityRequireActivity, subject2, "playlist", (960 & 8) != 0 ? "" : null, strM67531a, resourceLink, (960 & 64) != 0 ? "" : null, (960 & 128) != 0 ? null : null, (960 & 256) != 0 ? null : null, (960 & 512) != 0 ? false : false);
                        str = "download_subject";
                    }
                }
            } else if (C5123t.f17614a.m23960b()) {
                m67454C0(subject2);
                subject = subject2;
                str = "play_subject";
            } else {
                c21276a = DownloadManagerApi.f66480j;
                downloadManagerApiM87093a = c21276a.m87093a();
                if (subject2 != null) {
                    subjectId = subject2.getSubjectId();
                } else {
                    subjectId = null;
                }
                if (subject2 != null) {
                    resourceId = null;
                } else {
                    resourceId = null;
                }
                if (subject2 == null) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                if (DownloadManagerApi.m87075x0(downloadManagerApiM87093a, subjectId, resourceId, z11, false, 8, null)) {
                    if (subject2 == null) {
                    }
                    str = "play_subject";
                    subject = subject2;
                } else {
                    DownloadManagerApi downloadManagerApiM87093a4 = c21276a.m87093a();
                    FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
                    Intrinsics.m97801g(fragmentActivityRequireActivity2, "requireActivity(...)");
                    String strM67531a2 = AbstractC15126a.m67531a(subject2, this.categoryType);
                    if (subject2 != null) {
                        resourceLink = "";
                    } else {
                        resourceLink = "";
                    }
                    subject = subject2;
                    downloadManagerApiM87093a4.m87080K(fragmentActivityRequireActivity2, subject2, "playlist", (960 & 8) != 0 ? "" : null, strM67531a2, resourceLink, (960 & 64) != 0 ? "" : null, (960 & 128) != 0 ? null : null, (960 & 256) != 0 ? null : null, (960 & 512) != 0 ? false : false);
                    str = "download_subject";
                }
            }
            C28120b c28120bM67453A0 = m67453A0();
            String subjectId3 = subject != null ? subject.getSubjectId() : null;
            String ops = subject != null ? subject.getOps() : null;
            Integer numValueOf = Integer.valueOf(position);
            String itemType = categoryItemBean.getItemType();
            if (subject != null && (hasResource = subject.getHasResource()) != null) {
                zBooleanValue = hasResource.booleanValue();
            }
            c28120bM67453A0.m109210c("playlist", str, subjectId3, ops, numValueOf, itemType, zBooleanValue, this.categoryType);
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public C24687l getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24687l c24687lM96966c = C24687l.m96966c(inflater);
        Intrinsics.m97801g(c24687lM96966c, "inflate(...)");
        return c24687lM96966c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        Toolbar toolbar;
        C24687l mViewBinding = getMViewBinding();
        if (mViewBinding != null && (toolbar = mViewBinding.f75499f) != null) {
            AbstractC26006c.m102052e(toolbar);
        }
        pageStateFitStatusBar();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        Bundle arguments = getArguments();
        this.categoryType = arguments != null ? arguments.getString("category_type") : null;
        Bundle arguments2 = getArguments();
        this.showType = arguments2 != null ? arguments2.getString("showType") : null;
        ArrayList arrayList = new ArrayList();
        final C24687l mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            mViewBinding.f75496c.setOnClickListener(new View.OnClickListener() { // from class: jl.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CategoryFragment.m67457F0(this.f74485a, view2);
                }
            });
            RecyclerView recyclerView = mViewBinding.f75498e;
            recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext()));
            C25646b c25646b = new C25646b(0.6f, new C15122b(), false, 4, null);
            c25646b.m100946l(2);
            recyclerView.addOnScrollListener(c25646b);
            this.mExposureHelper = c25646b;
            C15112e c15112e = new C15112e(arrayList, getPageName(), this.mExposureHelper, this.showType);
            c15112e.m36186h0().m108673z(true);
            c15112e.m36186h0().m108672y(true);
            c15112e.m36186h0().m108656D(new InterfaceC27568f() { // from class: jl.c
                @Override // p765s6.InterfaceC27568f
                /* JADX INFO: renamed from: a */
                public final void mo63874a() {
                    CategoryFragment.m67458G0(this.f74486a);
                }
            });
            c15112e.m36227w1(new InterfaceC27566d() { // from class: jl.d
                @Override // p765s6.InterfaceC27566d
                /* JADX INFO: renamed from: a */
                public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                    CategoryFragment.m67460I0(this.f74487a, baseQuickAdapter, view2, i11);
                }
            });
            c15112e.m36193l(R$id.ll_download);
            c15112e.m36216s1(new InterfaceC27564b() { // from class: jl.e
                @Override // p765s6.InterfaceC27564b
                /* JADX INFO: renamed from: a */
                public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                    CategoryFragment.m67461J0(this.f74488a, baseQuickAdapter, view2, i11);
                }
            });
            this.mAdapter = c15112e;
            recyclerView.setAdapter(c15112e);
            mViewBinding.f75495b.addOnOffsetChangedListener(new AppBarLayout.InterfaceC9956g() { // from class: jl.f
                @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC9951b
                public final void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
                    CategoryFragment.m67462K0(this.f74489a, mViewBinding, appBarLayout, i11);
                }
            });
        }
        initAd();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        CategoryViewModel categoryViewModel = (CategoryViewModel) new C3227v0(this).m14969a(CategoryViewModel.class);
        this.viewModel = categoryViewModel;
        if (categoryViewModel == null) {
            Intrinsics.m97819y("viewModel");
            categoryViewModel = null;
        }
        categoryViewModel.m68906j().m14851j(this, new AbstractC15126a.a(new Function1() { // from class: jl.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CategoryFragment.m67463L0(this.f74484a, (BaseDto) obj);
            }
        }));
        m67464M0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void loadDefaultData() {
        if (C27287m.f83003a.m106330e()) {
            showLoadingView();
            loadData();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b(getPageName(), false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BiddingListManager biddingListManager = this.v3ListManager;
        if (biddingListManager != null) {
            biddingListManager.m63187o();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        CategoryViewModel categoryViewModel = this.viewModel;
        if (categoryViewModel == null) {
            Intrinsics.m97819y("viewModel");
            categoryViewModel = null;
        }
        categoryViewModel.m68908o(1);
        CategoryViewModel categoryViewModel2 = this.viewModel;
        if (categoryViewModel2 == null) {
            Intrinsics.m97819y("viewModel");
            categoryViewModel2 = null;
        }
        categoryViewModel2.m68906j().mo14858q(null);
        super.onDestroyView();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C25646b c25646b = this.mExposureHelper;
        if (c25646b != null) {
            c25646b.m100943e();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        List<Object> data;
        C15112e c15112e = this.mAdapter;
        if (c15112e != null && (data = c15112e.getData()) != null && data.size() == 0) {
            reload();
            return;
        }
        C15112e c15112e2 = this.mAdapter;
        if (c15112e2 == null || c15112e2.m36186h0().m108661i() != LoadMoreStatus.Fail) {
            return;
        }
        c15112e2.m36186h0().m108670w();
    }
}
