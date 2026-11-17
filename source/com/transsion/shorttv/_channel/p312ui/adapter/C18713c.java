package com.transsion.shorttv._channel.p312ui.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.p285ad.bidding.base.AbstractC13924r;
import com.transsion.p285ad.bidding.nativead.BiddingNativeManager;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import com.transsion.shorttv.R$color;
import com.transsion.shorttv.R$id;
import com.transsion.shorttv.R$layout;
import com.transsion.shorttv._channel.model.ShortTvLayoutStyle;
import com.transsion.shorttv._channel.model.ShortTvLayoutStyleEnum;
import com.transsion.shorttv._channel.model.ShortTvMovieItem;
import com.transsion.shorttv.base.widget.CornerTextView;
import com.transsion.shorttv.bean.Cover;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p330cs.C22776b;
import p462hj.C23860f;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import tr.C27845a;

/* JADX INFO: renamed from: com.transsion.shorttv._channel.ui.adapter.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B1\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m97100d2 = {"Lcom/transsion/shorttv/_channel/ui/adapter/c;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/shorttv/_channel/model/ShortTvMovieItem;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "", "dataList", "Lcs/b;", "listExposureHelper", "Lcom/transsion/shorttv/_channel/model/ShortTvLayoutStyle;", TtmlNode.TAG_STYLE, "", "rowCount", "<init>", "(Ljava/util/List;Lcs/b;Lcom/transsion/shorttv/_channel/model/ShortTvLayoutStyle;I)V", "holder", WebConstants.FIELD_ITEM, "", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/shorttv/_channel/model/ShortTvMovieItem;)V", "B0", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "E1", "F", "Lcs/b;", "G", "Lcom/transsion/shorttv/_channel/model/ShortTvLayoutStyle;", "D1", "()Lcom/transsion/shorttv/_channel/model/ShortTvLayoutStyle;", "F1", "(Lcom/transsion/shorttv/_channel/model/ShortTvLayoutStyle;)V", "H", "I", "C1", "()I", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C18713c extends BaseQuickAdapter implements InterfaceC27944i {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C22776b listExposureHelper;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private ShortTvLayoutStyle style;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final int rowCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18713c(List<ShortTvMovieItem> dataList, C22776b c22776b, ShortTvLayoutStyle shortTvLayoutStyle, int i11) {
        super(R$layout.short_tv_home_adapter_movie, dataList);
        Intrinsics.m97802h(dataList, "dataList");
        this.listExposureHelper = c22776b;
        this.style = shortTvLayoutStyle;
        this.rowCount = i11;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: B0 */
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        C22776b c22776b = this.listExposureHelper;
        if (c22776b != null) {
            RecyclerView.AbstractC4214m layoutManager = getRecyclerView().getLayoutManager();
            Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            C22776b.m90699h(c22776b, (GridLayoutManager) layoutManager, bindingAdapterPosition, true, false, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, ShortTvMovieItem item) {
        String url;
        String thumbnail;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        int iM27313a = AbstractC5776a0.m27313a(107.0f);
        int iM27313a2 = AbstractC5776a0.m27313a(149.0f);
        int iM27313a3 = AbstractC5776a0.m27313a(((this.rowCount - 1) * 8.0f) + 24.0f);
        int iM27489e = AbstractC5806y.m27489e();
        int i11 = this.rowCount;
        int i12 = (iM27489e - iM27313a3) / i11;
        int i13 = (int) (i12 * ((iM27313a2 * 1.0f) / iM27313a));
        int iM27313a4 = AbstractC5776a0.m27313a(((i11 - 1) * 8.0f) + 24.0f);
        AbstractC5776a0.m27313a(109.0f);
        AbstractC5776a0.m27313a(109.0f);
        int i14 = iM27489e - iM27313a4;
        int i15 = i14 / this.rowCount;
        int iM27313a5 = AbstractC5776a0.m27313a(164.0f);
        int iM27313a6 = AbstractC5776a0.m27313a(92.0f);
        int i16 = i14 / this.rowCount;
        int i17 = (int) (i16 * ((iM27313a6 * 1.0f) / iM27313a5));
        if (item.getNonAdDelegate() != null) {
            C27845a c27845a = C27845a.f85553a;
            Context context = getContext();
            BiddingNativeManager nonAdDelegate = item.getNonAdDelegate();
            AbstractC13924r abstractC13924rM108234a = c27845a.m108234a(context, nonAdDelegate != null ? nonAdDelegate.getMSceneId() : null);
            NativeWrapperAdView nativeWrapperAdView = (NativeWrapperAdView) holder.getViewOrNull(R$id.nativeView);
            if (nativeWrapperAdView != null) {
                BiddingNativeManager nonAdDelegate2 = item.getNonAdDelegate();
                BiddingNativeManager nonAdDelegate3 = item.getNonAdDelegate();
                nativeWrapperAdView.bindNativeView(nonAdDelegate2, abstractC13924rM108234a, nonAdDelegate3 != null ? nonAdDelegate3.m62848k0() : null);
            }
            ((FrameLayout) holder.getView(R$id.nativeView)).setVisibility(0);
            ((Group) holder.getView(R$id.group)).setVisibility(8);
            return;
        }
        ((FrameLayout) holder.getView(R$id.nativeView)).setVisibility(8);
        ((Group) holder.getView(R$id.group)).setVisibility(0);
        ImageView imageView = (ShapeableImageView) holder.getView(R$id.iv_cover);
        ShortTvLayoutStyle shortTvLayoutStyle = this.style;
        if (shortTvLayoutStyle != null) {
            String shape = shortTvLayoutStyle != null ? shortTvLayoutStyle.getShape() : null;
            if (Intrinsics.m97797c(shape, ShortTvLayoutStyleEnum.Horizontal.getValue())) {
                i13 = i17;
                i12 = i16;
            } else if (Intrinsics.m97797c(shape, ShortTvLayoutStyleEnum.Square.getValue())) {
                i13 = i15;
                i12 = i13;
            }
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C2308b c2308b = (ConstraintLayout.C2308b) layoutParams;
        ((ViewGroup.MarginLayoutParams) c2308b).height = i13;
        imageView.setLayoutParams(c2308b);
        C23860f.b bVarM94457m = C23860f.f72909a.m94457m(getContext());
        Cover cover = item.getCover();
        String str = "";
        if (cover == null || (url = cover.getUrl()) == null) {
            url = "";
        }
        C23860f.b bVarM94464c = bVarM94457m.m94468g(url).m94470i(R$color.short_tv_cl37).m94474m(i12).m94464c(i13);
        Cover cover2 = item.getCover();
        if (cover2 != null && (thumbnail = cover2.getThumbnail()) != null) {
            str = thumbnail;
        }
        bVarM94464c.m94473l(str).m94465d(imageView);
        holder.setText(R$id.tv_title, item.getTitle());
        holder.setText(R$id.tv_tabs, item.getGenre() + "•" + item.getCountryName());
        holder.setText(R$id.tv_score, item.getImdbRatingValue());
        ((CornerTextView) holder.getView(R$id.tv_tips)).setTextWithType(item.getCorner(), item.getSubjectType());
    }

    /* JADX INFO: renamed from: C1, reason: from getter */
    public final int getRowCount() {
        return this.rowCount;
    }

    /* JADX INFO: renamed from: D1, reason: from getter */
    public final ShortTvLayoutStyle getStyle() {
        return this.style;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.onViewRecycled(holder);
        ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getViewOrNull(R$id.iv_cover);
        if (shapeableImageView == null || shapeableImageView.getContext() == null) {
            return;
        }
        Context context = shapeableImageView.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || !activity.isDestroyed()) {
            Context context2 = shapeableImageView.getContext();
            Activity activity2 = context2 instanceof Activity ? (Activity) context2 : null;
            if (activity2 == null || !activity2.isFinishing()) {
                Glide.with(shapeableImageView.getContext()).clear(shapeableImageView);
            }
        }
    }

    /* JADX INFO: renamed from: F1 */
    public final void m78706F1(ShortTvLayoutStyle shortTvLayoutStyle) {
        this.style = shortTvLayoutStyle;
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
