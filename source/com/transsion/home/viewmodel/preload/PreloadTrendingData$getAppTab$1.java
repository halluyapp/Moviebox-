package com.transsion.home.viewmodel.preload;

import com.p282tn.lib.net.bean.BaseDto;
import com.transsion.baselib.report.launch.C14496b;
import com.transsion.home.bean.AppTab;
import com.transsion.home.bean.BottomTabItem;
import com.transsion.home.bean.HomeTabItem;
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
import p978zg.C29182a;
import pg.C26866a;
import sl.InterfaceC27631e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m97099d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m97100d2 = {"Lkotlinx/coroutines/n0;", "", "<anonymous>", "(Lkotlinx/coroutines/n0;)V"}, m97101k = 3, m97102mv = {2, 1, 0})
@DebugMetadata(m97636c = "com.transsion.home.viewmodel.preload.PreloadTrendingData$getAppTab$1", m97637f = "PreloadTrendingData.kt", m97638l = {242}, m97639m = "invokeSuspend")
final class PreloadTrendingData$getAppTab$1 extends SuspendLambda implements Function2<InterfaceC25149n0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ PreloadTrendingData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreloadTrendingData$getAppTab$1(PreloadTrendingData preloadTrendingData, Continuation<? super PreloadTrendingData$getAppTab$1> continuation) {
        super(2, continuation);
        this.this$0 = preloadTrendingData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PreloadTrendingData$getAppTab$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC25149n0 interfaceC25149n0, Continuation<? super Unit> continuation) {
        return ((PreloadTrendingData$getAppTab$1) create(interfaceC25149n0, continuation)).invokeSuspend(Unit.f75682a);
    }

    /* JADX WARN: Code duplicated, block: B:88:0x01be A[Catch: Exception -> 0x001a, TRY_LEAVE, TryCatch #0 {Exception -> 0x001a, blocks: (B:6:0x0015, B:32:0x00cc, B:34:0x00d8, B:36:0x00de, B:38:0x00e4, B:40:0x00e9, B:41:0x00f0, B:43:0x00f4, B:45:0x00fa, B:47:0x0104, B:49:0x011a, B:51:0x0120, B:54:0x012c, B:56:0x0132, B:58:0x0158, B:61:0x0160, B:63:0x0166, B:66:0x016e, B:68:0x0174, B:71:0x0180, B:73:0x0186, B:75:0x0190, B:78:0x0198, B:80:0x019e, B:83:0x01aa, B:85:0x01b0, B:86:0x01b8, B:88:0x01be, B:13:0x0028, B:15:0x0030, B:17:0x004c, B:19:0x0056, B:21:0x0083, B:26:0x0097, B:28:0x009d), top: B:96:0x000d }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Boolean boolM97631a;
        AppTab appTab;
        List<BottomTabItem> bottomTabs;
        List<BottomTabItem> bottomTabs2;
        List<HomeTabItem> homeTabs;
        List<HomeTabItem> homeTabs2;
        List<BottomTabItem> bottomTabs3;
        List<HomeTabItem> homeTabs3;
        Object objF = IntrinsicsKt.m97630f();
        int i11 = this.label;
        Integer numM97634d = null;
        try {
            if (i11 == 0) {
                ResultKt.m97107b(obj);
                AppTab appTabM69110B = this.this$0.m69110B();
                if (appTabM69110B != null) {
                    PreloadTrendingData preloadTrendingData = this.this$0;
                    appTabM69110B.resetHomeTabs(preloadTrendingData.m69148y(appTabM69110B.getHomeTabs()));
                    appTabM69110B.setBottomTabs(preloadTrendingData.m69147x(appTabM69110B));
                    C26866a.a aVar = C26866a.f81698a;
                    List<BottomTabItem> bottomTabs4 = appTabM69110B.getBottomTabs();
                    Integer numM97634d2 = bottomTabs4 != null ? Boxing.m97634d(bottomTabs4.size()) : null;
                    aVar.m104912c("PreloadTrending", "get tab cache " + numM97634d2 + " version=" + appTabM69110B.getVersion(), true);
                    preloadTrendingData.f53730k = appTabM69110B;
                    preloadTrendingData.m69150C().mo14855n(appTabM69110B);
                    preloadTrendingData.m69114O(appTabM69110B);
                } else {
                    appTabM69110B = null;
                }
                int i12 = C14496b.f50966a.m65344b().getInt("key_or_content_mode_local", -1);
                if (i12 >= 0) {
                    boolM97631a = Boxing.m97631a(i12 == 1);
                } else {
                    boolM97631a = null;
                }
                C26866a.f81698a.m104912c("PreloadTrending", "homeTab getAppTab ,isUGCMode:" + boolM97631a, true);
                InterfaceC27631e interfaceC27631e = this.this$0.f53723d;
                String strM111992a = C29182a.f89053a.m111992a();
                this.L$0 = appTabM69110B;
                this.label = 1;
                Object objM107490g = interfaceC27631e.m107490g(boolM97631a, strM111992a, this);
                if (objM107490g == objF) {
                    return objF;
                }
                appTab = appTabM69110B;
                obj = objM107490g;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                appTab = (AppTab) this.L$0;
                ResultKt.m97107b(obj);
            }
            PreloadTrendingData preloadTrendingData2 = this.this$0;
            AppTab appTab2 = (AppTab) ((BaseDto) obj).getData();
            List<HomeTabItem> listM69148y = preloadTrendingData2.m69148y(appTab2 != null ? appTab2.getHomeTabs() : null);
            if (appTab2 != null) {
                appTab2.resetHomeTabs(listM69148y);
            }
            if (appTab2 != null) {
                appTab2.setBottomTabs(preloadTrendingData2.m69147x(appTab2));
            }
            C26866a.a aVar2 = C26866a.f81698a;
            aVar2.m104912c("PreloadTrending", "homeTab size=" + ((appTab2 == null || (homeTabs3 = appTab2.getHomeTabs()) == null) ? null : Boxing.m97634d(homeTabs3.size())), true);
            aVar2.m104912c("PreloadTrending", "bottomTab size=" + ((appTab2 == null || (bottomTabs3 = appTab2.getBottomTabs()) == null) ? null : Boxing.m97634d(bottomTabs3.size())) + " version=" + (appTab2 != null ? appTab2.getVersion() : null), true);
            preloadTrendingData2.m69151D().mo14855n(appTab2);
            preloadTrendingData2.m69114O(appTab2);
            if (Intrinsics.m97797c(appTab != null ? appTab.getVersion() : null, appTab2 != null ? appTab2.getVersion() : null)) {
                if (Intrinsics.m97797c((appTab == null || (homeTabs2 = appTab.getHomeTabs()) == null) ? null : Boxing.m97634d(homeTabs2.size()), (appTab2 == null || (homeTabs = appTab2.getHomeTabs()) == null) ? null : Boxing.m97634d(homeTabs.size()))) {
                    Integer numM97634d3 = (appTab == null || (bottomTabs2 = appTab.getBottomTabs()) == null) ? null : Boxing.m97634d(bottomTabs2.size());
                    if (appTab2 != null && (bottomTabs = appTab2.getBottomTabs()) != null) {
                        numM97634d = Boxing.m97634d(bottomTabs.size());
                    }
                    if (!Intrinsics.m97797c(numM97634d3, numM97634d)) {
                        preloadTrendingData2.m69124a0(appTab2);
                    }
                } else {
                    preloadTrendingData2.m69124a0(appTab2);
                }
            } else {
                preloadTrendingData2.m69124a0(appTab2);
            }
        } catch (Exception e11) {
            if (this.this$0.m69151D().m14847f() == null) {
                this.this$0.f53722c = false;
            }
            C26866a.f81698a.m104915i("PreloadTrending", "getHomeTab error " + e11.getMessage(), true);
        }
        return Unit.f75682a;
    }
}
