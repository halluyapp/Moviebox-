package com.transsion.player.longvideo.p302ui;

import ck.C5118o;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayBean;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayDao;
import com.transsion.baselib.utils.PlayMode;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.ugcvideodetail.api.bean.UGCVideoCategory;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import p553ko.C24715a;
import p665oy.C26750e;
import p665oy.C26752g;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.player.longvideo.ui.LongVodPlayerView$saveUGCVideoHistory$1", m97637f = "LongVodPlayerView.kt", m97638l = {2742, 2780, 2786}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class LongVodPlayerView$saveUGCVideoHistory$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LongVodPlayerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LongVodPlayerView$saveUGCVideoHistory$1(LongVodPlayerView longVodPlayerView, Continuation<? super LongVodPlayerView$saveUGCVideoHistory$1> continuation) {
        super(2, continuation);
        this.this$0 = longVodPlayerView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LongVodPlayerView$saveUGCVideoHistory$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LongVodPlayerView$saveUGCVideoHistory$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019a  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:131:0x0204  */
    /* JADX WARN: Code duplicated, block: B:139:0x0221  */
    /* JADX WARN: Code duplicated, block: B:142:0x022b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0232  */
    /* JADX WARN: Code duplicated, block: B:146:0x0248  */
    /* JADX WARN: Code duplicated, block: B:149:0x02cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:150:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:153:0x0329 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:154:0x032a  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:66:0x0110  */
    /* JADX WARN: Code duplicated, block: B:67:0x011c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0136  */
    /* JADX WARN: Code duplicated, block: B:78:0x013e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0157  */
    /* JADX WARN: Code duplicated, block: B:85:0x015e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0168  */
    /* JADX WARN: Code duplicated, block: B:89:0x016f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0179  */
    /* JADX WARN: Code duplicated, block: B:93:0x0180  */
    /* JADX WARN: Instruction removed from duplicated block: B:151:0x02d3, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String ugcVideoId;
        DownloadBean downloadBeanM97048d;
        String ugcVideoCollectionId;
        DownloadBean downloadBeanM97048d2;
        Object objMo64966c;
        String str;
        String str2;
        UGCVideo uGCVideoM97065u;
        UGCVideoBelongToCollection belongToCollection;
        UGCVideo uGCVideoM97065u2;
        int i11;
        int iIntValue;
        DownloadBean downloadBeanM97048d3;
        UGCVideoDetailPlayDao ugcVideoDetailPlayDao;
        long jCurrentTimeMillis;
        long j11;
        String str3;
        String str4;
        String str5;
        String str6;
        C24715a c24715a;
        Long lM97635e;
        C24715a c24715a2;
        C24715a c24715a3;
        String str7;
        DownloadBean downloadBeanM97048d4;
        C24715a c24715a4;
        String strM97047c;
        C24715a c24715a5;
        String strM97063s;
        C24715a c24715a6;
        String strM97046b;
        C24715a c24715a7;
        C24715a c24715a8;
        String str8;
        DownloadBean downloadBeanM97048d5;
        C24715a c24715a9;
        Integer id2;
        C24715a c24715a10;
        Integer id3;
        C24715a c24715a11;
        Integer id4;
        C24715a c24715a12;
        Integer id5;
        C24715a c24715a13;
        boolean zM97051g;
        UGCVideoDetailPlayBean uGCVideoDetailPlayBean;
        UGCVideoDetailPlayDao ugcVideoDetailPlayDao2;
        UGCVideo uGCVideoM97065u3;
        UGCVideoCategory cateLev4;
        UGCVideo uGCVideoM97065u4;
        UGCVideoCategory cateLev3;
        UGCVideo uGCVideoM97065u5;
        UGCVideoCategory cateLev2;
        UGCVideo uGCVideoM97065u6;
        UGCVideoCategory cateLev1;
        UGCVideo uGCVideoM97065u7;
        UGCVideo uGCVideoM97065u8;
        UGCVideo uGCVideoM97065u9;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = this.label;
        if (i12 != 0) {
            if (i12 == 1) {
                String str9 = (String) this.L$1;
                String str10 = (String) this.L$0;
                ResultKt.m97107b(obj);
                objMo64966c = obj;
                str2 = str9;
                str = str10;
            } else {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str6 = (String) this.L$1;
                str5 = (String) this.L$0;
                ResultKt.m97107b(obj);
            }
            C26750e c26750e = new C26750e(true, false);
            AppScopeVMlProvider appScopeVMlProvider = AppScopeVMlProvider.INSTANCE;
            FlowEventBus flowEventBus = (FlowEventBus) appScopeVMlProvider.getApplicationScopeViewModel(FlowEventBus.class);
            String name = C26750e.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.postEvent(name, c26750e, 0L);
            C26752g c26752g = new C26752g(str5, str6, this.this$0.playProgress);
            FlowEventBus flowEventBus2 = (FlowEventBus) appScopeVMlProvider.getApplicationScopeViewModel(FlowEventBus.class);
            String name2 = C26752g.class.getName();
            Intrinsics.m97801g(name2, "getName(...)");
            flowEventBus2.postEvent(name2, c26752g, 0L);
            return Unit.f75682a;
        }
        ResultKt.m97107b(obj);
        C24715a c24715a14 = this.this$0.curBean;
        if (c24715a14 == null || (uGCVideoM97065u2 = c24715a14.m97065u()) == null || (ugcVideoId = uGCVideoM97065u2.getUgcVideoId()) == null) {
            C24715a c24715a15 = this.this$0.curBean;
            ugcVideoId = (c24715a15 == null || (downloadBeanM97048d = c24715a15.m97048d()) == null) ? null : downloadBeanM97048d.getUgcVideoId();
            if (ugcVideoId == null) {
                return Unit.f75682a;
            }
        }
        C24715a c24715a16 = this.this$0.curBean;
        if (c24715a16 == null || (uGCVideoM97065u = c24715a16.m97065u()) == null || (belongToCollection = uGCVideoM97065u.getBelongToCollection()) == null || (ugcVideoCollectionId = belongToCollection.getCollectionId()) == null) {
            C24715a c24715a17 = this.this$0.curBean;
            ugcVideoCollectionId = (c24715a17 == null || (downloadBeanM97048d2 = c24715a17.m97048d()) == null) ? null : downloadBeanM97048d2.getUgcVideoCollectionId();
        }
        if (ugcVideoCollectionId == null) {
            ugcVideoCollectionId = UGCVideoDetailPlayBean.SINGLE_VIDEO_PREFIX + ugcVideoId;
        }
        UGCVideoDetailPlayDao ugcVideoDetailPlayDao3 = this.this$0.getUgcVideoDetailPlayDao();
        this.L$0 = ugcVideoId;
        this.L$1 = ugcVideoCollectionId;
        this.label = 1;
        objMo64966c = ugcVideoDetailPlayDao3.mo64966c(ugcVideoCollectionId, this);
        if (objMo64966c == objF) {
            return objF;
        }
        str = ugcVideoId;
        str2 = ugcVideoCollectionId;
        UGCVideoDetailPlayBean uGCVideoDetailPlayBean2 = (UGCVideoDetailPlayBean) objMo64966c;
        C24715a c24715a18 = this.this$0.curBean;
        if (c24715a18 == null || (uGCVideoM97065u9 = c24715a18.m97065u()) == null) {
            C24715a c24715a19 = this.this$0.curBean;
            Integer ugcVideoPosition = (c24715a19 == null || (downloadBeanM97048d3 = c24715a19.m97048d()) == null) ? null : downloadBeanM97048d3.getUgcVideoPosition();
            if (ugcVideoPosition != null) {
                iIntValue = ugcVideoPosition.intValue();
            } else {
                i11 = 1;
            }
            if (uGCVideoDetailPlayBean2 == null) {
                long j12 = this.this$0.playProgress;
                long j13 = this.this$0.totalDuration;
                c24715a = this.this$0.curBean;
                if (c24715a != null) {
                    lM97635e = Boxing.m97635e(c24715a.m97058n());
                } else {
                    lM97635e = null;
                }
                c24715a2 = this.this$0.curBean;
                if (c24715a2 != null || (uGCVideoM97065u8 = c24715a2.m97065u()) == null || (name = uGCVideoM97065u8.getTitle()) == null) {
                    c24715a3 = this.this$0.curBean;
                    if (c24715a3 != null || (downloadBeanM97048d4 = c24715a3.m97048d()) == null) {
                        str7 = null;
                    } else {
                        String name3 = downloadBeanM97048d4.getName();
                        str7 = name3;
                    }
                } else {
                    str7 = name3;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                c24715a4 = this.this$0.curBean;
                if (c24715a4 != null) {
                    strM97047c = c24715a4.m97047c();
                } else {
                    strM97047c = null;
                }
                c24715a5 = this.this$0.curBean;
                if (c24715a5 != null) {
                    strM97063s = c24715a5.m97063s();
                } else {
                    strM97063s = null;
                }
                c24715a6 = this.this$0.curBean;
                if (c24715a6 != null) {
                    strM97046b = c24715a6.m97046b();
                } else {
                    strM97046b = null;
                }
                c24715a7 = this.this$0.curBean;
                if (c24715a7 != null || (uGCVideoM97065u7 = c24715a7.m97065u()) == null || (ugcVideoType = uGCVideoM97065u7.getCategory()) == null) {
                    c24715a8 = this.this$0.curBean;
                    if (c24715a8 != null || (downloadBeanM97048d5 = c24715a8.m97048d()) == null) {
                        str8 = null;
                    } else {
                        String ugcVideoType = downloadBeanM97048d5.getUgcVideoType();
                        str8 = ugcVideoType;
                    }
                } else {
                    str8 = ugcVideoType;
                }
                c24715a9 = this.this$0.curBean;
                if (c24715a9 != null || (uGCVideoM97065u6 = c24715a9.m97065u()) == null || (cateLev1 = uGCVideoM97065u6.getCateLev1()) == null) {
                    id2 = null;
                } else {
                    id2 = cateLev1.getId();
                }
                c24715a10 = this.this$0.curBean;
                if (c24715a10 != null || (uGCVideoM97065u5 = c24715a10.m97065u()) == null || (cateLev2 = uGCVideoM97065u5.getCateLev2()) == null) {
                    id3 = null;
                } else {
                    id3 = cateLev2.getId();
                }
                c24715a11 = this.this$0.curBean;
                if (c24715a11 != null || (uGCVideoM97065u4 = c24715a11.m97065u()) == null || (cateLev3 = uGCVideoM97065u4.getCateLev3()) == null) {
                    id4 = null;
                } else {
                    id4 = cateLev3.getId();
                }
                c24715a12 = this.this$0.curBean;
                if (c24715a12 != null || (uGCVideoM97065u3 = c24715a12.m97065u()) == null || (cateLev4 = uGCVideoM97065u3.getCateLev4()) == null) {
                    id5 = null;
                } else {
                    id5 = cateLev4.getId();
                }
                c24715a13 = this.this$0.curBean;
                if (c24715a13 != null) {
                    zM97051g = c24715a13.m97051g();
                } else {
                    zM97051g = false;
                }
                String value = PlayMode.STREAM.getValue();
                boolean z11 = this.this$0.isRewardUnlock;
                C24715a c24715a20 = this.this$0.curBean;
                uGCVideoDetailPlayBean = new UGCVideoDetailPlayBean(str2, str, j12, str7, strM97047c, strM97063s, i11, str8, id2, id3, id4, id5, jCurrentTimeMillis2, null, Boxing.m97635e(j13), lM97635e, strM97046b, null, zM97051g, value, null, null, null, 0L, Boxing.m97635e(0L), Boxing.m97635e(0L), false, z11, false, c24715a20 != null ? c24715a20.m97061q() : null, null, null, null, null, null, C5118o.f17608a.m23944d(), -1063116800, 7, null);
                C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "saveUGCVideoHistory new,collectionId:" + str2 + ", ugcVideoId:" + str + " , progress " + this.this$0.playProgress, false, 4, null);
                ugcVideoDetailPlayDao2 = this.this$0.getUgcVideoDetailPlayDao();
                this.L$0 = str;
                this.L$1 = str2;
                this.label = 2;
                if (ugcVideoDetailPlayDao2.mo64977n(uGCVideoDetailPlayBean, this) == objF) {
                    return objF;
                }
                str5 = str;
                str6 = str2;
            } else {
                C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "saveUGCVideoHistory old,collectionId:" + str2 + ", ugcVideoId:" + str + ", progress " + this.this$0.playProgress, false, 4, null);
                ugcVideoDetailPlayDao = this.this$0.getUgcVideoDetailPlayDao();
                jCurrentTimeMillis = System.currentTimeMillis();
                j11 = this.this$0.playProgress;
                this.L$0 = str;
                this.L$1 = str2;
                this.label = 3;
                str3 = str;
                str4 = str2;
                if (ugcVideoDetailPlayDao.mo64968e(str2, str, jCurrentTimeMillis, j11, i11, this) == objF) {
                    return objF;
                }
                str5 = str3;
                str6 = str4;
            }
            C26750e c26750e2 = new C26750e(true, false);
            AppScopeVMlProvider appScopeVMlProvider2 = AppScopeVMlProvider.INSTANCE;
            FlowEventBus flowEventBus3 = (FlowEventBus) appScopeVMlProvider2.getApplicationScopeViewModel(FlowEventBus.class);
            String name4 = C26750e.class.getName();
            Intrinsics.m97801g(name4, "getName(...)");
            flowEventBus3.postEvent(name4, c26750e2, 0L);
            C26752g c26752g2 = new C26752g(str5, str6, this.this$0.playProgress);
            FlowEventBus flowEventBus4 = (FlowEventBus) appScopeVMlProvider2.getApplicationScopeViewModel(FlowEventBus.class);
            String name5 = C26752g.class.getName();
            Intrinsics.m97801g(name5, "getName(...)");
            flowEventBus4.postEvent(name5, c26752g2, 0L);
            return Unit.f75682a;
        }
        iIntValue = uGCVideoM97065u9.videoUGCPosition();
        i11 = iIntValue;
        if (uGCVideoDetailPlayBean2 == null) {
            long j14 = this.this$0.playProgress;
            long j15 = this.this$0.totalDuration;
            c24715a = this.this$0.curBean;
            if (c24715a != null) {
                lM97635e = Boxing.m97635e(c24715a.m97058n());
            } else {
                lM97635e = null;
            }
            c24715a2 = this.this$0.curBean;
            if (c24715a2 != null) {
                c24715a3 = this.this$0.curBean;
                if (c24715a3 != null) {
                }
                str7 = null;
            } else {
                c24715a3 = this.this$0.curBean;
                if (c24715a3 != null) {
                }
                str7 = null;
            }
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            c24715a4 = this.this$0.curBean;
            if (c24715a4 != null) {
                strM97047c = c24715a4.m97047c();
            } else {
                strM97047c = null;
            }
            c24715a5 = this.this$0.curBean;
            if (c24715a5 != null) {
                strM97063s = c24715a5.m97063s();
            } else {
                strM97063s = null;
            }
            c24715a6 = this.this$0.curBean;
            if (c24715a6 != null) {
                strM97046b = c24715a6.m97046b();
            } else {
                strM97046b = null;
            }
            c24715a7 = this.this$0.curBean;
            if (c24715a7 != null) {
                c24715a8 = this.this$0.curBean;
                if (c24715a8 != null) {
                }
                str8 = null;
            } else {
                c24715a8 = this.this$0.curBean;
                if (c24715a8 != null) {
                }
                str8 = null;
            }
            c24715a9 = this.this$0.curBean;
            if (c24715a9 != null) {
                id2 = null;
            } else {
                id2 = null;
            }
            c24715a10 = this.this$0.curBean;
            if (c24715a10 != null) {
                id3 = null;
            } else {
                id3 = null;
            }
            c24715a11 = this.this$0.curBean;
            if (c24715a11 != null) {
                id4 = null;
            } else {
                id4 = null;
            }
            c24715a12 = this.this$0.curBean;
            if (c24715a12 != null) {
                id5 = null;
            } else {
                id5 = null;
            }
            c24715a13 = this.this$0.curBean;
            if (c24715a13 != null) {
                zM97051g = c24715a13.m97051g();
            } else {
                zM97051g = false;
            }
            String value2 = PlayMode.STREAM.getValue();
            boolean z12 = this.this$0.isRewardUnlock;
            C24715a c24715a21 = this.this$0.curBean;
            if (c24715a21 != null) {
            }
            uGCVideoDetailPlayBean = new UGCVideoDetailPlayBean(str2, str, j14, str7, strM97047c, strM97063s, i11, str8, id2, id3, id4, id5, jCurrentTimeMillis3, null, Boxing.m97635e(j15), lM97635e, strM97046b, null, zM97051g, value2, null, null, null, 0L, Boxing.m97635e(0L), Boxing.m97635e(0L), false, z12, false, c24715a21 != null ? c24715a21.m97061q() : null, null, null, null, null, null, C5118o.f17608a.m23944d(), -1063116800, 7, null);
            C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "saveUGCVideoHistory new,collectionId:" + str2 + ", ugcVideoId:" + str + " , progress " + this.this$0.playProgress, false, 4, null);
            ugcVideoDetailPlayDao2 = this.this$0.getUgcVideoDetailPlayDao();
            this.L$0 = str;
            this.L$1 = str2;
            this.label = 2;
            if (ugcVideoDetailPlayDao2.mo64977n(uGCVideoDetailPlayBean, this) == objF) {
                return objF;
            }
            str5 = str;
            str6 = str2;
        } else {
            C26866a.a.m104898f(C26866a.f81698a, LongVodPlayerView.TAG, "saveUGCVideoHistory old,collectionId:" + str2 + ", ugcVideoId:" + str + ", progress " + this.this$0.playProgress, false, 4, null);
            ugcVideoDetailPlayDao = this.this$0.getUgcVideoDetailPlayDao();
            jCurrentTimeMillis = System.currentTimeMillis();
            j11 = this.this$0.playProgress;
            this.L$0 = str;
            this.L$1 = str2;
            this.label = 3;
            str3 = str;
            str4 = str2;
            if (ugcVideoDetailPlayDao.mo64968e(str2, str, jCurrentTimeMillis, j11, i11, this) == objF) {
                return objF;
            }
            str5 = str3;
            str6 = str4;
        }
        C26750e c26750e3 = new C26750e(true, false);
        AppScopeVMlProvider appScopeVMlProvider3 = AppScopeVMlProvider.INSTANCE;
        FlowEventBus flowEventBus5 = (FlowEventBus) appScopeVMlProvider3.getApplicationScopeViewModel(FlowEventBus.class);
        String name6 = C26750e.class.getName();
        Intrinsics.m97801g(name6, "getName(...)");
        flowEventBus5.postEvent(name6, c26750e3, 0L);
        C26752g c26752g3 = new C26752g(str5, str6, this.this$0.playProgress);
        FlowEventBus flowEventBus6 = (FlowEventBus) appScopeVMlProvider3.getApplicationScopeViewModel(FlowEventBus.class);
        String name7 = C26752g.class.getName();
        Intrinsics.m97801g(name7, "getName(...)");
        flowEventBus6.postEvent(name7, c26752g3, 0L);
        return Unit.f75682a;
    }
}
