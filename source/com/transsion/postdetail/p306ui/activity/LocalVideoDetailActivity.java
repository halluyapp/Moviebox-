package com.transsion.postdetail.p306ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.Fragment;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.therouter.TheRouter;
import com.transsion.baselib.report.C14492k;
import com.transsion.baseui.R$color;
import com.transsion.baseui.activity.BaseActivity;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.p306ui.fragment.LocalVideoDetailFragment;
import com.transsion.subtitle.dialog.SubtitleMainDialog2;
import com.transsion.videofloat.manager.InterfaceC21108c;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p352dn.InterfaceC22998b;
import p415fq.InterfaceC23411b;
import p723qx.InterfaceC27138e;
import p844vo.C28140b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001 B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u000fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u0018\u0010(\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b'\u0010!R\u0018\u0010*\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b)\u0010!R\u0018\u0010,\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b+\u0010!R\u0018\u0010.\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010!R\u0018\u00100\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0018\u00104\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b3\u0010!R\u0018\u00107\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00109\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u0018\u0010;\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b:\u00106R\u0018\u0010=\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b<\u00106R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006C"}, m97100d2 = {"Lcom/transsion/postdetail/ui/activity/LocalVideoDetailActivity;", "Lcom/transsion/baseui/activity/BaseActivity;", "Lvo/b;", "Lcom/transsion/videofloat/manager/c;", "<init>", "()V", "", "d0", "f0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "isAttach", "()Z", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "c0", "()Lvo/b;", "isTranslucent", "isStatusDark", "", "statusColor", "()I", "onBackPressed", "onPause", "h", "isMusicFloatingAttach", "", "a", "Ljava/lang/String;", "path", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "url", "c", "proxyUrl", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "name", "e", "resourceId", "f", "postId", "g", "subjectId", "Ljava/lang/Boolean;", "completed", "i", "isSeries", "j", "pageFrom", CampaignEx.JSON_KEY_AD_K, "Ljava/lang/Integer;", "videoHeight", "l", "videoWidth", "m", "parentPosition", "n", RequestParameters.POSITION, "Lcom/transsion/postdetail/ui/fragment/LocalVideoDetailFragment;", "o", "Lcom/transsion/postdetail/ui/fragment/LocalVideoDetailFragment;", "fragment", TtmlNode.TAG_P, "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class LocalVideoDetailActivity extends BaseActivity<C28140b> implements InterfaceC21108c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public String path;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public String url;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public String proxyUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public String name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public String resourceId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public String postId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public String subjectId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public String pageFrom;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private LocalVideoDetailFragment fragment;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public Boolean completed = Boolean.TRUE;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public Boolean isSeries = Boolean.FALSE;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public Integer videoHeight = 0;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public Integer videoWidth = 0;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public Integer parentPosition = -1;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public Integer position = -1;

    /* JADX INFO: renamed from: d0 */
    private final void m73829d0() {
        Uri data = getIntent().getData();
        Intent intent = getIntent();
        String type = intent != null ? intent.getType() : null;
        if ((type == null || !StringsKt.m98242W(type, "video/", false, 2, null)) && (type == null || !StringsKt.m98242W(type, "audio/", false, 2, null))) {
            return;
        }
        if (StringsKt.m98242W(String.valueOf(data), "http", false, 2, null)) {
            this.url = String.valueOf(data);
        } else {
            this.path = String.valueOf(data);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m73830e0() {
        InterfaceC22998b interfaceC22998b = (InterfaceC22998b) TheRouter.m61774d(InterfaceC22998b.class, new Object[0]);
        if (interfaceC22998b != null) {
            interfaceC22998b.mo69872z(0.0f);
        }
    }

    /* JADX INFO: renamed from: f0 */
    private final void m73831f0() {
        LocalVideoDetailFragment localVideoDetailFragment = this.fragment;
        if (localVideoDetailFragment != null) {
            localVideoDetailFragment.m74215m3();
        }
        this.fragment = LocalVideoDetailFragment.INSTANCE.m74221a(this.path, this.url, this.name, this.resourceId, this.postId, this.subjectId, this.proxyUrl, this.completed, this.isSeries, this.pageFrom, this.videoHeight, this.videoWidth, this.parentPosition, this.position);
        AbstractC3168w abstractC3168wM14557p = getSupportFragmentManager().m14557p();
        int i11 = R$id.container;
        LocalVideoDetailFragment localVideoDetailFragment2 = this.fragment;
        Intrinsics.m97799e(localVideoDetailFragment2);
        abstractC3168wM14557p.m14813s(i11, localVideoDetailFragment2).mo14671j();
    }

    @Override // com.transsion.baseui.activity.BaseCommonActivity
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public C28140b getViewBinding() {
        C28140b c28140bM109285c = C28140b.m109285c(getLayoutInflater());
        Intrinsics.m97801g(c28140bM109285c, "inflate(...)");
        return c28140bM109285c;
    }

    @Override // com.transsion.videofloat.manager.InterfaceC21108c
    /* JADX INFO: renamed from: h */
    public void mo70151h() {
        LocalVideoDetailFragment localVideoDetailFragment = this.fragment;
        if (localVideoDetailFragment != null) {
            localVideoDetailFragment.m74215m3();
        }
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isAttach() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseMusicFloatActivity
    public boolean isMusicFloatingAttach() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isStatusDark() {
        return false;
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public boolean isTranslucent() {
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        InterfaceC23411b interfaceC23411b = (InterfaceC23411b) TheRouter.m61774d(InterfaceC23411b.class, new Object[0]);
        if (interfaceC23411b != null) {
            interfaceC23411b.mo23888e();
        }
        super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        TheRouter.m61781l(this);
        super.onCreate(savedInstanceState);
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "LocalVideoDetail", "LocalVideoDetailActivity onCreate", false, 4, null);
        C26866a.a.m104898f(aVar, "VideoFloat", "LocalVideoDetailActivity onCreate, " + (savedInstanceState == null), false, 4, null);
        InterfaceC23411b interfaceC23411b = (InterfaceC23411b) TheRouter.m61774d(InterfaceC23411b.class, new Object[0]);
        if (interfaceC23411b != null) {
            interfaceC23411b.mo23891h();
        }
        InterfaceC23411b interfaceC23411b2 = (InterfaceC23411b) TheRouter.m61774d(InterfaceC23411b.class, new Object[0]);
        if (interfaceC23411b2 != null) {
            interfaceC23411b2.mo23887d();
        }
        m73829d0();
        C14492k.f50955a.m65329w(1, this);
        if (savedInstanceState == null) {
            m73831f0();
        }
        ((C28140b) getMViewBinding()).getRoot().post(new Runnable() { // from class: com.transsion.postdetail.ui.activity.a
            @Override // java.lang.Runnable
            public final void run() {
                LocalVideoDetailActivity.m73830e0();
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.m97802h(intent, "intent");
        super.onNewIntent(intent);
        boolean zM97797c = Intrinsics.m97797c(this.subjectId, intent.getStringExtra("extra_subject_id"));
        String stringExtra = intent.getStringExtra("extra_page_from");
        setIntent(intent);
        TheRouter.m61781l(this);
        m73829d0();
        if (Intrinsics.m97797c(stringExtra, "media_notification")) {
            LocalVideoDetailFragment localVideoDetailFragment = this.fragment;
            if (localVideoDetailFragment != null) {
                localVideoDetailFragment.m74214e3();
                return;
            }
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "LocalVideoDetail", "LocalVideoDetailActivity onNewIntent,isCurrentSubject = " + zM97797c, false, 4, null);
        if (zM97797c) {
            LocalVideoDetailFragment localVideoDetailFragment2 = this.fragment;
            if (localVideoDetailFragment2 != null) {
                localVideoDetailFragment2.m74210W1(this.subjectId, this.resourceId);
                return;
            }
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Fragment fragmentM14547k0 = getSupportFragmentManager().m14547k0("fragment_subtitle_main_dialog");
            if (fragmentM14547k0 != null && (fragmentM14547k0 instanceof SubtitleMainDialog2)) {
                ((SubtitleMainDialog2) fragmentM14547k0).dismissAllowingStateLoss();
            }
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        m73831f0();
    }

    @Override // com.transsion.baseui.activity.BaseActivity, com.transsion.baseui.activity.BaseCommonActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            LocalVideoDetailFragment localVideoDetailFragment = this.fragment;
            if (localVideoDetailFragment != null) {
                localVideoDetailFragment.m74215m3();
            }
            InterfaceC27138e.f82251a.m105606b().mo86575j(this);
        }
    }

    @Override // com.transsion.baseui.activity.BaseActivity
    public int statusColor() {
        return R$color.base_color_black;
    }
}
