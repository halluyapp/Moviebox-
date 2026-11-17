package com.transsion.player.longvideo.p302ui.dialog;

import ck.C5110g;
import ck.C5118o;
import com.transsion.baselib.p291db.video.VideoDetailPlayBean;
import com.transsion.baselib.p291db.video.VideoDetailPlayDao;
import com.transsion.player.longvideo.constants.LongVodContentType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p553ko.C24715a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.player.longvideo.ui.dialog.LongVodPlayerViewAdHelper$setLongVdPlayerBean$1", m97637f = "LongVodPlayerViewAdHelper.kt", m97638l = {194}, m97639m = "invokeSuspend")
final class LongVodPlayerViewAdHelper$setLongVdPlayerBean$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C24715a $bean;
    final /* synthetic */ LongVodContentType $contextType;
    Object L$0;
    int label;
    final /* synthetic */ LongVodPlayerViewAdHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LongVodPlayerViewAdHelper$setLongVdPlayerBean$1(LongVodPlayerViewAdHelper longVodPlayerViewAdHelper, C24715a c24715a, LongVodContentType longVodContentType, Continuation<? super LongVodPlayerViewAdHelper$setLongVdPlayerBean$1> continuation) {
        super(2, continuation);
        this.this$0 = longVodPlayerViewAdHelper;
        this.$bean = c24715a;
        this.$contextType = longVodContentType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LongVodPlayerViewAdHelper$setLongVdPlayerBean$1(this.this$0, this.$bean, this.$contextType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LongVodPlayerViewAdHelper$setLongVdPlayerBean$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LongVodPlayerViewAdHelper longVodPlayerViewAdHelper;
        Long lastAdEndTimeStamp;
        Long lastAdStartTimeStamp;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            this.this$0.f55784U = this.$bean;
            LongVodPlayerViewAdHelper longVodPlayerViewAdHelper2 = this.this$0;
            VideoDetailPlayDao videoDetailPlayDaoM72238a4 = longVodPlayerViewAdHelper2.m72238a4();
            String strM97059o = this.$bean.m97059o();
            int iM97056l = this.$bean.m97056l();
            int iM97049e = this.$bean.m97049e();
            this.L$0 = longVodPlayerViewAdHelper2;
            this.label = 1;
            Object objMo65003l = videoDetailPlayDaoM72238a4.mo65003l(strM97059o, iM97056l, iM97049e, this);
            if (objMo65003l == objF) {
                return objF;
            }
            longVodPlayerViewAdHelper = longVodPlayerViewAdHelper2;
            obj = objMo65003l;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            longVodPlayerViewAdHelper = (LongVodPlayerViewAdHelper) this.L$0;
            ResultKt.m97107b(obj);
        }
        longVodPlayerViewAdHelper.f55785V = (VideoDetailPlayBean) obj;
        LongVodPlayerViewAdHelper longVodPlayerViewAdHelper3 = this.this$0;
        VideoDetailPlayBean videoDetailPlayBean = longVodPlayerViewAdHelper3.f55785V;
        long jLongValue = 0;
        long jLongValue2 = (videoDetailPlayBean == null || (lastAdStartTimeStamp = videoDetailPlayBean.getLastAdStartTimeStamp()) == null) ? 0L : lastAdStartTimeStamp.longValue();
        VideoDetailPlayBean videoDetailPlayBean2 = this.this$0.f55785V;
        if (videoDetailPlayBean2 != null && (lastAdEndTimeStamp = videoDetailPlayBean2.getLastAdEndTimeStamp()) != null) {
            jLongValue = lastAdEndTimeStamp.longValue();
        }
        longVodPlayerViewAdHelper3.m72719E0(jLongValue2, jLongValue);
        if (C5118o.f17608a.m23947g() || C5110g.f17601a.m23911b()) {
            this.this$0.m72727J1(false);
            this.this$0.m72726I1(false);
        }
        this.this$0.m72761i1();
        if (this.$contextType != LongVodContentType.UGC_VIDEO_LOCAL) {
            this.this$0.m72248e4(this.$bean);
            LongVodPlayerViewAdHelper longVodPlayerViewAdHelper4 = this.this$0;
            longVodPlayerViewAdHelper4.m72723G0(longVodPlayerViewAdHelper4.f55782S);
        }
        return Unit.f75682a;
    }
}
