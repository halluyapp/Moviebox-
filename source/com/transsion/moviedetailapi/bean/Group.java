package com.transsion.moviedetailapi.bean;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.cloud.tmc.integration.permission.PermissionConstant;
import com.cloud.tmc.offline.download.constants.OfflineConstantsKt;
import com.google.gson.annotations.SerializedName;
import com.hisavana.common.tracking.TrackingKey;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m97099d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b:\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010<\u001a\u00020\u000bJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013HÆ\u0003J°\u0001\u0010J\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020\u000b2\b\u0010M\u001a\u0004\u0018\u00010NHÖ\u0003J\t\u0010O\u001a\u00020PHÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010\u0019R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0019R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0017\"\u0004\b1\u0010\u0019R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u0010\u0019R \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R&\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006R"}, m97100d2 = {"Lcom/transsion/moviedetailapi/bean/Group;", "Ljava/io/Serializable;", "avatar", "", "groupId", "name", "userCount", "", "postCount", PermissionConstant.level, "hasJoin", "", CampaignEx.JSON_KEY_DESC, "avatarAverageHueLight", "avatarAverageHueDark", "newPostCount", "cover", "Lcom/transsion/moviedetailapi/bean/Cover;", "tags", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/transsion/moviedetailapi/bean/Cover;Ljava/util/List;)V", "getAvatar", "()Ljava/lang/String;", "setAvatar", "(Ljava/lang/String;)V", "getGroupId", "setGroupId", "getName", "setName", "getUserCount", "()Ljava/lang/Long;", "setUserCount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPostCount", "setPostCount", "getLevel", "setLevel", "getHasJoin", "()Ljava/lang/Boolean;", "setHasJoin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getDesc", "setDesc", "getAvatarAverageHueLight", "setAvatarAverageHueLight", "getAvatarAverageHueDark", "setAvatarAverageHueDark", "getNewPostCount", "setNewPostCount", "getCover", "()Lcom/transsion/moviedetailapi/bean/Cover;", "setCover", "(Lcom/transsion/moviedetailapi/bean/Cover;)V", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "showAdultRestricted", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/transsion/moviedetailapi/bean/Cover;Ljava/util/List;)Lcom/transsion/moviedetailapi/bean/Group;", "equals", OfflineConstantsKt.OFFLINE_DOWNLOAD_CHANNEL_MODE_OTHER, "", "hashCode", "", "toString", "MovieDetailApi_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final /* data */ class Group implements Serializable {

    @SerializedName("avatar")
    private String avatar;

    @SerializedName("avatarAverageHueDark")
    private String avatarAverageHueDark;

    @SerializedName("avatarAverageHueLight")
    private String avatarAverageHueLight;

    @SerializedName("cover")
    private Cover cover;

    @SerializedName(TrackingKey.DESCRIPTION)
    private String desc;

    @SerializedName("groupId")
    private String groupId;

    @SerializedName("hasJoin")
    private Boolean hasJoin;

    @SerializedName(PermissionConstant.level)
    private String level;

    @SerializedName("name")
    private String name;

    @SerializedName("newPostCount")
    private String newPostCount;

    @SerializedName("postCount")
    private Long postCount;

    @SerializedName("tags")
    private List<String> tags;

    @SerializedName("userCount")
    private Long userCount;

    public Group(String str, String str2, String str3, Long l11, Long l12, String str4, Boolean bool, String str5, String str6, String str7, String str8, Cover cover, List<String> list) {
        this.avatar = str;
        this.groupId = str2;
        this.name = str3;
        this.userCount = l11;
        this.postCount = l12;
        this.level = str4;
        this.hasJoin = bool;
        this.desc = str5;
        this.avatarAverageHueLight = str6;
        this.avatarAverageHueDark = str7;
        this.newPostCount = str8;
        this.cover = cover;
        this.tags = list;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAvatarAverageHueDark() {
        return this.avatarAverageHueDark;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getNewPostCount() {
        return this.newPostCount;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Cover getCover() {
        return this.cover;
    }

    public final List<String> component13() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getUserCount() {
        return this.userCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getPostCount() {
        return this.postCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getHasJoin() {
        return this.hasJoin;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAvatarAverageHueLight() {
        return this.avatarAverageHueLight;
    }

    public final Group copy(String avatar, String groupId, String name, Long userCount, Long postCount, String level, Boolean hasJoin, String desc, String avatarAverageHueLight, String avatarAverageHueDark, String newPostCount, Cover cover, List<String> tags) {
        return new Group(avatar, groupId, name, userCount, postCount, level, hasJoin, desc, avatarAverageHueLight, avatarAverageHueDark, newPostCount, cover, tags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Group)) {
            return false;
        }
        Group group = (Group) other;
        return Intrinsics.m97797c(this.avatar, group.avatar) && Intrinsics.m97797c(this.groupId, group.groupId) && Intrinsics.m97797c(this.name, group.name) && Intrinsics.m97797c(this.userCount, group.userCount) && Intrinsics.m97797c(this.postCount, group.postCount) && Intrinsics.m97797c(this.level, group.level) && Intrinsics.m97797c(this.hasJoin, group.hasJoin) && Intrinsics.m97797c(this.desc, group.desc) && Intrinsics.m97797c(this.avatarAverageHueLight, group.avatarAverageHueLight) && Intrinsics.m97797c(this.avatarAverageHueDark, group.avatarAverageHueDark) && Intrinsics.m97797c(this.newPostCount, group.newPostCount) && Intrinsics.m97797c(this.cover, group.cover) && Intrinsics.m97797c(this.tags, group.tags);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getAvatarAverageHueDark() {
        return this.avatarAverageHueDark;
    }

    public final String getAvatarAverageHueLight() {
        return this.avatarAverageHueLight;
    }

    public final Cover getCover() {
        return this.cover;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final Boolean getHasJoin() {
        return this.hasJoin;
    }

    public final String getLevel() {
        return this.level;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNewPostCount() {
        return this.newPostCount;
    }

    public final Long getPostCount() {
        return this.postCount;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final Long getUserCount() {
        return this.userCount;
    }

    public int hashCode() {
        String str = this.avatar;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.groupId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.userCount;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.postCount;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str4 = this.level;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.hasJoin;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.desc;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.avatarAverageHueLight;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.avatarAverageHueDark;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.newPostCount;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Cover cover = this.cover;
        int iHashCode12 = (iHashCode11 + (cover == null ? 0 : cover.hashCode())) * 31;
        List<String> list = this.tags;
        return iHashCode12 + (list != null ? list.hashCode() : 0);
    }

    public final void setAvatar(String str) {
        this.avatar = str;
    }

    public final void setAvatarAverageHueDark(String str) {
        this.avatarAverageHueDark = str;
    }

    public final void setAvatarAverageHueLight(String str) {
        this.avatarAverageHueLight = str;
    }

    public final void setCover(Cover cover) {
        this.cover = cover;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
    }

    public final void setHasJoin(Boolean bool) {
        this.hasJoin = bool;
    }

    public final void setLevel(String str) {
        this.level = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNewPostCount(String str) {
        this.newPostCount = str;
    }

    public final void setPostCount(Long l11) {
        this.postCount = l11;
    }

    public final void setTags(List<String> list) {
        this.tags = list;
    }

    public final void setUserCount(Long l11) {
        this.userCount = l11;
    }

    public final boolean showAdultRestricted() {
        return TextUtils.equals(this.level, "LIMIT");
    }

    public String toString() {
        return "Group(avatar=" + this.avatar + ", groupId=" + this.groupId + ", name=" + this.name + ", userCount=" + this.userCount + ", postCount=" + this.postCount + ", level=" + this.level + ", hasJoin=" + this.hasJoin + ", desc=" + this.desc + ", avatarAverageHueLight=" + this.avatarAverageHueLight + ", avatarAverageHueDark=" + this.avatarAverageHueDark + ", newPostCount=" + this.newPostCount + ", cover=" + this.cover + ", tags=" + this.tags + ")";
    }
}
