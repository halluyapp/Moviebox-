package com.transsion.moviedetail.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.tmc.integration.event.EventConstants;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.moviedetail.R$id;
import com.transsion.moviedetail.R$layout;
import com.transsion.moviedetail.fragment.ForYouFragment;
import com.transsion.moviedetail.viewmodel.MovieDetailViewModel;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.FirstFrame;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.RoomEntranceResponse;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.User;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mg.C25824a;
import p415fq.C23420k;
import p462hj.C23860f;
import p550kj.C24662i;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.moviedetail.adapter.i */
/* JADX INFO: loaded from: classes6.dex */
final class C15928i extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final ForYouFragment f54468e;

    /* JADX INFO: renamed from: f */
    private final String f54469f;

    /* JADX INFO: renamed from: g */
    private final MovieDetailViewModel f54470g;

    /* JADX INFO: renamed from: h */
    private final MovieDetailViewModel f54471h;

    /* JADX INFO: renamed from: com.transsion.moviedetail.adapter.i$a */
    @Metadata(m97099d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m97100d2 = {"Lcom/transsion/moviedetail/adapter/i$a;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "", "pageName", "<init>", "(Ljava/lang/String;)V", WebConstants.FIELD_ITEM, "", RequestParameters.POSITION, "", "G1", "(Lcom/transsion/moviedetailapi/bean/PostSubjectItem;I)V", "holder", "D1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "F", "Ljava/lang/String;", "G", "I", "coverSize", "MovieDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    @SourceDebugExtension
    public static final class a extends BaseQuickAdapter {

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        private final String pageName;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        private final int coverSize;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String pageName) {
            super(R$layout.movie_detail_item_for_you_post_item, null, 2, null);
            Intrinsics.m97802h(pageName, "pageName");
            this.pageName = pageName;
            this.coverSize = AbstractC23384a.m92908b(112);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: E1 */
        public static final void m70193E1(PostSubjectItem postSubjectItem, BaseViewHolder baseViewHolder, a aVar, View view) {
            String userId;
            String mediaType;
            String subjectId;
            String string;
            String groupId;
            Integer subjectType;
            Group group = postSubjectItem.getGroup();
            Navigator.m61845x(TheRouter.m61773c("/room/detail").m61857K("id", group != null ? group.getGroupId() : null).m61872z("need_start_room_home", false), baseViewHolder.itemView.getContext(), null, 2, null);
            Pair pairM97108a = TuplesKt.m97108a(EventConstants.KEY_SOURCE, "for_you");
            Pair pairM97108a2 = TuplesKt.m97108a("module_name", "group");
            User user = postSubjectItem.getUser();
            String str = "";
            if (user == null || (userId = user.getUserId()) == null) {
                userId = "";
            }
            Pair pairM97108a3 = TuplesKt.m97108a("user_id", userId);
            String postId = postSubjectItem.getPostId();
            if (postId == null) {
                postId = "";
            }
            Pair pairM97108a4 = TuplesKt.m97108a("post_id", postId);
            Media media = postSubjectItem.getMedia();
            if (media == null || (mediaType = media.getMediaType()) == null) {
                mediaType = "";
            }
            Pair pairM97108a5 = TuplesKt.m97108a("post_media_type", mediaType);
            Subject subject = postSubjectItem.getSubject();
            if (subject == null || (subjectId = subject.getSubjectId()) == null) {
                subjectId = "";
            }
            Pair pairM97108a6 = TuplesKt.m97108a("subject_id", subjectId);
            Subject subject2 = postSubjectItem.getSubject();
            if (subject2 == null || (subjectType = subject2.getSubjectType()) == null || (string = subjectType.toString()) == null) {
                string = "";
            }
            Pair pairM97108a7 = TuplesKt.m97108a("subject_type", string);
            Pair pairM97108a8 = TuplesKt.m97108a("is_cache_post", String.valueOf(postSubjectItem.isRoomCache()));
            Group group2 = postSubjectItem.getGroup();
            if (group2 != null && (groupId = group2.getGroupId()) != null) {
                str = groupId;
            }
            C24662i.f75350a.m96881p(aVar.pageName, MapsKt.m97578m(pairM97108a, pairM97108a2, pairM97108a3, pairM97108a4, pairM97108a5, pairM97108a6, pairM97108a7, pairM97108a8, TuplesKt.m97108a("group_id", str), TuplesKt.m97108a("ops", postSubjectItem.getOps())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: F1 */
        public static final void m70194F1(a aVar, PostSubjectItem postSubjectItem, BaseViewHolder baseViewHolder, View view) {
            aVar.m70195G1(postSubjectItem, baseViewHolder.getBindingAdapterPosition());
        }

        /* JADX INFO: renamed from: G1 */
        private final void m70195G1(PostSubjectItem item, int position) {
            String userId;
            String groupId;
            String subjectId;
            String value;
            Integer subjectType;
            String string;
            String postId = item.getPostId();
            if (postId == null) {
                return;
            }
            String postId2 = item.getPostId();
            String str = "";
            if (postId2 == null) {
                postId2 = "";
            }
            Pair pairM97108a = TuplesKt.m97108a("post_id", postId2);
            Pair pairM97108a2 = TuplesKt.m97108a(RequestParameters.POSITION, String.valueOf(position));
            Pair pairM97108a3 = TuplesKt.m97108a(EventConstants.KEY_SOURCE, "for_you");
            Pair pairM97108a4 = TuplesKt.m97108a("module_name", WebConstants.FIELD_ITEM);
            Pair pairM97108a5 = TuplesKt.m97108a("is_cache_post", String.valueOf(item.isRoomCache()));
            User user = item.getUser();
            if (user == null || (userId = user.getUserId()) == null) {
                userId = "";
            }
            Pair pairM97108a6 = TuplesKt.m97108a("user_id", userId);
            Group group = item.getGroup();
            if (group == null || (groupId = group.getGroupId()) == null) {
                groupId = "";
            }
            Pair pairM97108a7 = TuplesKt.m97108a("group_id", groupId);
            Subject subject = item.getSubject();
            if (subject == null || (subjectId = subject.getSubjectId()) == null) {
                subjectId = "";
            }
            Pair pairM97108a8 = TuplesKt.m97108a("subject_id", subjectId);
            Subject subject2 = item.getSubject();
            if (subject2 != null && (subjectType = subject2.getSubjectType()) != null && (string = subjectType.toString()) != null) {
                str = string;
            }
            Pair pairM97108a9 = TuplesKt.m97108a("subject_type", str);
            Media media = item.getMedia();
            if (media == null || (value = media.getMediaType()) == null) {
                value = MediaType.TEXT.getValue();
            }
            C24662i.f75350a.m96881p(this.pageName, MapsKt.m97578m(pairM97108a, pairM97108a2, pairM97108a3, pairM97108a4, pairM97108a5, pairM97108a6, pairM97108a7, pairM97108a8, pairM97108a9, TuplesKt.m97108a("post_media_type", value), TuplesKt.m97108a("ops", item.getOps())));
            C23420k.f71413a.m92980h(postId, item.getOps(), this.pageName, true);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
        public void mo36106F(final BaseViewHolder holder, final PostSubjectItem item) {
            Pair pair;
            String url;
            FirstFrame firstFrame;
            String thumbnail;
            Cover cover;
            Cover cover2;
            String avatar;
            List<Image> image;
            Image image2;
            List<Image> image3;
            Image image4;
            Intrinsics.m97802h(holder, "holder");
            Intrinsics.m97802h(item, "item");
            Media media = item.getMedia();
            String mediaType = media != null ? media.getMediaType() : null;
            String str = "";
            if (Intrinsics.m97797c(mediaType, MediaType.IMAGE.getValue())) {
                Media media2 = item.getMedia();
                String url2 = (media2 == null || (image3 = media2.getImage()) == null || (image4 = (Image) CollectionsKt.m97361k0(image3)) == null) ? null : image4.getUrl();
                Media media3 = item.getMedia();
                pair = new Pair(url2, (media3 == null || (image = media3.getImage()) == null || (image2 = (Image) CollectionsKt.m97361k0(image)) == null) ? null : image2.getThumbnail());
            } else if (Intrinsics.m97797c(mediaType, MediaType.VIDEO.getValue())) {
                Media media4 = item.getMedia();
                if (media4 == null || (cover2 = media4.getCover()) == null || (url = cover2.getUrl()) == null) {
                    Media media5 = item.getMedia();
                    url = (media5 == null || (firstFrame = media5.getFirstFrame()) == null) ? null : firstFrame.getUrl();
                }
                Media media6 = item.getMedia();
                if (media6 == null || (cover = media6.getCover()) == null || (thumbnail = cover.getThumbnail()) == null) {
                    thumbnail = "";
                }
                pair = new Pair(url, thumbnail);
            } else {
                pair = null;
            }
            if (pair != null) {
                C23860f.b bVarM94457m = C23860f.f72909a.m94457m(getContext());
                String str2 = (String) pair.getFirst();
                if (str2 == null) {
                    str2 = "";
                }
                C23860f.b bVarM94464c = bVarM94457m.m94468g(str2).m94474m(this.coverSize).m94464c(this.coverSize);
                String str3 = (String) pair.getSecond();
                if (str3 == null) {
                    str3 = "";
                }
                bVarM94464c.m94473l(str3).m94465d((ImageView) holder.getView(R$id.ivCover));
            }
            View view = holder.getView(R$id.ivVideoPlay);
            Media media7 = item.getMedia();
            view.setVisibility(Intrinsics.m97797c(media7 != null ? media7.getMediaType() : null, MediaType.VIDEO.getValue()) ? 0 : 8);
            TextView textView = (TextView) holder.getView(R$id.tvRoomTitle);
            Group group = item.getGroup();
            textView.setText(group != null ? group.getName() : null);
            C23860f.b bVarM94457m2 = C23860f.f72909a.m94457m(getContext());
            Group group2 = item.getGroup();
            if (group2 != null && (avatar = group2.getAvatar()) != null) {
                str = avatar;
            }
            bVarM94457m2.m94468g(str).m94474m(AbstractC23384a.m92908b(24)).m94464c(AbstractC23384a.m92908b(24)).m94465d((ImageView) holder.getView(R$id.ivRoomCover));
            holder.getView(R$id.vRoomInfo).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.adapter.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C15928i.a.m70193E1(item, holder, this, view2);
                }
            });
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.adapter.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C15928i.a.m70194F1(this.f54465a, item, holder, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.adapter.i$b */
    static final class b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f54474a;

        b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f54474a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f54474a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC3189c0) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m97797c(mo6065a(), ((FunctionAdapter) obj).mo6065a());
            }
            return false;
        }

        public final int hashCode() {
            return mo6065a().hashCode();
        }

        @Override // androidx.p1004lifecycle.InterfaceC3189c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f54474a.invoke(obj);
        }
    }

    public C15928i(ForYouFragment fragment, String pageName, MovieDetailViewModel movieDetailViewModel) {
        Intrinsics.m97802h(fragment, "fragment");
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(movieDetailViewModel, "movieDetailViewModel");
        this.f54468e = fragment;
        this.f54469f = pageName;
        this.f54470g = movieDetailViewModel;
        this.f54471h = movieDetailViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final Unit m70186B(BaseViewHolder baseViewHolder, a aVar, C15928i c15928i, RoomEntranceResponse roomEntranceResponse) {
        List<PostSubjectItem> posts;
        C26866a.a.m104898f(C26866a.f81698a, "MovieDetailViewModel", "ForYouFragment 推荐帖子-开始渲染", false, 4, null);
        baseViewHolder.setText(R$id.tvTitle, roomEntranceResponse != null ? roomEntranceResponse.getTitle() : null);
        List<PostSubjectItem> posts2 = roomEntranceResponse != null ? roomEntranceResponse.getPosts() : null;
        if (posts2 != null && !posts2.isEmpty()) {
            aVar.mo36201n1(roomEntranceResponse != null ? roomEntranceResponse.getPosts() : null);
            if (roomEntranceResponse != null && (posts = roomEntranceResponse.getPosts()) != null) {
                int i11 = 0;
                for (Object obj : posts) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt.m97515u();
                    }
                    PostSubjectItem postSubjectItem = (PostSubjectItem) obj;
                    Pair pairM97108a = TuplesKt.m97108a(EventConstants.KEY_SOURCE, "for_you");
                    String postId = postSubjectItem.getPostId();
                    if (postId == null) {
                        postId = "";
                    }
                    C24662i.f75350a.m96872D(c15928i.f54469f, MapsKt.m97578m(pairM97108a, TuplesKt.m97108a("post_id", postId), TuplesKt.m97108a(RequestParameters.POSITION, String.valueOf(i11)), TuplesKt.m97108a("module_name", WebConstants.FIELD_ITEM), TuplesKt.m97108a("ops", postSubjectItem.getOps())));
                    i11 = i12;
                }
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m70187C(C15928i c15928i, View view) {
        C24662i.f75350a.m96881p(c15928i.f54469f, MapsKt.m97578m(TuplesKt.m97108a(EventConstants.KEY_SOURCE, "for_you"), TuplesKt.m97108a("module_name", "explore")));
        C23420k.m92971i(C23420k.f71413a, null, null, c15928i.f54469f, true, 3, null);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo22757b(final BaseViewHolder holder, Subject item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        C26866a.a.m104898f(C26866a.f81698a, "MovieDetailViewModel", "ForYouFragment 推荐帖子 item convert ", false, 4, null);
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.C4232b) {
            ((StaggeredGridLayoutManager.C4232b) layoutParams).m21016c(true);
        }
        final a aVar = new a(this.f54469f);
        RecyclerView recyclerView = (RecyclerView) holder.getView(R$id.recyclerView);
        recyclerView.addItemDecoration(new C25824a(AbstractC23384a.m92908b(6), 0, 0, 0));
        recyclerView.setLayoutManager(new NpaGridLayoutManager(recyclerView.getContext(), 3));
        recyclerView.setAdapter(aVar);
        this.f54471h.m70912I().m14851j(this.f54468e, new b(new Function1() { // from class: com.transsion.moviedetail.adapter.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C15928i.m70186B(holder, aVar, this, (RoomEntranceResponse) obj);
            }
        }));
        ((TextView) holder.getView(R$id.tvMore)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.moviedetail.adapter.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C15928i.m70187C(this.f54461a, view);
            }
        });
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return C15922c.f54456I;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.movie_detail_item_for_you_recommend_posts;
    }
}
