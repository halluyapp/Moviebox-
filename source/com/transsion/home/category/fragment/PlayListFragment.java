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
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.google.android.material.appbar.AppBarLayout;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.R$string;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.C14557c;
import com.transsion.home.R$id;
import com.transsion.home.bean.PlayListResp;
import com.transsion.home.category.PlayListActivity;
import com.transsion.home.category.adapter.C15109b;
import com.transsion.home.category.adapter.C15117j;
import com.transsion.home.category.fragment.PlayListFragment;
import com.transsion.home.viewmodel.PlayListViewModel;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.PlayListType;
import com.transsion.moviedetailapi.bean.Staff;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.p285ad.bidding.nativead.BiddingListManager;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.strategy.C14058c;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.AddToDownloadEvent;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C25220y0;
import ng.AbstractC26006c;
import org.json.JSONException;
import org.json.JSONObject;
import p462hj.C23860f;
import p550kj.C24655b;
import p552kl.C24698t;
import p579ll.C25646b;
import p579ll.InterfaceC25645a;
import p743rh.C27287m;
import p765s6.InterfaceC27564b;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p842vl.AbstractC28126h;
import p842vl.C28127i;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 X2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010\u0018J\u000f\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\u0004J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0012H\u0016¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010*\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010\u0004J\u000f\u0010+\u001a\u00020\u0012H\u0016¢\u0006\u0004\b+\u0010\u0004J\u000f\u0010,\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010\u0004J\u000f\u0010-\u001a\u00020\u0005H\u0016¢\u0006\u0004\b-\u0010\u0007J\u000f\u0010.\u001a\u00020\u0012H\u0016¢\u0006\u0004\b.\u0010\u0004J\u000f\u0010/\u001a\u00020\u0012H\u0016¢\u0006\u0004\b/\u0010\u0004J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0012H\u0016¢\u0006\u0004\b3\u0010\u0004R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00109R\u0018\u0010@\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00109R\u0016\u0010C\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001b\u0010S\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006Y"}, m97100d2 = {"Lcom/transsion/home/category/fragment/PlayListFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lkl/t;", "<init>", "()V", "", "U0", "()Z", "Lcom/transsion/home/category/adapter/b;", "I0", "()Lcom/transsion/home/category/adapter/b;", "Lcom/transsion/home/category/adapter/j;", "M0", "()Lcom/transsion/home/category/adapter/j;", "Lcom/transsion/moviedetailapi/bean/Subject;", "subjectItem", "", RequestParameters.POSITION, "", "E0", "(Lcom/transsion/moviedetailapi/bean/Subject;I)V", "Lcom/transsion/home/bean/PlayListResp;", "playListResp", "Y0", "(Lcom/transsion/home/bean/PlayListResp;)V", "reload", "loadData", "loadMore", "isExpand", "D0", "(Z)V", "Z0", "W0", "initAd", "Landroid/view/LayoutInflater;", "inflater", "G0", "(Landroid/view/LayoutInflater;)Lkl/t;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "receiveArguments", "initViewData", "initViewModel", "initListener", "isMonitorNetworkState", "retryLoadData", "loadDefaultData", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "onDestroy", "Lcom/transsion/home/viewmodel/PlayListViewModel;", "a", "Lcom/transsion/home/viewmodel/PlayListViewModel;", "viewModel", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "mLabel", "c", "mCategory", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "mRecType", "e", "mTopIds", "f", "I", "mTabId", "Lll/b;", "g", "Lll/b;", "mExposureHelper", "h", "Lcom/transsion/home/category/adapter/j;", "mSubjectAdapter", "i", "Lcom/transsion/home/category/adapter/b;", "mCastAdapter", "Lvl/i;", "j", "Lkotlin/Lazy;", "F0", "()Lvl/i;", "mPlayListDotHelper", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "v3ListManager", "l", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class PlayListFragment extends PageStatusFragment<C24698t> {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m */
    public static final int f52653m = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private PlayListViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String mLabel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String mCategory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String mRecType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String mTopIds;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int mTabId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C25646b mExposureHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private C15117j mSubjectAdapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private C15109b mCastAdapter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Lazy mPlayListDotHelper = LazyKt.m97097b(new Function0() { // from class: jl.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PlayListFragment.m67507V0();
        }
    });

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private BiddingListManager v3ListManager;

    /* JADX INFO: renamed from: com.transsion.home.category.fragment.PlayListFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final PlayListFragment m67530a(String str, String str2, String str3, String str4, int i11) {
            PlayListFragment playListFragment = new PlayListFragment();
            playListFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("label", str), TuplesKt.m97108a("category", str2), TuplesKt.m97108a("recType", str3), TuplesKt.m97108a("topIds", str4), TuplesKt.m97108a("tabId", Integer.valueOf(i11))));
            return playListFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.category.fragment.PlayListFragment$b */
    public static final class C15124b implements InterfaceC25645a {
        C15124b() {
        }

        @Override // p579ll.InterfaceC25645a
        /* JADX INFO: renamed from: a */
        public void mo67486a(int i11, long j11, View view) {
            Boolean hasResource;
            List<Object> data;
            List<Object> data2;
            boolean zBooleanValue = false;
            size = 0;
            int size = 0;
            zBooleanValue = false;
            if (PlayListFragment.this.m67506U0()) {
                C15109b c15109b = PlayListFragment.this.mCastAdapter;
                if (c15109b != null && (data2 = c15109b.getData()) != null) {
                    size = data2.size();
                }
                if (i11 >= size) {
                    return;
                }
                C15109b c15109b2 = PlayListFragment.this.mCastAdapter;
                Staff staff = c15109b2 != null ? (Staff) c15109b2.getItem(i11) : null;
                PlayListFragment.this.m67492F0().m109242b("playlist", staff != null ? staff.getStaffId() : null, staff != null ? staff.getOps() : null, Integer.valueOf(i11), PlayListFragment.this.mCategory, PlayListFragment.this.mRecType, PlayListFragment.this.mLabel);
                return;
            }
            C15117j c15117j = PlayListFragment.this.mSubjectAdapter;
            if (i11 >= ((c15117j == null || (data = c15117j.getData()) == null) ? 0 : data.size())) {
                return;
            }
            C15117j c15117j2 = PlayListFragment.this.mSubjectAdapter;
            Subject subject = c15117j2 != null ? (Subject) c15117j2.getItem(i11) : null;
            C28127i c28127iM67492F0 = PlayListFragment.this.m67492F0();
            String subjectId = subject != null ? subject.getSubjectId() : null;
            String ops = subject != null ? subject.getOps() : null;
            Integer numValueOf = Integer.valueOf(i11);
            if (subject != null && (hasResource = subject.getHasResource()) != null) {
                zBooleanValue = hasResource.booleanValue();
            }
            c28127iM67492F0.m109244d("playlist", subjectId, ops, numValueOf, zBooleanValue, PlayListFragment.this.mCategory, PlayListFragment.this.mRecType, PlayListFragment.this.mLabel);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.category.fragment.PlayListFragment$c */
    static final class C15125c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f52666a;

        C15125c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f52666a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f52666a;
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
            this.f52666a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: D0 */
    private final void m67490D0(boolean isExpand) {
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            if (activity instanceof PlayListActivity) {
                ((PlayListActivity) activity).m67434b0(isExpand);
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    private final void m67491E0(Subject subjectItem, int position) {
        Boolean hasResource;
        if (getContext() != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            m67492F0().m109241a("playlist", AbstractC28126h.m109240g(subjectItem, "playlist", contextRequireContext, "play_list_page"), subjectItem != null ? subjectItem.getSubjectId() : null, subjectItem != null ? subjectItem.getOps() : null, Integer.valueOf(position), (subjectItem == null || (hasResource = subjectItem.getHasResource()) == null) ? false : hasResource.booleanValue(), this.mCategory, this.mRecType, this.mLabel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public final C28127i m67492F0() {
        return (C28127i) this.mPlayListDotHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final Unit m67493H0(PlayListFragment playListFragment, int i11, BiddingNativeManager current) {
        List<Object> data;
        List<Object> data2;
        Intrinsics.m97802h(current, "current");
        if (current != null) {
            int size = 0;
            if (playListFragment.m67506U0()) {
                Staff staff = new Staff();
                staff.setNonAdDelegate(current);
                C15109b c15109b = playListFragment.mCastAdapter;
                if (c15109b != null && (data2 = c15109b.getData()) != null) {
                    size = data2.size();
                }
                if (i11 < size) {
                    C15109b c15109b2 = playListFragment.mCastAdapter;
                    if (c15109b2 != null) {
                        c15109b2.mo36199n(i11, staff);
                    }
                } else {
                    C15109b c15109b3 = playListFragment.mCastAdapter;
                    if (c15109b3 != null) {
                        c15109b3.mo36205p(staff);
                    }
                }
            } else {
                Subject subject = new Subject(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, 0, null, null, null, null, null, -1, 67108863, null);
                subject.setNonAdDelegate(current);
                C15117j c15117j = playListFragment.mSubjectAdapter;
                if (c15117j != null && (data = c15117j.getData()) != null) {
                    size = data.size();
                }
                if (i11 < size) {
                    C15117j c15117j2 = playListFragment.mSubjectAdapter;
                    if (c15117j2 != null) {
                        c15117j2.mo36199n(i11, subject);
                    }
                } else {
                    C15117j c15117j3 = playListFragment.mSubjectAdapter;
                    if (c15117j3 != null) {
                        c15117j3.mo36205p(subject);
                    }
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: I0 */
    private final C15109b m67494I0() {
        final C15109b c15109b = new C15109b(new ArrayList(), this.mExposureHelper);
        c15109b.m36186h0().m108673z(true);
        c15109b.m36186h0().m108672y(true);
        c15109b.m36186h0().m108656D(new InterfaceC27568f() { // from class: jl.w
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                PlayListFragment.m67495J0(this.f74507a);
            }
        });
        c15109b.m36227w1(new InterfaceC27566d() { // from class: jl.l
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                PlayListFragment.m67497L0(c15109b, this, baseQuickAdapter, view, i11);
            }
        });
        this.mCastAdapter = c15109b;
        return c15109b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final void m67495J0(final PlayListFragment playListFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            playListFragment.loadMore();
            return;
        }
        C28951b.f88586a.m111454d(R$string.no_network);
        C24698t mViewBinding = playListFragment.getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f75574e) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: jl.m
            @Override // java.lang.Runnable
            public final void run() {
                PlayListFragment.m67496K0(this.f74497a);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final void m67496K0(PlayListFragment playListFragment) {
        C27941f c27941fM36186h0;
        C15109b c15109b = playListFragment.mCastAdapter;
        if (c15109b == null || (c27941fM36186h0 = c15109b.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final void m67497L0(C15109b c15109b, PlayListFragment playListFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        Object item = adapter.getItem(i11);
        if (item instanceof Staff) {
            Staff staff = (Staff) item;
            Navigator.m61845x(TheRouter.m61773c("/movie/staff").m61857K("id", staff.getStaffId()).m61856J("staff", (Serializable) item), c15109b.getContext(), null, 2, null);
            playListFragment.m67492F0().m109243c("playlist", staff.getStaffId(), staff.getOps(), Integer.valueOf(i11), playListFragment.mCategory, playListFragment.mRecType, playListFragment.mLabel);
        }
    }

    /* JADX INFO: renamed from: M0 */
    private final C15117j m67498M0() {
        C15117j c15117j = new C15117j(new ArrayList(), this.mExposureHelper);
        c15117j.m36186h0().m108673z(true);
        c15117j.m36186h0().m108672y(true);
        c15117j.m36186h0().m108656D(new InterfaceC27568f() { // from class: jl.t
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                PlayListFragment.m67499N0(this.f74504a);
            }
        });
        c15117j.m36227w1(new InterfaceC27566d() { // from class: jl.u
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                PlayListFragment.m67501P0(this.f74505a, baseQuickAdapter, view, i11);
            }
        });
        c15117j.m36193l(R$id.ll_download);
        c15117j.m36216s1(new InterfaceC27564b() { // from class: jl.v
            @Override // p765s6.InterfaceC27564b
            /* JADX INFO: renamed from: a */
            public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                PlayListFragment.m67502Q0(this.f74506a, baseQuickAdapter, view, i11);
            }
        });
        this.mSubjectAdapter = c15117j;
        return c15117j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final void m67499N0(final PlayListFragment playListFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            playListFragment.loadMore();
            return;
        }
        C28951b.f88586a.m111454d(R$string.no_network);
        C24698t mViewBinding = playListFragment.getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f75574e) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: jl.n
            @Override // java.lang.Runnable
            public final void run() {
                PlayListFragment.m67500O0(this.f74498a);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final void m67500O0(PlayListFragment playListFragment) {
        C27941f c27941fM36186h0;
        C15117j c15117j = playListFragment.mSubjectAdapter;
        if (c15117j == null || (c27941fM36186h0 = c15117j.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final void m67501P0(PlayListFragment playListFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        Object item = adapter.getItem(i11);
        if (item instanceof Subject) {
            Subject subject = (Subject) item;
            AbstractC28126h.m109239f(subject, "play_list_page");
            C28127i c28127iM67492F0 = playListFragment.m67492F0();
            String subjectId = subject.getSubjectId();
            String ops = subject.getOps();
            Integer numValueOf = Integer.valueOf(i11);
            Boolean hasResource = subject.getHasResource();
            c28127iM67492F0.m109245e("playlist", subjectId, ops, numValueOf, hasResource != null ? hasResource.booleanValue() : false, playListFragment.mCategory, playListFragment.mRecType, playListFragment.mLabel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final void m67502Q0(PlayListFragment playListFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C14557c.f51100a.m65671a(view.getId(), 2000L)) {
            return;
        }
        Object item = adapter.getItem(i11);
        Subject subject = item instanceof Subject ? (Subject) item : null;
        if (view.getId() == R$id.ll_download) {
            playListFragment.m67491E0(subject, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final void m67503R0(PlayListFragment playListFragment, View view) {
        FragmentActivity activity = playListFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final void m67504S0(PlayListFragment playListFragment, C24698t c24698t, AppBarLayout appBarLayout, int i11) {
        if (playListFragment.getContext() == null) {
            return;
        }
        if (Math.abs(i11) >= appBarLayout.getTotalScrollRange()) {
            c24698t.f75575f.setBackgroundColor(AbstractC2397b.getColor(playListFragment.requireContext(), R$color.bg_01));
            c24698t.f75572c.setImageTintList(ColorStateList.valueOf(AbstractC2397b.getColor(playListFragment.requireContext(), R$color.btn_back)));
            AppCompatTextView tvTitle = c24698t.f75576g;
            Intrinsics.m97801g(tvTitle, "tvTitle");
            AbstractC26006c.m102058k(tvTitle);
            AppCompatTextView tvTitleExpand = c24698t.f75577h;
            Intrinsics.m97801g(tvTitleExpand, "tvTitleExpand");
            AbstractC26006c.m102054g(tvTitleExpand);
            playListFragment.m67490D0(true);
            return;
        }
        c24698t.f75575f.setBackgroundColor(AbstractC2397b.getColor(playListFragment.requireContext(), R$color.transparent));
        c24698t.f75572c.setImageTintList(ColorStateList.valueOf(AbstractC2397b.getColor(playListFragment.requireContext(), R$color.common_white)));
        AppCompatTextView tvTitle2 = c24698t.f75576g;
        Intrinsics.m97801g(tvTitle2, "tvTitle");
        AbstractC26006c.m102054g(tvTitle2);
        AppCompatTextView tvTitleExpand2 = c24698t.f75577h;
        Intrinsics.m97801g(tvTitleExpand2, "tvTitleExpand");
        AbstractC26006c.m102058k(tvTitleExpand2);
        playListFragment.m67490D0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final Unit m67505T0(PlayListFragment playListFragment, PlayListResp playListResp) throws JSONException {
        List<Object> data;
        List<Object> data2;
        C15117j c15117j;
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        C15117j c15117j2;
        C27941f c27941fM36186h2;
        List<Object> data3;
        List<Object> data4;
        C15109b c15109b;
        C27941f c27941fM36186h3;
        C27941f c27941fM36186h4;
        C15109b c15109b2;
        C27941f c27941fM36186h5;
        playListFragment.showContentView();
        playListFragment.m67510Y0(playListResp);
        if (playListFragment.m67506U0()) {
            C15109b c15109b3 = playListFragment.mCastAdapter;
            if (c15109b3 != null && (c27941fM36186h4 = c15109b3.m36186h0()) != null && c27941fM36186h4.m108666r() && (c15109b2 = playListFragment.mCastAdapter) != null && (c27941fM36186h5 = c15109b2.m36186h0()) != null) {
                c27941fM36186h5.m108667s();
            }
            if (playListResp != null) {
                List<Staff> staffs = playListResp.getStaffs();
                int size = staffs != null ? staffs.size() : 0;
                if (size < 4 && (c15109b = playListFragment.mCastAdapter) != null && (c27941fM36186h3 = c15109b.m36186h0()) != null) {
                    C27941f.m108652u(c27941fM36186h3, false, 1, null);
                }
                C15109b c15109b4 = playListFragment.mCastAdapter;
                if (c15109b4 == null || (data4 = c15109b4.getData()) == null || data4.size() != 0 || size != 0) {
                    playListFragment.m67511Z0(playListResp);
                } else {
                    PageStatusFragment.showEmptyView$default(playListFragment, false, 1, null);
                }
                C24655b logViewConfig = playListFragment.getLogViewConfig();
                if (logViewConfig != null) {
                    logViewConfig.m96848k(true);
                }
            } else {
                C15109b c15109b5 = playListFragment.mCastAdapter;
                if (c15109b5 != null && (data3 = c15109b5.getData()) != null && data3.size() == 0) {
                    PageStatusFragment.showEmptyView$default(playListFragment, false, 1, null);
                }
            }
        } else {
            C15117j c15117j3 = playListFragment.mSubjectAdapter;
            if (c15117j3 != null && (c27941fM36186h1 = c15117j3.m36186h0()) != null && c27941fM36186h1.m108666r() && (c15117j2 = playListFragment.mSubjectAdapter) != null && (c27941fM36186h2 = c15117j2.m36186h0()) != null) {
                c27941fM36186h2.m108667s();
            }
            if (playListResp != null) {
                List<Subject> subjects = playListResp.getSubjects();
                int size2 = subjects != null ? subjects.size() : 0;
                if (size2 < 4 && (c15117j = playListFragment.mSubjectAdapter) != null && (c27941fM36186h0 = c15117j.m36186h0()) != null) {
                    C27941f.m108652u(c27941fM36186h0, false, 1, null);
                }
                C15117j c15117j4 = playListFragment.mSubjectAdapter;
                if (c15117j4 == null || (data2 = c15117j4.getData()) == null || data2.size() != 0 || size2 != 0) {
                    playListFragment.m67511Z0(playListResp);
                } else {
                    PageStatusFragment.showEmptyView$default(playListFragment, false, 1, null);
                }
                C24655b logViewConfig2 = playListFragment.getLogViewConfig();
                if (logViewConfig2 != null) {
                    logViewConfig2.m96848k(true);
                }
            } else {
                C15117j c15117j5 = playListFragment.mSubjectAdapter;
                if (c15117j5 != null && (data = c15117j5.getData()) != null && data.size() == 0) {
                    PageStatusFragment.showEmptyView$default(playListFragment, false, 1, null);
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public final boolean m67506U0() {
        return Intrinsics.m97797c(this.mCategory, PlayListType.CAST.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C28127i m67507V0() {
        return new C28127i();
    }

    /* JADX INFO: renamed from: W0 */
    private final void m67508W0() {
        Function1 function1 = new Function1() { // from class: jl.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlayListFragment.m67509X0(this.f74502a, (AddToDownloadEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = AddToDownloadEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final Unit m67509X0(PlayListFragment playListFragment, AddToDownloadEvent value) {
        C15117j c15117j;
        List<Object> data;
        Intrinsics.m97802h(value, "value");
        try {
            C15117j c15117j2 = playListFragment.mSubjectAdapter;
            int i11 = -1;
            if (c15117j2 != null && (data = c15117j2.getData()) != null) {
                Iterator<Object> it = data.iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    if (Intrinsics.m97797c(((Subject) it.next()).getSubjectId(), value.getSubjectId())) {
                        i11 = i12;
                        break;
                    }
                    i12++;
                }
            }
            if (i11 >= 0 && (c15117j = playListFragment.mSubjectAdapter) != null) {
                c15117j.notifyItemChanged(i11);
            }
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: Y0 */
    private final void m67510Y0(PlayListResp playListResp) throws JSONException {
        List<Subject> subjects;
        List<Staff> staffs;
        String ops = playListResp != null ? playListResp.getOps() : null;
        JSONObject jSONObject = (ops == null || ops.length() == 0) ? new JSONObject() : new JSONObject(ops);
        jSONObject.put("rec_type", this.mRecType);
        jSONObject.put("label", this.mLabel);
        String string = jSONObject.toString();
        if (playListResp != null && (staffs = playListResp.getStaffs()) != null) {
            for (Staff staff : staffs) {
                String ops2 = staff.getOps();
                if (ops2 == null || ops2.length() == 0) {
                    staff.setOps(string);
                }
            }
        }
        if (playListResp == null || (subjects = playListResp.getSubjects()) == null) {
            return;
        }
        for (Subject subject : subjects) {
            String ops3 = subject.getOps();
            if (ops3 == null || ops3.length() == 0) {
                subject.setOps(string);
            }
        }
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m67511Z0(PlayListResp playListResp) {
        C24698t mViewBinding;
        List<Object> data;
        String url;
        Cover cover;
        String thumbnail;
        Cover cover2;
        List<Object> data2;
        List<Object> data3;
        C15117j c15117j;
        List<Object> data4;
        String avatarUrl;
        List<Object> data5;
        C15109b c15109b;
        if (getContext() == null || (mViewBinding = getMViewBinding()) == null) {
            return;
        }
        String title = playListResp.getTitle();
        if (title != null && title.length() > 0) {
            mViewBinding.f75576g.setText(playListResp.getTitle());
            mViewBinding.f75577h.setText(playListResp.getTitle());
        }
        Subject subject = null;
        staff = null;
        Staff staff = null;
        subject = null;
        String str = "";
        if (m67506U0()) {
            List<Staff> staffs = playListResp.getStaffs();
            if (staffs != null && (c15109b = this.mCastAdapter) != null) {
                c15109b.mo36208q(staffs);
            }
            C15109b c15109b2 = this.mCastAdapter;
            if (c15109b2 == null || (data4 = c15109b2.getData()) == null || !(!data4.isEmpty())) {
                return;
            }
            C15109b c15109b3 = this.mCastAdapter;
            if (c15109b3 != null && (data5 = c15109b3.getData()) != null) {
                staff = (Staff) data5.get(0);
            }
            C23860f.a aVar = C23860f.f72909a;
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(contextRequireContext);
            if (staff != null && (avatarUrl = staff.getAvatarUrl()) != null) {
                str = avatarUrl;
            }
            C23860f.b bVarM94468g = bVarM94457m.m94468g(str);
            AppCompatImageView ivCover = mViewBinding.f75573d;
            Intrinsics.m97801g(ivCover, "ivCover");
            bVarM94468g.m94465d(ivCover);
            return;
        }
        List<Subject> subjects = playListResp.getSubjects();
        if (subjects != null) {
            Boolean showRank = playListResp.getShowRank();
            C15117j c15117j2 = this.mSubjectAdapter;
            if (c15117j2 != null && (data3 = c15117j2.getData()) != null && data3.isEmpty() && showRank != null && (c15117j = this.mSubjectAdapter) != null) {
                c15117j.m67446T1(showRank.booleanValue());
            }
            C15117j c15117j3 = this.mSubjectAdapter;
            if (c15117j3 != null) {
                c15117j3.mo36208q(subjects);
            }
        }
        C15117j c15117j4 = this.mSubjectAdapter;
        if (c15117j4 == null || (data = c15117j4.getData()) == null || !(!data.isEmpty())) {
            return;
        }
        C15117j c15117j5 = this.mSubjectAdapter;
        if (c15117j5 != null && (data2 = c15117j5.getData()) != null) {
            subject = (Subject) data2.get(0);
        }
        C23860f.a aVar2 = C23860f.f72909a;
        Context contextRequireContext2 = requireContext();
        Intrinsics.m97801g(contextRequireContext2, "requireContext(...)");
        C23860f.b bVarM94457m2 = aVar2.m94457m(contextRequireContext2);
        if (subject == null || (cover2 = subject.getCover()) == null || (url = cover2.getUrl()) == null) {
            url = "";
        }
        C23860f.b bVarM94468g2 = bVarM94457m2.m94468g(url);
        if (subject != null && (cover = subject.getCover()) != null && (thumbnail = cover.getThumbnail()) != null) {
            str = thumbnail;
        }
        C23860f.b bVarM94473l = bVarM94468g2.m94473l(str);
        AppCompatImageView ivCover2 = mViewBinding.f75573d;
        Intrinsics.m97801g(ivCover2, "ivCover");
        bVarM94473l.m94465d(ivCover2);
    }

    private final void initAd() {
        Map mapM63681a = C14058c.f49742a.m63681a("");
        String str = this.mCategory;
        if (str != null) {
            mapM63681a.put("category", str);
        }
        BiddingListManager biddingListManager = new BiddingListManager();
        C24698t mViewBinding = getMViewBinding();
        biddingListManager.m63184F(mViewBinding != null ? mViewBinding.f75574e : null);
        biddingListManager.m63179A(AbstractC3226v.m14968a(this));
        biddingListManager.m63185G("PlayListScene");
        biddingListManager.m63180B(mapM63681a);
        biddingListManager.m63192z(new Function2() { // from class: jl.s
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PlayListFragment.m67493H0(this.f74503a, ((Integer) obj).intValue(), (BiddingNativeManager) obj2);
            }
        });
        this.v3ListManager = biddingListManager;
    }

    private final void loadData() {
        PlayListViewModel playListViewModel = this.viewModel;
        if (playListViewModel == null) {
            Intrinsics.m97819y("viewModel");
            playListViewModel = null;
        }
        PlayListViewModel playListViewModel2 = playListViewModel;
        String str = this.mLabel;
        if (str == null) {
            str = "";
        }
        String str2 = this.mCategory;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.mRecType;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.mTopIds;
        if (str4 == null) {
            str4 = "";
        }
        playListViewModel2.m68968f(str, str2, str3, str4, this.mTabId);
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

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public C24698t getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24698t c24698tM97005c = C24698t.m97005c(inflater);
        Intrinsics.m97801g(c24698tM97005c, "inflate(...)");
        return c24698tM97005c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        m67508W0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        Toolbar toolbar;
        C24698t mViewBinding = getMViewBinding();
        if (mViewBinding != null && (toolbar = mViewBinding.f75575f) != null) {
            AbstractC26006c.m102052e(toolbar);
        }
        pageStateFitStatusBar();
        initAd();
        final C24698t mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null) {
            mViewBinding2.f75572c.setOnClickListener(new View.OnClickListener() { // from class: jl.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayListFragment.m67503R0(this.f74499a, view);
                }
            });
            RecyclerView recyclerView = mViewBinding2.f75574e;
            recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext()));
            C25646b c25646b = new C25646b(0.6f, new C15124b(), false, 4, null);
            c25646b.m100946l(2);
            recyclerView.addOnScrollListener(c25646b);
            this.mExposureHelper = c25646b;
            recyclerView.setAdapter(m67506U0() ? m67494I0() : m67498M0());
            mViewBinding2.f75571b.addOnOffsetChangedListener(new AppBarLayout.InterfaceC9956g() { // from class: jl.p
                @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC9951b
                public final void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
                    PlayListFragment.m67504S0(this.f74500a, mViewBinding2, appBarLayout, i11);
                }
            });
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        PlayListViewModel playListViewModel = (PlayListViewModel) new C3227v0(this).m14969a(PlayListViewModel.class);
        this.viewModel = playListViewModel;
        PlayListViewModel playListViewModel2 = null;
        if (playListViewModel == null) {
            Intrinsics.m97819y("viewModel");
            playListViewModel = null;
        }
        playListViewModel.m68970i(1);
        PlayListViewModel playListViewModel3 = this.viewModel;
        if (playListViewModel3 == null) {
            Intrinsics.m97819y("viewModel");
        } else {
            playListViewModel2 = playListViewModel3;
        }
        playListViewModel2.m68969g().m14851j(this, new C15125c(new Function1() { // from class: jl.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlayListFragment.m67505T0(this.f74494a, (PlayListResp) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isMonitorNetworkState() {
        return true;
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
        return new C24655b("playlist", false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BiddingListManager biddingListManager = this.v3ListManager;
        if (biddingListManager != null) {
            biddingListManager.m63187o();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        HashMap mapM96844g;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mLabel = arguments.getString("label");
            this.mCategory = arguments.getString("category");
            this.mRecType = arguments.getString("recType");
            this.mTopIds = arguments.getString("topIds");
            this.mTabId = arguments.getInt("tabId", 0);
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
            return;
        }
        mapM96844g.put("label", this.mLabel);
        mapM96844g.put("category", this.mCategory);
        mapM96844g.put("rec_type", this.mRecType);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        List<Object> data;
        List<Object> data2;
        if (m67506U0()) {
            C15109b c15109b = this.mCastAdapter;
            if (c15109b != null && (data2 = c15109b.getData()) != null && data2.size() == 0) {
                reload();
                return;
            }
            C15109b c15109b2 = this.mCastAdapter;
            if (c15109b2 == null || c15109b2.m36186h0().m108661i() != LoadMoreStatus.Fail) {
                return;
            }
            c15109b2.m36186h0().m108670w();
            return;
        }
        C15117j c15117j = this.mSubjectAdapter;
        if (c15117j != null && (data = c15117j.getData()) != null && data.size() == 0) {
            reload();
            return;
        }
        C15117j c15117j2 = this.mSubjectAdapter;
        if (c15117j2 == null || c15117j2.m36186h0().m108661i() != LoadMoreStatus.Fail) {
            return;
        }
        c15117j2.m36186h0().m108670w();
    }
}
