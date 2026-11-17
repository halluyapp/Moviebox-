package com.transsion.moviedetail.fragment;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.bumptech.glide.Glide;
import com.mbridge.msdk.MBridgeConstans;
import com.transsion.base.image.blurhash.C14291e;
import com.transsion.baseui.fragment.BaseFragment;
import com.transsion.core.utils.C14752e;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.ninegridview.ImageInfo;
import com.transsion.ninegridview.preview.ImagePreviewActivity;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gn.C23607o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p462hj.C23860f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, m97100d2 = {"Lcom/transsion/moviedetail/fragment/StillsFragment;", "Lcom/transsion/baseui/fragment/BaseFragment;", "Lgn/o;", "<init>", "()V", "Lcom/transsion/moviedetailapi/bean/Cover;", "cover", "", "d0", "(Lcom/transsion/moviedetailapi/bean/Cover;)V", "Landroid/view/LayoutInflater;", "inflater", "c0", "(Landroid/view/LayoutInflater;)Lgn/o;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/view/View;Landroid/os/Bundle;)V", "lazyLoadData", "a", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class StillsFragment extends BaseFragment<C23607o> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.transsion.moviedetail.fragment.StillsFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final StillsFragment m70484a(Cover cover) {
            Intrinsics.m97802h(cover, "cover");
            StillsFragment stillsFragment = new StillsFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("cover", cover);
            stillsFragment.setArguments(bundle);
            return stillsFragment;
        }
    }

    /* JADX INFO: renamed from: d0 */
    private final void m70480d0(final Cover cover) {
        final C23607o mViewBinding = getMViewBinding();
        if (mViewBinding != null) {
            int iM66409f = C14752e.m66409f();
            C23860f.a aVar = C23860f.f72909a;
            String url = cover.getUrl();
            if (url == null) {
                url = "";
            }
            String strM94447e = C23860f.a.m94447e(aVar, url, iM66409f, false, false, 12, null);
            String thumbnail = cover.getThumbnail();
            C14291e.m64747d(C14291e.f50565a, thumbnail == null ? "" : thumbnail, 0, 0, new Function1() { // from class: com.transsion.moviedetail.fragment.j1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return StillsFragment.m70481e0(mViewBinding, (BitmapDrawable) obj);
                }
            }, 6, null);
            Glide.with(requireContext()).load2(strM94447e).into(mViewBinding.f72014c);
            mViewBinding.f72014c.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.fragment.k1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StillsFragment.m70482f0(cover, this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final Unit m70481e0(C23607o c23607o, BitmapDrawable it) {
        Intrinsics.m97802h(it, "it");
        c23607o.f72013b.setImageDrawable(it);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final void m70482f0(Cover cover, StillsFragment stillsFragment, View view) {
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.bigImageUrl = cover.getUrl();
        imageInfo.thumbnailUrl = cover.getThumbnail();
        Integer height = cover.getHeight();
        imageInfo.imageViewHeight = height != null ? height.intValue() : 0.0f;
        Integer width = cover.getWidth();
        imageInfo.imageViewWidth = width != null ? width.intValue() : 0.0f;
        List listQ = CollectionsKt.m97511q(imageInfo);
        ImagePreviewActivity.Companion companion = ImagePreviewActivity.INSTANCE;
        Context contextRequireContext = stillsFragment.requireContext();
        Intrinsics.m97801g(contextRequireContext, "requireContext(...)");
        companion.m71396a(contextRequireContext, 0, listQ);
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public C23607o getViewBinding(LayoutInflater inflater) {
        Intrinsics.m97802h(inflater, "inflater");
        C23607o c23607oM93402c = C23607o.m93402c(inflater);
        Intrinsics.m97801g(c23607oM93402c, "inflate(...)");
        return c23607oM93402c;
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void initView(View view, Bundle savedInstanceState) {
        Intrinsics.m97802h(view, "view");
    }

    @Override // com.transsion.baseui.fragment.BaseFragment
    public void lazyLoadData() {
        Bundle arguments = getArguments();
        Cover cover = (Cover) (arguments != null ? arguments.getSerializable("cover") : null);
        if (cover != null) {
            m70480d0(cover);
        }
    }
}
