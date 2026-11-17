package com.transsion.postdetail.p306ui.fragment.preload;

import androidx.p1004lifecycle.C3187b0;
import com.transsion.moviedetailapi.bean.Media;
import com.transsion.moviedetailapi.bean.ShortTVItem;
import com.transsion.moviedetailapi.bean.ShortTVRespData;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.moviedetailapi.bean.Video;
import com.transsion.player.orplayer.ORPlayerPreloadManager;
import com.transsion.postdetail.viewmodel.ImmVideoRequestEntity;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p328cp.C22762b;
import p349dh.C22982c;
import p843vm.AbstractC28132b;
import p985zo.InterfaceC29211d;

/* JADX INFO: loaded from: classes6.dex */
public final class ShortTvVideoImmersiveDataLoader extends AbstractC28132b {

    /* JADX INFO: renamed from: f */
    private ImmVideoRequestEntity f57422f;

    /* JADX INFO: renamed from: g */
    private final Lazy f57423g;

    /* JADX WARN: Multi-variable type inference failed */
    public ShortTvVideoImmersiveDataLoader() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ShortTvVideoImmersiveDataLoader(ImmVideoRequestEntity immVideoRequestEntity) {
        this.f57422f = immVideoRequestEntity;
        this.f57423g = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.ui.fragment.preload.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShortTvVideoImmersiveDataLoader.m74557q();
            }
        });
    }

    public /* synthetic */ ShortTvVideoImmersiveDataLoader(ImmVideoRequestEntity immVideoRequestEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : immVideoRequestEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC29211d m74555o() {
        return (InterfaceC29211d) this.f57423g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final Object m74556p(ShortTVRespData shortTVRespData, Continuation continuation) {
        Object objM112707constructorimpl;
        Media video;
        Video videoAddress;
        String url;
        Unit unit;
        Media video2;
        Video videoAddress2;
        String url2;
        Object objM98910g;
        ImmVideoRequestEntity immVideoRequestEntity = this.f57422f;
        Unit unit2 = null;
        if (!Intrinsics.m97797c(immVideoRequestEntity != null ? immVideoRequestEntity.getPage() : null, "1")) {
            return Unit.f75682a;
        }
        List<Subject> items = shortTVRespData != null ? shortTVRespData.getItems() : null;
        if (items == null || items.isEmpty()) {
            return Unit.f75682a;
        }
        if (C22762b.f69089a.m90696b()) {
            Intrinsics.m97799e(shortTVRespData);
            List<Subject> items2 = shortTVRespData.getItems();
            Intrinsics.m97799e(items2);
            ShortTVItem shortTVFirstEp = items2.get(0).getShortTVFirstEp();
            if (shortTVFirstEp != null && (objM98910g = AbstractC25088i.m98910g(C25220y0.m99269c(), new ShortTvVideoImmersiveDataLoader$initVideoPreload$2$1(shortTVFirstEp, null), continuation)) == IntrinsicsKt.m97630f()) {
                return objM98910g;
            }
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.m97799e(shortTVRespData);
                List<Subject> items3 = shortTVRespData.getItems();
                Intrinsics.m97799e(items3);
                ShortTVItem shortTVFirstEp2 = items3.get(0).getShortTVFirstEp();
                if (shortTVFirstEp2 == null || (video2 = shortTVFirstEp2.getVideo()) == null || (videoAddress2 = video2.getVideoAddress()) == null || (url2 = videoAddress2.getUrl()) == null) {
                    unit = null;
                } else {
                    ORPlayerPreloadManager.f55908i.m72403a().m72400i(url2);
                    unit = Unit.f75682a;
                }
                Result.m112707constructorimpl(unit);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m112707constructorimpl(ResultKt.m97106a(th2));
            }
            try {
                Intrinsics.m97799e(shortTVRespData);
                List<Subject> items4 = shortTVRespData.getItems();
                Intrinsics.m97799e(items4);
                ShortTVItem shortTVFirstEp3 = items4.get(1).getShortTVFirstEp();
                if (shortTVFirstEp3 != null && (video = shortTVFirstEp3.getVideo()) != null && (videoAddress = video.getVideoAddress()) != null && (url = videoAddress.getUrl()) != null) {
                    ORPlayerPreloadManager.f55908i.m72403a().m72400i(url);
                    unit2 = Unit.f75682a;
                }
                objM112707constructorimpl = Result.m112707constructorimpl(unit2);
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th3));
            }
            Result.m112706boximpl(objM112707constructorimpl);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final InterfaceC29211d m74557q() {
        return (InterfaceC29211d) C22982c.f70163e.m91553a().m91552h(InterfaceC29211d.class);
    }

    @Override // p843vm.AbstractC28132b
    /* JADX INFO: renamed from: h */
    public void mo70647h(C3187b0 c3187b0) {
        m109264j(AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new ShortTvVideoImmersiveDataLoader$loadDataFromService$1(this, null), 3, null));
    }

    /* JADX INFO: renamed from: n */
    public final ImmVideoRequestEntity m74558n() {
        return this.f57422f;
    }

    /* JADX INFO: renamed from: r */
    public final void m74559r(ImmVideoRequestEntity immVideoRequestEntity) {
        this.f57422f = immVideoRequestEntity;
    }
}
