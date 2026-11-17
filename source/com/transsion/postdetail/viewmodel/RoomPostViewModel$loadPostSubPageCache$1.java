package com.transsion.postdetail.viewmodel;

import com.blankj.utilcode.util.AbstractC5796o;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.bean.PostSubjectBean;
import com.transsion.moviedetailapi.bean.PostSubjectItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import p743rh.C27287m;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.viewmodel.RoomPostViewModel$loadPostSubPageCache$1", m97637f = "RoomPostViewModel.kt", m97638l = {}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class RoomPostViewModel$loadPostSubPageCache$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $tabId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RoomPostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoomPostViewModel$loadPostSubPageCache$1(String str, RoomPostViewModel roomPostViewModel, Continuation<? super RoomPostViewModel$loadPostSubPageCache$1> continuation) {
        super(2, continuation);
        this.$tabId = str;
        this.this$0 = roomPostViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RoomPostViewModel$loadPostSubPageCache$1 roomPostViewModel$loadPostSubPageCache$1 = new RoomPostViewModel$loadPostSubPageCache$1(this.$tabId, this.this$0, continuation);
        roomPostViewModel$loadPostSubPageCache$1.L$0 = obj;
        return roomPostViewModel$loadPostSubPageCache$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((RoomPostViewModel$loadPostSubPageCache$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        PostSubjectItem postSubjectItem;
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        String str = this.$tabId;
        RoomPostViewModel roomPostViewModel = this.this$0;
        try {
            Result.Companion companion = Result.INSTANCE;
            String content = null;
            String string = C14496b.f50966a.m65344b().getString("post_sub_page_cache_" + str, null);
            if (string != null && string.length() != 0) {
                PostSubjectBean postSubjectBean = (PostSubjectBean) AbstractC5796o.m27441d(string, PostSubjectBean.class);
                C26866a.a aVar = C26866a.f81698a;
                List<PostSubjectItem> items = postSubjectBean.getItems();
                if (items != null && (postSubjectItem = (PostSubjectItem) CollectionsKt.m97361k0(items)) != null) {
                    String title = postSubjectItem.getTitle();
                    content = (title == null || title.length() == 0) ? postSubjectItem.getContent() : postSubjectItem.getTitle();
                }
                C26866a.a.m104898f(aVar, "RoomPostVM", "loadPostSubPageCache, hase cache,show cache, tabId:" + str + ", content:" + content, false, 4, null);
                roomPostViewModel.f57903m.mo14855n(postSubjectBean);
            } else if (!C27287m.f83003a.m106330e()) {
                roomPostViewModel.f57903m.mo14855n(null);
            }
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        return Unit.f75682a;
    }
}
