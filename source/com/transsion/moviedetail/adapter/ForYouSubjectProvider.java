package com.transsion.moviedetail.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5806y;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.material.imageview.ShapeableImageView;
import com.transsion.moviedetail.R$id;
import com.transsion.moviedetail.R$layout;
import com.transsion.moviedetailapi.SubjectLayoutStyle;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.LayoutStyle;
import com.transsion.moviedetailapi.bean.Subject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p462hj.C23860f;

/* JADX INFO: loaded from: classes6.dex */
final class ForYouSubjectProvider extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final Subject f54447e;

    /* JADX INFO: renamed from: f */
    private final int f54448f;

    /* JADX INFO: renamed from: g */
    private final int f54449g;

    /* JADX INFO: renamed from: h */
    private final float f54450h;

    /* JADX INFO: renamed from: i */
    private final float f54451i;

    public ForYouSubjectProvider(Subject subject, int i11) {
        this.f54447e = subject;
        this.f54448f = i11;
        int iM27489e = AbstractC5806y.m27489e();
        this.f54449g = iM27489e;
        float fM27313a = (iM27489e - AbstractC5776a0.m27313a(((i11 - 1) * 8) + 24)) / i11;
        this.f54450h = fM27313a;
        this.f54451i = (fM27313a * 149.0f) / 107.0f;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return 1002;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        LayoutStyle style;
        Subject subject = this.f54447e;
        if (subject != null) {
            Integer subjectType = subject.getSubjectType();
            int value = SubjectType.MUSIC.getValue();
            if (subjectType != null && subjectType.intValue() == value) {
                return R$layout.movie_detail_item_for_you_hor;
            }
        }
        Subject subject2 = this.f54447e;
        String shape = (subject2 == null || (style = subject2.getStyle()) == null) ? null : style.getShape();
        if (Intrinsics.m97797c(shape, SubjectLayoutStyle.Horizontal.getValue())) {
            return R$layout.movie_detail_item_for_you_hor;
        }
        return Intrinsics.m97797c(shape, SubjectLayoutStyle.Square.getValue()) ? R$layout.movie_detail_item_for_you_square : R$layout.movie_detail_item_for_you;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder holder, Subject item) {
        String thumbnail;
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.C4232b) {
            ((StaggeredGridLayoutManager.C4232b) layoutParams).m21016c(false);
        }
        ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getViewOrNull(R$id.iv_cover);
        if (shapeableImageView != null) {
            if (item.getBuiltIn()) {
                AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99269c()), null, null, new ForYouSubjectProvider$convert$1$1(item, shapeableImageView, null), 3, null);
            } else {
                C23860f.a aVar = C23860f.f72909a;
                Context context = shapeableImageView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                C23860f.b bVarM94457m = aVar.m94457m(context);
                Cover cover = item.getCover();
                C23860f.b bVarM94464c = bVarM94457m.m94468g(cover != null ? cover.getUrl() : null).m94474m((int) this.f54450h).m94464c((int) this.f54451i);
                Cover cover2 = item.getCover();
                if (cover2 == null || (thumbnail = cover2.getThumbnail()) == null) {
                    thumbnail = "";
                }
                bVarM94464c.m94473l(thumbnail).m94465d(shapeableImageView);
            }
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) holder.getViewOrNull(R$id.tv_title);
        if (appCompatTextView != null) {
            appCompatTextView.setText(item.getTitle());
        }
        TextView textView = (TextView) holder.getView(R$id.tv_for_you_corner);
        textView.setText(item.getCorner());
        String corner = item.getCorner();
        textView.setVisibility(corner == null || corner.length() == 0 ? 8 : 0);
    }
}
