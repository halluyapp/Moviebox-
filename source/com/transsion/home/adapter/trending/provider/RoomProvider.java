package com.transsion.home.adapter.trending.provider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.C3227v0;
import androidx.p1004lifecycle.C3231x0;
import androidx.p1004lifecycle.InterfaceC3189c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.noober.background.view.BLConstraintLayout;
import com.p282tn.lib.widget.TnTextView;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baselib.exposure.ExposureType;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.bean.RoomEntranceResponse;
import com.transsion.home.fragment.tab.BaseHomeSubFragment;
import com.transsion.home.viewmodel.TrendingViewModel;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.FirstFrame;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.postdetail.helper.C16768a;
import com.transsion.room.helper.C18189l;
import com.transsion.web.api.WebConstants;
import com.transsnet.loginapi.bean.UserInfo;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import fk.AbstractC23384a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import mg.C25829f;
import ng.AbstractC26006c;
import p415fq.C23420k;
import p415fq.C23421l;
import p441gz.InterfaceC23705b;
import p462hj.C23860f;
import p550kj.C24662i;
import p552kl.C24680h0;
import p552kl.C24682i0;
import p840vj.C28117b;
import p840vj.InterfaceC28116a;
import p913xm.C28615f;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
public final class RoomProvider extends BaseItemProvider {

    /* JADX INFO: renamed from: p */
    public static final C15009a f52451p = new C15009a(null);

    /* JADX INFO: renamed from: q */
    public static final int f52452q = 8;

    /* JADX INFO: renamed from: r */
    private static final String f52453r = "TrendingRoom";

    /* JADX INFO: renamed from: s */
    private static final String f52454s = "Trending";

    /* JADX INFO: renamed from: t */
    private static final String f52455t = "room_home_recommend";

    /* JADX INFO: renamed from: u */
    private static final ConfigBean f52456u = C28615f.f87796c.m110363a().m110360c("room_entrance_enable", true);

    /* JADX INFO: renamed from: e */
    private final BaseHomeSubFragment f52457e;

    /* JADX INFO: renamed from: f */
    private final TrendingViewModel f52458f;

    /* JADX INFO: renamed from: g */
    private final Lazy f52459g;

    /* JADX INFO: renamed from: h */
    private C28117b f52460h;

    /* JADX INFO: renamed from: i */
    private C28117b f52461i;

    /* JADX INFO: renamed from: j */
    private final String f52462j;

    /* JADX INFO: renamed from: k */
    private final Lazy f52463k;

    /* JADX INFO: renamed from: l */
    private final C15013e f52464l;

    /* JADX INFO: renamed from: m */
    private final C15012d f52465m;

    /* JADX INFO: renamed from: n */
    private final Lazy f52466n;

    /* JADX INFO: renamed from: o */
    private final Lazy f52467o;

