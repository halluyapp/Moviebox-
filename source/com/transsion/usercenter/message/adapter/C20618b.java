package com.transsion.usercenter.message.adapter;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.AbstractC2397b;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.google.android.material.imageview.ShapeableImageView;
import com.p282tn.lib.widget.R$color;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.usercenter.R$id;
import com.transsion.usercenter.R$layout;
import com.transsion.usercenter.R$string;
import com.transsion.usercenter.message.UserMessageType;
import com.transsion.usercenter.message.bean.MessageEntity;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p462hj.C23860f;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import tw.C27860b;

/* JADX INFO: renamed from: com.transsion.usercenter.message.adapter.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\r¨\u0006\u0013"}, m97100d2 = {"Lcom/transsion/usercenter/message/adapter/b;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/usercenter/message/bean/MessageEntity;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "", "layoutResId", "<init>", "(I)V", "holder", WebConstants.FIELD_ITEM, "", "B1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/usercenter/message/bean/MessageEntity;)V", "", NativeComponentConstants.KEY_COMPONENT_TYPE, "D1", "(Ljava/lang/String;)Ljava/lang/String;", "C1", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C20618b extends BaseQuickAdapter implements InterfaceC27944i {
    public C20618b() {
        this(0, 1, null);
    }

    public C20618b(int i11) {
        super(i11, null, 2, null);
    }

    public /* synthetic */ C20618b(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? R$layout.item_room_message : i11);
    }

    /* JADX INFO: renamed from: B1 */
    private final void m85112B1(BaseViewHolder holder, MessageEntity item) {
        String url;
        View view = holder.getView(R$id.iv_avatar);
        Intrinsics.m97800f(view, "null cannot be cast to non-null type com.google.android.material.imageview.ShapeableImageView");
        holder.setText(R$id.tv_avatar, item.getNickname());
        int i11 = R$id.tv_date;
        C27860b.a aVar = C27860b.f85654a;
        holder.setText(i11, aVar.m108393b(Long.parseLong(item.getCreatedAt())));
        C23860f.a aVar2 = C23860f.f72909a;
        aVar2.m94457m(getContext()).m94468g(item.getAvator()).m94465d((ShapeableImageView) view);
        AppCompatTextView appCompatTextView = (AppCompatTextView) holder.getView(R$id.tv_content);
        String content = item.getContent();
        if (content == null || content.length() == 0) {
            appCompatTextView.setVisibility(8);
        } else {
            appCompatTextView.setText(item.getContent());
            appCompatTextView.setVisibility(0);
        }
        ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getView(R$id.comment_cover);
        List<Image> commentImages = item.getCommentImages();
        String str = "";
        if (commentImages == null || !(!commentImages.isEmpty())) {
            shapeableImageView.setVisibility(8);
        } else {
            shapeableImageView.setVisibility(0);
            Context context = shapeableImageView.getContext();
            Intrinsics.m97801g(context, "getContext(...)");
            C23860f.b bVarM94457m = aVar2.m94457m(context);
            List<Image> commentImages2 = item.getCommentImages();
            Intrinsics.m97799e(commentImages2);
            String url2 = commentImages2.get(0).getUrl();
            if (url2 == null) {
                url2 = "";
            }
            bVarM94457m.m94468g(url2).m94465d(shapeableImageView);
        }
        holder.setText(R$id.tv_date, m85113D1(item.getType()) + " " + aVar.m108393b(Long.parseLong(item.getCreatedAt())));
        ShapeableImageView shapeableImageView2 = (ShapeableImageView) holder.getView(R$id.iv_comment);
        Cover image = item.getImage();
        String url3 = image != null ? image.getUrl() : null;
        if (url3 == null || url3.length() == 0) {
            shapeableImageView2.setVisibility(8);
        } else {
            C23860f.b bVarM94457m2 = aVar2.m94457m(getContext());
            Cover image2 = item.getImage();
            if (image2 != null && (url = image2.getUrl()) != null) {
                str = url;
            }
            bVarM94457m2.m94468g(str).m94465d(shapeableImageView2);
            shapeableImageView2.setVisibility(0);
        }
        holder.setVisible(R$id.view_red_blank, Intrinsics.m97797c(item.getStatus(), "UNREAD"));
        if (Intrinsics.m97797c(item.getStatus(), "UNREAD")) {
            holder.itemView.setBackgroundColor(AbstractC2397b.getColor(getContext(), R$color.white_10));
        } else {
            holder.itemView.setBackgroundColor(0);
        }
    }

    /* JADX INFO: renamed from: D1 */
    private final String m85113D1(String type) {
        if (Intrinsics.m97797c(type, UserMessageType.LIKE.getValue())) {
            String string = getContext().getString(R$string.message_like_type);
            Intrinsics.m97801g(string, "getString(...)");
            return string;
        }
        if (Intrinsics.m97797c(type, UserMessageType.LIKE_COMMENT.getValue())) {
            String string2 = getContext().getString(R$string.message_like_comment_type);
            Intrinsics.m97801g(string2, "getString(...)");
            return string2;
        }
        if (Intrinsics.m97797c(type, UserMessageType.COMMENT.getValue())) {
            String string3 = getContext().getString(R$string.message_comment_type);
            Intrinsics.m97801g(string3, "getString(...)");
            return string3;
        }
        if (!Intrinsics.m97797c(type, UserMessageType.REPLY_COMMENT.getValue())) {
            return "";
        }
        String string4 = getContext().getString(R$string.message_reply_comment_type);
        Intrinsics.m97801g(string4, "getString(...)");
        return string4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, MessageEntity item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        m85112B1(holder, item);
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
