package com.transsion.moviedetailapi.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.collection.AbstractC0585s;
import androidx.compose.foundation.AbstractC0690e;
import com.cloud.tmc.offline.download.constants.OfflineConstantsKt;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m97099d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u0003J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006)"}, m97100d2 = {"Lcom/transsion/moviedetailapi/bean/DownloadResolutionItem;", "Landroid/os/Parcelable;", "resolution", "", "averageSize", "", "isSelected", "", "requireMemberType", "<init>", "(IJZI)V", "getResolution", "()I", "setResolution", "(I)V", "getAverageSize", "()J", "setAverageSize", "(J)V", "()Z", "setSelected", "(Z)V", "getRequireMemberType", "setRequireMemberType", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", OfflineConstantsKt.OFFLINE_DOWNLOAD_CHANNEL_MODE_OTHER, "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MovieDetailApi_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final /* data */ class DownloadResolutionItem implements Parcelable {
    public static final Parcelable.Creator<DownloadResolutionItem> CREATOR = new C16222a();
    private long averageSize;
    private transient boolean isSelected;
    private int requireMemberType;
    private int resolution;

    /* JADX INFO: renamed from: com.transsion.moviedetailapi.bean.DownloadResolutionItem$a */
    public static final class C16222a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DownloadResolutionItem createFromParcel(Parcel parcel) {
            Intrinsics.m97802h(parcel, "parcel");
            return new DownloadResolutionItem(parcel.readInt(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DownloadResolutionItem[] newArray(int i11) {
            return new DownloadResolutionItem[i11];
        }
    }

    public DownloadResolutionItem(int i11, long j11, boolean z11, int i12) {
        this.resolution = i11;
        this.averageSize = j11;
        this.isSelected = z11;
        this.requireMemberType = i12;
    }

    public /* synthetic */ DownloadResolutionItem(int i11, long j11, boolean z11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, j11, (i13 & 4) != 0 ? false : z11, i12);
    }

    public static /* synthetic */ DownloadResolutionItem copy$default(DownloadResolutionItem downloadResolutionItem, int i11, long j11, boolean z11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = downloadResolutionItem.resolution;
        }
        if ((i13 & 2) != 0) {
            j11 = downloadResolutionItem.averageSize;
        }
        long j12 = j11;
        if ((i13 & 4) != 0) {
            z11 = downloadResolutionItem.isSelected;
        }
        boolean z12 = z11;
        if ((i13 & 8) != 0) {
            i12 = downloadResolutionItem.requireMemberType;
        }
        return downloadResolutionItem.copy(i11, j12, z12, i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResolution() {
        return this.resolution;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getAverageSize() {
        return this.averageSize;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRequireMemberType() {
        return this.requireMemberType;
    }

    public final DownloadResolutionItem copy(int resolution, long averageSize, boolean isSelected, int requireMemberType) {
        return new DownloadResolutionItem(resolution, averageSize, isSelected, requireMemberType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadResolutionItem)) {
            return false;
        }
        DownloadResolutionItem downloadResolutionItem = (DownloadResolutionItem) other;
        return this.resolution == downloadResolutionItem.resolution && this.averageSize == downloadResolutionItem.averageSize && this.isSelected == downloadResolutionItem.isSelected && this.requireMemberType == downloadResolutionItem.requireMemberType;
    }

    public final long getAverageSize() {
        return this.averageSize;
    }

    public final int getRequireMemberType() {
        int i11 = this.requireMemberType;
        return 0;
    }

    public final int getResolution() {
        return this.resolution;
    }

    public int hashCode() {
        return (((((this.resolution * 31) + AbstractC0585s.m2633a(this.averageSize)) * 31) + AbstractC0690e.m3114a(this.isSelected)) * 31) + this.requireMemberType;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setAverageSize(long j11) {
        this.averageSize = j11;
    }

    public final void setRequireMemberType(int i11) {
        this.requireMemberType = i11;
    }

    public final void setResolution(int i11) {
        this.resolution = i11;
    }

    public final void setSelected(boolean z11) {
        this.isSelected = z11;
    }

    public String toString() {
        return "DownloadResolutionItem(resolution=" + this.resolution + ", averageSize=" + this.averageSize + ", isSelected=" + this.isSelected + ", requireMemberType=" + this.requireMemberType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.m97802h(dest, "dest");
        dest.writeInt(this.resolution);
        dest.writeLong(this.averageSize);
        dest.writeInt(this.isSelected ? 1 : 0);
        dest.writeInt(this.requireMemberType);
    }
}
