package com.transsion.home.fragment.hashtag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5796o;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.view.AbstractC13772o;
import com.p282tn.lib.view.NoNetworkBigView;
import com.p282tn.lib.widget.TnTextView;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.home.R$id;
import com.transsion.home.adapter.hashtag.C14842a;
import com.transsion.home.bean.RefreshBaseDto;
import com.transsion.home.hashtag.HashTagViewModel;
import com.transsion.home.hashtag.model.HashTagItem;
import com.transsion.home.hashtag.model.HashTagItemType;
import com.transsion.home.view.layoutmanager.OffsetGridLayoutManager;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.ugcvideodetail.api.bean.UGCVideoHashTag;
import com.transsion.web.api.WebConstants;
import com.transsnet.downloader.R$string;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26006c;
import p552kl.C24695q;
import p579ll.C25646b;
import p579ll.InterfaceC25645a;
import p743rh.C27287m;
import p765s6.InterfaceC27568f;
import p801u6.C27941f;
import p822uv.AbstractC28040c;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#'B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J+\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0004R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0018\u00105\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00101R\u0016\u00107\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00101R\u0016\u0010:\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010F\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010HR\u0016\u0010O\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010=¨\u0006Q"}, m97100d2 = {"Lcom/transsion/home/fragment/hashtag/HashTagPageFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lkl/q;", "<init>", "()V", "", "z0", "showLoadingView", "v0", "G0", "J0", "u0", "r0", "L0", "", "tabId", "", "loadDuration", "ops", "E0", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "s0", "(Landroid/view/LayoutInflater;)Lkl/q;", "lazyLoadData", "onResume", "onPause", "Lcom/transsion/home/adapter/hashtag/a;", "a", "Lcom/transsion/home/adapter/hashtag/a;", "adapter", "Lcom/transsion/home/hashtag/HashTagViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "t0", "()Lcom/transsion/home/hashtag/HashTagViewModel;", "viewModel", "", "c", "I", "spanCount", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/String;", "e", "fromOptId", "f", "ugcVideoId", "g", "hashtagTitle", "h", "J", "firstLoadStartTimeMillis", "", "i", "Z", "hasRecordedFirstLoadDuration", "Lcom/transsion/home/fragment/hashtag/HashTagPageFragment$b;", "j", "Lcom/transsion/home/fragment/hashtag/HashTagPageFragment$b;", "getLoadDurationCallback", "()Lcom/transsion/home/fragment/hashtag/HashTagPageFragment$b;", "F0", "(Lcom/transsion/home/fragment/hashtag/HashTagPageFragment$b;)V", "loadDurationCallback", CampaignEx.JSON_KEY_AD_K, "Landroid/view/View;", "skeletonScreenView", "l", "mNoNetworkView", "m", "mNoResultView", "n", "tagsFullyInvisible", "o", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class HashTagPageFragment extends BaseFragment<C24695q> {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p */
    public static final int f52863p = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C14842a adapter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String ugcVideoId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long firstLoadStartTimeMillis;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean hasRecordedFirstLoadDuration;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private InterfaceC15200b loadDurationCallback;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private View skeletonScreenView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private View mNoNetworkView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private View mNoResultView;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean tagsFullyInvisible;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy viewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(HashTagViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.home.fragment.hashtag.HashTagPageFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.home.fragment.hashtag.HashTagPageFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int spanCount = 2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String tabId = "";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String fromOptId = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String hashtagTitle = "";

    /* JADX INFO: renamed from: com.transsion.home.fragment.hashtag.HashTagPageFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final HashTagPageFragment m67847a(String tabId, String str, String hashtagTitle, String str2) {
            Intrinsics.m97802h(tabId, "tabId");
            Intrinsics.m97802h(hashtagTitle, "hashtagTitle");
            HashTagPageFragment hashTagPageFragment = new HashTagPageFragment();
            Bundle bundle = new Bundle();
            bundle.putString("arg_tab_id", tabId);
            bundle.putString("ugc_video_id", str2);
            bundle.putString("fromOptId", str);
            bundle.putString("hashtag_title", hashtagTitle);
            hashTagPageFragment.setArguments(bundle);
            return hashTagPageFragment;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.hashtag.HashTagPageFragment$b */
    public interface InterfaceC15200b {
        /* JADX INFO: renamed from: a */
        void mo67848a(String str, Long l11, String str2);
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.hashtag.HashTagPageFragment$c */
    public static final class C15201c implements InterfaceC25645a {
        C15201c() {
        }

        @Override // p579ll.InterfaceC25645a
        /* JADX INFO: renamed from: a */
        public void mo67486a(int i11, long j11, View view) {
            int size;
            HashTagItem hashTagItem;
            UGCVideo ugcVideo;
            Collection collectionL;
            String collectionId;
            C14842a c14842a = HashTagPageFragment.this.adapter;
            if (c14842a != null && (size = c14842a.getData().size()) > 0) {
                int i12 = c14842a.getItemViewType(0) == HashTagItemType.TAGS.ordinal() ? 1 : 0;
                int i13 = i11 - i12;
                if (i13 < 0 || i13 >= size - i12 || (hashTagItem = (HashTagItem) CollectionsKt.m97362l0(c14842a.getData(), i13)) == null || (ugcVideo = hashTagItem.getUgcVideo()) == null) {
                    return;
                }
                HashMap map = new HashMap();
                map.put("browse_duration", String.valueOf(j11));
                map.put("module_name", WebConstants.FIELD_ITEM);
                HashTagItem hashTagItem2 = (HashTagItem) CollectionsKt.m97361k0(c14842a.getData());
                List<UGCVideoHashTag> selectedTags = hashTagItem2 != null ? hashTagItem2.getSelectedTags() : null;
                if (selectedTags != null) {
                    collectionL = new ArrayList();
                    Iterator<T> it = selectedTags.iterator();
                    while (it.hasNext()) {
                        String tag = ((UGCVideoHashTag) it.next()).getTag();
                        if (tag != null) {
                            collectionL.add(tag);
                        }
                    }
                } else {
                    collectionL = CollectionsKt.m97506l();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sort", HashTagPageFragment.this.tabId);
                linkedHashMap.put("selected_tags", collectionL);
                map.put("rank_category", AbstractC5796o.m27447j(linkedHashMap));
                map.put("from_opt_id", HashTagPageFragment.this.fromOptId);
                map.put(CampaignEx.JSON_KEY_TITLE, HashTagPageFragment.this.hashtagTitle);
                UGCVideoBelongToCollection belongToCollection = ugcVideo.getBelongToCollection();
                if (belongToCollection == null || (collectionId = belongToCollection.getCollectionId()) == null) {
                    collectionId = "";
                }
                map.put("belong_to_collection_id", collectionId);
                map.put("content_id", String.valueOf(ugcVideo.getUgcVideoId()));
                map.put("refer_subject_id", String.valueOf(ugcVideo.getSubjectId()));
                map.put("content_type", "ugc_video");
                map.put(RequestParameters.POSITION, String.valueOf(i13));
                map.put("ops", String.valueOf(ugcVideo.getOps()));
                C14450a.f50860a.m65142e("/home/hashtag", map);
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.hashtag.HashTagPageFragment$d */
    public static final class C15202d implements C14842a.a {
        C15202d() {
        }

        @Override // com.transsion.home.adapter.hashtag.C14842a.a
        /* JADX INFO: renamed from: a */
        public void mo66734a(UGCVideo uGCVideo, int i11) {
            String collectionId;
            Intrinsics.m97802h(uGCVideo, "uGCVideo");
            AbstractC28040c.m109012i(uGCVideo, null, null, 3, null);
            HashMap map = new HashMap();
            map.put("module_name", WebConstants.FIELD_ITEM);
            map.put("rank_category", WebConstants.FIELD_ITEM);
            map.put("from_opt_id", HashTagPageFragment.this.fromOptId);
            UGCVideoBelongToCollection belongToCollection = uGCVideo.getBelongToCollection();
            if (belongToCollection == null || (collectionId = belongToCollection.getCollectionId()) == null) {
                collectionId = "";
            }
            map.put("belong_to_collection_id", collectionId);
            String ugcVideoId = uGCVideo.getUgcVideoId();
            if (ugcVideoId == null) {
                ugcVideoId = "";
            }
            map.put("content_id", ugcVideoId);
            String subjectId = uGCVideo.getSubjectId();
            if (subjectId == null) {
                subjectId = "";
            }
            map.put("refer_subject_id", subjectId);
            map.put("content_type", "ugc_video");
            map.put(RequestParameters.POSITION, String.valueOf(i11));
            String ops = uGCVideo.getOps();
            map.put("ops", ops != null ? ops : "");
            C14450a.f50860a.m65143f("/home/hashtag", map);
        }

        @Override // com.transsion.home.adapter.hashtag.C14842a.a
        /* JADX INFO: renamed from: b */
        public void mo66735b(UGCVideoHashTag tag) {
            List<Object> data;
            HashTagItem hashTagItem;
            UGCVideo ugcVideo;
            String ops;
            Intrinsics.m97802h(tag, "tag");
            HashTagPageFragment.this.m67838t0().m68493x(tag);
            HashMap map = new HashMap();
            map.put("module_name", WebConstants.FIELD_ITEM);
            map.put("rank_category", "btn");
            map.put("from_opt_id", HashTagPageFragment.this.fromOptId);
            String tag2 = tag.getTag();
            String str = "";
            if (tag2 == null) {
                tag2 = "";
            }
            map.put("click_tag", tag2);
            String tagType = tag.getTagType();
            if (tagType == null) {
                tagType = "";
            }
            map.put("click_tag_type", tagType);
            C14842a c14842a = HashTagPageFragment.this.adapter;
            if (c14842a != null && (data = c14842a.getData()) != null && (hashTagItem = (HashTagItem) CollectionsKt.m97361k0(data)) != null && (ugcVideo = hashTagItem.getUgcVideo()) != null && (ops = ugcVideo.getOps()) != null) {
                str = ops;
            }
            map.put("ops", str);
            C14450a.f50860a.m65143f("/home/hashtag", map);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.hashtag.HashTagPageFragment$e */
    public static final class C15203e extends RecyclerView.AbstractC4219r {
        C15203e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i11, i12);
            HashTagPageFragment.this.m67837r0();
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.fragment.hashtag.HashTagPageFragment$f */
    public static final class C15204f extends GridLayoutManager.AbstractC4187c {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ RecyclerView f52881e;

        C15204f(RecyclerView recyclerView) {
            this.f52881e = recyclerView;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC4187c
        /* JADX INFO: renamed from: f */
        public int mo20742f(int i11) {
            RecyclerView.Adapter adapter = this.f52881e.getAdapter();
            Integer numValueOf = adapter != null ? Integer.valueOf(adapter.getItemViewType(i11)) : null;
            return (numValueOf != null && numValueOf.intValue() == HashTagItemType.TAGS.ordinal()) ? 2 : 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final Unit m67808A0(final HashTagPageFragment hashTagPageFragment, RefreshBaseDto refreshBaseDto) {
        C27941f c27941fM36186h0;
        C24695q mViewBinding;
        RecyclerView recyclerView;
        C14842a c14842a;
        C27941f c27941fM36186h1;
        Long lValueOf;
        String ops;
        RecyclerView recyclerView2;
        UGCVideo ugcVideo;
        List<Object> data;
        SwipeRefreshLayout swipeRefreshLayout;
        C24695q mViewBinding2;
        SwipeRefreshLayout swipeRefreshLayout2;
        C27941f c27941fM36186h2;
        C14842a c14842a2;
        C27941f c27941fM36186h3;
        List<Object> data2;
        SwipeRefreshLayout swipeRefreshLayout3;
        C24695q mViewBinding3;
        SwipeRefreshLayout swipeRefreshLayout4;
        SwipeRefreshLayout swipeRefreshLayout5;
        List list;
        C26866a.a.m104898f(C26866a.f81698a, "HashTagPageFragment", "observe data: filterId=" + hashTagPageFragment.tabId + ", isRefresh=" + (refreshBaseDto != null ? Boolean.valueOf(refreshBaseDto.getIsRefresh()) : null) + ", dataSize=" + ((refreshBaseDto == null || (list = (List) refreshBaseDto.getData()) == null) ? null : Integer.valueOf(list.size())) + ", code=" + (refreshBaseDto != null ? refreshBaseDto.getCode() : null), false, 4, null);
        C24695q mViewBinding4 = hashTagPageFragment.getMViewBinding();
        if (mViewBinding4 != null && (swipeRefreshLayout5 = mViewBinding4.f75542f) != null) {
            swipeRefreshLayout5.setRefreshing(false);
        }
        if (refreshBaseDto == null) {
            return Unit.f75682a;
        }
        if (!Intrinsics.m97797c(refreshBaseDto.getCode(), "0")) {
            if (refreshBaseDto.getIsRefresh()) {
                C24695q mViewBinding5 = hashTagPageFragment.getMViewBinding();
                if (mViewBinding5 != null && (swipeRefreshLayout3 = mViewBinding5.f75542f) != null && swipeRefreshLayout3.isRefreshing() && (mViewBinding3 = hashTagPageFragment.getMViewBinding()) != null && (swipeRefreshLayout4 = mViewBinding3.f75542f) != null) {
                    swipeRefreshLayout4.setRefreshing(false);
                }
            } else {
                C14842a c14842a3 = hashTagPageFragment.adapter;
                if (c14842a3 != null && (c27941fM36186h2 = c14842a3.m36186h0()) != null && c27941fM36186h2.m108666r() && (c14842a2 = hashTagPageFragment.adapter) != null && (c27941fM36186h3 = c14842a2.m36186h0()) != null) {
                    c27941fM36186h3.m108669v();
                }
            }
            C14842a c14842a4 = hashTagPageFragment.adapter;
            if (c14842a4 == null || (data2 = c14842a4.getData()) == null || data2.size() != 0) {
                if (C27287m.f83003a.m106330e()) {
                    C28951b.f88586a.m111454d(R$string.str_ad_video_error_tips);
                } else {
                    C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
                }
                return Unit.f75682a;
            }
            if (C27287m.f83003a.m106330e()) {
                hashTagPageFragment.m67816J0();
            } else {
                hashTagPageFragment.m67813G0();
            }
            return Unit.f75682a;
        }
        List list2 = (List) refreshBaseDto.getData();
        if (list2 != null) {
            if (refreshBaseDto.getIsRefresh()) {
                C24695q mViewBinding6 = hashTagPageFragment.getMViewBinding();
                if (mViewBinding6 != null && (swipeRefreshLayout = mViewBinding6.f75542f) != null && swipeRefreshLayout.isRefreshing() && (mViewBinding2 = hashTagPageFragment.getMViewBinding()) != null && (swipeRefreshLayout2 = mViewBinding2.f75542f) != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
                C14842a c14842a5 = hashTagPageFragment.adapter;
                if (c14842a5 == null || (data = c14842a5.getData()) == null || !data.isEmpty() || hashTagPageFragment.hasRecordedFirstLoadDuration || hashTagPageFragment.firstLoadStartTimeMillis <= 0) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(System.currentTimeMillis() - hashTagPageFragment.firstLoadStartTimeMillis);
                    hashTagPageFragment.hasRecordedFirstLoadDuration = true;
                }
                String str = hashTagPageFragment.tabId;
                HashTagItem hashTagItem = (HashTagItem) CollectionsKt.m97361k0(list2);
                if (hashTagItem == null || (ugcVideo = hashTagItem.getUgcVideo()) == null || (ops = ugcVideo.getOps()) == null) {
                    ops = "";
                }
                hashTagPageFragment.m67812E0(str, lValueOf, ops);
                C14842a c14842a6 = hashTagPageFragment.adapter;
                if (c14842a6 != null) {
                    c14842a6.mo36201n1(list2);
                }
                if (list2.isEmpty()) {
                    hashTagPageFragment.m67816J0();
                } else {
                    hashTagPageFragment.m67839u0();
                }
                C24695q mViewBinding7 = hashTagPageFragment.getMViewBinding();
                if (mViewBinding7 != null && (recyclerView2 = mViewBinding7.f75541e) != null) {
                    recyclerView2.post(new Runnable() { // from class: com.transsion.home.fragment.hashtag.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            HashTagPageFragment.m67809B0(this.f52913a);
                        }
                    });
                }
            } else {
                List list3 = list2;
                if (!list3.isEmpty()) {
                    C14842a c14842a7 = hashTagPageFragment.adapter;
                    if (c14842a7 != null) {
                        c14842a7.mo36208q(list3);
                    }
                    hashTagPageFragment.m67839u0();
                }
                C14842a c14842a8 = hashTagPageFragment.adapter;
                if (c14842a8 != null && (c27941fM36186h0 = c14842a8.m36186h0()) != null && c27941fM36186h0.m108666r() && (mViewBinding = hashTagPageFragment.getMViewBinding()) != null && (recyclerView = mViewBinding.f75541e) != null) {
                    recyclerView.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.hashtag.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            HashTagPageFragment.m67810C0(this.f52914a);
                        }
                    }, 300L);
                }
            }
            if (!hashTagPageFragment.m67838t0().m68487q(hashTagPageFragment.tabId) && (c14842a = hashTagPageFragment.adapter) != null && (c27941fM36186h1 = c14842a.m36186h0()) != null) {
                C27941f.m108652u(c27941fM36186h1, false, 1, null);
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final void m67809B0(HashTagPageFragment hashTagPageFragment) {
        hashTagPageFragment.m67837r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final void m67810C0(HashTagPageFragment hashTagPageFragment) {
        C27941f c27941fM36186h0;
        C14842a c14842a = hashTagPageFragment.adapter;
        if (c14842a == null || (c27941fM36186h0 = c14842a.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108667s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final Unit m67811D0(HashTagPageFragment hashTagPageFragment, Boolean bool) {
        if (Intrinsics.m97797c(bool, Boolean.TRUE)) {
            hashTagPageFragment.showLoadingView();
        } else {
            hashTagPageFragment.m67840v0();
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: E0 */
    private final void m67812E0(String tabId, Long loadDuration, String ops) {
        InterfaceC15200b interfaceC15200b = this.loadDurationCallback;
        if (interfaceC15200b != null) {
            interfaceC15200b.mo67848a(tabId, loadDuration, ops);
        }
    }

    /* JADX INFO: renamed from: G0 */
    private final void m67813G0() {
        ViewStub viewStub;
        C26866a.a.m104898f(C26866a.f81698a, "HashTagPageFragment", "showNoNetworkView", false, 4, null);
        if (this.mNoNetworkView == null) {
            C24695q mViewBinding = getMViewBinding();
            this.mNoNetworkView = (mViewBinding == null || (viewStub = mViewBinding.f75539c) == null) ? null : viewStub.inflate();
        }
        View view = this.mNoNetworkView;
        if (view != null) {
            AbstractC26006c.m102058k(view);
            final NoNetworkBigView noNetworkBigView = (NoNetworkBigView) view.findViewById(R$id.state_view);
            if (noNetworkBigView != null) {
                NoNetworkBigView.showTitle$default(noNetworkBigView, false, null, 2, null);
                noNetworkBigView.retry(new Function0() { // from class: com.transsion.home.fragment.hashtag.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HashTagPageFragment.m67814H0(noNetworkBigView, this);
                    }
                });
                noNetworkBigView.goToSetting(new Function0() { // from class: com.transsion.home.fragment.hashtag.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HashTagPageFragment.m67815I0();
                    }
                });
            }
            AbstractC13772o.m62233a("home_hashtag_page");
        }
        View view2 = this.skeletonScreenView;
        if (view2 != null) {
            AbstractC26006c.m102054g(view2);
        }
        View view3 = this.mNoResultView;
        if (view3 != null) {
            AbstractC26006c.m102054g(view3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final Unit m67814H0(NoNetworkBigView noNetworkBigView, HashTagPageFragment hashTagPageFragment) {
        AbstractC26006c.m102054g(noNetworkBigView);
        hashTagPageFragment.m67838t0().m68485A(hashTagPageFragment.tabId);
        AbstractC13772o.m62234b("home_hashtag_page");
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final Unit m67815I0() {
        AbstractC13772o.m62235c("home_hashtag_page");
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: J0 */
    private final void m67816J0() {
        ViewStub viewStub;
        C26866a.a.m104898f(C26866a.f81698a, "HashTagPageFragment", "showNoResultView", false, 4, null);
        if (this.mNoResultView == null) {
            C24695q mViewBinding = getMViewBinding();
            this.mNoResultView = (mViewBinding == null || (viewStub = mViewBinding.f75540d) == null) ? null : viewStub.inflate();
        }
        final View view = this.mNoResultView;
        if (view != null) {
            AbstractC26006c.m102058k(view);
            TextView textView = (TextView) view.findViewById(R$id.tv_no_result);
            if (textView != null) {
                textView.setText(getString(com.transsion.home.R$string.no_filter_result));
            }
            View viewFindViewById = view.findViewById(R$id.tv_reset);
            if (viewFindViewById != null) {
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.fragment.hashtag.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        HashTagPageFragment.m67817K0(view, this, view2);
                    }
                });
            }
        }
        View view2 = this.skeletonScreenView;
        if (view2 != null) {
            AbstractC26006c.m102054g(view2);
        }
        View view3 = this.mNoNetworkView;
        if (view3 != null) {
            AbstractC26006c.m102054g(view3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final void m67817K0(View view, HashTagPageFragment hashTagPageFragment, View view2) {
        AbstractC26006c.m102054g(view);
        hashTagPageFragment.m67838t0().m68485A(hashTagPageFragment.tabId);
    }

    /* JADX INFO: renamed from: L0 */
    private final void m67818L0() {
        TnTextView tnTextView;
        TnTextView tnTextView2;
        C14842a c14842a = this.adapter;
        if (c14842a == null || c14842a.getData().isEmpty() || c14842a.getItemViewType(0) != HashTagItemType.TAGS.ordinal()) {
            return;
        }
        HashTagItem hashTagItem = (HashTagItem) CollectionsKt.m97361k0(c14842a.getData());
        List<UGCVideoHashTag> selectedTags = hashTagItem != null ? hashTagItem.getSelectedTags() : null;
        List<UGCVideoHashTag> list = selectedTags;
        if (list == null || list.isEmpty()) {
            C24695q mViewBinding = getMViewBinding();
            if (mViewBinding == null || (tnTextView = mViewBinding.f75543g) == null) {
                return;
            }
            AbstractC26006c.m102054g(tnTextView);
            return;
        }
        String strS0 = CollectionsKt.m97369s0(selectedTags, " · ", null, null, 0, null, new Function1() { // from class: com.transsion.home.fragment.hashtag.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HashTagPageFragment.m67819M0((UGCVideoHashTag) obj);
            }
        }, 30, null);
        C26866a.a.m104898f(C26866a.f81698a, "HashTagPageFragment", "showSelectedTagsBar: tagsText=" + strS0, false, 4, null);
        C24695q mViewBinding2 = getMViewBinding();
        if (mViewBinding2 == null || (tnTextView2 = mViewBinding2.f75543g) == null) {
            return;
        }
        tnTextView2.setText(strS0);
        AbstractC26006c.m102058k(tnTextView2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final CharSequence m67819M0(UGCVideoHashTag it) {
        Intrinsics.m97802h(it, "it");
        String title = it.getTitle();
        if (title != null) {
            return title;
        }
        String tag = it.getTag();
        return tag != null ? tag : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public final void m67837r0() {
        C14842a c14842a;
        TnTextView tnTextView;
        TnTextView tnTextView2;
        RecyclerView recyclerView;
        C24695q mViewBinding = getMViewBinding();
        RecyclerView.AbstractC4214m layoutManager = (mViewBinding == null || (recyclerView = mViewBinding.f75541e) == null) ? null : recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null || (c14842a = this.adapter) == null) {
            return;
        }
        if (c14842a.getData().isEmpty() || c14842a.getItemViewType(0) != HashTagItemType.TAGS.ordinal()) {
            C24695q mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (tnTextView = mViewBinding2.f75543g) != null) {
                AbstractC26006c.m102054g(tnTextView);
            }
            this.tagsFullyInvisible = false;
            return;
        }
        boolean z11 = gridLayoutManager.findFirstVisibleItemPosition() > 0;
        if (z11 != this.tagsFullyInvisible) {
            this.tagsFullyInvisible = z11;
            if (z11) {
                m67818L0();
                return;
            }
            C24695q mViewBinding3 = getMViewBinding();
            if (mViewBinding3 == null || (tnTextView2 = mViewBinding3.f75543g) == null) {
                return;
            }
            AbstractC26006c.m102054g(tnTextView2);
        }
    }

    private final void showLoadingView() {
        List<Object> data;
        View view;
        ViewStub viewStub;
        C26866a.a.m104898f(C26866a.f81698a, "HashTagPageFragment", "showLoadingView", false, 4, null);
        if (this.skeletonScreenView == null) {
            C24695q mViewBinding = getMViewBinding();
            this.skeletonScreenView = (mViewBinding == null || (viewStub = mViewBinding.f75538b) == null) ? null : viewStub.inflate();
        }
        C14842a c14842a = this.adapter;
        if (c14842a != null && (data = c14842a.getData()) != null && data.isEmpty() && (view = this.skeletonScreenView) != null) {
            AbstractC26006c.m102058k(view);
        }
        if (!this.hasRecordedFirstLoadDuration && this.firstLoadStartTimeMillis == 0) {
            this.firstLoadStartTimeMillis = System.currentTimeMillis();
        }
        View view2 = this.mNoNetworkView;
        if (view2 != null) {
            AbstractC26006c.m102054g(view2);
        }
        View view3 = this.mNoResultView;
        if (view3 != null) {
            AbstractC26006c.m102054g(view3);
        }
        View view4 = this.mNoResultView;
        if (view4 != null) {
            AbstractC26006c.m102054g(view4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public final HashTagViewModel m67838t0() {
        return (HashTagViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: u0 */
    private final void m67839u0() {
        View view = this.skeletonScreenView;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
        View view2 = this.mNoNetworkView;
        if (view2 != null) {
            AbstractC26006c.m102054g(view2);
        }
        View view3 = this.mNoResultView;
        if (view3 != null) {
            AbstractC26006c.m102054g(view3);
        }
    }

    /* JADX INFO: renamed from: v0 */
    private final void m67840v0() {
        View view = this.skeletonScreenView;
        if (view != null) {
            AbstractC26006c.m102054g(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final void m67841w0(final HashTagPageFragment hashTagPageFragment) {
        RecyclerView recyclerView;
        if (C27287m.f83003a.m106330e()) {
            hashTagPageFragment.m67838t0().m68490u(hashTagPageFragment.tabId);
            return;
        }
        C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
        C24695q mViewBinding = hashTagPageFragment.getMViewBinding();
        if (mViewBinding == null || (recyclerView = mViewBinding.f75541e) == null) {
            return;
        }
        recyclerView.postDelayed(new Runnable() { // from class: com.transsion.home.fragment.hashtag.g
            @Override // java.lang.Runnable
            public final void run() {
                HashTagPageFragment.m67842x0(this.f52912a);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m67842x0(HashTagPageFragment hashTagPageFragment) {
        C27941f c27941fM36186h0;
        C14842a c14842a = hashTagPageFragment.adapter;
        if (c14842a == null || (c27941fM36186h0 = c14842a.m36186h0()) == null) {
            return;
        }
        c27941fM36186h0.m108669v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m67843y0(HashTagPageFragment hashTagPageFragment) {
        hashTagPageFragment.m67839u0();
        C25646b c25646b = AbstractC15224m.f52917a;
        if (c25646b != null) {
            c25646b.m100943e();
        }
        hashTagPageFragment.m67838t0().m68485A(hashTagPageFragment.tabId);
    }

    /* JADX INFO: renamed from: z0 */
    private final void m67844z0() {
        m67838t0().m68489s(this.tabId).m14851j(getViewLifecycleOwner(), new AbstractC15224m.a(new Function1() { // from class: com.transsion.home.fragment.hashtag.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HashTagPageFragment.m67808A0(this.f52910a, (RefreshBaseDto) obj);
            }
        }));
        m67838t0().m68491v(this.tabId).m14851j(getViewLifecycleOwner(), new AbstractC15224m.a(new Function1() { // from class: com.transsion.home.fragment.hashtag.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HashTagPageFragment.m67811D0(this.f52911a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F0 */
    public final void m67845F0(InterfaceC15200b interfaceC15200b) {
        this.loadDurationCallback = interfaceC15200b;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        String string;
        String string2;
        SwipeRefreshLayout swipeRefreshLayout;
        SwipeRefreshLayout swipeRefreshLayout2;
        RecyclerView recyclerView;
        C27941f c27941fM36186h0;
        C27941f c27941fM36186h1;
        C27941f c27941fM36186h2;
        String string3;
        Intrinsics.m97802h(view, "view");
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("arg_tab_id")) == null) {
            string = "";
        }
        this.tabId = string;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("fromOptId")) == null) {
            string2 = "";
        }
        this.fromOptId = string2;
        Bundle arguments3 = getArguments();
        this.ugcVideoId = arguments3 != null ? arguments3.getString("ugc_video_id") : null;
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (string3 = arguments4.getString("hashtag_title")) != null) {
            str = string3;
        }
        this.hashtagTitle = str;
        C26866a.a.m104898f(C26866a.f81698a, "HashTagPageFragment", "initView: filterId=" + this.tabId, false, 4, null);
        C24695q mViewBinding = getMViewBinding();
        if (mViewBinding != null && (recyclerView = mViewBinding.f75541e) != null) {
            OffsetGridLayoutManager offsetGridLayoutManager = new OffsetGridLayoutManager(recyclerView.getContext(), this.spanCount, 1, false);
            offsetGridLayoutManager.m20740d0(new C15204f(recyclerView));
            recyclerView.setLayoutManager(offsetGridLayoutManager);
            C25646b c25646b = new C25646b(0.6f, new C15201c(), false, 4, null);
            c25646b.m100946l(2);
            AbstractC15224m.f52917a = c25646b;
            C25646b c25646b2 = AbstractC15224m.f52917a;
            Intrinsics.m97799e(c25646b2);
            recyclerView.addOnScrollListener(c25646b2);
            C14842a c14842a = new C14842a(new C15202d(), AbstractC15224m.f52917a);
            this.adapter = c14842a;
            recyclerView.setAdapter(c14842a);
            C14842a c14842a2 = this.adapter;
            if (c14842a2 != null && (c27941fM36186h2 = c14842a2.m36186h0()) != null) {
                c27941fM36186h2.m108673z(true);
            }
            C14842a c14842a3 = this.adapter;
            if (c14842a3 != null && (c27941fM36186h1 = c14842a3.m36186h0()) != null) {
                c27941fM36186h1.m108672y(true);
            }
            C14842a c14842a4 = this.adapter;
            if (c14842a4 != null && (c27941fM36186h0 = c14842a4.m36186h0()) != null) {
                c27941fM36186h0.m108656D(new InterfaceC27568f() { // from class: com.transsion.home.fragment.hashtag.b
                    @Override // p765s6.InterfaceC27568f
                    /* JADX INFO: renamed from: a */
                    public final void mo63874a() {
                        HashTagPageFragment.m67841w0(this.f52906a);
                    }
                });
            }
            if (recyclerView.getItemDecorationCount() < 1) {
                recyclerView.addItemDecoration(new C15212a(AbstractC5776a0.m27313a(0.0f), AbstractC5776a0.m27313a(4.0f), AbstractC5776a0.m27313a(8.0f), AbstractC5776a0.m27313a(8.0f)));
            }
            recyclerView.addOnScrollListener(new C15203e());
        }
        C24695q mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (swipeRefreshLayout2 = mViewBinding2.f75542f) != null) {
            swipeRefreshLayout2.setEnabled(true);
        }
        C24695q mViewBinding3 = getMViewBinding();
        if (mViewBinding3 != null && (swipeRefreshLayout = mViewBinding3.f75542f) != null) {
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC4420j() { // from class: com.transsion.home.fragment.hashtag.d
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC4420j
                /* JADX INFO: renamed from: a */
                public final void mo21823a() {
                    HashTagPageFragment.m67843y0(this.f52909a);
                }
            });
        }
        m67844z0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C25646b c25646b = AbstractC15224m.f52917a;
        if (c25646b != null) {
            c25646b.m100943e();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        C14842a c14842a;
        List<Object> data;
        super.onResume();
        View view = this.mNoNetworkView;
        if (view == null || !AbstractC26006c.m102056i(view) || !C27287m.f83003a.m106330e() || (c14842a = this.adapter) == null || (data = c14842a.getData()) == null || !data.isEmpty()) {
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "HashTagPageFragment", "onResume: network recovered, auto refresh", false, 4, null);
        View view2 = this.mNoNetworkView;
        if (view2 != null) {
            AbstractC26006c.m102054g(view2);
        }
        m67838t0().m68485A(this.tabId);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public C24695q getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C24695q c24695qM96993c = C24695q.m96993c(inflater);
        Intrinsics.m97801g(c24695qM96993c, "inflate(...)");
        return c24695qM96993c;
    }
}
