package com.transsion.home.adapter.operateUGC.provider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5806y;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.cloud.tmc.integration.constants.IntegrationConstants;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.noober.background.view.BLConstraintLayout;
import com.p282tn.lib.view.layoutmanager.NpaGridLayoutManager;
import com.transsion.baseui.util.TimeUtilKt;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.R$string;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.bean.RoomEntranceResponse;
import com.transsion.home.fragment.tab.BaseHomeSubFragment;
import com.transsion.home.viewmodel.TrendingUGCViewModel;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.FirstFrame;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.User;
import com.transsion.moviedetailapi.bean.Video;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import mg.C25824a;
import ml.AbstractC25888b;
import ng.AbstractC26006c;
import p415fq.C23420k;
import p462hj.C23860f;
import p550kj.C24662i;
import p552kl.C24686k0;

/* JADX INFO: loaded from: classes5.dex */
public final class RoomUGCProvider extends BaseItemProvider {

    /* JADX INFO: renamed from: h */
    public static final C14870a f51992h = new C14870a(null);

    /* JADX INFO: renamed from: i */
    public static final int f51993i = 8;

    /* JADX INFO: renamed from: e */
    private final int f51994e;

    /* JADX INFO: renamed from: f */
    private final BaseHomeSubFragment f51995f;

    /* JADX INFO: renamed from: g */
    private final TrendingUGCViewModel f51996g;

