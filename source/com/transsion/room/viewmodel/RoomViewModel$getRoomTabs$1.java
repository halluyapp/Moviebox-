package com.transsion.room.viewmodel;

import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.moviedetailapi.bean.RoomTabBean;
import com.transsion.moviedetailapi.bean.RoomTabItem;
import java.util.List;
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
import p524jq.InterfaceC24462a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.room.viewmodel.RoomViewModel$getRoomTabs$1", m97637f = "RoomViewModel.kt", m97638l = {296}, m97639m = "invokeSuspend")
final class RoomViewModel$getRoomTabs$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RoomViewModel this$0;

    /* JADX INFO: renamed from: com.transsion.room.viewmodel.RoomViewModel$getRoomTabs$1$1 */
    @Metadata(m97099d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/moviedetailapi/bean/RoomTabBean;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.room.viewmodel.RoomViewModel$getRoomTabs$1$1", m97637f = "RoomViewModel.kt", m97638l = {MBSupportMuteAdType.INTERSTITIAL_VIDEO, 289, 291}, m97639m = "invokeSuspend")
    static final class C183021 extends SuspendLambda implements Function2<InterfaceC24998b, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $savedVersion;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RoomViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C183021(RoomViewModel roomViewModel, String str, Continuation<? super C183021> continuation) {
            super(2, continuation);
            this.this$0 = roomViewModel;
            this.$savedVersion = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C183021 c183021 = new C183021(this.this$0, this.$savedVersion, continuation);
            c183021.L$0 = obj;
            return c183021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC24998b interfaceC24998b, Continuation<? super Unit> continuation) {
            return ((C183021) create(interfaceC24998b, continuation)).invokeSuspend(Unit.f75682a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC24998b interfaceC24998b;
            Object objF = IntrinsicsKt.m97630f();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    interfaceC24998b = (InterfaceC24998b) this.L$0;
                    ResultKt.m97107b(obj);
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
            InterfaceC24462a interfaceC24462aM77423K = this.this$0.m77423K();
            String str = this.$savedVersion;
            this.L$0 = interfaceC24998b;
            this.label = 1;
            obj = InterfaceC24462a.a.m96002c(interfaceC24462aM77423K, null, str, this, 1, null);
            if (obj == objF) {
                return objF;
            }
            BaseDto baseDto = (BaseDto) obj;
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

    /* JADX INFO: renamed from: com.transsion.room.viewmodel.RoomViewModel$getRoomTabs$1$2 */
    @Metadata(m97099d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m97100d2 = {"Lkotlinx/coroutines/flow/b;", "Lcom/transsion/moviedetailapi/bean/RoomTabBean;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/b;Ljava/lang/Throwable;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
    @DebugMetadata(m97636c = "com.transsion.room.viewmodel.RoomViewModel$getRoomTabs$1$2", m97637f = "RoomViewModel.kt", m97638l = {295}, m97639m = "invokeSuspend")
    static final class C183032 extends SuspendLambda implements Function3<InterfaceC24998b, Throwable, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C183032(Continuation<? super C183032> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC24998b interfaceC24998b, Throwable th2, Continuation<? super Unit> continuation) {
            C183032 c183032 = new C183032(continuation);
            c183032.L$0 = interfaceC24998b;
            return c183032.invokeSuspend(Unit.f75682a);
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

    /* JADX INFO: renamed from: com.transsion.room.viewmodel.RoomViewModel$getRoomTabs$1$a */
    static final class C18304a implements InterfaceC24998b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ RoomViewModel f59581a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f59582b;

        C18304a(RoomViewModel roomViewModel, String str) {
            this.f59581a = roomViewModel;
            this.f59582b = str;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0074  */
        /* JADX WARN: Code duplicated, block: B:29:0x0078  */
        @Override // kotlinx.coroutines.flow.InterfaceC24998b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(RoomTabBean roomTabBean, Continuation continuation) {
            String version;
            List<RoomTabItem> items;
            if (roomTabBean != null && (items = roomTabBean.getItems()) != null && !items.isEmpty()) {
                this.f59581a.m77428P(roomTabBean);
            }
            String version2 = roomTabBean != null ? roomTabBean.getVersion() : null;
            if (version2 == null || version2.length() == 0) {
                C26866a.f81698a.m104912c("RoomViewModel", "getRoomTabs version same, version:" + (roomTabBean != null ? roomTabBean.getVersion() : null), true);
            } else {
                if (roomTabBean == null || (version = roomTabBean.getVersion()) == null) {
                    version = "1";
                }
                if (Intrinsics.m97797c(version, this.f59582b)) {
                    if (roomTabBean != null) {
                    }
                    C26866a.f81698a.m104912c("RoomViewModel", "getRoomTabs version same, version:" + (roomTabBean != null ? roomTabBean.getVersion() : null), true);
                } else {
                    C26866a.a.m104898f(C26866a.f81698a, "RoomViewModel", "getRoomTabs update tab， savedVersion:" + this.f59582b + ", newVersion:" + (roomTabBean != null ? roomTabBean.getVersion() : null) + " ", false, 4, null);
                    this.f59581a.f59564d.mo14855n(roomTabBean);
                }
            }
            return Unit.f75682a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoomViewModel$getRoomTabs$1(RoomViewModel roomViewModel, Continuation<? super RoomViewModel$getRoomTabs$1> continuation) {
        super(2, continuation);
        this.this$0 = roomViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RoomViewModel$getRoomTabs$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((RoomViewModel$getRoomTabs$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.m97107b(obj);
            String string = C14496b.f50966a.m65344b().getString("k_room_tab_cache_version", "2493811379");
            String str = string != null ? string : "2493811379";
            C26866a.a.m104898f(C26866a.f81698a, "RoomViewModel", "getRoomTabs savedVersion：" + str, false, 4, null);
            InterfaceC24995a interfaceC24995aM98786e = AbstractC25001c.m98786e(AbstractC25001c.m98801t(AbstractC25001c.m98799r(new C183021(this.this$0, str, null)), C25220y0.m99268b()), new C183032(null));
            C18304a c18304a = new C18304a(this.this$0, str);
            this.label = 1;
            if (interfaceC24995aM98786e.mo12985a(c18304a, this) == objF) {
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
