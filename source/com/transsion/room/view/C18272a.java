package com.transsion.room.view;

import android.content.Context;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.room.R$id;
import com.transsion.room.R$layout;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p462hj.C23860f;

/* JADX INFO: renamed from: com.transsion.room.view.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m97100d2 = {"Lcom/transsion/room/view/a;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/bean/Image;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "imageList", "<init>", "(Ljava/util/List;)V", "holder", WebConstants.FIELD_ITEM, "", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/moviedetailapi/bean/Image;)V", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C18272a extends BaseQuickAdapter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18272a(List<Image> imageList) {
        super(R$layout.adapter_image, imageList);
        Intrinsics.m97802h(imageList, "imageList");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, Image item) {
        int iM27489e;
        int iM27489e2;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getView(R$id.iv_image);
        Integer width = item.getWidth();
        int iIntValue = width != null ? width.intValue() : 0;
        Integer height = item.getHeight();
        int iIntValue2 = height != null ? height.intValue() : 0;
        if (iIntValue == 0 || iIntValue2 == 0) {
            return;
        }
        if (getData().size() == 1) {
            if (iIntValue > iIntValue2) {
                iM27489e2 = AbstractC5806y.m27489e() - AbstractC5776a0.m27313a(32.0f);
                iM27489e = (iIntValue2 * iM27489e2) / iIntValue;
            } else {
                int iM27313a = AbstractC5776a0.m27313a(288.0f);
                int i11 = (iIntValue * iM27313a) / iIntValue2;
                iM27489e = iM27313a;
                iM27489e2 = i11;
            }
            shapeableImageView.getLayoutParams().width = iM27489e2;
        } else {
            iM27489e = (AbstractC5806y.m27489e() - AbstractC5776a0.m27313a(48.0f)) / 3;
            iM27489e2 = iM27489e;
        }
        shapeableImageView.getLayoutParams().height = iM27489e;
        String url = item.getUrl();
        if (url != null) {
            C23860f.a aVar = C23860f.f72909a;
            Context context = shapeableImageView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            aVar.m94457m(context).m94468g(url).m94474m(iM27489e2).m94464c(iM27489e).m94465d(shapeableImageView);
        }
    }
}
