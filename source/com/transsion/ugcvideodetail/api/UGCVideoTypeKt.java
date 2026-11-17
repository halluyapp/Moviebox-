package com.transsion.ugcvideodetail.api;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.blankj.utilcode.util.AbstractC5796o;
import com.google.gson.reflect.TypeToken;
import com.transsion.baseui.R$drawable;
import com.transsion.baseui.R$string;
import com.transsion.p299mb.config.manager.ConfigBean;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoCategory;
import fk.AbstractC23384a;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p462hj.C23860f;
import p913xm.C28615f;

/* JADX INFO: loaded from: classes6.dex */
public abstract class UGCVideoTypeKt {

    /* JADX INFO: renamed from: a */
    private static String f64043a;

    /* JADX INFO: renamed from: b */
    private static Map f64044b;

    /* JADX INFO: renamed from: c */
    private static final Lazy f64045c = LazyKt.m97097b(new Function0() { // from class: com.transsion.ugcvideodetail.api.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(UGCVideoTypeKt.m83621b());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final int m83621b() {
        return AbstractC23384a.m92908b(12);
    }

    /* JADX INFO: renamed from: c */
    private static final Map m83622c() {
        Map map = null;
        ConfigBean configBeanM110355d = C28615f.m110355d(C28615f.f87796c.m110363a(), "sa_ugc_category_icon_config", false, 2, null);
        String value = configBeanM110355d != null ? configBeanM110355d.getValue() : null;
        if (value == null || value.length() == 0) {
            return null;
        }
        if (Intrinsics.m97797c(value, f64043a)) {
            return f64044b;
        }
        try {
            Object objM27442e = AbstractC5796o.m27442e(value, new TypeToken<Map<String, ? extends String>>() { // from class: com.transsion.ugcvideodetail.api.UGCVideoTypeKt$getCachedIconMap$type$1
            }.getType());
            Intrinsics.m97801g(objM27442e, "fromJson(...)");
            Map map2 = (Map) objM27442e;
            f64043a = value;
            f64044b = map2;
            map = map2;
        } catch (Throwable unused) {
        }
        return map;
    }

    /* JADX INFO: renamed from: d */
    private static final int m83623d() {
        return ((Number) f64045c.getValue()).intValue();
    }

    /* JADX INFO: renamed from: e */
    public static final int m83624e(String str) {
        if (Intrinsics.m97797c(str, UGCVideoType.MOVIE.getValue())) {
            return R$drawable.ic_tag_movie;
        }
        if (Intrinsics.m97797c(str, UGCVideoType.TV.getValue())) {
            return R$drawable.ic_tag_tv;
        }
        if (Intrinsics.m97797c(str, UGCVideoType.MUSIC.getValue())) {
            return R$drawable.ic_tag_music;
        }
        if (Intrinsics.m97797c(str, UGCVideoType.EDUCATION.getValue())) {
            return R$drawable.ic_tag_edu;
        }
        if (Intrinsics.m97797c(str, UGCVideoType.SHORT_TV.getValue())) {
            return R$drawable.ic_tag_short_tv;
        }
        if (Intrinsics.m97797c(str, UGCVideoType.SPORT.getValue())) {
            return R$drawable.ic_tag_sport;
        }
        if (!Intrinsics.m97797c(str, UGCVideoType.ROOM.getValue()) && !Intrinsics.m97797c(str, UGCVideoType.POST.getValue())) {
            if (Intrinsics.m97797c(str, UGCVideoType.NOVEL.getValue())) {
                return R$drawable.ic_tag_novel;
            }
            if (Intrinsics.m97797c(str, UGCVideoType.LIVE.getValue())) {
                return R$drawable.ic_tag_live;
            }
            if (Intrinsics.m97797c(str, UGCVideoType.KIDS.getValue())) {
                return R$drawable.ic_tag_kids;
            }
            return Intrinsics.m97797c(str, UGCVideoType.RECREATION.getValue()) ? R$drawable.ic_tag_breakdown : R$drawable.ic_tag_default;
        }
        return R$drawable.ic_tag_room;
    }

    /* JADX INFO: renamed from: f */
    private static final String m83625f(UGCVideo uGCVideo) {
        Map mapM83622c = m83622c();
        if (mapM83622c == null) {
            return null;
        }
        UGCVideoCategory cateLev4 = uGCVideo.getCateLev4();
        Integer id2 = cateLev4 != null ? cateLev4.getId() : null;
        UGCVideoCategory cateLev3 = uGCVideo.getCateLev3();
        Integer id3 = cateLev3 != null ? cateLev3.getId() : null;
        UGCVideoCategory cateLev2 = uGCVideo.getCateLev2();
        Integer id4 = cateLev2 != null ? cateLev2.getId() : null;
        UGCVideoCategory cateLev1 = uGCVideo.getCateLev1();
        Iterator it = CollectionsKt.m97510p(id2, id3, id4, cateLev1 != null ? cateLev1.getId() : null).iterator();
        while (it.hasNext()) {
            String str = (String) mapM83622c.get(String.valueOf(((Number) it.next()).intValue()));
            if (str != null) {
                return str;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final int m83626g(String str) {
        if (Intrinsics.m97797c(str, UGCVideoType.MOVIE.getValue())) {
            return R$string.ugc_video_movie;
        }
        if (Intrinsics.m97797c(str, UGCVideoType.TV.getValue())) {
            return R$string.ugc_video_tv_shows;
        }
        if (Intrinsics.m97797c(str, UGCVideoType.MUSIC.getValue())) {
            return R$string.ugc_video_music;
        }
        if (Intrinsics.m97797c(str, UGCVideoType.EDUCATION.getValue())) {
            return R$string.ugc_video_education;
        }
        if (Intrinsics.m97797c(str, UGCVideoType.SHORT_TV.getValue())) {
            return R$string.ugc_video_short_tv;
        }
        if (Intrinsics.m97797c(str, UGCVideoType.SPORT.getValue())) {
            return R$string.ugc_video_sports;
        }
        if (!Intrinsics.m97797c(str, UGCVideoType.ROOM.getValue()) && !Intrinsics.m97797c(str, UGCVideoType.POST.getValue())) {
            if (Intrinsics.m97797c(str, UGCVideoType.NOVEL.getValue())) {
                return R$string.ugc_video_novel;
            }
            if (Intrinsics.m97797c(str, UGCVideoType.LIVE.getValue())) {
                return R$string.ugc_video_live;
            }
            if (Intrinsics.m97797c(str, UGCVideoType.KIDS.getValue())) {
                return R$string.ugc_video_kids;
            }
            return Intrinsics.m97797c(str, UGCVideoType.RECREATION.getValue()) ? R$string.ugc_video_recreation : R$string.ugc_video_video;
        }
        return R$string.ugc_video_buzzbox;
    }

    /* JADX INFO: renamed from: h */
    public static final void m83627h(ImageView imageView, UGCVideo ugcVideo, Integer num) {
        Intrinsics.m97802h(imageView, "imageView");
        Intrinsics.m97802h(ugcVideo, "ugcVideo");
        int iM83624e = m83624e(ugcVideo.getCategory());
        String strM83625f = m83625f(ugcVideo);
        if (strM83625f == null || strM83625f.length() == 0) {
            imageView.setImageResource(iM83624e);
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = num != null ? num.intValue() : m83623d();
        layoutParams.height = num != null ? num.intValue() : m83623d();
        imageView.setLayoutParams(layoutParams);
        C23860f.a aVar = C23860f.f72909a;
        Context context = imageView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        aVar.m94457m(context).m94468g(strM83625f).m94470i(iM83624e).m94465d(imageView);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m83628i(ImageView imageView, UGCVideo uGCVideo, Integer num, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        m83627h(imageView, uGCVideo, num);
    }

    /* JADX INFO: renamed from: j */
    public static final void m83629j(ImageView imageView, Integer num, Integer num2, Integer num3, Integer num4, String str) {
        String str2;
        Intrinsics.m97802h(imageView, "imageView");
        int iM83624e = m83624e(str);
        Map mapM83622c = m83622c();
        Iterator it = CollectionsKt.m97510p(num4, num3, num2, num).iterator();
        do {
            str2 = null;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = ((Number) it.next()).intValue();
            if (mapM83622c != null) {
                str2 = (String) mapM83622c.get(String.valueOf(iIntValue));
            }
        } while (str2 == null);
        if (str2 == null || str2.length() == 0) {
            imageView.setImageResource(iM83624e);
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = m83623d();
        layoutParams.height = m83623d();
        imageView.setLayoutParams(layoutParams);
        C23860f.a aVar = C23860f.f72909a;
        Context context = imageView.getContext();
        Intrinsics.m97801g(context, "getContext(...)");
        aVar.m94457m(context).m94468g(str2).m94470i(iM83624e).m94465d(imageView);
    }
}
