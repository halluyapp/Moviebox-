package com.transsion.subtitle.helper;

import android.content.Context;
import android.view.ViewGroup;
import androidx.core.content.AbstractC2397b;
import com.avery.subtitle.widget.SimpleSubtitleView;
import com.blankj.utilcode.util.AbstractC5776a0;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.AbstractC5806y;
import com.p282tn.lib.widget.R$color;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.baseui.util.AbstractC14556b;
import com.transsion.subtitle.R$id;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.subtitle.helper.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C19719d {

    /* JADX INFO: renamed from: n */
    public static final a f62944n = new a(null);

    /* JADX INFO: renamed from: a */
    private final Context f62945a;

    /* JADX INFO: renamed from: b */
    private final int f62946b;

    /* JADX INFO: renamed from: c */
    private final int f62947c;

    /* JADX INFO: renamed from: d */
    private final int f62948d;

    /* JADX INFO: renamed from: e */
    private final int f62949e;

    /* JADX INFO: renamed from: f */
    private final int f62950f;

    /* JADX INFO: renamed from: g */
    private final int f62951g;

    /* JADX INFO: renamed from: h */
    private final int f62952h;

    /* JADX INFO: renamed from: i */
    private final int f62953i;

    /* JADX INFO: renamed from: j */
    private final int f62954j;

    /* JADX INFO: renamed from: k */
    private final int f62955k;

    /* JADX INFO: renamed from: l */
    private final int f62956l;

    /* JADX INFO: renamed from: m */
    private final int f62957m;

    /* JADX INFO: renamed from: com.transsion.subtitle.helper.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.transsion.subtitle.helper.d$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f62958a;

        static {
            int[] iArr = new int[LocalVideoUiType.values().length];
            try {
                iArr[LocalVideoUiType.MIDDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalVideoUiType.LAND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalVideoUiType.PORTRAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f62958a = iArr;
        }
    }

    public C19719d(Context context) {
        Intrinsics.m97802h(context, "context");
        this.f62945a = context;
        this.f62950f = AbstractC5776a0.m27313a(66.0f);
        this.f62951g = AbstractC5776a0.m27313a(24.0f);
        this.f62952h = AbstractC5776a0.m27313a(24.0f);
        this.f62953i = AbstractC5776a0.m27313a(68.0f);
        this.f62954j = AbstractC5806y.m27489e();
        int iM27487c = AbstractC5806y.m27487c();
        this.f62955k = iM27487c;
        int iM27351c = AbstractC5781d.m27351c();
        this.f62956l = iM27351c;
        this.f62957m = iM27487c - iM27351c;
        this.f62946b = AbstractC2397b.getColor(context, R$color.black);
        this.f62947c = AbstractC2397b.getColor(context, R$color.white);
        this.f62948d = AbstractC2397b.getColor(context, com.transsion.subtitle.R$color.subtitle_color_yellow);
        this.f62949e = AbstractC2397b.getColor(context, com.transsion.subtitle.R$color.subtitle_color_green);
    }

    /* JADX INFO: renamed from: a */
    public final String m82171a(int i11) {
        if (i11 == R$id.rb_background_black) {
            return "color_black";
        }
        if (i11 == R$id.rb_background_white) {
            return "color_white";
        }
        if (i11 == R$id.rb_background_yellor) {
            return "color_yellow";
        }
        return i11 == R$id.rb_background_green ? "color_green" : "color_black";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public final int m82172b(String bgColorType) {
        Intrinsics.m97802h(bgColorType, "bgColorType");
        switch (bgColorType.hashCode()) {
            case -1720275760:
                if (bgColorType.equals("color_yellow")) {
                    return R$id.rb_background_yellor;
                }
                break;
            case 1308937251:
                if (bgColorType.equals("color_black")) {
                    return R$id.rb_background_black;
                }
                break;
            case 1313737511:
                if (bgColorType.equals("color_green")) {
                    return R$id.rb_background_green;
                }
                break;
            case 1328220237:
                if (bgColorType.equals("color_white")) {
                    return R$id.rb_background_white;
                }
                break;
        }
        return R$id.rb_background_white;
    }

    /* JADX INFO: renamed from: c */
    public final float m82173c(int i11) {
        if (i11 == 0) {
            return 0.1f;
        }
        if (i11 == 1) {
            return 0.25f;
        }
        if (i11 != 2) {
            return (i11 == 3 || i11 != 4) ? 0.75f : 1.0f;
        }
        return 0.5f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    public final int m82174d(String colorType) {
        Intrinsics.m97802h(colorType, "colorType");
        switch (colorType.hashCode()) {
            case -1720275760:
                if (colorType.equals("color_yellow")) {
                    return this.f62948d;
                }
                break;
            case 1308937251:
                if (colorType.equals("color_black")) {
                    return this.f62946b;
                }
                break;
            case 1313737511:
                if (colorType.equals("color_green")) {
                    return this.f62949e;
                }
                break;
            case 1328220237:
                if (colorType.equals("color_white")) {
                    return this.f62947c;
                }
                break;
        }
        return this.f62947c;
    }

    /* JADX INFO: renamed from: e */
    public final String m82175e(int i11) {
        if (i11 == R$id.rb_font_color_black) {
            return "color_black";
        }
        if (i11 != R$id.rb_font_color_white) {
            if (i11 == R$id.rb_font_color_yellor) {
                return "color_yellow";
            }
            if (i11 == R$id.rb_font_color_green) {
                return "color_green";
            }
        }
        return "color_white";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: f */
    public final int m82176f(String fontColorType) {
        Intrinsics.m97802h(fontColorType, "fontColorType");
        switch (fontColorType.hashCode()) {
            case -1720275760:
                if (fontColorType.equals("color_yellow")) {
                    return R$id.rb_font_color_yellor;
                }
                break;
            case 1308937251:
                if (fontColorType.equals("color_black")) {
                    return R$id.rb_font_color_black;
                }
                break;
            case 1313737511:
                if (fontColorType.equals("color_green")) {
                    return R$id.rb_font_color_green;
                }
                break;
            case 1328220237:
                if (fontColorType.equals("color_white")) {
                    return R$id.rb_font_color_white;
                }
                break;
        }
        return R$id.rb_font_color_white;
    }

    /* JADX INFO: renamed from: g */
    public final float m82177g(int i11) {
        switch (i11) {
            case 0:
                return 0.5f;
            case 1:
                return 0.75f;
            case 2:
            default:
                return 1.0f;
            case 3:
                return 1.5f;
            case 4:
                return 2.0f;
            case 5:
                return 3.0f;
            case 6:
                return 4.0f;
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m82178h(LocalVideoUiType uiType) {
        Intrinsics.m97802h(uiType, "uiType");
        AbstractC5806y.m27487c();
        int i11 = b.f62958a[uiType.ordinal()];
        if (i11 == 1) {
            return (this.f62954j * 9) / 16;
        }
        if (i11 == 2) {
            return this.f62954j;
        }
        if (i11 == 3) {
            return this.f62955k;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: i */
    public final void m82179i(SimpleSubtitleView simpleSubtitleView, SimpleSubtitleView simpleSubtitleView2, LocalVideoUiType uiType, ViewGroup viewGroup) {
        int i11;
        Intrinsics.m97802h(uiType, "uiType");
        C14496b c14496b = C14496b.f50966a;
        String string = c14496b.m65344b().getString("subtitle_options_font_color", "color_white");
        String str = string != null ? string : "color_white";
        int iM82174d = m82174d(str);
        if (simpleSubtitleView != null) {
            simpleSubtitleView.setTextColor(iM82174d);
        }
        if (simpleSubtitleView2 != null) {
            simpleSubtitleView2.setTextColor(iM82174d);
        }
        float fM82177g = m82177g(c14496b.m65344b().getInt("subtitle_options_font_size_progress", 2));
        if (AbstractC14556b.m65670a(this.f62945a)) {
            i11 = uiType == LocalVideoUiType.MIDDLE ? 18 : 30;
        } else {
            i11 = uiType == LocalVideoUiType.MIDDLE ? 12 : 20;
        }
        if (simpleSubtitleView != null) {
            simpleSubtitleView.setTextSize(i11 * fM82177g);
        }
        if (simpleSubtitleView2 != null) {
            simpleSubtitleView2.setTextSize(i11 * fM82177g);
        }
        int i12 = c14496b.m65344b().getInt("subtitle_options_position", 10);
        m82180j(uiType, viewGroup, i12);
        boolean z11 = c14496b.m65344b().getBoolean("subtitle_options_shadow_enabled", true);
        if (z11) {
            if (simpleSubtitleView != null) {
                simpleSubtitleView.setShadowLayer(1.0f, 3.0f, 2.0f, AbstractC2397b.getColor(simpleSubtitleView.getContext(), R$color.black_90));
            }
            if (simpleSubtitleView2 != null) {
                simpleSubtitleView2.setShadowLayer(1.0f, 3.0f, 2.0f, AbstractC2397b.getColor(simpleSubtitleView2.getContext(), R$color.black_90));
            }
        } else {
            if (simpleSubtitleView != null) {
                simpleSubtitleView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
            if (simpleSubtitleView2 != null) {
                simpleSubtitleView2.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
        boolean z12 = c14496b.m65344b().getBoolean("subtitle_options_bg_enabled", false);
        String string2 = c14496b.m65344b().getString("subtitle_options_bg_color", "color_black");
        String str2 = string2 != null ? string2 : "color_black";
        int i13 = c14496b.m65344b().getInt("subtitle_options_bg_opacity_progress", 3);
        if (z12) {
            if (simpleSubtitleView != null) {
                simpleSubtitleView.openBg();
            }
            if (simpleSubtitleView2 != null) {
                simpleSubtitleView2.openBg();
            }
            if (simpleSubtitleView != null) {
                simpleSubtitleView.setBgdRadius(AbstractC5776a0.m27313a(4.0f));
            }
            if (simpleSubtitleView2 != null) {
                simpleSubtitleView2.setBgdRadius(AbstractC5776a0.m27313a(4.0f));
            }
            int iM82174d2 = m82174d(str2);
            if (simpleSubtitleView != null) {
                simpleSubtitleView.setBgColor(iM82174d2);
            }
            if (simpleSubtitleView2 != null) {
                simpleSubtitleView2.setBgColor(iM82174d2);
            }
            float fM82173c = m82173c(i13);
            if (simpleSubtitleView != null) {
                simpleSubtitleView.setBgAlpha((int) (255 * fM82173c));
            }
            if (simpleSubtitleView2 != null) {
                simpleSubtitleView2.setBgAlpha((int) (255 * fM82173c));
            }
        } else {
            if (simpleSubtitleView != null) {
                simpleSubtitleView.closeBg();
            }
            if (simpleSubtitleView2 != null) {
                simpleSubtitleView2.closeBg();
            }
        }
        C26866a.a.m104908v(C26866a.f81698a, "SubtitleOptionsView", StringsKt.m98208n("\n            initSubtitleOptions, fontColorType= " + str + "， fontSizePercent = " + fM82177g + "\n                positionPercent = " + i12 + ", openShadow =" + z11 + "\n                openBackground = " + z12 + ", bgColorType = " + str2 + ", bgOpacityProgress = " + i13 + "\n        "), false, 4, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m82180j(LocalVideoUiType uiType, ViewGroup viewGroup, int i11) {
        Intrinsics.m97802h(uiType, "uiType");
        int iM82178h = m82178h(uiType);
        int iM27313a = AbstractC5776a0.m27313a(40.0f);
        int i12 = iM82178h - iM27313a;
        ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i13 = (i11 * i12) / 100;
        if (i13 >= 0) {
            if (i13 > i12 - iM27313a) {
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = i12 - AbstractC5776a0.m27313a(40.0f);
                }
            } else if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i13;
            }
            int height = viewGroup != null ? viewGroup.getHeight() : 0;
            if ((marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + height > iM82178h && marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = iM82178h - height;
            }
        }
        if (viewGroup != null) {
            viewGroup.requestLayout();
        }
    }
}
