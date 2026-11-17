package com.transsion.publish.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.p1004lifecycle.InterfaceC3224u;
import androidx.p1004lifecycle.Lifecycle;
import com.blankj.utilcode.util.AbstractC5775a;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.hisavana.common.tracking.TrackingKey;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.therouter.TheRouter;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.util.C14557c;
import com.transsion.publish.PublishManager;
import com.transsion.publish.R$drawable;
import com.transsion.publish.R$id;
import com.transsion.publish.R$layout;
import com.transsion.publish.bean.PublishResult;
import com.transsion.publish.view.PublishStateView;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C25220y0;
import p465hp.InterfaceC23888a;
import p743rh.C27287m;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0005Je\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\t¢\u0006\u0004\b&\u0010$R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010*R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010*R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010*R\u0016\u0010\u0016\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010*R\u0016\u0010\u0018\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010*R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010*R\u0016\u0010\u0019\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010*R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001d\u0010L\u001a\u0004\u0018\u00010H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bJ\u0010K¨\u0006M"}, m97100d2 = {"Lcom/transsion/publish/view/PublishStateView;", "Lcom/transsion/publish/view/BaseFloatView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "o", CampaignEx.JSON_KEY_AD_Q, "()V", TmcStartParams.KEY_URL_SHORT, "sourceType", "", "subjectId", "cover", CampaignEx.JSON_KEY_TITLE, TrackingKey.DESCRIPTION, "groupId", "groupName", "groupImage", "", "showIcTxt", "publishSource", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/transsion/publish/bean/PublishResult;", "eventBean", "showFloatView", "(Lcom/transsion/publish/bean/PublishResult;)V", "resource", "setImageResource", "(I)V", TtmlNode.ATTR_TTS_COLOR, "setProgressColor", "e", "Lcom/transsion/publish/bean/PublishResult;", "f", "Ljava/lang/String;", "TAG", "Lcom/transsion/publish/view/CircleProgressBar;", "g", "Lcom/transsion/publish/view/CircleProgressBar;", "progressBar", "Landroid/widget/ImageView;", "h", "Landroid/widget/ImageView;", "ivBg", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "icTxt", "Landroid/widget/RelativeLayout;", "j", "Landroid/widget/RelativeLayout;", TtmlNode.TAG_LAYOUT, CampaignEx.JSON_KEY_AD_K, "I", "l", "m", "n", TtmlNode.TAG_P, CampaignEx.JSON_KEY_AD_R, "s", "Z", "t", "Ljava/lang/Integer;", "ivBgResource", "Lhp/a;", "Lkotlin/Lazy;", "getPublishedApi", "()Lhp/a;", "publishedApi", "Publish_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class PublishStateView extends BaseFloatView {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private PublishResult eventBean;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private CircleProgressBar progressBar;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private ImageView ivBg;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private TextView icTxt;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private RelativeLayout layout;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int sourceType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String subjectId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private String cover;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private String title;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private String description;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private String groupName;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private String groupId;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private String groupImage;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean showIcTxt;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private Integer ivBgResource;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final Lazy publishedApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishStateView(Context context) {
        super(context);
        Intrinsics.m97802h(context, "context");
        this.TAG = PublishManager.TAG;
        this.sourceType = 2;
        this.subjectId = "";
        this.cover = "";
        this.title = "";
        this.description = "";
        this.groupName = "";
        this.groupId = "";
        this.groupImage = "";
        this.showIcTxt = true;
        this.publishedApi = LazyKt.m97097b(new Function0() { // from class: pp.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PublishStateView.m75630s();
            }
        });
        m75626o(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.m97802h(context, "context");
        this.TAG = PublishManager.TAG;
        this.sourceType = 2;
        this.subjectId = "";
        this.cover = "";
        this.title = "";
        this.description = "";
        this.groupName = "";
        this.groupId = "";
        this.groupImage = "";
        this.showIcTxt = true;
        this.publishedApi = LazyKt.m97097b(new Function0() { // from class: pp.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PublishStateView.m75630s();
            }
        });
        m75626o(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishStateView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        this.TAG = PublishManager.TAG;
        this.sourceType = 2;
        this.subjectId = "";
        this.cover = "";
        this.title = "";
        this.description = "";
        this.groupName = "";
        this.groupId = "";
        this.groupImage = "";
        this.showIcTxt = true;
        this.publishedApi = LazyKt.m97097b(new Function0() { // from class: pp.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PublishStateView.m75630s();
            }
        });
        m75626o(context);
    }

    private final InterfaceC23888a getPublishedApi() {
        return (InterfaceC23888a) this.publishedApi.getValue();
    }

    /* JADX INFO: renamed from: o */
    private final void m75626o(final Context context) {
        LayoutInflater.from(context).inflate(R$layout.view_publish_state, this);
        this.progressBar = (CircleProgressBar) findViewById(R$id.circles_bar);
        this.ivBg = (ImageView) findViewById(R$id.iv_btn);
        TextView textView = (TextView) findViewById(R$id.tvContent);
        this.icTxt = textView;
        if (textView != null) {
            textView.setVisibility(this.showIcTxt ? 0 : 8);
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R$id.rl_layout);
        this.layout = relativeLayout;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: pp.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PublishStateView.m75627p(this.f81818a, context, view);
                }
            });
        }
        m75628q();
        CircleProgressBar circleProgressBar = this.progressBar;
        if (circleProgressBar != null) {
            circleProgressBar.setProgress(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m75627p(PublishStateView publishStateView, Context context, View view) {
        InterfaceC23888a publishedApi;
        if (C14557c.f51100a.m65671a(R$id.rl_layout, 2000L)) {
            return;
        }
        InterfaceC23888a publishedApi2 = publishStateView.getPublishedApi();
        if (publishedApi2 != null && publishedApi2.mo75360d() && C27287m.f83003a.m106330e() && (publishedApi = publishStateView.getPublishedApi()) != null && !publishedApi.mo75362f()) {
            publishStateView.m75632u(context);
            return;
        }
        InterfaceC23888a publishedApi3 = publishStateView.getPublishedApi();
        if (publishedApi3 != null) {
            publishedApi3.mo75359c();
        }
        int i11 = publishStateView.sourceType;
        if (i11 == 2) {
            InterfaceC23888a publishedApi4 = publishStateView.getPublishedApi();
            if (publishedApi4 != null) {
                publishedApi4.mo75358b(context);
            }
            C26866a.a.m104898f(C26866a.f81698a, publishStateView.TAG, "click type_post_publish", false, 4, null);
            return;
        }
        if (i11 == 1) {
            InterfaceC23888a publishedApi5 = publishStateView.getPublishedApi();
            if (publishedApi5 != null) {
                publishedApi5.mo75363g(context, publishStateView.subjectId, publishStateView.cover, publishStateView.title, publishStateView.description, publishStateView.sourceType);
            }
            C26866a.a.m104898f(C26866a.f81698a, publishStateView.TAG, "click type_star_publish", false, 4, null);
            return;
        }
        if (i11 == 3) {
            InterfaceC23888a publishedApi6 = publishStateView.getPublishedApi();
            if (publishedApi6 != null) {
                publishedApi6.mo75361e(context, publishStateView.subjectId, publishStateView.cover, publishStateView.title, publishStateView.description, publishStateView.sourceType);
            }
            C14450a.f50860a.m65145h("subjectdetail", "post", (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
            C26866a.a.m104898f(C26866a.f81698a, publishStateView.TAG, "click type_post_detail", false, 4, null);
            return;
        }
        if (i11 == 4) {
            InterfaceC23888a publishedApi7 = publishStateView.getPublishedApi();
            if (publishedApi7 != null) {
                publishedApi7.mo75357a(context, publishStateView.groupId, publishStateView.groupName, publishStateView.groupImage);
            }
            C14450a.f50860a.m65145h("roomdetail", "post", (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
            C26866a.a.m104898f(C26866a.f81698a, publishStateView.TAG, "click type_room_detail", false, 4, null);
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m75628q() {
        Object context = getContext();
        if (context instanceof ComponentActivity) {
            Function1 function1 = new Function1() { // from class: pp.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PublishStateView.m75629r(this.f81820a, (PublishResult) obj);
                }
            };
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = PublishResult.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.observeEvent((InterfaceC3224u) context, name, Lifecycle.State.CREATED, C25220y0.m99269c().mo98454r(), false, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Unit m75629r(PublishStateView publishStateView, PublishResult it) {
        Intrinsics.m97802h(it, "it");
        publishStateView.showFloatView(it);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final InterfaceC23888a m75630s() {
        return (InterfaceC23888a) TheRouter.m61774d(InterfaceC23888a.class, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final void m75631t(PublishStateView publishStateView) {
        Context context = publishStateView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        publishStateView.m75632u(context);
    }

    /* JADX INFO: renamed from: u */
    private final void m75632u(Context context) {
        UploadView uploadView = new UploadView(context);
        if (!uploadView.getIsShow()) {
            uploadView.setVisibility(0);
            uploadView.setAlpha(1.0f);
            Activity activityM27311b = AbstractC5775a.m27311b();
            if (activityM27311b == null || activityM27311b.isFinishing() || activityM27311b.isDestroyed()) {
                activityM27311b = AbstractC5775a.m27311b();
            }
            if (activityM27311b == null || activityM27311b.isFinishing() || activityM27311b.isDestroyed()) {
                return;
            } else {
                uploadView.show(activityM27311b);
            }
        }
        uploadView.showFloatView(this.eventBean);
    }

    public final void publishSource(int sourceType, String subjectId, String cover, String title, String description, String groupId, String groupName, String groupImage, boolean showIcTxt) {
        Intrinsics.m97802h(subjectId, "subjectId");
        Intrinsics.m97802h(cover, "cover");
        Intrinsics.m97802h(title, "title");
        Intrinsics.m97802h(description, "description");
        Intrinsics.m97802h(groupId, "groupId");
        Intrinsics.m97802h(groupName, "groupName");
        Intrinsics.m97802h(groupImage, "groupImage");
        this.sourceType = sourceType;
        this.subjectId = subjectId;
        this.cover = cover;
        this.title = title;
        this.description = description;
        this.groupId = groupId;
        this.groupName = groupName;
        this.groupImage = groupImage;
        this.showIcTxt = showIcTxt;
        TextView textView = this.icTxt;
        if (textView != null) {
            textView.setVisibility(showIcTxt ? 0 : 8);
        }
    }

    public final void setImageResource(int resource) {
        this.ivBgResource = Integer.valueOf(resource);
        ImageView imageView = this.ivBg;
        if (imageView != null) {
            imageView.setImageResource(resource);
        }
    }

    public final void setProgressColor(int color) {
        CircleProgressBar circleProgressBar = this.progressBar;
        if (circleProgressBar != null) {
            circleProgressBar.setRingColor(color);
        }
    }

    public final void showFloatView(PublishResult eventBean) {
        CircleProgressBar circleProgressBar;
        this.eventBean = eventBean;
        Integer numValueOf = eventBean != null ? Integer.valueOf(eventBean.getState()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            CircleProgressBar circleProgressBar2 = this.progressBar;
            if (circleProgressBar2 != null) {
                circleProgressBar2.setVisibility(8);
            }
            ImageView imageView = this.ivBg;
            if (imageView != null) {
                Integer num = this.ivBgResource;
                imageView.setImageResource(num != null ? num.intValue() : R$drawable.ic_floating_state_comm);
                return;
            }
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            CircleProgressBar circleProgressBar3 = this.progressBar;
            if (circleProgressBar3 != null) {
                circleProgressBar3.setVisibility(8);
            }
            CircleProgressBar circleProgressBar4 = this.progressBar;
            if (circleProgressBar4 != null) {
                circleProgressBar4.setProgress(0);
            }
            ImageView imageView2 = this.ivBg;
            if (imageView2 != null) {
                Integer num2 = this.ivBgResource;
                imageView2.setImageResource(num2 != null ? num2.intValue() : R$drawable.ic_floating_state_comm);
                return;
            }
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            CircleProgressBar circleProgressBar5 = this.progressBar;
            if (circleProgressBar5 == null || circleProgressBar5.getVisibility() != 0) {
                CircleProgressBar circleProgressBar6 = this.progressBar;
                if (circleProgressBar6 != null) {
                    circleProgressBar6.setVisibility(0);
                }
                CircleProgressBar circleProgressBar7 = this.progressBar;
                if (circleProgressBar7 != null) {
                    circleProgressBar7.setProgress(0);
                }
            }
            ImageView imageView3 = this.ivBg;
            if (imageView3 != null) {
                Integer num3 = this.ivBgResource;
                imageView3.setImageResource(num3 != null ? num3.intValue() : R$drawable.ic_floating_state_ing);
            }
            ImageView imageView4 = this.ivBg;
            if (imageView4 != null) {
                imageView4.postDelayed(new Runnable() { // from class: pp.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        PublishStateView.m75631t(this.f81817a);
                    }
                }, 1500L);
                return;
            }
            return;
        }
        if (numValueOf == null || numValueOf.intValue() != 3) {
            if (numValueOf != null && numValueOf.intValue() == 4) {
                CircleProgressBar circleProgressBar8 = this.progressBar;
                if (circleProgressBar8 != null) {
                    circleProgressBar8.setVisibility(8);
                }
                ImageView imageView5 = this.ivBg;
                if (imageView5 != null) {
                    Integer num4 = this.ivBgResource;
                    imageView5.setImageResource(num4 != null ? num4.intValue() : R$drawable.ic_floating_state_comm);
                    return;
                }
                return;
            }
            return;
        }
        CircleProgressBar circleProgressBar9 = this.progressBar;
        if ((circleProgressBar9 == null || circleProgressBar9.getVisibility() != 0) && (circleProgressBar = this.progressBar) != null) {
            circleProgressBar.setVisibility(0);
        }
        CircleProgressBar circleProgressBar10 = this.progressBar;
        if (circleProgressBar10 != null) {
            circleProgressBar10.setProgress(eventBean.getProgress());
        }
        ImageView imageView6 = this.ivBg;
        if (imageView6 != null) {
            Integer num5 = this.ivBgResource;
            imageView6.setImageResource(num5 != null ? num5.intValue() : R$drawable.ic_floating_state_ing);
        }
    }
}
