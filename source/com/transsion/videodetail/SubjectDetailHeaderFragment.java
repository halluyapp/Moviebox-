package com.transsion.videodetail;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.AbstractC2411d;
import androidx.fragment.app.AbstractC3168w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.baseui.util.C14557c;
import com.transsion.moviedetail.dialog.SubjectInfoMoreDetailDialog;
import com.transsion.moviedetail.view.CustomTextViewGroup;
import com.transsion.moviedetail.view.HeaderExtensionFragment;
import com.transsion.moviedetail.viewmodel.MovieDetailViewModel;
import com.transsion.moviedetailapi.AbstractC16247h;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.ResourcesSeason;
import com.transsion.moviedetailapi.bean.ResourcesSeasonList;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.ninegridview.ImageInfo;
import com.transsion.ninegridview.preview.ImagePreviewActivity;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p550kj.C24655b;
import p586lx.C25755h;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0019\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010\u0004J!\u0010(\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b(\u0010&R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010=\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00108R\u0016\u0010@\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00108R\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0016\u0010J\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010ER\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006O"}, m97100d2 = {"Lcom/transsion/videodetail/SubjectDetailHeaderFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Llx/h;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "s0", "(Landroid/view/View;)V", "p0", "Lcom/transsion/moviedetailapi/bean/ResourcesSeasonList;", "seasonsList", "k0", "(Lcom/transsion/moviedetailapi/bean/ResourcesSeasonList;)V", "Lcom/transsion/moviedetailapi/bean/Subject;", "movieDetailBean", "v0", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", "", "releaseDate", "g0", "(Ljava/lang/String;)Ljava/lang/String;", "", "addStatus", "t0", "(Ljava/lang/Integer;)V", "seeStatus", "u0", "Landroid/view/LayoutInflater;", "inflater", "j0", "(Landroid/view/LayoutInflater;)Llx/h;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "initData", "Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "a", "Lkotlin/Lazy;", "h0", "()Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "movieDetailViewModel", "Lcom/transsion/videodetail/VideoDetailViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "i0", "()Lcom/transsion/videodetail/VideoDetailViewModel;", "videoDetailViewModel", "c", "Lcom/transsion/moviedetailapi/bean/Subject;", "mMovieDetailBean", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Ljava/lang/String;", "ops", "e", "mSubjectId", "f", "pageName", "g", "I", "curSeason", "h", "moduleName", "", "i", "Z", "isInterceptDetail", "j", "isOutSideVideo", CampaignEx.JSON_KEY_AD_K, "hasResource", "Lcom/transsion/moviedetail/view/HeaderExtensionFragment;", "l", "Lcom/transsion/moviedetail/view/HeaderExtensionFragment;", "headerExtensionFragment", "VideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SubjectDetailHeaderFragment extends BaseFragment<C25755h> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Subject mMovieDetailBean;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String ops;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String mSubjectId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String moduleName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isInterceptDetail;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean isOutSideVideo;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean hasResource;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private HeaderExtensionFragment headerExtensionFragment;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy movieDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MovieDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.SubjectDetailHeaderFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.SubjectDetailHeaderFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy videoDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(VideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.SubjectDetailHeaderFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.SubjectDetailHeaderFragment$special$$inlined$activityViewModels$default$4
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

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String pageName = "stream_detail";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int curSeason = 1;

    /* JADX INFO: renamed from: com.transsion.videodetail.SubjectDetailHeaderFragment$a */
    static final class C20903a implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65677a;

        C20903a(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65677a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65677a;
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
            this.f65677a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: g0 */
    private final String m86029g0(String releaseDate) {
        if (releaseDate.length() < 4) {
            return releaseDate;
        }
        String strSubstring = releaseDate.substring(0, 4);
        Intrinsics.m97801g(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: h0 */
    private final MovieDetailViewModel m86030h0() {
        return (MovieDetailViewModel) this.movieDetailViewModel.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    private final VideoDetailViewModel m86031i0() {
        return (VideoDetailViewModel) this.videoDetailViewModel.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX INFO: renamed from: k0 */
    private final void m86032k0(ResourcesSeasonList seasonsList) {
        int se2;
        List<ResourcesSeason> seasons;
        List<ResourcesSeason> seasons2;
        if (seasonsList == null || (seasons2 = seasonsList.getSeasons()) == null || !seasons2.isEmpty()) {
            if (seasonsList == null || (seasons = seasonsList.getSeasons()) == null) {
                se2 = this.curSeason;
            } else {
                Iterator<T> it = seasons.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                Object next = it.next();
                if (it.hasNext()) {
                    int se3 = ((ResourcesSeason) next).getSe();
                    do {
                        Object next2 = it.next();
                        int se4 = ((ResourcesSeason) next2).getSe();
                        if (se3 > se4) {
                            next = next2;
                            se3 = se4;
                        }
                    } while (it.hasNext());
                }
                ResourcesSeason resourcesSeason = (ResourcesSeason) next;
                if (resourcesSeason != null) {
                    se2 = resourcesSeason.getSe();
                } else {
                    se2 = this.curSeason;
                }
            }
            if (this.curSeason < se2) {
                this.curSeason = se2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final Unit m86033l0(SubjectDetailHeaderFragment subjectDetailHeaderFragment, Pair pair) {
        Subject subject = (Subject) pair.getSecond();
        C26866a.f81698a.m104912c("videoDetail", "get movie detail data==" + pair, true);
        if (subject != null) {
            subjectDetailHeaderFragment.m86043v0(subject);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final Unit m86034m0(SubjectDetailHeaderFragment subjectDetailHeaderFragment, Integer num) {
        Intrinsics.m97799e(num);
        subjectDetailHeaderFragment.curSeason = num.intValue();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final Unit m86035n0(SubjectDetailHeaderFragment subjectDetailHeaderFragment, ResourcesSeasonList resourcesSeasonList) {
        subjectDetailHeaderFragment.m86032k0(resourcesSeasonList);
        subjectDetailHeaderFragment.hideLoading();
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final Unit m86036o0(SubjectDetailHeaderFragment subjectDetailHeaderFragment, Integer num) {
        Intrinsics.m97799e(num);
        subjectDetailHeaderFragment.curSeason = num.intValue();
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: p0 */
    private final void m86037p0() {
        final ShapeableImageView shapeableImageView;
        String url;
        Cover cover;
        String thumbnail;
        Cover cover2;
        FrameLayout frameLayout;
        Subject subject;
        if (!this.hasResource || ((subject = this.mMovieDetailBean) != null && subject.isFamilyModeIntercept())) {
            C25755h mViewBinding = getMViewBinding();
            if (mViewBinding != null && (frameLayout = mViewBinding.f78553b) != null) {
                AbstractC26006c.m102054g(frameLayout);
            }
            C25755h mViewBinding2 = getMViewBinding();
            if (mViewBinding2 == null || (shapeableImageView = mViewBinding2.f78555d) == null) {
                return;
            }
            C23860f.a aVar = C23860f.f72909a;
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(contextRequireContext);
            Subject subject2 = this.mMovieDetailBean;
            String str = "";
            if (subject2 == null || (cover2 = subject2.getCover()) == null || (url = cover2.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
            Subject subject3 = this.mMovieDetailBean;
            if (subject3 != null && (cover = subject3.getCover()) != null && (thumbnail = cover.getThumbnail()) != null) {
                str = thumbnail;
            }
            bVarM94468g.m94473l(str).m94465d(shapeableImageView);
            shapeableImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SubjectDetailHeaderFragment.m86038q0(this.f65775a, shapeableImageView, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final void m86038q0(SubjectDetailHeaderFragment subjectDetailHeaderFragment, ShapeableImageView shapeableImageView, View view) {
        Cover cover;
        Subject subject = subjectDetailHeaderFragment.mMovieDetailBean;
        if (subject == null || (cover = subject.getCover()) == null) {
            return;
        }
        C14450a.f50860a.m65145h("movie_poster", "preview", (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? "" : null, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : null);
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.bigImageUrl = cover.getUrl();
        imageInfo.thumbnailUrl = cover.getThumbnail();
        Integer height = cover.getHeight();
        imageInfo.imageViewHeight = height != null ? height.intValue() : 0.0f;
        Integer width = cover.getWidth();
        imageInfo.imageViewWidth = width != null ? width.intValue() : 0.0f;
        List listQ = CollectionsKt.m97511q(imageInfo);
        ImagePreviewActivity.Companion c16335a = ImagePreviewActivity.INSTANCE;
        Context context = shapeableImageView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        c16335a.m71396a(context, 0, listQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m86039r0(SubjectDetailHeaderFragment subjectDetailHeaderFragment, View view) {
        Intrinsics.m97799e(view);
        subjectDetailHeaderFragment.m86040s0(view);
    }

    /* JADX INFO: renamed from: s0 */
    private final void m86040s0(View view) {
        if (this.isInterceptDetail || C14557c.f51100a.m65671a(view.getId(), 1000L)) {
            return;
        }
        C26866a.a.m104899g(C26866a.f81698a, "Open the right to view more detail", false, 2, null);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            SubjectInfoMoreDetailDialog subjectInfoMoreDetailDialog = new SubjectInfoMoreDetailDialog();
            subjectInfoMoreDetailDialog.setArguments(AbstractC2411d.m11891b(TuplesKt.m97108a("data_key_resource_detectors", this.mMovieDetailBean)));
            subjectInfoMoreDetailDialog.m71697n0(parentFragment, R$id.fl_bottom_dialog_container);
        }
    }

    /* JADX INFO: renamed from: t0 */
    private final void m86041t0(Integer addStatus) {
    }

    /* JADX INFO: renamed from: u0 */
    private final void m86042u0(Integer seeStatus) {
    }

    /* JADX INFO: renamed from: v0 */
    private final void m86043v0(Subject movieDetailBean) {
        Subject subject;
        CustomTextViewGroup customTextViewGroup;
        AppCompatTextView appCompatTextView;
        CustomTextViewGroup customTextViewGroup2;
        C25755h mViewBinding;
        CustomTextViewGroup customTextViewGroup3;
        C25755h mViewBinding2;
        CustomTextViewGroup customTextViewGroup4;
        C25755h mViewBinding3;
        CustomTextViewGroup customTextViewGroup5;
        FrameLayout frameLayout;
        C25755h mViewBinding4;
        CustomTextViewGroup customTextViewGroup6;
        CustomTextViewGroup customTextViewGroup7;
        C25755h mViewBinding5;
        CustomTextViewGroup customTextViewGroup8;
        AppCompatTextView appCompatTextView2;
        AppCompatImageView appCompatImageView;
        View view;
        AppCompatTextView appCompatTextView3;
        CustomTextViewGroup customTextViewGroup9;
        AppCompatTextView appCompatTextView4;
        CustomTextViewGroup customTextViewGroup10;
        Subject subject2;
        View view2;
        AppCompatTextView appCompatTextView5;
        CustomTextViewGroup customTextViewGroup11;
        CustomTextViewGroup customTextViewGroup12;
        C25755h mViewBinding6;
        LinearLayout linearLayout;
        AppCompatTextView appCompatTextView6;
        AppCompatImageView appCompatImageView2;
        HashMap mapM96844g;
        HashMap mapM96844g2;
        this.mMovieDetailBean = movieDetailBean;
        C24655b logViewConfig = getLogViewConfig();
        if (logViewConfig != null) {
            logViewConfig.m96848k(true);
        }
        C24655b logViewConfig2 = getLogViewConfig();
        if (logViewConfig2 != null && (mapM96844g2 = logViewConfig2.m96844g()) != null) {
            String subjectId = movieDetailBean.getSubjectId();
            if (subjectId == null) {
                subjectId = "";
            }
            mapM96844g2.put("subject_id", subjectId);
        }
        C24655b logViewConfig3 = getLogViewConfig();
        if (logViewConfig3 != null && (mapM96844g = logViewConfig3.m96844g()) != null) {
            mapM96844g.put("has_resource", String.valueOf(movieDetailBean.getHasResource()));
        }
        Subject subject3 = this.mMovieDetailBean;
        String ops = subject3 != null ? subject3.getOps() : null;
        if ((ops == null || ops.length() == 0) && (subject = this.mMovieDetailBean) != null) {
            subject.setOps(this.ops);
        }
        int iM71009a = AbstractC16247h.m71009a(movieDetailBean.getSubjectType());
        C25755h mViewBinding7 = getMViewBinding();
        if (mViewBinding7 != null && (appCompatImageView2 = mViewBinding7.f78554c) != null) {
            appCompatImageView2.setImageResource(iM71009a);
        }
        C25755h mViewBinding8 = getMViewBinding();
        if (mViewBinding8 != null && (appCompatTextView6 = mViewBinding8.f78561j) != null) {
            appCompatTextView6.setText(movieDetailBean.getTitle());
        }
        if (this.isOutSideVideo && (mViewBinding6 = getMViewBinding()) != null && (linearLayout = mViewBinding6.f78558g) != null) {
            AbstractC26006c.m102054g(linearLayout);
        }
        if (movieDetailBean.isTvType()) {
            Integer seNum = movieDetailBean.getSeNum();
            if (seNum != null) {
                int iIntValue = seNum.intValue();
                if (iIntValue <= 0) {
                    C25755h mViewBinding9 = getMViewBinding();
                    if (mViewBinding9 != null && (customTextViewGroup12 = mViewBinding9.f78564m) != null) {
                        customTextViewGroup12.setText("");
                    }
                } else {
                    if (!this.hasResource || ((subject2 = this.mMovieDetailBean) != null && subject2.isFamilyModeIntercept())) {
                        C25755h mViewBinding10 = getMViewBinding();
                        if (mViewBinding10 != null && (customTextViewGroup9 = mViewBinding10.f78564m) != null) {
                            AbstractC26006c.m102054g(customTextViewGroup9);
                        }
                        C25755h mViewBinding11 = getMViewBinding();
                        if (mViewBinding11 != null && (appCompatTextView3 = mViewBinding11.f78565n) != null) {
                            AbstractC26006c.m102058k(appCompatTextView3);
                        }
                        C25755h mViewBinding12 = getMViewBinding();
                        if (mViewBinding12 != null && (view = mViewBinding12.f78569r) != null) {
                            AbstractC26006c.m102058k(view);
                        }
                    } else {
                        C25755h mViewBinding13 = getMViewBinding();
                        if (mViewBinding13 != null && (customTextViewGroup11 = mViewBinding13.f78564m) != null) {
                            AbstractC26006c.m102058k(customTextViewGroup11);
                        }
                        C25755h mViewBinding14 = getMViewBinding();
                        if (mViewBinding14 != null && (appCompatTextView5 = mViewBinding14.f78565n) != null) {
                            AbstractC26006c.m102054g(appCompatTextView5);
                        }
                        C25755h mViewBinding15 = getMViewBinding();
                        if (mViewBinding15 != null && (view2 = mViewBinding15.f78569r) != null) {
                            AbstractC26006c.m102054g(view2);
                        }
                    }
                    Context context = getContext();
                    String string = context != null ? context.getString(com.transsion.moviedetail.R$string.movie_detail_seasons, Integer.valueOf(iIntValue)) : null;
                    C25755h mViewBinding16 = getMViewBinding();
                    if (mViewBinding16 != null && (customTextViewGroup10 = mViewBinding16.f78564m) != null) {
                        customTextViewGroup10.setText(string == null ? "" : string);
                    }
                    C25755h mViewBinding17 = getMViewBinding();
                    if (mViewBinding17 != null && (appCompatTextView4 = mViewBinding17.f78565n) != null) {
                        appCompatTextView4.setText(string != null ? string : "");
                    }
                }
            }
        } else {
            C25755h mViewBinding18 = getMViewBinding();
            if (mViewBinding18 != null && (customTextViewGroup = mViewBinding18.f78564m) != null) {
                AbstractC26006c.m102054g(customTextViewGroup);
            }
        }
        if (movieDetailBean.isMusicType()) {
            C25755h mViewBinding19 = getMViewBinding();
            if (mViewBinding19 != null && (appCompatImageView = mViewBinding19.f78557f) != null) {
                AbstractC26006c.m102054g(appCompatImageView);
            }
            C25755h mViewBinding20 = getMViewBinding();
            if (mViewBinding20 != null && (appCompatTextView2 = mViewBinding20.f78563l) != null) {
                AbstractC26006c.m102054g(appCompatTextView2);
            }
            String countryName = movieDetailBean.getCountryName();
            if (countryName != null && (mViewBinding5 = getMViewBinding()) != null && (customTextViewGroup8 = mViewBinding5.f78559h) != null) {
                customTextViewGroup8.setText(countryName);
            }
            String genre = movieDetailBean.getGenre();
            if (genre != null) {
                String string2 = StringsKt.m98155n1((String) StringsKt.m98117S0(genre, new String[]{","}, false, 0, 6, null).get(0)).toString();
                C25755h mViewBinding21 = getMViewBinding();
                if (mViewBinding21 != null && (customTextViewGroup7 = mViewBinding21.f78567p) != null) {
                    customTextViewGroup7.setText(string2);
                }
            }
            String releaseDate = movieDetailBean.getReleaseDate();
            if (releaseDate != null && (mViewBinding4 = getMViewBinding()) != null && (customTextViewGroup6 = mViewBinding4.f78566o) != null) {
                customTextViewGroup6.setText(m86029g0(releaseDate));
            }
        } else {
            String restrictLevel = movieDetailBean.getRestrictLevel();
            if (restrictLevel != null && (mViewBinding3 = getMViewBinding()) != null && (customTextViewGroup5 = mViewBinding3.f78562k) != null) {
                customTextViewGroup5.setText(restrictLevel);
            }
            String releaseDate2 = movieDetailBean.getReleaseDate();
            if (releaseDate2 != null && (mViewBinding2 = getMViewBinding()) != null && (customTextViewGroup4 = mViewBinding2.f78566o) != null) {
                customTextViewGroup4.setText(m86029g0(releaseDate2));
            }
            String countryName2 = movieDetailBean.getCountryName();
            if (countryName2 != null && (mViewBinding = getMViewBinding()) != null && (customTextViewGroup3 = mViewBinding.f78559h) != null) {
                customTextViewGroup3.setText(countryName2);
            }
            String genre2 = movieDetailBean.getGenre();
            if (genre2 != null) {
                String string3 = StringsKt.m98155n1((String) StringsKt.m98117S0(genre2, new String[]{","}, false, 0, 6, null).get(0)).toString();
                C25755h mViewBinding22 = getMViewBinding();
                if (mViewBinding22 != null && (customTextViewGroup2 = mViewBinding22.f78567p) != null) {
                    customTextViewGroup2.setText(string3);
                }
            }
            C25755h mViewBinding23 = getMViewBinding();
            if (mViewBinding23 != null && (appCompatTextView = mViewBinding23.f78563l) != null) {
                appCompatTextView.setText(movieDetailBean.getImdbRate());
            }
        }
        Subject subject4 = this.mMovieDetailBean;
        m86042u0(subject4 != null ? subject4.getSeenStatus() : null);
        Subject subject5 = this.mMovieDetailBean;
        m86041t0(subject5 != null ? subject5.getSeenStatus() : null);
        if (this.isInterceptDetail) {
            C25755h mViewBinding24 = getMViewBinding();
            if (mViewBinding24 == null || (frameLayout = mViewBinding24.f78553b) == null) {
                return;
            }
            AbstractC26006c.m102054g(frameLayout);
            return;
        }
        if (this.headerExtensionFragment == null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.m97801g(childFragmentManager, "getChildFragmentManager(...)");
            AbstractC3168w abstractC3168wM14557p = childFragmentManager.m14557p();
            Intrinsics.m97801g(abstractC3168wM14557p, "beginTransaction()");
            HeaderExtensionFragment headerExtensionFragment = new HeaderExtensionFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("data_key_resource_detectors", this.mMovieDetailBean);
            bundle.putString("module_name", this.moduleName);
            bundle.putInt("season", this.curSeason);
            bundle.putString("ops", this.ops);
            bundle.putString(WebConstants.PAGE_FROM, this.pageName);
            headerExtensionFragment.setArguments(bundle);
            abstractC3168wM14557p.m14813s(R$id.extension_container, headerExtensionFragment);
            this.headerExtensionFragment = headerExtensionFragment;
            abstractC3168wM14557p.mo14671j();
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initData(View view, Bundle savedInstanceState) {
        String string;
        AppCompatImageView appCompatImageView;
        ShapeableImageView shapeableImageView;
        Subject subject;
        C25755h mViewBinding;
        AppCompatTextView appCompatTextView;
        Intrinsics.m97802h(view, "view");
        super.initData(view, savedInstanceState);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("data_key_resource_detectors") : null;
        this.mMovieDetailBean = serializable instanceof Subject ? (Subject) serializable : null;
        Bundle arguments2 = getArguments();
        this.moduleName = arguments2 != null ? arguments2.getString("module_name") : null;
        Bundle arguments3 = getArguments();
        this.curSeason = arguments3 != null ? arguments3.getInt("season") : 1;
        Bundle arguments4 = getArguments();
        this.ops = arguments4 != null ? arguments4.getString("ops") : null;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (string = arguments5.getString(WebConstants.PAGE_FROM)) == null) {
            string = "stream_detail";
        }
        this.pageName = string;
        Bundle arguments6 = getArguments();
        this.mSubjectId = arguments6 != null ? arguments6.getString("id") : null;
        Bundle arguments7 = getArguments();
        this.isInterceptDetail = arguments7 != null ? arguments7.getBoolean("is_Intercept_detail") : false;
        Bundle arguments8 = getArguments();
        this.isOutSideVideo = arguments8 != null ? arguments8.getBoolean("isOutsideVideo") : false;
        Subject subject2 = this.mMovieDetailBean;
        this.hasResource = subject2 != null ? Intrinsics.m97797c(subject2.getHasResource(), Boolean.TRUE) : false;
        Subject subject3 = this.mMovieDetailBean;
        if (subject3 != null) {
            Intrinsics.m97799e(subject3);
            m86043v0(subject3);
        }
        if (this.isInterceptDetail && (mViewBinding = getMViewBinding()) != null && (appCompatTextView = mViewBinding.f78560i) != null) {
            AbstractC26006c.m102054g(appCompatTextView);
        }
        if (!this.hasResource || ((subject = this.mMovieDetailBean) != null && subject.isFamilyModeIntercept())) {
            C25755h mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (shapeableImageView = mViewBinding2.f78555d) != null) {
                AbstractC26006c.m102058k(shapeableImageView);
            }
            C25755h mViewBinding3 = getMViewBinding();
            if (mViewBinding3 != null && (appCompatImageView = mViewBinding3.f78556e) != null) {
                AbstractC26006c.m102058k(appCompatImageView);
            }
        }
        MovieDetailViewModel movieDetailViewModelM86030h0 = m86030h0();
        movieDetailViewModelM86030h0.m70910F().m14851j(this, new C20903a(new Function1() { // from class: com.transsion.videodetail.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubjectDetailHeaderFragment.m86033l0(this.f65756a, (Pair) obj);
            }
        }));
        movieDetailViewModelM86030h0.m70914K().m14851j(this, new C20903a(new Function1() { // from class: com.transsion.videodetail.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubjectDetailHeaderFragment.m86034m0(this.f65759a, (Integer) obj);
            }
        }));
        m86031i0().m86130y().m14851j(this, new C20903a(new Function1() { // from class: com.transsion.videodetail.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubjectDetailHeaderFragment.m86035n0(this.f65765a, (ResourcesSeasonList) obj);
            }
        }));
        m86030h0().m70914K().m14851j(this, new C20903a(new Function1() { // from class: com.transsion.videodetail.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubjectDetailHeaderFragment.m86036o0(this.f65769a, (Integer) obj);
            }
        }));
        m86037p0();
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        C25755h mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            mViewBinding.f78568q.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SubjectDetailHeaderFragment.m86039r0(this.f65772a, view2);
                }
            });
        }
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public C25755h getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25755h c25755hM101291c = C25755h.m101291c(inflater);
        Intrinsics.m97801g(c25755hM101291c, "inflate(...)");
        return c25755hM101291c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }

    @Override // com.transsion.baseui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
