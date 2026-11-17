package com.transsion.rewardscenter.task.p308ad;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.hisavana.common.bean.TAdErrorCode;
import com.p282tn.lib.widget.R$string;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.bidding.nativead.BiddingSspNativeManager;
import com.transsion.p285ad.bidding.video.BiddingVideoManager;
import com.transsion.p285ad.scene.C14047a;
import com.transsion.p285ad.view.native_ad.NativeWrapperAdView;
import com.transsion.rewardscenter.utils.AbstractC18021p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.C25220y0;
import kotlinx.coroutines.InterfaceC25149n0;
import p461hi.AbstractC23854a;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public final class MemberTaskAdHelper extends BaseStageTaskAdHelper {

    /* JADX INFO: renamed from: r */
    public static final C17882a f58727r = new C17882a(null);

    /* JADX INFO: renamed from: s */
    public static final int f58728s = 8;

    /* JADX INFO: renamed from: t */
    private static final Lazy f58729t = LazyKt.m97097b(new Function0() { // from class: com.transsion.rewardscenter.task.ad.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(MemberTaskAdHelper.m76251b0());
        }
    });

    /* JADX INFO: renamed from: u */
    private static final Lazy f58730u = LazyKt.m97097b(new Function0() { // from class: com.transsion.rewardscenter.task.ad.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(MemberTaskAdHelper.m76250a0());
        }
    });

    /* JADX INFO: renamed from: g */
    private final Context f58731g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC25149n0 f58732h;

    /* JADX INFO: renamed from: i */
    private BiddingSspNativeManager f58733i;

    /* JADX INFO: renamed from: j */
    private Function1 f58734j;

    /* JADX INFO: renamed from: k */
    private BiddingSspNativeManager f58735k;

    /* JADX INFO: renamed from: l */
    private Function1 f58736l;

    /* JADX INFO: renamed from: m */
    private BiddingVideoManager f58737m;

    /* JADX INFO: renamed from: n */
    private Function1 f58738n;

    /* JADX INFO: renamed from: o */
    private final C17884c f58739o;

    /* JADX INFO: renamed from: p */
    private final C17883b f58740p;

    /* JADX INFO: renamed from: q */
    private final MemberTaskAdHelper$rewardAdListener$1 f58741q;

    /* JADX INFO: renamed from: com.transsion.rewardscenter.task.ad.MemberTaskAdHelper$a */
    public static final class C17882a {
        private C17882a() {
        }

        public /* synthetic */ C17882a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m76258a() {
            return ((Number) MemberTaskAdHelper.f58730u.getValue()).intValue();
        }

        /* JADX INFO: renamed from: b */
        public final int m76259b() {
            return ((Number) MemberTaskAdHelper.f58729t.getValue()).intValue();
        }
    }

    /* JADX INFO: renamed from: com.transsion.rewardscenter.task.ad.MemberTaskAdHelper$b */
    public static final class C17883b extends AbstractC23854a {
        C17883b() {
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: i */
        public void mo62846i(TAdErrorCode tAdErrorCode) {
            super.mo62846i(tAdErrorCode);
            Function1 function1 = MemberTaskAdHelper.this.f58736l;
            if (function1 != null) {
                function1.invoke(CollectionsKt.m97506l());
            }
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: k */
        public void mo62847k(List list) {
            Function1 function1;
            super.mo62847k(list);
            if (list != null) {
                MemberTaskAdHelper memberTaskAdHelper = MemberTaskAdHelper.this;
                List listM76249W = memberTaskAdHelper.m76249W("MemberTaskRegularNativeScene", list, Boolean.FALSE);
                ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(listM76249W, 10));
                Iterator it = listM76249W.iterator();
                while (it.hasNext()) {
                    arrayList.add(m76260x((BiddingIntermediateMaterialBean) it.next()));
                }
                boolean z11 = memberTaskAdHelper.m76217u() <= 0;
                boolean z12 = memberTaskAdHelper.m76216t() <= 0;
                if (z11) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (!((AbstractC17914v.a) obj).m76364k()) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList = arrayList2;
                }
                if (z12) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (((AbstractC17914v.a) obj2).m76364k()) {
                            arrayList3.add(obj2);
                        }
                    }
                    arrayList = arrayList3;
                }
                if (arrayList.isEmpty() || (function1 = memberTaskAdHelper.f58736l) == null) {
                    return;
                }
                function1.invoke(arrayList);
            }
        }

        /* JADX INFO: renamed from: x */
        public final AbstractC17914v.a m76260x(BiddingIntermediateMaterialBean bean) {
            Intrinsics.m97802h(bean, "bean");
            return new AbstractC17914v.a(bean, null, null, null, null, MemberTaskAdHelper.this.m76203g(bean), MemberTaskAdHelper.this.m76205i(bean), false, 0L, TTAdConstant.VIDEO_URL_CODE, null);
        }
    }

    /* JADX INFO: renamed from: com.transsion.rewardscenter.task.ad.MemberTaskAdHelper$c */
    public static final class C17884c extends AbstractC23854a {
        C17884c() {
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: i */
        public void mo62846i(TAdErrorCode tAdErrorCode) {
            super.mo62846i(tAdErrorCode);
            Function1 function1 = MemberTaskAdHelper.this.f58734j;
            if (function1 != null) {
                function1.invoke(CollectionsKt.m97506l());
            }
        }

        @Override // p461hi.AbstractC23854a
        /* JADX INFO: renamed from: k */
        public void mo62847k(List list) {
            super.mo62847k(list);
            if (list != null) {
                MemberTaskAdHelper memberTaskAdHelper = MemberTaskAdHelper.this;
                List listM76249W = memberTaskAdHelper.m76249W("MemberTaskStageNativeScene", list, Boolean.TRUE);
                Function1 function1 = memberTaskAdHelper.f58734j;
                if (function1 != null) {
                    List list2 = listM76249W;
                    ArrayList arrayList = new ArrayList(CollectionsKt.m97516v(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(m76261x((BiddingIntermediateMaterialBean) it.next()));
                    }
                    function1.invoke(arrayList);
                }
            }
        }

        /* JADX INFO: renamed from: x */
        public final AbstractC17914v.c m76261x(BiddingIntermediateMaterialBean bean) {
            Intrinsics.m97802h(bean, "bean");
            return new AbstractC17914v.c(bean, null, null, null, null, MemberTaskAdHelper.this.m76203g(bean), false, 0L, 0L, 478, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.transsion.rewardscenter.task.ad.MemberTaskAdHelper$rewardAdListener$1] */
    public MemberTaskAdHelper(Context context, InterfaceC25149n0 interfaceC25149n0) {
        super(context, interfaceC25149n0);
        Intrinsics.m97802h(context, "context");
        this.f58731g = context;
        this.f58732h = interfaceC25149n0;
        this.f58739o = new C17884c();
        this.f58740p = new C17883b();
        this.f58741q = new AbstractC23854a() { // from class: com.transsion.rewardscenter.task.ad.MemberTaskAdHelper$rewardAdListener$1
            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: i */
            public void mo62846i(TAdErrorCode tAdErrorCode) {
                super.mo62846i(tAdErrorCode);
                String string = this.f58744d.f58731g.getString(R$string.common_failed);
                Intrinsics.m97801g(string, "getString(...)");
                AbstractC18021p.m76643a(false, string);
                Function1 function1 = this.f58744d.f58738n;
                if (function1 != null) {
                    function1.invoke(Boolean.FALSE);
                }
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: j */
            public void mo62778j(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62778j(biddingIntermediateMaterialBean);
                InterfaceC25149n0 interfaceC25149n1 = this.f58744d.f58732h;
                if (interfaceC25149n1 != null) {
                    AbstractC25136k.m99058d(interfaceC25149n1, null, null, new MemberTaskAdHelper$rewardAdListener$1$onBiddingLoad$1(this.f58744d, biddingIntermediateMaterialBean, null), 3, null);
                }
            }

            @Override // p461hi.AbstractC23854a
            /* JADX INFO: renamed from: o */
            public void mo62854o(BiddingIntermediateMaterialBean biddingIntermediateMaterialBean) {
                super.mo62854o(biddingIntermediateMaterialBean);
                if (biddingIntermediateMaterialBean != null) {
                    MemberTaskAdHelper memberTaskAdHelper = this.f58744d;
                    BaseStageTaskAdHelper.m76196A(memberTaskAdHelper, new AbstractC17914v.b(null, 1, null), null, 2, null);
                    Function1 function1 = memberTaskAdHelper.f58738n;
                    if (function1 != null) {
                        function1.invoke(Boolean.TRUE);
                    }
                }
            }
        };
    }

    /* JADX INFO: renamed from: T */
    private final void m76246T() {
        BiddingSspNativeManager biddingSspNativeManager = this.f58735k;
        if (biddingSspNativeManager != null) {
            biddingSspNativeManager.m62829K0(null);
        }
        BiddingSspNativeManager biddingSspNativeManager2 = this.f58735k;
        if (biddingSspNativeManager2 != null) {
            biddingSspNativeManager2.mo62775U();
        }
        this.f58735k = null;
    }

    /* JADX INFO: renamed from: U */
    private final void m76247U() {
        BiddingVideoManager biddingVideoManager = this.f58737m;
        if (biddingVideoManager != null) {
            biddingVideoManager.m62829K0(null);
        }
        BiddingVideoManager biddingVideoManager2 = this.f58737m;
        if (biddingVideoManager2 != null) {
            biddingVideoManager2.mo62775U();
        }
        this.f58737m = null;
    }

    /* JADX INFO: renamed from: V */
    private final void m76248V() {
        BiddingSspNativeManager biddingSspNativeManager = this.f58733i;
        if (biddingSspNativeManager != null) {
            biddingSspNativeManager.m62829K0(null);
        }
        BiddingSspNativeManager biddingSspNativeManager2 = this.f58733i;
        if (biddingSspNativeManager2 != null) {
            biddingSspNativeManager2.mo62775U();
        }
        this.f58733i = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public final List m76249W(String str, List list, Boolean bool) {
        Iterator it = list.iterator();
        while (true) {
            String str2 = "Regular";
            if (!it.hasNext()) {
                break;
            }
            BiddingIntermediateMaterialBean biddingIntermediateMaterialBean = (BiddingIntermediateMaterialBean) it.next();
            C26866a.a aVar = C26866a.f81698a;
            if (Intrinsics.m97797c(bool, Boolean.TRUE)) {
                str2 = "Stage";
            }
            C26866a.a.m104898f(aVar, "StageTaskAd", "MemberTaskAdHelper ----> " + str2 + " loaded item, packageName: " + m76203g(biddingIntermediateMaterialBean), false, 4, null);
        }
        List listI0 = CollectionsKt.m97331I0(list, new Comparator() { // from class: com.transsion.rewardscenter.task.ad.MemberTaskAdHelper$filterAds$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                Double ecpm = ((BiddingIntermediateMaterialBean) t12).getEcpm();
                Double dValueOf = Double.valueOf(ecpm != null ? ecpm.doubleValue() : 0.0d);
                Double ecpm2 = ((BiddingIntermediateMaterialBean) t11).getEcpm();
                return ComparisonsKt.m97603d(dValueOf, Double.valueOf(ecpm2 != null ? ecpm2.doubleValue() : 0.0d));
            }
        });
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI0) {
            if (hashSet.add(m76203g((BiddingIntermediateMaterialBean) obj))) {
                arrayList.add(obj);
            }
        }
        ArrayList<BiddingIntermediateMaterialBean> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!C17913u.f58813a.m76345m(str, m76203g((BiddingIntermediateMaterialBean) obj2))) {
                arrayList2.add(obj2);
            }
        }
        for (BiddingIntermediateMaterialBean biddingIntermediateMaterialBean2 : arrayList2) {
            C26866a.a aVar2 = C26866a.f81698a;
            String str3 = Intrinsics.m97797c(bool, Boolean.TRUE) ? "Stage" : "Regular";
            C26866a.a.m104898f(aVar2, "StageTaskAd", "MemberTaskAdHelper ----> " + str3 + " filtered item, packageName: " + m76203g(biddingIntermediateMaterialBean2), false, 4, null);
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final int m76250a0() {
        return C14047a.f49716a.m63589g("MemberTaskRegularNativeScene");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final int m76251b0() {
        return C14047a.f49716a.m63589g("MemberTaskStageNativeScene");
    }

    /* JADX INFO: renamed from: Q */
    public final void m76252Q(AbstractC17914v.a data) {
        Intrinsics.m97802h(data, "data");
        if (data.m76359f()) {
            return;
        }
        data.m76367n(true);
        C26866a.a.m104898f(C26866a.f81698a, "StageTaskAd", "MemberTaskAdHelper ----> bindRegularNativeAd", false, 4, null);
        if (this.f58735k == null) {
            m76253R();
        }
        data.m76369p(new NativeWrapperAdView(this.f58731g, null, 2, null));
        data.m76365l(new C17893d0(this.f58731g));
        data.m76370q(new C17915w(this.f58731g));
        NativeWrapperAdView nativeWrapperAdViewM76361h = data.m76361h();
        if (nativeWrapperAdViewM76361h != null) {
            nativeWrapperAdViewM76361h.bindSspNativeView(this.f58735k, data.m76357d(), data.m76363j(), data.m76356c());
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m76253R() {
        BiddingSspNativeManager biddingSspNativeManager = new BiddingSspNativeManager();
        this.f58735k = biddingSspNativeManager;
        biddingSspNativeManager.m62830L0("MemberTaskRegularNativeScene");
        biddingSspNativeManager.m62829K0(this.f58740p);
    }

    /* JADX INFO: renamed from: S */
    public final void m76254S() {
        BiddingSspNativeManager biddingSspNativeManager = new BiddingSspNativeManager();
        this.f58733i = biddingSspNativeManager;
        biddingSspNativeManager.m62830L0("MemberTaskStageNativeScene");
        biddingSspNativeManager.m62829K0(this.f58739o);
    }

    /* JADX INFO: renamed from: X */
    public final void m76255X(Function1 callback) {
        Intrinsics.m97802h(callback, "callback");
        this.f58736l = callback;
        if (m76217u() > 0 || m76216t() > 0) {
            m76246T();
            m76253R();
            InterfaceC25149n0 interfaceC25149n0 = this.f58732h;
            if (interfaceC25149n0 != null) {
                AbstractC25136k.m99058d(interfaceC25149n0, C25220y0.m99268b(), null, new MemberTaskAdHelper$loadRegularAd$1(this, null), 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m76256Y(Function1 callback) {
        Intrinsics.m97802h(callback, "callback");
        this.f58738n = callback;
        m76247U();
        InterfaceC25149n0 interfaceC25149n0 = this.f58732h;
        if (interfaceC25149n0 != null) {
            AbstractC25136k.m99058d(interfaceC25149n0, C25220y0.m99268b(), null, new MemberTaskAdHelper$loadRewardAd$1(this, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m76257Z(Function1 callback) {
        Intrinsics.m97802h(callback, "callback");
        this.f58734j = callback;
        if (m76218v() <= 0) {
            return;
        }
        m76248V();
        InterfaceC25149n0 interfaceC25149n0 = this.f58732h;
        if (interfaceC25149n0 != null) {
            AbstractC25136k.m99058d(interfaceC25149n0, C25220y0.m99268b(), null, new MemberTaskAdHelper$loadStageAd$1(this, null), 2, null);
        }
    }

    @Override // com.transsion.rewardscenter.task.p308ad.BaseStageTaskAdHelper
    /* JADX INFO: renamed from: c */
    public void mo76199c(AbstractC17914v.c data) {
        Intrinsics.m97802h(data, "data");
        if (data.m76376f()) {
            return;
        }
        data.m76384n(true);
        if (this.f58733i == null) {
            m76254S();
        }
        data.m76386p(new NativeWrapperAdView(this.f58731g, null, 2, null));
        data.m76382l(new C17893d0(this.f58731g));
        data.m76388r(new C17915w(this.f58731g));
        NativeWrapperAdView nativeWrapperAdViewM76378h = data.m76378h();
        if (nativeWrapperAdViewM76378h != null) {
            nativeWrapperAdViewM76378h.bindSspNativeView(this.f58733i, data.m76374d(), data.m76381k(), data.m76373c());
        }
    }

    @Override // com.transsion.rewardscenter.task.p308ad.BaseStageTaskAdHelper
    /* JADX INFO: renamed from: d */
    public void mo76200d() {
        super.mo76200d();
        BiddingSspNativeManager biddingSspNativeManager = this.f58733i;
        if (biddingSspNativeManager != null) {
            biddingSspNativeManager.m62829K0(null);
        }
        this.f58733i = null;
        BiddingSspNativeManager biddingSspNativeManager2 = this.f58735k;
        if (biddingSspNativeManager2 != null) {
            biddingSspNativeManager2.m62829K0(null);
        }
        this.f58735k = null;
        m76247U();
        this.f58734j = null;
        this.f58736l = null;
        this.f58738n = null;
    }
}
