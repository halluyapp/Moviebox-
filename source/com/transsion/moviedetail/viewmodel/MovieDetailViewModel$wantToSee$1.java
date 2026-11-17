package com.transsion.moviedetail.viewmodel;

import com.google.gson.JsonObject;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p282tn.lib.net.bean.BaseDto;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import kotlinx.coroutines.flow.AbstractC25001c;
import kotlinx.coroutines.flow.InterfaceC24995a;
import kotlinx.coroutines.flow.InterfaceC24998b;
import okhttp3.RequestBody;
import p411fh.C23367b;
import p523jn.InterfaceC24449a;
import p978zg.C29182a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.moviedetail.viewmodel.MovieDetailViewModel$wantToSee$1", m97637f = "MovieDetailViewModel.kt", m97638l = {Sdk$SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE}, m97639m = "invokeSuspend")
final class MovieDetailViewModel$wantToSee$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ JsonObject $json;
    int label;
    final /* synthetic */ MovieDetailViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.moviedetail.viewmodel.MovieDetailViewModel$wantToSee$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/tn/lib/net/bean/BaseDto;", "", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.moviedetail.viewmodel.MovieDetailViewModel$wantToSee$1$1", m97637f = "MovieDetailViewModel.kt", m97638l = {Sdk$SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, Sdk$SDKError.Reason.JSON_ENCODE_ERROR_VALUE}, m97639m = "invokeSuspend")
    static final class C161951 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ JsonObject $json;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ MovieDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C161951(JsonObject jsonObject, MovieDetailViewModel movieDetailViewModel, Continuation<? super C161951> continuation) {
            super(2, continuation);
            this.$json = jsonObject;
            this.this$0 = movieDetailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C161951 c161951 = new C161951(this.$json, this.this$0, continuation);
            c161951.L$0 = obj;
            return c161951;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C161951) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x006f A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            RequestBody requestBodyM92796a;
            InterfaceC24998b interfaceC24998b;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC24998b interfaceC24998b2 = (InterfaceC24998b) this.L$0;
                C23367b.a aVar = C23367b.f71265a;
                String string = this.$json.toString();
                Intrinsics.m97801g(string, "toString(...)");
                requestBodyM92796a = aVar.m92796a(string);
                if (requestBodyM92796a != null) {
                    InterfaceC24449a interfaceC24449aM70877N = this.this$0.m70877N();
                    String strM111992a = C29182a.f89053a.m111992a();
                    this.L$0 = interfaceC24998b2;
                    this.L$1 = requestBodyM92796a;
                    this.label = 1;
                    Object objM95934c = interfaceC24449aM70877N.m95934c(strM111992a, requestBodyM92796a, this);
                    if (objM95934c == objF) {
                        return objF;
                    }
                    interfaceC24998b = interfaceC24998b2;
                    obj = objM95934c;
                    this.L$0 = requestBodyM92796a;
                    this.L$1 = null;
                    this.label = 2;
                    if (interfaceC24998b.emit((BaseDto) obj, this) == objF) {
                        return objF;
                    }
                }
            } else if (i11 == 1) {
                requestBodyM92796a = (RequestBody) this.L$1;
                interfaceC24998b = (InterfaceC24998b) this.L$0;
                ResultKt.m97107b(obj);
                this.L$0 = requestBodyM92796a;
                this.L$1 = null;
                this.label = 2;
                if (interfaceC24998b.emit((BaseDto) obj, this) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.viewmodel.MovieDetailViewModel$wantToSee$1$2 */
    @Metadata(m97099d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/tn/lib/net/bean/BaseDto;", "", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.moviedetail.viewmodel.MovieDetailViewModel$wantToSee$1$2", m97637f = "MovieDetailViewModel.kt", m97638l = {Sdk$SDKError.Reason.INVALID_RI_ENDPOINT_VALUE}, m97639m = "invokeSuspend")
    static final class C161962 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C161962(Continuation<? super C161962> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C161962 c161962 = new C161962(continuation);
            c161962.L$0 = interfaceC24998b;
            return c161962.invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC24998b interfaceC24998b = (InterfaceC24998b) this.L$0;
                C26866a.a.m104898f(C26866a.f81698a, "MovieDetailViewModel", "failed", false, 4, null);
                this.label = 1;
                if (interfaceC24998b.emit(null, this) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.moviedetail.viewmodel.MovieDetailViewModel$wantToSee$1$a */
    static final class C16197a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MovieDetailViewModel f54990a;

        C16197a(MovieDetailViewModel movieDetailViewModel) {
            this.f54990a = movieDetailViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(BaseDto baseDto, Continuation continuation) {
            C26866a.a.m104898f(C26866a.f81698a, "MovieDetailViewModel", TtmlNode.END, false, 4, null);
            this.f54990a.m70879R().mo14858q(baseDto);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MovieDetailViewModel$wantToSee$1(JsonObject jsonObject, MovieDetailViewModel movieDetailViewModel, Continuation<? super MovieDetailViewModel$wantToSee$1> continuation) {
        super(2, continuation);
        this.$json = jsonObject;
        this.this$0 = movieDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MovieDetailViewModel$wantToSee$1(this.$json, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((MovieDetailViewModel$wantToSee$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C161951(this.$json, this.this$0, null)), C25220y0.m99268b()), new C161962(null));
            C16197a c16197a = new C16197a(this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c16197a, this) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
        }
        return Unit.f75682a;
    }
}
