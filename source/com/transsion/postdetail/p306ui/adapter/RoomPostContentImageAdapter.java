package com.transsion.postdetail.p306ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.noober.background.drawable.DrawableCreator;
import com.p282tn.lib.widget.R$color;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.ninegridview.preview.GifImagePreviewActivity;
import com.transsion.postdetail.R$dimen;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.R$layout;
import com.transsion.postdetail.helper.C16768a;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p344db.C22966n;
import p462hj.C23860f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\"R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\"R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\"¨\u0006/"}, m97100d2 = {"Lcom/transsion/postdetail/ui/adapter/RoomPostContentImageAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/bean/Image;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "spanCount", "", "isTablet", "", "pageName", "pageFrom", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", WebConstants.FIELD_ITEM, "<init>", "(IZLjava/lang/String;Ljava/lang/String;Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, RequestParameters.POSITION, "", "imageList", "", "G1", "(Landroid/view/View;ILjava/util/List;)V", "Landroid/widget/ImageView;", "ivCover", "H1", "(Landroid/widget/ImageView;Lcom/transsion/moviedetailapi/bean/Image;)V", "holder", "Lcom/google/android/material/imageview/ShapeableImageView;", "I1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/google/android/material/imageview/ShapeableImageView;)V", "D1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/moviedetailapi/bean/Image;)V", "F", "I", "G", "Z", "H", "Ljava/lang/String;", "J", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "K", "rootWidth", "L", "dp78", "M", "dp280", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class RoomPostContentImageAdapter extends BaseQuickAdapter {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final int spanCount;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final boolean isTablet;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final String pageName;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String pageFrom;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final PostSubjectItem item;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final int rootWidth;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final int dp78;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final int dp280;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomPostContentImageAdapter(int i11, boolean z11, String str, String str2, PostSubjectItem item) {
        super(R$layout.item_room_post_content_image, null, 2, null);
        Intrinsics.m97802h(item, "item");
        this.spanCount = i11;
        this.isTablet = z11;
        this.pageName = str;
        this.pageFrom = str2;
        this.item = item;
        this.rootWidth = z11 ? AbstractC23384a.m92908b(300) : AbstractC5806y.m27489e() - AbstractC23384a.m92908b(72);
        this.dp78 = AbstractC23384a.m92908b(78);
        this.dp280 = AbstractC23384a.m92908b(280);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public static final void m73895E1(RoomPostContentImageAdapter roomPostContentImageAdapter, BaseViewHolder baseViewHolder, Image image, ShapeableImageView shapeableImageView) {
        if (roomPostContentImageAdapter.item.getBuiltIn()) {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new RoomPostContentImageAdapter$convert$1$1(image, shapeableImageView, null), 3, null);
            return;
        }
        C23860f.a aVar = C23860f.f72909a;
        Context context = baseViewHolder.itemView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        C23860f.b bVarM94457m = aVar.m94457m(context);
        String url = image.getUrl();
        if (url == null) {
            url = "";
        }
        C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
        String thumbnail = image.getThumbnail();
        bVarM94468g.m94473l(thumbnail != null ? thumbnail : "").m94465d(shapeableImageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public static final void m73896F1(RoomPostContentImageAdapter roomPostContentImageAdapter, BaseViewHolder baseViewHolder, View view) {
        Intrinsics.m97799e(view);
        roomPostContentImageAdapter.m73897G1(view, baseViewHolder.getLayoutPosition(), roomPostContentImageAdapter.getData());
    }

    /* JADX INFO: renamed from: G1 */
    private final void m73897G1(View view, int position, List<Image> imageList) {
        String str = this.pageName;
        if (str != null) {
            C16768a.f56378a.m73078o(this.item, str, this.pageFrom);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Intent intent = new Intent(view.getContext(), (Class<?>) GifImagePreviewActivity.class);
            Intrinsics.m97800f(imageList, "null cannot be cast to non-null type java.io.Serializable");
            intent.putExtra(GifImagePreviewActivity.IMAGE_LIST, (Serializable) imageList);
            intent.putExtra("CURRENT_ITEM", position);
            intent.putExtra(GifImagePreviewActivity.IS_BUILTIN, this.item.getBuiltIn());
            intent.putExtra(GifImagePreviewActivity.POST_ID, this.item.getPostId());
            view.getContext().startActivity(intent);
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    /* JADX INFO: renamed from: H1 */
    private final void m73898H1(ImageView ivCover, Image item) {
        ViewGroup.LayoutParams layoutParams = ivCover.getLayoutParams();
        Intrinsics.m97800f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i11 = this.spanCount;
        if (i11 == 1) {
            Integer height = item.getHeight();
            int iIntValue = height != null ? height.intValue() : 0;
            Integer width = item.getWidth();
            int iIntValue2 = width != null ? width.intValue() : 0;
            if (iIntValue <= 0 || iIntValue2 <= 0) {
                marginLayoutParams.width = -1;
                marginLayoutParams.height = this.rootWidth;
            } else {
                int iM92908b = iIntValue2 / iIntValue < 1 ? this.rootWidth - AbstractC23384a.m92908b(38) : this.rootWidth;
                marginLayoutParams.width = iM92908b;
                int i12 = (iIntValue * iM92908b) / iIntValue2;
                if (i12 > (iM92908b * 36) / 26) {
                    i12 = (iM92908b * 36) / 26;
                }
                marginLayoutParams.height = i12;
            }
        } else if (i11 != 2) {
            marginLayoutParams.width = -1;
            marginLayoutParams.height = (this.rootWidth - AbstractC23384a.m92908b(6)) / 3;
        } else {
            marginLayoutParams.width = -1;
            marginLayoutParams.height = (this.rootWidth - AbstractC23384a.m92908b(6)) / 2;
        }
        ivCover.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: I1 */
    private final void m73899I1(BaseViewHolder holder, ShapeableImageView ivCover) {
        float f11;
        float f12;
        float f13;
        float f14;
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        float dimension = holder.itemView.getResources().getDimension(R$dimen.corner_radius);
        C22966n.b bVarM91391a = C22966n.m91391a();
        Intrinsics.m97801g(bVarM91391a, "builder(...)");
        int size = getData().size();
        boolean z11 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        DrawableCreator.Builder builder = new DrawableCreator.Builder();
        int i11 = this.spanCount;
        if (i11 != 1) {
            float f15 = 0.0f;
            if (i11 != 2) {
                float fM92908b = AbstractC23384a.m92908b(4);
                if (bindingAdapterPosition != 0) {
                    f11 = 0.0f;
                    f12 = 0.0f;
                } else if (z11) {
                    bVarM91391a.m91438J(0, dimension);
                    f12 = fM92908b;
                    f11 = 0.0f;
                } else {
                    bVarM91391a.m91433E(0, dimension);
                    f11 = fM92908b;
                    f12 = 0.0f;
                }
                if (bindingAdapterPosition == 2) {
                    if (z11) {
                        bVarM91391a.m91433E(0, dimension);
                        f11 = fM92908b;
                    } else {
                        bVarM91391a.m91438J(0, dimension);
                        f12 = fM92908b;
                    }
                }
                int i12 = size - 1;
                if (bindingAdapterPosition != i12 || size % 3 != 0) {
                    f13 = 0.0f;
                } else if (z11) {
                    bVarM91391a.m91449t(0, dimension);
                    f13 = 0.0f;
                    f15 = fM92908b;
                } else {
                    bVarM91391a.m91454y(0, dimension);
                    f13 = fM92908b;
                }
                int i13 = size % 3;
                if ((i13 == 1 && bindingAdapterPosition == i12) || ((i13 == 2 && bindingAdapterPosition == size - 2) || (i13 == 0 && bindingAdapterPosition == size - 3))) {
                    if (z11) {
                        bVarM91391a.m91454y(0, dimension);
                        f14 = fM92908b;
                        fM92908b = f15;
                    } else {
                        bVarM91391a.m91449t(0, dimension);
                    }
                    builder.setCornersRadius(fM92908b, f14, f11, f12);
                } else {
                    fM92908b = f15;
                }
                f14 = f13;
                builder.setCornersRadius(fM92908b, f14, f11, f12);
            } else {
                if (bindingAdapterPosition == 0) {
                    if (z11) {
                        bVarM91391a.m91438J(0, dimension);
                        builder.setCornersRadius(0.0f, 0.0f, 0.0f, AbstractC23384a.m92908b(4));
                    } else {
                        bVarM91391a.m91433E(0, dimension);
                        builder.setCornersRadius(0.0f, 0.0f, AbstractC23384a.m92908b(4), 0.0f);
                    }
                }
                if (bindingAdapterPosition == 1) {
                    if (z11) {
                        bVarM91391a.m91433E(0, dimension);
                        builder.setCornersRadius(0.0f, 0.0f, AbstractC23384a.m92908b(4), 0.0f);
                    } else {
                        bVarM91391a.m91438J(0, dimension);
                        builder.setCornersRadius(0.0f, 0.0f, 0.0f, AbstractC23384a.m92908b(4));
                    }
                }
                if (bindingAdapterPosition == size - 1 && size % 2 == 0) {
                    if (z11) {
                        bVarM91391a.m91449t(0, dimension);
                        builder.setCornersRadius(AbstractC23384a.m92908b(4), 0.0f, 0.0f, 0.0f);
                    } else {
                        bVarM91391a.m91454y(0, dimension);
                        builder.setCornersRadius(0.0f, AbstractC23384a.m92908b(4), 0.0f, 0.0f);
                    }
                }
                if (bindingAdapterPosition == size - 2 && size >= 2 && size % 2 == 0) {
                    if (z11) {
                        bVarM91391a.m91454y(0, dimension);
                        builder.setCornersRadius(0.0f, AbstractC23384a.m92908b(4), 0.0f, 0.0f);
                    } else {
                        bVarM91391a.m91449t(0, dimension);
                        builder.setCornersRadius(AbstractC23384a.m92908b(4), 0.0f, 0.0f, 0.0f);
                    }
                }
                Unit unit = Unit.f75682a;
            }
        } else {
            bVarM91391a.m91446q(0, dimension);
            builder.setCornersRadius(AbstractC23384a.m92908b(4));
        }
        holder.getView(R$id.v_stroke).setBackground(builder.setStrokeColor(Utils.m27275a().getResources().getColor(R$color.white_10)).setStrokeWidth(AbstractC23384a.m92908b(1)).build());
        ivCover.setShapeAppearanceModel(bVarM91391a.m91443m());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(final BaseViewHolder holder, final Image item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        final ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getView(R$id.iv_cover);
        m73898H1(shapeableImageView, item);
        m73899I1(holder, shapeableImageView);
        holder.itemView.post(new Runnable() { // from class: com.transsion.postdetail.ui.adapter.j
            @Override // java.lang.Runnable
            public final void run() {
                RoomPostContentImageAdapter.m73895E1(this.f57001a, holder, item, shapeableImageView);
            }
        });
        shapeableImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.ui.adapter.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RoomPostContentImageAdapter.m73896F1(this.f57005a, holder, view);
            }
        });
    }
}
