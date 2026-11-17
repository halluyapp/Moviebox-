package com.transsion.shorttv_pugc.viewmodel;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.shorttv_pugc.ShorttvModel;
import com.transsion.shorttv_pugc.utils.ShortTvExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.InterfaceC25149n0;
import p743rh.C27287m;
import p883wt.InterfaceC28436a;
import p920xt.InterfaceC28661f;
import pg.C26866a;
import tt.AbstractC27849b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.shorttv_pugc.viewmodel.ShortTvViewModel$requestVideoCollection$1", m97637f = "ShortTvViewModel.kt", m97638l = {255, 256, 259}, m97639m = "invokeSuspend")
@SourceDebugExtension
final class ShortTvViewModel$requestVideoCollection$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $collectionId;
    final /* synthetic */ int $endPosition;
    final /* synthetic */ int $startPosition;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ ShortTvViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortTvViewModel$requestVideoCollection$1(String str, int i11, int i12, ShortTvViewModel shortTvViewModel, Continuation<? super ShortTvViewModel$requestVideoCollection$1> continuation) {
        super(2, continuation);
        this.$collectionId = str;
        this.$startPosition = i11;
        this.$endPosition = i12;
        this.this$0 = shortTvViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShortTvViewModel$requestVideoCollection$1 shortTvViewModel$requestVideoCollection$1 = new ShortTvViewModel$requestVideoCollection$1(this.$collectionId, this.$startPosition, this.$endPosition, this.this$0, continuation);
        shortTvViewModel$requestVideoCollection$1.L$0 = obj;
        return shortTvViewModel$requestVideoCollection$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((ShortTvViewModel$requestVideoCollection$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x029c A[Catch: all -> 0x0039, TryCatch #4 {all -> 0x0039, blocks: (B:8:0x0034, B:87:0x0262, B:89:0x026a, B:91:0x0270, B:92:0x0276, B:94:0x027c, B:96:0x0285, B:97:0x0288, B:99:0x0290, B:100:0x0296, B:102:0x029c, B:106:0x02b4, B:108:0x02b8, B:110:0x02c6, B:112:0x02eb, B:114:0x02f1, B:115:0x02f7, B:117:0x02fd, B:121:0x0315, B:123:0x0319, B:125:0x0328, B:124:0x0321, B:128:0x0330, B:134:0x033f, B:15:0x005c, B:69:0x0207, B:71:0x0210, B:72:0x021b, B:74:0x0221, B:76:0x022d, B:77:0x0231, B:80:0x023c, B:82:0x0245, B:84:0x024b, B:79:0x0237, B:18:0x007a), top: B:160:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02b8 A[Catch: all -> 0x0039, TryCatch #4 {all -> 0x0039, blocks: (B:8:0x0034, B:87:0x0262, B:89:0x026a, B:91:0x0270, B:92:0x0276, B:94:0x027c, B:96:0x0285, B:97:0x0288, B:99:0x0290, B:100:0x0296, B:102:0x029c, B:106:0x02b4, B:108:0x02b8, B:110:0x02c6, B:112:0x02eb, B:114:0x02f1, B:115:0x02f7, B:117:0x02fd, B:121:0x0315, B:123:0x0319, B:125:0x0328, B:124:0x0321, B:128:0x0330, B:134:0x033f, B:15:0x005c, B:69:0x0207, B:71:0x0210, B:72:0x021b, B:74:0x0221, B:76:0x022d, B:77:0x0231, B:80:0x023c, B:82:0x0245, B:84:0x024b, B:79:0x0237, B:18:0x007a), top: B:160:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x02c6 A[Catch: all -> 0x0039, TryCatch #4 {all -> 0x0039, blocks: (B:8:0x0034, B:87:0x0262, B:89:0x026a, B:91:0x0270, B:92:0x0276, B:94:0x027c, B:96:0x0285, B:97:0x0288, B:99:0x0290, B:100:0x0296, B:102:0x029c, B:106:0x02b4, B:108:0x02b8, B:110:0x02c6, B:112:0x02eb, B:114:0x02f1, B:115:0x02f7, B:117:0x02fd, B:121:0x0315, B:123:0x0319, B:125:0x0328, B:124:0x0321, B:128:0x0330, B:134:0x033f, B:15:0x005c, B:69:0x0207, B:71:0x0210, B:72:0x021b, B:74:0x0221, B:76:0x022d, B:77:0x0231, B:80:0x023c, B:82:0x0245, B:84:0x024b, B:79:0x0237, B:18:0x007a), top: B:160:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:114:0x02f1 A[Catch: all -> 0x0039, TryCatch #4 {all -> 0x0039, blocks: (B:8:0x0034, B:87:0x0262, B:89:0x026a, B:91:0x0270, B:92:0x0276, B:94:0x027c, B:96:0x0285, B:97:0x0288, B:99:0x0290, B:100:0x0296, B:102:0x029c, B:106:0x02b4, B:108:0x02b8, B:110:0x02c6, B:112:0x02eb, B:114:0x02f1, B:115:0x02f7, B:117:0x02fd, B:121:0x0315, B:123:0x0319, B:125:0x0328, B:124:0x0321, B:128:0x0330, B:134:0x033f, B:15:0x005c, B:69:0x0207, B:71:0x0210, B:72:0x021b, B:74:0x0221, B:76:0x022d, B:77:0x0231, B:80:0x023c, B:82:0x0245, B:84:0x024b, B:79:0x0237, B:18:0x007a), top: B:160:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x02fd A[Catch: all -> 0x0039, TryCatch #4 {all -> 0x0039, blocks: (B:8:0x0034, B:87:0x0262, B:89:0x026a, B:91:0x0270, B:92:0x0276, B:94:0x027c, B:96:0x0285, B:97:0x0288, B:99:0x0290, B:100:0x0296, B:102:0x029c, B:106:0x02b4, B:108:0x02b8, B:110:0x02c6, B:112:0x02eb, B:114:0x02f1, B:115:0x02f7, B:117:0x02fd, B:121:0x0315, B:123:0x0319, B:125:0x0328, B:124:0x0321, B:128:0x0330, B:134:0x033f, B:15:0x005c, B:69:0x0207, B:71:0x0210, B:72:0x021b, B:74:0x0221, B:76:0x022d, B:77:0x0231, B:80:0x023c, B:82:0x0245, B:84:0x024b, B:79:0x0237, B:18:0x007a), top: B:160:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0319 A[Catch: all -> 0x0039, TryCatch #4 {all -> 0x0039, blocks: (B:8:0x0034, B:87:0x0262, B:89:0x026a, B:91:0x0270, B:92:0x0276, B:94:0x027c, B:96:0x0285, B:97:0x0288, B:99:0x0290, B:100:0x0296, B:102:0x029c, B:106:0x02b4, B:108:0x02b8, B:110:0x02c6, B:112:0x02eb, B:114:0x02f1, B:115:0x02f7, B:117:0x02fd, B:121:0x0315, B:123:0x0319, B:125:0x0328, B:124:0x0321, B:128:0x0330, B:134:0x033f, B:15:0x005c, B:69:0x0207, B:71:0x0210, B:72:0x021b, B:74:0x0221, B:76:0x022d, B:77:0x0231, B:80:0x023c, B:82:0x0245, B:84:0x024b, B:79:0x0237, B:18:0x007a), top: B:160:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0321 A[Catch: all -> 0x0039, TryCatch #4 {all -> 0x0039, blocks: (B:8:0x0034, B:87:0x0262, B:89:0x026a, B:91:0x0270, B:92:0x0276, B:94:0x027c, B:96:0x0285, B:97:0x0288, B:99:0x0290, B:100:0x0296, B:102:0x029c, B:106:0x02b4, B:108:0x02b8, B:110:0x02c6, B:112:0x02eb, B:114:0x02f1, B:115:0x02f7, B:117:0x02fd, B:121:0x0315, B:123:0x0319, B:125:0x0328, B:124:0x0321, B:128:0x0330, B:134:0x033f, B:15:0x005c, B:69:0x0207, B:71:0x0210, B:72:0x021b, B:74:0x0221, B:76:0x022d, B:77:0x0231, B:80:0x023c, B:82:0x0245, B:84:0x024b, B:79:0x0237, B:18:0x007a), top: B:160:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x032c  */
    /* JADX WARN: Code duplicated, block: B:141:0x035a  */
    /* JADX WARN: Code duplicated, block: B:143:0x0363  */
    /* JADX WARN: Code duplicated, block: B:145:0x0377  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0313 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0210 A[Catch: all -> 0x0039, TryCatch #4 {all -> 0x0039, blocks: (B:8:0x0034, B:87:0x0262, B:89:0x026a, B:91:0x0270, B:92:0x0276, B:94:0x027c, B:96:0x0285, B:97:0x0288, B:99:0x0290, B:100:0x0296, B:102:0x029c, B:106:0x02b4, B:108:0x02b8, B:110:0x02c6, B:112:0x02eb, B:114:0x02f1, B:115:0x02f7, B:117:0x02fd, B:121:0x0315, B:123:0x0319, B:125:0x0328, B:124:0x0321, B:128:0x0330, B:134:0x033f, B:15:0x005c, B:69:0x0207, B:71:0x0210, B:72:0x021b, B:74:0x0221, B:76:0x022d, B:77:0x0231, B:80:0x023c, B:82:0x0245, B:84:0x024b, B:79:0x0237, B:18:0x007a), top: B:160:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0221 A[Catch: all -> 0x0039, TryCatch #4 {all -> 0x0039, blocks: (B:8:0x0034, B:87:0x0262, B:89:0x026a, B:91:0x0270, B:92:0x0276, B:94:0x027c, B:96:0x0285, B:97:0x0288, B:99:0x0290, B:100:0x0296, B:102:0x029c, B:106:0x02b4, B:108:0x02b8, B:110:0x02c6, B:112:0x02eb, B:114:0x02f1, B:115:0x02f7, B:117:0x02fd, B:121:0x0315, B:123:0x0319, B:125:0x0328, B:124:0x0321, B:128:0x0330, B:134:0x033f, B:15:0x005c, B:69:0x0207, B:71:0x0210, B:72:0x021b, B:74:0x0221, B:76:0x022d, B:77:0x0231, B:80:0x023c, B:82:0x0245, B:84:0x024b, B:79:0x0237, B:18:0x007a), top: B:160:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0237 A[Catch: all -> 0x0039, TryCatch #4 {all -> 0x0039, blocks: (B:8:0x0034, B:87:0x0262, B:89:0x026a, B:91:0x0270, B:92:0x0276, B:94:0x027c, B:96:0x0285, B:97:0x0288, B:99:0x0290, B:100:0x0296, B:102:0x029c, B:106:0x02b4, B:108:0x02b8, B:110:0x02c6, B:112:0x02eb, B:114:0x02f1, B:115:0x02f7, B:117:0x02fd, B:121:0x0315, B:123:0x0319, B:125:0x0328, B:124:0x0321, B:128:0x0330, B:134:0x033f, B:15:0x005c, B:69:0x0207, B:71:0x0210, B:72:0x021b, B:74:0x0221, B:76:0x022d, B:77:0x0231, B:80:0x023c, B:82:0x0245, B:84:0x024b, B:79:0x0237, B:18:0x007a), top: B:160:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0261 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x027c A[Catch: all -> 0x0039, TryCatch #4 {all -> 0x0039, blocks: (B:8:0x0034, B:87:0x0262, B:89:0x026a, B:91:0x0270, B:92:0x0276, B:94:0x027c, B:96:0x0285, B:97:0x0288, B:99:0x0290, B:100:0x0296, B:102:0x029c, B:106:0x02b4, B:108:0x02b8, B:110:0x02c6, B:112:0x02eb, B:114:0x02f1, B:115:0x02f7, B:117:0x02fd, B:121:0x0315, B:123:0x0319, B:125:0x0328, B:124:0x0321, B:128:0x0330, B:134:0x033f, B:15:0x005c, B:69:0x0207, B:71:0x0210, B:72:0x021b, B:74:0x0221, B:76:0x022d, B:77:0x0231, B:80:0x023c, B:82:0x0245, B:84:0x024b, B:79:0x0237, B:18:0x007a), top: B:160:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0285 A[Catch: all -> 0x0039, TryCatch #4 {all -> 0x0039, blocks: (B:8:0x0034, B:87:0x0262, B:89:0x026a, B:91:0x0270, B:92:0x0276, B:94:0x027c, B:96:0x0285, B:97:0x0288, B:99:0x0290, B:100:0x0296, B:102:0x029c, B:106:0x02b4, B:108:0x02b8, B:110:0x02c6, B:112:0x02eb, B:114:0x02f1, B:115:0x02f7, B:117:0x02fd, B:121:0x0315, B:123:0x0319, B:125:0x0328, B:124:0x0321, B:128:0x0330, B:134:0x033f, B:15:0x005c, B:69:0x0207, B:71:0x0210, B:72:0x021b, B:74:0x0221, B:76:0x022d, B:77:0x0231, B:80:0x023c, B:82:0x0245, B:84:0x024b, B:79:0x0237, B:18:0x007a), top: B:160:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0290 A[Catch: all -> 0x0039, TryCatch #4 {all -> 0x0039, blocks: (B:8:0x0034, B:87:0x0262, B:89:0x026a, B:91:0x0270, B:92:0x0276, B:94:0x027c, B:96:0x0285, B:97:0x0288, B:99:0x0290, B:100:0x0296, B:102:0x029c, B:106:0x02b4, B:108:0x02b8, B:110:0x02c6, B:112:0x02eb, B:114:0x02f1, B:115:0x02f7, B:117:0x02fd, B:121:0x0315, B:123:0x0319, B:125:0x0328, B:124:0x0321, B:128:0x0330, B:134:0x033f, B:15:0x005c, B:69:0x0207, B:71:0x0210, B:72:0x021b, B:74:0x0221, B:76:0x022d, B:77:0x0231, B:80:0x023c, B:82:0x0245, B:84:0x024b, B:79:0x0237, B:18:0x007a), top: B:160:0x0010 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        Object objM112707constructorimpl;
        ShortTvViewModel shortTvViewModel;
        List list2;
        Object objM109871e;
        ShortTvViewModel shortTvViewModel2;
        List list3;
        Ref.IntRef intRef;
        String str;
        InterfaceC25149n0 interfaceC25149n0;
        String[] strArr;
        Object objM109870d;
        String str2;
        ShortTvViewModel shortTvViewModel3;
        Ref.IntRef intRef2;
        ShorttvModel.UGCVideoList uGCVideoList;
        BaseDto baseDto;
        List<ShorttvModel.UGCVideo> items;
        List arrayList;
        InterfaceC28661f interfaceC28661fM81403O;
        ArrayList arrayList2;
        Iterator<T> it;
        String ugcVideoId;
        ShorttvModel.PlayMultiDto playMultiDto;
        List<ShorttvModel.PlayStreamItem> items2;
        ShorttvModel.PlayStreamItem playStreamItem;
        List<ShorttvModel.UGCVideo> items3;
        Iterator<T> it2;
        Object next;
        ShorttvModel.UGCVideo uGCVideo;
        List listM81433v;
        Iterator it3;
        Object next2;
        ShorttvModel.UGCVideo uGCVideo2;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        int i12 = 0;
        Unit unit = null;
        try {
            try {
                if (i11 == 0) {
                    ResultKt.m97107b(obj);
                    InterfaceC25149n0 interfaceC25149n1 = (InterfaceC25149n0) this.L$0;
                    String str3 = this.$collectionId;
                    if (str3 == null || str3.length() == 0) {
                        return Unit.f75682a;
                    }
                    Ref.IntRef intRef3 = new Ref.IntRef();
                    int iMax = Math.max(1, this.$startPosition);
                    intRef3.element = iMax;
                    int i13 = this.$endPosition;
                    if ((iMax != 0 || i13 != 0) && iMax <= i13) {
                        C26866a.a.m104898f(C26866a.f81698a, "ShortTvViewModel", "requestVideoCollection, startPosition: " + iMax + ", endPosition: " + i13, false, 4, null);
                        List listM81437z = this.this$0.m81437z();
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.m97516v(listM81437z, 10));
                        Iterator it4 = listM81437z.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(Boxing.m97634d(((ShorttvModel.UGCVideo) it4.next()).getEp()));
                        }
                        boolean zM97797c = Intrinsics.m97797c(CollectionsKt.m97345W0(arrayList3), CollectionsKt.m97345W0(new IntRange(intRef3.element, i13)));
                        C26866a.a aVar = C26866a.f81698a;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("isDifferent: ");
                        sb2.append(!zM97797c);
                        C26866a.a.m104898f(aVar, "ShortTvViewModel", sb2.toString(), false, 4, null);
                        if (zM97797c) {
                            return Unit.f75682a;
                        }
                        if (C27287m.f83003a.m106330e()) {
                            ArrayList arrayList4 = new ArrayList();
                            ShortTvViewModel shortTvViewModel4 = this.this$0;
                            String str4 = this.$collectionId;
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                InterfaceC28436a interfaceC28436a = shortTvViewModel4.f62499a;
                                int i14 = intRef3.element;
                                this.L$0 = intRef3;
                                this.L$1 = arrayList4;
                                this.L$2 = shortTvViewModel4;
                                this.L$3 = str4;
                                this.L$4 = interfaceC25149n1;
                                this.label = 1;
                                list2 = arrayList4;
                                try {
                                    objM109871e = InterfaceC28436a.a.m109871e(interfaceC28436a, str4, i14, i13, 0, 0, null, this, 56, null);
                                    if (objM109871e == objF) {
                                        return objF;
                                    }
                                    shortTvViewModel2 = shortTvViewModel4;
                                    list3 = list2;
                                    intRef = intRef3;
                                    str = str4;
                                    interfaceC25149n0 = interfaceC25149n1;
                                } catch (Throwable th2) {
                                    th = th2;
                                    list = list2;
                                    Result.Companion companion2 = Result.INSTANCE;
                                    objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th));
                                    shortTvViewModel = this.this$0;
                                    if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
                                        if (list.isEmpty()) {
                                            shortTvViewModel.f62520v.mo14855n(TuplesKt.m97108a(AbstractC27849b.a.f85558a, shortTvViewModel.m81433v()));
                                            return Unit.f75682a;
                                        }
                                        ShortTvExtKt.m81318u(list, shortTvViewModel.m81433v());
                                        ShortTvExtKt.m81305h(shortTvViewModel.m81437z(), list);
                                        ShortTvExtKt.m81302e(shortTvViewModel.m81426p(), list);
                                        shortTvViewModel.f62520v.mo14855n(TuplesKt.m97108a(AbstractC27849b.b.f85559a, list));
                                    }
                                    Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                                    Result.m112706boximpl(objM112707constructorimpl);
                                    return Unit.f75682a;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                list2 = arrayList4;
                                list = list2;
                                Result.Companion companion3 = Result.INSTANCE;
                                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th));
                                shortTvViewModel = this.this$0;
                                if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
                                    if (list.isEmpty()) {
                                        shortTvViewModel.f62520v.mo14855n(TuplesKt.m97108a(AbstractC27849b.a.f85558a, shortTvViewModel.m81433v()));
                                        return Unit.f75682a;
                                    }
                                    ShortTvExtKt.m81318u(list, shortTvViewModel.m81433v());
                                    ShortTvExtKt.m81305h(shortTvViewModel.m81437z(), list);
                                    ShortTvExtKt.m81302e(shortTvViewModel.m81426p(), list);
                                    shortTvViewModel.f62520v.mo14855n(TuplesKt.m97108a(AbstractC27849b.b.f85559a, list));
                                }
                                Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                                Result.m112706boximpl(objM112707constructorimpl);
                                return Unit.f75682a;
                            }
                        } else {
                            this.this$0.f62520v.mo14855n(TuplesKt.m97108a(AbstractC27849b.a.f85558a, this.this$0.m81433v()));
                        }
                        return Unit.f75682a;
                    }
                    return Unit.f75682a;
                }
                if (i11 == 1) {
                    InterfaceC25149n0 interfaceC25149n2 = (InterfaceC25149n0) this.L$4;
                    String str5 = (String) this.L$3;
                    ShortTvViewModel shortTvViewModel5 = (ShortTvViewModel) this.L$2;
                    List list4 = (List) this.L$1;
                    Ref.IntRef intRef4 = (Ref.IntRef) this.L$0;
                    ResultKt.m97107b(obj);
                    interfaceC25149n0 = interfaceC25149n2;
                    str = str5;
                    shortTvViewModel2 = shortTvViewModel5;
                    list3 = list4;
                    objM109871e = obj;
                    intRef = intRef4;
                } else if (i11 == 2) {
                    ShorttvModel.UGCVideoList uGCVideoList2 = (ShorttvModel.UGCVideoList) this.L$5;
                    InterfaceC25149n0 interfaceC25149n3 = (InterfaceC25149n0) this.L$4;
                    str2 = (String) this.L$3;
                    shortTvViewModel3 = (ShortTvViewModel) this.L$2;
                    list = (List) this.L$1;
                    intRef2 = (Ref.IntRef) this.L$0;
                    ResultKt.m97107b(obj);
                    objM109870d = obj;
                    interfaceC25149n0 = interfaceC25149n3;
                    uGCVideoList = uGCVideoList2;
                    baseDto = (BaseDto) objM109870d;
                    items = uGCVideoList.getItems();
                    if (items != null) {
                        arrayList2 = new ArrayList();
                        it = items.iterator();
                        while (it.hasNext()) {
                            ugcVideoId = ((ShorttvModel.UGCVideo) it.next()).getUgcVideoId();
                            if (ugcVideoId != null) {
                                arrayList2.add(ugcVideoId);
                            }
                        }
                        arrayList = CollectionsKt.m97343U0(arrayList2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                    } else {
                        arrayList = new ArrayList();
                    }
                    if (!arrayList.isEmpty() && (interfaceC28661fM81403O = shortTvViewModel3.m81403O()) != null) {
                        this.L$0 = intRef2;
                        this.L$1 = list;
                        this.L$2 = shortTvViewModel3;
                        this.L$3 = str2;
                        this.L$4 = interfaceC25149n0;
                        this.L$5 = uGCVideoList;
                        this.L$6 = baseDto;
                        this.label = 3;
                        if (interfaceC28661fM81403O.mo73794a(str2, arrayList, this) == objF) {
                            return objF;
                        }
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    baseDto = (BaseDto) this.L$6;
                    uGCVideoList = (ShorttvModel.UGCVideoList) this.L$5;
                    str2 = (String) this.L$3;
                    shortTvViewModel3 = (ShortTvViewModel) this.L$2;
                    list = (List) this.L$1;
                    intRef2 = (Ref.IntRef) this.L$0;
                    ResultKt.m97107b(obj);
                }
                playMultiDto = (ShorttvModel.PlayMultiDto) baseDto.getData();
                if (playMultiDto != null && (items2 = playMultiDto.getItems()) != null) {
                    for (Object obj2 : items2) {
                        int i15 = i12 + 1;
                        if (i12 < 0) {
                            CollectionsKt.m97515u();
                        }
                        playStreamItem = (ShorttvModel.PlayStreamItem) obj2;
                        items3 = uGCVideoList.getItems();
                        if (items3 != null) {
                            it2 = items3.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (!Intrinsics.m97797c(((ShorttvModel.UGCVideo) next).getUgcVideoId(), playStreamItem.getUgcVideoId()));
                            uGCVideo = (ShorttvModel.UGCVideo) next;
                            if (uGCVideo != null) {
                                uGCVideo.overrideCoverByFirstImage(playStreamItem.getFirstImage());
                                if (uGCVideo.getEp() == -1) {
                                    String strM81427q = shortTvViewModel3.m81427q();
                                    int size = shortTvViewModel3.m81426p().size();
                                    int i16 = intRef2.element;
                                    intRef2.element = i16 + 1;
                                    uGCVideo.setBelongToCollection(new ShorttvModel.UGCVideoCollection(str2, Boxing.m97634d(size), Boxing.m97634d(i16), strM81427q));
                                }
                                listM81433v = shortTvViewModel3.m81433v();
                                if (listM81433v != null) {
                                    it3 = listM81433v.iterator();
                                    do {
                                        if (it3.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it3.next();
                                    } while (!Intrinsics.m97797c(((ShorttvModel.UGCVideo) next2).getUgcVideoId(), uGCVideo.getUgcVideoId()));
                                    uGCVideo2 = (ShorttvModel.UGCVideo) next2;
                                    if (uGCVideo2 != null) {
                                        uGCVideo.setPlayUrl(uGCVideo2.getPlayUrl());
                                    } else {
                                        uGCVideo.setStreams(playStreamItem.getResources());
                                    }
                                } else {
                                    uGCVideo.setStreams(playStreamItem.getResources());
                                }
                                list.add(uGCVideo);
                            }
                        }
                        i12 = i15;
                    }
                    unit = Unit.f75682a;
                }
                objM112707constructorimpl = Result.m112707constructorimpl(unit);
                shortTvViewModel = this.this$0;
                if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
                    if (list.isEmpty()) {
                        shortTvViewModel.f62520v.mo14855n(TuplesKt.m97108a(AbstractC27849b.a.f85558a, shortTvViewModel.m81433v()));
                        return Unit.f75682a;
                    }
                    ShortTvExtKt.m81318u(list, shortTvViewModel.m81433v());
                    ShortTvExtKt.m81305h(shortTvViewModel.m81437z(), list);
                    ShortTvExtKt.m81302e(shortTvViewModel.m81426p(), list);
                    shortTvViewModel.f62520v.mo14855n(TuplesKt.m97108a(AbstractC27849b.b.f85559a, list));
                }
                Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                Result.m112706boximpl(objM112707constructorimpl);
                return Unit.f75682a;
                ShorttvModel.UGCVideoList uGCVideoList3 = (ShorttvModel.UGCVideoList) ((BaseDto) objM109871e).getData();
                if (uGCVideoList3 != null) {
                    InterfaceC28436a interfaceC28436a2 = shortTvViewModel2.f62499a;
                    List<ShorttvModel.UGCVideo> items4 = uGCVideoList3.getItems();
                    if (items4 != null) {
                        try {
                            List<ShorttvModel.UGCVideo> list5 = items4;
                            ArrayList arrayList5 = new ArrayList(CollectionsKt.m97516v(list5, 10));
                            Iterator<T> it5 = list5.iterator();
                            while (it5.hasNext()) {
                                arrayList5.add(((ShorttvModel.UGCVideo) it5.next()).getUgcVideoId());
                            }
                            strArr = (String[]) arrayList5.toArray(new String[0]);
                        } catch (Throwable th4) {
                            th = th4;
                            list = list3;
                            Result.Companion companion4 = Result.INSTANCE;
                            objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th));
                        }
                    } else {
                        strArr = null;
                    }
                    this.L$0 = intRef;
                    this.L$1 = list3;
                    this.L$2 = shortTvViewModel2;
                    this.L$3 = str;
                    this.L$4 = interfaceC25149n0;
                    this.L$5 = uGCVideoList3;
                    this.label = 2;
                    list2 = list3;
                    objM109870d = InterfaceC28436a.a.m109870d(interfaceC28436a2, strArr, null, this, 2, null);
                    if (objM109870d == objF) {
                        return objF;
                    }
                    str2 = str;
                    shortTvViewModel3 = shortTvViewModel2;
                    intRef2 = intRef;
                    uGCVideoList = uGCVideoList3;
                    list = list2;
                    baseDto = (BaseDto) objM109870d;
                    items = uGCVideoList.getItems();
                    if (items != null) {
                        arrayList2 = new ArrayList();
                        it = items.iterator();
                        while (it.hasNext()) {
                            ugcVideoId = ((ShorttvModel.UGCVideo) it.next()).getUgcVideoId();
                            if (ugcVideoId != null) {
                                arrayList2.add(ugcVideoId);
                            }
                        }
                        arrayList = CollectionsKt.m97343U0(arrayList2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                    } else {
                        arrayList = new ArrayList();
                    }
                    if (!arrayList.isEmpty()) {
                        this.L$0 = intRef2;
                        this.L$1 = list;
                        this.L$2 = shortTvViewModel3;
                        this.L$3 = str2;
                        this.L$4 = interfaceC25149n0;
                        this.L$5 = uGCVideoList;
                        this.L$6 = baseDto;
                        this.label = 3;
                        if (interfaceC28661fM81403O.mo73794a(str2, arrayList, this) == objF) {
                            return objF;
                        }
                    }
                    playMultiDto = (ShorttvModel.PlayMultiDto) baseDto.getData();
                    if (playMultiDto != null) {
                        while (r0.hasNext()) {
                            int i17 = i12 + 1;
                            if (i12 < 0) {
                                CollectionsKt.m97515u();
                            }
                            playStreamItem = (ShorttvModel.PlayStreamItem) obj2;
                            items3 = uGCVideoList.getItems();
                            if (items3 != null) {
                                it2 = items3.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                } while (!Intrinsics.m97797c(((ShorttvModel.UGCVideo) next).getUgcVideoId(), playStreamItem.getUgcVideoId()));
                                uGCVideo = (ShorttvModel.UGCVideo) next;
                                if (uGCVideo != null) {
                                    uGCVideo.overrideCoverByFirstImage(playStreamItem.getFirstImage());
                                    if (uGCVideo.getEp() == -1) {
                                        String strM81427q2 = shortTvViewModel3.m81427q();
                                        int size2 = shortTvViewModel3.m81426p().size();
                                        int i18 = intRef2.element;
                                        intRef2.element = i18 + 1;
                                        uGCVideo.setBelongToCollection(new ShorttvModel.UGCVideoCollection(str2, Boxing.m97634d(size2), Boxing.m97634d(i18), strM81427q2));
                                    }
                                    listM81433v = shortTvViewModel3.m81433v();
                                    if (listM81433v != null) {
                                        it3 = listM81433v.iterator();
                                        do {
                                            if (it3.hasNext()) {
                                                next2 = null;
                                                break;
                                            }
                                            next2 = it3.next();
                                        } while (!Intrinsics.m97797c(((ShorttvModel.UGCVideo) next2).getUgcVideoId(), uGCVideo.getUgcVideoId()));
                                        uGCVideo2 = (ShorttvModel.UGCVideo) next2;
                                        if (uGCVideo2 != null) {
                                            uGCVideo.setPlayUrl(uGCVideo2.getPlayUrl());
                                        } else {
                                            uGCVideo.setStreams(playStreamItem.getResources());
                                        }
                                    } else {
                                        uGCVideo.setStreams(playStreamItem.getResources());
                                    }
                                    list.add(uGCVideo);
                                }
                            }
                            i12 = i17;
                        }
                        unit = Unit.f75682a;
                    }
                } else {
                    list = list3;
                }
                objM112707constructorimpl = Result.m112707constructorimpl(unit);
            } catch (Throwable th5) {
                th = th5;
                list2 = list3;
                list = list2;
                Result.Companion companion5 = Result.INSTANCE;
                objM112707constructorimpl = Result.m112707constructorimpl(ResultKt.m97106a(th));
                shortTvViewModel = this.this$0;
                if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
                    if (list.isEmpty()) {
                        shortTvViewModel.f62520v.mo14855n(TuplesKt.m97108a(AbstractC27849b.a.f85558a, shortTvViewModel.m81433v()));
                        return Unit.f75682a;
                    }
                    ShortTvExtKt.m81318u(list, shortTvViewModel.m81433v());
                    ShortTvExtKt.m81305h(shortTvViewModel.m81437z(), list);
                    ShortTvExtKt.m81302e(shortTvViewModel.m81426p(), list);
                    shortTvViewModel.f62520v.mo14855n(TuplesKt.m97108a(AbstractC27849b.b.f85559a, list));
                }
                Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
                Result.m112706boximpl(objM112707constructorimpl);
                return Unit.f75682a;
            }
        } catch (Throwable th6) {
            th = th6;
        }
        shortTvViewModel = this.this$0;
        if (Result.m112714isSuccessimpl(objM112707constructorimpl)) {
            if (list.isEmpty()) {
                shortTvViewModel.f62520v.mo14855n(TuplesKt.m97108a(AbstractC27849b.a.f85558a, shortTvViewModel.m81433v()));
                return Unit.f75682a;
            }
            ShortTvExtKt.m81318u(list, shortTvViewModel.m81433v());
            ShortTvExtKt.m81305h(shortTvViewModel.m81437z(), list);
            ShortTvExtKt.m81302e(shortTvViewModel.m81426p(), list);
            shortTvViewModel.f62520v.mo14855n(TuplesKt.m97108a(AbstractC27849b.b.f85559a, list));
        }
        Result.m112710exceptionOrNullimpl(objM112707constructorimpl);
        Result.m112706boximpl(objM112707constructorimpl);
        return Unit.f75682a;
    }
}
