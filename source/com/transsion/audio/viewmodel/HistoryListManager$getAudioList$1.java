package com.transsion.audio.viewmodel;

import android.text.TextUtils;
import com.transsion.audio.player.AudioPlayer;
import com.transsion.baselib.p291db.audio.AudioBean;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.Iterator;
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
import kotlinx.coroutines.InterfaceC25149n0;
import p602mj.InterfaceC25866a;
import pg.C26866a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.audio.viewmodel.HistoryListManager$getAudioList$1", m97637f = "HistoryListManager.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.AD_VISIBILITY_VALUE, 67}, m97639m = "invokeSuspend")
final class HistoryListManager$getAudioList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ HistoryListManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryListManager$getAudioList$1(HistoryListManager historyListManager, Continuation<? super HistoryListManager$getAudioList$1> continuation) {
        super(2, continuation);
        this.this$0 = historyListManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryListManager$getAudioList$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((HistoryListManager$getAudioList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0060 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        List list2;
        AudioBean audioBeanM64588t;
        Iterator it;
        Integer numM97634d;
        AudioBean audioBean;
        String audioUrl;
        InterfaceC25866a interfaceC25866aM64694q;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.m97107b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                audioBeanM64588t = (AudioBean) this.L$1;
                list2 = (List) this.L$0;
                ResultKt.m97107b(obj);
            }
            while (it.hasNext()) {
                audioBean = (AudioBean) it.next();
                if (audioBean.getStatus() == 3) {
                    if (audioBeanM64588t != null) {
                        audioUrl = audioBeanM64588t.getAudioUrl();
                    } else {
                        audioUrl = null;
                    }
                    if (TextUtils.equals(audioUrl, audioBean.getAudioUrl())) {
                        continue;
                    } else {
                        audioBean.setStatus(4);
                        interfaceC25866aM64694q = this.this$0.m64694q();
                        if (interfaceC25866aM64694q != null) {
                            this.L$0 = list2;
                            this.L$1 = audioBeanM64588t;
                            this.L$2 = it;
                            this.label = 2;
                            if (interfaceC25866aM64694q.mo101628h(audioBean, this) == objF) {
                                return objF;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            list = list2;
            this.this$0.m64703p().mo14858q(list);
            C26866a.a aVar = C26866a.f81698a;
            if (list != null) {
                numM97634d = Boxing.m97634d(list.size());
            } else {
                numM97634d = null;
            }
            C26866a.a.m104899g(aVar, "get getAudioList success" + numM97634d, false, 2, null);
            return Unit.f75682a;
        }
        ResultKt.m97107b(obj);
        InterfaceC25866a interfaceC25866aM64694q2 = this.this$0.m64694q();
        if (interfaceC25866aM64694q2 != null) {
            this.label = 1;
            obj = interfaceC25866aM64694q2.mo101625e(this);
            if (obj == objF) {
                return objF;
            }
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            list2 = list;
            audioBeanM64588t = AudioPlayer.f50463i.m64593a().m64588t();
            it = list.iterator();
            while (it.hasNext()) {
                audioBean = (AudioBean) it.next();
                if (audioBean.getStatus() == 3) {
                    if (audioBeanM64588t != null) {
                        audioUrl = audioBeanM64588t.getAudioUrl();
                    } else {
                        audioUrl = null;
                    }
                    if (TextUtils.equals(audioUrl, audioBean.getAudioUrl())) {
                        audioBean.setStatus(4);
                        interfaceC25866aM64694q = this.this$0.m64694q();
                        if (interfaceC25866aM64694q != null) {
                            this.L$0 = list2;
                            this.L$1 = audioBeanM64588t;
                            this.L$2 = it;
                            this.label = 2;
                            if (interfaceC25866aM64694q.mo101628h(audioBean, this) == objF) {
                                return objF;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            list = list2;
        }
        this.this$0.m64703p().mo14858q(list);
        C26866a.a aVar2 = C26866a.f81698a;
        if (list != null) {
            numM97634d = Boxing.m97634d(list.size());
        } else {
            numM97634d = null;
        }
        C26866a.a.m104899g(aVar2, "get getAudioList success" + numM97634d, false, 2, null);
        return Unit.f75682a;
        list = (List) obj;
        if (list != null) {
            list2 = list;
            audioBeanM64588t = AudioPlayer.f50463i.m64593a().m64588t();
            it = list.iterator();
            while (it.hasNext()) {
                audioBean = (AudioBean) it.next();
                if (audioBean.getStatus() == 3) {
                    if (audioBeanM64588t != null) {
                        audioUrl = audioBeanM64588t.getAudioUrl();
                    } else {
                        audioUrl = null;
                    }
                    if (TextUtils.equals(audioUrl, audioBean.getAudioUrl())) {
                        audioBean.setStatus(4);
                        interfaceC25866aM64694q = this.this$0.m64694q();
                        if (interfaceC25866aM64694q != null) {
                            this.L$0 = list2;
                            this.L$1 = audioBeanM64588t;
                            this.L$2 = it;
                            this.label = 2;
                            if (interfaceC25866aM64694q.mo101628h(audioBean, this) == objF) {
                                return objF;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            list = list2;
        }
        this.this$0.m64703p().mo14858q(list);
        C26866a.a aVar3 = C26866a.f81698a;
        if (list != null) {
            numM97634d = Boxing.m97634d(list.size());
        } else {
            numM97634d = null;
        }
        C26866a.a.m104899g(aVar3, "get getAudioList success" + numM97634d, false, 2, null);
        return Unit.f75682a;
    }
}
