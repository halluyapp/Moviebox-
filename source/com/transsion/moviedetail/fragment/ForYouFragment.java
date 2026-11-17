package com.transsion.moviedetail.fragment;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.core.util.AbstractC2480k;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.AbstractC3226v;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import ck.AbstractC5114k;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5790i;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.widget.R$mipmap;
import com.p282tn.lib.widget.R$string;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.activity.AbstractC14517k;
import com.transsion.baseui.fragment.PageStatusFragment;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.moviedetail.R$layout;
import com.transsion.moviedetail.adapter.C15922c;
import com.transsion.moviedetail.adapter.ForYouEduAdapter;
import com.transsion.moviedetail.view.ForYouLoadMoreView;
import com.transsion.moviedetail.viewmodel.MovieDetailViewModel;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.LayoutStyle;
import com.transsion.moviedetailapi.bean.PlayUrl;
import com.transsion.moviedetailapi.bean.RoomEntranceResponse;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.DownloadManagerApi;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import gn.C23598f;
import gn.C23617y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import p415fq.C23420k;
import p550kj.C24655b;
import p561kx.InterfaceC25451b;
import p743rh.C27287m;
import p765s6.InterfaceC27566d;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p840vj.C28117b;
import p840vj.InterfaceC28116a;
import p913xm.C28615f;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u0000 ~2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002KOB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u001f\u0010\u0013\u001a\u00020\n2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00152\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0005J\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0011H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\nH\u0002¢\u0006\u0004\b*\u0010\u0005J\u000f\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020+H\u0016¢\u0006\u0004\b2\u0010-J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u0010\u0005J\u000f\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\b7\u0010\u0005J\u000f\u00108\u001a\u00020\nH\u0016¢\u0006\u0004\b8\u0010\u0005J\u000f\u00109\u001a\u00020\nH\u0016¢\u0006\u0004\b9\u0010\u0005J\u000f\u0010:\u001a\u00020\nH\u0016¢\u0006\u0004\b:\u0010\u0005J\u000f\u0010;\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010\u0005J\u000f\u0010<\u001a\u00020\nH\u0016¢\u0006\u0004\b<\u0010\u0005J\u0017\u0010?\u001a\u00020>2\u0006\u0010=\u001a\u000203H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020>2\u0006\u0010=\u001a\u000203H\u0016¢\u0006\u0004\bA\u0010@J\u0017\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u000203H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\n2\u0006\u0010H\u001a\u000203H\u0016¢\u0006\u0004\bI\u0010DR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR*\u0010Z\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010+0Vj\n\u0012\u0006\u0012\u0004\u0018\u00010+`W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010]\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010_\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010\\R\u001b\u0010e\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR$\u0010h\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010k\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010m\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010jR\u0018\u0010'\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010q\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010jR\u0018\u0010t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010w\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010y\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010vR\u0016\u0010{\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010vR\u0016\u0010}\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010v¨\u0006\u007f"}, m97100d2 = {"Lcom/transsion/moviedetail/fragment/ForYouFragment;", "Lcom/transsion/baseui/fragment/PageStatusFragment;", "Lgn/f;", "Lkx/b;", "<init>", "()V", "", "z0", "()I", "y0", "", "I0", "x0", "initExposureHelper", "C0", "lazyLoadData", "", "Lcom/transsion/moviedetailapi/bean/Subject;", "list", "M0", "(Ljava/util/List;)V", "", "newList", "currentItemCount", "J0", "(Ljava/util/List;I)Ljava/util/List;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "u0", "()Lcom/chad/library/adapter/base/BaseQuickAdapter;", "s0", WebConstants.FIELD_ITEM, "B0", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", RequestParameters.POSITION, "", "duration", "K0", "(IJ)V", "subject", "L0", "(ILcom/transsion/moviedetailapi/bean/Subject;)V", "localLogPause", "", "pageName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "A0", "(Landroid/view/LayoutInflater;)Lgn/f;", "getPageStateLayoutTitle", "", "isAudioShowNoNetworkLayout", "()Z", "initViewData", "initViewModel", "initListener", "retryLoadData", "onPause", "onResume", "onDestroy", "isShowTitleLayout", "Landroid/view/View;", "getLocalNoNetworkView", "(Z)Landroid/view/View;", "getEmptyView", "hidden", "onHiddenChanged", "(Z)V", "Lkj/b;", "newLogViewConfig", "()Lkj/b;", "fullscreen", "onScreenChange", "Lvj/b;", "a", "Lvj/b;", "mExposureHelper", "Landroid/widget/ImageView;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroid/widget/ImageView;", "refreshProgress", "Lcom/transsion/moviedetail/fragment/ForYouFragment$b;", "c", "Lcom/transsion/moviedetail/fragment/ForYouFragment$b;", "listExposureCtrl", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/util/HashSet;", "subjectIdSet", "e", "I", "pageIndex", "f", "totalRequestCount", "Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "g", "Lkotlin/Lazy;", "w0", "()Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "movieDetailViewModel", "h", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "forYouAdapter", "i", "Ljava/lang/String;", "curPageName", "j", "curOps", CampaignEx.JSON_KEY_AD_K, "Lcom/transsion/moviedetailapi/bean/Subject;", "l", "subjectId", "m", "Ljava/lang/Integer;", "subjectType", "n", "Z", "isLocalVideo", "o", "isOutsideVideo", TtmlNode.TAG_P, "loading", CampaignEx.JSON_KEY_AD_Q, "isFirst", CampaignEx.JSON_KEY_AD_R, "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ForYouFragment extends PageStatusFragment<C23598f> implements InterfaceC25451b {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s */
    private static final String f54502s = "sa_detail_for_you_insert_posts";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C28117b mExposureHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ImageView refreshProgress;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C15940b listExposureCtrl;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private BaseQuickAdapter forYouAdapter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private String curPageName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String curOps;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private Subject subject;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private String subjectId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private Integer subjectType;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isLocalVideo;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean isOutsideVideo;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private boolean loading;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private HashSet subjectIdSet = new HashSet();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int pageIndex = 1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int totalRequestCount = 30;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy movieDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MovieDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.moviedetail.fragment.ForYouFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.moviedetail.fragment.ForYouFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3227v0.c invoke() {
            C3227v0.c defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.m97801g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean isFirst = true;

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.ForYouFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ForYouFragment m70275a(Subject subject, String str, String str2, boolean z11, boolean z12) {
            ForYouFragment forYouFragment = new ForYouFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("subject", subject);
            bundle.putString("ops", str);
            bundle.putString("page_name", str2);
            bundle.putBoolean("isLocalVideo", z11);
            bundle.putBoolean("isOutsideVideo", z12);
            forYouFragment.setArguments(bundle);
            return forYouFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.ForYouFragment$b */
    private static final class C15940b {

        /* JADX INFO: renamed from: a */
        private final RecyclerView f54520a;

        /* JADX INFO: renamed from: b */
        private final Function2 f54521b;

        /* JADX INFO: renamed from: c */
        private final SparseArray f54522c;

        /* JADX INFO: renamed from: d */
        private int f54523d;

        /* JADX INFO: renamed from: e */
        private int f54524e;

        /* JADX INFO: renamed from: f */
        private int f54525f;

        /* JADX INFO: renamed from: g */
        private List f54526g;

        /* JADX INFO: renamed from: h */
        private int f54527h;

        public C15940b(RecyclerView recyclerView, Function2 callback) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            Intrinsics.m97802h(callback, "callback");
            this.f54520a = recyclerView;
            this.f54521b = callback;
            this.f54522c = new SparseArray();
            this.f54523d = -1;
            this.f54524e = -1;
            this.f54525f = 3;
            List listEmptyList = Collections.emptyList();
            Intrinsics.m97801g(listEmptyList, "emptyList(...)");
            this.f54526g = listEmptyList;
            this.f54527h = AbstractC5790i.m27411e(40.0f);
        }

        /* JADX INFO: renamed from: b */
        private final void m70276b(int i11) {
            C26866a.a.m104905r(C26866a.f81698a, "Foryou", new String[]{"reportItemView line:" + i11}, false, 4, null);
            Long l11 = (Long) this.f54522c.get(i11);
            if (l11 != null) {
                long jLongValue = l11.longValue();
                if (jLongValue > 0) {
                    int i12 = this.f54525f;
                    int i13 = i12 * (i11 + 1);
                    for (int i14 = i12 * i11; i14 < i13; i14++) {
                        this.f54521b.invoke(Integer.valueOf(i14), Long.valueOf(SystemClock.elapsedRealtime() - jLongValue));
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m70277a() {
            IntIterator intIteratorM12070a = AbstractC2480k.m12070a(this.f54522c);
            while (intIteratorM12070a.hasNext()) {
                m70276b(intIteratorM12070a.next().intValue());
            }
            this.f54522c.clear();
        }

        /* JADX INFO: renamed from: c */
        public final void m70278c() {
            m70279d(this.f54523d, this.f54524e);
        }

        /* JADX INFO: renamed from: d */
        public final void m70279d(int i11, int i12) {
            if (i11 < 0 || i12 < 0) {
                return;
            }
            this.f54523d = i11;
            this.f54524e = i12;
            C26866a.a.m104905r(C26866a.f81698a, "Foryou", new String[]{"scrollWithLine startLine:" + i11 + ", endLine:" + i12}, false, 4, null);
            ArrayList arrayList = new ArrayList();
            IntIterator intIteratorM12070a = AbstractC2480k.m12070a(this.f54522c);
            while (intIteratorM12070a.hasNext()) {
                int iIntValue = intIteratorM12070a.next().intValue();
                int i13 = this.f54523d;
                if (iIntValue >= this.f54524e || i13 > iIntValue) {
                    m70276b(iIntValue);
                    arrayList.add(Integer.valueOf(iIntValue));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f54522c.remove(((Number) it.next()).intValue());
            }
            int i14 = this.f54524e;
            for (int i15 = this.f54523d; i15 < i14; i15++) {
                if (((Long) this.f54522c.get(i15)) == null) {
                    this.f54522c.put(i15, Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m70280e(List list) {
            m70277a();
            if (list == null) {
                list = Collections.emptyList();
                Intrinsics.m97801g(list, "emptyList(...)");
            }
            this.f54526g = list;
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.ForYouFragment$c */
    public static final class C15941c implements InterfaceC28116a {
        C15941c() {
        }

        @Override // p840vj.InterfaceC28116a
        /* JADX INFO: renamed from: a */
        public void mo65894a(int i11, long j11, View view) {
            ForYouFragment forYouFragment = ForYouFragment.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                forYouFragment.m70254K0(i11, j11);
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.ForYouFragment$d */
    public static final class C15942d extends RecyclerView.AbstractC4213l {
        C15942d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4213l
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C4226y state) {
            Intrinsics.m97802h(outRect, "outRect");
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(parent, "parent");
            Intrinsics.m97802h(state, "state");
            if (parent.getChildAdapterPosition(view) == -1) {
                return;
            }
            outRect.set(AbstractC23384a.m92908b(4), AbstractC23384a.m92908b(8), AbstractC23384a.m92908b(4), 0);
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.ForYouFragment$e */
    static final class C15943e implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f54529a;

        C15943e(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f54529a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f54529a;
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
            this.f54529a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: B0 */
    private final void m70245B0(Subject item) {
        String playUrl;
        String playUrl2;
        Integer subjectType = item.getSubjectType();
        int value = SubjectType.SHORT_TV.getValue();
        if (subjectType != null && subjectType.intValue() == value) {
            DownloadManagerApi downloadManagerApiM87093a = DownloadManagerApi.f66480j.m87093a();
            Context context = getContext();
            Intrinsics.m97800f(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            downloadManagerApiM87093a.m87086d0((FragmentActivity) context, "subjectdetail", (384 & 4) != 0 ? "" : "", item.getOps(), (384 & 16) != 0 ? null : "download_subject", (384 & 32) != 0 ? false : false, (384 & 64) != 0 ? null : item, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? Boolean.FALSE : null);
            return;
        }
        if (item.isJumpBrowser()) {
            PlayUrl playUrl3 = item.getPlayUrl();
            if (playUrl3 == null || (playUrl2 = playUrl3.getPlayUrl()) == null) {
                return;
            }
            AbstractC5114k.m23926i(playUrl2);
            return;
        }
        if (!item.isJumpWebview()) {
            Navigator navigatorM61773c = TheRouter.m61773c("/movie/detail");
            Integer subjectType2 = item.getSubjectType();
            Navigator.m61845x(navigatorM61773c.m61852F("subject_type", subjectType2 != null ? subjectType2.intValue() : SubjectType.MOVIE.getValue()).m61857K("ops", item.getOps()).m61857K("id", item.getSubjectId()), requireContext(), null, 2, null);
        } else {
            PlayUrl playUrl4 = item.getPlayUrl();
            if (playUrl4 == null || (playUrl = playUrl4.getPlayUrl()) == null) {
                return;
            }
            AbstractC5114k.m23925h(playUrl, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: C0 */
    private final void m70246C0() {
        Integer num = this.subjectType;
        int value = SubjectType.EDUCATION.getValue();
        if (num != null && num.intValue() == value) {
            AbstractC25136k.m99058d(AbstractC3226v.m14968a(this), null, null, new ForYouFragment$initData$1(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m70247D0(ForYouFragment forYouFragment) {
        forYouFragment.m70252I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final void m70248E0(ForYouFragment forYouFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Subject subject;
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        BaseQuickAdapter baseQuickAdapter2 = forYouFragment.forYouAdapter;
        if (baseQuickAdapter2 == null || (subject = (Subject) baseQuickAdapter2.getItem(i11)) == null) {
            return;
        }
        Integer subjectType = subject.getSubjectType();
        if (subjectType == null || subjectType.intValue() != -9901) {
            forYouFragment.m70245B0(subject);
        }
        forYouFragment.m70255L0(i11, subject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final Unit m70249F0(ForYouFragment forYouFragment, int i11, long j11) {
        try {
            forYouFragment.m70254K0(i11, j11);
        } catch (Exception unused) {
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final Unit m70250G0(RoomEntranceResponse roomEntranceResponse) {
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final Unit m70251H0(ForYouFragment forYouFragment, List list) {
        forYouFragment.m70256M0(list);
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: I0 */
    private final void m70252I0() {
        boolean z11 = false;
        if (this.isLocalVideo) {
            MovieDetailViewModel movieDetailViewModelM70270w0 = m70270w0();
            boolean z12 = this.isOutsideVideo;
            String str = this.subjectId;
            Integer num = this.subjectType;
            int i11 = this.pageIndex + 1;
            this.pageIndex = i11;
            Context context = getContext();
            movieDetailViewModelM70270w0.m70921s(z12, str, num, i11, context != null && AbstractC14556b.m65670a(context));
            return;
        }
        MovieDetailViewModel movieDetailViewModelM70270w1 = m70270w0();
        String str2 = this.subjectId;
        Integer num2 = this.subjectType;
        int i12 = this.pageIndex + 1;
        this.pageIndex = i12;
        Context context2 = getContext();
        if (context2 != null && AbstractC14556b.m65670a(context2)) {
            z11 = true;
        }
        movieDetailViewModelM70270w1.m70922t(str2, num2, i12, z11);
    }

    /* JADX INFO: renamed from: J0 */
    private final List m70253J0(List newList, int currentItemCount) {
        int iM70273z0;
        if (m70270w0().m70908B() && currentItemCount <= (iM70273z0 = m70273z0()) && newList.size() > iM70273z0) {
            C26866a.a.m104898f(C26866a.f81698a, "MovieDetailViewModel", "ForYouFragment 插入推荐帖子", false, 4, null);
            Subject subject = new Subject(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, null, null, 0, false, false, 0L, null, null, 0L, null, 0, false, null, 0, null, null, null, null, null, 0, null, null, null, null, null, -1, 67108863, null);
            subject.setSubjectType(Integer.valueOf(C15922c.f54456I));
            newList.add(iM70273z0, subject);
        }
        return newList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public final void m70254K0(int position, long duration) {
        Subject subject;
        C26866a.a.m104898f(C26866a.f81698a, "Foryou", "reportBrowseEvent position:" + position + ", duration:" + duration + " ", false, 4, null);
        BaseQuickAdapter baseQuickAdapter = this.forYouAdapter;
        if (baseQuickAdapter == null || (subject = (Subject) baseQuickAdapter.getItem(position)) == null) {
            return;
        }
        Integer subjectType = subject.getSubjectType();
        if ((subjectType != null && subjectType.intValue() == -9901) || !this.subjectIdSet.add(subject.getSubjectId())) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("item_type", "subject");
        linkedHashMap.put("opt_type", "");
        String subjectId = subject.getSubjectId();
        if (subjectId == null) {
            subjectId = "";
        }
        linkedHashMap.put("subject_id", subjectId);
        linkedHashMap.put("group_id", "");
        String ops = subject.getOps();
        if (ops == null) {
            ops = "";
        }
        linkedHashMap.put("ops", ops);
        Boolean hasResource = subject.getHasResource();
        linkedHashMap.put("has_resource", String.valueOf(hasResource != null ? hasResource.booleanValue() : false));
        linkedHashMap.put("deeplink", "");
        linkedHashMap.put(RequestParameters.POSITION, String.valueOf(position));
        linkedHashMap.put("cover", "");
        linkedHashMap.put("browse_duration", String.valueOf(duration));
        linkedHashMap.put("builtin", "0");
        linkedHashMap.put("tab_name", "for_you");
        C14450a.f50860a.m65142e("subjectdetail", linkedHashMap);
    }

    /* JADX INFO: renamed from: L0 */
    private final void m70255L0(int position, Subject subject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("module_name", "subject");
        linkedHashMap.put("item_type", "subject");
        linkedHashMap.put("opt_type", "");
        String subjectId = subject.getSubjectId();
        if (subjectId == null) {
            subjectId = "";
        }
        linkedHashMap.put("subject_id", subjectId);
        String ops = subject.getOps();
        linkedHashMap.put("ops", ops != null ? ops : "");
        Boolean hasResource = subject.getHasResource();
        linkedHashMap.put("has_resource", String.valueOf(hasResource != null ? hasResource.booleanValue() : false));
        linkedHashMap.put(RequestParameters.POSITION, String.valueOf(position));
        linkedHashMap.put("builtin", "0");
        linkedHashMap.put("tab_name", "for_you");
        C14450a.f50860a.m65143f("subjectdetail", linkedHashMap);
    }

    /* JADX INFO: renamed from: M0 */
    private final void m70256M0(List list) {
        List<Object> data;
        BaseQuickAdapter baseQuickAdapter;
        C27941f c27941fM36186h0;
        List<Object> listL;
        C27941f c27941fM36186h1;
        C27941f c27941fM36186h2;
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 != null) {
            logViewConfig2.m96851n(this.curOps);
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            C26866a.a.m104898f(C26866a.f81698a, "MovieDetailViewModel", "ForYouFragment 没有更多数据了，加载更多结束", false, 4, null);
            BaseQuickAdapter baseQuickAdapter2 = this.forYouAdapter;
            if (baseQuickAdapter2 != null && (c27941fM36186h0 = baseQuickAdapter2.m36186h0()) != null) {
                c27941fM36186h0.m108668t(false);
            }
            BaseQuickAdapter baseQuickAdapter3 = this.forYouAdapter;
            if (baseQuickAdapter3 != null && (data = baseQuickAdapter3.getData()) != null && data.isEmpty() && (baseQuickAdapter = this.forYouAdapter) != null) {
                baseQuickAdapter.m36171Y0(getEmptyView(false));
            }
        } else {
            BaseQuickAdapter baseQuickAdapter4 = this.forYouAdapter;
            if (baseQuickAdapter4 == null || (listL = baseQuickAdapter4.getData()) == null) {
                listL = CollectionsKt.m97506l();
            }
            List<Object> list3 = listL;
            ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((Subject) it.next()).getSubjectId());
            }
            Set setW0 = CollectionsKt.m97345W0(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!setW0.contains(((Subject) obj).getSubjectId())) {
                    arrayList2.add(obj);
                }
            }
            BaseQuickAdapter baseQuickAdapter5 = this.forYouAdapter;
            int itemCount = baseQuickAdapter5 != null ? baseQuickAdapter5.getItemCount() : 0;
            if (arrayList2.isEmpty() || itemCount >= this.totalRequestCount) {
                C26866a.a.m104898f(C26866a.f81698a, "MovieDetailViewModel", "ForYouFragment 全部去重或超出最大上限，加载更多结束 totalCount:" + itemCount, false, 4, null);
                BaseQuickAdapter baseQuickAdapter6 = this.forYouAdapter;
                if (baseQuickAdapter6 != null && (c27941fM36186h1 = baseQuickAdapter6.m36186h0()) != null) {
                    c27941fM36186h1.m108668t(false);
                }
            } else {
                C26866a.a.m104898f(C26866a.f81698a, "MovieDetailViewModel", "ForYouFragment count: " + (arrayList2.size() + itemCount), false, 4, null);
                List listM70253J0 = m70253J0(CollectionsKt.m97343U0(arrayList2), itemCount);
                BaseQuickAdapter baseQuickAdapter7 = this.forYouAdapter;
                if (baseQuickAdapter7 != null && (c27941fM36186h2 = baseQuickAdapter7.m36186h0()) != null) {
                    c27941fM36186h2.m108667s();
                }
                BaseQuickAdapter baseQuickAdapter8 = this.forYouAdapter;
                if (baseQuickAdapter8 != null) {
                    baseQuickAdapter8.mo36208q(listM70253J0);
                }
                C15940b c15940b = this.listExposureCtrl;
                if (c15940b != null) {
                    c15940b.m70280e(listM70253J0);
                }
            }
        }
        m70266s0();
        this.loading = false;
    }

    private final void initExposureHelper() {
        RecyclerView recyclerView;
        C28117b c28117b = new C28117b(0.6f, new C15941c(), false, 4, null);
        c28117b.m109199n(2);
        C23598f mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView = mViewBinding.f71938b) != null) {
            recyclerView.addOnScrollListener(c28117b);
        }
        this.mExposureHelper = c28117b;
    }

    private final void lazyLoadData() {
        String value;
        if (getParentFragment() != null) {
            m70270w0().m70907A().m14851j(this, new C15943e(new Function1() { // from class: com.transsion.moviedetail.fragment.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ForYouFragment.m70251H0(this.f54687a, (List) obj);
                }
            }));
            boolean z11 = false;
            if (this.isLocalVideo) {
                if (!C27287m.f83003a.m106330e()) {
                    BaseQuickAdapter baseQuickAdapter = this.forYouAdapter;
                    if (baseQuickAdapter != null) {
                        baseQuickAdapter.m36171Y0(getLocalNoNetworkView(false));
                        return;
                    }
                    return;
                }
                MovieDetailViewModel movieDetailViewModelM70270w0 = m70270w0();
                boolean z12 = this.isOutsideVideo;
                String str = this.subjectId;
                Integer num = this.subjectType;
                Context context = getContext();
                movieDetailViewModelM70270w0.m70921s(z12, str, num, 0, context != null && AbstractC14556b.m65670a(context));
            }
            ConfigBean configBeanM110355d = C28615f.m110355d(C28615f.f87796c.m110363a(), f54502s, false, 2, null);
            if (configBeanM110355d != null && (value = configBeanM110355d.getValue()) != null) {
                z11 = Boolean.parseBoolean(value);
            }
            if (!z11 || !C23420k.f71413a.m92974b() || this.isLocalVideo || this.isOutsideVideo) {
                return;
            }
            Integer num2 = this.subjectType;
            int value2 = SubjectType.TV.getValue();
            if (num2 == null || num2.intValue() != value2) {
                Integer num3 = this.subjectType;
                int value3 = SubjectType.MOVIE.getValue();
                if (num3 == null || num3.intValue() != value3) {
                    return;
                }
            }
            C26866a.a.m104898f(C26866a.f81698a, "MovieDetailViewModel", "ForYouFragment 请求推荐帖子------", false, 4, null);
            m70270w0().m70913J();
        }
    }

    private final void localLogPause() {
        C28117b c28117b = this.mExposureHelper;
        if (c28117b != null) {
            c28117b.m109195f();
        }
    }

    private final String pageName() {
        String str = this.curPageName;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: s0 */
    private final void m70266s0() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ImageView imageView = this.refreshProgress;
        if (imageView == null || (viewPropertyAnimatorAnimate = imageView.animate()) == null) {
            return;
        }
        viewPropertyAnimatorAnimate.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m70267t0(ForYouFragment forYouFragment, View view) {
        forYouFragment.retryLoadData();
    }

    /* JADX INFO: renamed from: u0 */
    private final BaseQuickAdapter m70268u0() {
        Integer num = this.subjectType;
        int value = SubjectType.EDUCATION.getValue();
        if (num != null && num.intValue() == value) {
            return new ForYouEduAdapter(new ArrayList());
        }
        String str = this.curPageName;
        if (str == null) {
            str = "subjectdetail";
        }
        return new C15922c(this, str, m70273z0(), m70270w0(), this.subject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m70269v0(ForYouFragment forYouFragment, View view) {
        forYouFragment.retryLoadData();
    }

    /* JADX INFO: renamed from: w0 */
    private final MovieDetailViewModel m70270w0() {
        return (MovieDetailViewModel) this.movieDetailViewModel.getValue();
    }

    /* JADX INFO: renamed from: x0 */
    private final int m70271x0() {
        Integer num = this.subjectType;
        int value = SubjectType.MUSIC.getValue();
        if (num == null || num.intValue() != value) {
            Integer num2 = this.subjectType;
            int value2 = SubjectType.EDUCATION.getValue();
            if (num2 == null || num2.intValue() != value2) {
                return 6;
            }
        }
        return 4;
    }

    /* JADX INFO: renamed from: y0 */
    private final int m70272y0() {
        Integer numV;
        ConfigBean configBeanM110360c = C28615f.f87796c.m110363a().m110360c("sa_for_you_request_count", true);
        String value = configBeanM110360c != null ? configBeanM110360c.getValue() : null;
        if (value == null || value.length() == 0 || (numV = StringsKt.m98216v(value)) == null) {
            return 30;
        }
        return numV.intValue();
    }

    /* JADX INFO: renamed from: z0 */
    private final int m70273z0() {
        if (this.subject == null) {
            return 3;
        }
        Integer num = this.subjectType;
        int value = SubjectType.MUSIC.getValue();
        if (num != null && num.intValue() == value) {
            return 2;
        }
        Integer num2 = this.subjectType;
        int value2 = SubjectType.EDUCATION.getValue();
        if (num2 != null && num2.intValue() == value2) {
            return 2;
        }
        Subject subject = this.subject;
        Intrinsics.m97799e(subject);
        LayoutStyle style = subject.getStyle();
        if (style != null) {
            return style.getColNum();
        }
        return 3;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public C23598f getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23598f c23598fM93366c = C23598f.m93366c(inflater);
        Intrinsics.m97801g(c23598fM93366c, "inflate(...)");
        return c23598fM93366c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getEmptyView(boolean isShowTitleLayout) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.layout_state_view, (ViewGroup) null);
        C23617y c23617yM93439a = C23617y.m93439a(viewInflate);
        Intrinsics.m97801g(c23617yM93439a, "bind(...)");
        c23617yM93439a.f72118b.setImageResource(R$mipmap.ic_no_content);
        c23617yM93439a.f72119c.setText(viewInflate.getResources().getString(R$string.no_content));
        c23617yM93439a.f72120d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForYouFragment.m70267t0(this.f54692a, view);
            }
        });
        Intrinsics.m97801g(viewInflate, "apply(...)");
        return viewInflate;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public View getLocalNoNetworkView(boolean isShowTitleLayout) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.layout_state_view, (ViewGroup) null);
        C23617y c23617yM93439a = C23617y.m93439a(viewInflate);
        Intrinsics.m97801g(c23617yM93439a, "bind(...)");
        c23617yM93439a.f72120d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForYouFragment.m70269v0(this.f54708a, view);
            }
        });
        Intrinsics.m97801g(viewInflate, "apply(...)");
        return viewInflate;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        initExposureHelper();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        HashMap mapM96844g;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C24655b logViewConfig;
        HashMap mapM96844g2;
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("subject") : null;
        this.subject = serializable instanceof Subject ? (Subject) serializable : null;
        Bundle arguments2 = getArguments();
        this.curPageName = arguments2 != null ? arguments2.getString("page_name") : null;
        Bundle arguments3 = getArguments();
        this.curOps = arguments3 != null ? arguments3.getString("ops") : null;
        Bundle arguments4 = getArguments();
        this.isLocalVideo = arguments4 != null ? arguments4.getBoolean("isLocalVideo") : false;
        Bundle arguments5 = getArguments();
        this.isOutsideVideo = arguments5 != null ? arguments5.getBoolean("isOutsideVideo") : false;
        this.totalRequestCount = m70272y0();
        Subject subject = this.subject;
        this.subjectId = subject != null ? subject.getSubjectId() : null;
        Subject subject2 = this.subject;
        this.subjectType = subject2 != null ? subject2.getSubjectType() : null;
        String str = this.subjectId;
        if (str != null && (logViewConfig = getLogViewConfig()) != null && (mapM96844g2 = logViewConfig.m96844g()) != null) {
        }
        BaseQuickAdapter baseQuickAdapterM70268u0 = m70268u0();
        C27941f c27941fM36186h0 = baseQuickAdapterM70268u0.m36186h0();
        c27941fM36186h0.m108655C(new ForYouLoadMoreView());
        c27941fM36186h0.m108673z(true);
        c27941fM36186h0.m108672y(true);
        c27941fM36186h0.m108657E(m70271x0());
        c27941fM36186h0.m108656D(new InterfaceC27568f() { // from class: com.transsion.moviedetail.fragment.e
            @Override // p765s6.InterfaceC27568f
            /* JADX INFO: renamed from: a */
            public final void mo63874a() {
                ForYouFragment.m70247D0(this.f54699a);
            }
        });
        baseQuickAdapterM70268u0.m36227w1(new InterfaceC27566d() { // from class: com.transsion.moviedetail.fragment.f
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                ForYouFragment.m70248E0(this.f54702a, baseQuickAdapter, view, i11);
            }
        });
        this.forYouAdapter = baseQuickAdapterM70268u0;
        C23598f mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView2 = mViewBinding.f71938b) != null) {
            recyclerView2.addItemDecoration(new C15942d());
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(m70273z0(), 1);
            staggeredGridLayoutManager.m20982f0(2);
            recyclerView2.setLayoutManager(staggeredGridLayoutManager);
            recyclerView2.setAdapter(this.forYouAdapter);
        }
        C23598f mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (recyclerView = mViewBinding2.f71938b) != null) {
            this.listExposureCtrl = new C15940b(recyclerView, new Function2() { // from class: com.transsion.moviedetail.fragment.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ForYouFragment.m70249F0(this.f54705a, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                }
            });
        }
        m70246C0();
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 == null || (mapM96844g = logViewConfig2.m96844g()) == null) {
            return;
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m70270w0().m70912I().m14851j(this, new C15943e(new Function1() { // from class: com.transsion.moviedetail.fragment.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ForYouFragment.m70250G0((RoomEntranceResponse) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public boolean isAudioShowNoNetworkLayout() {
        return false;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public C24655b newLogViewConfig() {
        return new C24655b(pageName(), false, 2, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m70266s0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isResumed()) {
            if (hidden) {
                logPause();
                localLogPause();
            } else {
                logResume();
            }
        }
        AbstractC14517k.m65410h(null, this, hidden, null, 9, null);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        localLogPause();
        C15940b c15940b = this.listExposureCtrl;
        if (c15940b != null) {
            c15940b.m70277a();
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C15940b c15940b = this.listExposureCtrl;
        if (c15940b != null) {
            c15940b.m70278c();
        }
        if (this.isFirst) {
            this.isFirst = false;
            lazyLoadData();
        }
    }

    @Override // p561kx.InterfaceC25451b
    public void onScreenChange(boolean fullscreen) {
        if (isAdded() && !isHidden() && isResumed()) {
            if (!fullscreen) {
                logResume();
            } else {
                logPause();
                localLogPause();
            }
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
        lazyLoadData();
    }
}
