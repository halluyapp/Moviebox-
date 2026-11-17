package com.transsion.postdetail.p306ui.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.imageview.ShapeableImageView;
import com.noober.background.view.BLView;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ng.AbstractC26006c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, m97100d2 = {"Lcom/transsion/postdetail/ui/view/PostDetailItemView;", "Lcom/transsion/postdetail/ui/view/PostBaseItemView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "res", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setHeaderData", "", WebConstants.FIELD_ITEM, "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "setSubjectAndRoomContent", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class PostDetailItemView extends PostBaseItemView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostDetailItemView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostDetailItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostDetailItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
    }

    @Override // com.transsion.postdetail.p306ui.view.PostBaseItemView
    public void setHeaderData(PostSubjectItem item) {
        Intrinsics.m97802h(item, "item");
        ShapeableImageView ivRoomCover = getViewBinding().f86644l;
        Intrinsics.m97801g(ivRoomCover, "ivRoomCover");
        AbstractC26006c.m102054g(ivRoomCover);
        ShapeableImageView ivUserAvatar = getViewBinding().f86645m;
        Intrinsics.m97801g(ivUserAvatar, "ivUserAvatar");
        AbstractC26006c.m102054g(ivUserAvatar);
        BLView bLView = getViewBinding().f86631I;
        if (bLView != null) {
            AbstractC26006c.m102054g(bLView);
        }
        ShapeableImageView ivUserAvatar2 = getViewBinding().f86646n;
        Intrinsics.m97801g(ivUserAvatar2, "ivUserAvatar2");
        AbstractC26006c.m102058k(ivUserAvatar2);
        BLView bLView2 = getViewBinding().f86632J;
        if (bLView2 != null) {
            AbstractC26006c.m102058k(bLView2);
        }
        PostBaseItemView.setHeaderPostData$default(this, item, false, 2, null);
    }

    @Override // com.transsion.postdetail.p306ui.view.PostBaseItemView
    public void setSubjectAndRoomContent(PostSubjectItem item) {
        Intrinsics.m97802h(item, "item");
        setBottomSubjectAndRoomVisibility(item.getSubject() != null, item.getGroup() != null);
        if (item.getSubject() != null) {
            setBottomSubjectModuleData(item);
        }
        if (item.getGroup() != null) {
            Group group = item.getGroup();
            String name = group != null ? group.getName() : null;
            if (name == null || name.length() == 0) {
                return;
            }
            setBottomRoomModuleData(item);
        }
    }
}
