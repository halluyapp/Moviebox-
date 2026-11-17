package com.transsion.search_pugc.fragment.result.provider;

import android.content.Context;
import android.text.SpannableString;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search_pugc.C18670g;
import com.transsion.search_pugc.constant.AbstractC18568a;
import com.transsion.search_pugc.constant.ResultCollectItemWrapper;
import com.transsion.ugcvideodetail.api.UGCVideoTypeKt;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p462hj.C23860f;

/* JADX INFO: renamed from: com.transsion.search_pugc.fragment.result.provider.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C18641b extends BaseItemProvider {

    /* JADX INFO: renamed from: e */
    private final boolean f60228e;

    /* JADX INFO: renamed from: f */
    private final int f60229f;

    public C18641b() {
        this(false, 1, null);
    }

    public C18641b(boolean z11) {
        this.f60228e = z11;
        this.f60229f = ResultCollectItemWrapper.Type.DATA.ordinal();
    }

    public /* synthetic */ C18641b(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return this.f60229f;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.item_search_collection;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4  */
    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, ResultCollectItemWrapper item) {
        String title;
        String thumbnail;
        Cover cover;
        String url;
        Cover cover2;
        UGCVideo uGCVideoM78226a;
        String title2;
        Long duration;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        int i11 = R$id.v_corner;
        UGCVideo uGCVideoM78226a2 = item.m78226a();
        SpannableString spannableStringM78231d = null;
        String corner = uGCVideoM78226a2 != null ? uGCVideoM78226a2.getCorner() : null;
        helper.setVisible(i11, !(corner == null || corner.length() == 0));
        int i12 = R$id.tv_view_resource_corner;
        UGCVideo uGCVideoM78226a3 = item.m78226a();
        helper.setText(i12, uGCVideoM78226a3 != null ? uGCVideoM78226a3.getCorner() : null);
        int i13 = R$id.tv_view_resource_tag;
        UGCVideo uGCVideoM78226a4 = item.m78226a();
        helper.setText(i13, (uGCVideoM78226a4 == null || (duration = uGCVideoM78226a4.getDuration()) == null) ? null : AbstractC18568a.m78237j(duration.longValue()));
        UGCVideo uGCVideoM78226a5 = item.m78226a();
        if (uGCVideoM78226a5 != null) {
            UGCVideoTypeKt.m83628i((ImageView) helper.getView(R$id.iv_view_resource_tag), uGCVideoM78226a5, null, 4, null);
        } else {
            helper.setImageResource(R$id.iv_view_resource_tag, UGCVideoTypeKt.m83624e(null));
        }
        TextView textView = (TextView) helper.getView(R$id.tv_title);
        if (this.f60228e) {
            textView.setLines(1);
            UGCVideo uGCVideoM78226a6 = item.m78226a();
            if (uGCVideoM78226a6 == null || (title2 = uGCVideoM78226a6.getEpTitle()) == null) {
                uGCVideoM78226a = item.m78226a();
                if (uGCVideoM78226a != null) {
                    title2 = uGCVideoM78226a.getTitle();
                } else {
                    title2 = null;
                }
            } else {
                if (StringsKt.m98160q0(title2)) {
                    title2 = null;
                }
                if (title2 == null) {
                    uGCVideoM78226a = item.m78226a();
                    if (uGCVideoM78226a != null) {
                        title2 = uGCVideoM78226a.getTitle();
                    } else {
                        title2 = null;
                    }
                }
            }
            if (title2 != null) {
                Context context = textView.getContext();
                Intrinsics.m97801g(context, "getContext(...)");
                spannableStringM78231d = AbstractC18568a.m78231d(title2, context, C18670g.f60281h.m78520a(textView.getContext()).m78498e());
            }
        } else {
            textView.setLines(2);
            UGCVideo uGCVideoM78226a7 = item.m78226a();
            if (uGCVideoM78226a7 != null && (title = uGCVideoM78226a7.getTitle()) != null) {
                Context context2 = textView.getContext();
                Intrinsics.m97801g(context2, "getContext(...)");
                spannableStringM78231d = AbstractC18568a.m78231d(title, context2, C18670g.f60281h.m78520a(textView.getContext()).m78498e());
            }
        }
        textView.setText(spannableStringM78231d);
        C23860f.b bVarM94457m = C23860f.f72909a.m94457m(m36338k());
        UGCVideo uGCVideoM78226a8 = item.m78226a();
        String str = "";
        if (uGCVideoM78226a8 == null || (cover2 = uGCVideoM78226a8.getCover()) == null || (thumbnail = cover2.getThumbnail()) == null) {
            thumbnail = "";
        }
        C23860f.b bVarM94473l = bVarM94457m.m94473l(thumbnail);
        UGCVideo uGCVideoM78226a9 = item.m78226a();
        if (uGCVideoM78226a9 != null && (cover = uGCVideoM78226a9.getCover()) != null && (url = cover.getUrl()) != null) {
            str = url;
        }
        bVarM94473l.m94468g(str).m94465d((ImageView) helper.getView(R$id.iv_cover));
    }
}
