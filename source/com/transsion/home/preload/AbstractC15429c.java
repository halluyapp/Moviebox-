package com.transsion.home.preload;

import android.content.Context;
import com.transsion.home.bean.AppointSubject;
import com.transsion.home.bean.BannerData;
import com.transsion.home.bean.CustomData;
import com.transsion.home.bean.FilterItem;
import com.transsion.home.bean.OperateItem;
import com.transsion.moviedetailapi.bean.Cover;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.Subject;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p620nn.AbstractC26037d;

/* JADX INFO: renamed from: com.transsion.home.preload.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15429c {
    /* JADX INFO: renamed from: a */
    public static final void m68504a(Context context, List list) {
        Cover cover;
        String url;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Subject feedsSubject = ((OperateItem) it.next()).getFeedsSubject();
                if (feedsSubject != null && (cover = feedsSubject.getCover()) != null && (url = cover.getUrl()) != null && context != null) {
                    AbstractC26037d.m102100b(url);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m68505b(List list) {
        CustomData customData;
        List<BannerData> items;
        String url;
        String url2;
        String url3;
        if (list != null) {
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.m97515u();
                }
                OperateItem operateItem = (OperateItem) obj;
                if (i11 >= 2) {
                    String type = operateItem.getType();
                    if (Intrinsics.m97797c(type, PostItemType.FILTER.getValue())) {
                        List<FilterItem> filters = operateItem.getFilters();
                        if (filters != null) {
                            int i13 = 0;
                            for (Object obj2 : filters) {
                                int i14 = i13 + 1;
                                if (i13 < 0) {
                                    CollectionsKt.m97515u();
                                }
                                FilterItem filterItem = (FilterItem) obj2;
                                if (i13 < 3) {
                                    Cover image = filterItem.getImage();
                                    if (image == null || (url3 = image.getUrl()) == null) {
                                        url3 = "";
                                    }
                                    AbstractC26037d.m102100b(url3);
                                }
                                i13 = i14;
                            }
                        }
                    } else if (Intrinsics.m97797c(type, PostItemType.OP_SUBJECTS_MOVIE.getValue())) {
                        List<AppointSubject> subjects = operateItem.getSubjects();
                        if (subjects != null) {
                            int i15 = 0;
                            for (Object obj3 : subjects) {
                                int i16 = i15 + 1;
                                if (i15 < 0) {
                                    CollectionsKt.m97515u();
                                }
                                AppointSubject appointSubject = (AppointSubject) obj3;
                                if (i15 < 4) {
                                    Cover cover = appointSubject.getCover();
                                    if (cover == null || (url2 = cover.getUrl()) == null) {
                                        url2 = "";
                                    }
                                    AbstractC26037d.m102100b(url2);
                                }
                                i15 = i16;
                            }
                        }
                    } else if (Intrinsics.m97797c(type, PostItemType.CUSTOM_DATA.getValue()) && (customData = operateItem.getCustomData()) != null && (items = customData.getItems()) != null) {
                        int i17 = 0;
                        for (Object obj4 : items) {
                            int i18 = i17 + 1;
                            if (i17 < 0) {
                                CollectionsKt.m97515u();
                            }
                            BannerData bannerData = (BannerData) obj4;
                            CustomData customData2 = operateItem.getCustomData();
                            if (i17 < (customData2 != null ? customData2.getRowCount() : 0)) {
                                Image image2 = bannerData.getImage();
                                if (image2 == null || (url = image2.getUrl()) == null) {
                                    url = "";
                                }
                                AbstractC26037d.m102100b(url);
                            }
                            i17 = i18;
                        }
                    }
                }
                i11 = i12;
            }
        }
    }
}
