package com.transsion.postdetail.comment.p305ui;

import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.moviedetailapi.bean.CommentBean;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.postdetail.R$id;
import com.transsion.postdetail.R$layout;
import com.transsion.postdetail.R$string;
import com.transsion.postdetail.util.AbstractC17443m;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p462hj.C23860f;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.postdetail.comment.ui.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, m97100d2 = {"Lcom/transsion/postdetail/comment/ui/a;", "Lcom/chad/library/adapter/base/BaseProviderMultiAdapter;", "Lcom/transsion/moviedetailapi/bean/CommentBean;", "Lu6/i;", "<init>", "()V", "", "data", "", RequestParameters.POSITION, "N1", "(Ljava/util/List;I)I", "a", "PostDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C16751a extends BaseProviderMultiAdapter<CommentBean> implements InterfaceC27944i {

    /* JADX INFO: renamed from: com.transsion.postdetail.comment.ui.a$a */
    public static final class a extends BaseItemProvider {

        /* JADX INFO: renamed from: e */
        private final int f56304e = AbstractC5776a0.m27313a(32.0f);

        /* JADX INFO: renamed from: f */
        private final int f56305f = AbstractC5776a0.m27313a(51.0f);

        /* JADX INFO: renamed from: g */
        private final int f56306g = AbstractC5776a0.m27313a(34.0f);

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: l */
        public int mo22758l() {
            return 0;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: m */
        public int mo22759m() {
            return R$layout.item_my_comment_list_layout;
        }

        @Override // com.chad.library.adapter.base.provider.BaseItemProvider
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void mo22757b(BaseViewHolder helper, CommentBean item) {
            Cover cover;
            Intrinsics.m97802h(helper, "helper");
            Intrinsics.m97802h(item, "item");
            ImageView imageView = (ImageView) helper.getView(R$id.avatarIV);
            C23860f.a aVar = C23860f.f72909a;
            C23860f.b bVarM94457m = aVar.m94457m(m36338k());
            String avatarUrl = item.getAvatarUrl();
            if (avatarUrl == null) {
                avatarUrl = "";
            }
            bVarM94457m.m94468g(avatarUrl).m94474m(this.f56304e).m94464c(this.f56304e).m94465d(imageView);
            ImageView imageView2 = (ImageView) helper.getView(R$id.contentIV);
            imageView2.setImageResource(0);
            List<Cover> imageList = item.getImageList();
            if (imageList != null && (cover = (Cover) CollectionsKt.m97361k0(imageList)) != null) {
                C23860f.b bVarM94457m2 = aVar.m94457m(m36338k());
                String url = cover.getUrl();
                if (url == null) {
                    url = "";
                }
                C23860f.b bVarM94464c = bVarM94457m2.m94468g(url).m94474m(this.f56305f).m94464c(this.f56306g);
                String thumbnail = cover.getThumbnail();
                bVarM94464c.m94473l(thumbnail != null ? thumbnail : "").m94465d(imageView2);
            }
            helper.setText(R$id.nameTV, item.getNickName());
            helper.setText(R$id.commentTV, item.getContent());
            TextView textView = (TextView) helper.getView(R$id.timeTV);
            Long createdAt = item.getCreatedAt();
            if (createdAt != null) {
                textView.setText(m36338k().getString(R$string.comment_post_time, AbstractC17443m.m74967b(createdAt.longValue())));
            }
            textView.setVisibility(createdAt != null ? 0 : 8);
        }
    }

    public C16751a() {
        super(null, 1, null);
        mo36107F1(new a());
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    /* JADX INFO: renamed from: N1 */
    protected int mo36112N1(List<? extends CommentBean> data, int position) {
        Intrinsics.m97802h(data, "data");
        return 0;
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
