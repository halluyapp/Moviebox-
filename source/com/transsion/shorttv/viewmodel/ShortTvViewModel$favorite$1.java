package com.transsion.shorttv.viewmodel;

import com.cloud.tmc.integration.event.EventConstants;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.shorttv.bean.ShortTVFavInfo;
import com.transsion.shorttv.bean.Subject;
import com.transsnet.flow.event.AppScopeVMlProvider;
import com.transsnet.flow.event.FlowEventBus;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC25149n0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONObject;
import p659os.C26721g;
import p659os.C26722h;
import p659os.C26723i;
import p790ts.InterfaceC27847a;
import p925xy.C28673c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv.viewmodel.ShortTvViewModel$favorite$1", m97637f = "ShortTvViewModel.kt", m97638l = {680}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class ShortTvViewModel$favorite$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $favorite;
    final /* synthetic */ ShortTVFavInfo $favoriteInfo;
    final /* synthetic */ Subject $subjectDetail;
    final /* synthetic */ String $subjectId;
    int label;
    final /* synthetic */ ShortTvViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvViewModel$favorite$1(ShortTvViewModel shortTvViewModel, Subject subject, String str, boolean z11, ShortTVFavInfo shortTVFavInfo, Continuation<? super ShortTvViewModel$favorite$1> continuation) {
        super(2, continuation);
        this.this$0 = shortTvViewModel;
        this.$subjectDetail = subject;
        this.$subjectId = str;
        this.$favorite = z11;
        this.$favoriteInfo = shortTVFavInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortTvViewModel$favorite$1(this.this$0, this.$subjectDetail, this.$subjectId, this.$favorite, this.$favoriteInfo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvViewModel$favorite$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                String str = this.$subjectId;
                boolean z11 = this.$favorite;
                ShortTvViewModel shortTvViewModel = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("subjectId", str);
                jSONObject.put(EventConstants.KEY_ACTION, !z11 ? 1 : 0);
                InterfaceC27847a interfaceC27847a = shortTvViewModel.f61624a;
                RequestBody.Companion companion2 = RequestBody.INSTANCE;
                String string = jSONObject.toString();
                Intrinsics.m97801g(string, "toString(...)");
                RequestBody requestBodyCreate = companion2.create(string, MediaType.INSTANCE.parse("application/json"));
                this.label = 1;
                obj = InterfaceC27847a.a.m108243a(interfaceC27847a, requestBodyCreate, null, this, 2, null);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            objM112707constructorimpl = Result.m112707constructorimpl((BaseDto) obj);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        ShortTVFavInfo shortTVFavInfo = this.$favoriteInfo;
        boolean z12 = this.$favorite;
        ShortTvViewModel shortTvViewModel2 = this.this$0;
        String str2 = this.$subjectId;
        if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
            if (shortTVFavInfo.getHasFavorite() != (!z12)) {
                shortTVFavInfo.setHasFavorite(!z12);
                if (z12) {
                    String favoriteNum = shortTVFavInfo.getFavoriteNum();
                    shortTVFavInfo.setFavoriteNum(String.valueOf((favoriteNum != null ? Long.parseLong(favoriteNum) : 1L) - 1));
                } else {
                    String favoriteNum2 = shortTVFavInfo.getFavoriteNum();
                    shortTVFavInfo.setFavoriteNum(String.valueOf((favoriteNum2 != null ? Long.parseLong(favoriteNum2) : 0L) + 1));
                }
                shortTvViewModel2.f61601D.mo14858q(Boxing.m97631a(!z12));
                shortTvViewModel2.f61603F.mo14858q(!z12 ? C26721g.f81164a : C26722h.f81165a);
                C28673c c28673c = new C28673c(str2, true ^ shortTVFavInfo.getHasFavorite(), String.valueOf(shortTVFavInfo.getFavoriteNum()));
                FlowEventBus flowEventBus = (FlowEventBus) AppScopeVMlProvider.INSTANCE.getApplicationScopeViewModel(FlowEventBus.class);
                String name = C28673c.class.getName();
                Intrinsics.m97801g(name, "getName(...)");
                flowEventBus.postEvent(name, c28673c, 0L);
                shortTvViewModel2.m80327r1(str2, shortTVFavInfo);
            }
        }
        ShortTvViewModel shortTvViewModel3 = this.this$0;
        boolean z13 = this.$favorite;
        if (Result.m112710exceptionOrNullimpl(objM112707constructorimpl) != null) {
            shortTvViewModel3.f61601D.mo14858q(Boxing.m97631a(z13));
            shortTvViewModel3.f61603F.mo14858q(C26723i.f81166a);
        }
        this.this$0.m80398x0();
        return Unit.f75682a;
    }
}
