package com.transsion.home.hashtag;

import com.cloud.tmc.kernel.constants.TmcConstants;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.ugcvideodetail.api.bean.UGCVideoHashTag;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC25149n0;
import okhttp3.RequestBody;
import p978zg.C29182a;
import pg.C26866a;
import sl.InterfaceC27627a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.hashtag.HashTagViewModel$loadHashTagList$1", m97637f = "HashTagViewModel.kt", m97638l = {Sdk$SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE}, m97639m = "invokeSuspend")
final class HashTagViewModel$loadHashTagList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Set<UGCVideoHashTag> $currentSelectedTags;
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ int $page;
    final /* synthetic */ String $tabSort;
    int label;
    final /* synthetic */ HashTagViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HashTagViewModel$loadHashTagList$1(HashTagViewModel hashTagViewModel, String str, int i11, Set<UGCVideoHashTag> set, boolean z11, Continuation<? super HashTagViewModel$loadHashTagList$1> continuation) {
        super(2, continuation);
        this.this$0 = hashTagViewModel;
        this.$tabSort = str;
        this.$page = i11;
        this.$currentSelectedTags = set;
        this.$isRefresh = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HashTagViewModel$loadHashTagList$1(this.this$0, this.$tabSort, this.$page, this.$currentSelectedTags, this.$isRefresh, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((HashTagViewModel$loadHashTagList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                RequestBody requestBodyM68479l = this.this$0.m68479l(this.$tabSort, this.$page, this.$currentSelectedTags);
                if (requestBodyM68479l != null) {
                    InterfaceC27627a interfaceC27627a = this.this$0.f53335c;
                    String strM111992a = C29182a.f89053a.m111992a();
                    this.label = 1;
                    obj = interfaceC27627a.m107467a(strM111992a, requestBodyM68479l, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    this.this$0.m68480n(this.$tabSort, this.$currentSelectedTags, this.$isRefresh, "Request body create failed", TmcConstants.COLD_OPEN_TYPE);
                }
                return Unit.f75682a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            this.this$0.m68481o(this.$tabSort, this.$page, this.$currentSelectedTags, this.$isRefresh, (BaseDto) obj);
        } catch (Exception e11) {
            e11.printStackTrace();
            C26866a.f81698a.m104915i("HashTagViewModel", "loadHashTagList exception: " + e11.getMessage() + ", tabSort=" + this.$tabSort + ", page=" + this.$page, true);
            HashTagViewModel hashTagViewModel = this.this$0;
            String str = this.$tabSort;
            Set<UGCVideoHashTag> set = this.$currentSelectedTags;
            boolean z11 = this.$isRefresh;
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            hashTagViewModel.m68480n(str, set, z11, message, TmcConstants.COLD_OPEN_TYPE);
        }
        return Unit.f75682a;
    }
}
