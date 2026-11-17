package com.transsion.rewardscenter.redeem;

import androidx.compose.foundation.AbstractC0690e;
import com.transsion.rewardscenterapi.LotteryPrize;
import com.transsion.rewardscenterapi.SkuPoint;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.rewardscenter.redeem.e */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC17875e {

    /* JADX INFO: renamed from: com.transsion.rewardscenter.redeem.e$a */
    public static final class a extends AbstractC17875e {

        /* JADX INFO: renamed from: a */
        private final LotteryPrize f58709a;

        /* JADX INFO: renamed from: b */
        private final boolean f58710b;

        /* JADX INFO: renamed from: c */
        private final SkuPoint f58711c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LotteryPrize lotteryPrize, boolean z11, SkuPoint skuPoint) {
            super(null);
            Intrinsics.m97802h(lotteryPrize, "lotteryPrize");
            this.f58709a = lotteryPrize;
            this.f58710b = z11;
            this.f58711c = skuPoint;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m76190a() {
            return this.f58710b;
        }

        /* JADX INFO: renamed from: b */
        public final LotteryPrize m76191b() {
            return this.f58709a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.m97797c(this.f58709a, aVar.f58709a) && this.f58710b == aVar.f58710b && Intrinsics.m97797c(this.f58711c, aVar.f58711c);
        }

        public int hashCode() {
            int iHashCode = ((this.f58709a.hashCode() * 31) + AbstractC0690e.m3114a(this.f58710b)) * 31;
            SkuPoint skuPoint = this.f58711c;
            return iHashCode + (skuPoint == null ? 0 : skuPoint.hashCode());
        }

        public String toString() {
            return "LotteryItem(lotteryPrize=" + this.f58709a + ", hasPaid=" + this.f58710b + ", skuPoint=" + this.f58711c + ")";
        }
    }

    /* JADX INFO: renamed from: com.transsion.rewardscenter.redeem.e$b */
    public static final class b extends AbstractC17875e {

        /* JADX INFO: renamed from: a */
        private final SkuPoint f58712a;

        /* JADX INFO: renamed from: b */
        private final boolean f58713b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SkuPoint skuPoint, boolean z11) {
            super(null);
            Intrinsics.m97802h(skuPoint, "skuPoint");
            this.f58712a = skuPoint;
            this.f58713b = z11;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m76192a() {
            return this.f58713b;
        }

        /* JADX INFO: renamed from: b */
        public final SkuPoint m76193b() {
            return this.f58712a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.m97797c(this.f58712a, bVar.f58712a) && this.f58713b == bVar.f58713b;
        }

        public int hashCode() {
            return (this.f58712a.hashCode() * 31) + AbstractC0690e.m3114a(this.f58713b);
        }

        public String toString() {
            return "SkuItem(skuPoint=" + this.f58712a + ", hasPaid=" + this.f58713b + ")";
        }
    }

    /* JADX INFO: renamed from: com.transsion.rewardscenter.redeem.e$c */
    public static final class c extends AbstractC17875e {

        /* JADX INFO: renamed from: a */
        private final String f58714a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String title) {
            super(null);
            Intrinsics.m97802h(title, "title");
            this.f58714a = title;
        }

        /* JADX INFO: renamed from: a */
        public final String m76194a() {
            return this.f58714a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.m97797c(this.f58714a, ((c) obj).f58714a);
        }

        public int hashCode() {
            return this.f58714a.hashCode();
        }

        public String toString() {
            return "TitleItem(title=" + this.f58714a + ")";
        }
    }

    private AbstractC17875e() {
    }

    public /* synthetic */ AbstractC17875e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
