package com.transsion.home.adapter.suboperate.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import ck.AbstractC5114k;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.p282tn.lib.widget.R$string;
import com.transsion.baselib.helper.C14450a;
import com.transsion.baselib.helper.C14451b;
import com.transsion.gslb.Utils;
import com.transsion.home.R$id;
import com.transsion.home.adapter.suboperate.provider.C14971i;
import com.transsion.home.bean.BannerData;
import com.transsion.home.bean.OperateItem;
import com.transsion.home.fragment.tab.SubTabFragment;
import com.transsion.moviedetailapi.bean.Image;
import com.transsnet.downloader.DownloadManagerApi;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import ml.AbstractC25888b;
import p462hj.C23860f;
import p743rh.C27287m;
import p944yh.C28951b;
import sh.C27621h;

/* JADX INFO: loaded from: classes5.dex */
public final class SubBannerViewHolder extends RecyclerView.AbstractC4203b0 {

    /* JADX INFO: renamed from: a */
    private final int f52158a;

    /* JADX INFO: renamed from: b */
    private final C14971i f52159b;

    /* JADX INFO: renamed from: c */
    private final OperateItem f52160c;

    /* JADX INFO: renamed from: d */
    private final View f52161d;

    /* JADX INFO: renamed from: e */
    private final View f52162e;

    /* JADX INFO: renamed from: f */
    private final ImageView f52163f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubBannerViewHolder(View itemView, int i11, C14971i bannerProvider, OperateItem operateItem) {
        super(itemView);
        Intrinsics.m97802h(itemView, "itemView");
        Intrinsics.m97802h(bannerProvider, "bannerProvider");
        Intrinsics.m97802h(operateItem, "operateItem");
        this.f52158a = i11;
        this.f52159b = bannerProvider;
        this.f52160c = operateItem;
        View viewFindViewById = itemView.findViewById(R$id.home_sub_pager_items_status);
        Intrinsics.m97801g(viewFindViewById, "findViewById(...)");
        this.f52161d = viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.home_sub_pager_items_top_mask);
        Intrinsics.m97801g(viewFindViewById2, "findViewById(...)");
        this.f52162e = viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.home_sub_pager_item_image);
        Intrinsics.m97801g(viewFindViewById3, "findViewById(...)");
        this.f52163f = (ImageView) viewFindViewById3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m66926h(BannerData bannerData, SubBannerViewHolder subBannerViewHolder, int i11, View view) {
        String deepLink = bannerData.getDeepLink();
        if (deepLink != null) {
            if (!C27287m.f83003a.m106330e()) {
                C28951b.f88586a.m111454d(R$string.no_network_toast);
                return;
            }
            Uri uriM65157g = C14451b.f50862a.m65157g(Uri.parse(deepLink + "&module_name=opt_banner_free&autoPlay=true&ops=" + bannerData.getOps()));
            if (uriM65157g != null) {
                AbstractC5114k.m23932o(uriM65157g);
            }
            subBannerViewHolder.m66929k(bannerData, i11, DownloadManagerApi.m87075x0(DownloadManagerApi.f66480j.m87093a(), bannerData.getSubjectId(), null, false, false, 12, null) ? "play_subject" : "download_subject");
        }
    }

    /* JADX INFO: renamed from: i */
    private final GradientDrawable m66927i(String str) {
        int color = Color.parseColor(str);
        int iRed = Color.red(color);
        int iGreen = Color.green(color);
        int iBlue = Color.blue(color);
        int iArgb = Color.argb(255, iRed, iGreen, iBlue);
        int iArgb2 = Color.argb(153, iRed, iGreen, iBlue);
        int iArgb3 = Color.argb(0, iRed, iGreen, iBlue);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setColors(new int[]{iArgb, iArgb2, iArgb3});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: j */
    private final void m66928j(BannerData bannerData, int i11) {
        if (this.f52159b.m67153T(bannerData != null ? bannerData.getSubjectId() : null)) {
            HashMap map = new HashMap();
            map.put("event_type", "browse_banner");
            map.put("sequence", String.valueOf(i11));
            map.put("tabId", String.valueOf(this.f52158a));
            if (bannerData != null) {
                AbstractC25888b.m101680c(bannerData, map);
            }
            AbstractC25888b.m101678a(this.f52160c, map);
            C14450a.f50860a.m65142e(SubTabFragment.INSTANCE.m68282a(this.f52158a), map);
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m66929k(BannerData bannerData, int i11, String str) {
        HashMap map = new HashMap();
        map.put("event_type", "click_banner_poster");
        map.put("sequence", String.valueOf(i11));
        map.put("module_name", str);
        map.put("tabId", String.valueOf(this.f52158a));
        if (bannerData != null) {
            AbstractC25888b.m101680c(bannerData, map);
        }
        AbstractC25888b.m101678a(this.f52160c, map);
        C14450a.f50860a.m65143f(SubTabFragment.INSTANCE.m68282a(this.f52158a), map);
    }

    /* JADX INFO: renamed from: g */
    public final void m66930g(final BannerData bannerData, final int i11) {
        String url;
        String thumbnail;
        if (bannerData == null) {
            return;
        }
        C27621h c27621h = C27621h.f84745a;
        Context context = this.f52163f.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        int iM107455e = c27621h.m107455e(context);
        if (bannerData.getBuiltIn()) {
            AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new SubBannerViewHolder$bindData$1(bannerData, this, null), 3, null);
        } else {
            C23860f.a aVar = C23860f.f72909a;
            Context context2 = this.f52163f.getContext();
            Intrinsics.m97801g(context2, "getContext(...)");
            C23860f.b bVarM94457m = aVar.m94457m(context2);
            Image image = bannerData.getImage();
            String str = "";
            if (image == null || (url = image.getUrl()) == null) {
                url = "";
            }
            C23860f.b bVarM94474m = bVarM94457m.m94468g(url).m94474m(iM107455e);
            Image image2 = bannerData.getImage();
            if (image2 != null && (thumbnail = image2.getThumbnail()) != null) {
                str = thumbnail;
            }
            bVarM94474m.m94473l(str).m94465d(this.f52163f);
        }
        this.f52161d.getLayoutParams().height = AbstractC5781d.m27351c() + AbstractC5776a0.m27313a(44.0f);
        Image image3 = bannerData.getImage();
        String averageHueDark = image3 != null ? image3.getAverageHueDark() : null;
        if (averageHueDark != null && StringsKt.m98132c0(averageHueDark, Utils.SEPARATOR, false, 2, null)) {
            this.f52161d.setBackgroundColor(Color.parseColor(averageHueDark));
            this.f52162e.setBackground(m66927i(averageHueDark));
        }
        m66928j(bannerData, i11);
        this.f52163f.setOnClickListener(new View.OnClickListener() { // from class: com.transsion.home.adapter.suboperate.adapter.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubBannerViewHolder.m66926h(bannerData, this, i11, view);
            }
        });
    }

    public final ImageView getImageView() {
        return this.f52163f;
    }
}
