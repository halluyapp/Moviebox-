package com.transsion.postdetail.p306ui.fragment;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsion.baselib.p291db.download.DownloadBean;
import com.transsion.baselib.report.C14482a;
import com.transsion.postdetail.layer.local.C16791c0;
import com.transsion.subtitle.InterfaceC19714h;
import com.transsion.subtitle.VideoSubtitleControl;
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
import kotlinx.coroutines.InterfaceC25149n0;
import p528ju.C24469a;
import p743rh.C27287m;
import p844vo.C28158k;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.ui.fragment.LocalVideoDetailFragment$setSubtitle$1$1$1", m97637f = "LocalVideoDetailFragment.kt", m97638l = {}, m97639m = "invokeSuspend")
final class LocalVideoDetailFragment$setSubtitle$1$1$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ DownloadBean $dBean;
    final /* synthetic */ List<C24469a> $subtitleList;
    int label;
    final /* synthetic */ LocalVideoDetailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalVideoDetailFragment$setSubtitle$1$1$1(List<C24469a> list, LocalVideoDetailFragment localVideoDetailFragment, DownloadBean downloadBean, Continuation<? super LocalVideoDetailFragment$setSubtitle$1$1$1> continuation) {
        super(2, continuation);
        this.$subtitleList = list;
        this.this$0 = localVideoDetailFragment;
        this.$dBean = downloadBean;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m74240i(LocalVideoDetailFragment localVideoDetailFragment) {
        localVideoDetailFragment.m74186t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Unit m74241j(List list, final LocalVideoDetailFragment localVideoDetailFragment, boolean z11) {
        List list2;
        C28158k mViewBinding;
        ConstraintLayout root;
        if (!z11 && (((list2 = list) == null || list2.isEmpty()) && (mViewBinding = localVideoDetailFragment.getMViewBinding()) != null && (root = mViewBinding.getRoot()) != null)) {
            root.post(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.v0
                @Override // java.lang.Runnable
                public final void run() {
                    LocalVideoDetailFragment$setSubtitle$1$1$1.m74242k(localVideoDetailFragment);
                }
            });
        }
        return Unit.f75682a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m74242k(LocalVideoDetailFragment localVideoDetailFragment) {
        localVideoDetailFragment.m74186t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m74243l(LocalVideoDetailFragment localVideoDetailFragment) {
        localVideoDetailFragment.m74186t2();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalVideoDetailFragment$setSubtitle$1$1$1(this.$subtitleList, this.this$0, this.$dBean, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((LocalVideoDetailFragment$setSubtitle$1$1$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ConstraintLayout root;
        C28158k mViewBinding;
        ConstraintLayout root2;
        C16791c0 c16791c0;
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        List<C24469a> list = this.$subtitleList;
        if (list != null && (c16791c0 = this.this$0.localVideoDot) != null) {
            c16791c0.m73445r(list);
        }
        VideoSubtitleControl videoSubtitleControl = this.this$0.subtitleControl;
        if (videoSubtitleControl != null) {
            videoSubtitleControl.m81889f0(this.$subtitleList);
        }
        if (C27287m.f83003a.m106330e()) {
            DownloadBean downloadBean = this.this$0.downloadBean;
            if (downloadBean == null || !downloadBean.isInnerRes()) {
                List<C24469a> list2 = this.$subtitleList;
                if ((list2 == null || list2.isEmpty()) && (mViewBinding = this.this$0.getMViewBinding()) != null && (root2 = mViewBinding.getRoot()) != null) {
                    final LocalVideoDetailFragment localVideoDetailFragment = this.this$0;
                    Boxing.m97631a(root2.post(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.s0
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocalVideoDetailFragment$setSubtitle$1$1$1.m74240i(localVideoDetailFragment);
                        }
                    }));
                }
            } else {
                DownloadBean downloadBean2 = this.this$0.downloadBean;
                if (downloadBean2 != null) {
                    DownloadBean downloadBean3 = this.$dBean;
                    final List<C24469a> list3 = this.$subtitleList;
                    final LocalVideoDetailFragment localVideoDetailFragment2 = this.this$0;
                    C26866a.f81698a.m104912c(C14482a.f50937a.m65273a(), "视频播放开始检测字幕,name:" + downloadBean3.getTotalTitleName() + ", subtitleResId:" + downloadBean3.getSubtitleResId(), true);
                    InterfaceC19714h.f62935a.m82148b().mo81942d(downloadBean2, new Function1() { // from class: com.transsion.postdetail.ui.fragment.t0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return LocalVideoDetailFragment$setSubtitle$1$1$1.m74241j(list3, localVideoDetailFragment2, ((Boolean) obj2).booleanValue());
                        }
                    });
                }
            }
        } else {
            List<C24469a> list4 = this.$subtitleList;
            if (list4 == null || list4.isEmpty()) {
                C26866a.f81698a.m104912c(C14482a.f50937a.m65273a(), "展示无字幕ui,name:" + this.$dBean.getTotalTitleName() + ", subtitleResId:" + this.$dBean.getSubtitleResId(), true);
                C28158k mViewBinding2 = this.this$0.getMViewBinding();
                if (mViewBinding2 != null && (root = mViewBinding2.getRoot()) != null) {
                    final LocalVideoDetailFragment localVideoDetailFragment3 = this.this$0;
                    Boxing.m97631a(root.post(new Runnable() { // from class: com.transsion.postdetail.ui.fragment.u0
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocalVideoDetailFragment$setSubtitle$1$1$1.m74243l(localVideoDetailFragment3);
                        }
                    }));
                }
            }
        }
        return Unit.f75682a;
    }
}
