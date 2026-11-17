package com.transsion.home.p294tv.adapter;

import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.imageview.ShapeableImageView;
import com.noober.background.view.BLTextView;
import com.transsion.home.R$drawable;
import com.transsion.home.R$id;
import com.transsion.home.R$layout;
import com.transsion.home.p294tv.bean.ImageInfo;
import com.transsion.home.p294tv.bean.TvChannelItem;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p462hj.C23860f;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;

/* JADX INFO: renamed from: com.transsion.home.tv.adapter.h */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rR.\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R.\u0010\u001f\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m97100d2 = {"Lcom/transsion/home/tv/adapter/h;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/transsion/home/tv/bean/TvChannelItem;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "<init>", "()V", "holder", WebConstants.FIELD_ITEM, "", "C1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/transsion/home/tv/bean/TvChannelItem;)V", "B0", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;)V", "Lkotlin/Function1;", "", "F", "Lkotlin/jvm/functions/Function1;", "D1", "()Lkotlin/jvm/functions/Function1;", "G1", "(Lkotlin/jvm/functions/Function1;)V", "onPositionScroll", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "G", "Ljava/lang/String;", "E1", "()Ljava/lang/String;", "H1", "(Ljava/lang/String;)V", "selectedChannelId", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class C15451h extends BaseQuickAdapter implements InterfaceC27944i {

    /* JADX INFO: renamed from: H */
    public static final int f53426H = 8;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private Function1<? super Integer, Unit> onPositionScroll;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private String selectedChannelId;

    public C15451h() {
        super(R$layout.item_tv_channel, null, 2, null);
        this.onPositionScroll = new Function1() { // from class: com.transsion.home.tv.adapter.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C15451h.m68586F1(((Integer) obj).intValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public static final Unit m68586F1(int i11) {
        return Unit.f75682a;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: B0 */
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        Intrinsics.m97802h(holder, "holder");
        super.onViewAttachedToWindow(holder);
        this.onPositionScroll.invoke(Integer.valueOf(holder.getBindingAdapterPosition()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, TvChannelItem item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        boolean z11 = item.getChannelId() != null && Intrinsics.m97797c(item.getChannelId(), this.selectedChannelId);
        holder.itemView.setSelected(z11);
        BLTextView bLTextView = (BLTextView) holder.getView(R$id.tvChannelName);
        String title = item.getTitle();
        if (title == null) {
            title = "";
        }
        bLTextView.setText(title);
        bLTextView.setSelected(z11);
        BLTextView bLTextView2 = (BLTextView) holder.getView(R$id.tvLanguage);
        List<String> languageCodes = item.getLanguageCodes();
        String str = languageCodes != null ? (String) CollectionsKt.m97361k0(languageCodes) : null;
        if (str == null) {
            str = "";
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.m97801g(upperCase, "toUpperCase(...)");
        bLTextView2.setText(upperCase);
        bLTextView2.setSelected(z11);
        ImageView imageView = (ImageView) holder.getView(R$id.ivSignalIcon);
        if (z11) {
            Intrinsics.m97799e(Glide.with(imageView).asGif().load2(Integer.valueOf(R$drawable.ic_tv_channel_signal)).into(imageView));
        } else {
            Glide.with(imageView).clear(imageView);
            imageView.setImageResource(R$drawable.ic_tv_channel_signal_dim);
        }
        ShapeableImageView shapeableImageView = (ShapeableImageView) holder.getView(R$id.ivChannelFlag);
        ImageInfo countryFlagImage = item.getCountryFlagImage();
        String url = countryFlagImage != null ? countryFlagImage.getUrl() : null;
        String str2 = url != null ? url : "";
        if (TextUtils.isEmpty(str2)) {
            shapeableImageView.setImageResource(R$drawable.ic_tv_country_flag_default);
        } else {
            C23860f.f72909a.m94457m(getContext()).m94468g(str2).m94473l(str2).m94470i(R$drawable.ic_tv_country_flag_default).m94465d(shapeableImageView);
        }
    }

    /* JADX INFO: renamed from: D1 */
    public final Function1<Integer, Unit> m68588D1() {
        return this.onPositionScroll;
    }

    /* JADX INFO: renamed from: E1, reason: from getter */
    public final String getSelectedChannelId() {
        return this.selectedChannelId;
    }

    /* JADX INFO: renamed from: G1 */
    public final void m68590G1(Function1<? super Integer, Unit> function1) {
        Intrinsics.m97802h(function1, "<set-?>");
        this.onPositionScroll = function1;
    }

    /* JADX INFO: renamed from: H1 */
    public final void m68591H1(String str) {
        int i11;
        if (Intrinsics.m97797c(this.selectedChannelId, str)) {
            return;
        }
        String str2 = this.selectedChannelId;
        this.selectedChannelId = str;
        Iterator<Object> it = getData().iterator();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i11 = -1;
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (Intrinsics.m97797c(((TvChannelItem) it.next()).getChannelId(), str2)) {
                break;
            } else {
                i13++;
            }
        }
        Iterator<Object> it2 = getData().iterator();
        while (it2.hasNext()) {
            if (Intrinsics.m97797c(((TvChannelItem) it2.next()).getChannelId(), str)) {
                i11 = i12;
                break;
            }
            i12++;
        }
        if (i13 >= 0) {
            notifyItemChanged(i13);
        }
        if (i11 >= 0) {
            notifyItemChanged(i11);
        }
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
