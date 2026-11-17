package com.transsion.ugcvideodetail.viewmodel;

import androidx.p1004lifecycle.AbstractC3225u0;
import androidx.p1004lifecycle.C3187b0;
import androidx.p1004lifecycle.LiveData;
import com.blankj.utilcode.util.AbstractC5806y;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.video.UGCCollectionVideoGroupDao;
import com.transsion.moviedetailapi.bean.Pager;
import com.transsion.ugcvideodetail.api.bean.UGCImmVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.ugcvideodetail.api.bean.UGCVideoList;
import com.transsion.ugcvideodetail.api.bean.UGCVideoPlayInfo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoPlayStream;
import com.transsnet.downloader.manager.DownloadEsHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.AbstractC25153o0;
import kotlinx.coroutines.C25220y0;
import p349dh.C22982c;
import p922xv.InterfaceC28667a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class UGCImmVideoDetailViewModel extends UGCVideoDetailViewModel {

    /* JADX INFO: renamed from: d0 */
    public static final C20333a f64459d0 = new C20333a(null);

    /* JADX INFO: renamed from: I */
    private String f64460I;

    /* JADX INFO: renamed from: J */
    private String f64461J;

    /* JADX INFO: renamed from: M */
    private String f64464M;

    /* JADX INFO: renamed from: N */
    private int f64465N;

    /* JADX INFO: renamed from: O */
    private int f64466O;

    /* JADX INFO: renamed from: P */
    private String f64467P;

    /* JADX INFO: renamed from: W */
    private final C3187b0 f64474W;

    /* JADX INFO: renamed from: X */
    private final LiveData f64475X;

    /* JADX INFO: renamed from: Y */
    private final C3187b0 f64476Y;

    /* JADX INFO: renamed from: Z */
    private final LiveData f64477Z;

    /* JADX INFO: renamed from: a0 */
    private final C3187b0 f64478a0;

    /* JADX INFO: renamed from: b0 */
    private final C3187b0 f64479b0;

    /* JADX INFO: renamed from: c0 */
    private final LiveData f64480c0;

    /* JADX INFO: renamed from: K */
    private final Lazy f64462K = LazyKt.m97097b(new Function0() { // from class: com.transsion.ugcvideodetail.viewmodel.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UGCImmVideoDetailViewModel.m84181x();
        }
    });

    /* JADX INFO: renamed from: L */
    private final int f64463L = AbstractC5806y.m27489e();

    /* JADX INFO: renamed from: Q */
    private boolean f64468Q = true;

    /* JADX INFO: renamed from: R */
    private boolean f64469R = true;

    /* JADX INFO: renamed from: S */
    private float f64470S = 1.0f;

    /* JADX INFO: renamed from: T */
    private final C3187b0 f64471T = new C3187b0();

    /* JADX INFO: renamed from: U */
    private final C3187b0 f64472U = new C3187b0();

    /* JADX INFO: renamed from: V */
    private final C3187b0 f64473V = new C3187b0();

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.viewmodel.UGCImmVideoDetailViewModel$a */
    public static final class C20333a {
        private C20333a() {
        }

        public /* synthetic */ C20333a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UGCImmVideoDetailViewModel() {
        C3187b0 c3187b0 = new C3187b0();
        this.f64474W = c3187b0;
        this.f64475X = c3187b0;
        C3187b0 c3187b1 = new C3187b0();
        this.f64476Y = c3187b1;
        this.f64477Z = c3187b1;
        this.f64478a0 = new C3187b0();
        C3187b0 c3187b2 = new C3187b0();
        this.f64479b0 = c3187b2;
        this.f64480c0 = c3187b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final InterfaceC28667a m84167F() {
        return (InterfaceC28667a) this.f64462K.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public final void m84168F0(boolean z11, UGCVideoList uGCVideoList, int i11, boolean z12, Pager pager) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UGCImmVideoDetailViewModel$fetchPlayInfoList$1(this, uGCVideoList, i11, z11, z12, pager, null), 3, null);
    }

    /* JADX INFO: renamed from: G0 */
    static /* synthetic */ void m84169G0(UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel, boolean z11, UGCVideoList uGCVideoList, int i11, boolean z12, Pager pager, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = -1;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            z12 = true;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            pager = null;
        }
        uGCImmVideoDetailViewModel.m84168F0(z11, uGCVideoList, i13, z13, pager);
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m84170Q0(UGCImmVideoDetailViewModel uGCImmVideoDetailViewModel, String str, int i11, int i12, boolean z11, boolean z12, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z12 = false;
        }
        uGCImmVideoDetailViewModel.m84195P0(str, i11, i12, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a1 */
    public final Object m84171a1(UGCVideo uGCVideo, UGCVideoPlayInfo uGCVideoPlayInfo, Continuation continuation) throws Throwable {
        UGCImmVideoDetailViewModel$onFirstVideoDetailSuccess$1 uGCImmVideoDetailViewModel$onFirstVideoDetailSuccess$1;
        int iIntValue;
        UGCImmVideo uGCImmVideo;
        UGCVideoBelongToCollection belongToCollection;
        String collectionId;
        int i11;
        UGCImmVideo uGCImmVideo2;
        Integer videoNum;
        Integer videoNum2;
        UGCVideoBelongToCollection belongToCollection2;
        UGCVideoBelongToCollection belongToCollection3;
        Integer position;
        Object objM112707constructorimpl;
        if (continuation instanceof UGCImmVideoDetailViewModel$onFirstVideoDetailSuccess$1) {
            uGCImmVideoDetailViewModel$onFirstVideoDetailSuccess$1 = (UGCImmVideoDetailViewModel$onFirstVideoDetailSuccess$1) continuation;
            int i12 = uGCImmVideoDetailViewModel$onFirstVideoDetailSuccess$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                uGCImmVideoDetailViewModel$onFirstVideoDetailSuccess$1.label = i12 - Integer.MIN_VALUE;
            } else {
                uGCImmVideoDetailViewModel$onFirstVideoDetailSuccess$1 = new UGCImmVideoDetailViewModel$onFirstVideoDetailSuccess$1(this, continuation);
            }
        } else {
            uGCImmVideoDetailViewModel$onFirstVideoDetailSuccess$1 = new UGCImmVideoDetailViewModel$onFirstVideoDetailSuccess$1(this, continuation);
        }
        Object obj = uGCImmVideoDetailViewModel$onFirstVideoDetailSuccess$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i13 = uGCImmVideoDetailViewModel$onFirstVideoDetailSuccess$1.label;
        if (i13 == 0) {
            ResultKt.m97107b(obj);
            String collectionId2 = null;
            C26866a.a.m104905r(C26866a.f81698a, "UGCImmVideoDetailViewModel", new String[]{"onFirstVideoDetailSuccess id:" + (uGCVideo != null ? uGCVideo.getUgcVideoId() : null) + ", position:" + (uGCVideo != null ? Boxing.m97634d(uGCVideo.videoUGCPosition()) : null)}, false, 4, null);
            iIntValue = (uGCVideo == null || (belongToCollection3 = uGCVideo.getBelongToCollection()) == null || (position = belongToCollection3.getPosition()) == null) ? -1 : position.intValue();
            uGCImmVideo = new UGCImmVideo(uGCVideo, uGCVideoPlayInfo);
            uGCImmVideo.setDownloadStatus(uGCVideoPlayInfo != null ? uGCVideoPlayInfo.getDownloadStatus() : 0);
            if (uGCVideo != null && (belongToCollection2 = uGCVideo.getBelongToCollection()) != null) {
                collectionId2 = belongToCollection2.getCollectionId();
            }
            uGCImmVideo.setCollectionList(!(collectionId2 == null || collectionId2.length() == 0));
            this.f64479b0.mo14858q(uGCImmVideo);
            if (uGCVideo != null && (belongToCollection = uGCVideo.getBelongToCollection()) != null && (collectionId = belongToCollection.getCollectionId()) != null) {
                UGCVideoBelongToCollection belongToCollection4 = uGCVideo.getBelongToCollection();
                if (((belongToCollection4 == null || (videoNum2 = belongToCollection4.getVideoNum()) == null) ? 0 : videoNum2.intValue()) <= 1) {
                    C3187b0 c3187b0 = this.f64474W;
                    UGCVideoBelongToCollection belongToCollection5 = uGCVideo.getBelongToCollection();
                    c3187b0.mo14858q(MapsKt.m97578m(TuplesKt.m97108a(collectionId, Boxing.m97634d((belongToCollection5 == null || (videoNum = belongToCollection5.getVideoNum()) == null) ? 1 : videoNum.intValue()))));
                }
                try {
                    Result.Companion companion = Result.INSTANCE;
                    UGCCollectionVideoGroupDao uGCCollectionVideoGroupDaoM84292z = m84292z();
                    String ugcVideoId = uGCVideo.getUgcVideoId();
                    Intrinsics.m97799e(ugcVideoId);
                    List listQ = CollectionsKt.m97511q(ugcVideoId);
                    uGCImmVideoDetailViewModel$onFirstVideoDetailSuccess$1.L$0 = uGCImmVideo;
                    uGCImmVideoDetailViewModel$onFirstVideoDetailSuccess$1.I$0 = iIntValue;
                    uGCImmVideoDetailViewModel$onFirstVideoDetailSuccess$1.label = 1;
                    if (uGCCollectionVideoGroupDaoM84292z.mo64957a(collectionId, listQ, uGCImmVideoDetailViewModel$onFirstVideoDetailSuccess$1) == objF) {
                        return objF;
                    }
                    i11 = iIntValue;
                    uGCImmVideo2 = uGCImmVideo;
                } catch (Throwable th2) {
                    th = th2;
                    i11 = iIntValue;
                    uGCImmVideo2 = uGCImmVideo;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th));
                }
            }
            if (uGCImmVideo.getIsCollectionList() && iIntValue > 0) {
                m84186E0(CollectionsKt.m97511q(uGCImmVideo), true);
            }
            return Unit.f75682a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i11 = uGCImmVideoDetailViewModel$onFirstVideoDetailSuccess$1.I$0;
        uGCImmVideo2 = (UGCImmVideo) uGCImmVideoDetailViewModel$onFirstVideoDetailSuccess$1.L$0;
        try {
            ResultKt.m97107b(obj);
        } catch (Throwable th3) {
            th = th3;
            Result.Companion companion3 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th));
        }
        objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        iIntValue = i11;
        uGCImmVideo = uGCImmVideo2;
        Result.m112706boximpl(objM112707constructorimpl);
        if (uGCImmVideo.getIsCollectionList()) {
            m84186E0(CollectionsKt.m97511q(uGCImmVideo), true);
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final InterfaceC28667a m84181x() {
        return (InterfaceC28667a) C22982c.f70163e.m91553a().m91552h(InterfaceC28667a.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0088 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:14:0x0037, B:31:0x007c, B:34:0x0088, B:36:0x008e, B:38:0x0093, B:40:0x0099, B:43:0x00a0, B:45:0x00a7, B:47:0x00af, B:52:0x00be, B:56:0x00c7, B:59:0x00eb, B:60:0x00f8, B:63:0x0105, B:21:0x004a, B:27:0x0062, B:24:0x0051), top: B:67:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:62:0x0104  */
    /* JADX WARN: Code duplicated, block: B:63:0x0105 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:14:0x0037, B:31:0x007c, B:34:0x0088, B:36:0x008e, B:38:0x0093, B:40:0x0099, B:43:0x00a0, B:45:0x00a7, B:47:0x00af, B:52:0x00be, B:56:0x00c7, B:59:0x00eb, B:60:0x00f8, B:63:0x0105, B:21:0x004a, B:27:0x0062, B:24:0x0051), top: B:67:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: y */
    public final Object m84183y(String str, Continuation continuation) throws Throwable {
        UGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$1 uGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$1;
        DownloadBean downloadBean;
        BaseDto baseDto;
        UGCVideoPlayInfo uGCVideoPlayInfo;
        String path;
        UGCVideoPlayInfo uGCVideoPlayInfo2;
        String resourceId;
        String str2;
        String path2;
        String str3;
        String subtitleIdType;
        int status;
        String str4 = str;
        if (continuation instanceof UGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$1) {
            uGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$1 = (UGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$1) continuation;
            int i11 = uGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                uGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$1.label = i11 - Integer.MIN_VALUE;
            } else {
                uGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$1 = new UGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$1(this, continuation);
            }
        } else {
            uGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$1 = new UGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$1(this, continuation);
        }
        UGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$1 uGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$2 = uGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$1;
        Object objM88567R = uGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$2.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = uGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$2.label;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    str4 = (String) uGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$2.L$0;
                    ResultKt.m97107b(objM88567R);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    downloadBean = (DownloadBean) uGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$2.L$0;
                    ResultKt.m97107b(objM88567R);
                }
                baseDto = (BaseDto) objM88567R;
                uGCVideoPlayInfo = (UGCVideoPlayInfo) baseDto.getData();
                if (uGCVideoPlayInfo != null) {
                    if (downloadBean != null) {
                        status = downloadBean.getStatus();
                    } else {
                        status = 0;
                    }
                    uGCVideoPlayInfo.setDownloadStatus(status);
                }
                if (downloadBean != null && (path = downloadBean.getPath()) != null && path.length() != 0 && downloadBean.getStatus() == 5 && (uGCVideoPlayInfo2 = (UGCVideoPlayInfo) baseDto.getData()) != null) {
                    resourceId = downloadBean.getResourceId();
                    if (resourceId == null) {
                        str2 = "";
                    } else {
                        str2 = resourceId;
                    }
                    path2 = downloadBean.getPath();
                    if (path2 == null) {
                        str3 = "";
                    } else {
                        str3 = path2;
                    }
                    String strValueOf = String.valueOf(downloadBean.getResolution());
                    String strValueOf2 = String.valueOf(downloadBean.getSize());
                    String strValueOf3 = String.valueOf(downloadBean.getDuration());
                    subtitleIdType = downloadBean.getSubtitleIdType();
                    if (subtitleIdType == null) {
                        subtitleIdType = "ResourceId";
                    }
                    uGCVideoPlayInfo2.setResources(CollectionsKt.m97499e(new UGCVideoPlayStream("Mp4", str2, str3, strValueOf, strValueOf2, strValueOf3, "", "", subtitleIdType)));
                }
                if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
                    return (UGCVideoPlayInfo) baseDto.getData();
                }
                return null;
            }
            ResultKt.m97107b(objM88567R);
            DownloadEsHelper downloadEsHelperM88598a = DownloadEsHelper.f67591m.m88598a();
            uGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$2.L$0 = str4;
            uGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$2.label = 1;
            objM88567R = downloadEsHelperM88598a.m88567R(str4, uGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$2);
            if (objM88567R == objF) {
                return objF;
            }
            DownloadBean downloadBean2 = (DownloadBean) objM88567R;
            InterfaceC28667a interfaceC28667aM84167F = m84167F();
            uGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$2.L$0 = downloadBean2;
            uGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$2.label = 2;
            Object objM110476i = InterfaceC28667a.a.m110476i(interfaceC28667aM84167F, str4, null, uGCImmVideoDetailViewModel$fetchVideoPlayInfoInternal$2, 2, null);
            if (objM110476i == objF) {
                return objF;
            }
            objM88567R = objM110476i;
            downloadBean = downloadBean2;
            baseDto = (BaseDto) objM88567R;
            uGCVideoPlayInfo = (UGCVideoPlayInfo) baseDto.getData();
            if (uGCVideoPlayInfo != null) {
                if (downloadBean != null) {
                    status = downloadBean.getStatus();
                } else {
                    status = 0;
                }
                uGCVideoPlayInfo.setDownloadStatus(status);
            }
            if (downloadBean != null) {
                resourceId = downloadBean.getResourceId();
                if (resourceId == null) {
                    str2 = "";
                } else {
                    str2 = resourceId;
                }
                path2 = downloadBean.getPath();
                if (path2 == null) {
                    str3 = "";
                } else {
                    str3 = path2;
                }
                String strValueOf4 = String.valueOf(downloadBean.getResolution());
                String strValueOf5 = String.valueOf(downloadBean.getSize());
                String strValueOf6 = String.valueOf(downloadBean.getDuration());
                subtitleIdType = downloadBean.getSubtitleIdType();
                if (subtitleIdType == null) {
                    subtitleIdType = "ResourceId";
                }
                uGCVideoPlayInfo2.setResources(CollectionsKt.m97499e(new UGCVideoPlayStream("Mp4", str2, str3, strValueOf4, strValueOf5, strValueOf6, "", "", subtitleIdType)));
            }
            if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
                return null;
            }
            return (UGCVideoPlayInfo) baseDto.getData();
        } catch (Throwable th2) {
            C26866a.a.m104901l(C26866a.f81698a, "UGCImmVideoDetailViewModel", "fetchVideoPlayInfoInternal error:" + th2, false, 4, null);
            return null;
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m84186E0(List list, boolean z11) {
        String ugcVideoId;
        String ugcVideoId2;
        String ugcVideoId3;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        Iterable<UGCImmVideo> arrayList = (List) this.f64478a0.m14847f();
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (UGCImmVideo uGCImmVideo : arrayList) {
            UGCVideo ugcVideo = uGCImmVideo.getUgcVideo();
            if (ugcVideo != null && (ugcVideoId3 = ugcVideo.getUgcVideoId()) != null) {
                linkedHashMap.put(ugcVideoId3, uGCImmVideo);
            }
        }
        if (z11) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UGCImmVideo uGCImmVideo2 = (UGCImmVideo) it.next();
                UGCVideo ugcVideo2 = uGCImmVideo2.getUgcVideo();
                if (ugcVideo2 != null && (ugcVideoId2 = ugcVideo2.getUgcVideoId()) != null) {
                    linkedHashMap.put(ugcVideoId2, uGCImmVideo2);
                }
            }
        } else {
            for (UGCImmVideo uGCImmVideo3 : CollectionsKt.m97540U(list)) {
                UGCVideo ugcVideo3 = uGCImmVideo3.getUgcVideo();
                if (ugcVideo3 != null && (ugcVideoId = ugcVideo3.getUgcVideoId()) != null && !linkedHashMap.containsKey(ugcVideoId)) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put(ugcVideoId, uGCImmVideo3);
                    linkedHashMap2.putAll(linkedHashMap);
                    linkedHashMap.clear();
                    linkedHashMap.putAll(linkedHashMap2);
                }
            }
        }
        C3187b0 c3187b0 = this.f64478a0;
        Collection collectionValues = linkedHashMap.values();
        Intrinsics.m97801g(collectionValues, "<get-values>(...)");
        c3187b0.mo14858q(CollectionsKt.m97343U0(collectionValues));
    }

    /* JADX INFO: renamed from: H0 */
    public final C3187b0 m84187H0() {
        return this.f64478a0;
    }

    /* JADX INFO: renamed from: I0 */
    public final LiveData m84188I0() {
        return this.f64480c0;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m84189J0(String ugcVideoId, String str) {
        Intrinsics.m97802h(ugcVideoId, "ugcVideoId");
        C26866a.a.m104905r(C26866a.f81698a, "UGCImmVideoDetailViewModel", new String[]{"getFirstVideoDetail--getFirstVideoDetail id:" + ugcVideoId + ",collectionId:" + str}, false, 4, null);
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UGCImmVideoDetailViewModel$getFirstVideoDetail$1(this, ugcVideoId, str, null), 3, null);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m84190K0(String subjectId) {
        Intrinsics.m97802h(subjectId, "subjectId");
        C26866a.a.m104905r(C26866a.f81698a, "UGCImmVideoDetailViewModel", new String[]{"getFirstVideoDetailBySubject id:" + subjectId}, false, 4, null);
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UGCImmVideoDetailViewModel$getFirstVideoDetailBySubject$1(this, subjectId, null), 3, null);
    }

    /* JADX INFO: renamed from: L0 */
    public final C3187b0 m84191L0() {
        return this.f64472U;
    }

    /* JADX INFO: renamed from: M0 */
    public final C3187b0 m84192M0() {
        return this.f64473V;
    }

    /* JADX INFO: renamed from: N0 */
    public final LiveData m84193N0() {
        return this.f64475X;
    }

    /* JADX INFO: renamed from: O0 */
    public final C3187b0 m84194O0() {
        return this.f64471T;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m84195P0(String collectionId, int i11, int i12, boolean z11, boolean z12) {
        Intrinsics.m97802h(collectionId, "collectionId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UGCImmVideoDetailViewModel$getImmVideoList$1(this, collectionId, i11, i12, z11, z12, null), 3, null);
    }

    /* JADX INFO: renamed from: R0 */
    public final LiveData m84196R0() {
        return this.f64477Z;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m84197S0(boolean z11, String str) {
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UGCImmVideoDetailViewModel$getImmVideoRecommentList$1(z11, this, str, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T0 */
    public final void m84198T0(String ugcVideoId, String str) {
        Intrinsics.m97802h(ugcVideoId, "ugcVideoId");
        C26866a.a.m104905r(C26866a.f81698a, "UGCImmVideoDetailViewModel", new String[]{"getLocalDataWithoutNet id:" + ugcVideoId + ",collectionId:" + str}, false, 4, null);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = ugcVideoId;
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UGCImmVideoDetailViewModel$getLocalDataWithoutNet$1(str, this, ugcVideoId, objectRef, null), 3, null);
    }

    /* JADX INFO: renamed from: U0 */
    public final boolean m84199U0() {
        return this.f64468Q;
    }

    /* JADX INFO: renamed from: V0 */
    public final String m84200V0() {
        return this.f64461J;
    }

    /* JADX INFO: renamed from: W0 */
    public final String m84201W0() {
        return this.f64467P;
    }

    /* JADX INFO: renamed from: X0 */
    public final float m84202X0() {
        return this.f64470S;
    }

    /* JADX INFO: renamed from: Y0 */
    public final boolean m84203Y0() {
        return this.f64469R;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m84204Z0(String ugcVideoId, boolean z11) {
        Intrinsics.m97802h(ugcVideoId, "ugcVideoId");
        AbstractC25136k.m99058d(AbstractC3225u0.m14967a(this), null, null, new UGCImmVideoDetailViewModel$loadImmHistory$1(this, ugcVideoId, z11, null), 3, null);
    }

    /* JADX INFO: renamed from: b1 */
    public final void m84205b1(boolean z11) {
        this.f64469R = z11;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m84206c1(boolean z11) {
        this.f64468Q = z11;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m84207d1(String str) {
        this.f64467P = str;
    }

    /* JADX INFO: renamed from: e1 */
    public final void m84208e1(float f11) {
        this.f64470S = f11;
    }

    /* JADX INFO: renamed from: f1 */
    public final void m84209f1(UGCImmVideo uGCImmVideo, long j11, long j12) {
        AbstractC25136k.m99058d(AbstractC25153o0.m99079a(C25220y0.m99268b()), null, null, new UGCImmVideoDetailViewModel$updateHistory$1(uGCImmVideo, j12, j11, this, null), 3, null);
    }
}
