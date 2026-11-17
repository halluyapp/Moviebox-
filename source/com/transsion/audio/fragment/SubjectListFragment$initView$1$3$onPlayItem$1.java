package com.transsion.audio.fragment;

import com.therouter.TheRouter;
import com.transsion.audio.player.AudioPlayer;
import com.transsion.baselib.p291db.audio.AudioBean;
import com.transsion.moviedetailapi.DownloadItem;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import p415fq.InterfaceC23410a;
import p602mj.InterfaceC25866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.audio.fragment.SubjectListFragment$initView$1$3$onPlayItem$1", m97637f = "SubjectListFragment.kt", m97638l = {147}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class SubjectListFragment$initView$1$3$onPlayItem$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ DownloadItem $download;
    int label;
    final /* synthetic */ SubjectListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubjectListFragment$initView$1$3$onPlayItem$1(DownloadItem downloadItem, SubjectListFragment subjectListFragment, Continuation<? super SubjectListFragment$initView$1$3$onPlayItem$1> continuation) {
        super(2, continuation);
        this.$download = downloadItem;
        this.this$0 = subjectListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubjectListFragment$initView$1$3$onPlayItem$1(this.$download, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SubjectListFragment$initView$1$3$onPlayItem$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0099  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:52:0x0170  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AudioBean audioBean;
        InterfaceC25866a interfaceC25866aM64540v0;
        Object objMo101623c;
        String url;
        InterfaceC23410a interfaceC23410a;
        Long readProcess;
        long jLongValue;
        Long duration;
        long jLongValue2;
        InterfaceC23410a interfaceC23410a2;
        InterfaceC23410a interfaceC23410a3;
        InterfaceC23410a interfaceC23410a4;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            String url2 = this.$download.getUrl();
            audioBean = null;
            if (url2 != null && (interfaceC25866aM64540v0 = this.this$0.m64540v0()) != null) {
                this.label = 1;
                objMo101623c = interfaceC25866aM64540v0.mo101623c(url2, this);
                if (objMo101623c == objF) {
                    return objF;
                }
            }
            if (audioBean != null) {
                url = this.$download.getUrl();
                if (url == null) {
                    url = "";
                }
                audioBean = new AudioBean(url, this.this$0.subjectCover, Boxing.m97635e(0L), this.$download.getSize(), this.$download.getUrl(), this.$download.getName(), "", Boxing.m97634d(0), null, null, null, "", this.$download.getResourceId(), this.$download.getPostId(), this.this$0.subjectId, this.this$0.groupId, 0, this.this$0.subjectTitle, this.$download.getSe(), this.$download.getEp(), 67328, null);
                this.$download.setStatus(Boxing.m97634d(3));
                interfaceC23410a = (InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0]);
                if (interfaceC23410a != null) {
                    interfaceC23410a.mo23880d(audioBean, false);
                }
            } else if (AudioPlayer.f50463i.m64593a().m64591y(audioBean)) {
                readProcess = audioBean.getReadProcess();
                if (readProcess != null) {
                    jLongValue = readProcess.longValue();
                } else {
                    jLongValue = 0;
                }
                duration = audioBean.getDuration();
                if (duration != null) {
                    jLongValue2 = duration.longValue();
                } else {
                    jLongValue2 = -500;
                }
                boolean z11 = jLongValue >= jLongValue2;
                if (audioBean.getStatus() != 6 || z11) {
                    audioBean.setReadProcess(Boxing.m97635e(0L));
                }
                this.this$0.mIsStop.set(false);
                audioBean.setStatus(3);
                this.$download.setStatus(Boxing.m97634d(3));
                interfaceC23410a2 = (InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0]);
                if (interfaceC23410a2 != null) {
                    interfaceC23410a2.mo23880d(audioBean, false);
                }
            } else if (audioBean.getStatus() == 3) {
                this.this$0.mIsStop.set(true);
                audioBean.setStatus(4);
                this.$download.setStatus(Boxing.m97634d(4));
                interfaceC23410a4 = (InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0]);
                if (interfaceC23410a4 != null) {
                    interfaceC23410a4.stop();
                }
            } else {
                this.this$0.mIsStop.set(false);
                audioBean.setStatus(3);
                this.$download.setStatus(Boxing.m97634d(3));
                interfaceC23410a3 = (InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0]);
                if (interfaceC23410a3 != null) {
                    interfaceC23410a3.prepare();
                }
            }
            this.this$0.m64516H0(this.$download, audioBean);
            return Unit.f75682a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        objMo101623c = obj;
        audioBean = (AudioBean) objMo101623c;
        if (audioBean != null) {
            url = this.$download.getUrl();
            if (url == null) {
                url = "";
            }
            audioBean = new AudioBean(url, this.this$0.subjectCover, Boxing.m97635e(0L), this.$download.getSize(), this.$download.getUrl(), this.$download.getName(), "", Boxing.m97634d(0), null, null, null, "", this.$download.getResourceId(), this.$download.getPostId(), this.this$0.subjectId, this.this$0.groupId, 0, this.this$0.subjectTitle, this.$download.getSe(), this.$download.getEp(), 67328, null);
            this.$download.setStatus(Boxing.m97634d(3));
            interfaceC23410a = (InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0]);
            if (interfaceC23410a != null) {
                interfaceC23410a.mo23880d(audioBean, false);
            }
        } else if (AudioPlayer.f50463i.m64593a().m64591y(audioBean)) {
            readProcess = audioBean.getReadProcess();
            if (readProcess != null) {
                jLongValue = readProcess.longValue();
            } else {
                jLongValue = 0;
            }
            duration = audioBean.getDuration();
            if (duration != null) {
                jLongValue2 = duration.longValue();
            } else {
                jLongValue2 = -500;
            }
            if (jLongValue >= jLongValue2) {
            }
            if (audioBean.getStatus() != 6) {
                audioBean.setReadProcess(Boxing.m97635e(0L));
            } else {
                audioBean.setReadProcess(Boxing.m97635e(0L));
            }
            this.this$0.mIsStop.set(false);
            audioBean.setStatus(3);
            this.$download.setStatus(Boxing.m97634d(3));
            interfaceC23410a2 = (InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0]);
            if (interfaceC23410a2 != null) {
                interfaceC23410a2.mo23880d(audioBean, false);
            }
        } else if (audioBean.getStatus() == 3) {
            this.this$0.mIsStop.set(true);
            audioBean.setStatus(4);
            this.$download.setStatus(Boxing.m97634d(4));
            interfaceC23410a4 = (InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0]);
            if (interfaceC23410a4 != null) {
                interfaceC23410a4.stop();
            }
        } else {
            this.this$0.mIsStop.set(false);
            audioBean.setStatus(3);
            this.$download.setStatus(Boxing.m97634d(3));
            interfaceC23410a3 = (InterfaceC23410a) TheRouter.m61774d(InterfaceC23410a.class, new Object[0]);
            if (interfaceC23410a3 != null) {
                interfaceC23410a3.prepare();
            }
        }
        this.this$0.m64516H0(this.$download, audioBean);
        return Unit.f75682a;
    }
}
