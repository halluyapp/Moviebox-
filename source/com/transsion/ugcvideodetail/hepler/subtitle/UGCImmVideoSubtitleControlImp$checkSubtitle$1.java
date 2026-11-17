package com.transsion.ugcvideodetail.hepler.subtitle;

import android.app.Application;
import androidx.p1004lifecycle.C3187b0;
import com.blankj.utilcode.util.Utils;
import com.transsion.baselib.p291db.AppDatabase;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.video.UGCCollectionVideoGroupDao;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayBean;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayDao;
import com.transsion.ugcvideodetail.api.bean.UGCImmVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideo;
import com.transsion.ugcvideodetail.api.bean.UGCVideoBelongToCollection;
import com.transsion.ugcvideodetail.api.bean.UGCVideoPlayStream;
import com.transsion.ugcvideodetail.hepler.subtitle.manager.InterfaceC20331b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p528ju.C24469a;
import p743rh.C27287m;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.ugcvideodetail.hepler.subtitle.UGCImmVideoSubtitleControlImp$checkSubtitle$1", m97637f = "UGCImmVideoSubtitleControlImp.kt", m97638l = {170, 171, 172, 177, 182}, m97639m = "invokeSuspend")
final class UGCImmVideoSubtitleControlImp$checkSubtitle$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ UGCImmVideoSubtitleControlImp this$0;

    /* JADX INFO: renamed from: com.transsion.ugcvideodetail.hepler.subtitle.UGCImmVideoSubtitleControlImp$checkSubtitle$1$1 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.ugcvideodetail.hepler.subtitle.UGCImmVideoSubtitleControlImp$checkSubtitle$1$1", m97637f = "UGCImmVideoSubtitleControlImp.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C203221 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ UGCVideoDetailPlayBean $history;
        final /* synthetic */ List<C24469a> $list;
        int label;
        final /* synthetic */ UGCImmVideoSubtitleControlImp this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C203221(List<C24469a> list, UGCImmVideoSubtitleControlImp uGCImmVideoSubtitleControlImp, UGCVideoDetailPlayBean uGCVideoDetailPlayBean, Continuation<? super C203221> continuation) {
            super(2, continuation);
            this.$list = list;
            this.this$0 = uGCImmVideoSubtitleControlImp;
            this.$history = uGCVideoDetailPlayBean;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C203221(this.$list, this.this$0, this.$history, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C203221) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String url;
            UGCVideo ugcVideo;
            UGCVideo ugcVideo2;
            UGCVideo ugcVideo3;
            UGCVideoBelongToCollection belongToCollection;
            UGCVideo ugcVideo4;
            UGCVideo ugcVideo5;
            UGCVideoBelongToCollection belongToCollection2;
            UGCVideo ugcVideo6;
            UGCVideo ugcVideo7;
            UGCVideo ugcVideo8;
            UGCVideoBelongToCollection belongToCollection3;
            String size;
            UGCVideo ugcVideo9;
            UGCVideoBelongToCollection belongToCollection4;
            List arrayList;
            C3187b0 c3187b0M84138d;
            C3187b0 c3187b0M84138d2;
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            List<C24469a> list = this.$list;
            if (list != null && !list.isEmpty()) {
                C20324a c20324a = this.this$0.f64425e;
                if (c20324a == null || (c3187b0M84138d2 = c20324a.m84138d()) == null || (arrayList = (List) c3187b0M84138d2.m14847f()) == null) {
                    arrayList = new ArrayList();
                }
                arrayList.clear();
                arrayList.addAll(this.$list);
                C26866a.a.m104899g(C26866a.f81698a, "checkSubtitle setList, size:" + arrayList.size(), false, 2, null);
                C20324a c20324a2 = this.this$0.f64425e;
                if (c20324a2 != null && (c3187b0M84138d = c20324a2.m84138d()) != null) {
                    c3187b0M84138d.mo14858q(arrayList);
                }
                UGCImmVideoSubtitleControlImp uGCImmVideoSubtitleControlImp = this.this$0;
                UGCVideoDetailPlayBean uGCVideoDetailPlayBean = this.$history;
                uGCImmVideoSubtitleControlImp.m84122v(arrayList, uGCVideoDetailPlayBean != null ? uGCVideoDetailPlayBean.getSubtitleSelectId() : null);
            }
            if (C27287m.f83003a.m106330e()) {
                UGCVideoPlayStream uGCVideoPlayStream = this.this$0.f64427g;
                if (uGCVideoPlayStream == null || (url = uGCVideoPlayStream.getUrl()) == null) {
                    url = "";
                }
                String str = url;
                UGCVideoPlayStream uGCVideoPlayStream2 = this.this$0.f64427g;
                String id2 = uGCVideoPlayStream2 != null ? uGCVideoPlayStream2.getId() : null;
                UGCImmVideo uGCImmVideo = this.this$0.f64426f;
                String collectionName = (uGCImmVideo == null || (ugcVideo9 = uGCImmVideo.getUgcVideo()) == null || (belongToCollection4 = ugcVideo9.getBelongToCollection()) == null) ? null : belongToCollection4.getCollectionName();
                UGCVideoPlayStream uGCVideoPlayStream3 = this.this$0.f64427g;
                Long lX = (uGCVideoPlayStream3 == null || (size = uGCVideoPlayStream3.getSize()) == null) ? null : StringsKt.m98218x(size);
                UGCImmVideo uGCImmVideo2 = this.this$0.f64426f;
                String collectionName2 = (uGCImmVideo2 == null || (ugcVideo8 = uGCImmVideo2.getUgcVideo()) == null || (belongToCollection3 = ugcVideo8.getBelongToCollection()) == null) ? null : belongToCollection3.getCollectionName();
                String str2 = this.this$0.f64422b;
                UGCVideoPlayStream uGCVideoPlayStream4 = this.this$0.f64427g;
                String idType = uGCVideoPlayStream4 != null ? uGCVideoPlayStream4.getIdType() : null;
                UGCImmVideo uGCImmVideo3 = this.this$0.f64426f;
                String ugcVideoId = (uGCImmVideo3 == null || (ugcVideo7 = uGCImmVideo3.getUgcVideo()) == null) ? null : ugcVideo7.getUgcVideoId();
                UGCImmVideo uGCImmVideo4 = this.this$0.f64426f;
                Integer numM97634d = (uGCImmVideo4 == null || (ugcVideo6 = uGCImmVideo4.getUgcVideo()) == null) ? null : Boxing.m97634d(ugcVideo6.videoUGCPosition());
                UGCImmVideo uGCImmVideo5 = this.this$0.f64426f;
                String collectionId = (uGCImmVideo5 == null || (ugcVideo5 = uGCImmVideo5.getUgcVideo()) == null || (belongToCollection2 = ugcVideo5.getBelongToCollection()) == null) ? null : belongToCollection2.getCollectionId();
                UGCImmVideo uGCImmVideo6 = this.this$0.f64426f;
                String title = (uGCImmVideo6 == null || (ugcVideo4 = uGCImmVideo6.getUgcVideo()) == null) ? null : ugcVideo4.getTitle();
                UGCImmVideo uGCImmVideo7 = this.this$0.f64426f;
                String collectionName3 = (uGCImmVideo7 == null || (ugcVideo3 = uGCImmVideo7.getUgcVideo()) == null || (belongToCollection = ugcVideo3.getBelongToCollection()) == null) ? null : belongToCollection.getCollectionName();
                UGCImmVideo uGCImmVideo8 = this.this$0.f64426f;
                String category = (uGCImmVideo8 == null || (ugcVideo2 = uGCImmVideo8.getUgcVideo()) == null) ? null : ugcVideo2.getCategory();
                UGCImmVideo uGCImmVideo9 = this.this$0.f64426f;
                InterfaceC20331b.b.m84162a(InterfaceC20331b.f64452a.m84160b(), new DownloadBean(str, id2, collectionName, "", lX, null, null, null, null, null, 0L, 0, 0, 0, 0L, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", str2, null, collectionName2, 0L, 0, 0, null, null, 0L, null, null, 0L, 0, 0L, null, 0, null, null, false, false, 0, null, null, null, null, (uGCImmVideo9 == null || (ugcVideo = uGCImmVideo9.getUgcVideo()) == null) ? null : ugcVideo.getOps(), null, null, null, null, null, null, null, null, idType, collectionId, ugcVideoId, title, collectionName3, numM97634d, category, null, null, null, null, null, null, null, null, false, null, null, -1477181472, 1071644671, 65504, null), null, 2, null);
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UGCImmVideoSubtitleControlImp$checkSubtitle$1(UGCImmVideoSubtitleControlImp uGCImmVideoSubtitleControlImp, Continuation<? super UGCImmVideoSubtitleControlImp$checkSubtitle$1> continuation) {
        super(2, continuation);
        this.this$0 = uGCImmVideoSubtitleControlImp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCImmVideoSubtitleControlImp$checkSubtitle$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((UGCImmVideoSubtitleControlImp$checkSubtitle$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0130 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        UGCVideoDetailPlayBean uGCVideoDetailPlayBean;
        UGCVideo ugcVideo;
        String ugcVideoId;
        AppDatabase appDatabase;
        String str;
        UGCVideoDetailPlayBean uGCVideoDetailPlayBean2;
        String str2;
        List list;
        List list2;
        Integer numM97634d;
        AbstractC24917a2 abstractC24917a2M99269c;
        C203221 c203221;
        Function1 function1;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            AppDatabase.Companion companion = AppDatabase.INSTANCE;
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            AppDatabase appDatabaseM64881b = companion.m64881b(applicationM27275a);
            UGCImmVideo uGCImmVideo = this.this$0.f64426f;
            if (uGCImmVideo == null || (ugcVideo = uGCImmVideo.getUgcVideo()) == null || (ugcVideoId = ugcVideo.getUgcVideoId()) == null) {
                uGCVideoDetailPlayBean = null;
            } else {
                UGCVideoDetailPlayDao uGCVideoDetailPlayDaoMo64864A1 = appDatabaseM64881b.mo64864A1();
                this.L$0 = appDatabaseM64881b;
                this.L$1 = ugcVideoId;
                this.label = 1;
                Object objMo64981r = uGCVideoDetailPlayDaoMo64864A1.mo64981r(ugcVideoId, this);
                if (objMo64981r == objF) {
                    return objF;
                }
                appDatabase = appDatabaseM64881b;
                obj = objMo64981r;
                str = ugcVideoId;
            }
            InterfaceC20331b interfaceC20331bM84160b = InterfaceC20331b.f64452a.m84160b();
            String strM84133u = this.this$0.m84133u();
            this.L$0 = uGCVideoDetailPlayBean;
            this.L$1 = null;
            this.label = 4;
            obj = interfaceC20331bM84160b.mo84148a(strM84133u, this);
            if (obj == objF) {
                return objF;
            }
            list = (List) obj;
            list2 = list;
            if (list2 != null) {
                function1.invoke(Boxing.m97631a(true));
            }
            C26866a.a aVar = C26866a.f81698a;
            String strM84133u2 = this.this$0.m84133u();
            if (list != null) {
                numM97634d = Boxing.m97634d(list.size());
            } else {
                numM97634d = null;
            }
            C26866a.a.m104899g(aVar, "checkSubtitle subtitleResId:" + strM84133u2 + ",, size:" + numM97634d, false, 2, null);
            abstractC24917a2M99269c = C25220y0.m99269c();
            c203221 = new C203221(list, this.this$0, uGCVideoDetailPlayBean, null);
            this.L$0 = null;
            this.label = 5;
            if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c203221, this) == objF) {
                return objF;
            }
            return Unit.f75682a;
        }
        if (i11 == 1) {
            String str3 = (String) this.L$1;
            AppDatabase appDatabase2 = (AppDatabase) this.L$0;
            ResultKt.m97107b(obj);
            str = str3;
            appDatabase = appDatabase2;
        } else if (i11 == 2) {
            appDatabase = (AppDatabase) this.L$0;
            ResultKt.m97107b(obj);
            str2 = (String) obj;
            if (str2 != null) {
                UGCVideoDetailPlayDao uGCVideoDetailPlayDaoMo64864A2 = appDatabase.mo64864A1();
                this.L$0 = null;
                this.label = 3;
                obj = uGCVideoDetailPlayDaoMo64864A2.mo64966c(str2, this);
                if (obj == objF) {
                    return objF;
                }
                uGCVideoDetailPlayBean2 = (UGCVideoDetailPlayBean) obj;
            } else {
                uGCVideoDetailPlayBean2 = null;
            }
            uGCVideoDetailPlayBean = uGCVideoDetailPlayBean2;
            InterfaceC20331b interfaceC20331bM84160b2 = InterfaceC20331b.f64452a.m84160b();
            String strM84133u3 = this.this$0.m84133u();
            this.L$0 = uGCVideoDetailPlayBean;
            this.L$1 = null;
            this.label = 4;
            obj = interfaceC20331bM84160b2.mo84148a(strM84133u3, this);
            if (obj == objF) {
                return objF;
            }
            list = (List) obj;
            list2 = list;
            if (list2 != null) {
                function1.invoke(Boxing.m97631a(true));
            }
            C26866a.a aVar2 = C26866a.f81698a;
            String strM84133u4 = this.this$0.m84133u();
            if (list != null) {
                numM97634d = Boxing.m97634d(list.size());
            } else {
                numM97634d = null;
            }
            C26866a.a.m104899g(aVar2, "checkSubtitle subtitleResId:" + strM84133u4 + ",, size:" + numM97634d, false, 2, null);
            abstractC24917a2M99269c = C25220y0.m99269c();
            c203221 = new C203221(list, this.this$0, uGCVideoDetailPlayBean, null);
            this.L$0 = null;
            this.label = 5;
            if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c203221, this) == objF) {
                return objF;
            }
        } else if (i11 == 3) {
            ResultKt.m97107b(obj);
            uGCVideoDetailPlayBean2 = (UGCVideoDetailPlayBean) obj;
            uGCVideoDetailPlayBean = uGCVideoDetailPlayBean2;
            InterfaceC20331b interfaceC20331bM84160b3 = InterfaceC20331b.f64452a.m84160b();
            String strM84133u5 = this.this$0.m84133u();
            this.L$0 = uGCVideoDetailPlayBean;
            this.L$1 = null;
            this.label = 4;
            obj = interfaceC20331bM84160b3.mo84148a(strM84133u5, this);
            if (obj == objF) {
                return objF;
            }
            list = (List) obj;
            list2 = list;
            if (list2 != null) {
                function1.invoke(Boxing.m97631a(true));
            }
            C26866a.a aVar3 = C26866a.f81698a;
            String strM84133u6 = this.this$0.m84133u();
            if (list != null) {
                numM97634d = Boxing.m97634d(list.size());
            } else {
                numM97634d = null;
            }
            C26866a.a.m104899g(aVar3, "checkSubtitle subtitleResId:" + strM84133u6 + ",, size:" + numM97634d, false, 2, null);
            abstractC24917a2M99269c = C25220y0.m99269c();
            c203221 = new C203221(list, this.this$0, uGCVideoDetailPlayBean, null);
            this.L$0 = null;
            this.label = 5;
            if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c203221, this) == objF) {
                return objF;
            }
        } else if (i11 == 4) {
            uGCVideoDetailPlayBean = (UGCVideoDetailPlayBean) this.L$0;
            ResultKt.m97107b(obj);
            list = (List) obj;
            list2 = list;
            if (list2 != null && !list2.isEmpty() && (function1 = this.this$0.f64429i) != null) {
                function1.invoke(Boxing.m97631a(true));
            }
            C26866a.a aVar4 = C26866a.f81698a;
            String strM84133u7 = this.this$0.m84133u();
            if (list != null) {
                numM97634d = Boxing.m97634d(list.size());
            } else {
                numM97634d = null;
            }
            C26866a.a.m104899g(aVar4, "checkSubtitle subtitleResId:" + strM84133u7 + ",, size:" + numM97634d, false, 2, null);
            abstractC24917a2M99269c = C25220y0.m99269c();
            c203221 = new C203221(list, this.this$0, uGCVideoDetailPlayBean, null);
            this.L$0 = null;
            this.label = 5;
            if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c203221, this) == objF) {
                return objF;
            }
        } else {
            if (i11 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        return Unit.f75682a;
        uGCVideoDetailPlayBean2 = (UGCVideoDetailPlayBean) obj;
        if (uGCVideoDetailPlayBean2 == null) {
            UGCCollectionVideoGroupDao uGCCollectionVideoGroupDaoMo64879z1 = appDatabase.mo64879z1();
            this.L$0 = appDatabase;
            this.L$1 = null;
            this.label = 2;
            obj = uGCCollectionVideoGroupDaoMo64879z1.mo64959c(str, this);
            if (obj == objF) {
                return objF;
            }
            str2 = (String) obj;
            if (str2 != null) {
                UGCVideoDetailPlayDao uGCVideoDetailPlayDaoMo64864A3 = appDatabase.mo64864A1();
                this.L$0 = null;
                this.label = 3;
                obj = uGCVideoDetailPlayDaoMo64864A3.mo64966c(str2, this);
                if (obj == objF) {
                    return objF;
                }
                uGCVideoDetailPlayBean2 = (UGCVideoDetailPlayBean) obj;
            } else {
                uGCVideoDetailPlayBean2 = null;
            }
        }
        uGCVideoDetailPlayBean = uGCVideoDetailPlayBean2;
        InterfaceC20331b interfaceC20331bM84160b4 = InterfaceC20331b.f64452a.m84160b();
        String strM84133u8 = this.this$0.m84133u();
        this.L$0 = uGCVideoDetailPlayBean;
        this.L$1 = null;
        this.label = 4;
        obj = interfaceC20331bM84160b4.mo84148a(strM84133u8, this);
        if (obj == objF) {
            return objF;
        }
        list = (List) obj;
        list2 = list;
        if (list2 != null) {
            function1.invoke(Boxing.m97631a(true));
        }
        C26866a.a aVar5 = C26866a.f81698a;
        String strM84133u9 = this.this$0.m84133u();
        if (list != null) {
            numM97634d = Boxing.m97634d(list.size());
        } else {
            numM97634d = null;
        }
        C26866a.a.m104899g(aVar5, "checkSubtitle subtitleResId:" + strM84133u9 + ",, size:" + numM97634d, false, 2, null);
        abstractC24917a2M99269c = C25220y0.m99269c();
        c203221 = new C203221(list, this.this$0, uGCVideoDetailPlayBean, null);
        this.L$0 = null;
        this.label = 5;
        if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c203221, this) == objF) {
            return objF;
        }
        return Unit.f75682a;
    }
}
