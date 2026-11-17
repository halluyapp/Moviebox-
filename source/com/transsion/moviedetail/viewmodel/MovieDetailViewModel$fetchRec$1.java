package com.transsion.moviedetail.viewmodel;

import com.google.gson.JsonObject;
import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.moviedetailapi.SubjectType;
import com.transsion.moviedetailapi.bean.Subject;
import com.transsion.postdetail.bean.ForYouBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC25149n0;
import okhttp3.RequestBody;
import p411fh.C23367b;
import p523jn.InterfaceC24449a;
import p978zg.C29182a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.moviedetail.viewmodel.MovieDetailViewModel$fetchRec$1", m97637f = "MovieDetailViewModel.kt", m97638l = {193}, m97639m = "invokeSuspend")
final class MovieDetailViewModel$fetchRec$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isTablet;
    final /* synthetic */ int $page;
    final /* synthetic */ String $subjectId;
    final /* synthetic */ Integer $subjectType;
    int label;
    final /* synthetic */ MovieDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MovieDetailViewModel$fetchRec$1(String str, Integer num, int i11, boolean z11, MovieDetailViewModel movieDetailViewModel, Continuation<? super MovieDetailViewModel$fetchRec$1> continuation) {
        super(2, continuation);
        this.$subjectId = str;
        this.$subjectType = num;
        this.$page = i11;
        this.$isTablet = z11;
        this.this$0 = movieDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MovieDetailViewModel$fetchRec$1(this.$subjectId, this.$subjectType, this.$page, this.$isTablet, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((MovieDetailViewModel$fetchRec$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<Subject> items;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                C26866a.a.m104898f(C26866a.f81698a, "MovieDetailViewModel", "fetchRec,subjectId:" + this.$subjectId + ", subjectType:" + this.$subjectType + ",page: " + this.$page, false, 4, null);
                JsonObject jsonObject = new JsonObject();
                Integer num = this.$subjectType;
                int value = SubjectType.MUSIC.getValue();
                int i12 = 8;
                if (num == null || num.intValue() != value) {
                    Integer num2 = this.$subjectType;
                    int value2 = SubjectType.EDUCATION.getValue();
                    if (num2 == null || num2.intValue() != value2) {
                        if (!this.$isTablet) {
                            i12 = 6;
                        }
                    }
                }
                jsonObject.addProperty("subjectId", this.$subjectId);
                jsonObject.addProperty("perPage", Boxing.m97634d(i12));
                jsonObject.addProperty("page", Boxing.m97634d(this.$page));
                C23367b.a aVar = C23367b.f71265a;
                String string = jsonObject.toString();
                Intrinsics.m97801g(string, "toString(...)");
                RequestBody requestBodyM92796a = aVar.m92796a(string);
                if (requestBodyM92796a != null) {
                    InterfaceC24449a interfaceC24449aM70877N = this.this$0.m70877N();
                    String strM111992a = C29182a.f89053a.m111992a();
                    this.label = 1;
                    obj = interfaceC24449aM70877N.m95935d(strM111992a, requestBodyM92796a, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    items = null;
                }
                this.this$0.f54979j.mo14855n(items);
                return Unit.f75682a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m97107b(obj);
            BaseDto baseDto = (BaseDto) obj;
            if (baseDto == null) {
                items = null;
            } else {
                ForYouBean forYouBean = Intrinsics.m97797c(baseDto.getCode(), "0") ? (ForYouBean) baseDto.getData() : null;
                if (forYouBean != null) {
                    items = forYouBean.getItems();
                } else {
                    items = null;
                }
            }
            this.this$0.f54979j.mo14855n(items);
        } catch (Exception unused) {
            this.this$0.f54979j.mo14855n(null);
        }
        return Unit.f75682a;
    }
}
