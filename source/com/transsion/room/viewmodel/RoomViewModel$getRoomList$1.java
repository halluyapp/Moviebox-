package com.transsion.room.viewmodel;

import android.location.Address;
import com.blankj.utilcode.util.AbstractC5796o;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.moviedetailapi.bean.RoomBean;
import com.transsion.room.api.bean.RoomGeo;
import com.transsion.room.api.bean.RoomRequestEntity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p524jq.InterfaceC24462a;
import p978zg.C29182a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.room.viewmodel.RoomViewModel$getRoomList$1", m97637f = "RoomViewModel.kt", m97638l = {270}, m97639m = "invokeSuspend")
final class RoomViewModel$getRoomList$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Address $address;
    final /* synthetic */ int $cid;
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ Double $lat;
    final /* synthetic */ Double $lon;
    final /* synthetic */ String $page;
    final /* synthetic */ int $perPage;
    int label;
    final /* synthetic */ RoomViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.room.viewmodel.RoomViewModel$getRoomList$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/moviedetailapi/bean/RoomBean;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.room.viewmodel.RoomViewModel$getRoomList$1$1", m97637f = "RoomViewModel.kt", m97638l = {261, 263, 265}, m97639m = "invokeSuspend")
    static final class C182991 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ Address $address;
        final /* synthetic */ int $cid;
        final /* synthetic */ Double $lat;
        final /* synthetic */ Double $lon;
        final /* synthetic */ String $page;
        final /* synthetic */ int $perPage;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RoomViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C182991(Double d11, Double d12, Address address, String str, int i11, int i12, RoomViewModel roomViewModel, Continuation<? super C182991> continuation) {
            super(2, continuation);
            this.$lon = d11;
            this.$lat = d12;
            this.$address = address;
            this.$page = str;
            this.$perPage = i11;
            this.$cid = i12;
            this.this$0 = roomViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C182991 c182991 = new C182991(this.$lon, this.$lat, this.$address, this.$page, this.$perPage, this.$cid, this.this$0, continuation);
            c182991.L$0 = obj;
            return c182991;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C182991) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC24998b interfaceC24998b;
            RoomGeo roomGeo;
            Object objM95996l;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    interfaceC24998b = (InterfaceC24998b) this.L$0;
                    ResultKt.m97107b(obj);
                    objM95996l = obj;
                } else {
                    if (i11 != 2 && i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m97107b(obj);
                }
                return Unit.f75682a;
            }
            ResultKt.m97107b(obj);
            interfaceC24998b = (InterfaceC24998b) this.L$0;
            if (this.$lon == null || this.$lat == null) {
                roomGeo = null;
            } else {
                double dDoubleValue = this.$lon.doubleValue();
                double dDoubleValue2 = this.$lat.doubleValue();
                Address address = this.$address;
                String countryCode = address != null ? address.getCountryCode() : null;
                Address address2 = this.$address;
                String adminArea = address2 != null ? address2.getAdminArea() : null;
                Address address3 = this.$address;
                roomGeo = new RoomGeo(dDoubleValue, dDoubleValue2, countryCode, adminArea, address3 != null ? address3.getLocality() : null, null, null, 96, null);
            }
            RequestBody.Companion companion = RequestBody.INSTANCE;
            String strM27447j = AbstractC5796o.m27447j(new RoomRequestEntity(this.$page, this.$perPage, 0, Boxing.m97634d(this.$cid), roomGeo, null, 32, null));
            Intrinsics.m97801g(strM27447j, "toJson(...)");
            RequestBody requestBodyCreate = companion.create(strM27447j, MediaType.INSTANCE.parse("application/json"));
            InterfaceC24462a interfaceC24462aM77423K = this.this$0.m77423K();
            String strM111992a = C29182a.f89053a.m111992a();
            this.L$0 = interfaceC24998b;
            this.label = 1;
            objM95996l = interfaceC24462aM77423K.m95996l(strM111992a, requestBodyCreate, this);
            if (objM95996l == objF) {
                return objF;
            }
            BaseDto baseDto = (BaseDto) objM95996l;
            if (Intrinsics.m97797c(baseDto.getCode(), "0")) {
                Object data = baseDto.getData();
                this.L$0 = null;
                this.label = 3;
                if (interfaceC24998b.emit(data, this) == objF) {
                    return objF;
                }
            } else {
                this.L$0 = null;
                this.label = 2;
                if (interfaceC24998b.emit(null, this) == objF) {
                    return objF;
                }
            }
            return Unit.f75682a;
        }
    }

    /* JADX INFO: renamed from: com.transsion.room.viewmodel.RoomViewModel$getRoomList$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/moviedetailapi/bean/RoomBean;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.room.viewmodel.RoomViewModel$getRoomList$1$2", m97637f = "RoomViewModel.kt", m97638l = {269}, m97639m = "invokeSuspend")
    static final class C183002 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C183002(Continuation<? super C183002> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C183002 c183002 = new C183002(continuation);
            c183002.L$0 = interfaceC24998b;
            return c183002.invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                InterfaceC24998b interfaceC24998b = (InterfaceC24998b) this.L$0;
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

    /* JADX INFO: renamed from: com.transsion.room.viewmodel.RoomViewModel$getRoomList$1$a */
    static final class C18301a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f59579a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ RoomViewModel f59580b;

        C18301a(boolean z11, RoomViewModel roomViewModel) {
            this.f59579a = z11;
            this.f59580b = roomViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(RoomBean roomBean, Continuation continuation) {
            if (roomBean != null) {
                roomBean.setRefresh(this.f59579a);
            }
            this.f59580b.f59569i.mo14855n(roomBean);
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoomViewModel$getRoomList$1(Double d11, Double d12, Address address, String str, int i11, int i12, RoomViewModel roomViewModel, boolean z11, Continuation<? super RoomViewModel$getRoomList$1> continuation) {
        super(2, continuation);
        this.$lon = d11;
        this.$lat = d12;
        this.$address = address;
        this.$page = str;
        this.$perPage = i11;
        this.$cid = i12;
        this.this$0 = roomViewModel;
        this.$isRefresh = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RoomViewModel$getRoomList$1(this.$lon, this.$lat, this.$address, this.$page, this.$perPage, this.$cid, this.this$0, this.$isRefresh, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((RoomViewModel$getRoomList$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C182991(this.$lon, this.$lat, this.$address, this.$page, this.$perPage, this.$cid, this.this$0, null)), C25220y0.m99268b()), new C183002(null));
            C18301a c18301a = new C18301a(this.$isRefresh, this.this$0);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c18301a, this) == objF) {
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
