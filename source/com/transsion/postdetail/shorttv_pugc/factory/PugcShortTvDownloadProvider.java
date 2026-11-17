package com.transsion.postdetail.shorttv_pugc.factory;

import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.shorttv_pugc.ShorttvModel;
import com.transsion.shorttv_pugc.bean.Cover;
import com.transsion.ugcvideodetail.api.UGCVideoType;
import com.transsnet.downloader.DownloadManagerApi;
import com.transsnet.downloader.manager.C21851p;
import com.transsnet.downloader.manager.DownloadEsHelper;
import com.transsnet.downloader.manager.InterfaceC21842g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p648oj.AbstractC26235a;
import p648oj.InterfaceC26269m0;
import p920xt.InterfaceC28658c;
import p920xt.InterfaceC28665j;

/* JADX INFO: loaded from: classes6.dex */
public final class PugcShortTvDownloadProvider implements InterfaceC28658c {

    /* JADX INFO: renamed from: b */
    private InterfaceC28665j f56864b;

    /* JADX INFO: renamed from: a */
    private final Lazy f56863a = LazyKt.m97097b(new Function0() { // from class: com.transsion.postdetail.shorttv_pugc.factory.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PugcShortTvDownloadProvider.m73786h();
        }
    });

    /* JADX INFO: renamed from: c */
    private final InterfaceC26269m0 f56865c = new C16939a();

    /* JADX INFO: renamed from: com.transsion.postdetail.shorttv_pugc.factory.PugcShortTvDownloadProvider$a */
    public static final class C16939a extends AbstractC26235a {
        C16939a() {
        }

        @Override // p648oj.AbstractC26235a, p648oj.InterfaceC26269m0
        /* JADX INFO: renamed from: e */
        public void mo24050e(DownloadBean bean, String str) {
            Intrinsics.m97802h(bean, "bean");
            InterfaceC28665j interfaceC28665j = PugcShortTvDownloadProvider.this.f56864b;
            if (interfaceC28665j != null) {
                String ugcVideoId = bean.getUgcVideoId();
                Integer ugcVideoPosition = bean.getUgcVideoPosition();
                interfaceC28665j.mo81054a(ugcVideoId, ugcVideoPosition != null ? ugcVideoPosition.intValue() : bean.getEp());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC21842g m73786h() {
        return C21851p.f67672a.m88759a(Utils.m27275a());
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC21842g m73787i() {
        return (InterfaceC21842g) this.f56863a.getValue();
    }

    /* JADX INFO: renamed from: j */
    private final ShorttvModel.UGCVideo m73788j(DownloadBean downloadBean) {
        ShorttvModel.UGCVideo uGCVideo = new ShorttvModel.UGCVideo(downloadBean.videoUGCId(), downloadBean.getTitleName(), null, null, new Cover(null, null, null, downloadBean.getUrl(), null, downloadBean.getThumbnail(), null, null, null, 471, null), null, downloadBean.getDuration(), null, null, null, downloadBean.getUgcVideoType(), null, new ShorttvModel.UGCVideoCreator(null, null, null, null, 15, null), new ShorttvModel.UGCVideoInteractiveInfo(null, null, null, null, null, null, null, 127, null), new ShorttvModel.UGCVideoCollection(downloadBean.getUgcVideoCollectionId(), null, Integer.valueOf(downloadBean.videoUGCPosition()), null, 10, null), downloadBean.getOps(), null, null, null, null, 0, false, null, false, 16714668, null);
        uGCVideo.setPlayUrl(downloadBean.getPath());
        return uGCVideo;
    }

    @Override // p920xt.InterfaceC28658c
    /* JADX INFO: renamed from: a */
    public void mo73789a(InterfaceC28665j listener) {
        Intrinsics.m97802h(listener, "listener");
        this.f56864b = listener;
        m73787i().mo88675g(this.f56865c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p920xt.InterfaceC28658c
    /* JADX INFO: renamed from: b */
    public Object mo73790b(String str, Continuation continuation) throws Throwable {
        PugcShortTvDownloadProvider$fetchDownloadList$1 pugcShortTvDownloadProvider$fetchDownloadList$1;
        if (continuation instanceof PugcShortTvDownloadProvider$fetchDownloadList$1) {
            pugcShortTvDownloadProvider$fetchDownloadList$1 = (PugcShortTvDownloadProvider$fetchDownloadList$1) continuation;
            int i11 = pugcShortTvDownloadProvider$fetchDownloadList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pugcShortTvDownloadProvider$fetchDownloadList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                pugcShortTvDownloadProvider$fetchDownloadList$1 = new PugcShortTvDownloadProvider$fetchDownloadList$1(this, continuation);
            }
        } else {
            pugcShortTvDownloadProvider$fetchDownloadList$1 = new PugcShortTvDownloadProvider$fetchDownloadList$1(this, continuation);
        }
        Object objM88565P = pugcShortTvDownloadProvider$fetchDownloadList$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = pugcShortTvDownloadProvider$fetchDownloadList$1.label;
        ArrayList arrayList = null;
        if (i12 == 0) {
            ResultKt.m97107b(objM88565P);
            if (str == null) {
                return null;
            }
            DownloadEsHelper downloadEsHelperM88598a = DownloadEsHelper.f67591m.m88598a();
            pugcShortTvDownloadProvider$fetchDownloadList$1.label = 1;
            objM88565P = downloadEsHelperM88598a.m88565P(str, pugcShortTvDownloadProvider$fetchDownloadList$1);
            if (objM88565P == objF) {
                return objF;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(objM88565P);
        }
        List list = (List) objM88565P;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((DownloadBean) obj).isCompleted()) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(CollectionsKt.m97516v(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(m73788j((DownloadBean) it.next()));
            }
        }
        return arrayList;
    }

    @Override // p920xt.InterfaceC28658c
    /* JADX INFO: renamed from: c */
    public void mo73791c() {
        m73787i().mo88686q(this.f56865c);
        this.f56864b = null;
    }

    @Override // p920xt.InterfaceC28658c
    /* JADX INFO: renamed from: d */
    public void mo73792d(FragmentActivity activity, String collectionId, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.m97802h(activity, "activity");
        Intrinsics.m97802h(collectionId, "collectionId");
        DownloadManagerApi.f66480j.m87093a().m87087f0(activity, (7940 & 2) != 0 ? null : collectionId, (7940 & 4) != 0 ? null : null, (7940 & 8) != 0 ? null : str, (7940 & 16) != 0 ? null : UGCVideoType.SHORT_TV.getValue(), (7940 & 32) != 0 ? null : str3, (7940 & 64) != 0 ? null : str4, (7940 & 128) != 0 ? null : str5, (7940 & 256) != 0 ? null : null, (7940 & 512) != 0 ? null : null, (7940 & 1024) != 0 ? null : null, (7940 & 2048) != 0 ? false : false, (7940 & 4096) == 0 ? null : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p920xt.InterfaceC28658c
    /* JADX INFO: renamed from: e */
    public Object mo73793e(String str, Continuation continuation) throws Throwable {
        PugcShortTvDownloadProvider$getDownloadUGCVideo$1 pugcShortTvDownloadProvider$getDownloadUGCVideo$1;
        if (continuation instanceof PugcShortTvDownloadProvider$getDownloadUGCVideo$1) {
            pugcShortTvDownloadProvider$getDownloadUGCVideo$1 = (PugcShortTvDownloadProvider$getDownloadUGCVideo$1) continuation;
            int i11 = pugcShortTvDownloadProvider$getDownloadUGCVideo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pugcShortTvDownloadProvider$getDownloadUGCVideo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                pugcShortTvDownloadProvider$getDownloadUGCVideo$1 = new PugcShortTvDownloadProvider$getDownloadUGCVideo$1(this, continuation);
            }
        } else {
            pugcShortTvDownloadProvider$getDownloadUGCVideo$1 = new PugcShortTvDownloadProvider$getDownloadUGCVideo$1(this, continuation);
        }
        Object objM88567R = pugcShortTvDownloadProvider$getDownloadUGCVideo$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = pugcShortTvDownloadProvider$getDownloadUGCVideo$1.label;
        if (i12 == 0) {
            ResultKt.m97107b(objM88567R);
            if (str == null) {
                return null;
            }
            DownloadEsHelper downloadEsHelperM88598a = DownloadEsHelper.f67591m.m88598a();
            pugcShortTvDownloadProvider$getDownloadUGCVideo$1.label = 1;
            objM88567R = downloadEsHelperM88598a.m88567R(str, pugcShortTvDownloadProvider$getDownloadUGCVideo$1);
            if (objM88567R == objF) {
                return objF;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(objM88567R);
        }
        DownloadBean downloadBean = (DownloadBean) objM88567R;
        if (downloadBean != null) {
            return m73788j(downloadBean);
        }
        return null;
    }
}
