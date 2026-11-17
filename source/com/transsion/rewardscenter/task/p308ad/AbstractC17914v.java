package com.transsion.rewardscenter.task.p308ad;

import androidx.collection.AbstractC0585s;
import androidx.compose.foundation.AbstractC0690e;
import com.transsion.p285ad.bidding.base.AbstractC13924r;
import com.transsion.p285ad.bidding.base.AbstractC13927u;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.rewardscenter.task.ad.v */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC17914v {

    /* JADX INFO: renamed from: com.transsion.rewardscenter.task.ad.v$a */
    public static final class a extends AbstractC17914v {

        /* JADX INFO: renamed from: a */
        private final BiddingIntermediateMaterialBean f58824a;

        /* JADX INFO: renamed from: b */
        private NativeWrapperAdView f58825b;

        /* JADX INFO: renamed from: c */
        private AbstractC13924r f58826c;

        /* JADX INFO: renamed from: d */
        private AbstractC13927u f58827d;

        /* JADX INFO: renamed from: e */
        private AdTaskState f58828e;

        /* JADX INFO: renamed from: f */
        private String f58829f;

        /* JADX INFO: renamed from: g */
        private boolean f58830g;

        /* JADX INFO: renamed from: h */
        private boolean f58831h;

        /* JADX INFO: renamed from: i */
        private long f58832i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BiddingIntermediateMaterialBean adBean, NativeWrapperAdView nativeWrapperAdView, AbstractC13924r abstractC13924r, AbstractC13927u abstractC13927u, AdTaskState adTaskState, String packageName, boolean z11, boolean z12, long j11) {
            super(null);
            Intrinsics.m97802h(adBean, "adBean");
            Intrinsics.m97802h(adTaskState, "adTaskState");
            Intrinsics.m97802h(packageName, "packageName");
            this.f58824a = adBean;
            this.f58825b = nativeWrapperAdView;
            this.f58826c = abstractC13924r;
            this.f58827d = abstractC13927u;
            this.f58828e = adTaskState;
            this.f58829f = packageName;
            this.f58830g = z11;
            this.f58831h = z12;
            this.f58832i = j11;
        }

        public /* synthetic */ a(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean, NativeWrapperAdView nativeWrapperAdView, AbstractC13924r abstractC13924r, AbstractC13927u abstractC13927u, AdTaskState adTaskState, String str, boolean z11, boolean z12, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(biddingIntermediateMaterialBean, (i11 & 2) != 0 ? null : nativeWrapperAdView, (i11 & 4) != 0 ? null : abstractC13924r, (i11 & 8) == 0 ? abstractC13927u : null, (i11 & 16) != 0 ? AdTaskState.NORMAL : adTaskState, (i11 & 32) != 0 ? "" : str, (i11 & 64) != 0 ? false : z11, (i11 & 128) == 0 ? z12 : false, (i11 & 256) != 0 ? 0L : j11);
        }

        /* JADX INFO: renamed from: a */
        public final a m76355a(BiddingIntermediateMaterialBean adBean, NativeWrapperAdView nativeWrapperAdView, AbstractC13924r abstractC13924r, AbstractC13927u abstractC13927u, AdTaskState adTaskState, String packageName, boolean z11, boolean z12, long j11) {
            Intrinsics.m97802h(adBean, "adBean");
            Intrinsics.m97802h(adTaskState, "adTaskState");
            Intrinsics.m97802h(packageName, "packageName");
            return new a(adBean, nativeWrapperAdView, abstractC13924r, abstractC13927u, adTaskState, packageName, z11, z12, j11);
        }

        /* JADX INFO: renamed from: c */
        public final BiddingIntermediateMaterialBean m76356c() {
            return this.f58824a;
        }

        /* JADX INFO: renamed from: d */
        public final AbstractC13924r m76357d() {
            return this.f58826c;
        }

        /* JADX INFO: renamed from: e */
        public final AdTaskState m76358e() {
            return this.f58828e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.m97797c(this.f58824a, aVar.f58824a) && Intrinsics.m97797c(this.f58825b, aVar.f58825b) && Intrinsics.m97797c(this.f58826c, aVar.f58826c) && Intrinsics.m97797c(this.f58827d, aVar.f58827d) && this.f58828e == aVar.f58828e && Intrinsics.m97797c(this.f58829f, aVar.f58829f) && this.f58830g == aVar.f58830g && this.f58831h == aVar.f58831h && this.f58832i == aVar.f58832i;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m76359f() {
            return this.f58831h;
        }

        /* JADX INFO: renamed from: g */
        public final long m76360g() {
            return this.f58832i;
        }

        /* JADX INFO: renamed from: h */
        public final NativeWrapperAdView m76361h() {
            return this.f58825b;
        }

        public int hashCode() {
            int iHashCode = this.f58824a.hashCode() * 31;
            NativeWrapperAdView nativeWrapperAdView = this.f58825b;
            int iHashCode2 = (iHashCode + (nativeWrapperAdView == null ? 0 : nativeWrapperAdView.hashCode())) * 31;
            AbstractC13924r abstractC13924r = this.f58826c;
            int iHashCode3 = (iHashCode2 + (abstractC13924r == null ? 0 : abstractC13924r.hashCode())) * 31;
            AbstractC13927u abstractC13927u = this.f58827d;
            return ((((((((((iHashCode3 + (abstractC13927u != null ? abstractC13927u.hashCode() : 0)) * 31) + this.f58828e.hashCode()) * 31) + this.f58829f.hashCode()) * 31) + AbstractC0690e.m3114a(this.f58830g)) * 31) + AbstractC0690e.m3114a(this.f58831h)) * 31) + AbstractC0585s.m2633a(this.f58832i);
        }

        /* JADX INFO: renamed from: i */
        public final String m76362i() {
            return this.f58829f;
        }

        /* JADX INFO: renamed from: j */
        public final AbstractC13927u m76363j() {
            return this.f58827d;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m76364k() {
            return this.f58830g;
        }

        /* JADX INFO: renamed from: l */
        public final void m76365l(AbstractC13924r abstractC13924r) {
            this.f58826c = abstractC13924r;
        }

        /* JADX INFO: renamed from: m */
        public final void m76366m(AdTaskState adTaskState) {
            Intrinsics.m97802h(adTaskState, "<set-?>");
            this.f58828e = adTaskState;
        }

        /* JADX INFO: renamed from: n */
        public final void m76367n(boolean z11) {
            this.f58831h = z11;
        }

        /* JADX INFO: renamed from: o */
        public final void m76368o(long j11) {
            this.f58832i = j11;
        }

        /* JADX INFO: renamed from: p */
        public final void m76369p(NativeWrapperAdView nativeWrapperAdView) {
            this.f58825b = nativeWrapperAdView;
        }

        /* JADX INFO: renamed from: q */
        public final void m76370q(AbstractC13927u abstractC13927u) {
            this.f58827d = abstractC13927u;
        }

        public String toString() {
            return "RegularItem(adBean=" + this.f58824a + ", nativeAdView=" + this.f58825b + ", adLayoutProvider=" + this.f58826c + ", sspLayoutProvider=" + this.f58827d + ", adTaskState=" + this.f58828e + ", packageName=" + this.f58829f + ", isPullNewAd=" + this.f58830g + ", bind=" + this.f58831h + ", downloadStartTime=" + this.f58832i + ")";
        }
    }

    /* JADX INFO: renamed from: com.transsion.rewardscenter.task.ad.v$b */
    public static final class b extends AbstractC17914v {

        /* JADX INFO: renamed from: a */
        private final AdTaskState f58833a;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AdTaskState adTaskState) {
            super(null);
            Intrinsics.m97802h(adTaskState, "adTaskState");
            this.f58833a = adTaskState;
        }

        public /* synthetic */ b(AdTaskState adTaskState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? AdTaskState.NORMAL : adTaskState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f58833a == ((b) obj).f58833a;
        }

        public int hashCode() {
            return this.f58833a.hashCode();
        }

        public String toString() {
            return "RewardItem(adTaskState=" + this.f58833a + ")";
        }
    }

    /* JADX INFO: renamed from: com.transsion.rewardscenter.task.ad.v$c */
    public static final class c extends AbstractC17914v {

        /* JADX INFO: renamed from: a */
        private final BiddingIntermediateMaterialBean f58834a;

        /* JADX INFO: renamed from: b */
        private NativeWrapperAdView f58835b;

        /* JADX INFO: renamed from: c */
        private AbstractC13924r f58836c;

        /* JADX INFO: renamed from: d */
        private AbstractC13927u f58837d;

        /* JADX INFO: renamed from: e */
        private AdTaskState f58838e;

        /* JADX INFO: renamed from: f */
        private String f58839f;

        /* JADX INFO: renamed from: g */
        private boolean f58840g;

        /* JADX INFO: renamed from: h */
        private long f58841h;

        /* JADX INFO: renamed from: i */
        private long f58842i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BiddingIntermediateMaterialBean adBean, NativeWrapperAdView nativeWrapperAdView, AbstractC13924r abstractC13924r, AbstractC13927u abstractC13927u, AdTaskState adTaskState, String packageName, boolean z11, long j11, long j12) {
            super(null);
            Intrinsics.m97802h(adBean, "adBean");
            Intrinsics.m97802h(adTaskState, "adTaskState");
            Intrinsics.m97802h(packageName, "packageName");
            this.f58834a = adBean;
            this.f58835b = nativeWrapperAdView;
            this.f58836c = abstractC13924r;
            this.f58837d = abstractC13927u;
            this.f58838e = adTaskState;
            this.f58839f = packageName;
            this.f58840g = z11;
            this.f58841h = j11;
            this.f58842i = j12;
        }

        public /* synthetic */ c(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean, NativeWrapperAdView nativeWrapperAdView, AbstractC13924r abstractC13924r, AbstractC13927u abstractC13927u, AdTaskState adTaskState, String str, boolean z11, long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(biddingIntermediateMaterialBean, (i11 & 2) != 0 ? null : nativeWrapperAdView, (i11 & 4) != 0 ? null : abstractC13924r, (i11 & 8) == 0 ? abstractC13927u : null, (i11 & 16) != 0 ? AdTaskState.NORMAL : adTaskState, (i11 & 32) != 0 ? "" : str, (i11 & 64) != 0 ? false : z11, (i11 & 128) != 0 ? 0L : j11, (i11 & 256) == 0 ? j12 : 0L);
        }

        /* JADX INFO: renamed from: a */
        public final c m76372a(BiddingIntermediateMaterialBean adBean, NativeWrapperAdView nativeWrapperAdView, AbstractC13924r abstractC13924r, AbstractC13927u abstractC13927u, AdTaskState adTaskState, String packageName, boolean z11, long j11, long j12) {
            Intrinsics.m97802h(adBean, "adBean");
            Intrinsics.m97802h(adTaskState, "adTaskState");
            Intrinsics.m97802h(packageName, "packageName");
            return new c(adBean, nativeWrapperAdView, abstractC13924r, abstractC13927u, adTaskState, packageName, z11, j11, j12);
        }

        /* JADX INFO: renamed from: c */
        public final BiddingIntermediateMaterialBean m76373c() {
            return this.f58834a;
        }

        /* JADX INFO: renamed from: d */
        public final AbstractC13924r m76374d() {
            return this.f58836c;
        }

        /* JADX INFO: renamed from: e */
        public final AdTaskState m76375e() {
            return this.f58838e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.m97797c(this.f58834a, cVar.f58834a) && Intrinsics.m97797c(this.f58835b, cVar.f58835b) && Intrinsics.m97797c(this.f58836c, cVar.f58836c) && Intrinsics.m97797c(this.f58837d, cVar.f58837d) && this.f58838e == cVar.f58838e && Intrinsics.m97797c(this.f58839f, cVar.f58839f) && this.f58840g == cVar.f58840g && this.f58841h == cVar.f58841h && this.f58842i == cVar.f58842i;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m76376f() {
            return this.f58840g;
        }

        /* JADX INFO: renamed from: g */
        public final long m76377g() {
            return this.f58842i;
        }

        /* JADX INFO: renamed from: h */
        public final NativeWrapperAdView m76378h() {
            return this.f58835b;
        }

        public int hashCode() {
            int iHashCode = this.f58834a.hashCode() * 31;
            NativeWrapperAdView nativeWrapperAdView = this.f58835b;
            int iHashCode2 = (iHashCode + (nativeWrapperAdView == null ? 0 : nativeWrapperAdView.hashCode())) * 31;
            AbstractC13924r abstractC13924r = this.f58836c;
            int iHashCode3 = (iHashCode2 + (abstractC13924r == null ? 0 : abstractC13924r.hashCode())) * 31;
            AbstractC13927u abstractC13927u = this.f58837d;
            return ((((((((((iHashCode3 + (abstractC13927u != null ? abstractC13927u.hashCode() : 0)) * 31) + this.f58838e.hashCode()) * 31) + this.f58839f.hashCode()) * 31) + AbstractC0690e.m3114a(this.f58840g)) * 31) + AbstractC0585s.m2633a(this.f58841h)) * 31) + AbstractC0585s.m2633a(this.f58842i);
        }

        /* JADX INFO: renamed from: i */
        public final String m76379i() {
            return this.f58839f;
        }

        /* JADX INFO: renamed from: j */
        public final long m76380j() {
            return this.f58841h;
        }

        /* JADX INFO: renamed from: k */
        public final AbstractC13927u m76381k() {
            return this.f58837d;
        }

        /* JADX INFO: renamed from: l */
        public final void m76382l(AbstractC13924r abstractC13924r) {
            this.f58836c = abstractC13924r;
        }

        /* JADX INFO: renamed from: m */
        public final void m76383m(AdTaskState adTaskState) {
            Intrinsics.m97802h(adTaskState, "<set-?>");
            this.f58838e = adTaskState;
        }

        /* JADX INFO: renamed from: n */
        public final void m76384n(boolean z11) {
            this.f58840g = z11;
        }

        /* JADX INFO: renamed from: o */
        public final void m76385o(long j11) {
            this.f58842i = j11;
        }

        /* JADX INFO: renamed from: p */
        public final void m76386p(NativeWrapperAdView nativeWrapperAdView) {
            this.f58835b = nativeWrapperAdView;
        }

        /* JADX INFO: renamed from: q */
        public final void m76387q(long j11) {
            this.f58841h = j11;
        }

        /* JADX INFO: renamed from: r */
        public final void m76388r(AbstractC13927u abstractC13927u) {
            this.f58837d = abstractC13927u;
        }

        public String toString() {
            return "StageItem(adBean=" + this.f58834a + ", nativeAdView=" + this.f58835b + ", adLayoutProvider=" + this.f58836c + ", sspLayoutProvider=" + this.f58837d + ", adTaskState=" + this.f58838e + ", packageName=" + this.f58839f + ", bind=" + this.f58840g + ", playedTime=" + this.f58841h + ", downloadStartTime=" + this.f58842i + ")";
        }
    }

    private AbstractC17914v() {
    }

    public /* synthetic */ AbstractC17914v(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
