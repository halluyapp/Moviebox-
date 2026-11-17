package com.transsion.home.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.C5118o;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.p282tn.lib.widget.R$color;
import com.transsion.baseui.util.AbstractC14564j;
import com.transsion.baseui.util.TimeUtilKt;
import com.transsion.home.R$drawable;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.adapter.operateUGC.adapter.C14860f;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.ugcvideodetail.api.UGCVideoTypeKt;
import com.transsion.ugcvideodetail.api.bean.UGCContent;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoCreator;
import com.transsion.ugcvideodetail.api.bean.UGCVideoHashTag;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p462hj.C23860f;
import p579ll.C25646b;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.home.adapter.e */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003*+,B3\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R*\u0010\n\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006-"}, m97100d2 = {"Lcom/transsion/home/adapter/e;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/ugcvideodetail/api/bean/UGCContent;", "Lu6/i;", "", "data", "Lll/b;", "exposureHelper", "", "showNumberTh", "isEducationList", "<init>", "(Ljava/util/List;Lll/b;ZZ)V", "", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "holder", "", "B0", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "G", "Lll/b;", "H", "Z", "Lcom/transsion/home/adapter/e$c;", "I", "Lcom/transsion/home/adapter/e$c;", "filmItemProvider", "Lcom/transsion/home/adapter/e$b;", "J", "Lcom/transsion/home/adapter/e$b;", "eduFilmItemProvider", AppMeasurementSdk.ConditionalUserProperty.VALUE, "K", "Q1", "()Z", "R1", "(Z)V", "L", "a", "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C14839e extends BaseProviderMultiAdapter<UGCContent> implements InterfaceC27944i {

    /* JADX INFO: renamed from: M */
    public static final int f51898M = 8;

    /* JADX INFO: renamed from: N */
    private static final String f51899N = "FilmListAdapter";

    /* JADX INFO: renamed from: O */
    public static final int f51900O = 1;

    /* JADX INFO: renamed from: P */
    public static final int f51901P = 2;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C25646b exposureHelper;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final boolean showNumberTh;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private c filmItemProvider;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private b eduFilmItemProvider;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private boolean isEducationList;

    /* JADX INFO: renamed from: com.transsion.home.adapter.e$b */
    public static final class b extends BaseItemProvider {

        /* JADX INFO: renamed from: e */
        private final C25646b f51907e;

        /* JADX INFO: renamed from: f */
        private final boolean f51908f;

        /* JADX INFO: renamed from: g */
        private boolean f51909g;

        public b(C25646b c25646b, boolean z11, boolean z12) {
            this.f51907e = c25646b;
            this.f51908f = z11;
            this.f51909g = z12;
        }

        /* JADX WARN: Code duplicated, block: B:45:0x0102  */
        /* JADX INFO: renamed from: A */
        private final void m66715A(BaseViewHolder baseViewHolder, UGCVideo uGCVideo) {
            String url;
            String thumbnail;
            UGCVideoHashTag uGCVideoHashTag;
            String title;
            String avatar;
            String nickname;
            ShapeableImageView shapeableImageView = (ShapeableImageView) baseViewHolder.getView(R$id.iv_cover);
            C23860f.a aVar = C23860f.f72909a;
            C23860f.b bVarM94457m = aVar.m94457m(m36338k());
            Cover cover = uGCVideo.getCover();
            if (cover == null || (url = cover.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94470i = bVarM94457m.m94468g(url).m94470i(R$color.cl37);
            Cover cover2 = uGCVideo.getCover();
            if (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) {
                thumbnail = "";
            }
            bVarM94470i.m94473l(thumbnail).m94465d(shapeableImageView);
            int i11 = R$id.tv_title;
            String title2 = uGCVideo.getTitle();
            if (title2 == null) {
                title2 = "";
            }
            baseViewHolder.setText(i11, title2);
            baseViewHolder.setText(R$id.tv_views, AbstractC14564j.m65682c(uGCVideo.getWatchNum(), m36338k()));
            boolean z11 = true;
            if (!this.f51909g || C5118o.f17608a.m23948i()) {
                baseViewHolder.setVisible(R$id.iv_res_post_type, true);
                baseViewHolder.setGone(R$id.iv_upload_user_icon, true);
                ((ImageView) baseViewHolder.getView(R$id.iv_res_post_type)).setImageResource(UGCVideoTypeKt.m83624e(uGCVideo.getCategory()));
                if (C5118o.f17608a.m23948i()) {
                    Long publishTime = uGCVideo.getPublishTime();
                    long jLongValue = publishTime != null ? publishTime.longValue() : 0L;
                    if (jLongValue > 0) {
                        title = TimeUtilKt.m65658j(jLongValue);
                    } else {
                        title = "";
                    }
                } else {
                    List<UGCVideoHashTag> hashTags = uGCVideo.getHashTags();
                    if (hashTags == null || (uGCVideoHashTag = (UGCVideoHashTag) CollectionsKt.m97362l0(hashTags, 0)) == null || (title = uGCVideoHashTag.getTitle()) == null) {
                        title = "";
                    }
                }
                if (title.length() == 0) {
                    baseViewHolder.setVisible(R$id.separator, false);
                    baseViewHolder.setText(R$id.tv_type, "");
                } else {
                    baseViewHolder.setVisible(R$id.separator, true);
                    baseViewHolder.setText(R$id.tv_type, title);
                }
            } else {
                baseViewHolder.setGone(R$id.iv_res_post_type, true);
                baseViewHolder.setVisible(R$id.iv_upload_user_icon, true);
                C23860f.b bVarM94457m2 = aVar.m94457m(m36338k());
                UGCVideoCreator creator = uGCVideo.getCreator();
                if (creator == null || (avatar = creator.getAvatar()) == null) {
                    avatar = "";
                }
                bVarM94457m2.m94468g(avatar).m94470i(R$drawable.icon_ugc_user_upload).m94465d((ImageView) baseViewHolder.getView(R$id.iv_upload_user_icon));
                int i12 = R$id.tv_type;
                UGCVideoCreator creator2 = uGCVideo.getCreator();
                if (creator2 == null || (nickname = creator2.getNickname()) == null) {
                    nickname = "";
                }
                baseViewHolder.setText(i12, nickname);
            }
            if (C5118o.f17608a.m23948i()) {
                m66717z(baseViewHolder, uGCVideo);
            }
            baseViewHolder.setText(R$id.tv_duration, uGCVideo.getTimeOrCount(m36338k()));
            String corner = uGCVideo.getCorner();
            View view = baseViewHolder.getView(R$id.tag_audio);
            TextView textView = (TextView) baseViewHolder.getView(R$id.tv_audio_tag);
            if (corner != null && !StringsKt.m98160q0(corner)) {
                z11 = false;
            }
            view.setVisibility(z11 ? 8 : 0);
            String corner2 = uGCVideo.getCorner();
            textView.setText(corner2 != null ? corner2 : "");
        }

        /* JADX INFO: renamed from: y */
        private final void m66716y(BaseViewHolder baseViewHolder) {
            int i11;
            int layoutPosition = baseViewHolder.getLayoutPosition();
            View view = baseViewHolder.getView(R$id.tag_ranking);
            TextView textView = (TextView) baseViewHolder.getView(R$id.tv_ranking);
            if (!this.f51908f) {
                view.setVisibility(8);
                return;
            }
            view.setVisibility(0);
            int i12 = layoutPosition + 1;
            textView.setText(String.valueOf(i12));
            if (i12 == 1) {
                i11 = R$drawable.bg_ranking_no1;
            } else if (i12 != 2) {
                i11 = i12 != 3 ? R$drawable.bg_ranking_normal : R$drawable.bg_ranking_no3;
            } else {
                i11 = R$drawable.bg_ranking_no2;
            }
            view.setBackgroundResource(i11);
        }

        /* JADX INFO: renamed from: z */
        private final void m66717z(BaseViewHolder baseViewHolder, UGCVideo uGCVideo) {
            RecyclerView recyclerView = (RecyclerView) baseViewHolder.getViewOrNull(R$id.recyclerTag);
            if (recyclerView == null) {
                return;
            }
            List<UGCVideoHashTag> filteredHashTags = uGCVideo.getFilteredHashTags();
            List<UGCVideoHashTag> list = filteredHashTags;
            if (list == null || list.isEmpty()) {
                recyclerView.setAdapter(null);
                recyclerView.setVisibility(8);
                return;
            }
            recyclerView.setVisibility(0);
            if (recyclerView.getLayoutManager() == null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(m36338k(), 0, false));
                recyclerView.setNestedScrollingEnabled(false);
            }
            Intrinsics.m97799e(filteredHashTags);
            recyclerView.setAdapter(new C14860f(filteredHashTags));
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public void mo22757b(BaseViewHolder holder, UGCContent data) {
            Intrinsics.m97802h(holder, "holder");
            Intrinsics.m97802h(data, "data");
            String topicType = data.getTopicType();
            C26866a.a aVar = C26866a.f81698a;
            C26866a.a.m104898f(aVar, C14839e.f51899N, "convert: position=" + holder.getLayoutPosition() + ", topicType=" + topicType, false, 4, null);
            if (Intrinsics.m97797c(topicType, "UGC_VIDEO")) {
                UGCVideo video = data.getVideo();
                if (video != null) {
                    m66715A(holder, video);
                } else {
                    C26866a.a.m104910z(aVar, C14839e.f51899N, "convert: UGC_VIDEO but video is null at position=" + holder.getLayoutPosition(), false, 4, null);
                }
            } else {
                C26866a.a.m104910z(aVar, C14839e.f51899N, "convert: unsupported topicType=" + topicType + " at position=" + holder.getLayoutPosition(), false, 4, null);
            }
            m66716y(holder);
        }

        /* JADX INFO: renamed from: C */
        public final void m66719C(boolean z11) {
            this.f51909g = z11;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: l */
        public int mo22758l() {
            return 2;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: m */
        public int mo22759m() {
            return R$layout.ugc_item_edu_film_list;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.e$c */
    public static final class c extends BaseItemProvider {

        /* JADX INFO: renamed from: e */
        private final C25646b f51910e;

        /* JADX INFO: renamed from: f */
        private final boolean f51911f;

        /* JADX INFO: renamed from: g */
        private boolean f51912g;

        public c(C25646b c25646b, boolean z11, boolean z12) {
            this.f51910e = c25646b;
            this.f51911f = z11;
            this.f51912g = z12;
        }

        /* JADX INFO: renamed from: y */
        private final void m66720y(BaseViewHolder baseViewHolder) {
            int i11;
            int layoutPosition = baseViewHolder.getLayoutPosition();
            View view = baseViewHolder.getView(R$id.tag_ranking);
            TextView textView = (TextView) baseViewHolder.getView(R$id.tv_ranking);
            if (!this.f51911f) {
                view.setVisibility(8);
                return;
            }
            view.setVisibility(0);
            int i12 = layoutPosition + 1;
            textView.setText(String.valueOf(i12));
            if (i12 == 1) {
                i11 = R$drawable.bg_ranking_no1;
            } else if (i12 != 2) {
                i11 = i12 != 3 ? R$drawable.bg_ranking_normal : R$drawable.bg_ranking_no3;
            } else {
                i11 = R$drawable.bg_ranking_no2;
            }
            view.setBackgroundResource(i11);
        }

        /* JADX INFO: renamed from: z */
        private final void m66721z(BaseViewHolder baseViewHolder, UGCVideo uGCVideo) {
            String url;
            String thumbnail;
            String title;
            UGCVideoHashTag uGCVideoHashTag;
            String avatar;
            String nickname;
            ShapeableImageView shapeableImageView = (ShapeableImageView) baseViewHolder.getView(R$id.iv_cover);
            C23860f.a aVar = C23860f.f72909a;
            C23860f.b bVarM94457m = aVar.m94457m(m36338k());
            Cover cover = uGCVideo.getCover();
            if (cover == null || (url = cover.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94470i = bVarM94457m.m94468g(url).m94470i(R$color.cl37);
            Cover cover2 = uGCVideo.getCover();
            if (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) {
                thumbnail = "";
            }
            bVarM94470i.m94473l(thumbnail).m94465d(shapeableImageView);
            int i11 = R$id.tv_title;
            String title2 = uGCVideo.getTitle();
            if (title2 == null) {
                title2 = "";
            }
            baseViewHolder.setText(i11, title2);
            baseViewHolder.setText(R$id.tv_views, AbstractC14564j.m65682c(uGCVideo.getWatchNum(), m36338k()));
            boolean z11 = true;
            if (this.f51912g) {
                baseViewHolder.setGone(R$id.iv_res_post_type, true);
                baseViewHolder.setVisible(R$id.iv_upload_user_icon, true);
                C23860f.b bVarM94457m2 = aVar.m94457m(m36338k());
                UGCVideoCreator creator = uGCVideo.getCreator();
                if (creator == null || (avatar = creator.getAvatar()) == null) {
                    avatar = "";
                }
                bVarM94457m2.m94468g(avatar).m94470i(R$drawable.icon_ugc_user_upload).m94465d((ImageView) baseViewHolder.getView(R$id.iv_upload_user_icon));
                int i12 = R$id.tv_type;
                UGCVideoCreator creator2 = uGCVideo.getCreator();
                if (creator2 == null || (nickname = creator2.getNickname()) == null) {
                    nickname = "";
                }
                baseViewHolder.setText(i12, nickname);
            } else {
                baseViewHolder.setVisible(R$id.iv_res_post_type, true);
                baseViewHolder.setGone(R$id.iv_upload_user_icon, true);
                UGCVideoTypeKt.m83628i((ImageView) baseViewHolder.getView(R$id.iv_res_post_type), uGCVideo, null, 4, null);
                List<UGCVideoHashTag> hashTags = uGCVideo.getHashTags();
                if (hashTags == null || (uGCVideoHashTag = (UGCVideoHashTag) CollectionsKt.m97362l0(hashTags, 0)) == null || (title = uGCVideoHashTag.getTitle()) == null) {
                    title = "";
                }
                if (title.length() == 0) {
                    baseViewHolder.setVisible(R$id.separator, false);
                    baseViewHolder.setText(R$id.tv_type, "");
                } else {
                    baseViewHolder.setVisible(R$id.separator, true);
                    baseViewHolder.setText(R$id.tv_type, title);
                }
            }
            baseViewHolder.setText(R$id.tv_duration, uGCVideo.getTimeOrCount(m36338k()));
            String corner = uGCVideo.getCorner();
            View view = baseViewHolder.getView(R$id.tag_audio);
            TextView textView = (TextView) baseViewHolder.getView(R$id.tv_audio_tag);
            if (corner != null && !StringsKt.m98160q0(corner)) {
                z11 = false;
            }
            view.setVisibility(z11 ? 8 : 0);
            String corner2 = uGCVideo.getCorner();
            textView.setText(corner2 != null ? corner2 : "");
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void mo22757b(BaseViewHolder holder, UGCContent data) {
            Intrinsics.m97802h(holder, "holder");
            Intrinsics.m97802h(data, "data");
            String topicType = data.getTopicType();
            C26866a.a aVar = C26866a.f81698a;
            C26866a.a.m104898f(aVar, C14839e.f51899N, "convert: position=" + holder.getLayoutPosition() + ", topicType=" + topicType, false, 4, null);
            if (Intrinsics.m97797c(topicType, "UGC_VIDEO")) {
                UGCVideo video = data.getVideo();
                if (video != null) {
                    m66721z(holder, video);
                } else {
                    C26866a.a.m104910z(aVar, C14839e.f51899N, "convert: UGC_VIDEO but video is null at position=" + holder.getLayoutPosition(), false, 4, null);
                }
            } else {
                C26866a.a.m104910z(aVar, C14839e.f51899N, "convert: unsupported topicType=" + topicType + " at position=" + holder.getLayoutPosition(), false, 4, null);
            }
            m66720y(holder);
        }

        /* JADX INFO: renamed from: B */
        public final void m66723B(boolean z11) {
            this.f51912g = z11;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: l */
        public int mo22758l() {
            return 1;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: m */
        public int mo22759m() {
            return R$layout.ugc_item_film_list;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14839e(List<UGCContent> data, C25646b c25646b, boolean z11, boolean z12) {
        super(data);
        Intrinsics.m97802h(data, "data");
        this.exposureHelper = c25646b;
        this.showNumberTh = z11;
        this.isEducationList = z12;
        c cVar = new c(c25646b, z11, z12);
        this.filmItemProvider = cVar;
        b bVar = new b(c25646b, z11, z12);
        this.eduFilmItemProvider = bVar;
        mo36107F1(cVar);
        mo36107F1(bVar);
    }

    public /* synthetic */ C14839e(List list, C25646b c25646b, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, c25646b, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter, com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: B0 */
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        C25646b c25646b = this.exposureHelper;
        if (c25646b != null) {
            RecyclerView.AbstractC4214m layoutManager = getRecyclerView().getLayoutManager();
            Intrinsics.m97800f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            c25646b.m100944h((LinearLayoutManager) layoutManager, bindingAdapterPosition, true);
        }
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends UGCContent> data, int position) {
        Intrinsics.m97802h(data, "data");
        return C5118o.f17608a.m23948i() ? 2 : 1;
    }

    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final boolean getIsEducationList() {
        return this.isEducationList;
    }

    /* JADX INFO: renamed from: R1 */
    public final void m66714R1(boolean z11) {
        this.isEducationList = z11;
        c cVar = this.filmItemProvider;
        if (cVar != null) {
            cVar.m66723B(z11);
        }
        b bVar = this.eduFilmItemProvider;
        if (bVar != null) {
            bVar.m66719C(z11);
        }
        notifyItemRangeChanged(0, getData().size());
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
