package com.transsion.subtitle.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.AbstractC2397b;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.p282tn.lib.widget.R$color;
import com.transsion.subtitle.R$drawable;
import com.transsion.subtitle.R$id;
import com.transsion.subtitle.R$layout;
import com.transsion.subtitle.R$mipmap;
import com.transsion.web.api.WebConstants;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p528ju.C24469a;
import p801u6.AbstractC27943h;
import p801u6.C27941f;
import p801u6.InterfaceC27944i;
import p928y0.AbstractC28698h;

/* JADX INFO: renamed from: com.transsion.subtitle.adapter.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\rJ!\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J!\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J!\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u001e\u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0012H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0012H\u0007¢\u0006\u0004\b&\u0010$J-\u0010*\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0014¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b,\u0010\rR\u0016\u0010\"\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.¨\u00060"}, m97100d2 = {"Lcom/transsion/subtitle/adapter/b;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lju/a;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lu6/i;", "", "dataList", "<init>", "(Ljava/util/List;)V", "holder", WebConstants.FIELD_ITEM, "", "M1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lju/a;)V", "H1", "N1", "Landroid/widget/ImageView;", "imgView", "", "isOpenSubtitle", "J1", "(Landroid/widget/ImageView;Z)V", "I1", "L1", "K1", "", "D1", "(Z)I", "Landroid/content/Context;", "context", "resId", "Landroid/graphics/drawable/Drawable;", "E1", "(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "isBilingual", "F1", "(Z)V", "isOpen", "G1", "", "", "payloads", "C1", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lju/a;Ljava/util/List;)V", "B1", "F", "Z", "G", "VideoSubtitle_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final class C19657b extends BaseQuickAdapter implements InterfaceC27944i {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean isBilingual;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean isOpenSubtitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19657b(List<C24469a> dataList) {
        super(R$layout.dialog_subtitle_lan_list_item, dataList);
        Intrinsics.m97802h(dataList, "dataList");
        this.isOpenSubtitle = true;
    }

    /* JADX INFO: renamed from: D1 */
    private final int m81955D1(boolean isOpenSubtitle) {
        return isOpenSubtitle ? AbstractC2397b.getColor(Utils.m27275a(), R$color.white) : AbstractC2397b.getColor(Utils.m27275a(), R$color.white_40);
    }

    /* JADX INFO: renamed from: E1 */
    private final Drawable m81956E1(Context context, int resId) {
        return AbstractC28698h.m110689e(context.getResources(), resId, context.getTheme());
    }

    /* JADX INFO: renamed from: H1 */
    private final void m81957H1(BaseViewHolder holder, C24469a item) {
        int i11;
        TextView textView = (TextView) holder.getView(R$id.ivBilingual);
        if (TextUtils.isEmpty(item.m96010a())) {
            i11 = 8;
        } else {
            textView.setText(item.m96010a());
            i11 = 0;
        }
        textView.setVisibility(i11);
        textView.setTextColor(m81955D1(this.isOpenSubtitle));
    }

    /* JADX INFO: renamed from: I1 */
    private final void m81958I1(ImageView imgView, boolean isOpenSubtitle) {
        if (imgView != null) {
            if (isOpenSubtitle) {
                imgView.setImageResource(R$mipmap.subtitle_ic_download_group_selected);
            } else {
                imgView.setImageResource(R$mipmap.subtitle_ic_download_group_selected_2);
            }
        }
    }

    /* JADX INFO: renamed from: J1 */
    private final void m81959J1(ImageView imgView, boolean isOpenSubtitle) {
        if (imgView != null) {
            if (isOpenSubtitle) {
                imgView.setImageResource(R$drawable.subtitle_ic_download_group_unselected);
            } else {
                imgView.setImageResource(R$drawable.subtitle_ic_download_group_unselected_2);
            }
        }
    }

    /* JADX INFO: renamed from: K1 */
    private final void m81960K1(ImageView imgView, boolean isOpenSubtitle) {
        if (imgView != null) {
            if (isOpenSubtitle) {
                imgView.setImageResource(R$drawable.subtitle_download_no);
            } else {
                imgView.setImageResource(R$drawable.subtitle_download_no_2);
            }
        }
    }

    /* JADX INFO: renamed from: L1 */
    private final void m81961L1(ImageView imgView, boolean isOpenSubtitle) {
        if (imgView != null) {
            if (isOpenSubtitle) {
                imgView.setImageResource(R$drawable.subtitle_checked);
            } else {
                imgView.setImageResource(R$drawable.subtitle_checked_2);
            }
        }
    }

    /* JADX INFO: renamed from: M1 */
    private final void m81962M1(BaseViewHolder holder, C24469a item) {
        m81957H1(holder, item);
        TextView textView = (TextView) holder.getView(R$id.tvSubtitle);
        textView.setText(item.m96011b().getName());
        textView.setTextColor(m81955D1(this.isOpenSubtitle));
        m81963N1(holder, item);
    }

    /* JADX INFO: renamed from: N1 */
    private final void m81963N1(BaseViewHolder holder, C24469a item) {
        ProgressBar progressBar = (ProgressBar) holder.getView(R$id.progress);
        ImageView imageView = (ImageView) holder.getView(R$id.ivState);
        progressBar.setVisibility(8);
        imageView.setVisibility(0);
        if (this.isBilingual) {
            if (item.m96015f()) {
                m81958I1(imageView, this.isOpenSubtitle);
                return;
            }
            if (item.m96011b().getStatus() == 2) {
                progressBar.setVisibility(0);
                imageView.setVisibility(8);
                return;
            } else if (item.m96013d()) {
                m81959J1(imageView, this.isOpenSubtitle);
                return;
            } else {
                m81960K1(imageView, this.isOpenSubtitle);
                return;
            }
        }
        if (item.m96015f()) {
            m81961L1(imageView, this.isOpenSubtitle);
            return;
        }
        if (item.m96011b().getStatus() == 2) {
            progressBar.setVisibility(0);
            imageView.setVisibility(8);
        } else if (item.m96013d()) {
            imageView.setVisibility(4);
        } else {
            m81960K1(imageView, this.isOpenSubtitle);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public void mo36106F(BaseViewHolder holder, C24469a item) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        m81962M1(holder, item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public void mo36108G(BaseViewHolder holder, C24469a item, List<? extends Object> payloads) {
        Intrinsics.m97802h(holder, "holder");
        Intrinsics.m97802h(item, "item");
        Intrinsics.m97802h(payloads, "payloads");
        super.mo36108G(holder, item, payloads);
        if (payloads.isEmpty()) {
            return;
        }
        Object obj = payloads.get(0);
        if (obj instanceof C24469a) {
            item.m96011b().setStatus(((C24469a) obj).m96011b().getStatus());
            m81963N1(holder, item);
            m81957H1(holder, item);
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: F1 */
    public final void m81966F1(boolean isBilingual) {
        this.isBilingual = isBilingual;
        notifyDataSetChanged();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: G1 */
    public final void m81967G1(boolean isOpen) {
        this.isOpenSubtitle = isOpen;
        notifyDataSetChanged();
    }

    @Override // p801u6.InterfaceC27944i
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ C27941f mo63848b(BaseQuickAdapter baseQuickAdapter) {
        return AbstractC27943h.m108679a(this, baseQuickAdapter);
    }
}
