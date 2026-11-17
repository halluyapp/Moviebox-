package com.transsion.shorttv._channel;

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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.google.android.material.appbar.AppBarLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.p285ad.bidding.nativead.BiddingListManager;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.shorttv.R$color;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv._channel.ShortTvCategoryFragment;
import com.transsion.shorttv._channel.model.ShortTvCategoryBean;
import com.transsion.shorttv._channel.model.ShortTvCategoryItemBean;
import com.transsion.shorttv._channel.p312ui.activity.ShortTvCategoryActivity;
import com.transsion.shorttv._channel.p312ui.adapter.C18712b;
import com.transsion.shorttv._channel.p312ui.viewmodel.ShortTvCategoryViewModel;
import com.transsion.shorttv.base.fragment.PageStatusFragment;
import com.transsion.shorttv.bean.Cover;
import com.transsion.shorttv.bean.Pager;
import com.transsion.shorttv.bean.Subject;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.AddToDownloadEvent;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import is.C24223d;
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
import p330cs.C22776b;
import p330cs.InterfaceC22775a;
import p356ds.AbstractC23048b;
import p462hj.C23860f;
import p550kj.C24655b;
import p557ks.C25427b;
import p743rh.C27287m;
import p765s6.InterfaceC27564b;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p954yr.AbstractC29002b;
import p954yr.C29001a;
import pg.C26866a;
import rs.C27368v;
import ss.C27644a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0019\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010\u001aJ!\u0010%\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010\u0004J\u000f\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010\u0004J\u000f\u0010,\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010\u0004J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\tH\u0016¢\u0006\u0004\b0\u0010\u0004R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006N"}, m97100d2 = {"Lcom/transsion/shorttv/_channel/ShortTvCategoryFragment;", "Lcom/transsion/shorttv/base/fragment/PageStatusFragment;", "Lrs/v;", "<init>", "()V", "Lcom/transsion/shorttv/_channel/model/ShortTvCategoryItemBean;", "categoryItemBean", "", RequestParameters.POSITION, "", "v0", "(Lcom/transsion/shorttv/_channel/model/ShortTvCategoryItemBean;I)V", "reload", "Lcom/transsion/shorttv/_channel/model/ShortTvCategoryBean;", "categoryBean", "I0", "(Lcom/transsion/shorttv/_channel/model/ShortTvCategoryBean;)V", "loadMore", "loadData", "", "isExpand", "u0", "(Z)V", "G0", "", "getPageName", "()Ljava/lang/String;", "initAd", "Landroid/view/LayoutInflater;", "inflater", "x0", "(Landroid/view/LayoutInflater;)Lrs/v;", "getPageStateLayoutTitle", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initViewData", "(Landroid/view/View;Landroid/os/Bundle;)V", "initViewModel", "loadDefaultData", "initListener", "retryLoadData", "onPause", "onDestroyView", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "onDestroy", "Lcom/transsion/shorttv/_channel/ui/viewmodel/ShortTvCategoryViewModel;", "i", "Lcom/transsion/shorttv/_channel/ui/viewmodel/ShortTvCategoryViewModel;", "viewModel", "Lcom/transsion/shorttv/_channel/ui/adapter/b;", "j", "Lcom/transsion/shorttv/_channel/ui/adapter/b;", "mAdapter", CampaignEx.JSON_KEY_AD_K, "Ljava/lang/String;", "categoryType", "l", "showType", "Lcs/b;", "m", "Lcs/b;", "mExposureHelper", "Lyr/a;", "n", "Lkotlin/Lazy;", "w0", "()Lyr/a;", "categoryDotHelper", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "o", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "v3ListManager", TtmlNode.TAG_P, "a", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTvCategoryFragment extends PageStatusFragment<C27368v> {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private ShortTvCategoryViewModel viewModel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private C18712b mAdapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String categoryType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String showType;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private C22776b mExposureHelper;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final Lazy categoryDotHelper = LazyKt.m97097b(new Function0() { // from class: rr.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTvCategoryFragment.m78673t0();
        }
    });

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private BiddingListManager v3ListManager;

    /* JADX INFO: renamed from: com.transsion.shorttv._channel.ShortTvCategoryFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Fragment m78680a(String str, String str2) {
            Bundle bundleM11890a = AbstractC2411d.m11890a();
            bundleM11890a.putString("category_type", str);
            if (str2 == null) {
                str2 = "1";
            }
            bundleM11890a.putString("showType", str2);
            ShortTvCategoryFragment shortTvCategoryFragment = new ShortTvCategoryFragment();
            shortTvCategoryFragment.setArguments(bundleM11890a);
            return shortTvCategoryFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv._channel.ShortTvCategoryFragment$b */
    public static final class C18704b implements InterfaceC22775a {
        C18704b() {
        }

        @Override // p330cs.InterfaceC22775a
        /* JADX INFO: renamed from: a */
        public void mo78681a(int i11, long j11, View view) {
            Subject subject;
            Boolean hasResource;
            Subject subject2;
            Subject subject3;
            List<Object> data;
            C18712b c18712b = ShortTvCategoryFragment.this.mAdapter;
            boolean zBooleanValue = false;
            if (i11 >= ((c18712b == null || (data = c18712b.getData()) == null) ? 0 : data.size())) {
                return;
            }
            C18712b c18712b2 = ShortTvCategoryFragment.this.mAdapter;
            ShortTvCategoryItemBean shortTvCategoryItemBean = c18712b2 != null ? (ShortTvCategoryItemBean) c18712b2.getItem(i11) : null;
            C29001a c29001aM78676w0 = ShortTvCategoryFragment.this.m78676w0();
            String pageName = ShortTvCategoryFragment.this.getPageName();
            String subjectId = (shortTvCategoryItemBean == null || (subject3 = shortTvCategoryItemBean.getSubject()) == null) ? null : subject3.getSubjectId();
            String ops = (shortTvCategoryItemBean == null || (subject2 = shortTvCategoryItemBean.getSubject()) == null) ? null : subject2.getOps();
            Integer numValueOf = Integer.valueOf(i11);
            String itemType = shortTvCategoryItemBean != null ? shortTvCategoryItemBean.getItemType() : null;
            if (shortTvCategoryItemBean != null && (subject = shortTvCategoryItemBean.getSubject()) != null && (hasResource = subject.getHasResource()) != null) {
                zBooleanValue = hasResource.booleanValue();
            }
            c29001aM78676w0.m111534a(pageName, subjectId, ops, numValueOf, itemType, zBooleanValue, ShortTvCategoryFragment.this.categoryType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m78650A0(final ShortTvCategoryFragment shortTvCategoryFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            shortTvCategoryFragment.loadMore();
            return;
        }
        C25427b.f76996a.m99960d(R$string.short_tv_no_network_toast);
        C27368v c27368v = (C27368v) shortTvCategoryFragment.getMViewBinding();
        if (c27368v == null || (recyclerView = c27368v.f83341e) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: rr.h
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvCategoryFragment.m78651B0(this.f83060a);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final void m78651B0(ShortTvCategoryFragment shortTvCategoryFragment) {
        C27941f c27941fM36186h0;
        C18712b c18712b = shortTvCategoryFragment.mAdapter;
        if (c18712b == null || (c27941fM36186h0 = c18712b.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m78652C0(BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        Object item = adapter.getItem(i11);
        if (item instanceof ShortTvCategoryItemBean) {
            AbstractC29002b.m111538c(((ShortTvCategoryItemBean) item).getSubject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m78653D0(ShortTvCategoryFragment shortTvCategoryFragment, BaseQuickAdapter adapter, View view, int i11) {
        List<Object> data;
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C24223d.f73737a.m95247a(view.getId(), 2000L)) {
            return;
        }
        C18712b c18712b = shortTvCategoryFragment.mAdapter;
        ShortTvCategoryItemBean shortTvCategoryItemBean = (c18712b == null || (data = c18712b.getData()) == null) ? null : (ShortTvCategoryItemBean) CollectionsKt.m97362l0(data, i11);
        if (shortTvCategoryItemBean == null || view.getId() != R$id.ll_download) {
            return;
        }
        shortTvCategoryFragment.m78675v0(shortTvCategoryItemBean, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final void m78654E0(ShortTvCategoryFragment shortTvCategoryFragment, C27368v c27368v, AppBarLayout appBarLayout, int i11) {
        if (shortTvCategoryFragment.getContext() == null) {
            return;
        }
        if (Math.abs(i11) >= appBarLayout.getTotalScrollRange()) {
            c27368v.f83342f.setBackgroundColor(AbstractC2397b.getColor(shortTvCategoryFragment.requireContext(), R$color.short_tv_bg));
            c27368v.f83339c.setImageTintList(ColorStateList.valueOf(AbstractC2397b.getColor(shortTvCategoryFragment.requireContext(), R$color.short_tv_white)));
            AppCompatTextView tvTitle = c27368v.f83343g;
            Intrinsics.m97801g(tvTitle, "tvTitle");
            AbstractC23048b.m91694e(tvTitle);
            AppCompatTextView tvTitleExpand = c27368v.f83344h;
            Intrinsics.m97801g(tvTitleExpand, "tvTitleExpand");
            AbstractC23048b.m91691b(tvTitleExpand);
            shortTvCategoryFragment.m78674u0(true);
            return;
        }
        c27368v.f83342f.setBackgroundColor(AbstractC2397b.getColor(shortTvCategoryFragment.requireContext(), R$color.short_tv_transparent));
        c27368v.f83339c.setImageTintList(ColorStateList.valueOf(AbstractC2397b.getColor(shortTvCategoryFragment.requireContext(), R$color.short_tv_white)));
        AppCompatTextView tvTitle2 = c27368v.f83343g;
        Intrinsics.m97801g(tvTitle2, "tvTitle");
        AbstractC23048b.m91691b(tvTitle2);
        AppCompatTextView tvTitleExpand2 = c27368v.f83344h;
        Intrinsics.m97801g(tvTitleExpand2, "tvTitleExpand");
        AbstractC23048b.m91694e(tvTitleExpand2);
        shortTvCategoryFragment.m78674u0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final Unit m78655F0(ShortTvCategoryFragment shortTvCategoryFragment, BaseDto baseDto) {
        List<Object> data;
        HashMap mapM96844g;
        C18712b c18712b;
        C27941f c27941fM36186h0;
        Pager pager;
        C27941f c27941fM36186h1;
        C18712b c18712b2;
        C27941f c27941fM36186h2;
        ShortTvCategoryBean shortTvCategoryBean;
        List<ShortTvCategoryItemBean> list;
        C26866a.a.m104898f(C26866a.f81698a, "CategoryFragment", "return code=" + (baseDto != null ? baseDto.getCode() : null) + " size=" + ((baseDto == null || (shortTvCategoryBean = (ShortTvCategoryBean) baseDto.getData()) == null || (list = shortTvCategoryBean.getList()) == null) ? null : Integer.valueOf(list.size())), false, 4, null);
        if (baseDto == null) {
            return Unit.f75682a;
        }
        shortTvCategoryFragment.showContentView();
        C18712b c18712b3 = shortTvCategoryFragment.mAdapter;
        if (c18712b3 != null && (c27941fM36186h1 = c18712b3.m36186h0()) != null && c27941fM36186h1.m108666r() && (c18712b2 = shortTvCategoryFragment.mAdapter) != null && (c27941fM36186h2 = c18712b2.m36186h0()) != null) {
            c27941fM36186h2.m108667s();
        }
        if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
            ShortTvCategoryBean shortTvCategoryBean2 = (ShortTvCategoryBean) baseDto.getData();
            if (((shortTvCategoryBean2 == null || (pager = shortTvCategoryBean2.getPager()) == null) ? false : Intrinsics.m97797c(pager.getHasMore(), Boolean.FALSE)) && (c18712b = shortTvCategoryFragment.mAdapter) != null && (c27941fM36186h0 = c18712b.m36186h0()) != null) {
                C27941f.m108652u(c27941fM36186h0, false, 1, null);
            }
            shortTvCategoryFragment.m78658I0((ShortTvCategoryBean) baseDto.getData());
            C24655b logViewConfig = shortTvCategoryFragment.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
            C24655b logViewConfig2 = shortTvCategoryFragment.getLogViewConfig();
            if (logViewConfig2 != null) {
                ShortTvCategoryBean shortTvCategoryBean3 = (ShortTvCategoryBean) baseDto.getData();
                logViewConfig2.m96851n(shortTvCategoryBean3 != null ? shortTvCategoryBean3.getOps() : null);
            }
        } else {
            C18712b c18712b4 = shortTvCategoryFragment.mAdapter;
            if ((c18712b4 == null || (data = c18712b4.getData()) == null || data.size() != 0) ? false : true) {
                PageStatusFragment.m79069c0(shortTvCategoryFragment, false, 1, null);
            }
        }
        C24655b logViewConfig3 = shortTvCategoryFragment.getLogViewConfig();
        if (logViewConfig3 != null && (mapM96844g = logViewConfig3.m96844g()) != null) {
            mapM96844g.put("category_type", shortTvCategoryFragment.categoryType);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: G0 */
    private final void m78656G0() {
        Function1 function1 = new Function1() { // from class: rr.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvCategoryFragment.m78657H0(this.f83061a, (AddToDownloadEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = AddToDownloadEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final Unit m78657H0(ShortTvCategoryFragment shortTvCategoryFragment, AddToDownloadEvent value) {
        C18712b c18712b;
        List<Object> data;
        Intrinsics.m97802h(value, "value");
        try {
            C18712b c18712b2 = shortTvCategoryFragment.mAdapter;
            int i11 = -1;
            if (c18712b2 != null && (data = c18712b2.getData()) != null) {
                Iterator<Object> it = data.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    Subject subject = ((ShortTvCategoryItemBean) it.next()).getSubject();
                    if (Intrinsics.m97797c(subject != null ? subject.getSubjectId() : null, value.getSubjectId())) {
                        i11 = i12;
                        break;
                    }
                    i12++;
                }
            }
            if (i11 >= 0 && (c18712b = shortTvCategoryFragment.mAdapter) != null) {
                c18712b.notifyItemChanged(i11);
            }
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: I0 */
    private final void m78658I0(ShortTvCategoryBean categoryBean) {
        C27368v c27368v;
        List<Object> data;
        String url;
        Subject subject;
        Cover cover;
        String thumbnail;
        Subject subject2;
        Cover cover2;
        List<Object> data2;
        C18712b c18712b;
        if (categoryBean == null || (c27368v = (C27368v) getMViewBinding()) == null) {
            return;
        }
        c27368v.f83343g.setText(categoryBean.getDesc());
        c27368v.f83344h.setText(categoryBean.getDesc());
        List<ShortTvCategoryItemBean> list = categoryBean.getList();
        if (list != null && (c18712b = this.mAdapter) != null) {
            c18712b.mo36208q(list);
        }
        C18712b c18712b2 = this.mAdapter;
        if (c18712b2 == null || (data = c18712b2.getData()) == null || !(!data.isEmpty())) {
            return;
        }
        C18712b c18712b3 = this.mAdapter;
        ShortTvCategoryItemBean shortTvCategoryItemBean = (c18712b3 == null || (data2 = c18712b3.getData()) == null) ? null : (ShortTvCategoryItemBean) data2.get(0);
        C23860f.a aVar = C23860f.f72909a;
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        C23860f.b bVarM94457m = aVar.m94457m(contextRequireContext);
        String str = "";
        if (shortTvCategoryItemBean == null || (subject2 = shortTvCategoryItemBean.getSubject()) == null || (cover2 = subject2.getCover()) == null || (url = cover2.getUrl()) == null) {
            url = "";
        }
        C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
        if (shortTvCategoryItemBean != null && (subject = shortTvCategoryItemBean.getSubject()) != null && (cover = subject.getCover()) != null && (thumbnail = cover.getThumbnail()) != null) {
            str = thumbnail;
        }
        C23860f.b bVarM94473l = bVarM94468g.m94473l(str);
        AppCompatImageView ivCover = c27368v.f83340d;
        Intrinsics.m97801g(ivCover, "ivCover");
        bVarM94473l.m94465d(ivCover);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPageName() {
        return "category";
    }

    private final void initAd() {
        BiddingListManager biddingListManager = new BiddingListManager();
        C27368v c27368v = (C27368v) getMViewBinding();
        biddingListManager.m63184F(c27368v != null ? c27368v.f83341e : null);
        biddingListManager.m63179A(AbstractC3226v.m14968a(this));
        biddingListManager.m63185G("PlayListScene");
        biddingListManager.m63192z(new Function2() { // from class: rr.j
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ShortTvCategoryFragment.m78677y0(this.f83062a, ((Integer) obj).intValue(), (BiddingNativeManager) obj2);
            }
        });
        this.v3ListManager = biddingListManager;
    }

    private final void loadData() {
        ShortTvCategoryViewModel shortTvCategoryViewModel = this.viewModel;
        if (shortTvCategoryViewModel == null) {
            Intrinsics.m97819y("viewModel");
            shortTvCategoryViewModel = null;
        }
        String str = this.categoryType;
        if (str == null) {
            str = "Nollywood";
        }
        shortTvCategoryViewModel.m78832i(str);
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
    /* JADX INFO: renamed from: t0 */
    public static final C29001a m78673t0() {
        return new C29001a();
    }

    /* JADX INFO: renamed from: u0 */
    private final void m78674u0(boolean isExpand) {
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            if (activity instanceof ShortTvCategoryActivity) {
                ((ShortTvCategoryActivity) activity).m78693W(isExpand);
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    private final void m78675v0(ShortTvCategoryItemBean categoryItemBean, int position) {
        Boolean hasResource;
        Context context = getContext();
        if (context != null) {
            Subject subject = categoryItemBean.getSubject();
            C27644a.f84793a.m107539a((FragmentActivity) context, "playlist", AbstractC18705a.m78682a(subject, this.categoryType), (64 & 8) != 0 ? null : "download_subject", (64 & 16) != 0 ? false : true, (64 & 32) != 0 ? null : subject, (64 & 64) != 0 ? null : null, (64 & 128) != 0 ? Boolean.FALSE : Boolean.TRUE);
            m78676w0().m111535b("playlist", "download_subject", subject != null ? subject.getSubjectId() : null, subject != null ? subject.getOps() : null, Integer.valueOf(position), categoryItemBean.getItemType(), (subject == null || (hasResource = subject.getHasResource()) == null) ? false : hasResource.booleanValue(), this.categoryType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public final C29001a m78676w0() {
        return (C29001a) this.categoryDotHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final Unit m78677y0(ShortTvCategoryFragment shortTvCategoryFragment, int i11, BiddingNativeManager current) {
        List<Object> data;
        Intrinsics.m97802h(current, "current");
        if (current != null) {
            ShortTvCategoryItemBean shortTvCategoryItemBean = new ShortTvCategoryItemBean(null, null, new Subject(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, false, null, null, 0, 0, null, 0, null, 0, null, -1, 1073741823, null), 3, null);
            Subject subject = shortTvCategoryItemBean.getSubject();
            if (subject != null) {
                subject.setNonAdDelegate(current);
            }
            C18712b c18712b = shortTvCategoryFragment.mAdapter;
            if (i11 < ((c18712b == null || (data = c18712b.getData()) == null) ? 0 : data.size())) {
                C18712b c18712b2 = shortTvCategoryFragment.mAdapter;
                if (c18712b2 != null) {
                    c18712b2.mo36199n(i11, shortTvCategoryItemBean);
                }
            } else {
                C18712b c18712b3 = shortTvCategoryFragment.mAdapter;
                if (c18712b3 != null) {
                    c18712b3.mo36205p(shortTvCategoryItemBean);
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m78678z0(ShortTvCategoryFragment shortTvCategoryFragment, View view) {
        FragmentActivity activity = shortTvCategoryFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initListener() {
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initViewData() {
        Toolbar toolbar;
        C27368v c27368v = (C27368v) getMViewBinding();
        if (c27368v != null && (toolbar = c27368v.f83342f) != null) {
            AbstractC29002b.m111536a(toolbar);
        }
        pageStateFitStatusBar();
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initViewData(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        Bundle arguments = getArguments();
        this.categoryType = arguments != null ? arguments.getString("category_type") : null;
        Bundle arguments2 = getArguments();
        this.showType = arguments2 != null ? arguments2.getString("showType") : null;
        ArrayList arrayList = new ArrayList();
        final C27368v c27368v = (C27368v) getMViewBinding();
        if (c27368v != null) {
            c27368v.f83339c.setOnClickListener(new View.OnClickListener() { // from class: rr.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ShortTvCategoryFragment.m78678z0(this.f83055a, view2);
                }
            });
            RecyclerView recyclerView = c27368v.f83341e;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            C22776b c22776b = new C22776b(0.6f, new C18704b(), false, 4, null);
            c22776b.m90705l(2);
            recyclerView.addOnScrollListener(c22776b);
            this.mExposureHelper = c22776b;
            C18712b c18712b = new C18712b(arrayList, getPageName(), this.mExposureHelper, this.showType);
            c18712b.m36186h0().m108673z(true);
            c18712b.m36186h0().m108672y(true);
            c18712b.m36186h0().m108656D(new InterfaceC27568f() { // from class: rr.d
                @Override // p765s6.InterfaceC27568f
                /* JADX INFO: renamed from: a */
                public final void mo63874a() {
                    ShortTvCategoryFragment.m78650A0(this.f83056a);
                }
            });
            c18712b.m36227w1(new InterfaceC27566d() { // from class: rr.e
                @Override // p765s6.InterfaceC27566d
                /* JADX INFO: renamed from: a */
                public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                    ShortTvCategoryFragment.m78652C0(baseQuickAdapter, view2, i11);
                }
            });
            c18712b.m36193l(R$id.ll_download);
            c18712b.m36216s1(new InterfaceC27564b() { // from class: rr.f
                @Override // p765s6.InterfaceC27564b
                /* JADX INFO: renamed from: a */
                public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                    ShortTvCategoryFragment.m78653D0(this.f83057a, baseQuickAdapter, view2, i11);
                }
            });
            this.mAdapter = c18712b;
            recyclerView.setAdapter(c18712b);
            c27368v.f83338b.addOnOffsetChangedListener(new AppBarLayout.InterfaceC9956g() { // from class: rr.g
                @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC9951b
                public final void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
                    ShortTvCategoryFragment.m78654E0(this.f83058a, c27368v, appBarLayout, i11);
                }
            });
        }
        initAd();
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initViewModel() {
        ShortTvCategoryViewModel shortTvCategoryViewModel = (ShortTvCategoryViewModel) new C3227v0(this).m14969a(ShortTvCategoryViewModel.class);
        this.viewModel = shortTvCategoryViewModel;
        if (shortTvCategoryViewModel == null) {
            Intrinsics.m97819y("viewModel");
            shortTvCategoryViewModel = null;
        }
        shortTvCategoryViewModel.m78833j().m14851j(this, new AbstractC18705a.a(new Function1() { // from class: rr.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvCategoryFragment.m78655F0(this.f83054a, (BaseDto) obj);
            }
        }));
        m78656G0();
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void loadDefaultData() {
        if (C27287m.f83003a.m106330e()) {
            showLoadingView();
            loadData();
        }
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b(getPageName(), false, 2, null);
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BiddingListManager biddingListManager = this.v3ListManager;
        if (biddingListManager != null) {
            biddingListManager.m63187o();
        }
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ShortTvCategoryViewModel shortTvCategoryViewModel = this.viewModel;
        if (shortTvCategoryViewModel == null) {
            Intrinsics.m97819y("viewModel");
            shortTvCategoryViewModel = null;
        }
        shortTvCategoryViewModel.m78835o(1);
        ShortTvCategoryViewModel shortTvCategoryViewModel2 = this.viewModel;
        if (shortTvCategoryViewModel2 == null) {
            Intrinsics.m97819y("viewModel");
            shortTvCategoryViewModel2 = null;
        }
        shortTvCategoryViewModel2.m78833j().mo14858q(null);
        super.onDestroyView();
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C22776b c22776b = this.mExposureHelper;
        if (c22776b != null) {
            c22776b.m90702e();
        }
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void retryLoadData() {
        List<Object> data;
        C18712b c18712b = this.mAdapter;
        if (c18712b != null && (data = c18712b.getData()) != null && data.size() == 0) {
            reload();
            return;
        }
        C18712b c18712b2 = this.mAdapter;
        if (c18712b2 == null || c18712b2.m36186h0().m108661i() != LoadMoreStatus.Fail) {
            return;
        }
        c18712b2.m36186h0().m108670w();
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public C27368v getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C27368v c27368vM106514c = C27368v.m106514c(inflater);
        Intrinsics.m97801g(c27368vM106514c, "inflate(...)");
        return c27368vM106514c;
    }
}