    @Metadata(m97099d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m97100d2 = {"Lcom/transsion/home/adapter/operateUGC/provider/RoomUGCProvider$PostAdapter;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "", "tabId", "Lcom/transsion/home/bean/OperateItem;", "operateItem", "<init>", "(ILcom/transsion/home/bean/OperateItem;)V", "", "data", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "G", "I", "PostItemProvider", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    public static final class PostAdapter extends BaseProviderMultiAdapter<PostSubjectItem> {

        /* JADX INFO: renamed from: H */
        public static final int f51997H = 8;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        private final int tabId;

        public static final class PostItemProvider extends BaseItemProvider {

            /* JADX INFO: renamed from: e */
            private final int f51999e;

            /* JADX INFO: renamed from: f */
            private final OperateItem f52000f;

            /* JADX INFO: renamed from: g */
            private final int f52001g;

            /* JADX INFO: renamed from: h */
            private final int f52002h;

            @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m97100d2 = {"Lcom/transsion/home/adapter/operateUGC/provider/RoomUGCProvider$PostAdapter$PostItemProvider$PostItemVH;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lkl/k0;", "viewBinding", "<init>", "(Lkl/k0;)V", "a", "Lkl/k0;", "f", "()Lkl/k0;", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
            public static final class PostItemVH extends BaseViewHolder {

                /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                private final C24686k0 viewBinding;

                /* JADX WARN: Illegal instructions before constructor call */
                public PostItemVH(C24686k0 viewBinding) {
                    Intrinsics.m97802h(viewBinding, "viewBinding");
                    BLConstraintLayout root = viewBinding.getRoot();
                    Intrinsics.m97801g(root, "getRoot(...)");
                    super(root);
                    this.viewBinding = viewBinding;
                }

                /* JADX INFO: renamed from: f, reason: from getter */
                public final C24686k0 getViewBinding() {
                    return this.viewBinding;
                }
            }

            public PostItemProvider(int i11, OperateItem operateItem) {
                this.f51999e = i11;
                this.f52000f = operateItem;
                int iM27489e = (AbstractC5806y.m27489e() - AbstractC23384a.m92908b(40)) / 3;
                this.f52001g = iM27489e;
                this.f52002h = (iM27489e * 150) / 107;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: A */
            public static final void m66804A(PostItemProvider postItemProvider, PostSubjectItem postSubjectItem, PostItemVH postItemVH, View view) {
                postItemProvider.m66805C(postSubjectItem, postItemVH.getAdapterPosition());
            }

            /* JADX INFO: renamed from: C */
            private final void m66805C(PostSubjectItem postSubjectItem, int i11) {
                m66806D(i11, this.f52000f, postSubjectItem);
                C23420k.m92972k(C23420k.f71413a, postSubjectItem, postSubjectItem.getOps(), "UgcTrending", false, 8, null);
            }

            /* JADX INFO: renamed from: D */
            private final void m66806D(int i11, OperateItem operateItem, PostSubjectItem postSubjectItem) {
                String userId;
                String groupId;
                String subjectId;
                String string;
                String value;
                String ops;
                Integer subjectType;
                String postId = postSubjectItem.getPostId();
                String str = "";
                if (postId == null) {
                    postId = "";
                }
                Pair pairM97108a = TuplesKt.m97108a("post_id", postId);
                Pair pairM97108a2 = TuplesKt.m97108a(RequestParameters.POSITION, String.valueOf(i11));
                Pair pairM97108a3 = TuplesKt.m97108a("module_name", WebConstants.FIELD_ITEM);
                Pair pairM97108a4 = TuplesKt.m97108a("is_cache_post", String.valueOf(postSubjectItem.isRoomCache()));
                User user = postSubjectItem.getUser();
                if (user == null || (userId = user.getUserId()) == null) {
                    userId = "";
                }
                Pair pairM97108a5 = TuplesKt.m97108a("user_id", userId);
                Group group = postSubjectItem.getGroup();
                if (group == null || (groupId = group.getGroupId()) == null) {
                    groupId = "";
                }
                Pair pairM97108a6 = TuplesKt.m97108a("group_id", groupId);
                Subject subject = postSubjectItem.getSubject();
                if (subject == null || (subjectId = subject.getSubjectId()) == null) {
                    subjectId = "";
                }
                Pair pairM97108a7 = TuplesKt.m97108a("subject_id", subjectId);
                Subject subject2 = postSubjectItem.getSubject();
                if (subject2 == null || (subjectType = subject2.getSubjectType()) == null || (string = subjectType.toString()) == null) {
                    string = "";
                }
                Pair pairM97108a8 = TuplesKt.m97108a("subject_type", string);
                Pair pairM97108a9 = TuplesKt.m97108a("builtin", postSubjectItem.getBuiltIn() ? "1" : "0");
                Media media = postSubjectItem.getMedia();
                if (media == null || (value = media.getMediaType()) == null) {
                    value = MediaType.TEXT.getValue();
                }
                Pair pairM97108a10 = TuplesKt.m97108a("post_media_type", value);
                Pair pairM97108a11 = TuplesKt.m97108a("tabId", String.valueOf(this.f51999e));
                if (operateItem == null || (ops = operateItem.getOps()) == null) {
                    String ops2 = postSubjectItem.getOps();
                    if (ops2 != null) {
                        str = ops2;
                    }
                } else {
                    str = ops;
                }
                Map mapM = MapsKt.m97578m(pairM97108a, pairM97108a2, pairM97108a3, pairM97108a4, pairM97108a5, pairM97108a6, pairM97108a7, pairM97108a8, pairM97108a9, pairM97108a10, pairM97108a11, TuplesKt.m97108a("ops", str));
                if (operateItem != null) {
                    AbstractC25888b.m101678a(operateItem, mapM);
                }
                C24662i.f75350a.m96881p("UgcTrending", mapM);
            }

            @Override // com.chad.library.adapter.base.provider.BaseItemProvider
            /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
            public PostItemVH mo36342r(ViewGroup parent, int i11) {
                Intrinsics.m97802h(parent, "parent");
                C24686k0 c24686k0M96963c = C24686k0.m96963c(LayoutInflater.from(m36338k()), parent, false);
                Intrinsics.m97801g(c24686k0M96963c, "inflate(...)");
                ShapeableImageView ivCover = c24686k0M96963c.f75489b;
                Intrinsics.m97801g(ivCover, "ivCover");
                ViewGroup.LayoutParams layoutParams = ivCover.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = this.f52002h;
                ivCover.setLayoutParams(layoutParams);
                return new PostItemVH(c24686k0M96963c);
            }

            @Override // com.chad.library.adapter.base.provider.BaseItemProvider
            /* JADX INFO: renamed from: l */
            public int mo22758l() {
                return 1;
            }

            @Override // com.chad.library.adapter.base.provider.BaseItemProvider
            /* JADX INFO: renamed from: m */
            public int mo22759m() {
                return R$layout.item_ugc_vertical_content;
            }

            /* JADX WARN: Code duplicated, block: B:61:0x00ea  */
            /* JADX WARN: Code duplicated, block: B:70:0x0119  */
            /* JADX WARN: Code duplicated, block: B:79:0x0138  */
            /* JADX WARN: Code duplicated, block: B:81:0x014b  */
            @Override // com.chad.library.adapter.base.provider.BaseItemProvider
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public void mo22757b(BaseViewHolder helper, final PostSubjectItem item) {
                String title;
                Pair pair;
                FirstFrame firstFrame;
                String thumbnail;
                Cover cover;
                Cover cover2;
                String url;
                String str;
                Media media;
                int iIntValue;
                List<Video> video;
                Video video2;
                Integer duration;
                String str2;
                List<Image> image;
                Image image2;
                List<Image> image3;
                Image image4;
                Intrinsics.m97802h(helper, "helper");
                Intrinsics.m97802h(item, "item");
                final PostItemVH postItemVH = (PostItemVH) helper;
                postItemVH.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.operateUGC.provider.b0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RoomUGCProvider.PostAdapter.PostItemProvider.m66804A(this.f52011a, item, postItemVH, view);
                    }
                });
                String content = item.getContent();
                String str3 = "";
                if (content == null || content.length() == 0) {
                    title = item.getTitle();
                    if (title == null) {
                        title = "";
                    }
                } else {
                    title = item.getContent();
                }
                postItemVH.getViewBinding().f75492e.setText(title);
                Media media2 = item.getMedia();
                Pair pair2 = null;
                thumbnail = null;
                thumbnail = null;
                String thumbnail2 = null;
                url = null;
                String url2 = null;
                String mediaType = media2 != null ? media2.getMediaType() : null;
                if (!Intrinsics.m97797c(mediaType, MediaType.IMAGE.getValue())) {
                    if (Intrinsics.m97797c(mediaType, MediaType.VIDEO.getValue())) {
                        Media media3 = item.getMedia();
                        if (media3 == null || (cover2 = media3.getCover()) == null || (url = cover2.getUrl()) == null) {
                            Media media4 = item.getMedia();
                            if (media4 != null && (firstFrame = media4.getFirstFrame()) != null) {
                                url2 = firstFrame.getUrl();
                            }
                        } else {
                            url2 = url;
                        }
                        Media media5 = item.getMedia();
                        if (media5 == null || (cover = media5.getCover()) == null || (thumbnail = cover.getThumbnail()) == null) {
                            thumbnail = "";
                        }
                        pair = new Pair(url2, thumbnail);
                    }
                    C23860f.b bVarM94457m = C23860f.f72909a.m94457m(m36338k());
                    if (pair2 != null || (str = (String) pair2.getFirst()) == null) {
                        str = "";
                    }
                    C23860f.b bVarM94474m = bVarM94457m.m94468g(str).m94474m(this.f52001g);
                    if (pair2 != null && (str2 = (String) pair2.getSecond()) != null) {
                        str3 = str2;
                    }
                    C23860f.b bVarM94473l = bVarM94474m.m94473l(str3);
                    ShapeableImageView ivCover = postItemVH.getViewBinding().f75489b;
                    Intrinsics.m97801g(ivCover, "ivCover");
                    bVarM94473l.m94465d(ivCover);
                    if (item.isVideo()) {
                        postItemVH.getViewBinding().f75491d.setText(Utils.m27275a().getString(R$string.pic));
                        return;
                    }
                    media = item.getMedia();
                    if (media != null || (video = media.getVideo()) == null || (video2 = (Video) CollectionsKt.m97361k0(video)) == null || (duration = video2.getDuration()) == null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = duration.intValue();
                    }
                    postItemVH.getViewBinding().f75491d.setText(TimeUtilKt.m65649a(Integer.valueOf(iIntValue)));
                }
                Media media6 = item.getMedia();
                String url3 = (media6 == null || (image3 = media6.getImage()) == null || (image4 = (Image) CollectionsKt.m97361k0(image3)) == null) ? null : image4.getUrl();
                Media media7 = item.getMedia();
                if (media7 != null && (image = media7.getImage()) != null && (image2 = (Image) CollectionsKt.m97361k0(image)) != null) {
                    thumbnail2 = image2.getThumbnail();
                }
                pair = new Pair(url3, thumbnail2);
                pair2 = pair;
                C23860f.b bVarM94457m2 = C23860f.f72909a.m94457m(m36338k());
                if (pair2 != null) {
                    str = "";
                } else {
                    str = "";
                }
                C23860f.b bVarM94474m2 = bVarM94457m2.m94468g(str).m94474m(this.f52001g);
                if (pair2 != null) {
                    str3 = str2;
                }
                C23860f.b bVarM94473l2 = bVarM94474m2.m94473l(str3);
                ShapeableImageView ivCover2 = postItemVH.getViewBinding().f75489b;
                Intrinsics.m97801g(ivCover2, "ivCover");
                bVarM94473l2.m94465d(ivCover2);
                if (item.isVideo()) {
                    postItemVH.getViewBinding().f75491d.setText(Utils.m27275a().getString(R$string.pic));
                    return;
                }
                media = item.getMedia();
                if (media != null) {
                    iIntValue = 0;
                } else {
                    iIntValue = 0;
                }
                postItemVH.getViewBinding().f75491d.setText(TimeUtilKt.m65649a(Integer.valueOf(iIntValue)));
            }
        }

        public PostAdapter(int i11, OperateItem operateItem) {
            super(null, 1, null);
            this.tabId = i11;
            mo36107F1(new PostItemProvider(i11, operateItem));
        }

        @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
        /* JADX INFO: renamed from: N1 */
        protected int mo36112N1(List<? extends PostSubjectItem> data, int position) {
            Intrinsics.m97802h(data, "data");
            return data.get(position).isMore() ? 2 : 1;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.provider.RoomUGCProvider$a */
    public static final class C14870a {
        private C14870a() {
        }

        public /* synthetic */ C14870a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.operateUGC.provider.RoomUGCProvider$b */
    static final class C14871b implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f52004a;

        C14871b(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f52004a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f52004a;
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
            this.f52004a.invoke(obj);
        }
    }

    public RoomUGCProvider(int i11, BaseHomeSubFragment fragment, TrendingUGCViewModel trendingUGCViewModel) {
        Intrinsics.m97802h(fragment, "fragment");
        this.f51994e = i11;
        this.f51995f = fragment;
        this.f51996g = trendingUGCViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final Unit m66794D(RoomUGCProvider roomUGCProvider, OperateItem operateItem) {
        roomUGCProvider.m66799I(operateItem);
        C23420k.m92971i(C23420k.f71413a, null, null, "UgcTrending", false, 11, null);
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m66795E(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m66796F(Function0 function0, View view) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final Unit m66797G(OperateItem operateItem, BaseViewHolder baseViewHolder, PostAdapter postAdapter, RoomUGCProvider roomUGCProvider, RoomEntranceResponse roomEntranceResponse) {
        operateItem.setTitle(roomEntranceResponse.getTitle());
        baseViewHolder.setText(R$id.tvProviderVerticalTitle, roomEntranceResponse.getTitle());
        List<PostSubjectItem> posts = roomEntranceResponse.getPosts();
        if (posts == null || posts.isEmpty()) {
            View itemView = baseViewHolder.itemView;
            Intrinsics.m97801g(itemView, "itemView");
            AbstractC26006c.m102054g(itemView);
        } else {
            View itemView2 = baseViewHolder.itemView;
            Intrinsics.m97801g(itemView2, "itemView");
            AbstractC26006c.m102058k(itemView2);
            ArrayList arrayList = new ArrayList();
            List<PostSubjectItem> posts2 = roomEntranceResponse.getPosts();
            Intrinsics.m97799e(posts2);
            arrayList.addAll(posts2);
            postAdapter.mo36201n1(arrayList);
            int i11 = 0;
            for (Object obj : arrayList) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                roomUGCProvider.m66800J(i11, operateItem, (PostSubjectItem) obj);
                i11 = i12;
            }
        }
        return Unit.f75682a;
    }

    /* JADX INFO: renamed from: H */
    private final void m66798H(OperateItem operateItem) {
        List<Object> data;
        Pair pairM97108a = TuplesKt.m97108a("module_name", IntegrationConstants.NAVIGATION_BAR_ALL_ACTION);
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        Pair pairM97108a2 = TuplesKt.m97108a(RequestParameters.POSITION, String.valueOf((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? null : Integer.valueOf(data.indexOf(operateItem))));
        Pair pairM97108a3 = TuplesKt.m97108a("tabId", String.valueOf(this.f51994e));
        String title = operateItem.getTitle();
        if (title == null) {
            title = "";
        }
        Map mapM = MapsKt.m97578m(pairM97108a, pairM97108a2, pairM97108a3, TuplesKt.m97108a(CampaignEx.JSON_KEY_TITLE, title));
        AbstractC25888b.m101678a(operateItem, mapM);
        C24662i.f75350a.m96872D("UgcTrending", mapM);
    }

    /* JADX INFO: renamed from: I */
    private final void m66799I(OperateItem operateItem) {
        List<Object> data;
        Pair pairM97108a = TuplesKt.m97108a("module_name", IntegrationConstants.NAVIGATION_BAR_ALL_ACTION);
        BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
        Pair pairM97108a2 = TuplesKt.m97108a(RequestParameters.POSITION, String.valueOf((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? null : Integer.valueOf(data.indexOf(operateItem))));
        Pair pairM97108a3 = TuplesKt.m97108a("tabId", String.valueOf(this.f51994e));
        String title = operateItem.getTitle();
        if (title == null) {
            title = "";
        }
        Map mapM = MapsKt.m97578m(pairM97108a, pairM97108a2, pairM97108a3, TuplesKt.m97108a(CampaignEx.JSON_KEY_TITLE, title));
        AbstractC25888b.m101678a(operateItem, mapM);
        C24662i.f75350a.m96881p("UgcTrending", mapM);
    }

    /* JADX INFO: renamed from: J */
    private final void m66800J(int i11, OperateItem operateItem, PostSubjectItem postSubjectItem) {
        String userId;
        String groupId;
        String subjectId;
        String string;
        String value;
        String ops;
        Integer subjectType;
        String postId = postSubjectItem.getPostId();
        String str = "";
        if (postId == null) {
            postId = "";
        }
        Pair pairM97108a = TuplesKt.m97108a("post_id", postId);
        Pair pairM97108a2 = TuplesKt.m97108a(RequestParameters.POSITION, String.valueOf(i11));
        Pair pairM97108a3 = TuplesKt.m97108a("module_name", WebConstants.FIELD_ITEM);
        Pair pairM97108a4 = TuplesKt.m97108a("is_cache_post", String.valueOf(postSubjectItem.isRoomCache()));
        User user = postSubjectItem.getUser();
        if (user == null || (userId = user.getUserId()) == null) {
            userId = "";
        }
        Pair pairM97108a5 = TuplesKt.m97108a("user_id", userId);
        Group group = postSubjectItem.getGroup();
        if (group == null || (groupId = group.getGroupId()) == null) {
            groupId = "";
        }
        Pair pairM97108a6 = TuplesKt.m97108a("group_id", groupId);
        Subject subject = postSubjectItem.getSubject();
        if (subject == null || (subjectId = subject.getSubjectId()) == null) {
            subjectId = "";
        }
        Pair pairM97108a7 = TuplesKt.m97108a("subject_id", subjectId);
        Subject subject2 = postSubjectItem.getSubject();
        if (subject2 == null || (subjectType = subject2.getSubjectType()) == null || (string = subjectType.toString()) == null) {
            string = "";
        }
        Pair pairM97108a8 = TuplesKt.m97108a("subject_type", string);
        Pair pairM97108a9 = TuplesKt.m97108a("builtin", postSubjectItem.getBuiltIn() ? "1" : "0");
        Media media = postSubjectItem.getMedia();
        if (media == null || (value = media.getMediaType()) == null) {
            value = MediaType.TEXT.getValue();
        }
        Pair pairM97108a10 = TuplesKt.m97108a("post_media_type", value);
        Pair pairM97108a11 = TuplesKt.m97108a("tabId", String.valueOf(this.f51994e));
        if (operateItem == null || (ops = operateItem.getOps()) == null) {
            String ops2 = postSubjectItem.getOps();
            if (ops2 != null) {
                str = ops2;
            }
        } else {
            str = ops;
        }
        Map mapM = MapsKt.m97578m(pairM97108a, pairM97108a2, pairM97108a3, pairM97108a4, pairM97108a5, pairM97108a6, pairM97108a7, pairM97108a8, pairM97108a9, pairM97108a10, pairM97108a11, TuplesKt.m97108a("ops", str));
        if (operateItem != null) {
            AbstractC25888b.m101678a(operateItem, mapM);
        }
        C24662i.f75350a.m96872D("UgcTrending", mapM);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void mo22757b(final BaseViewHolder helper, final OperateItem item) {
        C3187b0 c3187b0M69036B;
        C3187b0 c3187b0M69036B2;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        final Function0 function0 = new Function0() { // from class: com.transsion.home.adapter.operateUGC.provider.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomUGCProvider.m66794D(this.f52098a, item);
            }
        };
        ((TextView) helper.getView(R$id.tvProviderVerticalTitle)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.operateUGC.provider.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RoomUGCProvider.m66795E(function0, view);
            }
        });
        ((TextView) helper.getView(R$id.tvProviderVerticalMore)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.operateUGC.provider.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RoomUGCProvider.m66796F(function0, view);
            }
        });
        m66798H(item);
        String title = item.getTitle();
        if (title != null && title.length() != 0) {
            ((TextView) helper.getView(R$id.tvProviderVerticalTitle)).setText(item.getTitle());
        }
        final PostAdapter postAdapter = new PostAdapter(this.f51994e, item);
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.rvProviderVerticalPost);
        recyclerView.setLayoutManager(new NpaGridLayoutManager(recyclerView.getContext(), 3));
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C25824a(AbstractC23384a.m92908b(8), 0, 0, 0));
        }
        recyclerView.setAdapter(postAdapter);
        TrendingUGCViewModel trendingUGCViewModel = this.f51996g;
        if (trendingUGCViewModel != null && (c3187b0M69036B2 = trendingUGCViewModel.m69036B()) != null) {
            c3187b0M69036B2.m14857p(this.f51995f);
        }
        TrendingUGCViewModel trendingUGCViewModel2 = this.f51996g;
        if (trendingUGCViewModel2 == null || (c3187b0M69036B = trendingUGCViewModel2.m69036B()) == null) {
            return;
        }
        c3187b0M69036B.m14851j(this.f51995f, new C14871b(new Function1() { // from class: com.transsion.home.adapter.operateUGC.provider.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomUGCProvider.m66797G(item, helper, postAdapter, this, (RoomEntranceResponse) obj);
            }
        }));
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.ROOM.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.provider_ugc_vertical_content;
    }
}
