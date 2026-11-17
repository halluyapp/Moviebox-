package com.transsion.player.longvideo.helper;

import android.util.Log;
import android.view.ViewGroup;
import com.blankj.utilcode.util.AbstractC5781d;
import com.blankj.utilcode.util.AbstractC5806y;
import com.transsion.player.longvideo.p302ui.LongVodUiType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p582lo.C25661j;

/* JADX INFO: renamed from: com.transsion.player.longvideo.helper.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C16455j {

    /* JADX INFO: renamed from: e */
    public static final a f55539e = new a(null);

    /* JADX INFO: renamed from: a */
    private final C25661j f55540a;

    /* JADX INFO: renamed from: b */
    private int f55541b;

    /* JADX INFO: renamed from: c */
    private int f55542c;

    /* JADX INFO: renamed from: d */
    private int f55543d;

    /* JADX INFO: renamed from: com.transsion.player.longvideo.helper.j$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C16455j(C25661j viewBinding) {
        Intrinsics.m97802h(viewBinding, "viewBinding");
        this.f55540a = viewBinding;
        this.f55541b = AbstractC5806y.m27487c();
        int iM27489e = AbstractC5806y.m27489e();
        this.f55542c = iM27489e;
        int i11 = this.f55541b;
        if (iM27489e < i11) {
            this.f55542c = i11;
            this.f55541b = iM27489e;
        }
        int iM27349a = AbstractC5781d.m27349a();
        if (iM27349a > 10) {
            this.f55542c -= iM27349a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m71816a() {
        return this.f55543d;
    }

    /* JADX INFO: renamed from: b */
    public final void m71817b(int i11, int i12) {
        AbstractC5781d.m27351c();
    }

    /* JADX INFO: renamed from: c */
    public final void m71818c() {
        this.f55543d = 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m71819d(LongVodUiType uiType, int i11) {
        Intrinsics.m97802h(uiType, "uiType");
        if (this.f55543d == 0) {
            this.f55543d = AbstractC5781d.m27351c();
        }
        LongVodUiType longVodUiType = LongVodUiType.LAND;
        int i12 = 0;
        int i13 = (uiType == longVodUiType && i11 == 1) ? this.f55543d : 0;
        if (uiType == longVodUiType && i11 == 3) {
            i12 = this.f55543d;
        }
        Log.e("LongVodLandSpace", "setSpace  uiType:" + uiType + "  rotation:" + i11 + "  spaceLeft:" + i13 + "  spaceRight:" + i12);
        ViewGroup.LayoutParams layoutParams = this.f55540a.f77910q.f77886h.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.f55540a.f77908o.f77922C.getLayoutParams();
        layoutParams.width = i13;
        layoutParams2.width = i13;
        this.f55540a.f77910q.f77886h.setLayoutParams(layoutParams);
        this.f55540a.f77908o.f77922C.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.f55540a.f77910q.f77885g.getLayoutParams();
        ViewGroup.LayoutParams layoutParams4 = this.f55540a.f77908o.f77921B.getLayoutParams();
        layoutParams3.width = i12;
        layoutParams4.width = i12;
        this.f55540a.f77910q.f77885g.setLayoutParams(layoutParams3);
        this.f55540a.f77908o.f77921B.setLayoutParams(layoutParams4);
    }
}
