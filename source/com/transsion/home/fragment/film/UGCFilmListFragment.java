package com.transsion.home.fragment.film;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.FragmentActivity;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.view.TitleLayout;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.p282tn.lib.widget.R$color;
import com.p282tn.lib.widget.TnTextView;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.gslb.Utils;
import com.transsion.home.adapter.C14839e;
import com.transsion.home.bean.UGCRankAllData;
import com.transsion.home.bean.UgcGenreTopRespGenreItem;
import com.transsion.home.fragment.film.UGCFilmListFragment;
import com.transsion.home.p1000enum.HomeTabId;
import com.transsion.home.viewmodel.UGCFilmListViewModel;
import com.transsion.home.viewmodel.UGCRankingViewModel;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.ugcvideodetail.api.UGCVideoType;
import com.transsion.ugcvideodetail.api.bean.UGCCollection;
import com.transsion.ugcvideodetail.api.bean.UGCContent;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p550kj.C24655b;
import p550kj.C24662i;
import p552kl.C24691n;
import p579ll.C25646b;
import p579ll.InterfaceC25645a;
import p743rh.C27287m;
import p747rl.C27300a;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p822uv.AbstractC28040c;
import pg.C26866a;
import sh.C27621h;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u0000 a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u001d\u0010\u0012\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\r\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u0004J\r\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\u0004J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\u0007H\u0016¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010\u0004J\u001f\u00101\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u00100\u001a\u00020\u0018¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0018¢\u0006\u0004\b7\u0010\u001aR\u0018\u00104\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010A\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010<R\u0016\u0010C\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010<R\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010<R\u0016\u0010O\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010<R\u0016\u0010S\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010<R\u0018\u0010V\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010`\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010N¨\u0006b"}, m97100d2 = {"Lcom/transsion/home/fragment/film/UGCFilmListFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lkl/n;", "<init>", "()V", "Lcom/transsion/moviedetailapi/bean/Cover;", "cover", "", "G0", "(Lcom/transsion/moviedetailapi/bean/Cover;)V", "B0", "Lcom/transsion/home/adapter/e;", "x0", "()Lcom/transsion/home/adapter/e;", "reload", "", "Lcom/transsion/home/bean/UgcGenreTopRespGenreItem;", "filmList", "K0", "(Ljava/util/List;)V", "Landroid/view/LayoutInflater;", "inflater", "w0", "(Landroid/view/LayoutInflater;)Lkl/n;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "receiveArguments", "initViewData", "hideLoading", "startLoading", "initViewModel", "initListener", "", "isMonitorNetworkState", "()Z", "hidden", "onHiddenChanged", "(Z)V", "onPause", "retryLoadData", "loadDefaultData", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "onDestroy", "Lcom/transsion/home/bean/UGCRankAllData;", "data", "rankCategory", "L0", "(Lcom/transsion/home/bean/UGCRankAllData;Ljava/lang/String;)V", "Lcom/transsion/home/viewmodel/UGCRankingViewModel;", "viewModel", "H0", "(Lcom/transsion/home/viewmodel/UGCRankingViewModel;)V", "getPageName", "Lcom/transsion/home/viewmodel/UGCFilmListViewModel;", "a", "Lcom/transsion/home/viewmodel/UGCFilmListViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "tabId", "c", "fromOptId", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "filmType", "e", "mFilmListTitle", "Lll/b;", "f", "Lll/b;", "mExposureHelper", "g", "Lcom/transsion/home/adapter/e;", "mFilmListAdapter", "h", "mFilmListCover", "i", "Z", "isRankingMode", "j", "rankingCategory", CampaignEx.JSON_KEY_AD_K, "videoType", "l", "Lcom/transsion/home/viewmodel/UGCRankingViewModel;", "rankingViewModel", "Lrl/a;", "m", "Lrl/a;", "headerMaskManager", "", "n", "J", "firstLoadStartTimeMillis", "o", "hasRecordedFirstLoadDuration", TtmlNode.TAG_P, "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCFilmListFragment extends PageStatusFragment<C24691n> {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q */
    public static final int f52751q = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private UGCFilmListViewModel viewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private C25646b mExposureHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C14839e mFilmListAdapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isRankingMode;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private UGCRankingViewModel rankingViewModel;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private C27300a headerMaskManager;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private long firstLoadStartTimeMillis;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean hasRecordedFirstLoadDuration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String tabId = "0";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String fromOptId = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String filmType = "";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String mFilmListTitle = "";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String mFilmListCover = "";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String rankingCategory = "";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String videoType = "";

    /* JADX INFO: renamed from: com.transsion.home.fragment.film.UGCFilmListFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ UGCFilmListFragment m67650b(Companion companion, String str, String str2, String str3, boolean z11, String str4, String str5, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                z11 = false;
            }
            return companion.m67651a(str, str2, str3, z11, str4, str5);
        }

        /* JADX INFO: renamed from: a */
        public final UGCFilmListFragment m67651a(String tabId, String filmType, String mFilmListTitle, boolean z11, String videoType, String fromOptId) {
            Intrinsics.m97802h(tabId, "tabId");
            Intrinsics.m97802h(filmType, "filmType");
            Intrinsics.m97802h(mFilmListTitle, "mFilmListTitle");
            Intrinsics.m97802h(videoType, "videoType");
            Intrinsics.m97802h(fromOptId, "fromOptId");
            UGCFilmListFragment uGCFilmListFragment = new UGCFilmListFragment();
            uGCFilmListFragment.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("tabId", tabId), TuplesKt.m97108a("filmType", filmType), TuplesKt.m97108a("filmListTitle", mFilmListTitle), TuplesKt.m97108a("onlyShowList", Boolean.valueOf(z11)), TuplesKt.m97108a("videoType", videoType), TuplesKt.m97108a("fromOptId", fromOptId)));
            return uGCFilmListFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.film.UGCFilmListFragment$b */
    public static final class C15155b implements InterfaceC25645a {
        C15155b() {
        }

        @Override // p579ll.InterfaceC25645a
        /* JADX INFO: renamed from: a */
        public void mo67486a(int i11, long j11, View view) {
            String collectionId;
            String ugcVideoId;
            String subjectId;
            UGCVideo video;
            String ops;
            UGCVideo video2;
            UGCVideo video3;
            UGCVideo video4;
            UGCVideoBelongToCollection belongToCollection;
            List<Object> data;
            C14839e c14839e = UGCFilmListFragment.this.mFilmListAdapter;
            if (i11 >= ((c14839e == null || (data = c14839e.getData()) == null) ? 0 : data.size())) {
                return;
            }
            C14839e c14839e2 = UGCFilmListFragment.this.mFilmListAdapter;
            UGCContent uGCContent = c14839e2 != null ? (UGCContent) c14839e2.getItem(i11) : null;
            HashMap map = new HashMap();
            map.put("browse_duration", String.valueOf(j11));
            map.put("module_name", WebConstants.FIELD_ITEM);
            if (UGCFilmListFragment.this.isRankingMode) {
                map.put("rank_category", UGCFilmListFragment.this.rankingCategory);
            }
            String str = "";
            if (uGCContent == null || (video4 = uGCContent.getVideo()) == null || (belongToCollection = video4.getBelongToCollection()) == null || (collectionId = belongToCollection.getCollectionId()) == null) {
                collectionId = "";
            }
            map.put("belong_to_collection_id", collectionId);
            if (uGCContent == null || (video3 = uGCContent.getVideo()) == null || (ugcVideoId = video3.getUgcVideoId()) == null) {
                ugcVideoId = "";
            }
            map.put("content_id", ugcVideoId);
            if (uGCContent == null || (video2 = uGCContent.getVideo()) == null || (subjectId = video2.getSubjectId()) == null) {
                subjectId = "";
            }
            map.put("refer_subject_id", subjectId);
            map.put("content_type", "ugc_video");
            if (uGCContent != null && (video = uGCContent.getVideo()) != null && (ops = video.getOps()) != null) {
                str = ops;
            }
            map.put("ops", str);
            map.put(CampaignEx.JSON_KEY_TITLE, UGCFilmListFragment.this.isRankingMode ? UGCFilmListFragment.this.rankingCategory : UGCFilmListFragment.this.mFilmListTitle);
            C14450a.f50860a.m65142e(UGCFilmListFragment.this.getPageName(), map);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.film.UGCFilmListFragment$c */
    static final class C15156c implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f52768a;

        C15156c(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f52768a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f52768a;
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
            this.f52768a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m67621A0(UGCFilmListFragment uGCFilmListFragment, BaseQuickAdapter adapter, View view, int i11) {
        String subjectId;
        String ops;
        UGCVideoBelongToCollection belongToCollection;
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "view");
        Object item = adapter.getItem(i11);
        if (item instanceof UGCContent) {
            UGCContent uGCContent = (UGCContent) item;
            String collectionId = null;
            AbstractC28040c.m109009f(uGCContent, null, null, 3, null);
            UGCVideo video = uGCContent.getVideo();
            String ugcVideoId = video != null ? video.getUgcVideoId() : null;
            UGCVideo video2 = uGCContent.getVideo();
            if (video2 != null && (belongToCollection = video2.getBelongToCollection()) != null) {
                collectionId = belongToCollection.getCollectionId();
            }
            C26866a.a.m104898f(C26866a.f81698a, "FilmListFragment", "initFilmListAdapter: item clicked, position=" + i11 + ", topicType=" + uGCContent.getTopicType() + ", videoId=" + ugcVideoId + ", collectionId=" + collectionId, false, 4, null);
            HashMap map = new HashMap();
            map.put("module_name", WebConstants.FIELD_ITEM);
            if (uGCFilmListFragment.isRankingMode) {
                map.put("rank_category", uGCFilmListFragment.rankingCategory);
            }
            String str = "";
            if (collectionId == null) {
                collectionId = "";
            }
            map.put("belong_to_collection_id", collectionId);
            if (ugcVideoId == null) {
                ugcVideoId = "";
            }
            map.put("content_id", ugcVideoId);
            UGCVideo video3 = uGCContent.getVideo();
            if (video3 == null || (subjectId = video3.getSubjectId()) == null) {
                subjectId = "";
            }
            map.put("refer_subject_id", subjectId);
            map.put("content_type", "ugc_video");
            UGCVideo video4 = uGCContent.getVideo();
            if (video4 != null && (ops = video4.getOps()) != null) {
                str = ops;
            }
            map.put("ops", str);
            C14450a.f50860a.m65143f(uGCFilmListFragment.getPageName(), map);
        }
    }

    /* JADX INFO: renamed from: B0 */
    private final void m67622B0() {
        RecyclerView recyclerView;
        SwipeRefreshLayout swipeRefreshLayout;
        C24691n mViewBinding = getMViewBinding();
        if (mViewBinding != null && (swipeRefreshLayout = mViewBinding.f75520f) != null) {
            swipeRefreshLayout.setEnabled(true);
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: ol.e
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
                /* JADX INFO: renamed from: a */
                public final void mo21823a() {
                    UGCFilmListFragment.m67623C0(this.f80067a);
                }
            });
        }
        C24691n mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (recyclerView = mViewBinding2.f75519e) == null) {
            return;
        }
        recyclerView.setLayoutManager(new NpaLinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        C25646b c25646b = new C25646b(0.6f, new C15155b(), false, 4, null);
        c25646b.m100946l(2);
        recyclerView.addOnScrollListener(c25646b);
        this.mExposureHelper = c25646b;
        recyclerView.setAdapter(m67644x0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m67623C0(UGCFilmListFragment uGCFilmListFragment) {
        C26866a.a.m104898f(C26866a.f81698a, "FilmListFragment", "initRecyclerView: user pull to refresh", false, 4, null);
        C25646b c25646b = uGCFilmListFragment.mExposureHelper;
        if (c25646b != null) {
            c25646b.m100943e();
        }
        if (uGCFilmListFragment.isRankingMode) {
            UGCRankingViewModel uGCRankingViewModel = uGCFilmListFragment.rankingViewModel;
            if (uGCRankingViewModel != null) {
                uGCRankingViewModel.m69109n();
                return;
            }
            return;
        }
        UGCFilmListViewModel uGCFilmListViewModel = uGCFilmListFragment.viewModel;
        if (uGCFilmListViewModel != null) {
            uGCFilmListViewModel.m69079p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m67624D0(UGCFilmListFragment uGCFilmListFragment, View view) {
        FragmentActivity activity = uGCFilmListFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final Unit m67625E0(UGCFilmListFragment uGCFilmListFragment, String str) {
        TitleLayout titleLayout;
        TitleLayout titleLayout2;
        TnTextView tvTitleText;
        CharSequence text;
        if (!uGCFilmListFragment.isRankingMode) {
            C24691n mViewBinding = uGCFilmListFragment.getMViewBinding();
            String string = (mViewBinding == null || (titleLayout2 = mViewBinding.f75521g) == null || (tvTitleText = titleLayout2.getTvTitleText()) == null || (text = tvTitleText.getText()) == null) ? null : text.toString();
            if ((string == null || string.length() == 0) && str != null && str.length() > 0) {
                C26866a.a.m104898f(C26866a.f81698a, "FilmListFragment", "filmListDescLiveData: set title from desc='" + str + "'", false, 4, null);
                uGCFilmListFragment.mFilmListTitle = str;
                C24691n mViewBinding2 = uGCFilmListFragment.getMViewBinding();
                if (mViewBinding2 != null && (titleLayout = mViewBinding2.f75521g) != null) {
                    titleLayout.setTitleText(str);
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final Unit m67626F0(UGCFilmListFragment uGCFilmListFragment, List list) {
        List listL;
        C14839e c14839e;
        List<Object> data;
        SwipeRefreshLayout swipeRefreshLayout;
        C27941f c27941fM36186h0;
        List<Object> data2;
        List<Object> data3;
        HashMap mapM96844g;
        List<Object> data4;
        C27941f c27941fM36186h1;
        C14839e c14839e2;
        C27941f c27941fM36186h2;
        SwipeRefreshLayout swipeRefreshLayout2;
        if (list != null) {
            List list2 = list;
            listL = new ArrayList(CollectionsKt.m97516v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                listL.add(((UgcGenreTopRespGenreItem) it.next()).getUgcContent());
            }
        } else {
            listL = CollectionsKt.m97506l();
        }
        C26866a.a aVar = C26866a.f81698a;
        Integer numValueOf = list != null ? Integer.valueOf(list.size()) : null;
        int size = listL.size();
        boolean z11 = list == null;
        C26866a.a.m104898f(aVar, "FilmListFragment", "filmListLiveData: data received, rawItems=" + numValueOf + ", flattened=" + size + ", isNull=" + z11 + ", isRankingMode=" + uGCFilmListFragment.isRankingMode, false, 4, null);
        if (!uGCFilmListFragment.isRankingMode) {
            uGCFilmListFragment.showContentView();
        }
        C24691n mViewBinding = uGCFilmListFragment.getMViewBinding();
        if (mViewBinding != null && (swipeRefreshLayout2 = mViewBinding.f75520f) != null) {
            swipeRefreshLayout2.setRefreshing(false);
        }
        C14839e c14839e3 = uGCFilmListFragment.mFilmListAdapter;
        if (c14839e3 != null && (c27941fM36186h1 = c14839e3.m36186h0()) != null && c27941fM36186h1.m108666r() && (c14839e2 = uGCFilmListFragment.mFilmListAdapter) != null && (c27941fM36186h2 = c14839e2.m36186h0()) != null) {
            c27941fM36186h2.m108667s();
        }
        if (list != null) {
            C14839e c14839e4 = uGCFilmListFragment.mFilmListAdapter;
            boolean z12 = (c14839e4 == null || (data4 = c14839e4.getData()) == null || !data4.isEmpty()) ? false : true;
            if (!uGCFilmListFragment.isRankingMode && z12 && !uGCFilmListFragment.hasRecordedFirstLoadDuration && uGCFilmListFragment.firstLoadStartTimeMillis > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - uGCFilmListFragment.firstLoadStartTimeMillis;
                C24655b logViewConfig = uGCFilmListFragment.getLogViewConfig();
                if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
                    mapM96844g.put("load_duration", String.valueOf(jCurrentTimeMillis));
                }
                uGCFilmListFragment.hasRecordedFirstLoadDuration = true;
            }
            int size2 = listL.size();
            C14839e c14839e5 = uGCFilmListFragment.mFilmListAdapter;
            Integer numValueOf2 = (c14839e5 == null || (data3 = c14839e5.getData()) == null) ? null : Integer.valueOf(data3.size());
            UGCFilmListViewModel uGCFilmListViewModel = uGCFilmListFragment.viewModel;
            C26866a.a.m104898f(aVar, "FilmListFragment", "filmListLiveData: received " + size2 + " contents, currentListSize=" + numValueOf2 + ", hasMore=" + (uGCFilmListViewModel != null ? Boolean.valueOf(uGCFilmListViewModel.m69075l()) : null), false, 4, null);
            UGCFilmListViewModel uGCFilmListViewModel2 = uGCFilmListFragment.viewModel;
            if (uGCFilmListViewModel2 == null || !uGCFilmListViewModel2.m69075l()) {
                C26866a.a.m104898f(aVar, "FilmListFragment", "filmListLiveData: no more data, load more end", false, 4, null);
                C14839e c14839e6 = uGCFilmListFragment.mFilmListAdapter;
                if (c14839e6 != null && (c27941fM36186h0 = c14839e6.m36186h0()) != null) {
                    C27941f.m108652u(c27941fM36186h0, false, 1, null);
                }
            }
            C14839e c14839e7 = uGCFilmListFragment.mFilmListAdapter;
            if (c14839e7 == null || (data2 = c14839e7.getData()) == null || !data2.isEmpty() || size2 != 0) {
                uGCFilmListFragment.m67630K0(list);
            } else {
                C26866a.a.m104898f(aVar, "FilmListFragment", "filmListLiveData: empty data, isRankingMode=" + uGCFilmListFragment.isRankingMode, false, 4, null);
                if (!uGCFilmListFragment.isRankingMode) {
                    uGCFilmListFragment.showEmptyView(true);
                }
            }
            C24655b logViewConfig2 = uGCFilmListFragment.getLogViewConfig();
            if (logViewConfig2 != null) {
                logViewConfig2.m96848k(true);
            }
        } else {
            aVar.m104915i("FilmListFragment", "filmListLiveData: data is null, isRankingMode=" + uGCFilmListFragment.isRankingMode, true);
            C24691n mViewBinding2 = uGCFilmListFragment.getMViewBinding();
            if (mViewBinding2 != null && (swipeRefreshLayout = mViewBinding2.f75520f) != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            if (!uGCFilmListFragment.isRankingMode && (c14839e = uGCFilmListFragment.mFilmListAdapter) != null && (data = c14839e.getData()) != null && data.isEmpty()) {
                uGCFilmListFragment.showEmptyView(true);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: G0 */
    private final void m67627G0(Cover cover) {
        String averageHueDark;
        Object objM112707constructorimpl;
        ImageView imageView;
        String url;
        String thumbnail;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        C24691n mViewBinding = getMViewBinding();
        String str = "";
        if (mViewBinding != null && (imageView = mViewBinding.f75517c) != null) {
            C23860f.b bVarM94457m = C23860f.f72909a.m94457m(activity);
            if (cover == null || (url = cover.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
            if (cover == null || (thumbnail = cover.getThumbnail()) == null) {
                thumbnail = "";
            }
            bVarM94468g.m94473l(thumbnail).m94465d(imageView);
        }
        if (cover == null || (averageHueDark = cover.getAverageHueDark()) == null) {
            return;
        }
        Unit unit = null;
        if (StringsKt.m98132c0(averageHueDark, Utils.SEPARATOR, false, 2, null)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                String averageHueDark2 = cover.getAverageHueDark();
                if (averageHueDark2 != null) {
                    str = averageHueDark2;
                }
                int color = Color.parseColor(str);
                C27300a c27300a = this.headerMaskManager;
                if (c27300a != null) {
                    c27300a.m106380a(Integer.valueOf(color));
                    unit = Unit.f75682a;
                }
                objM112707constructorimpl = Result.m112707constructorimpl(unit);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null) {
                C26866a.a.m104901l(C26866a.f81698a, "FilmListFragment", "initRecyclerView: parseColor failed, use default color", false, 4, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final Unit m67628I0(final UGCFilmListFragment uGCFilmListFragment, final UGCRankAllData uGCRankAllData) {
        RecyclerView recyclerView;
        C27941f c27941fM36186h0;
        Pager pager;
        List<UGCContent> items;
        C26866a.a aVar = C26866a.f81698a;
        Boolean hasMore = null;
        Integer numValueOf = (uGCRankAllData == null || (items = uGCRankAllData.getItems()) == null) ? null : Integer.valueOf(items.size());
        if (uGCRankAllData != null && (pager = uGCRankAllData.getPager()) != null) {
            hasMore = pager.getHasMore();
        }
        C26866a.a.m104898f(aVar, "FilmListFragment", "loadMoreLiveData: received data, items size=" + numValueOf + ", hasMore=" + hasMore, false, 4, null);
        if (uGCRankAllData == null) {
            C26866a.a.m104910z(aVar, "FilmListFragment", "loadMoreLiveData: data is null, load more failed", false, 4, null);
            C14839e c14839e = uGCFilmListFragment.mFilmListAdapter;
            if (c14839e != null && (c27941fM36186h0 = c14839e.m36186h0()) != null) {
                c27941fM36186h0.m108669v();
            }
        } else {
            List<UGCContent> items2 = uGCRankAllData.getItems();
            if (items2 == null) {
                items2 = CollectionsKt.m97506l();
            }
            List<UGCContent> list = items2;
            C26866a.a.m104898f(aVar, "FilmListFragment", "loadMoreLiveData: add " + list.size() + " items to list", false, 4, null);
            C14839e c14839e2 = uGCFilmListFragment.mFilmListAdapter;
            if (c14839e2 != null) {
                c14839e2.mo36208q(list);
            }
            C24691n mViewBinding = uGCFilmListFragment.getMViewBinding();
            if (mViewBinding != null && (recyclerView = mViewBinding.f75519e) != null) {
                recyclerView.postDelayed(new Runnable() { // from class: ol.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        UGCFilmListFragment.m67629J0(this.f80068a, uGCRankAllData);
                    }
                }, 300L);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final void m67629J0(UGCFilmListFragment uGCFilmListFragment, UGCRankAllData uGCRankAllData) {
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        C14839e c14839e;
        C27941f c27941fM36186h2;
        C14839e c14839e2 = uGCFilmListFragment.mFilmListAdapter;
        if (c14839e2 != null && (c27941fM36186h1 = c14839e2.m36186h0()) != null && c27941fM36186h1.m108666r() && (c14839e = uGCFilmListFragment.mFilmListAdapter) != null && (c27941fM36186h2 = c14839e.m36186h0()) != null) {
            c27941fM36186h2.m108667s();
        }
        Pager pager = uGCRankAllData.getPager();
        if (pager != null ? Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE) : false) {
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "FilmListFragment", "loadMoreLiveData: no more data, load more end", false, 4, null);
        C14839e c14839e3 = uGCFilmListFragment.mFilmListAdapter;
        if (c14839e3 == null || (c27941fM36186h0 = c14839e3.m36186h0()) == null) {
            return;
        }
        C27941f.m108652u(c27941fM36186h0, false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: K0 */
    private final void m67630K0(List filmList) {
        boolean z11;
        HashMap mapM96844g;
        UGCVideo video;
        UGCVideo video2;
        UGCCollection collection;
        UGCVideo video3;
        Cover cover;
        List<Object> data;
        List<Object> data2;
        ArrayList arrayList = new ArrayList();
        Iterator it = filmList.iterator();
        while (it.hasNext()) {
            UGCContent ugcContent = ((UgcGenreTopRespGenreItem) it.next()).getUgcContent();
            if (ugcContent != null) {
                arrayList.add(ugcContent);
            }
        }
        C14839e c14839e = this.mFilmListAdapter;
        size = 0;
        int size = 0;
        int size2 = (c14839e == null || (data2 = c14839e.getData()) == null) ? 0 : data2.size();
        UGCFilmListViewModel uGCFilmListViewModel = this.viewModel;
        boolean zM69077n = uGCFilmListViewModel != null ? uGCFilmListViewModel.m69077n() : false;
        Cover cover2 = null;
        if (zM69077n || size2 == 0) {
            C25646b c25646b = this.mExposureHelper;
            if (c25646b != null) {
                c25646b.m100943e();
            }
            UGCContent uGCContent = (UGCContent) CollectionsKt.m97361k0(arrayList);
            if (!Intrinsics.m97797c((uGCContent == null || (video2 = uGCContent.getVideo()) == null) ? null : video2.getCategory(), UGCVideoType.EDUCATION.getValue())) {
                C14839e c14839e2 = this.mFilmListAdapter;
                z11 = c14839e2 != null ? c14839e2.getIsEducationList() : false;
            }
            C14839e c14839e3 = this.mFilmListAdapter;
            if (c14839e3 != null) {
                c14839e3.m66714R1(z11);
            }
            C14839e c14839e4 = this.mFilmListAdapter;
            if (c14839e4 != null) {
                c14839e4.mo36201n1(arrayList);
            }
            C24655b logViewConfig = getLogViewConfig();
            if (logViewConfig != null && (mapM96844g = logViewConfig.m96844g()) != null) {
                UGCContent uGCContent2 = (UGCContent) CollectionsKt.m97361k0(arrayList);
                mapM96844g.put("ops", (uGCContent2 == null || (video = uGCContent2.getVideo()) == null) ? null : video.getOps());
            }
            C26866a.a.m104898f(C26866a.f81698a, "FilmListFragment", "updateData: refresh or first load, replace data. size: " + size2 + " -> " + arrayList.size(), false, 4, null);
        } else {
            C14839e c14839e5 = this.mFilmListAdapter;
            if (c14839e5 != null) {
                c14839e5.mo36208q(arrayList);
            }
            C14839e c14839e6 = this.mFilmListAdapter;
            if (c14839e6 != null && (data = c14839e6.getData()) != null) {
                size = data.size();
            }
            C26866a.a.m104898f(C26866a.f81698a, "FilmListFragment", "updateData: load more, add " + arrayList.size() + " items, list size: " + size2 + " -> " + size, false, 4, null);
        }
        if ((zM69077n || size2 == 0) && !arrayList.isEmpty()) {
            UGCContent uGCContent3 = (UGCContent) CollectionsKt.m97361k0(arrayList);
            if (uGCContent3 != null && (video3 = uGCContent3.getVideo()) != null && (cover = video3.getCover()) != null) {
                cover2 = cover;
            } else if (uGCContent3 != null && (collection = uGCContent3.getCollection()) != null) {
                cover2 = collection.getCover();
            }
            C26866a.a.m104898f(C26866a.f81698a, "FilmListFragment", "updateData: refresh or first load, set top ", false, 4, null);
            if (this.isRankingMode) {
                return;
            }
            m67627G0(cover2);
        }
    }

    private final void reload() {
        if (C27287m.f83003a.m106330e()) {
            loadDefaultData();
        } else {
            showLoadingView();
            showNoNetworkViewDelayed();
        }
    }

    /* JADX INFO: renamed from: x0 */
    private final C14839e m67644x0() {
        C14839e c14839e = new C14839e(new ArrayList(), this.mExposureHelper, this.isRankingMode, HomeTabId.INSTANCE.m67539h(StringsKt.m98216v(this.tabId), false) || StringsKt.m98227H(UGCVideoType.EDUCATION.getValue(), this.videoType, true));
        c14839e.m36186h0().m108673z(true);
        c14839e.m36186h0().m108672y(true);
        c14839e.m36186h0().m108656D(new InterfaceC27568f() { // from class: ol.g
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                UGCFilmListFragment.m67645y0(this.f80070a);
            }
        });
        c14839e.m36227w1(new InterfaceC27566d() { // from class: ol.h
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                UGCFilmListFragment.m67621A0(this.f80071a, baseQuickAdapter, view, i11);
            }
        });
        this.mFilmListAdapter = c14839e;
        Intrinsics.m97799e(c14839e);
        return c14839e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m67645y0(final UGCFilmListFragment uGCFilmListFragment) {
        RecyclerView recyclerView;
        if (!C27287m.f83003a.m106330e()) {
            C26866a.a.m104910z(C26866a.f81698a, "FilmListFragment", "initFilmListAdapter: no network, load more failed", false, 4, null);
            C24691n mViewBinding = uGCFilmListFragment.getMViewBinding();
            if (mViewBinding == null || (recyclerView = mViewBinding.f75519e) == null) {
                return;
            }
            recyclerView.postDelayed(new Runnable() { // from class: ol.i
                @Override // java.lang.Runnable
                public final void run() {
                    UGCFilmListFragment.m67646z0(this.f80072a);
                }
            }, 300L);
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "FilmListFragment", "initFilmListAdapter: trigger load more, isRankingMode=" + uGCFilmListFragment.isRankingMode, false, 4, null);
        if (uGCFilmListFragment.isRankingMode) {
            UGCRankingViewModel uGCRankingViewModel = uGCFilmListFragment.rankingViewModel;
            if (uGCRankingViewModel != null) {
                uGCRankingViewModel.m69108m();
                return;
            }
            return;
        }
        UGCFilmListViewModel uGCFilmListViewModel = uGCFilmListFragment.viewModel;
        if (uGCFilmListViewModel != null) {
            uGCFilmListViewModel.m69078o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m67646z0(UGCFilmListFragment uGCFilmListFragment) {
        C27941f c27941fM36186h0;
        C14839e c14839e = uGCFilmListFragment.mFilmListAdapter;
        if (c14839e == null || (c27941fM36186h0 = c14839e.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: renamed from: H0 */
    public final void m67647H0(UGCRankingViewModel viewModel) {
        Intrinsics.m97802h(viewModel, "viewModel");
        C26866a.a.m104898f(C26866a.f81698a, "FilmListFragment", "setupRankingViewModel: setup ranking mode, disable self error handling", false, 4, null);
        this.rankingViewModel = viewModel;
        this.isRankingMode = true;
        viewModel.m69105j().m14857p(this);
        viewModel.m69105j().m14851j(this, new C15156c(new Function1() { // from class: ol.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UGCFilmListFragment.m67628I0(this.f80066a, (UGCRankAllData) obj);
            }
        }));
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    /* JADX INFO: renamed from: L0 */
    public final void m67648L0(UGCRankAllData data, String rankCategory) {
        List<UGCContent> items;
        boolean z11;
        C27941f c27941fM36186h0;
        SwipeRefreshLayout swipeRefreshLayout;
        RecyclerView recyclerView;
        C27941f c27941fM36186h1;
        C27941f c27941fM36186h2;
        UGCContent uGCContent;
        UGCVideo video;
        HashMap mapM96844g;
        List<UGCContent> items2;
        Intrinsics.m97802h(rankCategory, "rankCategory");
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "FilmListFragment", "updateRankData: items size=" + ((data == null || (items2 = data.getItems()) == null) ? null : Integer.valueOf(items2.size())) + ", title=" + (data != null ? data.getTitle() : null), false, 4, null);
        this.isRankingMode = true;
        if (data == null || (items = data.getItems()) == null || items.isEmpty()) {
            this.rankingCategory = rankCategory;
            showEmptyView(false);
            C26866a.a.m104910z(aVar, "FilmListFragment", "updateRankData: data is null", false, 4, null);
            return;
        }
        C25646b c25646b = this.mExposureHelper;
        if (c25646b != null) {
            c25646b.m100943e();
        }
        this.rankingCategory = rankCategory;
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96850m(false);
        }
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 != null) {
            logViewConfig2.m96848k(true);
        }
        C24655b logViewConfig3 = getLogViewConfig();
        if (logViewConfig3 != null && (mapM96844g = logViewConfig3.m96844g()) != null && this.isRankingMode) {
            mapM96844g.put("rank_category", rankCategory);
        }
        List<UGCContent> items3 = data.getItems();
        C26866a.a.m104898f(aVar, "FilmListFragment", "updateRankData: items from " + (items3 != null ? Integer.valueOf(items3.size()) : null) + " ugcContent", false, 4, null);
        List<UGCContent> items4 = data.getItems();
        if (Intrinsics.m97797c((items4 == null || (uGCContent = (UGCContent) CollectionsKt.m97361k0(items4)) == null || (video = uGCContent.getVideo()) == null) ? null : video.getCategory(), UGCVideoType.EDUCATION.getValue())) {
            z11 = true;
        } else {
            C14839e c14839e = this.mFilmListAdapter;
            if (c14839e != null ? c14839e.getIsEducationList() : false) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        C14839e c14839e2 = this.mFilmListAdapter;
        if (c14839e2 != null) {
            c14839e2.m66714R1(z11);
        }
        C14839e c14839e3 = this.mFilmListAdapter;
        if (c14839e3 != null) {
            c14839e3.mo36201n1(data.getItems());
        }
        Pager pager = data.getPager();
        if (pager != null ? Intrinsics.m97797c(pager.getHasMore(), Boolean.TRUE) : false) {
            C26866a.a.m104898f(aVar, "FilmListFragment", "updateRankData: has more data, enable load more", false, 4, null);
            C14839e c14839e4 = this.mFilmListAdapter;
            if (c14839e4 != null && (c27941fM36186h2 = c14839e4.m36186h0()) != null) {
                c27941fM36186h2.m108673z(true);
            }
            C14839e c14839e5 = this.mFilmListAdapter;
            if (c14839e5 != null && (c27941fM36186h1 = c14839e5.m36186h0()) != null) {
                c27941fM36186h1.m108672y(true);
            }
        } else {
            C26866a.a.m104898f(aVar, "FilmListFragment", "updateRankData: no more data, load more end", false, 4, null);
            C14839e c14839e6 = this.mFilmListAdapter;
            if (c14839e6 != null && (c27941fM36186h0 = c14839e6.m36186h0()) != null) {
                C27941f.m108652u(c27941fM36186h0, false, 1, null);
            }
        }
        C24691n mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView = mViewBinding.f75519e) != null) {
            recyclerView.scrollToPosition(0);
        }
        C24691n mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (swipeRefreshLayout = mViewBinding2.f75520f) != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        showContentView();
    }

    public final String getPageName() {
        return this.isRankingMode ? "/home/ugc_ranking" : "/home/ugc_film_list";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    public final void hideLoading() {
        SwipeRefreshLayout swipeRefreshLayout;
        C24691n mViewBinding = getMViewBinding();
        if (mViewBinding == null || (swipeRefreshLayout = mViewBinding.f75520f) == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        TitleLayout titleLayout;
        SwipeRefreshLayout swipeRefreshLayout;
        View view;
        View view2;
        ImageView imageView;
        TitleLayout titleLayout2;
        if (this.isRankingMode) {
            C26866a.a.m104898f(C26866a.f81698a, "FilmListFragment", "initViewData: onlyShowList mode, hide header views", false, 4, null);
            C24691n mViewBinding = getMViewBinding();
            if (mViewBinding != null && (titleLayout2 = mViewBinding.f75521g) != null) {
                AbstractC26006c.m102054g(titleLayout2);
            }
            C24691n mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (imageView = mViewBinding2.f75517c) != null) {
                AbstractC26006c.m102054g(imageView);
            }
            C24691n mViewBinding3 = getMViewBinding();
            if (mViewBinding3 != null && (view2 = mViewBinding3.f75518d) != null) {
                AbstractC26006c.m102054g(view2);
            }
            C24691n mViewBinding4 = getMViewBinding();
            if (mViewBinding4 != null && (view = mViewBinding4.f75516b) != null) {
                AbstractC26006c.m102054g(view);
            }
            C24691n mViewBinding5 = getMViewBinding();
            if (mViewBinding5 != null && (swipeRefreshLayout = mViewBinding5.f75520f) != null) {
                ViewGroup.LayoutParams layoutParams = swipeRefreshLayout.getLayoutParams();
                ConstraintLayout.C2308b c2308b = layoutParams instanceof ConstraintLayout.C2308b ? (ConstraintLayout.C2308b) layoutParams : null;
                if (c2308b != null) {
                    c2308b.f7968i = 0;
                    swipeRefreshLayout.setLayoutParams(c2308b);
                }
            }
        } else {
            C24691n mViewBinding6 = getMViewBinding();
            if (mViewBinding6 != null && (titleLayout = mViewBinding6.f75521g) != null) {
                titleLayout.setLeftOnclick(new View.OnClickListener() { // from class: ol.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        UGCFilmListFragment.m67624D0(this.f80063a, view3);
                    }
                });
                C27621h c27621h = C27621h.f84745a;
                Context context = titleLayout.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                titleLayout.setPadding(0, c27621h.m107454d(context), 0, 0);
                titleLayout.setTitleTextColor(titleLayout.getResources().getColor(R$color.white_100));
                titleLayout.setTitleText(this.mFilmListTitle);
                titleLayout.setTitleMaxWidth(Integer.MAX_VALUE);
            }
            C24691n mViewBinding7 = getMViewBinding();
            ImageView imageView2 = mViewBinding7 != null ? mViewBinding7.f75517c : null;
            C24691n mViewBinding8 = getMViewBinding();
            this.headerMaskManager = new C27300a(imageView2, mViewBinding8 != null ? mViewBinding8.f75516b : null);
            pageStateFitStatusBar();
        }
        m67622B0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        C3187b0 c3187b0M69074k;
        C3187b0 c3187b0M69073j;
        if (this.isRankingMode) {
            C26866a.a.m104898f(C26866a.f81698a, "FilmListFragment", "initViewModel: ranking mode, skip init self viewmodel", false, 4, null);
            return;
        }
        UGCFilmListViewModel uGCFilmListViewModel = (UGCFilmListViewModel) new C3227v0(this).m14969a(UGCFilmListViewModel.class);
        this.viewModel = uGCFilmListViewModel;
        if (uGCFilmListViewModel != null) {
            uGCFilmListViewModel.m69076m(this.filmType);
        }
        C26866a.a.m104898f(C26866a.f81698a, "FilmListFragment", "initViewModel: ViewModel initialized with filmListId=" + this.filmType, false, 4, null);
        if (!this.hasRecordedFirstLoadDuration && this.firstLoadStartTimeMillis == 0) {
            this.firstLoadStartTimeMillis = System.currentTimeMillis();
        }
        UGCFilmListViewModel uGCFilmListViewModel2 = this.viewModel;
        if (uGCFilmListViewModel2 != null && (c3187b0M69073j = uGCFilmListViewModel2.m69073j()) != null) {
            c3187b0M69073j.m14851j(this, new C15156c(new Function1() { // from class: ol.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return UGCFilmListFragment.m67625E0(this.f80064a, (String) obj);
                }
            }));
        }
        UGCFilmListViewModel uGCFilmListViewModel3 = this.viewModel;
        if (uGCFilmListViewModel3 == null || (c3187b0M69074k = uGCFilmListViewModel3.m69074k()) == null) {
            return;
        }
        c3187b0M69074k.m14851j(this, new C15156c(new Function1() { // from class: ol.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UGCFilmListFragment.m67626F0(this.f80065a, (List) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isMonitorNetworkState() {
        return true;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void loadDefaultData() {
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "FilmListFragment", "loadDefaultData: start loading default data, isRankingMode=" + this.isRankingMode, false, 4, null);
        if (this.isRankingMode) {
            C26866a.a.m104898f(aVar, "FilmListFragment", "loadDefaultData: ranking mode, skip self loading", false, 4, null);
            return;
        }
        if (!C27287m.f83003a.m106330e()) {
            C26866a.a.m104910z(aVar, "FilmListFragment", "loadDefaultData: no network available", false, 4, null);
            return;
        }
        showLoadingView();
        if (!this.hasRecordedFirstLoadDuration && this.firstLoadStartTimeMillis == 0) {
            this.firstLoadStartTimeMillis = System.currentTimeMillis();
        }
        UGCFilmListViewModel uGCFilmListViewModel = this.viewModel;
        if (uGCFilmListViewModel != null) {
            uGCFilmListViewModel.m69079p();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b(getPageName(), false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C25646b c25646b = this.mExposureHelper;
        if (c25646b != null) {
            c25646b.m100943e();
        }
        this.mExposureHelper = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                logPause();
            } else {
                logResume();
            }
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C25646b c25646b = this.mExposureHelper;
        if (c25646b != null) {
            c25646b.m100943e();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void receiveArguments() {
        HashMap mapM96844g;
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("tabId", "0");
            Intrinsics.m97801g(string, "getString(...)");
            this.tabId = string;
            String string2 = arguments.getString("filmType", "");
            Intrinsics.m97801g(string2, "getString(...)");
            this.filmType = string2;
            String string3 = arguments.getString("filmListTitle", "");
            Intrinsics.m97801g(string3, "getString(...)");
            this.mFilmListTitle = string3;
            this.isRankingMode = arguments.getBoolean("onlyShowList", false);
            String string4 = arguments.getString("videoType", "");
            Intrinsics.m97801g(string4, "getString(...)");
            this.videoType = string4;
            String string5 = arguments.getString("fromOptId", "");
            Intrinsics.m97801g(string5, "getString(...)");
            this.fromOptId = string5;
        }
        C26866a.a.m104898f(C26866a.f81698a, "FilmListFragment", "receiveArguments: filmListId=" + this.filmType + ", title=" + this.mFilmListTitle + ", cover=" + this.mFilmListCover + ", onlyShowList=" + this.isRankingMode, false, 4, null);
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig == null || (mapM96844g = logViewConfig.m96844g()) == null) {
            return;
        }
        mapM96844g.put(WebConstants.PAGE_FROM, C24662i.f75350a.m96877i());
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        List<Object> data;
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "FilmListFragment", "retryLoadData: retry loading data, isRankingMode=" + this.isRankingMode, false, 4, null);
        if (this.isRankingMode) {
            C26866a.a.m104898f(aVar, "FilmListFragment", "retryLoadData: ranking mode, skip self retry", false, 4, null);
            return;
        }
        C14839e c14839e = this.mFilmListAdapter;
        if (c14839e != null && (data = c14839e.getData()) != null && data.isEmpty()) {
            reload();
            return;
        }
        C14839e c14839e2 = this.mFilmListAdapter;
        if (c14839e2 == null || c14839e2.m36186h0().m108661i() != LoadMoreStatus.Fail) {
            return;
        }
        c14839e2.m36186h0().m108670w();
    }

    public final void startLoading() {
        SwipeRefreshLayout swipeRefreshLayout;
        C24691n mViewBinding = getMViewBinding();
        if (mViewBinding == null || (swipeRefreshLayout = mViewBinding.f75520f) == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(true);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public C24691n getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24691n c24691nM96979c = C24691n.m96979c(inflater);
        Intrinsics.m97801g(c24691nM96979c, "inflate(...)");
        return c24691nM96979c;
    }
}
