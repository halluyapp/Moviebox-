package com.transsion.room.sub.viewmodel.subscription;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.C3187b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p349dh.C22982c;
import p716qq.InterfaceC27119a;

/* JADX INFO: renamed from: com.transsion.room.sub.viewmodel.subscription.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C18270a extends AbstractC3186b {

    /* JADX INFO: renamed from: e */
    public static final a f59531e = new a(null);

    /* JADX INFO: renamed from: b */
    private String f59532b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC27119a f59533c;

    /* JADX INFO: renamed from: d */
    private final C3187b0 f59534d;

    /* JADX INFO: renamed from: com.transsion.room.sub.viewmodel.subscription.a$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18270a(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f59532b = "";
        this.f59533c = (InterfaceC27119a) C22982c.f70163e.m91553a().m91552h(InterfaceC27119a.class);
        this.f59534d = new C3187b0();
    }
}
