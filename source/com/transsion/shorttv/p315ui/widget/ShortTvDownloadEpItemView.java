package com.transsion.shorttv.p315ui.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.AbstractC2397b;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.bumptech.glide.Glide;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.noober.background.drawable.DrawableCreator;
import com.noober.background.view.BLTextView;
import com.transsion.push.PushConstants;
import com.transsion.shorttv.R$color;
import com.transsion.shorttv.R$drawable;
import com.transsion.shorttv.R$mipmap;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p356ds.AbstractC23048b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u0018R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010(\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#R\u0014\u0010*\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010#¨\u0006+"}, m97100d2 = {"Lcom/transsion/shorttv/ui/widget/ShortTvDownloadEpItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "useForEpList", "()V", "useForDownloadList", "ep", "showIndex", "(I)V", "", "select", "setSelect", "(Z)V", PushConstants.PUSH_SERVICE_TYPE_SHOW, "showPlayingImg", "showLockedImg", "showDownloadedImg", "Lcom/noober/background/view/BLTextView;", "a", "Lcom/noober/background/view/BLTextView;", "textView", "Landroid/widget/ImageView;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroid/widget/ImageView;", "lockImg", "c", "downloadedImg", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "playingImg", "e", "selectImg", "shortTvLib_release"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SourceDebugExtension
public final class ShortTvDownloadEpItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final BLTextView textView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ImageView lockImg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ImageView downloadedImg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ImageView playingImg;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ImageView selectImg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTvDownloadEpItemView(Context context) {
        super(context);
        Intrinsics.m97802h(context, "context");
        BLTextView bLTextView = new BLTextView(getContext());
        this.textView = bLTextView;
        ImageView imageView = new ImageView(getContext());
        this.lockImg = imageView;
        ImageView imageView2 = new ImageView(getContext());
        this.downloadedImg = imageView2;
        ImageView imageView3 = new ImageView(getContext());
        this.playingImg = imageView3;
        ImageView imageView4 = new ImageView(getContext());
        this.selectImg = imageView4;
        int iM27313a = AbstractC5776a0.m27313a(4.0f);
        int iM27313a2 = AbstractC5776a0.m27313a(6.0f);
        bLTextView.setBackground(new DrawableCreator.Builder().setCornersRadius(iM27313a).setSolidColor(getContext().getResources().getColor(R$color.short_tv_white_10)).build());
        ConstraintLayout.C2308b c2308b = new ConstraintLayout.C2308b(-1, 0);
        c2308b.f7934I = "h,1:1";
        c2308b.f7968i = 0;
        addView(bLTextView, c2308b);
        bLTextView.setTextSize(16.0f);
        bLTextView.setTextColor(AbstractC2397b.getColorStateList(getContext(), R$color.short_tv_selector_download_ep_text));
        bLTextView.setTypeface(Typeface.DEFAULT_BOLD);
        bLTextView.setGravity(17);
        imageView.setImageResource(R$mipmap.short_tv_ic_lock_new);
        ConstraintLayout.C2308b c2308b2 = new ConstraintLayout.C2308b(-2, -2);
        c2308b2.f7968i = 0;
        c2308b2.f7994v = 0;
        addView(imageView, c2308b2);
        imageView2.setImageResource(R$mipmap.short_tv_ic_download_sub);
        ConstraintLayout.C2308b c2308b3 = new ConstraintLayout.C2308b(-2, -2);
        c2308b3.f7968i = 0;
        c2308b3.f7994v = 0;
        addView(imageView2, c2308b3);
        imageView4.setImageDrawable(AbstractC2397b.getDrawable(getContext(), R$drawable.short_tv_selector_download_group_check));
        int i11 = iM27313a2 * 2;
        ConstraintLayout.C2308b c2308b4 = new ConstraintLayout.C2308b(i11, i11);
        c2308b4.f7994v = 0;
        c2308b4.f7974l = 0;
        c2308b4.setMarginEnd(iM27313a2);
        ((ViewGroup.MarginLayoutParams) c2308b4).bottomMargin = iM27313a2;
        addView(imageView4, c2308b4);
        int i12 = iM27313a * 4;
        ConstraintLayout.C2308b c2308b5 = new ConstraintLayout.C2308b(i12, i12);
        c2308b5.f7974l = 0;
        c2308b5.f7990t = 0;
        c2308b5.setMargins(iM27313a, iM27313a, iM27313a, iM27313a);
        imageView3.setColorFilter(AbstractC2397b.getColor(getContext(), R$color.short_tv_main));
        addView(imageView3, c2308b5);
        setPadding(iM27313a, 0, iM27313a, iM27313a * 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTvDownloadEpItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.m97802h(context, "context");
        BLTextView bLTextView = new BLTextView(getContext());
        this.textView = bLTextView;
        ImageView imageView = new ImageView(getContext());
        this.lockImg = imageView;
        ImageView imageView2 = new ImageView(getContext());
        this.downloadedImg = imageView2;
        ImageView imageView3 = new ImageView(getContext());
        this.playingImg = imageView3;
        ImageView imageView4 = new ImageView(getContext());
        this.selectImg = imageView4;
        int iM27313a = AbstractC5776a0.m27313a(4.0f);
        int iM27313a2 = AbstractC5776a0.m27313a(6.0f);
        bLTextView.setBackground(new DrawableCreator.Builder().setCornersRadius(iM27313a).setSolidColor(getContext().getResources().getColor(R$color.short_tv_white_10)).build());
        ConstraintLayout.C2308b c2308b = new ConstraintLayout.C2308b(-1, 0);
        c2308b.f7934I = "h,1:1";
        c2308b.f7968i = 0;
        addView(bLTextView, c2308b);
        bLTextView.setTextSize(16.0f);
        bLTextView.setTextColor(AbstractC2397b.getColorStateList(getContext(), R$color.short_tv_selector_download_ep_text));
        bLTextView.setTypeface(Typeface.DEFAULT_BOLD);
        bLTextView.setGravity(17);
        imageView.setImageResource(R$mipmap.short_tv_ic_lock_new);
        ConstraintLayout.C2308b c2308b2 = new ConstraintLayout.C2308b(-2, -2);
        c2308b2.f7968i = 0;
        c2308b2.f7994v = 0;
        addView(imageView, c2308b2);
        imageView2.setImageResource(R$mipmap.short_tv_ic_download_sub);
        ConstraintLayout.C2308b c2308b3 = new ConstraintLayout.C2308b(-2, -2);
        c2308b3.f7968i = 0;
        c2308b3.f7994v = 0;
        addView(imageView2, c2308b3);
        imageView4.setImageDrawable(AbstractC2397b.getDrawable(getContext(), R$drawable.short_tv_selector_download_group_check));
        int i11 = iM27313a2 * 2;
        ConstraintLayout.C2308b c2308b4 = new ConstraintLayout.C2308b(i11, i11);
        c2308b4.f7994v = 0;
        c2308b4.f7974l = 0;
        c2308b4.setMarginEnd(iM27313a2);
        ((ViewGroup.MarginLayoutParams) c2308b4).bottomMargin = iM27313a2;
        addView(imageView4, c2308b4);
        int i12 = iM27313a * 4;
        ConstraintLayout.C2308b c2308b5 = new ConstraintLayout.C2308b(i12, i12);
        c2308b5.f7974l = 0;
        c2308b5.f7990t = 0;
        c2308b5.setMargins(iM27313a, iM27313a, iM27313a, iM27313a);
        imageView3.setColorFilter(AbstractC2397b.getColor(getContext(), R$color.short_tv_main));
        addView(imageView3, c2308b5);
        setPadding(iM27313a, 0, iM27313a, iM27313a * 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTvDownloadEpItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        BLTextView bLTextView = new BLTextView(getContext());
        this.textView = bLTextView;
        ImageView imageView = new ImageView(getContext());
        this.lockImg = imageView;
        ImageView imageView2 = new ImageView(getContext());
        this.downloadedImg = imageView2;
        ImageView imageView3 = new ImageView(getContext());
        this.playingImg = imageView3;
        ImageView imageView4 = new ImageView(getContext());
        this.selectImg = imageView4;
        int iM27313a = AbstractC5776a0.m27313a(4.0f);
        int iM27313a2 = AbstractC5776a0.m27313a(6.0f);
        bLTextView.setBackground(new DrawableCreator.Builder().setCornersRadius(iM27313a).setSolidColor(getContext().getResources().getColor(R$color.short_tv_white_10)).build());
        ConstraintLayout.C2308b c2308b = new ConstraintLayout.C2308b(-1, 0);
        c2308b.f7934I = "h,1:1";
        c2308b.f7968i = 0;
        addView(bLTextView, c2308b);
        bLTextView.setTextSize(16.0f);
        bLTextView.setTextColor(AbstractC2397b.getColorStateList(getContext(), R$color.short_tv_selector_download_ep_text));
        bLTextView.setTypeface(Typeface.DEFAULT_BOLD);
        bLTextView.setGravity(17);
        imageView.setImageResource(R$mipmap.short_tv_ic_lock_new);
        ConstraintLayout.C2308b c2308b2 = new ConstraintLayout.C2308b(-2, -2);
        c2308b2.f7968i = 0;
        c2308b2.f7994v = 0;
        addView(imageView, c2308b2);
        imageView2.setImageResource(R$mipmap.short_tv_ic_download_sub);
        ConstraintLayout.C2308b c2308b3 = new ConstraintLayout.C2308b(-2, -2);
        c2308b3.f7968i = 0;
        c2308b3.f7994v = 0;
        addView(imageView2, c2308b3);
        imageView4.setImageDrawable(AbstractC2397b.getDrawable(getContext(), R$drawable.short_tv_selector_download_group_check));
        int i12 = iM27313a2 * 2;
        ConstraintLayout.C2308b c2308b4 = new ConstraintLayout.C2308b(i12, i12);
        c2308b4.f7994v = 0;
        c2308b4.f7974l = 0;
        c2308b4.setMarginEnd(iM27313a2);
        ((ViewGroup.MarginLayoutParams) c2308b4).bottomMargin = iM27313a2;
        addView(imageView4, c2308b4);
        int i13 = iM27313a * 4;
        ConstraintLayout.C2308b c2308b5 = new ConstraintLayout.C2308b(i13, i13);
        c2308b5.f7974l = 0;
        c2308b5.f7990t = 0;
        c2308b5.setMargins(iM27313a, iM27313a, iM27313a, iM27313a);
        imageView3.setColorFilter(AbstractC2397b.getColor(getContext(), R$color.short_tv_main));
        addView(imageView3, c2308b5);
        setPadding(iM27313a, 0, iM27313a, iM27313a * 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortTvDownloadEpItemView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.m97802h(context, "context");
        BLTextView bLTextView = new BLTextView(getContext());
        this.textView = bLTextView;
        ImageView imageView = new ImageView(getContext());
        this.lockImg = imageView;
        ImageView imageView2 = new ImageView(getContext());
        this.downloadedImg = imageView2;
        ImageView imageView3 = new ImageView(getContext());
        this.playingImg = imageView3;
        ImageView imageView4 = new ImageView(getContext());
        this.selectImg = imageView4;
        int iM27313a = AbstractC5776a0.m27313a(4.0f);
        int iM27313a2 = AbstractC5776a0.m27313a(6.0f);
        bLTextView.setBackground(new DrawableCreator.Builder().setCornersRadius(iM27313a).setSolidColor(getContext().getResources().getColor(R$color.short_tv_white_10)).build());
        ConstraintLayout.C2308b c2308b = new ConstraintLayout.C2308b(-1, 0);
        c2308b.f7934I = "h,1:1";
        c2308b.f7968i = 0;
        addView(bLTextView, c2308b);
        bLTextView.setTextSize(16.0f);
        bLTextView.setTextColor(AbstractC2397b.getColorStateList(getContext(), R$color.short_tv_selector_download_ep_text));
        bLTextView.setTypeface(Typeface.DEFAULT_BOLD);
        bLTextView.setGravity(17);
        imageView.setImageResource(R$mipmap.short_tv_ic_lock_new);
        ConstraintLayout.C2308b c2308b2 = new ConstraintLayout.C2308b(-2, -2);
        c2308b2.f7968i = 0;
        c2308b2.f7994v = 0;
        addView(imageView, c2308b2);
        imageView2.setImageResource(R$mipmap.short_tv_ic_download_sub);
        ConstraintLayout.C2308b c2308b3 = new ConstraintLayout.C2308b(-2, -2);
        c2308b3.f7968i = 0;
        c2308b3.f7994v = 0;
        addView(imageView2, c2308b3);
        imageView4.setImageDrawable(AbstractC2397b.getDrawable(getContext(), R$drawable.short_tv_selector_download_group_check));
        int i13 = iM27313a2 * 2;
        ConstraintLayout.C2308b c2308b4 = new ConstraintLayout.C2308b(i13, i13);
        c2308b4.f7994v = 0;
        c2308b4.f7974l = 0;
        c2308b4.setMarginEnd(iM27313a2);
        ((ViewGroup.MarginLayoutParams) c2308b4).bottomMargin = iM27313a2;
        addView(imageView4, c2308b4);
        int i14 = iM27313a * 4;
        ConstraintLayout.C2308b c2308b5 = new ConstraintLayout.C2308b(i14, i14);
        c2308b5.f7974l = 0;
        c2308b5.f7990t = 0;
        c2308b5.setMargins(iM27313a, iM27313a, iM27313a, iM27313a);
        imageView3.setColorFilter(AbstractC2397b.getColor(getContext(), R$color.short_tv_main));
        addView(imageView3, c2308b5);
        setPadding(iM27313a, 0, iM27313a, iM27313a * 2);
    }

    public final void setSelect(boolean select) {
        this.selectImg.setSelected(select);
        this.selectImg.setVisibility(0);
    }

    public final void showDownloadedImg(boolean show) {
        this.downloadedImg.setVisibility(show ? 0 : 8);
        if (show) {
            this.selectImg.setVisibility(8);
        }
    }

    public final void showIndex(int ep2) {
        this.textView.setText(String.valueOf(ep2));
    }

    public final void showLockedImg(boolean show) {
        this.lockImg.setVisibility(show ? 0 : 8);
    }

    public final void showPlayingImg(boolean show) {
        if (show && this.playingImg.getTag() == null) {
            this.playingImg.setTag("playing");
            Glide.with(this.playingImg).load2(Integer.valueOf(R$mipmap.short_tv_ic_playing)).into(this.playingImg);
        }
        this.playingImg.setVisibility(show ? 0 : 8);
        this.textView.setSelected(show);
    }

    public final void useForDownloadList() {
        AbstractC23048b.m91691b(this.playingImg);
    }

    public final void useForEpList() {
        AbstractC23048b.m91691b(this.selectImg);
        AbstractC23048b.m91691b(this.downloadedImg);
    }
}
