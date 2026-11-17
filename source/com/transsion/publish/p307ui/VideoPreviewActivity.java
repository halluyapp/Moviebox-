package com.transsion.publish.p307ui;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0296a;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.AbstractC5789h;
import com.blankj.utilcode.util.Utils;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$color;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.publish.R$drawable;
import com.transsion.publish.R$string;
import com.transsion.publish.api.VsMediaInfo;
import com.transsion.publish.bean.PreviewMediaConfirmEvent;
import com.transsion.publish.bean.PreviewVideoBean;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import jp.C24457g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26006c;
import org.mvel2.ast.ASTNode;
import p465hp.C23889b;
import p550kj.C24655b;
import p645og.C26223a;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\fJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\u0019\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0005H\u0014¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010(J\u000f\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010(J\u000f\u0010+\u001a\u00020\u0005H\u0014¢\u0006\u0004\b+\u0010\u0004J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00107\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00106¨\u0006>"}, m97100d2 = {"Lcom/transsion/publish/ui/VideoPreviewActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Ljp/g;", "<init>", "()V", "", "initView", "initData", "l0", "", NotificationCompat.CATEGORY_STATUS, "B0", "(Z)V", "Lcom/transsion/publish/api/VsMediaInfo;", "vsMediaInfo", "z0", "(Lcom/transsion/publish/api/VsMediaInfo;)V", "", "path", "t0", "(Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "bitmap", "A0", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "C0", "D0", "select", "k0", "n0", "o0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "m0", "()Ljp/g;", "onDestroy", "onResume", "isTranslucent", "()Z", "isStatusDark", "isChangeStatusBar", "onStop", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "a", "Lcom/transsion/publish/api/VsMediaInfo;", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/Integer;", "sourceType", "c", "I", "maxSize", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Z", "isBack", "e", "maxLimit", "f", "Publish_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public class VideoPreviewActivity extends BaseActivity<C24457g> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private VsMediaInfo vsMediaInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isBack;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Integer sourceType = 0;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int maxSize = 1048576000;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int maxLimit = 1;

    /* JADX INFO: renamed from: com.transsion.publish.ui.VideoPreviewActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m75614a(Context context, VsMediaInfo data, int i11) {
            Intrinsics.m97802h(context, "context");
            Intrinsics.m97802h(data, "data");
            Intent intent = new Intent(context, (Class<?>) VideoPreviewActivity.class);
            intent.setFlags(ASTNode.DEOP);
            intent.putExtra("data", data);
            intent.putExtra("sourceType", i11);
            context.startActivity(intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A0 */
    private final Bitmap m75585A0(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        ImageView coverIV = ((C24457g) getMViewBinding()).f74558h;
        Intrinsics.m97801g(coverIV, "coverIV");
        return (height <= 0 || width <= 0 || width > coverIV.getWidth() || height > coverIV.getHeight()) ? bitmap : C26223a.m102674d(bitmap, coverIV.getWidth(), coverIV.getHeight(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B0 */
    private final void m75586B0(boolean status) {
        if (status) {
            ((C24457g) getMViewBinding()).f74565o.setText("1");
            ((C24457g) getMViewBinding()).f74565o.setBackgroundResource(R$drawable.bg_linear_r16);
        } else {
            ((C24457g) getMViewBinding()).f74565o.setBackgroundResource(R$drawable.ic_select_number_bro);
        }
        m75598k0(status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C0 */
    private final void m75587C0() {
        ((C24457g) getMViewBinding()).f74567q.pause();
        ImageView playIV = ((C24457g) getMViewBinding()).f74561k;
        Intrinsics.m97801g(playIV, "playIV");
        AbstractC26006c.m102058k(playIV);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D0 */
    private final void m75588D0() {
        ((C24457g) getMViewBinding()).f74567q.start();
        ImageView playIV = ((C24457g) getMViewBinding()).f74561k;
        Intrinsics.m97801g(playIV, "playIV");
        AbstractC26006c.m102054g(playIV);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        this.sourceType = Integer.valueOf(getIntent().getIntExtra("sourceType", 2));
        if (getIntent().hasExtra("data")) {
            ProgressBar clipLoading = ((C24457g) getMViewBinding()).f74556f;
            Intrinsics.m97801g(clipLoading, "clipLoading");
            AbstractC26006c.m102058k(clipLoading);
            Serializable serializableExtra = getIntent().getSerializableExtra("data");
            Intrinsics.m97800f(serializableExtra, "null cannot be cast to non-null type com.transsion.publish.api.VsMediaInfo");
            VsMediaInfo vsMediaInfo = (VsMediaInfo) serializableExtra;
            this.vsMediaInfo = vsMediaInfo;
            Intrinsics.m97799e(vsMediaInfo);
            m75612z0(vsMediaInfo);
        }
        Integer num = this.sourceType;
        if (num != null && num.intValue() == 1) {
            ((C24457g) getMViewBinding()).f74560j.setVisibility(8);
            ((C24457g) getMViewBinding()).f74559i.setVisibility(0);
            FrameLayout flClear = ((C24457g) getMViewBinding()).f74559i;
            Intrinsics.m97801g(flClear, "flClear");
            AbstractC26006c.m102050c(flClear, 0L, new Function1() { // from class: com.transsion.publish.ui.k1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return VideoPreviewActivity.m75603q0(this.f58248a, (View) obj);
                }
            }, 1, null);
        } else if (num != null && num.intValue() == 2) {
            ((C24457g) getMViewBinding()).f74559i.setVisibility(8);
            ((C24457g) getMViewBinding()).f74560j.setVisibility(0);
            VsMediaInfo vsMediaInfo2 = this.vsMediaInfo;
            if (vsMediaInfo2 != null) {
                m75586B0(vsMediaInfo2.getEnableSelect());
            }
            Group bottomGroup = ((C24457g) getMViewBinding()).f74552b;
            Intrinsics.m97801g(bottomGroup, "bottomGroup");
            AbstractC26006c.m102058k(bottomGroup);
            LinearLayout llSelect = ((C24457g) getMViewBinding()).f74560j;
            Intrinsics.m97801g(llSelect, "llSelect");
            AbstractC26006c.m102050c(llSelect, 0L, new Function1() { // from class: com.transsion.publish.ui.l1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return VideoPreviewActivity.m75604r0(this.f58251a, (View) obj);
                }
            }, 1, null);
        }
        ProgressBar clipLoading2 = ((C24457g) getMViewBinding()).f74556f;
        Intrinsics.m97801g(clipLoading2, "clipLoading");
        AbstractC26006c.m102054g(clipLoading2);
        ((C24457g) getMViewBinding()).f74567q.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.ui.m1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPreviewActivity.m75605s0(this.f58255a, view);
            }
        });
        ((C24457g) getMViewBinding()).f74562l.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.ui.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPreviewActivity.m75602p0(this.f58258a, view);
            }
        });
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((C24457g) getMViewBinding()).f74554d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.ui.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPreviewActivity.m75608v0(this.f58265a, view);
            }
        });
        ((C24457g) getMViewBinding()).f74567q.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.transsion.publish.ui.q1
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                VideoPreviewActivity.m75609w0(this.f58269a, mediaPlayer);
            }
        });
        TextView confirmTV = ((C24457g) getMViewBinding()).f74557g;
        Intrinsics.m97801g(confirmTV, "confirmTV");
        AbstractC26006c.m102050c(confirmTV, 0L, new Function1() { // from class: com.transsion.publish.ui.r1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoPreviewActivity.m75611y0(this.f58271a, (View) obj);
            }
        }, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    private final void m75598k0(boolean select) {
        TextView selectNumTV = ((C24457g) getMViewBinding()).f74563m;
        Intrinsics.m97801g(selectNumTV, "selectNumTV");
        selectNumTV.setVisibility((select > 0) != false ? 0 : 8);
        ((C24457g) getMViewBinding()).f74563m.setText(getString(R$string.video_select_num_tips, Integer.valueOf(select ? 1 : 0), Integer.valueOf(this.maxLimit)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    private final void m75599l0() {
        if (((C24457g) getMViewBinding()).f74567q.isPlaying()) {
            m75587C0();
        } else {
            m75588D0();
        }
    }

    /* JADX INFO: renamed from: n0 */
    private final void m75600n0() {
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        if (getSupportActionBar() != null) {
            AbstractC0296a supportActionBar = getSupportActionBar();
            Intrinsics.m97799e(supportActionBar);
            supportActionBar.mo1199l();
        }
        if (getActionBar() != null) {
            ActionBar actionBar = getActionBar();
            Intrinsics.m97799e(actionBar);
            actionBar.hide();
        }
    }

    /* JADX INFO: renamed from: o0 */
    private final void m75601o0() {
        View decorView = getWindow().getDecorView();
        Intrinsics.m97801g(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(4102);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final void m75602p0(VideoPreviewActivity videoPreviewActivity, View view) {
        videoPreviewActivity.m75599l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final Unit m75603q0(VideoPreviewActivity videoPreviewActivity, View it) {
        Intrinsics.m97802h(it, "it");
        C23889b c23889b = new C23889b();
        c23889b.m94631o(1);
        c23889b.m94630n(2);
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23889b.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, c23889b, 0L);
        videoPreviewActivity.finish();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final Unit m75604r0(VideoPreviewActivity videoPreviewActivity, View it) {
        Intrinsics.m97802h(it, "it");
        VsMediaInfo vsMediaInfo = videoPreviewActivity.vsMediaInfo;
        if (vsMediaInfo != null) {
            if (vsMediaInfo.getVideoSize() > videoPreviewActivity.maxSize) {
                C28951b.f88586a.m111455e(Utils.m27275a().getResources().getString(R$string.add_media_max_size_tips, 50));
                return Unit.f75682a;
            }
            vsMediaInfo.setEnableSelect(!vsMediaInfo.getEnableSelect());
            PreviewVideoBean previewVideoBean = new PreviewVideoBean();
            previewVideoBean.setFrom(videoPreviewActivity.sourceType);
            previewVideoBean.setSelect(vsMediaInfo);
            if (vsMediaInfo.getEnableSelect()) {
                previewVideoBean.setOperator(1);
            } else {
                previewVideoBean.setOperator(3);
            }
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = PreviewVideoBean.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.postEvent(name, previewVideoBean, 0L);
            videoPreviewActivity.m75586B0(vsMediaInfo.getEnableSelect());
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m75605s0(VideoPreviewActivity videoPreviewActivity, View view) {
        videoPreviewActivity.m75599l0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    private final void m75606t0(String path) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(path);
        final Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(0L, 2);
        ((C24457g) getMViewBinding()).getRoot().post(new Runnable() { // from class: com.transsion.publish.ui.o1
            @Override // java.lang.Runnable
            public final void run() {
                VideoPreviewActivity.m75607u0(this.f58261a, frameAtTime);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public static final void m75607u0(VideoPreviewActivity videoPreviewActivity, Bitmap bitmap) {
        ((C24457g) videoPreviewActivity.getMViewBinding()).f74558h.setImageBitmap(videoPreviewActivity.m75585A0(bitmap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m75608v0(VideoPreviewActivity videoPreviewActivity, View view) {
        videoPreviewActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m75609w0(final VideoPreviewActivity videoPreviewActivity, MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.transsion.publish.ui.s1
                @Override // android.media.MediaPlayer.OnInfoListener
                public final boolean onInfo(MediaPlayer mediaPlayer2, int i11, int i12) {
                    return VideoPreviewActivity.m75610x0(this.f58273a, mediaPlayer2, i11, i12);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x0 */
    public static final boolean m75610x0(VideoPreviewActivity videoPreviewActivity, MediaPlayer mediaPlayer, int i11, int i12) {
        if (i11 == 3) {
            ImageView coverIV = ((C24457g) videoPreviewActivity.getMViewBinding()).f74558h;
            Intrinsics.m97801g(coverIV, "coverIV");
            AbstractC26006c.m102054g(coverIV);
        }
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
        ((C24457g) videoPreviewActivity.getMViewBinding()).f74567q.setBackgroundColor(AbstractC5789h.m27406a(R$color.transparent));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final Unit m75611y0(VideoPreviewActivity videoPreviewActivity, View it) {
        Intrinsics.m97802h(it, "it");
        PreviewMediaConfirmEvent previewMediaConfirmEvent = new PreviewMediaConfirmEvent(1);
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = PreviewMediaConfirmEvent.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, previewMediaConfirmEvent, 0L);
        videoPreviewActivity.finish();
        return Unit.f75682a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    private final void m75612z0(VsMediaInfo vsMediaInfo) {
        try {
            String videoPath = vsMediaInfo.getVideoPath();
            m75606t0(videoPath);
            ((C24457g) getMViewBinding()).f74567q.setVideoPath(videoPath);
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message != null) {
                C26866a.a.m104899g(C26866a.f81698a, message, false, 2, null);
            }
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

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C24457g getViewBinding() {
        C24457g c24457gM95967c = C24457g.m95967c(getLayoutInflater());
        Intrinsics.m97801g(c24457gM95967c, "inflate(...)");
        return c24457gM95967c;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public C24655b newLogViewConfig() {
        return new C24655b("video_preview", false, 2, null);
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        m75600n0();
        m75601o0();
        super.onCreate(savedInstanceState);
        initView();
        initData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ProgressBar clipLoading = ((C24457g) getMViewBinding()).f74556f;
        Intrinsics.m97801g(clipLoading, "clipLoading");
        AbstractC26006c.m102054g(clipLoading);
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseMusicFloatActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.isBack) {
            this.isBack = false;
            VsMediaInfo vsMediaInfo = this.vsMediaInfo;
            Intrinsics.m97799e(vsMediaInfo);
            m75612z0(vsMediaInfo);
        }
    }

    @Override // com.transsion.baseui.activity.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        this.isBack = true;
        m75587C0();
    }
}
