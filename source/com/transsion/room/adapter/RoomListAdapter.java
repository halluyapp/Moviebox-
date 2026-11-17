package com.transsion.room.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.AbstractC2397b;
import ck.AbstractC5114k;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.noober.background.view.BLTextView;
import com.noober.background.view.BLView;
import com.p282tn.lib.view.RoomJoinAnimationView;
import com.p282tn.lib.view.RoomJoinStatus;
import com.p282tn.lib.widget.R$color;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.FirstFrame;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.room.R$layout;
import com.transsion.room.R$string;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gq.C23663y;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26006c;
import p462hj.C23860f;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import th.C27819c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00010B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b#\u0010\u000fJ-\u0010'\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0014¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, m97100d2 = {"Lcom/transsion/room/adapter/RoomListAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/moviedetailapi/bean/RoomItem;", "Lcom/transsion/room/adapter/RoomListAdapter$RoomListItemVH;", "Lu6/i;", "Lcom/transsion/room/adapter/RoomListFrom;", "roomListFrom", "", "isSelectRoom", "<init>", "(Lcom/transsion/room/adapter/RoomListFrom;Z)V", "holder", WebConstants.FIELD_ITEM, "", "J1", "(Lcom/transsion/room/adapter/RoomListAdapter$RoomListItemVH;Lcom/transsion/moviedetailapi/bean/RoomItem;)V", "F1", "Lcom/transsion/moviedetailapi/bean/PostSubjectItem;", "latestPosts", "H1", "(Lcom/transsion/room/adapter/RoomListAdapter$RoomListItemVH;Lcom/transsion/moviedetailapi/bean/PostSubjectItem;)V", "I1", "hasJoin", "E1", "(Lcom/transsion/room/adapter/RoomListAdapter$RoomListItemVH;Z)V", "", "newCount", "G1", "(Lcom/transsion/room/adapter/RoomListAdapter$RoomListItemVH;J)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "D1", "(Landroid/view/ViewGroup;I)Lcom/transsion/room/adapter/RoomListAdapter$RoomListItemVH;", "B1", "", "", "payloads", "C1", "(Lcom/transsion/room/adapter/RoomListAdapter$RoomListItemVH;Lcom/transsion/moviedetailapi/bean/RoomItem;Ljava/util/List;)V", "F", "Lcom/transsion/room/adapter/RoomListFrom;", "G", "Z", "H", "I", "coverSize", "RoomListItemVH", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class RoomListAdapter extends BaseQuickAdapter implements InterfaceC27944i {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final RoomListFrom roomListFrom;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final boolean isSelectRoom;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final int coverSize;

    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m97100d2 = {"Lcom/transsion/room/adapter/RoomListAdapter$RoomListItemVH;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lgq/y;", "viewBinding", "<init>", "(Lgq/y;)V", "a", "Lgq/y;", "f", "()Lgq/y;", "Room_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    public static final class RoomListItemVH extends BaseViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C23663y viewBinding;

        /* JADX WARN: Illegal instructions before constructor call */
        public RoomListItemVH(C23663y viewBinding) {
            Intrinsics.m97802h(viewBinding, "viewBinding");
            ConstraintLayout root = viewBinding.getRoot();
            Intrinsics.m97801g(root, "getRoot(...)");
            super(root);
            this.viewBinding = viewBinding;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C23663y getViewBinding() {
            return this.viewBinding;
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.adapter.RoomListAdapter$a */
    public /* synthetic */ class C18035a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f59079a;

        static {
            int[] iArr = new int[RoomListFrom.values().length];
            try {
                iArr[RoomListFrom.MY_ROOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoomListFrom.ROOM_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f59079a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomListAdapter(RoomListFrom roomListFrom, boolean z11) {
        super(R$layout.item_room_list, null, 2, null);
        Intrinsics.m97802h(roomListFrom, "roomListFrom");
        this.roomListFrom = roomListFrom;
        this.isSelectRoom = z11;
        this.coverSize = AbstractC5776a0.m27313a(52.0f);
    }

    /* JADX INFO: renamed from: E1 */
    private final void m76725E1(RoomListItemVH holder, boolean hasJoin) {
        holder.getViewBinding().f72354l.setStatus(hasJoin ? RoomJoinStatus.JOINED : RoomJoinStatus.JOIN);
    }

    /* JADX INFO: renamed from: F1 */
    private final void m76726F1(RoomListItemVH holder, RoomItem item) {
        List<PostSubjectItem> latestPosts = item.getLatestPosts();
        PostSubjectItem postSubjectItem = latestPosts != null ? (PostSubjectItem) CollectionsKt.m97361k0(latestPosts) : null;
        if (postSubjectItem == null) {
            Group groupNewPost = holder.getViewBinding().f72345c;
            Intrinsics.m97801g(groupNewPost, "groupNewPost");
            AbstractC26006c.m102054g(groupNewPost);
            return;
        }
        Group groupNewPost2 = holder.getViewBinding().f72345c;
        Intrinsics.m97801g(groupNewPost2, "groupNewPost");
        AbstractC26006c.m102058k(groupNewPost2);
        String content = postSubjectItem.getContent();
        String title = (content == null || content.length() == 0) ? postSubjectItem.getTitle() : postSubjectItem.getContent();
        AppCompatTextView appCompatTextView = holder.getViewBinding().f72351i;
        if (title == null || title.length() == 0) {
            title = Utils.m27275a().getString(R$string.New_post);
        }
        appCompatTextView.setText(title);
        Media media = postSubjectItem.getMedia();
        String mediaType = media != null ? media.getMediaType() : null;
        if (Intrinsics.m97797c(mediaType, MediaType.VIDEO.getValue())) {
            m76729I1(holder, postSubjectItem);
            return;
        }
        if (Intrinsics.m97797c(mediaType, MediaType.IMAGE.getValue())) {
            m76728H1(holder, postSubjectItem);
            return;
        }
        FrameLayout root = holder.getViewBinding().f72348f.getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        AbstractC26006c.m102054g(root);
        FrameLayout root2 = holder.getViewBinding().f72347e.getRoot();
        Intrinsics.m97801g(root2, "getRoot(...)");
        AbstractC26006c.m102054g(root2);
    }

    /* JADX INFO: renamed from: G1 */
    private final void m76727G1(RoomListItemVH holder, long newCount) {
        BLTextView tvNewCount = holder.getViewBinding().f72350h;
        Intrinsics.m97801g(tvNewCount, "tvNewCount");
        tvNewCount.setVisibility((newCount > 0L ? 1 : (newCount == 0L ? 0 : -1)) > 0 ? 0 : 8);
        holder.getViewBinding().f72350h.setText(Utils.m27275a().getString(R$string.x_new, newCount > 99 ? "99+" : String.valueOf(newCount)));
    }

    /* JADX INFO: renamed from: H1 */
    private final void m76728H1(RoomListItemVH holder, PostSubjectItem latestPosts) {
        List<Image> image;
        List<Image> image2;
        Media media = latestPosts.getMedia();
        int i11 = 0;
        List<Image> image3 = null;
        if (((media == null || (image2 = media.getImage()) == null) ? 0 : image2.size()) > 2) {
            Media media2 = latestPosts.getMedia();
            if (media2 != null && (image = media2.getImage()) != null) {
                image3 = image.subList(0, 2);
            }
        } else {
            Media media3 = latestPosts.getMedia();
            if (media3 != null) {
                image3 = media3.getImage();
            }
        }
        List<Image> list = image3;
        if (list == null || list.isEmpty()) {
            FrameLayout root = holder.getViewBinding().f72347e.getRoot();
            Intrinsics.m97801g(root, "getRoot(...)");
            AbstractC26006c.m102054g(root);
            return;
        }
        FrameLayout root2 = holder.getViewBinding().f72347e.getRoot();
        Intrinsics.m97801g(root2, "getRoot(...)");
        AbstractC26006c.m102058k(root2);
        ShapeableImageView ivPostCover2 = holder.getViewBinding().f72347e.f72172c;
        Intrinsics.m97801g(ivPostCover2, "ivPostCover2");
        ivPostCover2.setVisibility(image3.size() > 1 ? 0 : 8);
        BLView vPostBg = holder.getViewBinding().f72347e.f72173d;
        Intrinsics.m97801g(vPostBg, "vPostBg");
        vPostBg.setVisibility(image3.size() > 1 ? 0 : 8);
        for (Object obj : image3) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            Image image4 = (Image) obj;
            ShapeableImageView shapeableImageView = i11 == 0 ? holder.getViewBinding().f72347e.f72171b : holder.getViewBinding().f72347e.f72172c;
            Intrinsics.m97799e(shapeableImageView);
            String url = image4.getUrl();
            if (url != null) {
                C23860f.f72909a.m94457m(getContext()).m94468g(url).m94474m(this.coverSize).m94464c(this.coverSize).m94465d(shapeableImageView);
            }
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: I1 */
    private final void m76729I1(RoomListItemVH holder, PostSubjectItem latestPosts) {
        String url;
        FirstFrame firstFrame;
        Cover cover;
        Media media = latestPosts.getMedia();
        if (media == null || (cover = media.getCover()) == null || (url = cover.getUrl()) == null) {
            Media media2 = latestPosts.getMedia();
            url = (media2 == null || (firstFrame = media2.getFirstFrame()) == null) ? null : firstFrame.getUrl();
        }
        if (url == null || url.length() == 0) {
            FrameLayout root = holder.getViewBinding().f72348f.getRoot();
            Intrinsics.m97801g(root, "getRoot(...)");
            AbstractC26006c.m102054g(root);
            return;
        }
        FrameLayout root2 = holder.getViewBinding().f72348f.getRoot();
        Intrinsics.m97801g(root2, "getRoot(...)");
        AbstractC26006c.m102058k(root2);
        C23860f.b bVarM94464c = C23860f.f72909a.m94457m(getContext()).m94468g(url).m94474m(this.coverSize).m94464c(this.coverSize);
        ShapeableImageView ivPostCover = holder.getViewBinding().f72348f.f72177b;
        Intrinsics.m97801g(ivPostCover, "ivPostCover");
        bVarM94464c.m94465d(ivPostCover);
    }

    /* JADX INFO: renamed from: J1 */
    private final void m76730J1(RoomListItemVH holder, RoomItem item) {
        m76725E1(holder, Intrinsics.m97797c(item.getHasJoin(), Boolean.TRUE));
        RoomJoinAnimationView vJoin = holder.getViewBinding().f72354l;
        Intrinsics.m97801g(vJoin, "vJoin");
        AbstractC26006c.m102058k(vJoin);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(RoomListItemVH holder, RoomItem item) {
        String strM23921d;
        List<String> tags;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        String avatar = item.getAvatar();
        if (avatar != null) {
            C23860f.b bVarM94464c = C23860f.f72909a.m94457m(getContext()).m94468g(avatar).m94474m(this.coverSize).m94464c(this.coverSize);
            ShapeableImageView ivCover = holder.getViewBinding().f72346d;
            Intrinsics.m97801g(ivCover, "ivCover");
            bVarM94464c.m94465d(ivCover);
        }
        if (this.isSelectRoom) {
            holder.getViewBinding().f72353k.setMaxLines(2);
            AppCompatTextView tvMember = holder.getViewBinding().f72349g;
            Intrinsics.m97801g(tvMember, "tvMember");
            AbstractC26006c.m102054g(tvMember);
            AppCompatTextView tvTag = holder.getViewBinding().f72352j;
            Intrinsics.m97801g(tvTag, "tvTag");
            AbstractC26006c.m102054g(tvTag);
            Group groupNewPost = holder.getViewBinding().f72345c;
            Intrinsics.m97801g(groupNewPost, "groupNewPost");
            AbstractC26006c.m102054g(groupNewPost);
            holder.getViewBinding().f72353k.setText(item.getName());
            return;
        }
        Long newPostCount = item.getNewPostCount();
        m76727G1(holder, newPostCount != null ? newPostCount.longValue() : 0L);
        holder.getViewBinding().f72353k.setText(item.getName());
        if (item.getUserCount() != null) {
            Long userCount = item.getUserCount();
            Intrinsics.m97799e(userCount);
            strM23921d = AbstractC5114k.m23921d(userCount.longValue());
        } else {
            strM23921d = "0";
        }
        AppCompatTextView appCompatTextView = holder.getViewBinding().f72349g;
        Long userCount2 = item.getUserCount();
        appCompatTextView.setText((userCount2 != null ? userCount2.longValue() : 0L) == 1 ? Utils.m27275a().getString(R$string.one_members) : Utils.m27275a().getString(R$string.x_members, strM23921d));
        C27819c.a aVarM108144e = C27819c.m108144e();
        List<String> tags2 = item.getTags();
        if ((tags2 != null ? tags2.size() : 0) > 3) {
            List<String> tags3 = item.getTags();
            tags = tags3 != null ? tags3.subList(0, 3) : null;
        } else {
            tags = item.getTags();
        }
        if (tags != null) {
            boolean z11 = true;
            for (String str : tags) {
                if (!z11) {
                    aVarM108144e.m108153e("丨").m108151c(AbstractC2397b.getColor(Utils.m27275a(), R$color.white_20));
                }
                aVarM108144e.m108153e(str).m108151c(AbstractC2397b.getColor(Utils.m27275a(), R$color.white_60));
                z11 = false;
            }
        }
        holder.getViewBinding().f72352j.setText(aVarM108144e.m108150b());
        int i11 = C18035a.f59079a[this.roomListFrom.ordinal()];
        if (i11 == 1) {
            RoomJoinAnimationView vJoin = holder.getViewBinding().f72354l;
            Intrinsics.m97801g(vJoin, "vJoin");
            AbstractC26006c.m102054g(vJoin);
            m76726F1(holder, item);
            return;
        }
        if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Group groupNewPost2 = holder.getViewBinding().f72345c;
        Intrinsics.m97801g(groupNewPost2, "groupNewPost");
        AbstractC26006c.m102054g(groupNewPost2);
        m76730J1(holder, item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo36108G(RoomListItemVH holder, RoomItem item, List<? extends Object> payloads) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(payloads, "payloads");
        super.mo36108G(holder, item, payloads);
        if (payloads.isEmpty()) {
            return;
        }
        Object objV0 = CollectionsKt.m97372v0(payloads);
        if (objV0 instanceof Boolean) {
            m76725E1(holder, ((Boolean) objV0).booleanValue());
        } else if (objV0 instanceof Long) {
            m76727G1(holder, ((Number) objV0).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
    public RoomListItemVH mo36095y0(ViewGroup parent, int viewType) {
        Intrinsics.m97802h(parent, "parent");
        C23663y c23663yM93600c = C23663y.m93600c(LayoutInflater.from(getContext()), parent, false);
        Intrinsics.m97801g(c23663yM93600c, "inflate(...)");
        return new RoomListItemVH(c23663yM93600c);
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
