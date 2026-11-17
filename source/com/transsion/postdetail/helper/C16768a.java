package com.transsion.postdetail.helper;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.transsion.baselib.helper.C14450a;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.Link;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.MediaType;
import com.transsion.moviedetailapi.bean.PostItemType;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.User;
import com.transsion.player.mediasession.MediaItem;
import com.transsion.web.api.WebConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.postdetail.helper.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C16768a {

    /* JADX INFO: renamed from: a */
    public static final C16768a f56378a = new C16768a();

    private C16768a() {
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m73054B(C16768a c16768a, PostSubjectItem postSubjectItem, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "postdetail";
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        c16768a.m73067A(postSubjectItem, str, str2);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m73055D(C16768a c16768a, PostSubjectItem postSubjectItem, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "postdetail";
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        c16768a.m73068C(postSubjectItem, str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m73056b(C16768a c16768a, PostSubjectItem postSubjectItem, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "postdetail";
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        c16768a.m73069a(postSubjectItem, str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m73057d(C16768a c16768a, PostSubjectItem postSubjectItem, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "postdetail";
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        c16768a.m73070c(postSubjectItem, str, str2);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m73058f(C16768a c16768a, PostSubjectItem postSubjectItem, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "postdetail";
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        c16768a.m73071e(postSubjectItem, str, str2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m73059j(C16768a c16768a, PostSubjectItem postSubjectItem, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "postdetail";
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        c16768a.m73074i(postSubjectItem, str, str2);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m73060n(C16768a c16768a, PostSubjectItem postSubjectItem, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "postdetail";
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        c16768a.m73077m(postSubjectItem, str, str2);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m73061q(C16768a c16768a, PostSubjectItem postSubjectItem, boolean z11, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = "postdetail";
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        c16768a.m73079p(postSubjectItem, z11, str, str2);
    }

    /* JADX INFO: renamed from: r */
    private final void m73062r(PostSubjectItem postSubjectItem, String str, String str2, String str3) {
        String subjectId;
        String postId;
        String value;
        String value2;
        String value3;
        String groupId;
        String title;
        String url;
        String ops;
        User user;
        String userId;
        Link link;
        Group group;
        Media media;
        Media media2;
        Subject subject;
        Subject subject2;
        HashMap map = new HashMap();
        if (str3 != null && str3.length() != 0) {
            map.put(WebConstants.PAGE_FROM, str3);
        }
        map.put("module_name", str);
        String str4 = "";
        if (postSubjectItem == null || (subject2 = postSubjectItem.getSubject()) == null || (subjectId = subject2.getSubjectId()) == null) {
            subjectId = "";
        }
        map.put("subject_id", subjectId);
        map.put("has_resource", String.valueOf((postSubjectItem == null || (subject = postSubjectItem.getSubject()) == null) ? null : subject.getHasResource()));
        if (postSubjectItem == null || (postId = postSubjectItem.getPostId()) == null) {
            postId = "";
        }
        map.put("post_id", postId);
        if (postSubjectItem == null || (media2 = postSubjectItem.getMedia()) == null || (value = media2.getMediaType()) == null) {
            value = MediaType.TEXT.getValue();
        }
        map.put("post_media_type", value);
        if (postSubjectItem == null || (value2 = postSubjectItem.getItemType()) == null) {
            value2 = PostItemType.SUBJECT.getValue();
        }
        map.put("item_type", value2);
        if (postSubjectItem == null || (media = postSubjectItem.getMedia()) == null || (value3 = media.getMediaType()) == null) {
            value3 = MediaType.TEXT.getValue();
        }
        map.put("post_media_type", value3);
        if (postSubjectItem == null || (group = postSubjectItem.getGroup()) == null || (groupId = group.getGroupId()) == null) {
            groupId = "";
        }
        map.put("group_id", groupId);
        if (postSubjectItem == null || (title = postSubjectItem.getTitle()) == null) {
            title = "";
        }
        map.put(CampaignEx.JSON_KEY_TITLE, title);
        if (postSubjectItem == null || (link = postSubjectItem.getLink()) == null || (url = link.getUrl()) == null) {
            url = "";
        }
        map.put("link_url", url);
        if (postSubjectItem == null || (ops = postSubjectItem.getOps()) == null) {
            ops = "";
        }
        map.put("ops", ops);
        if (postSubjectItem != null && (user = postSubjectItem.getUser()) != null && (userId = user.getUserId()) != null) {
            str4 = userId;
        }
        map.put("avatar_user_id", str4);
        C14450a.f50860a.m65144g(str2, map);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m73063t(C16768a c16768a, PostSubjectItem postSubjectItem, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "postdetail";
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        c16768a.m73080s(postSubjectItem, str, str2);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m73064v(C16768a c16768a, PostSubjectItem postSubjectItem, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "postdetail";
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        c16768a.m73081u(postSubjectItem, str, str2);
    }

    /* JADX INFO: renamed from: A */
    public final void m73067A(PostSubjectItem postSubjectItem, String pageName, String str) {
        Intrinsics.m97802h(pageName, "pageName");
        m73062r(postSubjectItem, "share", pageName, str);
    }

    /* JADX INFO: renamed from: C */
    public final void m73068C(PostSubjectItem postSubjectItem, String pageName, String str) {
        Intrinsics.m97802h(pageName, "pageName");
        m73062r(postSubjectItem, "subject", pageName, str);
    }

    /* JADX INFO: renamed from: a */
    public final void m73069a(PostSubjectItem postSubjectItem, String pageName, String str) {
        Intrinsics.m97802h(pageName, "pageName");
        m73062r(postSubjectItem, "audio_play", pageName, str);
    }

    /* JADX INFO: renamed from: c */
    public final void m73070c(PostSubjectItem postSubjectItem, String pageName, String str) {
        Intrinsics.m97802h(pageName, "pageName");
        m73062r(postSubjectItem, "avatar", pageName, str);
    }

    /* JADX INFO: renamed from: e */
    public final void m73071e(PostSubjectItem postSubjectItem, String pageName, String str) {
        Intrinsics.m97802h(pageName, "pageName");
        m73062r(postSubjectItem, "comment", pageName, str);
    }

    /* JADX INFO: renamed from: g */
    public final void m73072g(String pageName, int i11, long j11, String str, String str2, String commentType, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(commentType, "commentType");
        if (str == null) {
            str = "";
        }
        Pair pairM97108a = TuplesKt.m97108a("comment_id", str);
        Pair pairM97108a2 = TuplesKt.m97108a(RequestParameters.POSITION, String.valueOf(i11));
        Pair pairM97108a3 = TuplesKt.m97108a("browse_duration", String.valueOf(j11));
        Pair pairM97108a4 = TuplesKt.m97108a("module_name", "comment");
        if (str2 == null) {
            str2 = "";
        }
        Map mapM = MapsKt.m97578m(pairM97108a, pairM97108a2, pairM97108a3, pairM97108a4, TuplesKt.m97108a("topic_id", str2), TuplesKt.m97108a("comment_type", commentType));
        if (str3 != null && str3.length() != 0) {
            mapM.put(WebConstants.PAGE_FROM, str3);
        }
        if (str4 != null) {
            mapM.put("track_id", str4);
        }
        if (str5 != null) {
            mapM.put("parent_track_id", str5);
        }
        if (str6 != null) {
            mapM.put("parent_content_id", str6);
        }
        if (str7 != null) {
            mapM.put("content_id", str7);
        }
        if (str8 != null) {
            mapM.put("belong_to_collection_id", str8);
        }
        C24662i.f75350a.m96872D(pageName, mapM);
    }

    /* JADX INFO: renamed from: h */
    public final void m73073h(String postId, String moduleName, String pageName, String str, String commentType, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.m97802h(postId, "postId");
        Intrinsics.m97802h(moduleName, "moduleName");
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(commentType, "commentType");
        HashMap map = new HashMap();
        map.put("module_name", moduleName);
        map.put("topic_id", postId);
        map.put("comment_type", commentType);
        if (str != null && str.length() != 0) {
            map.put(WebConstants.PAGE_FROM, str);
        }
        if (str2 != null) {
            map.put("track_id", str2);
        }
        if (str3 != null) {
            map.put("parent_track_id", str3);
        }
        if (str4 != null) {
            map.put("parent_content_id", str4);
        }
        if (str5 != null) {
            map.put("content_id", str5);
        }
        if (str6 != null) {
            map.put("belong_to_collection_id", str6);
        }
        C14450a.f50860a.m65144g(pageName, map);
    }

    /* JADX INFO: renamed from: i */
    public final void m73074i(PostSubjectItem postSubjectItem, String pageName, String str) {
        Intrinsics.m97802h(pageName, "pageName");
        m73062r(postSubjectItem, "download", pageName, str);
    }

    /* JADX INFO: renamed from: k */
    public final void m73075k(PostSubjectItem postSubjectItem, String pageName, String str) {
        Intrinsics.m97802h(pageName, "pageName");
        m73062r(postSubjectItem, "downloaded", pageName, str);
    }

    /* JADX INFO: renamed from: l */
    public final void m73076l(PostSubjectItem postSubjectItem, String pageName, String str) {
        Intrinsics.m97802h(pageName, "pageName");
        m73062r(postSubjectItem, "post_feedback", pageName, str);
    }

    /* JADX INFO: renamed from: m */
    public final void m73077m(PostSubjectItem postSubjectItem, String pageName, String str) {
        Intrinsics.m97802h(pageName, "pageName");
        m73062r(postSubjectItem, "group", pageName, str);
    }

    /* JADX INFO: renamed from: o */
    public final void m73078o(PostSubjectItem postSubjectItem, String pageName, String str) {
        Intrinsics.m97802h(pageName, "pageName");
        m73062r(postSubjectItem, "image", pageName, str);
    }

    /* JADX INFO: renamed from: p */
    public final void m73079p(PostSubjectItem postSubjectItem, boolean z11, String pageName, String str) {
        Intrinsics.m97802h(pageName, "pageName");
        m73062r(postSubjectItem, z11 ? "dislike" : "like", pageName, str);
    }

    /* JADX INFO: renamed from: s */
    public final void m73080s(PostSubjectItem postSubjectItem, String pageName, String str) {
        Intrinsics.m97802h(pageName, "pageName");
        m73062r(postSubjectItem, "pause", pageName, str);
    }

    /* JADX INFO: renamed from: u */
    public final void m73081u(PostSubjectItem postSubjectItem, String pageName, String str) {
        Intrinsics.m97802h(pageName, "pageName");
        m73062r(postSubjectItem, MediaItem.MUSIC_FLOAT_STATE_PLAY, pageName, str);
    }

    /* JADX INFO: renamed from: w */
    public final void m73082w(String str, String pageName, String subpageName, int i11, long j11, PostSubjectItem item, String str2) {
        String userId;
        String groupId;
        String subjectId;
        String string;
        String value;
        Integer subjectType;
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(subpageName, "subpageName");
        Intrinsics.m97802h(item, "item");
        String postId = item.getPostId();
        if (postId == null) {
            postId = "";
        }
        Pair pairM97108a = TuplesKt.m97108a("post_id", postId);
        Pair pairM97108a2 = TuplesKt.m97108a(RequestParameters.POSITION, String.valueOf(i11));
        Pair pairM97108a3 = TuplesKt.m97108a(WebConstants.PAGE_FROM, str);
        Pair pairM97108a4 = TuplesKt.m97108a("browse_duration", String.valueOf(j11));
        Pair pairM97108a5 = TuplesKt.m97108a("subpage_name", subpageName);
        Pair pairM97108a6 = TuplesKt.m97108a("module_name", WebConstants.FIELD_ITEM);
        Pair pairM97108a7 = TuplesKt.m97108a("is_cache_post", String.valueOf(item.isRoomCache()));
        User user = item.getUser();
        if (user == null || (userId = user.getUserId()) == null) {
            userId = "";
        }
        Pair pairM97108a8 = TuplesKt.m97108a("user_id", userId);
        if (str2 == null) {
            Group group = item.getGroup();
            groupId = group != null ? group.getGroupId() : null;
            if (groupId == null) {
                groupId = "";
            }
        } else {
            groupId = str2;
        }
        Pair pairM97108a9 = TuplesKt.m97108a("group_id", groupId);
        Subject subject = item.getSubject();
        if (subject == null || (subjectId = subject.getSubjectId()) == null) {
            subjectId = "";
        }
        Pair pairM97108a10 = TuplesKt.m97108a("subject_id", subjectId);
        Subject subject2 = item.getSubject();
        if (subject2 == null || (subjectType = subject2.getSubjectType()) == null || (string = subjectType.toString()) == null) {
            string = "";
        }
        Pair pairM97108a11 = TuplesKt.m97108a("subject_type", string);
        Pair pairM97108a12 = TuplesKt.m97108a("builtin", item.getBuiltIn() ? "1" : "0");
        Media media = item.getMedia();
        if (media == null || (value = media.getMediaType()) == null) {
            value = MediaType.TEXT.getValue();
        }
        Pair pairM97108a13 = TuplesKt.m97108a("post_media_type", value);
        String ops = item.getOps();
        C24662i.f75350a.m96872D(pageName, MapsKt.m97578m(pairM97108a, pairM97108a2, pairM97108a3, pairM97108a4, pairM97108a5, pairM97108a6, pairM97108a7, pairM97108a8, pairM97108a9, pairM97108a10, pairM97108a11, pairM97108a12, pairM97108a13, TuplesKt.m97108a("ops", ops != null ? ops : "")));
    }

    /* JADX INFO: renamed from: y */
    public final void m73083y(String str, String pageName, String subpageName, int i11, String moduleName, PostSubjectItem item, String str2) {
        String userId;
        String subjectId;
        String value;
        Integer subjectType;
        String string;
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(subpageName, "subpageName");
        Intrinsics.m97802h(moduleName, "moduleName");
        Intrinsics.m97802h(item, "item");
        String postId = item.getPostId();
        String str3 = "";
        if (postId == null) {
            postId = "";
        }
        Pair pairM97108a = TuplesKt.m97108a("post_id", postId);
        Pair pairM97108a2 = TuplesKt.m97108a(RequestParameters.POSITION, String.valueOf(i11));
        Pair pairM97108a3 = TuplesKt.m97108a(WebConstants.PAGE_FROM, str);
        Pair pairM97108a4 = TuplesKt.m97108a("subpage_name", subpageName);
        Pair pairM97108a5 = TuplesKt.m97108a("module_name", moduleName);
        Pair pairM97108a6 = TuplesKt.m97108a("is_cache_post", String.valueOf(item.isRoomCache()));
        User user = item.getUser();
        if (user == null || (userId = user.getUserId()) == null) {
            userId = "";
        }
        Pair pairM97108a7 = TuplesKt.m97108a("user_id", userId);
        if (str2 == null) {
            Group group = item.getGroup();
            str2 = group != null ? group.getGroupId() : null;
            if (str2 == null) {
                str2 = "";
            }
        }
        Pair pairM97108a8 = TuplesKt.m97108a("group_id", str2);
        Subject subject = item.getSubject();
        if (subject == null || (subjectId = subject.getSubjectId()) == null) {
            subjectId = "";
        }
        Pair pairM97108a9 = TuplesKt.m97108a("subject_id", subjectId);
        Subject subject2 = item.getSubject();
        if (subject2 != null && (subjectType = subject2.getSubjectType()) != null && (string = subjectType.toString()) != null) {
            str3 = string;
        }
        Pair pairM97108a10 = TuplesKt.m97108a("subject_type", str3);
        Media media = item.getMedia();
        if (media == null || (value = media.getMediaType()) == null) {
            value = MediaType.TEXT.getValue();
        }
        C24662i.f75350a.m96881p(pageName, MapsKt.m97578m(pairM97108a, pairM97108a2, pairM97108a3, pairM97108a4, pairM97108a5, pairM97108a6, pairM97108a7, pairM97108a8, pairM97108a9, pairM97108a10, TuplesKt.m97108a("post_media_type", value), TuplesKt.m97108a("ops", item.getOps())));
    }
}
