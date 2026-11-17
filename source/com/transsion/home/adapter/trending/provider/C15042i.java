package com.transsion.home.adapter.trending.provider;

import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.p282tn.lib.view.CornerTextView;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.bean.OperateItem;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.Subject;
import kotlin.jvm.internal.Intrinsics;
import p462hj.C23860f;

/* JADX INFO: renamed from: com.transsion.home.adapter.trending.provider.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C15042i extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final int f52551e;

    public C15042i(int i11) {
        this.f52551e = (AbstractC5806y.m27489e() - AbstractC5776a0.m27313a(((i11 - 1) * 8) + 24.0f)) / i11;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return PostItemType.GRID_SUBJECT.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_grid_feeds_subject;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, OperateItem item) {
        String url;
        Cover cover;
        String thumbnail;
        Cover cover2;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        ShapeableImageView shapeableImageView = (ShapeableImageView) helper.getView(R$id.iv_cover);
        C23860f.b bVarM94457m = C23860f.f72909a.m94457m(m36338k());
        Subject feedsSubject = item.getFeedsSubject();
        String str = "";
        if (feedsSubject == null || (cover2 = feedsSubject.getCover()) == null || (url = cover2.getUrl()) == null) {
            url = "";
        }
        C23860f.b bVarM94468g = bVarM94457m.m94468g(url);
        Subject feedsSubject2 = item.getFeedsSubject();
        if (feedsSubject2 != null && (cover = feedsSubject2.getCover()) != null && (thumbnail = cover.getThumbnail()) != null) {
            str = thumbnail;
        }
        bVarM94468g.m94473l(str).m94474m(this.f52551e).m94465d(shapeableImageView);
        int i11 = R$id.tv_title;
        Subject feedsSubject3 = item.getFeedsSubject();
        helper.setText(i11, feedsSubject3 != null ? feedsSubject3.getTitle() : null);
        CornerTextView cornerTextView = (CornerTextView) helper.getView(R$id.tv_tips);
        Subject feedsSubject4 = item.getFeedsSubject();
        String corner = feedsSubject4 != null ? feedsSubject4.getCorner() : null;
        Subject feedsSubject5 = item.getFeedsSubject();
        cornerTextView.setTextWithType(corner, feedsSubject5 != null ? feedsSubject5.getSubjectType() : null);
    }
}
