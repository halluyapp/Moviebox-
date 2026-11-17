package com.transsion.subroom.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.AbstractC2397b;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.flexbox.C9902d;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.p299mb.config.download.UserPreferOption;
import com.transsion.startup.StartupManager;
import com.transsion.subroom.R$drawable;
import com.transsion.subroom.R$id;
import com.transsion.subroom.R$string;
import com.transsion.subroom.adapter.C19639a;
import com.transsion.subroom.fragment.UserPreferFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26006c;
import p418fu.C23434d;
import p550kj.C24655b;
import p743rh.C27287m;
import p765s6.InterfaceC27566d;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
@Metadata(m97099d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R3\u00102\u001a\u001f\u0012\u0013\u0012\u00110,¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u00010\b0+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010>R\u0018\u0010K\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010B¨\u0006L"}, m97100d2 = {"Lcom/transsion/subroom/fragment/UserPreferFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lfu/d;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "f0", "(Landroid/view/ViewGroup;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "e0", "(Landroid/view/View;)V", "i0", "Landroid/view/LayoutInflater;", "inflater", "d0", "(Landroid/view/LayoutInflater;)Lfu/d;", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "v", "onClick", "lazyLoadData", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "", "a", "Ljava/lang/String;", "TAG", "Lcom/transsion/subroom/adapter/a;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/subroom/adapter/a;", "mAdapter", "", "Lcom/transsion/mb/config/download/UserPreferOption;", "c", "Ljava/util/List;", "mCheckedList", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "removeFragment", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lkotlin/jvm/functions/Function1;", "mCallback", "e", "Landroid/view/ViewGroup;", "parentView", "f", "Landroid/view/View;", "rootView", "g", "Z", "viewCreated", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "tvSkip", "Landroid/widget/ProgressBar;", "i", "Landroid/widget/ProgressBar;", "pbSkip", "Landroidx/recyclerview/widget/RecyclerView;", "j", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", CampaignEx.JSON_KEY_AD_K, "tvSubmit", "l", "loadView", "app_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UserPreferFragment extends BaseFragment<C23434d> implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C19639a mAdapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ViewGroup parentView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private View rootView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean viewCreated;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private TextView tvSkip;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private ProgressBar pbSkip;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private RecyclerView recyclerView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private TextView tvSubmit;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private ProgressBar loadView;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String TAG = "UserPrefer-tag";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private List mCheckedList = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Function1 mCallback = new Function1() { // from class: gu.a
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return UserPreferFragment.m81816h0(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: com.transsion.subroom.fragment.UserPreferFragment$a */
    public static final class C19646a extends DiffUtil.AbstractC4174e {
        C19646a() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(UserPreferOption oldItem, UserPreferOption newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getId(), newItem.getId());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(UserPreferOption oldItem, UserPreferOption newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.getId(), newItem.getId());
        }
    }

    /* JADX INFO: renamed from: e0 */
    private final void m81813e0(View view) {
    }

    /* JADX INFO: renamed from: f0 */
    private final void m81814f0(ViewGroup parent) {
        this.tvSkip = parent != null ? (TextView) parent.findViewById(R$id.tv_skip) : null;
        this.pbSkip = parent != null ? (ProgressBar) parent.findViewById(R$id.pb_skip) : null;
        this.recyclerView = parent != null ? (RecyclerView) parent.findViewById(R$id.recycler_view) : null;
        this.tvSubmit = parent != null ? (TextView) parent.findViewById(R$id.tv_submit) : null;
        this.loadView = parent != null ? (ProgressBar) parent.findViewById(R$id.load_view) : null;
        TextView textView = this.tvSkip;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = this.tvSubmit;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        TextView textView3 = this.tvSubmit;
        if (textView3 != null) {
            textView3.setSelected(true);
        }
        C19639a c19639a = new C19639a(new ArrayList());
        c19639a.m36227w1(new InterfaceC27566d() { // from class: gu.c
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                UserPreferFragment.m81815g0(this.f72382a, baseQuickAdapter, view, i11);
            }
        });
        c19639a.m36158R0(new C19646a());
        this.mAdapter = c19639a;
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext());
            flexboxLayoutManager.m44837c0(0);
            flexboxLayoutManager.m44838d0(1);
            flexboxLayoutManager.m44839e0(0);
            recyclerView.setLayoutManager(flexboxLayoutManager);
            C9902d c9902d = new C9902d(recyclerView.getContext());
            c9902d.m44968l(3);
            c9902d.m44967i(AbstractC2397b.getDrawable(Utils.m27275a(), R$drawable.space_user_perfer_decoration));
            recyclerView.addItemDecoration(c9902d);
            recyclerView.setAdapter(this.mAdapter);
        }
        m81813e0(parent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final void m81815g0(UserPreferFragment userPreferFragment, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        Object item = adapter.getItem(i11);
        Intrinsics.m97800f(item, "null cannot be cast to non-null type com.transsion.mb.config.download.UserPreferOption");
        UserPreferOption userPreferOption = (UserPreferOption) item;
        boolean zIsSelected = view.isSelected();
        if (zIsSelected) {
            userPreferFragment.mCheckedList.remove(userPreferOption);
            view.setSelected(!zIsSelected);
        } else if (userPreferFragment.mCheckedList.size() >= 5) {
            C28951b.f88586a.m111454d(R$string.choose_up_to_5);
        } else {
            userPreferFragment.mCheckedList.add(userPreferOption);
            view.setSelected(!zIsSelected);
        }
        TextView textView = userPreferFragment.tvSubmit;
        if (textView != null) {
            textView.setSelected(userPreferFragment.mCheckedList.isEmpty());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final Unit m81816h0(boolean z11) {
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: i0 */
    private final void m81817i0() {
        TextView textView = this.tvSubmit;
        if (textView != null) {
            textView.setClickable(false);
        }
        TextView textView2 = this.tvSubmit;
        if (textView2 != null) {
            textView2.setText("");
        }
        ProgressBar progressBar = this.loadView;
        if (progressBar != null) {
            AbstractC26006c.m102058k(progressBar);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.mCheckedList.iterator();
        while (it.hasNext()) {
            String id2 = ((UserPreferOption) it.next()).getId();
            if (id2 != null) {
                arrayList.add(id2);
            }
        }
        StartupManager.f62536g.m81510a().m81508p0(arrayList, new Function1() { // from class: gu.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserPreferFragment.m81818j0(this.f72381a, ((Boolean) obj).booleanValue());
            }
        });
        this.mCallback.invoke(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final Unit m81818j0(UserPreferFragment userPreferFragment, boolean z11) {
        C26866a.a.m104898f(C26866a.f81698a, userPreferFragment.TAG, "submit success result = " + z11, false, 4, null);
        return Unit.f75682a;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public C23434d getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23434d c23434dM93036c = C23434d.m93036c(inflater);
        Intrinsics.m97801g(c23434dM93036c, "inflate(...)");
        return c23434dM93036c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        this.parentView = (ViewGroup) view;
        if (this.rootView == null) {
            this.viewCreated = true;
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "userPrefer", "userprefer, xml inflate before viewCreated", false, 4, null);
        ViewGroup viewGroup = this.parentView;
        if (viewGroup != null) {
            viewGroup.addView(view, new ViewGroup.LayoutParams(-1, -1));
        }
        m81814f0(this.parentView);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public C24655b newLogViewConfig() {
        return new C24655b("UserPrefer", false, 2, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        Integer numValueOf = v11 != null ? Integer.valueOf(v11.getId()) : null;
        int i11 = R$id.tv_skip;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            this.mCallback.invoke(Boolean.TRUE);
            ProgressBar progressBar = this.pbSkip;
            if (progressBar != null) {
                AbstractC26006c.m102058k(progressBar);
            }
            TextView textView = this.tvSkip;
            if (textView != null) {
                AbstractC26006c.m102055h(textView);
                return;
            }
            return;
        }
        int i12 = R$id.tv_submit;
        if (numValueOf != null && numValueOf.intValue() == i12) {
            if (this.mCheckedList.isEmpty()) {
                C28951b.f88586a.m111454d(R$string.choose_at_least_one);
            } else if (C27287m.f83003a.m106330e()) {
                m81817i0();
            } else {
                C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
            }
        }
    }
}
