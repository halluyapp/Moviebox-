package com.transsion.rewardscenter.task.p308ad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.cloud.hisavana.sdk.api.view.AdChoicesView;
import com.cloud.hisavana.sdk.api.view.AdCloseView;
import com.cloud.hisavana.sdk.api.view.MediaView;
import com.cloud.hisavana.sdk.api.view.StoreMarkView;
import com.transsion.p285ad.bidding.base.AbstractC13927u;
import kotlin.jvm.internal.Intrinsics;
import p986zp.C29222k;

/* JADX INFO: renamed from: com.transsion.rewardscenter.task.ad.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C17915w extends AbstractC13927u {

    /* JADX INFO: renamed from: b */
    private final C29222k f58843b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17915w(Context context) {
        super(context);
        Intrinsics.m97802h(context, "context");
        C29222k c29222kM112109c = C29222k.m112109c(LayoutInflater.from(context), null, false);
        Intrinsics.m97801g(c29222kM112109c, "inflate(...)");
        this.f58843b = c29222kM112109c;
    }

    @Override // com.transsion.p285ad.bidding.base.AbstractC13927u
    /* JADX INFO: renamed from: a */
    public AdChoicesView mo62977a() {
        return null;
    }

    @Override // com.transsion.p285ad.bidding.base.AbstractC13927u
    /* JADX INFO: renamed from: b */
    public AdCloseView mo62978b() {
        return null;
    }

    @Override // com.transsion.p285ad.bidding.base.AbstractC13927u
    /* JADX INFO: renamed from: c */
    public TextView mo62979c() {
        return null;
    }

    @Override // com.transsion.p285ad.bidding.base.AbstractC13927u
    /* JADX INFO: renamed from: e */
    public TextView mo62981e() {
        return null;
    }

    @Override // com.transsion.p285ad.bidding.base.AbstractC13927u
    /* JADX INFO: renamed from: f */
    public ImageView mo62982f() {
        ImageView adIcon = this.f58843b.f89191b;
        Intrinsics.m97801g(adIcon, "adIcon");
        return adIcon;
    }

    @Override // com.transsion.p285ad.bidding.base.AbstractC13927u
    /* JADX INFO: renamed from: g */
    public MediaView mo62983g() {
        return null;
    }

    @Override // com.transsion.p285ad.bidding.base.AbstractC13927u
    /* JADX INFO: renamed from: h */
    public StoreMarkView mo62984h() {
        return null;
    }

    @Override // com.transsion.p285ad.bidding.base.AbstractC13927u
    /* JADX INFO: renamed from: i */
    public View mo62985i() {
        ConstraintLayout root = this.f58843b.getRoot();
        Intrinsics.m97801g(root, "getRoot(...)");
        return root;
    }

    @Override // com.transsion.p285ad.bidding.base.AbstractC13927u
    /* JADX INFO: renamed from: j */
    public TextView mo62986j() {
        AppCompatTextView adTitle = this.f58843b.f89192c;
        Intrinsics.m97801g(adTitle, "adTitle");
        return adTitle;
    }
}
