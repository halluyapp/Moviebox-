package com.transsion.ugcvideodetail.hepler.subtitle;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.avery.subtitle.widget.SimpleSubtitleView;
import com.transsion.ugcvideodetail.api.bean.UGCImmVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoPlayStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p528ju.C24469a;

/* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.subtitle.b */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC20325b {

    /* JADX INFO: renamed from: g1 */
    public static final a f64442g1 = a.f64443a;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.subtitle.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ a f64443a = new a();

        private a() {
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC20325b m84141a(FragmentActivity activity, String pageName, ViewGroup subtitleLayout, SimpleSubtitleView subtitleView, C20324a c20324a, UGCImmVideo uGCImmVideo, UGCVideoPlayStream uGCVideoPlayStream) {
            Intrinsics.m97802h(activity, "activity");
            Intrinsics.m97802h(pageName, "pageName");
            Intrinsics.m97802h(subtitleLayout, "subtitleLayout");
            Intrinsics.m97802h(subtitleView, "subtitleView");
            return new UGCImmVideoSubtitleControlImp(activity, pageName, subtitleLayout, subtitleView, c20324a, uGCImmVideo, uGCVideoPlayStream);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo84127a(Function1 function1);

    /* JADX INFO: renamed from: b */
    void mo84128b(Function1 function1);

    /* JADX INFO: renamed from: c */
    void mo84129c(boolean z11);

    /* JADX INFO: renamed from: d */
    void mo84130d(long j11);

    /* JADX INFO: renamed from: e */
    void mo84131e();

    /* JADX INFO: renamed from: f */
    void mo84132f(C24469a c24469a);

    void onDestroy();
}
