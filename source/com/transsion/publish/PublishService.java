package com.transsion.publish;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.publish.api.bean.RequestPostEntity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0003R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0016\u0010\"\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001d¨\u0006$"}, m97100d2 = {"Lcom/transsion/publish/PublishService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "c", "(Landroid/content/Intent;)V", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/Runnable;", "runnable", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(Ljava/lang/Runnable;)V", "onCreate", "p0", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "onDestroy", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "I", "NOTIFICATION_ID", "Lcom/transsion/publish/api/bean/RequestPostEntity;", "Lcom/transsion/publish/api/bean/RequestPostEntity;", "entity", "sourceType", "e", "Publish_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class PublishService extends Service {

    /* JADX INFO: renamed from: f */
    private static boolean f57965f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int NOTIFICATION_ID = 100012;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private RequestPostEntity entity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int sourceType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    private static String f57966g = "PublishService";

    /* JADX INFO: renamed from: com.transsion.publish.PublishService$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m75186a(Context context, RequestPostEntity entity, int i11) {
            Intrinsics.m97802h(context, "context");
            Intrinsics.m97802h(entity, "entity");
            Intent intent = new Intent(context, (Class<?>) PublishService.class);
            intent.putExtra("entity", entity);
            intent.putExtra("sourceType", i11);
            context.startService(intent);
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m75182b(Runnable runnable) {
        C17604p.f58122b.m75379a().m75378d(runnable);
    }

    /* JADX INFO: renamed from: c */
    private final void m75183c(Intent intent) {
        f57965f = true;
        Intrinsics.m97799e(intent);
        Serializable serializableExtra = intent.getSerializableExtra("entity");
        this.sourceType = intent.getIntExtra("sourceType", 0);
        if (serializableExtra != null && (serializableExtra instanceof RequestPostEntity)) {
            this.entity = (RequestPostEntity) serializableExtra;
        }
        m75184d();
    }

    /* JADX INFO: renamed from: d */
    private final void m75184d() {
        if (this.entity == null) {
            return;
        }
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, f57966g, "disposePost", false, 4, null);
        C26866a.a.m104898f(aVar, f57966g, String.valueOf(this.entity), false, 4, null);
        PublishManager publishManagerM75177a = PublishManager.INSTANCE.m75177a();
        RequestPostEntity requestPostEntity = this.entity;
        Intrinsics.m97799e(requestPostEntity);
        publishManagerM75177a.publish(requestPostEntity, this.sourceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m75185e(PublishService publishService, Intent intent) {
        publishService.m75183c(intent);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent p11) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.context = getApplicationContext();
    }

    @Override // android.app.Service
    public void onDestroy() {
        C26866a.a.m104898f(C26866a.f81698a, f57966g, "onDestroy", false, 4, null);
        f57965f = false;
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, int flags, int startId) {
        C26866a.a.m104898f(C26866a.f81698a, f57966g, "onStartCommand", false, 4, null);
        m75182b(new Runnable() { // from class: com.transsion.publish.l
            @Override // java.lang.Runnable
            public final void run() {
                PublishService.m75185e(this.f58117a, intent);
            }
        });
        return super.onStartCommand(intent, flags, startId);
    }
}
