package com.transsion.home.adapter.suboperate.provider;

import com.chad.library.adapter.base.BaseProviderMultiAdapter;
import com.p282tn.lib.widget.R$string;
import com.transsion.home.bean.OperateItem;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.videodetail.music.data.MusicLikedFragmentViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import p842vl.AbstractC28126h;
import p944yh.C28951b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.adapter.suboperate.provider.SubFeedsSingleImageProvider$convert$2$1$1$1", m97637f = "SubFeedsSingleImageProvider.kt", m97638l = {}, m97639m = "invokeSuspend")
final class SubFeedsSingleImageProvider$convert$2$1$1$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ OperateItem $item;
    final /* synthetic */ Subject $subject;
    int label;
    final /* synthetic */ SubFeedsSingleImageProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubFeedsSingleImageProvider$convert$2$1$1$1(SubFeedsSingleImageProvider subFeedsSingleImageProvider, OperateItem operateItem, Subject subject, Continuation<? super SubFeedsSingleImageProvider$convert$2$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = subFeedsSingleImageProvider;
        this.$item = operateItem;
        this.$subject = subject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Unit m67029d(Subject subject, SubFeedsSingleImageProvider subFeedsSingleImageProvider, OperateItem operateItem, boolean z11) {
        List<Object> data;
        if (z11) {
            AbstractC28126h.m109239f(subject, "opt_sub_feeds");
            BaseProviderMultiAdapter baseProviderMultiAdapterM36335g = subFeedsSingleImageProvider.m36335g();
            subFeedsSingleImageProvider.m67023H((baseProviderMultiAdapterM36335g == null || (data = baseProviderMultiAdapterM36335g.getData()) == null) ? -1 : data.indexOf(operateItem), subject, false);
        } else {
            C28951b.f88586a.m111454d(R$string.no_network_toast);
        }
        return Unit.f75682a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubFeedsSingleImageProvider$convert$2$1$1$1(this.this$0, this.$item, this.$subject, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SubFeedsSingleImageProvider$convert$2$1$1$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.m97630f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m97107b(obj);
        MusicLikedFragmentViewModel musicLikedFragmentViewModelM67027F = this.this$0.m67027F();
        Subject feedsSubject = this.$item.getFeedsSubject();
        String subjectId = feedsSubject != null ? feedsSubject.getSubjectId() : null;
        final Subject subject = this.$subject;
        final SubFeedsSingleImageProvider subFeedsSingleImageProvider = this.this$0;
        final OperateItem operateItem = this.$item;
        musicLikedFragmentViewModelM67027F.m86234F(subjectId, new Function1() { // from class: com.transsion.home.adapter.suboperate.provider.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return SubFeedsSingleImageProvider$convert$2$1$1$1.m67029d(subject, subFeedsSingleImageProvider, operateItem, ((Boolean) obj2).booleanValue());
            }
        });
        return Unit.f75682a;
    }
}
