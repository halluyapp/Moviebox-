package com.transsion.usercenter.profile.bean;

import androidx.annotation.Keep;
import androidx.compose.foundation.AbstractC0690e;
import com.cloud.tmc.offline.download.constants.OfflineConstantsKt;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m97099d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, m97100d2 = {"Lcom/transsion/usercenter/profile/bean/BlockInfo;", "Ljava/io/Serializable;", "block", "", "blocked", "<init>", "(ZZ)V", "getBlock", "()Z", "setBlock", "(Z)V", "getBlocked", "setBlocked", "component1", "component2", "copy", "equals", OfflineConstantsKt.OFFLINE_DOWNLOAD_CHANNEL_MODE_OTHER, "", "hashCode", "", "toString", "", "UserCenter_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final /* data */ class BlockInfo implements Serializable {
    private boolean block;
    private boolean blocked;

    public BlockInfo(boolean z11, boolean z12) {
        this.block = z11;
        this.blocked = z12;
    }

    public static /* synthetic */ BlockInfo copy$default(BlockInfo blockInfo, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = blockInfo.block;
        }
        if ((i11 & 2) != 0) {
            z12 = blockInfo.blocked;
        }
        return blockInfo.copy(z11, z12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getBlock() {
        return this.block;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getBlocked() {
        return this.blocked;
    }

    public final BlockInfo copy(boolean block, boolean blocked) {
        return new BlockInfo(block, blocked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockInfo)) {
            return false;
        }
        BlockInfo blockInfo = (BlockInfo) other;
        return this.block == blockInfo.block && this.blocked == blockInfo.blocked;
    }

    public final boolean getBlock() {
        return this.block;
    }

    public final boolean getBlocked() {
        return this.blocked;
    }

    public int hashCode() {
        return (AbstractC0690e.m3114a(this.block) * 31) + AbstractC0690e.m3114a(this.blocked);
    }

    public final void setBlock(boolean z11) {
        this.block = z11;
    }

    public final void setBlocked(boolean z11) {
        this.blocked = z11;
    }

    public String toString() {
        return "BlockInfo(block=" + this.block + ", blocked=" + this.blocked + ")";
    }
}
