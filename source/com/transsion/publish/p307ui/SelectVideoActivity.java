package com.transsion.publish.p307ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.PermissionUtils;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.publish.R$id;
import com.transsion.publish.R$string;
import com.transsion.publish.adapter.C17567k0;
import com.transsion.publish.api.VsMediaInfo;
import com.transsion.publish.bean.PreviewMediaConfirmEvent;
import com.transsion.publish.bean.PreviewVideoBean;
import com.transsion.publish.view.CustomHeader;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import io.reactivex.rxjava3.android.schedulers.AbstractC24083b;
import io.reactivex.rxjava3.core.AbstractC24093j;
import io.reactivex.rxjava3.core.InterfaceC24094k;
import io.reactivex.rxjava3.core.InterfaceC24095l;
import io.reactivex.rxjava3.core.InterfaceC24098o;
import io.reactivex.rxjava3.disposables.InterfaceC24104c;
import java.util.List;
import jp.C24461k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.C25220y0;
import ng.AbstractC26006c;
import p465hp.C23889b;
import p550kj.C24655b;
import p583lp.C25669c;
import p655op.C26379f;
import pg.C26866a;
import tz.AbstractC27875a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0019\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0017\u0010<\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, m97100d2 = {"Lcom/transsion/publish/ui/SelectVideoActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Ljp/k;", "<init>", "()V", "", "initData", "A0", "initView", "q0", "y0", "showLoading", "s0", "", "size", "p0", "(I)V", "", "isTranslucent", "()Z", "isStatusDark", "isChangeStatusBar", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "r0", "()Ljp/k;", "onDestroy", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Landroidx/recyclerview/widget/RecyclerView;", "a", "Landroidx/recyclerview/widget/RecyclerView;", "videoRecycler", "Lcom/transsion/publish/adapter/k0;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/publish/adapter/k0;", "videoAdapter", "Llp/c;", "c", "Llp/c;", "selectVideoManager", "Landroid/widget/LinearLayout;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroid/widget/LinearLayout;", "noContentView", "e", "lockView", "Landroid/widget/ProgressBar;", "f", "Landroid/widget/ProgressBar;", "selectVideoLoading", "g", "I", "maxLimit", "h", "getScreenWidth", "()I", "screenWidth", "Lio/reactivex/rxjava3/disposables/c;", "i", "Lio/reactivex/rxjava3/disposables/c;", "disposable", "", "j", "J", "showDuration", "Publish_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SelectVideoActivity extends BaseActivity<C24461k> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private RecyclerView videoRecycler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C17567k0 videoAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C25669c selectVideoManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private LinearLayout noContentView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private LinearLayout lockView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private ProgressBar selectVideoLoading;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int maxLimit = 1;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int screenWidth = AbstractC5806y.m27489e();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private InterfaceC24104c disposable;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private long showDuration;

    /* JADX INFO: renamed from: com.transsion.publish.ui.SelectVideoActivity$a */
    public static final class C17625a implements InterfaceC24098o {
        C17625a() {
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC24098o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(List t11) {
            Intrinsics.m97802h(t11, "t");
            if (t11.isEmpty()) {
                LinearLayout linearLayout = SelectVideoActivity.this.noContentView;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
            } else {
                C17567k0 c17567k0 = SelectVideoActivity.this.videoAdapter;
                if (c17567k0 != null) {
                    c17567k0.addData(t11);
                }
            }
            SelectVideoActivity.this.m75575s0();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC24098o
        public void onComplete() {
            LinearLayout linearLayout;
            C17567k0 c17567k0;
            InterfaceC24104c interfaceC24104c = SelectVideoActivity.this.disposable;
            if (interfaceC24104c != null) {
                interfaceC24104c.dispose();
            }
            SelectVideoActivity.this.m75575s0();
            if ((SelectVideoActivity.this.videoAdapter == null || ((c17567k0 = SelectVideoActivity.this.videoAdapter) != null && c17567k0.getItemCount() == 0)) && (linearLayout = SelectVideoActivity.this.noContentView) != null) {
                linearLayout.setVisibility(0);
            }
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC24098o
        public void onError(Throwable e11) {
            Intrinsics.m97802h(e11, "e");
            C26866a.a.m104898f(C26866a.f81698a, "SelectVideoManager", "onError e:" + e11, false, 4, null);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC24098o
        public void onSubscribe(InterfaceC24104c d11) {
            Intrinsics.m97802h(d11, "d");
            SelectVideoActivity.this.disposable = d11;
        }
    }

    /* JADX INFO: renamed from: com.transsion.publish.ui.SelectVideoActivity$b */
    public static final class C17626b implements PermissionUtils.InterfaceC5745b {
        C17626b() {
        }

        @Override // com.blankj.utilcode.util.PermissionUtils.InterfaceC5745b
        public void onDenied() {
            LinearLayout linearLayout = SelectVideoActivity.this.lockView;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        }

        @Override // com.blankj.utilcode.util.PermissionUtils.InterfaceC5745b
        public void onGranted() {
            LinearLayout linearLayout = SelectVideoActivity.this.lockView;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            SelectVideoActivity.this.m75581y0();
        }
    }

    /* JADX INFO: renamed from: com.transsion.publish.ui.SelectVideoActivity$initView$4 */
    @Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* synthetic */ class C176274 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        C176274(Object obj) {
            super(1, obj, SelectVideoActivity.class, "checkSelect", "checkSelect(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.f75682a;
        }

        public final void invoke(int i11) {
            ((SelectVideoActivity) this.receiver).m75573p0(i11);
        }
    }

    /* JADX INFO: renamed from: A0 */
    private final void m75558A0() {
        if (PermissionUtils.m27213s("android.permission.READ_EXTERNAL_STORAGE")) {
            m75581y0();
        } else {
            PermissionUtils.m27218x("android.permission.READ_EXTERNAL_STORAGE").m27220m(new C17626b()).m27221y();
        }
    }

    private final void initData() {
        Function1 function1 = new Function1() { // from class: com.transsion.publish.ui.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectVideoActivity.m75576t0(this.f58234a, (PreviewMediaConfirmEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = PreviewMediaConfirmEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((CustomHeader) findViewById(R$id.sv_title_bar)).setOnBackClick(new View.OnClickListener() { // from class: com.transsion.publish.ui.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectVideoActivity.m75577u0(this.f58240a, view);
            }
        });
        m75573p0(0);
        TextView confirmTV = ((C24461k) getMViewBinding()).f74601b;
        Intrinsics.m97801g(confirmTV, "confirmTV");
        AbstractC26006c.m102050c(confirmTV, 0L, new Function1() { // from class: com.transsion.publish.ui.h1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectVideoActivity.m75578v0(this.f58242a, (View) obj);
            }
        }, 1, null);
        this.selectVideoLoading = (ProgressBar) findViewById(R$id.select_video_loading);
        this.noContentView = (LinearLayout) findViewById(R$id.sv_no_content_view);
        this.lockView = (LinearLayout) findViewById(R$id.sv_lock_view);
        TextView textView = (TextView) findViewById(R$id.sv_tv_grant);
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.ui.i1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SelectVideoActivity.m75579w0(view);
                }
            });
        }
        this.videoRecycler = (RecyclerView) findViewById(R$id.select_video_recycler);
        this.videoAdapter = new C17567k0(new C176274(this));
        RecyclerView recyclerView = this.videoRecycler;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new GridLayoutManager((Context) this, 4, 1, false));
        }
        RecyclerView recyclerView2 = this.videoRecycler;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new C26379f(AbstractC5776a0.m27313a(2.0f)));
        }
        RecyclerView recyclerView3 = this.videoRecycler;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.videoAdapter);
        }
        Function1 function1 = new Function1() { // from class: com.transsion.publish.ui.j1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectVideoActivity.m75580x0(this.f58246a, (PreviewVideoBean) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = PreviewVideoBean.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public final void m75573p0(int size) {
        int iE = RangesKt.m97935e(size, 0);
        TextView selectNumTV = ((C24461k) getMViewBinding()).f74602c;
        Intrinsics.m97801g(selectNumTV, "selectNumTV");
        selectNumTV.setVisibility(iE > 0 ? 0 : 8);
        ((C24461k) getMViewBinding()).f74602c.setText(getString(R$string.video_select_num_tips, Integer.valueOf(iE), Integer.valueOf(this.maxLimit)));
    }

    /* JADX INFO: renamed from: q0 */
    private final void m75574q0() {
        List listM75269m;
        C17567k0 c17567k0 = this.videoAdapter;
        VsMediaInfo vsMediaInfo = (c17567k0 == null || (listM75269m = c17567k0.m75269m()) == null) ? null : (VsMediaInfo) CollectionsKt.m97361k0(listM75269m);
        if (vsMediaInfo != null) {
            C23889b c23889b = new C23889b();
            c23889b.m94631o(1);
            c23889b.m94630n(1);
            c23889b.m94637u(vsMediaInfo);
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = C23889b.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.postEvent(name, c23889b, 0L);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public final void m75575s0() {
        ProgressBar progressBar = this.selectVideoLoading;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    private final void showLoading() {
        ProgressBar progressBar = this.selectVideoLoading;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final Unit m75576t0(SelectVideoActivity selectVideoActivity, PreviewMediaConfirmEvent it) {
        Intrinsics.m97802h(it, "it");
        selectVideoActivity.m75574q0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m75577u0(SelectVideoActivity selectVideoActivity, View view) {
        selectVideoActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final Unit m75578v0(SelectVideoActivity selectVideoActivity, View it) {
        Intrinsics.m97802h(it, "it");
        selectVideoActivity.m75574q0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m75579w0(View view) {
        PermissionUtils.m27216v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final Unit m75580x0(SelectVideoActivity selectVideoActivity, PreviewVideoBean it) {
        Intrinsics.m97802h(it, "it");
        VsMediaInfo select = it.getSelect();
        if (select == null) {
            return Unit.f75682a;
        }
        C17567k0 c17567k0 = selectVideoActivity.videoAdapter;
        if (c17567k0 != null) {
            c17567k0.m75273x(select);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public final void m75581y0() {
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        showLoading();
        this.selectVideoManager = new C25669c(this);
        AbstractC24093j.m95062g(new InterfaceC24095l() { // from class: com.transsion.publish.ui.f1
            @Override // io.reactivex.rxjava3.core.InterfaceC24095l
            /* JADX INFO: renamed from: a */
            public final void mo75615a(InterfaceC24094k interfaceC24094k) throws Throwable {
                SelectVideoActivity.m75582z0(this.f58237a, interfaceC24094k);
            }
        }).m95076b(12).m95088v(AbstractC24083b.m95041c()).m95073E(AbstractC27875a.m108402c()).subscribe(new C17625a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m75582z0(SelectVideoActivity selectVideoActivity, InterfaceC24094k emitter) throws Throwable {
        Intrinsics.m97802h(emitter, "emitter");
        C26866a.a.m104898f(C26866a.f81698a, "SelectVideoManager", "loadLocalVideo success", false, 4, null);
        C25669c c25669c = selectVideoActivity.selectVideoManager;
        if (c25669c != null) {
            c25669c.m101015a(emitter);
        }
        if (emitter.isDisposed()) {
            return;
        }
        emitter.onComplete();
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isChangeStatusBar() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return true;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public C24655b newLogViewConfig() {
        return new C24655b("select_video", false, 2, null);
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.showDuration = System.currentTimeMillis();
        initView();
        initData();
        m75558A0();
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        InterfaceC24104c interfaceC24104c = this.disposable;
        if (interfaceC24104c != null) {
            interfaceC24104c.dispose();
        }
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C24461k getViewBinding() {
        C24461k c24461kM95982c = C24461k.m95982c(getLayoutInflater());
        Intrinsics.m97801g(c24461kM95982c, "inflate(...)");
        return c24461kM95982c;
    }
}