    @Metadata(m97099d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u0010B\u001b\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m97100d2 = {"Lcom/transsion/home/adapter/trending/provider/RoomProvider$PostAdapter;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "", "pageFrom", "Lfq/l;", "trendingRoomsViewModel", "<init>", "(Ljava/lang/String;Lfq/l;)V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "PostItemProvider", "a", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    public static final class PostAdapter extends BaseProviderMultiAdapter<PostSubjectItem> {

        /* JADX INFO: renamed from: G */
        public static final int f52468G = 8;

        public static final class PostItemProvider extends BaseItemProvider {

            /* JADX INFO: renamed from: e */
            private final String f52469e;

            /* JADX INFO: renamed from: f */
            private final C23421l f52470f;

            /* JADX INFO: renamed from: g */
            private final int f52471g;

            /* JADX INFO: renamed from: h */
            private final int f52472h;

            @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m97100d2 = {"Lcom/transsion/home/adapter/trending/provider/RoomProvider$PostAdapter$PostItemProvider$PostItemVH;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lkl/i0;", "viewBinding", "<init>", "(Lkl/i0;)V", "a", "Lkl/i0;", "f", "()Lkl/i0;", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
            public static final class PostItemVH extends BaseViewHolder {

                /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                private final C24682i0 viewBinding;

                /* JADX WARN: Illegal instructions before constructor call */
                public PostItemVH(C24682i0 viewBinding) {
                    Intrinsics.m97802h(viewBinding, "viewBinding");
                    BLConstraintLayout root = viewBinding.getRoot();
                    Intrinsics.m97801g(root, "getRoot(...)");
                    super(root);
                    this.viewBinding = viewBinding;
                }

                /* JADX INFO: renamed from: f, reason: from getter */
                public final C24682i0 getViewBinding() {
                    return this.viewBinding;
                }
            }

            public PostItemProvider(String str, C23421l trendingRoomsViewModel) {
                Intrinsics.m97802h(trendingRoomsViewModel, "trendingRoomsViewModel");
                this.f52469e = str;
                this.f52470f = trendingRoomsViewModel;
                this.f52471g = AbstractC5776a0.m27313a(((AbstractC5776a0.m27314b(RangesKt.m97938h(AbstractC5806y.m27489e(), AbstractC5806y.m27487c())) - 60) * 1.0f) / 3);
                this.f52472h = AbstractC23384a.m92908b(112);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: B */
            public static final void m67239B(PostItemProvider postItemProvider, PostSubjectItem postSubjectItem, PostItemVH postItemVH, View view) {
                postItemProvider.m67241E(postSubjectItem, postItemVH.getAdapterPosition());
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: C */
            public static final void m67240C(PostSubjectItem postSubjectItem, View view) {
                Group group = postSubjectItem.getGroup();
                Navigator.m61845x(TheRouter.m61773c("/room/detail").m61857K("id", group != null ? group.getGroupId() : null).m61872z("need_start_room_home", false), view.getContext(), null, 2, null);
                C18189l.f59333a.m77095c(RoomProvider.f52454s, RoomProvider.f52455t, postSubjectItem);
            }

            /* JADX INFO: renamed from: E */
            private final void m67241E(PostSubjectItem postSubjectItem, int i11) {
                C16768a.f56378a.m73083y(this.f52469e, RoomProvider.f52454s, "", i11, WebConstants.FIELD_ITEM, postSubjectItem, (64 & 64) != 0 ? null : null);
                C23420k.m92972k(C23420k.f71413a, postSubjectItem, postSubjectItem.getOps(), RoomProvider.f52454s, false, 8, null);
            }

            @Override // com.chad.library.adapter.base.provider.BaseItemProvider
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public void mo22757b(BaseViewHolder helper, final PostSubjectItem item) {
                Pair pair;
                String url;
                FirstFrame firstFrame;
                String thumbnail;
                Cover cover;
                Cover cover2;
                String avatar;
                CharSequence charSequence;
                List<Image> image;
                Image image2;
                List<Image> image3;
                Image image4;
                Intrinsics.m97802h(helper, "helper");
                Intrinsics.m97802h(item, "item");
                final PostItemVH postItemVH = (PostItemVH) helper;
                postItemVH.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.trending.provider.u
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RoomProvider.PostAdapter.PostItemProvider.m67239B(this.f52599a, item, postItemVH, view);
                    }
                });
                AppCompatImageView ivVideoPlay = postItemVH.getViewBinding().f75461e;
                Intrinsics.m97801g(ivVideoPlay, "ivVideoPlay");
                Media media = item.getMedia();
                String mediaType = media != null ? media.getMediaType() : null;
                MediaType mediaType2 = MediaType.VIDEO;
                ivVideoPlay.setVisibility(Intrinsics.m97797c(mediaType, mediaType2.getValue()) ? 0 : 8);
                Media media2 = item.getMedia();
                String mediaType3 = media2 != null ? media2.getMediaType() : null;
                String str = "";
                if (Intrinsics.m97797c(mediaType3, MediaType.IMAGE.getValue())) {
                    Media media3 = item.getMedia();
                    String url2 = (media3 == null || (image3 = media3.getImage()) == null || (image4 = (Image) CollectionsKt.m97361k0(image3)) == null) ? null : image4.getUrl();
                    Media media4 = item.getMedia();
                    pair = new Pair(url2, (media4 == null || (image = media4.getImage()) == null || (image2 = (Image) CollectionsKt.m97361k0(image)) == null) ? null : image2.getThumbnail());
                } else if (Intrinsics.m97797c(mediaType3, mediaType2.getValue())) {
                    Media media5 = item.getMedia();
                    if (media5 == null || (cover2 = media5.getCover()) == null || (url = cover2.getUrl()) == null) {
                        Media media6 = item.getMedia();
                        url = (media6 == null || (firstFrame = media6.getFirstFrame()) == null) ? null : firstFrame.getUrl();
                    }
                    Media media7 = item.getMedia();
                    if (media7 == null || (cover = media7.getCover()) == null || (thumbnail = cover.getThumbnail()) == null) {
                        thumbnail = "";
                    }
                    pair = new Pair(url, thumbnail);
                } else {
                    pair = null;
                }
                if (pair == null || (charSequence = (CharSequence) pair.getFirst()) == null || charSequence.length() == 0) {
                    ShapeableImageView ivCover = postItemVH.getViewBinding().f75459c;
                    Intrinsics.m97801g(ivCover, "ivCover");
                    AbstractC26006c.m102054g(ivCover);
                } else {
                    ShapeableImageView ivCover2 = postItemVH.getViewBinding().f75459c;
                    Intrinsics.m97801g(ivCover2, "ivCover");
                    AbstractC26006c.m102058k(ivCover2);
                    C23860f.b bVarM94457m = C23860f.f72909a.m94457m(m36338k());
                    Object first = pair.getFirst();
                    Intrinsics.m97799e(first);
                    C23860f.b bVarM94468g = bVarM94457m.m94468g((String) first);
                    String str2 = (String) pair.getSecond();
                    if (str2 == null) {
                        str2 = "";
                    }
                    C23860f.b bVarM94473l = bVarM94468g.m94473l(str2);
                    ShapeableImageView ivCover3 = postItemVH.getViewBinding().f75459c;
                    Intrinsics.m97801g(ivCover3, "ivCover");
                    bVarM94473l.m94465d(ivCover3);
                }
                C15009a c15009a = RoomProvider.f52451p;
                if (!c15009a.m67256a()) {
                    TnTextView tnTextView = postItemVH.getViewBinding().f75462f;
                    Group group = item.getGroup();
                    tnTextView.setText(group != null ? group.getName() : null);
                    C23860f.b bVarM94457m2 = C23860f.f72909a.m94457m(m36338k());
                    Group group2 = item.getGroup();
                    if (group2 != null && (avatar = group2.getAvatar()) != null) {
                        str = avatar;
                    }
                    C23860f.b bVarM94464c = bVarM94457m2.m94468g(str).m94474m(AbstractC23384a.m92908b(24)).m94464c(AbstractC23384a.m92908b(24));
                    ShapeableImageView ivRoomCover = postItemVH.getViewBinding().f75460d;
                    Intrinsics.m97801g(ivRoomCover, "ivRoomCover");
                    bVarM94464c.m94465d(ivRoomCover);
                    postItemVH.getViewBinding().f75463g.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.trending.provider.v
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            RoomProvider.PostAdapter.PostItemProvider.m67240C(item, view);
                        }
                    });
                }
                postItemVH.getViewBinding().f75458b.setVisibility(c15009a.m67256a() ? 8 : 0);
                postItemVH.getViewBinding().getRoot().getLayoutParams().height = AbstractC23384a.m92908b(c15009a.m67256a() ? 182 : 168);
            }

            @Override // com.chad.library.adapter.base.provider.BaseItemProvider
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public PostItemVH mo36342r(ViewGroup parent, int i11) {
                Intrinsics.m97802h(parent, "parent");
                C24682i0 c24682i0M96949c = C24682i0.m96949c(LayoutInflater.from(m36338k()), parent, false);
                Intrinsics.m97801g(c24682i0M96949c, "inflate(...)");
                c24682i0M96949c.getRoot().getLayoutParams().width = this.f52471g;
                return new PostItemVH(c24682i0M96949c);
            }

            @Override // com.chad.library.adapter.base.provider.BaseItemProvider
            /* JADX INFO: renamed from: l */
            public int mo22758l() {
                return 1;
            }

            @Override // com.chad.library.adapter.base.provider.BaseItemProvider
            /* JADX INFO: renamed from: m */
            public int mo22759m() {
                return R$layout.item_adapter_room_entrance_post;
            }
        }

