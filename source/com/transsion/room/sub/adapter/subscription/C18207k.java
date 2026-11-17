package com.transsion.room.sub.adapter.subscription;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.AbstractC2397b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.view.CornerTextView;
import com.p282tn.lib.widget.R$string;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.R$drawable;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.AbstractC14571q;
import com.transsion.baseui.util.TimeUtilKt;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.room.R$id;
import com.transsion.room.R$layout;
import com.transsion.room.sub.bean.subscription.ItemTrending;
import com.transsion.ugcvideodetail.api.UGCVideoTypeKt;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoCreator;
import com.transsion.ugcvideodetail.api.bean.UGCVideoInteractiveInfo;
import com.transsion.web.api.WebConstants;
import com.transsion.wrapperad.R$color;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p462hj.C23860f;
import p743rh.C27287m;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import p840vj.C28117b;
import p944yh.C28951b;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.room.sub.adapter.subscription.k */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002+,B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006-"}, m97100d2 = {"Lcom/transsion/room/sub/adapter/subscription/k;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/room/sub/bean/subscription/ItemTrending;", "Lu6/i;", "", "data", "Lvj/b;", "listExposureHelper", "", "showNumberTh", "<init>", "(Ljava/util/List;Lvj/b;Z)V", "Lcom/transsion/room/sub/adapter/subscription/a;", "itemClickListener", "", "Q1", "(Lcom/transsion/room/sub/adapter/subscription/a;)V", "", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "z0", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "B0", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "G", "Lvj/b;", "H", "Z", "Landroid/widget/ImageView;", "I", "Landroid/widget/ImageView;", "mLikeImg", "J", "Lcom/transsion/room/sub/adapter/subscription/a;", "clickListener", "K", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C18207k extends BaseProviderMultiAdapter<ItemTrending> implements InterfaceC27944i {

    /* JADX INFO: renamed from: L */
    private static final String f59388L = "SubscriptionFeedAdapter";

    /* JADX INFO: renamed from: M */
    public static final int f59389M = 1;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C28117b listExposureHelper;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final boolean showNumberTh;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private ImageView mLikeImg;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private InterfaceC18197a clickListener;

    /* JADX INFO: renamed from: com.transsion.room.sub.adapter.subscription.k$b */
    public static final class b extends BaseItemProvider {

        /* JADX INFO: renamed from: e */
        private final C28117b f59394e;

        /* JADX INFO: renamed from: f */
        private final boolean f59395f;

        /* JADX INFO: renamed from: g */
        private final String f59396g = "/subscription/subscription";

        /* JADX INFO: renamed from: h */
        private InterfaceC18197a f59397h;

        public b(C28117b c28117b, boolean z11) {
            this.f59394e = c28117b;
            this.f59395f = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: G */
        public static final void m77159G(b bVar, ItemTrending itemTrending, Ref.IntRef intRef, View view) {
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.no_network_toast);
                return;
            }
            InterfaceC18197a interfaceC18197a = bVar.f59397h;
            if (interfaceC18197a != null) {
                interfaceC18197a.mo77127E(itemTrending.getContent().getVideo());
            }
            bVar.m77166N(WebConstants.FIELD_ITEM, itemTrending, intRef.element);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v17, types: [T, java.lang.Integer] */
        /* JADX INFO: renamed from: H */
        public static final void m77160H(Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, BaseViewHolder baseViewHolder, b bVar, Ref.ObjectRef objectRef2, ItemTrending itemTrending, Ref.IntRef intRef, View view) {
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.no_network_toast);
                return;
            }
            boolean z11 = !booleanRef.element;
            booleanRef.element = z11;
            if (z11) {
                Integer num = (Integer) objectRef.element;
                objectRef.element = num != null ? Integer.valueOf(num.intValue() + 1) : 0;
            } else {
                Integer num2 = (Integer) objectRef.element;
                objectRef.element = num2 != null ? Integer.valueOf(num2.intValue() - 1) : 0;
            }
            Integer num3 = (Integer) objectRef.element;
            if (num3 != null && num3.intValue() < 0) {
                objectRef.element = 0;
            }
            baseViewHolder.setText(R$id.likeText, String.valueOf(objectRef.element));
            bVar.m77171P(booleanRef.element, (AppCompatTextView) objectRef2.element);
            C26866a.a.m104898f(C26866a.f81698a, C18207k.f59388L, "like 点击后状态 " + booleanRef.element, false, 4, null);
            InterfaceC18197a interfaceC18197a = bVar.f59397h;
            if (interfaceC18197a != null) {
                boolean z12 = booleanRef.element;
                UGCVideo video = itemTrending.getContent().getVideo();
                interfaceC18197a.mo77132v(z12, String.valueOf(video != null ? video.getUgcVideoId() : null));
            }
            bVar.m77166N("like", itemTrending, intRef.element);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public static final void m77161I(b bVar, ItemTrending itemTrending, Ref.IntRef intRef, View view) {
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.no_network_toast);
                return;
            }
            InterfaceC18197a interfaceC18197a = bVar.f59397h;
            if (interfaceC18197a != null) {
                interfaceC18197a.mo77131s(itemTrending.getContent().getVideo());
            }
            bVar.m77166N("comment", itemTrending, intRef.element);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: J */
        public static final void m77162J(b bVar, ItemTrending itemTrending, View view) {
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.no_network_toast);
                return;
            }
            InterfaceC18197a interfaceC18197a = bVar.f59397h;
            if (interfaceC18197a != null) {
                UGCVideo video = itemTrending.getContent().getVideo();
                String ugcVideoId = video != null ? video.getUgcVideoId() : null;
                UGCVideo video2 = itemTrending.getContent().getVideo();
                interfaceC18197a.mo77128I(ugcVideoId, video2 != null ? video2.getTitle() : null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: K */
        public static final void m77163K(b bVar, ItemTrending itemTrending, View view) {
            UGCVideoCreator creator;
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.no_network_toast);
                return;
            }
            InterfaceC18197a interfaceC18197a = bVar.f59397h;
            if (interfaceC18197a != null) {
                UGCVideo video = itemTrending.getContent().getVideo();
                interfaceC18197a.mo77130b((video == null || (creator = video.getCreator()) == null) ? null : creator.getUid());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: L */
        public static final void m77164L(b bVar, ItemTrending itemTrending, Ref.IntRef intRef, View view) {
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.no_network_toast);
                return;
            }
            InterfaceC18197a interfaceC18197a = bVar.f59397h;
            if (interfaceC18197a != null) {
                interfaceC18197a.mo77127E(itemTrending.getContent().getVideo());
            }
            bVar.m77166N(WebConstants.FIELD_ITEM, itemTrending, intRef.element);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: M */
        public static final void m77165M(b bVar, ItemTrending itemTrending, Ref.IntRef intRef, View view) {
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.no_network_toast);
                return;
            }
            InterfaceC18197a interfaceC18197a = bVar.f59397h;
            if (interfaceC18197a != null) {
                interfaceC18197a.mo77127E(itemTrending.getContent().getVideo());
            }
            bVar.m77166N(WebConstants.FIELD_ITEM, itemTrending, intRef.element);
        }

        /* JADX INFO: renamed from: N */
        private final void m77166N(String str, ItemTrending itemTrending, int i11) {
            HashMap map = new HashMap();
            map.put("module_name", str);
            UGCVideo video = itemTrending.getContent().getVideo();
            map.put("ops", String.valueOf(video != null ? video.getOps() : null));
            UGCVideo video2 = itemTrending.getContent().getVideo();
            map.put("content_id", String.valueOf(video2 != null ? video2.getUgcVideoId() : null));
            map.put(RequestParameters.POSITION, String.valueOf(i11));
            UGCVideo video3 = itemTrending.getContent().getVideo();
            map.put("refer_subject_id", String.valueOf(video3 != null ? video3.getSubjectId() : null));
            map.put("content_type", "ugc_video");
            C14450a.f50860a.m65139b(this.f59396g, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v38, types: [T, android.view.View] */
        /* JADX WARN: Type inference failed for: r0v43 */
        /* JADX WARN: Type inference failed for: r0v44, types: [T, java.lang.Number] */
        /* JADX WARN: Type inference failed for: r0v56, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r0v70 */
        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo22757b(final BaseViewHolder holder, final ItemTrending feedItem) {
            List listQ;
            UGCVideoInteractiveInfo interactiveInfo;
            UGCVideoInteractiveInfo interactiveInfo2;
            UGCVideoInteractiveInfo interactiveInfo3;
            Long duration;
            UGCVideoCreator creator;
            String thumbnail;
            Cover cover;
            Cover cover2;
            Intrinsics.m97802h(holder, "holder");
            Intrinsics.m97802h(feedItem, "feedItem");
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = holder.getBindingAdapterPosition();
            ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getViewOrNull(R$id.cover_image);
            String commentNum = null;
            if (shapeableImageView != null) {
                C23860f.a aVar = C23860f.f72909a;
                Context context = shapeableImageView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94457m = aVar.m94457m(context);
                UGCVideo video = feedItem.getContent().getVideo();
                C23860f.b bVarM94468g = bVarM94457m.m94468g((video == null || (cover2 = video.getCover()) == null) ? null : cover2.getUrl());
                UGCVideo video2 = feedItem.getContent().getVideo();
                if (video2 == null || (cover = video2.getCover()) == null || (thumbnail = cover.getThumbnail()) == null) {
                    thumbnail = "";
                }
                bVarM94468g.m94473l(thumbnail).m94465d(shapeableImageView);
                shapeableImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.sub.adapter.subscription.l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C18207k.b.m77159G(this.f59398a, feedItem, intRef, view);
                    }
                });
            }
            UGCVideo video3 = feedItem.getContent().getVideo();
            String corner = video3 != null ? video3.getCorner() : null;
            if (corner == null) {
                CornerTextView cornerTextView = (CornerTextView) holder.getViewOrNull(R$id.languageTag);
                if (cornerTextView != null) {
                    cornerTextView.setVisibility(4);
                }
            } else {
                holder.setText(R$id.languageTag, corner);
            }
            ShapeableImageView shapeableImageView2 = (ShapeableImageView) holder.getViewOrNull(R$id.publisherAvatar);
            if (shapeableImageView2 != null) {
                C23860f.a aVar2 = C23860f.f72909a;
                Context context2 = shapeableImageView2.getContext();
                Intrinsics.m97801g(context2, "getContext(...)");
                C23860f.b bVarM94457m2 = aVar2.m94457m(context2);
                UGCVideo video4 = feedItem.getContent().getVideo();
                bVarM94457m2.m94468g((video4 == null || (creator = video4.getCreator()) == null) ? null : creator.getAvatar()).m94470i(R$color.white_20).m94465d(shapeableImageView2);
                shapeableImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.sub.adapter.subscription.m
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C18207k.b.m77163K(this.f59401a, feedItem, view);
                    }
                });
            }
            UGCVideo video5 = feedItem.getContent().getVideo();
            ImageView imageView = (ImageView) holder.getViewOrNull(R$id.trending_grid_type_icon);
            if (imageView != null && video5 != null) {
                UGCVideoTypeKt.m83628i(imageView, video5, null, 4, null);
            }
            int i11 = R$id.trending_grid_time_text;
            UGCVideo video6 = feedItem.getContent().getVideo();
            holder.setText(i11, TimeUtilKt.m65649a((video6 == null || (duration = video6.getDuration()) == null) ? null : Integer.valueOf((int) duration.longValue())));
            int i12 = R$id.videoTitle;
            UGCVideo video7 = feedItem.getContent().getVideo();
            holder.setText(i12, video7 != null ? video7.getTitle() : null);
            TextView textView = (TextView) holder.getViewOrNull(R$id.videoTitle);
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.sub.adapter.subscription.n
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C18207k.b.m77164L(this.f59403a, feedItem, intRef, view);
                    }
                });
            }
            TextView textView2 = (TextView) holder.getViewOrNull(R$id.videoInfo);
            if (textView2 != null) {
                textView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.sub.adapter.subscription.o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C18207k.b.m77165M(this.f59406a, feedItem, intRef, view);
                    }
                });
            }
            UGCVideo video8 = feedItem.getContent().getVideo();
            if (video8 != null ? video8.isVerticalImmStyle() : false) {
                String string = Utils.m27275a().getString(com.transsion.baseui.R$string.ugc_video_shorts);
                UGCVideo video9 = feedItem.getContent().getVideo();
                listQ = CollectionsKt.m97511q("special_#shorts_icon", string, AbstractC14564j.m65682c(video9 != null ? video9.getWatchNum() : null, m36338k()));
            } else {
                UGCVideo video10 = feedItem.getContent().getVideo();
                String strM65682c = AbstractC14564j.m65682c(video10 != null ? video10.getWatchNum() : null, m36338k());
                UGCVideo video11 = feedItem.getContent().getVideo();
                Long publishTime = video11 != null ? video11.getPublishTime() : null;
                Intrinsics.m97799e(publishTime);
                listQ = CollectionsKt.m97511q(strM65682c, TimeUtilKt.m65660l(publishTime.longValue()));
            }
            holder.setText(R$id.videoInfo, AbstractC14571q.m65708e(listQ, m36338k()));
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = holder.getView(R$id.likeText);
            UGCVideo video12 = feedItem.getContent().getVideo();
            String likeNum = (video12 == null || (interactiveInfo3 = video12.getInteractiveInfo()) == null) ? null : interactiveInfo3.getLikeNum();
            C26866a.a aVar3 = C26866a.f81698a;
            C26866a.a.m104898f(aVar3, C18207k.f59388L, "likeNumber的数量: " + likeNum, false, 4, null);
            UGCVideo video13 = feedItem.getContent().getVideo();
            boolean zM97797c = (video13 == null || (interactiveInfo2 = video13.getInteractiveInfo()) == null) ? false : Intrinsics.m97797c(interactiveInfo2.getHasLike(), Boolean.TRUE);
            m77171P(zM97797c, (AppCompatTextView) objectRef.element);
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = zM97797c;
            C26866a.a.m104898f(aVar3, C18207k.f59388L, "like 初始状态 " + zM97797c, false, 4, null);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            ?? ValueOf = likeNum != null ? Integer.valueOf(Integer.parseInt(likeNum)) : 0;
            objectRef2.element = ValueOf;
            if (ValueOf != 0 && ValueOf.intValue() < 0) {
                objectRef2.element = 0;
            }
            holder.setText(R$id.likeText, String.valueOf(objectRef2.element));
            ((AppCompatTextView) objectRef.element).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.sub.adapter.subscription.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C18207k.b.m77160H(booleanRef, objectRef2, holder, this, objectRef, feedItem, intRef, view);
                }
            });
            int i13 = R$id.commentImg;
            UGCVideo video14 = feedItem.getContent().getVideo();
            if (video14 != null && (interactiveInfo = video14.getInteractiveInfo()) != null) {
                commentNum = interactiveInfo.getCommentNum();
            }
            holder.setText(i13, commentNum);
            ((AppCompatTextView) holder.getView(R$id.commentImg)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.sub.adapter.subscription.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C18207k.b.m77161I(this.f59416a, feedItem, intRef, view);
                }
            });
            ((AppCompatTextView) holder.getView(R$id.shareImg)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.sub.adapter.subscription.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C18207k.b.m77162J(this.f59419a, feedItem, view);
                }
            });
        }

        /* JADX INFO: renamed from: O */
        public final void m77170O(InterfaceC18197a interfaceC18197a) {
            this.f59397h = interfaceC18197a;
        }

        /* JADX INFO: renamed from: P */
        public final void m77171P(boolean z11, AppCompatTextView imageLikes) {
            Intrinsics.m97802h(imageLikes, "imageLikes");
            imageLikes.setCompoundDrawablesWithIntrinsicBounds(AbstractC2397b.getDrawable(m36338k(), z11 ? R$drawable.base_ic_ugc_post_like_selected : R$drawable.base_ic_ugc_post_like), (Drawable) null, (Drawable) null, (Drawable) null);
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: l */
        public int mo22758l() {
            return 1;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: m */
        public int mo22759m() {
            return R$layout.item_feed;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18207k(List<ItemTrending> data, C28117b c28117b, boolean z11) {
        super(data);
        Intrinsics.m97802h(data, "data");
        this.listExposureHelper = c28117b;
        this.showNumberTh = z11;
    }

    public /* synthetic */ C18207k(List list, C28117b c28117b, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, c28117b, (i11 & 4) != 0 ? false : z11);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter, com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: B0 */
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        C28117b c28117b = this.listExposureHelper;
        if (c28117b != null) {
            RecyclerView.AbstractC4214m layoutManager = getRecyclerView().getLayoutManager();
            Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            C28117b.m109192j(c28117b, (LinearLayoutManager) layoutManager, bindingAdapterPosition, true, false, 8, null);
        }
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends ItemTrending> data, int position) {
        Intrinsics.m97802h(data, "data");
        return 1;
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m77153Q1(InterfaceC18197a itemClickListener) {
        this.clickListener = itemClickListener;
        b bVar = new b(this.listExposureHelper, this.showNumberTh);
        bVar.m77170O(this.clickListener);
        mo36107F1(bVar);
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: z0 */
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.m97802h(parent, "parent");
        return super.onCreateViewHolder(parent, viewType);
    }
}
