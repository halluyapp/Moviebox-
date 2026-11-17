package com.transsion.shorttv._channel.p312ui.fragment;

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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.google.android.material.appbar.AppBarLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.p285ad.bidding.nativead.BiddingListManager;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.strategy.C14058c;
import com.transsion.shorttv.R$color;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv._channel.model.ShortTvPlayListResp;
import com.transsion.shorttv._channel.model.ShortTvPlayListType;
import com.transsion.shorttv._channel.p312ui.activity.ShortTvPlayListActivity;
import com.transsion.shorttv._channel.p312ui.adapter.C18711a;
import com.transsion.shorttv._channel.p312ui.adapter.C18715e;
import com.transsion.shorttv._channel.p312ui.fragment.ShortTvPlayListFragment;
import com.transsion.shorttv._channel.p312ui.viewmodel.ShortTvPlayListViewModel;
import com.transsion.shorttv.base.fragment.PageStatusFragment;
import com.transsion.shorttv.bean.Cover;
import com.transsion.shorttv.bean.Staff;
import com.transsion.shorttv.bean.Subject;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.AddToDownloadEvent;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import is.C24223d;
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
import org.json.JSONException;
import org.json.JSONObject;
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
import p954yr.C29004d;
import pg.C26866a;
import rs.C27331b0;
import ss.C27644a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 Z2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001[B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010\u0018J\u000f\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\u0004J\u0017\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010\u0007J\u000f\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u0007J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0012H\u0016¢\u0006\u0004\b+\u0010\u0004J\u000f\u0010,\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010\u0004J\u000f\u0010-\u001a\u00020\u0012H\u0016¢\u0006\u0004\b-\u0010\u0004J\u000f\u0010.\u001a\u00020\u0012H\u0016¢\u0006\u0004\b.\u0010\u0004J\u000f\u0010/\u001a\u00020\u0005H\u0016¢\u0006\u0004\b/\u0010\u0007J\u000f\u00100\u001a\u00020\u0012H\u0016¢\u0006\u0004\b0\u0010\u0004J\u000f\u00101\u001a\u00020\u0012H\u0016¢\u0006\u0004\b1\u0010\u0004J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0012H\u0016¢\u0006\u0004\b5\u0010\u0004R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010;R\u0018\u0010B\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010;R\u0016\u0010E\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001b\u0010U\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0018\u0010Y\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006\\"}, m97100d2 = {"Lcom/transsion/shorttv/_channel/ui/fragment/ShortTvPlayListFragment;", "Lcom/transsion/shorttv/base/fragment/PageStatusFragment;", "Lrs/b0;", "<init>", "()V", "", "Q0", "()Z", "Lcom/transsion/shorttv/_channel/ui/adapter/a;", "E0", "()Lcom/transsion/shorttv/_channel/ui/adapter/a;", "Lcom/transsion/shorttv/_channel/ui/adapter/e;", "I0", "()Lcom/transsion/shorttv/_channel/ui/adapter/e;", "Lcom/transsion/shorttv/bean/Subject;", "subjectItem", "", RequestParameters.POSITION, "", "A0", "(Lcom/transsion/shorttv/bean/Subject;I)V", "Lcom/transsion/shorttv/_channel/model/ShortTvPlayListResp;", "playListResp", "U0", "(Lcom/transsion/shorttv/_channel/model/ShortTvPlayListResp;)V", "reload", "loadData", "loadMore", "isExpand", "z0", "(Z)V", "V0", "S0", "initAd", "Landroid/view/LayoutInflater;", "inflater", "C0", "(Landroid/view/LayoutInflater;)Lrs/b0;", "isShowPageStateLayoutTitle", "isAudioShowNoNetworkLayout", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "receiveArguments", "initViewData", "initViewModel", "initListener", "isMonitorNetworkState", "retryLoadData", "loadDefaultData", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "onDestroy", "Lcom/transsion/shorttv/_channel/ui/viewmodel/ShortTvPlayListViewModel;", "i", "Lcom/transsion/shorttv/_channel/ui/viewmodel/ShortTvPlayListViewModel;", "viewModel", "j", "Ljava/lang/String;", "mLabel", CampaignEx.JSON_KEY_AD_K, "mCategory", "l", "mRecType", "m", "mTopIds", "n", "I", "mTabId", "Lcs/b;", "o", "Lcs/b;", "mExposureHelper", TtmlNode.TAG_P, "Lcom/transsion/shorttv/_channel/ui/adapter/e;", "mSubjectAdapter", CampaignEx.JSON_KEY_AD_Q, "Lcom/transsion/shorttv/_channel/ui/adapter/a;", "mCastAdapter", "Lyr/d;", CampaignEx.JSON_KEY_AD_R, "Lkotlin/Lazy;", "B0", "()Lyr/d;", "mPlayListDotHelper", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "s", "Lcom/transsion/ad/bidding/nativead/BiddingListManager;", "v3ListManager", "t", "a", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTvPlayListFragment extends PageStatusFragment<C27331b0> {

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private ShortTvPlayListViewModel viewModel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String mLabel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String mCategory;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String mRecType;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private String mTopIds;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int mTabId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private C22776b mExposureHelper;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private C18715e mSubjectAdapter;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private C18711a mCastAdapter;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Lazy mPlayListDotHelper = LazyKt.m97097b(new Function0() { // from class: vr.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ShortTvPlayListFragment.m78795R0();
        }
    });

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private BiddingListManager v3ListManager;

    /* JADX INFO: renamed from: com.transsion.shorttv._channel.ui.fragment.ShortTvPlayListFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ShortTvPlayListFragment m78822a(String str, String str2, String str3, String str4, int i11) {
            ShortTvPlayListFragment shortTvPlayListFragment = new ShortTvPlayListFragment();
            shortTvPlayListFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("label", str), TuplesKt.m97108a("category", str2), TuplesKt.m97108a("recType", str3), TuplesKt.m97108a("topIds", str4), TuplesKt.m97108a("tab_id", Integer.valueOf(i11))));
            return shortTvPlayListFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv._channel.ui.fragment.ShortTvPlayListFragment$b */
    public static final class C18723b implements InterfaceC22775a {
        C18723b() {
        }

        @Override // p330cs.InterfaceC22775a
        /* JADX INFO: renamed from: a */
        public void mo78681a(int i11, long j11, View view) {
            Boolean hasResource;
            List<Object> data;
            List<Object> data2;
            boolean zBooleanValue = false;
            size = 0;
            int size = 0;
            zBooleanValue = false;
            if (ShortTvPlayListFragment.this.m78794Q0()) {
                C18711a c18711a = ShortTvPlayListFragment.this.mCastAdapter;
                if (c18711a != null && (data2 = c18711a.getData()) != null) {
                    size = data2.size();
                }
                if (i11 >= size) {
                    return;
                }
                C18711a c18711a2 = ShortTvPlayListFragment.this.mCastAdapter;
                Staff staff = c18711a2 != null ? (Staff) c18711a2.getItem(i11) : null;
                ShortTvPlayListFragment.this.m78780B0().m111547b("playlist", staff != null ? staff.getStaffId() : null, staff != null ? staff.getOps() : null, Integer.valueOf(i11), ShortTvPlayListFragment.this.mCategory, ShortTvPlayListFragment.this.mRecType, ShortTvPlayListFragment.this.mLabel);
                return;
            }
            C18715e c18715e = ShortTvPlayListFragment.this.mSubjectAdapter;
            if (i11 >= ((c18715e == null || (data = c18715e.getData()) == null) ? 0 : data.size())) {
                return;
            }
            C18715e c18715e2 = ShortTvPlayListFragment.this.mSubjectAdapter;
            Subject subject = c18715e2 != null ? (Subject) c18715e2.getItem(i11) : null;
            C29004d c29004dM78780B0 = ShortTvPlayListFragment.this.m78780B0();
            String subjectId = subject != null ? subject.getSubjectId() : null;
            String ops = subject != null ? subject.getOps() : null;
            Integer numValueOf = Integer.valueOf(i11);
            if (subject != null && (hasResource = subject.getHasResource()) != null) {
                zBooleanValue = hasResource.booleanValue();
            }
            c29004dM78780B0.m111549d("playlist", subjectId, ops, numValueOf, zBooleanValue, ShortTvPlayListFragment.this.mCategory, ShortTvPlayListFragment.this.mRecType, ShortTvPlayListFragment.this.mLabel);
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv._channel.ui.fragment.ShortTvPlayListFragment$c */
    static final class C18724c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f60457a;

        C18724c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f60457a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f60457a;
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
            this.f60457a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: A0 */
    private final void m78779A0(Subject subjectItem, int position) {
        Boolean hasResource;
        Context context = getContext();
        if (context != null) {
            C27644a.f84793a.m107539a((FragmentActivity) context, "playlist", subjectItem != null ? subjectItem.getOps() : null, (64 & 8) != 0 ? null : "download_subject", (64 & 16) != 0 ? false : true, (64 & 32) != 0 ? null : subjectItem, (64 & 64) != 0 ? null : null, (64 & 128) != 0 ? Boolean.FALSE : Boolean.TRUE);
            m78780B0().m111546a("playlist", "download_subject", subjectItem != null ? subjectItem.getSubjectId() : null, subjectItem != null ? subjectItem.getOps() : null, Integer.valueOf(position), (subjectItem == null || (hasResource = subjectItem.getHasResource()) == null) ? false : hasResource.booleanValue(), this.mCategory, this.mRecType, this.mLabel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public final C29004d m78780B0() {
        return (C29004d) this.mPlayListDotHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final Unit m78781D0(ShortTvPlayListFragment shortTvPlayListFragment, int i11, BiddingNativeManager current) {
        List<Object> data;
        List<Object> data2;
        Intrinsics.m97802h(current, "current");
        if (current != null) {
            int size = 0;
            if (shortTvPlayListFragment.m78794Q0()) {
                Staff staff = new Staff();
                staff.setNonAdDelegate(current);
                C18711a c18711a = shortTvPlayListFragment.mCastAdapter;
                if (c18711a != null && (data2 = c18711a.getData()) != null) {
                    size = data2.size();
                }
                if (i11 < size) {
                    C18711a c18711a2 = shortTvPlayListFragment.mCastAdapter;
                    if (c18711a2 != null) {
                        c18711a2.mo36199n(i11, staff);
                    }
                } else {
                    C18711a c18711a3 = shortTvPlayListFragment.mCastAdapter;
                    if (c18711a3 != null) {
                        c18711a3.mo36205p(staff);
                    }
                }
            } else {
                Subject subject = new Subject(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, false, null, null, 0, 0, null, 0, null, 0, null, -1, 1073741823, null);
                subject.setNonAdDelegate(current);
                C18715e c18715e = shortTvPlayListFragment.mSubjectAdapter;
                if (c18715e != null && (data = c18715e.getData()) != null) {
                    size = data.size();
                }
                if (i11 < size) {
                    C18715e c18715e2 = shortTvPlayListFragment.mSubjectAdapter;
                    if (c18715e2 != null) {
                        c18715e2.mo36199n(i11, subject);
                    }
                } else {
                    C18715e c18715e3 = shortTvPlayListFragment.mSubjectAdapter;
                    if (c18715e3 != null) {
                        c18715e3.mo36205p(subject);
                    }
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: E0 */
    private final C18711a m78782E0() {
        C18711a c18711a = new C18711a(new ArrayList(), this.mExposureHelper);
        c18711a.m36186h0().m108673z(true);
        c18711a.m36186h0().m108672y(true);
        c18711a.m36186h0().m108656D(new InterfaceC27568f() { // from class: vr.t
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                ShortTvPlayListFragment.m78783F0(this.f86823a);
            }
        });
        c18711a.m36227w1(new InterfaceC27566d() { // from class: vr.u
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ShortTvPlayListFragment.m78785H0(this.f86824a, baseQuickAdapter, view, i11);
            }
        });
        this.mCastAdapter = c18711a;
        return c18711a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final void m78783F0(final ShortTvPlayListFragment shortTvPlayListFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            shortTvPlayListFragment.loadMore();
            return;
        }
        C25427b.f76996a.m99960d(R$string.short_tv_no_network);
        C27331b0 c27331b0 = (C27331b0) shortTvPlayListFragment.getMViewBinding();
        if (c27331b0 == null || (recyclerView = c27331b0.f83084e) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: vr.n
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvPlayListFragment.m78784G0(this.f86817a);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final void m78784G0(ShortTvPlayListFragment shortTvPlayListFragment) {
        C27941f c27941fM36186h0;
        C18711a c18711a = shortTvPlayListFragment.mCastAdapter;
        if (c18711a == null || (c27941fM36186h0 = c18711a.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final void m78785H0(ShortTvPlayListFragment shortTvPlayListFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        Object item = adapter.getItem(i11);
        if (item instanceof Staff) {
            Staff staff = (Staff) item;
            Navigator.m61845x(TheRouter.m61773c("/movie/staff").m61857K("id", staff.getStaffId()).m61856J("staff", (Serializable) item), shortTvPlayListFragment.requireContext(), null, 2, null);
            shortTvPlayListFragment.m78780B0().m111548c("playlist", staff.getStaffId(), staff.getOps(), Integer.valueOf(i11), shortTvPlayListFragment.mCategory, shortTvPlayListFragment.mRecType, shortTvPlayListFragment.mLabel);
        }
    }

    /* JADX INFO: renamed from: I0 */
    private final C18715e m78786I0() {
        C18715e c18715e = new C18715e(new ArrayList(), this.mExposureHelper);
        c18715e.m36186h0().m108673z(true);
        c18715e.m36186h0().m108672y(true);
        c18715e.m36186h0().m108656D(new InterfaceC27568f() { // from class: vr.w
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                ShortTvPlayListFragment.m78787J0(this.f86826a);
            }
        });
        c18715e.m36227w1(new InterfaceC27566d() { // from class: vr.x
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ShortTvPlayListFragment.m78789L0(this.f86827a, baseQuickAdapter, view, i11);
            }
        });
        c18715e.m36193l(R$id.ll_download);
        c18715e.m36216s1(new InterfaceC27564b() { // from class: vr.m
            @Override // p765s6.InterfaceC27564b
            /* JADX INFO: renamed from: a */
            public final void mo68469a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ShortTvPlayListFragment.m78790M0(this.f86816a, baseQuickAdapter, view, i11);
            }
        });
        this.mSubjectAdapter = c18715e;
        return c18715e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final void m78787J0(final ShortTvPlayListFragment shortTvPlayListFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            shortTvPlayListFragment.loadMore();
            return;
        }
        C25427b.f76996a.m99960d(R$string.short_tv_no_network);
        C27331b0 c27331b0 = (C27331b0) shortTvPlayListFragment.getMViewBinding();
        if (c27331b0 == null || (recyclerView = c27331b0.f83084e) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: vr.o
            @Override // java.lang.Runnable
            public final void run() {
                ShortTvPlayListFragment.m78788K0(this.f86818a);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final void m78788K0(ShortTvPlayListFragment shortTvPlayListFragment) {
        C27941f c27941fM36186h0;
        C18715e c18715e = shortTvPlayListFragment.mSubjectAdapter;
        if (c18715e == null || (c27941fM36186h0 = c18715e.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final void m78789L0(ShortTvPlayListFragment shortTvPlayListFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        Object item = adapter.getItem(i11);
        if (item instanceof Subject) {
            Subject subject = (Subject) item;
            AbstractC29002b.m111538c(subject);
            C29004d c29004dM78780B0 = shortTvPlayListFragment.m78780B0();
            String subjectId = subject.getSubjectId();
            String ops = subject.getOps();
            Integer numValueOf = Integer.valueOf(i11);
            Boolean hasResource = subject.getHasResource();
            c29004dM78780B0.m111550e("playlist", subjectId, ops, numValueOf, hasResource != null ? hasResource.booleanValue() : false, shortTvPlayListFragment.mCategory, shortTvPlayListFragment.mRecType, shortTvPlayListFragment.mLabel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final void m78790M0(ShortTvPlayListFragment shortTvPlayListFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        if (C24223d.f73737a.m95247a(view.getId(), 2000L)) {
            return;
        }
        Object item = adapter.getItem(i11);
        Subject subject = item instanceof Subject ? (Subject) item : null;
        if (view.getId() == R$id.ll_download) {
            shortTvPlayListFragment.m78779A0(subject, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final void m78791N0(ShortTvPlayListFragment shortTvPlayListFragment, View view) {
        FragmentActivity activity = shortTvPlayListFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final void m78792O0(ShortTvPlayListFragment shortTvPlayListFragment, C27331b0 c27331b0, AppBarLayout appBarLayout, int i11) {
        if (shortTvPlayListFragment.getContext() == null) {
            return;
        }
        if (Math.abs(i11) >= appBarLayout.getTotalScrollRange()) {
            c27331b0.f83085f.setBackgroundColor(AbstractC2397b.getColor(shortTvPlayListFragment.requireContext(), R$color.short_tv_bg));
            c27331b0.f83082c.setImageTintList(ColorStateList.valueOf(AbstractC2397b.getColor(shortTvPlayListFragment.requireContext(), R$color.short_tv_white)));
            AppCompatTextView tvTitle = c27331b0.f83086g;
            Intrinsics.m97801g(tvTitle, "tvTitle");
            AbstractC23048b.m91694e(tvTitle);
            AppCompatTextView tvTitleExpand = c27331b0.f83087h;
            Intrinsics.m97801g(tvTitleExpand, "tvTitleExpand");
            AbstractC23048b.m91691b(tvTitleExpand);
            shortTvPlayListFragment.m78820z0(true);
            return;
        }
        c27331b0.f83085f.setBackgroundColor(AbstractC2397b.getColor(shortTvPlayListFragment.requireContext(), R$color.short_tv_transparent));
        c27331b0.f83082c.setImageTintList(ColorStateList.valueOf(AbstractC2397b.getColor(shortTvPlayListFragment.requireContext(), R$color.short_tv_white)));
        AppCompatTextView tvTitle2 = c27331b0.f83086g;
        Intrinsics.m97801g(tvTitle2, "tvTitle");
        AbstractC23048b.m91691b(tvTitle2);
        AppCompatTextView tvTitleExpand2 = c27331b0.f83087h;
        Intrinsics.m97801g(tvTitleExpand2, "tvTitleExpand");
        AbstractC23048b.m91694e(tvTitleExpand2);
        shortTvPlayListFragment.m78820z0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final Unit m78793P0(ShortTvPlayListFragment shortTvPlayListFragment, ShortTvPlayListResp shortTvPlayListResp) throws JSONException {
        List<Object> data;
        List<Object> data2;
        C18715e c18715e;
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        C18715e c18715e2;
        C27941f c27941fM36186h2;
        List<Object> data3;
        List<Object> data4;
        C18711a c18711a;
        C27941f c27941fM36186h3;
        C27941f c27941fM36186h4;
        C18711a c18711a2;
        C27941f c27941fM36186h5;
        shortTvPlayListFragment.showContentView();
        shortTvPlayListFragment.m78798U0(shortTvPlayListResp);
        if (shortTvPlayListFragment.m78794Q0()) {
            C18711a c18711a3 = shortTvPlayListFragment.mCastAdapter;
            if (c18711a3 != null && (c27941fM36186h4 = c18711a3.m36186h0()) != null && c27941fM36186h4.m108666r() && (c18711a2 = shortTvPlayListFragment.mCastAdapter) != null && (c27941fM36186h5 = c18711a2.m36186h0()) != null) {
                c27941fM36186h5.m108667s();
            }
            if (shortTvPlayListResp != null) {
                List<Staff> staffs = shortTvPlayListResp.getStaffs();
                int size = staffs != null ? staffs.size() : 0;
                if (size < 4 && (c18711a = shortTvPlayListFragment.mCastAdapter) != null && (c27941fM36186h3 = c18711a.m36186h0()) != null) {
                    C27941f.m108652u(c27941fM36186h3, false, 1, null);
                }
                C18711a c18711a4 = shortTvPlayListFragment.mCastAdapter;
                if (c18711a4 == null || (data4 = c18711a4.getData()) == null || data4.size() != 0 || size != 0) {
                    shortTvPlayListFragment.m78799V0(shortTvPlayListResp);
                } else {
                    PageStatusFragment.m79069c0(shortTvPlayListFragment, false, 1, null);
                }
                C24655b logViewConfig = shortTvPlayListFragment.getLogViewConfig();
                if (logViewConfig != null) {
                    logViewConfig.m96848k(true);
                }
            } else {
                C18711a c18711a5 = shortTvPlayListFragment.mCastAdapter;
                if (c18711a5 != null && (data3 = c18711a5.getData()) != null && data3.size() == 0) {
                    PageStatusFragment.m79069c0(shortTvPlayListFragment, false, 1, null);
                }
            }
        } else {
            C18715e c18715e3 = shortTvPlayListFragment.mSubjectAdapter;
            if (c18715e3 != null && (c27941fM36186h1 = c18715e3.m36186h0()) != null && c27941fM36186h1.m108666r() && (c18715e2 = shortTvPlayListFragment.mSubjectAdapter) != null && (c27941fM36186h2 = c18715e2.m36186h0()) != null) {
                c27941fM36186h2.m108667s();
            }
            if (shortTvPlayListResp != null) {
                List<Subject> subjects = shortTvPlayListResp.getSubjects();
                int size2 = subjects != null ? subjects.size() : 0;
                if (size2 < 4 && (c18715e = shortTvPlayListFragment.mSubjectAdapter) != null && (c27941fM36186h0 = c18715e.m36186h0()) != null) {
                    C27941f.m108652u(c27941fM36186h0, false, 1, null);
                }
                C18715e c18715e4 = shortTvPlayListFragment.mSubjectAdapter;
                if (c18715e4 == null || (data2 = c18715e4.getData()) == null || data2.size() != 0 || size2 != 0) {
                    shortTvPlayListFragment.m78799V0(shortTvPlayListResp);
                } else {
                    PageStatusFragment.m79069c0(shortTvPlayListFragment, false, 1, null);
                }
                C24655b logViewConfig2 = shortTvPlayListFragment.getLogViewConfig();
                if (logViewConfig2 != null) {
                    logViewConfig2.m96848k(true);
                }
            } else {
                C18715e c18715e5 = shortTvPlayListFragment.mSubjectAdapter;
                if (c18715e5 != null && (data = c18715e5.getData()) != null && data.size() == 0) {
                    PageStatusFragment.m79069c0(shortTvPlayListFragment, false, 1, null);
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public final boolean m78794Q0() {
        return Intrinsics.m97797c(this.mCategory, ShortTvPlayListType.CAST.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final C29004d m78795R0() {
        return new C29004d();
    }

    /* JADX INFO: renamed from: S0 */
    private final void m78796S0() {
        Function1 function1 = new Function1() { // from class: vr.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvPlayListFragment.m78797T0(this.f86819a, (AddToDownloadEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = AddToDownloadEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final Unit m78797T0(ShortTvPlayListFragment shortTvPlayListFragment, AddToDownloadEvent value) {
        C18715e c18715e;
        List<Object> data;
        Intrinsics.m97802h(value, "value");
        try {
            C18715e c18715e2 = shortTvPlayListFragment.mSubjectAdapter;
            int i11 = -1;
            if (c18715e2 != null && (data = c18715e2.getData()) != null) {
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
            if (i11 >= 0 && (c18715e = shortTvPlayListFragment.mSubjectAdapter) != null) {
                c18715e.notifyItemChanged(i11);
            }
        } catch (Exception unused) {
            C26866a.a.m104899g(C26866a.f81698a, " callback change data fail", false, 2, null);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: U0 */
    private final void m78798U0(ShortTvPlayListResp playListResp) throws JSONException {
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

    /* JADX INFO: renamed from: V0 */
    private final void m78799V0(ShortTvPlayListResp playListResp) {
        C27331b0 c27331b0;
        List<Object> data;
        String url;
        Cover cover;
        String thumbnail;
        Cover cover2;
        List<Object> data2;
        List<Object> data3;
        C18715e c18715e;
        List<Object> data4;
        String avatarUrl;
        List<Object> data5;
        C18711a c18711a;
        if (getContext() == null || (c27331b0 = (C27331b0) getMViewBinding()) == null) {
            return;
        }
        String title = playListResp.getTitle();
        if (title != null && title.length() > 0) {
            c27331b0.f83086g.setText(playListResp.getTitle());
            c27331b0.f83087h.setText(playListResp.getTitle());
        }
        Subject subject = null;
        staff = null;
        Staff staff = null;
        subject = null;
        String str = "";
        if (m78794Q0()) {
            List<Staff> staffs = playListResp.getStaffs();
            if (staffs != null && (c18711a = this.mCastAdapter) != null) {
                c18711a.mo36208q(staffs);
            }
            C18711a c18711a2 = this.mCastAdapter;
            if (c18711a2 == null || (data4 = c18711a2.getData()) == null || !(!data4.isEmpty())) {
                return;
            }
            C18711a c18711a3 = this.mCastAdapter;
            if (c18711a3 != null && (data5 = c18711a3.getData()) != null) {
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
            AppCompatImageView ivCover = c27331b0.f83083d;
            Intrinsics.m97801g(ivCover, "ivCover");
            bVarM94468g.m94465d(ivCover);
            return;
        }
        List<Subject> subjects = playListResp.getSubjects();
        if (subjects != null) {
            Boolean showRank = playListResp.getShowRank();
            C18715e c18715e2 = this.mSubjectAdapter;
            if (c18715e2 != null && (data3 = c18715e2.getData()) != null && data3.isEmpty() && showRank != null && (c18715e = this.mSubjectAdapter) != null) {
                c18715e.m78710T1(showRank.booleanValue());
            }
            C18715e c18715e3 = this.mSubjectAdapter;
            if (c18715e3 != null) {
                c18715e3.mo36208q(subjects);
            }
        }
        C18715e c18715e4 = this.mSubjectAdapter;
        if (c18715e4 == null || (data = c18715e4.getData()) == null || !(!data.isEmpty())) {
            return;
        }
        C18715e c18715e5 = this.mSubjectAdapter;
        if (c18715e5 != null && (data2 = c18715e5.getData()) != null) {
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
        AppCompatImageView ivCover2 = c27331b0.f83083d;
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
        C27331b0 c27331b0 = (C27331b0) getMViewBinding();
        biddingListManager.m63184F(c27331b0 != null ? c27331b0.f83084e : null);
        biddingListManager.m63179A(AbstractC3226v.m14968a(this));
        biddingListManager.m63185G("PlayListScene");
        biddingListManager.m63180B(mapM63681a);
        biddingListManager.m63192z(new Function2() { // from class: vr.v
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ShortTvPlayListFragment.m78781D0(this.f86825a, ((Integer) obj).intValue(), (BiddingNativeManager) obj2);
            }
        });
        this.v3ListManager = biddingListManager;
    }

    private final void loadData() {
        ShortTvPlayListViewModel shortTvPlayListViewModel = this.viewModel;
        if (shortTvPlayListViewModel == null) {
            Intrinsics.m97819y("viewModel");
            shortTvPlayListViewModel = null;
        }
        ShortTvPlayListViewModel shortTvPlayListViewModel2 = shortTvPlayListViewModel;
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
        shortTvPlayListViewModel2.m78854f(str, str2, str3, str4, this.mTabId);
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

    /* JADX INFO: renamed from: z0 */
    private final void m78820z0(boolean isExpand) {
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            if (activity instanceof ShortTvPlayListActivity) {
                ((ShortTvPlayListActivity) activity).m78700W(isExpand);
            }
        }
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public C27331b0 getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C27331b0 c27331b0M106426c = C27331b0.m106426c(inflater);
        Intrinsics.m97801g(c27331b0M106426c, "inflate(...)");
        return c27331b0M106426c;
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initListener() {
        m78796S0();
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initViewData() {
        Toolbar toolbar;
        Toolbar toolbar2;
        C27331b0 c27331b0 = (C27331b0) getMViewBinding();
        if (c27331b0 != null && (toolbar2 = c27331b0.f83085f) != null) {
            AbstractC29002b.m111536a(toolbar2);
        }
        pageStateFitStatusBar();
        initAd();
        if (((C27331b0) getMViewBinding()) != null) {
            C27331b0 c27331b1 = (C27331b0) getMViewBinding();
            if (c27331b1 != null && (toolbar = c27331b1.f83085f) != null) {
                AbstractC29002b.m111536a(toolbar);
            }
            pageStateFitStatusBar();
            initAd();
            final C27331b0 c27331b2 = (C27331b0) getMViewBinding();
            if (c27331b2 != null) {
                c27331b2.f83082c.setOnClickListener(new View.OnClickListener() { // from class: vr.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ShortTvPlayListFragment.m78791N0(this.f86820a, view);
                    }
                });
                RecyclerView recyclerView = c27331b2.f83084e;
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                C22776b c22776b = new C22776b(0.6f, new C18723b(), false, 4, null);
                c22776b.m90705l(2);
                recyclerView.addOnScrollListener(c22776b);
                this.mExposureHelper = c22776b;
                recyclerView.setAdapter(m78794Q0() ? m78782E0() : m78786I0());
                c27331b2.f83081b.addOnOffsetChangedListener(new AppBarLayout.InterfaceC9956g() { // from class: vr.s
                    @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC9951b
                    public final void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
                        ShortTvPlayListFragment.m78792O0(this.f86821a, c27331b2, appBarLayout, i11);
                    }
                });
            }
        }
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void initViewModel() {
        ShortTvPlayListViewModel shortTvPlayListViewModel = (ShortTvPlayListViewModel) new C3227v0(this).m14969a(ShortTvPlayListViewModel.class);
        this.viewModel = shortTvPlayListViewModel;
        ShortTvPlayListViewModel shortTvPlayListViewModel2 = null;
        if (shortTvPlayListViewModel == null) {
            Intrinsics.m97819y("viewModel");
            shortTvPlayListViewModel = null;
        }
        shortTvPlayListViewModel.m78856i(1);
        ShortTvPlayListViewModel shortTvPlayListViewModel3 = this.viewModel;
        if (shortTvPlayListViewModel3 == null) {
            Intrinsics.m97819y("viewModel");
        } else {
            shortTvPlayListViewModel2 = shortTvPlayListViewModel3;
        }
        shortTvPlayListViewModel2.m78855g().m14851j(this, new C18724c(new Function1() { // from class: vr.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShortTvPlayListFragment.m78793P0(this.f86815a, (ShortTvPlayListResp) obj);
            }
        }));
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return true;
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public boolean isMonitorNetworkState() {
        return true;
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public boolean isShowPageStateLayoutTitle() {
        return false;
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
        return new C24655b("playlist", false, 2, null);
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BiddingListManager biddingListManager = this.v3ListManager;
        if (biddingListManager != null) {
            biddingListManager.m63187o();
        }
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void receiveArguments() {
        HashMap mapM96844g;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.mLabel = arguments.getString("label");
            this.mCategory = arguments.getString("category");
            this.mRecType = arguments.getString("recType");
            this.mTopIds = arguments.getString("topIds");
            this.mTabId = arguments.getInt("tab_id", 0);
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
            return;
        }
        mapM96844g.put("label", this.mLabel);
        mapM96844g.put("category", this.mCategory);
        mapM96844g.put("rec_type", this.mRecType);
    }

    @Override // com.transsion.shorttv.base.fragment.PageStatusFragment
    public void retryLoadData() {
        List<Object> data;
        List<Object> data2;
        if (m78794Q0()) {
            C18711a c18711a = this.mCastAdapter;
            if (c18711a != null && (data2 = c18711a.getData()) != null && data2.size() == 0) {
                reload();
                return;
            }
            C18711a c18711a2 = this.mCastAdapter;
            if (c18711a2 == null || c18711a2.m36186h0().m108661i() != LoadMoreStatus.Fail) {
                return;
            }
            c18711a2.m36186h0().m108670w();
            return;
        }
        C18715e c18715e = this.mSubjectAdapter;
        if (c18715e != null && (data = c18715e.getData()) != null && data.size() == 0) {
            reload();
            return;
        }
        C18715e c18715e2 = this.mSubjectAdapter;
        if (c18715e2 == null || c18715e2.m36186h0().m108661i() != LoadMoreStatus.Fail) {
            return;
        }
        c18715e2.m36186h0().m108670w();
    }
}
