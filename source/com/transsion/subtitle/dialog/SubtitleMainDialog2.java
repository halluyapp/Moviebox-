package com.transsion.subtitle.dialog;

import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.os.AbstractC2411d;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import com.avery.subtitle.widget.SimpleSubtitleView;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.Utils;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.gyf.immersionbar.BarHide;
import com.gyf.immersionbar.ImmersionBar;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baseui.dialog.BaseDialog;
import com.transsion.moviedetailapi.bean.DubsInfo;
import com.transsion.subtitle.C19655a;
import com.transsion.subtitle.InterfaceC19714h;
import com.transsion.subtitle.R$id;
import com.transsion.subtitle.R$layout;
import com.transsion.subtitle.R$string;
import com.transsion.subtitle.dialog.SubtitleMainDialog2;
import com.transsion.subtitle.fragment.AudioSelectListFragment;
import com.transsion.subtitle.fragment.NoSubtitleTipFragment;
import com.transsion.subtitle.fragment.SubtitleBaseFragment;
import com.transsion.subtitle.fragment.SubtitleOptionsFragment;
import com.transsion.subtitle.fragment.SubtitleSearchDownloadFragment;
import com.transsion.subtitle.fragment.SubtitleSelectListFragment;
import com.transsion.subtitle.fragment.SubtitleSyncAdjustFragment;
import com.transsion.subtitle.helper.LocalVideoUiType;
import com.transsion.subtitle.helper.SubtitleSearchHelper;
import com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel;
import com.transsnet.downloader.R$style;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import mu.InterfaceC25910b;
import ng.AbstractC26006c;
import p550kj.C24662i;
import p559ku.C25431a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 \u0081\u00012\u00020\u0001:\u0002\u0082\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020%H\u0016¢\u0006\u0004\b*\u0010(J-\u0010/\u001a\u0004\u0018\u00010\f2\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b/\u00100J!\u00101\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\b2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\b2\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b9\u0010:J#\u0010@\u001a\u00020\b2\u0006\u0010<\u001a\u00020;2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=¢\u0006\u0004\b@\u0010AJ2\u0010G\u001a\u00020\b2#\u0010F\u001a\u001f\u0012\u0013\u0012\u00110>¢\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(E\u0012\u0004\u0012\u00020\b\u0018\u00010B¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\b2\b\u0010F\u001a\u0004\u0018\u00010I¢\u0006\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010T\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00020!0=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u001c\u0010]\u001a\b\u0012\u0004\u0012\u00020>0[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010YR\u0016\u0010_\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010VR\u0018\u0010a\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010SR3\u0010d\u001a\u001f\u0012\u0013\u0012\u00110>¢\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(E\u0012\u0004\u0012\u00020\b\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010f\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010VR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010l\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010SR\u0018\u0010p\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010r\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010oR\u0018\u0010t\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010oR\u0018\u0010v\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010oR\u0018\u0010x\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010oR\u0018\u0010{\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010}\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010SR\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007f¨\u0006\u0083\u0001"}, m97100d2 = {"Lcom/transsion/subtitle/dialog/SubtitleMainDialog2;", "Lcom/transsion/baseui/dialog/BaseDialog;", "<init>", "()V", "Lcom/transsion/subtitle/helper/LocalVideoUiType;", "layerType", "", "playerContainerHeight", "", "H0", "(Lcom/transsion/subtitle/helper/LocalVideoUiType;Ljava/lang/Integer;)V", "initViewModel", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "y0", "(Landroid/view/View;)V", "E0", "", NativeComponentConstants.KEY_COMPONENT_TYPE, "w0", "(Ljava/lang/String;)V", "K0", "L0", "M0", "N0", "x0", "t0", "Lcom/transsion/subtitle/fragment/AudioSelectListFragment;", "u0", "()Lcom/transsion/subtitle/fragment/AudioSelectListFragment;", "Landroidx/fragment/app/Fragment;", "v0", "(Ljava/lang/String;)Landroidx/fragment/app/Fragment;", "Lcom/transsion/moviedetailapi/bean/DubsInfo;", "dubsInfo", "D0", "(Lcom/transsion/moviedetailapi/bean/DubsInfo;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "Lcom/transsion/baselib/db/download/DownloadBean;", "downloadBean", "G0", "(Lcom/transsion/baselib/db/download/DownloadBean;)V", "", "isOff", "", "Lju/a;", "list", "I0", "(ZLjava/util/List;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "bean", "callback", "J0", "(Lkotlin/jvm/functions/Function1;)V", "Lmu/b;", "F0", "(Lmu/b;)V", "Lcom/transsion/subtitle/viewmodel/SubtitleDownloadViewModel;", "c", "Lcom/transsion/subtitle/viewmodel/SubtitleDownloadViewModel;", "viewModel", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsion/baselib/db/download/DownloadBean;", "e", "Ljava/lang/String;", "pageName", "f", "Z", "isLand", "g", "Ljava/util/List;", "dubs", "", "h", "subtitleDataList", "i", "subtitleIsOff", "j", "searchName", CampaignEx.JSON_KEY_AD_K, "Lkotlin/jvm/functions/Function1;", "subtitleSelectFromSearch", "l", "isVideoStartCheck", "m", "Lcom/transsion/subtitle/helper/LocalVideoUiType;", "n", "Ljava/lang/Integer;", "o", TmcStartParams.KEY_FRAGMENT_TYPE, "Landroid/widget/FrameLayout;", TtmlNode.TAG_P, "Landroid/widget/FrameLayout;", "flAudioContainer", CampaignEx.JSON_KEY_AD_Q, "flSubtitleContainer", CampaignEx.JSON_KEY_AD_R, "flStyleContainer", "s", "flSearchContainer", "t", "flSyncAdjustContainer", TmcStartParams.KEY_URL_SHORT, "Lmu/b;", "mCallback", "v", "currentSubtitleType", "w", "Lcom/transsion/moviedetailapi/bean/DubsInfo;", "switchedDubsInfo", "x", "a", "VideoSubtitle_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class SubtitleMainDialog2 extends BaseDialog {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private SubtitleDownloadViewModel viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private DownloadBean downloadBean;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isLand;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String searchName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private Function1 subtitleSelectFromSearch;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private LocalVideoUiType layerType;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private Integer playerContainerHeight;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private FrameLayout flAudioContainer;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private FrameLayout flSubtitleContainer;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private FrameLayout flStyleContainer;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private FrameLayout flSearchContainer;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private FrameLayout flSyncAdjustContainer;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private InterfaceC25910b mCallback;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private DubsInfo switchedDubsInfo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private List dubs = CollectionsKt.m97506l();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private List subtitleDataList = new ArrayList();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean subtitleIsOff = true;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isVideoStartCheck = true;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private String fragmentType = "SELECT_SUBTITLE";

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private String currentSubtitleType = "";

    /* JADX INFO: renamed from: com.transsion.subtitle.dialog.SubtitleMainDialog2$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SubtitleMainDialog2 m81998a(boolean z11, boolean z12, List dubs, DownloadBean downloadBean, String str) {
            Intrinsics.m97802h(dubs, "dubs");
            SubtitleMainDialog2 subtitleMainDialog2 = new SubtitleMainDialog2();
            subtitleMainDialog2.dubs = dubs;
            subtitleMainDialog2.m81995G0(downloadBean);
            subtitleMainDialog2.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("EXTRA_FRAGMENT_TYPE", "NO_SUBTITLE"), TuplesKt.m97108a("KEY_VIDEO_START_CHECK", Boolean.valueOf(z12)), TuplesKt.m97108a("EXTRA_IS_LAND", Boolean.valueOf(z11)), TuplesKt.m97108a("KEY_PAGE_NAME", str)));
            return subtitleMainDialog2;
        }

        /* JADX INFO: renamed from: b */
        public final SubtitleMainDialog2 m81999b(boolean z11, boolean z12, List list, List dubs, DownloadBean downloadBean, LocalVideoUiType layerType, Integer num, String str) {
            Intrinsics.m97802h(list, "list");
            Intrinsics.m97802h(dubs, "dubs");
            Intrinsics.m97802h(layerType, "layerType");
            SubtitleMainDialog2 subtitleMainDialog2 = new SubtitleMainDialog2();
            subtitleMainDialog2.dubs = dubs;
            subtitleMainDialog2.m81995G0(downloadBean);
            subtitleMainDialog2.m81996I0(z12, list);
            subtitleMainDialog2.m81976H0(layerType, num);
            subtitleMainDialog2.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("EXTRA_FRAGMENT_TYPE", "SELECT_SUBTITLE"), TuplesKt.m97108a("EXTRA_IS_LAND", Boolean.valueOf(z11)), TuplesKt.m97108a("KEY_PAGE_NAME", str)));
            if (downloadBean != null) {
                InterfaceC19714h.f62935a.m82148b().mo81947i(downloadBean);
            }
            return subtitleMainDialog2;
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.dialog.SubtitleMainDialog2$b */
    static final class C19663b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f62814a;

        C19663b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f62814a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f62814a;
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
            this.f62814a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x003d  */
    /* JADX INFO: renamed from: A0 */
    public static final Unit m81971A0(SubtitleMainDialog2 subtitleMainDialog2, SubtitleDownloadViewModel subtitleDownloadViewModel, String str) {
        if (str == null) {
            Intrinsics.m97799e(str);
            subtitleMainDialog2.m81977K0(str);
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != -36909585) {
                if (iHashCode != 767768588) {
                    if (iHashCode == 1814388055 && str.equals("SUBTITLE_OPTIONS")) {
                        subtitleMainDialog2.m81978L0(str);
                    } else {
                        Intrinsics.m97799e(str);
                        subtitleMainDialog2.m81977K0(str);
                    }
                } else if (str.equals("SUBTITLE_SYNC_ADJUST")) {
                    subtitleMainDialog2.m81980N0(str);
                } else {
                    Intrinsics.m97799e(str);
                    subtitleMainDialog2.m81977K0(str);
                }
            } else if (str.equals("DOWNLOAD_SUBTITLE")) {
                subtitleMainDialog2.m81979M0(str);
            } else {
                Intrinsics.m97799e(str);
                subtitleMainDialog2.m81977K0(str);
            }
        }
        Intrinsics.m97799e(str);
        subtitleMainDialog2.currentSubtitleType = str;
        C19655a.f62783a.m81952a(subtitleDownloadViewModel.getClass().getSimpleName() + " --> createFragment() --> type = " + str + " --> currentSubtitleType = " + subtitleMainDialog2.currentSubtitleType);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final Unit m81972B0(SubtitleMainDialog2 subtitleMainDialog2, String str) {
        subtitleMainDialog2.searchName = str;
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m81973C0(SubtitleMainDialog2 subtitleMainDialog2, View view) {
        subtitleMainDialog2.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: D0 */
    private final void m81974D0(DubsInfo dubsInfo) {
        String subjectId;
        String resourceId;
        String lanCode;
        String lanName;
        String str = this.pageName;
        if (str == null || str.length() == 0) {
            return;
        }
        boolean z11 = dubsInfo != null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DownloadBean downloadBean = this.downloadBean;
        String str2 = "";
        if (downloadBean == null || (subjectId = downloadBean.getSubjectId()) == null) {
            subjectId = "";
        }
        linkedHashMap.put("subject_id", subjectId);
        DownloadBean downloadBean2 = this.downloadBean;
        if (downloadBean2 == null || (resourceId = downloadBean2.getResourceId()) == null) {
            resourceId = "";
        }
        linkedHashMap.put("resource_id", resourceId);
        if (dubsInfo == null || (lanCode = dubsInfo.getLanCode()) == null) {
            lanCode = "";
        }
        linkedHashMap.put("lan_code", lanCode);
        if (dubsInfo != null && (lanName = dubsInfo.getLanName()) != null) {
            str2 = lanName;
        }
        linkedHashMap.put("lan_name", str2);
        linkedHashMap.put("result", z11 ? "1" : "0");
        C24662i c24662i = C24662i.f75350a;
        String str3 = this.pageName;
        Intrinsics.m97799e(str3);
        c24662i.m96884s(str3, "audio_switch", linkedHashMap);
    }

    /* JADX INFO: renamed from: E0 */
    private final void m81975E0() {
        DownloadBean downloadBean = this.downloadBean;
        String subjectId = downloadBean != null ? downloadBean.getSubjectId() : null;
        Application applicationM27275a = Utils.m27275a();
        DubsInfo dubsInfo = new DubsInfo(subjectId, applicationM27275a != null ? applicationM27275a.getString(R$string.audio_default) : null, null, false);
        dubsInfo.setSelected(true);
        if (this.dubs.isEmpty()) {
            this.dubs = CollectionsKt.m97499e(dubsInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public final void m81976H0(LocalVideoUiType layerType, Integer playerContainerHeight) {
        this.layerType = layerType;
        this.playerContainerHeight = playerContainerHeight;
    }

    /* JADX INFO: renamed from: K0 */
    private final void m81977K0(String type) {
        m81990w0(type);
        m81991x0();
        m81987t0();
        Fragment fragmentM14547k0 = getChildFragmentManager().m14547k0(type);
        if (fragmentM14547k0 == null) {
            fragmentM14547k0 = m81989v0(type);
        }
        if (fragmentM14547k0.isAdded()) {
            getChildFragmentManager().m14557p().mo14681y(fragmentM14547k0).mo14673l();
        } else {
            getChildFragmentManager().m14557p().m14806c(R$id.fl_subtitle_container, fragmentM14547k0, type).mo14673l();
        }
    }

    /* JADX INFO: renamed from: L0 */
    private final void m81978L0(String type) {
        m81990w0(type);
        Fragment fragmentM14547k0 = getChildFragmentManager().m14547k0(type);
        if (fragmentM14547k0 == null) {
            fragmentM14547k0 = m81989v0(type);
        }
        if (fragmentM14547k0.isAdded()) {
            getChildFragmentManager().m14557p().mo14681y(fragmentM14547k0).mo14673l();
        } else {
            getChildFragmentManager().m14557p().m14806c(R$id.flStyleContainer, fragmentM14547k0, type).mo14673l();
        }
    }

    /* JADX INFO: renamed from: M0 */
    private final void m81979M0(String type) {
        m81990w0(type);
        Fragment fragmentM14547k0 = getChildFragmentManager().m14547k0(type);
        if (fragmentM14547k0 == null) {
            fragmentM14547k0 = m81989v0(type);
        }
        SubtitleSearchDownloadFragment subtitleSearchDownloadFragment = fragmentM14547k0 instanceof SubtitleSearchDownloadFragment ? (SubtitleSearchDownloadFragment) fragmentM14547k0 : null;
        if (subtitleSearchDownloadFragment != null) {
            subtitleSearchDownloadFragment.m82044z0(this.subtitleSelectFromSearch, this.currentSubtitleType);
        }
        if (fragmentM14547k0.isAdded()) {
            getChildFragmentManager().m14557p().mo14681y(fragmentM14547k0).mo14673l();
        } else {
            getChildFragmentManager().m14557p().m14806c(R$id.flSearchContainer, fragmentM14547k0, type).mo14673l();
        }
    }

    /* JADX INFO: renamed from: N0 */
    private final void m81980N0(String type) {
        m81990w0(type);
        Fragment fragmentM14547k0 = getChildFragmentManager().m14547k0(type);
        if (fragmentM14547k0 == null) {
            fragmentM14547k0 = m81989v0(type);
        }
        if (fragmentM14547k0.isAdded()) {
            getChildFragmentManager().m14557p().mo14681y(fragmentM14547k0).mo14673l();
        } else {
            getChildFragmentManager().m14557p().m14806c(R$id.flSyncAdjustContainer, fragmentM14547k0, type).mo14673l();
        }
    }

    private final void initViewModel() {
        final SubtitleDownloadViewModel subtitleDownloadViewModel = (SubtitleDownloadViewModel) new C3227v0(this).m14969a(SubtitleDownloadViewModel.class);
        subtitleDownloadViewModel.m82249h().m14851j(this, new C19663b(new Function1() { // from class: lu.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubtitleMainDialog2.m81971A0(this.f78019a, subtitleDownloadViewModel, (String) obj);
            }
        }));
        subtitleDownloadViewModel.m82255n().m14851j(this, new C19663b(new Function1() { // from class: lu.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubtitleMainDialog2.m81972B0(this.f78021a, (String) obj);
            }
        }));
        this.viewModel = subtitleDownloadViewModel;
    }

    /* JADX INFO: renamed from: t0 */
    private final void m81987t0() {
        if (this.dubs.isEmpty()) {
            return;
        }
        Fragment fragmentM14547k0 = getChildFragmentManager().m14547k0("SELECT_AUDIO");
        if (fragmentM14547k0 == null) {
            fragmentM14547k0 = m81988u0();
        }
        if (fragmentM14547k0.isAdded()) {
            getChildFragmentManager().m14557p().mo14681y(fragmentM14547k0).mo14673l();
        } else if (this.flAudioContainer != null) {
            getChildFragmentManager().m14557p().m14806c(R$id.fl_audio_container, fragmentM14547k0, "SELECT_AUDIO").mo14673l();
        }
    }

    /* JADX INFO: renamed from: u0 */
    private final AudioSelectListFragment m81988u0() {
        AudioSelectListFragment audioSelectListFragmentM82006a = AudioSelectListFragment.INSTANCE.m82006a(this.dubs, this.downloadBean, this.pageName);
        audioSelectListFragmentM82006a.m82005j0(this.mCallback);
        return audioSelectListFragmentM82006a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: v0 */
    private final Fragment m81989v0(String type) {
        switch (type.hashCode()) {
            case -1109352453:
                if (type.equals("SELECT_SUBTITLE")) {
                    SubtitleSelectListFragment subtitleSelectListFragmentM82130a = SubtitleSelectListFragment.INSTANCE.m82130a(this.subtitleDataList, this.isLand, this.downloadBean, this.pageName);
                    subtitleSelectListFragmentM82130a.m82128J0(this.mCallback);
                    return subtitleSelectListFragmentM82130a;
                }
                break;
            case 767768588:
                if (type.equals("SUBTITLE_SYNC_ADJUST")) {
                    SubtitleSyncAdjustFragment subtitleSyncAdjustFragment = new SubtitleSyncAdjustFragment();
                    subtitleSyncAdjustFragment.m82142m0(this.mCallback);
                    return subtitleSyncAdjustFragment;
                }
                break;
            case 1814388055:
                if (type.equals("SUBTITLE_OPTIONS")) {
                    SubtitleOptionsFragment.Companion c19669a = SubtitleOptionsFragment.INSTANCE;
                    LocalVideoUiType localVideoUiType = this.layerType;
                    Integer num = this.playerContainerHeight;
                    InterfaceC25910b interfaceC25910b = this.mCallback;
                    SimpleSubtitleView simpleSubtitleViewMo81902d = interfaceC25910b != null ? interfaceC25910b.mo81902d() : null;
                    InterfaceC25910b interfaceC25910b2 = this.mCallback;
                    SimpleSubtitleView simpleSubtitleViewMo81899a = interfaceC25910b2 != null ? interfaceC25910b2.mo81899a() : null;
                    InterfaceC25910b interfaceC25910b3 = this.mCallback;
                    ViewGroup subtitleViewGroup = interfaceC25910b3 != null ? interfaceC25910b3.getSubtitleViewGroup() : null;
                    InterfaceC25910b interfaceC25910b4 = this.mCallback;
                    return c19669a.m82023a(localVideoUiType, num, simpleSubtitleViewMo81902d, simpleSubtitleViewMo81899a, subtitleViewGroup, interfaceC25910b4 != null ? interfaceC25910b4.mo81907i() : null, this.pageName);
                }
                break;
            case 2039663830:
                if (type.equals("NO_SUBTITLE")) {
                    return NoSubtitleTipFragment.INSTANCE.m82012a(this.isVideoStartCheck, SubtitleSearchHelper.f62938c.m82160a().m82158e(this.downloadBean), this.pageName);
                }
                break;
        }
        SubtitleSearchDownloadFragment subtitleSearchDownloadFragmentM82045a = SubtitleSearchDownloadFragment.INSTANCE.m82045a(this.searchName, this.downloadBean, this.pageName);
        subtitleSearchDownloadFragmentM82045a.m82044z0(this.subtitleSelectFromSearch, this.currentSubtitleType);
        return subtitleSearchDownloadFragmentM82045a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: w0 */
    private final void m81990w0(String type) {
        switch (type.hashCode()) {
            case -1109352453:
                if (!type.equals("SELECT_SUBTITLE")) {
                    return;
                }
                break;
            case -36909585:
                if (type.equals("DOWNLOAD_SUBTITLE")) {
                    FrameLayout frameLayout = this.flSubtitleContainer;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                    }
                    FrameLayout frameLayout2 = this.flAudioContainer;
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(8);
                    }
                    FrameLayout frameLayout3 = this.flStyleContainer;
                    if (frameLayout3 != null) {
                        frameLayout3.setVisibility(8);
                    }
                    FrameLayout frameLayout4 = this.flSyncAdjustContainer;
                    if (frameLayout4 != null) {
                        frameLayout4.setVisibility(8);
                    }
                    FrameLayout frameLayout5 = this.flSearchContainer;
                    if (frameLayout5 != null) {
                        frameLayout5.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 767768588:
                if (type.equals("SUBTITLE_SYNC_ADJUST")) {
                    FrameLayout frameLayout6 = this.flSubtitleContainer;
                    if (frameLayout6 != null) {
                        frameLayout6.setVisibility(8);
                    }
                    FrameLayout frameLayout7 = this.flAudioContainer;
                    if (frameLayout7 != null) {
                        frameLayout7.setVisibility(8);
                    }
                    FrameLayout frameLayout8 = this.flStyleContainer;
                    if (frameLayout8 != null) {
                        frameLayout8.setVisibility(8);
                    }
                    FrameLayout frameLayout9 = this.flSearchContainer;
                    if (frameLayout9 != null) {
                        frameLayout9.setVisibility(8);
                    }
                    FrameLayout frameLayout10 = this.flSyncAdjustContainer;
                    if (frameLayout10 != null) {
                        frameLayout10.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 1814388055:
                if (type.equals("SUBTITLE_OPTIONS")) {
                    FrameLayout frameLayout11 = this.flSubtitleContainer;
                    if (frameLayout11 != null) {
                        frameLayout11.setVisibility(8);
                    }
                    FrameLayout frameLayout12 = this.flAudioContainer;
                    if (frameLayout12 != null) {
                        frameLayout12.setVisibility(8);
                    }
                    FrameLayout frameLayout13 = this.flSearchContainer;
                    if (frameLayout13 != null) {
                        frameLayout13.setVisibility(8);
                    }
                    FrameLayout frameLayout14 = this.flSyncAdjustContainer;
                    if (frameLayout14 != null) {
                        frameLayout14.setVisibility(8);
                    }
                    FrameLayout frameLayout15 = this.flStyleContainer;
                    if (frameLayout15 != null) {
                        frameLayout15.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            case 2039663830:
                if (!type.equals("NO_SUBTITLE")) {
                    return;
                }
                break;
            default:
                return;
        }
        FrameLayout frameLayout16 = this.flSubtitleContainer;
        if (frameLayout16 != null) {
            frameLayout16.setVisibility(0);
        }
        FrameLayout frameLayout17 = this.flAudioContainer;
        if (frameLayout17 != null) {
            frameLayout17.setVisibility(0);
        }
        FrameLayout frameLayout18 = this.flStyleContainer;
        if (frameLayout18 != null) {
            frameLayout18.setVisibility(8);
        }
        FrameLayout frameLayout19 = this.flSearchContainer;
        if (frameLayout19 != null) {
            frameLayout19.setVisibility(8);
        }
        FrameLayout frameLayout20 = this.flSyncAdjustContainer;
        if (frameLayout20 != null) {
            frameLayout20.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: x0 */
    private final void m81991x0() {
        List listM14574y0 = getChildFragmentManager().m14574y0();
        Intrinsics.m97801g(listM14574y0, "getFragments(...)");
        Iterator it = listM14574y0.iterator();
        while (it.hasNext()) {
            getChildFragmentManager().m14557p().mo14676p((Fragment) it.next()).mo14673l();
        }
    }

    /* JADX INFO: renamed from: y0 */
    private final void m81992y0(View view) {
        if (!this.isLand) {
            C25431a c25431aM99992a = C25431a.m99992a(view);
            Intrinsics.m97801g(c25431aM99992a, "bind(...)");
            c25431aM99992a.f77021h.setOnClickListener(new View.OnClickListener() { // from class: lu.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SubtitleMainDialog2.m81993z0(this.f78018a, view2);
                }
            });
        }
        m81977K0(this.fragmentType);
        this.currentSubtitleType = this.fragmentType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m81993z0(SubtitleMainDialog2 subtitleMainDialog2, View view) {
        subtitleMainDialog2.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: F0 */
    public final void m81994F0(InterfaceC25910b callback) {
        this.mCallback = callback;
    }

    /* JADX INFO: renamed from: G0 */
    public final void m81995G0(DownloadBean downloadBean) {
        this.downloadBean = downloadBean;
        m81975E0();
    }

    /* JADX INFO: renamed from: I0 */
    public final void m81996I0(boolean isOff, List list) {
        Intrinsics.m97802h(list, "list");
        this.subtitleIsOff = isOff;
        this.subtitleDataList.clear();
        this.subtitleDataList.addAll(list);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m81997J0(Function1 callback) {
        this.subtitleSelectFromSearch = callback;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null ? savedInstanceState.getBoolean("KEY_SAVE_INSTANCE") : false) {
            dismissAllowingStateLoss();
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("EXTRA_FRAGMENT_TYPE", "SELECT_SUBTITLE");
            Intrinsics.m97801g(string, "getString(...)");
            this.fragmentType = string;
            this.isLand = arguments.getBoolean("EXTRA_IS_LAND", false);
            this.isVideoStartCheck = arguments.getBoolean("KEY_VIDEO_START_CHECK", true);
            this.pageName = arguments.getString("KEY_PAGE_NAME", "");
        }
        setStyle(0, R$style.DownloadBottomDialogTheme);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.m97802h(inflater, "inflater");
        return inflater.inflate(this.isLand ? R$layout.dialog_subtitle_main_land : R$layout.dialog_subtitle_main_portrait, container, false);
    }

    @Override // com.transsion.baseui.dialog.BaseDialog, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.m97802h(dialog, "dialog");
        super.onDismiss(dialog);
        List<Fragment> listM14574y0 = getChildFragmentManager().m14574y0();
        Intrinsics.m97801g(listM14574y0, "getFragments(...)");
        for (Fragment fragment : listM14574y0) {
            if (fragment instanceof SubtitleBaseFragment) {
                ((SubtitleBaseFragment) fragment).mo82016d0();
            }
        }
        m81974D0(this.switchedDubsInfo);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.m97802h(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("KEY_SAVE_INSTANCE", true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Window window;
        int i11;
        int i12;
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            if (this.isLand) {
                i11 = AbstractC26006c.m102053f() ? com.p282tn.lib.widget.R$style.ActionSheetDialogLeft : com.p282tn.lib.widget.R$style.ActionSheetDialogRight;
            } else {
                i11 = R$style.BottomShowAnimation;
            }
            window.setWindowAnimations(i11);
            if (this.isLand) {
                i12 = AbstractC26006c.m102053f() ? GravityCompat.START : GravityCompat.END;
            } else {
                i12 = 80;
            }
            window.setGravity(i12);
            window.setDimAmount(0.0f);
            window.setBackgroundDrawable(null);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                window.setLayout(-1, this.isLand ? -1 : (AbstractC5806y.m27487c() - AbstractC5781d.m27351c()) - (AbstractC5781d.m27352d(activity) ? AbstractC5781d.m27349a() : 0));
            }
            if (this.isLand) {
                ImmersionBar immersionBarWith = ImmersionBar.with((DialogFragment) this);
                immersionBarWith.hideBar(BarHide.FLAG_HIDE_BAR);
                immersionBarWith.init();
            }
        }
        View viewFindViewById = view.findViewById(R$id.space);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: lu.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SubtitleMainDialog2.m81973C0(this.f78017a, view2);
                }
            });
        }
        this.flAudioContainer = (FrameLayout) view.findViewById(R$id.fl_audio_container);
        this.flSubtitleContainer = (FrameLayout) view.findViewById(R$id.fl_subtitle_container);
        this.flStyleContainer = (FrameLayout) view.findViewById(R$id.flStyleContainer);
        this.flSearchContainer = (FrameLayout) view.findViewById(R$id.flSearchContainer);
        this.flSyncAdjustContainer = (FrameLayout) view.findViewById(R$id.flSyncAdjustContainer);
        initViewModel();
        m81992y0(view);
    }
}
