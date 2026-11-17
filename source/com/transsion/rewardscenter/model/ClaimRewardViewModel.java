package com.transsion.rewardscenter.model;

import android.app.Application;
import androidx.p1004lifecycle.AbstractC3186b;
import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import com.transsion.rewardscenterapi.ClaimReceiverRequest;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;

/* JADX INFO: loaded from: classes6.dex */
public final class ClaimRewardViewModel extends AbstractC3186b {

    /* JADX INFO: renamed from: b */
    private final C3187b0 f58634b;

    /* JADX INFO: renamed from: c */
    private final C3187b0 f58635c;

    /* JADX INFO: renamed from: d */
    private final C3187b0 f58636d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClaimRewardViewModel(Application application) {
        super(application);
        Intrinsics.m97802h(application, "application");
        this.f58634b = new C3187b0(Boolean.FALSE);
        this.f58635c = new C3187b0();
        this.f58636d = new C3187b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final void m76087d(String str) {
        if (str.length() != 0) {
            AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ClaimRewardViewModel$claim$1(str, this, null), 3, null);
        } else {
            this.f58634b.mo14855n(Boolean.FALSE);
            this.f58635c.mo14855n(new Pair(null, null));
        }
    }

    /* JADX INFO: renamed from: e */
    public final C3187b0 m76088e() {
        return this.f58636d;
    }

    /* JADX INFO: renamed from: f */
    public final C3187b0 m76089f() {
        return this.f58635c;
    }

    /* JADX INFO: renamed from: g */
    public final C3187b0 m76090g() {
        return this.f58634b;
    }

    /* JADX INFO: renamed from: h */
    public final void m76091h(ClaimReceiverRequest requestBody) {
        Intrinsics.m97802h(requestBody, "requestBody");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new ClaimRewardViewModel$submitAndClaim$1(this, requestBody, null), 3, null);
    }
}
