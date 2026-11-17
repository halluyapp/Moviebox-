package com.transsion.mbwidget;

import android.app.Application;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.video.VideoDetailPlayBean;
import com.transsion.mbwidget.data.WidgetDataManager;
import com.transsion.mbwidget.utils.BitmapUtils;
import com.transsion.mbwidget.utils.C15747a;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import org.mvel2.ast.ASTNode;
import p645og.C26223a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, m97100d2 = {"Lcom/transsion/mbwidget/PlayWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/appwidget/AppWidgetManager;", "appWidgetManager", "", "appWidgetIds", "", "onUpdate", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "onDisabled", "(Landroid/content/Context;)V", "onEnabled", "a", "Companion", "DeskWidget_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class PlayWidgetProvider extends AppWidgetProvider {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:37:0x00c6 A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:13:0x0044, B:31:0x00b9, B:33:0x00bd, B:38:0x00cf, B:43:0x0116, B:44:0x0124, B:37:0x00c6), top: B:52:0x0044 }] */
        /* JADX WARN: Code duplicated, block: B:43:0x0116 A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:13:0x0044, B:31:0x00b9, B:33:0x00bd, B:38:0x00cf, B:43:0x0116, B:44:0x0124, B:37:0x00c6), top: B:52:0x0044 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x013b  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v28, types: [T, android.app.PendingIntent] */
        /* JADX INFO: renamed from: b */
        public final Object m69605b(Context context, RemoteViews remoteViews, int i11, Continuation continuation) throws Throwable {
            PlayWidgetProvider$Companion$bindHistory$1 playWidgetProvider$Companion$bindHistory$1;
            Context context2;
            int i12;
            RemoteViews remoteViews2;
            VideoDetailPlayBean videoDetailPlayBean;
            Ref.ObjectRef objectRef;
            Context context3;
            Ref.ObjectRef objectRef2;
            int i13;
            RemoteViews remoteViews3;
            VideoDetailPlayBean videoDetailPlayBean2;
            PendingIntent pendingIntentM69684m;
            Bitmap bitmapM69739b;
            if (continuation instanceof PlayWidgetProvider$Companion$bindHistory$1) {
                playWidgetProvider$Companion$bindHistory$1 = (PlayWidgetProvider$Companion$bindHistory$1) continuation;
                int i14 = playWidgetProvider$Companion$bindHistory$1.label;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    playWidgetProvider$Companion$bindHistory$1.label = i14 - Integer.MIN_VALUE;
                } else {
                    playWidgetProvider$Companion$bindHistory$1 = new PlayWidgetProvider$Companion$bindHistory$1(this, continuation);
                }
            } else {
                playWidgetProvider$Companion$bindHistory$1 = new PlayWidgetProvider$Companion$bindHistory$1(this, continuation);
            }
            Object objM69685p = playWidgetProvider$Companion$bindHistory$1.result;
            Object objF = IntrinsicsKt.m97630f();
            int i15 = playWidgetProvider$Companion$bindHistory$1.label;
            try {
                if (i15 == 0) {
                    ResultKt.m97107b(objM69685p);
                    WidgetDataManager widgetDataManager = WidgetDataManager.f54097a;
                    context2 = context;
                    playWidgetProvider$Companion$bindHistory$1.L$0 = context2;
                    playWidgetProvider$Companion$bindHistory$1.L$1 = remoteViews;
                    i12 = i11;
                    playWidgetProvider$Companion$bindHistory$1.I$0 = i12;
                    playWidgetProvider$Companion$bindHistory$1.label = 1;
                    objM69685p = widgetDataManager.m69685p(playWidgetProvider$Companion$bindHistory$1);
                    if (objM69685p == objF) {
                        return objF;
                    }
                    remoteViews2 = remoteViews;
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i13 = playWidgetProvider$Companion$bindHistory$1.I$0;
                        objectRef2 = (Ref.ObjectRef) playWidgetProvider$Companion$bindHistory$1.L$3;
                        videoDetailPlayBean2 = (VideoDetailPlayBean) playWidgetProvider$Companion$bindHistory$1.L$2;
                        remoteViews3 = (RemoteViews) playWidgetProvider$Companion$bindHistory$1.L$1;
                        context3 = (Context) playWidgetProvider$Companion$bindHistory$1.L$0;
                        try {
                            ResultKt.m97107b(objM69685p);
                            bitmapM69739b = (Bitmap) objM69685p;
                            if (bitmapM69739b != null || bitmapM69739b.getByteCount() == 0) {
                                bitmapM69739b = BitmapUtils.f54124a.m69739b(R$mipmap.bg_img_widget_small);
                            }
                            remoteViews3.setImageViewBitmap(R$id.widget_img, C26223a.m102671a(Utils.m27275a(), bitmapM69739b, AbstractC23384a.m92908b(140), AbstractC23384a.m92908b(154), false, AbstractC23384a.m92908b(16)));
                            objectRef2.element = WidgetDataManager.f54097a.m69690v(context3, false, Boxing.m97634d(i13), videoDetailPlayBean2.getSubjectId());
                            C15747a.f54125a.m69748d("subject", videoDetailPlayBean2.getSubjectId());
                            videoDetailPlayBean = videoDetailPlayBean2;
                            if (videoDetailPlayBean == null) {
                                C15747a.m69742e(C15747a.f54125a, "root", null, 2, null);
                                remoteViews3.setImageViewResource(R$id.widget_img, R$mipmap.bg_img_widget_small);
                            }
                            Result.m112707constructorimpl(Unit.f75682a);
                        } catch (Throwable th2) {
                            th = th2;
                            Result.Companion companion = Result.INSTANCE;
                            Result.m112707constructorimpl(ResultKt.m97106a(th));
                        }
                        int i16 = R$id.widget_root;
                        pendingIntentM69684m = (PendingIntent) objectRef2.element;
                        if (pendingIntentM69684m == null) {
                            pendingIntentM69684m = WidgetDataManager.f54097a.m69684m(context3, false, Boxing.m97634d(i13));
                        }
                        remoteViews3.setOnClickPendingIntent(i16, pendingIntentM69684m);
                        remoteViews3.setOnClickPendingIntent(R$id.widget_search, WidgetDataManager.f54097a.m69687s(context3, false, Boxing.m97634d(i13)));
                        C15747a.m69742e(C15747a.f54125a, "search", null, 2, null);
                        return Unit.f75682a;
                    }
                    int i17 = playWidgetProvider$Companion$bindHistory$1.I$0;
                    remoteViews2 = (RemoteViews) playWidgetProvider$Companion$bindHistory$1.L$1;
                    Context context4 = (Context) playWidgetProvider$Companion$bindHistory$1.L$0;
                    ResultKt.m97107b(objM69685p);
                    i12 = i17;
                    context2 = context4;
                }
                Result.Companion companion2 = Result.INSTANCE;
                if (videoDetailPlayBean != null) {
                    BitmapUtils bitmapUtils = BitmapUtils.f54124a;
                    Application applicationM27275a = Utils.m27275a();
                    Intrinsics.m97801g(applicationM27275a, "getApp(...)");
                    String coverUrl = videoDetailPlayBean.getCoverUrl();
                    int iM92908b = AbstractC23384a.m92908b(154);
                    playWidgetProvider$Companion$bindHistory$1.L$0 = context2;
                    playWidgetProvider$Companion$bindHistory$1.L$1 = remoteViews2;
                    playWidgetProvider$Companion$bindHistory$1.L$2 = videoDetailPlayBean;
                    playWidgetProvider$Companion$bindHistory$1.L$3 = objectRef;
                    playWidgetProvider$Companion$bindHistory$1.I$0 = i12;
                    playWidgetProvider$Companion$bindHistory$1.label = 2;
                    Object objM69741d = bitmapUtils.m69741d(applicationM27275a, coverUrl, iM92908b, playWidgetProvider$Companion$bindHistory$1);
                    if (objM69741d == objF) {
                        return objF;
                    }
                    i13 = i12;
                    RemoteViews remoteViews4 = remoteViews2;
                    videoDetailPlayBean2 = videoDetailPlayBean;
                    objM69685p = objM69741d;
                    context3 = context2;
                    objectRef2 = objectRef;
                    remoteViews3 = remoteViews4;
                    bitmapM69739b = (Bitmap) objM69685p;
                    if (bitmapM69739b != null) {
                        bitmapM69739b = BitmapUtils.f54124a.m69739b(R$mipmap.bg_img_widget_small);
                    } else {
                        bitmapM69739b = BitmapUtils.f54124a.m69739b(R$mipmap.bg_img_widget_small);
                    }
                    remoteViews3.setImageViewBitmap(R$id.widget_img, C26223a.m102671a(Utils.m27275a(), bitmapM69739b, AbstractC23384a.m92908b(140), AbstractC23384a.m92908b(154), false, AbstractC23384a.m92908b(16)));
                    objectRef2.element = WidgetDataManager.f54097a.m69690v(context3, false, Boxing.m97634d(i13), videoDetailPlayBean2.getSubjectId());
                    C15747a.f54125a.m69748d("subject", videoDetailPlayBean2.getSubjectId());
                    videoDetailPlayBean = videoDetailPlayBean2;
                } else {
                    context3 = context2;
                    objectRef2 = objectRef;
                    i13 = i12;
                    remoteViews3 = remoteViews2;
                }
                if (videoDetailPlayBean == null) {
                    C15747a.m69742e(C15747a.f54125a, "root", null, 2, null);
                    remoteViews3.setImageViewResource(R$id.widget_img, R$mipmap.bg_img_widget_small);
                }
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th3) {
                th = th3;
                context3 = context2;
                objectRef2 = objectRef;
                i13 = i12;
                remoteViews3 = remoteViews2;
                Result.Companion companion3 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th));
            }
            videoDetailPlayBean = (VideoDetailPlayBean) objM69685p;
            objectRef = new Ref.ObjectRef();
            int i18 = R$id.widget_root;
            pendingIntentM69684m = (PendingIntent) objectRef2.element;
            if (pendingIntentM69684m == null) {
                pendingIntentM69684m = WidgetDataManager.f54097a.m69684m(context3, false, Boxing.m97634d(i13));
            }
            remoteViews3.setOnClickPendingIntent(i18, pendingIntentM69684m);
            remoteViews3.setOnClickPendingIntent(R$id.widget_search, WidgetDataManager.f54097a.m69687s(context3, false, Boxing.m97634d(i13)));
            C15747a.m69742e(C15747a.f54125a, "search", null, 2, null);
            return Unit.f75682a;
        }

        /* JADX INFO: renamed from: c */
        public final void m69606c(Context context, AppWidgetManager appWidgetManager, int i11) {
            Intrinsics.m97802h(context, "context");
            Intrinsics.m97802h(appWidgetManager, "appWidgetManager");
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new PlayWidgetProvider$Companion$updateWidget$1(i11, context, appWidgetManager, null), 3, null);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(Context context) {
        super.onDisabled(context);
        C15747a.m69744l(C15747a.f54125a, "history_desk_widget", false, null, 4, null);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(Context context) {
        super.onEnabled(context);
        C15747a.m69744l(C15747a.f54125a, "history_desk_widget", true, null, 4, null);
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(intent, "intent");
        super.onReceive(context, intent);
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Play onReceive:");
        sb2.append(action);
        sb2.append(", ");
        sb2.append(extras);
        if (Intrinsics.m97797c("com.transsion.mbwidget.play.ACTION_CLICK", intent.getAction())) {
            C15747a.f54125a.m69747c(intent);
            String stringExtra = intent.getStringExtra("key_deeplink_widget");
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setFlags(ASTNode.DEOP);
            intent2.setData(Uri.parse(stringExtra));
            context.startActivity(intent2);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        Intrinsics.m97802h(context, "context");
        Intrinsics.m97802h(appWidgetManager, "appWidgetManager");
        Intrinsics.m97802h(appWidgetIds, "appWidgetIds");
        for (int i11 : appWidgetIds) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("appWidgetId:");
            sb2.append(i11);
            INSTANCE.m69606c(context, appWidgetManager, i11);
        }
    }
}
