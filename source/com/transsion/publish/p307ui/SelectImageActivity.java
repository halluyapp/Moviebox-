package com.transsion.publish.p307ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.result.AbstractC0249b;
import androidx.activity.result.AbstractC0253f;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0248a;
import androidx.p1004lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.PermissionUtils;
import com.cloud.tmc.integration.event.EventConstants;
import com.cloud.tmc.integration.utils.share.config.ShareConstant;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.publish.C17602n;
import com.transsion.publish.R$id;
import com.transsion.publish.R$string;
import com.transsion.publish.adapter.C17555e0;
import com.transsion.publish.api.PhotoEntity;
import com.transsion.publish.bean.BigImageBean;
import com.transsion.publish.bean.PreviewMediaConfirmEvent;
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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp.C24454d;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.C25220y0;
import ng.AbstractC26006c;
import org.mvel2.ast.ASTNode;
import p393f.C23276b;
import p393f.C23279e;
import p393f.C23281g;
import p393f.C23284j;
import p465hp.C23889b;
import p493ip.C24200a;
import p550kj.C24655b;
import p583lp.C25668b;
import p655op.C26379f;
import p655op.C26380g;
import pg.C26866a;
import tz.AbstractC27875a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u001d\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u001f\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0004J\u0019\u0010\u0018\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J/\u0010\u001f\u001a\u00020\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010\u0004J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0012H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010(J\u000f\u0010*\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010(J\u0019\u0010-\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010+H\u0014¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0005H\u0014¢\u0006\u0004\b1\u0010\u0004J)\u00104\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010M\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010JR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001e\u0010T\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010X\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010\\\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010_\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010^R\u001e\u0010f\u001a\n\u0012\u0004\u0012\u00020c\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u001e\u0010h\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010eR\u001e\u0010j\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010eR\u0016\u0010m\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006o"}, m97100d2 = {"Lcom/transsion/publish/ui/SelectImageActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Ljp/d;", "<init>", "()V", "", "initData", "N0", "", "Landroid/net/Uri;", "data", "K0", "(Ljava/util/List;)V", "L0", "initView", "J0", "", "uri", "", EventConstants.KEY_SOURCE, "M0", "(Ljava/lang/String;I)V", "A0", "Landroid/content/Intent;", "x0", "(Landroid/content/Intent;)V", "H0", "", "Lcom/transsion/publish/api/PhotoEntity;", "photos", "selectList", "v0", "(Ljava/util/List;Ljava/util/List;)V", "showLoading", "z0", "size", "w0", "(I)V", "", "isTranslucent", "()Z", "isStatusDark", "isChangeStatusBar", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "y0", "()Ljp/d;", "onDestroy", "requestCode", "resultCode", "onActivityResult", "(IILandroid/content/Intent;)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "a", "Ljava/lang/String;", "tag", "Landroidx/recyclerview/widget/RecyclerView;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroidx/recyclerview/widget/RecyclerView;", "videoRecycler", "Lcom/transsion/publish/adapter/e0;", "c", "Lcom/transsion/publish/adapter/e0;", "videoAdapter", "Llp/b;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Llp/b;", "selectPhotoManager", "Landroid/widget/LinearLayout;", "e", "Landroid/widget/LinearLayout;", "noContentView", "f", "lockView", "Landroid/widget/ProgressBar;", "g", "Landroid/widget/ProgressBar;", "selectVideoLoading", "h", "Ljava/util/List;", "selectImages", "Lio/reactivex/rxjava3/disposables/c;", "i", "Lio/reactivex/rxjava3/disposables/c;", "disposable", "", "j", "J", "showDuration", CampaignEx.JSON_KEY_AD_K, "I", "keyType", "l", "maxLimit", "Landroidx/activity/result/b;", "Landroidx/activity/result/e;", "m", "Landroidx/activity/result/b;", "imageSelectLauncher", "n", "singleSelectLauncher", "o", "clipLauncher", TtmlNode.TAG_P, "Z", "underOS33", CampaignEx.JSON_KEY_AD_Q, "Publish_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SelectImageActivity extends BaseActivity<C24454d> {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private RecyclerView videoRecycler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C17555e0 videoAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C25668b selectPhotoManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private LinearLayout noContentView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private LinearLayout lockView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private ProgressBar selectVideoLoading;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private List selectImages;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private InterfaceC24104c disposable;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private long showDuration;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int keyType;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private AbstractC0249b imageSelectLauncher;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private AbstractC0249b singleSelectLauncher;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private AbstractC0249b clipLauncher;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean underOS33;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String tag = "ImageSelect";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int maxLimit = 1;

    /* JADX INFO: renamed from: com.transsion.publish.ui.SelectImageActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m75501a(Context context, int i11, int i12, List list) {
            Intrinsics.m97802h(context, "context");
            Intent intent = new Intent(context, (Class<?>) SelectImageActivity.class);
            intent.setFlags(ASTNode.DEOP);
            intent.putExtra("key_type", i11);
            if (list != null) {
                intent.putExtra("key_list", (Serializable) list);
            }
            intent.putExtra("key_limited", i12);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.transsion.publish.ui.SelectImageActivity$b */
    public static final class C17616b implements InterfaceC24098o {
        C17616b() {
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC24098o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(List t11) {
            Intrinsics.m97802h(t11, "t");
            if (t11.isEmpty() || (t11.size() == 1 && TextUtils.isEmpty(((PhotoEntity) t11.get(0)).getLocalPath()))) {
                LinearLayout linearLayout = SelectImageActivity.this.noContentView;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
            } else {
                SelectImageActivity selectImageActivity = SelectImageActivity.this;
                List list = selectImageActivity.selectImages;
                selectImageActivity.m75496v0(t11, list != null ? CollectionsKt.m97343U0(list) : null);
                C17555e0 c17555e0 = SelectImageActivity.this.videoAdapter;
                if (c17555e0 != null) {
                    c17555e0.addData(t11);
                }
            }
            SelectImageActivity.this.m75499z0();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC24098o
        public void onComplete() {
            InterfaceC24104c interfaceC24104c = SelectImageActivity.this.disposable;
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
            SelectImageActivity.this.disposable = d11;
        }
    }

    /* JADX INFO: renamed from: com.transsion.publish.ui.SelectImageActivity$c */
    public static final class C17617c implements PermissionUtils.InterfaceC5745b {
        C17617c() {
        }

        @Override // com.blankj.utilcode.util.PermissionUtils.InterfaceC5745b
        public void onDenied() {
            LinearLayout linearLayout = SelectImageActivity.this.lockView;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            ProgressBar progressBar = SelectImageActivity.this.selectVideoLoading;
            if (progressBar != null) {
                AbstractC26006c.m102054g(progressBar);
            }
        }

        @Override // com.blankj.utilcode.util.PermissionUtils.InterfaceC5745b
        public void onGranted() {
            LinearLayout linearLayout = SelectImageActivity.this.lockView;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            SelectImageActivity.this.m75467H0();
        }
    }

    /* JADX INFO: renamed from: com.transsion.publish.ui.SelectImageActivity$initView$5 */
    @Metadata(m97101k = 3, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* synthetic */ class C176185 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        C176185(Object obj) {
            super(1, obj, SelectImageActivity.class, "checkSelectNum", "checkSelectNum(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.f75682a;
        }

        public final void invoke(int i11) {
            ((SelectImageActivity) this.receiver).m75497w0(i11);
        }
    }

    public SelectImageActivity() {
        this.underOS33 = Build.VERSION.SDK_INT < 33;
    }

    /* JADX INFO: renamed from: A0 */
    private final void m75460A0() {
        if (this.clipLauncher != null) {
            return;
        }
        this.clipLauncher = registerForActivityResult(new C23284j(), new InterfaceC0248a() { // from class: com.transsion.publish.ui.n0
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                SelectImageActivity.m75461B0(this.f58257a, (ActivityResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final void m75461B0(SelectImageActivity selectImageActivity, ActivityResult result) {
        Intrinsics.m97802h(result, "result");
        selectImageActivity.m75498x0(result.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final Unit m75462C0(SelectImageActivity selectImageActivity, PreviewMediaConfirmEvent it) {
        Intrinsics.m97802h(it, "it");
        selectImageActivity.m75469J0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final Unit m75463D0(SelectImageActivity selectImageActivity, BigImageBean it) {
        Intrinsics.m97802h(it, "it");
        Integer from = it.getFrom();
        if (from == null || from.intValue() != 3) {
            Integer from2 = it.getFrom();
            if (from2 == null || from2.intValue() != 1) {
                return Unit.f75682a;
            }
            Integer operator = it.getOperator();
            if (operator != null && operator.intValue() == 1) {
                C17555e0 c17555e0 = selectImageActivity.videoAdapter;
                if (c17555e0 != null) {
                    c17555e0.m75227n();
                }
                C17555e0 c17555e1 = selectImageActivity.videoAdapter;
                if (c17555e1 != null) {
                    c17555e1.m75232x();
                }
                C17555e0 c17555e2 = selectImageActivity.videoAdapter;
                selectImageActivity.m75496v0(c17555e2 != null ? c17555e2.m75228q() : null, it.getSelect());
                C17555e0 c17555e3 = selectImageActivity.videoAdapter;
                if (c17555e3 != null) {
                    c17555e3.notifyDataSetChanged();
                }
            }
            return Unit.f75682a;
        }
        Integer operator2 = it.getOperator();
        if (operator2 != null && operator2.intValue() == 2) {
            C17555e0 c17555e4 = selectImageActivity.videoAdapter;
            if (c17555e4 != null) {
                c17555e4.m75227n();
            }
            C17555e0 c17555e5 = selectImageActivity.videoAdapter;
            if (c17555e5 != null) {
                c17555e5.m75232x();
            }
            C17555e0 c17555e6 = selectImageActivity.videoAdapter;
            if (c17555e6 != null) {
                c17555e6.notifyDataSetChanged();
            }
            return Unit.f75682a;
        }
        C17555e0 c17555e7 = selectImageActivity.videoAdapter;
        if (c17555e7 != null) {
            c17555e7.m75227n();
        }
        C17555e0 c17555e8 = selectImageActivity.videoAdapter;
        if (c17555e8 != null) {
            c17555e8.m75232x();
        }
        C17555e0 c17555e9 = selectImageActivity.videoAdapter;
        selectImageActivity.m75496v0(c17555e9 != null ? c17555e9.m75228q() : null, it.getSelect());
        C17555e0 c17555e10 = selectImageActivity.videoAdapter;
        if (c17555e10 != null) {
            c17555e10.notifyDataSetChanged();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final void m75464E0(SelectImageActivity selectImageActivity, View view) {
        selectImageActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final Unit m75465F0(SelectImageActivity selectImageActivity, View it) {
        Intrinsics.m97802h(it, "it");
        selectImageActivity.m75469J0();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final void m75466G0(View view) {
        PermissionUtils.m27216v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public final void m75467H0() {
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        showLoading();
        this.selectPhotoManager = new C25668b(this);
        AbstractC24093j.m95062g(new InterfaceC24095l() { // from class: com.transsion.publish.ui.m0
            @Override // io.reactivex.rxjava3.core.InterfaceC24095l
            /* JADX INFO: renamed from: a */
            public final void mo75615a(InterfaceC24094k interfaceC24094k) throws Throwable {
                SelectImageActivity.m75468I0(this.f58254a, interfaceC24094k);
            }
        }).m95076b(12).m95088v(AbstractC24083b.m95041c()).m95073E(AbstractC27875a.m108402c()).subscribe(new C17616b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final void m75468I0(SelectImageActivity selectImageActivity, InterfaceC24094k emitter) throws Throwable {
        Intrinsics.m97802h(emitter, "emitter");
        C26866a.a.m104898f(C26866a.f81698a, "SelectVideoManager", "loadLocalVideo success", false, 4, null);
        C25668b c25668b = selectImageActivity.selectPhotoManager;
        if (c25668b != null) {
            c25668b.m101014a(emitter);
        }
        if (emitter.isDisposed()) {
            return;
        }
        emitter.onComplete();
    }

    /* JADX INFO: renamed from: J0 */
    private final void m75469J0() {
        C17555e0 c17555e0 = this.videoAdapter;
        List listM75229r = c17555e0 != null ? c17555e0.m75229r() : null;
        List list = listM75229r;
        if (list == null || list.isEmpty()) {
            finish();
            return;
        }
        if (this.keyType != 0) {
            String localPath = ((PhotoEntity) listM75229r.get(0)).getLocalPath();
            if (localPath != null) {
                m75472M0(localPath, this.keyType);
                return;
            }
            return;
        }
        C23889b c23889b = new C23889b();
        c23889b.m94631o(0);
        c23889b.m94630n(1);
        c23889b.m94634r(CollectionsKt.m97343U0(list));
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, c23889b, 0L);
        finish();
    }

    /* JADX INFO: renamed from: K0 */
    private final void m75470K0(List data) {
        C23889b c23889b = new C23889b();
        c23889b.m94631o(Integer.valueOf(this.keyType));
        c23889b.m94630n(1);
        c23889b.m94634r(new ArrayList());
        Iterator it = data.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            PhotoEntity photoEntity = new PhotoEntity();
            C24200a c24200aM102989b = C26380g.f80125a.m102989b(this, uri);
            if (c24200aM102989b != null) {
                photoEntity.setLocalPath(c24200aM102989b.m95224c());
                photoEntity.setImageTitle(c24200aM102989b.m95226e());
                photoEntity.setWidth(c24200aM102989b.m95227f());
                photoEntity.setHeight(c24200aM102989b.m95223b());
                photoEntity.setImageSize(c24200aM102989b.m95225d());
            }
            List listM94624h = c23889b.m94624h();
            if (listM94624h != null) {
                listM94624h.add(photoEntity);
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                getContentResolver().takePersistableUriPermission(uri, 1);
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, c23889b, 0L);
        finish();
    }

    /* JADX INFO: renamed from: L0 */
    private final void m75471L0() {
        String str;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            str = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED";
        } else {
            str = i11 >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE";
        }
        if (PermissionUtils.m27213s(str)) {
            m75467H0();
        } else {
            PermissionUtils.m27218x(str).m27220m(new C17617c()).m27221y();
        }
    }

    /* JADX INFO: renamed from: M0 */
    private final void m75472M0(String uri, int source) {
        ClippingImageActivity.INSTANCE.m75399a(this, uri, source, this.clipLauncher);
    }

    /* JADX INFO: renamed from: N0 */
    private final void m75473N0() {
        int i11 = this.maxLimit;
        if (i11 > 1) {
            AbstractC0249b abstractC0249bRegisterForActivityResult = registerForActivityResult(new C23279e(i11), new InterfaceC0248a() { // from class: com.transsion.publish.ui.p0
                @Override // androidx.activity.result.InterfaceC0248a
                /* JADX INFO: renamed from: a */
                public final void mo998a(Object obj) {
                    SelectImageActivity.m75474O0(this.f58264a, (List) obj);
                }
            });
            this.imageSelectLauncher = abstractC0249bRegisterForActivityResult;
            if (abstractC0249bRegisterForActivityResult != null) {
                abstractC0249bRegisterForActivityResult.m999a(AbstractC0253f.m1018b(C23281g.d.f70832a, 0, false, null, 14, null));
                return;
            }
            return;
        }
        AbstractC0249b abstractC0249bRegisterForActivityResult2 = registerForActivityResult(new C23276b(), new InterfaceC0248a() { // from class: com.transsion.publish.ui.q0
            @Override // androidx.activity.result.InterfaceC0248a
            /* JADX INFO: renamed from: a */
            public final void mo998a(Object obj) {
                SelectImageActivity.m75475P0(this.f58268a, (Uri) obj);
            }
        });
        this.singleSelectLauncher = abstractC0249bRegisterForActivityResult2;
        if (abstractC0249bRegisterForActivityResult2 != null) {
            abstractC0249bRegisterForActivityResult2.m999a(ShareConstant.SHARE_TYPE_IMAGE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final void m75474O0(SelectImageActivity selectImageActivity, List data) {
        Intrinsics.m97802h(data, "data");
        C26866a.a.m104898f(C26866a.f81698a, selectImageActivity.tag, "imageSelect keyType:" + selectImageActivity.keyType + ", data：" + data, false, 4, null);
        selectImageActivity.m75470K0(data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final void m75475P0(SelectImageActivity selectImageActivity, Uri uri) {
        String strM95224c;
        C26866a.a.m104898f(C26866a.f81698a, selectImageActivity.tag, "singleSelect keyType:" + selectImageActivity.keyType + ", uri：" + uri, false, 4, null);
        if (uri == null) {
            selectImageActivity.finish();
            return;
        }
        if (selectImageActivity.keyType == 0) {
            selectImageActivity.m75470K0(CollectionsKt.m97499e(uri));
            return;
        }
        C24200a c24200aM102989b = C26380g.f80125a.m102989b(selectImageActivity, uri);
        if (c24200aM102989b == null || (strM95224c = c24200aM102989b.m95224c()) == null) {
            return;
        }
        selectImageActivity.m75472M0(strM95224c, selectImageActivity.keyType);
    }

    private final void initData() {
        Function1 function1 = new Function1() { // from class: com.transsion.publish.ui.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectImageActivity.m75462C0(this.f58260a, (PreviewMediaConfirmEvent) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = PreviewMediaConfirmEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        List list;
        List<PhotoEntity> list2 = this.selectImages;
        PhotoEntity photoEntity = null;
        if (list2 != null) {
            for (PhotoEntity photoEntity2 : list2) {
                if (photoEntity2.getIsAdd()) {
                    photoEntity = photoEntity2;
                }
            }
        }
        if (photoEntity != null && (list = this.selectImages) != null) {
            list.remove(photoEntity);
        }
        ((CustomHeader) findViewById(R$id.sv_title_bar)).setOnBackClick(new View.OnClickListener() { // from class: com.transsion.publish.ui.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectImageActivity.m75464E0(this.f58244a, view);
            }
        });
        List list3 = this.selectImages;
        m75497w0(list3 != null ? list3.size() : 0);
        TextView confirmTV = ((C24454d) getMViewBinding()).f74533b;
        Intrinsics.m97801g(confirmTV, "confirmTV");
        AbstractC26006c.m102050c(confirmTV, 0L, new Function1() { // from class: com.transsion.publish.ui.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectImageActivity.m75465F0(this.f58245a, (View) obj);
            }
        }, 1, null);
        this.selectVideoLoading = (ProgressBar) findViewById(R$id.select_video_loading);
        this.noContentView = (LinearLayout) findViewById(R$id.sv_no_content_view);
        this.lockView = (LinearLayout) findViewById(R$id.sv_lock_view);
        TextView textView = (TextView) findViewById(R$id.sv_tv_grant);
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.ui.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SelectImageActivity.m75466G0(view);
                }
            });
        }
        this.videoRecycler = (RecyclerView) findViewById(R$id.select_video_recycler);
        C17555e0 c17555e0 = new C17555e0(new C176185(this));
        this.videoAdapter = c17555e0;
        c17555e0.m75233y(this.keyType, this);
        C17555e0 c17555e1 = this.videoAdapter;
        if (c17555e1 != null) {
            c17555e1.m75234z(this.maxLimit);
        }
        RecyclerView recyclerView = this.videoRecycler;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new NpaGridLayoutManager((Context) this, 4, 1, false));
        }
        RecyclerView recyclerView2 = this.videoRecycler;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new C26379f(AbstractC5776a0.m27313a(2.0f)));
        }
        RecyclerView recyclerView3 = this.videoRecycler;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.videoAdapter);
        }
        Function1 function1 = new Function1() { // from class: com.transsion.publish.ui.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectImageActivity.m75463D0(this.f58250a, (BigImageBean) obj);
            }
        };
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = BigImageBean.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.observeEvent(this, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
    }

    private final void showLoading() {
        ProgressBar progressBar = this.selectVideoLoading;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        ProgressBar progressBar2 = this.selectVideoLoading;
        if (progressBar2 != null) {
            AbstractC26006c.m102058k(progressBar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public final void m75496v0(List photos, List selectList) {
        List list;
        if ((selectList != null && selectList.isEmpty()) || (list = photos) == null || list.isEmpty() || selectList == null) {
            return;
        }
        int i11 = 0;
        for (Object obj : selectList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            PhotoEntity photoEntity = (PhotoEntity) obj;
            if (photos != null) {
                Iterator it = photos.iterator();
                while (it.hasNext()) {
                    PhotoEntity photoEntity2 = (PhotoEntity) it.next();
                    if (Intrinsics.m97797c(photoEntity2 != null ? photoEntity2.getLocalPath() : null, photoEntity.getLocalPath())) {
                        photoEntity2.setEnableSelect(true);
                        C17555e0 c17555e0 = this.videoAdapter;
                        if (c17555e0 != null) {
                            c17555e0.m75226A(photoEntity);
                        }
                    }
                }
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w0 */
    public final void m75497w0(int size) {
        TextView selectNumTV = ((C24454d) getMViewBinding()).f74534c;
        Intrinsics.m97801g(selectNumTV, "selectNumTV");
        selectNumTV.setVisibility(size > 0 ? 0 : 8);
        ((C24454d) getMViewBinding()).f74534c.setText(getString(R$string.image_select_num_tips, Integer.valueOf(size), Integer.valueOf(this.maxLimit)));
    }

    /* JADX INFO: renamed from: x0 */
    private final void m75498x0(Intent data) {
        Bundle extras;
        Bundle extras2;
        if (data != null && (extras2 = data.getExtras()) != null && !extras2.containsKey("clip_result")) {
            finish();
            return;
        }
        Serializable serializable = (data == null || (extras = data.getExtras()) == null) ? null : extras.getSerializable("clip_result");
        if (serializable == null) {
            C26866a.a.m104898f(C26866a.f81698a, "clip_result", "null...", false, 4, null);
            finish();
            return;
        }
        if (serializable instanceof PhotoEntity) {
            C26866a.a.m104898f(C26866a.f81698a, "clip_result", "result:" + serializable, false, 4, null);
            int i11 = this.keyType;
            if (i11 == 0 || i11 == 5) {
                C23889b c23889b = new C23889b();
                c23889b.m94631o(5);
                c23889b.m94630n(1);
                c23889b.m94628l((PhotoEntity) serializable);
                FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
                String name = C23889b.class.getName();
                Intrinsics.m97801g(name, "getName(...)");
                flowEventBus.postEvent(name, c23889b, 0L);
            } else {
                Intent intent = new Intent();
                intent.putExtra("clip_result", ((PhotoEntity) serializable).getLocalPath());
                setResult(-1, intent);
            }
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public final void m75499z0() {
        ProgressBar progressBar = this.selectVideoLoading;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        ProgressBar progressBar2 = this.selectVideoLoading;
        if (progressBar2 != null) {
            AbstractC26006c.m102054g(progressBar2);
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
        return new C24655b("select_image", false, 2, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        C26866a.a.m104898f(C26866a.f81698a, this.tag, "onActivityResult keyType:" + this.keyType + ", requestCodeP:" + requestCode + ", data:" + (data != null ? data.getData() : null), false, 4, null);
        if (requestCode != 10002) {
            return;
        }
        m75498x0(data);
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.showDuration = System.currentTimeMillis();
        this.maxLimit = getIntent().getIntExtra("key_limited", 1);
        this.keyType = getIntent().getIntExtra("key_type", 0);
        if (getIntent().hasExtra("key_list")) {
            Serializable serializableExtra = getIntent().getSerializableExtra("key_list");
            Intrinsics.m97800f(serializableExtra, "null cannot be cast to non-null type kotlin.collections.MutableList<com.transsion.publish.api.PhotoEntity>");
            this.selectImages = TypeIntrinsics.m97852c(serializableExtra);
        }
        if (this.underOS33) {
            initView();
            initData();
            m75471L0();
        } else {
            m75473N0();
            View viewFindViewById = findViewById(com.transsion.baseui.R$id.llRootView);
            Intrinsics.m97801g(viewFindViewById, "findViewById(...)");
            AbstractC26006c.m102055h(viewFindViewById);
        }
        m75460A0();
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        InterfaceC24104c interfaceC24104c = this.disposable;
        if (interfaceC24104c != null) {
            interfaceC24104c.dispose();
        }
        C17602n.f58119b.m75374a().m75371d();
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public C24454d getViewBinding() {
        C24454d c24454dM95955c = C24454d.m95955c(getLayoutInflater());
        Intrinsics.m97801g(c24454dM95955c, "inflate(...)");
        return c24454dM95955c;
    }
}
