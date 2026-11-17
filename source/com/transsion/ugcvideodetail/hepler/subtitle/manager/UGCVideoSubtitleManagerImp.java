package com.transsion.ugcvideodetail.hepler.subtitle.manager;

import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.report.C14482a;
import com.transsion.subtitle_download.InterfaceC19743a;
import com.transsion.subtitle_download.SubtitleDownloadManager;
import com.transsion.subtitle_download.p319db.SubtitleDownloadTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import mu.InterfaceC25911c;
import p528ju.C24469a;
import p743rh.C27287m;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class UGCVideoSubtitleManagerImp implements InterfaceC20331b {

    /* JADX INFO: renamed from: f */
    public static final C20328a f64446f = new C20328a(null);

    /* JADX INFO: renamed from: b */
    private Set f64447b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c */
    private final String f64448c = UGCVideoSubtitleManagerImp.class.getSimpleName();

    /* JADX INFO: renamed from: d */
    private final InterfaceC25149n0 f64449d = AbstractC25153o0.m99079a(C25220y0.m99269c());

    /* JADX INFO: renamed from: e */
    private final UGCVideoSubtitleManagerImp$resDownloadListener$1 f64450e = new UGCVideoSubtitleManagerImp$resDownloadListener$1(this);

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.subtitle.manager.UGCVideoSubtitleManagerImp$a */
    public static final class C20328a {
        private C20328a() {
        }

        public /* synthetic */ C20328a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m84145k(final DownloadBean downloadBean, final Function1 function1) {
        if (!downloadBean.isVideo() || downloadBean.isMusic()) {
            C26866a.a.m104898f(C26866a.f81698a, InterfaceC20331b.f64452a.m84161c(), this.f64448c + " checkDownloadSubtitle fail， has no shorTvId", false, 4, null);
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        if (!C27287m.f83003a.m106330e()) {
            C26866a.f81698a.m104921x(InterfaceC20331b.f64452a.m84161c(), this.f64448c + " checkDownloadSubtitle ,无网络不做检测", true);
            return;
        }
        String ugcVideoId = downloadBean.getUgcVideoId();
        if (ugcVideoId == null || ugcVideoId.length() == 0) {
            C26866a.a.m104898f(C26866a.f81698a, C14482a.f50937a.m65273a(), this.f64448c + " checkUGCVideoSubtitle fail，UGC视频缺少ugcVideoId", false, 4, null);
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        String resourceId = downloadBean.getResourceId();
        if (resourceId == null || resourceId.length() == 0) {
            C26866a.a.m104898f(C26866a.f81698a, C14482a.f50937a.m65273a(), this.f64448c + " checkUGCVideoSubtitle fail，UGC视频缺少resourceId（videoResourceId）", false, 4, null);
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        String subtitleIdType = downloadBean.getSubtitleIdType();
        if (subtitleIdType == null) {
            subtitleIdType = downloadBean.getIsStream() ? "StreamId" : "ResourceId";
        }
        String str = subtitleIdType;
        C26866a.f81698a.m104912c(C14482a.f50937a.m65273a(), this.f64448c + " checkUGCVideoSubtitle, name = " + downloadBean.getName() + " ugcVideoId:" + downloadBean.getUgcVideoId() + " collectionId:" + downloadBean.getUgcVideoCollectionId() + " videoResourceId:" + resourceId + " idType:" + str, true);
        SubtitleDownloadManager.f63041a.m82266f(downloadBean.getSubjectId(), downloadBean.getSubtitleResId(), resourceId, downloadBean.getUgcVideoId(), downloadBean.getUgcVideoCollectionId(), downloadBean.getOps(), str, new Function1() { // from class: com.transsion.ugcvideodetail.hepler.subtitle.manager.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UGCVideoSubtitleManagerImp.m84147m(this.f64456a, function1, downloadBean, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: renamed from: l */
    static /* synthetic */ void m84146l(UGCVideoSubtitleManagerImp uGCVideoSubtitleManagerImp, DownloadBean downloadBean, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        uGCVideoSubtitleManagerImp.m84145k(downloadBean, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final Unit m84147m(UGCVideoSubtitleManagerImp uGCVideoSubtitleManagerImp, Function1 function1, DownloadBean downloadBean, boolean z11) {
        AbstractC25136k.m99058d(uGCVideoSubtitleManagerImp.f64449d, null, null, new UGCVideoSubtitleManagerImp$checkDownloadSubtitle$1$1(function1, z11, uGCVideoSubtitleManagerImp, downloadBean, null), 3, null);
        return Unit.f75682a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.transsion.ugcvideodetail.hepler.subtitle.manager.InterfaceC20331b
    /* JADX INFO: renamed from: a */
    public Object mo84148a(String str, Continuation continuation) throws Throwable {
        UGCVideoSubtitleManagerImp$getSubtitleList$1 uGCVideoSubtitleManagerImp$getSubtitleList$1;
        List list;
        if (continuation instanceof UGCVideoSubtitleManagerImp$getSubtitleList$1) {
            uGCVideoSubtitleManagerImp$getSubtitleList$1 = (UGCVideoSubtitleManagerImp$getSubtitleList$1) continuation;
            int i11 = uGCVideoSubtitleManagerImp$getSubtitleList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                uGCVideoSubtitleManagerImp$getSubtitleList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                uGCVideoSubtitleManagerImp$getSubtitleList$1 = new UGCVideoSubtitleManagerImp$getSubtitleList$1(this, continuation);
            }
        } else {
            uGCVideoSubtitleManagerImp$getSubtitleList$1 = new UGCVideoSubtitleManagerImp$getSubtitleList$1(this, continuation);
        }
        Object obj = uGCVideoSubtitleManagerImp$getSubtitleList$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = uGCVideoSubtitleManagerImp$getSubtitleList$1.label;
        if (i12 == 0) {
            ResultKt.m97107b(obj);
            ArrayList arrayList = new ArrayList();
            SubtitleDownloadManager subtitleDownloadManager = SubtitleDownloadManager.f63041a;
            uGCVideoSubtitleManagerImp$getSubtitleList$1.L$0 = arrayList;
            uGCVideoSubtitleManagerImp$getSubtitleList$1.label = 1;
            Object objM82269j = subtitleDownloadManager.m82269j(str, uGCVideoSubtitleManagerImp$getSubtitleList$1);
            if (objM82269j == objF) {
                return objF;
            }
            obj = objM82269j;
            list = arrayList;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) uGCVideoSubtitleManagerImp$getSubtitleList$1.L$0;
            ResultKt.m97107b(obj);
        }
        List list2 = (List) obj;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                list.add(new C24469a((SubtitleDownloadTable) it.next()));
            }
        }
        return list;
    }

    @Override // com.transsion.ugcvideodetail.hepler.subtitle.manager.InterfaceC20331b
    /* JADX INFO: renamed from: b */
    public void mo84149b(InterfaceC19743a listener) {
        Intrinsics.m97802h(listener, "listener");
        SubtitleDownloadManager.f63041a.m82262b(listener);
    }

    @Override // com.transsion.ugcvideodetail.hepler.subtitle.manager.InterfaceC20331b
    /* JADX INFO: renamed from: c */
    public void mo84150c(InterfaceC19743a listener) {
        Intrinsics.m97802h(listener, "listener");
        SubtitleDownloadManager.f63041a.m82278s(listener);
    }

    @Override // com.transsion.ugcvideodetail.hepler.subtitle.manager.InterfaceC20331b
    /* JADX INFO: renamed from: d */
    public void mo84151d(DownloadBean bean, Function1 function1) {
        Intrinsics.m97802h(bean, "bean");
        m84146l(this, bean, null, 2, null);
    }

    @Override // com.transsion.ugcvideodetail.hepler.subtitle.manager.InterfaceC20331b
    /* JADX INFO: renamed from: e */
    public void mo84152e(InterfaceC25911c listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f64447b.remove(listener);
    }

    @Override // com.transsion.ugcvideodetail.hepler.subtitle.manager.InterfaceC20331b
    /* JADX INFO: renamed from: f */
    public void mo84153f(InterfaceC25911c listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f64447b.add(listener);
    }

    @Override // com.transsion.ugcvideodetail.hepler.subtitle.manager.InterfaceC20331b
    /* JADX INFO: renamed from: h */
    public void mo84154h(C24469a bean) {
        Intrinsics.m97802h(bean, "bean");
        SubtitleDownloadManager.f63041a.m82264d(bean.m96011b());
    }
}
