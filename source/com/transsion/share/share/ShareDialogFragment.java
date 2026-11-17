package com.transsion.share.share;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.PermissionUtils;
import com.cloud.tmc.integration.event.EventConstants;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.push.PushConstants;
import com.transsion.share.R$id;
import com.transsion.share.R$layout;
import com.transsion.share.R$mipmap;
import com.transsion.share.R$string;
import com.transsion.share.R$style;
import com.transsion.share.bean.PostType;
import com.transsion.share.bean.ShareBean;
import com.transsion.share.bean.ShareType;
import com.transsion.share.share.ShareDialogFragment;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mr.C25903a;
import nr.C26096b;
import p550kj.C24655b;
import p550kj.C24662i;
import p657or.C26383a;
import p743rh.C27287m;
import p963z0.C29093c;
import p978zg.C29182a;
import pg.C26866a;
import pr.C26933c;
import pr.C26945o;
import pr.C26946p;
import pr.InterfaceC26931a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 \u008a\u00012\u00020\u0001:\u0001WB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0003J;\u0010\"\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010\u00162\b\u0010!\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0016H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0016H\u0002¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\u0016H\u0002¢\u0006\u0004\b+\u0010)J#\u0010.\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00162\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0016H\u0002¢\u0006\u0004\b0\u0010)J!\u00104\u001a\u00020\u00062\u0006\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0006H\u0003¢\u0006\u0004\b6\u0010\u0003J\u0015\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u0019\u0010=\u001a\u00020\u00062\b\u0010<\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010<\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b?\u0010@J\u0019\u0010B\u001a\u00020A2\b\u0010<\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0006H\u0016¢\u0006\u0004\bD\u0010\u0003J/\u0010I\u001a\u00020\u00062\u0006\u0010F\u001a\u00020E2\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00152\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0006H\u0016¢\u0006\u0004\bK\u0010\u0003J\u000f\u0010L\u001a\u00020\u0006H\u0016¢\u0006\u0004\bL\u0010\u0003J\u0017\u0010O\u001a\u00020\u00062\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ!\u0010S\u001a\u00020\u00062\b\u0010R\u001a\u0004\u0018\u00010Q2\b\u00103\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0006H\u0016¢\u0006\u0004\bU\u0010\u0003R\u0018\u0010Y\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010a\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010d\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010f\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010cR\u0016\u0010h\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010cR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010o\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010q\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010nR\u0018\u0010s\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010nR\u0018\u0010u\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010nR\u0018\u0010x\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u001d\u0010~\u001a\u0004\u0018\u00010y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0083\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010nR\u0018\u0010\u0085\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010nR\u0018\u0010\u0087\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010nR\u0018\u0010\u0089\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010n¨\u0006\u008b\u0001"}, m97100d2 = {"Lcom/transsion/share/share/ShareDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "B0", "(Landroid/view/View;)V", "", "Lor/a;", "q0", "()Ljava/util/List;", "initViewModel", "shareData", "w0", "(Lor/a;)V", "Lcom/transsion/share/bean/ShareBean;", "shareBean", "A0", "(Lcom/transsion/share/bean/ShareBean;)V", "", "", "permissions", "", "r0", "([Ljava/lang/String;)Z", "M0", PushConstants.PROVIDER_FIELD_PKG, "Landroid/app/Activity;", "activity", "shortUrl", CampaignEx.JSON_KEY_DESC, CampaignEx.JSON_KEY_TITLE, "H0", "(Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/transsion/share/bean/ShareType;", "shareType", "u0", "(Lcom/transsion/share/bean/ShareType;)Lcom/transsion/share/bean/ShareBean;", "o0", "()Ljava/lang/String;", "p0", "n0", EventConstants.KEY_ACTION, "failMsg", "s0", "(Ljava/lang/String;Ljava/lang/String;)V", "v0", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "tag", "L0", "(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V", "x0", "Lcom/transsion/share/share/a;", "callback", "G0", "(Lcom/transsion/share/share/a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onDestroy", "", "requestCode", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onResume", "onPause", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/content/Context;", "context", "K0", "(Landroid/content/Context;Ljava/lang/String;)V", TmcConstants.NAVIGATION_ON_START, "Lnr/b;", "a", "Lnr/b;", "actionViewModel", "Landroidx/recyclerview/widget/RecyclerView;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroidx/recyclerview/widget/RecyclerView;", "shareList", "", "c", "J", "shareDataStartTime", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Z", "isDelete", "e", "isDownload", "f", "isCheckOut", "Lcom/transsion/share/bean/PostType;", "g", "Lcom/transsion/share/bean/PostType;", "postType", "h", "Ljava/lang/String;", "authorId", "i", "reportType", "j", "ops", CampaignEx.JSON_KEY_AD_K, "downloadName", "l", "Lcom/transsion/share/share/a;", "shareItemCallback", "Lkj/b;", "m", "Lkotlin/Lazy;", "getLogViewConfig", "()Lkj/b;", "logViewConfig", "n", "Lor/a;", "mShareData", "o", "mSubjectId", TtmlNode.TAG_P, "mShareTitle", CampaignEx.JSON_KEY_AD_Q, "mShareScore", CampaignEx.JSON_KEY_AD_R, "mSource", "s", "ShareLib_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShareDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C26096b actionViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private RecyclerView shareList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long shareDataStartTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isDelete;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isDownload;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isCheckOut;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private PostType postType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String authorId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String reportType;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String ops;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String downloadName;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private InterfaceC18701a shareItemCallback;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Lazy logViewConfig;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private C26383a mShareData;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private String mSubjectId;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private String mShareTitle;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private String mShareScore;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private String mSource;

    /* JADX INFO: renamed from: com.transsion.share.share.ShareDialogFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ShareDialogFragment m78645a(PostType postType, String str, String str2, String reportType, String str3, String str4, boolean z11, boolean z12, boolean z13, String source, String str5, String str6) {
            Intrinsics.m97802h(postType, "postType");
            Intrinsics.m97802h(reportType, "reportType");
            Intrinsics.m97802h(source, "source");
            ShareDialogFragment shareDialogFragment = new ShareDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("postType", postType);
            bundle.putString("subjectId", str);
            bundle.putBoolean("subject_delete", z12);
            bundle.putBoolean("subject_download", z11);
            bundle.putBoolean("subject_checkout", z13);
            bundle.putString("share_title", str3);
            bundle.putString("share_score", str4);
            bundle.putString(EventConstants.KEY_SOURCE, source);
            bundle.putString("author_id", str2);
            bundle.putString("report_type", reportType);
            bundle.putString("ops", str5);
            bundle.putString("download_name", str6);
            shareDialogFragment.setArguments(bundle);
            return shareDialogFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.share.share.ShareDialogFragment$b */
    public /* synthetic */ class C18698b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60371a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f60372b;

        static {
            int[] iArr = new int[ShareType.values().length];
            try {
                iArr[ShareType.DELETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareType.DOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareType.COPY_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShareType.WHATSAPP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShareType.TELEGRAM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShareType.CHECKOUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f60371a = iArr;
            int[] iArr2 = new int[PostType.values().length];
            try {
                iArr2[PostType.POST_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PostType.SUBJECT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PostType.GROUP_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[PostType.STAFF_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[PostType.SHORT_TV_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[PostType.LIVE_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[PostType.UGC_VIDEO.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[PostType.UGC_SHORT_TV.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            f60372b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.transsion.share.share.ShareDialogFragment$c */
    public static final class C18699c implements InterfaceC26931a {
        C18699c() {
        }

        @Override // pr.InterfaceC26931a
        /* JADX INFO: renamed from: a */
        public void mo78646a(C26383a shareData) {
            Intrinsics.m97802h(shareData, "shareData");
            ShareDialogFragment.this.mShareData = shareData;
            if (shareData.m102994c() == ShareType.DELETE) {
                if (!C27287m.f83003a.m106330e()) {
                    C25903a c25903a = C25903a.f79124a;
                    String string = ShareDialogFragment.this.getString(R$string.player_no_network_tip2);
                    Intrinsics.m97801g(string, "getString(...)");
                    c25903a.m101709f(string);
                    return;
                }
                InterfaceC18701a interfaceC18701a = ShareDialogFragment.this.shareItemCallback;
                if (interfaceC18701a != null) {
                    interfaceC18701a.mo70521a(ShareDialogFragment.this.mSubjectId, ShareDialogFragment.this.postType);
                }
                ShareDialogFragment.m78635t0(ShareDialogFragment.this, RequestParameters.SUBRESOURCE_DELETE, null, 2, null);
                ShareDialogFragment.this.dismiss();
                return;
            }
            if (shareData.m102994c() == ShareType.DOWNLOAD) {
                if (Build.VERSION.SDK_INT >= 29) {
                    ShareDialogFragment.this.m78638w0(shareData);
                    return;
                }
                ShareDialogFragment shareDialogFragment = ShareDialogFragment.this;
                C26945o c26945o = C26945o.f81848a;
                if (shareDialogFragment.m78633r0(c26945o.m105072c())) {
                    ShareDialogFragment.this.m78638w0(shareData);
                    return;
                } else {
                    ShareDialogFragment.this.requestPermissions(c26945o.m105072c(), 11);
                    return;
                }
            }
            if (shareData.m102994c() == ShareType.CHECKOUT) {
                InterfaceC18701a interfaceC18701a2 = ShareDialogFragment.this.shareItemCallback;
                if (interfaceC18701a2 != null) {
                    interfaceC18701a2.mo70524d(ShareDialogFragment.this.mSubjectId);
                }
                ShareDialogFragment.m78635t0(ShareDialogFragment.this, "checkout", null, 2, null);
                ShareDialogFragment.this.dismiss();
                return;
            }
            if (shareData.m102994c() != ShareType.REPORT) {
                ShareDialogFragment.this.m78638w0(shareData);
                return;
            }
            ShareDialogFragment.m78635t0(ShareDialogFragment.this, "report", null, 2, null);
            C25903a c25903a2 = C25903a.f79124a;
            Context contextRequireContext = ShareDialogFragment.this.requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            c25903a2.m101708e(contextRequireContext, ShareDialogFragment.this.reportType, ShareDialogFragment.this.mSubjectId, ShareDialogFragment.this.shareItemCallback);
            ShareDialogFragment.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.transsion.share.share.ShareDialogFragment$d */
    static final class C18700d implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f60374a;

        C18700d(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f60374a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f60374a;
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
            this.f60374a.invoke(obj);
        }
    }

    public ShareDialogFragment() {
        super(R$layout.player_share_dialog);
        this.logViewConfig = LazyKt.m97097b(new Function0() { // from class: pr.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareDialogFragment.m78605E0();
            }
        });
        this.mSubjectId = "";
        this.mShareTitle = "";
        this.mShareScore = "";
        this.mSource = "";
    }

    /* JADX INFO: renamed from: A0 */
    private final void m78601A0(ShareBean shareBean) {
        FragmentActivity activity;
        FragmentActivity activity2;
        ShareType shareType = shareBean != null ? shareBean.getShareType() : null;
        switch (shareType == null ? -1 : C18698b.f60371a[shareType.ordinal()]) {
            case 1:
                InterfaceC18701a interfaceC18701a = this.shareItemCallback;
                if (interfaceC18701a != null) {
                    InterfaceC18701a.a.m78647a(interfaceC18701a, this.mSubjectId, null, 2, null);
                }
                m78635t0(this, "delete ", null, 2, null);
                dismiss();
                break;
            case 2:
                InterfaceC18701a interfaceC18701a2 = this.shareItemCallback;
                if (interfaceC18701a2 != null) {
                    interfaceC18701a2.mo70523c(shareBean.getDownUrl(), shareBean.getTitle(), "", shareBean.getCoverUrl());
                }
                m78635t0(this, "download", null, 2, null);
                dismiss();
                break;
            case 3:
                String shortUrl = shareBean.getShortUrl();
                if (shortUrl != null) {
                    ClipData clipDataNewPlainText = ClipData.newPlainText("Simple test", shortUrl);
                    Context context = getContext();
                    Object systemService = context != null ? context.getSystemService("clipboard") : null;
                    Intrinsics.m97800f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ((ClipboardManager) systemService).setPrimaryClip(clipDataNewPlainText);
                    C25903a c25903a = C25903a.f79124a;
                    String string = getString(R$string.player_copy_link_success);
                    Intrinsics.m97801g(string, "getString(...)");
                    c25903a.m101709f(string);
                    dismiss();
                }
                InterfaceC18701a interfaceC18701a3 = this.shareItemCallback;
                if (interfaceC18701a3 != null) {
                    interfaceC18701a3.mo70525e(this.mSubjectId);
                }
                m78635t0(this, "copylink", null, 2, null);
                break;
            case 4:
                String shortUrl2 = shareBean.getShortUrl();
                if (shortUrl2 != null && (activity = getActivity()) != null) {
                    m78607H0("com.whatsapp", activity, shortUrl2, shareBean.getDesc(), shareBean.getTitle());
                }
                InterfaceC18701a interfaceC18701a4 = this.shareItemCallback;
                if (interfaceC18701a4 != null) {
                    interfaceC18701a4.mo70525e(this.mSubjectId);
                }
                m78635t0(this, "whatsup", null, 2, null);
                break;
            case 5:
                String shortUrl3 = shareBean.getShortUrl();
                if (shortUrl3 != null && (activity2 = getActivity()) != null) {
                    m78607H0("org.telegram.messenger", activity2, shortUrl3, shareBean.getDesc(), shareBean.getTitle());
                }
                InterfaceC18701a interfaceC18701a5 = this.shareItemCallback;
                if (interfaceC18701a5 != null) {
                    interfaceC18701a5.mo70525e(this.mSubjectId);
                }
                m78635t0(this, "Telegram", null, 2, null);
                break;
            case 6:
                InterfaceC18701a interfaceC18701a6 = this.shareItemCallback;
                if (interfaceC18701a6 != null) {
                    interfaceC18701a6.mo70524d(this.mSubjectId);
                }
                m78635t0(this, "checkout", null, 2, null);
                break;
        }
    }

    /* JADX INFO: renamed from: B0 */
    private final void m78602B0(View view) {
        View viewFindViewById = view.findViewById(R$id.iv_close);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: pr.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ShareDialogFragment.m78603C0(this.f81840a, view2);
                }
            });
        }
        this.shareList = (RecyclerView) view.findViewById(R$id.share_list);
        C26933c c26933c = new C26933c(m78632q0());
        RecyclerView recyclerView = this.shareList;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
            recyclerView.setAdapter(c26933c);
        }
        c26933c.m105064k(new C18699c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m78603C0(ShareDialogFragment shareDialogFragment, View view) {
        shareDialogFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final Unit m78604D0(ShareDialogFragment shareDialogFragment, ShareBean shareBean) {
        ShareType shareTypeM102994c;
        if (shareBean != null) {
            shareDialogFragment.m78601A0(shareBean);
            return Unit.f75682a;
        }
        C26383a c26383a = shareDialogFragment.mShareData;
        shareDialogFragment.m78601A0((c26383a == null || (shareTypeM102994c = c26383a.m102994c()) == null) ? null : shareDialogFragment.m78636u0(shareTypeM102994c));
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C24655b m78605E0() {
        return new C24655b("share_panel", false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final void m78606F0(ShareDialogFragment shareDialogFragment) {
        shareDialogFragment.m78639x0();
    }

    /* JADX INFO: renamed from: H0 */
    private final void m78607H0(String pkg, Activity activity, String shortUrl, String desc, String title) {
        if (!TextUtils.isEmpty(desc)) {
            shortUrl = desc + "\n" + shortUrl;
        }
        if (!TextUtils.isEmpty(title)) {
            shortUrl = title + "\n" + shortUrl;
        }
        if (TextUtils.equals(pkg, "com.whatsapp")) {
            C26946p.f81852a.m105080d(activity, shortUrl, new Function1() { // from class: pr.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShareDialogFragment.m78608I0(this.f81838a, ((Boolean) obj).booleanValue());
                }
            });
        } else if (TextUtils.equals(pkg, "org.telegram.messenger")) {
            C26946p.f81852a.m105079c(activity, shortUrl, new Function1() { // from class: pr.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ShareDialogFragment.m78609J0(this.f81839a, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final Unit m78608I0(ShareDialogFragment shareDialogFragment, boolean z11) {
        if (z11) {
            shareDialogFragment.dismissAllowingStateLoss();
        } else {
            C25903a c25903a = C25903a.f79124a;
            String string = shareDialogFragment.getString(R$string.tip_app_not_install);
            Intrinsics.m97801g(string, "getString(...)");
            c25903a.m101709f(string);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final Unit m78609J0(ShareDialogFragment shareDialogFragment, boolean z11) {
        if (z11) {
            shareDialogFragment.dismissAllowingStateLoss();
        } else {
            C25903a c25903a = C25903a.f79124a;
            String string = shareDialogFragment.getString(R$string.tip_app_not_install);
            Intrinsics.m97801g(string, "getString(...)");
            c25903a.m101709f(string);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: L0 */
    private final void m78610L0(FragmentManager fragmentManager, String tag) {
        try {
            fragmentManager.m14537g0();
            if (!isAdded() && fragmentManager.m14547k0(tag) == null) {
                show(fragmentManager, tag);
            }
        } catch (IllegalStateException e11) {
            e11.printStackTrace();
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: M0 */
    private final void m78611M0() {
        String string = getString(R$string.permission_deny_down_tip, "\"" + C25903a.f79124a.m101705b() + "\"", "\"" + getString(R$string.system_settings) + "\"");
        Intrinsics.m97801g(string, "getString(...)");
        C26945o c26945o = C26945o.f81848a;
        Context contextRequireContext = requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        c26945o.m105074f(contextRequireContext, "", string, new Function0() { // from class: pr.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareDialogFragment.m78612N0(this.f81843a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final Unit m78612N0(ShareDialogFragment shareDialogFragment) {
        C26945o c26945o = C26945o.f81848a;
        FragmentActivity activity = shareDialogFragment.getActivity();
        if (activity == null) {
            return Unit.f75682a;
        }
        C26945o.m105071j(c26945o, activity, 0, 2, null);
        return Unit.f75682a;
    }

    private final C24655b getLogViewConfig() {
        return (C24655b) this.logViewConfig.getValue();
    }

    private final void initViewModel() {
        C26096b c26096b = (C26096b) new C3227v0(this).m14969a(C26096b.class);
        c26096b.m102221g().m14851j(getViewLifecycleOwner(), new C18700d(new Function1() { // from class: pr.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareDialogFragment.m78604D0(this.f81841a, (ShareBean) obj);
            }
        }));
        this.actionViewModel = c26096b;
    }

    /* JADX INFO: renamed from: n0 */
    private final String m78629n0() {
        PostType postType = this.postType;
        switch (postType == null ? -1 : C18698b.f60372b[postType.ordinal()]) {
            case 1:
                return "/post/detail";
            case 2:
                return "/movie/detail";
            case 3:
                return "/room/detail";
            case 4:
                return "/movie/staff";
            case 5:
                return "/shorts/detail";
            case 6:
                return "/live/detail";
            case 7:
                return "/ugc_video/detail";
            case 8:
                return "/ugc_shorts/detail";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: o0 */
    private final String m78630o0() {
        String string;
        PostType postType = this.postType;
        int i11 = postType == null ? -1 : C18698b.f60372b[postType.ordinal()];
        if (i11 == 1) {
            Context context = getContext();
            string = context != null ? context.getString(R$string.share_long_link_post_s) : null;
            Intrinsics.m97799e(string);
            return string;
        }
        if (i11 == 2) {
            Context context2 = getContext();
            string = context2 != null ? context2.getString(R$string.share_long_link_sub_no_duration, this.mShareTitle, this.mShareScore) : null;
            Intrinsics.m97799e(string);
            return string;
        }
        if (i11 != 3) {
            return "";
        }
        Context context3 = getContext();
        string = context3 != null ? context3.getString(R$string.share_long_link_group_s) : null;
        Intrinsics.m97799e(string);
        return string;
    }

    /* JADX INFO: renamed from: p0 */
    private final String m78631p0() {
        String strM101706c = C25903a.f79124a.m101706c();
        if (TextUtils.isEmpty(strM101706c)) {
            strM101706c = "0";
        }
        String strM111993b = C29182a.f89053a.m111993b();
        String strM78629n0 = m78629n0();
        Context context = getContext();
        String packageName = context != null ? context.getPackageName() : null;
        String str = strM111993b + "?type=" + strM78629n0 + "&package_name=" + packageName + "&id=" + this.mSubjectId + "&uid=" + strM101706c;
        C26866a.a.m104898f(C26866a.f81698a, "ShareDialogFragment", "share long link:" + str, false, 4, null);
        return str;
    }

    /* JADX INFO: renamed from: q0 */
    private final List m78632q0() {
        String str;
        String string;
        ArrayList arrayList = new ArrayList();
        ShareType shareType = ShareType.WHATSAPP;
        int i11 = R$mipmap.share_ic_whatsapp;
        String string2 = getString(R$string.player_whatsapp);
        Intrinsics.m97801g(string2, "getString(...)");
        arrayList.add(new C26383a(shareType, i11, string2));
        ShareType shareType2 = ShareType.TELEGRAM;
        int i12 = R$mipmap.share_ic_telegram;
        String string3 = getString(R$string.player_telegram);
        Intrinsics.m97801g(string3, "getString(...)");
        arrayList.add(new C26383a(shareType2, i12, string3));
        ShareType shareType3 = ShareType.COPY_LINK;
        int i13 = R$mipmap.share_ic_copy_link;
        String string4 = getString(R$string.share_copy_link);
        Intrinsics.m97801g(string4, "getString(...)");
        arrayList.add(new C26383a(shareType3, i13, string4));
        if (this.isDownload) {
            String str2 = this.downloadName;
            if (str2 == null || str2.length() == 0) {
                string = getString(R$string.player_download);
            } else {
                string = this.downloadName;
                if (string == null) {
                    string = getString(R$string.player_download);
                    Intrinsics.m97801g(string, "getString(...)");
                }
            }
            Intrinsics.m97799e(string);
            arrayList.add(new C26383a(ShareType.DOWNLOAD, R$mipmap.share_ic_download, string));
        }
        if (this.isDelete) {
            ShareType shareType4 = ShareType.DELETE;
            int i14 = R$mipmap.share_ic_delete;
            String string5 = getString(R$string.player_delete);
            Intrinsics.m97801g(string5, "getString(...)");
            arrayList.add(new C26383a(shareType4, i14, string5));
        }
        if (this.isCheckOut) {
            ShareType shareType5 = ShareType.CHECKOUT;
            int i15 = R$mipmap.share_ic_checkout;
            String string6 = getString(R$string.player_check_out);
            Intrinsics.m97801g(string6, "getString(...)");
            arrayList.add(new C26383a(shareType5, i15, string6));
        }
        if (!Intrinsics.m97797c(C25903a.f79124a.m101706c(), this.authorId) && (str = this.reportType) != null && str.length() != 0) {
            ShareType shareType6 = ShareType.REPORT;
            int i16 = R$mipmap.share_ic_report;
            String string7 = getString(R$string.player_report);
            Intrinsics.m97801g(string7, "getString(...)");
            arrayList.add(new C26383a(shareType6, i16, string7));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public final boolean m78633r0(String[] permissions) {
        return PermissionUtils.m27213s((String[]) Arrays.copyOf(permissions, permissions.length));
    }

    /* JADX INFO: renamed from: s0 */
    private final void m78634s0(String action, String failMsg) {
        HashMap map = new HashMap();
        map.put("module_name", action);
        if (failMsg != null) {
        }
        map.put(m78637v0(), this.mSubjectId);
        String str = this.ops;
        if (str == null) {
            str = "";
        }
        map.put("ops", str);
        C24662i.f75350a.m96881p("share_panel", map);
    }

    /* JADX INFO: renamed from: t0 */
    static /* synthetic */ void m78635t0(ShareDialogFragment shareDialogFragment, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        shareDialogFragment.m78634s0(str, str2);
    }

    /* JADX INFO: renamed from: u0 */
    private final ShareBean m78636u0(ShareType shareType) {
        ShareBean shareBean = new ShareBean();
        shareBean.setShareType(shareType);
        shareBean.setShortUrl(m78631p0());
        shareBean.setDesc(m78630o0());
        return shareBean;
    }

    /* JADX INFO: renamed from: v0 */
    private final String m78637v0() {
        String str = this.mSource;
        switch (str.hashCode()) {
            case -1348386821:
                return !str.equals("UGCVideoDetail") ? "post_id" : "ugc_video_id";
            case 584244349:
                return !str.equals("subjectdetail") ? "post_id" : "subject_id";
            case 1232204688:
                return !str.equals("groupdetail") ? "post_id" : "group_id";
            case 2036233184:
                return !str.equals("usercenter") ? "post_id" : "host_uid";
            case 2092022001:
                str.equals("postdetail");
                return "post_id";
            default:
                return "post_id";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public final void m78638w0(C26383a shareData) {
        String string;
        if (shareData == null) {
            return;
        }
        C27287m c27287m = C27287m.f83003a;
        if (!c27287m.m106330e() && (shareData.m102994c() == ShareType.DELETE || shareData.m102994c() == ShareType.DOWNLOAD)) {
            C25903a c25903a = C25903a.f79124a;
            String string2 = getString(R$string.player_no_network_tip2);
            Intrinsics.m97801g(string2, "getString(...)");
            c25903a.m101709f(string2);
            return;
        }
        if (!c27287m.m106330e()) {
            m78601A0(m78636u0(shareData.m102994c()));
            return;
        }
        this.shareDataStartTime = System.currentTimeMillis();
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("subjectId")) == null) {
            string = "";
        }
        this.mSubjectId = string;
        String strM101706c = C25903a.f79124a.m101706c();
        if (TextUtils.isEmpty(strM101706c)) {
            strM101706c = "0";
        }
        if (shareData.m102994c() == ShareType.TELEGRAM) {
            str = "Telegram";
        } else if (shareData.m102994c() == ShareType.WHATSAPP) {
            str = "WhatsApp";
        }
        String str2 = str;
        C26096b c26096b = this.actionViewModel;
        if (c26096b != null) {
            c26096b.m102222h(shareData.m102994c(), m78629n0(), this.mSubjectId, strM101706c == null ? "0" : strM101706c, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX INFO: renamed from: x0 */
    private final void m78639x0() {
        Window window;
        final View decorView;
        final View view;
        ViewGroup viewGroup;
        Drawable background;
        Drawable background2;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null || (view = getView()) == null) {
            return;
        }
        Intrinsics.m97801g(requireContext(), "requireContext(...)");
        final int iM27349a = AbstractC5781d.m27349a();
        boolean z11 = view instanceof ViewGroup;
        if (z11) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            viewGroup2.setFitsSystemWindows(false);
            if (viewGroup2.getBackground() == null) {
                View childAt = viewGroup2.getChildCount() > 0 ? viewGroup2.getChildAt(0) : null;
                if (childAt == null || (background2 = childAt.getBackground()) == null) {
                    view.setBackgroundColor(0);
                } else {
                    viewGroup2.setBackground(background2);
                }
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(decorView, new OnApplyWindowInsetsListener() { // from class: pr.k
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return ShareDialogFragment.m78640y0(iM27349a, view, view2, windowInsetsCompat);
            }
        });
        if (iM27349a > 0) {
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) view;
                if (viewGroup3.getChildCount() > 0) {
                    View childAt2 = viewGroup3.getChildAt(0);
                    if (childAt2 instanceof ViewGroup) {
                        viewGroup = (ViewGroup) childAt2;
                    } else {
                        viewGroup = null;
                    }
                } else if (z11) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
            } else if (z11) {
                viewGroup = (ViewGroup) view;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                int paddingLeft = viewGroup.getPaddingLeft();
                int paddingTop = viewGroup.getPaddingTop();
                int paddingRight = viewGroup.getPaddingRight();
                int paddingBottom = viewGroup.getPaddingBottom();
                if (paddingBottom >= iM27349a) {
                    iM27349a = paddingBottom;
                }
                if (viewGroup.getPaddingBottom() != iM27349a) {
                    viewGroup.setPadding(paddingLeft, paddingTop, paddingRight, iM27349a);
                }
            }
            if (z11) {
                ViewGroup viewGroup4 = (ViewGroup) view;
                if (viewGroup4.getBackground() == null) {
                    View childAt3 = viewGroup4.getChildCount() > 0 ? viewGroup4.getChildAt(0) : null;
                    if (childAt3 != null && (background = childAt3.getBackground()) != null) {
                        viewGroup4.setBackground(background);
                    }
                }
            }
        }
        ViewCompat.requestApplyInsets(decorView);
        decorView.postDelayed(new Runnable() { // from class: pr.l
            @Override // java.lang.Runnable
            public final void run() {
                ShareDialogFragment.m78641z0(decorView);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX INFO: renamed from: y0 */
    public static final WindowInsetsCompat m78640y0(int i11, View view, View v11, WindowInsetsCompat insets) {
        Intrinsics.m97802h(v11, "v");
        Intrinsics.m97802h(insets, "insets");
        C29093c insets2 = insets.getInsets(WindowInsetsCompat.Type.navigationBars());
        Intrinsics.m97801g(insets2, "getInsets(...)");
        C29093c insets3 = insets.getInsets(WindowInsetsCompat.Type.systemGestures());
        Intrinsics.m97801g(insets3, "getInsets(...)");
        int i12 = insets2.f88818d;
        if (i12 > 0 || (i12 = insets3.f88818d) > 0) {
            i11 = i12;
        } else if (i11 <= 0) {
            i11 = 0;
        }
        v11.setPadding(0, 0, 0, 0);
        if (i11 > 0) {
            boolean z11 = view instanceof ViewGroup;
            ViewGroup viewGroup = null;
            if (z11) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                if (viewGroup2.getChildCount() > 0) {
                    View childAt = viewGroup2.getChildAt(0);
                    if (childAt instanceof ViewGroup) {
                        viewGroup = (ViewGroup) childAt;
                    }
                } else if (z11) {
                    viewGroup = (ViewGroup) view;
                }
            } else if (z11) {
                viewGroup = (ViewGroup) view;
            }
            if (viewGroup != null) {
                int paddingLeft = viewGroup.getPaddingLeft();
                int paddingTop = viewGroup.getPaddingTop();
                int paddingRight = viewGroup.getPaddingRight();
                int paddingBottom = viewGroup.getPaddingBottom();
                if (paddingBottom >= i11) {
                    i11 = paddingBottom;
                }
                if (viewGroup.getPaddingBottom() != i11) {
                    viewGroup.setPadding(paddingLeft, paddingTop, paddingRight, i11);
                }
            }
        }
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m78641z0(View view) {
        ViewCompat.requestApplyInsets(view);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m78642G0(InterfaceC18701a callback) {
        Intrinsics.m97802h(callback, "callback");
        this.shareItemCallback = callback;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m78643K0(Context context, String tag) {
        if (context instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
                return;
            }
            try {
                FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
                Intrinsics.m97801g(supportFragmentManager, "getSupportFragmentManager(...)");
                m78610L0(supportFragmentManager, tag);
            } catch (IllegalStateException e11) {
                e11.printStackTrace();
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.m97802h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R$style.shareDialogTheme);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.m97801g(dialogOnCreateDialog, "onCreateDialog(...)");
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(R$style.share_dialog_animations);
            window.setGravity(80);
            window.setDimAmount(0.5f);
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes == null) {
                attributes = new WindowManager.LayoutParams();
            }
            attributes.width = -1;
            window.setBackgroundDrawable(null);
            window.setAttributes(attributes);
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig == null || !logViewConfig.m96841d()) {
            return;
        }
        C24662i.f75350a.m96870B(logViewConfig);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.m97802h(permissions, "permissions");
        Intrinsics.m97802h(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 11) {
            if (!C26945o.f81848a.m105076k(grantResults)) {
                m78611M0();
                return;
            }
            C26383a c26383a = this.mShareData;
            if (c26383a != null) {
                m78638w0(c26383a);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96852o(SystemClock.elapsedRealtime());
            if (logViewConfig.m96840c()) {
                C24662i.f75350a.m96871C(logViewConfig);
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Dialog dialog;
        Window window;
        super.onStart();
        if (Build.VERSION.SDK_INT < 35 || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.setNavigationBarColor(0);
        window.setStatusBarColor(0);
        window.getDecorView().post(new Runnable() { // from class: pr.i
            @Override // java.lang.Runnable
            public final void run() {
                ShareDialogFragment.m78606F0(this.f81842a);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String string;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.isDelete = arguments != null && arguments.getBoolean("subject_delete");
        Bundle arguments2 = getArguments();
        this.isDownload = arguments2 != null && arguments2.getBoolean("subject_download");
        Bundle arguments3 = getArguments();
        this.isCheckOut = arguments3 != null && arguments3.getBoolean("subject_checkout");
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (string = arguments4.getString("subjectId")) == null) {
            string = "";
        }
        this.mSubjectId = string;
        Bundle arguments5 = getArguments();
        this.postType = (PostType) (arguments5 != null ? arguments5.getSerializable("postType") : null);
        Bundle arguments6 = getArguments();
        this.mShareTitle = String.valueOf(arguments6 != null ? arguments6.getString("share_title") : null);
        Bundle arguments7 = getArguments();
        this.mShareScore = String.valueOf(arguments7 != null ? arguments7.getString("share_score") : null);
        Bundle arguments8 = getArguments();
        this.mSource = String.valueOf(arguments8 != null ? arguments8.getString(EventConstants.KEY_SOURCE) : null);
        Bundle arguments9 = getArguments();
        this.authorId = arguments9 != null ? arguments9.getString("author_id") : null;
        Bundle arguments10 = getArguments();
        this.reportType = arguments10 != null ? arguments10.getString("report_type") : null;
        Bundle arguments11 = getArguments();
        this.ops = arguments11 != null ? arguments11.getString("ops") : null;
        Bundle arguments12 = getArguments();
        this.downloadName = arguments12 != null ? arguments12.getString("download_name") : null;
        m78602B0(view);
        initViewModel();
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 != null) {
            logViewConfig2.m96849l(false);
        }
    }
}
