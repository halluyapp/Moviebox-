package com.transsion.shorttv.subtitle;

import androidx.fragment.app.FragmentActivity;
import com.transsion.shorttv.viewmodel.ShortTvViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p659os.C26719e;
import p955ys.C29007b;
import rs.C27349k0;

/* JADX INFO: renamed from: com.transsion.shorttv.subtitle.a */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC18876a {

    /* JADX INFO: renamed from: a */
    public static final a f60904a = a.f60905a;

    /* JADX INFO: renamed from: com.transsion.shorttv.subtitle.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ a f60905a = new a();

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC18876a m79479a(FragmentActivity activity, C27349k0 viewBinding, ShortTvViewModel shortTvViewModel, C26719e epItem, String str) {
            Intrinsics.m97802h(activity, "activity");
            Intrinsics.m97802h(viewBinding, "viewBinding");
            Intrinsics.m97802h(epItem, "epItem");
            return new ShortTVSubtitleControlImp(activity, viewBinding, shortTvViewModel, epItem, str);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo79470a(Function1 function1);

    /* JADX INFO: renamed from: b */
    void mo79471b(Function1 function1);

    /* JADX INFO: renamed from: c */
    void mo79472c(boolean z11);

    /* JADX INFO: renamed from: d */
    void mo79473d(long j11);

    /* JADX INFO: renamed from: e */
    void mo79474e();

    /* JADX INFO: renamed from: f */
    void mo79475f();

    /* JADX INFO: renamed from: h */
    void mo79476h(C29007b c29007b);

    void onDestroy();
}
