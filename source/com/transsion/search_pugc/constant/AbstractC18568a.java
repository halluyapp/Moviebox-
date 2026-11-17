package com.transsion.search_pugc.constant;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.core.content.AbstractC2397b;
import ck.AbstractC5114k;
import com.therouter.TheRouter;
import com.therouter.router.Navigator;
import com.transsion.search.R$color;
import com.transsion.search_pugc.constant.AbstractC18568a;
import com.transsion.ugcvideodetail.api.bean.UGCVerticalRank;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import p850vv.AbstractC28228b;

/* JADX INFO: renamed from: com.transsion.search_pugc.constant.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC18568a {
    /* JADX INFO: renamed from: c */
    public static final Navigator m78230c(Navigator navigator, String str) {
        Navigator navigatorM61857K;
        Intrinsics.m97802h(navigator, "<this>");
        return (str == null || (navigatorM61857K = navigator.m61857K("ops", str)) == null) ? navigator : navigatorM61857K;
    }

    /* JADX INFO: renamed from: d */
    public static final SpannableString m78231d(String str, Context context, String str2) {
        Intrinsics.m97802h(str, "<this>");
        Intrinsics.m97802h(context, "context");
        SpannableString spannableString = new SpannableString(str);
        if (str2 != null && !StringsKt.m98160q0(str2)) {
            int color = AbstractC2397b.getColor(context, R$color.color_keyword);
            List<String> listSplit = new Regex("\\s+").split(StringsKt.m98155n1(str2).toString(), 0);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listSplit) {
                if (!StringsKt.m98160q0((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return spannableString;
            }
            for (MatchResult matchResult : Regex.findAll$default(new Regex(CollectionsKt.m97369s0(arrayList, "[\\s\\p{Punct}]+", null, null, 0, null, new Function1() { // from class: gr.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AbstractC18568a.m78232e((String) obj2);
                }
            }, 30, null), RegexOption.IGNORE_CASE), str, 0, 2, null)) {
                spannableString.setSpan(new ForegroundColorSpan(color), matchResult.mo98072b().getFirst(), matchResult.mo98072b().getLast() + 1, 33);
            }
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final CharSequence m78232e(String it) {
        Intrinsics.m97802h(it, "it");
        return Regex.INSTANCE.m98086c(it);
    }

    /* JADX INFO: renamed from: f */
    public static final void m78233f(UGCVerticalRank uGCVerticalRank, String str) {
        UGCVideo uGCVideo;
        Intrinsics.m97802h(uGCVerticalRank, "<this>");
        Navigator navigatorM61857K = TheRouter.m61773c("/home/ugc_film_list").m61857K("filmType", uGCVerticalRank.getId()).m61857K("filmListTitle", uGCVerticalRank.getTitle());
        List<UGCVideo> videos = uGCVerticalRank.getVideos();
        navigatorM61857K.m61857K("videoType", (videos == null || (uGCVideo = (UGCVideo) CollectionsKt.m97361k0(videos)) == null) ? null : uGCVideo.getCategory());
        AbstractC5114k.m23933p(m78230c(navigatorM61857K, str));
    }

    /* JADX INFO: renamed from: g */
    public static final void m78234g(UGCVideo uGCVideo, final boolean z11) {
        Intrinsics.m97802h(uGCVideo, "<this>");
        AbstractC28228b.m109412a(uGCVideo, new Function1() { // from class: gr.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC18568a.m78236i(z11, (Navigator) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m78235h(UGCVideo uGCVideo, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        m78234g(uGCVideo, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final Navigator m78236i(boolean z11, Navigator navigator) {
        Intrinsics.m97802h(navigator, "navigator");
        return navigator.m61872z("ugc_without_history", z11);
    }

    /* JADX INFO: renamed from: j */
    public static final String m78237j(long j11) {
        long j12 = 60;
        String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j11 / j12), Long.valueOf(j11 % j12)}, 2));
        Intrinsics.m97801g(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: k */
    public static final List m78238k(List list) {
        Intrinsics.m97802h(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new ResultCollectItemWrapper((UGCVideo) it.next(), ResultCollectItemWrapper.Type.DATA));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static final String m78239l(String str) {
        Intrinsics.m97802h(str, "<this>");
        try {
            int i11 = Integer.parseInt(str);
            if (i11 < 1000) {
                str = String.valueOf(i11);
            } else if (i11 < 1000000) {
                String str2 = String.format("%.1fk", Arrays.copyOf(new Object[]{Double.valueOf(((double) i11) / 1000.0d)}, 1));
                Intrinsics.m97801g(str2, "format(...)");
                str = StringsKt.m98108J0(str2, ".0");
            } else if (i11 < 1000000000) {
                String str3 = String.format("%.1fM", Arrays.copyOf(new Object[]{Double.valueOf(((double) i11) / 1000000.0d)}, 1));
                Intrinsics.m97801g(str3, "format(...)");
                str = StringsKt.m98108J0(str3, ".0");
            } else {
                str = "999M+";
            }
        } catch (NumberFormatException unused) {
        }
        return str;
    }
}
