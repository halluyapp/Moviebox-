package com.transsion.room.helper;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.cloud.tmc.integration.constants.IntegrationConstants;
import com.cloud.tmc.integration.event.EventConstants;
import com.transsion.moviedetailapi.bean.Group;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import com.transsion.moviedetailapi.bean.RoomItem;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.User;
import com.transsion.web.api.WebConstants;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.room.helper.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C18189l {

    /* JADX INFO: renamed from: a */
    public static final C18189l f59333a = new C18189l();

    private C18189l() {
    }

    /* JADX INFO: renamed from: a */
    public final void m77093a(String pageName) {
        Intrinsics.m97802h(pageName, "pageName");
        C24662i.f75350a.m96881p(pageName, MapsKt.m97578m(TuplesKt.m97108a(EventConstants.KEY_SOURCE, "my_room"), TuplesKt.m97108a("module_name", IntegrationConstants.NAVIGATION_BAR_ALL_ACTION)));
    }

    /* JADX INFO: renamed from: b */
    public final void m77094b(String pageName, RoomItem item) {
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(item, "item");
        Pair pairM97108a = TuplesKt.m97108a(EventConstants.KEY_SOURCE, "my_room");
        Pair pairM97108a2 = TuplesKt.m97108a("module_name", WebConstants.FIELD_ITEM);
        String groupId = item.getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        C24662i.f75350a.m96881p(pageName, MapsKt.m97578m(pairM97108a, pairM97108a2, TuplesKt.m97108a("group_id", groupId), TuplesKt.m97108a("ops", item.getOps())));
    }

    /* JADX INFO: renamed from: c */
    public final void m77095c(String pageName, String str, PostSubjectItem item) {
        String userId;
        String mediaType;
        String subjectId;
        String string;
        String groupId;
        Integer subjectType;
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(item, "item");
        Pair pairM97108a = TuplesKt.m97108a(EventConstants.KEY_SOURCE, str);
        Pair pairM97108a2 = TuplesKt.m97108a("module_name", "group");
        User user = item.getUser();
        String str2 = "";
        if (user == null || (userId = user.getUserId()) == null) {
            userId = "";
        }
        Pair pairM97108a3 = TuplesKt.m97108a("user_id", userId);
        String postId = item.getPostId();
        if (postId == null) {
            postId = "";
        }
        Pair pairM97108a4 = TuplesKt.m97108a("post_id", postId);
        Media media = item.getMedia();
        if (media == null || (mediaType = media.getMediaType()) == null) {
            mediaType = "";
        }
        Pair pairM97108a5 = TuplesKt.m97108a("post_media_type", mediaType);
        Subject subject = item.getSubject();
        if (subject == null || (subjectId = subject.getSubjectId()) == null) {
            subjectId = "";
        }
        Pair pairM97108a6 = TuplesKt.m97108a("subject_id", subjectId);
        Subject subject2 = item.getSubject();
        if (subject2 == null || (subjectType = subject2.getSubjectType()) == null || (string = subjectType.toString()) == null) {
            string = "";
        }
        Pair pairM97108a7 = TuplesKt.m97108a("subject_type", string);
        Pair pairM97108a8 = TuplesKt.m97108a("is_cache_post", String.valueOf(item.isRoomCache()));
        Group group = item.getGroup();
        if (group != null && (groupId = group.getGroupId()) != null) {
            str2 = groupId;
        }
        C24662i.f75350a.m96881p(pageName, MapsKt.m97578m(pairM97108a, pairM97108a2, pairM97108a3, pairM97108a4, pairM97108a5, pairM97108a6, pairM97108a7, pairM97108a8, TuplesKt.m97108a("group_id", str2), TuplesKt.m97108a("ops", item.getOps())));
    }

    /* JADX INFO: renamed from: d */
    public final void m77096d(String pageName, String str) {
        Intrinsics.m97802h(pageName, "pageName");
        C24662i.f75350a.m96881p(pageName, MapsKt.m97578m(TuplesKt.m97108a(EventConstants.KEY_SOURCE, str), TuplesKt.m97108a("module_name", IntegrationConstants.NAVIGATION_BAR_ALL_ACTION)));
    }

    /* JADX INFO: renamed from: e */
    public final void m77097e(String pageName, String moduleName, RoomItem item) {
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(moduleName, "moduleName");
        Intrinsics.m97802h(item, "item");
        Pair pairM97108a = TuplesKt.m97108a("module_name", moduleName);
        String groupId = item.getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        C24662i.f75350a.m96872D(pageName, MapsKt.m97578m(pairM97108a, TuplesKt.m97108a("group_id", groupId), TuplesKt.m97108a("ops", item.getOps())));
    }

    /* JADX INFO: renamed from: f */
    public final void m77098f(String pageName, String str) {
        Intrinsics.m97802h(pageName, "pageName");
        C24662i.f75350a.m96881p(pageName, MapsKt.m97578m(TuplesKt.m97108a(EventConstants.KEY_SOURCE, str), TuplesKt.m97108a("module_name", "explore")));
    }

    /* JADX INFO: renamed from: g */
    public final void m77099g(String pageName, String str, RoomItem item) {
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(item, "item");
        Pair pairM97108a = TuplesKt.m97108a(EventConstants.KEY_SOURCE, str);
        Pair pairM97108a2 = TuplesKt.m97108a("module_name", WebConstants.FIELD_ITEM);
        String groupId = item.getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        C24662i.f75350a.m96881p(pageName, MapsKt.m97578m(pairM97108a, pairM97108a2, TuplesKt.m97108a("group_id", groupId), TuplesKt.m97108a("has_join", Intrinsics.m97797c(item.getHasJoin(), Boolean.TRUE) ? "1" : "0"), TuplesKt.m97108a("ops", item.getOps())));
    }

    /* JADX INFO: renamed from: h */
    public final void m77100h(String pageName) {
        Intrinsics.m97802h(pageName, "pageName");
        C24662i.f75350a.m96881p(pageName, MapsKt.m97578m(TuplesKt.m97108a("opt_type", "room_list_more")));
    }

    /* JADX INFO: renamed from: i */
    public final void m77101i(String str, String pageName, int i11, long j11, RoomItem item) {
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(item, "item");
        String groupId = item.getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        C24662i.f75350a.m96872D(pageName, MapsKt.m97578m(TuplesKt.m97108a("group_id", groupId), TuplesKt.m97108a(RequestParameters.POSITION, String.valueOf(i11)), TuplesKt.m97108a(WebConstants.PAGE_FROM, str), TuplesKt.m97108a("browse_duration", String.valueOf(j11)), TuplesKt.m97108a("module_name", WebConstants.FIELD_ITEM), TuplesKt.m97108a("ops", item.getOps())));
    }

    /* JADX INFO: renamed from: j */
    public final void m77102j(String str, String pageName, int i11, RoomItem item) {
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(item, "item");
        String groupId = item.getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        C24662i.f75350a.m96881p(pageName, MapsKt.m97578m(TuplesKt.m97108a("group_id", groupId), TuplesKt.m97108a(RequestParameters.POSITION, String.valueOf(i11)), TuplesKt.m97108a(WebConstants.PAGE_FROM, str), TuplesKt.m97108a("module_name", WebConstants.FIELD_ITEM), TuplesKt.m97108a("ops", item.getOps())));
    }
}
