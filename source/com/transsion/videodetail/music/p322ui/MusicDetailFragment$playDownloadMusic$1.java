package com.transsion.videodetail.music.p322ui;

import com.transsion.baselib.p291db.download.DownloadBean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import mx.C25917a;
import p648oj.InterfaceC26241c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.videodetail.music.ui.MusicDetailFragment$playDownloadMusic$1", m97637f = "MusicDetailFragment.kt", m97638l = {891}, m97639m = "invokeSuspend")
final class MusicDetailFragment$playDownloadMusic$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $subjectId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MusicDetailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MusicDetailFragment$playDownloadMusic$1(MusicDetailFragment musicDetailFragment, String str, Continuation<? super MusicDetailFragment$playDownloadMusic$1> continuation) {
        super(2, continuation);
        this.this$0 = musicDetailFragment;
        this.$subjectId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MusicDetailFragment$playDownloadMusic$1 musicDetailFragment$playDownloadMusic$1 = new MusicDetailFragment$playDownloadMusic$1(this.this$0, this.$subjectId, continuation);
        musicDetailFragment$playDownloadMusic$1.L$0 = obj;
        return musicDetailFragment$playDownloadMusic$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((MusicDetailFragment$playDownloadMusic$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC25149n0 interfaceC25149n0 = (InterfaceC25149n0) this.L$0;
            InterfaceC26241c interfaceC26241cM86355k1 = this.this$0.m86355k1();
            String str = this.$subjectId;
            if (str == null) {
                str = "";
            }
            this.L$0 = interfaceC25149n0;
            this.label = 1;
            obj = interfaceC26241cM86355k1.mo102726E(str, this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        DownloadBean downloadBean = (DownloadBean) obj;
        if (downloadBean != null) {
            this.this$0.m86344f2(downloadBean);
        } else {
            MusicDetailFragment musicDetailFragment = this.this$0;
            C25917a.f79141a.m101736b(musicDetailFragment.getClassTag() + " --> loadData() --> 无网络 无下载");
        }
        return Unit.f75682a;
    }
}
