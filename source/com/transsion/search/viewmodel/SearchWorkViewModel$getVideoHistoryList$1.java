package com.transsion.search.viewmodel;

import android.text.TextUtils;
import android.util.Log;
import com.transsion.baselib.p291db.video.VideoDetailPlayBean;
import com.transsion.baselib.p291db.video.VideoDetailPlayDao;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.search.viewmodel.SearchWorkViewModel$getVideoHistoryList$1", m97637f = "SearchWorkViewModel.kt", m97638l = {44}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class SearchWorkViewModel$getVideoHistoryList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isRefreshAll;
    int label;
    final /* synthetic */ SearchWorkViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchWorkViewModel$getVideoHistoryList$1(boolean z11, SearchWorkViewModel searchWorkViewModel, Continuation<? super SearchWorkViewModel$getVideoHistoryList$1> continuation) {
        super(2, continuation);
        this.$isRefreshAll = z11;
        this.this$0 = searchWorkViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchWorkViewModel$getVideoHistoryList$1(this.$isRefreshAll, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((SearchWorkViewModel$getVideoHistoryList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            if (this.$isRefreshAll) {
                this.this$0.m78106m(0);
                this.this$0.f60023a = true;
                this.this$0.f60025c.clear();
            }
            VideoDetailPlayDao videoDetailPlayDaoM78099j = this.this$0.m78099j();
            int iM78104i = this.this$0.m78104i();
            int i12 = this.this$0.f60028f;
            this.label = 1;
            obj = videoDetailPlayDaoM78099j.mo64995d(iM78104i, i12, this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        List list = (List) obj;
        List list2 = list;
        if (list2 == null || list2.isEmpty() || list.size() < this.this$0.f60028f) {
            this.this$0.f60023a = false;
        }
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (TextUtils.isDigitsOnly(((VideoDetailPlayBean) obj2).getId())) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        Integer numM97634d = arrayList != null ? Boxing.m97634d(arrayList.size()) : null;
        Log.e("SearchWork", "获取视频播放记录 数量： " + numM97634d + "，hasMore:" + this.this$0.m78102g());
        if (arrayList == null) {
            return Unit.f75682a;
        }
        this.this$0.f60025c.addAll(arrayList);
        SearchWorkViewModel searchWorkViewModel = this.this$0;
        searchWorkViewModel.m78106m(searchWorkViewModel.m78104i() + arrayList.size());
        this.this$0.m78103h().mo14855n(CollectionsKt.m97343U0(this.this$0.f60025c));
        return Unit.f75682a;
    }
}
