package com.transsion.ugcvideodetail.api.bean;

import androidx.annotation.Keep;
import androidx.compose.foundation.AbstractC0690e;
import com.cloud.tmc.offline.download.constants.OfflineConstantsKt;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m97099d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m97100d2 = {"Lcom/transsion/ugcvideodetail/api/bean/UGCVideoFavoriteResponse;", "Ljava/io/Serializable;", "isAffected", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", OfflineConstantsKt.OFFLINE_DOWNLOAD_CHANNEL_MODE_OTHER, "", "hashCode", "", "toString", "", "UGCVideoDetailApi_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final /* data */ class UGCVideoFavoriteResponse implements Serializable {
    private final boolean isAffected;

    public UGCVideoFavoriteResponse(boolean z11) {
        this.isAffected = z11;
    }

    public static /* synthetic */ UGCVideoFavoriteResponse copy$default(UGCVideoFavoriteResponse uGCVideoFavoriteResponse, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = uGCVideoFavoriteResponse.isAffected;
        }
        return uGCVideoFavoriteResponse.copy(z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsAffected() {
        return this.isAffected;
    }

    public final UGCVideoFavoriteResponse copy(boolean isAffected) {
        return new UGCVideoFavoriteResponse(isAffected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UGCVideoFavoriteResponse) && this.isAffected == ((UGCVideoFavoriteResponse) other).isAffected;
    }

    public int hashCode() {
        return AbstractC0690e.m3114a(this.isAffected);
    }

    public final boolean isAffected() {
        return this.isAffected;
    }

    public String toString() {
        return "UGCVideoFavoriteResponse(isAffected=" + this.isAffected + ")";
    }
}
