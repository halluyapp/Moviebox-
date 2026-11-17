package com.transsion.videodetail;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import com.blankj.utilcode.util.AbstractC5790i;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.core.utils.C14752e;
import com.transsion.moviedetail.activity.MoviePosterActivity;
import com.transsion.moviedetail.viewmodel.MovieDetailViewModel;
import com.transsion.moviedetailapi.AbstractC16247h;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import ng.AbstractC26006c;
import p384en.C23197j;
import p462hj.C23860f;
import p550kj.C24655b;
import p586lx.C25754g;
import pg.C26866a;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
@Metadata(m97099d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J!\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001bR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(¨\u0006,"}, m97100d2 = {"Lcom/transsion/videodetail/SubjectDetailInfoFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Llx/g;", "<init>", "()V", "Lcom/transsion/moviedetailapi/bean/Subject;", "movieDetailBean", "", "k0", "(Lcom/transsion/moviedetailapi/bean/Subject;)V", "", "seconds", "", "d0", "(I)Ljava/lang/String;", "subtitles", "i0", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "f0", "(Landroid/view/LayoutInflater;)Llx/g;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "initData", "Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "a", "Lkotlin/Lazy;", "e0", "()Lcom/transsion/moviedetail/viewmodel/MovieDetailViewModel;", "movieDetailViewModel", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/moviedetailapi/bean/Subject;", "mMovieDetailBean", "c", "Ljava/lang/String;", "ops", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "mSubjectId", "VideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class SubjectDetailInfoFragment extends BaseFragment<C25754g> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy movieDetailViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(MovieDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.videodetail.SubjectDetailInfoFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.videodetail.SubjectDetailInfoFragment$special$$inlined$activityViewModels$default$2
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
    private Subject mMovieDetailBean;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String ops;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String mSubjectId;

    /* JADX INFO: renamed from: com.transsion.videodetail.SubjectDetailInfoFragment$a */
    static final class C20908a implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f65682a;

        C20908a(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f65682a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f65682a;
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
            this.f65682a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: d0 */
    private final String m86048d0(int seconds) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.f75910a;
        String str = String.format("%02dh%02dm", Arrays.copyOf(new Object[]{Integer.valueOf(seconds / 3600), Integer.valueOf((seconds % 3600) / 60)}, 2));
        Intrinsics.m97801g(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: e0 */
    private final MovieDetailViewModel m86049e0() {
        return (MovieDetailViewModel) this.movieDetailViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final Unit m86050g0(SubjectDetailInfoFragment subjectDetailInfoFragment, Pair pair) {
        HashMap mapM96844g;
        HashMap mapM96844g2;
        Subject subject = (Subject) pair.getSecond();
        C26866a.f81698a.m104912c("videoDetail", "get movie detail data==" + pair, true);
        if (subject != null) {
            subjectDetailInfoFragment.m86054k0(subject);
            C24655b logViewConfig = subjectDetailInfoFragment.getLogViewConfig();
            if (logViewConfig != null) {
                logViewConfig.m96848k(true);
            }
            C24655b logViewConfig2 = subjectDetailInfoFragment.getLogViewConfig();
            if (logViewConfig2 != null && (mapM96844g2 = logViewConfig2.m96844g()) != null) {
                String subjectId = subject.getSubjectId();
                if (subjectId == null) {
                    subjectId = "";
                }
                mapM96844g2.put("subject_id", subjectId);
            }
            C24655b logViewConfig3 = subjectDetailInfoFragment.getLogViewConfig();
            if (logViewConfig3 != null && (mapM96844g = logViewConfig3.m96844g()) != null) {
                mapM96844g.put("has_resource", String.valueOf(subject.getHasResource()));
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final void m86051h0(SubjectDetailInfoFragment subjectDetailInfoFragment, View view) {
        C23197j c23197j = new C23197j(subjectDetailInfoFragment.mMovieDetailBean);
        FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name = C23197j.class.getName();
        Intrinsics.m97801g(name, "getName(...)");
        flowEventBus.postEvent(name, c23197j, 0L);
        C14450a.f50860a.m65145h("subjectdetail", "movie_poster", (60 & 4) != 0 ? "" : "", (60 & 8) != 0 ? "" : subjectDetailInfoFragment.mSubjectId, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? null : subjectDetailInfoFragment.ops);
        subjectDetailInfoFragment.startActivity(new Intent(subjectDetailInfoFragment.requireContext(), (Class<?>) MoviePosterActivity.class));
    }

    /* JADX INFO: renamed from: i0 */
    private final void m86052i0(String subtitles) {
        AppCompatTextView appCompatTextView;
        AppCompatImageView appCompatImageView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        AppCompatTextView appCompatTextView5;
        AppCompatTextView appCompatTextView6;
        AppCompatTextView appCompatTextView7;
        AppCompatImageView appCompatImageView2;
        CharSequence charSequenceM70923v = m86049e0().m70923v(subtitles);
        if (charSequenceM70923v == null || charSequenceM70923v.length() == 0) {
            C25754g mViewBinding = getMViewBinding();
            if (mViewBinding != null && (appCompatTextView2 = mViewBinding.f78550n) != null) {
                AbstractC26006c.m102054g(appCompatTextView2);
            }
            C25754g mViewBinding2 = getMViewBinding();
            if (mViewBinding2 != null && (appCompatImageView = mViewBinding2.f78543g) != null) {
                AbstractC26006c.m102054g(appCompatImageView);
            }
            C25754g mViewBinding3 = getMViewBinding();
            if (mViewBinding3 == null || (appCompatTextView = mViewBinding3.f78549m) == null) {
                return;
            }
            AbstractC26006c.m102054g(appCompatTextView);
            return;
        }
        C25754g mViewBinding4 = getMViewBinding();
        if (mViewBinding4 != null && (appCompatImageView2 = mViewBinding4.f78543g) != null) {
            AbstractC26006c.m102058k(appCompatImageView2);
        }
        C25754g mViewBinding5 = getMViewBinding();
        if (mViewBinding5 != null && (appCompatTextView7 = mViewBinding5.f78550n) != null) {
            AbstractC26006c.m102058k(appCompatTextView7);
        }
        C25754g mViewBinding6 = getMViewBinding();
        if (mViewBinding6 == null || (appCompatTextView3 = mViewBinding6.f78550n) == null) {
            return;
        }
        appCompatTextView3.setText(charSequenceM70923v);
        TextPaint paint = appCompatTextView3.getPaint();
        Intrinsics.m97801g(paint, "getPaint(...)");
        int iM66409f = C14752e.m66409f() - AbstractC5790i.m27411e(130.0f);
        StaticLayout staticLayoutBuild = Build.VERSION.SDK_INT > 23 ? StaticLayout.Builder.obtain(charSequenceM70923v, 0, charSequenceM70923v.length(), paint, iM66409f).build() : new StaticLayout(charSequenceM70923v, paint, iM66409f, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        Intrinsics.m97799e(staticLayoutBuild);
        if (staticLayoutBuild.getLineCount() <= 1) {
            C25754g mViewBinding7 = getMViewBinding();
            if (mViewBinding7 == null || (appCompatTextView4 = mViewBinding7.f78549m) == null) {
                return;
            }
            AbstractC26006c.m102054g(appCompatTextView4);
            return;
        }
        C25754g mViewBinding8 = getMViewBinding();
        if (mViewBinding8 != null && (appCompatTextView6 = mViewBinding8.f78549m) != null) {
            AbstractC26006c.m102058k(appCompatTextView6);
        }
        C25754g mViewBinding9 = getMViewBinding();
        if (mViewBinding9 == null || (appCompatTextView5 = mViewBinding9.f78549m) == null) {
            return;
        }
        appCompatTextView5.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubjectDetailInfoFragment.m86053j0(this.f65784a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final void m86053j0(SubjectDetailInfoFragment subjectDetailInfoFragment, View view) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        C25754g mViewBinding = subjectDetailInfoFragment.getMViewBinding();
        if (mViewBinding != null && (appCompatTextView2 = mViewBinding.f78549m) != null) {
            AbstractC26006c.m102054g(appCompatTextView2);
        }
        C25754g mViewBinding2 = subjectDetailInfoFragment.getMViewBinding();
        if (mViewBinding2 == null || (appCompatTextView = mViewBinding2.f78550n) == null) {
            return;
        }
        appCompatTextView.setMaxLines(5);
    }

    /* JADX INFO: renamed from: k0 */
    private final void m86054k0(Subject movieDetailBean) {
        Subject subject;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        ShapeableImageView shapeableImageView;
        String url;
        String thumbnail;
        AppCompatTextView appCompatTextView4;
        AppCompatTextView appCompatTextView5;
        AppCompatImageView appCompatImageView;
        AppCompatTextView appCompatTextView6;
        AppCompatImageView appCompatImageView2;
        ShapeableImageView shapeableImageView2;
        AppCompatTextView appCompatTextView7;
        AppCompatImageView appCompatImageView3;
        this.mMovieDetailBean = movieDetailBean;
        String ops = movieDetailBean != null ? movieDetailBean.getOps() : null;
        if ((ops == null || ops.length() == 0) && (subject = this.mMovieDetailBean) != null) {
            subject.setOps(this.ops);
        }
        int iM71009a = AbstractC16247h.m71009a(movieDetailBean.getSubjectType());
        C25754g mViewBinding = getMViewBinding();
        if (mViewBinding != null && (appCompatImageView3 = mViewBinding.f78539c) != null) {
            appCompatImageView3.setImageResource(iM71009a);
        }
        C25754g mViewBinding2 = getMViewBinding();
        if (mViewBinding2 != null && (appCompatTextView7 = mViewBinding2.f78547k) != null) {
            appCompatTextView7.setText(movieDetailBean.getTitle());
        }
        Subject subject2 = this.mMovieDetailBean;
        m86052i0(subject2 != null ? subject2.getSubtitles() : null);
        if (movieDetailBean.isMusicType()) {
            C25754g mViewBinding3 = getMViewBinding();
            if (mViewBinding3 != null && (shapeableImageView2 = mViewBinding3.f78540d) != null) {
                AbstractC26006c.m102054g(shapeableImageView2);
            }
            C25754g mViewBinding4 = getMViewBinding();
            if (mViewBinding4 != null && (appCompatImageView2 = mViewBinding4.f78542f) != null) {
                AbstractC26006c.m102054g(appCompatImageView2);
            }
            C25754g mViewBinding5 = getMViewBinding();
            if (mViewBinding5 != null && (appCompatTextView6 = mViewBinding5.f78548l) != null) {
                AbstractC26006c.m102054g(appCompatTextView6);
            }
            C25754g mViewBinding6 = getMViewBinding();
            if (mViewBinding6 != null && (appCompatImageView = mViewBinding6.f78543g) != null) {
                AbstractC26006c.m102054g(appCompatImageView);
            }
            C25754g mViewBinding7 = getMViewBinding();
            if (mViewBinding7 != null && (appCompatTextView5 = mViewBinding7.f78550n) != null) {
                AbstractC26006c.m102054g(appCompatTextView5);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (TextUtils.isEmpty(movieDetailBean.getCountryName())) {
                spannableStringBuilder.append((CharSequence) movieDetailBean.getLanguage());
            } else {
                spannableStringBuilder.append((CharSequence) movieDetailBean.getCountryName());
            }
            if (!TextUtils.isEmpty(movieDetailBean.getGenre())) {
                if (spannableStringBuilder.length() > 2) {
                    spannableStringBuilder.append((CharSequence) " / ");
                }
                spannableStringBuilder.append((CharSequence) movieDetailBean.getGenre());
            }
            String releaseDate = movieDetailBean.getReleaseDate();
            if (releaseDate != null && releaseDate.length() > 0) {
                spannableStringBuilder.append((CharSequence) " / ");
                spannableStringBuilder.append((CharSequence) releaseDate);
            }
            String duration = movieDetailBean.getDuration();
            if (duration != null) {
                if (duration.length() > 0) {
                    if (spannableStringBuilder.length() > 0) {
                        spannableStringBuilder.append((CharSequence) " / ");
                    }
                    spannableStringBuilder.append((CharSequence) duration);
                } else {
                    Integer durationSeconds = movieDetailBean.getDurationSeconds();
                    if ((durationSeconds != null ? durationSeconds.intValue() : 0) > 0) {
                        spannableStringBuilder.append((CharSequence) " / ");
                        Integer durationSeconds2 = movieDetailBean.getDurationSeconds();
                        spannableStringBuilder.append((CharSequence) m86048d0(durationSeconds2 != null ? durationSeconds2.intValue() : 0));
                    }
                }
            }
            C25754g mViewBinding8 = getMViewBinding();
            if (mViewBinding8 == null || (appCompatTextView4 = mViewBinding8.f78546j) == null) {
                return;
            }
            appCompatTextView4.setText(spannableStringBuilder);
            return;
        }
        C25754g mViewBinding9 = getMViewBinding();
        if (mViewBinding9 != null && (shapeableImageView = mViewBinding9.f78540d) != null) {
            C23860f.a aVar = C23860f.f72909a;
            Context contextRequireContext = requireContext();
            Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(contextRequireContext);
            Cover cover = movieDetailBean.getCover();
            String str = "";
            if (cover == null || (url = cover.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
            Cover cover2 = movieDetailBean.getCover();
            if (cover2 != null && (thumbnail = cover2.getThumbnail()) != null) {
                str = thumbnail;
            }
            bVarM94468g.m94473l(str).m94465d(shapeableImageView);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        String restrictLevel = movieDetailBean.getRestrictLevel();
        if (restrictLevel != null) {
            if (restrictLevel.length() > 0) {
                spannableStringBuilder2.append((CharSequence) " / ");
                spannableStringBuilder2.append((CharSequence) restrictLevel);
            }
        }
        String releaseDate2 = movieDetailBean.getReleaseDate();
        if (releaseDate2 != null) {
            if (releaseDate2.length() > 0) {
                spannableStringBuilder2.append((CharSequence) " / ");
                spannableStringBuilder2.append((CharSequence) releaseDate2);
            }
        }
        String duration2 = movieDetailBean.getDuration();
        if (duration2 != null) {
            if (duration2.length() > 0) {
                if ((spannableStringBuilder2.length() > 0 ? 1 : 0) != 0) {
                    spannableStringBuilder2.append((CharSequence) " / ");
                }
                spannableStringBuilder2.append((CharSequence) duration2);
            } else {
                Integer durationSeconds3 = movieDetailBean.getDurationSeconds();
                if ((durationSeconds3 != null ? durationSeconds3.intValue() : 0) > 0) {
                    spannableStringBuilder2.append((CharSequence) " / ");
                    Integer durationSeconds4 = movieDetailBean.getDurationSeconds();
                    spannableStringBuilder2.append((CharSequence) m86048d0(durationSeconds4 != null ? durationSeconds4.intValue() : 0));
                }
            }
        }
        C25754g mViewBinding10 = getMViewBinding();
        if (mViewBinding10 != null && (appCompatTextView3 = mViewBinding10.f78551o) != null) {
            appCompatTextView3.setText(spannableStringBuilder2);
        }
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(movieDetailBean.getCountryName())) {
            spannableStringBuilder3.append((CharSequence) movieDetailBean.getCountryName());
        }
        if (!TextUtils.isEmpty(movieDetailBean.getGenre())) {
            if (spannableStringBuilder3.length() > 2) {
                spannableStringBuilder3.append((CharSequence) " / ");
            }
            spannableStringBuilder3.append((CharSequence) movieDetailBean.getGenre());
        }
        C25754g mViewBinding11 = getMViewBinding();
        if (mViewBinding11 != null && (appCompatTextView2 = mViewBinding11.f78546j) != null) {
            appCompatTextView2.setText(spannableStringBuilder3);
        }
        C25754g mViewBinding12 = getMViewBinding();
        if (mViewBinding12 == null || (appCompatTextView = mViewBinding12.f78548l) == null) {
            return;
        }
        appCompatTextView.setText(movieDetailBean.getImdbRate());
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public C25754g getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C25754g c25754gM101287c = C25754g.m101287c(inflater);
        Intrinsics.m97801g(c25754gM101287c, "inflate(...)");
        return c25754gM101287c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initData(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
        super.initData(view, savedInstanceState);
        Bundle arguments = getArguments();
        this.ops = arguments != null ? arguments.getString("ops") : null;
        Bundle arguments2 = getArguments();
        this.mSubjectId = arguments2 != null ? arguments2.getString("id") : null;
        m86049e0().m70910F().m14851j(this, new C20908a(new Function1() { // from class: com.transsion.videodetail.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubjectDetailInfoFragment.m86050g0(this.f65781a, (Pair) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        ShapeableImageView shapeableImageView;
        Intrinsics.m97802h(view, "view");
        C25754g mViewBinding = getMViewBinding();
        if (mViewBinding == null || (shapeableImageView = mViewBinding.f78540d) == null) {
            return;
        }
        shapeableImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.videodetail.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SubjectDetailInfoFragment.m86051h0(this.f65779a, view2);
            }
        });
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
    }
}
