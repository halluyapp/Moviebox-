package com.transsion.usercenter.laboratory;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.mmkv.MMKV;
import com.transsion.p285ad.p286db.mcc.LocalMcc;
import com.transsion.p285ad.strategy.NationalInformationManager;
import com.vungle.ads.internal.protos.Sdk$SDKError;
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
import kotlinx.coroutines.AbstractC25207u0;
import kotlinx.coroutines.InterfaceC25149n0;
import p411fh.C23366a;
import p585lw.C25708g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.usercenter.laboratory.MccActivity$loadData$1", m97637f = "MccActivity.kt", m97638l = {Sdk$SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 129}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class MccActivity$loadData$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MccActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MccActivity$loadData$1(MccActivity mccActivity, Continuation<? super MccActivity$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = mccActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MccActivity$loadData$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((MccActivity$loadData$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String string;
        C25708g c25708g;
        RecyclerView recyclerView;
        RecyclerView.AbstractC4214m layoutManager;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.m97107b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m97107b(obj);
            }
            c25708g = this.this$0.binding;
            if (c25708g != null && (recyclerView = c25708g.f78172f) != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
                layoutManager.scrollToPosition(this.this$0.checkedPosition);
            }
            return Unit.f75682a;
        }
        ResultKt.m97107b(obj);
        NationalInformationManager nationalInformationManager = NationalInformationManager.f49737a;
        this.label = 1;
        obj = nationalInformationManager.m63660b(this);
        if (obj == objF) {
            return objF;
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        MMKV mmkvM92790c = C23366a.f71263a.m92790c();
        String str = "";
        if (mmkvM92790c != null && (string = mmkvM92790c.getString("sp_code", "")) != null) {
            str = string;
        }
        this.this$0.m84922f0(null);
        MccActivity mccActivity = this.this$0;
        int i12 = 0;
        for (Object obj2 : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.m97515u();
            }
            LocalMcc localMcc = (LocalMcc) obj2;
            if (TextUtils.equals(localMcc.getMcc(), str)) {
                arrayList.add(new C20520g1(true, localMcc));
                mccActivity.m84922f0(localMcc);
                mccActivity.checkedPosition = i12;
            } else {
                Boxing.m97631a(arrayList.add(new C20520g1(false, localMcc)));
            }
            i12 = i13;
        }
        C20517f1 c20517f1 = this.this$0.nationalInformationAdapter;
        if (c20517f1 != null) {
            c20517f1.mo36201n1(arrayList);
        }
        this.label = 2;
        if (AbstractC25207u0.m99223a(2000L, this) == objF) {
            return objF;
        }
        c25708g = this.this$0.binding;
        if (c25708g != null) {
            layoutManager.scrollToPosition(this.this$0.checkedPosition);
        }
        return Unit.f75682a;
    }
}
