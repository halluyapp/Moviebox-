package com.transsion.rewardscenter.prize;

import androidx.compose.foundation.AbstractC0690e;
import com.transsion.rewardscenterapi.DrawChance;
import com.transsion.rewardscenterapi.DrawResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.rewardscenter.prize.e */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC17864e {

    /* JADX INFO: renamed from: com.transsion.rewardscenter.prize.e$a */
    public static final class a extends AbstractC17864e {

        /* JADX INFO: renamed from: a */
        private final DrawChance f58673a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DrawChance data) {
            super(null);
            Intrinsics.m97802h(data, "data");
            this.f58673a = data;
        }

        /* JADX INFO: renamed from: a */
        public final DrawChance m76153a() {
            return this.f58673a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.m97797c(this.f58673a, ((a) obj).f58673a);
        }

        public int hashCode() {
            return this.f58673a.hashCode();
        }

        public String toString() {
            return "DrawChanceItem(data=" + this.f58673a + ")";
        }
    }

    /* JADX INFO: renamed from: com.transsion.rewardscenter.prize.e$b */
    public static final class b extends AbstractC17864e {

        /* JADX INFO: renamed from: a */
        private final boolean f58674a;

        public b(boolean z11) {
            super(null);
            this.f58674a = z11;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m76154a() {
            return this.f58674a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f58674a == ((b) obj).f58674a;
        }

        public int hashCode() {
            return AbstractC0690e.m3114a(this.f58674a);
        }

        public String toString() {
            return "FooterItem(isExpanded=" + this.f58674a + ")";
        }
    }

    /* JADX INFO: renamed from: com.transsion.rewardscenter.prize.e$c */
    public static final class c extends AbstractC17864e {

        /* JADX INFO: renamed from: a */
        private final DrawResult f58675a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DrawResult data) {
            super(null);
            Intrinsics.m97802h(data, "data");
            this.f58675a = data;
        }

        /* JADX INFO: renamed from: a */
        public final DrawResult m76155a() {
            return this.f58675a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.m97797c(this.f58675a, ((c) obj).f58675a);
        }

        public int hashCode() {
            return this.f58675a.hashCode();
        }

        public String toString() {
            return "Row(data=" + this.f58675a + ")";
        }
    }

    private AbstractC17864e() {
    }

    public /* synthetic */ AbstractC17864e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
