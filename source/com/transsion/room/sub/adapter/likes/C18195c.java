package com.transsion.room.sub.adapter.likes;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
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
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.AbstractC14571q;
import com.transsion.baseui.util.TimeUtilKt;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.room.R$id;
import com.transsion.room.R$layout;
import com.transsion.ugcvideodetail.api.UGCVideoTypeKt;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
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

/* JADX INFO: renamed from: com.transsion.room.sub.adapter.likes.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\"#B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, m97100d2 = {"Lcom/transsion/room/sub/adapter/likes/c;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideo;", "Lu6/i;", "", "data", "Lvj/b;", "exposureHelper", "", "showNumberTh", "<init>", "(Ljava/util/List;Lvj/b;Z)V", "", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "Lcom/transsion/room/sub/adapter/likes/a;", "itemClickListener", "", "Q1", "(Lcom/transsion/room/sub/adapter/likes/a;)V", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "B0", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "G", "Lvj/b;", "H", "Z", "I", "Lcom/transsion/room/sub/adapter/likes/a;", "clickListener", "J", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C18195c extends BaseProviderMultiAdapter<UGCVideo> implements InterfaceC27944i {

    /* JADX INFO: renamed from: K */
    private static final String f59344K = "UgcLikesFeedAdapter";

    /* JADX INFO: renamed from: L */
    public static final int f59345L = 1;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C28117b exposureHelper;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final boolean showNumberTh;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private InterfaceC18193a clickListener;

    /* JADX INFO: renamed from: com.transsion.room.sub.adapter.likes.c$b */
    public static final class b extends BaseItemProvider {

        /* JADX INFO: renamed from: e */
        private final C28117b f59349e;

        /* JADX INFO: renamed from: f */
        private final boolean f59350f;

        /* JADX INFO: renamed from: g */
        private InterfaceC18193a f59351g;

        public b(C28117b c28117b, boolean z11) {
            this.f59349e = c28117b;
            this.f59350f = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: A */
        public static final void m77122A(b bVar, UGCVideo uGCVideo, Ref.IntRef intRef, View view) {
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.no_network_toast);
                return;
            }
            InterfaceC18193a interfaceC18193a = bVar.f59351g;
            if (interfaceC18193a != null) {
                interfaceC18193a.mo77116a(uGCVideo);
            }
            bVar.m77123B(WebConstants.FIELD_ITEM, uGCVideo, intRef.element);
        }

        /* JADX INFO: renamed from: B */
        private final void m77123B(String str, UGCVideo uGCVideo, int i11) {
            HashMap map = new HashMap();
            map.put("module_name", str);
            map.put("ops", String.valueOf(uGCVideo.getOps()));
            map.put("content_id", String.valueOf(uGCVideo.getUgcVideoId()));
            map.put(RequestParameters.POSITION, String.valueOf(i11));
            map.put("refer_subject_id", String.valueOf(uGCVideo.getSubjectId()));
            map.put("content_type", "ugc_video");
            C14450a.f50860a.m65139b("/ugc/likes", map);
        }

        /* JADX INFO: renamed from: C */
        public final void m77125C(InterfaceC18193a interfaceC18193a) {
            this.f59351g = interfaceC18193a;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: l */
        public int mo22758l() {
            return 1;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: m */
        public int mo22759m() {
            return R$layout.fragment_likes_item_waterfall_feed;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void mo22757b(BaseViewHolder holder, final UGCVideo feedItem) {
            String thumbnail;
            Intrinsics.m97802h(holder, "holder");
            Intrinsics.m97802h(feedItem, "feedItem");
            C26866a.a.m104898f(C26866a.f81698a, C18195c.f59344K, "convert", false, 4, null);
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = holder.getBindingAdapterPosition();
            ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getViewOrNull(R$id.coverImage);
            if (shapeableImageView != null) {
                C23860f.a aVar = C23860f.f72909a;
                Context context = shapeableImageView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94457m = aVar.m94457m(context);
                Cover cover = feedItem.getCover();
                C23860f.b bVarM94468g = bVarM94457m.m94468g(cover != null ? cover.getUrl() : null);
                Cover cover2 = feedItem.getCover();
                if (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) {
                    thumbnail = "";
                }
                bVarM94468g.m94473l(thumbnail).m94465d(shapeableImageView);
                shapeableImageView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.room.sub.adapter.likes.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C18195c.b.m77122A(this.f59352a, feedItem, intRef, view);
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
            ImageView imageView = (ImageView) holder.getViewOrNull(R$id.trending_grid_type_icon);
            if (imageView != null) {
                UGCVideoTypeKt.m83628i(imageView, feedItem, null, 4, null);
            }
            int i11 = R$id.trending_grid_time_text;
            Long duration = feedItem.getDuration();
            holder.setText(i11, TimeUtilKt.m65649a(duration != null ? Integer.valueOf((int) duration.longValue()) : null));
            holder.setText(R$id.videoTitle, feedItem.getTitle());
            holder.setText(R$id.videoInfo, AbstractC14571q.m65708e(feedItem.isVerticalImmStyle() ? CollectionsKt.m97511q("special_#shorts_icon", Utils.m27275a().getString(com.transsion.baseui.R$string.ugc_video_shorts), AbstractC14564j.m65682c(feedItem.getWatchNum(), m36338k())) : CollectionsKt.m97511q(AbstractC14564j.m65682c(feedItem.getWatchNum(), m36338k()), TimeUtilKt.m65661m(String.valueOf(feedItem.getPublishTime()))), m36338k()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18195c(List<UGCVideo> data, C28117b c28117b, boolean z11) {
        super(data);
        Intrinsics.m97802h(data, "data");
        this.exposureHelper = c28117b;
        this.showNumberTh = z11;
        mo36107F1(new b(c28117b, z11));
    }

    public /* synthetic */ C18195c(List list, C28117b c28117b, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, c28117b, (i11 & 4) != 0 ? false : z11);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter, com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: B0 */
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("曝光的位置position11: ");
        sb2.append(bindingAdapterPosition);
        C28117b c28117b = this.exposureHelper;
        if (c28117b != null) {
            RecyclerView.AbstractC4214m layoutManager = getRecyclerView().getLayoutManager();
            Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
            C28117b.m109192j(c28117b, (StaggeredGridLayoutManager) layoutManager, bindingAdapterPosition, true, false, 8, null);
        }
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends UGCVideo> data, int position) {
        Intrinsics.m97802h(data, "data");
        return 1;
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m77121Q1(InterfaceC18193a itemClickListener) {
        this.clickListener = itemClickListener;
        b bVar = new b(this.exposureHelper, this.showNumberTh);
        bVar.m77125C(this.clickListener);
        mo36107F1(bVar);
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
