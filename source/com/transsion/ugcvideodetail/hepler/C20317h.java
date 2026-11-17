package com.transsion.ugcvideodetail.hepler;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.web.api.WebConstants;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p550kj.C24662i;

/* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C20317h {

    /* JADX INFO: renamed from: a */
    public static final C20317h f64417a = new C20317h();

    private C20317h() {
    }

    /* JADX INFO: renamed from: a */
    public final void m84102a(String str, String moduleName, UGCVideo uGCVideo, String str2, String str3, String str4, String str5, Boolean bool, Integer num) {
        String collectionId;
        String str6;
        Intrinsics.m97802h(moduleName, "moduleName");
        if (str == null || uGCVideo == null) {
            return;
        }
        Pair pairM97108a = TuplesKt.m97108a("module_name", moduleName);
        String ugcVideoId = uGCVideo.getUgcVideoId();
        String str7 = "";
        if (ugcVideoId == null) {
            ugcVideoId = "";
        }
        Pair pairM97108a2 = TuplesKt.m97108a("content_id", ugcVideoId);
        UGCVideoBelongToCollection belongToCollection = uGCVideo.getBelongToCollection();
        if (belongToCollection == null || (collectionId = belongToCollection.getCollectionId()) == null) {
            collectionId = "";
        }
        Pair pairM97108a3 = TuplesKt.m97108a("belong_to_collection_id", collectionId);
        Pair pairM97108a4 = TuplesKt.m97108a("content_type", "ugc_video");
        String ops = uGCVideo.getOps();
        if (ops == null) {
            ops = "";
        }
        Map mapM = MapsKt.m97578m(pairM97108a, pairM97108a2, pairM97108a3, pairM97108a4, TuplesKt.m97108a("ops", ops));
        if (Intrinsics.m97797c(moduleName, "hash_tag") && str2 != null && str2.length() != 0) {
            mapM.put("tag_name", str2);
        }
        if (Intrinsics.m97797c(moduleName, "search") && str2 != null && str2.length() != 0) {
            List<String> searchWord = uGCVideo.getSearchWord();
            if (searchWord != null && (str6 = (String) CollectionsKt.m97361k0(searchWord)) != null) {
                str7 = str6;
            }
            mapM.put("keyword", str7);
        }
        if (str3 != null) {
            mapM.put("track_id", str3);
        }
        if (bool != null) {
            mapM.put("is_collection", String.valueOf(bool.booleanValue()));
        }
        if (str4 != null) {
            mapM.put("parent_track_id", str4);
        }
        if (str5 != null) {
            mapM.put("parent_content_id", str5);
        }
        if (num != null) {
            mapM.put(RequestParameters.POSITION, String.valueOf(num.intValue()));
        }
        C24662i.f75350a.m96881p(str, mapM);
    }

    /* JADX INFO: renamed from: c */
    public final void m84103c(String pageName, UGCVideo item, int i11, String str, String str2, String str3, String str4) {
        String collectionId;
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(item, "item");
        Pair pairM97108a = TuplesKt.m97108a("module_name", WebConstants.FIELD_ITEM);
        Pair pairM97108a2 = TuplesKt.m97108a("page_tab_name", "foryou");
        String ugcVideoId = item.getUgcVideoId();
        if (ugcVideoId == null) {
            ugcVideoId = "";
        }
        Pair pairM97108a3 = TuplesKt.m97108a("content_id", ugcVideoId);
        UGCVideoBelongToCollection belongToCollection = item.getBelongToCollection();
        if (belongToCollection == null || (collectionId = belongToCollection.getCollectionId()) == null) {
            collectionId = "";
        }
        Pair pairM97108a4 = TuplesKt.m97108a("belong_to_collection_id", collectionId);
        Pair pairM97108a5 = TuplesKt.m97108a("content_type", "ugc_video");
        String subjectId = item.getSubjectId();
        if (subjectId == null) {
            subjectId = "";
        }
        Pair pairM97108a6 = TuplesKt.m97108a("refer_subject_id", subjectId);
        String ops = item.getOps();
        if (ops == null) {
            ops = "";
        }
        Pair pairM97108a7 = TuplesKt.m97108a("ops", ops);
        Pair pairM97108a8 = TuplesKt.m97108a(RequestParameters.POSITION, String.valueOf(i11));
        if (str == null) {
            str = "";
        }
        Map mapM = MapsKt.m97578m(pairM97108a, pairM97108a2, pairM97108a3, pairM97108a4, pairM97108a5, pairM97108a6, pairM97108a7, pairM97108a8, TuplesKt.m97108a("entrance_content_id", str));
        if (str2 != null) {
            mapM.put("track_id", str2);
        }
        if (str3 != null) {
            mapM.put("parent_track_id", str3);
        }
        if (str4 != null) {
            mapM.put("parent_content_id", str4);
        }
        C24662i.f75350a.m96881p(pageName, mapM);
    }

    /* JADX INFO: renamed from: d */
    public final void m84104d(String pageName, UGCVideo item, int i11, long j11, String str, String str2, String str3, String str4) {
        String collectionId;
        Intrinsics.m97802h(pageName, "pageName");
        Intrinsics.m97802h(item, "item");
        Pair pairM97108a = TuplesKt.m97108a("module_name", WebConstants.FIELD_ITEM);
        Pair pairM97108a2 = TuplesKt.m97108a("browse_duration", String.valueOf(j11));
        Pair pairM97108a3 = TuplesKt.m97108a("page_tab_name", "foryou");
        String ugcVideoId = item.getUgcVideoId();
        if (ugcVideoId == null) {
            ugcVideoId = "";
        }
        Pair pairM97108a4 = TuplesKt.m97108a("content_id", ugcVideoId);
        UGCVideoBelongToCollection belongToCollection = item.getBelongToCollection();
        if (belongToCollection == null || (collectionId = belongToCollection.getCollectionId()) == null) {
            collectionId = "";
        }
        Pair pairM97108a5 = TuplesKt.m97108a("belong_to_collection_id", collectionId);
        String subjectId = item.getSubjectId();
        if (subjectId == null) {
            subjectId = "";
        }
        Pair pairM97108a6 = TuplesKt.m97108a("refer_subject_id", subjectId);
        Pair pairM97108a7 = TuplesKt.m97108a("content_type", "ugc_video");
        String ops = item.getOps();
        if (ops == null) {
            ops = "";
        }
        Map mapM = MapsKt.m97578m(pairM97108a, pairM97108a2, pairM97108a3, pairM97108a4, pairM97108a5, pairM97108a6, pairM97108a7, TuplesKt.m97108a("ops", ops), TuplesKt.m97108a(RequestParameters.POSITION, String.valueOf(i11)), TuplesKt.m97108a("entrance_content_id", str != null ? str : ""));
        if (str2 != null) {
            mapM.put("track_id", str2);
        }
        if (str3 != null) {
            mapM.put("parent_track_id", str3);
        }
        if (str4 != null) {
            mapM.put("parent_content_id", str4);
        }
        C24662i.f75350a.m96872D(pageName, mapM);
    }

    /* JADX INFO: renamed from: e */
    public final void m84105e(String str, String moduleName, DownloadBean downloadBean, String str2, String str3, String str4) {
        Intrinsics.m97802h(moduleName, "moduleName");
        if (str == null || downloadBean == null) {
            return;
        }
        Pair pairM97108a = TuplesKt.m97108a("module_name", moduleName);
        String ugcVideoId = downloadBean.getUgcVideoId();
        if (ugcVideoId == null) {
            ugcVideoId = "";
        }
        Pair pairM97108a2 = TuplesKt.m97108a("content_id", ugcVideoId);
        String ugcVideoCollectionId = downloadBean.getUgcVideoCollectionId();
        if (ugcVideoCollectionId == null) {
            ugcVideoCollectionId = "";
        }
        Pair pairM97108a3 = TuplesKt.m97108a("belong_to_collection_id", ugcVideoCollectionId);
        Pair pairM97108a4 = TuplesKt.m97108a("content_type", "ugc_video");
        String ops = downloadBean.getOps();
        Map mapM = MapsKt.m97578m(pairM97108a, pairM97108a2, pairM97108a3, pairM97108a4, TuplesKt.m97108a("ops", ops != null ? ops : ""));
        if (str2 != null) {
            mapM.put("track_id", str2);
        }
        if (str3 != null) {
            mapM.put("parent_track_id", str3);
        }
        if (str4 != null) {
            mapM.put("parent_content_id", str4);
        }
        C24662i.f75350a.m96881p(str, mapM);
    }

    /* JADX INFO: renamed from: f */
    public final void m84106f(String pageName, UGCVideo item, int i11, String str, String str2, String str3) {
        String collectionId;
        Intrinsics.m97802h(pageName, "pageName");
        String str4 = WebConstants.FIELD_ITEM;
        Intrinsics.m97802h(item, "item");
        if (!Intrinsics.m97797c(pageName, "/ugc_video/immersive_detail")) {
            str4 = "play_list";
        }
        Pair pairM97108a = TuplesKt.m97108a("module_name", str4);
        Pair pairM97108a2 = TuplesKt.m97108a("module_name", "play_list");
        String ugcVideoId = item.getUgcVideoId();
        if (ugcVideoId == null) {
            ugcVideoId = "";
        }
        Pair pairM97108a3 = TuplesKt.m97108a("content_id", ugcVideoId);
        UGCVideoBelongToCollection belongToCollection = item.getBelongToCollection();
        if (belongToCollection == null || (collectionId = belongToCollection.getCollectionId()) == null) {
            collectionId = "";
        }
        Pair pairM97108a4 = TuplesKt.m97108a("belong_to_collection_id", collectionId);
        Pair pairM97108a5 = TuplesKt.m97108a("content_type", "ugc_video");
        String ops = item.getOps();
        if (ops == null) {
            ops = "";
        }
        Pair pairM97108a6 = TuplesKt.m97108a("ops", ops);
        Pair pairM97108a7 = TuplesKt.m97108a(RequestParameters.POSITION, String.valueOf(i11));
        String subjectId = item.getSubjectId();
        Map mapM = MapsKt.m97578m(pairM97108a, pairM97108a2, pairM97108a3, pairM97108a4, pairM97108a5, pairM97108a6, pairM97108a7, TuplesKt.m97108a("refer_subject_id", subjectId != null ? subjectId : ""));
        if (str != null) {
            mapM.put("track_id", str);
        }
        if (str2 != null) {
            mapM.put("parent_track_id", str2);
        }
        if (str3 != null) {
            mapM.put("parent_content_id", str3);
        }
        C24662i.f75350a.m96881p(pageName, mapM);
    }

    /* JADX INFO: renamed from: g */
    public final void m84107g(String pageName, UGCVideo item, int i11, long j11, String str, String str2, String str3, Boolean bool) {
        String collectionId;
        Intrinsics.m97802h(pageName, "pageName");
        String str4 = WebConstants.FIELD_ITEM;
        Intrinsics.m97802h(item, "item");
        if (!Intrinsics.m97797c(pageName, "/ugc_video/immersive_detail")) {
            str4 = "play_list";
        }
        Pair pairM97108a = TuplesKt.m97108a("module_name", str4);
        Pair pairM97108a2 = TuplesKt.m97108a("browse_duration", String.valueOf(j11));
        String ugcVideoId = item.getUgcVideoId();
        if (ugcVideoId == null) {
            ugcVideoId = "";
        }
        Pair pairM97108a3 = TuplesKt.m97108a("content_id", ugcVideoId);
        UGCVideoBelongToCollection belongToCollection = item.getBelongToCollection();
        if (belongToCollection == null || (collectionId = belongToCollection.getCollectionId()) == null) {
            collectionId = "";
        }
        Pair pairM97108a4 = TuplesKt.m97108a("belong_to_collection_id", collectionId);
        Pair pairM97108a5 = TuplesKt.m97108a("content_type", "ugc_video");
        String ops = item.getOps();
        if (ops == null) {
            ops = "";
        }
        Pair pairM97108a6 = TuplesKt.m97108a("ops", ops);
        Pair pairM97108a7 = TuplesKt.m97108a(RequestParameters.POSITION, String.valueOf(i11));
        String subjectId = item.getSubjectId();
        Map mapM = MapsKt.m97578m(pairM97108a, pairM97108a2, pairM97108a3, pairM97108a4, pairM97108a5, pairM97108a6, pairM97108a7, TuplesKt.m97108a("refer_subject_id", subjectId != null ? subjectId : ""));
        if (bool != null) {
            mapM.put("is_collection", String.valueOf(bool.booleanValue()));
        }
        if (str != null) {
            mapM.put("track_id", str);
        }
        if (str2 != null) {
            mapM.put("parent_track_id", str2);
        }
        if (str3 != null) {
            mapM.put("parent_content_id", str3);
        }
        C24662i.f75350a.m96872D(pageName, mapM);
    }
}
