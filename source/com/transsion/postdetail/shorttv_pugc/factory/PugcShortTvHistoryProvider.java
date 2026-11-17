package com.transsion.postdetail.shorttv_pugc.factory;

import android.app.Application;
import ck.C5118o;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.video.UGCCollectionVideoGroupDao;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayBean;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayDao;
import com.transsion.baselib.utils.PlayMode;
import com.transsion.shorttv_pugc.ShorttvModel;
import com.transsion.shorttv_pugc.bean.Cover;
import com.transsion.shorttv_pugc.bean.ShortTvInnerPlayBean;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import p665oy.C26750e;
import p920xt.InterfaceC28661f;

/* JADX INFO: loaded from: classes6.dex */
public final class PugcShortTvHistoryProvider implements InterfaceC28661f {
    @Override // p920xt.InterfaceC28661f
    /* JADX INFO: renamed from: a */
    public Object mo73794a(String str, List list, Continuation continuation) {
        if (list.isEmpty()) {
            return Unit.f75682a;
        }
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        Object objMo64957a = companion.m64881b(applicationM27275a).mo64879z1().mo64957a(str, list, continuation);
        return objMo64957a == IntrinsicsKt.m97630f() ? objMo64957a : Unit.f75682a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // p920xt.InterfaceC28661f
    /* JADX INFO: renamed from: b */
    public Object mo73795b(ShorttvModel.UGCVideo uGCVideo, long j11, Continuation continuation) throws Throwable {
        PugcShortTvHistoryProvider$saveHistory$1 pugcShortTvHistoryProvider$saveHistory$1;
        String str;
        String str2;
        long j12;
        ShorttvModel.UGCVideo uGCVideo2;
        if (continuation instanceof PugcShortTvHistoryProvider$saveHistory$1) {
            pugcShortTvHistoryProvider$saveHistory$1 = (PugcShortTvHistoryProvider$saveHistory$1) continuation;
            int i11 = pugcShortTvHistoryProvider$saveHistory$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pugcShortTvHistoryProvider$saveHistory$1.label = i11 - Integer.MIN_VALUE;
            } else {
                pugcShortTvHistoryProvider$saveHistory$1 = new PugcShortTvHistoryProvider$saveHistory$1(this, continuation);
            }
        } else {
            pugcShortTvHistoryProvider$saveHistory$1 = new PugcShortTvHistoryProvider$saveHistory$1(this, continuation);
        }
        PugcShortTvHistoryProvider$saveHistory$1 pugcShortTvHistoryProvider$saveHistory$2 = pugcShortTvHistoryProvider$saveHistory$1;
        Object obj = pugcShortTvHistoryProvider$saveHistory$2.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = pugcShortTvHistoryProvider$saveHistory$2.label;
        if (i12 != 0) {
            if (i12 == 1) {
                long j13 = pugcShortTvHistoryProvider$saveHistory$2.J$0;
                String str3 = (String) pugcShortTvHistoryProvider$saveHistory$2.L$2;
                String str4 = (String) pugcShortTvHistoryProvider$saveHistory$2.L$1;
                uGCVideo2 = (ShorttvModel.UGCVideo) pugcShortTvHistoryProvider$saveHistory$2.L$0;
                ResultKt.m97107b(obj);
                str2 = str3;
                j12 = j13;
                str = str4;
            } else {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            C26750e c26750e = new C26750e(true, false);
            FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
            String name = C26750e.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.postEvent(name, c26750e, 0L);
            return Unit.f75682a;
        }
        ResultKt.m97107b(obj);
        String ugcVideoId = uGCVideo.getUgcVideoId();
        ShorttvModel.UGCVideoCollection belongToCollection = uGCVideo.getBelongToCollection();
        String collectionId = belongToCollection != null ? belongToCollection.getCollectionId() : null;
        if (ugcVideoId == null || ugcVideoId.length() == 0 || collectionId == null || collectionId.length() == 0) {
            return Unit.f75682a;
        }
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        UGCVideoDetailPlayDao uGCVideoDetailPlayDaoMo64864A1 = companion.m64881b(applicationM27275a).mo64864A1();
        pugcShortTvHistoryProvider$saveHistory$2.L$0 = uGCVideo;
        pugcShortTvHistoryProvider$saveHistory$2.L$1 = ugcVideoId;
        pugcShortTvHistoryProvider$saveHistory$2.L$2 = collectionId;
        pugcShortTvHistoryProvider$saveHistory$2.J$0 = j11;
        pugcShortTvHistoryProvider$saveHistory$2.label = 1;
        Object objMo64966c = uGCVideoDetailPlayDaoMo64864A1.mo64966c(collectionId, pugcShortTvHistoryProvider$saveHistory$2);
        if (objMo64966c == objF) {
            return objF;
        }
        str = ugcVideoId;
        str2 = collectionId;
        obj = objMo64966c;
        j12 = j11;
        uGCVideo2 = uGCVideo;
        if (((UGCVideoDetailPlayBean) obj) == null) {
            long durationMillis = uGCVideo2.getDurationMillis();
            String title = uGCVideo2.getTitle();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Cover cover = uGCVideo2.getCover();
            String url = cover != null ? cover.getUrl() : null;
            Cover cover2 = uGCVideo2.getCover();
            String thumbnail = cover2 != null ? cover2.getThumbnail() : null;
            UGCVideoDetailPlayBean uGCVideoDetailPlayBean = new UGCVideoDetailPlayBean(str2, str, j12, title, url, thumbnail, uGCVideo2.getEp(), uGCVideo2.getCategory(), null, null, null, null, jCurrentTimeMillis, null, Boxing.m97635e(durationMillis), null, null, null, false, PlayMode.STREAM.getValue(), null, null, null, 0L, null, null, false, false, false, uGCVideo2.getOps(), null, null, null, null, null, C5118o.f17608a.m23944d(), -537415936, 7, null);
            AppDatabase.Companion companion2 = AppDatabase.INSTANCE;
            Application applicationM27275a2 = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a2, "getApp(...)");
            UGCVideoDetailPlayDao uGCVideoDetailPlayDaoMo64864A2 = companion2.m64881b(applicationM27275a2).mo64864A1();
            pugcShortTvHistoryProvider$saveHistory$2.L$0 = null;
            pugcShortTvHistoryProvider$saveHistory$2.L$1 = null;
            pugcShortTvHistoryProvider$saveHistory$2.L$2 = null;
            pugcShortTvHistoryProvider$saveHistory$2.label = 2;
            if (uGCVideoDetailPlayDaoMo64864A2.mo64977n(uGCVideoDetailPlayBean, pugcShortTvHistoryProvider$saveHistory$2) == objF) {
                return objF;
            }
        } else {
            AppDatabase.Companion companion3 = AppDatabase.INSTANCE;
            Application applicationM27275a3 = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a3, "getApp(...)");
            UGCVideoDetailPlayDao uGCVideoDetailPlayDaoMo64864A3 = companion3.m64881b(applicationM27275a3).mo64864A1();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            int ep2 = uGCVideo2.getEp();
            pugcShortTvHistoryProvider$saveHistory$2.L$0 = null;
            pugcShortTvHistoryProvider$saveHistory$2.L$1 = null;
            pugcShortTvHistoryProvider$saveHistory$2.L$2 = null;
            pugcShortTvHistoryProvider$saveHistory$2.label = 3;
            if (uGCVideoDetailPlayDaoMo64864A3.mo64968e(str2, str, jCurrentTimeMillis2, j12, ep2, pugcShortTvHistoryProvider$saveHistory$2) == objF) {
                return objF;
            }
        }
        C26750e c26750e2 = new C26750e(true, false);
        FlowEventBus flowEventBus2 = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
        String name2 = C26750e.class.getName();
        Intrinsics.m97801g(name2, "getName(...)");
        flowEventBus2.postEvent(name2, c26750e2, 0L);
        return Unit.f75682a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // p920xt.InterfaceC28661f
    /* JADX INFO: renamed from: c */
    public Object mo73796c(String str, Continuation continuation) throws Throwable {
        PugcShortTvHistoryProvider$getHistory$1 pugcShortTvHistoryProvider$getHistory$1;
        AppDatabase appDatabaseM64881b;
        Object objMo64981r;
        UGCVideoDetailPlayBean uGCVideoDetailPlayBean;
        AppDatabase appDatabase;
        String str2;
        String str3 = str;
        if (continuation instanceof PugcShortTvHistoryProvider$getHistory$1) {
            pugcShortTvHistoryProvider$getHistory$1 = (PugcShortTvHistoryProvider$getHistory$1) continuation;
            int i11 = pugcShortTvHistoryProvider$getHistory$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pugcShortTvHistoryProvider$getHistory$1.label = i11 - Integer.MIN_VALUE;
            } else {
                pugcShortTvHistoryProvider$getHistory$1 = new PugcShortTvHistoryProvider$getHistory$1(this, continuation);
            }
        } else {
            pugcShortTvHistoryProvider$getHistory$1 = new PugcShortTvHistoryProvider$getHistory$1(this, continuation);
        }
        Object objMo64966c = pugcShortTvHistoryProvider$getHistory$1.result;
        Object objF = IntrinsicsKt.m97630f();
        int i12 = pugcShortTvHistoryProvider$getHistory$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                AppDatabase appDatabase2 = (AppDatabase) pugcShortTvHistoryProvider$getHistory$1.L$1;
                String str4 = (String) pugcShortTvHistoryProvider$getHistory$1.L$0;
                ResultKt.m97107b(objMo64966c);
                appDatabaseM64881b = appDatabase2;
                str3 = str4;
                objMo64981r = objMo64966c;
            } else {
                if (i12 == 2) {
                    appDatabase = (AppDatabase) pugcShortTvHistoryProvider$getHistory$1.L$0;
                    ResultKt.m97107b(objMo64966c);
                    str2 = (String) objMo64966c;
                    if (str2 != null) {
                        UGCVideoDetailPlayDao uGCVideoDetailPlayDaoMo64864A1 = appDatabase.mo64864A1();
                        pugcShortTvHistoryProvider$getHistory$1.L$0 = null;
                        pugcShortTvHistoryProvider$getHistory$1.label = 3;
                        objMo64966c = uGCVideoDetailPlayDaoMo64864A1.mo64966c(str2, pugcShortTvHistoryProvider$getHistory$1);
                        if (objMo64966c == objF) {
                            return objF;
                        }
                    } else {
                        uGCVideoDetailPlayBean = null;
                    }
                    if (uGCVideoDetailPlayBean != null) {
                        return new ShortTvInnerPlayBean(uGCVideoDetailPlayBean.getCollectionId(), uGCVideoDetailPlayBean.getUgcVideoId(), uGCVideoDetailPlayBean.getProgress(), uGCVideoDetailPlayBean.getTitle(), uGCVideoDetailPlayBean.getCoverUrl(), uGCVideoDetailPlayBean.getThumbnail(), uGCVideoDetailPlayBean.getPosition(), uGCVideoDetailPlayBean.getType(), uGCVideoDetailPlayBean.getTimeStamp(), uGCVideoDetailPlayBean.getSubtitleSelectId(), uGCVideoDetailPlayBean.getTotalDuration(), uGCVideoDetailPlayBean.getSubjectDurationSeconds(), uGCVideoDetailPlayBean.getAverageHueLight(), uGCVideoDetailPlayBean.getSubjectType(), uGCVideoDetailPlayBean.getHasDelete(), uGCVideoDetailPlayBean.getDownloadUrl(), uGCVideoDetailPlayBean.getDownloadResid(), uGCVideoDetailPlayBean.getDownloadFilePath(), uGCVideoDetailPlayBean.getDownloadSize(), uGCVideoDetailPlayBean.getLastAdStartTimeStamp(), uGCVideoDetailPlayBean.getLastAdEndTimeStamp(), uGCVideoDetailPlayBean.getRewardPlayed(), uGCVideoDetailPlayBean.getRewardUnlock(), uGCVideoDetailPlayBean.getRewardFree());
                    }
                    return null;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(objMo64966c);
            }
            uGCVideoDetailPlayBean = (UGCVideoDetailPlayBean) objMo64966c;
            if (uGCVideoDetailPlayBean != null) {
                return new ShortTvInnerPlayBean(uGCVideoDetailPlayBean.getCollectionId(), uGCVideoDetailPlayBean.getUgcVideoId(), uGCVideoDetailPlayBean.getProgress(), uGCVideoDetailPlayBean.getTitle(), uGCVideoDetailPlayBean.getCoverUrl(), uGCVideoDetailPlayBean.getThumbnail(), uGCVideoDetailPlayBean.getPosition(), uGCVideoDetailPlayBean.getType(), uGCVideoDetailPlayBean.getTimeStamp(), uGCVideoDetailPlayBean.getSubtitleSelectId(), uGCVideoDetailPlayBean.getTotalDuration(), uGCVideoDetailPlayBean.getSubjectDurationSeconds(), uGCVideoDetailPlayBean.getAverageHueLight(), uGCVideoDetailPlayBean.getSubjectType(), uGCVideoDetailPlayBean.getHasDelete(), uGCVideoDetailPlayBean.getDownloadUrl(), uGCVideoDetailPlayBean.getDownloadResid(), uGCVideoDetailPlayBean.getDownloadFilePath(), uGCVideoDetailPlayBean.getDownloadSize(), uGCVideoDetailPlayBean.getLastAdStartTimeStamp(), uGCVideoDetailPlayBean.getLastAdEndTimeStamp(), uGCVideoDetailPlayBean.getRewardPlayed(), uGCVideoDetailPlayBean.getRewardUnlock(), uGCVideoDetailPlayBean.getRewardFree());
            }
            return null;
        }
        ResultKt.m97107b(objMo64966c);
        if (str3 == null) {
            return null;
        }
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Application applicationM27275a = Utils.m27275a();
        Intrinsics.m97801g(applicationM27275a, "getApp(...)");
        appDatabaseM64881b = companion.m64881b(applicationM27275a);
        UGCVideoDetailPlayDao uGCVideoDetailPlayDaoMo64864A2 = appDatabaseM64881b.mo64864A1();
        pugcShortTvHistoryProvider$getHistory$1.L$0 = str3;
        pugcShortTvHistoryProvider$getHistory$1.L$1 = appDatabaseM64881b;
        pugcShortTvHistoryProvider$getHistory$1.label = 1;
        objMo64981r = uGCVideoDetailPlayDaoMo64864A2.mo64981r(str3, pugcShortTvHistoryProvider$getHistory$1);
        if (objMo64981r == objF) {
            return objF;
        }
        uGCVideoDetailPlayBean = (UGCVideoDetailPlayBean) objMo64981r;
        if (uGCVideoDetailPlayBean == null) {
            UGCCollectionVideoGroupDao uGCCollectionVideoGroupDaoMo64879z1 = appDatabaseM64881b.mo64879z1();
            pugcShortTvHistoryProvider$getHistory$1.L$0 = appDatabaseM64881b;
            pugcShortTvHistoryProvider$getHistory$1.L$1 = null;
            pugcShortTvHistoryProvider$getHistory$1.label = 2;
            Object objMo64959c = uGCCollectionVideoGroupDaoMo64879z1.mo64959c(str3, pugcShortTvHistoryProvider$getHistory$1);
            if (objMo64959c == objF) {
                return objF;
            }
            AppDatabase appDatabase3 = appDatabaseM64881b;
            objMo64966c = objMo64959c;
            appDatabase = appDatabase3;
            str2 = (String) objMo64966c;
            if (str2 != null) {
                UGCVideoDetailPlayDao uGCVideoDetailPlayDaoMo64864A3 = appDatabase.mo64864A1();
                pugcShortTvHistoryProvider$getHistory$1.L$0 = null;
                pugcShortTvHistoryProvider$getHistory$1.label = 3;
                objMo64966c = uGCVideoDetailPlayDaoMo64864A3.mo64966c(str2, pugcShortTvHistoryProvider$getHistory$1);
                if (objMo64966c == objF) {
                    return objF;
                }
                uGCVideoDetailPlayBean = (UGCVideoDetailPlayBean) objMo64966c;
            } else {
                uGCVideoDetailPlayBean = null;
            }
        }
        if (uGCVideoDetailPlayBean != null) {
            return new ShortTvInnerPlayBean(uGCVideoDetailPlayBean.getCollectionId(), uGCVideoDetailPlayBean.getUgcVideoId(), uGCVideoDetailPlayBean.getProgress(), uGCVideoDetailPlayBean.getTitle(), uGCVideoDetailPlayBean.getCoverUrl(), uGCVideoDetailPlayBean.getThumbnail(), uGCVideoDetailPlayBean.getPosition(), uGCVideoDetailPlayBean.getType(), uGCVideoDetailPlayBean.getTimeStamp(), uGCVideoDetailPlayBean.getSubtitleSelectId(), uGCVideoDetailPlayBean.getTotalDuration(), uGCVideoDetailPlayBean.getSubjectDurationSeconds(), uGCVideoDetailPlayBean.getAverageHueLight(), uGCVideoDetailPlayBean.getSubjectType(), uGCVideoDetailPlayBean.getHasDelete(), uGCVideoDetailPlayBean.getDownloadUrl(), uGCVideoDetailPlayBean.getDownloadResid(), uGCVideoDetailPlayBean.getDownloadFilePath(), uGCVideoDetailPlayBean.getDownloadSize(), uGCVideoDetailPlayBean.getLastAdStartTimeStamp(), uGCVideoDetailPlayBean.getLastAdEndTimeStamp(), uGCVideoDetailPlayBean.getRewardPlayed(), uGCVideoDetailPlayBean.getRewardUnlock(), uGCVideoDetailPlayBean.getRewardFree());
        }
        return null;
    }
}