        /* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.RoomProvider$PostAdapter$a */
        public static final class C15008a extends BaseItemProvider {

            /* JADX INFO: renamed from: e */
            private final String f52474e;

            /* JADX INFO: renamed from: f */
            private final int f52475f;

            /* JADX WARN: Multi-variable type inference failed */
            public C15008a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public C15008a(String str) {
                this.f52474e = str;
                this.f52475f = AbstractC5776a0.m27313a(((AbstractC5776a0.m27314b(RangesKt.m97938h(AbstractC5806y.m27489e(), AbstractC5806y.m27487c())) - 60) * 1.0f) / 3);
            }

            public /* synthetic */ C15008a(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: A */
            public static final void m67247A(C15008a c15008a, BaseViewHolder baseViewHolder, PostSubjectItem postSubjectItem, View view) {
                C16768a.f56378a.m73083y(c15008a.f52474e, RoomProvider.f52454s, "", baseViewHolder.getBindingAdapterPosition(), WebConstants.FIELD_ITEM, postSubjectItem, (64 & 64) != 0 ? null : null);
                C24662i.f75350a.m96881p(RoomProvider.f52454s, MapsKt.m97578m(TuplesKt.m97108a(WebConstants.PAGE_FROM, c15008a.f52474e), TuplesKt.m97108a("module_name", "item_post_more")));
                C23420k.m92971i(C23420k.f71413a, null, null, RoomProvider.f52454s, false, 11, null);
            }

            @Override // com.chad.library.adapter.base.provider.BaseItemProvider
            /* JADX INFO: renamed from: l */
            public int mo22758l() {
                return 2;
            }

            @Override // com.chad.library.adapter.base.provider.BaseItemProvider
            /* JADX INFO: renamed from: m */
            public int mo22759m() {
                return R$layout.item_adapter_room_entrance_post_more;
            }

            @Override // com.chad.library.adapter.base.provider.BaseItemProvider
            /* JADX INFO: renamed from: r */
            public BaseViewHolder mo36342r(ViewGroup parent, int i11) {
                Intrinsics.m97802h(parent, "parent");
                BaseViewHolder baseViewHolderMo36342r = super.mo36342r(parent, i11);
                baseViewHolderMo36342r.itemView.getLayoutParams().width = this.f52475f;
                return baseViewHolderMo36342r;
            }

            @Override // com.chad.library.adapter.base.provider.BaseItemProvider
            /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
            public void mo22757b(final BaseViewHolder helper, final PostSubjectItem item) {
                Intrinsics.m97802h(helper, "helper");
                Intrinsics.m97802h(item, "item");
                helper.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.trending.provider.t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RoomProvider.PostAdapter.C15008a.m67247A(this.f52596a, helper, item, view);
                    }
                });
                helper.getView(R$id.root_view).getLayoutParams().height = AbstractC23384a.m92908b(RoomProvider.f52451p.m67256a() ? 182 : 168);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PostAdapter(String str, C23421l trendingRoomsViewModel) {
            super(null, 1, null);
            Intrinsics.m97802h(trendingRoomsViewModel, "trendingRoomsViewModel");
            mo36107F1(new PostItemProvider(str, trendingRoomsViewModel));
            mo36107F1(new C15008a(str));
        }

