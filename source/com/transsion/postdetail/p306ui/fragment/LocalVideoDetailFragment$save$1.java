package com.transsion.postdetail.p306ui.fragment;

import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsnet.downloader.manager.DownloadEsHelper;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import com.transsnet.flow.event.sync.event.LocalVideoEvent;
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
import p665oy.C26750e;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$save$1", m97637f = "LocalVideoDetailFragment.kt", m97638l = {1546, 1547}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class LocalVideoDetailFragment$save$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $completed;
    final /* synthetic */ DownloadBean $cvideoBean;
    final /* synthetic */ long $playProgress;
    long J$0;
    int label;
    final /* synthetic */ LocalVideoDetailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalVideoDetailFragment$save$1(boolean z11, LocalVideoDetailFragment localVideoDetailFragment, long j11, DownloadBean downloadBean, Continuation<? super LocalVideoDetailFragment$save$1> continuation) {
        super(2, continuation);
        this.$completed = z11;
        this.this$0 = localVideoDetailFragment;
        this.$playProgress = j11;
        this.$cvideoBean = downloadBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalVideoDetailFragment$save$1(this.$completed, this.this$0, this.$playProgress, this.$cvideoBean, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LocalVideoDetailFragment$save$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0148  */
    /* JADX WARN: Code duplicated, block: B:58:0x0151  */
    /* JADX WARN: Code duplicated, block: B:61:0x018a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j11;
        long j12;
        DownloadBean downloadBean;
        long j13;
        DownloadBean downloadBean2;
        String resourceId;
        DownloadBean downloadBean3;
        boolean z11;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                j11 = this.J$0;
                ResultKt.m97107b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j13 = this.J$0;
                ResultKt.m97107b(obj);
            }
            j12 = j13;
            downloadBean2 = this.$cvideoBean;
            if (downloadBean2 != null || (resourceId = downloadBean2.getResourceId()) == null) {
                resourceId = "";
            }
            LocalVideoEvent localVideoEvent = new LocalVideoEvent(resourceId, j12, this.this$0.duration, this.this$0.isSeries, false, 16, null);
            AppScopeVMlProvider appScopeVMlProvider = AppScopeVMlProvider.INSTANCE;
            FlowEventBus flowEventBus = (FlowEventBus) appScopeVMlProvider.getApplicationScopeViewModel(FlowEventBus.class);
            String name = LocalVideoEvent.class.getName();
            Intrinsics.m97801g(name, "getName(...)");
            flowEventBus.postEvent(name, localVideoEvent, 0L);
            downloadBean3 = this.$cvideoBean;
            z11 = false;
            if (downloadBean3 != null && downloadBean3.isOutside()) {
                z11 = true;
            }
            C26750e c26750e = new C26750e(true, z11);
            FlowEventBus flowEventBus2 = (FlowEventBus) appScopeVMlProvider.getApplicationScopeViewModel(FlowEventBus.class);
            String name2 = C26750e.class.getName();
            Intrinsics.m97801g(name2, "getName(...)");
            flowEventBus2.postEvent(name2, c26750e, 0L);
            return Unit.f75682a;
        }
        ResultKt.m97107b(obj);
        j11 = (!this.$completed || this.this$0.duration <= 0) ? this.$playProgress : this.this$0.duration;
        C26866a.a aVar = C26866a.f81698a;
        String str = this.this$0.TAG;
        boolean z12 = this.$completed;
        long j14 = this.this$0.duration;
        long j15 = this.$playProgress;
        DownloadBean downloadBean4 = this.$cvideoBean;
        aVar.m104919u(str, "save completed = " + z12 + ", duration = " + j14 + ", playProgress= " + j15 + ", cur epse = " + (downloadBean4 != null ? Boxing.m97634d(downloadBean4.getEpse()) : null) + " ", true);
        DownloadBean downloadBean5 = this.$cvideoBean;
        if (downloadBean5 != null) {
            downloadBean5.setReadProgress(j11);
        }
        if (this.this$0.duration > 0 && (downloadBean = this.$cvideoBean) != null) {
            downloadBean.setDuration(Boxing.m97635e(this.this$0.duration));
        }
        if (this.this$0.videoHeight > 0 && this.this$0.videoWidth > 0) {
            DownloadBean downloadBean6 = this.$cvideoBean;
            if (downloadBean6 != null) {
                downloadBean6.setVideoWidth(this.this$0.videoWidth);
            }
            DownloadBean downloadBean7 = this.$cvideoBean;
            if (downloadBean7 != null) {
                downloadBean7.setVideoHeight(this.this$0.videoHeight);
            }
        }
        DownloadBean downloadBean8 = this.$cvideoBean;
        if (downloadBean8 != null) {
            downloadBean8.setLastPlayTimeStamp(System.currentTimeMillis());
        }
        if (this.$cvideoBean != null) {
            C26866a.a.m104898f(aVar, this.this$0.TAG, "---------update name = " + this.$cvideoBean.getName() + " , playProgress = " + j11, false, 4, null);
            DownloadEsHelper downloadEsHelperM88598a = DownloadEsHelper.f67591m.m88598a();
            DownloadBean downloadBean9 = this.$cvideoBean;
            this.J$0 = j11;
            this.label = 1;
            if (downloadEsHelperM88598a.m88573b0(downloadBean9, this) == objF) {
                return objF;
            }
        } else {
            j12 = j11;
        }
        downloadBean2 = this.$cvideoBean;
        if (downloadBean2 != null) {
            resourceId = "";
        } else {
            resourceId = "";
        }
        LocalVideoEvent localVideoEvent2 = new LocalVideoEvent(resourceId, j12, this.this$0.duration, this.this$0.isSeries, false, 16, null);
        AppScopeVMlProvider appScopeVMlProvider2 = AppScopeVMlProvider.INSTANCE;
        FlowEventBus flowEventBus3 = (FlowEventBus) appScopeVMlProvider2.getApplicationScopeViewModel(FlowEventBus.class);
        String name3 = LocalVideoEvent.class.getName();
        Intrinsics.m97801g(name3, "getName(...)");
        flowEventBus3.postEvent(name3, localVideoEvent2, 0L);
        downloadBean3 = this.$cvideoBean;
        z11 = false;
        if (downloadBean3 != null) {
            z11 = true;
        }
        C26750e c26750e2 = new C26750e(true, z11);
        FlowEventBus flowEventBus4 = (FlowEventBus) appScopeVMlProvider2.getApplicationScopeViewModel(FlowEventBus.class);
        String name4 = C26750e.class.getName();
        Intrinsics.m97801g(name4, "getName(...)");
        flowEventBus4.postEvent(name4, c26750e2, 0L);
        return Unit.f75682a;
        LocalVideoDetailFragment localVideoDetailFragment = this.this$0;
        DownloadBean downloadBean10 = this.$cvideoBean;
        this.J$0 = j11;
        this.label = 2;
        if (localVideoDetailFragment.m74187t3(downloadBean10, this) == objF) {
            return objF;
        }
        j13 = j11;
        j12 = j13;
        downloadBean2 = this.$cvideoBean;
        if (downloadBean2 != null) {
            resourceId = "";
        } else {
            resourceId = "";
        }
        LocalVideoEvent localVideoEvent3 = new LocalVideoEvent(resourceId, j12, this.this$0.duration, this.this$0.isSeries, false, 16, null);
        AppScopeVMlProvider appScopeVMlProvider3 = AppScopeVMlProvider.INSTANCE;
        FlowEventBus flowEventBus5 = (FlowEventBus) appScopeVMlProvider3.getApplicationScopeViewModel(FlowEventBus.class);
        String name5 = LocalVideoEvent.class.getName();
        Intrinsics.m97801g(name5, "getName(...)");
        flowEventBus5.postEvent(name5, localVideoEvent3, 0L);
        downloadBean3 = this.$cvideoBean;
        z11 = false;
        if (downloadBean3 != null) {
            z11 = true;
        }
        C26750e c26750e3 = new C26750e(true, z11);
        FlowEventBus flowEventBus6 = (FlowEventBus) appScopeVMlProvider3.getApplicationScopeViewModel(FlowEventBus.class);
        String name6 = C26750e.class.getName();
        Intrinsics.m97801g(name6, "getName(...)");
        flowEventBus6.postEvent(name6, c26750e3, 0L);
        return Unit.f75682a;
    }
}
