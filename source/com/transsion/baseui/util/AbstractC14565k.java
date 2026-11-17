package com.transsion.baseui.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsion.baseui.util.k */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14565k {

    /* JADX INFO: renamed from: com.transsion.baseui.util.k$a */
    public static final class a extends AbstractC14565k {

        /* JADX INFO: renamed from: a */
        private final int f51116a;

        public a(int i11) {
            super(null);
            this.f51116a = i11;
        }

        /* JADX INFO: renamed from: a */
        public final int m65683a() {
            return this.f51116a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f51116a == ((a) obj).f51116a;
        }

        public int hashCode() {
            return this.f51116a;
        }

        public String toString() {
            return "Icon(iconRes=" + this.f51116a + ")";
        }
    }

    /* JADX INFO: renamed from: com.transsion.baseui.util.k$b */
    public static final class b extends AbstractC14565k {

        /* JADX INFO: renamed from: a */
        private final String f51117a;

        /* JADX INFO: renamed from: b */
        private final Integer f51118b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String content, Integer num) {
            super(null);
            Intrinsics.m97802h(content, "content");
            this.f51117a = content;
            this.f51118b = num;
        }

        /* JADX INFO: renamed from: a */
        public final String m65684a() {
            return this.f51117a;
        }

        /* JADX INFO: renamed from: b */
        public final Integer m65685b() {
            return this.f51118b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.m97797c(this.f51117a, bVar.f51117a) && Intrinsics.m97797c(this.f51118b, bVar.f51118b);
        }

        public int hashCode() {
            int iHashCode = this.f51117a.hashCode() * 31;
            Integer num = this.f51118b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "Text(content=" + this.f51117a + ", textColorRes=" + this.f51118b + ")";
        }
    }

    private AbstractC14565k() {
    }

    public /* synthetic */ AbstractC14565k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
