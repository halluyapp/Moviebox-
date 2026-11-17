package com.transsion.postdetail.comment.p305ui;

import com.blankj.utilcode.util.AbstractC5796o;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.moviedetailapi.bean.CommentBean;
import com.transsion.postdetail.bean.MyCommentListBean;
import com.transsion.postdetail.bean.Pager;
import com.transsion.postdetail.bean.PagerBody;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import okhttp3.RequestBody;
import p411fh.C23367b;
import p985zo.InterfaceC29208a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.comment.ui.CommentListViewModel$getCommentList$1", m97637f = "CommentListViewModel.kt", m97638l = {Sdk$SDKMetric.SDKMetricType.AD_VALIDATION_TO_PRESENT_DURATION_MS_VALUE}, m97639m = "invokeSuspend")
final class CommentListViewModel$getCommentList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CommentListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommentListViewModel$getCommentList$1(CommentListViewModel commentListViewModel, Continuation<? super CommentListViewModel$getCommentList$1> continuation) {
        super(2, continuation);
        this.this$0 = commentListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CommentListViewModel$getCommentList$1 commentListViewModel$getCommentList$1 = new CommentListViewModel$getCommentList$1(this.this$0, continuation);
        commentListViewModel$getCommentList$1.L$0 = obj;
        return commentListViewModel$getCommentList$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((CommentListViewModel$getCommentList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        Throwable thM112710exceptionOrNullimpl;
        CommentListViewModel commentListViewModel;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                CommentListViewModel commentListViewModel2 = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                C23367b.a aVar = C23367b.f71265a;
                String strM27447j = AbstractC5796o.m27447j(new PagerBody(commentListViewModel2.f56301e, Boxing.m97634d(commentListViewModel2.f56302f)));
                Intrinsics.m97801g(strM27447j, "toJson(...)");
                RequestBody requestBodyM92796a = aVar.m92796a(strM27447j);
                if (requestBodyM92796a != null) {
                    InterfaceC29208a interfaceC29208aM72950l = commentListViewModel2.m72950l();
                    this.L$0 = commentListViewModel2;
                    this.label = 1;
                    Object objM112053a = InterfaceC29208a.a.m112053a(interfaceC29208aM72950l, requestBodyM92796a, null, this, 2, null);
                    if (objM112053a == objF) {
                        return objF;
                    }
                    commentListViewModel = commentListViewModel2;
                    obj = objM112053a;
                }
                objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
                thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                if (thM112710exceptionOrNullimpl != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("error:");
                    sb2.append(thM112710exceptionOrNullimpl);
                }
                return Unit.f75682a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            commentListViewModel = (CommentListViewModel) this.L$0;
            ResultKt.m97107b(obj);
            MyCommentListBean myCommentListBean = (MyCommentListBean) ((BaseDto) obj).getData();
            if (myCommentListBean != null) {
                Pager pager = myCommentListBean.getPager();
                if (pager != null) {
                    commentListViewModel.f56301e = String.valueOf(pager.getNextPage());
                    pager.getNextPage();
                    commentListViewModel.f56303g = Intrinsics.m97797c(pager.getHasMore(), Boxing.m97631a(true));
                }
                List list = commentListViewModel.f56300d;
                List<CommentBean> commentList = myCommentListBean.getCommentList();
                if (commentList == null) {
                    commentList = CollectionsKt.m97506l();
                }
                list.addAll(commentList);
                commentListViewModel.m72952m().mo14855n(commentListViewModel.f56300d);
            }
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("error:");
            sb3.append(thM112710exceptionOrNullimpl);
        }
        return Unit.f75682a;
    }
}
