package com.transsion.usercenterapi;

import androidx.compose.foundation.AbstractC0690e;
import com.cloud.tmc.offline.download.constants.OfflineConstantsKt;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m97100d2 = {"Lcom/transsion/usercenterapi/UpdateResultEvent;", "Ljava/io/Serializable;", "hasUpdate", "", "<init>", "(Z)V", "getHasUpdate", "()Z", "component1", "copy", "equals", OfflineConstantsKt.OFFLINE_DOWNLOAD_CHANNEL_MODE_OTHER, "", "hashCode", "", "toString", "", "UserCenterApi_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final /* data */ class UpdateResultEvent implements Serializable {
    private final boolean hasUpdate;

    public UpdateResultEvent(boolean z11) {
        this.hasUpdate = z11;
    }

    public static /* synthetic */ UpdateResultEvent copy$default(UpdateResultEvent updateResultEvent, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = updateResultEvent.hasUpdate;
        }
        return updateResultEvent.copy(z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasUpdate() {
        return this.hasUpdate;
    }

    public final UpdateResultEvent copy(boolean hasUpdate) {
        return new UpdateResultEvent(hasUpdate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UpdateResultEvent) && this.hasUpdate == ((UpdateResultEvent) other).hasUpdate;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final boolean getHasUpdate() {
        return false;
    }

    public int hashCode() {
        return AbstractC0690e.m3114a(this.hasUpdate);
    }

    public String toString() {
        return "UpdateResultEvent(hasUpdate=" + this.hasUpdate + ")";
    }
}
