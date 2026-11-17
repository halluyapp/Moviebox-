package com.transsion.postdetail.util;

import com.transsion.moviedetailapi.bean.FirstFrame;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.Image;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.User;
import com.transsion.moviedetailapi.bean.Video;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import fk.AbstractC23384a;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p462hj.C23860f;
import pg.C26866a;

/* JADX INFO: renamed from: com.transsion.postdetail.util.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C17437g {

    /* JADX INFO: renamed from: a */
    public static final C17437g f57828a = new C17437g();

    /* JADX INFO: renamed from: b */
    private static boolean f57829b;

    private C17437g() {
    }

    /* JADX INFO: renamed from: a */
    private final void m74957a(PostSubjectItem postSubjectItem) {
        List<Image> image;
        Media media = postSubjectItem.getMedia();
        if (media == null || (image = media.getImage()) == null) {
            return;
        }
        Iterator<T> it = image.iterator();
        while (it.hasNext()) {
            String url = ((Image) it.next()).getUrl();
            if (url != null) {
                C23860f.a aVar = C23860f.f72909a;
                String strM94447e = C23860f.a.m94447e(aVar, url, aVar.m94454c(), false, true, 4, null);
                C26866a.a.m104905r(C26866a.f81698a, "PostImage", new String[]{"3----preloadImage:" + strM94447e}, false, 4, null);
                C23860f.a.m94451j(aVar, strM94447e, url, aVar.m94454c(), null, 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m74958c(PostSubjectItem postSubjectItem) {
        List<Video> video;
        Video video2;
        FirstFrame firstFrame;
        String url;
        Media media = postSubjectItem.getMedia();
        if (media == null || (video = media.getVideo()) == null || (video2 = (Video) CollectionsKt.m97361k0(video)) == null) {
            return;
        }
        Integer height = video2.getHeight();
        int iIntValue = height != null ? height.intValue() : 0;
        Integer width = video2.getWidth();
        boolean z11 = iIntValue > (width != null ? width.intValue() : 0);
        if (z11) {
            AbstractC23384a.m92908b(280);
        } else {
            AbstractC23384a.m92908b(162);
        }
        int iM92908b = AbstractC23384a.m92908b(z11 ? Sdk$SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE : 280);
        Media media2 = postSubjectItem.getMedia();
        if (media2 == null || (firstFrame = media2.getFirstFrame()) == null || (url = firstFrame.getUrl()) == null) {
            return;
        }
        C23860f.a aVar = C23860f.f72909a;
        String strM94447e = C23860f.a.m94447e(aVar, url, iM92908b, false, true, 4, null);
        C26866a.a.m104905r(C26866a.f81698a, "PostImage", new String[]{"4-----preloadVideoImage:" + strM94447e}, false, 4, null);
        C23860f.a.m94451j(aVar, strM94447e, url, iM92908b, null, 8, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m74959b(List dataList) {
        String avatar;
        String avatar2;
        Intrinsics.m97802h(dataList, "dataList");
        Iterator it = dataList.iterator();
        while (it.hasNext()) {
            PostSubjectItem postSubjectItem = (PostSubjectItem) it.next();
            Group group = postSubjectItem.getGroup();
            if (group != null && (avatar2 = group.getAvatar()) != null) {
                C23860f.a aVar = C23860f.f72909a;
                String strM94447e = C23860f.a.m94447e(aVar, avatar2, AbstractC23384a.m92908b(36), false, true, 4, null);
                C26866a.a.m104905r(C26866a.f81698a, "PostImage", new String[]{"1--preloadRoomAvatar:" + strM94447e}, false, 4, null);
                C23860f.a.m94451j(aVar, strM94447e, avatar2, AbstractC23384a.m92908b(36), null, 8, null);
            }
            User user = postSubjectItem.getUser();
            if (user != null && (avatar = user.getAvatar()) != null) {
                C23860f.a aVar2 = C23860f.f72909a;
                String strM94447e2 = C23860f.a.m94447e(aVar2, avatar, AbstractC23384a.m92908b(16), false, true, 4, null);
                C26866a.a.m104905r(C26866a.f81698a, "PostImage", new String[]{"2---preloadUserAvatar:" + strM94447e2}, false, 4, null);
                C23860f.a.m94451j(aVar2, C23860f.a.m94447e(aVar2, avatar, AbstractC23384a.m92908b(16), false, true, 4, null), avatar, AbstractC23384a.m92908b(16), null, 8, null);
            }
            Media media = postSubjectItem.getMedia();
            String mediaType = media != null ? media.getMediaType() : null;
            if (Intrinsics.m97797c(mediaType, MediaType.IMAGE.getValue())) {
                f57828a.m74957a(postSubjectItem);
            } else if (Intrinsics.m97797c(mediaType, MediaType.VIDEO.getValue())) {
                f57828a.m74958c(postSubjectItem);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m74960d(boolean z11) {
        f57829b = z11;
    }
}
