package com.transsion.publish.p307ui;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.PermissionUtils;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.publish.R$id;
import com.transsion.publish.adapter.C17549b0;
import com.transsion.publish.adapter.InterfaceC17584x;
import com.transsion.publish.api.AudioEntity;
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
import jp.C24456f;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.mvel2.ast.ASTNode;
import p465hp.C23889b;
import p550kj.C24655b;
import p583lp.C25667a;
import p655op.C26377d;
import pg.C26866a;
import tz.AbstractC27875a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0018\u0010\u0004J)\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010?¨\u0006H"}, m97100d2 = {"Lcom/transsion/publish/ui/SelectMusicActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Ljp/f;", "<init>", "()V", "", "z0", "initView", "y0", "w0", "showLoading", "s0", "", "isTranslucent", "()Z", "isStatusDark", "isChangeStatusBar", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "r0", "()Ljp/f;", "onPause", "onDestroy", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "Landroidx/recyclerview/widget/RecyclerView;", "a", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Lcom/transsion/publish/adapter/b0;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/publish/adapter/b0;", "musicAdapter", "Llp/a;", "c", "Llp/a;", "selectMusicManager", "Landroid/widget/LinearLayout;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroid/widget/LinearLayout;", "noContentView", "e", "lockView", "Landroid/widget/ProgressBar;", "f", "Landroid/widget/ProgressBar;", "selectVideoLoading", "Lop/d;", "g", "Lop/d;", "mediaPlayerHelper", "", "h", "Ljava/lang/String;", "MUSIC_PERMISSIONS", "Lio/reactivex/rxjava3/disposables/c;", "i", "Lio/reactivex/rxjava3/disposables/c;", "disposable", "j", "playPath", CampaignEx.JSON_KEY_AD_K, "Publish_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SelectMusicActivity extends BaseActivity<C24456f> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private RecyclerView recycler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C17549b0 musicAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C25667a selectMusicManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private LinearLayout noContentView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private LinearLayout lockView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private ProgressBar selectVideoLoading;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C26377d mediaPlayerHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String MUSIC_PERMISSIONS;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private InterfaceC24104c disposable;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String playPath;

    /* JADX INFO: renamed from: com.transsion.publish.ui.SelectMusicActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m75554a(Context context) {
            Intrinsics.m97802h(context, "context");
            Intent intent = new Intent(context, (Class<?>) SelectMusicActivity.class);
            intent.setFlags(ASTNode.DEOP);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.transsion.publish.ui.SelectMusicActivity$b */
    public static final class C17622b implements InterfaceC17584x {
        C17622b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final void m75556c(SelectMusicActivity selectMusicActivity, AudioEntity audioEntity, MediaPlayer mediaPlayer) {
            int i11;
            List listM75197h;
            C17549b0 c17549b0 = selectMusicActivity.musicAdapter;
            if (c17549b0 == null || (listM75197h = c17549b0.m75197h()) == null) {
                i11 = -1;
            } else {
                int i12 = 0;
                i11 = -1;
                for (Object obj : listM75197h) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        CollectionsKt.m97515u();
                    }
                    if (Intrinsics.m97797c(audioEntity, (AudioEntity) obj)) {
                        i11 = i12;
                    }
                    i12 = i13;
                }
            }
            if (i11 != -1) {
                audioEntity.setPlay(false);
                C17549b0 c17549b1 = selectMusicActivity.musicAdapter;
                if (c17549b1 != null) {
                    c17549b1.notifyItemChanged(i11);
                }
            }
        }

        @Override // com.transsion.publish.adapter.InterfaceC17584x
        /* JADX INFO: renamed from: a */
        public void mo75342a(final AudioEntity info) {
            Context context;
            C26377d c26377d;
            C26377d c26377d2;
            Intrinsics.m97802h(info, "info");
            try {
                if (SelectMusicActivity.this.mediaPlayerHelper == null) {
                    SelectMusicActivity.this.mediaPlayerHelper = new C26377d();
                }
                if (Intrinsics.m97797c(SelectMusicActivity.this.playPath, info.getLocalPath()) && (c26377d2 = SelectMusicActivity.this.mediaPlayerHelper) != null && c26377d2.m102983b()) {
                    C26377d c26377d3 = SelectMusicActivity.this.mediaPlayerHelper;
                    if (c26377d3 != null) {
                        c26377d3.m102984c();
                        return;
                    }
                    return;
                }
                String localPath = info.getLocalPath();
                if (localPath != null) {
                    final SelectMusicActivity selectMusicActivity = SelectMusicActivity.this;
                    RecyclerView recyclerView = selectMusicActivity.recycler;
                    if (recyclerView != null && (context = recyclerView.getContext()) != null && (c26377d = selectMusicActivity.mediaPlayerHelper) != null) {
                        c26377d.m102985d(context, localPath, false, new MediaPlayer.OnCompletionListener() { // from class: com.transsion.publish.ui.d1
                            @Override // android.media.MediaPlayer.OnCompletionListener
                            public final void onCompletion(MediaPlayer mediaPlayer) {
                                SelectMusicActivity.C17622b.m75556c(selectMusicActivity, info, mediaPlayer);
                            }
                        });
                    }
                }
                SelectMusicActivity.this.playPath = info.getLocalPath();
            } catch (Exception e11) {
                String message = e11.getMessage();
                if (message != null) {
                    C26866a.a.m104898f(C26866a.f81698a, "audioTAG", message, false, 4, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.publish.ui.SelectMusicActivity$c */
    public static final class C17623c implements InterfaceC24098o {
        C17623c() {
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC24098o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(List t11) {
            Intrinsics.m97802h(t11, "t");
            if (t11.isEmpty() || (t11.size() == 1 && TextUtils.isEmpty(((AudioEntity) t11.get(0)).getLocalPath()))) {
                LinearLayout linearLayout = SelectMusicActivity.this.noContentView;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
            } else {
                C17549b0 c17549b0 = SelectMusicActivity.this.musicAdapter;
                if (c17549b0 != null) {
                    c17549b0.addData(t11);
                }
            }
            SelectMusicActivity.this.m75545s0();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC24098o
        public void onComplete() {
            InterfaceC24104c interfaceC24104c = SelectMusicActivity.this.disposable;
            if (interfaceC24104c != null) {
                interfaceC24104c.dispose();
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
            SelectMusicActivity.this.disposable = d11;
        }
    }

    /* JADX INFO: renamed from: com.transsion.publish.ui.SelectMusicActivity$d */
    public static final class C17624d implements PermissionUtils.InterfaceC5745b {
        C17624d() {
        }

        @Override // com.blankj.utilcode.util.PermissionUtils.InterfaceC5745b
        public void onDenied() {
            LinearLayout linearLayout = SelectMusicActivity.this.lockView;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        }

        @Override // com.blankj.utilcode.util.PermissionUtils.InterfaceC5745b
        public void onGranted() {
            LinearLayout linearLayout = SelectMusicActivity.this.lockView;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            SelectMusicActivity.this.m75549w0();
        }
    }

    public SelectMusicActivity() {
        this.MUSIC_PERMISSIONS = Build.VERSION.SDK_INT < 33 ? "android.permission.WRITE_EXTERNAL_STORAGE" : "android.permission.READ_MEDIA_AUDIO";
    }

    private final void initView() {
        CustomHeader customHeader = (CustomHeader) findViewById(R$id.sv_title_bar);
        customHeader.setOnBackClick(new View.OnClickListener() { // from class: com.transsion.publish.ui.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectMusicActivity.m75546t0(this.f58286a, view);
            }
        });
        customHeader.setOnEditClick(new View.OnClickListener() { // from class: com.transsion.publish.ui.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectMusicActivity.m75547u0(this.f58223a, view);
            }
        });
        this.selectVideoLoading = (ProgressBar) findViewById(R$id.select_video_loading);
        this.noContentView = (LinearLayout) findViewById(R$id.sv_no_content_view);
        this.lockView = (LinearLayout) findViewById(R$id.sv_lock_view);
        TextView textView = (TextView) findViewById(R$id.sv_tv_grant);
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.ui.b1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SelectMusicActivity.m75548v0(view);
                }
            });
        }
        this.recycler = (RecyclerView) findViewById(R$id.select_video_recycler);
        this.musicAdapter = new C17549b0();
        RecyclerView recyclerView = this.recycler;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
        RecyclerView recyclerView2 = this.recycler;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.musicAdapter);
        }
        int iM27486b = (AbstractC5806y.m27486b() - (AbstractC5776a0.m27313a(3.0f) * 5)) / 6;
        RecyclerView recyclerView3 = this.recycler;
        if (recyclerView3 != null) {
            recyclerView3.setPadding(0, 0, 0, iM27486b);
        }
        C17549b0 c17549b0 = this.musicAdapter;
        if (c17549b0 != null) {
            c17549b0.m75204p(new C17622b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public final void m75545s0() {
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
    public static final void m75546t0(SelectMusicActivity selectMusicActivity, View view) {
        selectMusicActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m75547u0(SelectMusicActivity selectMusicActivity, View view) {
        selectMusicActivity.m75551y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m75548v0(View view) {
        PermissionUtils.m27216v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public final void m75549w0() {
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        showLoading();
        this.selectMusicManager = new C25667a(this);
        AbstractC24093j.m95062g(new InterfaceC24095l() { // from class: com.transsion.publish.ui.c1
            @Override // io.reactivex.rxjava3.core.InterfaceC24095l
            /* JADX INFO: renamed from: a */
            public final void mo75615a(InterfaceC24094k interfaceC24094k) throws Throwable {
                SelectMusicActivity.m75550x0(this.f58229a, interfaceC24094k);
            }
        }).m95076b(12).m95088v(AbstractC24083b.m95041c()).m95073E(AbstractC27875a.m108402c()).subscribe(new C17623c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m75550x0(SelectMusicActivity selectMusicActivity, InterfaceC24094k emitter) throws Throwable {
        Intrinsics.m97802h(emitter, "emitter");
        C26866a.a.m104898f(C26866a.f81698a, "SelectMusicManager", "loadLocalMusic success", false, 4, null);
        C25667a c25667a = selectMusicActivity.selectMusicManager;
        if (c25667a != null) {
            c25667a.m101013a(emitter);
        }
        if (emitter.isDisposed()) {
            return;
        }
        emitter.onComplete();
    }

    /* JADX INFO: renamed from: y0 */
    private final void m75551y0() {
        C17549b0 c17549b0 = this.musicAdapter;
        AudioEntity audioEntityM75198i = c17549b0 != null ? c17549b0.m75198i() : null;
        if (audioEntityM75198i == null) {
            finish();
            return;
        }
        C23889b c23889b = new C23889b();
        c23889b.m94631o(2);
        c23889b.m94630n(1);
        c23889b.m94627k(audioEntityM75198i);
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, c23889b, 0L);
        finish();
    }

    /* JADX INFO: renamed from: z0 */
    private final void m75552z0() {
        if (PermissionUtils.m27213s(this.MUSIC_PERMISSIONS)) {
            m75549w0();
        } else {
            PermissionUtils.m27218x(this.MUSIC_PERMISSIONS).m27220m(new C17624d()).m27221y();
        }
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
        return new C24655b("select_music", false, 2, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        m75552z0();
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        InterfaceC24104c interfaceC24104c = this.disposable;
        if (interfaceC24104c != null) {
            interfaceC24104c.dispose();
        }
        C26377d c26377d = this.mediaPlayerHelper;
        if (c26377d != null) {
            c26377d.m102986f();
        }
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        C26377d c26377d = this.mediaPlayerHelper;
        if (c26377d != null) {
            c26377d.m102984c();
        }
        C17549b0 c17549b0 = this.musicAdapter;
        if (c17549b0 != null) {
            c17549b0.m75203o();
        }
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C24456f getViewBinding() {
        C24456f c24456fM95963c = C24456f.m95963c(getLayoutInflater());
        Intrinsics.m97801g(c24456fM95963c, "inflate(...)");
        return c24456fM95963c;
    }
}
