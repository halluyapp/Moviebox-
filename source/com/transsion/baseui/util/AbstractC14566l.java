package com.transsion.baseui.util;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.AbstractC2397b;
import com.blankj.utilcode.util.Utils;
import com.p282tn.lib.widget.R$color;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.baseui.R$mipmap;
import com.transsion.baseui.widget.C14580d;
import com.transsion.web.api.WebPageIdentity;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ng.AbstractC26004a;
import p521jk.ViewOnTouchListenerC24424a;
import th.C27817a;

/* JADX INFO: renamed from: com.transsion.baseui.util.l */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14566l {

    /* JADX INFO: renamed from: a */
    private static final Pattern f51119a = Pattern.compile("(?i:http|https|rtsp|ftp)://");

    /* JADX INFO: renamed from: com.transsion.baseui.util.l$a */
    public static final class a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function2 f51120a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f51121b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f51122c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f51123d;

        a(Function2 function2, String str, boolean z11, int i11) {
            this.f51120a = function2;
            this.f51121b = str;
            this.f51122c = z11;
            this.f51123d = i11;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.m97802h(widget, "widget");
            Function2 function2 = this.f51120a;
            if (function2 != null) {
                String str = this.f51121b;
                if (str == null) {
                    str = "";
                }
                function2.invoke(widget, str);
            }
            if (this.f51122c) {
                AbstractC14566l.m65689d(this.f51121b);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.m97802h(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(this.f51123d);
        }
    }

    /* JADX INFO: renamed from: com.transsion.baseui.util.l$b */
    public static final class b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function2 f51124a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f51125b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f51126c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f51127d;

        b(Function2 function2, String str, boolean z11, int i11) {
            this.f51124a = function2;
            this.f51125b = str;
            this.f51126c = z11;
            this.f51127d = i11;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.m97802h(widget, "widget");
            Function2 function2 = this.f51124a;
            if (function2 != null) {
                String str = this.f51125b;
                if (str == null) {
                    str = "";
                }
                function2.invoke(widget, str);
            }
            if (this.f51126c) {
                AbstractC14566l.m65689d(this.f51125b);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.m97802h(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(this.f51127d);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final SpannableString m65687b(TextView textView, CharSequence charSequence, boolean z11, InterfaceC14561g interfaceC14561g, Function2 function2) {
        int i11;
        Object obj = null;
        if (textView != null) {
            textView.setOnTouchListener(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            return new SpannableString("");
        }
        ArrayList<UrlContent> arrayList = new ArrayList();
        Matcher matcher = Patterns.WEB_URL.matcher(charSequence);
        int color = AbstractC2397b.getColor(Utils.m27275a(), R$color.color_0ba7ff);
        CharSequence charSequenceS = charSequence;
        while (matcher.find()) {
            String strGroup = matcher.group();
            Intrinsics.m97799e(strGroup);
            int iO0 = 0;
            if (StringsKt.m98226G(strGroup, ")", false, 2, obj)) {
                Intrinsics.m97799e(strGroup);
                strGroup = StringsKt.m98236Q(strGroup, ")", "", false, 4, null);
            }
            if (charSequenceS != null) {
                Intrinsics.m97799e(strGroup);
                iO0 = StringsKt.m98156o0(charSequenceS, strGroup, 0, false, 6, null);
            }
            Intrinsics.m97799e(strGroup);
            String strQ = StringsKt.m98236Q(strGroup, "%20", " ", false, 4, null);
            Matcher matcher2 = f51119a.matcher(strQ);
            if (matcher2.find()) {
                String strGroup2 = matcher2.group();
                Intrinsics.m97801g(strGroup2, "group(...)");
                String strQ2 = StringsKt.m98236Q(strQ, strGroup2, "", false, 4, null);
                Matcher matcher3 = Patterns.DOMAIN_NAME.matcher(strQ2);
                if (matcher3.find()) {
                    String strGroup3 = matcher3.group();
                    Intrinsics.m97799e(strGroup3);
                    i11 = 2;
                    if (StringsKt.m98132c0(strGroup3, ".", false, 2, obj)) {
                        List listS0 = StringsKt.m98117S0(strGroup3, new String[]{"."}, false, 0, 6, null);
                        if (listS0.size() > 2) {
                            strQ2 = StringsKt.m98236Q(strQ2, listS0.get(0) + ".", "", false, 4, null);
                        }
                    }
                } else {
                    i11 = 2;
                }
                if (strQ2.length() > 24) {
                    strQ2 = StringsKt.m98111M0(strQ2, 24, strQ2.length(), "...").toString();
                }
                String str = "-" + strQ2;
                String strValueOf = String.valueOf(charSequenceS);
                Intrinsics.m97799e(strGroup);
                charSequenceS = StringsKt.m98238S(strValueOf, strGroup, str, false, 4, null);
                Drawable drawable = AbstractC2397b.getDrawable(Utils.m27275a(), R$mipmap.base_ic_url_link);
                if (drawable != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                }
                arrayList.add(new UrlContent(new a(function2, strQ, z11, color), drawable != null ? new C14580d(drawable, i11) : null, strGroup, str, iO0));
                obj = null;
            }
        }
        if (arrayList.isEmpty()) {
            return new SpannableString(charSequence);
        }
        SpannableString spannableString = new SpannableString(charSequenceS);
        for (UrlContent urlContent : arrayList) {
            spannableString.setSpan(urlContent.getIconSpan(), urlContent.getIndexOfUrl(), urlContent.getIndexOfUrl() + 1, 33);
            spannableString.setSpan(urlContent.getClickableSpan(), urlContent.getIndexOfUrl(), urlContent.getIndexOfUrl() + urlContent.getUrl().length(), 33);
        }
        if (interfaceC14561g != null) {
            interfaceC14561g.mo65676a(arrayList);
        }
        if (textView != null) {
            textView.setOnTouchListener(new ViewOnTouchListenerC24424a(spannableString));
        }
        if (textView != null) {
            textView.setHighlightColor(AbstractC2397b.getColor(Utils.m27275a(), R$color.cl17));
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: c */
    public static final SpannableStringBuilder m65688c(TextView textView, CharSequence charSequence, boolean z11, int i11, InterfaceC14561g interfaceC14561g, Function2 function2) {
        SpannableStringBuilder spannableStringBuilder;
        int i12;
        Object obj = null;
        if (textView != null) {
            textView.setOnTouchListener(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            return new SpannableStringBuilder("");
        }
        ArrayList<UrlContent> arrayList = new ArrayList();
        Matcher matcher = Patterns.WEB_URL.matcher(charSequence);
        int color = AbstractC2397b.getColor(Utils.m27275a(), R$color.color_0ba7ff);
        CharSequence string = charSequence;
        while (true) {
            int iO0 = 0;
            if (!matcher.find()) {
                break;
            }
            String strGroup = matcher.group();
            Intrinsics.m97799e(strGroup);
            if (StringsKt.m98226G(strGroup, ")", false, 2, obj)) {
                Intrinsics.m97799e(strGroup);
                strGroup = StringsKt.m98236Q(strGroup, ")", "", false, 4, null);
            }
            String str = strGroup;
            if (string != null) {
                Intrinsics.m97799e(str);
                iO0 = StringsKt.m98156o0(string, str, 0, false, 6, null);
            }
            Intrinsics.m97799e(str);
            String strQ = StringsKt.m98236Q(str, "%20", " ", false, 4, null);
            Matcher matcher2 = f51119a.matcher(strQ);
            if (matcher2.find()) {
                String strGroup2 = matcher2.group();
                Intrinsics.m97801g(strGroup2, "group(...)");
                String strQ2 = StringsKt.m98236Q(strQ, strGroup2, "", false, 4, null);
                Matcher matcher3 = Patterns.DOMAIN_NAME.matcher(strQ2);
                if (matcher3.find()) {
                    String strGroup3 = matcher3.group();
                    Intrinsics.m97799e(strGroup3);
                    i12 = 2;
                    if (StringsKt.m98132c0(strGroup3, ".", iO0, 2, obj)) {
                        List listS0 = StringsKt.m98117S0(strGroup3, new String[]{"."}, false, 0, 6, null);
                        if (listS0.size() > 2) {
                            strQ2 = StringsKt.m98236Q(strQ2, listS0.get(0) + ".", "", false, 4, null);
                        }
                    }
                } else {
                    i12 = 2;
                }
                if (strQ2.length() > 24) {
                    strQ2 = StringsKt.m98111M0(strQ2, 24, strQ2.length(), "...").toString();
                }
                String str2 = "-" + strQ2;
                String strValueOf = String.valueOf(string);
                Intrinsics.m97799e(str);
                string = StringsKt.m98238S(strValueOf, str, str2, false, 4, null);
                Drawable drawable = AbstractC2397b.getDrawable(Utils.m27275a(), R$mipmap.base_ic_url_link);
                if (drawable != null) {
                    drawable.setBounds(iO0, iO0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                }
                arrayList.add(new UrlContent(new b(function2, strQ, z11, color), drawable != null ? new C14580d(drawable, i12) : null, str, str2, iO0));
                obj = null;
            }
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, textView != null ? textView.getPaint() : null, textView != null ? textView.getWidth() : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        if (i11 < staticLayout.getLineCount()) {
            int lineEnd = staticLayout.getLineEnd(i11 - 1) - 13;
            if ((string != null ? string.length() : 0) > 30 && lineEnd > 0) {
                if (lineEnd < (string != null ? string.length() : 0)) {
                    string = string != null ? string.subSequence(0, lineEnd).toString() : null;
                }
            }
            spannableStringBuilder = new SpannableStringBuilder(string);
            for (UrlContent urlContent : arrayList) {
                if (urlContent.getIndexOfUrl() + urlContent.getUrl().length() < spannableStringBuilder.length()) {
                    spannableStringBuilder.setSpan(urlContent.getIconSpan(), urlContent.getIndexOfUrl(), urlContent.getIndexOfUrl() + 1, 33);
                    spannableStringBuilder.setSpan(urlContent.getClickableSpan(), urlContent.getIndexOfUrl(), urlContent.getIndexOfUrl() + urlContent.getUrl().length(), 33);
                }
            }
            spannableStringBuilder.append((CharSequence) "...");
            spannableStringBuilder.append((CharSequence) " More");
            int length = spannableStringBuilder.length() - 5;
            int length2 = spannableStringBuilder.length();
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            spannableStringBuilder.setSpan(new C27817a(AbstractC26004a.m102046c(applicationM27275a)), length, length2, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Utils.m27275a().getResources().getColor(R$color.brand_new_50)), length, length2, 33);
        } else {
            spannableStringBuilder = new SpannableStringBuilder(string);
            for (UrlContent urlContent2 : arrayList) {
                spannableStringBuilder.setSpan(urlContent2.getIconSpan(), urlContent2.getIndexOfUrl(), urlContent2.getIndexOfUrl() + 1, 33);
                spannableStringBuilder.setSpan(urlContent2.getClickableSpan(), urlContent2.getIndexOfUrl(), urlContent2.getIndexOfUrl() + urlContent2.getUrl().length(), 33);
            }
        }
        if (interfaceC14561g != null) {
            interfaceC14561g.mo65676a(arrayList);
        }
        if (textView != null) {
            textView.setOnTouchListener(new ViewOnTouchListenerC24424a(spannableStringBuilder));
        }
        if (textView != null) {
            textView.setHighlightColor(AbstractC2397b.getColor(Utils.m27275a(), R$color.cl17));
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m65689d(String str) {
        Navigator.m61845x(TheRouter.m61773c(WebPageIdentity.WEB_VIEW).m61857K("url", str), null, null, 3, null);
    }

    /* JADX INFO: renamed from: e */
    public static final void m65690e(TextView textView, CharSequence charSequence, Function2 function2) {
        Intrinsics.m97802h(textView, "<this>");
        textView.setText(m65687b(textView, charSequence, true, null, function2));
    }

    /* JADX INFO: renamed from: f */
    public static final void m65691f(TextView textView, CharSequence charSequence, boolean z11, Function2 function2) {
        Intrinsics.m97802h(textView, "<this>");
        textView.setText(m65687b(textView, charSequence, z11, null, function2));
    }

    /* JADX INFO: renamed from: g */
    public static final void m65692g(TextView textView, CharSequence charSequence, int i11, Function2 function2) {
        Intrinsics.m97802h(textView, "<this>");
        textView.setText(m65688c(textView, charSequence, true, i11, null, function2));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m65693h(TextView textView, CharSequence charSequence, int i11, Function2 function2, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 10;
        }
        if ((i12 & 4) != 0) {
            function2 = null;
        }
        m65692g(textView, charSequence, i11, function2);
    }
}
