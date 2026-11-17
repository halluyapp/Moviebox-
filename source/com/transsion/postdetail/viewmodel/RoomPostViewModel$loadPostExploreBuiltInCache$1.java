package com.transsion.postdetail.viewmodel;

import android.app.Application;
import com.blankj.utilcode.util.AbstractC5796o;
import com.blankj.utilcode.util.Utils;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import p023ap.C4697a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.postdetail.viewmodel.RoomPostViewModel$loadPostExploreBuiltInCache$1", m97637f = "RoomPostViewModel.kt", m97638l = {}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class RoomPostViewModel$loadPostExploreBuiltInCache$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RoomPostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoomPostViewModel$loadPostExploreBuiltInCache$1(RoomPostViewModel roomPostViewModel, Continuation<? super RoomPostViewModel$loadPostExploreBuiltInCache$1> continuation) {
        super(2, continuation);
        this.this$0 = roomPostViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RoomPostViewModel$loadPostExploreBuiltInCache$1 roomPostViewModel$loadPostExploreBuiltInCache$1 = new RoomPostViewModel$loadPostExploreBuiltInCache$1(this.this$0, continuation);
        roomPostViewModel$loadPostExploreBuiltInCache$1.L$0 = obj;
        return roomPostViewModel$loadPostExploreBuiltInCache$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((RoomPostViewModel$loadPostExploreBuiltInCache$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String content;
        PostSubjectItem postSubjectItem;
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        C14496b c14496b = C14496b.f50966a;
        String string = c14496b.m65344b().getString("room_cache_data", "");
        if (this.this$0.m75125X()) {
            String string2 = c14496b.m65344b().getString("post_explore_net_cache_exp", "");
            String string3 = c14496b.m65344b().getString("post_explore_exposed_cache", "");
            if ((string != null && string.length() != 0) || ((string2 != null && string2.length() != 0) || (string3 != null && string3.length() != 0))) {
                C26866a.a.m104898f(C26866a.f81698a, "RoomPostVM", "loadPostExploreBuiltInCache, 有缓存数据，不使用内置", false, 4, null);
                return Unit.f75682a;
            }
        } else {
            String string4 = c14496b.m65344b().getString("post_explore_net_cache", "");
            if ((string != null && string.length() != 0) || (string4 != null && string4.length() != 0)) {
                C26866a.a.m104898f(C26866a.f81698a, "RoomPostVM", "loadPostExploreBuiltInCache, 有手动缓存或网络缓存，不使用内置", false, 4, null);
                return Unit.f75682a;
            }
        }
        RoomPostViewModel roomPostViewModel = this.this$0;
        try {
            Result.Companion companion = Result.INSTANCE;
            roomPostViewModel.f57905o = System.currentTimeMillis();
            C4697a c4697aM75071A = roomPostViewModel.m75071A();
            Application applicationM27275a = Utils.m27275a();
            Intrinsics.m97801g(applicationM27275a, "getApp(...)");
            String strM22753a = c4697aM75071A.m22753a(applicationM27275a);
            if (strM22753a == null || strM22753a.length() == 0) {
                C26866a.a.m104898f(C26866a.f81698a, "RoomPostVM", "loadPostExploreBuiltInCache, 无内置", false, 4, null);
            } else {
                PostSubjectBean postSubjectBean = (PostSubjectBean) AbstractC5796o.m27441d(strM22753a, PostSubjectBean.class);
                C26866a.a aVar = C26866a.f81698a;
                List<PostSubjectItem> items = postSubjectBean.getItems();
                if (items == null || (postSubjectItem = (PostSubjectItem) CollectionsKt.m97361k0(items)) == null) {
                    content = null;
                } else {
                    String title = postSubjectItem.getTitle();
                    content = (title == null || title.length() == 0) ? postSubjectItem.getContent() : postSubjectItem.getTitle();
                }
                C26866a.a.m104898f(aVar, "RoomPostVM", "loadPostExploreBuiltInCache, 内置--hase cache,show cache, firstContent:" + content, false, 4, null);
                List<PostSubjectItem> items2 = postSubjectBean.getItems();
                if (items2 != null && !items2.isEmpty()) {
                    roomPostViewModel.f57895e.mo14855n(postSubjectBean);
                }
            }
            Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        return Unit.f75682a;
    }
}
