package com.transsion.videodetail.music.data;

import com.cloud.tmc.integration.event.EventConstants;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.videodetail.music.bean.LikeListActionEnum;
import com.transsion.videodetail.music.bean.MusicLikedRemoteActionBean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import mx.C25917a;
import okhttp3.RequestBody;
import org.json.JSONObject;
import p411fh.C23367b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.videodetail.music.data.MusicLikedFragmentViewModel$likedMusic$1", m97637f = "MusicLikedFragmentViewModel.kt", m97638l = {66}, m97639m = "invokeSuspend")
final class MusicLikedFragmentViewModel$likedMusic$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ LikeListActionEnum $action;
    final /* synthetic */ String $subjectId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MusicLikedFragmentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MusicLikedFragmentViewModel$likedMusic$1(String str, LikeListActionEnum likeListActionEnum, MusicLikedFragmentViewModel musicLikedFragmentViewModel, Continuation<? super MusicLikedFragmentViewModel$likedMusic$1> continuation) {
        super(2, continuation);
        this.$subjectId = str;
        this.$action = likeListActionEnum;
        this.this$0 = musicLikedFragmentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MusicLikedFragmentViewModel$likedMusic$1 musicLikedFragmentViewModel$likedMusic$1 = new MusicLikedFragmentViewModel$likedMusic$1(this.$subjectId, this.$action, this.this$0, continuation);
        musicLikedFragmentViewModel$likedMusic$1.L$0 = obj;
        return musicLikedFragmentViewModel$likedMusic$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((MusicLikedFragmentViewModel$likedMusic$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0083  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM112707constructorimpl;
        MusicLikedFragmentViewModel musicLikedFragmentViewModel;
        String str;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                String str2 = this.$subjectId;
                LikeListActionEnum likeListActionEnum = this.$action;
                MusicLikedFragmentViewModel musicLikedFragmentViewModel2 = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("subjectId", str2);
                jSONObject.put(EventConstants.KEY_ACTION, likeListActionEnum.getValue());
                InterfaceC20985a interfaceC20985aM86230z = musicLikedFragmentViewModel2.m86230z();
                C23367b.a aVar = C23367b.f71265a;
                String string = jSONObject.toString();
                Intrinsics.m97801g(string, "toString(...)");
                RequestBody requestBodyM92796a = aVar.m92796a(string);
                this.L$0 = musicLikedFragmentViewModel2;
                this.label = 1;
                obj = InterfaceC20985a.a.m86243b(interfaceC20985aM86230z, requestBodyM92796a, null, this, 2, null);
                if (obj == objF) {
                    return objF;
                }
                musicLikedFragmentViewModel = musicLikedFragmentViewModel2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                musicLikedFragmentViewModel = (MusicLikedFragmentViewModel) this.L$0;
                ResultKt.m97107b(obj);
            }
            BaseDto baseDto = (BaseDto) obj;
            MusicLikedRemoteActionBean musicLikedRemoteActionBean = (MusicLikedRemoteActionBean) baseDto.getData();
            if (musicLikedRemoteActionBean != null) {
                Integer action = musicLikedRemoteActionBean.getAction();
                int value = LikeListActionEnum.ADD.getValue();
                if (action != null && action.intValue() == value) {
                    str = "收藏";
                } else {
                    str = "取消";
                }
            } else {
                str = "取消";
            }
            C25917a.f79141a.m101735a(musicLikedFragmentViewModel.m86227t() + " --> likedMusic() --> " + str + "成功,同步本地数据库 --> likeMusic = " + baseDto.getData());
            objM112707constructorimpl = Result.m112707constructorimpl(Unit.f75682a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th2));
        }
        MusicLikedFragmentViewModel musicLikedFragmentViewModel3 = this.this$0;
        Throwable thM112710exceptionOrNullimpl = Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        if (thM112710exceptionOrNullimpl != null) {
            C25917a.f79141a.m101736b(musicLikedFragmentViewModel3.m86227t() + " --> likedMusic() --> it = " + thM112710exceptionOrNullimpl);
        }
        return Unit.f75682a;
    }
}
