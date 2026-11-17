package com.transsion.moviedetail.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.p282tn.lib.view.layoutmanager.NpaLinearLayoutManager;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.ResourcesSeason;
import com.transsion.moviedetailapi.bean.ResourcesSeasonList;
import com.transsion.play.detail.fragment.BaseBottomDialogFragment;
import com.transsnet.downloader.R$anim;
import com.transsnet.downloader.R$string;
import com.transsnet.downloader.adapter.C21319s;
import com.transsnet.downloader.bean.SeasonListBean;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gn.C23614v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26006c;
import p765s6.InterfaceC27566d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J!\u0010\u000e\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u0015\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\tJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J2\u0010!\u001a\u00020\u00072#\u0010 \u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001c¢\u0006\u0004\b!\u0010\"J)\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010)R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00107\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010-R3\u0010:\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006="}, m97100d2 = {"Lcom/transsion/moviedetail/fragment/VideoDetailSeasonsSelectFragment;", "Lcom/transsion/play/detail/fragment/BaseBottomDialogFragment;", "Lgn/v;", "<init>", "()V", "", "season", "", "t0", "(I)V", "u0", "Lcom/transsion/moviedetailapi/bean/ResourcesSeasonList;", "seasonList", "subjectType", "v0", "(Lcom/transsion/moviedetailapi/bean/ResourcesSeasonList;Ljava/lang/Integer;)V", "Landroid/view/LayoutInflater;", "inflater", "q0", "(Landroid/view/LayoutInflater;)Lgn/v;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewModel", "initListener", "retryLoadData", "x0", "initViewData", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "callback", "w0", "(Lkotlin/jvm/functions/Function1;)V", "transit", "", "enter", "nextAnim", "Landroid/view/animation/Animation;", "onCreateAnimation", "(IZI)Landroid/view/animation/Animation;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/moviedetailapi/bean/ResourcesSeasonList;", "c", "Ljava/lang/Integer;", "Lcom/transsnet/downloader/adapter/s;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/transsnet/downloader/adapter/s;", "seasonAdapter", "", "e", "J", "lastClickTime", "f", "curSeason", "g", "Lkotlin/jvm/functions/Function1;", "selSelectCallback", "h", "a", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class VideoDetailSeasonsSelectFragment extends BaseBottomDialogFragment<C23614v> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private ResourcesSeasonList seasonList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Integer subjectType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private C21319s seasonAdapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long lastClickTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Integer curSeason;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Function1 selSelectCallback;

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.VideoDetailSeasonsSelectFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final VideoDetailSeasonsSelectFragment m70605a(ResourcesSeasonList resourcesSeasonList, Integer num) {
            VideoDetailSeasonsSelectFragment videoDetailSeasonsSelectFragment = new VideoDetailSeasonsSelectFragment();
            videoDetailSeasonsSelectFragment.m70602v0(resourcesSeasonList, num);
            return videoDetailSeasonsSelectFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m70597r0(VideoDetailSeasonsSelectFragment videoDetailSeasonsSelectFragment, View view) {
        videoDetailSeasonsSelectFragment.m70600u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m70598s0(VideoDetailSeasonsSelectFragment videoDetailSeasonsSelectFragment, BaseQuickAdapter adapter, View view, int i11) {
        SeasonListBean seasonListBean;
        List<Object> data;
        List<Object> data2;
        Intrinsics.m97802h(adapter, "adapter");
        Intrinsics.m97802h(view, "<unused var>");
        Object item = adapter.getItem(i11);
        Intrinsics.m97800f(item, "null cannot be cast to non-null type com.transsnet.downloader.bean.SeasonListBean");
        SeasonListBean seasonListBean2 = (SeasonListBean) item;
        if (videoDetailSeasonsSelectFragment.lastClickTime == 0 || System.currentTimeMillis() - videoDetailSeasonsSelectFragment.lastClickTime > 1000) {
            videoDetailSeasonsSelectFragment.lastClickTime = System.currentTimeMillis();
            C21319s c21319s = videoDetailSeasonsSelectFragment.seasonAdapter;
            int i12 = -1;
            if (c21319s != null && (data2 = c21319s.getData()) != null) {
                Iterator<Object> it = data2.iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    SeasonListBean seasonListBean3 = (SeasonListBean) it.next();
                    Integer num = videoDetailSeasonsSelectFragment.curSeason;
                    int season = seasonListBean3.getSeason();
                    if (num != null && num.intValue() == season) {
                        i12 = i13;
                        break;
                    }
                    i13++;
                }
            }
            if (i12 >= 0) {
                C21319s c21319s2 = videoDetailSeasonsSelectFragment.seasonAdapter;
                if (i12 < ((c21319s2 == null || (data = c21319s2.getData()) == null) ? 0 : data.size())) {
                    C21319s c21319s3 = videoDetailSeasonsSelectFragment.seasonAdapter;
                    if (c21319s3 != null && (seasonListBean = (SeasonListBean) c21319s3.getItem(i12)) != null) {
                        seasonListBean.setSelected(false);
                    }
                    C21319s c21319s4 = videoDetailSeasonsSelectFragment.seasonAdapter;
                    if (c21319s4 != null) {
                        c21319s4.notifyItemChanged(i12, Boolean.FALSE);
                    }
                }
            }
            seasonListBean2.setSelected(true);
            videoDetailSeasonsSelectFragment.curSeason = Integer.valueOf(seasonListBean2.getSeason());
            C21319s c21319s5 = videoDetailSeasonsSelectFragment.seasonAdapter;
            if (c21319s5 != null) {
                c21319s5.notifyItemChanged(i11, Boolean.TRUE);
            }
            videoDetailSeasonsSelectFragment.m70599t0(seasonListBean2.getSeason());
            videoDetailSeasonsSelectFragment.m70600u0();
        }
    }

    /* JADX INFO: renamed from: t0 */
    private final void m70599t0(int season) {
        Function1 function1 = this.selSelectCallback;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(season));
        }
    }

    /* JADX INFO: renamed from: u0 */
    private final void m70600u0() {
        m71696l0(true);
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
        List<ResourcesSeason> seasons;
        AppCompatTextView appCompatTextView;
        List<ResourcesSeason> seasons2;
        AppCompatTextView appCompatTextView2;
        List<ResourcesSeason> seasons3;
        C23614v c23614v = (C23614v) getMViewBinding();
        if (c23614v != null) {
            c23614v.f72101d.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.b3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoDetailSeasonsSelectFragment.m70597r0(this.f54691a, view);
                }
            });
            ResourcesSeasonList resourcesSeasonList = this.seasonList;
            if (resourcesSeasonList == null || (seasons3 = resourcesSeasonList.getSeasons()) == null || seasons3.size() != 1) {
                AppCompatTextView tvAllEpisodes = c23614v.f72103f;
                Intrinsics.m97801g(tvAllEpisodes, "tvAllEpisodes");
                AbstractC26006c.m102055h(tvAllEpisodes);
                AppCompatTextView tvTitle = c23614v.f72104g;
                Intrinsics.m97801g(tvTitle, "tvTitle");
                AbstractC26006c.m102058k(tvTitle);
            } else {
                AppCompatTextView tvAllEpisodes2 = c23614v.f72103f;
                Intrinsics.m97801g(tvAllEpisodes2, "tvAllEpisodes");
                AbstractC26006c.m102058k(tvAllEpisodes2);
                AppCompatTextView tvTitle2 = c23614v.f72104g;
                Intrinsics.m97801g(tvTitle2, "tvTitle");
                AbstractC26006c.m102055h(tvTitle2);
            }
            Integer num = this.subjectType;
            int value = SubjectType.EDUCATION.getValue();
            String string = null;
            if (num != null && num.intValue() == value) {
                C23614v c23614v2 = (C23614v) getMViewBinding();
                if (c23614v2 != null && (appCompatTextView2 = c23614v2.f72103f) != null) {
                    appCompatTextView2.setText(Utils.m27275a().getString(R$string.download_series_all_lessons));
                }
                AppCompatTextView appCompatTextView3 = c23614v.f72104g;
                Context context = getContext();
                if (context != null) {
                    int i11 = R$string.download_video_detail_units;
                    ResourcesSeasonList resourcesSeasonList2 = this.seasonList;
                    string = context.getString(i11, String.valueOf((resourcesSeasonList2 == null || (seasons2 = resourcesSeasonList2.getSeasons()) == null) ? 1 : seasons2.size()));
                }
                appCompatTextView3.setText(string);
            } else {
                C23614v c23614v3 = (C23614v) getMViewBinding();
                if (c23614v3 != null && (appCompatTextView = c23614v3.f72103f) != null) {
                    appCompatTextView.setText(Utils.m27275a().getString(R$string.download_series_all_episodes));
                }
                AppCompatTextView appCompatTextView4 = c23614v.f72104g;
                Context context2 = getContext();
                if (context2 != null) {
                    int i12 = R$string.download_video_detail_seasons;
                    ResourcesSeasonList resourcesSeasonList3 = this.seasonList;
                    string = context2.getString(i12, String.valueOf((resourcesSeasonList3 == null || (seasons = resourcesSeasonList3.getSeasons()) == null) ? 1 : seasons.size()));
                }
                appCompatTextView4.setText(string);
            }
            RecyclerView recyclerView = c23614v.f72102e;
            Context context3 = getContext();
            recyclerView.setLayoutManager((context3 == null || !AbstractC14556b.m65670a(context3)) ? new NpaLinearLayoutManager(requireContext(), 1, false) : new NpaGridLayoutManager(requireContext(), 2));
            RecyclerView recyclerView2 = c23614v.f72102e;
            C21319s c21319s = new C21319s(this.subjectType);
            this.seasonAdapter = c21319s;
            c21319s.m36227w1(new InterfaceC27566d() { // from class: com.transsion.moviedetail.fragment.c3
                @Override // p765s6.InterfaceC27566d
                /* JADX INFO: renamed from: a */
                public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i13) {
                    VideoDetailSeasonsSelectFragment.m70598s0(this.f54696a, baseQuickAdapter, view, i13);
                }
            });
            recyclerView2.setAdapter(c21319s);
        }
        ResourcesSeasonList resourcesSeasonList4 = this.seasonList;
        if (resourcesSeasonList4 != null) {
            ArrayList arrayList = new ArrayList();
            List<ResourcesSeason> seasons4 = resourcesSeasonList4.getSeasons();
            if (seasons4 != null) {
                for (ResourcesSeason resourcesSeason : seasons4) {
                    int se2 = resourcesSeason.getSe();
                    Integer num2 = this.curSeason;
                    arrayList.add(new SeasonListBean(se2, num2 != null && num2.intValue() == resourcesSeason.getSe()));
                }
            }
            C21319s c21319s2 = this.seasonAdapter;
            if (c21319s2 != null) {
                c21319s2.mo36201n1(arrayList);
            }
        }
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
    }

    @Override // com.transsion.play.detail.fragment.BaseBottomDialogFragment, androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return enter ? AnimationUtils.loadAnimation(getActivity(), R$anim.enter_bottom_menu) : AnimationUtils.loadAnimation(getActivity(), R$anim.exit_bottom_menu);
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public C23614v getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23614v c23614vM93430c = C23614v.m93430c(inflater);
        Intrinsics.m97801g(c23614vM93430c, "inflate(...)");
        return c23614vM93430c;
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }

    /* JADX INFO: renamed from: v0 */
    public final void m70602v0(ResourcesSeasonList seasonList, Integer subjectType) {
        this.seasonList = seasonList;
        this.subjectType = subjectType;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m70603w0(Function1 callback) {
        this.selSelectCallback = callback;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m70604x0(int season) {
        this.curSeason = Integer.valueOf(season);
    }
}
