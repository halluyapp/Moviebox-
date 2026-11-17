package com.transsion.home.viewmodel;

import androidx.p1004lifecycle.C3187b0;
import com.cloud.tmc.kernel.constants.TmcConstants;
import com.google.gson.JsonObject;
import com.transsion.home.bean.MovieBean;
import com.transsion.home.bean.MovieItem;
import com.transsion.home.bean.RefreshBaseDto;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import okhttp3.RequestBody;
import p411fh.C23367b;
import p978zg.C29182a;
import sl.InterfaceC27629c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.viewmodel.MovieViewModel$getMovieList$2", m97637f = "MovieViewModel.kt", m97638l = {75}, m97639m = "invokeSuspend")
final class MovieViewModel$getMovieList$2 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ JsonObject $jsonObject;
    final /* synthetic */ Map<String, String> $selectItems;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ MovieViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MovieViewModel$getMovieList$2(JsonObject jsonObject, MovieViewModel movieViewModel, boolean z11, String str, Map<String, String> map, Continuation<? super MovieViewModel$getMovieList$2> continuation) {
        super(2, continuation);
        this.$jsonObject = jsonObject;
        this.this$0 = movieViewModel;
        this.$isRefresh = z11;
        this.$channelId = str;
        this.$selectItems = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MovieViewModel$getMovieList$2(this.$jsonObject, this.this$0, this.$isRefresh, this.$channelId, this.$selectItems, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((MovieViewModel$getMovieList$2) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MovieViewModel movieViewModel;
        String str;
        boolean z11;
        Map<String, String> map;
        List<MovieItem> items;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                C23367b.a aVar = C23367b.f71265a;
                String string = this.$jsonObject.toString();
                Intrinsics.m97801g(string, "toString(...)");
                RequestBody requestBodyM92796a = aVar.m92796a(string);
                if (requestBodyM92796a != null) {
                    movieViewModel = this.this$0;
                    boolean z12 = this.$isRefresh;
                    str = this.$channelId;
                    Map<String, String> map2 = this.$selectItems;
                    InterfaceC27629c interfaceC27629c = movieViewModel.f53652e;
                    String strM111992a = C29182a.f89053a.m111992a();
                    this.L$0 = movieViewModel;
                    this.L$1 = str;
                    this.L$2 = map2;
                    this.Z$0 = z12;
                    this.label = 1;
                    obj = interfaceC27629c.m107476a(strM111992a, requestBodyM92796a, this);
                    if (obj == objF) {
                        return objF;
                    }
                    z11 = z12;
                    map = map2;
                }
                return Unit.f75682a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = this.Z$0;
            map = (Map) this.L$2;
            str = (String) this.L$1;
            movieViewModel = (MovieViewModel) this.L$0;
            ResultKt.m97107b(obj);
            RefreshBaseDto refreshBaseDto = (RefreshBaseDto) obj;
            refreshBaseDto.setRefresh(z11);
            MovieBean movieBean = (MovieBean) refreshBaseDto.getData();
            if (movieBean != null && (items = movieBean.getItems()) != null && items.size() > 1) {
                MovieItem movieItem = items.get(items.size() - 1);
                movieItem.setChannelId(str);
                movieItem.setSelectItems(map);
            }
            movieViewModel.m68961m().mo14855n(refreshBaseDto);
        } catch (Exception e11) {
            e11.printStackTrace();
            C3187b0 c3187b0M68961m = this.this$0.m68961m();
            String message = e11.getMessage();
            String str2 = message == null ? "" : message;
            String message2 = e11.getMessage();
            c3187b0M68961m.mo14855n(new RefreshBaseDto(str2, TmcConstants.COLD_OPEN_TYPE, null, message2 == null ? "" : message2, this.$isRefresh));
        }
        return Unit.f75682a;
    }
}