        public /* synthetic */ PostAdapter(String str, C23421l c23421l, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, c23421l);
        }

        @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
        /* JADX INFO: renamed from: N1 */
        protected int mo36112N1(List<? extends PostSubjectItem> data, int position) {
            Intrinsics.m97802h(data, "data");
            return data.get(position).isMore() ? 2 : 1;
        }
    }

    @Metadata(m97099d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m97100d2 = {"Lcom/transsion/home/adapter/trending/provider/RoomProvider$RoomAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/bean/RoomItem;", "Lcom/transsion/home/adapter/trending/provider/RoomProvider$RoomAdapter$RoomItemVH;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, WebConstants.FIELD_ITEM, "", "F1", "(Landroid/view/View;Lcom/transsion/moviedetailapi/bean/RoomItem;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "E1", "(Landroid/view/ViewGroup;I)Lcom/transsion/home/adapter/trending/provider/RoomProvider$RoomAdapter$RoomItemVH;", "holder", "C1", "(Lcom/transsion/home/adapter/trending/provider/RoomProvider$RoomAdapter$RoomItemVH;Lcom/transsion/moviedetailapi/bean/RoomItem;)V", "F", "I", "coverSize", "RoomItemVH", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    public static final class RoomAdapter extends BaseQuickAdapter {

        /* JADX INFO: renamed from: G */
        public static final int f52476G = 8;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        private final int coverSize;

        @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m97100d2 = {"Lcom/transsion/home/adapter/trending/provider/RoomProvider$RoomAdapter$RoomItemVH;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lkl/h0;", "viewBinding", "<init>", "(Lkl/h0;)V", "a", "Lkl/h0;", "f", "()Lkl/h0;", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
        public static final class RoomItemVH extends BaseViewHolder {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C24680h0 viewBinding;

            /* JADX WARN: Illegal instructions before constructor call */
            public RoomItemVH(C24680h0 viewBinding) {
                Intrinsics.m97802h(viewBinding, "viewBinding");
                ConstraintLayout root = viewBinding.getRoot();
                Intrinsics.m97801g(root, "getRoot(...)");
                super(root);
                this.viewBinding = viewBinding;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final C24680h0 getViewBinding() {
                return this.viewBinding;
            }
        }

        public RoomAdapter() {
            super(R$layout.item_adapter_room_entrance_group, null, 2, null);
            this.coverSize = AbstractC23384a.m92908b(52);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: D1 */
        public static final void m67251D1(RoomAdapter roomAdapter, RoomItem roomItem, View view) {
            Intrinsics.m97799e(view);
            roomAdapter.m67252F1(view, roomItem);
        }

        /* JADX INFO: renamed from: F1 */
        private final void m67252F1(View view, RoomItem item) {
            item.setNewPostCount(0L);
            C18189l.f59333a.m77099g(RoomProvider.f52454s, RoomProvider.f52455t, item);
            Navigator.m61845x(TheRouter.m61773c("/room/detail").m61857K("id", item.getGroupId()).m61872z("need_start_room_home", false), view.getContext(), null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
        public void mo36106F(RoomItemVH holder, final RoomItem item) {
            String strM23921d;
            Intrinsics.m97802h(holder, "holder");
            Intrinsics.m97802h(item, "item");
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.trending.provider.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RoomProvider.RoomAdapter.m67251D1(this.f52603a, item, view);
                }
            });
            holder.getViewBinding().f75445e.setText(item.getName());
            if (item.getUserCount() != null) {
                Long userCount = item.getUserCount();
                Intrinsics.m97799e(userCount);
                strM23921d = AbstractC5114k.m23921d(userCount.longValue());
            } else {
                strM23921d = "0";
            }
            holder.getViewBinding().f75444d.setText(strM23921d);
            String avatar = item.getAvatar();
            if (avatar != null) {
                C23860f.b bVarM94464c = C23860f.f72909a.m94457m(getContext()).m94468g(avatar).m94474m(this.coverSize).m94464c(this.coverSize);
                ShapeableImageView ivCover = holder.getViewBinding().f75443c;
                Intrinsics.m97801g(ivCover, "ivCover");
                bVarM94464c.m94465d(ivCover);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
        public RoomItemVH mo36095y0(ViewGroup parent, int viewType) {
            Intrinsics.m97802h(parent, "parent");
            C24680h0 c24680h0M96943c = C24680h0.m96943c(LayoutInflater.from(getContext()), parent, false);
            Intrinsics.m97801g(c24680h0M96943c, "inflate(...)");
            return new RoomItemVH(c24680h0M96943c);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.RoomProvider$a */
    public static final class C15009a {
        private C15009a() {
        }

        public /* synthetic */ C15009a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m67256a() {
            ConfigBean configBeanM67257b = m67257b();
            return Intrinsics.m97797c(configBeanM67257b != null ? configBeanM67257b.getValue() : null, "true");
        }

        /* JADX INFO: renamed from: b */
        public final ConfigBean m67257b() {
            return RoomProvider.f52456u;
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.RoomProvider$b */
    public static final class C15010b implements InterfaceC28116a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ RoomAdapter f52479a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ RoomProvider f52480b;

        C15010b(RoomAdapter roomAdapter, RoomProvider roomProvider) {
            this.f52479a = roomAdapter;
            this.f52480b = roomProvider;
        }

        @Override // p840vj.InterfaceC28116a
        /* JADX INFO: renamed from: a */
        public void mo65894a(int i11, long j11, View view) {
            RoomAdapter roomAdapter = this.f52479a;
            RoomProvider roomProvider = this.f52480b;
            try {
                Result.Companion companion = Result.INSTANCE;
                C26866a.a.m104905r(C26866a.f81698a, RoomProvider.f52453r, new String[]{"1----------room report, position:" + i11 + ", duration:" + j11}, false, 4, null);
                RoomItem roomItem = (RoomItem) roomAdapter.m36182f0(i11);
                if (roomItem != null) {
                    C18189l.f59333a.m77101i(roomProvider.f52462j, RoomProvider.f52454s, i11, j11, roomItem);
                }
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.RoomProvider$c */
    public static final class C15011c implements InterfaceC28116a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ PostAdapter f52481a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ RoomProvider f52482b;

        C15011c(PostAdapter postAdapter, RoomProvider roomProvider) {
            this.f52481a = postAdapter;
            this.f52482b = roomProvider;
        }

        @Override // p840vj.InterfaceC28116a
        /* JADX INFO: renamed from: a */
        public void mo65894a(int i11, long j11, View view) {
            PostAdapter postAdapter = this.f52481a;
            RoomProvider roomProvider = this.f52482b;
            try {
                Result.Companion companion = Result.INSTANCE;
                C26866a.a.m104898f(C26866a.f81698a, RoomProvider.f52453r, "2-------post report, position:" + i11 + ", duration:" + j11, false, 4, null);
                PostSubjectItem postSubjectItem = (PostSubjectItem) postAdapter.m36182f0(i11);
                if (postSubjectItem != null && !CollectionsKt.m97352b0(roomProvider.m67228N(), postSubjectItem.getPostId())) {
                    String postId = postSubjectItem.getPostId();
                    if (postId != null) {
                        roomProvider.m67228N().add(postId);
                    }
                    C16768a.f56378a.m73082w(roomProvider.f52462j, RoomProvider.f52454s, "", i11, j11, postSubjectItem, (64 & 64) != 0 ? null : null);
                }
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.RoomProvider$d */
    public static final class C15012d implements InterfaceC23705b {
        C15012d() {
        }

        @Override // p441gz.InterfaceC23705b
        public void onLogin(UserInfo user) {
            Intrinsics.m97802h(user, "user");
            TrendingViewModel trendingViewModel = RoomProvider.this.f52458f;
            if (trendingViewModel != null) {
                trendingViewModel.m69059T(false);
            }
        }

        @Override // p441gz.InterfaceC23705b
        public void onLogout() {
            TrendingViewModel trendingViewModel = RoomProvider.this.f52458f;
            if (trendingViewModel != null) {
                trendingViewModel.m69059T(false);
            }
        }

        @Override // p441gz.InterfaceC23705b
        public void onUpdateUserInfo(UserInfo userInfo) {
            InterfaceC23705b.a.m93657c(this, userInfo);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.RoomProvider$e */
    public static final class C15013e extends RecyclerView.AbstractC4219r {
        C15013e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC4219r
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            Intrinsics.m97802h(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i11, i12);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.RoomProvider$f */
    public static final class C15014f extends RecyclerView.C4220s {
        C15014f() {
            m20854m(0, 10);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.RoomProvider$g */
    public static final class C15015g extends RecyclerView.C4220s {
        C15015g() {
            m20854m(0, 10);
        }
    }

    /* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.RoomProvider$h */
    static final class C15016h implements InterfaceC3189c0, FunctionAdapter {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ Function1 f52484a;

        C15016h(Function1 function) {
            Intrinsics.m97802h(function, "function");
            this.f52484a = function;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        /* JADX INFO: renamed from: a */
        public final Function mo6065a() {
            return this.f52484a;
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
            this.f52484a.invoke(obj);
        }
    }

    public RoomProvider(final BaseHomeSubFragment fragment, TrendingViewModel trendingViewModel) {
        Intrinsics.m97802h(fragment, "fragment");
        this.f52457e = fragment;
        this.f52458f = trendingViewModel;
        this.f52459g = FragmentViewModelLazyKt.m14626a(fragment, Reflection.m97823b(C23421l.class), new Function0<C3231x0>() { // from class: com.transsion.home.adapter.trending.provider.RoomProvider$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3231x0 invoke() {
                C3231x0 viewModelStore = fragment.requireActivity().getViewModelStore();
                Intrinsics.m97801g(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<C3227v0.c>() { // from class: com.transsion.home.adapter.trending.provider.RoomProvider$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final C3227v0.c invoke() {
                C3227v0.c defaultViewModelProviderFactory = fragment.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.m97801g(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.f52462j = C24662i.f75350a.m96877i();
        this.f52463k = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.adapter.trending.provider.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomProvider.m67233S();
            }
        });
        this.f52464l = new C15013e();
        this.f52465m = new C15012d();
        this.f52466n = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.adapter.trending.provider.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomProvider.m67235U();
            }
        });
        this.f52467o = LazyKt.m97097b(new Function0() { // from class: com.transsion.home.adapter.trending.provider.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomProvider.m67234T();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final Unit m67226L(BaseViewHolder baseViewHolder, RecyclerView recyclerView, RoomAdapter roomAdapter, RecyclerView recyclerView2, PostAdapter postAdapter, RoomEntranceResponse roomEntranceResponse) {
        baseViewHolder.setText(R$id.main_operation_room_title, roomEntranceResponse.getTitle());
        List<RoomItem> groups = roomEntranceResponse.getGroups();
        if (groups == null || groups.isEmpty() || !f52451p.m67256a()) {
            recyclerView.setVisibility(8);
        } else {
            recyclerView.setVisibility(0);
            roomAdapter.mo36201n1(roomEntranceResponse.getGroups());
        }
        List<PostSubjectItem> posts = roomEntranceResponse.getPosts();
        if (posts == null || posts.isEmpty()) {
            recyclerView2.setVisibility(8);
        } else {
            recyclerView2.setVisibility(0);
            ArrayList arrayList = new ArrayList();
            List<PostSubjectItem> posts2 = roomEntranceResponse.getPosts();
            Intrinsics.m97799e(posts2);
            arrayList.addAll(posts2);
            PostSubjectItem postSubjectItem = new PostSubjectItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, false, false, false, null, -1, 1, null);
            postSubjectItem.setMore(true);
            arrayList.add(postSubjectItem);
            postAdapter.mo36201n1(arrayList);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final void m67227M(View view) {
        C18189l c18189l = C18189l.f59333a;
        String str = f52454s;
        c18189l.m77098f(str, f52455t);
        C23420k.m92971i(C23420k.f71413a, null, null, str, false, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final HashSet m67228N() {
        return (HashSet) this.f52463k.getValue();
    }

    /* JADX INFO: renamed from: O */
    private final C15014f m67229O() {
        return (C15014f) this.f52467o.getValue();
    }

    /* JADX INFO: renamed from: P */
    private final C15015g m67230P() {
        return (C15015g) this.f52466n.getValue();
    }

    /* JADX INFO: renamed from: Q */
    private final C23421l m67231Q() {
        return (C23421l) this.f52459g.getValue();
    }

    /* JADX INFO: renamed from: R */
    private final void m67232R(RecyclerView recyclerView, RecyclerView recyclerView2, RoomAdapter roomAdapter, PostAdapter postAdapter) {
        recyclerView.clearOnScrollListeners();
        recyclerView2.clearOnScrollListeners();
        C28117b c28117b = new C28117b(0.6f, new C15010b(roomAdapter, this), false, 4, null);
        c28117b.m109199n(1);
        ExposureType exposureType = ExposureType.NEST_HORIZONTAL;
        c28117b.m109200o(exposureType);
        recyclerView.addOnScrollListener(c28117b);
        this.f52460h = c28117b;
        C28117b c28117b2 = new C28117b(0.6f, new C15011c(postAdapter, this), false, 4, null);
        c28117b2.m109199n(1);
        c28117b2.m109200o(exposureType);
        recyclerView2.addOnScrollListener(c28117b2);
        this.f52461i = c28117b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final HashSet m67233S() {
        return new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C15014f m67234T() {
        return new C15014f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C15015g m67235U() {
        return new C15015g();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo22757b(final BaseViewHolder helper, OperateItem item) {
        C3187b0 c3187b0M69061W;
        C3187b0 c3187b0M69061W2;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        final RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.main_operation_room_group_recycler);
        final RecyclerView recyclerView2 = (RecyclerView) helper.getView(R$id.main_operation_room_post_recycler);
        ((TextView) helper.getView(R$id.main_operation_room_more_text)).setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.trending.provider.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RoomProvider.m67227M(view);
            }
        });
        String title = item.getTitle();
        if (title != null && title.length() != 0) {
            ((TextView) helper.getView(R$id.main_operation_room_title)).setText(item.getTitle());
        }
        if (!Intrinsics.m97797c(recyclerView.getRecycledViewPool(), m67230P())) {
            recyclerView.setRecycledViewPool(m67230P());
        }
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C25829f(8.0f, 0.0f, 12.0f, 2, null));
        }
        RecyclerView.AbstractC4214m linearLayoutManager = new LinearLayoutManager(this.f52457e.getContext(), 0, false);
        linearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        final RoomAdapter roomAdapter = new RoomAdapter();
        recyclerView.setAdapter(roomAdapter);
        if (!Intrinsics.m97797c(recyclerView2.getRecycledViewPool(), m67229O())) {
            recyclerView2.setRecycledViewPool(m67229O());
        }
        if (recyclerView2.getItemDecorationCount() == 0) {
            recyclerView2.addItemDecoration(new C25829f(8.0f, 0.0f, 12.0f, 2, null));
        }
        RecyclerView.AbstractC4214m linearLayoutManager2 = new LinearLayoutManager(this.f52457e.getContext(), 0, false);
        linearLayoutManager2.setItemPrefetchEnabled(true);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        final PostAdapter postAdapter = new PostAdapter(this.f52462j, m67231Q());
        recyclerView2.setAdapter(postAdapter);
        m67232R(recyclerView, recyclerView2, roomAdapter, postAdapter);
        TrendingViewModel trendingViewModel = this.f52458f;
        if (trendingViewModel != null && (c3187b0M69061W2 = trendingViewModel.m69061W()) != null) {
            c3187b0M69061W2.m14857p(this.f52457e);
        }
        TrendingViewModel trendingViewModel2 = this.f52458f;
        if (trendingViewModel2 == null || (c3187b0M69061W = trendingViewModel2.m69061W()) == null) {
            return;
        }
        c3187b0M69061W.m14851j(this.f52457e, new C15016h(new Function1() { // from class: com.transsion.home.adapter.trending.provider.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomProvider.m67226L(helper, recyclerView, roomAdapter, recyclerView2, postAdapter, (RoomEntranceResponse) obj);
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
        return R$layout.post_list_item_room;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: r */
    public BaseViewHolder mo36342r(ViewGroup parent, int i11) {
        Intrinsics.m97802h(parent, "parent");
        return super.mo36342r(parent, i11);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: t */
    public void mo36344t(BaseViewHolder holder) {
        Unit unit;
        RecyclerView recyclerView;
        Intrinsics.m97802h(holder, "holder");
        super.mo36344t(holder);
        try {
            Result.Companion companion = Result.INSTANCE;
            BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
            if (baseProviderMultiAdapterM36335g == null || (recyclerView = baseProviderMultiAdapterM36335g.getRecyclerView()) == null) {
                unit = null;
            } else {
                recyclerView.addOnScrollListener(this.f52464l);
                unit = Unit.f75682a;
            }
            Result.m112707constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: u */
    public void mo36345u(BaseViewHolder holder) {
        Unit unit;
        RecyclerView recyclerView;
        Intrinsics.m97802h(holder, "holder");
        super.mo36345u(holder);
        C26866a.a.m104908v(C26866a.f81698a, f52453r, "room onViewDetachedFromWindow", false, 4, null);
        C28117b c28117b = this.f52460h;
        if (c28117b != null) {
            c28117b.m109195f();
        }
        C28117b c28117b2 = this.f52461i;
        if (c28117b2 != null) {
            c28117b2.m109195f();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = m36335g();
            if (baseProviderMultiAdapterM36335g == null || (recyclerView = baseProviderMultiAdapterM36335g.getRecyclerView()) == null) {
                unit = null;
            } else {
                recyclerView.removeOnScrollListener(this.f52464l);
                unit = Unit.f75682a;
            }
            Result.m112707constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
    }
}
