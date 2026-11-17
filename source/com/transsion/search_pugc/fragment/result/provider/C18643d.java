package com.transsion.search_pugc.fragment.result.provider;

import android.widget.TextView;
import com.chad.library.adapter.base.provider.BaseItemProvider;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsion.search.R$id;
import com.transsion.search.R$layout;
import com.transsion.search_pugc.C18670g;
import com.transsion.search_pugc.bean.SearchResultItem;
import com.transsion.search_pugc.constant.AbstractC18568a;
import com.transsion.search_pugc.constant.SearchType;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoHashTag;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.search_pugc.fragment.result.provider.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C18643d extends BaseItemProvider implements InterfaceC18659t {

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ InterfaceC18659t f60231e;

    public C18643d(InterfaceC18659t reportable) {
        Intrinsics.m97802h(reportable, "reportable");
        this.f60231e = reportable;
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: a */
    public void mo78412a(UGCVideo ugcVideo, int i11) {
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        this.f60231e.mo78412a(ugcVideo, i11);
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: c */
    public void mo78413c(UGCVideo ugcVideo, int i11) {
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        this.f60231e.mo78413c(ugcVideo, i11);
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: d */
    public void mo78414d(SearchResultItem item, int i11) {
        Intrinsics.m97802h(item, "item");
        this.f60231e.mo78414d(item, i11);
    }

    @Override // com.transsion.search_pugc.fragment.result.provider.InterfaceC18659t
    /* JADX INFO: renamed from: e */
    public void mo78415e(UGCVideo ugcVideo, int i11) {
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        this.f60231e.mo78415e(ugcVideo, i11);
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: l */
    public int mo22758l() {
        return SearchType.HASH_TAG.ordinal();
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: m */
    public int mo22759m() {
        return R$layout.provider_result_hashtag;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void mo22757b(BaseViewHolder helper, SearchResultItem item) {
        String title;
        Intrinsics.m97802h(helper, "helper");
        Intrinsics.m97802h(item, "item");
        TextView textView = (TextView) helper.getView(R$id.f59667tv);
        UGCVideoHashTag hashTag = item.getHashTag();
        textView.setText(String.valueOf((hashTag == null || (title = hashTag.getTitle()) == null) ? null : AbstractC18568a.m78231d(title, m36338k(), C18670g.f60281h.m78520a(m36338k()).m78498e())));
    }
}
