package com.transsion.publish.p307ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.activity.result.AbstractC0249b;
import com.blankj.utilcode.util.AbstractC5795n;
import com.blankj.utilcode.util.AbstractC5806y;
import com.bumptech.glide.Glide;
import com.cloud.tmc.integration.event.EventConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.publish.api.PhotoEntity;
import com.transsion.publish.view.clip.ClipImageView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import io.reactivex.rxjava3.android.schedulers.AbstractC24083b;
import io.reactivex.rxjava3.core.AbstractC24093j;
import io.reactivex.rxjava3.core.InterfaceC24094k;
import io.reactivex.rxjava3.core.InterfaceC24095l;
import io.reactivex.rxjava3.core.InterfaceC24098o;
import io.reactivex.rxjava3.disposables.InterfaceC24104c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import jp.C24451a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p550kj.C24655b;
import p655op.AbstractC26378e;
import p655op.C26380g;
import pg.C26866a;
import tz.AbstractC27875a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001*B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010$J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010+R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u0016\u0010:\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00105R\u0016\u0010<\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00105R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00105¨\u0006D"}, m97100d2 = {"Lcom/transsion/publish/ui/ClippingImageActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Ljp/a;", "", "<init>", "()V", "", "initView", "initData", "Lcom/transsion/publish/view/clip/ClipImageView;", "clipImageView", "Ljava/io/File;", "k0", "(Lcom/transsion/publish/view/clip/ClipImageView;)Ljava/io/File;", "r0", "(Lcom/transsion/publish/view/clip/ClipImageView;)V", "imageView", "", "uri", "o0", "(Lcom/transsion/publish/view/clip/ClipImageView;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "p0", "(Landroid/content/Context;)V", "path", "q0", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "l0", "()Ljp/a;", "", "isTranslucent", "()Z", "isStatusDark", "isChangeStatusBar", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "a", "Ljava/lang/String;", "CROP_CACHE", "Lio/reactivex/rxjava3/disposables/c;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lio/reactivex/rxjava3/disposables/c;", "disposable", "c", "TAG", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "I", "width", "e", "height", "f", "cropWidth", "g", "cropHeight", "", "h", "J", "cropSize", "i", EventConstants.KEY_SOURCE, "j", "Publish_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ClippingImageActivity extends BaseActivity<C24451a> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String CROP_CACHE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private InterfaceC24104c disposable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String TAG = "ClipHandler";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int width;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int height;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int cropWidth;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int cropHeight;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long cropSize;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int source;

    /* JADX INFO: renamed from: com.transsion.publish.ui.ClippingImageActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m75398b(Companion companion, Activity activity, String str, int i11, AbstractC0249b abstractC0249b, int i12, Object obj) {
            if ((i12 & 8) != 0) {
                abstractC0249b = null;
            }
            companion.m75399a(activity, str, i11, abstractC0249b);
        }

        /* JADX INFO: renamed from: a */
        public final void m75399a(Activity context, String uri, int i11, AbstractC0249b abstractC0249b) {
            Intrinsics.m97802h(context, "context");
            Intrinsics.m97802h(uri, "uri");
            Intent intent = new Intent(context, (Class<?>) ClippingImageActivity.class);
            intent.putExtra("uri", uri);
            intent.putExtra(EventConstants.KEY_SOURCE, i11);
            if (abstractC0249b != null) {
                abstractC0249b.m999a(intent);
            } else {
                context.startActivityForResult(intent, 10002);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.publish.ui.ClippingImageActivity$b */
    public static final class C17606b implements InterfaceC24098o {
        C17606b() {
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC24098o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(File file) {
            Intrinsics.m97802h(file, "file");
            C26866a.a.m104898f(C26866a.f81698a, ClippingImageActivity.this.TAG, "onNext e:" + file.getAbsolutePath(), false, 4, null);
            Intent intent = new Intent();
            PhotoEntity photoEntity = new PhotoEntity();
            photoEntity.setWidth(ClippingImageActivity.this.cropWidth);
            photoEntity.setHeight(ClippingImageActivity.this.cropHeight);
            photoEntity.setLocalPath(file.getAbsolutePath());
            photoEntity.setImageSize(ClippingImageActivity.this.cropSize);
            intent.putExtra("clip_result", photoEntity);
            ClippingImageActivity.this.setResult(10003, intent);
            ClippingImageActivity.this.finish();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.InterfaceC24098o
        public void onComplete() {
            ProgressBar clipLoading = ((C24451a) ClippingImageActivity.this.getMViewBinding()).f74511d;
            Intrinsics.m97801g(clipLoading, "clipLoading");
            AbstractC26006c.m102054g(clipLoading);
            InterfaceC24104c interfaceC24104c = ClippingImageActivity.this.disposable;
            if (interfaceC24104c != null) {
                interfaceC24104c.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.InterfaceC24098o
        public void onError(Throwable e11) {
            Intrinsics.m97802h(e11, "e");
            ProgressBar clipLoading = ((C24451a) ClippingImageActivity.this.getMViewBinding()).f74511d;
            Intrinsics.m97801g(clipLoading, "clipLoading");
            AbstractC26006c.m102054g(clipLoading);
            C26866a.a.m104898f(C26866a.f81698a, ClippingImageActivity.this.TAG, "onError e:" + e11, false, 4, null);
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC24098o
        public void onSubscribe(InterfaceC24104c d11) {
            Intrinsics.m97802h(d11, "d");
            ClippingImageActivity.this.disposable = d11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        this.source = getIntent().getIntExtra(EventConstants.KEY_SOURCE, 0);
        String stringExtra = getIntent().getStringExtra("uri");
        ((C24451a) getMViewBinding()).f74512e.setStart(0);
        if (stringExtra != null) {
            ClipImageView srcPic = ((C24451a) getMViewBinding()).f74513f;
            Intrinsics.m97801g(srcPic, "srcPic");
            m75392o0(srcPic, stringExtra);
        }
        ((C24451a) getMViewBinding()).f74509b.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.ui.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClippingImageActivity.m75390m0(this.f58221a, view);
            }
        });
        ((C24451a) getMViewBinding()).f74514g.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.publish.ui.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClippingImageActivity.m75391n0(this.f58224a, view);
            }
        });
        int i11 = this.source;
        if (i11 == 0 || 5 == i11) {
            this.width = AbstractC5806y.m27486b() - 2;
            this.height = C26380g.f80125a.m102988a(this, 202.0f);
            ((C24451a) getMViewBinding()).f74512e.setSizeNeedChange(false);
            ((C24451a) getMViewBinding()).f74512e.setStartWH(this.width, this.height);
            ((C24451a) getMViewBinding()).f74512e.setSizeNeedChange(false);
            ((C24451a) getMViewBinding()).f74513f.setCropWH(this.width, this.height);
        } else {
            ((C24451a) getMViewBinding()).f74512e.setStart(1);
        }
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
    }

    private final void initView() {
        m75393p0(this);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    private final File m75389k0(ClipImageView clipImageView) throws Throwable {
        FileOutputStream fileOutputStream;
        Bitmap bitmapClip;
        FileOutputStream fileOutputStream2 = null;
        try {
            int i11 = this.source;
            if (i11 == 0 || 5 == i11) {
                Rect rect = ((C24451a) getMViewBinding()).f74512e.rect();
                Intrinsics.m97801g(rect, "rect(...)");
                bitmapClip = ((C24451a) getMViewBinding()).f74513f.clip(rect);
            } else {
                bitmapClip = ((C24451a) getMViewBinding()).f74513f.clip();
            }
            File file = new File(this.CROP_CACHE);
            String str = System.currentTimeMillis() + "temp_crop.png";
            if (!file.exists() && !file.mkdirs()) {
                C26866a.a.m104898f(C26866a.f81698a, this.TAG, "cropImage, mkdirs failed, file is " + file.getAbsolutePath(), false, 4, null);
            }
            File file2 = new File(file, str);
            fileOutputStream = new FileOutputStream(file2);
            if (bitmapClip != null) {
                try {
                    try {
                        bitmapClip.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    } catch (IOException e11) {
                        e = e11;
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.flush();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException e13) {
                                e13.printStackTrace();
                            }
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.flush();
                        } catch (IOException e14) {
                            e14.printStackTrace();
                        }
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e15) {
                            e15.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
            Integer numValueOf = bitmapClip != null ? Integer.valueOf(bitmapClip.getWidth()) : null;
            Intrinsics.m97799e(numValueOf);
            this.cropWidth = numValueOf.intValue();
            Integer numValueOf2 = bitmapClip != null ? Integer.valueOf(bitmapClip.getHeight()) : null;
            Intrinsics.m97799e(numValueOf2);
            int iIntValue = numValueOf2.intValue();
            this.cropHeight = iIntValue;
            this.cropSize = this.cropWidth * iIntValue;
            try {
                fileOutputStream.flush();
            } catch (IOException e16) {
                e16.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e17) {
                e17.printStackTrace();
            }
            return file2;
        } catch (IOException e18) {
            e = e18;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (fileOutputStream2 != null) {
                fileOutputStream2.flush();
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final void m75390m0(ClippingImageActivity clippingImageActivity, View view) {
        clippingImageActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public static final void m75391n0(ClippingImageActivity clippingImageActivity, View view) {
        ProgressBar clipLoading = ((C24451a) clippingImageActivity.getMViewBinding()).f74511d;
        Intrinsics.m97801g(clipLoading, "clipLoading");
        AbstractC26006c.m102058k(clipLoading);
        ClipImageView srcPic = ((C24451a) clippingImageActivity.getMViewBinding()).f74513f;
        Intrinsics.m97801g(srcPic, "srcPic");
        clippingImageActivity.m75395r0(srcPic);
    }

    /* JADX INFO: renamed from: o0 */
    private final void m75392o0(ClipImageView imageView, String uri) {
        Glide.with(imageView).load2(Uri.fromFile(new File(uri))).into(imageView);
    }

    /* JADX INFO: renamed from: p0 */
    private final void m75393p0(Context context) {
        String str;
        String str2 = this.CROP_CACHE;
        if (str2 == null || (str2 != null && StringsKt.m98242W(str2, "/data/user/", false, 2, null))) {
            File fileM102987a = AbstractC26378e.m102987a(context);
            if (fileM102987a != null) {
                str = fileM102987a.getAbsolutePath() + "/crop/";
            } else {
                str = context.getCacheDir().getAbsolutePath() + "/crop/";
            }
            this.CROP_CACHE = str;
        }
        m75394q0(this.CROP_CACHE);
    }

    /* JADX INFO: renamed from: q0 */
    private final void m75394q0(String path) {
        if (path == null) {
            return;
        }
        AbstractC5795n.m27424b(path);
    }

    /* JADX INFO: renamed from: r0 */
    private final void m75395r0(final ClipImageView clipImageView) {
        AbstractC24093j.m95062g(new InterfaceC24095l() { // from class: com.transsion.publish.ui.c
            @Override // io.reactivex.rxjava3.core.InterfaceC24095l
            /* JADX INFO: renamed from: a */
            public final void mo75615a(InterfaceC24094k interfaceC24094k) throws Throwable {
                ClippingImageActivity.m75396s0(this.f58226a, clipImageView, interfaceC24094k);
            }
        }).m95088v(AbstractC24083b.m95041c()).m95073E(AbstractC27875a.m108402c()).subscribe(new C17606b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m75396s0(ClippingImageActivity clippingImageActivity, ClipImageView clipImageView, InterfaceC24094k emitter) throws Throwable {
        Intrinsics.m97802h(emitter, "emitter");
        C26866a.a.m104898f(C26866a.f81698a, clippingImageActivity.TAG, "start....", false, 4, null);
        File fileM75389k0 = clippingImageActivity.m75389k0(clipImageView);
        if (emitter.isDisposed() || fileM75389k0 == null) {
            return;
        }
        emitter.onNext(fileM75389k0);
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
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C24451a getViewBinding() {
        C24451a c24451aM95943c = C24451a.m95943c(getLayoutInflater());
        Intrinsics.m97801g(c24451aM95943c, "inflate(...)");
        return c24451aM95943c;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public C24655b newLogViewConfig() {
        return new C24655b("clipping_image", false, 2, null);
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
    }
}
