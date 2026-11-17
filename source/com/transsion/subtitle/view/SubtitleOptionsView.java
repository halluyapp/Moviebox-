package com.transsion.subtitle.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.AbstractC2397b;
import com.avery.subtitle.widget.SimpleSubtitleView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.cloud.tmc.integration.params.TmcStartParams;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.view.InterfaceC13776s;
import com.p282tn.lib.view.SecondariesSeekBar;
import com.p282tn.lib.view.SwitchButton;
import com.p282tn.lib.widget.R$color;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.subtitle.C19655a;
import com.transsion.subtitle.helper.C19719d;
import com.transsion.subtitle.helper.LocalVideoUiType;
import com.transsion.subtitle.view.SubtitleOptionsView;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.warkiz.widget.C22726f;
import com.warkiz.widget.IndicatorSeekBar;
import com.warkiz.widget.InterfaceC22725e;
import java.util.LinkedHashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ng.AbstractC26006c;
import p550kj.C24662i;
import p559ku.C25439i;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 h2\u00020\u0001:\u0001CB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ!\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b$\u0010\"J!\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b&\u0010\u0015J!\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b(\u0010\u0019J\u000f\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u000eJ\u000f\u0010*\u001a\u00020\u0012H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\fH\u0002¢\u0006\u0004\b0\u0010\u000eJ\u000f\u00101\u001a\u00020\fH\u0002¢\u0006\u0004\b1\u0010\u000eJ\u000f\u00102\u001a\u00020\fH\u0002¢\u0006\u0004\b2\u0010\u000eJS\u0010>\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u0001032\b\u00105\u001a\u0004\u0018\u00010\u00062\b\u00107\u001a\u0004\u0018\u0001062\b\u00108\u001a\u0004\u0018\u0001062\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010;\u001a\u0004\u0018\u00010\u00102\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\f¢\u0006\u0004\b@\u0010\u000eJ\r\u0010A\u001a\u00020\f¢\u0006\u0004\bA\u0010\u000eR\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010\u0018R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u00108\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010JR\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010;\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010\u0018R\u0014\u0010U\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010\u0018R\u0016\u0010W\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010QR\u0016\u0010Y\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010\u0018R\u0016\u0010Z\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010\u0018R\u0016\u0010\\\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010[R\u0016\u0010]\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010[R\u0016\u0010_\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010QR\u0016\u0010a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010\u0018R\u0016\u0010c\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010[R\u001e\u0010e\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\be\u0010f\u0012\u0004\bg\u0010\u000e¨\u0006i"}, m97100d2 = {"Lcom/transsion/subtitle/view/SubtitleOptionsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "o", "()V", "n", "", "fontColorType", "", "fromRadioGroup", "G", "(Ljava/lang/String;Z)V", "fontSizeProgress", "fromSeekBar", "I", "(IZ)V", "percent", "fromSeekbar", "isSeekbarStopTouch", "K", "(IZZ)V", "openShadow", "fromSwitchButton", "x", "(ZZ)V", "openBackground", "v", "bgColorType", "C", "opacityProgress", "E", "reset", TmcStartParams.KEY_URL_SHORT, "()Z", "", "fontSizePercent", "m", "(F)F", "z", "A", "B", "Lcom/transsion/subtitle/helper/LocalVideoUiType;", "layerType", "playerContainerHeight", "Lcom/avery/subtitle/widget/SimpleSubtitleView;", "subtitleViewTop", "subtitleViewBottom", "Landroid/view/ViewGroup;", "subtitleViewGroup", "pageName", "Lcom/transsion/subtitle/helper/d;", "optionsHelper", "initOptions", "(Lcom/transsion/subtitle/helper/LocalVideoUiType;Ljava/lang/Integer;Lcom/avery/subtitle/widget/SimpleSubtitleView;Lcom/avery/subtitle/widget/SimpleSubtitleView;Landroid/view/ViewGroup;Ljava/lang/String;Lcom/transsion/subtitle/helper/d;)V", "addSubtitleOptions", "removeSubtitleOptions", "Lku/i;", "a", "Lku/i;", "optionsViewBinding", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/transsion/subtitle/helper/LocalVideoUiType;", "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Lcom/avery/subtitle/widget/SimpleSubtitleView;", "e", "f", "Landroid/view/ViewGroup;", "g", "Lcom/transsion/subtitle/helper/d;", "h", "Ljava/lang/String;", "i", "dp4", "j", "subtitleViewBaseHeight", CampaignEx.JSON_KEY_AD_K, "curFontColorType", "l", "curFontSizeProgress", "curPositionPercent", "Z", "curOpenShadow", "curOpenBackground", TtmlNode.TAG_P, "curBackgroundColorType", CampaignEx.JSON_KEY_AD_Q, "curBackgroundOpacityProgress", CampaignEx.JSON_KEY_AD_R, "isSetPreviewText", "Landroid/widget/FrameLayout;", "subtitleViewContainer", "Landroid/widget/FrameLayout;", "getSubtitleViewContainer$annotations", "Companion", "VideoSubtitle_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension
public final class SubtitleOptionsView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private C25439i optionsViewBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private LocalVideoUiType layerType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int playerContainerHeight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private SimpleSubtitleView subtitleViewTop;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private SimpleSubtitleView subtitleViewBottom;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private ViewGroup subtitleViewGroup;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private C19719d optionsHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String pageName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int dp4;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int subtitleViewBaseHeight;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private String curFontColorType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int curFontSizeProgress;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int curPositionPercent;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean curOpenShadow;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean curOpenBackground;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private String curBackgroundColorType;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int curBackgroundOpacityProgress;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean isSetPreviewText;

    /* JADX INFO: renamed from: com.transsion.subtitle.view.SubtitleOptionsView$b */
    public static final class C19730b implements InterfaceC22725e {
        C19730b() {
        }

        @Override // com.warkiz.widget.InterfaceC22725e
        /* JADX INFO: renamed from: a */
        public void mo82233a(IndicatorSeekBar indicatorSeekBar) {
        }

        @Override // com.warkiz.widget.InterfaceC22725e
        /* JADX INFO: renamed from: b */
        public void mo82234b(IndicatorSeekBar indicatorSeekBar) {
            SubtitleOptionsView.this.m82210I(indicatorSeekBar != null ? indicatorSeekBar.getProgress() : 0, true);
        }

        @Override // com.warkiz.widget.InterfaceC22725e
        /* JADX INFO: renamed from: c */
        public void mo82235c(C22726f c22726f) {
            SubtitleOptionsView.this.m82210I(c22726f != null ? c22726f.f69010b : 0, true);
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.view.SubtitleOptionsView$c */
    public static final class C19731c implements InterfaceC13776s {
        C19731c() {
        }

        @Override // com.p282tn.lib.view.InterfaceC13776s
        /* JADX INFO: renamed from: a */
        public void mo62236a(SecondariesSeekBar seekBar) {
            Intrinsics.m97802h(seekBar, "seekBar");
            SubtitleOptionsView.this.m82212K((int) seekBar.getCurrentProgress(), true, true);
        }

        @Override // com.p282tn.lib.view.InterfaceC13776s
        /* JADX INFO: renamed from: b */
        public void mo62237b(SecondariesSeekBar seekBar, long j11, boolean z11) {
            Intrinsics.m97802h(seekBar, "seekBar");
            SubtitleOptionsView.this.m82212K((int) j11, true, false);
        }

        @Override // com.p282tn.lib.view.InterfaceC13776s
        /* JADX INFO: renamed from: c */
        public void mo62238c(SecondariesSeekBar seekBar) {
            Intrinsics.m97802h(seekBar, "seekBar");
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.view.SubtitleOptionsView$d */
    public static final class C19732d implements InterfaceC22725e {
        C19732d() {
        }

        @Override // com.warkiz.widget.InterfaceC22725e
        /* JADX INFO: renamed from: a */
        public void mo82233a(IndicatorSeekBar indicatorSeekBar) {
        }

        @Override // com.warkiz.widget.InterfaceC22725e
        /* JADX INFO: renamed from: b */
        public void mo82234b(IndicatorSeekBar indicatorSeekBar) {
            SubtitleOptionsView.this.m82206E(indicatorSeekBar != null ? indicatorSeekBar.getProgress() : 0, true);
        }

        @Override // com.warkiz.widget.InterfaceC22725e
        /* JADX INFO: renamed from: c */
        public void mo82235c(C22726f c22726f) {
            SubtitleOptionsView.this.m82206E(c22726f != null ? c22726f.f69010b : 0, true);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubtitleOptionsView(Context context) {
        this(context, null);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SubtitleOptionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.m97802h(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubtitleOptionsView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.m97802h(context, "context");
        C25439i c25439iM100023b = C25439i.m100023b(LayoutInflater.from(context), this);
        Intrinsics.m97801g(c25439iM100023b, "inflate(...)");
        this.optionsViewBinding = c25439iM100023b;
        this.pageName = "local_video_detail";
        this.dp4 = AbstractC5776a0.m27313a(4.0f);
        this.subtitleViewBaseHeight = AbstractC5776a0.m27313a(66.0f);
        this.curFontColorType = "color_white";
        this.curFontSizeProgress = 2;
        this.curPositionPercent = 10;
        this.curOpenShadow = true;
        this.curBackgroundColorType = "color_black";
        this.curBackgroundOpacityProgress = 3;
        m82221o();
    }

    /* JADX INFO: renamed from: A */
    private final void m82202A() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("behavior", "leave");
        linkedHashMap.put("font_color", this.curFontColorType);
        C19719d c19719d = this.optionsHelper;
        linkedHashMap.put("font_size", String.valueOf(c19719d != null ? Float.valueOf(c19719d.m82177g(this.curFontSizeProgress)) : null));
        linkedHashMap.put("position_bottom_percent", String.valueOf(this.curPositionPercent));
        linkedHashMap.put("shadow", String.valueOf(this.curOpenShadow));
        linkedHashMap.put("open_bg", String.valueOf(this.curOpenBackground));
        if (this.curOpenBackground) {
            linkedHashMap.put("bg_color", this.curBackgroundColorType);
            C19719d c19719d2 = this.optionsHelper;
            linkedHashMap.put("bg_opacity", String.valueOf(c19719d2 != null ? Float.valueOf(c19719d2.m82173c(this.curBackgroundOpacityProgress)) : null));
        }
        C24662i.f75350a.m96884s(this.pageName, "subtitle_options", linkedHashMap);
    }

    /* JADX INFO: renamed from: B */
    private final void m82203B() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("behavior", "reset");
        C24662i.f75350a.m96884s(this.pageName, "subtitle_options", linkedHashMap);
    }

    /* JADX INFO: renamed from: C */
    private final void m82204C(String bgColorType, boolean fromRadioGroup) {
        if (fromRadioGroup) {
            this.curBackgroundColorType = bgColorType;
        } else {
            C19719d c19719d = this.optionsHelper;
            Integer numValueOf = c19719d != null ? Integer.valueOf(c19719d.m82172b(bgColorType)) : null;
            RadioGroup radioGroup = this.optionsViewBinding.f77097t;
            Intrinsics.m97799e(numValueOf);
            radioGroup.check(numValueOf.intValue());
        }
        C14496b.f50966a.m65344b().putString("subtitle_options_bg_color", bgColorType);
        C26866a.a.m104898f(C26866a.f81698a, "SubtitleOptionsView", "setBackgroundColorStyle = " + bgColorType, false, 4, null);
        C19719d c19719d2 = this.optionsHelper;
        Integer numValueOf2 = c19719d2 != null ? Integer.valueOf(c19719d2.m82174d(bgColorType)) : null;
        SimpleSubtitleView simpleSubtitleView = this.subtitleViewTop;
        if (simpleSubtitleView != null) {
            Intrinsics.m97799e(numValueOf2);
            simpleSubtitleView.setBgColor(numValueOf2.intValue());
        }
        SimpleSubtitleView simpleSubtitleView2 = this.subtitleViewBottom;
        if (simpleSubtitleView2 != null) {
            Intrinsics.m97799e(numValueOf2);
            simpleSubtitleView2.setBgColor(numValueOf2.intValue());
        }
    }

    /* JADX INFO: renamed from: D */
    static /* synthetic */ void m82205D(SubtitleOptionsView subtitleOptionsView, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        subtitleOptionsView.m82204C(str, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final void m82206E(int opacityProgress, boolean fromSeekBar) {
        if (fromSeekBar) {
            this.curBackgroundOpacityProgress = opacityProgress;
        } else {
            this.optionsViewBinding.f77101x.setProgress(opacityProgress);
        }
        C14496b.f50966a.m65344b().putInt("subtitle_options_bg_opacity_progress", opacityProgress);
        this.optionsViewBinding.f77087j.setProgress(opacityProgress);
        C19719d c19719d = this.optionsHelper;
        Float fValueOf = c19719d != null ? Float.valueOf(c19719d.m82173c(opacityProgress)) : null;
        if (fValueOf != null) {
            int iFloatValue = (int) (255 * fValueOf.floatValue());
            SimpleSubtitleView simpleSubtitleView = this.subtitleViewTop;
            if (simpleSubtitleView != null) {
                simpleSubtitleView.setBgAlpha(iFloatValue);
            }
            SimpleSubtitleView simpleSubtitleView2 = this.subtitleViewBottom;
            if (simpleSubtitleView2 != null) {
                simpleSubtitleView2.setBgAlpha(iFloatValue);
            }
            C19655a.f62783a.m81952a(SubtitleOptionsView.class.getSimpleName() + " --> setBackgroundOpacityStyle() --> opacityPercent = " + fValueOf + " --> toInt = " + iFloatValue + " --> subtitleViewTop = " + (this.subtitleViewTop != null) + " --> subtitleViewBottom = " + (this.subtitleViewBottom != null));
        }
    }

    /* JADX INFO: renamed from: F */
    static /* synthetic */ void m82207F(SubtitleOptionsView subtitleOptionsView, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        subtitleOptionsView.m82206E(i11, z11);
    }

    /* JADX INFO: renamed from: G */
    private final void m82208G(String fontColorType, boolean fromRadioGroup) {
        C19719d c19719d = this.optionsHelper;
        Integer numValueOf = c19719d != null ? Integer.valueOf(c19719d.m82176f(fontColorType)) : null;
        if (fromRadioGroup) {
            this.curFontColorType = fontColorType;
        } else {
            RadioGroup radioGroup = this.optionsViewBinding.f77098u;
            Intrinsics.m97799e(numValueOf);
            radioGroup.check(numValueOf.intValue());
        }
        C14496b.f50966a.m65344b().putString("subtitle_options_font_color", fontColorType);
        SimpleSubtitleView simpleSubtitleView = this.subtitleViewTop;
        if (simpleSubtitleView != null) {
            C19719d c19719d2 = this.optionsHelper;
            Integer numValueOf2 = c19719d2 != null ? Integer.valueOf(c19719d2.m82174d(fontColorType)) : null;
            Intrinsics.m97799e(numValueOf2);
            simpleSubtitleView.setTextColor(numValueOf2.intValue());
        }
        SimpleSubtitleView simpleSubtitleView2 = this.subtitleViewBottom;
        if (simpleSubtitleView2 != null) {
            C19719d c19719d3 = this.optionsHelper;
            Integer numValueOf3 = c19719d3 != null ? Integer.valueOf(c19719d3.m82174d(fontColorType)) : null;
            Intrinsics.m97799e(numValueOf3);
            simpleSubtitleView2.setTextColor(numValueOf3.intValue());
        }
        if (Intrinsics.m97797c(fontColorType, "color_white")) {
            return;
        }
        this.optionsViewBinding.f77075F.setSelected(true);
    }

    /* JADX INFO: renamed from: H */
    static /* synthetic */ void m82209H(SubtitleOptionsView subtitleOptionsView, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        subtitleOptionsView.m82208G(str, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final void m82210I(int fontSizeProgress, boolean fromSeekBar) {
        this.optionsViewBinding.f77088k.setProgress(fontSizeProgress);
        if (fromSeekBar) {
            this.curFontSizeProgress = fontSizeProgress;
        } else {
            this.optionsViewBinding.f77099v.setProgress(fontSizeProgress);
        }
        C14496b.f50966a.m65344b().putInt("subtitle_options_font_size_progress", fontSizeProgress);
        C19719d c19719d = this.optionsHelper;
        Float fValueOf = c19719d != null ? Float.valueOf(c19719d.m82177g(fontSizeProgress)) : null;
        Intrinsics.m97799e(fValueOf);
        float fM82219m = m82219m(fValueOf.floatValue());
        SimpleSubtitleView simpleSubtitleView = this.subtitleViewTop;
        if (simpleSubtitleView != null) {
            simpleSubtitleView.setTextSize(fM82219m);
        }
        SimpleSubtitleView simpleSubtitleView2 = this.subtitleViewBottom;
        if (simpleSubtitleView2 != null) {
            simpleSubtitleView2.setTextSize(fM82219m);
        }
        if (fontSizeProgress != 2) {
            this.optionsViewBinding.f77075F.setSelected(true);
        }
    }

    /* JADX INFO: renamed from: J */
    static /* synthetic */ void m82211J(SubtitleOptionsView subtitleOptionsView, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        subtitleOptionsView.m82210I(i11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final void m82212K(int percent, boolean fromSeekbar, boolean isSeekbarStopTouch) {
        C19719d c19719d;
        LocalVideoUiType localVideoUiType = this.layerType;
        if (localVideoUiType != null && (c19719d = this.optionsHelper) != null) {
            c19719d.m82180j(localVideoUiType, this.subtitleViewGroup, percent);
        }
        this.curPositionPercent = percent;
        if (fromSeekbar && isSeekbarStopTouch) {
            C14496b.f50966a.m65344b().putInt("subtitle_options_position", percent);
        }
        if (percent != 10) {
            this.optionsViewBinding.f77075F.setSelected(true);
        }
    }

    /* JADX INFO: renamed from: L */
    static /* synthetic */ void m82213L(SubtitleOptionsView subtitleOptionsView, int i11, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            z12 = true;
        }
        subtitleOptionsView.m82212K(i11, z11, z12);
    }

    @Deprecated
    private static /* synthetic */ void getSubtitleViewContainer$annotations() {
    }

    /* JADX INFO: renamed from: m */
    private final float m82219m(float fontSizePercent) {
        int i11;
        Context context = getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        if (AbstractC14556b.m65670a(context)) {
            i11 = this.layerType == LocalVideoUiType.MIDDLE ? 18 : 30;
        } else {
            i11 = this.layerType == LocalVideoUiType.MIDDLE ? 12 : 20;
        }
        return i11 * fontSizePercent;
    }

    /* JADX INFO: renamed from: n */
    private final void m82220n() {
        C14496b c14496b = C14496b.f50966a;
        String string = c14496b.m65344b().getString("subtitle_options_font_color", "color_white");
        String str = string != null ? string : "color_white";
        this.curFontColorType = str;
        m82209H(this, str, false, 2, null);
        int i11 = c14496b.m65344b().getInt("subtitle_options_font_size_progress", 2);
        this.curFontSizeProgress = i11;
        m82211J(this, i11, false, 2, null);
        int i12 = c14496b.m65344b().getInt("subtitle_options_position", 10);
        this.curPositionPercent = i12;
        this.optionsViewBinding.f77100w.setProgress(i12);
        boolean z11 = c14496b.m65344b().getBoolean("subtitle_options_shadow_enabled", true);
        this.curOpenShadow = z11;
        m82231y(this, z11, false, 2, null);
        this.curOpenBackground = c14496b.m65344b().getBoolean("subtitle_options_bg_enabled", false);
        String string2 = c14496b.m65344b().getString("subtitle_options_bg_color", "color_black");
        this.curBackgroundColorType = string2 != null ? string2 : "color_black";
        this.curBackgroundOpacityProgress = c14496b.m65344b().getInt("subtitle_options_bg_opacity_progress", 3);
        m82229w(this, this.curOpenBackground, false, 2, null);
        boolean zM82227u = m82227u();
        C19655a.f62783a.m81952a(SubtitleOptionsView.class.getSimpleName() + " --> initData() --> isOptionsChanged = " + zM82227u);
        this.optionsViewBinding.f77075F.setSelected(zM82227u);
    }

    /* JADX INFO: renamed from: o */
    private final void m82221o() {
        this.optionsViewBinding.f77098u.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: ou.a
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                SubtitleOptionsView.m82222p(this.f81193a, radioGroup, i11);
            }
        });
        this.optionsViewBinding.f77099v.setOnSeekChangeListener(new C19730b());
        this.optionsViewBinding.f77100w.setOnSeekBarChangeListener(new C19731c());
        this.optionsViewBinding.f77103z.setOnCheckedChangeListener(new SwitchButton.InterfaceC13732d() { // from class: ou.b
            @Override // com.p282tn.lib.view.SwitchButton.InterfaceC13732d
            /* JADX INFO: renamed from: a */
            public final void mo62077a(SwitchButton switchButton, boolean z11) {
                SubtitleOptionsView.m82223q(this.f81194a, switchButton, z11);
            }
        });
        this.optionsViewBinding.f77102y.setOnCheckedChangeListener(new SwitchButton.InterfaceC13732d() { // from class: ou.c
            @Override // com.p282tn.lib.view.SwitchButton.InterfaceC13732d
            /* JADX INFO: renamed from: a */
            public final void mo62077a(SwitchButton switchButton, boolean z11) {
                SubtitleOptionsView.m82224r(this.f81195a, switchButton, z11);
            }
        });
        this.optionsViewBinding.f77097t.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: ou.d
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                SubtitleOptionsView.m82225s(this.f81196a, radioGroup, i11);
            }
        });
        this.optionsViewBinding.f77101x.setOnSeekChangeListener(new C19732d());
        this.optionsViewBinding.f77075F.setOnClickListener(new View.OnClickListener() { // from class: ou.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubtitleOptionsView.m82226t(this.f81197a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m82222p(SubtitleOptionsView subtitleOptionsView, RadioGroup radioGroup, int i11) {
        C19719d c19719d = subtitleOptionsView.optionsHelper;
        String strM82175e = c19719d != null ? c19719d.m82175e(i11) : null;
        Intrinsics.m97799e(strM82175e);
        subtitleOptionsView.m82208G(strM82175e, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final void m82223q(SubtitleOptionsView subtitleOptionsView, SwitchButton switchButton, boolean z11) {
        subtitleOptionsView.m82230x(z11, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final void m82224r(SubtitleOptionsView subtitleOptionsView, SwitchButton switchButton, boolean z11) {
        subtitleOptionsView.m82228v(z11, true);
    }

    private final void reset() {
        this.curFontColorType = "color_white";
        m82209H(this, "color_white", false, 2, null);
        this.curFontSizeProgress = 2;
        m82211J(this, 2, false, 2, null);
        this.curPositionPercent = 10;
        C14496b.f50966a.m65344b().putInt("subtitle_options_position", this.curPositionPercent);
        m82213L(this, this.curPositionPercent, false, false, 6, null);
        this.optionsViewBinding.f77100w.setProgress(this.curPositionPercent);
        this.curOpenShadow = true;
        m82231y(this, true, false, 2, null);
        this.curOpenBackground = false;
        m82229w(this, false, false, 2, null);
        this.curBackgroundColorType = "color_black";
        m82205D(this, "color_black", false, 2, null);
        this.curBackgroundOpacityProgress = 3;
        m82207F(this, 3, false, 2, null);
        this.optionsViewBinding.f77075F.setSelected(false);
        m82203B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m82225s(SubtitleOptionsView subtitleOptionsView, RadioGroup radioGroup, int i11) {
        C19719d c19719d = subtitleOptionsView.optionsHelper;
        String strM82171a = c19719d != null ? c19719d.m82171a(i11) : null;
        Intrinsics.m97799e(strM82171a);
        subtitleOptionsView.m82204C(strM82171a, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final void m82226t(SubtitleOptionsView subtitleOptionsView, View view) {
        if (view.isSelected()) {
            subtitleOptionsView.reset();
        }
    }

    /* JADX INFO: renamed from: u */
    private final boolean m82227u() {
        return (Intrinsics.m97797c(this.curFontColorType, "color_white") && this.curFontSizeProgress == 2 && this.curOpenShadow && !this.curOpenBackground && Intrinsics.m97797c(this.curBackgroundColorType, "color_black") && this.curBackgroundOpacityProgress == 3 && this.curPositionPercent == 10) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    private final void m82228v(boolean openBackground, boolean fromSwitchButton) {
        if (fromSwitchButton) {
            this.curOpenBackground = openBackground;
        } else {
            this.optionsViewBinding.f77102y.setChecked(openBackground);
        }
        C14496b.f50966a.m65344b().putBoolean("subtitle_options_bg_enabled", openBackground);
        Group groupBackground = this.optionsViewBinding.f77079b;
        Intrinsics.m97801g(groupBackground, "groupBackground");
        groupBackground.setVisibility(openBackground ? 0 : 8);
        if (!openBackground) {
            SimpleSubtitleView simpleSubtitleView = this.subtitleViewTop;
            if (simpleSubtitleView != null) {
                simpleSubtitleView.closeBg();
            }
            SimpleSubtitleView simpleSubtitleView2 = this.subtitleViewBottom;
            if (simpleSubtitleView2 != null) {
                simpleSubtitleView2.closeBg();
                return;
            }
            return;
        }
        SimpleSubtitleView simpleSubtitleView3 = this.subtitleViewTop;
        if (simpleSubtitleView3 != null) {
            simpleSubtitleView3.openBg();
        }
        SimpleSubtitleView simpleSubtitleView4 = this.subtitleViewBottom;
        if (simpleSubtitleView4 != null) {
            simpleSubtitleView4.openBg();
        }
        this.optionsViewBinding.f77075F.setSelected(true);
        SimpleSubtitleView simpleSubtitleView5 = this.subtitleViewTop;
        if (simpleSubtitleView5 != null) {
            simpleSubtitleView5.setBgdRadius(this.dp4);
        }
        SimpleSubtitleView simpleSubtitleView6 = this.subtitleViewBottom;
        if (simpleSubtitleView6 != null) {
            simpleSubtitleView6.setBgdRadius(this.dp4);
        }
        m82205D(this, this.curBackgroundColorType, false, 2, null);
        m82207F(this, this.curBackgroundOpacityProgress, false, 2, null);
    }

    /* JADX INFO: renamed from: w */
    static /* synthetic */ void m82229w(SubtitleOptionsView subtitleOptionsView, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        subtitleOptionsView.m82228v(z11, z12);
    }

    /* JADX INFO: renamed from: x */
    private final void m82230x(boolean openShadow, boolean fromSwitchButton) {
        if (fromSwitchButton) {
            this.curOpenShadow = openShadow;
        } else {
            this.optionsViewBinding.f77103z.setChecked(openShadow);
        }
        C14496b.f50966a.m65344b().putBoolean("subtitle_options_shadow_enabled", openShadow);
        if (openShadow) {
            SimpleSubtitleView simpleSubtitleView = this.subtitleViewTop;
            if (simpleSubtitleView != null) {
                simpleSubtitleView.setShadowLayer(1.0f, 3.0f, 2.0f, AbstractC2397b.getColor(getContext(), R$color.black_90));
            }
            SimpleSubtitleView simpleSubtitleView2 = this.subtitleViewBottom;
            if (simpleSubtitleView2 != null) {
                simpleSubtitleView2.setShadowLayer(1.0f, 3.0f, 2.0f, AbstractC2397b.getColor(getContext(), R$color.black_90));
            }
        } else {
            SimpleSubtitleView simpleSubtitleView3 = this.subtitleViewTop;
            if (simpleSubtitleView3 != null) {
                simpleSubtitleView3.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
            SimpleSubtitleView simpleSubtitleView4 = this.subtitleViewBottom;
            if (simpleSubtitleView4 != null) {
                simpleSubtitleView4.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
        if (openShadow) {
            return;
        }
        this.optionsViewBinding.f77075F.setSelected(true);
    }

    /* JADX INFO: renamed from: y */
    static /* synthetic */ void m82231y(SubtitleOptionsView subtitleOptionsView, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        subtitleOptionsView.m82230x(z11, z12);
    }

    /* JADX INFO: renamed from: z */
    private final void m82232z() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("behavior", "enter");
        C24662i.f75350a.m96884s(this.pageName, "subtitle_options", linkedHashMap);
    }

    public final void addSubtitleOptions() {
        m82232z();
    }

    public final void initOptions(LocalVideoUiType layerType, Integer playerContainerHeight, SimpleSubtitleView subtitleViewTop, SimpleSubtitleView subtitleViewBottom, ViewGroup subtitleViewGroup, String pageName, C19719d optionsHelper) {
        this.layerType = layerType;
        this.playerContainerHeight = playerContainerHeight != null ? playerContainerHeight.intValue() : 0;
        this.subtitleViewTop = subtitleViewTop;
        this.subtitleViewBottom = subtitleViewBottom;
        this.subtitleViewGroup = subtitleViewGroup;
        if (pageName != null) {
            this.pageName = pageName;
        }
        this.optionsHelper = optionsHelper;
        m82220n();
    }

    public final void removeSubtitleOptions() {
        m82202A();
        if (this.isSetPreviewText) {
            SimpleSubtitleView simpleSubtitleView = this.subtitleViewTop;
            if (simpleSubtitleView != null) {
                AbstractC26006c.m102055h(simpleSubtitleView);
            }
            SimpleSubtitleView simpleSubtitleView2 = this.subtitleViewBottom;
            if (simpleSubtitleView2 != null) {
                AbstractC26006c.m102055h(simpleSubtitleView2);
            }
            SimpleSubtitleView simpleSubtitleView3 = this.subtitleViewTop;
            if (simpleSubtitleView3 != null) {
                simpleSubtitleView3.setText("");
            }
            SimpleSubtitleView simpleSubtitleView4 = this.subtitleViewBottom;
            if (simpleSubtitleView4 != null) {
                simpleSubtitleView4.setText("");
            }
        }
    }
}
