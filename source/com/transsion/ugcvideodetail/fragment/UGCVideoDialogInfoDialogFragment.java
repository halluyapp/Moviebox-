package com.transsion.ugcvideodetail.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.AbstractC2397b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.C5118o;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.noober.background.drawable.DrawableCreator;
import com.noober.background.view.BLTextView;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.R$string;
import com.transsion.play.detail.fragment.BaseBottomDialogFragment;
import com.transsion.ugcvideodetail.R$drawable;
import com.transsion.ugcvideodetail.adapter.C20151i;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoCreator;
import com.transsion.ugcvideodetail.api.bean.UGCVideoHashTag;
import com.transsion.ugcvideodetail.hepler.C20317h;
import com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel;
import com.transsion.wrapperad.R$color;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import mg.C25826c;
import p462hj.C23860f;
import p765s6.InterfaceC27566d;
import p885wv.C28450j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0004R\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/fragment/UGCVideoDialogInfoDialogFragment;", "Lcom/transsion/play/detail/fragment/BaseBottomDialogFragment;", "Lwv/j;", "<init>", "()V", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "video", "", "F0", "(Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;)V", "G0", "D0", "", "isSubscribed", "I0", "(Z)V", "E0", "Landroid/view/LayoutInflater;", "inflater", "w0", "(Landroid/view/LayoutInflater;)Lwv/j;", "", "getPageStateLayoutTitle", "()Ljava/lang/String;", "initViewData", "initViewModel", "initListener", "retryLoadData", "Lcom/transsion/ugcvideodetail/viewmodel/UGCVideoDetailViewModel;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkotlin/Lazy;", "v0", "()Lcom/transsion/ugcvideodetail/viewmodel/UGCVideoDetailViewModel;", "mViewModel", "c", "a", "UGCVideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class UGCVideoDialogInfoDialogFragment extends BaseBottomDialogFragment<C28450j> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy mViewModel = FragmentViewModelLazyKt.m14626a(this, Reflection.m97823b(UGCVideoDetailViewModel.class), new Function0<C3231x0>() { // from class: com.transsion.ugcvideodetail.fragment.UGCVideoDialogInfoDialogFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C3231x0 invoke() {
            C3231x0 viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<C3227v0.c>() { // from class: com.transsion.ugcvideodetail.fragment.UGCVideoDialogInfoDialogFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCVideoDialogInfoDialogFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final UGCVideoDialogInfoDialogFragment m83952a() {
            return new UGCVideoDialogInfoDialogFragment();
        }
    }

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.fragment.UGCVideoDialogInfoDialogFragment$b */
    static final class C20217b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f64220a;

        C20217b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f64220a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f64220a;
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
            this.f64220a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final void m83931A0(UGCVideoDialogInfoDialogFragment uGCVideoDialogInfoDialogFragment, View view) {
        uGCVideoDialogInfoDialogFragment.m83935E0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final Unit m83932B0(UGCVideoDialogInfoDialogFragment uGCVideoDialogInfoDialogFragment, UGCVideo uGCVideo) {
        if (uGCVideo == null) {
            return Unit.f75682a;
        }
        uGCVideoDialogInfoDialogFragment.m83936F0(uGCVideo);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final Unit m83933C0(UGCVideoDialogInfoDialogFragment uGCVideoDialogInfoDialogFragment, Pair pair) {
        UGCVideoCreator creator;
        Boolean hasSubscribe;
        if (pair != null) {
            uGCVideoDialogInfoDialogFragment.m83939I0(((Boolean) pair.getSecond()).booleanValue());
        } else {
            UGCVideo uGCVideo = (UGCVideo) uGCVideoDialogInfoDialogFragment.m83947v0().m84261G().m14847f();
            if (uGCVideo != null && (creator = uGCVideo.getCreator()) != null && (hasSubscribe = creator.getHasSubscribe()) != null) {
                uGCVideoDialogInfoDialogFragment.m83939I0(hasSubscribe.booleanValue());
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: D0 */
    private final void m83934D0() {
        UGCVideoCreator creator;
        String uid;
        UGCVideo uGCVideo = (UGCVideo) m83947v0().m84261G().m14847f();
        if (uGCVideo == null || (creator = uGCVideo.getCreator()) == null || (uid = creator.getUid()) == null) {
            return;
        }
        boolean z11 = !Intrinsics.m97797c(creator.getHasSubscribe(), Boolean.TRUE);
        m83939I0(z11);
        m83947v0().m84290n0(uid, z11);
    }

    /* JADX INFO: renamed from: E0 */
    private final void m83935E0() {
        UGCVideoCreator creator;
        String uid;
        Context context = getContext();
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        UGCVideo uGCVideo = (UGCVideo) m83947v0().m84261G().m14847f();
        if (uGCVideo == null || fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed() || (creator = uGCVideo.getCreator()) == null || (uid = creator.getUid()) == null) {
            return;
        }
        Navigator.m61845x(TheRouter.m61773c("/profile/user_profile").m61857K("userId", uid), requireContext(), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F0 */
    private final void m83936F0(UGCVideo video) {
        AppCompatTextView appCompatTextView;
        RecyclerView recyclerView;
        BLTextView bLTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        ShapeableImageView shapeableImageView;
        AppCompatTextView appCompatTextView5;
        C28450j c28450j = (C28450j) getMViewBinding();
        if (c28450j != null && (appCompatTextView5 = c28450j.f87346i) != null) {
            appCompatTextView5.setText(video.getTitle());
        }
        UGCVideoCreator creator = video.getCreator();
        if (creator != null) {
            C28450j c28450j2 = (C28450j) getMViewBinding();
            if (c28450j2 != null && (shapeableImageView = c28450j2.f87340c) != null) {
                C23860f.a aVar = C23860f.f72909a;
                Context context = shapeableImageView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94470i = aVar.m94457m(context).m94470i(R$color.white_20);
                String avatar = creator.getAvatar();
                if (avatar == null) {
                    avatar = "";
                }
                bVarM94470i.m94468g(avatar).m94465d(shapeableImageView);
            }
            C28450j c28450j3 = (C28450j) getMViewBinding();
            if (c28450j3 != null && (appCompatTextView4 = c28450j3.f87347j) != null) {
                appCompatTextView4.setText(creator.getNickname());
            }
            m83939I0(Intrinsics.m97797c(creator.getHasSubscribe(), Boolean.TRUE));
        }
        String description = video.getDescription();
        if (description == null || description.length() == 0) {
            C28450j c28450j4 = (C28450j) getMViewBinding();
            if (c28450j4 != null && (appCompatTextView = c28450j4.f87342e) != null) {
                appCompatTextView.setVisibility(8);
            }
        } else {
            C28450j c28450j5 = (C28450j) getMViewBinding();
            if (c28450j5 != null && (appCompatTextView3 = c28450j5.f87342e) != null) {
                appCompatTextView3.setText(video.getDescription());
            }
            C28450j c28450j6 = (C28450j) getMViewBinding();
            if (c28450j6 != null && (appCompatTextView2 = c28450j6.f87342e) != null) {
                appCompatTextView2.setVisibility(0);
            }
        }
        m83937G0(video);
        if (C5118o.f17608a.m23948i()) {
            C28450j c28450j7 = (C28450j) getMViewBinding();
            if (c28450j7 != null && (bLTextView = c28450j7.f87344g) != null) {
                bLTextView.setVisibility(8);
            }
            C28450j c28450j8 = (C28450j) getMViewBinding();
            if (c28450j8 == null || (recyclerView = c28450j8.f87341d) == null) {
                return;
            }
            recyclerView.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    private final void m83937G0(final UGCVideo video) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        List<UGCVideoHashTag> filteredHashTags = video.getFilteredHashTags();
        if (filteredHashTags == null || filteredHashTags.isEmpty()) {
            C28450j c28450j = (C28450j) getMViewBinding();
            if (c28450j == null || (recyclerView = c28450j.f87341d) == null) {
                return;
            }
            recyclerView.setVisibility(8);
            return;
        }
        C28450j c28450j2 = (C28450j) getMViewBinding();
        if (c28450j2 != null && (recyclerView3 = c28450j2.f87341d) != null) {
            recyclerView3.setVisibility(0);
        }
        List<UGCVideoHashTag> filteredHashTags2 = video.getFilteredHashTags();
        Intrinsics.m97799e(filteredHashTags2);
        C20151i c20151i = new C20151i(filteredHashTags2, false, 2, null);
        C28450j c28450j3 = (C28450j) getMViewBinding();
        if (c28450j3 != null && (recyclerView2 = c28450j3.f87341d) != null) {
            recyclerView2.setAdapter(c20151i);
        }
        c20151i.m36227w1(new InterfaceC27566d() { // from class: com.transsion.ugcvideodetail.fragment.f1
            @Override // p765s6.InterfaceC27566d
            /* JADX INFO: renamed from: a */
            public final void mo63793a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                UGCVideoDialogInfoDialogFragment.m83938H0(video, this, baseQuickAdapter, view, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final void m83938H0(UGCVideo uGCVideo, UGCVideoDialogInfoDialogFragment uGCVideoDialogInfoDialogFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.m97802h(baseQuickAdapter, "<unused var>");
        Intrinsics.m97802h(view, "<unused var>");
        List<UGCVideoHashTag> filteredHashTags = uGCVideo.getFilteredHashTags();
        UGCVideoHashTag uGCVideoHashTag = filteredHashTags != null ? (UGCVideoHashTag) CollectionsKt.m97362l0(filteredHashTags, i11) : null;
        Fragment parentFragment = uGCVideoDialogInfoDialogFragment.getParentFragment();
        UGCVideoDetailBaseFragment uGCVideoDetailBaseFragment = parentFragment instanceof UGCVideoDetailBaseFragment ? (UGCVideoDetailBaseFragment) parentFragment : null;
        C20317h.f64417a.m84102a("/ugc_video/detail", "hash_tag", uGCVideo, (384 & 8) != 0 ? null : uGCVideoHashTag != null ? uGCVideoHashTag.getTag() : null, (384 & 16) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getTrackId() : null, (384 & 32) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousTrackId() : null, (384 & 64) != 0 ? null : uGCVideoDetailBaseFragment != null ? uGCVideoDetailBaseFragment.getPreviousPageVideoId() : null, (384 & 128) != 0 ? null : null, (384 & 256) != 0 ? null : null);
        List<UGCVideoHashTag> filteredHashTags2 = uGCVideo.getFilteredHashTags();
        if (filteredHashTags2 != null) {
            new ArrayList(filteredHashTags2);
        } else {
            new ArrayList();
        }
        Navigator.m61845x(TheRouter.m61773c("/home/hashtag").m61855I("titleHashTag", uGCVideoHashTag).m61857K("UGCVideoId", uGCVideo.getUgcVideoId()), uGCVideoDialogInfoDialogFragment.requireContext(), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I0 */
    private final void m83939I0(boolean isSubscribed) {
        BLTextView bLTextView;
        C28450j c28450j = (C28450j) getMViewBinding();
        if (c28450j == null || (bLTextView = c28450j.f87344g) == null) {
            return;
        }
        if (isSubscribed) {
            bLTextView.setBackground(new DrawableCreator.Builder().setSolidColor(AbstractC2397b.getColor(bLTextView.getContext(), com.p282tn.lib.widget.R$color.white_10)).setCornersRadius(AbstractC5776a0.m27313a(4.0f)).build());
            bLTextView.setTextColor(AbstractC2397b.getColor(bLTextView.getContext(), com.p282tn.lib.widget.R$color.white));
            bLTextView.setCompoundDrawablesWithIntrinsicBounds(R$drawable.ugc_video_detail_ic_subscribed_hook, 0, 0, 0);
            bLTextView.setText(bLTextView.getContext().getString(R$string.str_Subscribed));
            return;
        }
        bLTextView.setBackground(new DrawableCreator.Builder().setSolidColor(AbstractC2397b.getColor(bLTextView.getContext(), com.p282tn.lib.widget.R$color.white)).setCornersRadius(AbstractC5776a0.m27313a(4.0f)).build());
        bLTextView.setTextColor(AbstractC2397b.getColor(bLTextView.getContext(), com.p282tn.lib.widget.R$color.gray_dark_00));
        bLTextView.setCompoundDrawablesWithIntrinsicBounds(R$drawable.ugc_video_detail_ic_subscribe_add, 0, 0, 0);
        bLTextView.setText(bLTextView.getContext().getString(R$string.str_Subscribe));
    }

    /* JADX INFO: renamed from: v0 */
    private final UGCVideoDetailViewModel m83947v0() {
        return (UGCVideoDetailViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m83948x0(UGCVideoDialogInfoDialogFragment uGCVideoDialogInfoDialogFragment, View view) {
        BaseBottomDialogFragment.m71695m0(uGCVideoDialogInfoDialogFragment, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m83949y0(UGCVideoDialogInfoDialogFragment uGCVideoDialogInfoDialogFragment, View view) {
        uGCVideoDialogInfoDialogFragment.m83934D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m83950z0(UGCVideoDialogInfoDialogFragment uGCVideoDialogInfoDialogFragment, View view) {
        uGCVideoDialogInfoDialogFragment.m83935E0();
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public String getPageStateLayoutTitle() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initListener() {
        AppCompatTextView appCompatTextView;
        ShapeableImageView shapeableImageView;
        BLTextView bLTextView;
        AppCompatImageView appCompatImageView;
        C28450j c28450j = (C28450j) getMViewBinding();
        if (c28450j != null && (appCompatImageView = c28450j.f87339b) != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.fragment.b1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UGCVideoDialogInfoDialogFragment.m83948x0(this.f64252a, view);
                }
            });
        }
        C28450j c28450j2 = (C28450j) getMViewBinding();
        if (c28450j2 != null && (bLTextView = c28450j2.f87344g) != null) {
            bLTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.fragment.c1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UGCVideoDialogInfoDialogFragment.m83949y0(this.f64255a, view);
                }
            });
        }
        C28450j c28450j3 = (C28450j) getMViewBinding();
        if (c28450j3 != null && (shapeableImageView = c28450j3.f87340c) != null) {
            shapeableImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.fragment.d1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UGCVideoDialogInfoDialogFragment.m83950z0(this.f64258a, view);
                }
            });
        }
        C28450j c28450j4 = (C28450j) getMViewBinding();
        if (c28450j4 == null || (appCompatTextView = c28450j4.f87347j) == null) {
            return;
        }
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.ugcvideodetail.fragment.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UGCVideoDialogInfoDialogFragment.m83931A0(this.f64262a, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewData() {
        RecyclerView recyclerView;
        C28450j c28450j = (C28450j) getMViewBinding();
        if (c28450j == null || (recyclerView = c28450j.f87341d) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new C25826c(AbstractC23384a.m92908b(12), AbstractC23384a.m92908b(8)));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void initViewModel() {
        m83947v0().m84261G().m14851j(this, new C20217b(new Function1() { // from class: com.transsion.ugcvideodetail.fragment.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UGCVideoDialogInfoDialogFragment.m83932B0(this.f64336a, (UGCVideo) obj);
            }
        }));
        m83947v0().m84272R().m14851j(this, new C20217b(new Function1() { // from class: com.transsion.ugcvideodetail.fragment.a1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UGCVideoDialogInfoDialogFragment.m83933C0(this.f64249a, (Pair) obj);
            }
        }));
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    public void retryLoadData() {
    }

    @Override // com.transsion.baseui.fragment.PageStatusFragment
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public C28450j getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C28450j c28450jM109911c = C28450j.m109911c(inflater);
        Intrinsics.m97801g(c28450jM109911c, "inflate(...)");
        return c28450jM109911c;
    }
}
