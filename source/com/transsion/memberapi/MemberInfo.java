package com.transsion.memberapi;

import com.cloud.tmc.offline.download.constants.OfflineConstantsKt;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pairipcore0.PairipLoader;
import pairipcore0.hidden.Hidden0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\t\u0010-\u001a\u00020\u0005HÆ\u0003J`\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\u0005HÖ\u0001J\t\u00104\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015¨\u00065"}, m97100d2 = {"Lcom/transsion/memberapi/MemberInfo;", "Ljava/io/Serializable;", "isActive", "", "memberType", "", "durationType", "isAutoRenew", "expiryDate", "", "nextRenewDate", "daysLeft", "point", "<init>", "(ZIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;I)V", "()Z", "setActive", "(Z)V", "getMemberType", "()I", "setMemberType", "(I)V", "getDurationType", "setDurationType", "setAutoRenew", "getExpiryDate", "()Ljava/lang/String;", "setExpiryDate", "(Ljava/lang/String;)V", "getNextRenewDate", "setNextRenewDate", "getDaysLeft", "()Ljava/lang/Integer;", "setDaysLeft", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPoint", "setPoint", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;I)Lcom/transsion/memberapi/MemberInfo;", "equals", OfflineConstantsKt.OFFLINE_DOWNLOAD_CHANNEL_MODE_OTHER, "", "hashCode", "toString", "MemberApi_psRelease"}, m97101k = 1, m97102mv = {2, 1, 0}, m97104xi = Sdk$SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
public final /* data */ class MemberInfo implements Serializable {
    private Integer daysLeft;
    private int durationType;
    private String expiryDate;
    private boolean isActive;
    private boolean isAutoRenew;
    private int memberType;
    private String nextRenewDate;
    private int point;

    static {
        PairipLoader.registerNativesForClass(45, MemberInfo.class);
        Hidden0.special_clinit_45_300(MemberInfo.class);
    }

    public MemberInfo(boolean z11, int i11, int i12, boolean z12, String expiryDate, String nextRenewDate, Integer num, int i13) {
        Intrinsics.m97802h(expiryDate, "expiryDate");
        Intrinsics.m97802h(nextRenewDate, "nextRenewDate");
        this.isActive = z11;
        this.memberType = i11;
        this.durationType = i12;
        this.isAutoRenew = z12;
        this.expiryDate = expiryDate;
        this.nextRenewDate = nextRenewDate;
        this.daysLeft = num;
        this.point = i13;
    }

    public static native /* synthetic */ MemberInfo copy$default(MemberInfo memberInfo, boolean z11, int i11, int i12, boolean z12, String str, String str2, Integer num, int i13, int i14, Object obj);

    public final native boolean component1();

    public final native int component2();

    public final native int component3();

    public final native boolean component4();

    public final native String component5();

    public final native String component6();

    public final native Integer component7();

    public final native int component8();

    public final native MemberInfo copy(boolean isActive, int memberType, int durationType, boolean isAutoRenew, String expiryDate, String nextRenewDate, Integer daysLeft, int point);

    public native boolean equals(Object other);

    public final native Integer getDaysLeft();

    public final native int getDurationType();

    public final native String getExpiryDate();

    public final native int getMemberType();

    public final native String getNextRenewDate();

    public final native int getPoint();

    public native int hashCode();

    public final native boolean isActive();

    public final native boolean isAutoRenew();

    public final native void setActive(boolean z11);

    public final native void setAutoRenew(boolean z11);

    public final native void setDaysLeft(Integer num);

    public final native void setDurationType(int i11);

    public final native void setExpiryDate(String str);

    public final native void setMemberType(int i11);

    public final native void setNextRenewDate(String str);

    public final native void setPoint(int i11);

    public native String toString();
}
