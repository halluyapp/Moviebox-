package com.transsion.subtitle.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.AbstractC2397b;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.view.DefaultView;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.download.SubtitleLanguageMapBean;
import com.transsion.baselib.report.C14482a;
import com.transsion.baseui.fragment.LazyFragment;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.moviedetailapi.bean.SubtitleItem;
import com.transsion.push.PushConstants;
import com.transsion.subtitle.InterfaceC19714h;
import com.transsion.subtitle.R$drawable;
import com.transsion.subtitle.R$string;
import com.transsion.subtitle.adapter.C19658c;
import com.transsion.subtitle.bean.SubtitleSearchListBean;
import com.transsion.subtitle.helper.SubtitleSearchHelper;
import com.transsion.subtitle.view.SubtitleDialogLoadMoreView;
import com.transsion.subtitle.viewmodel.SubtitleDownloadViewModel;
import com.transsion.subtitle_download.InterfaceC19743a;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mu.InterfaceC25911c;
import p528ju.C24469a;
import p550kj.C24662i;
import p559ku.C25432b;
import p743rh.C27287m;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0013\u0018\u0000 \u0094\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001fB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u0006J!\u0010!\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010\u0006J\u0017\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020\t2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\t2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b.\u0010/J#\u00103\u001a\u00020\t2\n\u00102\u001a\u000600j\u0002`12\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\tH\u0016¢\u0006\u0004\b5\u0010\u0006J\u000f\u00106\u001a\u00020\tH\u0016¢\u0006\u0004\b6\u0010\u0006J\u0017\u00108\u001a\u00020\t2\b\u00107\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b8\u00109J/\u0010>\u001a\u00020\t2\b\u0010;\u001a\u0004\u0018\u00010:2\b\u0010=\u001a\u0004\u0018\u00010<2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\tH\u0002¢\u0006\u0004\b@\u0010\u0006J\u000f\u0010A\u001a\u00020\tH\u0002¢\u0006\u0004\bA\u0010\u0006J\u0017\u0010B\u001a\u00020\t2\u0006\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\bB\u0010'J%\u0010F\u001a\b\u0012\u0004\u0012\u00020\b0C2\u000e\u0010E\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010CH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\tH\u0002¢\u0006\u0004\bH\u0010\u0006J\u000f\u0010I\u001a\u00020\tH\u0002¢\u0006\u0004\bI\u0010\u0006J\u000f\u0010J\u001a\u00020\tH\u0002¢\u0006\u0004\bJ\u0010\u0006J%\u0010M\u001a\u00020\t2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\b0C2\u0006\u0010L\u001a\u00020\u001dH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\t2\u0006\u0010O\u001a\u00020\u001dH\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\tH\u0002¢\u0006\u0004\bR\u0010\u0006J\u000f\u0010S\u001a\u00020\tH\u0002¢\u0006\u0004\bS\u0010\u0006J\u000f\u0010T\u001a\u00020\tH\u0002¢\u0006\u0004\bT\u0010\u0006J\u0017\u0010W\u001a\u00020\u00102\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u00102\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bY\u0010XJ\u0017\u0010Z\u001a\u00020\u00102\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bZ\u0010XJ)\u0010]\u001a\u00020\u00102\u0006\u0010V\u001a\u00020U2\u0006\u0010[\u001a\u00020\u001a2\b\b\u0002\u0010\\\u001a\u00020\u001dH\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\t2\u0006\u0010_\u001a\u00020\bH\u0002¢\u0006\u0004\b`\u0010'J\u001f\u0010c\u001a\u00020\t2\u0006\u0010a\u001a\u00020\u001d2\u0006\u0010b\u001a\u00020(H\u0002¢\u0006\u0004\bc\u0010dR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010o\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010q\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010nR\u0018\u0010t\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010sR\u0016\u0010v\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010nR\u001c\u0010y\u001a\b\u0012\u0004\u0012\u00020<0w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010xR\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0018\u00107\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010nR\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R&\u0010\u0085\u0001\u001a\u000f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020(0\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0088\u0001\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R'\u0010\u008b\u0001\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R!\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0090\u0001¨\u0006\u0095\u0001"}, m97100d2 = {"Lcom/transsion/subtitle/fragment/SubtitleSearchResultListFragment;", "Lcom/transsion/baseui/fragment/LazyFragment;", "Lku/b;", "Lcom/transsion/subtitle_download/a;", "Lmu/c;", "<init>", "()V", "Lkotlin/Function1;", "Lju/a;", "", "callback", "U0", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "T0", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "E0", "(Landroid/view/LayoutInflater;)Lku/b;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "", "isAudioShowNoNetworkLayout", "()Z", "initListener", "initViewData", "initViewModel", "lazyLoadData", "loadDefaultData", "bean", "g", "(Lju/a;)V", "", NotificationCompat.CATEGORY_PROGRESS, "Lcom/transsion/subtitle_download/db/SubtitleDownloadTable;", "dbBean", "onDownloading", "(ILcom/transsion/subtitle_download/db/SubtitleDownloadTable;)V", "onComplete", "(Lcom/transsion/subtitle_download/db/SubtitleDownloadTable;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "onFail", "(Ljava/lang/Exception;Lcom/transsion/subtitle_download/db/SubtitleDownloadTable;)V", "onDestroy", "retryLoadData", "searchName", "Q0", "(Ljava/lang/String;)V", "Lcom/transsion/baselib/db/download/DownloadBean;", "downloadBean", "Lcom/transsion/baselib/db/download/SubtitleLanguageMapBean;", "languageBean", "S0", "(Lcom/transsion/baselib/db/download/DownloadBean;Lcom/transsion/baselib/db/download/SubtitleLanguageMapBean;Ljava/lang/String;)V", "K0", "w0", "Y0", "", "Lcom/transsion/moviedetailapi/bean/SubtitleItem;", "items", "F0", "(Ljava/util/List;)Ljava/util/List;", "loadData", "P0", "loadMore", "list", "hasMore", "Z0", "(Ljava/util/List;Z)V", PushConstants.PUSH_SERVICE_TYPE_SHOW, "W0", "(Z)V", "X0", "showEmpty", "V0", "Landroid/content/Context;", "context", "getEmptyView", "(Landroid/content/Context;)Landroid/view/View;", "D0", "C0", "desText", "showLeftBtn", "y0", "(Landroid/content/Context;Ljava/lang/String;Z)Landroid/view/View;", WebConstants.FIELD_ITEM, "x0", "isSuccess", NativeComponentConstants.KEY_COMPONENT_TYPE, "R0", "(ZI)V", "Lcom/transsion/subtitle/viewmodel/SubtitleDownloadViewModel;", "a", "Lcom/transsion/subtitle/viewmodel/SubtitleDownloadViewModel;", "viewModel", "Lcom/transsion/subtitle/adapter/c;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/subtitle/adapter/c;", "resultAdapter", "c", "Ljava/lang/String;", "nextPage", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "pageName", "Lcom/transsion/subtitle/fragment/i;", "Lcom/transsion/subtitle/fragment/i;", "keyword", "f", "languages", "", "Ljava/util/List;", "languageList", "h", "Lcom/transsion/baselib/db/download/DownloadBean;", "i", "j", "Lcom/transsion/baselib/db/download/SubtitleLanguageMapBean;", CampaignEx.JSON_KEY_AD_K, "Lju/a;", "currentSelectItem", "", "l", "Ljava/util/Map;", "curDownloadedMap", "m", "I", "currentSelectPosition", "n", "Lkotlin/jvm/functions/Function1;", "selectSubtitleCallback", "o", "Lkotlin/jvm/functions/Function0;", "onGetDataResultCallback", TtmlNode.TAG_P, "Z", "hasSubDownloading", CampaignEx.JSON_KEY_AD_Q, "isOpenSubtitle", CampaignEx.JSON_KEY_AD_R, "VideoSubtitle_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SubtitleSearchResultListFragment extends LazyFragment<C25432b> implements InterfaceC19743a, InterfaceC25911c {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private SubtitleDownloadViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private C19658c resultAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private C19695i keyword;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private DownloadBean downloadBean;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String searchName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private SubtitleLanguageMapBean languageBean;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private C24469a currentSelectItem;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private Function1 selectSubtitleCallback;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private Function0 onGetDataResultCallback;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean hasSubDownloading;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String nextPage = "1";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String languages = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private List languageList = new ArrayList();

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private Map curDownloadedMap = new LinkedHashMap();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int currentSelectPosition = -1;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean isOpenSubtitle = true;

    /* JADX INFO: renamed from: com.transsion.subtitle.fragment.SubtitleSearchResultListFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final SubtitleSearchResultListFragment m82090a(DownloadBean downloadBean, SubtitleLanguageMapBean subtitleLanguageMapBean, String str, String str2) {
            SubtitleSearchResultListFragment subtitleSearchResultListFragment = new SubtitleSearchResultListFragment();
            subtitleSearchResultListFragment.m82064S0(downloadBean, subtitleLanguageMapBean, str);
            subtitleSearchResultListFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("KEY_PAGE_NAME", str2)));
            return subtitleSearchResultListFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.fragment.SubtitleSearchResultListFragment$b */
    public static final class C19678b extends RecyclerView.AbstractC4219r {
        C19678b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i11);
            if (i11 != 0 || recyclerView.canScrollVertically(1)) {
                return;
            }
            SubtitleSearchResultListFragment.this.m82057K0();
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.fragment.SubtitleSearchResultListFragment$c */
    public static final class C19679c extends DiffUtil.AbstractC4174e {
        C19679c() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(C24469a oldItem, C24469a newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.m96011b().getId(), newItem.m96011b().getId()) && Intrinsics.m97797c(oldItem.m96011b().getUrl(), newItem.m96011b().getUrl()) && oldItem.m96011b().getStatus() == newItem.m96011b().getStatus();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.AbstractC4174e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(C24469a oldItem, C24469a newItem) {
            Intrinsics.m97802h(oldItem, "oldItem");
            Intrinsics.m97802h(newItem, "newItem");
            return Intrinsics.m97797c(oldItem.m96011b().getUrl(), newItem.m96011b().getUrl());
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.fragment.SubtitleSearchResultListFragment$d */
    static final class C19680d implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f62885a;

        C19680d(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f62885a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f62885a;
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
            this.f62885a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m82048A0(SubtitleSearchResultListFragment subtitleSearchResultListFragment, DefaultView defaultView, View view) {
        subtitleSearchResultListFragment.m82066W0(true);
        subtitleSearchResultListFragment.loadData();
        defaultView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final void m82049B0(DefaultView defaultView, View view) {
        try {
            Result.Companion companion = Result.INSTANCE;
            NetworkUtils.m27175v();
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: C0 */
    private final View m82050C0(Context context) {
        String string = context.getString(R$string.subtitle_load_failed);
        Intrinsics.m97801g(string, "getString(...)");
        return m82085z0(this, context, string, false, 4, null);
    }

    /* JADX INFO: renamed from: D0 */
    private final View m82051D0(Context context) {
        String string = context.getString(com.p282tn.lib.widget.R$string.no_network_title);
        Intrinsics.m97801g(string, "getString(...)");
        return m82084y0(context, string, true);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x013d A[PHI: r4
      0x013d: PHI (r4v43 java.lang.String) = (r4v24 java.lang.String), (r4v44 java.lang.String) binds: [B:109:0x014a, B:102:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x002b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX INFO: renamed from: F0 */
    private final List m82052F0(List items) {
        String resourceId;
        int i11;
        String str;
        String resourceId2;
        String str2;
        String name;
        String str3;
        boolean z11;
        C24469a c24469a;
        SubtitleDownloadTable subtitleDownloadTableM96011b;
        C24469a c24469a2;
        SubtitleDownloadTable subtitleDownloadTableM96011b2;
        String path;
        C3187b0 c3187b0M82254m;
        if (items == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        DownloadBean downloadBean = this.downloadBean;
        String subjectId = downloadBean != null ? downloadBean.getSubjectId() : null;
        if (subjectId == null || subjectId.length() == 0) {
            DownloadBean downloadBean2 = this.downloadBean;
            if (downloadBean2 != null) {
                resourceId = downloadBean2.getResourceId();
            } else {
                resourceId = null;
            }
        } else {
            DownloadBean downloadBean3 = this.downloadBean;
            if (downloadBean3 != null) {
                resourceId = downloadBean3.getSubjectId();
            } else {
                resourceId = null;
            }
        }
        SubtitleDownloadViewModel subtitleDownloadViewModel = this.viewModel;
        Map map = (subtitleDownloadViewModel == null || (c3187b0M82254m = subtitleDownloadViewModel.m82254m()) == null) ? null : (Map) c3187b0M82254m.m14847f();
        DownloadBean downloadBean4 = this.downloadBean;
        boolean z12 = true;
        if (downloadBean4 == null || !downloadBean4.isUGCVideo()) {
            DownloadBean downloadBean5 = this.downloadBean;
            i11 = (downloadBean5 == null || !downloadBean5.getIsStream()) ? 1 : 2;
        } else {
            i11 = 4;
        }
        Iterator it = items.iterator();
        while (it.hasNext()) {
            SubtitleItem subtitleItem = (SubtitleItem) it.next();
            String id2 = subtitleItem.getId();
            String str4 = id2 == null ? "" : id2;
            DownloadBean downloadBean6 = this.downloadBean;
            if (downloadBean6 == null || (postIdNotNull = downloadBean6.getSubtitleResId()) == null) {
                DownloadBean downloadBean7 = this.downloadBean;
                if (downloadBean7 != null) {
                    String postIdNotNull = downloadBean7.getPostIdNotNull();
                    str = postIdNotNull;
                } else {
                    str = "";
                }
            } else {
                str = postIdNotNull;
            }
            DownloadBean downloadBean8 = this.downloadBean;
            if (downloadBean8 == null || downloadBean8.isOutside() != z12) {
                DownloadBean downloadBean9 = this.downloadBean;
                if (downloadBean9 == null || (resourceId2 = downloadBean9.getPostId()) == null) {
                    DownloadBean downloadBean10 = this.downloadBean;
                    if (downloadBean10 != null) {
                        resourceId2 = downloadBean10.getResourceId();
                    } else {
                        str2 = null;
                    }
                }
                str2 = resourceId2;
            } else {
                DownloadBean downloadBean11 = this.downloadBean;
                if (downloadBean11 != null) {
                    resourceId2 = downloadBean11.getPostIdNotNull();
                    str2 = resourceId2;
                } else {
                    str2 = null;
                }
            }
            String url = subtitleItem.getUrl();
            String str5 = url == null ? "" : url;
            String str6 = (map == null || map.containsKey(subtitleItem.getId()) != z12 || (c24469a2 = (C24469a) map.get(subtitleItem.getId())) == null || (subtitleDownloadTableM96011b2 = c24469a2.m96011b()) == null || (path = subtitleDownloadTableM96011b2.getPath()) == null) ? "" : path;
            String lan = subtitleItem.getLan();
            String lanName = subtitleItem.getLanName();
            String str7 = lanName == null ? "" : lanName;
            String name2 = subtitleItem.getName();
            Long size = subtitleItem.getSize();
            Integer episode = subtitleItem.getEpisode();
            int iIntValue = episode != null ? episode.intValue() : 0;
            Integer season = subtitleItem.getSeason();
            int iIntValue2 = season != null ? season.intValue() : 0;
            DownloadBean downloadBean12 = this.downloadBean;
            if (downloadBean12 == null || (name = downloadBean12.getSubjectName()) == null) {
                DownloadBean downloadBean13 = this.downloadBean;
                name = downloadBean13 != null ? downloadBean13.getName() : null;
                if (name == null) {
                    str3 = "";
                } else {
                    str3 = name;
                }
            } else {
                str3 = name;
            }
            int status = (map == null || map.containsKey(subtitleItem.getId()) != z12 || (c24469a = (C24469a) map.get(subtitleItem.getId())) == null || (subtitleDownloadTableM96011b = c24469a.m96011b()) == null) ? 0 : subtitleDownloadTableM96011b.getStatus();
            Integer type = subtitleItem.getType();
            int iIntValue3 = type != null ? type.intValue() : 2;
            DownloadBean downloadBean14 = this.downloadBean;
            String ugcVideoId = downloadBean14 != null ? downloadBean14.getUgcVideoId() : null;
            DownloadBean downloadBean15 = this.downloadBean;
            String ugcVideoCollectionId = downloadBean15 != null ? downloadBean15.getUgcVideoCollectionId() : null;
            DownloadBean downloadBean16 = this.downloadBean;
            Map map2 = map;
            C24469a c24469a3 = new C24469a(new SubtitleDownloadTable(str4, i11, str, lan, str7, str5, size, null, null, iIntValue3, str2, name2, resourceId, iIntValue, iIntValue2, 0, str3, status, null, str6, null, null, 0, ugcVideoId, ugcVideoCollectionId, downloadBean16 != null ? downloadBean16.getOps() : null, 7635328, null));
            if (subtitleItem.getIsOpenSubNewApi()) {
                c24469a3.m96018i(subtitleItem.getFileId());
                z11 = true;
                c24469a3.m96019j(true);
            } else {
                z11 = true;
            }
            String id3 = c24469a3.m96011b().getId();
            DownloadBean downloadBean17 = this.downloadBean;
            c24469a3.m96021l(Intrinsics.m97797c(id3, downloadBean17 != null ? downloadBean17.getSubtitleSelectId() : null));
            if (c24469a3.m96015f()) {
                this.curDownloadedMap.put(c24469a3, -1);
            }
            arrayList.add(c24469a3);
            z12 = z11;
            map = map2;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final void m82053G0(SubtitleSearchResultListFragment subtitleSearchResultListFragment) {
        subtitleSearchResultListFragment.m82057K0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final void m82054H0(SubtitleSearchResultListFragment subtitleSearchResultListFragment, BaseQuickAdapter adapter, View view, int i11) {
        C19658c c19658c;
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        Intrinsics.m97800f(item, "null cannot be cast to non-null type com.transsion.subtitle.bean.VideoSubtitleBean");
        C24469a c24469a = (C24469a) item;
        if (c24469a.m96011b().getStatus() == 2) {
            return;
        }
        if (!c24469a.m96013d() && subtitleSearchResultListFragment.hasSubDownloading) {
            C28951b.f88586a.m111454d(R$string.subtitle_is_downloading);
            return;
        }
        if (c24469a.m96015f()) {
            return;
        }
        c24469a.m96021l(true);
        if (subtitleSearchResultListFragment.currentSelectPosition == i11) {
            subtitleSearchResultListFragment.currentSelectPosition = -1;
            subtitleSearchResultListFragment.currentSelectItem = null;
            return;
        }
        C24469a c24469a2 = subtitleSearchResultListFragment.currentSelectItem;
        if (c24469a2 != null) {
            c24469a2.m96021l(false);
        }
        int i12 = subtitleSearchResultListFragment.currentSelectPosition;
        if (i12 >= 0 && (c19658c = subtitleSearchResultListFragment.resultAdapter) != null) {
            c19658c.notifyItemChanged(i12, subtitleSearchResultListFragment.currentSelectItem);
        }
        String str = subtitleSearchResultListFragment.pageName;
        if (str == null) {
            str = "";
        }
        c24469a.m96020k(str);
        subtitleSearchResultListFragment.currentSelectItem = c24469a;
        subtitleSearchResultListFragment.currentSelectPosition = i11;
        C19658c c19658c2 = subtitleSearchResultListFragment.resultAdapter;
        if (c19658c2 != null) {
            c19658c2.notifyItemChanged(i11, c24469a);
        }
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "ORSubtitle_search", "select item = " + c24469a.m96011b().getName() + ", position = " + i11 + "， status:" + c24469a.m96011b().getStatus(), false, 4, null);
        if (c24469a.m96013d()) {
            Function1 function1 = subtitleSearchResultListFragment.selectSubtitleCallback;
            if (function1 != null) {
                function1.invoke(c24469a);
                return;
            }
            return;
        }
        c24469a.m96011b().setStatus(2);
        C26866a.a.m104905r(aVar, "ORSubtitle_search", new String[]{"itemClick, resourceId:" + c24469a.m96011b().getId() + ", name:" + c24469a.m96011b().getName() + " index:" + i11 + ", isOpenSubNewApi:" + c24469a.m96014e()}, false, 4, null);
        subtitleSearchResultListFragment.curDownloadedMap.put(c24469a, Integer.valueOf(i11));
        subtitleSearchResultListFragment.m82083x0(c24469a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final Unit m82055I0(SubtitleSearchResultListFragment subtitleSearchResultListFragment, SubtitleSearchListBean subtitleSearchListBean) {
        String nextPage;
        Boolean hasMore;
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        C19658c c19658c;
        C27941f c27941fM36186h2;
        List<Object> data;
        boolean zBooleanValue = false;
        subtitleSearchResultListFragment.m82066W0(false);
        Function0 function0 = subtitleSearchResultListFragment.onGetDataResultCallback;
        if (function0 != null) {
            function0.invoke();
        }
        subtitleSearchResultListFragment.isOpenSubtitle = subtitleSearchListBean != null && subtitleSearchListBean.getSearchType() == 2;
        if (subtitleSearchListBean == null || !subtitleSearchListBean.isRefresh()) {
            subtitleSearchResultListFragment.m82063R0(false, 2);
        } else {
            subtitleSearchResultListFragment.m82063R0(true, subtitleSearchListBean.getSearchType());
        }
        if (subtitleSearchListBean != null) {
            Pager pager = subtitleSearchListBean.getPager();
            if (pager == null || (nextPage = pager.getNextPage()) == null) {
                nextPage = "1";
            }
            subtitleSearchResultListFragment.nextPage = nextPage;
            List listM82052F0 = subtitleSearchResultListFragment.m82052F0(subtitleSearchListBean.getItems());
            Pager pager2 = subtitleSearchListBean.getPager();
            if (pager2 != null && (hasMore = pager2.getHasMore()) != null) {
                zBooleanValue = hasMore.booleanValue();
            }
            subtitleSearchResultListFragment.m82069Z0(listM82052F0, zBooleanValue);
            return Unit.f75682a;
        }
        C19658c c19658c2 = subtitleSearchResultListFragment.resultAdapter;
        if (c19658c2 == null || (data = c19658c2.getData()) == null || data.size() != 0) {
            C19658c c19658c3 = subtitleSearchResultListFragment.resultAdapter;
            if (c19658c3 != null && (c27941fM36186h1 = c19658c3.m36186h0()) != null && c27941fM36186h1.m108666r() && (c19658c = subtitleSearchResultListFragment.resultAdapter) != null && (c27941fM36186h2 = c19658c.m36186h0()) != null) {
                c27941fM36186h2.m108669v();
            }
            C19658c c19658c4 = subtitleSearchResultListFragment.resultAdapter;
            if (c19658c4 != null && (c27941fM36186h0 = c19658c4.m36186h0()) != null) {
                C27941f.m108652u(c27941fM36186h0, false, 1, null);
            }
        } else if (C27287m.f83003a.m106330e()) {
            subtitleSearchResultListFragment.m82065V0();
        } else {
            subtitleSearchResultListFragment.m82067X0();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final Unit m82056J0(SubtitleSearchResultListFragment subtitleSearchResultListFragment, C24469a c24469a) {
        if (c24469a != null) {
            String url = c24469a.m96011b().getUrl();
            if (url == null || url.length() == 0) {
                c24469a.m96011b().setStatus(6);
                subtitleSearchResultListFragment.m82068Y0(c24469a);
            } else {
                subtitleSearchResultListFragment.m82083x0(c24469a);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K0 */
    public final void m82057K0() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        if (this.isOpenSubtitle) {
            return;
        }
        C19658c c19658c = this.resultAdapter;
        if (c19658c == null || (c27941fM36186h1 = c19658c.m36186h0()) == null || !c27941fM36186h1.m108666r()) {
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
                C25432b c25432b = (C25432b) getMViewBinding();
                if (c25432b == null || (recyclerView = c25432b.f77025d) == null) {
                    return;
                }
                recyclerView.postDelayed(new Runnable() { // from class: com.transsion.subtitle.fragment.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        SubtitleSearchResultListFragment.m82059M0(this.f62919a);
                    }
                }, 500L);
                return;
            }
            C19658c c19658c2 = this.resultAdapter;
            if (c19658c2 != null && (c27941fM36186h0 = c19658c2.m36186h0()) != null) {
                c27941fM36186h0.m108670w();
            }
            C25432b c25432b2 = (C25432b) getMViewBinding();
            if (c25432b2 == null || (recyclerView2 = c25432b2.f77025d) == null) {
                return;
            }
            recyclerView2.postDelayed(new Runnable() { // from class: com.transsion.subtitle.fragment.n
                @Override // java.lang.Runnable
                public final void run() {
                    SubtitleSearchResultListFragment.m82058L0(this.f62918a);
                }
            }, 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final void m82058L0(SubtitleSearchResultListFragment subtitleSearchResultListFragment) {
        subtitleSearchResultListFragment.loadMore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final void m82059M0(SubtitleSearchResultListFragment subtitleSearchResultListFragment) {
        C27941f c27941fM36186h0;
        C19658c c19658c = subtitleSearchResultListFragment.resultAdapter;
        if (c19658c == null || (c27941fM36186h0 = c19658c.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final void m82060N0(SubtitleSearchResultListFragment subtitleSearchResultListFragment, SubtitleDownloadTable subtitleDownloadTable) {
        List<Object> data;
        Object next;
        C19658c c19658c = subtitleSearchResultListFragment.resultAdapter;
        if (c19658c == null || (data = c19658c.getData()) == null) {
            return;
        }
        Iterator<T> it = data.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.m97797c(((C24469a) next).m96011b().getId(), subtitleDownloadTable.getId()));
        C24469a c24469a = (C24469a) next;
        if (c24469a != null) {
            c24469a.m96017h(subtitleDownloadTable);
            C26866a.a aVar = C26866a.f81698a;
            String strM65273a = C14482a.f50937a.m65273a();
            DownloadBean downloadBean = subtitleSearchResultListFragment.downloadBean;
            String totalTitleName = downloadBean != null ? downloadBean.getTotalTitleName() : null;
            aVar.m104912c(strM65273a, "搜索字幕下载成功，name = " + totalTitleName + ", subtype = " + c24469a.m96011b().getType() + ", download subtitleName = " + c24469a.m96011b().getSubtitleName() + ", lan = " + c24469a.m96011b().getLan() + "~", true);
            C19658c c19658c2 = subtitleSearchResultListFragment.resultAdapter;
            Intrinsics.m97799e(c19658c2);
            c24469a.m96021l(c19658c2.getData().indexOf(c24469a) == subtitleSearchResultListFragment.currentSelectPosition);
            subtitleSearchResultListFragment.m82068Y0(c24469a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final void m82061O0(SubtitleSearchResultListFragment subtitleSearchResultListFragment, SubtitleDownloadTable subtitleDownloadTable) {
        List<Object> data;
        Object next;
        subtitleSearchResultListFragment.currentSelectPosition = -1;
        subtitleSearchResultListFragment.currentSelectItem = null;
        C19658c c19658c = subtitleSearchResultListFragment.resultAdapter;
        if (c19658c == null || (data = c19658c.getData()) == null) {
            return;
        }
        Iterator<T> it = data.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.m97797c(((C24469a) next).m96011b().getId(), subtitleDownloadTable.getId()));
        C24469a c24469a = (C24469a) next;
        if (c24469a != null) {
            c24469a.m96017h(subtitleDownloadTable);
            C26866a.a aVar = C26866a.f81698a;
            String strM65273a = C14482a.f50937a.m65273a();
            DownloadBean downloadBean = subtitleSearchResultListFragment.downloadBean;
            String totalTitleName = downloadBean != null ? downloadBean.getTotalTitleName() : null;
            aVar.m104921x(strM65273a, "搜索字幕下载失败TnT，name = " + totalTitleName + ", subtype = " + c24469a.m96011b().getType() + ", download subtitleName = " + c24469a.m96011b().getSubtitleName() + ", lan = " + c24469a.m96011b().getLan() + "~ , url：" + c24469a.m96011b().getUrl(), true);
            subtitleSearchResultListFragment.m82068Y0(c24469a);
        }
    }

    /* JADX INFO: renamed from: P0 */
    private final void m82062P0() {
        this.nextPage = "1";
        C19658c c19658c = this.resultAdapter;
        if (c19658c != null) {
            c19658c.mo36201n1(CollectionsKt.m97506l());
        }
        if (!C27287m.f83003a.m106330e()) {
            m82067X0();
            return;
        }
        m82066W0(true);
        SubtitleDownloadViewModel subtitleDownloadViewModel = this.viewModel;
        if (subtitleDownloadViewModel != null) {
            SubtitleDownloadViewModel.m82245u(subtitleDownloadViewModel, this.keyword, this.languages, this.languageList, this.downloadBean, this.nextPage, 0, 32, null);
        }
    }

    /* JADX INFO: renamed from: R0 */
    private final void m82063R0(boolean isSuccess, int type) {
        DownloadBean downloadBean;
        SubtitleLanguageMapBean subtitleLanguageMapBean;
        String lan;
        String str = this.pageName;
        if (str == null || (downloadBean = this.downloadBean) == null || (subtitleLanguageMapBean = this.languageBean) == null || (lan = subtitleLanguageMapBean.getLan()) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("result", isSuccess ? "1" : "0");
        linkedHashMap.put(NativeComponentConstants.KEY_COMPONENT_TYPE, String.valueOf(type));
        linkedHashMap.put("lan", lan);
        String resourceId = downloadBean.getResourceId();
        if (resourceId == null) {
            resourceId = "";
        }
        linkedHashMap.put("resource_id", resourceId);
        String subjectId = downloadBean.getSubjectId();
        linkedHashMap.put("subject_id", subjectId != null ? subjectId : "");
        if (downloadBean.getEp() > 0) {
            linkedHashMap.put("ep", String.valueOf(downloadBean.getEp()));
        }
        if (downloadBean.getSe() > 0) {
            linkedHashMap.put("se", String.valueOf(downloadBean.getSe()));
        }
        C24662i.f75350a.m96884s(str, "subtitle_search", linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public final void m82064S0(DownloadBean downloadBean, SubtitleLanguageMapBean languageBean, String searchName) {
        this.downloadBean = downloadBean;
        this.searchName = searchName;
        if (languageBean != null) {
            this.languageBean = languageBean;
            this.languages = languageBean.getLan();
            this.languageList.add(languageBean);
        }
    }

    /* JADX INFO: renamed from: V0 */
    private final void m82065V0() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "ORSubtitle_search", "showFail~", false, 4, null);
        m82066W0(false);
        C19658c c19658c = this.resultAdapter;
        if (c19658c != null) {
            c19658c.m36171Y0(m82050C0(context));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W0 */
    private final void m82066W0(boolean show) {
        LinearLayoutCompat linearLayoutCompat;
        C25432b c25432b = (C25432b) getMViewBinding();
        if (c25432b == null || (linearLayoutCompat = c25432b.f77024c) == null) {
            return;
        }
        linearLayoutCompat.setVisibility(show ? 0 : 8);
    }

    /* JADX INFO: renamed from: X0 */
    private final void m82067X0() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "ORSubtitle_search", "showNotNet~", false, 4, null);
        m82066W0(false);
        C19658c c19658c = this.resultAdapter;
        if (c19658c != null) {
            c19658c.m36171Y0(m82051D0(context));
        }
    }

    /* JADX INFO: renamed from: Y0 */
    private final void m82068Y0(C24469a bean) {
        int iIndexOf;
        C19658c c19658c;
        C19658c c19658c2 = this.resultAdapter;
        if (c19658c2 == null || (iIndexOf = c19658c2.getData().indexOf(bean)) < 0 || !isAdded() || (c19658c = this.resultAdapter) == null) {
            return;
        }
        c19658c.notifyItemChanged(iIndexOf, bean);
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m82069Z0(List list, boolean hasMore) {
        List<Object> listL;
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        C19658c c19658c;
        C27941f c27941fM36186h2;
        List<Object> data;
        C27941f c27941fM36186h3;
        C27941f c27941fM36186h4;
        C19658c c19658c2;
        C27941f c27941fM36186h5;
        C27941f c27941fM36186h6;
        List<Object> data2;
        if (list.isEmpty()) {
            C19658c c19658c3 = this.resultAdapter;
            if (c19658c3 != null && (data2 = c19658c3.getData()) != null && data2.size() == 0) {
                if (C27287m.f83003a.m106330e()) {
                    showEmpty();
                } else {
                    m82067X0();
                }
            }
            C19658c c19658c4 = this.resultAdapter;
            if (c19658c4 == null || (c27941fM36186h6 = c19658c4.m36186h0()) == null) {
                return;
            }
            C27941f.m108652u(c27941fM36186h6, false, 1, null);
            return;
        }
        C19658c c19658c5 = this.resultAdapter;
        if (c19658c5 != null && (data = c19658c5.getData()) != null && data.isEmpty()) {
            C19658c c19658c6 = this.resultAdapter;
            if (c19658c6 != null) {
                c19658c6.mo36201n1(list);
            }
            if (!hasMore) {
                C19658c c19658c7 = this.resultAdapter;
                if (c19658c7 == null || (c27941fM36186h3 = c19658c7.m36186h0()) == null) {
                    return;
                }
                C27941f.m108652u(c27941fM36186h3, false, 1, null);
                return;
            }
            C19658c c19658c8 = this.resultAdapter;
            if (c19658c8 == null || (c27941fM36186h4 = c19658c8.m36186h0()) == null || !c27941fM36186h4.m108666r() || (c19658c2 = this.resultAdapter) == null || (c27941fM36186h5 = c19658c2.m36186h0()) == null) {
                return;
            }
            c27941fM36186h5.m108667s();
            return;
        }
        C19658c c19658c9 = this.resultAdapter;
        if (c19658c9 == null || (listL = c19658c9.getData()) == null) {
            listL = CollectionsKt.m97506l();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C24469a c24469a = (C24469a) obj;
            List<Object> list2 = listL;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!Intrinsics.m97797c(c24469a.m96011b().getUrl(), ((C24469a) it.next()).m96011b().getUrl()));
            }
            arrayList.add(obj);
        }
        if (arrayList.isEmpty()) {
            C26866a.a.m104898f(C26866a.f81698a, "ORSubtitle_search", "全部去重了~", false, 4, null);
            return;
        }
        C19658c c19658c10 = this.resultAdapter;
        if (c19658c10 != null) {
            c19658c10.mo36208q(arrayList);
        }
        if (!hasMore) {
            C19658c c19658c11 = this.resultAdapter;
            if (c19658c11 == null || (c27941fM36186h0 = c19658c11.m36186h0()) == null) {
                return;
            }
            C27941f.m108652u(c27941fM36186h0, false, 1, null);
            return;
        }
        C19658c c19658c12 = this.resultAdapter;
        if (c19658c12 == null || (c27941fM36186h1 = c19658c12.m36186h0()) == null || !c27941fM36186h1.m108666r() || (c19658c = this.resultAdapter) == null || (c27941fM36186h2 = c19658c.m36186h0()) == null) {
            return;
        }
        c27941fM36186h2.m108667s();
    }

    private final View getEmptyView(Context context) {
        String string = context.getString(R$string.subtitle_no_subtitles_found);
        Intrinsics.m97801g(string, "getString(...)");
        return m82085z0(this, context, string, false, 4, null);
    }

    private final void loadData() {
        if (!C27287m.f83003a.m106330e()) {
            m82067X0();
            return;
        }
        SubtitleDownloadViewModel subtitleDownloadViewModel = this.viewModel;
        if (subtitleDownloadViewModel != null) {
            SubtitleDownloadViewModel.m82245u(subtitleDownloadViewModel, this.keyword, this.languages, this.languageList, this.downloadBean, this.nextPage, 0, 32, null);
        }
    }

    private final void loadMore() {
        SubtitleDownloadViewModel subtitleDownloadViewModel = this.viewModel;
        if (subtitleDownloadViewModel != null) {
            SubtitleDownloadViewModel.m82245u(subtitleDownloadViewModel, this.keyword, this.languages, this.languageList, this.downloadBean, this.nextPage, 0, 32, null);
        }
    }

    private final void showEmpty() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "ORSubtitle_search", "showEmpty~", false, 4, null);
        m82066W0(false);
        C19658c c19658c = this.resultAdapter;
        if (c19658c != null) {
            c19658c.m36171Y0(getEmptyView(context));
        }
    }

    /* JADX INFO: renamed from: w0 */
    private final void m82082w0() {
        InterfaceC19714h.a aVar = InterfaceC19714h.f62935a;
        aVar.m82148b().mo81940b(this);
        aVar.m82148b().mo81944f(this);
    }

    /* JADX INFO: renamed from: x0 */
    private final void m82083x0(C24469a item) {
        String url;
        if (item.m96014e() && ((url = item.m96011b().getUrl()) == null || url.length() == 0)) {
            C26866a.f81698a.m104912c(C14482a.f50937a.m65273a(), "搜索下载字幕，是opensubtitle 新api，需要先请求才能下载", true);
            SubtitleDownloadViewModel subtitleDownloadViewModel = this.viewModel;
            if (subtitleDownloadViewModel != null) {
                subtitleDownloadViewModel.m82252k(item);
                return;
            }
            return;
        }
        this.hasSubDownloading = true;
        C26866a.a aVar = C26866a.f81698a;
        String strM65273a = C14482a.f50937a.m65273a();
        DownloadBean downloadBean = this.downloadBean;
        String totalTitleName = downloadBean != null ? downloadBean.getTotalTitleName() : null;
        aVar.m104912c(strM65273a, "搜索下载字幕，name = " + totalTitleName + ", subtype = " + item.m96011b().getType() + ", download subtitleName = " + item.m96011b().getSubtitleName() + ", subResourceId = " + item.m96011b().getId() + "~", true);
        item.m96011b().setSetImmediately(true);
        InterfaceC19714h.f62935a.m82148b().mo81948j(item);
    }

    /* JADX INFO: renamed from: y0 */
    private final View m82084y0(Context context, String desText, boolean showLeftBtn) {
        final DefaultView defaultView = new DefaultView(context, DefaultView.ModelStyle.MODEL_STYLE_NIGHT);
        defaultView.setStyle(DefaultView.DefaultViewStyle.STYLE_DES_BTN);
        defaultView.setDescText(desText);
        defaultView.setStyle(DefaultView.DefaultViewStyle.STYLE_NO_IMAGE);
        defaultView.setBtnVisibility(0);
        String string = context.getString(com.transsion.baseui.R$string.retry_text);
        Intrinsics.m97801g(string, "getString(...)");
        defaultView.setBtnText(string);
        defaultView.setTipOperationVisibility(8);
        defaultView.setBtnBg(AbstractC2397b.getDrawable(Utils.m27275a(), R$drawable.post_detail_shape_subtitle_empty_btn_bg));
        defaultView.setBtnTextColor(-1);
        defaultView.setBackgroundColor(0);
        defaultView.setBtnClickListener(new View.OnClickListener() { // from class: com.transsion.subtitle.fragment.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubtitleSearchResultListFragment.m82048A0(this.f62920a, defaultView, view);
            }
        });
        defaultView.setLeftBtnVisibility(showLeftBtn ? 0 : 8);
        String string2 = context.getString(com.p282tn.lib.widget.R$string.go_to_setting);
        Intrinsics.m97801g(string2, "getString(...)");
        defaultView.setLeftBtnText(string2);
        defaultView.setLeftBtnBg(AbstractC2397b.getDrawable(Utils.m27275a(), R$drawable.post_detail_shape_subtitle_empty_btn_bg));
        defaultView.setLeftBtnTextColor(-1);
        defaultView.setLeftBtnClickListener(new View.OnClickListener() { // from class: com.transsion.subtitle.fragment.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubtitleSearchResultListFragment.m82049B0(defaultView, view);
            }
        });
        defaultView.setTitleViewVisibility(8);
        int iM27313a = AbstractC5776a0.m27313a(16.0f);
        defaultView.setPadding(iM27313a, AbstractC5776a0.m27313a(30.0f), iM27313a, 0);
        defaultView.setVisibility(0);
        return defaultView;
    }

    /* JADX INFO: renamed from: z0 */
    static /* synthetic */ View m82085z0(SubtitleSearchResultListFragment subtitleSearchResultListFragment, Context context, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return subtitleSearchResultListFragment.m82084y0(context, str, z11);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public C25432b getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25432b c25432bM99995c = C25432b.m99995c(inflater);
        Intrinsics.m97801g(c25432bM99995c, "inflate(...)");
        return c25432bM99995c;
    }

    @Override // mu.InterfaceC25911c
    /* JADX INFO: renamed from: K */
    public void mo81897K(boolean z11, DownloadBean downloadBean) {
        InterfaceC25911c.a.m101719a(this, z11, downloadBean);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m82087Q0(String searchName) {
        if (searchName == null || searchName.length() == 0) {
            return;
        }
        this.searchName = searchName;
        DownloadBean downloadBean = this.downloadBean;
        int se2 = downloadBean != null ? downloadBean.getSe() : 0;
        DownloadBean downloadBean2 = this.downloadBean;
        this.keyword = new C19695i(searchName, se2, downloadBean2 != null ? downloadBean2.getEp() : 0);
        m82062P0();
    }

    /* JADX INFO: renamed from: T0 */
    public final void m82088T0(Function0 callback) {
        this.onGetDataResultCallback = callback;
    }

    /* JADX INFO: renamed from: U0 */
    public final void m82089U0(Function1 callback) {
        this.selectSubtitleCallback = callback;
    }

    @Override // mu.InterfaceC25911c
    /* JADX INFO: renamed from: g */
    public void mo81898g(C24469a bean) {
        C19658c c19658c;
        List<Object> data;
        Intrinsics.m97802h(bean, "bean");
        for (Map.Entry entry : this.curDownloadedMap.entrySet()) {
            C24469a c24469a = (C24469a) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            if (!Intrinsics.m97797c(bean.m96011b().getId(), c24469a.m96011b().getId())) {
                C26866a.a aVar = C26866a.f81698a;
                C26866a.a.m104908v(aVar, "ORSubtitle_search", "subtitleSelected, resourceId = " + c24469a.m96011b().getId() + ", name = " + c24469a.m96011b().getName(), false, 4, null);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    c24469a.m96021l(false);
                    if (iIntValue < 0) {
                        C19658c c19658c2 = this.resultAdapter;
                        iIntValue = (c19658c2 == null || (data = c19658c2.getData()) == null) ? -1 : data.indexOf(c24469a);
                    }
                    C26866a.a.m104908v(aVar, "ORSubtitle_search", "subtitleSelected2, index = " + iIntValue, false, 4, null);
                    if (iIntValue >= 0 && (c19658c = this.resultAdapter) != null) {
                        c19658c.notifyItemChanged(iIntValue, c24469a);
                    }
                    Result.m112707constructorimpl(Unit.f75682a);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m112707constructorimpl(ResultKt.m97106a(th2));
                }
            }
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        RecyclerView recyclerView;
        C19658c c19658c = new C19658c(true, new ArrayList());
        c19658c.m36186h0().m108655C(new SubtitleDialogLoadMoreView());
        c19658c.m36186h0().m108673z(true);
        c19658c.m36186h0().m108672y(true);
        c19658c.m36186h0().m108657E(2);
        c19658c.m36186h0().m108656D(new InterfaceC27568f() { // from class: com.transsion.subtitle.fragment.l
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                SubtitleSearchResultListFragment.m82053G0(this.f62916a);
            }
        });
        c19658c.m36158R0(new C19679c());
        c19658c.m36227w1(new InterfaceC27566d() { // from class: com.transsion.subtitle.fragment.m
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                SubtitleSearchResultListFragment.m82054H0(this.f62917a, baseQuickAdapter, view, i11);
            }
        });
        this.resultAdapter = c19658c;
        C25432b c25432b = (C25432b) getMViewBinding();
        if (c25432b == null || (recyclerView = c25432b.f77025d) == null) {
            return;
        }
        recyclerView.setAdapter(this.resultAdapter);
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData(View view, Bundle savedInstanceState) {
        RecyclerView recyclerView;
        Intrinsics.m97802h(view, "view");
        super.initViewData(view, savedInstanceState);
        C25432b c25432b = (C25432b) getMViewBinding();
        if (c25432b == null || (recyclerView = c25432b.f77025d) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new C19678b());
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        String strM82158e;
        C3187b0 c3187b0M82253l;
        C3187b0 c3187b0M82256o;
        String subtitleResId;
        SubtitleDownloadViewModel subtitleDownloadViewModel = (SubtitleDownloadViewModel) new C3227v0(this).m14969a(SubtitleDownloadViewModel.class);
        DownloadBean downloadBean = this.downloadBean;
        if (downloadBean != null && (subtitleResId = downloadBean.getSubtitleResId()) != null) {
            subtitleDownloadViewModel.m82248g(subtitleResId);
        }
        this.viewModel = subtitleDownloadViewModel;
        String str = this.searchName;
        if (str == null || str.length() == 0) {
            strM82158e = SubtitleSearchHelper.f62938c.m82160a().m82158e(this.downloadBean);
        } else {
            strM82158e = this.searchName;
            Intrinsics.m97799e(strM82158e);
        }
        DownloadBean downloadBean2 = this.downloadBean;
        int se2 = downloadBean2 != null ? downloadBean2.getSe() : 0;
        DownloadBean downloadBean3 = this.downloadBean;
        this.keyword = new C19695i(strM82158e, se2, downloadBean3 != null ? downloadBean3.getEp() : 0);
        SubtitleDownloadViewModel subtitleDownloadViewModel2 = this.viewModel;
        if (subtitleDownloadViewModel2 != null && (c3187b0M82256o = subtitleDownloadViewModel2.m82256o()) != null) {
            c3187b0M82256o.m14851j(this, new C19680d(new Function1() { // from class: com.transsion.subtitle.fragment.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SubtitleSearchResultListFragment.m82055I0(this.f62914a, (SubtitleSearchListBean) obj);
                }
            }));
        }
        SubtitleDownloadViewModel subtitleDownloadViewModel3 = this.viewModel;
        if (subtitleDownloadViewModel3 == null || (c3187b0M82253l = subtitleDownloadViewModel3.m82253l()) == null) {
            return;
        }
        c3187b0M82253l.m14851j(this, new C19680d(new Function1() { // from class: com.transsion.subtitle.fragment.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubtitleSearchResultListFragment.m82056J0(this.f62915a, (C24469a) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.LazyFragment
    public void lazyLoadData() {
        m82082w0();
        m82066W0(true);
        loadData();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void loadDefaultData() {
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onComplete(final SubtitleDownloadTable dbBean) {
        Intrinsics.m97802h(dbBean, "dbBean");
        this.hasSubDownloading = false;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.transsion.subtitle.fragment.r
                @Override // java.lang.Runnable
                public final void run() {
                    SubtitleSearchResultListFragment.m82060N0(this.f62923a, dbBean);
                }
            });
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC19714h.a aVar = InterfaceC19714h.f62935a;
        aVar.m82148b().mo81941c(this);
        aVar.m82148b().mo81943e(this);
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onDownloading(int progress, SubtitleDownloadTable dbBean) {
        Intrinsics.m97802h(dbBean, "dbBean");
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onFail(Exception e11, final SubtitleDownloadTable dbBean) {
        Intrinsics.m97802h(e11, "e");
        Intrinsics.m97802h(dbBean, "dbBean");
        this.hasSubDownloading = false;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.transsion.subtitle.fragment.s
                @Override // java.lang.Runnable
                public final void run() {
                    SubtitleSearchResultListFragment.m82061O0(this.f62925a, dbBean);
                }
            });
        }
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onSaveDownload(SubtitleDownloadTable subtitleDownloadTable) {
        InterfaceC19743a.a.m82279a(this, subtitleDownloadTable);
    }

    @Override // com.transsion.subtitle_download.InterfaceC19743a
    public void onUnGzZip(SubtitleDownloadTable subtitleDownloadTable) {
        InterfaceC19743a.a.m82280b(this, subtitleDownloadTable);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.pageName = arguments.getString("KEY_PAGE_NAME", "");
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        m82066W0(true);
        loadData();
    }
}
