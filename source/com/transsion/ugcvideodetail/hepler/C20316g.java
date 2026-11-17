package com.transsion.ugcvideodetail.hepler;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.viewmodel.UGCVideoDetailViewModel;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p840vj.C28117b;
import p840vj.InterfaceC28116a;

/* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C20316g {

    /* JADX INFO: renamed from: a */
    public static final C20316g f64409a = new C20316g();

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.g$a */
    public static final class a implements InterfaceC28116a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f64410a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ UGCVideoDetailViewModel f64411b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f64412c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f64413d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f64414e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ String f64415f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Boolean f64416g;

        a(Function1 function1, UGCVideoDetailViewModel uGCVideoDetailViewModel, String str, String str2, String str3, String str4, Boolean bool) {
            this.f64410a = function1;
            this.f64411b = uGCVideoDetailViewModel;
            this.f64412c = str;
            this.f64413d = str2;
            this.f64414e = str3;
            this.f64415f = str4;
            this.f64416g = bool;
        }

        @Override // p840vj.InterfaceC28116a
        /* JADX INFO: renamed from: a */
        public void mo65894a(int i11, long j11, View view) {
            String ugcVideoId;
            Function1 function1 = this.f64410a;
            UGCVideoDetailViewModel uGCVideoDetailViewModel = this.f64411b;
            String str = this.f64412c;
            String str2 = this.f64413d;
            String str3 = this.f64414e;
            String str4 = this.f64415f;
            Boolean bool = this.f64416g;
            try {
                Result.Companion companion = Result.INSTANCE;
                UGCVideo uGCVideo = (UGCVideo) function1.invoke(Integer.valueOf(i11));
                if (uGCVideo != null && (ugcVideoId = uGCVideo.getUgcVideoId()) != null && !uGCVideoDetailViewModel.m84278a0(ugcVideoId)) {
                    uGCVideoDetailViewModel.m84282e0(ugcVideoId);
                    if (str != null) {
                        C20317h.f64417a.m84107g(str, uGCVideo, i11, j11, str2, str3, str4, bool);
                    }
                }
                Result.m112707constructorimpl(Unit.f75682a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
        }
    }

    private C20316g() {
    }

    /* JADX INFO: renamed from: a */
    public final C28117b m84099a(RecyclerView recyclerView, UGCVideoDetailViewModel viewModel, String str, Function1 getItemAtPosition, String str2, String str3, String str4, Boolean bool) {
        Intrinsics.m97802h(recyclerView, "recyclerView");
        Intrinsics.m97802h(viewModel, "viewModel");
        Intrinsics.m97802h(getItemAtPosition, "getItemAtPosition");
        C28117b c28117b = new C28117b(0.6f, new a(getItemAtPosition, viewModel, str, str2, str3, str4, bool), false, 4, null);
        c28117b.m109199n(2);
        recyclerView.addOnScrollListener(c28117b);
        return c28117b;
    }

    /* JADX INFO: renamed from: c */
    public final void m84100c(UGCVideo uGCVideo, int i11, String str, String str2, String str3, String str4) {
        if (uGCVideo == null || str == null) {
            return;
        }
        C20317h.f64417a.m84106f(str, uGCVideo, i11, str2, str3, str4);
    }
}
