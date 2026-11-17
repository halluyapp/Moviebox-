package com.transsion.rewardscenter.task.p308ad;

import android.content.Context;
import com.cloud.hisavana.sdk.common.bean.TaNativeInfo;
import com.cloud.hisavana.sdk.data.bean.response.AdsDTO;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.hisavana.common.bean.TAdNativeInfo;
import com.transsion.p285ad.bidding.base.BiddingIntermediateMaterialBean;
import com.transsion.p285ad.bidding.nativead.BiddingSspNativeManager;
import com.transsion.p285ad.monopoly.model.AdMaterialList;
import com.transsion.p285ad.monopoly.model.AdPlans;
import com.transsion.p285ad.p288ps.model.RecommendInfo;
import com.transsion.p285ad.scene.C14050d;
import com.transsion.rewardscenter.utils.AbstractC18021p;
import com.transsion.rewardscenter.utils.C18020o;
import com.transsion.rewardscenterapi.MemberTaskItem;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractC25136k;
import kotlinx.coroutines.InterfaceC25149n0;
import pg.C26866a;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseStageTaskAdHelper {

    /* JADX INFO: renamed from: e */
    public static final C17881b f58721e = new C17881b(null);

    /* JADX INFO: renamed from: f */
    public static final int f58722f = 8;

    /* JADX INFO: renamed from: a */
    private final Context f58723a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC25149n0 f58724b;

    /* JADX INFO: renamed from: c */
    private long f58725c;

    /* JADX INFO: renamed from: d */
    private InterfaceC17880a f58726d;

    /* JADX INFO: renamed from: com.transsion.rewardscenter.task.ad.BaseStageTaskAdHelper$a */
    public interface InterfaceC17880a {
        /* JADX INFO: renamed from: a */
        void mo76223a(Integer num);

        /* JADX INFO: renamed from: b */
        void mo76224b();

        void start();
    }

    /* JADX INFO: renamed from: com.transsion.rewardscenter.task.ad.BaseStageTaskAdHelper$b */
    public static final class C17881b {
        private C17881b() {
        }

        public /* synthetic */ C17881b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BaseStageTaskAdHelper(Context context, InterfaceC25149n0 interfaceC25149n0) {
        Intrinsics.m97802h(context, "context");
        this.f58723a = context;
        this.f58724b = interfaceC25149n0;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m76196A(BaseStageTaskAdHelper baseStageTaskAdHelper, AbstractC17914v abstractC17914v, Function0 function0, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startClaim");
        }
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        baseStageTaskAdHelper.m76222z(abstractC17914v, function0);
    }

    /* JADX INFO: renamed from: c */
    public void mo76199c(AbstractC17914v.c data) {
        Intrinsics.m97802h(data, "data");
    }

    /* JADX INFO: renamed from: d */
    public void mo76200d() {
    }

    /* JADX INFO: renamed from: e */
    public final long m76201e(String str) {
        JsonElement jsonElement;
        JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b(str);
        if (jsonObjectM63626b == null || (jsonElement = jsonObjectM63626b.get("expDuration")) == null) {
            return 30000L;
        }
        return jsonElement.getAsLong();
    }

    /* JADX INFO: renamed from: f */
    public final void m76202f(Function0 function0) {
        Unit unit;
        if (C17913u.f58813a.m76342j() != null) {
            if (function0 != null) {
                function0.invoke();
                unit = Unit.f75682a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        InterfaceC25149n0 interfaceC25149n0 = this.f58724b;
        if (interfaceC25149n0 != null) {
            AbstractC25136k.m99058d(interfaceC25149n0, null, null, new BaseStageTaskAdHelper$fetchMemberAdTaskInfo$2$1(function0, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m76203g(BiddingIntermediateMaterialBean adBean) {
        List<AdMaterialList> adMaterialList;
        AdMaterialList adMaterialList2;
        RecommendInfo psRecommendInfo;
        String packageName;
        AdsDTO adItem;
        Intrinsics.m97802h(adBean, "adBean");
        if (adBean.getNativeInfo() != null) {
            TAdNativeInfo nativeInfo = adBean.getNativeInfo();
            if (nativeInfo == null || (packageName = nativeInfo.getPackageName()) == null) {
                return "";
            }
        } else if (adBean.getSspNativeInfo() != null) {
            TaNativeInfo sspNativeInfo = adBean.getSspNativeInfo();
            if (sspNativeInfo == null || (adItem = sspNativeInfo.getAdItem()) == null) {
                return "";
            }
            String psPackageName = adItem.getPsPackageName();
            packageName = (psPackageName == null || psPackageName.length() == 0) ? adItem.getPackageName() : adItem.getPsPackageName();
            if (packageName == null) {
                return "";
            }
        } else {
            AdPlans plans = adBean.getPlans();
            if (plans == null || (adMaterialList = plans.getAdMaterialList()) == null || (adMaterialList2 = adMaterialList.get(0)) == null || (psRecommendInfo = adMaterialList2.getPsRecommendInfo()) == null || (packageName = psRecommendInfo.getPackageName()) == null) {
                return "";
            }
        }
        return packageName;
    }

    /* JADX INFO: renamed from: h */
    public final long m76204h() {
        return this.f58725c;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m76205i(BiddingIntermediateMaterialBean adBean) {
        RecommendInfo psRecommendInfo;
        Integer adType;
        List<AdMaterialList> adMaterialList;
        AdsDTO adItem;
        Integer pullNewestLive;
        AdsDTO adItem2;
        Integer pullNewestLive2;
        Intrinsics.m97802h(adBean, "adBean");
        if (adBean.getSspNativeInfo() != null) {
            TaNativeInfo sspNativeInfo = adBean.getSspNativeInfo();
            if (sspNativeInfo == null || (adItem2 = sspNativeInfo.getAdItem()) == null || (pullNewestLive2 = adItem2.getPullNewestLive()) == null || pullNewestLive2.intValue() != 1) {
                TaNativeInfo sspNativeInfo2 = adBean.getSspNativeInfo();
                if (sspNativeInfo2 != null && (adItem = sspNativeInfo2.getAdItem()) != null && (pullNewestLive = adItem.getPullNewestLive()) != null && pullNewestLive.intValue() == 2) {
                    return true;
                }
            } else if (!C18020o.f58998a.m76641a(this.f58723a, m76203g(adBean))) {
                return true;
            }
        } else {
            AdPlans plans = adBean.getPlans();
            AdMaterialList adMaterialList2 = (plans == null || (adMaterialList = plans.getAdMaterialList()) == null) ? null : (AdMaterialList) CollectionsKt.m97361k0(adMaterialList);
            if (adMaterialList2 != null && (psRecommendInfo = adMaterialList2.getPsRecommendInfo()) != null && (adType = psRecommendInfo.getAdType()) != null && adType.intValue() == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m76206j(AbstractC17914v.a aVar) {
        return (aVar != null ? aVar.m76358e() : null) == AdTaskState.DOWNLOADING && aVar.m76360g() > 0 && System.currentTimeMillis() - aVar.m76360g() > 180000;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m76207k(AbstractC17914v.c cVar) {
        return (cVar != null ? cVar.m76375e() : null) == AdTaskState.DOWNLOADING && cVar.m76377g() > 0 && System.currentTimeMillis() - cVar.m76377g() > 180000;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m76208l(AbstractC17914v.c cVar) {
        if (cVar == null || cVar.m76375e() != AdTaskState.PLAYING) {
            return false;
        }
        cVar.m76387q(System.currentTimeMillis() - this.f58725c);
        C26866a.a.m104898f(C26866a.f81698a, "StageTaskAd", "----> onResume playedTime: " + cVar.m76380j(), false, 4, null);
        if (cVar.m76380j() >= m76201e(cVar.m76373c().getSceneId())) {
            cVar.m76383m(AdTaskState.PLAYED);
            C17913u.f58813a.m76353v(cVar.m76379i(), cVar.m76375e());
            return true;
        }
        AbstractC18021p.m76643a(false, "Play for 30 seconds to get the reward.");
        cVar.m76383m(AdTaskState.CLAIMED_STAGE1);
        C17913u.f58813a.m76353v(cVar.m76379i(), cVar.m76375e());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
    /* JADX INFO: renamed from: m */
    public final boolean m76209m(AbstractC17914v.a aVar) {
        boolean z11;
        boolean z12;
        if (aVar == null) {
            return false;
        }
        if (aVar.m76358e() != AdTaskState.DOWNLOADING) {
            z11 = false;
            z12 = false;
        } else if (C18020o.f58998a.m76641a(this.f58723a, aVar.m76362i())) {
            aVar.m76366m(AdTaskState.INSTALLED);
            C17913u.f58813a.m76353v(aVar.m76362i(), aVar.m76358e());
            z12 = false;
            z11 = true;
        } else if (m76206j(aVar)) {
            aVar.m76366m(AdTaskState.NORMAL);
            aVar.m76368o(0L);
            C17913u.f58813a.m76353v(aVar.m76362i(), aVar.m76358e());
            z11 = false;
            z12 = true;
        } else {
            z11 = false;
            z12 = false;
        }
        return z11 || z12;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    /* JADX INFO: renamed from: n */
    public final boolean m76210n(AbstractC17914v.c cVar) {
        boolean z11;
        boolean z12;
        if (cVar == null) {
            return false;
        }
        AdTaskState adTaskStateM76375e = cVar.m76375e();
        AdTaskState adTaskState = AdTaskState.NORMAL;
        if (adTaskStateM76375e != adTaskState && cVar.m76375e() != AdTaskState.DOWNLOADING) {
            z11 = false;
            z12 = false;
        } else if (C18020o.f58998a.m76641a(this.f58723a, cVar.m76379i())) {
            cVar.m76383m(AdTaskState.INSTALLED);
            C17913u.f58813a.m76353v(cVar.m76379i(), cVar.m76375e());
            z12 = false;
            z11 = true;
        } else if (m76207k(cVar)) {
            cVar.m76383m(adTaskState);
            cVar.m76385o(0L);
            C17913u.f58813a.m76353v(cVar.m76379i(), cVar.m76375e());
            z11 = false;
            z12 = true;
        } else {
            z11 = false;
            z12 = false;
        }
        return z11 || z12;
    }

    /* JADX INFO: renamed from: o */
    public final void m76211o() {
        this.f58725c = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: p */
    public final void m76212p() {
    }

    /* JADX INFO: renamed from: q */
    public final int m76213q(String str) {
        JsonElement jsonElement;
        JsonObject jsonObjectM63626b = C14050d.f49719a.m63626b(str);
        if (jsonObjectM63626b == null || (jsonElement = jsonObjectM63626b.get("cooldownDays")) == null) {
            return 3;
        }
        return jsonElement.getAsInt();
    }

    /* JADX INFO: renamed from: r */
    public final void m76214r() {
        if (m76218v() > 0) {
            BiddingSspNativeManager.Companion.m63205b(BiddingSspNativeManager.f49546x, "MemberTaskStageNativeScene", null, 2, null);
        }
        if (m76217u() > 0 || m76216t() > 0) {
            BiddingSspNativeManager.Companion.m63205b(BiddingSspNativeManager.f49546x, "MemberTaskRegularNativeScene", null, 2, null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final int m76215s(MemberTaskItem memberTaskItem) {
        Integer totalProgress;
        if (memberTaskItem == null) {
            return 0;
        }
        Integer status = memberTaskItem.getStatus();
        if ((status != null && status.intValue() == 3) || (totalProgress = memberTaskItem.getTotalProgress()) == null) {
            return 0;
        }
        int iIntValue = totalProgress.intValue();
        Integer progress = memberTaskItem.getProgress();
        return iIntValue - (progress != null ? progress.intValue() : 0);
    }

    /* JADX INFO: renamed from: t */
    public final int m76216t() {
        return m76215s(C17913u.f58813a.m76339g());
    }

    /* JADX INFO: renamed from: u */
    public final int m76217u() {
        return m76215s(C17913u.f58813a.m76340h());
    }

    /* JADX INFO: renamed from: v */
    public final int m76218v() {
        return m76215s(C17913u.f58813a.m76342j());
    }

    /* JADX INFO: renamed from: w */
    public final int m76219w() {
        return m76215s(C17913u.f58813a.m76343k());
    }

    /* JADX INFO: renamed from: x */
    public final void m76220x(InterfaceC17880a interfaceC17880a) {
        this.f58726d = interfaceC17880a;
    }

    /* JADX INFO: renamed from: y */
    public final void m76221y(String packageName, Integer num) {
        Intrinsics.m97802h(packageName, "packageName");
        C17913u.f58813a.m76352u(packageName, num);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    public final void m76222z(AbstractC17914v abstractC17914v, Function0 function0) {
        MemberTaskItem memberTaskItem;
        MemberTaskItem memberTaskItemM76341i;
        InterfaceC17880a interfaceC17880a;
        InterfaceC25149n0 interfaceC25149n0;
        InterfaceC17880a interfaceC17880a2 = this.f58726d;
        if (interfaceC17880a2 != null) {
            interfaceC17880a2.start();
        }
        if (abstractC17914v instanceof AbstractC17914v.c) {
            memberTaskItemM76341i = ((AbstractC17914v.c) abstractC17914v).m76375e() == AdTaskState.INSTALLED ? C17913u.f58813a.m76342j() : C17913u.f58813a.m76343k();
        } else {
            if (!(abstractC17914v instanceof AbstractC17914v.a)) {
                if (abstractC17914v instanceof AbstractC17914v.b) {
                    memberTaskItemM76341i = C17913u.f58813a.m76341i();
                } else {
                    memberTaskItem = null;
                }
                if (memberTaskItem != null) {
                    interfaceC25149n0 = this.f58724b;
                    if ((interfaceC25149n0 != null ? AbstractC25136k.m99058d(interfaceC25149n0, null, null, new BaseStageTaskAdHelper$startClaim$1$1(memberTaskItem, this, abstractC17914v, function0, null), 3, null) : null) != null) {
                        return;
                    }
                }
                interfaceC17880a = this.f58726d;
                if (interfaceC17880a != null) {
                    interfaceC17880a.mo76224b();
                }
                AbstractC18021p.m76643a(false, "Failed to claim points.");
                Unit unit = Unit.f75682a;
            }
            memberTaskItemM76341i = ((AbstractC17914v.a) abstractC17914v).m76364k() ? C17913u.f58813a.m76340h() : C17913u.f58813a.m76339g();
        }
        memberTaskItem = memberTaskItemM76341i;
        if (memberTaskItem != null) {
            interfaceC25149n0 = this.f58724b;
            if ((interfaceC25149n0 != null ? AbstractC25136k.m99058d(interfaceC25149n0, null, null, new BaseStageTaskAdHelper$startClaim$1$1(memberTaskItem, this, abstractC17914v, function0, null), 3, null) : null) != null) {
                return;
            }
        }
        interfaceC17880a = this.f58726d;
        if (interfaceC17880a != null) {
            interfaceC17880a.mo76224b();
        }
        AbstractC18021p.m76643a(false, "Failed to claim points.");
        Unit unit2 = Unit.f75682a;
    }
}
