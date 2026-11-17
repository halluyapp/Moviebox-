package com.transsion.postdetail.comment;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.transsion.baseui.util.AbstractC14566l;
import com.transsion.baseui.widget.C14585i;
import com.transsion.moviedetailapi.bean.CommentBean;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.ninegridview.preview.GifImagePreviewActivity;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.R$string;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p462hj.C23860f;
import p697q6.InterfaceC27022a;
import p743rh.C27287m;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\t2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0018\u0010*\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010!R\u0018\u0010.\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010!R\u0018\u00100\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010)R\u0018\u00102\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010)R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, m97100d2 = {"Lcom/transsion/postdetail/comment/CommentHolder;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lcom/transsion/postdetail/comment/h0;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "<init>", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "textView", "", "count", "", CampaignEx.JSON_KEY_AD_Q, "(Landroid/widget/TextView;I)V", "Landroid/content/Context;", "context", RequestParameters.POSITION, "", "Lcom/transsion/moviedetailapi/bean/Image;", "imageList", TtmlNode.TAG_P, "(Landroid/content/Context;ILjava/util/List;)V", "Lq6/a;", "info", "Lcom/transsion/postdetail/comment/g0;", "clickListener", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "(ILq6/a;Lcom/transsion/postdetail/comment/g0;)V", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "mAvatarView", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroid/widget/TextView;", "mUserNameTV", "Landroidx/appcompat/widget/AppCompatTextView;", "c", "Landroidx/appcompat/widget/AppCompatTextView;", "mCommentContentTV", "mLikeView", "e", "Landroid/view/View;", "mLikeClickView", "f", "mLikeCountTV", "g", "mCommentDataTV", "h", "mReplyView", "i", "mTopLine", "Lcom/google/android/material/imageview/ShapeableImageView;", "j", "Lcom/google/android/material/imageview/ShapeableImageView;", "mCommentCover", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class CommentHolder extends BaseViewHolder implements InterfaceC16734h0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private ImageView mAvatarView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private TextView mUserNameTV;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private AppCompatTextView mCommentContentTV;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private ImageView mLikeView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private View mLikeClickView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private TextView mLikeCountTV;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private TextView mCommentDataTV;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private View mReplyView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private View mTopLine;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private ShapeableImageView mCommentCover;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentHolder(View view) {
        super(view);
        Intrinsics.m97802h(view, "view");
        this.mAvatarView = (ImageView) view.findViewById(R$id.item_comment_user_avatar);
        this.mUserNameTV = (TextView) view.findViewById(R$id.item_comment_user_name);
        this.mCommentContentTV = (AppCompatTextView) view.findViewById(R$id.item_comment_content);
        this.mLikeView = (ImageView) view.findViewById(R$id.item_comment_like_icon);
        this.mLikeCountTV = (TextView) view.findViewById(R$id.item_comment_like_count);
        this.mCommentDataTV = (TextView) view.findViewById(R$id.item_comment_data);
        this.mReplyView = view.findViewById(R$id.item_comment_reply);
        this.mLikeClickView = view.findViewById(R$id.item_comment_like_click_bg);
        this.mTopLine = view.findViewById(R$id.item_comment_top_line);
        this.mCommentCover = (ShapeableImageView) view.findViewById(R$id.comment_cover);
        ImageView imageView = this.mAvatarView;
        if (imageView != null) {
            imageView.setClipToOutline(true);
            imageView.setOutlineProvider(new C14585i(AbstractC5776a0.m27313a(16.0f)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m72834k(InterfaceC27022a interfaceC27022a, CommentHolder commentHolder, View view) {
        ArrayList arrayList = new ArrayList();
        List<Cover> imageList = ((CommentBean) interfaceC27022a).getImageList();
        if (imageList != null) {
            for (Cover cover : imageList) {
                Image image = new Image(null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 16383, null);
                image.setUrl(cover != null ? cover.getUrl() : null);
                arrayList.add(image);
            }
        }
        Context context = commentHolder.itemView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        commentHolder.m72839p(context, 1, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m72835l(InterfaceC16732g0 interfaceC16732g0, InterfaceC27022a interfaceC27022a, View view) {
        if (interfaceC16732g0 != null) {
            interfaceC16732g0.mo72885R((CommentBean) interfaceC27022a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m72836m(CommentHolder commentHolder, InterfaceC27022a interfaceC27022a, InterfaceC16732g0 interfaceC16732g0, View view) {
        if (!C27287m.f83003a.m106330e()) {
            C28951b.f88586a.m111454d(R$string.base_net_err);
            return;
        }
        ImageView imageView = commentHolder.mLikeView;
        if (imageView != null) {
            if (imageView.isEnabled()) {
                imageView.setEnabled(false);
                TextView textView = commentHolder.mLikeCountTV;
                if (textView != null) {
                    textView.setEnabled(false);
                }
                CommentBean commentBean = (CommentBean) interfaceC27022a;
                commentBean.setLikeStatu(Boolean.FALSE);
                if (commentBean.getLikeCnt() > 0) {
                    commentBean.setLikeCnt(commentBean.getLikeCnt() - 1);
                }
            } else {
                imageView.setEnabled(true);
                TextView textView2 = commentHolder.mLikeCountTV;
                if (textView2 != null) {
                    textView2.setEnabled(true);
                }
                CommentBean commentBean2 = (CommentBean) interfaceC27022a;
                commentBean2.setLikeStatu(Boolean.TRUE);
                commentBean2.setLikeCnt(commentBean2.getLikeCnt() + 1);
            }
        }
        CommentBean commentBean3 = (CommentBean) interfaceC27022a;
        commentHolder.m72840q(commentHolder.mLikeCountTV, commentBean3.getLikeCnt());
        if (interfaceC16732g0 != null) {
            interfaceC16732g0.mo72882A(commentBean3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m72837n(InterfaceC16732g0 interfaceC16732g0, InterfaceC27022a interfaceC27022a, View view) {
        if (interfaceC16732g0 != null) {
            interfaceC16732g0.mo72883H((CommentBean) interfaceC27022a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final boolean m72838o(InterfaceC16732g0 interfaceC16732g0, InterfaceC27022a interfaceC27022a, View view) {
        if (interfaceC16732g0 == null) {
            return true;
        }
        interfaceC16732g0.mo72884Q((CommentBean) interfaceC27022a);
        return true;
    }

    /* JADX INFO: renamed from: p */
    private final void m72839p(Context context, int position, List imageList) {
        Intent intent = new Intent(context, (Class<?>) GifImagePreviewActivity.class);
        Intrinsics.m97800f(imageList, "null cannot be cast to non-null type java.io.Serializable");
        intent.putExtra(GifImagePreviewActivity.IMAGE_LIST, (Serializable) imageList);
        intent.putExtra("CURRENT_ITEM", position);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: q */
    private final void m72840q(TextView textView, int count) {
        if (textView != null) {
            textView.setText(count > 0 ? C16747t.f56290a.m72931a(count) : "");
        }
    }

    @Override // com.transsion.postdetail.comment.InterfaceC16734h0
    /* JADX INFO: renamed from: d */
    public void mo72841d(int position, final InterfaceC27022a info, final InterfaceC16732g0 clickListener) {
        String url;
        if (info instanceof CommentBean) {
            CommentBean commentBean = (CommentBean) info;
            ImageView imageView = this.mAvatarView;
            if (imageView != null) {
                C23860f.a aVar = C23860f.f72909a;
                Context context = imageView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94457m = aVar.m94457m(context);
                String avatarUrl = commentBean.getAvatarUrl();
                if (avatarUrl == null) {
                    avatarUrl = "";
                }
                bVarM94457m.m94468g(avatarUrl).m94465d(imageView);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.comment.o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CommentHolder.m72835l(clickListener, info, view);
                    }
                });
            }
            List<Cover> imageList = commentBean.getImageList();
            if (imageList == null || !(!imageList.isEmpty())) {
                ShapeableImageView shapeableImageView = this.mCommentCover;
                if (shapeableImageView != null) {
                    shapeableImageView.setVisibility(8);
                }
            } else {
                ShapeableImageView shapeableImageView2 = this.mCommentCover;
                if (shapeableImageView2 != null) {
                    shapeableImageView2.setVisibility(0);
                    C23860f.a aVar2 = C23860f.f72909a;
                    Context context2 = shapeableImageView2.getContext();
                    Intrinsics.m97801g(context2, "getContext(...)");
                    C23860f.b bVarM94457m2 = aVar2.m94457m(context2);
                    List<Cover> imageList2 = commentBean.getImageList();
                    Intrinsics.m97799e(imageList2);
                    Cover cover = imageList2.get(0);
                    if (cover == null || (url = cover.getUrl()) == null) {
                        url = "";
                    }
                    bVarM94457m2.m94468g(url).m94465d(shapeableImageView2);
                }
            }
            TextView textView = this.mUserNameTV;
            if (textView != null) {
                String nickName = commentBean.getNickName();
                textView.setText(nickName != null ? nickName : "");
            }
            AppCompatTextView appCompatTextView = this.mCommentContentTV;
            if (appCompatTextView != null) {
                AbstractC14566l.m65690e(appCompatTextView, commentBean.getContent(), null);
            }
            ImageView imageView2 = this.mLikeView;
            if (imageView2 != null) {
                Boolean likeStatu = commentBean.getLikeStatu();
                imageView2.setEnabled(likeStatu != null ? likeStatu.booleanValue() : false);
            }
            TextView textView2 = this.mLikeCountTV;
            if (textView2 != null) {
                Boolean likeStatu2 = commentBean.getLikeStatu();
                textView2.setEnabled(likeStatu2 != null ? likeStatu2.booleanValue() : false);
            }
            m72840q(this.mLikeCountTV, commentBean.getLikeCnt());
            TextView textView3 = this.mCommentDataTV;
            if (textView3 != null) {
                C16747t c16747t = C16747t.f56290a;
                Context context3 = this.itemView.getContext();
                Intrinsics.m97801g(context3, "getContext(...)");
                Long createdAt = commentBean.getCreatedAt();
                textView3.setText(c16747t.m72932c(context3, createdAt != null ? createdAt.longValue() : 0L));
            }
            View view = this.mLikeClickView;
            if (view != null) {
                view.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.comment.p
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        CommentHolder.m72836m(this.f56281a, info, clickListener, view2);
                    }
                });
            }
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.comment.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CommentHolder.m72837n(clickListener, info, view2);
                }
            });
            this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.transsion.postdetail.comment.r
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return CommentHolder.m72838o(clickListener, info, view2);
                }
            });
            ShapeableImageView shapeableImageView3 = this.mCommentCover;
            if (shapeableImageView3 != null) {
                shapeableImageView3.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.postdetail.comment.s
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        CommentHolder.m72834k(info, this, view2);
                    }
                });
            }
        }
    }
}
