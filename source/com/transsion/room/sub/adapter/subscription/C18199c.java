package com.transsion.room.sub.adapter.subscription;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
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
import com.transsion.baselib.helper.C14450a;
import com.transsion.baseui.R$drawable;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.AbstractC14571q;
import com.transsion.baseui.util.C14557c;
import com.transsion.baseui.util.TimeUtilKt;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.room.R$id;
import com.transsion.room.R$layout;
import com.transsion.room.R$string;
import com.transsion.ugcvideodetail.api.UGCVideoTypeKt;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoCreator;
import com.transsion.ugcvideodetail.api.bean.UGCVideoInteractiveInfo;
import com.transsion.web.api.WebConstants;
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

/* JADX INFO: renamed from: com.transsion.room.sub.adapter.subscription.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002'(B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006)"}, m97100d2 = {"Lcom/transsion/room/sub/adapter/subscription/c;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "Lu6/i;", "", "data", "Lvj/b;", "listExposureHelper", "", "showNumberTh", "<init>", "(Ljava/util/List;Lvj/b;Z)V", "Lcom/transsion/room/sub/adapter/subscription/a;", "itemClickListener", "", "Q1", "(Lcom/transsion/room/sub/adapter/subscription/a;)V", "", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "z0", "(Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "B0", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "G", "Lvj/b;", "H", "Z", "I", "Lcom/transsion/room/sub/adapter/subscription/a;", "clickListener", "J", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C18199c extends BaseProviderMultiAdapter<UGCVideo> implements InterfaceC27944i {

    /* JADX INFO: renamed from: K */
    private static final String f59356K = "SubscriptionFeedAdapter";

    /* JADX INFO: renamed from: L */
    public static final int f59357L = 1;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C28117b listExposureHelper;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final boolean showNumberTh;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private InterfaceC18197a clickListener;

    /* JADX INFO: renamed from: com.transsion.room.sub.adapter.subscription.c$b */
    public static final class b extends BaseItemProvider {

        /* JADX INFO: renamed from: e */
        private final C28117b f59361e;

        /* JADX INFO: renamed from: f */
        private final boolean f59362f;

        /* JADX INFO: renamed from: g */
        private InterfaceC18197a f59363g;

        public b(C28117b c28117b, boolean z11) {
            this.f59361e = c28117b;
            this.f59362f = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: G */
        public static final void m77140G(b bVar, UGCVideo uGCVideo, Ref.IntRef intRef, View view) {
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.base_net_err);
                return;
            }
            InterfaceC18197a interfaceC18197a = bVar.f59363g;
            if (interfaceC18197a != null) {
                interfaceC18197a.mo77129a(uGCVideo);
            }
            bVar.m77147N(WebConstants.FIELD_ITEM, uGCVideo, intRef.element);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v14, types: [T, java.lang.Integer] */
        /* JADX INFO: renamed from: H */
        public static final void m77141H(Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, BaseViewHolder baseViewHolder, b bVar, Ref.ObjectRef objectRef2, UGCVideo uGCVideo, Ref.IntRef intRef, View view) {
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
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
            bVar.m77152P(booleanRef.element, (AppCompatTextView) objectRef2.element);
            C26866a.a.m104898f(C26866a.f81698a, C18199c.f59356K, "like 点击后状态 " + booleanRef.element, false, 4, null);
            InterfaceC18197a interfaceC18197a = bVar.f59363g;
            if (interfaceC18197a != null) {
                interfaceC18197a.mo77132v(booleanRef.element, String.valueOf(uGCVideo.getUgcVideoId()));
            }
            bVar.m77147N("like", uGCVideo, intRef.element);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public static final void m77142I(b bVar, UGCVideo uGCVideo, Ref.IntRef intRef, View view) {
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
                return;
            }
            InterfaceC18197a interfaceC18197a = bVar.f59363g;
            if (interfaceC18197a != null) {
                interfaceC18197a.mo77131s(uGCVideo);
            }
            bVar.m77147N("comment", uGCVideo, intRef.element);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: J */
        public static final void m77143J(b bVar, UGCVideo uGCVideo, View view) {
            InterfaceC18197a interfaceC18197a;
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(com.p282tn.lib.widget.R$string.no_network_toast);
            } else {
                if (C14557c.f51100a.m65671a(view.getId(), 500L) || (interfaceC18197a = bVar.f59363g) == null) {
                    return;
                }
                interfaceC18197a.mo77128I(uGCVideo.getUgcVideoId(), uGCVideo.getTitle());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: K */
        public static final void m77144K(b bVar, UGCVideo uGCVideo, View view) {
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.base_net_err);
                return;
            }
            InterfaceC18197a interfaceC18197a = bVar.f59363g;
            if (interfaceC18197a != null) {
                UGCVideoCreator creator = uGCVideo.getCreator();
                interfaceC18197a.mo77130b(creator != null ? creator.getUid() : null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: L */
        public static final void m77145L(b bVar, UGCVideo uGCVideo, Ref.IntRef intRef, View view) {
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.base_net_err);
                return;
            }
            InterfaceC18197a interfaceC18197a = bVar.f59363g;
            if (interfaceC18197a != null) {
                interfaceC18197a.mo77129a(uGCVideo);
            }
            bVar.m77147N(WebConstants.FIELD_ITEM, uGCVideo, intRef.element);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: M */
        public static final void m77146M(b bVar, UGCVideo uGCVideo, Ref.IntRef intRef, View view) {
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.base_net_err);
                return;
            }
            InterfaceC18197a interfaceC18197a = bVar.f59363g;
            if (interfaceC18197a != null) {
                interfaceC18197a.mo77129a(uGCVideo);
            }
            bVar.m77147N(WebConstants.FIELD_ITEM, uGCVideo, intRef.element);
        }

        /* JADX INFO: renamed from: N */
        private final void m77147N(String str, UGCVideo uGCVideo, int i11) {
            HashMap map = new HashMap();
            map.put("module_name", str);
            map.put("ops", String.valueOf(uGCVideo.getOps()));
            map.put("content_id", String.valueOf(uGCVideo.getUgcVideoId()));
            map.put(RequestParameters.POSITION, String.valueOf(i11));
            map.put("refer_subject_id", String.valueOf(uGCVideo.getSubjectId()));
            map.put("content_type", "ugc_video");
            C14450a.f50860a.m65139b("/subscription/subscription", map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v29, types: [T, android.view.View] */
        /* JADX WARN: Type inference failed for: r0v35 */
        /* JADX WARN: Type inference failed for: r0v36, types: [T, java.lang.Number] */
        /* JADX WARN: Type inference failed for: r0v47, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r0v58 */
        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo22757b(final BaseViewHolder holder, final UGCVideo feedItem) {
            List listQ;
            String thumbnail;
            String thumbnail2;
            Intrinsics.m97802h(holder, "holder");
            Intrinsics.m97802h(feedItem, "feedItem");
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = holder.getBindingAdapterPosition();
            ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getViewOrNull(R$id.cover_image);
            String str = "";
            if (shapeableImageView != null) {
                C23860f.a aVar = C23860f.f72909a;
                Context context = shapeableImageView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94457m = aVar.m94457m(context);
                Cover cover = feedItem.getCover();
                C23860f.b bVarM94468g = bVarM94457m.m94468g(cover != null ? cover.getUrl() : null);
                Cover cover2 = feedItem.getCover();
                if (cover2 == null || (thumbnail2 = cover2.getThumbnail()) == null) {
                    thumbnail2 = "";
                }
                bVarM94468g.m94473l(thumbnail2).m94465d(shapeableImageView);
                shapeableImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.sub.adapter.subscription.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C18199c.b.m77140G(this.f59364a, feedItem, intRef, view);
                    }
                });
            }
            String corner = feedItem.getCorner();
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
                UGCVideoCreator creator = feedItem.getCreator();
                C23860f.b bVarM94468g2 = bVarM94457m2.m94468g(creator != null ? creator.getAvatar() : null);
                Cover cover3 = feedItem.getCover();
                if (cover3 != null && (thumbnail = cover3.getThumbnail()) != null) {
                    str = thumbnail;
                }
                bVarM94468g2.m94473l(str).m94465d(shapeableImageView2);
                shapeableImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.sub.adapter.subscription.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C18199c.b.m77144K(this.f59367a, feedItem, view);
                    }
                });
            }
            ImageView imageView = (ImageView) holder.getViewOrNull(R$id.trending_grid_type_icon);
            if (imageView != null) {
                UGCVideoTypeKt.m83628i(imageView, feedItem, null, 4, null);
            }
            int i11 = R$id.trending_grid_time_text;
            Long duration = feedItem.getDuration();
            holder.setText(i11, TimeUtilKt.m65649a(duration != null ? Integer.valueOf((int) duration.longValue()) : null));
            holder.setText(R$id.videoTitle, feedItem.getTitle());
            TextView textView = (TextView) holder.getViewOrNull(R$id.videoTitle);
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.sub.adapter.subscription.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C18199c.b.m77145L(this.f59369a, feedItem, intRef, view);
                    }
                });
            }
            TextView textView2 = (TextView) holder.getViewOrNull(R$id.videoInfo);
            if (textView2 != null) {
                textView2.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.sub.adapter.subscription.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C18199c.b.m77146M(this.f59372a, feedItem, intRef, view);
                    }
                });
            }
            if (feedItem.isVerticalImmStyle()) {
                listQ = CollectionsKt.m97511q("special_#shorts_icon", Utils.m27275a().getString(com.transsion.baseui.R$string.ugc_video_shorts), AbstractC14564j.m65682c(feedItem.getWatchNum(), m36338k()));
            } else {
                String strM65682c = AbstractC14564j.m65682c(feedItem.getWatchNum(), m36338k());
                Long publishTime = feedItem.getPublishTime();
                Intrinsics.m97799e(publishTime);
                listQ = CollectionsKt.m97511q(strM65682c, TimeUtilKt.m65660l(publishTime.longValue()));
            }
            holder.setText(R$id.videoInfo, AbstractC14571q.m65708e(listQ, m36338k()));
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = holder.getView(R$id.likeText);
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) holder.getView(R$id.likeLayout);
            UGCVideoInteractiveInfo interactiveInfo = feedItem.getInteractiveInfo();
            String likeNum = interactiveInfo != null ? interactiveInfo.getLikeNum() : null;
            C26866a.a aVar3 = C26866a.f81698a;
            C26866a.a.m104898f(aVar3, C18199c.f59356K, "likeNumber的数量: " + likeNum, false, 4, null);
            UGCVideoInteractiveInfo interactiveInfo2 = feedItem.getInteractiveInfo();
            boolean zM97797c = interactiveInfo2 != null ? Intrinsics.m97797c(interactiveInfo2.getHasLike(), Boolean.TRUE) : false;
            m77152P(zM97797c, (AppCompatTextView) objectRef.element);
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = zM97797c;
            C26866a.a.m104898f(aVar3, C18199c.f59356K, "like 初始状态 " + zM97797c, false, 4, null);
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            ?? ValueOf = likeNum != null ? Integer.valueOf(Integer.parseInt(likeNum)) : 0;
            objectRef2.element = ValueOf;
            if (ValueOf != 0 && ValueOf.intValue() < 0) {
                objectRef2.element = 0;
            }
            holder.setText(R$id.likeText, String.valueOf(objectRef2.element));
            linearLayoutCompat.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.sub.adapter.subscription.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C18199c.b.m77141H(booleanRef, objectRef2, holder, this, objectRef, feedItem, intRef, view);
                }
            });
            int i12 = R$id.commentImg;
            UGCVideoInteractiveInfo interactiveInfo3 = feedItem.getInteractiveInfo();
            holder.setText(i12, interactiveInfo3 != null ? interactiveInfo3.getCommentNum() : null);
            ((LinearLayoutCompat) holder.getView(R$id.commentLayout)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.sub.adapter.subscription.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C18199c.b.m77142I(this.f59382a, feedItem, intRef, view);
                }
            });
            ((LinearLayoutCompat) holder.getView(R$id.shareLayout)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.sub.adapter.subscription.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C18199c.b.m77143J(this.f59385a, feedItem, view);
                }
            });
        }

        /* JADX INFO: renamed from: O */
        public final void m77151O(InterfaceC18197a interfaceC18197a) {
            this.f59363g = interfaceC18197a;
        }

        /* JADX INFO: renamed from: P */
        public final void m77152P(boolean z11, AppCompatTextView imageLikes) {
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
    public C18199c(List<UGCVideo> data, C28117b c28117b, boolean z11) {
        super(data);
        Intrinsics.m97802h(data, "data");
        this.listExposureHelper = c28117b;
        this.showNumberTh = z11;
    }

    public /* synthetic */ C18199c(List list, C28117b c28117b, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
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
    protected int mo36112N1(List<? extends UGCVideo> data, int position) {
        Intrinsics.m97802h(data, "data");
        return 1;
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m77134Q1(InterfaceC18197a itemClickListener) {
        this.clickListener = itemClickListener;
        b bVar = new b(this.listExposureHelper, this.showNumberTh);
        bVar.m77151O(this.clickListener);
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
