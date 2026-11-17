package com.transsion.videodetail.bean;

import androidx.annotation.Keep;
import com.cloud.tmc.offline.download.constants.OfflineConstantsKt;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m97099d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020\u0005H\u0016J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J9\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u001e¨\u0006*"}, m97100d2 = {"Lcom/transsion/videodetail/bean/VideoDetailMediaSource;", "Ljava/io/Serializable;", "subjectId", "", "se", "", "ep", "streams", "", "Lcom/transsion/videodetail/bean/VideoDetailStream;", "<init>", "(Ljava/lang/String;IILjava/util/List;)V", "getSubjectId", "()Ljava/lang/String;", "getSe", "()I", "getEp", "getStreams", "()Ljava/util/List;", "setStreams", "(Ljava/util/List;)V", "downloadBean", "Lcom/transsion/baselib/db/download/DownloadBean;", "getDownloadBean", "()Lcom/transsion/baselib/db/download/DownloadBean;", "setDownloadBean", "(Lcom/transsion/baselib/db/download/DownloadBean;)V", "name", "getName", "setName", "(Ljava/lang/String;)V", "equals", "", OfflineConstantsKt.OFFLINE_DOWNLOAD_CHANNEL_MODE_OTHER, "", "hashCode", "component1", "component2", "component3", "component4", "copy", "toString", "VideoDetail_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final /* data */ class VideoDetailMediaSource implements Serializable {
    private DownloadBean downloadBean;
    private final int ep;
    private String name;
    private final int se;
    private List<VideoDetailStream> streams;
    private final String subjectId;

    public VideoDetailMediaSource(String subjectId, int i11, int i12, List<VideoDetailStream> list) {
        Intrinsics.m97802h(subjectId, "subjectId");
        this.subjectId = subjectId;
        this.se = i11;
        this.ep = i12;
        this.streams = list;
    }

    public /* synthetic */ VideoDetailMediaSource(String str, int i11, int i12, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, i12, (i13 & 8) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoDetailMediaSource copy$default(VideoDetailMediaSource videoDetailMediaSource, String str, int i11, int i12, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = videoDetailMediaSource.subjectId;
        }
        if ((i13 & 2) != 0) {
            i11 = videoDetailMediaSource.se;
        }
        if ((i13 & 4) != 0) {
            i12 = videoDetailMediaSource.ep;
        }
        if ((i13 & 8) != 0) {
            list = videoDetailMediaSource.streams;
        }
        return videoDetailMediaSource.copy(str, i11, i12, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSubjectId() {
        return this.subjectId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSe() {
        return this.se;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEp() {
        return this.ep;
    }

    public final List<VideoDetailStream> component4() {
        return this.streams;
    }

    public final VideoDetailMediaSource copy(String subjectId, int se2, int ep2, List<VideoDetailStream> streams) {
        Intrinsics.m97802h(subjectId, "subjectId");
        return new VideoDetailMediaSource(subjectId, se2, ep2, streams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m97797c(VideoDetailMediaSource.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.m97800f(other, "null cannot be cast to non-null type com.transsion.videodetail.bean.VideoDetailMediaSource");
        VideoDetailMediaSource videoDetailMediaSource = (VideoDetailMediaSource) other;
        return Intrinsics.m97797c(this.subjectId, videoDetailMediaSource.subjectId) && this.se == videoDetailMediaSource.se && this.ep == videoDetailMediaSource.ep;
    }

    public final DownloadBean getDownloadBean() {
        return this.downloadBean;
    }

    public final int getEp() {
        return this.ep;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSe() {
        return this.se;
    }

    public final List<VideoDetailStream> getStreams() {
        return this.streams;
    }

    public final String getSubjectId() {
        return this.subjectId;
    }

    public int hashCode() {
        return (((this.subjectId.hashCode() * 31) + this.se) * 31) + this.ep;
    }

    public final void setDownloadBean(DownloadBean downloadBean) {
        this.downloadBean = downloadBean;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setStreams(List<VideoDetailStream> list) {
        this.streams = list;
    }

    public String toString() {
        return "VideoDetailMediaSource(subjectId=" + this.subjectId + ", se=" + this.se + ", ep=" + this.ep + ", streams=" + this.streams + ")";
    }
}
