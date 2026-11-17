package com.transsion.home.hashtag;

import android.app.Application;
import androidx.annotation.Keep;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.blankj.utilcode.util.AbstractC5796o;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.cloud.tmc.kernel.minicover.NativeComponentConstants;
import com.cloud.tmc.offline.download.constants.OfflineConstantsKt;
import com.google.gson.annotations.SerializedName;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.gslb.Utils;
import com.transsion.home.R$string;
import com.transsion.home.bean.RefreshBaseDto;
import com.transsion.home.hashtag.model.HashTagItem;
import com.transsion.home.hashtag.model.HashTagItemType;
import com.transsion.home.hashtag.model.HashTagTab;
import com.transsion.home.net.HashTagListRequest;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.ugcvideodetail.api.bean.UGCContent;
import com.transsion.ugcvideodetail.api.bean.UGCContentList;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoHashTag;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25204t1;
import okhttp3.RequestBody;
import p349dh.C22982c;
import p411fh.C23367b;
import pg.C26866a;
import sl.InterfaceC27627a;

/* JADX INFO: loaded from: classes5.dex */
public final class HashTagViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: b */
    private final Application f53334b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC27627a f53335c;

    /* JADX INFO: renamed from: d */
    private List f53336d;

    /* JADX INFO: renamed from: e */
    private UGCVideoHashTag f53337e;

    /* JADX INFO: renamed from: f */
    private List f53338f;

    /* JADX INFO: renamed from: g */
    private String f53339g;

    /* JADX INFO: renamed from: h */
    private int f53340h;

    /* JADX INFO: renamed from: i */
    private String f53341i;

    /* JADX INFO: renamed from: j */
    private final Map f53342j;

    /* JADX INFO: renamed from: k */
    private final Map f53343k;

    /* JADX INFO: renamed from: l */
    private final Map f53344l;

    /* JADX INFO: renamed from: m */
    private final Map f53345m;

    /* JADX INFO: renamed from: n */
    private final Map f53346n;

    /* JADX INFO: renamed from: o */
    private InterfaceC25204t1 f53347o;

    @Keep
    @Metadata(m97099d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001d"}, m97100d2 = {"Lcom/transsion/home/hashtag/HashTagViewModel$DeeplinkTag;", "", "tag", "", CampaignEx.JSON_KEY_TITLE, "tagType", "referId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "getTitle", "getTagType", "getReferId", "mapTagType", "t", "toUgcTag", "Lcom/transsion/ugcvideodetail/api/bean/UGCVideoHashTag;", "component1", "component2", "component3", "component4", "copy", "equals", "", OfflineConstantsKt.OFFLINE_DOWNLOAD_CHANNEL_MODE_OTHER, "hashCode", "", "toString", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    public static final /* data */ class DeeplinkTag {
        public static final int $stable = 0;

        @SerializedName("refer_id")
        private final String referId;

        @SerializedName("tag")
        private final String tag;

        @SerializedName("tag_type")
        private final String tagType;

        @SerializedName(CampaignEx.JSON_KEY_TITLE)
        private final String title;

        public DeeplinkTag() {
            this(null, null, null, null, 15, null);
        }

        public DeeplinkTag(String str, String str2, String str3, String str4) {
            this.tag = str;
            this.title = str2;
            this.tagType = str3;
            this.referId = str4;
        }

        public /* synthetic */ DeeplinkTag(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
        }

        public static /* synthetic */ DeeplinkTag copy$default(DeeplinkTag deeplinkTag, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = deeplinkTag.tag;
            }
            if ((i11 & 2) != 0) {
                str2 = deeplinkTag.title;
            }
            if ((i11 & 4) != 0) {
                str3 = deeplinkTag.tagType;
            }
            if ((i11 & 8) != 0) {
                str4 = deeplinkTag.referId;
            }
            return deeplinkTag.copy(str, str2, str3, str4);
        }

        private final String mapTagType(String t11) {
            if (t11 == null) {
                return t11;
            }
            switch (t11.hashCode()) {
                case AD_VALIDATION_TO_PRESENT_DURATION_MS_VALUE:
                    return !t11.equals("1") ? t11 : "TAG_GENRE";
                case 50:
                    return !t11.equals("2") ? t11 : "TAG_COUNTRY";
                case AD_REWARD_USER_VALUE:
                    return !t11.equals("3") ? t11 : "TAG_YEAR";
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    return !t11.equals("4") ? t11 : "TAG_STAFF";
                default:
                    return t11;
            }
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getTagType() {
            return this.tagType;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getReferId() {
            return this.referId;
        }

        public final DeeplinkTag copy(String tag, String title, String tagType, String referId) {
            return new DeeplinkTag(tag, title, tagType, referId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeeplinkTag)) {
                return false;
            }
            DeeplinkTag deeplinkTag = (DeeplinkTag) other;
            return Intrinsics.m97797c(this.tag, deeplinkTag.tag) && Intrinsics.m97797c(this.title, deeplinkTag.title) && Intrinsics.m97797c(this.tagType, deeplinkTag.tagType) && Intrinsics.m97797c(this.referId, deeplinkTag.referId);
        }

        public final String getReferId() {
            return this.referId;
        }

        public final String getTag() {
            return this.tag;
        }

        public final String getTagType() {
            return this.tagType;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.tag;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.tagType;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.referId;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "DeeplinkTag(tag=" + this.tag + ", title=" + this.title + ", tagType=" + this.tagType + ", referId=" + this.referId + ")";
        }

        public final UGCVideoHashTag toUgcTag() {
            String str;
            String str2 = this.title;
            if (str2 == null || str2.length() == 0) {
                String str3 = this.tag;
                if (str3 == null) {
                    str3 = "";
                }
                str = Utils.SEPARATOR + str3;
            } else {
                str = this.title;
            }
            return new UGCVideoHashTag(this.tag, str, mapTagType(this.tagType), this.referId, null);
        }
    }

    @Keep
    @Metadata(m97099d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m97100d2 = {"Lcom/transsion/home/hashtag/HashTagViewModel$HashtagPayload;", "", NativeComponentConstants.KEY_COMPONENT_TYPE, "", "mainHashtag", "Lcom/transsion/home/hashtag/HashTagViewModel$DeeplinkTag;", "subHashtag", "", "<init>", "(Ljava/lang/String;Lcom/transsion/home/hashtag/HashTagViewModel$DeeplinkTag;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getMainHashtag", "()Lcom/transsion/home/hashtag/HashTagViewModel$DeeplinkTag;", "getSubHashtag", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", OfflineConstantsKt.OFFLINE_DOWNLOAD_CHANNEL_MODE_OTHER, "hashCode", "", "toString", "Home_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    public static final /* data */ class HashtagPayload {
        public static final int $stable = 8;

        @SerializedName("main_hashtag")
        private final DeeplinkTag mainHashtag;

        @SerializedName("sub_hashtag")
        private final List<DeeplinkTag> subHashtag;

        @SerializedName(NativeComponentConstants.KEY_COMPONENT_TYPE)
        private final String type;

        public HashtagPayload() {
            this(null, null, null, 7, null);
        }

        public HashtagPayload(String str, DeeplinkTag deeplinkTag, List<DeeplinkTag> list) {
            this.type = str;
            this.mainHashtag = deeplinkTag;
            this.subHashtag = list;
        }

        public /* synthetic */ HashtagPayload(String str, DeeplinkTag deeplinkTag, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : deeplinkTag, (i11 & 4) != 0 ? null : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HashtagPayload copy$default(HashtagPayload hashtagPayload, String str, DeeplinkTag deeplinkTag, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = hashtagPayload.type;
            }
            if ((i11 & 2) != 0) {
                deeplinkTag = hashtagPayload.mainHashtag;
            }
            if ((i11 & 4) != 0) {
                list = hashtagPayload.subHashtag;
            }
            return hashtagPayload.copy(str, deeplinkTag, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final DeeplinkTag getMainHashtag() {
            return this.mainHashtag;
        }

        public final List<DeeplinkTag> component3() {
            return this.subHashtag;
        }

        public final HashtagPayload copy(String type, DeeplinkTag mainHashtag, List<DeeplinkTag> subHashtag) {
            return new HashtagPayload(type, mainHashtag, subHashtag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HashtagPayload)) {
                return false;
            }
            HashtagPayload hashtagPayload = (HashtagPayload) other;
            return Intrinsics.m97797c(this.type, hashtagPayload.type) && Intrinsics.m97797c(this.mainHashtag, hashtagPayload.mainHashtag) && Intrinsics.m97797c(this.subHashtag, hashtagPayload.subHashtag);
        }

        public final DeeplinkTag getMainHashtag() {
            return this.mainHashtag;
        }

        public final List<DeeplinkTag> getSubHashtag() {
            return this.subHashtag;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            DeeplinkTag deeplinkTag = this.mainHashtag;
            int iHashCode2 = (iHashCode + (deeplinkTag == null ? 0 : deeplinkTag.hashCode())) * 31;
            List<DeeplinkTag> list = this.subHashtag;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "HashtagPayload(type=" + this.type + ", mainHashtag=" + this.mainHashtag + ", subHashtag=" + this.subHashtag + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashTagViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f53334b = application;
        this.f53335c = (InterfaceC27627a) C22982c.f70163e.m91553a().m91552h(InterfaceC27627a.class);
        this.f53336d = CollectionsKt.m97506l();
        this.f53339g = "ForYou";
        this.f53342j = new LinkedHashMap();
        this.f53343k = new LinkedHashMap();
        this.f53344l = new LinkedHashMap();
        this.f53345m = new LinkedHashMap();
        this.f53346n = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: h */
    private final List m68475h(Set set, boolean z11) {
        List list;
        if (!z11 || (list = this.f53338f) == null || list.isEmpty()) {
            return null;
        }
        return CollectionsKt.m97499e(new HashTagItem(HashTagItemType.TAGS, this.f53338f, CollectionsKt.m97340R0(set), null, null, null, 56, null));
    }

    /* JADX INFO: renamed from: i */
    private final List m68476i(List list, Set set, boolean z11) {
        if (!z11) {
            return list;
        }
        List listC = CollectionsKt.m97497c();
        List list2 = this.f53338f;
        if (list2 != null && !list2.isEmpty()) {
            listC.add(new HashTagItem(HashTagItemType.TAGS, this.f53338f, CollectionsKt.m97340R0(set), null, null, null, 56, null));
            C26866a.a aVar = C26866a.f81698a;
            List list3 = this.f53338f;
            Integer numValueOf = list3 != null ? Integer.valueOf(list3.size()) : null;
            C26866a.a.m104898f(aVar, "HashTagViewModel", "buildFinalData: insert tags item, tags size=" + numValueOf + ", selected size=" + set.size(), false, 4, null);
        }
        listC.addAll(list);
        return CollectionsKt.m97495a(listC);
    }

    /* JADX INFO: renamed from: j */
    private final List m68477j(Set set) {
        List listC = CollectionsKt.m97497c();
        UGCVideoHashTag uGCVideoHashTag = this.f53337e;
        if (uGCVideoHashTag != null) {
            listC.add(uGCVideoHashTag);
        }
        Set set2 = set;
        if (!set2.isEmpty()) {
            listC.addAll(set2);
        }
        return CollectionsKt.m97495a(listC);
    }

    /* JADX INFO: renamed from: k */
    private final HashTagItem m68478k(UGCContent uGCContent) {
        if (Intrinsics.m97797c(uGCContent.getTopicType(), "UGC_VIDEO")) {
            UGCVideo video = uGCContent.getVideo();
            if (video != null) {
                return new HashTagItem(HashTagItemType.HASHTAG_CARD, null, null, video, null, null, 54, null);
            }
            return null;
        }
        C26866a.a.m104910z(C26866a.f81698a, "HashTagViewModel", "convertToHashTagItem: unknown or unsupported content type=" + uGCContent.getTopicType(), false, 4, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final RequestBody m68479l(String str, int i11, Set set) {
        String strM27447j = AbstractC5796o.m27447j(new HashTagListRequest(i11, 20, m68477j(set), this.f53341i, this.f53340h, str));
        C26866a.a.m104898f(C26866a.f81698a, "HashTagViewModel", "createRequestBody: request=" + strM27447j, false, 4, null);
        C23367b.a aVar = C23367b.f71265a;
        Intrinsics.m97799e(strM27447j);
        return aVar.m92796a(strM27447j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final void m68480n(String str, Set set, boolean z11, String str2, String str3) {
        Map map = this.f53345m;
        Object c3187b0 = map.get(str);
        if (c3187b0 == null) {
            c3187b0 = new C3187b0(null);
            map.put(str, c3187b0);
        }
        C3187b0 c3187b1 = (C3187b0) c3187b0;
        List listM68475h = m68475h(set, z11);
        C26866a.a.m104898f(C26866a.f81698a, "HashTagViewModel", "handleError: errorMsg=" + str2 + ", errorCode=" + str3 + ", errorData size=" + (listM68475h != null ? Integer.valueOf(listM68475h.size()) : null), false, 4, null);
        c3187b1.mo14855n(new RefreshBaseDto(str2, str3, listM68475h, "", z11));
        if (z11) {
            Map map2 = this.f53346n;
            Object c3187b2 = map2.get(str);
            if (c3187b2 == null) {
                c3187b2 = new C3187b0(Boolean.FALSE);
                map2.put(str, c3187b2);
            }
            ((C3187b0) c3187b2).mo14855n(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m68481o(String str, int i11, Set set, boolean z11, BaseDto baseDto) {
        if (Intrinsics.m97797c(baseDto.getCode(), "0") && baseDto.getData() != null) {
            m68482p(str, i11, set, z11, (UGCContentList) baseDto.getData());
            return;
        }
        C26866a.f81698a.m104915i("HashTagViewModel", "loadHashTagList failed: code=" + baseDto.getCode() + ", msg=" + baseDto.getMsg(), true);
        String msg = baseDto.getMsg();
        if (msg == null) {
            msg = "";
        }
        String str2 = msg;
        String code = baseDto.getCode();
        if (code == null) {
            code = TmcConstants.COLD_OPEN_TYPE;
        }
        m68480n(str, set, z11, str2, code);
    }

    /* JADX INFO: renamed from: p */
    private final void m68482p(String str, int i11, Set set, boolean z11, UGCContentList uGCContentList) {
        List<UGCContent> listL;
        Pager pager;
        Boolean hasMore;
        if (uGCContentList == null || (listL = uGCContentList.getItems()) == null) {
            listL = CollectionsKt.m97506l();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listL.iterator();
        while (it.hasNext()) {
            HashTagItem hashTagItemM68478k = m68478k((UGCContent) it.next());
            if (hashTagItemM68478k != null) {
                arrayList.add(hashTagItemM68478k);
            }
        }
        boolean zBooleanValue = (uGCContentList == null || (pager = uGCContentList.getPager()) == null || (hasMore = pager.getHasMore()) == null) ? false : hasMore.booleanValue();
        this.f53344l.put(str, Boolean.valueOf(zBooleanValue));
        C26866a.a aVar = C26866a.f81698a;
        C26866a.a.m104898f(aVar, "HashTagViewModel", "loadHashTagList success, tabSort=" + str + ", page=" + i11 + ", size=" + arrayList.size() + ", hasMore=" + zBooleanValue, false, 4, null);
        List listM68476i = m68476i(arrayList, set, z11);
        int size = listM68476i.size();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("loadHashTagList: finalData size=");
        sb2.append(size);
        C26866a.a.m104898f(aVar, "HashTagViewModel", sb2.toString(), false, 4, null);
        Map map = this.f53345m;
        Object c3187b0 = map.get(str);
        if (c3187b0 == null) {
            c3187b0 = new C3187b0(null);
            map.put(str, c3187b0);
        }
        ((C3187b0) c3187b0).mo14855n(new RefreshBaseDto("", "0", listM68476i, "", z11));
        if (z11) {
            Map map2 = this.f53346n;
            Object c3187b1 = map2.get(str);
            if (c3187b1 == null) {
                c3187b1 = new C3187b0(Boolean.FALSE);
                map2.put(str, c3187b1);
            }
            ((C3187b0) c3187b1).mo14855n(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: t */
    private final void m68483t(String str, boolean z11) {
        Integer num = (Integer) this.f53343k.get(str);
        int iIntValue = num != null ? num.intValue() : 1;
        Set linkedHashSet = (Set) this.f53342j.get(str);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
        }
        Set set = linkedHashSet;
        C26866a.a.m104898f(C26866a.f81698a, "HashTagViewModel", "loadHashTagList: start, tabSort=" + str + ", page=" + iIntValue + ", isRefresh=" + z11 + ", selectedTags=" + set.size(), false, 4, null);
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), C25220y0.m99268b(), null, new HashTagViewModel$loadHashTagList$1(this, str, iIntValue, set, z11, null), 2, null);
    }

    /* JADX INFO: renamed from: z */
    private final void m68484z(String str) {
        List listL;
        Map map = this.f53345m;
        Object c3187b0 = map.get(str);
        HashTagItem hashTagItem = null;
        if (c3187b0 == null) {
            c3187b0 = new C3187b0(null);
            map.put(str, c3187b0);
        }
        C3187b0 c3187b1 = (C3187b0) c3187b0;
        RefreshBaseDto refreshBaseDto = (RefreshBaseDto) c3187b1.m14847f();
        if (refreshBaseDto == null || (listL = (List) refreshBaseDto.getData()) == null) {
            listL = CollectionsKt.m97506l();
        }
        Iterable linkedHashSet = (Set) this.f53342j.get(str);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
        }
        List list = this.f53338f;
        if (list != null && !list.isEmpty()) {
            hashTagItem = new HashTagItem(HashTagItemType.TAGS, this.f53338f, CollectionsKt.m97340R0(linkedHashSet), null, null, null, 56, null);
        }
        if (hashTagItem != null) {
            List list2 = listL;
            if (list2.isEmpty() || ((HashTagItem) listL.get(0)).getType() != HashTagItemType.TAGS) {
                List listC = CollectionsKt.m97497c();
                listC.add(hashTagItem);
                listC.addAll(list2);
                listL = CollectionsKt.m97495a(listC);
            } else {
                List listC2 = CollectionsKt.m97497c();
                listC2.add(hashTagItem);
                listC2.addAll(CollectionsKt.m97354d0(listL, 1));
                listL = CollectionsKt.m97495a(listC2);
            }
        }
        c3187b1.mo14855n(new RefreshBaseDto("", "0", listL, "", true));
    }

    /* JADX INFO: renamed from: A */
    public final void m68485A(String tabSort) {
        Intrinsics.m97802h(tabSort, "tabSort");
        this.f53343k.put(tabSort, 1);
        C26866a.a.m104898f(C26866a.f81698a, "HashTagViewModel", "refresh: tabSort=" + tabSort + ", reset page to 1", false, 4, null);
        Map map = this.f53346n;
        Object c3187b0 = map.get(tabSort);
        if (c3187b0 == null) {
            c3187b0 = new C3187b0(Boolean.FALSE);
            map.put(tabSort, c3187b0);
        }
        ((C3187b0) c3187b0).mo14855n(Boolean.TRUE);
        m68483t(tabSort, true);
    }

    /* JADX INFO: renamed from: m */
    public final List m68486m() {
        return this.f53336d;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m68487q(String tabSort) {
        Intrinsics.m97802h(tabSort, "tabSort");
        Boolean bool = (Boolean) this.f53344l.get(tabSort);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final void m68488r(UGCVideoHashTag uGCVideoHashTag, List list, int i11, String str) {
        ArrayList arrayList;
        this.f53337e = uGCVideoHashTag;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                String title = ((UGCVideoHashTag) obj).getTitle();
                if (!(title == null || title.length() == 0)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        this.f53338f = arrayList;
        this.f53340h = i11;
        this.f53341i = str;
        this.f53339g = "ForYou";
        C26866a.a.m104898f(C26866a.f81698a, "HashTagViewModel", "init: hashTag=" + (uGCVideoHashTag != null ? uGCVideoHashTag.getTitle() : null) + ", hashTags size=" + (list != null ? Integer.valueOf(list.size()) : null) + ", tabId=" + i11 + ", ugcVideoId=" + str, false, 4, null);
        String string = this.f53334b.getString(R$string.item_tab_hash_tag_for_you);
        Intrinsics.m97801g(string, "getString(...)");
        HashTagTab hashTagTab = new HashTagTab("ForYou", string, true);
        String string2 = this.f53334b.getString(R$string.item_tab_hash_tag_most_viewed);
        Intrinsics.m97801g(string2, "getString(...)");
        HashTagTab hashTagTab2 = new HashTagTab("MostViewed", string2, false, 4, null);
        String string3 = this.f53334b.getString(R$string.item_tab_hash_tag_new);
        Intrinsics.m97801g(string3, "getString(...)");
        List listO = CollectionsKt.m97509o(hashTagTab, hashTagTab2, new HashTagTab("New", string3, false, 4, null));
        this.f53336d = listO;
        Iterator it = listO.iterator();
        while (it.hasNext()) {
            this.f53342j.put(((HashTagTab) it.next()).getId(), new LinkedHashSet());
        }
    }

    /* JADX INFO: renamed from: s */
    public final LiveData m68489s(String tabSort) {
        Intrinsics.m97802h(tabSort, "tabSort");
        Map map = this.f53345m;
        Object c3187b0 = map.get(tabSort);
        if (c3187b0 == null) {
            c3187b0 = new C3187b0(null);
            map.put(tabSort, c3187b0);
        }
        return (LiveData) c3187b0;
    }

    /* JADX INFO: renamed from: u */
    public final void m68490u(String tabSort) {
        Intrinsics.m97802h(tabSort, "tabSort");
        if (!m68487q(tabSort)) {
            C26866a.a.m104898f(C26866a.f81698a, "HashTagViewModel", "loadMore: no more data, tabSort=" + tabSort, false, 4, null);
            return;
        }
        Integer num = (Integer) this.f53343k.get(tabSort);
        int iIntValue = (num != null ? num.intValue() : 1) + 1;
        this.f53343k.put(tabSort, Integer.valueOf(iIntValue));
        C26866a.a.m104898f(C26866a.f81698a, "HashTagViewModel", "loadMore: tabSort=" + tabSort + ", page=" + iIntValue, false, 4, null);
        m68483t(tabSort, false);
    }

    /* JADX INFO: renamed from: v */
    public final LiveData m68491v(String tabSort) {
        Intrinsics.m97802h(tabSort, "tabSort");
        Map map = this.f53346n;
        Object c3187b0 = map.get(tabSort);
        if (c3187b0 == null) {
            c3187b0 = new C3187b0(Boolean.FALSE);
            map.put(tabSort, c3187b0);
        }
        return (LiveData) c3187b0;
    }

    /* JADX INFO: renamed from: w */
    public final void m68492w(String tabSort) {
        Intrinsics.m97802h(tabSort, "tabSort");
        C26866a.a.m104898f(C26866a.f81698a, "HashTagViewModel", "onTabSelected: tabSort=" + tabSort + ", previous=" + this.f53339g, false, 4, null);
        List<HashTagTab> list = this.f53336d;
        ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(list, 10));
        for (HashTagTab hashTagTab : list) {
            arrayList.add(HashTagTab.copy$default(hashTagTab, null, null, Intrinsics.m97797c(hashTagTab.getId(), tabSort), 3, null));
        }
        this.f53336d = arrayList;
        this.f53339g = tabSort;
        Map map = this.f53345m;
        Object c3187b0 = map.get(tabSort);
        if (c3187b0 == null) {
            c3187b0 = new C3187b0(null);
            map.put(tabSort, c3187b0);
        }
        RefreshBaseDto refreshBaseDto = (RefreshBaseDto) ((C3187b0) c3187b0).m14847f();
        List list2 = refreshBaseDto != null ? (List) refreshBaseDto.getData() : null;
        List list3 = list2;
        if (list3 != null && !list3.isEmpty()) {
            C26866a.a.m104898f(C26866a.f81698a, "HashTagViewModel", "onTabSelected: data exists, size=" + list2.size(), false, 4, null);
            return;
        }
        C26866a.a.m104898f(C26866a.f81698a, "HashTagViewModel", "onTabSelected: no data, start loading", false, 4, null);
        Map map2 = this.f53346n;
        Object c3187b1 = map2.get(tabSort);
        if (c3187b1 == null) {
            c3187b1 = new C3187b0(Boolean.FALSE);
            map2.put(tabSort, c3187b1);
        }
        ((C3187b0) c3187b1).mo14855n(Boolean.TRUE);
        m68485A(tabSort);
    }

    /* JADX INFO: renamed from: x */
    public final void m68493x(UGCVideoHashTag tag) {
        Object next;
        Intrinsics.m97802h(tag, "tag");
        Set linkedHashSet = (Set) this.f53342j.get(this.f53339g);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
        }
        Iterator it = linkedHashSet.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.m97797c(((UGCVideoHashTag) next).getTag(), tag.getTag()));
        UGCVideoHashTag uGCVideoHashTag = (UGCVideoHashTag) next;
        if (uGCVideoHashTag != null) {
            linkedHashSet.remove(uGCVideoHashTag);
            C26866a.a.m104898f(C26866a.f81698a, "HashTagViewModel", "onTagClicked: unselect tag=" + tag.getTag() + ", tabSort=" + this.f53339g + ", current selected=" + linkedHashSet.size(), false, 4, null);
        } else {
            linkedHashSet.add(tag);
            C26866a.a.m104898f(C26866a.f81698a, "HashTagViewModel", "onTagClicked: select tag=" + tag.getTag() + ", tabSort=" + this.f53339g + ", current selected=" + linkedHashSet.size(), false, 4, null);
        }
        this.f53342j.put(this.f53339g, linkedHashSet);
        m68484z(this.f53339g);
        InterfaceC25204t1 interfaceC25204t1 = this.f53347o;
        if (interfaceC25204t1 != null) {
            InterfaceC25204t1.a.m99217b(interfaceC25204t1, null, 1, null);
        }
        C26866a.a.m104898f(C26866a.f81698a, "HashTagViewModel", "onTagClicked: cancel previous debounce job, will refresh after 700ms", false, 4, null);
        this.f53347o = AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new HashTagViewModel$onTagClicked$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: y */
    public final Pair m68494y(String raw) {
        Object objM112707constructorimpl;
        ArrayList arrayList;
        List<DeeplinkTag> subHashtag;
        DeeplinkTag mainHashtag;
        Intrinsics.m97802h(raw, "raw");
        try {
            Result.Companion companion = Result.INSTANCE;
            HashtagPayload hashtagPayload = (HashtagPayload) AbstractC5796o.m27443f().fromJson(raw, HashtagPayload.class);
            UGCVideoHashTag ugcTag = (hashtagPayload == null || (mainHashtag = hashtagPayload.getMainHashtag()) == null) ? null : mainHashtag.toUgcTag();
            if (hashtagPayload == null || (subHashtag = hashtagPayload.getSubHashtag()) == null) {
                arrayList = null;
            } else {
                List<DeeplinkTag> list = subHashtag;
                arrayList = new ArrayList(CollectionsKt.m97516v(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DeeplinkTag) it.next()).toUgcTag());
                }
            }
            C26866a.a.m104898f(C26866a.f81698a, "HashTagViewModel", "parse hashtag json success: main=" + (ugcTag != null ? ugcTag.getTitle() : null) + ", subs=" + (arrayList != null ? Integer.valueOf(arrayList.size()) : null), false, 4, null);
            objM112707constructorimpl = Result.m112707constructorimpl(new Pair(ugcTag, arrayList));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C26866a.f81698a.m104915i("HashTagViewModel", "parse hashtag json failed: " + thM112710exceptionOrNullimpl.getMessage(), true);
        }
        if (Result.m112713isFailureimpl(objM112707constructorimpl)) {
            objM112707constructorimpl = null;
        }
        Pair pair = (Pair) objM112707constructorimpl;
        return pair == null ? new Pair(null, null) : pair;
    }
}
