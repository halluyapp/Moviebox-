package com.transsion.postdetail.shorttv.widget;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.p1004lifecycle.InterfaceC3208m;
import androidx.p1004lifecycle.InterfaceC3233y0;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.p282tn.lib.widget.TnTextView;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.ShortTVRespData;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.postdetail.R$layout;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.shorttv.C16903j;
import com.transsion.postdetail.shorttv.adapter.ShortTVHeaderViewAdapter;
import com.transsion.postdetail.shorttv.viewmodel.ShortTVContentViewModel;
import com.transsnet.downloader.DownloadManagerApi;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p765s6.InterfaceC27566d;
import p840vj.C28117b;
import p840vj.InterfaceC28116a;
import p844vo.C28155i0;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001!B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u0010B3\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00122\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0012¢\u0006\u0004\b \u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u00101\u001a\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010$¨\u0006?"}, m97100d2 = {"Lcom/transsion/postdetail/shorttv/widget/ShortTVHistoryView;", "Landroid/widget/LinearLayout;", "Landroidx/fragment/app/Fragment;", "fragment", "", NativeComponentConstants.KEY_COMPONENT_TYPE, "Lcom/transsion/postdetail/shorttv/j;", "recReport", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lcom/transsion/postdetail/shorttv/j;Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lcom/transsion/postdetail/shorttv/j;Landroid/content/Context;)V", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lcom/transsion/postdetail/shorttv/j;Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "c", "()V", "e", "", "Lcom/transsion/moviedetailapi/bean/Subject;", "list", "h", "(Ljava/util/List;)V", "subject", "g", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", "getItemOptType", "()Ljava/lang/String;", "clearExposureCache", "a", "Landroidx/fragment/app/Fragment;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "Lcom/transsion/postdetail/shorttv/j;", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Z", "isRTL", "I", "dp8", "Lvo/i0;", "f", "Lvo/i0;", "viewBinding", "Lcom/transsion/postdetail/shorttv/viewmodel/ShortTVContentViewModel;", "Lkotlin/Lazy;", "getViewModel", "()Lcom/transsion/postdetail/shorttv/viewmodel/ShortTVContentViewModel;", "viewModel", "Lcom/transsion/postdetail/shorttv/adapter/ShortTVHeaderViewAdapter;", "Lcom/transsion/postdetail/shorttv/adapter/ShortTVHeaderViewAdapter;", "headerAdapter", "Lvj/b;", "i", "Lvj/b;", "exposureHelper", "j", "nextPage", "Companion", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTVHistoryView extends LinearLayout {
    public static final String TYPE_HISTORY = "history";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Fragment fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C16903j recReport;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isRTL;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int dp8;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C28155i0 viewBinding;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private ShortTVHeaderViewAdapter headerAdapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private C28117b exposureHelper;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String nextPage;

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv.widget.ShortTVHistoryView$b */
    public static final class C16921b implements InterfaceC28116a {
        C16921b() {
        }

        @Override // p840vj.InterfaceC28116a
        /* JADX INFO: renamed from: a */
        public void mo65894a(int i11, long j11, View view) {
            List<Object> data;
            List<Object> data2;
            ShortTVHeaderViewAdapter shortTVHeaderViewAdapter = ShortTVHistoryView.this.headerAdapter;
            if (((shortTVHeaderViewAdapter == null || (data2 = shortTVHeaderViewAdapter.getData()) == null) ? 0 : data2.size()) <= i11) {
                return;
            }
            ShortTVHeaderViewAdapter shortTVHeaderViewAdapter2 = ShortTVHistoryView.this.headerAdapter;
            Subject subject = (shortTVHeaderViewAdapter2 == null || (data = shortTVHeaderViewAdapter2.getData()) == null) ? null : (Subject) data.get(i11);
            if (subject != null) {
                ShortTVHistoryView.this.recReport.m73725a("minitv_explore", subject, i11, j11, ShortTVHistoryView.this.getItemOptType());
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv.widget.ShortTVHistoryView$c */
    public static final class C16922c extends RecyclerView.AbstractC4213l {
        C16922c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = parent.getAdapter();
            if (adapter != null) {
                if (childAdapterPosition == 0) {
                    if (ShortTVHistoryView.this.isRTL) {
                        outRect.right = ShortTVHistoryView.this.dp8 * 2;
                        return;
                    } else {
                        outRect.left = ShortTVHistoryView.this.dp8 * 2;
                        return;
                    }
                }
                if (childAdapterPosition == adapter.getItemCount() - 1) {
                    outRect.right = ShortTVHistoryView.this.dp8;
                    outRect.left = ShortTVHistoryView.this.dp8;
                } else if (ShortTVHistoryView.this.isRTL) {
                    outRect.right = ShortTVHistoryView.this.dp8;
                } else {
                    outRect.left = ShortTVHistoryView.this.dp8;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv.widget.ShortTVHistoryView$d */
    static final class C16923d implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f56843a;

        C16923d(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f56843a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f56843a;
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
            this.f56843a.invoke(obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTVHistoryView(Fragment fragment, String type, C16903j recReport, Context context) {
        this(fragment, type, recReport, context, null);
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(type, "type");
        Intrinsics.m97802h(recReport, "recReport");
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTVHistoryView(Fragment fragment, String type, C16903j recReport, Context context, AttributeSet attributeSet) {
        this(fragment, type, recReport, context, attributeSet, 0);
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(type, "type");
        Intrinsics.m97802h(recReport, "recReport");
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTVHistoryView(final Fragment fragment, String type, C16903j recReport, Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(type, "type");
        Intrinsics.m97802h(recReport, "recReport");
        Intrinsics.m97802h(context, "context");
        this.fragment = fragment;
        this.type = type;
        this.recReport = recReport;
        this.isRTL = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        this.dp8 = AbstractC5776a0.m27313a(8.0f);
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.postdetail.shorttv.widget.ShortTVHistoryView$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragment;
            }
        };
        this.viewModel = FragmentViewModelLazyKt.m14626a(fragment, Reflection.m97823b(ShortTVContentViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.postdetail.shorttv.widget.ShortTVHistoryView$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.postdetail.shorttv.widget.ShortTVHistoryView$special$$inlined$viewModels$default$3
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
                    defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.m97801g(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.nextPage = "0";
        View.inflate(context, R$layout.layout_short_tv_history, this);
        C28155i0 c28155i0M109319a = C28155i0.m109319a(this);
        Intrinsics.m97801g(c28155i0M109319a, "bind(...)");
        this.viewBinding = c28155i0M109319a;
        setOrientation(1);
        m73771c();
        m73773e();
    }

    /* JADX INFO: renamed from: c */
    private final void m73771c() {
        this.exposureHelper = new C28117b(0.6f, new C16921b(), false, 4, null);
        ShortTVHeaderViewAdapter shortTVHeaderViewAdapter = new ShortTVHeaderViewAdapter(null, 1, null);
        shortTVHeaderViewAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.postdetail.shorttv.widget.i
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ShortTVHistoryView.m73772d(this.f56858a, baseQuickAdapter, view, i11);
            }
        });
        this.headerAdapter = shortTVHeaderViewAdapter;
        RecyclerView recyclerView = this.viewBinding.f86460b;
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new C16922c());
        recyclerView.setAdapter(this.headerAdapter);
        C28117b c28117b = this.exposureHelper;
        Intrinsics.m97799e(c28117b);
        recyclerView.addOnScrollListener(c28117b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m73772d(ShortTVHistoryView shortTVHistoryView, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        if (item instanceof Subject) {
            Subject subject = (Subject) item;
            shortTVHistoryView.recReport.m73726b("minitv_explore", subject, i11, shortTVHistoryView.getItemOptType());
            shortTVHistoryView.m73775g(subject);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m73773e() {
        if (Intrinsics.m97797c(this.type, TYPE_HISTORY)) {
            TnTextView tvTitleTrending = this.viewBinding.f86462d;
            Intrinsics.m97801g(tvTitleTrending, "tvTitleTrending");
            tvTitleTrending.setVisibility(8);
            this.viewBinding.f86461c.setText(getContext().getString(R$string.short_tv_history_title));
            this.viewBinding.f86461c.setTextWithString(getContext().getString(R$string.short_tv_history_title));
            getViewModel().m73740i().m14851j(this.fragment, new C16923d(new Function1() { // from class: com.transsion.postdetail.shorttv.widget.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShortTVHistoryView.m73774f(this.f56859a, (ShortTVRespData) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Unit m73774f(ShortTVHistoryView shortTVHistoryView, ShortTVRespData shortTVRespData) {
        String nextPage;
        if (shortTVRespData == null) {
            return Unit.f75682a;
        }
        Pager pager = shortTVRespData.getPager();
        if (pager == null || (nextPage = pager.getNextPage()) == null) {
            nextPage = "0";
        }
        shortTVHistoryView.nextPage = nextPage;
        shortTVHistoryView.m73776h(shortTVRespData.getItems());
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: g */
    private final void m73775g(Subject subject) {
        Context context = getContext();
        if (context == null || !Intrinsics.m97797c(getItemOptType(), "new_release")) {
            return;
        }
        DownloadManagerApi.f66480j.m87093a().m87086d0((FragmentActivity) context, "minitv_explore", (384 & 4) != 0 ? "" : "", subject.getOps(), (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : false, (384 & 64) != 0 ? null : subject, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getItemOptType() {
        return Intrinsics.m97797c(this.type, TYPE_HISTORY) ? "continue_watching" : "new_release";
    }

    private final ShortTVContentViewModel getViewModel() {
        return (ShortTVContentViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: h */
    private final void m73776h(List list) {
        ShortTVHeaderViewAdapter shortTVHeaderViewAdapter;
        C26866a.a.m104898f(C26866a.f81698a, "ShortTVHistoryView", "updateList, type:" + this.type + "，size:" + (list != null ? Integer.valueOf(list.size()) : null), false, 4, null);
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            ShortTVHeaderViewAdapter shortTVHeaderViewAdapter2 = this.headerAdapter;
            if (shortTVHeaderViewAdapter2 != null) {
                shortTVHeaderViewAdapter2.mo36201n1(list2);
                return;
            }
            return;
        }
        List list3 = (List) getViewModel().m73741j().m14847f();
        if (list3 == null || !(!list3.isEmpty()) || (shortTVHeaderViewAdapter = this.headerAdapter) == null) {
            return;
        }
        shortTVHeaderViewAdapter.mo36201n1(list3);
    }

    public final void clearExposureCache() {
        C28117b c28117b = this.exposureHelper;
        if (c28117b != null) {
            c28117b.m109195f();
        }
    }
}
