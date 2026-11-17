package com.transsion.baseui.util;

import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.core.content.AbstractC2397b;
import com.transsion.baseui.R$drawable;
import com.transsion.baseui.R$mipmap;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.transsion.baseui.util.q */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14571q {

    /* JADX INFO: renamed from: com.transsion.baseui.util.q$a */
    public static final class a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f51129a;

        a(float f11) {
            this.f51129a = f11;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.m97802h(view, "view");
            Intrinsics.m97802h(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f51129a);
        }
    }

    /* JADX INFO: renamed from: b */
    private static final void m65705b(SpannableStringBuilder spannableStringBuilder, Context context, int i11) {
        spannableStringBuilder.append("￼");
        spannableStringBuilder.setSpan(m65707d(context, i11), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
    }

    /* JADX INFO: renamed from: c */
    public static final void m65706c(View view, float f11) {
        Intrinsics.m97802h(view, "<this>");
        view.setOutlineProvider(new a(f11));
        view.setClipToOutline(true);
    }

    /* JADX INFO: renamed from: d */
    private static final ImageSpan m65707d(Context context, int i11) {
        return Build.VERSION.SDK_INT >= 29 ? new ImageSpan(context, i11, 2) : new ImageSpan(context, i11, 1);
    }

    /* JADX INFO: renamed from: e */
    public static final SpannableStringBuilder m65708e(List array, Context context) {
        Intrinsics.m97802h(array, "array");
        Intrinsics.m97802h(context, "context");
        CollectionsKt.m97528I(array, new Function1() { // from class: com.transsion.baseui.util.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AbstractC14571q.m65711h((String) obj));
            }
        });
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i11 = 0;
        for (Object obj : array) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            String str = (String) obj;
            if (Intrinsics.m97797c(str, "special_#shorts_icon")) {
                m65705b(spannableStringBuilder, context, R$drawable.ic_tag_ugc_shorts);
                spannableStringBuilder.append((CharSequence) " ");
            } else if (Intrinsics.m97797c(str, "special_#user_icon")) {
                m65705b(spannableStringBuilder, context, R$drawable.ic_ugc_creator);
                spannableStringBuilder.append((CharSequence) " ");
            } else if (StringsKt.m98242W(str, "dynamic_icon_#", false, 2, null)) {
                Integer numV = StringsKt.m98216v(StringsKt.m98107I0(str, "dynamic_icon_#"));
                if (numV != null) {
                    m65705b(spannableStringBuilder, context, numV.intValue());
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder.append((CharSequence) str);
                if (i11 < array.size() - 1) {
                    m65705b(spannableStringBuilder, context, R$mipmap.ic_subtitle_split);
                }
            }
            i11 = i12;
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: f */
    public static final SpannableStringBuilder m65709f(List items, Context context, boolean z11) {
        Intrinsics.m97802h(items, "items");
        Intrinsics.m97802h(context, "context");
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            AbstractC14565k abstractC14565k = (AbstractC14565k) obj;
            if (!(abstractC14565k instanceof AbstractC14565k.b) || ((AbstractC14565k.b) abstractC14565k).m65684a().length() > 0) {
                arrayList.add(obj);
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i11 = 0;
        for (Object obj2 : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.m97515u();
            }
            AbstractC14565k abstractC14565k2 = (AbstractC14565k) obj2;
            if (abstractC14565k2 instanceof AbstractC14565k.a) {
                m65705b(spannableStringBuilder, context, ((AbstractC14565k.a) abstractC14565k2).m65683a());
                if (z11) {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                if (!(abstractC14565k2 instanceof AbstractC14565k.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                int length = spannableStringBuilder.length();
                AbstractC14565k.b bVar = (AbstractC14565k.b) abstractC14565k2;
                spannableStringBuilder.append((CharSequence) bVar.m65684a());
                Integer numM65685b = bVar.m65685b();
                if (numM65685b != null) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(AbstractC2397b.getColor(context, numM65685b.intValue())), length, spannableStringBuilder.length(), 33);
                }
                if (i11 < arrayList.size() - 1) {
                    m65705b(spannableStringBuilder, context, R$mipmap.ic_subtitle_split);
                }
            }
            i11 = i12;
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ SpannableStringBuilder m65710g(List list, Context context, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return m65709f(list, context, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final boolean m65711h(String it) {
        Intrinsics.m97802h(it, "it");
        return it.length() == 0;
    }
}
