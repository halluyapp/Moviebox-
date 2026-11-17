package com.transsion.player.longvideo.helper;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.p278ts.PsExtractor;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayBean;
import com.transsion.baselib.p291db.video.UGCVideoDetailPlayDao;
import com.transsion.baselib.p291db.video.VideoDetailPlayBean;
import com.transsion.baselib.p291db.video.VideoDetailPlayDao;
import com.transsion.player.longvideo.p302ui.LongVodPlayerView;
import com.transsion.subtitle.InterfaceC19714h;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AbstractC24917a2;
import kotlinx.coroutines.AbstractC25088i;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p528ju.C24469a;
import p743rh.C27287m;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.player.longvideo.helper.LongVodSubtitleHelper$loadFromDB$1", m97637f = "LongVodSubtitleHelper.kt", m97638l = {186, PsExtractor.PRIVATE_STREAM_1, 193, 201}, m97639m = "invokeSuspend")
final class LongVodSubtitleHelper$loadFromDB$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ DownloadBean $bean;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LongVodSubtitleHelper this$0;

    /* JADX INFO: renamed from: com.transsion.player.longvideo.helper.LongVodSubtitleHelper$loadFromDB$1$3 */
    @Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.player.longvideo.helper.LongVodSubtitleHelper$loadFromDB$1$3", m97637f = "LongVodSubtitleHelper.kt", m97638l = {}, m97639m = "invokeSuspend")
    static final class C164363 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
        final /* synthetic */ DownloadBean $bean;
        final /* synthetic */ List<C24469a> $list;
        int label;
        final /* synthetic */ LongVodSubtitleHelper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C164363(List<C24469a> list, LongVodSubtitleHelper longVodSubtitleHelper, DownloadBean downloadBean, Continuation<? super C164363> continuation) {
            super(2, continuation);
            this.$list = list;
            this.this$0 = longVodSubtitleHelper;
            this.$bean = downloadBean;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C164363(this.$list, this.this$0, this.$bean, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
            return ((C164363) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.m97630f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            List<C24469a> list = this.$list;
            if (list != null && !list.isEmpty()) {
                this.this$0.f55487g.clear();
                this.this$0.f55487g.addAll(this.$list);
                this.this$0.f55488h.m81889f0(this.$list);
            }
            if (C27287m.f83003a.m106330e()) {
                this.this$0.m71727F(this.$bean);
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LongVodSubtitleHelper$loadFromDB$1(DownloadBean downloadBean, LongVodSubtitleHelper longVodSubtitleHelper, Continuation<? super LongVodSubtitleHelper$loadFromDB$1> continuation) {
        super(2, continuation);
        this.$bean = downloadBean;
        this.this$0 = longVodSubtitleHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LongVodSubtitleHelper$loadFromDB$1(this.$bean, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LongVodSubtitleHelper$loadFromDB$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:48:0x0146 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        List list2;
        DownloadBean downloadBean;
        DownloadBean downloadBean2;
        UGCVideoDetailPlayBean uGCVideoDetailPlayBean;
        String subtitleSelectId;
        Integer numM97634d;
        AbstractC24917a2 abstractC24917a2M99269c;
        C164363 c164363;
        VideoDetailPlayBean videoDetailPlayBean;
        String subtitleSelectId2;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.m97107b(obj);
            } else if (i11 == 2) {
                downloadBean2 = (DownloadBean) this.L$1;
                list2 = (List) this.L$0;
                ResultKt.m97107b(obj);
                uGCVideoDetailPlayBean = (UGCVideoDetailPlayBean) obj;
                if (uGCVideoDetailPlayBean != null) {
                    subtitleSelectId = uGCVideoDetailPlayBean.getSubtitleSelectId();
                } else {
                    subtitleSelectId = null;
                }
                downloadBean2.setSubtitleSelectId(subtitleSelectId);
                list = list2;
                this.this$0.f55484d.mo71861f(this.$bean.getSubtitleSelectId());
                C26866a.a aVar = C26866a.f81698a;
                boolean zIsUGCVideo = this.$bean.isUGCVideo();
                String subtitleSelectId3 = this.$bean.getSubtitleSelectId();
                String subjectId = this.$bean.getSubjectId();
                String subtitleResId = this.$bean.getSubtitleResId();
                if (list != null) {
                    numM97634d = Boxing.m97634d(list.size());
                } else {
                    numM97634d = null;
                }
                C26866a.a.m104898f(aVar, LongVodPlayerView.TAG, "loadFromDB ,isUGCVideo:" + zIsUGCVideo + ",subtitleSelectId:" + subtitleSelectId3 + ", subjectId:" + subjectId + ", id:" + subtitleResId + ", size:" + numM97634d, false, 4, null);
                abstractC24917a2M99269c = C25220y0.m99269c();
                c164363 = new C164363(list, this.this$0, this.$bean, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
                if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c164363, this) == objF) {
                    return objF;
                }
            } else if (i11 == 3) {
                downloadBean = (DownloadBean) this.L$1;
                list2 = (List) this.L$0;
                ResultKt.m97107b(obj);
                videoDetailPlayBean = (VideoDetailPlayBean) obj;
                if (videoDetailPlayBean != null) {
                    subtitleSelectId2 = videoDetailPlayBean.getSubtitleSelectId();
                } else {
                    subtitleSelectId2 = null;
                }
                downloadBean.setSubtitleSelectId(subtitleSelectId2);
                list = list2;
                this.this$0.f55484d.mo71861f(this.$bean.getSubtitleSelectId());
                C26866a.a aVar2 = C26866a.f81698a;
                boolean zIsUGCVideo2 = this.$bean.isUGCVideo();
                String subtitleSelectId4 = this.$bean.getSubtitleSelectId();
                String subjectId2 = this.$bean.getSubjectId();
                String subtitleResId2 = this.$bean.getSubtitleResId();
                if (list != null) {
                    numM97634d = Boxing.m97634d(list.size());
                } else {
                    numM97634d = null;
                }
                C26866a.a.m104898f(aVar2, LongVodPlayerView.TAG, "loadFromDB ,isUGCVideo:" + zIsUGCVideo2 + ",subtitleSelectId:" + subtitleSelectId4 + ", subjectId:" + subjectId2 + ", id:" + subtitleResId2 + ", size:" + numM97634d, false, 4, null);
                abstractC24917a2M99269c = C25220y0.m99269c();
                c164363 = new C164363(list, this.this$0, this.$bean, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
                if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c164363, this) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return Unit.f75682a;
        }
        ResultKt.m97107b(obj);
        InterfaceC19714h interfaceC19714hM82148b = InterfaceC19714h.f62935a.m82148b();
        String subtitleResId3 = this.$bean.getSubtitleResId();
        this.label = 1;
        obj = interfaceC19714hM82148b.mo81939a(subtitleResId3, this);
        if (obj == objF) {
            return objF;
        }
        list = (List) obj;
        if (this.$bean.isUGCVideo()) {
            String ugcVideoCollectionId = this.$bean.getUgcVideoCollectionId();
            if (ugcVideoCollectionId != null) {
                DownloadBean downloadBean3 = this.$bean;
                UGCVideoDetailPlayDao uGCVideoDetailPlayDaoM71733N = this.this$0.m71733N();
                this.L$0 = list;
                this.L$1 = downloadBean3;
                this.label = 2;
                Object objMo64966c = uGCVideoDetailPlayDaoM71733N.mo64966c(ugcVideoCollectionId, this);
                if (objMo64966c == objF) {
                    return objF;
                }
                list2 = list;
                obj = objMo64966c;
                downloadBean2 = downloadBean3;
                uGCVideoDetailPlayBean = (UGCVideoDetailPlayBean) obj;
                if (uGCVideoDetailPlayBean != null) {
                    subtitleSelectId = uGCVideoDetailPlayBean.getSubtitleSelectId();
                } else {
                    subtitleSelectId = null;
                }
                downloadBean2.setSubtitleSelectId(subtitleSelectId);
                list = list2;
            }
        } else {
            String subjectId3 = this.$bean.getSubjectId();
            if (subjectId3 != null) {
                DownloadBean downloadBean4 = this.$bean;
                VideoDetailPlayDao videoDetailPlayDaoM71734O = this.this$0.m71734O();
                this.L$0 = list;
                this.L$1 = downloadBean4;
                this.label = 3;
                Object objMo64994c = videoDetailPlayDaoM71734O.mo64994c(subjectId3, this);
                if (objMo64994c == objF) {
                    return objF;
                }
                list2 = list;
                obj = objMo64994c;
                downloadBean = downloadBean4;
                videoDetailPlayBean = (VideoDetailPlayBean) obj;
                if (videoDetailPlayBean != null) {
                    subtitleSelectId2 = videoDetailPlayBean.getSubtitleSelectId();
                } else {
                    subtitleSelectId2 = null;
                }
                downloadBean.setSubtitleSelectId(subtitleSelectId2);
                list = list2;
            }
        }
        this.this$0.f55484d.mo71861f(this.$bean.getSubtitleSelectId());
        C26866a.a aVar3 = C26866a.f81698a;
        boolean zIsUGCVideo3 = this.$bean.isUGCVideo();
        String subtitleSelectId5 = this.$bean.getSubtitleSelectId();
        String subjectId4 = this.$bean.getSubjectId();
        String subtitleResId4 = this.$bean.getSubtitleResId();
        if (list != null) {
            numM97634d = Boxing.m97634d(list.size());
        } else {
            numM97634d = null;
        }
        C26866a.a.m104898f(aVar3, LongVodPlayerView.TAG, "loadFromDB ,isUGCVideo:" + zIsUGCVideo3 + ",subtitleSelectId:" + subtitleSelectId5 + ", subjectId:" + subjectId4 + ", id:" + subtitleResId4 + ", size:" + numM97634d, false, 4, null);
        abstractC24917a2M99269c = C25220y0.m99269c();
        c164363 = new C164363(list, this.this$0, this.$bean, null);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 4;
        if (AbstractC25088i.m98910g(abstractC24917a2M99269c, c164363, this) == objF) {
            return objF;
        }
        return Unit.f75682a;
    }
}
