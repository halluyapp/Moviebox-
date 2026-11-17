package com.transsion.shorttv.p315ui.widget;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
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
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv.R$string;
import com.transsion.shorttv.base.widget.HorizontalRecyclerview2;
import com.transsion.shorttv.base.widget.NpaLinearLayoutManager;
import com.transsion.shorttv.base.widget.TnTextView;
import com.transsion.shorttv.bean.Pager;
import com.transsion.shorttv.bean.ShortTVRespData;
import com.transsion.shorttv.bean.Subject;
import com.transsion.shorttv.p315ui.activity.ShortTvListActivity;
import com.transsion.shorttv.p315ui.adapter.ShortTVHeaderViewAdapter;
import com.transsion.shorttv.viewmodel.ShortTvViewModel;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import java.util.Locale;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p330cs.C22776b;
import p330cs.InterfaceC22775a;
import p718qs.C27125a;
import p765s6.InterfaceC27566d;
import p919xs.C28653a;
import pg.C26866a;
import rs.C27345i0;
import ss.C27644a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 >2\u00020\u0001:\u0001!B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u0010B3\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00122\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0012¢\u0006\u0004\b \u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0014\u0010,\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010;R\u0016\u0010=\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010$¨\u0006?"}, m97100d2 = {"Lcom/transsion/shorttv/ui/widget/ShortTVFavoriteView;", "Landroid/widget/LinearLayout;", "Landroidx/fragment/app/Fragment;", "fragment", "", NativeComponentConstants.KEY_COMPONENT_TYPE, "Lxs/a;", "recReport", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lxs/a;Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lxs/a;Landroid/content/Context;)V", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lxs/a;Landroid/content/Context;Landroid/util/AttributeSet;)V", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "()V", "g", "", "Lcom/transsion/shorttv/bean/Subject;", "list", "j", "(Ljava/util/List;)V", "subject", "i", "(Lcom/transsion/shorttv/bean/Subject;)V", "getItemOptType", "()Ljava/lang/String;", "clearExposureCache", "a", "Landroidx/fragment/app/Fragment;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "c", "Lxs/a;", "", "Z", "isRTL", "e", "I", "dp8", "Lrs/i0;", "f", "Lrs/i0;", "viewBinding", "Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", "Lkotlin/Lazy;", "getViewModel", "()Lcom/transsion/shorttv/viewmodel/ShortTvViewModel;", "viewModel", "Lcom/transsion/shorttv/ui/adapter/ShortTVHeaderViewAdapter;", "h", "Lcom/transsion/shorttv/ui/adapter/ShortTVHeaderViewAdapter;", "headerAdapter", "Lcs/b;", "Lcs/b;", "exposureHelper", "nextPage", "Companion", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTVFavoriteView extends LinearLayout {
    public static final String TYPE_COLLECTION = "collection";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Fragment fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C28653a recReport;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isRTL;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int dp8;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C27345i0 viewBinding;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private ShortTVHeaderViewAdapter headerAdapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private C22776b exposureHelper;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String nextPage;

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.ShortTVFavoriteView$b */
    public static final class C19088b implements InterfaceC22775a {
        C19088b() {
        }

        @Override // p330cs.InterfaceC22775a
        /* JADX INFO: renamed from: a */
        public void mo78681a(int i11, long j11, View view) {
            List<Object> data;
            List<Object> data2;
            ShortTVHeaderViewAdapter shortTVHeaderViewAdapter = ShortTVFavoriteView.this.headerAdapter;
            if (((shortTVHeaderViewAdapter == null || (data2 = shortTVHeaderViewAdapter.getData()) == null) ? 0 : data2.size()) <= i11) {
                return;
            }
            ShortTVHeaderViewAdapter shortTVHeaderViewAdapter2 = ShortTVFavoriteView.this.headerAdapter;
            Subject subject = (shortTVHeaderViewAdapter2 == null || (data = shortTVHeaderViewAdapter2.getData()) == null) ? null : (Subject) data.get(i11);
            if (subject != null) {
                ShortTVFavoriteView.this.recReport.m110418a("minitv_explore", subject, i11, Long.valueOf(j11), ShortTVFavoriteView.this.getItemOptType());
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.ShortTVFavoriteView$c */
    public static final class C19089c extends RecyclerView.AbstractC4213l {
        C19089c() {
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
                    if (ShortTVFavoriteView.this.isRTL) {
                        outRect.right = ShortTVFavoriteView.this.dp8 * 2;
                        return;
                    } else {
                        outRect.left = ShortTVFavoriteView.this.dp8 * 2;
                        return;
                    }
                }
                if (childAdapterPosition == adapter.getItemCount() - 1) {
                    outRect.right = ShortTVFavoriteView.this.dp8;
                    outRect.left = ShortTVFavoriteView.this.dp8;
                } else if (ShortTVFavoriteView.this.isRTL) {
                    outRect.right = ShortTVFavoriteView.this.dp8;
                } else {
                    outRect.left = ShortTVFavoriteView.this.dp8;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.shorttv.ui.widget.ShortTVFavoriteView$d */
    static final class C19090d implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f61361a;

        C19090d(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f61361a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f61361a;
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
            this.f61361a.invoke(obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTVFavoriteView(Fragment fragment, String type, C28653a recReport, Context context) {
        this(fragment, type, recReport, context, null);
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(type, "type");
        Intrinsics.m97802h(recReport, "recReport");
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortTVFavoriteView(Fragment fragment, String type, C28653a recReport, Context context, AttributeSet attributeSet) {
        this(fragment, type, recReport, context, attributeSet, 0);
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(type, "type");
        Intrinsics.m97802h(recReport, "recReport");
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTVFavoriteView(final Fragment fragment, String type, C28653a recReport, Context context, AttributeSet attributeSet, int i11) {
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
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.transsion.shorttv.ui.widget.ShortTVFavoriteView$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragment;
            }
        };
        this.viewModel = FragmentViewModelLazyKt.m14626a(fragment, Reflection.m97823b(ShortTvViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.shorttv.ui.widget.ShortTVFavoriteView$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = ((InterfaceC3233y0) function0.invoke()).getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.shorttv.ui.widget.ShortTVFavoriteView$special$$inlined$viewModels$default$3
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
        View.inflate(context, R$layout.short_tv_layout_favorite, this);
        C27345i0 c27345i0M106458a = C27345i0.m106458a(this);
        Intrinsics.m97801g(c27345i0M106458a, "bind(...)");
        this.viewBinding = c27345i0M106458a;
        setOrientation(1);
        m80027d();
        m80030g();
    }

    /* JADX INFO: renamed from: d */
    private final void m80027d() {
        this.exposureHelper = new C22776b(0.6f, new C19088b(), false, 4, null);
        ShortTVHeaderViewAdapter shortTVHeaderViewAdapter = new ShortTVHeaderViewAdapter(null, 1, null);
        shortTVHeaderViewAdapter.m36227w1(new InterfaceC27566d() { // from class: com.transsion.shorttv.ui.widget.h
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ShortTVFavoriteView.m80028e(this.f61501a, baseQuickAdapter, view, i11);
            }
        });
        this.headerAdapter = shortTVHeaderViewAdapter;
        HorizontalRecyclerview2 horizontalRecyclerview2 = this.viewBinding.f83172b;
        horizontalRecyclerview2.setLayoutManager(new NpaLinearLayoutManager(horizontalRecyclerview2.getContext(), 0, false));
        horizontalRecyclerview2.addItemDecoration(new C19089c());
        horizontalRecyclerview2.setAdapter(this.headerAdapter);
        C22776b c22776b = this.exposureHelper;
        Intrinsics.m97799e(c22776b);
        horizontalRecyclerview2.addOnScrollListener(c22776b);
        this.viewBinding.f83175e.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.shorttv.ui.widget.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortTVFavoriteView.m80029f(this.f61503a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m80028e(ShortTVFavoriteView shortTVFavoriteView, BaseQuickAdapter adapter, View view, int i11) {
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        if (item instanceof Subject) {
            Subject subject = (Subject) item;
            shortTVFavoriteView.recReport.m110419c("minitv_explore", subject, i11, shortTVFavoriteView.getItemOptType());
            shortTVFavoriteView.m80032i(subject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m80029f(ShortTVFavoriteView shortTVFavoriteView, View view) {
        List<Object> data;
        Subject subject;
        ShortTVHeaderViewAdapter shortTVHeaderViewAdapter = shortTVFavoriteView.headerAdapter;
        String ops = (shortTVHeaderViewAdapter == null || (data = shortTVHeaderViewAdapter.getData()) == null || (subject = (Subject) CollectionsKt.m97361k0(data)) == null) ? null : subject.getOps();
        C26866a.a.m104899g(C26866a.f81698a, "Click view all", false, 2, null);
        Navigator.m61845x(TheRouter.m61773c(C27125a.f82236a.m105545c()).m61857K("ops", ops), shortTVFavoriteView.getContext(), null, 2, null);
    }

    /* JADX INFO: renamed from: g */
    private final void m80030g() {
        if (Intrinsics.m97797c(this.type, "collection")) {
            TnTextView tvTitleTrending = this.viewBinding.f83174d;
            Intrinsics.m97801g(tvTitleTrending, "tvTitleTrending");
            tvTitleTrending.setVisibility(8);
            AppCompatTextView appCompatTextView = this.viewBinding.f83173c;
            Context context = getContext();
            appCompatTextView.setText(context != null ? context.getString(R$string.short_tv_my_list) : null);
            getViewModel().m80373c0().m14851j(this.fragment, new C19090d(new Function1() { // from class: com.transsion.shorttv.ui.widget.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShortTVFavoriteView.m80031h(this.f61499a, (ShortTVRespData) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getItemOptType() {
        return Intrinsics.m97797c(this.type, "collection") ? "collection" : "continue_watching";
    }

    private final ShortTvViewModel getViewModel() {
        return (ShortTvViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Unit m80031h(ShortTVFavoriteView shortTVFavoriteView, ShortTVRespData shortTVRespData) {
        String nextPage;
        if (shortTVRespData == null) {
            return Unit.f75682a;
        }
        Pager pager = shortTVRespData.getPager();
        if (pager == null || (nextPage = pager.getNextPage()) == null) {
            nextPage = "0";
        }
        shortTVFavoriteView.nextPage = nextPage;
        shortTVFavoriteView.m80033j(shortTVRespData.getItems());
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: i */
    private final void m80032i(Subject subject) {
        Context context = getContext();
        if (context != null) {
            if (Intrinsics.m97797c(getItemOptType(), "collection")) {
                C27644a.f84793a.m107539a((FragmentActivity) context, "minitv_explore", subject.getOps(), (64 & 8) != 0 ? null : "download_subject", (64 & 16) != 0 ? false : false, (64 & 32) != 0 ? null : subject, (64 & 64) != 0 ? null : null, (64 & 128) != 0 ? Boolean.FALSE : null);
                return;
            }
            String subjectId = subject.getSubjectId();
            if (subjectId != null) {
                ShortTvListActivity.INSTANCE.m79517a(context, subjectId, (28 & 4) != 0 ? null : null, (28 & 8) != 0 ? 0L : 0L, (28 & 16) != 0 ? false : false, (28 & 32) != 0 ? null : subject.getOps());
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m80033j(List list) {
        ShortTVHeaderViewAdapter shortTVHeaderViewAdapter;
        C26866a.a.m104898f(C26866a.f81698a, "ShortTVCollectionView", "updateList, type:" + this.type + "，size:" + (list != null ? Integer.valueOf(list.size()) : null), false, 4, null);
        List list2 = list;
        if (list2 == null || list2.isEmpty() || (shortTVHeaderViewAdapter = this.headerAdapter) == null) {
            return;
        }
        shortTVHeaderViewAdapter.mo36201n1(list2);
    }

    public final void clearExposureCache() {
        C22776b c22776b = this.exposureHelper;
        if (c22776b != null) {
            c22776b.m90702e();
        }
    }
}
